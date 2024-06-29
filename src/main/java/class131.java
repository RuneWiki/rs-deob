import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class131 {

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "I")
    public int field2173;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2169 = "Use";

    @OriginalMember(owner = "client!ca", name = "r", descriptor = "I")
    public static int field2181 = 0;

    @OriginalMember(owner = "client!ca", name = "t", descriptor = "I")
    public static int field2183 = 0;

    @OriginalMember(owner = "client!ca", name = "u", descriptor = "I")
    public static int field2184 = 0;

    @OriginalMember(owner = "client!ca", name = "x", descriptor = "Lre;")
    public static class266 field2187 = new class266();

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
    public int field2167;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!ca", name = "q", descriptor = "I")
    public int field2180;

    @OriginalMember(owner = "client!ca", name = "s", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!ca", name = "y", descriptor = "I")
    public int field2188;

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "Lsb;")
    public static class124 field2177;

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "Lsg;")
    public class181 field2175;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "[I")
    public int[] field2165;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "[I")
    public int[] field2166;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "[I")
    public int[] field2170;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "[I")
    public int[] field2172;

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "[I")
    public int[] field2174;

    @OriginalMember(owner = "client!ca", name = "v", descriptor = "[I")
    public int[] field2185;

    @OriginalMember(owner = "client!ca", name = "w", descriptor = "[Lsg;")
    public class181[] field2186;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "[[I")
    public int[][] field2171;

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "[[I")
    public int[][] field2176;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "([BI)V")
    private final void method945(byte[] arg0, int arg1) {
        field2168++;
        class136 var3 = new class136(class273.method1849(-128, arg0));
        int var4 = var3.method1012(4);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field2167 = var3.method1022(115);
        } else {
            this.field2167 = 0;
        }
        int var5 = var3.method1012(4);
        this.field2188 = var3.method996(65280);
        int var6 = 0;
        this.field2170 = new int[this.field2188];
        int var7 = -1;
        for (int var8 = 0; var8 < this.field2188; var8++) {
            this.field2170[var8] = var6 += var3.method996(65280);
            if (this.field2170[var8] > var7) {
                var7 = this.field2170[var8];
            }
        }
        this.field2180 = var7 + 1;
        this.field2174 = new int[this.field2180];
        if (arg1 != -30460) {
            return;
        }
        this.field2166 = new int[this.field2180];
        this.field2185 = new int[this.field2180];
        this.field2176 = new int[this.field2180][];
        this.field2172 = new int[this.field2180];
        if (var5 != 0) {
            this.field2165 = new int[this.field2180];
            for (int var9 = 0; var9 < this.field2180; var9++) {
                this.field2165[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field2188; var10++) {
                this.field2165[this.field2170[var10]] = var3.method1022(-108);
            }
            this.field2175 = new class181(this.field2165);
        }
        for (int var11 = 0; var11 < this.field2188; var11++) {
            this.field2172[this.field2170[var11]] = var3.method1022(93);
        }
        for (int var12 = 0; var12 < this.field2188; var12++) {
            this.field2166[this.field2170[var12]] = var3.method1022(102);
        }
        for (int var13 = 0; var13 < this.field2188; var13++) {
            this.field2185[this.field2170[var13]] = var3.method996(arg1 + 95740);
        }
        for (int var14 = 0; var14 < this.field2188; var14++) {
            int var21 = 0;
            int var22 = this.field2170[var14];
            int var23 = this.field2185[var22];
            this.field2176[var22] = new int[var23];
            int var24 = -1;
            for (int var25 = 0; var25 < var23; var25++) {
                int var26 = this.field2176[var22][var25] = var21 += var3.method996(65280);
                if (var26 > var24) {
                    var24 = var26;
                }
            }
            this.field2174[var22] = var24 + 1;
            if (var24 + 1 == var23) {
                this.field2176[var22] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field2171 = new int[var7 + 1][];
        this.field2186 = new class181[var7 + 1];
        for (int var15 = 0; var15 < this.field2188; var15++) {
            int var16 = this.field2170[var15];
            int var17 = this.field2185[var16];
            this.field2171[var16] = new int[this.field2174[var16]];
            for (int var18 = 0; var18 < this.field2174[var16]; var18++) {
                this.field2171[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field2176[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field2176[var16][var19];
                }
                this.field2171[var16][var20] = var3.method1022(-41);
            }
            this.field2186[var16] = new class181(this.field2171[var16]);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
    public static final void method946(int arg0) {
        field2179++;
        if (arg0 != 3468) {
            field2183 = 104;
        }
        class184.field3034.method1157(760);
        class273.field4354.method1157(760);
        class110.field1691.method1157(760);
        class248.field3963.method1157(760);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method947(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2178++;
        int var10 = 13 / ((arg8 + 39) / 59);
        class110 var11 = null;
        for (class110 var12 = (class110) class189.field3082.method1807(-114); var12 != null; var12 = (class110) class189.field3082.method1808((byte) 54)) {
            if (var12.field1700 == arg7 && var12.field1688 == arg1 && var12.field1705 == arg3 && var12.field1699 == arg4) {
                var11 = var12;
                break;
            }
        }
        if (var11 == null) {
            var11 = new class110();
            var11.field1705 = arg3;
            var11.field1699 = arg4;
            var11.field1700 = arg7;
            var11.field1688 = arg1;
            class279.method1876(var11, true);
            class189.field3082.method1809(5, var11);
        }
        var11.field1706 = arg6;
        var11.field1698 = arg5;
        var11.field1692 = arg2;
        var11.field1686 = arg9;
        var11.field1693 = arg0;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V")
    public static final void method948(byte arg0) {
        field2164++;
        if (class18.field263 > 1) {
            class263.field4167 = class61.field1040;
            class18.field263--;
        }
        if (class292.field4637 > 0) {
            class292.field4637--;
        }
        if (class48.field881) {
            class48.field881 = false;
            class167.method1204(true);
            return;
        }
        for (int var1 = 0; var1 < 100 && class146.method1078((byte) -119); var1++) {
        }
        if (class146.field2401 != 30) {
            return;
        }
        class153.method1107(class87.field1405, 173, 54);
        Object var2 = class59.field1013.field3355;
        synchronized (class59.field1013.field3355) {
            if (!class149.field2443) {
                class59.field1013.field3362 = 0;
            } else if (class230.field3666 != 0 || class59.field1013.field3362 >= 40) {
                class87.field1405.method607(207, (byte) 91);
                class139.field2325++;
                class87.field1405.method966((byte) 98, 0);
                int var3 = 0;
                int var4 = class87.field1405.field2231;
                for (int var5 = 0; var5 < class59.field1013.field3362 && (class87.field1405.field2231 - var4) < 240; var5++) {
                    var3++;
                    int var6 = class59.field1013.field3364[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    int var7 = class59.field1013.field3363[var5];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 65534) {
                        var7 = 65534;
                    }
                    boolean var8 = false;
                    if (class59.field1013.field3363[var5] == -1 && class59.field1013.field3364[var5] == -1) {
                        var7 = -1;
                        var6 = -1;
                        var8 = true;
                    }
                    if (class268.field4302 != var6 || class179.field2980 != var7) {
                        int var9 = var7 - class179.field2980;
                        int var10 = var6 - class268.field4302;
                        class268.field4302 = var6;
                        class179.field2980 = var7;
                        if (class160.field2609 < 8 && var10 >= -32 && var10 <= 31 && var9 >= -32 && var9 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            class87.field1405.method971(3792, (class160.field2609 << 12) + (var10 << 6) + var9);
                            class160.field2609 = 0;
                        } else if (class160.field2609 < 32 && var10 >= -128 && var10 <= 127 && var9 >= -128 && var9 <= 127) {
                            var10 += 128;
                            class87.field1405.method966((byte) 126, class160.field2609 + 128);
                            var9 += 128;
                            class87.field1405.method971(3792, (var10 << 8) + var9);
                            class160.field2609 = 0;
                        } else if (class160.field2609 < 32) {
                            class87.field1405.method966((byte) 65, class160.field2609 + 192);
                            if (var8) {
                                class87.field1405.method1029(Integer.MIN_VALUE, 15430);
                            } else {
                                class87.field1405.method1029(var6 | var7 << 16, 15430);
                            }
                            class160.field2609 = 0;
                        } else {
                            class87.field1405.method971(3792, class160.field2609 + 57344);
                            if (var8) {
                                class87.field1405.method1029(Integer.MIN_VALUE, 15430);
                            } else {
                                class87.field1405.method1029(var6 | var7 << 16, 15430);
                            }
                            class160.field2609 = 0;
                        }
                    } else if (class160.field2609 < 2047) {
                        class160.field2609++;
                    }
                }
                class87.field1405.method1024(class87.field1405.field2231 - var4, (byte) 9);
                if (var3 >= class59.field1013.field3362) {
                    class59.field1013.field3362 = 0;
                } else {
                    class59.field1013.field3362 -= var3;
                    for (int var11 = 0; var11 < class59.field1013.field3362; var11++) {
                        class59.field1013.field3364[var11] = class59.field1013.field3364[var3 + var11];
                        class59.field1013.field3363[var11] = class59.field1013.field3363[var3 + var11];
                    }
                }
            }
        }
        if (class230.field3666 != 0) {
            class297.field4701++;
            long var12 = (class13.field174 - class37.field628) / 50L;
            class37.field628 = class13.field174;
            int var14 = class111.field1707;
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            byte var15 = 0;
            if (var12 > 32767L) {
                var12 = 32767L;
            }
            if (class230.field3666 == 2) {
                var15 = 1;
            }
            int var16 = (int) var12;
            int var17 = class269.field4320;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 65535) {
                var17 = 65535;
            }
            class87.field1405.method607(212, (byte) 94);
            class87.field1405.method971(3792, var16 | var15 << 15);
            class87.field1405.method984(1, var17 | var14 << 16);
        }
        if (class227.field3612 > 0) {
            class227.field3612--;
        }
        if (class10.field141 && class227.field3612 <= 0) {
            class10.field141 = false;
            class227.field3612 = 20;
            class163.field2656++;
            class87.field1405.method607(172, (byte) 82);
            class87.field1405.method971(3792, (int) class1.field1);
            class87.field1405.method1017((byte) 8, (int) class161.field2619);
        }
        if (class228.field3626 && !class60.field1022) {
            class29.field505++;
            class60.field1022 = true;
            class87.field1405.method607(152, (byte) 75);
            class87.field1405.method966((byte) 124, 1);
        }
        if (!class228.field3626 && class60.field1022) {
            class60.field1022 = false;
            class87.field1405.method607(152, (byte) 100);
            class29.field505++;
            class87.field1405.method966((byte) 64, 0);
        }
        if (!class251.field3994) {
            class87.field1405.method607(153, (byte) 95);
            class266.field4252++;
            class87.field1405.method973(1111986640, class296.method1983((byte) -61));
            class251.field3994 = true;
        }
        if (class107.field1630) {
            class107.field1630 = false;
        } else {
            class290.field4630 /= 2.0F;
        }
        if (class156.field2546) {
            class156.field2546 = false;
        } else {
            class296.field4687 /= 2.0F;
        }
        class241.method1594(1);
        if (class146.field2401 != 30) {
            return;
        }
        class152.method1102(-120);
        class91.method693((byte) -122);
        class11.method71((byte) -73);
        class59.field1020++;
        if (class59.field1020 > 750) {
            class167.method1204(true);
            return;
        }
        class19.method157(-1);
        class85.method677(1322986288);
        class271.method1845(73);
        if (class288.field4603 != null) {
            class49.method420((byte) -128);
        }
        for (int var18 = class266.method1812((byte) 65, true); var18 != -1; var18 = class266.method1812((byte) 49, false)) {
            class10.method61(true, var18);
            class291.field4634[class64.method498(31, class36.field612++)] = var18;
        }
        for (class23 var19 = class242.method1605((byte) 38); var19 != null; var19 = class242.method1605((byte) 38)) {
            int var20 = var19.method191(78);
            int var21 = var19.method184((byte) 115);
            if (var20 == 1) {
                class43.field782[var21] = var19.field361;
                class254.field4046[class64.method498(class80.field1328++, 31)] = var21;
            } else if (var20 == 2) {
                class91.field1437[var21] = var19.field354;
                class283.field4496[class64.method498(31, class167.field2749++)] = var21;
            } else if (var20 == 3) {
                class114 var42 = class8.method43(var21, (byte) 36);
                if (!var19.field354.equals(var42.field1800)) {
                    var42.field1800 = var19.field354;
                    class72.method556(0, var42);
                }
            } else if (var20 == 4) {
                class114 var38 = class8.method43(var21, (byte) 68);
                int var39 = var19.field361;
                int var40 = var19.field349;
                int var41 = var19.field346;
                if (var38.field1892 != var39 || var38.field1931 != var40 || var38.field1869 != var41) {
                    var38.field1869 = var41;
                    var38.field1931 = var40;
                    var38.field1892 = var39;
                    class72.method556(0, var38);
                }
            } else if (var20 == 5) {
                class114 var22 = class8.method43(var21, (byte) 115);
                if (var19.field361 != var22.field1816 || var19.field361 == -1) {
                    var22.field1912 = 1;
                    var22.field1816 = var19.field361;
                    var22.field1819 = 0;
                    var22.field1825 = 0;
                    class72.method556(0, var22);
                }
            } else if (var20 == 6) {
                int var23 = var19.field361;
                int var24 = var23 >> 5 & 0x1F;
                int var25 = var23 & 0x1F;
                class114 var26 = class8.method43(var21, (byte) 49);
                int var27 = (var23 & 0x7F45) >> 10;
                int var28 = (var27 << 19) + ((var24 << 11) + (var25 << 3));
                if (var26.field1843 != var28) {
                    var26.field1843 = var28;
                    class72.method556(0, var26);
                }
            } else if (var20 == 7) {
                class114 var36 = class8.method43(var21, (byte) -117);
                boolean var37 = var19.field361 == 1;
                if (var37 != var36.field1885) {
                    var36.field1885 = var37;
                    class72.method556(0, var36);
                }
            } else if (var20 == 8) {
                class114 var35 = class8.method43(var21, (byte) 47);
                if (var19.field361 != var35.field1863 || var19.field349 != var35.field1756 || var19.field346 != var35.field1868) {
                    var35.field1868 = var19.field346;
                    if (var35.field1920 != -1) {
                        if (var35.field1909 > 0) {
                            var35.field1868 = var35.field1868 * 32 / var35.field1909;
                        } else if (var35.field1752 > 0) {
                            var35.field1868 = var35.field1868 * 32 / var35.field1752;
                        }
                    }
                    var35.field1863 = var19.field361;
                    var35.field1756 = var19.field349;
                    class72.method556(0, var35);
                }
            } else if (var20 == 9) {
                class114 var34 = class8.method43(var21, (byte) 120);
                if (var19.field361 != var34.field1920 || var19.field349 != var34.field1796) {
                    var34.field1796 = var19.field349;
                    var34.field1920 = var19.field361;
                    class72.method556(0, var34);
                }
            } else if (var20 == 10) {
                class114 var33 = class8.method43(var21, (byte) -112);
                if (var19.field361 != var33.field1858 || var19.field349 != var33.field1899 || var19.field346 != var33.field1823) {
                    var33.field1899 = var19.field349;
                    var33.field1823 = var19.field346;
                    var33.field1858 = var19.field361;
                    class72.method556(0, var33);
                }
            } else if (var20 == 11) {
                class114 var32 = class8.method43(var21, (byte) 107);
                var32.field1875 = var32.field1830 = var19.field349;
                var32.field1779 = var32.field1810 = var19.field361;
                var32.field1770 = 0;
                var32.field1778 = 0;
                class72.method556(0, var32);
            } else if (var20 == 12) {
                class114 var30 = class8.method43(var21, (byte) 80);
                int var31 = var19.field361;
                if (var30 != null && var30.field1898 == 0) {
                    if (var31 > (var30.field1807 - var30.field1919)) {
                        var31 = var30.field1807 - var30.field1919;
                    }
                    if (var31 < 0) {
                        var31 = 0;
                    }
                    if (var30.field1842 != var31) {
                        var30.field1842 = var31;
                        class72.method556(0, var30);
                    }
                }
            } else if (var20 == 13) {
                class114 var29 = class8.method43(var21, (byte) -90);
                var29.field1930 = var19.field361;
            }
        }
        if (class34.field574 != 0) {
            class180.field3000 += 20;
            if (class180.field3000 >= 400) {
                class34.field574 = 0;
            }
        }
        class232.field3681++;
        if (class135.field2223 != null) {
            class274.field4373++;
            if (class274.field4373 >= 15) {
                class72.method556(0, class135.field2223);
                class135.field2223 = null;
            }
        }
        if (class174.field2929 != null) {
            class72.method556(0, class174.field2929);
            if (class269.field4311 > (class185.field3043 + 5) || class269.field4311 < class185.field3043 - 5 || class165.field2719 > class208.field3340 + 5 || class165.field2719 < class208.field3340 - 5) {
                class160.field2600 = true;
            }
            class104.field1591++;
            if (class216.field3469 == 0) {
                if (class160.field2600 && class104.field1591 >= 5) {
                    if (class206.field3309 == class174.field2929 && class66.field1089 != class152.field2487) {
                        class49.field895++;
                        byte var43 = 0;
                        class114 var44 = class174.field2929;
                        if (class72.field1197 == 1 && var44.field1929 == 206) {
                            var43 = 1;
                        }
                        if (var44.field1785[class152.field2487] <= 0) {
                            var43 = 0;
                        }
                        if (client.method1916(var44).method1684(1)) {
                            int var45 = class66.field1089;
                            int var46 = class152.field2487;
                            var44.field1785[var46] = var44.field1785[var45];
                            var44.field1777[var46] = var44.field1777[var45];
                            var44.field1785[var45] = -1;
                            var44.field1777[var45] = 0;
                        } else if (var43 == 1) {
                            int var47 = class66.field1089;
                            int var48 = class152.field2487;
                            while (var47 != var48) {
                                if (var47 > var48) {
                                    var44.method844(-15202, var47, var47 - 1);
                                    var47--;
                                } else if (var47 < var48) {
                                    var44.method844(-15202, var47, var47 + 1);
                                    var47++;
                                }
                            }
                        } else {
                            var44.method844(-15202, class66.field1089, class152.field2487);
                        }
                        class87.field1405.method607(182, (byte) 96);
                        class87.field1405.method1026(107, class174.field2929.field1789);
                        class87.field1405.method1021(var43, (byte) -116);
                        class87.field1405.method995(class152.field2487, -22205);
                        class87.field1405.method968((byte) 85, class66.field1089);
                    }
                } else if ((field2183 == 1 || class170.method1215((byte) 17, class42.field776 - 1)) && class42.field776 > 2) {
                    class270.method1837(82);
                } else if (class42.field776 > 0) {
                    class89.method689(0);
                }
                class274.field4373 = 10;
                class174.field2929 = null;
                class230.field3666 = 0;
            }
        }
        class279.field4437 = false;
        class114.field1882 = null;
        class114 var49 = class89.field1424;
        class140.field2337 = false;
        class114 var50 = class216.field3472;
        class216.field3472 = null;
        class89.field1424 = null;
        for (class232.field3672 = 0; class174.method1249((byte) 78) && class232.field3672 < 128; class232.field3672++) {
            class113.field1737[class232.field3672] = class278.field4413;
            class165.field2708[class232.field3672] = class216.field3457;
        }
        class288.field4603 = null;
        if (class223.field3558 != -1) {
            class26.method237(class223.field3558, 0, class33.field557, 0, 0, 0, (byte) 52, class137.field2301);
        }
        class61.field1040++;
        while (true) {
            class196 var51;
            class114 var52;
            class114 var53;
            do {
                var51 = (class196) class12.field165.method1811(-26875);
                if (var51 == null) {
                    while (true) {
                        class196 var54;
                        class114 var55;
                        class114 var56;
                        do {
                            var54 = (class196) class262.field4157.method1811(-26875);
                            if (var54 == null) {
                                while (true) {
                                    class196 var57;
                                    class114 var58;
                                    class114 var59;
                                    do {
                                        var57 = (class196) field2187.method1811(-26875);
                                        if (var57 == null) {
                                            if (class288.field4603 == null) {
                                                class206.field3310 = 0;
                                            }
                                            if (class23.field365 != null) {
                                                class235.method1558(100);
                                            }
                                            if (class58.field1012 > 0 && class13.field184[82] && class13.field184[81] && class208.field3351 != 0) {
                                                int var60 = class92.field1448 - class208.field3351;
                                                if (var60 < 0) {
                                                    var60 = 0;
                                                } else if (var60 > 3) {
                                                    var60 = 3;
                                                }
                                                class209.method1393(class170.field2787 + class48.field878.field2813[0], var60, class48.field878.field2844[0] + class256.field4082, -25174);
                                            }
                                            if (class58.field1012 > 0 && class13.field184[82] && class13.field184[81]) {
                                                if (class279.field4421 != -1) {
                                                    class209.method1393(class287.field4586 + class170.field2787, class92.field1448, class279.field4421 + class256.field4082, -25174);
                                                }
                                                class85.field1393 = 0;
                                                class171.field2862 = 0;
                                            } else if (class171.field2862 == 2) {
                                                if (class279.field4421 != -1) {
                                                    class87.field1405.method607(79, (byte) 82);
                                                    class87.field1405.method968((byte) 85, class7.field90);
                                                    class87.field1405.method971(3792, class279.field4421 + class256.field4082);
                                                    class187.field3059++;
                                                    class87.field1405.method971(3792, class170.field2787 + class287.field4586);
                                                    class87.field1405.method973(1111986640, class33.field550);
                                                    class124.field2075 = class269.field4320;
                                                    class33.field554 = class111.field1707;
                                                    class34.field574 = 1;
                                                    class180.field3000 = 0;
                                                }
                                                class171.field2862 = 0;
                                            } else if (class85.field1393 == 2) {
                                                if (class279.field4421 != -1) {
                                                    class87.field1405.method607(136, (byte) 83);
                                                    class118.field1986++;
                                                    class87.field1405.method1017((byte) -7, class256.field4082 + class279.field4421);
                                                    class87.field1405.method971(3792, class287.field4586 + class170.field2787);
                                                    class34.field574 = 1;
                                                    class124.field2075 = class269.field4320;
                                                    class180.field3000 = 0;
                                                    class33.field554 = class111.field1707;
                                                }
                                                class85.field1393 = 0;
                                            } else if (class279.field4421 != -1 && class171.field2862 == 0 && class85.field1393 == 0) {
                                                class262.method1763(-22686, 0, (class279.field4421 << 1) + 1 - class48.field878.method1226((byte) -94) >> 1, (class287.field4586 << 1) + 1 - class48.field878.method1226((byte) -116) >> 1);
                                                class34.field574 = 1;
                                                class33.field554 = class111.field1707;
                                                class124.field2075 = class269.field4320;
                                                class180.field3000 = 0;
                                            }
                                            class279.field4421 = -1;
                                            class141.method1048(117);
                                            if (class89.field1424 != var49) {
                                                if (var49 != null) {
                                                    class72.method556(0, var49);
                                                }
                                                if (class89.field1424 != null) {
                                                    class72.method556(0, class89.field1424);
                                                }
                                            }
                                            if (class216.field3472 != var50 && class227.field3613 == class198.field3227) {
                                                if (var50 != null) {
                                                    class72.method556(0, var50);
                                                }
                                                if (class216.field3472 != null) {
                                                    class72.method556(0, class216.field3472);
                                                }
                                            }
                                            if (class216.field3472 == null) {
                                                if (class198.field3227 > 0) {
                                                    class198.field3227--;
                                                }
                                            } else if (class198.field3227 < class227.field3613) {
                                                class198.field3227++;
                                                if (class227.field3613 == class198.field3227) {
                                                    class72.method556(0, class216.field3472);
                                                }
                                            }
                                            for (int var61 = 0; var61 < 5; var61++) {
                                                int var10002 = class196.field3209[var61]++;
                                            }
                                            int var62 = class255.method1709((byte) -27);
                                            int var63 = class14.method97(3085);
                                            if (var62 > 15000 && var63 > 15000) {
                                                class234.field3703++;
                                                class292.field4637 = 250;
                                                class263.method1773(14500, 22);
                                                class87.field1405.method607(94, (byte) 127);
                                            }
                                            if (class160.field2598 != null && class160.field2598.field1937 == 1) {
                                                if (class160.field2598.field1936 != null) {
                                                    class128.method934(class206.field3312, class176.field2944, (byte) 33);
                                                }
                                                class176.field2944 = null;
                                                class206.field3312 = false;
                                                class160.field2598 = null;
                                            }
                                            class3.field44++;
                                            if (arg0 >= -86) {
                                                return;
                                            }
                                            class212.field3391++;
                                            class198.field3229++;
                                            if (class3.field44 > 500) {
                                                class3.field44 = 0;
                                                int var64 = (int) (Math.random() * 8.0D);
                                                if ((var64 & 0x2) == 2) {
                                                    class27.field465 += class4.field46;
                                                }
                                                if ((var64 & 0x4) == 4) {
                                                    class180.field3001 += class287.field4597;
                                                }
                                                if ((var64 & 0x1) == 1) {
                                                    class288.field4606 += class19.field291;
                                                }
                                            }
                                            if (class27.field465 < -55) {
                                                class4.field46 = 2;
                                            }
                                            if (class27.field465 > 55) {
                                                class4.field46 = -2;
                                            }
                                            if (class288.field4606 < -50) {
                                                class19.field291 = 2;
                                            }
                                            if (class180.field3001 < -40) {
                                                class287.field4597 = 1;
                                            }
                                            if (class180.field3001 > 40) {
                                                class287.field4597 = -1;
                                            }
                                            if (class288.field4606 > 50) {
                                                class19.field291 = -2;
                                            }
                                            if (class212.field3391 > 500) {
                                                class212.field3391 = 0;
                                                int var65 = (int) (Math.random() * 8.0D);
                                                if ((var65 & 0x2) == 2) {
                                                    field2184 += class157.field2559;
                                                }
                                                if ((var65 & 0x1) == 1) {
                                                    class183.field3022 += class260.field4133;
                                                }
                                            }
                                            if (field2184 < -20) {
                                                class157.field2559 = 1;
                                            }
                                            if (class183.field3022 < -60) {
                                                class260.field4133 = 2;
                                            }
                                            if (field2184 > 10) {
                                                class157.field2559 = -1;
                                            }
                                            if (class183.field3022 > 60) {
                                                class260.field4133 = -2;
                                            }
                                            if (class198.field3229 > 50) {
                                                class87.field1405.method607(242, (byte) 68);
                                                class118.field1995++;
                                            }
                                            if (class148.field2428) {
                                                class4.method22(-92);
                                                class148.field2428 = false;
                                            }
                                            try {
                                                if (class23.field360 != null && class87.field1405.field2231 > 0) {
                                                    class23.field360.method301(class87.field1405.field2231, 0, class87.field1405.field2263, (byte) -111);
                                                    class198.field3229 = 0;
                                                    class87.field1405.field2231 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var66) {
                                                class167.method1204(true);
                                                return;
                                            }
                                        }
                                        var58 = var57.field3213;
                                        if (var58.field1916 < 0) {
                                            break;
                                        }
                                        var59 = class8.method43(var58.field1910, (byte) 25);
                                    } while (var59 == null || var59.field1820 == null || var58.field1916 >= var59.field1820.length || var59.field1820[var58.field1916] != var58);
                                    class129.method938(78, var57);
                                }
                            }
                            var55 = var54.field3213;
                            if (var55.field1916 < 0) {
                                break;
                            }
                            var56 = class8.method43(var55.field1910, (byte) 110);
                        } while (var56 == null || var56.field1820 == null || var56.field1820.length <= var55.field1916 || var56.field1820[var55.field1916] != var55);
                        class129.method938(90, var54);
                    }
                }
                var52 = var51.field3213;
                if (var52.field1916 < 0) {
                    break;
                }
                var53 = class8.method43(var52.field1910, (byte) 104);
            } while (var53 == null || var53.field1820 == null || var53.field1820.length <= var52.field1916 || var53.field1820[var52.field1916] != var52);
            class129.method938(73, var51);
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(B)V")
    public static void method949(byte arg0) {
        field2177 = null;
        if (arg0 == -19) {
            field2187 = null;
            field2169 = null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "([BI)V")
    public class131(byte[] arg0, int arg1) {
        this.field2173 = class6.method28(arg0, false, arg0.length);
        if (this.field2173 != arg1) {
            throw new RuntimeException();
        }
        this.method945(arg0, -30460);
    }
}
