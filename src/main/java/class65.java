import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class65 extends class224 {

    @OriginalMember(owner = "client!gb", name = "S", descriptor = "[I")
    public static int[] field864 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!gb", name = "X", descriptor = "Lkb;")
    public static class80 field869 = new class80(32);

    @OriginalMember(owner = "client!gb", name = "bb", descriptor = "I")
    public static int field873 = -1;

    @OriginalMember(owner = "client!gb", name = "cb", descriptor = "I")
    public static int field874 = 100;

    @OriginalMember(owner = "client!gb", name = "ab", descriptor = "Luf;")
    public static class168 field872 = class148.method1019(-1720, "<img=1>");

    @OriginalMember(owner = "client!gb", name = "db", descriptor = "Luf;")
    public static class168 field875 = class148.method1019(-1720, "rot:");

    @OriginalMember(owner = "client!gb", name = "eb", descriptor = "[I")
    public static int[] field876 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!gb", name = "Z", descriptor = "Luf;")
    public static class168 field871 = class148.method1019(-1720, "::rebuild");

    @OriginalMember(owner = "client!gb", name = "R", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!gb", name = "T", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!gb", name = "U", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!gb", name = "V", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!gb", name = "W", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!gb", name = "Y", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V", line = 11)
    public class65() {
        super(1, true);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZI)I", line = 19)
    public static final int method370(boolean arg0, int arg1) {
        if (arg0) {
            return 0;
        }
        field867++;
        class73 var2 = class198.method1394(119, arg1);
        int var3 = var2.field983;
        int var4 = var2.field982;
        int var5 = var2.field981;
        int var6 = class240.field3894[var5 - var4];
        return class122.field1891[var3] >> var4 & var6;
    }

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "(B)V", line = 41)
    public static void method371(byte arg0) {
        if (arg0 >= -125) {
            return;
        }
        field869 = null;
        field875 = null;
        field871 = null;
        field872 = null;
        field876 = null;
        field864 = null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(BI)[I", line = 61)
    public final int[] method18(byte arg0, int arg1) {
        int var3 = -89 / ((20 - arg0) / 51);
        int[] var4 = this.field3613.method1866(1, arg1);
        if (this.field3613.field4531) {
            int[][] var5 = this.method1535(0, 3, arg1);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            for (int var9 = 0; var9 < class187.field2961; var9++) {
                var4[var9] = (var7[var9] + var8[var9] + var6[var9]) / 3;
            }
        }
        field865++;
        return var4;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "([IIIJ)Luf;", line = 94)
    public static final class168 method372(int[] arg0, int arg1, int arg2, long arg3) {
        field870++;
        if (class105.field1627 != null) {
            class168 var5 = class105.field1627.method1589(-17525, arg1, arg0, arg3);
            if (var5 != null) {
                return var5;
            }
        }
        if (arg2 >= -87) {
            method371((byte) -93);
        }
        return arg1 == 5 ? class69.method388(arg3, (byte) 104).method1216(-32471) : class73.method410(10, arg3);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIZLg;)V", line = 127)
    public static final void method373(int arg0, int arg1, boolean arg2, class242 arg3) {
        field866++;
        if (class177.field2861 != null || class121.field1888 || arg3 == null || class256.method1754(arg3, -86) == null) {
            return;
        }
        class177.field2861 = arg3;
        class248.field4241 = class256.method1754(arg3, -124);
        class60.field787 = 0;
        class266.field4493 = arg0;
        class190.field3085 = arg1;
        class177.field2853 = arg2;
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(ZI)Luf;", line = 162)
    public static final class168 method374(boolean arg0, int arg1) {
        field868++;
        class168 var2 = class169.method1228(arg1, 0);
        for (int var3 = var2.method1167(false) - 3; var3 > 0; var3 -= 3) {
            var2 = class134.method938((byte) -123, new class168[] { var2.method1187(0, 0, var3), class118.field1841, var2.method1193((byte) -86, var3) });
        }
        if (var2.method1167(false) > 9) {
            return class134.method938((byte) -128, new class168[] { class79.field1129, var2.method1187(0, 0, var2.method1167(!arg0) - 8), class121.field1879, class27.field339, var2, class73.field972 });
        } else if (var2.method1167(false) <= 6) {
            return arg0 ? class134.method938((byte) -123, new class168[] { class159.field2513, var2, class193.field3138 }) : (class168) null;
        } else {
            return class134.method938((byte) -126, new class168[] { class242.field4124, var2.method1187(0, 0, var2.method1167(false) - 4), class154.field2429, class27.field339, var2, class73.field972 });
        }
    }
}
