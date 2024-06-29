import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ica")
public class class615 {

    @OriginalMember(owner = "client!ica", name = "c", descriptor = "Lui;")
    public static class210 field8736 = new class210(1, 2, 2, 0);

    @OriginalMember(owner = "client!ica", name = "g", descriptor = "Z")
    public static boolean field8740 = false;

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "I")
    public int field8734;

    @OriginalMember(owner = "client!ica", name = "b", descriptor = "I")
    public static int field8735;

    @OriginalMember(owner = "client!ica", name = "d", descriptor = "I")
    public int field8737;

    @OriginalMember(owner = "client!ica", name = "e", descriptor = "I")
    public int field8738;

    @OriginalMember(owner = "client!ica", name = "f", descriptor = "I")
    public int field8739;

    @OriginalMember(owner = "client!ica", name = "h", descriptor = "I")
    public static int field8741;

    @OriginalMember(owner = "client!ica", name = "i", descriptor = "I")
    public static int field8742;

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(Z)V")
    public static void method3584(boolean arg0) {
        field8736 = null;
        if (!arg0) {
            method3584(false);
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(I)Z")
    public static final boolean method3585(int arg0) {
        field8735++;
        if (class184.field3108) {
            try {
                class358.method2403("showVideoAd", class450.field6772, -29103);
                return true;
            } catch (Throwable var1) {
            }
        }
        if (arg0 != 0) {
            field8741 = -43;
        }
        return false;
    }
}
