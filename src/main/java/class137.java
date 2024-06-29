import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class137 {

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2212 = "Loading interfaces - ";

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "I")
    public static int field2215 = 10;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "I")
    public static int field2213;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "J")
    public long field2209;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "Lqi;")
    public class137 field2216;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "Lqi;")
    public class137 field2218;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIC)C")
    public static final char method948(int arg0, int arg1, char arg2) {
        field2210++;
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
            if (arg2 == 'Ñ' && arg0 != 0) {
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
            if (arg2 == 'ñ' && arg0 != 0) {
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
        } else if (arg1 != 3139) {
            return 'S';
        } else if (arg2 == 'œ') {
            return 'o';
        } else if (arg2 == 'Ÿ') {
            return 'Y';
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIILie;IJZ)Z")
    public static final boolean method949(int arg0, int arg1, int arg2, int arg3, int arg4, class34 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class154.method1046(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)Z")
    public final boolean method950(int arg0) {
        field2211++;
        if (arg0 != 128) {
            method948(30, -89, (char) 65468);
        }
        return this.field2218 != null;
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V")
    public static void method951(int arg0) {
        field2212 = null;
        if (arg0 != 232) {
            method951(16);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)V")
    public final void method952(byte arg0) {
        field2214++;
        if (arg0 > 16 && this.field2218 != null) {
            this.field2218.field2216 = this.field2216;
            this.field2216.field2218 = this.field2218;
            this.field2216 = null;
            this.field2218 = null;
        }
    }
}
