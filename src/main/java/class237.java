import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class237 {

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
    public static int field3555 = 0;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
    public static int field3557 = 0;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3551 = "Members object";

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "Ljava/lang/String;")
    public static String field3558 = "purple:";

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
    public static int field3550;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "Llm;")
    public static class210 field3556;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Z)V", line = 5)
    public static void method1620(boolean arg0) {
        if (!arg0) {
            field3551 = (String) null;
        }
        field3551 = null;
        field3558 = null;
        field3556 = null;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V", line = 17)
    public static final void method1621(int arg0) {
        if (class17.field211 != null) {
            class17.field211.method1240(true);
        }
        if (class225.field3426 != null) {
            class225.field3426.method1240(true);
        }
        if (arg0 <= 72) {
            method1624(125, 63, 91, -111, (class329) null, 100, 90, 116);
        }
        field3552++;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(III)V", line = 46)
    public static final void method1622(int arg0, int arg1, int arg2) {
        class169 var3 = class101.method712(arg2, 6, 2089666400);
        field3553++;
        if (arg1 >= -24) {
            method1620(false);
        }
        var3.method1183(false);
        var3.field2542 = arg0;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(BI)I", line = 64)
    public static final int method1623(byte arg0, int arg1) {
        if (arg0 != -23) {
            field3558 = (String) null;
        }
        field3550++;
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIILf;III)V", line = 76)
    public static final void method1624(int arg0, int arg1, int arg2, int arg3, class329 arg4, int arg5, int arg6, int arg7) {
        field3554++;
        if (class10.field102) {
            class67.field889 = 32;
        } else {
            class67.field889 = 0;
        }
        class10.field102 = false;
        if (class183.field2744 != 0) {
            if (arg0 >= arg6 && arg6 + 16 > arg0 && arg5 <= arg7 && arg7 < arg5 + 16) {
                arg4.field5023 -= 4;
                class247.method1666(arg4, -124);
            } else if (arg6 <= arg0 && arg0 < arg6 + 16 && arg2 + arg5 - 16 <= arg7 && arg7 < arg2 + arg5) {
                arg4.field5023 += 4;
                class247.method1666(arg4, -128);
            } else if (arg0 >= arg6 - class67.field889 && arg0 < (arg6 - (-class67.field889 - 16)) && arg7 >= (arg5 + 16) && arg7 < (arg5 + arg2 - 16)) {
                int var8 = (arg2 - 32) * arg2 / arg1;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg2 - var8 - 32;
                int var10 = arg7 - (var8 / 2) - arg5 - 16;
                arg4.field5023 = (arg1 - arg2) * var10 / var9;
                class247.method1666(arg4, -124);
                class10.field102 = true;
            }
        }
        if (class11.field117 != 0) {
            int var11 = arg4.field5018;
            if (arg0 >= arg6 - var11 && arg7 >= arg5 && arg6 + 16 > arg0 && arg7 <= arg2 + arg5) {
                arg4.field5023 += class11.field117 * 45;
                class247.method1666(arg4, -125);
            }
        }
        if (arg3 != 6) {
            field3556 = (class210) null;
        }
    }
}
