import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class140 extends class205 {

    @OriginalMember(owner = "client!hv", name = "y", descriptor = "[I")
    private int[] field2182;

    @OriginalMember(owner = "client!hv", name = "H", descriptor = "[I")
    private int[] field2191;

    @OriginalMember(owner = "client!hv", name = "E", descriptor = "Lfw;")
    private class214 field2188;

    @OriginalMember(owner = "client!hv", name = "D", descriptor = "Lfw;")
    private class214 field2187;

    @OriginalMember(owner = "client!hv", name = "v", descriptor = "Lfw;")
    private class214 field2179;

    @OriginalMember(owner = "client!hv", name = "z", descriptor = "[Lfw;")
    private class214[] field2183;

    @OriginalMember(owner = "client!hv", name = "C", descriptor = "[F")
    public static float[] field2186 = new float[16384];

    @OriginalMember(owner = "client!hv", name = "A", descriptor = "[F")
    public static float[] field2184 = new float[16384];

    @OriginalMember(owner = "client!hv", name = "F", descriptor = "[[I")
    public static int[][] field2189 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!hv", name = "L", descriptor = "[I")
    public static int[] field2195;

    @OriginalMember(owner = "client!hv", name = "t", descriptor = "F")
    public static float field2177;

    @OriginalMember(owner = "client!hv", name = "G", descriptor = "F")
    public static float field2190;

    @OriginalMember(owner = "client!hv", name = "u", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!hv", name = "w", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!hv", name = "x", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!hv", name = "B", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!hv", name = "I", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!hv", name = "J", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!hv", name = "K", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!hv", name = "O", descriptor = "Lla;")
    public static class422 field2198;

    @OriginalMember(owner = "client!hv", name = "N", descriptor = "[Lit;")
    public static class34[] field2197;

    @OriginalMember(owner = "client!hv", name = "M", descriptor = "[[I")
    public static int[][] field2196;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(IZLla;IIDLd;)[I")
    public final int[] method1092(int arg0, boolean arg1, class422 arg2, int arg3, int arg4, double arg5, class267 arg6) {
        class131.field2129 = arg6;
        field2193++;
        class135.field2158 = arg2;
        for (int var9 = 0; var9 < this.field2183.length; var9++) {
            this.field2183[var9].method1546((byte) -106, arg0, arg3);
        }
        class414.method2545(false, arg5);
        class423.method2646(0, arg0, arg3);
        int[] var10 = new int[arg0 * arg3];
        int var11 = 0;
        for (int var12 = 0; var12 < arg3; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field2187.field3540) {
                int[] var14 = this.field2187.method64(var12, (byte) 5);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field2187.method62(var12, -256);
                var15 = var18[0];
                var17 = var18[1];
                var16 = var18[2];
            }
            int[] var19;
            if (this.field2179.field3540) {
                var19 = this.field2179.method64(var12, (byte) 5);
            } else {
                var19 = this.field2179.method62(var12, -256)[0];
            }
            if (arg1) {
                var11 = var12;
            }
            for (int var20 = arg0 - 1; var20 >= 0; var20--) {
                int var21 = var15[var20] >> 4;
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
                int var23 = var16[var20] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                int var24 = class710.field9999[var22];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var25 = class710.field9999[var21];
                int var26 = class710.field9999[var23];
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
                if (arg1) {
                    var11 += arg0 - 1;
                }
            }
        }
        if (arg4 != -1) {
            method1099(null, -19);
        }
        for (int var13 = 0; var13 < this.field2183.length; var13++) {
            this.field2183[var13].method1542(arg4 + 1);
        }
        return var10;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIILjava/lang/Class;)Lvp;")
    public static final class559 method1093(int arg0, int arg1, int arg2, Class arg3) {
        class114 var4 = class488.field7062[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class291 var5 = var4.field1772; var5 != null; var5 = var5.field4479) {
            class559 var6 = var5.field4482;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field7927 == arg1 && var6.field7930 == arg2) {
                return var6;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(ILd;ZLla;ZZDI)[I")
    public final int[] method1094(int arg0, class267 arg1, boolean arg2, class422 arg3, boolean arg4, boolean arg5, double arg6, int arg7) {
        class131.field2129 = arg1;
        class135.field2158 = arg3;
        field2185++;
        for (int var10 = 0; var10 < this.field2183.length; var10++) {
            this.field2183[var10].method1546((byte) -106, arg0, arg7);
        }
        class414.method2545(false, arg6);
        class423.method2646(0, arg0, arg7);
        int[] var11 = new int[arg0 * arg7];
        if (!arg4) {
            field2177 = -0.4497739F;
        }
        int var12;
        int var13;
        byte var14;
        if (arg5) {
            var12 = -1;
            var13 = arg0 - 1;
            var14 = -1;
        } else {
            var13 = 0;
            var12 = arg0;
            var14 = 1;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg7; var16++) {
            if (arg2) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field2187.field3540) {
                int[] var18 = this.field2187.method64(var16, (byte) 5);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field2187.method62(var16, -256);
                var21 = var22[1];
                var20 = var22[2];
                var19 = var22[0];
            }
            for (int var23 = var13; var23 != var12; var23 += var14) {
                int var24 = var19[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = var21[var23] >> 4;
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
                int var27 = class710.field9999[var24];
                int var28 = class710.field9999[var25];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var29 = class710.field9999[var26];
                int var30 = (var27 << 16) + (var28 << 8) + var29;
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg2) {
                    var15 += arg0 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field2183.length; var17++) {
            this.field2183[var17].method1542(0);
        }
        return var11;
    }

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "(I)V")
    public static void method1095(int arg0) {
        if (arg0 != -1684332350) {
            method1096(80, 32);
        }
        field2186 = null;
        field2184 = null;
        field2197 = null;
        field2196 = null;
        field2198 = null;
        field2189 = null;
        field2195 = null;
    }

    @OriginalMember(owner = "client!hv", name = "c", descriptor = "(II)I")
    public static final int method1096(int arg0, int arg1) {
        if (arg1 == 260351) {
            field2180++;
            return (arg0 & 0x3F8FF) >> 11;
        } else {
            return 8;
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lla;IIZLd;I)[F")
    public final float[] method1097(class422 arg0, int arg1, int arg2, boolean arg3, class267 arg4, int arg5) {
        field2178++;
        class131.field2129 = arg4;
        class135.field2158 = arg0;
        for (int var7 = 0; var7 < this.field2183.length; var7++) {
            this.field2183[var7].method1546((byte) -106, arg2, arg1);
        }
        class423.method2646(0, arg2, arg1);
        float[] var8 = new float[arg1 * 4 * arg2];
        if (arg5 != -8027) {
            method1096(-67, -95);
        }
        int var9 = 0;
        for (int var10 = 0; var10 < arg1; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field2187.field3540) {
                int[] var16 = this.field2187.method64(var10, (byte) 5);
                var14 = var16;
                var13 = var16;
                var15 = var16;
            } else {
                int[][] var12 = this.field2187.method62(var10, -256);
                var13 = var12[1];
                var14 = var12[2];
                var15 = var12[0];
            }
            int[] var17;
            if (this.field2179.field3540) {
                var17 = this.field2179.method64(var10, (byte) 5);
            } else {
                var17 = this.field2179.method62(var10, -256)[0];
            }
            if (arg3) {
                var9 = var10 << 2;
            }
            int[] var18;
            if (this.field2188.field3540) {
                var18 = this.field2188.method64(var10, (byte) 5);
            } else {
                var18 = this.field2188.method62(var10, -256)[0];
            }
            for (int var19 = arg2 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                if ((var20 < 0.0F)) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = var20;
                if (arg3) {
                    var9 += (arg2 << 2) - 4;
                }
            }
        }
        for (int var11 = 0; var11 < this.field2183.length; var11++) {
            this.field2183[var11].method1542(0);
        }
        return var8;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Ld;ILla;)Z")
    public final boolean method1098(class267 arg0, int arg1, class422 arg2) {
        field2181++;
        if (class24.field237 < 0) {
            for (int var4 = 0; var4 < this.field2182.length; var4++) {
                if (!arg2.method2621(this.field2182[var4], -28975)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field2182.length; var5++) {
                if (!arg2.method2640(class24.field237, this.field2182[var5], 106)) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field2191.length; var6++) {
            if (!arg0.method1772(-5919, this.field2191[var6])) {
                return false;
            }
        }
        if (arg1 <= 62) {
            field2198 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lofa;I)Lge;")
    public static final class405 method1099(class301 arg0, int arg1) {
        field2192++;
        if (arg1 != 0) {
            method1093(40, -122, -122, null);
        }
        class325 var2 = class146.method1121(arg0, true);
        int var3 = arg0.method1977((byte) -116);
        return new class405(var2.field1081, var2.field1075, var2.field1082, var2.field1079, var2.field1076, var2.field1078, var2.field1071, var2.field1074, var2.field1073, var2.field4801, var2.field4796, var2.field4795, var2.field4797, var2.field4799, var2.field4794, var3);
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(ILjava/lang/String;IIZ)V")
    public static final void method1100(int arg0, String arg1, int arg2, int arg3, boolean arg4) {
        field2194++;
        if (arg0 != -4689) {
            method1095(-105);
        }
        class597.method3426(arg1, 0, null, arg4, false, arg2, arg3);
    }

    @OriginalMember(owner = "client!hv", name = "<init>", descriptor = "()V")
    public class140() {
        this.field2182 = new int[0];
        this.field2191 = new int[0];
        this.field2188 = new class526(0);
        this.field2188.field3534 = 1;
        this.field2187 = new class526();
        this.field2187.field3534 = 1;
        this.field2179 = new class526();
        this.field2183 = new class214[] { this.field2187, this.field2179, this.field2188 };
        this.field2179.field3534 = 1;
    }

    @OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(Lofa;)V")
    public class140(class301 arg0) {
        int var2 = arg0.method1987(-24);
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        this.field2183 = new class214[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            class214 var16 = class448.method2757(103, arg0);
            if (var16.method1543((byte) 121) >= 0) {
                var3++;
            }
            if (var16.method1538(true) >= 0) {
                var4++;
            }
            int var17 = var16.field3543.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method1987(-121);
            }
            this.field2183[var6] = var16;
        }
        this.field2182 = new int[var3];
        int var7 = 0;
        this.field2191 = new int[var4];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class214 var11 = this.field2183[var9];
            int var12 = var11.field3543.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field3543[var13] = this.field2183[var5[var9][var13]];
            }
            int var14 = var11.method1543((byte) 121);
            int var15 = var11.method1538(true);
            if (var14 > 0) {
                this.field2182[var7++] = var14;
            }
            if (var15 > 0) {
                this.field2191[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field2187 = this.field2183[arg0.method1987(-22)];
        this.field2179 = this.field2183[arg0.method1987(-66)];
        this.field2188 = this.field2183[arg0.method1987(-32)];
        Object var10 = null;
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field2186[var2] = (float) Math.sin((double) var2 * var0);
            field2184[var2] = (float) Math.cos((double) var2 * var0);
        }
        field2195 = new int[8];
    }
}
