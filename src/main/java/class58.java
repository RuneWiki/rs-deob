import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class58 extends class241 implements class269 {

    @OriginalMember(owner = "client!wc", name = "D", descriptor = "Lbq;")
    public class241 field549;

    @OriginalMember(owner = "client!wc", name = "x", descriptor = "Z")
    public static boolean field544 = false;

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!wc", name = "w", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!wc", name = "y", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!wc", name = "z", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!wc", name = "B", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!wc", name = "C", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!wc", name = "E", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!wc", name = "F", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!wc", name = "I", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!wc", name = "J", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!wc", name = "K", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!wc", name = "L", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!wc", name = "M", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!wc", name = "N", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!wc", name = "O", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!wc", name = "G", descriptor = "Ln;")
    public static class17 field552;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILqa;)V", line = 5)
    public final void method326(int arg0, class206 arg1) {
        if (arg0 != 29657) {
            this.field549 = null;
        }
        field540++;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)Z", line = 15)
    public final boolean method332(int arg0) {
        field548++;
        int var2 = -113 / ((1 - arg0) / 49);
        return false;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)I", line = 25)
    public final int method333(byte arg0) {
        field546++;
        if (arg0 != 70) {
            method338(-118);
        }
        return 0;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILqa;II)Z", line = 37)
    public final boolean method318(int arg0, class206 arg1, int arg2, int arg3) {
        if (arg0 == -21851) {
            field547++;
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "(B)V", line = 49)
    public static void method334(byte arg0) {
        if (arg0 == -33) {
            field552 = null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILqa;Z)Lr;", line = 59)
    public final class157 method335(int arg0, class206 arg1, boolean arg2) {
        if (!arg2) {
            field544 = true;
        }
        field557++;
        return null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZLqa;)V", line = 71)
    public final void method336(boolean arg0, class206 arg1) {
        if (arg0) {
            field543 = 124;
        }
        field559++;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)I", line = 84)
    public final int method337(boolean arg0) {
        if (!arg0) {
            this.field549 = null;
        }
        field539++;
        return 0;
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(IIIIILbq;)V", line = 103)
    public class58(int arg0, int arg1, int arg2, int arg3, int arg4, class241 arg5) {
        super(arg2, arg3, arg4, class117.method687(arg0, arg1, 0));
        this.field549 = arg5;
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(B)V", line = 113)
    public final void method314(byte arg0) {
        field541++;
        if (arg0 <= 23) {
            field544 = false;
        }
    }

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "(I)V", line = 123)
    public static final void method338(int arg0) {
        if (arg0 != 9551) {
            field552 = null;
        }
        field545++;
        class184.field2231 = true;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(B)V", line = 135)
    public final void method339(byte arg0) {
        if (arg0 > -114) {
            this.method337(true);
        }
        field550++;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(III)Z", line = 146)
    public static final boolean method340(int arg0, int arg1, int arg2) {
        if (arg0 > -29) {
            field552 = null;
        }
        field551++;
        if (((arg1 & 0x10000) != 0 | class478.method2790((byte) 13, arg1, arg2)) || class426.method2398(-118, arg2, arg1)) {
            return true;
        } else {
            return (arg2 & 0x37) == 0 && class548.method3214(arg2, arg1, 45056);
        }
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "(I)Z", line = 160)
    public final boolean method317(int arg0) {
        if (arg0 != 64) {
            field544 = true;
        }
        field553++;
        return false;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(ILqa;)Lso;", line = 172)
    public final class398 method328(int arg0, class206 arg1) {
        if (arg0 == 12) {
            field542++;
            return this.field549.method328(12, arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lqa;Z)V", line = 186)
    public final void method341(class206 arg0, boolean arg1) {
        field558++;
        if (arg1) {
            this.method314((byte) 104);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)I", line = 196)
    public final int method342(int arg0) {
        field556++;
        if (arg0 != -2329) {
            field552 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZLoe;ILqa;III)V", line = 207)
    public final void method312(boolean arg0, class170 arg1, int arg2, class206 arg3, int arg4, int arg5, int arg6) {
        field554++;
        if (arg5 != 13915) {
            field543 = -16;
        }
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(ILqa;)Loj;", line = 219)
    public final class318 method320(int arg0, class206 arg1) {
        field555++;
        return arg0 == -1 ? null : null;
    }
}
