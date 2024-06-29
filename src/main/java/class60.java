import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public class class60 extends class601 {

    @OriginalMember(owner = "client!sv", name = "n", descriptor = "[I")
    public static int[] field867 = new int[13];

    @OriginalMember(owner = "client!sv", name = "t", descriptor = "[I")
    public static int[] field873 = new int[8];

    @OriginalMember(owner = "client!sv", name = "l", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!sv", name = "m", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!sv", name = "o", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!sv", name = "p", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!sv", name = "q", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!sv", name = "r", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!sv", name = "s", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!sv", name = "u", descriptor = "J")
    public static long field874;

    @OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(ILqea;)V")
    public class60(int arg0, class339 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "(I)V")
    public static void method430(int arg0) {
        if (arg0 != 174) {
            field867 = null;
        }
        field867 = null;
        field873 = null;
    }

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "(I)I")
    public final int method431(int arg0) {
        ++field872;
        return arg0 != 0 ? -11 : super.field8131;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(IB)I")
    public final int method36(int arg0, byte arg1) {
        ++field871;
        if (arg1 != 22) {
            this.method43(-17, 12);
        }
        return !class123.method764(super.field8137.field4789.method963(0), (byte) -60) ? 3 : 1;
    }

    @OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(Lqea;)V")
    public class60(class339 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(B)V")
    public final void method41(byte arg0) {
        if (super.field8137.field4789.method962(0) && !class123.method764(super.field8137.field4789.method963(0), (byte) -87)) {
            super.field8131 = 0;
        }
        ++field865;
        if (super.field8131 < 0 || super.field8131 > 1) {
            super.field8131 = this.method45(8976);
        }
        int var2 = -11 % ((arg0 - 59) / 33);
    }

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "(II)V")
    public final void method43(int arg0, int arg1) {
        super.field8131 = arg1;
        int var3 = 111 / ((arg0 - 22) / 34);
        ++field869;
    }

    @OriginalMember(owner = "client!sv", name = "d", descriptor = "(I)Z")
    public final boolean method432(int arg0) {
        ++field868;
        if (!class123.method764(super.field8137.field4789.method963(0), (byte) -81)) {
            return false;
        } else {
            return arg0 != 2048 ? true : true;
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(I)I")
    public final int method45(int arg0) {
        ++field866;
        return arg0 != 8976 ? 50 : 0;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(IILrp;III)Ljava/awt/Frame;")
    public static final Frame method433(int arg0, int arg1, class135 arg2, int arg3, int arg4, int arg5) {
        ++field870;
        if (!arg2.method854((byte) -123)) {
            return null;
        } else {
            if (arg1 == arg3) {
                class83[] var6 = class87.method609(arg2, arg3 + 2);
                if (var6 == null) {
                    return null;
                }
                boolean var7 = false;
                for (int var8 = 0; ~var8 > ~var6.length; ++var8) {
                    if (var6[var8].field1187 == arg0 && var6[var8].field1186 == arg5 && (arg4 == 0 || var6[var8].field1184 == arg4) && (!var7 || ~arg1 > ~var6[var8].field1185)) {
                        arg1 = var6[var8].field1185;
                        var7 = true;
                    }
                }
                if (!var7) {
                    return null;
                }
            }
            class246 var9 = arg2.method869(arg1, arg5, 6, arg0, arg4);
            while (~var9.field3633 == -1) {
                class688.method3874(10L, -7375);
            }
            Frame var10 = (Frame) var9.field3638;
            if (var10 == null) {
                return null;
            } else if (var9.field3633 == 2) {
                class235.method1567(var10, (byte) 92, arg2);
                return null;
            } else {
                return var10;
            }
        }
    }
}
