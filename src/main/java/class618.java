import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class618 extends class578 {

    @OriginalMember(owner = "client!va", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field8819 = method4552(method4551("xQ\u0012=\\"));

    @OriginalMember(owner = "client!va", name = "k", descriptor = "Liea;")
    public static class421 field8809 = new class421();

    @OriginalMember(owner = "client!va", name = "j", descriptor = "Z")
    public static boolean field8817 = false;

    @OriginalMember(owner = "client!va", name = "l", descriptor = "I")
    public int field8806;

    @OriginalMember(owner = "client!va", name = "i", descriptor = "I")
    public int field8810;

    @OriginalMember(owner = "client!va", name = "v", descriptor = "I")
    public int field8811;

    @OriginalMember(owner = "client!va", name = "p", descriptor = "I")
    public int field8813;

    @OriginalMember(owner = "client!va", name = "u", descriptor = "I")
    public int field8814;

    @OriginalMember(owner = "client!va", name = "n", descriptor = "I")
    public static int field8815;

    @OriginalMember(owner = "client!va", name = "o", descriptor = "I")
    public int field8818;

    @OriginalMember(owner = "client!va", name = "m", descriptor = "Lvo;")
    public class782 field8805;

    @OriginalMember(owner = "client!va", name = "r", descriptor = "Lvo;")
    public class782 field8816;

    @OriginalMember(owner = "client!va", name = "q", descriptor = "Ljava/lang/String;")
    public String field8807;

    @OriginalMember(owner = "client!va", name = "s", descriptor = "Z")
    public boolean field8808;

    @OriginalMember(owner = "client!va", name = "t", descriptor = "[Ljava/lang/Object;")
    public Object[] field8812;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(B)V")
    public static void method4550(byte arg0) {
        try {
            field8809 = null;
            if (arg0 < 108) {
                field8809 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8819 + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!va", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4551(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x74);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!va", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4552(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 14;
                    break;
                case 1:
                    var10005 = 48;
                    break;
                case 2:
                    var10005 = 60;
                    break;
                case 3:
                    var10005 = 124;
                    break;
                default:
                    var10005 = 116;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
