import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class307 {

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "I")
    public static int field5139 = 0;

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "[I")
    public static int[] field5146 = new int[50];

    @OriginalMember(owner = "client!cj", name = "s", descriptor = "Lqd;")
    public static class40 field5156 = class147.method1106("Eingabeprozedur geladen)3", (byte) -60);

    @OriginalMember(owner = "client!cj", name = "u", descriptor = "Lqd;")
    private static class40 field5158 = class147.method1106("K", (byte) -117);

    @OriginalMember(owner = "client!cj", name = "o", descriptor = "Lqd;")
    public static class40 field5152 = class147.method1106(" <col=ffff00>", (byte) -73);

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "Lqd;")
    public static class40 field5138 = field5158;

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "Lqd;")
    public static class40 field5145 = class147.method1106("", (byte) -98);

    @OriginalMember(owner = "client!cj", name = "v", descriptor = "Lqd;")
    public static class40 field5159 = class147.method1106("3D)2Softwarebibliothek gestartet)3", (byte) -53);

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "Lqd;")
    public static class40 field5144 = null;

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "Lqd;")
    public static class40 field5147 = field5158;

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "I")
    public static int field5140;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "I")
    public static int field5141;

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "I")
    public static int field5142;

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "I")
    public static int field5148;

    @OriginalMember(owner = "client!cj", name = "m", descriptor = "I")
    public static int field5150;

    @OriginalMember(owner = "client!cj", name = "n", descriptor = "I")
    public static int field5151;

    @OriginalMember(owner = "client!cj", name = "p", descriptor = "I")
    public static int field5153;

    @OriginalMember(owner = "client!cj", name = "r", descriptor = "I")
    public static int field5155;

    @OriginalMember(owner = "client!cj", name = "t", descriptor = "I")
    public static int field5157;

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "J")
    public long field5149;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "Lcj;")
    public class307 field5143;

    @OriginalMember(owner = "client!cj", name = "q", descriptor = "Lcj;")
    public class307 field5154;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V", line = 8)
    public final void method2095(int arg0) {
        if (arg0 != 0) {
            this.method2095(-112);
        }
        field5150++;
        if (this.field5154 != null) {
            this.field5154.field5143 = this.field5143;
            this.field5143.field5154 = this.field5154;
            this.field5154 = null;
            this.field5143 = null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIBIII)I", line = 43)
    public static final int method2096(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        if ((arg4 & 0x1) == 1) {
            int var7 = arg1;
            arg1 = arg6;
            arg6 = var7;
        }
        field5151++;
        int var8 = arg2 & 0x3;
        if (arg3 != 12) {
            method2101(75, (class44[]) null, true);
        }
        if (var8 == 0) {
            return arg5;
        } else if (var8 == 1) {
            return arg0;
        } else if (var8 == 2) {
            return 1 + 7 - arg1 - arg5;
        } else {
            return 7 + 1 - arg0 - arg6;
        }
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)V", line = 82)
    public static void method2097(int arg0) {
        field5152 = null;
        field5159 = null;
        field5156 = null;
        field5158 = null;
        field5146 = null;
        field5138 = null;
        field5147 = null;
        field5144 = null;
        field5145 = null;
        if (arg0 != -26062) {
            field5145 = (class40) null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BLve;)V", line = 105)
    public static final void method2098(byte arg0, class258 arg1) {
        field5155++;
        int var2 = 53 / ((arg0 + 57) / 58);
        class255 var3 = (class255) class60.field1143.method1405((byte) 115, arg1.field4319.method362(-25194));
        if (var3 == null) {
            class31.method281(class160.field2671, arg1.field1532[0], (class42) null, 128, arg1.field1489[0], 0, arg1, (class27) null);
        } else {
            var3.method1794(false);
        }
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(I)Z", line = 132)
    public final boolean method2099(int arg0) {
        if (arg0 != 0) {
            field5139 = 32;
        }
        field5141++;
        return this.field5154 != null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BLce;)V", line = 147)
    public static final void method2100(byte arg0, class239 arg1) {
        class130.field2224 = class312.method2158(0, arg1, class297.field4961, true);
        class3.field46 = new class114[class130.field2224.length];
        field5153++;
        class172.field2817 = new class114[class130.field2224.length];
        class96.field1724 = new class114[class130.field2224.length];
        for (int var2 = 0; var2 < class130.field2224.length; var2++) {
            class130.field2224[var2].method857();
            class3.field46[var2] = class130.field2224[var2].method852();
            class130.field2224[var2].method857();
            class172.field2817[var2] = class130.field2224[var2].method852();
            class130.field2224[var2].method857();
            class96.field1724[var2] = class130.field2224[var2].method852();
            class130.field2224[var2].method857();
        }
        class244.field4024 = class220.method1544(arg1, class160.field2679, 0, -74);
        class240.field3978 = class239.method1667(11, 0, class140.field2367, arg1);
        class169.field2789 = class239.method1667(11, 0, class29.field623, arg1);
        class102.field1797 = class239.method1667(11, 0, class90.field1635, arg1);
        class108.field1898 = class239.method1667(11, 0, class33.field665, arg1);
        class112.field1941 = class225.method1584((byte) -46, class257.field4282, arg1, 0);
        class149.field2502 = class225.method1584((byte) -46, class202.field3203, arg1, 0);
        class139.field2346 = class122.method924(arg1, 0, (byte) -32, class142.field2385);
        class140.field2366 = class225.method1584((byte) -46, class249.field4126, arg1, 0);
        class96.field1738 = class225.method1584((byte) -46, class56.field1081, arg1, 0);
        class192.field3094 = class148.method1114(0, class98.field1749, arg1, (byte) 94);
        class246.field4077 = class148.method1114(0, class40.field711, arg1, (byte) 88);
        class49.field945.method1823(class246.field4077, (int[]) null);
        class146.field2428.method1823(class246.field4077, (int[]) null);
        class230.field3789.method1823(class246.field4077, (int[]) null);
        if (class21.field350) {
            class241.field3986 = class312.method2158(0, arg1, class71.field1270, true);
            for (int var3 = 0; var3 < class241.field3986.length; var3++) {
                class241.field3986[var3].method854();
            }
        }
        class99 var4 = class55.method471(arg1, 12267, class243.field4009, 0);
        var4.method749();
        if (class21.field350) {
            class185.field2970 = new class100(var4);
        } else {
            class185.field2970 = var4;
        }
        class99[] var5 = class220.method1544(arg1, class3.field31, 0, -120);
        for (int var6 = 0; var6 < var5.length; var6++) {
            var5[var6].method749();
        }
        if (class21.field350) {
            class166.field2747 = new class185[var5.length];
            for (int var7 = 0; var7 < var5.length; var7++) {
                class166.field2747[var7] = new class100(var5[var7]);
            }
        } else {
            class166.field2747 = var5;
        }
        int var8 = (int) (Math.random() * 21.0D) - 10;
        int var9 = -35 % ((34 - arg0) / 60);
        int var10 = (int) (Math.random() * 21.0D) - 10;
        int var11 = (int) (Math.random() * 21.0D) - 10;
        int var12 = (int) (Math.random() * 41.0D) - 20;
        for (int var13 = 0; var13 < class244.field4024.length; var13++) {
            class244.field4024[var13].method751(var8 + var12, var11 + var12, var10 + var12);
        }
        class130.field2224[0].method858(var8 + var12, var11 + var12, var10 + var12);
        if (class21.field350) {
            class165.field2727 = new class185[class244.field4024.length];
            for (int var14 = 0; var14 < class244.field4024.length; var14++) {
                class165.field2727[var14] = new class100(class244.field4024[var14]);
            }
        } else {
            class165.field2727 = class244.field4024;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I[Lm;Z)V", line = 270)
    public static final void method2101(int arg0, class44[] arg1, boolean arg2) {
        field5157++;
        if (arg0 != -3503) {
            method2101(34, (class44[]) null, true);
        }
        byte var3;
        if (arg2) {
            var3 = 1;
        } else {
            var3 = 4;
        }
        if (!arg2) {
            for (int var4 = 0; var4 < 4; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    for (int var6 = 0; var6 < 104; var6++) {
                        if ((class274.field4564[var4][var5][var6] & 0x1) == 1) {
                            int var7 = var4;
                            if ((class274.field4564[1][var5][var6] & 0x2) == 2) {
                                var7 = var4 - 1;
                            }
                            if (var7 >= 0) {
                                arg1[var7].method401(var5, var6, -72);
                            }
                        }
                    }
                }
            }
            class239.field3959 += (int) (Math.random() * 5.0D) - 2;
            class29.field622 += (int) (Math.random() * 5.0D) - 2;
            if (class239.field3959 < -16) {
                class239.field3959 = -16;
            }
            if (class239.field3959 > 16) {
                class239.field3959 = 16;
            }
            if (class29.field622 < -8) {
                class29.field622 = -8;
            }
            if (class29.field622 > 8) {
                class29.field622 = 8;
            }
        }
        int var8 = class29.field622 >> 2 << 10;
        int[][] var9 = new int[104][104];
        int var10 = class239.field3959 >> 1;
        int[][] var11 = new int[104][104];
        for (int var12 = 0; var12 < var3; var12++) {
            byte[][] var13 = class104.field1845[var12];
            if (!class21.field350) {
                int var34 = (int) Math.sqrt(5100.0D);
                int var35 = var34 * 768 >> 8;
                for (int var36 = 1; var36 < 103; var36++) {
                    for (int var37 = 1; var37 < 103; var37++) {
                        byte var38 = 74;
                        int var39 = class78.field1316[var12][var37 + 1][var36] - class78.field1316[var12][var37 - 1][var36];
                        int var40 = class78.field1316[var12][var37][var36 + 1] - class78.field1316[var12][var37][var36 - 1];
                        int var41 = (int) Math.sqrt((double) (var40 * var40 + var39 * var39 + 65536));
                        int var42 = (var39 << 8) / var41;
                        int var43 = -65536 / var41;
                        int var44 = (var13[var37][var36 - 1] >> 2) + (var13[var37][var36 + 1] >> 3) + (var13[var37][var36] >> 1) + (var13[var37 - 1][var36] >> 2) + (var13[var37 + 1][var36] >> 3);
                        int var45 = (var40 << 8) / var41;
                        int var46 = (var45 * -50 + var42 * -50 + var43 * -10) / var35 + var38;
                        var11[var37][var36] = var46 - var44;
                    }
                }
            } else if (class1.field8) {
                for (int var30 = 1; var30 < 103; var30++) {
                    for (int var31 = 1; var31 < 103; var31++) {
                        byte var32 = 74;
                        int var33 = (var13[var31 - 1][var30] >> 2) + (var13[var31][var30] >> 1) + (var13[var31 + 1][var30] >> 3) + (var13[var31][var30 - -1] >> 3) + (var13[var31][var30 + -1] >> 2);
                        var11[var31][var30] = var32 - var33;
                    }
                }
            } else {
                int var14 = (int) class273.field4537[2];
                int var15 = (int) class273.field4537[1];
                int var16 = (int) class273.field4537[0];
                int var17 = (int) Math.sqrt((double) (var15 * var15 + var16 * var16 + (var14 * var14)));
                int var18 = var17 * 1024 >> 8;
                for (int var19 = 1; var19 < 103; var19++) {
                    for (int var20 = 1; var20 < 103; var20++) {
                        byte var21 = 96;
                        int var22 = class78.field1316[var12][var20][var19 + 1] - class78.field1316[var12][var20][var19 - 1];
                        int var23 = class78.field1316[var12][var20 + 1][var19] - class78.field1316[var12][var20 - 1][var19];
                        int var24 = (int) Math.sqrt((double) (var23 * var23 + var22 * var22 + 65536));
                        int var25 = (var23 << 8) / var24;
                        int var26 = (var22 << 8) / var24;
                        int var27 = (var13[var20][var19] >> 1) + (var13[var20][var19 - 1] >> 2) + (var13[var20][var19 + 1] >> 3) + (var13[var20 - 1][var19] >> 2) + (var13[var20 + 1][var19] >> 3);
                        int var28 = -65536 / var24;
                        int var29 = (var15 * var28 + (var16 * var25 + (var14 * var26))) / var18 + var21;
                        var11[var20][var19] = var29 - (int) ((float) var27 * 1.7F);
                    }
                }
            }
            for (int var47 = 0; var47 < 104; var47++) {
                class120.field2038[var47] = 0;
                class252.field4178[var47] = 0;
                class235.field3853[var47] = 0;
                class194.field3122[var47] = 0;
                class237.field3894[var47] = 0;
            }
            for (int var48 = -5; var48 < 104; var48++) {
                for (int var49 = 0; var49 < 104; var49++) {
                    int var50 = var48 + 5;
                    int var10002;
                    if (var50 < 104) {
                        int var51 = class312.field5261[var12][var50][var49] & 0xFF;
                        if (var51 > 0) {
                            class308 var52 = class25.method183(arg0 - 11446, var51 + -1);
                            class120.field2038[var49] += var52.field5178;
                            class252.field4178[var49] += var52.field5173;
                            class235.field3853[var49] += var52.field5176;
                            class194.field3122[var49] += var52.field5168;
                            var10002 = class237.field3894[var49]++;
                        }
                    }
                    int var53 = var48 - 5;
                    if (var53 >= 0) {
                        int var54 = class312.field5261[var12][var53][var49] & 0xFF;
                        if (var54 > 0) {
                            class308 var55 = class25.method183(-14949, var54 - 1);
                            class120.field2038[var49] -= var55.field5178;
                            class252.field4178[var49] -= var55.field5173;
                            class235.field3853[var49] -= var55.field5176;
                            class194.field3122[var49] -= var55.field5168;
                            var10002 = class237.field3894[var49]--;
                        }
                    }
                }
                if (var48 >= 0) {
                    int var56 = 0;
                    int var57 = 0;
                    int var58 = 0;
                    int var59 = 0;
                    int var60 = 0;
                    for (int var61 = -5; var61 < 104; var61++) {
                        int var62 = var61 + 5;
                        if (var62 < 104) {
                            var59 += class237.field3894[var62];
                            var57 += class252.field4178[var62];
                            var60 += class194.field3122[var62];
                            var58 += class235.field3853[var62];
                            var56 += class120.field2038[var62];
                        }
                        int var63 = var61 - 5;
                        if (var63 >= 0) {
                            var57 -= class252.field4178[var63];
                            var60 -= class194.field3122[var63];
                            var58 -= class235.field3853[var63];
                            var59 -= class237.field3894[var63];
                            var56 -= class120.field2038[var63];
                        }
                        if (var61 >= 0 && var59 > 0) {
                            var9[var48][var61] = class275.method1912((byte) 94, var58 / var59, var57 / var59, var56 * 256 / var60);
                        }
                    }
                }
            }
            for (int var64 = 1; var64 < 103; var64++) {
                label771: for (int var65 = 1; var65 < 103; var65++) {
                    if (arg2 || class118.method893(2) || (class274.field4564[0][var64][var65] & 0x2) != 0 || (class274.field4564[var12][var64][var65] & 0x10) == 0 && class85.method655(var12, var65, var64, -6681) == class188.field3022) {
                        if (var12 < class56.field1080) {
                            class56.field1080 = var12;
                        }
                        int var66 = class312.field5261[var12][var64][var65] & 0xFF;
                        int var67 = class89.field1609[var12][var64][var65] & 0xFF;
                        if (var66 > 0 || var67 > 0) {
                            int var68 = class78.field1316[var12][var64 + 1][var65];
                            int var69 = class78.field1316[var12][var64][var65];
                            int var70 = class78.field1316[var12][var64 + 1][var65 + 1];
                            int var71 = class78.field1316[var12][var64][var65 + 1];
                            if (var12 > 0) {
                                boolean var72 = true;
                                if (var66 == 0 && class205.field3270[var12][var64][var65] != 0) {
                                    var72 = false;
                                }
                                if (var67 > 0 && !class285.method1986(2402, var67 - 1).field959) {
                                    var72 = false;
                                }
                                if (var72 && var68 == var69 && var69 == var70 && var69 == var71) {
                                    class252.field4188[var12][var64][var65] = class11.method71(class252.field4188[var12][var64][var65], 4);
                                }
                            }
                            int var73;
                            int var76;
                            if (var66 > 0) {
                                var73 = var9[var64][var65];
                                int var74 = (var73 & 0x7F) + var10;
                                if (var74 < 0) {
                                    var74 = 0;
                                } else if (var74 > 127) {
                                    var74 = 127;
                                }
                                int var75 = (var8 + var73 & 0xFC00) + (var73 & 0x380) + var74;
                                var76 = class203.field3212[class63.method517(96, var75, -110880281)];
                            } else {
                                var76 = 0;
                                var73 = -1;
                            }
                            int var77 = var11[var64 + 1][var65];
                            int var78 = var11[var64 + 1][var65 + 1];
                            int var79 = var11[var64][var65];
                            int var80 = var11[var64][var65 + 1];
                            if (var67 == 0) {
                                class9.method57(var12, var64, var65, 0, 0, -1, var69, var68, var70, var71, class63.method517(var79, var73, -110880281), class63.method517(var77, var73, -110880281), class63.method517(var78, var73, -110880281), class63.method517(var80, var73, arg0 - 110876778), 0, 0, 0, 0, var76, 0);
                                if (class21.field350 && var12 > 0 && var73 != -1 && class25.method183(-14949, var66 - 1).field5179) {
                                    class241.method1702(0, 0, true, false, var64, var65, var69 - class78.field1316[0][var64][var65], -class78.field1316[0][var64 + 1][var65] + var68, var70 - class78.field1316[0][var64 + 1][var65 + 1], -class78.field1316[0][var64][var65 + 1] + var71);
                                }
                                if (class21.field350 && !arg2 && class103.field1807 != null && var12 == 0) {
                                    for (int var96 = var64 - 1; var96 <= var64 + 1; var96++) {
                                        for (int var97 = var65 - 1; var97 <= (var65 + 1); var97++) {
                                            if ((var64 != var96 || var65 != var97) && var96 >= 0 && var96 < 104 && var97 >= 0 && var97 < 104) {
                                                int var98 = class89.field1609[var12][var96][var97] & 0xFF;
                                                if (var98 != 0) {
                                                    class50 var99 = class285.method1986(arg0 + 5905, var98 + -1);
                                                    if (var99.field954 != -1 && class203.field3217.method571((byte) -76, var99.field954) == 4) {
                                                        class103.field1807[var64][var65] = (var99.field970 << 24) + var99.field960;
                                                        continue label771;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                int var81 = class205.field3270[var12][var64][var65] + 1;
                                byte var82 = class80.field1399[var12][var64][var65];
                                class50 var83 = class285.method1986(2402, var67 - 1);
                                if (class21.field350 && !arg2 && class103.field1807 != null && var12 == 0) {
                                    if (var83.field954 != -1 && class203.field3217.method571((byte) -74, var83.field954) == 4) {
                                        class103.field1807[var64][var65] = (var83.field970 << 24) + var83.field960;
                                    } else {
                                        label737: for (int var84 = var64 - 1; var84 <= (var64 + 1); var84++) {
                                            for (int var85 = var65 - 1; var85 <= var65 + 1; var85++) {
                                                if ((var64 != var84 || var65 != var85) && var84 >= 0 && var84 < 104 && var85 >= 0 && var85 < 104) {
                                                    int var86 = class89.field1609[var12][var84][var85] & 0xFF;
                                                    if (var86 != 0) {
                                                        class50 var87 = class285.method1986(2402, var86 - 1);
                                                        if (var87.field954 != -1 && class203.field3217.method571((byte) -117, var87.field954) == 4) {
                                                            class103.field1807[var64][var65] = (var87.field970 << 24) + var87.field960;
                                                            break label737;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                int var88 = var83.field954;
                                if (var88 >= 0 && !class203.field3217.method568(var88, 104)) {
                                    var88 = -1;
                                }
                                int var89;
                                int var92;
                                if (var88 >= 0) {
                                    var89 = -1;
                                    var92 = class203.field3212[class135.method999(96, 76, class203.field3217.method566(-54, var88))];
                                } else if (var83.field973 == -1) {
                                    var89 = -2;
                                    var92 = 0;
                                } else {
                                    var89 = var83.field973;
                                    int var90 = (var89 & 0x7F) + var10;
                                    if (var90 < 0) {
                                        var90 = 0;
                                    } else if (var90 > 127) {
                                        var90 = 127;
                                    }
                                    int var91 = (var8 + var89 & 0xFC00) + ((var89 & 0x380) + var90);
                                    var92 = class203.field3212[class135.method999(96, arg0 + 3583, var91)];
                                }
                                if (var83.field968 >= 0) {
                                    int var93 = var83.field968;
                                    int var94 = (var93 & 0x7F) + var10;
                                    if (var94 < 0) {
                                        var94 = 0;
                                    } else if (var94 > 127) {
                                        var94 = 127;
                                    }
                                    int var95 = (var93 + var8 & 0xFC00) + (var93 & 0x380) + var94;
                                    var92 = class203.field3212[class135.method999(96, 124, var95)];
                                }
                                class9.method57(var12, var64, var65, var81, var82, var88, var69, var68, var70, var71, class63.method517(var79, var73, -110880281), class63.method517(var77, var73, arg0 - 110876778), class63.method517(var78, var73, -110880281), class63.method517(var80, var73, -110880281), class135.method999(var79, 88, var89), class135.method999(var77, 55, var89), class135.method999(var78, 74, var89), class135.method999(var80, 100, var89), var76, var92);
                                if (class21.field350 && var12 > 0) {
                                    class241.method1702(var81, var82, var89 == -2 || !var83.field966, var73 == -1 || !class25.method183(-14949, var66 - 1).field5179, var64, var65, var69 - class78.field1316[0][var64][var65], -class78.field1316[0][var64 + 1][var65] + var68, var70 - class78.field1316[0][var64 + 1][var65 + 1], -class78.field1316[0][var64][var65 + 1] + var71);
                                }
                            }
                        }
                    }
                }
            }
            if (class21.field350) {
                float[][] var100 = new float[105][105];
                float[][] var101 = new float[105][105];
                float[][] var102 = new float[105][105];
                int[][] var103 = class78.field1316[var12];
                int var104 = 1;
                while (true) {
                    if (var104 > 103) {
                        if (arg2) {
                            class47[] var109 = class163.method1237(class80.field1399[var12], class89.field1609[var12], class274.field4564, class78.field1316[var12], (byte) 127, var101, class312.field5261[var12], var12, var9, var100, class103.field1807, var102, class205.field3270[var12], class244.field4020[0], var11);
                            class39.method324(var12, var109);
                            break;
                        }
                        class47[] var110 = class163.method1237(class80.field1399[var12], class89.field1609[var12], class274.field4564, class78.field1316[var12], (byte) 126, var101, class312.field5261[var12], var12, var9, var100, (int[][]) null, var102, class205.field3270[var12], (int[][]) null, var11);
                        class47[] var111 = class2.method8(var102, class312.field5261[var12], class205.field3270[var12], true, class274.field4564, var12, var100, class80.field1399[var12], var101, var11, class78.field1316[var12], class89.field1609[var12]);
                        class47[] var112 = new class47[var110.length + var111.length];
                        for (int var113 = 0; var113 < var110.length; var113++) {
                            var112[var113] = var110[var113];
                        }
                        for (int var114 = 0; var114 < var111.length; var114++) {
                            var112[var110.length + var114] = var111[var114];
                        }
                        class39.method324(var12, var112);
                        class221.method1545(class84.field1452, class84.field1462, var12, class312.field5261[var12], class205.field3270[var12], var101, class80.field1399[var12], var100, var102, class78.field1316[var12], class89.field1609[var12], -1);
                        break;
                    }
                    for (int var105 = 1; var105 <= 103; var105++) {
                        int var106 = var103[var105 + 1][var104] - var103[var105 - 1][var104];
                        int var107 = var103[var105][var104 + 1] - var103[var105][var104 - 1];
                        float var108 = (float) Math.sqrt((double) (var107 * var107 + var106 * var106 + 65536));
                        var100[var105][var104] = (float) var106 / var108;
                        var101[var105][var104] = -256.0F / var108;
                        var102[var105][var104] = (float) var107 / var108;
                    }
                    var104++;
                }
            }
            class312.field5261[var12] = (byte[][]) null;
            class89.field1609[var12] = (byte[][]) null;
            class205.field3270[var12] = (byte[][]) null;
            class80.field1399[var12] = (byte[][]) null;
            class104.field1845[var12] = (byte[][]) null;
        }
        class65.method523(-50, -10, -50);
        if (arg2) {
            return;
        }
        for (int var115 = 0; var115 < 104; var115++) {
            for (int var116 = 0; var116 < 104; var116++) {
                if ((class274.field4564[1][var115][var116] & 0x2) == 2) {
                    class122.method927(var115, var116);
                }
            }
        }
        for (int var117 = 0; var117 < 4; var117++) {
            for (int var118 = 0; var118 <= 104; var118++) {
                for (int var119 = 0; var119 <= 104; var119++) {
                    if ((class252.field4188[var117][var119][var118] & 0x1) != 0) {
                        int var120;
                        for (var120 = var118; var120 > 0 && (class252.field4188[var117][var119][var120 - 1] & 0x1) != 0; var120--) {
                        }
                        int var121 = var117;
                        int var122;
                        for (var122 = var118; var122 < 104 && (class252.field4188[var117][var119][var122 + 1] & 0x1) != 0; var122++) {
                        }
                        label454: while (var121 > 0) {
                            for (int var123 = var120; var123 <= var122; var123++) {
                                if ((class252.field4188[var121 - 1][var119][var123] & 0x1) == 0) {
                                    break label454;
                                }
                            }
                            var121--;
                        }
                        int var124;
                        label442: for (var124 = var117; var124 < 3; var124++) {
                            for (int var125 = var120; var125 <= var122; var125++) {
                                if ((class252.field4188[var124 + 1][var119][var125] & 0x1) == 0) {
                                    break label442;
                                }
                            }
                        }
                        int var126 = (var122 + 1 - var120) * (var124 + 1 - var121);
                        if (var126 >= 8) {
                            int var127 = class78.field1316[var121][var119][var120];
                            short var128 = 240;
                            int var129 = class78.field1316[var124][var119][var120] - var128;
                            class45.method418(1, var119 * 128, var119 * 128, var120 * 128, var122 * 128 + 128, var129, var127);
                            for (int var130 = var121; var130 <= var124; var130++) {
                                for (int var131 = var120; var131 <= var122; var131++) {
                                    class252.field4188[var130][var119][var131] = class276.method1923(class252.field4188[var130][var119][var131], -2);
                                }
                            }
                        }
                    }
                    if ((class252.field4188[var117][var119][var118] & 0x2) != 0) {
                        int var132;
                        for (var132 = var119; var132 > 0 && (class252.field4188[var117][var132 - 1][var118] & 0x2) != 0; var132--) {
                        }
                        int var133 = var117;
                        int var134 = var117;
                        int var135;
                        for (var135 = var119; var135 < 104 && (class252.field4188[var117][var135 + 1][var118] & 0x2) != 0; var135++) {
                        }
                        label508: while (var134 > 0) {
                            for (int var136 = var132; var136 <= var135; var136++) {
                                if ((class252.field4188[var134 - 1][var136][var118] & 0x2) == 0) {
                                    break label508;
                                }
                            }
                            var134--;
                        }
                        label497: while (var133 < 3) {
                            for (int var137 = var132; var137 <= var135; var137++) {
                                if ((class252.field4188[var133 + 1][var137][var118] & 0x2) == 0) {
                                    break label497;
                                }
                            }
                            var133++;
                        }
                        int var138 = (var135 + 1 - var132) * (var133 + 1 - var134);
                        if (var138 >= 8) {
                            int var139 = class78.field1316[var134][var132][var118];
                            short var140 = 240;
                            int var141 = class78.field1316[var133][var132][var118] - var140;
                            class45.method418(2, var132 * 128, var135 * 128 + 128, var118 * 128, var118 * 128, var141, var139);
                            for (int var142 = var134; var142 <= var133; var142++) {
                                for (int var143 = var132; var143 <= var135; var143++) {
                                    class252.field4188[var142][var143][var118] = class276.method1923(class252.field4188[var142][var143][var118], -3);
                                }
                            }
                        }
                    }
                    if ((class252.field4188[var117][var119][var118] & 0x4) != 0) {
                        int var144 = var119;
                        int var145 = var119;
                        int var146;
                        for (var146 = var118; var146 > 0 && (class252.field4188[var117][var119][var146 - 1] & 0x4) != 0; var146--) {
                        }
                        int var147;
                        for (var147 = var118; var147 < 104 && (class252.field4188[var117][var119][var147 + 1] & 0x4) != 0; var147++) {
                        }
                        label562: while (var144 > 0) {
                            for (int var148 = var146; var148 <= var147; var148++) {
                                if ((class252.field4188[var117][var144 - 1][var148] & 0x4) == 0) {
                                    break label562;
                                }
                            }
                            var144--;
                        }
                        label551: while (var145 < 104) {
                            for (int var149 = var146; var149 <= var147; var149++) {
                                if ((class252.field4188[var117][var145 + 1][var149] & 0x4) == 0) {
                                    break label551;
                                }
                            }
                            var145++;
                        }
                        if (((var145 + 1 - var144) * (var147 + 1 - var146)) >= 4) {
                            int var150 = class78.field1316[var117][var144][var146];
                            class45.method418(4, var144 * 128, var145 * 128 + 128, var146 * 128, var147 * 128 + 128, var150, var150);
                            for (int var151 = var144; var151 <= var145; var151++) {
                                for (int var152 = var146; var152 <= var147; var152++) {
                                    class252.field4188[var117][var151][var152] = class276.method1923(class252.field4188[var117][var151][var152], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZIIZI)V", line = 1242)
    public static final void method2102(boolean arg0, int arg1, int arg2, boolean arg3, int arg4) {
        class251.method1775(arg4, false, class89.field1611.length - 1, arg2, arg3, arg0, arg1);
        field5148++;
    }
}
