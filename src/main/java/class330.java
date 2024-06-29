import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class330 extends class502 {

    @OriginalMember(owner = "client!wt", name = "l", descriptor = "[I")
    public static int[] field4481 = new int[1];

    @OriginalMember(owner = "client!wt", name = "i", descriptor = "I")
    public static int field4478;

    @OriginalMember(owner = "client!wt", name = "j", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!wt", name = "k", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!wt", name = "m", descriptor = "I")
    public static int field4482;

    @OriginalMember(owner = "client!wt", name = "n", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!wt", name = "o", descriptor = "I")
    public static int field4484;

    @OriginalMember(owner = "client!wt", name = "p", descriptor = "I")
    public static int field4485;

    @OriginalMember(owner = "client!wt", name = "q", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(IBILkh;)V", line = 3)
    public static final void method2082(int arg0, byte arg1, int arg2, class17 arg3) {
        ++field4482;
        if (class84.field1157 == null && !class611.field8532) {
            if (arg3 != null && class238.method1587(arg3, true) != null) {
                class84.field1157 = arg3;
                class679.field9452 = class238.method1587(arg3, true);
                class520.field7055 = 0;
                class280.field3896 = false;
                if (arg1 == 48) {
                    class262.field3675 = arg2;
                    class455.field6206 = arg0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(Z)V", line = 27)
    public final void method58(boolean arg0) {
        ++field4486;
        if (super.field6863.method2830((byte) 110)) {
            super.field6865 = 0;
        }
        if (!arg0) {
            method2084(false);
        }
        if (super.field6865 != 1 && super.field6865 != 0) {
            super.field6865 = this.method55(-2);
        }
    }

    @OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(ILeka;)V", line = 44)
    public class330(int arg0, class492 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)I", line = 47)
    public final int method55(int arg0) {
        ++field4485;
        if (arg0 != -2) {
            this.method55(85);
        }
        return 1;
    }

    @OriginalMember(owner = "client!wt", name = "c", descriptor = "(II)V", line = 61)
    public final void method52(int arg0, int arg1) {
        if (arg1 == 0) {
            ++field4483;
            super.field6865 = arg0;
        }
    }

    @OriginalMember(owner = "client!wt", name = "c", descriptor = "(B)I", line = 74)
    public final int method2083(byte arg0) {
        ++field4484;
        if (arg0 < 49) {
            this.method52(90, 46);
        }
        return super.field6865;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(II)I", line = 85)
    public final int method57(int arg0, int arg1) {
        ++field4478;
        if (super.field6863.method2830((byte) 101)) {
            return 3;
        } else {
            if (arg1 != 0) {
                this.method58(true);
            }
            return 1;
        }
    }

    @OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(Leka;)V", line = 105)
    public class330(class492 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "(Z)V", line = 109)
    public static void method2084(boolean arg0) {
        if (!arg0) {
            field4481 = null;
        }
        field4481 = null;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(IIIIIBII)V", line = 119)
    public static final void method2085(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        ++field4479;
        int var8 = 0;
        int var9 = arg6;
        int var10 = 0;
        int var11 = -arg1 + arg2;
        int var12 = arg6 - arg1;
        int var13 = arg2 * arg2;
        int var14 = arg6 * arg6;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg6 << 1;
        if (arg5 != -2) {
            method2085(-41, 33, -120, -90, 70, (byte) 6, -109, 127);
        }
        int var22 = var12 << 1;
        int var23 = (-var21 + 1) * var13 + var17;
        int var24 = -((var21 + -1) * var18) + var14;
        int var25 = (-var22 + 1) * var15 + var19;
        int var26 = -((var22 + -1) * var20) + var16;
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg6 + -1) * var27;
        int var37 = var30;
        int var38 = (var12 + -1) * var29;
        int[] var39 = class298.field4105[arg7];
        class679.method3826(var39, -var11 + arg3, 11, -arg2 + arg3, arg4);
        class679.method3826(var39, arg3 + var11, arg5 + 13, -var11 + arg3, arg0);
        class679.method3826(var39, arg2 + arg3, 11, arg3 + var11, arg4);
        while (~var9 < -1) {
            boolean var40 = ~var12 <= ~var9;
            if (var40) {
                if (~var25 > -1) {
                    while (~var25 > -1) {
                        var25 += var33;
                        var26 += var37;
                        ++var10;
                        var33 += var30;
                        var37 += var30;
                    }
                }
                if (var26 < 0) {
                    var25 += var33;
                    var26 += var37;
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
                    var23 += var31;
                    var24 += var35;
                    ++var8;
                    var31 += var28;
                    var35 += var28;
                }
            }
            if (var24 < 0) {
                var23 += var31;
                var24 += var35;
                ++var8;
                var35 += var28;
                var31 += var28;
            }
            var23 += -var36;
            var24 += -var32;
            var36 -= var27;
            var32 -= var27;
            --var9;
            int var41 = -var9 + arg7;
            int var42 = arg7 + var9;
            int var43 = arg3 + var8;
            int var44 = arg3 - var8;
            if (var40) {
                int var45 = arg3 + var10;
                int var46 = -var10 + arg3;
                class679.method3826(class298.field4105[var41], var46, arg5 + 13, var44, arg4);
                class679.method3826(class298.field4105[var41], var45, 11, var46, arg0);
                class679.method3826(class298.field4105[var41], var43, 11, var45, arg4);
                class679.method3826(class298.field4105[var42], var46, 11, var44, arg4);
                class679.method3826(class298.field4105[var42], var45, 11, var46, arg0);
                class679.method3826(class298.field4105[var42], var43, 11, var45, arg4);
            } else {
                class679.method3826(class298.field4105[var41], var43, 11, var44, arg4);
                class679.method3826(class298.field4105[var42], var43, 11, var44, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "(I)Z", line = 288)
    public final boolean method2086(int arg0) {
        ++field4480;
        if (super.field6863.method2830((byte) 104)) {
            return false;
        } else {
            if (arg0 != 0) {
                this.method2083((byte) 111);
            }
            return true;
        }
    }
}
