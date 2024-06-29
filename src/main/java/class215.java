import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class215 extends class184 {

    @OriginalMember(owner = "client!dk", name = "N", descriptor = "Lsf;")
    private static class108 field3817 = class140.method973(255, "Loading world list data");

    @OriginalMember(owner = "client!dk", name = "F", descriptor = "Lsf;")
    public static class108 field3809 = field3817;

    @OriginalMember(owner = "client!dk", name = "Y", descriptor = "Lsf;")
    public static class108 field3828 = class140.method973(255, "3D)2Softwarebibliothek gestartet)3");

    @OriginalMember(owner = "client!dk", name = "ab", descriptor = "Lsf;")
    public static class108 field3830 = class140.method973(255, "::fpsoff");

    @OriginalMember(owner = "client!dk", name = "X", descriptor = "Lsf;")
    public static class108 field3827 = class140.method973(255, "Ladevorgang )2 bitte warten Sie)3");

    @OriginalMember(owner = "client!dk", name = "H", descriptor = "Lhe;")
    public static class94 field3811 = new class94(64);

    @OriginalMember(owner = "client!dk", name = "v", descriptor = "I")
    public int field3800;

    @OriginalMember(owner = "client!dk", name = "x", descriptor = "I")
    public int field3802;

    @OriginalMember(owner = "client!dk", name = "y", descriptor = "I")
    public int field3803;

    @OriginalMember(owner = "client!dk", name = "z", descriptor = "I")
    public int field3804;

    @OriginalMember(owner = "client!dk", name = "A", descriptor = "I")
    public int field3805;

    @OriginalMember(owner = "client!dk", name = "B", descriptor = "I")
    public int field3806;

    @OriginalMember(owner = "client!dk", name = "I", descriptor = "I")
    public int field3812;

    @OriginalMember(owner = "client!dk", name = "K", descriptor = "I")
    public int field3814;

    @OriginalMember(owner = "client!dk", name = "L", descriptor = "I")
    public int field3815;

    @OriginalMember(owner = "client!dk", name = "O", descriptor = "I")
    public int field3818;

    @OriginalMember(owner = "client!dk", name = "Q", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!dk", name = "R", descriptor = "I")
    public int field3821;

    @OriginalMember(owner = "client!dk", name = "S", descriptor = "I")
    public int field3822;

    @OriginalMember(owner = "client!dk", name = "T", descriptor = "I")
    public int field3823;

    @OriginalMember(owner = "client!dk", name = "U", descriptor = "I")
    public int field3824;

    @OriginalMember(owner = "client!dk", name = "V", descriptor = "I")
    public int field3825;

    @OriginalMember(owner = "client!dk", name = "W", descriptor = "I")
    public int field3826;

    @OriginalMember(owner = "client!dk", name = "Z", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!dk", name = "bb", descriptor = "I")
    public int field3831;

    @OriginalMember(owner = "client!dk", name = "J", descriptor = "Lkj;")
    public class179 field3813;

    @OriginalMember(owner = "client!dk", name = "C", descriptor = "Lka;")
    public class191 field3807;

    @OriginalMember(owner = "client!dk", name = "E", descriptor = "Ltd;")
    public class244 field3808;

    @OriginalMember(owner = "client!dk", name = "w", descriptor = "Lik;")
    public static class262 field3801;

    @OriginalMember(owner = "client!dk", name = "G", descriptor = "Lik;")
    public static class262 field3810;

    @OriginalMember(owner = "client!dk", name = "M", descriptor = "Lgm;")
    public class297 field3816;

    @OriginalMember(owner = "client!dk", name = "cb", descriptor = "[I")
    public static int[] field3832;

    @OriginalMember(owner = "client!dk", name = "P", descriptor = "[[S")
    public static short[][] field3819;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(B)V", line = 10)
    public static void method1474(byte arg0) {
        field3830 = null;
        field3819 = (short[][]) null;
        field3832 = null;
        field3809 = null;
        int var1 = 53 % ((arg0 - 5) / 57);
        field3810 = null;
        field3811 = null;
        field3801 = null;
        field3827 = null;
        field3817 = null;
        field3828 = null;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lch;IIIIIIIZ)V", line = 32)
    public static final void method1475(class140 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class1.field10;
        int var11;
        int var12 = var11 = (arg7 << 7) - class311.field5381;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class278.field4883[arg1][arg6][arg7] - class260.field4592;
        int var18 = class278.field4883[arg1][arg6 + 1][arg7] - class260.field4592;
        int var19 = class278.field4883[arg1][arg6 + 1][arg7 + 1] - class260.field4592;
        int var20 = class278.field4883[arg1][arg6][arg7 + 1] - class260.field4592;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 < 50) {
            return;
        }
        int var27 = arg4 * var11 + arg5 * var14 >> 16;
        int var28 = arg5 * var11 - arg4 * var14 >> 16;
        int var30 = arg3 * var18 - arg2 * var28 >> 16;
        int var31 = arg2 * var18 + arg3 * var28 >> 16;
        if (var31 < 50) {
            return;
        }
        int var33 = arg4 * var16 + arg5 * var13 >> 16;
        int var34 = arg5 * var16 - arg4 * var13 >> 16;
        int var36 = arg3 * var19 - arg2 * var34 >> 16;
        int var37 = arg2 * var19 + arg3 * var34 >> 16;
        if (var37 < 50) {
            return;
        }
        int var39 = arg4 * var15 + arg5 * var9 >> 16;
        int var40 = arg5 * var15 - arg4 * var9 >> 16;
        int var42 = arg3 * var20 - arg2 * var40 >> 16;
        int var43 = arg2 * var20 + arg3 * var40 >> 16;
        if (var43 < 50) {
            return;
        }
        int var45 = (var21 << 9) / var25 + class263.field4658;
        int var46 = (var24 << 9) / var25 + class263.field4662;
        int var47 = (var27 << 9) / var31 + class263.field4658;
        int var48 = (var30 << 9) / var31 + class263.field4662;
        int var49 = (var33 << 9) / var37 + class263.field4658;
        int var50 = (var36 << 9) / var37 + class263.field4662;
        int var51 = (var39 << 9) / var43 + class263.field4658;
        int var52 = (var42 << 9) / var43 + class263.field4662;
        class263.field4660 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class1.field7 && class14.method89(class263.field4658 + class170.field3045, class263.field4662 + class160.field2877, var50, var52, var48, var49, var51, var47)) {
                class242.field4205 = arg6;
                class200.field3619 = arg7;
            }
            if (!class231.field4051 && !arg8) {
                class263.field4648 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class263.field4647 || var51 > class263.field4647 || var47 > class263.field4647) {
                    class263.field4648 = true;
                }
                if (arg0.field2472 == -1) {
                    if (arg0.field2467 != 12345678) {
                        class263.method1897(var50, var52, var48, var49, var51, var47, arg0.field2467, arg0.field2474, arg0.field2476);
                    }
                } else if (!class312.field5394) {
                    int var53 = class263.field4661.method564(65535, arg0.field2472);
                    class263.method1897(var50, var52, var48, var49, var51, var47, class190.method1349(var53, arg0.field2467), class190.method1349(var53, arg0.field2474), class190.method1349(var53, arg0.field2476));
                } else if (arg0.field2460) {
                    class263.method1896(var50, var52, var48, var49, var51, var47, arg0.field2467, arg0.field2474, arg0.field2476, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field2472);
                } else {
                    class263.method1896(var50, var52, var48, var49, var51, var47, arg0.field2467, arg0.field2474, arg0.field2476, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field2472);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class1.field7 && class14.method89(class263.field4658 + class170.field3045, class263.field4662 + class160.field2877, var46, var48, var52, var45, var47, var51)) {
            class242.field4205 = arg6;
            class200.field3619 = arg7;
        }
        if (class231.field4051 || arg8) {
            return;
        }
        class263.field4648 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class263.field4647 || var47 > class263.field4647 || var51 > class263.field4647) {
            class263.field4648 = true;
        }
        if (arg0.field2472 == -1) {
            if (arg0.field2473 != 12345678) {
                class263.method1897(var46, var48, var52, var45, var47, var51, arg0.field2473, arg0.field2476, arg0.field2474);
            }
        } else if (class312.field5394) {
            class263.method1896(var46, var48, var52, var45, var47, var51, arg0.field2473, arg0.field2476, arg0.field2474, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field2472);
        } else {
            int var54 = class263.field4661.method564(65535, arg0.field2472);
            class263.method1897(var46, var48, var52, var45, var47, var51, class190.method1349(var54, arg0.field2473), class190.method1349(var54, arg0.field2476), class190.method1349(var54, arg0.field2474));
        }
    }

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "(B)V", line = 202)
    public final void method1476(byte arg0) {
        this.field3813 = null;
        int var2 = 107 / ((-arg0 - 46) / 62);
        this.field3808 = null;
        this.field3816 = null;
        field3820++;
        this.field3807 = null;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IBIIII)V", line = 225)
    public static final void method1477(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field3829++;
        int var6 = arg4 - arg0;
        int var7 = arg5 - arg2;
        if (var7 == 0) {
            if (var6 != 0) {
                class229.method1535(arg2, arg4, arg0, (byte) -115, arg3);
            }
        } else if (var6 == 0) {
            class35.method243(arg5, arg3, arg0, arg2, arg1 ^ 0x1DAB);
        } else {
            if (var7 < 0) {
                var7 = -var7;
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg2;
                arg2 = arg0;
                arg0 = var9;
                int var10 = arg5;
                arg5 = arg4;
                arg4 = var10;
            }
            if (arg2 > arg5) {
                int var11 = arg2;
                arg2 = arg5;
                int var12 = arg0;
                arg0 = arg4;
                arg4 = var12;
                arg5 = var11;
            }
            if (arg1 != 106) {
                field3809 = (class108) null;
            }
            int var13 = arg4 - arg0;
            if (var13 < 0) {
                var13 = -var13;
            }
            int var14 = arg5 - arg2;
            int var15 = -(var14 >> 1);
            int var16 = arg0;
            int var17 = arg4 <= arg0 ? -1 : 1;
            if (var8) {
                for (int var19 = arg2; var19 <= arg5; var19++) {
                    var15 += var13;
                    class106.field1839[var19][var16] = arg3;
                    if (var15 > 0) {
                        var15 -= var14;
                        var16 += var17;
                    }
                }
            } else {
                for (int var18 = arg2; var18 <= arg5; var18++) {
                    var15 += var13;
                    class106.field1839[var16][var18] = arg3;
                    if (var15 > 0) {
                        var15 -= var14;
                        var16 += var17;
                    }
                }
            }
        }
    }
}
