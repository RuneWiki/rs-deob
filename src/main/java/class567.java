import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class567 extends class56 {

    @OriginalMember(owner = "client!qi", name = "H", descriptor = "I")
    private int field8048 = 2000;

    @OriginalMember(owner = "client!qi", name = "O", descriptor = "I")
    private int field8054 = 4096;

    @OriginalMember(owner = "client!qi", name = "I", descriptor = "I")
    private int field8049 = 16;

    @OriginalMember(owner = "client!qi", name = "K", descriptor = "I")
    private int field8051 = 0;

    @OriginalMember(owner = "client!qi", name = "E", descriptor = "I")
    private int field8046 = 0;

    @OriginalMember(owner = "client!qi", name = "L", descriptor = "Z")
    public static boolean field8052 = false;

    @OriginalMember(owner = "client!qi", name = "G", descriptor = "F")
    public static float field8047;

    @OriginalMember(owner = "client!qi", name = "J", descriptor = "I")
    public static int field8050;

    @OriginalMember(owner = "client!qi", name = "N", descriptor = "I")
    public static int field8053;

    @OriginalMember(owner = "client!qi", name = "P", descriptor = "I")
    public static int field8055;

    @OriginalMember(owner = "client!qi", name = "Q", descriptor = "I")
    public static int field8056;

    @OriginalMember(owner = "client!qi", name = "R", descriptor = "I")
    public static int field8057;

    @OriginalMember(owner = "client!qi", name = "D", descriptor = "Ljava/lang/Object;")
    public static Object field8045;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V")
    public final void method364(int arg0) {
        if (arg0 != 7) {
            this.field8049 = -51;
        }
        ++field8056;
        class135.method965(false);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILee;I)V")
    public final void method6(int arg0, class675 arg1, int arg2) {
        if (arg0 != 3731) {
            this.method6(-90, (class675) null, -29);
        }
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (~arg2 == -5) {
                            this.field8054 = arg1.method3757((byte) -65);
                        }
                    } else {
                        this.field8046 = arg1.method3757((byte) -65);
                    }
                } else {
                    this.field8049 = arg1.method3750((byte) 35);
                }
            } else {
                this.field8048 = arg1.method3757((byte) -65);
            }
        } else {
            this.field8051 = arg1.method3750((byte) 35);
        }
        ++field8053;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IZ)[I")
    public final int[] method24(int arg0, boolean arg1) {
        ++field8050;
        int[] var3 = super.field673.method3270(arg0, (byte) -42);
        if (!arg1) {
            field8052 = true;
        }
        if (super.field673.field8073) {
            int var4 = this.field8054 >> 1;
            int[][] var5 = super.field673.method3269(true);
            Random var6 = new Random((long) this.field8051);
            for (int var7 = 0; var7 < this.field8048; ++var7) {
                int var8 = this.field8054 > 0 ? this.field8046 - -class111.method790(this.field8054, var6, (byte) -119) - var4 : this.field8046;
                int var9 = (4082 & var8) >> 4;
                int var10 = class111.method790(class328.field4576, var6, (byte) -119);
                int var11 = class111.method790(class226.field3050, var6, (byte) -119);
                int var12 = (class97.field1172[var9] * this.field8049 >> 12) + var10;
                int var13 = (class231.field3111[var9] * this.field8049 >> 12) + var11;
                int var14 = -var11 + var13;
                int var15 = -var10 + var12;
                if (~var15 != -1 || ~var14 != -1) {
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (~var14 > -1) {
                        var14 = -var14;
                    }
                    boolean var16 = var14 > var15;
                    if (var16) {
                        int var17 = var10;
                        var10 = var11;
                        int var18 = var12;
                        var11 = var17;
                        var12 = var13;
                        var13 = var18;
                    }
                    if (~var10 < ~var12) {
                        int var19 = var10;
                        int var20 = var11;
                        var10 = var12;
                        var12 = var19;
                        var11 = var13;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var10 + var12;
                    int var23 = -var11 + var13;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = 1024 - (class111.method790(4096, var6, (byte) -119) >> 2);
                    if (~var23 > -1) {
                        var23 = -var23;
                    }
                    int var27 = var11 < var13 ? 1 : -1;
                    for (int var28 = var10; ~var12 < ~var28; ++var28) {
                        int var29 = (-var10 + var28) * var25 + var26 + 1024;
                        int var30 = class445.field6318 & var28;
                        int var31 = var21 & class636.field8759;
                        var24 += var23;
                        if (var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                        if (~var24 < -1) {
                            var21 += var27;
                            var24 += -var22;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "(I)V")
    public static void method3266(int arg0) {
        if (arg0 != -1) {
            method3267(-17, 83, (class285) null, -122, 38, -16, 39, 123, -6, -57, 1);
        }
        field8045 = null;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IILuu;IIIIIIII)Z")
    public static final boolean method3267(int arg0, int arg1, class285 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field8057;
        int var11 = arg0;
        int var12 = arg7;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg0 - var13;
        if (arg9 < 111) {
            method3266(17);
        }
        int var16 = -var14 + arg7;
        class584.field8220[var13][var14] = 99;
        class207.field2722[var13][var14] = 0;
        byte var17 = 0;
        class584.field8223[var17] = arg0;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class538.field7549[var10001] = arg7;
        int[][] var19 = arg2.field4035;
        while (~var26 != ~var18) {
            var11 = class584.field8223[var18];
            var12 = class538.field7549[var18];
            int var20 = -arg2.field4046 + var11;
            int var21 = var12 - var16;
            int var22 = -var15 + var11;
            var18 = 4095 & var18 + 1;
            int var23 = -arg2.field4041 + var12;
            if (~arg1 != 3) {
                if (arg1 != -3) {
                    if (~arg1 != 1) {
                        if (arg1 != -1) {
                            if (~arg1 != -1 && ~arg1 != -2 && arg1 != 2 && arg1 != 3 && arg1 != 9) {
                                if (arg2.method1869(arg10, arg5, arg6, var11, var12, (byte) -85, arg1, 1)) {
                                    class721.field10007 = var11;
                                    class102.field1217 = var12;
                                    return true;
                                }
                            } else if (arg2.method1872(var11, var12, arg5, 1, arg1, arg10, arg6, -1)) {
                                class102.field1217 = var12;
                                class721.field10007 = var11;
                                return true;
                            }
                        } else if (arg2.method1865(var11, arg8, arg3, var12, arg10, 1, arg5, arg4, false)) {
                            class721.field10007 = var11;
                            class102.field1217 = var12;
                            return true;
                        }
                    } else if (arg2.method1866(arg8, arg3, 1, var12, arg5, -1, 1, arg10, arg4, var11)) {
                        class102.field1217 = var12;
                        class721.field10007 = var11;
                        return true;
                    }
                } else if (class427.method2601(arg3, arg5, 1, var12, arg8, true, 1, var11, arg10)) {
                    class721.field10007 = var11;
                    class102.field1217 = var12;
                    return true;
                }
            } else if (~arg5 == ~var11 && ~arg10 == ~var12) {
                class721.field10007 = var11;
                class102.field1217 = var12;
                return true;
            }
            int var25 = class207.field2722[var22][var21] + 1;
            if (~var22 < -1 && class584.field8220[var22 - 1][var21] == 0 && ~(var19[var20 + -1][var23] & 1109655552) == -1) {
                class584.field8223[var26] = var11 + -1;
                class538.field7549[var26] = var12;
                var26 = var26 - -1 & 4095;
                class584.field8220[var22 + -1][var21] = 2;
                class207.field2722[var22 + -1][var21] = var25;
            }
            if (var22 < 127 && class584.field8220[var22 + 1][var21] == 0 && (var19[var20 + 1][var23] & 1612972032) == 0) {
                class584.field8223[var26] = var11 + 1;
                class538.field7549[var26] = var12;
                var26 = var26 + 1 & 4095;
                class584.field8220[var22 + 1][var21] = 8;
                class207.field2722[var22 + 1][var21] = var25;
            }
            if (~var21 < -1 && class584.field8220[var22][var21 + -1] == 0 && (1084489728 & var19[var20][var23 + -1]) == 0) {
                class584.field8223[var26] = var11;
                class538.field7549[var26] = var12 + -1;
                var26 = 4095 & var26 - -1;
                class584.field8220[var22][var21 - 1] = 1;
                class207.field2722[var22][var21 + -1] = var25;
            }
            if (~var21 > -128 && ~class584.field8220[var22][var21 + 1] == -1 && (1210318848 & var19[var20][var23 + 1]) == 0) {
                class584.field8223[var26] = var11;
                class538.field7549[var26] = var12 + 1;
                var26 = var26 + 1 & 4095;
                class584.field8220[var22][var21 - -1] = 4;
                class207.field2722[var22][var21 + 1] = var25;
            }
            if (var22 > 0 && ~var21 < -1 && ~class584.field8220[var22 + -1][var21 + -1] == -1 && (1134821376 & var19[var20 + -1][var23 + -1]) == 0 && ~(1109655552 & var19[var20 + -1][var23]) == -1 && (var19[var20][var23 - 1] & 1084489728) == 0) {
                class584.field8223[var26] = var11 + -1;
                class538.field7549[var26] = var12 + -1;
                var26 = var26 - -1 & 4095;
                class584.field8220[var22 + -1][var21 + -1] = 3;
                class207.field2722[var22 - 1][var21 + -1] = var25;
            }
            if (~var22 > -128 && ~var21 < -1 && ~class584.field8220[var22 + 1][var21 + -1] == -1 && ~(var19[var20 + 1][var23 + -1] & 1625554944) == -1 && ~(var19[var20 + 1][var23] & 1612972032) == -1 && (var19[var20][var23 + -1] & 1084489728) == 0) {
                class584.field8223[var26] = var11 + 1;
                class538.field7549[var26] = var12 - 1;
                var26 = var26 - -1 & 4095;
                class584.field8220[var22 + 1][var21 + -1] = 9;
                class207.field2722[var22 - -1][var21 + -1] = var25;
            }
            if (var22 > 0 && var21 < 127 && ~class584.field8220[var22 + -1][var21 + 1] == -1 && ~(1310982144 & var19[var20 + -1][var23 + 1]) == -1 && (1109655552 & var19[var20 - 1][var23]) == 0 && ~(var19[var20][var23 - -1] & 1210318848) == -1) {
                class584.field8223[var26] = var11 - 1;
                class538.field7549[var26] = var12 - -1;
                var26 = var26 + 1 & 4095;
                class584.field8220[var22 + -1][var21 + 1] = 6;
                class207.field2722[var22 + -1][var21 + 1] = var25;
            }
            if (~var22 > -128 && var21 < 127 && class584.field8220[var22 + 1][var21 + 1] == 0 && (2015625216 & var19[var20 + 1][var23 - -1]) == 0 && (var19[var20 + 1][var23] & 1612972032) == 0 && (1210318848 & var19[var20][var23 + 1]) == 0) {
                class584.field8223[var26] = var11 + 1;
                class538.field7549[var26] = var12 + 1;
                var26 = var26 - -1 & 4095;
                class584.field8220[var22 + 1][var21 + 1] = 12;
                class207.field2722[var22 + 1][var21 + 1] = var25;
            }
        }
        class721.field10007 = var11;
        class102.field1217 = var12;
        return false;
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "()V")
    public class567() {
        super(0, true);
    }
}
