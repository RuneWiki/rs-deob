import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tka")
public class class599 {

    @OriginalMember(owner = "client!tka", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8602 = new String[] { method4421(method4420("9m\nH(e")), method4421(method4420("#s\u0007\n")), method4421(method4420("9m\nH.e")), method4421(method4420("6(EH\u0017")), method4421(method4420("\u0012d\u0007\u0007\u0004&")), method4421(method4420("9m\nH)e")), method4421(method4420("!i\f\u0001\u000f)i\u001e\u0012")), method4421(method4420("\u0012r\u0004\u0016")), method4421(method4420("9m\nH+e")) };

    @OriginalMember(owner = "client!tka", name = "d", descriptor = "[I")
    public static int[] field8595 = new int[2048];

    @OriginalMember(owner = "client!tka", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field8597 = new String[100];

    @OriginalMember(owner = "client!tka", name = "c", descriptor = "I")
    public static int field8601 = -1;

    @OriginalMember(owner = "client!tka", name = "f", descriptor = "I")
    public static int field8596;

    @OriginalMember(owner = "client!tka", name = "g", descriptor = "I")
    public static int field8598;

    @OriginalMember(owner = "client!tka", name = "a", descriptor = "I")
    public static int field8599;

    @OriginalMember(owner = "client!tka", name = "b", descriptor = "I")
    public static int field8600;

    @OriginalMember(owner = "client!tka", name = "a", descriptor = "(ZI)Z")
    public static final boolean method4416(boolean arg0, int arg1) {
        try {
            if (arg1 != -13304) {
                method4417(null, -98, (byte) 45, null, null);
            }
            field8600++;
            boolean var2 = class236.field3418.method217();
            if (arg0 == var2) {
                return true;
            }
            if (!arg0) {
                class236.field3418.method163();
            } else if (!class236.field3418.method164()) {
                arg0 = false;
            }
            if (arg0 == var2) {
                return false;
            } else {
                class451.field6612.method4681(arg0 ? 1 : 0, class451.field6612.field9130, (byte) -111);
                class536.method4064(10);
                return true;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8602[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tka", name = "a", descriptor = "(Ljava/lang/String;IBLjava/lang/String;Lft;)Lvn;")
    public static final class328 method4417(String arg0, int arg1, byte arg2, String arg3, class188 arg4) {
        try {
            int var5 = -13 % ((5 - arg2) / 47);
            field8596++;
            if (arg1 == 0) {
                return arg4.method1570(arg0, true);
            } else if (arg1 == 1) {
                try {
                    Object var6 = class192.method1602(class290.field4091, 16163, new Object[] { (new URL(class290.field4091.getCodeBase(), arg0)).toString() }, arg3);
                    if (var6 == null) {
                        throw new RuntimeException();
                    }
                    class328 var7 = new class328();
                    var7.field4486 = 1;
                    return var7;
                } catch (Throwable var14) {
                    class328 var8 = new class328();
                    var8.field4486 = 2;
                    return var8;
                }
            } else if (arg1 == 2) {
                try {
                    class290.field4091.getAppletContext().showDocument(new URL(class290.field4091.getCodeBase(), arg0), field8602[4]);
                    class328 var9 = new class328();
                    var9.field4486 = 1;
                    return var9;
                } catch (Exception var15) {
                    class328 var10 = new class328();
                    var10.field4486 = 2;
                    return var10;
                }
            } else if (arg1 == 3) {
                try {
                    class192.method1601(field8602[6], class290.field4091, 4368);
                } catch (Throwable var17) {
                }
                try {
                    class290.field4091.getAppletContext().showDocument(new URL(class290.field4091.getCodeBase(), arg0), field8602[7]);
                    class328 var11 = new class328();
                    var11.field4486 = 1;
                    return var11;
                } catch (Exception var16) {
                    class328 var12 = new class328();
                    var12.field4486 = 2;
                    return var12;
                }
            } else {
                throw new IllegalArgumentException();
            }
        } catch (RuntimeException var18) {
            throw class665.method4799(var18, field8602[5] + (arg0 == null ? field8602[1] : field8602[3]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field8602[1] : field8602[3]) + ',' + (arg4 == null ? field8602[1] : field8602[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!tka", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z")
    public static final boolean method4418(byte arg0, String arg1, String arg2, String arg3, String arg4) {
        try {
            field8598++;
            if (arg0 <= 24) {
                return false;
            } else if (arg1 == null || arg3 == null) {
                return false;
            } else if (arg1.startsWith("#") || arg3.startsWith("#")) {
                return arg1.equals(arg3);
            } else {
                return arg4.equals(arg2);
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field8602[2] + arg0 + ',' + (arg1 == null ? field8602[1] : field8602[3]) + ',' + (arg2 == null ? field8602[1] : field8602[3]) + ',' + (arg3 == null ? field8602[1] : field8602[3]) + ',' + (arg4 == null ? field8602[1] : field8602[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!tka", name = "a", descriptor = "(B)V")
    public static void method4419(byte arg0) {
        try {
            field8597 = null;
            field8595 = null;
            if (arg0 <= 9) {
                field8599 = -56;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8602[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tka", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4420(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!tka", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4421(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 77;
                    break;
                case 1:
                    var10005 = 6;
                    break;
                case 2:
                    var10005 = 107;
                    break;
                case 3:
                    var10005 = 102;
                    break;
                default:
                    var10005 = 106;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
