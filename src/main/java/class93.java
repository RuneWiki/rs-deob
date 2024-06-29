import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fca")
public class class93 extends class264 {

    @OriginalMember(owner = "client!fca", name = "k", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!fca", name = "l", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!fca", name = "m", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!fca", name = "n", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!fca", name = "o", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!fca", name = "p", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!fca", name = "q", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!fca", name = "r", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!fca", name = "b", descriptor = "(BI)V", line = 4)
    public final void method659(byte arg0, int arg1) {
        super.field3733 = arg1;
        ++field1212;
        if (arg0 > -114) {
            this.method665(-15);
        }
    }

    @OriginalMember(owner = "client!fca", name = "b", descriptor = "(I)V", line = 15)
    public final void method660(int arg0) {
        if (super.field3731.method3639(true) == class234.field3384) {
            if (super.field3731.method3633(126)) {
                super.field3733 = 0;
            }
        } else {
            super.field3733 = 1;
        }
        ++field1210;
        int var2 = -118 % ((1 - arg0) / 41);
        if (super.field3733 != 0 && super.field3733 != 1) {
            super.field3733 = this.method663((byte) -38);
        }
    }

    @OriginalMember(owner = "client!fca", name = "b", descriptor = "(B)I", line = 36)
    public final int method661(byte arg0) {
        if (arg0 > -31) {
            return -1;
        } else {
            ++field1211;
            return super.field3733;
        }
    }

    @OriginalMember(owner = "client!fca", name = "<init>", descriptor = "(ILmfa;)V", line = 48)
    public class93(int arg0, class640 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(IIIILha;I)V", line = 53)
    public static final void method662(int arg0, int arg1, int arg2, int arg3, class66 arg4, int arg5) {
        arg4.method455(arg2, arg5, arg2 - -arg1, arg3 + arg5);
        ++field1208;
        arg4.method488(arg5, arg2, -16777216, arg3, 1, arg1);
        if (~class261.field3682 <= -101) {
            float var6 = (float) class436.field6225 / (float) class436.field6236;
            int var7 = arg1;
            int var8 = arg3;
            if (var6 < 1.0F) {
                var8 = (int) ((float) arg1 * var6);
            } else {
                var7 = (int) ((float) arg3 / var6);
            }
            int var9 = (arg1 - var7) / 2 + arg2;
            int var10 = (-var8 + arg3) / 2 + arg5;
            if (class572.field8098 == null || class572.field8098.method777() != arg1 || ~arg3 != ~class572.field8098.method789()) {
                class436.method2625(class436.field6239, class436.field6233 - -class436.field6225, class436.field6239 + class436.field6236, class436.field6233, var9, var10, var9 - -var7, var8 + var10);
                class436.method2620(arg4);
                class572.field8098 = arg4.method504(var9, var10, var7, var8, false);
            }
            class572.field8098.method785(var9, var10);
            int var11 = class779.field10741 * var7 / class436.field6236;
            int var12 = class360.field5233 * var8 / class436.field6225;
            int var13 = var9 - -(class656.field9251 * var7 / class436.field6236);
            int var14 = -(class259.field3646 * var8 / class436.field6225) + var10 + -var12 - -var8;
            int var15 = -1996554240;
            if (class536.field7555 == class23.field344) {
                var15 = -1996488705;
            }
            arg4.method474(var13, var14, var11, var12, var15, 1);
            arg4.method457(var13, var14, var11, var12, var15, arg0);
            if (~class22.field334 < -1) {
                int var16;
                if (~class668.field9392 >= -51) {
                    var16 = class668.field9392 * 5;
                } else {
                    var16 = (-class668.field9392 + 100) * 5;
                }
                for (class497 var17 = (class497) class436.field6223.method2508((byte) 122); var17 != null; var17 = (class497) class436.field6223.method2505((byte) -55)) {
                    class665 var18 = class436.field6213.method3711((byte) 48, var17.field7063);
                    if (class356.method2241(var18, (byte) -117)) {
                        if (class108.field1313 == var17.field7063) {
                            int var19 = var17.field7070 * var7 / class436.field6236 + var9;
                            int var20 = (-var17.field7064 + class436.field6225) * var8 / class436.field6225 + var10;
                            arg4.method488(var20 + -2, var19 + -2, 16776960 | var16 << 24, 4, 1, 4);
                        } else if (class503.field7192 != -1 && ~class503.field7192 == ~var18.field9335) {
                            int var21 = var17.field7070 * var7 / class436.field6236 + var9;
                            int var22 = (class436.field6225 - var17.field7064) * var8 / class436.field6225 + var10;
                            arg4.method488(var22 + -2, var21 + -2, 16776960 | var16 << 24, 4, arg0 + 1, 4);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(B)I", line = 145)
    public final int method663(byte arg0) {
        ++field1214;
        if (arg0 != -38) {
            method662(2, 55, 90, -105, (class66) null, 10);
        }
        return 1;
    }

    @OriginalMember(owner = "client!fca", name = "c", descriptor = "(BI)Z", line = 156)
    public static final boolean method664(byte arg0, int arg1) {
        ++field1209;
        if (arg0 <= 27) {
            return false;
        } else if (~arg1 != -48 && arg1 != 5 && arg1 != 9 && arg1 != 46 && ~arg1 != -18) {
            return ~arg1 == -24 || arg1 == 1002;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fca", name = "c", descriptor = "(I)Z", line = 175)
    public final boolean method665(int arg0) {
        if (arg0 != 14996) {
            return true;
        } else {
            ++field1215;
            if (super.field3731.method3633(93)) {
                return false;
            } else {
                return super.field3731.method3639(true) == class234.field3384;
            }
        }
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(BI)I", line = 197)
    public final int method666(byte arg0, int arg1) {
        ++field1213;
        if (arg0 != 112) {
            return 99;
        } else if (super.field3731.method3633(122)) {
            return 3;
        } else if (super.field3731.method3639(true) == class234.field3384) {
            if (~arg1 == -1) {
                if (~super.field3731.field8996.method1488((byte) -101) == -2) {
                    return 2;
                }
                if (super.field3731.field9031.method2235((byte) -39) == 1) {
                    return 2;
                }
                if (~super.field3731.field9011.method2495((byte) -114) < -1) {
                    return 2;
                }
            }
            return 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!fca", name = "<init>", descriptor = "(Lmfa;)V", line = 233)
    public class93(class640 arg0) {
        super(arg0);
    }
}
