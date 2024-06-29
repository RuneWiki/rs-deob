import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oba")
public class class307 extends class601 {

    @OriginalMember(owner = "client!oba", name = "l", descriptor = "I")
    public static int field4309;

    @OriginalMember(owner = "client!oba", name = "m", descriptor = "I")
    public static int field4310;

    @OriginalMember(owner = "client!oba", name = "n", descriptor = "I")
    public static int field4311;

    @OriginalMember(owner = "client!oba", name = "p", descriptor = "I")
    public static int field4313;

    @OriginalMember(owner = "client!oba", name = "q", descriptor = "I")
    public static int field4314;

    @OriginalMember(owner = "client!oba", name = "r", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!oba", name = "s", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!oba", name = "t", descriptor = "I")
    public static int field4317;

    @OriginalMember(owner = "client!oba", name = "o", descriptor = "Luu;")
    public static class237 field4312;

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(I)I")
    public final int method45(int arg0) {
        ++field4311;
        if (arg0 != 8976) {
            return -117;
        } else {
            return super.field8137.method2156((byte) 118).method1933(0) > 1 ? 4 : 2;
        }
    }

    @OriginalMember(owner = "client!oba", name = "<init>", descriptor = "(ILqea;)V")
    public class307(int arg0, class339 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!oba", name = "b", descriptor = "(II)V")
    public final void method43(int arg0, int arg1) {
        ++field4309;
        int var3 = 96 / ((22 - arg0) / 34);
        super.field8131 = arg1;
    }

    @OriginalMember(owner = "client!oba", name = "<init>", descriptor = "(Lqea;)V")
    public class307(class339 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!oba", name = "b", descriptor = "(I)V")
    public static void method2011(int arg0) {
        field4312 = null;
        if (arg0 <= 5) {
            method2011(89);
        }
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(III)V")
    public static final void method2012(int arg0, int arg1, int arg2) {
        class262 var3 = class137.field1948[arg0][arg1][arg2];
        if (var3 != null) {
            class537.method3176(var3.field3841);
            class537.method3176(var3.field3850);
            if (var3.field3841 != null) {
                var3.field3841 = null;
            }
            if (var3.field3850 != null) {
                var3.field3850 = null;
            }
        }
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(IIIII[B)V")
    public static final void method2013(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        ++field4316;
        if (~arg2 < ~arg3) {
            int var6 = -arg3 + arg2 >> 2;
            int var7 = arg0 + arg3;
            while (true) {
                --var6;
                if (~var6 > -1) {
                    if (arg4 >= -14) {
                        return;
                    } else {
                        int var8 = 3 & -arg3 + arg2;
                        while (true) {
                            --var8;
                            if (var8 < 0) {
                                return;
                            }
                            arg5[var7++] = 1;
                        }
                    }
                }
                arg5[var7++] = 1;
                arg5[var7++] = 1;
                arg5[var7++] = 1;
                arg5[var7++] = 1;
            }
        }
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(BII)Z")
    public static final boolean method2014(byte arg0, int arg1, int arg2) {
        ++field4317;
        if (arg0 >= -62) {
            method2013(-51, 81, -10, 11, -115, (byte[]) null);
        }
        return ~(32 & arg1) != -1;
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(IB)I")
    public final int method36(int arg0, byte arg1) {
        if (arg1 != 22) {
            return 123;
        } else {
            ++field4315;
            return 1;
        }
    }

    @OriginalMember(owner = "client!oba", name = "c", descriptor = "(I)I")
    public final int method2015(int arg0) {
        if (arg0 != 0) {
            this.method2015(-106);
        }
        ++field4313;
        return super.field8131;
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(B)V")
    public final void method41(byte arg0) {
        if (~super.field8131 > -1 && ~super.field8131 < -5) {
            super.field8131 = this.method45(8976);
        }
        ++field4310;
        int var2 = -2 / ((59 - arg0) / 33);
    }
}
