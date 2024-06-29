import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tw")
public class class259 extends class204 {

    @OriginalMember(owner = "client!tw", name = "o", descriptor = "[I")
    public static int[] field3805 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!tw", name = "h", descriptor = "I")
    public static int field3798;

    @OriginalMember(owner = "client!tw", name = "j", descriptor = "I")
    public static int field3800;

    @OriginalMember(owner = "client!tw", name = "k", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!tw", name = "l", descriptor = "I")
    public static int field3802;

    @OriginalMember(owner = "client!tw", name = "m", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!tw", name = "n", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!tw", name = "p", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!tw", name = "q", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!tw", name = "i", descriptor = "Lrv;")
    public static class66 field3799;

    @OriginalMember(owner = "client!tw", name = "c", descriptor = "(I)V", line = 3)
    public static void method1710(int arg0) {
        field3799 = null;
        field3805 = null;
        if (arg0 != -1) {
            field3799 = null;
        }
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(IIIIIII)V", line = 14)
    public static final void method1711(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg6 > -49) {
            method1711(-42, 49, -128, 56, -59, 38, -24);
        }
        ++field3804;
        if (arg0 != 8 && ~arg0 != -17) {
            class472 var7 = class59.field688[arg3][arg1][arg4];
            if (var7 == null) {
                var7 = new class472(arg3);
            }
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    var7.field6550 = (short) arg5;
                    var7.field6539 = (short) arg2;
                }
            } else {
                var7.field6545 = (short) arg5;
                var7.field6552 = (short) arg2;
            }
            if (class635.field8861) {
                class207.method1320(-87);
                return;
            }
        } else {
            if (arg0 != 8) {
                int var8 = (arg1 << class732.field10110) + class179.field2263;
                int var9 = -class179.field2263 + var8;
                int var10 = arg4 << class732.field10110;
                int var11 = class179.field2263 + var10;
                int var12 = class95.field1115[arg3].method2525(arg1 - -1, arg4, (byte) 114);
                int var13 = class95.field1115[arg3].method2525(arg1, arg4 + 1, (byte) 114);
                class758.field10425[class141.field1793++] = new class532(arg0, arg3, var8, var9, var9, var8, var12, var13, var13 - arg5, var12 - arg5, var10, var11, var11, var10);
                return;
            }
            int var14 = arg1 << class732.field10110;
            int var15 = var14 - -class179.field2263;
            int var16 = arg4 << class732.field10110;
            int var17 = class179.field2263 + var16;
            int var18 = class95.field1115[arg3].method2525(arg1, arg4, (byte) 114);
            int var19 = class95.field1115[arg3].method2525(arg1 - -1, arg4 - -1, (byte) 114);
            class758.field10425[class141.field1793++] = new class532(arg0, arg3, var14, var15, var15, var14, var18, var19, -arg5 + var19, -arg5 + var18, var16, var17, var17, var16);
        }
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(B)I", line = 86)
    public final int method490(byte arg0) {
        if (arg0 <= 83) {
            return -58;
        } else {
            ++field3801;
            return 1;
        }
    }

    @OriginalMember(owner = "client!tw", name = "e", descriptor = "(II)V", line = 98)
    public static final void method1712(int arg0, int arg1) {
        class744.field10276 = arg1;
        ++field3807;
        class83.field1004 = -1;
        class83.field1004 = arg0;
        class418.method2528(0);
    }

    @OriginalMember(owner = "client!tw", name = "d", descriptor = "(I)Z", line = 109)
    public final boolean method1713(int arg0) {
        int var2 = 76 % ((arg0 - -13) / 44);
        ++field3802;
        return !super.field2853.method3505(124);
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(II)I", line = 122)
    public final int method487(int arg0, int arg1) {
        int var3 = -16 / ((arg1 - -57) / 60);
        ++field3803;
        if (super.field2853.method3505(126)) {
            return 3;
        } else {
            return ~arg0 != -1 && super.field2853.field8551.method3429((byte) -98) != 1 ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(Lfs;)V", line = 142)
    public class259(class607 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(I)V", line = 148)
    public final void method486(int arg0) {
        if (super.field2853.method3505(126)) {
            super.field2852 = 0;
        }
        ++field3798;
        if (~super.field2852 > -1 && ~super.field2852 < -3) {
            super.field2852 = this.method490((byte) 104);
        }
        if (arg0 != -4591) {
            method1712(107, 30);
        }
    }

    @OriginalMember(owner = "client!tw", name = "d", descriptor = "(II)V", line = 165)
    public final void method488(int arg0, int arg1) {
        super.field2852 = arg0;
        ++field3800;
        if (arg1 > -105) {
            this.method1713(109);
        }
    }

    @OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(ILfs;)V", line = 179)
    public class259(int arg0, class607 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!tw", name = "b", descriptor = "(B)I", line = 183)
    public final int method1714(byte arg0) {
        ++field3806;
        return arg0 != -98 ? 89 : super.field2852;
    }
}
