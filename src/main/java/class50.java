import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!PWLKORWL")
public class class50 implements Runnable {

    @OriginalMember(owner = "client!PWLKORWL", name = "d", descriptor = "Z")
    private boolean field1371 = false;

    @OriginalMember(owner = "client!PWLKORWL", name = "i", descriptor = "Z")
    private boolean field1376 = false;

    @OriginalMember(owner = "client!PWLKORWL", name = "j", descriptor = "Z")
    private boolean field1377 = false;

    @OriginalMember(owner = "client!PWLKORWL", name = "e", descriptor = "LHXUVWQPY;")
    public class25 field1372;

    @OriginalMember(owner = "client!PWLKORWL", name = "c", descriptor = "Ljava/net/Socket;")
    private Socket field1370;

    @OriginalMember(owner = "client!PWLKORWL", name = "a", descriptor = "Ljava/io/InputStream;")
    private InputStream field1368;

    @OriginalMember(owner = "client!PWLKORWL", name = "b", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1369;

    @OriginalMember(owner = "client!PWLKORWL", name = "g", descriptor = "I")
    private int field1374;

    @OriginalMember(owner = "client!PWLKORWL", name = "h", descriptor = "I")
    private int field1375;

    @OriginalMember(owner = "client!PWLKORWL", name = "f", descriptor = "[B")
    private byte[] field1373;

    @OriginalMember(owner = "client!PWLKORWL", name = "<init>", descriptor = "(LHXUVWQPY;Ljava/net/Socket;B)V")
    public class50(class25 arg0, Socket arg1, byte arg2) throws IOException {
        this.field1372 = arg0;
        this.field1370 = arg1;
        this.field1370.setSoTimeout(30000);
        this.field1370.setTcpNoDelay(true);
        this.field1368 = this.field1370.getInputStream();
        if (arg2 != 5) {
            throw new NullPointerException();
        }
        this.field1369 = this.field1370.getOutputStream();
    }

    @OriginalMember(owner = "client!PWLKORWL", name = "a", descriptor = "()V")
    public void method468() {
        this.field1371 = true;
        try {
            if (this.field1368 != null) {
                this.field1368.close();
            }
            if (this.field1369 != null) {
                this.field1369.close();
            }
            if (this.field1370 != null) {
                this.field1370.close();
            }
        } catch (IOException var3) {
            System.out.println("Error closing stream");
        }
        this.field1376 = false;
        synchronized (this) {
            this.notify();
        }
        this.field1373 = null;
    }

    @OriginalMember(owner = "client!PWLKORWL", name = "b", descriptor = "()I")
    public int method469() throws IOException {
        return this.field1371 ? 0 : this.field1368.read();
    }

    @OriginalMember(owner = "client!PWLKORWL", name = "c", descriptor = "()I")
    public int method470() throws IOException {
        return this.field1371 ? 0 : this.field1368.available();
    }

    @OriginalMember(owner = "client!PWLKORWL", name = "a", descriptor = "([BII)V")
    public void method471(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1371) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1368.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new IOException("EOF");
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @OriginalMember(owner = "client!PWLKORWL", name = "a", descriptor = "([BIII)V")
    public void method472(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if (this.field1371) {
            return;
        }
        if (this.field1377) {
            this.field1377 = false;
            throw new IOException("Error in writer thread");
        }
        if (this.field1373 == null) {
            this.field1373 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg1; var6++) {
                this.field1373[this.field1375] = arg0[arg3 + var6];
                this.field1375 = (this.field1375 + 1) % 5000;
                if ((this.field1374 + 4900) % 5000 == this.field1375) {
                    throw new IOException("buffer overflow");
                }
            }
            if (!this.field1376) {
                this.field1376 = true;
                this.field1372.method154(this, 3);
            }
            this.notify();
        }
        if (arg2 != 0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
    }

    @OriginalMember(owner = "client!PWLKORWL", name = "run", descriptor = "()V")
    public void run() {
        while (this.field1376) {
            int var2;
            int var3;
            synchronized (this) {
                if (this.field1375 == this.field1374) {
                    try {
                        this.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!this.field1376) {
                    return;
                }
                var2 = this.field1374;
                if (this.field1375 >= this.field1374) {
                    var3 = this.field1375 - this.field1374;
                } else {
                    var3 = 5000 - this.field1374;
                }
            }
            if (var3 > 0) {
                try {
                    this.field1369.write(this.field1373, var2, var3);
                } catch (IOException var7) {
                    this.field1377 = true;
                }
                this.field1374 = (this.field1374 + var3) % 5000;
                try {
                    if (this.field1375 == this.field1374) {
                        this.field1369.flush();
                    }
                } catch (IOException var6) {
                    this.field1377 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!PWLKORWL", name = "a", descriptor = "(I)V")
    public void method473(int arg0) {
        System.out.println("dummy:" + this.field1371);
        System.out.println("tcycl:" + this.field1374);
        System.out.println("tnum:" + this.field1375);
        int var2 = 47 / arg0;
        System.out.println("writer:" + this.field1376);
        System.out.println("ioerror:" + this.field1377);
        try {
            System.out.println("available:" + this.method470());
        } catch (IOException var3) {
        }
    }
}
