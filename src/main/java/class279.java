import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class279 {

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "[I")
    public static int[] field3814 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "Lwj;")
    public static class270 field3816 = new class270(17, 15);

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "B")
    public static byte field3819;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "Lmg;")
    public static class101 field3821;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "([BIILjava/lang/String;II)I", line = 11)
    public static final int method1656(byte[] arg0, int arg1, int arg2, String arg3, int arg4, int arg5) {
        field3817++;
        int var6 = arg2 - arg5;
        if (arg4 >= -19) {
            field3819 = 9;
        }
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg3.charAt(arg5 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg0[arg1 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg0[arg1 + var7] = -128;
            } else if (var8 == '‚') {
                arg0[arg1 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg0[arg1 + var7] = -125;
            } else if (var8 == '„') {
                arg0[arg1 + var7] = -124;
            } else if (var8 == '…') {
                arg0[arg1 + var7] = -123;
            } else if (var8 == '†') {
                arg0[arg1 + var7] = -122;
            } else if (var8 == '‡') {
                arg0[arg1 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg0[arg1 + var7] = -120;
            } else if (var8 == '‰') {
                arg0[arg1 + var7] = -119;
            } else if (var8 == 'Š') {
                arg0[arg1 + var7] = -118;
            } else if (var8 == '‹') {
                arg0[arg1 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg0[arg1 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg0[arg1 + var7] = -114;
            } else if (var8 == '‘') {
                arg0[arg1 + var7] = -111;
            } else if (var8 == '’') {
                arg0[arg1 + var7] = -110;
            } else if (var8 == '“') {
                arg0[arg1 + var7] = -109;
            } else if (var8 == '”') {
                arg0[arg1 + var7] = -108;
            } else if (var8 == '•') {
                arg0[arg1 + var7] = -107;
            } else if (var8 == '–') {
                arg0[arg1 + var7] = -106;
            } else if (var8 == '—') {
                arg0[arg1 + var7] = -105;
            } else if (var8 == '˜') {
                arg0[arg1 + var7] = -104;
            } else if (var8 == '™') {
                arg0[arg1 + var7] = -103;
            } else if (var8 == 'š') {
                arg0[arg1 + var7] = -102;
            } else if (var8 == '›') {
                arg0[arg1 + var7] = -101;
            } else if (var8 == 'œ') {
                arg0[arg1 + var7] = -100;
            } else if (var8 == 'ž') {
                arg0[arg1 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg0[arg1 + var7] = -97;
            } else {
                arg0[arg1 + var7] = 63;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V", line = 147)
    public static void method1657(int arg0) {
        field3814 = null;
        field3821 = null;
        field3816 = null;
        if (arg0 != -24406) {
            field3821 = null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(BLem;)V", line = 159)
    public static final void method1658(byte arg0, class150 arg1) {
        if (arg0 > -95) {
            field3819 = -107;
        }
        field3818++;
        if (arg1.field2315 == 5 && arg1.field2237 != -1) {
            class345.method2044(class269.field3721, arg1, 5);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIZLla;ILya;I)V", line = 173)
    public static final void method1659(int arg0, int arg1, boolean arg2, class315 arg3, int arg4, class38 arg5, int arg6) {
        if (arg1 > -52) {
            field3816 = null;
        }
        if (arg2) {
            class506.field7454.method85((class117.field1754 - class506.field7454.method84()) / 2, (class27.field359 - class506.field7454.method93()) / 2);
            class291.field4029.method85((class117.field1754 - class291.field4029.method84()) / 2, 18);
        }
        field3820++;
        arg3.method1840(arg6, true, (class323.field4400 == class166.field2502 ? class107.field1605 : class234.field3321).method2731(62, class372.field5455), -1, class27.field359 / 2 - 26, class117.field1754 / 2);
        int var7 = class27.field359 / 2 - 18;
        arg5.method253(class117.field1754 / 2 - 152, var7, 304, 34, arg4, 0);
        arg5.method253(class117.field1754 / 2 - 151, var7 + 1, 302, 32, 0, 0);
        arg5.method243(class117.field1754 / 2 - 150, var7 + 2, class339.field4895 * 3, 30, arg0, 0);
        arg5.method243(class339.field4895 * 3 + (class117.field1754 / 2 - 150), var7 - -2, 300 - class339.field4895 * 3, 30, 0, 0);
        arg3.method1840(arg6, true, class57.field674, -1, class27.field359 / 2 + 4, class117.field1754 / 2);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Z)V", line = 205)
    public static final void method1660(boolean arg0) {
        if (arg0) {
            method1657(-16);
        }
        field3815++;
        if (class299.field4107 < 0) {
            class495.field7230 = -1;
            class295.field4056 = -1;
            class299.field4107 = 0;
        }
        if (class350.field5132 < class299.field4107) {
            class495.field7230 = -1;
            class299.field4107 = class350.field5132;
            class295.field4056 = -1;
        }
        if (class80.field1216 < 0) {
            class80.field1216 = 0;
            class295.field4056 = -1;
            class495.field7230 = -1;
        }
        if (class350.field5137 < class80.field1216) {
            class495.field7230 = -1;
            class295.field4056 = -1;
            class80.field1216 = class350.field5137;
        }
    }
}
