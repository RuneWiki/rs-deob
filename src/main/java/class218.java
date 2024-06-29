import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class218 {

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "I")
    public int field3633 = -1;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "Z")
    public boolean field3631 = false;

    @OriginalMember(owner = "client!nj", name = "p", descriptor = "[I")
    private int[] field3641 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!nj", name = "r", descriptor = "[I")
    public static int[] field3643 = new int[5];

    @OriginalMember(owner = "client!nj", name = "x", descriptor = "Lqd;")
    private static class40 field3649 = class147.method1106("Drop", (byte) -108);

    @OriginalMember(owner = "client!nj", name = "q", descriptor = "Lqd;")
    public static class40 field3642 = field3649;

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "Lwh;")
    public static class9 field3634 = new class9();

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "I")
    public static int field3627;

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!nj", name = "m", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!nj", name = "o", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!nj", name = "u", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!nj", name = "v", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!nj", name = "w", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "[I")
    private int[] field3626;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "[S")
    private short[] field3628;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "[S")
    private short[] field3629;

    @OriginalMember(owner = "client!nj", name = "s", descriptor = "[S")
    private short[] field3644;

    @OriginalMember(owner = "client!nj", name = "t", descriptor = "[S")
    private short[] field3645;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lrb;B)Lrb;", line = 5)
    public static final class213 method1525(class213 arg0, byte arg1) {
        class213 var2 = client.method1732(arg0);
        if (var2 == null) {
            var2 = arg0.field3446;
        }
        if (arg1 == 17) {
            field3647++;
            return var2;
        } else {
            return (class213) null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZIIIIBI)V", line = 21)
    public static final void method1526(boolean arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        class255.field4246 = arg2;
        class68.field1249 = arg4;
        if (arg5 != -98) {
            method1527((byte) -100);
        }
        class233.field3836 = arg1;
        class210.field3349 = arg6;
        field3636++;
        class244.field4023 = arg3;
        if (arg0 && class68.field1249 >= 100) {
            class289.field4841 = class244.field4023 * 128 + 64;
            class238.field3922 = class233.field3836 * 128 + 64;
            class116.field1988 = class293.method2012(class160.field2671, class289.field4841, 0, class238.field3922) - class210.field3349;
        }
        class103.field1814 = 2;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)V", line = 47)
    public static void method1527(byte arg0) {
        if (arg0 != -63) {
            method1525((class213) null, (byte) 35);
        }
        field3643 = null;
        field3649 = null;
        field3634 = null;
        field3642 = null;
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(B)Lal;", line = 60)
    public final class311 method1528(byte arg0) {
        field3639++;
        if (this.field3626 == null) {
            return null;
        }
        class311[] var2 = new class311[this.field3626.length];
        if (arg0 != -128) {
            this.method1528((byte) -8);
        }
        for (int var3 = 0; var3 < this.field3626.length; var3++) {
            var2[var3] = class311.method2145(class61.field1161, this.field3626[var3], 0);
        }
        class311 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class311(var2, var2.length);
        }
        if (this.field3629 != null) {
            for (int var5 = 0; var5 < this.field3629.length; var5++) {
                var4.method2127(this.field3629[var5], this.field3644[var5]);
            }
        }
        if (this.field3628 != null) {
            for (int var6 = 0; var6 < this.field3628.length; var6++) {
                var4.method2149(this.field3628[var6], this.field3645[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lrg;[[F[[I[[FIIILcf;[[F[II)V", line = 130)
    public static final void method1529(class90 arg0, float[][] arg1, int[][] arg2, float[][] arg3, int arg4, int arg5, int arg6, class124 arg7, float[][] arg8, int[] arg9, int arg10) {
        field3640++;
        int[] var11 = new int[arg9.length / 2];
        for (int var12 = 0; var12 < var11.length; var12++) {
            int var13 = arg9[var12 + var12 + 1];
            int var14 = arg9[var12 + var12];
            if (arg6 == 1) {
                int var15 = var14;
                var14 = var13;
                var13 = 128 - var15;
            } else if (arg6 == 2) {
                var13 = 128 - var13;
                var14 = 128 - var14;
            } else if (arg6 == 3) {
                int var16 = var14;
                var14 = 128 - var13;
                var13 = var16;
            }
            float var17;
            float var18;
            float var19;
            if (var14 == 0 && var13 == 0) {
                var17 = arg1[arg10][arg4];
                var18 = arg8[arg10][arg4];
                var19 = arg3[arg10][arg4];
            } else if (var14 == 128 && var13 == 0) {
                var19 = arg3[arg10 + 1][arg4];
                var18 = arg8[arg10 + 1][arg4];
                var17 = arg1[arg10 + 1][arg4];
            } else if (var14 == 128 && var13 == 128) {
                var18 = arg8[arg10 + 1][arg4 + 1];
                var19 = arg3[arg10 + 1][arg4 + 1];
                var17 = arg1[arg10 + 1][arg4 + 1];
            } else if (var14 == 0 && var13 == 128) {
                var17 = arg1[arg10][arg4 + 1];
                var19 = arg3[arg10][arg4 + 1];
                var18 = arg8[arg10][arg4 + 1];
            } else {
                float var20 = arg3[arg10][arg4];
                float var21 = (float) var14 / 128.0F;
                float var22 = (arg3[arg10 + 1][arg4] - var20) * var21 + var20;
                float var23 = arg3[arg10][arg4 + 1];
                float var24 = arg8[arg10][arg4];
                float var25 = (arg8[arg10 + 1][arg4] - var24) * var21 + var24;
                float var26 = arg1[arg10][arg4 + 1];
                float var27 = (arg1[arg10 + 1][arg4 + 1] - var26) * var21 + var26;
                float var28 = arg1[arg10][arg4];
                float var29 = (float) var13 / 128.0F;
                float var30 = (arg3[arg10 + 1][arg4 + 1] - var23) * var21 + var23;
                float var31 = arg8[arg10][arg4 + 1];
                var19 = (var30 - var22) * var29 + var22;
                float var32 = (arg8[arg10 + 1][arg4 + 1] - var31) * var21 + var31;
                float var33 = (arg1[arg10 + 1][arg4] - var28) * var21 + var28;
                var17 = (var27 - var33) * var29 + var33;
                var18 = (var32 - var25) * var29 + var25;
            }
            int var34 = (arg4 << 7) + var13;
            int var35 = (arg10 << 7) + var14;
            int var36 = class140.method1038(var14, arg2, 0, var13, arg4, arg10);
            var11[var12] = arg7.method937(arg0, var35, var36, var34, var18, var17, var19);
        }
        arg7.method934(var11);
        if (arg5 != -4579) {
            method1534(-17, true, (class107) null, -123, -29, 38);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)Lal;", line = 247)
    public final class311 method1530(int arg0) {
        class311[] var2 = new class311[5];
        field3638++;
        int var3 = 0;
        for (int var4 = arg0; var4 < 5; var4++) {
            if (this.field3641[var4] != -1) {
                var2[var3++] = class311.method2145(class61.field1161, this.field3641[var4], 0);
            }
        }
        class311 var5 = new class311(var2, var3);
        if (this.field3629 != null) {
            for (int var6 = 0; var6 < this.field3629.length; var6++) {
                var5.method2127(this.field3629[var6], this.field3644[var6]);
            }
        }
        if (this.field3628 != null) {
            for (int var7 = 0; var7 < this.field3628.length; var7++) {
                var5.method2149(this.field3628[var7], this.field3645[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(B)Z", line = 311)
    public final boolean method1531(byte arg0) {
        field3627++;
        if (this.field3626 == null) {
            return true;
        } else if (arg0 < 31) {
            return true;
        } else {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field3626.length; var3++) {
                if (!class61.field1161.method1657(this.field3626[var3], 0, 0)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)Z", line = 347)
    public final boolean method1532(int arg0) {
        field3648++;
        boolean var2 = true;
        for (int var3 = arg0; var3 < 5; var3++) {
            if (this.field3641[var3] != -1 && !class61.field1161.method1657(this.field3641[var3], 0, 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lsd;B)V", line = 372)
    public final void method1533(class26 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method226(255);
            if (var3 == 0) {
                field3632++;
                int var4 = 78 % ((arg1 + 1) / 57);
                return;
            }
            this.method1535(var3, arg0, -129);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IZLke;III)Ljava/awt/Frame;", line = 398)
    public static final Frame method1534(int arg0, boolean arg1, class107 arg2, int arg3, int arg4, int arg5) {
        field3637++;
        if (!arg2.method801(1)) {
            return null;
        }
        if (arg5 == 0) {
            class197[] var6 = class265.method1856(arg2, 4);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field3162 == arg4 && var6[var8].field3163 == arg0 && (arg3 == 0 || var6[var8].field3165 == arg3) && (!var7 || var6[var8].field3158 > arg5)) {
                    arg5 = var6[var8].field3158;
                    var7 = true;
                }
            }
            if (!var7) {
                return null;
            }
        }
        if (arg1) {
            field3643 = (int[]) null;
        }
        class70 var9 = arg2.method806(arg4, arg0, arg5, arg3, 6);
        while (var9.field1258 == 0) {
            class160.method1227(10L, false);
        }
        Frame var10 = (Frame) var9.field1260;
        if (var10 == null) {
            return null;
        } else if (var9.field1258 == 2) {
            class194.method1382(arg2, var10, (byte) -64);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILsd;I)V", line = 496)
    private final void method1535(int arg0, class26 arg1, int arg2) {
        if (arg2 != -129) {
            return;
        }
        if (arg0 == 1) {
            this.field3633 = arg1.method226(255);
        } else if (arg0 == 2) {
            int var8 = arg1.method226(arg2 ^ 0xFFFFFF80);
            this.field3626 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3626[var9] = arg1.method197(-1);
            }
        } else if (arg0 == 3) {
            this.field3631 = true;
        } else if (arg0 == 40) {
            int var6 = arg1.method226(255);
            this.field3629 = new short[var6];
            this.field3644 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3629[var7] = (short) arg1.method197(-1);
                this.field3644[var7] = (short) arg1.method197(-1);
            }
        } else if (arg0 == 41) {
            int var4 = arg1.method226(255);
            this.field3645 = new short[var4];
            this.field3628 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3628[var5] = (short) arg1.method197(arg2 + 128);
                this.field3645[var5] = (short) arg1.method197(arg2 + 128);
            }
        } else if (arg0 >= 60 && arg0 < 70) {
            this.field3641[arg0 - 60] = arg1.method197(-1);
        }
        field3646++;
    }
}
