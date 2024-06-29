import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!haa")
public class class3 {

    @OriginalMember(owner = "client!haa", name = "d", descriptor = "J")
    public long field48;

    @OriginalMember(owner = "client!haa", name = "e", descriptor = "Ldga;")
    private class713 field49;

    @OriginalMember(owner = "client!haa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field51 = new String[] { method25(method24("iw+\u0016")), method25(method24("|,iT0")), method25(method24("oc&T\f/")), method25(method24("oc&T+nl&\u0016$}go")), method25(method24("oc&T\u000f/")), method25(method24("oc&Tqnl.\u000es/")) };

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "[I")
    public static int[] field50 = new int[1];

    @OriginalMember(owner = "client!haa", name = "b", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!haa", name = "c", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(Z)V", line = 3)
    public static void method22(boolean arg0) {
        try {
            if (!arg0) {
                field50 = null;
            }
            field50 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field51[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(III[I[Ljava/lang/String;)V", line = 17)
    public static final void method23(int arg0, int arg1, int arg2, int[] arg3, String[] arg4) {
        try {
            field47++;
            if (arg0 != 11279) {
                field50 = null;
            }
            if (arg1 > arg2) {
                int var5 = (arg1 + arg2) / 2;
                int var6 = arg2;
                String var7 = arg4[var5];
                arg4[var5] = arg4[arg1];
                arg4[arg1] = var7;
                int var8 = arg3[var5];
                arg3[var5] = arg3[arg1];
                arg3[arg1] = var8;
                for (int var9 = arg2; var9 < arg1; var9++) {
                    if (var7 == null || arg4[var9] != null && arg4[var9].compareTo(var7) < (var9 & 0x1)) {
                        String var10 = arg4[var9];
                        arg4[var9] = arg4[var6];
                        arg4[var6] = var10;
                        int var11 = arg3[var9];
                        arg3[var9] = arg3[var6];
                        arg3[var6++] = var11;
                    }
                }
                arg4[arg1] = arg4[var6];
                arg4[var6] = var7;
                arg3[arg1] = arg3[var6];
                arg3[var6] = var8;
                method23(11279, var6 - 1, arg2, arg3, arg4);
                method23(11279, arg1, var6 + 1, arg3, arg4);
            }
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field51[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field51[0] : field51[1]) + ',' + (arg4 == null ? field51[0] : field51[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!haa", name = "finalize", descriptor = "()V", line = 78)
    protected final void finalize() throws Throwable {
        try {
            this.field49.method5161(this.field48, (byte) -121);
            field46++;
            super.finalize();
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field51[3] + ')');
        }
    }

    @OriginalMember(owner = "client!haa", name = "<init>", descriptor = "(Ldga;J[Lfb;)V", line = 90)
    public class3(class713 arg0, long arg1, class263[] arg2) {
        try {
            this.field48 = arg1;
            this.field49 = arg0;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field51[5] + (arg0 == null ? field51[0] : field51[1]) + ',' + arg1 + ',' + (arg2 == null ? field51[0] : field51[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!haa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method24(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!haa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method25(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 7;
                    break;
                case 1:
                    var10005 = 2;
                    break;
                case 2:
                    var10005 = 71;
                    break;
                case 3:
                    var10005 = 122;
                    break;
                default:
                    var10005 = 77;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
