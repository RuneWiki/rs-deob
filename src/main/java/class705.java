import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!waa")
public class class705 {

    @OriginalMember(owner = "client!waa", name = "b", descriptor = "I")
    public int field9771;

    @OriginalMember(owner = "client!waa", name = "c", descriptor = "I")
    public static int field9772 = 2;

    @OriginalMember(owner = "client!waa", name = "e", descriptor = "F")
    public static float field9774 = 1.0F;

    @OriginalMember(owner = "client!waa", name = "f", descriptor = "Lkg;")
    public static class275 field9775 = new class275(71, -2);

    @OriginalMember(owner = "client!waa", name = "h", descriptor = "I")
    public static int field9777 = 0;

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "I")
    public static int field9770;

    @OriginalMember(owner = "client!waa", name = "d", descriptor = "I")
    public static int field9773;

    @OriginalMember(owner = "client!waa", name = "g", descriptor = "Lpda;")
    public static class631 field9776;

    @OriginalMember(owner = "client!waa", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field9770++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(I)V")
    public static void method3950(int arg0) {
        field9776 = null;
        if (arg0 != 10179) {
            method3950(-27);
        }
        field9775 = null;
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(Let;I)I")
    public static final int method3951(class596 arg0, int arg1) {
        field9773++;
        if (class654.field9096 == arg0) {
            return 6407;
        } else if (class269.field3396 == arg0) {
            return 6408;
        } else if (class522.field7319 == arg0) {
            return 6406;
        } else if (class125.field1794 == arg0) {
            return 6409;
        } else if (class331.field4230 == arg0) {
            return 6410;
        } else if (class299.field3924 == arg0) {
            return 6145;
        } else {
            int var2 = 99 / ((5 - arg1) / 34);
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public class705(String arg0, String arg1, String arg2, int arg3) {
        this.field9771 = arg3;
    }
}
