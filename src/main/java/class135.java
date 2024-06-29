import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qea")
public class class135 {

    @OriginalMember(owner = "client!qea", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1917 = new String[] { method1269(method1268("NG[jo\u0017")), method1269(method1268("D\f\u0014jS")), method1269(method1268("NG[jm\u0017")), method1269(method1268("QWV(")), method1269(method1268("NG[jj\u0017")), method1269(method1268("NG[jl\u0017")) };

    @OriginalMember(owner = "client!qea", name = "f", descriptor = "Lhl;")
    public static class556 field1906 = new class556(141, -2);

    @OriginalMember(owner = "client!qea", name = "g", descriptor = "I")
    public static int field1914 = 0;

    @OriginalMember(owner = "client!qea", name = "k", descriptor = "Lvn;")
    public static class330 field1913 = new class330(60, 2);

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "Lhl;")
    public static class556 field1915 = new class556(43, 20);

    @OriginalMember(owner = "client!qea", name = "j", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!qea", name = "b", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!qea", name = "d", descriptor = "I")
    public static int field1909;

    @OriginalMember(owner = "client!qea", name = "i", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!qea", name = "h", descriptor = "Lqea;")
    public class135 field1912;

    @OriginalMember(owner = "client!qea", name = "e", descriptor = "Laba;")
    public class185 field1911;

    @OriginalMember(owner = "client!qea", name = "c", descriptor = "Lsj;")
    public static class486 field1910;

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(IB)V")
    public static final void method1264(int arg0, byte arg1) {
        try {
            if (arg1 > -66) {
                method1267(null, -46, 119, -16, -37, -103, -1, null, -43);
            }
            field1909++;
            class551 var2 = class380.method3113(-117, (long) arg0, 16);
            var2.method4089(63);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field1917[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qea", name = "b", descriptor = "(I)V")
    public static void method1265(int arg0) {
        try {
            field1910 = null;
            int var1 = 2 / ((-arg0 - 66) / 51);
            field1906 = null;
            field1915 = null;
            field1913 = null;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1917[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(I)V")
    public final void method1266(int arg0) {
        try {
            field1908++;
            if (class690.field9954 < arg0) {
                this.field1911 = null;
                this.field1912 = class735.field10779;
                class735.field10779 = this;
                class690.field9954++;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1917[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "([BIIIIII[BI)V")
    public static final void method1267(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, int arg8) {
        try {
            field1907++;
            int var9 = -(arg8 >> 2);
            int var15 = -(arg8 & 0x3);
            if (arg4 != -18265) {
                field1906 = null;
            }
            for (int var10 = -arg6; var10 < 0; var10++) {
                int var10001;
                for (int var11 = var9; var11 < 0; var11++) {
                    var10001 = arg2++;
                    arg7[var10001] += arg0[arg1++];
                    int var16 = arg2++;
                    arg7[var16] += arg0[arg1++];
                    int var17 = arg2++;
                    arg7[var17] += arg0[arg1++];
                    int var18 = arg2++;
                    arg7[var18] += arg0[arg1++];
                }
                for (int var12 = var15; var12 < 0; var12++) {
                    var10001 = arg2++;
                    arg7[var10001] += arg0[arg1++];
                }
                arg2 += arg3;
                arg1 += arg5;
            }
        } catch (RuntimeException var14) {
            throw class590.method4333(var14, field1917[2] + (arg0 == null ? field1917[3] : field1917[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 == null ? field1917[3] : field1917[1]) + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!qea", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1268(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qea", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1269(char[] arg0) {
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
                    var10005 = 34;
                    break;
                case 2:
                    var10005 = 58;
                    break;
                case 3:
                    var10005 = 68;
                    break;
                default:
                    var10005 = 46;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
