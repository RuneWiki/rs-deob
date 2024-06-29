import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class4 {

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "Llc;")
    public static class69 field83 = class69.method470((byte) -123, ")2");

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "Llc;")
    public static class69 field81 = class69.method470((byte) -104, "k");

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "J")
    public static volatile long field76 = 0L;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "Llc;")
    public static class69 field77 = class69.method470((byte) -118, "Please reload this page)3");

    @OriginalMember(owner = "client!ac", name = "v", descriptor = "Llc;")
    public static class69 field92 = class69.method470((byte) -117, "Could not complete login)3");

    @OriginalMember(owner = "client!ac", name = "y", descriptor = "[Lpd;")
    public static class94[] field95 = new class94[2048];

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "Llc;")
    public static class69 field80 = class69.method470((byte) -110, "@whi@");

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "Llc;")
    public static class69 field78 = class69.method470((byte) -121, "Login limit exceeded)3");

    @OriginalMember(owner = "client!ac", name = "A", descriptor = "Llc;")
    public static class69 field97 = class69.method470((byte) -117, "K");

    @OriginalMember(owner = "client!ac", name = "E", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!ac", name = "s", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!ac", name = "t", descriptor = "I")
    private int field90;

    @OriginalMember(owner = "client!ac", name = "w", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!ac", name = "z", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!ac", name = "B", descriptor = "I")
    public static int field98;

    @OriginalMember(owner = "client!ac", name = "C", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "J")
    private long field73;

    @OriginalMember(owner = "client!ac", name = "x", descriptor = "J")
    private long field94;

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "Lkc;")
    public static class63 field84;

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "Z")
    public boolean field82;

    @OriginalMember(owner = "client!ac", name = "D", descriptor = "[I")
    private int[] field100;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "[I")
    private int[] field75;

    @OriginalMember(owner = "client!ac", name = "u", descriptor = "[I")
    public static int[] field91;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)I")
    public final int method16(int arg0) {
        field89++;
        if (arg0 == -7123) {
            return this.field90 == -1 ? (this.field100[0] << 15) + (this.field75[0] << 25) + (this.field75[4] << 20) + (this.field100[11] << 5) - (-(this.field100[8] << 10) - this.field100[1]) : class93.method661(9, this.field90).field1458 + 305419896;
        } else {
            return 120;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIZIIII)Z")
    public static final boolean method17(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8) {
        field72++;
        if (!class50.method334((byte) 75, arg6)) {
            return false;
        }
        boolean var9 = true;
        class95.method719(arg1, arg5, arg3, arg7);
        class9[] var10 = class106.field2310[arg6];
        if (arg4) {
            return true;
        }
        for (int var11 = 0; var11 < var10.length; var11++) {
            class9 var12 = var10[var11];
            if (var12 != null && var12.field126 == arg2) {
                if (var12.field186 > 0) {
                    class43.method256(-1, var12);
                }
                int var13 = var12.field166 + arg1;
                int var14 = arg5 + var12.field161 - arg8;
                if (var12.field171 == 0) {
                    if (var12.field135 && !client.method113(var11, arg0, -102)) {
                        continue;
                    }
                    if (var12.field153 > var12.field178 - var12.field140) {
                        var12.field153 = var12.field178 - var12.field140;
                    }
                    if (var12.field153 < 0) {
                        var12.field153 = 0;
                    }
                    var9 &= method17(arg0, var13, var11, var12.field174 + var13, false, var14, arg6, var12.field140 + var14, var12.field153);
                    class95.method719(arg1, arg5, arg3, arg7);
                    if (var12.field178 > var12.field140) {
                        class16.method92(var12.field178, var12.field140, 127, var14, var12.field174 + var13, var12.field153);
                    }
                }
                if (var12.field171 != 1) {
                    if (var12.field171 == 2) {
                        int var15 = 0;
                        for (int var16 = 0; var16 < var12.field140; var16++) {
                            for (int var17 = 0; var17 < var12.field174; var17++) {
                                int var18 = (var12.field125 + 32) * var17 + var13;
                                int var19 = (var12.field143 + 32) * var16 + var14;
                                if (var15 < 20) {
                                    var19 += var12.field144[var15];
                                    var18 += var12.field117[var15];
                                }
                                if (var12.field129[var15] > 0) {
                                    int var20 = 0;
                                    int var21 = var12.field129[var15] - 1;
                                    int var22 = 0;
                                    if (class95.field2118 - 32 < var18 && class95.field2120 > var18 && var19 > class95.field2114 - 32 && class95.field2116 > var19 || class57.field1198 != 0 && class72.field1597 == var15) {
                                        int var23 = 0;
                                        if (class76.field1696 == 1 && class35.field703 == var15 && (arg6 << 16) + var11 == class114.field2467) {
                                            var23 = 16777215;
                                        }
                                        class20 var24 = class114.method835(var23, var21, 0, var12.field165[var15]);
                                        if (var24 == null) {
                                            var9 = false;
                                        } else {
                                            if (class57.field1198 != 0 && class72.field1597 == var15 && (arg6 << 16) + var11 == class80.field1823) {
                                                var22 = class74.field1666 - class93.field2022;
                                                var20 = class101.field2193 - class27.field575;
                                                if (var20 < 5 && var20 > -5) {
                                                    var20 = 0;
                                                }
                                                if (var22 < 5 && var22 > -5) {
                                                    var22 = 0;
                                                }
                                                if (class16.field301 < 5) {
                                                    var22 = 0;
                                                    var20 = 0;
                                                }
                                                var24.method137(var18 + var20, var19 - -var22, 128);
                                                if (arg2 != -1) {
                                                    class9 var25 = var10[arg2];
                                                    if (class95.field2114 > var19 + var22 && var25.field153 > 0) {
                                                        int var26 = (class95.field2114 - var19 - var22) * class69.field1534 / 3;
                                                        if (class69.field1534 * 10 < var26) {
                                                            var26 = class69.field1534 * 10;
                                                        }
                                                        if (var25.field153 < var26) {
                                                            var26 = var25.field153;
                                                        }
                                                        var25.field153 -= var26;
                                                        class93.field2022 += var26;
                                                    }
                                                    if (var19 + var22 + 32 > class95.field2116 && var25.field178 - var25.field140 > var25.field153) {
                                                        int var27 = (var19 + var22 + 32 - class95.field2116) * class69.field1534 / 3;
                                                        if (var27 > class69.field1534 * 10) {
                                                            var27 = class69.field1534 * 10;
                                                        }
                                                        if (var27 > var25.field178 - var25.field140 - var25.field153) {
                                                            var27 = var25.field178 - var25.field153 - var25.field140;
                                                        }
                                                        class93.field2022 -= var27;
                                                        var25.field153 += var27;
                                                    }
                                                }
                                            } else if (class93.field2039 != 0 && class49.field1019 == var15 && (arg6 << 16) + var11 == class79.field1792) {
                                                var24.method137(var18, var19, 128);
                                            } else {
                                                var24.method139(var18, var19);
                                            }
                                            if (var24.field434 == 33 || var12.field165[var15] != 1) {
                                                int var28 = var12.field165[var15];
                                                class36.field733.method291(class66.method433(100000, var28), var18 + var20 + 1, var19 - (-10 - var22), 0);
                                                class36.field733.method291(class66.method433(100000, var28), var18 + var20, var19 + 9 + var22, 16776960);
                                            }
                                        }
                                    }
                                } else if (var12.field173 != null && var15 < 20) {
                                    class20 var29 = var12.method51(26899, var15);
                                    if (var29 != null) {
                                        var29.method139(var18, var19);
                                    } else if (class108.field2357) {
                                        var9 = false;
                                    }
                                }
                                var15++;
                            }
                        }
                    } else if (var12.field171 == 3) {
                        int var30;
                        if (class50.method333(-119, var12)) {
                            var30 = var12.field142;
                            if (client.method113(var11, arg0, -102) && var12.field156 != 0) {
                                var30 = var12.field156;
                            }
                        } else {
                            var30 = var12.field181;
                            if (client.method113(var11, arg0, -102) && var12.field128 != 0) {
                                var30 = var12.field128;
                            }
                        }
                        if (var12.field149 == 0) {
                            if (var12.field148) {
                                class95.method728(var13, var14, var12.field174, var12.field140, var30);
                            } else {
                                class95.method717(var13, var14, var12.field174, var12.field140, var30);
                            }
                        } else if (var12.field148) {
                            class95.method718(var13, var14, var12.field174, var12.field140, var30, 256 - (var12.field149 & 0xFF));
                        } else {
                            class95.method723(var13, var14, var12.field174, var12.field140, var30, 256 - (var12.field149 & 0xFF));
                        }
                    } else if (var12.field171 == 4) {
                        class45 var31 = class16.field299[var12.field132];
                        class69 var32 = var12.field137;
                        int var33;
                        if (class50.method333(-115, var12)) {
                            var33 = var12.field142;
                            if (client.method113(var11, arg0, -102) && var12.field156 != 0) {
                                var33 = var12.field156;
                            }
                            if (var12.field169.method487((byte) -115) > 0) {
                                var32 = var12.field169;
                            }
                        } else {
                            var33 = var12.field181;
                            if (client.method113(var11, arg0, -102) && var12.field128 != 0) {
                                var33 = var12.field128;
                            }
                        }
                        if (var12.field154 == 6 && class73.field1639) {
                            var33 = var12.field181;
                            var32 = class67.field1393;
                        }
                        if (class95.field2117 == 479) {
                            if (var33 == 16776960) {
                                var33 = 255;
                            }
                            if (var33 == 49152) {
                                var33 = 16777215;
                            }
                        }
                        class69 var34 = class60.method364(var12, -22098, var32);
                        int var35 = var31.field941 + var14;
                        while (var34.method487((byte) -110) > 0) {
                            int var36 = var34.method473(class104.field2276, 0);
                            class69 var37;
                            if (var36 == -1) {
                                var37 = var34;
                                var34 = class49.field992;
                            } else {
                                var37 = var34.method477(63, var36, 0);
                                var34 = var34.method486(var36 + 2, (byte) -102);
                            }
                            if (var12.field139) {
                                var31.method301(var37, var12.field174 / 2 + var13, var35, var33, var12.field152);
                            } else {
                                var31.method296(var37, var13, var35, var33, var12.field152);
                            }
                            var35 += var31.field941;
                        }
                    } else if (var12.field171 == 5) {
                        class20 var38 = var12.method54(class50.method333(-120, var12), (byte) 79);
                        if (var38 != null) {
                            var38.method139(var13, var14);
                        } else if (class108.field2357) {
                            var9 = false;
                        }
                    } else if (var12.field171 == 6) {
                        class117.method851(var12.field174 / 2 + var13, var12.field140 / 2 + var14);
                        int var39 = class117.field2527[var12.field122] * var12.field141 >> 16;
                        int var40 = class117.field2514[var12.field122] * var12.field141 >> 16;
                        boolean var41 = class50.method333(-125, var12);
                        int var42;
                        if (var41) {
                            var42 = var12.field170;
                        } else {
                            var42 = var12.field130;
                        }
                        class44 var43;
                        if (var12.field146 == 5) {
                            var43 = class94.field2113.method22(-1, (byte) 73, null, null, -1);
                        } else if (var42 == -1) {
                            var43 = var12.method55(-1, null, (byte) 109, class46.field974.field1224, var41);
                            if (var43 == null && class108.field2357) {
                                var9 = false;
                            }
                        } else {
                            class74 var44 = class67.method435(119, var42);
                            var43 = var12.method55(var12.field147, var44, (byte) 109, class46.field974.field1224, var41);
                            if (var43 == null && class108.field2357) {
                                var9 = false;
                            }
                        }
                        if (var43 != null) {
                            var43.method286(0, var12.field175, 0, var12.field122, 0, var39, var40);
                        }
                        class117.method858();
                    } else {
                        if (var12.field171 == 7) {
                            class45 var45 = class16.field299[var12.field132];
                            int var46 = 0;
                            for (int var47 = 0; var47 < var12.field140; var47++) {
                                for (int var48 = 0; var48 < var12.field174; var48++) {
                                    if (var12.field129[var46] > 0) {
                                        class108 var49 = class9.method47(64, var12.field129[var46] - 1);
                                        class69 var50 = var49.field2397;
                                        if (var50 == null) {
                                            var50 = class128.field2747;
                                        }
                                        if (var49.field2363 || var12.field165[var46] != 1) {
                                            var50 = class46.method305(20025, new class69[] { var50, class79.field1797, class64.method410((byte) -30, var12.field165[var46]) });
                                        }
                                        int var51 = (var12.field143 + 12) * var47 + var14;
                                        int var52 = (var12.field125 + 115) * var48 + var13;
                                        if (var12.field139) {
                                            var45.method301(var50, var12.field174 / 2 + var52, var51, var12.field181, var12.field152);
                                        } else {
                                            var45.method296(var50, var52, var51, var12.field181, var12.field152);
                                        }
                                    }
                                    var46++;
                                }
                            }
                        }
                        if (var12.field171 == 8 && class94.method713(arg0, var11, 20) && class36.field723 == 100) {
                            int var53 = 0;
                            class45 var54 = class119.field2552;
                            int var55 = 0;
                            class69 var56 = var12.field137;
                            class69 var57 = class60.method364(var12, -22098, var56);
                            while (var57.method487((byte) -110) > 0) {
                                int var65 = var57.method473(class104.field2276, 0);
                                class69 var66;
                                if (var65 == -1) {
                                    var66 = var57;
                                    var57 = class49.field992;
                                } else {
                                    var66 = var57.method477(63, var65, 0);
                                    var57 = var57.method486(var65 + 2, (byte) -102);
                                }
                                int var67 = var54.method304(var66);
                                if (var67 > var53) {
                                    var53 = var67;
                                }
                                var55 += var54.field941 + 1;
                            }
                            int var58 = var14 + var12.field140 + 5;
                            var53 += 6;
                            int var59 = var13 + var12.field174 - var53 - 5;
                            if (var13 + 5 > var59) {
                                var59 = var13 + 5;
                            }
                            var55 += 7;
                            if (arg3 < var53 + var59) {
                                var59 = arg3 - var53;
                            }
                            if (arg7 < var55 + var58) {
                                var58 = arg7 - var55;
                            }
                            class95.method728(var59, var58, var53, var55, 16777120);
                            class95.method717(var59, var58, var53, var55, 0);
                            class69 var60 = var12.field137;
                            int var61 = var54.field941 + var58 + 2;
                            class69 var62 = class60.method364(var12, -22098, var60);
                            while (var62.method487((byte) -112) > 0) {
                                int var63 = var62.method473(class104.field2276, 0);
                                class69 var64;
                                if (var63 == -1) {
                                    var64 = var62;
                                    var62 = class49.field992;
                                } else {
                                    var64 = var62.method477(63, var63, 0);
                                    var62 = var62.method486(var63 + 2, (byte) -102);
                                }
                                var54.method296(var64, var59 + 3, var61, 0, false);
                                var61 += var54.field941 + 1;
                            }
                        }
                    }
                }
            }
        }
        return var9;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "([IIZ[IZ)V")
    public final void method18(int[] arg0, int arg1, boolean arg2, int[] arg3, boolean arg4) {
        if (!arg2) {
            this.method18(null, -110, true, null, false);
        }
        if (arg3 == null) {
            arg3 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class35.field707; var7++) {
                    class107 var8 = class85.method608(var7, 102);
                    if (var8 != null && !var8.field2339 && var8.field2325 == (arg4 ? 7 : 0) + var6) {
                        arg3[class73.field1637[var6]] = var7 + 256;
                        break;
                    }
                }
            }
        }
        field86++;
        this.field75 = arg0;
        this.field90 = arg1;
        this.field100 = arg3;
        this.field82 = arg4;
        this.method24(false);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZII)V")
    public final void method19(boolean arg0, int arg1, int arg2) {
        field96++;
        int var4 = this.field75[arg1];
        if (arg0) {
            var4++;
            if (var4 >= class70.field1549[arg1].length) {
                var4 = 0;
            }
        } else {
            var4--;
            if (var4 < 0) {
                var4 = class70.field1549[arg1].length - 1;
            }
        }
        this.field75[arg1] = var4;
        this.method24(false);
        if (arg2 < 31) {
            this.method16(95);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)Lhb;")
    public final class44 method20(byte arg0) {
        int var2 = -122 / ((arg0 - 40) / 60);
        field99++;
        if (this.field90 != -1) {
            return class93.method661(9, this.field90).method457(false);
        }
        boolean var3 = false;
        for (int var4 = 0; var4 < 12; var4++) {
            int var13 = this.field100[var4];
            if (var13 >= 256 && var13 < 512 && !class85.method608(var13 - 256, 98).method797(-72)) {
                var3 = true;
            }
            if (var13 >= 512 && !class9.method47(64, var13 - 512).method806(this.field82, (byte) -124)) {
                var3 = true;
            }
        }
        if (var3) {
            return null;
        }
        class44[] var5 = new class44[12];
        int var6 = 0;
        for (int var7 = 0; var7 < 12; var7++) {
            int var10 = this.field100[var7];
            if (var10 >= 256 && var10 < 512) {
                class44 var11 = class85.method608(var10 - 256, -97).method798(-2);
                if (var11 != null) {
                    var5[var6++] = var11;
                }
            }
            if (var10 >= 512) {
                class44 var12 = class9.method47(64, var10 - 512).method817(this.field82, -27185);
                if (var12 != null) {
                    var5[var6++] = var12;
                }
            }
        }
        class44 var8 = new class44(var5, var6);
        for (int var9 = 0; var9 < 5; var9++) {
            if (this.field75[var9] != 0) {
                var8.method287(class70.field1549[var9][0], class70.field1549[var9][this.field75[var9]]);
                if (var9 == 1) {
                    var8.method287(class30.field626[0], class30.field626[this.field75[var9]]);
                }
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V")
    public static final void method21(int arg0) {
        class108.field2343 = null;
        class90.field1952 = null;
        if (arg0 >= -81) {
            method28(-66, -57, null, false, 66, 38, -128, null, 119, -124);
        }
        field88++;
        class114.field2472 = null;
        class80.field1829 = null;
        class91.field1994 = null;
        class63.field1336 = null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IBLmb;Lmb;I)Lhb;")
    public final class44 method22(int arg0, byte arg1, class74 arg2, class74 arg3, int arg4) {
        field79++;
        if (this.field90 != -1) {
            return class93.method661(9, this.field90).method455(arg0, 54, arg2, arg3, arg4);
        }
        long var6 = this.field94;
        int[] var8 = this.field100;
        if (arg3 != null && (arg3.field1654 >= 0 || arg3.field1657 >= 0)) {
            var8 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var8[var9] = this.field100[var9];
            }
            if (arg3.field1654 >= 0) {
                var6 += arg3.field1654 - this.field100[5] << 8;
                var8[5] = arg3.field1654;
            }
            if (arg3.field1657 >= 0) {
                var6 += arg3.field1657 - this.field100[3] << 16;
                var8[3] = arg3.field1657;
            }
        }
        class44 var10 = (class44) class89.field1936.method224(var6, (byte) -39);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var20 = var8[var12];
                if (var20 >= 256 && var20 < 512 && !class85.method608(var20 - 256, -119).method796(-13617)) {
                    var11 = true;
                }
                if (var20 >= 512 && !class9.method47(64, var20 - 512).method802(true, this.field82)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field73 != -1L) {
                    var10 = (class44) class89.field1936.method224(this.field73, (byte) -112);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class44[] var13 = new class44[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var17 = var8[var15];
                    if (var17 >= 256 && var17 < 512) {
                        class44 var18 = class85.method608(var17 - 256, -118).method793((byte) -41);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                    if (var17 >= 512) {
                        class44 var19 = class9.method47(64, var17 - 512).method816(arg1 ^ 0xFFFFFFB6, this.field82);
                        if (var19 != null) {
                            var13[var14++] = var19;
                        }
                    }
                }
                var10 = new class44(var13, var14);
                for (int var16 = 0; var16 < 5; var16++) {
                    if (this.field75[var16] != 0) {
                        var10.method287(class70.field1549[var16][0], class70.field1549[var16][this.field75[var16]]);
                        if (var16 == 1) {
                            var10.method287(class30.field626[0], class30.field626[this.field75[var16]]);
                        }
                    }
                }
                var10.method260();
                var10.method267(64, 850, -30, -50, -30, true);
                class89.field1936.method221(var10, true, var6);
                this.field73 = var6;
            }
        }
        if (arg1 != 73) {
            return null;
        } else if (arg3 == null && arg2 == null) {
            return var10;
        } else {
            class44 var21;
            if (arg3 != null && arg2 != null) {
                var21 = arg3.method526(arg2, arg4, var10, arg0, (byte) -12);
            } else if (arg3 == null) {
                var21 = arg2.method525(arg4, false, var10);
            } else {
                var21 = arg3.method525(arg0, false, var10);
            }
            return var21;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lpd;Z)V")
    public final void method23(class94 arg0, boolean arg1) {
        field93++;
        arg0.method675((byte) -54, this.field82 ? 1 : 0);
        if (arg1) {
            this.method23(null, true);
        }
        for (int var3 = 0; var3 < 7; var3++) {
            int var5 = this.field100[class73.field1637[var3]];
            if (var5 == 0) {
                arg0.method675((byte) -40, -1);
            } else {
                arg0.method675((byte) -55, var5 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method675((byte) -107, this.field75[var4]);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)V")
    private final void method24(boolean arg0) {
        field101++;
        long var2 = this.field94;
        int var4 = this.field100[9];
        int var5 = this.field100[5];
        this.field100[5] = var4;
        this.field100[9] = var5;
        this.field94 = 0L;
        for (int var6 = 0; var6 < 12; var6++) {
            this.field94 <<= 0x4;
            if (this.field100[var6] >= 256) {
                this.field94 += this.field100[var6] - 256;
            }
        }
        if (this.field100[0] >= 256) {
            this.field94 += this.field100[0] - 256 >> 4;
        }
        if (this.field100[1] >= 256) {
            this.field94 += this.field100[1] - 256 >> 8;
        }
        for (int var7 = 0; var7 < 5; var7++) {
            this.field94 <<= 0x3;
            this.field94 += this.field75[var7];
        }
        if (arg0) {
            field76 = 90L;
        }
        this.field94 <<= 0x1;
        this.field94 += this.field82 ? 1 : 0;
        this.field100[5] = var5;
        this.field100[9] = var4;
        if (var2 != 0L && this.field94 != var2) {
            class89.field1936.method223((byte) 88, var2);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IZ)V")
    public final void method25(int arg0, boolean arg1) {
        field98++;
        if (arg0 <= -20 && arg1 != this.field82) {
            this.method18(this.field75, -1, true, null, arg1);
        }
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)V")
    public static final void method26(int arg0) {
        field87++;
        if (arg0 != -500 || class62.field1278 != 1) {
            return;
        }
        if (class127.field2733 >= 6 && class127.field2733 <= 106 && class19.field417 >= 467 && class19.field417 <= 499) {
            class92.field2005 = (class92.field2005 + 1) % 4;
            class87.field1914 = true;
            class35.field709 = true;
            class26.field557.method178(-5, 132);
            class26.field557.method675((byte) -40, class92.field2005);
            class122.field2635++;
            class26.field557.method675((byte) -92, class17.field323);
            class26.field557.method675((byte) -22, class110.field2421);
        }
        if (class127.field2733 >= 135 && class127.field2733 <= 235 && class19.field417 >= 467 && class19.field417 <= 499) {
            class122.field2635++;
            class17.field323 = (class17.field323 + 1) % 3;
            class35.field709 = true;
            class87.field1914 = true;
            class26.field557.method178(arg0 ^ 0x1F7, 132);
            class26.field557.method675((byte) -111, class92.field2005);
            class26.field557.method675((byte) -114, class17.field323);
            class26.field557.method675((byte) -92, class110.field2421);
        }
        if (class127.field2733 >= 273 && class127.field2733 <= 373 && class19.field417 >= 467 && class19.field417 <= 499) {
            class35.field709 = true;
            class122.field2635++;
            class110.field2421 = (class110.field2421 + 1) % 3;
            class87.field1914 = true;
            class26.field557.method178(-5, 132);
            class26.field557.method675((byte) -74, class92.field2005);
            class26.field557.method675((byte) -40, class17.field323);
            class26.field557.method675((byte) -67, class110.field2421);
        }
        if (class127.field2733 < 412 || class127.field2733 > 512 || class19.field417 < 467 || class19.field417 > 499) {
            return;
        }
        if (class53.field1144 != -1) {
            class87.method619(class101.field2202, true, 0, class49.field992);
            return;
        }
        class96.method731(-1);
        if (class71.field1578 != -1) {
            class119.field2553 = class53.field1144 = class71.field1578;
            class49.field1013 = class49.field992;
            class91.field1974 = false;
            return;
        }
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "(I)V")
    public static void method27(int arg0) {
        field81 = null;
        field78 = null;
        field80 = null;
        field83 = null;
        field84 = null;
        field91 = null;
        field97 = null;
        if (arg0 == 9781) {
            field95 = null;
            field77 = null;
            field92 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IILvb;ZIIILwd;II)V")
    public static final void method28(int arg0, int arg1, class122 arg2, boolean arg3, int arg4, int arg5, int arg6, class129 arg7, int arg8, int arg9) {
        field71++;
        int var10 = class22.field451[arg0][arg1 + 1][arg9];
        int var11 = class22.field451[arg0][arg1][arg9];
        int var12 = class22.field451[arg0][arg1 + 1][arg9 + 1];
        if (!arg3) {
            return;
        }
        int var13 = class22.field451[arg0][arg1][arg9 + 1];
        int var14 = arg1 + (arg9 << 7) + (arg4 << 14) + 1073741824;
        class121 var15 = class110.method821(arg4, 724);
        if (var15.field2608 == 0) {
            var14 += Integer.MIN_VALUE;
        }
        int var16 = (arg6 << 6) + arg8;
        if (var15.field2579 == 1) {
            var16 += 256;
        }
        int var17 = var10 + var11 + var12 + var13 >> 2;
        if (arg8 == 22) {
            class26 var18;
            if (var15.field2583 == -1 && var15.field2628 == null) {
                var18 = var15.method884(var13, 22, var11, var10, var12, arg6, 88);
            } else {
                var18 = new class30(arg4, 22, arg6, var11, var10, var12, var13, var15.field2583, true);
            }
            arg7.method986(arg5, arg1, arg9, var17, var18, var14, var16);
            if (var15.field2582 && var15.field2608 == 1) {
                arg2.method908((byte) 13, arg1, arg9);
            }
        } else if (arg8 == 10 || arg8 == 11) {
            class26 var38;
            if (var15.field2583 == -1 && var15.field2628 == null) {
                var38 = var15.method884(var13, 10, var11, var10, var12, arg6, 106);
            } else {
                var38 = new class30(arg4, 10, arg6, var11, var10, var12, var13, var15.field2583, true);
            }
            if (var38 != null) {
                int var39;
                int var40;
                if (arg6 == 1 || arg6 == 3) {
                    var40 = var15.field2575;
                    var39 = var15.field2574;
                } else {
                    var39 = var15.field2575;
                    var40 = var15.field2574;
                }
                int var41 = 0;
                if (arg8 == 11) {
                    var41 += 256;
                }
                arg7.method967(arg5, arg1, arg9, var17, var40, var39, var38, var41, var14, var16);
            }
            if (var15.field2582) {
                arg2.method899(arg1, var15.field2589, var15.field2574, var15.field2575, 4681, arg9, arg6);
            }
        } else if (arg8 >= 12) {
            class26 var19;
            if (var15.field2583 == -1 && var15.field2628 == null) {
                var19 = var15.method884(var13, arg8, var11, var10, var12, arg6, 69);
            } else {
                var19 = new class30(arg4, arg8, arg6, var11, var10, var12, var13, var15.field2583, true);
            }
            arg7.method967(arg5, arg1, arg9, var17, 1, 1, var19, 0, var14, var16);
            if (var15.field2582) {
                arg2.method899(arg1, var15.field2589, var15.field2574, var15.field2575, 4681, arg9, arg6);
            }
        } else if (arg8 == 0) {
            class26 var20;
            if (var15.field2583 == -1 && var15.field2628 == null) {
                var20 = var15.method884(var13, 0, var11, var10, var12, arg6, 77);
            } else {
                var20 = new class30(arg4, 0, arg6, var11, var10, var12, var13, var15.field2583, true);
            }
            arg7.method955(arg5, arg1, arg9, var17, var20, null, class43.field847[arg6], 0, var14, var16);
            if (var15.field2582) {
                arg2.method905(arg9, arg6, arg1, arg8, var15.field2589, -6);
            }
        } else if (arg8 == 1) {
            class26 var21;
            if (var15.field2583 == -1 && var15.field2628 == null) {
                var21 = var15.method884(var13, 1, var11, var10, var12, arg6, 79);
            } else {
                var21 = new class30(arg4, 1, arg6, var11, var10, var12, var13, var15.field2583, true);
            }
            arg7.method955(arg5, arg1, arg9, var17, var21, null, class55.field1166[arg6], 0, var14, var16);
            if (var15.field2582) {
                arg2.method905(arg9, arg6, arg1, arg8, var15.field2589, -8);
            }
        } else if (arg8 == 2) {
            int var22 = arg6 + 1 & 0x3;
            class26 var23;
            class26 var24;
            if (var15.field2583 == -1 && var15.field2628 == null) {
                var23 = var15.method884(var13, 2, var11, var10, var12, arg6 + 4, 126);
                var24 = var15.method884(var13, 2, var11, var10, var12, var22, 124);
            } else {
                var23 = new class30(arg4, 2, arg6 + 4, var11, var10, var12, var13, var15.field2583, true);
                var24 = new class30(arg4, 2, var22, var11, var10, var12, var13, var15.field2583, true);
            }
            arg7.method955(arg5, arg1, arg9, var17, var23, var24, class43.field847[arg6], class43.field847[var22], var14, var16);
            if (var15.field2582) {
                arg2.method905(arg9, arg6, arg1, arg8, var15.field2589, -126);
            }
        } else if (arg8 == 3) {
            class26 var25;
            if (var15.field2583 == -1 && var15.field2628 == null) {
                var25 = var15.method884(var13, 3, var11, var10, var12, arg6, 78);
            } else {
                var25 = new class30(arg4, 3, arg6, var11, var10, var12, var13, var15.field2583, true);
            }
            arg7.method955(arg5, arg1, arg9, var17, var25, null, class55.field1166[arg6], 0, var14, var16);
            if (var15.field2582) {
                arg2.method905(arg9, arg6, arg1, arg8, var15.field2589, 25);
            }
        } else if (arg8 == 9) {
            class26 var26;
            if (var15.field2583 == -1 && var15.field2628 == null) {
                var26 = var15.method884(var13, arg8, var11, var10, var12, arg6, 86);
            } else {
                var26 = new class30(arg4, arg8, arg6, var11, var10, var12, var13, var15.field2583, true);
            }
            arg7.method967(arg5, arg1, arg9, var17, 1, 1, var26, 0, var14, var16);
            if (var15.field2582) {
                arg2.method899(arg1, var15.field2589, var15.field2574, var15.field2575, 4681, arg9, arg6);
            }
        } else {
            if (var15.field2618) {
                if (arg6 == 1) {
                    int var27 = var13;
                    var13 = var12;
                    var12 = var10;
                    var10 = var11;
                    var11 = var27;
                } else if (arg6 == 2) {
                    int var28 = var13;
                    var13 = var10;
                    var10 = var28;
                    int var29 = var12;
                    var12 = var11;
                    var11 = var29;
                } else if (arg6 == 3) {
                    int var30 = var13;
                    var13 = var11;
                    var11 = var10;
                    var10 = var12;
                    var12 = var30;
                }
            }
            if (arg8 == 4) {
                class26 var31;
                if (var15.field2583 == -1 && var15.field2628 == null) {
                    var31 = var15.method884(var13, 4, var11, var10, var12, 0, 108);
                } else {
                    var31 = new class30(arg4, 4, 0, var11, var10, var12, var13, var15.field2583, true);
                }
                arg7.method993(arg5, arg1, arg9, var17, var31, class43.field847[arg6], arg6 * 512, 0, 0, var14, var16);
            } else if (arg8 == 5) {
                int var32 = 16;
                int var33 = arg7.method945(arg5, arg1, arg9);
                if (var33 > 0) {
                    var32 = class110.method821(var33 >> 14 & 0x7FFF, 724).field2606;
                }
                class26 var34;
                if (var15.field2583 == -1 && var15.field2628 == null) {
                    var34 = var15.method884(var13, 4, var11, var10, var12, 0, 58);
                } else {
                    var34 = new class30(arg4, 4, 0, var11, var10, var12, var13, var15.field2583, true);
                }
                arg7.method993(arg5, arg1, arg9, var17, var34, class43.field847[arg6], arg6 * 512, class91.field1980[arg6] * var32, class50.field1038[arg6] * var32, var14, var16);
            } else if (arg8 == 6) {
                class26 var35;
                if (var15.field2583 == -1 && var15.field2628 == null) {
                    var35 = var15.method884(var13, 4, var11, var10, var12, 0, 59);
                } else {
                    var35 = new class30(arg4, 4, 0, var11, var10, var12, var13, var15.field2583, true);
                }
                arg7.method993(arg5, arg1, arg9, var17, var35, 256, arg6, 0, 0, var14, var16);
            } else if (arg8 == 7) {
                class26 var36;
                if (var15.field2583 == -1 && var15.field2628 == null) {
                    var36 = var15.method884(var13, 4, var11, var10, var12, 0, 63);
                } else {
                    var36 = new class30(arg4, 4, 0, var11, var10, var12, var13, var15.field2583, true);
                }
                arg7.method993(arg5, arg1, arg9, var17, var36, 512, arg6, 0, 0, var14, var16);
            } else if (arg8 == 8) {
                class26 var37;
                if (var15.field2583 == -1 && var15.field2628 == null) {
                    var37 = var15.method884(var13, 4, var11, var10, var12, 0, 51);
                } else {
                    var37 = new class30(arg4, 4, 0, var11, var10, var12, var13, var15.field2583, true);
                }
                arg7.method993(arg5, arg1, arg9, var17, var37, 768, arg6, 0, 0, var14, var16);
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZIZ)V")
    public final void method29(boolean arg0, int arg1, boolean arg2) {
        field74++;
        if (arg1 == 1 && this.field82) {
            return;
        }
        int var4 = this.field100[class73.field1637[arg1]];
        if (var4 == 0) {
            return;
        }
        var4 -= 256;
        class107 var5;
        do {
            if (arg2) {
                var4++;
                if (var4 >= class35.field707) {
                    var4 = 0;
                }
            } else {
                var4--;
                if (var4 < 0) {
                    var4 = class35.field707 - 1;
                }
            }
            var5 = class85.method608(var4, -120);
        } while (var5 == null || var5.field2339 || (this.field82 ? 7 : 0) + arg1 != var5.field2325);
        this.field100[class73.field1637[arg1]] = var4 + 256;
        this.method24(!arg0);
        if (!arg0) {
            field84 = null;
        }
    }
}
