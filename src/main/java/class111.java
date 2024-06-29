import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class111 {

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "Lge;")
    public static class41 field2718 = new class41(260);

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
    public static int field2726 = 0;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "Lwb;")
    public static class130 field2723 = class26.method212("_", -32376);

    @OriginalMember(owner = "client!sc", name = "r", descriptor = "Lwb;")
    private static class130 field2734 = class26.method212("skill)2", -32376);

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "Lwb;")
    private static class130 field2724 = class26.method212("Add ignore", -32376);

    @OriginalMember(owner = "client!sc", name = "v", descriptor = "Lwb;")
    private static class130 field2738 = class26.method212("Loading textures )2 ", -32376);

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "I")
    public static int field2729 = 0;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "Lwb;")
    public static class130 field2725 = field2738;

    @OriginalMember(owner = "client!sc", name = "A", descriptor = "Lwb;")
    public static class130 field2743 = class26.method212("titlebox", -32376);

    @OriginalMember(owner = "client!sc", name = "u", descriptor = "Lwb;")
    public static class130 field2737 = field2724;

    @OriginalMember(owner = "client!sc", name = "B", descriptor = "Lwb;")
    public static class130 field2744 = field2734;

    @OriginalMember(owner = "client!sc", name = "y", descriptor = "I")
    public static int field2741 = -1;

    @OriginalMember(owner = "client!sc", name = "w", descriptor = "Lwb;")
    private static class130 field2739 = class26.method212("wave2:", -32376);

    @OriginalMember(owner = "client!sc", name = "t", descriptor = "Lwb;")
    private static class130 field2736 = class26.method212("Loading ignore list", -32376);

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "Lwb;")
    private static class130 field2730 = class26.method212("Loaded config", -32376);

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "Lwb;")
    public static class130 field2727 = field2730;

    @OriginalMember(owner = "client!sc", name = "s", descriptor = "Lwb;")
    public static class130 field2735 = field2736;

    @OriginalMember(owner = "client!sc", name = "x", descriptor = "Lwb;")
    public static class130 field2740 = field2739;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!sc", name = "p", descriptor = "I")
    public static int field2732;

    @OriginalMember(owner = "client!sc", name = "z", descriptor = "Lec;")
    public static class28 field2742;

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "Lk;")
    public static class60 field2733;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lga;Z)V", line = 9)
    public static final synchronized void method849(class38 arg0, boolean arg1) {
        class68.field1761 = arg0;
        field2721++;
        if (!arg1) {
            method851(-124, -3, -35, -78);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IB)V", line = 21)
    public static final synchronized void method850(int arg0, byte arg1) {
        if (class68.field1761 != null) {
            class68.field1761.method383(arg0);
        }
        if (arg1 != -101) {
            method850(-17, (byte) 41);
        }
        class19.method175(arg0, 0);
        field2728++;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIII)V", line = 41)
    public static final void method851(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < 8; var4++) {
            for (int var7 = 0; var7 < 8; var7++) {
                class69.field1781[arg0][arg3 + var4][arg1 + var7] = 0;
            }
        }
        field2731++;
        if (arg3 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                class69.field1781[arg0][arg3][arg1 + var5] = class69.field1781[arg0][arg3 - 1][arg1 + var5];
            }
        }
        if (arg1 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                class69.field1781[arg0][arg3 + var6][arg1] = class69.field1781[arg0][arg3 + var6][arg1 - 1];
            }
        }
        if (arg3 > 0 && class69.field1781[arg0][arg3 - 1][arg1] != 0) {
            class69.field1781[arg0][arg3][arg1] = class69.field1781[arg0][arg3 - 1][arg1];
        } else if (arg1 > 0 && class69.field1781[arg0][arg3][arg1 - 1] != 0) {
            class69.field1781[arg0][arg3][arg1] = class69.field1781[arg0][arg3][arg1 - 1];
        } else if (arg3 > 0 && arg1 > 0 && class69.field1781[arg0][arg3 - 1][arg1 - 1] != 0) {
            class69.field1781[arg0][arg3][arg1] = class69.field1781[arg0][arg3 - 1][arg1 - 1];
        }
        if (arg2 != 14440) {
            method851(119, 76, -82, 19);
        }
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(I)V", line = 102)
    public class111(int arg0) {
        class48.field1298 = arg0;
        class120.field2934 = class90.method668(false);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V", line = 111)
    public static final void method852(byte arg0) {
        field2719++;
        if (class26.field757 < 2 && class95.field2306 == 0 && class42.field1182 == 0) {
            return;
        }
        class130 var1;
        if (class95.field2306 == 1 && class26.field757 < 2) {
            var1 = class15.method114(new class130[] { class23.field679, class41.field1167, class116.field2860, class123.field2994 }, -20349);
        } else if (class42.field1182 == 1 && class26.field757 < 2) {
            var1 = class15.method114(new class130[] { class95.field2303, class41.field1167, class32.field883, class123.field2994 }, -20349);
        } else {
            var1 = class105.field2546[class26.field757 - 1];
        }
        if (class26.field757 > 2) {
            var1 = class15.method114(new class130[] { var1, class128.field3032, class109.method831(class26.field757 - 2, 10), class94.field2273 }, -20349);
        }
        int var2 = 99 / ((-arg0 - 25) / 63);
        class43.field1187.method1001(var1, 4, 15, 16777215, true, class130.field3128 / 1000);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "([II)V", line = 171)
    public static final synchronized void method853(int[] arg0, int arg1) {
        int var2 = 0;
        int var3 = arg1 - 7;
        while (var2 < var3) {
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
        }
        var3 += 7;
        while (var2 < var3) {
            arg0[var2++] = 0;
        }
        if (class68.field1761 != null) {
            class68.field1761.method382(arg0, 0, var3);
        }
        class19.method175(var3, 0);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(J)V", line = 196)
    public void method649(long arg0) {
        field2732++;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)I", line = 205)
    public static int method854(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "()V", line = 223)
    public void method573() {
        field2720++;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V", line = 264)
    public static void method855(int arg0) {
        field2739 = null;
        field2734 = null;
        field2730 = null;
        field2743 = null;
        field2737 = null;
        if (arg0 != -1) {
            field2734 = null;
        }
        field2736 = null;
        field2735 = null;
        field2742 = null;
        field2725 = null;
        field2738 = null;
        field2724 = null;
        field2733 = null;
        field2740 = null;
        field2718 = null;
        field2727 = null;
        field2744 = null;
        field2723 = null;
    }
}
