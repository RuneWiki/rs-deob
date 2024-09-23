import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("d")
public class ClientStream implements Runnable {

    @OriginalMember(owner = "d", name = "a", descriptor = "Z")
    private boolean field58 = true;

    @OriginalMember(owner = "d", name = "e", descriptor = "Z")
    private boolean field62 = false;

    @OriginalMember(owner = "d", name = "j", descriptor = "Z")
    private boolean field67 = false;

    @OriginalMember(owner = "d", name = "k", descriptor = "Z")
    private boolean field68 = false;

    @OriginalMember(owner = "d", name = "f", descriptor = "La;")
    public GameShell field63;

    @OriginalMember(owner = "d", name = "d", descriptor = "Ljava/net/Socket;")
    private Socket field61;

    @OriginalMember(owner = "d", name = "b", descriptor = "Ljava/io/InputStream;")
    private InputStream field59;

    @OriginalMember(owner = "d", name = "c", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field60;

    @OriginalMember(owner = "d", name = "h", descriptor = "I")
    private int field65;

    @OriginalMember(owner = "d", name = "i", descriptor = "I")
    private int field66;

    @OriginalMember(owner = "d", name = "g", descriptor = "[B")
    private byte[] field64;

    @OriginalMember(owner = "d", name = "<init>", descriptor = "(Ljava/net/Socket;La;B)V")
    public ClientStream(Socket arg0, GameShell arg1, byte arg2) throws IOException {
        this.field63 = arg1;
        this.field61 = arg0;
        if (arg2 != 7) {
            throw new NullPointerException();
        }
        boolean var4 = false;
        this.field61.setSoTimeout(30000);
        this.field61.setTcpNoDelay(true);
        this.field59 = this.field61.getInputStream();
        this.field60 = this.field61.getOutputStream();
    }

    @OriginalMember(owner = "d", name = "a", descriptor = "()V")
    public void method29() {
        this.field62 = true;
        try {
            if (this.field59 != null) {
                this.field59.close();
            }
            if (this.field60 != null) {
                this.field60.close();
            }
            if (this.field61 != null) {
                this.field61.close();
            }
        } catch (IOException var3) {
            System.out.println("Error closing stream");
        }
        this.field67 = false;
        synchronized (this) {
            this.notify();
        }
        this.field64 = null;
    }

    @OriginalMember(owner = "d", name = "b", descriptor = "()I")
    public int method30() throws IOException {
        return this.field62 ? 0 : this.field59.read();
    }

    @OriginalMember(owner = "d", name = "c", descriptor = "()I")
    public int method31() throws IOException {
        return this.field62 ? 0 : this.field59.available();
    }

    @OriginalMember(owner = "d", name = "a", descriptor = "([BII)V")
    public void method32(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field62) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field59.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new IOException("EOF");
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @OriginalMember(owner = "d", name = "a", descriptor = "([BZII)V")
    public void method33(byte[] arg0, boolean arg1, int arg2, int arg3) throws IOException {
        if (this.field62) {
            return;
        }
        if (this.field68) {
            this.field68 = false;
            throw new IOException("Error in writer thread");
        }
        if (this.field64 == null) {
            this.field64 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field64[this.field66] = arg0[arg3 + var6];
                this.field66 = (this.field66 + 1) % 5000;
                if ((this.field65 + 4900) % 5000 == this.field66) {
                    throw new IOException("buffer overflow");
                }
            }
            if (!this.field67) {
                this.field67 = true;
                this.field63.method12(this, 2);
            }
            this.notify();
        }
        if (arg1) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
    }

    @OriginalMember(owner = "d", name = "run", descriptor = "()V")
    public void run() {
        while (this.field67) {
            int var2;
            int var3;
            synchronized (this) {
                if (this.field66 == this.field65) {
                    try {
                        this.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!this.field67) {
                    return;
                }
                var2 = this.field65;
                if (this.field66 >= this.field65) {
                    var3 = this.field66 - this.field65;
                } else {
                    var3 = 5000 - this.field65;
                }
            }
            if (var3 > 0) {
                try {
                    this.field60.write(this.field64, var2, var3);
                } catch (IOException var7) {
                    this.field68 = true;
                }
                this.field65 = (this.field65 + var3) % 5000;
                try {
                    if (this.field66 == this.field65) {
                        this.field60.flush();
                    }
                } catch (IOException var6) {
                    this.field68 = true;
                }
            }
        }
    }
}
