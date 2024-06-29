import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class116 extends class19 {

    @OriginalMember(owner = "client!sd", name = "wb", descriptor = "I")
    public int field2752 = 0;

    @OriginalMember(owner = "client!sd", name = "eb", descriptor = "I")
    public static int field2734 = 0;

    @OriginalMember(owner = "client!sd", name = "mb", descriptor = "Lkc;")
    private static class67 field2742 = class19.method144("Bad session id)3", 84);

    @OriginalMember(owner = "client!sd", name = "lb", descriptor = "Lkc;")
    public static class67 field2741 = class19.method144("@lre@", 87);

    @OriginalMember(owner = "client!sd", name = "pb", descriptor = "Lkc;")
    public static class67 field2745 = field2742;

    @OriginalMember(owner = "client!sd", name = "rb", descriptor = "Lkc;")
    private static class67 field2747 = class19.method144("Your friendlist is full)3 Max of 100 for free users)1 and 200 for members", 78);

    @OriginalMember(owner = "client!sd", name = "Z", descriptor = "Lkc;")
    public static class67 field2729 = field2747;

    @OriginalMember(owner = "client!sd", name = "vb", descriptor = "Lkc;")
    private static class67 field2751 = class19.method144("and choose the (Wcreate account(W", 125);

    @OriginalMember(owner = "client!sd", name = "ub", descriptor = "Lkc;")
    public static class67 field2750 = field2751;

    @OriginalMember(owner = "client!sd", name = "W", descriptor = "Lkc;")
    private static class67 field2726 = class19.method144("Please try using a different world)3", 68);

    @OriginalMember(owner = "client!sd", name = "cb", descriptor = "Lkc;")
    public static class67 field2732 = field2726;

    @OriginalMember(owner = "client!sd", name = "qb", descriptor = "Lkc;")
    public static class67 field2746 = field2726;

    @OriginalMember(owner = "client!sd", name = "kb", descriptor = "Lkc;")
    public static class67 field2740 = field2726;

    @OriginalMember(owner = "client!sd", name = "ab", descriptor = "Lkc;")
    public static class67 field2730 = field2726;

    @OriginalMember(owner = "client!sd", name = "sb", descriptor = "Lkc;")
    public static class67 field2748 = field2726;

    @OriginalMember(owner = "client!sd", name = "xb", descriptor = "Lkc;")
    public static class67 field2753 = field2726;

    @OriginalMember(owner = "client!sd", name = "V", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!sd", name = "X", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!sd", name = "bb", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!sd", name = "db", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!sd", name = "fb", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!sd", name = "hb", descriptor = "I")
    public static int field2737;

    @OriginalMember(owner = "client!sd", name = "ib", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!sd", name = "jb", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!sd", name = "nb", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!sd", name = "tb", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!sd", name = "ob", descriptor = "Lta;")
    public static class119 field2744;

    @OriginalMember(owner = "client!sd", name = "Y", descriptor = "Ljd;")
    public static class62 field2728;

    @OriginalMember(owner = "client!sd", name = "gb", descriptor = "[Lab;")
    public static class3[] field2736;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IBI)I", line = 19)
    public static final int method923(int arg0, byte arg1, int arg2) {
        class102 var3 = (class102) class82.field1954.method462(false, (long) arg0);
        field2749++;
        if (var3 == null) {
            return 0;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var4 = 0;
            if (arg1 != -114) {
                return 118;
            }
            for (int var5 = 0; var5 < var3.field2298.length; var5++) {
                if (var3.field2299[var5] == arg2) {
                    var4 += var3.field2298[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lwd;B)V", line = 54)
    public final void method924(class140 arg0, byte arg1) {
        field2738++;
        if (arg1 != -42) {
            method923(-60, (byte) -89, -67);
        }
        while (true) {
            int var3 = arg0.method1105(arg1 ^ 0xFFFFFF29);
            if (var3 == 0) {
                return;
            }
            this.method926(var3, 451, arg0);
        }
    }

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "(I)V", line = 76)
    public static void method925(int arg0) {
        field2732 = null;
        field2740 = null;
        field2741 = null;
        field2728 = null;
        field2753 = null;
        field2745 = null;
        field2751 = null;
        field2747 = null;
        field2748 = null;
        field2750 = null;
        field2736 = null;
        field2744 = null;
        field2729 = null;
        field2742 = null;
        if (arg0 != 0) {
            field2742 = null;
        }
        field2746 = null;
        field2726 = null;
        field2730 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IILwd;)V", line = 116)
    private final void method926(int arg0, int arg1, class140 arg2) {
        if (arg0 == 5) {
            this.field2752 = arg2.method1072(28);
        }
        field2727++;
        if (arg1 != 451) {
            method923(-53, (byte) -30, -108);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lwd;BI)Lkc;", line = 132)
    public static final class67 method927(class140 arg0, byte arg1, int arg2) {
        field2725++;
        try {
            class67 var3 = new class67();
            var3.field1572 = arg0.method1103((byte) 109);
            if (arg2 < var3.field1572) {
                var3.field1572 = arg2;
            }
            if (arg1 != -29) {
                method927(null, (byte) -128, -121);
            }
            var3.field1597 = new byte[var3.field1572];
            arg0.field3347 += class97.field2188.method261(var3.field1572, var3.field1597, 8, arg0.field3347, arg0.field3325, 0);
            return var3;
        } catch (Exception var4) {
            return class30.field628;
        }
    }

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "(I)V", line = 173)
    public static final void method928(int arg0) {
        if (arg0 != -1) {
            field2747 = null;
        }
        field2731++;
        class127.field2961.method378((byte) -53);
    }
}
