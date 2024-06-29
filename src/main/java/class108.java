import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iw")
public class class108 {

    @OriginalMember(owner = "client!iw", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1424 = new String[] { method1026(method1025("{7%v'")), method1026(method1025("{7%t'")), method1026(method1025("{7%w'")) };

    @OriginalMember(owner = "client!iw", name = "d", descriptor = "I")
    public static int field1420 = -1;

    @OriginalMember(owner = "client!iw", name = "i", descriptor = "[[Z")
    public static boolean[][] field1421 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "Lsb;")
    public static class261 field1417 = new class261(134, 6);

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "I")
    public int field1415;

    @OriginalMember(owner = "client!iw", name = "c", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!iw", name = "g", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!iw", name = "f", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!iw", name = "e", descriptor = "Ltb;")
    public static class392 field1416;

    @OriginalMember(owner = "client!iw", name = "h", descriptor = "Ljava/lang/String;")
    public String field1418;

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(I)V")
    public static void method1022(int arg0) {
        try {
            int var1 = -111 / ((arg0 + 26) / 48);
            field1416 = null;
            field1417 = null;
            field1421 = null;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1424[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(II)Z")
    public static final boolean method1023(int arg0, int arg1) {
        try {
            field1422++;
            int var2 = -94 % ((84 - arg0) / 37);
            return arg1 == 0 || arg1 == 1 || arg1 == 2;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field1424[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(B)I")
    public static final int method1024(byte arg0) {
        try {
            field1423++;
            if (arg0 != 69) {
                method1023(-70, 125);
            }
            return class255.field3665;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field1424[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!iw", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1025(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xF);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!iw", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1026(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 18;
                    break;
                case 1:
                    var10005 = 64;
                    break;
                case 2:
                    var10005 = 11;
                    break;
                case 3:
                    var10005 = 53;
                    break;
                default:
                    var10005 = 15;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
