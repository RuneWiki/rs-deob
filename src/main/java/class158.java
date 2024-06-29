import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class158 extends RuntimeException {

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "Ljava/lang/Throwable;")
    public Throwable field2541;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "Ljava/lang/String;")
    public String field2545;

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "I")
    public static int field2546 = 0;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "Lqj;")
    public static class196 field2543 = class80.method502("Nehmen", -48);

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
    public static int field2549 = 1;

    @OriginalMember(owner = "client!kg", name = "l", descriptor = "I")
    public static int field2552 = 0;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "Lqj;")
    public static class196 field2542 = class80.method502("::fpsoff", -48);

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IB)Lqj;")
    public static final class196 method994(int arg0, byte arg1) {
        field2548++;
        class196 var2 = new class196();
        if (arg1 < 91) {
            method996(true);
        }
        var2.field3448 = new byte[arg0];
        var2.field3459 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)V")
    public static final void method995(int arg0, int arg1) {
        field2547++;
        if (arg1 == -1 || !class35.method182(arg1, (byte) -42)) {
            return;
        }
        class178[] var2 = class91.field1335[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class178 var4 = var2[var3];
            if (var4.field3130 != null) {
                class157 var5 = new class157();
                var5.field2526 = var4;
                var5.field2534 = var4.field3130;
                class129.method790(2000000, var5, 8952);
            }
        }
        if (arg0 != 29288) {
            method996(false);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Z)V")
    public static void method996(boolean arg0) {
        if (arg0) {
            field2552 = -49;
        }
        field2543 = null;
        field2542 = null;
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(Z)V")
    public static final void method997(boolean arg0) {
        field2550++;
        if (arg0) {
            return;
        }
        if (class25.field315 > class199.field3530) {
            class199.field3530 += class199.field3530 / 30.0D;
            if (class199.field3530 > class25.field315) {
                class199.field3530 = class25.field315;
            }
            class24.method142(-5522);
        } else if (class25.field315 < class199.field3530) {
            class199.field3530 -= class199.field3530 / 30.0D;
            if (class25.field315 > class199.field3530) {
                class199.field3530 = class25.field315;
            }
            class24.method142(-5522);
        }
        if (class45.field537 == -1 || class120.field1737 == -1) {
            return;
        }
        int var1 = class45.field537 - class157.field2537;
        if (var1 < 2 || var1 > 2) {
            var1 >>= 0x4;
        }
        class157.field2537 -= -var1;
        int var2 = class120.field1737 - class126.field1784;
        if (var2 < 2 || var2 > 2) {
            var2 >>= 0x4;
        }
        if (var1 == 0 && var2 == 0) {
            class120.field1737 = -1;
            class45.field537 = -1;
        }
        class126.field1784 += var2;
        class24.method142(-5522);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Leg;IIIIIIZ)V")
    public static final void method998(class140 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field2156.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var22 = arg0.field2156[var9] - class202.field3586;
            int var23 = arg0.field2149[var9] - class253.field4483;
            int var24 = arg0.field2152[var9] - class224.field4012;
            int var25 = arg3 * var24 + arg4 * var22 >> 16;
            int var26 = arg4 * var24 - arg3 * var22 >> 16;
            int var28 = arg2 * var23 - arg1 * var26 >> 16;
            int var29 = arg1 * var23 + arg2 * var26 >> 16;
            if (var29 < 50) {
                return;
            }
            if (arg0.field2142 != null) {
                class140.field2141[var9] = var25;
                class140.field2150[var9] = var28;
                class140.field2161[var9] = var29;
            }
            class140.field2160[var9] = (var25 << 9) / var29 + class15.field168;
            class140.field2162[var9] = (var28 << 9) / var29 + class15.field167;
        }
        class15.field159 = 0;
        int var10 = arg0.field2151.length;
        for (int var11 = 0; var11 < var10; var11++) {
            int var12 = arg0.field2151[var11];
            int var13 = arg0.field2145[var11];
            int var14 = arg0.field2146[var11];
            int var15 = class140.field2160[var12];
            int var16 = class140.field2160[var13];
            int var17 = class140.field2160[var14];
            int var18 = class140.field2162[var12];
            int var19 = class140.field2162[var13];
            int var20 = class140.field2162[var14];
            if ((var15 - var16) * (var20 - var19) - (var17 - var16) * (var18 - var19) > 0) {
                if (class161.field2587 && class232.method1557(class165.field2696 + class15.field168, class176.field2970 + class15.field167, var18, var19, var20, var15, var16, var17)) {
                    class183.field3220 = arg5;
                    class19.field227 = arg6;
                }
                if (!arg7) {
                    class15.field163 = false;
                    if (var15 < 0 || var16 < 0 || var17 < 0 || var15 > class15.field175 || var16 > class15.field175 || var17 > class15.field175) {
                        class15.field163 = true;
                    }
                    if (arg0.field2142 == null || arg0.field2142[var11] == -1) {
                        if (arg0.field2159[var11] != 12345678) {
                            class15.method65(var18, var19, var20, var15, var16, var17, arg0.field2159[var11], arg0.field2154[var11], arg0.field2155[var11]);
                        }
                    } else if (!class19.field228) {
                        int var21 = class15.field171.method1203(-98, arg0.field2142[var11]);
                        class15.method65(var18, var19, var20, var15, var16, var17, class136.method844(var21, arg0.field2159[var11]), class136.method844(var21, arg0.field2154[var11]), class136.method844(var21, arg0.field2155[var11]));
                    } else if (arg0.field2148) {
                        class15.method78(var18, var19, var20, var15, var16, var17, arg0.field2159[var11], arg0.field2154[var11], arg0.field2155[var11], class140.field2141[0], class140.field2141[1], class140.field2141[3], class140.field2150[0], class140.field2150[1], class140.field2150[3], class140.field2161[0], class140.field2161[1], class140.field2161[3], arg0.field2142[var11]);
                    } else {
                        class15.method78(var18, var19, var20, var15, var16, var17, arg0.field2159[var11], arg0.field2154[var11], arg0.field2155[var11], class140.field2141[var12], class140.field2141[var13], class140.field2141[var14], class140.field2150[var12], class140.field2150[var13], class140.field2150[var14], class140.field2161[var12], class140.field2161[var13], class140.field2161[var14], arg0.field2142[var11]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class158(Throwable arg0, String arg1) {
        this.field2541 = arg0;
        this.field2545 = arg1;
    }
}
