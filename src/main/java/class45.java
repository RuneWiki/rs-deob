import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class45 extends class198 {

    @OriginalMember(owner = "client!sd", name = "K", descriptor = "Ljava/lang/String;")
    public static String field614 = " has logged in.";

    @OriginalMember(owner = "client!sd", name = "J", descriptor = "I")
    public static int field613 = 0;

    @OriginalMember(owner = "client!sd", name = "V", descriptor = "Z")
    public static boolean field624 = false;

    @OriginalMember(owner = "client!sd", name = "W", descriptor = "Z")
    public static boolean field625 = false;

    @OriginalMember(owner = "client!sd", name = "M", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!sd", name = "O", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!sd", name = "P", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "client!sd", name = "Q", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!sd", name = "R", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!sd", name = "S", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!sd", name = "T", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!sd", name = "U", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!sd", name = "N", descriptor = "Lfa;")
    public static class273 field616;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "(B)V")
    public static final void method285(byte arg0) {
        ++field618;
        int var1 = class226.method1572(arg0 + 12394);
        if (~var1 != -1) {
            if (var1 == 1) {
                class162.method1074((byte) 0, 9605);
                class284.method2001(1, 512);
                if (class128.field1972 != null) {
                    class65.method419((byte) -32);
                }
            } else {
                class162.method1074((byte) (class80.field1274 + -4 & 255), 9605);
                class284.method2001(1, 2);
            }
        } else {
            class219.field3506 = null;
            class284.method2001(1, 0);
        }
        class272.field4470 = class165.field2600;
        if (arg0 != -111) {
            method286((String) null, 74);
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(Ljava/lang/String;I)V")
    public static final void method286(String arg0, int arg1) {
        ++field620;
        if (arg0 != null) {
            if ((~class140.field2164 > -101 || class63.field950) && class140.field2164 < 200) {
                String var2 = class304.method2088(arg0, 2);
                if (var2 != null) {
                    for (int var3 = 0; ~var3 > ~class140.field2164; ++var3) {
                        String var7 = class304.method2088(class120.field1848[var3], arg1 ^ -12317);
                        if (var7 != null && var7.equals(var2)) {
                            class286.method2013((byte) -117, arg0 + class14.field210);
                            return;
                        }
                        if (class241.field3808[var3] != null) {
                            String var8 = class304.method2088(class241.field3808[var3], arg1 + 12321);
                            if (var8 != null && var8.equals(var2)) {
                                class286.method2013((byte) -104, arg0 + class14.field210);
                                return;
                            }
                        }
                    }
                    for (int var4 = 0; ~class20.field270 < ~var4; ++var4) {
                        String var5 = class304.method2088(class143.field2257[var4], 2);
                        if (var5 != null && var5.equals(var2)) {
                            class286.method2013((byte) -123, class59.field896 + arg0 + class272.field4469);
                            return;
                        }
                        if (class296.field4876[var4] != null) {
                            String var6 = class304.method2088(class296.field4876[var4], arg1 ^ -12317);
                            if (var6 != null && var6.equals(var2)) {
                                class286.method2013((byte) -127, class59.field896 + arg0 + class272.field4469);
                                return;
                            }
                        }
                    }
                    if (class304.method2088(class309.field5006.field3329, arg1 ^ -12317).equals(var2)) {
                        class286.method2013((byte) -90, class74.field1164);
                    } else {
                        class276.field4572.method1391(0, 7);
                        class276.field4572.method1446((byte) 97, class187.method1270((byte) -106, arg0));
                        class276.field4572.method1409(arg0, (byte) 77);
                        ++class200.field3179;
                        if (arg1 != -12319) {
                            method287(false, -88, -76, -68, 8, 4, -68, 103, -46, 92);
                        }
                    }
                }
            } else {
                class286.method2013((byte) -98, class292.field4823);
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZIIIIIIIII)V")
    public static final void method287(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (~arg1 <= ~class53.field711 && class87.field1356 >= arg1 && arg8 >= class53.field711 && class87.field1356 >= arg8 && arg7 >= class53.field711 && class87.field1356 >= arg7 && class53.field711 <= arg9 && class87.field1356 >= arg9 && class63.field941 <= arg3 && arg3 <= class75.field1180 && arg2 >= class63.field941 && arg2 <= class75.field1180 && class63.field941 <= arg6 && ~class75.field1180 <= ~arg6 && ~arg4 <= ~class63.field941 && arg4 <= class75.field1180) {
            class72.method453(arg6, arg2, arg3, arg8, arg9, arg4, 1, arg5, arg1, arg7);
        } else {
            class105.method679(arg7, arg4, arg1, arg3, 23044, arg9, arg8, arg2, arg5, arg6);
        }
        if (arg0) {
            method286((String) null, 23);
        }
        ++field619;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZI)[I")
    public final int[] method32(boolean arg0, int arg1) {
        if (!arg0) {
            field613 = -55;
        }
        int[] var3 = super.field3134.method36(arg1, 30672);
        if (super.field3134.field69) {
            int[] var4 = this.method1367((byte) -79, 0, arg1);
            int[] var5 = this.method1367((byte) -79, 1, arg1);
            int[] var6 = this.method1367((byte) -79, 2, arg1);
            for (int var7 = 0; ~var7 > ~class42.field590; ++var7) {
                int var8 = var6[var7];
                if (~var8 == -4097) {
                    var3[var7] = var4[var7];
                } else if (var8 == 0) {
                    var3[var7] = var5[var7];
                } else {
                    var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                }
            }
        }
        ++field622;
        return var3;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)[[I")
    public final int[][] method200(int arg0, int arg1) {
        int[][] var3 = super.field3150.method642(arg0, 1);
        ++field617;
        if (super.field3150.field1498) {
            int[] var4 = this.method1367((byte) -79, 2, arg0);
            int[][] var5 = this.method1372(0, arg0, (byte) 96);
            int[][] var6 = this.method1372(1, arg0, (byte) 86);
            int[] var7 = var3[1];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[1];
            int[] var14 = var6[0];
            int[] var15 = var6[2];
            for (int var16 = 0; var16 < class42.field590; ++var16) {
                int var17 = var4[var16];
                if (var17 != 4096) {
                    if (var17 != 0) {
                        int var18 = 4096 - var17;
                        var8[var16] = var10[var16] * var17 + var14[var16] * var18 >> 12;
                        var7[var16] = var11[var16] * var17 - -(var13[var16] * var18) >> 12;
                        var9[var16] = var12[var16] * var17 - -(var15[var16] * var18) >> 12;
                    } else {
                        var8[var16] = var14[var16];
                        var7[var16] = var13[var16];
                        var9[var16] = var15[var16];
                    }
                } else {
                    var8[var16] = var10[var16];
                    var7[var16] = var11[var16];
                    var9[var16] = var12[var16];
                }
            }
        }
        if (arg1 != -2) {
            field616 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "(B)V")
    public static void method288(byte arg0) {
        if (arg0 > -105) {
            method286((String) null, -78);
        }
        field614 = null;
        field616 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILma;I)V")
    public final void method52(int arg0, class202 arg1, int arg2) {
        ++field615;
        int var4 = 67 % ((arg0 - 60) / 61);
        if (~arg2 == -1) {
            super.field3139 = arg1.method1420((byte) 0) == 1;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIILcl;I)V")
    public static final void method289(int arg0, int arg1, int arg2, class208 arg3, int arg4) {
        ++field623;
        if (class309.field5006 != arg3) {
            if (~class18.field251 > -401) {
                String var11;
                if (arg3.field3348 == 0) {
                    boolean var5 = true;
                    if (~class309.field5006.field3312 != 0 && arg3.field3312 != -1) {
                        int var6 = ~arg3.field3330 > ~class309.field5006.field3330 ? class309.field5006.field3330 : arg3.field3330;
                        int var7 = ~arg3.field3312 < ~class309.field5006.field3312 ? class309.field5006.field3312 : arg3.field3312;
                        int var8 = var6 * 10 / 100 + 5 + var7;
                        int var9 = class309.field5006.field3330 - arg3.field3330;
                        if (~var9 > -1) {
                            var9 = -var9;
                        }
                        if (~var9 < ~var8) {
                            var5 = false;
                        }
                    }
                    String var10 = class121.field1857 != 1 ? class19.field255 : class74.field1113;
                    if (arg3.field3330 >= arg3.field3315) {
                        var11 = arg3.method1474(255, true) + (var5 ? class297.method2066(class309.field5006.field3330, arg3.field3330, (byte) 84) : "<col=ffffff>") + " (" + var10 + arg3.field3330 + ")";
                    } else {
                        var11 = arg3.method1474(255, true) + (!var5 ? "<col=ffffff>" : class297.method2066(class309.field5006.field3330, arg3.field3330, (byte) 107)) + " (" + var10 + arg3.field3330 + "+" + (-arg3.field3330 + arg3.field3315) + ")";
                    }
                } else {
                    var11 = arg3.method1474(255, true) + " (" + class257.field4230 + arg3.field3348 + ")";
                }
                if (~class29.field367 == -2) {
                    ++class242.field3836;
                    class192.method1333(arg4, class18.field250, (long) arg1, class43.field602 + " -> <col=ffffff>" + var11, (short) 57, arg2, class19.field258, 9910);
                } else if (!class70.field1017) {
                    for (int var12 = 7; ~var12 <= -1; --var12) {
                        if (class119.field1837[var12] != null) {
                            ++class280.field4633;
                            short var13 = 0;
                            boolean var14 = false;
                            if (~class121.field1857 == -1 && class119.field1837[var12].equalsIgnoreCase(class90.field1393)) {
                                if (~class309.field5006.field3330 > ~arg3.field3330) {
                                    var13 = 2000;
                                }
                                if (class309.field5006.field3341 != 0 && arg3.field3341 != 0) {
                                    if (class309.field5006.field3341 != arg3.field3341) {
                                        var13 = 0;
                                    } else {
                                        var13 = 2000;
                                    }
                                }
                            } else if (class200.field3194[var12]) {
                                var13 = 2000;
                            }
                            short var15 = class31.field399[var12];
                            short var16 = (short) (var13 + var15);
                            class192.method1333(arg4, class119.field1837[var12], (long) arg1, "<col=ffffff>" + var11, var16, arg2, class145.field2276[var12], arg0 ^ 9916);
                        }
                    }
                } else if ((client.field2581 & 8) != 0) {
                    ++class118.field1793;
                    class192.method1333(arg4, class70.field1019, (long) arg1, class265.field4368 + " -> <col=ffffff>" + var11, (short) 4, arg2, class44.field611, 9910);
                }
                if (arg0 == 10) {
                    for (int var17 = 0; ~var17 > ~class18.field251; ++var17) {
                        if (class70.field1016[var17] == 44) {
                            class156.field2472[var17] = "<col=ffffff>" + var11;
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V")
    public class45() {
        super(3, false);
    }
}
