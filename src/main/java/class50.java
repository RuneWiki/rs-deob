import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!SAMFSOGS")
public class class50 implements Runnable {

    @OriginalMember(owner = "client!SAMFSOGS", name = "d", descriptor = "Z")
    private boolean field1393 = false;

    @OriginalMember(owner = "client!SAMFSOGS", name = "i", descriptor = "Z")
    private boolean field1398 = false;

    @OriginalMember(owner = "client!SAMFSOGS", name = "j", descriptor = "Z")
    private boolean field1399 = false;

    @OriginalMember(owner = "client!SAMFSOGS", name = "e", descriptor = "LMKNKYTZT;")
    public class36 field1394;

    @OriginalMember(owner = "client!SAMFSOGS", name = "c", descriptor = "Ljava/net/Socket;")
    private Socket field1392;

    @OriginalMember(owner = "client!SAMFSOGS", name = "a", descriptor = "Ljava/io/InputStream;")
    private InputStream field1390;

    @OriginalMember(owner = "client!SAMFSOGS", name = "b", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1391;

    @OriginalMember(owner = "client!SAMFSOGS", name = "g", descriptor = "I")
    private int field1396;

    @OriginalMember(owner = "client!SAMFSOGS", name = "h", descriptor = "I")
    private int field1397;

    @OriginalMember(owner = "client!SAMFSOGS", name = "f", descriptor = "[B")
    private byte[] field1395;

    @OriginalMember(owner = "client!SAMFSOGS", name = "<init>", descriptor = "(LMKNKYTZT;Ljava/net/Socket;I)V")
    public class50(class36 arg0, Socket arg1, int arg2) throws IOException {
        this.field1394 = arg0;
        this.field1392 = arg1;
        this.field1392.setSoTimeout(30000);
        this.field1392.setTcpNoDelay(true);
        this.field1390 = this.field1392.getInputStream();
        this.field1391 = this.field1392.getOutputStream();
        int var4 = 23 / arg2;
    }

    @OriginalMember(owner = "client!SAMFSOGS", name = "a", descriptor = "()V")
    public void method516() {
        this.field1393 = true;
        try {
            if (this.field1390 != null) {
                this.field1390.close();
            }
            if (this.field1391 != null) {
                this.field1391.close();
            }
            if (this.field1392 != null) {
                this.field1392.close();
            }
        } catch (IOException var3) {
            System.out.println("Error closing stream");
        }
        this.field1398 = false;
        synchronized (this) {
            this.notify();
        }
        this.field1395 = null;
    }

    @OriginalMember(owner = "client!SAMFSOGS", name = "b", descriptor = "()I")
    public int method517() throws IOException {
        return this.field1393 ? 0 : this.field1390.read();
    }

    @OriginalMember(owner = "client!SAMFSOGS", name = "c", descriptor = "()I")
    public int method518() throws IOException {
        return this.field1393 ? 0 : this.field1390.available();
    }

    @OriginalMember(owner = "client!SAMFSOGS", name = "a", descriptor = "([BII)V")
    public void method519(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1393) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1390.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new IOException("EOF");
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @OriginalMember(owner = "client!SAMFSOGS", name = "a", descriptor = "(IIB[B)V")
    public void method520(int arg0, int arg1, byte arg2, byte[] arg3) throws IOException {
        if (arg2 != -100 || this.field1393) {
            return;
        }
        if (this.field1399) {
            this.field1399 = false;
            throw new IOException("Error in writer thread");
        }
        if (this.field1395 == null) {
            this.field1395 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg1; var6++) {
                this.field1395[this.field1397] = arg3[arg0 + var6];
                this.field1397 = (this.field1397 + 1) % 5000;
                if ((this.field1396 + 4900) % 5000 == this.field1397) {
                    throw new IOException("buffer overflow");
                }
            }
            if (!this.field1398) {
                this.field1398 = true;
                this.field1394.method139(this, 3);
            }
            this.notify();
        }
    }

    @OriginalMember(owner = "client!SAMFSOGS", name = "run", descriptor = "()V")
    public void run() {
        while (this.field1398) {
            int var2;
            int var3;
            synchronized (this) {
                if (this.field1397 == this.field1396) {
                    try {
                        this.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!this.field1398) {
                    return;
                }
                var2 = this.field1396;
                if (this.field1397 >= this.field1396) {
                    var3 = this.field1397 - this.field1396;
                } else {
                    var3 = 5000 - this.field1396;
                }
            }
            if (var3 > 0) {
                try {
                    this.field1391.write(this.field1395, var2, var3);
                } catch (IOException var7) {
                    this.field1399 = true;
                }
                this.field1396 = (this.field1396 + var3) % 5000;
                try {
                    if (this.field1397 == this.field1396) {
                        this.field1391.flush();
                    }
                } catch (IOException var6) {
                    this.field1399 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!SAMFSOGS", name = "a", descriptor = "(I)V")
    public void method521(int arg0) {
        System.out.println("dummy:" + this.field1393);
        if (arg0 < 1 || arg0 > 1) {
            return;
        }
        System.out.println("tcycl:" + this.field1396);
        System.out.println("tnum:" + this.field1397);
        System.out.println("writer:" + this.field1398);
        System.out.println("ioerror:" + this.field1399);
        try {
            System.out.println("available:" + this.method518());
        } catch (IOException var2) {
        }
    }
}
