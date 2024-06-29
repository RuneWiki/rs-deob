import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public class class110 extends class82 {

    @OriginalMember(owner = "client!hw", name = "Z", descriptor = "[I")
    private int[] field1369 = new int[257];

    @OriginalMember(owner = "client!hw", name = "R", descriptor = "I")
    public static int field1361 = -1;

    @OriginalMember(owner = "client!hw", name = "L", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!hw", name = "M", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!hw", name = "N", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!hw", name = "O", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!hw", name = "P", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!hw", name = "Q", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!hw", name = "S", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!hw", name = "T", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!hw", name = "U", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!hw", name = "W", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!hw", name = "Y", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!hw", name = "X", descriptor = "Ljava/awt/Frame;")
    public static Frame field1367;

    @OriginalMember(owner = "client!hw", name = "V", descriptor = "[[I")
    private int[][] field1365;

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(Z)V")
    private final void method637(boolean arg0) {
        ++field1366;
        if (arg0) {
            this.field1369 = null;
        }
        int var2 = this.field1365.length;
        if (~var2 < -1) {
            for (int var3 = 0; var3 < 257; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; var2 > var6 && var5 >= this.field1365[var6][0]; ++var6) {
                    ++var4;
                }
                int var11;
                int var12;
                int var13;
                if (var2 > var4) {
                    int[] var7 = this.field1365[var4];
                    if (~var4 < -1) {
                        int[] var8 = this.field1365[var4 + -1];
                        int var9 = (-var8[0] + var5 << 12) / (var7[0] + -var8[0]);
                        int var10 = -var9 + 4096;
                        var11 = var7[3] * var9 + var8[3] * var10 >> 12;
                        var12 = var7[2] * var9 + var8[2] * var10 >> 12;
                        var13 = var7[1] * var9 + var8[1] * var10 >> 12;
                    } else {
                        var12 = var7[2];
                        var13 = var7[1];
                        var11 = var7[3];
                    }
                } else {
                    int[] var14 = this.field1365[var2 + -1];
                    var13 = var14[1];
                    var11 = var14[3];
                    var12 = var14[2];
                }
                int var15 = var11 >> 4;
                int var16 = var13 >> 4;
                int var17 = var12 >> 4;
                if (var17 >= 0) {
                    if (var17 > 255) {
                        var17 = 255;
                    }
                } else {
                    var17 = 0;
                }
                if (var16 >= 0) {
                    if (~var16 < -256) {
                        var16 = 255;
                    }
                } else {
                    var16 = 0;
                }
                if (~var15 > -1) {
                    var15 = 0;
                } else if (var15 > 255) {
                    var15 = 255;
                }
                this.field1369[var3] = class42.method223(class42.method223(var16 << 16, var17 << 8), var15);
            }
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(B)V")
    public static final void method638(byte arg0) {
        ++field1364;
        int var1 = -81 / ((arg0 - 25) / 41);
        class486.field6798 = new class193();
    }

    @OriginalMember(owner = "client!hw", name = "c", descriptor = "(B)V")
    public static void method639(byte arg0) {
        field1367 = null;
        if (arg0 != 114) {
            method643(false);
        }
    }

    @OriginalMember(owner = "client!hw", name = "c", descriptor = "(I)V")
    public final void method438(int arg0) {
        if (this.field1365 == null) {
            this.method642(1, -122);
        }
        ++field1355;
        if (arg0 != -2) {
            field1356 = 117;
        }
        this.method637(false);
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIZLmca;Lmca;)I")
    public static final int method640(int arg0, int arg1, boolean arg2, class29 arg3, class29 arg4) {
        ++field1368;
        if (arg1 == 1) {
            int var5 = arg3.field134;
            int var6 = arg4.field134;
            if (!arg2) {
                if (~var6 == 0) {
                    var6 = 2001;
                }
                if (~var5 == 0) {
                    var5 = 2001;
                }
            }
            return var5 - var6;
        } else if (~arg1 == -3) {
            return class114.method680(true, arg3.method162(-19323).field5823, arg4.method162(-19323).field5823, class31.field247);
        } else if (arg1 == 3) {
            if (!arg3.field197.equals("-")) {
                if (arg4.field197.equals("-")) {
                    return !arg2 ? -1 : 1;
                } else {
                    return class114.method680(true, arg3.field197, arg4.field197, class31.field247);
                }
            } else if (arg4.field197.equals("-")) {
                return 0;
            } else {
                return arg2 ? -1 : 1;
            }
        } else if (arg1 == 4) {
            if (!arg3.method133(0)) {
                return !arg4.method133(0) ? 0 : -1;
            } else {
                return !arg4.method133(0) ? 1 : 0;
            }
        } else if (~arg1 == -6) {
            if (!arg3.method128(false)) {
                return arg4.method128(false) ? -1 : 0;
            } else {
                return arg4.method128(false) ? 0 : 1;
            }
        } else if (~arg1 == -7) {
            if (!arg3.method129((byte) 34)) {
                return !arg4.method129((byte) 34) ? 0 : -1;
            } else {
                return !arg4.method129((byte) 34) ? 1 : 0;
            }
        } else {
            if (arg0 != -14653) {
                method640(122, -113, false, (class29) null, (class29) null);
            }
            if (arg1 == 7) {
                if (!arg3.method126(-1)) {
                    return !arg4.method126(arg0 ^ 14652) ? 0 : -1;
                } else {
                    return arg4.method126(-1) ? 0 : 1;
                }
            } else if (~arg1 == -9) {
                int var7 = arg3.field198;
                int var8 = arg4.field198;
                if (!arg2) {
                    if (~var7 == 0) {
                        var7 = 1000;
                    }
                    if (~var8 == 0) {
                        var8 = 1000;
                    }
                } else {
                    if (~var8 == -1001) {
                        var8 = -1;
                    }
                    if (var7 == 1000) {
                        var7 = -1;
                    }
                }
                return -var8 + var7;
            } else {
                return arg3.field196 - arg4.field196;
            }
        }
    }

    @OriginalMember(owner = "client!hw", name = "e", descriptor = "(III)V")
    public static final void method641(int arg0, int arg1, int arg2) {
        ++field1359;
        if (!(class353.field4602 < class353.field4605)) {
            if (class353.field4605 < class353.field4602) {
                class353.field4602 = (float) ((double) class353.field4602 - (double) class353.field4602 / 30.0D);
                if (class353.field4602 < class353.field4605) {
                    class353.field4602 = class353.field4605;
                }
                class182.method999((byte) 23);
                class353.field4601 = (int) class353.field4602 >> 1;
                class353.field4603 = class218.method1256(class353.field4601, (byte) -102);
            }
        } else {
            class353.field4602 = (float) ((double) class353.field4602 / 30.0D + (double) class353.field4602);
            if (class353.field4605 < class353.field4602) {
                class353.field4602 = class353.field4605;
            }
            class182.method999((byte) 84);
            class353.field4601 = (int) class353.field4602 >> 1;
            class353.field4603 = class218.method1256(class353.field4601, (byte) -102);
        }
        if (arg0 != -19850) {
            method643(true);
        }
        if (~class43.field353 != 0 && class62.field619 != -1) {
            int var3 = -class619.field8945 + class43.field353;
            if (var3 < 2 || var3 > 2) {
                var3 /= 8;
            }
            int var4 = -class34.field273 + class62.field619;
            class619.field8945 += var3;
            if (~var4 > -3 || ~var4 < -3) {
                var4 /= 8;
            }
            class34.field273 -= -var4;
            if (~var3 == -1 && ~var4 == -1) {
                class43.field353 = -1;
                class62.field619 = -1;
            }
            class182.method999((byte) 84);
        }
        if (~class289.field3752 >= -1) {
            class45.field389 = -1;
            class314.field4009 = -1;
        } else {
            --class382.field5054;
            if (class382.field5054 == 0) {
                --class289.field3752;
                class382.field5054 = 100;
            }
        }
        if (class570.field8372 && class22.field146 != null) {
            for (class261 var5 = (class261) class22.field146.method1050((byte) 73); var5 != null; var5 = (class261) class22.field146.method1047(-7962)) {
                class107 var6 = class353.field4587.method3245((byte) -119, var5.field3373.field3313);
                if (var5.method1465(arg1, -60, arg2)) {
                    if (var6.field1323 != null) {
                        if (var6.field1323[4] != null) {
                            class22.method139(1007, true, 0, (byte) 65, -1, var6.field1333, var6.field1314, var6.field1323[4], (long) var5.field3373.field3313, false, -1);
                        }
                        if (var6.field1323[3] != null) {
                            class22.method139(1001, true, 0, (byte) 65, -1, var6.field1333, var6.field1314, var6.field1323[3], (long) var5.field3373.field3313, false, -1);
                        }
                        if (var6.field1323[2] != null) {
                            class22.method139(1004, true, 0, (byte) 65, -1, var6.field1333, var6.field1314, var6.field1323[2], (long) var5.field3373.field3313, false, -1);
                        }
                        if (var6.field1323[1] != null) {
                            class22.method139(1006, true, 0, (byte) 65, -1, var6.field1333, var6.field1314, var6.field1323[1], (long) var5.field3373.field3313, false, -1);
                        }
                        if (var6.field1323[0] != null) {
                            class22.method139(1003, true, 0, (byte) 65, -1, var6.field1333, var6.field1314, var6.field1323[0], (long) var5.field3373.field3313, false, -1);
                        }
                    }
                    if (!var5.field3373.field3316) {
                        var5.field3373.field3316 = true;
                        class630.method3617(class612.field8882, var5.field3373.field3313, var6.field1333);
                    }
                    if (var5.field3373.field3316) {
                        class630.method3617(class117.field1475, var5.field3373.field3313, var6.field1333);
                    }
                } else if (var5.field3373.field3316) {
                    var5.field3373.field3316 = false;
                    class630.method3617(class157.field1914, var5.field3373.field3313, var6.field1333);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "(II)[[I")
    public final int[][] method481(int arg0, int arg1) {
        ++field1363;
        if (arg0 != 1000) {
            method641(125, -108, 56);
        }
        int[][] var3 = super.field992.method3178(arg1, 0);
        if (super.field992.field7962) {
            int[] var4 = this.method489(false, 0, arg1);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; ~class629.field9033 < ~var8; ++var8) {
                int var9 = var4[var8] >> 4;
                if (~var9 > -1) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field1369[var9];
                var5[var8] = class288.method1624(4080, var10 >> 12);
                var6[var8] = class288.method1624(var10, 65280) >> 4;
                var7[var8] = class288.method1624(255, var10) << 4;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hw", name = "d", descriptor = "(II)V")
    private final void method642(int arg0, int arg1) {
        ++field1357;
        int var3 = -60 % ((arg1 - -39) / 62);
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (arg0 == 6) {
                                    this.field1365 = new int[4][4];
                                    this.field1365[0][1] = 0;
                                    this.field1365[0][2] = 4096;
                                    this.field1365[0][0] = 2048;
                                    this.field1365[0][3] = 0;
                                    this.field1365[1][0] = 2867;
                                    this.field1365[1][2] = 4096;
                                    this.field1365[1][1] = 4096;
                                    this.field1365[1][3] = 0;
                                    this.field1365[2][3] = 0;
                                    this.field1365[2][1] = 4096;
                                    this.field1365[2][2] = 4096;
                                    this.field1365[2][0] = 3276;
                                    this.field1365[3][0] = 4096;
                                    this.field1365[3][3] = 0;
                                    this.field1365[3][2] = 0;
                                    this.field1365[3][1] = 4096;
                                } else {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                            } else {
                                this.field1365 = new int[16][4];
                                this.field1365[0][2] = 192;
                                this.field1365[0][3] = 321;
                                this.field1365[0][1] = 80;
                                this.field1365[0][0] = 0;
                                this.field1365[1][3] = 562;
                                this.field1365[1][2] = 449;
                                this.field1365[1][0] = 155;
                                this.field1365[1][1] = 321;
                                this.field1365[2][1] = 578;
                                this.field1365[2][3] = 803;
                                this.field1365[2][2] = 690;
                                this.field1365[2][0] = 389;
                                this.field1365[3][0] = 671;
                                this.field1365[3][1] = 947;
                                this.field1365[3][3] = 1140;
                                this.field1365[3][2] = 995;
                                this.field1365[4][1] = 1285;
                                this.field1365[4][2] = 1397;
                                this.field1365[4][0] = 897;
                                this.field1365[4][3] = 1509;
                                this.field1365[5][1] = 1525;
                                this.field1365[5][0] = 1175;
                                this.field1365[5][3] = 1413;
                                this.field1365[5][2] = 1429;
                                this.field1365[6][0] = 1368;
                                this.field1365[6][1] = 1734;
                                this.field1365[6][3] = 1333;
                                this.field1365[6][2] = 1461;
                                this.field1365[7][3] = 1702;
                                this.field1365[7][1] = 1413;
                                this.field1365[7][2] = 1525;
                                this.field1365[7][0] = 1507;
                                this.field1365[8][3] = 2056;
                                this.field1365[8][2] = 1590;
                                this.field1365[8][1] = 1108;
                                this.field1365[8][0] = 1736;
                                this.field1365[9][0] = 2088;
                                this.field1365[9][1] = 1766;
                                this.field1365[9][2] = 2056;
                                this.field1365[9][3] = 2666;
                                this.field1365[10][1] = 2409;
                                this.field1365[10][3] = 3276;
                                this.field1365[10][2] = 2586;
                                this.field1365[10][0] = 2355;
                                this.field1365[11][3] = 3228;
                                this.field1365[11][0] = 2691;
                                this.field1365[11][2] = 3148;
                                this.field1365[11][1] = 3116;
                                this.field1365[12][3] = 3196;
                                this.field1365[12][0] = 3031;
                                this.field1365[12][2] = 3710;
                                this.field1365[12][1] = 3806;
                                this.field1365[13][0] = 3522;
                                this.field1365[13][1] = 3437;
                                this.field1365[13][3] = 3019;
                                this.field1365[13][2] = 3421;
                                this.field1365[14][0] = 3727;
                                this.field1365[14][3] = 3228;
                                this.field1365[14][2] = 3148;
                                this.field1365[14][1] = 3116;
                                this.field1365[15][1] = 2377;
                                this.field1365[15][0] = 4096;
                                this.field1365[15][2] = 2505;
                                this.field1365[15][3] = 2746;
                            }
                        } else {
                            this.field1365 = new int[6][4];
                            this.field1365[0][0] = 0;
                            this.field1365[0][2] = 0;
                            this.field1365[0][1] = 0;
                            this.field1365[0][3] = 0;
                            this.field1365[1][3] = 1493;
                            this.field1365[1][1] = 0;
                            this.field1365[1][2] = 0;
                            this.field1365[1][0] = 1843;
                            this.field1365[2][3] = 2939;
                            this.field1365[2][2] = 0;
                            this.field1365[2][1] = 0;
                            this.field1365[2][0] = 2457;
                            this.field1365[3][2] = 1124;
                            this.field1365[3][1] = 0;
                            this.field1365[3][0] = 2781;
                            this.field1365[3][3] = 3565;
                            this.field1365[4][3] = 4031;
                            this.field1365[4][2] = 3084;
                            this.field1365[4][1] = 546;
                            this.field1365[4][0] = 3481;
                            this.field1365[5][2] = 4096;
                            this.field1365[5][0] = 4096;
                            this.field1365[5][3] = 4096;
                            this.field1365[5][1] = 4096;
                        }
                    } else {
                        this.field1365 = new int[7][4];
                        this.field1365[0][1] = 0;
                        this.field1365[0][2] = 0;
                        this.field1365[0][3] = 4096;
                        this.field1365[0][0] = 0;
                        this.field1365[1][1] = 0;
                        this.field1365[1][3] = 4096;
                        this.field1365[1][0] = 663;
                        this.field1365[1][2] = 4096;
                        this.field1365[2][1] = 0;
                        this.field1365[2][0] = 1363;
                        this.field1365[2][2] = 4096;
                        this.field1365[2][3] = 0;
                        this.field1365[3][2] = 4096;
                        this.field1365[3][3] = 0;
                        this.field1365[3][1] = 4096;
                        this.field1365[3][0] = 2048;
                        this.field1365[4][0] = 2727;
                        this.field1365[4][3] = 0;
                        this.field1365[4][2] = 0;
                        this.field1365[4][1] = 4096;
                        this.field1365[5][1] = 4096;
                        this.field1365[5][3] = 4096;
                        this.field1365[5][0] = 3411;
                        this.field1365[5][2] = 0;
                        this.field1365[6][1] = 0;
                        this.field1365[6][2] = 0;
                        this.field1365[6][0] = 4096;
                        this.field1365[6][3] = 4096;
                    }
                } else {
                    this.field1365 = new int[8][4];
                    this.field1365[0][1] = 2650;
                    this.field1365[0][2] = 2602;
                    this.field1365[0][0] = 0;
                    this.field1365[0][3] = 2361;
                    this.field1365[1][0] = 2867;
                    this.field1365[1][3] = 1558;
                    this.field1365[1][2] = 1799;
                    this.field1365[1][1] = 2313;
                    this.field1365[2][1] = 2618;
                    this.field1365[2][0] = 3072;
                    this.field1365[2][3] = 1413;
                    this.field1365[2][2] = 1734;
                    this.field1365[3][1] = 2296;
                    this.field1365[3][3] = 947;
                    this.field1365[3][2] = 1220;
                    this.field1365[3][0] = 3276;
                    this.field1365[4][0] = 3481;
                    this.field1365[4][2] = 963;
                    this.field1365[4][3] = 722;
                    this.field1365[4][1] = 2072;
                    this.field1365[5][2] = 2152;
                    this.field1365[5][1] = 2730;
                    this.field1365[5][3] = 1766;
                    this.field1365[5][0] = 3686;
                    this.field1365[6][1] = 2232;
                    this.field1365[6][0] = 3891;
                    this.field1365[6][2] = 1060;
                    this.field1365[6][3] = 915;
                    this.field1365[7][1] = 1686;
                    this.field1365[7][2] = 1413;
                    this.field1365[7][3] = 1140;
                    this.field1365[7][0] = 4096;
                }
            } else {
                this.field1365 = new int[2][4];
                this.field1365[0][3] = 0;
                this.field1365[0][0] = 0;
                this.field1365[0][1] = 0;
                this.field1365[0][2] = 0;
                this.field1365[1][1] = 4096;
                this.field1365[1][0] = 4096;
                this.field1365[1][2] = 4096;
                this.field1365[1][3] = 4096;
            }
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(IILos;)V")
    public final void method198(int arg0, int arg1, class374 arg2) {
        if (~arg0 == -1) {
            int var4 = arg2.method2129(-93);
            if (var4 == 0) {
                this.field1365 = new int[arg2.method2129(-66)][4];
                for (int var5 = 0; this.field1365.length > var5; ++var5) {
                    this.field1365[var5][0] = arg2.method2136(false);
                    this.field1365[var5][1] = arg2.method2129(-118) << 4;
                    this.field1365[var5][2] = arg2.method2129(-78) << 4;
                    this.field1365[var5][3] = arg2.method2129(-124) << 4;
                }
            } else {
                this.method642(var4, -128);
            }
        }
        int var6 = -104 / ((arg1 - -69) / 42);
        ++field1362;
    }

    @OriginalMember(owner = "client!hw", name = "c", descriptor = "(Z)V")
    public static final void method643(boolean arg0) {
        ++field1358;
        if (arg0) {
            field1361 = -123;
        }
        for (int var1 = 0; ~class570.field8370 < ~var1; ++var1) {
            class114 var2 = class250.field3228[var1];
            if (var2.field1415 == 2) {
                if (var2.field1424 == null) {
                    var2.field1419 = Integer.MIN_VALUE;
                } else {
                    class534.field7500.method803(var2.field1424);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hw", name = "<init>", descriptor = "()V")
    public class110() {
        super(1, false);
    }
}
