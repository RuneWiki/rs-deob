import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public class class550 {

    @OriginalMember(owner = "client!baa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8071 = new String[] { method4084(method4083("8kM Mr")), method4084(method4083("8kM Nr")) };

    @OriginalMember(owner = "client!baa", name = "g", descriptor = "Z")
    public static boolean field8069 = false;

    @OriginalMember(owner = "client!baa", name = "e", descriptor = "I")
    public static int field8068 = 0;

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "I")
    public static int field8064 = -1;

    @OriginalMember(owner = "client!baa", name = "b", descriptor = "I")
    public static int field8066;

    @OriginalMember(owner = "client!baa", name = "f", descriptor = "Ljt;")
    public static class110 field8067;

    @OriginalMember(owner = "client!baa", name = "c", descriptor = "Leg;")
    public static class114 field8070;

    @OriginalMember(owner = "client!baa", name = "d", descriptor = "Lgda;")
    public static class58 field8065;

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(Z)V")
    public static final void method4081(boolean arg0) {
        try {
            if (arg0) {
                field8066++;
                for (class670 var1 = (class670) class700.field10071.method735(0); var1 != null; var1 = (class670) class700.field10071.method734((byte) -50)) {
                    if (var1.field9521) {
                        var1.field9521 = false;
                    } else {
                        class650.method4741(var1.field9523, (byte) 103);
                    }
                }
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8071[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(B)V")
    public static void method4082(byte arg0) {
        try {
            field8065 = null;
            field8067 = null;
            field8070 = null;
            int var1 = -97 / ((arg0 - 65) / 47);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8071[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!baa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4083(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xF);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!baa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4084(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 90;
                    break;
                case 1:
                    var10005 = 10;
                    break;
                case 2:
                    var10005 = 44;
                    break;
                case 3:
                    var10005 = 14;
                    break;
                default:
                    var10005 = 15;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
