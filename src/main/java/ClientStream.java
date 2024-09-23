import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("d")
public class ClientStream implements Runnable {

    @OriginalMember(owner = "d", name = "a", descriptor = "Z")
    private boolean field57 = true;

    @OriginalMember(owner = "d", name = "e", descriptor = "Z")
    private boolean field61 = false;

    @OriginalMember(owner = "d", name = "j", descriptor = "Z")
    private boolean field66 = false;

    @OriginalMember(owner = "d", name = "k", descriptor = "Z")
    private boolean field67 = false;

    @OriginalMember(owner = "d", name = "f", descriptor = "La;")
    public GameShell field62;

    @OriginalMember(owner = "d", name = "d", descriptor = "Ljava/net/Socket;")
    private Socket field60;

    @OriginalMember(owner = "d", name = "b", descriptor = "Ljava/io/InputStream;")
    private InputStream field58;

    @OriginalMember(owner = "d", name = "c", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field59;

    @OriginalMember(owner = "d", name = "h", descriptor = "I")
    private int field64;

    @OriginalMember(owner = "d", name = "i", descriptor = "I")
    private int field65;

    @OriginalMember(owner = "d", name = "g", descriptor = "[B")
    private byte[] field63;

    @OriginalMember(owner = "d", name = "<init>", descriptor = "(La;ZLjava/net/Socket;)V")
    public ClientStream(GameShell arg0, boolean arg1, Socket arg2) throws IOException {
        this.field62 = arg0;
        this.field60 = arg2;
        this.field60.setSoTimeout(30000);
        this.field60.setTcpNoDelay(true);
        this.field58 = this.field60.getInputStream();
        this.field59 = this.field60.getOutputStream();
        if (!arg1) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "d", name = "a", descriptor = "()V")
    public void method29() {
        this.field61 = true;
        try {
            if (this.field58 != null) {
                this.field58.close();
            }
            if (this.field59 != null) {
                this.field59.close();
            }
            if (this.field60 != null) {
                this.field60.close();
            }
        } catch (IOException var3) {
            System.out.println("Error closing stream");
        }
        this.field66 = false;
        synchronized (this) {
            this.notify();
        }
        this.field63 = null;
    }

    @OriginalMember(owner = "d", name = "b", descriptor = "()I")
    public int method30() throws IOException {
        return this.field61 ? 0 : this.field58.read();
    }

    @OriginalMember(owner = "d", name = "c", descriptor = "()I")
    public int method31() throws IOException {
        return this.field61 ? 0 : this.field58.available();
    }

    @OriginalMember(owner = "d", name = "a", descriptor = "([BII)V")
    public void method32(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field61) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field58.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new IOException("EOF");
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @OriginalMember(owner = "d", name = "a", descriptor = "(IZ[BI)V")
    public void method33(int arg0, boolean arg1, byte[] arg2, int arg3) throws IOException {
        if (arg1) {
            this.field57 = !this.field57;
        }
        if (this.field61) {
            return;
        }
        if (this.field67) {
            this.field67 = false;
            throw new IOException("Error in writer thread");
        }
        if (this.field63 == null) {
            this.field63 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg0; var6++) {
                this.field63[this.field65] = arg2[arg3 + var6];
                this.field65 = (this.field65 + 1) % 5000;
                if ((this.field64 + 4900) % 5000 == this.field65) {
                    throw new IOException("buffer overflow");
                }
            }
            if (!this.field66) {
                this.field66 = true;
                this.field62.method12(this, 2);
            }
            this.notify();
        }
    }

    @OriginalMember(owner = "d", name = "run", descriptor = "()V")
    public void run() {
        while (this.field66) {
            int var2;
            int var3;
            synchronized (this) {
                if (this.field65 == this.field64) {
                    try {
                        this.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!this.field66) {
                    return;
                }
                var2 = this.field64;
                if (this.field65 >= this.field64) {
                    var3 = this.field65 - this.field64;
                } else {
                    var3 = 5000 - this.field64;
                }
            }
            if (var3 > 0) {
                try {
                    this.field59.write(this.field63, var2, var3);
                } catch (IOException var7) {
                    this.field67 = true;
                }
                this.field64 = (this.field64 + var3) % 5000;
                try {
                    if (this.field65 == this.field64) {
                        this.field59.flush();
                    }
                } catch (IOException var6) {
                    this.field67 = true;
                }
            }
        }
    }
}
