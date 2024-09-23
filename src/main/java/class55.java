import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("QLBHZVFC")
public class class55 implements Runnable {

    @OriginalMember(owner = "QLBHZVFC", name = "e", descriptor = "Z")
    private boolean field1177 = false;

    @OriginalMember(owner = "QLBHZVFC", name = "j", descriptor = "Z")
    private boolean field1182 = false;

    @OriginalMember(owner = "QLBHZVFC", name = "k", descriptor = "Z")
    private boolean field1183 = false;

    @OriginalMember(owner = "QLBHZVFC", name = "f", descriptor = "LBTXFPMEV;")
    public class7 field1178;

    @OriginalMember(owner = "QLBHZVFC", name = "d", descriptor = "Ljava/net/Socket;")
    private Socket field1176;

    @OriginalMember(owner = "QLBHZVFC", name = "b", descriptor = "Ljava/io/InputStream;")
    private InputStream field1174;

    @OriginalMember(owner = "QLBHZVFC", name = "c", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1175;

    @OriginalMember(owner = "QLBHZVFC", name = "a", descriptor = "I")
    private int field1173;

    @OriginalMember(owner = "QLBHZVFC", name = "h", descriptor = "I")
    private int field1180;

    @OriginalMember(owner = "QLBHZVFC", name = "i", descriptor = "I")
    private int field1181;

    @OriginalMember(owner = "QLBHZVFC", name = "g", descriptor = "[B")
    private byte[] field1179;

    @OriginalMember(owner = "QLBHZVFC", name = "<init>", descriptor = "(LBTXFPMEV;ILjava/net/Socket;)V")
    public class55(class7 arg0, int arg1, Socket arg2) throws IOException {
        this.field1178 = arg0;
        this.field1176 = arg2;
        this.field1176.setSoTimeout(30000);
        this.field1176.setTcpNoDelay(true);
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        this.field1174 = this.field1176.getInputStream();
        this.field1175 = this.field1176.getOutputStream();
    }

    @OriginalMember(owner = "QLBHZVFC", name = "a", descriptor = "()V")
    public void method433() {
        this.field1177 = true;
        try {
            if (this.field1174 != null) {
                this.field1174.close();
            }
            if (this.field1175 != null) {
                this.field1175.close();
            }
            if (this.field1176 != null) {
                this.field1176.close();
            }
        } catch (IOException var3) {
            System.out.println("Error closing stream");
        }
        this.field1182 = false;
        synchronized (this) {
            this.notify();
        }
        this.field1179 = null;
    }

    @OriginalMember(owner = "QLBHZVFC", name = "b", descriptor = "()I")
    public int method434() throws IOException {
        return this.field1177 ? 0 : this.field1174.read();
    }

    @OriginalMember(owner = "QLBHZVFC", name = "c", descriptor = "()I")
    public int method435() throws IOException {
        return this.field1177 ? 0 : this.field1174.available();
    }

    @OriginalMember(owner = "QLBHZVFC", name = "a", descriptor = "([BII)V")
    public void method436(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1177) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1174.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new IOException("EOF");
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @OriginalMember(owner = "QLBHZVFC", name = "a", descriptor = "([BIII)V")
    public void method437(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if (this.field1177) {
            return;
        }
        if (this.field1183) {
            this.field1183 = false;
            throw new IOException("Error in writer thread");
        }
        if (this.field1179 == null) {
            this.field1179 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg1; var6++) {
                this.field1179[this.field1181] = arg0[arg2 + var6];
                this.field1181 = (this.field1181 + 1) % 5000;
                if ((this.field1180 + 4900) % 5000 == this.field1181) {
                    throw new IOException("buffer overflow");
                }
            }
            if (!this.field1182) {
                this.field1182 = true;
                this.field1178.method58(this, 3);
            }
            this.notify();
        }
        if (arg3 != -4632) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
    }

    @OriginalMember(owner = "QLBHZVFC", name = "run", descriptor = "()V")
    public void run() {
        while (this.field1182) {
            int var2;
            int var3;
            synchronized (this) {
                if (this.field1181 == this.field1180) {
                    try {
                        this.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!this.field1182) {
                    return;
                }
                var2 = this.field1180;
                if (this.field1181 >= this.field1180) {
                    var3 = this.field1181 - this.field1180;
                } else {
                    var3 = 5000 - this.field1180;
                }
            }
            if (var3 > 0) {
                try {
                    this.field1175.write(this.field1179, var2, var3);
                } catch (IOException var7) {
                    this.field1183 = true;
                }
                this.field1180 = (this.field1180 + var3) % 5000;
                try {
                    if (this.field1181 == this.field1180) {
                        this.field1175.flush();
                    }
                } catch (IOException var6) {
                    this.field1183 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "QLBHZVFC", name = "a", descriptor = "(B)V")
    public void method438(byte arg0) {
        System.out.println("dummy:" + this.field1177);
        System.out.println("tcycl:" + this.field1180);
        System.out.println("tnum:" + this.field1181);
        System.out.println("writer:" + this.field1182);
        if (arg0 != -32) {
            this.field1173 = 158;
        }
        System.out.println("ioerror:" + this.field1183);
        try {
            System.out.println("available:" + this.method435());
        } catch (IOException var2) {
        }
    }
}
