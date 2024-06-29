import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class416 extends class277 {

    @OriginalMember(owner = "client!id", name = "o", descriptor = "I")
    public static int field6201 = 1;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "Lhn;")
    public static class509 field6202 = new class509(9, 2);

    @OriginalMember(owner = "client!id", name = "l", descriptor = "I")
    public static int field6198;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "I")
    public static int field6199;

    @OriginalMember(owner = "client!id", name = "q", descriptor = "I")
    public static int field6203;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "[[I")
    public static int[][] field6200;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(CII)C", line = 3)
    public static final char method2607(char arg0, int arg1, int arg2) {
        field6198++;
        if (arg1 != 249) {
            return 's';
        }
        if (arg0 >= 'À' && arg0 <= 'ÿ') {
            if (arg0 >= 'À' && arg0 <= 'Æ') {
                return 'A';
            }
            if (arg0 == 'Ç') {
                return 'C';
            }
            if (arg0 >= 'È' && arg0 <= 'Ë') {
                return 'E';
            }
            if (arg0 >= 'Ì' && arg0 <= 'Ï') {
                return 'I';
            }
            if (arg0 == 'Ñ' && arg2 != 0) {
                return 'N';
            }
            if (arg0 >= 'Ò' && arg0 <= 'Ö') {
                return 'O';
            }
            if (arg0 >= 'Ù' && arg0 <= 'Ü') {
                return 'U';
            }
            if (arg0 == 'Ý') {
                return 'Y';
            }
            if (arg0 == 'ß') {
                return 's';
            }
            if (arg0 >= 'à' && arg0 <= 'æ') {
                return 'a';
            }
            if (arg0 == 'ç') {
                return 'c';
            }
            if (arg0 >= 'è' && arg0 <= 'ë') {
                return 'e';
            }
            if (arg0 >= 'ì' && arg0 <= 'ï') {
                return 'i';
            }
            if (arg0 == 'ñ' && arg2 != 0) {
                return 'n';
            }
            if (arg0 >= 'ò' && arg0 <= 'ö') {
                return 'o';
            }
            if (arg0 >= 'ù' && arg0 <= 'ü') {
                return 'u';
            }
            if (arg0 == 'ý' || arg0 == 'ÿ') {
                return 'y';
            }
        }
        if (arg0 == 'Œ') {
            return 'O';
        } else if (arg0 == 'œ') {
            return 'o';
        } else if (arg0 == 'Ÿ') {
            return 'Y';
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V", line = 87)
    public static void method2608(byte arg0) {
        field6202 = null;
        field6200 = null;
        int var1 = -26 / ((arg0 + 32) / 61);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ZIII[BI)V", line = 111)
    public static final void method2609(boolean arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        field6199++;
        if (!arg0) {
            method2609(true, 35, 27, 21, null, 78);
        }
        if (arg5 >= arg3) {
            return;
        }
        int var6 = arg3 - arg5 >> 2;
        int var7 = arg2 + arg5;
        while (true) {
            var6--;
            if (var6 < 0) {
                int var8 = arg3 - arg5 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg4[var7++] = 1;
                }
            }
            arg4[var7++] = 1;
            arg4[var7++] = 1;
            arg4[var7++] = 1;
            arg4[var7++] = 1;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(III)I", line = 149)
    public static final int method2610(int arg0, int arg1, int arg2) {
        field6203++;
        int var3 = arg2 >>> 31;
        if (arg0 != -253) {
            field6202 = null;
        }
        return (arg2 + var3) / arg1 - var3;
    }
}
