import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class204 {

    @OriginalMember(owner = "client!se", name = "m", descriptor = "I")
    private int field3592;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "[[I")
    private int[][] field3584;

    @OriginalMember(owner = "client!se", name = "v", descriptor = "I")
    private int field3601;

    @OriginalMember(owner = "client!se", name = "i", descriptor = "[Lri;")
    public static class65[] field3588 = new class65[14];

    @OriginalMember(owner = "client!se", name = "d", descriptor = "Lqk;")
    public static class207 field3583 = class24.method212(255, "Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

    @OriginalMember(owner = "client!se", name = "a", descriptor = "I")
    public static int field3580 = 0;

    @OriginalMember(owner = "client!se", name = "j", descriptor = "Lqk;")
    public static class207 field3589 = class24.method212(255, "::tween");

    @OriginalMember(owner = "client!se", name = "b", descriptor = "I")
    public static int field3581 = 0;

    @OriginalMember(owner = "client!se", name = "o", descriptor = "Lqk;")
    public static class207 field3594 = class24.method212(255, "cookieprefix");

    @OriginalMember(owner = "client!se", name = "h", descriptor = "Z")
    public static boolean field3587 = false;

    @OriginalMember(owner = "client!se", name = "t", descriptor = "I")
    public static int field3599 = 0;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "Lqk;")
    public static class207 field3586 = class24.method212(255, "OK");

    @OriginalMember(owner = "client!se", name = "w", descriptor = "I")
    public static int field3602 = 100;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!se", name = "k", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!se", name = "l", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!se", name = "p", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!se", name = "q", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!se", name = "u", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!se", name = "x", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!se", name = "r", descriptor = "Lmd;")
    public static class220 field3597;

    @OriginalMember(owner = "client!se", name = "n", descriptor = "[[[B")
    public static byte[][][] field3593;

    @OriginalMember(owner = "client!se", name = "s", descriptor = "[[[I")
    public static int[][][] field3598;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(II)I")
    public final int method1408(int arg0, int arg1) {
        if (this.field3584 != null) {
            arg1 = (int) ((long) this.field3601 * (long) arg1 / (long) this.field3592) + 6;
        }
        if (arg0 == -14174) {
            field3590++;
            return arg1;
        } else {
            return -105;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lpk;I)V")
    public static final void method1409(class99 arg0, int arg1) {
        field3585++;
        if (arg1 != 64) {
            field3594 = null;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IBIIIII)V")
    public static final void method1410(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3596++;
        if (class34.field680 == 0) {
            int var7 = class259.field4613;
            int var8 = class225.field4100;
            int var9 = class212.field3772;
            int var10 = (var7 - var9) * (arg4 - arg3) / arg6 + var9;
            int var11 = class277.field4872;
            int var12 = (var11 - var8) * (arg2 - arg0) / arg5 + var8;
            if (class4.field71 && (class60.field1096 & 0x40) != 0) {
                class220 var13 = class108.method782((byte) 113, class231.field4236, class13.field176);
                if (var13 == null) {
                    class219.method1553(107);
                } else {
                    class156.method1143((short) 23, var12, 0L, class127.field2218, var10, -28775, class49.field969, class185.field3280);
                }
            } else {
                class65.field1167++;
                if (class171.field3035 == 1) {
                    class156.method1143((short) 22, var12, 0L, -1, var10, arg1 - 28829, class68.field1213, class100.field1800);
                }
                class156.method1143((short) 29, var12, 0L, -1, var10, arg1 ^ 0xFFFF8FAF, class273.field4806, class100.field1800);
            }
        }
        if (arg1 != 54) {
            method1412((byte) 53);
        }
        long var14 = -1L;
        for (int var16 = 0; var16 < field3581; var16++) {
            long var17 = class193.field3405[var16];
            int var19 = (int) var17 & 0x7F;
            int var20 = (int) var17 >> 7 & 0x7F;
            int var21 = ((int) var17 & 0x6FADB27F) >> 29;
            int var22 = Integer.MAX_VALUE & (int) (var17 >>> 32);
            if (var14 != var17) {
                var14 = var17;
                if (var21 == 2 && class40.method304(class93.field1645, var19, var20, var17)) {
                    class22 var23 = class33.method251(0, var22);
                    if (var23.field428 != null) {
                        var23 = var23.method141(false);
                    }
                    if (var23 == null) {
                        continue;
                    }
                    if (class34.field680 == 1) {
                        class156.method1143((short) 60, var20, var17, class60.field1093, var19, -28775, class156.field2744, class105.method757(false, new class207[] { class235.field4336, class20.field333, var23.field372 }));
                        class280.field4926++;
                    } else if (class4.field71) {
                        class119 var24 = class269.field4757 == -1 ? null : class276.method1880(class269.field4757, (byte) -47);
                        if ((class60.field1096 & 0x4) != 0 && (var24 == null || var23.method132(arg1 ^ 0xFFFFFFAF, var24.field2061, class269.field4757) != var24.field2061)) {
                            class156.method1143((short) 49, var20, var17, class127.field2218, var19, arg1 ^ 0xFFFF8FAF, class49.field969, class105.method757(false, new class207[] { class243.field4422, class20.field333, var23.field372 }));
                            class58.field1060++;
                        }
                    } else {
                        class207[] var25 = var23.field425;
                        class141.field2438++;
                        if (class32.field654) {
                            var25 = class221.method1576(arg1 - 112, var25);
                        }
                        if (var25 != null) {
                            for (int var26 = 4; var26 >= 0; var26--) {
                                if (var25[var26] != null) {
                                    class73.field1346++;
                                    short var27 = 0;
                                    if (var26 == 0) {
                                        var27 = 36;
                                    }
                                    int var28 = -1;
                                    if (var23.field418 == var26) {
                                        var28 = var23.field426;
                                    }
                                    if (var26 == 1) {
                                        var27 = 47;
                                    }
                                    if (var26 == 2) {
                                        var27 = 8;
                                    }
                                    if (var26 == 3) {
                                        var27 = 59;
                                    }
                                    if (var26 == 4) {
                                        var27 = 1004;
                                    }
                                    if (var23.field413 == var26) {
                                        var28 = var23.field390;
                                    }
                                    class156.method1143(var27, var20, var17, var28, var19, arg1 - 28829, var25[var26], class105.method757(false, new class207[] { class268.field4745, var23.field372 }));
                                }
                            }
                        }
                        class156.method1143((short) 1007, var20, (long) var23.field375, class186.field3290, var19, -28775, class209.field3701, class105.method757(false, new class207[] { class268.field4745, var23.field372 }));
                    }
                }
                if (var21 == 1) {
                    class256 var29 = class79.field1449[var22];
                    if ((var29.field4581.field1303 & 0x1) == 0 && (var29.field5104 & 0x7F) == 0 && (var29.field5072 & 0x7F) == 0 || (var29.field4581.field1303 & 0x1) == 1 && (var29.field5104 & 0x7F) == 64 && (var29.field5072 & 0x7F) == 64) {
                        int var30 = var29.field5072 + 64 - var29.field4581.field1303 * 64;
                        int var31 = var29.field5104 - ((var29.field4581.field1303 - 1) * 64);
                        for (int var32 = 0; var32 < class138.field2390; var32++) {
                            class256 var37 = class79.field1449[class117.field2036[var32]];
                            int var38 = var37.field5072 - (var37.field4581.field1303 * 64 - 64);
                            int var39 = var37.field5104 - ((var37.field4581.field1303 - 1) * 64);
                            if (var37 != null && var29 != var37 && var31 <= var39 && (var29.field4581.field1303 - (var39 - var31 >> 7)) >= var37.field4581.field1303 && var30 <= var38 && (var29.field4581.field1303 - (var38 - var30 >> 7)) >= var37.field4581.field1303) {
                                class124.method867(class117.field2036[var32], var20, -1, var19, var37.field4581);
                            }
                        }
                        for (int var33 = 0; var33 < class31.field629; var33++) {
                            class14 var34 = class169.field2953[class10.field149[var33]];
                            int var35 = var34.field5104 - (var34.method83(true) * 64 - 64);
                            int var36 = var34.field5072 - ((var34.method83(true) - 1) * 64);
                            if (var34 != null && var35 >= var31 && var34.method83(true) <= var29.field4581.field1303 - (var35 - var31 >> 7) && var30 <= var36 && var34.method83(true) <= var29.field4581.field1303 - (var36 - var30 >> 7)) {
                                class11.method65((byte) 123, class10.field149[var33], var19, var20, var34);
                            }
                        }
                    }
                    class124.method867(var22, var20, -1, var19, var29.field4581);
                }
                if (var21 == 0) {
                    class14 var40 = class169.field2953[var22];
                    if ((var40.field5104 & 0x7F) == 64 && (var40.field5072 & 0x7F) == 64) {
                        int var41 = var40.field5104 + 64 - var40.method83(true) * 64;
                        int var42 = var40.field5072 + 64 - (var40.method83(true) * 64);
                        for (int var43 = 0; var43 < class138.field2390; var43++) {
                            class256 var48 = class79.field1449[class117.field2036[var43]];
                            int var49 = var48.field5104 - ((var48.field4581.field1303 - 1) * 64);
                            int var50 = var48.field5072 - ((var48.field4581.field1303 - 1) * 64);
                            if (var48 != null && var49 >= var41 && var48.field4581.field1303 <= var40.method83(true) - (var49 - var41 >> 7) && var42 <= var50 && var48.field4581.field1303 <= var40.method83(true) - (var50 - var42 >> 7)) {
                                class124.method867(class117.field2036[var43], var20, -1, var19, var48.field4581);
                            }
                        }
                        for (int var44 = 0; var44 < class31.field629; var44++) {
                            class14 var45 = class169.field2953[class10.field149[var44]];
                            int var46 = var45.field5104 - ((var45.method83(true) - 1) * 64);
                            int var47 = var45.field5072 - ((var45.method83(true) - 1) * 64);
                            if (var45 != null && var40 != var45 && var41 <= var46 && var45.method83(true) <= var40.method83(true) - (var46 - var41 >> 7) && var42 <= var47 && var45.method83(true) <= var40.method83(true) - (var47 - var42 >> 7)) {
                                class11.method65((byte) 81, class10.field149[var44], var19, var20, var45);
                            }
                        }
                    }
                    class11.method65((byte) 121, var22, var19, var20, var40);
                }
                if (var21 == 3) {
                    class132 var51 = class276.field4844[class93.field1645][var19][var20];
                    if (var51 != null) {
                        for (class242 var52 = (class242) var51.method930(128); var52 != null; var52 = (class242) var51.method925(61)) {
                            int var53 = var52.field4408.field4447;
                            class173 var54 = class117.method829(var53, (byte) 99);
                            if (class34.field680 == 1) {
                                class156.method1143((short) 20, var20, (long) var53, class60.field1093, var19, -28775, class156.field2744, class105.method757(false, new class207[] { class235.field4336, class123.field2129, var54.field3057 }));
                                class185.field3278++;
                            } else if (class4.field71) {
                                class119 var59 = class269.field4757 == -1 ? null : class276.method1880(class269.field4757, (byte) -47);
                                if ((class60.field1096 & 0x1) != 0 && (var59 == null || var54.method1240(class269.field4757, var59.field2061, -8078) != var59.field2061)) {
                                    class156.method1143((short) 28, var20, (long) var53, class127.field2218, var19, -28775, class49.field969, class105.method757(false, new class207[] { class243.field4422, class123.field2129, var54.field3057 }));
                                    class36.field686++;
                                }
                            } else {
                                class248.field4490++;
                                class207[] var55 = var54.field3051;
                                if (class32.field654) {
                                    var55 = class221.method1576(arg1 ^ 0xFFFFFF8B, var55);
                                }
                                for (int var56 = 4; var56 >= 0; var56--) {
                                    if (var55 != null && var55[var56] != null) {
                                        byte var57 = 0;
                                        class120.field2071++;
                                        int var58 = -1;
                                        if (var56 == 0) {
                                            var57 = 48;
                                        }
                                        if (var56 == 1) {
                                            var57 = 37;
                                        }
                                        if (var56 == 2) {
                                            var57 = 41;
                                        }
                                        if (var56 == 3) {
                                            var57 = 3;
                                        }
                                        if (var54.field3102 == var56) {
                                            var58 = var54.field3082;
                                        }
                                        if (var54.field3103 == var56) {
                                            var58 = var54.field3055;
                                        }
                                        if (var56 == 4) {
                                            var57 = 31;
                                        }
                                        class156.method1143(var57, var20, (long) var53, var58, var19, -28775, var55[var56], class105.method757(false, new class207[] { class190.field3351, var54.field3057 }));
                                    }
                                }
                                class156.method1143((short) 1006, var20, (long) var53, class186.field3290, var19, -28775, class209.field3701, class105.method757(false, new class207[] { class190.field3351, var54.field3057 }));
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "([BB)[B")
    public final byte[] method1411(byte[] arg0, byte arg1) {
        if (this.field3584 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field3601 / (long) this.field3592) + 14;
            int var4 = 0;
            int[] var5 = new int[var3];
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                int[] var10 = this.field3584[var6];
                byte var11 = arg0[var7];
                for (int var12 = 0; var12 < 14; var12++) {
                    var5[var4 + var12] += var10[var12] * var11;
                }
                int var13 = this.field3601 + var6;
                int var14 = var13 / this.field3592;
                var4 += var14;
                var6 = var13 - this.field3592 * var14;
            }
            arg0 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var5[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg0[var8] = -128;
                } else if (var9 > 127) {
                    arg0[var8] = 127;
                } else {
                    arg0[var8] = (byte) var9;
                }
            }
        }
        int var15 = 61 / ((arg1 - 36) / 35);
        field3603++;
        return arg0;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
    public static void method1412(byte arg0) {
        if (arg0 > -116) {
            return;
        }
        field3589 = null;
        field3594 = null;
        field3597 = null;
        field3583 = null;
        field3588 = null;
        field3586 = null;
        field3593 = null;
        field3598 = null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lmd;IIIZ)V")
    public static final void method1413(class220 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3600++;
        if (arg2 != -1) {
            return;
        }
        int var5 = arg0.field3948;
        if (arg0.field3919 == 0) {
            arg0.field3948 = arg0.field4009;
        } else if (arg0.field3919 == 1) {
            arg0.field3948 = arg1 - arg0.field4009;
        } else if (arg0.field3919 == 2) {
            arg0.field3948 = arg0.field4009 * arg1 >> 14;
        } else if (arg0.field3919 == 3) {
            if (arg0.field3988 == 2) {
                arg0.field3948 = (arg0.field4009 - 1) * arg0.field3905 + arg0.field4009 * 32;
            } else if (arg0.field3988 == 7) {
                arg0.field3948 = (arg0.field4009 - 1) * arg0.field3905 + arg0.field4009 * 12;
            }
        }
        int var6 = arg0.field4037;
        if (arg0.field3876 == 0) {
            arg0.field4037 = arg0.field3995;
        } else if (arg0.field3876 == 1) {
            arg0.field4037 = arg3 - arg0.field3995;
        } else if (arg0.field3876 == 2) {
            arg0.field4037 = arg0.field3995 * arg3 >> 14;
        } else if (arg0.field3876 == 3) {
            if (arg0.field3988 == 2) {
                arg0.field4037 = (arg0.field3995 - 1) * arg0.field3886 + arg0.field3995 * 32;
            } else if (arg0.field3988 == 7) {
                arg0.field4037 = (arg0.field3995 - 1) * arg0.field3886 + arg0.field3995 * 115;
            }
        }
        if (arg0.field3876 == 4) {
            arg0.field4037 = arg0.field3948 * arg0.field3935 / arg0.field3931;
        }
        if (arg0.field3919 == 4) {
            arg0.field3948 = arg0.field4037 * arg0.field3931 / arg0.field3935;
        }
        if (class138.field2385 && (client.method1112(arg0).field2021 != 0 || arg0.field3988 == 0)) {
            if (arg0.field3948 < 5 && arg0.field4037 < 5) {
                arg0.field4037 = 5;
                arg0.field3948 = 5;
            } else {
                if (arg0.field4037 <= 0) {
                    arg0.field4037 = 5;
                }
                if (arg0.field3948 <= 0) {
                    arg0.field3948 = 5;
                }
            }
        }
        if (arg0.field3960 == 1337) {
            class262.field4670 = arg0;
        }
        if (arg4 && arg0.field3992 != null && arg0.field4037 != var6 || arg0.field3948 != var5) {
            class206 var7 = new class206();
            var7.field3616 = arg0.field3992;
            var7.field3614 = arg0;
            class129.field2251.method931(var7, 118);
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(II)I")
    public final int method1414(int arg0, int arg1) {
        field3582++;
        int var3 = 96 / ((67 - arg1) / 46);
        if (this.field3584 != null) {
            arg0 = (int) ((long) this.field3601 * (long) arg0 / (long) this.field3592);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "(II)V")
    public class204(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class9.method51(125, arg0, arg1);
            int var4 = arg0 / var3;
            this.field3592 = var4;
            this.field3584 = new int[var4][14];
            int var5 = arg1 / var3;
            this.field3601 = var5;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field3584[var6];
                double var8 = (double) var6 / (double) var4 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                double var11 = (double) var5 / (double) var4;
                if (var10 < 0) {
                    var10 = 0;
                }
                int var13 = (int) Math.ceil(var8 + 7.0D);
                if (var13 > 14) {
                    var13 = 14;
                }
                while (var13 > var10) {
                    double var14 = var11;
                    double var16 = ((double) var10 - var8) * 3.141592653589793D;
                    if (var16 < -1.0E-4D || var16 > 1.0E-4D) {
                        var14 = var11 * (Math.sin(var16) / var16);
                    }
                    double var18 = var14 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
