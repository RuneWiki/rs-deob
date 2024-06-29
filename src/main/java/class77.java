import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class77 extends class145 {

    @OriginalMember(owner = "client!h", name = "A", descriptor = "Z")
    private boolean field1379 = false;

    @OriginalMember(owner = "client!h", name = "B", descriptor = "I")
    private int field1380 = 0;

    @OriginalMember(owner = "client!h", name = "t", descriptor = "I")
    private int field1372 = -32768;

    @OriginalMember(owner = "client!h", name = "E", descriptor = "I")
    private int field1383 = 0;

    @OriginalMember(owner = "client!h", name = "H", descriptor = "I")
    private int field1386;

    @OriginalMember(owner = "client!h", name = "R", descriptor = "I")
    public int field1396;

    @OriginalMember(owner = "client!h", name = "D", descriptor = "I")
    private int field1382;

    @OriginalMember(owner = "client!h", name = "V", descriptor = "I")
    private int field1400;

    @OriginalMember(owner = "client!h", name = "s", descriptor = "I")
    public int field1371;

    @OriginalMember(owner = "client!h", name = "L", descriptor = "I")
    public int field1390;

    @OriginalMember(owner = "client!h", name = "cb", descriptor = "I")
    public int field1407;

    @OriginalMember(owner = "client!h", name = "J", descriptor = "I")
    private int field1388;

    @OriginalMember(owner = "client!h", name = "W", descriptor = "I")
    private int field1401;

    @OriginalMember(owner = "client!h", name = "T", descriptor = "I")
    private int field1398;

    @OriginalMember(owner = "client!h", name = "I", descriptor = "I")
    public int field1387;

    @OriginalMember(owner = "client!h", name = "o", descriptor = "Lk;")
    private class109 field1367;

    @OriginalMember(owner = "client!h", name = "r", descriptor = "Li;")
    public static class88 field1370 = class208.method1425(105, " <col=ffff00>");

    @OriginalMember(owner = "client!h", name = "K", descriptor = "I")
    public static int field1389 = 0;

    @OriginalMember(owner = "client!h", name = "G", descriptor = "Li;")
    public static class88 field1385 = class208.method1425(105, "k");

    @OriginalMember(owner = "client!h", name = "y", descriptor = "Li;")
    public static class88 field1377 = class208.method1425(105, "Ladevorgang )2 bitte warten Sie)3");

    @OriginalMember(owner = "client!h", name = "S", descriptor = "[Lea;")
    public static class46[] field1397 = new class46[2048];

    @OriginalMember(owner = "client!h", name = "Y", descriptor = "Li;")
    public static class88 field1403 = class208.method1425(105, "blinken3:");

    @OriginalMember(owner = "client!h", name = "F", descriptor = "I")
    public static int field1384 = 0;

    @OriginalMember(owner = "client!h", name = "P", descriptor = "I")
    public static int field1394 = 0;

    @OriginalMember(owner = "client!h", name = "u", descriptor = "D")
    private double field1373;

    @OriginalMember(owner = "client!h", name = "v", descriptor = "D")
    private double field1374;

    @OriginalMember(owner = "client!h", name = "w", descriptor = "D")
    public double field1375;

    @OriginalMember(owner = "client!h", name = "z", descriptor = "D")
    private double field1378;

    @OriginalMember(owner = "client!h", name = "M", descriptor = "D")
    public double field1391;

    @OriginalMember(owner = "client!h", name = "N", descriptor = "D")
    private double field1392;

    @OriginalMember(owner = "client!h", name = "Q", descriptor = "D")
    private double field1395;

    @OriginalMember(owner = "client!h", name = "bb", descriptor = "D")
    public double field1406;

    @OriginalMember(owner = "client!h", name = "n", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!h", name = "p", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!h", name = "q", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!h", name = "x", descriptor = "I")
    private int field1376;

    @OriginalMember(owner = "client!h", name = "C", descriptor = "I")
    public int field1381;

    @OriginalMember(owner = "client!h", name = "O", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!h", name = "U", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!h", name = "X", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!h", name = "Z", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!h", name = "ab", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ILu;I)V")
    public static final void method514(int arg0, class218 arg1, int arg2) {
        field1404++;
        if (arg1.field4135 > class117.field2115) {
            class109.method758(arg1, (byte) 12);
        } else if (arg1.field4132 < class117.field2115) {
            class244.method1602(arg1, 33);
        } else {
            class211.method1446(arg1, -1);
        }
        if (arg1.field4138 < 128 || arg1.field4123 < 128 || arg1.field4138 >= 13184 || arg1.field4123 >= 13184) {
            arg1.field4123 = arg1.field4143[0] * 128 + arg1.field4105 * 64;
            arg1.field4138 = arg1.field4089[0] * 128 + arg1.field4105 * 64;
            arg1.field4132 = 0;
            arg1.field4082 = -1;
            arg1.field4135 = 0;
            arg1.field4079 = -1;
            arg1.method1480(arg2 - 24480);
        }
        if (class240.field4458 == arg1 && (arg1.field4138 < 1536 || arg1.field4123 < 1536 || arg1.field4138 >= 11776 || arg1.field4123 >= 11776)) {
            arg1.field4082 = -1;
            arg1.field4132 = 0;
            arg1.field4135 = 0;
            arg1.field4123 = arg1.field4143[0] * 128 + arg1.field4105 * 64;
            arg1.field4079 = -1;
            arg1.field4138 = arg1.field4089[0] * 128 + arg1.field4105 * 64;
            arg1.method1480(70);
        }
        class18.method86(arg1, true);
        class104.method723(arg1, arg2 ^ arg2);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V")
    public static void method515(byte arg0) {
        field1377 = null;
        field1385 = null;
        if (arg0 == 72) {
            field1403 = null;
            field1370 = null;
            field1397 = null;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIZZZZ)Lrc;")
    public static final class188 method516(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7) {
        field1369++;
        class149 var8 = class71.method472(arg0, (byte) -107);
        if (arg1 > 1 && var8.field2905 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg1 >= var8.field2847[var10] && var8.field2847[var10] != 0) {
                    var9 = var8.field2905[var10];
                }
            }
            if (var9 != -1) {
                var8 = class71.method472(var9, (byte) -108);
            }
        }
        class125 var11 = var8.method1010(true);
        if (var11 == null) {
            return null;
        }
        class169 var12 = null;
        if (var8.field2869 != -1) {
            var12 = (class169) method516(var8.field2843, 10, 0, 1, true, true, true, false);
            if (var12 == null) {
                return null;
            }
        } else if (var8.field2886 != -1) {
            var12 = (class169) method516(var8.field2876, arg1, arg2, arg3, true, false, true, false);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = class72.field1331;
        int var14 = class72.field1333;
        int var15 = class72.field1337;
        int[] var16 = new int[4];
        class72.method486(var16);
        class169 var17 = new class169(36, 32);
        class72.method496(var17.field3249, 36, 32);
        class173.method1237();
        class173.method1230(16, 16);
        int var18 = var8.field2891;
        if (arg5) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg3 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        class173.field3357 = false;
        int var19 = class173.field3356[var8.field2875] * var18 >> 16;
        int var20 = class173.field3361[var8.field2875] * var18 >> 16;
        var11.method193(0, var8.field2874, var8.field2849, var8.field2875, var8.field2878, var20 + var8.field2872 - var11.method88() / 2, var8.field2872 + var19);
        if (arg3 >= 1) {
            var17.method1170(1);
            if (arg3 >= 2) {
                var17.method1170(16777215);
            }
            class72.method496(var17.field3249, 36, 32);
        }
        if (arg2 != 0) {
            var17.method1156(arg2);
        }
        if (var8.field2869 != -1) {
            var12.method1157(0, 0);
        } else if (var8.field2886 != -1) {
            class72.method496(var12.field3249, 36, 32);
            var17.method1157(0, 0);
            var17 = var12;
        }
        if (arg7 && (var8.field2854 == 1 || arg1 != 1) && arg1 != -1) {
            class180.field3573.method154(class133.method891(arg1, 100000), 0, 9, 16776960, 1);
        }
        class72.method496(var13, var14, var15);
        class72.method494(var16);
        class173.method1237();
        class173.field3357 = arg4;
        return var17;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II)V")
    public final void method517(int arg0, int arg1) {
        field1366++;
        this.field1379 = true;
        this.field1375 += this.field1395 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field1378;
        this.field1406 += (double) arg1 * this.field1392;
        if (arg0 != 0) {
            field1377 = null;
        }
        this.field1391 += (double) arg1 * this.field1373;
        this.field1378 += (double) arg1 * this.field1395;
        this.field1381 = (int) (Math.atan2(this.field1392, this.field1373) * 325.949D) + 1024 & 0x7FF;
        this.field1376 = (int) (Math.atan2(this.field1378, this.field1374) * 325.949D) & 0x7FF;
        if (this.field1367 == null) {
            return;
        }
        this.field1380 += arg1;
        while (true) {
            do {
                do {
                    if (this.field1380 <= this.field1367.field1992[this.field1383]) {
                        return;
                    }
                    this.field1380 -= this.field1367.field1992[this.field1383];
                    this.field1383++;
                } while (this.field1383 < this.field1367.field1967.length);
                this.field1383 -= this.field1367.field1974;
            } while (this.field1383 >= 0 && this.field1367.field1967.length > this.field1383);
            this.field1383 = 0;
        }
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(I)Lcg;")
    private final class30 method518(int arg0) {
        field1402++;
        if (arg0 != 1) {
            return null;
        }
        class33 var2 = class62.method441(this.field1400, (byte) 49);
        class30 var3 = var2.method209(this.field1383, (byte) -51);
        if (var3 == null) {
            return null;
        } else {
            var3.method197(this.field1376);
            return var3;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field1405++;
        class30 var11 = this.method518(1);
        if (var11 != null) {
            var11.method87(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field1372 = var11.method88();
        }
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(I)V")
    public static final void method519(int arg0) {
        class179.field3560.method671(99);
        field1399++;
        class60.field1123.method134(50);
        if (arg0 < -54) {
            class80.field1442.method134(50);
            class47.field879.method134(50);
        }
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "()I")
    public final int method88() {
        field1393++;
        return this.field1372;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIII)V")
    public final void method520(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1368++;
        if (!this.field1379) {
            double var6 = (double) (arg4 - this.field1401);
            double var8 = (double) (arg0 - this.field1398);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field1406 = (double) this.field1386 * var8 / var10 + (double) this.field1398;
            this.field1391 = (double) this.field1386 * var6 / var10 + (double) this.field1401;
            this.field1375 = this.field1388;
        }
        double var12 = (double) (this.field1407 + 1 - arg1);
        if (arg3 != -14596) {
            this.field1401 = -50;
        }
        this.field1373 = ((double) arg4 - this.field1391) / var12;
        this.field1392 = ((double) arg0 - this.field1406) / var12;
        this.field1374 = Math.sqrt(this.field1392 * this.field1392 + this.field1373 * this.field1373);
        if (!this.field1379) {
            this.field1378 = -this.field1374 * Math.tan((double) this.field1382 * 0.02454369D);
        }
        this.field1395 = ((double) arg2 - this.field1375 - this.field1378 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class77(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1386 = arg8;
        this.field1396 = arg10;
        this.field1382 = arg7;
        this.field1400 = arg0;
        this.field1371 = arg5;
        this.field1390 = arg1;
        this.field1407 = arg6;
        this.field1388 = arg4;
        this.field1379 = false;
        this.field1401 = arg3;
        this.field1398 = arg2;
        this.field1387 = arg9;
        int var12 = class62.method441(this.field1400, (byte) 38).field542;
        if (var12 == -1) {
            this.field1367 = null;
        } else {
            this.field1367 = class15.method75(var12, (byte) 76);
        }
    }
}
