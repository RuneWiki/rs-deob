import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class745 extends class322 {

    @OriginalMember(owner = "client!nh", name = "w", descriptor = "F")
    public static float field10360;

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "I")
    public static int field10352;

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "I")
    public static int field10353;

    @OriginalMember(owner = "client!nh", name = "q", descriptor = "I")
    public static int field10354;

    @OriginalMember(owner = "client!nh", name = "r", descriptor = "I")
    public static int field10355;

    @OriginalMember(owner = "client!nh", name = "s", descriptor = "I")
    public static int field10356;

    @OriginalMember(owner = "client!nh", name = "t", descriptor = "I")
    public static int field10357;

    @OriginalMember(owner = "client!nh", name = "u", descriptor = "I")
    public static int field10358;

    @OriginalMember(owner = "client!nh", name = "v", descriptor = "Lfp;")
    public static class323 field10359;

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "Lbga;")
    public static class356 field10349;

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "Lfh;")
    public static class650 field10351;

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "[[[I")
    public static int[][][] field10350;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(I)I", line = 4)
    public static final int method4146(int arg0) {
        ++field10354;
        if (class436.field6192) {
            return 6;
        } else if (class231.field3108 == null) {
            return 0;
        } else {
            int var1 = class231.field3108.field463;
            if (arg0 < 52) {
                method4149(69, -122, 52);
            }
            if (class727.method4088(-1003, var1)) {
                return 1;
            } else if (class727.method4086(-46, var1)) {
                return 2;
            } else if (class636.method3537(8071, var1)) {
                return 3;
            } else {
                return class71.method592(var1, (byte) -94) ? 4 : 5;
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(B)V", line = 40)
    public static void method4147(byte arg0) {
        field10359 = null;
        field10350 = null;
        if (arg0 <= 92) {
            field10349 = null;
        }
        field10349 = null;
        field10351 = null;
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(B)V", line = 54)
    public static final void method4148(byte arg0) {
        class636.field8756.method4023((byte) -127);
        if (arg0 != -118) {
            field10350 = null;
        }
        ++field10357;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(III)V", line = 67)
    public static final void method4149(int arg0, int arg1, int arg2) {
        boolean var3 = class553.field7776[0][arg1][arg2] != null && class553.field7776[0][arg1][arg2].field2272 != null;
        for (int var4 = arg0; var4 >= 0; --var4) {
            if (class553.field7776[var4][arg1][arg2] == null) {
                class165 var5 = class553.field7776[var4][arg1][arg2] = new class165(var4);
                if (var3) {
                    ++var5.field2274;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lch;)V", line = 87)
    public class745(class463 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z)V", line = 91)
    public final void method23(boolean arg0) {
        if (super.field4450.method2749(-21) == class724.field10102) {
            super.field4451 = 2;
        }
        if (!arg0) {
            ++field10352;
            if (super.field4451 < 0 || super.field4451 > 2) {
                super.field4451 = this.method17((byte) -118);
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(II)V", line = 108)
    public final void method22(int arg0, int arg1) {
        super.field4451 = arg1;
        ++field10355;
        if (arg0 != 0) {
            method4146(86);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)I", line = 119)
    public final int method19(int arg0, int arg1) {
        ++field10353;
        if (arg1 <= 10) {
            field10350 = null;
        }
        return 1;
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(ILch;)V", line = 132)
    public class745(int arg0, class463 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(Z)I", line = 141)
    public final int method4150(boolean arg0) {
        ++field10358;
        if (arg0) {
            method4149(87, -62, 74);
        }
        return super.field4451;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)I", line = 153)
    public final int method17(byte arg0) {
        ++field10356;
        int var2 = -40 % ((70 - arg0) / 51);
        return 1;
    }
}
