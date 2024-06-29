import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class119 {

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    public static int field2619 = 0;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
    public static int field2625 = 10;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "Lud;")
    public static class143 field2617 = new class143(4096);

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "Lod;")
    public static class101 field2628 = class46.method335(73, " (X");

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "Lod;")
    public static class101 field2627 = class46.method335(99, "Bitte laden Sie die Seite neu)3");

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "Lod;")
    public static class101 field2630 = class46.method335(84, "scrollen:");

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "Lod;")
    public static class101 field2626 = class46.method335(102, "welle:");

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "Lod;")
    private static class101 field2632 = class46.method335(-107, "Loading fonts )2 ");

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "I")
    public static int field2629 = 0;

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "Lod;")
    public static class101 field2635 = field2632;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "Lqe;")
    public static class116 field2634;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "Lrd;")
    public static class122 field2618;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "Z")
    public static boolean field2624;

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "[I")
    public static int[] field2633;

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "[Lde;")
    public static class27[] field2631;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)V")
    public static final void method896(int arg0, int arg1) {
        int var2 = 93 % ((arg0 + 59) / 61);
        field2620++;
        if (!class143.method1139(41, arg1)) {
            return;
        }
        class126[] var3 = class100.field2161[arg1];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class126 var5 = var3[var4];
            if (var5 != null) {
                var5.field2861 = 0;
                var5.field2844 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lc;IIB)[Lqe;")
    public static final class116[] method897(class15 arg0, int arg1, int arg2, byte arg3) {
        if (arg3 < 88) {
            field2626 = null;
        }
        field2621++;
        return class134.method1038(arg2, arg1, arg0, 2001) ? class140.method1116(false) : null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIBII)V")
    public static final void method898(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 != -73) {
            return;
        }
        for (int var5 = 0; var5 < class157.field3626; var5++) {
            if (class126.field2818[var5] + class131.field2990[var5] > arg4 && arg3 + arg4 > class126.field2818[var5] && class96.field2076[var5] + class85.field1893[var5] > arg0 && arg0 + arg1 > class96.field2076[var5]) {
                class129.field2938[var5] = true;
            }
        }
        field2622++;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Z)V")
    public static void method899(boolean arg0) {
        field2633 = null;
        field2632 = null;
        field2634 = null;
        field2630 = null;
        field2618 = null;
        field2627 = null;
        field2626 = null;
        field2617 = null;
        if (arg0) {
            field2624 = false;
        }
        field2631 = null;
        field2635 = null;
        field2628 = null;
    }
}
