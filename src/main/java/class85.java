import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class85 {

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "Ldi;")
    private class111 field1452;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "Llj;")
    private class26 field1458;

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "Lli;")
    private class243 field1460;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "Lph;")
    private static class229 field1455 = class266.method1858("Please remove ", 0);

    @OriginalMember(owner = "client!jk", name = "q", descriptor = "[S")
    public static short[] field1468 = new short[] { 2, 23, 38, 7, 11, 13, 40, 9 };

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "[I")
    public static int[] field1454 = new int[2500];

    @OriginalMember(owner = "client!jk", name = "p", descriptor = "Z")
    public static boolean field1467 = true;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "Lph;")
    public static class229 field1456 = field1455;

    @OriginalMember(owner = "client!jk", name = "t", descriptor = "Lph;")
    public static class229 field1471 = class266.method1858("mapfunction", 0);

    @OriginalMember(owner = "client!jk", name = "o", descriptor = "Lph;")
    public static class229 field1466 = field1455;

    @OriginalMember(owner = "client!jk", name = "k", descriptor = "F")
    public static float field1462;

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!jk", name = "l", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!jk", name = "n", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!jk", name = "r", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!jk", name = "s", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!jk", name = "u", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!jk", name = "w", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "Lhb;")
    private class164 field1459;

    @OriginalMember(owner = "client!jk", name = "m", descriptor = "[Ljm;")
    public static class134[] field1464;

    @OriginalMember(owner = "client!jk", name = "v", descriptor = "[Lh;")
    private class237[] field1473;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIIII)V", line = 5)
    public static final void method626(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        field1469++;
        int var7 = arg1;
        int var8 = arg2 * arg2;
        int var9 = arg1 * arg1;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg1 << 1;
        int var13 = var9 - ((var12 - 1) * var11);
        int var14 = var8 << 2;
        int var15 = (1 - var12) * var8 + var10;
        int var16 = ((var6 << 1) + 3) * var10;
        int var17 = ((arg1 << 1) - 3) * var11;
        int var18 = var9 << 2;
        if (arg0 != -8348) {
            return;
        }
        int var19 = (arg1 - 1) * var14;
        if (arg3 >= class206.field3398 && class214.field3533 >= arg3) {
            int var20 = class178.method1278(class77.field1289, arg2 + arg4, -18842, class192.field3172);
            int var21 = class178.method1278(class77.field1289, arg4 - arg2, arg0 ^ 0x6902, class192.field3172);
            class193.method1354((byte) -37, var20, var21, arg5, class202.field3337[arg3]);
        }
        int var22 = (var6 + 1) * var18;
        while (var7 > 0) {
            var7--;
            int var23 = arg3 - var7;
            if (var15 < 0) {
                while (var15 < 0) {
                    var13 += var22;
                    var15 += var16;
                    var6++;
                    var16 += var18;
                    var22 += var18;
                }
            }
            if (var13 < 0) {
                var13 += var22;
                var22 += var18;
                var15 += var16;
                var16 += var18;
                var6++;
            }
            int var24 = arg3 + var7;
            var13 += -var17;
            var17 -= var14;
            var15 += -var19;
            var19 -= var14;
            if (class206.field3398 <= var24 && class214.field3533 >= var23) {
                int var25 = class178.method1278(class77.field1289, arg4 + var6, -18842, class192.field3172);
                int var26 = class178.method1278(class77.field1289, arg4 - var6, arg0 ^ 0x6902, class192.field3172);
                if (var23 >= class206.field3398) {
                    class193.method1354((byte) -37, var25, var26, arg5, class202.field3337[var23]);
                }
                if (var24 <= class214.field3533) {
                    class193.method1354((byte) -37, var25, var26, arg5, class202.field3337[var24]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Z)Z", line = 106)
    public final boolean method627(boolean arg0) {
        field1472++;
        if (this.field1459 != null) {
            return true;
        }
        if (this.field1460 == null) {
            if (this.field1458.method167((byte) 111)) {
                return false;
            }
            this.field1460 = this.field1458.method166(true, 255, 20, (byte) 0, 255);
        }
        if (this.field1460.field725) {
            return false;
        }
        this.field1459 = new class164(this.field1460.method323(16777215));
        if (arg0) {
            return false;
        } else {
            this.field1473 = new class237[(this.field1459.field2668.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIZJ)Lph;", line = 141)
    public static final class229 method628(int arg0, int arg1, boolean arg2, long arg3) {
        field1463++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        int var5 = 1;
        if (arg0 != 255) {
            return (class229) null;
        }
        long var6 = arg3 / (long) arg1;
        while (var6 != 0L) {
            var6 /= (long) arg1;
            var5++;
        }
        int var8 = var5;
        if (arg3 < 0L || arg2) {
            var8 = var5 + 1;
        }
        byte[] var9 = new byte[var8];
        if (arg3 < 0L) {
            var9[0] = 45;
        } else if (arg2) {
            var9[0] = 43;
        }
        for (int var10 = 0; var10 < var5; var10++) {
            int var11 = (int) (arg3 % (long) arg1);
            arg3 /= (long) arg1;
            if (var11 < 0) {
                var11 = -var11;
            }
            if (var11 > 9) {
                var11 += 39;
            }
            var9[var8 - var10 - 1] = (byte) (var11 + 48);
        }
        class229 var12 = new class229();
        var12.field3772 = var9;
        var12.field3785 = var8;
        return var12;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ILkh;ILkh;)Lh;", line = 202)
    public final class237 method629(int arg0, class250 arg1, int arg2, class250 arg3) {
        field1474++;
        if (arg0 != 5100) {
            this.field1459 = (class164) null;
        }
        return this.method630(true, arg3, arg0 + 586, arg1, arg2);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ZLkh;ILkh;I)Lh;", line = 213)
    private final class237 method630(boolean arg0, class250 arg1, int arg2, class250 arg3, int arg4) {
        field1453++;
        if (this.field1459 == null) {
            throw new RuntimeException();
        }
        this.field1459.field2670 = arg4 * 8 + 5;
        if (this.field1459.field2668.length <= this.field1459.field2670) {
            throw new RuntimeException();
        } else if (this.field1473[arg4] == null) {
            if (arg2 != 5686) {
                this.method629(21, (class250) null, 104, (class250) null);
            }
            int var6 = this.field1459.method1191(31776);
            int var7 = this.field1459.method1191(arg2 + 26090);
            class237 var8 = new class237(arg4, arg1, arg3, this.field1458, this.field1452, var6, var7, arg0);
            this.field1473[arg4] = var8;
            return var8;
        } else {
            return this.field1473[arg4];
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "([[I[[FBLqj;[[FBIIIIIIZ[[FII)V", line = 259)
    public static final void method631(int[][] arg0, float[][] arg1, byte arg2, class264 arg3, float[][] arg4, byte arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, float[][] arg13, int arg14, int arg15) {
        field1465++;
        int var16 = (arg6 << 8) + 255;
        int var17 = (arg7 << 8) + 255;
        int var18 = (arg14 << 8) + 255;
        int var19 = (arg10 << 8) + 255;
        int[] var20 = class192.field3179[arg5];
        int[] var21 = new int[var20.length >> 1];
        for (int var22 = arg15; var22 < var21.length; var22++) {
            var21[var22] = class161.method1137(arg1, arg4, arg3, var20[var22 + var22 + 1], 0.0F, arg11, arg0, arg13, var18, false, -2, arg2, var17, var20[var22 + var22], var19, arg8, var16, (int[][]) null);
        }
        int[] var23 = null;
        if (arg12) {
            if (arg5 == 1) {
                int var42 = class161.method1137(arg1, arg4, arg3, 128, 0.0F, arg11, arg0, arg13, var18, true, -2, arg2, var17, 64, var19, arg8, var16, (int[][]) null);
                int var43 = class161.method1137(arg1, arg4, arg3, 64, 0.0F, arg11, arg0, arg13, var18, true, arg15 ^ 0xFFFFFFFE, arg2, var17, 128, var19, arg8, var16, (int[][]) null);
                var23 = new int[] { var43, var42, var21[2], var42, var21[0], var21[2] };
            } else if (arg5 == 2) {
                int var40 = class161.method1137(arg1, arg4, arg3, 128, 0.0F, arg11, arg0, arg13, var18, true, -2, arg2, var17, 128, var19, arg8, var16, (int[][]) null);
                var23 = new int[6];
                int var41 = class161.method1137(arg1, arg4, arg3, 0, 0.0F, arg11, arg0, arg13, var18, true, -2, arg2, var17, 64, var19, arg8, var16, (int[][]) null);
                var23[0] = var21[0];
                var23[3] = var40;
                var23[1] = var41;
                var23[4] = var21[1];
                var23[5] = var21[0];
                var23[2] = var40;
            } else if (arg5 == 3) {
                var23 = new int[6];
                int var38 = class161.method1137(arg1, arg4, arg3, 128, 0.0F, arg11, arg0, arg13, var18, true, -2, arg2, var17, 0, var19, arg8, var16, (int[][]) null);
                int var39 = class161.method1137(arg1, arg4, arg3, 0, 0.0F, arg11, arg0, arg13, var18, true, -2, arg2, var17, 64, var19, arg8, var16, (int[][]) null);
                var23[3] = var38;
                var23[4] = var39;
                var23[1] = var21[1];
                var23[0] = var21[2];
                var23[2] = var38;
                var23[5] = var21[2];
            } else if (arg5 == 4) {
                var23 = new int[3];
                int var25 = class161.method1137(arg1, arg4, arg3, 128, 0.0F, arg11, arg0, arg13, var18, true, arg15 ^ 0xFFFFFFFE, arg2, var17, 0, var19, arg8, var16, (int[][]) null);
                var23[0] = var21[3];
                var23[2] = var21[0];
                var23[1] = var25;
            } else if (arg5 == 5) {
                int var26 = class161.method1137(arg1, arg4, arg3, 128, 0.0F, arg11, arg0, arg13, var18, true, -2, arg2, var17, 128, var19, arg8, var16, (int[][]) null);
                var23 = new int[] { var21[2], var26, var21[3] };
            } else if (arg5 == 6) {
                int var36 = class161.method1137(arg1, arg4, arg3, 0, 0.0F, arg11, arg0, arg13, var18, true, arg15 ^ 0xFFFFFFFE, arg2, var17, 128, var19, arg8, var16, (int[][]) null);
                int var37 = class161.method1137(arg1, arg4, arg3, 128, 0.0F, arg11, arg0, arg13, var18, true, -2, arg2, var17, 128, var19, arg8, var16, (int[][]) null);
                var23 = new int[] { var21[3], var36, var37, var37, var21[0], var21[3] };
            } else if (arg5 == 7) {
                int var34 = class161.method1137(arg1, arg4, arg3, 128, 0.0F, arg11, arg0, arg13, var18, true, -2, arg2, var17, 0, var19, arg8, var16, (int[][]) null);
                var23 = new int[6];
                int var35 = class161.method1137(arg1, arg4, arg3, 0, 0.0F, arg11, arg0, arg13, var18, true, -2, arg2, var17, 128, var19, arg8, var16, (int[][]) null);
                var23[2] = var34;
                var23[4] = var21[2];
                var23[0] = var21[1];
                var23[3] = var34;
                var23[1] = var35;
                var23[5] = var21[1];
            } else if (arg5 == 8) {
                var23 = new int[3];
                int var33 = class161.method1137(arg1, arg4, arg3, 0, 0.0F, arg11, arg0, arg13, var18, true, arg15 ^ 0xFFFFFFFE, arg2, var17, 0, var19, arg8, var16, (int[][]) null);
                var23[2] = var21[4];
                var23[0] = var21[3];
                var23[1] = var33;
            } else if (arg5 == 9) {
                var23 = new int[15];
                int var30 = class161.method1137(arg1, arg4, arg3, 64, 0.0F, arg11, arg0, arg13, var18, true, -2, arg2, var17, 128, var19, arg8, var16, (int[][]) null);
                int var31 = class161.method1137(arg1, arg4, arg3, 32, 0.0F, arg11, arg0, arg13, var18, true, -2, arg2, var17, 96, var19, arg8, var16, (int[][]) null);
                int var32 = class161.method1137(arg1, arg4, arg3, 0, 0.0F, arg11, arg0, arg13, var18, true, arg15 - 2, arg2, var17, 64, var19, arg8, var16, (int[][]) null);
                var23[0] = var31;
                var23[14] = var32;
                var23[3] = var31;
                var23[9] = var31;
                var23[6] = var31;
                var23[7] = var21[3];
                var23[2] = var21[4];
                var23[8] = var21[2];
                var23[4] = var21[4];
                var23[5] = var21[3];
                var23[1] = var30;
                var23[12] = var31;
                var23[10] = var21[2];
                var23[13] = var21[1];
                var23[11] = var21[1];
            } else if (arg5 == 10) {
                var23 = new int[9];
                int var29 = class161.method1137(arg1, arg4, arg3, 128, 0.0F, arg11, arg0, arg13, var18, true, arg15 ^ 0xFFFFFFFE, arg2, var17, 0, var19, arg8, var16, (int[][]) null);
                var23[1] = var29;
                var23[4] = var29;
                var23[5] = var21[4];
                var23[0] = var21[2];
                var23[2] = var21[3];
                var23[8] = var21[0];
                var23[3] = var21[3];
                var23[6] = var21[4];
                var23[7] = var29;
            } else if (arg5 == 11) {
                var23 = new int[12];
                int var27 = class161.method1137(arg1, arg4, arg3, 64, 0.0F, arg11, arg0, arg13, var18, true, -2, arg2, var17, 0, var19, arg8, var16, (int[][]) null);
                int var28 = class161.method1137(arg1, arg4, arg3, 64, 0.0F, arg11, arg0, arg13, var18, true, -2, arg2, var17, 128, var19, arg8, var16, (int[][]) null);
                var23[8] = var27;
                var23[1] = var27;
                var23[10] = var21[1];
                var23[5] = var27;
                var23[11] = var28;
                var23[7] = var28;
                var23[0] = var21[3];
                var23[3] = var21[3];
                var23[2] = var21[0];
                var23[6] = var21[2];
                var23[4] = var21[2];
                var23[9] = var21[2];
            }
        }
        arg3.method1838(arg9, arg11, arg8, var21, var23, false);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)V", line = 535)
    public static void method632(byte arg0) {
        field1455 = null;
        field1454 = null;
        int var1 = 64 % ((13 - arg0) / 35);
        field1471 = null;
        field1468 = null;
        field1464 = null;
        field1466 = null;
        field1456 = null;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V", line = 562)
    public static final void method633(int arg0) {
        if (arg0 >= -20) {
            return;
        }
        class218 var1 = (class218) class225.field3687.method1580((byte) -39);
        field1457++;
        while (var1 != null) {
            if (var1.field3582 > 0) {
                var1.field3582--;
            }
            if (var1.field3582 != 0) {
                if (var1.field3592 > 0) {
                    var1.field3592--;
                }
                if (var1.field3592 == 0 && var1.field3575 >= 1 && var1.field3588 >= 1 && var1.field3575 <= 102 && var1.field3588 <= 102 && (var1.field3581 < 0 || class265.method1853(var1.field3581, var1.field3573, 27887))) {
                    class154.method1118(var1.field3579, 108, var1.field3572, var1.field3588, var1.field3575, var1.field3581, var1.field3577, var1.field3573);
                    var1.field3592 = -1;
                    if (var1.field3590 == var1.field3581 && var1.field3590 == -1) {
                        var1.method598(96);
                    } else if (var1.field3590 == var1.field3581 && var1.field3576 == var1.field3572 && var1.field3584 == var1.field3573) {
                        var1.method598(53);
                    }
                }
            } else if (var1.field3590 < 0 || class265.method1853(var1.field3590, var1.field3584, 27887)) {
                class154.method1118(var1.field3579, 100, var1.field3576, var1.field3588, var1.field3575, var1.field3590, var1.field3577, var1.field3584);
                var1.method598(34);
            }
            var1 = (class218) class225.field3687.method1579((byte) 28);
        }
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(I)V", line = 623)
    public final void method634(int arg0) {
        field1461++;
        if (this.field1473 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field1473.length; var2++) {
            if (this.field1473[var2] != null) {
                this.field1473[var2].method1681(false);
            }
        }
        for (int var3 = arg0; var3 < this.field1473.length; var3++) {
            if (this.field1473[var3] != null) {
                this.field1473[var3].method1677(arg0 ^ 0xFFFFFFDE);
            }
        }
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Llj;Ldi;)V", line = 686)
    public class85(class26 arg0, class111 arg1) {
        this.field1452 = arg1;
        this.field1458 = arg0;
        if (!this.field1458.method167((byte) 114)) {
            this.field1460 = this.field1458.method166(true, 255, 20, (byte) 0, 255);
        }
    }
}
