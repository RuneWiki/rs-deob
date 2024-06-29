import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class166 {

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "[[I")
    public static int[][] field2811 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public static int field2813 = 0;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "Lmb;")
    public static class172 field2816 = new class172(64);

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "Z")
    public static boolean field2823 = false;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "Loh;")
    public static class258 field2820 = class153.method1046("M", 95);

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "Loh;")
    private static class258 field2821 = class153.method1046("Connecting to update server", 103);

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "Loh;")
    public static class258 field2819 = field2821;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "Loh;")
    private static class258 field2825 = class153.method1046("Started 3d Library", 109);

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "Loh;")
    public static class258 field2824 = field2825;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "[I")
    public static int[] field2822;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lgb;B)V", line = 7)
    public static final void method1104(class213 arg0, byte arg1) {
        if (arg1 != -27) {
            method1106(48, -46);
        }
        class2.field19 = arg0;
        field2812++;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lgb;ILgb;)I", line = 19)
    public static final int method1105(class213 arg0, int arg1, class213 arg2) {
        field2815++;
        int var3 = 0;
        if (arg0.method1433((byte) -77, class124.field2191)) {
            var3++;
        }
        if (arg0.method1433((byte) -122, class225.field3862)) {
            var3++;
        }
        if (arg0.method1433((byte) -51, class232.field4025)) {
            var3++;
        }
        if (arg1 <= 125) {
            method1106(7, -9);
        }
        if (arg2.method1433((byte) -109, class124.field2191)) {
            var3++;
        }
        if (arg2.method1433((byte) -113, class225.field3862)) {
            var3++;
        }
        if (arg2.method1433((byte) -110, class232.field4025)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)[B", line = 57)
    public static final synchronized byte[] method1106(int arg0, int arg1) {
        int var2 = -90 % ((59 - arg0) / 47);
        field2817++;
        if (arg1 == 100 && class159.field2709 > 0) {
            byte[] var3 = class128.field2279[--class159.field2709];
            class128.field2279[class159.field2709] = null;
            return var3;
        } else if (arg1 == 5000 && class103.field1876 > 0) {
            byte[] var4 = class307.field5216[--class103.field1876];
            class307.field5216[class103.field1876] = null;
            return var4;
        } else if (arg1 == 30000 && class75.field1304 > 0) {
            byte[] var5 = class93.field1645[--class75.field1304];
            class93.field1645[class75.field1304] = null;
            return var5;
        } else {
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V", line = 97)
    public static void method1107(byte arg0) {
        field2824 = null;
        field2819 = null;
        if (arg0 != -14) {
            method1105((class213) null, 43, (class213) null);
        }
        field2821 = null;
        field2820 = null;
        field2825 = null;
        field2816 = null;
        field2811 = (int[][]) null;
        field2822 = null;
    }
}
