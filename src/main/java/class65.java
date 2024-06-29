import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class65 extends class715 {

    @OriginalMember(owner = "client!nr", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field676 = new String[] { method467(method466("\t[iR\u001e")), method467(method466("\t[iS\u001e")), method467(method466("\t[iQ\u001e")) };

    @OriginalMember(owner = "client!nr", name = "k", descriptor = "Lel;")
    public static class573 field672 = new class573(47, 11);

    @OriginalMember(owner = "client!nr", name = "l", descriptor = "Z")
    public static boolean field673 = false;

    @OriginalMember(owner = "client!nr", name = "n", descriptor = "Lel;")
    public static class573 field674 = new class573(134, -2);

    @OriginalMember(owner = "client!nr", name = "o", descriptor = "Leu;")
    public static class505 field675 = new class505(1);

    @OriginalMember(owner = "client!nr", name = "j", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!nr", name = "m", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(I)J", line = 5)
    public static final long method463(int arg0) {
        try {
            if (arg0 != 11) {
                field674 = null;
            }
            field671++;
            return class523.field7643.method45(0);
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field676[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(BII)Z", line = 24)
    public static final boolean method464(byte arg0, int arg1, int arg2) {
        try {
            if (arg0 >= -60) {
                return false;
            } else {
                field670++;
                return (arg2 & 0x18) != 0 | (arg2 & 0x220) == 544;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field676[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Z)V", line = 36)
    public static void method465(boolean arg0) {
        try {
            if (!arg0) {
                field675 = null;
            }
            field674 = null;
            field675 = null;
            field672 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field676[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nr", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method466(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x36);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!nr", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method467(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 103;
                    break;
                case 1:
                    var10005 = 41;
                    break;
                case 2:
                    var10005 = 71;
                    break;
                case 3:
                    var10005 = 23;
                    break;
                default:
                    var10005 = 54;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
