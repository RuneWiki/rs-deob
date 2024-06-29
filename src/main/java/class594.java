import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class594 {

    @OriginalMember(owner = "client!rg", name = "o", descriptor = "Lmq;")
    private class472 field8589 = new class472(64);

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "Ljn;")
    public class668 field8580;

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "Ljn;")
    private class668 field8584;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "Ljk;")
    public static class585 field8576 = new class585(28, 3);

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "Lwo;")
    public static class690 field8582 = new class690(56, -1);

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "[I")
    public static int[] field8585 = new int[32];

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "[I")
    public static int[] field8586 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!rg", name = "m", descriptor = "Ljk;")
    public static class585 field8587 = new class585(11, 6);

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
    public static int field8575;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
    public static int field8577;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
    public static int field8578;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "I")
    public static int field8579;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "I")
    public static int field8581;

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
    public static int field8583;

    @OriginalMember(owner = "client!rg", name = "n", descriptor = "I")
    public static int field8588;

    @OriginalMember(owner = "client!rg", name = "p", descriptor = "I")
    public static int field8590;

    @OriginalMember(owner = "client!rg", name = "q", descriptor = "I")
    public static int field8591;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)V")
    public final void method3438(int arg0, int arg1) {
        field8575++;
        class472 var3 = this.field8589;
        synchronized (this.field8589) {
            if (arg1 == 2) {
                this.field8589.method2777(arg0, 32);
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V")
    public final void method3439(int arg0) {
        if (arg0 != 0) {
            method3441(70);
        }
        class472 var2 = this.field8589;
        synchronized (this.field8589) {
            this.field8589.method2778((byte) 124);
        }
        field8579++;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)V")
    public final void method3440(int arg0) {
        class472 var2 = this.field8589;
        synchronized (this.field8589) {
            this.field8589.method2776(false);
        }
        field8590++;
        if (arg0 != 16711935) {
            field8582 = null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(I)V")
    public static void method3441(int arg0) {
        field8586 = null;
        field8582 = null;
        field8576 = null;
        if (arg0 != 4253) {
            field8581 = -127;
        }
        field8587 = null;
        field8585 = null;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Z)V")
    public static final void method3442(boolean arg0) {
        class127.field1614 = class404.method2436(8, 8, 35, 2048, 0.4F, 4, 5, true);
        field8578++;
        if (arg0) {
            field8576 = null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(II)Ltr;")
    public final class266 method3443(int arg0, int arg1) {
        field8583++;
        class472 var3 = this.field8589;
        class266 var5;
        synchronized (this.field8589) {
            int var4 = -64 % ((57 - arg1) / 48);
            var5 = (class266) this.field8589.method2766(-127, (long) arg0);
        }
        if (var5 != null) {
            return var5;
        }
        class668 var6 = this.field8584;
        byte[] var7;
        synchronized (this.field8584) {
            var7 = this.field8584.method3800(arg0, 3, (byte) -92);
        }
        class266 var8 = new class266();
        var8.field3659 = this;
        if (var7 != null) {
            var8.method1611(-1, new class389(var7));
        }
        class472 var9 = this.field8589;
        synchronized (this.field8589) {
            this.field8589.method2772(var8, true, (long) arg0);
            return var8;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(BLjn;)V")
    public static final void method3444(byte arg0, class668 arg1) {
        class589.field8530 = arg1;
        field8588++;
        if (arg0 >= -51) {
            field8581 = 2;
        }
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Ler;ILjn;Ljn;)V")
    public class594(class90 arg0, int arg1, class668 arg2, class668 arg3) {
        this.field8580 = arg3;
        this.field8584 = arg2;
        this.field8584.method3805(3, false);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIIBII)V")
    public static final void method3445(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field8577++;
        int var7 = class394.field5564;
        int[] var8 = class82.field1176;
        class463.field6465 = 0;
        for (int var9 = 0; var9 < (class99.field1332 + var7); var9++) {
            class323 var32 = null;
            class213 var33;
            if (var9 >= var7) {
                var33 = ((class633) class522.field7662.method3678((long) class600.field8658[var9 - var7], -121)).field9097;
                var32 = ((class557) var33).field8052;
                if (var32.field4315 != null) {
                    var32 = var32.method1881(class410.field5804, (byte) -92);
                    if (var32 == null) {
                        continue;
                    }
                }
            } else {
                var33 = class184.field2252[var8[var9]];
            }
            if (var33.field2591 >= 0 && (class114.field1478 == var33.field2659 || class206.field2472.field532 == var33.field532)) {
                class176.method1105((byte) 66, arg5 >> 1, arg1 >> 1, arg0, arg3, var33, var33.method1294((byte) 115));
                if (class438.field6260[0] >= 0) {
                    if (var33.field2639 != null && (var9 >= var7 || class219.field2833 == 0 || class219.field2833 == 3 || class219.field2833 == 1 && class178.method1113((byte) -82, ((class613) var33).field8801)) && class373.field5019 > class463.field6465) {
                        class373.field5023[class463.field6465] = class12.field205.method553(var33.field2639, -87) / 2;
                        class373.field5027[class463.field6465] = class438.field6260[0];
                        class373.field5020[class463.field6465] = class438.field6260[1];
                        class373.field5021[class463.field6465] = var33.field2576;
                        class373.field5029[class463.field6465] = var33.field2658;
                        class373.field5025[class463.field6465] = var33.field2621;
                        class373.field5028[class463.field6465] = var33.field2639;
                        class463.field6465++;
                    }
                    int var34 = arg2 + class438.field6260[1];
                    int var45;
                    if (var33.field2597 || var33.field2674 <= class543.field7882) {
                        var45 = var34 - Math.max(class12.field205.field829, class335.field4463[0].method900());
                    } else {
                        boolean var35 = true;
                        byte var36 = 1;
                        int var37;
                        if (var7 <= var9) {
                            var37 = var32.field4264;
                            if (var37 == -1) {
                                var37 = var33.method1280(-1).field8372;
                            }
                        } else {
                            class613 var38 = class184.field2252[var8[var9]];
                            var37 = var33.method1280(-1).field8372;
                            if (var38.field8782) {
                                var36 = 2;
                            }
                        }
                        class701[] var39 = class335.field4463;
                        if (var37 != -1) {
                            class701[] var40 = (class701[]) class89.field1252.method2766(-124, (long) var37);
                            if (var40 == null) {
                                class495[] var41 = class495.method2877(class692.field9847, var37, 0);
                                if (var41 != null) {
                                    var40 = new class701[var41.length];
                                    for (int var42 = 0; var42 < var41.length; var42++) {
                                        var40[var42] = class68.field1045.method216(var41[var42], true);
                                    }
                                    class89.field1252.method2772(var40, true, (long) var37);
                                }
                            }
                            if (var40 != null && var40.length >= 2) {
                                var39 = var40;
                            }
                        }
                        if (var39.length <= var36) {
                            var36 = 1;
                        }
                        class701 var43 = var39[0];
                        class701 var44 = var39[var36];
                        var45 = var34 - Math.max(class12.field205.field829, var43.method900());
                        int var46 = arg6 + class438.field6260[0] - (var43.method902() >> 1);
                        int var47 = var43.method902() * var33.field2607 / 255;
                        if (var33.field2607 > 0 && var47 < 2) {
                            var47 = 2;
                        }
                        var43.method3924(var46, var45);
                        class68.field1045.method300(var46, var45, var46 + var47, var45 + var43.method900());
                        var44.method3924(var46, var45);
                        class68.field1045.method292(arg6, arg2, arg1 + arg6, arg2 - -arg5);
                    }
                    var45 -= 2;
                    if (!var33.field2597) {
                        if (class543.field7882 < var33.field2669) {
                            class701 var48 = class251.field3445[var33.field2633 ? 2 : 0];
                            class701 var49 = class251.field3445[var33.field2633 ? 3 : 1];
                            boolean var50 = true;
                            int var51;
                            if (var33 instanceof class557) {
                                var51 = var32.field4252;
                                if (var51 == -1) {
                                    var51 = var33.method1280(-1).field8364;
                                }
                            } else {
                                var51 = var33.method1280(-1).field8364;
                            }
                            if (var51 != -1) {
                                class701[] var52 = (class701[]) class72.field1088.method2766(-125, (long) var51);
                                if (var52 == null) {
                                    class495[] var53 = class495.method2877(class692.field9847, var51, 0);
                                    if (var53 != null) {
                                        var52 = new class701[var53.length];
                                        for (int var54 = 0; var54 < var53.length; var54++) {
                                            var52[var54] = class68.field1045.method216(var53[var54], true);
                                        }
                                        class72.field1088.method2772(var52, true, (long) var51);
                                    }
                                }
                                if (var52 != null && var52.length == 4) {
                                    var48 = var52[var33.field2633 ? 2 : 0];
                                    var49 = var52[var33.field2633 ? 3 : 1];
                                }
                            }
                            int var55 = var33.field2669 - class543.field7882;
                            int var58;
                            if (var33.field2635 < var55) {
                                int var56 = var55 - var33.field2635;
                                int var57 = var33.field2673 == 0 ? 0 : (var33.field2586 - var56) / var33.field2673 * var33.field2673;
                                var58 = var48.method902() * var57 / var33.field2586;
                            } else {
                                var58 = var48.method902();
                            }
                            int var59 = var48.method900();
                            var45 -= var59;
                            int var60 = class438.field6260[0] + (arg6 - (var48.method902() >> 1));
                            var48.method3924(var60, var45);
                            class68.field1045.method300(var60, var45, var58 + var60, var45 - -var59);
                            var49.method3924(var60, var45);
                            var45 -= 2;
                            class68.field1045.method292(arg6, arg2, arg6 + arg1, arg2 + arg5);
                        }
                        if (var7 > var9) {
                            class613 var62 = (class613) var33;
                            if (var62.field8787 != -1) {
                                var45 -= 25;
                                class521.field7651[var62.field8787].method3924(arg6 + class438.field6260[0] - 12, var45);
                                var45 -= 2;
                            }
                            if (var62.field8780 != -1) {
                                var45 -= 25;
                                client.field3739[var62.field8780].method3924(arg6 + class438.field6260[0] - 12, var45);
                                var45 -= 2;
                            }
                        } else if (var32.field4298 >= 0 && var32.field4298 < client.field3739.length) {
                            var45 -= 25;
                            class701 var61 = client.field3739[var32.field4298];
                            var61.method3924(class438.field6260[0] + arg6 - (var61.method902() >> 1), var45);
                            var45 -= 2;
                        }
                    }
                    int var10000;
                    if (!var33 instanceof class613) {
                        int var69 = 0;
                        class341[] var70 = class631.field9068;
                        for (int var71 = 0; var71 < var70.length; var71++) {
                            class341 var76 = var70[var71];
                            if (var76 != null && var76.field4508 == 1 && class600.field8658[var9 - var7] == var76.field4513) {
                                class701 var77 = class524.field7696[var76.field4510];
                                if (var77.method900() > var69) {
                                    var69 = var77.method900();
                                }
                                if (class543.field7882 % 20 < 10) {
                                    var77.method3924(class438.field6260[0] + arg6 - 12, -var77.method900() + var45);
                                }
                            }
                        }
                        if (var69 > 0) {
                            var10000 = var45 - (var69 + 2);
                        }
                    } else if (var9 >= 0) {
                        int var63 = 0;
                        class341[] var64 = class631.field9068;
                        for (int var65 = 0; var65 < var64.length; var65++) {
                            class341 var67 = var64[var65];
                            if (var67 != null && var67.field4508 == 10 && var8[var9] == var67.field4513) {
                                class701 var68 = class524.field7696[var67.field4510];
                                if (var63 < var68.method900()) {
                                    var63 = var68.method900();
                                }
                                var68.method3924(class438.field6260[0] + arg6 - 12, -var68.method900() + var45);
                            }
                        }
                        if (var63 > 0) {
                            var10000 = var45 - (var63 + 2);
                        }
                    }
                    for (int var73 = 0; var73 < 4; var73++) {
                        if (class543.field7882 < var33.field2581[var73]) {
                            int var74 = var33.method1294((byte) 70) / 2;
                            class176.method1105((byte) 57, arg5 >> 1, arg1 >> 1, arg0, arg3, var33, var74);
                            if (class438.field6260[0] > -1) {
                                int var75 = class410.field5803[var33.field2675[var73]].method902();
                                if (var73 == 1) {
                                    class438.field6260[1] -= 20;
                                }
                                if (var73 == 2) {
                                    class438.field6260[1] -= 10;
                                    class438.field6260[0] -= var75 - 9;
                                }
                                if (var73 == 3) {
                                    class438.field6260[1] -= 10;
                                    class438.field6260[0] += var75 - 9;
                                }
                                class410.field5803[var33.field2675[var73]].method3924(class438.field6260[0] + arg6 - (var75 >> 1), arg2 - -class438.field6260[1] + -12);
                                class242.field3330.method2525(arg6 - (1 - class438.field6260[0]), class438.field6260[1] + arg2 + 3, Integer.toString(var33.field2604[var73]), -1, 0, -64);
                            }
                        }
                    }
                }
            }
        }
        for (int var10 = 0; var10 < class556.field8041; var10++) {
            int var28 = class359.field4786[var10];
            class213 var29;
            if (var28 >= 2048) {
                var29 = ((class633) class522.field7662.method3678((long) (var28 - 2048), -127)).field9097;
            } else {
                var29 = class184.field2252[var28];
            }
            int var30 = class23.field569[var10];
            class213 var31;
            if (var30 >= 2048) {
                var31 = ((class633) class522.field7662.method3678((long) (var30 - 2048), -127)).field9097;
            } else {
                var31 = class184.field2252[var30];
            }
            class113.method805(arg6, arg1, arg0, arg2, var31, --var29.field2582, var29, arg3, false, arg5);
        }
        int var11 = class12.field205.field829 + class12.field205.field833 + 2;
        int var12 = 0;
        if (arg4 <= 126) {
            method3445(-90, 74, 127, -92, (byte) -104, -40, -2);
        }
        while (var12 < class463.field6465) {
            int var13 = class373.field5027[var12];
            int var14 = class373.field5020[var12];
            int var15 = class373.field5023[var12];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var27 = 0; var27 < var12; var27++) {
                    if ((var14 + 2) > (class373.field5020[var27] - var11) && class373.field5020[var27] + 2 > -var11 + var14 && (var13 - var15) < (class373.field5027[var27] + class373.field5023[var27]) && (var13 + var15) > (class373.field5027[var27] - class373.field5023[var27]) && class373.field5020[var27] - var11 < var14) {
                        var14 = class373.field5020[var27] - var11;
                        var16 = true;
                    }
                }
            }
            class373.field5020[var12] = var14;
            String var17 = class373.field5028[var12];
            if (class67.field1034 == 0) {
                int var18 = 16776960;
                if (class373.field5021[var12] < 6) {
                    var18 = class88.field1238[class373.field5021[var12]];
                }
                if (class373.field5021[var12] == 6) {
                    var18 = class114.field1478 % 20 < 10 ? 16711680 : 16776960;
                }
                if (class373.field5021[var12] == 7) {
                    var18 = class114.field1478 % 20 < 10 ? 255 : 65535;
                }
                if (class373.field5021[var12] == 8) {
                    var18 = (class114.field1478 % 20) >= 10 ? 8454016 : 45056;
                }
                if (class373.field5021[var12] == 9) {
                    int var19 = 150 - class373.field5025[var12];
                    if (var19 < 50) {
                        var18 = var19 * 1280 + 16711680;
                    } else if (var19 < 100) {
                        var18 = 33160960 - var19 * 327680;
                    } else if (var19 < 150) {
                        var18 = (var19 - 100) * 5 + 65280;
                    }
                }
                if (class373.field5021[var12] == 10) {
                    int var20 = 150 - class373.field5025[var12];
                    if (var20 < 50) {
                        var18 = var20 * 5 + 16711680;
                    } else if (var20 < 100) {
                        var18 = 16711935 - ((var20 - 50) * 327680);
                    } else if (var20 < 150) {
                        var18 = var20 * 327680 + 255 + 500 - (var20 * 5) - 32768000;
                    }
                }
                if (class373.field5021[var12] == 11) {
                    int var21 = 150 - class373.field5025[var12];
                    if (var21 < 50) {
                        var18 = 16777215 - (var21 * 327685);
                    } else if (var21 < 100) {
                        var18 = (var21 - 50) * 327685 + 65280;
                    } else if (var21 < 150) {
                        var18 = 16777215 - (var21 - 100) * 327680;
                    }
                }
                int var22 = var18 | 0xFF000000;
                if (class373.field5029[var12] == 0) {
                    class36.field691.method2525(arg6 + var13, arg2 + var14, var17, var22, -16777216, -42);
                }
                if (class373.field5029[var12] == 1) {
                    class36.field691.method2531(var17, class114.field1478, arg6 + var13, -16777216, arg2 + var14, (byte) 79, var22);
                }
                if (class373.field5029[var12] == 2) {
                    class36.field691.method2520(class114.field1478, arg2 + var14, var22, arg6 + var13, var17, (byte) 79, -16777216);
                }
                if (class373.field5029[var12] == 3) {
                    class36.field691.method2527(2, var17, arg2 + var14, class114.field1478, arg6 + var13, -class373.field5025[var12] + 150, var22, -16777216);
                }
                if (class373.field5029[var12] == 4) {
                    int var23 = (150 - class373.field5025[var12]) * (class12.field205.method553(var17, -111) + 100) / 150;
                    class68.field1045.method300(arg6 + var13 - 50, arg2, arg6 + var13 + 50, arg2 - -arg5);
                    class36.field691.method2515(-16777216, 0, var22, var17, arg2 + var14, arg6 + var13 + 50 + -var23);
                    class68.field1045.method292(arg6, arg2, arg1 + arg6, arg2 + arg5);
                }
                if (class373.field5029[var12] == 5) {
                    int var24 = 150 - class373.field5025[var12];
                    int var25 = 0;
                    if (var24 < 25) {
                        var25 = var24 - 25;
                    } else if (var24 > 125) {
                        var25 = var24 - 125;
                    }
                    int var26 = class12.field205.field833 + class12.field205.field829;
                    class68.field1045.method300(arg6, arg2 + var14 - var26 - 1, arg1 + arg6, var14 + arg2 + 5);
                    class36.field691.method2525(arg6 + var13, arg2 + var14 + var25, var17, var22, -16777216, 84);
                    class68.field1045.method292(arg6, arg2, arg1 + arg6, arg2 + arg5);
                }
            } else {
                class36.field691.method2525(arg6 + var13, arg2 + var14, var17, -256, -16777216, 113);
            }
            var12++;
        }
    }
}
