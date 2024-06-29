import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class405 {

    @OriginalMember(owner = "client!bp", name = "e", descriptor = "Lla;")
    private class476 field6039;

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "I")
    public int field6038;

    @OriginalMember(owner = "client!bp", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6043 = new String[] { method3183(method3182("\u0015S#V)")), method3183(method3182("\u0000\ba\u0014")), method3183(method3182("\f\r#D=\u0000\u0014yF|")), method3183(method3182("\f\r#9|")) };

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "Lel;")
    public static class573 field6040 = new class573(67, 3);

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "I")
    public static int field6042 = 0;

    @OriginalMember(owner = "client!bp", name = "d", descriptor = "I")
    public static int field6041;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(B)V")
    public static void method3181(byte arg0) {
        try {
            if (arg0 != 26) {
                field6041 = -36;
            }
            field6040 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field6043[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Lto;ILla;)V")
    public class405(class8 arg0, int arg1, class476 arg2) {
        new class178(64);
        try {
            this.field6039 = arg2;
            this.field6038 = this.field6039.method3646(15, (byte) -112);
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field6043[2] + (arg0 == null ? field6043[1] : field6043[0]) + ',' + arg1 + ',' + (arg2 == null ? field6043[1] : field6043[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3182(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x54);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bp", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3183(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 110;
                    break;
                case 1:
                    var10005 = 125;
                    break;
                case 2:
                    var10005 = 13;
                    break;
                case 3:
                    var10005 = 120;
                    break;
                default:
                    var10005 = 84;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
