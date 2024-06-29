import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class363 extends class601 {

    @OriginalMember(owner = "client!nn", name = "l", descriptor = "I")
    public static int field5176;

    @OriginalMember(owner = "client!nn", name = "m", descriptor = "I")
    public static int field5177;

    @OriginalMember(owner = "client!nn", name = "n", descriptor = "I")
    public static int field5178;

    @OriginalMember(owner = "client!nn", name = "o", descriptor = "I")
    public static int field5179;

    @OriginalMember(owner = "client!nn", name = "p", descriptor = "I")
    public static int field5180;

    @OriginalMember(owner = "client!nn", name = "q", descriptor = "I")
    public static int field5181;

    @OriginalMember(owner = "client!nn", name = "r", descriptor = "I")
    public static int field5182;

    @OriginalMember(owner = "client!nn", name = "t", descriptor = "I")
    public static int field5184;

    @OriginalMember(owner = "client!nn", name = "s", descriptor = "[Lhw;")
    public static class616[] field5183;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(BII)V")
    public static final void method2303(byte arg0, int arg1, int arg2) {
        if (arg0 == -122) {
            ++field5178;
            class346 var3 = class299.method1976(0, 1, arg1);
            var3.method2209(arg0 + 377);
            var3.field4926 = arg2;
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IB)I")
    public final int method36(int arg0, byte arg1) {
        ++field5182;
        if (arg1 != 22) {
            field5183 = null;
        }
        return 1;
    }

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "(II)I")
    public static final int method2304(int arg0, int arg1) {
        if (arg1 != 0) {
            return 61;
        } else {
            ++field5177;
            return arg0 >>> 10;
        }
    }

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "(B)V")
    public static void method2305(byte arg0) {
        field5183 = null;
        int var1 = -13 % ((-1 - arg0) / 50);
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(ILuu;B)Lej;")
    public static final class179 method2306(int arg0, class237 arg1, byte arg2) {
        ++field5179;
        byte[] var3 = arg1.method1583(arg0, -68);
        if (arg2 <= 108) {
            field5183 = null;
        }
        return var3 == null ? null : new class179(var3);
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(I)I")
    public final int method2307(int arg0) {
        ++field5180;
        if (arg0 != 0) {
            field5183 = null;
        }
        return super.field8131;
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(II)V")
    public final void method43(int arg0, int arg1) {
        int var3 = 38 / ((arg0 - 22) / 34);
        ++field5176;
        super.field8131 = arg1;
    }

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(ILqea;)V")
    public class363(int arg0, class339 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(Lqea;)V")
    public class363(class339 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)I")
    public final int method45(int arg0) {
        ++field5184;
        return arg0 != 8976 ? -115 : 1;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(B)V")
    public final void method41(byte arg0) {
        ++field5181;
        if (~super.field8131 != -2 && super.field8131 != 0) {
            super.field8131 = this.method45(8976);
        }
        int var2 = -119 / ((arg0 - 59) / 33);
    }
}
