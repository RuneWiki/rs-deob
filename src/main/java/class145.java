import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class145 extends class82 {

    @OriginalMember(owner = "client!nd", name = "P", descriptor = "I")
    private int field2552 = 6;

    @OriginalMember(owner = "client!nd", name = "T", descriptor = "Lke;")
    public static class114 field2556 = new class114(0, 0);

    @OriginalMember(owner = "client!nd", name = "X", descriptor = "I")
    public static int field2560 = 0;

    @OriginalMember(owner = "client!nd", name = "ab", descriptor = "Ldj;")
    private static class44 field2563 = class89.method650(255, " from your friend list first)3");

    @OriginalMember(owner = "client!nd", name = "Y", descriptor = "Ldj;")
    public static class44 field2561 = field2563;

    @OriginalMember(owner = "client!nd", name = "cb", descriptor = "Ldj;")
    public static class44 field2565 = class89.method650(255, "blaugr-Un:");

    @OriginalMember(owner = "client!nd", name = "bb", descriptor = "Ldj;")
    public static class44 field2564 = class89.method650(255, "Der Server wird gerade aktualisiert)3");

    @OriginalMember(owner = "client!nd", name = "Q", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!nd", name = "R", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!nd", name = "S", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!nd", name = "U", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!nd", name = "V", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!nd", name = "Z", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!nd", name = "W", descriptor = "Lnf;")
    public static class147 field2559;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(II)[I")
    public final int[] method3(int arg0, int arg1) {
        ++field2553;
        if (arg0 != 25238) {
            field2556 = null;
        }
        int[] var3 = super.field1595.method603(true, arg1);
        if (super.field1595.field1538) {
            int[] var4 = this.method620(2652, arg1, 0);
            int[] var5 = this.method620(2652, arg1, 1);
            int var6 = this.field2552;
            if (~var6 != -2) {
                if (var6 != 2) {
                    if (var6 != 3) {
                        if (var6 != 4) {
                            if (var6 != 5) {
                                if (~var6 != -7) {
                                    if (~var6 != -8) {
                                        if (var6 != 8) {
                                            if (~var6 != -10) {
                                                if (~var6 != -11) {
                                                    if (~var6 != -12) {
                                                        if (var6 == 12) {
                                                            for (int var7 = 0; var7 < class129.field2287; ++var7) {
                                                                int var8 = var4[var7];
                                                                int var9 = var5[var7];
                                                                var3[var7] = -(var8 * var9 >> 11) + var9 + var8;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; ~var10 > ~class129.field2287; ++var10) {
                                                            int var11 = var4[var10];
                                                            int var12 = var5[var10];
                                                            var3[var10] = ~var11 < ~var12 ? -var12 + var11 : -var11 + var12;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; class129.field2287 > var13; ++var13) {
                                                        int var14 = var5[var13];
                                                        int var15 = var4[var13];
                                                        var3[var13] = ~var15 < ~var14 ? var15 : var14;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; var16 < class129.field2287; ++var16) {
                                                    int var17 = var5[var16];
                                                    int var18 = var4[var16];
                                                    var3[var16] = var18 >= var17 ? var17 : var18;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; class129.field2287 > var19; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = ~var20 == -1 ? 0 : -((4096 - var5[var19] << 12) / var20) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; ~var21 > ~class129.field2287; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = ~var22 != -4097 ? (var5[var21] << 12) / (4096 - var22) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; var23 < class129.field2287; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = ~var24 <= -2049 ? -((4096 - var24) * (-var4[var23] + 4096) >> 11) + 4096 : var4[var23] * var24 >> 11;
                                    }
                                }
                            } else {
                                for (int var25 = 0; ~var25 > ~class129.field2287; ++var25) {
                                    var3[var25] = -((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; var26 < class129.field2287; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = ~var27 == -1 ? 4096 : (var4[var26] << 12) / var27;
                            }
                        }
                    } else {
                        for (int var28 = 0; ~class129.field2287 < ~var28; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; class129.field2287 > var29; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; ~class129.field2287 < ~var30; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lfj;IB)V")
    public final void method2(class66 arg0, int arg1, byte arg2) {
        if (~arg1 != -1) {
            if (arg1 == 1) {
                super.field1599 = arg0.method506(255) == 1;
            }
        } else {
            this.field2552 = arg0.method506(255);
        }
        if (arg2 != 68) {
            this.method6(-82, 100);
        }
        ++field2557;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)V")
    public static final void method952(boolean arg0) {
        ++field2554;
        try {
            if (class228.field4285 == 0) {
                if (class101.field1844 != null) {
                    class101.field1844.method778((byte) -113);
                    class101.field1844 = null;
                }
                class39.field748 = 0;
                class19.field323 = null;
                class228.field4285 = 1;
                class82.field1596 = false;
            }
            if (!arg0) {
                method952(false);
            }
            if (~class228.field4285 == -2) {
                if (class19.field323 == null) {
                    class19.field323 = class83.field1627.method1502(class2.field30, class80.field1542, -17012);
                }
                if (class19.field323.field3043 == 2) {
                    throw new IOException();
                }
                if (~class19.field323.field3043 == -2) {
                    class101.field1844 = new class108((Socket) class19.field323.field3040, class83.field1627);
                    class228.field4285 = 2;
                    class19.field323 = null;
                }
            }
            if (~class228.field4285 == -3) {
                long var1 = class101.field1840 = class182.field3177.method306(-58);
                int var3 = (int) (var1 >> 16 & 31L);
                class200.field3542.field1195 = 0;
                class200.field3542.method488(120, 14);
                class200.field3542.method488(123, var3);
                class101.field1844.method782(64, class200.field3542.field1219, 2, 0);
                class228.field4285 = 3;
                class218.field3957.field1195 = 0;
            }
            if (class228.field4285 == 3) {
                if (class39.field746 != null) {
                    class39.field746.method1068(false);
                }
                if (class46.field869 != null) {
                    class46.field869.method1068(false);
                }
                int var4 = class101.field1844.method781(-125);
                if (class39.field746 != null) {
                    class39.field746.method1068(!arg0);
                }
                if (class46.field869 != null) {
                    class46.field869.method1068(false);
                }
                if (~var4 != -1) {
                    class200.method1294(-3680, var4);
                    return;
                }
                class228.field4285 = 4;
                class218.field3957.field1195 = 0;
            }
            if (class228.field4285 == 4) {
                if (class218.field3957.field1195 < 8) {
                    int var5 = class101.field1844.method783(arg0);
                    if (~(-class218.field3957.field1195 + 8) > ~var5) {
                        var5 = -class218.field3957.field1195 + 8;
                    }
                    if (~var5 < -1) {
                        class101.field1844.method784(class218.field3957.field1219, class218.field3957.field1195, var5, (byte) -126);
                        class218.field3957.field1195 += var5;
                    }
                }
                if (class218.field3957.field1195 == 8) {
                    class218.field3957.field1195 = 0;
                    class225.field4235 = class218.field3957.method491((byte) -22);
                    class228.field4285 = 5;
                }
            }
            if (class228.field4285 == 5) {
                class200.field3542.field1195 = 0;
                int[] var6 = new int[] { (int) (9.9999999E7D * Math.random()), (int) (9.9999999E7D * Math.random()), (int) (class225.field4235 >> 32), (int) class225.field4235 };
                class200.field3542.method488(121, 10);
                class200.field3542.method489(var6[0], -116);
                class200.field3542.method489(var6[1], -26);
                class200.field3542.method489(var6[2], -38);
                class200.field3542.method489(var6[3], -89);
                class200.field3542.method536(class182.field3177.method306(-58), 40);
                class200.field3542.method492(7527, class182.field3167);
                class200.field3542.method503(111, class207.field3710, class215.field3916);
                client.field604.field1195 = 0;
                if (class183.field3191 != 40) {
                    client.field604.method488(122, 16);
                } else {
                    client.field604.method488(119, 18);
                }
                client.field604.method488(121, class200.field3542.field1195 + 129 + class32.method221(63, class103.field1890));
                client.field604.method489(494, -40);
                client.field604.method488(123, !class33.field583 ? 0 : 1);
                class182.method1144((byte) -114, client.field604);
                client.field604.method492(7527, class103.field1890);
                client.field604.method489(class72.field1372, -24);
                client.field604.method489(class21.field359.field4214, -67);
                client.field604.method489(class108.field1993.field4214, -56);
                client.field604.method489(class227.field4272.field4214, -118);
                client.field604.method489(class201.field3555.field4214, -32);
                client.field604.method489(class62.field1159.field4214, -112);
                client.field604.method489(class208.field3736.field4214, -66);
                client.field604.method489(class211.field3797.field4214, -121);
                client.field604.method489(class81.field1571.field4214, -22);
                client.field604.method489(class48.field902.field4214, -64);
                client.field604.method489(class200.field3540.field4214, -58);
                client.field604.method489(class112.field2021.field4214, -99);
                client.field604.method489(class102.field1856.field4214, -64);
                client.field604.method489(class61.field1138.field4214, -20);
                client.field604.method489(field2559.field4214, -100);
                client.field604.method489(class166.field2853.field4214, -51);
                client.field604.method489(class103.field1874.field4214, -55);
                client.field604.method489(class183.field3187.field4214, -68);
                client.field604.method489(class35.field619.field4214, -52);
                client.field604.method489(class179.field3107.field4214, -46);
                client.field604.method489(class58.field1094.field4214, -116);
                client.field604.method489(class226.field4241.field4214, -46);
                client.field604.method489(class120.field2129.field4214, -54);
                client.field604.method489(class236.field4386.field4214, -19);
                client.field604.method489(class146.field2576.field4214, -94);
                client.field604.method498(0, class200.field3542.field1219, -2, class200.field3542.field1195);
                class101.field1844.method782(58, client.field604.field1219, client.field604.field1195, 0);
                class200.field3542.method1172(var6, (byte) -97);
                for (int var7 = 0; var7 < 4; ++var7) {
                    var6[var7] += 50;
                }
                class218.field3957.method1172(var6, (byte) -97);
                class228.field4285 = 6;
            }
            if (class228.field4285 == 6 && class101.field1844.method783(true) > 0) {
                int var8 = class101.field1844.method781(-120);
                if (~var8 == -22 && ~class183.field3191 == -21) {
                    class228.field4285 = 7;
                } else if (~var8 != -3) {
                    if (var8 == 15 && class183.field3191 == 40) {
                        class220.method1423(-3387);
                        return;
                    }
                    if (~var8 != -24 || ~class152.field2650 <= -2) {
                        class200.method1294(-3680, var8);
                        return;
                    }
                    class228.field4285 = 0;
                    ++class152.field2650;
                } else {
                    class228.field4285 = 9;
                }
            }
            if (~class228.field4285 == -8 && class101.field1844.method783(true) > 0) {
                class14.field263 = 60 * (3 + class101.field1844.method781(-112));
                class228.field4285 = 8;
            }
            if (~class228.field4285 == -9) {
                class39.field748 = 0;
                class191.method1198(class70.method555(new class44[] { class199.method1287(class14.field263 / 60, -1), class143.field2549 }, -3), -704657370, class194.field3405, class129.field2306);
                if (~(--class14.field263) >= -1) {
                    class228.field4285 = 0;
                }
            } else {
                if (class228.field4285 == 9 && ~class101.field1844.method783(true) <= -10) {
                    class30.field543 = class101.field1844.method781(-120);
                    class81.field1578 = class101.field1844.method781(-112);
                    class130.field2310 = ~class101.field1844.method781(-102) == -2;
                    class123.field2188 = class101.field1844.method781(-102);
                    class123.field2188 <<= 8;
                    class123.field2188 += class101.field1844.method781(-121);
                    class28.field492 = class101.field1844.method781(-111);
                    class101.field1844.method784(class218.field3957.field1219, 0, 1, (byte) -126);
                    class218.field3957.field1195 = 0;
                    class42.field779 = class218.field3957.method1164(20);
                    class101.field1844.method784(class218.field3957.field1219, 0, 2, (byte) -127);
                    class218.field3957.field1195 = 0;
                    class88.field1680 = class218.field3957.method500(61);
                    class228.field4285 = 10;
                }
                if (~class228.field4285 == -11) {
                    if (class101.field1844.method783(true) >= class88.field1680) {
                        class218.field3957.field1195 = 0;
                        class101.field1844.method784(class218.field3957.field1219, 0, class88.field1680, (byte) -126);
                        class9.method91(0);
                        class134.field2403 = -1;
                        class239.method1549((byte) 76, false);
                        class42.field779 = -1;
                    }
                } else {
                    ++class39.field748;
                    if (class39.field748 > 2000) {
                        if (~class152.field2650 > -2) {
                            if (class80.field1542 != class169.field2917) {
                                class80.field1542 = class169.field2917;
                            } else {
                                class80.field1542 = class103.field1887;
                            }
                            class228.field4285 = 0;
                            ++class152.field2650;
                        } else {
                            class200.method1294(-3680, -3);
                        }
                    }
                }
            }
        } catch (IOException var9) {
            if (~class152.field2650 > -2) {
                class228.field4285 = 0;
                if (~class80.field1542 == ~class169.field2917) {
                    class80.field1542 = class103.field1887;
                } else {
                    class80.field1542 = class169.field2917;
                }
                ++class152.field2650;
            } else {
                class200.method1294(-3680, -2);
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(II)[[I")
    public final int[][] method6(int arg0, int arg1) {
        ++field2555;
        if (arg0 > -59) {
            this.method6(50, -12);
        }
        int[][] var3 = super.field1601.method548(arg1, true);
        if (super.field1601.field1343) {
            int[][] var4 = this.method619(arg1, true, 0);
            int[][] var5 = this.method619(arg1, true, 1);
            int[] var6 = var3[1];
            int[] var7 = var3[0];
            int[] var8 = var4[0];
            int[] var9 = var3[2];
            int[] var10 = var4[2];
            int[] var11 = var5[0];
            int[] var12 = var4[1];
            int[] var13 = var5[2];
            int[] var14 = var5[1];
            int var15 = this.field2552;
            if (~var15 != -2) {
                if (var15 != 2) {
                    if (var15 != 3) {
                        if (~var15 != -5) {
                            if (~var15 != -6) {
                                if (var15 != 6) {
                                    if (var15 != 7) {
                                        if (var15 != 8) {
                                            if (var15 != 9) {
                                                if (~var15 != -11) {
                                                    if (var15 != 11) {
                                                        if (~var15 == -13) {
                                                            for (int var16 = 0; class129.field2287 > var16; ++var16) {
                                                                int var17 = var13[var16];
                                                                int var18 = var14[var16];
                                                                int var19 = var10[var16];
                                                                int var20 = var12[var16];
                                                                int var21 = var8[var16];
                                                                int var22 = var11[var16];
                                                                var7[var16] = var21 - -var22 + -(var21 * var22 >> 11);
                                                                var6[var16] = var18 + var20 + -(var18 * var20 >> 11);
                                                                var9[var16] = -(var17 * var19 >> 11) + var17 + var19;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; ~var23 > ~class129.field2287; ++var23) {
                                                            int var24 = var8[var23];
                                                            int var25 = var12[var23];
                                                            int var26 = var13[var23];
                                                            int var27 = var14[var23];
                                                            int var28 = var11[var23];
                                                            int var29 = var10[var23];
                                                            var7[var23] = var24 > var28 ? -var28 + var24 : -var24 + var28;
                                                            var6[var23] = ~var27 <= ~var25 ? -var25 + var27 : -var27 + var25;
                                                            var9[var23] = ~var26 <= ~var29 ? -var29 + var26 : -var26 + var29;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; class129.field2287 > var30; ++var30) {
                                                        int var31 = var10[var30];
                                                        int var32 = var11[var30];
                                                        int var33 = var8[var30];
                                                        int var34 = var12[var30];
                                                        int var35 = var13[var30];
                                                        int var36 = var14[var30];
                                                        var7[var30] = var32 >= var33 ? var32 : var33;
                                                        var6[var30] = var36 >= var34 ? var36 : var34;
                                                        var9[var30] = var31 <= var35 ? var35 : var31;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; var37 < class129.field2287; ++var37) {
                                                    int var38 = var10[var37];
                                                    int var39 = var8[var37];
                                                    int var40 = var13[var37];
                                                    int var41 = var11[var37];
                                                    int var42 = var14[var37];
                                                    int var43 = var12[var37];
                                                    var7[var37] = var39 < var41 ? var39 : var41;
                                                    var6[var37] = ~var42 < ~var43 ? var43 : var42;
                                                    var9[var37] = var38 < var40 ? var38 : var40;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; var44 < class129.field2287; ++var44) {
                                                int var45 = var10[var44];
                                                int var46 = var12[var44];
                                                int var47 = var8[var44];
                                                var7[var44] = ~var47 == -1 ? 0 : -((-var11[var44] + 4096 << 12) / var47) + 4096;
                                                var6[var44] = var46 == 0 ? 0 : -((4096 - var14[var44] << 12) / var46) + 4096;
                                                var9[var44] = ~var45 != -1 ? -((4096 - var13[var44] << 12) / var45) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; ~class129.field2287 < ~var48; ++var48) {
                                            int var49 = var12[var48];
                                            int var50 = var10[var48];
                                            int var51 = var8[var48];
                                            var7[var48] = var51 != 4096 ? (var11[var48] << 12) / (-var51 + 4096) : 4096;
                                            var6[var48] = var49 == 4096 ? 4096 : (var14[var48] << 12) / (4096 - var49);
                                            var9[var48] = ~var50 == -4097 ? 4096 : (var13[var48] << 12) / (-var50 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; ~var52 > ~class129.field2287; ++var52) {
                                        int var53 = var13[var52];
                                        int var54 = var14[var52];
                                        int var55 = var11[var52];
                                        var7[var52] = ~var55 <= -2049 ? 4096 - ((-var8[var52] + 4096) * (-var55 + 4096) >> 11) : var8[var52] * var55 >> 11;
                                        var6[var52] = var54 < 2048 ? var12[var52] * var54 >> 11 : 4096 - ((-var12[var52] + 4096) * (-var54 + 4096) >> 11);
                                        var9[var52] = var53 < 2048 ? var10[var52] * var53 >> 11 : -((4096 - var10[var52]) * (-var53 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var56 = 0; var56 < class129.field2287; ++var56) {
                                    var7[var56] = -((4096 - var11[var56]) * (-var8[var56] + 4096) >> 12) + 4096;
                                    var6[var56] = -((4096 - var14[var56]) * (-var12[var56] + 4096) >> 12) + 4096;
                                    var9[var56] = -((4096 - var10[var56]) * (-var13[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; ~class129.field2287 < ~var57; ++var57) {
                                int var58 = var14[var57];
                                int var59 = var13[var57];
                                int var60 = var11[var57];
                                var7[var57] = ~var60 != -1 ? (var8[var57] << 12) / var60 : 4096;
                                var6[var57] = var58 == 0 ? 4096 : (var12[var57] << 12) / var58;
                                var9[var57] = ~var59 != -1 ? (var10[var57] << 12) / var59 : 4096;
                            }
                        }
                    } else {
                        for (int var61 = 0; var61 < class129.field2287; ++var61) {
                            var7[var61] = var8[var61] * var11[var61] >> 12;
                            var6[var61] = var12[var61] * var14[var61] >> 12;
                            var9[var61] = var10[var61] * var13[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~var62 > ~class129.field2287; ++var62) {
                        var7[var62] = var8[var62] + -var11[var62];
                        var6[var62] = var12[var62] - var14[var62];
                        var9[var62] = var10[var62] - var13[var62];
                    }
                }
            } else {
                for (int var63 = 0; var63 < class129.field2287; ++var63) {
                    var7[var63] = var8[var63] + var11[var63];
                    var6[var63] = var12[var63] - -var14[var63];
                    var9[var63] = var10[var63] + var13[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V")
    public class145() {
        super(2, false);
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(B)V")
    public static void method953(byte arg0) {
        field2564 = null;
        field2563 = null;
        field2561 = null;
        field2559 = null;
        field2556 = null;
        if (arg0 < -85) {
            field2565 = null;
        }
    }
}
