import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class256 extends class759 {

    @OriginalMember(owner = "client!st", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3672 = new String[] { method2145(method2144("\u0013\u000eq</")), method2145(method2144("\u001bTqVz")), method2145(method2144("\u0006U3~")), method2145(method2144("\u001bTqQz")) };

    @OriginalMember(owner = "client!st", name = "c", descriptor = "I")
    public static int field3669 = 1405;

    @OriginalMember(owner = "client!st", name = "g", descriptor = "[F")
    public static float[] field3670 = new float[2];

    @OriginalMember(owner = "client!st", name = "f", descriptor = "Ltka;")
    public static class599 field3668 = new class599();

    @OriginalMember(owner = "client!st", name = "e", descriptor = "I")
    public static int field3667;

    @OriginalMember(owner = "client!st", name = "d", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(BI[S[Ljava/lang/String;I)V")
    public static final void method2142(byte arg0, int arg1, short[] arg2, String[] arg3, int arg4) {
        try {
            if (arg0 >= 62) {
                field3671++;
                if (arg1 > arg4) {
                    int var5 = (arg1 + arg4) / 2;
                    int var6 = arg4;
                    String var7 = arg3[var5];
                    arg3[var5] = arg3[arg1];
                    arg3[arg1] = var7;
                    short var8 = arg2[var5];
                    arg2[var5] = arg2[arg1];
                    arg2[arg1] = var8;
                    for (int var9 = arg4; var9 < arg1; var9++) {
                        if (var7 == null || arg3[var9] != null && (var9 & 0x1) > arg3[var9].compareTo(var7)) {
                            String var10 = arg3[var9];
                            arg3[var9] = arg3[var6];
                            arg3[var6] = var10;
                            short var11 = arg2[var9];
                            arg2[var9] = arg2[var6];
                            arg2[var6++] = var11;
                        }
                    }
                    arg3[arg1] = arg3[var6];
                    arg3[var6] = var7;
                    arg2[arg1] = arg2[var6];
                    arg2[var6] = var8;
                    method2142((byte) 82, var6 - 1, arg2, arg3, arg4);
                    method2142((byte) 110, arg1, arg2, arg3, var6 + 1);
                }
            }
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field3672[1] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field3672[2] : field3672[0]) + ',' + (arg3 == null ? field3672[2] : field3672[0]) + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!st", name = "b", descriptor = "(B)V")
    public static void method2143(byte arg0) {
        try {
            field3668 = null;
            field3670 = null;
            if (arg0 != 84) {
                method2143((byte) -54);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3672[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!st", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2144(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x52);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!st", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2145(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 104;
                    break;
                case 1:
                    var10005 = 32;
                    break;
                case 2:
                    var10005 = 95;
                    break;
                case 3:
                    var10005 = 18;
                    break;
                default:
                    var10005 = 82;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
