import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class610 {

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "I")
    public static int field8470 = 0;

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "I")
    public static int field8469;

    @OriginalMember(owner = "client!gp", name = "d", descriptor = "I")
    public static int field8471;

    @OriginalMember(owner = "client!gp", name = "e", descriptor = "I")
    public static int field8472;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "Lr;")
    public static class562 field8468;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(ICI)C")
    public static final char method3381(int arg0, char arg1, int arg2) {
        field8469++;
        int var3 = 34 % ((-arg0 - 49) / 50);
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

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(B)V")
    public static void method3382(byte arg0) {
        field8468 = null;
        if (arg0 <= 26) {
            method3383(-120, 53, 59, 48, -48, 8, (byte) -112);
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIIIIIB)V")
    public static final void method3383(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        class669[] var7 = class121.field1575;
        int var8 = 0;
        if (arg6 != 4) {
            return;
        }
        while (var7.length > var8) {
            class669 var9 = var7[var8];
            if (var9 != null && var9.field9508 == 2) {
                class418.method2365(var9.field9506, arg0 >> 1, arg5, var9.field9517 * 2, arg4, arg3 >> 1, -12139, var9.field9504, var9.field9511);
                if (class289.field3821[0] > -1 && class327.field4404 % 20 < 10) {
                    class623.field8633[var9.field9510].method2990(arg2 + class289.field3821[0] - 12, class289.field3821[1] + -28 + arg1);
                }
            }
            var8++;
        }
        field8471++;
    }
}
