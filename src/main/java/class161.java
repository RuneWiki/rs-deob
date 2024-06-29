import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public abstract class class161 extends class180 {

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "Lcs;")
    public static class351 field2308 = new class351(68, 8);

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "I")
    public static int field2310 = 0;

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "I")
    public static int field2315 = 0;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!wc", name = "w", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)I")
    public abstract int method972(boolean arg0);

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method973(String arg0, int arg1) {
        field2314++;
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = (var3 << 5) + arg0.charAt(var4) - var3;
        }
        if (arg1 != -32435) {
            field2315 = -116;
        }
        return var3;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIII[[[BIIIBIIILkm;)V")
    public static final void method974(int arg0, int arg1, int arg2, int arg3, byte[][][] arg4, int arg5, int arg6, int arg7, byte arg8, int arg9, int arg10, int arg11, class487 arg12) {
        field2313++;
        if (arg7 == 0 || arg11 == 0) {
            return;
        }
        if (arg7 == 9) {
            arg7 = 1;
            arg0 = arg0 + 1 & 0x3;
        }
        if (arg7 == 10) {
            arg7 = 1;
            arg0 = arg0 + 3 & 0x3;
        }
        if (arg7 == 11) {
            arg7 = 8;
            arg0 = arg0 + 3 & 0x3;
        }
        if (arg8 <= 59) {
            field2310 = -29;
        }
        arg12.method1152(arg2, arg5, arg3, arg1, arg10, arg9, arg4[arg7 - 1][arg0], arg11, arg6);
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)V")
    public static void method975(int arg0) {
        field2308 = null;
        if (arg0 != -16802) {
            field2310 = 119;
        }
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "(I)I")
    public abstract int method976(int arg0);

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BC)B")
    public static final byte method977(byte arg0, char arg1) {
        if (arg0 >= -19) {
            field2308 = null;
        }
        field2309++;
        byte var2;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            var2 = (byte) arg1;
        } else if (arg1 == '€') {
            var2 = -128;
        } else if (arg1 == '‚') {
            var2 = -126;
        } else if (arg1 == 'ƒ') {
            var2 = -125;
        } else if (arg1 == '„') {
            var2 = -124;
        } else if (arg1 == '…') {
            var2 = -123;
        } else if (arg1 == '†') {
            var2 = -122;
        } else if (arg1 == '‡') {
            var2 = -121;
        } else if (arg1 == 'ˆ') {
            var2 = -120;
        } else if (arg1 == '‰') {
            var2 = -119;
        } else if (arg1 == 'Š') {
            var2 = -118;
        } else if (arg1 == '‹') {
            var2 = -117;
        } else if (arg1 == 'Œ') {
            var2 = -116;
        } else if (arg1 == 'Ž') {
            var2 = -114;
        } else if (arg1 == '‘') {
            var2 = -111;
        } else if (arg1 == '’') {
            var2 = -110;
        } else if (arg1 == '“') {
            var2 = -109;
        } else if (arg1 == '”') {
            var2 = -108;
        } else if (arg1 == '•') {
            var2 = -107;
        } else if (arg1 == '–') {
            var2 = -106;
        } else if (arg1 == '—') {
            var2 = -105;
        } else if (arg1 == '˜') {
            var2 = -104;
        } else if (arg1 == '™') {
            var2 = -103;
        } else if (arg1 == 'š') {
            var2 = -102;
        } else if (arg1 == '›') {
            var2 = -101;
        } else if (arg1 == 'œ') {
            var2 = -100;
        } else if (arg1 == 'ž') {
            var2 = -98;
        } else if (arg1 == 'Ÿ') {
            var2 = -97;
        } else {
            var2 = 63;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(Z)J")
    public abstract long method978(boolean arg0);

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZI)I")
    public static final int method979(boolean arg0, int arg1) {
        field2312++;
        return arg0 ? arg1 >> 11 & 0x7F : 11;
    }

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "(I)I")
    public abstract int method980(int arg0);

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "(I)V")
    public static final void method981(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field2316++;
        for (class103 var1 = (class103) class230.field3244.method1544(-114); var1 != null; var1 = (class103) class230.field3244.method1546((byte) -42)) {
            if (var1.field1466 == -1) {
                var1.field1459 = 0;
                class39.method318(3, var1);
            } else {
                var1.method1182(28818);
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZC)C")
    public static final char method982(boolean arg0, char arg1) {
        if (arg0) {
            method979(false, -23);
        }
        field2311++;
        return arg1 == 'µ' || arg1 == 'ƒ' ? arg1 : Character.toTitleCase(arg1);
    }
}
