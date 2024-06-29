import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class245 extends class334 {

    @OriginalMember(owner = "client!hr", name = "N", descriptor = "Z")
    public static boolean field3515 = false;

    @OriginalMember(owner = "client!hr", name = "F", descriptor = "Lpd;")
    public static class646 field3508 = new class646(1);

    @OriginalMember(owner = "client!hr", name = "E", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!hr", name = "I", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!hr", name = "J", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!hr", name = "K", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!hr", name = "L", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!hr", name = "M", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!hr", name = "H", descriptor = "[Ltfa;")
    private class683[] field3509;

    @OriginalMember(owner = "client!hr", name = "g", descriptor = "(I)V")
    public static void method1627(int arg0) {
        field3508 = null;
        if (arg0 <= 34) {
            method1628(-20, -55, 117, 15, (byte) 26, -60, 120, -119);
        }
    }

    @OriginalMember(owner = "client!hr", name = "<init>", descriptor = "()V")
    public class245() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIIIBIII)V")
    public static final void method1628(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        ++field3512;
        int var8 = 0;
        int var9 = arg0;
        int var10 = 0;
        int var11 = arg3 - arg6;
        int var12 = -arg6 + arg0;
        int var13 = arg3 * arg3;
        int var14 = arg0 * arg0;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg0 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 - -var17;
        int var24 = -((var21 - 1) * var18) + var14;
        int var25 = (-var22 + 1) * var15 - -var19;
        if (arg4 < 49) {
            method1628(37, -29, 68, -89, (byte) 92, 98, 84, -33);
        }
        int var26 = -((var22 + -1) * var20) + var16;
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 + -3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg0 + -1) * var27;
        int var37 = var30;
        int var38 = (var12 + -1) * var29;
        if (~class515.field7102 >= ~arg2 && class698.field9801 >= arg2) {
            int[] var39 = class74.field1144[arg2];
            int var40 = class645.method3656(class435.field6058, class742.field10301, -arg3 + arg1, 26289);
            int var41 = class645.method3656(class435.field6058, class742.field10301, arg1 - -arg3, 26289);
            int var42 = class645.method3656(class435.field6058, class742.field10301, -var11 + arg1, 26289);
            int var43 = class645.method3656(class435.field6058, class742.field10301, arg1 - -var11, 26289);
            class379.method2284(var40, var42, var39, arg7, 2);
            class379.method2284(var42, var43, var39, arg5, 2);
            class379.method2284(var43, var41, var39, arg7, 2);
        }
        while (var9 > 0) {
            boolean var44 = ~var9 >= ~var12;
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var26 += var37;
                        var33 += var30;
                        ++var10;
                        var37 += var30;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var25 += var33;
                    var33 += var30;
                    ++var10;
                    var37 += var30;
                }
                var26 += -var34;
                var25 += -var38;
                var34 -= var29;
                var38 -= var29;
            }
            if (var23 < 0) {
                while (~var23 > -1) {
                    var24 += var35;
                    var23 += var31;
                    var31 += var28;
                    ++var8;
                    var35 += var28;
                }
            }
            if (var24 < 0) {
                var23 += var31;
                var24 += var35;
                var31 += var28;
                ++var8;
                var35 += var28;
            }
            var24 += -var32;
            var23 += -var36;
            --var9;
            var32 -= var27;
            var36 -= var27;
            int var45 = arg2 - var9;
            int var46 = arg2 + var9;
            if (~var46 <= ~class515.field7102 && ~class698.field9801 <= ~var45) {
                int var47 = class645.method3656(class435.field6058, class742.field10301, arg1 + var8, 26289);
                int var48 = class645.method3656(class435.field6058, class742.field10301, -var8 + arg1, 26289);
                if (var44) {
                    int var49 = class645.method3656(class435.field6058, class742.field10301, arg1 + var10, 26289);
                    int var50 = class645.method3656(class435.field6058, class742.field10301, -var10 + arg1, 26289);
                    if (var45 >= class515.field7102) {
                        int[] var51 = class74.field1144[var45];
                        class379.method2284(var48, var50, var51, arg7, 2);
                        class379.method2284(var50, var49, var51, arg5, 2);
                        class379.method2284(var49, var47, var51, arg7, 2);
                    }
                    if (class698.field9801 >= var46) {
                        int[] var52 = class74.field1144[var46];
                        class379.method2284(var48, var50, var52, arg7, 2);
                        class379.method2284(var50, var49, var52, arg5, 2);
                        class379.method2284(var49, var47, var52, arg7, 2);
                    }
                } else {
                    if (~var45 <= ~class515.field7102) {
                        class379.method2284(var48, var47, class74.field1144[var45], arg7, 2);
                    }
                    if (var46 <= class698.field9801) {
                        class379.method2284(var48, var47, class74.field1144[var46], arg7, 2);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(II)[I")
    public final int[] method28(int arg0, int arg1) {
        ++field3511;
        if (arg1 != -22563988) {
            field3508 = null;
        }
        int[] var3 = super.field4743.method1027((byte) -75, arg0);
        if (super.field4743.field1993) {
            this.method1630(arg1 + 22533120, super.field4743.method1024((byte) 121));
        }
        return var3;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IZLol;)V")
    public final void method29(int arg0, boolean arg1, class431 arg2) {
        ++field3514;
        if (~arg0 != -1) {
            if (arg0 == 1) {
                super.field4747 = ~arg2.method2557(14929) == -2;
            }
        } else {
            this.field3509 = new class683[arg2.method2557(14929)];
            for (int var4 = 0; ~var4 > ~this.field3509.length; ++var4) {
                int var5 = arg2.method2557(14929);
                if (var5 != 0) {
                    if (var5 != 1) {
                        if (var5 != 2) {
                            if (var5 == 3) {
                                this.field3509[var4] = class329.method2002(-1, arg2);
                            }
                        } else {
                            this.field3509[var4] = class169.method1253(arg2, 64);
                        }
                    } else {
                        this.field3509[var4] = class249.method1655(true, arg2);
                    }
                } else {
                    this.field3509[var4] = class65.method651((byte) -128, arg2);
                }
            }
        }
        if (arg1) {
            method1628(45, -75, -95, 35, (byte) -1, 126, -67, 120);
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(BIIIIII)V")
    public static final void method1629(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = -39 % ((71 - arg0) / 37);
        class509.field7002 = arg5;
        class344.field4884 = arg4;
        class728.field10149 = arg2;
        ++field3513;
        class128.field2152 = arg3;
        class727.field10123 = arg1;
        class686.field9706 = arg6;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(I[[I)V")
    private final void method1630(int arg0, int[][] arg1) {
        ++field3507;
        int var3 = class439.field6099;
        int var4 = class327.field4668;
        if (arg0 != -30868) {
            field3508 = null;
        }
        class165.method1238(true, arg1);
        class705.method3942(0, 0, class478.field6578, class147.field2360, (byte) 117);
        if (this.field3509 != null) {
            for (int var5 = 0; ~var5 > ~this.field3509.length; ++var5) {
                class683 var6 = this.field3509[var5];
                int var7 = var6.field9678;
                int var8 = var6.field9679;
                if (~var7 > -1) {
                    if (~var8 <= -1) {
                        var6.method267(var4, 1, var3);
                    }
                } else if (var8 >= 0) {
                    var6.method268(true, var4, var3);
                } else {
                    var6.method269(var4, true, var3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method283(boolean arg0, int arg1) {
        ++field3510;
        int[][] var3 = super.field4734.method275(26422, arg1);
        if (super.field4734.field425) {
            int var4 = class439.field6099;
            int var5 = class327.field4668;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field4734.method273(0);
            this.method1630(-30868, var6);
            for (int var8 = 0; ~var8 > ~class327.field4668; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; ~class439.field6099 < ~var14; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class194.method1380(var15 << 4, 4080);
                    var12[var14] = class194.method1380(var15 >> 4, 4080);
                    var11[var14] = class194.method1380(4080, var15 >> 12);
                }
            }
        }
        if (!arg0) {
            field3515 = true;
        }
        return var3;
    }
}
