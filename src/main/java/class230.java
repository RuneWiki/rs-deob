import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class230 {

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!ns", name = "d", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!ns", name = "f", descriptor = "I")
    public static int field3835;

    @OriginalMember(owner = "client!ns", name = "i", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "Lid;")
    public class348 field3831;

    @OriginalMember(owner = "client!ns", name = "g", descriptor = "Lsn;")
    public static class375 field3836;

    @OriginalMember(owner = "client!ns", name = "h", descriptor = "Lmo;")
    public static class447 field3837;

    @OriginalMember(owner = "client!ns", name = "e", descriptor = "Las;")
    public class84 field3834;

    @OriginalMember(owner = "client!ns", name = "j", descriptor = "[[[I")
    public static int[][][] field3839;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(ZLmo;ILmo;)V")
    public static final void method1632(boolean arg0, class447 arg1, int arg2, class447 arg3) {
        field3835++;
        class28.field324 = arg3;
        class85.field1051 = arg1;
        if (arg2 > -92) {
            method1634((String) null, (String) null, 105, (String) null);
        }
        class358.field5479 = arg0;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(B)V")
    public static void method1633(byte arg0) {
        if (arg0 < 103) {
            method1635(122, 44, 10, true);
        }
        field3839 = null;
        field3837 = null;
        field3836 = null;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;")
    public static final String method1634(String arg0, String arg1, int arg2, String arg3) {
        field3838++;
        if (arg2 != 0) {
            method1632(true, (class447) null, -120, (class447) null);
        }
        for (int var4 = arg1.indexOf(arg3); var4 != -1; var4 = arg1.indexOf(arg3, arg0.length() + var4)) {
            arg1 = arg1.substring(0, var4) + arg0 + arg1.substring(var4 + arg3.length());
        }
        return arg1;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IIIZ)I")
    public static final int method1635(int arg0, int arg1, int arg2, boolean arg3) {
        field3833++;
        if (arg0 == arg2) {
            return arg2;
        }
        int var4 = 128 - arg1;
        if (arg3) {
            return 24;
        } else {
            int var5 = (arg0 & 0x7F) * arg1 + (arg2 & 0x7F) * var4 >> 7;
            int var6 = (arg0 & 0x380) * arg1 + (arg2 & 0x380) * var4 >> 7;
            int var7 = (arg0 & 0xFC00) * arg1 + (arg2 & 0xFC00) * var4 >> 7;
            return var6 & 0x380 | var7 & 0xFC00 | var5 & 0x7F;
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Z)V")
    public static final void method1636(boolean arg0) {
        field3832++;
        class52 var1 = class47.field584;
        synchronized (class47.field584) {
            class47.field584.method336(-64);
            if (!arg0) {
                field3836 = null;
            }
        }
        class52 var2 = class68.field849;
        synchronized (class68.field849) {
            class68.field849.method336(-107);
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(ZIBLe;[Lfn;Llf;)V")
    public static final void method1637(boolean arg0, int arg1, byte arg2, class312 arg3, class72[] arg4, class129 arg5) {
        if (!arg0) {
            for (int var6 = 0; var6 < 4; var6++) {
                for (int var7 = 0; var7 < class80.field1003; var7++) {
                    for (int var8 = 0; var8 < class380.field5751; var8++) {
                        if ((class31.field382[var6][var7][var8] & 0x1) != 0) {
                            int var9 = var6;
                            if ((class31.field382[1][var7][var8] & 0x2) != 0) {
                                var9 = var6 - 1;
                            }
                            if (var9 >= 0) {
                                arg4[var9].method453(var7, -23274, var8);
                            }
                        }
                    }
                }
            }
        }
        field3830++;
        if (arg2 < 112) {
            method1637(true, -83, (byte) -62, (class312) null, (class72[]) null, (class129) null);
        }
        int[][] var10 = new int[class80.field1003][class380.field5751];
        for (int var11 = 0; var11 < arg1; var11++) {
            for (int var13 = 0; var13 < class380.field5751; var13++) {
                class189.field3096[var13] = 0;
                class272.field4377[var13] = 0;
                class325.field5100[var13] = 0;
                class47.field585[var13] = 0;
                class262.field4202[var13] = 0;
            }
            for (int var14 = -5; var14 < class80.field1003; var14++) {
                for (int var15 = 0; var15 < class380.field5751; var15++) {
                    int var24 = var14 + 5;
                    int var10002;
                    if (var24 < class80.field1003) {
                        int var25 = class172.field2804[var11][var24][var15] & 0xFF;
                        if (var25 > 0) {
                            class402 var26 = class92.method545(var25 - 1, (byte) 123);
                            class189.field3096[var15] += var26.field5999;
                            class272.field4377[var15] += var26.field6008;
                            class325.field5100[var15] += var26.field6006;
                            class47.field585[var15] += var26.field5991;
                            var10002 = class262.field4202[var15]++;
                        }
                    }
                    int var27 = var14 - 5;
                    if (var27 >= 0) {
                        int var28 = class172.field2804[var11][var27][var15] & 0xFF;
                        if (var28 > 0) {
                            class402 var29 = class92.method545(var28 - 1, (byte) 123);
                            class189.field3096[var15] -= var29.field5999;
                            class272.field4377[var15] -= var29.field6008;
                            class325.field5100[var15] -= var29.field6006;
                            class47.field585[var15] -= var29.field5991;
                            var10002 = class262.field4202[var15]--;
                        }
                    }
                }
                if (var14 >= 0) {
                    int var16 = 0;
                    int var17 = 0;
                    int var18 = 0;
                    int var19 = 0;
                    int var20 = 0;
                    for (int var21 = -5; var21 < class380.field5751; var21++) {
                        int var22 = var21 + 5;
                        if (class380.field5751 > var22) {
                            var17 += class272.field4377[var22];
                            var16 += class189.field3096[var22];
                            var20 += class262.field4202[var22];
                            var18 += class325.field5100[var22];
                            var19 += class47.field585[var22];
                        }
                        int var23 = var21 - 5;
                        if (var23 >= 0) {
                            var17 -= class272.field4377[var23];
                            var19 -= class47.field585[var23];
                            var18 -= class325.field5100[var23];
                            var16 -= class189.field3096[var23];
                            var20 -= class262.field4202[var23];
                        }
                        if (var21 >= 0 && var19 > 0 && var20 > 0) {
                            var10[var14][var21] = class141.method1031(var16 * 256 / var19, var18 / var20, var17 / var20, (byte) 38);
                        }
                    }
                }
            }
            class94.method553(arg3, class172.field2804[var11], arg5, class135.field2117[var11], class314.field4936[var11], class12.field176[var11], var11, -1, var10, arg0, class80.field1003, class275.field4396[var11], class380.field5751);
            class172.field2804[var11] = null;
            class12.field176[var11] = null;
            class314.field4936[var11] = null;
            class135.field2117[var11] = null;
        }
        if (!arg0) {
            if (class377.field5695) {
                class67.method427();
            }
            if (class299.field4755 != 0) {
                class303.method2037();
            }
        }
        for (int var12 = 0; var12 < arg1; var12++) {
            class275.field4396[var12].method780();
        }
    }
}
