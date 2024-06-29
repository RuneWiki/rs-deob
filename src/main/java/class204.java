import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class204 {

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "Ls;")
    public static class186 field3266 = new class186(41, 8);

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "Los;")
    public static class309 field3271 = new class309(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "Lph;")
    public static class459 field3269;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "[I")
    public static int[] field3272;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IJ)V", line = 9)
    public static final void method1393(int arg0, long arg1) {
        field3270++;
        if (arg0 != 0) {
            method1393(-109, -56L);
        }
        int var3 = class344.field5142;
        if (class376.field5501 != var3) {
            int var4 = var3 - class376.field5501;
            int var5 = (int) ((long) var4 * arg1 / 320L);
            if (var4 > 0) {
                if (var5 == 0) {
                    var5 = 1;
                } else if (var5 > var4) {
                    var5 = var4;
                }
            } else if (var5 == 0) {
                var5 = -1;
            } else if (var4 > var5) {
                var5 = var4;
            }
            class376.field5501 += var5;
        }
        int var6 = class388.field5798;
        if (!class186.field2990.field2527) {
            class525.field7631 += (float) arg1 * class435.field6475 / 40.0F * 8.0F;
            class113.field2041 += (float) arg1 * class301.field4539 / 40.0F * 8.0F;
        }
        if (class215.field3402 != var6) {
            int var7 = var6 - class215.field3402;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var7 > var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var7 < var8) {
                var8 = var7;
            }
            class215.field3402 += var8;
        }
        class380.method2337(786432);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V", line = 98)
    public static void method1394(int arg0) {
        field3266 = null;
        if (arg0 == 19211) {
            field3269 = null;
            field3271 = null;
            field3272 = null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(CIB)C", line = 116)
    public static final char method1395(char arg0, int arg1, byte arg2) {
        field3268++;
        if (arg2 != 89) {
            return '2';
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
}
