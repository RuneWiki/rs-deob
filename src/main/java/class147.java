import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class147 {

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
    public static int field2918 = 0;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "B")
    public static byte field2921 = 0;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "[Lff;")
    public static class57[] field2919 = new class57[4];

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "Ljd;")
    public static class92 field2924 = class202.method1325((byte) 90, "<col=ffb000>");

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "I")
    public static int field2922 = 1;

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "Ljd;")
    private static class92 field2925 = class202.method1325((byte) 90, "Unexpected loginserver response)3");

    @OriginalMember(owner = "client!pd", name = "r", descriptor = "Ljd;")
    public static class92 field2929 = field2925;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
    public int field2912;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
    public int field2915;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
    public int field2920;

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "I")
    public int field2927;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "J")
    public long field2914;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "Lnh;")
    public static class133 field2923;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "Ltg;")
    public class186 field2913;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "Ltg;")
    public class186 field2916;

    @OriginalMember(owner = "client!pd", name = "q", descriptor = "Ltg;")
    public class186 field2928;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Z)V")
    public static void method959(boolean arg0) {
        field2925 = null;
        field2924 = null;
        field2919 = null;
        field2929 = null;
        if (!arg0) {
            method959(true);
        }
        field2923 = null;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILa;IIIIII)V")
    public static final void method960(int arg0, class1 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2926++;
        if (class30.field656) {
            class6.field304 = 32;
        } else {
            class6.field304 = 0;
        }
        class30.field656 = false;
        if (class202.field3923 != 0) {
            if (arg0 <= arg4 && arg0 + 16 > arg4 && arg5 <= arg7 && arg7 < arg5 + 16) {
                arg1.field48 -= 4;
                class3.method21(arg2 ^ 0x684E, arg1);
            } else if (arg0 <= arg4 && arg0 + 16 > arg4 && arg5 + arg3 - 16 <= arg7 && arg7 < arg3 + arg5) {
                arg1.field48 += 4;
                class3.method21(26702, arg1);
            } else if (arg0 - class6.field304 <= arg4 && arg0 + class6.field304 + 16 > arg4 && arg5 + 16 <= arg7 && arg3 + arg5 - 16 > arg7) {
                int var8 = (arg3 - 32) * arg3 / arg6;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg7 - var8 / 2 - arg5 - 16;
                int var10 = arg3 - var8 - 32;
                arg1.field48 = (arg6 - arg3) * var9 / var10;
                class3.method21(26702, arg1);
                class30.field656 = true;
            }
        }
        if (class79.field1611 == arg2) {
            return;
        }
        int var11 = arg1.field96;
        if (arg0 - var11 <= arg4 && arg7 >= arg5 && arg0 + 16 > arg4 && arg7 <= arg3 + arg5) {
            arg1.field48 += class79.field1611 * 45;
            class3.method21(26702, arg1);
            return;
        }
    }
}
