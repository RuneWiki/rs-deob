import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class393 extends class249 {

    @OriginalMember(owner = "client!it", name = "m", descriptor = "[I")
    public int[] field5900;

    @OriginalMember(owner = "client!it", name = "h", descriptor = "[I")
    public int[] field5895;

    @OriginalMember(owner = "client!it", name = "d", descriptor = "Luv;")
    public static class2 field5891 = new class2(74, 28);

    @OriginalMember(owner = "client!it", name = "k", descriptor = "I")
    public static int field5898 = 0;

    @OriginalMember(owner = "client!it", name = "l", descriptor = "[I")
    public static int[] field5899 = new int[32];

    @OriginalMember(owner = "client!it", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field5896 = new String[100];

    @OriginalMember(owner = "client!it", name = "c", descriptor = "I")
    public static int field5890;

    @OriginalMember(owner = "client!it", name = "e", descriptor = "I")
    public static int field5892;

    @OriginalMember(owner = "client!it", name = "f", descriptor = "I")
    public static int field5893;

    @OriginalMember(owner = "client!it", name = "g", descriptor = "I")
    public static int field5894;

    @OriginalMember(owner = "client!it", name = "j", descriptor = "I")
    public static int field5897;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(ZIC)C")
    public static final char method2361(boolean arg0, int arg1, char arg2) {
        field5894++;
        if (arg0) {
            field5898 = -1;
        }
        if (arg2 >= 'À' && arg2 <= 'ÿ') {
            if (arg2 >= 'À' && arg2 <= 'Æ') {
                return 'A';
            }
            if (arg2 == 'Ç') {
                return 'C';
            }
            if (arg2 >= 'È' && arg2 <= 'Ë') {
                return 'E';
            }
            if (arg2 >= 'Ì' && arg2 <= 'Ï') {
                return 'I';
            }
            if (arg2 == 'Ñ' && arg1 != 0) {
                return 'N';
            }
            if (arg2 >= 'Ò' && arg2 <= 'Ö') {
                return 'O';
            }
            if (arg2 >= 'Ù' && arg2 <= 'Ü') {
                return 'U';
            }
            if (arg2 == 'Ý') {
                return 'Y';
            }
            if (arg2 == 'ß') {
                return 's';
            }
            if (arg2 >= 'à' && arg2 <= 'æ') {
                return 'a';
            }
            if (arg2 == 'ç') {
                return 'c';
            }
            if (arg2 >= 'è' && arg2 <= 'ë') {
                return 'e';
            }
            if (arg2 >= 'ì' && arg2 <= 'ï') {
                return 'i';
            }
            if (arg2 == 'ñ' && arg1 != 0) {
                return 'n';
            }
            if (arg2 >= 'ò' && arg2 <= 'ö') {
                return 'o';
            }
            if (arg2 >= 'ù' && arg2 <= 'ü') {
                return 'u';
            }
            if (arg2 == 'ý' || arg2 == 'ÿ') {
                return 'y';
            }
        }
        if (arg2 == 'Œ') {
            return 'O';
        } else if (arg2 == 'œ') {
            return 'o';
        } else if (arg2 == 'Ÿ') {
            return 'Y';
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(IIII)I")
    public static final int method2362(int arg0, int arg1, int arg2, int arg3) {
        field5892++;
        if ((class524.field7736[arg2][arg0][arg1] & 0x8) == 0) {
            if (arg3 != -27087) {
                field5891 = null;
            }
            return arg2 <= 0 || (class524.field7736[1][arg0][arg1] & 0x2) == 0 ? arg2 : arg2 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(ILjava/lang/String;IZIILjava/lang/String;IJZI)V")
    public static final void method2363(int arg0, String arg1, int arg2, boolean arg3, int arg4, int arg5, String arg6, int arg7, long arg8, boolean arg9, int arg10) {
        field5890++;
        if (!class495.field7350 && class448.field6610 < 500) {
            int var12 = ~arg2 == arg4 ? class98.field1510 : arg2;
            class477 var13 = new class477(arg1, arg6, var12, arg10, arg5, arg8, arg0, arg7, arg9, arg3);
            class154.field2334.method2958(var13, (byte) 24);
            class448.field6610++;
        }
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(Z)V")
    public static void method2364(boolean arg0) {
        if (arg0) {
            method2362(-116, -62, 112, -63);
        }
        field5896 = null;
        field5899 = null;
        field5891 = null;
    }

    @OriginalMember(owner = "client!it", name = "<init>", descriptor = "(II[I[I)V")
    public class393(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field5900 = arg2;
        this.field5895 = arg3;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field5899[var1] = var0 - 1;
            var0 += var0;
        }
    }
}
