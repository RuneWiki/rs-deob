import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class150 extends class27 {

    @OriginalMember(owner = "client!kg", name = "M", descriptor = "Ljava/lang/String;")
    public static String field2177 = "slide:";

    @OriginalMember(owner = "client!kg", name = "Q", descriptor = "[I")
    public static int[] field2181 = new int[2];

    @OriginalMember(owner = "client!kg", name = "V", descriptor = "J")
    public static long field2186 = 0L;

    @OriginalMember(owner = "client!kg", name = "W", descriptor = "I")
    public static int field2187 = -1;

    @OriginalMember(owner = "client!kg", name = "L", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!kg", name = "N", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!kg", name = "O", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!kg", name = "P", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!kg", name = "R", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!kg", name = "S", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!kg", name = "T", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!kg", name = "U", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "()V", line = 14)
    public class150() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "(I)V", line = 20)
    public static void method1059(int arg0) {
        if (arg0 != 0) {
            field2180 = 110;
        }
        field2177 = null;
        field2181 = null;
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(III)I", line = 33)
    private final int method1060(int arg0, int arg1, int arg2) {
        field2185++;
        int var4 = arg2 * 57 + arg0;
        if (arg1 >= -28) {
            method1064(119, 29, -22, (byte[][][]) ((byte[][][]) null), -1, (byte) -19, -12, -65);
        }
        int var5 = var4 ^ var4 << 1;
        return 4096 - ((Integer.MAX_VALUE & (var5 * var5 * 15731 + 789221) * var5 + 1376312589) / 262144);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIII)I", line = 53)
    public static final int method1061(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class247.field3664) {
            arg3 = 1000000;
            class247.field3664 = false;
        }
        field2178++;
        class2 var5 = class73.field1070[arg1][arg0];
        int var6 = var5.field85;
        float var7 = ((float) arg2 * 0.1F + 0.7F) * var5.field77;
        int var8 = var5.field69;
        if (!class128.field1862) {
            var8 = 0;
        }
        float var9 = var5.field73;
        float var10 = var5.field84;
        int var11 = var5.field80;
        if (arg4 != -1) {
            method1062(false);
        }
        class223 var12 = var5.field70;
        float var13 = var5.field68;
        float var14 = var5.field71;
        float var15 = var5.field78;
        if (class313.field4663 != var6 || class160.field2320 != var7 || class17.field289 != var10 || class348.field5372 != var9 || class351.field5412 != var11 || class244.field3638 != var8 || class356.field5463 != var12 || class35.field520 != var15 || class109.field1580 != var14 || class335.field5222 != var13) {
            class98.field1385 = class72.field1060;
            class251.field3723 = class358.field5480;
            class352.field5427 = class259.field3863;
            class214.field3096 = class134.field1951;
            class286.field4322 = class86.field1222;
            class98.field1384 = class172.field2490;
            class184.field2652 = class323.field4858;
            class291.field4401 = class68.field993;
            class7.field140 = class126.field1825;
            class206.field3009 = class177.field2551;
            if (class125.field1815 == null || class7.field140 == class125.field1815) {
                class125.field1815 = new class223();
            }
            class351.field5412 = var11;
            class35.field520 = var15;
            class348.field5372 = var9;
            class313.field4663 = var6;
            class335.field5222 = var13;
            class17.field289 = var10;
            class160.field2320 = var7;
            class109.field1580 = var14;
            class244.field3638 = var8;
            class98.field1383 = 0;
            class356.field5463 = var12;
        }
        if (class98.field1383 < 65536) {
            class98.field1383 += arg3 * 250;
            if (class98.field1383 >= 65536) {
                class86.field1222 = class335.field5222;
                class172.field2490 = class348.field5372;
                class7.field140 = null;
                class134.field1951 = class313.field4663;
                class323.field4858 = class17.field289;
                class259.field3863 = class35.field520;
                class98.field1383 = 65536;
                class126.field1825 = class356.field5463;
                class72.field1060 = class109.field1580;
                class68.field993 = class160.field2320;
                class177.field2551 = class244.field3638;
                class358.field5480 = class351.field5412;
            } else {
                int var16 = class98.field1383 >> 8;
                int var17 = 65536 - class98.field1383 >> 8;
                class177.field2551 = class206.field3009 * var17 + (class244.field3638 * var16) >> 8;
                float var18 = (float) (65536 - class98.field1383) / 65536.0F;
                class358.field5480 = ((class251.field3723 & 0xFF00FF) * var17 + ((class351.field5412 & 0xFF00FF) * var16) & 0xFF00FF00) + ((class351.field5412 & 0xFF00) * var16 + (class251.field3723 & 0xFF00) * var17 & 0xFF0000) >> 8;
                class134.field1951 = ((class313.field4663 & 0xFF00FF) * var16 + (class214.field3096 & 0xFF00FF) * var17 & 0xFF00FF00) + ((class313.field4663 & 0xFF00) * var16 + (class214.field3096 & 0xFF00) * var17 & 0xFF0000) >> 8;
                float var19 = (float) class98.field1383 / 65536.0F;
                class323.field4858 = class184.field2652 * var18 + class17.field289 * var19;
                class72.field1060 = class98.field1385 * var18 + class109.field1580 * var19;
                class172.field2490 = class98.field1384 * var18 + class348.field5372 * var19;
                class86.field1222 = class335.field5222 * var19 + class286.field4322 * var18;
                class68.field993 = class291.field4401 * var18 + class160.field2320 * var19;
                class259.field3863 = class352.field5427 * var18 + class35.field520 * var19;
                if (class7.field140 != class356.field5463) {
                    if (class7.field140 == null || class356.field5463 == null) {
                        class126.field1825 = null;
                    } else {
                        class126.field1825 = class125.field1815.method1635(class7.field140, class356.field5463, (float) class98.field1383 / 65536.0F);
                    }
                }
            }
        }
        return class358.field5480;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Z)I", line = 181)
    public static final int method1062(boolean arg0) {
        field2176++;
        if (arg0) {
            method1061(-81, -103, 78, -84, 102);
        }
        return class33.field471 && class236.field3549[81] && class264.field4043 > 2 ? class324.field4886[class264.field4043 - 2] : class324.field4886[class264.field4043 - 1];
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIIIIII)V", line = 205)
    public static final void method1063(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2183++;
        if (arg3 < 128 || arg1 < 128 || arg3 > 13056 || arg1 > 13056) {
            class146.field2103 = -1;
            class145.field2096 = -1;
            return;
        }
        if (arg4 != -3666) {
            field2184 = 29;
        }
        int var9 = class71.method584(class321.field4835, arg3, 68, arg1) - arg7;
        int var10 = arg3 - class137.field1991;
        int var11 = var9 - class129.field1871;
        int var12 = arg1 - class166.field2385;
        int var13 = class345.field5339[class362.field5746];
        int var14 = class345.field5343[class362.field5746];
        int var15 = class345.field5339[class335.field5216];
        int var16 = class345.field5343[class335.field5216];
        int var17 = var10 * var16 + var12 * var15 >> 16;
        int var18 = var12 * var16 - (var10 * var15) >> 16;
        int var20 = var11 * var14 - (var13 * var18) >> 16;
        int var21 = arg0 + var17;
        int var22 = var11 * var13 + (var14 * var18) >> 16;
        if (var22 < 50) {
            class145.field2096 = -1;
            class146.field2103 = -1;
        } else if (class141.field2031) {
            int var24 = arg2 * 512 >> 8;
            class145.field2096 = arg6 + (var21 * var24 / var22);
            int var25 = arg8 * 512 >> 8;
            class146.field2103 = var20 * var25 / var22 + arg5;
        } else {
            class145.field2096 = (var21 << 9) / var22 + arg6;
            class146.field2103 = arg5 + ((var20 << 9) / var22);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(III[[[BIBII)V", line = 267)
    public static final void method1064(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class252.field3742++;
        class292.field4422 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class119.field1682; var12 < class252.field3748; var12++) {
            class167[][] var13 = class302.field4502[var12];
            for (int var14 = class99.field1401; var14 < class88.field1241; var14++) {
                for (int var15 = class107.field1542; var15 < class207.field3032; var15++) {
                    class167 var16 = var13[var14][var15];
                    if (var16 != null) {
                        if (class322.field4852[var14 + class261.field3975 - class351.field5419][var15 + class261.field3975 - class294.field4433] && (arg3 == null || var12 < arg4 || arg3[var12][var14][var15] != arg5)) {
                            var16.field2396 = true;
                            var16.field2389 = true;
                            if (var16.field2407 > 0) {
                                var16.field2410 = true;
                            } else {
                                var16.field2410 = false;
                            }
                            class292.field4422++;
                        } else {
                            var16.field2396 = false;
                            var16.field2389 = false;
                            var16.field2395 = 0;
                            if (var14 >= var8 && var14 <= var9 && var15 >= var10 && var15 <= var11) {
                                if (var16.field2387 != null) {
                                    class11 var17 = var16.field2387;
                                    var17.field165.method391(0, var12, var17.field175, var17.field177, var17.field168);
                                    if (var17.field174 != null) {
                                        var17.field174.method391(0, var12, var17.field175, var17.field177, var17.field168);
                                    }
                                }
                                if (var16.field2412 != null) {
                                    class94 var18 = var16.field2412;
                                    var18.field1313.method391(var18.field1318, var12, var18.field1307, var18.field1316, var18.field1322);
                                    if (var18.field1317 != null) {
                                        var18.field1317.method391(var18.field1318, var12, var18.field1307, var18.field1316, var18.field1322);
                                    }
                                }
                                if (var16.field2390 != null) {
                                    class85 var19 = var16.field2390;
                                    var19.field1202.method391(0, var12, var19.field1196, var19.field1207, var19.field1200);
                                }
                                if (var16.field2406 != null) {
                                    for (int var20 = 0; var20 < var16.field2407; var20++) {
                                        class180 var21 = var16.field2406[var20];
                                        var21.field2591.method391(var21.field2596, var12, var21.field2599, var21.field2600, var21.field2589);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var22 = class240.field3567 == class132.field1930;
        if (class141.field2031) {
            GL var23 = class141.field2025;
            var23.glPushMatrix();
            var23.glTranslatef((float) (-arg0), (float) (-arg1), (float) (-arg2));
            if (var22) {
                class275.method2010();
                class2.method9(3, 10691, -1);
                class249.field3700 = true;
                class39.method284();
                class139.field1999 = -1;
                class146.field2106 = -1;
                for (int var24 = 0; var24 < class129.field1874[0].length; var24++) {
                    class224 var25 = class129.field1874[0][var24];
                    float var26 = 251.5F - (var25.field3360 ? 1.0F : 0.5F);
                    if (class139.field1999 != var25.field3375) {
                        class139.field1999 = var25.field3375;
                        class316.method2206(0, var25.field3375);
                        class222.method1628(class221.method1619(1));
                    }
                    var25.method1639(class302.field4502, var26, false);
                }
                class39.method282();
            } else {
                int var27 = class119.field1682;
                while (true) {
                    if (var27 >= class252.field3748) {
                        class268.method1981(class351.field5419, class294.field4433, class302.field4502);
                        break;
                    }
                    for (int var28 = 0; var28 < class129.field1874[var27].length; var28++) {
                        class224 var29 = class129.field1874[var27][var28];
                        float var30 = 201.5F - (float) var27 * 50.0F - (var29.field3360 ? 1.0F : 0.5F);
                        if (var29.field3353 != -1 && class173.method1213(24815, class345.field5336.method586(var29.field3353, 13078)) && class267.field4078) {
                            class316.method2206(0, var29.field3375);
                        }
                        var29.method1639(class302.field4502, var30, false);
                    }
                    if (var27 == 0 && class173.field2497 > 0) {
                        class141.method989(101.5F);
                        class24.method136(class351.field5419, class294.field4433, class261.field3975, arg1, class322.field4852, class132.field1930[0]);
                    }
                    var27++;
                }
            }
            var23.glPopMatrix();
        }
        for (int var31 = class119.field1682; var31 < class252.field3748; var31++) {
            class167[][] var32 = class302.field4502[var31];
            for (int var33 = -class261.field3975; var33 <= 0; var33++) {
                int var34 = class351.field5419 + var33;
                int var35 = class351.field5419 - var33;
                if (var34 >= class99.field1401 || var35 < class88.field1241) {
                    for (int var36 = -class261.field3975; var36 <= 0; var36++) {
                        int var37 = class294.field4433 + var36;
                        int var38 = class294.field4433 - var36;
                        if (var34 >= class99.field1401) {
                            if (var37 >= class107.field1542) {
                                class167 var39 = var32[var34][var37];
                                if (var39 != null && var39.field2396) {
                                    class352.method2455(var39, true);
                                }
                            }
                            if (var38 < class207.field3032) {
                                class167 var40 = var32[var34][var38];
                                if (var40 != null && var40.field2396) {
                                    class352.method2455(var40, true);
                                }
                            }
                        }
                        if (var35 < class88.field1241) {
                            if (var37 >= class107.field1542) {
                                class167 var41 = var32[var35][var37];
                                if (var41 != null && var41.field2396) {
                                    class352.method2455(var41, true);
                                }
                            }
                            if (var38 < class207.field3032) {
                                class167 var42 = var32[var35][var38];
                                if (var42 != null && var42.field2396) {
                                    class352.method2455(var42, true);
                                }
                            }
                        }
                        if (class292.field4422 == 0) {
                            if (!var22) {
                                class179.field2562 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var43 = class119.field1682; var43 < class252.field3748; var43++) {
            class167[][] var44 = class302.field4502[var43];
            for (int var45 = -class261.field3975; var45 <= 0; var45++) {
                int var46 = class351.field5419 + var45;
                int var47 = class351.field5419 - var45;
                if (var46 >= class99.field1401 || var47 < class88.field1241) {
                    for (int var48 = -class261.field3975; var48 <= 0; var48++) {
                        int var49 = class294.field4433 + var48;
                        int var50 = class294.field4433 - var48;
                        if (var46 >= class99.field1401) {
                            if (var49 >= class107.field1542) {
                                class167 var51 = var44[var46][var49];
                                if (var51 != null && var51.field2396) {
                                    class352.method2455(var51, false);
                                }
                            }
                            if (var50 < class207.field3032) {
                                class167 var52 = var44[var46][var50];
                                if (var52 != null && var52.field2396) {
                                    class352.method2455(var52, false);
                                }
                            }
                        }
                        if (var47 < class88.field1241) {
                            if (var49 >= class107.field1542) {
                                class167 var53 = var44[var47][var49];
                                if (var53 != null && var53.field2396) {
                                    class352.method2455(var53, false);
                                }
                            }
                            if (var50 < class207.field3032) {
                                class167 var54 = var44[var47][var50];
                                if (var54 != null && var54.field2396) {
                                    class352.method2455(var54, false);
                                }
                            }
                        }
                        if (class292.field4422 == 0) {
                            if (!var22) {
                                class179.field2562 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class179.field2562 = false;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IB)[I", line = 642)
    public final int[] method18(int arg0, byte arg1) {
        field2179++;
        if (arg1 != -62) {
            method1062(true);
        }
        int[] var3 = this.field375.method2087(arg1 + 6, arg0);
        if (this.field375.field4382) {
            int var4 = class215.field3175[arg0];
            for (int var5 = 0; var5 < class209.field3053; var5++) {
                var3[var5] = this.method1060(class251.field3721[var5], class228.method1706(arg1, 102), var4) % 4096;
            }
        }
        return var3;
    }
}
