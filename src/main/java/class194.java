import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public abstract class class194 extends class46 {

    @OriginalMember(owner = "client!r", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2611 = new String[] { method1660(method1659("Z\u0003\u0003\u0015")), method1660(method1659("Z\u0003\r\u0015")), method1660(method1659("Z\u0003\f\u0015")), method1660(method1659("FX'Q")), method1660(method1659("S\u0003e\u0013-")) };

    @OriginalMember(owner = "client!r", name = "v", descriptor = "I")
    public static int field2605 = 0;

    @OriginalMember(owner = "client!r", name = "x", descriptor = "Ljh;")
    public static class169 field2608 = new class169();

    @OriginalMember(owner = "client!r", name = "s", descriptor = "Ljava/lang/String;")
    public static String field2609 = "";

    @OriginalMember(owner = "client!r", name = "w", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!r", name = "r", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!r", name = "t", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!r", name = "u", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(B)I", line = 3)
    public static final int method1656(byte arg0) {
        try {
            field2607++;
            if (class151.field1867 == null) {
                return 0;
            } else {
                if (arg0 != 99) {
                    method1656((byte) 117);
                }
                return class151.field1867.length * 2;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field2611[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lha;Lcn;IBI)V", line = 19)
    public static final void method1657(class66 arg0, class541 arg1, int arg2, byte arg3, int arg4) {
        try {
            field2606++;
            byte var5 = 63;
            if (arg3 < -2) {
                byte var6 = 7;
                for (int var7 = 63; var7 >= 0; var7--) {
                    int var8 = var5 & 0x7F | (var7 & 0x3F) << 10 | (var6 & 0x7) << 7;
                    class624.method4635(false, -17200, true);
                    int var9 = class172.field2403[var8];
                    class223.method1937(true, -9743, false);
                    arg0.method556(arg4, ((63 - var7) * arg1.field8045 >> 6) + arg2, arg1.field8029, (arg1.field8045 >> 6) + 1, var9, 0);
                }
            }
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field2611[2] + (arg0 == null ? field2611[3] : field2611[4]) + ',' + (arg1 == null ? field2611[3] : field2611[4]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(B)V", line = 52)
    public static void method1658(byte arg0) {
        try {
            int var1 = -53 / ((arg0 + 71) / 40);
            field2608 = null;
            field2609 = null;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field2611[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!r", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1659(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x50);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!r", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1660(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 40;
                    break;
                case 1:
                    var10005 = 45;
                    break;
                case 2:
                    var10005 = 75;
                    break;
                case 3:
                    var10005 = 61;
                    break;
                default:
                    var10005 = 80;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
