import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class733 {

    @OriginalMember(owner = "client!ff", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10458 = new String[] { method5334(method5333("\\C\u0007p|iQ[m}]\r")), method5334(method5333("\\C\u0007F;")), method5334(method5333("\\C\u0007E;")) };

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "Ltf;")
    public static class524 field10456 = new class524();

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "Z")
    public static boolean field10457 = false;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "I")
    public static int field10454;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
    public static int field10455;

    @OriginalMember(owner = "client!ff", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        try {
            field10454++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field10458[0] + ')');
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)Z")
    public final boolean method5331(int arg0) {
        try {
            field10455++;
            return arg0 == -30751 ? class414.field5944 == this | class784.field11313 == this : true;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10458[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)V")
    public static void method5332(int arg0) {
        try {
            if (arg0 != -12803) {
                method5332(57);
            }
            field10456 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field10458[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ff", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5333(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x13);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ff", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5334(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 58;
                    break;
                case 1:
                    var10005 = 37;
                    break;
                case 2:
                    var10005 = 41;
                    break;
                case 3:
                    var10005 = 4;
                    break;
                default:
                    var10005 = 19;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
