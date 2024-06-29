import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public class class188 {

    @OriginalMember(owner = "client!lw", name = "u", descriptor = "I")
    public int field2955 = -1;

    @OriginalMember(owner = "client!lw", name = "q", descriptor = "[I")
    public static int[] field2951 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!lw", name = "k", descriptor = "[I")
    public static int[] field2945 = new int[32];

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!lw", name = "d", descriptor = "I")
    private int field2938;

    @OriginalMember(owner = "client!lw", name = "e", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!lw", name = "f", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!lw", name = "h", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!lw", name = "i", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!lw", name = "j", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!lw", name = "l", descriptor = "I")
    public static int field2946;

    @OriginalMember(owner = "client!lw", name = "o", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!lw", name = "p", descriptor = "I")
    public static int field2950;

    @OriginalMember(owner = "client!lw", name = "r", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!lw", name = "t", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!lw", name = "v", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!lw", name = "g", descriptor = "J")
    private long field2941;

    @OriginalMember(owner = "client!lw", name = "n", descriptor = "J")
    private long field2948;

    @OriginalMember(owner = "client!lw", name = "s", descriptor = "Z")
    public boolean field2953;

    @OriginalMember(owner = "client!lw", name = "c", descriptor = "[I")
    public int[] field2937;

    @OriginalMember(owner = "client!lw", name = "m", descriptor = "[I")
    private int[] field2947;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2945[var1] = var0 - 1;
            var0 += var0;
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(III)Z", line = 4)
    public static final boolean method1332(int arg0, int arg1, int arg2) {
        if (arg1 != 3543) {
            method1337((byte) -40);
        }
        field2954++;
        return class156.method1176(arg0, -1, arg2) || class229.method1499(arg0, arg2, 24314);
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(ILbc;Lfo;IZLnd;[Lnm;Lof;IILfo;ILr;Lme;IIILoq;ILgm;[I)Lda;", line = 15)
    public final class397 method1333(int arg0, class9 arg1, class606 arg2, int arg3, boolean arg4, class121 arg5, class391[] arg6, class429 arg7, int arg8, int arg9, class606 arg10, int arg11, class98 arg12, class664 arg13, int arg14, int arg15, int arg16, class205 arg17, int arg18, class509 arg19, int[] arg20) {
        field2952++;
        if (this.field2955 != -1) {
            return arg13.method3743(this.field2955, true).method3107(arg7, arg15, arg8, arg18, arg20, arg14, arg2, arg6, arg3, arg16, arg17, arg12, arg0, arg10, arg11, false, arg5);
        }
        int var22 = arg11;
        long var23 = this.field2941;
        int[] var25 = this.field2947;
        if (arg10 != null && (arg10.field8711 >= 0 || arg10.field8727 >= 0)) {
            var25 = new int[12];
            for (int var26 = 0; var26 < 12; var26++) {
                var25[var26] = this.field2947[var26];
            }
            if (arg10.field8711 >= 0) {
                if (arg10.field8711 == 65535) {
                    var23 ^= 0xFFFFFFFF00000000L;
                    var25[5] = 0;
                } else {
                    var25[5] = class460.method2676(1073741824, arg10.field8711);
                    var23 ^= (long) var25[5] << 32;
                }
            }
            if (arg10.field8727 >= 0) {
                if (arg10.field8727 == 65535) {
                    var25[3] = 0;
                    var23 ^= 0xFFFFFFFFL;
                } else {
                    var25[3] = class460.method2676(arg10.field8727, 1073741824);
                    var23 ^= var25[3];
                }
            }
        }
        boolean var27 = false;
        boolean var28 = false;
        boolean var29 = false;
        boolean var30 = arg10 != null || arg2 != null;
        int var31 = arg6 == null ? 0 : arg6.length;
        for (int var32 = 0; var32 < var31; var32++) {
            class297.field4199[var32] = null;
            if (arg6[var32] != null) {
                class606 var33 = arg17.method1417(-3585, arg6[var32].field5694);
                if (var33.field8707 != null) {
                    class595.field8613[var32] = var33;
                    var30 = true;
                    int var34 = arg6[var32].field5695;
                    int var35 = arg6[var32].field5696;
                    int var36 = var33.field8707[var34];
                    class297.field4199[var32] = arg17.method1421((byte) 82, var36 >>> 16);
                    int var37 = var36 & 0xFFFF;
                    class235.field3489[var32] = var37;
                    if (class297.field4199[var32] != null) {
                        var28 |= class297.field4199[var32].method2238(1, var37);
                        var27 |= class297.field4199[var32].method2234(var37, (byte) 61);
                        var29 |= class297.field4199[var32].method2235(-29895, var37);
                    }
                    if ((var33.field8703 || class61.field888) && var35 != -1 && var33.field8707.length > var35) {
                        class376.field5211[var32] = var33.field8699[var34];
                        class16.field255[var32] = arg6[var32].field5691;
                        int var38 = var33.field8707[var35];
                        class199.field3099[var32] = arg17.method1421((byte) 119, var38 >>> 16);
                        int var39 = var38 & 0xFFFF;
                        class176.field2811[var32] = var39;
                        if (class199.field3099[var32] != null) {
                            var28 |= class199.field3099[var32].method2238(1, var39);
                            var27 |= class199.field3099[var32].method2234(var39, (byte) 61);
                            var29 |= class199.field3099[var32].method2235(-29895, var39);
                        }
                    } else {
                        class376.field5211[var32] = 0;
                        class16.field255[var32] = 0;
                        class199.field3099[var32] = null;
                        class176.field2811[var32] = -1;
                    }
                }
            }
        }
        int var40 = -1;
        int var41 = -1;
        int var42 = 0;
        if (arg9 >= -31) {
            this.field2953 = false;
        }
        class374 var43 = null;
        class374 var44 = null;
        int var45 = -1;
        int var46 = -1;
        int var47 = 0;
        class374 var48 = null;
        class374 var49 = null;
        if (var30) {
            if (arg10 != null) {
                int var50 = arg10.field8707[arg3];
                int var51 = var50 >>> 16;
                var43 = arg17.method1421((byte) 21, var51);
                var40 = var50 & 0xFFFF;
                if (var43 != null) {
                    var28 |= var43.method2238(1, var40);
                    var27 |= var43.method2234(var40, (byte) 61);
                    var29 |= var43.method2235(-29895, var40);
                }
                if ((arg10.field8703 || class61.field888) && arg14 != -1 && arg14 < arg10.field8707.length) {
                    var42 = arg10.field8699[arg3];
                    int var52 = arg10.field8707[arg14];
                    int var53 = var52 >>> 16;
                    var44 = var51 == var53 ? var43 : arg17.method1421((byte) 114, var53);
                    var41 = var52 & 0xFFFF;
                    if (var44 != null) {
                        var28 |= var44.method2238(1, var41);
                        var27 |= var44.method2234(var41, (byte) 61);
                        var29 |= var44.method2235(-29895, var41);
                    }
                }
            }
            var22 = arg11 | 0x20;
            if (arg2 != null) {
                int var54 = arg2.field8707[arg18];
                int var55 = var54 >>> 16;
                var45 = var54 & 0xFFFF;
                var48 = arg17.method1421((byte) 46, var55);
                if (var48 != null) {
                    var28 |= var48.method2238(1, var45);
                    var27 |= var48.method2234(var45, (byte) 61);
                    var29 |= var48.method2235(-29895, var45);
                }
                if ((arg2.field8703 || class61.field888) && arg16 != -1 && arg2.field8707.length > arg16) {
                    var47 = arg2.field8699[arg18];
                    int var56 = arg2.field8707[arg16];
                    int var57 = var56 >>> 16;
                    var49 = var55 == var57 ? var48 : arg17.method1421((byte) 58, var57);
                    var46 = var56 & 0xFFFF;
                    if (var49 != null) {
                        var28 |= var49.method2238(1, var46);
                        var27 |= var49.method2234(var46, (byte) 61);
                        var29 |= var49.method2235(-29895, var46);
                    }
                }
            }
            if (var28) {
                var22 |= 0x80;
            }
            if (var27) {
                var22 |= 0x100;
            }
            if (var29) {
                var22 |= 0x400;
            }
        }
        class117 var58 = class603.field8668;
        class397 var59;
        synchronized (class603.field8668) {
            var59 = (class397) class603.field8668.method941(var23, 0);
        }
        class674 var60 = null;
        if (this.field2938 != -1) {
            var60 = arg5.method975(32, this.field2938);
        }
        if (var59 == null || arg12.method754(var59.method468(), var22) != 0) {
            if (var59 != null) {
                var22 = arg12.method738(var22, var59.method468());
            }
            boolean var62 = false;
            for (int var63 = 0; var63 < 12; var63++) {
                int var64 = var25[var63];
                if ((var64 & 0x40000000) == 0) {
                    if ((var64 & Integer.MIN_VALUE) != 0 && !arg19.method3030(var64 & 0x3FFFFFFF, 64).method3872(-19341)) {
                        var62 = true;
                    }
                } else if (!arg1.method42(var64 & 0x3FFFFFFF, false).method2525((byte) 51, this.field2953)) {
                    var62 = true;
                }
            }
            if (var62) {
                if (this.field2948 != -1L) {
                    class117 var82 = class603.field8668;
                    synchronized (class603.field8668) {
                        var59 = (class397) class603.field8668.method941(this.field2948, 0);
                    }
                }
                if (var59 == null || arg12.method754(var59.method468(), var22) != 0) {
                    return null;
                }
            } else {
                class163[] var65 = new class163[12];
                for (int var66 = 0; var66 < 12; var66++) {
                    int var67 = var25[var66];
                    if ((var67 & 0x40000000) != 0) {
                        class163 var68 = arg1.method42(var67 & 0x3FFFFFFF, false).method2535(0, this.field2953);
                        if (var68 != null) {
                            var65[var66] = var68;
                        }
                    } else if ((Integer.MIN_VALUE & var67) != 0) {
                        class163 var69 = arg19.method3030(var67 & 0x3FFFFFFF, 64).method3873(123);
                        if (var69 != null) {
                            var65[var66] = var69;
                        }
                    }
                }
                if (var60 != null && var60.field9600 != null) {
                    for (int var70 = 0; var70 < var60.field9600.length; var70++) {
                        if (var65[var70] != null) {
                            int var71 = 0;
                            int var72 = 0;
                            int var73 = 0;
                            int var74 = 0;
                            int var75 = 0;
                            int var76 = 0;
                            if (var60.field9600[var70] != null) {
                                var75 = var60.field9600[var70][4] << 3;
                                var76 = var60.field9600[var70][5] << 3;
                                var74 = var60.field9600[var70][3] << 3;
                                var72 = var60.field9600[var70][1];
                                var71 = var60.field9600[var70][0];
                                var73 = var60.field9600[var70][2];
                            }
                            if (var74 != 0 || var75 != 0 || var76 != 0) {
                                var65[var70].method1245(var76, var74, var75, 0);
                            }
                            if (var71 != 0 || var72 != 0 || var73 != 0) {
                                var65[var70].method1240((byte) 116, var72, var73, var71);
                            }
                        }
                    }
                }
                class163 var77 = new class163(var65, var65.length);
                int var78 = var22 | 0x4000;
                var59 = arg12.method795(var77, var78, class69.field1096, 64, 850);
                for (int var79 = 0; var79 < 5; var79++) {
                    for (int var80 = 0; var80 < class583.field8544.length; var80++) {
                        if (class583.field8544[var80][var79].length > this.field2937[var79]) {
                            var59.method464(class78.field1198[var80][var79], class583.field8544[var80][var79][this.field2937[var79]]);
                        }
                    }
                }
                if (arg4) {
                    var59.method438(var22);
                    class117 var81 = class603.field8668;
                    synchronized (class603.field8668) {
                        class603.field8668.method949(var23, true, var59);
                    }
                    this.field2948 = var23;
                }
            }
        }
        class397 var83 = var59.method475((byte) 4, var22, true);
        boolean var84 = false;
        if (arg20 != null) {
            for (int var85 = 0; var85 < 12; var85++) {
                if (arg20[var85] != -1) {
                    var84 = true;
                }
            }
        }
        if (!var30 && !var84) {
            return var83;
        }
        class152[] var86 = null;
        if (var60 != null) {
            var86 = var60.method3819(arg12, (byte) -107);
        }
        if (var84 && var86 != null) {
            for (int var87 = 0; var87 < 12; var87++) {
                if (var86[var87] != null) {
                    var83.method456(var86[var87], 0x1 << var87, true);
                }
            }
        }
        int var88 = 0;
        int var89 = 1;
        while (var31 > var88) {
            if (class297.field4199[var88] != null) {
                var83.method2412(class376.field5211[var88], false, class297.field4199[var88], class16.field255[var88] - 1, null, 108, class176.field2811[var88], var89, 0, class199.field3099[var88], class235.field3489[var88]);
            }
            var88++;
            var89 <<= 0x1;
        }
        if (var84) {
            for (int var90 = 0; var90 < 12; var90++) {
                if (arg20[var90] != -1) {
                    int var91 = arg20[var90] - arg0;
                    int var92 = var91 & 0x3FFF;
                    class152 var93 = arg12.method812();
                    var93.method176(var92);
                    var83.method456(var93, 0x1 << var90, false);
                }
            }
        }
        if (var84 && var86 != null) {
            for (int var94 = 0; var94 < 12; var94++) {
                if (var86[var94] != null) {
                    var83.method456(var86[var94], 0x1 << var94, false);
                }
            }
        }
        if (var43 != null && var48 != null) {
            var83.method2417(var47, var46, arg10.field8704, var49, var48, arg8 - 1, false, var43, arg15 - 1, var40, var42, 20580, var45, var44, var41);
        } else if (var43 != null) {
            var83.method2418(0, false, var42, var44, var41, arg8 - 1, -1, var40, var43);
        } else if (var48 != null) {
            var83.method2418(0, false, var47, var49, var46, arg15 - 1, -1, var45, var48);
        }
        for (int var95 = 0; var95 < var31; var95++) {
            class297.field4199[var95] = null;
            class199.field3099[var95] = null;
            class595.field8613[var95] = null;
        }
        return var83;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(IILr;I)V", line = 558)
    public static final void method1334(int arg0, int arg1, class98 arg2, int arg3) {
        field2940++;
        if (arg0 < 0 || arg3 < 0 || class548.field8039 == 0 || class561.field8182 == 0) {
            return;
        }
        arg2.method819(class349.field4923, class193.field2988, class548.field8039, class561.field8182);
        arg2.method771(class71.field1145, class70.field1108, class548.field8039, class561.field8182);
        class152 var4 = arg2.method812();
        var4.method153(class270.field3860, class456.field6561, class294.field4106, class98.field1461, class622.field8859, class396.field5739);
        arg2.method755(var4);
        if (arg1 != 2201) {
            field2945 = null;
        }
        if (class621.field8841 != null) {
            int var5 = -1;
            int var6 = -1;
            int var7 = arg2.method820();
            int var8 = (arg0 - class349.field4923) * var7 / class548.field8039;
            int var9 = (arg3 - class193.field2988) * var7 / class561.field8182;
            int var10 = arg2.method746();
            int var11 = (arg0 - class349.field4923) * var10 / class548.field8039;
            int var12 = (arg3 - class193.field2988) * var10 / class561.field8182;
            int[] var13 = new int[] { var8, var9, var7 };
            var4.method156(var13);
            int[] var14 = new int[] { var11, var12, var10 };
            var4.method156(var14);
            float var15 = 0.0F;
            int var16 = var14[0] - var13[0];
            int var17 = var14[1] - var13[1];
            int var18 = var14[2] - var13[2];
            while (var15 < 1.0F) {
                int var19 = (int) ((float) var16 * var15 + (float) var13[0]);
                int var20 = var19 >> 9;
                int var21 = (int) ((float) var18 * var15 + (float) var13[2]);
                int var22 = var21 >> 9;
                if (var20 > 0 && var22 > 0 && class430.field6136 > var20 && var22 < class580.field8504) {
                    int var23 = class103.field1708.field3158;
                    if (var23 < 3 && (class548.field8052[1][var20][var22] & 0x2) != 0) {
                        var23++;
                    }
                    if ((float) class621.field8841[var23].method3861((byte) 126, var19, var21) < (float) var17 * var15 + (float) var13[1]) {
                        var5 = var19 + (class103.field1708.method1108(125) - 1 << 8) >> 9;
                        var6 = (class103.field1708.method1108(122) - 1 << 8) + var21 >> 9;
                        break;
                    }
                }
                var15 = (float) ((double) var15 + 0.01D);
            }
            if (var5 != -1 && var6 != -1) {
                if (class41.field555 && (class700.field9918 & 0x40) != 0) {
                    class101 var24 = class620.method3501(class395.field5705, false, class199.field3091);
                    if (var24 == null) {
                        class372.method2220(-20585);
                    } else {
                        class476.method2787(var5, 0L, -1, var6, true, (byte) -26, class584.field8560, 16, " ->", false, class25.field346);
                    }
                } else {
                    if (class140.field2347) {
                        class476.method2787(var5, 0L, -1, var6, true, (byte) -26, class343.field4776.method2059(class238.field3511, true), 17, "", false, -1);
                    }
                    class518.field7653++;
                    class476.method2787(var5, 0L, -1, var6, true, (byte) -26, class458.field6577, 45, "", false, class497.field7402);
                }
            }
        }
        class565 var25 = class221.field3305;
        for (class690 var26 = (class690) var25.method3313((byte) 67); var26 != null; var26 = (class690) var25.method3308(-101)) {
            if ((class536.field7874 || class103.field1708.field3158 == var26.field9786.field3158) && var26.method3884(arg0, arg1 ^ 0xFFFFF716, arg2, arg3)) {
                boolean var27 = false;
                boolean var28 = false;
                int var29;
                int var30;
                if (var26.field9786 instanceof class144) {
                    var29 = ((class144) var26.field9786).field2481;
                    var30 = ((class144) var26.field9786).field2484;
                } else {
                    var30 = var26.field9786.field3154 >> 9;
                    var29 = var26.field9786.field3155 >> 9;
                }
                if (var26.field9786 instanceof class270) {
                    class270 var31 = (class270) var26.field9786;
                    int var32 = var31.method1108(79);
                    if ((var32 & 0x1) == 0 && (var31.field3155 & 0x1FF) == 0 && (var31.field3154 & 0x1FF) == 0 || (var32 & 0x1) == 1 && (var31.field3155 & 0x1FF) == 256 && (var31.field3154 & 0x1FF) == 256) {
                        int var33 = var31.field3155 - (var31.method1108(81) - 1 << 8);
                        int var34 = var31.field3154 - (var31.method1108(99) - 1 << 8);
                        for (int var35 = 0; var35 < class310.field4304; var35++) {
                            class6 var42 = (class6) class314.field4359.method2818(arg1 ^ 0xFFFFAE74, (long) class253.field3667[var35]);
                            if (var42 != null) {
                                class88 var43 = var42.field49;
                                if (class148.field2508 != var43.field2432 && var43.field2389) {
                                    int var44 = var43.field3155 - (var43.field1309.field7726 - 1 << 8);
                                    int var45 = var43.field3154 - (var43.field1309.field7726 - 1 << 8);
                                    if (var44 >= var33 && var43.field1309.field7726 <= (var31.method1108(106) - (var44 - var33 >> 9)) && var34 <= var45 && var43.field1309.field7726 <= (var31.method1108(109) - (var45 - var34 >> 9))) {
                                        class21.method212(class103.field1708.field3158 != var26.field9786.field3158, var43, -109);
                                        var43.field2432 = class148.field2508;
                                    }
                                }
                            }
                        }
                        int var36 = class643.field9134;
                        int[] var37 = class98.field1458;
                        for (int var38 = 0; var38 < var36; var38++) {
                            class270 var39 = class76.field1186[var37[var38]];
                            if (var39 != null && class148.field2508 != var39.field2432 && var31 != var39 && var39.field2389) {
                                int var40 = var39.field3155 - (var39.method1108(81) - 1 << 8);
                                int var41 = var39.field3154 - (var39.method1108(82) - 1 << 8);
                                if (var33 <= var40 && var39.method1108(arg1 - 2120) <= var31.method1108(arg1 ^ 0x8EE) - (var40 - var33 >> 9) && var41 >= var34 && var39.method1108(arg1 ^ 0x8F2) <= (var31.method1108(91) - (var41 - var34 >> 9))) {
                                    class392.method2381(var39, -77, class103.field1708.field3158 != var26.field9786.field3158);
                                    var39.field2432 = class148.field2508;
                                }
                            }
                        }
                    }
                    if (class148.field2508 == var31.field2432) {
                        continue;
                    }
                    class392.method2381(var31, -98, class103.field1708.field3158 != var26.field9786.field3158);
                    var31.field2432 = class148.field2508;
                }
                if (var26.field9786 instanceof class88) {
                    class88 var46 = (class88) var26.field9786;
                    if (var46.field1309 != null) {
                        if ((var46.field1309.field7726 & 0x1) == 0 && (var46.field3155 & 0x1FF) == 0 && (var46.field3154 & 0x1FF) == 0 || (var46.field1309.field7726 & 0x1) == 1 && (var46.field3155 & 0x1FF) == 256 && (var46.field3154 & 0x1FF) == 256) {
                            int var47 = var46.field3155 - (var46.field1309.field7726 - 1 << 8);
                            int var48 = var46.field3154 - (var46.field1309.field7726 - 1 << 8);
                            for (int var49 = 0; var49 < class310.field4304; var49++) {
                                class6 var56 = (class6) class314.field4359.method2818(arg1 - 25004, (long) class253.field3667[var49]);
                                if (var56 != null) {
                                    class88 var57 = var56.field49;
                                    if (class148.field2508 != var57.field2432 && var46 != var57 && var57.field2389) {
                                        int var58 = var57.field3155 - (var57.field1309.field7726 - 1 << 8);
                                        int var59 = var57.field3154 - (var57.field1309.field7726 - 1 << 8);
                                        if (var58 >= var47 && var57.field1309.field7726 <= (var46.field1309.field7726 - (var58 - var47 >> 9)) && var48 <= var59 && var46.field1309.field7726 - (var59 - var48 >> 9) >= var57.field1309.field7726) {
                                            class21.method212(class103.field1708.field3158 != var26.field9786.field3158, var57, -68);
                                            var57.field2432 = class148.field2508;
                                        }
                                    }
                                }
                            }
                            int var50 = class643.field9134;
                            int[] var51 = class98.field1458;
                            for (int var52 = 0; var52 < var50; var52++) {
                                class270 var53 = class76.field1186[var51[var52]];
                                if (var53 != null && class148.field2508 != var53.field2432 && var53.field2389) {
                                    int var54 = var53.field3155 - (var53.method1108(97) - 1 << 8);
                                    int var55 = var53.field3154 - (var53.method1108(111) - 1 << 8);
                                    if (var47 <= var54 && var53.method1108(117) <= (var46.field1309.field7726 - (var54 - var47 >> 9)) && var48 <= var55 && var53.method1108(113) <= (var46.field1309.field7726 - (var55 - var48 >> 9))) {
                                        class392.method2381(var53, arg1 - 2285, class103.field1708.field3158 != var26.field9786.field3158);
                                        var53.field2432 = class148.field2508;
                                    }
                                }
                            }
                        }
                        if (class148.field2508 == var46.field2432) {
                            continue;
                        }
                        class21.method212(class103.field1708.field3158 != var26.field9786.field3158, var46, -79);
                        var46.field2432 = class148.field2508;
                    }
                }
                if (var26.field9786 instanceof class82) {
                    int var60 = var29 + class143.field2474;
                    int var61 = class63.field917 + var30;
                    class430 var62 = (class430) class480.field6870.method2818(-22803, (long) (var60 | var26.field9786.field3158 << 28 | var61 << 14));
                    if (var62 != null) {
                        for (class417 var63 = (class417) var62.field6133.method3895(true); var63 != null; var63 = (class417) var62.field6133.method3901(arg1 ^ 0x898)) {
                            class432 var64 = class430.field6132.method42(var63.field5941, false);
                            if (class41.field555 && class103.field1708.field3158 == var26.field9786.field3158) {
                                class349 var65 = class510.field7581 == -1 ? null : class237.field3504.method1554(false, class510.field7581);
                                if ((class700.field9918 & 0x1) != 0 && (var65 == null || var64.method2531(false, class510.field7581, var65.field4922) != var65.field4922)) {
                                    class41.field548++;
                                    class476.method2787(var29, (long) var63.field5941, -1, var30, true, (byte) -26, class584.field8560, 19, class252.field3651 + " -> <col=ff9040>" + var64.field6194, false, class25.field346);
                                }
                            }
                            if (class103.field1708.field3158 == var26.field9786.field3158) {
                                String[] var66 = var64.field6151;
                                for (int var67 = 4; var67 >= 0; var67--) {
                                    if (var66 != null && var66[var67] != null) {
                                        byte var68 = 0;
                                        if (var67 == 0) {
                                            var68 = 4;
                                        }
                                        int var69 = class333.field4640;
                                        if (var67 == 1) {
                                            var68 = 46;
                                        }
                                        if (var67 == 2) {
                                            var68 = 21;
                                        }
                                        if (var67 == 3) {
                                            var68 = 48;
                                        }
                                        if (var64.field6210 == var67) {
                                            var69 = var64.field6188;
                                        }
                                        if (var67 == 4) {
                                            var68 = 2;
                                        }
                                        if (var64.field6213 == var67) {
                                            var69 = var64.field6156;
                                        }
                                        class108.field1763++;
                                        class476.method2787(var29, (long) var63.field5941, -1, var30, true, (byte) -26, var66[var67], var68, "<col=ff9040>" + var64.field6194, false, var69);
                                    }
                                }
                            }
                            class632.field8968++;
                            class476.method2787(var29, (long) var63.field5941, -1, var30, true, (byte) -26, class343.field4771.method2059(class238.field3511, true), 1011, "<col=ff9040>" + var64.field6194, class103.field1708.field3158 != var26.field9786.field3158, class254.field3673);
                        }
                    }
                }
                if (var26.field9786 instanceof class394) {
                    class394 var70 = (class394) var26.field9786;
                    class119 var71 = class14.field224.method2834(0, var70.method903(124));
                    if (var71.field1924 != null) {
                        var71 = var71.method969(class230.field3404, arg1 - 2109);
                    }
                    if (var71 != null) {
                        if (class41.field555 && class103.field1708.field3158 == var26.field9786.field3158) {
                            class349 var72 = class510.field7581 == -1 ? null : class237.field3504.method1554(false, class510.field7581);
                            if ((class700.field9918 & 0x4) != 0 && (var72 == null || var71.method958(class510.field7581, var72.field4922, 7112) != var72.field4922)) {
                                class116.field1844++;
                                class476.method2787(var29, class64.method528(-124, var70, var29, var30), -1, var30, true, (byte) -26, class584.field8560, 57, class252.field3651 + " -> <col=00ffff>" + var71.field1926, false, class25.field346);
                            }
                        }
                        if (class103.field1708.field3158 == var26.field9786.field3158) {
                            String[] var73 = var71.field1936;
                            if (var73 != null) {
                                for (int var74 = 4; var74 >= 0; var74--) {
                                    if (var73[var74] != null) {
                                        short var75 = 0;
                                        int var76 = class333.field4640;
                                        if (var74 == 0) {
                                            var75 = 12;
                                        }
                                        if (var74 == 1) {
                                            var75 = 30;
                                        }
                                        if (var74 == 2) {
                                            var75 = 50;
                                        }
                                        if (var74 == 3) {
                                            var75 = 22;
                                        }
                                        if (var74 == 4) {
                                            var75 = 1003;
                                        }
                                        if (var71.field1938 == var74) {
                                            var76 = var71.field1933;
                                        }
                                        if (var71.field1886 == var74) {
                                            var76 = var71.field1950;
                                        }
                                        class476.method2787(var29, class64.method528(arg1 ^ 0x8DE, var70, var29, var30), -1, var30, true, (byte) -26, var73[var74], var75, "<col=00ffff>" + var71.field1926, false, var76);
                                        class333.field4643++;
                                    }
                                }
                            }
                        }
                        class476.method2787(var29, (long) var71.field1953, -1, var30, true, (byte) -26, class343.field4771.method2059(class238.field3511, true), 1008, "<col=00ffff>" + var71.field1926, class103.field1708.field3158 != var26.field9786.field3158, class254.field3673);
                        class12.field144++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(ILr;Lgm;Lof;Loq;Lfo;ILme;ILbc;IB)Lda;", line = 1049)
    public final class397 method1335(int arg0, class98 arg1, class509 arg2, class429 arg3, class205 arg4, class606 arg5, int arg6, class664 arg7, int arg8, class9 arg9, int arg10, byte arg11) {
        field2935++;
        if (this.field2955 != -1) {
            return arg7.method3743(this.field2955, true).method3114(arg0, true, arg5, arg4, arg10, arg8, arg6, arg1, arg3);
        }
        int var13 = arg0;
        if (arg5 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            Object var21 = null;
            int var22 = arg5.field8707[arg6];
            var13 = arg0 | 0x20;
            int var23 = var22 >>> 16;
            class374 var24 = arg4.method1421((byte) 32, var23);
            int var25 = var22 & 0xFFFF;
            if (var24 != null) {
                var15 |= var24.method2238(arg11 ^ 0x13, var25);
                var14 |= var24.method2234(var25, (byte) 61);
                var17 |= var24.method2235(-29895, var25);
                var16 |= arg5.field8717;
            }
            if ((arg5.field8703 || class61.field888) && arg8 != -1 && arg8 < arg5.field8707.length) {
                int var26 = arg5.field8707[arg8];
                int var27 = var26 >>> 16;
                class374 var28 = var23 == var27 ? var24 : arg4.method1421((byte) 117, var27);
                int var29 = var26 & 0xFFFF;
                if (var28 != null) {
                    var15 |= var28.method2238(1, var29);
                    var14 |= var28.method2234(var29, (byte) 61);
                    var17 |= var28.method2235(arg11 - 29913, var29);
                }
            }
            if (var15) {
                var13 |= 0x80;
            }
            if (var14) {
                var13 |= 0x100;
            }
            if (var16) {
                var13 |= 0x200;
            }
            if (var17) {
                var13 |= 0x400;
            }
        }
        class117 var30 = class45.field602;
        class397 var31;
        synchronized (class45.field602) {
            var31 = (class397) class45.field602.method941(this.field2941, arg11 ^ 0x12);
            if (arg11 != 18) {
                this.field2941 = -85L;
            }
        }
        if (var31 == null || arg1.method754(var31.method468(), var13) != 0) {
            if (var31 != null) {
                var13 = arg1.method738(var13, var31.method468());
            }
            boolean var33 = false;
            for (int var34 = 0; var34 < 12; var34++) {
                int var35 = this.field2947[var34];
                if ((var35 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var35) != 0 && !arg2.method3030(var35 & 0x3FFFFFFF, 64).method3878(true)) {
                        var33 = true;
                    }
                } else if (!arg9.method42(var35 & 0x3FFFFFFF, false).method2540((byte) -110, this.field2953)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class163[] var36 = new class163[12];
            int var37 = 0;
            for (int var38 = 0; var38 < 12; var38++) {
                int var39 = this.field2947[var38];
                if ((var39 & 0x40000000) != 0) {
                    class163 var40 = arg9.method42(var39 & 0x3FFFFFFF, false).method2533(0, this.field2953);
                    if (var40 != null) {
                        var36[var37++] = var40;
                    }
                } else if ((var39 & Integer.MIN_VALUE) != 0) {
                    class163 var41 = arg2.method3030(var39 & 0x3FFFFFFF, arg11 + 46).method3877(0);
                    if (var41 != null) {
                        var36[var37++] = var41;
                    }
                }
            }
            int var42 = var13 | 0x4000;
            class163 var43 = new class163(var36, var37);
            var31 = arg1.method795(var43, var42, class69.field1096, 64, 768);
            for (int var44 = 0; var44 < 5; var44++) {
                for (int var45 = 0; var45 < class583.field8544.length; var45++) {
                    if (class583.field8544[var45][var44].length > this.field2937[var44]) {
                        var31.method464(class78.field1198[var45][var44], class583.field8544[var45][var44][this.field2937[var44]]);
                    }
                }
            }
            var31.method438(var13);
            class117 var46 = class45.field602;
            synchronized (class45.field602) {
                class45.field602.method949(this.field2941, true, var31);
            }
        }
        if (arg5 == null) {
            return var31;
        } else {
            var31.method475((byte) 4, var13, true);
            return arg5.method3447(arg0, arg8, arg6, arg11 - 15273, var31, arg10);
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(BLbc;II)V", line = 1248)
    public final void method1336(byte arg0, class9 arg1, int arg2, int arg3) {
        int var5 = 52 % ((-arg0 - 76) / 48);
        field2936++;
        if (arg3 == -1) {
            this.field2947[arg2] = 0;
        } else if (arg1.method42(arg3, false) != null) {
            this.field2947[arg2] = class460.method2676(arg3, 1073741824);
            this.method1342(-170762936);
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(B)V", line = 1268)
    public static final void method1337(byte arg0) {
        field2944++;
        class681.field9691.method936(-110);
        if (arg0 != 57) {
            field2945 = null;
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(BIILgm;)V", line = 1280)
    public final void method1338(byte arg0, int arg1, int arg2, class509 arg3) {
        field2943++;
        int var5 = 58 % ((arg0 + 86) / 35);
        int var6 = class192.field2982[arg1];
        if (arg3.method3030(arg2, 64) != null) {
            this.field2947[var6] = class460.method2676(Integer.MIN_VALUE, arg2);
            this.method1342(-170762936);
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(IIIIIIILgm;Lfo;Loq;ILr;)Lda;", line = 1305)
    public final class397 method1339(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class509 arg7, class606 arg8, class205 arg9, int arg10, class98 arg11) {
        field2946++;
        int var13 = arg1;
        if (arg8 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            Object var21 = null;
            int var22 = arg8.field8707[arg0];
            var13 = arg1 | 0x20;
            int var23 = var22 >>> 16;
            class374 var24 = arg9.method1421((byte) 74, var23);
            int var25 = var22 & 0xFFFF;
            if (var24 != null) {
                var15 |= var24.method2238(1, var25);
                var14 |= var24.method2234(var25, (byte) 61);
                var17 |= var24.method2235(-29895, var25);
                var16 |= arg8.field8717;
            }
            if ((arg8.field8703 || class61.field888) && arg4 != -1 && arg4 < arg8.field8707.length) {
                int var26 = arg8.field8707[arg4];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class374 var29;
                if (var23 == var27) {
                    var29 = var24;
                } else {
                    var29 = arg9.method1421((byte) 64, var28 >>> 16);
                }
                if (var29 != null) {
                    var15 |= var29.method2238(1, var28);
                    var14 |= var29.method2234(var28, (byte) 61);
                    var17 |= var29.method2235(-29895, var28);
                }
            }
            if (var15) {
                var13 |= 0x80;
            }
            if (var14) {
                var13 |= 0x100;
            }
            if (var16) {
                var13 |= 0x200;
            }
            if (var17) {
                var13 |= 0x400;
            }
        }
        long var30 = (long) arg10 | (long) arg2 << 32 | (long) (arg5 << 16);
        class117 var32 = class45.field602;
        class397 var33;
        synchronized (class45.field602) {
            var33 = (class397) class45.field602.method941(var30, 0);
        }
        if (var33 == null || arg11.method754(var33.method468(), var13) != 0) {
            if (var33 != null) {
                var13 = arg11.method738(var13, var33.method468());
            }
            class163[] var35 = new class163[3];
            int var36 = 0;
            if (!arg7.method3030(arg10, 64).method3878(true) || !arg7.method3030(arg5, 64).method3878(true) || !arg7.method3030(arg2, 64).method3878(true)) {
                return null;
            }
            class163 var37 = arg7.method3030(arg10, 64).method3877(0);
            if (var37 != null) {
                var35[var36++] = var37;
            }
            class163 var38 = arg7.method3030(arg5, 64).method3877(0);
            if (var38 != null) {
                var35[var36++] = var38;
            }
            class163 var39 = arg7.method3030(arg2, 64).method3877(0);
            if (var39 != null) {
                var35[var36++] = var39;
            }
            class163 var40 = new class163(var35, var36);
            int var41 = var13 | 0x4000;
            var33 = arg11.method795(var40, var41, class69.field1096, 64, 768);
            for (int var42 = 0; var42 < 5; var42++) {
                for (int var43 = 0; var43 < class583.field8544.length; var43++) {
                    if (class583.field8544[var43][var42].length > this.field2937[var42]) {
                        var33.method464(class78.field1198[var43][var42], class583.field8544[var43][var42][this.field2937[var42]]);
                    }
                }
            }
            var33.method438(var13);
            class117 var44 = class45.field602;
            synchronized (class45.field602) {
                class45.field602.method949(var30, true, var33);
            }
        }
        if (arg8 == null) {
            return var33;
        } else {
            class397 var45 = var33.method475((byte) 4, var13, true);
            int var46 = 103 / ((-arg3 - 59) / 57);
            return arg8.method3447(arg1, arg4, arg0, -15255, var45, arg6);
        }
    }

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "(III)V", line = 1456)
    public final void method1340(int arg0, int arg1, int arg2) {
        int var4 = 117 % ((-arg1 - 15) / 52);
        field2956++;
        this.field2937[arg0] = arg2;
        this.method1342(-170762936);
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(ZI)V", line = 1467)
    public final void method1341(boolean arg0, int arg1) {
        this.field2953 = arg0;
        if (arg1 == 3211) {
            field2949++;
            this.method1342(-170762936);
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(I)V", line = 1479)
    private final void method1342(int arg0) {
        field2942++;
        long[] var2 = class507.field7528;
        this.field2941 = -1L;
        this.field2941 = this.field2941 >>> 8 ^ var2[(int) ((this.field2941 ^ (long) (this.field2938 >> 8)) & 0xFFL)];
        this.field2941 = this.field2941 >>> 8 ^ var2[(int) (((long) this.field2938 ^ this.field2941) & 0xFFL)];
        for (int var3 = 0; var3 < 12; var3++) {
            this.field2941 = var2[(int) (((long) (this.field2947[var3] >> 24) ^ this.field2941) & 0xFFL)] ^ this.field2941 >>> 8;
            this.field2941 = this.field2941 >>> 8 ^ var2[(int) ((this.field2941 ^ (long) (this.field2947[var3] >> 16)) & 0xFFL)];
            this.field2941 = this.field2941 >>> 8 ^ var2[(int) ((this.field2941 ^ (long) (this.field2947[var3] >> 8)) & 0xFFL)];
            this.field2941 = var2[(int) ((this.field2941 ^ (long) this.field2947[var3]) & 0xFFL)] ^ this.field2941 >>> 8;
        }
        if (arg0 != -170762936) {
            this.field2938 = 0;
        }
        for (int var4 = 0; var4 < 5; var4++) {
            this.field2941 = var2[(int) (((long) this.field2937[var4] ^ this.field2941) & 0xFFL)] ^ this.field2941 >>> 8;
        }
        this.field2941 = this.field2941 >>> 8 ^ var2[(int) (((long) (this.field2953 ? 1 : 0) ^ this.field2941) & 0xFFL)];
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(Z)[I", line = 1528)
    public static final int[] method1343(boolean arg0) {
        field2950++;
        return arg0 ? new int[] { class515.field7635, class51.field678, class271.field3890 } : null;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "([IZIZ[II)V", line = 1543)
    public final void method1344(int[] arg0, boolean arg1, int arg2, boolean arg3, int[] arg4, int arg5) {
        this.field2937 = arg0;
        this.field2955 = arg5;
        if (this.field2938 != arg2) {
            this.field2938 = arg2;
        }
        this.field2947 = arg4;
        this.field2953 = arg1;
        field2939++;
        if (arg3) {
            this.field2955 = 3;
        }
        this.method1342(-170762936);
    }

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "(I)V", line = 1578)
    public static void method1345(int arg0) {
        field2951 = null;
        if (arg0 != 0) {
            method1343(true);
        }
        field2945 = null;
    }
}
