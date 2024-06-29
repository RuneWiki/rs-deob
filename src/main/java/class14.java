import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class14 {

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "Lkd;")
    private static class73 field433 = class126.method1070((byte) -66, "wishes to duel with you)3");

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
    public static int field431 = 0;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "Lkd;")
    public static class73 field432 = field433;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
    public static int field430 = 0;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "Lkd;")
    public static class73 field428 = class126.method1070((byte) -66, "headicons_pk");

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
    public static int field434 = 0;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "[I")
    public static int[] field429 = new int[500];

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "Lkd;")
    private static class73 field436 = class126.method1070((byte) -66, "Type");

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "[I")
    public static int[] field435 = new int[2048];

    @OriginalMember(owner = "client!bf", name = "n", descriptor = "Lkd;")
    private static class73 field439 = class126.method1070((byte) -66, "Close");

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "Lkd;")
    public static class73 field437 = field439;

    @OriginalMember(owner = "client!bf", name = "u", descriptor = "Lkd;")
    public static class73 field446 = field436;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!bf", name = "m", descriptor = "I")
    public int field438;

    @OriginalMember(owner = "client!bf", name = "o", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!bf", name = "p", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!bf", name = "q", descriptor = "I")
    public int field442;

    @OriginalMember(owner = "client!bf", name = "r", descriptor = "I")
    public int field443;

    @OriginalMember(owner = "client!bf", name = "s", descriptor = "I")
    public int field444;

    @OriginalMember(owner = "client!bf", name = "x", descriptor = "I")
    public int field449;

    @OriginalMember(owner = "client!bf", name = "t", descriptor = "Lcc;")
    public class18 field445;

    @OriginalMember(owner = "client!bf", name = "v", descriptor = "Lcc;")
    public class18 field447;

    @OriginalMember(owner = "client!bf", name = "w", descriptor = "Lcc;")
    public class18 field448;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "Lde;")
    public static class27 field426;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IZIIIIII)V")
    public static final void method116(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field427++;
        if (class80.method690(arg3, -1)) {
            class98.method803(0, -1, arg1, arg5, 0, arg7, arg0, arg2, arg6, class120.field3066[arg3], arg4);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)V")
    public static void method117(boolean arg0) {
        field433 = null;
        field435 = null;
        field426 = null;
        field429 = null;
        field439 = null;
        field432 = null;
        field428 = null;
        field436 = null;
        if (!arg0) {
            method116(113, true, -49, -79, -84, 33, -71, 112);
        }
        field446 = null;
        field437 = null;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(Z)V")
    public static final void method118(boolean arg0) {
        field440++;
        class32.field894 = 0;
        int var1 = (class73.field1901.field2264 >> 7) + class121.field3093;
        int var2 = (class73.field1901.field2277 >> 7) + class80.field2029;
        if (arg0) {
            method116(-7, false, -12, -81, -38, -70, -120, -108);
        }
        if (var2 >= 3053 && var2 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            class32.field894 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            class32.field894 = 1;
        }
        if (class32.field894 == 1 && var2 >= 3139 && var2 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            class32.field894 = 0;
        }
    }
}
