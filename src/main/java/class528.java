import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public abstract class class528 extends class484 {

    @OriginalMember(owner = "client!ej", name = "n", descriptor = "I")
    public static int field7772 = -1;

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "Lgf;")
    public static class46 field7764 = new class46("", 17);

    @OriginalMember(owner = "client!ej", name = "p", descriptor = "Z")
    public static boolean field7774 = true;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "I")
    public static int field7762;

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "I")
    public static int field7763;

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "I")
    public static int field7765;

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "I")
    public static int field7766;

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "I")
    public static int field7767;

    @OriginalMember(owner = "client!ej", name = "j", descriptor = "I")
    public int field7768;

    @OriginalMember(owner = "client!ej", name = "l", descriptor = "I")
    public int field7770;

    @OriginalMember(owner = "client!ej", name = "o", descriptor = "I")
    public int field7773;

    @OriginalMember(owner = "client!ej", name = "q", descriptor = "I")
    public static int field7775;

    @OriginalMember(owner = "client!ej", name = "k", descriptor = "Lclient;")
    public static client field7769;

    @OriginalMember(owner = "client!ej", name = "m", descriptor = "Z")
    public boolean field7771;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V")
    public static final void method3140(String arg0, String arg1, String arg2, int arg3, int arg4, int arg5) {
        int var6 = -69 / ((-arg3 - 67) / 32);
        field7767++;
        class34.method215(-1, arg2, true, null, arg1, arg0, arg4, arg5);
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(I)V")
    public final void method934(int arg0) {
        if (arg0 != 287) {
            method3141(-20);
        }
        field7775++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V")
    public static void method3141(int arg0) {
        field7769 = null;
        field7764 = null;
        if (arg0 != 69) {
            method3143(39, '\u0003', -35);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIII)I")
    public static final int method3142(int arg0, int arg1, int arg2, int arg3) {
        field7762++;
        if (arg1 == arg3) {
            return arg3;
        }
        int var4 = 128 - arg0;
        int var5 = (arg1 & 0x7F) * arg0 + (arg3 & 0x7F) * var4 >> 7;
        int var6 = (arg1 & 0x380) * arg0 + (arg3 & 0x380) * var4 >> 7;
        int var7 = (arg1 & 0xFC00) * arg0 + (arg2 & arg3) * var4 >> 7;
        return var7 & 0xFC00 | var6 & 0x380 | var5 & 0x7F;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILza;IZBILbm;)V")
    public final void method938(int arg0, class497 arg1, int arg2, boolean arg3, byte arg4, int arg5, class484 arg6) {
        field7765++;
        int var8 = -34 % ((arg4 - 27) / 32);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ICI)C")
    public static final char method3143(int arg0, char arg1, int arg2) {
        field7763++;
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
            if (arg1 == 'Ñ' && arg0 != 0) {
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
            if (arg1 == 'ñ' && arg0 != 0) {
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
        }
        if (arg2 != -19172) {
            field7774 = true;
        }
        if (arg1 == 'œ') {
            return 'o';
        } else if (arg1 == 'Ÿ') {
            return 'Y';
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(Z)Z")
    public final boolean method936(boolean arg0) {
        field7766++;
        if (arg0) {
            this.method934(27);
        }
        return false;
    }
}
