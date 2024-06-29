import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class32 {

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(III)V", line = 4)
    public static final void method186(int arg0, int arg1, int arg2) {
        if (arg2 != -16256) {
            method187(-123);
        }
        field344++;
        class338 var3 = class230.method1580(7, -1332166328, arg0);
        var3.method2053(arg2 + 16177);
        var3.field4756 = arg1;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)J", line = 20)
    public static final long method187(int arg0) {
        field342++;
        int var1 = -20 / ((65 - arg0) / 53);
        return class134.field2050.method843((byte) 54);
    }
}
