import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class68 {

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
    public static int field827 = -1;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "I")
    public static int field829 = 0;

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
    public static int field831 = -1;

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "Lrr;")
    public static class408 field828 = new class408(1);

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
    public static void method379(int arg0) {
        if (arg0 != -1875) {
            method380((byte) 107, -40);
        }
        field828 = null;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(BI)Z")
    public static final boolean method380(byte arg0, int arg1) {
        field833++;
        if (arg1 >= -78) {
            field831 = -13;
        }
        int var2 = arg0 & 0xFF;
        if (var2 == 0) {
            return false;
        } else {
            return var2 < 128 || var2 >= 160 || class527.field7294[var2 - 128] != '\u0000';
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)I")
    public static final int method381(int arg0, int arg1) {
        if (arg0 != -1) {
            method381(99, 66);
        }
        field832++;
        return arg1 == 16711935 ? -1 : class353.method2085(arg0 ^ -244, arg1);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IILr;I)V")
    public static final void method382(int arg0, int arg1, class562 arg2, int arg3) {
        field830++;
        if (arg0 < 0 || arg3 < 0 || class322.field4315 == 0 || class649.field8972 == 0) {
            return;
        }
        arg2.method1088(class455.field5996, class491.field6791, class322.field4315, class649.field8972);
        if (arg1 != -2181) {
            method381(24, -46);
        }
        arg2.method1042(class177.field2499, class595.field8211, class322.field4315, class649.field8972);
        class487 var4 = arg2.method1075();
        var4.method351(class300.field3973, class538.field7390, class603.field8433, class404.field5345, class414.field5433, class576.field7857);
        arg2.method1123(var4);
        if (class454.field5981 != null) {
            int var5 = -1;
            int var6 = -1;
            int var7 = arg2.method1054();
            int var8 = (arg0 - class455.field5996) * var7 / class322.field4315;
            int var9 = (arg3 - class491.field6791) * var7 / class649.field8972;
            int var10 = arg2.method1108();
            int var11 = (arg0 - class455.field5996) * var10 / class322.field4315;
            int var12 = (arg3 - class491.field6791) * var10 / class649.field8972;
            int[] var13 = new int[] { var8, var9, var7 };
            var4.method365(var13);
            int[] var14 = new int[] { var11, var12, var10 };
            var4.method365(var14);
            float var15 = 0.0F;
            int var16 = var14[0] - var13[0];
            int var17 = var14[1] - var13[1];
            int var18 = var14[2] - var13[2];
            while (var15 < 1.0F) {
                int var19 = (int) ((float) var16 * var15 + (float) var13[0]);
                int var20 = var19 >> 9;
                int var21 = (int) ((float) var18 * var15 + (float) var13[2]);
                int var22 = var21 >> 9;
                if (var20 > 0 && var22 > 0 && class703.field9886 > var20 && var22 < class431.field5789) {
                    int var23 = class408.field5369.field385;
                    if (var23 < 3 && (class31.field440[1][var20][var22] & 0x2) != 0) {
                        var23++;
                    }
                    if ((float) class454.field5981[var23].method1609(var19, var21, 117) < (float) var17 * var15 + (float) var13[1]) {
                        var5 = (class408.field5369.method1435((byte) 114) - 1 << 8) + var19 >> 9;
                        var6 = (class408.field5369.method1435((byte) 116) - 1 << 8) + var21 >> 9;
                        break;
                    }
                }
                var15 = (float) ((double) var15 + 0.01D);
            }
            if (var5 != -1 && var6 != -1) {
                if (class38.field507 && (class544.field7442 & 0x40) != 0) {
                    class423 var24 = class546.method3064(0, class351.field4679, class369.field4847);
                    if (var24 == null) {
                        class364.method2122((byte) 3);
                    } else {
                        class592.method3274(false, true, -1, 20, class418.field5499, false, 0L, class101.field1208, var6, var5, " ->");
                    }
                } else {
                    if (class678.field9636 == class508.field7015) {
                        class592.method3274(false, true, -1, 25, class371.field4906.method2141(class422.field5539, true), false, 0L, -1, var6, var5, "");
                    }
                    class229.field2965++;
                    class592.method3274(false, true, -1, 12, class466.field6119, false, 0L, class50.field581, var6, var5, "");
                }
            }
        }
        class204 var25 = class694.field9791;
        for (class329 var26 = (class329) var25.method1298((byte) 40); var26 != null; var26 = (class329) var25.method1305((byte) -115)) {
            if ((class162.field2327 || class408.field5369.field385 == var26.field4417.field385) && var26.method1915(arg2, arg3, false, arg0)) {
                boolean var27 = false;
                boolean var28 = false;
                int var29;
                int var30;
                if (var26.field4417 instanceof class29) {
                    var29 = ((class29) var26.field4417).field419;
                    var30 = ((class29) var26.field4417).field423;
                } else {
                    var30 = var26.field4417.field398 >> 9;
                    var29 = var26.field4417.field397 >> 9;
                }
                if (var26.field4417 instanceof class573) {
                    class573 var31 = (class573) var26.field4417;
                    int var32 = var31.method1435((byte) 77);
                    if ((var32 & 0x1) == 0 && (var31.field398 & 0x1FF) == 0 && (var31.field397 & 0x1FF) == 0 || (var32 & 0x1) == 1 && (var31.field398 & 0x1FF) == 256 && (var31.field397 & 0x1FF) == 256) {
                        int var33 = var31.field398 - (var31.method1435((byte) 68) - 1 << 8);
                        int var34 = var31.field397 - (var31.method1435((byte) 98) - 1 << 8);
                        for (int var35 = 0; var35 < class289.field3820; var35++) {
                            class407 var42 = (class407) class296.field3921.method3057(1, (long) class389.field5220[var35]);
                            if (var42 != null) {
                                class351 var43 = var42.field5354;
                                if (class327.field4404 != var43.field3029 && var43.field3042) {
                                    int var44 = var43.field398 - (var43.field4671.field5105 - 1 << 8);
                                    int var45 = var43.field397 - (var43.field4671.field5105 - 1 << 8);
                                    if (var44 >= var33 && var43.field4671.field5105 <= var31.method1435((byte) 83) - (var44 - var33 >> 9) && var34 <= var45 && var43.field4671.field5105 <= (var31.method1435((byte) 106) - (var45 - var34 >> 9))) {
                                        class519.method2948(class408.field5369.field385 != var26.field4417.field385, 20855, var43);
                                        var43.field3029 = class327.field4404;
                                    }
                                }
                            }
                        }
                        int var36 = class426.field5750;
                        int[] var37 = class586.field8104;
                        for (int var38 = 0; var38 < var36; var38++) {
                            class573 var39 = class513.field7145[var37[var38]];
                            if (var39 != null && class327.field4404 != var39.field3029 && var31 != var39 && var39.field3042) {
                                int var40 = var39.field398 - (var39.method1435((byte) 95) - 1 << 8);
                                int var41 = var39.field397 - (var39.method1435((byte) 79) - 1 << 8);
                                if (var40 >= var33 && var39.method1435((byte) 76) <= (var31.method1435((byte) 70) - (var40 - var33 >> 9)) && var41 >= var34 && var39.method1435((byte) 68) <= var31.method1435((byte) 104) - (var41 - var34 >> 9)) {
                                    class32.method194(class408.field5369.field385 != var26.field4417.field385, var39, -17386);
                                    var39.field3029 = class327.field4404;
                                }
                            }
                        }
                    }
                    if (class327.field4404 == var31.field3029) {
                        continue;
                    }
                    class32.method194(class408.field5369.field385 != var26.field4417.field385, var31, -17386);
                    var31.field3029 = class327.field4404;
                }
                if (var26.field4417 instanceof class351) {
                    class351 var46 = (class351) var26.field4417;
                    if (var46.field4671 != null) {
                        if ((var46.field4671.field5105 & 0x1) == 0 && (var46.field398 & 0x1FF) == 0 && (var46.field397 & 0x1FF) == 0 || (var46.field4671.field5105 & 0x1) == 1 && (var46.field398 & 0x1FF) == 256 && (var46.field397 & 0x1FF) == 256) {
                            int var47 = var46.field398 - (var46.field4671.field5105 - 1 << 8);
                            int var48 = var46.field397 - (var46.field4671.field5105 - 1 << 8);
                            for (int var49 = 0; var49 < class289.field3820; var49++) {
                                class407 var56 = (class407) class296.field3921.method3057(arg1 ^ 0xFFFFF77A, (long) class389.field5220[var49]);
                                if (var56 != null) {
                                    class351 var57 = var56.field5354;
                                    if (class327.field4404 != var57.field3029 && var46 != var57 && var57.field3042) {
                                        int var58 = var57.field398 - (var57.field4671.field5105 - 1 << 8);
                                        int var59 = var57.field397 - (var57.field4671.field5105 - 1 << 8);
                                        if (var58 >= var47 && var46.field4671.field5105 - (var58 - var47 >> 9) >= var57.field4671.field5105 && var48 <= var59 && var57.field4671.field5105 <= (var46.field4671.field5105 - (var59 - var48 >> 9))) {
                                            class519.method2948(class408.field5369.field385 != var26.field4417.field385, arg1 ^ 0xFFFFA60C, var57);
                                            var57.field3029 = class327.field4404;
                                        }
                                    }
                                }
                            }
                            int var50 = class426.field5750;
                            int[] var51 = class586.field8104;
                            for (int var52 = 0; var52 < var50; var52++) {
                                class573 var53 = class513.field7145[var51[var52]];
                                if (var53 != null && class327.field4404 != var53.field3029 && var53.field3042) {
                                    int var54 = var53.field398 - (var53.method1435((byte) 91) - 1 << 8);
                                    int var55 = var53.field397 - (var53.method1435((byte) 70) - 1 << 8);
                                    if (var54 >= var47 && var53.method1435((byte) 72) <= var46.field4671.field5105 - (var54 - var47 >> 9) && var48 <= var55 && var53.method1435((byte) 125) <= (var46.field4671.field5105 - (var55 - var48 >> 9))) {
                                        class32.method194(class408.field5369.field385 != var26.field4417.field385, var53, -17386);
                                        var53.field3029 = class327.field4404;
                                    }
                                }
                            }
                        }
                        if (class327.field4404 == var46.field3029) {
                            continue;
                        }
                        class519.method2948(class408.field5369.field385 != var26.field4417.field385, 20855, var46);
                        var46.field3029 = class327.field4404;
                    }
                }
                if (var26.field4417 instanceof class488) {
                    int var60 = class125.field1745 + var30;
                    int var61 = class4.field23 + var29;
                    class543 var62 = (class543) class290.field3835.method3057(1, (long) (var26.field4417.field385 << 28 | var61 << 14 | var60));
                    if (var62 != null) {
                        for (class685 var63 = (class685) var62.field7435.method2500((byte) -41); var63 != null; var63 = (class685) var62.field7435.method2511(true)) {
                            class584 var64 = class87.field1058.method1394(-105, var63.field9690);
                            if (class38.field507 && class408.field5369.field385 == var26.field4417.field385) {
                                class119 var65 = class396.field5273 == -1 ? null : class15.field198.method3462((byte) -79, class396.field5273);
                                if ((class544.field7442 & 0x1) != 0 && (var65 == null || var64.method3223(class396.field5273, var65.field1521, (byte) 101) != var65.field1521)) {
                                    class370.field4854++;
                                    class592.method3274(false, true, -1, 59, class418.field5499, false, (long) var63.field9690, class101.field1208, var29, var30, class209.field2788 + " -> <col=ff9040>" + var64.field8032);
                                }
                            }
                            if (class408.field5369.field385 == var26.field4417.field385) {
                                String[] var66 = var64.field8007;
                                for (int var67 = 4; var67 >= 0; var67--) {
                                    if (var66 != null && var66[var67] != null) {
                                        byte var68 = 0;
                                        int var69 = class440.field5831;
                                        if (var67 == 0) {
                                            var68 = 11;
                                        }
                                        if (var67 == 1) {
                                            var68 = 8;
                                        }
                                        if (var67 == 2) {
                                            var68 = 46;
                                        }
                                        if (var67 == 3) {
                                            var68 = 6;
                                        }
                                        if (var67 == 4) {
                                            var68 = 23;
                                        }
                                        if (var64.field8042 == var67) {
                                            var69 = var64.field8048;
                                        }
                                        if (var64.field8077 == var67) {
                                            var69 = var64.field8060;
                                        }
                                        class426.field5749++;
                                        class592.method3274(false, true, -1, var68, var66[var67], false, (long) var63.field9690, var69, var29, var30, "<col=ff9040>" + var64.field8032);
                                    }
                                }
                            }
                            class625.field8664++;
                            class592.method3274(false, true, -1, 1006, class371.field4901.method2141(class422.field5539, true), class408.field5369.field385 != var26.field4417.field385, (long) var63.field9690, class149.field2038, var29, var30, "<col=ff9040>" + var64.field8032);
                        }
                    }
                }
                if (var26.field4417 instanceof class599) {
                    class599 var70 = (class599) var26.field4417;
                    class600 var71 = class118.field1510.method3921(var70.method710((byte) 78), -115);
                    if (var71.field8257 != null) {
                        var71 = var71.method3324((byte) 127, class564.field7696);
                    }
                    if (var71 != null) {
                        if (class38.field507 && class408.field5369.field385 == var26.field4417.field385) {
                            class119 var72 = class396.field5273 == -1 ? null : class15.field198.method3462((byte) -79, class396.field5273);
                            if ((class544.field7442 & 0x4) != 0 && (var72 == null || var71.method3335(arg1 + 2124, var72.field1521, class396.field5273) != var72.field1521)) {
                                class195.field2675++;
                                class592.method3274(false, true, -1, 18, class418.field5499, false, class24.method139(var70, (byte) 110, var30, var29), class101.field1208, var29, var30, class209.field2788 + " -> <col=00ffff>" + var71.field8259);
                            }
                        }
                        if (class408.field5369.field385 == var26.field4417.field385) {
                            String[] var73 = var71.field8276;
                            if (var73 != null) {
                                for (int var74 = 4; var74 >= 0; var74--) {
                                    if (var73[var74] != null) {
                                        short var75 = 0;
                                        if (var74 == 0) {
                                            var75 = 4;
                                        }
                                        int var76 = class440.field5831;
                                        if (var74 == 1) {
                                            var75 = 21;
                                        }
                                        if (var74 == 2) {
                                            var75 = 15;
                                        }
                                        if (var74 == 3) {
                                            var75 = 45;
                                        }
                                        if (var71.field8261 == var74) {
                                            var76 = var71.field8269;
                                        }
                                        if (var74 == 4) {
                                            var75 = 1003;
                                        }
                                        if (var71.field8325 == var74) {
                                            var76 = var71.field8340;
                                        }
                                        class592.method3274(false, true, -1, var75, var73[var74], false, class24.method139(var70, (byte) 92, var30, var29), var76, var29, var30, "<col=00ffff>" + var71.field8259);
                                        class508.field7010++;
                                    }
                                }
                            }
                        }
                        class650.field8974++;
                        class592.method3274(false, true, -1, 1011, class371.field4901.method2141(class422.field5539, true), class408.field5369.field385 != var26.field4417.field385, (long) var71.field8345, class149.field2038, var29, var30, "<col=00ffff>" + var71.field8259);
                    }
                }
            }
        }
    }
}
