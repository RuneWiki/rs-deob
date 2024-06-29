import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class263 extends class384 {

    @OriginalMember(owner = "client!os", name = "r", descriptor = "Z")
    private boolean field3339 = false;

    @OriginalMember(owner = "client!os", name = "o", descriptor = "[I")
    public static int[] field3336 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!os", name = "n", descriptor = "I")
    public static int field3335 = -1;

    @OriginalMember(owner = "client!os", name = "p", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!os", name = "q", descriptor = "I")
    public static int field3338;

    @OriginalMember(owner = "client!os", name = "s", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!os", name = "t", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!os", name = "u", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!os", name = "v", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!os", name = "w", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Lbia;BI)V")
    public final void method1015(class329 arg0, byte arg1, int arg2) {
        ++field3343;
        if (arg1 == 80) {
            super.field5337.method3711(false, arg0);
            super.field5337.method3781(-3, arg2);
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IZ)V")
    public final void method1018(int arg0, boolean arg1) {
        ++field3342;
        if (arg0 == 4) {
            super.field5337.method3708(arg0 + 120, class409.field5765, class155.field1901);
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ZB)V")
    public final void method1020(boolean arg0, byte arg1) {
        ++field3344;
        class207 var3 = super.field5337.method3707(22);
        if (var3 != null && arg0) {
            super.field5337.method3723(true, 1);
            super.field5337.method3711(false, var3);
            super.field5337.method1428(class418.field5950, (byte) -43);
            super.field5337.method3723(true, 1);
            super.field5337.method3708(119, class409.field5765, class353.field4729);
            super.field5337.method1395(false, 2, true, -94, class155.field1970);
            super.field5337.method3713(class222.field2913, 0, (byte) -54);
            class462 var4 = super.field5337.method3729(1);
            var4.method2733((byte) 103, super.field5337.method3727(-111));
            super.field5337.method3771(0, class211.field2697);
            super.field5337.method3723(true, 0);
            this.field3339 = true;
        } else {
            super.field5337.method3713(class222.field2913, 0, (byte) 85);
        }
        if (arg1 < 23) {
            this.field3339 = false;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
    public static final Class method1587(String arg0, int arg1) throws ClassNotFoundException {
        ++field3341;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else if (arg1 != 0) {
            return null;
        } else {
            return arg0.equals("C") ? Character.TYPE : Class.forName(arg0);
        }
    }

    @OriginalMember(owner = "client!os", name = "f", descriptor = "(B)V")
    public static void method1588(byte arg0) {
        int var1 = -110 / ((22 - arg0) / 53);
        field3336 = null;
    }

    @OriginalMember(owner = "client!os", name = "d", descriptor = "(B)Z")
    public final boolean method1021(byte arg0) {
        ++field3338;
        return arg0 > 78;
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(B)V")
    public final void method1019(byte arg0) {
        ++field3340;
        if (arg0 != -60) {
            field3335 = -101;
        }
        if (this.field3339) {
            super.field5337.method3723(true, 1);
            super.field5337.method1428(class188.field2468, (byte) -43);
            super.field5337.method3708(arg0 ^ -79, class155.field1901, class155.field1901);
            super.field5337.method3777(false, 2, class663.field9083);
            super.field5337.method3713(class632.field8774, 0, (byte) 111);
            super.field5337.method3734((byte) -14);
            super.field5337.method3711(false, (class329) null);
            super.field5337.method3723(true, 0);
            this.field3339 = false;
        } else {
            super.field5337.method3713(class632.field8774, 0, (byte) -115);
        }
        super.field5337.method3708(127, class155.field1901, class155.field1901);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IBI)V")
    public final void method1025(int arg0, byte arg1, int arg2) {
        ++field3337;
        if (arg1 != 102) {
            this.field3339 = true;
        }
    }

    @OriginalMember(owner = "client!os", name = "<init>", descriptor = "(Lbm;)V")
    public class263(class684 arg0) {
        super(arg0);
    }
}
