import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class670 extends class568 {

    @OriginalMember(owner = "client!ck", name = "r", descriptor = "I")
    public int field9519;

    @OriginalMember(owner = "client!ck", name = "o", descriptor = "Z")
    public boolean field9516;

    @OriginalMember(owner = "client!ck", name = "n", descriptor = "Lov;")
    public class197 field9518;

    @OriginalMember(owner = "client!ck", name = "p", descriptor = "I")
    public int field9523;

    @OriginalMember(owner = "client!ck", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9526 = new String[] { method4862(method4861("\u000e\u000b\u0011js")), method4862(method4861("\u0016N\u0011\u0006&")), method4862(method4861("\u001bPS(")), method4862(method4861("\u0016N\u0011xg\u001bLKz&")), method4862(method4861("=L[ k\u001b\bJ7k")), method4862(method4861("\u0016N\u0011\u0000&")), method4862(method4861("\u0016N\u0011\u0005&")), method4862(method4861("\u0016N\u0011\u0007&")) };

    @OriginalMember(owner = "client!ck", name = "s", descriptor = "I")
    public static int field9517;

    @OriginalMember(owner = "client!ck", name = "q", descriptor = "I")
    public static int field9520;

    @OriginalMember(owner = "client!ck", name = "l", descriptor = "I")
    public static int field9524;

    @OriginalMember(owner = "client!ck", name = "t", descriptor = "I")
    public static int field9525;

    @OriginalMember(owner = "client!ck", name = "u", descriptor = "Z")
    public boolean field9515;

    @OriginalMember(owner = "client!ck", name = "m", descriptor = "Z")
    public boolean field9521;

    @OriginalMember(owner = "client!ck", name = "v", descriptor = "Z")
    public boolean field9522;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILmj;)Ljava/lang/String;")
    public static final String method4857(int arg0, class683 arg1) {
        try {
            field9520++;
            if (client.method2695(arg1).method3481(arg0 + 74) == 0) {
                return null;
            } else if (arg0 != 0) {
                return null;
            } else if (arg1.field9720 == null || arg1.field9720.trim().length() == 0) {
                return class531.field7804 ? field9526[4] : null;
            } else {
                return arg1.field9720;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9526[5] + arg0 + ',' + (arg1 == null ? field9526[2] : field9526[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lwq;I)Lgia;")
    public static final class282 method4858(class176 arg0, int arg1) {
        try {
            field9525++;
            if (arg1 != 0) {
                return null;
            }
            class131 var2 = class270.method2332(arg0, 12523);
            int var3 = arg0.method1687((byte) -95);
            int var4 = arg0.method1687((byte) -110);
            int var5 = arg0.method1687((byte) -78);
            int var6 = arg0.method1687((byte) -89);
            int var7 = arg0.method1687((byte) -118);
            int var8 = arg0.method1687((byte) -69);
            return new class282(var2.field1875, var2.field1865, var2.field1872, var2.field1874, var2.field1869, var2.field1862, var2.field1859, var2.field1877, var2.field1870, var3, var4, var5, var6, var7, var8);
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field9526[1] + (arg0 == null ? field9526[2] : field9526[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILns;[II)V")
    public static final void method4859(int arg0, class426 arg1, int[] arg2, int arg3) {
        try {
            field9524++;
            if (arg1.field1194 != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < arg1.field1194.length; var5++) {
                    if (arg1.field1194[var5] != arg2[var5]) {
                        var4 = false;
                        break;
                    }
                }
                if (var4 && arg1.field1167 != -1) {
                    class210 var6 = class397.field6293.method2058(arg1.field1167, (byte) -16);
                    int var7 = var6.field3338;
                    if (var7 == 1) {
                        arg1.field1131 = 0;
                        arg1.field1125 = 0;
                        arg1.field1164 = 0;
                        arg1.field1119 = 1;
                        arg1.field1186 = arg0;
                        if (!arg1.field1120) {
                            class531.method3967(-98, var6, arg1.field1125, arg1);
                        }
                    }
                    if (var7 == 2) {
                        arg1.field1131 = 0;
                    }
                }
            }
            boolean var8 = true;
            int var9 = 0;
            if (arg3 == 6673) {
                while (arg2.length > var9) {
                    if (arg2[var9] != -1) {
                        var8 = false;
                    }
                    if (arg1.field1194 == null || arg1.field1194[var9] == -1 || class397.field6293.method2058(arg2[var9], (byte) 126).field3333 >= class397.field6293.method2058(arg1.field1194[var9], (byte) 123).field3333) {
                        arg1.field1186 = arg0;
                        arg1.field1208 = arg1.field1205;
                        arg1.field1194 = arg2;
                    }
                    var9++;
                }
                if (var8) {
                    arg1.field1194 = arg2;
                    arg1.field1186 = arg0;
                    arg1.field1208 = arg1.field1205;
                }
            }
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field9526[6] + arg0 + ',' + (arg1 == null ? field9526[2] : field9526[0]) + ',' + (arg2 == null ? field9526[2] : field9526[0]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(ILov;IZ)V")
    public class670(int arg0, class197 arg1, int arg2, boolean arg3) {
        try {
            this.field9519 = arg2;
            this.field9516 = arg3;
            this.field9518 = arg1;
            this.field9523 = arg0;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field9526[3] + arg0 + ',' + (arg1 == null ? field9526[2] : field9526[0]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIII)I")
    public static final int method4860(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            field9517++;
            if (arg4 == -1) {
                int var5 = arg3 & 0xF;
                int var6 = var5 >= 8 ? arg1 : arg0;
                int var7 = var5 >= 4 ? (var5 == 12 || var5 == 14 ? arg0 : arg2) : arg1;
                return ((var5 & 0x2) == 0 ? var7 : -var7) + ((var5 & 0x1) == 0 ? var6 : -var6);
            } else {
                return -40;
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field9526[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ck", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4861(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xE);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ck", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4862(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 117;
                    break;
                case 1:
                    var10005 = 37;
                    break;
                case 2:
                    var10005 = 63;
                    break;
                case 3:
                    var10005 = 68;
                    break;
                default:
                    var10005 = 14;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
