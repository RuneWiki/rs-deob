import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class269 {

    @OriginalMember(owner = "client!se", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4103 = new String[] { method2234(method2233("9\r\"k\n")), method2234(method2233("$\u001d`E")), method2234(method2233("gE2\t")), method2234(method2233("1F\"\u0007_")), method2234(method2233(".\u0001~LA>\u0004cNK$H")), method2234(method2233("9\r\"h\n")), method2234(method2233("9\r\"j\n")) };

    @OriginalMember(owner = "client!se", name = "d", descriptor = "Lwq;")
    public static class178 field4096 = new class178(8);

    @OriginalMember(owner = "client!se", name = "a", descriptor = "Lwia;")
    public static class790 field4098 = new class790(40, 16);

    @OriginalMember(owner = "client!se", name = "f", descriptor = "Lel;")
    public static class573 field4099 = new class573(89, -1);

    @OriginalMember(owner = "client!se", name = "g", descriptor = "Lel;")
    public static class573 field4101 = new class573(86, 4);

    @OriginalMember(owner = "client!se", name = "c", descriptor = "I")
    public static int field4095;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "Lfs;")
    public static class581 field4102;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "Lda;")
    public static class67 field4100;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V", line = 4)
    public static void method2230(byte arg0) {
        try {
            field4099 = null;
            if (arg0 != 97) {
                method2230((byte) 34);
            }
            field4098 = null;
            field4101 = null;
            field4100 = null;
            field4096 = null;
            field4102 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4103[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;", line = 30)
    public static final String method2231(String arg0, boolean arg1) {
        try {
            field4097++;
            String var2 = null;
            int var3 = arg0.indexOf(field4103[2]);
            if (var3 >= 0) {
                var2 = arg0.substring(0, var3 + 4);
                arg0 = arg0.substring(var3 + 4);
            }
            if (!arg1) {
                method2230((byte) 127);
            }
            if (arg0.startsWith(field4103[4])) {
                int var4 = arg0.indexOf(" ", field4103[4].length());
                if (var4 >= 0) {
                    int var5 = arg0.length();
                    arg0 = arg0.substring(0, var4) + " ";
                    for (int var6 = var4 + 1; var6 < var5; var6++) {
                        arg0 = arg0 + "*";
                    }
                }
            }
            return var2 == null ? arg0 : var2 + arg0;
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field4103[5] + (arg0 == null ? field4103[1] : field4103[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(II)Z", line = 96)
    public static final boolean method2232(int arg0, int arg1) {
        try {
            if (arg1 == 25062) {
                field4095++;
                return arg0 >= 4 && arg0 <= 8;
            } else {
                return true;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4103[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!se", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2233(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x22);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!se", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2234(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 74;
                    break;
                case 1:
                    var10005 = 104;
                    break;
                case 2:
                    var10005 = 12;
                    break;
                case 3:
                    var10005 = 41;
                    break;
                default:
                    var10005 = 34;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
