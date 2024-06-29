import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class36 {

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public static int field550 = 0;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "[[[I")
    public static int[][][] field551;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V", line = 3)
    public static final void method260(int arg0) {
        if (arg0 > -72) {
            field549 = -116;
        }
        field553++;
        class249.field3445.method1243(1000);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V", line = 21)
    public static final void method261(byte arg0) {
        class86.method596(14459, class142.field2046);
        field554++;
        class359.field5046++;
        if (class182.field2558 && class259.field3551) {
            int var1 = class349.field4883;
            int var2 = var1 - class341.field4765;
            int var3 = class162.field2269;
            int var4 = var3 - class259.field3552;
            if (arg0 > 3) {
                if (var2 < class34.field535) {
                    var2 = class34.field535;
                }
                if (class142.field2046.field5431 + var2 > class34.field535 + class32.field497.field5431) {
                    var2 = class34.field535 + class32.field497.field5431 - class142.field2046.field5431;
                }
                if (class31.field491 > var4) {
                    var4 = class31.field491;
                }
                if (class142.field2046.field5491 + var4 > class31.field491 + class32.field497.field5491) {
                    var4 = class32.field497.field5491 + class31.field491 - class142.field2046.field5491;
                }
                int var5 = var2 - class54.field790;
                int var6 = var4 - class169.field2402;
                int var7 = class142.field2046.field5576;
                if (class142.field2046.field5447 < class359.field5046 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                    class441.field6397 = true;
                }
                int var8 = var2 + class32.field497.field5511 - class34.field535;
                int var9 = class32.field497.field5434 + var4 - class31.field491;
                if (class142.field2046.field5487 != null && class441.field6397) {
                    class410 var10 = new class410();
                    var10.field5946 = class142.field2046;
                    var10.field5949 = var8;
                    var10.field5961 = class142.field2046.field5487;
                    var10.field5959 = var9;
                    class111.method738(var10);
                }
                if (class409.field5938 == 0) {
                    if (class441.field6397) {
                        if (class142.field2046.field5552 != null) {
                            class410 var11 = new class410();
                            var11.field5961 = class142.field2046.field5552;
                            var11.field5959 = var9;
                            var11.field5954 = class327.field4472;
                            var11.field5949 = var8;
                            var11.field5946 = class142.field2046;
                            class111.method738(var11);
                        }
                        if (class327.field4472 != null && client.method1115(class142.field2046) != null) {
                            class233.method1468((byte) 80, class327.field4472.field5507, class142.field2046.field5545, class142.field2046.field5507, class327.field4472.field5545);
                        }
                    } else if ((class202.field2757 == 1 || class298.method1926((byte) -76)) && class390.field5740 > 2) {
                        class154.method1040(2, 120);
                    } else if (class265.method1645(true)) {
                        class154.method1040(1, 109);
                    }
                    class142.field2046 = null;
                }
            }
        } else if (class359.field5046 > 1) {
            class142.field2046 = null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZILcj;IIZIILaa;ILrj;Laa;)Llf;", line = 131)
    public static final class130 method262(boolean arg0, int arg1, class412 arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, class281 arg8, int arg9, class352 arg10, class281 arg11) {
        field552++;
        class130 var12 = class434.method2724(arg4, arg8, arg9, arg3, arg2, (byte) -78, arg1, arg6);
        if (var12 != null) {
            return var12;
        }
        class389 var13 = class347.method2222(arg3, 18682);
        if (arg4 > 1 && var13.field5716 != null) {
            int var14 = -1;
            for (int var15 = 0; var15 < 10; var15++) {
                if (arg4 >= var13.field5679[var15] && var13.field5679[var15] != 0) {
                    var14 = var13.field5716[var15];
                }
            }
            if (var14 != -1) {
                var13 = class347.method2222(var14, 18682);
            }
        }
        class279 var16 = class33.method247(class108.field1595, var13.field5704, 0, 113);
        if (var16 == null) {
            return null;
        }
        if (var13.field5661 != null) {
            for (int var17 = 0; var17 < var13.field5661.length; var17++) {
                if (var13.field5663 == null || var17 >= var13.field5663.length) {
                    var16.method1708(var13.field5661[var17], (byte) -53, var13.field5681[var17]);
                } else {
                    var16.method1708(var13.field5661[var17], (byte) -53, class353.field4942[var13.field5663[var17] & 0xFF]);
                }
            }
        }
        if (var13.field5689 != null) {
            for (int var18 = 0; var18 < var13.field5689.length; var18++) {
                var16.method1710((byte) 32, var13.field5689[var18], var13.field5701[var18]);
            }
        }
        if (arg2 != null) {
            for (int var19 = 0; var19 < 5; var19++) {
                if (class262.field3579[var19].length > arg2.field5974[var19]) {
                    var16.method1708(class173.field2465[var19], (byte) -53, class262.field3579[var19][arg2.field5974[var19]]);
                }
                if (arg2.field5974[var19] < class450.field6535[var19].length) {
                    var16.method1708(class333.field4512[var19], (byte) -53, class450.field6535[var19][arg2.field5974[var19]]);
                }
            }
        }
        int var20 = 1024;
        boolean var21 = false;
        if (var13.field5727 != 128 || var13.field5697 != 128 || var13.field5694 != 128) {
            var20 |= 0x7;
            var21 = true;
        }
        class75 var22 = arg11.method1736(var16, var20, 0, var13.field5667 + 64, 768 - -var13.field5683);
        if (!var22.method505()) {
            return null;
        }
        if (var21) {
            var22.method528(var13.field5727, var13.field5697, var13.field5694);
        }
        class130 var23 = null;
        if (var13.field5711 != -1) {
            var23 = method262(true, 0, arg2, var13.field5717, 10, true, 0, 36, arg8, 1, arg10, arg11);
            if (var23 == null) {
                return null;
            }
        } else if (var13.field5654 != -1) {
            var23 = method262(true, arg1, arg2, var13.field5670, arg4, false, 0, 36, arg8, arg9, arg10, arg11);
            if (var23 == null) {
                return null;
            }
        }
        int var24 = var13.field5714;
        if (arg5) {
            var24 = (int) ((double) var24 * 1.5D);
        } else if (arg9 == 2) {
            var24 = (int) ((double) var24 * 1.04D);
        }
        arg11.method1763(16, 16, 512, 512);
        class261 var25 = arg11.method1783();
        var25.method893();
        arg11.method1724(var25);
        arg11.method1826(1.0F);
        arg11.method1814(16777215, 1.0F, 1.0F, -50.0F, -10.0F, -50.0F);
        class261 var26 = arg11.method1769();
        var26.method886(-var13.field5653 << 3);
        var26.method883(var13.field5724 << 3);
        var26.method888(var13.field5660, (class362.field5083[var13.field5656 << 3] * var24 >> 15) + var13.field5682 - (var22.method523() / 2), (class362.field5082[var13.field5656 << 3] * var24 >> 15) + var13.field5682);
        var26.method892(var13.field5656 << 3);
        int var27 = arg11.method1825();
        int var28 = arg11.method1792();
        arg11.method1765(50, Integer.MAX_VALUE);
        arg11.method1779();
        arg11.method1812();
        arg11.method1785(0, 0, 36, 32, 0, 0);
        var22.method514(var26, (class38) null, 1);
        arg11.method1765(var27, var28);
        int[] var29 = arg11.method1744(0, 0, arg7, 32);
        if (arg9 >= 1) {
            var29 = class48.method337(var29, -16777215, 44);
            if (arg9 >= 2) {
                var29 = class48.method337(var29, -1, -126);
            }
        }
        if (arg1 != 0) {
            class171.method1164(false, arg1, var29);
        }
        arg11.method1773(var29, 0, 36, 36, 32).method867(0, 0);
        if (var13.field5711 != -1) {
            var23.method867(0, 0);
        } else if (var13.field5654 != -1) {
            var23.method867(0, 0);
        }
        if (arg6 == 1 || arg6 == 2 && (var13.field5680 == 1 || arg4 != 1) && arg4 != -1) {
            arg10.method2278(-256, 9, -16777215, class395.method2565(arg7 + 9999964, arg4), (byte) -96, 0);
        }
        int[] var30 = arg11.method1744(0, 0, 36, 32);
        for (int var31 = 0; var31 < var30.length; var31++) {
            if ((var30[var31] & 0xFFFFFF) == 0) {
                var30[var31] = 0;
            } else {
                var30[var31] = class311.method1970(var30[var31], -16777216);
            }
        }
        class130 var32;
        if (arg0) {
            var32 = arg11.method1773(var30, 0, 36, 36, 32);
        } else {
            var32 = arg8.method1773(var30, 0, 36, 36, 32);
        }
        if (!arg0) {
            class229 var33 = new class229();
            var33.field3052 = arg1;
            var33.field3062 = arg3;
            var33.field3051 = arg4;
            var33.field3060 = arg2 != null;
            var33.field3059 = arg6;
            var33.field3055 = arg9;
            var33.field3063 = arg8.field3847;
            class362.field5075.method1673(var33, 116, var32);
        }
        return var32;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(BI)V", line = 371)
    public static final void method263(byte arg0, int arg1) {
        class249.field3445.method1254(arg1, -124);
        int var2 = 2 % ((66 - arg0) / 58);
        field556++;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V", line = 381)
    public static void method264(int arg0) {
        field551 = null;
        if (arg0 != 0) {
            field551 = null;
        }
    }
}
