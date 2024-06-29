import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class92 extends class300 {

    @OriginalMember(owner = "client!sl", name = "N", descriptor = "I")
    private int field1376 = 0;

    @OriginalMember(owner = "client!sl", name = "H", descriptor = "I")
    private int field1370 = 0;

    @OriginalMember(owner = "client!sl", name = "M", descriptor = "I")
    private int field1375 = 0;

    @OriginalMember(owner = "client!sl", name = "P", descriptor = "[I")
    public static int[] field1378 = new int[500];

    @OriginalMember(owner = "client!sl", name = "V", descriptor = "[Lqk;")
    public static class57[] field1383 = new class57[14];

    @OriginalMember(owner = "client!sl", name = "U", descriptor = "I")
    public static int field1382 = 0;

    @OriginalMember(owner = "client!sl", name = "I", descriptor = "I")
    public static int field1371 = 0;

    @OriginalMember(owner = "client!sl", name = "Y", descriptor = "[I")
    public static int[] field1386 = new int[5];

    @OriginalMember(owner = "client!sl", name = "F", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!sl", name = "G", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!sl", name = "J", descriptor = "I")
    private int field1372;

    @OriginalMember(owner = "client!sl", name = "K", descriptor = "I")
    private int field1373;

    @OriginalMember(owner = "client!sl", name = "L", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!sl", name = "O", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!sl", name = "Q", descriptor = "I")
    private int field1379;

    @OriginalMember(owner = "client!sl", name = "S", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!sl", name = "T", descriptor = "I")
    private int field1381;

    @OriginalMember(owner = "client!sl", name = "W", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!sl", name = "X", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!sl", name = "Z", descriptor = "I")
    private int field1387;

    @OriginalMember(owner = "client!sl", name = "ab", descriptor = "I")
    public static int field1388;

    @OriginalMember(owner = "client!sl", name = "bb", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!sl", name = "cb", descriptor = "I")
    private int field1390;

    @OriginalMember(owner = "client!sl", name = "db", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!sl", name = "eb", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "()V")
    public class92() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "(B)Lff;")
    public static final class48 method624(byte arg0) {
        if (arg0 <= 8) {
            method624((byte) 88);
        }
        ++field1384;
        int var1 = class64.field924[0] * class284.field4603[0];
        byte[] var2 = class190.field2959[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; ~var4 > ~var1; ++var4) {
            var3[var4] = class229.field3539[class205.method1411(255, var2[var4])];
        }
        class48 var5 = new class48(class15.field215, class86.field1308, class166.field2569[0], class277.field4480[0], class64.field924[0], class284.field4603[0], var3);
        class115.method762((byte) -97);
        return var5;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIZ)Ljava/lang/String;")
    public static final String method625(int arg0, int arg1, boolean arg2) {
        ++field1374;
        if (arg0 != 0) {
            field1382 = 53;
        }
        return arg2 && ~arg1 <= -1 ? class243.method1735(10, arg2, arg1, true) : Integer.toString(arg1);
    }

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "(B)V")
    public static final void method626(byte arg0) {
        int var1 = 73 / ((arg0 - -16) / 37);
        for (int var2 = 0; var2 < 100; ++var2) {
            class302.field4808[var2] = true;
        }
        ++field1380;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Z)V")
    public static void method627(boolean arg0) {
        field1386 = null;
        if (!arg0) {
            field1369 = -86;
        }
        field1383 = null;
        field1378 = null;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIII)V")
    private final void method628(int arg0, int arg1, int arg2, int arg3) {
        ++field1392;
        int var5 = arg2 <= arg3 ? arg3 : arg2;
        int var6 = ~arg2 <= ~arg3 ? arg3 : arg2;
        if (arg0 <= -70) {
            int var7 = ~var5 <= ~arg1 ? var5 : arg1;
            int var8 = var6 <= arg1 ? var6 : arg1;
            this.field1387 = (var8 - -var7) / 2;
            int var9 = -var8 + var7;
            if (this.field1387 > 0 && this.field1387 < 4096) {
                this.field1390 = (var9 << 12) / (this.field1387 > 2048 ? -(this.field1387 * 2) + 8192 : this.field1387 * 2);
            } else {
                this.field1390 = 0;
            }
            if (var9 > 0) {
                int var10 = (-arg3 + var7 << 12) / var9;
                int var11 = (-arg2 + var7 << 12) / var9;
                int var12 = (-arg1 + var7 << 12) / var9;
                if (~arg2 == ~var7) {
                    this.field1372 = ~arg3 == ~var8 ? var12 + 20480 : 4096 - var10;
                } else if (arg3 != var7) {
                    this.field1372 = ~arg2 != ~var8 ? 20480 - var11 : var10 + 12288;
                } else {
                    this.field1372 = arg1 == var8 ? 4096 - -var11 : -var12 + 12288;
                }
                this.field1372 /= 6;
            } else {
                this.field1372 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(II)[[I")
    public final int[][] method36(int arg0, int arg1) {
        int[][] var3 = super.field4786.method538(arg1, (byte) 104);
        int var4 = 105 % (arg0 / 47);
        ++field1389;
        if (super.field4786.field1200) {
            int[][] var5 = this.method2021(arg1, false, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[2];
            int[] var8 = var3[0];
            int[] var9 = var5[1];
            int[] var10 = var3[1];
            int[] var11 = var3[2];
            for (int var12 = 0; ~var12 > ~class180.field2826; ++var12) {
                this.method628(-84, var7[var12], var6[var12], var9[var12]);
                this.field1372 += this.field1375;
                this.field1387 += this.field1370;
                this.field1390 += this.field1376;
                if (~this.field1390 > -1) {
                    this.field1390 = 0;
                }
                while (~this.field1372 > -1) {
                    this.field1372 += 4096;
                }
                while (this.field1372 > 4096) {
                    this.field1372 -= 4096;
                }
                if (~this.field1390 < -4097) {
                    this.field1390 = 4096;
                }
                if (~this.field1387 > -1) {
                    this.field1387 = 0;
                }
                if (this.field1387 > 4096) {
                    this.field1387 = 4096;
                }
                this.method631(this.field1372, this.field1387, (byte) 6, this.field1390);
                var8[var12] = this.field1379;
                var10[var12] = this.field1373;
                var11[var12] = this.field1381;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "(II)Lfl;")
    public static final class214 method629(int arg0, int arg1) {
        ++field1388;
        class214 var2 = (class214) class68.field1011.method1517((long) arg0, (byte) -125);
        if (var2 != null) {
            return var2;
        } else if (arg1 != 12288) {
            return null;
        } else {
            byte[] var3 = class41.field497.method501(-2, class81.method548(arg0, arg1 ^ 12543), class252.method1796(arg0, 121));
            class214 var4 = new class214();
            var4.field3348 = arg0;
            if (var3 != null) {
                var4.method1495((byte) 31, new class170(var3));
            }
            class68.field1011.method1518(var4, (long) arg0, (byte) 75);
            return var4;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IZLvl;I)Lca;")
    public static final class91 method630(int arg0, boolean arg1, class73 arg2, int arg3) {
        ++field1391;
        if (!class135.method862(arg0, arg3, (byte) -39, arg2)) {
            return null;
        } else {
            return !arg1 ? null : class135.method860((byte) -95);
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIBI)V")
    private final void method631(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 == 6) {
            int var5 = arg1 <= 2048 ? (arg3 + 4096) * arg1 >> 12 : arg1 + arg3 - (arg1 * arg3 >> 12);
            ++field1368;
            if (var5 > 0) {
                int var6 = arg0 * 6;
                int var7 = arg1 + arg1 + -var5;
                int var8 = var6 >> 12;
                int var9 = -(var8 << 12) + var6;
                int var11 = (-var7 + var5 << 12) / var5;
                int var12 = var5 * var11 >> 12;
                int var13 = var9 * var12 >> 12;
                int var14 = -var13 + var5;
                int var15 = var7 + var13;
                if (var8 == 0) {
                    this.field1381 = var7;
                    this.field1379 = var5;
                    this.field1373 = var15;
                    return;
                }
                if (~var8 == -2) {
                    this.field1381 = var7;
                    this.field1379 = var14;
                    this.field1373 = var5;
                    return;
                }
                if (var8 == 2) {
                    this.field1381 = var15;
                    this.field1373 = var5;
                    this.field1379 = var7;
                    return;
                }
                if (~var8 == -4) {
                    this.field1373 = var14;
                    this.field1381 = var5;
                    this.field1379 = var7;
                    return;
                }
                if (var8 == 4) {
                    this.field1381 = var5;
                    this.field1373 = var7;
                    this.field1379 = var15;
                    return;
                }
                if (var8 == 5) {
                    this.field1373 = var7;
                    this.field1381 = var14;
                    this.field1379 = var5;
                    return;
                }
            } else {
                this.field1379 = this.field1373 = this.field1381 = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lim;BI)V")
    public final void method35(class170 arg0, byte arg1, int arg2) {
        if (arg1 > -43) {
            this.method631(-70, -65, (byte) 42, -8);
        }
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    this.field1370 = (arg0.method1215(128) << 12) / 100;
                }
            } else {
                this.field1376 = (arg0.method1215(128) << 12) / 100;
            }
        } else {
            this.field1375 = arg0.method1193(-1);
        }
        ++field1377;
    }
}
