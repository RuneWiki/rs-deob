import java.awt.Dimension;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class151 {

    @OriginalMember(owner = "client!as", name = "f", descriptor = "J")
    public long field2282;

    @OriginalMember(owner = "client!as", name = "c", descriptor = "Loea;")
    private class594 field2279;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!as", name = "b", descriptor = "I")
    public static int field2278;

    @OriginalMember(owner = "client!as", name = "d", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!as", name = "e", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!as", name = "g", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!as", name = "h", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!as", name = "finalize", descriptor = "()V", line = 3)
    protected final void finalize() throws Throwable {
        field2281++;
        this.field2279.method3431(this.field2282, (byte) 115);
        super.finalize();
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(I)V", line = 13)
    public static final void method1161(int arg0) {
        field2284++;
        class539.method3172(false, false);
        class694.field9761 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class190.field2743.length; var2++) {
            if (class561.field7959[var2] != -1 && class190.field2743[var2] == null) {
                class190.field2743[var2] = class391.field5460.method1453(0, -117, class561.field7959[var2]);
                if (class190.field2743[var2] == null) {
                    var1 = false;
                    class694.field9761++;
                }
            }
            if (class68.field1233[var2] != -1 && class430.field6023[var2] == null) {
                class430.field6023[var2] = class391.field5460.method1473(class68.field1233[var2], true, class35.field463[var2], 0);
                if (class430.field6023[var2] == null) {
                    var1 = false;
                    class694.field9761++;
                }
            }
            if (class390.field5453[var2] != -1 && class630.field9040[var2] == null) {
                class630.field9040[var2] = class391.field5460.method1453(0, 13, class390.field5453[var2]);
                if (class630.field9040[var2] == null) {
                    var1 = false;
                    class694.field9761++;
                }
            }
            if (class109.field1777[var2] != -1 && class190.field2739[var2] == null) {
                class190.field2739[var2] = class391.field5460.method1453(0, 90, class109.field1777[var2]);
                if (class190.field2739[var2] == null) {
                    class694.field9761++;
                    var1 = false;
                }
            }
            if (class493.field7032 != null && class697.field9800[var2] == null && class493.field7032[var2] != -1) {
                class697.field9800[var2] = class391.field5460.method1473(class493.field7032[var2], true, class35.field463[var2], 0);
                if (class697.field9800[var2] == null) {
                    var1 = false;
                    class694.field9761++;
                }
            }
        }
        if (class609.field8826 == null) {
            if (class717.field10034 == null || !class588.field8272.method1463(class717.field10034.field10148 + "_staticelements", (byte) 117)) {
                class609.field8826 = new class752(0);
            } else if (class588.field8272.method1470(class717.field10034.field10148 + "_staticelements", -7490)) {
                class609.field8826 = class660.method3716((byte) -24, class399.field5585, class717.field10034.field10148 + "_staticelements", class588.field8272);
            } else {
                var1 = false;
                class694.field9761++;
            }
        }
        if (!var1) {
            class157.field2349 = 1;
            return;
        }
        class32.field435 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class190.field2743.length; var4++) {
            byte[] var22 = class430.field6023[var4];
            if (var22 != null) {
                int var23 = (class412.field5705[var4] >> 8) * 64 - class115.field1845;
                int var24 = (class412.field5705[var4] & 0xFF) * 64 - class64.field1160;
                if (class564.field7978 != 0) {
                    var24 = 10;
                    var23 = 10;
                }
                var3 &= class455.method2782(var22, class174.field2540, var23, (byte) -100, class716.field9999, var24);
            }
            byte[] var25 = class190.field2739[var4];
            if (var25 != null) {
                int var26 = (class412.field5705[var4] >> 8) * 64 - class115.field1845;
                int var27 = (class412.field5705[var4] & 0xFF) * 64 - class64.field1160;
                if (class564.field7978 != 0) {
                    var26 = 10;
                    var27 = 10;
                }
                var3 &= class455.method2782(var25, class174.field2540, var26, (byte) -62, class716.field9999, var27);
            }
        }
        if (!var3) {
            class157.field2349 = 2;
            return;
        }
        if (class157.field2349 != 0) {
            class379.method2375(class359.field5046, true, class281.field3953.method1839((byte) 45, class744.field10426) + "<br>(100%)", (byte) 127, class722.field10090, class436.field6100);
        }
        class565.method3297(53);
        class114.method941(0);
        class50.method455(-43);
        boolean var5 = false;
        if (class359.field5046.method627() && class471.field6781.field6714.method3368(27669) == 2) {
            for (int var6 = 0; var6 < class190.field2743.length; var6++) {
                if (class190.field2739[var6] != null || class630.field9040[var6] != null) {
                    var5 = true;
                    break;
                }
            }
        }
        int var7;
        if (class471.field6781.field6673.method2920(27669) == 1) {
            var7 = class588.field8276[class467.field6743];
        } else {
            var7 = class4.field45[class467.field6743];
        }
        if (class359.field5046.method563()) {
            var7++;
        }
        class489.method2943(class359.field5046, class93.field1630, 9, 4, class174.field2540, class716.field9999, var7, var5, class359.field5046.method615() > 0);
        class373.method2351(class586.field8250);
        if (class586.field8250 == 0) {
            class363.method2271(null);
        } else {
            class363.method2271(class242.field3393);
        }
        for (int var8 = 0; var8 < 4; var8++) {
            class630.field9041[var8].method3994(false);
        }
        class168.method1244(true);
        class157.method1190(-118, false);
        class183.method1310(3);
        class386.field5394 = false;
        class576.field8161 = null;
        class565.method3297(57);
        System.gc();
        class539.method3172(false, true);
        class169.method1249((byte) -104);
        class475.field6807 = class471.field6781.field6689.method56(27669);
        class215.field3084 = class438.field6123 >= 96;
        class613.field8870 = class471.field6781.field6714.method3368(27669) == 2;
        class131.field1967 = class471.field6781.field6688.method3933(27669) == 1;
        class425.field5949 = class471.field6781.field6704.method2015(27669) == 1 ? -1 : class569.field8104;
        class290.field4077 = class471.field6781.field6674.method3652(27669) == 1;
        class718.field10050 = class471.field6781.field6696.method3214(27669) == 1;
        class274.field3909 = new class166(4, class174.field2540, class716.field9999, false);
        if (class564.field7978 == 0) {
            class285.method1858(class190.field2743, 256215144, class274.field3909);
        } else {
            class486.method2922(72, class274.field3909, class190.field2743);
        }
        class41.method365(class716.field9999 >> 4, class174.field2540 >> 4, false);
        class677.method3829((byte) -118);
        if (var5) {
            class71.method732(true);
            class395.field5536 = new class166(1, class174.field2540, class716.field9999, true);
            if (class564.field7978 == 0) {
                class285.method1858(class630.field9040, 256215144, class395.field5536);
                class539.method3172(false, true);
            } else {
                class486.method2922(89, class395.field5536, class630.field9040);
                class539.method3172(false, true);
            }
            class395.field5536.method1983((byte) 80, class274.field3909.field4328[0], 0);
            class395.field5536.method1981(null, null, class359.field5046, -84);
            class71.method732(false);
        }
        class274.field3909.method1981(var5 ? class395.field5536.field4328 : null, class630.field9041, class359.field5046, -108);
        if (class564.field7978 == 0) {
            class539.method3172(false, true);
            class516.method3075(class430.field6023, -24246, class274.field3909);
            if (class697.field9800 != null) {
                class694.method3899(true);
            }
        } else {
            class539.method3172(false, true);
            class705.method3955(class274.field3909, class430.field6023, -125);
        }
        class114.method941(0);
        if (class438.field6123 < 96) {
            class123.method976(false);
        }
        int var9 = -8 % ((63 - arg0) / 53);
        class539.method3172(false, true);
        class274.field3909.method1990(null, 112, class359.field5046, var5 ? class4.field56[0] : null);
        class274.field3909.method1238(false, class359.field5046, 4);
        class539.method3172(false, true);
        if (var5) {
            class71.method732(true);
            class539.method3172(false, true);
            if (class564.field7978 == 0) {
                class516.method3075(class190.field2739, -24246, class395.field5536);
            } else {
                class705.method3955(class395.field5536, class190.field2739, 78);
            }
            class114.method941(0);
            class539.method3172(false, true);
            class395.field5536.method1990(class173.field2511[0], 50, class359.field5046, null);
            class395.field5536.method1238(true, class359.field5046, 4);
            class539.method3172(false, true);
            class71.method732(false);
        }
        class122.method968(-7);
        int var10 = class274.field3909.field2455;
        if (class312.field4409 < var10) {
            var10 = class312.field4409;
        }
        if (class312.field4409 - 1 > var10) {
            var10 = class312.field4409 - 1;
        }
        if (class471.field6781.field6704.method2015(27669) == 0) {
            class156.method1186(var10);
        } else {
            class156.method1186(0);
        }
        for (int var11 = 0; var11 < 4; var11++) {
            for (int var20 = 0; var20 < class174.field2540; var20++) {
                for (int var21 = 0; var21 < class716.field9999; var21++) {
                    class152.method1168(var11, 256, var20, var21);
                }
            }
        }
        class138.method1100((byte) -47);
        class565.method3297(33);
        class653.method3687((byte) 124);
        class114.method941(0);
        class677.method3832((byte) 123);
        if (class754.field10504 != null && class555.field7776 != null && class611.field8839 == 11) {
            class603.field8764++;
            class135 var12 = class273.method1801(class459.field6629, class58.field1074, 2);
            var12.field2109.method233(1057001181, -23162);
            class539.method3178(var12, -18925);
        }
        if (class564.field7978 == 0) {
            int var13 = (class440.field6143 - (class174.field2540 >> 4)) / 8;
            int var14 = ((class174.field2540 >> 4) + class440.field6143) / 8;
            int var15 = (class544.field7683 - (class716.field9999 >> 4)) / 8;
            int var16 = ((class716.field9999 >> 4) + class544.field7683) / 8;
            for (int var17 = var13 - 1; var17 <= var14 + 1; var17++) {
                for (int var18 = var15 - 1; var18 <= var16 + 1; var18++) {
                    if (var13 > var17 || var17 > var14 || var18 < var15 || var16 < var18) {
                        class391.field5460.method1452(-80, "m" + var17 + "_" + var18);
                        class391.field5460.method1452(-60, "l" + var17 + "_" + var18);
                    }
                }
            }
        }
        if (class611.field8839 == 4) {
            class19.method122(1, 3);
        } else if (class611.field8839 == 8) {
            class19.method122(1, 7);
        } else {
            class19.method122(1, 10);
            if (class555.field7776 != null) {
                class135 var19 = class273.method1801(class459.field6629, class221.field3157, 2);
                class539.method3178(var19, -18925);
            }
        }
        class716.method3983((byte) -119);
        class565.method3297(58);
        class54.method491(0);
        class70.field1267 = true;
        if (class386.field5411) {
            class569.method3326("Took: " + (class742.method4128(1) - class625.field8977) + "ms", (byte) -42);
            class386.field5411 = false;
        }
    }

    @OriginalMember(owner = "client!as", name = "b", descriptor = "(I)V", line = 496)
    public static final void method1162(int arg0) {
        if (class359.field5046.method622()) {
            class359.field5046.method607(class567.field8085);
            class66.method694(28633);
            if (class200.field2876) {
                class27.method200((byte) -123, class567.field8085);
            } else {
                Dimension var1 = class567.field8085.getSize();
                class359.field5046.method645(class567.field8085, var1.width, var1.height);
            }
            class359.field5046.method529(class567.field8085);
        } else {
            class54.method490((byte) -15, false, class471.field6781.field6684.method1843(arg0 ^ 0xFFFFD29B));
        }
        field2278++;
        class237.method1608(true);
        if (arg0 == -16754) {
            class70.field1267 = true;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IIIIIIIIIZ)V", line = 534)
    public static final void method1163(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        field2283++;
        if (arg9) {
            return;
        }
        if (arg5 < 512 || arg6 < 512 || (class174.field2540 * 512 - 1024) < arg5 || arg6 > class716.field9999 * 512 - 1024) {
            class686.field9681[0] = class686.field9681[1] = -1;
            return;
        }
        int var10 = class534.method3136(1, arg7, arg5, arg6) - arg4;
        if (class200.field2876) {
            class555.method3250(true, !arg9);
        } else {
            class57.field1066.method149(arg2, 0, 0);
            class359.field5046.method538(class57.field1066);
        }
        if (class339.field4781) {
            class359.field5046.method631(arg5, var10, arg6, class220.field3129, class686.field9681);
        } else {
            class359.field5046.method537(arg5, var10, arg6, class686.field9681);
        }
        if (class200.field2876) {
            class705.method3949((byte) -95);
        } else {
            class57.field1066.method149(-arg2, 0, 0);
            class359.field5046.method538(class57.field1066);
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IIIIIII)Z", line = 575)
    public static final boolean method1164(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2280++;
        int var7 = arg1 + arg4;
        int var8 = arg3 + arg6;
        int var9 = 59 % ((arg2 - 46) / 37);
        int var10 = arg0 + arg5;
        if (!class50.method442(var10, var10, var7, var8, arg5, var8, arg1, arg1, (byte) 63, var8)) {
            return false;
        } else if (class50.method442(arg5, var10, var7, var8, arg5, var8, var7, arg1, (byte) -64, var8)) {
            if (class308.field4358 <= arg1) {
                if (!class50.method442(arg5, var10, var7, var8, var10, var8, var7, var7, (byte) -104, arg3)) {
                    return false;
                }
                if (!class50.method442(arg5, arg5, var7, var8, var10, arg3, var7, var7, (byte) -119, arg3)) {
                    return false;
                }
            } else if (!class50.method442(arg5, var10, arg1, var8, var10, var8, arg1, arg1, (byte) 80, arg3)) {
                return false;
            } else if (!class50.method442(arg5, arg5, arg1, var8, var10, arg3, arg1, arg1, (byte) 120, arg3)) {
                return false;
            }
            if (class200.field2875 <= arg5) {
                if (!class50.method442(var10, var10, var7, var8, var10, var8, arg1, arg1, (byte) 115, arg3)) {
                    return false;
                }
                if (!class50.method442(var10, var10, var7, var8, var10, arg3, var7, arg1, (byte) -27, arg3)) {
                    return false;
                }
            } else if (!class50.method442(arg5, arg5, var7, var8, arg5, var8, arg1, arg1, (byte) 94, arg3)) {
                return false;
            } else if (!class50.method442(arg5, arg5, var7, var8, arg5, arg3, var7, arg1, (byte) 99, arg3)) {
                return false;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(ILjava/net/Socket;I)Lma;", line = 639)
    public static final class12 method1165(int arg0, Socket arg1, int arg2) throws IOException {
        if (arg2 == 0) {
            field2277++;
            return new class160(arg1, arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!as", name = "<init>", descriptor = "(Loea;J[Lgn;)V", line = 649)
    public class151(class594 arg0, long arg1, class698[] arg2) {
        this.field2282 = arg1;
        this.field2279 = arg0;
    }
}
