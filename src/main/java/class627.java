import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class627 {

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "Lica;")
    public static class205 field9185 = new class205(64);

    @OriginalMember(owner = "client!cp", name = "g", descriptor = "Lmh;")
    public static class145 field9191;

    @OriginalMember(owner = "client!cp", name = "i", descriptor = "[I")
    public static int[] field9193;

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "I")
    public static int field9186;

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "I")
    public static int field9187;

    @OriginalMember(owner = "client!cp", name = "d", descriptor = "I")
    public static int field9188;

    @OriginalMember(owner = "client!cp", name = "e", descriptor = "I")
    public static int field9189;

    @OriginalMember(owner = "client!cp", name = "f", descriptor = "I")
    public static int field9190;

    @OriginalMember(owner = "client!cp", name = "h", descriptor = "Ldda;")
    public static class597 field9192;

    static {
        new class487("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
        field9191 = new class145("", 16);
        field9193 = new int[] { 4, 4, 1, 2, 6, 4, 2, 45, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IZ)Lls;", line = 3)
    public static final class418 method3658(int arg0, boolean arg1) {
        field9190++;
        if (class287.field4218 && arg0 >= class580.field8547 && arg0 <= class481.field7296) {
            if (arg1) {
                field9185 = null;
            }
            return class392.field5710[arg0 - class580.field8547];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(CB)C", line = 23)
    public static final char method3659(char arg0, byte arg1) {
        if (arg1 != 31) {
            field9192 = null;
        }
        field9186++;
        if (arg0 == 'Æ') {
            return 'E';
        } else if (arg0 == 'æ') {
            return 'e';
        } else if (arg0 == 'ß') {
            return 's';
        } else if (arg0 == 'Œ') {
            return 'E';
        } else {
            return (char) (arg0 == 'œ' ? 'e' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(IZ)S", line = 53)
    public static final short method3660(int arg0, boolean arg1) {
        field9188++;
        int var2 = arg0 >> 10 & 0x3F;
        int var3 = (arg0 & 0x386) >> 3;
        int var4 = arg0 & 0x7F;
        int var5 = var4 <= 64 ? var3 * var4 >> 7 : (127 - var4) * var3 >> 7;
        if (arg1) {
            method3659('!', (byte) 90);
        }
        int var6 = var4 + var5;
        int var7;
        if (var6 == 0) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        return (short) (var7 >> 4 << 7 | var2 << 10 | var6);
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(Lps;Z)Lmk;", line = 82)
    public static final class463 method3661(class428 arg0, boolean arg1) {
        if (arg1) {
            method3658(-105, false);
        }
        field9189++;
        return new class463(arg0.method2622((byte) 124), arg0.method2622((byte) 125), arg0.method2622((byte) 124), arg0.method2622((byte) 125), arg0.method2622((byte) 123), arg0.method2622((byte) 123), arg0.method2622((byte) 124), arg0.method2622((byte) 126), arg0.method2601(47), arg0.method2561((byte) 123));
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(ZLjava/lang/String;)V", line = 93)
    public static final void method3662(boolean arg0, String arg1) {
        field9187++;
        if (arg1 == null) {
            return;
        }
        if (arg1.startsWith("*")) {
            arg1 = arg1.substring(1);
        }
        if (!arg0) {
            field9191 = null;
        }
        String var2 = class436.method2679(arg1, -1);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class156.field1993; var3++) {
            String var4 = class417.field5994[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class436.method2679(var4, -1);
            if (var5 != null && var5.equals(var2)) {
                class156.field1993--;
                for (int var6 = var3; var6 < class156.field1993; var6++) {
                    class417.field5994[var6] = class417.field5994[var6 + 1];
                    class19.field177[var6] = class19.field177[var6 + 1];
                    class526.field7779[var6] = class526.field7779[var6 + 1];
                    class161.field2158[var6] = class161.field2158[var6 + 1];
                    class183.field2792[var6] = class183.field2792[var6 + 1];
                    class528.field7836[var6] = class528.field7836[var6 + 1];
                }
                class555.field8238 = class73.field858;
                class565.field8369++;
                class165.method1046(-3466, class532.field7885);
                class221.field3268.method2563(-13021, class83.method488(-124, arg1));
                class221.field3268.method2580(arg1, 30127);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(B)V", line = 168)
    public static void method3663(byte arg0) {
        field9191 = null;
        if (arg0 <= 2) {
            field9193 = null;
        }
        field9192 = null;
        field9185 = null;
        field9193 = null;
    }
}
