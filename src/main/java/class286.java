import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class286 extends class96 {

    @OriginalMember(owner = "client!nk", name = "Tb", descriptor = "[[I")
    public static int[][] field4563 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!nk", name = "Rb", descriptor = "J")
    public static long field4561 = 0L;

    @OriginalMember(owner = "client!nk", name = "Fb", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!nk", name = "Gb", descriptor = "I")
    public static int field4550;

    @OriginalMember(owner = "client!nk", name = "Hb", descriptor = "I")
    public static int field4551;

    @OriginalMember(owner = "client!nk", name = "Ib", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!nk", name = "Jb", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!nk", name = "Kb", descriptor = "I")
    public static int field4554;

    @OriginalMember(owner = "client!nk", name = "Lb", descriptor = "I")
    public static int field4555;

    @OriginalMember(owner = "client!nk", name = "Nb", descriptor = "I")
    private int field4557;

    @OriginalMember(owner = "client!nk", name = "Ob", descriptor = "I")
    public static int field4558;

    @OriginalMember(owner = "client!nk", name = "Sb", descriptor = "I")
    public static int field4562;

    @OriginalMember(owner = "client!nk", name = "Ub", descriptor = "I")
    public static int field4564;

    @OriginalMember(owner = "client!nk", name = "Vb", descriptor = "I")
    public static int field4565;

    @OriginalMember(owner = "client!nk", name = "Wb", descriptor = "I")
    public static int field4566;

    @OriginalMember(owner = "client!nk", name = "Xb", descriptor = "I")
    public static int field4567;

    @OriginalMember(owner = "client!nk", name = "Yb", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!nk", name = "ac", descriptor = "I")
    public static int field4570;

    @OriginalMember(owner = "client!nk", name = "Mb", descriptor = "Leh;")
    public static class137 field4556;

    @OriginalMember(owner = "client!nk", name = "Qb", descriptor = "Luc;")
    private class13 field4560;

    @OriginalMember(owner = "client!nk", name = "Zb", descriptor = "Lnf;")
    public static class227 field4569;

    @OriginalMember(owner = "client!nk", name = "bc", descriptor = "Lbl;")
    public static class259 field4571;

    @OriginalMember(owner = "client!nk", name = "Pb", descriptor = "[Lib;")
    public static class56[] field4559;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(B[I)V")
    public final void method1918(byte arg0, int[] arg1) {
        this.field4560 = new class13(arg1);
        if (arg0 != 49) {
            this.method1919(14, 8);
        }
        ++field4554;
    }

    @OriginalMember(owner = "client!nk", name = "i", descriptor = "(II)I")
    public final int method1919(int arg0, int arg1) {
        ++field4565;
        int var3 = this.field4557 >> 3;
        int var4 = -(this.field4557 & 7) + 8;
        if (arg1 != 5) {
            return 14;
        } else {
            this.field4557 += arg0;
            int var5 = 0;
            while (~var4 > ~arg0) {
                var5 += (super.field1218[var3++] & class75.field940[var4]) << arg0 - var4;
                arg0 -= var4;
                var4 = 8;
            }
            int var6;
            if (arg0 == var4) {
                var6 = (class75.field940[var4] & super.field1218[var3]) + var5;
            } else {
                var6 = (super.field1218[var3] >> var4 - arg0 & class75.field940[arg0]) + var5;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "(IB)V")
    public static final void method1920(int arg0, byte arg1) {
        if (arg1 != -34) {
            field4559 = null;
        }
        ++field4567;
        class116.field1648.method1695(arg0, 0);
        class123.field1915.method1695(arg0, arg1 ^ -34);
    }

    @OriginalMember(owner = "client!nk", name = "x", descriptor = "(I)V")
    public static void method1921(int arg0) {
        field4559 = null;
        field4556 = null;
        field4563 = null;
        field4571 = null;
        field4569 = null;
        int var1 = -6 / ((arg0 - -15) / 43);
    }

    @OriginalMember(owner = "client!nk", name = "y", descriptor = "(I)V")
    public static final void method1922(int arg0) {
        ++field4570;
        if (class19.field238) {
            if (arg0 < 78) {
                field4564 = 123;
            }
            class138.field2211 = null;
            class19.field238 = false;
            class213.field3428 = null;
        }
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(IZ)I")
    public final int method1923(int arg0, boolean arg1) {
        ++field4550;
        if (!arg1) {
            method1929(-111, 66, -82);
        }
        return arg0 * 8 + -this.field4557;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIILeh;IZ)V")
    public static final void method1924(int arg0, int arg1, int arg2, class137 arg3, int arg4, boolean arg5) {
        class112.field1598 = 10000;
        class216.field3473 = arg5;
        class278.field4410 = arg2;
        class4.field55 = arg4;
        class190.field3070 = 1;
        ++field4555;
        class160.field2558 = arg3;
        if (arg0 == -10225) {
            class215.field3446 = arg1;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I[BII)V")
    public final void method1925(int arg0, byte[] arg1, int arg2, int arg3) {
        for (int var5 = 0; ~arg2 < ~var5; ++var5) {
            arg1[var5 - -arg0] = (byte) (super.field1218[super.field1228++] + -this.field4560.method69((byte) 122));
        }
        if (arg3 != 2512) {
            method1922(-118);
        }
        ++field4566;
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(I)V")
    public class286(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!nk", name = "z", descriptor = "(I)I")
    public final int method1926(int arg0) {
        if (arg0 != 255) {
            field4563 = null;
        }
        ++field4552;
        return super.field1218[super.field1228++] + -this.field4560.method69((byte) 122) & 255;
    }

    @OriginalMember(owner = "client!nk", name = "A", descriptor = "(I)V")
    public final void method1927(int arg0) {
        this.field4557 = super.field1228 * 8;
        ++field4553;
        if (arg0 != -27511) {
            this.field4560 = null;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IILeh;ILeh;)Lol;")
    public static final class109 method1928(int arg0, int arg1, class137 arg2, int arg3, class137 arg4) {
        if (arg3 > -49) {
            field4556 = null;
        }
        ++field4551;
        return !class111.method714(arg1, arg0, arg4, 83) ? null : class45.method258((byte) 89, arg2.method928(arg1, (byte) 121, arg0));
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(III)J")
    public static final long method1929(int arg0, int arg1, int arg2) {
        class246 var3 = class46.field585[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        } else {
            for (int var4 = 0; var4 < var3.field4044; ++var4) {
                class19 var5 = var3.field4038[var4];
                if ((var5.field244 >> 29 & 3L) == 2L && var5.field240 == arg1 && var5.field235 == arg2) {
                    return var5.field244;
                }
            }
            return 0L;
        }
    }

    @OriginalMember(owner = "client!nk", name = "i", descriptor = "(B)V")
    public static final void method1930(byte arg0) {
        ++field4568;
        if (arg0 >= -67) {
            field4563 = null;
        }
        if (class242.field3982 == null) {
            if (class5.field75 == null) {
                int var1 = class90.field1119;
                if (class262.field4250) {
                    if (~var1 != -2) {
                        int var7 = class92.field1156;
                        int var8 = class113.field1623;
                        if (~(class73.field916 - 10) < ~var8 || ~var8 < ~(class103.field1392 + 10 + class73.field916) || var7 < class190.field3074 + -10 || ~var7 < ~(class190.field3074 - (-class67.field850 + -10))) {
                            class262.field4250 = false;
                            class225.method1589(class190.field3074, class67.field850, class73.field916, 0, class103.field1392);
                        }
                    }
                    if (var1 != 1) {
                        return;
                    }
                    int var9 = class73.field916;
                    int var10 = class190.field3074;
                    int var11 = class107.field1449;
                    int var12 = class214.field3435;
                    int var13 = class103.field1392;
                    int var14 = -1;
                    for (int var15 = 0; ~class34.field437 < ~var15; ++var15) {
                        if (!class164.field2607) {
                            int var16 = (class34.field437 - (1 - -var15)) * 15 + (var10 - -31);
                            if (~var11 < ~var9 && ~(var9 + var13) < ~var11 && ~var12 < ~(var16 + -13) && ~(var16 + 3) < ~var12) {
                                var14 = var15;
                            }
                        } else {
                            int var17 = (class34.field437 - 1 + -var15) * 15 + 33 + var10;
                            if (var11 > var9 && ~var11 > ~(var9 - -var13) && var17 + -13 < var12 && var12 < var17 + 3) {
                                var14 = var15;
                            }
                        }
                    }
                    if (~var14 != 0) {
                        class160.method1115(-14724, var14);
                    }
                    class262.field4250 = false;
                    class225.method1589(class190.field3074, class67.field850, class73.field916, 0, class103.field1392);
                } else {
                    if (var1 == 1 && ~class34.field437 < -1) {
                        short var2 = class155.field2423[class34.field437 + -1];
                        if (var2 == 40 || var2 == 5 || ~var2 == -9 || ~var2 == -31 || var2 == 17 || var2 == 41 || ~var2 == -19 || var2 == 10 || var2 == 34 || var2 == 28 || var2 == 23 || var2 == 1001) {
                            int var3 = class251.field4104[class34.field437 + -1];
                            int var4 = class61.field805[class34.field437 - 1];
                            class123 var5 = class61.method358(var4, -123);
                            class171 var6 = client.method735(var5);
                            if (var6.method1163(30071) || var6.method1174((byte) 93)) {
                                class105.field1410 = 0;
                                class160.field2554 = false;
                                if (class242.field3982 != null) {
                                    class129.method875((byte) -21, class242.field3982);
                                }
                                class242.field3982 = class61.method358(var4, -120);
                                class272.field4349 = var3;
                                class93.field1184 = class214.field3435;
                                class173.field2740 = class107.field1449;
                                class129.method875((byte) -21, class242.field3982);
                                return;
                            }
                        }
                    }
                    if (var1 == 1 && (class233.field3851 == 1 && ~class34.field437 < -3 || class82.method453(106, class34.field437 + -1))) {
                        var1 = 2;
                    }
                    if (~var1 == -3 && ~class34.field437 < -1 || ~class129.field2069 == -2) {
                        class237.method1677(-91);
                    }
                    if (var1 == 1 && class34.field437 > 0 || class129.field2069 == 2) {
                        class178.method1240(4095);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "B", descriptor = "(I)V")
    public final void method1931(int arg0) {
        if (arg0 != -24551) {
            field4556 = null;
        }
        ++field4558;
        super.field1228 = (this.field4557 + 7) / 8;
    }

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "(ZI)V")
    public final void method1932(boolean arg0, int arg1) {
        super.field1218[super.field1228++] = (byte) (arg1 + this.field4560.method69((byte) 122));
        if (arg0) {
            this.method1927(68);
        }
        ++field4549;
    }
}
