import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class115 extends class20 {

    @OriginalMember(owner = "client!uq", name = "O", descriptor = "I")
    public int field1619 = 99;

    @OriginalMember(owner = "client!uq", name = "H", descriptor = "Lcd;")
    public static class109 field1612 = class297.method1831(255);

    @OriginalMember(owner = "client!uq", name = "S", descriptor = "Ltm;")
    public static class112 field1623 = new class112("Attack", "Angreifen", "Attaquer", "Atacar");

    @OriginalMember(owner = "client!uq", name = "W", descriptor = "I")
    public static int field1627 = 0;

    @OriginalMember(owner = "client!uq", name = "X", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!uq", name = "Y", descriptor = "[I")
    public static int[] field1629;

    @OriginalMember(owner = "client!uq", name = "I", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!uq", name = "J", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!uq", name = "K", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!uq", name = "L", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!uq", name = "M", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!uq", name = "N", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!uq", name = "P", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!uq", name = "Q", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!uq", name = "R", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!uq", name = "T", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!uq", name = "U", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!uq", name = "V", descriptor = "Laq;")
    public static class385 field1626;

    // $FF: synthetic field
    @OriginalMember(owner = "client!uq", name = "Z", descriptor = "Ljava/lang/Class;")
    public static Class field1630;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIIIILkm;[Lvk;I[BII)V")
    public final void method720(int arg0, int arg1, int arg2, int arg3, int arg4, class487 arg5, class272[] arg6, int arg7, byte[] arg8, int arg9, int arg10) {
        if (arg10 != -3) {
            field1612 = null;
        }
        ++field1620;
        class425 var12 = new class425(arg8);
        int var13 = -1;
        while (true) {
            int var14 = var12.method2489(65);
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method2474((byte) 107);
                if (var16 == 0) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = var15 & 63;
                int var18 = 63 & var15 >> 6;
                int var19 = var15 >> 12;
                int var20 = var12.method2503(true);
                int var21 = var20 >> 2;
                int var22 = var20 & 3;
                if (~arg7 == ~var19 && ~var18 <= ~arg2 && ~var18 > ~(arg2 - -8) && var17 >= arg0 && arg0 + 8 > var17) {
                    class475 var23 = class304.field4160.method2075(var13, false);
                    int var24 = arg3 - -class341.method2021(var18 & 7, -21741, 7 & var17, var22, var23.field6714, var23.field6708, arg4);
                    int var25 = method729(var23.field6708, 7 & var17, var23.field6714, arg4, (byte) -10, 7 & var18, var22) + arg1;
                    if (var24 > 0 && var25 > 0 && ~var24 > ~(super.field355 + -1) && ~(super.field334 + -1) < ~var25) {
                        class272 var26 = null;
                        if (!super.field352) {
                            int var27 = arg9;
                            if (~(class205.field2947[1][var24][var25] & 2) == -3) {
                                var27 = arg9 - 1;
                            }
                            if (~var27 <= -1) {
                                var26 = arg6[var27];
                            }
                        }
                        this.method724(arg5, arg10 + -12675, var22 - -arg4 & 3, var13, -1, var25, var21, arg9, var24, arg9, var26);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(Llk;I)V")
    public static final void method721(class425 arg0, int arg1) {
        ++field1617;
        if (~(arg0.field5886.length + -arg0.field5830) <= -2) {
            if (arg1 != -25693) {
                field1628 = 49;
            }
            int var2 = arg0.method2503(true);
            if (~var2 <= -1 && ~var2 >= -2) {
                if (arg0.field5886.length + -arg0.field5830 >= 2) {
                    int var3 = arg0.method2508(true);
                    if (~(var3 * 6) == ~(arg0.field5886.length + -arg0.field5830)) {
                        while (true) {
                            int var4;
                            int var5;
                            do {
                                do {
                                    do {
                                        if (arg0.field5830 >= arg0.field5886.length) {
                                            return;
                                        }
                                        var4 = arg0.method2508(true);
                                        var5 = arg0.method2502((byte) -86);
                                    } while (~var4 <= ~class64.field975.length);
                                } while (!class2.field19[var4]);
                            } while (~class347.field4733.method494((byte) -27, var4).field5526 == -50 && (var5 < -1 || ~var5 < -2));
                            class64.field975[var4] = var5;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(II[B[Lvk;Lkm;I)V")
    public final void method722(int arg0, int arg1, byte[] arg2, class272[] arg3, class487 arg4, int arg5) {
        ++field1624;
        class425 var7 = new class425(arg2);
        int var8 = -1;
        while (true) {
            int var9 = var7.method2489(-73);
            if (var9 == 0) {
                int var22 = -40 % ((-32 - arg0) / 41);
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method2474((byte) -115);
                if (~var11 == -1) {
                    break;
                }
                var10 += var11 + -1;
                int var12 = var10 & 63;
                int var13 = 63 & var10 >> 6;
                int var14 = var10 >> 12;
                int var15 = var7.method2503(true);
                int var16 = var15 >> 2;
                int var17 = 3 & var15;
                int var18 = var13 - -arg1;
                int var19 = arg5 + var12;
                if (var18 > 0 && ~var19 < -1 && var18 < super.field355 - 1 && ~(super.field334 - 1) < ~var19) {
                    class272 var20 = null;
                    if (!super.field352) {
                        int var21 = var14;
                        if ((2 & class205.field2947[1][var18][var19]) == 2) {
                            var21 = var14 - 1;
                        }
                        if (var21 >= 0) {
                            var20 = arg3[var21];
                        }
                    }
                    this.method724(arg4, -12678, var17, var8, -1, var19, var16, var14, var18, var14, var20);
                }
            }
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IILkm;IIILvk;)V")
    public final void method723(int arg0, int arg1, class487 arg2, int arg3, int arg4, int arg5, class272 arg6) {
        ++field1618;
        if (arg4 != 4) {
            field1627 = -65;
        }
        class278 var8 = null;
        if (arg5 == 0) {
            var8 = (class278) class37.method309(arg1, arg3, arg0);
        }
        if (~arg5 == -2) {
            var8 = (class278) class245.method1528(arg1, arg3, arg0);
        }
        if (~arg5 == -3) {
            var8 = (class278) class75.method518(arg1, arg3, arg0, field1630 != null ? field1630 : (field1630 = method732("wk")));
        }
        if (~arg5 == -4) {
            var8 = (class278) class292.method1807(arg1, arg3, arg0);
        }
        if (var8 != null) {
            class475 var9 = class304.field4160.method2075(var8.method211(true), false);
            int var10 = var8.method219(-17942);
            int var11 = var8.method215(-11524);
            if (var9.method2783(0)) {
                class136.method828(arg1, arg3, 128, var9, arg0);
            }
            if (var8.method214(25)) {
                var8.method218(arg2, -99);
            }
            if (~arg5 == -1) {
                class467 var12 = class37.method309(arg1, arg3, arg0);
                if (!(var12 instanceof class383)) {
                    class211.method1325(arg1, arg3, arg0);
                } else {
                    ((class383) var12).field5435 = null;
                }
                if (var9.field6671 != 0) {
                    arg6.method1698(arg4 ^ 1028, arg3, arg0, var11, !var9.field6731, var10, var9.field6700);
                    return;
                }
                return;
            }
            if (~arg5 == -2) {
                class87 var13 = class245.method1528(arg1, arg3, arg0);
                if (!(var13 instanceof class203)) {
                    class437.method2541(arg1, arg3, arg0);
                    return;
                }
                ((class203) var13).field2904 = null;
                return;
            }
            if (arg5 == 2) {
                class478 var14 = class75.method518(arg1, arg3, arg0, field1630 != null ? field1630 : (field1630 = method732("wk")));
                if (var14 instanceof class295 && ~var14.field6753 == ~arg3 && var14.field6747 == arg0) {
                    ((class295) var14).field4081 = null;
                } else {
                    class439.method2548(arg1, arg3, arg0, field1630 != null ? field1630 : (field1630 = method732("wk")));
                }
                if (var9.field6671 != 0 && ~super.field355 < ~(var9.field6708 + arg3) && ~super.field334 < ~(var9.field6708 + arg0) && var9.field6714 + arg3 < super.field355 && ~super.field334 < ~(var9.field6714 + arg0)) {
                    arg6.method1695(!var9.field6731, var9.field6700, var9.field6708, 22, var9.field6714, var11, arg0, arg3);
                    return;
                }
                return;
            }
            if (~arg5 == -4) {
                class367 var15 = class292.method1807(arg1, arg3, arg0);
                if (!(var15 instanceof class440)) {
                    class353.method2129(arg1, arg3, arg0);
                } else {
                    ((class440) var15).field6032 = null;
                }
                if (var9.field6671 == 1) {
                    arg6.method1703(arg0, arg3, (byte) 94);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lkm;IIIIIIIIILvk;)V")
    public final void method724(class487 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class272 arg10) {
        ++field1622;
        if (class410.method2404(-1) || class341.method2020(class480.field6794, arg8, arg9, (byte) 125, arg5)) {
            if (~this.field1619 < ~arg9) {
                this.field1619 = arg9;
            }
            class475 var12 = class304.field4160.method2075(arg3, false);
            if (~class221.field3118 != -2 || !var12.field6686) {
                int var13;
                int var14;
                if (~arg2 != -2 && arg2 != 3) {
                    var13 = var12.field6714;
                    var14 = var12.field6708;
                } else {
                    var13 = var12.field6708;
                    var14 = var12.field6714;
                }
                int var15;
                int var16;
                if (~super.field355 > ~(arg8 - -var14)) {
                    var15 = arg8;
                    var16 = arg8 + 1;
                } else {
                    var16 = arg8 - -(var14 + 1 >> 1);
                    var15 = (var14 >> 1) + arg8;
                }
                int var17;
                int var18;
                if (arg5 + var13 <= super.field334) {
                    var17 = arg5 - -(var13 >> 1);
                    var18 = arg5 - -(var13 + 1 >> 1);
                } else {
                    var18 = arg5 + 1;
                    var17 = arg5;
                }
                class269 var19 = class317.field4306[arg7];
                int var20 = var19.method710(var15, var17) + var19.method710(var16, var17) - (-var19.method710(var15, var18) + -var19.method710(var16, var18)) >> 2;
                if (arg1 != -12678) {
                    field1626 = null;
                }
                int var21 = (arg8 << 7) + (var14 << 6);
                int var22 = (arg5 << 7) - -(var13 << 6);
                boolean var23 = class81.field1226 && !super.field352 && var12.field6683;
                if (var12.method2783(0)) {
                    class167.method1024((class23) null, (class196) null, 128, arg9, arg8, arg2, var12, arg5);
                }
                boolean var24 = ~arg4 == 0 && var12.field6724 == -1 && var12.field6719 == null && var12.field6690 == null && !var12.field6647;
                if (!class183.field2654 || var12.field6653 == 1) {
                    if (~arg6 == -23) {
                        if (class216.field3068 || var12.field6681 != 0 || var12.field6671 == 1 || var12.field6666) {
                            class367 var25;
                            if (!var24) {
                                var25 = new class119(arg0, var12, arg9, arg7, var21, var20, var22, super.field352, arg2, arg4);
                            } else {
                                class241 var26 = new class241(arg0, var12, arg7, var21, var20, var22, super.field352, arg2, var23);
                                var25 = var26;
                                if (var26.method214(52)) {
                                    var26.method216(arg0, 114);
                                }
                            }
                            class367 var27 = class292.method1807(arg9, arg8, arg5);
                            if (var27 instanceof class440) {
                                ((class440) var27).field6032 = var25;
                            } else {
                                class330.method1969(arg9, arg8, arg5, var25);
                            }
                            if (~var12.field6671 == -2 && arg10 != null) {
                                arg10.method1690(arg1 ^ -1857, arg5, arg8);
                            }
                        }
                    } else if (~arg6 != -11 && arg6 != 11) {
                        if (~arg6 <= -13 && ~arg6 >= -18 || arg6 >= 18 && ~arg6 >= -22) {
                            class478 var28;
                            if (!var24) {
                                var28 = new class30(arg0, var12, arg9, arg7, var21, var20, var22, super.field352, arg8, var14 - 1 + arg8, arg5, arg5 - -var13 + -1, arg6, arg2, arg4);
                            } else {
                                class197 var29 = new class197(arg0, var12, arg9, arg7, var21, var20, var22, super.field352, arg8, arg8 - 1 + var14, arg5, var13 + -1 + arg5, arg6, arg2, var23);
                                if (var29.method214(arg1 ^ -12800)) {
                                    var29.method216(arg0, -113);
                                }
                                var28 = var29;
                            }
                            class478 var30 = class75.method518(arg9, arg8, arg5, field1630 != null ? field1630 : (field1630 = method732("wk")));
                            if (var30 instanceof class295 && var30.field6753 == arg8 && ~var30.field6747 == ~arg5) {
                                ((class295) var30).field4081 = var28;
                            } else {
                                class249.method1542(var28, false);
                            }
                            if (class81.field1226 && !super.field352 && ~arg6 <= -13 && arg6 <= 17 && arg6 != 13 && ~arg9 < -1 && ~var12.field6653 != -1) {
                                super.field331[arg9][arg8][arg5] = (byte) class366.method2215(super.field331[arg9][arg8][arg5], 4);
                            }
                            if (var12.field6671 != 0 && arg10 != null) {
                                arg10.method1692(0, var13, arg8, !var12.field6731, arg5, var14, var12.field6700);
                            }
                        } else if (~arg6 == -1) {
                            class467 var31;
                            if (!var24) {
                                var31 = new class131(arg0, var12, arg9, arg7, var21, var20, var22, super.field352, arg6, arg2, arg4);
                            } else {
                                class323 var32 = new class323(arg0, var12, arg7, var21, var20, var22, super.field352, arg6, arg2, var23);
                                var31 = var32;
                                if (var32.method214(arg1 + 12709)) {
                                    var32.method216(arg0, -73);
                                }
                            }
                            class467 var33 = class37.method309(arg9, arg8, arg5);
                            if (!(var33 instanceof class383)) {
                                class287.method1769(arg9, arg8, arg5, var31, (class467) null);
                            } else {
                                ((class383) var33).field5435 = var31;
                            }
                            if (class81.field1226) {
                                if (arg2 == 0) {
                                    if (var12.field6670) {
                                        var19.method704(arg8, arg5, 50);
                                        var19.method704(arg8, arg5 + 1, 50);
                                    }
                                    if (~var12.field6653 == -2 && !super.field352) {
                                        super.field331[arg9][arg8][arg5] = (byte) class366.method2215(super.field331[arg9][arg8][arg5], 1);
                                    }
                                } else if (~arg2 == -2) {
                                    if (var12.field6670) {
                                        var19.method704(arg8, arg5 + 1, 50);
                                        var19.method704(arg8 + 1, arg5 + 1, 50);
                                    }
                                    if (~var12.field6653 == -2 && !super.field352) {
                                        super.field331[arg9][arg8][arg5 + 1] = (byte) class366.method2215(super.field331[arg9][arg8][arg5 + 1], 2);
                                    }
                                } else if (~arg2 == -3) {
                                    if (var12.field6670) {
                                        var19.method704(arg8 - -1, arg5, 50);
                                        var19.method704(arg8 - -1, arg5 - -1, 50);
                                    }
                                    if (var12.field6653 == 1 && !super.field352) {
                                        super.field331[arg9][arg8 + 1][arg5] = (byte) class366.method2215(super.field331[arg9][arg8 + 1][arg5], 1);
                                    }
                                } else if (arg2 == 3) {
                                    if (var12.field6670) {
                                        var19.method704(arg8, arg5, 50);
                                        var19.method704(arg8 - -1, arg5, 50);
                                    }
                                    if (~var12.field6653 == -2 && !super.field352) {
                                        super.field331[arg9][arg8][arg5] = (byte) class366.method2215(super.field331[arg9][arg8][arg5], 2);
                                    }
                                }
                            }
                            if (var12.field6671 != 0 && arg10 != null) {
                                arg10.method1705(arg2, var12.field6700, !var12.field6731, arg8, arg6, (byte) -109, arg5);
                            }
                            if (~var12.field6703 != -17) {
                                class244.method1524(arg9, arg8, arg5, var12.field6703);
                            }
                        } else if (arg6 == 1) {
                            class467 var35;
                            if (var24) {
                                class323 var34 = new class323(arg0, var12, arg7, var21, var20, var22, super.field352, arg6, arg2, var23);
                                var35 = var34;
                                if (var34.method214(39)) {
                                    var34.method216(arg0, -124);
                                }
                            } else {
                                var35 = new class131(arg0, var12, arg9, arg7, var21, var20, var22, super.field352, arg6, arg2, arg4);
                            }
                            class467 var36 = class37.method309(arg9, arg8, arg5);
                            if (!(var36 instanceof class383)) {
                                class287.method1769(arg9, arg8, arg5, var35, (class467) null);
                            } else {
                                ((class383) var36).field5435 = var35;
                            }
                            if (var12.field6670 && class81.field1226) {
                                if (~arg2 == -1) {
                                    var19.method704(arg8, arg5 + 1, 50);
                                } else if (arg2 != 1) {
                                    if (~arg2 != -3) {
                                        if (~arg2 == -4) {
                                            var19.method704(arg8, arg5, 50);
                                        }
                                    } else {
                                        var19.method704(arg8 + 1, arg5, 50);
                                    }
                                } else {
                                    var19.method704(arg8 - -1, arg5 - -1, 50);
                                }
                            }
                            if (~var12.field6671 != -1 && arg10 != null) {
                                arg10.method1705(arg2, var12.field6700, !var12.field6731, arg8, arg6, (byte) -109, arg5);
                            }
                        } else if (~arg6 == -3) {
                            int var37 = 3 & arg2 + 1;
                            class467 var38;
                            class467 var39;
                            if (!var24) {
                                var38 = new class131(arg0, var12, arg9, arg7, var21, var20, var22, super.field352, arg6, arg2 + 4, arg4);
                                var39 = new class131(arg0, var12, arg9, arg7, var21, var20, var22, super.field352, arg6, var37, arg4);
                            } else {
                                class323 var40 = new class323(arg0, var12, arg7, var21, var20, var22, super.field352, arg6, arg2 + 4, var23);
                                class323 var41 = new class323(arg0, var12, arg7, var21, var20, var22, super.field352, arg6, var37, var23);
                                if (var40.method214(121)) {
                                    var40.method216(arg0, -94);
                                }
                                var38 = var40;
                                if (var41.method214(56)) {
                                    var41.method216(arg0, 107);
                                }
                                var39 = var41;
                            }
                            class287.method1769(arg9, arg8, arg5, var38, var39);
                            if (~var12.field6653 == -2 && class81.field1226 && !super.field352) {
                                if (~arg2 != -1) {
                                    if (~arg2 == -2) {
                                        super.field331[arg9][arg8][arg5 - -1] = (byte) class366.method2215(super.field331[arg9][arg8][arg5 - -1], 2);
                                        super.field331[arg9][arg8 + 1][arg5] = (byte) class366.method2215(super.field331[arg9][arg8 + 1][arg5], 1);
                                    } else if (~arg2 == -3) {
                                        super.field331[arg9][arg8 - -1][arg5] = (byte) class366.method2215(super.field331[arg9][arg8 - -1][arg5], 1);
                                        super.field331[arg9][arg8][arg5] = (byte) class366.method2215(super.field331[arg9][arg8][arg5], 2);
                                    } else if (~arg2 == -4) {
                                        super.field331[arg9][arg8][arg5] = (byte) class366.method2215(super.field331[arg9][arg8][arg5], 2);
                                        super.field331[arg9][arg8][arg5] = (byte) class366.method2215(super.field331[arg9][arg8][arg5], 1);
                                    }
                                } else {
                                    super.field331[arg9][arg8][arg5] = (byte) class366.method2215(super.field331[arg9][arg8][arg5], 1);
                                    super.field331[arg9][arg8][arg5 + 1] = (byte) class366.method2215(super.field331[arg9][arg8][arg5 + 1], 2);
                                }
                            }
                            if (~var12.field6671 != -1 && arg10 != null) {
                                arg10.method1705(arg2, var12.field6700, !var12.field6731, arg8, arg6, (byte) -109, arg5);
                            }
                            if (~var12.field6703 != -17) {
                                class244.method1524(arg9, arg8, arg5, var12.field6703);
                            }
                        } else if (arg6 == 3) {
                            class467 var43;
                            if (var24) {
                                class323 var42 = new class323(arg0, var12, arg7, var21, var20, var22, super.field352, arg6, arg2, var23);
                                var43 = var42;
                                if (var42.method214(arg1 + 12772)) {
                                    var42.method216(arg0, arg1 ^ 12749);
                                }
                            } else {
                                var43 = new class131(arg0, var12, arg9, arg7, var21, var20, var22, super.field352, arg6, arg2, arg4);
                            }
                            class467 var44 = class37.method309(arg9, arg8, arg5);
                            if (!(var44 instanceof class383)) {
                                class287.method1769(arg9, arg8, arg5, var43, (class467) null);
                            } else {
                                ((class383) var44).field5435 = var43;
                            }
                            if (var12.field6670 && class81.field1226) {
                                if (arg2 == 0) {
                                    var19.method704(arg8, arg5 + 1, 50);
                                } else if (~arg2 == -2) {
                                    var19.method704(arg8 - -1, arg5 + 1, 50);
                                } else if (~arg2 != -3) {
                                    if (arg2 == 3) {
                                        var19.method704(arg8, arg5, 50);
                                    }
                                } else {
                                    var19.method704(arg8 + 1, arg5, 50);
                                }
                            }
                            if (~var12.field6671 != -1 && arg10 != null) {
                                arg10.method1705(arg2, var12.field6700, !var12.field6731, arg8, arg6, (byte) -109, arg5);
                            }
                        } else if (~arg6 == -10) {
                            class478 var46;
                            if (var24) {
                                class197 var45 = new class197(arg0, var12, arg9, arg7, var21, var20, var22, super.field352, arg8, arg8, arg5, arg5, arg6, arg2, var23);
                                if (var45.method214(arg1 ^ -12737)) {
                                    var45.method216(arg0, -107);
                                }
                                var46 = var45;
                            } else {
                                var46 = new class30(arg0, var12, arg9, arg7, var21, var20, var22, super.field352, arg8, arg8 - -var14 + -1, arg5, arg5 + var13 + -1, arg6, arg2, arg4);
                            }
                            class478 var47 = class75.method518(arg9, arg8, arg5, field1630 != null ? field1630 : (field1630 = method732("wk")));
                            if (var47 instanceof class295 && ~var47.field6753 == ~arg8 && var47.field6747 == arg5) {
                                ((class295) var47).field4081 = var46;
                            } else {
                                class249.method1542(var46, false);
                            }
                            if (var12.field6671 != 0 && arg10 != null) {
                                arg10.method1692(0, var13, arg8, !var12.field6731, arg5, var14, var12.field6700);
                            }
                            if (~var12.field6703 != -17) {
                                class244.method1524(arg9, arg8, arg5, var12.field6703);
                            }
                        } else if (arg6 == 4) {
                            class87 var49;
                            if (var24) {
                                class50 var48 = new class50(arg0, var12, arg7, var21, var20, var22, super.field352, 0, 0, 0, arg6, arg2);
                                var49 = var48;
                                if (var48.method214(63)) {
                                    var48.method216(arg0, 81);
                                }
                            } else {
                                var49 = new class24(arg0, var12, arg9, arg7, var21, var20, var22, super.field352, 0, 0, 0, arg6, arg2, arg4);
                            }
                            class87 var50 = class245.method1528(arg9, arg8, arg5);
                            if (!(var50 instanceof class203)) {
                                class478.method2810(arg9, arg8, arg5, var49, (class87) null);
                            } else {
                                ((class203) var50).field2904 = var49;
                            }
                        } else if (arg6 == 5) {
                            int var51 = 16;
                            class278 var52 = (class278) class37.method309(arg9, arg8, arg5);
                            if (var52 != null) {
                                var51 = class304.field4160.method2075(var52.method211(true), false).field6703;
                            }
                            class87 var54;
                            if (var24) {
                                class50 var53 = new class50(arg0, var12, arg7, var21, var20, var22, super.field352, 0, class310.field4241[arg2] * var51, class328.field4532[arg2] * var51, arg6, arg2);
                                if (var53.method214(117)) {
                                    var53.method216(arg0, -126);
                                }
                                var54 = var53;
                            } else {
                                var54 = new class24(arg0, var12, arg9, arg7, var21, var20, var22, super.field352, 0, class310.field4241[arg2] * var51, class328.field4532[arg2] * var51, arg6, arg2, arg4);
                            }
                            class87 var55 = class245.method1528(arg9, arg8, arg5);
                            if (var55 instanceof class203) {
                                ((class203) var55).field2904 = var54;
                            } else {
                                class478.method2810(arg9, arg8, arg5, var54, (class87) null);
                            }
                        } else if (arg6 == 6) {
                            int var56 = 8;
                            class278 var57 = (class278) class37.method309(arg9, arg8, arg5);
                            if (var57 != null) {
                                var56 = class304.field4160.method2075(var57.method211(true), false).field6703 / 2;
                            }
                            class87 var58;
                            if (!var24) {
                                var58 = new class24(arg0, var12, arg9, arg7, var21, var20, var22, super.field352, arg2, class148.field2097[arg2] * var56, class255.field3574[arg2] * var56, arg6, arg2 - -4, arg4);
                            } else {
                                class50 var59 = new class50(arg0, var12, arg7, var21, var20, var22, super.field352, arg2, class310.field4241[arg2] * var56, class328.field4532[arg2] * var56, arg6, arg2 + 4);
                                var58 = var59;
                                if (var59.method214(120)) {
                                    var59.method216(arg0, 71);
                                }
                            }
                            class87 var60 = class245.method1528(arg9, arg8, arg5);
                            if (var60 instanceof class203) {
                                ((class203) var60).field2904 = var58;
                            } else {
                                class478.method2810(arg9, arg8, arg5, var58, (class87) null);
                            }
                        } else if (~arg6 == -8) {
                            int var61 = 3 & arg2 + 2;
                            class87 var63;
                            if (var24) {
                                class50 var62 = new class50(arg0, var12, arg7, var21, var20, var22, super.field352, var61, 0, 0, arg6, var61 - -4);
                                var63 = var62;
                                if (var62.method214(arg1 ^ -12713)) {
                                    var62.method216(arg0, -87);
                                }
                            } else {
                                var63 = new class24(arg0, var12, arg9, arg7, var21, var20, var22, super.field352, var61, 0, 0, arg6, var61 - -4, arg4);
                            }
                            class87 var64 = class245.method1528(arg9, arg8, arg5);
                            if (var64 instanceof class203) {
                                ((class203) var64).field2904 = var63;
                            } else {
                                class478.method2810(arg9, arg8, arg5, var63, (class87) null);
                            }
                        } else if (~arg6 == -9) {
                            int var65 = 3 & arg2 + 2;
                            int var66 = 8;
                            class278 var67 = (class278) class37.method309(arg9, arg8, arg5);
                            if (var67 != null) {
                                var66 = class304.field4160.method2075(var67.method211(true), false).field6703 / 2;
                            }
                            class87 var70;
                            class87 var71;
                            if (!var24) {
                                class24 var68 = new class24(arg0, var12, arg9, arg7, var21, var20, var22, super.field352, arg2, class148.field2097[arg2] * var66, class255.field3574[arg2] * var66, arg6, arg2 - -4, arg4);
                                class24 var69 = new class24(arg0, var12, arg9, arg7, var21, var20, var22, super.field352, arg2, 0, 0, arg6, var65 - -4, arg4);
                                var70 = var68;
                                var71 = var69;
                            } else {
                                class50 var72 = new class50(arg0, var12, arg7, var21, var20, var22, super.field352, arg2, class148.field2097[arg2] * var66, class255.field3574[arg2] * var66, arg6, arg2 - -4);
                                class50 var73 = new class50(arg0, var12, arg7, var21, var20, var22, super.field352, arg2, 0, 0, arg6, var65 - -4);
                                if (var72.method214(32)) {
                                    var72.method216(arg0, 100);
                                }
                                var70 = var72;
                                if (var73.method214(98)) {
                                    var73.method216(arg0, arg1 ^ 12757);
                                }
                                var71 = var73;
                            }
                            class478.method2810(arg9, arg8, arg5, var70, var71);
                        }
                    } else {
                        class197 var74 = null;
                        class478 var75;
                        int var76;
                        if (!var24) {
                            var75 = new class30(arg0, var12, arg9, arg7, var21, var20, var22, super.field352, arg8, arg8 + var14 + -1, arg5, arg5 + var13 - 1, arg6, arg2, arg4);
                            var76 = 15;
                        } else {
                            class197 var77 = new class197(arg0, var12, arg9, arg7, var21, var20, var22, super.field352, arg8, arg8 + var14 + -1, arg5, arg5 + var13 + -1, arg6, arg2, var23);
                            var74 = var77;
                            var76 = var77.method1257((byte) 10);
                            var75 = var77;
                        }
                        class478 var78 = class75.method518(arg9, arg8, arg5, field1630 != null ? field1630 : (field1630 = method732("wk")));
                        boolean var79 = false;
                        if (var78 instanceof class295 && ~var78.field6753 == ~arg8 && var78.field6747 == arg5) {
                            ((class295) var78).field4081 = var75;
                            var79 = true;
                        }
                        if (var79 || class249.method1542(var75, false)) {
                            if (var74 != null && var74.method214(93)) {
                                var74.method216(arg0, 92);
                            }
                            if (var12.field6670 && class81.field1226) {
                                if (~var76 < -31) {
                                    var76 = 30;
                                }
                                for (int var80 = 0; ~var14 <= ~var80; ++var80) {
                                    for (int var81 = 0; var81 <= var13; ++var81) {
                                        var19.method704(arg8 + var80, arg5 - -var81, var76);
                                    }
                                }
                            }
                        }
                        if (~var12.field6671 != -1 && arg10 != null) {
                            arg10.method1692(arg1 ^ -12678, var13, arg8, !var12.field6731, arg5, var14, var12.field6700);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "(I)V")
    public static final void method725(int arg0) {
        class2.field18.method1138(class7.field120, class301.field4127 ? class479.field6774 + 256 : -1);
        if (arg0 == 1) {
            ++field1613;
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lkm;I[IIILlk;)V")
    public final void method726(class487 arg0, int arg1, int[] arg2, int arg3, int arg4, class425 arg5) {
        ++field1615;
        if (!super.field352) {
            boolean var7 = false;
            class38 var8 = null;
            if (arg2 != null) {
                arg2[0] = -1;
            }
            while (true) {
                while (true) {
                    while (true) {
                        while (true) {
                            while (~arg5.field5886.length < ~arg5.field5830) {
                                int var18 = arg5.method2503(true);
                                if (~var18 != -1) {
                                    if (~var18 != -2) {
                                        if (var18 != 2) {
                                            if (~var18 != -129) {
                                                if (~var18 != -130) {
                                                    throw new IllegalStateException((String) null);
                                                }
                                                if (super.field336 == null) {
                                                    super.field336 = new byte[4][][];
                                                }
                                                for (int var19 = 0; ~var19 > -5; ++var19) {
                                                    byte var20 = arg5.method2480(-8315);
                                                    if (~var20 == -1 && super.field336[var19] != null) {
                                                        int var21 = arg3;
                                                        int var22 = arg3 - -64;
                                                        int var23 = arg4;
                                                        int var24 = arg4 + 64;
                                                        if (var22 < 0) {
                                                            var22 = 0;
                                                        } else if (var22 >= super.field355) {
                                                            var22 = super.field355;
                                                        }
                                                        if (arg4 >= 0) {
                                                            if (super.field334 <= arg4) {
                                                                var23 = super.field334;
                                                            }
                                                        } else {
                                                            var23 = 0;
                                                        }
                                                        if (~arg3 > -1) {
                                                            var21 = 0;
                                                        } else if (~arg3 <= ~super.field355) {
                                                            var21 = super.field355;
                                                        }
                                                        if (var24 < 0) {
                                                            var24 = 0;
                                                        } else if (super.field334 <= var24) {
                                                            var24 = super.field334;
                                                        }
                                                        while (~var22 < ~var21) {
                                                            while (var23 < var24) {
                                                                super.field336[var19][var21][var23] = 0;
                                                                ++var23;
                                                            }
                                                            ++var21;
                                                        }
                                                    } else if (~var20 == -2) {
                                                        if (super.field336[var19] == null) {
                                                            super.field336[var19] = new byte[super.field355 - -1][super.field334 - -1];
                                                        }
                                                        for (int var25 = 0; ~var25 > -65; var25 += 4) {
                                                            for (int var26 = 0; var26 < 64; var26 += 4) {
                                                                byte var27 = arg5.method2480(arg1 ^ 1825);
                                                                for (int var28 = arg3 + var25; ~(var25 + 4 - -arg3) < ~var28; ++var28) {
                                                                    for (int var29 = arg4 + var26; ~(var26 - -4 + arg4) < ~var29; ++var29) {
                                                                        if (var28 >= 0 && var28 < super.field355 && ~var29 <= -1 && ~var29 > ~super.field334) {
                                                                            super.field336[var19][var28][var29] = var27;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else if (~var20 == -3) {
                                                        if (super.field336[var19] == null) {
                                                            super.field336[var19] = new byte[super.field355 + 1][super.field334 + 1];
                                                        }
                                                        if (var19 > 0) {
                                                            int var30 = arg3;
                                                            int var31 = arg3 + 64;
                                                            int var32 = arg4;
                                                            int var33 = arg4 + 64;
                                                            if (var31 >= 0) {
                                                                if (var31 >= super.field355) {
                                                                    var31 = super.field355;
                                                                }
                                                            } else {
                                                                var31 = 0;
                                                            }
                                                            if (~arg3 > -1) {
                                                                var30 = 0;
                                                            } else if (~arg3 <= ~super.field355) {
                                                                var30 = super.field355;
                                                            }
                                                            if (~arg4 <= -1) {
                                                                if (arg4 >= super.field334) {
                                                                    var32 = super.field334;
                                                                }
                                                            } else {
                                                                var32 = 0;
                                                            }
                                                            if (~var33 > -1) {
                                                                var33 = 0;
                                                            } else if (~var33 <= ~super.field334) {
                                                                var33 = super.field334;
                                                            }
                                                            while (var31 > var30) {
                                                                while (~var33 < ~var32) {
                                                                    super.field336[var19][var30][var32] = super.field336[var19 - 1][var30][var32];
                                                                    ++var32;
                                                                }
                                                                ++var30;
                                                            }
                                                        }
                                                    }
                                                }
                                                var7 = true;
                                            } else if (arg2 != null) {
                                                arg2[0] = arg5.method2508(true);
                                                arg2[1] = arg5.method2514(9786);
                                                arg2[2] = arg5.method2514(arg1 + 19862);
                                                arg2[3] = arg5.method2514(9786);
                                                arg2[4] = arg5.method2508(true);
                                            } else {
                                                arg5.field5830 += 10;
                                            }
                                        } else {
                                            if (var8 == null) {
                                                var8 = new class38();
                                            }
                                            var8.method316(arg5, 10051);
                                        }
                                    } else {
                                        int var34 = arg5.method2503(true);
                                        if (~var34 < -1) {
                                            for (int var35 = 0; ~var35 > ~var34; ++var35) {
                                                class270 var36 = new class270(arg5);
                                                if (var36.field3741 == 31) {
                                                    class165 var37 = class448.field6178.method1194(arg5.method2508(true), 113);
                                                    var36.method1687(var37.field2436, 9, var37.field2433, var37.field2437, var37.field2440);
                                                }
                                                var36.field6883 += arg3 << 7;
                                                var36.field6879 += arg4 << 7;
                                                int var38 = var36.field6883 >> 7;
                                                int var39 = var36.field6879 >> 7;
                                                if (~var38 <= -1 && ~var39 <= -1 && super.field355 > var38 && ~super.field334 < ~var39) {
                                                    var36.field6877 = super.field348[var36.field3743][var38][var39] - var36.field6877;
                                                    if (arg0.method1051() > 0) {
                                                        class465.method2744(var36);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    var8 = new class38(arg5);
                                }
                            }
                            if (arg1 != -10076) {
                                return;
                            }
                            if (var8 != null) {
                                for (int var9 = 0; var9 < 8; ++var9) {
                                    for (int var10 = 0; var10 < 8; ++var10) {
                                        int var11 = (arg3 >> 3) + var9;
                                        int var12 = (arg4 >> 3) + var10;
                                        if (~var11 <= -1 && ~(super.field355 >> 3) < ~var11 && var12 >= 0 && ~var12 > ~(super.field334 >> 3)) {
                                            class255.method1585(arg1 ^ 10029, var12, var11, var8);
                                        }
                                    }
                                }
                            }
                            if (!var7 && super.field336 != null) {
                                for (int var13 = 0; var13 < 4; ++var13) {
                                    if (super.field336[var13] != null) {
                                        for (int var14 = 0; ~var14 > -17; ++var14) {
                                            for (int var15 = 0; var15 < 16; ++var15) {
                                                int var16 = (arg3 >> 2) + var14;
                                                int var17 = (arg4 >> 2) - -var15;
                                                if (~var16 <= -1 && ~var16 > -27 && ~var17 <= -1 && ~var17 > -27) {
                                                    super.field336[var13][var16][var17] = 0;
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
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(I[IIZILkm;IIILlk;I)V")
    public final void method727(int arg0, int[] arg1, int arg2, boolean arg3, int arg4, class487 arg5, int arg6, int arg7, int arg8, class425 arg9, int arg10) {
        ++field1621;
        if (!arg3) {
            this.method731((class487) null, 101);
        }
        if (!super.field352) {
            boolean var12 = false;
            class38 var13 = null;
            if (arg1 != null) {
                arg1[0] = -1;
            }
            int var14 = (arg8 & 7) * 8;
            int var15 = (7 & arg0) * 8;
            while (true) {
                while (arg9.field5886.length > arg9.field5830) {
                    int var20 = arg9.method2503(arg3);
                    if (var20 == 0) {
                        var13 = new class38(arg9);
                    } else if (var20 == 1) {
                        int var34 = arg9.method2503(arg3);
                        if (var34 > 0) {
                            for (int var35 = 0; var34 > var35; ++var35) {
                                class270 var36 = new class270(arg9);
                                if (~var36.field3741 == -32) {
                                    class165 var37 = class448.field6178.method1194(arg9.method2508(true), 108);
                                    var36.method1687(var37.field2436, 9, var37.field2433, var37.field2437, var37.field2440);
                                }
                                int var38 = var36.field6883 >> 7;
                                int var39 = var36.field6879 >> 7;
                                if (~var36.field3743 == ~arg4 && ~var14 >= ~var38 && ~var38 > ~(var14 - -8) && var39 >= var15 && ~(var15 + 8) < ~var39) {
                                    int var40 = class366.method2211(var36.field6883 & 1023, 1023, var36.field6879 & 1023, arg2) + (arg7 << 7);
                                    int var41 = (arg6 << 7) + class350.method2097(arg2, 1023 & var36.field6883, var36.field6879 & 1023, (byte) -87);
                                    var36.field6879 = var41;
                                    var36.field6883 = var40;
                                    int var42 = var36.field6883 >> 7;
                                    int var43 = var36.field6879 >> 7;
                                    if (~var42 <= -1 && var43 >= 0 && ~var42 > ~super.field355 && ~var43 > ~super.field334) {
                                        var36.field6877 = super.field348[arg4][var42][var43] + -var36.field6877;
                                        if (arg5.method1051() > 0) {
                                            class465.method2744(var36);
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var20 == 2) {
                        if (var13 == null) {
                            var13 = new class38();
                        }
                        var13.method316(arg9, 10051);
                    } else if (var20 == 128) {
                        if (arg1 == null) {
                            arg9.field5830 += 10;
                        } else {
                            arg1[0] = arg9.method2508(arg3);
                            arg1[1] = arg9.method2514(9786);
                            arg1[2] = arg9.method2514(9786);
                            arg1[3] = arg9.method2514(9786);
                            arg1[4] = arg9.method2508(true);
                        }
                    } else {
                        if (var20 != 129) {
                            throw new IllegalStateException("");
                        }
                        if (super.field336 == null) {
                            super.field336 = new byte[4][][];
                        }
                        for (int var21 = 0; ~var21 > -5; ++var21) {
                            byte var22 = arg9.method2480(-8315);
                            if (var22 == 0 && super.field336[arg10] != null) {
                                if (var21 <= arg4) {
                                    int var23 = arg7;
                                    int var24 = arg7 + 7;
                                    int var25 = arg6;
                                    int var26 = arg6 + 7;
                                    if (arg7 < 0) {
                                        var23 = 0;
                                    } else if (~arg7 <= ~super.field355) {
                                        var23 = super.field355;
                                    }
                                    if (arg6 < 0) {
                                        var25 = 0;
                                    } else if (~super.field334 >= ~arg6) {
                                        var25 = super.field334;
                                    }
                                    if (var24 >= 0) {
                                        if (super.field355 <= var24) {
                                            var24 = super.field355;
                                        }
                                    } else {
                                        var24 = 0;
                                    }
                                    if (~var26 <= -1) {
                                        if (var26 >= super.field334) {
                                            var26 = super.field334;
                                        }
                                    } else {
                                        var26 = 0;
                                    }
                                    while (~var24 < ~var23) {
                                        while (var26 > var25) {
                                            super.field336[arg10][var23][var25] = 0;
                                            ++var25;
                                        }
                                        ++var23;
                                    }
                                }
                            } else if (~var22 == -2) {
                                if (super.field336[arg10] == null) {
                                    super.field336[arg10] = new byte[super.field355 + 1][super.field334 + 1];
                                }
                                for (int var27 = 0; var27 < 64; var27 += 4) {
                                    for (int var28 = 0; var28 < 64; var28 += 4) {
                                        byte var29 = arg9.method2480(-8315);
                                        if (~var21 >= ~arg4) {
                                            for (int var30 = var27; ~var30 > ~(var27 + 4); ++var30) {
                                                for (int var31 = var28; ~(var28 - -4) < ~var31; ++var31) {
                                                    if (~var14 >= ~var30 && var30 < var14 + 8 && ~var15 >= ~var31 && ~(var15 + 8) < ~var15) {
                                                        int var32 = class259.method1605(7 & var30, arg2, 7 & var31, !arg3) + arg7;
                                                        int var33 = class239.method1498(arg2, var30 & 7, (byte) -114, var31 & 7) + arg6;
                                                        if (var32 >= 0 && ~super.field355 < ~var32 && ~var33 <= -1 && ~var33 > ~super.field334) {
                                                            super.field336[arg10][var32][var33] = var29;
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
                    class255.method1585(47, arg6 >> 3, arg7 >> 3, var13);
                }
                if (!var12 && super.field336 != null && super.field336[arg10] != null) {
                    int var16 = arg7 + 7;
                    int var17 = arg6 - -7;
                    for (int var18 = arg7; var18 < var16; ++var18) {
                        for (int var19 = arg6; ~var19 > ~var17; ++var19) {
                            super.field336[arg10][var18][var19] = 0;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(IIIZ)V")
    public class115(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class33.field532, class59.field928);
    }

    @OriginalMember(owner = "client!uq", name = "d", descriptor = "(I)V")
    public static void method728(int arg0) {
        field1629 = null;
        field1612 = null;
        field1626 = null;
        if (arg0 == 18545) {
            field1623 = null;
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIIIBII)I")
    private static final int method729(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        int var7 = arg3 & 3;
        if ((arg6 & 1) == 1) {
            int var8 = arg0;
            arg0 = arg2;
            arg2 = var8;
        }
        int var9 = 12 / ((arg4 - 56) / 62);
        ++field1614;
        if (var7 == 0) {
            return arg1;
        } else if (var7 == 1) {
            return -arg0 + 1 + -arg5 + 7;
        } else {
            return var7 == 2 ? -arg2 - -1 + -arg1 + 7 : arg5;
        }
    }

    @OriginalMember(owner = "client!uq", name = "e", descriptor = "(I)V")
    public static final void method730(int arg0) {
        class182.field2650 = false;
        class228.field3230 = arg0;
        class299.field4114 = 0;
        class353.field4917 = -3;
        class48.field783 = 0;
        class180.field2612 = -1;
        ++field1625;
        class184.field2669 = 0;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lkm;I)V")
    public final void method731(class487 arg0, int arg1) {
        ++field1616;
        class63.method460(arg0);
        if (~super.field345 < -2) {
            for (int var3 = 0; super.field355 > var3; ++var3) {
                for (int var4 = 0; ~var4 > ~super.field334; ++var4) {
                    if (~(2 & class205.field2947[1][var3][var4]) == -3) {
                        class480.method2827(var3, var4);
                    }
                }
            }
        }
        for (int var5 = 0; ~super.field345 < ~var5; ++var5) {
            for (int var6 = 0; ~var6 >= ~super.field334; ++var6) {
                for (int var7 = 0; ~super.field355 <= ~var7; ++var7) {
                    if (~(super.field331[var5][var7][var6] & 1) != -1) {
                        int var8 = var6;
                        int var9 = var6;
                        int var10 = var5;
                        while (~var9 > ~super.field334 && ~(super.field331[var5][var7][var9 + 1] & 1) != -1) {
                            ++var9;
                        }
                        int var11 = var5;
                        while (~var8 < -1 && (super.field331[var5][var7][var8 + -1] & 1) != 0) {
                            --var8;
                        }
                        label171: while (~var10 < -1) {
                            for (int var12 = var8; ~var12 >= ~var9; ++var12) {
                                if (~(super.field331[var10 + -1][var7][var12] & 1) == -1) {
                                    break label171;
                                }
                            }
                            --var10;
                        }
                        label160: while (var11 < 3) {
                            for (int var13 = var8; ~var13 >= ~var9; ++var13) {
                                if ((1 & super.field331[var11 + 1][var7][var13]) == 0) {
                                    break label160;
                                }
                            }
                            ++var11;
                        }
                        int var14 = (var11 - (-1 - -var10)) * (var9 - -1 + -var8);
                        if (~var14 <= -3) {
                            short var15 = 240;
                            int var16 = super.field348[var11][var7][var8] - var15;
                            int var17 = super.field348[var10][var7][var8];
                            class155.method943(1, var7 * 128, var7 * 128, var8 * 128, var9 * 128 + 128, var16, var17);
                            for (int var18 = var10; ~var11 <= ~var18; ++var18) {
                                for (int var19 = var8; ~var9 <= ~var19; ++var19) {
                                    super.field331[var18][var7][var19] = (byte) class347.method2074(super.field331[var18][var7][var19], -2);
                                }
                            }
                        }
                    }
                    if ((super.field331[var5][var7][var6] & 2) != 0) {
                        int var20 = var7;
                        int var21 = var7;
                        int var22 = var5;
                        while (~var20 < -1 && (super.field331[var5][var20 + -1][var6] & 2) != 0) {
                            --var20;
                        }
                        int var23 = var5;
                        while (~var21 > ~super.field355 && (super.field331[var5][var21 + 1][var6] & 2) != 0) {
                            ++var21;
                        }
                        label225: while (~var22 < -1) {
                            for (int var24 = var20; var21 >= var24; ++var24) {
                                if (~(super.field331[var22 + -1][var24][var6] & 2) == -1) {
                                    break label225;
                                }
                            }
                            --var22;
                        }
                        label214: while (~var23 > -4) {
                            for (int var25 = var20; var21 >= var25; ++var25) {
                                if ((super.field331[var23 + 1][var25][var6] & 2) == 0) {
                                    break label214;
                                }
                            }
                            ++var23;
                        }
                        int var26 = (var23 - -1 - var22) * (-var20 + var21 + 1);
                        if (~var26 <= -3) {
                            short var27 = 240;
                            int var28 = super.field348[var23][var20][var6] + -var27;
                            int var29 = super.field348[var22][var20][var6];
                            class155.method943(2, var20 * 128, var21 * 128 - -128, var6 * 128, var6 * 128, var28, var29);
                            for (int var30 = var22; var30 <= var23; ++var30) {
                                for (int var31 = var20; var31 <= var21; ++var31) {
                                    super.field331[var30][var31][var6] = (byte) class347.method2074(super.field331[var30][var31][var6], -3);
                                }
                            }
                        }
                    }
                    if ((4 & super.field331[var5][var7][var6]) != 0) {
                        int var32 = var7;
                        int var33 = var7;
                        int var34 = var6;
                        int var35 = var6;
                        while (~var34 < -1 && ~(4 & super.field331[var5][var7][var34 + -1]) != -1) {
                            --var34;
                        }
                        while (super.field334 > var35 && (super.field331[var5][var7][var35 + 1] & 4) != 0) {
                            ++var35;
                        }
                        label279: while (var32 > 0) {
                            for (int var36 = var34; var36 <= var35; ++var36) {
                                if (~(super.field331[var5][var32 + -1][var36] & 4) == -1) {
                                    break label279;
                                }
                            }
                            --var32;
                        }
                        label268: while (~super.field355 < ~var33) {
                            for (int var37 = var34; ~var35 <= ~var37; ++var37) {
                                if (~(super.field331[var5][var33 + 1][var37] & 4) == -1) {
                                    break label268;
                                }
                            }
                            ++var33;
                        }
                        if ((-var32 + var33 + 1) * (-var34 + 1 + var35) >= 4) {
                            int var38 = super.field348[var5][var32][var34];
                            class155.method943(4, var32 * 128, var33 * 128 - -128, var34 * 128, var35 * 128 + 128, var38, var38);
                            for (int var39 = var32; ~var33 <= ~var39; ++var39) {
                                for (int var40 = var34; var40 <= var35; ++var40) {
                                    super.field331[var5][var39][var40] = (byte) class347.method2074(super.field331[var5][var39][var40], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg1 != 4) {
            field1612 = null;
        }
        super.field331 = null;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method732(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class112("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
        field1628 = -1;
        field1629 = new int[5];
    }
}
