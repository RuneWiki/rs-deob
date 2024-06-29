import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public class class60 extends class376 implements class322 {

    @OriginalMember(owner = "client!fw", name = "t", descriptor = "I")
    private int field783;

    @OriginalMember(owner = "client!fw", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field788 = new String[] { method626(method625("\u0015`\u001d\u0017\u0011")), method626(method625("\u0015`\u001diP\u001d~Gk\u0011")), method626(method625("\b9\u001d{D")), method626(method625("\u001db_9")), method626(method625("\u0015`\u001d\u0013\u0011")), method626(method625("\u0015`\u001d\u0010\u0011")), method626(method625("\u0015`\u001d\u0014\u0011")), method626(method625("\u0015`\u001d\u0011\u0011")), method626(method625("\u0015`\u001d\u0016\u0011")) };

    @OriginalMember(owner = "client!fw", name = "l", descriptor = "I")
    public static int field781 = 0;

    @OriginalMember(owner = "client!fw", name = "n", descriptor = "J")
    public static long field785 = -1L;

    @OriginalMember(owner = "client!fw", name = "m", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!fw", name = "r", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!fw", name = "o", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!fw", name = "p", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!fw", name = "u", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "client!fw", name = "q", descriptor = "Lpj;")
    public static class154 field778;

    @OriginalMember(owner = "client!fw", name = "s", descriptor = "Z")
    public static boolean field780;

    @OriginalMember(owner = "client!fw", name = "c", descriptor = "(I)I")
    public final int method619(int arg0) {
        try {
            if (arg0 != -14976) {
                return -125;
            } else {
                ++field782;
                return this.field783;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field788[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "(I)J")
    public final long method620(int arg0) {
        try {
            if (arg0 != 1963) {
                return 119L;
            } else {
                ++field784;
                return 0L;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field788[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(I)I")
    public final int method621(int arg0) {
        try {
            ++field787;
            return arg0 > -7 ? -58 : super.field6097;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field788[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fw", name = "d", descriptor = "(I)V")
    public final void method622(int arg0) {
        try {
            if (arg0 != -26783) {
                field781 = 64;
            }
            ++field779;
            super.field6102.method1490(false, this);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field788[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fw", name = "<init>", descriptor = "(Lvf;I[BIZ)V")
    public class60(class159 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        try {
            this.field783 = arg1;
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field788[1] + (arg0 != null ? field788[2] : field788[3]) + ',' + arg1 + ',' + (arg2 != null ? field788[2] : field788[3]) + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(IIZ[B)V")
    public final void method623(int arg0, int arg1, boolean arg2, byte[] arg3) {
        try {
            if (arg2) {
                field781 = -81;
            }
            this.method3097(arg3, arg1, 35040);
            ++field786;
            this.field783 = arg0;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field788[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field788[2] : field788[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!fw", name = "e", descriptor = "(I)V")
    public static void method624(int arg0) {
        try {
            if (arg0 != 0) {
                method624(-53);
            }
            field778 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field788[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fw", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method625(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 57);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fw", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method626(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 115;
                    break;
                case 1:
                    var10005 = 23;
                    break;
                case 2:
                    var10005 = 51;
                    break;
                case 3:
                    var10005 = 85;
                    break;
                default:
                    var10005 = 57;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
