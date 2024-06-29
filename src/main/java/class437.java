import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public class class437 extends class176 {

    @OriginalMember(owner = "client!ou", name = "l", descriptor = "Ljs;")
    public static class221 field6606 = new class221(0);

    @OriginalMember(owner = "client!ou", name = "m", descriptor = "I")
    public static int field6607;

    @OriginalMember(owner = "client!ou", name = "o", descriptor = "I")
    public int field6609;

    @OriginalMember(owner = "client!ou", name = "q", descriptor = "I")
    public static int field6611;

    @OriginalMember(owner = "client!ou", name = "r", descriptor = "I")
    public int field6612;

    @OriginalMember(owner = "client!ou", name = "s", descriptor = "I")
    public int field6613;

    @OriginalMember(owner = "client!ou", name = "u", descriptor = "I")
    public static int field6615;

    @OriginalMember(owner = "client!ou", name = "t", descriptor = "Lgw;")
    public static class117 field6614;

    @OriginalMember(owner = "client!ou", name = "p", descriptor = "La;")
    public class444 field6610;

    @OriginalMember(owner = "client!ou", name = "n", descriptor = "[Lst;")
    public class302[] field6608;

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lkw;IIII)V")
    public static final void method2654(class166 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 == 1 && arg3 > 0) {
            class230.method1546(arg0, arg2, arg3 - 1, arg4);
        } else if (arg1 == 4 && arg3 <= class533.field7842) {
            class230.method1546(arg0, arg2, arg3 + 1, arg4);
        } else if (arg1 == 8 && arg4 > 0) {
            class230.method1546(arg0, arg2, arg3, arg4 - 1);
        } else if (arg1 == 2 && arg4 <= class475.field7051) {
            class230.method1546(arg0, arg2, arg3, arg4 + 1);
        } else if (arg1 == 16 && arg3 > 0 && arg4 <= class475.field7051) {
            class230.method1546(arg0, arg2, arg3 - 1, arg4 + 1);
        } else if (arg1 == 32 && arg3 <= class533.field7842 && arg4 <= class475.field7051) {
            class230.method1546(arg0, arg2, arg3 + 1, arg4 + 1);
        } else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
            class230.method1546(arg0, arg2, arg3 - 1, arg4 - 1);
        } else if (arg1 == 64 && arg3 <= class533.field7842 && arg4 > 0) {
            class230.method1546(arg0, arg2, arg3 + 1, arg4 - 1);
        } else {
            throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(B)V")
    public static void method2655(byte arg0) {
        int var1 = 97 % ((56 - arg0) / 58);
        field6606 = null;
        field6614 = null;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(CIZ)C")
    public static final char method2656(char arg0, int arg1, boolean arg2) {
        if (!arg2) {
            method2654(null, -47, -30, 42, 104);
        }
        field6615++;
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
            if (arg0 == 'Ñ' && arg1 != 0) {
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
            if (arg0 == 'ñ' && arg1 != 0) {
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

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(IIILqa;)Z")
    public final boolean method2657(int arg0, int arg1, int arg2, class165 arg3) {
        field6607++;
        if (arg1 != 1222) {
            method2654(null, 120, 98, 125, -4);
        }
        if (this.field6608 != null) {
            for (int var5 = 0; var5 < this.field6608.length; var5++) {
                if (this.field6608[var5].method1913(arg2, arg0) && this.field6610.method138((byte) 126, arg0, arg2, arg3)) {
                    return true;
                }
            }
        }
        return false;
    }
}
