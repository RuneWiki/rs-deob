import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class2 {

    @OriginalMember(owner = "client!ro", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field15 = new String[] { method14(method13("Ey$o\u0000")), method14(method13("Ey$l\u0000")) };

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "Ljava/awt/Frame;")
    public static Frame field14;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(B)V", line = 3)
    public static void method11(byte arg0) {
        try {
            int var1 = 93 % ((arg0 - 2) / 54);
            field14 = null;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field15[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(II)V", line = 15)
    public static final void method12(int arg0, int arg1) {
        try {
            if (arg1 != -6730) {
                field14 = null;
            }
            field13++;
            class313 var2 = class196.method1670((long) arg0, 7, 106);
            var2.method2635(true);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field15[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ro", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method13(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x28);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ro", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method14(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 55;
                    break;
                case 1:
                    var10005 = 22;
                    break;
                case 2:
                    var10005 = 10;
                    break;
                case 3:
                    var10005 = 46;
                    break;
                default:
                    var10005 = 40;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
