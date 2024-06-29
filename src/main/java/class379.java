import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public class class379 implements class81 {

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "Lgca;")
    private class51 field5533;

    @OriginalMember(owner = "client!gu", name = "d", descriptor = "Llga;")
    private class47 field5537;

    @OriginalMember(owner = "client!gu", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5546 = new String[] { method3001(method3000("Xc\u001cN_")), method3001(method3000("Xc\u001cI_")), method3001(method3000("Xc\u001cL_")), method3001(method3000("Xc\u001cC_")), method3001(method3000("Xc\u001cJ_")), method3001(method3000("Xc\u001cK_")), method3001(method3000("Xc\u001cM_")), method3001(method3000("Qc^d")), method3001(method3000("Xc\u001c4\u001eQ\u007fF6_")), method3001(method3000("D8\u001c&\n")) };

    @OriginalMember(owner = "client!gu", name = "f", descriptor = "[I")
    public static int[] field5541 = new int[32];

    @OriginalMember(owner = "client!gu", name = "l", descriptor = "I")
    public static int field5545 = 0;

    @OriginalMember(owner = "client!gu", name = "k", descriptor = "Lhj;")
    public static class671 field5543 = new class671(13, 0, 1, 0);

    @OriginalMember(owner = "client!gu", name = "j", descriptor = "I")
    public static int field5534;

    @OriginalMember(owner = "client!gu", name = "e", descriptor = "I")
    public static int field5535;

    @OriginalMember(owner = "client!gu", name = "m", descriptor = "I")
    public static int field5536;

    @OriginalMember(owner = "client!gu", name = "h", descriptor = "I")
    public static int field5538;

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "I")
    public static int field5539;

    @OriginalMember(owner = "client!gu", name = "i", descriptor = "I")
    public static int field5544;

    @OriginalMember(owner = "client!gu", name = "g", descriptor = "Ltb;")
    private class392 field5542;

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "Llga;")
    public static class47 field5540;

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(IZ)V")
    public final void method801(int arg0, boolean arg1) {
        try {
            if (arg1) {
                int var3 = class500.field7304 >= class391.field5700 ? class500.field7304 : class391.field5700;
                int var4 = class711.field9998 > class791.field11507 ? class711.field9998 : class791.field11507;
                int var5 = this.field5542.method1378();
                int var6 = this.field5542.method1380();
                int var7 = 0;
                int var8 = var3;
                int var9 = var3 * var6 / var5;
                int var10 = (var4 - var9) / 2;
                if (var4 < var9) {
                    var9 = var4;
                    var8 = var4 * var5 / var6;
                    var10 = 0;
                    var7 = (var3 - var8) / 2;
                }
                this.field5542.method3069(var7, var10, var8, var9);
            }
            int var11 = 2 / ((arg0 - 15) / 60);
            field5534++;
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field5546[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(Z)V")
    public static void method2996(boolean arg0) {
        try {
            field5540 = null;
            if (arg0) {
                field5543 = null;
                field5541 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field5546[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(II)V")
    public static final void method2997(int arg0, int arg1) {
        try {
            field5536++;
            class337.field4886 = arg0;
            class251 var2 = class699.field9789;
            synchronized (class699.field9789) {
                class699.field9789.method2043(false);
            }
            if (arg1 != 0) {
                method2998(35, 56, -119, 79, (byte) -31);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field5546[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(Llga;Lgca;)V")
    public class379(class47 arg0, class51 arg1) {
        try {
            this.field5533 = arg1;
            this.field5537 = arg0;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5546[8] + (arg0 == null ? field5546[7] : field5546[9]) + ',' + (arg1 == null ? field5546[7] : field5546[9]) + ')');
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(B)Z")
    public final boolean method800(byte arg0) {
        try {
            if (arg0 >= -2) {
                this.method802(-38);
            }
            field5544++;
            return this.field5537.method530(false, this.field5533.field726);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5546[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)V")
    public final void method802(int arg0) {
        try {
            field5538++;
            this.field5542 = class304.method2443(true, this.field5537, this.field5533.field726);
            int var2 = 83 / ((arg0 - 38) / 41);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5546[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIIIB)V")
    public static final void method2998(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        try {
            if (arg4 != -117) {
                field5540 = null;
            }
            field5535++;
            class294 var5 = class146.method1261((long) arg3, arg4 ^ 0xFFFFFFDF, 10);
            var5.method2378(-64);
            var5.field4140 = arg2;
            var5.field4136 = arg1;
            var5.field4133 = arg0;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field5546[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(III)I")
    public static final int method2999(int arg0, int arg1, int arg2) {
        try {
            field5539++;
            int var3 = 1;
            while (arg1 > 1) {
                if ((arg1 & 0x1) != 0) {
                    var3 = arg0 * var3;
                }
                arg1 >>= 0x1;
                arg0 *= arg0;
            }
            if (arg1 == 1) {
                return arg0 * var3;
            } else {
                int var4 = 19 / ((arg2 + 11) / 44);
                return var3;
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field5546[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!gu", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3000(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x77);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gu", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3001(char[] arg0) {
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
                    var10005 = 22;
                    break;
                case 2:
                    var10005 = 50;
                    break;
                case 3:
                    var10005 = 8;
                    break;
                default:
                    var10005 = 119;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
