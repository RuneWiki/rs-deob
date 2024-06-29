import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class95 {

    @OriginalMember(owner = "client!p", name = "E", descriptor = "Lla;")
    public class68 field2260 = new class68();

    @OriginalMember(owner = "client!p", name = "e", descriptor = "[I")
    public static int[] field2234 = new int[] { 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800 };

    @OriginalMember(owner = "client!p", name = "m", descriptor = "I")
    public static int field2242 = 0;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "Z")
    public static boolean field2238 = false;

    @OriginalMember(owner = "client!p", name = "p", descriptor = "Lae;")
    public static class6 field2245 = class64.method474(112, "welle:");

    @OriginalMember(owner = "client!p", name = "D", descriptor = "Lae;")
    private static class6 field2259 = class64.method474(111, "Password: ");

    @OriginalMember(owner = "client!p", name = "f", descriptor = "I")
    public static int field2235 = 78;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "Lae;")
    public static class6 field2230 = class64.method474(114, "Handel)4Duell");

    @OriginalMember(owner = "client!p", name = "h", descriptor = "Lae;")
    public static class6 field2237 = class64.method474(114, "Offline");

    @OriginalMember(owner = "client!p", name = "c", descriptor = "Lae;")
    public static class6 field2232 = field2259;

    @OriginalMember(owner = "client!p", name = "o", descriptor = "Lbd;")
    public static class12 field2244 = new class12(20);

    @OriginalMember(owner = "client!p", name = "I", descriptor = "Lae;")
    private static class6 field2264 = class64.method474(107, "Loading fonts )2 ");

    @OriginalMember(owner = "client!p", name = "K", descriptor = "Lae;")
    public static class6 field2266 = class64.method474(114, "mapdots");

    @OriginalMember(owner = "client!p", name = "J", descriptor = "Lae;")
    public static class6 field2265 = field2264;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!p", name = "j", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "I")
    public static int field2241;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!p", name = "r", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!p", name = "s", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!p", name = "t", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!p", name = "u", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!p", name = "v", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!p", name = "w", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!p", name = "x", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!p", name = "y", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!p", name = "z", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!p", name = "B", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!p", name = "C", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!p", name = "F", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!p", name = "A", descriptor = "Lq;")
    public static class101 field2256;

    @OriginalMember(owner = "client!p", name = "q", descriptor = "Lbf;")
    public static class14 field2246;

    @OriginalMember(owner = "client!p", name = "G", descriptor = "Lda;")
    public static class21 field2262;

    @OriginalMember(owner = "client!p", name = "H", descriptor = "Lla;")
    private class68 field2263;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V", line = 6)
    public final void method782(int arg0) {
        field2250++;
        if (arg0 != -3) {
            return;
        }
        while (true) {
            class68 var2 = this.field2260.field1502;
            if (this.field2260 == var2) {
                return;
            }
            var2.method498(113);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(JB)Lae;", line = 27)
    public static final class6 method783(long arg0, byte arg1) {
        field2236++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            long var3 = arg0;
            int var5 = 0;
            while (var3 != 0L) {
                var3 /= 37L;
                var5++;
            }
            byte[] var6 = new byte[var5];
            if (arg1 <= 80) {
                method790((byte) 101, null, 26, -8, -95, -47, -128, -116);
            }
            while (arg0 != 0L) {
                long var8 = arg0;
                arg0 /= 37L;
                var5--;
                var6[var5] = class12.field232[(int) (var8 - arg0 * 37L)];
            }
            class6 var7 = new class6();
            var7.field114 = var6;
            var7.field93 = var6.length;
            return var7;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIIIII)Z", line = 69)
    public static final boolean method784(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 != -1) {
            field2253 = 72;
        }
        field2231++;
        return class21.method208(~arg5, arg3) ? class27.method247(class35.field828[arg3], arg6, 0, -1, arg4, 0, arg1, 9843, arg0, arg2) : false;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(BLla;)V", line = 91)
    public final void method785(byte arg0, class68 arg1) {
        field2233++;
        if (arg1.field1497 != null) {
            arg1.method498(115);
        }
        arg1.field1502 = this.field2260;
        arg1.field1497 = this.field2260.field1497;
        int var3 = 127 / ((-arg0 - 12) / 54);
        arg1.field1497.field1502 = arg1;
        arg1.field1502.field1497 = arg1;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)Lla;", line = 107)
    public final class68 method786(byte arg0) {
        if (arg0 > -89) {
            field2230 = null;
        }
        field2254++;
        class68 var2 = this.field2263;
        if (this.field2260 == var2) {
            this.field2263 = null;
            return null;
        } else {
            this.field2263 = var2.field1497;
            return var2;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(BI)V", line = 128)
    public static final void method787(byte arg0, int arg1) {
        if (arg0 != -112) {
            method790((byte) 100, null, -65, -107, -88, -124, 65, 54);
        }
        field2240++;
        int[] var2 = class46.field1026.field2378;
        int var3 = var2.length;
        for (int var4 = 0; var4 < var3; var4++) {
            var2[var4] = 0;
        }
        for (int var5 = 1; var5 < 103; var5++) {
            int var20 = (52736 - var5 * 512) * 4 + 24628;
            for (int var21 = 1; var21 < 103; var21++) {
                if ((class108.field2582[arg1][var21][var5] & 0x18) == 0) {
                    class81.field1967.method552(var2, var20, 512, arg1, var21, var5);
                }
                if (arg1 < 3 && (class108.field2582[arg1 + 1][var21][var5] & 0x8) != 0) {
                    class81.field1967.method552(var2, var20, 512, arg1 + 1, var21, var5);
                }
                var20 += 4;
            }
        }
        class46.field1026.method859();
        int var6 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + (int) (Math.random() * 20.0D) + 238 - 10;
        int var7 = (int) (Math.random() * 20.0D) + 228 << 16;
        for (int var8 = 1; var8 < 103; var8++) {
            for (int var19 = 1; var19 < 103; var19++) {
                if ((class108.field2582[arg1][var19][var8] & 0x18) == 0) {
                    class93.method775(arg1, 1536, var6, var19, var8, var7);
                }
                if (arg1 < 3 && (class108.field2582[arg1 + 1][var19][var8] & 0x8) != 0) {
                    class93.method775(arg1 + 1, 1536, var6, var19, var8, var7);
                }
            }
        }
        field2242 = 0;
        for (int var9 = 0; var9 < 104; var9++) {
            for (int var10 = 0; var10 < 104; var10++) {
                int var11 = class81.field1967.method569(class15.field305, var9, var10);
                if (var11 != 0) {
                    int var12 = var11 >> 14 & 0x7FFF;
                    int var13 = class80.method687(var12, (byte) 39).field2560;
                    if (var13 >= 0) {
                        int var14 = var10;
                        int var15 = var9;
                        if (var13 != 22 && var13 != 29 && var13 != 34 && var13 != 36 && var13 != 46 && var13 != 47 && var13 != 48) {
                            int[][] var16 = class90.field2160[class15.field305].field1051;
                            for (int var17 = 0; var17 < 10; var17++) {
                                int var18 = (int) (Math.random() * 4.0D);
                                if (var18 == 0 && var15 > 0 && var9 - 3 < var15 && (var16[var15 - 1][var14] & 0x1280108) == 0) {
                                    var15--;
                                }
                                if (var18 == 1 && var15 < 103 && var9 + 3 > var15 && (var16[var15 + 1][var14] & 0x1280180) == 0) {
                                    var15++;
                                }
                                if (var18 == 2 && var14 > 0 && var10 - 3 < var14 && (var16[var15][var14 - 1] & 0x1280102) == 0) {
                                    var14--;
                                }
                                if (var18 == 3 && var14 < 103 && var10 + 3 > var14 && (var16[var15][var14 + 1] & 0x1280120) == 0) {
                                    var14++;
                                }
                            }
                        }
                        class59.field1292[field2242] = class41.field942[var13];
                        class58.field1253[field2242] = var15;
                        class121.field2992[field2242] = var14;
                        field2242++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(BLla;Lla;)V", line = 295)
    public final void method788(byte arg0, class68 arg1, class68 arg2) {
        if (arg0 != -15) {
            field2245 = null;
        }
        if (arg2.field1497 != null) {
            arg2.method498(arg0 ^ 0xFFFFFF95);
        }
        field2258++;
        arg2.field1497 = arg1.field1497;
        arg2.field1502 = arg1;
        arg2.field1497.field1502 = arg2;
        arg2.field1502.field1497 = arg2;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(I)Lla;", line = 315)
    public final class68 method789(int arg0) {
        field2249++;
        class68 var2 = this.field2260.field1497;
        if (arg0 >= -73) {
            field2237 = null;
        }
        if (this.field2260 == var2) {
            return null;
        } else {
            var2.method498(97);
            return var2;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(BLm;IIIIII)V", line = 337)
    public static final void method790(byte arg0, class77 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 != 33) {
            field2256 = null;
        }
        if (arg6 >= 0 && arg6 < 104 && arg4 >= 0 && arg4 < 104) {
            class108.field2582[arg7][arg6][arg4] = 0;
            while (true) {
                int var8 = arg1.method620((byte) -8);
                if (var8 == 0) {
                    if (arg7 == 0) {
                        class137.field3331[0][arg6][arg4] = -class122.method1008(arg4 + arg5 + 556238, 932731 - -arg6 + arg3, 1) * 8;
                    } else {
                        class137.field3331[arg7][arg6][arg4] = class137.field3331[arg7 - 1][arg6][arg4] - 240;
                    }
                    break;
                }
                if (var8 == 1) {
                    int var9 = arg1.method620((byte) -8);
                    if (var9 == 1) {
                        var9 = 0;
                    }
                    if (arg7 == 0) {
                        class137.field3331[0][arg6][arg4] = -var9 * 8;
                    } else {
                        class137.field3331[arg7][arg6][arg4] = class137.field3331[arg7 - 1][arg6][arg4] - var9 * 8;
                    }
                    break;
                }
                if (var8 <= 49) {
                    class57.field1239[arg7][arg6][arg4] = arg1.method638(-128);
                    class137.field3335[arg7][arg6][arg4] = (byte) ((var8 - 2) / 4);
                    class117.field2759[arg7][arg6][arg4] = (byte) class60.method451(arg2 + var8 - 2, 3);
                } else if (var8 <= 81) {
                    class108.field2582[arg7][arg6][arg4] = (byte) (var8 - 49);
                } else {
                    class139.field3373[arg7][arg6][arg4] = (byte) (var8 - 81);
                }
            }
        } else {
            while (true) {
                int var10 = arg1.method620((byte) -8);
                if (var10 == 0) {
                    break;
                }
                if (var10 == 1) {
                    arg1.method620((byte) -8);
                    break;
                }
                if (var10 <= 49) {
                    arg1.method620((byte) -8);
                }
            }
        }
        field2252++;
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(I)Lla;", line = 425)
    public final class68 method791(int arg0) {
        if (arg0 != 22) {
            return null;
        }
        field2247++;
        class68 var2 = this.field2260.field1497;
        if (this.field2260 == var2) {
            this.field2263 = null;
            return null;
        } else {
            this.field2263 = var2.field1497;
            return var2;
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(B)Lla;", line = 449)
    public final class68 method792(byte arg0) {
        class68 var2 = this.field2263;
        if (arg0 != -87) {
            field2230 = null;
        }
        field2239++;
        if (this.field2260 == var2) {
            this.field2263 = null;
            return null;
        } else {
            this.field2263 = var2.field1502;
            return var2;
        }
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "(I)V", line = 476)
    public static final void method793(int arg0) {
        class82.field2017 = false;
        class71.field1596 = false;
        field2257++;
        if (arg0 != 1) {
            method797((byte) 123);
        }
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(B)Lla;", line = 496)
    public final class68 method794(byte arg0) {
        if (arg0 != 52) {
            field2235 = 49;
        }
        field2261++;
        class68 var2 = this.field2260.field1502;
        if (this.field2260 == var2) {
            return null;
        } else {
            var2.method498(117);
            return var2;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lla;I)V", line = 521)
    public final void method795(class68 arg0, int arg1) {
        field2248++;
        if (arg0.field1497 != null) {
            arg0.method498(118);
        }
        arg0.field1497 = this.field2260;
        arg0.field1502 = this.field2260.field1502;
        arg0.field1497.field1502 = arg0;
        if (arg1 >= -70) {
            field2238 = false;
        }
        arg0.field1502.field1497 = arg0;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lte;B)V", line = 547)
    public static final void method796(class121 arg0, byte arg1) {
        field2255++;
        if (arg1 != -22) {
            return;
        }
        int var2 = arg0.field2960 >> 16;
        if (class102.field2410 == var2 || class117.field2776 == var2) {
            class20.field427 = true;
        }
        if (class126.field3086 == var2 || class102.field2412[class68.field1493] == var2) {
            class139.field3380 = true;
        }
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "(B)V", line = 569)
    public static void method797(byte arg0) {
        field2234 = null;
        field2232 = null;
        field2259 = null;
        field2264 = null;
        field2246 = null;
        field2256 = null;
        field2245 = null;
        field2237 = null;
        field2230 = null;
        int var1 = -88 / ((arg0 - 9) / 51);
        field2244 = null;
        field2265 = null;
        field2266 = null;
        field2262 = null;
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "()V", line = 631)
    public class95() {
        this.field2260.field1497 = this.field2260;
        this.field2260.field1502 = this.field2260;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)Lla;", line = 609)
    public final class68 method798(boolean arg0) {
        field2251++;
        if (arg0) {
            return null;
        }
        class68 var2 = this.field2260.field1502;
        if (this.field2260 == var2) {
            this.field2263 = null;
            return null;
        } else {
            this.field2263 = var2.field1502;
            return var2;
        }
    }
}
