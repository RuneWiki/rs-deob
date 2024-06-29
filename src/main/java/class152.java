import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class152 extends class601 {

    @OriginalMember(owner = "client!iq", name = "r", descriptor = "Z")
    private boolean field2092 = true;

    @OriginalMember(owner = "client!iq", name = "w", descriptor = "Z")
    public boolean field2097 = false;

    @OriginalMember(owner = "client!iq", name = "q", descriptor = "I")
    public static int field2091 = 64;

    @OriginalMember(owner = "client!iq", name = "n", descriptor = "Ljn;")
    public static class324 field2088 = new class324(11, 0, 1, 2);

    @OriginalMember(owner = "client!iq", name = "C", descriptor = "J")
    public static long field2102 = 0L;

    @OriginalMember(owner = "client!iq", name = "u", descriptor = "Lkr;")
    public static class602 field2095 = new class602(88, 1);

    @OriginalMember(owner = "client!iq", name = "l", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!iq", name = "m", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!iq", name = "o", descriptor = "I")
    public static int field2089;

    @OriginalMember(owner = "client!iq", name = "p", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!iq", name = "s", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!iq", name = "t", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!iq", name = "v", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!iq", name = "x", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!iq", name = "y", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!iq", name = "z", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!iq", name = "A", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(II)V", line = 9)
    public final void method43(int arg0, int arg1) {
        this.field2097 = false;
        ++field2086;
        int var3 = 44 / ((22 - arg0) / 34);
        super.field8131 = arg1;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lhj;II[B)Ljfa;", line = 20)
    public static final class707 method959(class47 arg0, int arg1, int arg2, byte[] arg3) {
        ++field2089;
        if (arg3 == null) {
            return null;
        } else {
            int var4 = OpenGL.glGenProgramARB();
            OpenGL.glBindProgramARB(arg2, var4);
            OpenGL.glProgramRawARB(arg2, 34933, arg3);
            OpenGL.glGetIntegerv(34379, class688.field9569, 0);
            if (arg1 > -42) {
                field2102 = -75L;
            }
            if (class688.field9569[0] != -1) {
                OpenGL.glBindProgramARB(arg2, 0);
                return null;
            } else {
                OpenGL.glBindProgramARB(arg2, 0);
                return new class707(arg0, arg2, var4);
            }
        }
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(I)Z", line = 49)
    public final boolean method960(int arg0) {
        ++field2098;
        if (arg0 != 2048) {
            return false;
        } else {
            return super.field8137.method2156((byte) 106).method1932(16383);
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Z)V", line = 68)
    public static void method961(boolean arg0) {
        field2088 = null;
        field2095 = null;
        if (arg0) {
            field2095 = null;
        }
    }

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "(I)Z", line = 83)
    public final boolean method962(int arg0) {
        ++field2093;
        if (arg0 != 0) {
            field2088 = null;
        }
        return this.field2092;
    }

    @OriginalMember(owner = "client!iq", name = "d", descriptor = "(I)I", line = 94)
    public final int method963(int arg0) {
        if (arg0 != 0) {
            field2091 = 84;
        }
        ++field2094;
        return super.field8131;
    }

    @OriginalMember(owner = "client!iq", name = "e", descriptor = "(I)V", line = 105)
    public static final void method964(int arg0) {
        if (!class346.method2214(class102.field1401, 11703) && !class425.method2643(class102.field1401, -92)) {
            int var1 = class388.field5601.field7197[0] >> 3;
            int var2 = class388.field5601.field7198[0] >> 3;
            if (~var1 <= -1 && class277.field4036 >> 3 > var1 && ~var2 <= -1 && ~var2 > ~(class667.field9202 >> 3)) {
                class239.method1612(var1, var2, 5000, 1);
            } else {
                class239.method1612(class277.field4036 >> 4, class667.field9202 >> 4, 0, 1);
            }
        } else {
            class239.method1612(class671.field9282 >> 12, class123.field1680 >> 12, 5000, 1);
        }
        ++field2100;
        class746.method4153((byte) 118);
        class516.method3087(-9);
        if (arg0 > -99) {
            field2102 = 44L;
        }
        class657.method3662(-23426);
        class20.method105(119);
    }

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(ILqea;)V", line = 134)
    public class152(int arg0, class339 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lqea;)V", line = 154)
    public class152(class339 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(IB)Z", line = 141)
    public static final boolean method965(int arg0, byte arg1) {
        ++field2099;
        if (arg1 != 88) {
            method961(true);
        }
        return arg0 == 3 || arg0 == 5 || ~arg0 == -7;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IB)I", line = 157)
    public final int method36(int arg0, byte arg1) {
        ++field2087;
        if (!super.field8137.method2156((byte) 119).method1932(arg1 + 16361)) {
            return 3;
        } else if (arg0 == 3 && !class243.method1635((byte) -94, "jagdx")) {
            return 3;
        } else {
            return arg1 != 22 ? 17 : 2;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)I", line = 176)
    public final int method45(int arg0) {
        this.field2097 = true;
        ++field2101;
        if (!super.field8137.method2156((byte) 99).method1932(16383)) {
            return 0;
        } else {
            return arg0 != 8976 ? -79 : 2;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(ZI)V", line = 199)
    public final void method966(boolean arg0, int arg1) {
        if (arg1 != 2) {
            this.field2092 = true;
        }
        this.field2092 = arg0;
        ++field2090;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(B)V", line = 211)
    public final void method41(byte arg0) {
        ++field2096;
        if (!super.field8137.method2156((byte) 104).method1932(16383)) {
            super.field8131 = 0;
        }
        int var2 = -110 / ((arg0 - 59) / 33);
        if (~super.field8131 > -1 || ~super.field8131 < -6) {
            super.field8131 = this.method45(8976);
        }
    }
}
