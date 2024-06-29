import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class131 extends class84 {

    @OriginalMember(owner = "client!sf", name = "db", descriptor = "[I")
    public static int[] field2868 = new int[50];

    @OriginalMember(owner = "client!sf", name = "eb", descriptor = "Lpe;")
    public static class109 field2869 = class141.method1120("Schlie-8en", 0);

    @OriginalMember(owner = "client!sf", name = "bb", descriptor = "Lpe;")
    public static class109 field2866 = class141.method1120("", 0);

    @OriginalMember(owner = "client!sf", name = "nb", descriptor = "Lpe;")
    public static class109 field2878 = class141.method1120("(U4", 0);

    @OriginalMember(owner = "client!sf", name = "pb", descriptor = "Lpe;")
    private static class109 field2880 = class141.method1120("Connecting to server)3)3)3", 0);

    @OriginalMember(owner = "client!sf", name = "qb", descriptor = "I")
    public static int field2881 = 0;

    @OriginalMember(owner = "client!sf", name = "ib", descriptor = "Lpe;")
    public static class109 field2873 = field2866;

    @OriginalMember(owner = "client!sf", name = "kb", descriptor = "Lpe;")
    public static class109 field2875 = field2880;

    @OriginalMember(owner = "client!sf", name = "ub", descriptor = "I")
    public static int field2885 = 0;

    @OriginalMember(owner = "client!sf", name = "tb", descriptor = "Lpe;")
    private static class109 field2884 = class141.method1120("Please wait 1 minute and try again)3", 0);

    @OriginalMember(owner = "client!sf", name = "jb", descriptor = "Lpe;")
    public static class109 field2874 = field2884;

    @OriginalMember(owner = "client!sf", name = "gb", descriptor = "Lpe;")
    public static class109 field2871 = field2884;

    @OriginalMember(owner = "client!sf", name = "cb", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!sf", name = "fb", descriptor = "I")
    public int field2870;

    @OriginalMember(owner = "client!sf", name = "hb", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!sf", name = "lb", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!sf", name = "rb", descriptor = "I")
    public int field2882;

    @OriginalMember(owner = "client!sf", name = "vb", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!sf", name = "wb", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!sf", name = "xb", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!sf", name = "mb", descriptor = "J")
    public static long field2877;

    @OriginalMember(owner = "client!sf", name = "ob", descriptor = "[I")
    public static int[] field2879;

    @OriginalMember(owner = "client!sf", name = "sb", descriptor = "[[I")
    public static int[][] field2883;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "(I)Lwb;")
    public final class155 method16(int arg0) {
        if (arg0 != 9698) {
            field2879 = null;
        }
        field2888++;
        return class4.method43((byte) 94, this.field2882).method923(this.field2870, (byte) 108);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BII)I")
    public static final int method1056(byte arg0, int arg1, int arg2) {
        field2867++;
        if (arg0 < 82) {
            return 14;
        }
        class145 var3 = (class145) class25.field613.method505((byte) -46, (long) arg1);
        if (var3 == null) {
            return 0;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field3174.length; var5++) {
                if (var3.field3188[var5] == arg2) {
                    var4 += var3.field3174[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Z)V")
    public static void method1057(boolean arg0) {
        field2868 = null;
        field2879 = null;
        if (arg0) {
            method1057(false);
        }
        field2878 = null;
        field2871 = null;
        field2869 = null;
        field2866 = null;
        field2880 = null;
        field2883 = null;
        field2873 = null;
        field2875 = null;
        field2874 = null;
        field2884 = null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IILpe;)V")
    public static final void method1058(int arg0, int arg1, class109 arg2) {
        class125.field2772++;
        class63.field1299.method535(35, arg1 - 25013);
        if (arg1 == 0) {
            field2876++;
            class63.field1299.method126(arg2.method889(true), (byte) -121);
            class63.field1299.method135(arg0, (byte) -50);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIBII)V")
    public static final void method1059(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field2887++;
        if (arg2 > -45) {
            return;
        }
        for (int var5 = arg3; var5 <= arg3 + arg4; var5++) {
            for (int var6 = arg1; var6 <= arg1 + arg0; var6++) {
                if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
                    class126.field2796[0][var6][var5] = 127;
                    if (arg1 == var6 && var6 > 0) {
                        class83.field1775[0][var6][var5] = class83.field1775[0][var6 - 1][var5];
                    }
                    if (arg0 + arg1 == var6 && var6 < 103) {
                        class83.field1775[0][var6][var5] = class83.field1775[0][var6 + 1][var5];
                    }
                    if (arg3 == var5 && var5 > 0) {
                        class83.field1775[0][var6][var5] = class83.field1775[0][var6][var5 - 1];
                    }
                    if (arg3 + arg4 == var5 && var5 < 103) {
                        class83.field1775[0][var6][var5] = class83.field1775[0][var6][var5 + 1];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "(I)V")
    public static final void method1060(int arg0) {
        field2886++;
        class104.method836((byte) 28);
        class4.method38(5000);
        class114.method944(true);
        class99.method799((byte) 84);
        class67.method517((byte) 124);
        class118.method959((byte) -114);
        class23.method219((byte) 109);
        class24.method226((byte) 124);
        class41.method378((byte) -116);
        class32.method327((byte) 127);
        class151.method1171((byte) -67);
        class89.method738(-1);
        ((class1) class105.field2217).method1(-8676);
        class3.field59.method92((byte) 114);
        class17.field434.method761(0);
        class84.field1788.method761(arg0 ^ 0xFFFF9CD2);
        class109.field2293.method761(0);
        class18.field456.method761(arg0 + 25390);
        class114.field2503.method761(arg0 ^ 0xFFFF9CD2);
        class107.field2241.method761(arg0 ^ 0xFFFF9CD2);
        class72.field1459.method761(0);
        class18.field453.method761(arg0 ^ arg0);
        class50.field1036.method761(arg0 + 25390);
        class19.field481.method761(arg0 ^ 0xFFFF9CD2);
        class101.field2105.method761(0);
        class44.field935.method761(0);
    }
}
