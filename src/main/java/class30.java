import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class30 extends class55 {

    @OriginalMember(owner = "client!ee", name = "T", descriptor = "I")
    private int field580 = 0;

    @OriginalMember(owner = "client!ee", name = "W", descriptor = "I")
    private int field583 = 128;

    @OriginalMember(owner = "client!ee", name = "O", descriptor = "I")
    private int field575 = 128;

    @OriginalMember(owner = "client!ee", name = "S", descriptor = "[I")
    private int[] field579 = new int[6];

    @OriginalMember(owner = "client!ee", name = "hb", descriptor = "I")
    public int field594 = -1;

    @OriginalMember(owner = "client!ee", name = "bb", descriptor = "I")
    private int field588 = 0;

    @OriginalMember(owner = "client!ee", name = "ab", descriptor = "[I")
    private int[] field587 = new int[6];

    @OriginalMember(owner = "client!ee", name = "P", descriptor = "I")
    private int field576 = 0;

    @OriginalMember(owner = "client!ee", name = "Q", descriptor = "Lo;")
    public static class84 field577 = class15.method124("*6n*6nRecovery Questions Last Set:*6n@gre@", 255);

    @OriginalMember(owner = "client!ee", name = "Y", descriptor = "Lo;")
    public static class84 field585 = class15.method124("Loading wordpack )2 0(U", 255);

    @OriginalMember(owner = "client!ee", name = "ib", descriptor = "Lod;")
    public static class88 field595 = new class88();

    @OriginalMember(owner = "client!ee", name = "mb", descriptor = "Lo;")
    private static class84 field599 = class15.method124("Login to a members(W server to use this object)3", 255);

    @OriginalMember(owner = "client!ee", name = "jb", descriptor = "Lo;")
    public static class84 field596 = field599;

    @OriginalMember(owner = "client!ee", name = "lb", descriptor = "Lo;")
    public static class84 field598 = class15.method124("You have @gre@", 255);

    @OriginalMember(owner = "client!ee", name = "kb", descriptor = "Lo;")
    public static class84 field597 = class15.method124("::fpsoff", 255);

    @OriginalMember(owner = "client!ee", name = "ob", descriptor = "I")
    public static int field601 = 0;

    @OriginalMember(owner = "client!ee", name = "R", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!ee", name = "U", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!ee", name = "V", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!ee", name = "X", descriptor = "I")
    public int field584;

    @OriginalMember(owner = "client!ee", name = "Z", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!ee", name = "db", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!ee", name = "eb", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!ee", name = "fb", descriptor = "I")
    private int field592;

    @OriginalMember(owner = "client!ee", name = "gb", descriptor = "Ljava/awt/Graphics;")
    public static Graphics field593;

    @OriginalMember(owner = "client!ee", name = "nb", descriptor = "[B")
    public static byte[] field600;

    @OriginalMember(owner = "client!ee", name = "cb", descriptor = "[[B")
    public static byte[][] field589;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BI)Lne;", line = 6)
    public final class83 method264(byte arg0, int arg1) {
        field590++;
        class83 var3 = (class83) class86.field1965.method737((long) this.field584, (byte) -115);
        if (var3 == null) {
            var3 = class83.method633(class111.field2402, this.field592, 0);
            if (var3 == null) {
                return null;
            }
            for (int var4 = 0; var4 < 6; var4++) {
                if (this.field579[0] != 0) {
                    var3.method610(this.field579[var4], this.field587[var4]);
                }
            }
            var3.method630();
            var3.method623(this.field588 + 64, this.field580 + 850, -30, -50, -30, true);
            class86.field1965.method744(arg0 ^ 0x51, (long) this.field584, var3);
        }
        if (arg0 != -39) {
            return null;
        }
        class83 var5;
        if (this.field594 == -1 || arg1 == -1) {
            var5 = var3.method617(true);
        } else {
            var5 = class74.method554(this.field594, 4867).method272(var3, arg1, (byte) 98);
        }
        if (this.field575 != 128 || this.field583 != 128) {
            var5.method626(this.field575, this.field583, this.field575);
        }
        if (this.field576 != 0) {
            if (this.field576 == 90) {
                var5.method618();
            }
            if (this.field576 == 180) {
                var5.method618();
                var5.method618();
            }
            if (this.field576 == 270) {
                var5.method618();
                var5.method618();
                var5.method618();
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZLqb;)V", line = 73)
    public static final void method265(boolean arg0, class96 arg1) {
        field582++;
        short var2 = 256;
        for (int var3 = 0; var3 < class17.field299.length; var3++) {
            class17.field299[var3] = 0;
        }
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) ((double) var2 * 128.0D * Math.random());
            class17.field299[var16] = (int) (Math.random() * 256.0D);
        }
        if (!arg0) {
            field595 = null;
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < var2 - 1; var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = (var12 << 7) + var14;
                    class5.field98[var15] = (class17.field299[var15 + 1] + class17.field299[var15 - 128] + class17.field299[var15 + 128] + class17.field299[var15 + -1]) / 4;
                }
            }
            int[] var13 = class17.field299;
            class17.field299 = class5.field98;
            class5.field98 = var13;
        }
        if (arg1 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg1.field2062; var7++) {
            for (int var8 = 0; var8 < arg1.field2056; var8++) {
                if (arg1.field2058[var6++] != 0) {
                    int var9 = var7 + arg1.field2057 + 16;
                    int var10 = arg1.field2059 + var8 + 16;
                    int var11 = (var9 << 7) + var10;
                    class17.field299[var11] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "([Lfb;Lsd;I)V", line = 171)
    public static final void method266(class33[] arg0, class108 arg1, int arg2) {
        int var3 = 17 % ((55 - arg2) / 52);
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var111 = 0; var111 < 104; var111++) {
                for (int var112 = 0; var112 < 104; var112++) {
                    if ((class73.field1544[var4][var111][var112] & 0x1) == 1) {
                        int var113 = var4;
                        if ((class73.field1544[1][var111][var112] & 0x2) == 2) {
                            var113 = var4 - 1;
                        }
                        if (var113 >= 0) {
                            arg0[var113].method303(var112, 2097152, var111);
                        }
                    }
                }
            }
        }
        field591++;
        class64.field1352 += (int) (Math.random() * 5.0D) - 2;
        if (class64.field1352 < -16) {
            class64.field1352 = -16;
        }
        class100.field2119 += (int) (Math.random() * 5.0D) - 2;
        if (class100.field2119 < -8) {
            class100.field2119 = -8;
        }
        if (class64.field1352 > 16) {
            class64.field1352 = 16;
        }
        if (class100.field2119 > 8) {
            class100.field2119 = 8;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            byte[][] var48 = class71.field1495[var5];
            int var49 = (int) Math.sqrt(5100.0D);
            int var50 = var49 * 768 >> 8;
            for (int var51 = 1; var51 < 103; var51++) {
                for (int var102 = 1; var102 < 103; var102++) {
                    int var103 = class110.field2377[var5][var102 + 1][var51] - class110.field2377[var5][var102 - 1][var51];
                    int var104 = class110.field2377[var5][var102][var51 + 1] - class110.field2377[var5][var102][var51 - 1];
                    int var105 = (int) Math.sqrt((double) (var104 * var104 + var103 * var103 + 65536));
                    int var106 = 65536 / var105;
                    int var107 = (var103 << 8) / var105;
                    int var108 = (var104 << 8) / var105;
                    int var109 = (var106 * -10 + var107 * -50 + var108 * -50) / var50 + 96;
                    int var110 = (var48[var102][var51] >> 1) + ((var48[var102][var51 + 1] >> 3) + (var48[var102 - 1][var51] >> 2) - (-(var48[var102][var51 + -1] >> 2) + -(var48[var102 - -1][var51] >> 3)));
                    class11.field217[var102][var51] = var109 - var110;
                }
            }
            for (int var52 = 0; var52 < 104; var52++) {
                class104.field2185[var52] = 0;
                class31.field624[var52] = 0;
                class55.field1154[var52] = 0;
                class101.field2137[var52] = 0;
                class25.field426[var52] = 0;
            }
            for (int var53 = -5; var53 < 109; var53++) {
                for (int var56 = 0; var56 < 104; var56++) {
                    int var96 = var53 + 5;
                    int var10002;
                    if (var96 >= 0 && var96 < 104) {
                        int var97 = class44.field879[var5][var96][var56] & 0xFF;
                        if (var97 > 0) {
                            class122 var98 = class103.method772(3, var97 - 1);
                            class104.field2185[var56] += var98.field2722;
                            class31.field624[var56] += var98.field2712;
                            class55.field1154[var56] += var98.field2710;
                            class101.field2137[var56] += var98.field2716;
                            var10002 = class25.field426[var56]++;
                        }
                    }
                    int var99 = var53 - 5;
                    if (var99 >= 0 && var99 < 104) {
                        int var100 = class44.field879[var5][var99][var56] & 0xFF;
                        if (var100 > 0) {
                            class122 var101 = class103.method772(3, var100 - 1);
                            class104.field2185[var56] -= var101.field2722;
                            class31.field624[var56] -= var101.field2712;
                            class55.field1154[var56] -= var101.field2710;
                            class101.field2137[var56] -= var101.field2716;
                            var10002 = class25.field426[var56]--;
                        }
                    }
                }
                if (var53 >= 1 && var53 < 103) {
                    int var57 = 0;
                    int var58 = 0;
                    int var59 = 0;
                    int var60 = 0;
                    int var61 = 0;
                    for (int var62 = -5; var62 < 109; var62++) {
                        int var63 = var62 + 5;
                        if (var63 >= 0 && var63 < 104) {
                            var57 += class31.field624[var63];
                            var60 += class25.field426[var63];
                            var59 += class101.field2137[var63];
                            var58 += class55.field1154[var63];
                            var61 += class104.field2185[var63];
                        }
                        int var64 = var62 - 5;
                        if (var64 >= 0 && var64 < 104) {
                            var60 -= class25.field426[var64];
                            var58 -= class55.field1154[var64];
                            var59 -= class101.field2137[var64];
                            var57 -= class31.field624[var64];
                            var61 -= class104.field2185[var64];
                        }
                        if (var62 >= 1 && var62 < 103 && (!class1.field23 || (class73.field1544[0][var53][var62] & 0x2) != 0 || (class73.field1544[var5][var53][var62] & 0x10) == 0 && class57.method465(var62, var53, var5, (byte) 124) == class39.field801)) {
                            if (class40.field818 > var5) {
                                class40.field818 = var5;
                            }
                            int var65 = class88.field1978[var5][var53][var62] & 0xFF;
                            int var66 = class44.field879[var5][var53][var62] & 0xFF;
                            if (var66 > 0 || var65 > 0) {
                                int var67 = class110.field2377[var5][var53 + 1][var62];
                                int var68 = class110.field2377[var5][var53][var62];
                                int var69 = class110.field2377[var5][var53 + 1][var62 + 1];
                                int var70 = class11.field217[var53][var62];
                                int var71 = class11.field217[var53 + 1][var62];
                                int var72 = class110.field2377[var5][var53][var62 + 1];
                                int var73 = -1;
                                int var74 = -1;
                                int var75 = class11.field217[var53][var62 + 1];
                                int var76 = class11.field217[var53 + 1][var62 + 1];
                                if (var66 > 0) {
                                    int var77 = var61 * 256 / var59;
                                    int var78 = var57 / var60;
                                    int var79 = var58 / var60;
                                    var73 = class14.method118(var79, 16557, var78, var77);
                                    int var80 = class64.field1352 + var79;
                                    int var81 = class100.field2119 + var77 & 0xFF;
                                    if (var80 < 0) {
                                        var80 = 0;
                                    } else if (var80 > 255) {
                                        var80 = 255;
                                    }
                                    var74 = class14.method118(var80, 16557, var78, var81);
                                }
                                if (var5 > 0) {
                                    boolean var82 = true;
                                    if (var66 == 0 && class17.field319[var5][var53][var62] != 0) {
                                        var82 = false;
                                    }
                                    if (var65 > 0 && !class99.method750(var65 - 1, 80).field568) {
                                        var82 = false;
                                    }
                                    if (var82 && var67 == var68 && var68 == var69 && var68 == var72) {
                                        class38.field745[var5][var53][var62] = class106.method785(class38.field745[var5][var53][var62], 2340);
                                    }
                                }
                                int var83 = 0;
                                if (var74 != -1) {
                                    var83 = class7.field143[class61.method484(12800, 96, var74)];
                                }
                                if (var65 == 0) {
                                    arg1.method824(var5, var53, var62, 0, 0, -1, var68, var67, var69, var72, class61.method484(12800, var70, var73), class61.method484(12800, var71, var73), class61.method484(12800, var76, var73), class61.method484(12800, var75, var73), 0, 0, 0, 0, var83, 0);
                                } else {
                                    int var84 = class17.field319[var5][var53][var62] + 1;
                                    byte var85 = class86.field1964[var5][var53][var62];
                                    class28 var86 = class99.method750(var65 - 1, -125);
                                    int var87 = var86.field549;
                                    int var88;
                                    int var89;
                                    if (var87 >= 0) {
                                        var88 = -1;
                                        var89 = class7.field130.method202(true, var87);
                                    } else if (var86.field547 == 16711935) {
                                        var89 = -2;
                                        var87 = -1;
                                        var88 = -2;
                                    } else {
                                        var88 = class14.method118(var86.field570, 16557, var86.field553, var86.field557);
                                        int var90 = class100.field2119 + var86.field557 & 0xFF;
                                        int var91 = class64.field1352 + var86.field570;
                                        if (var91 < 0) {
                                            var91 = 0;
                                        } else if (var91 > 255) {
                                            var91 = 255;
                                        }
                                        var89 = class14.method118(var91, 16557, var86.field553, var90);
                                    }
                                    int var92 = 0;
                                    if (var89 != -2) {
                                        var92 = class7.field143[class84.method663(var89, 96, -22942)];
                                    }
                                    if (var86.field569 != -1) {
                                        int var93 = var86.field555 + class100.field2119 & 0xFF;
                                        int var94 = var86.field543 + class64.field1352;
                                        if (var94 < 0) {
                                            var94 = 0;
                                        } else if (var94 > 255) {
                                            var94 = 255;
                                        }
                                        int var95 = class14.method118(var94, 16557, var86.field565, var93);
                                        var92 = class7.field143[class84.method663(var95, 96, -22942)];
                                    }
                                    arg1.method824(var5, var53, var62, var84, var85, var87, var68, var67, var69, var72, class61.method484(12800, var70, var73), class61.method484(12800, var71, var73), class61.method484(12800, var76, var73), class61.method484(12800, var75, var73), class84.method663(var88, var70, -22942), class84.method663(var88, var71, -22942), class84.method663(var88, var76, -22942), class84.method663(var88, var75, -22942), var83, var92);
                                }
                            }
                        }
                    }
                }
            }
            for (int var54 = 1; var54 < 103; var54++) {
                for (int var55 = 1; var55 < 103; var55++) {
                    arg1.method804(var5, var55, var54, class57.method465(var54, var55, var5, (byte) 127));
                }
            }
            class44.field879[var5] = null;
            class88.field1978[var5] = null;
            class17.field319[var5] = null;
            class86.field1964[var5] = null;
            class71.field1495[var5] = null;
        }
        arg1.method820(-50, -10, -50);
        for (int var6 = 0; var6 < 104; var6++) {
            for (int var47 = 0; var47 < 104; var47++) {
                if ((class73.field1544[1][var6][var47] & 0x2) == 2) {
                    arg1.method839(var6, var47);
                }
            }
        }
        int var7 = 2;
        int var8 = 1;
        int var9 = 4;
        for (int var10 = 0; var10 < 4; var10++) {
            if (var10 > 0) {
                var9 <<= 0x3;
                var8 <<= 0x3;
                var7 <<= 0x3;
            }
            for (int var11 = 0; var11 <= var10; var11++) {
                for (int var12 = 0; var12 <= 104; var12++) {
                    for (int var13 = 0; var13 <= 104; var13++) {
                        if ((class38.field745[var11][var13][var12] & var8) != 0) {
                            int var14;
                            for (var14 = var12; var14 < 104 && (var8 & class38.field745[var11][var13][var14 + 1]) != 0; var14++) {
                            }
                            int var15 = var12;
                            int var16 = var11;
                            int var17 = var11;
                            while (var15 > 0 && (var8 & class38.field745[var11][var13][var15 - 1]) != 0) {
                                var15--;
                            }
                            label351: while (var16 > 0) {
                                for (int var18 = var15; var18 <= var14; var18++) {
                                    if ((var8 & class38.field745[var16 - 1][var13][var18]) == 0) {
                                        break label351;
                                    }
                                }
                                var16--;
                            }
                            label340: while (var17 < var10) {
                                for (int var19 = var15; var19 <= var14; var19++) {
                                    if ((var8 & class38.field745[var17 + 1][var13][var19]) == 0) {
                                        break label340;
                                    }
                                }
                                var17++;
                            }
                            int var20 = (var14 + 1 - var15) * (var17 + 1 - var16);
                            if (var20 >= 8) {
                                short var21 = 240;
                                int var22 = class110.field2377[var17][var13][var15] - var21;
                                int var23 = class110.field2377[var16][var13][var15];
                                class108.method819(var10, 1, var13 * 128, var13 * 128, var15 * 128, var14 * 128 + 128, var22, var23);
                                for (int var24 = var16; var24 <= var17; var24++) {
                                    for (int var25 = var15; var25 <= var14; var25++) {
                                        class38.field745[var24][var13][var25] = class61.method486(class38.field745[var24][var13][var25], ~var8);
                                    }
                                }
                            }
                        }
                        if ((class38.field745[var11][var13][var12] & var7) != 0) {
                            int var26;
                            for (var26 = var13; var26 > 0 && (var7 & class38.field745[var11][var26 - 1][var12]) != 0; var26--) {
                            }
                            int var27 = var13;
                            int var28 = var11;
                            while (var27 < 104 && (var7 & class38.field745[var11][var27 + 1][var12]) != 0) {
                                var27++;
                            }
                            int var29 = var11;
                            label405: while (var28 > 0) {
                                for (int var30 = var26; var30 <= var27; var30++) {
                                    if ((class38.field745[var28 - 1][var30][var12] & var7) == 0) {
                                        break label405;
                                    }
                                }
                                var28--;
                            }
                            label394: while (var10 > var29) {
                                for (int var31 = var26; var31 <= var27; var31++) {
                                    if ((class38.field745[var29 + 1][var31][var12] & var7) == 0) {
                                        break label394;
                                    }
                                }
                                var29++;
                            }
                            int var32 = (var27 + 1 - var26) * (var29 + 1 - var28);
                            if (var32 >= 8) {
                                int var33 = class110.field2377[var28][var26][var12];
                                short var34 = 240;
                                int var35 = class110.field2377[var29][var26][var12] - var34;
                                class108.method819(var10, 2, var26 * 128, var27 * 128 + 128, var12 * 128, var12 * 128, var35, var33);
                                for (int var36 = var28; var36 <= var29; var36++) {
                                    for (int var37 = var26; var37 <= var27; var37++) {
                                        class38.field745[var36][var37][var12] = class61.method486(class38.field745[var36][var37][var12], ~var7);
                                    }
                                }
                            }
                        }
                        if ((var9 & class38.field745[var11][var13][var12]) != 0) {
                            int var38 = var13;
                            int var39 = var13;
                            int var40 = var12;
                            int var41;
                            for (var41 = var12; var41 < 104 && (class38.field745[var11][var13][var41 + 1] & var9) != 0; var41++) {
                            }
                            while (var40 > 0 && (class38.field745[var11][var13][var40 - 1] & var9) != 0) {
                                var40--;
                            }
                            label460: while (var38 > 0) {
                                for (int var42 = var40; var42 <= var41; var42++) {
                                    if ((class38.field745[var11][var38 - 1][var42] & var9) == 0) {
                                        break label460;
                                    }
                                }
                                var38--;
                            }
                            label449: while (var39 < 104) {
                                for (int var43 = var40; var43 <= var41; var43++) {
                                    if ((var9 & class38.field745[var11][var39 + 1][var43]) == 0) {
                                        break label449;
                                    }
                                }
                                var39++;
                            }
                            if ((var39 + 1 - var38) * (var41 - -1 + -var40) >= 4) {
                                int var44 = class110.field2377[var11][var38][var40];
                                class108.method819(var10, 4, var38 * 128, var39 * 128 + 128, var40 * 128, var41 * 128 + 128, var44, var44);
                                for (int var45 = var38; var45 <= var39; var45++) {
                                    for (int var46 = var40; var46 <= var41; var46++) {
                                        class38.field745[var11][var45][var46] = class61.method486(class38.field745[var11][var45][var46], ~var9);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILeb;)V", line = 937)
    public final void method267(int arg0, class27 arg1) {
        while (true) {
            int var3 = arg1.method231(255);
            if (var3 == 0) {
                if (arg0 != 2) {
                    this.method268(-118, -89, null);
                }
                field578++;
                return;
            }
            this.method268(var3, 70, arg1);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IILeb;)V", line = 967)
    private final void method268(int arg0, int arg1, class27 arg2) {
        if (arg1 <= 35) {
            return;
        }
        if (arg0 == 1) {
            this.field592 = arg2.method227(127);
        } else if (arg0 == 2) {
            this.field594 = arg2.method227(127);
        } else if (arg0 == 4) {
            this.field575 = arg2.method227(127);
        } else if (arg0 == 5) {
            this.field583 = arg2.method227(127);
        } else if (arg0 == 6) {
            this.field576 = arg2.method227(127);
        } else if (arg0 == 7) {
            this.field588 = arg2.method231(255);
        } else if (arg0 == 8) {
            this.field580 = arg2.method231(255);
        } else if (arg0 >= 40 && arg0 < 50) {
            this.field579[arg0 - 40] = arg2.method227(127);
        } else if (arg0 >= 50 && arg0 < 60) {
            this.field587[arg0 - 50] = arg2.method227(127);
        }
        field586++;
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(B)V", line = 1015)
    public static void method269(byte arg0) {
        field585 = null;
        field593 = null;
        if (arg0 > -30) {
            method265(false, null);
        }
        field577 = null;
        field598 = null;
        field589 = null;
        field599 = null;
        field600 = null;
        field597 = null;
        field596 = null;
        field595 = null;
    }
}
