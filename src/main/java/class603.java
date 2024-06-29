import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class603 extends class46 {

    @OriginalMember(owner = "client!nf", name = "H", descriptor = "[Ljava/lang/String;")
    private static final String[] field8849 = new String[] { method4476(method4475("RS+uU")), method4476(method4475("RS+tU")) };

    @OriginalMember(owner = "client!nf", name = "B", descriptor = "Lel;")
    public static class573 field8841 = new class573(11, 4);

    @OriginalMember(owner = "client!nf", name = "s", descriptor = "Lel;")
    public static class573 field8845 = new class573(123, 0);

    @OriginalMember(owner = "client!nf", name = "z", descriptor = "I")
    public int field8833;

    @OriginalMember(owner = "client!nf", name = "F", descriptor = "I")
    public int field8838;

    @OriginalMember(owner = "client!nf", name = "w", descriptor = "I")
    public int field8839;

    @OriginalMember(owner = "client!nf", name = "C", descriptor = "I")
    public static int field8840;

    @OriginalMember(owner = "client!nf", name = "t", descriptor = "I")
    public int field8846;

    @OriginalMember(owner = "client!nf", name = "A", descriptor = "I")
    public int field8847;

    @OriginalMember(owner = "client!nf", name = "D", descriptor = "I")
    public int field8848;

    @OriginalMember(owner = "client!nf", name = "E", descriptor = "Lum;")
    public class550 field8843;

    @OriginalMember(owner = "client!nf", name = "r", descriptor = "Ljava/lang/String;")
    public String field8836;

    @OriginalMember(owner = "client!nf", name = "u", descriptor = "[I")
    public int[] field8837;

    @OriginalMember(owner = "client!nf", name = "y", descriptor = "[I")
    public int[] field8842;

    @OriginalMember(owner = "client!nf", name = "G", descriptor = "[J")
    public long[] field8844;

    @OriginalMember(owner = "client!nf", name = "v", descriptor = "[Lqha;")
    public class112[] field8835;

    @OriginalMember(owner = "client!nf", name = "x", descriptor = "[Ljava/lang/String;")
    public String[] field8834;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V", line = 3)
    public static void method4473(int arg0) {
        try {
            field8841 = null;
            if (arg0 >= -92) {
                field8845 = null;
            }
            field8845 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field8849[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIBIZ)V", line = 17)
    public static final void method4474(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, boolean arg6) {
        try {
            if (arg4 >= -108) {
                field8845 = null;
            }
            if ((arg6 ? class289.field4305.field841.method4492(false) : class289.field4305.field838.method4492(false)) != 0 && arg5 != 0 && class86.field958 < 50 && arg2 != -1) {
                class534.field7826[class86.field958++] = new class305((byte) (arg6 ? 3 : 2), arg2, arg5, arg1, arg0, 0, arg3, null);
            }
            field8840++;
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field8849[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!nf", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4475(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!nf", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4476(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 60;
                    break;
                case 1:
                    var10005 = 53;
                    break;
                case 2:
                    var10005 = 5;
                    break;
                case 3:
                    var10005 = 50;
                    break;
                default:
                    var10005 = 125;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
