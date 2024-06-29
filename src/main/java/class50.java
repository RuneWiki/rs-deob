import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class50 extends class59 {

    @OriginalMember(owner = "client!ic", name = "F", descriptor = "[J")
    private long[] field1277 = new long[10];

    @OriginalMember(owner = "client!ic", name = "w", descriptor = "Z")
    public static boolean field1268 = true;

    @OriginalMember(owner = "client!ic", name = "s", descriptor = "I")
    public static int field1264 = 0;

    @OriginalMember(owner = "client!ic", name = "H", descriptor = "Lba;")
    public static class7 field1278 = new class7(30);

    @OriginalMember(owner = "client!ic", name = "M", descriptor = "I")
    public static int field1283 = 0;

    @OriginalMember(owner = "client!ic", name = "N", descriptor = "[I")
    public static int[] field1284 = new int[256];

    @OriginalMember(owner = "client!ic", name = "O", descriptor = "Z")
    public static boolean field1285 = false;

    @OriginalMember(owner = "client!ic", name = "P", descriptor = "Lgd;")
    public static class40 field1286 = class14.method90(false, "l");

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!ic", name = "q", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!ic", name = "r", descriptor = "I")
    private int field1263;

    @OriginalMember(owner = "client!ic", name = "t", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!ic", name = "u", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!ic", name = "v", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!ic", name = "x", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!ic", name = "y", descriptor = "I")
    private int field1270;

    @OriginalMember(owner = "client!ic", name = "z", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!ic", name = "A", descriptor = "I")
    private int field1272;

    @OriginalMember(owner = "client!ic", name = "B", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!ic", name = "C", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!ic", name = "D", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!ic", name = "E", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!ic", name = "K", descriptor = "I")
    private int field1281;

    @OriginalMember(owner = "client!ic", name = "I", descriptor = "J")
    private long field1279;

    @OriginalMember(owner = "client!ic", name = "L", descriptor = "Lw;")
    public static class135 field1282;

    @OriginalMember(owner = "client!ic", name = "J", descriptor = "[B")
    public static byte[] field1280;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(III)I", line = 11)
    public final int method231(int arg0, int arg1, int arg2) {
        field1273++;
        int var4 = this.field1281;
        this.field1281 = 300;
        int var5 = this.field1263;
        this.field1263 = 1;
        this.field1279 = class98.method683(0);
        if (this.field1277[this.field1270] == 0L) {
            this.field1263 = var5;
            this.field1281 = var4;
        } else if (this.field1279 > this.field1277[this.field1270]) {
            this.field1281 = (int) ((long) (arg1 * 2560) / (this.field1279 - this.field1277[this.field1270]));
        }
        if (this.field1281 < 25) {
            this.field1281 = 25;
        }
        if (this.field1281 > 256) {
            this.field1281 = 256;
            this.field1263 = (int) ((long) arg1 - (this.field1279 - this.field1277[this.field1270]) / 10L);
        }
        if (arg1 < this.field1263) {
            this.field1263 = arg1;
        }
        this.field1277[this.field1270] = this.field1279;
        this.field1270 = (this.field1270 + 1) % 10;
        if (this.field1263 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field1277[var6] != 0L) {
                    this.field1277[var6] -= -((long) this.field1263);
                }
            }
        }
        if (this.field1263 < arg2) {
            this.field1263 = arg2;
        }
        class51.method400((byte) -6, (long) this.field1263);
        int var7 = -39 / ((arg0 - 16) / 52);
        int var8 = 0;
        while (this.field1272 < 256) {
            this.field1272 += this.field1281;
            var8++;
        }
        this.field1272 &= 0xFF;
        return var8;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)V", line = 82)
    public static final void method387(int arg0, int arg1) {
        field1274++;
        if (arg1 == -1 || !class94.method638(arg1, 0)) {
            return;
        }
        class30[] var2 = class129.field3093[arg1];
        int var3 = 0;
        if (arg0 <= 81) {
            method389(false);
        }
        while (var3 < var2.length) {
            class30 var4 = var2[var3];
            if (var4.field738 != null) {
                class45.method312(var4.field738, 0, 0, var4, 68, 0);
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I[BBI)Lgd;", line = 119)
    public static final class40 method388(int arg0, byte[] arg1, byte arg2, int arg3) {
        field1269++;
        class40 var4 = new class40();
        var4.field948 = new byte[arg0];
        var4.field950 = 0;
        for (int var5 = arg3; var5 < arg3 + arg0; var5++) {
            if (arg1[var5] != 0) {
                var4.field948[var4.field950++] = arg1[var5];
            }
        }
        if (arg2 != -51) {
            field1285 = false;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(Z)V", line = 149)
    public static final void method389(boolean arg0) {
        for (int var1 = 0; var1 < class132.field3210; var1++) {
            int var10002 = class10.field258[var1]--;
            if (class10.field258[var1] >= -10) {
                class81 var3 = class65.field1576[var1];
                if (var3 == null) {
                    var3 = class81.method540(class41.field1016, class87.field1954[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class10.field258[var1] += var3.method538();
                    class65.field1576[var1] = var3;
                }
                if (class10.field258[var1] < 0) {
                    int var4;
                    if (class131.field3177[var1] == 0) {
                        var4 = class114.field2746;
                    } else {
                        int var5 = class131.field3177[var1] >> 16 & 0xFF;
                        int var6 = var5 * 128 + 64 - class13.field332.field792;
                        int var7 = (class131.field3177[var1] & 0xFF) * 128;
                        if (var6 < 0) {
                            var6 = -var6;
                        }
                        int var8 = class131.field3177[var1] >> 8 & 0xFF;
                        int var9 = var8 * 128 + 64 - class13.field332.field838;
                        if (var9 < 0) {
                            var9 = -var9;
                        }
                        int var10 = var6 + var9 - 128;
                        if (var7 < var10) {
                            class10.field258[var1] = -100;
                            continue;
                        }
                        if (var10 < 0) {
                            var10 = 0;
                        }
                        var4 = (var7 - var10) * class125.field2954 / var7;
                    }
                    class119 var11 = var3.method539().method908(class93.field2148);
                    class57 var12 = class57.method426(var11, 100, var4);
                    var12.method420(class52.field1329[var1] - 1);
                    class14.field362.method175(var12);
                    class10.field258[var1] = -100;
                }
            } else {
                class132.field3210--;
                for (int var2 = var1; var2 < class132.field3210; var2++) {
                    class87.field1954[var2] = class87.field1954[var2 + 1];
                    class65.field1576[var2] = class65.field1576[var2 + 1];
                    class52.field1329[var2] = class52.field1329[var2 + 1];
                    class10.field258[var2] = class10.field258[var2 + 1];
                    class131.field3177[var2] = class131.field3177[var2 + 1];
                }
                var1--;
            }
        }
        if (arg0) {
            field1286 = null;
        }
        field1275++;
        if (class94.field2178 <= 0) {
            return;
        }
        class94.field2178 -= 20;
        if (class94.field2178 < 0) {
            class94.field2178 = 0;
        }
        if (class94.field2178 == 0 && class16.field418 != 0 && class137.field3362 != -1) {
            class94.method642(false, (byte) -119, class16.field418, 0, class137.field3362, 0, field1282);
            return;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V", line = 268)
    public static final void method390(byte arg0) {
        field1265++;
        class88.field1986++;
        class92.field2094.method290((byte) 0, 46);
        int var1 = -64 % ((arg0 + 52) / 48);
        if (class18.field440 != -1) {
            class130.method1030(class18.field440, (byte) -47);
            class45.field1124 = true;
            class79.field1820 = true;
            class56.field1447 = -1;
            class18.field440 = -1;
        }
        if (class108.field2624 != -1) {
            class130.method1030(class108.field2624, (byte) -92);
            class122.field2880 = true;
            class108.field2624 = -1;
            class56.field1447 = -1;
        }
        if (class94.field2161 != -1) {
            class130.method1030(class94.field2161, (byte) -126);
            class94.field2161 = -1;
            class106.method822(true, 30);
        }
        if (class103.field2493 != -1) {
            class130.method1030(class103.field2493, (byte) -91);
            class103.field2493 = -1;
        }
        if (class131.field3169 != -1) {
            class130.method1030(class131.field3169, (byte) -57);
            class56.field1447 = -1;
            class131.field3169 = -1;
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V", line = 320)
    public final void method233(int arg0) {
        this.field1272 = 0;
        field1276++;
        this.field1263 = 1;
        this.field1281 = 256;
        this.field1279 = class98.method683(arg0);
        for (int var2 = 0; var2 < 10; var2++) {
            this.field1277[var2] = this.field1279;
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(B)V", line = 351)
    public static final void method391(byte arg0) {
        int var1 = -53 % ((71 - arg0) / 53);
        field1267++;
        if (class80.field1841 != 1) {
            return;
        }
        if (class132.field3191 >= 6 && class132.field3191 <= 106 && class90.field2041 >= 467 && class90.field2041 <= 499) {
            class1.field23 = (class1.field23 + 1) % 4;
            class122.field2880 = true;
            class131.field3175++;
            class90.field2030 = true;
            class92.field2094.method290((byte) 0, 96);
            class92.field2094.method756(class1.field23, 1);
            class92.field2094.method756(class94.field2163, 1);
            class92.field2094.method756(class76.field1765, 1);
        }
        if (class132.field3191 >= 135 && class132.field3191 <= 235 && class90.field2041 >= 467 && class90.field2041 <= 499) {
            class90.field2030 = true;
            class122.field2880 = true;
            class94.field2163 = (class94.field2163 + 1) % 3;
            class131.field3175++;
            class92.field2094.method290((byte) 0, 96);
            class92.field2094.method756(class1.field23, 1);
            class92.field2094.method756(class94.field2163, 1);
            class92.field2094.method756(class76.field1765, 1);
        }
        if (class132.field3191 >= 273 && class132.field3191 <= 373 && class90.field2041 >= 467 && class90.field2041 <= 499) {
            class122.field2880 = true;
            class131.field3175++;
            class90.field2030 = true;
            class76.field1765 = (class76.field1765 + 1) % 3;
            class92.field2094.method290((byte) 0, 96);
            class92.field2094.method756(class1.field23, 1);
            class92.field2094.method756(class94.field2163, 1);
            class92.field2094.method756(class76.field1765, 1);
        }
        if (class132.field3191 < 412 || class132.field3191 > 512 || class90.field2041 < 467 || class90.field2041 > 499) {
            return;
        }
        if (class131.field3169 != -1) {
            class77.method521(class125.field2966, class67.field1648, false, 0);
            return;
        }
        method390((byte) -110);
        if (class136.field3331 != -1) {
            class125.field2958 = class125.field2966;
            class40.field999 = false;
            class66.field1627 = class131.field3169 = class136.field3331;
            return;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Throwable;)V", line = 421)
    public static final void method392(int arg0, String arg1, Throwable arg2) {
        field1261++;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class106.method821((byte) -22, arg2);
            }
            if (arg1 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            if (arg0 < 38) {
                method391((byte) 99);
            }
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            class123 var8 = class98.field2315.method717(new URL(class98.field2315.field2435.getCodeBase(), "clienterror.ws?c=" + class113.field2732 + "&u=" + class49.field1237 + "&v1=" + class102.field2428 + "&v2=" + class102.field2430 + "&e=" + var7), false);
            while (var8.field2885 == 0) {
                class51.method400((byte) -128, 1L);
            }
            if (var8.field2885 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field2887;
                var9.read();
                var9.close();
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(Z)V", line = 477)
    public final void method232(boolean arg0) {
        int var2 = 0;
        if (arg0) {
            return;
        }
        while (var2 < 10) {
            this.field1277[var2] = 0L;
            var2++;
        }
        field1271++;
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "(I)V", line = 498)
    public static void method393(int arg0) {
        field1282 = null;
        field1284 = null;
        field1278 = null;
        field1286 = null;
        if (arg0 != -1) {
            method389(false);
        }
        field1280 = null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIII)I", line = 514)
    public static final int method394(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 5480) {
            return -102;
        }
        int var4 = arg2 & 0x3;
        field1262++;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 7 - arg1;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "()V", line = 542)
    public class50() {
        this.method233(0);
    }
}
