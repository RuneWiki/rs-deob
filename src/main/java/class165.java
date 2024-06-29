import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class165 {

    @OriginalMember(owner = "client!il", name = "a", descriptor = "[I")
    public static int[] field2534 = new int[] { 0, 0, 0, 0, 0, 2, 0, 12, 12, 4, 0, 3, 0, 0, 0, 14, -2, 0, 0, 0, 0, 0, -1, 0, 0, 0, 17, 0, -1, 3, 0, 0, 0, 0, -1, 0, 0, 12, 3, 0, 0, 6, 0, 0, 0, 2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, -1, 0, 5, 0, -1, 10, -1, 4, 7, 0, 0, 4, 3, 12, 0, 0, 3, 0, 0, 0, 0, 2, 0, 0, 0, 0, -2, 0, 0, -1, 0, 0, 0, 0, 0, 0, 15, -2, 0, 8, -2, 0, 0, 0, 0, 0, 6, -2, 0, 28, 2, 8, -2, 0, 0, 3, 0, 8, 0, 8, 3, -1, 1, 0, 0, 0, -1, 0, 0, 0, 0, 0, 5, 6, 0, 14, 8, 0, 5, 5, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 1, 0, -1, 0, 0, 10, 7, 0, 0, 0, 2, 0, 0, 0, 11, 0, 20, 1, 0, 8, 0, 1, 0, 0, 0, 2, 6, 0, 0, 0, 0, 0, -1, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 8, 0, -1, 0, 7, -2, 0, 6, 6, 0, 0, 0, 0, 6, 0, 0, 0, 6, -2, -2, -2, -2, 8, 6, 6, 0, 0, 0, -1, 0, 0, -1, 0, 1, 0, 15, 0, 0, 0, 0, 9, 0, 7, 0, 2, 0, 8, 0, 3, 0, -1, 0, 2, 0, 0, 6, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!il", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2538 = "Opened title screen";

    @OriginalMember(owner = "client!il", name = "f", descriptor = "[I")
    public static int[] field2539 = new int[5];

    @OriginalMember(owner = "client!il", name = "h", descriptor = "Ljava/lang/String;")
    public static String field2541 = "Loaded fonts";

    @OriginalMember(owner = "client!il", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field2535 = new String[] { "en", "de", "fr", "pt" };

    @OriginalMember(owner = "client!il", name = "c", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!il", name = "j", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!il", name = "d", descriptor = "Ljj;")
    public static class107 field2537;

    @OriginalMember(owner = "client!il", name = "i", descriptor = "Lsk;")
    public class114 field2542;

    @OriginalMember(owner = "client!il", name = "g", descriptor = "Lpf;")
    public static class294 field2540;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(II)I")
    public static final int method1039(int arg0, int arg1) {
        field2543++;
        if (arg1 != 0) {
            method1039(83, 87);
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(BIII)I")
    public static final int method1040(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 59) {
            field2537 = null;
        }
        field2536++;
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return 7 - arg2;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V")
    public static void method1041(int arg0) {
        field2541 = null;
        field2540 = null;
        field2534 = null;
        if (arg0 <= -105) {
            field2537 = null;
            field2538 = null;
            field2539 = null;
            field2535 = null;
        }
    }
}
