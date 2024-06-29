import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class381 extends class88 {

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "Llba;")
    public class225 field5335;

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "I")
    public static int field5334 = 503;

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "I")
    public static int field5340 = 0;

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "I")
    public static int field5338 = -1;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
    public static int field5331;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "I")
    public static int field5332;

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
    public static int field5333;

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "I")
    public static int field5336;

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "I")
    public static int field5337;

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "I")
    public static int field5339;

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "I")
    public static int field5341;

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "I")
    public static int field5342;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(III)Z", line = 5)
    public static final boolean method2294(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            method2298(40, 108, 61, -38, 12, 103, -98, 78, 91);
        }
        field5342++;
        return (arg0 & 0x18) != 0 | (arg0 & 0x220) == 544;
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(III)I", line = 22)
    public static final int method2295(int arg0, int arg1, int arg2) {
        if (arg0 != 27328) {
            field5340 = -46;
        }
        field5336++;
        int var3 = arg2 >> 31 & arg1 - 1;
        return ((arg2 >>> 31) + arg2) % arg1 + var3;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)Ltr;", line = 37)
    public static final class133 method2296(int arg0) {
        field5331++;
        if (arg0 != -1) {
            return null;
        }
        try {
            return (class133) Class.forName("hha").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I[BIIIIBI[B)V", line = 55)
    public static final void method2297(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, byte[] arg8) {
        field5339++;
        int var9 = -(arg7 >> 2);
        if (arg6 != -114) {
            method2296(-126);
        }
        int var10 = -(arg7 & 0x3);
        for (int var11 = -arg0; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg5++;
                arg1[var10001] += arg8[arg3++];
                int var14 = arg5++;
                arg1[var14] += arg8[arg3++];
                int var15 = arg5++;
                arg1[var15] += arg8[arg3++];
                int var16 = arg5++;
                arg1[var16] += arg8[arg3++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg5++;
                arg1[var10001] += arg8[arg3++];
            }
            arg5 += arg2;
            arg3 += arg4;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIIIIIII)V", line = 99)
    public static final void method2298(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg6 != -6968) {
            field5338 = -41;
        }
        field5333++;
        if (arg0 < 1 || arg7 < 1 || class192.field2891 - 2 < arg0 || arg7 > class456.field6225 - 2) {
            return;
        }
        int var9 = arg3;
        if (arg3 < 3 && class717.method3994(32281, arg0, arg7)) {
            var9 = arg3 + 1;
        }
        if (class420.field5820.field9495.method1677(arg6 ^ 0xFFFFA04B) == 0 && !class530.method3091(arg0, class112.field1620, -127, arg7, var9)) {
            return;
        }
        if (class514.field7096 == null) {
            return;
        }
        class465.field6343.method709(arg3, 26562, class605.field8591[arg3], arg0, arg7, arg1, class686.field9702);
        if (arg8 < 0) {
            return;
        }
        int var10 = class420.field5820.field9479.method288(17539);
        class420.field5820.method3781(class420.field5820.field9479, 124, 1);
        class465.field6343.method700(arg5, arg7, (byte) 122, arg3, var9, class605.field8591[arg3], arg0, class686.field9702, arg4, arg8, arg2);
        class420.field5820.method3781(class420.field5820.field9479, 101, var10);
        return;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(III[II[I[II[[[BBII[IB[IIZZ)V", line = 141)
    public static final void method2299(int arg0, int arg1, int arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int arg7, byte[][][] arg8, byte arg9, int arg10, int arg11, int[] arg12, byte arg13, int[] arg14, int arg15, boolean arg16, boolean arg17) {
        field5337++;
        if (class388.field5420 == -1) {
            return;
        }
        int[] var18 = class390.field5440.method459();
        int var19 = var18[0];
        int var20 = var18[1];
        int var21 = var18[2];
        if (arg13 != -57) {
            method2296(2);
        }
        int var22 = var18[3];
        int var23 = var21;
        int var24 = var22;
        if (class388.field5420 == 1) {
            var23 = (int) ((double) class483.field6679 * (double) var21 / (double) class278.field4016);
            var24 = (int) ((double) class483.field6679 * (double) var22 / (double) class278.field4016);
        }
        if (!class87.field1297) {
            if (class388.field5420 == 1) {
                class423.method2493(96);
            }
            int var25 = arg4 - class347.field4938;
            int var26 = arg10 - class599.field8547;
            int var27 = arg2 - class68.field1028;
            int var28 = (int) (((double) var27 * class147.field2361 + (double) var25 * class249.field3580 + (double) var26 * class233.field3385) * (double) var23 / (double) arg0);
            int var29 = (int) (((double) var27 * class286.field4205 + (double) var25 * class677.field9519 + (double) var26 * class465.field6339) * (double) var24 / (double) arg0);
            double var30 = (double) var27 * class498.field6853 + (double) var25 * class131.field2213 + (double) var26 * class141.field2313;
            int var32 = class790.field10813 + var28 - class76.field1154;
            int var33 = class621.field8770 + var29 - class778.field10674;
            int var34 = class183.field2780 + var32;
            int var35 = class483.field6679 + var33;
            if (!(var32 < 0 || var33 < 0 || var34 > class81.field1198 || var35 > class278.field4016) || class388.field5420 == 2) {
                class743.field10329 = var32;
                if (class388.field5420 == 2) {
                    class547.field7576 = -var30;
                }
                class65.field982 = var33;
            } else if (var34 > 0 && var35 > 0 && var32 < class81.field1198 && var33 < class278.field4016) {
                int var36 = var32 - class790.field10813;
                int var37 = var33 - class621.field8770;
                int var38 = 0;
                int var39 = 0;
                int var40 = 0;
                int var41 = 0;
                double var42 = 0.0D;
                if (class388.field5420 == 0) {
                    var38 = var36;
                    var42 = class547.field7576 + var30;
                    var39 = var37;
                } else if (class388.field5420 == 1) {
                    var41 = var37 / class36.field432;
                    var40 = var36 / class657.field9274;
                    var39 = class36.field432 * var41;
                    var38 = class657.field9274 * var40;
                    var42 = (class547.field7576 + var30) * (double) (var36 * var38 + var37 * var39) / (double) (var36 * var36 + var37 * var37);
                }
                double var44 = -var42;
                int var46 = 0;
                int var47 = 0;
                int var48 = 0;
                int var49 = 0;
                int var50 = 0;
                int var51;
                int var52;
                int var53;
                int var54;
                if (var38 < 0) {
                    var51 = class81.field1198 + var38;
                    var52 = -var38;
                    var53 = 0;
                    var54 = var52;
                    if (class388.field5420 == 1) {
                        var50 = -var40;
                        var48 = 0;
                    }
                } else {
                    var51 = class81.field1198 - var38;
                    var52 = 0;
                    var53 = var51;
                    if (class388.field5420 == 1) {
                        var50 = var40;
                        var48 = class448.field6176 - var40;
                    }
                    var54 = var38;
                }
                int var55 = 0;
                int var56;
                int var57;
                int var58;
                int var59;
                int var60;
                int var61;
                if (var39 < 0) {
                    var56 = -var39;
                    var57 = class278.field4016 + var39;
                    var58 = 0;
                    var59 = var56;
                    var60 = var57;
                    var61 = var56;
                    if (class388.field5420 == 1) {
                        var47 = -var41;
                        var46 = 0;
                        var55 = class600.field8557 + var41;
                        var49 = var47;
                    }
                } else {
                    var57 = class278.field4016 - var39;
                    var56 = 0;
                    var61 = 0;
                    var59 = var39;
                    var60 = var57;
                    var58 = var57;
                    if (class388.field5420 == 1) {
                        var46 = class600.field8557 - var41;
                        var49 = 0;
                        var47 = var41;
                        var55 = var46;
                    }
                }
                class271 var62 = class576.field8303.field10091;
                for (class162 var63 = (class162) var62.method1730((byte) 34); var63 != null; var63 = (class162) var62.method1729((byte) 100)) {
                    class749[] var69 = var63.field2500;
                    boolean var70 = true;
                    for (int var71 = 0; var71 < var69.length; var71++) {
                        class749 var72 = var69[var71];
                        int var73 = var72.field10403;
                        int var74 = var72.field10405;
                        int var75 = var72.field10402;
                        int var76 = var72.field10401;
                        int var77;
                        var72.field10405 = var77 = var74 - var39;
                        int var78 = var72.field10400;
                        int var79;
                        var72.field10403 = var79 = var73 - var38;
                        int var80;
                        var72.field10401 = var80 = var76 - var39;
                        int var81;
                        var72.field10402 = var81 = var75 - var38;
                        if (var70) {
                            int var82 = (var79 < var81 ? var79 : var81) - var78;
                            if (var82 <= class81.field1198) {
                                int var83 = (var80 > var77 ? var77 : var80) - var78;
                                if (class278.field4016 >= var83) {
                                    int var84 = var78 + (var81 <= var79 ? var79 : var81);
                                    if (var84 >= 0) {
                                        int var85 = var78 + (var80 <= var77 ? var77 : var80);
                                        if (var85 >= 0) {
                                            var70 = false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (var70) {
                        var63.method781(5555);
                        class432.method2588(var63, -124);
                    }
                }
                if (class388.field5420 == 0) {
                    class390.field5440.method120(class29.field313);
                }
                class390.field5440.method75(-var38, -var39);
                class390.field5440.method79(var52, var56, var51, var57, var44);
                class63.method639(class547.field7576 + var44, (byte) -101);
                class398.field5490 = class547.field7576 + var44;
                if (class388.field5420 == 1) {
                    class696.field9789 = var19 - class76.field1154 - var38;
                    class209.field3072 = var23;
                    class343.field4883 = var24;
                    class125.field2132 = var20 - var39 - class778.field10674;
                    class390.field5440.method449(class696.field9789, class125.field2132, class209.field3072, class343.field4883);
                } else {
                    class125.field2132 = class621.field8770 + var20 - class778.field10674 - var39;
                    class696.field9789 = class790.field10813 + var19 - class76.field1154 - var38;
                    class209.field3072 = var23;
                    class343.field4883 = var24;
                    class390.field5440.method449(class696.field9789, class125.field2132, class209.field3072, class343.field4883);
                }
                class99.method827(class576.field8303);
                if (var59 > 0) {
                    class390.field5440.method488(0, var58, class81.field1198, var58 + var59);
                    class390.field5440.method91();
                    class390.field5440.method97(class549.field7632);
                    class393.method2352(arg11, arg4, arg10, arg2, arg8, arg12, arg14, arg6, arg5, arg3, arg1, arg9, arg7, arg15, arg17, arg16, arg0, 1, false);
                }
                if (var54 > 0) {
                    class390.field5440.method488(var53, var61, var53 + var54, var60 + var61);
                    class390.field5440.method91();
                    class390.field5440.method97(class549.field7632);
                    class393.method2352(arg11, arg4, arg10, arg2, arg8, arg12, arg14, arg6, arg5, arg3, arg1, arg9, arg7, arg15, arg17, arg16, arg0, 1, false);
                }
                class390.field5440.method512();
                class20.method187();
                if (class388.field5420 == 0) {
                    class390.field5440.method115();
                }
                class76.field1154 += var38;
                class778.field10674 += var39;
                class547.field7576 += var44;
                class743.field10329 = class790.field10813 + var28 - class76.field1154;
                class65.field982 = class621.field8770 + var29 - class778.field10674;
                if (class388.field5420 == 1) {
                    class359.field5087 += var40;
                    class754.field10490 += var41;
                    for (int var64 = 0; var64 < class600.field8557; var64++) {
                        int var65 = method2295(27328, class600.field8557, var64 + class754.field10490) * class448.field6176;
                        for (int var66 = 0; var66 < class448.field6176; var66++) {
                            int var67 = method2295(27328, class448.field6176, class359.field5087 + var66) + var65;
                            boolean var68 = var46 <= var64 && var64 < var46 + var47 || var64 >= var49 && var64 < (var49 + var55) && var48 <= var66 && (var48 + var50) > var66;
                            class728.field10154[var67].method2163(class657.field9274 * var66, class36.field432 * var64, class657.field9274, class36.field432, 0, 0, var68, true);
                        }
                    }
                }
            } else {
                class87.field1297 = true;
            }
        }
        if (class87.field1297) {
            class347.field4938 = arg4;
            class547.field7576 = 0.0D;
            class68.field1028 = arg2;
            class599.field8547 = arg10;
            class76.field1154 = 0;
            class65.field982 = class621.field8770;
            class743.field10329 = class790.field10813;
            class778.field10674 = 0;
            if (class388.field5420 == 0) {
                class390.field5440.method120(class29.field313);
            }
            class390.field5440.method512();
            class390.field5440.method91();
            class390.field5440.method97(class549.field7632);
            class276.field3994.method1567(class347.field4938, class599.field8547, class68.field1028, class163.field2508, class133.field2226, class100.field1484);
            class390.field5440.method498(class276.field3994);
            if (class388.field5420 == 1) {
                class209.field3072 = var23;
                class343.field4883 = var24;
                class125.field2132 = var20;
                class696.field9789 = var19;
                class390.field5440.method449(class696.field9789, class125.field2132, class209.field3072, class343.field4883);
            } else {
                class209.field3072 = var23;
                class696.field9789 = var19 + class790.field10813;
                class125.field2132 = class621.field8770 + var20;
                class343.field4883 = var24;
                class390.field5440.method449(class696.field9789, class125.field2132, class209.field3072, class343.field4883);
            }
            class398.field5490 = 0.0D;
            class576.field8303.method4018((byte) -41);
            class99.method827(class576.field8303);
            class393.method2352(arg11, arg4, arg10, arg2, arg8, arg12, arg14, arg6, arg5, arg3, arg1, arg9, arg7, arg15, arg17, arg16, arg0, 1, false);
            class20.method187();
            class87.field1297 = false;
            if (class388.field5420 == 0) {
                class390.field5440.method115();
            }
            if (class388.field5420 == 1) {
                class47.method367(false);
            }
        }
        if (class388.field5420 == 0) {
            class29.field313.method2161(class743.field10329, class65.field982, class183.field2780, class483.field6679, 0, 0, true, true);
        }
        class7.field98++;
        class63.method639(class547.field7576, (byte) -120);
        class355.field5025 = class547.field7576;
        if (class388.field5420 == 0 || class388.field5420 == 2) {
            if (class388.field5420 == 2) {
                class390.field5440.method97(class549.field7632);
                class390.field5440.method91();
            }
            class484.field6680 = var24;
            class758.field10509 = var23;
            class522.field7315 = class790.field10813 + var19 - class76.field1154 - class743.field10329;
            class790.field10803 = var20 + class621.field8770 - class778.field10674 - class65.field982;
            class390.field5440.method449(class522.field7315, class790.field10803, class758.field10509, class484.field6680);
        } else if (class388.field5420 == 1) {
            class484.field6680 = var24;
            class522.field7315 = var19 - class76.field1154;
            class790.field10803 = var20 - class778.field10674;
            class758.field10509 = var23;
            class390.field5440.method449(class522.field7315, class790.field10803, class758.field10509, class484.field6680);
            class390.field5440.method488(class743.field10329, class65.field982, class743.field10329 + class183.field2780, class65.field982 - -class483.field6679);
        }
        class393.method2352(arg11, arg4, arg10, arg2, arg8, arg12, arg14, arg6, arg5, arg3, arg1, arg9, arg7, arg15, arg17, arg16, arg0, class388.field5420 == 2 ? 0 : 2, class388.field5420 == 1);
        class390.field5440.method512();
        class390.field5440.method449(var19, var20, var21, var22);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Z)V", line = 585)
    public static final void method2300(boolean arg0) {
        class636.field8987 = 0;
        field5341++;
        int var1 = class48.field674.method2580((byte) 37);
        boolean var2 = class48.field674.method2560(true) == 1;
        int var3 = class48.field674.method2580((byte) 56);
        int var4 = class48.field674.method2555(125);
        class68.method665((byte) -35);
        class388.method2335(var4, (byte) 104);
        int var5 = (class549.field7634 - class48.field674.field5983) / 16;
        class149.field2397 = new int[var5][4];
        for (int var6 = 0; var6 < var5; var6++) {
            for (int var10 = 0; var10 < 4; var10++) {
                class149.field2397[var6][var10] = class48.field674.method2526(17);
            }
        }
        class687.field9715 = new int[var5];
        class590.field8476 = new byte[var5][];
        class555.field7705 = new byte[var5][];
        class651.field9224 = new int[var5];
        class11.field142 = new byte[var5][];
        class114.field1832 = null;
        class613.field8704 = new byte[var5][];
        class60.field912 = new int[var5];
        class401.field5521 = new int[var5];
        class12.field156 = new int[var5];
        class789.field10791 = null;
        int var7 = 0;
        if (arg0) {
            field5340 = -46;
        }
        for (int var8 = (var3 - (class192.field2891 >> 4)) / 8; var8 <= ((class192.field2891 >> 4) + var3) / 8; var8++) {
            for (int var9 = (var1 - (class456.field6225 >> 4)) / 8; var9 <= (((class456.field6225 >> 4) + var1) / 8); var9++) {
                class12.field156[var7] = (var8 << 8) + var9;
                class687.field9715[var7] = class562.field7790.method3016(79, "m" + var8 + "_" + var9);
                class651.field9224[var7] = class562.field7790.method3016(116, "l" + var8 + "_" + var9);
                class60.field912[var7] = class562.field7790.method3016(91, "um" + var8 + "_" + var9);
                class401.field5521[var7] = class562.field7790.method3016(77, "ul" + var8 + "_" + var9);
                var7++;
            }
        }
        class694.method3901(11, var1, 26055, var3, var2);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "([BZZ)Ljava/lang/Object;", line = 672)
    public static final Object method2301(byte[] arg0, boolean arg1, boolean arg2) {
        field5332++;
        if (arg2) {
            field5340 = 19;
        }
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !class47.field635) {
            try {
                class637 var3 = (class637) Class.forName("qo").getDeclaredConstructor().newInstance();
                var3.method1477(arg0, (byte) -70);
                return var3;
            } catch (Throwable var4) {
                class47.field635 = true;
            }
        }
        return arg1 ? class134.method1120(true, arg0) : arg0;
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Lmj;II[B)V", line = 705)
    public class381(class114 arg0, int arg1, int arg2, byte[] arg3) {
        this.field5335 = arg0.method990(class547.field7573, false, arg1, arg3, arg2, (byte) 110);
        this.field5335.method333(false, false, 7536);
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Lmj;II[I)V", line = 717)
    public class381(class114 arg0, int arg1, int arg2, int[] arg3) {
        this.field5335 = arg0.method944(arg2, arg1, 21028, arg3, false);
        this.field5335.method333(false, false, 7536);
    }
}
