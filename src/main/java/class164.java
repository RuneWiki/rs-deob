import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class164 {

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "[I")
    public static int[] field2588 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)V")
    public static void method1102(byte arg0) {
        if (arg0 != 97) {
            field2593 = -74;
        }
        field2588 = null;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lkk;ILjava/lang/String;)Ljava/lang/String;")
    public static final String method1103(class254 arg0, int arg1, String arg2) {
        if (arg2.indexOf("%") != -1) {
            label56: while (true) {
                int var3 = arg2.indexOf("%1");
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg2.indexOf("%2");
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg2.indexOf("%3");
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg2.indexOf("%4");
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg2.indexOf("%5");
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg2.indexOf("%dns");
                                                        if (var8 == -1) {
                                                            break label56;
                                                        }
                                                        String var9 = "";
                                                        if (class235.field3725 != null) {
                                                            if (class235.field3725.field723 == null) {
                                                                var9 = class143.method964((byte) 113, class235.field3725.field724);
                                                            } else {
                                                                var9 = (String) class235.field3725.field723;
                                                            }
                                                        }
                                                        arg2 = arg2.substring(0, var8) + var9 + arg2.substring(var8 + 4);
                                                    }
                                                }
                                                arg2 = arg2.substring(0, var7) + class110.method711(class256.method1790(arg0, 4, 0), (byte) -97) + arg2.substring(var7 + 2);
                                            }
                                        }
                                        arg2 = arg2.substring(0, var6) + class110.method711(class256.method1790(arg0, 3, 0), (byte) -97) + arg2.substring(var6 + 2);
                                    }
                                }
                                arg2 = arg2.substring(0, var5) + class110.method711(class256.method1790(arg0, 2, 0), (byte) -97) + arg2.substring(var5 + 2);
                            }
                        }
                        arg2 = arg2.substring(0, var4) + class110.method711(class256.method1790(arg0, 1, arg1 - 3818), (byte) -97) + arg2.substring(var4 + 2);
                    }
                }
                arg2 = arg2.substring(0, var3) + class110.method711(class256.method1790(arg0, 0, arg1 ^ 0xEEA), (byte) -97) + arg2.substring(var3 + 2);
            }
        }
        if (arg1 == 3818) {
            field2595++;
            return arg2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IZIIIILma;IIBIZ)V")
    public static final void method1104(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, class202 arg6, int arg7, int arg8, byte arg9, int arg10, boolean arg11) {
        if (arg9 >= -113) {
            method1104(34, true, 87, -36, 53, 5, (class202) null, -35, 91, (byte) -80, -50, false);
        }
        field2594++;
        if (arg3 < 0 || arg3 >= 104 || arg10 < 0 || arg10 >= 104) {
            while (true) {
                int var14 = arg6.method1420((byte) 0);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg6.method1420((byte) 0);
                    return;
                }
                if (var14 <= 49) {
                    arg6.method1420((byte) 0);
                }
            }
        }
        if (!arg1 && !arg11) {
            class128.field1972[arg2][arg3][arg10] = 0;
        }
        while (true) {
            int var12 = arg6.method1420((byte) 0);
            if (var12 == 0) {
                if (arg1) {
                    class242.field3842[0][arg3 + arg4][arg7 + arg10] = class277.field4583[0][arg3 + arg4][arg7 + arg10];
                    return;
                } else if (arg2 == 0) {
                    class242.field3842[0][arg3 + arg4][arg10 + arg7] = -class33.method190(false, arg0 + 556238, arg8 + 932731) * 8;
                    return;
                } else {
                    class242.field3842[arg2][arg3 + arg4][arg7 + arg10] = class242.field3842[arg2 - 1][arg3 + arg4][arg7 + arg10] - 240;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg6.method1420((byte) 0);
                if (arg1) {
                    class242.field3842[0][arg3 + arg4][arg7 + arg10] = var13 * 8 + class277.field4583[0][arg3 + arg4][arg10 + arg7];
                    return;
                }
                if (var13 == 1) {
                    var13 = 0;
                }
                if (arg2 != 0) {
                    class242.field3842[arg2][arg3 + arg4][arg10 + arg7] = class242.field3842[arg2 - 1][arg3 + arg4][arg7 + arg10] - (var13 * 8);
                    return;
                }
                class242.field3842[0][arg3 + arg4][arg7 + arg10] = -var13 * 8;
                return;
            }
            if (var12 <= 49) {
                if (arg11) {
                    arg6.method1420((byte) 0);
                } else {
                    class225.field3573[arg2][arg3][arg10] = arg6.method1457((byte) -125);
                    class22.field282[arg2][arg3][arg10] = (byte) ((var12 - 2) / 4);
                    class137.field2118[arg2][arg3][arg10] = (byte) class10.method53(arg5 + var12 - 2, 3);
                }
            } else if (var12 <= 81) {
                if (!arg1 && !arg11) {
                    class128.field1972[arg2][arg3][arg10] = (byte) (var12 - 49);
                }
            } else if (!arg11) {
                class216.field3442[arg2][arg3][arg10] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "([BIII)I")
    public static final int method1105(byte[] arg0, int arg1, int arg2, int arg3) {
        int var4 = 46 / ((arg1 + 59) / 46);
        field2590++;
        int var5 = -1;
        for (int var6 = arg2; var6 < arg3; var6++) {
            var5 = class282.field4704[(arg0[var6] ^ var5) & 0xFF] ^ var5 >>> 8;
        }
        return ~var5;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IZLfa;I)Lh;")
    public static final class294 method1106(int arg0, boolean arg1, class273 arg2, int arg3) {
        if (arg1) {
            field2592++;
            return class163.method1081(0, arg2, arg0, arg3) ? class184.method1220(-127) : null;
        } else {
            return null;
        }
    }
}
