import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class254 {

    @OriginalMember(owner = "client!td", name = "j", descriptor = "Z")
    public boolean field4288 = false;

    @OriginalMember(owner = "client!td", name = "h", descriptor = "I")
    public int field4286 = 0;

    @OriginalMember(owner = "client!td", name = "o", descriptor = "I")
    public int field4293 = 0;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "Ljava/lang/String;")
    public static String field4282 = "flash2:";

    @OriginalMember(owner = "client!td", name = "n", descriptor = "J")
    public static long field4292 = 0L;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "I")
    public static int field4287 = 0;

    @OriginalMember(owner = "client!td", name = "p", descriptor = "I")
    public static int field4294 = 0;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "I")
    public static int field4281;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "I")
    public static int field4283;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "I")
    public static int field4284;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!td", name = "l", descriptor = "I")
    public static int field4290;

    @OriginalMember(owner = "client!td", name = "m", descriptor = "Lbk;")
    public class53 field4291;

    @OriginalMember(owner = "client!td", name = "k", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field4289;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILqm;)Ljava/lang/String;", line = 7)
    public static final String method1961(int arg0, class227 arg1) {
        field4285++;
        if (arg0 != 249) {
            field4287 = 20;
        }
        return class19.method108(32767, arg1, true);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V", line = 19)
    public static void method1962(int arg0) {
        if (arg0 != 221) {
            method1963('(', 99, 122);
        }
        field4282 = null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(CII)C", line = 37)
    public static final char method1963(char arg0, int arg1, int arg2) {
        field4281++;
        if (arg2 <= 9) {
            field4279 = 22;
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

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(II)V", line = 134)
    public static final void method1964(int arg0, int arg1) {
        int var2 = -19 % ((-arg1 - 57) / 52);
        field4290++;
        class321 var3 = class46.method370(10, (byte) -106, arg0);
        var3.method2261(-129);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IB)I", line = 162)
    public static final int method1965(int arg0, byte arg1) {
        field4283++;
        return arg1 == -67 ? arg0 & 0xFF : 93;
    }
}
