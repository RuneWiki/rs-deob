import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class184 {

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "Ltl;")
    private static class59 field3082 = class85.method639("Loading world list data", 9588);

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "Z")
    public static boolean field3078 = false;

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "Ltl;")
    public static class59 field3086 = class85.method639(" ", 9588);

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "I")
    public static int field3079 = 0;

    @OriginalMember(owner = "client!bj", name = "q", descriptor = "S")
    public static short field3094 = 32767;

    @OriginalMember(owner = "client!bj", name = "u", descriptor = "Ltl;")
    public static class59 field3098 = class85.method639("Mem:", 9588);

    @OriginalMember(owner = "client!bj", name = "m", descriptor = "I")
    public static int field3090 = 0;

    @OriginalMember(owner = "client!bj", name = "t", descriptor = "Ltl;")
    public static class59 field3097 = field3082;

    @OriginalMember(owner = "client!bj", name = "x", descriptor = "Ltl;")
    public static class59 field3101 = class85.method639(")3runescape)3com)4l=", 9588);

    @OriginalMember(owner = "client!bj", name = "A", descriptor = "[I")
    public static int[] field3104 = new int[32];

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "I")
    public int field3083;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!bj", name = "k", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!bj", name = "n", descriptor = "I")
    public static int field3091;

    @OriginalMember(owner = "client!bj", name = "p", descriptor = "I")
    public static int field3093;

    @OriginalMember(owner = "client!bj", name = "s", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!bj", name = "v", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!bj", name = "w", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!bj", name = "y", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!bj", name = "l", descriptor = "J")
    private long field3089;

    @OriginalMember(owner = "client!bj", name = "o", descriptor = "J")
    private long field3092;

    @OriginalMember(owner = "client!bj", name = "z", descriptor = "Z")
    public boolean field3103;

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "[I")
    private int[] field3084;

    @OriginalMember(owner = "client!bj", name = "r", descriptor = "[I")
    private int[] field3095;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lqg;IIII)Lca;", line = 5)
    public final class57 method1361(class129 arg0, int arg1, int arg2, int arg3, int arg4) {
        field3093++;
        if (arg3 != 32767) {
            this.field3083 = -63;
        }
        long var6 = (long) arg1 << 32 | (long) (arg4 << 16) | (long) arg1;
        class57 var8 = (class57) class305.field5179.method1483((byte) -74, var6);
        if (var8 == null) {
            int var9 = 0;
            class242[] var10 = new class242[2];
            if (!class259.method1801((byte) -123, arg1).method1643(-5308) || !class259.method1801((byte) -107, arg4).method1643(-5308)) {
                return null;
            }
            class242 var11 = class259.method1801((byte) -91, arg1).method1649((byte) -89);
            if (var11 != null) {
                var10[var9++] = var11;
            }
            class242 var12 = class259.method1801((byte) -102, arg4).method1649((byte) -126);
            if (var12 != null) {
                var10[var9++] = var12;
            }
            class242 var13 = new class242(var10, var9);
            for (int var14 = 0; var14 < 5; var14++) {
                if (class170.field2780[var14].length > this.field3095[var14]) {
                    var13.method1725(class11.field144[var14], class170.field2780[var14][this.field3095[var14]]);
                }
                if (this.field3095[var14] < class44.field717[var14].length) {
                    var13.method1725(class308.field5238[var14], class44.field717[var14][this.field3095[var14]]);
                }
            }
            var8 = var13.method1702(64, 768, -50, -10, -50);
            class305.field5179.method1488(var6, var8, arg3 - 6929);
        }
        if (arg0 != null) {
            var8 = arg0.method949(true, var8, arg2);
        }
        return var8;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(BIILma;)V", line = 68)
    public static final void method1362(byte arg0, int arg1, int arg2, class263 arg3) {
        field3081++;
        if (arg0 != -46) {
            method1362((byte) 14, -44, -103, (class263) null);
        }
        if (arg3.field4501 == 1) {
            class120.method896(0L, (short) 32, (byte) 124, class275.field4742, 0, arg3.field4453, arg3.field4392);
            class178.field2909++;
        }
        if (arg3.field4501 == 2 && !class219.field3556) {
            class59 var4 = class282.method1981(arg3, (byte) -116);
            if (var4 != null) {
                class120.method896(0L, (short) 30, (byte) 107, class233.method1630(new class59[] { class262.field4371, arg3.field4427 }, arg0 ^ 0xB6F), -1, var4, arg3.field4392);
                class292.field4989++;
            }
        }
        if (arg3.field4501 == 3) {
            class120.method896(0L, (short) 58, (byte) 116, class275.field4742, 0, class124.field2060, arg3.field4392);
            class195.field3228++;
        }
        if (arg3.field4501 == 4) {
            class120.method896(0L, (short) 35, (byte) 116, class275.field4742, 0, arg3.field4453, arg3.field4392);
            class310.field5263++;
        }
        if (arg3.field4501 == 5) {
            class120.method896(0L, (short) 46, (byte) 112, class275.field4742, 0, arg3.field4453, arg3.field4392);
            class101.field1651++;
        }
        if (arg3.field4501 == 6 && class65.field998 == null) {
            class120.method896(0L, (short) 16, (byte) 107, class275.field4742, -1, arg3.field4453, arg3.field4392);
            class306.field5182++;
        }
        if (arg3.field4468 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg3.field4478; var6++) {
                for (int var7 = 0; var7 < arg3.field4388; var7++) {
                    int var8 = (arg3.field4514 + 32) * var6;
                    int var9 = (arg3.field4439 + 32) * var7;
                    if (var5 < 20) {
                        var9 += arg3.field4381[var5];
                        var8 += arg3.field4451[var5];
                    }
                    if (var9 <= arg1 && var8 <= arg2 && (var9 + 32) > arg1 && var8 + 32 > arg2) {
                        class7.field83 = var5;
                        class99.field1595 = arg3;
                        if (arg3.field4549[var5] > 0) {
                            class44 var10 = class81.method616(arg3.field4549[var5] - 1, (byte) 25);
                            if (class11.field138 == 1 && class22.method143(client.method278(arg3), (byte) 82)) {
                                if (class167.field2702 != arg3.field4392 || class172.field2835 != var5) {
                                    class120.method896((long) var10.field658, (short) 51, (byte) 111, class233.method1630(new class59[] { class211.field3464, class153.field2507, var10.field699 }, -2883), var5, class146.field2385, arg3.field4392);
                                    class209.field3408++;
                                }
                            } else if (!class219.field3556 || !class22.method143(client.method278(arg3), (byte) 109)) {
                                class34.field499++;
                                class59[] var11 = var10.field704;
                                if (class31.field434) {
                                    var11 = class143.method1044(-992, var11);
                                }
                                if (class22.method143(client.method278(arg3), (byte) 127)) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            class228.field3673++;
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 15;
                                            } else {
                                                var13 = 12;
                                            }
                                            class120.method896((long) var10.field658, var13, (byte) 123, class233.method1630(new class59[] { class1.field6, var10.field699 }, -2883), var5, var11[var12], arg3.field4392);
                                        } else if (var12 == 4) {
                                            class120.method896((long) var10.field658, (short) 12, (byte) 119, class233.method1630(new class59[] { class1.field6, var10.field699 }, -2883), var5, class237.field3965, arg3.field4392);
                                            class149.field2443++;
                                        }
                                    }
                                }
                                if (class216.method1499(-19308, client.method278(arg3))) {
                                    class287.field4935++;
                                    class120.method896((long) var10.field658, (short) 21, (byte) 116, class233.method1630(new class59[] { class1.field6, var10.field699 }, -2883), var5, class146.field2385, arg3.field4392);
                                }
                                if (class22.method143(client.method278(arg3), (byte) 97) && var11 != null) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11[var14] != null) {
                                            byte var15 = 0;
                                            class14.field188++;
                                            if (var14 == 0) {
                                                var15 = 50;
                                            }
                                            if (var14 == 1) {
                                                var15 = 34;
                                            }
                                            if (var14 == 2) {
                                                var15 = 4;
                                            }
                                            class120.method896((long) var10.field658, var15, (byte) 121, class233.method1630(new class59[] { class1.field6, var10.field699 }, -2883), var5, var11[var14], arg3.field4392);
                                        }
                                    }
                                }
                                class59[] var16 = arg3.field4458;
                                if (class31.field434) {
                                    var16 = class143.method1044(-992, var16);
                                }
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            class101.field1645++;
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 25;
                                            }
                                            if (var17 == 1) {
                                                var18 = 20;
                                            }
                                            if (var17 == 2) {
                                                var18 = 11;
                                            }
                                            if (var17 == 3) {
                                                var18 = 47;
                                            }
                                            if (var17 == 4) {
                                                var18 = 22;
                                            }
                                            class120.method896((long) var10.field658, var18, (byte) 125, class233.method1630(new class59[] { class1.field6, var10.field699 }, -2883), var5, var16[var17], arg3.field4392);
                                        }
                                    }
                                }
                                class120.method896((long) var10.field658, (short) 1006, (byte) 114, class233.method1630(new class59[] { class1.field6, var10.field699 }, -2883), var5, class187.field3138, arg3.field4392);
                            } else if ((class59.field908 & 0x10) == 16) {
                                class171.field2819++;
                                class120.method896((long) var10.field658, (short) 33, (byte) 107, class233.method1630(new class59[] { class231.field3792, class153.field2507, var10.field699 }, -2883), var5, class249.field4141, arg3.field4392);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg3.field4542) {
            return;
        }
        if (!class219.field3556) {
            for (int var19 = 9; var19 >= 5; var19--) {
                class59 var20 = class127.method936(15, var19, arg3);
                if (var20 != null) {
                    class120.method896((long) (var19 + 1), (short) 1007, (byte) 121, arg3.field4511, arg3.field4500, var20, arg3.field4392);
                    class233.field3853++;
                }
            }
            class59 var21 = class282.method1981(arg3, (byte) 94);
            if (var21 != null) {
                class120.method896(0L, (short) 30, (byte) 113, arg3.field4511, arg3.field4500, var21, arg3.field4392);
                class292.field4989++;
            }
            for (int var22 = 4; var22 >= 0; var22--) {
                class59 var23 = class127.method936(-125, var22, arg3);
                if (var23 != null) {
                    class233.field3853++;
                    class120.method896((long) (var22 + 1), (short) 49, (byte) 127, arg3.field4511, arg3.field4500, var23, arg3.field4392);
                }
            }
            if (class155.method1110(client.method278(arg3), 0)) {
                class306.field5182++;
                class120.method896(0L, (short) 16, (byte) 104, class275.field4742, arg3.field4500, class207.field3375, arg3.field4392);
            }
        } else if (class90.method669(client.method278(arg3), 29721462) && (class59.field908 & 0x20) == 32) {
            class120.method896(0L, (short) 45, (byte) 123, class233.method1630(new class59[] { class231.field3792, class159.field2603, arg3.field4511 }, -2883), arg3.field4500, class249.field4141, arg3.field4392);
            class227.field3660++;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(BILqg;)Lca;", line = 387)
    public final class57 method1363(byte arg0, int arg1, class129 arg2) {
        field3102++;
        if (arg0 != 81) {
            field3090 = -93;
        }
        if (this.field3083 != -1) {
            return class37.method249(this.field3083, (byte) 104).method880(arg2, arg1, (byte) -25);
        }
        class57 var4 = (class57) class305.field5179.method1483((byte) -74, this.field3089);
        if (var4 == null) {
            boolean var5 = false;
            for (int var6 = 0; var6 < 12; var6++) {
                int var7 = this.field3084[var6];
                if ((var7 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var7) != 0 && !class259.method1801((byte) -95, var7 & 0x3FFFFFFF).method1643(-5308)) {
                        var5 = true;
                    }
                } else if (!class81.method616(var7 & 0x3FFFFFFF, (byte) 25).method313((byte) -65, this.field3103)) {
                    var5 = true;
                }
            }
            if (var5) {
                return null;
            }
            int var8 = 0;
            class242[] var9 = new class242[12];
            for (int var10 = 0; var10 < 12; var10++) {
                int var11 = this.field3084[var10];
                if ((var11 & 0x40000000) != 0) {
                    class242 var13 = class81.method616(var11 & 0x3FFFFFFF, (byte) 25).method304(arg0 ^ 0xFFFFFFE1, this.field3103);
                    if (var13 != null) {
                        var9[var8++] = var13;
                    }
                } else if ((Integer.MIN_VALUE & var11) != 0) {
                    class242 var12 = class259.method1801((byte) -96, var11 & 0x3FFFFFFF).method1649((byte) -76);
                    if (var12 != null) {
                        var9[var8++] = var12;
                    }
                }
            }
            class242 var14 = new class242(var9, var8);
            for (int var15 = 0; var15 < 5; var15++) {
                if (class170.field2780[var15].length > this.field3095[var15]) {
                    var14.method1725(class11.field144[var15], class170.field2780[var15][this.field3095[var15]]);
                }
                if (class44.field717[var15].length > this.field3095[var15]) {
                    var14.method1725(class308.field5238[var15], class44.field717[var15][this.field3095[var15]]);
                }
            }
            var4 = var14.method1702(64, 768, -50, -10, -50);
            class305.field5179.method1488(this.field3089, var4, 25838);
        }
        if (arg2 != null) {
            var4 = arg2.method949(true, var4, arg1);
        }
        return var4;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(III)V", line = 502)
    public final void method1364(int arg0, int arg1, int arg2) {
        int var4 = class266.field4586[arg0];
        field3088++;
        if (this.field3084[var4] != 0 && arg1 == -27342 && class259.method1801((byte) -88, arg2) != null) {
            this.field3084[var4] = class239.method1677(arg2, Integer.MIN_VALUE);
            this.method1366(-2102452280);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILqg;IILqg;)Lca;", line = 523)
    public final class57 method1365(int arg0, class129 arg1, int arg2, int arg3, class129 arg4) {
        field3085++;
        if (this.field3083 != -1) {
            return class37.method249(this.field3083, (byte) 121).method887(arg1, (byte) 98, arg0, arg2, arg4);
        }
        if (arg3 != 8931) {
            this.method1371(5, false);
        }
        long var6 = this.field3089;
        int[] var8 = this.field3084;
        if (arg1 != null && (arg1.field2131 >= 0 || arg1.field2122 >= 0)) {
            var8 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var8[var9] = this.field3084[var9];
            }
            if (arg1.field2131 >= 0) {
                if (arg1.field2131 == 65535) {
                    var8[5] = 0;
                    var6 ^= 0xFFFFFFFF00000000L;
                } else {
                    var8[5] = class239.method1677(arg1.field2131, 1073741824);
                    var6 ^= (long) var8[5] << 32;
                }
            }
            if (arg1.field2122 >= 0) {
                if (arg1.field2122 == 65535) {
                    var8[3] = 0;
                    var6 ^= 0xFFFFFFFFL;
                } else {
                    var8[3] = class239.method1677(arg1.field2122, 1073741824);
                    var6 ^= (long) var8[3];
                }
            }
        }
        class57 var10 = (class57) class39.field585.method1483((byte) -74, var6);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var13 = var8[var12];
                if ((var13 & 0x40000000) == 0) {
                    if ((var13 & Integer.MIN_VALUE) != 0 && !class259.method1801((byte) -94, var13 & 0x3FFFFFFF).method1641(true)) {
                        var11 = true;
                    }
                } else if (!class81.method616(var13 & 0x3FFFFFFF, (byte) 25).method306(-13635, this.field3103)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field3092 != -1L) {
                    var10 = (class57) class39.field585.method1483((byte) -74, this.field3092);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                int var14 = 0;
                class242[] var15 = new class242[12];
                for (int var16 = 0; var16 < 12; var16++) {
                    int var17 = var8[var16];
                    if ((var17 & 0x40000000) != 0) {
                        class242 var18 = class81.method616(var17 & 0x3FFFFFFF, (byte) 25).method310(-1, this.field3103);
                        if (var18 != null) {
                            var15[var14++] = var18;
                        }
                    } else if ((var17 & Integer.MIN_VALUE) != 0) {
                        class242 var19 = class259.method1801((byte) -96, var17 & 0x3FFFFFFF).method1640(-104);
                        if (var19 != null) {
                            var15[var14++] = var19;
                        }
                    }
                }
                int var20 = var8[0];
                if ((var20 & 0x40000000) != 0) {
                    class44 var21 = class81.method616(var20 & 0x3FFFFFFF, (byte) 25);
                    if (var21.field708 != null) {
                        for (int var22 = 0; var22 < var21.field708.length; var22++) {
                            if (var21.field708[var22] != null && var15[var22 + 1] != null) {
                                int var23 = var21.field708[var22][0];
                                int var24 = var21.field708[var22][1];
                                int var25 = var21.field708[var22][2];
                                int var26 = var21.field708[var22][3];
                                int var27 = var21.field708[var22][4];
                                int var28 = var21.field708[var22][5];
                                var15[var22 + 1].method1708(var23, var24, var25);
                                var15[var22 + 1].method1719(var26, var27, var28);
                            }
                        }
                    }
                }
                class242 var29 = new class242(var15, var14);
                for (int var30 = 0; var30 < 5; var30++) {
                    if (class170.field2780[var30].length > this.field3095[var30]) {
                        var29.method1725(class11.field144[var30], class170.field2780[var30][this.field3095[var30]]);
                    }
                    if (class44.field717[var30].length > this.field3095[var30]) {
                        var29.method1725(class308.field5238[var30], class44.field717[var30][this.field3095[var30]]);
                    }
                }
                var10 = var29.method1702(64, 850, -30, -50, -30);
                if (class55.field815) {
                    ((class267) var10).method1846(false, false, true, true, false, false, true);
                }
                class39.field585.method1488(var6, var10, 25838);
                this.field3092 = var6;
            }
        }
        if (arg1 == null && arg4 == null) {
            return var10;
        }
        class57 var31;
        if (arg1 != null && arg4 != null) {
            var31 = arg1.method953(arg4, arg0, arg2, (byte) -95, var10);
        } else if (arg1 == null) {
            var31 = arg4.method944(arg3 ^ 0x22AE, arg2, var10);
        } else {
            var31 = arg1.method944(arg3 ^ 0x22D6, arg0, var10);
        }
        return var31;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V", line = 754)
    private final void method1366(int arg0) {
        field3080++;
        long var2 = this.field3089;
        long[] var4 = class22.field295;
        this.field3089 = -1L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field3089 = var4[(int) ((this.field3089 ^ (long) (this.field3084[var5] >> 24)) & 0xFFL)] ^ this.field3089 >>> 8;
            this.field3089 = this.field3089 >>> 8 ^ var4[(int) (((long) (this.field3084[var5] >> 16) ^ this.field3089) & 0xFFL)];
            this.field3089 = this.field3089 >>> 8 ^ var4[(int) ((this.field3089 ^ (long) (this.field3084[var5] >> 8)) & 0xFFL)];
            this.field3089 = var4[(int) (((long) this.field3084[var5] ^ this.field3089) & 0xFFL)] ^ this.field3089 >>> 8;
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field3089 = var4[(int) ((this.field3089 ^ (long) this.field3095[var6]) & 0xFFL)] ^ this.field3089 >>> 8;
        }
        this.field3089 = var4[(int) ((this.field3089 ^ (long) (this.field3103 ? 1 : 0)) & 0xFFL)] ^ this.field3089 >>> 8;
        if (arg0 != -2102452280) {
            this.field3092 = 85L;
        }
        if (var2 != 0L && this.field3089 != var2) {
            class39.field585.method1489(115, var2);
        }
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(III)V", line = 794)
    public final void method1367(int arg0, int arg1, int arg2) {
        if (arg1 < 120) {
            method1370(71);
        }
        this.field3095[arg2] = arg0;
        field3099++;
        this.method1366(-2102452280);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IB[IZ[I)V", line = 813)
    public final void method1368(int arg0, byte arg1, int[] arg2, boolean arg3, int[] arg4) {
        if (arg4 == null) {
            arg4 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class108.field1806; var7++) {
                    class234 var8 = class259.method1801((byte) -122, var7);
                    if (var8 != null && !var8.field3879 && var8.field3884 == ((arg3 ? 7 : 0) + var6)) {
                        arg4[class266.field4586[var6]] = class239.method1677(Integer.MIN_VALUE, var7);
                        break;
                    }
                }
            }
        }
        field3087++;
        this.field3103 = arg3;
        if (arg1 < -8) {
            this.field3084 = arg4;
            this.field3095 = arg2;
            this.field3083 = arg0;
            this.method1366(-2102452280);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)I", line = 864)
    public final int method1369(byte arg0) {
        field3091++;
        if (arg0 == -45) {
            return this.field3083 == -1 ? (this.field3095[0] << 25) + (this.field3084[0] << 15) + (this.field3084[11] << 5) + (this.field3095[4] << 20) + (this.field3084[8] << 10) + this.field3084[1] : class37.method249(this.field3083, (byte) 79).field1983 + 305419896;
        } else {
            return -51;
        }
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)V", line = 890)
    public static void method1370(int arg0) {
        if (arg0 != 47) {
            method1370(11);
        }
        field3101 = null;
        field3098 = null;
        field3104 = null;
        field3086 = null;
        field3082 = null;
        field3097 = null;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IZ)V", line = 910)
    public final void method1371(int arg0, boolean arg1) {
        field3100++;
        this.field3103 = arg1;
        if (arg0 != 28067) {
            this.method1371(-126, false);
        }
        this.method1366(-2102452280);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(BI)Lvd;", line = 929)
    public static final class279 method1372(byte arg0, int arg1) {
        field3096++;
        if (arg0 != -46) {
            field3090 = 80;
        }
        if (arg1 == 0) {
            return new class235();
        } else if (arg1 == 1) {
            return new class14();
        } else if (arg1 == 2) {
            return new class151();
        } else if (arg1 == 3) {
            return new class269();
        } else if (arg1 == 4) {
            return new class70();
        } else if (arg1 == 5) {
            return new class101();
        } else if (arg1 == 6) {
            return new class113();
        } else if (arg1 == 7) {
            return new class13();
        } else if (arg1 == 8) {
            return new class188();
        } else if (arg1 == 9) {
            return new class159();
        } else if (arg1 == 10) {
            return new class50();
        } else if (arg1 == 11) {
            return new class259();
        } else if (arg1 == 12) {
            return new class221();
        } else if (arg1 == 13) {
            return new class131();
        } else if (arg1 == 14) {
            return new class291();
        } else if (arg1 == 15) {
            return new class90();
        } else if (arg1 == 16) {
            return new class178();
        } else if (arg1 == 17) {
            return new class227();
        } else if (arg1 == 18) {
            return new class288();
        } else if (arg1 == 19) {
            return new class193();
        } else if (arg1 == 20) {
            return new class300();
        } else if (arg1 == 21) {
            return new class103();
        } else if (arg1 == 22) {
            return new class312();
        } else if (arg1 == 23) {
            return new class239();
        } else if (arg1 == 24) {
            return new class285();
        } else if (arg1 == 25) {
            return new class60();
        } else if (arg1 == 26) {
            return new class6();
        } else if (arg1 == 27) {
            return new class215();
        } else if (arg1 == 28) {
            return new class228();
        } else if (arg1 == 29) {
            return new class84();
        } else if (arg1 == 30) {
            return new class247();
        } else if (arg1 == 31) {
            return new class77();
        } else if (arg1 == 32) {
            return new class45();
        } else if (arg1 == 33) {
            return new class157();
        } else if (arg1 == 34) {
            return new class100();
        } else if (arg1 == 35) {
            return new class266();
        } else if (arg1 == 36) {
            return new class38();
        } else if (arg1 == 37) {
            return new class236();
        } else if (arg1 == 38) {
            return new class232();
        } else if (arg1 == 39) {
            return new class130();
        } else {
            return null;
        }
    }
}
