import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class172 extends class88 {

    @OriginalMember(owner = "client!ul", name = "M", descriptor = "Lcc;")
    public static class327 field2376 = new class327(64);

    @OriginalMember(owner = "client!ul", name = "O", descriptor = "B")
    public byte field2378;

    @OriginalMember(owner = "client!ul", name = "K", descriptor = "I")
    public int field2374;

    @OriginalMember(owner = "client!ul", name = "L", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!ul", name = "N", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!ul", name = "P", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!ul", name = "Q", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!ul", name = "S", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!ul", name = "T", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!ul", name = "U", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!ul", name = "W", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!ul", name = "X", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!ul", name = "V", descriptor = "Ltg;")
    public static class164 field2385;

    @OriginalMember(owner = "client!ul", name = "R", descriptor = "Lfd;")
    public class299 field2381;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILwf;IIIII)V", line = 5)
    public static final void method1264(int arg0, class333 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg6 != 2) {
            field2384 = -112;
        }
        class287 var7 = class282.method1924(true, arg3);
        if (var7 != null && var7.field4117 && var7.method1968(arg6 - 3)) {
            if (var7.field4123 != null) {
                int[] var8 = new int[var7.field4123.length];
                for (int var9 = 0; var9 < var8.length / 2; var9++) {
                    int var10 = (int) class247.field3601 + class354.field5534 & 0x7FF;
                    int var11 = class350.field5474[var10];
                    int var12 = var11 * 256 / (class318.field4690 + 256);
                    int var13 = class350.field5476[var10];
                    int var14 = var13 * 256 / (class318.field4690 + 256);
                    var8[var9 * 2] = arg1.field5056 / 2 + arg2 + ((arg4 - -(var7.field4123[var9 * 2] * 4)) * var12 + (arg5 - -(var7.field4123[var9 * 2 + 1] * 4)) * var14 >> 16);
                    var8[var9 * 2 + 1] = arg0 - (((var7.field4123[var9 * 2 + 1] * 4 + arg5) * var12 - ((var7.field4123[var9 * 2] * 4 + arg4) * var14) >> 16) - (arg1.field5172 / 2));
                }
                if (class47.field623) {
                    class241.method1713(var8, var7.field4138, var7.field4138 >>> 24, arg1.field5195, arg1.field5057);
                } else {
                    class174.method1279(var8, var7.field4138, var7.field4138 >>> 24, arg1.field5195, arg1.field5057);
                }
                for (int var15 = 0; var15 < (var8.length / 2 - 1); var15++) {
                    if (class47.field623) {
                        class129.method985(var8[var15 * 2], var8[var15 * 2 + 1], var8[(var15 + 1) * 2], var8[var15 * 2 + 1 + 2], var7.field4113, var7.field4113 >>> 24, (class361) arg1.method2325(false, (byte) -18));
                    } else {
                        class37.method245(var8[var15 * 2], var8[var15 * 2 + 1], var8[var15 * 2 + 2], var8[var15 * 2 + 3], var7.field4113, var7.field4113 >>> 24, arg1.field5195, arg1.field5057);
                    }
                }
                if (class47.field623) {
                    class129.method985(var8[var8.length - 2], var8[var8.length - 1], var8[0], var8[1], var7.field4113, var7.field4113 >>> 24, (class361) arg1.method2325(false, (byte) -18));
                } else {
                    class37.method245(var8[var8.length - 2], var8[var8.length - 1], var8[0], var8[1], var7.field4113, var7.field4113 >>> 24, arg1.field5195, arg1.field5057);
                }
            }
            class145 var16 = null;
            if (var7.field4129 != -1) {
                var16 = var7.method1969(false, false, false);
                if (var16 != null) {
                    class191.method1386(var16, arg2, arg1, (byte) -119, arg4, arg5, arg0);
                }
            }
            if (var7.field4136 != null) {
                int var17 = 0;
                class281 var18 = class327.field4771;
                if (var7.field4119 == 1) {
                    var18 = class235.field3374;
                }
                if (var7.field4119 == 2) {
                    var18 = class186.field2554;
                }
                if (var16 != null) {
                    var17 = var16.field2029;
                }
                class264.method1820(var7.field4142, var7.field4136, 27497, arg0, arg5, arg2, arg4, var17, var18, arg1);
            }
        }
        field2382++;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IB)Ltd;", line = 102)
    public static final class362 method1265(int arg0, byte arg1) {
        field2380++;
        int var2 = -64 / ((-arg1 - 78) / 41);
        class362 var3 = (class362) class240.field3488.method2265((long) arg0, (byte) 24);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class296.field4297.method1089(class336.method2344(522353736, arg0), (byte) 122, class185.method1345(123, arg0));
        class362 var5 = new class362();
        var5.field5671 = arg0;
        if (var4 != null) {
            var5.method2513(new class299(var4), (byte) 121);
        }
        var5.method2520(104);
        if (var5.field5700 != -1) {
            var5.method2515(method1265(var5.field5714, (byte) -13), method1265(var5.field5700, (byte) -122), 65536);
        }
        if (var5.field5687 != -1) {
            var5.method2523(119, method1265(var5.field5672, (byte) 87), method1265(var5.field5687, (byte) 66));
        }
        if (!class166.field2324 && var5.field5704) {
            var5.field5674 = class344.field5347;
            var5.field5716 = class131.field1788;
            var5.field5703 = class328.field4790;
            var5.field5713 = 0;
            var5.field5666 = false;
        }
        class240.field3488.method2257(-126, var5, (long) arg0);
        return var5;
    }

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "(I)V", line = 142)
    public static void method1266(int arg0) {
        field2376 = null;
        field2385 = null;
        int var1 = 93 / ((-arg0 - 67) / 34);
    }

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "(I)V", line = 156)
    public static final void method1267(int arg0) {
        class227.field3261 = class289.method1987(8, 4, 35, 0.4F, 2048, 8, true, (byte) -24);
        field2387++;
        if (arg0 != 1) {
            method1264(-28, (class333) null, -110, 25, -100, -93, 32);
        }
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(IB)Lqm;", line = 169)
    public static final class338 method1268(int arg0, byte arg1) {
        field2383++;
        class338 var2 = (class338) class17.field205.method2265((long) arg0, (byte) -121);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class303.field4440.method1089(29, (byte) 114, arg0);
        class338 var4 = new class338();
        if (var3 != null) {
            var4.method2353(14364, arg0, new class299(var3));
        }
        if (arg1 > -60) {
            return (class338) null;
        } else {
            class17.field205.method2257(-127, var4, (long) arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZIIIZII)V", line = 192)
    public static final void method1269(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (arg5 < arg3) {
            int var7 = (arg3 + arg5) / 2;
            int var8 = arg5;
            class196 var9 = class217.field3063[var7];
            class217.field3063[var7] = class217.field3063[arg3];
            class217.field3063[arg3] = var9;
            for (int var10 = arg5; var10 < arg3; var10++) {
                if (class95.method689(arg2, arg0, var9, arg4, class217.field3063[var10], arg1, true) <= 0) {
                    class196 var11 = class217.field3063[var10];
                    class217.field3063[var10] = class217.field3063[var8];
                    class217.field3063[var8++] = var11;
                }
            }
            class217.field3063[arg3] = class217.field3063[var8];
            class217.field3063[var8] = var9;
            method1269(arg0, arg1, arg2, var8 - 1, arg4, arg5, 1);
            method1269(arg0, arg1, arg2, arg3, arg4, var8 + 1, arg6 ^ 0x0);
        }
        if (arg6 != 1) {
            field2385 = (class164) null;
        }
        field2379++;
    }

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "(I)I", line = 239)
    public final int method638(int arg0) {
        int var2 = 98 / ((59 - arg0) / 39);
        field2386++;
        return this.field2381 == null ? 0 : this.field2381.field4351 * 100 / (this.field2381.field4350.length - this.field2378);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILgb;ILgb;Z)I", line = 268)
    public static final int method1270(int arg0, class196 arg1, int arg2, class196 arg3, boolean arg4) {
        field2377++;
        if (arg2 == 1) {
            int var5 = arg3.field1334;
            int var6 = arg1.field1334;
            if (!arg4) {
                if (var6 == -1) {
                    var6 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg2 == 2) {
            return class190.method1378(arg0 ^ 0xFFFFAFE6, arg1.method1416(true).field1690, class306.field4473, arg3.method1416(true).field1690);
        } else if (arg2 == 3) {
            if (arg3.field2706.equals("-")) {
                if (arg1.field2706.equals("-")) {
                    return 0;
                } else if (arg4) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field2706.equals("-")) {
                return arg4 ? 1 : -1;
            } else {
                return class190.method1378(arg0 + 23070, arg1.field2706, class306.field4473, arg3.field2706);
            }
        } else if (arg2 == 4) {
            return arg3.method729((byte) -123) ? (arg1.method729((byte) -126) ? 0 : 1) : (arg1.method729((byte) -127) ? -1 : 0);
        } else if (arg2 == 5) {
            return arg3.method730((byte) 84) ? (arg1.method730((byte) 98) ? 0 : 1) : (arg1.method730((byte) 126) ? -1 : 0);
        } else if (arg2 == 6) {
            return arg3.method731(arg0 ^ 0xFFFFBEDF) ? (arg1.method731(1082) ? 0 : 1) : (arg1.method731(arg0 ^ 0xFFFFBEDF) ? -1 : 0);
        } else if (arg2 == 7) {
            return arg3.method727(arg0 ^ 0x482B) ? (arg1.method727(arg0 ^ 0x482B) ? 0 : 1) : (arg1.method727(-3378) ? -1 : 0);
        } else if (arg0 == -17691) {
            return arg3.field2712 - arg1.field2712;
        } else {
            return 12;
        }
    }

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "(B)[B", line = 339)
    public final byte[] method636(byte arg0) {
        if (arg0 != -90) {
            method1269(true, -64, -11, 126, true, -99, 51);
        }
        field2375++;
        if (this.field1109 || this.field2381.field4350.length - this.field2378 > this.field2381.field4351) {
            throw new RuntimeException();
        }
        return this.field2381.field4350;
    }
}
