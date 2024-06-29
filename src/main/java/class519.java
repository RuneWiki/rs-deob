import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mw")
public class class519 {

    @OriginalMember(owner = "client!mw", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7689 = new String[] { method3895(method3894("y\bw\u0006\u0016")), method3895(method3894("oQwiC")), method3895(method3894("z\n5+")), method3895(method3894("y\bw\u0005\u0016")), method3895(method3894("y\bw\u0003\u0016")), method3895(method3894("y\bw\u0004\u0016")) };

    @OriginalMember(owner = "client!mw", name = "b", descriptor = "Lhl;")
    public static class556 field7686 = new class556(11, -2);

    @OriginalMember(owner = "client!mw", name = "e", descriptor = "Z")
    public static boolean field7688 = false;

    @OriginalMember(owner = "client!mw", name = "c", descriptor = "I")
    public static int field7682;

    @OriginalMember(owner = "client!mw", name = "f", descriptor = "I")
    public static int field7683;

    @OriginalMember(owner = "client!mw", name = "g", descriptor = "I")
    public static int field7684;

    @OriginalMember(owner = "client!mw", name = "d", descriptor = "I")
    public static int field7685;

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "Lbk;")
    public static class396 field7687;

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(B)V", line = 7)
    public static final void method3890(byte arg0) {
        try {
            class360.field5814 = null;
            class274.field4397 = null;
            class193.field3046 = null;
            class324.field5254 = null;
            class513.field7596 = null;
            class333.field5446 = null;
            class632.field9085 = null;
            class213.field3367 = null;
            field7683++;
            class461.field7108 = null;
            class355.field5718 = null;
            class351.field5676 = null;
            class766.field11219 = null;
            class429.field6757 = null;
            class539.field7916 = null;
            class166.field2694 = null;
            if (arg0 <= 59) {
                method3892(null, 5, -86, false);
            }
            class159.field2327 = null;
            class425.field6689 = null;
            class486.field7353 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7689[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(III)Z", line = 45)
    public static final boolean method3891(int arg0, int arg1, int arg2) {
        try {
            field7684++;
            boolean var3 = (arg0 & 0x37) == 0 ? class157.method1412(arg2, arg0, (byte) 127) : class662.method4807(arg2, (byte) 109, arg0);
            if (arg1 != 48) {
                method3890((byte) 65);
            }
            return var3 | class647.method4711((byte) -76, arg0, arg2) | (arg2 & 0x10000) != 0;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field7689[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(Ldp;IIZ)J", line = 62)
    public static final long method3892(class3 arg0, int arg1, int arg2, boolean arg3) {
        try {
            field7682++;
            if (arg3) {
                return -15L;
            }
            long var4 = 4194304L;
            long var6 = Long.MIN_VALUE;
            class362 var8 = class370.field5999.method4002(-96, arg0.method32((byte) -95));
            long var9 = (long) (arg2 << 7 | arg1 | arg0.method34(16388) << 14 | arg0.method35((byte) -55) << 20 | 0x40000000);
            if (var8.field5843 == 0) {
                var9 |= var6;
            }
            if (var8.field5834 == 1) {
                var9 |= var4;
            }
            return var9 | (long) arg0.method32((byte) -95) << 32;
        } catch (RuntimeException var14) {
            throw class590.method4333(var14, field7689[0] + (arg0 == null ? field7689[2] : field7689[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!mw", name = "b", descriptor = "(B)V", line = 90)
    public static void method3893(byte arg0) {
        try {
            field7687 = null;
            field7686 = null;
            if (arg0 < 22) {
                method3893((byte) 85);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7689[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mw", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3894(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!mw", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3895(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 20;
                    break;
                case 1:
                    var10005 = 127;
                    break;
                case 2:
                    var10005 = 89;
                    break;
                case 3:
                    var10005 = 71;
                    break;
                default:
                    var10005 = 62;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
