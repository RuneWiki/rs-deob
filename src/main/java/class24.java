import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class24 implements Runnable {

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "Z")
    private boolean field330 = false;

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "I")
    private int field338 = 0;

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "I")
    private int field346 = 0;

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "Z")
    private boolean field348 = false;

    @OriginalMember(owner = "client!bd", name = "y", descriptor = "Lt;")
    private class247 field354;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "Ljava/net/Socket;")
    private Socket field335;

    @OriginalMember(owner = "client!bd", name = "w", descriptor = "Ljava/io/InputStream;")
    private InputStream field352;

    @OriginalMember(owner = "client!bd", name = "t", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field349;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "[S")
    public static short[] field332 = new short[256];

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "Le;")
    private static class191 field333 = class54.method368("http:)4)4advert)3runescape)3com)4banner)3ws?size=729", 2047);

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "Le;")
    public static class191 field343 = field333;

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "I")
    public static int field345 = -2;

    @OriginalMember(owner = "client!bd", name = "x", descriptor = "I")
    public static int field353 = 0;

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "B")
    public static byte field341;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!bd", name = "u", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!bd", name = "v", descriptor = "Lfa;")
    private class80 field351;

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "[B")
    private byte[] field347;

    @OriginalMember(owner = "client!bd", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method174(100);
        field342++;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)I")
    public final int method171(int arg0) throws IOException {
        field339++;
        if (arg0 == -27105) {
            return this.field330 ? 0 : this.field352.read();
        } else {
            return 66;
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V")
    public static void method172(int arg0) {
        field333 = null;
        field343 = null;
        int var1 = 16 / ((arg0 - 40) / 63);
        field332 = null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BI[BI)V")
    public final void method173(byte arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field336++;
        if (this.field330) {
            return;
        }
        if (this.field348) {
            this.field348 = false;
            throw new IOException();
        }
        if (this.field347 == null) {
            this.field347 = new byte[5000];
        }
        synchronized (this) {
            int var6 = 9 / ((68 - arg0) / 42);
            for (int var7 = 0; var7 < arg1; var7++) {
                this.field347[this.field346] = arg2[arg3 + var7];
                this.field346 = (this.field346 + 1) % 5000;
                if ((this.field338 + 4900) % 5000 == this.field346) {
                    throw new IOException();
                }
            }
            if (this.field351 == null) {
                this.field351 = this.field354.method1715(3, -84, this);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(I)V")
    public final void method174(int arg0) {
        field331++;
        int var2 = 48 / ((24 - arg0) / 46);
        if (this.field330) {
            return;
        }
        synchronized (this) {
            this.field330 = true;
            this.notifyAll();
        }
        if (this.field351 != null) {
            while (this.field351.field1356 == 0) {
                class18.method142(true, 1L);
            }
            if (this.field351.field1356 == 1) {
                try {
                    ((Thread) this.field351.field1360).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field351 = null;
    }

    @OriginalMember(owner = "client!bd", name = "run", descriptor = "()V")
    public final void run() {
        field350++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field346 == this.field338) {
                        if (this.field330) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    if (this.field338 > this.field346) {
                        var2 = 5000 - this.field338;
                    } else {
                        var2 = this.field346 - this.field338;
                    }
                    var3 = this.field338;
                }
                if (var2 > 0) {
                    try {
                        this.field349.write(this.field347, var3, var2);
                    } catch (IOException var9) {
                        this.field348 = true;
                    }
                    this.field338 = (this.field338 + var2) % 5000;
                    try {
                        if (this.field346 == this.field338) {
                            this.field349.flush();
                        }
                    } catch (IOException var8) {
                        this.field348 = true;
                    }
                }
            }
            try {
                if (this.field352 != null) {
                    this.field352.close();
                }
                if (this.field349 != null) {
                    this.field349.close();
                }
                if (this.field335 != null) {
                    this.field335.close();
                }
            } catch (IOException var7) {
            }
            this.field347 = null;
        } catch (Exception var12) {
            class25.method182(var12, (String) null, true);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I[BBI)V")
    public final void method175(int arg0, byte[] arg1, byte arg2, int arg3) throws IOException {
        int var5 = 43 % ((-arg2 - 75) / 43);
        field344++;
        if (this.field330) {
            return;
        }
        while (arg0 > 0) {
            int var6 = this.field352.read(arg1, arg3, arg0);
            if (var6 <= 0) {
                throw new EOFException();
            }
            arg0 -= var6;
            arg3 += var6;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Le;B)V")
    public static final void method176(class191 arg0, byte arg1) {
        field337++;
        if (arg1 != 30) {
            field332 = null;
        }
        for (class49 var2 = (class49) class149.field2577.method1173(67); var2 != null; var2 = (class49) class149.field2577.method1175(-1)) {
            if (var2.field883.method1317(-27518, arg0)) {
                class183.field3151 = var2;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Ljava/net/Socket;Lt;)V")
    public class24(Socket arg0, class247 arg1) throws IOException {
        this.field354 = arg1;
        this.field335 = arg0;
        this.field335.setSoTimeout(30000);
        this.field335.setTcpNoDelay(true);
        this.field352 = this.field335.getInputStream();
        this.field349 = this.field335.getOutputStream();
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)I")
    public final int method177(byte arg0) throws IOException {
        field340++;
        if (arg0 < 122) {
            return 92;
        } else if (this.field330) {
            return 0;
        } else {
            return this.field352.available();
        }
    }
}
