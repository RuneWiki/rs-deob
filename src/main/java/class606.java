import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public class class606 {

    @OriginalMember(owner = "client!gu", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8881 = new String[] { method4491(method4490("\u000edDz.")), method4491(method4490("\u0007d\u0006W")), method4491(method4490("\u000edDy.")), method4491(method4490("\u0012?D\u0015{")), method4491(method4490("\u000edDx.")), method4491(method4490("\u000edD\u007f.")) };

    @OriginalMember(owner = "client!gu", name = "f", descriptor = "I")
    public static int field8878 = 0;

    @OriginalMember(owner = "client!gu", name = "i", descriptor = "Lwia;")
    public static class790 field8873 = new class790(14, 11);

    @OriginalMember(owner = "client!gu", name = "h", descriptor = "[I")
    public static int[] field8880 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!gu", name = "e", descriptor = "Lel;")
    public static class573 field8879 = new class573(119, -1);

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "I")
    public static int field8872;

    @OriginalMember(owner = "client!gu", name = "d", descriptor = "I")
    public static int field8874;

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "I")
    public static int field8876;

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "Lej;")
    public static class134 field8875;

    @OriginalMember(owner = "client!gu", name = "g", descriptor = "Lha;")
    public static class66 field8877;

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIIIIII)V")
    public static final void method4486(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            class7.method50(arg2, (byte) 122);
            field8876++;
            int var7 = 0;
            int var8 = arg2 - arg4;
            if (var8 < 0) {
                var8 = 0;
            }
            int var9 = arg2;
            if (arg5 == 6280) {
                int var10 = -arg2;
                int var11 = var8;
                int var12 = -var8;
                int var13 = -1;
                int var14 = -1;
                int[] var15 = class243.field3731[arg3];
                int var16 = arg1 - var8;
                class319.method2702(var15, arg1 - arg2, var16, true, arg0);
                int var17 = arg1 + var8;
                class319.method2702(var15, var16, var17, true, arg6);
                class319.method2702(var15, var17, arg1 + arg2, true, arg0);
                while (var7 < var9) {
                    var13 += 2;
                    var14 += 2;
                    var12 += var14;
                    var10 += var13;
                    if (var12 >= 0 && var11 >= 1) {
                        class20.field232[var11] = var7;
                        var11--;
                        var12 -= var11 << 1;
                    }
                    var7++;
                    if (var10 >= 0) {
                        var9--;
                        var10 -= var9 << 1;
                        if (var9 < var8) {
                            int[] var18 = class243.field3731[arg3 + var9];
                            int[] var19 = class243.field3731[arg3 - var9];
                            int var20 = class20.field232[var9];
                            int var21 = arg1 + var7;
                            int var22 = arg1 - var7;
                            int var23 = arg1 + var20;
                            int var24 = arg1 - var20;
                            class319.method2702(var18, var22, var24, true, arg0);
                            class319.method2702(var18, var24, var23, true, arg6);
                            class319.method2702(var18, var23, var21, true, arg0);
                            class319.method2702(var19, var22, var24, true, arg0);
                            class319.method2702(var19, var24, var23, true, arg6);
                            class319.method2702(var19, var23, var21, true, arg0);
                        } else {
                            int[] var25 = class243.field3731[arg3 + var9];
                            int[] var26 = class243.field3731[arg3 - var9];
                            int var27 = arg1 + var7;
                            int var28 = arg1 - var7;
                            class319.method2702(var25, var28, var27, true, arg0);
                            class319.method2702(var26, var28, var27, true, arg0);
                        }
                    }
                    int[] var29 = class243.field3731[arg3 + var7];
                    int[] var30 = class243.field3731[arg3 - var7];
                    int var31 = arg1 + var9;
                    int var32 = arg1 - var9;
                    if (var7 >= var8) {
                        class319.method2702(var29, var32, var31, true, arg0);
                        class319.method2702(var30, var32, var31, true, arg0);
                    } else {
                        int var33 = var7 <= var11 ? var11 : class20.field232[var7];
                        int var34 = arg1 + var33;
                        int var35 = arg1 - var33;
                        class319.method2702(var29, var32, var35, true, arg0);
                        class319.method2702(var29, var35, var34, true, arg6);
                        class319.method2702(var29, var34, var31, true, arg0);
                        class319.method2702(var30, var32, var35, true, arg0);
                        class319.method2702(var30, var35, var34, true, arg6);
                        class319.method2702(var30, var34, var31, true, arg0);
                    }
                }
            }
        } catch (RuntimeException var37) {
            throw class759.method5498(var37, field8881[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(II)V")
    public static final void method4487(int arg0, int arg1) {
        try {
            field8872++;
            if (arg1 != 2) {
                field8877 = null;
            }
            class313 var2 = class196.method1670((long) arg0, 11, 79);
            var2.method2635(true);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field8881[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)V")
    public static void method4488(int arg0) {
        try {
            field8873 = null;
            field8877 = null;
            field8879 = null;
            int var1 = -75 % ((65 - arg0) / 47);
            field8875 = null;
            field8880 = null;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field8881[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(Lnw;ZI[I)V")
    public static final void method4489(class612 arg0, boolean arg1, int arg2, int[] arg3) {
        try {
            field8874++;
            if (arg0.field3841 != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < arg0.field3841.length; var5++) {
                    if (arg0.field3841[var5] != arg3[var5]) {
                        var4 = false;
                        break;
                    }
                }
                if (var4 && arg0.field3814 != -1) {
                    class344 var6 = class272.field4122.method2242(arg0.field3814, 100);
                    int var7 = var6.field5364;
                    if (var7 == 1) {
                        arg0.field3821 = 0;
                        arg0.field3850 = arg2;
                        arg0.field3851 = 0;
                        arg0.field3763 = 1;
                        arg0.field3794 = 0;
                        if (!arg0.field3800) {
                            class418.method3242(-256, var6, arg0, arg0.field3821);
                        }
                    }
                    if (var7 == 2) {
                        arg0.field3851 = 0;
                    }
                }
            }
            if (arg1) {
                field8879 = null;
            }
            boolean var8 = true;
            for (int var9 = 0; var9 < arg3.length; var9++) {
                if (arg3[var9] != -1) {
                    var8 = false;
                }
                if (arg0.field3841 == null || arg0.field3841[var9] == -1 || class272.field4122.method2242(arg3[var9], 100).field5348 >= class272.field4122.method2242(arg0.field3841[var9], 100).field5348) {
                    arg0.field3858 = arg0.field3862;
                    arg0.field3841 = arg3;
                    arg0.field3850 = arg2;
                }
            }
            if (var8) {
                arg0.field3858 = arg0.field3862;
                arg0.field3841 = arg3;
                arg0.field3850 = arg2;
            }
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field8881[2] + (arg0 == null ? field8881[1] : field8881[3]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field8881[1] : field8881[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!gu", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4490(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gu", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4491(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 105;
                    break;
                case 1:
                    var10005 = 17;
                    break;
                case 2:
                    var10005 = 106;
                    break;
                case 3:
                    var10005 = 59;
                    break;
                default:
                    var10005 = 6;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
