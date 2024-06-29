import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public abstract class class43 {

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "[S")
    public static short[] field681 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "Lok;")
    private static class41 field682 = class137.method956("You can(Wt add yourself to your own friend list)3", 45);

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "Z")
    public static boolean field683 = false;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public static int field678 = 1;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "Lok;")
    public static class41 field680 = field682;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "Lwh;")
    public static class252 field679 = new class252();

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "Lok;")
    public static class41 field686 = class137.method956("event_opbase", 45);

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "[J")
    public static long[] field687 = new long[32];

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "[I")
    public static int[] field685;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z)V", line = 20)
    public static void method319(boolean arg0) {
        field681 = null;
        if (!arg0) {
            field681 = (short[]) null;
        }
        field685 = null;
        field680 = null;
        field679 = null;
        field687 = null;
        field682 = null;
        field686 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)[B")
    public abstract byte[] method320(int arg0);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "([BB)V")
    public abstract void method321(byte[] arg0, byte arg1);
}
