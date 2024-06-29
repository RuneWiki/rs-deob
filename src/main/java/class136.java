import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class136 extends class44 {

    @OriginalMember(owner = "client!p", name = "n", descriptor = "Lkb;")
    private static class93 field2633 = class76.method390("You can(Wt add yourself to your own ignore list)3", 0);

    @OriginalMember(owner = "client!p", name = "r", descriptor = "[[[B")
    public static byte[][][] field2637 = new byte[4][104][104];

    @OriginalMember(owner = "client!p", name = "t", descriptor = "Lkb;")
    public static class93 field2639 = class76.method390(" <col=ffff00>", 0);

    @OriginalMember(owner = "client!p", name = "w", descriptor = "Lkb;")
    public static class93 field2642 = field2633;

    @OriginalMember(owner = "client!p", name = "z", descriptor = "[I")
    public static int[] field2645 = new int[100];

    @OriginalMember(owner = "client!p", name = "x", descriptor = "I")
    public static int field2643 = -1;

    @OriginalMember(owner = "client!p", name = "o", descriptor = "B")
    public byte field2634;

    @OriginalMember(owner = "client!p", name = "u", descriptor = "B")
    public static byte field2640;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "I")
    public int field2632;

    @OriginalMember(owner = "client!p", name = "p", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!p", name = "q", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!p", name = "s", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!p", name = "A", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!p", name = "v", descriptor = "Lkb;")
    public class93 field2641;

    @OriginalMember(owner = "client!p", name = "y", descriptor = "[Lna;")
    public static class119[] field2644;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(I)V")
    public static final void method857(int arg0) {
        if (arg0 != 104) {
            method858(63, -56, true, 16);
        }
        field2635++;
        if (class153.field2971 > 0) {
            class122.method696(true);
        } else {
            class205.method1336(arg0 ^ 0x7C, 40);
            class144.field2808 = class147.field2840;
            class147.field2840 = null;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIZI)V")
    public static final void method858(int arg0, int arg1, boolean arg2, int arg3) {
        field2638++;
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        }
        class8.field129 = arg1;
        class3.field46 = arg2;
        if (arg0 == 104) {
            class170.field3385 = arg3;
        }
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(I)V")
    public static void method859(int arg0) {
        if (arg0 != -8001) {
            method859(-71);
        }
        field2645 = null;
        field2644 = null;
        field2642 = null;
        field2637 = null;
        field2633 = null;
        field2639 = null;
    }
}
