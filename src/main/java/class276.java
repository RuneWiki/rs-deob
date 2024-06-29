import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public abstract class class276 extends class687 {

    @OriginalMember(owner = "client!g", name = "t", descriptor = "Lrc;")
    public class131 field3895;

    @OriginalMember(owner = "client!g", name = "y", descriptor = "I")
    public int field3896;

    @OriginalMember(owner = "client!g", name = "A", descriptor = "[Ljava/lang/String;")
    private static final String[] field3901 = new String[] { method2256(method2255("3uBzg=/@;")), method2256(method2255("/uP=t")), method2256(method2255(":.\u0012\u007f")), method2256(method2255("3u9;")) };

    @OriginalMember(owner = "client!g", name = "x", descriptor = "I")
    public static int field3894 = -1;

    @OriginalMember(owner = "client!g", name = "u", descriptor = "Lop;")
    public static class574 field3897 = new class574("", 10);

    @OriginalMember(owner = "client!g", name = "w", descriptor = "Lmv;")
    public static class125 field3899 = new class125(35, 8);

    @OriginalMember(owner = "client!g", name = "z", descriptor = "F")
    public static float field3898;

    @OriginalMember(owner = "client!g", name = "v", descriptor = "Ljava/lang/Object;")
    public static Object field3900;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "(B)V")
    public static void method2252(byte arg0) {
        try {
            field3897 = null;
            field3900 = null;
            int var1 = 68 % ((-arg0 - 23) / 35);
            field3899 = null;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3901[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method2253(byte arg0);

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(B)Z")
    public abstract boolean method2254(byte arg0);

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lrc;I)V")
    public class276(class131 arg0, int arg1) {
        try {
            this.field3895 = arg0;
            this.field3896 = arg1;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field3901[0] + (arg0 == null ? field3901[2] : field3901[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!g", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2255(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x9);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!g", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2256(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 84;
                    break;
                case 1:
                    var10005 = 91;
                    break;
                case 2:
                    var10005 = 126;
                    break;
                case 3:
                    var10005 = 19;
                    break;
                default:
                    var10005 = 9;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
