import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class529 extends class578 {

    @OriginalMember(owner = "client!be", name = "k", descriptor = "I")
    public int field7679;

    @OriginalMember(owner = "client!be", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7683 = new String[] { method4010(method4009("\u0017d\u001eC9")), method4010(method4009("\u0017d\u001e@9")), method4010(method4009("\u0017d\u001e=x\u001bhD?9")) };

    @OriginalMember(owner = "client!be", name = "m", descriptor = "[Ljava/awt/Color;")
    public static Color[] field7680 = new Color[] { new Color(9179409), new Color(16777215), new Color(16726277), new Color(16726277) };

    @OriginalMember(owner = "client!be", name = "l", descriptor = "I")
    public static int field7678;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "Z")
    public static boolean field7681;

    @OriginalMember(owner = "client!be", name = "j", descriptor = "[[I")
    public static int[][] field7682;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V")
    public static void method4007(byte arg0) {
        try {
            field7680 = null;
            if (arg0 <= -21) {
                field7682 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field7683[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(III)Z")
    public static final boolean method4008(int arg0, int arg1, int arg2) {
        try {
            field7678++;
            if (arg0 == -1) {
                return (arg1 & 0x100) != 0;
            } else {
                return true;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7683[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V")
    public class529() {
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(I)V")
    public class529(int arg0) {
        try {
            this.field7679 = arg0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7683[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!be", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4009(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x11);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!be", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4010(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 117;
                    break;
                case 1:
                    var10005 = 1;
                    break;
                case 2:
                    var10005 = 48;
                    break;
                case 3:
                    var10005 = 1;
                    break;
                default:
                    var10005 = 17;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
