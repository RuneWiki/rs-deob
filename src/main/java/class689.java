import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class689 extends class84 {

    @OriginalMember(owner = "client!w", name = "Q", descriptor = "Lrfa;")
    private class202 field9643;

    @OriginalMember(owner = "client!w", name = "R", descriptor = "[Ljava/lang/String;")
    private static final String[] field9644 = new String[] { method4925(method4924("n\"\u000ei")), method4925(method4924("wy*-")), method4925(method4924("b\"hoa")), method4925(method4924("n\"z(rpxxi")) };

    @OriginalMember(owner = "client!w", name = "O", descriptor = "I")
    public static int field9642 = 0;

    @OriginalMember(owner = "client!w", name = "P", descriptor = "I")
    public static int field9641;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ILkn;B)V")
    public final void method838(int arg0, class437 arg1, byte arg2) {
        try {
            field9641++;
            if (arg2 == -42) {
                class490.method3773(arg1, arg0, this.field9643, 86);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field9644[0] + arg0 + ',' + (arg1 == null ? field9644[1] : field9644[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lrfa;Z)V")
    public class689(class202 arg0, boolean arg1) {
        super(arg1);
        try {
            this.field9643 = arg0;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field9644[3] + (arg0 == null ? field9644[1] : field9644[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!w", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4924(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1C);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!w", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4925(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 25;
                    break;
                case 1:
                    var10005 = 12;
                    break;
                case 2:
                    var10005 = 70;
                    break;
                case 3:
                    var10005 = 65;
                    break;
                default:
                    var10005 = 28;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
