import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class85 extends class261 {

    @OriginalMember(owner = "client!uk", name = "J", descriptor = "I")
    private int field1367 = 409;

    @OriginalMember(owner = "client!uk", name = "K", descriptor = "I")
    private int field1368 = 4;

    @OriginalMember(owner = "client!uk", name = "N", descriptor = "I")
    private int field1371 = 81;

    @OriginalMember(owner = "client!uk", name = "S", descriptor = "I")
    private int field1376 = 1024;

    @OriginalMember(owner = "client!uk", name = "I", descriptor = "I")
    private int field1366 = 204;

    @OriginalMember(owner = "client!uk", name = "M", descriptor = "I")
    private int field1370 = 8;

    @OriginalMember(owner = "client!uk", name = "cb", descriptor = "I")
    private int field1386 = 0;

    @OriginalMember(owner = "client!uk", name = "X", descriptor = "I")
    private int field1381 = 1024;

    @OriginalMember(owner = "client!uk", name = "W", descriptor = "[Lpb;")
    public static class70[] field1380 = new class70[2048];

    @OriginalMember(owner = "client!uk", name = "Y", descriptor = "Lve;")
    public static class255 field1382 = class87.method607(66, "Lade)3)3)3");

    @OriginalMember(owner = "client!uk", name = "T", descriptor = "Lve;")
    public static class255 field1377 = class87.method607(93, "");

    @OriginalMember(owner = "client!uk", name = "F", descriptor = "I")
    private int field1363;

    @OriginalMember(owner = "client!uk", name = "G", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!uk", name = "H", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!uk", name = "L", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!uk", name = "O", descriptor = "I")
    private int field1372;

    @OriginalMember(owner = "client!uk", name = "P", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!uk", name = "Q", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!uk", name = "R", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!uk", name = "U", descriptor = "I")
    private int field1378;

    @OriginalMember(owner = "client!uk", name = "Z", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!uk", name = "fb", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!uk", name = "bb", descriptor = "Lclient;")
    public static client field1385;

    @OriginalMember(owner = "client!uk", name = "ab", descriptor = "[I")
    private int[] field1384;

    @OriginalMember(owner = "client!uk", name = "V", descriptor = "[Lve;")
    public static class255[] field1379;

    @OriginalMember(owner = "client!uk", name = "db", descriptor = "[[I")
    private int[][] field1387;

    @OriginalMember(owner = "client!uk", name = "eb", descriptor = "[[I")
    private int[][] field1388;

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "(B)I", line = 14)
    public static final int method592(byte arg0) {
        field1389++;
        if (class109.field1834) {
            return 0;
        } else if (class96.method761(true)) {
            if (arg0 != 76) {
                method596(-116, 27, 34, -20, 89, -106, -124, -75, -69, -18, 33);
            }
            return class136.field2259 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(I)V", line = 33)
    public static void method593(int arg0) {
        field1385 = null;
        field1379 = null;
        field1377 = null;
        field1382 = null;
        if (arg0 > -111) {
            field1380 = (class70[]) null;
        }
        field1380 = null;
    }

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "(I)V", line = 53)
    private final void method594(int arg0) {
        field1375++;
        Random var2 = new Random((long) this.field1370);
        this.field1387 = new int[this.field1370][this.field1368 + 1];
        this.field1363 = 4096 / this.field1368;
        this.field1384 = new int[this.field1370 + 1];
        this.field1372 = this.field1371 / 2;
        this.field1388 = new int[this.field1370][this.field1368];
        this.field1378 = 4096 / this.field1370;
        int var3 = this.field1378 / 2;
        this.field1384[arg0] = 0;
        int var4 = this.field1363 / 2;
        for (int var5 = 0; var5 < this.field1370; var5++) {
            if (var5 > 0) {
                int var6 = this.field1378;
                int var7 = (class212.method1522(var2, 4096, (byte) 124) - 2048) * this.field1366 >> 12;
                int var8 = (var3 * var7 >> 12) + var6;
                this.field1384[var5] = this.field1384[var5 - 1] + var8;
            }
            this.field1387[var5][0] = 0;
            for (int var9 = 0; var9 < this.field1368; var9++) {
                if (var9 > 0) {
                    int var10 = this.field1363;
                    int var11 = (class212.method1522(var2, 4096, (byte) 126) - 2048) * this.field1367 >> 12;
                    int var12 = (var4 * var11 >> 12) + var10;
                    this.field1387[var5][var9] = this.field1387[var5][var9 - 1] + var12;
                }
                this.field1388[var5][var9] = this.field1376 <= 0 ? 4096 : 4096 - class212.method1522(var2, this.field1376, (byte) 124);
            }
            this.field1387[var5][this.field1368] = 4096;
        }
        this.field1384[this.field1370] = 4096;
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "()V", line = 111)
    public class85() {
        super(0, true);
    }

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "(B)V", line = 121)
    public final void method111(byte arg0) {
        this.method594(0);
        field1374++;
        if (arg0 != -57) {
            this.method111((byte) 124);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(BI)[I", line = 145)
    public final int[] method21(byte arg0, int arg1) {
        field1364++;
        int var3 = 99 / ((arg0 + 49) / 33);
        int[] var4 = this.field4425.method906(arg1, 8251);
        if (this.field4425.field2043) {
            int var5 = 0;
            int var6;
            for (var6 = class20.field324[arg1] + this.field1386; var6 < 0; var6 += 4096) {
            }
            while (var6 > 4096) {
                var6 -= 4096;
            }
            while (var5 < this.field1370 && this.field1384[var5] <= var6) {
                var5++;
            }
            int var7 = var5 - 1;
            int var8 = this.field1384[var5];
            boolean var9 = (var5 & 0x1) == 0;
            int var10 = this.field1384[var5 - 1];
            if (this.field1372 + var10 < var6 && var8 - this.field1372 > var6) {
                for (int var11 = 0; var11 < class92.field1576; var11++) {
                    int var12 = var9 ? this.field1381 : -this.field1381;
                    int var13 = 0;
                    int var14;
                    for (var14 = (this.field1363 * var12 >> 12) + class245.field4120[var11]; var14 < 0; var14 += 4096) {
                    }
                    while (var14 > 4096) {
                        var14 -= 4096;
                    }
                    while (var13 < this.field1368 && this.field1387[var7][var13] <= var14) {
                        var13++;
                    }
                    int var15 = this.field1387[var7][var13];
                    int var16 = var13 - 1;
                    int var17 = this.field1387[var7][var16];
                    if ((this.field1372 + var17) < var14 && (var15 - this.field1372) > var14) {
                        var4[var11] = this.field1388[var7][var16];
                    } else {
                        var4[var11] = 0;
                    }
                }
            } else {
                class36.method218(var4, 0, class92.field1576, 0);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)V", line = 245)
    public static final void method595(int arg0, int arg1) {
        field1373++;
        if (arg1 != 0) {
            method595(50, -48);
        }
        if (class187.field3011 == arg0 && arg0 != 0) {
            class21 var2 = class145.field2426[arg0];
            var2.method119(class109.field1851);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lpb;BI)V", line = 284)
    public final void method20(class70 arg0, byte arg1, int arg2) {
        field1365++;
        if (arg1 >= -115) {
            this.method21((byte) 61, 1);
        }
        if (arg2 == 0) {
            this.field1368 = arg0.method481(0);
        } else if (arg2 == 1) {
            this.field1370 = arg0.method481(0);
        } else if (arg2 == 2) {
            this.field1367 = arg0.method423(255);
        } else if (arg2 == 3) {
            this.field1366 = arg0.method423(255);
        } else if (arg2 == 4) {
            this.field1381 = arg0.method423(255);
        } else if (arg2 == 5) {
            this.field1386 = arg0.method423(255);
        } else if (arg2 == 6) {
            this.field1371 = arg0.method423(255);
        } else if (arg2 == 7) {
            this.field1376 = arg0.method423(255);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIIIIIIIII)V", line = 373)
    public static final void method596(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field1383++;
        int var11 = arg4 - arg0;
        if (class41.field636 > arg4) {
            var11++;
        }
        int var12 = arg10 - arg7;
        if (arg10 < class282.field4846) {
            var12++;
        }
        int var10000;
        for (int var13 = 0; var13 < var12; var13++) {
            int var14 = (var13 + 1) * arg3 + arg1 >> 16;
            int var15 = arg3 * var13 + arg1 >> 16;
            int var16 = var14 - var15;
            if (var16 > 0) {
                int var17 = var13 + arg7 >> 6;
                if (var17 >= 0 && class203.field3503.length - 1 >= var17) {
                    int var18 = arg9 + var14;
                    int[][] var19 = class203.field3503[var17];
                    int var20 = arg9 + var15;
                    byte[][] var21 = class118.field1981[var17];
                    byte[][] var22 = class76.field1248[var17];
                    byte[][] var23 = class149.field2514[var17];
                    byte[][] var24 = class160.field2700[var17];
                    byte[][] var25 = class177.field2897[var17];
                    for (int var26 = 0; var26 < var11; var26++) {
                        int var27 = arg6 + (arg2 * var26) >> 16;
                        int var28 = (var26 + 1) * arg2 + arg6 >> 16;
                        int var29 = var28 - var27;
                        if (var29 > 0) {
                            int var30 = arg8 + var28;
                            int var31 = arg0 + var26 >> 6;
                            int var32 = arg8 + var27;
                            int var33 = arg0 + var26 & 0x3F;
                            int var34 = arg7 + var13 & 0x3F;
                            int var35 = (var33 << 6) + var34;
                            int var36;
                            if (var31 < 0 || var31 > var19.length - 1 || var19[var31] == null) {
                                if (class253.field4277.field1567 != -1) {
                                    var36 = class253.field4277.field1567;
                                } else if ((var13 + arg7 & 0x4) == (arg0 + var26 & 0x4)) {
                                    var36 = class106.field1782[class32.field521 + 1];
                                } else {
                                    var36 = 4936552;
                                }
                                if (var31 < 0 || var31 > (var19.length - 1)) {
                                    if (var36 == 0) {
                                        var36 = 1;
                                    }
                                    class175.method1249(var20, var32, var16, var29, var36);
                                    continue;
                                }
                            } else {
                                var36 = var19[var31][var35];
                            }
                            int var37 = var24[var31] == null ? 0 : class106.field1782[var24[var31][var35] & 0xFF];
                            int var38 = var21[var31] == null ? 0 : class106.field1782[var21[var31][var35] & 0xFF];
                            if (var36 == 0) {
                                var36 = 1;
                            }
                            if (var38 == 0 && var37 == 0) {
                                class175.method1249(var20, var32, var16, var29, var36);
                            } else {
                                if (var38 != 0) {
                                    byte var39 = var22[var31] == null ? 0 : var22[var31][var35];
                                    int var40 = var39 & 0xFC;
                                    if (var38 == -1) {
                                        var38 = 1;
                                    }
                                    if (var40 == 0 || var16 <= 1 || var29 <= 1) {
                                        class175.method1249(var20, var32, var16, var29, var38);
                                    } else {
                                        class251.method1725(var16, var39 & 0x3, var36, var40 >> 2, var32, var20, true, var29, class175.field2891, var38, false);
                                    }
                                }
                                if (var37 != 0) {
                                    if (var37 == -1) {
                                        var37 = var36;
                                    }
                                    byte var41 = var23[var31][var35];
                                    int var42 = var41 & 0xFC;
                                    if (var42 == 0 || var16 <= 1 || var29 <= 1) {
                                        class175.method1249(var20, var32, var16, var29, var37);
                                    }
                                    class251.method1725(var16, var41 & 0x3, 0, var42 >> 2, var32, var20, var38 == 0, var29, class175.field2891, var37, false);
                                }
                            }
                            if (var25[var31] != null) {
                                int var43 = var25[var31][var35] & 0xFF;
                                if (var43 != 0) {
                                    int var44;
                                    if (var16 == 1) {
                                        var44 = var20;
                                    } else {
                                        var44 = var18 - 1;
                                    }
                                    int var45 = 13421772;
                                    if (var43 >= 5 && var43 <= 8 || var43 >= 13 && var43 <= 16 || var43 >= 21 && var43 <= 24 || var43 == 27 || var43 == 28) {
                                        var45 = 13369344;
                                        var43 -= 4;
                                    }
                                    int var46;
                                    if (var29 == 1) {
                                        var46 = var32;
                                    } else {
                                        var46 = var30 - 1;
                                    }
                                    if (var43 == 1) {
                                        class175.method1239(var20, var32, var29, var45);
                                    } else if (var43 == 2) {
                                        class175.method1242(var20, var32, var16, var45);
                                    } else if (var43 == 3) {
                                        class175.method1239(var44, var32, var29, var45);
                                    } else if (var43 == 4) {
                                        class175.method1242(var20, var46, var16, var45);
                                    } else if (var43 == 9) {
                                        class175.method1239(var20, var32, var29, 16777215);
                                        class175.method1242(var20, var32, var16, var45);
                                    } else if (var43 == 10) {
                                        class175.method1239(var44, var32, var29, 16777215);
                                        class175.method1242(var20, var32, var16, var45);
                                    } else if (var43 == 11) {
                                        class175.method1239(var44, var32, var29, 16777215);
                                        class175.method1242(var20, var46, var16, var45);
                                    } else if (var43 == 12) {
                                        class175.method1239(var20, var32, var29, 16777215);
                                        class175.method1242(var20, var46, var16, var45);
                                    } else if (var43 == 17) {
                                        class175.method1242(var20, var32, 1, var45);
                                    } else if (var43 == 18) {
                                        class175.method1242(var44, var32, 1, var45);
                                    } else if (var43 == 19) {
                                        class175.method1242(var44, var46, 1, var45);
                                    } else if (var43 == 20) {
                                        class175.method1242(var20, var46, 1, var45);
                                    } else if (var43 == 25) {
                                        for (int var47 = 0; var47 < var29; var47++) {
                                            class175.method1242(var20 + var47, -var47 + var46, 1, var45);
                                        }
                                    } else if (var43 == 26) {
                                        for (int var48 = 0; var48 < var29; var48++) {
                                            class175.method1242(var20 + var48, var32 + var48, 1, var45);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    var10000 = arg9 + var14;
                    int var50 = arg9 + var15;
                    for (int var51 = 0; var51 < var11; var51++) {
                        int var52;
                        if (class253.field4277.field1567 != -1) {
                            var52 = class253.field4277.field1567;
                        } else if ((arg0 + var51 & 0x4) == (arg7 + var13 & 0x4)) {
                            var52 = class106.field1782[class32.field521 + 1];
                        } else {
                            var52 = 4936552;
                        }
                        int var53 = (arg6 + (arg2 * var51) >> 16) + arg8;
                        int var54 = (arg6 + ((var51 + 1) * arg2) >> 16) + arg8;
                        if (var52 == 0) {
                            var52 = 1;
                        }
                        int var55 = var54 - var53;
                        class175.method1249(var50, var53, var16, var55, var52);
                    }
                }
            }
        }
        if (arg5 < 32) {
            field1377 = (class255) null;
        }
        for (int var56 = -2; var56 < (var12 + 2); var56++) {
            int var57 = (var56 + 1) * arg3 + arg1 >> 16;
            int var58 = arg3 * var56 + arg1 >> 16;
            int var59 = var57 - var58;
            if (var59 > 0) {
                int var60 = arg9 + var58;
                int var61 = var56 + arg7 >> 6;
                var10000 = arg9 + var57;
                if (var61 >= 0 && var61 <= (class277.field4753.length - 1)) {
                    short[][] var63 = class277.field4753[var61];
                    for (int var64 = -2; var64 < var11 + 2; var64++) {
                        int var65 = (var64 + 1) * arg2 + arg6 >> 16;
                        int var66 = arg6 + (arg2 * var64) >> 16;
                        int var67 = var65 - var66;
                        if (var67 > 0) {
                            var10000 = arg8 + var65;
                            int var69 = arg8 + var66;
                            int var70 = arg0 + var64 >> 6;
                            if (var70 >= 0 && var70 <= (var63.length - 1)) {
                                int var71 = ((arg0 + var64 & 0x3F) << 6) + (arg7 + var56 & 0x3F);
                                if (var63[var70] != null) {
                                    int var72 = var63[var70][var71] & 0x3FFF;
                                    int var73 = (var63[var70][var71] & 0xD5A7) >> 14;
                                    if (var72 != 0) {
                                        if (var73 == 0) {
                                            int var74 = class132.field2206[var72 - 1].field75 * var59 / 4;
                                            int var75 = class132.field2206[var72 - 1].field73 * var67 / 4;
                                            int var76 = class132.field2206[var72 - 1].field74 * var67 / 4;
                                            class132.field2206[var72 - 1].method1913(var60, var69 - var76, var74, var75);
                                        } else if (var73 == 1) {
                                            int var83 = class149.field2525[var72 - 1].field75 * var59 / 4;
                                            int var84 = class149.field2525[var72 - 1].field73 * var67 / 4;
                                            int var85 = class149.field2525[var72 - 1].field74 * var67 / 4;
                                            class149.field2525[var72 - 1].method1913(var60, var69 - var85, var83, var84);
                                        } else if (var73 == 2) {
                                            int var77 = class129.field2126[var72 - 1].field75 * var59 / 4;
                                            int var78 = class129.field2126[var72 - 1].field73 * var67 / 4;
                                            int var79 = class129.field2126[var72 - 1].field74 * var67 / 4;
                                            class129.field2126[var72 - 1].method1913(var60, var69 - var79, var77, var78);
                                        } else if (var73 == 3) {
                                            int var80 = class20.field335[var72 - 1].field75 * var59 / 4;
                                            int var81 = class20.field335[var72 - 1].field73 * var67 / 4;
                                            int var82 = class20.field335[var72 - 1].field74 * var67 / 4;
                                            class20.field335[var72 - 1].method1913(var60, var69 - var82, var80, var81);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
