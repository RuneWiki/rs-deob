import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("th")
public class class183 {

    @OriginalMember(owner = "th", name = "b", descriptor = "Llf;")
    public static class109 field3439 = class35.method275("Sprites geladen)3", 2);

    @OriginalMember(owner = "th", name = "c", descriptor = "I")
    public static int field3440 = -1;

    @OriginalMember(owner = "th", name = "g", descriptor = "[Lp;")
    public static class139[] field3444 = new class139[32768];

    @OriginalMember(owner = "th", name = "a", descriptor = "[Llf;")
    public static class109[] field3438 = new class109[500];

    @OriginalMember(owner = "th", name = "d", descriptor = "[J")
    public static long[] field3441 = new long[100];

    @OriginalMember(owner = "th", name = "h", descriptor = "Llf;")
    public static class109 field3445 = class35.method275("(U4", 2);

    @OriginalMember(owner = "th", name = "f", descriptor = "Llf;")
    public static class109 field3443 = class35.method275("http:)4)4", 2);

    @OriginalMember(owner = "th", name = "e", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "th", name = "i", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "th", name = "a", descriptor = "(II)V")
    public static final void method1241(int arg0, int arg1) {
        if (arg1 == -1 && !class36.field792) {
            class143.method1009(-29672);
        } else if (arg1 != -1 && (class131.field2524 != arg1 || !class75.method475((byte) -96)) && class178.field3349 != 0 && !class36.field792) {
            class138.method991(-24390, 2, arg1, 0, class103.field2030, false, class178.field3349);
        }
        class131.field2524 = arg1;
        int var2 = -68 / ((-arg0 - 25) / 60);
        field3442++;
    }

    @OriginalMember(owner = "th", name = "a", descriptor = "(B)V")
    public static final void method1242(byte arg0) {
        field3446++;
        if (!class51.field1041) {
            class31.field726[0] = 1001;
            class149.field2882 = 1;
            class115.field2282[0] = class57.field1154;
            field3438[0] = class174.field3306;
        }
        if (class4.field57 != -1) {
            class127.method924(100, class4.field57);
        }
        for (int var1 = 0; var1 < class113.field2239; var1++) {
            if (class194.field3721[var1]) {
                class186.field3538[var1] = true;
            }
            class130.field2518[var1] = class194.field3721[var1];
            class194.field3721[var1] = false;
        }
        class105.field2067 = class143.field2754;
        class134.field2566 = -1;
        class7.field106 = null;
        class68.field1331 = -1;
        if (class4.field57 != -1) {
            class113.field2239 = 0;
            class45.method316(0, 765, -1, class4.field57, 0, (byte) 16, 0, 0, 503);
        }
        class11.method79();
        class6.method26(22491);
        if (class51.field1041) {
            class34.method270(121);
        } else if (class134.field2566 != -1) {
            class86.method601(class68.field1331, class134.field2566, (byte) 69);
        }
        if (class173.field3229 == 3) {
            for (int var2 = 0; var2 < class113.field2239; var2++) {
                if (class130.field2518[var2]) {
                    class11.method65(class60.field1176[var2], class27.field587[var2], class200.field3956[var2], class68.field1317[var2], 16711935, 128);
                } else if (class186.field3538[var2]) {
                    class11.method65(class60.field1176[var2], class27.field587[var2], class200.field3956[var2], class68.field1317[var2], 16711680, 128);
                }
            }
        }
        class149.method1042(true, class72.field1405, class193.field3694, class157.field2955.field3609, class157.field2955.field3549);
        class193.field3694 = 0;
        if (arg0 != 79) {
            method1242((byte) -22);
        }
    }

    @OriginalMember(owner = "th", name = "a", descriptor = "(I)V")
    public static void method1243(int arg0) {
        field3445 = null;
        field3443 = null;
        field3444 = null;
        field3441 = null;
        if (arg0 != -1) {
            field3440 = 22;
        }
        field3438 = null;
        field3439 = null;
    }
}
