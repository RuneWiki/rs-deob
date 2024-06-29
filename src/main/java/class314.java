import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iw")
public class class314 {

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "Lqe;")
    public static class465 field4433 = new class465(77, -1);

    @OriginalMember(owner = "client!iw", name = "d", descriptor = "Z")
    public static boolean field4436 = false;

    @OriginalMember(owner = "client!iw", name = "c", descriptor = "F")
    public static float field4435;

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "I")
    public static int field4434;

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(I)V", line = 4)
    public static void method2029(int arg0) {
        field4433 = null;
        if (arg0 != 24179) {
            field4435 = -1.5767397F;
        }
    }

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "(I)V", line = 22)
    public static final void method2030(int arg0) {
        if (class611.field8839 == 3) {
            class19.method122(1, 4);
        } else if (class611.field8839 == 7) {
            class19.method122(1, 8);
        } else if (class611.field8839 == 10) {
            class19.method122(1, 11);
        }
        if (arg0 <= 2) {
            method2029(12);
        }
        field4434++;
    }
}
