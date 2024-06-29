import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public abstract class class153 {

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "Lli;")
    public static class185 field2892 = class245.method1649("headicons_pk", 123);

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "Lli;")
    public static class185 field2889 = class245.method1649("Lade Benutzeroberfl-=che )2 ", -128);

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "Lli;")
    public static class185 field2898 = class245.method1649(" )2> <col=00ffff>", 126);

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "I")
    public static int field2899 = 0;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "Lli;")
    public static class185 field2891 = class245.method1649(" zuerst von Ihrer Freunde)2Liste(Q", 126);

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "[I")
    public static int[] field2901 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!mc", name = "s", descriptor = "Lli;")
    private static class185 field2903 = class245.method1649(" from your friend list first)3", -89);

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "Lli;")
    public static class185 field2897 = field2903;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "Lvj;")
    public static class88 field2890 = new class88(5000);

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public int field2886;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
    public int field2895;

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "I")
    public int field2900;

    @OriginalMember(owner = "client!mc", name = "r", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!mc", name = "t", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "[[[Lk;")
    public static class198[][][] field2896;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
    public static void method1082(int arg0) {
        field2890 = null;
        field2892 = null;
        field2901 = null;
        field2896 = null;
        field2898 = null;
        field2903 = null;
        field2897 = null;
        if (arg0 != 4) {
            method1082(108);
        }
        field2891 = null;
        field2889 = null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)Z")
    public final boolean method1083(byte arg0) {
        int var2 = 4 % ((59 - arg0) / 37);
        field2893++;
        return (this.field2895 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIZ)V")
    public static final void method1084(int arg0, int arg1, int arg2, boolean arg3) {
        field2904++;
        if (arg1 != 0) {
            return;
        }
        if (arg2 < 8000 || arg2 > 48000) {
            throw new IllegalArgumentException();
        }
        class271.field4813 = arg2;
        class131.field2349 = arg3;
        class52.field904 = arg0;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)Z")
    public final boolean method1085(int arg0) {
        int var2 = 119 / ((arg0 + 26) / 44);
        field2902++;
        return (this.field2895 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)I")
    public static final int method1086(int arg0, int arg1) {
        field2885++;
        if (arg1 >= -125) {
            field2899 = 71;
        }
        if (class125.field2252 != null) {
            class125.field2252.method994((byte) -35);
            class125.field2252 = null;
        }
        class44.field702++;
        if (class44.field702 > 4) {
            class225.field4119 = 0;
            class44.field702 = 0;
            return arg0;
        }
        class225.field4119 = 0;
        if (class6.field137 == class138.field2601) {
            class138.field2601 = class174.field3192;
        } else {
            class138.field2601 = class6.field137;
        }
        return -1;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IZ)Z")
    public static final boolean method1087(int arg0, boolean arg1) {
        field2894++;
        class19.field307 = arg1;
        class179.field3300 = arg0 + 1 & 0xFFFF;
        return true;
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)Z")
    public final boolean method1088(int arg0) {
        if (arg0 < 81) {
            this.method1083((byte) -81);
        }
        field2888++;
        return (this.field2895 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(B)Z")
    public final boolean method1089(byte arg0) {
        if (arg0 >= 0) {
            field2889 = null;
        }
        field2887++;
        return (this.field2895 & 0x4) != 0;
    }
}
