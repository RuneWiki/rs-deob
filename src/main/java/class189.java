import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class189 extends class305 {

    @OriginalMember(owner = "client!nm", name = "N", descriptor = "[I")
    private int[] field3068;

    @OriginalMember(owner = "client!nm", name = "T", descriptor = "[I")
    private int[] field3074;

    @OriginalMember(owner = "client!nm", name = "R", descriptor = "Lic;")
    private class21 field3072;

    @OriginalMember(owner = "client!nm", name = "Q", descriptor = "Lic;")
    private class21 field3071;

    @OriginalMember(owner = "client!nm", name = "I", descriptor = "Lic;")
    private class21 field3063;

    @OriginalMember(owner = "client!nm", name = "M", descriptor = "[Lic;")
    private class21[] field3067;

    @OriginalMember(owner = "client!nm", name = "P", descriptor = "I")
    public static int field3070 = -1;

    @OriginalMember(owner = "client!nm", name = "S", descriptor = "S")
    public static short field3073 = 320;

    @OriginalMember(owner = "client!nm", name = "D", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!nm", name = "E", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!nm", name = "F", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!nm", name = "G", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!nm", name = "H", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!nm", name = "J", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!nm", name = "K", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!nm", name = "L", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!nm", name = "U", descriptor = "I")
    public static int field3075;

    @OriginalMember(owner = "client!nm", name = "V", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!nm", name = "W", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!nm", name = "O", descriptor = "Lkl;")
    public static class68 field3069;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lgb;IDZZLbm;II)[I", line = 4)
    public final int[] method1205(class229 arg0, int arg1, double arg2, boolean arg3, boolean arg4, class307 arg5, int arg6, int arg7) {
        class164.method1049(-7319, arg2);
        class298.field4528 = arg0;
        field3060++;
        class48.field996 = arg5;
        class234.method1553(true, arg7, arg6);
        for (int var10 = 0; var10 < this.field3067.length; var10++) {
            this.field3067[var10].method169(arg6, (byte) 90, arg7);
        }
        int[] var11 = new int[arg6 * arg7];
        if (arg1 != 10100) {
            field3069 = (class68) null;
        }
        byte var12;
        int var13;
        int var14;
        if (arg4) {
            var12 = -1;
            var13 = -1;
            var14 = arg6 - 1;
        } else {
            var12 = 1;
            var14 = 0;
            var13 = arg6;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg7; var16++) {
            if (arg3) {
                var15 = var16;
            }
            int[] var18;
            int[] var19;
            int[] var20;
            if (this.field3071.field444) {
                int[] var21 = this.field3071.method177(arg1 ^ 0x272E, var16);
                var18 = var21;
                var19 = var21;
                var20 = var21;
            } else {
                int[][] var17 = this.field3071.method175(var16, (byte) 59);
                var18 = var17[2];
                var19 = var17[1];
                var20 = var17[0];
            }
            for (int var22 = var14; var22 != var13; var22 += var12) {
                int var23 = var19[var22] >> 4;
                int var24 = var20[var22] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = class220.field3491[var24];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var26 = class220.field3491[var23];
                int var27 = var18[var22] >> 4;
                if (var27 > 255) {
                    var27 = 255;
                }
                if (var27 < 0) {
                    var27 = 0;
                }
                int var28 = class220.field3491[var27];
                var11[var15++] = (var25 << 16) + (var26 << 8) + var28;
                if (arg3) {
                    var15 += arg6 - 1;
                }
            }
        }
        for (int var29 = 0; var29 < this.field3067.length; var29++) {
            this.field3067[var29].method174(-107);
        }
        return var11;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIZLbm;DILgb;)[I", line = 133)
    public final int[] method1206(int arg0, int arg1, boolean arg2, class307 arg3, double arg4, int arg5, class229 arg6) {
        field3065++;
        if (arg5 > -5) {
            return (int[]) null;
        }
        class164.method1049(-7319, arg4);
        class48.field996 = arg3;
        class298.field4528 = arg6;
        int[] var9 = new int[arg0 * 4 * arg1];
        class234.method1553(true, arg0, arg1);
        for (int var10 = 0; var10 < this.field3067.length; var10++) {
            this.field3067[var10].method169(arg1, (byte) 105, arg0);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg0; var12++) {
            if (arg2) {
                var11 = var12;
            }
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field3071.field444) {
                int[] var17 = this.field3071.method177(69, var12);
                var15 = var17;
                var14 = var17;
                var16 = var17;
            } else {
                int[][] var13 = this.field3071.method175(var12, (byte) 90);
                var14 = var13[1];
                var15 = var13[0];
                var16 = var13[2];
            }
            int[] var18;
            if (this.field3063.field444) {
                var18 = this.field3063.method177(82, var12);
            } else {
                var18 = this.field3063.method175(var12, (byte) 74)[0];
            }
            for (int var19 = arg1 - 1; var19 >= 0; var19--) {
                int var20 = var15[var19] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                if (var20 < 0) {
                    var20 = 0;
                }
                int var21 = class220.field3491[var20];
                int var22 = var14[var19] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                int var23 = var16[var19] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var24 = class220.field3491[var23];
                if (var22 < 0) {
                    var22 = 0;
                }
                int var25 = class220.field3491[var22];
                int var26;
                if (var21 == 0 && var25 == 0 && var24 == 0) {
                    var26 = 0;
                } else {
                    var26 = var18[var19] >> 4;
                    if (var26 > 255) {
                        var26 = 255;
                    }
                    if (var26 < 0) {
                        var26 = 0;
                    }
                }
                var9[var11++] = (var21 << 16) + (var26 << 24) - (-(var25 << 8) + -var24);
                if (arg2) {
                    var11 += arg1 - 1;
                }
            }
        }
        for (int var27 = 0; var27 < this.field3067.length; var27++) {
            this.field3067[var27].method174(-82);
        }
        return var9;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZLbm;DBLgb;II)Lji;", line = 279)
    public final class300 method1207(boolean arg0, class307 arg1, double arg2, byte arg3, class229 arg4, int arg5, int arg6) {
        if (arg3 <= 5) {
            this.field3067 = (class21[]) null;
        }
        field3064++;
        class164.method1049(-7319, arg2);
        class48.field996 = arg1;
        class298.field4528 = arg4;
        class234.method1553(true, arg6, arg5);
        class300 var9 = new class300(arg5, arg6);
        for (int var10 = 0; var10 < this.field3067.length; var10++) {
            this.field3067[var10].method169(arg5, (byte) 86, arg6);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg6; var12++) {
            if (arg0) {
                var11 = var12 << 2;
            }
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field3071.field444) {
                int[] var17 = this.field3071.method177(-128, var12);
                var15 = var17;
                var14 = var17;
                var16 = var17;
            } else {
                int[][] var13 = this.field3071.method175(var12, (byte) 18);
                var14 = var13[0];
                var15 = var13[1];
                var16 = var13[2];
            }
            int[] var18;
            if (this.field3063.field444) {
                var18 = this.field3063.method177(114, var12);
            } else {
                var18 = this.field3063.method175(var12, (byte) 66)[0];
            }
            for (int var19 = arg5 - 1; var19 >= 0; var19--) {
                int var20 = var15[var19] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                if (var20 < 0) {
                    var20 = 0;
                }
                int var21 = var14[var19] >> 4;
                int var22 = class220.field3491[var20];
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var23 = class220.field3491[var21];
                int var24 = var16[var19] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = class220.field3491[var24];
                int var26;
                if (var23 == 0 && var22 == 0 && var25 == 0) {
                    var26 = 0;
                } else {
                    var26 = var18[var19] >> 4;
                    if (var26 > 255) {
                        var26 = 255;
                    }
                    if (var26 < 0) {
                        var26 = 0;
                    }
                }
                var9.field3353[var11++] = (var23 << 16) + (var26 << 24) + (var22 << 8) + var25;
                if (arg0) {
                    var11 += (arg5 << 2) - 4;
                }
            }
        }
        for (int var27 = 0; var27 < this.field3067.length; var27++) {
            this.field3067[var27].method174(-98);
        }
        return var9;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ILbm;BZDILgb;)Lfd;", line = 426)
    public final class206 method1208(int arg0, class307 arg1, byte arg2, boolean arg3, double arg4, int arg5, class229 arg6) {
        class164.method1049(-7319, arg4);
        class298.field4528 = arg6;
        class48.field996 = arg1;
        field3077++;
        class234.method1553(true, arg0, arg5);
        class206 var9 = new class206(arg5, arg0);
        if (arg2 < 2) {
            return (class206) null;
        }
        for (int var10 = 0; var10 < this.field3067.length; var10++) {
            this.field3067[var10].method169(arg5, (byte) 117, arg0);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg0; var12++) {
            if (arg3) {
                var11 = var12;
            }
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field3071.field444) {
                int[] var13 = this.field3071.method177(93, var12);
                var14 = var13;
                var15 = var13;
                var16 = var13;
            } else {
                int[][] var17 = this.field3071.method175(var12, (byte) 123);
                var15 = var17[2];
                var16 = var17[1];
                var14 = var17[0];
            }
            for (int var18 = 0; var18 != arg5; var18++) {
                int var19 = var14[var18] >> 4;
                int var20 = var16[var18] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                if (var20 < 0) {
                    var20 = 0;
                }
                int var21 = class220.field3491[var20];
                int var22 = var15[var18] >> 4;
                if (var19 > 255) {
                    var19 = 255;
                }
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = class220.field3491[var22];
                if (var19 < 0) {
                    var19 = 0;
                }
                int var24 = class220.field3491[var19];
                var9.field3353[var11++] = (var24 << 16) + (var21 << 8) + var23;
                if (arg3) {
                    var11 += arg5 - 1;
                }
            }
        }
        for (int var25 = 0; var25 < this.field3067.length; var25++) {
            this.field3067[var25].method174(-125);
        }
        return var9;
    }

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "(I)V", line = 536)
    public static void method1209(int arg0) {
        if (arg0 != 0) {
            field3069 = (class68) null;
        }
        field3069 = null;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lgb;Lbm;Z)Z", line = 552)
    public final boolean method1210(class229 arg0, class307 arg1, boolean arg2) {
        field3062++;
        if (class90.field1665 <= 0) {
            for (int var4 = 0; var4 < this.field3074.length; var4++) {
                if (!arg1.method2051(-98, this.field3074[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field3074.length; var5++) {
                if (!arg1.method2044((byte) 70, class90.field1665, this.field3074[var5])) {
                    return false;
                }
            }
        }
        if (arg2) {
            this.method1207(true, (class307) null, -1.6291785015933322D, (byte) 55, (class229) null, -51, 102);
        }
        for (int var6 = 0; var6 < this.field3068.length; var6++) {
            if (!arg0.method958(!arg2, this.field3068[var6])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IZLbm;IILgb;)[F", line = 616)
    public final float[] method1211(int arg0, boolean arg1, class307 arg2, int arg3, int arg4, class229 arg5) {
        class48.field996 = arg2;
        class298.field4528 = arg5;
        field3066++;
        float[] var7 = new float[arg0 * arg4 * 4];
        class234.method1553(true, arg4, arg0);
        for (int var8 = 0; var8 < this.field3067.length; var8++) {
            this.field3067[var8].method169(arg0, (byte) -68, arg4);
        }
        int var9 = 0;
        for (int var10 = 0; var10 < arg4; var10++) {
            if (arg1) {
                var9 = var10 << 2;
            }
            int[] var12;
            int[] var13;
            int[] var14;
            if (this.field3071.field444) {
                int[] var15 = this.field3071.method177(arg3 ^ 0xFFFFCBA7, var10);
                var13 = var15;
                var14 = var15;
                var12 = var15;
            } else {
                int[][] var11 = this.field3071.method175(var10, (byte) 91);
                var12 = var11[0];
                var13 = var11[1];
                var14 = var11[2];
            }
            int[] var16;
            if (this.field3063.field444) {
                var16 = this.field3063.method177(arg3 + 13312, var10);
            } else {
                var16 = this.field3063.method175(var10, (byte) 33)[0];
            }
            int[] var17;
            if (this.field3072.field444) {
                var17 = this.field3072.method177(76, var10);
            } else {
                var17 = this.field3072.method175(var10, (byte) 57)[0];
            }
            for (int var18 = arg0 - 1; var18 >= 0; var18--) {
                float var19 = (float) var16[var18] / 4096.0F;
                if (var19 < 0.0F) {
                    var19 = 0.0F;
                } else if (var19 > 1.0F) {
                    var19 = 1.0F;
                }
                float var20 = ((float) var17[var18] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                var7[var9++] = (float) var12[var18] * var20;
                var7[var9++] = (float) var13[var18] * var20;
                var7[var9++] = (float) var14[var18] * var20;
                var7[var9++] = var19;
                if (arg1) {
                    var9 += (arg0 << 2) - 4;
                }
            }
        }
        for (int var21 = 0; var21 < this.field3067.length; var21++) {
            this.field3067[var21].method174(-76);
        }
        if (arg3 != -13351) {
            field3058 = 46;
        }
        return var7;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IZI)I", line = 722)
    public static final int method1212(int arg0, boolean arg1, int arg2) {
        field3075++;
        if (arg1) {
            field3073 = -38;
        }
        int var3 = arg0 + (arg2 * 57);
        int var4 = var3 << 13 ^ var3;
        int var5 = (var4 * 15731 * var4 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        return (var5 & 0x7FA3462) >> 19;
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "()V", line = 737)
    public class189() {
        this.field3068 = new int[0];
        this.field3074 = new int[0];
        this.field3072 = new class43(0);
        this.field3072.field436 = 1;
        this.field3071 = new class43();
        this.field3071.field436 = 1;
        this.field3063 = new class43();
        this.field3067 = new class21[] { this.field3071, this.field3063, this.field3072 };
        this.field3063.field436 = 1;
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lag;)V", line = 753)
    public class189(class202 arg0) {
        int var2 = arg0.method1317((byte) -112);
        int var3 = 0;
        int var4 = 0;
        this.field3067 = new class21[var2];
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class21 var7 = class93.method625(arg0, -127);
            if (var7.method179(true) >= 0) {
                var3++;
            }
            if (var7.method184((byte) 25) >= 0) {
                var4++;
            }
            int var8 = var7.field430.length;
            var5[var6] = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                var5[var6][var9] = arg0.method1317((byte) -107);
            }
            this.field3067[var6] = var7;
        }
        this.field3068 = new int[var4];
        int var10 = 0;
        this.field3074 = new int[var3];
        int var11 = 0;
        for (int var12 = 0; var12 < var2; var12++) {
            class21 var13 = this.field3067[var12];
            int var14 = var13.field430.length;
            for (int var15 = 0; var15 < var14; var15++) {
                var13.field430[var15] = this.field3067[var5[var12][var15]];
            }
            int var16 = var13.method179(true);
            int var17 = var13.method184((byte) 25);
            if (var16 > 0) {
                this.field3074[var11++] = var16;
            }
            if (var17 > 0) {
                this.field3068[var10++] = var17;
            }
            var5[var12] = null;
        }
        int[][] var18 = (int[][]) null;
        this.field3071 = this.field3067[arg0.method1317((byte) -90)];
        this.field3063 = this.field3067[arg0.method1317((byte) -83)];
        this.field3072 = this.field3067[arg0.method1317((byte) -106)];
    }
}
