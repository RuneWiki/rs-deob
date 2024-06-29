import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class291 {

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "I")
    public static int field4570 = 0;

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "Ljava/lang/String;")
    public static String field4573 = "Your ignore list is full. Max of 100 users.";

    @OriginalMember(owner = "client!mk", name = "h", descriptor = "I")
    public static int field4577 = 0;

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "I")
    public static int field4572;

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "I")
    public static int field4575;

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "I")
    public static int field4576;

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "Llb;")
    public static class211 field4574;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)V", line = 10)
    public static void method2054(int arg0) {
        field4573 = null;
        field4574 = null;
        if (arg0 != 8607) {
            method2054(-10);
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(III)V", line = 44)
    public static final void method2055(int arg0, int arg1, int arg2) {
        class147 var3 = class92.method731(-29125, arg0, arg1);
        var3.method1095(98);
        var3.field2240 = arg2;
        field4571++;
    }
}
