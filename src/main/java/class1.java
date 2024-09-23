import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("AAVSEYUK")
public class class1 implements Runnable {

    @OriginalMember(owner = "AAVSEYUK", name = "a", descriptor = "Z")
    private boolean field1 = true;

    @OriginalMember(owner = "AAVSEYUK", name = "e", descriptor = "Z")
    private boolean field5 = false;

    @OriginalMember(owner = "AAVSEYUK", name = "j", descriptor = "Z")
    private boolean field10 = false;

    @OriginalMember(owner = "AAVSEYUK", name = "k", descriptor = "Z")
    private boolean field11 = false;

    @OriginalMember(owner = "AAVSEYUK", name = "f", descriptor = "LEUDZGBGU;")
    public class18 field6;

    @OriginalMember(owner = "AAVSEYUK", name = "d", descriptor = "Ljava/net/Socket;")
    private Socket field4;

    @OriginalMember(owner = "AAVSEYUK", name = "b", descriptor = "Ljava/io/InputStream;")
    private InputStream field2;

    @OriginalMember(owner = "AAVSEYUK", name = "c", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field3;

    @OriginalMember(owner = "AAVSEYUK", name = "h", descriptor = "I")
    private int field8;

    @OriginalMember(owner = "AAVSEYUK", name = "i", descriptor = "I")
    private int field9;

    @OriginalMember(owner = "AAVSEYUK", name = "g", descriptor = "[B")
    private byte[] field7;

    @OriginalMember(owner = "AAVSEYUK", name = "<init>", descriptor = "(LEUDZGBGU;Ljava/net/Socket;B)V")
    public class1(class18 arg0, Socket arg1, byte arg2) throws IOException {
        this.field6 = arg0;
        this.field4 = arg1;
        this.field4.setSoTimeout(30000);
        this.field4.setTcpNoDelay(true);
        this.field2 = this.field4.getInputStream();
        if (arg2 != -45) {
            this.field1 = !this.field1;
        }
        this.field3 = this.field4.getOutputStream();
    }

    @OriginalMember(owner = "AAVSEYUK", name = "a", descriptor = "()V")
    public void method1() {
        this.field5 = true;
        try {
            if (this.field2 != null) {
                this.field2.close();
            }
            if (this.field3 != null) {
                this.field3.close();
            }
            if (this.field4 != null) {
                this.field4.close();
            }
        } catch (IOException var3) {
            System.out.println("Error closing stream");
        }
        this.field10 = false;
        synchronized (this) {
            this.notify();
        }
        this.field7 = null;
    }

    @OriginalMember(owner = "AAVSEYUK", name = "b", descriptor = "()I")
    public int method2() throws IOException {
        return this.field5 ? 0 : this.field2.read();
    }

    @OriginalMember(owner = "AAVSEYUK", name = "c", descriptor = "()I")
    public int method3() throws IOException {
        return this.field5 ? 0 : this.field2.available();
    }

    @OriginalMember(owner = "AAVSEYUK", name = "a", descriptor = "([BII)V")
    public void method4(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field5) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new IOException("EOF");
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @OriginalMember(owner = "AAVSEYUK", name = "a", descriptor = "(I[BII)V")
    public void method5(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (this.field5) {
            return;
        }
        if (this.field11) {
            this.field11 = false;
            throw new IOException("Error in writer thread");
        }
        if (this.field7 == null) {
            this.field7 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg0; var6++) {
                this.field7[this.field9] = arg1[arg2 + var6];
                this.field9 = (this.field9 + 1) % 5000;
                if ((this.field8 + 4900) % 5000 == this.field9) {
                    throw new IOException("buffer overflow");
                }
            }
            if (!this.field10) {
                this.field10 = true;
                this.field6.method47(this, 3);
            }
            this.notify();
        }
        if (arg3 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "AAVSEYUK", name = "run", descriptor = "()V")
    public void run() {
        while (this.field10) {
            int var2;
            int var3;
            synchronized (this) {
                if (this.field9 == this.field8) {
                    try {
                        this.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!this.field10) {
                    return;
                }
                var2 = this.field8;
                if (this.field9 >= this.field8) {
                    var3 = this.field9 - this.field8;
                } else {
                    var3 = 5000 - this.field8;
                }
            }
            if (var3 > 0) {
                try {
                    this.field3.write(this.field7, var2, var3);
                } catch (IOException var7) {
                    this.field11 = true;
                }
                this.field8 = (this.field8 + var3) % 5000;
                try {
                    if (this.field9 == this.field8) {
                        this.field3.flush();
                    }
                } catch (IOException var6) {
                    this.field11 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "AAVSEYUK", name = "a", descriptor = "(Z)V")
    public void method6(boolean arg0) {
        System.out.println("dummy:" + this.field5);
        if (arg0) {
            return;
        }
        System.out.println("tcycl:" + this.field8);
        System.out.println("tnum:" + this.field9);
        System.out.println("writer:" + this.field10);
        System.out.println("ioerror:" + this.field11);
        try {
            System.out.println("available:" + this.method3());
        } catch (IOException var2) {
        }
    }
}
