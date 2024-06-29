import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class165 {

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
    public static int field3004 = 0;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "[I")
    public static int[] field3006 = new int[1000];

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "[I")
    public static int[] field2998 = new int[5];

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "Loh;")
    public static class263 field3009 = class253.method1681(-123, ":duelfriend:");

    @OriginalMember(owner = "client!aa", name = "m", descriptor = "Loh;")
    public static class263 field3010 = class253.method1681(-125, "Untersuchen");

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "Loh;")
    public static class263 field3003 = class253.method1681(-127, "Benutzeroberfl-=che geladen)3");

    @OriginalMember(owner = "client!aa", name = "o", descriptor = "Loh;")
    public static class263 field3012 = class253.method1681(-126, " )2>");

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public int field3000;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "I")
    public int field3008;

    @OriginalMember(owner = "client!aa", name = "n", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!aa", name = "q", descriptor = "I")
    public int field3014;

    @OriginalMember(owner = "client!aa", name = "p", descriptor = "J")
    public long field3013;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "Lnj;")
    public class139 field3002;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "[Ltd;")
    public static class70[] field3001;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Ldg;III)V")
    public static final void method1085(class137 arg0, int arg1, int arg2, int arg3) {
        field2999++;
        if (arg0.field4694 == arg2 && arg2 != -1) {
            class240 var4 = class186.method1226(12828, arg2);
            int var5 = var4.field4193;
            if (var5 == 1) {
                arg0.field4668 = 0;
                arg0.field4717 = 0;
                arg0.field4718 = 0;
                arg0.field4662 = arg3;
                class219.method1490(class229.field4018 == arg0, arg0.field4705, arg0.field4718, -64, var4, arg0.field4688);
            }
            if (var5 == 2) {
                arg0.field4668 = 0;
            }
        } else if (arg2 == -1 || arg0.field4694 == -1 || class186.method1226(12828, arg2).field4203 >= class186.method1226(12828, arg0.field4694).field4203) {
            arg0.field4717 = 0;
            arg0.field4718 = 0;
            arg0.field4662 = arg3;
            arg0.field4658 = arg0.field4711;
            arg0.field4668 = 0;
            arg0.field4694 = arg2;
            if (arg0.field4694 != -1) {
                class219.method1490(class229.field4018 == arg0, arg0.field4705, arg0.field4718, -64, class186.method1226(12828, arg0.field4694), arg0.field4688);
            }
        }
        if (arg1 != -2662) {
            method1088(-106, false);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z)V")
    public static void method1086(boolean arg0) {
        field3006 = null;
        field3003 = null;
        field3010 = null;
        if (!arg0) {
            method1088(46, false);
        }
        field3012 = null;
        field2998 = null;
        field3001 = null;
        field3009 = null;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(Z)V")
    public static final void method1087(boolean arg0) {
        if (arg0) {
            class18.field417 = class137.field2518;
            class112.field2102 = class157.field2825;
        } else {
            class18.field417 = class219.field3887;
            class112.field2102 = class163.field2968;
        }
        class7.field120 = class18.field417.length;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IZ)Z")
    public static final boolean method1088(int arg0, boolean arg1) {
        if (arg1) {
            field3007++;
            return (arg0 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(SI)Z")
    public static final boolean method1089(short arg0, int arg1) {
        field3005++;
        if (arg0 == 28 || arg0 == 19 || arg0 == 17 || arg0 == 36 || arg0 == 13 || arg0 == 34 || arg0 == 11 || arg0 == 31) {
            return true;
        } else if (arg0 == 43 || arg0 == 38 || arg0 == 1004 || arg0 == 1007) {
            return true;
        } else if (arg0 == 59 || arg0 == 16 || arg0 == 26 || arg0 == 32 || arg0 == 45) {
            return true;
        } else if (arg1 == 13) {
            return arg0 == 35 || arg0 == 20 || arg0 == 22 || arg0 == 10 || arg0 == 41 || arg0 == 5;
        } else {
            return true;
        }
    }
}
