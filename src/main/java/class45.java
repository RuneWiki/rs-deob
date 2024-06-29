import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!QIACHOJO")
public class class45 implements Runnable {

    @OriginalMember(owner = "client!QIACHOJO", name = "a", descriptor = "I")
    private int field1173 = 6;

    @OriginalMember(owner = "client!QIACHOJO", name = "b", descriptor = "I")
    private int field1174 = -344;

    @OriginalMember(owner = "client!QIACHOJO", name = "f", descriptor = "Z")
    private boolean field1178 = false;

    @OriginalMember(owner = "client!QIACHOJO", name = "k", descriptor = "Z")
    private boolean field1183 = false;

    @OriginalMember(owner = "client!QIACHOJO", name = "l", descriptor = "Z")
    private boolean field1184 = false;

    @OriginalMember(owner = "client!QIACHOJO", name = "g", descriptor = "LEPVRYXOV;")
    public class9 field1179;

    @OriginalMember(owner = "client!QIACHOJO", name = "e", descriptor = "Ljava/net/Socket;")
    private Socket field1177;

    @OriginalMember(owner = "client!QIACHOJO", name = "c", descriptor = "Ljava/io/InputStream;")
    private InputStream field1175;

    @OriginalMember(owner = "client!QIACHOJO", name = "d", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1176;

    @OriginalMember(owner = "client!QIACHOJO", name = "i", descriptor = "I")
    private int field1181;

    @OriginalMember(owner = "client!QIACHOJO", name = "j", descriptor = "I")
    private int field1182;

    @OriginalMember(owner = "client!QIACHOJO", name = "h", descriptor = "[B")
    private byte[] field1180;

    @OriginalMember(owner = "client!QIACHOJO", name = "<init>", descriptor = "(Ljava/net/Socket;BLEPVRYXOV;)V")
    public class45(Socket arg0, byte arg1, class9 arg2) throws IOException {
        this.field1179 = arg2;
        this.field1177 = arg0;
        this.field1177.setSoTimeout(30000);
        this.field1177.setTcpNoDelay(true);
        if (arg1 == 5) {
            boolean var4 = false;
        } else {
            this.field1173 = -170;
        }
        this.field1175 = this.field1177.getInputStream();
        this.field1176 = this.field1177.getOutputStream();
    }

    @OriginalMember(owner = "client!QIACHOJO", name = "a", descriptor = "()V")
    public void method420() {
        this.field1178 = true;
        try {
            if (this.field1175 != null) {
                this.field1175.close();
            }
            if (this.field1176 != null) {
                this.field1176.close();
            }
            if (this.field1177 != null) {
                this.field1177.close();
            }
        } catch (IOException var3) {
            System.out.println("Error closing stream");
        }
        this.field1183 = false;
        synchronized (this) {
            this.notify();
        }
        this.field1180 = null;
    }

    @OriginalMember(owner = "client!QIACHOJO", name = "b", descriptor = "()I")
    public int method421() throws IOException {
        return this.field1178 ? 0 : this.field1175.read();
    }

    @OriginalMember(owner = "client!QIACHOJO", name = "c", descriptor = "()I")
    public int method422() throws IOException {
        return this.field1178 ? 0 : this.field1175.available();
    }

    @OriginalMember(owner = "client!QIACHOJO", name = "a", descriptor = "([BII)V")
    public void method423(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1178) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1175.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new IOException("EOF");
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @OriginalMember(owner = "client!QIACHOJO", name = "a", descriptor = "(II[BI)V")
    public void method424(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (this.field1178) {
            return;
        }
        if (this.field1184) {
            this.field1184 = false;
            throw new IOException("Error in writer thread");
        }
        if (this.field1180 == null) {
            this.field1180 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg3; var6++) {
                this.field1180[this.field1182] = arg2[arg1 + var6];
                this.field1182 = (this.field1182 + 1) % 5000;
                if ((this.field1181 + 4900) % 5000 == this.field1182) {
                    throw new IOException("buffer overflow");
                }
            }
            if (!this.field1183) {
                this.field1183 = true;
                this.field1179.method142(this, 3);
            }
            this.notify();
        }
        if (arg0 == 5) {
            ;
        }
    }

    @OriginalMember(owner = "client!QIACHOJO", name = "run", descriptor = "()V")
    public void run() {
        while (this.field1183) {
            int var2;
            int var3;
            synchronized (this) {
                if (this.field1182 == this.field1181) {
                    try {
                        this.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!this.field1183) {
                    return;
                }
                var2 = this.field1181;
                if (this.field1182 >= this.field1181) {
                    var3 = this.field1182 - this.field1181;
                } else {
                    var3 = 5000 - this.field1181;
                }
            }
            if (var3 > 0) {
                try {
                    this.field1176.write(this.field1180, var2, var3);
                } catch (IOException var7) {
                    this.field1184 = true;
                }
                this.field1181 = (this.field1181 + var3) % 5000;
                try {
                    if (this.field1182 == this.field1181) {
                        this.field1176.flush();
                    }
                } catch (IOException var6) {
                    this.field1184 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!QIACHOJO", name = "a", descriptor = "(I)V")
    public void method425(int arg0) {
        System.out.println("dummy:" + this.field1178);
        if (arg0 < 2 || arg0 > 2) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        System.out.println("tcycl:" + this.field1181);
        System.out.println("tnum:" + this.field1182);
        System.out.println("writer:" + this.field1183);
        System.out.println("ioerror:" + this.field1184);
        try {
            System.out.println("available:" + this.method422());
        } catch (IOException var3) {
        }
    }
}
