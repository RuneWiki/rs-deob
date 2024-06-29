import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kaa")
public class class160 {

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "Lqp;")
    public static class586 field2138 = new class586(45, 2);

    @OriginalMember(owner = "client!kaa", name = "b", descriptor = "Lqu;")
    public static class364 field2139 = new class364(16, 2);

    @OriginalMember(owner = "client!kaa", name = "d", descriptor = "Lqu;")
    public static class364 field2141 = new class364(10, 16);

    @OriginalMember(owner = "client!kaa", name = "c", descriptor = "I")
    public static int field2140;

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Ln;Ldda;I)V")
    public static final void method932(class472 arg0, class597 arg1, int arg2) {
        if (arg2 == -2258) {
            class311.field4561 = arg1;
            field2140++;
            class394.field5733 = arg0;
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Z)V")
    public static void method933(boolean arg0) {
        field2139 = null;
        field2141 = null;
        if (arg0) {
            method933(false);
        }
        field2138 = null;
    }
}
