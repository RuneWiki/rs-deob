import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class107 extends class127 {

    @OriginalMember(owner = "client!s", name = "B", descriptor = "Lhb;")
    private static class44 field2703 = class102.method810("Enter amount:", -28606);

    @OriginalMember(owner = "client!s", name = "A", descriptor = "Lhb;")
    public static class44 field2702 = class102.method810("(U4", -28606);

    @OriginalMember(owner = "client!s", name = "F", descriptor = "Lhb;")
    private static class44 field2707 = class102.method810("Login server offline)3", -28606);

    @OriginalMember(owner = "client!s", name = "D", descriptor = "Lhb;")
    private static class44 field2705 = class102.method810("Your friendlist is full)3 Max of 100 for free users)1 and 200 for members", -28606);

    @OriginalMember(owner = "client!s", name = "O", descriptor = "Lhb;")
    public static class44 field2716 = class102.method810("blaugr-Un:", -28606);

    @OriginalMember(owner = "client!s", name = "U", descriptor = "Lhb;")
    private static class44 field2721 = class102.method810("Loading config )2 ", -28606);

    @OriginalMember(owner = "client!s", name = "C", descriptor = "Lhb;")
    public static class44 field2704 = field2703;

    @OriginalMember(owner = "client!s", name = "S", descriptor = "I")
    public static volatile int field2720 = 0;

    @OriginalMember(owner = "client!s", name = "G", descriptor = "Lhb;")
    public static class44 field2708 = class102.method810("null", -28606);

    @OriginalMember(owner = "client!s", name = "H", descriptor = "Lhb;")
    public static class44 field2709 = class102.method810("Bitte entfernen Sie ", -28606);

    @OriginalMember(owner = "client!s", name = "y", descriptor = "Lhb;")
    public static class44 field2700 = field2707;

    @OriginalMember(owner = "client!s", name = "R", descriptor = "I")
    public static int field2719 = 0;

    @OriginalMember(owner = "client!s", name = "ab", descriptor = "Lhb;")
    private static class44 field2727 = class102.method810("Unexpected server response", -28606);

    @OriginalMember(owner = "client!s", name = "P", descriptor = "Lhb;")
    public static class44 field2717 = field2705;

    @OriginalMember(owner = "client!s", name = "bb", descriptor = "[I")
    public static int[] field2728 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!s", name = "K", descriptor = "Lhb;")
    public static class44 field2712 = field2721;

    @OriginalMember(owner = "client!s", name = "Z", descriptor = "Lhb;")
    public static class44 field2726 = class102.method810("Ung-Ultiges Anmelde)2Paket)3", -28606);

    @OriginalMember(owner = "client!s", name = "Y", descriptor = "Lhb;")
    public static class44 field2725 = field2727;

    @OriginalMember(owner = "client!s", name = "z", descriptor = "Lhb;")
    private static class44 field2701 = class102.method810("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ", -28606);

    @OriginalMember(owner = "client!s", name = "W", descriptor = "Lhb;")
    public static class44 field2723 = field2701;

    @OriginalMember(owner = "client!s", name = "L", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!s", name = "M", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!s", name = "N", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!s", name = "V", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!s", name = "cb", descriptor = "I")
    public int field2729;

    @OriginalMember(owner = "client!s", name = "Q", descriptor = "Lqd;")
    public class100 field2718;

    @OriginalMember(owner = "client!s", name = "I", descriptor = "Lr;")
    public class102 field2710;

    @OriginalMember(owner = "client!s", name = "J", descriptor = "Lfb;")
    public static class33 field2711;

    @OriginalMember(owner = "client!s", name = "E", descriptor = "[B")
    public byte[] field2706;

    @OriginalMember(owner = "client!s", name = "X", descriptor = "[I")
    public static int[] field2724;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIZ)I", line = 12)
    public static final int method838(int arg0, int arg1, boolean arg2) {
        field2714++;
        if (!arg2) {
            method840((byte) -47, -74, 82);
        }
        long var3 = (long) ((arg1 << 16) + arg0);
        return class2.field35 != null && class2.field35.field3057 == var3 ? class98.field2505.field3182 * 99 / (class98.field2505.field3172.length - class2.field35.field3086) + 1 : 0;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)Lhb;", line = 42)
    public static final class44 method839(int arg0, int arg1) {
        if (arg0 != 99338576) {
            field2726 = null;
        }
        field2713++;
        if (arg1 < 100000) {
            return class116.method893(10, arg1);
        } else if (arg1 < 10000000) {
            return class117.method903(new class44[] { class116.method893(10, arg1 / 1000), class102.field2613 }, false);
        } else {
            return class117.method903(new class44[] { class116.method893(10, arg1 / 1000000), class93.field2364 }, false);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BII)I", line = 94)
    public static final int method840(byte arg0, int arg1, int arg2) {
        field2722++;
        if (arg1 == -2) {
            return 12345678;
        } else if (arg1 == -1) {
            if (arg2 < 0) {
                arg2 = 0;
            } else if (arg2 > 127) {
                arg2 = 127;
            }
            return 127 - arg2;
        } else {
            int var4 = (arg1 & 0x7F) * arg2 / 128;
            if (var4 < 2) {
                var4 = 2;
            } else if (var4 > 126) {
                var4 = 126;
            }
            if (arg0 != 74) {
                field2711 = null;
            }
            return (arg1 & 0xFF80) + var4;
        }
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(B)V", line = 136)
    public static void method841(byte arg0) {
        field2726 = null;
        int var1 = 104 % ((-arg0 - 70) / 50);
        field2700 = null;
        field2725 = null;
        field2707 = null;
        field2709 = null;
        field2716 = null;
        field2705 = null;
        field2701 = null;
        field2728 = null;
        field2702 = null;
        field2704 = null;
        field2708 = null;
        field2711 = null;
        field2721 = null;
        field2723 = null;
        field2703 = null;
        field2712 = null;
        field2717 = null;
        field2724 = null;
        field2727 = null;
    }
}
