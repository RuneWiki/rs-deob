import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class722 {

    @OriginalMember(owner = "client!bf", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10284 = new String[] { method5228(method5227("Z\u0002Y~\u000e")), method5228(method5227("Z\u0002Y\u007f\u000e")), method5228(method5227("Z\u0002Y}\u000e")) };

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "Lmv;")
    public static class125 field10280 = new class125(20, 2);

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "Z")
    public static boolean field10283 = false;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "Lsb;")
    public static class261 field10281 = new class261(0, 9);

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
    public static int field10276;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "I")
    public static int field10279;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "Lde;")
    public static class265 field10274;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "[B")
    public byte[] field10278;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "[S")
    public short[] field10275;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "[S")
    public short[] field10277;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "[S")
    public short[] field10282;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)V")
    public static final void method5224(int arg0, int arg1) {
        try {
            if (arg1 == 37) {
                class534.field7740 = 3.0F;
            } else if (arg1 == 50) {
                class534.field7740 = 4.0F;
            } else if (arg1 == 75) {
                class534.field7740 = 6.0F;
            } else if (arg1 == 100) {
                class534.field7740 = 8.0F;
            } else if (arg1 == 200) {
                class534.field7740 = 16.0F;
            }
            field10276++;
            class801.field11652 = -1;
            class801.field11652 = -1;
            int var2 = 68 % ((35 - arg0) / 52);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field10284[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)[Llf;")
    public static final class260[] method5225(boolean arg0) {
        try {
            field10279++;
            return arg0 ? new class260[] { class592.field8525, class592.field8526, class279.field3939, class648.field9207, class720.field10253, class444.field6551, class660.field9367, class208.field3033, class288.field4073, class97.field1306, class444.field6549, class382.field5572, class409.field5913, class692.field9681, class507.field7432 } : null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field10284[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V")
    public static void method5226(int arg0) {
        try {
            if (arg0 < 73) {
                field10281 = null;
            }
            field10281 = null;
            field10274 = null;
            field10280 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field10284[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bf", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5227(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x26);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bf", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5228(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 56;
                    break;
                case 1:
                    var10005 = 100;
                    break;
                case 2:
                    var10005 = 119;
                    break;
                case 3:
                    var10005 = 60;
                    break;
                default:
                    var10005 = 38;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
