import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class88 extends class287 {

    @OriginalMember(owner = "client!ib", name = "r", descriptor = "Lmh;")
    public static class128 field1507 = class22.method156(123, "::wm1");

    @OriginalMember(owner = "client!ib", name = "s", descriptor = "I")
    public int field1508;

    @OriginalMember(owner = "client!ib", name = "t", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!ib", name = "u", descriptor = "I")
    public int field1510;

    @OriginalMember(owner = "client!ib", name = "v", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!ib", name = "w", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!ib", name = "x", descriptor = "I")
    public static int field1513;

    @OriginalMember(owner = "client!ib", name = "y", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!ib", name = "z", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!ib", name = "B", descriptor = "I")
    public static int field1516;

    @OriginalMember(owner = "client!ib", name = "C", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!ib", name = "D", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BIIII)V", line = 5)
    public static final void method546(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field1518++;
        class229 var5 = class241.method1638(8, -55, arg1);
        if (arg0 > 24) {
            var5.method1574(3199);
            var5.field3980 = arg4;
            var5.field3983 = arg3;
            var5.field3981 = arg2;
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V", line = 21)
    public static final void method547(int arg0) {
        field1509++;
        class217.field3818 = (byte[][][]) null;
        class20.field536 = (byte[][][]) null;
        class242.field4146 = null;
        class36.field740 = (byte[][][]) null;
        class50.field978 = 0;
        class45.field909 = null;
        class183.field3213 = (byte[][][]) null;
        class273.field4739 = (byte[][][]) null;
        class206.field3626 = (short[][][]) null;
        class139.field2384 = null;
        class173.field3047 = (int[][][]) null;
        class107.field1825 = (int[][][]) null;
        class223.field3916.method2025((byte) -97);
        class70.field1312 = null;
        class222.field3902 = null;
        class27.field588 = null;
        class261.field4519 = null;
        if (arg0 != -1741557305) {
            field1514 = -114;
        }
        class115.field1940 = null;
        class225.field3928 = null;
        class171.field2994 = null;
        class5.field101 = null;
        class157.field2696 = null;
        class144.field2465 = null;
        class164.field2827 = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(JZII)Lmh;", line = 56)
    public static final class128 method548(long arg0, boolean arg1, int arg2, int arg3) {
        field1517++;
        if (arg2 < arg3 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        long var5 = arg0 / (long) arg2;
        int var7 = 1;
        while (var5 != 0L) {
            var5 /= (long) arg2;
            var7++;
        }
        int var8 = var7;
        if (arg0 < 0L || arg1) {
            var8 = var7 + 1;
        }
        byte[] var9 = new byte[var8];
        if (arg0 < 0L) {
            var9[0] = 45;
        } else if (arg1) {
            var9[0] = 43;
        }
        for (int var10 = 0; var10 < var7; var10++) {
            int var11 = (int) (arg0 % (long) arg2);
            arg0 /= (long) arg2;
            if (var11 < 0) {
                var11 = -var11;
            }
            if (var11 > 9) {
                var11 += 39;
            }
            var9[var8 - var10 - 1] = (byte) (var11 + 48);
        }
        class128 var12 = new class128();
        var12.field2181 = var8;
        var12.field2224 = var9;
        return var12;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)V", line = 121)
    public static final void method549(int arg0, int arg1) {
        class294.field5028.method1833(arg0, (byte) 95);
        field1516++;
        class222.field3897.method1833(arg0, (byte) 105);
        if (arg1 != -1) {
            method547(-81);
        }
        class223.field3907.method1833(arg0, (byte) 124);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BJ)V", line = 136)
    public static final void method550(byte arg0, long arg1) {
        if (arg0 <= 5) {
            return;
        }
        field1513++;
        if (arg1 != 0L) {
            class71.field1320.method570(118, -1);
            class71.field1320.method1344(45, arg1);
            class299.field5094++;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(II[[F[II[[FLwc;[[FBLhi;[[I)V", line = 162)
    public static final void method551(int arg0, int arg1, float[][] arg2, int[] arg3, int arg4, float[][] arg5, class97 arg6, float[][] arg7, byte arg8, class280 arg9, int[][] arg10) {
        field1511++;
        int[] var11 = new int[arg3.length / 2];
        if (arg8 != 43) {
            field1512 = -70;
        }
        for (int var12 = 0; var12 < var11.length; var12++) {
            int var13 = arg3[var12 + var12 + 1];
            int var14 = arg3[var12 + var12];
            if (arg0 == 1) {
                int var16 = var14;
                var14 = var13;
                var13 = 128 - var16;
            } else if (arg0 == 2) {
                var13 = 128 - var13;
                var14 = 128 - var14;
            } else if (arg0 == 3) {
                int var15 = var14;
                var14 = 128 - var13;
                var13 = var15;
            }
            float var17;
            float var18;
            float var19;
            if (var14 == 0 && var13 == 0) {
                var17 = arg2[arg4][arg1];
                var18 = arg7[arg4][arg1];
                var19 = arg5[arg4][arg1];
            } else if (var14 == 128 && var13 == 0) {
                var18 = arg7[arg4 + 1][arg1];
                var17 = arg2[arg4 + 1][arg1];
                var19 = arg5[arg4 + 1][arg1];
            } else if (var14 == 128 && var13 == 128) {
                var19 = arg5[arg4 + 1][arg1 + 1];
                var17 = arg2[arg4 + 1][arg1 + 1];
                var18 = arg7[arg4 + 1][arg1 + 1];
            } else if (var14 == 0 && var13 == 128) {
                var19 = arg5[arg4][arg1 + 1];
                var17 = arg2[arg4][arg1 + 1];
                var18 = arg7[arg4][arg1 + 1];
            } else {
                float var20 = arg2[arg4][arg1];
                float var21 = arg5[arg4][arg1];
                float var22 = arg7[arg4][arg1 + 1];
                float var23 = (float) var13 / 128.0F;
                float var24 = arg5[arg4][arg1 + 1];
                float var25 = arg7[arg4][arg1];
                float var26 = arg2[arg4][arg1 + 1];
                float var27 = (float) var14 / 128.0F;
                float var28 = (arg7[arg4 + 1][arg1 + 1] - var22) * var27 + var22;
                float var29 = (arg2[arg4 + 1][arg1 + 1] - var26) * var27 + var26;
                float var30 = (arg5[arg4 + 1][arg1 + 1] - var24) * var27 + var24;
                float var31 = (arg2[arg4 + 1][arg1] - var20) * var27 + var20;
                float var32 = (arg7[arg4 + 1][arg1] - var25) * var27 + var25;
                float var33 = (arg5[arg4 + 1][arg1] - var21) * var27 + var21;
                var19 = (var30 - var33) * var23 + var33;
                var17 = (var29 - var31) * var23 + var31;
                var18 = (var28 - var32) * var23 + var32;
            }
            int var34 = (arg4 << 7) + var14;
            int var35 = (arg1 << 7) + var13;
            int var36 = class74.method486(var14, arg10, 68, arg4, arg1, var13);
            var11[var12] = arg9.method1959(arg6, var34, var36, var35, var18, var17, var19);
        }
        arg9.method1957(var11);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZIIIIII)I", line = 280)
    public static final int method552(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg5 & 0x1) == 1) {
            int var7 = arg1;
            arg1 = arg3;
            arg3 = var7;
        }
        int var8 = arg2 & 0x3;
        field1515++;
        if (var8 == 0) {
            return arg6;
        } else if (var8 == 1) {
            return 1 + 7 - arg1 - arg4;
        } else if (arg0) {
            return var8 == 2 ? 7 - (arg3 - 1) - arg6 : arg4;
        } else {
            return 52;
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(B)V", line = 311)
    public static void method553(byte arg0) {
        if (arg0 != -30) {
            method554(123, -34, -109, (byte[][][]) ((byte[][][]) null), -91, (byte) 30, -112, 110);
        }
        field1507 = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(III[[[BIBII)V", line = 324)
    public static final void method554(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class99.field1712++;
        class3.field56 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class255.field4392; var12 < class130.field2271; var12++) {
            class150[][] var13 = class182.field3184[var12];
            for (int var14 = class170.field2972; var14 < class181.field3172; var14++) {
                for (int var15 = class96.field1631; var15 < class115.field1939; var15++) {
                    class150 var16 = var13[var14][var15];
                    if (var16 != null) {
                        if (class183.field3211[var14 + class96.field1634 - class145.field2488][var15 + class96.field1634 - class217.field3813] && (arg3 == null || var12 < arg4 || arg3[var12][var14][var15] != arg5)) {
                            var16.field2574 = true;
                            var16.field2583 = true;
                            if (var16.field2576 > 0) {
                                var16.field2573 = true;
                            } else {
                                var16.field2573 = false;
                            }
                            class3.field56++;
                        } else {
                            var16.field2574 = false;
                            var16.field2583 = false;
                            var16.field2588 = 0;
                            if (var14 >= var8 && var14 <= var9 && var15 >= var10 && var15 <= var11) {
                                if (var16.field2571 != null) {
                                    class65 var17 = var16.field2571;
                                    var17.field1252.method1553(var17.field1249, 80, var17.field1261, var17.field1249, var17.field1261);
                                    if (var17.field1251 != null) {
                                        var17.field1251.method1553(var17.field1249, -117, var17.field1261, var17.field1249, var17.field1261);
                                    }
                                }
                                if (var16.field2565 != null) {
                                    class161 var18 = var16.field2565;
                                    var18.field2761.method1553(var18.field2749, -118, var18.field2741, var18.field2749, var18.field2741);
                                    if (var18.field2764 != null) {
                                        var18.field2764.method1553(var18.field2749, 107, var18.field2741, var18.field2749, var18.field2741);
                                    }
                                }
                                if (var16.field2586 != null) {
                                    class92 var19 = var16.field2586;
                                    var19.field1572.method1553(var19.field1563, -121, var19.field1567, var19.field1563, var19.field1567);
                                }
                                if (var16.field2575 != null) {
                                    for (int var20 = 0; var20 < var16.field2576; var20++) {
                                        class5 var21 = var16.field2575[var20];
                                        var21.field105.method1553(var21.field96, 70, var21.field88, var21.field92, var21.field86);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var22 = class308.field5227 == class250.field4334;
        if (class247.field4247) {
            GL var23 = class247.field4253;
            var23.glPushMatrix();
            var23.glTranslatef((float) (-arg0), (float) (-arg1), (float) (-arg2));
            if (var22) {
                class198.method1376();
                class217.method1498((byte) -29, -1, 3);
                class287.field4916 = true;
                class277.method1941();
                class166.field2855 = -1;
                class211.field3738 = -1;
                for (int var24 = 0; var24 < class112.field1885[0].length; var24++) {
                    class154 var25 = class112.field1885[0][var24];
                    float var26 = 251.5F - (var25.field2651 ? 1.0F : 0.5F);
                    if (class166.field2855 != var25.field2656) {
                        class166.field2855 = var25.field2656;
                        class301.method2049(2, var25.field2656);
                        class119.method722(class70.method468((byte) 21));
                    }
                    var25.method1023(class182.field3184, var26, false);
                }
                class277.method1939();
            } else {
                int var27 = class255.field4392;
                while (true) {
                    if (var27 >= class130.field2271) {
                        class46.method317(class145.field2488, class217.field3813, class182.field3184);
                        break;
                    }
                    for (int var28 = 0; var28 < class112.field1885[var27].length; var28++) {
                        class154 var29 = class112.field1885[var27][var28];
                        float var30 = 201.5F - (float) var27 * 50.0F - (var29.field2651 ? 1.0F : 0.5F);
                        if (var29.field2637 != -1 && class141.field2419.method101(var29.field2637, -77) == 4 && class240.field4101) {
                            class301.method2049(2, var29.field2656);
                        }
                        var29.method1023(class182.field3184, var30, false);
                    }
                    if (var27 == 0 && class182.field3197 > 0) {
                        class247.method1718(101.5F);
                        class312.method2118(class145.field2488, class217.field3813, class96.field1634, arg1, class183.field3211, class250.field4334[0]);
                    }
                    var27++;
                }
            }
            var23.glPopMatrix();
        }
        for (int var31 = class255.field4392; var31 < class130.field2271; var31++) {
            class150[][] var32 = class182.field3184[var31];
            for (int var33 = -class96.field1634; var33 <= 0; var33++) {
                int var34 = class145.field2488 + var33;
                int var35 = class145.field2488 - var33;
                if (var34 >= class170.field2972 || var35 < class181.field3172) {
                    for (int var36 = -class96.field1634; var36 <= 0; var36++) {
                        int var37 = class217.field3813 + var36;
                        int var38 = class217.field3813 - var36;
                        if (var34 >= class170.field2972) {
                            if (var37 >= class96.field1631) {
                                class150 var39 = var32[var34][var37];
                                if (var39 != null && var39.field2574) {
                                    class152.method1011(var39, true);
                                }
                            }
                            if (var38 < class115.field1939) {
                                class150 var40 = var32[var34][var38];
                                if (var40 != null && var40.field2574) {
                                    class152.method1011(var40, true);
                                }
                            }
                        }
                        if (var35 < class181.field3172) {
                            if (var37 >= class96.field1631) {
                                class150 var41 = var32[var35][var37];
                                if (var41 != null && var41.field2574) {
                                    class152.method1011(var41, true);
                                }
                            }
                            if (var38 < class115.field1939) {
                                class150 var42 = var32[var35][var38];
                                if (var42 != null && var42.field2574) {
                                    class152.method1011(var42, true);
                                }
                            }
                        }
                        if (class3.field56 == 0) {
                            if (!var22) {
                                class173.field3065 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var43 = class255.field4392; var43 < class130.field2271; var43++) {
            class150[][] var44 = class182.field3184[var43];
            for (int var45 = -class96.field1634; var45 <= 0; var45++) {
                int var46 = class145.field2488 + var45;
                int var47 = class145.field2488 - var45;
                if (var46 >= class170.field2972 || var47 < class181.field3172) {
                    for (int var48 = -class96.field1634; var48 <= 0; var48++) {
                        int var49 = class217.field3813 + var48;
                        int var50 = class217.field3813 - var48;
                        if (var46 >= class170.field2972) {
                            if (var49 >= class96.field1631) {
                                class150 var51 = var44[var46][var49];
                                if (var51 != null && var51.field2574) {
                                    class152.method1011(var51, false);
                                }
                            }
                            if (var50 < class115.field1939) {
                                class150 var52 = var44[var46][var50];
                                if (var52 != null && var52.field2574) {
                                    class152.method1011(var52, false);
                                }
                            }
                        }
                        if (var47 < class181.field3172) {
                            if (var49 >= class96.field1631) {
                                class150 var53 = var44[var47][var49];
                                if (var53 != null && var53.field2574) {
                                    class152.method1011(var53, false);
                                }
                            }
                            if (var50 < class115.field1939) {
                                class150 var54 = var44[var47][var50];
                                if (var54 != null && var54.field2574) {
                                    class152.method1011(var54, false);
                                }
                            }
                        }
                        if (class3.field56 == 0) {
                            if (!var22) {
                                class173.field3065 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class173.field3065 = false;
    }
}
