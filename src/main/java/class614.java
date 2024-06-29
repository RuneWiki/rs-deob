import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class614 {

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "Z")
    public static boolean field8343 = false;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "Ldr;")
    public static class675 field8341 = new class675(31, 6);

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "I")
    public static int field8342;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
    public static int field8344;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
    public static int field8345;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V", line = 4)
    public static void method3432(int arg0) {
        if (arg0 <= -22) {
            field8341 = null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(CB)Z", line = 16)
    public static final boolean method3433(char arg0, byte arg1) {
        if (arg1 > -2) {
            field8341 = null;
        }
        field8342++;
        if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        } else if (arg0 >= ' ' && arg0 <= 'ÿ') {
            return true;
        } else {
            return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIIII)V", line = 38)
    public static final void method3434(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field8345++;
        float var5 = (float) class604.field8137 / (float) class604.field8123;
        int var6 = arg1;
        if (arg3 != -32508) {
            method3434(123, 36, -80, -39, 105);
        }
        int var7 = arg2;
        if (var5 < 1.0F) {
            var7 = (int) ((float) arg1 * var5);
        } else {
            var6 = (int) ((float) arg2 / var5);
        }
        int var8 = arg0 - (arg1 - var6) / 2;
        int var9 = arg4 - (arg2 - var7) / 2;
        class537.field6759 = class604.field8137 - (class604.field8137 * var9 / var7);
        class80.field1043 = -1;
        class227.field2939 = class604.field8123 * var8 / var6;
        class103.field1316 = -1;
        class460.method2531((byte) 44);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIC)C", line = 66)
    public static final char method3435(int arg0, int arg1, char arg2) {
        field8344++;
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
        }
        if (arg0 != 111) {
            method3435(-5, -70, '^');
        }
        if (arg2 == 'œ') {
            return 'o';
        } else if (arg2 == 'Ÿ') {
            return 'Y';
        } else {
            return arg2;
        }
    }
}
