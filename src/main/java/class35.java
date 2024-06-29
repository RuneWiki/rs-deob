import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class35 extends class82 {

    @OriginalMember(owner = "client!vd", name = "N", descriptor = "I")
    private int field276;

    @OriginalMember(owner = "client!vd", name = "P", descriptor = "Z")
    public static boolean field278 = true;

    @OriginalMember(owner = "client!vd", name = "L", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!vd", name = "M", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!vd", name = "O", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!vd", name = "Q", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(I)V")
    public class35(int arg0) {
        super(0, true);
        this.field276 = 4096;
        this.field276 = arg0;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IILos;)V")
    public final void method198(int arg0, int arg1, class374 arg2) {
        if (arg0 == 0) {
            this.field276 = (arg2.method2129(-113) << 12) / 255;
        }
        int var5 = 45 / ((-69 - arg1) / 42);
        ++field275;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IZIII)V")
    public static final void method199(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (class470.field6589 <= arg3 && class592.field8588 >= arg3) {
            int var5 = class536.method3056(class271.field3513, 124, arg2, class563.field8282);
            int var6 = class536.method3056(class271.field3513, 122, arg0, class563.field8282);
            class443.method2598(var6, (byte) 126, var5, arg3, arg4);
        }
        ++field277;
        if (arg1) {
            method199(-83, false, -76, 34, -36);
        }
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "(II)V")
    public static final void method200(int arg0, int arg1) {
        ++field279;
        if (~class137.field1671 != ~arg0) {
            if (~class137.field1671 == -1) {
                class604.method3475((byte) 114);
            }
            if (~arg0 == -13) {
                if (class59.field562 == null) {
                    class470.method2739(class184.field2230, class249.field3184, (byte) 69, class571.field8376);
                } else {
                    class115.method682(31982, class184.field2230);
                }
            }
            if (arg0 != 12 && class340.field4388 != null) {
                class340.field4388.method2266((byte) -44);
                class340.field4388 = null;
            }
            if (arg0 == arg1) {
                class134.method751(class599.field8668 != class314.field4002, true);
            }
            if (~arg0 == -7) {
                class569.method3320(~class599.field8668 != ~class443.field6122, (byte) 119);
            }
            if (arg0 == 4) {
                if (class59.field562 == null) {
                    class95.method584(false, class571.field8376, class249.field3184);
                } else {
                    class211.method1212(false);
                }
            } else if (arg0 == 5) {
                if (class59.field562 != null) {
                    class115.method682(arg1 ^ 31980, class184.field2230);
                } else {
                    class470.method2739(class184.field2230, class249.field3184, (byte) 62, class571.field8376);
                }
            } else if (arg0 == 8) {
                if (class59.field562 != null) {
                    class115.method682(arg1 + 31980, class184.field2230);
                } else {
                    class470.method2739(class184.field2230, class249.field3184, (byte) 82, class571.field8376);
                }
            } else if (~arg0 == -12) {
                if (class59.field562 != null) {
                    class211.method1212(false);
                } else {
                    class95.method584(false, class571.field8376, class249.field3184);
                }
            }
            if (class171.method957((byte) 7, class137.field1671)) {
                class489.field6828.field6068 = 2;
                class507.field7035.field6068 = 2;
                class106.field1286.field6068 = 2;
                class584.field8484.field6068 = 2;
                class200.field2405.field6068 = 2;
                class44.field372.field6068 = 2;
                class319.field4071.field6068 = 2;
            }
            if (class171.method957((byte) 7, arg0)) {
                class561.field8252 = 0;
                class114.field1430 = 1;
                class467.field6535 = 1;
                class116.field1454 = 0;
                class101.field1250 = 0;
                class390.method2238((byte) 112, true);
                class489.field6828.field6068 = 1;
                class507.field7035.field6068 = 1;
                class106.field1286.field6068 = 1;
                class584.field8484.field6068 = 1;
                class200.field2405.field6068 = 1;
                class44.field372.field6068 = 1;
                class319.field4071.field6068 = 1;
            }
            if (arg0 == 10 || ~arg0 == -3) {
                class163.method891(arg1 + 124);
            }
            if (arg0 == 1) {
                class152.method840(class210.field2560, class39.field299, 0);
            } else {
                class144.method793(arg1 + -1298951222);
            }
            boolean var2 = ~arg0 == -2 || class70.method384(arg0, 0) || class362.method2032(arg1 + 88, arg0);
            boolean var3 = ~class137.field1671 == -2 || class70.method384(class137.field1671, 0) || class362.method2032(50, class137.field1671);
            if (var2 != var3) {
                if (!var2) {
                    class224.method1287(2, (byte) 124);
                    class232.field2861.method2531(true, 0);
                } else {
                    class225.field2766 = class204.field2440;
                    if (~class565.field8299.field2192 == -1) {
                        class224.method1287(2, (byte) -105);
                    } else {
                        class316.method1757(false, 0, class204.field2440, class565.field8299.field2192, (byte) 80, class282.field3709, 2);
                    }
                    class232.field2861.method2531(false, 0);
                }
            }
            if (class171.method957((byte) 7, arg0) || ~arg0 == -13) {
                class210.field2560.method1131();
            }
            class137.field1671 = arg0;
        }
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V")
    public class35() {
        this(4096);
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(II)[I")
    public final int[] method201(int arg0, int arg1) {
        ++field274;
        if (arg1 != 12218) {
            field278 = true;
        }
        int[] var3 = super.field990.method1566((byte) 116, arg0);
        if (super.field990.field3641) {
            class345.method1928(var3, 0, class629.field9033, this.field276);
        }
        return var3;
    }
}
