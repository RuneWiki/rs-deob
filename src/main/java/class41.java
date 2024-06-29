import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!OLIDOILN")
public class class41 implements Runnable {

    @OriginalMember(owner = "client!OLIDOILN", name = "a", descriptor = "Z")
    private boolean field1066 = false;

    @OriginalMember(owner = "client!OLIDOILN", name = "e", descriptor = "Z")
    private boolean field1070 = false;

    @OriginalMember(owner = "client!OLIDOILN", name = "j", descriptor = "Z")
    private boolean field1075 = false;

    @OriginalMember(owner = "client!OLIDOILN", name = "k", descriptor = "Z")
    private boolean field1076 = false;

    @OriginalMember(owner = "client!OLIDOILN", name = "f", descriptor = "LLJUNUWBY;")
    public class31 field1071;

    @OriginalMember(owner = "client!OLIDOILN", name = "d", descriptor = "Ljava/net/Socket;")
    private Socket field1069;

    @OriginalMember(owner = "client!OLIDOILN", name = "b", descriptor = "Ljava/io/InputStream;")
    private InputStream field1067;

    @OriginalMember(owner = "client!OLIDOILN", name = "c", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1068;

    @OriginalMember(owner = "client!OLIDOILN", name = "h", descriptor = "I")
    private int field1073;

    @OriginalMember(owner = "client!OLIDOILN", name = "i", descriptor = "I")
    private int field1074;

    @OriginalMember(owner = "client!OLIDOILN", name = "g", descriptor = "[B")
    private byte[] field1072;

    @OriginalMember(owner = "client!OLIDOILN", name = "<init>", descriptor = "(LLJUNUWBY;ILjava/net/Socket;)V")
    public class41(class31 arg0, int arg1, Socket arg2) throws IOException {
        this.field1071 = arg0;
        this.field1069 = arg2;
        this.field1069.setSoTimeout(30000);
        this.field1069.setTcpNoDelay(true);
        this.field1067 = this.field1069.getInputStream();
        this.field1068 = this.field1069.getOutputStream();
        if (arg1 != 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "client!OLIDOILN", name = "a", descriptor = "()V")
    public void method322() {
        this.field1070 = true;
        try {
            if (this.field1067 != null) {
                this.field1067.close();
            }
            if (this.field1068 != null) {
                this.field1068.close();
            }
            if (this.field1069 != null) {
                this.field1069.close();
            }
        } catch (IOException var3) {
            System.out.println("Error closing stream");
        }
        this.field1075 = false;
        synchronized (this) {
            this.notify();
        }
        this.field1072 = null;
    }

    @OriginalMember(owner = "client!OLIDOILN", name = "b", descriptor = "()I")
    public int method323() throws IOException {
        return this.field1070 ? 0 : this.field1067.read();
    }

    @OriginalMember(owner = "client!OLIDOILN", name = "c", descriptor = "()I")
    public int method324() throws IOException {
        return this.field1070 ? 0 : this.field1067.available();
    }

    @OriginalMember(owner = "client!OLIDOILN", name = "a", descriptor = "([BII)V")
    public void method325(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1070) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1067.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new IOException("EOF");
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @OriginalMember(owner = "client!OLIDOILN", name = "a", descriptor = "(II[BI)V")
    public void method326(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (this.field1070) {
            return;
        }
        if (this.field1076) {
            this.field1076 = false;
            throw new IOException("Error in writer thread");
        }
        if (this.field1072 == null) {
            this.field1072 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg1; var6++) {
                this.field1072[this.field1074] = arg2[arg0 + var6];
                this.field1074 = (this.field1074 + 1) % 5000;
                if ((this.field1073 + 4900) % 5000 == this.field1074) {
                    throw new IOException("buffer overflow");
                }
            }
            if (!this.field1075) {
                this.field1075 = true;
                this.field1071.method54(this, 3);
            }
            this.notify();
        }
        if (arg3 < 5 || arg3 > 5) {
            ;
        }
    }

    @OriginalMember(owner = "client!OLIDOILN", name = "run", descriptor = "()V")
    public void run() {
        while (this.field1075) {
            int var2;
            int var3;
            synchronized (this) {
                if (this.field1074 == this.field1073) {
                    try {
                        this.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!this.field1075) {
                    return;
                }
                var2 = this.field1073;
                if (this.field1074 >= this.field1073) {
                    var3 = this.field1074 - this.field1073;
                } else {
                    var3 = 5000 - this.field1073;
                }
            }
            if (var3 > 0) {
                try {
                    this.field1068.write(this.field1072, var2, var3);
                } catch (IOException var7) {
                    this.field1076 = true;
                }
                this.field1073 = (this.field1073 + var3) % 5000;
                try {
                    if (this.field1074 == this.field1073) {
                        this.field1068.flush();
                    }
                } catch (IOException var6) {
                    this.field1076 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!OLIDOILN", name = "a", descriptor = "(Z)V")
    public void method327(boolean arg0) {
        System.out.println("dummy:" + this.field1070);
        if (arg0) {
            this.field1066 = !this.field1066;
        }
        System.out.println("tcycl:" + this.field1073);
        System.out.println("tnum:" + this.field1074);
        System.out.println("writer:" + this.field1075);
        System.out.println("ioerror:" + this.field1076);
        try {
            System.out.println("available:" + this.method324());
        } catch (IOException var2) {
        }
    }
}
