import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class52 implements Runnable {

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
    private int field1263 = 0;

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "Z")
    private boolean field1274 = false;

    @OriginalMember(owner = "client!fd", name = "x", descriptor = "Z")
    private boolean field1286 = false;

    @OriginalMember(owner = "client!fd", name = "y", descriptor = "I")
    private int field1287 = 0;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "Ljava/net/Socket;")
    private Socket field1265;

    @OriginalMember(owner = "client!fd", name = "r", descriptor = "Lqe;")
    private class149 field1280;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "Ljava/io/InputStream;")
    private InputStream field1271;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1269;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "[[S")
    public static short[][] field1264 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "Lgg;")
    public static class63 field1266 = class116.method911(43, " loggt sich ein)3");

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!fd", name = "q", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!fd", name = "s", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!fd", name = "t", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!fd", name = "v", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "Ljc;")
    public static class85 field1275;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "Lje;")
    private class87 field1268;

    @OriginalMember(owner = "client!fd", name = "w", descriptor = "[B")
    private byte[] field1285;

    @OriginalMember(owner = "client!fd", name = "u", descriptor = "[[B")
    public static byte[][] field1283;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BLgg;)V")
    public static final void method508(byte arg0, class63 arg1) {
        field1282++;
        if (class59.field1512 == null) {
            return;
        }
        int var2 = 0;
        long var3 = arg1.method590(-98);
        if (var3 == 0L) {
            return;
        }
        while (var2 < class59.field1512.length && class59.field1512[var2].field3612 != var3) {
            var2++;
        }
        if (class59.field1512.length > var2 && class59.field1512[var2] != null) {
            class141.field3031.method854(192, true);
            class155.field3248++;
            int var5 = 74 / ((arg0 - 44) / 55);
            class141.field3031.method32((byte) 72, class59.field1512[var2].field3612);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)V")
    public final void method509(boolean arg0) {
        field1278++;
        if (this.field1274) {
            return;
        }
        synchronized (this) {
            this.field1274 = arg0;
            this.notifyAll();
        }
        if (this.field1268 != null) {
            while (this.field1268.field2058 == 0) {
                class196.method1281((byte) -8, 1L);
            }
            if (this.field1268.field2058 == 1) {
                try {
                    ((Thread) this.field1268.field2060).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field1268 = null;
    }

    @OriginalMember(owner = "client!fd", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method509(true);
        field1270++;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)I")
    public final int method510(byte arg0) throws IOException {
        field1277++;
        if (this.field1274) {
            return 0;
        } else {
            if (arg0 <= 69) {
                this.finalize();
            }
            return this.field1271.available();
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
    public static final void method511(int arg0) {
        field1273++;
        if (arg0 != 1969814855) {
            field1275 = null;
        }
        if (!class181.field3680) {
            return;
        }
        class54 var1 = class12.method149(class33.field793, class60.field1538, arg0 - 1969802629);
        if (var1 != null && var1.field1338 != null) {
            class131 var2 = new class131();
            var2.field2853 = var1.field1338;
            var2.field2862 = var1;
            class130.method963(var2, (byte) -113);
        }
        class181.field3680 = false;
        class113.method901(arg0 ^ 0x7568FD47, var1);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(II[BB)V")
    public final void method512(int arg0, int arg1, byte[] arg2, byte arg3) throws IOException {
        field1284++;
        if (this.field1274) {
            return;
        }
        if (this.field1286) {
            this.field1286 = false;
            throw new IOException();
        }
        if (this.field1285 == null) {
            this.field1285 = new byte[5000];
        }
        int var5 = 108 % ((arg3 - 22) / 56);
        synchronized (this) {
            for (int var7 = 0; var7 < arg1; var7++) {
                this.field1285[this.field1263] = arg2[arg0 + var7];
                this.field1263 = (this.field1263 + 1) % 5000;
                if ((this.field1287 + 4900) % 5000 == this.field1263) {
                    throw new IOException();
                }
            }
            if (this.field1268 == null) {
                this.field1268 = this.field1280.method1045(this, (byte) 113, 3);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIB)V")
    public static final void method513(int arg0, int arg1, byte arg2) {
        field1279++;
        class148 var3 = class163.field3365[class112.field2528][arg1][arg0];
        if (var3 == null) {
            class123.method939(class112.field2528, arg1, arg0);
            return;
        }
        int var4 = -99999999;
        class113 var5 = (class113) var3.method1033(0);
        class113 var6 = null;
        while (var5 != null) {
            class93 var12 = class59.method554(var5.field2544, 13319);
            int var13 = var12.field2231;
            if (var12.field2242 == 1) {
                var13 = (var5.field2535 + 1) * var13;
            }
            if (var4 < var13) {
                var6 = var5;
                var4 = var13;
            }
            var5 = (class113) var3.method1035(0);
        }
        if (var6 == null) {
            class123.method939(class112.field2528, arg1, arg0);
        } else if (arg2 < -69) {
            var3.method1038(0, var6);
            class113 var7 = (class113) var3.method1033(0);
            class113 var8 = null;
            class113 var9 = null;
            while (var7 != null) {
                if (var6.field2544 != var7.field2544) {
                    if (var9 == null) {
                        var9 = var7;
                    }
                    if (var7.field2544 != var9.field2544 && var8 == null) {
                        var8 = var7;
                    }
                }
                var7 = (class113) var3.method1035(0);
            }
            long var10 = (long) ((arg0 << 7) + arg1 + 1610612736);
            class157.method1088(class112.field2528, arg1, arg0, class112.method894(-113, class112.field2528, arg1 * 128 + 64, arg0 * 128 + 64), var6, var10, var9, var8);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(III[B)V")
    public final void method514(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg2 != -1) {
            field1264 = null;
        }
        field1267++;
        if (this.field1274) {
            return;
        }
        while (arg1 > 0) {
            int var5 = this.field1271.read(arg3, arg0, arg1);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg0 += var5;
            arg1 -= var5;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIII)Z")
    public static final boolean method515(int arg0, int arg1, int arg2, int arg3) {
        int var4 = class68.field1705 * arg0 + class22.field511 * arg2 >> 16;
        int var5 = class68.field1705 * arg2 - class22.field511 * arg0 >> 16;
        int var6 = class195.field3915 * var5 + class123.field2720 * arg1 >> 16;
        int var7 = class195.field3915 * arg1 - class123.field2720 * var5 >> 16;
        if (var6 >= 50 && var6 <= arg3) {
            int var8 = (var4 << 9) / var6 + class104.field2387;
            int var9 = (var7 << 9) / var6 + class13.field311;
            return var8 >= class135.field2919 && var8 <= class64.field1643 && var9 >= class37.field887 && var9 <= class85.field2017;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fd", name = "run", descriptor = "()V")
    public final void run() {
        field1272++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field1287 == this.field1263) {
                        if (this.field1274) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    var2 = this.field1287;
                    if (this.field1287 > this.field1263) {
                        var3 = 5000 - this.field1287;
                    } else {
                        var3 = this.field1263 - this.field1287;
                    }
                }
                if (var3 > 0) {
                    try {
                        this.field1269.write(this.field1285, var2, var3);
                    } catch (IOException var9) {
                        this.field1286 = true;
                    }
                    this.field1287 = (this.field1287 + var3) % 5000;
                    try {
                        if (this.field1287 == this.field1263) {
                            this.field1269.flush();
                        }
                    } catch (IOException var8) {
                        this.field1286 = true;
                    }
                }
            }
            try {
                if (this.field1271 != null) {
                    this.field1271.close();
                }
                if (this.field1269 != null) {
                    this.field1269.close();
                }
                if (this.field1265 != null) {
                    this.field1265.close();
                }
            } catch (IOException var7) {
            }
            this.field1285 = null;
        } catch (Exception var12) {
            class199.method1302(null, var12, true);
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(B)I")
    public final int method516(byte arg0) throws IOException {
        field1281++;
        if (this.field1274) {
            return 0;
        } else {
            if (arg0 >= -93) {
                this.field1286 = false;
            }
            return this.field1271.read();
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)V")
    public static void method517(int arg0) {
        field1283 = null;
        if (arg0 != 9) {
            method515(6, 46, -124, -62);
        }
        field1264 = null;
        field1266 = null;
        field1275 = null;
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Ljava/net/Socket;Lqe;)V")
    public class52(Socket arg0, class149 arg1) throws IOException {
        this.field1265 = arg0;
        this.field1280 = arg1;
        this.field1265.setSoTimeout(30000);
        this.field1265.setTcpNoDelay(true);
        this.field1271 = this.field1265.getInputStream();
        this.field1269 = this.field1265.getOutputStream();
    }
}
