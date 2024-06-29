import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mja")
public class class443 extends class282 {

    @OriginalMember(owner = "client!mja", name = "E", descriptor = "I")
    public int field6911;

    @OriginalMember(owner = "client!mja", name = "F", descriptor = "[Ljava/lang/String;")
    private static final String[] field6913 = new String[] { method3474(method3473("\u000b\u0002\u0002`zN")), method3474(method3473("\b\u001d\u000f\"")), method3474(method3473("\u001dFM`D")), method3474(method3473("\u000b\u0002\u0002`xN")), method3474(method3473("\u000b\u0002\u0002`{N")), method3474(method3473("\u000b\u0002\u0002`\u0005\u000f\u0006\n:\u0007N")) };

    @OriginalMember(owner = "client!mja", name = "B", descriptor = "I")
    public static int field6909;

    @OriginalMember(owner = "client!mja", name = "C", descriptor = "I")
    public static int field6910;

    @OriginalMember(owner = "client!mja", name = "D", descriptor = "I")
    public static int field6912;

    @OriginalMember(owner = "client!mja", name = "<init>", descriptor = "(Ljk;Ltda;IIIIIIIIIIIIII)V")
    public class443(class662 arg0, class666 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14);
        try {
            this.field6911 = arg15;
        } catch (RuntimeException var18) {
            throw class590.method4333(var18, field6913[5] + (arg0 == null ? field6913[1] : field6913[2]) + ',' + (arg1 == null ? field6913[1] : field6913[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ',' + arg14 + ',' + arg15 + ')');
        }
    }

    @OriginalMember(owner = "client!mja", name = "a", descriptor = "(IBI[J[Ljava/lang/Object;)V")
    public static final void method3471(int arg0, byte arg1, int arg2, long[] arg3, Object[] arg4) {
        try {
            int var5 = 36 / ((arg1 - 16) / 59);
            field6909++;
            if (arg0 < arg2) {
                int var6 = (arg0 + arg2) / 2;
                int var7 = arg0;
                long var8 = arg3[var6];
                arg3[var6] = arg3[arg2];
                arg3[arg2] = var8;
                Object var10 = arg4[var6];
                arg4[var6] = arg4[arg2];
                arg4[arg2] = var10;
                int var11 = ~var8 == Long.MIN_VALUE ? 0 : 1;
                for (int var12 = arg0; var12 < arg2; var12++) {
                    if (arg3[var12] < (long) (var11 & var12) + var8) {
                        long var13 = arg3[var12];
                        arg3[var12] = arg3[var7];
                        arg3[var7] = var13;
                        Object var15 = arg4[var12];
                        arg4[var12] = arg4[var7];
                        arg4[var7++] = var15;
                    }
                }
                arg3[arg2] = arg3[var7];
                arg3[var7] = var8;
                arg4[arg2] = arg4[var7];
                arg4[var7] = var10;
                method3471(arg0, (byte) -70, var7 - 1, arg3, arg4);
                method3471(var7 + 1, (byte) -79, arg2, arg3, arg4);
            }
        } catch (RuntimeException var17) {
            throw class590.method4333(var17, field6913[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field6913[1] : field6913[2]) + ',' + (arg4 == null ? field6913[1] : field6913[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!mja", name = "a", descriptor = "(Z)Lwh;")
    public final class155 method989(boolean arg0) {
        try {
            field6910++;
            if (arg0) {
                this.field6911 = -109;
            }
            return class198.field3140;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6913[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mja", name = "a", descriptor = "(I)Ljava/lang/String;")
    public static final String method3472(int arg0) {
        try {
            field6912++;
            if (class16.field177 || class750.field11049 == null) {
                return "";
            } else if ((class750.field11049.field760 == null || class750.field11049.field760.length() == 0) && class750.field11049.field758 != null && class750.field11049.field758.length() > 0) {
                return class750.field11049.field758;
            } else if (arg0 >= -102) {
                return null;
            } else {
                return class750.field11049.field760;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6913[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mja", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3473(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x39);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!mja", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3474(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 102;
                    break;
                case 1:
                    var10005 = 104;
                    break;
                case 2:
                    var10005 = 99;
                    break;
                case 3:
                    var10005 = 78;
                    break;
                default:
                    var10005 = 57;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
