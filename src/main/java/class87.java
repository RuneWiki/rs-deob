import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class87 extends class107 {

    @OriginalMember(owner = "client!ue", name = "T", descriptor = "[S")
    private short[] field1593 = new short[257];

    @OriginalMember(owner = "client!ue", name = "jb", descriptor = "I")
    private int field1609 = 0;

    @OriginalMember(owner = "client!ue", name = "P", descriptor = "Lpj;")
    public static class237 field1589 = class33.method353("document)3cookie=(R", 26);

    @OriginalMember(owner = "client!ue", name = "ib", descriptor = "[S")
    public static short[] field1608 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!ue", name = "ab", descriptor = "Lre;")
    public static class213 field1600 = new class213();

    @OriginalMember(owner = "client!ue", name = "Q", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!ue", name = "R", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!ue", name = "S", descriptor = "I")
    public static int field1592;

    @OriginalMember(owner = "client!ue", name = "U", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!ue", name = "V", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!ue", name = "W", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!ue", name = "X", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!ue", name = "bb", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!ue", name = "cb", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!ue", name = "db", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!ue", name = "eb", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!ue", name = "fb", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!ue", name = "hb", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!ue", name = "kb", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!ue", name = "lb", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!ue", name = "mb", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!ue", name = "Z", descriptor = "[I")
    private int[] field1599;

    @OriginalMember(owner = "client!ue", name = "gb", descriptor = "[I")
    private int[] field1606;

    @OriginalMember(owner = "client!ue", name = "Y", descriptor = "[[I")
    private int[][] field1598;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(BI)[I")
    public final int[] method123(byte arg0, int arg1) {
        ++field1605;
        int[] var3 = super.field1921.method1388(arg1, (byte) -26);
        if (super.field1921.field3539) {
            int[] var4 = this.method797(0, arg1, (byte) -23);
            for (int var5 = 0; ~class106.field1862 < ~var5; ++var5) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (~var6 < -257) {
                    var6 = 256;
                }
                var3[var5] = this.field1593[var6];
            }
        }
        if (arg0 != -17) {
            this.field1609 = 89;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lie;II)V")
    public final void method122(class32 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            this.field1609 = arg0.method316((byte) -97);
            this.field1598 = new int[arg0.method316((byte) 11)][2];
            for (int var4 = 0; ~var4 > ~this.field1598.length; ++var4) {
                this.field1598[var4][0] = arg0.method339(arg2 + -16744703);
                this.field1598[var4][1] = arg0.method339(-16777216);
            }
        }
        ++field1602;
        if (arg2 != -32513) {
            field1608 = null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "(I)V")
    private final void method662(int arg0) {
        ++field1594;
        int[] var2 = this.field1598[0];
        int[] var3 = this.field1598[1];
        int[] var4 = this.field1598[this.field1598.length + -2];
        int[] var5 = this.field1598[this.field1598.length + -1];
        this.field1606 = new int[] { var4[0] + var4[0] - var5[arg0], var4[1] + var4[1] - var5[1] };
        this.field1599 = new int[] { var2[0] + var2[0] + -var3[0], var2[1] + -var3[1] + var2[1] };
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V")
    public class87() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZLie;)V")
    public static final void method663(boolean arg0, class32 arg1) {
        ++field1604;
        int var2 = class196.field3420 >> 2 << 10;
        int var3 = class23.field424 >> 1;
        byte[][] var4 = new byte[class148.field2629][class115.field2017];
        while (arg1.field644.length > arg1.field647) {
            int var33 = 0;
            int var34 = 0;
            boolean var35 = false;
            if (arg1.method316((byte) 119) == 1) {
                var35 = true;
                var33 = arg1.method316((byte) 109);
                var34 = arg1.method316((byte) -64);
            }
            int var36 = arg1.method316((byte) 105);
            int var37 = arg1.method316((byte) 119);
            int var38 = var36 * 64 - class202.field3466;
            int var39 = class115.field2017 - (var37 * 64 + 1 - class17.field296);
            if (var38 >= 0 && var39 - 63 >= 0 && ~(var38 - -63) > ~class148.field2629 && class115.field2017 > var39) {
                for (int var40 = 0; ~var40 > -65; ++var40) {
                    byte[] var41 = var4[var38 + var40];
                    for (int var42 = 0; var42 < 64; ++var42) {
                        if (!var35 || ~var40 <= ~(var33 * 8) && var33 * 8 + 8 > var40 && var42 >= var34 * 8 && ~(var34 * 8 - -8) < ~var42) {
                            var41[-var42 + var39] = arg1.method325(120);
                        }
                    }
                }
            } else if (!var35) {
                arg1.field647 += 4096;
            } else {
                arg1.field647 += 64;
            }
        }
        int var5 = class115.field2017;
        int var6 = class148.field2629;
        int[] var7 = new int[var5];
        int[] var8 = new int[var5];
        int[] var9 = new int[var5];
        int[] var10 = new int[var5];
        int[] var11 = new int[var5];
        if (!arg0) {
            for (int var12 = -5; var12 < var6; ++var12) {
                for (int var13 = 0; var5 > var13; ++var13) {
                    int var27 = var12 + 5;
                    int var10002;
                    if (~var27 > ~var6) {
                        int var28 = 255 & var4[var27][var13];
                        if (var28 > 0) {
                            class101 var29 = class120.method867((byte) -102, var28 + -1);
                            var7[var13] += var29.field1797;
                            var8[var13] += var29.field1796;
                            var10[var13] += var29.field1794;
                            var9[var13] += var29.field1791;
                            var10002 = var11[var13]++;
                        }
                    }
                    int var30 = var12 - 5;
                    if (~var30 <= -1) {
                        int var31 = 255 & var4[var30][var13];
                        if (~var31 < -1) {
                            class101 var32 = class120.method867((byte) -102, var31 + -1);
                            var7[var13] -= var32.field1797;
                            var8[var13] -= var32.field1796;
                            var10[var13] -= var32.field1794;
                            var9[var13] -= var32.field1791;
                            var10002 = var11[var13]--;
                        }
                    }
                }
                if (~var12 <= -1) {
                    int[][] var14 = class144.field2603[var12 >> 6];
                    int var15 = 0;
                    int var16 = 0;
                    int var17 = 0;
                    int var18 = 0;
                    int var19 = 0;
                    for (int var20 = -5; var5 > var20; ++var20) {
                        int var21 = var20 + 5;
                        if (var21 < var5) {
                            var16 += var8[var21];
                            var17 += var11[var21];
                            var18 += var10[var21];
                            var19 += var9[var21];
                            var15 += var7[var21];
                        }
                        int var22 = var20 + -5;
                        if (var22 >= 0) {
                            var16 -= var8[var22];
                            var17 -= var11[var22];
                            var15 -= var7[var22];
                            var19 -= var9[var22];
                            var18 -= var10[var22];
                        }
                        if (var20 >= 0 && ~var17 < -1) {
                            int[] var23 = var14[var20 >> 6];
                            int var24 = ~var19 == -1 ? 0 : class183.method1255(var16 / var17, false, var15 * 256 / var19, var18 / var17);
                            if (var4[var12][var20] != 0) {
                                int var25 = (var24 & 127) + var3;
                                if (var23 == null) {
                                    var23 = var14[var20 >> 6] = new int[4096];
                                }
                                if (var25 >= 0) {
                                    if (~var25 < -128) {
                                        var25 = 127;
                                    }
                                } else {
                                    var25 = 0;
                                }
                                int var26 = (896 & var24) + ((64512 & var2 + var24) - -var25);
                                var23[class272.method1817(63, var12) + class272.method1817(4032, var20 << 6)] = class150.field2677[class20.method203(true, var26, 96)];
                            } else if (var23 != null) {
                                var23[class272.method1817(var12, 63) + class272.method1817(4032, var20 << 6)] = 0;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "(I)V")
    public static final void method664(int arg0) {
        if (~class99.field1772 < -1) {
            --class99.field1772;
        }
        if (class8.field120 > 1) {
            --class8.field120;
            class143.field2594 = class3.field31;
        }
        if (arg0 > 60) {
            ++field1612;
            if (class213.field3641) {
                class213.field3641 = false;
                class182.method1250((byte) -102);
            } else {
                for (int var1 = 0; ~var1 > -101 && class139.method963(230); ++var1) {
                }
                if (class264.field4507 == 30) {
                    class117.method850(9, 0, class223.field3830);
                    Object var2 = class70.field1385.field4419;
                    synchronized (class70.field1385.field4419) {
                        if (!class126.field2198) {
                            class70.field1385.field4425 = 0;
                        } else if (~class123.field2173 != -1 || class70.field1385.field4425 >= 40) {
                            ++class256.field4401;
                            class223.field3830.method368(-111, 119);
                            class223.field3830.method293((byte) 125, 0);
                            int var3 = class223.field3830.field647;
                            int var4 = 0;
                            for (int var5 = 0; var5 < class70.field1385.field4425 && -var3 + class223.field3830.field647 < 240; ++var5) {
                                ++var4;
                                int var6 = class70.field1385.field4426[var5];
                                if (var6 < 0) {
                                    var6 = 0;
                                } else if (var6 > 65534) {
                                    var6 = 65534;
                                }
                                int var7 = class70.field1385.field4427[var5];
                                if (~var7 <= -1) {
                                    if (~var7 < -65535) {
                                        var7 = 65534;
                                    }
                                } else {
                                    var7 = 0;
                                }
                                boolean var8 = false;
                                if (class70.field1385.field4426[var5] == -1 && class70.field1385.field4427[var5] == -1) {
                                    var8 = true;
                                    var7 = -1;
                                    var6 = -1;
                                }
                                if (class153.field2721 == var7 && ~class130.field2288 == ~var6) {
                                    if (~class58.field1184 > -2048) {
                                        ++class58.field1184;
                                    }
                                } else {
                                    int var9 = var6 - class130.field2288;
                                    int var10 = -class153.field2721 + var7;
                                    class153.field2721 = var7;
                                    class130.field2288 = var6;
                                    if (class58.field1184 < 8 && var10 >= -32 && var10 <= 31 && var9 >= -32 && var9 <= 31) {
                                        var10 += 32;
                                        var9 += 32;
                                        class223.field3830.method350((byte) 19, (var10 << 6) + (class58.field1184 << 12) + var9);
                                        class58.field1184 = 0;
                                    } else if (class58.field1184 < 32 && ~var10 <= 127 && ~var10 >= -128 && var9 >= -128 && var9 <= 127) {
                                        var10 += 128;
                                        class223.field3830.method293((byte) 125, 128 - -class58.field1184);
                                        var9 += 128;
                                        class223.field3830.method350((byte) 19, (var10 << 8) + var9);
                                        class58.field1184 = 0;
                                    } else if (~class58.field1184 > -33) {
                                        class223.field3830.method293((byte) 125, class58.field1184 + 192);
                                        if (!var8) {
                                            class223.field3830.method290((byte) -20, var7 | var6 << 16);
                                        } else {
                                            class223.field3830.method290((byte) -20, Integer.MIN_VALUE);
                                        }
                                        class58.field1184 = 0;
                                    } else {
                                        class223.field3830.method350((byte) 19, 57344 - -class58.field1184);
                                        if (!var8) {
                                            class223.field3830.method290((byte) -20, var6 << 16 | var7);
                                        } else {
                                            class223.field3830.method290((byte) -20, Integer.MIN_VALUE);
                                        }
                                        class58.field1184 = 0;
                                    }
                                }
                            }
                            class223.field3830.method338((byte) -127, -var3 + class223.field3830.field647);
                            if (~class70.field1385.field4425 >= ~var4) {
                                class70.field1385.field4425 = 0;
                            } else {
                                class70.field1385.field4425 -= var4;
                                for (int var11 = 0; ~class70.field1385.field4425 < ~var11; ++var11) {
                                    class70.field1385.field4427[var11] = class70.field1385.field4427[var4 + var11];
                                    class70.field1385.field4426[var11] = class70.field1385.field4426[var4 + var11];
                                }
                            }
                        }
                    }
                    if (class123.field2173 != 0) {
                        ++class142.field2584;
                        int var12 = class227.field3891;
                        int var13 = class58.field1196;
                        if (~var13 > -1) {
                            var13 = 0;
                        } else if (~var13 < -65536) {
                            var13 = 65535;
                        }
                        byte var14 = 0;
                        long var15 = (-class200.field3460 + class22.field410) / 50L;
                        if (var12 >= 0) {
                            if (~var12 < -65536) {
                                var12 = 65535;
                            }
                        } else {
                            var12 = 0;
                        }
                        class200.field3460 = class22.field410;
                        if (class123.field2173 == 2) {
                            var14 = 1;
                        }
                        class223.field3830.method368(-107, 59);
                        if (var15 > 32767L) {
                            var15 = 32767L;
                        }
                        class223.field3830.method331(var13 << 16 | var12, (byte) 122);
                        int var17 = (int) var15;
                        class223.field3830.method348(var17 | var14 << 15, 4);
                    }
                    if (~class104.field1844 < -1) {
                        --class104.field1844;
                    }
                    if (class119.field2083[96] || class119.field2083[97] || class119.field2083[98] || class119.field2083[99]) {
                        class205.field3506 = true;
                    }
                    if (class205.field3506 && ~class104.field1844 >= -1) {
                        class205.field3506 = false;
                        class104.field1844 = 20;
                        class223.field3830.method368(125, 64);
                        class223.field3830.method350((byte) 19, class257.field4417);
                        ++class89.field1635;
                        class223.field3830.method348(class12.field210, 4);
                    }
                    if (class188.field3277 && !class255.field4377) {
                        class255.field4377 = true;
                        ++class241.field4243;
                        class223.field3830.method368(43, 45);
                        class223.field3830.method293((byte) 125, 1);
                    }
                    if (!class188.field3277 && class255.field4377) {
                        ++class241.field4243;
                        class255.field4377 = false;
                        class223.field3830.method368(92, 45);
                        class223.field3830.method293((byte) 125, 0);
                    }
                    if (!class117.field2047) {
                        class223.field3830.method368(-128, 200);
                        ++class46.field989;
                        class223.field3830.method290((byte) -20, class262.method1758(-58));
                        class117.field2047 = true;
                    }
                    class94.method702(-2937);
                    if (class264.field4507 == 30) {
                        class238.method1630(1);
                        class29.method276(128);
                        ++class238.field4157;
                        if (class238.field4157 > 750) {
                            class182.method1250((byte) -102);
                        } else {
                            class70.method570(-43);
                            class249.method1705((byte) -61);
                            class177.method1228(-1);
                            if (class59.field1210 != null) {
                                class52.method463(26337);
                            }
                            for (int var18 = class156.method1074((byte) 125, true); var18 != -1; var18 = class156.method1074((byte) 94, false)) {
                                class76.method592((byte) -87, var18);
                                class179.field3150[class272.method1817(31, class207.field3523++)] = var18;
                            }
                            for (class270 var19 = class90.method685(0); var19 != null; var19 = class90.method685(0)) {
                                int var20 = var19.method1794(-26158);
                                int var21 = var19.method1796(13);
                                if (~var20 != -2) {
                                    if (var20 == 2) {
                                        class188.field3287[var21] = var19.field4622;
                                        class160.field2872[class272.method1817(31, class207.field3527++)] = var21;
                                    } else if (var20 == 3) {
                                        class141 var22 = class70.method572(20043, var21);
                                        if (!var19.field4622.method1585((byte) 53, var22.field2477)) {
                                            var22.field2477 = var19.field4622;
                                            class128.method911(var22, -17149);
                                        }
                                    } else if (var20 == 4) {
                                        class141 var23 = class70.method572(20043, var21);
                                        int var24 = var19.field4619;
                                        int var25 = var19.field4628;
                                        if (~var23.field2544 != ~var24 || ~var23.field2456 != ~var25) {
                                            var23.field2456 = var25;
                                            var23.field2544 = var24;
                                            class128.method911(var23, -17149);
                                        }
                                    } else if (~var20 == -6) {
                                        class141 var26 = class70.method572(20043, var21);
                                        if (var19.field4619 != var26.field2571 || ~var19.field4619 == 0) {
                                            var26.field2524 = 0;
                                            var26.field2570 = 0;
                                            var26.field2571 = var19.field4619;
                                            class128.method911(var26, -17149);
                                        }
                                    } else if (~var20 != -7) {
                                        if (~var20 != -8) {
                                            if (~var20 == -9) {
                                                class141 var27 = class70.method572(20043, var21);
                                                if (~var19.field4619 != ~var27.field2447 || ~var19.field4628 != ~var27.field2531 || var19.field4617 != var27.field2521) {
                                                    var27.field2447 = var19.field4619;
                                                    var27.field2521 = var19.field4617;
                                                    var27.field2531 = var19.field4628;
                                                    if (var27.field2486 != -1) {
                                                        if (~var27.field2523 < -1) {
                                                            var27.field2521 = var27.field2521 * 32 / var27.field2523;
                                                        } else if (var27.field2440 > 0) {
                                                            var27.field2521 = var27.field2521 * 32 / var27.field2440;
                                                        }
                                                    }
                                                    class128.method911(var27, -17149);
                                                }
                                            } else if (var20 == 9) {
                                                class141 var28 = class70.method572(20043, var21);
                                                if (~var19.field4619 != ~var28.field2486 || var19.field4628 != var28.field2522) {
                                                    var28.field2486 = var19.field4619;
                                                    var28.field2522 = var19.field4628;
                                                    class128.method911(var28, -17149);
                                                }
                                            } else if (var20 != 10) {
                                                if (var20 != 11) {
                                                    if (~var20 == -13) {
                                                        class141 var29 = class70.method572(20043, var21);
                                                        int var30 = var19.field4619;
                                                        if (var29 != null && var29.field2529 == 0) {
                                                            if (~(-var29.field2490 + var29.field2500) > ~var30) {
                                                                var30 = -var29.field2490 + var29.field2500;
                                                            }
                                                            if (var30 < 0) {
                                                                var30 = 0;
                                                            }
                                                            if (var29.field2413 != var30) {
                                                                var29.field2413 = var30;
                                                                class128.method911(var29, -17149);
                                                            }
                                                        }
                                                    } else if (~var20 == -14) {
                                                        class141 var31 = class70.method572(20043, var21);
                                                        var31.field2465 = var19.field4619;
                                                    }
                                                } else {
                                                    class141 var32 = class70.method572(20043, var21);
                                                    var32.field2438 = var32.field2425 = var19.field4628;
                                                    var32.field2569 = 0;
                                                    var32.field2476 = 0;
                                                    var32.field2416 = var32.field2510 = var19.field4619;
                                                    class128.method911(var32, -17149);
                                                }
                                            } else {
                                                class141 var33 = class70.method572(20043, var21);
                                                if (var19.field4619 != var33.field2520 || var19.field4628 != var33.field2446 || var19.field4617 != var33.field2566) {
                                                    var33.field2520 = var19.field4619;
                                                    var33.field2446 = var19.field4628;
                                                    var33.field2566 = var19.field4617;
                                                    class128.method911(var33, -17149);
                                                }
                                            }
                                        } else {
                                            class141 var34 = class70.method572(20043, var21);
                                            boolean var35 = ~var19.field4619 == -2;
                                            if (var35 == !var34.field2460) {
                                                var34.field2460 = var35;
                                                class128.method911(var34, -17149);
                                            }
                                        }
                                    } else {
                                        int var36 = var19.field4619;
                                        int var37 = (var36 & 32681) >> 10;
                                        int var38 = 31 & var36 >> 5;
                                        int var39 = 31 & var36;
                                        int var40 = (var37 << 19) + (var38 << 11) - -(var39 << 3);
                                        class141 var41 = class70.method572(20043, var21);
                                        if (~var41.field2458 != ~var40) {
                                            var41.field2458 = var40;
                                            class128.method911(var41, -17149);
                                        }
                                    }
                                } else {
                                    class207.field3517[var21] = var19.field4619;
                                    class111.field1948[class272.method1817(class209.field3563++, 31)] = var21;
                                }
                            }
                            if (class36.field788 != 0) {
                                class135.field2351 += 20;
                                if (class135.field2351 >= 400) {
                                    class36.field788 = 0;
                                }
                            }
                            ++class59.field1204;
                            if (class263.field4492 != null) {
                                ++class14.field235;
                                if (~class14.field235 <= -16) {
                                    class128.method911(class263.field4492, -17149);
                                    class263.field4492 = null;
                                }
                            }
                            if (class101.field1803 != null) {
                                class128.method911(class101.field1803, -17149);
                                ++class163.field2906;
                                if (class49.field1064 - -5 < class28.field515 || ~class28.field515 > ~(class49.field1064 - 5) || class110.field1935 + 5 < class174.field3059 || class110.field1935 - 5 > class174.field3059) {
                                    class184.field3227 = true;
                                }
                                if (class170.field2986 == 0) {
                                    if (class184.field3227 && ~class163.field2906 <= -6) {
                                        if (class149.field2645 == class101.field1803 && class69.field1362 != class108.field1926) {
                                            ++class256.field4403;
                                            class141 var42 = class101.field1803;
                                            byte var43 = 0;
                                            if (class235.field4077 == 1 && ~var42.field2492 == -207) {
                                                var43 = 1;
                                            }
                                            if (~var42.field2548[class108.field1926] >= -1) {
                                                var43 = 0;
                                            }
                                            if (class227.method1510(client.method1042(var42), -1496161763)) {
                                                int var44 = class69.field1362;
                                                int var45 = class108.field1926;
                                                var42.field2548[var45] = var42.field2548[var44];
                                                var42.field2540[var45] = var42.field2540[var44];
                                                var42.field2548[var44] = -1;
                                                var42.field2540[var44] = 0;
                                            } else if (var43 != 1) {
                                                var42.method975(-79, class108.field1926, class69.field1362);
                                            } else {
                                                int var46 = class69.field1362;
                                                int var47 = class108.field1926;
                                                while (~var46 != ~var47) {
                                                    if (~var46 >= ~var47) {
                                                        if (~var46 > ~var47) {
                                                            var42.method975(23, var46 + 1, var46);
                                                            ++var46;
                                                        }
                                                    } else {
                                                        var42.method975(105, var46 - 1, var46);
                                                        --var46;
                                                    }
                                                }
                                            }
                                            class223.field3830.method368(45, 203);
                                            class223.field3830.method344(class108.field1926, -904679672);
                                            class223.field3830.method350((byte) 19, class69.field1362);
                                            class223.field3830.method290((byte) -20, class101.field1803.field2530);
                                            class223.field3830.method311(var43, (byte) -96);
                                        }
                                    } else if ((~class7.field93 == -2 || class77.method593(class271.field4664 + -1, (byte) -62)) && class271.field4664 > 2) {
                                        class158.method1119((byte) 91);
                                    } else if (class271.field4664 > 0) {
                                        class235.method1568(-116);
                                    }
                                    class101.field1803 = null;
                                    class123.field2173 = 0;
                                    class14.field235 = 10;
                                }
                            }
                            class104.field1830 = null;
                            class124.field2177 = false;
                            class141.field2565 = 0;
                            class141 var48 = class221.field3807;
                            class221.field3807 = null;
                            class181.field3170 = false;
                            class141 var49 = class210.field3582;
                            class210.field3582 = null;
                            while (class206.method1382(118) && class141.field2565 < 128) {
                                class76.field1442[class141.field2565] = class89.field1626;
                                class229.field3912[class141.field2565] = class56.field1150;
                                ++class141.field2565;
                            }
                            class59.field1210 = null;
                            class196.field3418 = null;
                            if (~class84.field1573 != 0) {
                                class121.method871(0, class142.field2585, -17476, class84.field1573, 0, 0, class119.field2087, 0);
                            }
                            ++class3.field31;
                            if (class196.field3418 != null) {
                                class151.method1034((byte) 109, class78.field1475, class41.field935, class196.field3418);
                                class196.field3418 = null;
                            }
                            while (true) {
                                class117 var50;
                                class141 var51;
                                class141 var52;
                                do {
                                    var50 = (class117) class189.field3288.method678(false);
                                    if (var50 == null) {
                                        while (true) {
                                            class117 var53;
                                            class141 var54;
                                            class141 var55;
                                            do {
                                                var53 = (class117) class21.field394.method678(false);
                                                if (var53 == null) {
                                                    while (true) {
                                                        class117 var56;
                                                        class141 var57;
                                                        class141 var58;
                                                        do {
                                                            var56 = (class117) class71.field1389.method678(false);
                                                            if (var56 == null) {
                                                                if (class186.field3265 && class59.field1210 == null) {
                                                                    class186.field3265 = false;
                                                                }
                                                                if (class45.field972 != null) {
                                                                    class105.method785(20618);
                                                                }
                                                                if (~class64.field1283 < -1 && class119.field2083[82] && class119.field2083[81] && ~class79.field1480 != -1) {
                                                                    int var59 = -class79.field1480 + class274.field4798;
                                                                    if (var59 >= 0) {
                                                                        if (~var59 < -4) {
                                                                            var59 = 3;
                                                                        }
                                                                    } else {
                                                                        var59 = 0;
                                                                    }
                                                                    class196.method1349(325, class229.field3911.field3743[0] + class27.field494, var59, class229.field3911.field3715[0] + class235.field4087);
                                                                }
                                                                if (class23.field428 != -1) {
                                                                    int var60 = class23.field428;
                                                                    int var61 = class129.field2260;
                                                                    if (~class64.field1283 < -1 && class119.field2083[82] && class119.field2083[81]) {
                                                                        class196.method1349(325, class27.field494 + var61, class274.field4798, class235.field4087 + var60);
                                                                    } else if (!class91.field1657) {
                                                                        boolean var62 = class210.method1406(0, 0, var61, var60, 0, 0, (byte) -56, class229.field3911.field3743[0], 0, class229.field3911.field3715[0], true, 0);
                                                                        if (var62) {
                                                                            class203.field3487 = class227.field3891;
                                                                            class36.field796 = class58.field1196;
                                                                            class36.field788 = 1;
                                                                            class135.field2351 = 0;
                                                                        }
                                                                    } else {
                                                                        class223.field3830.method368(127, 244);
                                                                        ++class55.field1135;
                                                                        class223.field3830.method341(26994, class187.field3272);
                                                                        class223.field3830.method350((byte) 19, class235.field4087 - -var60);
                                                                        class223.field3830.method344(class27.field494 + var61, -904679672);
                                                                        class223.field3830.method337(false, class144.field2606);
                                                                        class36.field788 = 1;
                                                                        class36.field796 = class58.field1196;
                                                                        class203.field3487 = class227.field3891;
                                                                        class135.field2351 = 0;
                                                                    }
                                                                    class91.field1657 = false;
                                                                    class23.field428 = -1;
                                                                }
                                                                class162.method1142(25);
                                                                if (class210.field3582 != var49) {
                                                                    if (var49 != null) {
                                                                        class128.method911(var49, -17149);
                                                                    }
                                                                    if (class210.field3582 != null) {
                                                                        class128.method911(class210.field3582, -17149);
                                                                    }
                                                                }
                                                                if (class221.field3807 != var48 && ~class156.field2792 == ~class101.field1802) {
                                                                    if (var48 != null) {
                                                                        class128.method911(var48, -17149);
                                                                    }
                                                                    if (class221.field3807 != null) {
                                                                        class128.method911(class221.field3807, -17149);
                                                                    }
                                                                }
                                                                if (class221.field3807 != null) {
                                                                    if (~class156.field2792 > ~class101.field1802) {
                                                                        ++class156.field2792;
                                                                        if (~class156.field2792 == ~class101.field1802) {
                                                                            class128.method911(class221.field3807, -17149);
                                                                        }
                                                                    }
                                                                } else if (class156.field2792 > 0) {
                                                                    --class156.field2792;
                                                                }
                                                                if (class163.field2899 == 1) {
                                                                    class111.method823(-103);
                                                                } else if (class163.field2899 != 2) {
                                                                    class167.method1167((byte) -25);
                                                                } else {
                                                                    class206.method1385((byte) 58);
                                                                }
                                                                for (int var63 = 0; ~var63 > -6; ++var63) {
                                                                    int var10002 = class269.field4594[var63]++;
                                                                }
                                                                int var64 = class122.method874(17364);
                                                                int var65 = class37.method378(-21416);
                                                                if (~var64 < -4501 && var65 > 4500) {
                                                                    class99.field1772 = 250;
                                                                    class226.method1507(true, 4000);
                                                                    class223.field3830.method368(116, 216);
                                                                    ++class258.field4431;
                                                                }
                                                                if (class234.field4066 != null && class234.field4066.field1823 == 1) {
                                                                    if (class234.field4066.field1826 != null) {
                                                                        class146.method997(class28.field545, class39.field882, false);
                                                                    }
                                                                    class39.field882 = false;
                                                                    class28.field545 = null;
                                                                    class234.field4066 = null;
                                                                }
                                                                ++class15.field251;
                                                                ++class50.field1067;
                                                                ++class33.field710;
                                                                if (class33.field710 > 500) {
                                                                    int var66 = (int) (Math.random() * 8.0D);
                                                                    if (~(var66 & 2) == -3) {
                                                                        class176.field3083 += class28.field556;
                                                                    }
                                                                    class33.field710 = 0;
                                                                    if (~(var66 & 1) == -2) {
                                                                        class204.field3488 += class12.field207;
                                                                    }
                                                                    if ((4 & var66) == 4) {
                                                                        class232.field4024 += class110.field1938;
                                                                    }
                                                                }
                                                                if (~class204.field3488 > 49) {
                                                                    class12.field207 = 2;
                                                                }
                                                                if (class15.field251 > 500) {
                                                                    class15.field251 = 0;
                                                                    int var67 = (int) (Math.random() * 8.0D);
                                                                    if ((1 & var67) == 1) {
                                                                        class13.field222 += class33.field713;
                                                                    }
                                                                    if ((2 & var67) == 2) {
                                                                        class85.field1577 += class95.field1692;
                                                                    }
                                                                }
                                                                if (~class85.field1577 > 19) {
                                                                    class95.field1692 = 1;
                                                                }
                                                                if (class204.field3488 > 50) {
                                                                    class12.field207 = -2;
                                                                }
                                                                if (class85.field1577 > 10) {
                                                                    class95.field1692 = -1;
                                                                }
                                                                if (~class13.field222 > 59) {
                                                                    class33.field713 = 2;
                                                                }
                                                                if (class232.field4024 < -40) {
                                                                    class110.field1938 = 1;
                                                                }
                                                                if (class232.field4024 > 40) {
                                                                    class110.field1938 = -1;
                                                                }
                                                                if (~class13.field222 < -61) {
                                                                    class33.field713 = -2;
                                                                }
                                                                if (~class176.field3083 > 54) {
                                                                    class28.field556 = 2;
                                                                }
                                                                if (~class176.field3083 < -56) {
                                                                    class28.field556 = -2;
                                                                }
                                                                if (~class50.field1067 < -51) {
                                                                    class223.field3830.method368(-125, 130);
                                                                    ++class207.field3528;
                                                                }
                                                                if (class195.field3393) {
                                                                    class170.method1178((byte) -125);
                                                                    class195.field3393 = false;
                                                                }
                                                                try {
                                                                    if (class127.field2219 != null && ~class223.field3830.field647 < -1) {
                                                                        class127.field2219.method1434(0, -26363, class223.field3830.field647, class223.field3830.field644);
                                                                        class223.field3830.field647 = 0;
                                                                        class50.field1067 = 0;
                                                                        return;
                                                                    }
                                                                    return;
                                                                } catch (IOException var68) {
                                                                    class182.method1250((byte) -102);
                                                                    return;
                                                                }
                                                            }
                                                            var57 = var56.field2046;
                                                            if (~var57.field2433 > -1) {
                                                                break;
                                                            }
                                                            var58 = class70.method572(20043, var57.field2535);
                                                        } while (var58 == null || var58.field2457 == null || var58.field2457.length <= var57.field2433 || var58.field2457[var57.field2433] != var57);
                                                        class229.method1519(-101, var56);
                                                    }
                                                }
                                                var54 = var53.field2046;
                                                if (~var54.field2433 > -1) {
                                                    break;
                                                }
                                                var55 = class70.method572(20043, var54.field2535);
                                            } while (var55 == null || var55.field2457 == null || ~var54.field2433 <= ~var55.field2457.length || var55.field2457[var54.field2433] != var54);
                                            class229.method1519(-126, var53);
                                        }
                                    }
                                    var51 = var50.field2046;
                                    if (var51.field2433 < 0) {
                                        break;
                                    }
                                    var52 = class70.method572(20043, var51.field2535);
                                } while (var52 == null || var52.field2457 == null || var51.field2433 >= var52.field2457.length || var52.field2457[var51.field2433] != var51);
                                class229.method1519(-100, var50);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILfa;IZ)Lcj;")
    public static final class115 method665(int arg0, class239 arg1, int arg2, boolean arg3) {
        ++field1607;
        if (!class123.method883(arg0, arg2, -1, arg1)) {
            return null;
        } else {
            return arg3 ? null : class224.method1488(0);
        }
    }

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "(I)V")
    public static void method666(int arg0) {
        field1600 = null;
        field1589 = null;
        field1608 = null;
        int var1 = -10 / ((-62 - arg0) / 62);
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(B)V")
    private final void method667(byte arg0) {
        int var2 = this.field1609;
        if (~var2 != -3) {
            if (var2 == 1) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; var5 < this.field1598.length + -1 && this.field1598[var5][0] <= var4; ++var5) {
                    }
                    int[] var6 = this.field1598[var5 + -1];
                    int[] var7 = this.field1598[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] + -var6[0]);
                    int var9 = -class34.field730[var8 >> 5 & 255] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (var11 >= 32768) {
                        var11 = 32767;
                    }
                    this.field1593[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; var14 < this.field1598.length + -1 && this.field1598[var14][0] <= var13; ++var14) {
                    }
                    int[] var15 = this.field1598[var14 + -1];
                    int[] var16 = this.field1598[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (var19 <= -32768) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field1593[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; var20 < 257; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; ~(this.field1598.length + -1) < ~var22 && ~this.field1598[var22][0] >= ~var21; ++var22) {
                }
                int[] var23 = this.field1598[var22 + -1];
                int[] var24 = this.field1598[var22];
                int var25 = this.method668(var22 - 2, false)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method668(var22 + 1, false)[1];
                int var29 = (var21 - var23[0] << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = var28 - var27 - var25 + var26;
                int var32 = -var25 + var27;
                int var34 = (var29 * var31 >> 12) * var30 >> 12;
                int var35 = -var31 + var25 + -var26;
                int var36 = var30 * var35 >> 12;
                int var37 = var29 * var32 >> 12;
                int var38 = var36 + var37 + var26 + var34;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (~var38 <= -32769) {
                    var38 = 32767;
                }
                this.field1593[var20] = (short) var38;
            }
        }
        ++field1591;
        if (arg0 != 50) {
            method663(false, (class32) null);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IZ)[I")
    private final int[] method668(int arg0, boolean arg1) {
        ++field1595;
        if (~arg0 > -1) {
            return this.field1599;
        } else {
            if (arg1) {
                this.method123((byte) 44, -54);
            }
            return this.field1598.length <= arg0 ? this.field1606 : this.field1598[arg0];
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lfa;Z)V")
    public static final void method669(class239 arg0, boolean arg1) {
        ++field1603;
        class36.field789 = arg0.method1643(class90.field1639, (byte) -106);
        class55.field1138 = arg0.method1643(class39.field902, (byte) -68);
        class151.field2680 = arg0.method1643(class203.field3485, (byte) 125);
        class62.field1250 = arg0.method1643(class24.field439, (byte) -33);
        class196.field3409 = arg0.method1643(class221.field3801, (byte) 118);
        class82.field1544 = arg0.method1643(class197.field3433, (byte) -92);
        class31.field613 = arg0.method1643(class97.field1715, (byte) -63);
        class24.field432 = arg0.method1643(class32.field697, (byte) 126);
        class124.field2183 = arg0.method1643(class274.field4801, (byte) 126);
        class31.field614 = arg0.method1643(class156.field2770, (byte) 127);
        class21.field397 = arg0.method1643(class58.field1195, (byte) 116);
        if (!arg1) {
            class39.field894 = arg0.method1643(class27.field493, (byte) -1);
            class14.field237 = arg0.method1643(class135.field2354, (byte) 122);
            class125.field2193 = arg0.method1643(class7.field101, (byte) -4);
            class242.field4253 = arg0.method1643(class25.field445, (byte) 119);
            class151.field2682 = arg0.method1643(class117.field2059, (byte) -120);
            class56.field1164 = arg0.method1643(class104.field1841, (byte) -117);
            class28.field573 = arg0.method1643(class141.field2487, (byte) 120);
            class83.field1554 = arg0.method1643(class99.field1764, (byte) 124);
        }
    }

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "(I)V")
    public final void method124(int arg0) {
        if (this.field1598 == null) {
            this.field1598 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field1590;
        if (this.field1598.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (arg0 != 31) {
                method666(-100);
            }
            if (~this.field1609 == -3) {
                this.method662(0);
            }
            class212.method1423(-19836);
            this.method667((byte) 50);
        }
    }

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "(I)I")
    public static final int method670(int arg0) {
        ++field1596;
        if ((double) class95.field1697 == 3.0D) {
            return 37;
        } else {
            if (arg0 != 37) {
                field1608 = null;
            }
            if ((double) class95.field1697 == 4.0D) {
                return 50;
            } else {
                return (double) class95.field1697 == 6.0D ? 75 : 100;
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lpj;ZI)V")
    public static final void method671(class237 arg0, boolean arg1, int arg2) {
        ++field1610;
        class237 var3 = arg0.method1579(-18896);
        short[] var4 = new short[16];
        int var5 = arg2;
        for (int var6 = 0; ~class148.field2633 < ~var6; ++var6) {
            class8 var9 = class112.method829((byte) -82, var6);
            if ((!arg1 || var9.field115) && ~var9.field124 == 0 && var9.field182 == -1 && ~var9.field141 == -1 && var9.field131.method1579(-18896).method1604((byte) 20, var3) != -1) {
                if (~var5 <= -251) {
                    class226.field3869 = null;
                    class39.field909 = -1;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; ++var11) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        class39.field909 = var5;
        class226.field3869 = var4;
        class84.field1571 = 0;
        class237[] var7 = new class237[class39.field909];
        for (int var8 = 0; ~var8 > ~class39.field909; ++var8) {
            var7[var8] = class112.method829((byte) -82, var4[var8]).field131;
        }
        class155.method1065(var7, arg2 + 98, class226.field3869);
    }
}
