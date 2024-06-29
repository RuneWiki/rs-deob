import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class408 extends class436 {

    @OriginalMember(owner = "client!bs", name = "L", descriptor = "I")
    private int field5925 = 0;

    @OriginalMember(owner = "client!bs", name = "T", descriptor = "I")
    private int field5933 = 10;

    @OriginalMember(owner = "client!bs", name = "X", descriptor = "I")
    private int field5937 = 2048;

    @OriginalMember(owner = "client!bs", name = "N", descriptor = "I")
    public static volatile int field5927 = -1;

    @OriginalMember(owner = "client!bs", name = "U", descriptor = "[I")
    public static int[] field5934 = new int[1000];

    @OriginalMember(owner = "client!bs", name = "H", descriptor = "I")
    public static int field5921;

    @OriginalMember(owner = "client!bs", name = "K", descriptor = "I")
    public static int field5924;

    @OriginalMember(owner = "client!bs", name = "M", descriptor = "I")
    public static int field5926;

    @OriginalMember(owner = "client!bs", name = "O", descriptor = "I")
    public static int field5928;

    @OriginalMember(owner = "client!bs", name = "P", descriptor = "I")
    public static int field5929;

    @OriginalMember(owner = "client!bs", name = "Q", descriptor = "I")
    public static int field5930;

    @OriginalMember(owner = "client!bs", name = "R", descriptor = "I")
    public static int field5931;

    @OriginalMember(owner = "client!bs", name = "S", descriptor = "I")
    public static int field5932;

    @OriginalMember(owner = "client!bs", name = "V", descriptor = "I")
    public static int field5935;

    @OriginalMember(owner = "client!bs", name = "G", descriptor = "Laa;")
    public static class281 field5920;

    @OriginalMember(owner = "client!bs", name = "J", descriptor = "Lqj;")
    public static class296 field5923;

    @OriginalMember(owner = "client!bs", name = "I", descriptor = "[I")
    private int[] field5922;

    @OriginalMember(owner = "client!bs", name = "W", descriptor = "[I")
    private int[] field5936;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Laj;IIILto;[[B[[BLaa;IIII[[B[Z)V")
    public static final void method2615(class170 arg0, int arg1, int arg2, int arg3, class6 arg4, byte[][] arg5, byte[][] arg6, class281 arg7, int arg8, int arg9, int arg10, int arg11, byte[][] arg12, boolean[] arg13) {
        ++field5926;
        if (arg4 != null && arg0 != null || arg0 != null && arg3 == 12 || arg4 != null && arg3 == 0) {
            boolean[] var14 = arg4 != null && arg4.field96 ? class43.field658[arg3] : class358.field5041[arg3];
            if (arg1 > 0) {
                if (~arg10 < -1) {
                    int var15 = arg12[arg10 + -1][arg1 + -1] & 255;
                    if (var15 > 0) {
                        class6 var16 = class364.method2340(true, var15 + -1);
                        if (~var16.field107 != 0 && var16.field96) {
                            byte var17 = arg6[arg10 + -1][arg1 + -1];
                            int var18 = arg5[arg10 - 1][arg1 - 1] * 2 + 4 & 7;
                            int var19 = class438.method2750(arg7, (byte) -85, var16);
                            if (class230.field3087[var17][var18]) {
                                class383.field5461[0] = var16.field107;
                                class296.field4118[0] = var19;
                                class108.field1598[0] = !arg7.method1790() ? var16.field97 : var16.field103;
                                class127.field1791[0] = var16.field94;
                                class368.field5157[0] = var16.field104;
                                class43.field654[0] = 256;
                            }
                        }
                    }
                }
                if (~arg10 > ~(arg8 + -1)) {
                    int var20 = arg12[arg10 + 1][arg1 - 1] & 255;
                    if (var20 > 0) {
                        class6 var21 = class364.method2340(true, var20 + -1);
                        if (var21.field107 != -1 && var21.field96) {
                            byte var22 = arg6[arg10 - -1][arg1 - 1];
                            int var23 = arg5[arg10 + 1][arg1 + -1] * 2 + 6 & 7;
                            int var24 = class438.method2750(arg7, (byte) -85, var21);
                            if (class230.field3087[var22][var23]) {
                                class383.field5461[2] = var21.field107;
                                class296.field4118[2] = var24;
                                class108.field1598[2] = arg7.method1790() ? var21.field103 : var21.field97;
                                class127.field1791[2] = var21.field94;
                                class368.field5157[2] = var21.field104;
                                class43.field654[2] = 512;
                            }
                        }
                    }
                }
            }
            if (~(arg11 - 1) < ~arg1) {
                if (~arg10 < -1) {
                    int var25 = 255 & arg12[arg10 - 1][arg1 + 1];
                    if (var25 > 0) {
                        class6 var26 = class364.method2340(true, var25 + -1);
                        if (var26.field107 != -1 && var26.field96) {
                            byte var27 = arg6[arg10 + -1][arg1 + 1];
                            int var28 = 7 & arg5[arg10 + -1][arg1 - -1] * 2 + 2;
                            int var29 = class438.method2750(arg7, (byte) -85, var26);
                            if (class230.field3087[var27][var28]) {
                                class383.field5461[6] = var26.field107;
                                class296.field4118[6] = var29;
                                class108.field1598[6] = !arg7.method1790() ? var26.field97 : var26.field103;
                                class127.field1791[6] = var26.field94;
                                class368.field5157[6] = var26.field104;
                                class43.field654[6] = 64;
                            }
                        }
                    }
                }
                if (~arg10 > ~(arg8 + -1)) {
                    int var30 = arg12[arg10 + 1][arg1 + 1] & 255;
                    if (~var30 < -1) {
                        class6 var31 = class364.method2340(true, var30 - 1);
                        if (~var31.field107 != 0 && var31.field96) {
                            byte var32 = arg6[arg10 + 1][arg1 + 1];
                            int var33 = 7 & arg5[arg10 + 1][arg1 - -1] * 2;
                            int var34 = class438.method2750(arg7, (byte) -85, var31);
                            if (class230.field3087[var32][var33]) {
                                class383.field5461[4] = var31.field107;
                                class296.field4118[4] = var34;
                                class108.field1598[4] = arg7.method1790() ? var31.field103 : var31.field97;
                                class127.field1791[4] = var31.field94;
                                class368.field5157[4] = var31.field104;
                                class43.field654[4] = 128;
                            }
                        }
                    }
                }
            }
            if (arg1 > 0) {
                int var35 = 255 & arg12[arg10][arg1 + -1];
                if (~var35 < -1) {
                    class6 var36 = class364.method2340(true, var35 + -1);
                    if (var36.field107 != -1) {
                        byte var37 = arg6[arg10][arg1 + -1];
                        byte var38 = arg5[arg10][arg1 + -1];
                        if (!var36.field96) {
                            if (!var14[arg9 & 3]) {
                                arg13[0] = class358.field5041[var37][class318.method2028(var38 + 2, 3)];
                            }
                        } else {
                            int var39 = 2;
                            int var40 = var38 * 2 + 4;
                            int var41 = class438.method2750(arg7, (byte) -85, var36);
                            for (int var42 = 0; var42 < 3; ++var42) {
                                var40 &= 7;
                                var39 &= 7;
                                if (class230.field3087[var37][var40] && class368.field5157[var39] <= var36.field104) {
                                    class383.field5461[var39] = var36.field107;
                                    class296.field4118[var39] = var41;
                                    class108.field1598[var39] = !arg7.method1790() ? var36.field97 : var36.field103;
                                    class127.field1791[var39] = var36.field94;
                                    if (class368.field5157[var39] != var36.field104) {
                                        class43.field654[var39] = 32;
                                    } else {
                                        class43.field654[var39] = class311.method1970(class43.field654[var39], 32);
                                    }
                                    class368.field5157[var39] = var36.field104;
                                }
                                ++var40;
                                --var39;
                            }
                            if (!var14[3 & -(-arg9)]) {
                                arg13[0] = class43.field658[var37][class318.method2028(3, 2 - -var38)];
                            }
                        }
                    }
                }
            }
            if (~arg1 > ~(arg11 + -1)) {
                int var43 = 255 & arg12[arg10][arg1 + 1];
                if (var43 > 0) {
                    class6 var44 = class364.method2340(true, var43 - 1);
                    if (var44.field107 != -1) {
                        byte var45 = arg6[arg10][arg1 - -1];
                        byte var46 = arg5[arg10][arg1 + 1];
                        if (!var44.field96) {
                            if (!var14[arg9 + 2 & 3]) {
                                arg13[2] = class358.field5041[var45][class318.method2028(3, var46)];
                            }
                        } else {
                            int var47 = 4;
                            int var48 = var46 * 2 + 2;
                            int var49 = class438.method2750(arg7, (byte) -85, var44);
                            for (int var50 = 0; ~var50 > -4; ++var50) {
                                var48 &= 7;
                                var47 &= 7;
                                if (class230.field3087[var45][var48] && ~class368.field5157[var47] >= ~var44.field104) {
                                    class383.field5461[var47] = var44.field107;
                                    class296.field4118[var47] = var49;
                                    class108.field1598[var47] = !arg7.method1790() ? var44.field97 : var44.field103;
                                    class127.field1791[var47] = var44.field94;
                                    if (class368.field5157[var47] != var44.field104) {
                                        class43.field654[var47] = 16;
                                    } else {
                                        class43.field654[var47] = class311.method1970(class43.field654[var47], 16);
                                    }
                                    class368.field5157[var47] = var44.field104;
                                }
                                ++var47;
                                --var48;
                            }
                            if (!var14[3 & arg9 + 2]) {
                                arg13[2] = class43.field658[var45][class318.method2028(var46, 3)];
                            }
                        }
                    }
                }
            }
            if (~arg10 < -1) {
                int var51 = arg12[arg10 + -1][arg1] & 255;
                if (~var51 < -1) {
                    class6 var52 = class364.method2340(true, var51 + -1);
                    if (~var52.field107 != 0) {
                        byte var53 = arg6[arg10 + -1][arg1];
                        byte var54 = arg5[arg10 + -1][arg1];
                        if (!var52.field96) {
                            if (!var14[3 & arg9 + 3]) {
                                arg13[3] = class358.field5041[var53][class318.method2028(3, 1 - -var54)];
                            }
                        } else {
                            int var55 = 6;
                            int var56 = var54 * 2 + 4;
                            int var57 = class438.method2750(arg7, (byte) -85, var52);
                            for (int var58 = 0; ~var58 > -4; ++var58) {
                                var56 &= 7;
                                var55 &= 7;
                                if (class230.field3087[var53][var56] && var52.field104 >= class368.field5157[var55]) {
                                    class383.field5461[var55] = var52.field107;
                                    class296.field4118[var55] = var57;
                                    class108.field1598[var55] = !arg7.method1790() ? var52.field97 : var52.field103;
                                    class127.field1791[var55] = var52.field94;
                                    if (~class368.field5157[var55] == ~var52.field104) {
                                        class43.field654[var55] = class311.method1970(class43.field654[var55], 8);
                                    } else {
                                        class43.field654[var55] = 8;
                                    }
                                    class368.field5157[var55] = var52.field104;
                                }
                                --var56;
                                ++var55;
                            }
                            if (!var14[3 & arg9 + 3]) {
                                arg13[3] = class43.field658[var53][class318.method2028(var54 + 1, 3)];
                            }
                        }
                    }
                }
            }
            if (arg8 + -1 > arg10) {
                int var59 = arg12[arg10 + 1][arg1] & 255;
                if (var59 > 0) {
                    class6 var60 = class364.method2340(true, var59 + -1);
                    if (var60.field107 != -1) {
                        byte var61 = arg6[arg10 + 1][arg1];
                        byte var62 = arg5[arg10 + 1][arg1];
                        if (!var60.field96) {
                            if (!var14[3 & arg9 + 1]) {
                                arg13[1] = class358.field5041[var61][class318.method2028(3, var62 + 3)];
                            }
                        } else {
                            int var63 = 4;
                            int var64 = var62 * 2 + 6;
                            int var65 = class438.method2750(arg7, (byte) -85, var60);
                            for (int var66 = 0; ~var66 > -4; ++var66) {
                                var63 &= 7;
                                var64 &= 7;
                                if (class230.field3087[var61][var64] && class368.field5157[var63] <= var60.field104) {
                                    class383.field5461[var63] = var60.field107;
                                    class296.field4118[var63] = var65;
                                    class108.field1598[var63] = arg7.method1790() ? var60.field103 : var60.field97;
                                    class127.field1791[var63] = var60.field94;
                                    if (class368.field5157[var63] != var60.field104) {
                                        class43.field654[var63] = 4;
                                    } else {
                                        class43.field654[var63] = class311.method1970(class43.field654[var63], 4);
                                    }
                                    class368.field5157[var63] = var60.field104;
                                }
                                ++var64;
                                --var63;
                            }
                            if (!var14[1 - -arg9 & 3]) {
                                arg13[1] = class43.field658[var61][class318.method2028(var62 + 3, 3)];
                            }
                        }
                    }
                }
            }
        }
        if (arg2 <= -33) {
            if (arg4 != null) {
                int var67 = class438.method2750(arg7, (byte) -85, arg4);
                if (arg4.field96) {
                    for (int var68 = 0; var68 < 8; ++var68) {
                        int var69 = -(arg9 * 2) + var68 & 7;
                        if (class230.field3087[arg3][var68] && ~arg4.field104 <= ~class368.field5157[var69]) {
                            class383.field5461[var69] = arg4.field107;
                            class296.field4118[var69] = var67;
                            class108.field1598[var69] = !arg7.method1790() ? arg4.field97 : arg4.field103;
                            class127.field1791[var69] = arg4.field94;
                            if (class368.field5157[var69] == arg4.field104) {
                                class43.field654[var69] = class311.method1970(class43.field654[var69], 2);
                            } else {
                                class43.field654[var69] = 2;
                            }
                            class368.field5157[var69] = arg4.field104;
                        }
                    }
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method2616(String arg0, int arg1) {
        ++field5932;
        if (arg0 == null) {
            return null;
        } else {
            int var2 = 0;
            if (arg1 != -1) {
                return null;
            } else {
                int var3 = arg0.length();
                while (var3 > var2 && class115.method756(-1, arg0.charAt(var2))) {
                    ++var2;
                }
                while (~var2 > ~var3 && class115.method756(arg1, arg0.charAt(var3 + -1))) {
                    --var3;
                }
                int var4 = -var2 + var3;
                if (var4 >= 1 && ~var4 >= -13) {
                    StringBuffer var5 = new StringBuffer(var4);
                    for (int var6 = var2; var6 < var3; ++var6) {
                        char var7 = arg0.charAt(var6);
                        if (class326.method2053(var7, 0)) {
                            char var8 = class244.method1531(var7, true);
                            if (~var8 != -1) {
                                var5.append(var8);
                            }
                        }
                    }
                    if (var5.length() == 0) {
                        return null;
                    } else {
                        return var5.toString();
                    }
                } else {
                    return null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "(I)V")
    public final void method44(int arg0) {
        ++field5924;
        if (arg0 != -14) {
            this.field5922 = null;
        }
        this.method2619(-25);
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Z)V")
    public static void method2617(boolean arg0) {
        field5934 = null;
        if (arg0) {
            method2615((class170) null, -48, -127, 96, (class6) null, (byte[][]) null, (byte[][]) null, (class281) null, 46, 122, 119, 37, (byte[][]) null, (boolean[]) null);
        }
        field5920 = null;
        field5923 = null;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(II[BIILjava/lang/String;)I")
    public static final int method2618(int arg0, int arg1, byte[] arg2, int arg3, int arg4, String arg5) {
        ++field5928;
        int var6 = -arg1 + arg4;
        for (int var7 = 0; ~var6 < ~var7; ++var7) {
            char var8 = arg5.charAt(arg1 + var7);
            if (~var8 < -1 && var8 < 128 || var8 >= 160 && ~var8 >= -256) {
                arg2[arg0 - -var7] = (byte) var8;
            } else if (~var8 != -8365) {
                if (~var8 != -8219) {
                    if (~var8 == -403) {
                        arg2[arg0 + var7] = -125;
                    } else if (var8 != 8222) {
                        if (var8 == 8230) {
                            arg2[arg0 + var7] = -123;
                        } else if (var8 == 8224) {
                            arg2[arg0 + var7] = -122;
                        } else if (var8 == 8225) {
                            arg2[arg0 - -var7] = -121;
                        } else if (var8 != 710) {
                            if (~var8 != -8241) {
                                if (~var8 != -353) {
                                    if (~var8 == -8250) {
                                        arg2[arg0 + var7] = -117;
                                    } else if (var8 != 338) {
                                        if (~var8 == -382) {
                                            arg2[arg0 + var7] = -114;
                                        } else if (var8 == 8216) {
                                            arg2[arg0 + var7] = -111;
                                        } else if (~var8 != -8218) {
                                            if (var8 != 8220) {
                                                if (var8 != 8221) {
                                                    if (~var8 == -8227) {
                                                        arg2[arg0 + var7] = -107;
                                                    } else if (~var8 != -8212) {
                                                        if (var8 == 8212) {
                                                            arg2[arg0 - -var7] = -105;
                                                        } else if (~var8 == -733) {
                                                            arg2[arg0 - -var7] = -104;
                                                        } else if (~var8 != -8483) {
                                                            if (var8 == 353) {
                                                                arg2[arg0 + var7] = -102;
                                                            } else if (~var8 == -8251) {
                                                                arg2[arg0 + var7] = -101;
                                                            } else if (~var8 == -340) {
                                                                arg2[arg0 + var7] = -100;
                                                            } else if (~var8 == -383) {
                                                                arg2[arg0 + var7] = -98;
                                                            } else if (~var8 != -377) {
                                                                arg2[arg0 - -var7] = 63;
                                                            } else {
                                                                arg2[arg0 - -var7] = -97;
                                                            }
                                                        } else {
                                                            arg2[arg0 - -var7] = -103;
                                                        }
                                                    } else {
                                                        arg2[arg0 - -var7] = -106;
                                                    }
                                                } else {
                                                    arg2[arg0 - -var7] = -108;
                                                }
                                            } else {
                                                arg2[arg0 + var7] = -109;
                                            }
                                        } else {
                                            arg2[arg0 + var7] = -110;
                                        }
                                    } else {
                                        arg2[arg0 + var7] = -116;
                                    }
                                } else {
                                    arg2[arg0 + var7] = -118;
                                }
                            } else {
                                arg2[arg0 + var7] = -119;
                            }
                        } else {
                            arg2[arg0 + var7] = -120;
                        }
                    } else {
                        arg2[arg0 + var7] = -124;
                    }
                } else {
                    arg2[arg0 + var7] = -126;
                }
            } else {
                arg2[arg0 + var7] = -128;
            }
        }
        if (arg3 != 128) {
            return 20;
        } else {
            return var6;
        }
    }

    @OriginalMember(owner = "client!bs", name = "<init>", descriptor = "()V")
    public class408() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(II)[I")
    public final int[] method14(int arg0, int arg1) {
        if (arg1 != 18338) {
            field5934 = null;
        }
        ++field5935;
        int[] var3 = super.field6258.method2688((byte) -101, arg0);
        if (super.field6258.field6138) {
            int var4 = class32.field499[arg0];
            if (~this.field5925 != -1) {
                for (int var5 = 0; var5 < class43.field653; ++var5) {
                    int var6 = 0;
                    short var7 = 0;
                    int var8 = class249.field3455[var5];
                    int var9 = this.field5925;
                    if (var9 != 1) {
                        if (var9 != 2) {
                            if (~var9 == -4) {
                                var6 = 2048 - -(-var4 + var8 >> 1);
                            }
                        } else {
                            var6 = (var8 + -4096 + var4 >> 1) + 2048;
                        }
                    } else {
                        var6 = var8;
                    }
                    for (int var10 = 0; ~var10 > ~this.field5933; ++var10) {
                        if (this.field5936[var10] <= var6 && var6 < this.field5936[var10 + 1]) {
                            if (~this.field5922[var10] < ~var6) {
                                var7 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var7;
                }
            } else {
                short var11 = 0;
                for (int var12 = 0; this.field5933 > var12; ++var12) {
                    if (this.field5936[var12] <= var4 && ~var4 > ~this.field5936[var12 + 1]) {
                        if (~this.field5922[var12] < ~var4) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class150.method1021(var3, 0, class43.field653, var11);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bs", name = "f", descriptor = "(I)V")
    private final void method2619(int arg0) {
        ++field5931;
        this.field5922 = new int[this.field5933 - -1];
        int var2 = 0;
        this.field5936 = new int[this.field5933 - -1];
        int var3 = 4096 / this.field5933;
        int var4 = this.field5937 * var3 >> 12;
        if (arg0 < -16) {
            for (int var5 = 0; var5 < this.field5933; ++var5) {
                this.field5936[var5] = var2;
                this.field5922[var5] = var2 - -var4;
                var2 += var3;
            }
            this.field5936[this.field5933] = 4096;
            this.field5922[this.field5933] = this.field5922[0] + 4096;
        }
    }

    @OriginalMember(owner = "client!bs", name = "g", descriptor = "(I)V")
    public static final void method2620(int arg0) {
        int var1 = 123 / ((arg0 - -13) / 54);
        class446.field6433.method1243(1000);
        ++field5921;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(IILeb;)V")
    public final void method18(int arg0, int arg1, class371 arg2) {
        ++field5929;
        if (arg0 != 34) {
            this.field5925 = 105;
        }
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    this.field5925 = arg2.method2429(0);
                }
            } else {
                this.field5937 = arg2.method2403((byte) 50);
            }
        } else {
            this.field5933 = arg2.method2429(0);
        }
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(III)I")
    public static final int method2621(int arg0, int arg1, int arg2) {
        ++field5930;
        class124 var3 = (class124) class71.field1103.method1412((byte) -54, (long) arg0);
        if (var3 == null) {
            return -1;
        } else {
            if (arg2 < 89) {
                field5923 = null;
            }
            return arg1 >= 0 && arg1 < var3.field1744.length ? var3.field1744[arg1] : -1;
        }
    }
}
