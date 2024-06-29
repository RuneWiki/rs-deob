import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class546 extends class459 {

    @OriginalMember(owner = "client!hv", name = "w", descriptor = "[B")
    public byte[] field8032;

    @OriginalMember(owner = "client!hv", name = "A", descriptor = "[Ljava/lang/String;")
    private static final String[] field8033 = new String[] { method4058(method4057("v@n\\\u0000p_4^A")), method4058(method4057("e\u0018nN\u0014")), method4058(method4057("pC,\f")), method4058(method4057("v@n\"A")), method4058(method4057("v@n!A")) };

    @OriginalMember(owner = "client!hv", name = "v", descriptor = "Lmj;")
    public static class683 field8028 = null;

    @OriginalMember(owner = "client!hv", name = "y", descriptor = "I")
    public static int field8030 = 0;

    @OriginalMember(owner = "client!hv", name = "x", descriptor = "I")
    public static int field8031;

    @OriginalMember(owner = "client!hv", name = "z", descriptor = "Lgda;")
    public static class58 field8029;

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "(B)V", line = 6)
    public static void method4055(byte arg0) {
        try {
            field8028 = null;
            field8029 = null;
            int var1 = -60 % ((arg0 - 81) / 40);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8033[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(BLjava/lang/String;)J", line = 22)
    public static final long method4056(byte arg0, String arg1) {
        try {
            field8031++;
            if (arg0 >= -111) {
                field8028 = null;
            }
            int var2 = arg1.length();
            long var3 = 0L;
            for (int var5 = 0; var5 < var2; var5++) {
                var3 = (long) arg1.charAt(var5) + (var3 << 5) - var3;
            }
            return var3;
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field8033[3] + arg0 + ',' + (arg1 == null ? field8033[2] : field8033[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!hv", name = "<init>", descriptor = "([B)V", line = 43)
    public class546(byte[] arg0) {
        try {
            this.field8032 = arg0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8033[0] + (arg0 == null ? field8033[2] : field8033[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!hv", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4057(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x69);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hv", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4058(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 30;
                    break;
                case 1:
                    var10005 = 54;
                    break;
                case 2:
                    var10005 = 64;
                    break;
                case 3:
                    var10005 = 96;
                    break;
                default:
                    var10005 = 105;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
