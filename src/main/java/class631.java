import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bfa")
public class class631 extends class518 {

    @OriginalMember(owner = "client!bfa", name = "B", descriptor = "[Ljava/lang/String;")
    private static final String[] field8969 = new String[] { method4617(method4616("\u0017Bthv]")), method4617(method4616("\u0017Bthu]")), method4617(method4616("\u0017Bths]")) };

    @OriginalMember(owner = "client!bfa", name = "F", descriptor = "[I")
    public static int[] field8965 = new int[2];

    @OriginalMember(owner = "client!bfa", name = "C", descriptor = "Ltf;")
    public static class524 field8964 = new class524();

    @OriginalMember(owner = "client!bfa", name = "D", descriptor = "I")
    public static int field8963;

    @OriginalMember(owner = "client!bfa", name = "G", descriptor = "I")
    public static int field8966;

    @OriginalMember(owner = "client!bfa", name = "E", descriptor = "I")
    public static int field8968;

    @OriginalMember(owner = "client!bfa", name = "H", descriptor = "Lwp;")
    public static class389 field8967;

    @OriginalMember(owner = "client!bfa", name = "<init>", descriptor = "()V")
    public class631() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bfa", name = "f", descriptor = "(I)V")
    public static void method4614(int arg0) {
        try {
            field8964 = null;
            field8965 = null;
            field8967 = null;
            if (arg0 != 4096) {
                field8965 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8969[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bfa", name = "b", descriptor = "(IIB)I")
    private final int method4615(int arg0, int arg1, byte arg2) {
        try {
            ++field8963;
            int var4 = arg1 * 57 + arg0;
            int var5 = 107 % ((-14 - arg2) / 49);
            int var6 = var4 << 1 ^ var4;
            return -((Integer.MAX_VALUE & (var6 * 15731 * var6 - -789221) * var6 + 1376312589) / 262144) + 4096;
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field8969[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!bfa", name = "b", descriptor = "(II)[I")
    public final int[] method14(int arg0, int arg1) {
        try {
            ++field8966;
            int[] var3 = super.field7564.method4462(26041, arg0);
            int var4 = -5 / ((-57 - arg1) / 55);
            if (super.field7564.field8652) {
                int var5 = class568.field8263[arg0];
                for (int var6 = 0; var6 < class110.field1436; ++var6) {
                    var3[var6] = this.method4615(class393.field5718[var6], var5, (byte) 70) % 4096;
                }
            }
            return var3;
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field8969[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bfa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4616(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 49);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bfa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4617(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 117;
                    break;
                case 1:
                    var10005 = 36;
                    break;
                case 2:
                    var10005 = 21;
                    break;
                case 3:
                    var10005 = 70;
                    break;
                default:
                    var10005 = 49;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
