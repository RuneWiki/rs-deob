import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class598 {

    @OriginalMember(owner = "client!ul", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8807 = new String[] { method4452(method4451("?6xP\t")), method4452(method4451("?6xS\t")) };

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "Lef;")
    public static class513 field8804 = new class513();

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
    public static int field8802;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "I")
    public static int field8803;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
    public static int field8805;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "I")
    public static int field8806;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Z)V")
    public static void method4449(boolean arg0) {
        try {
            if (!arg0) {
                method4450((byte) -51, 90, 40);
            }
            field8804 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field8807[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BII)Z")
    public static final boolean method4450(byte arg0, int arg1, int arg2) {
        try {
            if (arg0 != -126) {
                method4450((byte) -42, 84, 59);
            }
            field8805++;
            return (arg1 & 0x800) != 0;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field8807[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ul", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4451(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x21);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ul", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4452(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 74;
                    break;
                case 1:
                    var10005 = 90;
                    break;
                case 2:
                    var10005 = 86;
                    break;
                case 3:
                    var10005 = 17;
                    break;
                default:
                    var10005 = 33;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
