import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class3 extends class105 {

    @OriginalMember(owner = "client!ab", name = "Z", descriptor = "Leh;")
    private static class47 field30 = class195.method1282((byte) -4, "slide:");

    @OriginalMember(owner = "client!ab", name = "gb", descriptor = "Leh;")
    private static class47 field37 = class195.method1282((byte) -4, "skill)2");

    @OriginalMember(owner = "client!ab", name = "hb", descriptor = "Leh;")
    public static class47 field38 = class195.method1282((byte) -4, "logo");

    @OriginalMember(owner = "client!ab", name = "ib", descriptor = "I")
    public static int field39 = 0;

    @OriginalMember(owner = "client!ab", name = "kb", descriptor = "Leh;")
    public static class47 field41 = field30;

    @OriginalMember(owner = "client!ab", name = "ab", descriptor = "Leh;")
    public static class47 field31 = field37;

    @OriginalMember(owner = "client!ab", name = "jb", descriptor = "Leh;")
    public static class47 field40 = field30;

    @OriginalMember(owner = "client!ab", name = "Y", descriptor = "I")
    public static int field29 = 0;

    @OriginalMember(owner = "client!ab", name = "pb", descriptor = "Leh;")
    public static class47 field46 = class195.method1282((byte) -4, "mod_icons");

    @OriginalMember(owner = "client!ab", name = "db", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!ab", name = "eb", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!ab", name = "fb", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!ab", name = "lb", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!ab", name = "mb", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!ab", name = "nb", descriptor = "Luc;")
    public static class183 field44;

    @OriginalMember(owner = "client!ab", name = "ob", descriptor = "Lfd;")
    public static class52 field45;

    @OriginalMember(owner = "client!ab", name = "bb", descriptor = "[I")
    public static int[] field32;

    @OriginalMember(owner = "client!ab", name = "qb", descriptor = "[I")
    public static int[] field47;

    @OriginalMember(owner = "client!ab", name = "cb", descriptor = "[[I")
    private int[][] field33;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "(I)V")
    public final void method13(int arg0) {
        if (this.field33 == null) {
            this.method18(1, 2745);
        }
        if (arg0 != -1) {
            field37 = null;
        }
        ++field34;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIII)Z")
    public static final boolean method14(int arg0, int arg1, int arg2, int arg3) {
        if (!class108.method873(arg0, arg1, arg2)) {
            return false;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            int var6 = class41.field821[arg0][arg1][arg2] - 1;
            int var7 = var6 - 120;
            int var8 = var6 - 230;
            int var9 = var6 - 238;
            if (arg3 < 16) {
                if (arg3 == 1) {
                    if (var4 > class40.field790) {
                        if (!class40.method338(var4, var6, var5)) {
                            return false;
                        }
                        if (!class40.method338(var4, var6, var5 + 128)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!class40.method338(var4, var7, var5)) {
                            return false;
                        }
                        if (!class40.method338(var4, var7, var5 + 128)) {
                            return false;
                        }
                    }
                    if (!class40.method338(var4, var8, var5)) {
                        return false;
                    }
                    if (!class40.method338(var4, var8, var5 + 128)) {
                        return false;
                    }
                    return true;
                }
                if (arg3 == 2) {
                    if (var5 < class87.field1866) {
                        if (!class40.method338(var4, var6, var5 + 128)) {
                            return false;
                        }
                        if (!class40.method338(var4 + 128, var6, var5 + 128)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!class40.method338(var4, var7, var5 + 128)) {
                            return false;
                        }
                        if (!class40.method338(var4 + 128, var7, var5 + 128)) {
                            return false;
                        }
                    }
                    if (!class40.method338(var4, var8, var5 + 128)) {
                        return false;
                    }
                    if (!class40.method338(var4 + 128, var8, var5 + 128)) {
                        return false;
                    }
                    return true;
                }
                if (arg3 == 4) {
                    if (var4 < class40.field790) {
                        if (!class40.method338(var4 + 128, var6, var5)) {
                            return false;
                        }
                        if (!class40.method338(var4 + 128, var6, var5 + 128)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!class40.method338(var4 + 128, var7, var5)) {
                            return false;
                        }
                        if (!class40.method338(var4 + 128, var7, var5 + 128)) {
                            return false;
                        }
                    }
                    if (!class40.method338(var4 + 128, var8, var5)) {
                        return false;
                    }
                    if (!class40.method338(var4 + 128, var8, var5 + 128)) {
                        return false;
                    }
                    return true;
                }
                if (arg3 == 8) {
                    if (var5 > class87.field1866) {
                        if (!class40.method338(var4, var6, var5)) {
                            return false;
                        }
                        if (!class40.method338(var4 + 128, var6, var5)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!class40.method338(var4, var7, var5)) {
                            return false;
                        }
                        if (!class40.method338(var4 + 128, var7, var5)) {
                            return false;
                        }
                    }
                    if (!class40.method338(var4, var8, var5)) {
                        return false;
                    }
                    if (!class40.method338(var4 + 128, var8, var5)) {
                        return false;
                    }
                    return true;
                }
            }
            if (!class40.method338(var4 + 64, var9, var5 + 64)) {
                return false;
            } else if (arg3 == 16) {
                return class40.method338(var4, var8, var5 + 128);
            } else if (arg3 == 32) {
                return class40.method338(var4 + 128, var8, var5 + 128);
            } else if (arg3 == 64) {
                return class40.method338(var4 + 128, var8, var5);
            } else if (arg3 == 128) {
                return class40.method338(var4, var8, var5);
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method15(int arg0, boolean arg1) {
        ++field43;
        if (!arg1) {
            method16((byte) -119);
        }
        int[][] var3 = super.field2186.method10(arg0, (byte) 51);
        if (super.field2186.field28) {
            int var4 = this.field33.length;
            int[] var5 = this.method851(0, true, arg0);
            int[] var6 = var3[2];
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            if (var4 <= 0) {
                for (int var9 = 0; var9 < class149.field2928; ++var9) {
                    var7[var9] = 0;
                    var8[var9] = 0;
                    var6[var9] = 0;
                }
            } else {
                for (int var10 = 0; ~var10 > ~class149.field2928; ++var10) {
                    int var11 = var5[var10];
                    int var12 = 0;
                    for (int var13 = 0; var13 < var4 && this.field33[var13][0] <= var11; ++var13) {
                        ++var12;
                    }
                    if (~var12 > ~var4) {
                        int[] var14 = this.field33[var12];
                        if (var12 > 0) {
                            int[] var15 = this.field33[var12 + -1];
                            int var16 = (-var15[0] + var11 << 12) / (var14[0] + -var15[0]);
                            int var17 = -var16 + 4096;
                            var7[var10] = var14[1] * var16 + var15[1] * var17 >> 12;
                            var8[var10] = var14[2] * var16 + var15[2] * var17 >> 12;
                            var6[var10] = var14[3] * var16 + var15[3] * var17 >> 12;
                        } else {
                            var7[var10] = var14[1];
                            var8[var10] = var14[2];
                            var6[var10] = var14[3];
                        }
                    } else {
                        int[] var18 = this.field33[var4 + -1];
                        var7[var10] = var18[1];
                        var8[var10] = var18[2];
                        var6[var10] = var18[3];
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(B)V")
    public static void method16(byte arg0) {
        field30 = null;
        field47 = null;
        field37 = null;
        field44 = null;
        if (arg0 != -2) {
            method14(123, 24, -101, 26);
        }
        field38 = null;
        field45 = null;
        field41 = null;
        field40 = null;
        field46 = null;
        field32 = null;
        field31 = null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILhd;I)V")
    public final void method17(int arg0, class68 arg1, int arg2) {
        if (arg0 == 0) {
            int var4 = arg1.method604((byte) -127);
            if (~var4 == -1) {
                this.field33 = new int[arg1.method604((byte) -127)][4];
                for (int var5 = 0; this.field33.length > var5; ++var5) {
                    this.field33[var5][0] = arg1.method569(26496);
                    this.field33[var5][1] = arg1.method604((byte) -128) << 4;
                    this.field33[var5][2] = arg1.method604((byte) -128) << 4;
                    this.field33[var5][3] = arg1.method604((byte) -127) << 4;
                }
            } else {
                this.method18(var4, arg2 + 3001);
            }
        }
        if (arg2 == -256) {
            ++field42;
        }
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V")
    public class3() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)V")
    private final void method18(int arg0, int arg1) {
        ++field35;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (arg0 != 6) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field33 = new int[4][4];
                                this.field33[0][3] = 0;
                                this.field33[0][2] = 4096;
                                this.field33[0][0] = 2048;
                                this.field33[1][0] = 2867;
                                this.field33[0][1] = 0;
                                this.field33[1][1] = 4096;
                                this.field33[1][3] = 0;
                                this.field33[1][2] = 4096;
                                this.field33[2][0] = 3276;
                                this.field33[2][1] = 4096;
                                this.field33[3][1] = 4096;
                                this.field33[2][2] = 4096;
                                this.field33[2][3] = 0;
                                this.field33[3][2] = 0;
                                this.field33[3][3] = 0;
                                this.field33[3][0] = 4096;
                            } else {
                                this.field33 = new int[16][4];
                                this.field33[0][3] = 321;
                                this.field33[0][1] = 80;
                                this.field33[1][3] = 562;
                                this.field33[1][1] = 321;
                                this.field33[0][0] = 0;
                                this.field33[0][2] = 192;
                                this.field33[2][1] = 578;
                                this.field33[1][2] = 449;
                                this.field33[2][2] = 690;
                                this.field33[1][0] = 155;
                                this.field33[3][1] = 947;
                                this.field33[3][2] = 995;
                                this.field33[4][2] = 1397;
                                this.field33[2][3] = 803;
                                this.field33[3][3] = 1140;
                                this.field33[4][3] = 1509;
                                this.field33[5][3] = 1413;
                                this.field33[6][3] = 1333;
                                this.field33[7][3] = 1702;
                                this.field33[2][0] = 389;
                                this.field33[4][1] = 1285;
                                this.field33[5][2] = 1429;
                                this.field33[5][1] = 1525;
                                this.field33[6][2] = 1461;
                                this.field33[7][2] = 1525;
                                this.field33[6][1] = 1734;
                                this.field33[8][2] = 1590;
                                this.field33[8][3] = 2056;
                                this.field33[9][2] = 2056;
                                this.field33[10][2] = 2586;
                                this.field33[7][1] = 1413;
                                this.field33[11][2] = 3148;
                                this.field33[3][0] = 671;
                                this.field33[8][1] = 1108;
                                this.field33[4][0] = 897;
                                this.field33[9][3] = 2666;
                                this.field33[10][3] = 3276;
                                this.field33[9][1] = 1766;
                                this.field33[12][2] = 3710;
                                this.field33[13][2] = 3421;
                                this.field33[5][0] = 1175;
                                this.field33[10][1] = 2409;
                                this.field33[11][1] = 3116;
                                this.field33[11][3] = 3228;
                                this.field33[12][3] = 3196;
                                this.field33[13][3] = 3019;
                                this.field33[6][0] = 1368;
                                this.field33[14][3] = 3228;
                                this.field33[12][1] = 3806;
                                this.field33[14][2] = 3148;
                                this.field33[15][3] = 2746;
                                this.field33[7][0] = 1507;
                                this.field33[15][2] = 2505;
                                this.field33[8][0] = 1736;
                                this.field33[9][0] = 2088;
                                this.field33[10][0] = 2355;
                                this.field33[13][1] = 3437;
                                this.field33[11][0] = 2691;
                                this.field33[12][0] = 3031;
                                this.field33[14][1] = 3116;
                                this.field33[13][0] = 3522;
                                this.field33[14][0] = 3727;
                                this.field33[15][1] = 2377;
                                this.field33[15][0] = 4096;
                            }
                        } else {
                            this.field33 = new int[6][4];
                            this.field33[0][3] = 0;
                            this.field33[1][3] = 1493;
                            this.field33[0][0] = 0;
                            this.field33[2][3] = 2939;
                            this.field33[3][3] = 3565;
                            this.field33[4][3] = 4031;
                            this.field33[1][0] = 1843;
                            this.field33[5][3] = 4096;
                            this.field33[0][2] = 0;
                            this.field33[0][1] = 0;
                            this.field33[1][1] = 0;
                            this.field33[2][0] = 2457;
                            this.field33[1][2] = 0;
                            this.field33[2][1] = 0;
                            this.field33[3][0] = 2781;
                            this.field33[2][2] = 0;
                            this.field33[3][2] = 1124;
                            this.field33[3][1] = 0;
                            this.field33[4][1] = 546;
                            this.field33[4][0] = 3481;
                            this.field33[5][0] = 4096;
                            this.field33[5][1] = 4096;
                            this.field33[4][2] = 3084;
                            this.field33[5][2] = 4096;
                        }
                    } else {
                        this.field33 = new int[7][4];
                        this.field33[0][0] = 0;
                        this.field33[0][2] = 0;
                        this.field33[0][1] = 0;
                        this.field33[1][2] = 4096;
                        this.field33[1][0] = 663;
                        this.field33[0][3] = 4096;
                        this.field33[1][3] = 4096;
                        this.field33[2][2] = 4096;
                        this.field33[1][1] = 0;
                        this.field33[3][2] = 4096;
                        this.field33[4][2] = 0;
                        this.field33[2][1] = 0;
                        this.field33[3][1] = 4096;
                        this.field33[2][3] = 0;
                        this.field33[4][1] = 4096;
                        this.field33[5][2] = 0;
                        this.field33[2][0] = 1363;
                        this.field33[6][2] = 0;
                        this.field33[5][1] = 4096;
                        this.field33[3][3] = 0;
                        this.field33[4][3] = 0;
                        this.field33[6][1] = 0;
                        this.field33[3][0] = 2048;
                        this.field33[5][3] = 4096;
                        this.field33[6][3] = 4096;
                        this.field33[4][0] = 2727;
                        this.field33[5][0] = 3411;
                        this.field33[6][0] = 4096;
                    }
                } else {
                    this.field33 = new int[8][4];
                    this.field33[0][3] = 2361;
                    this.field33[0][0] = 0;
                    this.field33[1][0] = 2867;
                    this.field33[0][2] = 2602;
                    this.field33[2][0] = 3072;
                    this.field33[1][2] = 1799;
                    this.field33[2][2] = 1734;
                    this.field33[3][0] = 3276;
                    this.field33[1][3] = 1558;
                    this.field33[4][0] = 3481;
                    this.field33[0][1] = 2650;
                    this.field33[5][0] = 3686;
                    this.field33[1][1] = 2313;
                    this.field33[6][0] = 3891;
                    this.field33[2][1] = 2618;
                    this.field33[2][3] = 1413;
                    this.field33[7][0] = 4096;
                    this.field33[3][3] = 947;
                    this.field33[3][1] = 2296;
                    this.field33[4][3] = 722;
                    this.field33[4][1] = 2072;
                    this.field33[5][3] = 1766;
                    this.field33[5][1] = 2730;
                    this.field33[6][1] = 2232;
                    this.field33[7][1] = 1686;
                    this.field33[6][3] = 915;
                    this.field33[3][2] = 1220;
                    this.field33[4][2] = 963;
                    this.field33[7][3] = 1140;
                    this.field33[5][2] = 2152;
                    this.field33[6][2] = 1060;
                    this.field33[7][2] = 1413;
                }
            } else {
                this.field33 = new int[2][4];
                this.field33[0][0] = 0;
                this.field33[0][1] = 0;
                this.field33[1][1] = 4096;
                this.field33[0][3] = 0;
                this.field33[1][3] = 4096;
                this.field33[1][0] = 4096;
                this.field33[0][2] = 0;
                this.field33[1][2] = 4096;
            }
        }
        if (arg1 != 2745) {
            method14(32, 22, -61, -11);
        }
    }
}
