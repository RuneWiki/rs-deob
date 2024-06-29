import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class145 extends class15 {

    @OriginalMember(owner = "client!rn", name = "L", descriptor = "[I")
    private int[] field1753;

    @OriginalMember(owner = "client!rn", name = "B", descriptor = "[I")
    private int[] field1743;

    @OriginalMember(owner = "client!rn", name = "z", descriptor = "Laa;")
    private class298 field1741;

    @OriginalMember(owner = "client!rn", name = "C", descriptor = "Laa;")
    private class298 field1744;

    @OriginalMember(owner = "client!rn", name = "I", descriptor = "Laa;")
    private class298 field1750;

    @OriginalMember(owner = "client!rn", name = "J", descriptor = "[Laa;")
    private class298[] field1751;

    @OriginalMember(owner = "client!rn", name = "A", descriptor = "I")
    public static int field1742 = 0;

    @OriginalMember(owner = "client!rn", name = "y", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!rn", name = "E", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!rn", name = "F", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!rn", name = "G", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!rn", name = "H", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!rn", name = "K", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!rn", name = "N", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!rn", name = "O", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!rn", name = "D", descriptor = "Loe;")
    public static class248 field1745;

    @OriginalMember(owner = "client!rn", name = "M", descriptor = "Ldb;")
    public static class29 field1754;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IZI)V")
    public static final void method684(int arg0, boolean arg1, int arg2) {
        field1746++;
        class89 var3 = class146.method695(15, 0, (byte) -101);
        var3.method449(!arg1);
        var3.field1100 = arg2;
        if (arg1) {
            method691(-41, true, -29);
        }
        var3.field1106 = arg0;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(ZBLg;ZLeg;DII)[I")
    public final int[] method685(boolean arg0, byte arg1, class470 arg2, boolean arg3, class394 arg4, double arg5, int arg6, int arg7) {
        class427.field6156 = arg4;
        field1740++;
        class323.field4673 = arg2;
        int var10 = 0;
        int var11 = -122 / ((-arg1 - 56) / 32);
        while (var10 < this.field1751.length) {
            this.field1751[var10].method1881(88, arg7, arg6);
            var10++;
        }
        class125.method598((byte) 4, arg5);
        class485.method2863((byte) -128, arg6, arg7);
        int[] var12 = new int[arg6 * arg7];
        int var13;
        byte var14;
        int var15;
        if (arg3) {
            var13 = -1;
            var14 = -1;
            var15 = arg6 - 1;
        } else {
            var13 = arg6;
            var15 = 0;
            var14 = 1;
        }
        int var16 = 0;
        for (int var17 = 0; var17 < arg7; var17++) {
            if (arg0) {
                var16 = var17;
            }
            int[] var20;
            int[] var21;
            int[] var22;
            if (this.field1744.field4449) {
                int[] var19 = this.field1744.method13(var17, true);
                var20 = var19;
                var21 = var19;
                var22 = var19;
            } else {
                int[][] var23 = this.field1744.method157(-24032, var17);
                var20 = var23[2];
                var21 = var23[0];
                var22 = var23[1];
            }
            for (int var24 = var15; var24 != var13; var24 += var14) {
                int var25 = var21[var24] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = var22[var24] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var26 < 0) {
                    var26 = 0;
                }
                int var27 = var20[var24] >> 4;
                if (var27 > 255) {
                    var27 = 255;
                }
                int var28 = class22.field300[var26];
                if (var27 < 0) {
                    var27 = 0;
                }
                int var29 = class22.field300[var25];
                int var30 = class22.field300[var27];
                int var31 = (var28 << 8) + (var29 << 16) + var30;
                if (var31 != 0) {
                    var31 |= 0xFF000000;
                }
                var12[var16++] = var31;
                if (arg0) {
                    var16 += arg6 - 1;
                }
            }
        }
        for (int var18 = 0; var18 < this.field1751.length; var18++) {
            this.field1751[var18].method548(true);
        }
        return var12;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(ZILeg;Lg;BDI)[I")
    public final int[] method686(boolean arg0, int arg1, class394 arg2, class470 arg3, byte arg4, double arg5, int arg6) {
        field1755++;
        class323.field4673 = arg3;
        class427.field6156 = arg2;
        if (arg4 <= 54) {
            method691(-68, true, 75);
        }
        for (int var9 = 0; var9 < this.field1751.length; var9++) {
            this.field1751[var9].method1881(103, arg6, arg1);
        }
        class125.method598((byte) 4, arg5);
        class485.method2863((byte) -128, arg1, arg6);
        int[] var10 = new int[arg1 * 4 * arg6];
        int var11 = 0;
        for (int var12 = 0; var12 < arg6; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field1744.field4449) {
                int[] var18 = this.field1744.method13(var12, true);
                var17 = var18;
                var15 = var18;
                var16 = var18;
            } else {
                int[][] var14 = this.field1744.method157(-24032, var12);
                var15 = var14[1];
                var16 = var14[2];
                var17 = var14[0];
            }
            if (arg0) {
                var11 = var12;
            }
            int[] var19;
            if (this.field1750.field4449) {
                var19 = this.field1750.method13(var12, true);
            } else {
                var19 = this.field1750.method157(-24032, var12)[0];
            }
            for (int var20 = arg1 - 1; var20 >= 0; var20--) {
                int var21 = var17[var20] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = var15[var20] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = var16[var20] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                int var24 = class22.field300[var22];
                int var25 = class22.field300[var21];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var26 = class22.field300[var23];
                int var27;
                if (var25 == 0 && var24 == 0 && var26 == 0) {
                    var27 = 0;
                } else {
                    var27 = var19[var20] >> 4;
                    if (var27 > 255) {
                        var27 = 255;
                    }
                    if (var27 < 0) {
                        var27 = 0;
                    }
                }
                var10[var11++] = (var25 << 16) + (var24 << 8) + (var27 << 24) + var26;
                if (arg0) {
                    var11 += arg1 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field1751.length; var13++) {
            this.field1751[var13].method548(true);
        }
        return var10;
    }

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "(B)V")
    public static void method687(byte arg0) {
        field1745 = null;
        field1754 = null;
        if (arg0 >= -53) {
            method684(-42, false, 63);
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(ILeg;Lg;)Z")
    public final boolean method688(int arg0, class394 arg1, class470 arg2) {
        field1747++;
        if (arg0 > class218.field3069) {
            for (int var4 = 0; var4 < this.field1753.length; var4++) {
                if (!arg2.method2758(this.field1753[var4], -1)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field1753.length; var5++) {
                if (!arg2.method2749(this.field1753[var5], 18406, class218.field3069)) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field1743.length; var6++) {
            if (!arg1.method575(this.field1743[var6], (byte) 110)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "(III)V")
    public static final void method689(int arg0, int arg1, int arg2) {
        class263 var3 = class293.field4356[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field3783 != null) {
            var3.field3783 = null;
        }
        if (var3.field3780 != null) {
            var3.field3780 = null;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Leg;ZILg;II)[F")
    public final float[] method690(class394 arg0, boolean arg1, int arg2, class470 arg3, int arg4, int arg5) {
        class427.field6156 = arg0;
        class323.field4673 = arg3;
        field1752++;
        for (int var7 = 0; var7 < this.field1751.length; var7++) {
            this.field1751[var7].method1881(-104, arg5, arg2);
        }
        class485.method2863((byte) -128, arg2, arg5);
        float[] var8 = new float[arg2 * arg5 * 4];
        int var9 = 0;
        for (int var10 = 0; var10 < arg5; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field1744.field4449) {
                int[] var16 = this.field1744.method13(var10, true);
                var13 = var16;
                var14 = var16;
                var15 = var16;
            } else {
                int[][] var12 = this.field1744.method157(-24032, var10);
                var13 = var12[1];
                var14 = var12[2];
                var15 = var12[0];
            }
            int[] var17;
            if (this.field1750.field4449) {
                var17 = this.field1750.method13(var10, true);
            } else {
                var17 = this.field1750.method157(-24032, var10)[0];
            }
            if (arg1) {
                var9 = var10 << 2;
            }
            int[] var18;
            if (this.field1741.field4449) {
                var18 = this.field1741.method13(var10, true);
            } else {
                var18 = this.field1741.method157(-24032, var10)[0];
            }
            for (int var19 = arg2 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                if (var20 < 0.0F) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = var20;
                if (arg1) {
                    var9 += (arg2 << 2) - 4;
                }
            }
        }
        for (int var11 = 0; var11 < this.field1751.length; var11++) {
            this.field1751[var11].method548(true);
        }
        if (arg4 != -8518) {
            method684(109, false, -77);
        }
        return var8;
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(IZI)V")
    public static final void method691(int arg0, boolean arg1, int arg2) {
        field1748++;
        class458 var3 = class230.method1272((byte) -127, arg1, arg2);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < var3.field6447.length; var4++) {
            var3.field6447[var4] = -1;
            var3.field6454[var4] = 0;
        }
        if (arg0 != -25241) {
            field1754 = null;
        }
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "()V")
    public class145() {
        this.field1753 = new int[0];
        this.field1743 = new int[0];
        this.field1741 = new class305(0);
        this.field1741.field4447 = 1;
        this.field1744 = new class305();
        this.field1744.field4447 = 1;
        this.field1750 = new class305();
        this.field1750.field4447 = 1;
        this.field1751 = new class298[] { this.field1744, this.field1750, this.field1741 };
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Lvt;)V")
    public class145(class179 arg0) {
        int var2 = arg0.method895((byte) -82);
        int var3 = 0;
        int var4 = 0;
        this.field1751 = new class298[var2];
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class298 var16 = class282.method1773(0, arg0);
            if (var16.method545((byte) -39) >= 0) {
                var3++;
            }
            if (var16.method1877((byte) -105) >= 0) {
                var4++;
            }
            int var17 = var16.field4441.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method895((byte) -95);
            }
            this.field1751[var6] = var16;
        }
        this.field1753 = new int[var3];
        int var7 = 0;
        this.field1743 = new int[var4];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class298 var11 = this.field1751[var9];
            int var12 = var11.field4441.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field4441[var13] = this.field1751[var5[var9][var13]];
            }
            int var14 = var11.method545((byte) -124);
            int var15 = var11.method1877((byte) -120);
            if (var14 > 0) {
                this.field1753[var7++] = var14;
            }
            if (var15 > 0) {
                this.field1743[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field1744 = this.field1751[arg0.method895((byte) -103)];
        this.field1750 = this.field1751[arg0.method895((byte) -86)];
        Object var10 = null;
        this.field1741 = this.field1751[arg0.method895((byte) -113)];
    }
}
