import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class230 extends class219 {

    @OriginalMember(owner = "client!rj", name = "J", descriptor = "I")
    private int field3819 = 0;

    @OriginalMember(owner = "client!rj", name = "M", descriptor = "I")
    private int field3821 = 12288;

    @OriginalMember(owner = "client!rj", name = "X", descriptor = "I")
    private int field3832 = 2048;

    @OriginalMember(owner = "client!rj", name = "W", descriptor = "I")
    private int field3831 = 8192;

    @OriginalMember(owner = "client!rj", name = "Y", descriptor = "I")
    private int field3833 = 0;

    @OriginalMember(owner = "client!rj", name = "cb", descriptor = "I")
    private int field3837 = 2048;

    @OriginalMember(owner = "client!rj", name = "db", descriptor = "I")
    private int field3838 = 4096;

    @OriginalMember(owner = "client!rj", name = "V", descriptor = "[[I")
    public static int[][] field3830 = new int[][] { new int[0], { 128, 0, 128, 128, 0, 128 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 64, 0, 128, 0, 128, 128, 64, 128 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 128, 0, 0, 32, 32, 96, 32, 128, 0, 128, 128 } };

    @OriginalMember(owner = "client!rj", name = "Z", descriptor = "[I")
    public static int[] field3834 = new int[100];

    @OriginalMember(owner = "client!rj", name = "eb", descriptor = "Z")
    public static boolean field3839 = false;

    @OriginalMember(owner = "client!rj", name = "O", descriptor = "[I")
    public static int[] field3823 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!rj", name = "S", descriptor = "Lcj;")
    public static class182 field3827 = new class182(64);

    @OriginalMember(owner = "client!rj", name = "fb", descriptor = "Lbd;")
    private static class162 field3840 = class17.method142(0, "Loaded fonts");

    @OriginalMember(owner = "client!rj", name = "gb", descriptor = "Lbd;")
    public static class162 field3841 = field3840;

    @OriginalMember(owner = "client!rj", name = "ib", descriptor = "Lbd;")
    public static class162 field3843 = class17.method142(0, "Abbrechen");

    @OriginalMember(owner = "client!rj", name = "jb", descriptor = "Lbd;")
    public static class162 field3844 = class17.method142(0, "hitbar_default");

    @OriginalMember(owner = "client!rj", name = "L", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!rj", name = "N", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!rj", name = "P", descriptor = "I")
    public static int field3824;

    @OriginalMember(owner = "client!rj", name = "Q", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!rj", name = "R", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!rj", name = "T", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!rj", name = "U", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!rj", name = "ab", descriptor = "I")
    public static int field3835;

    @OriginalMember(owner = "client!rj", name = "bb", descriptor = "I")
    public static int field3836;

    @OriginalMember(owner = "client!rj", name = "hb", descriptor = "Lda;")
    public static class143 field3842;

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "()V", line = 3)
    public class230() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIIIIII)V", line = 12)
    public static final void method1640(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3828++;
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            class203.field3443 = -1;
            class86.field1533 = -1;
            return;
        }
        int var8 = class3.method15(arg0, class157.field2765, arg1, false) - arg5;
        int var9 = arg1 - class67.field1083;
        int var10 = var8 - class18.field294;
        int var11 = class312.field5262[class216.field3613];
        int var12 = arg0 - class160.field2800;
        if (arg3 != -1) {
            return;
        }
        int var13 = class312.field5269[class216.field3613];
        int var14 = class312.field5262[class180.field3088];
        int var15 = class312.field5269[class180.field3088];
        int var16 = var9 * var14 + var12 * var15 >> 16;
        int var17 = var9 * var15 - var12 * var14 >> 16;
        int var19 = var10 * var13 - var11 * var17 >> 16;
        int var20 = var10 * var11 + var13 * var17 >> 16;
        if (var20 < 50) {
            class203.field3443 = -1;
            class86.field1533 = -1;
        } else if (class117.field2159) {
            int var22 = arg2 * 512 >> 8;
            int var23 = arg4 * 512 >> 8;
            class203.field3443 = var19 * var22 / var20 + arg7;
            class86.field1533 = var16 * var23 / var20 + arg6;
        } else {
            class86.field1533 = (var16 << 9) / var20 + arg6;
            class203.field3443 = (var19 << 9) / var20 + arg7;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ZI)[I", line = 88)
    public final int[] method41(boolean arg0, int arg1) {
        field3835++;
        int[] var3 = this.field3654.method2032(3, arg1);
        if (this.field3654.field4967) {
            int var4 = class53.field842[arg1] - 2048;
            for (int var5 = 0; var5 < class128.field2326; var5++) {
                int var6 = class280.field4762[var5] - 2048;
                int var7 = var4 + this.field3819;
                int var8 = this.field3832 + var6;
                int var9 = var8 >= -2048 ? var8 : var8 + 4096;
                int var10 = var7 < -2048 ? var7 + 4096 : var7;
                int var11 = var10 > 2048 ? var10 - 4096 : var10;
                int var12 = var9 <= 2048 ? var9 : var9 - 4096;
                int var13 = var6 + this.field3833;
                int var14 = this.field3837 + var4;
                int var15 = var13 < -2048 ? var13 + 4096 : var13;
                int var16 = var15 <= 2048 ? var15 : var15 - 4096;
                int var17 = var14 < -2048 ? var14 + 4096 : var14;
                int var18 = var17 > 2048 ? var17 - 4096 : var17;
                var3[var5] = this.method1641(var12, true, var11) || this.method1643(-20835, var18, var16) ? 4096 : 0;
            }
        }
        if (!arg0) {
            this.method39((byte) 6);
        }
        return var3;
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(IZI)Z", line = 147)
    private final boolean method1641(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            return true;
        }
        field3824++;
        int var4 = (arg2 - arg0) * this.field3821 >> 12;
        int var5 = class31.field518[(var4 * 255 & 0xFFD53) >> 12];
        int var6 = (var5 << 12) / this.field3821;
        int var7 = (var6 << 12) / this.field3831;
        int var8 = this.field3838 * var7 >> 12;
        return var8 > (arg0 + arg2) && (-var8) < (arg0 + arg2);
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(B)V", line = 164)
    public final void method39(byte arg0) {
        class165.method1302(112);
        field3820++;
        if (arg0 != 22) {
            this.method1641(-53, true, 61);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIII)V", line = 177)
    public static final void method1642(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3825++;
        class63 var5 = class46.method332(arg0, arg3, -12770);
        var5.method430(false);
        var5.field980 = arg1;
        var5.field971 = arg2;
        var5.field976 = arg4;
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(III)Z", line = 206)
    private final boolean method1643(int arg0, int arg1, int arg2) {
        field3836++;
        int var4 = (arg1 + arg2) * this.field3821 >> 12;
        int var5 = class31.field518[var4 * 255 >> 12 & 0xFF];
        int var6 = (var5 << 12) / this.field3821;
        if (arg0 != -20835) {
            this.field3821 = -30;
        }
        int var7 = (var6 << 12) / this.field3831;
        int var8 = this.field3838 * var7 >> 12;
        return arg1 - arg2 < var8 && -var8 < arg1 - arg2;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IILb;)V", line = 224)
    public final void method42(int arg0, int arg1, class94 arg2) {
        if (arg1 != 0) {
            return;
        }
        field3826++;
        if (arg0 == 0) {
            this.field3832 = arg2.method761((byte) 108);
        } else if (arg0 == 1) {
            this.field3819 = arg2.method761((byte) 108);
        } else if (arg0 == 2) {
            this.field3833 = arg2.method761((byte) 108);
        } else if (arg0 == 3) {
            this.field3837 = arg2.method761((byte) 108);
        } else if (arg0 == 4) {
            this.field3821 = arg2.method761((byte) 108);
        } else if (arg0 == 5) {
            this.field3838 = arg2.method761((byte) 108);
        } else if (arg0 == 6) {
            this.field3831 = arg2.method761((byte) 108);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILdj;)V", line = 304)
    public static final void method1644(int arg0, class39 arg1) {
        field3829++;
        class64 var2 = (class64) class51.field811.method1672(arg1.field611.method1256(arg0 + arg0), 19760);
        if (var2 == null) {
            return;
        }
        if (var2.field1003 != null) {
            class313.field5290.method449(var2.field1003);
            var2.field1003 = null;
        }
        var2.method1183(false);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lrk;IIIII)V", line = 332)
    public static final void method1645(class255 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class53.field850 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class32.field524) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class158.field2787 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class225 var14 = class288.field4856[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class206.field3473[var11][var12 + 1][var13] + class206.field3473[var11][var12][var13] + class206.field3473[var11][var12][var13 + 1] + class206.field3473[var11][var12 + 1][var13 + 1]) / 4 - (class206.field3473[arg1][arg2 + 1][arg3] + class206.field3473[arg1][arg2][arg3] + class206.field3473[arg1][arg2][arg3 + 1] + class206.field3473[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class273 var16 = var14.field3753;
                                    if (var16 != null) {
                                        if (var16.field4527.method824()) {
                                            arg0.method797(var16.field4527, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field4534 != null && var16.field4534.method824()) {
                                            arg0.method797(var16.field4534, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field3756; var17++) {
                                        class43 var18 = var14.field3765[var17];
                                        if (var18 != null && var18.field712.method824() && (var18.field711 == var12 || var7 == var12) && (var18.field699 == var13 || var9 == var13)) {
                                            int var19 = var18.field707 + 1 - var18.field711;
                                            int var20 = var18.field701 + 1 - var18.field699;
                                            arg0.method797(var18.field712, (var18.field711 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field699 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(I)V", line = 427)
    public static void method1646(int arg0) {
        field3844 = null;
        field3834 = null;
        if (arg0 != 128) {
            return;
        }
        field3823 = null;
        field3840 = null;
        field3842 = null;
        field3830 = (int[][]) null;
        field3843 = null;
        field3841 = null;
        field3827 = null;
    }
}
