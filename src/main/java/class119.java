import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class119 {

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "I")
    private int field1797 = -1;

    @OriginalMember(owner = "client!cj", name = "o", descriptor = "I")
    private int field1803 = 0;

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "Lgk;")
    private class159 field1793 = new class159();

    @OriginalMember(owner = "client!cj", name = "s", descriptor = "Z")
    public boolean field1807 = false;

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "I")
    private int field1795;

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "I")
    private int field1799;

    @OriginalMember(owner = "client!cj", name = "p", descriptor = "[Lve;")
    private class194[] field1804;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "[[[I")
    private int[][][] field1794;

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "Ljava/lang/String;")
    public static String field1796 = "Please wait - attempting to reestablish.";

    @OriginalMember(owner = "client!cj", name = "r", descriptor = "[Lcc;")
    public static class215[] field1806 = new class215[14];

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!cj", name = "m", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!cj", name = "n", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!cj", name = "q", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V")
    public final void method752(int arg0) {
        field1789++;
        for (int var2 = 0; var2 < this.field1799; var2++) {
            this.field1794[var2][0] = null;
            this.field1794[var2][1] = null;
            this.field1794[var2][2] = null;
            this.field1794[var2] = null;
        }
        this.field1794 = null;
        this.field1804 = null;
        this.field1793.method986(-29720);
        if (arg0 != 3720) {
            this.field1797 = 99;
        }
        this.field1793 = null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)[[I")
    public final int[][] method753(int arg0, int arg1) {
        field1802++;
        if (arg0 != 1) {
            return null;
        } else if (this.field1799 == this.field1795) {
            this.field1807 = this.field1804[arg1] == null;
            this.field1804[arg1] = class217.field3260;
            return this.field1794[arg1];
        } else if (this.field1799 == 1) {
            this.field1807 = this.field1797 != arg1;
            this.field1797 = arg1;
            return this.field1794[0];
        } else {
            class194 var3 = this.field1804[arg1];
            if (var3 == null) {
                this.field1807 = true;
                if (this.field1799 <= this.field1803) {
                    class194 var4 = (class194) this.field1793.method991(115);
                    var3 = new class194(arg1, var4.field2962);
                    this.field1804[var4.field2961] = null;
                    var4.method538(90);
                } else {
                    var3 = new class194(arg1, this.field1803);
                    this.field1803++;
                }
                this.field1804[arg1] = var3;
            } else {
                this.field1807 = false;
            }
            this.field1793.method982((byte) -105, var3);
            return this.field1794[var3.field2962];
        }
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)V")
    public static final void method754(int arg0) {
        field1800++;
        if (class246.field3683 == 230) {
            int var1 = class100.field1580.method1593((byte) 27);
            int var2 = class52.field834 + ((var1 & 0x7F) >> 4);
            int var3 = class262.field3975 + (var1 & 0x7);
            int var4 = var2 + class100.field1580.method1604(4);
            int var5 = var3 + class100.field1580.method1604(4);
            int var6 = class100.field1580.method1606((byte) 77);
            int var7 = class100.field1580.method1575(false);
            int var8 = class100.field1580.method1593((byte) 27) * 4;
            int var9 = class100.field1580.method1593((byte) 27) * 4;
            int var10 = class100.field1580.method1575(false);
            int var11 = class100.field1580.method1575(false);
            int var12 = class100.field1580.method1593((byte) 27);
            int var13 = class100.field1580.method1593((byte) 27);
            if (var12 == 255) {
                var12 = -1;
            }
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104 && var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104 && var7 != 65535) {
                int var14 = var2 * 128 + 64;
                int var15 = var3 * 128 + 64;
                int var16 = var5 * 128 + 64;
                int var17 = var4 * 128 + 64;
                class45 var18 = new class45(var7, class99.field1557, var14, var15, class183.method1139(class99.field1557, var15, var14, (byte) 117) - var8, class270.field4058 + var10, class270.field4058 + var11, var12, var13, var6, var9);
                var18.method305(class183.method1139(class99.field1557, var16, var17, (byte) 117) - var9, var17, class270.field4058 + var10, (byte) 126, var16);
                class90.field1429.method987(new class224(var18), (byte) -121);
            }
        } else if (class246.field3683 == 203) {
            int var19 = class100.field1580.method1593((byte) 27);
            int var20 = class52.field834 + (var19 >> 4 & 0x7);
            int var21 = (var19 & 0x7) + class262.field3975;
            int var22 = class100.field1580.method1575(false);
            int var23 = class100.field1580.method1593((byte) 27);
            int var24 = var23 >> 4 & 0xF;
            if (var22 == 65535) {
                var22 = -1;
            }
            int var25 = var23 & 0x7;
            int var26 = class100.field1580.method1593((byte) 27);
            int var27 = class100.field1580.method1593((byte) 27);
            if (var20 >= 0 && var21 >= 0 && var20 < 104 && var21 < 104) {
                int var28 = var24 + 1;
                if (class165.field2537.field2297[0] >= var20 - var28 && (var20 + var28) >= class165.field2537.field2297[0] && var21 - var28 <= class165.field2537.field2275[0] && class165.field2537.field2275[0] <= var21 + var28 && class196.field2988 != 0 && var25 > 0 && class161.field2473 < 50 && var22 != -1) {
                    class89.field1408[class161.field2473] = var22;
                    class167.field2561[class161.field2473] = var25;
                    class174.field2653[class161.field2473] = var26;
                    class289.field4568[class161.field2473] = null;
                    class63.field994[class161.field2473] = (var20 << 16) + ((var21 << 8) + var24);
                    class160.field2458[class161.field2473] = var27;
                    class161.field2473++;
                }
            }
        } else if (class246.field3683 == 92) {
            int var29 = class100.field1580.method1593((byte) 27);
            int var30 = (var29 & 0xF) + class262.field3975 * 2;
            int var31 = (var29 >> 4 & 0xF) + class52.field834 * 2;
            int var32 = class100.field1580.method1604(4) + var31;
            int var33 = class100.field1580.method1604(4) + var30;
            int var34 = class100.field1580.method1606((byte) 77);
            int var35 = class100.field1580.method1575(false);
            int var36 = class100.field1580.method1593((byte) 27) * 4;
            int var37 = class100.field1580.method1593((byte) 27) * 4;
            int var38 = class100.field1580.method1575(false);
            int var39 = class100.field1580.method1575(false);
            int var40 = class100.field1580.method1593((byte) 27);
            if (var40 == 255) {
                var40 = -1;
            }
            int var41 = class100.field1580.method1593((byte) 27);
            if (var31 >= 0 && var30 >= 0 && var31 < 208 && var30 < 208 && var32 >= 0 && var33 >= 0 && var32 < 208 && var33 < 208 && var35 != 65535) {
                int var42 = var31 * 64;
                int var43 = var32 * 64;
                int var44 = var30 * 64;
                int var45 = var33 * 64;
                class45 var46 = new class45(var35, class99.field1557, var42, var44, class183.method1139(class99.field1557, var44, var42, (byte) 117) - var36, class270.field4058 + var38, class270.field4058 + var39, var40, var41, var34, var37);
                var46.method305(class183.method1139(class99.field1557, var45, var43, (byte) 117) - var37, var43, class270.field4058 + var38, (byte) 126, var45);
                class90.field1429.method987(new class224(var46), (byte) -121);
            }
        } else if (class246.field3683 == 45) {
            int var47 = class100.field1580.method1571((byte) -110);
            int var48 = class262.field3975 + (var47 & 0x7);
            int var49 = class52.field834 + ((var47 & 0x70) >> 4);
            int var50 = class100.field1580.method1593((byte) 27);
            int var51 = var50 >> 2;
            int var52 = var50 & 0x3;
            int var53 = class293.field4607[var51];
            if (var49 >= 0 && var48 >= 0 && var49 < 104 && var48 < 104) {
                class107.method673(-1, var51, class99.field1557, -1, 0, var48, var49, (byte) 93, var52, var53);
            }
        } else {
            if (class246.field3683 == 131) {
                byte var54 = class100.field1580.method1611((byte) 105);
                int var55 = class100.field1580.method1574(255);
                int var56 = class100.field1580.method1570(true);
                int var57 = class100.field1580.method1618(16711680);
                byte var58 = class100.field1580.method1602((byte) 96);
                byte var59 = class100.field1580.method1604(arg0 - 1284368032);
                int var60 = class100.field1580.method1618(16711680);
                int var61 = class100.field1580.method1593((byte) 27);
                int var62 = (var61 & 0x7) + class262.field3975;
                int var63 = (var61 >> 4 & 0x7) + class52.field834;
                int var64 = class100.field1580.method1572(arg0 ^ 0xB372192A);
                byte var65 = class100.field1580.method1611((byte) 110);
                int var66 = var64 & 0x3;
                int var67 = var64 >> 2;
                class226.method1443(var58, var65, var62, var66, var54, (byte) 36, var59, var57, var63, var60, var55, var56, var67);
            }
            if (class246.field3683 == 237) {
                int var68 = class100.field1580.method1593((byte) 27);
                int var69 = class52.field834 + (var68 >> 4 & 0x7);
                int var70 = class262.field3975 + (var68 & 0x7);
                int var71 = class100.field1580.method1575(false);
                int var72 = class100.field1580.method1575(false);
                int var73 = class100.field1580.method1575(false);
                if (var69 >= 0 && var70 >= 0 && var69 < 104 && var70 < 104) {
                    class159 var74 = class251.field3816[class99.field1557][var69][var70];
                    if (var74 != null) {
                        for (class146 var75 = (class146) var74.method983(7); var75 != null; var75 = (class146) var74.method985((byte) -32)) {
                            class237 var76 = var75.field2128;
                            if ((var71 & 0x7FFF) == var76.field3577 && var76.field3574 == var72) {
                                var76.field3574 = var73;
                                break;
                            }
                        }
                        class204.method1296(var70, var69, true);
                    }
                }
            } else {
                if (arg0 != 1284368036) {
                    method754(24);
                }
                if (class246.field3683 == 67) {
                    int var77 = class100.field1580.method1618(16711680);
                    int var78 = class100.field1580.method1593((byte) 27);
                    int var79 = var78 & 0x3;
                    int var80 = var78 >> 2;
                    int var81 = class293.field4607[var80];
                    int var82 = class100.field1580.method1572(-83);
                    int var83 = ((var82 & 0x76) >> 4) + class52.field834;
                    int var84 = (var82 & 0x7) + class262.field3975;
                    if (var83 >= 0 && var84 >= 0 && var83 < 104 && var84 < 104) {
                        class107.method673(-1, var80, class99.field1557, var77, 0, var84, var83, (byte) 93, var79, var81);
                    }
                } else if (class246.field3683 == 63) {
                    int var85 = class100.field1580.method1578(arg0 ^ 0xB372195A);
                    int var86 = class100.field1580.method1572(-83);
                    int var87 = var86 & 0x3;
                    if (var85 == 65535) {
                        var85 = -1;
                    }
                    int var88 = var86 >> 2;
                    int var89 = class293.field4607[var88];
                    int var90 = class100.field1580.method1572(-95);
                    int var91 = ((var90 & 0x73) >> 4) + class52.field834;
                    int var92 = class262.field3975 + (var90 & 0x7);
                    class178.method1109(var88, class99.field1557, var87, var92, (byte) -117, var85, var89, var91);
                } else if (class246.field3683 == 111) {
                    int var93 = class100.field1580.method1575(false);
                    int var94 = class100.field1580.method1593((byte) 27);
                    class274.method1816(arg0 - 1284367999, var93).method1901(var94, -6871);
                } else if (class246.field3683 == 134) {
                    int var95 = class100.field1580.method1578(-2);
                    int var96 = class100.field1580.method1593((byte) 27);
                    int var97 = class262.field3975 + (var96 & 0x7);
                    int var98 = class52.field834 + (var96 >> 4 & 0x7);
                    int var99 = class100.field1580.method1578(-2);
                    if (var98 >= 0 && var97 >= 0 && var98 < 104 && var97 < 104) {
                        class237 var100 = new class237();
                        var100.field3574 = var99;
                        var100.field3577 = var95;
                        if (class251.field3816[class99.field1557][var98][var97] == null) {
                            class251.field3816[class99.field1557][var98][var97] = new class159();
                        }
                        class251.field3816[class99.field1557][var98][var97].method987(new class146(var100), (byte) -121);
                        class204.method1296(var97, var98, true);
                    }
                } else if (class246.field3683 == 26) {
                    int var101 = class100.field1580.method1593((byte) 27);
                    int var102 = class262.field3975 * 2 + (var101 & 0xF);
                    int var103 = (var101 >> 4 & 0xF) + class52.field834 * 2;
                    int var104 = class100.field1580.method1604(4) + var103;
                    int var105 = class100.field1580.method1604(4) + var102;
                    int var106 = class100.field1580.method1606((byte) 77);
                    int var107 = class100.field1580.method1606((byte) 77);
                    int var108 = class100.field1580.method1575(false);
                    int var109 = class100.field1580.method1604(4);
                    int var110 = class100.field1580.method1593((byte) 27) * 4;
                    int var111 = class100.field1580.method1575(false);
                    int var112 = class100.field1580.method1575(false);
                    int var113 = class100.field1580.method1593((byte) 27);
                    if (var113 == 255) {
                        var113 = -1;
                    }
                    int var114 = class100.field1580.method1593((byte) 27);
                    if (var103 >= 0 && var102 >= 0 && var103 < 208 && var102 < 208 && var104 >= 0 && var105 >= 0 && var104 < 208 && var105 < 208 && var108 != 65535) {
                        int var115 = var104 * 64;
                        int var116 = var103 * 64;
                        int var117 = var105 * 64;
                        int var118 = var102 * 64;
                        if (var106 != 0) {
                            int var121;
                            class153 var122;
                            if (var106 >= 0) {
                                int var119 = var106 - 1;
                                int var120 = var119 & 0x7FF;
                                var121 = var119 >> 11 & 0xF;
                                var122 = class18.field220[var120];
                            } else {
                                int var123 = -var106 - 1;
                                int var124 = var123 & 0x7FF;
                                var121 = var123 >> 11 & 0xF;
                                if (class221.field3334 == var124) {
                                    var122 = class165.field2537;
                                } else {
                                    var122 = class96.field1521[var124];
                                }
                            }
                            if (var122 != null) {
                                class158 var125 = var122.method928(24840);
                                if (var125.field2424 != null && var125.field2424[var121] != null) {
                                    var109 -= var125.field2424[var121][1];
                                    int var126 = var125.field2424[var121][0];
                                    int var127 = class249.field3767[var122.field2273];
                                    int var128 = var125.field2424[var121][2];
                                    int var129 = class249.field3781[var122.field2273];
                                    int var130 = var126 * var129 + var127 * var128 >> 16;
                                    int var131 = var128 * var129 - var126 * var127 >> 16;
                                    var116 += var130;
                                    var118 += var131;
                                }
                            }
                        }
                        class45 var133 = new class45(var108, class99.field1557, var116, var118, class183.method1139(class99.field1557, var118, var116, (byte) 117) - var109, class270.field4058 + var111, var112 + class270.field4058, var113, var114, var107, var110);
                        var133.method305(class183.method1139(class99.field1557, var117, var115, (byte) 117) - var110, var115, class270.field4058 + var111, (byte) 126, var117);
                        class90.field1429.method987(new class224(var133), (byte) -121);
                    }
                } else if (class246.field3683 == 29) {
                    int var134 = class100.field1580.method1593((byte) 27);
                    int var135 = class262.field3975 + (var134 & 0x7);
                    int var136 = ((var134 & 0x77) >> 4) + class52.field834;
                    int var137 = class100.field1580.method1575(false);
                    if (var136 >= 0 && var135 >= 0 && var136 < 104 && var135 < 104) {
                        class159 var138 = class251.field3816[class99.field1557][var136][var135];
                        if (var138 != null) {
                            for (class146 var139 = (class146) var138.method983(arg0 - 1284368029); var139 != null; var139 = (class146) var138.method985((byte) -119)) {
                                if ((var137 & 0x7FFF) == var139.field2128.field3577) {
                                    var139.method538(arg0 ^ 0x4C8DE6FC);
                                    break;
                                }
                            }
                            if (var138.method983(7) == null) {
                                class251.field3816[class99.field1557][var136][var135] = null;
                            }
                            class204.method1296(var135, var136, true);
                        }
                    }
                } else if (class246.field3683 == 199) {
                    int var140 = class100.field1580.method1575(false);
                    int var141 = class100.field1580.method1570(true);
                    int var142 = class100.field1580.method1593((byte) 27);
                    int var143 = (var142 & 0x7) + class262.field3975;
                    int var144 = ((var142 & 0x70) >> 4) + class52.field834;
                    int var145 = class100.field1580.method1570(true);
                    if (var144 >= 0 && var143 >= 0 && var144 < 104 && var143 < 104 && class221.field3334 != var145) {
                        class237 var146 = new class237();
                        var146.field3574 = var141;
                        var146.field3577 = var140;
                        if (class251.field3816[class99.field1557][var144][var143] == null) {
                            class251.field3816[class99.field1557][var144][var143] = new class159();
                        }
                        class251.field3816[class99.field1557][var144][var143].method987(new class146(var146), (byte) -121);
                        class204.method1296(var143, var144, true);
                    }
                } else if (class246.field3683 == 218) {
                    int var147 = class100.field1580.method1593((byte) 27);
                    int var148 = (var147 >> 4 & 0x7) + class52.field834;
                    int var149 = (var147 & 0x7) + class262.field3975;
                    int var150 = class100.field1580.method1575(false);
                    int var151 = class100.field1580.method1593((byte) 27);
                    int var152 = class100.field1580.method1575(false);
                    if (var148 >= 0 && var149 >= 0 && var148 < 104 && var149 < 104) {
                        int var153 = var149 * 128 + 64;
                        int var154 = var148 * 128 + 64;
                        class106 var155 = new class106(var150, class99.field1557, var154, var153, class183.method1139(class99.field1557, var153, var154, (byte) 117) - var151, var152, class270.field4058);
                        class239.field3595.method987(new class83(var155), (byte) -121);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(III)V")
    public static final void method755(int arg0, int arg1, int arg2) {
        class26.field327 = true;
        class187.field2843 = arg0;
        class175.field2659 = arg1;
        class96.field1522 = arg2;
        class41.field607 = -1;
        class54.field878 = -1;
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(I)[[[I")
    public final int[][][] method756(int arg0) {
        field1790++;
        if (this.field1799 != this.field1795) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0 != 32416) {
            field1805 = -33;
        }
        for (int var2 = 0; var2 < this.field1799; var2++) {
            this.field1804[var2] = class217.field3260;
        }
        return this.field1794;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IZ)I")
    public static final int method757(int arg0, boolean arg1) {
        field1801++;
        return arg1 ? arg0 & 0x3FF : 96;
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(II)V")
    public static final void method758(int arg0, int arg1) {
        class110.field1705 = null;
        class98.field1549 = arg1;
        class45.field708 = 0;
        class236.field3565 = -1;
        class282.field4211 = 1;
        class272.field4095 = -1;
        field1791++;
        class152.field2199 = false;
        if (arg0 != -25289) {
            field1805 = 109;
        }
    }

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "(I)V")
    public static void method759(int arg0) {
        field1796 = null;
        field1806 = null;
        if (arg0 != -297834812) {
            field1805 = 51;
        }
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(III)V")
    public class119(int arg0, int arg1, int arg2) {
        this.field1795 = arg1;
        this.field1799 = arg0;
        this.field1804 = new class194[this.field1795];
        this.field1794 = new int[this.field1799][3][arg2];
    }
}
