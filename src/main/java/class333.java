import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iw")
public class class333 {

    @OriginalMember(owner = "client!iw", name = "i", descriptor = "Ljava/lang/String;")
    public String field5447;

    @OriginalMember(owner = "client!iw", name = "d", descriptor = "Ljava/lang/String;")
    public String field5439;

    @OriginalMember(owner = "client!iw", name = "f", descriptor = "Ljava/lang/String;")
    public String field5445;

    @OriginalMember(owner = "client!iw", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5448 = new String[] { method2816(method2815("Wt#u0")), method2816(method2815("E-#g$B3yee")), method2816(method2815("B/a7")), method2816(method2815("E-#\u0018e")), method2816(method2815("E-#\u0019e")), method2816(method2815("E-#\u001ae")) };

    @OriginalMember(owner = "client!iw", name = "c", descriptor = "Lvn;")
    public static class330 field5441 = new class330(17, 8);

    @OriginalMember(owner = "client!iw", name = "e", descriptor = "I")
    public static int field5440;

    @OriginalMember(owner = "client!iw", name = "h", descriptor = "I")
    public static int field5442;

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "I")
    public static int field5444;

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "[Lhk;")
    public static class107[] field5446;

    @OriginalMember(owner = "client!iw", name = "g", descriptor = "[Lpf;")
    public static class609[] field5443;

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(ZIILgda;III)V", line = 4)
    public static final void method2812(boolean arg0, int arg1, int arg2, class58 arg3, int arg4, int arg5, int arg6) {
        try {
            if (arg2 > 0) {
                class60.field780 = arg0;
                class516.field7614 = 1;
                class32.field389 = arg5;
                class328.field5391 = arg6;
                class787.field11509 = arg3;
                class785.field11466 = arg1;
                class550.field8070 = null;
                class458.field7069 = class350.field5661.method1119(-6) / arg2;
                if (class458.field7069 < 1) {
                    class458.field7069 = 1;
                }
            } else {
                class347.method2901(arg0, arg3, (byte) -86, arg6, arg1, arg5);
            }
            field5442++;
            if (arg4 != -2) {
                field5444 = -123;
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field5448[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field5448[2] : field5448[0]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(BLrd;)V", line = 33)
    public static final void method2813(byte arg0, class355 arg1) {
        try {
            field5440++;
            class784.field11460 = arg1;
            if (arg0 < 8) {
                method2812(true, -39, -104, null, 89, 75, -106);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5448[5] + arg0 + ',' + (arg1 == null ? field5448[2] : field5448[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(I)V", line = 56)
    public static void method2814(int arg0) {
        try {
            int var1 = 39 / ((-arg0 - 87) / 39);
            field5443 = null;
            field5446 = null;
            field5441 = null;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5448[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!iw", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", line = 67)
    public class333(String arg0, String arg1, String arg2) {
        try {
            this.field5447 = arg0;
            this.field5439 = arg2;
            this.field5445 = arg1;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field5448[1] + (arg0 == null ? field5448[2] : field5448[0]) + ',' + (arg1 == null ? field5448[2] : field5448[0]) + ',' + (arg2 == null ? field5448[2] : field5448[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!iw", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2815(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!iw", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2816(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 44;
                    break;
                case 1:
                    var10005 = 90;
                    break;
                case 2:
                    var10005 = 13;
                    break;
                case 3:
                    var10005 = 91;
                    break;
                default:
                    var10005 = 77;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
