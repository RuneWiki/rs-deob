import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tga")
public class class258 extends class382 {

    @OriginalMember(owner = "client!tga", name = "I", descriptor = "I")
    public int field3733 = 99;

    @OriginalMember(owner = "client!tga", name = "G", descriptor = "Lwn;")
    public static class585 field3731 = new class585("", 16);

    @OriginalMember(owner = "client!tga", name = "K", descriptor = "I")
    public static int field3735 = 0;

    @OriginalMember(owner = "client!tga", name = "P", descriptor = "Z")
    public static boolean field3740 = false;

    @OriginalMember(owner = "client!tga", name = "J", descriptor = "F")
    public static float field3734;

    @OriginalMember(owner = "client!tga", name = "C", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!tga", name = "D", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!tga", name = "E", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!tga", name = "F", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!tga", name = "H", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!tga", name = "L", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!tga", name = "M", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!tga", name = "Q", descriptor = "I")
    public static int field3741;

    @OriginalMember(owner = "client!tga", name = "R", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!tga", name = "S", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!tga", name = "T", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!tga", name = "O", descriptor = "Lfs;")
    public static class560 field3739;

    // $FF: synthetic field
    @OriginalMember(owner = "client!tga", name = "U", descriptor = "Ljava/lang/Class;")
    public static Class field3745;

    @OriginalMember(owner = "client!tga", name = "N", descriptor = "[[I")
    public static int[][] field3738;

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(B[BI[Lnfa;Lha;I)V")
    public final void method1739(byte arg0, byte[] arg1, int arg2, class228[] arg3, class548 arg4, int arg5) {
        ++field3737;
        if (arg0 <= 115) {
            this.method1749(false, (class548) null, 17);
        }
        class63 var7 = new class63(arg1);
        int var8 = -1;
        while (true) {
            int var9 = var7.method459(0);
            if (~var9 == -1) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method478(-122);
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = 63 & var10;
                int var13 = 63 & var10 >> 6;
                int var14 = var10 >> 12;
                int var15 = var7.method505((byte) -119);
                int var16 = var15 >> 2;
                int var17 = var15 & 3;
                int var18 = var13 - -arg5;
                int var19 = arg2 + var12;
                if (~var18 < -1 && ~var19 < -1 && super.field5494 + -1 > var18 && ~(super.field5490 + -1) < ~var19) {
                    class228 var20 = null;
                    if (!super.field5485) {
                        int var21 = var14;
                        if ((class692.field9623[1][var18][var19] & 2) == 2) {
                            var21 = var14 - 1;
                        }
                        if (var21 >= 0) {
                            var20 = arg3[var21];
                        }
                    }
                    this.method1746(var14, var18, var14, var19, arg4, var17, var8, var20, var16, (byte) 49, -1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(I[ILha;Ldc;IB)V")
    public final void method1740(int arg0, int[] arg1, class548 arg2, class63 arg3, int arg4, byte arg5) {
        ++field3728;
        if (!super.field5485) {
            if (arg5 != -68) {
                this.method1746(-77, 33, -75, 17, (class548) null, -104, -37, (class228) null, 53, (byte) 42, 12);
            }
            boolean var7 = false;
            class121 var8 = null;
            if (arg1 != null) {
                arg1[0] = -1;
            }
            while (true) {
                while (true) {
                    while (true) {
                        while (arg3.field956 < arg3.field954.length) {
                            int var18 = arg3.method505((byte) -119);
                            if (~var18 != -1) {
                                if (~var18 != -2) {
                                    if (~var18 == -3) {
                                        if (var8 == null) {
                                            var8 = new class121();
                                        }
                                        var8.method753(-26167, arg3);
                                    } else if (~var18 == -129) {
                                        if (arg1 == null) {
                                            arg3.field956 += 10;
                                        } else {
                                            arg1[0] = arg3.method482(-772591672);
                                            arg1[1] = arg3.method496(-95);
                                            arg1[2] = arg3.method496(arg5 + -54);
                                            arg1[3] = arg3.method496(-43);
                                            arg1[4] = arg3.method482(-772591672);
                                        }
                                    } else {
                                        if (~var18 != -130) {
                                            throw new IllegalStateException("");
                                        }
                                        if (super.field5471 == null) {
                                            super.field5471 = new byte[4][][];
                                        }
                                        for (int var19 = 0; ~var19 > -5; ++var19) {
                                            byte var20 = arg3.method491(false);
                                            if (var20 == 0 && super.field5471[var19] != null) {
                                                int var21 = arg4;
                                                int var22 = arg4 - -64;
                                                int var23 = arg0;
                                                int var24 = arg0 + 64;
                                                if (var22 >= 0) {
                                                    if (~super.field5494 >= ~var22) {
                                                        var22 = super.field5494;
                                                    }
                                                } else {
                                                    var22 = 0;
                                                }
                                                if (arg0 >= 0) {
                                                    if (super.field5490 <= arg0) {
                                                        var23 = super.field5490;
                                                    }
                                                } else {
                                                    var23 = 0;
                                                }
                                                if (arg4 < 0) {
                                                    var21 = 0;
                                                } else if (super.field5494 <= arg4) {
                                                    var21 = super.field5494;
                                                }
                                                if (~var24 <= -1) {
                                                    if (super.field5490 <= var24) {
                                                        var24 = super.field5490;
                                                    }
                                                } else {
                                                    var24 = 0;
                                                }
                                                while (var21 < var22) {
                                                    while (var23 < var24) {
                                                        super.field5471[var19][var21][var23] = 0;
                                                        ++var23;
                                                    }
                                                    ++var21;
                                                }
                                            } else if (~var20 != -2) {
                                                if (~var20 == -3) {
                                                    if (super.field5471[var19] == null) {
                                                        super.field5471[var19] = new byte[super.field5494 + 1][super.field5490 + 1];
                                                    }
                                                    if (var19 > 0) {
                                                        int var25 = arg4;
                                                        int var26 = arg4 - -64;
                                                        int var27 = arg0;
                                                        if (var26 < 0) {
                                                            var26 = 0;
                                                        } else if (~super.field5494 >= ~var26) {
                                                            var26 = super.field5494;
                                                        }
                                                        if (~arg0 > -1) {
                                                            var27 = 0;
                                                        } else if (super.field5490 <= arg0) {
                                                            var27 = super.field5490;
                                                        }
                                                        int var28 = arg0 + 64;
                                                        if (~arg4 > -1) {
                                                            var25 = 0;
                                                        } else if (super.field5494 <= arg4) {
                                                            var25 = super.field5494;
                                                        }
                                                        if (var28 < 0) {
                                                            var28 = 0;
                                                        } else if (~var28 <= ~super.field5490) {
                                                            var28 = super.field5490;
                                                        }
                                                        while (~var25 > ~var26) {
                                                            while (~var28 < ~var27) {
                                                                super.field5471[var19][var25][var27] = super.field5471[var19 + -1][var25][var27];
                                                                ++var27;
                                                            }
                                                            ++var25;
                                                        }
                                                    }
                                                }
                                            } else {
                                                if (super.field5471[var19] == null) {
                                                    super.field5471[var19] = new byte[super.field5494 + 1][super.field5490 + 1];
                                                }
                                                for (int var29 = 0; var29 < 64; var29 += 4) {
                                                    for (int var30 = 0; ~var30 > -65; var30 += 4) {
                                                        byte var31 = arg3.method491(false);
                                                        for (int var32 = var29 - -arg4; ~var32 > ~(var29 - -4 + arg4); ++var32) {
                                                            for (int var33 = arg0 + var30; ~var33 > ~(var30 - -arg0 + 4); ++var33) {
                                                                if (var32 >= 0 && var32 < super.field5494 && var33 >= 0 && var33 < super.field5490) {
                                                                    super.field5471[var19][var32][var33] = var31;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        var7 = true;
                                    }
                                } else {
                                    int var34 = arg3.method505((byte) -119);
                                    if (~var34 < -1) {
                                        for (int var35 = 0; var34 > var35; ++var35) {
                                            class131 var36 = new class131(arg2, arg3, 2);
                                            if (var36.field1825 == 31) {
                                                class401 var37 = class95.field1312.method1215(arg3.method482(-772591672), 31);
                                                var36.method828(var37.field5737, var37.field5742, var37.field5746, var37.field5741, 19928);
                                            }
                                            if (~arg2.method1481() < -1) {
                                                class687 var38 = var36.field1842;
                                                int var39 = (arg4 << 9) + var38.method3873((byte) -7);
                                                int var40 = (arg0 << 9) + var38.method3870(111);
                                                int var41 = var39 >> 9;
                                                int var42 = var40 >> 9;
                                                if (~var41 <= -1 && ~var42 <= -1 && var41 < super.field5494 && ~super.field5490 < ~var42) {
                                                    var38.method1733(var39, arg5 ^ 10732, super.field5489[var36.field1836][var41][var42] - var38.method3867(false), var40);
                                                    class696.method3928(var36);
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                var8 = new class121(arg3);
                            }
                        }
                        if (var8 != null) {
                            for (int var9 = 0; ~var9 > -9; ++var9) {
                                for (int var10 = 0; ~var10 > -9; ++var10) {
                                    int var11 = (arg4 >> 3) + var9;
                                    int var12 = (arg0 >> 3) + var10;
                                    if (~var11 <= -1 && super.field5494 >> 3 > var11 && var12 >= 0 && super.field5490 >> 3 > var12) {
                                        class529.method3144((byte) 61, var12, var8, var11);
                                    }
                                }
                            }
                        }
                        if (!var7 && super.field5471 != null) {
                            for (int var13 = 0; var13 < 4; ++var13) {
                                if (super.field5471[var13] != null) {
                                    for (int var14 = 0; ~var14 > -17; ++var14) {
                                        for (int var15 = 0; var15 < 16; ++var15) {
                                            int var16 = (arg4 >> 2) + var14;
                                            int var17 = (arg0 >> 2) - -var15;
                                            if (~var16 <= -1 && ~var16 > -27 && var17 >= 0 && var17 < 26) {
                                                super.field5471[var13][var16][var17] = 0;
                                            }
                                        }
                                    }
                                }
                            }
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tga", name = "b", descriptor = "(I)V")
    public static void method1741(int arg0) {
        if (arg0 > -33) {
            method1741(81);
        }
        field3738 = null;
        field3731 = null;
        field3739 = null;
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(BIII)I")
    public static final int method1742(byte arg0, int arg1, int arg2, int arg3) {
        int var4 = -114 / ((-78 - arg0) / 46);
        if (~arg3 >= -244) {
            if (arg3 <= 217) {
                if (arg3 > 192) {
                    arg2 >>= 2;
                } else if (~arg3 < -180) {
                    arg2 >>= 1;
                }
            } else {
                arg2 >>= 3;
            }
        } else {
            arg2 >>= 4;
        }
        ++field3743;
        return ((arg1 & 255) >> 2 << 10) - -(arg2 >> 5 << 7) - -(arg3 >> 1);
    }

    @OriginalMember(owner = "client!tga", name = "<init>", descriptor = "(IIIZ)V")
    public class258(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class34.field447, class228.field3059);
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(IIIII[Lnfa;B[BLha;II)V")
    public final void method1743(int arg0, int arg1, int arg2, int arg3, int arg4, class228[] arg5, byte arg6, byte[] arg7, class548 arg8, int arg9, int arg10) {
        if (arg6 != 91) {
            field3731 = null;
        }
        ++field3729;
        class63 var12 = new class63(arg7);
        int var13 = -1;
        while (true) {
            int var14 = var12.method459(arg6 ^ 91);
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method478(-107);
                if (var16 == 0) {
                    break;
                }
                var15 += var16 + -1;
                int var17 = var15 & 63;
                int var18 = (4052 & var15) >> 6;
                int var19 = var15 >> 12;
                int var20 = var12.method505((byte) -119);
                int var21 = var20 >> 2;
                int var22 = var20 & 3;
                if (~arg0 == ~var19 && ~arg2 >= ~var18 && ~var18 > ~(arg2 + 8) && ~var17 <= ~arg4 && var17 < arg4 + 8) {
                    class220 var23 = class20.field192.method716(arg6 ^ 93, var13);
                    int var24 = class384.method2408(var23.field2887, var22, arg6 ^ -92, var17 & 7, var23.field2938, arg3, var18 & 7) + arg1;
                    int var25 = arg9 - -class619.method3497(var22, 7 & var18, var17 & 7, arg3, (byte) 27, var23.field2938, var23.field2887);
                    if (~var24 < -1 && var25 > 0 && var24 < super.field5494 + -1 && var25 < super.field5490 + -1) {
                        class228 var26 = null;
                        if (!super.field5485) {
                            int var27 = arg10;
                            if (~(2 & class692.field9623[1][var24][var25]) == -3) {
                                var27 = arg10 - 1;
                            }
                            if (var27 >= 0) {
                                var26 = arg5[var27];
                            }
                        }
                        this.method1746(arg10, var24, arg10, var25, arg8, 3 & arg3 + var22, var13, var26, var21, (byte) 49, -1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(II[IILdc;IILha;III)V")
    public final void method1744(int arg0, int arg1, int[] arg2, int arg3, class63 arg4, int arg5, int arg6, class548 arg7, int arg8, int arg9, int arg10) {
        ++field3744;
        if (!super.field5485) {
            if (arg3 == -2340) {
                boolean var12 = false;
                class121 var13 = null;
                if (arg2 != null) {
                    arg2[0] = -1;
                }
                int var14 = (arg9 & 7) * 8;
                int var15 = (arg8 & 7) * 8;
                while (true) {
                    while (arg4.field954.length > arg4.field956) {
                        int var20 = arg4.method505((byte) -119);
                        if (var20 == 0) {
                            var13 = new class121(arg4);
                        } else if (var20 == 1) {
                            int var21 = arg4.method505((byte) -119);
                            if (~var21 < -1) {
                                for (int var22 = 0; var22 < var21; ++var22) {
                                    class131 var23 = new class131(arg7, arg4, 2);
                                    if (var23.field1825 == 31) {
                                        class401 var24 = class95.field1312.method1215(arg4.method482(-772591672), arg3 ^ -2365);
                                        var23.method828(var24.field5737, var24.field5742, var24.field5746, var24.field5741, arg3 + 22268);
                                    }
                                    if (arg7.method1481() > 0) {
                                        class687 var25 = var23.field1842;
                                        int var26 = var25.method3873((byte) -7) >> 9;
                                        int var27 = var25.method3870(106) >> 9;
                                        if (var23.field1836 == arg10 && var26 >= var14 && ~(var14 - -8) < ~var26 && var27 >= var15 && var15 - -8 > var27) {
                                            int var28 = class528.method3132(arg5, 4095 & var25.method3873((byte) -7), 4095, 4095 & var25.method3870(83)) + (arg6 << 9);
                                            int var29 = (arg0 << 9) + class594.method3411(var25.method3870(101) & 4095, 4095 & var25.method3873((byte) -7), (byte) -85, arg5);
                                            int var30 = var28 >> 9;
                                            int var31 = var29 >> 9;
                                            if (var30 >= 0 && var31 >= 0 && ~var30 > ~super.field5494 && var31 < super.field5490) {
                                                var25.method1733(var28, -10672, super.field5489[arg10][var30][var31] - var25.method3867(false), var29);
                                                class696.method3928(var23);
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (var20 == 2) {
                            if (var13 == null) {
                                var13 = new class121();
                            }
                            var13.method753(-26167, arg4);
                        } else if (~var20 == -129) {
                            if (arg2 == null) {
                                arg4.field956 += 10;
                            } else {
                                arg2[0] = arg4.method482(-772591672);
                                arg2[1] = arg4.method496(-37);
                                arg2[2] = arg4.method496(-65);
                                arg2[3] = arg4.method496(class134.method848(arg3, 2324));
                                arg2[4] = arg4.method482(-772591672);
                            }
                        } else {
                            if (~var20 != -130) {
                                throw new IllegalStateException("");
                            }
                            if (super.field5471 == null) {
                                super.field5471 = new byte[4][][];
                            }
                            for (int var32 = 0; var32 < 4; ++var32) {
                                byte var33 = arg4.method491(false);
                                if (~var33 == -1 && super.field5471[arg1] != null) {
                                    if (var32 <= arg10) {
                                        int var34 = arg6;
                                        int var35 = arg6 + 7;
                                        int var36 = arg0;
                                        int var37 = arg0 - -7;
                                        if (~arg0 <= -1) {
                                            if (~arg0 <= ~super.field5490) {
                                                var36 = super.field5490;
                                            }
                                        } else {
                                            var36 = 0;
                                        }
                                        if (~arg6 > -1) {
                                            var34 = 0;
                                        } else if (arg6 >= super.field5494) {
                                            var34 = super.field5494;
                                        }
                                        if (~var35 > -1) {
                                            var35 = 0;
                                        } else if (~super.field5494 >= ~var35) {
                                            var35 = super.field5494;
                                        }
                                        if (~var37 <= -1) {
                                            if (super.field5490 <= var37) {
                                                var37 = super.field5490;
                                            }
                                        } else {
                                            var37 = 0;
                                        }
                                        while (~var35 < ~var34) {
                                            while (var37 > var36) {
                                                super.field5471[arg1][var34][var36] = 0;
                                                ++var36;
                                            }
                                            ++var34;
                                        }
                                    }
                                } else if (~var33 == -2) {
                                    if (super.field5471[arg1] == null) {
                                        super.field5471[arg1] = new byte[super.field5494 + 1][super.field5490 + 1];
                                    }
                                    for (int var38 = 0; var38 < 64; var38 += 4) {
                                        for (int var39 = 0; var39 < 64; var39 += 4) {
                                            byte var40 = arg4.method491(false);
                                            if (arg10 >= var32) {
                                                for (int var41 = var38; var41 < var38 + 4; ++var41) {
                                                    for (int var42 = var39; ~(var39 + 4) < ~var42; ++var42) {
                                                        if (var14 <= var41 && ~var41 > ~(var14 + 8) && var42 >= var15 && var15 + 8 > var15) {
                                                            int var43 = class627.method3531(7 & var42, (byte) 19, arg5, var41 & 7) + arg6;
                                                            int var44 = arg0 + class627.method3528(arg5, var41 & 7, (byte) 85, 7 & var42);
                                                            if (var43 >= 0 && ~var43 > ~super.field5494 && var44 >= 0 && ~var44 > ~super.field5490) {
                                                                super.field5471[arg1][var43][var44] = var40;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (var13 != null) {
                        class529.method3144((byte) 61, arg0 >> 3, var13, arg6 >> 3);
                    }
                    if (!var12 && super.field5471 != null && super.field5471[arg1] != null) {
                        int var16 = arg6 - -7;
                        int var17 = arg0 - -7;
                        for (int var18 = arg6; ~var18 > ~var16; ++var18) {
                            for (int var19 = arg0; var17 > var19; ++var19) {
                                super.field5471[arg1][var18][var19] = 0;
                            }
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tga", name = "b", descriptor = "(IIIII)Lbda;")
    public final class722 method1745(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3736;
        class722 var6 = null;
        if (~arg4 == arg0) {
            var6 = (class722) class376.method2357(arg1, arg2, arg3);
        }
        if (arg4 == 1) {
            var6 = (class722) class540.method3199(arg1, arg2, arg3);
        }
        if (arg4 == 2) {
            var6 = (class722) class141.method932(arg1, arg2, arg3, field3745 != null ? field3745 : (field3745 = method1751("bda")));
        }
        if (arg4 == 3) {
            var6 = (class722) class134.method851(arg1, arg2, arg3);
        }
        return var6;
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(IIIILha;IILnfa;IBI)V")
    public final void method1746(int arg0, int arg1, int arg2, int arg3, class548 arg4, int arg5, int arg6, class228 arg7, int arg8, byte arg9, int arg10) {
        ++field3732;
        if (class332.field4707.field4774.method1242(arg9 + -49) != 0 || class718.method4028((byte) -101, arg3, arg2, class622.field8328, arg1)) {
            if (arg0 < this.field3733) {
                this.field3733 = arg0;
            }
            class220 var12 = class20.field192.method716(arg9 + -43, arg6);
            if (class332.field4707.field4792.method3641(0) != 0 || !var12.field2921) {
                int var13;
                int var14;
                if (~arg5 != -2 && ~arg5 != -4) {
                    var13 = var12.field2938;
                    var14 = var12.field2887;
                } else {
                    var14 = var12.field2938;
                    var13 = var12.field2887;
                }
                int var15;
                int var16;
                if (~(arg1 - -var13) < ~super.field5494) {
                    var15 = arg1 + 1;
                    var16 = arg1;
                } else {
                    var16 = (var13 >> 1) + arg1;
                    var15 = (var13 + 1 >> 1) + arg1;
                }
                int var17;
                int var18;
                if (arg3 + var14 <= super.field5490) {
                    var17 = (var14 >> 1) + arg3;
                    var18 = (var14 - -1 >> 1) + arg3;
                } else {
                    var17 = arg3;
                    var18 = arg3 - -1;
                }
                class341 var19 = class433.field6043[arg2];
                int var20 = var19.method2171(var17, var16, 31) - (-var19.method2171(var17, var15, 31) - (var19.method2171(var18, var16, 31) - -var19.method2171(var18, var15, 31))) >> 2;
                int var21 = (arg1 << 9) + (var13 << 8);
                int var22 = (arg3 << 9) + (var14 << 8);
                boolean var23 = class202.field2680 && !super.field5485 && var12.field2963;
                if (var12.method1299(117)) {
                    class38.method204((class96) null, arg5, (class679) null, arg1, arg0, -27170, var12, arg3);
                }
                boolean var24 = arg10 == -1 && var12.field2939 == -1 && var12.field2931 == null && var12.field2966 == null && !var12.field2922 && !var12.field2946;
                if (!class56.field788 || (!class438.method2698(-92, arg8) || ~var12.field2945 == -2) && (!class504.method3034((byte) 80, arg8) || var12.field2945 != 0)) {
                    if (arg8 == 22) {
                        if (~class332.field4707.field4779.method1162(0) != -1 || ~var12.field2948 != -1 || var12.field2884 == 1 || var12.field2904) {
                            class441 var25;
                            if (!var24) {
                                var25 = new class129(arg4, var12, arg0, arg2, var21, var20, var22, super.field5485, arg5, arg10);
                            } else {
                                class762 var26 = new class762(arg4, var12, arg0, arg2, var21, var20, var22, super.field5485, arg5, var23);
                                var25 = var26;
                                if (var26.method781(-112)) {
                                    var26.method786(arg4, true);
                                }
                            }
                            class638.method3567(arg0, arg1, arg3, var25);
                            if (~var12.field2884 == -2 && arg7 != null) {
                                arg7.method1342((byte) 116, arg1, arg3);
                            }
                        }
                    } else if (arg8 != 10 && arg8 != 11) {
                        if ((arg8 < 12 || arg8 > 17) && (~arg8 > -19 || arg8 > 21)) {
                            if (arg8 == 0) {
                                int var29 = var12.field2945;
                                if (class491.field6906 && ~var12.field2945 == 0) {
                                    var29 = 1;
                                }
                                class91 var31;
                                if (var24) {
                                    class539 var30 = new class539(arg4, var12, arg0, arg2, var21, var20, var22, super.field5485, arg8, arg5, var23);
                                    if (var30.method781(-115)) {
                                        var30.method786(arg4, true);
                                    }
                                    var31 = var30;
                                } else {
                                    var31 = new class746(arg4, var12, arg0, arg2, var21, var20, var22, super.field5485, arg8, arg5, arg10);
                                }
                                class484.method2945(arg0, arg1, arg3, var31, (class91) null);
                                if (arg5 == 0) {
                                    if (class202.field2680 && var12.field2937) {
                                        var19.method1037(arg1, arg3, 50);
                                        var19.method1037(arg1, arg3 + 1, 50);
                                    }
                                    if (var29 == 1 && !super.field5485) {
                                        class254.method1732(arg3, 1, var12.field2895, arg0, arg9 + -48, var12.field2885, arg1);
                                    }
                                } else if (arg5 == 1) {
                                    if (class202.field2680 && var12.field2937) {
                                        var19.method1037(arg1, arg3 + 1, 50);
                                        var19.method1037(arg1 - -1, arg3 - -1, 50);
                                    }
                                    if (~var29 == -2 && !super.field5485) {
                                        class254.method1732(arg3 + 1, 2, var12.field2895, arg0, 1, -var12.field2885, arg1);
                                    }
                                } else if (arg5 != 2) {
                                    if (~arg5 == -4) {
                                        if (class202.field2680 && var12.field2937) {
                                            var19.method1037(arg1, arg3, 50);
                                            var19.method1037(arg1 + 1, arg3, 50);
                                        }
                                        if (~var29 == -2 && !super.field5485) {
                                            class254.method1732(arg3, 2, var12.field2895, arg0, 1, var12.field2885, arg1);
                                        }
                                    }
                                } else {
                                    if (class202.field2680 && var12.field2937) {
                                        var19.method1037(arg1 + 1, arg3, 50);
                                        var19.method1037(arg1 + 1, arg3 + 1, 50);
                                    }
                                    if (var29 == 1 && !super.field5485) {
                                        class254.method1732(arg3, 1, var12.field2895, arg0, 1, -var12.field2885, arg1 + 1);
                                    }
                                }
                                if (var12.field2884 != 0 && arg7 != null) {
                                    arg7.method1349(arg5, var12.field2875, arg3, (byte) 102, arg8, arg1, !var12.field2896);
                                }
                                if (~var12.field2933 != -65) {
                                    class302.method1986(arg0, arg1, arg3, var12.field2933);
                                }
                            } else if (~arg8 == -2) {
                                class91 var32;
                                if (!var24) {
                                    var32 = new class746(arg4, var12, arg0, arg2, var21, var20, var22, super.field5485, arg8, arg5, arg10);
                                } else {
                                    class539 var33 = new class539(arg4, var12, arg0, arg2, var21, var20, var22, super.field5485, arg8, arg5, var23);
                                    if (var33.method781(-110)) {
                                        var33.method786(arg4, true);
                                    }
                                    var32 = var33;
                                }
                                class484.method2945(arg0, arg1, arg3, var32, (class91) null);
                                if (var12.field2937 && class202.field2680) {
                                    if (arg5 != 0) {
                                        if (arg5 == 1) {
                                            var19.method1037(arg1 + 1, arg3 + 1, 50);
                                        } else if (arg5 != 2) {
                                            if (~arg5 == -4) {
                                                var19.method1037(arg1, arg3, 50);
                                            }
                                        } else {
                                            var19.method1037(arg1 + 1, arg3, 50);
                                        }
                                    } else {
                                        var19.method1037(arg1, arg3 + 1, 50);
                                    }
                                }
                                if (var12.field2884 != 0 && arg7 != null) {
                                    arg7.method1349(arg5, var12.field2875, arg3, (byte) 102, arg8, arg1, !var12.field2896);
                                }
                            } else if (~arg8 == -3) {
                                int var34 = 3 & arg5 + 1;
                                class91 var35;
                                class91 var36;
                                if (!var24) {
                                    var35 = new class746(arg4, var12, arg0, arg2, var21, var20, var22, super.field5485, arg8, arg5 + 4, arg10);
                                    var36 = new class746(arg4, var12, arg0, arg2, var21, var20, var22, super.field5485, arg8, var34, arg10);
                                } else {
                                    class539 var37 = new class539(arg4, var12, arg0, arg2, var21, var20, var22, super.field5485, arg8, arg5 + 4, var23);
                                    class539 var38 = new class539(arg4, var12, arg0, arg2, var21, var20, var22, super.field5485, arg8, var34, var23);
                                    if (var37.method781(-111)) {
                                        var37.method786(arg4, true);
                                    }
                                    if (var38.method781(-109)) {
                                        var38.method786(arg4, true);
                                    }
                                    var35 = var37;
                                    var36 = var38;
                                }
                                class484.method2945(arg0, arg1, arg3, var35, var36);
                                if ((var12.field2945 == 1 || class491.field6906 && ~var12.field2945 == 0) && !super.field5485) {
                                    if (~arg5 == -1) {
                                        class254.method1732(arg3, 1, var12.field2895, arg0, 1, var12.field2885, arg1);
                                        class254.method1732(arg3 + 1, 2, var12.field2895, arg0, 1, var12.field2885, arg1);
                                    } else if (arg5 != 1) {
                                        if (arg5 == 2) {
                                            class254.method1732(arg3, 1, var12.field2895, arg0, 1, var12.field2885, arg1 + 1);
                                            class254.method1732(arg3, 2, var12.field2895, arg0, 1, var12.field2885, arg1);
                                        } else if (arg5 == 3) {
                                            class254.method1732(arg3, 1, var12.field2895, arg0, arg9 + -48, var12.field2885, arg1);
                                            class254.method1732(arg3, 2, var12.field2895, arg0, arg9 + -48, var12.field2885, arg1);
                                        }
                                    } else {
                                        class254.method1732(arg3, 1, var12.field2895, arg0, 1, var12.field2885, arg1 + 1);
                                        class254.method1732(arg3 + 1, 2, var12.field2895, arg0, 1, var12.field2885, arg1);
                                    }
                                }
                                if (var12.field2884 != 0 && arg7 != null) {
                                    arg7.method1349(arg5, var12.field2875, arg3, (byte) 102, arg8, arg1, !var12.field2896);
                                }
                                if (var12.field2933 != 64) {
                                    class302.method1986(arg0, arg1, arg3, var12.field2933);
                                }
                            } else if (arg8 == 3) {
                                class91 var40;
                                if (var24) {
                                    class539 var39 = new class539(arg4, var12, arg0, arg2, var21, var20, var22, super.field5485, arg8, arg5, var23);
                                    if (var39.method781(-114)) {
                                        var39.method786(arg4, true);
                                    }
                                    var40 = var39;
                                } else {
                                    var40 = new class746(arg4, var12, arg0, arg2, var21, var20, var22, super.field5485, arg8, arg5, arg10);
                                }
                                class484.method2945(arg0, arg1, arg3, var40, (class91) null);
                                if (var12.field2937 && class202.field2680) {
                                    if (arg5 == 0) {
                                        var19.method1037(arg1, arg3 + 1, 50);
                                    } else if (~arg5 == -2) {
                                        var19.method1037(arg1 + 1, arg3 + 1, 50);
                                    } else if (~arg5 == -3) {
                                        var19.method1037(arg1 - -1, arg3, 50);
                                    } else if (arg5 == 3) {
                                        var19.method1037(arg1, arg3, 50);
                                    }
                                }
                                if (~var12.field2884 != -1 && arg7 != null) {
                                    arg7.method1349(arg5, var12.field2875, arg3, (byte) 102, arg8, arg1, !var12.field2896);
                                }
                            } else if (~arg8 == -10) {
                                class395 var42;
                                if (var24) {
                                    class229 var41 = new class229(arg4, var12, arg0, arg2, var21, var20, var22, super.field5485, arg1, arg1, arg3, arg3, arg8, arg5, var23);
                                    var42 = var41;
                                    if (var41.method781(arg9 + -137)) {
                                        var41.method786(arg4, true);
                                    }
                                } else {
                                    var42 = new class352(arg4, var12, arg0, arg2, var21, var20, var22, super.field5485, arg1, arg1 - 1 + var13, arg3, arg3 + var14 - 1, arg8, arg5, arg10);
                                }
                                class117.method738(var42, false);
                                if (var12.field2945 == 1 && !super.field5485) {
                                    byte var43;
                                    if ((1 & arg5) == 0) {
                                        var43 = 8;
                                    } else {
                                        var43 = 16;
                                    }
                                    class254.method1732(arg3, var43, var12.field2895, arg0, arg9 ^ 48, 0, arg1);
                                }
                                if (~var12.field2884 != -1 && arg7 != null) {
                                    arg7.method1357(var12.field2875, !var12.field2896, var13, arg9 + -2325, arg1, var14, arg3);
                                }
                                if (~var12.field2933 != -65) {
                                    class302.method1986(arg0, arg1, arg3, var12.field2933);
                                }
                            } else if (~arg8 == -5) {
                                class225 var45;
                                if (var24) {
                                    class126 var44 = new class126(arg4, var12, arg0, arg2, var21, var20, var22, super.field5485, 0, 0, arg8, arg5);
                                    if (var44.method781(arg9 ^ -92)) {
                                        var44.method786(arg4, true);
                                    }
                                    var45 = var44;
                                } else {
                                    var45 = new class279(arg4, var12, arg0, arg2, var21, var20, var22, super.field5485, 0, 0, arg8, arg5, arg10);
                                }
                                class549.method3257(arg0, arg1, arg3, var45, (class225) null);
                            } else if (arg8 == 5) {
                                int var46 = 65;
                                class722 var47 = (class722) class376.method2357(arg0, arg1, arg3);
                                if (var47 != null) {
                                    var46 = 1 + class20.field192.method716(6, var47.method782((byte) -123)).field2933;
                                }
                                class225 var49;
                                if (var24) {
                                    class126 var48 = new class126(arg4, var12, arg0, arg2, var21, var20, var22, super.field5485, class597.field8102[arg5] * var46, class397.field5708[arg5] * var46, arg8, arg5);
                                    if (var48.method781(-104)) {
                                        var48.method786(arg4, true);
                                    }
                                    var49 = var48;
                                } else {
                                    var49 = new class279(arg4, var12, arg0, arg2, var21, var20, var22, super.field5485, class597.field8102[arg5] * var46, class397.field5708[arg5] * var46, arg8, arg5, arg10);
                                }
                                class549.method3257(arg0, arg1, arg3, var49, (class225) null);
                            } else if (arg8 == 6) {
                                int var50 = 33;
                                class722 var51 = (class722) class376.method2357(arg0, arg1, arg3);
                                if (var51 != null) {
                                    var50 = 1 + class20.field192.method716(arg9 + -43, var51.method782((byte) 67)).field2933 / 2;
                                }
                                class225 var53;
                                if (var24) {
                                    class126 var52 = new class126(arg4, var12, arg0, arg2, var21, var20, var22, super.field5485, class597.field8102[arg5] * var50, class397.field5708[arg5] * var50, arg8, arg5 + 4);
                                    var53 = var52;
                                    if (var52.method781(arg9 + -156)) {
                                        var52.method786(arg4, true);
                                    }
                                } else {
                                    var53 = new class279(arg4, var12, arg0, arg2, var21, var20, var22, super.field5485, class654.field8748[arg5] * var50, class367.field5206[arg5] * var50, arg8, arg5 + 4, arg10);
                                }
                                class549.method3257(arg0, arg1, arg3, var53, (class225) null);
                            } else if (~arg8 == -8) {
                                int var54 = arg5 + 2 & 3;
                                class225 var56;
                                if (var24) {
                                    class126 var55 = new class126(arg4, var12, arg0, arg2, var21, var20, var22, super.field5485, 0, 0, arg8, var54 - -4);
                                    if (var55.method781(-96)) {
                                        var55.method786(arg4, true);
                                    }
                                    var56 = var55;
                                } else {
                                    var56 = new class279(arg4, var12, arg0, arg2, var21, var20, var22, super.field5485, 0, 0, arg8, var54 - -4, arg10);
                                }
                                class549.method3257(arg0, arg1, arg3, var56, (class225) null);
                            } else {
                                if (arg9 != 49) {
                                    field3739 = null;
                                }
                                if (~arg8 == -9) {
                                    int var57 = 3 & arg5 + 2;
                                    int var58 = 33;
                                    class722 var59 = (class722) class376.method2357(arg0, arg1, arg3);
                                    if (var59 != null) {
                                        var58 = 1 + class20.field192.method716(6, var59.method782((byte) -71)).field2933 / 2;
                                    }
                                    class225 var62;
                                    class225 var63;
                                    if (var24) {
                                        class126 var60 = new class126(arg4, var12, arg0, arg2, var21, var20, var22, super.field5485, class654.field8748[arg5] * var58, class367.field5206[arg5] * var58, arg8, arg5 + 4);
                                        class126 var61 = new class126(arg4, var12, arg0, arg2, var21, var20, var22, super.field5485, 0, 0, arg8, var57 + 4);
                                        if (var60.method781(-100)) {
                                            var60.method786(arg4, true);
                                        }
                                        if (var61.method781(arg9 + -153)) {
                                            var61.method786(arg4, true);
                                        }
                                        var62 = var60;
                                        var63 = var61;
                                    } else {
                                        class279 var64 = new class279(arg4, var12, arg0, arg2, var21, var20, var22, super.field5485, class654.field8748[arg5] * var58, class367.field5206[arg5] * var58, arg8, arg5 + 4, arg10);
                                        class279 var65 = new class279(arg4, var12, arg0, arg2, var21, var20, var22, super.field5485, 0, 0, arg8, var57 - -4, arg10);
                                        var62 = var64;
                                        var63 = var65;
                                    }
                                    class549.method3257(arg0, arg1, arg3, var62, var63);
                                }
                            }
                        } else {
                            class395 var27;
                            if (!var24) {
                                var27 = new class352(arg4, var12, arg0, arg2, var21, var20, var22, super.field5485, arg1, arg1 + var13 + -1, arg3, arg3 + -1 + var14, arg8, arg5, arg10);
                            } else {
                                class229 var28 = new class229(arg4, var12, arg0, arg2, var21, var20, var22, super.field5485, arg1, arg1 + var13 + -1, arg3, var14 + -1 + arg3, arg8, arg5, var23);
                                var27 = var28;
                                if (var28.method781(-94)) {
                                    var28.method786(arg4, true);
                                }
                            }
                            class117.method738(var27, false);
                            if (class202.field2680 && !super.field5485 && ~arg8 <= -13 && ~arg8 >= -18 && arg8 != 13 && ~arg0 < -1 && var12.field2945 != 0) {
                                super.field5472[arg0][arg1][arg3] = (byte) class678.method3817(super.field5472[arg0][arg1][arg3], 4);
                            }
                            if (var12.field2884 != 0 && arg7 != null) {
                                arg7.method1357(var12.field2875, !var12.field2896, var13, arg9 ^ -2259, arg1, var14, arg3);
                            }
                        }
                    } else {
                        class229 var66 = null;
                        int var67;
                        class395 var68;
                        if (!var24) {
                            var67 = 15;
                            var68 = new class352(arg4, var12, arg0, arg2, var21, var20, var22, super.field5485, arg1, var13 + -1 + arg1, arg3, arg3 + var14 + -1, arg8, arg5, arg10);
                        } else {
                            class229 var69 = new class229(arg4, var12, arg0, arg2, var21, var20, var22, super.field5485, arg1, arg1 - (-var13 + 1), arg3, arg3 + var14 - 1, arg8, arg5, var23);
                            var68 = var69;
                            var66 = var69;
                            var67 = var69.method1359(0);
                        }
                        if (class117.method738(var68, false)) {
                            if (var66 != null && var66.method781(arg9 ^ -82)) {
                                var66.method786(arg4, true);
                            }
                            if (var12.field2937 && class202.field2680) {
                                if (var67 > 30) {
                                    var67 = 30;
                                }
                                for (int var70 = 0; ~var13 <= ~var70; ++var70) {
                                    for (int var71 = 0; ~var71 >= ~var14; ++var71) {
                                        var19.method1037(arg1 + var70, arg3 + var71, var67);
                                    }
                                }
                            }
                        }
                        if (var12.field2884 != 0 && arg7 != null) {
                            arg7.method1357(var12.field2875, !var12.field2896, var13, arg9 ^ -2259, arg1, var14, arg3);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tga", name = "b", descriptor = "(B)V")
    public static final void method1747(byte arg0) {
        class690 var1 = class301.field4258;
        synchronized (class301.field4258) {
            class301.field4258.method3906(-121);
        }
        ++field3742;
        class690 var2 = class684.field9509;
        synchronized (class684.field9509) {
            if (arg0 > -78) {
                field3734 = 1.1773831F;
            }
            class684.field9509.method3906(-126);
        }
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(ILha;BI)V")
    public static final void method1748(int arg0, class548 arg1, byte arg2, int arg3) {
        class453.field6283 = arg1;
        ++field3727;
        if (arg2 != 57) {
            method1741(-13);
        }
        class601.field8136 = new class121[arg0][arg3];
        if (class197.field2642 != null) {
            class731.field10162 = class122.method758(class197.field2642[2], 19585, class197.field2642[4], class197.field2642[0], class197.field2642[3], class197.field2642[1], class197.field2642[5]);
        }
        class483.field6736 = new class121();
        class306.method2007(0);
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(ZLha;I)V")
    public final void method1749(boolean arg0, class548 arg1, int arg2) {
        ++field3730;
        if (arg2 == 1) {
            class210.method1252();
            if (!arg0) {
                if (super.field5487 > 1) {
                    for (int var4 = 0; super.field5494 > var4; ++var4) {
                        for (int var5 = 0; super.field5490 > var5; ++var5) {
                            if (~(class692.field9623[1][var4][var5] & 2) == -3) {
                                class518.method3094(var4, var5);
                            }
                        }
                    }
                }
                for (int var6 = 0; ~var6 > ~super.field5487; ++var6) {
                    for (int var7 = 0; ~super.field5490 <= ~var7; ++var7) {
                        for (int var8 = 0; ~super.field5494 <= ~var8; ++var8) {
                            if (~(super.field5472[var6][var8][var7] & 4) != -1) {
                                int var9 = var8;
                                int var10 = var8;
                                int var11 = var7;
                                int var12 = var7;
                                while (var11 > 0 && (4 & super.field5472[var6][var8][var11 + -1]) != 0 && ~(var12 - var11) > -11) {
                                    --var11;
                                }
                                while (~super.field5490 < ~var12 && (super.field5472[var6][var8][var12 + 1] & 4) != 0 && ~(var12 - var11) > -11) {
                                    ++var12;
                                }
                                label117: while (~var9 < -1 && -var9 + var10 < 10) {
                                    for (int var13 = var11; ~var13 >= ~var12; ++var13) {
                                        if (~(super.field5472[var6][var9 + -1][var13] & 4) == -1) {
                                            break label117;
                                        }
                                    }
                                    --var9;
                                }
                                label104: while (~super.field5494 < ~var10 && var10 - var9 < 10) {
                                    for (int var14 = var11; ~var14 >= ~var12; ++var14) {
                                        if ((super.field5472[var6][var10 + 1][var14] & 4) == 0) {
                                            break label104;
                                        }
                                    }
                                    ++var10;
                                }
                                if ((-var9 + var10 + 1) * (-var11 + var12 + 1) >= 4) {
                                    int var15 = super.field5489[var6][var9][var11];
                                    class7.method34(var6, (var12 << 9) + 512, (var10 << 9) + 512, 22114, var11 << 9, var15, var9 << 9, var15, 4);
                                    for (int var16 = var9; var16 <= var10; ++var16) {
                                        for (int var17 = var11; ~var17 >= ~var12; ++var17) {
                                            super.field5472[var6][var16][var17] = (byte) class665.method3759(super.field5472[var6][var16][var17], -5);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                class210.method1250(arg2 ^ -25370);
            }
            super.field5472 = null;
        }
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(IIILha;Lnfa;II)V")
    public final void method1750(int arg0, int arg1, int arg2, class548 arg3, class228 arg4, int arg5, int arg6) {
        if (arg5 > -119) {
            this.method1750(81, 12, 100, (class548) null, (class228) null, 99, -44);
        }
        ++field3741;
        class722 var8 = this.method1745(-1, arg1, arg0, arg6, arg2);
        if (var8 != null) {
            class220 var9 = class20.field192.method716(6, var8.method782((byte) 115));
            int var10 = var8.method784(-4532);
            int var11 = var8.method794(109);
            if (var9.method1299(122)) {
                class443.method2710((byte) -83, arg0, arg6, arg1, var9);
            }
            if (var8.method781(-107)) {
                var8.method792(arg3, (byte) -127);
            }
            if (~arg2 == -1) {
                class476.method2899(arg1, arg0, arg6);
                if (var9.field2884 != 0) {
                    arg4.method1356(var11, var9.field2875, false, !var9.field2896, arg0, arg6, var10);
                }
                if (var9.field2945 == 1) {
                    if (~var11 == -1) {
                        class290.method1919(-18, arg6, arg1, arg0, 1);
                        return;
                    }
                    if (~var11 == -2) {
                        class290.method1919(-54, arg6 + 1, arg1, arg0, 2);
                        return;
                    }
                    if (~var11 == -3) {
                        class290.method1919(-74, arg6, arg1, arg0 + 1, 1);
                        return;
                    }
                    if (~var11 == -4) {
                        class290.method1919(-95, arg6, arg1, arg0, 2);
                        return;
                    }
                }
            } else if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (arg2 == 3) {
                        class211.method1255(arg1, arg0, arg6);
                        if (~var9.field2884 == -2) {
                            arg4.method1348(arg6, -262145, arg0);
                            return;
                        }
                    }
                    return;
                }
                class240.method1615(arg1, arg0, arg6, field3745 != null ? field3745 : (field3745 = method1751("bda")));
                if (~var9.field2884 != -1 && arg0 - -var9.field2938 < super.field5494 && ~super.field5490 < ~(var9.field2938 + arg6) && var9.field2887 + arg0 < super.field5494 && arg6 - -var9.field2887 < super.field5490) {
                    arg4.method1344(var11, var9.field2875, arg6, !var9.field2896, (byte) -68, var9.field2938, arg0, var9.field2887);
                }
                if (~var10 == -10) {
                    if (~(1 & var11) == -1) {
                        class290.method1919(-23, arg6, arg1, arg0, 8);
                        return;
                    }
                    class290.method1919(-95, arg6, arg1, arg0, 16);
                    return;
                }
            } else {
                class307.method2012(arg1, arg0, arg6);
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1751(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
