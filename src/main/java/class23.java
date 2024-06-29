import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class23 extends class157 {

    @OriginalMember(owner = "client!lj", name = "s", descriptor = "[J")
    private long[] field337 = new long[10];

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "I")
    private int field331 = 0;

    @OriginalMember(owner = "client!lj", name = "p", descriptor = "I")
    private int field334 = 256;

    @OriginalMember(owner = "client!lj", name = "o", descriptor = "I")
    private int field333 = 1;

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "J")
    private long field328 = class223.method1537(-26619);

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "Lwf;")
    public static class16 field327 = new class16(64);

    @OriginalMember(owner = "client!lj", name = "t", descriptor = "Lha;")
    public static class46 field338 = class271.method1828("Lade Titelbild )2 ", -46);

    @OriginalMember(owner = "client!lj", name = "r", descriptor = "Lha;")
    public static class46 field336 = class271.method1828("Bitte entfernen Sie ", -46);

    @OriginalMember(owner = "client!lj", name = "u", descriptor = "Lha;")
    public static class46 field339 = class271.method1828("Sprites geladen)3", -46);

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "I")
    private int field332;

    @OriginalMember(owner = "client!lj", name = "q", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!lj", name = "v", descriptor = "Lkj;")
    public static class106 field340;

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(I)V")
    public static void method158(int arg0) {
        field338 = null;
        field327 = null;
        if (arg0 != 11182) {
            method160((byte) 116, -33);
        }
        field336 = null;
        field339 = null;
        field340 = null;
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(II)Lha;")
    public static final class46 method159(int arg0, int arg1) {
        field326++;
        if (arg1 < 100000) {
            return class109.method855(0, new class46[] { class158.field2815, class115.method932(false, arg1), class7.field118 });
        } else {
            if (arg0 < 58) {
                field336 = null;
            }
            return arg1 < 10000000 ? class109.method855(0, new class46[] { class205.field3684, class115.method932(false, arg1 / 1000), class218.field3849, class7.field118 }) : class109.method855(0, new class46[] { class32.field602, class115.method932(false, arg1 / 1000000), class97.field1804, class7.field118 });
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(BI)V")
    public static final void method160(byte arg0, int arg1) {
        field325++;
        int var2 = -85 % ((arg0 - 11) / 41);
        class29.field575.method81((byte) 30, arg1);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Z)V")
    public final void method161(boolean arg0) {
        field329++;
        if (!arg0) {
            this.method161(false);
        }
        for (int var2 = 0; var2 < 10; var2++) {
            this.field337[var2] = 0L;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(III)I")
    public final int method162(int arg0, int arg1, int arg2) {
        int var4 = this.field334;
        this.field334 = 300;
        field335++;
        int var5 = this.field333;
        this.field333 = 1;
        this.field328 = class223.method1537(-26619);
        if (this.field337[this.field332] == 0L) {
            this.field334 = var4;
            this.field333 = var5;
        } else if (this.field328 > this.field337[this.field332]) {
            this.field334 = (int) ((long) (arg1 * 2560) / (this.field328 - this.field337[this.field332]));
        }
        if (this.field334 < 25) {
            this.field334 = 25;
        }
        if (this.field334 > 256) {
            this.field334 = 256;
            this.field333 = (int) ((long) arg1 - ((this.field328 - this.field337[this.field332]) / 10L));
        }
        if (this.field333 > arg1) {
            this.field333 = arg1;
        }
        this.field337[this.field332] = this.field328;
        this.field332 = (this.field332 + 1) % 10;
        if (this.field333 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field337[var6] != 0L) {
                    this.field337[var6] += (long) this.field333;
                }
            }
        }
        if (arg2 > this.field333) {
            this.field333 = arg2;
        }
        int var7 = arg0;
        class187.method1360((byte) 87, (long) this.field333);
        while (this.field331 < 256) {
            this.field331 += this.field334;
            var7++;
        }
        this.field331 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(I)V")
    public static final void method163(int arg0) {
        if (arg0 < 13) {
            return;
        }
        field330++;
        if (class109.field2039 == 183) {
            int var1 = class147.field2651.method554((byte) 88);
            int var2 = var1 >> 2;
            int var3 = var1 & 0x3;
            int var4 = class247.field4372[var2];
            int var5 = class147.field2651.method595(-16950);
            int var6 = (var5 >> 4 & 0x7) + class82.field1577;
            int var7 = (var5 & 0x7) + class238.field4226;
            int var8 = class147.field2651.method579(-100);
            if (var8 == 65535) {
                var8 = -1;
            }
            class169.method1199(var3, var8, var2, var7, -7748, class135.field2450, var6, var4);
        } else if (class109.field2039 == 245) {
            int var9 = class147.field2651.method558(1);
            int var10 = (var9 & 0x7) + class238.field4226;
            int var11 = (var9 >> 4 & 0x7) + class82.field1577;
            int var12 = class147.field2651.method569((byte) -110) + var11;
            int var13 = var10 + class147.field2651.method569((byte) -110);
            int var14 = class147.field2651.method591(true);
            int var15 = class147.field2651.method545((byte) 74);
            int var16 = class147.field2651.method558(1) * 4;
            int var17 = class147.field2651.method558(1) * 4;
            int var18 = class147.field2651.method545((byte) 66);
            int var19 = class147.field2651.method545((byte) 39);
            int var20 = class147.field2651.method558(1);
            int var21 = class147.field2651.method558(1);
            if (var11 >= 0 && var10 >= 0 && var11 < 104 && var10 < 104 && var12 >= 0 && var13 >= 0 && var12 < 104 && var13 < 104 && var15 != 65535) {
                int var22 = var13 * 128 + 64;
                int var23 = var10 * 128 + 64;
                int var24 = var11 * 128 + 64;
                int var25 = var12 * 128 + 64;
                class169 var26 = new class169(var15, class135.field2450, var24, var23, class206.method1461(var23, class135.field2450, var24, 4) - var16, var18 - -class157.field2803, class157.field2803 + var19, var20, var21, var14, var17);
                var26.method1205(var22, class157.field2803 + var18, true, class206.method1461(var22, class135.field2450, var25, 4) - var17, var25);
                class15.field222.method265(new class187(var26), -501);
            }
        } else if (class109.field2039 == 107) {
            int var27 = class147.field2651.method566(255);
            int var28 = class82.field1577 + ((var27 & 0x75) >> 4);
            int var29 = (var27 & 0x7) + class238.field4226;
            int var30 = class147.field2651.method579(-90);
            if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
                class39 var31 = class103.field1874[class135.field2450][var28][var29];
                if (var31 != null) {
                    for (class254 var32 = (class254) var31.method264(-102); var32 != null; var32 = (class254) var31.method269((byte) 7)) {
                        if ((var30 & 0x7FFF) == var32.field4456.field2609) {
                            var32.method501(0);
                            break;
                        }
                    }
                    if (var31.method264(-55) == null) {
                        class103.field1874[class135.field2450][var28][var29] = null;
                    }
                    class189.method1373(-107, var29, var28);
                }
            }
        } else {
            if (class109.field2039 == 97) {
                int var33 = class147.field2651.method545((byte) -92);
                int var34 = class147.field2651.method579(-121);
                int var35 = class147.field2651.method595(-16950);
                int var36 = ((var35 & 0x7A) >> 4) + class82.field1577;
                int var37 = (var35 & 0x7) + class238.field4226;
                int var38 = class147.field2651.method567((byte) 127);
                byte var39 = class147.field2651.method576((byte) 107);
                byte var40 = class147.field2651.method588(-128);
                byte var41 = class147.field2651.method576((byte) 64);
                int var42 = class147.field2651.method567((byte) 127);
                byte var43 = class147.field2651.method588(-128);
                int var44 = class147.field2651.method566(255);
                int var45 = var44 >> 2;
                int var46 = class247.field4372[var45];
                int var47 = var44 & 0x3;
                class81 var48;
                if (class114.field2158 == var42) {
                    var48 = class277.field4824;
                } else {
                    var48 = class1.field6[var42];
                }
                if (var48 != null) {
                    class236 var49 = class157.method1158(var33, 115);
                    int var50;
                    int var51;
                    if (var47 == 1 || var47 == 3) {
                        var50 = var49.field4130;
                        var51 = var49.field4152;
                    } else {
                        var50 = var49.field4152;
                        var51 = var49.field4130;
                    }
                    int var52 = var36 + (var50 >> 1);
                    int[][] var53 = null;
                    int[][] var54 = class119.field2228[class135.field2450];
                    int var55 = (var36 << 7) + (var50 << 6);
                    int var56 = (var51 >> 1) + var37;
                    int var57 = (var51 + 1 >> 1) + var37;
                    if (class135.field2450 < 3) {
                        var53 = class119.field2228[class135.field2450 + 1];
                    }
                    int var58 = (var50 + 1 >> 1) + var36;
                    int var59 = var54[var52][var56] + var54[var52][var57] + var54[var58][var56] + var54[var58][var57] >> 2;
                    int var60 = (var37 << 7) + (var51 << 6);
                    class167 var61 = var49.method1618((class179) null, false, (byte) 112, var54, var47, var53, var60, var49.field4115, var45, var59, var55);
                    if (var61 != null) {
                        class80.method634(var34 + 1, (byte) -105, var38 + 1, 0, class135.field2450, var36, var37, -1, var46, 0);
                        var48.field1569 = (class36) var61.field2944;
                        var48.field1559 = var34 + class157.field2803;
                        var48.field1564 = var59;
                        var48.field1566 = var37 * 128 + var51 * 64;
                        var48.field1565 = var36 * 128 + (var50 * 64);
                        if (var43 < var41) {
                            byte var62 = var41;
                            var41 = var43;
                            var43 = var62;
                        }
                        var48.field1545 = var36 + var41;
                        var48.field1539 = class157.field2803 + var38;
                        var48.field1529 = var36 + var43;
                        if (var40 > var39) {
                            byte var63 = var40;
                            var40 = var39;
                            var39 = var63;
                        }
                        var48.field1549 = var37 + var40;
                        var48.field1555 = var37 + var39;
                    }
                }
            }
            if (class109.field2039 == 57) {
                int var64 = class147.field2651.method545((byte) 119);
                int var65 = class147.field2651.method545((byte) -87);
                int var66 = class147.field2651.method566(255);
                int var67 = class238.field4226 + (var66 & 0x7);
                int var68 = class82.field1577 + (var66 >> 4 & 0x7);
                int var69 = class147.field2651.method567((byte) 127);
                if (var68 >= 0 && var67 >= 0 && var68 < 104 && var67 < 104 && class114.field2158 != var64) {
                    class144 var70 = new class144();
                    var70.field2612 = var69;
                    var70.field2609 = var65;
                    if (class103.field1874[class135.field2450][var68][var67] == null) {
                        class103.field1874[class135.field2450][var68][var67] = new class39();
                    }
                    class103.field1874[class135.field2450][var68][var67].method265(new class254(var70), -501);
                    class189.method1373(54, var67, var68);
                }
            } else if (class109.field2039 == 13) {
                int var71 = class147.field2651.method558(1);
                int var72 = (var71 & 0xF) + class238.field4226 * 2;
                int var73 = ((var71 & 0xFA) >> 4) + class82.field1577 * 2;
                int var74 = var73 + class147.field2651.method569((byte) -110);
                int var75 = var72 + class147.field2651.method569((byte) -110);
                int var76 = class147.field2651.method591(true);
                int var77 = class147.field2651.method545((byte) 121);
                int var78 = class147.field2651.method558(1) * 4;
                int var79 = class147.field2651.method558(1) * 4;
                int var80 = class147.field2651.method545((byte) -103);
                int var81 = class147.field2651.method545((byte) -80);
                int var82 = class147.field2651.method558(1);
                int var83 = class147.field2651.method558(1);
                if (var73 >= 0 && var72 >= 0 && var73 < 208 && var72 < 208 && var74 >= 0 && var75 >= 0 && var74 < 208 && var75 < 208 && var77 != 65535) {
                    int var84 = var73 * 64;
                    int var85 = var74 * 64;
                    int var86 = var75 * 64;
                    int var87 = var72 * 64;
                    class169 var88 = new class169(var77, class135.field2450, var84, var87, class206.method1461(var87, class135.field2450, var84, 4) - var78, class157.field2803 + var80, class157.field2803 + var81, var82, var83, var76, var79);
                    var88.method1205(var86, class157.field2803 + var80, true, class206.method1461(var86, class135.field2450, var85, 4) - var79, var85);
                    class15.field222.method265(new class187(var88), -501);
                }
            } else if (class109.field2039 == 204) {
                int var89 = class147.field2651.method580(-74);
                int var90 = class147.field2651.method545((byte) 108);
                int var91 = class147.field2651.method595(-16950);
                int var92 = ((var91 & 0x74) >> 4) + class82.field1577;
                int var93 = (var91 & 0x7) + class238.field4226;
                if (var92 >= 0 && var93 >= 0 && var92 < 104 && var93 < 104) {
                    class144 var94 = new class144();
                    var94.field2612 = var89;
                    var94.field2609 = var90;
                    if (class103.field1874[class135.field2450][var92][var93] == null) {
                        class103.field1874[class135.field2450][var92][var93] = new class39();
                    }
                    class103.field1874[class135.field2450][var92][var93].method265(new class254(var94), -501);
                    class189.method1373(113, var93, var92);
                }
            } else if (class109.field2039 == 0) {
                int var95 = class147.field2651.method558(1);
                int var96 = class82.field1577 + (var95 >> 4 & 0x7);
                int var97 = class238.field4226 + (var95 & 0x7);
                int var98 = class147.field2651.method545((byte) -72);
                int var99 = class147.field2651.method545((byte) -83);
                int var100 = class147.field2651.method545((byte) 56);
                if (var96 >= 0 && var97 >= 0 && var96 < 104 && var97 < 104) {
                    class39 var101 = class103.field1874[class135.field2450][var96][var97];
                    if (var101 != null) {
                        for (class254 var102 = (class254) var101.method264(-66); var102 != null; var102 = (class254) var101.method269((byte) 7)) {
                            class144 var103 = var102.field4456;
                            if ((var98 & 0x7FFF) == var103.field2609 && var103.field2612 == var99) {
                                var103.field2612 = var100;
                                break;
                            }
                        }
                        class189.method1373(41, var97, var96);
                    }
                }
            } else if (class109.field2039 == 122) {
                int var104 = class147.field2651.method558(1);
                int var105 = (var104 & 0x7) + class238.field4226;
                int var106 = ((var104 & 0x7D) >> 4) + class82.field1577;
                int var107 = class147.field2651.method558(1);
                int var108 = var107 & 0x3;
                int var109 = var107 >> 2;
                int var110 = class247.field4372[var109];
                int var111 = class147.field2651.method545((byte) -119);
                if (var106 >= 0 && var105 >= 0 && var106 < 104 && var105 < 104) {
                    class80.method634(-1, (byte) -105, 0, var109, class135.field2450, var106, var105, var111, var110, var108);
                }
            } else if (class109.field2039 == 7) {
                int var112 = class147.field2651.method558(1);
                int var113 = class238.field4226 + (var112 & 0x7);
                int var114 = (var112 >> 4 & 0x7) + class82.field1577;
                int var115 = class147.field2651.method545((byte) -127);
                int var116 = class147.field2651.method558(1);
                int var117 = class147.field2651.method545((byte) -111);
                if (var114 >= 0 && var113 >= 0 && var114 < 104 && var113 < 104) {
                    int var118 = var113 * 128 + 64;
                    int var119 = var114 * 128 + 64;
                    class226 var120 = new class226(var115, class135.field2450, var119, var118, class206.method1461(var118, class135.field2450, var119, 4) - var116, var117, class157.field2803);
                    class40.field696.method265(new class28(var120), -501);
                }
            } else if (class109.field2039 == 166) {
                int var121 = class147.field2651.method595(-16950);
                int var122 = (var121 >> 4 & 0x7) + class82.field1577;
                int var123 = (var121 & 0x7) + class238.field4226;
                int var124 = class147.field2651.method558(1);
                int var125 = var124 >> 2;
                int var126 = class247.field4372[var125];
                int var127 = var124 & 0x3;
                if (var122 >= 0 && var123 >= 0 && var122 < 104 && var123 < 104) {
                    class80.method634(-1, (byte) -105, 0, var125, class135.field2450, var122, var123, -1, var126, var127);
                }
            } else if (class109.field2039 == 86) {
                int var128 = class147.field2651.method558(1);
                int var129 = class238.field4226 + (var128 & 0x7);
                int var130 = class82.field1577 + ((var128 & 0x7D) >> 4);
                int var131 = class147.field2651.method545((byte) -92);
                if (var131 == 65535) {
                    var131 = -1;
                }
                int var132 = class147.field2651.method558(1);
                int var133 = (var132 & 0xF6) >> 4;
                int var134 = class147.field2651.method558(1);
                int var135 = var132 & 0x7;
                if (var130 >= 0 && var129 >= 0 && var130 < 104 && var129 < 104) {
                    int var136 = var133 + 1;
                    if (class277.field4824.field2523[0] >= (var130 - var136) && class277.field4824.field2523[0] <= (var130 + var136) && var129 - var136 <= class277.field4824.field2517[0] && class277.field4824.field2517[0] <= var129 + var136 && class135.field2452 != 0 && var135 > 0 && class273.field4775 < 50 && var131 != -1) {
                        class54.field926[class273.field4775] = var131;
                        class180.field3205[class273.field4775] = var135;
                        class60.field998[class273.field4775] = var134;
                        class188.field3364[class273.field4775] = null;
                        class50.field863[class273.field4775] = (var129 << 8) + (var130 << 16) + var133;
                        class273.field4775++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(BI)V")
    public static final void method164(byte arg0, int arg1) {
        field324++;
        class146 var2 = class6.method22((byte) 16, 10, arg1);
        var2.method1082((byte) -128);
        if (arg0 >= -20) {
            method158(-50);
        }
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "()V")
    public class23() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field337[var1] = this.field328;
        }
    }
}
