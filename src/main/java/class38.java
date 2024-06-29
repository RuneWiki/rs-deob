import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kha")
public class class38 {

    @OriginalMember(owner = "client!kha", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field598 = new String[] { method446(method445("n<>&E-")), method446(method445("n<>&F-")) };

    @OriginalMember(owner = "client!kha", name = "b", descriptor = "[I")
    public static int[] field596 = new int[500];

    @OriginalMember(owner = "client!kha", name = "c", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!kha", name = "d", descriptor = "Llga;")
    public static class47 field594;

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(Z)I")
    public static final int method443(boolean arg0) {
        try {
            field597++;
            if (class101.field1360 == 1) {
                return class5.field63;
            } else {
                if (!arg0) {
                    method444((byte) 13);
                }
                return class63.field971;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field598[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(B)V")
    public static void method444(byte arg0) {
        try {
            if (arg0 == 31) {
                field596 = null;
                field594 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field598[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kha", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method445(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kha", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method446(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 5;
                    break;
                case 1:
                    var10005 = 84;
                    break;
                case 2:
                    var10005 = 95;
                    break;
                case 3:
                    var10005 = 8;
                    break;
                default:
                    var10005 = 7;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
