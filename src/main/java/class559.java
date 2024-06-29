import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mw")
public class class559 {

    @OriginalMember(owner = "client!mw", name = "f", descriptor = "[I")
    public static int[] field7614 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "I")
    public static int field7609;

    @OriginalMember(owner = "client!mw", name = "b", descriptor = "I")
    public static int field7610;

    @OriginalMember(owner = "client!mw", name = "c", descriptor = "I")
    public static int field7611;

    @OriginalMember(owner = "client!mw", name = "d", descriptor = "I")
    public static int field7612;

    @OriginalMember(owner = "client!mw", name = "e", descriptor = "I")
    public static int field7613;

    @OriginalMember(owner = "client!mw", name = "g", descriptor = "Lld;")
    public static class383 field7615;

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(I)V", line = 4)
    public static void method3123(int arg0) {
        if (arg0 == -24836) {
            field7615 = null;
            field7614 = null;
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 19)
    public static final boolean method3124(int arg0, String arg1) {
        field7612++;
        if (arg1 == null) {
            return false;
        } else if (arg0 > -68) {
            return true;
        } else {
            for (int var2 = 0; var2 < class641.field8818; var2++) {
                if (arg1.equalsIgnoreCase(class207.field2698[var2])) {
                    return true;
                }
                if (arg1.equalsIgnoreCase(class623.field8473[var2])) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!mw", name = "b", descriptor = "(I)V", line = 55)
    public static final void method3125(int arg0) {
        if (arg0 == 888113385) {
            field7610++;
            class179.field2242 = 0;
            class37.field371.method365(-1);
            class483.field6542 = false;
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(Lhc;)V", line = 71)
    public static final void method3126(class293 arg0) {
        for (int var1 = arg0.field3921; var1 <= arg0.field3928; var1++) {
            for (int var2 = arg0.field3920; var2 <= arg0.field3923; var2++) {
                class651 var3 = class145.field1841[arg0.field3925][var1][var2];
                if (var3 != null) {
                    class82 var4 = var3.field9228;
                    class82 var5 = null;
                    while (var4 != null) {
                        if (var4.field1027 == arg0) {
                            if (var5 == null) {
                                var3.field9228 = var4.field1024;
                            } else {
                                var5.field1024 = var4.field1024;
                            }
                            var4.method461(-19611);
                            break;
                        }
                        var5 = var4;
                        var4 = var4.field1024;
                    }
                    var3.field9237 = 0;
                    for (class82 var6 = var3.field9228; var6 != null; var6 = var6.field1024) {
                        var3.field9237 = (byte) (var3.field9237 | var6.field1025);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(Loa;III)V", line = 125)
    public static final void method3127(class689 arg0, int arg1, int arg2, int arg3) {
        field7611++;
        if (arg3 < 0 || arg1 < 0 || class612.field8350 == 0 || class623.field8476 == 0) {
            return;
        }
        arg0.method1875(class34.field338, class244.field3289, class612.field8350, class623.field8476);
        arg0.method1908(class77.field970, class330.field4834, class612.field8350, class623.field8476);
        class111 var4 = arg0.method1922();
        var4.method602(class352.field5143, class563.field7704, class380.field5456, class322.field4719, class615.field8390, class575.field7946);
        arg0.method1887(var4);
        if (class249.field3345 != null) {
            int var5 = -1;
            int var6 = -1;
            int var7 = arg0.method1990();
            int var8 = (arg3 - class34.field338) * var7 / class612.field8350;
            int var9 = (arg1 - class244.field3289) * var7 / class623.field8476;
            int var10 = arg0.method1924();
            int var11 = (arg3 - class34.field338) * var10 / class612.field8350;
            int var12 = (arg1 - class244.field3289) * var10 / class623.field8476;
            int[] var13 = new int[] { var8, var9, var7 };
            var4.method599(var13);
            int[] var14 = new int[] { var11, var12, var10 };
            var4.method599(var14);
            float var15 = 0.0F;
            int var16 = var14[0] - var13[0];
            int var17 = var14[1] - var13[1];
            int var18 = var14[2] - var13[2];
            while (var15 < 1.0F) {
                int var19 = (int) ((float) var16 * var15 + (float) var13[0]);
                int var20 = var19 >> 9;
                int var21 = (int) ((float) var18 * var15 + (float) var13[2]);
                int var22 = var21 >> 9;
                if (var20 > 0 && var22 > 0 && class588.field8082 > var20 && class12.field113 > var22) {
                    int var23 = class596.field8164.field3925;
                    if (var23 < 3 && (class645.field9140[1][var20][var22] & 0x2) != 0) {
                        var23++;
                    }
                    if ((float) class249.field3345[var23].method159(var19, var21) < (float) var17 * var15 + (float) var13[1]) {
                        var5 = (class596.field8164.method241(-25747) - 1 << 8) + var19 >> 9;
                        var6 = var21 + (class596.field8164.method241(arg2 ^ 0x1E2D) - 1 << 8) >> 9;
                        break;
                    }
                }
                var15 = (float) ((double) var15 + 0.01D);
            }
            if (var5 != -1 && var6 != -1) {
                if (class613.field8378 && (class525.field7268 & 0x40) != 0) {
                    class188 var24 = class630.method3443(class68.field898, -1, class59.field828);
                    if (var24 == null) {
                        class497.method2800((byte) -109);
                    } else {
                        class606.method3350(var6, 0L, false, var5, class306.field4114, class413.field5798, 46, " ->", -1, true, false);
                    }
                } else {
                    if (class411.field5764 == class33.field322) {
                        class606.method3350(var6, 0L, false, var5, class243.field3238.method1491(class350.field5121, (byte) 127), -1, 19, "", -1, true, false);
                    }
                    class227.field2957++;
                    class606.method3350(var6, 0L, false, var5, class477.field6442, class188.field2422, 58, "", -1, true, false);
                }
            }
        }
        class361 var25 = class34.field332;
        class95 var26 = (class95) var25.method2224((byte) -112);
        if (arg2 != -31424) {
            field7614 = null;
        }
        while (var26 != null) {
            if ((class517.field7122 || class596.field8164.field3925 == var26.field1173) && var26.method526(arg0, arg1, arg3, -125)) {
                label467: {
                    if (var26.field1176 instanceof class519) {
                        class519 var27 = (class519) var26.field1176;
                        int var28 = var27.method241(-25747);
                        if ((var28 & 0x1) == 0 && (var27.field3929 & 0x1FF) == 0 && (var27.field3917 & 0x1FF) == 0 || (var28 & 0x1) == 1 && (var27.field3929 & 0x1FF) == 256 && (var27.field3917 & 0x1FF) == 256) {
                            int var29 = var27.field3929 - (var27.method241(-25747) - 1 << 8);
                            int var30 = var27.field3917 - (var27.method241(-25747) - 1 << 8);
                            for (int var31 = 0; var31 < class306.field4106; var31++) {
                                class637 var38 = (class637) class77.field955.method2506(arg2 + 31438, (long) class690.field9742[var31]);
                                if (var38 != null) {
                                    class676 var39 = var38.field8702;
                                    if (class430.field5984 != var39.field458 && var39.field487) {
                                        int var40 = var39.field3929 - (var39.field9594.field2591 - 1 << 8);
                                        int var41 = var39.field3917 - (var39.field9594.field2591 - 1 << 8);
                                        if (var29 <= var40 && var39.field9594.field2591 <= (var27.method241(-25747) - (var40 - var29 >> 9)) && var41 >= var30 && var39.field9594.field2591 <= (var27.method241(-25747) - (var41 - var30 >> 9))) {
                                            class456.method2580(-122, var39, class596.field8164.field3925 != var26.field1173);
                                            var39.field458 = class430.field5984;
                                        }
                                    }
                                }
                            }
                            int var32 = class654.field9256;
                            int[] var33 = class123.field1595;
                            for (int var34 = 0; var34 < var32; var34++) {
                                class519 var35 = class292.field3912[var33[var34]];
                                if (var35 != null && class430.field5984 != var35.field458 && var27 != var35 && var35.field487) {
                                    int var36 = var35.field3929 - (var35.method241(-25747) - 1 << 8);
                                    int var37 = var35.field3917 - (var35.method241(-25747) - 1 << 8);
                                    if (var36 >= var29 && var35.method241(-25747) <= (var27.method241(arg2 + 5677) - (var36 - var29 >> 9)) && var37 >= var30 && var35.method241(arg2 + 5677) <= (var27.method241(-25747) - (var37 - var30 >> 9))) {
                                        class520.method2974(class596.field8164.field3925 != var26.field1173, var35, 2000);
                                        var35.field458 = class430.field5984;
                                    }
                                }
                            }
                        }
                        if (class430.field5984 == var27.field458) {
                            break label467;
                        }
                        class520.method2974(class596.field8164.field3925 != var26.field1173, var27, 2000);
                        var27.field458 = class430.field5984;
                    }
                    if (var26.field1176 instanceof class676) {
                        class676 var42 = (class676) var26.field1176;
                        if (var42.field9594 != null) {
                            if ((var42.field9594.field2591 & 0x1) == 0 && (var42.field3929 & 0x1FF) == 0 && (var42.field3917 & 0x1FF) == 0 || (var42.field9594.field2591 & 0x1) == 1 && (var42.field3929 & 0x1FF) == 256 && (var42.field3917 & 0x1FF) == 256) {
                                int var43 = var42.field3929 - (var42.field9594.field2591 - 1 << 8);
                                int var44 = var42.field3917 - (var42.field9594.field2591 - 1 << 8);
                                for (int var45 = 0; var45 < class306.field4106; var45++) {
                                    class637 var52 = (class637) class77.field955.method2506(100, (long) class690.field9742[var45]);
                                    if (var52 != null) {
                                        class676 var53 = var52.field8702;
                                        if (class430.field5984 != var53.field458 && var42 != var53 && var53.field487) {
                                            int var54 = var53.field3929 - (var53.field9594.field2591 - 1 << 8);
                                            int var55 = var53.field3917 - (var53.field9594.field2591 - 1 << 8);
                                            if (var54 >= var43 && var42.field9594.field2591 - (var54 - var43 >> 9) >= var53.field9594.field2591 && var44 <= var55 && (var42.field9594.field2591 - (var55 - var44 >> 9)) >= var53.field9594.field2591) {
                                                class456.method2580(-28, var53, class596.field8164.field3925 != var26.field1173);
                                                var53.field458 = class430.field5984;
                                            }
                                        }
                                    }
                                }
                                int var46 = class654.field9256;
                                int[] var47 = class123.field1595;
                                for (int var48 = 0; var48 < var46; var48++) {
                                    class519 var49 = class292.field3912[var47[var48]];
                                    if (var49 != null && class430.field5984 != var49.field458 && var49.field487) {
                                        int var50 = var49.field3929 - (var49.method241(-25747) - 1 << 8);
                                        int var51 = var49.field3917 - (var49.method241(-25747) - 1 << 8);
                                        if (var43 <= var50 && var49.method241(arg2 + 5677) <= (var42.field9594.field2591 - (var50 - var43 >> 9)) && var44 <= var51 && var49.method241(-25747) <= var42.field9594.field2591 - (var51 - var44 >> 9)) {
                                            class520.method2974(class596.field8164.field3925 != var26.field1173, var49, 2000);
                                            var49.field458 = class430.field5984;
                                        }
                                    }
                                }
                            }
                            if (class430.field5984 == var42.field458) {
                                break label467;
                            }
                            class456.method2580(-125, var42, class596.field8164.field3925 != var26.field1173);
                            var42.field458 = class430.field5984;
                        }
                    }
                    if (var26.field1176 instanceof class419) {
                        int var56 = class253.field3490 + var26.field1170;
                        int var57 = var26.field1172 + class186.field2280;
                        class397 var58 = (class397) class645.field9141.method2506(117, (long) (var26.field1173 << 28 | var57 << 14 | var56));
                        if (var58 != null) {
                            for (class172 var59 = (class172) var58.field5665.method377((byte) 126); var59 != null; var59 = (class172) var58.field5665.method371(-1)) {
                                class660 var60 = class237.field3088.method1349(-1, var59.field2150);
                                if (class613.field8378 && class596.field8164.field3925 == var26.field1173) {
                                    class579 var61 = class525.field7257 == -1 ? null : class191.field2486.method1256(class525.field7257, -3934);
                                    if ((class525.field7268 & 0x1) != 0 && (var61 == null || var60.method3658(class525.field7257, arg2 + 31312, var61.field7999) != var61.field7999)) {
                                        class597.field8171++;
                                        class606.method3350(var26.field1172, (long) var59.field2150, false, var26.field1170, class306.field4114, class413.field5798, 47, class665.field9444 + " -> <col=ff9040>" + var60.field9309, -1, true, false);
                                    }
                                }
                                if (class596.field8164.field3925 == var26.field1173) {
                                    String[] var62 = var60.field9360;
                                    for (int var63 = 4; var63 >= 0; var63--) {
                                        if (var62 != null && var62[var63] != null) {
                                            byte var64 = 0;
                                            if (var63 == 0) {
                                                var64 = 2;
                                            }
                                            int var65 = class30.field300;
                                            if (var63 == 1) {
                                                var64 = 59;
                                            }
                                            if (var63 == 2) {
                                                var64 = 3;
                                            }
                                            if (var63 == 3) {
                                                var64 = 23;
                                            }
                                            if (var60.field9330 == var63) {
                                                var65 = var60.field9301;
                                            }
                                            if (var63 == 4) {
                                                var64 = 6;
                                            }
                                            if (var60.field9317 == var63) {
                                                var65 = var60.field9351;
                                            }
                                            class118.field1519++;
                                            class606.method3350(var26.field1172, (long) var59.field2150, false, var26.field1170, var62[var63], var65, var64, "<col=ff9040>" + var60.field9309, -1, true, false);
                                        }
                                    }
                                }
                                class606.method3350(var26.field1172, (long) var59.field2150, false, var26.field1170, class243.field3233.method1491(class350.field5121, (byte) 127), class192.field2490, 1010, "<col=ff9040>" + var60.field9309, -1, true, class596.field8164.field3925 != var26.field1173);
                                class287.field3876++;
                            }
                        }
                    }
                    if (var26.field1176 instanceof class289) {
                        class289 var66 = (class289) var26.field1176;
                        class252 var67 = class578.field7980.method1746(var66.method130(-5582), (byte) 85);
                        if (var67.field3391 != null) {
                            var67 = var67.method1568(-1, class327.field4771);
                        }
                        if (var67 != null) {
                            if (class613.field8378 && class596.field8164.field3925 == var26.field1173) {
                                class579 var68 = class525.field7257 == -1 ? null : class191.field2486.method1256(class525.field7257, -3934);
                                if ((class525.field7268 & 0x4) != 0 && (var68 == null || var67.method1567(false, var68.field7999, class525.field7257) != var68.field7999)) {
                                    class32.field306++;
                                    class606.method3350(var26.field1172, class525.method2995(34066, var26.field1170, var66, var26.field1172), false, var26.field1170, class306.field4114, class413.field5798, 16, class665.field9444 + " -> <col=00ffff>" + var67.field3461, -1, true, false);
                                }
                            }
                            if (class596.field8164.field3925 == var26.field1173) {
                                String[] var69 = var67.field3421;
                                if (var69 != null) {
                                    for (int var70 = 4; var70 >= 0; var70--) {
                                        if (var69[var70] != null) {
                                            short var71 = 0;
                                            if (var70 == 0) {
                                                var71 = 17;
                                            }
                                            int var72 = class30.field300;
                                            if (var70 == 1) {
                                                var71 = 45;
                                            }
                                            if (var70 == 2) {
                                                var71 = 44;
                                            }
                                            if (var70 == 3) {
                                                var71 = 8;
                                            }
                                            if (var70 == 4) {
                                                var71 = 1012;
                                            }
                                            if (var67.field3417 == var70) {
                                                var72 = var67.field3395;
                                            }
                                            if (var67.field3404 == var70) {
                                                var72 = var67.field3473;
                                            }
                                            class23.field222++;
                                            class606.method3350(var26.field1172, class525.method2995(34066, var26.field1170, var66, var26.field1172), false, var26.field1170, var69[var70], var72, var71, "<col=00ffff>" + var67.field3461, -1, true, false);
                                        }
                                    }
                                }
                            }
                            class485.field6563++;
                            class606.method3350(var26.field1172, (long) var67.field3456, false, var26.field1170, class243.field3233.method1491(class350.field5121, (byte) 125), class192.field2490, 1006, "<col=00ffff>" + var67.field3461, -1, true, class596.field8164.field3925 != var26.field1173);
                        }
                    }
                }
            }
            var26 = (class95) var25.method2222((byte) -125);
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(B)I", line = 596)
    public static final int method3128(byte arg0) {
        field7609++;
        int var1 = -17 % ((-arg0 - 47) / 46);
        if (class377.field5414 == null) {
            if (!class483.field6542 && class179.field2242 > 0) {
                if (class483.field6541 && class348.field5096.method32(81, -104) && class179.field2242 > 2) {
                    return ((class69) class37.field371.field825.field275.field275).field901;
                }
                return ((class69) class37.field371.field825.field275).field901;
            }
            int var2 = class592.field8107.method268((byte) -119);
            int var3 = class592.field8107.method269((byte) -25);
            int var4 = class544.field7454;
            int var5 = class326.field4744;
            int var6 = class353.field5151;
            if (var4 < var2 && (var4 + var6) > var2) {
                int var7 = -1;
                for (int var8 = 0; var8 < class179.field2242; var8++) {
                    if (class565.field7842) {
                        int var13 = (class179.field2242 - var8 - 1) * 16 + var5 + 33;
                        if ((var13 - 13) < var3 && var3 <= (var13 + 3)) {
                            var7 = var8;
                        }
                    } else {
                        int var12 = var5 + ((class179.field2242 + -1 + -var8) * 16) + 31;
                        if (var3 > (var12 - 13) && var3 <= var12 + 3) {
                            var7 = var8;
                        }
                    }
                }
                if (var7 != -1) {
                    int var9 = 0;
                    class70 var10 = new class70(class37.field371);
                    for (class69 var11 = (class69) var10.method415((byte) -30); var11 != null; var11 = (class69) var10.method412(107)) {
                        if ((var9++) == var7) {
                            return var11.field901;
                        }
                    }
                }
            }
        }
        return -1;
    }
}
