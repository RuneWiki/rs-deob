import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class110 extends class117 {

    @OriginalMember(owner = "client!jd", name = "R", descriptor = "Lhh;")
    public static class163 field2071 = class137.method1065("Starte 3D)2Softwarebibliothek)3", 17);

    @OriginalMember(owner = "client!jd", name = "W", descriptor = "Lhh;")
    public static class163 field2076 = class137.method1065("<)4col>", 17);

    @OriginalMember(owner = "client!jd", name = "ab", descriptor = "[[I")
    public static int[][] field2080 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!jd", name = "X", descriptor = "Lhh;")
    private static class163 field2077 = class137.method1065("Loaded wordpack", 17);

    @OriginalMember(owner = "client!jd", name = "cb", descriptor = "Lhh;")
    public static class163 field2082 = field2077;

    @OriginalMember(owner = "client!jd", name = "fb", descriptor = "Z")
    public static boolean field2085 = true;

    @OriginalMember(owner = "client!jd", name = "gb", descriptor = "[Z")
    public static boolean[] field2086 = new boolean[100];

    @OriginalMember(owner = "client!jd", name = "Z", descriptor = "Lhh;")
    public static class163 field2079 = class137.method1065("http:)4)4", 17);

    @OriginalMember(owner = "client!jd", name = "S", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!jd", name = "U", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!jd", name = "V", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!jd", name = "Y", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!jd", name = "bb", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!jd", name = "db", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!jd", name = "eb", descriptor = "I")
    public static int field2084;

    @OriginalMember(owner = "client!jd", name = "hb", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!jd", name = "T", descriptor = "[Lvf;")
    public static class71[] field2073;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "(B)V")
    public static void method880(byte arg0) {
        field2076 = null;
        field2073 = null;
        field2080 = null;
        field2079 = null;
        field2077 = null;
        field2071 = null;
        field2082 = null;
        if (arg0 == -126) {
            field2086 = null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(III)V")
    private final void method881(int arg0, int arg1, int arg2) {
        int var4 = class26.field402[arg2];
        int var5 = class214.field3911[arg1];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 - arg0));
        ++field2087;
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class191.field3505 = arg1;
            class97.field1818 = arg2;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class97.field1818 = arg1;
            class191.field3505 = arg2;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class191.field3505 = arg2;
            class97.field1818 = -arg1 + class143.field2702;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class97.field1818 = arg2;
            class191.field3505 = class1.field26 - arg1;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class97.field1818 = -arg2 + class143.field2702;
            class191.field3505 = -arg1 + class1.field26;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class97.field1818 = class143.field2702 - arg1;
            class191.field3505 = class1.field26 - arg2;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class191.field3505 = -arg2 + class1.field26;
            class97.field1818 = arg1;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class191.field3505 = arg1;
            class97.field1818 = -arg2 + class143.field2702;
        }
        class191.field3505 &= class258.field4520;
        class97.field1818 &= class54.field884;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IILpg;)V")
    public final void method60(int arg0, int arg1, class81 arg2) {
        ++field2081;
        if (~arg1 == -1) {
            super.field2208 = arg2.method622(true) == 1;
        }
        if (arg0 != 0) {
            this.method60(21, 117, (class81) null);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method90(int arg0, boolean arg1) {
        int[][] var3 = super.field2228.method1304(arg0, (byte) -22);
        if (!arg1) {
            method882((byte) 71, -87);
        }
        ++field2074;
        if (super.field2228.field3221) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class143.field2702; ++var7) {
                this.method881(2048, arg0, var7);
                int[][] var8 = this.method931(class191.field3505, -123, 0);
                var4[var7] = var8[0][class97.field1818];
                var5[var7] = var8[1][class97.field1818];
                var6[var7] = var8[2][class97.field1818];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)[I")
    public final int[] method61(int arg0, int arg1) {
        if (arg0 != -21393) {
            field2073 = null;
        }
        int[] var3 = super.field2218.method1044(arg1, 0);
        ++field2075;
        if (super.field2218.field2587) {
            for (int var4 = 0; var4 < class143.field2702; ++var4) {
                this.method881(2048, arg1, var4);
                int[] var5 = this.method932(class191.field3505, false, 0);
                var3[var4] = var5[class97.field1818];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BI)Lhh;")
    public static final class163 method882(byte arg0, int arg1) {
        ++field2084;
        if (arg0 != -55) {
            return null;
        } else {
            return ~class60.field993[arg1].method1221(-23096) >= -1 ? class62.field1047[arg1] : class145.method1101(0, new class163[] { class62.field1047[arg1], class91.field1670, class60.field993[arg1] });
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(II)I")
    public static final int method883(int arg0, int arg1) {
        if (arg0 != 1293034634) {
            return 88;
        } else {
            ++field2078;
            return arg1 >>> 10;
        }
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "()V")
    public class110() {
        super(1, false);
    }
}
