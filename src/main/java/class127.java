import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class127 extends class242 {

    @OriginalMember(owner = "client!nk", name = "X", descriptor = "I")
    private int field2222 = 6;

    @OriginalMember(owner = "client!nk", name = "V", descriptor = "[S")
    public static short[] field2220 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!nk", name = "Y", descriptor = "Lp;")
    public static class280 field2223 = class18.method140((byte) -126, "<col=ff0000>");

    @OriginalMember(owner = "client!nk", name = "ab", descriptor = "I")
    public static int field2225 = -1;

    @OriginalMember(owner = "client!nk", name = "R", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!nk", name = "S", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!nk", name = "T", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!nk", name = "U", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!nk", name = "W", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!nk", name = "Z", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!nk", name = "bb", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!nk", name = "cb", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IILlj;)V")
    public final void method49(int arg0, int arg1, class25 arg2) {
        if (arg1 != 0) {
            if (~arg1 == -2) {
                super.field4248 = ~arg2.method189((byte) -103) == -2;
            }
        } else {
            this.field2222 = arg2.method189((byte) -103);
        }
        if (arg0 > -119) {
            field2225 = -12;
        }
        ++field2216;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method71(boolean arg0, int arg1) {
        if (!arg0) {
            field2220 = null;
        }
        ++field2227;
        int[][] var3 = super.field4257.method917(arg1, 1);
        if (super.field4257.field2357) {
            int[][] var4 = this.method1648(26484, arg1, 0);
            int[][] var5 = this.method1648(26484, arg1, 1);
            int[] var6 = var3[2];
            int[] var7 = var3[1];
            int[] var8 = var4[0];
            int[] var9 = var4[1];
            int[] var10 = var3[0];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[2];
            int[] var14 = var5[1];
            int var15 = this.field2222;
            if (~var15 != -2) {
                if (~var15 != -3) {
                    if (var15 != 3) {
                        if (var15 != 4) {
                            if (var15 != 5) {
                                if (var15 != 6) {
                                    if (var15 != 7) {
                                        if (var15 != 8) {
                                            if (var15 != 9) {
                                                if (~var15 != -11) {
                                                    if (~var15 != -12) {
                                                        if (~var15 == -13) {
                                                            for (int var16 = 0; ~var16 > ~class264.field4654; ++var16) {
                                                                int var17 = var11[var16];
                                                                int var18 = var9[var16];
                                                                int var19 = var13[var16];
                                                                int var20 = var12[var16];
                                                                int var21 = var14[var16];
                                                                int var22 = var8[var16];
                                                                var10[var16] = var22 - (var20 * var22 >> 11) + var20;
                                                                var7[var16] = -(var18 * var21 >> 11) + var18 + var21;
                                                                var6[var16] = -(var17 * var19 >> 11) + var19 + var17;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; class264.field4654 > var23; ++var23) {
                                                            int var24 = var11[var23];
                                                            int var25 = var12[var23];
                                                            int var26 = var8[var23];
                                                            int var27 = var14[var23];
                                                            int var28 = var13[var23];
                                                            int var29 = var9[var23];
                                                            var10[var23] = var25 < var26 ? -var25 + var26 : -var26 + var25;
                                                            var7[var23] = var29 <= var27 ? -var29 + var27 : -var27 + var29;
                                                            var6[var23] = var28 >= var24 ? -var24 + var28 : -var28 + var24;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; class264.field4654 > var30; ++var30) {
                                                        int var31 = var11[var30];
                                                        int var32 = var13[var30];
                                                        int var33 = var12[var30];
                                                        int var34 = var8[var30];
                                                        int var35 = var14[var30];
                                                        int var36 = var9[var30];
                                                        var10[var30] = var33 >= var34 ? var33 : var34;
                                                        var7[var30] = var35 < var36 ? var36 : var35;
                                                        var6[var30] = ~var32 > ~var31 ? var31 : var32;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; ~var37 > ~class264.field4654; ++var37) {
                                                    int var38 = var8[var37];
                                                    int var39 = var12[var37];
                                                    int var40 = var14[var37];
                                                    int var41 = var9[var37];
                                                    int var42 = var11[var37];
                                                    int var43 = var13[var37];
                                                    var10[var37] = ~var38 <= ~var39 ? var39 : var38;
                                                    var7[var37] = ~var40 >= ~var41 ? var40 : var41;
                                                    var6[var37] = var42 < var43 ? var42 : var43;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; ~class264.field4654 < ~var44; ++var44) {
                                                int var45 = var9[var44];
                                                int var46 = var8[var44];
                                                int var47 = var11[var44];
                                                var10[var44] = var46 != 0 ? -((-var12[var44] + 4096 << 12) / var46) + 4096 : 0;
                                                var7[var44] = ~var45 == -1 ? 0 : -((-var14[var44] + 4096 << 12) / var45) + 4096;
                                                var6[var44] = ~var47 == -1 ? 0 : -((-var13[var44] + 4096 << 12) / var47) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; ~var48 > ~class264.field4654; ++var48) {
                                            int var49 = var9[var48];
                                            int var50 = var11[var48];
                                            int var51 = var8[var48];
                                            var10[var48] = var51 == 4096 ? 4096 : (var12[var48] << 12) / (-var51 + 4096);
                                            var7[var48] = var49 == 4096 ? 4096 : (var14[var48] << 12) / (-var49 + 4096);
                                            var6[var48] = ~var50 == -4097 ? 4096 : (var13[var48] << 12) / (-var50 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; class264.field4654 > var52; ++var52) {
                                        int var53 = var14[var52];
                                        int var54 = var12[var52];
                                        int var55 = var13[var52];
                                        var10[var52] = ~var54 <= -2049 ? -((-var8[var52] + 4096) * (-var54 + 4096) >> 11) + 4096 : var8[var52] * var54 >> 11;
                                        var7[var52] = var53 >= 2048 ? -((-var9[var52] + 4096) * (-var53 + 4096) >> 11) + 4096 : var9[var52] * var53 >> 11;
                                        var6[var52] = var55 >= 2048 ? -((-var11[var52] + 4096) * (-var55 + 4096) >> 11) + 4096 : var11[var52] * var55 >> 11;
                                    }
                                }
                            } else {
                                for (int var56 = 0; class264.field4654 > var56; ++var56) {
                                    var10[var56] = -((-var8[var56] + 4096) * (-var12[var56] + 4096) >> 12) + 4096;
                                    var7[var56] = -((4096 - var9[var56]) * (-var14[var56] + 4096) >> 12) + 4096;
                                    var6[var56] = -((4096 - var13[var56]) * (-var11[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; ~var57 > ~class264.field4654; ++var57) {
                                int var58 = var14[var57];
                                int var59 = var13[var57];
                                int var60 = var12[var57];
                                var10[var57] = ~var60 == -1 ? 4096 : (var8[var57] << 12) / var60;
                                var7[var57] = ~var58 == -1 ? 4096 : (var9[var57] << 12) / var58;
                                var6[var57] = var59 != 0 ? (var11[var57] << 12) / var59 : 4096;
                            }
                        }
                    } else {
                        for (int var61 = 0; class264.field4654 > var61; ++var61) {
                            var10[var61] = var8[var61] * var12[var61] >> 12;
                            var7[var61] = var9[var61] * var14[var61] >> 12;
                            var6[var61] = var11[var61] * var13[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~var62 > ~class264.field4654; ++var62) {
                        var10[var62] = var8[var62] + -var12[var62];
                        var7[var62] = var9[var62] + -var14[var62];
                        var6[var62] = var11[var62] + -var13[var62];
                    }
                }
            } else {
                for (int var63 = 0; var63 < class264.field4654; ++var63) {
                    var10[var63] = var8[var63] - -var12[var63];
                    var7[var63] = var9[var63] - -var14[var63];
                    var6[var63] = var11[var63] + var13[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIII)V")
    public static final void method876(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2217;
        if (~arg2 < ~arg0) {
            for (int var5 = arg0; arg2 > var5; ++var5) {
                class91.field1484[var5][arg4] = arg1;
            }
        } else {
            for (int var6 = arg2; ~arg0 < ~var6; ++var6) {
                class91.field1484[var6][arg4] = arg1;
            }
        }
        if (arg3 != 4096) {
            field2225 = -119;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIILoe;ILoc;Lob;)V")
    public static final void method877(int arg0, int arg1, int arg2, int arg3, class142 arg4, int arg5, class61 arg6, class130 arg7) {
        ++field2219;
        class23 var8 = new class23();
        var8.field420 = arg3;
        var8.field424 = arg1 * 128;
        var8.field430 = arg0 * arg2;
        if (arg7 == null) {
            if (arg6 != null) {
                class255 var11 = arg6.field987;
                var8.field415 = arg6;
                if (var11.field4516 != null) {
                    var8.field421 = true;
                    var11 = var11.method1717(false);
                }
                if (var11 != null) {
                    var8.field425 = (arg0 - -var11.field4489) * 128;
                    var8.field423 = (arg1 - -var11.field4489) * 128;
                    var8.field417 = class44.method339(arg6, (byte) 112);
                    var8.field429 = var11.field4518 * 128;
                }
                class38.field678.method649(var8, (byte) 102);
            } else if (arg4 != null) {
                var8.field418 = arg4;
                var8.field423 = (arg1 - -arg4.method984((byte) -34)) * 128;
                var8.field425 = (arg0 - -arg4.method984((byte) -34)) * 128;
                var8.field417 = class68.method464(0, arg4);
                var8.field429 = arg4.field2485 * 128;
                class83.field1370.method148(-1, var8, arg4.field2458.method1896(104));
            }
        } else {
            var8.field414 = arg7.field2258;
            var8.field428 = arg7;
            var8.field417 = arg7.field2318;
            int var9 = arg7.field2277;
            var8.field426 = arg7.field2273;
            var8.field429 = arg7.field2310 * 128;
            int var10 = arg7.field2265;
            if (arg5 == 1 || arg5 == 3) {
                var10 = arg7.field2277;
                var9 = arg7.field2265;
            }
            var8.field425 = (arg0 - -var10) * 128;
            var8.field409 = arg7.field2317;
            var8.field423 = (arg1 + var9) * 128;
            if (arg7.field2269 != null) {
                var8.field421 = true;
                var8.method174((byte) -30);
            }
            if (var8.field414 != null) {
                var8.field410 = (int) (Math.random() * (double) (-var8.field409 + var8.field426)) + var8.field409;
            }
            class13.field259.method649(var8, (byte) 94);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)V")
    public static void method878(byte arg0) {
        field2220 = null;
        field2223 = null;
        if (arg0 != 114) {
            field2223 = null;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIZIII)Lde;")
    public static final class108 method879(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg5 >= -23) {
            return null;
        } else {
            ++field2221;
            int var7 = (arg2 ? 65536 : 0) + arg0 + ((arg4 << 17) - -(arg1 << 19));
            long var8 = (long) arg3 * 3147483667L - -((long) var7 * 3849834839L);
            class108 var10 = (class108) class232.field4046.method1480((byte) 50, var8);
            if (var10 != null) {
                return var10;
            } else {
                class146.field2552 = false;
                class108 var11 = class169.method1178(arg4, false, arg0, arg3, -5154, false, arg1, arg2);
                if (var11 != null && !class146.field2552) {
                    class232.field4046.method1483((byte) -101, var8, var11);
                }
                return var11;
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)[I")
    public final int[] method54(int arg0, int arg1) {
        ++field2224;
        int var3 = -23 % ((73 - arg1) / 41);
        int[] var4 = super.field4251.method1417((byte) 102, arg0);
        if (super.field4251.field3655) {
            int[] var5 = this.method1647(0, arg0, 48);
            int[] var6 = this.method1647(1, arg0, 48);
            int var7 = this.field2222;
            if (var7 != 1) {
                if (var7 != 2) {
                    if (var7 != 3) {
                        if (~var7 != -5) {
                            if (~var7 != -6) {
                                if (var7 != 6) {
                                    if (~var7 != -8) {
                                        if (var7 != 8) {
                                            if (~var7 != -10) {
                                                if (~var7 != -11) {
                                                    if (var7 != 11) {
                                                        if (var7 == 12) {
                                                            for (int var8 = 0; ~var8 > ~class264.field4654; ++var8) {
                                                                int var9 = var6[var8];
                                                                int var10 = var5[var8];
                                                                var4[var8] = -(var9 * var10 >> 11) + var10 - -var9;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var11 = 0; ~class264.field4654 < ~var11; ++var11) {
                                                            int var12 = var5[var11];
                                                            int var13 = var6[var11];
                                                            var4[var11] = ~var12 >= ~var13 ? -var12 + var13 : -var13 + var12;
                                                        }
                                                    }
                                                } else {
                                                    for (int var14 = 0; ~class264.field4654 < ~var14; ++var14) {
                                                        int var15 = var5[var14];
                                                        int var16 = var6[var14];
                                                        var4[var14] = var16 >= var15 ? var16 : var15;
                                                    }
                                                }
                                            } else {
                                                for (int var17 = 0; ~class264.field4654 < ~var17; ++var17) {
                                                    int var18 = var5[var17];
                                                    int var19 = var6[var17];
                                                    var4[var17] = ~var19 >= ~var18 ? var19 : var18;
                                                }
                                            }
                                        } else {
                                            for (int var20 = 0; var20 < class264.field4654; ++var20) {
                                                int var21 = var5[var20];
                                                var4[var20] = var21 == 0 ? 0 : -((-var6[var20] + 4096 << 12) / var21) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var22 = 0; ~class264.field4654 < ~var22; ++var22) {
                                            int var23 = var5[var22];
                                            var4[var22] = var23 != 4096 ? (var6[var22] << 12) / (-var23 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var24 = 0; class264.field4654 > var24; ++var24) {
                                        int var25 = var6[var24];
                                        var4[var24] = var25 >= 2048 ? -((4096 - var5[var24]) * (-var25 + 4096) >> 11) + 4096 : var5[var24] * var25 >> 11;
                                    }
                                }
                            } else {
                                for (int var26 = 0; var26 < class264.field4654; ++var26) {
                                    var4[var26] = 4096 - ((-var5[var26] + 4096) * (-var6[var26] + 4096) >> 12);
                                }
                            }
                        } else {
                            for (int var27 = 0; ~class264.field4654 < ~var27; ++var27) {
                                int var28 = var6[var27];
                                var4[var27] = var28 != 0 ? (var5[var27] << 12) / var28 : 4096;
                            }
                        }
                    } else {
                        for (int var29 = 0; var29 < class264.field4654; ++var29) {
                            var4[var29] = var5[var29] * var6[var29] >> 12;
                        }
                    }
                } else {
                    for (int var30 = 0; class264.field4654 > var30; ++var30) {
                        var4[var30] = var5[var30] + -var6[var30];
                    }
                }
            } else {
                for (int var31 = 0; ~class264.field4654 < ~var31; ++var31) {
                    var4[var31] = var5[var31] + var6[var31];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ILp;I)V")
    public static final void method880(int arg0, class280 arg1, int arg2) {
        if (arg0 >= -84) {
            method880(-126, (class280) null, 51);
        }
        ++field2226;
        class157 var3 = class257.method1740(arg2, (byte) -61, 3);
        var3.method1112((byte) 125);
        var3.field2734 = arg1;
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "()V")
    public class127() {
        super(2, false);
    }
}
