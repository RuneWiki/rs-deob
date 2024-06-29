import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class90 {

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "I")
    private int field1389;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "[[I")
    private int[][] field1385;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
    private int field1381;

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "I")
    public static int field1387 = -2;

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "Z")
    public static boolean field1386 = false;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "[[S")
    public static short[][] field1384 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!ai", name = "m", descriptor = "Ljava/lang/String;")
    public static String field1393 = "Attack";

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "I")
    public static int field1388;

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!ai", name = "l", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)I")
    public final int method580(int arg0, int arg1) {
        if (this.field1385 != null) {
            arg1 = (int) ((long) this.field1389 * (long) arg1 / (long) this.field1381) + 6;
        }
        if (arg0 != 721512226) {
            this.method580(-97, 96);
        }
        field1382++;
        return arg1;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V")
    public static final void method581(int arg0) {
        field1388++;
        int var1 = class202.field3227.method736(class262.field4333);
        for (int var2 = 0; var2 < class18.field251; var2++) {
            int var6 = class202.field3227.method736(class11.method60(0, var2));
            if (var6 > var1) {
                var1 = var6;
            }
        }
        var1 += 8;
        int var3 = class18.field251 * 15 + 21;
        if (arg0 != 1) {
            return;
        }
        int var4 = class265.field4367 - (var1 / 2);
        int var5 = class262.field4331;
        if (var1 + var4 > class169.field2644) {
            var4 = class169.field2644 - var1;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        if ((var3 + var5) > class79.field1254) {
            var5 = class79.field1254 - var3;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (class145.field2280 != 1) {
            if (class265.field4367 == class199.field3158 && class262.field4331 == class218.field3483) {
                class248.field3950 = var5;
                class120.field1847 = var4;
                class307.field4990 = (class163.field2563 ? 26 : 22) + class18.field251 * 15;
                class220.field3525 = true;
                class145.field2280 = 0;
                class307.field4997 = var1;
                return;
            }
            class145.field2280 = 1;
            class230.field3686 = class199.field3158;
            class219.field3504 = class218.field3483;
        } else if (class265.field4367 == class230.field3686 && class262.field4331 == class219.field3504) {
            class248.field3950 = var5;
            class220.field3525 = true;
            class307.field4997 = var1;
            class120.field1847 = var4;
            class145.field2280 = 0;
            class307.field4990 = (class163.field2563 ? 26 : 22) + class18.field251 * 15;
            return;
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(II)I")
    public final int method582(int arg0, int arg1) {
        if (this.field1385 != null) {
            arg0 = (int) ((long) this.field1389 * (long) arg0 / (long) this.field1381);
        }
        if (arg1 <= 108) {
            this.field1389 = 46;
        }
        field1392++;
        return arg0;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "([BB)[B")
    public final byte[] method583(byte[] arg0, byte arg1) {
        if (arg1 <= 93) {
            this.method582(62, 87);
        }
        field1390++;
        if (this.field1385 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field1389 / (long) this.field1381) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                int[] var10 = this.field1385[var6];
                byte var11 = arg0[var7];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var10[var12] * var11;
                }
                int var13 = this.field1389 + var6;
                int var14 = var13 / this.field1381;
                var6 = var13 - this.field1381 * var14;
                var5 += var14;
            }
            arg0 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg0[var8] = -128;
                } else if (var9 > 127) {
                    arg0[var8] = 127;
                } else {
                    arg0[var8] = (byte) var9;
                }
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IZ)V")
    public static final void method584(int arg0, boolean arg1) {
        class13.field185 = null;
        class175.field2741 = null;
        if (arg1 && class13.field171 != null) {
            class27.field341 = class13.field171.field3464;
        } else {
            class27.field341 = -1;
        }
        field1383++;
        class194.field3071 = null;
        class13.field190 = null;
        class13.field171 = null;
        class13.field188 = null;
        class13.field187 = null;
        if (arg0 != 721512226) {
            method584(39, true);
        }
        class127.field1968 = 0;
        class13.field186 = null;
        class13.field179 = null;
        class13.field181 = null;
        class13.field182 = null;
        class13.field166.method1192((byte) 0);
        class226.field3583 = null;
        class3.field15 = null;
        class37.field485 = null;
        class31.field398 = null;
        class184.field2862 = -1;
        class79.field1245 = null;
        class212.field3386 = null;
        class120.field1849 = -1;
        class178.field2771 = null;
        class294.field4826 = null;
        class148.field2314 = null;
        class13.field167 = null;
        class27.method162(0);
        class211.field3385 = null;
        class75.field1183 = null;
        class145.field2289 = null;
        class171.method1128(128, false, 64);
        class274.method1908(64, arg0 - 721512227, 64);
        class138.method921(true, 64);
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)V")
    public static void method585(int arg0) {
        if (arg0 != -2) {
            field1391 = -8;
        }
        field1384 = null;
        field1393 = null;
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(II)V")
    public class90(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class72.method460(arg0, 28867, arg1);
            int var4 = arg1 / var3;
            this.field1389 = var4;
            int var5 = arg0 / var3;
            this.field1385 = new int[var5][14];
            this.field1381 = var5;
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field1385[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                double var10 = (double) var4 / (double) var5;
                int var12 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var12 < 0) {
                    var12 = 0;
                }
                int var13 = (int) Math.ceil(var8 + 7.0D);
                if (var13 > 14) {
                    var13 = 14;
                }
                while (var13 > var12) {
                    double var14 = ((double) var12 - var8) * 3.141592653589793D;
                    double var16 = var10;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var10 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var12 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var12] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var12++;
                }
            }
        }
    }
}
