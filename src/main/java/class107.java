import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class107 {

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "I")
    public static int field1755 = 0;

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "Lqh;")
    public static class189 field1757 = new class189(4);

    @OriginalMember(owner = "client!vj", name = "r", descriptor = "Ldf;")
    private static class51 field1769 = class46.method233("flash1:", 100);

    @OriginalMember(owner = "client!vj", name = "p", descriptor = "Ldf;")
    public static class51 field1767 = field1769;

    @OriginalMember(owner = "client!vj", name = "q", descriptor = "Ldf;")
    public static class51 field1768 = field1769;

    @OriginalMember(owner = "client!vj", name = "t", descriptor = "Ldf;")
    public static class51 field1771 = class46.method233("weiss:", 100);

    @OriginalMember(owner = "client!vj", name = "u", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1772 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!vj", name = "n", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!vj", name = "o", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "J")
    public long field1760;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "Lvj;")
    public class107 field1758;

    @OriginalMember(owner = "client!vj", name = "s", descriptor = "Lvj;")
    public class107 field1770;

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "[Ltg;")
    public static class171[] field1762;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)Lea;")
    public static final class35 method762(int arg0, int arg1) {
        field1761++;
        class35 var2 = (class35) class75.field1214.method1357((byte) 119, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class50.field795.method828(arg0, (byte) 119, arg1);
        class35 var4 = new class35();
        if (var3 != null) {
            var4.method175(new class121(var3), false);
        }
        class75.field1214.method1351(var4, arg0 ^ 0x1, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)V")
    public static final void method763(byte arg0) {
        field1759++;
        if (class35.field516 == 52) {
            int var1 = class97.field1622.method880((byte) 107);
            int var2 = class97.field1622.method897(114);
            int var3 = (var2 & 0x7) + class260.field4545;
            int var4 = ((var2 & 0x72) >> 4) + class67.field1095;
            int var5 = class97.field1622.method914(69);
            if (var4 >= 0 && var3 >= 0 && var4 < 104 && var3 < 104) {
                class184 var6 = new class184();
                var6.field3034 = var5;
                var6.field3038 = var1;
                if (class90.field1493[class257.field4496][var4][var3] == null) {
                    class90.field1493[class257.field4496][var4][var3] = new class252();
                }
                class90.field1493[class257.field4496][var4][var3].method1709(109, new class86(var6));
                class51.method272(var4, var3, arg0 ^ 0xFFFF8FB3);
            }
            return;
        }
        if (class35.field516 == 93) {
            byte var7 = class97.field1622.method918(arg0 ^ 0xC1);
            byte var8 = class97.field1622.method869(-123);
            int var9 = class97.field1622.method901((byte) -4);
            int var10 = var9 >> 2;
            int var11 = class247.field4315[var10];
            int var12 = var9 & 0x3;
            int var13 = class97.field1622.method880((byte) 107);
            int var14 = class97.field1622.method881(0);
            int var15 = class67.field1095 + (var14 >> 4 & 0x7);
            int var16 = (var14 & 0x7) + class260.field4545;
            int var17 = class97.field1622.method890((byte) -83);
            int var18 = class97.field1622.method880((byte) 107);
            byte var19 = class97.field1622.method912((byte) -90);
            byte var20 = class97.field1622.method893((byte) -90);
            int var21 = class97.field1622.method890((byte) -83);
            class103 var22;
            if (class167.field2719 == var13) {
                var22 = class44.field706;
            } else {
                var22 = class66.field1055[var13];
            }
            if (var22 != null) {
                class108 var23 = class41.method210(var17, (byte) 75);
                int var24;
                int var25;
                if (var12 == 1 || var12 == 3) {
                    var25 = var23.field1824;
                    var24 = var23.field1807;
                } else {
                    var24 = var23.field1824;
                    var25 = var23.field1807;
                }
                int var26 = (var24 >> 1) + var15;
                int var27 = var15 + (var24 + 1 >> 1);
                int var28 = (var25 >> 1) + var16;
                int var29 = var16 + (var25 + 1 >> 1);
                int[][] var30 = null;
                int[][] var31 = class172.field2820[class257.field4496];
                if (class257.field4496 < 3) {
                    var30 = class172.field2820[class257.field4496 + 1];
                }
                int var32 = var31[var26][var28] + var31[var27][var28] + var31[var26][var29] + var31[var27][var29] >> 2;
                int var33 = (var15 << 7) + (var24 << 6);
                int var34 = (var16 << 7) + (var25 << 6);
                class183 var35 = var23.method777(var23.field1805, var31, var32, false, (class158) null, var34, arg0 + 55, var10, var12, var33, var30);
                if (var35 != null) {
                    class147.method1069(var15, true, class257.field4496, var21 + 1, var11, 0, var16, var18 + 1, 0, -1);
                    if (var19 < var8) {
                        byte var36 = var8;
                        var8 = var19;
                        var19 = var36;
                    }
                    if (var7 > var20) {
                        byte var37 = var7;
                        var7 = var20;
                        var20 = var37;
                    }
                    var22.field1718 = var16 + var20;
                    var22.field1703 = class179.field2960 + var21;
                    var22.field1694 = var7 + var16;
                    var22.field1698 = var16 * 128 + var25 * 64;
                    var22.field1714 = var15 + var19;
                    var22.field1710 = var32;
                    var22.field1691 = var15 * 128 + var24 * 64;
                    var22.field1690 = var15 + var8;
                    var22.field1719 = (class65) var35.field3017;
                    var22.field1686 = class179.field2960 + var18;
                }
            }
        }
        if (class35.field516 == 9) {
            int var38 = class97.field1622.method897(-87);
            int var39 = (var38 >> 4 & 0x7) + class67.field1095;
            int var40 = (var38 & 0x7) + class260.field4545;
            int var41 = class97.field1622.method876(false);
            int var42 = class97.field1622.method876(false);
            int var43 = class97.field1622.method876(false);
            if (var39 >= 0 && var40 >= 0 && var39 < 104 && var40 < 104) {
                class252 var44 = class90.field1493[class257.field4496][var39][var40];
                if (var44 != null) {
                    for (class86 var45 = (class86) var44.method1720(true); var45 != null; var45 = (class86) var44.method1712((byte) 112)) {
                        class184 var46 = var45.field1439;
                        if ((var41 & 0x7FFF) == var46.field3034 && var46.field3038 == var42) {
                            var46.field3038 = var43;
                            break;
                        }
                    }
                    class51.method272(var39, var40, -28686);
                }
            }
            return;
        }
        if (arg0 != 65) {
            method762(-103, -31);
        }
        if (class35.field516 == 213) {
            int var47 = class97.field1622.method897(105);
            int var48 = (var47 >> 4 & 0x7) + class67.field1095;
            int var49 = class260.field4545 + (var47 & 0x7);
            int var50 = var48 + class97.field1622.method912((byte) -90);
            int var51 = var49 + class97.field1622.method912((byte) -90);
            int var52 = class97.field1622.method884(arg0 + 14448);
            int var53 = class97.field1622.method876(false);
            int var54 = class97.field1622.method897(arg0 ^ 0xFFFFFFD1) * 4;
            int var55 = class97.field1622.method897(-65) * 4;
            int var56 = class97.field1622.method876(false);
            int var57 = class97.field1622.method876(false);
            int var58 = class97.field1622.method897(109);
            int var59 = class97.field1622.method897(121);
            if (var48 >= 0 && var49 >= 0 && var48 < 104 && var49 < 104 && var50 >= 0 && var51 >= 0 && var50 < 104 && var51 < 104 && var53 != 65535) {
                int var60 = var51 * 128 + 64;
                int var61 = var50 * 128 + 64;
                int var62 = var48 * 128 + 64;
                int var63 = var49 * 128 + 64;
                class185 var64 = new class185(var53, class257.field4496, var62, var63, class207.method1424(class257.field4496, var62, (byte) 32, var63) - var54, class179.field2960 + var56, class179.field2960 + var57, var58, var59, var52, var55);
                var64.method1312(class207.method1424(class257.field4496, var61, (byte) 26, var60) - var55, var61, -1, var60, class179.field2960 + var56);
                class263.field4595.method1709(8, new class209(var64));
            }
        } else if (class35.field516 == 237) {
            int var65 = class97.field1622.method906(9147);
            int var66 = var65 & 0x3;
            int var67 = var65 >> 2;
            int var68 = class247.field4315[var67];
            int var69 = class97.field1622.method876(false);
            if (var69 == 65535) {
                var69 = -1;
            }
            int var70 = class97.field1622.method906(9147);
            int var71 = class260.field4545 + (var70 & 0x7);
            int var72 = ((var70 & 0x71) >> 4) + class67.field1095;
            class87.method666(var67, var66, (byte) 122, var71, var68, var69, class257.field4496, var72);
        } else if (class35.field516 == 64) {
            int var73 = class97.field1622.method897(106);
            int var74 = ((var73 & 0x72) >> 4) + class67.field1095;
            int var75 = class260.field4545 + (var73 & 0x7);
            int var76 = class97.field1622.method876(false);
            if (var76 == 65535) {
                var76 = -1;
            }
            int var77 = class97.field1622.method897(-92);
            int var78 = (var77 & 0xF4) >> 4;
            int var79 = var77 & 0x7;
            int var80 = class97.field1622.method897(126);
            if (var74 >= 0 && var75 >= 0 && var74 < 104 && var75 < 104) {
                int var81 = var78 + 1;
                if (class44.field706.field4343[0] >= var74 - var81 && var74 + var81 >= class44.field706.field4343[0] && class44.field706.field4336[0] >= (var75 - var81) && (var75 + var81) >= class44.field706.field4336[0] && class218.field3801 != 0 && var79 > 0 && class218.field3792 < 50 && var76 != -1) {
                    class192.field3226[class218.field3792] = var76;
                    class7.field76[class218.field3792] = var79;
                    class228.field3977[class218.field3792] = var80;
                    class145.field2426[class218.field3792] = null;
                    class209.field3487[class218.field3792] = (var74 << 16) + (var75 << 8) + var78;
                    class218.field3792++;
                }
            }
        } else if (class35.field516 == 250) {
            int var82 = class97.field1622.method897(123);
            int var83 = (var82 >> 4 & 0xF) + class67.field1095 * 2;
            int var84 = (var82 & 0xF) + class260.field4545 * 2;
            int var85 = var83 + class97.field1622.method912((byte) -90);
            int var86 = var84 + class97.field1622.method912((byte) -90);
            int var87 = class97.field1622.method884(14513);
            int var88 = class97.field1622.method876(false);
            int var89 = class97.field1622.method897(arg0 ^ 0x2C) * 4;
            int var90 = class97.field1622.method897(arg0 ^ 0xFFFFFFEA) * 4;
            int var91 = class97.field1622.method876(false);
            int var92 = class97.field1622.method876(false);
            int var93 = class97.field1622.method897(-91);
            int var94 = class97.field1622.method897(105);
            if (var83 >= 0 && var84 >= 0 && var83 < 208 && var84 < 208 && var85 >= 0 && var86 >= 0 && var85 < 208 && var86 < 208 && var88 != 65535) {
                int var95 = var86 * 64;
                int var96 = var85 * 64;
                int var97 = var83 * 64;
                int var98 = var84 * 64;
                class185 var99 = new class185(var88, class257.field4496, var97, var98, class207.method1424(class257.field4496, var97, (byte) 86, var98) - var89, var91 - -class179.field2960, class179.field2960 + var92, var93, var94, var87, var90);
                var99.method1312(class207.method1424(class257.field4496, var96, (byte) 108, var95) - var90, var96, -1, var95, class179.field2960 + var91);
                class263.field4595.method1709(78, new class209(var99));
            }
        } else if (class35.field516 == 215) {
            int var100 = class97.field1622.method914(-115);
            int var101 = class97.field1622.method906(9147);
            int var102 = class67.field1095 + (var101 >> 4 & 0x7);
            int var103 = (var101 & 0x7) + class260.field4545;
            if (var102 >= 0 && var103 >= 0 && var102 < 104 && var103 < 104) {
                class252 var104 = class90.field1493[class257.field4496][var102][var103];
                if (var104 != null) {
                    for (class86 var105 = (class86) var104.method1720(true); var105 != null; var105 = (class86) var104.method1712((byte) 112)) {
                        if ((var100 & 0x7FFF) == var105.field1439.field3034) {
                            var105.method764((byte) -100);
                            break;
                        }
                    }
                    if (var104.method1720(true) == null) {
                        class90.field1493[class257.field4496][var102][var103] = null;
                    }
                    class51.method272(var102, var103, -28686);
                }
            }
        } else if (class35.field516 == 55) {
            int var106 = class97.field1622.method906(arg0 ^ 0x23FA);
            int var107 = ((var106 & 0x7A) >> 4) + class67.field1095;
            int var108 = class260.field4545 + (var106 & 0x7);
            int var109 = class97.field1622.method880((byte) 107);
            int var110 = class97.field1622.method880((byte) 107);
            int var111 = class97.field1622.method880((byte) 107);
            if (var107 >= 0 && var108 >= 0 && var107 < 104 && var108 < 104 && class167.field2719 != var111) {
                class184 var112 = new class184();
                var112.field3034 = var110;
                var112.field3038 = var109;
                if (class90.field1493[class257.field4496][var107][var108] == null) {
                    class90.field1493[class257.field4496][var107][var108] = new class252();
                }
                class90.field1493[class257.field4496][var107][var108].method1709(58, new class86(var112));
                class51.method272(var107, var108, -28686);
            }
        } else if (class35.field516 == 73) {
            int var113 = class97.field1622.method897(-112);
            int var114 = var113 >> 2;
            int var115 = class247.field4315[var114];
            int var116 = var113 & 0x3;
            int var117 = class97.field1622.method897(-69);
            int var118 = (var117 >> 4 & 0x7) + class67.field1095;
            int var119 = class260.field4545 + (var117 & 0x7);
            if (var118 >= 0 && var119 >= 0 && var118 < 104 && var119 < 104) {
                class147.method1069(var118, true, class257.field4496, 0, var115, var114, var119, -1, var116, -1);
            }
        } else if (class35.field516 == 252) {
            int var120 = class97.field1622.method897(122);
            int var121 = class67.field1095 + ((var120 & 0x76) >> 4);
            int var122 = class260.field4545 + (var120 & 0x7);
            int var123 = class97.field1622.method876(false);
            int var124 = class97.field1622.method897(-47);
            int var125 = class97.field1622.method876(false);
            if (var121 >= 0 && var122 >= 0 && var121 < 104 && var122 < 104) {
                int var126 = var122 * 128 + 64;
                int var127 = var121 * 128 + 64;
                class20 var128 = new class20(var123, class257.field4496, var127, var126, class207.method1424(class257.field4496, var127, (byte) 63, var126) - var124, var125, class179.field2960);
                class27.field391.method1709(arg0 + 57, new class13(var128));
            }
        } else if (class35.field516 == 126) {
            int var129 = class97.field1622.method901((byte) -4);
            int var130 = var129 & 0x3;
            int var131 = var129 >> 2;
            int var132 = class247.field4315[var131];
            int var133 = class97.field1622.method906(9147);
            int var134 = (var133 & 0x7) + class260.field4545;
            int var135 = class67.field1095 + (var133 >> 4 & 0x7);
            int var136 = class97.field1622.method880((byte) 107);
            if (var135 >= 0 && var134 >= 0 && var135 < 104 && var134 < 104) {
                class147.method1069(var135, true, class257.field4496, 0, var132, var131, var134, -1, var130, var136);
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(B)V")
    public final void method764(byte arg0) {
        field1754++;
        if (this.field1758 == null) {
            return;
        }
        this.field1758.field1770 = this.field1770;
        this.field1770.field1758 = this.field1758;
        this.field1770 = null;
        this.field1758 = null;
        if (arg0 >= -6) {
            field1757 = null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(BIIIII)V")
    public static final void method765(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg3; var6 <= arg4; var6++) {
            class242.method1660((byte) -79, class80.field1324[var6], arg2, arg5, arg1);
        }
        int var7 = -69 % ((17 - arg0) / 45);
        field1766++;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(BI)Z")
    public static final boolean method766(byte arg0, int arg1) {
        if (arg0 != -121) {
            field1769 = null;
        }
        field1756++;
        return arg1 >= 48 && arg1 <= 57;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V")
    public static void method767(int arg0) {
        if (arg0 <= 44) {
            field1764 = -69;
        }
        field1757 = null;
        field1771 = null;
        field1772 = null;
        field1762 = null;
        field1767 = null;
        field1769 = null;
        field1768 = null;
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)Z")
    public final boolean method768(int arg0) {
        field1752++;
        if (arg0 != -1) {
            method770(76, -49, -67, -20, 14, -16, 61, 124, false, -82, 4, 48, 61);
        }
        return this.field1758 != null;
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(II)I")
    public static final int method769(int arg0, int arg1) {
        field1765++;
        if (arg0 != -19455) {
            field1757 = null;
        }
        return arg1 >>> 10;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIIIIIZIIII)Z")
    public static final boolean method770(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10, int arg11, int arg12) {
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var40 = 0; var40 < 104; var40++) {
                class76.field1219[var13][var40] = 0;
                class157.field2600[var13][var40] = 99999999;
            }
        }
        class76.field1219[arg4][arg0] = 99;
        int var14 = arg4;
        int var15 = arg0;
        class157.field2600[arg4][arg0] = 0;
        if (arg2 != 4095) {
            field1771 = null;
        }
        field1753++;
        int var16 = 0;
        boolean var17 = false;
        byte var18 = 0;
        class159.field2609[var18] = arg4;
        int var41 = var18 + 1;
        class191.field3200[var18] = arg0;
        int[][] var19 = class159.field2605[class257.field4496].field2787;
        label372: while (var16 != var41) {
            var15 = class191.field3200[var16];
            var14 = class159.field2609[var16];
            var16 = var16 + 1 & 0xFFF;
            if (arg12 == var14 && arg10 == var15) {
                var17 = true;
                break;
            }
            if (arg6 != 0) {
                if ((arg6 < 5 || arg6 == 10) && class159.field2605[class257.field4496].method1180(arg6 - 1, arg1, (byte) -44, var14, arg11, var15, arg10, arg12)) {
                    var17 = true;
                    break;
                }
                if (arg6 < 10 && class159.field2605[class257.field4496].method1197(var15, 124, arg11, arg1, arg10, arg6 - 1, var14, arg12)) {
                    var17 = true;
                    break;
                }
            }
            if (arg3 != 0 && arg7 != 0 && class159.field2605[class257.field4496].method1183(arg12, arg7, var15, arg3, arg2 - 4096, arg11, arg10, var14, arg5)) {
                var17 = true;
                break;
            }
            int var31 = class157.field2600[var14][var15] + 1;
            if (var14 > 0 && class76.field1219[var14 - 1][var15] == 0 && (var19[var14 - 1][var15] & 0x12C010E) == 0 && (var19[var14 - 1][arg11 + var15 - 1] & 0x12C0138) == 0) {
                int var32 = 1;
                while (true) {
                    if (var32 >= arg11 - 1) {
                        class159.field2609[var41] = var14 - 1;
                        class191.field3200[var41] = var15;
                        class76.field1219[var14 - 1][var15] = 2;
                        var41 = var41 + 1 & 0xFFF;
                        class157.field2600[var14 - 1][var15] = var31;
                        break;
                    }
                    if ((var19[var14 - 1][var15 + var32] & 0x12C013E) != 0) {
                        break;
                    }
                    var32++;
                }
            }
            if (var14 < 102 && class76.field1219[var14 + 1][var15] == 0 && (var19[var14 + arg11][var15] & 0x12C0183) == 0 && (var19[var14 + arg11][var15 + arg11 - 1] & 0x12C01E0) == 0) {
                int var33 = 1;
                while (true) {
                    if (var33 >= (arg11 - 1)) {
                        class159.field2609[var41] = var14 + 1;
                        class191.field3200[var41] = var15;
                        var41 = var41 + 1 & 0xFFF;
                        class76.field1219[var14 + 1][var15] = 8;
                        class157.field2600[var14 + 1][var15] = var31;
                        break;
                    }
                    if ((var19[arg11 + var14][var15 + var33] & 0x12C01E3) != 0) {
                        break;
                    }
                    var33++;
                }
            }
            if (var15 > 0 && class76.field1219[var14][var15 - 1] == 0 && (var19[var14][var15 - 1] & 0x12C010E) == 0 && (var19[var14 + arg11 - 1][var15 - 1] & 0x12C0183) == 0) {
                int var34 = 1;
                while (true) {
                    if (var34 >= (arg11 - 1)) {
                        class159.field2609[var41] = var14;
                        class191.field3200[var41] = var15 - 1;
                        class76.field1219[var14][var15 - 1] = 1;
                        var41 = var41 + 1 & 0xFFF;
                        class157.field2600[var14][var15 - 1] = var31;
                        break;
                    }
                    if ((var19[var14 + var34][var15 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var34++;
                }
            }
            if (var15 < 102 && class76.field1219[var14][var15 + 1] == 0 && (var19[var14][arg11 + var15] & 0x12C0138) == 0 && (var19[arg11 + var14 - 1][var15 + arg11] & 0x12C01E0) == 0) {
                int var35 = 1;
                while (true) {
                    if (var35 >= (arg11 - 1)) {
                        class159.field2609[var41] = var14;
                        class191.field3200[var41] = var15 + 1;
                        class76.field1219[var14][var15 + 1] = 4;
                        class157.field2600[var14][var15 + 1] = var31;
                        var41 = var41 + 1 & 0xFFF;
                        break;
                    }
                    if ((var19[var14 + var35][arg11 + var15] & 0x12C01F8) != 0) {
                        break;
                    }
                    var35++;
                }
            }
            if (var14 > 0 && var15 > 0 && class76.field1219[var14 - 1][var15 - 1] == 0 && (var19[var14 - 1][var15 - (-arg11 + 1) - 1] & 0x12C0138) == 0 && (var19[var14 - 1][var15 - 1] & 0x12C010E) == 0 && (var19[arg11 + var14 - 2][var15 - 1] & 0x12C0183) == 0) {
                int var36 = 1;
                while (true) {
                    if ((arg11 - 1) <= var36) {
                        class159.field2609[var41] = var14 - 1;
                        class191.field3200[var41] = var15 - 1;
                        var41 = var41 + 1 & 0xFFF;
                        class76.field1219[var14 - 1][var15 - 1] = 3;
                        class157.field2600[var14 - 1][var15 - 1] = var31;
                        break;
                    }
                    if ((var19[var14 - 1][var36 + var15 - 1] & 0x12C013E) != 0 || (var19[var14 + var36 - 1][var15 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var36++;
                }
            }
            if (var14 < 102 && var15 > 0 && class76.field1219[var14 + 1][var15 - 1] == 0 && (var19[var14 + 1][var15 - 1] & 0x12C010E) == 0 && (var19[arg11 + var14][var15 - 1] & 0x12C0183) == 0 && (var19[arg11 + var14][arg11 + var15 - 1 - 1] & 0x12C01E0) == 0) {
                int var37 = 1;
                while (true) {
                    if (arg11 - 1 <= var37) {
                        class159.field2609[var41] = var14 + 1;
                        class191.field3200[var41] = var15 - 1;
                        var41 = var41 + 1 & 0xFFF;
                        class76.field1219[var14 + 1][var15 - 1] = 9;
                        class157.field2600[var14 + 1][var15 - 1] = var31;
                        break;
                    }
                    if ((var19[var14 + arg11][var37 + var15 - 1] & 0x12C01E3) != 0 || (var19[var14 - (-var37 - 1)][var15 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var37++;
                }
            }
            if (var14 > 0 && var15 < 102 && class76.field1219[var14 - 1][var15 + 1] == 0 && (var19[var14 - 1][var15 + 1] & 0x12C010E) == 0 && (var19[var14 - 1][arg11 + var15] & 0x12C0138) == 0 && (var19[var14][var15 + arg11] & 0x12C01E0) == 0) {
                int var38 = 1;
                while (true) {
                    if (var38 >= (arg11 - 1)) {
                        class159.field2609[var41] = var14 - 1;
                        class191.field3200[var41] = var15 + 1;
                        class76.field1219[var14 - 1][var15 + 1] = 6;
                        var41 = var41 + 1 & 0xFFF;
                        class157.field2600[var14 - 1][var15 + 1] = var31;
                        break;
                    }
                    if ((var19[var14 - 1][var15 - (-var38 - 1)] & 0x12C013E) != 0 || (var19[var14 + var38 - 1][arg11 + var15] & 0x12C01F8) != 0) {
                        break;
                    }
                    var38++;
                }
            }
            if (var14 < 102 && var15 < 102 && class76.field1219[var14 + 1][var15 + 1] == 0 && (var19[var14 + 1][arg11 + var15] & 0x12C0138) == 0 && (var19[arg11 + var14][arg11 + var15] & 0x12C01E0) == 0 && (var19[var14 + arg11][var15 + 1] & 0x12C0183) == 0) {
                for (int var39 = 1; var39 < (arg11 - 1); var39++) {
                    if ((var19[var14 + var39 + 1][arg11 + var15] & 0x12C01F8) != 0 || (var19[arg11 + var14][var15 + var39 + 1] & 0x12C01E3) != 0) {
                        continue label372;
                    }
                }
                class159.field2609[var41] = var14 + 1;
                class191.field3200[var41] = var15 + 1;
                class76.field1219[var14 + 1][var15 + 1] = 12;
                var41 = var41 + 1 & 0xFFF;
                class157.field2600[var14 + 1][var15 + 1] = var31;
            }
        }
        class45.field724 = 0;
        if (!var17) {
            if (!arg8) {
                return false;
            }
            byte var20 = 10;
            int var21 = 1000;
            int var22 = 100;
            for (int var23 = arg12 - var20; var23 <= (arg12 + var20); var23++) {
                for (int var24 = arg10 - var20; var24 <= arg10 + var20; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class157.field2600[var23][var24] < 100) {
                        int var25 = 0;
                        int var26 = 0;
                        if (arg12 > var23) {
                            var25 = arg12 - var23;
                        } else if (var23 > arg12 + arg3 - 1) {
                            var25 = var23 + 1 - arg12 - arg3;
                        }
                        if (arg10 > var24) {
                            var26 = arg10 - var24;
                        } else if (var24 > arg7 + arg10 - 1) {
                            var26 = var24 + 1 - arg7 - arg10;
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var21 > var27 || var21 == var27 && var22 > class157.field2600[var23][var24]) {
                            var22 = class157.field2600[var23][var24];
                            var15 = var24;
                            var21 = var27;
                            var14 = var23;
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg4 == var14 && arg0 == var15) {
                return false;
            }
            class45.field724 = 1;
        }
        byte var28 = 0;
        class159.field2609[var28] = var14;
        int var42 = var28 + 1;
        class191.field3200[var28] = var15;
        int var29;
        int var30 = var29 = class76.field1219[var14][var15];
        while (arg4 != var14 || arg0 != var15) {
            if (var29 != var30) {
                class159.field2609[var42] = var14;
                class191.field3200[var42++] = var15;
                var29 = var30;
            }
            if ((var30 & 0x1) != 0) {
                var15++;
            } else if ((var30 & 0x4) != 0) {
                var15--;
            }
            if ((var30 & 0x2) != 0) {
                var14++;
            } else if ((var30 & 0x8) != 0) {
                var14--;
            }
            var30 = class76.field1219[var14][var15];
        }
        if (var42 > 0) {
            class175.method1227(var42, arg9, 30023);
            return true;
        } else if (arg9 == 1) {
            return false;
        } else {
            return true;
        }
    }
}
