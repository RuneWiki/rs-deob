import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class162 {

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "I")
    public static int field2949 = 0;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "Lsb;")
    public static class216 field2946 = new class216(64);

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "S")
    public static short field2953 = 205;

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "Loh;")
    private static class263 field2956 = class253.method1681(-118, "Examine");

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "Loh;")
    public static class263 field2955 = class253.method1681(-127, "_labels");

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "Loh;")
    public static class263 field2954 = class253.method1681(-120, "hint_headicons");

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "Loh;")
    public static class263 field2957 = class253.method1681(-127, "Loaded world list data");

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "Loh;")
    public static class263 field2958 = field2956;

    @OriginalMember(owner = "client!cg", name = "p", descriptor = "I")
    public static int field2960 = 0;

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "Loh;")
    public static class263 field2959 = class253.method1681(-119, "mapflag");

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
    public static int field2948;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
    public static int field2950;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(III)Lic;")
    public static final class138 method1063(int arg0, int arg1, int arg2) {
        class2 var3 = class18.field417[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class138 var4 = var3.field45;
            var3.field45 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(III)Lma;")
    public static final class184 method1064(int arg0, int arg1, int arg2) {
        field2945++;
        if (arg1 != 1) {
            method1065(-18, -107, -72);
        }
        for (class184 var3 = (class184) class195.field3534.method1878(true); var3 != null; var3 = (class184) class195.field3534.method1881(arg1 ^ 0x4B)) {
            if (var3.field3326 && var3.method1219(arg2, arg0, true)) {
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(III)Z")
    public static final boolean method1065(int arg0, int arg1, int arg2) {
        int var3 = class35.field820[arg0][arg1][arg2];
        if (-class71.field1434 == var3) {
            return false;
        } else if (class71.field1434 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class216.method1469(var4 + 1, class112.field2102[arg0][arg1][arg2], var5 + 1) && class216.method1469(var4 + 128 - 1, class112.field2102[arg0][arg1 + 1][arg2], var5 + 1) && class216.method1469(var4 + 128 - 1, class112.field2102[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class216.method1469(var4 + 1, class112.field2102[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class35.field820[arg0][arg1][arg2] = class71.field1434;
                return true;
            } else {
                class35.field820[arg0][arg1][arg2] = -class71.field1434;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I[S[Loh;)V")
    public static final void method1066(int arg0, short[] arg1, class263[] arg2) {
        field2947++;
        int var3 = 60 / ((arg0 + 12) / 36);
        class166.method1094(-11564, arg2, 0, arg2.length - 1, arg1);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIII)V")
    public static final void method1067(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 122) {
            return;
        }
        class64 var4 = class84.method563(11, arg1, 80);
        field2950++;
        var4.method396(true);
        var4.field1281 = arg3;
        var4.field1290 = arg0;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
    public static void method1068(int arg0) {
        if (arg0 != 755) {
            method1063(-98, 111, -128);
        }
        field2946 = null;
        field2955 = null;
        field2958 = null;
        field2957 = null;
        field2959 = null;
        field2954 = null;
        field2956 = null;
    }
}
