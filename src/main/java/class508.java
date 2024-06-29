import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class508 {

    @OriginalMember(owner = "client!ip", name = "i", descriptor = "I")
    private int field7512 = 0;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "I")
    public int field7504 = -1;

    @OriginalMember(owner = "client!ip", name = "q", descriptor = "Z")
    public boolean field7520 = false;

    @OriginalMember(owner = "client!ip", name = "l", descriptor = "I")
    private int field7515 = 128;

    @OriginalMember(owner = "client!ip", name = "u", descriptor = "I")
    private int field7524 = -1;

    @OriginalMember(owner = "client!ip", name = "j", descriptor = "B")
    public byte field7513 = 0;

    @OriginalMember(owner = "client!ip", name = "e", descriptor = "I")
    private int field7508 = 0;

    @OriginalMember(owner = "client!ip", name = "r", descriptor = "I")
    private int field7521 = 128;

    @OriginalMember(owner = "client!ip", name = "o", descriptor = "I")
    private int field7518 = 0;

    @OriginalMember(owner = "client!ip", name = "w", descriptor = "I")
    public static int field7526 = 0;

    @OriginalMember(owner = "client!ip", name = "k", descriptor = "Ltn;")
    public static class60 field7514 = new class60(29, 3);

    @OriginalMember(owner = "client!ip", name = "C", descriptor = "Z")
    public static boolean field7531 = false;

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "I")
    public static int field7505;

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "I")
    public static int field7506;

    @OriginalMember(owner = "client!ip", name = "g", descriptor = "I")
    public static int field7510;

    @OriginalMember(owner = "client!ip", name = "h", descriptor = "I")
    public int field7511;

    @OriginalMember(owner = "client!ip", name = "p", descriptor = "I")
    public static int field7519;

    @OriginalMember(owner = "client!ip", name = "s", descriptor = "I")
    public static int field7522;

    @OriginalMember(owner = "client!ip", name = "t", descriptor = "I")
    public static int field7523;

    @OriginalMember(owner = "client!ip", name = "v", descriptor = "I")
    public static int field7525;

    @OriginalMember(owner = "client!ip", name = "y", descriptor = "I")
    public static int field7528;

    @OriginalMember(owner = "client!ip", name = "z", descriptor = "I")
    private int field7529;

    @OriginalMember(owner = "client!ip", name = "B", descriptor = "Liu;")
    public class415 field7530;

    @OriginalMember(owner = "client!ip", name = "f", descriptor = "[S")
    private short[] field7509;

    @OriginalMember(owner = "client!ip", name = "m", descriptor = "[S")
    private short[] field7516;

    @OriginalMember(owner = "client!ip", name = "n", descriptor = "[S")
    private short[] field7517;

    @OriginalMember(owner = "client!ip", name = "x", descriptor = "[S")
    private short[] field7527;

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "[[I")
    public static int[][] field7507;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(ILwm;I)V")
    private final void method3028(int arg0, class403 arg1, int arg2) {
        if (arg0 != 289203325) {
            this.field7513 = 32;
        }
        if (arg2 == 1) {
            this.field7529 = arg1.method2338(0);
        } else if (arg2 == 2) {
            this.field7504 = arg1.method2338(arg0 ^ 0x113CE47D);
        } else if (arg2 == 4) {
            this.field7521 = arg1.method2338(0);
        } else if (arg2 == 5) {
            this.field7515 = arg1.method2338(0);
        } else if (arg2 == 6) {
            this.field7508 = arg1.method2338(0);
        } else if (arg2 == 7) {
            this.field7518 = arg1.method2357((byte) 124);
        } else if (arg2 == 8) {
            this.field7512 = arg1.method2357((byte) 108);
        } else if (arg2 == 9) {
            this.field7513 = 3;
            this.field7524 = 8224;
        } else if (arg2 == 10) {
            this.field7520 = true;
        } else if (arg2 == 11) {
            this.field7513 = 1;
        } else if (arg2 == 12) {
            this.field7513 = 4;
        } else if (arg2 == 13) {
            this.field7513 = 5;
        } else if (arg2 == 14) {
            this.field7513 = 2;
            this.field7524 = arg1.method2357((byte) 105) * 256;
        } else if (arg2 == 15) {
            this.field7513 = 3;
            this.field7524 = arg1.method2338(arg0 - 289203325);
        } else if (arg2 == 16) {
            this.field7513 = 3;
            this.field7524 = arg1.method2319((byte) 87);
        } else if (arg2 == 40) {
            int var4 = arg1.method2357((byte) 106);
            this.field7517 = new short[var4];
            this.field7516 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field7516[var5] = (short) arg1.method2338(class509.method3039(arg0, 289203325));
                this.field7517[var5] = (short) arg1.method2338(arg0 - 289203325);
            }
        } else if (arg2 == 41) {
            int var6 = arg1.method2357((byte) 107);
            this.field7509 = new short[var6];
            this.field7527 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field7509[var7] = (short) arg1.method2338(0);
                this.field7527[var7] = (short) arg1.method2338(class509.method3039(arg0, 289203325));
            }
        }
        field7510++;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(ILza;II)V")
    public static final void method3029(int arg0, class290 arg1, int arg2, int arg3) {
        field7505++;
        if (arg3 < 0 || arg2 < 0 || class338.field4885 == 0 || class127.field1712 == 0) {
            return;
        }
        arg1.method390(class215.field3118, class78.field1023, class338.field4885, class127.field1712);
        arg1.method301(class202.field2889, class230.field3390, class338.field4885, class127.field1712);
        class125 var4 = arg1.method358();
        var4.method822(class264.field3879, class74.field904, class397.field5621, class461.field6446, class75.field922, class119.field1638);
        arg1.method367(var4);
        if (class68.field858 != null) {
            int var5 = -1;
            int var6 = -1;
            int var7 = arg1.method309();
            int var8 = (arg3 - class215.field3118) * var7 / class338.field4885;
            int var9 = (arg2 - class78.field1023) * var7 / class127.field1712;
            int var10 = arg1.method357();
            int var11 = (arg3 - class215.field3118) * var10 / class338.field4885;
            int var12 = (arg2 - class78.field1023) * var10 / class127.field1712;
            int[] var13 = new int[] { var8, var9, var7 };
            var4.method820(var13);
            int[] var14 = new int[] { var11, var12, var10 };
            var4.method820(var14);
            float var15 = 0.0F;
            int var16 = var14[0] - var13[0];
            int var17 = var14[1] - var13[1];
            int var18 = var14[2] - var13[2];
            while (var15 < 1.0F) {
                int var19 = (int) ((float) var16 * var15 + (float) var13[0]);
                int var20 = var19 >> 7;
                int var21 = (int) ((float) var18 * var15 + (float) var13[2]);
                int var22 = var21 >> 7;
                if (var20 > 0 && var22 > 0 && class43.field494 > var20 && var22 < class500.field7068) {
                    int var23 = class246.field3587.field1904;
                    if (var23 < 3 && (class368.field5253[1][var20][var22] & 0x2) != 0) {
                        var23++;
                    }
                    if ((float) class68.field858[var23].method11(var19, var21) < (float) var17 * var15 + (float) var13[1]) {
                        var5 = (class246.field3587.method125((byte) -108) - 1 << 6) + var19 >> 7;
                        var6 = var21 + (class246.field3587.method125((byte) -117) - 1 << 6) >> 7;
                        break;
                    }
                }
                var15 = (float) ((double) var15 + 0.01D);
            }
            if (var5 != -1 && var6 != -1) {
                if (class427.field6024 && (class180.field2579 & 0x40) != 0) {
                    class150 var24 = class343.method2046(class235.field3424, 0, class231.field3397);
                    if (var24 == null) {
                        class235.method1439(-74);
                    } else {
                        class509.method3042(0L, class380.field5366, 6, " ->", var5, class474.field6601, false, var6, 23, true, -1);
                    }
                } else {
                    if (class71.field886 == class246.field3594) {
                        class509.method3042(0L, class62.field781.method3116(class149.field1979, (byte) 95), 6, "", var5, -1, false, var6, 5, true, -1);
                    }
                    class509.method3042(0L, class225.field3240, 6, "", var5, class295.field4330, false, var6, 6, true, -1);
                    class482.field6718++;
                }
            }
        }
        if (arg0 >= -4) {
            field7526 = -63;
        }
        class477 var25 = class22.field286;
        for (class170 var26 = (class170) var25.method2748(2); var26 != null; var26 = (class170) var25.method2751(-16195)) {
            if ((class476.field6632 || class246.field3587.field1904 == var26.field2474) && var26.method1068(arg3, arg1, arg2, 75)) {
                if (var26.field2470 instanceof class22) {
                    class22 var27 = (class22) var26.field2470;
                    int var28 = var27.method125((byte) -114);
                    if ((var28 & 0x1) == 0 && (var27.field1896 & 0x7F) == 0 && (var27.field1899 & 0x7F) == 0 || (var28 & 0x1) == 1 && (var27.field1896 & 0x7F) == 64 && (var27.field1899 & 0x7F) == 64) {
                        int var29 = var27.field1896 - (var27.method125((byte) -87) - 1 << 6);
                        int var30 = var27.field1899 - (var27.method125((byte) -108) - 1 << 6);
                        for (int var31 = 0; var31 < class434.field6110; var31++) {
                            class378 var38 = (class378) class125.field1687.method2405((long) class488.field6834[var31], -86);
                            if (var38 != null) {
                                class429 var39 = var38.field5353;
                                if (class390.field5481 != var39.field3308 && var39.field3354) {
                                    int var40 = var39.field1896 - (var39.field6055.field4711 - 1 << 6);
                                    int var41 = var39.field1899 - (var39.field6055.field4711 - 1 << 6);
                                    if (var29 <= var40 && var39.field6055.field4711 <= (var27.method125((byte) -124) - (var40 - var29 >> 7)) && var41 >= var30 && var39.field6055.field4711 <= var27.method125((byte) -117) - (var41 - var30 >> 7)) {
                                        class189.method1208(false, class246.field3587.field1904 != var26.field2474, var39);
                                        var39.field3308 = class390.field5481;
                                    }
                                }
                            }
                        }
                        int var32 = class144.field1908;
                        int[] var33 = class521.field7674;
                        for (int var34 = 0; var34 < var32; var34++) {
                            class22 var35 = class378.field5355[var33[var34]];
                            if (var35 != null && class390.field5481 != var35.field3308 && var27 != var35 && var35.field3354) {
                                int var36 = var35.field1896 - (var35.method125((byte) -85) - 1 << 6);
                                int var37 = var35.field1899 - (var35.method125((byte) -103) - 1 << 6);
                                if (var36 >= var29 && var35.method125((byte) -109) <= var27.method125((byte) -82) - (var36 - var29 >> 7) && var37 >= var30 && var35.method125((byte) -94) <= (var27.method125((byte) -109) - (var37 - var30 >> 7))) {
                                    class535.method3149(var35, class246.field3587.field1904 != var26.field2474, (byte) 85);
                                    var35.field3308 = class390.field5481;
                                }
                            }
                        }
                    }
                    if (class390.field5481 == var27.field3308) {
                        continue;
                    }
                    class535.method3149(var27, class246.field3587.field1904 != var26.field2474, (byte) 119);
                    var27.field3308 = class390.field5481;
                }
                if (var26.field2470 instanceof class429) {
                    class429 var42 = (class429) var26.field2470;
                    if (var42.field6055 != null) {
                        if ((var42.field6055.field4711 & 0x1) == 0 && (var42.field1896 & 0x7F) == 0 && (var42.field1899 & 0x7F) == 0 || (var42.field6055.field4711 & 0x1) == 1 && (var42.field1896 & 0x7F) == 64 && (var42.field1899 & 0x7F) == 64) {
                            int var43 = var42.field1896 - (var42.field6055.field4711 - 1 << 6);
                            int var44 = var42.field1899 - (var42.field6055.field4711 - 1 << 6);
                            for (int var45 = 0; var45 < class434.field6110; var45++) {
                                class378 var52 = (class378) class125.field1687.method2405((long) class488.field6834[var45], -79);
                                if (var52 != null) {
                                    class429 var53 = var52.field5353;
                                    if (class390.field5481 != var53.field3308 && var42 != var53 && var53.field3354) {
                                        int var54 = var53.field1896 - (var53.field6055.field4711 - 1 << 6);
                                        int var55 = var53.field1899 - (var53.field6055.field4711 - 1 << 6);
                                        if (var54 >= var43 && var53.field6055.field4711 <= var42.field6055.field4711 - (var54 - var43 >> 7) && var44 <= var55 && var42.field6055.field4711 - (var55 - var44 >> 7) >= var53.field6055.field4711) {
                                            class189.method1208(false, class246.field3587.field1904 != var26.field2474, var53);
                                            var53.field3308 = class390.field5481;
                                        }
                                    }
                                }
                            }
                            int var46 = class144.field1908;
                            int[] var47 = class521.field7674;
                            for (int var48 = 0; var48 < var46; var48++) {
                                class22 var49 = class378.field5355[var47[var48]];
                                if (var49 != null && class390.field5481 != var49.field3308 && var49.field3354) {
                                    int var50 = var49.field1896 - (var49.method125((byte) -103) - 1 << 6);
                                    int var51 = var49.field1899 - (var49.method125((byte) -114) - 1 << 6);
                                    if (var43 <= var50 && var49.method125((byte) -74) <= (var42.field6055.field4711 - (var50 - var43 >> 7)) && var44 <= var51 && var49.method125((byte) -80) <= var42.field6055.field4711 - (var51 - var44 >> 7)) {
                                        class535.method3149(var49, class246.field3587.field1904 != var26.field2474, (byte) 94);
                                        var49.field3308 = class390.field5481;
                                    }
                                }
                            }
                        }
                        if (class390.field5481 == var42.field3308) {
                            continue;
                        }
                        class189.method1208(false, class246.field3587.field1904 != var26.field2474, var42);
                        var42.field3308 = class390.field5481;
                    }
                }
                if (var26.field2470 instanceof class430) {
                    int var56 = class441.field6171 + var26.field2471;
                    int var57 = class367.field5241 + var26.field2472;
                    class176 var58 = (class176) class62.field773.method2405((long) (var56 | var26.field2474 << 28 | var57 << 14), -111);
                    if (var58 != null) {
                        for (class25 var59 = (class25) var58.field2531.method2662((byte) -74); var59 != null; var59 = (class25) var58.field2531.method2667(4096)) {
                            class395 var60 = class344.field5000.method993(var59.field309, true);
                            if (!class427.field6024) {
                                if (class246.field3587.field1904 == var26.field2474) {
                                    String[] var62 = var60.field5594;
                                    for (int var63 = 4; var63 >= 0; var63--) {
                                        if (var62 != null && var62[var63] != null) {
                                            byte var64 = 0;
                                            if (var63 == 0) {
                                                var64 = 15;
                                            }
                                            int var65 = class71.field885;
                                            if (var63 == 1) {
                                                var64 = 2;
                                            }
                                            if (var63 == 2) {
                                                var64 = 59;
                                            }
                                            if (var63 == 3) {
                                                var64 = 49;
                                            }
                                            if (var63 == 4) {
                                                var64 = 13;
                                            }
                                            if (var60.field5582 == var63) {
                                                var65 = var60.field5574;
                                            }
                                            if (var60.field5551 == var63) {
                                                var65 = var60.field5610;
                                            }
                                            class366.field5232++;
                                            class509.method3042((long) var59.field309, var62[var63], 6, "<col=ff9040>" + var60.field5587, var26.field2471, var65, false, var26.field2472, var64, true, -1);
                                        }
                                    }
                                }
                                class464.field6480++;
                                class509.method3042((long) var59.field309, class75.field980.method3116(class149.field1979, (byte) 117), 6, "<col=ff9040>" + var60.field5587, var26.field2471, class318.field4601, class246.field3587.field1904 != var26.field2474, var26.field2472, 1006, true, -1);
                            } else if (class246.field3587.field1904 == var26.field2474) {
                                class412 var61 = class319.field4621 == -1 ? null : class454.field6365.method1995(12, class319.field4621);
                                if ((class180.field2579 & 0x1) != 0 && (var61 == null || var60.method2285((byte) -63, var61.field5823, class319.field4621) != var61.field5823)) {
                                    class383.field5390++;
                                    class509.method3042((long) var59.field309, class380.field5366, 6, class431.field6089 + " -> <col=ff9040>" + var60.field5587, var26.field2471, class474.field6601, false, var26.field2472, 47, true, -1);
                                }
                            }
                        }
                    }
                }
                if (var26.field2470 instanceof class21) {
                    class21 var66 = (class21) var26.field2470;
                    class270 var67 = class377.field5338.method1901(50, var66.method110((byte) 109));
                    if (var67.field3998 != null) {
                        var67 = var67.method1704((byte) 119, class163.field2413);
                    }
                    if (var67 != null) {
                        if (!class427.field6024) {
                            if (class246.field3587.field1904 == var26.field2474) {
                                String[] var68 = var67.field3996;
                                if (var68 != null) {
                                    for (int var69 = 4; var69 >= 0; var69--) {
                                        if (var68[var69] != null) {
                                            short var70 = 0;
                                            if (var69 == 0) {
                                                var70 = 45;
                                            }
                                            int var71 = class71.field885;
                                            if (var69 == 1) {
                                                var70 = 60;
                                            }
                                            if (var69 == 2) {
                                                var70 = 4;
                                            }
                                            if (var69 == 3) {
                                                var70 = 18;
                                            }
                                            if (var69 == 4) {
                                                var70 = 1001;
                                            }
                                            if (var67.field3942 == var69) {
                                                var71 = var67.field4001;
                                            }
                                            if (var67.field3984 == var69) {
                                                var71 = var67.field3969;
                                            }
                                            class447.field6240++;
                                            class509.method3042(class372.method2181(1355778465, var26.field2472, var66, var26.field2471), var68[var69], 6, "<col=00ffff>" + var67.field3979, var26.field2471, var71, false, var26.field2472, var70, true, -1);
                                        }
                                    }
                                }
                            }
                            class84.field1061++;
                            class509.method3042((long) var67.field3952, class75.field980.method3116(class149.field1979, (byte) 122), 6, "<col=00ffff>" + var67.field3979, var26.field2471, class318.field4601, class246.field3587.field1904 != var26.field2474, var26.field2472, 1002, true, -1);
                        } else if (class246.field3587.field1904 == var26.field2474) {
                            class412 var72 = class319.field4621 == -1 ? null : class454.field6365.method1995(12, class319.field4621);
                            if ((class180.field2579 & 0x4) != 0 && (var72 == null || var67.method1706(var72.field5823, (byte) -97, class319.field4621) != var72.field5823)) {
                                class53.field665++;
                                class509.method3042(class372.method2181(1355778465, var26.field2472, var66, var26.field2471), class380.field5366, 6, class431.field6089 + " -> <col=00ffff>" + var67.field3979, var26.field2471, class474.field6601, false, var26.field2472, 8, true, -1);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(ILcf;Lya;Lya;ZIIILza;IIII)Le;")
    public final class377 method3030(int arg0, class437 arg1, class38 arg2, class38 arg3, boolean arg4, int arg5, int arg6, int arg7, class290 arg8, int arg9, int arg10, int arg11, int arg12) {
        if (arg7 != -2255) {
            field7526 = -15;
        }
        field7523++;
        return this.method3032(arg4, arg8, arg12, arg3, arg5, arg0, arg9, (byte) 2, arg10, arg2, arg1, arg6, arg11, -17476);
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIB)Z")
    public static final boolean method3031(int arg0, int arg1, byte arg2) {
        if (arg2 != -2) {
            method3029(-68, null, 91, 88);
        }
        field7519++;
        return (class476.method2743(arg0, (byte) 90, arg1) | class220.method1364(arg1, (byte) -3, arg0) | class426.method2524(arg1, 113, arg0)) & class342.method2037(2048, arg0, arg1);
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(ZLza;ILya;IIIBILya;Lcf;III)Le;")
    private final class377 method3032(boolean arg0, class290 arg1, int arg2, class38 arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, class38 arg9, class437 arg10, int arg11, int arg12, int arg13) {
        field7506++;
        int var15 = arg5;
        class449 var16 = this.field7504 == -1 || arg4 == -1 ? null : arg10.method2566(this.field7504, -19);
        boolean var17 = arg0 & this.field7513 != 0;
        if (var16 != null) {
            var15 = arg5 | var16.method2629(arg12, false, arg4, (byte) -59);
        }
        if (var17) {
            var15 |= this.field7513 == 3 ? 7 : 2;
        }
        if (this.field7515 != 128) {
            var15 |= 0x2;
        }
        if (this.field7521 != 128 || this.field7508 != 0) {
            var15 |= 0x5;
        }
        class174 var18 = this.field7530.field5860;
        class377 var19;
        synchronized (this.field7530.field5860) {
            if (arg13 != -17476) {
                this.field7521 = 127;
            }
            var19 = (class377) this.field7530.field5860.method1088((long) (this.field7511 |= arg1.field4237 << 29), (byte) -110);
        }
        if (var19 == null || arg1.method324(var19.method1605(), var15) != 0) {
            if (var19 != null) {
                var15 = arg1.method302(var15, var19.method1605());
            }
            int var20 = var15;
            if (this.field7516 != null) {
                var20 = var15 | 0x4000;
            }
            if (this.field7509 != null) {
                var20 |= 0x8000;
            }
            class117 var21 = class488.method2813(this.field7530.field5857, 0, this.field7529, -1);
            if (var21 == null) {
                return null;
            }
            if (var21.field1605 < 13) {
                var21.method789(0, 0);
            }
            var19 = arg1.method293(var21, var20, this.field7530.field5862, this.field7518 + 64, this.field7512 + 850);
            if (this.field7516 != null) {
                for (int var22 = 0; var22 < this.field7516.length; var22++) {
                    var19.method1570(this.field7516[var22], this.field7517[var22]);
                }
            }
            if (this.field7509 != null) {
                for (int var23 = 0; var23 < this.field7509.length; var23++) {
                    var19.method1582(this.field7509[var23], this.field7527[var23]);
                }
            }
            var19.method1606(var15);
            class174 var24 = this.field7530.field5860;
            synchronized (this.field7530.field5860) {
                this.field7530.field5860.method1097(19627, var19, (long) (this.field7511 |= arg1.field4237 << 29));
            }
        }
        class377 var25 = var16 == null ? var19.method1590(arg7, var15, true) : var16.method2622(arg12, var15, var19, arg8, arg4, (byte) 99, 0, arg7);
        if (this.field7521 != 128 || this.field7515 != 128) {
            var25.method1610(this.field7521, this.field7515, this.field7521);
        }
        if (this.field7508 != 0) {
            if (this.field7508 == 90) {
                var25.method1612(4096);
            }
            if (this.field7508 == 180) {
                var25.method1612(8192);
            }
            if (this.field7508 == 270) {
                var25.method1612(12288);
            }
        }
        if (var17) {
            var25.method1592(this.field7513, this.field7524, arg9, arg3, arg11, arg6, arg2);
        }
        var25.method1606(arg5);
        return var25;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IBLza;IIILcf;)Le;")
    public final class377 method3033(int arg0, byte arg1, class290 arg2, int arg3, int arg4, int arg5, class437 arg6) {
        if (arg1 != -10) {
            this.method3032(false, null, -83, null, -8, 48, 97, (byte) -95, -88, null, null, -13, -35, 59);
        }
        field7525++;
        return this.method3032(false, arg2, 0, null, arg3, arg4, 0, (byte) 2, arg0, null, arg6, 0, arg5, -17476);
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Z)V")
    public static void method3034(boolean arg0) {
        if (arg0) {
            method3034(true);
        }
        field7507 = null;
        field7514 = null;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(ILwm;)V")
    public final void method3035(int arg0, class403 arg1) {
        if (arg0 != -59) {
            this.field7509 = null;
        }
        field7522++;
        while (true) {
            int var3 = arg1.method2357((byte) 108);
            if (var3 == 0) {
                return;
            }
            this.method3028(289203325, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIIILza;Lcf;I)Le;")
    public final class377 method3036(int arg0, int arg1, int arg2, int arg3, class290 arg4, class437 arg5, int arg6) {
        field7528++;
        int var8 = 35 / ((arg2 + 9) / 52);
        return this.method3032(false, arg4, 0, null, arg3, arg6, 0, (byte) 5, arg0, null, arg5, 0, arg1, -17476);
    }
}
