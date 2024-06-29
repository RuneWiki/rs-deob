import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ffa")
public class class545 extends class1 {

    @OriginalMember(owner = "client!ffa", name = "i", descriptor = "[I")
    public static int[] field7470 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ffa", name = "l", descriptor = "I")
    public static int field7473 = 0;

    @OriginalMember(owner = "client!ffa", name = "m", descriptor = "Lcb;")
    public static class318 field7474 = new class318(106, 6);

    @OriginalMember(owner = "client!ffa", name = "o", descriptor = "[I")
    public static int[] field7476 = new int[25];

    @OriginalMember(owner = "client!ffa", name = "j", descriptor = "I")
    public static int field7471;

    @OriginalMember(owner = "client!ffa", name = "k", descriptor = "I")
    public static int field7472;

    @OriginalMember(owner = "client!ffa", name = "n", descriptor = "Lrp;")
    public static class280 field7475;

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "(I)V", line = 4)
    public static void method3070(int arg0) {
        if (arg0 > -25) {
            field7476 = null;
        }
        field7476 = null;
        field7475 = null;
        field7470 = null;
        field7474 = null;
    }

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "(Z)J", line = 22)
    public static final long method3071(boolean arg0) {
        if (!arg0) {
            field7474 = null;
        }
        field7472++;
        return class21.field188.method702(3);
    }
}
