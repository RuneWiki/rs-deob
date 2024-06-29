import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class21 extends class99 {

    @OriginalMember(owner = "client!wi", name = "Z", descriptor = "[S")
    private short[] field289 = new short[512];

    @OriginalMember(owner = "client!wi", name = "X", descriptor = "I")
    private int field287 = 0;

    @OriginalMember(owner = "client!wi", name = "bb", descriptor = "I")
    private int field291 = 2048;

    @OriginalMember(owner = "client!wi", name = "eb", descriptor = "I")
    private int field294 = 5;

    @OriginalMember(owner = "client!wi", name = "gb", descriptor = "I")
    private int field296 = 2;

    @OriginalMember(owner = "client!wi", name = "db", descriptor = "I")
    private int field293 = 1;

    @OriginalMember(owner = "client!wi", name = "jb", descriptor = "[B")
    private byte[] field299 = new byte[512];

    @OriginalMember(owner = "client!wi", name = "ab", descriptor = "I")
    private int field290 = 5;

    @OriginalMember(owner = "client!wi", name = "cb", descriptor = "[I")
    public static int[] field292 = new int[32];

    @OriginalMember(owner = "client!wi", name = "Y", descriptor = "[I")
    public static int[] field288 = new int[100];

    @OriginalMember(owner = "client!wi", name = "Q", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!wi", name = "R", descriptor = "I")
    public static int field281;

    @OriginalMember(owner = "client!wi", name = "S", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!wi", name = "T", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!wi", name = "U", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!wi", name = "V", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!wi", name = "W", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!wi", name = "fb", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!wi", name = "hb", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!wi", name = "ib", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "()V")
    public class21() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(BI)[I")
    public final int[] method10(byte arg0, int arg1) {
        ++field284;
        int[] var3 = super.field1943.method749(false, arg1);
        if (arg0 != -61) {
            return null;
        } else {
            if (super.field1943.field2147) {
                int var4 = class19.field261[arg1] * this.field290 + 2048;
                int var5 = var4 >> 12;
                int var6 = var5 + 1;
                for (int var7 = 0; class199.field3432 > var7; ++var7) {
                    class94.field1816 = Integer.MAX_VALUE;
                    class219.field3762 = Integer.MAX_VALUE;
                    class158.field2854 = Integer.MAX_VALUE;
                    class159.field2863 = Integer.MAX_VALUE;
                    int var8 = class10.field120[var7] * this.field294 + 2048;
                    int var9 = var8 >> 12;
                    int var10 = var9 + 1;
                    for (int var11 = var5 + -1; ~var6 <= ~var11; ++var11) {
                        int var13 = this.field299[255 & (var11 < this.field290 ? var11 : -this.field290 + var11)] & 255;
                        for (int var14 = var9 + -1; var14 <= var10; ++var14) {
                            int var15 = (this.field299[var13 - -(~this.field294 >= ~var14 ? -this.field294 + var14 : var14) & 255] & 255) * 2;
                            int var10000 = -(var14 << 12);
                            int var27 = var15 + 1;
                            int var16 = var10000 - this.field289[var15] + var8;
                            int var17 = var4 - ((var11 << 12) + this.field289[var27]);
                            int var18 = this.field293;
                            int var19;
                            if (var18 != 1) {
                                if (~var18 != -4) {
                                    if (~var18 != -5) {
                                        if (var18 != 5) {
                                            if (~var18 == -3) {
                                                var19 = (~var16 <= -1 ? var16 : -var16) + (var17 >= 0 ? var17 : -var17);
                                            } else {
                                                var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)));
                                            }
                                        } else {
                                            int var20 = var16 * var16;
                                            int var21 = var17 * var17;
                                            var19 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))));
                                        }
                                    } else {
                                        int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (~var16 <= -1 ? var16 : -var16) / 4096.0F)));
                                        int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (var17 < 0 ? -var17 : var17) / 4096.0F)));
                                        int var24 = var22 + var23;
                                        var19 = var24 * var24 >> 12;
                                    }
                                } else {
                                    int var25 = ~var16 <= -1 ? var16 : -var16;
                                    int var26 = ~var17 > -1 ? -var17 : var17;
                                    var19 = ~var25 >= ~var26 ? var26 : var25;
                                }
                            } else {
                                var19 = var16 * var16 - -(var17 * var17) >> 12;
                            }
                            if (~var19 <= ~class159.field2863) {
                                if (~class158.field2854 >= ~var19) {
                                    if (class219.field3762 <= var19) {
                                        if (class94.field1816 > var19) {
                                            class94.field1816 = var19;
                                        }
                                    } else {
                                        class94.field1816 = class219.field3762;
                                        class219.field3762 = var19;
                                    }
                                } else {
                                    class94.field1816 = class219.field3762;
                                    class219.field3762 = class158.field2854;
                                    class158.field2854 = var19;
                                }
                            } else {
                                class94.field1816 = class219.field3762;
                                class219.field3762 = class158.field2854;
                                class158.field2854 = class159.field2863;
                                class159.field2863 = var19;
                            }
                        }
                    }
                    int var12 = this.field296;
                    if (var12 != 0) {
                        if (var12 != 1) {
                            if (var12 != 3) {
                                if (~var12 != -5) {
                                    if (var12 == 2) {
                                        var3[var7] = class158.field2854 - class159.field2863;
                                    }
                                } else {
                                    var3[var7] = class94.field1816;
                                }
                            } else {
                                var3[var7] = class219.field3762;
                            }
                        } else {
                            var3[var7] = class158.field2854;
                        }
                    } else {
                        var3[var7] = class159.field2863;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "(B)V")
    public static final void method92(byte arg0) {
        int var1 = 102 / ((arg0 - -71) / 38);
        if (class90.field1743 == 2) {
            if (~class92.field1769 == ~class147.field2683 && class8.field83 == class29.field429) {
                class90.field1743 = 0;
                class41.method261((byte) -126, class176.field3105 - 1);
            }
        } else if (class188.field3274 == class147.field2683 && ~class29.field429 == ~class174.field3068) {
            class90.field1743 = 0;
            class41.method261((byte) 102, class176.field3105 + -1);
        } else {
            class8.field83 = class174.field3068;
            class92.field1769 = class188.field3274;
            class90.field1743 = 2;
        }
        ++field285;
    }

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "(I)V")
    public static void method93(int arg0) {
        field292 = null;
        if (arg0 == -1) {
            field288 = null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Llh;II)V")
    public final void method11(class249 arg0, int arg1, int arg2) {
        ++field283;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (~arg1 != -6) {
                                if (arg1 == 6) {
                                    this.field290 = arg0.method1677(-6677);
                                }
                            } else {
                                this.field294 = arg0.method1677(-6677);
                            }
                        } else {
                            this.field293 = arg0.method1677(arg2 ^ 6676);
                        }
                    } else {
                        this.field296 = arg0.method1677(-6677);
                    }
                } else {
                    this.field291 = arg0.method1674(1355769544);
                }
            } else {
                this.field287 = arg0.method1677(-6677);
            }
        } else {
            this.field294 = this.field290 = arg0.method1677(-6677);
        }
        if (arg2 != -1) {
            method96(127, -1, 114);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)V")
    public final void method12(byte arg0) {
        this.field299 = class188.method1244((byte) 14, this.field287);
        ++field286;
        if (arg0 < -22) {
            this.method97(-1632225748);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIIIIIIIII)V")
    public static final void method94(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field282;
        int var11 = -arg6 + arg1;
        int var12 = -arg2 + arg10;
        boolean var13;
        if (class31.field459 > 0 && ~(class31.field459 % 10) > -6) {
            var13 = true;
        } else {
            var13 = false;
        }
        int var14 = 983040 / arg8;
        int var15 = 983040 / arg0;
        for (int var16 = -var14; var11 - -var14 > var16; ++var16) {
            int var19 = arg8 * var16 + arg3 >> 16;
            int var20 = arg3 - -((var16 + 1) * arg8) >> 16;
            int var21 = -var19 + var20;
            if (~var21 < -1) {
                int var22 = arg6 + var16 >> 6;
                int var23 = arg5 + var19;
                int var10000 = arg5 + var20;
                if (~var22 <= -1 && ~var22 >= ~(class154.field2752.length + -1)) {
                    int[][] var25 = class154.field2752[var22];
                    for (int var26 = -var15; ~(var12 + var15) < ~var26; ++var26) {
                        int var27 = arg7 - -((var26 + 1) * arg0) >> 16;
                        int var28 = arg0 * var26 + arg7 >> 16;
                        int var29 = var27 - var28;
                        if (~var29 < -1) {
                            var10000 = arg9 + var27;
                            int var31 = arg9 + var28;
                            int var32 = arg2 + var26 >> 6;
                            if (var32 >= 0 && var32 <= var25.length + -1 && var25[var32] != null) {
                                int var33 = ((arg2 + var26 & 63) << 6) + (arg6 + var16 & 63);
                                int var34 = var25[var32][var33];
                                if (var34 != 0) {
                                    class231 var35 = class52.method359(115, var34 + -1);
                                    if (var13 && class2.field30 == var35.field4013) {
                                        class132 var36 = new class132();
                                        var36.field2465 = var31;
                                        var36.field2468 = var35.field4013;
                                        var36.field2459 = var23;
                                        class172.field3037.method866(var36, true);
                                    }
                                    class12.field144[var35.field4013].method980(var23 + -7, var31 + -7);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var17 = -124 / ((arg4 - -31) / 58);
        for (class132 var18 = (class132) class172.field3037.method873((byte) 76); var18 != null; var18 = (class132) class172.field3037.method870((byte) -119)) {
            class12.field144[var18.field2468].method980(var18.field2459 + -7, var18.field2465 - 7);
            class235.method1553(var18.field2459, var18.field2465, 15, 16776960, 128);
            class235.method1553(var18.field2459, var18.field2465, 7, 16777215, 256);
        }
        class172.field3037.method864(105);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIIIIB)V")
    public static final void method95(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        ++field281;
        class90.field1741 = 0;
        for (int var7 = -1; ~(client.field1650 + class160.field2869) < ~var7; ++var7) {
            class107 var23;
            if (var7 == -1) {
                var23 = class207.field3595;
            } else if (var7 >= client.field1650) {
                var23 = class178.field3112[class49.field877[-client.field1650 + var7]];
            } else {
                var23 = class59.field988[class192.field3335[var7]];
            }
            if (var23 != null && var23.method204(109)) {
                if (var23 instanceof class37) {
                    class206 var24 = ((class37) var23).field548;
                    if (var24.field3541 != null) {
                        var24 = var24.method1339(-94);
                    }
                    if (var24 == null) {
                        continue;
                    }
                }
                if (var7 >= client.field1650) {
                    class206 var25 = ((class37) var23).field548;
                    if (var25.field3541 != null) {
                        var25 = var25.method1339(-94);
                    }
                    if (~var25.field3549 <= -1 && ~var25.field3549 > ~class158.field2853.length) {
                        class32.method187(93, arg5, arg3, arg0 >> 1, var23, arg1 >> 1, var23.method735((byte) 109) - -15);
                        if (~class131.field2443 < 0) {
                            class158.field2853[var25.field3549].method980(arg2 - (-class131.field2443 - -12), class243.field4243 + arg4 - 30);
                        }
                    }
                    class76[] var26 = class194.field3354;
                    for (int var27 = 0; ~var26.length < ~var27; ++var27) {
                        class76 var28 = var26[var27];
                        if (var28 != null && var28.field1502 == 1 && ~class49.field877[-client.field1650 + var7] == ~var28.field1506 && class75.field1501 % 20 < 10) {
                            class32.method187(54, arg5, arg3, arg0 >> 1, var23, arg1 >> 1, var23.method735((byte) -122) - -15);
                            if (class131.field2443 > -1) {
                                class2.field32[var28.field1512].method980(class131.field2443 + arg2 - 12, arg4 - (-class243.field4243 - -28));
                            }
                        }
                    }
                } else {
                    class45 var29 = (class45) var23;
                    int var30 = 30;
                    if (var29.field836 != -1 || var29.field823 != -1) {
                        class32.method187(110, arg5, arg3, arg0 >> 1, var23, arg1 >> 1, 15 + var23.method735((byte) -114));
                        if (class131.field2443 > -1) {
                            if (var29.field836 != -1) {
                                class78.field1545[var29.field836].method980(class131.field2443 + -12 + arg2, -var30 + class243.field4243 + arg4);
                                var30 += 25;
                            }
                            if (var29.field823 != -1) {
                                class158.field2853[var29.field823].method980(arg2 + -12 - -class131.field2443, class243.field4243 + arg4 + -var30);
                                var30 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        int var31 = 0;
                        class76[] var32 = class194.field3354;
                        while (var32.length > var31) {
                            class76 var33 = var32[var31];
                            if (var33 != null && var33.field1502 == 10 && ~class192.field3335[var7] == ~var33.field1506) {
                                class32.method187(55, arg5, arg3, arg0 >> 1, var23, arg1 >> 1, var23.method735((byte) 87) + 15);
                                if (~class131.field2443 < 0) {
                                    class2.field32[var33.field1512].method980(arg2 - (-class131.field2443 + 12), -var30 + class243.field4243 + arg4);
                                }
                            }
                            ++var31;
                        }
                    }
                }
                if (var23.field2092 != null && (var7 >= client.field1650 || ~class165.field2981 == -1 || class165.field2981 == 3 || ~class165.field2981 == -2 && class136.method939(-86, ((class45) var23).field815))) {
                    class32.method187(33, arg5, arg3, arg0 >> 1, var23, arg1 >> 1, var23.method735((byte) -111));
                    if (~class131.field2443 < 0 && class90.field1741 < class119.field2260) {
                        class119.field2251[class90.field1741] = class59.field1016.method232(var23.field2092) / 2;
                        class119.field2259[class90.field1741] = class59.field1016.field579;
                        class119.field2252[class90.field1741] = class131.field2443;
                        class119.field2264[class90.field1741] = class243.field4243;
                        class119.field2254[class90.field1741] = var23.field2051;
                        class119.field2256[class90.field1741] = var23.field2055;
                        class119.field2262[class90.field1741] = var23.field2085;
                        class119.field2258[class90.field1741] = var23.field2092;
                        ++class90.field1741;
                    }
                }
                if (~class75.field1501 > ~var23.field2050) {
                    class256 var34 = class82.field1597[0];
                    class256 var35 = class82.field1597[1];
                    if (var23 instanceof class37) {
                        class37 var36 = (class37) var23;
                        class256[] var37 = (class256[]) class158.field2852.method1617(14366, (long) var36.field548.field3547);
                        if (var37 == null) {
                            var37 = class100.method688(0, var36.field548.field3547, 0, class242.field4238);
                            if (var37 != null) {
                                class158.field2852.method1615(var37, 100, (long) var36.field548.field3547);
                            }
                        }
                        if (var37 != null && var37.length == 2) {
                            var35 = var37[1];
                            var34 = var37[0];
                        }
                    }
                    class32.method187(57, arg5, arg3, arg0 >> 1, var23, arg1 >> 1, var23.method735((byte) -120) - (-10 - var34.field4496));
                    if (class131.field2443 > -1) {
                        int var38 = class131.field2443 + arg2 + -(var34.field4494 >> 1);
                        int var39 = class243.field4243 + arg4 + -3;
                        var34.method980(var38, var39);
                        int var40 = var23.field2063 * var34.field4494 / 255;
                        int var41 = var34.field4496;
                        class235.method1545(var38, var39, var38 - -var40, var39 + var41);
                        var35.method980(var38, var39);
                        class235.method1546(arg2, arg4, arg1 + arg2, arg0 + arg4);
                    }
                }
                for (int var42 = 0; var42 < 4; ++var42) {
                    if (~class75.field1501 > ~var23.field2096[var42]) {
                        class32.method187(80, arg5, arg3, arg0 >> 1, var23, arg1 >> 1, var23.method735((byte) -121) / 2);
                        if (~class131.field2443 < 0) {
                            if (var42 == 1) {
                                class243.field4243 -= 20;
                            }
                            if (var42 == 2) {
                                class131.field2443 -= 15;
                                class243.field4243 -= 10;
                            }
                            if (var42 == 3) {
                                class243.field4243 -= 10;
                                class131.field2443 += 15;
                            }
                            class261.field4600[var23.field2087[var42]].method980(class131.field2443 + arg2 + -12, arg4 + -12 + class243.field4243);
                            class176.field3103.method235(class144.method989(var23.field2070[var42], 0), class131.field2443 + -1 + arg2, class243.field4243 + 3 + arg4, 16777215, 0);
                        }
                    }
                }
            }
        }
        int var8 = 0;
        if (arg6 >= -28) {
            field288 = null;
        }
        while (var8 < class90.field1741) {
            int var9 = class119.field2264[var8];
            int var10 = class119.field2252[var8];
            int var11 = class119.field2251[var8];
            int var12 = class119.field2259[var8];
            boolean var13 = true;
            while (var13) {
                var13 = false;
                for (int var22 = 0; ~var22 > ~var8; ++var22) {
                    if (~(var9 + 2) < ~(class119.field2264[var22] + -class119.field2259[var22]) && ~(class119.field2264[var22] + 2) < ~(var9 - var12) && ~(-var11 + var10) > ~(class119.field2252[var22] - -class119.field2251[var22]) && class119.field2252[var22] + -class119.field2251[var22] < var10 + var11 && class119.field2264[var22] + -class119.field2259[var22] < var9) {
                        var13 = true;
                        var9 = class119.field2264[var22] + -class119.field2259[var22];
                    }
                }
            }
            class131.field2443 = class119.field2252[var8];
            class243.field4243 = class119.field2264[var8] = var9;
            class66 var14 = class119.field2258[var8];
            if (~class199.field3441 == -1) {
                int var15 = 16776960;
                if (class119.field2254[var8] < 6) {
                    var15 = class140.field2592[class119.field2254[var8]];
                }
                if (class119.field2254[var8] == 6) {
                    var15 = class214.field3683 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (~class119.field2254[var8] == -8) {
                    var15 = class214.field3683 % 20 >= 10 ? 65535 : 255;
                }
                if (class119.field2254[var8] == 8) {
                    var15 = class214.field3683 % 20 < 10 ? 45056 : 8454016;
                }
                if (~class119.field2254[var8] == -10) {
                    int var16 = -class119.field2262[var8] + 150;
                    if (~var16 > -51) {
                        var15 = var16 * 1280 + 16711680;
                    } else if (var16 < 100) {
                        var15 = 16384000 - var16 * 327680 + 16776960;
                    } else if (~var16 > -151) {
                        var15 = 65280 - -((var16 + -100) * 5);
                    }
                }
                if (class119.field2254[var8] == 10) {
                    int var17 = 150 - class119.field2262[var8];
                    if (~var17 <= -51) {
                        if (var17 >= 100) {
                            if (var17 < 150) {
                                var15 = (var17 - 100) * 327680 + (255 - var17 * 5 - -500);
                            }
                        } else {
                            var15 = 16384000 - var17 * 327680 + 16711935;
                        }
                    } else {
                        var15 = var17 * 5 + 16711680;
                    }
                }
                if (~class119.field2254[var8] == -12) {
                    int var18 = -class119.field2262[var8] + 150;
                    if (var18 >= 50) {
                        if (~var18 <= -101) {
                            if (var18 < 150) {
                                var15 = -(var18 * 327680) - -49545215;
                            }
                        } else {
                            var15 = var18 * 327685 + -16318970;
                        }
                    } else {
                        var15 = 16777215 - var18 * 327685;
                    }
                }
                if (class119.field2256[var8] == 0) {
                    class59.field1016.method235(var14, class131.field2443 + arg2, class243.field4243 + arg4, var15, 0);
                }
                if (~class119.field2256[var8] == -2) {
                    class59.field1016.method219(var14, class131.field2443 + arg2, class243.field4243 + arg4, var15, 0, class214.field3683);
                }
                if (class119.field2256[var8] == 2) {
                    class59.field1016.method218(var14, class131.field2443 + arg2, class243.field4243 + arg4, var15, 0, class214.field3683);
                }
                if (~class119.field2256[var8] == -4) {
                    class59.field1016.method213(var14, class131.field2443 + arg2, class243.field4243 + arg4, var15, 0, class214.field3683, -class119.field2262[var8] + 150);
                }
                if (class119.field2256[var8] == 4) {
                    int var19 = (150 - class119.field2262[var8]) * (class59.field1016.method232(var14) - -100) / 150;
                    class235.method1545(class131.field2443 - 50 + arg2, arg4, arg2 - -class131.field2443 + 50, arg0 + arg4);
                    class59.field1016.method233(var14, -var19 + class131.field2443 + arg2 - -50, arg4 - -class243.field4243, var15, 0);
                    class235.method1546(arg2, arg4, arg1 + arg2, arg0 + arg4);
                }
                if (~class119.field2256[var8] == -6) {
                    int var20 = 150 - class119.field2262[var8];
                    class235.method1545(arg2, -class59.field1016.field579 + -1 + arg4 + class243.field4243, arg2 - -arg1, arg4 - -class243.field4243 + 5);
                    int var21 = 0;
                    if (var20 >= 25) {
                        if (~var20 < -126) {
                            var21 = var20 + -125;
                        }
                    } else {
                        var21 = var20 + -25;
                    }
                    class59.field1016.method235(var14, arg2 - -class131.field2443, class243.field4243 + arg4 + var21, var15, 0);
                    class235.method1546(arg2, arg4, arg1 + arg2, arg0 + arg4);
                }
            } else {
                class59.field1016.method235(var14, class131.field2443 + arg2, class243.field4243 + arg4, 16776960, 0);
            }
            ++var8;
        }
    }

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "(III)V")
    public static final void method96(int arg0, int arg1, int arg2) {
        ++class73.field1438;
        if (arg2 != 327685) {
            field288 = null;
        }
        ++field298;
        class28.field412.method578(119, 63);
        class28.field412.method1685((byte) 19, arg0);
        class28.field412.method1686((byte) 127, arg1);
    }

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "(I)V")
    private final void method97(int arg0) {
        if (arg0 != -1632225748) {
            this.field299 = null;
        }
        Random var2 = new Random((long) this.field287);
        this.field289 = new short[512];
        if (~this.field291 < -1) {
            for (int var3 = 0; var3 < 512; ++var3) {
                this.field289[var3] = (short) class256.method1717(this.field291, (byte) 70, var2);
            }
        }
        ++field280;
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(II)V")
    public static final void method98(int arg0, int arg1) {
        if (arg0 >= -99) {
            field288 = null;
        }
        class197 var2 = class135.method933(arg1, 2, (byte) -121);
        ++field295;
        var2.method1288((byte) -87);
    }
}
