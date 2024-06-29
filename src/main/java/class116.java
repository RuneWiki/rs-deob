import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jja")
public class class116 {

    @OriginalMember(owner = "client!jja", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1699 = new String[] { method1153(method1152("`\fwX(\"")), method1153(method1152("qH8X\u0017")), method1153(method1152("d\u0013z\u001a")), method1153(method1152("`\fwX+\"")), method1153(method1152("`\fwX.\"")), method1153(method1152("`\fwX)\"")) };

    @OriginalMember(owner = "client!jja", name = "e", descriptor = "Luo;")
    public static class603 field1694 = null;

    @OriginalMember(owner = "client!jja", name = "b", descriptor = "I")
    public static int field1695 = -1;

    @OriginalMember(owner = "client!jja", name = "a", descriptor = "[I")
    public static int[] field1698 = new int[4096];

    @OriginalMember(owner = "client!jja", name = "d", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!jja", name = "g", descriptor = "I")
    public static int field1693;

    @OriginalMember(owner = "client!jja", name = "f", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!jja", name = "c", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!jja", name = "a", descriptor = "(I)V")
    public static void method1148(int arg0) {
        try {
            if (arg0 != -1) {
                field1698 = null;
            }
            field1698 = null;
            field1694 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field1699[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jja", name = "a", descriptor = "(III)V")
    public static final void method1149(int arg0, int arg1, int arg2) {
        try {
            field1692++;
            class398.field6302++;
            class487 var3 = class618.method4519(33, class433.field6806, class185.field2948.field2659);
            if (arg1 != -28059) {
                method1150(null, false, null);
            }
            var3.field7362.method1631(arg0, -25924);
            var3.field7362.method1638(arg2, 105);
            class185.field2948.method1546(var3, arg1 ^ 0xFFFF9264);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field1699[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!jja", name = "a", descriptor = "([SZ[Ljava/lang/String;)V")
    public static final void method1150(short[] arg0, boolean arg1, String[] arg2) {
        try {
            if (arg1) {
                field1698 = null;
            }
            field1696++;
            class101.method953(arg0, 28707, arg2.length - 1, 0, arg2);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field1699[0] + (arg0 == null ? field1699[2] : field1699[1]) + ',' + arg1 + ',' + (arg2 == null ? field1699[2] : field1699[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!jja", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1151(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            if (arg0 == 4096) {
                class231.field3580 = arg2;
                class199.field3153 = arg4;
                class576.field8308 = arg3;
                class153.field2136 = arg1;
                class793.field11592 = arg5;
                class549.field8059 = arg6;
                field1697++;
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field1699[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!jja", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1152(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jja", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1153(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 10;
                    break;
                case 1:
                    var10005 = 102;
                    break;
                case 2:
                    var10005 = 22;
                    break;
                case 3:
                    var10005 = 118;
                    break;
                default:
                    var10005 = 106;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
