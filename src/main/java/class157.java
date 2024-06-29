import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class157 {

    @OriginalMember(owner = "client!ho", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2171 = new String[] { method1414(method1413("\"\u001f{;d")), method1414(method1413("\"\u001f{9d")), method1414(method1413("\"\u001f{:d")), method1414(method1413("$\u00059\u0014")), method1414(method1413("1^{V1")) };

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "Lvn;")
    public static class330 field2167 = new class330(11, 3);

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "I")
    public static int field2169;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "Z")
    public static boolean field2170;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)V")
    public static void method1410(int arg0) {
        try {
            if (arg0 != 16383) {
                method1412(80, -114, (byte) -15);
            }
            field2167 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field2171[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIIJLmj;IILaa;)V")
    public static final void method1411(int arg0, int arg1, int arg2, int arg3, long arg4, class683 arg5, int arg6, int arg7, class514 arg8) {
        try {
            field2168++;
            int var10 = arg3 * arg3 + arg7 * arg7;
            if (((long) var10) <= arg4) {
                if (arg1 != 256) {
                    method1412(-116, 69, (byte) -80);
                }
                int var11 = Math.min(arg5.field9797 / 2, arg5.field9777 / 2);
                if (var10 > (var11 * var11)) {
                    var11 -= 10;
                    int var12;
                    if (class401.field6334 == 4) {
                        var12 = (int) class29.field293 & 0x3FFF;
                    } else {
                        var12 = (int) class29.field293 + class126.field1819 & 0x3FFF;
                    }
                    int var13 = class763.field11199[var12];
                    int var14 = class763.field11200[var12];
                    if (class401.field6334 != 4) {
                        var14 = var14 * 256 / (class85.field1275 + 256);
                        var13 = var13 * 256 / (class85.field1275 + 256);
                    }
                    int var15 = arg3 * var14 + arg7 * var13 >> 14;
                    int var16 = arg7 * var14 - (arg3 * var13) >> 14;
                    double var17 = Math.atan2((double) var15, (double) var16);
                    int var19 = (int) ((double) var11 * Math.sin(var17));
                    int var20 = (int) (Math.cos(var17) * (double) var11);
                    class632.field9085[arg2].method1004((float) arg5.field9797 / 2.0F + (float) arg0 + (float) var19, (float) arg5.field9777 / 2.0F + (float) arg6 - (float) var20, 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
                } else {
                    class610.method4449(class274.field4397[arg2], arg7, arg0, arg6, 4, arg8, arg5, arg3);
                }
            }
        } catch (RuntimeException var22) {
            throw class590.method4333(var22, field2171[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 == null ? field2171[3] : field2171[4]) + ',' + arg6 + ',' + arg7 + ',' + (arg8 == null ? field2171[3] : field2171[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIB)Z")
    public static final boolean method1412(int arg0, int arg1, byte arg2) {
        try {
            field2169++;
            if (arg2 < 125) {
                return false;
            } else if (class213.method1920(arg1, arg0, 5)) {
                return (arg0 & 0x9000) != 0 | class241.method2075((byte) 119, arg0, arg1) | class517.method3878(arg1, arg0, -97) ? true : (arg1 & 0x37) == 0 & ((arg0 & 0x2000) != 0 | class647.method4711((byte) -76, arg1, arg0) | class305.method2616(arg1, arg0, (byte) 25));
            } else {
                return false;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2171[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ho", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1413(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4C);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ho", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1414(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 74;
                    break;
                case 1:
                    var10005 = 112;
                    break;
                case 2:
                    var10005 = 85;
                    break;
                case 3:
                    var10005 = 120;
                    break;
                default:
                    var10005 = 76;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
