import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class495 extends class6 {

    @OriginalMember(owner = "client!dd", name = "J", descriptor = "[I")
    private int[] field7238;

    @OriginalMember(owner = "client!dd", name = "z", descriptor = "[I")
    private int[] field7228;

    @OriginalMember(owner = "client!dd", name = "D", descriptor = "Lvl;")
    private class11 field7232;

    @OriginalMember(owner = "client!dd", name = "w", descriptor = "Lvl;")
    private class11 field7225;

    @OriginalMember(owner = "client!dd", name = "I", descriptor = "Lvl;")
    private class11 field7237;

    @OriginalMember(owner = "client!dd", name = "H", descriptor = "[Lvl;")
    private class11[] field7236;

    @OriginalMember(owner = "client!dd", name = "B", descriptor = "I")
    public static int field7230 = -1;

    @OriginalMember(owner = "client!dd", name = "F", descriptor = "Lqp;")
    public static class466 field7234 = new class466("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

    @OriginalMember(owner = "client!dd", name = "y", descriptor = "F")
    public static float field7227;

    @OriginalMember(owner = "client!dd", name = "A", descriptor = "I")
    public static int field7229;

    @OriginalMember(owner = "client!dd", name = "C", descriptor = "I")
    public static int field7231;

    @OriginalMember(owner = "client!dd", name = "E", descriptor = "I")
    public static int field7233;

    @OriginalMember(owner = "client!dd", name = "G", descriptor = "I")
    public static int field7235;

    @OriginalMember(owner = "client!dd", name = "x", descriptor = "[[Lem;")
    public static class150[][] field7226;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lga;ZZIDILmg;Z)[I", line = 4)
    public final int[] method2895(class277 arg0, boolean arg1, boolean arg2, int arg3, double arg4, int arg5, class101 arg6, boolean arg7) {
        class172.field2556 = arg0;
        class269.field3720 = arg6;
        field7231++;
        for (int var10 = 0; var10 < this.field7236.length; var10++) {
            this.field7236[var10].method55(arg3, 255, arg5);
        }
        class181.method1161(arg4, 7);
        class44.method412(arg5, (byte) -107, arg3);
        int[] var11 = new int[arg3 * arg5];
        int var12;
        int var13;
        byte var14;
        if (arg1) {
            var12 = arg3 - 1;
            var13 = -1;
            var14 = -1;
        } else {
            var13 = arg3;
            var12 = 0;
            var14 = 1;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg5; var16++) {
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field7225.field167) {
                int[] var22 = this.field7225.method44(-108, var16);
                var21 = var22;
                var19 = var22;
                var20 = var22;
            } else {
                int[][] var18 = this.field7225.method41(-127, var16);
                var19 = var18[1];
                var20 = var18[2];
                var21 = var18[0];
            }
            if (arg7) {
                var15 = var16;
            }
            for (int var23 = var12; var23 != var13; var23 += var14) {
                int var24 = var21[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = var19[var23] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = var20[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var26 < 0) {
                    var26 = 0;
                }
                int var27 = class10.field149[var25];
                int var28 = class10.field149[var24];
                int var29 = class10.field149[var26];
                int var30 = (var27 << 8) + ((var28 << 16) + var29);
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg7) {
                    var15 += arg3 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field7236.length; var17++) {
            this.field7236[var17].method51((byte) -53);
        }
        if (arg2) {
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "(I)V", line = 143)
    public static void method2896(int arg0) {
        field7226 = null;
        if (arg0 != 0) {
            method2896(-44);
        }
        field7234 = null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILmg;DIZILga;)[I", line = 154)
    public final int[] method2897(int arg0, class101 arg1, double arg2, int arg3, boolean arg4, int arg5, class277 arg6) {
        field7229++;
        class172.field2556 = arg6;
        class269.field3720 = arg1;
        for (int var9 = 0; var9 < this.field7236.length; var9++) {
            this.field7236[var9].method55(arg3, 255, arg0);
        }
        class181.method1161(arg2, 7);
        class44.method412(arg0, (byte) -74, arg3);
        int[] var10 = new int[arg0 * arg3 * 4];
        int var11 = 0;
        for (int var12 = 0; var12 < arg0; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field7225.field167) {
                int[] var18 = this.field7225.method44(-117, var12);
                var15 = var18;
                var16 = var18;
                var17 = var18;
            } else {
                int[][] var14 = this.field7225.method41(-3, var12);
                var15 = var14[2];
                var16 = var14[0];
                var17 = var14[1];
            }
            if (arg4) {
                var11 = var12;
            }
            int[] var19;
            if (this.field7237.field167) {
                var19 = this.field7237.method44(-97, var12);
            } else {
                var19 = this.field7237.method41(-127, var12)[0];
            }
            for (int var20 = arg3 - 1; var20 >= 0; var20--) {
                int var21 = var16[var20] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = var17[var20] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = var15[var20] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                int var24 = class10.field149[var21];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var25 = class10.field149[var22];
                int var26 = class10.field149[var23];
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
                var10[var11++] = (var25 << 8) + (var24 << 16) + (var27 << 24) + var26;
                if (arg4) {
                    var11 += arg3 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field7236.length; var13++) {
            this.field7236[var13].method51((byte) -53);
        }
        if (arg5 != -1) {
            this.method2897(-110, null, -1.1782323420388603D, -37, false, 58, null);
        }
        return var10;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BLga;Lmg;ZII)[F", line = 310)
    public final float[] method2898(byte arg0, class277 arg1, class101 arg2, boolean arg3, int arg4, int arg5) {
        if (arg0 != 84) {
            this.method2898((byte) 14, null, null, true, 8, 123);
        }
        class269.field3720 = arg2;
        field7233++;
        class172.field2556 = arg1;
        for (int var7 = 0; var7 < this.field7236.length; var7++) {
            this.field7236[var7].method55(arg5, 255, arg4);
        }
        class44.method412(arg4, (byte) -40, arg5);
        float[] var8 = new float[arg4 * arg5 * 4];
        int var9 = 0;
        for (int var10 = 0; var10 < arg4; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field7225.field167) {
                int[] var16 = this.field7225.method44(arg0 - 167, var10);
                var13 = var16;
                var15 = var16;
                var14 = var16;
            } else {
                int[][] var12 = this.field7225.method41(89, var10);
                var13 = var12[1];
                var14 = var12[0];
                var15 = var12[2];
            }
            int[] var17;
            if (this.field7237.field167) {
                var17 = this.field7237.method44(-51, var10);
            } else {
                var17 = this.field7237.method41(arg0 + 15, var10)[0];
            }
            int[] var18;
            if (this.field7232.field167) {
                var18 = this.field7232.method44(-73, var10);
            } else {
                var18 = this.field7232.method41(arg0 - 210, var10)[0];
            }
            if (arg3) {
                var9 = var10 << 2;
            }
            for (int var19 = arg5 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                if (var20 < 0.0F) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = var20;
                if (arg3) {
                    var9 += (arg5 << 2) - 4;
                }
            }
        }
        for (int var11 = 0; var11 < this.field7236.length; var11++) {
            this.field7236[var11].method51((byte) -53);
        }
        return var8;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lga;BLmg;)Z", line = 425)
    public final boolean method2899(class277 arg0, byte arg1, class101 arg2) {
        field7235++;
        if (class80.field1222 >= 0) {
            for (int var4 = 0; var4 < this.field7228.length; var4++) {
                if (!arg2.method729(class80.field1222, this.field7228[var4], arg1 ^ 0xFFFFDF21)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field7228.length; var5++) {
                if (!arg2.method747(this.field7228[var5], (byte) -68)) {
                    return false;
                }
            }
        }
        int var6 = 0;
        if (arg1 != 7) {
            this.method2895(null, false, true, -93, 0.05462013734557951D, -35, null, true);
        }
        while (this.field7238.length > var6) {
            if (!arg0.method1652(this.field7238[var6], 29423)) {
                return false;
            }
            var6++;
        }
        return true;
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V", line = 476)
    public class495() {
        this.field7238 = new int[0];
        this.field7228 = new int[0];
        this.field7232 = new class494(0);
        this.field7232.field169 = 1;
        this.field7225 = new class494();
        this.field7225.field169 = 1;
        this.field7237 = new class494();
        this.field7237.field169 = 1;
        this.field7236 = new class11[] { this.field7225, this.field7237, this.field7232 };
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lsi;)V", line = 491)
    public class495(class391 arg0) {
        int var2 = arg0.method2348(-2);
        int var3 = 0;
        int var4 = 0;
        this.field7236 = new class11[var2];
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class11 var16 = class62.method510(arg0, 0);
            if (var16.method47(-25029) >= 0) {
                var3++;
            }
            if (var16.method50(-1) >= 0) {
                var4++;
            }
            int var17 = var16.field162.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method2348(-2);
            }
            this.field7236[var6] = var16;
        }
        this.field7228 = new int[var3];
        int var7 = 0;
        this.field7238 = new int[var4];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class11 var11 = this.field7236[var9];
            int var12 = var11.field162.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field162[var13] = this.field7236[var5[var9][var13]];
            }
            int var14 = var11.method47(-25029);
            int var15 = var11.method50(-1);
            if (var14 > 0) {
                this.field7228[var7++] = var14;
            }
            if (var15 > 0) {
                this.field7238[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field7225 = this.field7236[arg0.method2348(-2)];
        this.field7237 = this.field7236[arg0.method2348(-2)];
        Object var10 = null;
        this.field7232 = this.field7236[arg0.method2348(-2)];
    }
}
