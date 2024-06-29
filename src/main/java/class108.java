import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class108 {

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "I")
    public int field2431 = 0;

    @OriginalMember(owner = "client!ma", name = "y", descriptor = "I")
    public int field2439 = 0;

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "I")
    public static int field2428 = 0;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "Lea;")
    private static class38 field2421 = class9.method46((byte) 112, " has logged in)3");

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "Lea;")
    public static class38 field2423 = class9.method46((byte) 127, "T");

    @OriginalMember(owner = "client!ma", name = "s", descriptor = "Lea;")
    private static class38 field2433 = class9.method46((byte) 119, "Loading interfaces )2 ");

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "[I")
    public static int[] field2430 = new int[100];

    @OriginalMember(owner = "client!ma", name = "t", descriptor = "I")
    public static int field2434 = 0;

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "Lea;")
    private static class38 field2426 = class9.method46((byte) 106, "Please wait 5 minutes before trying again)3");

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "Lea;")
    public static class38 field2427 = field2426;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "Lea;")
    public static class38 field2422 = class9.method46((byte) 115, "Ung-Ultiger Benutzername");

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "Lea;")
    public static class38 field2417 = field2421;

    @OriginalMember(owner = "client!ma", name = "w", descriptor = "Lea;")
    public static class38 field2437 = field2433;

    @OriginalMember(owner = "client!ma", name = "x", descriptor = "Lea;")
    public static class38 field2438 = class9.method46((byte) 123, "http:)4)4www)3runescape)3com");

    @OriginalMember(owner = "client!ma", name = "z", descriptor = "[I")
    public static int[] field2440 = new int[] { 3, 40, 7, 32, 15, 47, 36, 49 };

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "I")
    public int field2418;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "I")
    public int field2419;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "I")
    public int field2424;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "I")
    public int field2425;

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!ma", name = "r", descriptor = "I")
    public int field2432;

    @OriginalMember(owner = "client!ma", name = "u", descriptor = "I")
    public int field2435;

    @OriginalMember(owner = "client!ma", name = "v", descriptor = "I")
    public int field2436;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "Lff;")
    public class52 field2415;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "Lff;")
    public class52 field2420;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
    public static void method868(int arg0) {
        field2423 = null;
        field2440 = null;
        field2427 = null;
        field2421 = null;
        field2426 = null;
        field2430 = null;
        field2417 = null;
        field2437 = null;
        if (arg0 != -6321) {
            method868(107);
        }
        field2422 = null;
        field2433 = null;
        field2438 = null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Ldd;IZLea;Lea;II)V")
    public static final void method869(class32 arg0, int arg1, boolean arg2, class38 arg3, class38 arg4, int arg5, int arg6) {
        field2416++;
        if (arg5 != 32) {
            field2426 = null;
        }
        int var7 = arg0.method207((byte) 32, arg4);
        int var8 = arg0.method212(arg3, arg5 - 119, var7);
        class12.method65(arg1, arg0, var7, arg6, arg2, true, var8);
    }
}
