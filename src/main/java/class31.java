import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!KMJQVYHB")
public class class31 implements Runnable {

    @OriginalMember(owner = "client!KMJQVYHB", name = "b", descriptor = "Z")
    private boolean field1078 = true;

    @OriginalMember(owner = "client!KMJQVYHB", name = "f", descriptor = "Z")
    private boolean field1082 = false;

    @OriginalMember(owner = "client!KMJQVYHB", name = "k", descriptor = "Z")
    private boolean field1087 = false;

    @OriginalMember(owner = "client!KMJQVYHB", name = "l", descriptor = "Z")
    private boolean field1088 = false;

    @OriginalMember(owner = "client!KMJQVYHB", name = "g", descriptor = "LAHZQVBFX;")
    public class3 field1083;

    @OriginalMember(owner = "client!KMJQVYHB", name = "e", descriptor = "Ljava/net/Socket;")
    private Socket field1081;

    @OriginalMember(owner = "client!KMJQVYHB", name = "c", descriptor = "Ljava/io/InputStream;")
    private InputStream field1079;

    @OriginalMember(owner = "client!KMJQVYHB", name = "d", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1080;

    @OriginalMember(owner = "client!KMJQVYHB", name = "a", descriptor = "I")
    private int field1077;

    @OriginalMember(owner = "client!KMJQVYHB", name = "i", descriptor = "I")
    private int field1085;

    @OriginalMember(owner = "client!KMJQVYHB", name = "j", descriptor = "I")
    private int field1086;

    @OriginalMember(owner = "client!KMJQVYHB", name = "h", descriptor = "[B")
    private byte[] field1084;

    @OriginalMember(owner = "client!KMJQVYHB", name = "<init>", descriptor = "(Ljava/net/Socket;ILAHZQVBFX;)V")
    public class31(Socket arg0, int arg1, class3 arg2) throws IOException {
        this.field1083 = arg2;
        this.field1081 = arg0;
        this.field1081.setSoTimeout(30000);
        this.field1081.setTcpNoDelay(true);
        this.field1079 = this.field1081.getInputStream();
        this.field1080 = this.field1081.getOutputStream();
        if (arg1 != 2) {
            this.field1077 = -90;
        }
    }

    @OriginalMember(owner = "client!KMJQVYHB", name = "a", descriptor = "()V")
    public void method304() {
        this.field1082 = true;
        try {
            if (this.field1079 != null) {
                this.field1079.close();
            }
            if (this.field1080 != null) {
                this.field1080.close();
            }
            if (this.field1081 != null) {
                this.field1081.close();
            }
        } catch (IOException var3) {
            System.out.println("Error closing stream");
        }
        this.field1087 = false;
        synchronized (this) {
            this.notify();
        }
        this.field1084 = null;
    }

    @OriginalMember(owner = "client!KMJQVYHB", name = "b", descriptor = "()I")
    public int method305() throws IOException {
        return this.field1082 ? 0 : this.field1079.read();
    }

    @OriginalMember(owner = "client!KMJQVYHB", name = "c", descriptor = "()I")
    public int method306() throws IOException {
        return this.field1082 ? 0 : this.field1079.available();
    }

    @OriginalMember(owner = "client!KMJQVYHB", name = "a", descriptor = "([BII)V")
    public void method307(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1082) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1079.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new IOException("EOF");
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @OriginalMember(owner = "client!KMJQVYHB", name = "a", descriptor = "(IZ[BI)V")
    public void method308(int arg0, boolean arg1, byte[] arg2, int arg3) throws IOException {
        if (!arg1 || this.field1082) {
            return;
        }
        if (this.field1088) {
            this.field1088 = false;
            throw new IOException("Error in writer thread");
        }
        if (this.field1084 == null) {
            this.field1084 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg0; var6++) {
                this.field1084[this.field1086] = arg2[arg3 + var6];
                this.field1086 = (this.field1086 + 1) % 5000;
                if ((this.field1085 + 4900) % 5000 == this.field1086) {
                    throw new IOException("buffer overflow");
                }
            }
            if (!this.field1087) {
                this.field1087 = true;
                this.field1083.method25(this, 3);
            }
            this.notify();
        }
    }

    @OriginalMember(owner = "client!KMJQVYHB", name = "run", descriptor = "()V")
    public void run() {
        while (this.field1087) {
            int var2;
            int var3;
            synchronized (this) {
                if (this.field1086 == this.field1085) {
                    try {
                        this.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!this.field1087) {
                    return;
                }
                var2 = this.field1085;
                if (this.field1086 >= this.field1085) {
                    var3 = this.field1086 - this.field1085;
                } else {
                    var3 = 5000 - this.field1085;
                }
            }
            if (var3 > 0) {
                try {
                    this.field1080.write(this.field1084, var2, var3);
                } catch (IOException var7) {
                    this.field1088 = true;
                }
                this.field1085 = (this.field1085 + var3) % 5000;
                try {
                    if (this.field1086 == this.field1085) {
                        this.field1080.flush();
                    }
                } catch (IOException var6) {
                    this.field1088 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!KMJQVYHB", name = "a", descriptor = "(I)V")
    public void method309(int arg0) {
        System.out.println("dummy:" + this.field1082);
        System.out.println("tcycl:" + this.field1085);
        System.out.println("tnum:" + this.field1086);
        if (arg0 != -26491) {
            this.field1078 = !this.field1078;
        }
        System.out.println("writer:" + this.field1087);
        System.out.println("ioerror:" + this.field1088);
        try {
            System.out.println("available:" + this.method306());
        } catch (IOException var2) {
        }
    }
}
