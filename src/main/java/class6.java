import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class6 extends class115 {

    @OriginalMember(owner = "client!s", name = "S", descriptor = "I")
    private int field65 = 4096;

    @OriginalMember(owner = "client!s", name = "Y", descriptor = "Z")
    private boolean field71 = true;

    @OriginalMember(owner = "client!s", name = "T", descriptor = "Ljh;")
    public static class2 field66 = new class2(50);

    @OriginalMember(owner = "client!s", name = "ab", descriptor = "I")
    public static int field73 = 0;

    @OriginalMember(owner = "client!s", name = "W", descriptor = "I")
    public static int field69 = 0;

    @OriginalMember(owner = "client!s", name = "bb", descriptor = "I")
    public static int field74 = 0;

    @OriginalMember(owner = "client!s", name = "Q", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!s", name = "R", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!s", name = "U", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "client!s", name = "V", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!s", name = "X", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!s", name = "cb", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!s", name = "Z", descriptor = "Loe;")
    public static class256 field72;

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V")
    public class6() {
        super(1, false);
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(II)[[I")
    public final int[][] method1(int arg0, int arg1) {
        ++field68;
        if (arg1 < 11) {
            method27(43);
        }
        int[][] var3 = super.field1882.method1242(arg0, -93);
        if (super.field1882.field3344) {
            int[] var4 = this.method792(0, 0, class38.field522 & arg0 + -1);
            int[] var5 = this.method792(0, 0, arg0);
            int[] var6 = this.method792(0, 0, arg0 - -1 & class38.field522);
            int[] var7 = var3[1];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            for (int var10 = 0; class130.field2297 > var10; ++var10) {
                int var11 = (var6[var10] - var4[var10]) * this.field65;
                int var12 = var11 >> 12;
                int var13 = (var5[class134.field2350 & var10 + 1] + -var5[var10 - 1 & class134.field2350]) * this.field65;
                int var14 = var13 >> 12;
                int var15 = var14 * var14 >> 12;
                int var16 = var12 * var12 >> 12;
                int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var15 + 4096 + var16) / 4096.0F)));
                int var18;
                int var19;
                int var20;
                if (var17 != 0) {
                    var18 = var13 / var17;
                    var19 = var11 / var17;
                    var20 = 16777216 / var17;
                } else {
                    var19 = 0;
                    var18 = 0;
                    var20 = 0;
                }
                if (this.field71) {
                    var20 = (var20 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                }
                var8[var10] = var18;
                var7[var10] = var19;
                var9[var10] = var20;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!s", name = "i", descriptor = "(I)V")
    public static final void method27(int arg0) {
        ++field70;
        if (class108.field1740 == 118) {
            int var1 = class112.field1815.method778(128);
            int var2 = ((115 & var1) >> 4) + class150.field2606;
            int var3 = class185.field3260 - -(var1 & 7);
            int var4 = class112.field1815.method766(22102);
            int var5 = class112.field1815.method772((byte) -50);
            int var6 = class112.field1815.method766(22102);
            if (~var2 <= -1 && var3 >= 0 && var2 < 104 && var3 < 104 && class81.field1233 != var4) {
                class167 var7 = new class167();
                var7.field2844 = var6;
                var7.field2851 = var5;
                if (class77.field1158[class196.field3401][var2][var3] == null) {
                    class77.field1158[class196.field3401][var2][var3] = new class47();
                }
                class77.field1158[class196.field3401][var2][var3].method311((byte) 16, new class159(var7));
                class158.method1037(var3, true, var2);
            }
        } else if (class108.field1740 == 44) {
            int var8 = class112.field1815.method758(true);
            int var9 = class185.field3260 - -(7 & var8);
            int var10 = class150.field2606 - -(var8 >> 4 & 7);
            int var11 = class112.field1815.method778(128);
            int var12 = 3 & var11;
            int var13 = var11 >> 2;
            int var14 = class137.field2422[var13];
            if (~var10 <= -1 && var9 >= 0 && var10 < 104 && ~var9 > -105) {
                class252.method1659(var9, 0, -1, class196.field3401, var13, 0, -1, var10, var14, var12);
            }
        } else if (class108.field1740 == 43) {
            int var15 = class112.field1815.method758(true);
            int var16 = class185.field3260 - -(var15 & 7);
            int var17 = (7 & var15 >> 4) + class150.field2606;
            int var18 = class112.field1815.method731(false);
            if (var18 == 65535) {
                var18 = -1;
            }
            int var19 = class112.field1815.method758(true);
            int var20 = class112.field1815.method758(true);
            int var21 = 7 & var19;
            int var22 = (250 & var19) >> 4;
            if (~var17 <= -1 && var16 >= 0 && var17 < 104 && ~var16 > -105) {
                int var23 = var22 + 1;
                if (~class7.field85.field206[0] <= ~(-var23 + var17) && ~(var17 + var23) <= ~class7.field85.field206[0] && ~class7.field85.field219[0] <= ~(var16 - var23) && class7.field85.field219[0] <= var16 + var23 && class166.field2828 != 0 && var21 > 0 && ~class95.field1502 > -51 && ~var18 != 0) {
                    class221.field3799[class95.field1502] = var18;
                    class64.field878[class95.field1502] = var21;
                    class101.field1596[class95.field1502] = var20;
                    class152.field2642[class95.field1502] = null;
                    class237.field4056[class95.field1502] = (var17 << 16) + var22 - -(var16 << 8);
                    ++class95.field1502;
                }
            }
        } else if (~class108.field1740 == -43) {
            int var24 = class112.field1815.method758(true);
            int var25 = ((241 & var24) >> 4) + class150.field2606 * 2;
            int var26 = (15 & var24) + class185.field3260 * 2;
            int var27 = class112.field1815.method750(69) + var25;
            int var28 = var26 - -class112.field1815.method750(-123);
            int var29 = class112.field1815.method740(16711680);
            int var30 = class112.field1815.method731(false);
            int var31 = 4 * class112.field1815.method758(true);
            int var32 = class112.field1815.method758(true) * 4;
            int var33 = class112.field1815.method731(false);
            int var34 = class112.field1815.method731(false);
            int var35 = class112.field1815.method758(true);
            int var36 = class112.field1815.method758(true);
            if (~var25 <= -1 && var26 >= 0 && var25 < 208 && var26 < 208 && ~var27 <= -1 && ~var28 <= -1 && var27 < 208 && ~var28 > -209 && ~var30 != -65536) {
                int var37 = var25 * 64;
                int var38 = var26 * 64;
                int var39 = var28 * 64;
                class85 var40 = new class85(var30, class196.field3401, var37, var38, class236.method1535(var37, class196.field3401, var38, 0) + -var31, class133.field2326 + var33, class133.field2326 + var34, var35, var36, var29, var32);
                int var41 = var27 * 64;
                var40.method563(var33 - -class133.field2326, -var32 + class236.method1535(var41, class196.field3401, var39, 0), (byte) -48, var39, var41);
                class155.field2695.method311((byte) 16, new class197(var40));
            }
        } else if (~class108.field1740 == -194) {
            int var42 = class112.field1815.method778(128);
            int var43 = ((116 & var42) >> 4) + class150.field2606;
            int var44 = class185.field3260 - -(7 & var42);
            int var45 = class112.field1815.method728((byte) -117);
            if (var43 >= 0 && ~var44 <= -1 && var43 < 104 && ~var44 > -105) {
                class47 var46 = class77.field1158[class196.field3401][var43][var44];
                if (var46 != null) {
                    for (class159 var47 = (class159) var46.method315(-31594); var47 != null; var47 = (class159) var46.method312(1012)) {
                        if (~(32767 & var45) == ~var47.field2751.field2844) {
                            var47.method1234(17216);
                            break;
                        }
                    }
                    if (var46.method315(-31594) == null) {
                        class77.field1158[class196.field3401][var43][var44] = null;
                    }
                    class158.method1037(var44, true, var43);
                }
            }
        } else if (~class108.field1740 == -22) {
            int var48 = class112.field1815.method758(true);
            int var49 = class185.field3260 - -(7 & var48);
            int var50 = ((127 & var48) >> 4) + class150.field2606;
            int var51 = class112.field1815.method731(false);
            int var52 = class112.field1815.method731(false);
            int var53 = class112.field1815.method731(false);
            if (~var50 <= -1 && ~var49 <= -1 && var50 < 104 && var49 < 104) {
                class47 var54 = class77.field1158[class196.field3401][var50][var49];
                if (var54 != null) {
                    for (class159 var55 = (class159) var54.method315(-31594); var55 != null; var55 = (class159) var54.method312(1012)) {
                        class167 var56 = var55.field2751;
                        if ((var51 & 32767) == var56.field2844 && var56.field2851 == var52) {
                            var56.field2851 = var53;
                            break;
                        }
                    }
                    class158.method1037(var49, true, var50);
                }
            }
        } else if (class108.field1740 == 153) {
            int var57 = class112.field1815.method731(false);
            int var58 = class112.field1815.method743(arg0 + -860633755);
            int var59 = (7 & var58 >> 4) + class150.field2606;
            int var60 = (var58 & 7) + class185.field3260;
            int var61 = class112.field1815.method743(-30935);
            int var62 = var61 >> 2;
            int var63 = class137.field2422[var62];
            int var64 = var61 & 3;
            if (var59 >= 0 && ~var60 <= -1 && var59 < 104 && ~var60 > -105) {
                class252.method1659(var60, 0, -1, class196.field3401, var62, 0, var57, var59, var63, var64);
            }
        } else {
            if (~class108.field1740 == -63) {
                int var65 = class112.field1815.method728((byte) 119);
                byte var66 = class112.field1815.method750(-104);
                int var67 = class112.field1815.method758(true);
                int var68 = (7 & var67 >> 4) + class150.field2606;
                int var69 = (var67 & 7) + class185.field3260;
                int var70 = class112.field1815.method728((byte) 76);
                int var71 = class112.field1815.method731(false);
                byte var72 = class112.field1815.method744(122);
                int var73 = class112.field1815.method728((byte) 81);
                int var74 = class112.field1815.method762(false);
                int var75 = var74 & 3;
                int var76 = var74 >> 2;
                int var77 = class137.field2422[var76];
                byte var78 = class112.field1815.method750(82);
                byte var79 = class112.field1815.method750(arg0 + -860602908);
                class121 var80;
                if (~class81.field1233 != ~var70) {
                    var80 = class104.field1677[var70];
                } else {
                    var80 = class7.field85;
                }
                if (var80 != null) {
                    class70 var81 = class190.method1232(var65, arg0 + -860589730);
                    int[][] var82 = class23.field275[class196.field3401];
                    int var83;
                    int var84;
                    if (~var75 != -2 && ~var75 != -4) {
                        var83 = var81.field1059;
                        var84 = var81.field1048;
                    } else {
                        var83 = var81.field1048;
                        var84 = var81.field1059;
                    }
                    int var85 = (var84 >> 1) + var69;
                    int var86 = var69 - -(var84 + 1 >> 1);
                    int var87 = var68 - -(var83 >> 1);
                    int var88 = (var83 + 1 >> 1) + var68;
                    int var89 = var82[var87][var85] - -var82[var87][var86] - -var82[var88][var86] + var82[var88][var85] >> 2;
                    int[][] var90 = null;
                    int var91 = (var68 << 7) - -(var83 << 6);
                    if (class196.field3401 < 3) {
                        var90 = class23.field275[class196.field3401 + 1];
                    }
                    int var92 = (var69 << 7) + (var84 << 6);
                    class164 var93 = var81.method478(var81.field1051, false, var76, (class217) null, var89, var90, var92, var82, var91, var75, (byte) 115);
                    if (var93 != null) {
                        if (var79 < var66) {
                            byte var94 = var66;
                            var66 = var79;
                            var79 = var94;
                        }
                        class252.method1659(var69, 0, var71 + 1, class196.field3401, 0, var73 + 1, -1, var68, var77, 0);
                        var80.field1998 = var66 + var68;
                        var80.field1991 = class133.field2326 + var71;
                        var80.field2013 = var89;
                        var80.field1983 = var68 * 128 + var83 * 64;
                        var80.field1986 = var68 + var79;
                        var80.field1995 = var69 * 128 + var84 * 64;
                        var80.field2007 = (class188) var93.field2805;
                        if (var72 < var78) {
                            byte var95 = var78;
                            var78 = var72;
                            var72 = var95;
                        }
                        var80.field1985 = class133.field2326 + var73;
                        var80.field1997 = var69 + var78;
                        var80.field1992 = var69 - -var72;
                    }
                }
            }
            if (arg0 != 860602820) {
                method27(20);
            }
            if (class108.field1740 == 0) {
                int var96 = class112.field1815.method772((byte) -50);
                int var97 = class112.field1815.method778(128);
                int var98 = ((116 & var97) >> 4) + class150.field2606;
                int var99 = (var97 & 7) + class185.field3260;
                int var100 = class112.field1815.method728((byte) -104);
                if (var98 >= 0 && var99 >= 0 && ~var98 > -105 && var99 < 104) {
                    class167 var101 = new class167();
                    var101.field2851 = var100;
                    var101.field2844 = var96;
                    if (class77.field1158[class196.field3401][var98][var99] == null) {
                        class77.field1158[class196.field3401][var98][var99] = new class47();
                    }
                    class77.field1158[class196.field3401][var98][var99].method311((byte) 16, new class159(var101));
                    class158.method1037(var99, true, var98);
                }
            } else if (~class108.field1740 == -155) {
                int var102 = class112.field1815.method758(true);
                int var103 = class150.field2606 - -(7 & var102 >> 4);
                int var104 = class185.field3260 - -(var102 & 7);
                int var105 = class112.field1815.method731(false);
                int var106 = class112.field1815.method758(true);
                int var107 = class112.field1815.method731(false);
                if (~var103 <= -1 && var104 >= 0 && var103 < 104 && var104 < 104) {
                    int var108 = var103 * 128 + 64;
                    int var109 = var104 * 128 + 64;
                    class154 var110 = new class154(var105, class196.field3401, var108, var109, -var106 + class236.method1535(var108, class196.field3401, var109, 0), var107, class133.field2326);
                    class229.field3896.method311((byte) 16, new class157(var110));
                }
            } else if (~class108.field1740 == -188) {
                int var111 = class112.field1815.method743(-30935);
                int var112 = var111 >> 2;
                int var113 = var111 & 3;
                int var114 = class137.field2422[var112];
                int var115 = class112.field1815.method731(false);
                int var116 = class112.field1815.method758(true);
                if (~var115 == -65536) {
                    var115 = -1;
                }
                int var117 = class150.field2606 - -((114 & var116) >> 4);
                int var118 = (7 & var116) + class185.field3260;
                class13.method50(var115, var114, var113, var118, Integer.MAX_VALUE, class196.field3401, var117, var112);
            } else if (~class108.field1740 == -161) {
                int var119 = class112.field1815.method758(true);
                int var120 = (var119 & 7) + class185.field3260;
                int var121 = ((var119 & 125) >> 4) + class150.field2606;
                int var122 = var121 - -class112.field1815.method750(-95);
                int var123 = class112.field1815.method750(94) + var120;
                int var124 = class112.field1815.method740(16711680);
                int var125 = class112.field1815.method731(false);
                int var126 = 4 * class112.field1815.method758(true);
                int var127 = class112.field1815.method758(true) * 4;
                int var128 = class112.field1815.method731(false);
                int var129 = class112.field1815.method731(false);
                int var130 = class112.field1815.method758(true);
                int var131 = class112.field1815.method758(true);
                if (~var121 <= -1 && ~var120 <= -1 && ~var121 > -105 && ~var120 > -105 && ~var122 <= -1 && ~var123 <= -1 && var122 < 104 && ~var123 > -105 && var125 != 65535) {
                    int var132 = var120 * 128 - -64;
                    int var133 = var122 * 128 - -64;
                    int var134 = var123 * 128 + 64;
                    int var135 = var121 * 128 + 64;
                    class85 var136 = new class85(var125, class196.field3401, var135, var132, -var126 + class236.method1535(var135, class196.field3401, var132, 0), class133.field2326 + var128, class133.field2326 + var129, var130, var131, var124, var127);
                    var136.method563(class133.field2326 + var128, -var127 + class236.method1535(var133, class196.field3401, var134, 0), (byte) -48, var134, var133);
                    class155.field2695.method311((byte) 16, new class197(var136));
                }
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BLnh;I)V")
    public final void method3(byte arg0, class112 arg1, int arg2) {
        ++field63;
        if (arg0 != 107) {
            this.method3((byte) -61, (class112) null, -31);
        }
        if (arg2 != 0) {
            if (arg2 == 1) {
                this.field71 = ~arg1.method758(true) == -2;
            }
        } else {
            this.field65 = arg1.method731(false);
        }
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(B)V")
    public static void method28(byte arg0) {
        if (arg0 != 99) {
            field73 = -2;
        }
        field66 = null;
        field72 = null;
    }

    @OriginalMember(owner = "client!s", name = "j", descriptor = "(I)Luf;")
    public static final class198 method29(int arg0) {
        int var1 = 29 / ((38 - arg0) / 58);
        ++field75;
        try {
            return (class198) Class.forName("dd").newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!s", name = "k", descriptor = "(I)V")
    public static final void method30(int arg0) {
        int var1 = 28 % ((arg0 - 19) / 56);
        class157 var2 = (class157) class229.field3896.method315(-31594);
        ++field64;
        while (var2 != null) {
            class154 var3 = var2.field2716;
            if (class196.field3401 == var3.field2678 && !var3.field2686) {
                if (~var3.field2675 >= ~class133.field2326) {
                    var3.method1014(126, class146.field2539);
                    if (!var3.field2686) {
                        class241.method1574(var3.field2678, var3.field2689, var3.field2687, var3.field2674, 60, var3, 0, -1L, false);
                    } else {
                        var2.method1234(17216);
                    }
                }
            } else {
                var2.method1234(17216);
            }
            var2 = (class157) class229.field3896.method312(1012);
        }
    }
}
