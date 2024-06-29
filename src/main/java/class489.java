import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class489 extends class357 implements class407 {

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    private int field7030;

    @OriginalMember(owner = "client!bg", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7031 = new String[] { method3706(method3705("\u000f\\#\u0000O\u0003Ry\u0002\u000e")), method3706(method3705("\u0016\u0015#\u0012[")), method3706(method3705("\u0003NaP")), method3706(method3705("\u000f\\#\u007f\u000e")), method3706(method3705("\u000f\\#y\u000e")), method3706(method3705("\u000f\\#~\u000e")), method3706(method3705("\u000f\\#x\u000e")), method3706(method3705("\u000f\\#}\u000e")) };

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "Ljava/lang/String;")
    public static String field7027 = "";

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "I")
    public static int field7025;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
    public static int field7026;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public static int field7028;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    public static int field7029;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "Lla;")
    public static class476 field7024;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(BI[BI)V")
    public final void method3186(byte arg0, int arg1, byte[] arg2, int arg3) {
        try {
            this.method2920(arg2, arg3);
            ++field7025;
            if (arg0 == -82) {
                this.field7030 = arg1;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field7031[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7031[1] : field7031[2]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Lffa;I[BI)V")
    public class489(class197 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        try {
            this.field7030 = arg1;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field7031[0] + (arg0 != null ? field7031[1] : field7031[2]) + ',' + arg1 + ',' + (arg2 != null ? field7031[1] : field7031[2]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)I")
    public final int method3185(byte arg0) {
        try {
            ++field7029;
            return arg0 > -126 ? 45 : this.field7030;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field7031[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)I")
    public final int method3184(int arg0) {
        try {
            if (arg0 != -24909) {
                this.field7030 = 47;
            }
            ++field7028;
            return 0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field7031[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(B)J")
    public final long method3187(byte arg0) {
        try {
            ++field7026;
            int var2 = -70 / ((arg0 - 91) / 33);
            return super.field5478.getAddress();
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field7031[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)V")
    public static void method3704(int arg0) {
        try {
            if (arg0 >= -32) {
                field7024 = null;
            }
            field7024 = null;
            field7027 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7031[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Lffa;ILjaclib/memory/Buffer;)V")
    public class489(class197 arg0, int arg1, Buffer arg2) {
        super(arg0, arg2);
        try {
            this.field7030 = arg1;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field7031[0] + (arg0 != null ? field7031[1] : field7031[2]) + ',' + arg1 + ',' + (arg2 != null ? field7031[1] : field7031[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!bg", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3705(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 38);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bg", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3706(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 109;
                    break;
                case 1:
                    var10005 = 59;
                    break;
                case 2:
                    var10005 = 13;
                    break;
                case 3:
                    var10005 = 60;
                    break;
                default:
                    var10005 = 38;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
