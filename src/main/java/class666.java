import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tda")
public class class666 {

    @OriginalMember(owner = "client!tda", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9480 = new String[] { method4836(method4835("o7GK\u00033")), method4836(method4835("o7GK\u00003")), method4836(method4835("o7GK\u00023")), method4836(method4835("o7GK5t\u0000R\u0017(u4\u000e")) };

    @OriginalMember(owner = "client!tda", name = "d", descriptor = "[I")
    public static int[] field9475 = new int[3];

    @OriginalMember(owner = "client!tda", name = "b", descriptor = "Z")
    public static boolean field9479 = false;

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "Lhd;")
    public static class776 field9478 = new class776();

    @OriginalMember(owner = "client!tda", name = "e", descriptor = "I")
    public static int field9474;

    @OriginalMember(owner = "client!tda", name = "c", descriptor = "I")
    public static int field9476;

    @OriginalMember(owner = "client!tda", name = "f", descriptor = "I")
    public static int field9477;

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(BC)B")
    public static final byte method4832(byte arg0, char arg1) {
        try {
            field9474++;
            int var2 = 49 / ((arg0 - 42) / 59);
            byte var3;
            if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
                var3 = (byte) arg1;
            } else if (arg1 == '€') {
                var3 = -128;
            } else if (arg1 == '‚') {
                var3 = -126;
            } else if (arg1 == 'ƒ') {
                var3 = -125;
            } else if (arg1 == '„') {
                var3 = -124;
            } else if (arg1 == '…') {
                var3 = -123;
            } else if (arg1 == '†') {
                var3 = -122;
            } else if (arg1 == '‡') {
                var3 = -121;
            } else if (arg1 == 'ˆ') {
                var3 = -120;
            } else if (arg1 == '‰') {
                var3 = -119;
            } else if (arg1 == 'Š') {
                var3 = -118;
            } else if (arg1 == '‹') {
                var3 = -117;
            } else if (arg1 == 'Œ') {
                var3 = -116;
            } else if (arg1 == 'Ž') {
                var3 = -114;
            } else if (arg1 == '‘') {
                var3 = -111;
            } else if (arg1 == '’') {
                var3 = -110;
            } else if (arg1 == '“') {
                var3 = -109;
            } else if (arg1 == '”') {
                var3 = -108;
            } else if (arg1 == '•') {
                var3 = -107;
            } else if (arg1 == '–') {
                var3 = -106;
            } else if (arg1 == '—') {
                var3 = -105;
            } else if (arg1 == '˜') {
                var3 = -104;
            } else if (arg1 == '™') {
                var3 = -103;
            } else if (arg1 == 'š') {
                var3 = -102;
            } else if (arg1 == '›') {
                var3 = -101;
            } else if (arg1 == 'œ') {
                var3 = -100;
            } else if (arg1 == 'ž') {
                var3 = -98;
            } else if (arg1 == 'Ÿ') {
                var3 = -97;
            } else {
                var3 = 63;
            }
            return var3;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field9480[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(IIB)I")
    public final int method4833(int arg0, int arg1, byte arg2) {
        try {
            field9477++;
            int var4 = class333.field5444 <= arg1 ? arg1 : class333.field5444;
            if (class404.field6372 == this) {
                return 0;
            } else if (class674.field9562 == this) {
                return var4 - arg0;
            } else if (arg2 == 84) {
                return class648.field9293 == this ? (var4 - arg0) / 2 : 0;
            } else {
                return -95;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field9480[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(B)V")
    public static void method4834(byte arg0) {
        try {
            field9475 = null;
            if (arg0 != 28) {
                method4832((byte) -87, (char) 65498);
            }
            field9478 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field9480[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tda", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        try {
            field9476++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field9480[3] + ')');
        }
    }

    @OriginalMember(owner = "client!tda", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4835(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x41);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!tda", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4836(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 27;
                    break;
                case 1:
                    var10005 = 83;
                    break;
                case 2:
                    var10005 = 38;
                    break;
                case 3:
                    var10005 = 101;
                    break;
                default:
                    var10005 = 65;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
