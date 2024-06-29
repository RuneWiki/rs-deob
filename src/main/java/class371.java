import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class371 {

    @OriginalMember(owner = "client!sk", name = "v", descriptor = "Lpm;")
    public static class349 field5291 = new class349("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");

    @OriginalMember(owner = "client!sk", name = "z", descriptor = "[Z")
    public static boolean[] field5295 = new boolean[8];

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "I")
    public int field5270;

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "I")
    public static int field5271;

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "I")
    public int field5272;

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "I")
    public int field5273;

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "I")
    public static int field5274;

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "I")
    public int field5275;

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "I")
    public int field5276;

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "I")
    public int field5277;

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "I")
    public int field5278;

    @OriginalMember(owner = "client!sk", name = "j", descriptor = "I")
    public static int field5279;

    @OriginalMember(owner = "client!sk", name = "k", descriptor = "I")
    public int field5280;

    @OriginalMember(owner = "client!sk", name = "l", descriptor = "I")
    public static int field5281;

    @OriginalMember(owner = "client!sk", name = "m", descriptor = "I")
    public int field5282;

    @OriginalMember(owner = "client!sk", name = "n", descriptor = "I")
    public int field5283;

    @OriginalMember(owner = "client!sk", name = "o", descriptor = "I")
    public int field5284;

    @OriginalMember(owner = "client!sk", name = "p", descriptor = "I")
    public int field5285;

    @OriginalMember(owner = "client!sk", name = "q", descriptor = "I")
    public static int field5286;

    @OriginalMember(owner = "client!sk", name = "r", descriptor = "I")
    public int field5287;

    @OriginalMember(owner = "client!sk", name = "s", descriptor = "I")
    public int field5288;

    @OriginalMember(owner = "client!sk", name = "t", descriptor = "I")
    public int field5289;

    @OriginalMember(owner = "client!sk", name = "u", descriptor = "I")
    public int field5290;

    @OriginalMember(owner = "client!sk", name = "w", descriptor = "I")
    public static int field5292;

    @OriginalMember(owner = "client!sk", name = "x", descriptor = "I")
    public int field5293;

    @OriginalMember(owner = "client!sk", name = "y", descriptor = "I")
    public int field5294;

    // $FF: synthetic field
    @OriginalMember(owner = "client!sk", name = "A", descriptor = "Ljava/lang/Class;")
    public static Class field5296;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2379(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class371 var7 = new class371();
        var7.field5294 = arg1 >> 7;
        var7.field5283 = arg2 >> 7;
        var7.field5287 = arg3 >> 7;
        var7.field5276 = arg4 >> 7;
        var7.field5270 = arg0;
        var7.field5275 = arg1;
        var7.field5282 = arg2;
        var7.field5272 = arg3;
        var7.field5285 = arg4;
        var7.field5280 = arg5;
        var7.field5273 = arg6;
        class204.field2875[class10.field126++] = var7;
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(IIIIIII)I")
    public static final int method2380(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg6 != 7) {
            field5295 = null;
        }
        int var7 = arg2 & 0x3;
        if ((arg3 & 0x1) == 1) {
            int var8 = arg4;
            arg4 = arg0;
            arg0 = var8;
        }
        field5274++;
        if (var7 == 0) {
            return arg5;
        } else if (var7 == 1) {
            return 7 - (arg4 - 1) - arg1;
        } else if (var7 == 2) {
            return 1 + 7 - arg0 - arg5;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(III)I")
    public static final int method2381(int arg0, int arg1, int arg2) {
        int var3 = -8 % ((-arg0 - 82) / 34);
        field5281++;
        if (arg2 == -2) {
            return 12345678;
        } else if (arg2 == -1) {
            if (arg1 < 2) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return arg1;
        } else {
            int var4 = (arg2 & 0x7F) * arg1 >> 7;
            if (var4 < 2) {
                var4 = 2;
            } else if (var4 > 126) {
                var4 = 126;
            }
            return (arg2 & 0xFF80) + var4;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Z)V")
    public static void method2382(boolean arg0) {
        if (arg0) {
            field5295 = null;
            field5291 = null;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)V")
    public static final void method2383(byte arg0) {
        field5271++;
        if (class86.field1122 > 0) {
            class185.method1327((byte) 64);
            return;
        }
        class129.field1835 = class199.field2847;
        if (arg0 == 102) {
            class199.field2847 = null;
            class390.method2463(40, true);
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZIIIIIII)V")
    public static final void method2384(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5279++;
        if (arg0) {
            method2381(3, -49, -62);
        }
        if (arg7 < 0 || arg1 < 0 || arg7 >= class80.field1034 - 1 || class381.field5414 - 1 <= arg1) {
            return;
        }
        if (class385.field5449 == null) {
            return;
        }
        if (arg6 == 0) {
            class143 var8 = (class143) class431.method2683(arg4, arg7, arg1);
            class143 var9 = (class143) class299.method2013(arg4, arg7, arg1);
            if (var8 != null && arg2 != 2) {
                if ((var8 instanceof class224)) {
                    ((class224) var8).field3365.method1711(true, arg5);
                } else {
                    class333.method2185(arg5, arg1, arg2, var8.method599(-10450), -51, arg7, arg4, arg3, arg6);
                }
            }
            if (var9 != null) {
                if (var9 instanceof class224) {
                    ((class224) var9).field3365.method1711(true, arg5);
                    return;
                }
                class333.method2185(arg5, arg1, arg2, var9.method599(-10450), -83, arg7, arg4, arg3, arg6);
                return;
            }
            return;
        }
        if (arg6 == 1) {
            class143 var10 = (class143) class145.method1084(arg4, arg7, arg1);
            if (var10 != null) {
                if (!(var10 instanceof class405)) {
                    int var11 = var10.method599(-10450);
                    if (arg2 != 4 && arg2 != 5) {
                        if (arg2 == 6) {
                            class333.method2185(arg5, arg1, 4, var11, 121, arg7, arg4, arg3 + 4, arg6);
                        } else if (arg2 == 7) {
                            class333.method2185(arg5, arg1, 4, var11, 93, arg7, arg4, (arg3 + 2 & 0x3) + 4, arg6);
                            return;
                        } else if (arg2 == 8) {
                            class333.method2185(arg5, arg1, 4, var11, 108, arg7, arg4, arg3 + 4, arg6);
                            class333.method2185(arg5, arg1, 4, var11, 110, arg7, arg4, (arg3 + 2 & 0x3) + 4, arg6);
                            return;
                        }
                        return;
                    }
                    class333.method2185(arg5, arg1, 4, var11, -56, arg7, arg4, arg3, arg6);
                    return;
                }
                ((class405) var10).field5677.method1711(!arg0, arg5);
                return;
            }
            return;
        }
        if (arg6 != 2) {
            if (arg6 == 3) {
                class143 var12 = (class143) class353.method2309(arg4, arg7, arg1);
                if (var12 != null) {
                    if (!(var12 instanceof class347)) {
                        class333.method2185(arg5, arg1, arg2, var12.method599(-10450), 75, arg7, arg4, arg3, arg6);
                        return;
                    }
                    ((class347) var12).field5072.method1711(true, arg5);
                    return;
                }
            }
            return;
        }
        class143 var13 = (class143) class233.method1613(arg4, arg7, arg1, field5296 == null ? (field5296 = method2387("mb")) : field5296);
        if (var13 == null) {
            return;
        }
        if (arg2 == 11) {
            arg2 = 10;
        }
        if (!(var13 instanceof class342)) {
            class333.method2185(arg5, arg1, arg2, var13.method599(-10450), -57, arg7, arg4, arg3, arg6);
            return;
        }
        ((class342) var13).field4957.method1711(true, arg5);
        return;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)V")
    public static final void method2385(int arg0) {
        field5292++;
        if (arg0 != 6) {
            field5291 = null;
        }
        class173.field2446.method102((byte) -76);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIILlf;ZIZIII)V")
    public static final void method2386(int arg0, int arg1, int arg2, int arg3, int arg4, class130 arg5, boolean arg6, int arg7, boolean arg8, int arg9, int arg10, int arg11) {
        if (arg3 == 1) {
            arg10 = 1;
        } else if (arg3 == 2) {
            arg10 = 1;
            arg1 = 1;
        } else if (arg3 == 3) {
            arg1 = 1;
        }
        field5286++;
        if (arg9 >= 0 && class80.field1034 > arg9 && arg4 >= 0 && class381.field5414 > arg4) {
            if (!arg6 && !arg8) {
                class320.field4692[arg7][arg9][arg4] = 0;
            }
            while (true) {
                int var12 = arg5.method837(true);
                if (var12 == 0) {
                    if (arg6) {
                        class207.field2975[0][arg1 + arg9][arg4 + arg10] = class126.field1734[0].method359(arg9 + arg1, arg4 + arg10);
                    } else if (arg7 == 0) {
                        class207.field2975[0][arg1 + arg9][arg4 + arg10] = -class253.method1760(arg11 + 932731, class417.method2632(arg0, -9509), arg2 + 556238) * 8;
                    } else {
                        class207.field2975[arg7][arg1 + arg9][arg4 + arg10] = class207.field2975[arg7 - 1][arg1 + arg9][arg4 + arg10] - 240;
                    }
                    break;
                }
                if (var12 == 1) {
                    int var13 = arg5.method837(true);
                    if (arg6) {
                        class207.field2975[0][arg1 + arg9][arg4 + arg10] = class126.field1734[0].method359(arg1 + arg9, arg4 + arg10) + (var13 * 8);
                    } else {
                        if (var13 == 1) {
                            var13 = 0;
                        }
                        if (arg7 == 0) {
                            class207.field2975[0][arg1 + arg9][arg4 + arg10] = -var13 * 8;
                        } else {
                            class207.field2975[arg7][arg1 + arg9][arg4 + arg10] = class207.field2975[arg7 - 1][arg1 + arg9][arg4 + arg10] - (var13 * 8);
                        }
                    }
                    break;
                }
                if (var12 <= 49) {
                    if (arg8) {
                        arg5.method837(true);
                    } else {
                        class246.field3678[arg7][arg9][arg4] = arg5.method823((byte) -48);
                        class336.field4877[arg7][arg9][arg4] = (byte) ((var12 - 2) / 4);
                        class214.field3049[arg7][arg9][arg4] = (byte) class209.method1483(3, var12 + arg3 - 2);
                    }
                } else if (var12 <= 81) {
                    if (!arg6 && !arg8) {
                        class320.field4692[arg7][arg9][arg4] = (byte) (var12 - 49);
                    }
                } else if (!arg8) {
                    class10.field130[arg7][arg9][arg4] = (byte) (var12 - 81);
                }
            }
        } else {
            while (true) {
                int var14 = arg5.method837(true);
                if (var14 == 0) {
                    break;
                }
                if (var14 == 1) {
                    arg5.method837(true);
                    break;
                }
                if (var14 <= 49) {
                    arg5.method837(true);
                }
            }
        }
        if (arg0 != 9509) {
            field5295 = null;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2387(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
