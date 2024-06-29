import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cfa")
public class class179 {

    @OriginalMember(owner = "client!cfa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2494 = new String[] { method1577(method1576("\u0005'U?{N")), method1577(method1576("\u0005'U?xN")), method1577(method1576("\u0005'U?zN")) };

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "[I")
    public static int[] field2491 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!cfa", name = "c", descriptor = "Lwia;")
    public static class790 field2490 = new class790(76, 0);

    @OriginalMember(owner = "client!cfa", name = "b", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!cfa", name = "e", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!cfa", name = "f", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!cfa", name = "d", descriptor = "I")
    public static int field2493;

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(BI)Z")
    public static final boolean method1573(byte arg0, int arg1) {
        try {
            if (arg0 < 28) {
                field2490 = null;
            }
            field2492++;
            return arg1 == 10 || arg1 == 11 || arg1 == 12;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field2494[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(I)V")
    public static void method1574(int arg0) {
        try {
            field2490 = null;
            field2491 = null;
            if (arg0 != -8995) {
                method1575(-106, 31, 110, (byte) 4, -125);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field2494[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IIIBI)V")
    public static final void method1575(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        try {
            field2488++;
            int var5 = class547.field8168;
            if (var5 != 0) {
                if (var5 == 1) {
                    class125.field1471 = arg1;
                    class472.field6855 = arg4;
                    class547.field8168 = 2;
                    class726.field10498 = arg0;
                    class717.field10372 = arg2;
                } else if (var5 == 2) {
                    if (arg0 < class726.field10498) {
                        class726.field10498 = arg0;
                    }
                    if (arg4 < class472.field6855) {
                        class472.field6855 = arg4;
                    }
                    if (arg1 > class125.field1471) {
                        class125.field1471 = arg1;
                    }
                    if (arg2 > class717.field10372) {
                        class717.field10372 = arg2;
                    }
                } else if (arg3 != 32) {
                    method1575(30, -94, -29, (byte) 120, 120);
                }
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field2494[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!cfa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1576(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x39);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!cfa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1577(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 102;
                    break;
                case 1:
                    var10005 = 65;
                    break;
                case 2:
                    var10005 = 52;
                    break;
                case 3:
                    var10005 = 17;
                    break;
                default:
                    var10005 = 57;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
