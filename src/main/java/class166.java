import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wea")
public class class166 extends RuntimeException {

    @OriginalMember(owner = "client!wea", name = "j", descriptor = "Ljava/lang/String;")
    public String field2286;

    @OriginalMember(owner = "client!wea", name = "b", descriptor = "Ljava/lang/Throwable;")
    public Throwable field2284;

    @OriginalMember(owner = "client!wea", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2292 = new String[] { method1483(method1482("\u0001S\u00127\u0005^")), method1483(method1482("\u0018C\u001fu")), method1483(method1482("\u0001S\u00127\u0004^")), method1483(method1482("\r\u0018]7;")), method1483(method1482("\u0001S\u00127\u0002^")) };

    @OriginalMember(owner = "client!wea", name = "h", descriptor = "Lel;")
    public static class573 field2287 = new class573(132, -1);

    @OriginalMember(owner = "client!wea", name = "g", descriptor = "Ldv;")
    public static class685 field2288 = new class685(1, 2, 2, 0);

    @OriginalMember(owner = "client!wea", name = "c", descriptor = "I")
    public static int field2291 = 0;

    @OriginalMember(owner = "client!wea", name = "d", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!wea", name = "i", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!wea", name = "f", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!wea", name = "e", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "Lla;")
    public static class476 field2289;

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(B)V", line = 4)
    public static final void method1478(byte arg0) {
        try {
            if (arg0 != 18) {
                method1478((byte) -10);
            }
            field2282++;
            class130.field1524.method1559(arg0 - 18);
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field2292[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(Z)V", line = 15)
    public static void method1479(boolean arg0) {
        field2287 = null;
        field2289 = null;
        field2288 = null;
        if (!arg0) {
            method1478((byte) -72);
        }
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(II)Ljava/lang/String;", line = 27)
    public static final String method1480(int arg0, int arg1) {
        try {
            if (arg0 != 1) {
                method1479(false);
            }
            field2285++;
            return (arg1 >> 24 & 0xFF) + "." + (arg1 >> 16 & 0xFF) + "." + (arg1 >> 8 & 0xFF) + "." + (arg1 & 0xFF);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field2292[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(I[BIIZI)V", line = 39)
    public static final void method1481(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4, int arg5) {
        try {
            field2290++;
            if (arg3 < arg2) {
                arg0 += arg3;
                int var14 = arg2 - arg3 >> 2;
                if (arg4) {
                    field2289 = null;
                }
                while (true) {
                    var14--;
                    if (var14 < 0) {
                        var14 = arg2 - arg3 & 0x3;
                        while (true) {
                            var14--;
                            if (var14 < 0) {
                                return;
                            }
                            arg1[arg0++] = 1;
                        }
                    }
                    int var8 = arg0 + 1;
                    arg1[arg0] = 1;
                    int var9 = var8 + 1;
                    arg1[var8] = 1;
                    int var10 = var9 + 1;
                    arg1[var9] = 1;
                    arg0 = var10 + 1;
                    arg1[var10] = 1;
                }
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field2292[2] + arg0 + ',' + (arg1 == null ? field2292[1] : field2292[3]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!wea", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 72)
    public class166(Throwable arg0, String arg1) {
        this.field2286 = arg1;
        this.field2284 = arg0;
    }

    @OriginalMember(owner = "client!wea", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1482(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x46);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wea", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1483(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 118;
                    break;
                case 1:
                    var10005 = 54;
                    break;
                case 2:
                    var10005 = 115;
                    break;
                case 3:
                    var10005 = 25;
                    break;
                default:
                    var10005 = 70;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
