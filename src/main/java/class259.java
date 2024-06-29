import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class259 extends class62 {

    @OriginalMember(owner = "client!fj", name = "G", descriptor = "I")
    public int field4587;

    @OriginalMember(owner = "client!fj", name = "M", descriptor = "I")
    public int field4592;

    @OriginalMember(owner = "client!fj", name = "w", descriptor = "I")
    public int field4577;

    @OriginalMember(owner = "client!fj", name = "A", descriptor = "I")
    public int field4581;

    @OriginalMember(owner = "client!fj", name = "D", descriptor = "J")
    public static long field4584 = 0L;

    @OriginalMember(owner = "client!fj", name = "I", descriptor = "I")
    public static int field4588 = 0;

    @OriginalMember(owner = "client!fj", name = "y", descriptor = "Leg;")
    public static class37 field4579 = class174.method1167("<col=c0ff00>", 85);

    @OriginalMember(owner = "client!fj", name = "x", descriptor = "I")
    public static int field4578 = -1;

    @OriginalMember(owner = "client!fj", name = "E", descriptor = "I")
    public static int field4585 = 0;

    @OriginalMember(owner = "client!fj", name = "B", descriptor = "Leg;")
    public static class37 field4582 = class174.method1167(" zuerst von Ihrer Ignorieren)2Liste(Q", -106);

    @OriginalMember(owner = "client!fj", name = "J", descriptor = "Leg;")
    private static class37 field4589 = class174.method1167("yellow:", 87);

    @OriginalMember(owner = "client!fj", name = "v", descriptor = "Leg;")
    public static class37 field4576 = field4589;

    @OriginalMember(owner = "client!fj", name = "L", descriptor = "Leg;")
    public static class37 field4591 = field4589;

    @OriginalMember(owner = "client!fj", name = "z", descriptor = "I")
    public static int field4580;

    @OriginalMember(owner = "client!fj", name = "C", descriptor = "I")
    public static int field4583;

    @OriginalMember(owner = "client!fj", name = "F", descriptor = "I")
    public static int field4586;

    @OriginalMember(owner = "client!fj", name = "K", descriptor = "I")
    public static int field4590;

    @OriginalMember(owner = "client!fj", name = "N", descriptor = "I")
    public static int field4593;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIZBII)V")
    public static final void method1752(int arg0, int arg1, boolean arg2, byte arg3, int arg4, int arg5) {
        if (arg1 < 1) {
            arg1 = 1;
        }
        class24.field332 = (short) arg1;
        field4580++;
        if (arg5 < 1) {
            arg5 = 1;
        }
        if (arg3 != 93) {
            method1756(-75);
        }
        class272.field4772 = (short) arg5;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(III)Z")
    public final boolean method1753(int arg0, int arg1, int arg2) {
        if (arg1 == -25393) {
            field4593++;
            return this.field4592 <= arg2 && arg2 <= this.field4577 && arg0 >= this.field4581 && arg0 <= this.field4587;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ZLva;)V")
    public static final void method1754(boolean arg0, class187 arg1) {
        field4586++;
        if (arg0) {
            field4585 = -69;
        }
        if (class169.field2818 != null) {
            try {
                class169.field2818.method1924(0L, (byte) -71);
                class169.field2818.method1926(-1, 24, arg1.field3169, arg1.field3175);
            } catch (Exception var2) {
            }
        }
        arg1.field3169 += 24;
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(II)Leg;")
    public static final class37 method1755(int arg0, int arg1) {
        field4590++;
        if (arg1 < arg0) {
            return class156.method1061((byte) -81, new class37[] { class124.field2076, class163.method1096(arg1, (byte) -35), class228.field3912 });
        } else if (arg1 < 10000000) {
            return class156.method1061((byte) -73, new class37[] { class77.field1206, class163.method1096(arg1 / 1000, (byte) -35), class59.field965, class228.field3912 });
        } else {
            return class156.method1061((byte) 39, new class37[] { class69.field1108, class163.method1096(arg1 / 1000000, (byte) -35), class267.field4684, class228.field3912 });
        }
    }

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "(I)V")
    public static void method1756(int arg0) {
        field4582 = null;
        field4591 = null;
        field4576 = null;
        if (arg0 == -2) {
            field4579 = null;
            field4589 = null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(IIII)V")
    public class259(int arg0, int arg1, int arg2, int arg3) {
        this.field4587 = arg3;
        this.field4592 = arg0;
        this.field4577 = arg2;
        this.field4581 = arg1;
    }
}
