import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class325 extends class198 {

    @OriginalMember(owner = "client!fl", name = "y", descriptor = "[J")
    private long[] field4902 = new long[10];

    @OriginalMember(owner = "client!fl", name = "v", descriptor = "I")
    private int field4899 = 1;

    @OriginalMember(owner = "client!fl", name = "p", descriptor = "I")
    private int field4893 = 0;

    @OriginalMember(owner = "client!fl", name = "r", descriptor = "I")
    private int field4895 = 256;

    @OriginalMember(owner = "client!fl", name = "C", descriptor = "J")
    private long field4906 = class231.method1594(-20375);

    @OriginalMember(owner = "client!fl", name = "s", descriptor = "[Lla;")
    public static class191[] field4896 = new class191[4];

    @OriginalMember(owner = "client!fl", name = "u", descriptor = "I")
    public static int field4898 = 0;

    @OriginalMember(owner = "client!fl", name = "q", descriptor = "[I")
    public static int[] field4894 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

    @OriginalMember(owner = "client!fl", name = "m", descriptor = "J")
    public static long field4890 = 0L;

    @OriginalMember(owner = "client!fl", name = "t", descriptor = "Z")
    public static boolean field4897 = false;

    @OriginalMember(owner = "client!fl", name = "l", descriptor = "I")
    public static int field4889;

    @OriginalMember(owner = "client!fl", name = "n", descriptor = "I")
    public static int field4891;

    @OriginalMember(owner = "client!fl", name = "o", descriptor = "I")
    private int field4892;

    @OriginalMember(owner = "client!fl", name = "w", descriptor = "I")
    public static int field4900;

    @OriginalMember(owner = "client!fl", name = "x", descriptor = "I")
    public static int field4901;

    @OriginalMember(owner = "client!fl", name = "z", descriptor = "I")
    public static int field4903;

    @OriginalMember(owner = "client!fl", name = "A", descriptor = "I")
    public static int field4904;

    @OriginalMember(owner = "client!fl", name = "B", descriptor = "I")
    public static int field4905;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)V", line = 8)
    public static void method2216(byte arg0) {
        if (arg0 != 59) {
            field4898 = -105;
        }
        field4894 = null;
        field4896 = null;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V", line = 23)
    public final void method1360(int arg0) {
        field4903++;
        if (arg0 == -1) {
            for (int var2 = 0; var2 < 10; var2++) {
                this.field4902[var2] = 0L;
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(BI)I", line = 48)
    public static final int method2217(byte arg0, int arg1) {
        field4905++;
        if (arg0 == 39) {
            int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
            int var3 = arg1 * 6 - 61440;
            int var4 = (arg1 * var3 >> 12) + 40960;
            return var2 * var4 >> 12;
        } else {
            return 83;
        }
    }

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "(I)V", line = 77)
    public static final void method2218(int arg0) {
        field4891++;
        if (class217.field3289 == 103) {
            int var1 = class207.field3137.method1794(-114);
            int var2 = class207.field3137.method1807(89);
            int var3 = (var2 & 0x7) + class26.field368;
            int var4 = ((var2 & 0x77) >> 4) + class103.field1639;
            if (var4 >= 0 && var3 >= 0 && var4 < 104 && var3 < 104) {
                class156 var5 = class149.field2246[class180.field2697][var4][var3];
                if (var5 != null) {
                    for (class287 var6 = (class287) var5.method1109(33); var6 != null; var6 = (class287) var5.method1115((byte) 86)) {
                        if ((var1 & 0x7FFF) == var6.field4334.field2501) {
                            var6.method714(93);
                            break;
                        }
                    }
                    if (var5.method1109(87) == null) {
                        class149.field2246[class180.field2697][var4][var3] = null;
                    }
                    class245.method1655(var4, var3, (byte) -19);
                }
            }
        } else if (class217.field3289 == 68) {
            int var144 = class207.field3137.method1787(false);
            int var145 = (var144 & 0x7) + class26.field368;
            int var146 = (var144 >> 4 & 0x7) + class103.field1639;
            int var147 = class207.field3137.method1830((byte) -77);
            if (var147 == 65535) {
                var147 = -1;
            }
            int var148 = class207.field3137.method1787(false);
            int var149 = class207.field3137.method1787(false);
            int var150 = var148 & 0x7;
            int var151 = var148 >> 4 & 0xF;
            if (var146 >= 0 && var145 >= 0 && var146 < 104 && var145 < 104) {
                int var152 = var151 + 1;
                if (var146 - var152 <= class114.field1750.field1541[0] && (var146 + var152) >= class114.field1750.field1541[0] && (var145 - var152) <= class114.field1750.field1516[0] && var145 + var152 >= class114.field1750.field1516[0] && class272.field4183 != 0 && var150 > 0 && class168.field2522 < 50 && var147 != -1) {
                    class116.field1783[class168.field2522] = var147;
                    class81.field1145[class168.field2522] = var150;
                    class201.field3003[class168.field2522] = var149;
                    class48.field608[class168.field2522] = null;
                    class309.field4693[class168.field2522] = (var145 << 8) + (var146 << 16) + var151;
                    class168.field2522++;
                }
            }
        } else if (class217.field3289 == 229) {
            int var7 = class207.field3137.method1787(false);
            int var8 = (var7 & 0x7) + class26.field368;
            int var9 = (var7 >> 4 & 0x7) + class103.field1639;
            int var10 = class207.field3137.method1830((byte) -77);
            int var11 = class207.field3137.method1787(false);
            int var12 = class207.field3137.method1830((byte) -77);
            if (var9 >= 0 && var8 >= 0 && var9 < 104 && var8 < 104) {
                int var13 = var8 * 128 + 64;
                int var14 = var9 * 128 + 64;
                class113 var15 = new class113(var10, class180.field2697, var14, var13, class74.method473(var13, var14, 64, class180.field2697) - var11, var12, class304.field4641);
                class205.field3082.method1108(new class317(var15), 65280);
            }
        } else {
            if (class217.field3289 == 93) {
                int var16 = class207.field3137.method1830((byte) -77);
                byte var17 = class207.field3137.method1848((byte) 114);
                byte var18 = class207.field3137.method1847(-4);
                byte var19 = class207.field3137.method1799((byte) 123);
                int var20 = class207.field3137.method1831(108);
                int var21 = class207.field3137.method1790(128);
                int var22 = ((var21 & 0x79) >> 4) + class103.field1639;
                int var23 = (var21 & 0x7) + class26.field368;
                int var24 = class207.field3137.method1794(-113);
                byte var25 = class207.field3137.method1799((byte) 120);
                int var26 = class207.field3137.method1790(128);
                int var27 = var26 & 0x3;
                int var28 = var26 >> 2;
                int var29 = class207.field3137.method1838((byte) 95);
                if (!class117.field1817) {
                    class116.method793(var24, 4, var29, var28, var23, var27, var18, var17, var20, var16, var22, var19, var25);
                }
            }
            if (class217.field3289 == 25) {
                int var30 = class207.field3137.method1787(false);
                int var31 = ((var30 & 0xFA) >> 4) + class103.field1639 * 2;
                int var32 = (var30 & 0xF) + class26.field368 * 2;
                int var33 = class207.field3137.method1810((byte) 119) + var31;
                int var34 = class207.field3137.method1810((byte) 111) + var32;
                int var35 = class207.field3137.method1845((byte) -120);
                int var36 = class207.field3137.method1830((byte) -77);
                int var37 = class207.field3137.method1787(false) * 4;
                int var38 = class207.field3137.method1787(false) * 4;
                int var39 = class207.field3137.method1830((byte) -77);
                int var40 = class207.field3137.method1830((byte) -77);
                int var41 = class207.field3137.method1787(false);
                int var42 = class207.field3137.method1787(false);
                if (var41 == 255) {
                    var41 = -1;
                }
                if (var31 >= 0 && var32 >= 0 && var31 < 208 && var32 < 208 && var33 >= 0 && var34 >= 0 && var33 < 208 && var34 < 208 && var36 != 65535) {
                    int var43 = var31 * 64;
                    int var44 = var34 * 64;
                    int var45 = var33 * 64;
                    int var46 = var32 * 64;
                    class79 var47 = new class79(var36, class180.field2697, var43, var46, class74.method473(var46, var43, 64, class180.field2697) - var37, class304.field4641 + var39, class304.field4641 + var40, var41, var42, var35, var38);
                    var47.method532(class304.field4641 + var39, var44, var45, (byte) -104, class74.method473(var44, var45, 64, class180.field2697) - var38);
                    class69.field905.method1108(new class160(var47), 65280);
                }
            } else if (class217.field3289 == 94) {
                int var126 = class207.field3137.method1787(false);
                int var127 = (var126 >> 4 & 0x7) + class103.field1639;
                int var128 = class26.field368 + (var126 & 0x7);
                int var129 = var127 + class207.field3137.method1810((byte) 120);
                int var130 = class207.field3137.method1810((byte) 100) + var128;
                int var131 = class207.field3137.method1845((byte) -127);
                int var132 = class207.field3137.method1830((byte) -77);
                int var133 = class207.field3137.method1787(false) * 4;
                int var134 = class207.field3137.method1787(false) * 4;
                int var135 = class207.field3137.method1830((byte) -77);
                int var136 = class207.field3137.method1830((byte) -77);
                int var137 = class207.field3137.method1787(false);
                int var138 = class207.field3137.method1787(false);
                if (var137 == 255) {
                    var137 = -1;
                }
                if (var127 >= 0 && var128 >= 0 && var127 < 104 && var128 < 104 && var129 >= 0 && var130 >= 0 && var129 < 104 && var130 < 104 && var132 != 65535) {
                    int var139 = var129 * 128 + 64;
                    int var140 = var130 * 128 + 64;
                    int var141 = var128 * 128 + 64;
                    int var142 = var127 * 128 + 64;
                    class79 var143 = new class79(var132, class180.field2697, var142, var141, class74.method473(var141, var142, 64, class180.field2697) - var133, class304.field4641 + var135, var136 + class304.field4641, var137, var138, var131, var134);
                    var143.method532(class304.field4641 + var135, var140, var139, (byte) -105, class74.method473(var140, var139, 64, class180.field2697) - var134);
                    class69.field905.method1108(new class160(var143), 65280);
                }
            } else if (class217.field3289 == 179) {
                int var48 = class207.field3137.method1787(false);
                int var49 = ((var48 & 0x7C) >> 4) + class103.field1639;
                int var50 = (var48 & 0x7) + class26.field368;
                int var51 = class207.field3137.method1838((byte) 97);
                int var52 = class207.field3137.method1830((byte) -77);
                if (var49 >= 0 && var50 >= 0 && var49 < 104 && var50 < 104) {
                    class166 var53 = new class166();
                    var53.field2501 = var52;
                    var53.field2502 = var51;
                    if (class149.field2246[class180.field2697][var49][var50] == null) {
                        class149.field2246[class180.field2697][var49][var50] = new class156();
                    }
                    class149.field2246[class180.field2697][var49][var50].method1108(new class287(var53), 65280);
                    class245.method1655(var49, var50, (byte) -19);
                }
            } else if (class217.field3289 == 36) {
                int var118 = class207.field3137.method1838((byte) 123);
                int var119 = class207.field3137.method1790(128);
                int var120 = var119 >> 2;
                if (var118 == 65535) {
                    var118 = -1;
                }
                int var121 = var119 & 0x3;
                int var122 = class44.field561[var120];
                int var123 = class207.field3137.method1787(false);
                int var124 = ((var123 & 0x7C) >> 4) + class103.field1639;
                int var125 = class26.field368 + (var123 & 0x7);
                class116.method799((byte) -127, var125, var122, var118, var121, var120, class180.field2697, var124);
            } else if (class217.field3289 == 110) {
                int var110 = class207.field3137.method1807(58);
                int var111 = var110 >> 2;
                int var112 = class44.field561[var111];
                int var113 = var110 & 0x3;
                int var114 = class207.field3137.method1838((byte) 96);
                int var115 = class207.field3137.method1787(false);
                int var116 = class26.field368 + (var115 & 0x7);
                int var117 = (var115 >> 4 & 0x7) + class103.field1639;
                if (var117 >= 0 && var116 >= 0 && var117 < 104 && var116 < 104) {
                    class38.method261(-1, 0, var111, var114, var117, var113, var112, -849, var116, class180.field2697);
                }
            } else {
                if (arg0 <= 61) {
                    field4897 = true;
                }
                if (class217.field3289 == 241) {
                    int var54 = class207.field3137.method1838((byte) 109);
                    int var55 = class207.field3137.method1790(128);
                    int var56 = class103.field1639 + (var55 >> 4 & 0x7);
                    int var57 = class26.field368 + (var55 & 0x7);
                    int var58 = class207.field3137.method1830((byte) -77);
                    int var59 = class207.field3137.method1835(false);
                    if (var56 >= 0 && var57 >= 0 && var56 < 104 && var57 < 104 && class234.field3516 != var54) {
                        class166 var60 = new class166();
                        var60.field2501 = var58;
                        var60.field2502 = var59;
                        if (class149.field2246[class180.field2697][var56][var57] == null) {
                            class149.field2246[class180.field2697][var56][var57] = new class156();
                        }
                        class149.field2246[class180.field2697][var56][var57].method1108(new class287(var60), 65280);
                        class245.method1655(var56, var57, (byte) -19);
                    }
                } else if (class217.field3289 == 29) {
                    int var101 = class207.field3137.method1787(false);
                    int var102 = ((var101 & 0x7C) >> 4) + class103.field1639;
                    int var103 = class26.field368 + (var101 & 0x7);
                    int var104 = class207.field3137.method1830((byte) -77);
                    int var105 = class207.field3137.method1830((byte) -77);
                    int var106 = class207.field3137.method1830((byte) -77);
                    if (var102 >= 0 && var103 >= 0 && var102 < 104 && var103 < 104) {
                        class156 var107 = class149.field2246[class180.field2697][var102][var103];
                        if (var107 != null) {
                            for (class287 var108 = (class287) var107.method1109(18); var108 != null; var108 = (class287) var107.method1115((byte) 75)) {
                                class166 var109 = var108.field4334;
                                if ((var104 & 0x7FFF) == var109.field2501 && var109.field2502 == var105) {
                                    var109.field2502 = var106;
                                    break;
                                }
                            }
                            class245.method1655(var102, var103, (byte) -19);
                        }
                    }
                } else if (class217.field3289 == 140) {
                    int var94 = class207.field3137.method1807(-9);
                    int var95 = (var94 & 0x7) + class26.field368;
                    int var96 = ((var94 & 0x7D) >> 4) + class103.field1639;
                    int var97 = class207.field3137.method1787(false);
                    int var98 = var97 & 0x3;
                    int var99 = var97 >> 2;
                    int var100 = class44.field561[var99];
                    if (var96 >= 0 && var95 >= 0 && var96 < 104 && var95 < 104) {
                        class38.method261(-1, 0, var99, -1, var96, var98, var100, -849, var95, class180.field2697);
                    }
                } else if (class217.field3289 == 55) {
                    int var61 = class207.field3137.method1787(false);
                    int var62 = ((var61 & 0xF0) >> 4) + class103.field1639 * 2;
                    int var63 = (var61 & 0xF) + class26.field368 * 2;
                    int var64 = var62 + class207.field3137.method1810((byte) 118);
                    int var65 = var63 + class207.field3137.method1810((byte) 102);
                    int var66 = class207.field3137.method1845((byte) -124);
                    int var67 = class207.field3137.method1845((byte) -128);
                    int var68 = class207.field3137.method1830((byte) -77);
                    int var69 = class207.field3137.method1810((byte) 127);
                    int var70 = class207.field3137.method1787(false) * 4;
                    int var71 = class207.field3137.method1830((byte) -77);
                    int var72 = class207.field3137.method1830((byte) -77);
                    int var73 = class207.field3137.method1787(false);
                    int var74 = class207.field3137.method1787(false);
                    if (var73 == 255) {
                        var73 = -1;
                    }
                    if (var62 >= 0 && var63 >= 0 && var62 < 208 && var63 < 208 && var64 >= 0 && var65 >= 0 && var64 < 208 && var65 < 208 && var68 != 65535) {
                        int var75 = var64 * 64;
                        int var76 = var63 * 64;
                        int var77 = var62 * 64;
                        int var78 = var65 * 64;
                        if (var66 != 0) {
                            int var80;
                            class98 var82;
                            if (var66 < 0) {
                                int var79 = -var66 - 1;
                                var80 = var79 >> 11 & 0xF;
                                int var81 = var79 & 0x7FF;
                                if (class234.field3516 == var81) {
                                    var82 = class114.field1750;
                                } else {
                                    var82 = class241.field3592[var81];
                                }
                            } else {
                                int var83 = var66 - 1;
                                var80 = var83 >> 11 & 0xF;
                                int var84 = var83 & 0x7FF;
                                var82 = class187.field2788[var84];
                            }
                            if (var82 != null) {
                                class242 var85 = var82.method699(0);
                                if (var85.field3631 != null && var85.field3631[var80] != null) {
                                    int var86 = var85.field3631[var80][0];
                                    int var87 = var85.field3631[var80][2];
                                    var69 -= var85.field3631[var80][1];
                                    int var88 = class148.field2239[var82.field1470];
                                    int var89 = class148.field2229[var82.field1470];
                                    int var90 = var87 * var88 + (var86 * var89) >> 16;
                                    int var91 = var87 * var89 - (var86 * var88) >> 16;
                                    var77 += var90;
                                    var76 += var91;
                                }
                            }
                        }
                        class79 var93 = new class79(var68, class180.field2697, var77, var76, class74.method473(var76, var77, 64, class180.field2697) - var69, class304.field4641 + var71, class304.field4641 + var72, var73, var74, var67, var70);
                        var93.method532(class304.field4641 + var71, var78, var75, (byte) -112, class74.method473(var78, var75, 64, class180.field2697) - var70);
                        class69.field905.method1108(new class160(var93), 65280);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "()V", line = 814)
    public class325() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field4902[var1] = this.field4906;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(III)I", line = 665)
    public final int method1359(int arg0, int arg1, int arg2) {
        field4889++;
        int var4 = this.field4899;
        this.field4899 = 1;
        int var5 = this.field4895;
        this.field4895 = 300;
        this.field4906 = class231.method1594(-20375);
        if (this.field4902[this.field4892] == 0L) {
            this.field4899 = var4;
            this.field4895 = var5;
        } else if (this.field4902[this.field4892] < this.field4906) {
            this.field4895 = (int) ((long) (arg2 * 2560) / (this.field4906 - this.field4902[this.field4892]));
        }
        if (arg0 != -23781) {
            this.method1359(57, -28, 0);
        }
        if (this.field4895 < 25) {
            this.field4895 = 25;
        }
        if (this.field4895 > 256) {
            this.field4895 = 256;
            this.field4899 = (int) ((long) arg2 - ((this.field4906 - this.field4902[this.field4892]) / 10L));
        }
        if (arg2 < this.field4899) {
            this.field4899 = arg2;
        }
        this.field4902[this.field4892] = this.field4906;
        this.field4892 = (this.field4892 + 1) % 10;
        if (this.field4899 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field4902[var6] != 0L) {
                    this.field4902[var6] -= -((long) this.field4899);
                }
            }
        }
        int var7 = 0;
        if (this.field4899 < arg1) {
            this.field4899 = arg1;
        }
        class93.method662(-553, (long) this.field4899);
        while (this.field4893 < 256) {
            this.field4893 += this.field4895;
            var7++;
        }
        this.field4893 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)Lpf;", line = 739)
    public static final class253 method2219(int arg0, int arg1) {
        field4904++;
        class253 var2 = (class253) class70.field921.method2180((long) arg0, (byte) 31);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class272.field4161.method1441(class214.method1479((byte) 93, arg0), (byte) -44, class327.method2228(arg0, (byte) -64));
        class253 var4 = new class253();
        var4.field3778 = arg0;
        if (var3 != null) {
            var4.method1722(new class263(var3), (byte) 120);
        }
        var4.method1715((byte) 108);
        if (var4.field3800 != -1) {
            var4.method1710(1, method2219(var4.field3849, -9379), method2219(var4.field3800, -9379));
        }
        if (arg1 != -9379) {
            field4890 = -5L;
        }
        if (var4.field3834 != -1) {
            var4.method1719(81, method2219(var4.field3834, -9379), method2219(var4.field3812, -9379));
        }
        if (!class225.field3425 && var4.field3850) {
            var4.field3786 = class177.field2628;
            var4.field3848 = 0;
            var4.field3806 = class258.field3900;
            var4.field3837 = class237.field3551;
            var4.field3833 = false;
        }
        class70.field921.method2175((long) arg0, var4, -117);
        return var4;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIIIII)I", line = 780)
    public static final int method2220(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg4 & 0x1) == 1) {
            int var7 = arg2;
            arg2 = arg6;
            arg6 = var7;
        }
        field4900++;
        int var8 = arg1 & 0x3;
        if (var8 == 0) {
            return arg5;
        } else if (var8 == 1) {
            return 7 + 1 - arg0 - arg2;
        } else if (var8 == 2) {
            return 7 + 1 - arg5 - arg6;
        } else if (arg3 == -209) {
            return arg0;
        } else {
            return 12;
        }
    }
}
