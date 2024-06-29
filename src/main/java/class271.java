import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class271 {

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    public static int field3992 = -11713997;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "[I")
    public static int[] field3996 = new int[1000];

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "Ljava/lang/String;")
    public static String field3995 = " from your friend list first.";

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3993 = "RuneScape is loading - please wait...";

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
    public static int field3994;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
    public static int field3999;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "Ll;")
    public static class315 field3997;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Z)V")
    public static void method1798(boolean arg0) {
        field3996 = null;
        if (!arg0) {
            field3992 = 2;
        }
        field3997 = null;
        field3995 = null;
        field3993 = null;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)Lqg;")
    public static final class335 method1799(int arg0, int arg1) {
        field3999++;
        class335 var2 = (class335) class144.field1827.method2348(112, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class266.field3954.method1235(arg1, false, arg0);
        if (var3 == null || var3.length <= 1) {
            return null;
        } else {
            class335 var4 = class147.method1014(21, var3);
            class144.field1827.method2350(var4, (long) arg1, arg0 + 126);
            return var4;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IB)Lqs;")
    public static final class346 method1800(int arg0, byte arg1) {
        if (arg1 != -127) {
            field3995 = null;
        }
        field3994++;
        if (arg0 == 0) {
            return new class7();
        } else if (arg0 == 1) {
            return new class350();
        } else if (arg0 == 2) {
            return new class241();
        } else if (arg0 == 3) {
            return new class337();
        } else if (arg0 == 4) {
            return new class119();
        } else if (arg0 == 5) {
            return new class405();
        } else if (arg0 == 6) {
            return new class176();
        } else if (arg0 == 7) {
            return new class188();
        } else if (arg0 == 8) {
            return new class145();
        } else if (arg0 == 9) {
            return new class396();
        } else if (arg0 == 10) {
            return new class391();
        } else if (arg0 == 11) {
            return new class87();
        } else if (arg0 == 12) {
            return new class338();
        } else if (arg0 == 13) {
            return new class191();
        } else if (arg0 == 14) {
            return new class41();
        } else if (arg0 == 15) {
            return new class46();
        } else if (arg0 == 16) {
            return new class122();
        } else if (arg0 == 17) {
            return new class38();
        } else if (arg0 == 18) {
            return new class360();
        } else if (arg0 == 19) {
            return new class96();
        } else if (arg0 == 20) {
            return new class268();
        } else if (arg0 == 21) {
            return new class444();
        } else if (arg0 == 22) {
            return new class427();
        } else if (arg0 == 23) {
            return new class355();
        } else if (arg0 == 24) {
            return new class430();
        } else if (arg0 == 25) {
            return new class297();
        } else if (arg0 == 26) {
            return new class450();
        } else if (arg0 == 27) {
            return new class231();
        } else if (arg0 == 28) {
            return new class265();
        } else if (arg0 == 29) {
            return new class222();
        } else if (arg0 == 30) {
            return new class384();
        } else if (arg0 == 31) {
            return new class422();
        } else if (arg0 == 32) {
            return new class95();
        } else if (arg0 == 33) {
            return new class377();
        } else if (arg0 == 34) {
            return new class211();
        } else if (arg0 == 35) {
            return new class147();
        } else if (arg0 == 36) {
            return new class369();
        } else if (arg0 == 37) {
            return new class30();
        } else if (arg0 == 38) {
            return new class85();
        } else if (arg0 == 39) {
            return new class263();
        } else {
            return null;
        }
    }
}
