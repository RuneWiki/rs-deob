import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public abstract class class72 {

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "Lrda;")
    public static class446 field1089 = new class446(0, 0);

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "Lew;")
    public static class685 field1092 = new class685("", 14);

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "Lla;")
    public static class422 field1094;

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field1093;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V")
    public static final void method658(int arg0) {
        field1090++;
        if (arg0 != 800) {
            method660((byte) -2, 0, '6');
        }
        int var1 = 0;
        if (class654.field9289 != null) {
            var1 = class654.field9289.field5407.method3284(3);
        }
        if (var1 == 2) {
            int var2 = class205.field3443 > 800 ? 800 : class205.field3443;
            int var3 = class245.field3938 > 600 ? 600 : class245.field3938;
            class189.field3184 = (class205.field3443 - var2) / 2;
            class660.field9408 = var2;
            class412.field6066 = var3;
            class581.field8223 = 0;
        } else if (var1 == 1) {
            int var4 = class205.field3443 > 1024 ? 1024 : class205.field3443;
            int var5 = class245.field3938 <= 768 ? class245.field3938 : 768;
            class660.field9408 = var4;
            class189.field3184 = (class205.field3443 - var4) / 2;
            class581.field8223 = 0;
            class412.field6066 = var5;
        } else {
            class189.field3184 = 0;
            class581.field8223 = 0;
            class412.field6066 = class245.field3938;
            class660.field9408 = class205.field3443;
        }
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(I)V")
    public static void method659(int arg0) {
        field1089 = null;
        field1094 = null;
        int var1 = 46 / ((arg0 - 45) / 43);
        field1092 = null;
        field1093 = null;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(BIC)C")
    public static final char method660(byte arg0, int arg1, char arg2) {
        field1091++;
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
        if (arg0 != -20) {
            method659(53);
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
