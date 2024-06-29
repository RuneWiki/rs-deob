import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class19 {

    @OriginalMember(owner = "client!he", name = "j", descriptor = "I")
    private int field430 = 0;

    @OriginalMember(owner = "client!he", name = "r", descriptor = "I")
    private int field438 = -1;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "Loh;")
    public static class263 field424 = class253.method1681(-119, "Suche nach Updates )2 ");

    @OriginalMember(owner = "client!he", name = "b", descriptor = "Loh;")
    public static class263 field422 = class253.method1681(-126, "Clientscript error in: ");

    @OriginalMember(owner = "client!he", name = "l", descriptor = "Z")
    public static boolean field432 = false;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    public int field425;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "I")
    public int field427;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!he", name = "k", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!he", name = "m", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "I")
    public int field434;

    @OriginalMember(owner = "client!he", name = "o", descriptor = "I")
    public int field435;

    @OriginalMember(owner = "client!he", name = "p", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "Lma;")
    public static class184 field426;

    @OriginalMember(owner = "client!he", name = "q", descriptor = "Lue;")
    public static class86 field437;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IB)I")
    public static final int method129(int arg0, byte arg1) {
        field429++;
        if (arg1 != -2) {
            field422 = null;
        }
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "()V")
    public static final void method130() {
        class196.field3568 = 0;
        label191: for (int var0 = 0; var0 < class59.field1229; var0++) {
            class253 var1 = class70.field1415[var0];
            if (class201.field3630 != null) {
                for (int var2 = 0; var2 < class201.field3630.length; var2++) {
                    if (class201.field3630[var2] != -1000000 && (var1.field4410 <= class201.field3630[var2] || var1.field4394 <= class201.field3630[var2]) && (var1.field4389 <= class86.field1703[var2] || var1.field4402 <= class86.field1703[var2]) && (var1.field4389 >= class66.field1361[var2] || var1.field4402 >= class66.field1361[var2]) && (var1.field4391 <= class226.field3981[var2] || var1.field4388 <= class226.field3981[var2]) && (var1.field4391 >= class105.field1977[var2] || var1.field4388 >= class105.field1977[var2])) {
                        continue label191;
                    }
                }
            }
            if (var1.field4400 == 1) {
                int var3 = var1.field4403 + class263.field4590 - class121.field2239;
                if (var3 >= 0 && var3 <= class263.field4590 + class263.field4590) {
                    int var4 = var1.field4406 + class263.field4590 - class186.field3359;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field4407 + class263.field4590 - class186.field3359;
                    if (var5 > class263.field4590 + class263.field4590) {
                        var5 = class263.field4590 + class263.field4590;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class22.field647[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class43.field940 - var1.field4389;
                        if (var7 > 32) {
                            var1.field4408 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field4408 = 2;
                            var7 = -var7;
                        }
                        var1.field4399 = (var1.field4391 - class1.field5 << 8) / var7;
                        var1.field4411 = (var1.field4388 - class1.field5 << 8) / var7;
                        var1.field4401 = (var1.field4410 - class220.field3907 << 8) / var7;
                        var1.field4409 = (var1.field4394 - class220.field3907 << 8) / var7;
                        class14.field354[class196.field3568++] = var1;
                    }
                }
            } else if (var1.field4400 == 2) {
                int var8 = var1.field4406 + class263.field4590 - class186.field3359;
                if (var8 >= 0 && var8 <= class263.field4590 + class263.field4590) {
                    int var9 = var1.field4403 + class263.field4590 - class121.field2239;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field4387 + class263.field4590 - class121.field2239;
                    if (var10 > class263.field4590 + class263.field4590) {
                        var10 = class263.field4590 + class263.field4590;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class22.field647[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class1.field5 - var1.field4391;
                        if (var12 > 32) {
                            var1.field4408 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field4408 = 4;
                            var12 = -var12;
                        }
                        var1.field4405 = (var1.field4389 - class43.field940 << 8) / var12;
                        var1.field4413 = (var1.field4402 - class43.field940 << 8) / var12;
                        var1.field4401 = (var1.field4410 - class220.field3907 << 8) / var12;
                        var1.field4409 = (var1.field4394 - class220.field3907 << 8) / var12;
                        class14.field354[class196.field3568++] = var1;
                    }
                }
            } else if (var1.field4400 == 4) {
                int var13 = var1.field4410 - class220.field3907;
                if (var13 > 128) {
                    int var14 = var1.field4406 + class263.field4590 - class186.field3359;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field4407 + class263.field4590 - class186.field3359;
                    if (var15 > class263.field4590 + class263.field4590) {
                        var15 = class263.field4590 + class263.field4590;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field4403 + class263.field4590 - class121.field2239;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field4387 + class263.field4590 - class121.field2239;
                        if (var17 > class263.field4590 + class263.field4590) {
                            var17 = class263.field4590 + class263.field4590;
                        }
                        boolean var18 = false;
                        label163: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class22.field647[var19][var20]) {
                                    var18 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var18) {
                            var1.field4408 = 5;
                            var1.field4405 = (var1.field4389 - class43.field940 << 8) / var13;
                            var1.field4413 = (var1.field4402 - class43.field940 << 8) / var13;
                            var1.field4399 = (var1.field4391 - class1.field5 << 8) / var13;
                            var1.field4411 = (var1.field4388 - class1.field5 << 8) / var13;
                            class14.field354[class196.field3568++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V")
    public static void method131(byte arg0) {
        if (arg0 != 91) {
            method132(-42);
        }
        field422 = null;
        field426 = null;
        field424 = null;
        field437 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
    public static final void method132(int arg0) {
        field433++;
        class64.field1289.method825(0);
        if (arg0 <= 13) {
            field424 = null;
        }
        class163.field2964.method825(0);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II)V")
    private final void method133(int arg0, int arg1) {
        field423++;
        double var3 = (double) ((arg1 & 0xFFFE90) >> 16) / 256.0D;
        double var5 = (double) ((arg1 & 0xFFE7) >> 8) / 256.0D;
        if (arg0 != 1949) {
            return;
        }
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        double var11 = var3;
        if (var5 > var3) {
            var11 = var5;
        }
        if (var11 < var7) {
            var11 = var7;
        }
        if (var3 > var5) {
            var9 = var5;
        }
        double var13 = 0.0D;
        if (var9 > var7) {
            var9 = var7;
        }
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        this.field425 = (int) (var17 * 256.0D);
        if (this.field425 < 0) {
            this.field425 = 0;
        } else if (this.field425 > 255) {
            this.field425 = 255;
        }
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
        }
        if (var17 > 0.5D) {
            this.field427 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field427 = (int) (var15 * var17 * 512.0D);
        }
        this.field434 = (int) (var15 * 256.0D);
        if (this.field434 < 0) {
            this.field434 = 0;
        } else if (this.field434 > 255) {
            this.field434 = 255;
        }
        if (this.field427 < 1) {
            this.field427 = 1;
        }
        double var19 = var13 / 6.0D;
        this.field435 = (int) ((double) this.field427 * var19);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ILsi;II)V")
    private final void method134(int arg0, class194 arg1, int arg2, int arg3) {
        if (arg0 == 1) {
            this.field430 = arg1.method1277((byte) -8);
            this.method133(1949, this.field430);
        } else if (arg0 == 2) {
            this.field438 = arg1.method1294((byte) 3);
            if (this.field438 == 65535) {
                this.field438 = -1;
            }
        } else if (arg0 == 3) {
            arg1.method1294((byte) 3);
        }
        if (arg2 == -5) {
            field421++;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIIII)V")
    public static final void method135(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class49.field1060 == 0) {
            int var7 = class12.field337;
            class71.field1423++;
            int var8 = class126.field2332;
            int var9 = class111.field2094;
            int var10 = (arg0 - arg5) * (var8 - var7) / arg6 + var7;
            int var11 = class99.field1907;
            int var12 = (var11 - var9) * (arg4 - arg2) / arg1 + var9;
            if (class130.field2387 && (class5.field108 & 0x40) == 64) {
                class21 var13 = class64.method394(class114.field2144, -1943367162, class5.field100);
                if (var13 == null) {
                    class252.method1679((byte) 127);
                } else {
                    class119.method769(var10, 0L, true, var12, (short) 37, class165.field3012, class151.field2727);
                }
            } else {
                class119.method769(var10, 0L, true, var12, (short) 40, class20.field459, class66.field1346);
            }
        }
        field428++;
        long var14 = -1L;
        int var16 = 0;
        if (arg3 != 22899) {
            method135(111, -103, -60, -38, 50, 106, -58);
        }
        while (var16 < class228.field4002) {
            long var17 = class105.field1980[var16];
            int var19 = ((int) var17 & 0x3FA6) >> 7;
            int var20 = (int) var17 & 0x7F;
            int var21 = ((int) var17 & 0x6307DD65) >> 29;
            int var22 = Integer.MAX_VALUE & (int) (var17 >>> 32);
            if (var14 != var17) {
                label282: {
                    var14 = var17;
                    if (var21 == 2 && class171.method1127(class12.field321, var20, var19, var17)) {
                        class12 var23 = class117.method763(var22, (byte) -13);
                        if (var23.field328 != null) {
                            var23 = var23.method97(111);
                        }
                        if (var23 == null) {
                            break label282;
                        }
                        if (class49.field1060 == 1) {
                            class187.field3370++;
                            class119.method769(var20, var17, true, var19, (short) 7, class124.method797(-117, new class263[] { class236.field4127, class158.field2844, var23.field324 }), class152.field2739);
                        } else if (!class130.field2387) {
                            class263[] var24 = var23.field303;
                            class39.field885++;
                            if (class125.field2306) {
                                var24 = class82.method551(var24, 24526);
                            }
                            if (var24 != null) {
                                for (int var25 = 4; var25 >= 0; var25--) {
                                    if (var24[var25] != null) {
                                        class162.field2952++;
                                        short var26 = 0;
                                        if (var25 == 0) {
                                            var26 = 2;
                                        }
                                        if (var25 == 1) {
                                            var26 = 57;
                                        }
                                        if (var25 == 2) {
                                            var26 = 50;
                                        }
                                        if (var25 == 3) {
                                            var26 = 15;
                                        }
                                        if (var25 == 4) {
                                            var26 = 1006;
                                        }
                                        class119.method769(var20, var17, true, var19, var26, class124.method797(arg3 ^ 0xFFFFA6ED, new class263[] { class105.field1983, var23.field324 }), var24[var25]);
                                    }
                                }
                            }
                            class119.method769(var20, (long) var23.field335, true, var19, (short) 1005, class124.method797(arg3 - 23009, new class263[] { class105.field1983, var23.field324 }), class162.field2958);
                        } else if ((class5.field108 & 0x4) == 4) {
                            class119.method769(var20, var17, true, var19, (short) 14, class124.method797(-120, new class263[] { class39.field875, class158.field2844, var23.field324 }), class151.field2727);
                            class255.field4444++;
                        }
                    }
                    if (var21 == 1) {
                        class90 var27 = class31.field774[var22];
                        if (var27.field1787.field3694 == 1 && (var27.field4688 & 0x7F) == 64 && (var27.field4705 & 0x7F) == 64) {
                            for (int var28 = 0; var28 < class13.field345; var28++) {
                                class90 var31 = class31.field774[class117.field2191[var28]];
                                if (var31 != null && var27 != var31 && var31.field1787.field3694 == 1 && var27.field4688 == var31.field4688 && var27.field4705 == var31.field4705) {
                                    class190.method1247(var19, class117.field2191[var28], (byte) 124, var31.field1787, var20);
                                }
                            }
                            for (int var29 = 0; var29 < class41.field911; var29++) {
                                class137 var30 = class151.field2725[class249.field4354[var29]];
                                if (var30 != null && var27.field4688 == var30.field4688 && var27.field4705 == var30.field4705) {
                                    class51.method327(var20, var30, var19, class249.field4354[var29], true);
                                }
                            }
                        }
                        class190.method1247(var19, var22, (byte) 123, var27.field1787, var20);
                    }
                    if (var21 == 0) {
                        class137 var32 = class151.field2725[var22];
                        if ((var32.field4688 & 0x7F) == 64 && (var32.field4705 & 0x7F) == 64) {
                            for (int var33 = 0; var33 < class13.field345; var33++) {
                                class90 var36 = class31.field774[class117.field2191[var33]];
                                if (var36 != null && var36.field1787.field3694 == 1 && var32.field4688 == var36.field4688 && var32.field4705 == var36.field4705) {
                                    class190.method1247(var19, class117.field2191[var33], (byte) 127, var36.field1787, var20);
                                }
                            }
                            for (int var34 = 0; var34 < class41.field911; var34++) {
                                class137 var35 = class151.field2725[class249.field4354[var34]];
                                if (var35 != null && var32 != var35 && var32.field4688 == var35.field4688 && var32.field4705 == var35.field4705) {
                                    class51.method327(var20, var35, var19, class249.field4354[var34], true);
                                }
                            }
                        }
                        class51.method327(var20, var32, var19, var22, true);
                    }
                    if (var21 == 3) {
                        class277 var37 = class107.field2020[class12.field321][var20][var19];
                        if (var37 != null) {
                            for (class109 var38 = (class109) var37.method1877((byte) -77); var38 != null; var38 = (class109) var37.method1882(0)) {
                                int var39 = var38.field2050.field342;
                                class72 var40 = class92.method649(-32508, var39);
                                if (class49.field1060 == 1) {
                                    class198.field3582++;
                                    class119.method769(var20, (long) var39, true, var19, (short) 29, class124.method797(-85, new class263[] { class236.field4127, class176.field3171, var40.field1467 }), class152.field2739);
                                } else if (!class130.field2387) {
                                    class263[] var41 = var40.field1442;
                                    if (class125.field2306) {
                                        var41 = class82.method551(var41, 24526);
                                    }
                                    for (int var42 = 4; var42 >= 0; var42--) {
                                        if (var41 != null && var41[var42] != null) {
                                            class98.field1881++;
                                            byte var43 = 0;
                                            if (var42 == 0) {
                                                var43 = 39;
                                            }
                                            if (var42 == 1) {
                                                var43 = 42;
                                            }
                                            if (var42 == 2) {
                                                var43 = 12;
                                            }
                                            if (var42 == 3) {
                                                var43 = 9;
                                            }
                                            if (var42 == 4) {
                                                var43 = 1;
                                            }
                                            class119.method769(var20, (long) var39, true, var19, var43, class124.method797(-124, new class263[] { class61.field1244, var40.field1467 }), var41[var42]);
                                        } else if (var42 == 2) {
                                            class163.field2962++;
                                            class119.method769(var20, (long) var39, true, var19, (short) 12, class124.method797(-105, new class263[] { class61.field1244, var40.field1467 }), class160.field2928);
                                        }
                                    }
                                    class119.method769(var20, (long) var39, true, var19, (short) 1002, class124.method797(-60, new class263[] { class61.field1244, var40.field1467 }), class162.field2958);
                                    class257.field4468++;
                                } else if ((class5.field108 & 0x1) == 1) {
                                    class195.field3525++;
                                    class119.method769(var20, (long) var39, true, var19, (short) 48, class124.method797(arg3 ^ 0xFFFFA6EA, new class263[] { class39.field875, class176.field3171, var40.field1467 }), class151.field2727);
                                }
                            }
                        }
                    }
                }
            }
            var16++;
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(B)Loe;")
    public static final class140 method136(byte arg0) {
        field436++;
        int var1 = class198.field3583[0] * class181.field3289[0];
        byte[] var2 = class191.field3425[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class103.field1965[class263.method1777(var2[var4], 255)];
        }
        if (arg0 != -23) {
            method136((byte) 124);
        }
        class140 var5 = new class140(class240.field4200, class2.field46, class198.field3584[0], class46.field1003[0], class198.field3583[0], class181.field3289[0], var3);
        class14.method111(arg0 + 23);
        return var5;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IILsi;)V")
    public final void method137(int arg0, int arg1, class194 arg2) {
        if (arg0 <= 65) {
            this.method134(-74, (class194) null, 114, -121);
        }
        while (true) {
            int var4 = arg2.method1301(-8317);
            if (var4 == 0) {
                field431++;
                return;
            }
            this.method134(var4, arg2, -5, arg1);
        }
    }
}
