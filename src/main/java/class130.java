import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class130 extends class137 {

    @OriginalMember(owner = "client!se", name = "I", descriptor = "I")
    public int field3073 = -1;

    @OriginalMember(owner = "client!se", name = "ab", descriptor = "I")
    public int field3091 = 0;

    @OriginalMember(owner = "client!se", name = "L", descriptor = "Laf;")
    public static class7 field3076 = class48.method406(40, " zuerst von Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!se", name = "O", descriptor = "Laf;")
    private static class7 field3079 = class48.method406(40, "You need a members account to login to this world)3");

    @OriginalMember(owner = "client!se", name = "X", descriptor = "I")
    public static int field3088 = 0;

    @OriginalMember(owner = "client!se", name = "M", descriptor = "I")
    public static int field3077 = 0;

    @OriginalMember(owner = "client!se", name = "K", descriptor = "Laf;")
    public static class7 field3075 = field3079;

    @OriginalMember(owner = "client!se", name = "cb", descriptor = "Z")
    public static boolean field3093 = false;

    @OriginalMember(owner = "client!se", name = "eb", descriptor = "[[I")
    public static int[][] field3095 = new int[104][104];

    @OriginalMember(owner = "client!se", name = "z", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!se", name = "B", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!se", name = "C", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!se", name = "D", descriptor = "I")
    public int field3068;

    @OriginalMember(owner = "client!se", name = "E", descriptor = "I")
    public static int field3069;

    @OriginalMember(owner = "client!se", name = "F", descriptor = "I")
    public static int field3070;

    @OriginalMember(owner = "client!se", name = "G", descriptor = "I")
    public int field3071;

    @OriginalMember(owner = "client!se", name = "H", descriptor = "I")
    public int field3072;

    @OriginalMember(owner = "client!se", name = "J", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!se", name = "N", descriptor = "I")
    public int field3078;

    @OriginalMember(owner = "client!se", name = "P", descriptor = "I")
    public int field3080;

    @OriginalMember(owner = "client!se", name = "Q", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!se", name = "R", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!se", name = "S", descriptor = "I")
    public static int field3083;

    @OriginalMember(owner = "client!se", name = "T", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!se", name = "U", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!se", name = "V", descriptor = "I")
    public int field3086;

    @OriginalMember(owner = "client!se", name = "W", descriptor = "I")
    public int field3087;

    @OriginalMember(owner = "client!se", name = "Y", descriptor = "I")
    public int field3089;

    @OriginalMember(owner = "client!se", name = "Z", descriptor = "I")
    public static int field3090;

    @OriginalMember(owner = "client!se", name = "bb", descriptor = "I")
    public int field3092;

    @OriginalMember(owner = "client!se", name = "db", descriptor = "I")
    public int field3094;

    @OriginalMember(owner = "client!se", name = "fb", descriptor = "J")
    public static long field3096;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(II)Laf;")
    public static final class7 method1065(int arg0, int arg1) {
        field3066++;
        if (arg1 != -18128) {
            method1067(-126, -28, (byte) 120);
        }
        return class116.method905(new class7[] { class51.method421((byte) 120, arg0 >> 24 & 0xFF), class22.field618, class51.method421((byte) -122, arg0 >> 16 & 0xFF), class22.field618, class51.method421((byte) 121, arg0 >> 8 & 0xFF), class22.field618, class51.method421((byte) -70, arg0 & 0xFF) }, arg1 ^ 0xFFFFB931);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lkb;ZI)Lqc;")
    public static final class114 method1066(class71 arg0, boolean arg1, int arg2) {
        field3083++;
        if (class106.method856((byte) 49, arg0, arg2)) {
            return arg1 ? null : class37.method330((byte) -84);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIB)V")
    public static final void method1067(int arg0, int arg1, byte arg2) {
        field3065++;
        int[] var3 = new int[4];
        int[] var4 = new int[4];
        var3[0] = arg0;
        var4[0] = arg1;
        int var5 = 1;
        for (int var6 = 0; var6 < 4; var6++) {
            if (class75.field1752[var6] != arg0) {
                var3[var5] = class75.field1752[var6];
                var4[var5] = class73.field1638[var6];
                var5++;
            }
        }
        class75.field1752 = var3;
        class73.field1638 = var4;
        int var7 = -89 % ((14 - arg2) / 39);
        class69.method552(class38.field959, class73.field1638, class75.field1752, 0, 29945, class38.field959.length - 1);
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(I)V")
    public static final void method1068(int arg0) {
        if (arg0 <= 87) {
            method1068(50);
        }
        class51.field1235.method391((byte) -73);
        field3069++;
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(B)V")
    public static void method1069(byte arg0) {
        field3079 = null;
        field3075 = null;
        int var1 = -54 / ((-arg0 - 22) / 43);
        field3076 = null;
        field3095 = null;
    }
}
