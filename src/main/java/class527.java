import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class527 extends class513 {

    @OriginalMember(owner = "client!lm", name = "D", descriptor = "[I")
    private int[] field7155;

    @OriginalMember(owner = "client!lm", name = "G", descriptor = "[I")
    private int[] field7157;

    @OriginalMember(owner = "client!lm", name = "B", descriptor = "Lng;")
    private class362 field7153;

    @OriginalMember(owner = "client!lm", name = "C", descriptor = "Lng;")
    private class362 field7154;

    @OriginalMember(owner = "client!lm", name = "z", descriptor = "Lng;")
    private class362 field7151;

    @OriginalMember(owner = "client!lm", name = "H", descriptor = "[Lng;")
    private class362[] field7158;

    @OriginalMember(owner = "client!lm", name = "y", descriptor = "[Lfl;")
    public static class771[] field7150 = new class771[2048];

    @OriginalMember(owner = "client!lm", name = "w", descriptor = "Lmo;")
    public static class780 field7148 = new class780("", 10);

    @OriginalMember(owner = "client!lm", name = "L", descriptor = "I")
    public static int field7162 = 0;

    @OriginalMember(owner = "client!lm", name = "v", descriptor = "I")
    public static int field7147;

    @OriginalMember(owner = "client!lm", name = "x", descriptor = "I")
    public static int field7149;

    @OriginalMember(owner = "client!lm", name = "A", descriptor = "I")
    public static int field7152;

    @OriginalMember(owner = "client!lm", name = "I", descriptor = "I")
    public static int field7159;

    @OriginalMember(owner = "client!lm", name = "J", descriptor = "I")
    public static int field7160;

    @OriginalMember(owner = "client!lm", name = "K", descriptor = "I")
    public static int field7161;

    @OriginalMember(owner = "client!lm", name = "F", descriptor = "Lgj;")
    public static class662 field7156;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IILgj;ILd;Z)[F", line = 3)
    public final float[] method2995(int arg0, int arg1, class662 arg2, int arg3, class162 arg4, boolean arg5) {
        field7149++;
        class514.field7014 = arg2;
        class609.field8505 = arg4;
        for (int var7 = 0; var7 < this.field7158.length; var7++) {
            this.field7158[var7].method2220(-256, arg0, arg1);
        }
        class636.method3554(arg1, (byte) -53, arg0);
        float[] var8 = new float[arg1 * 4 * arg0];
        int var9 = 0;
        for (int var10 = 0; var10 < arg1; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field7154.field4929) {
                int[] var16 = this.field7154.method156(arg3 ^ 0x8731E1FC, var10);
                var14 = var16;
                var15 = var16;
                var13 = var16;
            } else {
                int[][] var12 = this.field7154.method153(var10, (byte) 111);
                var13 = var12[0];
                var14 = var12[1];
                var15 = var12[2];
            }
            int[] var17;
            if (this.field7151.field4929) {
                var17 = this.field7151.method156(arg3 - 2026774844, var10);
            } else {
                var17 = this.field7151.method153(var10, (byte) 64)[0];
            }
            int[] var18;
            if (this.field7153.field4929) {
                var18 = this.field7153.method156(-2026769311, var10);
            } else {
                var18 = this.field7153.method153(var10, (byte) 95)[0];
            }
            if (arg5) {
                var9 = var10 << 2;
            }
            for (int var19 = arg0 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                if (var20 < 0.0F) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = var20;
                if (arg5) {
                    var9 += (arg0 << 2) - 4;
                }
            }
        }
        if (arg3 != 5533) {
            method2999(-11, 27, -6, 96, (byte) -86, 51, null);
        }
        for (int var11 = 0; var11 < this.field7158.length; var11++) {
            this.field7158[var11].method400((byte) -92);
        }
        return var8;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)V", line = 114)
    public static void method2996(int arg0) {
        field7156 = null;
        int var1 = 75 / ((-arg0 - 57) / 50);
        field7148 = null;
        field7150 = null;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IILgj;DZIZLd;)[I", line = 130)
    public final int[] method2997(int arg0, int arg1, class662 arg2, double arg3, boolean arg4, int arg5, boolean arg6, class162 arg7) {
        int var10 = -65 / ((arg0 - 1) / 47);
        class514.field7014 = arg2;
        field7152++;
        class609.field8505 = arg7;
        for (int var11 = 0; var11 < this.field7158.length; var11++) {
            this.field7158[var11].method2220(-256, arg5, arg1);
        }
        class360.method2214(arg3, -12327);
        class636.method3554(arg1, (byte) 75, arg5);
        int[] var12 = new int[arg1 * arg5];
        byte var13;
        int var14;
        int var15;
        if (arg6) {
            var13 = -1;
            var14 = arg5 - 1;
            var15 = -1;
        } else {
            var13 = 1;
            var14 = 0;
            var15 = arg5;
        }
        int var16 = 0;
        for (int var17 = 0; var17 < arg1; var17++) {
            if (arg4) {
                var16 = var17;
            }
            int[] var20;
            int[] var21;
            int[] var22;
            if (this.field7154.field4929) {
                int[] var23 = this.field7154.method156(-2026769311, var17);
                var20 = var23;
                var22 = var23;
                var21 = var23;
            } else {
                int[][] var19 = this.field7154.method153(var17, (byte) 76);
                var20 = var19[0];
                var21 = var19[2];
                var22 = var19[1];
            }
            for (int var24 = var14; var24 != var15; var24 += var13) {
                int var25 = var20[var24] >> 4;
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
                int var27 = var21[var24] >> 4;
                if (var27 > 255) {
                    var27 = 255;
                }
                int var28 = class198.field2999[var26];
                if (var27 < 0) {
                    var27 = 0;
                }
                int var29 = class198.field2999[var25];
                int var30 = class198.field2999[var27];
                int var31 = (var29 << 16) + (var28 << 8) + var30;
                if (var31 != 0) {
                    var31 |= 0xFF000000;
                }
                var12[var16++] = var31;
                if (arg4) {
                    var16 += arg5 - 1;
                }
            }
        }
        for (int var18 = 0; var18 < this.field7158.length; var18++) {
            this.field7158[var18].method400((byte) -115);
        }
        return var12;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IZ)Laba;", line = 266)
    public static final class189 method2998(int arg0, boolean arg1) {
        field7160++;
        return arg1 ? new class189(arg0, false) : null;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIIBI[B)Z", line = 287)
    public static final boolean method2999(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, byte[] arg6) {
        field7147++;
        int var7 = arg0 % arg3;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg3 - var7;
        }
        int var9 = -((arg1 + arg3 - 1) / arg3);
        int var10 = -((arg3 + arg0 - 1) / arg3);
        if (arg4 != -119) {
            return false;
        }
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg6[arg5] == 0) {
                    return true;
                }
                arg5 += arg3;
            }
            int var13 = arg5 - var8;
            if (arg6[var13 - 1] == 0) {
                return true;
            }
            arg5 = arg2 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Ld;Lgj;B)Z", line = 345)
    public final boolean method3000(class162 arg0, class662 arg1, byte arg2) {
        field7161++;
        if (class460.field6256 >= 0) {
            for (int var4 = 0; var4 < this.field7155.length; var4++) {
                if (!arg1.method3720(class460.field6256, this.field7155[var4], 0)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field7155.length; var5++) {
                if (!arg1.method3737(this.field7155[var5], false)) {
                    return false;
                }
            }
        }
        if (arg2 != -60) {
            this.method2997(-76, 22, null, 0.10851295793903375D, true, -57, false, null);
        }
        for (int var6 = 0; var6 < this.field7157.length; var6++) {
            if (!arg0.method1274(this.field7157[var6], 21532)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lgj;DIILd;IZ)[I", line = 397)
    public final int[] method3001(class662 arg0, double arg1, int arg2, int arg3, class162 arg4, int arg5, boolean arg6) {
        class514.field7014 = arg0;
        field7159++;
        class609.field8505 = arg4;
        for (int var9 = 0; var9 < this.field7158.length; var9++) {
            this.field7158[var9].method2220(arg3 - 256, arg2, arg5);
        }
        class360.method2214(arg1, -12327);
        class636.method3554(arg5, (byte) 96, arg2);
        int[] var10 = new int[arg2 * arg5];
        int var11 = 0;
        for (int var12 = arg3; var12 < arg5; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field7154.field4929) {
                int[] var14 = this.field7154.method156(-2026769311, var12);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field7154.method153(var12, (byte) 127);
                var16 = var18[0];
                var15 = var18[1];
                var17 = var18[2];
            }
            int[] var19;
            if (this.field7151.field4929) {
                var19 = this.field7151.method156(-2026769311, var12);
            } else {
                var19 = this.field7151.method153(var12, (byte) 109)[0];
            }
            if (arg6) {
                var11 = var12;
            }
            for (int var20 = arg2 - 1; var20 >= 0; var20--) {
                int var21 = var16[var20] >> 4;
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
                int var23 = var17[var20] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var24 = class198.field2999[var21];
                int var25 = class198.field2999[var22];
                int var26 = class198.field2999[var23];
                int var27;
                if (var24 == 0 && var25 == 0 && var26 == 0) {
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
                var10[var11++] = (var27 << 24) + var26 - (-(var24 << 16) - (var25 << 8));
                if (arg6) {
                    var11 += arg2 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field7158.length; var13++) {
            this.field7158[var13].method400((byte) -125);
        }
        return var10;
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "()V", line = 527)
    public class527() {
        this.field7155 = new int[0];
        this.field7157 = new int[0];
        this.field7153 = new class532(0);
        this.field7153.field4933 = 1;
        this.field7154 = new class532();
        this.field7154.field4933 = 1;
        this.field7151 = new class532();
        this.field7158 = new class362[] { this.field7154, this.field7151, this.field7153 };
        this.field7151.field4933 = 1;
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lfca;)V", line = 545)
    public class527(class93 arg0) {
        int var2 = arg0.method793((byte) 19);
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        this.field7158 = new class362[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            class362 var16 = class379.method2308(arg0, -126);
            if (var16.method401(15667) >= 0) {
                var3++;
            }
            if (var16.method2219((byte) 11) >= 0) {
                var4++;
            }
            int var17 = var16.field4941.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method793((byte) 23);
            }
            this.field7158[var6] = var16;
        }
        this.field7155 = new int[var3];
        int var7 = 0;
        this.field7157 = new int[var4];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class362 var11 = this.field7158[var9];
            int var12 = var11.field4941.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field4941[var13] = this.field7158[var5[var9][var13]];
            }
            int var14 = var11.method401(15667);
            int var15 = var11.method2219((byte) 11);
            if (var14 > 0) {
                this.field7155[var7++] = var14;
            }
            if (var15 > 0) {
                this.field7157[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field7154 = this.field7158[arg0.method793((byte) 64)];
        this.field7151 = this.field7158[arg0.method793((byte) 108)];
        Object var10 = null;
        this.field7153 = this.field7158[arg0.method793((byte) 9)];
    }
}
