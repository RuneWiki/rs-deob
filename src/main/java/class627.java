import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class627 implements class641 {

    @OriginalMember(owner = "client!re", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9189 = new String[] { method4655(method4654("iQ1\u0019[")), method4655(method4654("`\u001a1v\u000e")), method4655(method4654("|\ns[")), method4655(method4654("`\u001a1u\u000e")) };

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    public static int field9183 = 0;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "Lel;")
    public static class573 field9184 = new class573(29, -2);

    @OriginalMember(owner = "client!re", name = "a", descriptor = "Lel;")
    public static class573 field9187 = new class573(117, -2);

    @OriginalMember(owner = "client!re", name = "g", descriptor = "F")
    public static float field9186;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field9182;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "I")
    public static int field9185;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "I")
    public static int field9188;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(JB[ILdv;)Ljava/lang/String;", line = 7)
    public final String method4652(long arg0, byte arg1, int[] arg2, class685 arg3) {
        try {
            field9182++;
            if (class208.field3191 == arg3) {
                class735 var6 = class420.field6209.method3098(arg2[0], (byte) -80);
                return var6.method5367(-29506, (int) arg0);
            } else if (class166.field2288 == arg3 || class656.field9474 == arg3) {
                class530 var7 = class540.field7920.method5000((int) arg0, (byte) 102);
                return var7.field7775;
            } else {
                if (arg1 >= -100) {
                    field9188 = 52;
                }
                return class146.field1793 == arg3 || class460.field6716 == arg3 || class353.field5445 == arg3 ? class420.field6209.method3098(arg2[0], (byte) -80).method5367(-29506, (int) arg0) : null;
            }
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field9189[1] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field9189[2] : field9189[0]) + ',' + (arg3 == null ? field9189[2] : field9189[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Z)V", line = 42)
    public static void method4653(boolean arg0) {
        try {
            if (!arg0) {
                field9184 = null;
            }
            field9184 = null;
            field9187 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field9189[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!re", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4654(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x26);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!re", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4655(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 18;
                    break;
                case 1:
                    var10005 = 127;
                    break;
                case 2:
                    var10005 = 31;
                    break;
                case 3:
                    var10005 = 55;
                    break;
                default:
                    var10005 = 38;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
