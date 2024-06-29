import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class191 extends class38 {

    @OriginalMember(owner = "client!uc", name = "lb", descriptor = "B")
    private byte field3685 = 0;

    @OriginalMember(owner = "client!uc", name = "ob", descriptor = "I")
    private int field3688 = 0;

    @OriginalMember(owner = "client!uc", name = "nb", descriptor = "[I")
    private int[] field3687;

    @OriginalMember(owner = "client!uc", name = "Ib", descriptor = "[I")
    private int[] field3708;

    @OriginalMember(owner = "client!uc", name = "pb", descriptor = "[I")
    private int[] field3689;

    @OriginalMember(owner = "client!uc", name = "qb", descriptor = "[B")
    private byte[] field3690;

    @OriginalMember(owner = "client!uc", name = "yb", descriptor = "[B")
    private byte[] field3698;

    @OriginalMember(owner = "client!uc", name = "vb", descriptor = "[I")
    private int[] field3695;

    @OriginalMember(owner = "client!uc", name = "wb", descriptor = "[I")
    private int[] field3696;

    @OriginalMember(owner = "client!uc", name = "ub", descriptor = "[I")
    private int[] field3694;

    @OriginalMember(owner = "client!uc", name = "sb", descriptor = "[S")
    private short[] field3692;

    @OriginalMember(owner = "client!uc", name = "rb", descriptor = "[I")
    private int[] field3691;

    @OriginalMember(owner = "client!uc", name = "xb", descriptor = "[I")
    private int[] field3697;

    @OriginalMember(owner = "client!uc", name = "tb", descriptor = "[I")
    private int[] field3693;

    @OriginalMember(owner = "client!uc", name = "mb", descriptor = "[B")
    private byte[] field3686;

    @OriginalMember(owner = "client!uc", name = "zb", descriptor = "Luc;")
    private static class191 field3699 = new class191();

    @OriginalMember(owner = "client!uc", name = "Bb", descriptor = "[B")
    private static byte[] field3701 = new byte[1];

    @OriginalMember(owner = "client!uc", name = "Ab", descriptor = "Luc;")
    private static class191 field3700 = new class191();

    @OriginalMember(owner = "client!uc", name = "Db", descriptor = "[I")
    private static int[] field3703 = new int[10];

    @OriginalMember(owner = "client!uc", name = "Gb", descriptor = "[I")
    private static int[] field3706 = new int[4096];

    @OriginalMember(owner = "client!uc", name = "Jb", descriptor = "[Z")
    private static boolean[] field3709 = new boolean[4096];

    @OriginalMember(owner = "client!uc", name = "Lb", descriptor = "[I")
    private static int[] field3711 = new int[4096];

    @OriginalMember(owner = "client!uc", name = "Tb", descriptor = "[I")
    private static int[] field3719 = new int[10];

    @OriginalMember(owner = "client!uc", name = "Mb", descriptor = "[B")
    private static byte[] field3712 = new byte[1];

    @OriginalMember(owner = "client!uc", name = "Qb", descriptor = "[I")
    private static int[] field3716 = new int[4096];

    @OriginalMember(owner = "client!uc", name = "Rb", descriptor = "[I")
    private static int[] field3717 = new int[4096];

    @OriginalMember(owner = "client!uc", name = "Nb", descriptor = "[I")
    private static int[] field3713 = new int[4096];

    @OriginalMember(owner = "client!uc", name = "Ob", descriptor = "[I")
    private static int[] field3714 = new int[4096];

    @OriginalMember(owner = "client!uc", name = "Kb", descriptor = "[I")
    private static int[] field3710 = new int[4096];

    @OriginalMember(owner = "client!uc", name = "Hb", descriptor = "[I")
    private static int[] field3707 = new int[4096];

    @OriginalMember(owner = "client!uc", name = "Vb", descriptor = "[I")
    private static int[] field3721 = new int[10];

    @OriginalMember(owner = "client!uc", name = "Cb", descriptor = "[[I")
    private static int[][] field3702 = new int[12][4096];

    @OriginalMember(owner = "client!uc", name = "Xb", descriptor = "[[I")
    private static int[][] field3723 = new int[1600][512];

    @OriginalMember(owner = "client!uc", name = "Yb", descriptor = "[I")
    private static int[] field3724 = class194.field3799;

    @OriginalMember(owner = "client!uc", name = "Eb", descriptor = "[I")
    private static int[] field3704 = new int[12];

    @OriginalMember(owner = "client!uc", name = "Fb", descriptor = "[I")
    private static int[] field3705 = class194.field3803;

    @OriginalMember(owner = "client!uc", name = "Zb", descriptor = "[I")
    private static int[] field3725 = class194.field3787;

    @OriginalMember(owner = "client!uc", name = "Wb", descriptor = "[I")
    private static int[] field3722 = new int[12];

    @OriginalMember(owner = "client!uc", name = "ac", descriptor = "[Z")
    private static boolean[] field3726 = new boolean[4096];

    @OriginalMember(owner = "client!uc", name = "bc", descriptor = "[I")
    private static int[] field3727 = new int[1600];

    @OriginalMember(owner = "client!uc", name = "cc", descriptor = "[I")
    private static int[] field3728 = class194.field3794;

    @OriginalMember(owner = "client!uc", name = "Pb", descriptor = "I")
    private static int field3715;

    @OriginalMember(owner = "client!uc", name = "Sb", descriptor = "I")
    private static int field3718;

    @OriginalMember(owner = "client!uc", name = "Ub", descriptor = "I")
    private static int field3720;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(Z)Ldg;")
    public final class38 method240(boolean arg0) {
        if (!arg0 && field3712.length < super.field851) {
            field3712 = new byte[super.field851 + 100];
        }
        return this.method1255(arg0, field3700, field3712);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZLuc;[B)Luc;")
    private final class191 method1255(boolean arg0, class191 arg1, byte[] arg2) {
        arg1.field866 = super.field866;
        arg1.field851 = super.field851;
        arg1.field3688 = this.field3688;
        if (arg1.field871 == null || arg1.field871.length < super.field866) {
            arg1.field871 = new int[super.field866 + 100];
            arg1.field850 = new int[super.field866 + 100];
            arg1.field870 = new int[super.field866 + 100];
        }
        for (int var4 = 0; var4 < super.field866; ++var4) {
            arg1.field871[var4] = super.field871[var4];
            arg1.field850[var4] = super.field850[var4];
            arg1.field870[var4] = super.field870[var4];
        }
        if (arg0) {
            arg1.field3698 = this.field3698;
        } else {
            arg1.field3698 = arg2;
            if (this.field3698 == null) {
                for (int var5 = 0; var5 < super.field851; ++var5) {
                    arg1.field3698[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < super.field851; ++var6) {
                    arg1.field3698[var6] = this.field3698[var6];
                }
            }
        }
        arg1.field3687 = this.field3687;
        arg1.field3708 = this.field3708;
        arg1.field3689 = this.field3689;
        arg1.field3695 = this.field3695;
        arg1.field3696 = this.field3696;
        arg1.field3694 = this.field3694;
        arg1.field3690 = this.field3690;
        arg1.field3686 = this.field3686;
        arg1.field3692 = this.field3692;
        arg1.field3685 = this.field3685;
        arg1.field3691 = this.field3691;
        arg1.field3697 = this.field3697;
        arg1.field3693 = this.field3693;
        arg1.field857 = super.field857;
        arg1.field863 = super.field863;
        arg1.field868 = super.field868;
        arg1.field862 = false;
        return arg1;
    }

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "(I)V")
    private final void method1256(int arg0) {
        if (field3709[arg0]) {
            this.method1264(arg0);
        } else {
            int var2 = this.field3687[arg0];
            int var3 = this.field3708[arg0];
            int var4 = this.field3689[arg0];
            class194.field3790 = field3726[arg0];
            if (this.field3698 == null) {
                class194.field3802 = 0;
            } else {
                class194.field3802 = this.field3698[arg0] & 255;
            }
            if (this.field3692 != null && this.field3692[arg0] != -1) {
                int var6;
                int var7;
                int var8;
                if (this.field3686 != null && this.field3686[arg0] != -1) {
                    int var5 = this.field3686[arg0] & 255;
                    var6 = this.field3691[var5];
                    var7 = this.field3697[var5];
                    var8 = this.field3693[var5];
                } else {
                    var6 = var2;
                    var7 = var3;
                    var8 = var4;
                }
                if (this.field3694[arg0] == -1) {
                    class194.method1281(field3717[var2], field3717[var3], field3717[var4], field3716[var2], field3716[var3], field3716[var4], this.field3695[arg0], this.field3695[arg0], this.field3695[arg0], field3710[var6], field3710[var7], field3710[var8], field3713[var6], field3713[var7], field3713[var8], field3711[var6], field3711[var7], field3711[var8], this.field3692[arg0]);
                } else {
                    class194.method1281(field3717[var2], field3717[var3], field3717[var4], field3716[var2], field3716[var3], field3716[var4], this.field3695[arg0], this.field3696[arg0], this.field3694[arg0], field3710[var6], field3710[var7], field3710[var8], field3713[var6], field3713[var7], field3713[var8], field3711[var6], field3711[var7], field3711[var8], this.field3692[arg0]);
                }
            } else if (this.field3694[arg0] == -1) {
                class194.method1294(field3717[var2], field3717[var3], field3717[var4], field3716[var2], field3716[var3], field3716[var4], field3728[this.field3695[arg0]]);
            } else {
                class194.method1284(field3717[var2], field3717[var3], field3717[var4], field3716[var2], field3716[var3], field3716[var4], this.field3695[arg0], this.field3696[arg0], this.field3694[arg0]);
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "()V")
    public static void method1257() {
        field3699 = null;
        field3701 = null;
        field3700 = null;
        field3712 = null;
        field3726 = null;
        field3709 = null;
        field3716 = null;
        field3717 = null;
        field3714 = null;
        field3710 = null;
        field3713 = null;
        field3711 = null;
        field3727 = null;
        field3723 = null;
        field3704 = null;
        field3702 = null;
        field3706 = null;
        field3707 = null;
        field3722 = null;
        field3721 = null;
        field3719 = null;
        field3703 = null;
        field3725 = null;
        field3705 = null;
        field3728 = null;
        field3724 = null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIIIII)V")
    public final void method252(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            this.method236();
            int var8 = class194.field3797;
            int var9 = class194.field3795;
            int var10 = field3725[arg0];
            int var11 = field3705[arg0];
            int var12 = field3725[arg1];
            int var13 = field3705[arg1];
            int var14 = field3725[arg2];
            int var15 = field3705[arg2];
            int var16 = field3725[arg3];
            int var17 = field3705[arg3];
            int var18 = arg5 * var16 + arg6 * var17 >> 16;
            for (int var19 = 0; var19 < super.field866; ++var19) {
                int var20 = super.field871[var19];
                int var21 = super.field850[var19];
                int var22 = super.field870[var19];
                if (arg2 != 0) {
                    int var23 = var14 * var21 + var15 * var20 >> 16;
                    var21 = var15 * var21 - var14 * var20 >> 16;
                    var20 = var23;
                }
                if (arg0 != 0) {
                    int var24 = var11 * var21 - var10 * var22 >> 16;
                    var22 = var10 * var21 + var11 * var22 >> 16;
                    var21 = var24;
                }
                if (arg1 != 0) {
                    int var25 = var12 * var22 + var13 * var20 >> 16;
                    var22 = var13 * var22 - var12 * var20 >> 16;
                    var20 = var25;
                }
                int var26 = arg4 + var20;
                int var27 = arg5 + var21;
                int var28 = arg6 + var22;
                int var29 = var17 * var27 - var16 * var28 >> 16;
                int var30 = var16 * var27 + var17 * var28 >> 16;
                field3714[var19] = var30 - var18;
                field3716[var19] = (var26 << 9) / var30 + var8;
                field3717[var19] = (var29 << 9) / var30 + var9;
                if (this.field3688 > 0) {
                    field3710[var19] = var26;
                    field3713[var19] = var29;
                    field3711[var19] = var30;
                }
            }
            this.method1259(false, false, 0L, super.field849, super.field849 << 1);
        } catch (RuntimeException var32) {
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lef;I)V")
    public final void method244(class47 arg0, int arg1) {
        if (super.field857 != null) {
            if (arg1 != -1) {
                class128 var3 = arg0.field1021[arg1];
                class45 var4 = var3.field2578;
                field3720 = 0;
                field3715 = 0;
                field3718 = 0;
                for (int var5 = 0; var5 < var3.field2576; ++var5) {
                    short var6 = var3.field2584[var5];
                    if (var3.field2575[var5] != -1) {
                        this.method1262(0, var4.field1002[var3.field2575[var5]], 0, 0, 0);
                    }
                    this.method1262(var4.field1005[var6], var4.field1002[var6], var3.field2579[var5], var3.field2580[var5], var3.field2577[var5]);
                }
                super.field862 = false;
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)I")
    private static final int method1258(int arg0, int arg1) {
        int var2 = (arg0 & 127) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 65408) + var2;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIIIIII)V")
    public final void method242(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            this.method236();
            int var9 = class194.field3797;
            int var10 = class194.field3795;
            int var11 = field3725[arg0];
            int var12 = field3705[arg0];
            int var13 = field3725[arg1];
            int var14 = field3705[arg1];
            int var15 = field3725[arg2];
            int var16 = field3705[arg2];
            int var17 = field3725[arg3];
            int var18 = field3705[arg3];
            int var19 = arg5 * var17 + arg6 * var18 >> 16;
            for (int var20 = 0; var20 < super.field866; ++var20) {
                int var21 = super.field871[var20];
                int var22 = super.field850[var20];
                int var23 = super.field870[var20];
                if (arg2 != 0) {
                    int var24 = var15 * var22 + var16 * var21 >> 16;
                    var22 = var16 * var22 - var15 * var21 >> 16;
                    var21 = var24;
                }
                if (arg0 != 0) {
                    int var25 = var12 * var22 - var11 * var23 >> 16;
                    var23 = var11 * var22 + var12 * var23 >> 16;
                    var22 = var25;
                }
                if (arg1 != 0) {
                    int var26 = var13 * var23 + var14 * var21 >> 16;
                    var23 = var14 * var23 - var13 * var21 >> 16;
                    var21 = var26;
                }
                int var27 = arg4 + var21;
                int var28 = arg5 + var22;
                int var29 = arg6 + var23;
                int var30 = var18 * var28 - var17 * var29 >> 16;
                int var31 = var17 * var28 + var18 * var29 >> 16;
                field3714[var20] = var31 - var19;
                field3716[var20] = (var27 << 9) / arg7 + var9;
                field3717[var20] = (var30 << 9) / arg7 + var10;
                if (this.field3688 > 0) {
                    field3710[var20] = var27;
                    field3713[var20] = var30;
                    field3711[var20] = var31;
                }
            }
            this.method1259(false, false, 0L, super.field849, super.field849 << 1);
        } catch (RuntimeException var33) {
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method600(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        if (!super.field862) {
            this.method236();
        }
        int var11 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var12 = arg1 * arg6 + arg2 * var11 >> 16;
        int var13 = (super.field856 * arg2 + super.field854 * arg1 >> 16) + var12;
        if (var13 > 50) {
            int var14 = (-super.field856 * arg2 + super.field3511 * arg1 >> 16) + var12;
            if (var14 < 3500) {
                int var15 = arg3 * arg7 + arg4 * arg5 >> 16;
                int var16 = super.field856 + var15 << 9;
                if (var16 / var13 > class194.field3792) {
                    int var17 = var15 - super.field856 << 9;
                    if (var17 / var13 < class194.field3798) {
                        int var18 = arg2 * arg6 - arg1 * var11 >> 16;
                        int var19 = (super.field856 * arg1 + super.field854 * arg2 >> 16) + var18 << 9;
                        if (var19 / var13 > class194.field3791) {
                            int var20 = (-super.field856 * arg1 + super.field3511 * arg2 >> 16) + var18 << 9;
                            if (var20 / var13 < class194.field3784) {
                                boolean var21 = false;
                                boolean var22 = var14 <= 50;
                                boolean var23 = var22 || this.field3688 > 0;
                                int var24 = class194.field3797;
                                int var25 = class194.field3795;
                                int var26 = 0;
                                int var27 = 0;
                                if (arg0 != 0) {
                                    var26 = field3725[arg0];
                                    var27 = field3705[arg0];
                                }
                                boolean var28 = false;
                                if (arg8 > 0L && class38.field860 && var14 > 0) {
                                    int var29;
                                    int var30;
                                    if (var15 > 0) {
                                        var29 = var17 / var13;
                                        var30 = var16 / var14;
                                    } else {
                                        var29 = var17 / var14;
                                        var30 = var16 / var13;
                                    }
                                    int var31;
                                    int var32;
                                    if (var18 > 0) {
                                        var31 = var20 / var13;
                                        var32 = var19 / var14;
                                    } else {
                                        var31 = var20 / var14;
                                        var32 = var19 / var13;
                                    }
                                    int var33 = class38.field859 - class194.field3797;
                                    int var34 = class38.field865 - class194.field3795;
                                    if (var33 >= var29 && var33 <= var30 && var34 >= var31 && var34 <= var32) {
                                        int var35 = 999999;
                                        int var36 = -999999;
                                        int var37 = 999999;
                                        int var38 = -999999;
                                        int[] var39 = new int[] { super.field852, super.field855, super.field852, super.field855, super.field852, super.field855, super.field852, super.field855 };
                                        int[] var40 = new int[] { super.field869, super.field869, super.field853, super.field853, super.field869, super.field869, super.field853, super.field853 };
                                        int[] var41 = new int[] { super.field3511, super.field3511, super.field3511, super.field3511, super.field854, super.field854, super.field854, super.field854 };
                                        for (int var42 = 0; var42 < 8; ++var42) {
                                            int var43 = var39[var42];
                                            int var44 = var41[var42];
                                            int var45 = var40[var42];
                                            if (arg0 != 0) {
                                                int var46 = var26 * var45 + var27 * var43 >> 16;
                                                var45 = var27 * var45 - var26 * var43 >> 16;
                                                var43 = var46;
                                            }
                                            int var47 = arg5 + var43;
                                            int var48 = arg6 + var44;
                                            int var49 = arg7 + var45;
                                            int var50 = arg3 * var49 + arg4 * var47 >> 16;
                                            int var51 = arg4 * var49 - arg3 * var47 >> 16;
                                            int var53 = arg2 * var48 - arg1 * var51 >> 16;
                                            int var54 = arg1 * var48 + arg2 * var51 >> 16;
                                            if (var54 > 0) {
                                                int var56 = (var50 << 9) / var54;
                                                int var57 = (var53 << 9) / var54;
                                                if (var56 < var35) {
                                                    var35 = var56;
                                                }
                                                if (var56 > var36) {
                                                    var36 = var56;
                                                }
                                                if (var57 < var37) {
                                                    var37 = var57;
                                                }
                                                if (var57 > var38) {
                                                    var38 = var57;
                                                }
                                            }
                                        }
                                        if (var33 >= var35 && var33 <= var36 && var34 >= var37 && var34 <= var38) {
                                            if (super.field868) {
                                                class38.field867[class38.field858++] = arg8;
                                            } else {
                                                var28 = true;
                                            }
                                        }
                                    }
                                }
                                for (int var58 = 0; var58 < super.field866; ++var58) {
                                    int var59 = super.field871[var58];
                                    int var60 = super.field850[var58];
                                    int var61 = super.field870[var58];
                                    if (arg0 != 0) {
                                        int var62 = var26 * var61 + var27 * var59 >> 16;
                                        var61 = var27 * var61 - var26 * var59 >> 16;
                                        var59 = var62;
                                    }
                                    int var63 = arg5 + var59;
                                    int var64 = arg6 + var60;
                                    int var65 = arg7 + var61;
                                    int var66 = arg3 * var65 + arg4 * var63 >> 16;
                                    int var67 = arg4 * var65 - arg3 * var63 >> 16;
                                    int var69 = arg2 * var64 - arg1 * var67 >> 16;
                                    int var70 = arg1 * var64 + arg2 * var67 >> 16;
                                    field3714[var58] = var70 - var12;
                                    if (var70 >= 50) {
                                        field3716[var58] = (var66 << 9) / var70 + var24;
                                        field3717[var58] = (var69 << 9) / var70 + var25;
                                    } else {
                                        field3716[var58] = -5000;
                                        var21 = true;
                                    }
                                    if (var23) {
                                        field3710[var58] = var66;
                                        field3713[var58] = var69;
                                        field3711[var58] = var70;
                                    }
                                }
                                try {
                                    this.method1259(var21, var28, arg8, var12 - var14, var13 - var14 + 2);
                                } catch (Exception var72) {
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZZJII)V")
    private final void method1259(boolean arg0, boolean arg1, long arg2, int arg3, int arg4) {
        if (arg4 < 1600) {
            for (int var7 = 0; var7 < arg4; ++var7) {
                field3727[var7] = 0;
            }
            for (int var8 = 0; var8 < super.field851; ++var8) {
                if (this.field3694[var8] != -2) {
                    int var33 = this.field3687[var8];
                    int var34 = this.field3708[var8];
                    int var35 = this.field3689[var8];
                    int var36 = field3716[var33];
                    int var37 = field3716[var34];
                    int var38 = field3716[var35];
                    if (!arg0 || var36 != -5000 && var37 != -5000 && var38 != -5000) {
                        if (arg1 && this.method1263(class38.field859, class38.field865, field3717[var33], field3717[var34], field3717[var35], var36, var37, var38)) {
                            class38.field867[class38.field858++] = arg2;
                            arg1 = false;
                        }
                        if ((field3717[var35] - field3717[var34]) * (var36 - var37) - (field3717[var33] - field3717[var34]) * (var38 - var37) > 0) {
                            field3709[var8] = false;
                            if (var36 >= 0 && var37 >= 0 && var38 >= 0 && var36 <= class194.field3800 && var37 <= class194.field3800 && var38 <= class194.field3800) {
                                field3726[var8] = false;
                            } else {
                                field3726[var8] = true;
                            }
                            int var58 = (field3714[var33] + field3714[var34] + field3714[var35]) / 3 + arg3;
                            field3723[var58][field3727[var58]++] = var8;
                        }
                    } else {
                        int var39 = field3710[var33];
                        int var40 = field3710[var34];
                        int var41 = field3710[var35];
                        int var42 = field3713[var33];
                        int var43 = field3713[var34];
                        int var44 = field3713[var35];
                        int var45 = field3711[var33];
                        int var46 = field3711[var34];
                        int var47 = field3711[var35];
                        int var48 = var39 - var40;
                        int var49 = var41 - var40;
                        int var50 = var42 - var43;
                        int var51 = var44 - var43;
                        int var52 = var45 - var46;
                        int var53 = var47 - var46;
                        int var54 = var50 * var53 - var51 * var52;
                        int var55 = var49 * var52 - var48 * var53;
                        int var56 = var48 * var51 - var49 * var50;
                        if (var46 * var56 + var40 * var54 + var43 * var55 > 0) {
                            field3709[var8] = true;
                            int var57 = (field3714[var33] + field3714[var34] + field3714[var35]) / 3 + arg3;
                            field3723[var57][field3727[var57]++] = var8;
                        }
                    }
                }
            }
            if (this.field3690 == null) {
                for (int var9 = arg4 - 1; var9 >= 0; --var9) {
                    int var10 = field3727[var9];
                    if (var10 > 0) {
                        int[] var11 = field3723[var9];
                        for (int var12 = 0; var12 < var10; ++var12) {
                            this.method1256(var11[var12]);
                        }
                    }
                }
            } else {
                for (int var13 = 0; var13 < 12; ++var13) {
                    field3704[var13] = 0;
                    field3722[var13] = 0;
                }
                for (int var14 = arg4 - 1; var14 >= 0; --var14) {
                    int var27 = field3727[var14];
                    if (var27 > 0) {
                        int[] var28 = field3723[var14];
                        for (int var29 = 0; var29 < var27; ++var29) {
                            int var30 = var28[var29];
                            byte var31 = this.field3690[var30];
                            int var32 = field3704[var31]++;
                            field3702[var31][var32] = var30;
                            if (var31 < 10) {
                                field3722[var31] += var14;
                            } else if (var31 == 10) {
                                field3706[var32] = var14;
                            } else {
                                field3707[var32] = var14;
                            }
                        }
                    }
                }
                int var15 = 0;
                if (field3704[1] > 0 || field3704[2] > 0) {
                    var15 = (field3722[1] + field3722[2]) / (field3704[1] + field3704[2]);
                }
                int var16 = 0;
                if (field3704[3] > 0 || field3704[4] > 0) {
                    var16 = (field3722[3] + field3722[4]) / (field3704[3] + field3704[4]);
                }
                int var17 = 0;
                if (field3704[6] > 0 || field3704[8] > 0) {
                    var17 = (field3722[6] + field3722[8]) / (field3704[6] + field3704[8]);
                }
                int var18 = 0;
                int var19 = field3704[10];
                int[] var20 = field3702[10];
                int[] var21 = field3706;
                if (var18 == var19) {
                    var18 = 0;
                    var19 = field3704[11];
                    var20 = field3702[11];
                    var21 = field3707;
                }
                int var22;
                if (var18 < var19) {
                    var22 = var21[var18];
                } else {
                    var22 = -1000;
                }
                for (int var23 = 0; var23 < 10; ++var23) {
                    while (var23 == 0 && var22 > var15) {
                        this.method1256(var20[var18++]);
                        if (var18 == var19 && field3702[11] != var20) {
                            var18 = 0;
                            var19 = field3704[11];
                            var20 = field3702[11];
                            var21 = field3707;
                        }
                        if (var18 < var19) {
                            var22 = var21[var18];
                        } else {
                            var22 = -1000;
                        }
                    }
                    while (var23 == 3 && var22 > var16) {
                        this.method1256(var20[var18++]);
                        if (var18 == var19 && field3702[11] != var20) {
                            var18 = 0;
                            var19 = field3704[11];
                            var20 = field3702[11];
                            var21 = field3707;
                        }
                        if (var18 < var19) {
                            var22 = var21[var18];
                        } else {
                            var22 = -1000;
                        }
                    }
                    while (var23 == 5 && var22 > var17) {
                        this.method1256(var20[var18++]);
                        if (var18 == var19 && field3702[11] != var20) {
                            var18 = 0;
                            var19 = field3704[11];
                            var20 = field3702[11];
                            var21 = field3707;
                        }
                        if (var18 < var19) {
                            var22 = var21[var18];
                        } else {
                            var22 = -1000;
                        }
                    }
                    int var24 = field3704[var23];
                    int[] var25 = field3702[var23];
                    for (int var26 = 0; var26 < var24; ++var26) {
                        this.method1256(var25[var26]);
                    }
                }
                while (var22 != -1000) {
                    this.method1256(var20[var18++]);
                    if (var18 == var19 && field3702[11] != var20) {
                        var18 = 0;
                        var20 = field3702[11];
                        var19 = field3704[11];
                        var21 = field3707;
                    }
                    if (var18 < var19) {
                        var22 = var21[var18];
                    } else {
                        var22 = -1000;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "(I)I")
    private static final int method1260(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ldg;)Ldg;")
    public final class38 method1261(class38 arg0) {
        return new class191(new class191[] { this, (class191) arg0 }, 2);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I[IIII)V")
    private final void method1262(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            field3720 = 0;
            field3715 = 0;
            field3718 = 0;
            for (int var8 = 0; var8 < var6; ++var8) {
                int var9 = arg1[var8];
                if (var9 < super.field857.length) {
                    int[] var10 = super.field857[var9];
                    for (int var11 = 0; var11 < var10.length; ++var11) {
                        int var12 = var10[var11];
                        field3720 += super.field871[var12];
                        field3715 += super.field850[var12];
                        field3718 += super.field870[var12];
                        ++var7;
                    }
                }
            }
            if (var7 > 0) {
                field3720 = field3720 / var7 + arg2;
                field3715 = field3715 / var7 + arg3;
                field3718 = field3718 / var7 + arg4;
            } else {
                field3720 = arg2;
                field3715 = arg3;
                field3718 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; ++var13) {
                int var14 = arg1[var13];
                if (var14 < super.field857.length) {
                    int[] var15 = super.field857[var14];
                    for (int var16 = 0; var16 < var15.length; ++var16) {
                        int var17 = var15[var16];
                        super.field871[var17] += arg2;
                        super.field850[var17] += arg3;
                        super.field870[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; ++var18) {
                int var19 = arg1[var18];
                if (var19 < super.field857.length) {
                    int[] var20 = super.field857[var19];
                    for (int var21 = 0; var21 < var20.length; ++var21) {
                        int var22 = var20[var21];
                        super.field871[var22] -= field3720;
                        super.field850[var22] -= field3715;
                        super.field870[var22] -= field3718;
                        if (arg4 != 0) {
                            int var23 = field3725[arg4];
                            int var24 = field3705[arg4];
                            int var25 = super.field871[var22] * var24 + super.field850[var22] * var23 + 32767 >> 16;
                            super.field850[var22] = super.field850[var22] * var24 - super.field871[var22] * var23 + 32767 >> 16;
                            super.field871[var22] = var25;
                        }
                        if (arg2 != 0) {
                            int var26 = field3725[arg2];
                            int var27 = field3705[arg2];
                            int var28 = super.field850[var22] * var27 - super.field870[var22] * var26 + 32767 >> 16;
                            super.field870[var22] = super.field870[var22] * var27 + super.field850[var22] * var26 + 32767 >> 16;
                            super.field850[var22] = var28;
                        }
                        if (arg3 != 0) {
                            int var29 = field3725[arg3];
                            int var30 = field3705[arg3];
                            int var31 = super.field871[var22] * var30 + super.field870[var22] * var29 + 32767 >> 16;
                            super.field870[var22] = super.field870[var22] * var30 - super.field871[var22] * var29 + 32767 >> 16;
                            super.field871[var22] = var31;
                        }
                        super.field871[var22] += field3720;
                        super.field850[var22] += field3715;
                        super.field870[var22] += field3718;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var32 = 0; var32 < var6; ++var32) {
                int var33 = arg1[var32];
                if (var33 < super.field857.length) {
                    int[] var34 = super.field857[var33];
                    for (int var35 = 0; var35 < var34.length; ++var35) {
                        int var36 = var34[var35];
                        super.field871[var36] -= field3720;
                        super.field850[var36] -= field3715;
                        super.field870[var36] -= field3718;
                        super.field871[var36] = super.field871[var36] * arg2 / 128;
                        super.field850[var36] = super.field850[var36] * arg3 / 128;
                        super.field870[var36] = super.field870[var36] * arg4 / 128;
                        super.field871[var36] += field3720;
                        super.field850[var36] += field3715;
                        super.field870[var36] += field3718;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (super.field863 != null && this.field3698 != null) {
                for (int var37 = 0; var37 < var6; ++var37) {
                    int var38 = arg1[var37];
                    if (var38 < super.field863.length) {
                        int[] var39 = super.field863[var38];
                        for (int var40 = 0; var40 < var39.length; ++var40) {
                            int var41 = var39[var40];
                            int var42 = (this.field3698[var41] & 255) + arg2 * 8;
                            if (var42 < 0) {
                                var42 = 0;
                            } else if (var42 > 255) {
                                var42 = 255;
                            }
                            this.field3698[var41] = (byte) var42;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(Z)Ldg;")
    public final class38 method245(boolean arg0) {
        if (!arg0 && field3701.length < super.field851) {
            field3701 = new byte[super.field851 + 100];
        }
        return this.method1255(arg0, field3699, field3701);
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(IIIIIIII)Z")
    private final boolean method1263(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else {
            return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lef;ILef;I[I)V")
    public final void method249(class47 arg0, int arg1, class47 arg2, int arg3, int[] arg4) {
        if (arg1 != -1) {
            if (arg4 != null && arg3 != -1) {
                class128 var6 = arg0.field1021[arg1];
                class128 var7 = arg2.field1021[arg3];
                class45 var8 = var6.field2578;
                field3720 = 0;
                field3715 = 0;
                field3718 = 0;
                byte var9 = 0;
                int var17 = var9 + 1;
                int var10 = arg4[var9];
                for (int var11 = 0; var11 < var6.field2576; ++var11) {
                    short var16 = var6.field2584[var11];
                    while (var16 > var10) {
                        var10 = arg4[var17++];
                    }
                    if (var10 != var16 || var8.field1005[var16] == 0) {
                        if (var6.field2575[var11] != -1) {
                            this.method1262(0, var8.field1002[var6.field2575[var11]], 0, 0, 0);
                        }
                        this.method1262(var8.field1005[var16], var8.field1002[var16], var6.field2579[var11], var6.field2580[var11], var6.field2577[var11]);
                    }
                }
                field3720 = 0;
                field3715 = 0;
                field3718 = 0;
                byte var12 = 0;
                int var18 = var12 + 1;
                int var13 = arg4[var12];
                for (int var14 = 0; var14 < var7.field2576; ++var14) {
                    short var15 = var7.field2584[var14];
                    while (var15 > var13) {
                        var13 = arg4[var18++];
                    }
                    if (var13 == var15 || var8.field1005[var15] == 0) {
                        if (var7.field2575[var14] != -1) {
                            this.method1262(0, var8.field1002[var7.field2575[var14]], 0, 0, 0);
                        }
                        this.method1262(var8.field1005[var15], var8.field1002[var15], var7.field2579[var14], var7.field2580[var14], var7.field2577[var14]);
                    }
                }
                super.field862 = false;
            } else {
                this.method244(arg0, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "(I)V")
    private final void method1264(int arg0) {
        int var2 = class194.field3797;
        int var3 = class194.field3795;
        int var4 = 0;
        int var5 = this.field3687[arg0];
        int var6 = this.field3708[arg0];
        int var7 = this.field3689[arg0];
        int var8 = field3711[var5];
        int var9 = field3711[var6];
        int var10 = field3711[var7];
        if (this.field3698 == null) {
            class194.field3802 = 0;
        } else {
            class194.field3802 = this.field3698[arg0] & 255;
        }
        if (var8 >= 50) {
            field3721[var4] = field3716[var5];
            field3719[var4] = field3717[var5];
            field3703[var4++] = this.field3695[arg0];
        } else {
            int var11 = field3710[var5];
            int var12 = field3713[var5];
            int var13 = this.field3695[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field3724[var10 - var8];
                field3721[var4] = (((field3710[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
                field3719[var4] = (((field3713[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
                field3703[var4++] = ((this.field3694[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field3724[var9 - var8];
                field3721[var4] = (((field3710[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
                field3719[var4] = (((field3713[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
                field3703[var4++] = ((this.field3696[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field3721[var4] = field3716[var6];
            field3719[var4] = field3717[var6];
            field3703[var4++] = this.field3696[arg0];
        } else {
            int var16 = field3710[var6];
            int var17 = field3713[var6];
            int var18 = this.field3696[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field3724[var8 - var9];
                field3721[var4] = (((field3710[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
                field3719[var4] = (((field3713[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
                field3703[var4++] = ((this.field3695[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field3724[var10 - var9];
                field3721[var4] = (((field3710[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
                field3719[var4] = (((field3713[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
                field3703[var4++] = ((this.field3694[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field3721[var4] = field3716[var7];
            field3719[var4] = field3717[var7];
            field3703[var4++] = this.field3694[arg0];
        } else {
            int var21 = field3710[var7];
            int var22 = field3713[var7];
            int var23 = this.field3694[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field3724[var9 - var10];
                field3721[var4] = (((field3710[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
                field3719[var4] = (((field3713[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
                field3703[var4++] = ((this.field3696[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field3724[var8 - var10];
                field3721[var4] = (((field3710[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
                field3719[var4] = (((field3713[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
                field3703[var4++] = ((this.field3695[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field3721[0];
        int var27 = field3721[1];
        int var28 = field3721[2];
        int var29 = field3719[0];
        int var30 = field3719[1];
        int var31 = field3719[2];
        class194.field3790 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > class194.field3800 || var27 > class194.field3800 || var28 > class194.field3800) {
                class194.field3790 = true;
            }
            if (this.field3692 != null && this.field3692[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field3686 != null && this.field3686[arg0] != -1) {
                    int var32 = this.field3686[arg0] & 255;
                    var33 = this.field3691[var32];
                    var34 = this.field3697[var32];
                    var35 = this.field3693[var32];
                } else {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                }
                if (this.field3694[arg0] == -1) {
                    class194.method1281(var29, var30, var31, var26, var27, var28, this.field3695[arg0], this.field3695[arg0], this.field3695[arg0], field3710[var33], field3710[var34], field3710[var35], field3713[var33], field3713[var34], field3713[var35], field3711[var33], field3711[var34], field3711[var35], this.field3692[arg0]);
                } else {
                    class194.method1281(var29, var30, var31, var26, var27, var28, field3703[0], field3703[1], field3703[2], field3710[var33], field3710[var34], field3710[var35], field3713[var33], field3713[var34], field3713[var35], field3711[var33], field3711[var34], field3711[var35], this.field3692[arg0]);
                }
            } else if (this.field3694[arg0] == -1) {
                class194.method1294(var29, var30, var31, var26, var27, var28, field3728[this.field3695[arg0]]);
            } else {
                class194.method1284(var29, var30, var31, var26, var27, var28, field3703[0], field3703[1], field3703[2]);
            }
        }
        if (var4 == 4) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > class194.field3800 || var27 > class194.field3800 || var28 > class194.field3800 || field3721[3] < 0 || field3721[3] > class194.field3800) {
                class194.field3790 = true;
            }
            if (this.field3692 == null || this.field3692[arg0] == -1) {
                if (this.field3694[arg0] == -1) {
                    int var41 = field3728[this.field3695[arg0]];
                    class194.method1294(var29, var30, var31, var26, var27, var28, var41);
                    class194.method1294(var29, var31, field3719[3], var26, var28, field3721[3], var41);
                    return;
                }
                class194.method1284(var29, var30, var31, var26, var27, var28, field3703[0], field3703[1], field3703[2]);
                class194.method1284(var29, var31, field3719[3], var26, var28, field3721[3], field3703[0], field3703[2], field3703[3]);
                return;
            }
            int var37;
            int var38;
            int var39;
            if (this.field3686 != null && this.field3686[arg0] != -1) {
                int var36 = this.field3686[arg0] & 255;
                var37 = this.field3691[var36];
                var38 = this.field3697[var36];
                var39 = this.field3693[var36];
            } else {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            }
            short var40 = this.field3692[arg0];
            if (this.field3694[arg0] == -1) {
                class194.method1281(var29, var30, var31, var26, var27, var28, this.field3695[arg0], this.field3695[arg0], this.field3695[arg0], field3710[var37], field3710[var38], field3710[var39], field3713[var37], field3713[var38], field3713[var39], field3711[var37], field3711[var38], field3711[var39], var40);
                class194.method1281(var29, var31, field3719[3], var26, var28, field3721[3], this.field3695[arg0], this.field3695[arg0], this.field3695[arg0], field3710[var37], field3710[var38], field3710[var39], field3713[var37], field3713[var38], field3713[var39], field3711[var37], field3711[var38], field3711[var39], var40);
                return;
            }
            class194.method1281(var29, var30, var31, var26, var27, var28, field3703[0], field3703[1], field3703[2], field3710[var37], field3710[var38], field3710[var39], field3713[var37], field3713[var38], field3713[var39], field3711[var37], field3711[var38], field3711[var39], var40);
            class194.method1281(var29, var31, field3719[3], var26, var28, field3721[3], field3703[0], field3703[2], field3703[3], field3710[var37], field3710[var38], field3710[var39], field3713[var37], field3713[var38], field3713[var39], field3711[var37], field3711[var38], field3711[var39], var40);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "([[IIIIZI)Ldg;")
    public final class38 method237(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method236();
        int var7 = super.field852 + arg1;
        int var8 = super.field855 + arg1;
        int var9 = super.field869 + arg3;
        int var10 = super.field853 + arg3;
        if (var7 >= 0 && var8 + 128 >> 7 < arg0.length && var9 >= 0 && var10 + 128 >> 7 < arg0[0].length) {
            int var11 = var7 >> 7;
            int var12 = var8 + 127 >> 7;
            int var13 = var9 >> 7;
            int var14 = var10 + 127 >> 7;
            if (arg0[var11][var13] == arg2 && arg0[var12][var13] == arg2 && arg0[var11][var14] == arg2 && arg0[var12][var14] == arg2) {
                return this;
            } else {
                class191 var15;
                if (arg4) {
                    var15 = new class191();
                    var15.field866 = super.field866;
                    var15.field851 = super.field851;
                    var15.field3688 = this.field3688;
                    var15.field871 = super.field871;
                    var15.field870 = super.field870;
                    var15.field3687 = this.field3687;
                    var15.field3708 = this.field3708;
                    var15.field3689 = this.field3689;
                    var15.field3695 = this.field3695;
                    var15.field3696 = this.field3696;
                    var15.field3694 = this.field3694;
                    var15.field3690 = this.field3690;
                    var15.field3698 = this.field3698;
                    var15.field3686 = this.field3686;
                    var15.field3692 = this.field3692;
                    var15.field3685 = this.field3685;
                    var15.field3691 = this.field3691;
                    var15.field3697 = this.field3697;
                    var15.field3693 = this.field3693;
                    var15.field857 = super.field857;
                    var15.field863 = super.field863;
                    var15.field868 = super.field868;
                    var15.field850 = new int[var15.field866];
                } else {
                    var15 = this;
                }
                if (arg5 == 0) {
                    for (int var16 = 0; var16 < var15.field866; ++var16) {
                        int var17 = super.field871[var16] + arg1;
                        int var18 = super.field870[var16] + arg3;
                        int var19 = var17 & 127;
                        int var20 = var18 & 127;
                        int var21 = var17 >> 7;
                        int var22 = var18 >> 7;
                        int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                        int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                        int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                        var15.field850[var16] = super.field850[var16] + var25 - arg2;
                    }
                } else {
                    for (int var26 = 0; var26 < var15.field866; ++var26) {
                        int var27 = (super.field850[var26] << 16) / super.field3511;
                        if (var27 < arg5) {
                            int var28 = super.field871[var26] + arg1;
                            int var29 = super.field870[var26] + arg3;
                            int var30 = var28 & 127;
                            int var31 = var29 & 127;
                            int var32 = var28 >> 7;
                            int var33 = var29 >> 7;
                            int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                            int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                            int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                            var15.field850[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + super.field850[var26];
                        } else {
                            var15.field850[var26] = super.field850[var26];
                        }
                    }
                }
                super.field862 = false;
                return var15;
            }
        } else {
            return this;
        }
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V")
    public class191() {
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lff;IIIII)V")
    public class191(class57 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.method333();
        arg0.method335();
        super.field866 = arg0.field1170;
        super.field871 = arg0.field1188;
        super.field850 = arg0.field1202;
        super.field870 = arg0.field1197;
        super.field851 = arg0.field1196;
        this.field3687 = arg0.field1181;
        this.field3708 = arg0.field1192;
        this.field3689 = arg0.field1168;
        this.field3690 = arg0.field1206;
        this.field3698 = arg0.field1185;
        this.field3685 = arg0.field1182;
        super.field857 = arg0.field1180;
        super.field863 = arg0.field1195;
        int var7 = (int) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        int var8 = arg2 * var7 >> 8;
        this.field3695 = new int[super.field851];
        this.field3696 = new int[super.field851];
        this.field3694 = new int[super.field851];
        if (arg0.field1175 != null) {
            this.field3692 = new short[super.field851];
            for (int var9 = 0; var9 < super.field851; ++var9) {
                short var10 = arg0.field1175[var9];
                if (var10 != -1 && class194.field3786.method161(var10, -84)) {
                    this.field3692[var9] = var10;
                } else {
                    this.field3692[var9] = -1;
                }
            }
        } else {
            this.field3692 = null;
        }
        if (arg0.field1172 > 0 && arg0.field1193 != null) {
            int[] var11 = new int[arg0.field1172];
            for (int var12 = 0; var12 < super.field851; ++var12) {
                if (arg0.field1193[var12] != -1) {
                    ++var11[arg0.field1193[var12] & 255];
                }
            }
            this.field3688 = 0;
            for (int var13 = 0; var13 < arg0.field1172; ++var13) {
                if (var11[var13] > 0 && arg0.field1178[var13] == 0) {
                    ++this.field3688;
                }
            }
            this.field3691 = new int[this.field3688];
            this.field3697 = new int[this.field3688];
            this.field3693 = new int[this.field3688];
            int var14 = 0;
            for (int var15 = 0; var15 < arg0.field1172; ++var15) {
                if (var11[var15] > 0 && arg0.field1178[var15] == 0) {
                    this.field3691[var14] = arg0.field1187[var15] & 65535;
                    this.field3697[var14] = arg0.field1166[var15] & 65535;
                    this.field3693[var14] = arg0.field1208[var15] & 65535;
                    var11[var15] = var14++;
                } else {
                    var11[var15] = -1;
                }
            }
            this.field3686 = new byte[super.field851];
            for (int var16 = 0; var16 < super.field851; ++var16) {
                if (arg0.field1193[var16] != -1) {
                    this.field3686[var16] = (byte) var11[arg0.field1193[var16] & 255];
                    if (this.field3686[var16] == -1 && this.field3692 != null) {
                        this.field3692[var16] = -1;
                    }
                } else {
                    this.field3686[var16] = -1;
                }
            }
        }
        for (int var17 = 0; var17 < super.field851; ++var17) {
            byte var18;
            if (arg0.field1198 == null) {
                var18 = 0;
            } else {
                var18 = arg0.field1198[var17];
            }
            byte var19;
            if (arg0.field1185 == null) {
                var19 = 0;
            } else {
                var19 = arg0.field1185[var17];
            }
            short var20;
            if (this.field3692 == null) {
                var20 = -1;
            } else {
                var20 = this.field3692[var17];
            }
            if (var19 == -2) {
                var18 = 3;
            }
            if (var19 == -1) {
                var18 = 2;
            }
            if (var20 == -1) {
                if (var18 != 0) {
                    if (var18 == 1) {
                        class27 var28 = arg0.field1171[var17];
                        int var29 = (var28.field604 * arg5 + var28.field614 * arg4 + var28.field613 * arg3) / (var8 / 2 + var8) + arg1;
                        this.field3695[var17] = method1258(arg0.field1183[var17] & 65535, var29);
                        this.field3694[var17] = -1;
                    } else if (var18 == 3) {
                        this.field3695[var17] = 128;
                        this.field3694[var17] = -1;
                    } else {
                        this.field3694[var17] = -2;
                    }
                } else {
                    int var21 = arg0.field1183[var17] & 65535;
                    class7 var22;
                    if (arg0.field1167 != null && arg0.field1167[this.field3687[var17]] != null) {
                        var22 = arg0.field1167[this.field3687[var17]];
                    } else {
                        var22 = arg0.field1194[this.field3687[var17]];
                    }
                    int var23 = (var22.field307 * arg5 + var22.field313 * arg3 + var22.field306 * arg4) / (var22.field312 * var8) + arg1;
                    this.field3695[var17] = method1258(var21, var23);
                    class7 var24;
                    if (arg0.field1167 != null && arg0.field1167[this.field3708[var17]] != null) {
                        var24 = arg0.field1167[this.field3708[var17]];
                    } else {
                        var24 = arg0.field1194[this.field3708[var17]];
                    }
                    int var25 = (var24.field307 * arg5 + var24.field313 * arg3 + var24.field306 * arg4) / (var24.field312 * var8) + arg1;
                    this.field3696[var17] = method1258(var21, var25);
                    class7 var26;
                    if (arg0.field1167 != null && arg0.field1167[this.field3689[var17]] != null) {
                        var26 = arg0.field1167[this.field3689[var17]];
                    } else {
                        var26 = arg0.field1194[this.field3689[var17]];
                    }
                    int var27 = (var26.field307 * arg5 + var26.field313 * arg3 + var26.field306 * arg4) / (var26.field312 * var8) + arg1;
                    this.field3694[var17] = method1258(var21, var27);
                }
            } else if (var18 != 0) {
                if (var18 == 1) {
                    class27 var36 = arg0.field1171[var17];
                    int var37 = (var36.field604 * arg5 + var36.field614 * arg4 + var36.field613 * arg3) / (var8 / 2 + var8) + arg1;
                    this.field3695[var17] = method1260(var37);
                    this.field3694[var17] = -1;
                } else {
                    this.field3694[var17] = -2;
                }
            } else {
                class7 var30;
                if (arg0.field1167 != null && arg0.field1167[this.field3687[var17]] != null) {
                    var30 = arg0.field1167[this.field3687[var17]];
                } else {
                    var30 = arg0.field1194[this.field3687[var17]];
                }
                int var31 = (var30.field307 * arg5 + var30.field313 * arg3 + var30.field306 * arg4) / (var30.field312 * var8) + arg1;
                this.field3695[var17] = method1260(var31);
                class7 var32;
                if (arg0.field1167 != null && arg0.field1167[this.field3708[var17]] != null) {
                    var32 = arg0.field1167[this.field3708[var17]];
                } else {
                    var32 = arg0.field1194[this.field3708[var17]];
                }
                int var33 = (var32.field307 * arg5 + var32.field313 * arg3 + var32.field306 * arg4) / (var32.field312 * var8) + arg1;
                this.field3696[var17] = method1260(var33);
                class7 var34;
                if (arg0.field1167 != null && arg0.field1167[this.field3689[var17]] != null) {
                    var34 = arg0.field1167[this.field3689[var17]];
                } else {
                    var34 = arg0.field1194[this.field3689[var17]];
                }
                int var35 = (var34.field307 * arg5 + var34.field313 * arg3 + var34.field306 * arg4) / (var34.field312 * var8) + arg1;
                this.field3694[var17] = method1260(var35);
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "([Luc;I)V")
    private class191(class191[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        super.field866 = 0;
        super.field851 = 0;
        this.field3688 = 0;
        this.field3685 = -1;
        for (int var7 = 0; var7 < arg1; ++var7) {
            class191 var13 = arg0[var7];
            if (var13 != null) {
                super.field866 += var13.field866;
                super.field851 += var13.field851;
                this.field3688 += var13.field3688;
                if (var13.field3690 != null) {
                    var3 = true;
                } else {
                    if (this.field3685 == -1) {
                        this.field3685 = var13.field3685;
                    }
                    if (this.field3685 != var13.field3685) {
                        var3 = true;
                    }
                }
                var4 |= var13.field3698 != null;
                var5 |= var13.field3692 != null;
                var6 |= var13.field3686 != null;
            }
        }
        super.field871 = new int[super.field866];
        super.field850 = new int[super.field866];
        super.field870 = new int[super.field866];
        this.field3687 = new int[super.field851];
        this.field3708 = new int[super.field851];
        this.field3689 = new int[super.field851];
        this.field3695 = new int[super.field851];
        this.field3696 = new int[super.field851];
        this.field3694 = new int[super.field851];
        if (var3) {
            this.field3690 = new byte[super.field851];
        }
        if (var4) {
            this.field3698 = new byte[super.field851];
        }
        if (var5) {
            this.field3692 = new short[super.field851];
        }
        if (var6) {
            this.field3686 = new byte[super.field851];
        }
        if (this.field3688 > 0) {
            this.field3691 = new int[this.field3688];
            this.field3697 = new int[this.field3688];
            this.field3693 = new int[this.field3688];
        }
        super.field866 = 0;
        super.field851 = 0;
        this.field3688 = 0;
        for (int var8 = 0; var8 < arg1; ++var8) {
            class191 var9 = arg0[var8];
            if (var9 != null) {
                for (int var10 = 0; var10 < var9.field851; ++var10) {
                    this.field3687[super.field851] = var9.field3687[var10] + super.field866;
                    this.field3708[super.field851] = var9.field3708[var10] + super.field866;
                    this.field3689[super.field851] = var9.field3689[var10] + super.field866;
                    this.field3695[super.field851] = var9.field3695[var10];
                    this.field3696[super.field851] = var9.field3696[var10];
                    this.field3694[super.field851] = var9.field3694[var10];
                    if (var3) {
                        if (var9.field3690 != null) {
                            this.field3690[super.field851] = var9.field3690[var10];
                        } else {
                            this.field3690[super.field851] = var9.field3685;
                        }
                    }
                    if (var4 && var9.field3698 != null) {
                        this.field3698[super.field851] = var9.field3698[var10];
                    }
                    if (var5) {
                        if (var9.field3692 != null) {
                            this.field3692[super.field851] = var9.field3692[var10];
                        } else {
                            this.field3692[super.field851] = -1;
                        }
                    }
                    if (var6) {
                        if (var9.field3686 != null && var9.field3686[var10] != -1) {
                            this.field3686[super.field851] = (byte) (var9.field3686[var10] + this.field3688);
                        } else {
                            this.field3686[super.field851] = -1;
                        }
                    }
                    ++super.field851;
                }
                for (int var11 = 0; var11 < var9.field3688; ++var11) {
                    this.field3691[this.field3688] = var9.field3691[var11] + super.field866;
                    this.field3697[this.field3688] = var9.field3697[var11] + super.field866;
                    this.field3693[this.field3688] = var9.field3693[var11] + super.field866;
                    ++this.field3688;
                }
                for (int var12 = 0; var12 < var9.field866; ++var12) {
                    super.field871[super.field866] = var9.field871[var12];
                    super.field850[super.field866] = var9.field850[var12];
                    super.field870[super.field866] = var9.field870[var12];
                    ++super.field866;
                }
            }
        }
    }
}
