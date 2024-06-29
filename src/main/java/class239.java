import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oaa")
public class class239 extends class578 {

    @OriginalMember(owner = "client!oaa", name = "k", descriptor = "J")
    public long field3447;

    @OriginalMember(owner = "client!oaa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3457 = new String[] { method1983(method1982("%o\u001b\u0005\n#`\u0013_\bb")), method1983(method1982("%o\u001b\u0005rb")), method1983(method1982("%o\u001b\u0005tb")), method1983(method1982("%o\u001b\u0005ub")), method1983(method1982("%o\u001b\u0005sb")), method1983(method1982("1 T\u0005K")), method1983(method1982("${\u0016G")), method1983(method1982("%o\u001b\u0005wb")) };

    @OriginalMember(owner = "client!oaa", name = "j", descriptor = "I")
    public static int field3453 = 5000;

    @OriginalMember(owner = "client!oaa", name = "i", descriptor = "Lsb;")
    public static class261 field3450 = new class261(116, 5);

    @OriginalMember(owner = "client!oaa", name = "l", descriptor = "I")
    public static int field3454 = 0;

    @OriginalMember(owner = "client!oaa", name = "o", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!oaa", name = "n", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!oaa", name = "q", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!oaa", name = "m", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!oaa", name = "r", descriptor = "I")
    public static int field3455;

    @OriginalMember(owner = "client!oaa", name = "p", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IIIIIIII)V", line = 3)
    private static final void method1977(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            field3449++;
            int var8 = class679.method4875(class50.field717, class557.field8113, arg6, -1);
            int var9 = class679.method4875(class50.field717, class557.field8113, arg7, -1);
            int var10 = class679.method4875(class507.field7453, class335.field4844, arg0, -1);
            int var11 = class679.method4875(class507.field7453, class335.field4844, arg4, -1);
            int var12 = class679.method4875(class50.field717, class557.field8113, arg6 + arg5, -1);
            int var13 = class679.method4875(class50.field717, class557.field8113, arg7 - arg5, -1);
            for (int var14 = var8; var14 < var12; var14++) {
                class576.method4282(-7, var10, arg3, class529.field7682[var14], var11);
            }
            if (arg2 > -40) {
                method1977(-41, 4, 71, -18, -8, 94, 27, 61);
            }
            for (int var15 = var9; var15 > var13; var15--) {
                class576.method4282(-7, var10, arg3, class529.field7682[var15], var11);
            }
            int var16 = class679.method4875(class507.field7453, class335.field4844, arg0 + arg5, -1);
            int var17 = class679.method4875(class507.field7453, class335.field4844, arg4 - arg5, -1);
            for (int var18 = var12; var18 <= var13; var18++) {
                int[] var19 = class529.field7682[var18];
                class576.method4282(-7, var10, arg3, var19, var16);
                class576.method4282(-7, var16, arg1, var19, var17);
                class576.method4282(-7, var17, arg3, var19, var11);
            }
        } catch (RuntimeException var21) {
            throw class665.method4799(var21, field3457[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IIIIBIII)V", line = 56)
    public static final void method1978(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        try {
            int var8 = 122 / ((arg4 - 65) / 45);
            field3451++;
            if (class335.field4844 <= arg0 && class507.field7453 >= arg2 && class557.field8113 <= arg7 && class50.field717 >= arg6) {
                class23.method272(arg1, arg0, arg3, arg7, arg5, -13939, arg6, arg2);
            } else {
                method1977(arg0, arg5, -85, arg3, arg2, arg1, arg7, arg6);
            }
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field3457[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "(I)V", line = 74)
    public static void method1979(int arg0) {
        try {
            if (arg0 != 0) {
                method1977(-75, 60, 87, 95, 9, -23, -13, -26);
            }
            field3450 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3457[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(I)V", line = 85)
    public static final void method1980(int arg0) {
        try {
            if (arg0 == 6977) {
                for (class801 var1 = (class801) class520.field7588.method3932((byte) -65); var1 != null; var1 = (class801) class520.field7588.method3939((byte) -75)) {
                    if (var1.field11653 > 1) {
                        var1.field11653 = 0;
                        class721.field10264.method2051(((class228) var1.field11651.field7555.field9626).field3303, var1, 93);
                        var1.field11651.method3936((byte) -114);
                    }
                }
                field3448++;
                class17.field221 = 0;
                class72.field1049 = 0;
                class45.field644.method3982(-125);
                class603.field8646.method3690((byte) 55);
                class520.field7588.method3936((byte) 99);
                class86.field1217 = false;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3457[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(ZIII[ILml;II)Lgda;", line = 120)
    public static final class268 method1981(boolean arg0, int arg1, int arg2, int arg3, int[] arg4, class194 arg5, int arg6, int arg7) {
        try {
            if (arg1 != -14869) {
                field3455 = -89;
            }
            field3452++;
            if (!arg5.field2899 && (!class357.method2858(arg3, false) || !class357.method2858(arg7, false))) {
                return arg5.field2884 ? new class268(arg5, 34037, arg3, arg7, arg0, arg4, arg2, arg6) : new class268(arg5, arg3, arg7, class788.method5671(arg1 + 1282348989, arg3), class788.method5671(1282334120, arg7), arg4);
            } else {
                return new class268(arg5, 3553, arg3, arg7, arg0, arg4, arg2, arg6);
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field3457[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field3457[6] : field3457[5]) + ',' + (arg5 == null ? field3457[6] : field3457[5]) + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!oaa", name = "<init>", descriptor = "()V", line = 138)
    public class239() {
    }

    @OriginalMember(owner = "client!oaa", name = "<init>", descriptor = "(J)V", line = 149)
    public class239(long arg0) {
        try {
            this.field3447 = arg0;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field3457[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oaa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1982(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x36);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!oaa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1983(char[] arg0) {
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
                    var10005 = 14;
                    break;
                case 2:
                    var10005 = 122;
                    break;
                case 3:
                    var10005 = 43;
                    break;
                default:
                    var10005 = 54;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
