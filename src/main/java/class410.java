import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class410 extends class518 {

    @OriginalMember(owner = "client!bj", name = "B", descriptor = "[Ljava/lang/String;")
    private static final String[] field5921 = new String[] { method3219(method3218("\u0007\u0006\u000f.K")), method3219(method3218("\u0007\u0006\u000f+K")) };

    @OriginalMember(owner = "client!bj", name = "E", descriptor = "Lsb;")
    public static class261 field5917 = new class261(71, 0);

    @OriginalMember(owner = "client!bj", name = "D", descriptor = "Lsb;")
    public static class261 field5919 = new class261(126, 8);

    @OriginalMember(owner = "client!bj", name = "C", descriptor = "I")
    public static int field5918;

    @OriginalMember(owner = "client!bj", name = "F", descriptor = "I")
    public static int field5920;

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(II)[I")
    public final int[] method14(int arg0, int arg1) {
        try {
            ++field5918;
            int[] var3 = super.field7564.method4462(26041, arg0);
            int var4 = 24 / ((-57 - arg1) / 55);
            if (super.field7564.field8652) {
                class569.method4243(var3, 0, class110.field1436, class568.field8263[arg0]);
            }
            return var3;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field5921[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "()V")
    public class410() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "(I)V")
    public static void method3217(int arg0) {
        try {
            field5917 = null;
            int var1 = -53 % ((arg0 - -63) / 34);
            field5919 = null;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5921[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bj", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3218(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 99);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bj", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3219(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 101;
                    break;
                case 1:
                    var10005 = 108;
                    break;
                case 2:
                    var10005 = 33;
                    break;
                case 3:
                    var10005 = 105;
                    break;
                default:
                    var10005 = 99;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
