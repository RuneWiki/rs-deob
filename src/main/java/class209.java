import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class209 {

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "[I")
    private int[] field3257;

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "[I")
    private int[] field3262;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "Lsb;")
    private class224 field3254;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "Lsb;")
    private class224 field3252;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "[Lsb;")
    private class224[] field3250;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "Ljava/lang/String;")
    public static String field3256 = "slide:";

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
    public static int field3259 = 0;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "Llf;")
    public static class211 field3255 = new class211(100);

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Ldl;ILie;)Z")
    public final boolean method1412(class123 arg0, int arg1, class32 arg2) {
        field3258++;
        if (class140.field2064 > 0) {
            for (int var4 = 0; var4 < this.field3262.length; var4++) {
                if (!arg0.method835(class140.field2064, 0, this.field3262[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field3262.length; var5++) {
                if (!arg0.method806(53, this.field3262[var5])) {
                    return false;
                }
            }
        }
        int var6 = 0;
        if (arg1 != -1) {
            return true;
        }
        while (var6 < this.field3257.length) {
            if (!arg2.method258(this.field3257[var6], arg1 ^ 0x1E69)) {
                return false;
            }
            var6++;
        }
        return true;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
    public static void method1413(int arg0) {
        field3255 = null;
        field3256 = null;
        if (arg0 != -89) {
            method1413(-38);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZLie;IDIZILdl;)[I")
    public final int[] method1414(boolean arg0, class32 arg1, int arg2, double arg3, int arg4, boolean arg5, int arg6, class123 arg7) {
        field3251++;
        int[] var10 = new int[arg2 * arg6];
        class7.method47(arg4 ^ 0x3, arg3);
        class73.field1039 = arg7;
        class117.field1726 = arg1;
        class38.method303(true, arg6, arg2);
        for (int var11 = arg4; var11 < this.field3250.length; var11++) {
            this.field3250[var11].method1530(arg6, false, arg2);
        }
        int var12;
        int var13;
        byte var14;
        if (arg5) {
            var12 = -1;
            var13 = arg2 - 1;
            var14 = -1;
        } else {
            var12 = arg2;
            var13 = 0;
            var14 = 1;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg6; var16++) {
            if (arg0) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field3254.field3624) {
                int[] var18 = this.field3254.method14(var16, true);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field3254.method15(var16, arg4 + 1);
                var20 = var22[2];
                var19 = var22[0];
                var21 = var22[1];
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
                int var27 = class226.field3649[var25];
                int var28 = class226.field3649[var24];
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var26 < 0) {
                    var26 = 0;
                }
                int var29 = class226.field3649[var26];
                var10[var15++] = (var27 << 8) + ((var28 << 16) + var29);
                if (arg0) {
                    var15 += arg2 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field3250.length; var17++) {
            this.field3250[var17].method300(true);
        }
        return var10;
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V")
    public class209() {
        this.field3257 = new int[0];
        this.field3262 = new int[0];
        this.field3254 = new class10();
        this.field3254.field3629 = 1;
        this.field3252 = new class10();
        this.field3250 = new class224[] { this.field3254, this.field3252 };
        this.field3252.field3629 = 1;
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Llj;)V")
    public class209(class25 arg0) {
        int var2 = arg0.method201(255);
        this.field3250 = new class224[var2];
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class224 var16 = class158.method1064(arg0, 26582);
            if (var16.method612(false) >= 0) {
                var3++;
            }
            if (var16.method304(-11055) >= 0) {
                var4++;
            }
            int var17 = var16.field3630.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method201(255);
            }
            this.field3250[var6] = var16;
        }
        this.field3262 = new int[var3];
        this.field3257 = new int[var4];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class224 var11 = this.field3250[var9];
            int var12 = var11.field3630.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field3630[var13] = this.field3250[var5[var9][var13]];
            }
            int var14 = var11.method612(false);
            int var15 = var11.method304(-11055);
            if (var14 > 0) {
                this.field3262[var7++] = var14;
            }
            if (var15 > 0) {
                this.field3257[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field3254 = this.field3250[arg0.method201(255)];
        Object var10 = null;
        this.field3252 = this.field3250[arg0.method201(255)];
    }
}
