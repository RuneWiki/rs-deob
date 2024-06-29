import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public class class719 extends class206 {

    @OriginalMember(owner = "client!ev", name = "m", descriptor = "I")
    public int field10410;

    @OriginalMember(owner = "client!ev", name = "l", descriptor = "I")
    public int field10412;

    @OriginalMember(owner = "client!ev", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10418 = new String[] { method5247(method5246("Db\u0010xw")), method5247(method5246("Q9R:")), method5247(method5246("Z:\u0010\u0017\"")), method5247(method5246("Z:\u0010\u0015\"")), method5247(method5246("Z:\u0010\u0012\"")), method5247(method5246("Z:\u0010jcQ%Jh\"")), method5247(method5246("Z:\u0010\u0014\"")) };

    @OriginalMember(owner = "client!ev", name = "n", descriptor = "[[I")
    public static int[][] field10413 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!ev", name = "k", descriptor = "Z")
    public static boolean field10416 = false;

    @OriginalMember(owner = "client!ev", name = "r", descriptor = "F")
    public static float field10414;

    @OriginalMember(owner = "client!ev", name = "j", descriptor = "I")
    public static int field10411;

    @OriginalMember(owner = "client!ev", name = "q", descriptor = "I")
    public static int field10415;

    @OriginalMember(owner = "client!ev", name = "p", descriptor = "I")
    public static int field10417;

    @OriginalMember(owner = "client!ev", name = "o", descriptor = "Lfda;")
    public static class338 field10409;

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(I)V", line = 6)
    public static void method5242(int arg0) {
        try {
            int var1 = 82 / ((12 - arg0) / 55);
            field10409 = null;
            field10413 = null;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10418[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ev", name = "<init>", descriptor = "(II)V", line = 16)
    public class719(int arg0, int arg1) {
        try {
            this.field10410 = arg0;
            this.field10412 = arg1;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field10418[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(Z)V", line = 25)
    public static final void method5243(boolean arg0) {
        try {
            if (!arg0) {
                field10414 = -0.052843F;
            }
            field10417++;
            class205.field3171.method1559(0);
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field10418[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(IJZJLjava/lang/String;IZLjava/lang/String;IBIZI)V", line = 40)
    public static final void method5244(int arg0, long arg1, boolean arg2, long arg3, String arg4, int arg5, boolean arg6, String arg7, int arg8, byte arg9, int arg10, boolean arg11, int arg12) {
        try {
            field10415++;
            if (!class216.field3297 && class593.field8707 < 500) {
                int var19 = arg8 == -1 ? class311.field4926 : arg8;
                int var15 = -68 / ((74 - arg9) / 49);
                class417 var16 = new class417(arg4, arg7, var19, arg10, arg12, arg3, arg0, arg5, arg11, arg2, arg1, arg6);
                class115.method1014(var16, true);
            }
        } catch (RuntimeException var18) {
            throw class759.method5498(var18, field10418[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field10418[1] : field10418[0]) + ',' + arg5 + ',' + arg6 + ',' + (arg7 == null ? field10418[1] : field10418[0]) + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ')');
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIIIIZLla;)V", line = 62)
    public static final void method5245(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, class476 arg6) {
        try {
            class84.field940 = arg2;
            field10411++;
            class252.field3914 = arg0;
            class166.field2289 = arg6;
            class515.field7438 = arg4;
            class573.field8466 = arg1;
            class550.field8199 = arg3;
            class494.field7093 = null;
            class336.field5242 = arg5;
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field10418[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 == null ? field10418[1] : field10418[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!ev", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5246(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xA);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ev", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5247(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 63;
                    break;
                case 1:
                    var10005 = 76;
                    break;
                case 2:
                    var10005 = 62;
                    break;
                case 3:
                    var10005 = 86;
                    break;
                default:
                    var10005 = 10;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
