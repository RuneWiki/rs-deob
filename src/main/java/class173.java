import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class173 extends class43 {

    @OriginalMember(owner = "client!pj", name = "hb", descriptor = "[I")
    private int[] field3236 = new int[257];

    @OriginalMember(owner = "client!pj", name = "fb", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field3234 = new CRC32();

    @OriginalMember(owner = "client!pj", name = "gb", descriptor = "I")
    public static int field3235 = 0;

    @OriginalMember(owner = "client!pj", name = "T", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!pj", name = "U", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!pj", name = "V", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!pj", name = "W", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!pj", name = "X", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!pj", name = "Y", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!pj", name = "Z", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!pj", name = "ab", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!pj", name = "bb", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!pj", name = "cb", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!pj", name = "eb", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!pj", name = "ib", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!pj", name = "jb", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!pj", name = "db", descriptor = "[[I")
    private int[][] field3232;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(B)V")
    public static void method1126(byte arg0) {
        field3234 = null;
        if (arg0 != -115) {
            field3234 = null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "(I)V")
    public final void method234(int arg0) {
        if (this.field3232 == null) {
            this.method1133(1, (byte) 79);
        }
        this.method1128(125);
        ++field3230;
        if (arg0 < 21) {
            this.field3232 = null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "(B)V")
    public static final void method1127(byte arg0) {
        if (arg0 != 29) {
            method1131(10, (byte) -11, (class132) null);
        }
        while (~class118.field2241.method653(class39.field630, (byte) 80) <= -28) {
            int var1 = class118.field2241.method649(15, 25091);
            if (~var1 == -32768) {
                break;
            }
            boolean var2 = false;
            if (class11.field145[var1] == null) {
                class11.field145[var1] = new class65();
                var2 = true;
            }
            class65 var3 = class11.field145[var1];
            class226.field4098[class131.field2423++] = var1;
            var3.field669 = class30.field460;
            int var4 = class118.field2241.method649(1, 25091);
            if (var4 == 1) {
                class211.field3874[class220.field4003++] = var1;
            }
            int var5 = class118.field2241.method649(5, 25091);
            int var6 = class118.field2241.method649(1, arg0 + 25062);
            if (var5 > 15) {
                var5 -= 32;
            }
            int var7 = class209.field3809[class118.field2241.method649(3, 25091)];
            if (var2) {
                var3.field739 = var3.field707 = var7;
            }
            var3.field1072 = class189.method1209((byte) 113, class118.field2241.method649(14, 25091));
            int var8 = class118.field2241.method649(5, arg0 ^ 25118);
            var3.field720 = var3.field1072.field3401;
            var3.field702 = var3.field1072.field3430;
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.field679 = var3.field1072.field3422;
            var3.field712 = var3.field1072.field3425;
            var3.field687 = var3.field1072.field3417;
            if (var3.field687 == 0) {
                var3.field707 = 0;
            }
            var3.field736 = var3.field1072.field3390;
            var3.field715 = var3.field1072.field3399;
            var3.field727 = var3.field1072.field3400;
            var3.field708 = var3.field1072.field3398;
            var3.method290(class210.field3854.field676[0] - -var8, class210.field3854.field703[0] + var5, (byte) -98, var6 == 1);
        }
        class118.field2241.method650(arg0 ^ -77);
        ++field3226;
    }

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "(I)V")
    private final void method1128(int arg0) {
        ++field3223;
        if (arg0 >= 113) {
            int var2 = this.field3232.length;
            if (~var2 < -1) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = 0;
                    int var5 = var3 << 4;
                    for (int var6 = 0; var2 > var6 && var5 >= this.field3232[var6][0]; ++var6) {
                        ++var4;
                    }
                    int var8;
                    int var9;
                    int var10;
                    if (var2 > var4) {
                        int[] var7 = this.field3232[var4];
                        if (var4 <= 0) {
                            var8 = var7[3];
                            var9 = var7[2];
                            var10 = var7[1];
                        } else {
                            int[] var11 = this.field3232[var4 - 1];
                            int var12 = (-var11[0] + var5 << 12) / (var7[0] - var11[0]);
                            int var13 = 4096 - var12;
                            var9 = var7[2] * var12 + var11[2] * var13 >> 12;
                            var8 = var7[3] * var12 + var11[3] * var13 >> 12;
                            var10 = var7[1] * var12 + var11[1] * var13 >> 12;
                        }
                    } else {
                        int[] var14 = this.field3232[var2 - 1];
                        var8 = var14[3];
                        var9 = var14[2];
                        var10 = var14[1];
                    }
                    int var15 = var10 >> 4;
                    int var16 = var9 >> 4;
                    if (var16 < 0) {
                        var16 = 0;
                    } else if (var16 > 255) {
                        var16 = 255;
                    }
                    if (var15 >= 0) {
                        if (var15 > 255) {
                            var15 = 255;
                        }
                    } else {
                        var15 = 0;
                    }
                    int var17 = var8 >> 4;
                    if (~var17 <= -1) {
                        if (~var17 < -256) {
                            var17 = 255;
                        }
                    } else {
                        var17 = 0;
                    }
                    this.field3236[var3] = class219.method1368(class219.method1368(var16 << 8, var15 << 16), var17);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "()V")
    public class173() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IBLkd;)V")
    public final void method200(int arg0, byte arg1, class112 arg2) {
        if (arg1 != -73) {
            field3234 = null;
        }
        if (~arg0 == -1) {
            int var4 = arg2.method716(-1308);
            if (var4 != 0) {
                this.method1133(var4, (byte) 99);
            } else {
                this.field3232 = new int[arg2.method716(-1308)][4];
                for (int var5 = 0; ~var5 > ~this.field3232.length; ++var5) {
                    this.field3232[var5][0] = arg2.method739(-2);
                    this.field3232[var5][1] = arg2.method716(-1308) << 4;
                    this.field3232[var5][2] = arg2.method716(-1308) << 4;
                    this.field3232[var5][3] = arg2.method716(-1308) << 4;
                }
            }
        }
        ++field3228;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILu;I[B)V")
    public static final void method1129(int arg0, class214 arg1, int arg2, byte[] arg3) {
        class231 var4 = new class231();
        var4.field4160 = arg1;
        var4.field4161 = 0;
        var4.field4157 = arg3;
        ++field3222;
        var4.field2760 = (long) arg0;
        class19 var5 = class128.field2370;
        synchronized (class128.field2370) {
            class128.field2370.method120(0, var4);
        }
        int var6 = -71 % ((arg2 - 37) / 53);
        class155.method1015(-21568);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1130(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class132.field2469 = 0;
        ++field3225;
        for (int var7 = -1; var7 < class160.field2906 + class131.field2423; ++var7) {
            class42 var23;
            if (~var7 != 0) {
                if (~class160.field2906 < ~var7) {
                    var23 = class68.field1120[class33.field527[var7]];
                } else {
                    var23 = class11.field145[class226.field4098[-class160.field2906 + var7]];
                }
            } else {
                var23 = class210.field3854;
            }
            if (var23 != null && var23.method291(96)) {
                if (var23 instanceof class65) {
                    class185 var24 = ((class65) var23).field1072;
                    if (var24.field3394 != null) {
                        var24 = var24.method1188(arg2 + 26850);
                    }
                    if (var24 == null) {
                        continue;
                    }
                }
                if (class160.field2906 <= var7) {
                    class185 var25 = ((class65) var23).field1072;
                    if (var25.field3394 != null) {
                        var25 = var25.method1188(72);
                    }
                    if (var25.field3408 >= 0 && var25.field3408 < class45.field780.length) {
                        class139.method940(arg3 >> 1, arg4, arg6, arg5 >> 1, var23.method286((byte) -111) + 15, 1, var23);
                        if (class169.field3137 > -1) {
                            class45.field780[var25.field3408].method103(arg1 + -12 + class169.field3137, arg0 - -class26.field425 - 30);
                        }
                    }
                    class59[] var26 = class203.field3742;
                    for (int var27 = 0; var26.length > var27; ++var27) {
                        class59 var28 = var26[var27];
                        if (var28 != null && var28.field989 == 1 && class226.field4098[-class160.field2906 + var7] == var28.field1004 && class30.field460 % 20 < 10) {
                            class139.method940(arg3 >> 1, arg4, arg6, arg5 >> 1, var23.method286((byte) -121) + 15, arg2 ^ -26748, var23);
                            if (class169.field3137 > -1) {
                                class17.field261[var28.field1012].method103(arg1 + -12 + class169.field3137, class26.field425 + arg0 + -28);
                            }
                        }
                    }
                } else {
                    int var29 = 30;
                    class159 var30 = (class159) var23;
                    if (~var30.field2875 != 0 || ~var30.field2884 != 0) {
                        class139.method940(arg3 >> 1, arg4, arg6, arg5 >> 1, var23.method286((byte) -111) + 15, 1, var23);
                        if (~class169.field3137 < 0) {
                            if (~var30.field2875 != 0) {
                                class86.field1499[var30.field2875].method103(class169.field3137 + arg1 + -12, class26.field425 + arg0 + -var29);
                                var29 += 25;
                            }
                            if (var30.field2884 != -1) {
                                class45.field780[var30.field2884].method103(class169.field3137 + arg1 - 12, class26.field425 + arg0 - var29);
                                var29 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        class59[] var31 = class203.field3742;
                        for (int var32 = 0; var31.length > var32; ++var32) {
                            class59 var33 = var31[var32];
                            if (var33 != null && ~var33.field989 == -11 && ~class33.field527[var7] == ~var33.field1004) {
                                class139.method940(arg3 >> 1, arg4, arg6, arg5 >> 1, var23.method286((byte) -127) + 15, arg2 ^ -26748, var23);
                                if (~class169.field3137 < 0) {
                                    class17.field261[var33.field1012].method103(arg1 - 12 + class169.field3137, class26.field425 + arg0 + -var29);
                                }
                            }
                        }
                    }
                }
                if (var23.field668 != null && (~var7 <= ~class160.field2906 || class241.field4328 == 0 || class241.field4328 == 3 || class241.field4328 == 1 && class8.method34(((class159) var23).field2877, (byte) -80))) {
                    class139.method940(arg3 >> 1, arg4, arg6, arg5 >> 1, var23.method286((byte) -118), 1, var23);
                    if (~class169.field3137 < 0 && class110.field2078 > class132.field2469) {
                        class110.field2075[class132.field2469] = class53.field895.method687(var23.field668) / 2;
                        class110.field2087[class132.field2469] = class53.field895.field2017;
                        class110.field2090[class132.field2469] = class169.field3137;
                        class110.field2091[class132.field2469] = class26.field425;
                        class110.field2092[class132.field2469] = var23.field680;
                        class110.field2072[class132.field2469] = var23.field696;
                        class110.field2065[class132.field2469] = var23.field729;
                        class110.field2068[class132.field2469] = var23.field668;
                        ++class132.field2469;
                    }
                }
                if (~var23.field672 < ~class30.field460) {
                    class139.method940(arg3 >> 1, arg4, arg6, arg5 >> 1, 15 + var23.method286((byte) -119), arg2 + 26748, var23);
                    if (class169.field3137 > -1) {
                        class239.method1525(class169.field3137 + arg1 - 15, class26.field425 + arg0 + -3, var23.field698, 5, 65280);
                        class239.method1525(class169.field3137 + arg1 + -15 + var23.field698, class26.field425 + arg0 + -3, -var23.field698 + 30, 5, 16711680);
                    }
                }
                for (int var34 = 0; var34 < 4; ++var34) {
                    if (~var23.field734[var34] < ~class30.field460) {
                        class139.method940(arg3 >> 1, arg4, arg6, arg5 >> 1, var23.method286((byte) -112) / 2, 1, var23);
                        if (~class169.field3137 < 0) {
                            if (~var34 == -2) {
                                class26.field425 -= 20;
                            }
                            if (~var34 == -3) {
                                class169.field3137 -= 15;
                                class26.field425 -= 10;
                            }
                            if (var34 == 3) {
                                class26.field425 -= 10;
                                class169.field3137 += 15;
                            }
                            class150.field2756[var23.field730[var34]].method103(class169.field3137 + arg1 + -12, class26.field425 + arg0 - 12);
                            class12.field161.method674(class132.method889(var23.field724[var34], (byte) 98), class169.field3137 + arg1 + -1, class26.field425 + arg0 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        if (arg2 != -26747) {
            field3235 = 84;
        }
        for (int var8 = 0; ~class132.field2469 < ~var8; ++var8) {
            int var9 = class110.field2090[var8];
            int var10 = class110.field2091[var8];
            int var11 = class110.field2075[var8];
            boolean var12 = true;
            int var13 = class110.field2087[var8];
            while (var12) {
                var12 = false;
                for (int var22 = 0; ~var8 < ~var22; ++var22) {
                    if (var10 + 2 > class110.field2091[var22] + -class110.field2087[var22] && -var13 + var10 < class110.field2091[var22] + 2 && ~(class110.field2090[var22] + class110.field2075[var22]) < ~(-var11 + var9) && var9 + var11 > class110.field2090[var22] + -class110.field2075[var22] && var10 > class110.field2091[var22] + -class110.field2087[var22]) {
                        var10 = class110.field2091[var22] - class110.field2087[var22];
                        var12 = true;
                    }
                }
            }
            class169.field3137 = class110.field2090[var8];
            class26.field425 = class110.field2091[var8] = var10;
            class132 var14 = class110.field2068[var8];
            if (class43.field761 != 0) {
                class53.field895.method674(var14, class169.field3137 + arg1, class26.field425 + arg0, 16776960, 0);
            } else {
                int var15 = 16776960;
                if (~class110.field2092[var8] > -7) {
                    var15 = class103.field1943[class110.field2092[var8]];
                }
                if (~class110.field2092[var8] == -7) {
                    var15 = class209.field3800 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class110.field2092[var8] == 7) {
                    var15 = ~(class209.field3800 % 20) <= -11 ? 65535 : 255;
                }
                if (~class110.field2092[var8] == -9) {
                    var15 = ~(class209.field3800 % 20) <= -11 ? 8454016 : 45056;
                }
                if (class110.field2092[var8] == 9) {
                    int var16 = -class110.field2065[var8] + 150;
                    if (var16 < 50) {
                        var15 = var16 * 1280 + 16711680;
                    } else if (~var16 > -101) {
                        var15 = 16776960 - (var16 + -50) * 327680;
                    } else if (var16 < 150) {
                        var15 = (var16 + -100) * 5 + 65280;
                    }
                }
                if (class110.field2092[var8] == 10) {
                    int var17 = -class110.field2065[var8] + 150;
                    if (var17 < 50) {
                        var15 = var17 * 5 + 16711680;
                    } else if (~var17 > -101) {
                        var15 = -((var17 - 50) * 327680) + 16711935;
                    } else if (var17 < 150) {
                        var15 = (var17 + -100) * 327680 + 255 + -((var17 + -100) * 5);
                    }
                }
                if (class110.field2092[var8] == 11) {
                    int var18 = -class110.field2065[var8] + 150;
                    if (var18 >= 50) {
                        if (~var18 > -101) {
                            var15 = (var18 + -50) * 327685 + 65280;
                        } else if (~var18 > -151) {
                            var15 = 16777215 - (var18 + -100) * 327680;
                        }
                    } else {
                        var15 = 16777215 - var18 * 327685;
                    }
                }
                if (~class110.field2072[var8] == -1) {
                    class53.field895.method674(var14, class169.field3137 + arg1, class26.field425 + arg0, var15, 0);
                }
                if (~class110.field2072[var8] == -2) {
                    class53.field895.method663(var14, class169.field3137 + arg1, class26.field425 + arg0, var15, 0, class209.field3800);
                }
                if (~class110.field2072[var8] == -3) {
                    class53.field895.method667(var14, class169.field3137 + arg1, class26.field425 + arg0, var15, 0, class209.field3800);
                }
                if (class110.field2072[var8] == 3) {
                    class53.field895.method684(var14, class169.field3137 + arg1, class26.field425 + arg0, var15, 0, class209.field3800, -class110.field2065[var8] + 150);
                }
                if (class110.field2072[var8] == 4) {
                    int var19 = (-class110.field2065[var8] + 150) * (100 + class53.field895.method687(var14)) / 150;
                    class239.method1532(class169.field3137 + arg1 + -50, arg0, arg1 + 50 + class169.field3137, arg0 - -arg3);
                    class53.field895.method670(var14, arg1 - -50 + class169.field3137 + -var19, class26.field425 + arg0, var15, 0);
                    class239.method1517(arg1, arg0, arg1 + arg5, arg0 + arg3);
                }
                if (class110.field2072[var8] == 5) {
                    int var20 = -class110.field2065[var8] + 150;
                    class239.method1532(arg1, arg0 - (-class26.field425 - -class53.field895.field2017) + -1, arg1 - -arg5, class26.field425 + arg0 + 5);
                    int var21 = 0;
                    if (var20 >= 25) {
                        if (var20 > 125) {
                            var21 = var20 + -125;
                        }
                    } else {
                        var21 = var20 - 25;
                    }
                    class53.field895.method674(var14, class169.field3137 + arg1, arg0 - -class26.field425 + var21, var15, 0);
                    class239.method1517(arg1, arg0, arg1 + arg5, arg0 + arg3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IBLmb;)V")
    public static final void method1131(int arg0, byte arg1, class132 arg2) {
        ++field3237;
        ++class35.field575;
        class64.field1054.method660(25, arg1 ^ 108);
        class64.field1054.method710(arg0, -1);
        class64.field1054.method727(arg2.method867(arg1 + -27521), (byte) -111);
        if (arg1 != 111) {
            field3229 = 96;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BLpb;)V")
    public static final void method1132(byte arg0, class165 arg1) {
        if (arg0 == 59) {
            ++field3233;
            class56.field945 = arg1;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)[[I")
    public final int[][] method203(int arg0, int arg1) {
        if (arg0 != -1893) {
            return null;
        } else {
            int[][] var3 = super.field764.method1350((byte) 125, arg1);
            ++field3224;
            if (super.field764.field3960) {
                int[] var4 = this.method300(-94, 0, arg1);
                int[] var5 = var3[0];
                int[] var6 = var3[1];
                int[] var7 = var3[2];
                for (int var8 = 0; var8 < class131.field2427; ++var8) {
                    int var9 = var4[var8] >> 4;
                    if (~var9 > -1) {
                        var9 = 0;
                    }
                    if (~var9 < -257) {
                        var9 = 256;
                    }
                    int var10 = this.field3236[var9];
                    var5[var8] = class75.method450(var10 >> 12, 4080);
                    var6[var8] = class75.method450(var10, 65280) >> 4;
                    var7[var8] = class75.method450(var10 << 4, 4080);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IB)V")
    private final void method1133(int arg0, byte arg1) {
        if (arg1 <= 54) {
            method1130(32, -70, -45, -28, -107, 127, 68);
        }
        ++field3231;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (~arg0 == -7) {
                                    this.field3232 = new int[4][4];
                                    this.field3232[0][0] = 2048;
                                    this.field3232[0][3] = 0;
                                    this.field3232[1][3] = 0;
                                    this.field3232[0][2] = 4096;
                                    this.field3232[1][0] = 2867;
                                    this.field3232[1][2] = 4096;
                                    this.field3232[2][3] = 0;
                                    this.field3232[2][0] = 3276;
                                    this.field3232[3][0] = 4096;
                                    this.field3232[2][2] = 4096;
                                    this.field3232[3][2] = 0;
                                    this.field3232[3][3] = 0;
                                    this.field3232[0][1] = 0;
                                    this.field3232[1][1] = 4096;
                                    this.field3232[2][1] = 4096;
                                    this.field3232[3][1] = 4096;
                                } else {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                            } else {
                                this.field3232 = new int[16][4];
                                this.field3232[0][1] = 80;
                                this.field3232[0][2] = 192;
                                this.field3232[1][2] = 449;
                                this.field3232[0][0] = 0;
                                this.field3232[1][0] = 155;
                                this.field3232[2][2] = 690;
                                this.field3232[1][1] = 321;
                                this.field3232[3][2] = 995;
                                this.field3232[2][1] = 578;
                                this.field3232[3][1] = 947;
                                this.field3232[4][1] = 1285;
                                this.field3232[5][1] = 1525;
                                this.field3232[0][3] = 321;
                                this.field3232[1][3] = 562;
                                this.field3232[6][1] = 1734;
                                this.field3232[2][3] = 803;
                                this.field3232[4][2] = 1397;
                                this.field3232[3][3] = 1140;
                                this.field3232[5][2] = 1429;
                                this.field3232[6][2] = 1461;
                                this.field3232[2][0] = 389;
                                this.field3232[4][3] = 1509;
                                this.field3232[7][1] = 1413;
                                this.field3232[7][2] = 1525;
                                this.field3232[8][2] = 1590;
                                this.field3232[5][3] = 1413;
                                this.field3232[8][1] = 1108;
                                this.field3232[9][1] = 1766;
                                this.field3232[3][0] = 671;
                                this.field3232[4][0] = 897;
                                this.field3232[5][0] = 1175;
                                this.field3232[9][2] = 2056;
                                this.field3232[6][0] = 1368;
                                this.field3232[10][1] = 2409;
                                this.field3232[10][2] = 2586;
                                this.field3232[11][2] = 3148;
                                this.field3232[11][1] = 3116;
                                this.field3232[12][2] = 3710;
                                this.field3232[13][2] = 3421;
                                this.field3232[14][2] = 3148;
                                this.field3232[7][0] = 1507;
                                this.field3232[6][3] = 1333;
                                this.field3232[7][3] = 1702;
                                this.field3232[12][1] = 3806;
                                this.field3232[8][0] = 1736;
                                this.field3232[8][3] = 2056;
                                this.field3232[15][2] = 2505;
                                this.field3232[9][3] = 2666;
                                this.field3232[9][0] = 2088;
                                this.field3232[10][0] = 2355;
                                this.field3232[13][1] = 3437;
                                this.field3232[14][1] = 3116;
                                this.field3232[15][1] = 2377;
                                this.field3232[11][0] = 2691;
                                this.field3232[10][3] = 3276;
                                this.field3232[11][3] = 3228;
                                this.field3232[12][3] = 3196;
                                this.field3232[12][0] = 3031;
                                this.field3232[13][0] = 3522;
                                this.field3232[14][0] = 3727;
                                this.field3232[13][3] = 3019;
                                this.field3232[14][3] = 3228;
                                this.field3232[15][3] = 2746;
                                this.field3232[15][0] = 4096;
                            }
                        } else {
                            this.field3232 = new int[6][4];
                            this.field3232[0][0] = 0;
                            this.field3232[0][3] = 0;
                            this.field3232[1][0] = 1843;
                            this.field3232[2][0] = 2457;
                            this.field3232[0][2] = 0;
                            this.field3232[1][3] = 1493;
                            this.field3232[1][2] = 0;
                            this.field3232[2][3] = 2939;
                            this.field3232[3][3] = 3565;
                            this.field3232[3][0] = 2781;
                            this.field3232[2][2] = 0;
                            this.field3232[3][2] = 1124;
                            this.field3232[4][3] = 4031;
                            this.field3232[4][0] = 3481;
                            this.field3232[0][1] = 0;
                            this.field3232[5][0] = 4096;
                            this.field3232[5][3] = 4096;
                            this.field3232[4][2] = 3084;
                            this.field3232[5][2] = 4096;
                            this.field3232[1][1] = 0;
                            this.field3232[2][1] = 0;
                            this.field3232[3][1] = 0;
                            this.field3232[4][1] = 546;
                            this.field3232[5][1] = 4096;
                        }
                    } else {
                        this.field3232 = new int[7][4];
                        this.field3232[0][2] = 0;
                        this.field3232[0][3] = 4096;
                        this.field3232[1][2] = 4096;
                        this.field3232[0][0] = 0;
                        this.field3232[2][2] = 4096;
                        this.field3232[1][3] = 4096;
                        this.field3232[3][2] = 4096;
                        this.field3232[4][2] = 0;
                        this.field3232[5][2] = 0;
                        this.field3232[2][3] = 0;
                        this.field3232[0][1] = 0;
                        this.field3232[1][0] = 663;
                        this.field3232[3][3] = 0;
                        this.field3232[6][2] = 0;
                        this.field3232[1][1] = 0;
                        this.field3232[2][0] = 1363;
                        this.field3232[3][0] = 2048;
                        this.field3232[4][3] = 0;
                        this.field3232[5][3] = 4096;
                        this.field3232[6][3] = 4096;
                        this.field3232[4][0] = 2727;
                        this.field3232[2][1] = 0;
                        this.field3232[3][1] = 4096;
                        this.field3232[5][0] = 3411;
                        this.field3232[4][1] = 4096;
                        this.field3232[6][0] = 4096;
                        this.field3232[5][1] = 4096;
                        this.field3232[6][1] = 0;
                    }
                } else {
                    this.field3232 = new int[8][4];
                    this.field3232[0][3] = 2361;
                    this.field3232[0][1] = 2650;
                    this.field3232[1][1] = 2313;
                    this.field3232[0][0] = 0;
                    this.field3232[1][0] = 2867;
                    this.field3232[2][0] = 3072;
                    this.field3232[2][1] = 2618;
                    this.field3232[0][2] = 2602;
                    this.field3232[3][0] = 3276;
                    this.field3232[1][3] = 1558;
                    this.field3232[1][2] = 1799;
                    this.field3232[4][0] = 3481;
                    this.field3232[2][3] = 1413;
                    this.field3232[5][0] = 3686;
                    this.field3232[6][0] = 3891;
                    this.field3232[2][2] = 1734;
                    this.field3232[3][3] = 947;
                    this.field3232[7][0] = 4096;
                    this.field3232[3][2] = 1220;
                    this.field3232[3][1] = 2296;
                    this.field3232[4][3] = 722;
                    this.field3232[4][1] = 2072;
                    this.field3232[4][2] = 963;
                    this.field3232[5][2] = 2152;
                    this.field3232[5][1] = 2730;
                    this.field3232[6][2] = 1060;
                    this.field3232[7][2] = 1413;
                    this.field3232[5][3] = 1766;
                    this.field3232[6][3] = 915;
                    this.field3232[6][1] = 2232;
                    this.field3232[7][1] = 1686;
                    this.field3232[7][3] = 1140;
                }
            } else {
                this.field3232 = new int[2][4];
                this.field3232[0][2] = 0;
                this.field3232[0][1] = 0;
                this.field3232[1][1] = 4096;
                this.field3232[0][3] = 0;
                this.field3232[0][0] = 0;
                this.field3232[1][0] = 4096;
                this.field3232[1][2] = 4096;
                this.field3232[1][3] = 4096;
            }
        }
    }
}
