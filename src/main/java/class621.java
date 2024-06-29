import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class621 extends class443 {

    @OriginalMember(owner = "client!tg", name = "H", descriptor = "[I")
    private int[] field8757;

    @OriginalMember(owner = "client!tg", name = "t", descriptor = "[I")
    private int[] field8744;

    @OriginalMember(owner = "client!tg", name = "x", descriptor = "Lvn;")
    private class328 field8748;

    @OriginalMember(owner = "client!tg", name = "y", descriptor = "Lvn;")
    private class328 field8749;

    @OriginalMember(owner = "client!tg", name = "A", descriptor = "Lvn;")
    private class328 field8751;

    @OriginalMember(owner = "client!tg", name = "D", descriptor = "[Lvn;")
    private class328[] field8754;

    @OriginalMember(owner = "client!tg", name = "z", descriptor = "[I")
    public static int[] field8750 = new int[3];

    @OriginalMember(owner = "client!tg", name = "F", descriptor = "Ljava/lang/String;")
    public static String field8755 = "";

    @OriginalMember(owner = "client!tg", name = "v", descriptor = "I")
    public static int field8746 = 0;

    @OriginalMember(owner = "client!tg", name = "C", descriptor = "Lbv;")
    public static class567 field8753 = new class567("Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Chargement de polices secondaires - ", "Carregando fontes principais - ");

    @OriginalMember(owner = "client!tg", name = "u", descriptor = "I")
    public static int field8745;

    @OriginalMember(owner = "client!tg", name = "w", descriptor = "I")
    public static int field8747;

    @OriginalMember(owner = "client!tg", name = "B", descriptor = "I")
    public static int field8752;

    @OriginalMember(owner = "client!tg", name = "G", descriptor = "I")
    public static int field8756;

    @OriginalMember(owner = "client!tg", name = "I", descriptor = "I")
    public static int field8758;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(DIILn;ZLgp;I)[I")
    public final int[] method3503(double arg0, int arg1, int arg2, class472 arg3, boolean arg4, class561 arg5, int arg6) {
        class108.field1801 = arg3;
        class145.field2232 = arg5;
        field8745++;
        int var9 = 0;
        int var10 = -64 % ((38 - arg2) / 60);
        while (this.field8754.length > var9) {
            this.field8754[var9].method461(arg6, arg1, -31);
            var9++;
        }
        class544.method3048(arg0, 255);
        class378.method2295(arg6, -128, arg1);
        int[] var11 = new int[arg1 * arg6 * 4];
        int var12 = 0;
        for (int var13 = 0; var13 < arg1; var13++) {
            int[] var16;
            int[] var17;
            int[] var18;
            if (this.field8749.field4728) {
                int[] var15 = this.field8749.method4(var13, 105);
                var16 = var15;
                var17 = var15;
                var18 = var15;
            } else {
                int[][] var19 = this.field8749.method7(var13, -70);
                var16 = var19[0];
                var18 = var19[1];
                var17 = var19[2];
            }
            if (arg4) {
                var12 = var13;
            }
            int[] var20;
            if (this.field8751.field4728) {
                var20 = this.field8751.method4(var13, -96);
            } else {
                var20 = this.field8751.method7(var13, -76)[0];
            }
            for (int var21 = arg6 - 1; var21 >= 0; var21--) {
                int var22 = var16[var21] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = var18[var21] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var24 = var17[var21] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                int var25 = class401.field5995[var23];
                if (var24 < 0) {
                    var24 = 0;
                }
                int var26 = class401.field5995[var22];
                int var27 = class401.field5995[var24];
                int var28;
                if (var26 == 0 && var25 == 0 && var27 == 0) {
                    var28 = 0;
                } else {
                    var28 = var20[var21] >> 4;
                    if (var28 > 255) {
                        var28 = 255;
                    }
                    if (var28 < 0) {
                        var28 = 0;
                    }
                }
                var11[var12++] = (var28 << 24) - (-(var26 << 16) - ((var25 << 8) + var27));
                if (arg4) {
                    var12 += arg6 - 1;
                }
            }
        }
        for (int var14 = 0; var14 < this.field8754.length; var14++) {
            this.field8754[var14].method456(7);
        }
        return var11;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(III)Lkd;")
    public static final class493 method3504(int arg0, int arg1, int arg2) {
        class184 var3 = class277.field4051[arg0][arg1][arg2];
        return var3 == null || var3.field2662 == null ? null : var3.field2662;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(DIIZILgp;Ln;Z)[I")
    public final int[] method3505(double arg0, int arg1, int arg2, boolean arg3, int arg4, class561 arg5, class472 arg6, boolean arg7) {
        class108.field1801 = arg6;
        class145.field2232 = arg5;
        field8747++;
        for (int var10 = 0; var10 < this.field8754.length; var10++) {
            this.field8754[var10].method461(arg2, arg1, -10);
        }
        class544.method3048(arg0, arg4 + 256);
        if (arg4 != -1) {
            this.method3507(-1, null, null);
        }
        class378.method2295(arg2, -128, arg1);
        int[] var11 = new int[arg1 * arg2];
        byte var12;
        int var13;
        int var14;
        if (arg3) {
            var12 = -1;
            var14 = -1;
            var13 = arg2 - 1;
        } else {
            var12 = 1;
            var13 = 0;
            var14 = arg2;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg1; var16++) {
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field8749.field4728) {
                int[] var22 = this.field8749.method4(var16, 117);
                var19 = var22;
                var20 = var22;
                var21 = var22;
            } else {
                int[][] var18 = this.field8749.method7(var16, arg4 + 114);
                var19 = var18[0];
                var20 = var18[1];
                var21 = var18[2];
            }
            if (arg7) {
                var15 = var16;
            }
            for (int var23 = var13; var23 != var14; var23 += var12) {
                int var24 = var19[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = var20[var23] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = var21[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                int var27 = class401.field5995[var24];
                int var28 = class401.field5995[var25];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var29 = class401.field5995[var26];
                int var30 = (var27 << 16) - (-(var28 << 8) - var29);
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg7) {
                    var15 += arg2 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field8754.length; var17++) {
            this.field8754[var17].method456(7);
        }
        return var11;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
    public static void method3506(int arg0) {
        if (arg0 >= -52) {
            method3506(61);
        }
        field8750 = null;
        field8755 = null;
        field8753 = null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILn;Lgp;)Z")
    public final boolean method3507(int arg0, class472 arg1, class561 arg2) {
        if (arg0 != 26002) {
            this.method3507(50, null, null);
        }
        field8752++;
        if (class458.field6600 >= 0) {
            for (int var4 = 0; var4 < this.field8757.length; var4++) {
                if (!arg2.method3187(this.field8757[var4], (byte) 67, class458.field6600)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field8757.length; var5++) {
                if (!arg2.method3186((byte) 57, this.field8757[var5])) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field8744.length; var6++) {
            if (!arg1.method2389(-54, this.field8744[var6])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Ln;Lgp;ZIII)[F")
    public final float[] method3508(class472 arg0, class561 arg1, boolean arg2, int arg3, int arg4, int arg5) {
        class145.field2232 = arg1;
        field8758++;
        class108.field1801 = arg0;
        if (arg3 <= 61) {
            this.field8744 = null;
        }
        for (int var7 = 0; var7 < this.field8754.length; var7++) {
            this.field8754[var7].method461(arg4, arg5, 73);
        }
        class378.method2295(arg4, -113, arg5);
        float[] var8 = new float[arg4 * arg5 * 4];
        int var9 = 0;
        for (int var10 = 0; var10 < arg5; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field8749.field4728) {
                int[] var16 = this.field8749.method4(var10, -33);
                var15 = var16;
                var14 = var16;
                var13 = var16;
            } else {
                int[][] var12 = this.field8749.method7(var10, 103);
                var13 = var12[0];
                var14 = var12[1];
                var15 = var12[2];
            }
            int[] var17;
            if (this.field8751.field4728) {
                var17 = this.field8751.method4(var10, 113);
            } else {
                var17 = this.field8751.method7(var10, -41)[0];
            }
            if (arg2) {
                var9 = var10 << 2;
            }
            int[] var18;
            if (this.field8748.field4728) {
                var18 = this.field8748.method4(var10, -37);
            } else {
                var18 = this.field8748.method7(var10, -92)[0];
            }
            for (int var19 = arg4 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                if (var20 < 0.0F) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = var20;
                if (arg2) {
                    var9 += (arg4 << 2) - 4;
                }
            }
        }
        for (int var11 = 0; var11 < this.field8754.length; var11++) {
            this.field8754[var11].method456(7);
        }
        return var8;
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "()V")
    public class621() {
        this.field8757 = new int[0];
        this.field8744 = new int[0];
        this.field8748 = new class492(0);
        this.field8748.field4719 = 1;
        this.field8749 = new class492();
        this.field8749.field4719 = 1;
        this.field8751 = new class492();
        this.field8754 = new class328[] { this.field8749, this.field8751, this.field8748 };
        this.field8751.field4719 = 1;
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Lco;)V")
    public class621(class268 arg0) {
        int var2 = arg0.method1738(255);
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        this.field8754 = new class328[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            class328 var16 = class68.method674(arg0, 0);
            if (var16.method1892((byte) 122) >= 0) {
                var3++;
            }
            if (var16.method458(20025) >= 0) {
                var4++;
            }
            int var17 = var16.field4727.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method1738(255);
            }
            this.field8754[var6] = var16;
        }
        this.field8757 = new int[var3];
        int var7 = 0;
        this.field8744 = new int[var4];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class328 var11 = this.field8754[var9];
            int var12 = var11.field4727.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field4727[var13] = this.field8754[var5[var9][var13]];
            }
            int var14 = var11.method1892((byte) 122);
            int var15 = var11.method458(20025);
            if (var14 > 0) {
                this.field8757[var7++] = var14;
            }
            if (var15 > 0) {
                this.field8744[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field8749 = this.field8754[arg0.method1738(255)];
        this.field8751 = this.field8754[arg0.method1738(255)];
        Object var10 = null;
        this.field8748 = this.field8754[arg0.method1738(255)];
    }
}
