import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class419 extends class568 {

    @OriginalMember(owner = "client!mt", name = "l", descriptor = "Ljava/lang/String;")
    public String field6627;

    @OriginalMember(owner = "client!mt", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6629 = new String[] { method3343(method3342("$=\u000e\u0004C")), method3343(method3342("$=\u000e\u0007C")), method3343(method3342("$=\u000ez\u0002' TxC")), method3343(method3342("2g\u000eh\u0016")), method3343(method3342("'<L*")) };

    @OriginalMember(owner = "client!mt", name = "n", descriptor = "Lhl;")
    public static class556 field6626 = new class556(20, -1);

    @OriginalMember(owner = "client!mt", name = "m", descriptor = "I")
    public static int field6628;

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(I)V", line = 4)
    public static void method3340(int arg0) {
        try {
            field6626 = null;
            if (arg0 > -55) {
                method3341((byte) 41);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6629[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(B)I", line = 16)
    public static final int method3341(byte arg0) {
        try {
            if (arg0 != 121) {
                method3340(-54);
            }
            field6628++;
            return class708.field10197++;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6629[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mt", name = "<init>", descriptor = "()V", line = 30)
    public class419() {
    }

    @OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 37)
    public class419(String arg0, int arg1) {
        try {
            this.field6627 = arg0;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6629[2] + (arg0 == null ? field6629[4] : field6629[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mt", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3342(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!mt", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3343(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 73;
                    break;
                case 1:
                    var10005 = 73;
                    break;
                case 2:
                    var10005 = 32;
                    break;
                case 3:
                    var10005 = 70;
                    break;
                default:
                    var10005 = 107;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
