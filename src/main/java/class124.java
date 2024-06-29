import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class124 extends class213 {

    @OriginalMember(owner = "client!lf", name = "Y", descriptor = "[B")
    public byte[] field2380;

    @OriginalMember(owner = "client!lf", name = "M", descriptor = "[S")
    public static short[] field2368 = new short[] { 45, 33, 44, 18, 6, 39, 41, 29 };

    @OriginalMember(owner = "client!lf", name = "N", descriptor = "Lvd;")
    public static class222 field2369 = class212.method1357(" steht bereits auf Ihrer Freunde)2Liste(Q", 10731);

    @OriginalMember(owner = "client!lf", name = "T", descriptor = "I")
    public static int field2375 = 0;

    @OriginalMember(owner = "client!lf", name = "P", descriptor = "Lvd;")
    private static class222 field2371 = class212.method1357("FULL", 10731);

    @OriginalMember(owner = "client!lf", name = "U", descriptor = "Lvd;")
    public static class222 field2376 = class212.method1357("::noclip", 10731);

    @OriginalMember(owner = "client!lf", name = "Q", descriptor = "I")
    public static int field2372 = 0;

    @OriginalMember(owner = "client!lf", name = "O", descriptor = "Lvd;")
    public static class222 field2370 = field2371;

    @OriginalMember(owner = "client!lf", name = "V", descriptor = "[I")
    public static int[] field2377 = new int[2000];

    @OriginalMember(owner = "client!lf", name = "S", descriptor = "[I")
    public static int[] field2374 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!lf", name = "R", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!lf", name = "W", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!lf", name = "X", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "(I)V")
    public static final void method787(int arg0) {
        class200.field3652.method172(0, 0);
        class135.field2611.method172(382, 0);
        field2378++;
        if (arg0 != -18622) {
            method788(-6, false, true);
        }
        class47.field957.method1394(382 - class47.field957.field4057 / 2, 18);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IZZ)Lvd;")
    public static final class222 method788(int arg0, boolean arg1, boolean arg2) {
        field2379++;
        if (!arg1) {
            method789(43);
        }
        return class225.method1470(arg2, -95, 10, arg0);
    }

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "(I)V")
    public static void method789(int arg0) {
        field2369 = null;
        field2376 = null;
        field2377 = null;
        field2368 = null;
        field2370 = null;
        if (arg0 == 31892) {
            field2371 = null;
            field2374 = null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "([B)V")
    public class124(byte[] arg0) {
        this.field2380 = arg0;
    }
}
