import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class38 {

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "Ljava/lang/String;")
    public static String field455 = "Loaded world list data";

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "Ljava/lang/String;")
    public static String field465 = "You can't add yourself to your own ignore list.";

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "[I")
    public static int[] field456 = new int[] { 4, 4, 1, 2, 6, 4, 2, 49, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "[[Laf;")
    public static class183[][] field462 = new class183[13][13];

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "Lf;")
    public static class329 field469;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "[[[Lum;")
    public static class221[][][] field460;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V", line = 7)
    public static void method257(int arg0) {
        field469 = null;
        field455 = null;
        field456 = null;
        field460 = (class221[][][]) null;
        if (arg0 != -14) {
            field455 = (String) null;
        }
        field465 = null;
        field462 = (class183[][]) null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIII)V", line = 22)
    public static final void method258(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class318.field4792[0].method396(arg3, arg4);
        field470++;
        class318.field4792[1].method396(arg3, arg4 + arg5 - 16);
        int var6 = (arg5 - 32) * arg5 / arg0;
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg5 - var6 - 32) * arg2 / (arg0 - arg5);
        if (class117.field1817) {
            class308.method2126(arg3, arg4 + 16, 16, arg5 - 32, class209.field3151);
            class308.method2126(arg3, var7 + arg4 + 16, 16, var6, class16.field185);
            class308.method2132(arg3, arg4 + var7 + 16, var6, class191.field2843);
            class308.method2132(arg3 + 1, arg4 - -16 + var7, var6, class191.field2843);
            class308.method2135(arg3, arg4 + var7 + 16, 16, class191.field2843);
            class308.method2135(arg3, var7 + arg4 + 17, 16, class191.field2843);
            class308.method2132(arg3 + 15, arg4 + var7 + 16, var6, class304.field4624);
            class308.method2132(arg3 + 14, arg4 + 17 - -var7, var6 - 1, class304.field4624);
            class308.method2135(arg3, arg4 + var6 + var7 + 15, 16, class304.field4624);
            class308.method2135(arg3 + 1, arg4 + 14 + var7 + var6, 15, class304.field4624);
        } else {
            class46.method312(arg3, arg4 + 16, 16, arg5 - 32, class209.field3151);
            class46.method312(arg3, var7 + arg4 + 16, 16, var6, class16.field185);
            class46.method316(arg3, arg4 + var7 + 16, var6, class191.field2843);
            class46.method316(arg3 + 1, arg4 - (-var7 + -16), var6, class191.field2843);
            class46.method313(arg3, arg4 + var7 + 16, 16, class191.field2843);
            class46.method313(arg3, var7 + arg4 + 17, 16, class191.field2843);
            class46.method316(arg3 + 15, arg4 + 16 + var7, var6, class304.field4624);
            class46.method316(arg3 + 14, arg4 + var7 - -17, var6 - 1, class304.field4624);
            class46.method313(arg3, arg4 + var6 + var7 + 15, 16, class304.field4624);
            class46.method313(arg3 + 1, var6 + var7 + arg4 - -14, 15, class304.field4624);
        }
        if (arg1 < 36) {
            field462 = (class183[][]) ((class183[][]) null);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)V", line = 70)
    public static final void method259(int arg0, int arg1) {
        class169 var2 = class101.method712(arg1, 8, arg0 + 2089635965);
        if (arg0 != 30435) {
            method266(-125, 83, true);
        }
        field468++;
        var2.method1178((byte) 116);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(CI)C", line = 82)
    public static final char method260(char arg0, int arg1) {
        field464++;
        if (arg0 == 'Æ') {
            return 'E';
        } else if (arg0 == 'æ') {
            return 'e';
        } else if (arg0 == 'ß') {
            return 's';
        } else if (arg0 == 'Œ') {
            return 'E';
        } else {
            if (arg1 != 8) {
                field462 = (class183[][]) ((class183[][]) null);
            }
            return (char) (arg0 == 'œ' ? 'e' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIIIIII)V", line = 110)
    public static final void method261(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field458++;
        class218 var10 = null;
        for (class218 var11 = (class218) class164.field2468.method1109(-105); var11 != null; var11 = (class218) class164.field2468.method1115((byte) 56)) {
            if (var11.field3320 == arg9 && var11.field3331 == arg4 && var11.field3330 == arg8 && var11.field3318 == arg6) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class218();
            var10.field3320 = arg9;
            var10.field3331 = arg4;
            var10.field3318 = arg6;
            var10.field3330 = arg8;
            class317.method2170((byte) -30, var10);
            class164.field2468.method1108(var10, 65280);
        }
        var10.field3323 = arg3;
        var10.field3316 = arg1;
        if (arg7 == -849) {
            var10.field3327 = arg5;
            var10.field3324 = arg0;
            var10.field3322 = arg2;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Z)V", line = 156)
    public static final void method262(boolean arg0) {
        if (!arg0) {
            field460 = (class221[][][]) ((class221[][][]) null);
        }
        field463++;
        if (class293.field4490 == 10 && class117.field1817) {
            class163.method1155(28, 10);
        }
        if (class293.field4490 == 30) {
            class163.method1155(25, 10);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BI)V", line = 185)
    public static final void method263(byte arg0, int arg1) {
        field467++;
        if (arg0 > 0) {
            field462 = (class183[][]) ((class183[][]) null);
        }
        class169 var2 = class101.method712(arg1, 2, 2089666400);
        var2.method1178((byte) 109);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIII)I", line = 206)
    public static final int method264(int arg0, int arg1, int arg2, int arg3) {
        field457++;
        if ((class179.field2645[arg1][arg3][arg0] & 0x8) == 0) {
            if (arg2 != 1) {
                method258(94, -112, -14, -123, 4, -15);
            }
            return arg1 <= 0 || (class179.field2645[1][arg3][arg0] & 0x2) == 0 ? arg1 : arg1 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lgg;I)V", line = 235)
    public static final void method265(class69 arg0, int arg1) {
        field459++;
        for (class252 var2 = (class252) class316.field4775.method1109(-98); var2 != null; var2 = (class252) class316.field4775.method1115((byte) 73)) {
            if (var2.field3765 == arg0) {
                if (var2.field3776 != null) {
                    class72.field936.method2230(var2.field3776);
                    var2.field3776 = null;
                }
                var2.method714(-68);
                return;
            }
        }
        int var3 = -31 / ((arg1 + 11) / 50);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIZ)V", line = 269)
    public static final void method266(int arg0, int arg1, boolean arg2) {
        field461++;
        if (!arg2) {
            method261(78, -118, -82, -90, 31, 103, 36, -127, -44, 45);
        }
        class169 var3 = class101.method712(arg1, 12, 2089666400);
        var3.method1183(false);
        var3.field2542 = arg0;
    }
}
