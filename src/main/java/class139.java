import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class139 extends class185 {

    @OriginalMember(owner = "client!hf", name = "K", descriptor = "[I")
    private int[] field2025 = new int[257];

    @OriginalMember(owner = "client!hf", name = "R", descriptor = "I")
    public static int field2032 = 0;

    @OriginalMember(owner = "client!hf", name = "N", descriptor = "Lsa;")
    public static class268 field2028 = new class268(0, -1);

    @OriginalMember(owner = "client!hf", name = "Y", descriptor = "Lik;")
    public static class267 field2039 = new class267(64);

    @OriginalMember(owner = "client!hf", name = "J", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!hf", name = "L", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!hf", name = "M", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!hf", name = "P", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!hf", name = "Q", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!hf", name = "S", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!hf", name = "T", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!hf", name = "U", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!hf", name = "V", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!hf", name = "W", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!hf", name = "X", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!hf", name = "ab", descriptor = "[Lpi;")
    public static class141[] field2041;

    @OriginalMember(owner = "client!hf", name = "O", descriptor = "[[I")
    private int[][] field2029;

    @OriginalMember(owner = "client!hf", name = "Z", descriptor = "[[[B")
    public static byte[][][] field2040;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "(B)V")
    private final void method851(byte arg0) {
        ++field2035;
        if (arg0 > -125) {
            method857(-128);
        }
        int var2 = this.field2029.length;
        if (var2 > 0) {
            for (int var3 = 0; ~var3 > -258; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; ~var6 > ~var2 && this.field2029[var6][0] <= var5; ++var6) {
                    ++var4;
                }
                int var8;
                int var9;
                int var10;
                if (~var2 >= ~var4) {
                    int[] var7 = this.field2029[var2 + -1];
                    var8 = var7[2];
                    var9 = var7[1];
                    var10 = var7[3];
                } else {
                    int[] var11 = this.field2029[var4];
                    if (~var4 >= -1) {
                        var8 = var11[2];
                        var10 = var11[3];
                        var9 = var11[1];
                    } else {
                        int[] var12 = this.field2029[var4 + -1];
                        int var13 = (-var12[0] + var5 << 12) / (var11[0] + -var12[0]);
                        int var14 = -var13 + 4096;
                        var9 = var11[1] * var13 + var12[1] * var14 >> 12;
                        var8 = var11[2] * var13 + var12[2] * var14 >> 12;
                        var10 = var11[3] * var13 - -(var12[3] * var14) >> 12;
                    }
                }
                int var15 = var9 >> 4;
                int var16 = var8 >> 4;
                if (~var16 <= -1) {
                    if (~var16 < -256) {
                        var16 = 255;
                    }
                } else {
                    var16 = 0;
                }
                if (var15 >= 0) {
                    if (~var15 < -256) {
                        var15 = 255;
                    }
                } else {
                    var15 = 0;
                }
                int var17 = var10 >> 4;
                if (var17 >= 0) {
                    if (~var17 < -256) {
                        var17 = 255;
                    }
                } else {
                    var17 = 0;
                }
                this.field2025[var3] = class63.method428(var17, class63.method428(var16 << 8, var15 << 16));
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I[I)[I")
    public static final int[] method852(int arg0, int[] arg1) {
        ++field2031;
        if (arg1 == null) {
            return null;
        } else {
            int[] var2 = new int[arg1.length];
            class193.method1208(arg1, 0, var2, arg0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(II)V")
    private final void method853(int arg0, int arg1) {
        ++field2030;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (arg0 != 6) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field2029 = new int[4][4];
                                this.field2029[0][1] = 0;
                                this.field2029[0][3] = 0;
                                this.field2029[0][2] = 4096;
                                this.field2029[1][3] = 0;
                                this.field2029[0][0] = 2048;
                                this.field2029[2][3] = 0;
                                this.field2029[1][0] = 2867;
                                this.field2029[1][1] = 4096;
                                this.field2029[2][1] = 4096;
                                this.field2029[2][0] = 3276;
                                this.field2029[3][3] = 0;
                                this.field2029[3][0] = 4096;
                                this.field2029[3][1] = 4096;
                                this.field2029[1][2] = 4096;
                                this.field2029[2][2] = 4096;
                                this.field2029[3][2] = 0;
                            } else {
                                this.field2029 = new int[16][4];
                                this.field2029[0][0] = 0;
                                this.field2029[1][0] = 155;
                                this.field2029[0][2] = 192;
                                this.field2029[2][0] = 389;
                                this.field2029[0][3] = 321;
                                this.field2029[1][2] = 449;
                                this.field2029[0][1] = 80;
                                this.field2029[3][0] = 671;
                                this.field2029[2][2] = 690;
                                this.field2029[3][2] = 995;
                                this.field2029[1][3] = 562;
                                this.field2029[2][3] = 803;
                                this.field2029[4][2] = 1397;
                                this.field2029[1][1] = 321;
                                this.field2029[3][3] = 1140;
                                this.field2029[2][1] = 578;
                                this.field2029[5][2] = 1429;
                                this.field2029[4][0] = 897;
                                this.field2029[4][3] = 1509;
                                this.field2029[6][2] = 1461;
                                this.field2029[5][0] = 1175;
                                this.field2029[7][2] = 1525;
                                this.field2029[8][2] = 1590;
                                this.field2029[5][3] = 1413;
                                this.field2029[9][2] = 2056;
                                this.field2029[3][1] = 947;
                                this.field2029[4][1] = 1285;
                                this.field2029[6][3] = 1333;
                                this.field2029[10][2] = 2586;
                                this.field2029[6][0] = 1368;
                                this.field2029[7][0] = 1507;
                                this.field2029[7][3] = 1702;
                                this.field2029[8][0] = 1736;
                                this.field2029[11][2] = 3148;
                                this.field2029[12][2] = 3710;
                                this.field2029[8][3] = 2056;
                                this.field2029[5][1] = 1525;
                                this.field2029[6][1] = 1734;
                                this.field2029[7][1] = 1413;
                                this.field2029[9][0] = 2088;
                                this.field2029[10][0] = 2355;
                                this.field2029[13][2] = 3421;
                                this.field2029[9][3] = 2666;
                                this.field2029[8][1] = 1108;
                                this.field2029[14][2] = 3148;
                                this.field2029[9][1] = 1766;
                                this.field2029[15][2] = 2505;
                                this.field2029[11][0] = 2691;
                                this.field2029[12][0] = 3031;
                                this.field2029[10][3] = 3276;
                                this.field2029[13][0] = 3522;
                                this.field2029[10][1] = 2409;
                                this.field2029[14][0] = 3727;
                                this.field2029[11][1] = 3116;
                                this.field2029[11][3] = 3228;
                                this.field2029[12][1] = 3806;
                                this.field2029[12][3] = 3196;
                                this.field2029[13][3] = 3019;
                                this.field2029[14][3] = 3228;
                                this.field2029[15][0] = 4096;
                                this.field2029[15][3] = 2746;
                                this.field2029[13][1] = 3437;
                                this.field2029[14][1] = 3116;
                                this.field2029[15][1] = 2377;
                            }
                        } else {
                            this.field2029 = new int[6][4];
                            this.field2029[0][2] = 0;
                            this.field2029[0][3] = 0;
                            this.field2029[0][0] = 0;
                            this.field2029[1][2] = 0;
                            this.field2029[2][2] = 0;
                            this.field2029[3][2] = 1124;
                            this.field2029[1][0] = 1843;
                            this.field2029[4][2] = 3084;
                            this.field2029[2][0] = 2457;
                            this.field2029[5][2] = 4096;
                            this.field2029[0][1] = 0;
                            this.field2029[1][1] = 0;
                            this.field2029[3][0] = 2781;
                            this.field2029[2][1] = 0;
                            this.field2029[1][3] = 1493;
                            this.field2029[2][3] = 2939;
                            this.field2029[4][0] = 3481;
                            this.field2029[5][0] = 4096;
                            this.field2029[3][3] = 3565;
                            this.field2029[4][3] = 4031;
                            this.field2029[3][1] = 0;
                            this.field2029[4][1] = 546;
                            this.field2029[5][3] = 4096;
                            this.field2029[5][1] = 4096;
                        }
                    } else {
                        this.field2029 = new int[7][4];
                        this.field2029[0][1] = 0;
                        this.field2029[1][1] = 0;
                        this.field2029[0][2] = 0;
                        this.field2029[0][3] = 4096;
                        this.field2029[2][1] = 0;
                        this.field2029[1][2] = 4096;
                        this.field2029[0][0] = 0;
                        this.field2029[2][2] = 4096;
                        this.field2029[1][0] = 663;
                        this.field2029[3][1] = 4096;
                        this.field2029[2][0] = 1363;
                        this.field2029[3][0] = 2048;
                        this.field2029[1][3] = 4096;
                        this.field2029[2][3] = 0;
                        this.field2029[4][0] = 2727;
                        this.field2029[3][3] = 0;
                        this.field2029[4][3] = 0;
                        this.field2029[5][0] = 3411;
                        this.field2029[6][0] = 4096;
                        this.field2029[3][2] = 4096;
                        this.field2029[4][2] = 0;
                        this.field2029[5][2] = 0;
                        this.field2029[4][1] = 4096;
                        this.field2029[6][2] = 0;
                        this.field2029[5][3] = 4096;
                        this.field2029[6][3] = 4096;
                        this.field2029[5][1] = 4096;
                        this.field2029[6][1] = 0;
                    }
                } else {
                    this.field2029 = new int[8][4];
                    this.field2029[0][2] = 2602;
                    this.field2029[0][0] = 0;
                    this.field2029[1][0] = 2867;
                    this.field2029[1][2] = 1799;
                    this.field2029[0][1] = 2650;
                    this.field2029[1][1] = 2313;
                    this.field2029[0][3] = 2361;
                    this.field2029[2][1] = 2618;
                    this.field2029[2][0] = 3072;
                    this.field2029[3][1] = 2296;
                    this.field2029[1][3] = 1558;
                    this.field2029[4][1] = 2072;
                    this.field2029[2][3] = 1413;
                    this.field2029[3][0] = 3276;
                    this.field2029[4][0] = 3481;
                    this.field2029[5][1] = 2730;
                    this.field2029[3][3] = 947;
                    this.field2029[6][1] = 2232;
                    this.field2029[2][2] = 1734;
                    this.field2029[7][1] = 1686;
                    this.field2029[4][3] = 722;
                    this.field2029[3][2] = 1220;
                    this.field2029[5][3] = 1766;
                    this.field2029[5][0] = 3686;
                    this.field2029[6][0] = 3891;
                    this.field2029[7][0] = 4096;
                    this.field2029[6][3] = 915;
                    this.field2029[4][2] = 963;
                    this.field2029[5][2] = 2152;
                    this.field2029[6][2] = 1060;
                    this.field2029[7][2] = 1413;
                    this.field2029[7][3] = 1140;
                }
            } else {
                this.field2029 = new int[2][4];
                this.field2029[0][3] = 0;
                this.field2029[0][0] = 0;
                this.field2029[1][0] = 4096;
                this.field2029[0][2] = 0;
                this.field2029[1][2] = 4096;
                this.field2029[0][1] = 0;
                this.field2029[1][3] = 4096;
                this.field2029[1][1] = 4096;
            }
        }
        int var4 = -110 / ((arg1 - -72) / 33);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method854(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(IIIIIIII)V")
    public static final void method855(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field2034;
        int var8 = arg0 - -arg5;
        int var9 = -arg5 + arg4;
        int var10 = arg2 + arg5;
        int var11 = -arg5 + arg7;
        for (int var12 = arg0; ~var12 > ~var8; ++var12) {
            class64.method429(class23.field284[var12], arg2, (byte) 121, arg6, arg7);
        }
        if (arg3 == 1507) {
            for (int var13 = arg4; var9 < var13; --var13) {
                class64.method429(class23.field284[var13], arg2, (byte) 93, arg6, arg7);
            }
            for (int var14 = var8; var14 <= var9; ++var14) {
                int[] var15 = class23.field284[var14];
                class64.method429(var15, arg2, (byte) 97, arg6, var10);
                class64.method429(var15, var10, (byte) 120, arg1, var11);
                class64.method429(var15, var11, (byte) 87, arg6, arg7);
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(II)I")
    public static final int method856(int arg0, int arg1) {
        if (arg1 > -118) {
            return -2;
        } else {
            ++field2027;
            return ~arg0 == -16711936 ? -1 : class255.method1683(21130, arg0);
        }
    }

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "(I)V")
    public static final void method857(int arg0) {
        if (arg0 != -3633) {
            method854(-111, 72, 116, -101, -95, -89, -77, 56);
        }
        class66.field1063.method1775(arg0 ^ -25660);
        ++field2026;
    }

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "(I)V")
    public final void method30(int arg0) {
        if (this.field2029 == null) {
            this.method853(1, -126);
        }
        if (arg0 != -9) {
            field2039 = null;
        }
        ++field2033;
        this.method851((byte) -127);
    }

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "(B)V")
    public static final void method858(byte arg0) {
        int var1 = 0;
        int var2 = -59 % ((-13 - arg0) / 54);
        while (var1 < class118.field1781) {
            int var3 = class113.field1736[var1];
            class61 var4 = class18.field220[var3];
            int var5 = class100.field1580.method1593((byte) 27);
            if (~(16 & var5) != -1) {
                var5 += class100.field1580.method1593((byte) 27) << 8;
            }
            if (~(var5 & 4) != -1) {
                var4.field2254 = class100.field1580.method1597((byte) 118);
                var4.field2255 = 100;
            }
            if (~(var5 & 8) != -1) {
                int var6 = class100.field1580.method1572(-80);
                int var7 = class100.field1580.method1583(-1);
                var4.method931(var7, class270.field4058, (byte) 61, var6);
                var4.field2212 = class270.field4058 + 300;
                var4.field2299 = class100.field1580.method1583(-1);
            }
            if ((var5 & 128) != 0) {
                int var8 = class100.field1580.method1578(-2);
                if (var8 == 65535) {
                    var8 = -1;
                }
                int var9 = class100.field1580.method1571((byte) -79);
                class196.method1226(var9, var4, var8, -1);
            }
            if ((var5 & 32) != 0) {
                int var10 = class100.field1580.method1572(-108);
                int var11 = class100.field1580.method1571((byte) -73);
                var4.method931(var11, class270.field4058, (byte) 83, var10);
            }
            if ((256 & var5) != 0) {
                int var12 = class100.field1580.method1583(-1);
                int[] var13 = new int[var12];
                int[] var14 = new int[var12];
                int[] var15 = new int[var12];
                for (int var16 = 0; var12 > var16; ++var16) {
                    int var17 = class100.field1580.method1570(true);
                    if (var17 == 65535) {
                        var17 = -1;
                    }
                    var13[var16] = var17;
                    var14[var16] = class100.field1580.method1583(-1);
                    var15[var16] = class100.field1580.method1575(false);
                }
                class234.method1487(var15, var14, (byte) -96, var4, var13);
            }
            if (~(64 & var5) != -1) {
                int var18 = class100.field1580.method1570(true);
                int var19 = class100.field1580.method1576(-17672);
                if (~var18 == -65536) {
                    var18 = -1;
                }
                boolean var20 = true;
                if (var18 != -1 && ~var4.field2230 != 0 && ~class276.method1829(class236.method1498((byte) -103, var18).field249, 29223).field3227 > ~class276.method1829(class236.method1498((byte) -114, var4.field2230).field249, 29223).field3227) {
                    var20 = false;
                }
                if (var20) {
                    var4.field2221 = var19 >> 16;
                    var4.field2230 = var18;
                    var4.field2272 = 1;
                    var4.field2218 = 0;
                    var4.field2280 = class270.field4058 - -(var19 & 65535);
                    var4.field2201 = 0;
                    if (~class270.field4058 > ~var4.field2280) {
                        var4.field2201 = -1;
                    }
                    if (~var4.field2230 != 0 && class270.field4058 == var4.field2280) {
                        int var21 = class236.method1498((byte) -121, var4.field2230).field249;
                        if (var21 != -1) {
                            class215 var22 = class276.method1829(var21, 29223);
                            if (var22 != null && var22.field3215 != null) {
                                client.method966((byte) 52, 0, false, var4.field2234, var22, var4.field2251);
                            }
                        }
                    }
                }
            }
            if ((var5 & 1) != 0) {
                if (var4.field959.method493(-48)) {
                    class191.method1200((byte) 88, var4);
                }
                var4.method405(class267.method1783((byte) 120, class100.field1580.method1570(true)), (byte) 63);
                var4.method930(66, var4.field959.field1148);
                var4.field2269 = var4.field959.field1194;
                var4.field2287 = var4.field959.field1176;
                if (var4.field959.method493(-34)) {
                    class89.method573(var4.field2297[0], (class107) null, class99.field1557, 0, var4, var4.field2275[0], 64, (class288) null);
                }
            }
            if ((var5 & 2) != 0) {
                var4.field2283 = class100.field1580.method1575(false);
                if (var4.field2283 == 65535) {
                    var4.field2283 = -1;
                }
            }
            if (~(var5 & 512) != -1) {
                var4.field2210 = class100.field1580.method1578(-2);
                var4.field2216 = class100.field1580.method1578(-2);
            }
            ++var1;
        }
        ++field2024;
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V")
    public class139() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(Z)V")
    public static void method859(boolean arg0) {
        field2039 = null;
        field2041 = null;
        if (!arg0) {
            field2038 = 127;
        }
        field2028 = null;
        field2040 = null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILfl;I)V")
    public final void method27(int arg0, class248 arg1, int arg2) {
        ++field2037;
        if (~arg0 == -1) {
            int var4 = arg1.method1593((byte) 27);
            if (var4 != 0) {
                this.method853(var4, -128);
            } else {
                this.field2029 = new int[arg1.method1593((byte) 27)][4];
                for (int var5 = 0; ~var5 > ~this.field2029.length; ++var5) {
                    this.field2029[var5][0] = arg1.method1575(false);
                    this.field2029[var5][1] = arg1.method1593((byte) 27) << 4;
                    this.field2029[var5][2] = arg1.method1593((byte) 27) << 4;
                    this.field2029[var5][3] = arg1.method1593((byte) 27) << 4;
                }
            }
        }
        if (arg2 != -6357) {
            field2041 = null;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method39(boolean arg0, int arg1) {
        if (!arg0) {
            field2039 = null;
        }
        ++field2036;
        int[][] var3 = super.field2802.method753(1, arg1);
        if (super.field2802.field1807) {
            int[] var4 = this.method1146((byte) 121, arg1, 0);
            int[] var5 = var3[1];
            int[] var6 = var3[0];
            int[] var7 = var3[2];
            for (int var8 = 0; ~class174.field2648 < ~var8; ++var8) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (~var9 < -257) {
                    var9 = 256;
                }
                int var10 = this.field2025[var9];
                var6[var8] = class94.method598(var10, 16711680) >> 12;
                var5[var8] = class94.method598(65280, var10) >> 4;
                var7[var8] = class94.method598(4080, var10 << 4);
            }
        }
        return var3;
    }
}
