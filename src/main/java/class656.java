import java.util.Calendar;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class656 {

    @OriginalMember(owner = "client!sn", name = "h", descriptor = "Lwq;")
    private class178 field9481 = new class178(64);

    @OriginalMember(owner = "client!sn", name = "g", descriptor = "Lla;")
    private class476 field9480;

    @OriginalMember(owner = "client!sn", name = "k", descriptor = "Lla;")
    public class476 field9475;

    @OriginalMember(owner = "client!sn", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9487 = new String[] { method4820(method4819("\u0010\u0018q\u001ac")), method4820(method4819("\u0010\u0018q\u001ec")), method4820(method4819("_\u001501vSF9;-\u0005H")), method4820(method4819("C[a}w\u0000\u00193`{S\u00109;-]")), method4820(method4819("_\u001501v\u0005\u0010fm\u007fSH")), method4820(method4819("\u0018Xqs6")), method4820(method4819("\r\u000331")), method4820(method4819("C[a")), method4820(method4819("C[a}w\u0000\u00193`-\u0005Ooi{]")), method4820(method4819("\u0010\u0018q\u0019c")), method4820(method4819("\u0010\u0018q\u0014c")), method4820(method4819("\u0010\u0018q\u0018c")), method4820(method4819("\u0010\u0018q\u0015c")), method4820(method4819("\u0010\u0018qa\"\r\u001f+cc")), method4820(method4819("\u0010\u0018q\u001fc")), method4820(method4819("\u0010\u0018q\u001bc")), method4820(method4819("\u0010\u0018q\u001cc")) };

    @OriginalMember(owner = "client!sn", name = "n", descriptor = "[I")
    public static int[] field9473 = new int[5];

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "Ldv;")
    public static class685 field9474 = new class685(10, 2, 2, 0);

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "I")
    public static int field9476;

    @OriginalMember(owner = "client!sn", name = "i", descriptor = "I")
    public static int field9477;

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "I")
    public static int field9478;

    @OriginalMember(owner = "client!sn", name = "j", descriptor = "I")
    public static int field9479;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "I")
    public static int field9482;

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "I")
    public static int field9483;

    @OriginalMember(owner = "client!sn", name = "l", descriptor = "I")
    public static int field9484;

    @OriginalMember(owner = "client!sn", name = "m", descriptor = "I")
    public static int field9485;

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "[I")
    public static int[] field9486;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(II)Luj;")
    public final class403 method4810(int arg0, int arg1) {
        try {
            field9482++;
            class178 var3 = this.field9481;
            class403 var4;
            synchronized (this.field9481) {
                var4 = (class403) this.field9481.method1558((byte) 96, (long) arg1);
            }
            if (var4 != null) {
                return var4;
            }
            class476 var5 = this.field9480;
            byte[] var6;
            synchronized (this.field9480) {
                var6 = this.field9480.method3632(arg0, arg1, arg0 - 121);
            }
            class403 var7 = new class403();
            var7.field6012 = this;
            if (var6 != null) {
                var7.method3163(new class163(var6), (byte) 30);
            }
            class178 var8 = this.field9481;
            synchronized (this.field9481) {
                this.field9481.method1556((long) arg1, var7, 1);
                return var7;
            }
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field9487[15] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(ILha;II)V")
    public static final void method4811(int arg0, class66 arg1, int arg2, int arg3) {
        try {
            field9483++;
            if (arg3 >= 0 && arg2 >= 0 && class127.field1498 != 0 && class293.field4324 != 0) {
                class501 var4;
                int var6;
                int var7;
                int var8;
                int var9;
                int var10;
                int var11;
                if (class235.field3549) {
                    class607.method4494(false, (byte) 123);
                    var4 = arg1.method577();
                    int[] var5 = arg1.method548();
                    var6 = var5[3];
                    var7 = var5[2];
                    var8 = var5[1];
                    var9 = var5[0];
                    var10 = class268.method2227(7521, false) + arg3;
                    var11 = arg2 + class366.method2969(false, (byte) 105);
                } else {
                    arg1.method479(class629.field9205, class339.field5276, class127.field1498, class293.field4324);
                    var6 = class293.field4324;
                    var8 = class339.field5276;
                    var7 = class127.field1498;
                    var9 = class629.field9205;
                    arg1.method489(class530.field7757, class760.field11010, class127.field1498, class293.field4324);
                    var4 = arg1.method517();
                    var4.method2365(class209.field3209, class575.field8501, class277.field4175, class178.field2486, class260.field4006, class114.field1357);
                    var11 = arg2;
                    var10 = arg3;
                    arg1.method495(var4);
                }
                if (var7 == 0) {
                    var7 = 1;
                }
                class120.method1047(1, true);
                if (var6 == 0) {
                    var6 = 1;
                }
                if (class184.field2541 != null && (!class728.field10555 || (class517.field7484 & 0x40) != 0)) {
                    int var12 = -1;
                    int var13 = -1;
                    int var14 = arg1.method583();
                    int var15 = arg1.method558();
                    int var16;
                    int var17;
                    int var18;
                    int var19;
                    if (class640.field9291) {
                        var17 = var19 = (var11 - var8) * class726.field10487 / var6;
                        var18 = var16 = (var10 - var9) * class726.field10487 / var7;
                    } else {
                        var16 = (var10 - var9) * var15 / var7;
                        var17 = (var11 - var8) * var14 / var6;
                        var18 = (var10 - var9) * var14 / var7;
                        var19 = (var11 - var8) * var15 / var6;
                    }
                    int[] var20 = new int[] { var18, var17, var14 };
                    var4.method2381(var20);
                    int[] var21 = new int[] { var16, var19, var15 };
                    var4.method2381(var21);
                    float var22 = class595.method4428((float) var21[1], (float) var20[0], (float) var21[0], (float) var21[2], 4, (byte) 22, (float) var20[2], (float) var20[1]);
                    if (var22 > 0.0F) {
                        int var23 = var21[0] - var20[0];
                        int var24 = var21[2] - var20[2];
                        int var25 = (int) ((float) var23 * var22 + (float) var20[0]);
                        int var26 = (int) ((float) var24 * var22 + (float) var20[2]);
                        var12 = (class225.field3446.method2101(31463) - 1 << 8) + var25 >> 9;
                        var13 = (class225.field3446.method2101(31463) - 1 << 8) + var26 >> 9;
                        byte var27 = class225.field3446.field6200;
                        if (var27 < 3 && (class184.field2545[1][var25 >> 9][var26 >> 9] & 0x2) != 0) {
                            int var89 = var27 + 1;
                        }
                    }
                    if (var12 != -1 && var13 != -1) {
                        if (class728.field10555 && (class517.field7484 & 0x40) != 0) {
                            class541 var28 = class211.method1854(class173.field2406, class729.field10569, false);
                            if (var28 == null) {
                                class431.method3305(-1);
                            } else {
                                class719.method5244(var12, (long) (var12 << 0 | var13), false, 0L, class10.field116, var13, true, field9487[7], class586.field8637, (byte) -104, 11, true, -1);
                            }
                        } else {
                            if (class365.field5588) {
                                class719.method5244(var12, (long) (var13 | var12 << 0), false, 0L, class309.field4874.method2616(false, class167.field2300), var13, true, "", -1, (byte) 11, 6, true, -1);
                            }
                            class298.field4698++;
                            class719.method5244(var12, (long) (var13 | var12 << 0), false, 0L, class212.field3246, var13, true, "", class706.field10253, (byte) -32, 12, true, -1);
                        }
                    }
                }
                if (class235.field3549) {
                    class710.method5178(-6837);
                }
                int var29 = 0;
                if (arg0 < -36) {
                    while ((class235.field3549 ? 2 : 1) > var29) {
                        boolean var30 = var29 == 0;
                        class214 var31 = var30 ? class675.field9785 : class84.field936;
                        int var32 = arg3;
                        int var33 = arg2;
                        if (class235.field3549) {
                            class607.method4494(var30, (byte) 99);
                            var32 = arg3 + class268.method2227(7521, var30);
                            var33 = arg2 + class366.method2969(var30, (byte) 105);
                        }
                        class614 var34 = var31.field3269;
                        for (class310 var35 = (class310) var34.method4538(false); var35 != null; var35 = (class310) var34.method4543(0)) {
                            if ((class73.field851 || class225.field3446.field6200 == var35.field4915.field6200) && var35.method2620(arg1, var32, var33, false)) {
                                boolean var36 = false;
                                boolean var37 = false;
                                int var38;
                                int var39;
                                if ((var35.field4915 instanceof class343)) {
                                    var39 = ((class343) var35.field4915).field5329;
                                    var38 = ((class343) var35.field4915).field5330;
                                } else {
                                    var38 = var35.field4915.field6197 >> 9;
                                    var39 = var35.field4915.field6211 >> 9;
                                }
                                if (var35.field4915 instanceof class726) {
                                    class726 var40 = (class726) var35.field4915;
                                    int var41 = var40.method2101(31463);
                                    if ((var41 & 0x1) == 0 && (var40.field6197 & 0x1FF) == 0 && (var40.field6211 & 0x1FF) == 0 || (var41 & 0x1) == 1 && (var40.field6197 & 0x1FF) == 256 && (var40.field6211 & 0x1FF) == 256) {
                                        int var42 = var40.field6197 - (var40.method2101(31463) - 1 << 8);
                                        int var43 = var40.field6211 - (var40.method2101(31463) - 1 << 8);
                                        for (int var44 = 0; var44 < class6.field60; var44++) {
                                            class383 var45 = (class383) class207.field3184.method977((long) class590.field8680[var44], 1);
                                            if (var45 != null) {
                                                class612 var46 = var45.field5799;
                                                if (class375.field5711 != var46.field3843 && var46.field3800) {
                                                    int var47 = var46.field6197 - (var46.field8947.field7159 - 1 << 8);
                                                    int var48 = var46.field6211 - (var46.field8947.field7159 - 1 << 8);
                                                    if (var42 <= var47 && var46.field8947.field7159 <= var40.method2101(31463) - (var47 - var42 >> 9) && var48 >= var43 && var46.field8947.field7159 <= (var40.method2101(31463) - (var48 - var43 >> 9))) {
                                                        class661.method4848(-127, class225.field3446.field6200 != var35.field4915.field6200, var46);
                                                        var46.field3843 = class375.field5711;
                                                    }
                                                }
                                            }
                                        }
                                        int var49 = class3.field34;
                                        int[] var50 = class358.field5483;
                                        for (int var51 = 0; var51 < var49; var51++) {
                                            class726 var52 = class197.field2685[var50[var51]];
                                            if (var52 != null && class375.field5711 != var52.field3843 && var40 != var52 && var52.field3800) {
                                                int var53 = var52.field6197 - (var52.method2101(31463) - 1 << 8);
                                                int var54 = var52.field6211 - (var52.method2101(31463) - 1 << 8);
                                                if (var42 <= var53 && var52.method2101(31463) <= var40.method2101(31463) - (var53 - var42 >> 9) && var54 >= var43 && var52.method2101(31463) <= (var40.method2101(31463) - (var54 - var43 >> 9))) {
                                                    class408.method3188(18944, var52, class225.field3446.field6200 != var35.field4915.field6200);
                                                    var52.field3843 = class375.field5711;
                                                }
                                            }
                                        }
                                    }
                                    if (class375.field5711 == var40.field3843) {
                                        continue;
                                    }
                                    class408.method3188(18944, var40, class225.field3446.field6200 != var35.field4915.field6200);
                                    var40.field3843 = class375.field5711;
                                }
                                if (var35.field4915 instanceof class612) {
                                    class612 var55 = (class612) var35.field4915;
                                    if (var55.field8947 != null) {
                                        if ((var55.field8947.field7159 & 0x1) == 0 && (var55.field6197 & 0x1FF) == 0 && (var55.field6211 & 0x1FF) == 0 || (var55.field8947.field7159 & 0x1) == 1 && (var55.field6197 & 0x1FF) == 256 && (var55.field6211 & 0x1FF) == 256) {
                                            int var56 = var55.field6197 - (var55.field8947.field7159 - 1 << 8);
                                            int var57 = var55.field6211 - (var55.field8947.field7159 - 1 << 8);
                                            for (int var58 = 0; var58 < class6.field60; var58++) {
                                                class383 var59 = (class383) class207.field3184.method977((long) class590.field8680[var58], 1);
                                                if (var59 != null) {
                                                    class612 var60 = var59.field5799;
                                                    if (class375.field5711 != var60.field3843 && var55 != var60 && var60.field3800) {
                                                        int var61 = var60.field6197 - (var60.field8947.field7159 - 1 << 8);
                                                        int var62 = var60.field6211 - (var60.field8947.field7159 - 1 << 8);
                                                        if (var61 >= var56 && var60.field8947.field7159 <= (var55.field8947.field7159 - (var61 - var56 >> 9)) && var62 >= var57 && (var55.field8947.field7159 - (var62 - var57 >> 9)) >= var60.field8947.field7159) {
                                                            class661.method4848(-123, class225.field3446.field6200 != var35.field4915.field6200, var60);
                                                            var60.field3843 = class375.field5711;
                                                        }
                                                    }
                                                }
                                            }
                                            int var63 = class3.field34;
                                            int[] var64 = class358.field5483;
                                            for (int var65 = 0; var65 < var63; var65++) {
                                                class726 var66 = class197.field2685[var64[var65]];
                                                if (var66 != null && class375.field5711 != var66.field3843 && var66.field3800) {
                                                    int var67 = var66.field6197 - (var66.method2101(31463) - 1 << 8);
                                                    int var68 = var66.field6211 - (var66.method2101(31463) - 1 << 8);
                                                    if (var56 <= var67 && var66.method2101(31463) <= var55.field8947.field7159 - (var67 - var56 >> 9) && var68 >= var57 && var66.method2101(31463) <= (var55.field8947.field7159 - (var68 - var57 >> 9))) {
                                                        class408.method3188(18944, var66, class225.field3446.field6200 != var35.field4915.field6200);
                                                        var66.field3843 = class375.field5711;
                                                    }
                                                }
                                            }
                                        }
                                        if (class375.field5711 == var55.field3843) {
                                            continue;
                                        }
                                        class661.method4848(-126, class225.field3446.field6200 != var35.field4915.field6200, var55);
                                        var55.field3843 = class375.field5711;
                                    }
                                }
                                if (var35.field4915 instanceof class289) {
                                    int var69 = class494.field7101 + var38;
                                    int var70 = var39 + class281.field4219;
                                    class672 var71 = (class672) class29.field357.method977((long) (var69 | var35.field4915.field6200 << 28 | var70 << 14), 1);
                                    if (var71 != null) {
                                        int var72 = 0;
                                        class719 var73 = (class719) var71.field9756.method3871(true);
                                        while (var73 != null) {
                                            class530 var74 = class540.field7920.method5000(var73.field10410, (byte) 100);
                                            if (class728.field10555 && class225.field3446.field6200 == var35.field4915.field6200) {
                                                class181 var75 = class263.field4037 == -1 ? null : class566.field8395.method3413((byte) -34, class263.field4037);
                                                if ((class517.field7484 & 0x1) != 0 && (var75 == null || var74.method3999(-113, class263.field4037, var75.field2506) != var75.field2506)) {
                                                    class538.field7892++;
                                                    class719.method5244(var38, (long) var72, false, (long) var73.field10410, class10.field116, var39, false, class740.field10757 + field9487[8] + var74.field7775, class586.field8637, (byte) 126, 30, true, -1);
                                                }
                                            }
                                            if (class225.field3446.field6200 == var35.field4915.field6200) {
                                                String[] var76 = var74.field7743;
                                                for (int var77 = 4; var77 >= 0; var77--) {
                                                    if (var76 != null && var76[var77] != null) {
                                                        byte var78 = 0;
                                                        int var79 = class330.field5190;
                                                        if (var77 == 0) {
                                                            var78 = 58;
                                                        }
                                                        if (var77 == 1) {
                                                            var78 = 44;
                                                        }
                                                        if (var77 == 2) {
                                                            var78 = 18;
                                                        }
                                                        if (var77 == 3) {
                                                            var78 = 49;
                                                        }
                                                        if (var74.field7724 == var77) {
                                                            var79 = var74.field7746;
                                                        }
                                                        if (var77 == 4) {
                                                            var78 = 57;
                                                        }
                                                        if (var74.field7766 == var77) {
                                                            var79 = var74.field7755;
                                                        }
                                                        class719.method5244(var38, (long) var72, false, (long) var73.field10410, var76[var77], var39, false, field9487[4] + var74.field7775, var79, (byte) 126, var78, true, -1);
                                                        class740.field10752++;
                                                    }
                                                }
                                            }
                                            class719.method5244(var38, (long) var72, class225.field3446.field6200 != var35.field4915.field6200, (long) var73.field10410, class309.field4869.method2616(false, class167.field2300), var39, false, field9487[4] + var74.field7775, class622.field9117, (byte) -9, 1009, true, -1);
                                            class16.field187++;
                                            var73 = (class719) var71.field9756.method3869(-762);
                                            var72++;
                                        }
                                    }
                                }
                                if (var35.field4915 instanceof class583) {
                                    class583 var80 = (class583) var35.field4915;
                                    class198 var81 = class417.field6144.method3030(0, var80.method1083((byte) -14));
                                    if (var81.field3017 != null) {
                                        var81 = var81.method1764(class276.field4168, -174);
                                    }
                                    if (var81 != null) {
                                        if (class728.field10555 && class225.field3446.field6200 == var35.field4915.field6200) {
                                            class181 var82 = class263.field4037 == -1 ? null : class566.field8395.method3413((byte) -34, class263.field4037);
                                            if ((class517.field7484 & 0x4) != 0 && (var82 == null || var81.method1762(class263.field4037, -1, var82.field2506) != var82.field2506)) {
                                                class60.field635++;
                                                class719.method5244(var38, (long) var80.hashCode(), false, class505.method3809(-109, var80, var39, var38), class10.field116, var39, false, class740.field10757 + field9487[3] + var81.field3033, class586.field8637, (byte) -46, 51, true, -1);
                                            }
                                        }
                                        if (class225.field3446.field6200 == var35.field4915.field6200) {
                                            String[] var83 = var81.field3045;
                                            if (var83 != null) {
                                                for (int var84 = 4; var84 >= 0; var84--) {
                                                    if (var83[var84] != null) {
                                                        short var85 = 0;
                                                        int var86 = class330.field5190;
                                                        if (var84 == 0) {
                                                            var85 = 22;
                                                        }
                                                        if (var84 == 1) {
                                                            var85 = 15;
                                                        }
                                                        if (var84 == 2) {
                                                            var85 = 3;
                                                        }
                                                        if (var84 == 3) {
                                                            var85 = 16;
                                                        }
                                                        if (var81.field3034 == var84) {
                                                            var86 = var81.field3028;
                                                        }
                                                        if (var84 == 4) {
                                                            var85 = 1002;
                                                        }
                                                        if (var81.field3077 == var84) {
                                                            var86 = var81.field3076;
                                                        }
                                                        class719.method5244(var38, (long) var80.hashCode(), false, class505.method3809(-127, var80, var39, var38), var83[var84], var39, false, field9487[2] + var81.field3033, var86, (byte) -40, var85, true, -1);
                                                        class253.field3920++;
                                                    }
                                                }
                                            }
                                            class712.field10319++;
                                            class719.method5244(var38, (long) var80.hashCode(), class225.field3446.field6200 != var35.field4915.field6200, (long) var81.field3014, class309.field4869.method2616(false, class167.field2300), var39, false, field9487[2] + var81.field3033, class622.field9117, (byte) 127, 1003, true, -1);
                                        }
                                    }
                                }
                            }
                        }
                        if (class235.field3549) {
                            class710.method5178(-6837);
                        }
                        var29++;
                    }
                    class120.method1047(1, false);
                }
            }
        } catch (RuntimeException var88) {
            throw class759.method5498(var88, field9487[9] + arg0 + ',' + (arg1 == null ? field9487[6] : field9487[5]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IB)V")
    public final void method4812(int arg0, byte arg1) {
        try {
            field9485++;
            class178 var3 = this.field9481;
            synchronized (this.field9481) {
                if (arg1 > 28) {
                    this.field9481.method1557(arg0, (byte) -126);
                }
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field9487[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lcn;IZ)V")
    public static final void method4813(class541 arg0, int arg1, boolean arg2) {
        try {
            field9479++;
            int var3 = arg0.field8103 == 0 ? arg0.field8029 : arg0.field8103;
            int var4 = arg0.field8090 == 0 ? arg0.field8045 : arg0.field8090;
            class657.method4824(var3, class683.field9897[arg0.field8034 >> 16], var4, 22652, arg2, arg0.field8034);
            if (arg0.field7945 != null) {
                class657.method4824(var3, arg0.field7945, var4, 22652, arg2, arg0.field8034);
            }
            if (arg1 == -35646576) {
                class454 var5 = (class454) class661.field9563.method977((long) arg0.field8034, arg1 + 35646577);
                if (var5 != null) {
                    class727.method5304(var5.field6640, -1, var3, var4, arg2);
                }
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field9487[10] + (arg0 == null ? field9487[6] : field9487[5]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(JIBZ)Ljava/lang/String;")
    public static final String method4814(long arg0, int arg1, byte arg2, boolean arg3) {
        try {
            field9477++;
            Calendar var5;
            if (arg3) {
                class254.method2152(arg0, 114);
                var5 = class555.field8262;
            } else {
                class693.method5066(arg0, true);
                var5 = class555.field8270;
            }
            int var6 = var5.get(5);
            int var7 = var5.get(2) + 1;
            int var8 = var5.get(1);
            int var9 = var5.get(11);
            if (arg2 < 113) {
                field9473 = null;
            }
            int var10 = var5.get(12);
            return Integer.toString(var6 / 10) + var6 % 10 + "/" + var7 / 10 + var7 % 10 + "/" + var8 % 100 / 10 + var8 % 10 + " " + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10;
        } catch (RuntimeException var12) {
            throw class759.method5498(var12, field9487[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(I)V")
    public static void method4815(int arg0) {
        try {
            field9486 = null;
            if (arg0 != 828603369) {
                method4815(-36);
            }
            field9473 = null;
            field9474 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field9487[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)V")
    public final void method4816(byte arg0) {
        try {
            field9476++;
            int var2 = -105 / ((-arg0 - 36) / 54);
            class178 var3 = this.field9481;
            synchronized (this.field9481) {
                this.field9481.method1569(10574);
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field9487[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(ILjava/util/Random;B)I")
    public static final int method4817(int arg0, Random arg1, byte arg2) {
        try {
            field9484++;
            if (arg0 <= 0) {
                throw new IllegalArgumentException();
            } else if (arg2 >= -17) {
                return -81;
            } else if (class40.method269(arg0, 94)) {
                return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg0 >> 32);
            } else {
                int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg0));
                int var4;
                do {
                    var4 = arg1.nextInt();
                } while (var4 >= var3);
                return class192.method1647(arg0, var4, (byte) 126);
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field9487[16] + arg0 + ',' + (arg1 == null ? field9487[6] : field9487[5]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V")
    public final void method4818(int arg0) {
        try {
            field9478++;
            if (arg0 != 16115) {
                this.field9480 = null;
            }
            class178 var2 = this.field9481;
            synchronized (this.field9481) {
                this.field9481.method1559(0);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field9487[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Lto;ILla;Lla;)V")
    public class656(class8 arg0, int arg1, class476 arg2, class476 arg3) {
        try {
            this.field9480 = arg2;
            this.field9475 = arg3;
            this.field9480.method3646(3, (byte) -65);
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field9487[13] + (arg0 == null ? field9487[6] : field9487[5]) + ',' + arg1 + ',' + (arg2 == null ? field9487[6] : field9487[5]) + ',' + (arg3 == null ? field9487[6] : field9487[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!sn", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4819(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!sn", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4820(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 99;
                    break;
                case 1:
                    var10005 = 118;
                    break;
                case 2:
                    var10005 = 95;
                    break;
                case 3:
                    var10005 = 93;
                    break;
                default:
                    var10005 = 75;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
