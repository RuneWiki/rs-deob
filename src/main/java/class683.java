import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public abstract class class683 extends class687 {

    @OriginalMember(owner = "client!bs", name = "t", descriptor = "I")
    public int field9580;

    @OriginalMember(owner = "client!bs", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9581 = new String[] { method4898(method4897("'\u0019r9\u0014+\u0003(;U")), method4898(method4897("'\u0019rCU")), method4898(method4897("'\u0019r@U")) };

    @OriginalMember(owner = "client!bs", name = "u", descriptor = "Lsb;")
    public static class261 field9579 = new class261(98, 3);

    @OriginalMember(owner = "client!bs", name = "v", descriptor = "I")
    public static int field9578;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Z)V", line = 4)
    public static void method4895(boolean arg0) {
        try {
            field9579 = null;
            if (arg0) {
                field9579 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field9581[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(BI)V", line = 18)
    public static final void method4896(byte arg0, int arg1) {
        try {
            field9578++;
            if (arg0 > 38) {
                for (class578 var2 = class184.field2379.method3696(0); var2 != null; var2 = class184.field2379.method3697(-52)) {
                    if ((var2.field8378 >> 48 & 0xFFFFL) == (long) arg1) {
                        var2.method4294(0);
                    }
                }
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field9581[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(I)V", line = 42)
    public class683(int arg0) {
        try {
            this.field9580 = arg0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9581[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)Z")
    public abstract boolean method3373(int arg0);

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method3374(byte arg0);

    @OriginalMember(owner = "client!bs", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4897(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bs", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4898(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 69;
                    break;
                case 1:
                    var10005 = 106;
                    break;
                case 2:
                    var10005 = 92;
                    break;
                case 3:
                    var10005 = 5;
                    break;
                default:
                    var10005 = 125;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
