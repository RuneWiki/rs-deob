import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public abstract class class182 extends class125 {

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "[I")
    public static int[] field2788;

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "Lqp;")
    public static class586 field2790;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "I")
    public static int field2789;

    static {
        new class487("From", "Von:", "De", "De");
        field2788 = new int[8];
        field2790 = new class586(69, 0);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V", line = 11)
    public static void method1209(int arg0) {
        if (arg0 == 8) {
            field2790 = null;
            field2788 = null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)Ldf;")
    public abstract class547 method876(boolean arg0);
}
