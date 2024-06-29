import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class257 extends class243 {

    @OriginalMember(owner = "client!ob", name = "gb", descriptor = "I")
    private int field4501 = 6;

    @OriginalMember(owner = "client!ob", name = "cb", descriptor = "[J")
    public static long[] field4497 = new long[256];

    @OriginalMember(owner = "client!ob", name = "hb", descriptor = "Lrb;")
    public static class254 field4502;

    @OriginalMember(owner = "client!ob", name = "kb", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!ob", name = "Y", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!ob", name = "Z", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!ob", name = "ab", descriptor = "I")
    public static int field4495;

    @OriginalMember(owner = "client!ob", name = "bb", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!ob", name = "db", descriptor = "I")
    public static int field4498;

    @OriginalMember(owner = "client!ob", name = "eb", descriptor = "I")
    public static int field4499;

    @OriginalMember(owner = "client!ob", name = "fb", descriptor = "I")
    public static int field4500;

    @OriginalMember(owner = "client!ob", name = "ib", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!ob", name = "jb", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!ob", name = "lb", descriptor = "[[[I")
    public static int[][][] field4506;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZI)V")
    public static final void method1744(boolean arg0, int arg1) {
        byte var2;
        if (arg0) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        ++field4498;
        class176.field2932 = new int[104];
        class123.field2215 = new byte[var2][104][104];
        class245.field4276 = new byte[var2][arg1][104];
        class119.field2161 = new int[104];
        class119.field2177 = 99;
        class186.field3171 = new int[104];
        class147.field2535 = new byte[var2][104][104];
        class246.field4299 = new int[104];
        class40.field650 = new int[104];
        class132.field2302 = new byte[var2][104][104];
        class51.field895 = new byte[var2][105][105];
        class149.field2612 = new int[var2][105][105];
    }

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "(I)V")
    public static void method1745(int arg0) {
        field4497 = null;
        if (arg0 == 64) {
            field4502 = null;
            field4506 = null;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lnj;ZI)V")
    public final void method81(class226 arg0, boolean arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 == 1) {
                super.field4230 = arg0.method1471(255) == 1;
            }
        } else {
            this.field4501 = arg0.method1471(255);
        }
        ++field4503;
        if (arg1) {
            method1747(-73, -13, 54, (byte) 105, (class225) null);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I[B)V")
    public static final void method1746(int arg0, byte[] arg1) {
        ++field4495;
        int var2 = 0;
        int var3 = 30 / ((-80 - arg0) / 33);
        while (true) {
            while (~arg1.length < ~var2) {
                int var4 = -class86.field1492 + arg1[var2++] * 64;
                int var5 = -field4499 + 64 * arg1[var2++];
                if (~var4 < -1 && var5 > 0 && class249.field4322 > var4 + 64 && ~class45.field753 < ~(var5 + 64)) {
                    int var6 = -var5 + class45.field753 - 1 >> 6;
                    int var7 = var4 >> 6;
                    for (int var8 = 0; var8 < 64; ++var8) {
                        for (int var9 = -64; ~var9 > -1; ++var9) {
                            byte var10 = arg1[var2++];
                            if (~var10 != -1) {
                                if (~(1 & var10) == -2) {
                                    byte var11 = arg1[var2++];
                                    if (class73.field1272[var7][var6] == null) {
                                        class73.field1272[var7][var6] = new byte[4096];
                                    }
                                    class73.field1272[var7][var6][(-(var9 + 1) << 6) - -var8] = (byte) var11;
                                }
                                if (~(var10 & 2) == -3) {
                                    byte var12 = arg1[var2++];
                                    if (class197.field3383[var7][var6] == null) {
                                        class197.field3383[var7][var6] = new byte[4096];
                                    }
                                    class197.field3383[var7][var6][(-(var9 + 1) << 6) + var8] = (byte) (var12 + -28);
                                }
                                if (~(var10 & 4) == -5) {
                                    var2 += 3;
                                    int var13 = (255 & arg1[var2 - 1]) + (65280 & arg1[var2 - 2] << 8) + (arg1[var2 - 3] << 16 & 16711680);
                                    if (class240.field4182[var7][var6] == null) {
                                        class240.field4182[var7][var6] = new int[4096];
                                    }
                                    --var13;
                                    class45 var14 = class220.method1389(var13, (byte) -96);
                                    if (var14.field754 != null) {
                                        var14 = var14.method242(64);
                                        if (var14 == null || ~var14.field746 == 0) {
                                            continue;
                                        }
                                    }
                                    class240.field4182[var7][var6][(-(var9 + 1) << 6) + var8] = var14.field743 + 1;
                                    class210 var15 = new class210();
                                    var15.field3558 = var14.field746;
                                    var15.field3563 = var4;
                                    var15.field3565 = class45.field753 - var5;
                                    class36.field593.method1272(5664, var15);
                                }
                            }
                        }
                    }
                } else {
                    for (int var16 = 0; var16 < 64; ++var16) {
                        for (int var17 = -64; var17 < 0; ++var17) {
                            byte var18 = arg1[var2++];
                            if (var18 != 0) {
                                if (~(1 & var18) == -2) {
                                    ++var2;
                                }
                                if (~(var18 & 2) == -3) {
                                    ++var2;
                                }
                                if (~(4 & var18) == -5) {
                                    var2 += 3;
                                }
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIBLqa;)V")
    public static final void method1747(int arg0, int arg1, int arg2, byte arg3, class225 arg4) {
        ++field4504;
        if (arg3 >= 44) {
            if (class216.field3639 != arg4) {
                if (~class94.field1631 > -401) {
                    class227 var5;
                    if (arg4.field3800 == 0) {
                        var5 = class76.method445((byte) -105, new class227[] { arg4.field3819, class36.method194(class216.field3639.field3802, (byte) 124, arg4.field3802), class178.field3020, class151.field2630, class204.method1303(arg4.field3802, 1), class27.field447 });
                    } else {
                        var5 = class76.method445((byte) -98, new class227[] { arg4.field3819, class178.field3020, class248.field4316, class204.method1303(arg4.field3800, 1), class27.field447 });
                    }
                    if (class122.field2199 != 1) {
                        if (!class57.field1050) {
                            for (int var6 = 7; ~var6 <= -1; --var6) {
                                if (class92.field1574[var6] != null) {
                                    short var7 = 0;
                                    if (~class106.field2001 == -1 && class92.field1574[var6].method1522(class57.field1053, (byte) -56)) {
                                        if (class216.field3639.field3802 < arg4.field3802) {
                                            var7 = 2000;
                                        }
                                        if (class216.field3639.field3832 != 0 && ~arg4.field3832 != -1) {
                                            if (class216.field3639.field3832 != arg4.field3832) {
                                                var7 = 0;
                                            } else {
                                                var7 = 2000;
                                            }
                                        }
                                    } else if (class14.field271[var6]) {
                                        var7 = 2000;
                                    }
                                    ++class58.field1073;
                                    boolean var8 = false;
                                    short var9 = class97.field1707[var6];
                                    short var10 = (short) (var7 + var9);
                                    class92.method538(arg0, class76.method445((byte) 105, new class227[] { class221.field3743, var5 }), arg1, var10, class92.field1574[var6], (long) arg2, (byte) -31);
                                }
                            }
                        } else if ((class177.field2983 & 8) == 8) {
                            ++class103.field1800;
                            class92.method538(arg0, class76.method445((byte) -103, new class227[] { class149.field2608, class96.field1675, var5 }), arg1, (short) 48, class88.field1528, (long) arg2, (byte) -31);
                        }
                    } else {
                        class92.method538(arg0, class76.method445((byte) -114, new class227[] { class184.field3130, class96.field1675, var5 }), arg1, (short) 11, class40.field651, (long) arg2, (byte) -31);
                        ++class28.field451;
                    }
                    for (int var11 = 0; ~class94.field1631 < ~var11; ++var11) {
                        if (~class19.field327[var11] == -40) {
                            class213.field3607[var11] = class76.method445((byte) 42, new class227[] { class221.field3743, var5 });
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V")
    public class257() {
        super(2, false);
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(II)[I")
    public final int[] method77(int arg0, int arg1) {
        ++field4493;
        int var3 = -106 % ((-15 - arg0) / 51);
        int[] var4 = super.field4215.method984(arg1, 0);
        if (super.field4215.field2707) {
            int[] var5 = this.method1614(0, arg1, 107);
            int[] var6 = this.method1614(1, arg1, 97);
            int var7 = this.field4501;
            if (~var7 != -2) {
                if (~var7 != -3) {
                    if (~var7 != -4) {
                        if (~var7 != -5) {
                            if (~var7 != -6) {
                                if (var7 != 6) {
                                    if (~var7 != -8) {
                                        if (var7 != 8) {
                                            if (var7 != 9) {
                                                if (~var7 != -11) {
                                                    if (var7 != 11) {
                                                        if (~var7 == -13) {
                                                            for (int var8 = 0; ~var8 > ~class212.field3586; ++var8) {
                                                                int var9 = var5[var8];
                                                                int var10 = var6[var8];
                                                                var4[var8] = var10 - (var9 * var10 >> 11) + var9;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var11 = 0; var11 < class212.field3586; ++var11) {
                                                            int var12 = var5[var11];
                                                            int var13 = var6[var11];
                                                            var4[var11] = ~var12 < ~var13 ? -var13 + var12 : -var12 + var13;
                                                        }
                                                    }
                                                } else {
                                                    for (int var14 = 0; ~class212.field3586 < ~var14; ++var14) {
                                                        int var15 = var6[var14];
                                                        int var16 = var5[var14];
                                                        var4[var14] = var16 <= var15 ? var15 : var16;
                                                    }
                                                }
                                            } else {
                                                for (int var17 = 0; var17 < class212.field3586; ++var17) {
                                                    int var18 = var6[var17];
                                                    int var19 = var5[var17];
                                                    var4[var17] = ~var19 <= ~var18 ? var18 : var19;
                                                }
                                            }
                                        } else {
                                            for (int var20 = 0; var20 < class212.field3586; ++var20) {
                                                int var21 = var5[var20];
                                                var4[var20] = var21 == 0 ? 0 : 4096 - (4096 - var6[var20] << 12) / var21;
                                            }
                                        }
                                    } else {
                                        for (int var22 = 0; ~var22 > ~class212.field3586; ++var22) {
                                            int var23 = var5[var22];
                                            var4[var22] = ~var23 == -4097 ? 4096 : (var6[var22] << 12) / (-var23 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var24 = 0; var24 < class212.field3586; ++var24) {
                                        int var25 = var6[var24];
                                        var4[var24] = var25 < 2048 ? var5[var24] * var25 >> 11 : -((4096 - var25) * (-var5[var24] + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var26 = 0; var26 < class212.field3586; ++var26) {
                                    var4[var26] = 4096 - ((4096 - var5[var26]) * (-var6[var26] + 4096) >> 12);
                                }
                            }
                        } else {
                            for (int var27 = 0; var27 < class212.field3586; ++var27) {
                                int var28 = var6[var27];
                                var4[var27] = var28 != 0 ? (var5[var27] << 12) / var28 : 4096;
                            }
                        }
                    } else {
                        for (int var29 = 0; ~class212.field3586 < ~var29; ++var29) {
                            var4[var29] = var5[var29] * var6[var29] >> 12;
                        }
                    }
                } else {
                    for (int var30 = 0; ~class212.field3586 < ~var30; ++var30) {
                        var4[var30] = var5[var30] + -var6[var30];
                    }
                }
            } else {
                for (int var31 = 0; ~var31 > ~class212.field3586; ++var31) {
                    var4[var31] = var5[var31] - -var6[var31];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(Z)V")
    public static final void method1748(boolean arg0) {
        class31.field498.method1723(-4173);
        ++field4496;
        if (arg0) {
            method1744(true, 46);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)[[I")
    public final int[][] method80(int arg0, int arg1) {
        if (arg0 != 230) {
            field4499 = 111;
        }
        ++field4500;
        int[][] var3 = super.field4213.method1406(arg1, 0);
        if (super.field4213.field3771) {
            int[][] var4 = this.method1616(arg0 + -231, arg1, 0);
            int[][] var5 = this.method1616(arg0 + -231, arg1, 1);
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            int[] var8 = var3[0];
            int[] var9 = var4[1];
            int[] var10 = var4[0];
            int[] var11 = var4[2];
            int[] var12 = var5[2];
            int[] var13 = var5[1];
            int[] var14 = var5[0];
            int var15 = this.field4501;
            if (~var15 != -2) {
                if (var15 != 2) {
                    if (~var15 != -4) {
                        if (var15 != 4) {
                            if (var15 != 5) {
                                if (var15 != 6) {
                                    if (~var15 != -8) {
                                        if (~var15 != -9) {
                                            if (~var15 != -10) {
                                                if (var15 != 10) {
                                                    if (var15 != 11) {
                                                        if (~var15 == -13) {
                                                            for (int var16 = 0; var16 < class212.field3586; ++var16) {
                                                                int var17 = var11[var16];
                                                                int var18 = var10[var16];
                                                                int var19 = var13[var16];
                                                                int var20 = var12[var16];
                                                                int var21 = var14[var16];
                                                                int var22 = var9[var16];
                                                                var8[var16] = var21 - (var18 * var21 >> 11) + var18;
                                                                var6[var16] = var22 - (var19 * var22 >> 11) + var19;
                                                                var7[var16] = -(var17 * var20 >> 11) + var20 + var17;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; ~var23 > ~class212.field3586; ++var23) {
                                                            int var24 = var13[var23];
                                                            int var25 = var11[var23];
                                                            int var26 = var9[var23];
                                                            int var27 = var10[var23];
                                                            int var28 = var12[var23];
                                                            int var29 = var14[var23];
                                                            var8[var23] = ~var27 >= ~var29 ? -var27 + var29 : -var29 + var27;
                                                            var6[var23] = var24 >= var26 ? -var26 + var24 : -var24 + var26;
                                                            var7[var23] = var25 <= var28 ? var28 - var25 : var25 - var28;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; ~class212.field3586 < ~var30; ++var30) {
                                                        int var31 = var11[var30];
                                                        int var32 = var13[var30];
                                                        int var33 = var9[var30];
                                                        int var34 = var14[var30];
                                                        int var35 = var12[var30];
                                                        int var36 = var10[var30];
                                                        var8[var30] = ~var34 > ~var36 ? var36 : var34;
                                                        var6[var30] = ~var32 > ~var33 ? var33 : var32;
                                                        var7[var30] = var35 < var31 ? var31 : var35;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; ~var37 > ~class212.field3586; ++var37) {
                                                    int var38 = var12[var37];
                                                    int var39 = var14[var37];
                                                    int var40 = var9[var37];
                                                    int var41 = var13[var37];
                                                    int var42 = var11[var37];
                                                    int var43 = var10[var37];
                                                    var8[var37] = var39 <= var43 ? var39 : var43;
                                                    var6[var37] = var40 >= var41 ? var41 : var40;
                                                    var7[var37] = var42 < var38 ? var42 : var38;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; ~var44 > ~class212.field3586; ++var44) {
                                                int var45 = var11[var44];
                                                int var46 = var9[var44];
                                                int var47 = var10[var44];
                                                var8[var44] = ~var47 == -1 ? 0 : -((4096 - var14[var44] << 12) / var47) + 4096;
                                                var6[var44] = ~var46 == -1 ? 0 : 4096 - (-var13[var44] + 4096 << 12) / var46;
                                                var7[var44] = ~var45 == -1 ? 0 : 4096 - (-var12[var44] + 4096 << 12) / var45;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; ~var48 > ~class212.field3586; ++var48) {
                                            int var49 = var11[var48];
                                            int var50 = var10[var48];
                                            int var51 = var9[var48];
                                            var8[var48] = var50 != 4096 ? (var14[var48] << 12) / (4096 - var50) : 4096;
                                            var6[var48] = var51 != 4096 ? (var13[var48] << 12) / (-var51 + 4096) : 4096;
                                            var7[var48] = var49 != 4096 ? (var12[var48] << 12) / (-var49 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; ~var52 > ~class212.field3586; ++var52) {
                                        int var53 = var14[var52];
                                        int var54 = var13[var52];
                                        int var55 = var12[var52];
                                        var8[var52] = ~var53 > -2049 ? var10[var52] * var53 >> 11 : -((4096 - var53) * (-var10[var52] + 4096) >> 11) + 4096;
                                        var6[var52] = ~var54 <= -2049 ? 4096 - ((-var9[var52] + 4096) * (-var54 + 4096) >> 11) : var9[var52] * var54 >> 11;
                                        var7[var52] = ~var55 > -2049 ? var11[var52] * var55 >> 11 : -((-var11[var52] + 4096) * (-var55 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var56 = 0; ~class212.field3586 < ~var56; ++var56) {
                                    var8[var56] = -((-var10[var56] + 4096) * (-var14[var56] + 4096) >> 12) + 4096;
                                    var6[var56] = -((4096 - var13[var56]) * (-var9[var56] + 4096) >> 12) + 4096;
                                    var7[var56] = 4096 - ((4096 - var11[var56]) * (-var12[var56] + 4096) >> 12);
                                }
                            }
                        } else {
                            for (int var57 = 0; class212.field3586 > var57; ++var57) {
                                int var58 = var12[var57];
                                int var59 = var14[var57];
                                int var60 = var13[var57];
                                var8[var57] = ~var59 != -1 ? (var10[var57] << 12) / var59 : 4096;
                                var6[var57] = var60 != 0 ? (var9[var57] << 12) / var60 : 4096;
                                var7[var57] = var58 == 0 ? 4096 : (var11[var57] << 12) / var58;
                            }
                        }
                    } else {
                        for (int var61 = 0; ~var61 > ~class212.field3586; ++var61) {
                            var8[var61] = var10[var61] * var14[var61] >> 12;
                            var6[var61] = var9[var61] * var13[var61] >> 12;
                            var7[var61] = var11[var61] * var12[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~var62 > ~class212.field3586; ++var62) {
                        var8[var62] = var10[var62] + -var14[var62];
                        var6[var62] = var9[var62] + -var13[var62];
                        var7[var62] = var11[var62] - var12[var62];
                    }
                }
            } else {
                for (int var63 = 0; var63 < class212.field3586; ++var63) {
                    var8[var63] = var10[var63] + var14[var63];
                    var6[var63] = var9[var63] + var13[var63];
                    var7[var63] = var11[var63] - -var12[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Ljava/lang/String;I)Lub;")
    public static final class227 method1749(String arg0, int arg1) {
        ++field4494;
        byte[] var2 = arg0.getBytes();
        int var3 = var2.length;
        class227 var4 = new class227();
        if (arg1 != 17263) {
            field4505 = -5;
        }
        int var5 = 0;
        var4.field3955 = new byte[var3];
        while (var3 > var5) {
            int var6 = 255 & var2[var5++];
            if (var6 <= 45 && ~var6 <= -41) {
                if (~var3 >= ~var5) {
                    break;
                }
                int var7 = 255 & var2[var5++];
                var4.field3955[var4.field3915++] = (byte) ((var6 + -40) * 43 + (var7 - 48));
            } else if (var6 != 0) {
                var4.field3955[var4.field3915++] = (byte) var6;
            }
        }
        var4.method1488(arg1 + -17233);
        return var4.method1509(arg1 ^ 21359);
    }

    static {
        for (int var0 = 0; ~var0 > -257; ++var0) {
            long var1 = (long) var0;
            for (int var3 = 0; ~var3 > -9; ++var3) {
                if ((var1 & 1L) == 1L) {
                    var1 = var1 >>> 1 ^ -3932672073523589310L;
                } else {
                    var1 >>>= 1;
                }
            }
            field4497[var0] = var1;
        }
        field4502 = new class254(64);
        field4505 = -2;
    }
}
