import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("BJGZFSFX")
public class class3 implements Runnable {

    @OriginalMember(owner = "BJGZFSFX", name = "a", descriptor = "I")
    private int field11 = 4;

    @OriginalMember(owner = "BJGZFSFX", name = "e", descriptor = "Z")
    private boolean field15 = false;

    @OriginalMember(owner = "BJGZFSFX", name = "j", descriptor = "Z")
    private boolean field20 = false;

    @OriginalMember(owner = "BJGZFSFX", name = "k", descriptor = "Z")
    private boolean field21 = false;

    @OriginalMember(owner = "BJGZFSFX", name = "f", descriptor = "LITJBTECW;")
    public class22 field16;

    @OriginalMember(owner = "BJGZFSFX", name = "d", descriptor = "Ljava/net/Socket;")
    private Socket field14;

    @OriginalMember(owner = "BJGZFSFX", name = "b", descriptor = "Ljava/io/InputStream;")
    private InputStream field12;

    @OriginalMember(owner = "BJGZFSFX", name = "c", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field13;

    @OriginalMember(owner = "BJGZFSFX", name = "h", descriptor = "I")
    private int field18;

    @OriginalMember(owner = "BJGZFSFX", name = "i", descriptor = "I")
    private int field19;

    @OriginalMember(owner = "BJGZFSFX", name = "g", descriptor = "[B")
    private byte[] field17;

    @OriginalMember(owner = "BJGZFSFX", name = "<init>", descriptor = "(LITJBTECW;ZLjava/net/Socket;)V")
    public class3(class22 arg0, boolean arg1, Socket arg2) throws IOException {
        this.field16 = arg0;
        this.field14 = arg2;
        this.field14.setSoTimeout(30000);
        this.field14.setTcpNoDelay(true);
        if (arg1) {
            this.field11 = -272;
        }
        this.field12 = this.field14.getInputStream();
        this.field13 = this.field14.getOutputStream();
    }

    @OriginalMember(owner = "BJGZFSFX", name = "a", descriptor = "()V")
    public void method1() {
        this.field15 = true;
        try {
            if (this.field12 != null) {
                this.field12.close();
            }
            if (this.field13 != null) {
                this.field13.close();
            }
            if (this.field14 != null) {
                this.field14.close();
            }
        } catch (IOException var3) {
            System.out.println("Error closing stream");
        }
        this.field20 = false;
        synchronized (this) {
            this.notify();
        }
        this.field17 = null;
    }

    @OriginalMember(owner = "BJGZFSFX", name = "b", descriptor = "()I")
    public int method2() throws IOException {
        return this.field15 ? 0 : this.field12.read();
    }

    @OriginalMember(owner = "BJGZFSFX", name = "c", descriptor = "()I")
    public int method3() throws IOException {
        return this.field15 ? 0 : this.field12.available();
    }

    @OriginalMember(owner = "BJGZFSFX", name = "a", descriptor = "([BII)V")
    public void method4(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field15) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field12.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new IOException("EOF");
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @OriginalMember(owner = "BJGZFSFX", name = "a", descriptor = "([BIIZ)V")
    public void method5(byte[] arg0, int arg1, int arg2, boolean arg3) throws IOException {
        if (this.field15) {
            return;
        }
        if (this.field21) {
            this.field21 = false;
            throw new IOException("Error in writer thread");
        }
        if (this.field17 == null) {
            this.field17 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field17[this.field19] = arg0[arg1 + var6];
                this.field19 = (this.field19 + 1) % 5000;
                if ((this.field18 + 4900) % 5000 == this.field19) {
                    throw new IOException("buffer overflow");
                }
            }
            if (!this.field20) {
                this.field20 = true;
                this.field16.method124(this, 3);
            }
            this.notify();
        }
        if (!arg3) {
            this.field11 = -177;
        }
    }

    @OriginalMember(owner = "BJGZFSFX", name = "run", descriptor = "()V")
    public void run() {
        while (this.field20) {
            int var2;
            int var3;
            synchronized (this) {
                if (this.field19 == this.field18) {
                    try {
                        this.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!this.field20) {
                    return;
                }
                var2 = this.field18;
                if (this.field19 >= this.field18) {
                    var3 = this.field19 - this.field18;
                } else {
                    var3 = 5000 - this.field18;
                }
            }
            if (var3 > 0) {
                try {
                    this.field13.write(this.field17, var2, var3);
                } catch (IOException var7) {
                    this.field21 = true;
                }
                this.field18 = (this.field18 + var3) % 5000;
                try {
                    if (this.field19 == this.field18) {
                        this.field13.flush();
                    }
                } catch (IOException var6) {
                    this.field21 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "BJGZFSFX", name = "a", descriptor = "(B)V")
    public void method6(byte arg0) {
        System.out.println("dummy:" + this.field15);
        System.out.println("tcycl:" + this.field18);
        System.out.println("tnum:" + this.field19);
        System.out.println("writer:" + this.field20);
        System.out.println("ioerror:" + this.field21);
        if (arg0 == 5) {
            try {
                System.out.println("available:" + this.method3());
            } catch (IOException var2) {
            }
        }
    }
}
