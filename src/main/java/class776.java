import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class776 {

    @OriginalMember(owner = "client!hd", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field11335 = new String[] { method5585(method5584("\nIf\u001fr1Y:\u0002s\u0005\u0005")), method5585(method5584("\nIf)5")), method5585(method5584("\nIf*5")) };

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "[I")
    public static int[] field11333 = new int[13];

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    public static int field11329;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
    public static int field11330;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
    public static int field11331;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "I")
    public static int field11332;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
    public static int field11334;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V")
    public static void method5582(byte arg0) {
        try {
            field11333 = null;
            int var1 = -92 / ((67 - arg0) / 37);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field11335[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hd", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        try {
            field11334++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field11335[0] + ')');
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)Z")
    public final boolean method5583(int arg0) {
        try {
            field11331++;
            if (arg0 != 13) {
                field11329 = -63;
            }
            return class666.field9478 == this | class492.field7405 == this;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field11335[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hd", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5584(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hd", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5585(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 98;
                    break;
                case 1:
                    var10005 = 45;
                    break;
                case 2:
                    var10005 = 72;
                    break;
                case 3:
                    var10005 = 107;
                    break;
                default:
                    var10005 = 29;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
