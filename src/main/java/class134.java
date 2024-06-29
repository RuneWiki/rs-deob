import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class134 extends class179 {

    @OriginalMember(owner = "client!eq", name = "C", descriptor = "Lki;")
    private class480 field2123;

    @OriginalMember(owner = "client!eq", name = "x", descriptor = "Lbl;")
    private class442 field2118;

    @OriginalMember(owner = "client!eq", name = "O", descriptor = "Ltn;")
    private class55 field2134;

    @OriginalMember(owner = "client!eq", name = "j", descriptor = "I")
    private int field2104;

    @OriginalMember(owner = "client!eq", name = "m", descriptor = "I")
    private int field2107;

    @OriginalMember(owner = "client!eq", name = "w", descriptor = "I")
    private int field2117;

    @OriginalMember(owner = "client!eq", name = "q", descriptor = "I")
    private int field2111;

    @OriginalMember(owner = "client!eq", name = "y", descriptor = "[[F")
    private float[][] field2119;

    @OriginalMember(owner = "client!eq", name = "A", descriptor = "[[F")
    private float[][] field2121;

    @OriginalMember(owner = "client!eq", name = "s", descriptor = "[[F")
    private float[][] field2113;

    @OriginalMember(owner = "client!eq", name = "G", descriptor = "Lph;")
    private class438 field2127;

    @OriginalMember(owner = "client!eq", name = "D", descriptor = "Leo;")
    private class186 field2124;

    @OriginalMember(owner = "client!eq", name = "o", descriptor = "Lot;")
    private class400 field2109;

    @OriginalMember(owner = "client!eq", name = "H", descriptor = "Lot;")
    private class400 field2128;

    @OriginalMember(owner = "client!eq", name = "r", descriptor = "Lha;")
    private class40 field2112;

    @OriginalMember(owner = "client!eq", name = "v", descriptor = "Lka;")
    private class315 field2116;

    @OriginalMember(owner = "client!eq", name = "u", descriptor = "Lke;")
    private class407 field2115;

    @OriginalMember(owner = "client!eq", name = "N", descriptor = "[Ljava/lang/String;")
    public static String[] field2133;

    @OriginalMember(owner = "client!eq", name = "I", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!eq", name = "E", descriptor = "Lsk;")
    public static class423 field2125;

    @OriginalMember(owner = "client!eq", name = "k", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!eq", name = "l", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!eq", name = "n", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!eq", name = "p", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!eq", name = "t", descriptor = "I")
    private int field2114;

    @OriginalMember(owner = "client!eq", name = "z", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!eq", name = "B", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!eq", name = "F", descriptor = "I")
    private int field2126;

    @OriginalMember(owner = "client!eq", name = "K", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!eq", name = "L", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!eq", name = "M", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!eq", name = "P", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(B)V")
    public static void method879(byte arg0) {
        field2133 = null;
        if (arg0 >= -103) {
            method887(-63, null);
        }
        field2125 = null;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(ZII)I")
    public static final int method880(boolean arg0, int arg1, int arg2) {
        field2122++;
        if (arg0) {
            return 0;
        }
        class146 var3 = class478.method2889(arg2, (byte) 27, arg0);
        if (var3 == null) {
            return class331.field4952.method755(arg2, (byte) -93).field5736;
        }
        int var4 = 0;
        if (arg1 <= 19) {
            method881((byte) 11, null);
        }
        for (int var5 = 0; var5 < var3.field2367.length; var5++) {
            if (var3.field2367[var5] == -1) {
                var4++;
            }
        }
        return var4 + class331.field4952.method755(arg2, (byte) -93).field5736 - var3.field2367.length;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(BLtf;)Z")
    public static final boolean method881(byte arg0, class185 arg1) {
        field2110++;
        if (arg0 != 41) {
            field2133 = null;
        }
        class56 var2 = class128.field2070.method916((byte) -15, arg1.method174((byte) 122));
        if (var2.field902 == -1) {
            return true;
        } else {
            class349 var3 = class164.field2542.method1026(var2.field902, (byte) 64);
            return var3.field5147 == -1 ? true : var3.method2127((byte) -123);
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(III)Z")
    public static final boolean method882(int arg0, int arg1, int arg2) {
        field2108++;
        if (arg1 != 16) {
            method879((byte) 46);
        }
        return (arg0 & 0x20) != 0;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IS)V")
    private final void method883(int arg0, short arg1) {
        if (arg0 != 1) {
            this.field2128 = null;
        }
        if (this.field2118.field6745) {
            this.field2112.method246((byte) -78, arg1);
        } else {
            this.field2112.method260(arg1, arg0 - 2917);
        }
        field2105++;
        this.field2126++;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(B[[ZIII)V")
    public final void method884(byte arg0, boolean[][] arg1, int arg2, int arg3, int arg4) {
        field2130++;
        if (this.field2127 == null || arg2 + arg4 < this.field2104 || arg4 - arg2 > this.field2107 || this.field2117 > (arg2 + arg3) || (arg3 - arg2) > this.field2111) {
            return;
        }
        for (int var6 = this.field2117; var6 <= this.field2111; var6++) {
            for (int var7 = this.field2104; var7 <= this.field2107; var7++) {
                int var8 = var7 - arg4;
                int var9 = var6 - arg3;
                if (var8 > -arg2 && arg2 > var8 && (-arg2) < var9 && var9 < arg2 && arg1[arg2 + var8][arg2 + var9]) {
                    this.field2118.method2605(arg0 ^ 0x74, (int) (this.field2123.method2897(0) * 255.0F) << 24);
                    this.field2118.method2646(null, null, arg0 ^ 0xFFFFB25B, this.field2128, this.field2109);
                    this.field2118.method2593(4, true, 0, this.field2126, this.field2127);
                    return;
                }
            }
        }
        if (arg0 != 10) {
            method880(false, 107, 44);
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIIIII)V")
    private final void method885(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2120++;
        long var8 = -1L;
        int var10 = (arg6 << this.field2134.field5112) + arg3;
        int var11 = (arg1 << this.field2134.field5112) + arg4;
        int var12 = this.field2134.method314(var10, var11);
        if ((arg3 & 0x7F) == 0 || (arg4 & 0x7F) == 0) {
            var8 = (long) var10 & 0xFFFFL | 0xFFFFL << 16 & (long) var11 << 16;
            class179 var13 = this.field2115.method2409(false, var8);
            if (var13 != null) {
                this.method883(arg5, ((class406) var13).field5896);
                return;
            }
        }
        short var14 = (short) (this.field2114++);
        if (var8 != -1L) {
            this.field2115.method2413(var8, arg5 - 2, new class406(var14));
        }
        float var15;
        float var16;
        float var17;
        if (arg3 == 0 && arg4 == 0) {
            var15 = this.field2121[arg2][arg0];
            var16 = this.field2119[arg2][arg0];
            var17 = this.field2113[arg2][arg0];
        } else if (this.field2134.field5107 == arg3 && arg4 == 0) {
            var16 = this.field2119[arg2 + 1][arg0];
            var15 = this.field2121[arg2 + 1][arg0];
            var17 = this.field2113[arg2 + 1][arg0];
        } else if (this.field2134.field5107 == arg3 && this.field2134.field5107 == arg4) {
            var17 = this.field2113[arg2 + 1][arg0 + 1];
            var16 = this.field2119[arg2 + 1][arg0 + 1];
            var15 = this.field2121[arg2 + 1][arg0 + 1];
        } else if (arg3 == 0 && this.field2134.field5107 == arg4) {
            var15 = this.field2121[arg2][arg0 + 1];
            var16 = this.field2119[arg2][arg0 + 1];
            var17 = this.field2113[arg2][arg0 + 1];
        } else {
            float var18 = (float) arg3 / (float) this.field2134.field5107;
            float var19 = (float) arg4 / (float) this.field2134.field5107;
            float var20 = this.field2113[arg2][arg0];
            float var21 = this.field2119[arg2][arg0];
            float var22 = this.field2121[arg2][arg0];
            float var23 = this.field2113[arg2 + 1][arg0];
            float var24 = this.field2119[arg2 + 1][arg0];
            float var25 = this.field2121[arg2 + 1][arg0];
            float var26 = (this.field2113[arg2][arg0 + 1] - var20) * var18 + var20;
            float var27 = (this.field2119[arg2][arg0 + 1] - var21) * var18 + var21;
            float var28 = (this.field2113[arg2 + 1][arg0 + 1] - var23) * var18 + var23;
            float var29 = (this.field2119[arg2 + 1][arg0 + 1] - var24) * var18 + var24;
            float var30 = (this.field2121[arg2][arg0 + 1] - var22) * var18 + var22;
            var17 = (var28 - var26) * var19 + var26;
            var16 = (var29 - var27) * var19 + var27;
            float var31 = (this.field2121[arg2 + 1][arg0 + 1] - var25) * var18 + var25;
            var15 = (var31 - var30) * var19 + var30;
        }
        float var32 = (float) (this.field2123.method2895(0) - var10);
        float var33 = (float) (this.field2123.method2901(-24962) - var12);
        float var34 = (float) (this.field2123.method2900((byte) -31) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var34 * var36;
        float var38 = var32 * var36;
        float var39 = var33 * var36;
        float var40 = var35 / (float) this.field2123.method2894((byte) -88);
        float var41 = 1.0F - var40 * var40;
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var15 * var37 + var16 * var39 + var17 * var38;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if ((float) arg5 < var43) {
            var43 = 1.0F;
        }
        int var44 = this.field2123.method2902((byte) -46);
        int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) ((var44 & 0xFF09) >> 8) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (var47 > 255) {
            var47 = 255;
        }
        if (this.field2118.field6745) {
            this.field2116.method1878((byte) 26, (float) var10);
            this.field2116.method1878((byte) 105, (float) var12);
            this.field2116.method1878((byte) -101, (float) var11);
        } else {
            this.field2116.method1881((byte) -40, (float) var10);
            this.field2116.method1881((byte) -40, (float) var12);
            this.field2116.method1881((byte) -40, (float) var11);
        }
        this.field2116.method221(-1, var45);
        this.field2116.method221(-1, var46);
        this.field2116.method221(-1, var47);
        this.field2116.method221(arg5 ^ 0xFFFFFFFE, 255);
        this.method883(1, var14);
    }

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "(I)V")
    public static final void method886(int arg0) {
        field2131++;
        class330.field4948 = 0;
        class329.field4932.method13(false);
        if (arg0 == -1) {
            class329.field4932.method4(1, class505.field7628);
            class330.field4948++;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method887(int arg0, String arg1) {
        if (arg0 >= -83) {
            field2129 = -97;
        }
        field2132++;
        if (!class306.field4636) {
            return;
        }
        boolean var2 = false;
        int var3 = class328.field4921;
        int[] var4 = class280.field4247;
        for (int var5 = 0; var5 < var3; var5++) {
            class47 var6 = class224.field3450[var4[var5]];
            if (var6 != null && class286.field4329 != var6 && var6.field685 != null && var6.field685.equalsIgnoreCase(arg1)) {
                class297.field4504++;
                class400.method2379((byte) -75, class78.field1383);
                class230.field3508.method252(class262.field3967, -126);
                class230.field3508.method268(0, 112);
                class230.field3508.method259((byte) -86, class357.field5298);
                class230.field3508.method263(var4[var5], (byte) -75);
                class230.field3508.method252(class142.field2311, -103);
                class376.method2262(var6.method337(0), true, var6.method337(0), -2, var6.field2232[0], var6.field2239[0], -29, 0, 0);
                var2 = true;
                break;
            }
        }
        if (!var2) {
            class499.method3000((byte) -48, class480.field7318.method2473(class406.field5898, -122) + arg1);
        }
        if (class306.field4636) {
            class62.method432(false);
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IB)V")
    public static final void method888(int arg0, byte arg1) {
        int var2 = 15 % ((-arg1 - 32) / 61);
        class288 var3 = class33.field452;
        synchronized (class33.field452) {
            class33.field452.method1760(arg0, 30398);
        }
        field2135++;
        class288 var4 = class93.field1667;
        synchronized (class93.field1667) {
            class93.field1667.method1760(arg0, 30398);
        }
    }

    @OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(Lbl;Ltn;Lki;[I)V")
    public class134(class442 arg0, class55 arg1, class480 arg2, int[] arg3) {
        this.field2123 = arg2;
        this.field2118 = arg0;
        this.field2134 = arg1;
        int var5 = this.field2123.method2894((byte) -84) - (arg1.field5107 >> 1);
        this.field2104 = this.field2123.method2895(0) - var5 >> arg1.field5112;
        this.field2107 = var5 + this.field2123.method2895(0) >> arg1.field5112;
        this.field2117 = this.field2123.method2900((byte) -31) - var5 >> arg1.field5112;
        this.field2111 = var5 + this.field2123.method2900((byte) -31) >> arg1.field5112;
        int var6 = this.field2107 + 1 - this.field2104;
        int var7 = this.field2111 + 1 - this.field2117;
        this.field2119 = new float[var6 + 1][var7 + 1];
        this.field2121 = new float[var6 + 1][var7 + 1];
        this.field2113 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var24 = this.field2117 + var8;
            if (var24 > 0 && this.field2134.field5105 - 1 > var24) {
                for (int var25 = 0; var25 <= var6; var25++) {
                    int var26 = this.field2104 + var25;
                    if (var26 > 0 && var26 < (this.field2134.field5108 - 1)) {
                        int var27 = arg1.method318(var26 + 1, var24) - arg1.method318(var26 - 1, var24);
                        int var28 = arg1.method318(var26, var24 + 1) - arg1.method318(var26, var24 - 1);
                        float var29 = (float) (1.0D / Math.sqrt((double) (var27 * var27 + ((var28 * var28) + 65536))));
                        this.field2113[var25][var8] = (float) var27 * var29;
                        this.field2119[var25][var8] = var29 * -256.0F;
                        this.field2121[var25][var8] = (float) var28 * var29;
                    }
                }
            }
        }
        int var9 = 0;
        int var10 = 0;
        for (int var11 = this.field2117; var11 <= this.field2111; var11++) {
            if (var11 >= 0 && var11 < arg1.field5105) {
                for (int var21 = this.field2104; var21 <= this.field2107; var21++) {
                    if (var21 >= 0 && arg1.field5108 > var21) {
                        int var22 = arg3[var10];
                        int[] var23 = arg1.field834[var21][var11];
                        if (var23 != null && var22 != 0) {
                            if (var22 == 1) {
                                var9 += var23.length;
                            } else {
                                var9 += 3;
                            }
                        }
                    }
                    var10++;
                }
            } else {
                var10 += this.field2107 - this.field2104;
            }
        }
        if (var9 <= 0) {
            this.field2127 = null;
            this.field2124 = null;
            this.field2109 = null;
            this.field2128 = null;
        } else {
            this.field2112 = new class40(var9 * 2);
            this.field2116 = new class315(var9 * 16);
            this.field2115 = new class407(class99.method749(var9, -23866));
            int var12 = 0;
            int var13 = 0;
            for (int var14 = this.field2117; var14 <= this.field2111; var14++) {
                if (var14 >= 0 && var14 < arg1.field5105) {
                    int var15 = 0;
                    for (int var16 = this.field2104; var16 <= this.field2107; var16++) {
                        if (var16 >= 0 && var16 < arg1.field5108) {
                            int var17 = arg3[var12];
                            int[] var18 = arg1.field834[var16][var14];
                            int[] var19 = arg1.field836[var16][var14];
                            if (var18 != null && var17 != 0) {
                                if (var17 == 1) {
                                    for (int var20 = 0; var20 < var18.length; var20++) {
                                        this.method885(var13, var14, var15, var18[var20], var19[var20], 1, var16);
                                    }
                                } else if (var17 == 3) {
                                    this.method885(var13, var14, var15, 0, 0, 1, var16);
                                    this.method885(var13, var14, var15, arg1.field5107, 0, 1, var16);
                                    this.method885(var13, var14, var15, 0, arg1.field5107, 1, var16);
                                } else if (var17 == 2) {
                                    this.method885(var13, var14, var15, arg1.field5107, 0, 1, var16);
                                    this.method885(var13, var14, var15, arg1.field5107, arg1.field5107, 1, var16);
                                    this.method885(var13, var14, var15, 0, 0, 1, var16);
                                } else if (var17 == 5) {
                                    this.method885(var13, var14, var15, arg1.field5107, arg1.field5107, 1, var16);
                                    this.method885(var13, var14, var15, 0, arg1.field5107, 1, var16);
                                    this.method885(var13, var14, var15, arg1.field5107, 0, 1, var16);
                                } else if (var17 == 4) {
                                    this.method885(var13, var14, var15, 0, arg1.field5107, 1, var16);
                                    this.method885(var13, var14, var15, 0, 0, 1, var16);
                                    this.method885(var13, var14, var15, arg1.field5107, arg1.field5107, 1, var16);
                                }
                            }
                        }
                        var15++;
                        var12++;
                    }
                } else {
                    var12 += this.field2107 - this.field2104;
                }
                var13++;
            }
            this.field2127 = this.field2118.method2601(false, this.field2112.field585, 5123, (byte) 54, this.field2112.field536);
            this.field2124 = this.field2118.method2614(this.field2116.field536, this.field2116.field585, 16, false, -1);
            this.field2109 = new class400(this.field2118, this.field2124, 5126, 3, 0);
            this.field2128 = new class400(this.field2118, this.field2124, 5121, 4, 12);
        }
        this.field2113 = this.field2119 = this.field2121 = null;
        this.field2112 = null;
        this.field2115 = null;
        this.field2116 = null;
    }

    static {
        new class423(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
        field2133 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
        field2129 = 0;
        field2125 = new class423("M", "M", "M", "M");
    }
}
