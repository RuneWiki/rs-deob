import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public abstract class class230 {

    @OriginalMember(owner = "client!of", name = "e", descriptor = "Lqd;")
    private static class40 field3791 = class147.method1106("Take", (byte) -55);

    @OriginalMember(owner = "client!of", name = "f", descriptor = "Lqd;")
    public static class40 field3792 = class147.method1106("sch-Utteln:", (byte) -58);

    @OriginalMember(owner = "client!of", name = "h", descriptor = "Lqd;")
    public static class40 field3794 = field3791;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "Lqd;")
    public static class40 field3788 = class147.method1106("::rect_debug", (byte) -127);

    @OriginalMember(owner = "client!of", name = "a", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "Lrb;")
    public static class213 field3793;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "Ljh;")
    public static class259 field3789;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)V", line = 14)
    public static void method1605(boolean arg0) {
        field3788 = null;
        field3789 = null;
        field3793 = null;
        field3792 = null;
        field3794 = null;
        field3791 = null;
        if (arg0) {
            method1605(true);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B)V", line = 33)
    public static final void method1606(byte arg0) {
        if (class223.field3698 != null) {
            class212.method1488((byte) -95, class223.field3698);
            class223.field3698 = null;
        }
        field3790++;
        if (arg0 <= 1) {
            field3792 = (class40) null;
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V", line = 58)
    public static final void method1607(int arg0) {
        class246 var1 = (class246) class55.field1066.method1971(100);
        int var2 = 97 % ((arg0 - 51) / 37);
        while (var1 != null) {
            class12 var3 = var1.field4075;
            if (class160.field2671 != var3.field186 || var3.field184) {
                var1.method2095(0);
            } else if (var3.field200 <= class256.field4266) {
                var3.method76(class189.field3059, 0);
                if (var3.field184) {
                    var1.method2095(0);
                } else {
                    class208.method1470(var3.field186, var3.field187, var3.field205, var3.field189, 60, var3, 0, -1L, false);
                }
            }
            var1 = (class246) class55.field1066.method1967(100);
        }
        field3787++;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(II)I")
    public abstract int method671(int arg0, int arg1);

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)Lpd;")
    public abstract class3 method676(int arg0);

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(II)V")
    public abstract void method677(int arg0, int arg1);

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IZ)[B")
    public abstract byte[] method675(int arg0, boolean arg1);
}
