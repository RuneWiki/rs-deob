import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class147 {

    @OriginalMember(owner = "client!br", name = "g", descriptor = "Ltt;")
    private class249 field2190;

    @OriginalMember(owner = "client!br", name = "h", descriptor = "J")
    public long field2191;

    @OriginalMember(owner = "client!br", name = "b", descriptor = "I")
    public static int field2185 = 0;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "[Z")
    public static boolean[] field2184 = new boolean[100];

    @OriginalMember(owner = "client!br", name = "c", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!br", name = "e", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!br", name = "f", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!br", name = "i", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!br", name = "d", descriptor = "[Lle;")
    public static class330[] field2187;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "([BLjava/lang/String;BI)I", line = 6)
    public static final int method1047(byte[] arg0, String arg1, byte arg2, int arg3) {
        field2186++;
        int var4 = arg1.length();
        int var5 = arg3;
        int var6 = 0;
        if (arg2 > -16) {
            method1051(false);
        }
        while (var4 > var6) {
            char var7 = arg1.charAt(var6);
            if (var7 <= '\u007F') {
                arg0[var5++] = (byte) var7;
            } else if (var7 <= '߿') {
                arg0[var5++] = (byte) class19.method118(192, var7 >> 6);
                arg0[var5++] = (byte) class19.method118(class307.method2028(63, var7), 128);
            } else {
                arg0[var5++] = (byte) class19.method118(224, var7 >> 12);
                arg0[var5++] = (byte) class19.method118(128, class307.method2028(var7 >> 6, 63));
                arg0[var5++] = (byte) class19.method118(128, class307.method2028(63, var7));
            }
            var6++;
        }
        return var5 - arg3;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(III)V", line = 50)
    public static final void method1048(int arg0, int arg1, int arg2) {
        class281 var3 = class348.field5192[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field4380 != null) {
            var3.field4380 = null;
        }
        if (var3.field4390 != null) {
            var3.field4390 = null;
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(CII)C", line = 66)
    public static final char method1049(char arg0, int arg1, int arg2) {
        field2188++;
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
        }
        if (arg1 != -231) {
            field2185 = 44;
        }
        if (arg0 == 'œ') {
            return 'o';
        } else if (arg0 == 'Ÿ') {
            return 'Y';
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!br", name = "finalize", descriptor = "()V", line = 155)
    protected final void finalize() throws Throwable {
        this.field2190.method1750(this.field2191, 0);
        field2192++;
        super.finalize();
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IIBII)I", line = 169)
    public static final int method1050(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field2189++;
        if (arg2 > -64) {
            field2187 = null;
        }
        int var5 = 65536 - class58.field889[arg3 * 8192 / arg4] >> 1;
        return ((65536 - var5) * arg1 >> 16) + (arg0 * var5 >> 16);
    }

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Ltt;J[Lds;)V", line = 192)
    public class147(class249 arg0, long arg1, class279[] arg2) {
        this.field2190 = arg0;
        this.field2191 = arg1;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(Z)V", line = 204)
    public static void method1051(boolean arg0) {
        field2187 = null;
        if (!arg0) {
            field2185 = 52;
        }
        field2184 = null;
    }
}
