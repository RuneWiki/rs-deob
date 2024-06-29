import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class157 {

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "Z")
    public static boolean field2461 = true;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "S")
    public static short field2459 = 1;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
    public static int field2458;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
    public static int field2460;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
    public static int field2462;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
    public static final void method1177(int arg0) {
        field2460++;
        for (int var1 = 0; var1 < class148.field2361; var1++) {
            class150 var2 = class245.field3527[var1];
            boolean var3 = false;
            if (var2.field2390 == null) {
                var2.field2380--;
                if ((var2.field2382 == 2 ? -1500 : -10) > var2.field2380) {
                    var3 = true;
                } else {
                    if (var2.field2382 == 1 && var2.field2386 == null) {
                        var2.field2386 = class133.method990(class209.field3017, var2.field2379, 0);
                        if (var2.field2386 == null) {
                            continue;
                        }
                        var2.field2380 += var2.field2386.method987();
                    } else if (var2.field2382 == 2 && (var2.field2381 == null || var2.field2385 == null)) {
                        if (var2.field2381 == null) {
                            var2.field2381 = class375.method2332(class260.field3788, var2.field2379);
                        }
                        if (var2.field2381 == null) {
                            continue;
                        }
                        if (var2.field2385 == null) {
                            var2.field2385 = var2.field2381.method2333(new int[] { 22050 });
                            if (var2.field2385 == null) {
                                continue;
                            }
                        }
                    }
                    if (var2.field2380 < 0) {
                        int var11;
                        if (var2.field2383 == 0) {
                            var11 = class443.field6623.field630 * var2.field2384 >> 8;
                        } else {
                            int var4 = var2.field2383 >> 24 & 0x3;
                            if (class139.field2224.field6232 == var4) {
                                int var5 = (var2.field2383 & 0xFF) << 7;
                                int var6 = (var2.field2383 & 0xFF5657) >> 16;
                                int var7 = (var6 << 7) + 64 - class139.field2224.field6228;
                                if (var7 < 0) {
                                    var7 = -var7;
                                }
                                int var8 = (var2.field2383 & 0xFF0E) >> 8;
                                int var9 = (var8 << 7) + 64 - class139.field2224.field6233;
                                if (var9 < 0) {
                                    var9 = -var9;
                                }
                                int var10 = var7 + var9 - 128;
                                if (var10 > var5) {
                                    var2.field2380 = -99999;
                                    continue;
                                }
                                if (var10 < 0) {
                                    var10 = 0;
                                }
                                var11 = (var5 - var10) * class443.field6623.field607 * var2.field2384 / var5 >> 8;
                            } else {
                                var11 = 0;
                            }
                        }
                        if (var11 > 0) {
                            class189 var12 = null;
                            if (var2.field2382 == 1) {
                                var12 = var2.field2386.method989().method1324(class21.field426);
                            } else if (var2.field2382 == 2) {
                                var12 = var2.field2385;
                            }
                            class493 var13 = var2.field2390 = class493.method2933(var12, 100, var11);
                            var13.method2948(var2.field2389 - 1);
                            class45.field837.method2039(var13);
                        }
                    }
                }
            } else if (!var2.field2390.method2091((byte) 96)) {
                var3 = true;
            }
            if (var3) {
                class148.field2361--;
                for (int var14 = var1; var14 < class148.field2361; var14++) {
                    class245.field3527[var14] = class245.field3527[var14 + 1];
                }
                var1--;
            }
        }
        if (arg0 != 65294) {
            method1178(111, (byte) -62, -34, false, true);
        }
        if (class217.field3129 && !class517.method3090((byte) -96)) {
            if (class443.field6623.field594 != 0 && class281.field4026 != -1) {
                class3.method30(0, 9576, class443.field6623.field594, false, class281.field4026, class84.field1455);
            }
            class217.field3129 = false;
        } else if (class443.field6623.field594 != 0 && class281.field4026 != -1 && !class517.method3090((byte) -96)) {
            class28.method321(class36.field699, -5001);
            class215.field3100++;
            class410.field6141.method1117(class281.field4026, (byte) 12);
            class281.field4026 = -1;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IBIZZ)Lbu;")
    public static final class17 method1178(int arg0, byte arg1, int arg2, boolean arg3, boolean arg4) {
        field2457++;
        class438 var5 = null;
        if (class36.field693 != null) {
            var5 = new class438(arg2, class36.field693, class486.field7209[arg2], 1000000);
        }
        class197.field2914[arg2] = class11.field177.method2295((byte) 55, arg2, class193.field2855, var5);
        if (arg4) {
            class197.field2914[arg2].method1626(7874);
        }
        if (arg1 != 2) {
            method1179(22, -89, 112, -37, (byte) 77, -110);
        }
        return new class17(class197.field2914[arg2], arg3, arg0);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIBI)V")
    public static final void method1179(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (arg0 <= class389.field5859 && arg5 >= class70.field1213) {
            boolean var6;
            if (class315.field4754 > arg1) {
                var6 = false;
                arg1 = class315.field4754;
            } else if (arg1 <= class156.field2455) {
                var6 = true;
            } else {
                arg1 = class156.field2455;
                var6 = false;
            }
            boolean var7;
            if (arg3 < class315.field4754) {
                var7 = false;
                arg3 = class315.field4754;
            } else if (class156.field2455 >= arg3) {
                var7 = true;
            } else {
                var7 = false;
                arg3 = class156.field2455;
            }
            if (class70.field1213 > arg0) {
                arg0 = class70.field1213;
            } else {
                class179.method1269(class21.field430[arg0++], arg2, arg1, arg3, 26985);
            }
            if (arg5 > class389.field5859) {
                arg5 = class389.field5859;
            } else {
                class179.method1269(class21.field430[arg5--], arg2, arg1, arg3, 26985);
            }
            if (var6 && var7) {
                for (int var8 = arg0; var8 <= arg5; var8++) {
                    int[] var9 = class21.field430[var8];
                    var9[arg1] = var9[arg3] = arg2;
                }
            } else if (var6) {
                for (int var10 = arg0; var10 <= arg5; var10++) {
                    class21.field430[var10][arg1] = arg2;
                }
            } else if (var7) {
                for (int var11 = arg0; var11 <= arg5; var11++) {
                    class21.field430[var11][arg3] = arg2;
                }
            }
        }
        field2458++;
        int var12 = 117 % ((arg4 - 7) / 55);
    }
}
