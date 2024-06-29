import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class124 {

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
    public static int field2007 = 0;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "I")
    public static int field2009;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "[Lvd;")
    public static class144[] field2008;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z)V", line = 4)
    public static final void method982(boolean arg0) {
        if (arg0) {
            class34.field521 = class104.field1716;
            class85.field1374 = class337.field5214;
            class22.field403 = class149.field2441;
        } else {
            class34.field521 = class340.field5243;
            class85.field1374 = class9.field220;
            class22.field403 = class12.field267;
        }
        class343.field5331 = class34.field521.length;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V", line = 25)
    public static void method983(byte arg0) {
        if (arg0 <= -119) {
            field2008 = null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ICI)C", line = 46)
    public static final char method984(int arg0, char arg1, int arg2) {
        field2009++;
        if (arg0 >= -42) {
            method984(103, '0', -20);
        }
        if (arg1 >= 'À' && arg1 <= 'ÿ') {
            if (arg1 >= 'À' && arg1 <= 'Æ') {
                return 'A';
            }
            if (arg1 == 'Ç') {
                return 'C';
            }
            if (arg1 >= 'È' && arg1 <= 'Ë') {
                return 'E';
            }
            if (arg1 >= 'Ì' && arg1 <= 'Ï') {
                return 'I';
            }
            if (arg1 == 'Ñ' && arg2 != 0) {
                return 'N';
            }
            if (arg1 >= 'Ò' && arg1 <= 'Ö') {
                return 'O';
            }
            if (arg1 >= 'Ù' && arg1 <= 'Ü') {
                return 'U';
            }
            if (arg1 == 'Ý') {
                return 'Y';
            }
            if (arg1 == 'ß') {
                return 's';
            }
            if (arg1 >= 'à' && arg1 <= 'æ') {
                return 'a';
            }
            if (arg1 == 'ç') {
                return 'c';
            }
            if (arg1 >= 'è' && arg1 <= 'ë') {
                return 'e';
            }
            if (arg1 >= 'ì' && arg1 <= 'ï') {
                return 'i';
            }
            if (arg1 == 'ñ' && arg2 != 0) {
                return 'n';
            }
            if (arg1 >= 'ò' && arg1 <= 'ö') {
                return 'o';
            }
            if (arg1 >= 'ù' && arg1 <= 'ü') {
                return 'u';
            }
            if (arg1 == 'ý' || arg1 == 'ÿ') {
                return 'y';
            }
        }
        if (arg1 == 'Œ') {
            return 'O';
        } else if (arg1 == 'œ') {
            return 'o';
        } else if (arg1 == 'Ÿ') {
            return 'Y';
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIIIII)V", line = 133)
    public static final void method985(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2005++;
        if (arg5 >= 1 && arg4 >= 1 && arg5 <= 102 && arg4 <= 102) {
            if (!class53.method450(2) && (class332.field5184[0][arg5][arg4] & 0x2) == 0) {
                int var8 = arg0;
                if ((class332.field5184[arg0][arg5][arg4] & 0x8) != 0) {
                    var8 = 0;
                }
                if (class310.field4900 != var8) {
                    return;
                }
            }
            int var9 = arg0;
            if (arg0 < 3 && (class332.field5184[1][arg5][arg4] & 0x2) == 2) {
                var9 = arg0 + 1;
            }
            class12.method174(class166.field2686[arg0], arg3, arg0, var9, arg5, arg4, (byte) 90);
            if (arg2 >= 0) {
                boolean var10 = class90.field1436;
                class90.field1436 = true;
                class95.method776(arg2, arg1, arg6 + 23957, var9, false, arg0, class166.field2686[arg0], false, arg7, arg5, arg4);
                class90.field1436 = var10;
            }
        }
        if (arg6 != -23831) {
            field2007 = 84;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILjava/lang/String;)V", line = 187)
    public static final void method986(int arg0, String arg1) {
        int var2 = class75.method591(arg1, true);
        field2004++;
        if (~var2 != arg0) {
            int[] var3 = class322.field5049.method720((byte) -97, (class62.field903.field1780[var2] & 0x30D31DED) >> 28, class62.field903.field1780[var2] & 0x3FFF, class62.field903.field1780[var2] >> 14 & 0x3FFF);
            class147.method1113(-78, var3[2], var3[1]);
        }
    }
}
