import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class168 {

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "[I")
    public static int[] field2324 = new int[3];

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "I")
    public static int field2327 = 0;

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "I")
    public static int field2329 = 0;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!mm", name = "i", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!mm", name = "k", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "Lr;")
    public static class110 field2323;

    @OriginalMember(owner = "client!mm", name = "j", descriptor = "Lr;")
    public static class110 field2331;

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2325;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIII)V", line = 8)
    public static final void method990(int arg0, int arg1, int arg2, int arg3) {
        field2322++;
        class106 var4 = class250.method1400(9, 1, arg1);
        var4.method658(0);
        var4.field1589 = arg0;
        var4.field1590 = arg2;
        int var5 = 40 % ((arg3 + 67) / 52);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)V", line = 25)
    public static void method991(byte arg0) {
        field2331 = null;
        if (arg0 <= -109) {
            field2325 = null;
            field2323 = null;
            field2324 = null;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILnk;ILwm;IILkf;II)V", line = 38)
    public static final void method992(int arg0, class464 arg1, int arg2, class364 arg3, int arg4, int arg5, class152 arg6, int arg7, int arg8) {
        if (arg5 != 0) {
            field2329 = -112;
        }
        field2330++;
        class313 var9 = class464.field6319.method2710(26, arg2);
        if (var9 == null || !var9.field4141 || !var9.method1714(class38.field562, (byte) -86)) {
            return;
        }
        if (var9.field4122 != null) {
            int[] var10 = new int[var9.field4122.length];
            for (int var11 = 0; var11 < var10.length / 2; var11++) {
                int var13;
                if (class56.field772 == 4) {
                    var13 = (int) class270.field3610 & 0x3FFF;
                } else {
                    var13 = (int) class270.field3610 + class150.field2119 & 0x3FFF;
                }
                int var14 = class364.field4994[var13];
                int var15 = class364.field4992[var13];
                if (class56.field772 != 4) {
                    var15 = var15 * 256 / (class429.field5795 + 256);
                    var14 = var14 * 256 / (class429.field5795 + 256);
                }
                var10[var11 * 2] = ((var9.field4122[var11 * 2] * 4 + arg7) * var15 + (var9.field4122[var11 * 2 + 1] * 4 + arg4) * var14 >> 15) + arg1.field6308 / 2 + arg0;
                var10[var11 * 2 + 1] = arg8 + (arg1.field6340 / 2) - ((var9.field4122[var11 * 2 - -1] * 4 + arg4) * var15 + -((var9.field4122[var11 * 2] * 4 + arg7) * var14) >> 15);
            }
            class394.method2409(arg3, var10, var9.field4126, arg1.field6435, arg1.field6408);
            for (int var12 = 0; var12 < (var10.length / 2 - 1); var12++) {
                arg3.method1985(var10[var12 * 2], var10[var12 * 2 + 1], var10[(var12 + 1) * 2], var10[var12 * 2 + 2 + 1], var9.field4137, 1, arg6, arg0, arg8);
            }
            arg3.method1985(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field4137, 1, arg6, arg0, arg8);
        }
        class139 var16 = null;
        if (var9.field4134 != -1) {
            var16 = var9.method1723(arg3, true, false);
            if (var16 != null) {
                class182.method1070(arg6, arg7, arg0, arg4, var16, arg8, arg1, (byte) -84);
            }
        }
        if (var9.field4136 == null) {
            return;
        }
        int var17 = 0;
        if (var16 != null) {
            var17 = var16.method771();
        }
        class345 var18 = class490.field6832;
        class347 var19 = class93.field1363;
        if (var9.field4131 == 1) {
            var19 = class448.field6097;
            var18 = class284.field3828;
        }
        if (var9.field4131 == 2) {
            var18 = class93.field1366;
            var19 = class392.field5448;
        }
        class162.method952(arg0, arg4, 2, arg8, var9.field4147, arg7, var17, var18, var19, arg6, var9.field4136, arg1);
        return;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V", line = 141)
    public static final void method993(int arg0) {
        field2328++;
        int var1 = 0;
        if (arg0 != 1) {
            return;
        }
        while (class134.field1963 > var1) {
            int var10002 = class356.field4912[var1]--;
            if (class356.field4912[var1] >= -10) {
                label91: {
                    class85 var3 = class336.field4536[var1];
                    if (var3 == null) {
                        var3 = class85.method534(class265.field3506, class230.field3030[var1], 0);
                        if (var3 == null) {
                            break label91;
                        }
                        class356.field4912[var1] += var3.method535();
                        class336.field4536[var1] = var3;
                    }
                    if (class356.field4912[var1] < 0) {
                        label94: {
                            int var5;
                            if (class100.field1460[var1] == 0) {
                                var5 = class249.field3323[var1] * class488.field6789.field6687 >> 8;
                            } else {
                                int var4 = (class100.field1460[var1] & 0x3E61C94) >> 24;
                                if (class233.field3103.field6502 == var4) {
                                    int var6 = (class100.field1460[var1] & 0xFF) * 128;
                                    int var7 = (class100.field1460[var1] & 0xFF0986) >> 16;
                                    int var8 = var7 * 128 + 64 - class233.field3103.field6501;
                                    if (var8 < 0) {
                                        var8 = -var8;
                                    }
                                    int var9 = class100.field1460[var1] >> 8 & 0xFF;
                                    int var10 = var9 * 128 + 64 - class233.field3103.field6507;
                                    if (var10 < 0) {
                                        var10 = -var10;
                                    }
                                    int var11 = var8 + var10 - 128;
                                    if (var6 < var11) {
                                        class356.field4912[var1] = -100;
                                        break label94;
                                    }
                                    if (var11 < 0) {
                                        var11 = 0;
                                    }
                                    var5 = (var6 - var11) * class488.field6789.field6671 * class249.field3323[var1] / var6 >> 8;
                                } else {
                                    var5 = 0;
                                }
                            }
                            if (var5 > 0) {
                                class465 var12 = var3.method533().method2743(class159.field2197);
                                class44 var13 = class44.method314(var12, 100, var5);
                                var13.method292(class214.field2878[var1] - 1);
                                class181.field2494.method2206(var13);
                            }
                            class356.field4912[var1] = -100;
                        }
                    }
                }
            } else {
                class134.field1963--;
                for (int var2 = var1; var2 < class134.field1963; var2++) {
                    class230.field3030[var2] = class230.field3030[var2 + 1];
                    class336.field4536[var2] = class336.field4536[var2 + 1];
                    class214.field2878[var2] = class214.field2878[var2 + 1];
                    class356.field4912[var2] = class356.field4912[var2 + 1];
                    class100.field1460[var2] = class100.field1460[var2 + 1];
                    class249.field3323[var2] = class249.field3323[var2 + 1];
                }
                var1--;
            }
            var1++;
        }
        if (class219.field2925 && !class3.method25(-15284)) {
            if (class488.field6789.field6688 != 0 && class60.field811 != -1) {
                class9.method57(class488.field6789.field6688, (byte) 81, class60.field811, false, 0, class330.field4383);
            }
            class219.field2925 = false;
        } else if (class488.field6789.field6688 != 0 && class60.field811 != -1 && !class3.method25(arg0 - 15285)) {
            class491.method2861(class12.field170, 1);
            class342.field4577++;
            class203.field2751.method199((byte) -117, class60.field811);
            class60.field811 = -1;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)V", line = 278)
    public static final void method994(int arg0, int arg1) {
        if (arg0 == 26648) {
            field2332++;
            class106 var2 = class250.method1400(7, -41, arg1);
            var2.method659(-121);
        }
    }
}
