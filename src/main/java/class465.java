import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class465 extends class54 {

    @OriginalMember(owner = "client!vj", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6787 = new String[] { method3538(method3537("IO\nN:")), method3538(method3537("\u001fv\u001e-")), method3538(method3537("IO\nD:")), method3538(method3537("IO\nO:")), method3538(method3537("IO\nJ:")), method3538(method3537("IO\nL:")), method3538(method3537("D\u000b\n#o")), method3538(method3537("QPHa")), method3538(method3537("XNE")), method3538(method3537("IO\nK:")), method3538(method3537("IO\nH:")), method3538(method3537("IO\nI:")), method3538(method3537("IO\nE:")) };

    @OriginalMember(owner = "client!vj", name = "s", descriptor = "Lwia;")
    public static class790 field6779 = new class790(91, 6);

    @OriginalMember(owner = "client!vj", name = "n", descriptor = "I")
    public static int field6778;

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "I")
    public static int field6780;

    @OriginalMember(owner = "client!vj", name = "p", descriptor = "I")
    public static int field6781;

    @OriginalMember(owner = "client!vj", name = "o", descriptor = "I")
    public static int field6782;

    @OriginalMember(owner = "client!vj", name = "r", descriptor = "I")
    public static int field6783;

    @OriginalMember(owner = "client!vj", name = "t", descriptor = "I")
    public static int field6784;

    @OriginalMember(owner = "client!vj", name = "q", descriptor = "I")
    public static int field6785;

    @OriginalMember(owner = "client!vj", name = "u", descriptor = "I")
    public static int field6786;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILjava/awt/Canvas;II)Lor;")
    public static final class666 method3532(int arg0, Canvas arg1, int arg2, int arg3) {
        try {
            ++field6784;
            try {
                int var4 = -126 % (arg0 / 54);
                Class var5 = Class.forName(field6787[8]);
                class666 var6 = (class666) var5.newInstance();
                var6.method3103(arg1, 96, arg2, arg3);
                return var6;
            } catch (Throwable var9) {
                class737 var7 = new class737();
                var7.method3103(arg1, -125, arg2, arg3);
                return var7;
            }
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field6787[5] + arg0 + ',' + (arg1 != null ? field6787[6] : field6787[7]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(BI)Lnf;")
    public static final class603 method3533(byte arg0, int arg1) {
        try {
            ++field6782;
            class603 var2 = (class603) class375.field5718.method637((byte) -29, (long) arg1);
            if (var2 != null) {
                return var2;
            } else {
                if (arg0 != -64) {
                    method3534((byte) 38);
                }
                byte[] var3 = class743.field10810.method3632(arg1, 0, -4);
                if (var3 != null && var3.length > 1) {
                    class603 var4;
                    try {
                        var4 = class38.method251((byte) -48, var3);
                    } catch (Exception var7) {
                        throw new RuntimeException(var7.getMessage() + field6787[1] + arg1);
                    }
                    class375.field5718.method636(var4, 0, (long) arg1);
                    return var4;
                } else {
                    return null;
                }
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field6787[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Z)V")
    public final void method115(boolean arg0) {
        try {
            if (arg0) {
                ++field6785;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6787[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(Z)I")
    public final int method111(boolean arg0) {
        try {
            ++field6786;
            if (arg0) {
                this.method111(false);
            }
            return 0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6787[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(IB)I")
    public final int method109(int arg0, byte arg1) {
        try {
            ++field6783;
            return arg1 > -106 ? 33 : 1;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6787[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)V")
    public final void method113(int arg0, int arg1) {
        try {
            if (arg0 != 0) {
                field6779 = null;
            }
            super.field593 = arg1;
            ++field6778;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6787[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)V")
    public static void method3534(byte arg0) {
        try {
            field6779 = null;
            int var1 = -60 % ((arg0 - -43) / 54);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6787[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIII)V")
    public static final void method3535(int arg0, int arg1, int arg2, int arg3) {
        try {
            if (arg0 != -20420) {
                field6779 = null;
            }
            ++field6780;
            class313 var4 = class196.method1670((long) arg2, 9, arg0 + 20540);
            var4.method2636((byte) 108);
            var4.field4951 = arg1;
            var4.field4958 = arg3;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field6787[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(ILhia;)V")
    public class465(int arg0, class73 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(Z)I")
    public final int method3536(boolean arg0) {
        try {
            if (arg0) {
                return 58;
            } else {
                ++field6781;
                return super.field593;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6787[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Lhia;)V")
    public class465(class73 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!vj", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3537(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 18);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vj", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3538(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 63;
                    break;
                case 1:
                    var10005 = 37;
                    break;
                case 2:
                    var10005 = 36;
                    break;
                case 3:
                    var10005 = 13;
                    break;
                default:
                    var10005 = 18;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
