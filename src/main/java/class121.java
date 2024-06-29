import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class121 {

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "J")
    public long field2536 = 0L;

    @OriginalMember(owner = "client!mh", name = "o", descriptor = "Lad;")
    public static class5 field2547 = new class5();

    @OriginalMember(owner = "client!mh", name = "w", descriptor = "Lrf;")
    private static class163 field2555 = class53.method392(67, "Unable to find ");

    @OriginalMember(owner = "client!mh", name = "v", descriptor = "Lrf;")
    public static class163 field2554 = class53.method392(70, "k");

    @OriginalMember(owner = "client!mh", name = "u", descriptor = "[Ldg;")
    public static class38[] field2553 = new class38[2048];

    @OriginalMember(owner = "client!mh", name = "s", descriptor = "[Z")
    public static boolean[] field2551 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!mh", name = "z", descriptor = "Lrf;")
    public static class163 field2558 = class53.method392(-112, "rect_debug=");

    @OriginalMember(owner = "client!mh", name = "y", descriptor = "Lrf;")
    public static class163 field2557 = field2555;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "I")
    public static int field2533;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
    public int field2534;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
    public int field2535;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "I")
    public int field2537;

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "I")
    public static int field2539;

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "I")
    public int field2540;

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "I")
    public int field2541;

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "I")
    public int field2542;

    @OriginalMember(owner = "client!mh", name = "k", descriptor = "I")
    public int field2543;

    @OriginalMember(owner = "client!mh", name = "l", descriptor = "I")
    public int field2544;

    @OriginalMember(owner = "client!mh", name = "m", descriptor = "I")
    public static int field2545;

    @OriginalMember(owner = "client!mh", name = "p", descriptor = "I")
    public int field2548;

    @OriginalMember(owner = "client!mh", name = "q", descriptor = "I")
    public int field2549;

    @OriginalMember(owner = "client!mh", name = "r", descriptor = "I")
    public int field2550;

    @OriginalMember(owner = "client!mh", name = "x", descriptor = "Lne;")
    public static class126 field2556;

    @OriginalMember(owner = "client!mh", name = "n", descriptor = "Ls;")
    public class166 field2546;

    @OriginalMember(owner = "client!mh", name = "t", descriptor = "Lue;")
    public static class189 field2552;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V")
    public static void method821(int arg0) {
        field2552 = null;
        field2556 = null;
        field2558 = null;
        field2555 = null;
        field2551 = null;
        if (arg0 < -62) {
            field2553 = null;
            field2554 = null;
            field2547 = null;
            field2557 = null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IILig;)Lrf;")
    public static final class163 method822(int arg0, int arg1, class84 arg2) {
        field2533++;
        if (!class38.method240(65535, arg0, class21.method130(arg2, (byte) 77)) && arg2.field1792 == null) {
            return null;
        }
        if (arg1 < 15) {
            field2551 = null;
        }
        if (arg2.field1805 == null || arg2.field1805.length <= arg0 || arg2.field1805[arg0] == null || arg2.field1805[arg0].method1052(27).method1029(124) == 0) {
            return class135.field2791 ? class180.method1216(new class163[] { class97.field2057, class34.method217(arg0, -112) }, false) : null;
        } else {
            return arg2.field1805[arg0];
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIILs;IJIIII)Z")
    public static final boolean method823(int arg0, int arg1, int arg2, int arg3, class166 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class100.method683(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }
}
