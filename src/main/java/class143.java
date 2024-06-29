import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class143 {

    @OriginalMember(owner = "client!wf", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2032 = new String[] { method1330(method1329("\u0005=\u0012\u0014\u0006")), method1330(method1329("\u0005=\u0012\u0015\u0006")), method1330(method1329("\u0005=\u0012\u0017\u0006")) };

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
    public static int field2028 = 1;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "I")
    public static int field2029;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIBII)Z", line = 7)
    public static final boolean method1326(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        try {
            if (arg2 < 52) {
                return true;
            }
            field2030++;
            if (!class382.field6142 || !class147.field2062) {
                return false;
            } else if (class74.field1066 < 100) {
                return false;
            } else if (class527.method3934(-112, arg1, arg3, arg0)) {
                int var5 = arg1 << class165.field2688;
                int var6 = arg0 << class165.field2688;
                if (class213.method1919(var5, -115, class152.field2131, class740.field10902[arg3].method2495(arg0, 1, arg1), class152.field2131, var6, arg4)) {
                    class77.field1189++;
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field2032[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)Z", line = 43)
    public static final boolean method1327(int arg0, int arg1) {
        try {
            field2031++;
            int var2 = -75 / ((arg0 + 85) / 40);
            return arg1 != 1 && arg1 != 7;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2032[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIBI)I", line = 55)
    public static final int method1328(int arg0, int arg1, byte arg2, int arg3) {
        try {
            field2029++;
            if (arg0 == arg1) {
                return arg0;
            }
            if (arg2 != 24) {
                method1327(124, -60);
            }
            int var4 = 128 - arg3;
            int var5 = (arg0 & 0x7F) * var4 + ((arg1 & 0x7F) * arg3) >> 7;
            int var6 = (arg0 & 0x380) * var4 + (arg1 & 0x380) * arg3 >> 7;
            int var7 = (arg0 & 0xFC00) * var4 + (arg1 & 0xFC00) * arg3 >> 7;
            return var5 & 0x7F | var6 & 0x380 | var7 & 0xFC00;
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field2032[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!wf", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1329(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wf", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1330(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 114;
                    break;
                case 1:
                    var10005 = 91;
                    break;
                case 2:
                    var10005 = 60;
                    break;
                case 3:
                    var10005 = 86;
                    break;
                default:
                    var10005 = 46;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
