import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sia")
public class class765 {

    @OriginalMember(owner = "client!sia", name = "c", descriptor = "Lhja;")
    public static class426 field10515 = new class426();

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "I")
    public static int field10513;

    @OriginalMember(owner = "client!sia", name = "d", descriptor = "I")
    public static int field10516;

    @OriginalMember(owner = "client!sia", name = "e", descriptor = "I")
    public static int field10517;

    @OriginalMember(owner = "client!sia", name = "b", descriptor = "Luq;")
    public static class172 field10514;

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(IIIII)V", line = 6)
    public static final void method4207(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field10517++;
        int var5 = arg2;
        int var6 = arg1;
        int var7 = -arg1;
        int var8 = -1;
        int var9 = class269.method1790(arg1 + arg4, class45.field472, class297.field4199, 13094);
        int var10 = class269.method1790(arg4 - arg1, class45.field472, class297.field4199, 13094);
        class464.method2733(arg3, var10, var9, -22816, class228.field2951[arg0]);
        while (var6 > var5) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg0 - var6;
                int var12 = arg0 + var6;
                if (class291.field4156 <= var12 && var11 <= class233.field3099) {
                    int var13 = class269.method1790(arg4 + var5, class45.field472, class297.field4199, 13094);
                    int var14 = class269.method1790(arg4 - var5, class45.field472, class297.field4199, arg2 + 13094);
                    if (class233.field3099 >= var12) {
                        class464.method2733(arg3, var14, var13, arg2 ^ 0xFFFFA6E0, class228.field2951[var12]);
                    }
                    if (class291.field4156 <= var11) {
                        class464.method2733(arg3, var14, var13, arg2 - 22816, class228.field2951[var11]);
                    }
                }
            }
            var5++;
            int var15 = arg0 - var5;
            int var16 = arg0 + var5;
            if (class291.field4156 <= var16 && class233.field3099 >= var15) {
                int var17 = class269.method1790(arg4 + var6, class45.field472, class297.field4199, arg2 + 13094);
                int var18 = class269.method1790(arg4 - var6, class45.field472, class297.field4199, 13094);
                if (class233.field3099 >= var16) {
                    class464.method2733(arg3, var18, var17, -22816, class228.field2951[var16]);
                }
                if (var15 >= class291.field4156) {
                    class464.method2733(arg3, var18, var17, -22816, class228.field2951[var15]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sia", name = "toString", descriptor = "()Ljava/lang/String;", line = 84)
    public final String toString() {
        field10513++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(ILjea;)V", line = 94)
    public static final void method4208(int arg0, class474 arg1) {
        field10516++;
        if (class425.field6127 == arg1) {
            int var2 = class560.field7678.method1676(255);
            int var3 = var2 >> 2;
            int var4 = var2 & 0x3;
            int var5 = class559.field7671[var3];
            int var6 = class560.field7678.method1691(113);
            int var7 = (var6 >> 4 & 0x7) + class359.field5225;
            int var8 = (var6 & 0x7) + class282.field4080;
            if (class462.method2731(arg0 - 426, class389.field5637) || var7 >= 0 && var8 >= 0 && class102.field1467 > var7 && var8 < class393.field5663) {
                class99.method780(var7, var3, class697.field9245, var5, -1, var4, arg0 - 306, var8);
            }
        } else if (class564.field7723 == arg1) {
            int var9 = class560.field7678.method1731((byte) 64);
            int var10 = ((var9 & 0x74) >> 4) + class359.field5225;
            int var11 = class282.field4080 + (var9 & 0x7);
            int var12 = class560.field7678.method1728((byte) 126);
            int var13 = class560.field7678.method1731((byte) 64);
            int var14 = class560.field7678.method1728((byte) 127);
            int var15 = class560.field7678.method1731((byte) 64);
            if (var10 >= 0 && var11 >= 0 && var10 < class102.field1467 && var11 < class393.field5663) {
                int var16 = var10 * 512 + 256;
                int var17 = var11 * 512 + 256;
                int var18 = class697.field9245;
                if (var18 < 3 && class49.method310(var10, var11, (byte) 104)) {
                    var18++;
                }
                class655 var19 = new class655(var12, var14, class572.field7788, class697.field9245, var18, var16, class778.method4273(var17, (byte) -35, var16, class697.field9245) - var13, var17, var10, var10, var11, var11, var15);
                class625.field8473.method689(new class377(var19), arg0 - 195);
            }
        } else if (class389.field5636 == arg1) {
            int var20 = class560.field7678.method1731((byte) 64);
            int var21 = class359.field5225 + (var20 >> 4 & 0x7);
            int var22 = (var20 & 0x7) + class282.field4080;
            int var23 = class560.field7678.method1728((byte) 92);
            if (var23 == 65535) {
                var23 = -1;
            }
            int var24 = class560.field7678.method1731((byte) 64);
            int var25 = var24 >> 4 & 0xF;
            int var26 = var24 & 0x7;
            int var27 = class560.field7678.method1731((byte) 64);
            int var28 = class560.field7678.method1731((byte) 64);
            int var29 = class560.field7678.method1728((byte) 87);
            if (var21 >= 0 && var22 >= 0 && class102.field1467 > var21 && class393.field5663 > var22) {
                int var30 = var25 + 1;
                if (class625.field8475.field6198[0] >= var21 - var30 && var21 + var30 >= class625.field8475.field6198[0] && class625.field8475.field6197[0] >= (var22 - var30) && class625.field8475.field6197[0] <= (var22 + var30)) {
                    class172.method1168(var27, var28, var29, var23, var26, (var21 << 16) + (class697.field9245 << 24) + (var22 << 8) + var25, arg0 + -30686);
                }
            }
        } else if (class557.field7657 == arg1) {
            int var31 = class560.field7678.method1731((byte) 64);
            int var32 = class282.field4080 + (var31 & 0x7);
            int var33 = class259.field3849 + var32;
            int var34 = ((var31 & 0x76) >> 4) + class359.field5225;
            int var35 = class120.field1625 + var34;
            int var36 = class560.field7678.method1728((byte) 43);
            int var37 = class560.field7678.method1728((byte) 39);
            int var38 = class560.field7678.method1728((byte) 89);
            if (class523.field7265 != null) {
                class769 var39 = (class769) class523.field7265.method1248(117, (long) (var35 | var33 << 14 | class697.field9245 << 28));
                if (var39 != null) {
                    for (class309 var40 = (class309) var39.field10592.method679((byte) -86); var40 != null; var40 = (class309) var39.field10592.method681(-122)) {
                        if ((var36 & 0x7FFF) == var40.field4380 && var40.field4386 == var37) {
                            var40.method1102((byte) 64);
                            var40.field4386 = var38;
                            class79.method635(var33, (byte) -39, var35, class697.field9245, var40);
                            break;
                        }
                    }
                    if (var34 >= 0 && var32 >= 0 && var34 < class102.field1467 && var32 < class393.field5663) {
                        class215.method1390(class697.field9245, var32, var34, -1);
                    }
                }
            }
        } else if (class572.field7791 == arg1) {
            int var41 = class560.field7678.method1703((byte) 91);
            int var42 = class560.field7678.method1731((byte) 64);
            int var43 = ((var42 & 0x7C) >> 4) + class359.field5225;
            int var44 = (var42 & 0x7) + class282.field4080;
            int var45 = class560.field7678.method1711(arg0 ^ 0xFFFFFEB7);
            int var46 = var45 >> 2;
            int var47 = var45 & 0x3;
            int var48 = class559.field7671[var46];
            if (class462.method2731(-122, class389.field5637) || var43 >= 0 && var44 >= 0 && var43 < class102.field1467 && class393.field5663 > var44) {
                class99.method780(var43, var46, class697.field9245, var48, var41, var47, -1, var44);
            }
        } else if (class620.field8397 == arg1) {
            class560.field7678.method1731((byte) 64);
            int var49 = class560.field7678.method1731((byte) 64);
            int var50 = class359.field5225 + ((var49 & 0x7D) >> 4);
            int var51 = class282.field4080 + (var49 & 0x7);
            int var52 = class560.field7678.method1728((byte) 93);
            int var53 = class560.field7678.method1731((byte) 64);
            int var54 = class560.field7678.method1722(false);
            String var55 = class560.field7678.method1699(-92);
            class202.method1331(var52, var54, class697.field9245, var53, (byte) -100, var51, var55, var50);
        } else if (class523.field7267 == arg1) {
            int var56 = class560.field7678.method1711(-119);
            int var57 = (var56 & 0x7) + class282.field4080;
            int var58 = class259.field3849 + var57;
            int var59 = ((var56 & 0x73) >> 4) + class359.field5225;
            int var60 = class120.field1625 + var59;
            int var61 = class560.field7678.method1728((byte) 35);
            class769 var62 = (class769) class523.field7265.method1248(87, (long) (class697.field9245 << 28 | var58 << 14 | var60));
            if (var62 != null) {
                for (class309 var63 = (class309) var62.field10592.method679((byte) -86); var63 != null; var63 = (class309) var62.field10592.method681(-98)) {
                    if ((var61 & 0x7FFF) == var63.field4380) {
                        var63.method1102((byte) 100);
                        break;
                    }
                }
                if (var62.field10592.method688(-65)) {
                    var62.method1102((byte) 68);
                }
                if (var59 >= 0 && var57 >= 0 && class102.field1467 > var59 && class393.field5663 > var57) {
                    class215.method1390(class697.field9245, var57, var59, arg0 - 306);
                }
            }
        } else if (class116.field1561 == arg1) {
            int var64 = class560.field7678.method1731((byte) 64);
            int var65 = (var64 >> 4 & 0x7) + class359.field5225;
            int var66 = (var64 & 0x7) + class282.field4080;
            int var67 = class560.field7678.method1728((byte) 120);
            if (var67 == 65535) {
                var67 = -1;
            }
            int var68 = class560.field7678.method1731((byte) 64);
            int var69 = (var68 & 0xFE) >> 4;
            int var70 = var68 & 0x7;
            int var71 = class560.field7678.method1731((byte) 64);
            int var72 = class560.field7678.method1731((byte) 64);
            int var73 = class560.field7678.method1728((byte) 97);
            if (var65 >= 0 && var66 >= 0 && var65 < class102.field1467 && var66 < class393.field5663) {
                int var74 = var69 + 1;
                if (class625.field8475.field6198[0] >= var65 - var74 && class625.field8475.field6198[0] <= (var65 + var74) && class625.field8475.field6197[0] >= (var66 - var74) && class625.field8475.field6197[0] <= var66 + var74) {
                    class207.method1356(var67, false, var73, (class697.field9245 << 24) + (var65 << 16) + (var66 << 8) + var69, var71, 89, var70, var72);
                }
            }
        } else if (class524.field7271 == arg1) {
            int var75 = class560.field7678.method1711(-128);
            int var76 = class359.field5225 + (var75 >> 4 & 0x7);
            int var77 = (var75 & 0x7) + class282.field4080;
            int var78 = class560.field7678.method1691(100);
            int var79 = var78 >> 2;
            int var80 = var78 & 0x3;
            int var81 = class559.field7671[var79];
            int var82 = class560.field7678.method1703((byte) 78);
            if (var82 == 65535) {
                var82 = -1;
            }
            class502.method2934(var79, var80, var76, class697.field9245, false, var77, var81, var82);
        } else if (class213.field2798 == arg1) {
            int var83 = class560.field7678.method1728((byte) 17);
            int var84 = class560.field7678.method1731((byte) 64);
            class210.field2705.method1362(arg0 ^ 0x131, var83).method2479(var84, -4);
        } else if (class706.field9657 == arg1) {
            int var85 = class560.field7678.method1711(arg0 ^ 0xFFFFFEB8);
            int var86 = (var85 & 0x7) + class282.field4080;
            int var87 = class259.field3849 + var86;
            int var88 = (var85 >> 4 & 0x7) + class359.field5225;
            int var89 = class120.field1625 + var88;
            int var90 = class560.field7678.method1728((byte) 29);
            int var91 = class560.field7678.method1703((byte) 109);
            boolean var92 = var88 >= 0 && var86 >= 0 && class102.field1467 > var88 && class393.field5663 > var86;
            if (var92 || class462.method2731(arg0 - 429, class389.field5637)) {
                class79.method635(var87, (byte) -39, var89, class697.field9245, new class309(var91, var90));
                if (var92) {
                    class215.method1390(class697.field9245, var86, var88, arg0 ^ 0xFFFFFECE);
                }
            }
        } else if (class302.field4243 == arg1) {
            int var93 = class560.field7678.method1731((byte) 64);
            int var94 = (var93 >> 4 & 0xF) + class359.field5225 * 2;
            int var95 = (var93 & 0xF) + class282.field4080 * 2;
            int var96 = class560.field7678.method1731((byte) 64);
            boolean var97 = (var96 & 0x1) != 0;
            boolean var98 = (var96 & 0x2) != 0;
            int var99 = var98 ? var96 >> 2 : -1;
            int var100 = class560.field7678.method1737(true) + var94;
            int var101 = var95 + class560.field7678.method1737(true);
            int var102 = class560.field7678.method1695(423951304);
            int var103 = class560.field7678.method1695(423951304);
            int var104 = class560.field7678.method1728((byte) 90);
            int var105 = class560.field7678.method1731((byte) 64);
            int var106;
            if (var98) {
                var106 = (byte) var105;
            } else {
                var106 = var105 * 4;
            }
            int var107 = class560.field7678.method1731((byte) 64) * 4;
            int var108 = class560.field7678.method1728((byte) 17);
            int var109 = class560.field7678.method1728((byte) 22);
            int var110 = class560.field7678.method1731((byte) 64);
            int var111 = class560.field7678.method1728((byte) 119);
            if (var110 == 255) {
                var110 = -1;
            }
            if (var94 >= 0 && var95 >= 0 && var94 < class102.field1467 * 2 && class102.field1467 * 2 > var95 && var100 >= 0 && var101 >= 0 && var100 < (class393.field5663 * 2) && var101 < class393.field5663 * 2 && var104 != 65535) {
                int var112 = var107 << 2;
                int var113 = var100 * 256;
                int var114 = var94 * 256;
                int var115 = var106 << 2;
                int var116 = var101 * 256;
                int var117 = var95 * 256;
                int var118 = var111 << 2;
                if (var102 != 0 && var99 != -1) {
                    class425 var119 = null;
                    if (var102 < 0) {
                        int var120 = -var102 - 1;
                        if (class349.field5065 == var120) {
                            var119 = class625.field8475;
                        } else {
                            var119 = class84.field1204[var120];
                        }
                    } else {
                        int var121 = var102 - 1;
                        class316 var122 = (class316) class176.field2326.method1248(105, (long) var121);
                        if (var122 != null) {
                            var119 = var122.field4455;
                        }
                    }
                    if (var119 != null) {
                        class588 var123 = var119.method2573(-1);
                        if (var123.field8019 != null && var123.field8019[var99] != null) {
                            var115 -= var123.field8019[var99][1];
                        }
                        if (var123.field7994 != null && var123.field7994[var99] != null) {
                            var115 -= var123.field7994[var99][1];
                        }
                    }
                }
                class98 var124 = new class98(var104, class697.field9245, class697.field9245, var114, var117, var115, var108 + class572.field7788, var109 - -class572.field7788, var110, var118, var102, var103, var112, var97, var99);
                var124.method778(var113, class778.method4273(var116, (byte) -48, var113, class697.field9245) - var112, class572.field7788 + var108, var116, 0);
                class397.field5692.method689(new class749(var124), 108);
            }
        } else if (class751.field10146 == arg1) {
            int var125 = class560.field7678.method1712(0);
            int var126 = class560.field7678.method1736(125);
            int var127 = class560.field7678.method1703((byte) 120);
            int var128 = class560.field7678.method1711(-126);
            int var129 = (var128 & 0x7) + class282.field4080;
            int var130 = class259.field3849 + var129;
            int var131 = (var128 >> 4 & 0x7) + class359.field5225;
            int var132 = class120.field1625 + var131;
            if (class349.field5065 != var126) {
                boolean var133 = var131 >= 0 && var129 >= 0 && class102.field1467 > var131 && class393.field5663 > var129;
                if (var133 || class462.method2731(-127, class389.field5637)) {
                    class79.method635(var130, (byte) -39, var132, class697.field9245, new class309(var125, var127));
                    if (var133) {
                        class215.method1390(class697.field9245, var129, var131, -1);
                    }
                }
            }
        } else if (class455.field6513 == arg1) {
            int var134 = class560.field7678.method1731((byte) 64);
            boolean var135 = (var134 & 0x80) != 0;
            int var136 = (var134 >> 3 & 0x7) + class359.field5225;
            int var137 = (var134 & 0x7) + class282.field4080;
            int var138 = var136 + class560.field7678.method1737(true);
            int var139 = class560.field7678.method1737(true) + var137;
            int var140 = class560.field7678.method1695(arg0 + 423950999);
            int var141 = class560.field7678.method1728((byte) 93);
            int var142 = class560.field7678.method1731((byte) 64) * 4;
            int var143 = class560.field7678.method1731((byte) 64) * 4;
            int var144 = class560.field7678.method1728((byte) 25);
            int var145 = class560.field7678.method1728((byte) 92);
            int var146 = class560.field7678.method1731((byte) 64);
            int var147 = class560.field7678.method1728((byte) 78);
            if (var146 == 255) {
                var146 = -1;
            }
            if (var136 >= 0 && var137 >= 0 && var136 < class102.field1467 && var137 < class393.field5663 && var138 >= 0 && var139 >= 0 && class102.field1467 > var138 && class393.field5663 > var139 && var141 != 65535) {
                int var148 = var147 << 2;
                int var149 = var139 * 512 + 256;
                int var150 = var143 << 2;
                int var151 = var138 * 512 + 256;
                int var152 = var137 * 512 + 256;
                int var153 = var142 << 2;
                int var154 = var136 * 512 + 256;
                class98 var155 = new class98(var141, class697.field9245, class697.field9245, var154, var152, var153, class572.field7788 + var144, class572.field7788 + var145, var146, var148, 0, var140, var150, var135, -1);
                var155.method778(var151, class778.method4273(var149, (byte) -20, var151, class697.field9245) - var150, class572.field7788 + var144, var149, 0);
                class397.field5692.method689(new class749(var155), -67);
            }
        } else {
            if (arg0 != 305) {
                field10515 = null;
            }
            if (class351.field5111 == arg1) {
                int var156 = class560.field7678.method1736(-37);
                class412 var157 = class210.field2705.method1362(0, var156);
                int var158 = class560.field7678.method1676(255);
                int var159 = ((var158 & 0x73) >> 4) + class359.field5225;
                int var160 = (var158 & 0x7) + class282.field4080;
                int var161 = class560.field7678.method1691(arg0 - 178);
                int var162 = class560.field7678.method1711(arg0 - 430);
                int var163 = var162 >> 2;
                int var164 = class559.field7671[var163];
                if (var163 == 11) {
                    var163 = 10;
                }
                int var165 = 0;
                if (var157.field5847 != null) {
                    int var166 = -1;
                    for (int var167 = 0; var167 < var157.field5847.length; var167++) {
                        if (var157.field5847[var167] == var163) {
                            var166 = var167;
                            break;
                        }
                    }
                    var165 = var157.field5857[var166].length;
                }
                int var168 = 0;
                if (var157.field5922 != null) {
                    var168 = var157.field5922.length;
                }
                int var169 = 0;
                if (var157.field5872 != null) {
                    var169 = var157.field5872.length;
                }
                if ((var161 & 0x1) == 1) {
                    class61.method374(null, var159, var164, arg0 - 17194, var160, class697.field9245);
                } else {
                    int[] var170 = null;
                    if ((var161 & 0x2) == 2) {
                        var170 = new int[var165];
                        for (int var171 = 0; var171 < var165; var171++) {
                            var170[var171] = class560.field7678.method1728((byte) 42);
                        }
                    }
                    short[] var172 = null;
                    if ((var161 & 0x4) == 4) {
                        var172 = new short[var168];
                        for (int var173 = 0; var173 < var168; var173++) {
                            var172[var173] = (short) class560.field7678.method1728((byte) 38);
                        }
                    }
                    short[] var174 = null;
                    if ((var161 & 0x8) == 8) {
                        var174 = new short[var169];
                        for (int var175 = 0; var175 < var169; var175++) {
                            var174[var175] = (short) class560.field7678.method1728((byte) 101);
                        }
                    }
                    class61.method374(new class711((long) (class312.field4414++), var170, var172, var174), var159, var164, -16889, var160, class697.field9245);
                }
            } else {
                class607.method3379("T3 - " + arg1, null, true);
                class87.method696(false, 66);
            }
        }
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(I)V", line = 798)
    public static void method4209(int arg0) {
        field10514 = null;
        field10515 = null;
        if (arg0 != -2008870204) {
            method4208(-94, null);
        }
    }
}
