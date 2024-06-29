import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class196 extends class161 {

    @OriginalMember(owner = "client!rb", name = "x", descriptor = "Lal;")
    public static class52 field3181 = new class52(16);

    @OriginalMember(owner = "client!rb", name = "A", descriptor = "I")
    public static int field3184 = -1;

    @OriginalMember(owner = "client!rb", name = "B", descriptor = "I")
    public static int field3185 = 0;

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "I")
    public int field3171;

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!rb", name = "q", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!rb", name = "r", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!rb", name = "s", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!rb", name = "t", descriptor = "I")
    public int field3177;

    @OriginalMember(owner = "client!rb", name = "u", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!rb", name = "v", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!rb", name = "w", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!rb", name = "y", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!rb", name = "z", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method1370(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field3178++;
        if (arg4 < 1) {
            arg4 = 1;
        }
        if (arg1 < 1) {
            arg1 = 1;
        }
        int var6 = arg1 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = (class410.field6082 - class111.field1540) * var6 / 100 + class111.field1540;
        if (class129.field2038 > var7) {
            var7 = class129.field2038;
        } else if (class203.field3264 < var7) {
            var7 = class203.field3264;
        }
        int var8 = var7 * 512 * arg1 / (arg4 * 334);
        if (class111.field1543 > var8) {
            short var9 = class111.field1543;
            var7 = arg4 * var9 * 334 / (arg1 * 512);
            if (class203.field3264 < var7) {
                var7 = class203.field3264;
                int var10 = arg1 * 512 * var7 / (var9 * 334);
                int var11 = (arg4 - var10) / 2;
                if (arg5) {
                    class284.field4547.method609();
                    class284.field4547.method2086(var11, arg2, arg1, -16777216, -765, arg0);
                    class284.field4547.method2086(var11, arg4 + arg2 - var11, arg1, -16777216, -765, arg0);
                }
                arg4 -= var11 * 2;
                arg2 += var11;
            }
        } else if (class185.field3001 < var8) {
            short var12 = class185.field3001;
            var7 = arg4 * var12 * 334 / (arg1 * 512);
            if (var7 < class129.field2038) {
                var7 = class129.field2038;
                int var13 = var12 * 334 * arg4 / (var7 * 512);
                int var14 = (arg1 - var13) / 2;
                if (arg5) {
                    class284.field4547.method609();
                    class284.field4547.method2086(arg4, arg2, var14, -16777216, -765, arg0);
                    class284.field4547.method2086(arg4, arg2, var14, -16777216, -765, arg1 + arg0 - var14);
                }
                arg1 -= var14 * 2;
                arg0 += var14;
            }
        }
        class185.field3000 = (short) arg4;
        class301.field4767 = arg1 * var7 / 334;
        if (arg3 != 2) {
            method1370(14, 17, -26, 52, 79, false);
        }
        class115.field1594 = (short) arg1;
        class189.field3099 = arg0;
        class314.field4941 = arg2;
    }

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "(I)V")
    public static void method1371(int arg0) {
        if (arg0 == -16777216) {
            field3181 = null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(B)V")
    public static final void method1372(byte arg0) {
        class52 var1 = class410.field6080;
        synchronized (class410.field6080) {
            class410.field6080.method335((byte) 85);
            if (arg0 >= -108) {
                field3181 = null;
            }
        }
        field3182++;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IBIIIIIII)V")
    public static final void method1373(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3172++;
        if (arg7 < 128 || arg3 < 128 || arg7 > (class80.field1003 - 2) * 128 || ((class380.field5751 - 2) * 128) < arg3) {
            class126.field1938[0] = class126.field1938[1] = -1;
            return;
        }
        int var9 = class58.method386(class266.field4286, (byte) -95, arg7, arg3) - arg6;
        class286.field4594.method1995(arg0, 0, 0);
        if (arg1 > -94) {
            field3184 = -78;
        }
        class284.field4547.method693(class286.field4594);
        class284.field4547.method573(arg7, var9, arg3, class126.field1938);
        class286.field4594.method1995(-arg0, 0, 0);
        class284.field4547.method693(class286.field4594);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IBIIZLgn;)V")
    public static final void method1374(int arg0, byte arg1, int arg2, int arg3, boolean arg4, class417 arg5) {
        field3174++;
        if (class297.field4719 >= 50 || arg5 == null || arg5.field6155 == null || arg5.field6155.length <= arg2 || arg5.field6155[arg2] == null) {
            return;
        }
        int var6 = arg5.field6155[arg2][0];
        int var7 = var6 >> 8;
        int var8 = var6 >> 5 & 0x7;
        if (arg5.field6155[arg2].length > 1) {
            int var9 = (int) (Math.random() * (double) arg5.field6155[arg2].length);
            if (var9 > 0) {
                var7 = arg5.field6155[arg2][var9];
            }
        }
        int var10 = var6 & 0x1F;
        if (var10 == 0) {
            if (arg4) {
                class426.method2641(var8, 0, -1, 255, var7);
            }
        } else if (class213.field3427 != 0) {
            class92.field1133[class297.field4719] = var7;
            if (arg1 != -104) {
                field3175 = -8;
            }
            class136.field2137[class297.field4719] = var8;
            class185.field3009[class297.field4719] = 0;
            class444.field6480[class297.field4719] = null;
            class331.field5187[class297.field4719] = 255;
            int var11 = (arg3 - 64) / 128;
            int var12 = (arg0 - 64) / 128;
            class84.field1048[class297.field4719] = (var11 << 16) + (var12 << 8) + var10;
            class297.field4719++;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IB)Lne;")
    public static final class172 method1375(int arg0, byte arg1) {
        if (arg1 != -56) {
            field3170 = 83;
        }
        field3173++;
        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        if (class203.field3266[var2] == null || class203.field3266[var2][var3] == null) {
            boolean var4 = class178.method1225(arg1 ^ 0xFFFFFFA4, var2);
            if (!var4) {
                return null;
            }
        }
        return class203.field3266[var2][var3];
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BI)V")
    public static final void method1376(byte arg0, int arg1) {
        field3176++;
        class52 var2 = class248.field4056;
        synchronized (class248.field4056) {
            class248.field4056.method335((byte) 98);
            if (arg0 < 113) {
                method1373(10, (byte) -42, -106, 113, -58, 52, 97, 123, 52);
            }
            class248.field4056 = new class52(arg1);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method1377(int arg0, int arg1, String arg2) {
        field3169++;
        boolean var3 = false;
        for (int var4 = 0; var4 < class107.field1500; var4++) {
            class219 var5 = class216.field3517[class132.field2063[var4]];
            if (var5 != null && var5.field3588 != null && var5.field3588.equalsIgnoreCase(arg2)) {
                var3 = true;
                if (arg0 == 1) {
                    class11.field139.method2224(187, (byte) 0);
                    class357.field5458++;
                    class11.field139.method1268(class132.field2063[var4], (byte) -108);
                    class11.field139.method1312(0, -100);
                } else if (arg0 == 4) {
                    class38.field479++;
                    class11.field139.method2224(42, (byte) 0);
                    class11.field139.method1283(8, class132.field2063[var4]);
                    class11.field139.method1312(0, -99);
                } else if (arg0 == 5) {
                    class135.field2116++;
                    class11.field139.method2224(104, (byte) 0);
                    class11.field139.method1325(0, 0);
                    class11.field139.method1298(class132.field2063[var4], -60);
                } else if (arg0 == 6) {
                    class286.field4597++;
                    class11.field139.method2224(62, (byte) 0);
                    class11.field139.method1298(class132.field2063[var4], -42);
                    class11.field139.method1278(0, 117);
                } else if (arg0 == 7) {
                    class121.field1667++;
                    class11.field139.method2224(68, (byte) 0);
                    class11.field139.method1309(class132.field2063[var4], 111);
                    class11.field139.method1278(0, 122);
                }
                break;
            }
        }
        int var6 = -85 % ((36 - arg1) / 59);
        if (!var3) {
            class357.method2329(class255.field4131 + arg2, 0);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIIIZZILjg;II)V")
    public static final void method1378(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7, int arg8, class186 arg9, int arg10, int arg11) {
        if (arg4 == 1) {
            arg8 = 1;
        } else if (arg4 == 2) {
            arg8 = 1;
            arg11 = 1;
        } else if (arg4 == 3) {
            arg11 = 1;
        }
        field3180++;
        if (arg10 != 1533773349) {
            field3175 = -95;
        }
        if (arg1 < 0 || class80.field1003 <= arg1 || arg0 < 0 || arg0 >= class380.field5751) {
            while (true) {
                int var14 = arg9.method1322(false);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg9.method1322(false);
                    return;
                }
                if (var14 <= 49) {
                    arg9.method1322(false);
                }
            }
        }
        if (!arg7 && !arg6) {
            class31.field382[arg3][arg1][arg0] = 0;
        }
        while (true) {
            int var12 = arg9.method1322(false);
            if (var12 == 0) {
                if (arg7) {
                    class281.field4509[0][arg1 + arg11][arg0 + arg8] = class181.field2961[0].method779(arg1 + arg11, arg0 + arg8);
                    return;
                } else if (arg3 == 0) {
                    class281.field4509[0][arg1 + arg11][arg0 + arg8] = -class346.method2260(-45, arg5 + 932731, arg2 + 556238) * 8;
                    return;
                } else {
                    class281.field4509[arg3][arg1 + arg11][arg0 + arg8] = class281.field4509[arg3 - 1][arg1 + arg11][arg0 + arg8] - 240;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg9.method1322(false);
                if (!arg7) {
                    if (var13 == 1) {
                        var13 = 0;
                    }
                    if (arg3 != 0) {
                        class281.field4509[arg3][arg1 + arg11][arg0 + arg8] = class281.field4509[arg3 - 1][arg1 + arg11][arg0 + arg8] - (var13 * 8);
                        return;
                    }
                    class281.field4509[0][arg1 + arg11][arg0 + arg8] = -var13 * 8;
                    return;
                }
                class281.field4509[0][arg1 + arg11][arg0 + arg8] = class181.field2961[0].method779(arg1 + arg11, arg0 - -arg8) + (var13 * 8);
                return;
            }
            if (var12 <= 49) {
                if (arg6) {
                    arg9.method1322(false);
                } else {
                    class12.field176[arg3][arg1][arg0] = arg9.method1327((byte) -89);
                    class314.field4936[arg3][arg1][arg0] = (byte) ((var12 - 2) / 4);
                    class135.field2117[arg3][arg1][arg0] = (byte) class37.method242(3, arg4 + var12 - 2);
                }
            } else if (var12 <= 81) {
                if (!arg7 && !arg6) {
                    class31.field382[arg3][arg1][arg0] = (byte) (var12 - 49);
                }
            } else if (!arg6) {
                class172.field2804[arg3][arg1][arg0] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILjg;)Lrf;")
    public static final class47 method1379(int arg0, class186 arg1) {
        field3179++;
        if (arg0 < 81) {
            field3185 = 27;
        }
        return new class47(arg1.method1276((byte) 123), arg1.method1276((byte) 109), arg1.method1276((byte) -122), arg1.method1276((byte) -95), arg1.method1275(-1), arg1.method1275(-1), arg1.method1322(false));
    }
}
