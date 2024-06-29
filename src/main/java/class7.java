import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!CSJOZVFM")
public class class7 implements Runnable {

    @OriginalMember(owner = "client!CSJOZVFM", name = "a", descriptor = "I")
    private int field573 = -296;

    @OriginalMember(owner = "client!CSJOZVFM", name = "b", descriptor = "I")
    private int field574 = 1;

    @OriginalMember(owner = "client!CSJOZVFM", name = "f", descriptor = "Z")
    private boolean field578 = false;

    @OriginalMember(owner = "client!CSJOZVFM", name = "k", descriptor = "Z")
    private boolean field583 = false;

    @OriginalMember(owner = "client!CSJOZVFM", name = "l", descriptor = "Z")
    private boolean field584 = false;

    @OriginalMember(owner = "client!CSJOZVFM", name = "g", descriptor = "LMKANHSMC;")
    public class37 field579;

    @OriginalMember(owner = "client!CSJOZVFM", name = "e", descriptor = "Ljava/net/Socket;")
    private Socket field577;

    @OriginalMember(owner = "client!CSJOZVFM", name = "c", descriptor = "Ljava/io/InputStream;")
    private InputStream field575;

    @OriginalMember(owner = "client!CSJOZVFM", name = "d", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field576;

    @OriginalMember(owner = "client!CSJOZVFM", name = "i", descriptor = "I")
    private int field581;

    @OriginalMember(owner = "client!CSJOZVFM", name = "j", descriptor = "I")
    private int field582;

    @OriginalMember(owner = "client!CSJOZVFM", name = "h", descriptor = "[B")
    private byte[] field580;

    @OriginalMember(owner = "client!CSJOZVFM", name = "<init>", descriptor = "(ZLjava/net/Socket;LMKANHSMC;)V")
    public class7(boolean arg0, Socket arg1, class37 arg2) throws IOException {
        this.field579 = arg2;
        this.field577 = arg1;
        this.field577.setSoTimeout(30000);
        this.field577.setTcpNoDelay(true);
        this.field575 = this.field577.getInputStream();
        this.field576 = this.field577.getOutputStream();
        if (!arg0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "client!CSJOZVFM", name = "a", descriptor = "()V")
    public void method194() {
        this.field578 = true;
        try {
            if (this.field575 != null) {
                this.field575.close();
            }
            if (this.field576 != null) {
                this.field576.close();
            }
            if (this.field577 != null) {
                this.field577.close();
            }
        } catch (IOException var3) {
            System.out.println("Error closing stream");
        }
        this.field583 = false;
        synchronized (this) {
            this.notify();
        }
        this.field580 = null;
    }

    @OriginalMember(owner = "client!CSJOZVFM", name = "b", descriptor = "()I")
    public int method195() throws IOException {
        return this.field578 ? 0 : this.field575.read();
    }

    @OriginalMember(owner = "client!CSJOZVFM", name = "c", descriptor = "()I")
    public int method196() throws IOException {
        return this.field578 ? 0 : this.field575.available();
    }

    @OriginalMember(owner = "client!CSJOZVFM", name = "a", descriptor = "([BII)V")
    public void method197(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field578) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field575.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new IOException("EOF");
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @OriginalMember(owner = "client!CSJOZVFM", name = "a", descriptor = "([BIII)V")
    public void method198(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if (arg3 >= 0 || this.field578) {
            return;
        }
        if (this.field584) {
            this.field584 = false;
            throw new IOException("Error in writer thread");
        }
        if (this.field580 == null) {
            this.field580 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg1; var6++) {
                this.field580[this.field582] = arg0[arg2 + var6];
                this.field582 = (this.field582 + 1) % 5000;
                if ((this.field581 + 4900) % 5000 == this.field582) {
                    throw new IOException("buffer overflow");
                }
            }
            if (!this.field583) {
                this.field583 = true;
                this.field579.method90(this, 3);
            }
            this.notify();
        }
    }

    @OriginalMember(owner = "client!CSJOZVFM", name = "run", descriptor = "()V")
    public void run() {
        while (this.field583) {
            int var2;
            int var3;
            synchronized (this) {
                if (this.field582 == this.field581) {
                    try {
                        this.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!this.field583) {
                    return;
                }
                var2 = this.field581;
                if (this.field582 >= this.field581) {
                    var3 = this.field582 - this.field581;
                } else {
                    var3 = 5000 - this.field581;
                }
            }
            if (var3 > 0) {
                try {
                    this.field576.write(this.field580, var2, var3);
                } catch (IOException var7) {
                    this.field584 = true;
                }
                this.field581 = (this.field581 + var3) % 5000;
                try {
                    if (this.field582 == this.field581) {
                        this.field576.flush();
                    }
                } catch (IOException var6) {
                    this.field584 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!CSJOZVFM", name = "a", descriptor = "(I)V")
    public void method199(int arg0) {
        System.out.println("dummy:" + this.field578);
        System.out.println("tcycl:" + this.field581);
        if (arg0 != 0) {
            return;
        }
        System.out.println("tnum:" + this.field582);
        System.out.println("writer:" + this.field583);
        System.out.println("ioerror:" + this.field584);
        try {
            System.out.println("available:" + this.method196());
        } catch (IOException var2) {
        }
    }
}
