import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class419 {

    @OriginalMember(owner = "client!tg", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6034 = new String[] { method3268(method3267("P\u0007BLd")), method3268(method3267("P\u0007BNd")), method3268(method3267("_NB!1")), method3268(method3267("J\u0015\u0000c")), method3268(method3267("P\u0007BMd")) };

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
    public static int field6030;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "I")
    public static int field6031;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
    public static int field6032;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    public static int field6033;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZI)Z")
    public static final boolean method3264(boolean arg0, int arg1) {
        try {
            field6032++;
            if (arg0) {
                field6030 = -107;
            }
            return arg1 == 3 || arg1 == 5 || arg1 == 6;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6034[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(JZ)V")
    public static final void method3265(long arg0, boolean arg1) {
        try {
            if (arg1) {
                field6033++;
                class267.field3791.setTime(new Date(arg0));
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field6034[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "([[II)V")
    public static final void method3266(int[][] arg0, int arg1) {
        try {
            class529.field7682 = arg0;
            if (arg1 >= -35) {
                field6030 = -61;
            }
            field6031++;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6034[1] + (arg0 == null ? field6034[3] : field6034[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tg", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3267(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4C);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!tg", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3268(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 36;
                    break;
                case 1:
                    var10005 = 96;
                    break;
                case 2:
                    var10005 = 108;
                    break;
                case 3:
                    var10005 = 15;
                    break;
                default:
                    var10005 = 76;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
