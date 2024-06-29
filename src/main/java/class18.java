import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class18 {

    @OriginalMember(owner = "client!rj", name = "j", descriptor = "[I")
    public static int[] field350 = new int[256];

    @OriginalMember(owner = "client!rj", name = "l", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!rj", name = "m", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!rj", name = "o", descriptor = "Ljava/lang/String;")
    public static String field355;

    @OriginalMember(owner = "client!rj", name = "n", descriptor = "Ljava/lang/String;")
    public static String field354;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
    public int field341;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "I")
    public int field342;

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "I")
    public int field347;

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "I")
    public int field348;

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "I")
    public int field349;

    @OriginalMember(owner = "client!rj", name = "k", descriptor = "I")
    public int field351;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V", line = 6)
    public static final void method146(int arg0) {
        if (arg0 != -16332) {
            method147('\u0012', 28, -78);
        }
        class317.field4934.method1832((byte) 3);
        field344++;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(CII)C", line = 21)
    public static final char method147(char arg0, int arg1, int arg2) {
        field345++;
        if (arg1 != -224) {
            method148(false);
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

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Z)V", line = 112)
    public static void method148(boolean arg0) {
        field354 = null;
        if (!arg0) {
            field355 = null;
            field350 = null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(I)Leb;", line = 128)
    public static final class116 method149(int arg0) {
        field343++;
        if (arg0 != 115) {
            method147('\u0006', -100, 7);
        }
        try {
            return (class116) Class.forName("kk").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I[B)Lui;", line = 149)
    public static final class266 method150(int arg0, byte[] arg1) {
        if (arg0 != 105) {
            method149(5);
        }
        field346++;
        if (arg1 == null) {
            return null;
        } else {
            class266 var2 = new class266(arg1, class246.field3811, class62.field962, class108.field1797, class3.field14, class270.field4198);
            class233.method1680((byte) -12);
            return var2;
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field350[var0] = var1;
        }
        field352 = 1;
        field353 = 0;
        field355 = null;
        field354 = "Attack";
    }
}
