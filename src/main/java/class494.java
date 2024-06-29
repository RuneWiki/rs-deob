import java.awt.Color;
import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class494 {

    @OriginalMember(owner = "client!cq", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7435 = new String[] { method3739(method3738("f1c`a")), method3739(method3738("f1cca")) };

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "[Ljava/awt/Color;")
    public static Color[] field7425 = new Color[] { new Color(9179409), new Color(3289650), new Color(3289650), new Color(3289650) };

    @OriginalMember(owner = "client!cq", name = "i", descriptor = "I")
    public static int field7431 = 0;

    @OriginalMember(owner = "client!cq", name = "m", descriptor = "Z")
    public static boolean field7428 = false;

    @OriginalMember(owner = "client!cq", name = "f", descriptor = "Lse;")
    public static class267 field7430 = new class267();

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "I")
    public int field7422;

    @OriginalMember(owner = "client!cq", name = "g", descriptor = "I")
    public int field7423;

    @OriginalMember(owner = "client!cq", name = "d", descriptor = "I")
    public int field7424;

    @OriginalMember(owner = "client!cq", name = "j", descriptor = "I")
    public static int field7426;

    @OriginalMember(owner = "client!cq", name = "e", descriptor = "I")
    public int field7427;

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "I")
    public static int field7429;

    @OriginalMember(owner = "client!cq", name = "l", descriptor = "I")
    public int field7433;

    @OriginalMember(owner = "client!cq", name = "h", descriptor = "I")
    public int field7434;

    @OriginalMember(owner = "client!cq", name = "k", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field7432;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(B)V", line = 11)
    public static void method3736(byte arg0) {
        try {
            field7425 = null;
            if (arg0 == 26) {
                field7430 = null;
                field7432 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7435[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Z)V", line = 41)
    public static final void method3737(boolean arg0) {
        try {
            if (arg0) {
                field7429 = -128;
            }
            field7426++;
            class501.field7496.method304(1);
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7435[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cq", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3738(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x49);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!cq", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3739(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 5;
                    break;
                case 1:
                    var10005 = 64;
                    break;
                case 2:
                    var10005 = 77;
                    break;
                case 3:
                    var10005 = 34;
                    break;
                default:
                    var10005 = 73;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
