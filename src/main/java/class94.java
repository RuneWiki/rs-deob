import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class94 extends class51 {

    @OriginalMember(owner = "client!ke", name = "eb", descriptor = "Lea;")
    private static class38 field2117 = class9.method46((byte) 108, "The server is being updated)3");

    @OriginalMember(owner = "client!ke", name = "db", descriptor = "Lea;")
    public static class38 field2116 = class9.method46((byte) 103, "(Z");

    @OriginalMember(owner = "client!ke", name = "fb", descriptor = "Lea;")
    public static class38 field2118 = field2117;

    @OriginalMember(owner = "client!ke", name = "ib", descriptor = "I")
    public static int field2121 = 0;

    @OriginalMember(owner = "client!ke", name = "ab", descriptor = "Lgb;")
    public static class57 field2113 = new class57();

    @OriginalMember(owner = "client!ke", name = "ob", descriptor = "Lhc;")
    public static class66 field2127 = new class66(new byte[5000]);

    @OriginalMember(owner = "client!ke", name = "qb", descriptor = "Lea;")
    public static class38 field2129 = class9.method46((byte) 126, "Keine Antwort vom Server)3");

    @OriginalMember(owner = "client!ke", name = "pb", descriptor = "I")
    public static int field2128 = 0;

    @OriginalMember(owner = "client!ke", name = "Z", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!ke", name = "bb", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!ke", name = "cb", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!ke", name = "gb", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!ke", name = "hb", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!ke", name = "kb", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!ke", name = "lb", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!ke", name = "mb", descriptor = "I")
    public static int field2125;

    @OriginalMember(owner = "client!ke", name = "nb", descriptor = "[Lfa;")
    public static class47[] field2126;

    @OriginalMember(owner = "client!ke", name = "jb", descriptor = "[[I")
    private int[][] field2122;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BI)[[I")
    public final int[][] method52(byte arg0, int arg1) {
        if (arg0 < 111) {
            field2126 = null;
        }
        ++field2123;
        int[][] var3 = super.field1292.method720(false, arg1);
        if (super.field1292.field2032) {
            int var4 = this.field2122.length;
            int[] var5 = this.method376(arg1, 0, -72);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            if (var4 > 0) {
                for (int var9 = 0; class86.field2008 > var9; ++var9) {
                    int var10 = 0;
                    int var11 = var5[var9];
                    for (int var12 = 0; ~var4 < ~var12 && ~this.field2122[var12][0] >= ~var11; ++var12) {
                        ++var10;
                    }
                    if (~var10 <= ~var4) {
                        int[] var13 = this.field2122[var4 + -1];
                        var6[var9] = var13[1];
                        var7[var9] = var13[2];
                        var8[var9] = var13[3];
                    } else {
                        int[] var14 = this.field2122[var10];
                        if (~var10 < -1) {
                            int[] var15 = this.field2122[var10 + -1];
                            int var16 = (-var15[0] + var11 << 12) / (var14[0] + -var15[0]);
                            int var17 = -var16 + 4096;
                            var6[var9] = var14[1] * var16 + var15[1] * var17 >> 12;
                            var7[var9] = var14[2] * var16 + var15[2] * var17 >> 12;
                            var8[var9] = var14[3] * var16 - -(var15[3] * var17) >> 12;
                        } else {
                            var6[var9] = var14[1];
                            var7[var9] = var14[2];
                            var8[var9] = var14[3];
                        }
                    }
                }
            } else {
                for (int var18 = 0; class86.field2008 > var18; ++var18) {
                    var6[var18] = 0;
                    var7[var18] = 0;
                    var8[var18] = 0;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lhc;IZ)V")
    public final void method51(class66 arg0, int arg1, boolean arg2) {
        if (~arg1 == -1) {
            int var4 = arg0.method509(124);
            if (~var4 != -1) {
                this.method792(3, var4);
            } else {
                this.field2122 = new int[arg0.method509(121)][4];
                for (int var5 = 0; ~this.field2122.length < ~var5; ++var5) {
                    this.field2122[var5][0] = arg0.method511(-120);
                    this.field2122[var5][1] = arg0.method509(127) << 4;
                    this.field2122[var5][2] = arg0.method509(116) << 4;
                    this.field2122[var5][3] = arg0.method509(117) << 4;
                }
            }
        }
        ++field2120;
        if (!arg2) {
            this.method792(1, -100);
        }
    }

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "(I)V")
    public static final void method789(int arg0) {
        if (arg0 != 1) {
            method793(-54);
        }
        for (int var1 = 0; class37.field784 > var1; ++var1) {
            int var10002 = class192.field3801[var1]--;
            if (~class192.field3801[var1] <= 9) {
                class26 var3 = class181.field3649[var1];
                if (var3 == null) {
                    var3 = class26.method150(class14.field303, class117.field2562[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class192.field3801[var1] += var3.method151();
                    class181.field3649[var1] = var3;
                }
                if (class192.field3801[var1] < 0) {
                    int var10;
                    if (class143.field2987[var1] != 0) {
                        int var4 = (255 & class143.field2987[var1]) * 128;
                        int var5 = (16747510 & class143.field2987[var1]) >> 16;
                        int var6 = var5 * 128 + 64 + -class195.field3842.field406;
                        if (~var6 > -1) {
                            var6 = -var6;
                        }
                        int var7 = 255 & class143.field2987[var1] >> 8;
                        int var8 = var7 * 128 + -class195.field3842.field382 + 64;
                        if (~var8 > -1) {
                            var8 = -var8;
                        }
                        int var9 = var6 - (-var8 + 128);
                        if (var9 > var4) {
                            class192.field3801[var1] = -100;
                            continue;
                        }
                        if (~var9 > -1) {
                            var9 = 0;
                        }
                        var10 = (-var9 + var4) * class113.field2522 / var4;
                    } else {
                        var10 = class80.field1891;
                    }
                    if (var10 > 0) {
                        class79 var11 = var3.method148().method677(class199.field3931);
                        class76 var12 = class76.method599(var11, 100, var10);
                        var12.method636(class83.field1965[var1] + -1);
                        class3.field100.method450(var12);
                    }
                    class192.field3801[var1] = -100;
                }
            } else {
                --class37.field784;
                for (int var2 = var1; ~class37.field784 < ~var2; ++var2) {
                    class117.field2562[var2] = class117.field2562[var2 + 1];
                    class181.field3649[var2] = class181.field3649[var2 + 1];
                    class83.field1965[var2] = class83.field1965[var2 - -1];
                    class192.field3801[var2] = class192.field3801[var2 + 1];
                    class143.field2987[var2] = class143.field2987[var2 + 1];
                }
                --var1;
            }
        }
        ++field2112;
        if (class134.field2826 && !class51.method373(arg0 + 125)) {
            if (class109.field2454 != 0 && class179.field3615 != -1) {
                class32.method204(class109.field2454, 0, false, -15793, class133.field2815, class179.field3615);
            }
            class134.field2826 = false;
        }
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V")
    public class94() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(IIB)Z")
    public static final boolean method790(int arg0, int arg1, byte arg2) {
        ++field2115;
        if (arg2 > -121) {
            return false;
        } else {
            return (1 & arg1 >> arg0 + 1) != 0;
        }
    }

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "(I)V")
    public static final void method791(int arg0) {
        ++field2124;
        if (!class169.field3482) {
            class98.field2186[0] = class148.field3070;
            field2121 = 1;
            class132.field2810[0] = 1004;
            class205.field4031[0] = class70.field1731;
        }
        if (~class86.field1998 != 0) {
            class152.method1061((byte) 61, class86.field1998);
        }
        if (arg0 != 2) {
            field2127 = null;
        }
        for (int var1 = 0; ~class205.field4035 < ~var1; ++var1) {
            if (class102.field2291[var1]) {
                class10.field228[var1] = true;
            }
            class194.field3830[var1] = class102.field2291[var1];
            class102.field2291[var1] = false;
        }
        class196.field3857 = -1;
        class12.field267 = null;
        class146.field3052 = -1;
        class29.field571 = class45.field1098;
        if (class86.field1998 != -1) {
            class205.field4035 = 0;
            class195.method1293(0, class86.field1998, 765, 0, (byte) 111, 0, -1, 503, 0);
        }
        class71.method570();
        class177.method1225((byte) -39);
        if (!class169.field3482) {
            if (class196.field3857 != -1) {
                class128.method949(class196.field3857, class146.field3052, (byte) 41);
            }
        } else {
            class166.method1187(8458);
        }
        if (~class143.field2980 == -4) {
            for (int var2 = 0; class205.field4035 > var2; ++var2) {
                if (!class194.field3830[var2]) {
                    if (class10.field228[var2]) {
                        class71.method566(class166.field3434[var2], class113.field2526[var2], class28.field552[var2], class176.field3559[var2], 16711680, 128);
                    }
                } else {
                    class71.method566(class166.field3434[var2], class113.field2526[var2], class28.field552[var2], class176.field3559[var2], 16711935, 128);
                }
            }
        }
        class43.method314(class195.field3842.field406, class10.field224, class205.field4027, 86, class195.field3842.field382);
        class205.field4027 = 0;
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(II)V")
    private final void method792(int arg0, int arg1) {
        ++field2119;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (~arg1 != -7) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field2122 = new int[4][4];
                                this.field2122[0][2] = 4096;
                                this.field2122[1][2] = 4096;
                                this.field2122[2][2] = 4096;
                                this.field2122[0][3] = 0;
                                this.field2122[0][0] = 2048;
                                this.field2122[1][0] = 2867;
                                this.field2122[0][1] = 0;
                                this.field2122[1][3] = 0;
                                this.field2122[3][2] = 0;
                                this.field2122[2][3] = 0;
                                this.field2122[1][1] = 4096;
                                this.field2122[2][0] = 3276;
                                this.field2122[2][1] = 4096;
                                this.field2122[3][1] = 4096;
                                this.field2122[3][3] = 0;
                                this.field2122[3][0] = 4096;
                            } else {
                                this.field2122 = new int[16][4];
                                this.field2122[0][3] = 321;
                                this.field2122[1][3] = 562;
                                this.field2122[0][0] = 0;
                                this.field2122[0][2] = 192;
                                this.field2122[0][1] = 80;
                                this.field2122[1][1] = 321;
                                this.field2122[2][1] = 578;
                                this.field2122[1][0] = 155;
                                this.field2122[3][1] = 947;
                                this.field2122[2][3] = 803;
                                this.field2122[1][2] = 449;
                                this.field2122[2][2] = 690;
                                this.field2122[3][3] = 1140;
                                this.field2122[2][0] = 389;
                                this.field2122[4][3] = 1509;
                                this.field2122[5][3] = 1413;
                                this.field2122[3][0] = 671;
                                this.field2122[4][0] = 897;
                                this.field2122[3][2] = 995;
                                this.field2122[4][2] = 1397;
                                this.field2122[6][3] = 1333;
                                this.field2122[5][2] = 1429;
                                this.field2122[5][0] = 1175;
                                this.field2122[6][0] = 1368;
                                this.field2122[7][0] = 1507;
                                this.field2122[6][2] = 1461;
                                this.field2122[7][2] = 1525;
                                this.field2122[8][2] = 1590;
                                this.field2122[4][1] = 1285;
                                this.field2122[8][0] = 1736;
                                this.field2122[9][2] = 2056;
                                this.field2122[9][0] = 2088;
                                this.field2122[10][0] = 2355;
                                this.field2122[11][0] = 2691;
                                this.field2122[7][3] = 1702;
                                this.field2122[12][0] = 3031;
                                this.field2122[10][2] = 2586;
                                this.field2122[11][2] = 3148;
                                this.field2122[8][3] = 2056;
                                this.field2122[12][2] = 3710;
                                this.field2122[13][2] = 3421;
                                this.field2122[5][1] = 1525;
                                this.field2122[14][2] = 3148;
                                this.field2122[13][0] = 3522;
                                this.field2122[15][2] = 2505;
                                this.field2122[6][1] = 1734;
                                this.field2122[9][3] = 2666;
                                this.field2122[14][0] = 3727;
                                this.field2122[7][1] = 1413;
                                this.field2122[8][1] = 1108;
                                this.field2122[15][0] = 4096;
                                this.field2122[9][1] = 1766;
                                this.field2122[10][1] = 2409;
                                this.field2122[10][3] = 3276;
                                this.field2122[11][3] = 3228;
                                this.field2122[12][3] = 3196;
                                this.field2122[11][1] = 3116;
                                this.field2122[12][1] = 3806;
                                this.field2122[13][3] = 3019;
                                this.field2122[13][1] = 3437;
                                this.field2122[14][3] = 3228;
                                this.field2122[14][1] = 3116;
                                this.field2122[15][1] = 2377;
                                this.field2122[15][3] = 2746;
                            }
                        } else {
                            this.field2122 = new int[6][4];
                            this.field2122[0][3] = 0;
                            this.field2122[0][0] = 0;
                            this.field2122[0][1] = 0;
                            this.field2122[1][1] = 0;
                            this.field2122[0][2] = 0;
                            this.field2122[1][0] = 1843;
                            this.field2122[1][3] = 1493;
                            this.field2122[1][2] = 0;
                            this.field2122[2][2] = 0;
                            this.field2122[2][0] = 2457;
                            this.field2122[2][1] = 0;
                            this.field2122[3][2] = 1124;
                            this.field2122[2][3] = 2939;
                            this.field2122[3][1] = 0;
                            this.field2122[4][1] = 546;
                            this.field2122[3][0] = 2781;
                            this.field2122[5][1] = 4096;
                            this.field2122[3][3] = 3565;
                            this.field2122[4][3] = 4031;
                            this.field2122[4][2] = 3084;
                            this.field2122[5][3] = 4096;
                            this.field2122[4][0] = 3481;
                            this.field2122[5][2] = 4096;
                            this.field2122[5][0] = 4096;
                        }
                    } else {
                        this.field2122 = new int[7][4];
                        this.field2122[0][1] = 0;
                        this.field2122[1][1] = 0;
                        this.field2122[0][2] = 0;
                        this.field2122[2][1] = 0;
                        this.field2122[0][0] = 0;
                        this.field2122[1][2] = 4096;
                        this.field2122[3][1] = 4096;
                        this.field2122[4][1] = 4096;
                        this.field2122[1][0] = 663;
                        this.field2122[2][2] = 4096;
                        this.field2122[5][1] = 4096;
                        this.field2122[3][2] = 4096;
                        this.field2122[2][0] = 1363;
                        this.field2122[3][0] = 2048;
                        this.field2122[6][1] = 0;
                        this.field2122[4][0] = 2727;
                        this.field2122[4][2] = 0;
                        this.field2122[0][3] = 4096;
                        this.field2122[5][0] = 3411;
                        this.field2122[1][3] = 4096;
                        this.field2122[5][2] = 0;
                        this.field2122[2][3] = 0;
                        this.field2122[3][3] = 0;
                        this.field2122[4][3] = 0;
                        this.field2122[5][3] = 4096;
                        this.field2122[6][0] = 4096;
                        this.field2122[6][2] = 0;
                        this.field2122[6][3] = 4096;
                    }
                } else {
                    this.field2122 = new int[8][4];
                    this.field2122[0][0] = 0;
                    this.field2122[0][3] = 2361;
                    this.field2122[0][2] = 2602;
                    this.field2122[1][0] = 2867;
                    this.field2122[1][2] = 1799;
                    this.field2122[2][0] = 3072;
                    this.field2122[2][2] = 1734;
                    this.field2122[3][2] = 1220;
                    this.field2122[3][0] = 3276;
                    this.field2122[0][1] = 2650;
                    this.field2122[1][1] = 2313;
                    this.field2122[1][3] = 1558;
                    this.field2122[4][2] = 963;
                    this.field2122[4][0] = 3481;
                    this.field2122[2][3] = 1413;
                    this.field2122[3][3] = 947;
                    this.field2122[5][2] = 2152;
                    this.field2122[5][0] = 3686;
                    this.field2122[6][0] = 3891;
                    this.field2122[4][3] = 722;
                    this.field2122[2][1] = 2618;
                    this.field2122[3][1] = 2296;
                    this.field2122[7][0] = 4096;
                    this.field2122[5][3] = 1766;
                    this.field2122[6][3] = 915;
                    this.field2122[6][2] = 1060;
                    this.field2122[7][2] = 1413;
                    this.field2122[4][1] = 2072;
                    this.field2122[7][3] = 1140;
                    this.field2122[5][1] = 2730;
                    this.field2122[6][1] = 2232;
                    this.field2122[7][1] = 1686;
                }
            } else {
                this.field2122 = new int[2][4];
                this.field2122[0][0] = 0;
                this.field2122[1][0] = 4096;
                this.field2122[0][2] = 0;
                this.field2122[1][2] = 4096;
                this.field2122[0][1] = 0;
                this.field2122[0][3] = 0;
                this.field2122[1][3] = 4096;
                this.field2122[1][1] = 4096;
            }
        }
        if (arg0 == 3) {
            ;
        }
    }

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "(I)V")
    public static void method793(int arg0) {
        if (arg0 == 3) {
            field2127 = null;
            field2118 = null;
            field2113 = null;
            field2129 = null;
            field2117 = null;
            field2126 = null;
            field2116 = null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "(I)V")
    public final void method235(int arg0) {
        if (arg0 != -2) {
            field2116 = null;
        }
        ++field2125;
        if (this.field2122 == null) {
            this.method792(3, 1);
        }
    }

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "(II)I")
    public static int method794(int arg0, int arg1) {
        return arg0 | arg1;
    }
}
