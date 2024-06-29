import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class568 implements class250 {

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "Lla;")
    private class476 field8405;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "Ljava/lang/String;")
    private String field8411;

    @OriginalMember(owner = "client!lb", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8412 = new String[] { method4248(method4247("\u0003A-\b#")), method4248(method4247("\u0003A-\t#")), method4248(method4247("\u0003A-vb\u0001Jwt#")), method4248(method4247("\u0001Vo&")), method4248(method4247("\u0014\r-dv")), method4248(method4247("\u0003A-\u000e#")), method4248(method4247("\u0003A-\u000b#")) };

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "J")
    public static long field8407 = -1L;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public static int field8403 = 64;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "[[I")
    public static int[][] field8409 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
    public static int field8404;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
    public static int field8406;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
    public static int field8408;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "Ljava/lang/Object;")
    public static Object field8410;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "Z")
    public static boolean field8402;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)Lud;")
    public final class39 method671(int arg0) {
        try {
            field8408++;
            int var2 = -24 % ((arg0 + 46) / 56);
            return class39.field454;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field8412[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(III)Z")
    public static final boolean method4245(int arg0, int arg1, int arg2) {
        try {
            field8406++;
            if (arg2 <= 71) {
                method4246(112);
            }
            return (arg1 & 0x20) != 0;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field8412[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)I")
    public final int method670(int arg0) {
        try {
            if (arg0 != 18366) {
                this.method670(53);
            }
            field8404++;
            return this.field8405.method3639(-36, this.field8411) ? 100 : 0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field8412[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)V")
    public static void method4246(int arg0) {
        try {
            field8410 = null;
            if (arg0 != -6271) {
                method4246(2);
            }
            field8409 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field8412[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lla;Ljava/lang/String;)V")
    public class568(class476 arg0, String arg1) {
        try {
            this.field8405 = arg0;
            this.field8411 = arg1;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field8412[2] + (arg0 == null ? field8412[3] : field8412[4]) + ',' + (arg1 == null ? field8412[3] : field8412[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!lb", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4247(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xB);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!lb", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4248(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 111;
                    break;
                case 1:
                    var10005 = 35;
                    break;
                case 2:
                    var10005 = 3;
                    break;
                case 3:
                    var10005 = 74;
                    break;
                default:
                    var10005 = 11;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
