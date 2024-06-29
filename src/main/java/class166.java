import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class166 extends class637 {

    @OriginalMember(owner = "client!dd", name = "D", descriptor = "[I")
    public static int[] field2429 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!dd", name = "B", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!dd", name = "C", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!dd", name = "A", descriptor = "[[B")
    public static byte[][] field2426;

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(IIIIIF)V")
    public class166(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I[[[BIBII)V")
    private static final void method1152(int arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5) {
        ++class115.field1893;
        class339.field4871 = 0;
        for (int var6 = class243.field3519; var6 < class146.field2246; ++var6) {
            class184[][] var17 = class277.field4051[var6];
            for (int var18 = class225.field3359; var18 < class387.field5759; ++var18) {
                for (int var19 = class648.field9398; var19 < class440.field6418; ++var19) {
                    class184 var20 = var17[var18][var19];
                    if (var20 != null) {
                        if (!class183.field2645[var18 - class119.field1913 + class90.field1610][var19 - class389.field5811 + class90.field1610] || arg1 != null && var6 >= arg2 && arg1[var6][var18][var19] == arg3) {
                            var20.field2654 = false;
                            var20.field2661 = false;
                            var20.field2674 = 0;
                            if (var18 >= class119.field1913 - 16 && var18 <= class119.field1913 + 16 && var19 >= class389.field5811 - 16 && var19 <= class389.field5811 + 16 && (var20.field2669 != null || var20.field2653 != null || var20.field2672 != null || var20.field2666 != null || var20.field2662 != null || var20.field2675 != null)) {
                                class181.field2624.method852(6186, var20);
                            }
                        } else {
                            var20.field2654 = true;
                            var20.field2661 = true;
                            if (var20.field2675 != null) {
                                var20.field2670 = true;
                            } else {
                                var20.field2670 = false;
                            }
                            ++class339.field4871;
                        }
                    }
                }
            }
        }
        boolean var7 = class88.field1594 == class73.field1360;
        for (int var8 = class243.field3519; var8 < class146.field2246; ++var8) {
            float var9 = var7 ? 251.5F : 201.5F - (float) var8 * 50.0F - 0.5F;
            if (class103.field1747.method407() && var8 >= arg2 && arg1 != null) {
                int var10 = class183.field2645.length;
                if (class183.field2645.length + class225.field3359 > class362.field5145) {
                    var10 -= class183.field2645.length + class225.field3359 - class362.field5145;
                }
                int var11 = class183.field2645[0].length;
                if (class183.field2645[0].length + class648.field9398 > class305.field4400) {
                    var11 -= class183.field2645[0].length + class648.field9398 - class305.field4400;
                }
                int var12 = class58.field831;
                while (true) {
                    if (var12 >= var10) {
                        class181.field2624.method848(true, class88.field1594[var8], var9, var8, 5357);
                        break;
                    }
                    int var13 = class225.field3359 + var12 - class58.field831;
                    for (int var14 = class631.field8854; var14 < var11; ++var14) {
                        class604.field8600[var12][var14] = false;
                        if (class183.field2645[var12][var14]) {
                            int var15 = class648.field9398 + var14 - class631.field8854;
                            for (int var16 = var8; var16 >= 0; --var16) {
                                if (class277.field4051[var16][var13][var15] != null && class277.field4051[var16][var13][var15].field2668 == var8) {
                                    class604.field8600[var12][var14] = class277.field4051[var16][var13][var15].field2654;
                                    break;
                                }
                            }
                        }
                    }
                    ++var12;
                }
            } else {
                class181.field2624.method848(false, class88.field1594[var8], var9, var8, 5357);
            }
            class181.field2624.method849((byte) -124);
        }
        if (!class44.method386(true)) {
            class44.method386(false);
        }
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(Z)V")
    public static void method1153(boolean arg0) {
        field2429 = null;
        field2426 = null;
        if (arg0) {
            field2426 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lqa;IILm;III[[[B[I[I[I[I[IIBIIZ)V")
    public static final void method1154(class167 arg0, int arg1, int arg2, class105 arg3, int arg4, int arg5, int arg6, byte[][][] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, byte arg14, int arg15, int arg16, boolean arg17) {
        class103.field1747 = arg0;
        class513.field7102 = arg1;
        class142.field2218 = arg3;
        class58.field823 = class103.field1747.method612() > 0;
        class119.field1913 = arg4 >> class162.field2401;
        class389.field5811 = arg6 >> class162.field2401;
        class307.field4422 = arg4;
        class358.field5090 = arg6;
        class319.field4630 = arg5;
        class225.field3359 = class119.field1913 - class90.field1610;
        if (class225.field3359 < 0) {
            class58.field831 = -class225.field3359;
            class225.field3359 = 0;
        } else {
            class58.field831 = 0;
        }
        class648.field9398 = class389.field5811 - class90.field1610;
        if (class648.field9398 < 0) {
            class631.field8854 = -class648.field9398;
            class648.field9398 = 0;
        } else {
            class631.field8854 = 0;
        }
        class387.field5759 = class90.field1610 + class119.field1913;
        if (class387.field5759 > class362.field5145) {
            class387.field5759 = class362.field5145;
        }
        class440.field6418 = class90.field1610 + class389.field5811;
        if (class440.field6418 > class305.field4400) {
            class440.field6418 = class305.field4400;
        }
        for (int var18 = 0; var18 < class90.field1610 + class90.field1610 + 2; ++var18) {
            for (int var23 = 0; var23 < class90.field1610 + class90.field1610 + 2; ++var23) {
                int var24 = class119.field1913 - class90.field1610 + var18;
                int var25 = class389.field5811 - class90.field1610 + var23;
                if (var24 >= 0 && var25 >= 0 && var24 < class362.field5145 && var25 < class305.field4400) {
                    int var26 = var24 << class162.field2401;
                    int var27 = var25 << class162.field2401;
                    int var28 = class587.field8363[class587.field8363.length - 1].method694(var24, var25) - (1000 << class162.field2401 - 7);
                    int var29 = class73.field1360 != null ? class73.field1360[0].method694(var24, var25) + class390.field5828 : class587.field8363[0].method694(var24, var25) + class390.field5828;
                    class604.field8600[var18][var23] = class103.field1747.method558(var26, var28, var27, var26, var29, var27);
                } else {
                    class604.field8600[var18][var23] = false;
                }
            }
        }
        for (int var19 = 0; var19 < class90.field1610 + class90.field1610 + 1; ++var19) {
            for (int var22 = 0; var22 < class90.field1610 + class90.field1610 + 1; ++var22) {
                class183.field2645[var19][var22] = class604.field8600[var19][var22] || class604.field8600[var19 + 1][var22] || class604.field8600[var19][var22 + 1] || class604.field8600[var19 + 1][var22 + 1];
            }
        }
        class218.field3288 = arg8;
        class457.field6593 = arg9;
        class602.field8572 = arg10;
        class499.field7002 = arg11;
        class111.field1846 = arg12;
        class382.method2330();
        class47.method423(class103.field1747, 11042);
        for (class465 var20 = (class465) class578.field8241.method944(83); var20 != null; var20 = (class465) class578.field8241.method947((byte) -13)) {
            var20.method2753(0);
            class161.method1131(var20, 10);
        }
        if (class58.field823) {
            for (int var21 = 0; var21 < class73.field1363; ++var21) {
                class477.field6820[var21].method3538(arg1, 83, arg17);
            }
        }
        if (arg2 > 1) {
            class103.field1747.method399(0);
            if (class181.field2624 == null || class181.field2624 instanceof class316) {
                class181.field2624 = new class99();
            }
        } else if (class181.field2624 == null || class181.field2624 instanceof class99) {
            class181.field2624 = new class316();
        }
        class181.field2624.method853(arg2, (byte) -98);
        class181.field2624.method849((byte) -96);
        if (class245.field3546 != null) {
            class555.method3111(true);
            class181.field2624.method846((byte) -59, 22);
            method1152(arg2, (byte[][][]) null, 0, (byte) 0, arg15, arg16);
            class181.field2624.method849((byte) -101);
            class181.field2624.method846((byte) -105, 23);
            class555.method3111(false);
        }
        method1152(arg2, arg7, arg13, arg14, arg15, arg16);
        class181.field2624.method849((byte) -82);
        class181.field2624.method855(-49);
        class181.field2624.method849((byte) -127);
        if (arg2 > 1) {
            class103.field1747.method398(0);
        }
        class103.field1747.method586(0, (class637[]) null);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIB)V")
    public final void method448(int arg0, int arg1, int arg2, byte arg3) {
        ++field2428;
        if (arg3 == 24) {
            super.field9253 = arg1;
            super.field9251 = arg2;
            super.field9249 = arg0;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IF)V")
    public final void method450(int arg0, float arg1) {
        super.field9252 = arg1;
        ++field2427;
        if (arg0 != 5065) {
            field2426 = null;
        }
    }
}
