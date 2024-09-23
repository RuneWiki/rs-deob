import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("d")
public class ClientStream implements Runnable {

    @OriginalMember(owner = "d", name = "a", descriptor = "I")
    private int field59 = -19523;

    @OriginalMember(owner = "d", name = "e", descriptor = "Z")
    private boolean field63 = false;

    @OriginalMember(owner = "d", name = "j", descriptor = "Z")
    private boolean field68 = false;

    @OriginalMember(owner = "d", name = "k", descriptor = "Z")
    private boolean field69 = false;

    @OriginalMember(owner = "d", name = "f", descriptor = "La;")
    public GameShell field64;

    @OriginalMember(owner = "d", name = "d", descriptor = "Ljava/net/Socket;")
    private Socket field62;

    @OriginalMember(owner = "d", name = "b", descriptor = "Ljava/io/InputStream;")
    private InputStream field60;

    @OriginalMember(owner = "d", name = "c", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field61;

    @OriginalMember(owner = "d", name = "h", descriptor = "I")
    private int field66;

    @OriginalMember(owner = "d", name = "i", descriptor = "I")
    private int field67;

    @OriginalMember(owner = "d", name = "g", descriptor = "[B")
    private byte[] field65;

    @OriginalMember(owner = "d", name = "<init>", descriptor = "(Ljava/net/Socket;La;I)V")
    public ClientStream(Socket arg0, GameShell arg1, int arg2) throws IOException {
        this.field64 = arg1;
        this.field62 = arg0;
        if (arg2 != -3154) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        this.field62.setSoTimeout(30000);
        this.field62.setTcpNoDelay(true);
        this.field60 = this.field62.getInputStream();
        this.field61 = this.field62.getOutputStream();
    }

    @OriginalMember(owner = "d", name = "a", descriptor = "()V")
    public void method29() {
        this.field63 = true;
        try {
            if (this.field60 != null) {
                this.field60.close();
            }
            if (this.field61 != null) {
                this.field61.close();
            }
            if (this.field62 != null) {
                this.field62.close();
            }
        } catch (IOException var3) {
            System.out.println("Error closing stream");
        }
        this.field68 = false;
        synchronized (this) {
            this.notify();
        }
        this.field65 = null;
    }

    @OriginalMember(owner = "d", name = "b", descriptor = "()I")
    public int method30() throws IOException {
        return this.field63 ? 0 : this.field60.read();
    }

    @OriginalMember(owner = "d", name = "c", descriptor = "()I")
    public int method31() throws IOException {
        return this.field63 ? 0 : this.field60.available();
    }

    @OriginalMember(owner = "d", name = "a", descriptor = "([BII)V")
    public void method32(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field63) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field60.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new IOException("EOF");
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @OriginalMember(owner = "d", name = "a", descriptor = "(I[BII)V")
    public void method33(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (this.field59 != arg3 || this.field63) {
            return;
        }
        if (this.field69) {
            this.field69 = false;
            throw new IOException("Error in writer thread");
        }
        if (this.field65 == null) {
            this.field65 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field65[this.field67] = arg1[arg0 + var6];
                this.field67 = (this.field67 + 1) % 5000;
                if ((this.field66 + 4900) % 5000 == this.field67) {
                    throw new IOException("buffer overflow");
                }
            }
            if (!this.field68) {
                this.field68 = true;
                this.field64.method12(this, 2);
            }
            this.notify();
        }
    }

    @OriginalMember(owner = "d", name = "run", descriptor = "()V")
    public void run() {
        while (this.field68) {
            int var2;
            int var3;
            synchronized (this) {
                if (this.field67 == this.field66) {
                    try {
                        this.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!this.field68) {
                    return;
                }
                var2 = this.field66;
                if (this.field67 >= this.field66) {
                    var3 = this.field67 - this.field66;
                } else {
                    var3 = 5000 - this.field66;
                }
            }
            if (var3 > 0) {
                try {
                    this.field61.write(this.field65, var2, var3);
                } catch (IOException var7) {
                    this.field69 = true;
                }
                this.field66 = (this.field66 + var3) % 5000;
                try {
                    if (this.field67 == this.field66) {
                        this.field61.flush();
                    }
                } catch (IOException var6) {
                    this.field69 = true;
                }
            }
        }
    }
}
