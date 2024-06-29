import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class329 {

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "Z")
    public static boolean field4545 = false;

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "I")
    public static int field4546;

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "I")
    public static int field4547;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lsl;III)Lod;", line = 14)
    public static final class433 method1996(class391 arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 252) {
            field4545 = true;
        }
        field4547++;
        int var4 = arg0.field5390 | arg3 << 8;
        class433 var5 = (class433) class135.field1843.method1423((byte) 89, (long) var4 << 16);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class429.field5766.method1984(1670, class429.field5766.method1971(3, var4));
        if (var6 == null) {
            int var8 = arg1 + 65536 << 8 | arg0.field5390;
            class433 var9 = (class433) class135.field1843.method1423((byte) 89, (long) var8 << 16);
            if (var9 != null) {
                return var9;
            }
            byte[] var10 = class429.field5766.method1984(arg2 + 1418, class429.field5766.method1971(arg2 ^ 0xFF, var8));
            if (var10 == null) {
                int var12 = arg0.field5390 | 0xFFFF00;
                class433 var13 = (class433) class135.field1843.method1423((byte) 89, (long) var12 << 16);
                if (var13 != null) {
                    return var13;
                }
                byte[] var14 = class429.field5766.method1984(1670, class429.field5766.method1971(3, var12));
                if (var14 == null) {
                    return null;
                } else if (var14.length <= 1) {
                    return null;
                } else {
                    class433 var15 = class621.method3633(arg2 - 252, var14);
                    var15.field5802 = arg0;
                    class135.field1843.method1422((long) var12 << 16, var15, -91);
                    return var15;
                }
            } else if (var10.length <= 1) {
                return null;
            } else {
                class433 var11 = class621.method3633(0, var10);
                var11.field5802 = arg0;
                class135.field1843.method1422((long) var8 << 16, var11, arg2 - 343);
                return var11;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class433 var7 = class621.method3633(arg2 - 252, var6);
            var7.field5802 = arg0;
            class135.field1843.method1422((long) var4 << 16, var7, -91);
            return var7;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(CIB)C", line = 86)
    public static final char method1997(char arg0, int arg1, byte arg2) {
        field4546++;
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
            if (arg2 < 64) {
                method1996(null, 67, -6, -87);
            }
            return arg0;
        }
    }
}
