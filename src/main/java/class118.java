import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class118 extends class206 {

    @OriginalMember(owner = "client!eg", name = "m", descriptor = "I")
    public int field1402;

    @OriginalMember(owner = "client!eg", name = "l", descriptor = "I")
    public int field1404;

    @OriginalMember(owner = "client!eg", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1407 = new String[] { method1040(method1039("8\b6Qk")), method1040(method1039("8\b6Rk")), method1040(method1039("8\b6,*3\u0006l.k")) };

    @OriginalMember(owner = "client!eg", name = "k", descriptor = "[C")
    public static char[] field1403 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "Lef;")
    public static class513 field1405 = new class513();

    @OriginalMember(owner = "client!eg", name = "n", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IBI)Z", line = 4)
    public static final boolean method1037(int arg0, byte arg1, int arg2) {
        try {
            if (arg1 != 29) {
                method1038((byte) 73);
            }
            field1406++;
            return (arg0 & 0x84080) != 0;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field1407[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(II)V", line = 18)
    public class118(int arg0, int arg1) {
        try {
            this.field1402 = arg1;
            this.field1404 = arg0;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field1407[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V", line = 32)
    public static void method1038(byte arg0) {
        try {
            if (arg0 != 62) {
                field1403 = null;
            }
            field1403 = null;
            field1405 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field1407[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eg", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1039(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x43);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!eg", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1040(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 93;
                    break;
                case 1:
                    var10005 = 111;
                    break;
                case 2:
                    var10005 = 24;
                    break;
                case 3:
                    var10005 = 16;
                    break;
                default:
                    var10005 = 67;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
