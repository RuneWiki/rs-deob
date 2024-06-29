import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public class class176 {

    @OriginalMember(owner = "client!at", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2310 = new String[] { method1480(method1479("\u0005d\u0007Gi")), method1480(method1479("\u0010?E\u0005")), method1480(method1479("\u001f>\u0007(<")), method1480(method1479("\u001f>\u0007*<")), method1480(method1479("\u001f>\u0007+<")) };

    @OriginalMember(owner = "client!at", name = "b", descriptor = "[B")
    public static byte[] field2308 = new byte[2048];

    @OriginalMember(owner = "client!at", name = "a", descriptor = "I")
    public static int field2305 = 0;

    @OriginalMember(owner = "client!at", name = "e", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!at", name = "c", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!at", name = "d", descriptor = "Lht;")
    public static class792 field2306;

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Lqo;B)V", line = 7)
    public static final void method1476(class170 arg0, byte arg1) {
        try {
            field2307++;
            if (arg1 >= -112) {
                method1477(16, 83);
            }
            int var2 = arg0.field2237 - class694.field9700;
            int var3 = arg0.field2233 * 512 + arg0.method1437((byte) -28) * 256;
            int var4 = arg0.field2244 * 512 + arg0.method1437((byte) -28) * 256;
            arg0.field2969 += (var3 - arg0.field2969) / var2;
            arg0.field2984 += (var4 - arg0.field2984) / var2;
            arg0.field2262 = 0;
            if (arg0.field2238 == 0) {
                arg0.method1432(16383, 8192);
            }
            if (arg0.field2238 == 1) {
                arg0.method1432(16383, 12288);
            }
            if (arg0.field2238 == 2) {
                arg0.method1432(16383, 0);
            }
            if (arg0.field2238 == 3) {
                arg0.method1432(16383, 4096);
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field2310[2] + (arg0 == null ? field2310[1] : field2310[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(II)V", line = 40)
    public static final void method1477(int arg0, int arg1) {
        try {
            field2309++;
            if (arg1 < 0 || arg1 > 2) {
                arg1 = 0;
            }
            class323.field4403 = arg1;
            if (arg0 != -2379) {
                field2306 = null;
            }
            class703.field9828 = new class464[class532.field7710[class323.field4403] + 1];
            class632.field8975 = 0;
            class550.field8038 = 0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2310[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(I)V", line = 66)
    public static void method1478(int arg0) {
        try {
            field2308 = null;
            field2306 = null;
            int var1 = 39 % ((-arg0 - 67) / 38);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2310[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!at", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1479(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x14);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!at", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1480(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 126;
                    break;
                case 1:
                    var10005 = 74;
                    break;
                case 2:
                    var10005 = 41;
                    break;
                case 3:
                    var10005 = 105;
                    break;
                default:
                    var10005 = 20;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
