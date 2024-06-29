import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class71 extends class259 {

    @OriginalMember(owner = "client!ua", name = "cb", descriptor = "I")
    private int field1598 = 409;

    @OriginalMember(owner = "client!ua", name = "W", descriptor = "I")
    private int field1592 = 819;

    @OriginalMember(owner = "client!ua", name = "gb", descriptor = "I")
    private int field1602 = 0;

    @OriginalMember(owner = "client!ua", name = "fb", descriptor = "I")
    private int field1601 = 2048;

    @OriginalMember(owner = "client!ua", name = "hb", descriptor = "I")
    private int field1603 = 1024;

    @OriginalMember(owner = "client!ua", name = "Z", descriptor = "I")
    private int field1595 = 1024;

    @OriginalMember(owner = "client!ua", name = "qb", descriptor = "I")
    private int field1612 = 0;

    @OriginalMember(owner = "client!ua", name = "pb", descriptor = "I")
    private int field1611 = 1024;

    @OriginalMember(owner = "client!ua", name = "mb", descriptor = "I")
    private int field1608 = 1024;

    @OriginalMember(owner = "client!ua", name = "eb", descriptor = "S")
    public static short field1600 = 256;

    @OriginalMember(owner = "client!ua", name = "X", descriptor = "I")
    public static int field1593 = 0;

    @OriginalMember(owner = "client!ua", name = "ib", descriptor = "Z")
    public static boolean field1604 = false;

    @OriginalMember(owner = "client!ua", name = "bb", descriptor = "Lub;")
    public static class17 field1597 = new class17(64);

    @OriginalMember(owner = "client!ua", name = "sb", descriptor = "I")
    public static int field1614 = 0;

    @OriginalMember(owner = "client!ua", name = "S", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!ua", name = "T", descriptor = "I")
    private int field1589;

    @OriginalMember(owner = "client!ua", name = "Y", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!ua", name = "ab", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!ua", name = "db", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!ua", name = "jb", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!ua", name = "kb", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!ua", name = "lb", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!ua", name = "nb", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!ua", name = "ob", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!ua", name = "U", descriptor = "[I")
    public static int[] field1590;

    @OriginalMember(owner = "client!ua", name = "V", descriptor = "[S")
    public static short[] field1591;

    @OriginalMember(owner = "client!ua", name = "rb", descriptor = "[[[Lne;")
    public static class195[][][] field1613;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(Z)V")
    public static void method659(boolean arg0) {
        field1597 = null;
        field1613 = null;
        field1590 = null;
        field1591 = null;
        if (arg0) {
            method659(true);
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(II)Z")
    public static final boolean method660(int arg0, int arg1) {
        ++field1606;
        if (arg1 != -930043140) {
            method662((byte) 57, 53);
        }
        return (arg0 >> 28 & 1) != 0;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B[I)[I")
    public static final int[] method661(byte arg0, int[] arg1) {
        ++field1610;
        if (arg1 == null) {
            return null;
        } else {
            int[] var2 = new int[arg1.length];
            int var3 = 115 % ((48 - arg0) / 61);
            class26.method229(arg1, 0, var2, 0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "(I)V")
    public final void method11(int arg0) {
        if (arg0 < 11) {
            this.field1608 = 51;
        }
        ++field1609;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IILaa;)V")
    public final void method4(int arg0, int arg1, class8 arg2) {
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (~arg0 != -7) {
                                    if (arg0 != 7) {
                                        if (arg0 == 8) {
                                            this.field1611 = arg2.method65((byte) 111);
                                        }
                                    } else {
                                        this.field1603 = arg2.method65((byte) 108);
                                    }
                                } else {
                                    this.field1602 = arg2.method63((byte) 111);
                                }
                            } else {
                                this.field1608 = arg2.method65((byte) 126);
                            }
                        } else {
                            this.field1592 = arg2.method65((byte) 117);
                        }
                    } else {
                        this.field1598 = arg2.method65((byte) 125);
                    }
                } else {
                    this.field1601 = arg2.method65((byte) 124);
                }
            } else {
                this.field1595 = arg2.method65((byte) 107);
            }
        } else {
            this.field1612 = arg2.method63((byte) 46);
        }
        if (arg1 != -1586849108) {
            this.method664((byte) -37, -111, (Random) null, -89, -25, (int[][]) null, -25);
        }
        ++field1594;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(BI)V")
    public static final void method662(byte arg0, int arg1) {
        if (arg0 > -33) {
            field1613 = null;
        }
        class101.field2063.method1642(arg1, 122);
        ++field1605;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIIII)V")
    public static final void method663(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 <= -108) {
            if (~class132.field2607 == -1) {
                int var7 = class64.field1426;
                int var8 = class204.field3663;
                ++class272.field4769;
                int var9 = class180.field3337;
                int var10 = (-arg0 + arg3) * (-var8 + var7) / arg5 + var8;
                int var11 = class21.field380;
                int var12 = (-arg1 + arg4) * (-var9 + var11) / arg6 - -var9;
                if (class175.field3258 && ~(class195.field3514 & 64) == -65) {
                    class31 var13 = class122.method931(class125.field2445, (byte) 127, class210.field3772);
                    if (var13 != null) {
                        class31.method311(var10, 0L, class100.field2049, class93.field1867, (short) 50, -501, var12);
                    } else {
                        class114.method891(5919);
                    }
                } else {
                    class31.method311(var10, 0L, class55.field1203, class252.field4456, (short) 47, -501, var12);
                }
            }
            long var14 = -1L;
            for (int var16 = 0; ~var16 > ~class46.field1061; ++var16) {
                long var17 = class247.field4403[var16];
                int var19 = 127 & (int) var17;
                int var20 = 127 & (int) var17 >> 7;
                int var21 = Integer.MAX_VALUE & (int) (var17 >>> 32);
                int var22 = (1927890084 & (int) var17) >> 29;
                if (var14 != var17) {
                    var14 = var17;
                    if (~var22 == -3 && class136.method1028(class159.field2998, var19, var20, var17)) {
                        class40 var23 = class195.method1415(-122, var21);
                        if (var23.field997 != null) {
                            var23 = var23.method418((byte) 117);
                        }
                        if (var23 == null) {
                            continue;
                        }
                        if (class132.field2607 != 1) {
                            if (!class175.field3258) {
                                ++class79.field1703;
                                class30[] var24 = var23.field932;
                                if (class179.field3318) {
                                    var24 = class263.method1816((byte) 7, var24);
                                }
                                if (var24 != null) {
                                    for (int var25 = 4; var25 >= 0; --var25) {
                                        if (var24[var25] != null) {
                                            ++class121.field2378;
                                            short var26 = 0;
                                            if (~var25 == -1) {
                                                var26 = 20;
                                            }
                                            if (~var25 == -2) {
                                                var26 = 3;
                                            }
                                            if (~var25 == -3) {
                                                var26 = 2;
                                            }
                                            if (var25 == 3) {
                                                var26 = 14;
                                            }
                                            if (~var25 == -5) {
                                                var26 = 1001;
                                            }
                                            class31.method311(var19, var17, class160.method1188(new class30[] { class70.field1585, var23.field943 }, 0), var24[var25], var26, -501, var20);
                                        }
                                    }
                                }
                                class31.method311(var19, (long) var23.field989, class160.method1188(new class30[] { class70.field1585, var23.field943 }, 0), class179.field3319, (short) 1002, -501, var20);
                            } else if ((class195.field3514 & 4) == 4) {
                                class31.method311(var19, var17, class160.method1188(new class30[] { class246.field4384, class1.field13, var23.field943 }, 0), class93.field1867, (short) 32, -501, var20);
                                ++class194.field3498;
                            }
                        } else {
                            class31.method311(var19, var17, class160.method1188(new class30[] { class173.field3234, class1.field13, var23.field943 }, 0), class163.field3031, (short) 9, -501, var20);
                            ++class67.field1470;
                        }
                    }
                    if (var22 == 1) {
                        class275 var27 = class125.field2443[var21];
                        if (var27.field4805.field4307 == 1 && (var27.field1360 & 127) == 64 && (var27.field1336 & 127) == 64) {
                            for (int var28 = 0; ~class221.field3985 < ~var28; ++var28) {
                                class275 var31 = class125.field2443[class4.field55[var28]];
                                if (var31 != null && var27 != var31 && ~var31.field4805.field4307 == -2 && ~var27.field1360 == ~var31.field1360 && ~var27.field1336 == ~var31.field1336) {
                                    class157.method1166(3, var31.field4805, class4.field55[var28], var20, var19);
                                }
                            }
                            for (int var29 = 0; class28.field528 > var29; ++var29) {
                                class120 var30 = class75.field1670[class183.field3378[var29]];
                                if (var30 != null && ~var27.field1360 == ~var30.field1360 && var27.field1336 == var30.field1336) {
                                    class276.method1869(var30, var19, true, class183.field3378[var29], var20);
                                }
                            }
                        }
                        class157.method1166(3, var27.field4805, var21, var20, var19);
                    }
                    if (var22 == 0) {
                        class120 var32 = class75.field1670[var21];
                        if (~(127 & var32.field1360) == -65 && (var32.field1336 & 127) == 64) {
                            for (int var33 = 0; ~class221.field3985 < ~var33; ++var33) {
                                class275 var36 = class125.field2443[class4.field55[var33]];
                                if (var36 != null && ~var36.field4805.field4307 == -2 && var32.field1360 == var36.field1360 && var32.field1336 == var36.field1336) {
                                    class157.method1166(3, var36.field4805, class4.field55[var33], var20, var19);
                                }
                            }
                            for (int var34 = 0; var34 < class28.field528; ++var34) {
                                class120 var35 = class75.field1670[class183.field3378[var34]];
                                if (var35 != null && var32 != var35 && ~var32.field1360 == ~var35.field1360 && ~var32.field1336 == ~var35.field1336) {
                                    class276.method1869(var35, var19, true, class183.field3378[var34], var20);
                                }
                            }
                        }
                        class276.method1869(var32, var19, true, var21, var20);
                    }
                    if (var22 == 3) {
                        class48 var37 = class103.field2078[class159.field2998][var19][var20];
                        if (var37 != null) {
                            for (class97 var38 = (class97) var37.method472((byte) -41); var38 != null; var38 = (class97) var37.method473((byte) -6)) {
                                int var39 = var38.field1972.field49;
                                class168 var40 = class201.method1425(119, var39);
                                if (~class132.field2607 == -2) {
                                    ++class5.field65;
                                    class31.method311(var19, (long) var39, class160.method1188(new class30[] { class173.field3234, class80.field1721, var40.field3162 }, 0), class163.field3031, (short) 57, -501, var20);
                                } else if (class175.field3258) {
                                    if (~(1 & class195.field3514) == -2) {
                                        class31.method311(var19, (long) var39, class160.method1188(new class30[] { class246.field4384, class80.field1721, var40.field3162 }, 0), class93.field1867, (short) 23, -501, var20);
                                        ++class266.field4686;
                                    }
                                } else {
                                    ++class103.field2082;
                                    class30[] var41 = var40.field3095;
                                    if (class179.field3318) {
                                        var41 = class263.method1816((byte) 7, var41);
                                    }
                                    for (int var42 = 4; ~var42 <= -1; --var42) {
                                        if (var41 != null && var41[var42] != null) {
                                            ++class67.field1465;
                                            byte var43 = 0;
                                            if (~var42 == -1) {
                                                var43 = 33;
                                            }
                                            if (~var42 == -2) {
                                                var43 = 51;
                                            }
                                            if (~var42 == -3) {
                                                var43 = 13;
                                            }
                                            if (~var42 == -4) {
                                                var43 = 48;
                                            }
                                            if (var42 == 4) {
                                                var43 = 34;
                                            }
                                            class31.method311(var19, (long) var39, class160.method1188(new class30[] { class104.field2098, var40.field3162 }, 0), var41[var42], var43, -501, var20);
                                        } else if (var42 == 2) {
                                            ++class69.field1538;
                                            class31.method311(var19, (long) var39, class160.method1188(new class30[] { class104.field2098, var40.field3162 }, 0), class129.field2546, (short) 13, -501, var20);
                                        }
                                    }
                                    class31.method311(var19, (long) var39, class160.method1188(new class30[] { class104.field2098, var40.field3162 }, 0), class179.field3319, (short) 1004, -501, var20);
                                }
                            }
                        }
                    }
                }
            }
            ++field1607;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IZ)[I")
    public final int[] method17(int arg0, boolean arg1) {
        if (arg1) {
            return null;
        } else {
            ++field1588;
            int[] var3 = super.field4581.method1841(18, arg0);
            if (super.field4581.field4729) {
                int var4 = 0;
                int[][] var5 = super.field4581.method1836(0);
                int var6 = 0;
                int var7 = 0;
                boolean var8 = true;
                int var9 = 0;
                int var10 = 0;
                int var11 = 0;
                int var12 = class223.field3999 * this.field1595 >> 12;
                int var13 = 0;
                int var14 = class94.field1911 * this.field1592 >> 12;
                boolean var15 = true;
                int var16 = class223.field3999 * this.field1601 >> 12;
                int var17 = class94.field1911 * this.field1598 >> 12;
                if (var14 <= 1) {
                    return var5[arg0];
                } else {
                    this.field1589 = class223.field3999 / 8 * this.field1608 >> 12;
                    int var18 = class223.field3999 / var12 + 1;
                    int[][] var19 = new int[var18][3];
                    Random var20 = new Random((long) this.field1612);
                    int[][] var21 = new int[var18][3];
                    while (true) {
                        while (true) {
                            int var22 = var12 - -class256.method1779(121, var20, var16 - var12);
                            int var23 = var17 - -class256.method1779(119, var20, -var17 + var14);
                            int var24 = var7 - -var22;
                            if (class223.field3999 < var24) {
                                var22 = -var7 + class223.field3999;
                                var24 = class223.field3999;
                            }
                            int var26;
                            if (var15) {
                                var26 = 0;
                            } else {
                                int[] var25 = var21[var9];
                                var26 = var25[2];
                                int var27 = var4 + var24;
                                int var28 = var9;
                                if (var27 < 0) {
                                    var27 += class223.field3999;
                                }
                                if (class223.field3999 < var27) {
                                    var27 -= class223.field3999;
                                }
                                int var29 = 0;
                                while (true) {
                                    int[] var30 = var21[var28];
                                    if (~var27 <= ~var30[0] && var30[1] >= var27) {
                                        if (var9 != var28) {
                                            int var31 = var4 + var7;
                                            if (~var31 > -1) {
                                                var31 += class223.field3999;
                                            }
                                            if (var31 > class223.field3999) {
                                                var31 -= class223.field3999;
                                            }
                                            for (int var32 = 1; var32 <= var29; ++var32) {
                                                int[] var40 = var21[(var9 - -var32) % var13];
                                                var26 = Math.max(var26, var40[2]);
                                            }
                                            for (int var33 = 0; ~var33 >= ~var29; ++var33) {
                                                int[] var34 = var21[(var9 - -var33) % var13];
                                                int var35 = var34[2];
                                                if (~var26 != ~var35) {
                                                    int var36 = var34[0];
                                                    int var37 = var34[1];
                                                    int var38;
                                                    int var39;
                                                    if (var31 < var27) {
                                                        var38 = Math.max(var31, var36);
                                                        var39 = Math.min(var27, var37);
                                                    } else if (var36 == 0) {
                                                        var39 = Math.min(var27, var37);
                                                        var38 = 0;
                                                    } else {
                                                        var38 = Math.max(var31, var36);
                                                        var39 = class223.field3999;
                                                    }
                                                    this.method664((byte) -95, var10 + var38, var20, var39 - var38, var35, var5, -var35 + var26);
                                                }
                                            }
                                        }
                                        var9 = var28;
                                        break;
                                    }
                                    ++var29;
                                    ++var28;
                                    if (var28 >= var13) {
                                        var28 = 0;
                                    }
                                }
                            }
                            if (~class94.field1911 > ~(var23 + var26)) {
                                var23 = class94.field1911 - var26;
                            } else {
                                var8 = false;
                            }
                            if (~class223.field3999 == ~var24) {
                                this.method664((byte) -95, var7 - -var6, var20, var22, var26, var5, var23);
                                if (var8) {
                                    return var3;
                                }
                                var10 = var6;
                                int[][] var41 = var21;
                                var8 = true;
                                var9 = 0;
                                int[] var42 = var19[var11++];
                                var21 = var19;
                                var42[2] = var23 + var26;
                                var42[1] = var24;
                                var15 = false;
                                var13 = var11;
                                var11 = 0;
                                var19 = var41;
                                var42[0] = var7;
                                var6 = class256.method1779(122, var20, class223.field3999);
                                var7 = 0;
                                var4 = -var10 + var6;
                                int var43 = var4;
                                if (~var4 > -1) {
                                    var43 = class223.field3999 + var4;
                                }
                                if (var43 > class223.field3999) {
                                    var43 -= class223.field3999;
                                }
                                while (true) {
                                    int[] var44 = var21[var9];
                                    if (var43 >= var44[0] && var44[1] >= var43) {
                                        break;
                                    }
                                    ++var9;
                                    if (~var9 <= ~var13) {
                                        var9 = 0;
                                    }
                                }
                            } else {
                                int[] var45 = var19[var11++];
                                var45[1] = var24;
                                var45[2] = var26 - -var23;
                                var45[0] = var7;
                                this.method664((byte) -95, var6 + var7, var20, var22, var26, var5, var23);
                                var7 = var24;
                            }
                        }
                    }
                }
            } else {
                return var3;
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V")
    public class71() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(BILjava/util/Random;II[[II)V")
    private final void method664(byte arg0, int arg1, Random arg2, int arg3, int arg4, int[][] arg5, int arg6) {
        ++field1596;
        if (arg0 != -95) {
            this.method4(-13, -11, (class8) null);
        }
        int var8 = this.field1611 > 0 ? -class256.method1779(123, arg2, this.field1611) + 4096 : 4096;
        int var9 = this.field1603 * this.field1589 >> 12;
        int var10 = this.field1589 + -(~var9 < -1 ? class256.method1779(119, arg2, var9) : 0);
        if (class223.field3999 <= arg1) {
            arg1 -= class223.field3999;
        }
        if (var10 > 0) {
            if (arg6 > 0 && arg3 > 0) {
                int var11 = arg3 / 2;
                int var12 = arg6 / 2;
                int var13 = ~var11 > ~var10 ? var11 : var10;
                int var14 = var10 <= var12 ? var10 : var12;
                int var15 = arg1 + var13;
                int var16 = -(var13 * 2) + arg3;
                for (int var17 = 0; ~var17 > ~arg6; ++var17) {
                    int[] var18 = arg5[arg4 + var17];
                    if (var17 < var14) {
                        int var19 = var8 * var17 / var14;
                        if (~this.field1602 != -1) {
                            for (int var20 = 0; ~var13 < ~var20; ++var20) {
                                int var21 = var8 * var20 / var13;
                                var18[class68.method612(arg1 + var20, class52.field1174)] = var18[class68.method612(class52.field1174, arg1 + -1 + arg3 + -var20)] = var21 >= var19 ? var19 : var21;
                            }
                        } else {
                            for (int var22 = 0; ~var13 < ~var22; ++var22) {
                                int var24 = var8 * var22 / var13;
                                var18[class68.method612(arg1 + var22, class52.field1174)] = var18[class68.method612(arg1 - var22 + arg3 + -1, class52.field1174)] = var19 * var24 >> 12;
                            }
                        }
                        if (~class223.field3999 <= ~(var15 + var16)) {
                            class26.method234(var18, var15, var16, var19);
                        } else {
                            int var23 = class223.field3999 - var15;
                            class26.method234(var18, var15, var23, var19);
                            class26.method234(var18, 0, -var23 + var16, var19);
                        }
                    } else {
                        int var25 = arg6 - (var17 + 1);
                        if (~var25 > ~var14) {
                            int var26 = var8 * var25 / var14;
                            if (~this.field1602 == -1) {
                                for (int var27 = 0; var13 > var27; ++var27) {
                                    int var28 = var8 * var27 / var13;
                                    var18[class68.method612(class52.field1174, arg1 + var27)] = var18[class68.method612(arg1 + -1 - (-arg3 - -var27), class52.field1174)] = var26 * var28 >> 12;
                                }
                            } else {
                                for (int var29 = 0; var13 > var29; ++var29) {
                                    int var31 = var8 * var29 / var13;
                                    var18[class68.method612(class52.field1174, arg1 + var29)] = var18[class68.method612(-var29 + arg3 + arg1 + -1, class52.field1174)] = var26 <= var31 ? var26 : var31;
                                }
                            }
                            if (class223.field3999 < var15 + var16) {
                                int var30 = -var15 + class223.field3999;
                                class26.method234(var18, var15, var30, var26);
                                class26.method234(var18, 0, -var30 + var16, var26);
                            } else {
                                class26.method234(var18, var15, var16, var26);
                            }
                        } else {
                            for (int var32 = 0; ~var32 > ~var13; ++var32) {
                                var18[class68.method612(class52.field1174, arg1 + var32)] = var18[class68.method612(-var32 + -1 + arg3 + arg1, class52.field1174)] = var8 * var32 / var13;
                            }
                            if (~class223.field3999 <= ~(var15 + var16)) {
                                class26.method234(var18, var15, var16, var8);
                            } else {
                                int var33 = class223.field3999 - var15;
                                class26.method234(var18, var15, var33, var8);
                                class26.method234(var18, 0, -var33 + var16, var8);
                            }
                        }
                    }
                }
            }
        } else if (~class223.field3999 <= ~(arg1 - -arg3)) {
            for (int var34 = 0; arg6 > var34; ++var34) {
                class26.method234(arg5[arg4 + var34], arg1, arg3, var8);
            }
        } else {
            int var35 = -arg1 + class223.field3999;
            for (int var36 = 0; ~var36 > ~arg6; ++var36) {
                int[] var37 = arg5[arg4 + var36];
                class26.method234(var37, arg1, var35, var8);
                class26.method234(var37, 0, -var35 + arg3, var8);
            }
        }
    }
}
