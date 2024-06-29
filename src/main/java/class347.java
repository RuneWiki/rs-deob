import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cia")
public class class347 extends class330 {

    @OriginalMember(owner = "client!cia", name = "G", descriptor = "[Ljava/lang/String;")
    private static final String[] field5049 = new String[] { method2782(method2781("F\u0014C\u0019n\r")), method2782(method2781("F\u0014C\u0019d\r")), method2782(method2781("K\bN[")), method2782(method2781("F\u0014C\u0019o\r")), method2782(method2781("^S\f\u0019^")), method2782(method2781("F\u0014C\u0019h\r")), method2782(method2781("F\u0014C\u0019a\r")) };

    @OriginalMember(owner = "client!cia", name = "F", descriptor = "[I")
    public static int[] field5043 = new int[2];

    @OriginalMember(owner = "client!cia", name = "E", descriptor = "Lmv;")
    public static class125 field5041 = new class125(50, 11);

    @OriginalMember(owner = "client!cia", name = "C", descriptor = "I")
    public static int field5048 = 0;

    @OriginalMember(owner = "client!cia", name = "y", descriptor = "I")
    public static int field5040;

    @OriginalMember(owner = "client!cia", name = "B", descriptor = "I")
    public static int field5044;

    @OriginalMember(owner = "client!cia", name = "D", descriptor = "I")
    public static int field5045;

    @OriginalMember(owner = "client!cia", name = "z", descriptor = "I")
    public static int field5046;

    @OriginalMember(owner = "client!cia", name = "A", descriptor = "Llga;")
    public static class47 field5042;

    @OriginalMember(owner = "client!cia", name = "x", descriptor = "Llga;")
    public static class47 field5047;

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(IIILsba;III)Z", line = 4)
    public static final boolean method2778(int arg0, int arg1, int arg2, class311 arg3, int arg4, int arg5, int arg6) {
        try {
            ++field5040;
            if (class721.field10272 && class793.field11533) {
                if (~class459.field6696 > arg2) {
                    return false;
                } else if (arg0 == arg5 && ~arg4 == ~arg6) {
                    if (!class499.method3829(-1, arg1, arg4, arg0)) {
                        return false;
                    } else if (class686.method4908((byte) 127, arg3)) {
                        ++class15.field200;
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    for (int var7 = arg0; arg5 >= var7; ++var7) {
                        for (int var8 = arg4; arg6 >= var8; ++var8) {
                            if (class117.field1492[arg1][var7][var8] == -class429.field6220) {
                                return false;
                            }
                        }
                    }
                    if (!class686.method4908((byte) 127, arg3)) {
                        return false;
                    } else {
                        ++class15.field200;
                        return true;
                    }
                }
            } else {
                return false;
            }
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field5049[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field5049[4] : field5049[2]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(FI)V", line = 60)
    public final void method2598(float arg0, int arg1) {
        try {
            if (arg1 == -6546) {
                super.field4511 = arg0;
                ++field5045;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5049[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(IIII)V", line = 71)
    public final void method2596(int arg0, int arg1, int arg2, int arg3) {
        try {
            if (arg2 != 2) {
                field5043 = null;
            }
            super.field4513 = arg1;
            super.field4503 = arg3;
            super.field4500 = arg0;
            ++field5044;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field5049[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!cia", name = "c", descriptor = "(I)V", line = 86)
    public static void method2779(int arg0) {
        try {
            field5043 = null;
            field5047 = null;
            field5042 = null;
            field5041 = null;
            if (arg0 <= 103) {
                method2779(61);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field5049[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cia", name = "<init>", descriptor = "(IIIIIF)V", line = 99)
    public class347(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(II)Lgia;", line = 103)
    public static final class173 method2780(int arg0, int arg1) {
        try {
            ++field5046;
            int var2 = -85 % ((arg1 - -24) / 62);
            class173[] var3 = class488.method3759((byte) -122);
            for (int var4 = 0; ~var3.length < ~var4; ++var4) {
                class173 var5 = var3[var4];
                if (var5.field2287 == arg0) {
                    return var5;
                }
            }
            return null;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field5049[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cia", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2781(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 35);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!cia", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2782(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 37;
                    break;
                case 1:
                    var10005 = 125;
                    break;
                case 2:
                    var10005 = 34;
                    break;
                case 3:
                    var10005 = 55;
                    break;
                default:
                    var10005 = 35;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
