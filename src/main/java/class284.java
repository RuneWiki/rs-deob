import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class284 {

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public int field4562 = -1;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "[I")
    public static int[] field4563 = new int[2];

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "Z")
    public static boolean field4567 = false;

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
    public static int field4574 = 0;

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "Ljava/lang/String;")
    public static String field4573 = null;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public static int field4565;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "I")
    public static int field4572;

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "I")
    public static int field4576;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "Lth;")
    public class247 field4570;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "Llc;")
    public static class270 field4566;

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "Ld;")
    public static class59 field4575;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "Ljf;")
    public static class83 field4569;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "[I")
    public int[] field4564;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "[Ljava/lang/String;")
    public String[] field4561;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
    public static final void method1955(int arg0) {
        field4571++;
        if (class98.field1677 == 30) {
            class79.method586(-1, 25);
        }
        if (arg0 != 25) {
            method1957((class270) null, (class270) null, 23, (class83) null, true);
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)V")
    public static void method1956(int arg0) {
        if (arg0 != -1) {
            return;
        }
        field4573 = null;
        field4563 = null;
        field4566 = null;
        field4575 = null;
        field4569 = null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Llc;Llc;ILjf;Z)V")
    public static final void method1957(class270 arg0, class270 arg1, int arg2, class83 arg3, boolean arg4) {
        field4576++;
        class302.field4884 = arg0;
        class47.field653 = arg1;
        class171.field2583 = arg4;
        int var5 = class47.field653.method1880(arg2 - 3589) - 1;
        class32.field402 = arg2 * var5 + class47.field653.method1891(var5, 21);
        class102.field1739 = new String[] { null, null, null, null, class245.field3609 };
        class57.field828 = arg3;
        class225.field3305 = new String[] { null, null, class188.field2794, null, null };
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)V")
    public static final void method1958(int arg0, int arg1) {
        field4565++;
        if (arg1 <= -46) {
            class139.field2259.method1416(arg0, 0);
        }
    }
}
