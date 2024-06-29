import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uca")
public class class540 extends class698 {

    @OriginalMember(owner = "client!uca", name = "l", descriptor = "I")
    private int field7959;

    @OriginalMember(owner = "client!uca", name = "i", descriptor = "I")
    private int field7964;

    @OriginalMember(owner = "client!uca", name = "n", descriptor = "I")
    private int field7963;

    @OriginalMember(owner = "client!uca", name = "o", descriptor = "I")
    private int field7956;

    @OriginalMember(owner = "client!uca", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7966 = new String[] { method4026(method4025("\u00119\u001c]k\r4\u0014\u0007iL")), method4026(method4025("\u00119\u001c]\u0011L")), method4026(method4025("\u00119\u001c]\u0014L")), method4026(method4025("\u00119\u001c]\u0016L")), method4026(method4025("\u00119\u001c]\u0010L")) };

    @OriginalMember(owner = "client!uca", name = "q", descriptor = "Z")
    public static boolean field7961 = true;

    @OriginalMember(owner = "client!uca", name = "g", descriptor = "Lgd;")
    public static class358 field7955 = null;

    @OriginalMember(owner = "client!uca", name = "h", descriptor = "[I")
    public static int[] field7965 = new int[3];

    @OriginalMember(owner = "client!uca", name = "k", descriptor = "I")
    public static int field7957;

    @OriginalMember(owner = "client!uca", name = "p", descriptor = "I")
    public static int field7960;

    @OriginalMember(owner = "client!uca", name = "m", descriptor = "I")
    public static int field7962;

    @OriginalMember(owner = "client!uca", name = "j", descriptor = "Lgda;")
    public static class58 field7958;

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(ZII)V", line = 6)
    public final void method965(boolean arg0, int arg1, int arg2) {
        try {
            if (arg0) {
                this.field7964 = 42;
            }
            ++field7960;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field7966[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(IIB)V", line = 20)
    public final void method964(int arg0, int arg1, byte arg2) {
        try {
            ++field7962;
            int var4 = this.field7956 * arg0 >> 12;
            int var5 = this.field7963 * arg0 >> 12;
            if (arg2 == -66) {
                int var6 = this.field7964 * arg1 >> 12;
                int var7 = this.field7959 * arg1 >> 12;
                class173.method1595(var6, super.field10051, var4, var5, -22692, super.field10052, super.field10050, var7);
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field7966[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(III)V", line = 39)
    public final void method967(int arg0, int arg1, int arg2) {
        try {
            ++field7957;
            int var4 = this.field7956 * arg1 >> 12;
            int var5 = this.field7963 * arg1 >> 12;
            int var6 = this.field7964 * arg2 >> 12;
            int var7 = this.field7959 * arg2 >> 12;
            class393.method3194(var4, super.field10051, var6, var7, arg0 ^ arg0, var5);
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field7966[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!uca", name = "<init>", descriptor = "(IIIIIII)V", line = 61)
    public class540(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        try {
            this.field7959 = arg3;
            this.field7964 = arg1;
            this.field7963 = arg2;
            this.field7956 = arg0;
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field7966[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(B)V", line = 73)
    public static void method4024(byte arg0) {
        try {
            if (arg0 == 104) {
                field7965 = null;
                field7958 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7966[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uca", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4025(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 87);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!uca", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4026(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 100;
                    break;
                case 1:
                    var10005 = 90;
                    break;
                case 2:
                    var10005 = 125;
                    break;
                case 3:
                    var10005 = 115;
                    break;
                default:
                    var10005 = 87;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
