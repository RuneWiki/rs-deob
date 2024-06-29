import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class358 {

    @OriginalMember(owner = "client!h", name = "a", descriptor = "I")
    public static int field5693;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "I")
    public static int field5695;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "I")
    public static int field5696;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "I")
    public static int field5697;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "[I")
    public static int[] field5694;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V", line = 9)
    public static void method2517(int arg0) {
        field5694 = null;
        if (arg0 > -48) {
            method2517(-80);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ILnc;III)V", line = 25)
    public static final void method2518(int arg0, class171 arg1, int arg2, int arg3, int arg4) {
        field5697++;
        if (class173.field2746 == arg1 || arg0 != -50 || class66.field1006 >= 400) {
            return;
        }
        String var5;
        if (arg1.field2694 == 0) {
            boolean var6 = true;
            if (class173.field2746.field2698 != -1 && arg1.field2698 != -1) {
                int var7 = arg1.field2722 < class173.field2746.field2722 ? class173.field2746.field2722 : arg1.field2722;
                int var8 = arg1.field2698 > class173.field2746.field2698 ? class173.field2746.field2698 : arg1.field2698;
                int var9 = var7 * 10 / 100 + var8 + 5;
                int var10 = class173.field2746.field2722 - arg1.field2722;
                if (var10 < 0) {
                    var10 = -var10;
                }
                if (var10 > var9) {
                    var6 = false;
                }
            }
            String var11 = class165.field2629 == 1 ? class280.field4322 : class311.field4840;
            if (arg1.field2714 > arg1.field2722) {
                var5 = arg1.method1348(true, arg0 + 109) + (var6 ? class253.method1882(class173.field2746.field2722, arg1.field2722, false) : "<col=ffffff>") + " (" + var11 + arg1.field2722 + "+" + (arg1.field2714 - arg1.field2722) + ")";
            } else {
                var5 = arg1.method1348(true, 83) + (var6 ? class253.method1882(class173.field2746.field2722, arg1.field2722, false) : "<col=ffffff>") + " (" + var11 + arg1.field2722 + ")";
            }
        } else {
            var5 = arg1.method1348(true, arg0 ^ 0xFFFFFF9A) + " (" + class173.field2754 + arg1.field2694 + ")";
        }
        if (class78.field1136 == 1) {
            class268.method1963((short) 22, class352.field5626 + " -> <col=ffffff>" + var5, arg2, class221.field3440, class143.field2350, (long) arg4, -25900, arg3);
            class195.field3068++;
        } else if (!class210.field3237) {
            for (int var12 = 7; var12 >= 0; var12--) {
                if (class67.field1029[var12] != null) {
                    class29.field470++;
                    boolean var13 = false;
                    short var14 = 0;
                    if (class165.field2629 == 0 && class67.field1029[var12].equalsIgnoreCase(class203.field3147)) {
                        if (arg1.field2722 > class173.field2746.field2722) {
                            var14 = 2000;
                        }
                        if (class173.field2746.field2696 != 0 && arg1.field2696 != 0) {
                            if (class173.field2746.field2696 == arg1.field2696) {
                                var14 = 2000;
                            } else {
                                var14 = 0;
                            }
                        }
                    } else if (class25.field431[var12]) {
                        var14 = 2000;
                    }
                    short var15 = class217.field3389[var12];
                    short var16 = (short) (var14 + var15);
                    class268.method1963(var16, "<col=ffffff>" + var5, arg2, class23.field364[var12], class67.field1029[var12], (long) arg4, -25900, arg3);
                }
            }
        } else if ((class209.field3214 & 0x8) != 0) {
            class268.method1963((short) 14, class83.field1203 + " -> <col=ffffff>" + var5, arg2, class281.field4355, class202.field3130, (long) arg4, -25900, arg3);
            class335.field5128++;
        }
        for (int var17 = 0; var17 < class66.field1006; var17++) {
            if (class356.field5670[var17] == 49) {
                class318.field4904[var17] = "<col=ffffff>" + var5;
                break;
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IILvd;)V", line = 162)
    public static final void method2519(int arg0, int arg1, class72 arg2) {
        field5695++;
        class126.field2112 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = -1;
        int[] var6 = arg2.field1076;
        int[] var7 = arg2.field1084;
        byte var8 = -1;
        try {
            int var9 = 0;
            label4561: while (true) {
                var9++;
                if (var9 > arg1) {
                    throw new RuntimeException("slow");
                }
                var5++;
                int var550 = var6[var5];
                if (var550 < 100) {
                    if (var550 == 0) {
                        class212.field3325[var3++] = var7[var5];
                        continue;
                    }
                    if (var550 == 1) {
                        int var10 = var7[var5];
                        class212.field3325[var3++] = class160.field2538[var10];
                        continue;
                    }
                    if (var550 == 2) {
                        int var11 = var7[var5];
                        var3--;
                        class278.method2034(19500, var11, class212.field3325[var3]);
                        continue;
                    }
                    if (var550 == 3) {
                        class9.field127[var4++] = arg2.field1070[var5];
                        continue;
                    }
                    if (var550 == 6) {
                        var5 += var7[var5];
                        continue;
                    }
                    if (var550 == 7) {
                        var3 -= 2;
                        if (class212.field3325[var3 + 1] != class212.field3325[var3]) {
                            var5 += var7[var5];
                        }
                        continue;
                    }
                    if (var550 == 8) {
                        var3 -= 2;
                        if (class212.field3325[var3 + 1] == class212.field3325[var3]) {
                            var5 += var7[var5];
                        }
                        continue;
                    }
                    if (var550 == 9) {
                        var3 -= 2;
                        if (class212.field3325[var3 + 1] > class212.field3325[var3]) {
                            var5 += var7[var5];
                        }
                        continue;
                    }
                    if (var550 == 10) {
                        var3 -= 2;
                        if (class212.field3325[var3] > class212.field3325[var3 + 1]) {
                            var5 += var7[var5];
                        }
                        continue;
                    }
                    if (var550 == 21) {
                        if (class126.field2112 == 0) {
                            return;
                        }
                        class210 var12 = class252.field3879[--class126.field2112];
                        class245.field3821 = var12.field3230;
                        class245.field3822 = var12.field3231;
                        arg2 = var12.field3227;
                        var5 = var12.field3226;
                        var6 = arg2.field1076;
                        var7 = arg2.field1084;
                        continue;
                    }
                    if (var550 == 25) {
                        int var13 = var7[var5];
                        class212.field3325[var3++] = class305.method2195(var13, (byte) 5);
                        continue;
                    }
                    if (var550 == 27) {
                        int var14 = var7[var5];
                        var3--;
                        class108.method945(var14, (byte) -13, class212.field3325[var3]);
                        continue;
                    }
                    if (var550 == 31) {
                        var3 -= 2;
                        if (class212.field3325[var3 + 1] >= class212.field3325[var3]) {
                            var5 += var7[var5];
                        }
                        continue;
                    }
                    if (var550 == 32) {
                        var3 -= 2;
                        if (class212.field3325[var3] >= class212.field3325[var3 + 1]) {
                            var5 += var7[var5];
                        }
                        continue;
                    }
                    if (var550 == 33) {
                        class212.field3325[var3++] = class245.field3821[var7[var5]];
                        continue;
                    }
                    int var10001;
                    if (var550 == 34) {
                        var10001 = var7[var5];
                        var3--;
                        class245.field3821[var10001] = class212.field3325[var3];
                        continue;
                    }
                    if (var550 == 35) {
                        class9.field127[var4++] = class245.field3822[var7[var5]];
                        continue;
                    }
                    if (var550 == 36) {
                        var10001 = var7[var5];
                        var4--;
                        class245.field3822[var10001] = class9.field127[var4];
                        continue;
                    }
                    if (var550 == 37) {
                        int var15 = var7[var5];
                        var4 -= var15;
                        String var16 = class274.method2017(class9.field127, 7933, var4, var15);
                        class9.field127[var4++] = var16;
                        continue;
                    }
                    if (var550 == 38) {
                        var3--;
                        continue;
                    }
                    if (var550 == 39) {
                        var4--;
                        continue;
                    }
                    if (var550 == 40) {
                        int var17 = var7[var5];
                        class72 var18 = class61.method618((byte) 87, var17);
                        int[] var19 = new int[var18.field1071];
                        String[] var20 = new String[var18.field1078];
                        for (int var21 = 0; var21 < var18.field1072; var21++) {
                            var19[var21] = class212.field3325[var3 + var21 - var18.field1072];
                        }
                        for (int var22 = 0; var22 < var18.field1083; var22++) {
                            var20[var22] = class9.field127[var22 + var4 - var18.field1083];
                        }
                        var3 -= var18.field1072;
                        var4 -= var18.field1083;
                        class210 var23 = new class210();
                        var23.field3226 = var5;
                        var23.field3230 = class245.field3821;
                        var23.field3231 = class245.field3822;
                        var23.field3227 = arg2;
                        if (class126.field2112 >= class252.field3879.length) {
                            throw new RuntimeException();
                        }
                        var5 = -1;
                        arg2 = var18;
                        class252.field3879[class126.field2112++] = var23;
                        class245.field3821 = var19;
                        var6 = var18.field1076;
                        var7 = var18.field1084;
                        class245.field3822 = var20;
                        continue;
                    }
                    if (var550 == 42) {
                        class212.field3325[var3++] = class10.field134[var7[var5]];
                        continue;
                    }
                    if (var550 == 43) {
                        int var24 = var7[var5];
                        var3--;
                        class10.field134[var24] = class212.field3325[var3];
                        class81.method735(var24, (byte) 125);
                        continue;
                    }
                    if (var550 == 44) {
                        int var25 = var7[var5] >> 16;
                        int var26 = var7[var5] & 0xFFFF;
                        var3--;
                        int var27 = class212.field3325[var3];
                        if (var27 >= 0 && var27 <= 5000) {
                            class335.field5122[var25] = var27;
                            byte var28 = -1;
                            if (var26 == 105) {
                                var28 = 0;
                            }
                            int var29 = 0;
                            while (true) {
                                if (var27 <= var29) {
                                    continue label4561;
                                }
                                class356.field5673[var25][var29] = var28;
                                var29++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var550 == 45) {
                        int var30 = var7[var5];
                        var3--;
                        int var31 = class212.field3325[var3];
                        if (var31 >= 0 && class335.field5122[var30] > var31) {
                            class212.field3325[var3++] = class356.field5673[var30][var31];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var550 == 46) {
                        var3 -= 2;
                        int var32 = class212.field3325[var3];
                        int var33 = var7[var5];
                        if (var32 >= 0 && var32 < class335.field5122[var33]) {
                            class356.field5673[var33][var32] = class212.field3325[var3 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var550 == 47) {
                        String var34 = class93.field1416[var7[var5]];
                        if (var34 == null) {
                            var34 = "null";
                        }
                        class9.field127[var4++] = var34;
                        continue;
                    }
                    if (var550 == 48) {
                        int var35 = var7[var5];
                        var4--;
                        class93.field1416[var35] = class9.field127[var4];
                        class324.method2297(var35, true);
                        continue;
                    }
                    if (var550 == 51) {
                        class37 var36 = arg2.field1079[var7[var5]];
                        var3--;
                        class164 var37 = (class164) var36.method370((byte) -120, (long) class212.field3325[var3]);
                        if (var37 != null) {
                            var5 += var37.field2610;
                        }
                        continue;
                    }
                }
                boolean var38;
                if (var7[var5] == 1) {
                    var38 = true;
                } else {
                    var38 = false;
                }
                if (var550 < 300) {
                    if (var550 == 100) {
                        var3 -= 3;
                        int var39 = class212.field3325[var3 + 1];
                        int var40 = class212.field3325[var3];
                        int var41 = class212.field3325[var3 + 2];
                        if (var39 == 0) {
                            throw new RuntimeException();
                        }
                        class342 var42 = class355.method2497(0, var40);
                        if (var42.field5312 == null) {
                            var42.field5312 = new class342[var41 + 1];
                        }
                        if (var42.field5312.length <= var41) {
                            class342[] var43 = new class342[var41 + 1];
                            for (int var44 = 0; var44 < var42.field5312.length; var44++) {
                                var43[var44] = var42.field5312[var44];
                            }
                            var42.field5312 = var43;
                        }
                        if (var41 > 0 && var42.field5312[var41 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var41 - 1));
                        }
                        class342 var45 = new class342();
                        var45.field5279 = var39;
                        var45.field5296 = var45.field5433 = var42.field5433;
                        var45.field5380 = var41;
                        var45.field5340 = true;
                        var42.field5312[var41] = var45;
                        if (var38) {
                            class238.field3685 = var45;
                        } else {
                            class309.field4775 = var45;
                        }
                        class339.method2380(var42, 119);
                        continue;
                    }
                    if (var550 == 101) {
                        class342 var46 = var38 ? class238.field3685 : class309.field4775;
                        if (var46.field5380 == -1) {
                            if (!var38) {
                                throw new RuntimeException("Tried to cc_delete static active-component!");
                            }
                            throw new RuntimeException("Tried to .cc_delete static .active-component!");
                        }
                        class342 var47 = class355.method2497(0, var46.field5433);
                        var47.field5312[var46.field5380] = null;
                        class339.method2380(var47, 105);
                        continue;
                    }
                    if (var550 == 102) {
                        var3--;
                        class342 var48 = class355.method2497(0, class212.field3325[var3]);
                        var48.field5312 = null;
                        class339.method2380(var48, 124);
                        continue;
                    }
                    if (var550 == 200) {
                        var3 -= 2;
                        int var49 = class212.field3325[var3 + 1];
                        int var50 = class212.field3325[var3];
                        class342 var51 = class320.method2259(var49, var50, 0);
                        if (var51 != null && var49 != -1) {
                            class212.field3325[var3++] = 1;
                            if (var38) {
                                class238.field3685 = var51;
                            } else {
                                class309.field4775 = var51;
                            }
                            continue;
                        }
                        class212.field3325[var3++] = 0;
                        continue;
                    }
                    if (var550 == 201) {
                        var3--;
                        int var52 = class212.field3325[var3];
                        class342 var53 = class355.method2497(0, var52);
                        if (var53 == null) {
                            class212.field3325[var3++] = 0;
                        } else {
                            class212.field3325[var3++] = 1;
                            if (var38) {
                                class238.field3685 = var53;
                            } else {
                                class309.field4775 = var53;
                            }
                        }
                        continue;
                    }
                } else if (var550 < 500) {
                    if (var550 == 403) {
                        var3 -= 2;
                        int var537 = class212.field3325[var3];
                        int var538 = class212.field3325[var3 + 1];
                        for (int var539 = 0; var539 < class34.field531.length; var539++) {
                            if (class34.field531[var539] == var537) {
                                class173.field2746.field2730.method1540(var538, var539, (byte) 27);
                                continue label4561;
                            }
                        }
                        int var540 = 0;
                        while (true) {
                            if (var540 >= class202.field3113.length) {
                                continue label4561;
                            }
                            if (class202.field3113[var540] == var537) {
                                class173.field2746.field2730.method1540(var538, var540, (byte) 27);
                                continue label4561;
                            }
                            var540++;
                        }
                    }
                    if (var550 == 404) {
                        var3 -= 2;
                        int var541 = class212.field3325[var3];
                        int var542 = class212.field3325[var3 + 1];
                        class173.field2746.field2730.method1534((byte) 32, var541, var542);
                        continue;
                    }
                    if (var550 == 410) {
                        var3--;
                        boolean var543 = class212.field3325[var3] != 0;
                        class173.field2746.field2730.method1537(var543, Integer.MIN_VALUE);
                        continue;
                    }
                } else if (!(var550 < 1000 || var550 >= 1100) || !(var550 < 2000 || var550 >= 2100)) {
                    class342 var531;
                    if (var550 < 2000) {
                        var531 = var38 ? class238.field3685 : class309.field4775;
                    } else {
                        var550 -= 1000;
                        var3--;
                        var531 = class355.method2497(0, class212.field3325[var3]);
                    }
                    if (var550 == 1000) {
                        var3 -= 4;
                        var531.field5315 = class212.field3325[var3];
                        var531.field5342 = class212.field3325[var3 + 1];
                        int var532 = class212.field3325[var3 + 2];
                        int var533 = class212.field3325[var3 + 3];
                        if (var532 < 0) {
                            var532 = 0;
                        } else if (var532 > 5) {
                            var532 = 5;
                        }
                        if (var533 < 0) {
                            var533 = 0;
                        } else if (var533 > 5) {
                            var533 = 5;
                        }
                        var531.field5376 = (byte) var533;
                        var531.field5301 = (byte) var532;
                        class339.method2380(var531, 105);
                        class170.method1341(var531, -13214);
                        if (var531.field5380 == -1) {
                            class62.method624((byte) 94, var531.field5433);
                        }
                        continue;
                    }
                    if (var550 == 1001) {
                        var3 -= 4;
                        var531.field5355 = class212.field3325[var3];
                        var531.field5413 = class212.field3325[var3 + 1];
                        var531.field5308 = 0;
                        var531.field5443 = 0;
                        int var534 = class212.field3325[var3 + 2];
                        if (var534 < 0) {
                            var534 = 0;
                        } else if (var534 > 4) {
                            var534 = 4;
                        }
                        int var535 = class212.field3325[var3 + 3];
                        var531.field5347 = (byte) var534;
                        if (var535 < 0) {
                            var535 = 0;
                        } else if (var535 > 4) {
                            var535 = 4;
                        }
                        var531.field5348 = (byte) var535;
                        class339.method2380(var531, 110);
                        class170.method1341(var531, -13214);
                        if (var531.field5279 == 0) {
                            class205.method1530(var531, false, 0);
                        }
                        continue;
                    }
                    if (var550 == 1003) {
                        var3--;
                        boolean var536 = class212.field3325[var3] == 1;
                        if (var531.field5384 != var536) {
                            var531.field5384 = var536;
                            class339.method2380(var531, 119);
                        }
                        if (var531.field5380 == -1) {
                            class234.method1751(-1, var531.field5433);
                        }
                        continue;
                    }
                    if (var550 == 1004) {
                        var3 -= 2;
                        var531.field5409 = class212.field3325[var3];
                        var531.field5353 = class212.field3325[var3 + 1];
                        class339.method2380(var531, 125);
                        class170.method1341(var531, -13214);
                        if (var531.field5279 == 0) {
                            class205.method1530(var531, false, 0);
                        }
                        continue;
                    }
                    if (var550 == 1005) {
                        var3--;
                        var531.field5329 = class212.field3325[var3] == 1;
                        continue;
                    }
                } else if (var550 >= 1100 && var550 < 1200 || var550 >= 2100 && var550 < 2200) {
                    class342 var526;
                    if (var550 < 2000) {
                        var526 = var38 ? class238.field3685 : class309.field4775;
                    } else {
                        var3--;
                        var526 = class355.method2497(0, class212.field3325[var3]);
                        var550 -= 1000;
                    }
                    if (var550 == 1100) {
                        var3 -= 2;
                        var526.field5351 = class212.field3325[var3];
                        if (var526.field5351 > var526.field5278 - var526.field5374) {
                            var526.field5351 = var526.field5278 - var526.field5374;
                        }
                        if (var526.field5351 < 0) {
                            var526.field5351 = 0;
                        }
                        var526.field5334 = class212.field3325[var3 + 1];
                        if ((var526.field5264 - var526.field5339) < var526.field5334) {
                            var526.field5334 = var526.field5264 - var526.field5339;
                        }
                        if (var526.field5334 < 0) {
                            var526.field5334 = 0;
                        }
                        class339.method2380(var526, 103);
                        if (var526.field5380 == -1) {
                            class201.method1505(var526.field5433, 12);
                        }
                        continue;
                    }
                    if (var550 == 1101) {
                        var3--;
                        var526.field5277 = class212.field3325[var3];
                        class339.method2380(var526, 102);
                        if (var526.field5380 == -1) {
                            class22.method234(var526.field5433, -127);
                        }
                        continue;
                    }
                    if (var550 == 1102) {
                        var3--;
                        var526.field5369 = class212.field3325[var3] == 1;
                        class339.method2380(var526, 105);
                        continue;
                    }
                    if (var550 == 1103) {
                        var3--;
                        var526.field5352 = class212.field3325[var3];
                        class339.method2380(var526, 113);
                        continue;
                    }
                    if (var550 == 1104) {
                        var3--;
                        var526.field5295 = class212.field3325[var3];
                        class339.method2380(var526, 103);
                        continue;
                    }
                    if (var550 == 1105) {
                        var3--;
                        int var527 = class212.field3325[var3];
                        if (var526.field5371 != var527) {
                            var526.field5371 = var527;
                            class339.method2380(var526, 107);
                        }
                        if (var526.field5380 == -1) {
                            class100.method875(var526.field5433, 14);
                        }
                        continue;
                    }
                    if (var550 == 1106) {
                        var3--;
                        var526.field5328 = class212.field3325[var3];
                        class339.method2380(var526, 109);
                        continue;
                    }
                    if (var550 == 1107) {
                        var3--;
                        var526.field5378 = class212.field3325[var3] == 1;
                        class339.method2380(var526, 108);
                        continue;
                    }
                    if (var550 == 1108) {
                        var526.field5311 = 1;
                        var3--;
                        var526.field5441 = class212.field3325[var3];
                        class339.method2380(var526, 112);
                        if (var526.field5380 == -1) {
                            class104.method907((byte) 103, var526.field5433);
                        }
                        continue;
                    }
                    if (var550 == 1109) {
                        var3 -= 6;
                        var526.field5289 = class212.field3325[var3];
                        var526.field5303 = class212.field3325[var3 + 1];
                        var526.field5299 = class212.field3325[var3 + 2];
                        var526.field5435 = class212.field3325[var3 + 3];
                        var526.field5381 = class212.field3325[var3 + 4];
                        var526.field5288 = class212.field3325[var3 + 5];
                        class339.method2380(var526, 127);
                        if (var526.field5380 == -1) {
                            class258.method1904(false, var526.field5433);
                            class160.method1291(var526.field5433, false);
                        }
                        continue;
                    }
                    if (var550 == 1110) {
                        var3--;
                        int var528 = class212.field3325[var3];
                        if (var526.field5440 != var528) {
                            var526.field5364 = 1;
                            var526.field5440 = var528;
                            var526.field5361 = 0;
                            var526.field5310 = 0;
                            class339.method2380(var526, 110);
                        }
                        if (var526.field5380 == -1) {
                            class174.method1366(var526.field5433, (byte) 42);
                        }
                        continue;
                    }
                    if (var550 == 1111) {
                        var3--;
                        var526.field5313 = class212.field3325[var3] == 1;
                        class339.method2380(var526, 123);
                        continue;
                    }
                    if (var550 == 1112) {
                        var4--;
                        String var529 = class9.field127[var4];
                        if (!var529.equals(var526.field5265)) {
                            var526.field5265 = var529;
                            class339.method2380(var526, 108);
                        }
                        if (var526.field5380 == -1) {
                            class295.method2127(var526.field5433, -29958);
                        }
                        continue;
                    }
                    if (var550 == 1113) {
                        var3--;
                        var526.field5377 = class212.field3325[var3];
                        class339.method2380(var526, 115);
                        continue;
                    }
                    if (var550 == 1114) {
                        var3 -= 3;
                        var526.field5437 = class212.field3325[var3];
                        var526.field5398 = class212.field3325[var3 + 1];
                        var526.field5362 = class212.field3325[var3 + 2];
                        class339.method2380(var526, 103);
                        continue;
                    }
                    if (var550 == 1115) {
                        var3--;
                        var526.field5285 = class212.field3325[var3] == 1;
                        class339.method2380(var526, 119);
                        continue;
                    }
                    if (var550 == 1116) {
                        var3--;
                        var526.field5397 = class212.field3325[var3];
                        class339.method2380(var526, 107);
                        continue;
                    }
                    if (var550 == 1117) {
                        var3--;
                        var526.field5417 = class212.field3325[var3];
                        class339.method2380(var526, 123);
                        continue;
                    }
                    if (var550 == 1118) {
                        var3--;
                        var526.field5372 = class212.field3325[var3] == 1;
                        class339.method2380(var526, 108);
                        continue;
                    }
                    if (var550 == 1119) {
                        var3--;
                        var526.field5325 = class212.field3325[var3] == 1;
                        class339.method2380(var526, 124);
                        continue;
                    }
                    if (var550 == 1120) {
                        var3 -= 2;
                        var526.field5278 = class212.field3325[var3];
                        var526.field5264 = class212.field3325[var3 + 1];
                        class339.method2380(var526, 117);
                        if (var526.field5279 == 0) {
                            class205.method1530(var526, false, 0);
                        }
                        continue;
                    }
                    if (var550 == 1121) {
                        var3 -= 2;
                        var526.field5260 = (short) class212.field3325[var3];
                        var526.field5293 = (short) class212.field3325[var3 + 1];
                        class339.method2380(var526, 126);
                        continue;
                    }
                    if (var550 == 1122) {
                        var3--;
                        var526.field5304 = class212.field3325[var3] == 1;
                        class339.method2380(var526, 116);
                        continue;
                    }
                    if (var550 == 1123) {
                        var3--;
                        var526.field5288 = class212.field3325[var3];
                        class339.method2380(var526, 115);
                        if (var526.field5380 == -1) {
                            class258.method1904(false, var526.field5433);
                        }
                        continue;
                    }
                    if (var550 == 1124) {
                        var3--;
                        int var530 = class212.field3325[var3];
                        var526.field5415 = var530 == 1;
                        class339.method2380(var526, 123);
                        continue;
                    }
                } else if (!(var550 < 1200 || var550 >= 1300) || !(var550 < 2200 || var550 >= 2300)) {
                    class342 var522;
                    if (var550 >= 2000) {
                        var3--;
                        var522 = class355.method2497(0, class212.field3325[var3]);
                        var550 -= 1000;
                    } else {
                        var522 = var38 ? class238.field3685 : class309.field4775;
                    }
                    class339.method2380(var522, 115);
                    if (var550 == 1200 || var550 == 1205 || var550 == 1208 || var550 == 1209) {
                        var3 -= 2;
                        int var523 = class212.field3325[var3];
                        int var524 = class212.field3325[var3 + 1];
                        if (var522.field5380 == -1) {
                            class37.method373((byte) -108, var522.field5433);
                            class258.method1904(false, var522.field5433);
                            class160.method1291(var522.field5433, false);
                        }
                        if (var523 == -1) {
                            var522.field5399 = -1;
                            var522.field5441 = -1;
                            var522.field5311 = 1;
                            continue;
                        }
                        if (var550 == 1208 || var550 == 1209) {
                            var522.field5314 = true;
                        } else {
                            var522.field5314 = false;
                        }
                        var522.field5399 = var523;
                        var522.field5425 = var524;
                        class263 var525 = class48.method469(10, var523);
                        var522.field5303 = var525.field4025;
                        var522.field5381 = var525.field4068;
                        var522.field5435 = var525.field4089;
                        var522.field5289 = var525.field4028;
                        var522.field5299 = var525.field4061;
                        if (var550 == 1205) {
                            var522.field5327 = false;
                        } else {
                            var522.field5327 = true;
                        }
                        var522.field5288 = var525.field4032;
                        if (var522.field5443 > 0) {
                            var522.field5288 = var522.field5288 * 32 / var522.field5443;
                        } else if (var522.field5355 > 0) {
                            var522.field5288 = var522.field5288 * 32 / var522.field5355;
                        }
                        continue;
                    }
                    if (var550 == 1201) {
                        var522.field5311 = 2;
                        var3--;
                        var522.field5441 = class212.field3325[var3];
                        if (var522.field5380 == -1) {
                            class104.method907((byte) 103, var522.field5433);
                        }
                        continue;
                    }
                    if (var550 == 1202) {
                        var522.field5311 = 3;
                        var522.field5441 = class173.field2746.field2730.method1538(-124);
                        if (var522.field5380 == -1) {
                            class104.method907((byte) 103, var522.field5433);
                        }
                        continue;
                    }
                    if (var550 == 1203) {
                        var522.field5311 = 6;
                        var3--;
                        var522.field5441 = class212.field3325[var3];
                        if (var522.field5380 == -1) {
                            class104.method907((byte) 103, var522.field5433);
                        }
                        continue;
                    }
                    if (var550 == 1204) {
                        var522.field5311 = 5;
                        var3--;
                        var522.field5441 = class212.field3325[var3];
                        if (var522.field5380 == -1) {
                            class104.method907((byte) 103, var522.field5433);
                        }
                        continue;
                    }
                    if (var550 == 1206) {
                        var3 -= 4;
                        var522.field5366 = class212.field3325[var3];
                        var522.field5307 = class212.field3325[var3 + 1];
                        var522.field5266 = class212.field3325[var3 + 2];
                        var522.field5431 = class212.field3325[var3 + 3];
                        class339.method2380(var522, 123);
                        continue;
                    }
                    if (var550 == 1207) {
                        var3 -= 2;
                        var522.field5387 = class212.field3325[var3];
                        var522.field5346 = class212.field3325[var3 + 1];
                        class339.method2380(var522, 121);
                        continue;
                    }
                    if (var550 == 1211) {
                        var522.field5311 = 5;
                        var522.field5441 = 2047;
                        var522.field5363 = 0;
                        if (var522.field5380 == -1) {
                            class104.method907((byte) 103, var522.field5433);
                        }
                        continue;
                    }
                } else if (var550 >= 1300 && var550 < 1400 || var550 >= 2300 && var550 < 2400) {
                    class342 var516;
                    if (var550 >= 2000) {
                        var3--;
                        var516 = class355.method2497(0, class212.field3325[var3]);
                        var550 -= 1000;
                    } else {
                        var516 = var38 ? class238.field3685 : class309.field4775;
                    }
                    if (var550 == 1300) {
                        var3--;
                        int var517 = class212.field3325[var3] - 1;
                        if (var517 >= 0 && var517 <= 9) {
                            var4--;
                            var516.method2410(class9.field127[var4], -100, var517);
                            continue;
                        }
                        var4--;
                        continue;
                    }
                    if (var550 == 1301) {
                        var3 -= 2;
                        int var518 = class212.field3325[var3];
                        int var519 = class212.field3325[var3 + 1];
                        var516.field5396 = class320.method2259(var519, var518, 0);
                        continue;
                    }
                    if (var550 == 1302) {
                        var3--;
                        var516.field5403 = class212.field3325[var3] == 1;
                        continue;
                    }
                    if (var550 == 1303) {
                        var3--;
                        var516.field5332 = class212.field3325[var3];
                        continue;
                    }
                    if (var550 == 1304) {
                        var3--;
                        var516.field5412 = class212.field3325[var3];
                        continue;
                    }
                    if (var550 == 1305) {
                        var4--;
                        var516.field5392 = class9.field127[var4];
                        continue;
                    }
                    if (var550 == 1306) {
                        var4--;
                        var516.field5294 = class9.field127[var4];
                        continue;
                    }
                    if (var550 == 1307) {
                        var516.field5406 = null;
                        continue;
                    }
                    if (var550 == 1308) {
                        var3--;
                        var516.field5388 = class212.field3325[var3];
                        var3--;
                        var516.field5405 = class212.field3325[var3];
                        continue;
                    }
                    if (var550 == 1309) {
                        var3--;
                        int var520 = class212.field3325[var3];
                        var3--;
                        int var521 = class212.field3325[var3];
                        if (var521 >= 1 && var521 <= 10) {
                            var516.method2408(var520, -125, var521 - 1);
                        }
                        continue;
                    }
                    if (var550 == 1310) {
                        var4--;
                        var516.field5297 = class9.field127[var4];
                        continue;
                    }
                } else {
                    if (var550 >= 1400 && var550 < 1500 || var550 >= 2400 && var550 < 2500) {
                        class342 var509;
                        if (var550 < 2000) {
                            var509 = var38 ? class238.field3685 : class309.field4775;
                        } else {
                            var3--;
                            var509 = class355.method2497(0, class212.field3325[var3]);
                            var550 -= 1000;
                        }
                        var4--;
                        String var510 = class9.field127[var4];
                        int[] var511 = null;
                        if (var510.length() > 0 && var510.charAt(var510.length() - 1) == 'Y') {
                            var3--;
                            int var512 = class212.field3325[var3];
                            if (var512 > 0) {
                                var511 = new int[var512];
                                while ((var512--) > 0) {
                                    var3--;
                                    var511[var512] = class212.field3325[var3];
                                }
                            }
                            var510 = var510.substring(0, var510.length() - 1);
                        }
                        Object[] var513 = new Object[var510.length() + 1];
                        for (int var514 = var513.length - 1; var514 >= 1; var514--) {
                            if (var510.charAt(var514 - 1) == 's') {
                                var4--;
                                var513[var514] = class9.field127[var4];
                            } else {
                                var3--;
                                var513[var514] = Integer.valueOf(class212.field3325[var3]);
                            }
                        }
                        var3--;
                        int var515 = class212.field3325[var3];
                        if (var515 == -1) {
                            var513 = null;
                        } else {
                            var513[0] = Integer.valueOf(var515);
                        }
                        var509.field5375 = true;
                        if (var550 == 1400) {
                            var509.field5309 = var513;
                        } else if (var550 == 1401) {
                            var509.field5292 = var513;
                        } else if (var550 == 1402) {
                            var509.field5402 = var513;
                        } else if (var550 == 1403) {
                            var509.field5430 = var513;
                        } else if (var550 == 1404) {
                            var509.field5349 = var513;
                        } else if (var550 == 1405) {
                            var509.field5287 = var513;
                        } else if (var550 == 1406) {
                            var509.field5276 = var513;
                        } else if (var550 == 1407) {
                            var509.field5316 = var513;
                            var509.field5419 = var511;
                        } else if (var550 == 1408) {
                            var509.field5262 = var513;
                        } else if (var550 == 1409) {
                            var509.field5422 = var513;
                        } else if (var550 == 1410) {
                            var509.field5263 = var513;
                        } else if (var550 == 1411) {
                            var509.field5358 = var513;
                        } else if (var550 == 1412) {
                            var509.field5407 = var513;
                        } else if (var550 == 1414) {
                            var509.field5390 = var513;
                            var509.field5426 = var511;
                        } else if (var550 == 1415) {
                            var509.field5373 = var511;
                            var509.field5268 = var513;
                        } else if (var550 == 1416) {
                            var509.field5324 = var513;
                        } else if (var550 == 1417) {
                            var509.field5436 = var513;
                        } else if (var550 == 1418) {
                            var509.field5345 = var513;
                        } else if (var550 == 1419) {
                            var509.field5408 = var513;
                        } else if (var550 == 1420) {
                            var509.field5330 = var513;
                        } else if (var550 == 1421) {
                            var509.field5284 = var513;
                        } else if (var550 == 1422) {
                            var509.field5365 = var513;
                        } else if (var550 == 1423) {
                            var509.field5290 = var513;
                        } else if (var550 == 1424) {
                            var509.field5305 = var513;
                        } else if (var550 == 1425) {
                            var509.field5321 = var513;
                        } else if (var550 == 1426) {
                            var509.field5432 = var513;
                        } else if (var550 == 1427) {
                            var509.field5281 = var513;
                        } else if (var550 == 1428) {
                            var509.field5416 = var513;
                            var509.field5291 = var511;
                        } else if (var550 == 1429) {
                            var509.field5423 = var511;
                            var509.field5318 = var513;
                        }
                        continue;
                    }
                    if (var550 < 1600) {
                        class342 var508 = var38 ? class238.field3685 : class309.field4775;
                        if (var550 == 1500) {
                            class212.field3325[var3++] = var508.field5350;
                            continue;
                        }
                        if (var550 == 1501) {
                            class212.field3325[var3++] = var508.field5300;
                            continue;
                        }
                        if (var550 == 1502) {
                            class212.field3325[var3++] = var508.field5374;
                            continue;
                        }
                        if (var550 == 1503) {
                            class212.field3325[var3++] = var508.field5339;
                            continue;
                        }
                        if (var550 == 1504) {
                            class212.field3325[var3++] = var508.field5384 ? 1 : 0;
                            continue;
                        }
                        if (var550 == 1505) {
                            class212.field3325[var3++] = var508.field5296;
                            continue;
                        }
                    } else if (var550 < 1700) {
                        class342 var54 = var38 ? class238.field3685 : class309.field4775;
                        if (var550 == 1600) {
                            class212.field3325[var3++] = var54.field5351;
                            continue;
                        }
                        if (var550 == 1601) {
                            class212.field3325[var3++] = var54.field5334;
                            continue;
                        }
                        if (var550 == 1602) {
                            class9.field127[var4++] = var54.field5265;
                            continue;
                        }
                        if (var550 == 1603) {
                            class212.field3325[var3++] = var54.field5278;
                            continue;
                        }
                        if (var550 == 1604) {
                            class212.field3325[var3++] = var54.field5264;
                            continue;
                        }
                        if (var550 == 1605) {
                            class212.field3325[var3++] = var54.field5288;
                            continue;
                        }
                        if (var550 == 1606) {
                            class212.field3325[var3++] = var54.field5299;
                            continue;
                        }
                        if (var550 == 1607) {
                            class212.field3325[var3++] = var54.field5381;
                            continue;
                        }
                        if (var550 == 1608) {
                            class212.field3325[var3++] = var54.field5435;
                            continue;
                        }
                        if (var550 == 1609) {
                            class212.field3325[var3++] = var54.field5352;
                            continue;
                        }
                        if (var550 == 1610) {
                            class212.field3325[var3++] = var54.field5289;
                            continue;
                        }
                        if (var550 == 1611) {
                            class212.field3325[var3++] = var54.field5303;
                            continue;
                        }
                        if (var550 == 1612) {
                            class212.field3325[var3++] = var54.field5371;
                            continue;
                        }
                    } else if (var550 < 1800) {
                        class342 var55 = var38 ? class238.field3685 : class309.field4775;
                        if (var550 == 1700) {
                            class212.field3325[var3++] = var55.field5399;
                            continue;
                        }
                        if (var550 == 1701) {
                            if (var55.field5399 == -1) {
                                class212.field3325[var3++] = 0;
                            } else {
                                class212.field3325[var3++] = var55.field5425;
                            }
                            continue;
                        }
                        if (var550 == 1702) {
                            class212.field3325[var3++] = var55.field5380;
                            continue;
                        }
                    } else if (var550 < 1900) {
                        class342 var506 = var38 ? class238.field3685 : class309.field4775;
                        if (var550 == 1800) {
                            class212.field3325[var3++] = client.method1022(var506).method1695(-1);
                            continue;
                        }
                        if (var550 == 1801) {
                            var3--;
                            int var507 = class212.field3325[var3];
                            int var552 = var507 - 1;
                            if (var506.field5406 != null && var552 < var506.field5406.length && var506.field5406[var552] != null) {
                                class9.field127[var4++] = var506.field5406[var552];
                                continue;
                            }
                            class9.field127[var4++] = "";
                            continue;
                        }
                        if (var550 == 1802) {
                            if (var506.field5392 == null) {
                                class9.field127[var4++] = "";
                            } else {
                                class9.field127[var4++] = var506.field5392;
                            }
                            continue;
                        }
                    } else if (var550 < 2600) {
                        var3--;
                        class342 var56 = class355.method2497(0, class212.field3325[var3]);
                        if (var550 == 2500) {
                            class212.field3325[var3++] = var56.field5350;
                            continue;
                        }
                        if (var550 == 2501) {
                            class212.field3325[var3++] = var56.field5300;
                            continue;
                        }
                        if (var550 == 2502) {
                            class212.field3325[var3++] = var56.field5374;
                            continue;
                        }
                        if (var550 == 2503) {
                            class212.field3325[var3++] = var56.field5339;
                            continue;
                        }
                        if (var550 == 2504) {
                            class212.field3325[var3++] = var56.field5384 ? 1 : 0;
                            continue;
                        }
                        if (var550 == 2505) {
                            class212.field3325[var3++] = var56.field5296;
                            continue;
                        }
                    } else if (var550 < 2700) {
                        var3--;
                        class342 var505 = class355.method2497(0, class212.field3325[var3]);
                        if (var550 == 2600) {
                            class212.field3325[var3++] = var505.field5351;
                            continue;
                        }
                        if (var550 == 2601) {
                            class212.field3325[var3++] = var505.field5334;
                            continue;
                        }
                        if (var550 == 2602) {
                            class9.field127[var4++] = var505.field5265;
                            continue;
                        }
                        if (var550 == 2603) {
                            class212.field3325[var3++] = var505.field5278;
                            continue;
                        }
                        if (var550 == 2604) {
                            class212.field3325[var3++] = var505.field5264;
                            continue;
                        }
                        if (var550 == 2605) {
                            class212.field3325[var3++] = var505.field5288;
                            continue;
                        }
                        if (var550 == 2606) {
                            class212.field3325[var3++] = var505.field5299;
                            continue;
                        }
                        if (var550 == 2607) {
                            class212.field3325[var3++] = var505.field5381;
                            continue;
                        }
                        if (var550 == 2608) {
                            class212.field3325[var3++] = var505.field5435;
                            continue;
                        }
                        if (var550 == 2609) {
                            class212.field3325[var3++] = var505.field5352;
                            continue;
                        }
                        if (var550 == 2610) {
                            class212.field3325[var3++] = var505.field5289;
                            continue;
                        }
                        if (var550 == 2611) {
                            class212.field3325[var3++] = var505.field5303;
                            continue;
                        }
                        if (var550 == 2612) {
                            class212.field3325[var3++] = var505.field5371;
                            continue;
                        }
                    } else if (var550 < 2800) {
                        if (var550 == 2700) {
                            var3--;
                            class342 var495 = class355.method2497(0, class212.field3325[var3]);
                            class212.field3325[var3++] = var495.field5399;
                            continue;
                        }
                        if (var550 != 2701) {
                            if (var550 == 2702) {
                                var3--;
                                int var497 = class212.field3325[var3];
                                class36 var498 = (class36) class135.field2251.method370((byte) -120, (long) var497);
                                if (var498 == null) {
                                    class212.field3325[var3++] = 0;
                                } else {
                                    class212.field3325[var3++] = 1;
                                }
                                continue;
                            }
                            if (var550 == 2703) {
                                var3--;
                                class342 var499 = class355.method2497(0, class212.field3325[var3]);
                                if (var499.field5312 == null) {
                                    class212.field3325[var3++] = 0;
                                    continue;
                                }
                                int var500 = var499.field5312.length;
                                for (int var501 = 0; var501 < var499.field5312.length; var501++) {
                                    if (var499.field5312[var501] == null) {
                                        var500 = var501;
                                        break;
                                    }
                                }
                                class212.field3325[var3++] = var500;
                                continue;
                            }
                            if (var550 != 2704 && var550 != 2705) {
                                throw new IllegalStateException();
                            }
                            var3 -= 2;
                            int var502 = class212.field3325[var3 + 1];
                            int var503 = class212.field3325[var3];
                            class36 var504 = (class36) class135.field2251.method370((byte) -120, (long) var503);
                            if (var504 != null && var504.field540 == var502) {
                                class212.field3325[var3++] = 1;
                                continue;
                            }
                            class212.field3325[var3++] = 0;
                            continue;
                        }
                        var3--;
                        class342 var496 = class355.method2497(0, class212.field3325[var3]);
                        if (var496.field5399 == -1) {
                            class212.field3325[var3++] = 0;
                        } else {
                            class212.field3325[var3++] = var496.field5425;
                        }
                        continue;
                    } else if (var550 < 2900) {
                        var3--;
                        class342 var57 = class355.method2497(0, class212.field3325[var3]);
                        if (var550 == 2800) {
                            class212.field3325[var3++] = client.method1022(var57).method1695(-1);
                            continue;
                        }
                        if (var550 == 2801) {
                            var3--;
                            int var58 = class212.field3325[var3];
                            int var551 = var58 - 1;
                            if (var57.field5406 != null && var57.field5406.length > var551 && var57.field5406[var551] != null) {
                                class9.field127[var4++] = var57.field5406[var551];
                                continue;
                            }
                            class9.field127[var4++] = "";
                            continue;
                        }
                        if (var550 == 2802) {
                            if (var57.field5392 == null) {
                                class9.field127[var4++] = "";
                            } else {
                                class9.field127[var4++] = var57.field5392;
                            }
                            continue;
                        }
                    } else if (var550 < 3200) {
                        if (var550 == 3100) {
                            var4--;
                            String var480 = class9.field127[var4];
                            class101.method882(-1, var480);
                            continue;
                        }
                        if (var550 == 3101) {
                            var3 -= 2;
                            class102.method884(class173.field2746, (byte) -106, class212.field3325[var3], class212.field3325[var3 + 1]);
                            continue;
                        }
                        if (var550 == 3103) {
                            class194.method1477(227670764);
                            continue;
                        }
                        if (var550 == 3104) {
                            class324.field4987++;
                            int var481 = 0;
                            var4--;
                            String var482 = class9.field127[var4];
                            if (class295.method2128(true, var482)) {
                                var481 = class343.method2418(118, var482);
                            }
                            class99.field1491.method1628((byte) -111, 26);
                            class99.field1491.method310(121, var481);
                            continue;
                        }
                        if (var550 == 3105) {
                            class139.field2314++;
                            var4--;
                            String var483 = class9.field127[var4];
                            class99.field1491.method1628((byte) -49, 80);
                            class99.field1491.method273(0, var483.length() + 1);
                            class99.field1491.method280(-18345, var483);
                            continue;
                        }
                        if (var550 == 3106) {
                            class264.field4110++;
                            var4--;
                            String var484 = class9.field127[var4];
                            class99.field1491.method1628((byte) -15, 132);
                            class99.field1491.method273(0, var484.length() + 1);
                            class99.field1491.method280(-18345, var484);
                            continue;
                        }
                        if (var550 == 3107) {
                            var3--;
                            int var485 = class212.field3325[var3];
                            var4--;
                            String var486 = class9.field127[var4];
                            class104.method899(var485, (byte) -37, var486);
                            continue;
                        }
                        if (var550 == 3108) {
                            var3 -= 3;
                            int var487 = class212.field3325[var3];
                            int var488 = class212.field3325[var3 + 1];
                            int var489 = class212.field3325[var3 + 2];
                            class342 var490 = class355.method2497(0, var489);
                            class33.method346(var490, var488, -3, var487);
                            continue;
                        }
                        if (var550 == 3109) {
                            var3 -= 2;
                            int var491 = class212.field3325[var3 + 1];
                            int var492 = class212.field3325[var3];
                            class342 var493 = var38 ? class238.field3685 : class309.field4775;
                            class33.method346(var493, var491, -3, var492);
                            continue;
                        }
                        if (var550 == 3110) {
                            class197.field3077++;
                            var3--;
                            int var494 = class212.field3325[var3];
                            class99.field1491.method1628((byte) -22, 96);
                            class99.field1491.method304(false, var494);
                            continue;
                        }
                    } else if (var550 < 3300) {
                        if (var550 == 3200) {
                            var3 -= 3;
                            class62.method621(class212.field3325[var3 + 1], 0, class212.field3325[var3], 255, class212.field3325[var3 + 2]);
                            continue;
                        }
                        if (var550 == 3201) {
                            var3--;
                            class172.method1359(-126, class212.field3325[var3], 255);
                            continue;
                        }
                        if (var550 == 3202) {
                            var3 -= 2;
                            class85.method770(class212.field3325[var3 + 1], class212.field3325[var3], 255, (byte) 113);
                            continue;
                        }
                    } else if (var550 < 3400) {
                        if (var550 == 3300) {
                            class212.field3325[var3++] = class360.field5718;
                            continue;
                        }
                        if (var550 == 3301) {
                            var3 -= 2;
                            int var59 = class212.field3325[var3];
                            int var60 = class212.field3325[var3 + 1];
                            class212.field3325[var3++] = class334.method2353(var59, var60, -1);
                            continue;
                        }
                        if (var550 == 3302) {
                            var3 -= 2;
                            int var61 = class212.field3325[var3];
                            int var62 = class212.field3325[var3 + 1];
                            class212.field3325[var3++] = class232.method1738(true, var62, var61);
                            continue;
                        }
                        if (var550 == 3303) {
                            var3 -= 2;
                            int var63 = class212.field3325[var3 + 1];
                            int var64 = class212.field3325[var3];
                            class212.field3325[var3++] = class135.method1142(1, var64, var63);
                            continue;
                        }
                        if (var550 == 3304) {
                            var3--;
                            int var65 = class212.field3325[var3];
                            class212.field3325[var3++] = class226.method1690(var65, 6).field3162;
                            continue;
                        }
                        if (var550 == 3305) {
                            var3--;
                            int var66 = class212.field3325[var3];
                            class212.field3325[var3++] = class176.field2778[var66];
                            continue;
                        }
                        if (var550 == 3306) {
                            var3--;
                            int var67 = class212.field3325[var3];
                            class212.field3325[var3++] = class100.field1497[var67];
                            continue;
                        }
                        if (var550 == 3307) {
                            var3--;
                            int var68 = class212.field3325[var3];
                            class212.field3325[var3++] = class260.field3982[var68];
                            continue;
                        }
                        if (var550 == 3308) {
                            int var69 = (class173.field2746.field1359 >> 7) + field5696;
                            int var70 = (class173.field2746.field1286 >> 7) + class49.field755;
                            int var71 = class119.field1826;
                            class212.field3325[var3++] = (var69 << 14) + (var71 << 28) + var70;
                            continue;
                        }
                        if (var550 == 3309) {
                            var3--;
                            int var72 = class212.field3325[var3];
                            class212.field3325[var3++] = class301.method2169(var72 >> 14, 16383);
                            continue;
                        }
                        if (var550 == 3310) {
                            var3--;
                            int var73 = class212.field3325[var3];
                            class212.field3325[var3++] = var73 >> 28;
                            continue;
                        }
                        if (var550 == 3311) {
                            var3--;
                            int var74 = class212.field3325[var3];
                            class212.field3325[var3++] = class301.method2169(16383, var74);
                            continue;
                        }
                        if (var550 == 3312) {
                            class212.field3325[var3++] = class42.field668 ? 1 : 0;
                            continue;
                        }
                        if (var550 == 3313) {
                            var3 -= 2;
                            int var75 = class212.field3325[var3] + 32768;
                            int var76 = class212.field3325[var3 + 1];
                            class212.field3325[var3++] = class334.method2353(var75, var76, -1);
                            continue;
                        }
                        if (var550 == 3314) {
                            var3 -= 2;
                            int var77 = class212.field3325[var3] + 32768;
                            int var78 = class212.field3325[var3 + 1];
                            class212.field3325[var3++] = class232.method1738(true, var78, var77);
                            continue;
                        }
                        if (var550 == 3315) {
                            var3 -= 2;
                            int var79 = class212.field3325[var3] + 32768;
                            int var80 = class212.field3325[var3 + 1];
                            class212.field3325[var3++] = class135.method1142(1, var79, var80);
                            continue;
                        }
                        if (var550 == 3316) {
                            if (class270.field4168 < 2) {
                                class212.field3325[var3++] = 0;
                            } else {
                                class212.field3325[var3++] = class270.field4168;
                            }
                            continue;
                        }
                        if (var550 == 3317) {
                            class212.field3325[var3++] = class206.field3175;
                            continue;
                        }
                        if (var550 == 3318) {
                            class212.field3325[var3++] = class207.field3196;
                            continue;
                        }
                        if (var550 == 3321) {
                            class212.field3325[var3++] = class61.field940;
                            continue;
                        }
                        if (var550 == 3322) {
                            class212.field3325[var3++] = class194.field3052;
                            continue;
                        }
                        if (var550 == 3323) {
                            if (class190.field2990 >= 5 && class190.field2990 <= 9) {
                                class212.field3325[var3++] = 1;
                                continue;
                            }
                            class212.field3325[var3++] = 0;
                            continue;
                        }
                        if (var550 == 3324) {
                            if (class190.field2990 >= 5 && class190.field2990 <= 9) {
                                class212.field3325[var3++] = class190.field2990;
                                continue;
                            }
                            class212.field3325[var3++] = 0;
                            continue;
                        }
                        if (var550 == 3325) {
                            class212.field3325[var3++] = class279.field4299 ? 1 : 0;
                            continue;
                        }
                        if (var550 == 3326) {
                            class212.field3325[var3++] = class173.field2746.field2722;
                            continue;
                        }
                        if (var550 == 3327) {
                            class212.field3325[var3++] = class173.field2746.field2730.field3201 ? 1 : 0;
                            continue;
                        }
                        if (var550 == 3328) {
                            class212.field3325[var3++] = class175.field2772 && !class285.field4421 ? 1 : 0;
                            continue;
                        }
                        if (var550 == 3329) {
                            class212.field3325[var3++] = class256.field3935 ? 1 : 0;
                            continue;
                        }
                        if (var550 == 3330) {
                            var3--;
                            int var81 = class212.field3325[var3];
                            class212.field3325[var3++] = class313.method2217(var81, 18794);
                            continue;
                        }
                        if (var550 == 3331) {
                            var3 -= 2;
                            int var82 = class212.field3325[var3];
                            int var83 = class212.field3325[var3 + 1];
                            class212.field3325[var3++] = class6.method44(var83, var82, 0, false);
                            continue;
                        }
                        if (var550 == 3332) {
                            var3 -= 2;
                            int var84 = class212.field3325[var3 + 1];
                            int var85 = class212.field3325[var3];
                            class212.field3325[var3++] = class6.method44(var84, var85, 0, true);
                            continue;
                        }
                        if (var550 == 3333) {
                            class212.field3325[var3++] = class74.field1101;
                            continue;
                        }
                        if (var550 == 3335) {
                            class212.field3325[var3++] = class339.field5211;
                            continue;
                        }
                        if (var550 == 3336) {
                            var3 -= 4;
                            int var86 = class212.field3325[var3];
                            int var87 = class212.field3325[var3 + 1];
                            int var88 = class212.field3325[var3 + 2];
                            int var89 = (var87 << 14) + var86;
                            int var90 = (var88 << 28) + var89;
                            int var91 = class212.field3325[var3 + 3];
                            int var92 = var90 + var91;
                            class212.field3325[var3++] = var92;
                            continue;
                        }
                        if (var550 == 3337) {
                            class212.field3325[var3++] = class350.field5549;
                            continue;
                        }
                    } else if (var550 < 3500) {
                        if (var550 == 3400) {
                            var3 -= 2;
                            int var93 = class212.field3325[var3];
                            int var94 = class212.field3325[var3 + 1];
                            class81 var95 = class130.method1124(var93, false);
                            if (var95.field1176 == 's') {
                            }
                            class9.field127[var4++] = var95.method730(-2, var94);
                            continue;
                        }
                        if (var550 == 3408) {
                            var3 -= 4;
                            int var96 = class212.field3325[var3 + 1];
                            int var97 = class212.field3325[var3];
                            int var98 = class212.field3325[var3 + 2];
                            int var99 = class212.field3325[var3 + 3];
                            class81 var100 = class130.method1124(var98, false);
                            if (var100.field1165 == var97 && var100.field1176 == var96) {
                                if (var96 == 115) {
                                    class9.field127[var4++] = var100.method730(-2, var99);
                                } else {
                                    class212.field3325[var3++] = var100.method736(110, var99);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var550 == 3409) {
                            var3 -= 3;
                            int var101 = class212.field3325[var3 + 1];
                            int var102 = class212.field3325[var3 + 2];
                            int var103 = class212.field3325[var3];
                            if (var101 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class81 var104 = class130.method1124(var101, false);
                            if (var104.field1176 != var103) {
                                throw new RuntimeException("C3409-1");
                            }
                            class212.field3325[var3++] = var104.method734(var102, -102) ? 1 : 0;
                            continue;
                        }
                        if (var550 == 3410) {
                            var4--;
                            String var105 = class9.field127[var4];
                            var3--;
                            int var106 = class212.field3325[var3];
                            if (var106 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class81 var107 = class130.method1124(var106, false);
                            if (var107.field1176 != 's') {
                                throw new RuntimeException("C3410-1");
                            }
                            class212.field3325[var3++] = var107.method737(84, var105) ? 1 : 0;
                            continue;
                        }
                        if (var550 == 3411) {
                            var3--;
                            int var108 = class212.field3325[var3];
                            class81 var109 = class130.method1124(var108, false);
                            class212.field3325[var3++] = var109.field1175.method380((byte) -84);
                            continue;
                        }
                    } else if (var550 < 3700) {
                        if (var550 == 3600) {
                            if (class303.field4722 == 0) {
                                class212.field3325[var3++] = -2;
                            } else if (class303.field4722 == 1) {
                                class212.field3325[var3++] = -1;
                            } else {
                                class212.field3325[var3++] = class131.field2215;
                            }
                            continue;
                        }
                        if (var550 == 3601) {
                            var3--;
                            int var110 = class212.field3325[var3];
                            if (class303.field4722 == 2 && var110 < class131.field2215) {
                                class9.field127[var4++] = class83.field1197[var110];
                                if (class173.field2751[var110] == null) {
                                    class9.field127[var4++] = "";
                                } else {
                                    class9.field127[var4++] = class173.field2751[var110];
                                }
                                continue;
                            }
                            class9.field127[var4++] = "";
                            class9.field127[var4++] = "";
                            continue;
                        }
                        if (var550 == 3602) {
                            var3--;
                            int var111 = class212.field3325[var3];
                            if (class303.field4722 == 2 && var111 < class131.field2215) {
                                class212.field3325[var3++] = class55.field807[var111];
                                continue;
                            }
                            class212.field3325[var3++] = 0;
                            continue;
                        }
                        if (var550 == 3603) {
                            var3--;
                            int var112 = class212.field3325[var3];
                            if (class303.field4722 == 2 && class131.field2215 > var112) {
                                class212.field3325[var3++] = class36.field537[var112];
                                continue;
                            }
                            class212.field3325[var3++] = 0;
                            continue;
                        }
                        if (var550 == 3604) {
                            var4--;
                            String var113 = class9.field127[var4];
                            var3--;
                            int var114 = class212.field3325[var3];
                            class167.method1332(var113, var114, 44);
                            continue;
                        }
                        if (var550 == 3605) {
                            var4--;
                            String var115 = class9.field127[var4];
                            class66.method650(0, var115);
                            continue;
                        }
                        if (var550 == 3606) {
                            var4--;
                            String var116 = class9.field127[var4];
                            class329.method2323(var116, -1);
                            continue;
                        }
                        if (var550 == 3607) {
                            var4--;
                            String var117 = class9.field127[var4];
                            class32.method342(0, var117, false);
                            continue;
                        }
                        if (var550 == 3608) {
                            var4--;
                            String var118 = class9.field127[var4];
                            class263.method1941(true, var118);
                            continue;
                        }
                        if (var550 == 3609) {
                            var4--;
                            String var119 = class9.field127[var4];
                            if (var119.startsWith("<img=0>") || var119.startsWith("<img=1>")) {
                                var119 = var119.substring(7);
                            }
                            class212.field3325[var3++] = class214.method1604(-128, var119) ? 1 : 0;
                            continue;
                        }
                        if (var550 == 3610) {
                            var3--;
                            int var120 = class212.field3325[var3];
                            if (class303.field4722 == 2 && class131.field2215 > var120) {
                                class9.field127[var4++] = class201.field3107[var120];
                                continue;
                            }
                            class9.field127[var4++] = "";
                            continue;
                        }
                        if (var550 == 3611) {
                            if (class301.field4672 == null) {
                                class9.field127[var4++] = "";
                            } else {
                                class9.field127[var4++] = class362.method2546(136, class301.field4672);
                            }
                            continue;
                        }
                        if (var550 == 3612) {
                            if (class301.field4672 == null) {
                                class212.field3325[var3++] = 0;
                            } else {
                                class212.field3325[var3++] = class167.field2647;
                            }
                            continue;
                        }
                        if (var550 == 3613) {
                            var3--;
                            int var121 = class212.field3325[var3];
                            if (class301.field4672 != null && class167.field2647 > var121) {
                                class9.field127[var4++] = class13.field191[var121].field579;
                                continue;
                            }
                            class9.field127[var4++] = "";
                            continue;
                        }
                        if (var550 == 3614) {
                            var3--;
                            int var122 = class212.field3325[var3];
                            if (class301.field4672 != null && class167.field2647 > var122) {
                                class212.field3325[var3++] = class13.field191[var122].field577;
                                continue;
                            }
                            class212.field3325[var3++] = 0;
                            continue;
                        }
                        if (var550 == 3615) {
                            var3--;
                            int var123 = class212.field3325[var3];
                            if (class301.field4672 != null && var123 < class167.field2647) {
                                class212.field3325[var3++] = class13.field191[var123].field576;
                                continue;
                            }
                            class212.field3325[var3++] = 0;
                            continue;
                        }
                        if (var550 == 3616) {
                            class212.field3325[var3++] = class43.field687;
                            continue;
                        }
                        if (var550 == 3617) {
                            var4--;
                            String var124 = class9.field127[var4];
                            class138.method1147(var124, (byte) -22);
                            continue;
                        }
                        if (var550 == 3618) {
                            class212.field3325[var3++] = class49.field777;
                            continue;
                        }
                        if (var550 == 3619) {
                            var4--;
                            String var125 = class9.field127[var4];
                            class61.method617(var125, (byte) 41);
                            continue;
                        }
                        if (var550 == 3620) {
                            class246.method1851(20);
                            continue;
                        }
                        if (var550 == 3621) {
                            if (class303.field4722 == 0) {
                                class212.field3325[var3++] = -1;
                            } else {
                                class212.field3325[var3++] = class143.field2347;
                            }
                            continue;
                        }
                        if (var550 == 3622) {
                            var3--;
                            int var126 = class212.field3325[var3];
                            if (class303.field4722 != 0 && var126 < class143.field2347) {
                                class9.field127[var4++] = class168.field2669[var126];
                                if (class253.field3905[var126] == null) {
                                    class9.field127[var4++] = "";
                                } else {
                                    class9.field127[var4++] = class253.field3905[var126];
                                }
                                continue;
                            }
                            class9.field127[var4++] = "";
                            class9.field127[var4++] = "";
                            continue;
                        }
                        if (var550 == 3623) {
                            var4--;
                            String var127 = class9.field127[var4];
                            if (var127.startsWith("<img=0>") || var127.startsWith("<img=1>")) {
                                var127 = var127.substring(7);
                            }
                            class212.field3325[var3++] = class178.method1393((byte) 120, var127) ? 1 : 0;
                            continue;
                        }
                        if (var550 == 3624) {
                            var3--;
                            int var128 = class212.field3325[var3];
                            if (class13.field191 != null && class167.field2647 > var128 && class13.field191[var128].field581.equalsIgnoreCase(class173.field2746.field2706)) {
                                class212.field3325[var3++] = 1;
                                continue;
                            }
                            class212.field3325[var3++] = 0;
                            continue;
                        }
                        if (var550 == 3625) {
                            if (class284.field4405 == null) {
                                class9.field127[var4++] = "";
                            } else {
                                class9.field127[var4++] = class284.field4405;
                            }
                            continue;
                        }
                        if (var550 == 3626) {
                            var3--;
                            int var129 = class212.field3325[var3];
                            if (class301.field4672 != null && var129 < class167.field2647) {
                                class9.field127[var4++] = class13.field191[var129].field583;
                                continue;
                            }
                            class9.field127[var4++] = "";
                            continue;
                        }
                        if (var550 == 3627) {
                            var3--;
                            int var130 = class212.field3325[var3];
                            if (class303.field4722 == 2 && var130 >= 0 && class131.field2215 > var130) {
                                class212.field3325[var3++] = class13.field182[var130] ? 1 : 0;
                                continue;
                            }
                            class212.field3325[var3++] = 0;
                            continue;
                        }
                        if (var550 == 3628) {
                            var4--;
                            String var131 = class9.field127[var4];
                            if (var131.startsWith("<img=0>") || var131.startsWith("<img=1>")) {
                                var131 = var131.substring(7);
                            }
                            class212.field3325[var3++] = class191.method1458(var131, false);
                            continue;
                        }
                        if (var550 == 3629) {
                            class212.field3325[var3++] = class99.field1487;
                            continue;
                        }
                        if (var550 == 3630) {
                            var4--;
                            String var132 = class9.field127[var4];
                            class32.method342(0, var132, true);
                            continue;
                        }
                        if (var550 == 3631) {
                            var3--;
                            int var133 = class212.field3325[var3];
                            class212.field3325[var3++] = class159.field2535[var133] ? 1 : 0;
                            continue;
                        }
                        if (var550 == 3632) {
                            var3--;
                            int var134 = class212.field3325[var3];
                            if (class301.field4672 != null && class167.field2647 > var134) {
                                class9.field127[var4++] = class13.field191[var134].field581;
                                continue;
                            }
                            class9.field127[var4++] = "";
                            continue;
                        }
                        if (var550 == 3633) {
                            var3--;
                            int var135 = class212.field3325[var3];
                            if (class303.field4722 != 0 && class143.field2347 > var135) {
                                class9.field127[var4++] = class238.field3692[var135];
                                continue;
                            }
                            class9.field127[var4++] = "";
                            continue;
                        }
                    } else if (var550 < 4000) {
                        if (var550 == 3903) {
                            var3--;
                            int var466 = class212.field3325[var3];
                            class212.field3325[var3++] = class230.field3598[var466].method1959(-8);
                            continue;
                        }
                        if (var550 == 3904) {
                            var3--;
                            int var467 = class212.field3325[var3];
                            class212.field3325[var3++] = class230.field3598[var467].field4117;
                            continue;
                        }
                        if (var550 == 3905) {
                            var3--;
                            int var468 = class212.field3325[var3];
                            class212.field3325[var3++] = class230.field3598[var468].field4123;
                            continue;
                        }
                        if (var550 == 3906) {
                            var3--;
                            int var469 = class212.field3325[var3];
                            class212.field3325[var3++] = class230.field3598[var469].field4124;
                            continue;
                        }
                        if (var550 == 3907) {
                            var3--;
                            int var470 = class212.field3325[var3];
                            class212.field3325[var3++] = class230.field3598[var470].field4127;
                            continue;
                        }
                        if (var550 == 3908) {
                            var3--;
                            int var471 = class212.field3325[var3];
                            class212.field3325[var3++] = class230.field3598[var471].field4118;
                            continue;
                        }
                        if (var550 == 3910) {
                            var3--;
                            int var472 = class212.field3325[var3];
                            int var473 = class230.field3598[var472].method1958(7);
                            class212.field3325[var3++] = var473 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var550 == 3911) {
                            var3--;
                            int var474 = class212.field3325[var3];
                            int var475 = class230.field3598[var474].method1958(7);
                            class212.field3325[var3++] = var475 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var550 == 3912) {
                            var3--;
                            int var476 = class212.field3325[var3];
                            int var477 = class230.field3598[var476].method1958(7);
                            class212.field3325[var3++] = var477 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var550 == 3913) {
                            var3--;
                            int var478 = class212.field3325[var3];
                            int var479 = class230.field3598[var478].method1958(7);
                            class212.field3325[var3++] = var479 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var550 < 4100) {
                        if (var550 == 4000) {
                            var3 -= 2;
                            int var421 = class212.field3325[var3 + 1];
                            int var422 = class212.field3325[var3];
                            class212.field3325[var3++] = var421 + var422;
                            continue;
                        }
                        if (var550 == 4001) {
                            var3 -= 2;
                            int var423 = class212.field3325[var3];
                            int var424 = class212.field3325[var3 + 1];
                            class212.field3325[var3++] = var423 - var424;
                            continue;
                        }
                        if (var550 == 4002) {
                            var3 -= 2;
                            int var425 = class212.field3325[var3];
                            int var426 = class212.field3325[var3 + 1];
                            class212.field3325[var3++] = var425 * var426;
                            continue;
                        }
                        if (var550 == 4003) {
                            var3 -= 2;
                            int var427 = class212.field3325[var3];
                            int var428 = class212.field3325[var3 + 1];
                            class212.field3325[var3++] = var427 / var428;
                            continue;
                        }
                        if (var550 == 4004) {
                            var3--;
                            int var429 = class212.field3325[var3];
                            class212.field3325[var3++] = (int) (Math.random() * (double) var429);
                            continue;
                        }
                        if (var550 == 4005) {
                            var3--;
                            int var430 = class212.field3325[var3];
                            class212.field3325[var3++] = (int) ((double) (var430 + 1) * Math.random());
                            continue;
                        }
                        if (var550 == 4006) {
                            var3 -= 5;
                            int var431 = class212.field3325[var3 + 1];
                            int var432 = class212.field3325[var3];
                            int var433 = class212.field3325[var3 + 3];
                            int var434 = class212.field3325[var3 + 2];
                            int var435 = class212.field3325[var3 + 4];
                            class212.field3325[var3++] = (var431 - var432) * (var435 - var434) / (var433 - var434) + var432;
                            continue;
                        }
                        if (var550 == 4007) {
                            var3 -= 2;
                            long var436 = (long) class212.field3325[var3 + 1];
                            long var438 = (long) class212.field3325[var3];
                            class212.field3325[var3++] = (int) (var436 * var438 / 100L + var438);
                            continue;
                        }
                        if (var550 == 4008) {
                            var3 -= 2;
                            int var440 = class212.field3325[var3];
                            int var441 = class212.field3325[var3 + 1];
                            class212.field3325[var3++] = class41.method426(var440, 0x1 << var441);
                            continue;
                        }
                        if (var550 == 4009) {
                            var3 -= 2;
                            int var442 = class212.field3325[var3];
                            int var443 = class212.field3325[var3 + 1];
                            class212.field3325[var3++] = class301.method2169(-(0x1 << var443) - 1, var442);
                            continue;
                        }
                        if (var550 == 4010) {
                            var3 -= 2;
                            int var444 = class212.field3325[var3 + 1];
                            int var445 = class212.field3325[var3];
                            class212.field3325[var3++] = class301.method2169(0x1 << var444, var445) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var550 == 4011) {
                            var3 -= 2;
                            int var446 = class212.field3325[var3];
                            int var447 = class212.field3325[var3 + 1];
                            class212.field3325[var3++] = var446 % var447;
                            continue;
                        }
                        if (var550 == 4012) {
                            var3 -= 2;
                            int var448 = class212.field3325[var3];
                            int var449 = class212.field3325[var3 + 1];
                            if (var448 == 0) {
                                class212.field3325[var3++] = 0;
                            } else {
                                class212.field3325[var3++] = (int) Math.pow((double) var448, (double) var449);
                            }
                            continue;
                        }
                        if (var550 == 4013) {
                            var3 -= 2;
                            int var450 = class212.field3325[var3 + 1];
                            int var451 = class212.field3325[var3];
                            if (var451 == 0) {
                                class212.field3325[var3++] = 0;
                            } else if (var450 == 0) {
                                class212.field3325[var3++] = Integer.MAX_VALUE;
                            } else {
                                class212.field3325[var3++] = (int) Math.pow((double) var451, 1.0D / (double) var450);
                            }
                            continue;
                        }
                        if (var550 == 4014) {
                            var3 -= 2;
                            int var452 = class212.field3325[var3 + 1];
                            int var453 = class212.field3325[var3];
                            class212.field3325[var3++] = class301.method2169(var453, var452);
                            continue;
                        }
                        if (var550 == 4015) {
                            var3 -= 2;
                            int var454 = class212.field3325[var3 + 1];
                            int var455 = class212.field3325[var3];
                            class212.field3325[var3++] = class41.method426(var454, var455);
                            continue;
                        }
                        if (var550 == 4016) {
                            var3 -= 2;
                            int var456 = class212.field3325[var3];
                            int var457 = class212.field3325[var3 + 1];
                            class212.field3325[var3++] = var457 <= var456 ? var457 : var456;
                            continue;
                        }
                        if (var550 == 4017) {
                            var3 -= 2;
                            int var458 = class212.field3325[var3];
                            int var459 = class212.field3325[var3 + 1];
                            class212.field3325[var3++] = var459 >= var458 ? var459 : var458;
                            continue;
                        }
                        if (var550 == 4018) {
                            var3 -= 3;
                            long var460 = (long) class212.field3325[var3];
                            long var462 = (long) class212.field3325[var3 + 1];
                            long var464 = (long) class212.field3325[var3 + 2];
                            class212.field3325[var3++] = (int) (var460 * var464 / var462);
                            continue;
                        }
                    } else if (var550 < 4200) {
                        if (var550 == 4100) {
                            var3--;
                            int var136 = class212.field3325[var3];
                            var4--;
                            String var137 = class9.field127[var4];
                            class9.field127[var4++] = var137 + var136;
                            continue;
                        }
                        if (var550 == 4101) {
                            var4 -= 2;
                            String var138 = class9.field127[var4];
                            String var139 = class9.field127[var4 + 1];
                            class9.field127[var4++] = var138 + var139;
                            continue;
                        }
                        if (var550 == 4102) {
                            var4--;
                            String var140 = class9.field127[var4];
                            var3--;
                            int var141 = class212.field3325[var3];
                            class9.field127[var4++] = var140 + class231.method1732(true, var141, (byte) -118);
                            continue;
                        }
                        if (var550 == 4103) {
                            var4--;
                            String var142 = class9.field127[var4];
                            class9.field127[var4++] = var142.toLowerCase();
                            continue;
                        }
                        if (var550 == 4104) {
                            var3--;
                            int var143 = class212.field3325[var3];
                            long var144 = (long) var143 * 86400000L + 1014768000000L;
                            class201.field3103.setTime(new Date(var144));
                            int var146 = class201.field3103.get(5);
                            int var147 = class201.field3103.get(2);
                            int var148 = class201.field3103.get(1);
                            class9.field127[var4++] = var146 + "-" + class253.field3908[var147] + "-" + var148;
                            continue;
                        }
                        if (var550 == 4105) {
                            var4 -= 2;
                            String var149 = class9.field127[var4];
                            String var150 = class9.field127[var4 + 1];
                            if (class173.field2746.field2730 != null && class173.field2746.field2730.field3201) {
                                class9.field127[var4++] = var150;
                                continue;
                            }
                            class9.field127[var4++] = var149;
                            continue;
                        }
                        if (var550 == 4106) {
                            var3--;
                            int var151 = class212.field3325[var3];
                            class9.field127[var4++] = Integer.toString(var151);
                            continue;
                        }
                        if (var550 == 4107) {
                            var4 -= 2;
                            class212.field3325[var3++] = class66.method647(class278.method2036(class9.field127[var4 + 1], class339.field5211, class9.field127[var4], (byte) -91), true);
                            continue;
                        }
                        if (var550 == 4108) {
                            var3 -= 2;
                            var4--;
                            String var152 = class9.field127[var4];
                            int var153 = class212.field3325[var3 + 1];
                            int var154 = class212.field3325[var3];
                            class212.field3325[var3++] = class48.method471((byte) 42, var153).method1200(var152, var154);
                            continue;
                        }
                        if (var550 == 4109) {
                            var3 -= 2;
                            int var155 = class212.field3325[var3];
                            var4--;
                            String var156 = class9.field127[var4];
                            int var157 = class212.field3325[var3 + 1];
                            class212.field3325[var3++] = class48.method471((byte) 42, var157).method1193(var156, var155);
                            continue;
                        }
                        if (var550 == 4110) {
                            var4 -= 2;
                            String var158 = class9.field127[var4];
                            String var159 = class9.field127[var4 + 1];
                            var3--;
                            if (class212.field3325[var3] == 1) {
                                class9.field127[var4++] = var158;
                            } else {
                                class9.field127[var4++] = var159;
                            }
                            continue;
                        }
                        if (var550 == 4111) {
                            var4--;
                            String var160 = class9.field127[var4];
                            class9.field127[var4++] = class145.method1207(var160);
                            continue;
                        }
                        if (var550 == 4112) {
                            var4--;
                            String var161 = class9.field127[var4];
                            var3--;
                            int var162 = class212.field3325[var3];
                            if (var162 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class9.field127[var4++] = var161 + (char) var162;
                            continue;
                        }
                        if (var550 == 4113) {
                            var3--;
                            int var163 = class212.field3325[var3];
                            class212.field3325[var3++] = class231.method1735(-18360, (char) var163) ? 1 : 0;
                            continue;
                        }
                        if (var550 == 4114) {
                            var3--;
                            int var164 = class212.field3325[var3];
                            class212.field3325[var3++] = class194.method1480((byte) 5, (char) var164) ? 1 : 0;
                            continue;
                        }
                        if (var550 == 4115) {
                            var3--;
                            int var165 = class212.field3325[var3];
                            class212.field3325[var3++] = class235.method1757(0, (char) var165) ? 1 : 0;
                            continue;
                        }
                        if (var550 == 4116) {
                            var3--;
                            int var166 = class212.field3325[var3];
                            class212.field3325[var3++] = class186.method1435((byte) 3, (char) var166) ? 1 : 0;
                            continue;
                        }
                        if (var550 == 4117) {
                            var4--;
                            String var167 = class9.field127[var4];
                            if (var167 == null) {
                                class212.field3325[var3++] = 0;
                            } else {
                                class212.field3325[var3++] = var167.length();
                            }
                            continue;
                        }
                        if (var550 == 4118) {
                            var3 -= 2;
                            var4--;
                            String var168 = class9.field127[var4];
                            int var169 = class212.field3325[var3];
                            int var170 = class212.field3325[var3 + 1];
                            class9.field127[var4++] = var168.substring(var169, var170);
                            continue;
                        }
                        if (var550 == 4119) {
                            var4--;
                            String var171 = class9.field127[var4];
                            boolean var172 = false;
                            StringBuffer var173 = new StringBuffer(var171.length());
                            for (int var174 = 0; var171.length() > var174; var174++) {
                                char var175 = var171.charAt(var174);
                                if (var175 == '<') {
                                    var172 = true;
                                } else if (var175 == '>') {
                                    var172 = false;
                                } else if (!var172) {
                                    var173.append(var175);
                                }
                            }
                            class9.field127[var4++] = var173.toString();
                            continue;
                        }
                        if (var550 == 4120) {
                            var3 -= 2;
                            var4--;
                            String var176 = class9.field127[var4];
                            int var177 = class212.field3325[var3];
                            int var178 = class212.field3325[var3 + 1];
                            class212.field3325[var3++] = var176.indexOf(var177, var178);
                            continue;
                        }
                        if (var550 == 4121) {
                            var3--;
                            int var179 = class212.field3325[var3];
                            var4 -= 2;
                            String var180 = class9.field127[var4];
                            String var181 = class9.field127[var4 + 1];
                            class212.field3325[var3++] = var180.indexOf(var181, var179);
                            continue;
                        }
                        if (var550 == 4122) {
                            var3--;
                            int var182 = class212.field3325[var3];
                            class212.field3325[var3++] = Character.toLowerCase((char) var182);
                            continue;
                        }
                        if (var550 == 4123) {
                            var3--;
                            int var183 = class212.field3325[var3];
                            class212.field3325[var3++] = Character.toUpperCase((char) var183);
                            continue;
                        }
                        if (var550 == 4124) {
                            var3--;
                            boolean var184 = class212.field3325[var3] != 0;
                            var3--;
                            int var185 = class212.field3325[var3];
                            class9.field127[var4++] = class287.method2077((byte) 122, class339.field5211, (long) var185, 0, var184);
                            continue;
                        }
                    } else if (var550 < 4300) {
                        if (var550 == 4200) {
                            var3--;
                            int var402 = class212.field3325[var3];
                            class9.field127[var4++] = class48.method469(10, var402).field4058;
                            continue;
                        }
                        if (var550 == 4201) {
                            var3 -= 2;
                            int var403 = class212.field3325[var3];
                            int var404 = class212.field3325[var3 + 1];
                            class263 var405 = class48.method469(10, var403);
                            if (var404 >= 1 && var404 <= 5 && var405.field4034[var404 - 1] != null) {
                                class9.field127[var4++] = var405.field4034[var404 - 1];
                                continue;
                            }
                            class9.field127[var4++] = "";
                            continue;
                        }
                        if (var550 == 4202) {
                            var3 -= 2;
                            int var406 = class212.field3325[var3 + 1];
                            int var407 = class212.field3325[var3];
                            class263 var408 = class48.method469(10, var407);
                            if (var406 >= 1 && var406 <= 5 && var408.field4066[var406 - 1] != null) {
                                class9.field127[var4++] = var408.field4066[var406 - 1];
                                continue;
                            }
                            class9.field127[var4++] = "";
                            continue;
                        }
                        if (var550 == 4203) {
                            var3--;
                            int var409 = class212.field3325[var3];
                            class212.field3325[var3++] = class48.method469(10, var409).field4063;
                            continue;
                        }
                        if (var550 == 4204) {
                            var3--;
                            int var410 = class212.field3325[var3];
                            class212.field3325[var3++] = class48.method469(10, var410).field4030 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var550 == 4205) {
                            var3--;
                            int var411 = class212.field3325[var3];
                            class263 var412 = class48.method469(10, var411);
                            if (var412.field4062 == -1 && var412.field4023 >= 0) {
                                class212.field3325[var3++] = var412.field4023;
                                continue;
                            }
                            class212.field3325[var3++] = var411;
                            continue;
                        }
                        if (var550 == 4206) {
                            var3--;
                            int var413 = class212.field3325[var3];
                            class263 var414 = class48.method469(10, var413);
                            if (var414.field4062 >= 0 && var414.field4023 >= 0) {
                                class212.field3325[var3++] = var414.field4023;
                                continue;
                            }
                            class212.field3325[var3++] = var413;
                            continue;
                        }
                        if (var550 == 4207) {
                            var3--;
                            int var415 = class212.field3325[var3];
                            class212.field3325[var3++] = class48.method469(10, var415).field4095 ? 1 : 0;
                            continue;
                        }
                        if (var550 == 4208) {
                            var3 -= 2;
                            int var416 = class212.field3325[var3 + 1];
                            int var417 = class212.field3325[var3];
                            class140 var418 = class29.method331(var416, (byte) 3);
                            if (var418.method1171(true)) {
                                class9.field127[var4++] = class48.method469(10, var417).method1937(var416, var418.field2326, -104);
                            } else {
                                class212.field3325[var3++] = class48.method469(10, var417).method1932(0, var418.field2334, var416);
                            }
                            continue;
                        }
                        if (var550 == 4210) {
                            var3--;
                            int var419 = class212.field3325[var3];
                            var4--;
                            String var420 = class9.field127[var4];
                            class303.method2184(-1, var420, var419 == 1);
                            class212.field3325[var3++] = class29.field468;
                            continue;
                        }
                        if (var550 == 4211) {
                            if (class123.field1970 != null && class81.field1177 < class29.field468) {
                                class212.field3325[var3++] = class301.method2169(class123.field1970[class81.field1177++], 65535);
                                continue;
                            }
                            class212.field3325[var3++] = -1;
                            continue;
                        }
                        if (var550 == 4212) {
                            class81.field1177 = 0;
                            continue;
                        }
                    } else if (var550 < 4400) {
                        if (var550 == 4300) {
                            var3 -= 2;
                            int var186 = class212.field3325[var3 + 1];
                            int var187 = class212.field3325[var3];
                            class140 var188 = class29.method331(var186, (byte) 3);
                            if (var188.method1171(true)) {
                                class9.field127[var4++] = class343.method2417(var187, (byte) 116).method1123(true, var186, var188.field2326);
                            } else {
                                class212.field3325[var3++] = class343.method2417(var187, (byte) -78).method1117(-21354, var188.field2334, var186);
                            }
                            continue;
                        }
                    } else if (var550 >= 4500) {
                        if (var550 >= 4600) {
                            if (var550 < 5100) {
                                if (var550 == 5000) {
                                    class212.field3325[var3++] = class270.field4150;
                                    continue;
                                }
                                if (var550 == 5001) {
                                    var3 -= 3;
                                    class18.field273++;
                                    class270.field4150 = class212.field3325[var3];
                                    class81.field1184 = class212.field3325[var3 + 1];
                                    class243.field3787 = class212.field3325[var3 + 2];
                                    class99.field1491.method1628((byte) -50, 35);
                                    class99.field1491.method273(0, class270.field4150);
                                    class99.field1491.method273(0, class81.field1184);
                                    class99.field1491.method273(0, class243.field3787);
                                    continue;
                                }
                                if (var550 == 5002) {
                                    class163.field2589++;
                                    var4--;
                                    String var327 = class9.field127[var4];
                                    var3 -= 2;
                                    int var328 = class212.field3325[var3 + 1];
                                    int var329 = class212.field3325[var3];
                                    class99.field1491.method1628((byte) -64, 222);
                                    class99.field1491.method273(0, class34.method354(var327, (byte) 51) + 2);
                                    class99.field1491.method280(-18345, var327);
                                    class99.field1491.method273(0, var329 - 1);
                                    class99.field1491.method273(0, var328);
                                    continue;
                                }
                                if (var550 == 5003) {
                                    var3--;
                                    int var330 = class212.field3325[var3];
                                    String var331 = null;
                                    if (var330 < 100) {
                                        var331 = class234.field3648[var330];
                                    }
                                    if (var331 == null) {
                                        var331 = "";
                                    }
                                    class9.field127[var4++] = var331;
                                    continue;
                                }
                                if (var550 == 5004) {
                                    int var332 = -1;
                                    var3--;
                                    int var333 = class212.field3325[var3];
                                    if (var333 < 100 && class234.field3648[var333] != null) {
                                        var332 = class324.field4985[var333];
                                    }
                                    class212.field3325[var3++] = var332;
                                    continue;
                                }
                                if (var550 == 5005) {
                                    class212.field3325[var3++] = class81.field1184;
                                    continue;
                                }
                                if (var550 == 5008) {
                                    var4--;
                                    String var334 = class9.field127[var4];
                                    if (!var334.startsWith("::")) {
                                        if (class270.field4168 == 0 && (class175.field2772 && !class285.field4421 || class256.field3935)) {
                                            continue;
                                        }
                                        byte var335 = 0;
                                        class112.field1713++;
                                        String var336 = var334.toLowerCase();
                                        byte var337 = 0;
                                        if (var336.startsWith(class329.field5075)) {
                                            var335 = 0;
                                            var334 = var334.substring(class329.field5075.length());
                                        } else if (var336.startsWith(class79.field1144)) {
                                            var334 = var334.substring(class79.field1144.length());
                                            var335 = 1;
                                        } else if (var336.startsWith(class279.field4313)) {
                                            var335 = 2;
                                            var334 = var334.substring(class279.field4313.length());
                                        } else if (var336.startsWith(class298.field4627)) {
                                            var335 = 3;
                                            var334 = var334.substring(class298.field4627.length());
                                        } else if (var336.startsWith(class23.field351)) {
                                            var334 = var334.substring(class23.field351.length());
                                            var335 = 4;
                                        } else if (var336.startsWith(class46.field730)) {
                                            var335 = 5;
                                            var334 = var334.substring(class46.field730.length());
                                        } else if (var336.startsWith(class100.field1510)) {
                                            var334 = var334.substring(class100.field1510.length());
                                            var335 = 6;
                                        } else if (var336.startsWith(class86.field1237)) {
                                            var334 = var334.substring(class86.field1237.length());
                                            var335 = 7;
                                        } else if (var336.startsWith(class259.field3975)) {
                                            var334 = var334.substring(class259.field3975.length());
                                            var335 = 8;
                                        } else if (var336.startsWith(class221.field3436)) {
                                            var334 = var334.substring(class221.field3436.length());
                                            var335 = 9;
                                        } else if (var336.startsWith(class355.field5655)) {
                                            var335 = 10;
                                            var334 = var334.substring(class355.field5655.length());
                                        } else if (var336.startsWith(class244.field3808)) {
                                            var334 = var334.substring(class244.field3808.length());
                                            var335 = 11;
                                        } else if (class339.field5211 != 0) {
                                            if (var336.startsWith(class311.field4838)) {
                                                var334 = var334.substring(class311.field4838.length());
                                                var335 = 0;
                                            } else if (var336.startsWith(class268.field4132)) {
                                                var334 = var334.substring(class268.field4132.length());
                                                var335 = 1;
                                            } else if (var336.startsWith(class161.field2569)) {
                                                var334 = var334.substring(class161.field2569.length());
                                                var335 = 2;
                                            } else if (var336.startsWith(class278.field4293)) {
                                                var334 = var334.substring(class278.field4293.length());
                                                var335 = 3;
                                            } else if (var336.startsWith(class185.field2903)) {
                                                var334 = var334.substring(class185.field2903.length());
                                                var335 = 4;
                                            } else if (var336.startsWith(class175.field2770)) {
                                                var335 = 5;
                                                var334 = var334.substring(class175.field2770.length());
                                            } else if (var336.startsWith(class79.field1142)) {
                                                var335 = 6;
                                                var334 = var334.substring(class79.field1142.length());
                                            } else if (var336.startsWith(class208.field3204)) {
                                                var334 = var334.substring(class208.field3204.length());
                                                var335 = 7;
                                            } else if (var336.startsWith(class224.field3501)) {
                                                var334 = var334.substring(class224.field3501.length());
                                                var335 = 8;
                                            } else if (var336.startsWith(class94.field1441)) {
                                                var334 = var334.substring(class94.field1441.length());
                                                var335 = 9;
                                            } else if (var336.startsWith(class140.field2335)) {
                                                var335 = 10;
                                                var334 = var334.substring(class140.field2335.length());
                                            } else if (var336.startsWith(class163.field2598)) {
                                                var335 = 11;
                                                var334 = var334.substring(class163.field2598.length());
                                            }
                                        }
                                        String var338 = var334.toLowerCase();
                                        if (var338.startsWith(class300.field4645)) {
                                            var337 = 1;
                                            var334 = var334.substring(class300.field4645.length());
                                        } else if (var338.startsWith(class232.field3619)) {
                                            var337 = 2;
                                            var334 = var334.substring(class232.field3619.length());
                                        } else if (var338.startsWith(class87.field1251)) {
                                            var334 = var334.substring(class87.field1251.length());
                                            var337 = 3;
                                        } else if (var338.startsWith(class328.field5046)) {
                                            var334 = var334.substring(class328.field5046.length());
                                            var337 = 4;
                                        } else if (var338.startsWith(class20.field323)) {
                                            var334 = var334.substring(class20.field323.length());
                                            var337 = 5;
                                        } else if (class339.field5211 != 0) {
                                            if (var338.startsWith(class353.field5638)) {
                                                var334 = var334.substring(class353.field5638.length());
                                                var337 = 1;
                                            } else if (var338.startsWith(class340.field5231)) {
                                                var334 = var334.substring(class340.field5231.length());
                                                var337 = 2;
                                            } else if (var338.startsWith(class297.field4601)) {
                                                var337 = 3;
                                                var334 = var334.substring(class297.field4601.length());
                                            } else if (var338.startsWith(class284.field4397)) {
                                                var337 = 4;
                                                var334 = var334.substring(class284.field4397.length());
                                            } else if (var338.startsWith(class277.field4285)) {
                                                var334 = var334.substring(class277.field4285.length());
                                                var337 = 5;
                                            }
                                        }
                                        class99.field1491.method1628((byte) -87, 107);
                                        class99.field1491.method273(0, 0);
                                        int var339 = class99.field1491.field397;
                                        class99.field1491.method273(0, var335);
                                        class99.field1491.method273(0, var337);
                                        class233.method1747(class99.field1491, -99, var334);
                                        class99.field1491.method302(class99.field1491.field397 - var339, -119);
                                        continue;
                                    }
                                    class296.method2133(var334, (byte) -89);
                                    continue;
                                }
                                if (var550 == 5009) {
                                    var4 -= 2;
                                    String var340 = class9.field127[var4 + 1];
                                    String var341 = class9.field127[var4];
                                    if (class270.field4168 != 0 || (!class175.field2772 || class285.field4421) && !class256.field3935) {
                                        class66.field992++;
                                        class99.field1491.method1628((byte) -63, 94);
                                        class99.field1491.method273(0, 0);
                                        int var342 = class99.field1491.field397;
                                        class99.field1491.method280(-18345, var341);
                                        class233.method1747(class99.field1491, 63, var340);
                                        class99.field1491.method302(class99.field1491.field397 - var342, -112);
                                    }
                                    continue;
                                }
                                if (var550 == 5010) {
                                    String var343 = null;
                                    var3--;
                                    int var344 = class212.field3325[var3];
                                    if (var344 < 100) {
                                        var343 = class78.field1139[var344];
                                    }
                                    if (var343 == null) {
                                        var343 = "";
                                    }
                                    class9.field127[var4++] = var343;
                                    continue;
                                }
                                if (var550 == 5011) {
                                    String var345 = null;
                                    var3--;
                                    int var346 = class212.field3325[var3];
                                    if (var346 < 100) {
                                        var345 = class18.field305[var346];
                                    }
                                    if (var345 == null) {
                                        var345 = "";
                                    }
                                    class9.field127[var4++] = var345;
                                    continue;
                                }
                                if (var550 == 5012) {
                                    var3--;
                                    int var347 = class212.field3325[var3];
                                    int var348 = -1;
                                    if (var347 < 100) {
                                        var348 = class282.field4356[var347];
                                    }
                                    class212.field3325[var3++] = var348;
                                    continue;
                                }
                                if (var550 == 5015) {
                                    String var349;
                                    if (class173.field2746 == null || class173.field2746.field2719 == null) {
                                        var349 = class134.field2238;
                                    } else {
                                        var349 = class173.field2746.method1344(true, (byte) 2);
                                    }
                                    class9.field127[var4++] = var349;
                                    continue;
                                }
                                if (var550 == 5018) {
                                    var3--;
                                    int var350 = class212.field3325[var3];
                                    int var351 = 0;
                                    if (var350 < 100 && class234.field3648[var350] != null) {
                                        var351 = class324.field4985[var350];
                                    }
                                    class212.field3325[var3++] = var351;
                                    continue;
                                }
                                if (var550 == 5019) {
                                    var3--;
                                    int var352 = class212.field3325[var3];
                                    String var353 = null;
                                    if (var352 < 100) {
                                        var353 = class359.field5699[var352];
                                    }
                                    if (var353 == null) {
                                        var353 = "";
                                    }
                                    class9.field127[var4++] = var353;
                                    continue;
                                }
                                if (var550 == 5016) {
                                    class212.field3325[var3++] = class243.field3787;
                                    continue;
                                }
                                if (var550 == 5017) {
                                    class212.field3325[var3++] = class203.field3148;
                                    continue;
                                }
                                if (var550 == 5050) {
                                    var3--;
                                    int var354 = class212.field3325[var3];
                                    class9.field127[var4++] = class344.method2425(var354, false).field1776;
                                    continue;
                                }
                                if (var550 == 5051) {
                                    var3--;
                                    int var355 = class212.field3325[var3];
                                    class116 var356 = class344.method2425(var355, false);
                                    if (var356.field1782 == null) {
                                        class212.field3325[var3++] = 0;
                                    } else {
                                        class212.field3325[var3++] = var356.field1782.length;
                                    }
                                    continue;
                                }
                                if (var550 == 5052) {
                                    var3 -= 2;
                                    int var357 = class212.field3325[var3 + 1];
                                    int var358 = class212.field3325[var3];
                                    class116 var359 = class344.method2425(var358, false);
                                    int var360 = var359.field1782[var357];
                                    class212.field3325[var3++] = var360;
                                    continue;
                                }
                                if (var550 == 5053) {
                                    var3--;
                                    int var361 = class212.field3325[var3];
                                    class116 var362 = class344.method2425(var361, false);
                                    if (var362.field1775 == null) {
                                        class212.field3325[var3++] = 0;
                                    } else {
                                        class212.field3325[var3++] = var362.field1775.length;
                                    }
                                    continue;
                                }
                                if (var550 == 5054) {
                                    var3 -= 2;
                                    int var363 = class212.field3325[var3];
                                    int var364 = class212.field3325[var3 + 1];
                                    class212.field3325[var3++] = class344.method2425(var363, false).field1775[var364];
                                    continue;
                                }
                                if (var550 == 5055) {
                                    var3--;
                                    int var365 = class212.field3325[var3];
                                    class9.field127[var4++] = class359.method2520(var365, (byte) 96).method1018(-91);
                                    continue;
                                }
                                if (var550 == 5056) {
                                    var3--;
                                    int var366 = class212.field3325[var3];
                                    class119 var367 = class359.method2520(var366, (byte) -122);
                                    if (var367.field1834 == null) {
                                        class212.field3325[var3++] = 0;
                                    } else {
                                        class212.field3325[var3++] = var367.field1834.length;
                                    }
                                    continue;
                                }
                                if (var550 == 5057) {
                                    var3 -= 2;
                                    int var368 = class212.field3325[var3 + 1];
                                    int var369 = class212.field3325[var3];
                                    class212.field3325[var3++] = class359.method2520(var369, (byte) 49).field1834[var368];
                                    continue;
                                }
                                if (var550 == 5058) {
                                    class181.field2834 = new class204();
                                    var3--;
                                    class181.field2834.field3152 = class212.field3325[var3];
                                    class181.field2834.field3151 = class359.method2520(class181.field2834.field3152, (byte) -8);
                                    class181.field2834.field3154 = new int[class181.field2834.field3151.method1008(29109)];
                                    continue;
                                }
                                if (var550 == 5059) {
                                    class99.field1491.method1628((byte) -84, 168);
                                    class99.field1491.method273(0, 0);
                                    class37.field566++;
                                    int var370 = class99.field1491.field397;
                                    class99.field1491.method273(0, 0);
                                    class99.field1491.method304(false, class181.field2834.field3152);
                                    class181.field2834.field3151.method1011(class99.field1491, class181.field2834.field3154, 20);
                                    class99.field1491.method302(class99.field1491.field397 - var370, -127);
                                    continue;
                                }
                                if (var550 == 5060) {
                                    class207.field3186++;
                                    var4--;
                                    String var371 = class9.field127[var4];
                                    class99.field1491.method1628((byte) -24, 250);
                                    class99.field1491.method273(0, 0);
                                    int var372 = class99.field1491.field397;
                                    class99.field1491.method280(-18345, var371);
                                    class99.field1491.method304(false, class181.field2834.field3152);
                                    class181.field2834.field3151.method1011(class99.field1491, class181.field2834.field3154, 20);
                                    class99.field1491.method302(class99.field1491.field397 - var372, -93);
                                    continue;
                                }
                                if (var550 == 5061) {
                                    class37.field566++;
                                    class99.field1491.method1628((byte) -85, 168);
                                    class99.field1491.method273(0, 0);
                                    int var373 = class99.field1491.field397;
                                    class99.field1491.method273(0, 1);
                                    class99.field1491.method304(false, class181.field2834.field3152);
                                    class181.field2834.field3151.method1011(class99.field1491, class181.field2834.field3154, 20);
                                    class99.field1491.method302(class99.field1491.field397 - var373, -123);
                                    continue;
                                }
                                if (var550 == 5062) {
                                    var3 -= 2;
                                    int var374 = class212.field3325[var3];
                                    int var375 = class212.field3325[var3 + 1];
                                    class212.field3325[var3++] = class344.method2425(var374, false).field1785[var375];
                                    continue;
                                }
                                if (var550 == 5063) {
                                    var3 -= 2;
                                    int var376 = class212.field3325[var3];
                                    int var377 = class212.field3325[var3 + 1];
                                    class212.field3325[var3++] = class344.method2425(var376, false).field1781[var377];
                                    continue;
                                }
                                if (var550 == 5064) {
                                    var3 -= 2;
                                    int var378 = class212.field3325[var3];
                                    int var379 = class212.field3325[var3 + 1];
                                    if (var379 == -1) {
                                        class212.field3325[var3++] = -1;
                                    } else {
                                        class212.field3325[var3++] = class344.method2425(var378, false).method996((char) var379, (byte) -68);
                                    }
                                    continue;
                                }
                                if (var550 == 5065) {
                                    var3 -= 2;
                                    int var380 = class212.field3325[var3 + 1];
                                    int var381 = class212.field3325[var3];
                                    if (var380 == -1) {
                                        class212.field3325[var3++] = -1;
                                    } else {
                                        class212.field3325[var3++] = class344.method2425(var381, false).method1000((char) var380, -1);
                                    }
                                    continue;
                                }
                                if (var550 == 5066) {
                                    var3--;
                                    int var382 = class212.field3325[var3];
                                    class212.field3325[var3++] = class359.method2520(var382, (byte) 51).method1008(29109);
                                    continue;
                                }
                                if (var550 == 5067) {
                                    var3 -= 2;
                                    int var383 = class212.field3325[var3];
                                    int var384 = class212.field3325[var3 + 1];
                                    int var385 = class359.method2520(var383, (byte) -113).method1014(var384, -1);
                                    class212.field3325[var3++] = var385;
                                    continue;
                                }
                                if (var550 == 5068) {
                                    var3 -= 2;
                                    int var386 = class212.field3325[var3 + 1];
                                    int var387 = class212.field3325[var3];
                                    class181.field2834.field3154[var387] = var386;
                                    continue;
                                }
                                if (var550 == 5069) {
                                    var3 -= 2;
                                    int var388 = class212.field3325[var3];
                                    int var389 = class212.field3325[var3 + 1];
                                    class181.field2834.field3154[var388] = var389;
                                    continue;
                                }
                                if (var550 == 5070) {
                                    var3 -= 3;
                                    int var390 = class212.field3325[var3];
                                    int var391 = class212.field3325[var3 + 1];
                                    int var392 = class212.field3325[var3 + 2];
                                    class119 var393 = class359.method2520(var390, (byte) 58);
                                    if (var393.method1014(var391, -1) != 0) {
                                        throw new RuntimeException("bad command");
                                    }
                                    class212.field3325[var3++] = var393.method1006(var392, 11241, var391);
                                    continue;
                                }
                                if (var550 == 5071) {
                                    var4--;
                                    String var394 = class9.field127[var4];
                                    var3--;
                                    boolean var395 = class212.field3325[var3] == 1;
                                    class67.method662(-101, var395, var394);
                                    class212.field3325[var3++] = class29.field468;
                                    continue;
                                }
                                if (var550 == 5072) {
                                    if (class123.field1970 != null && class81.field1177 < class29.field468) {
                                        class212.field3325[var3++] = class301.method2169(65535, class123.field1970[class81.field1177++]);
                                        continue;
                                    }
                                    class212.field3325[var3++] = -1;
                                    continue;
                                }
                                if (var550 == 5073) {
                                    class81.field1177 = 0;
                                    continue;
                                }
                            } else if (var550 < 5200) {
                                if (var550 == 5100) {
                                    if (class116.field1774[86]) {
                                        class212.field3325[var3++] = 1;
                                    } else {
                                        class212.field3325[var3++] = 0;
                                    }
                                    continue;
                                }
                                if (var550 == 5101) {
                                    if (class116.field1774[82]) {
                                        class212.field3325[var3++] = 1;
                                    } else {
                                        class212.field3325[var3++] = 0;
                                    }
                                    continue;
                                }
                                if (var550 == 5102) {
                                    if (class116.field1774[81]) {
                                        class212.field3325[var3++] = 1;
                                    } else {
                                        class212.field3325[var3++] = 0;
                                    }
                                    continue;
                                }
                            } else if (var550 < 5300) {
                                if (var550 == 5200) {
                                    var3--;
                                    class101.method877(class212.field3325[var3], (byte) 31);
                                    continue;
                                }
                                if (var550 == 5201) {
                                    class212.field3325[var3++] = class239.method1775(true);
                                    continue;
                                }
                                if (var550 == 5205) {
                                    var3--;
                                    class85.method771(false, -1, class212.field3325[var3], -1, (byte) -116);
                                    continue;
                                }
                                if (var550 == 5206) {
                                    var3--;
                                    int var189 = class212.field3325[var3];
                                    class57 var190 = class351.method2467(var189 >> 14 & 0x3FFF, var189 & 0x3FFF);
                                    if (var190 == null) {
                                        class212.field3325[var3++] = -1;
                                    } else {
                                        class212.field3325[var3++] = var190.field885;
                                    }
                                    continue;
                                }
                                if (var550 == 5207) {
                                    var3--;
                                    class57 var191 = class351.method2474(class212.field3325[var3]);
                                    if (var191 != null && var191.field896 != null) {
                                        class9.field127[var4++] = var191.field896;
                                        continue;
                                    }
                                    class9.field127[var4++] = "";
                                    continue;
                                }
                                if (var550 == 5208) {
                                    class212.field3325[var3++] = class199.field3096;
                                    class212.field3325[var3++] = class207.field3192;
                                    continue;
                                }
                                if (var550 == 5209) {
                                    class212.field3325[var3++] = class351.field5592 + class335.field5120;
                                    class212.field3325[var3++] = class351.field5598 + class351.field5593 - class348.field5530 - 1;
                                    continue;
                                }
                                if (var550 == 5210) {
                                    var3--;
                                    int var192 = class212.field3325[var3];
                                    class57 var193 = class351.method2474(var192);
                                    if (var193 == null) {
                                        class212.field3325[var3++] = 0;
                                        class212.field3325[var3++] = 0;
                                    } else {
                                        class212.field3325[var3++] = class301.method2169(var193.field887, 268426982) >> 14;
                                        class212.field3325[var3++] = class301.method2169(16383, var193.field887);
                                    }
                                    continue;
                                }
                                if (var550 == 5211) {
                                    var3--;
                                    int var194 = class212.field3325[var3];
                                    class57 var195 = class351.method2474(var194);
                                    if (var195 == null) {
                                        class212.field3325[var3++] = 0;
                                        class212.field3325[var3++] = 0;
                                    } else {
                                        class212.field3325[var3++] = var195.field895 - var195.field904;
                                        class212.field3325[var3++] = var195.field888 - var195.field886;
                                    }
                                    continue;
                                }
                                if (var550 == 5212) {
                                    class22 var196 = class217.method1627((byte) 35);
                                    if (var196 == null) {
                                        class212.field3325[var3++] = -1;
                                        class212.field3325[var3++] = -1;
                                    } else {
                                        class212.field3325[var3++] = var196.field349;
                                        int var197 = class351.field5593 + class351.field5598 - var196.field348 - 1 | class351.field5592 + var196.field339 << 14 | var196.field344 << 28;
                                        class212.field3325[var3++] = var197;
                                    }
                                    continue;
                                }
                                if (var550 == 5213) {
                                    class22 var198 = class33.method344(0);
                                    if (var198 == null) {
                                        class212.field3325[var3++] = -1;
                                        class212.field3325[var3++] = -1;
                                    } else {
                                        class212.field3325[var3++] = var198.field349;
                                        int var199 = class351.field5598 + class351.field5593 - var198.field348 - 1 | class351.field5592 + var198.field339 << 14 | var198.field344 << 28;
                                        class212.field3325[var3++] = var199;
                                    }
                                    continue;
                                }
                                if (var550 == 5214) {
                                    var3--;
                                    int var200 = class212.field3325[var3];
                                    class57 var201 = class98.method866(false);
                                    if (var201 != null) {
                                        boolean var202 = var201.method568(var200 & 0x3FFF, var200 >> 14 & 0x3FFF, var200 >> 28 & 0x3, class339.field5216, (byte) 61);
                                        if (var202) {
                                            class118.method1004((byte) 117, class339.field5216[1], class339.field5216[2]);
                                        }
                                    }
                                    continue;
                                }
                                if (var550 == 5215) {
                                    var3 -= 2;
                                    int var203 = class212.field3325[var3];
                                    int var204 = class212.field3325[var3 + 1];
                                    class43 var205 = class351.method2482(var203 >> 14 & 0x3FFF, var203 & 0x3FFF);
                                    boolean var206 = false;
                                    for (class57 var207 = (class57) var205.method442((byte) -41); var207 != null; var207 = (class57) var205.method448(0)) {
                                        if (var207.field885 == var204) {
                                            var206 = true;
                                            break;
                                        }
                                    }
                                    if (var206) {
                                        class212.field3325[var3++] = 1;
                                    } else {
                                        class212.field3325[var3++] = 0;
                                    }
                                    continue;
                                }
                                if (var550 == 5218) {
                                    var3--;
                                    int var208 = class212.field3325[var3];
                                    class57 var209 = class351.method2474(var208);
                                    if (var209 == null) {
                                        class212.field3325[var3++] = -1;
                                    } else {
                                        class212.field3325[var3++] = var209.field891;
                                    }
                                    continue;
                                }
                                if (var550 == 5220) {
                                    class212.field3325[var3++] = class294.field4577 == 100 ? 1 : 0;
                                    continue;
                                }
                                if (var550 == 5221) {
                                    var3--;
                                    int var210 = class212.field3325[var3];
                                    class118.method1004((byte) 123, var210 >> 14 & 0x3FFF, var210 & 0x3FFF);
                                    continue;
                                }
                                if (var550 == 5222) {
                                    class57 var211 = class98.method866(false);
                                    if (var211 == null) {
                                        class212.field3325[var3++] = -1;
                                        class212.field3325[var3++] = -1;
                                    } else {
                                        boolean var212 = var211.method571(class339.field5216, class351.field5592 + class335.field5120, 2203, class351.field5598 + class351.field5593 - class348.field5530 - 1);
                                        if (var212) {
                                            class212.field3325[var3++] = class339.field5216[1];
                                            class212.field3325[var3++] = class339.field5216[2];
                                        } else {
                                            class212.field3325[var3++] = -1;
                                            class212.field3325[var3++] = -1;
                                        }
                                    }
                                    continue;
                                }
                                if (var550 == 5223) {
                                    var3 -= 2;
                                    int var213 = class212.field3325[var3 + 1];
                                    int var214 = class212.field3325[var3];
                                    class85.method771(false, (var213 & 0xFFFD5F1) >> 14, var214, var213 & 0x3FFF, (byte) -113);
                                    continue;
                                }
                                if (var550 == 5224) {
                                    var3--;
                                    int var215 = class212.field3325[var3];
                                    class57 var216 = class98.method866(false);
                                    if (var216 == null) {
                                        class212.field3325[var3++] = -1;
                                        class212.field3325[var3++] = -1;
                                    } else {
                                        boolean var217 = var216.method568(var215 & 0x3FFF, var215 >> 14 & 0x3FFF, var215 >> 28 & 0x3, class339.field5216, (byte) 93);
                                        if (var217) {
                                            class212.field3325[var3++] = class339.field5216[1];
                                            class212.field3325[var3++] = class339.field5216[2];
                                        } else {
                                            class212.field3325[var3++] = -1;
                                            class212.field3325[var3++] = -1;
                                        }
                                    }
                                    continue;
                                }
                                if (var550 == 5225) {
                                    var3--;
                                    int var218 = class212.field3325[var3];
                                    class57 var219 = class98.method866(false);
                                    if (var219 == null) {
                                        class212.field3325[var3++] = -1;
                                        class212.field3325[var3++] = -1;
                                    } else {
                                        boolean var220 = var219.method571(class339.field5216, (var218 & 0xFFFC833) >> 14, 2203, var218 & 0x3FFF);
                                        if (var220) {
                                            class212.field3325[var3++] = class339.field5216[1];
                                            class212.field3325[var3++] = class339.field5216[2];
                                        } else {
                                            class212.field3325[var3++] = -1;
                                            class212.field3325[var3++] = -1;
                                        }
                                    }
                                    continue;
                                }
                                if (var550 == 5226) {
                                    var3--;
                                    class171.method1353((byte) 60, class212.field3325[var3]);
                                    continue;
                                }
                                if (var550 == 5227) {
                                    var3 -= 2;
                                    int var221 = class212.field3325[var3 + 1];
                                    int var222 = class212.field3325[var3];
                                    class85.method771(true, (var221 & 0xFFFF317) >> 14, var222, var221 & 0x3FFF, (byte) -109);
                                    continue;
                                }
                                if (var550 == 5228) {
                                    var3--;
                                    class334.field5111 = class212.field3325[var3] == 1;
                                    continue;
                                }
                                if (var550 == 5229) {
                                    class212.field3325[var3++] = class334.field5111 ? 1 : 0;
                                    continue;
                                }
                                if (var550 == 5230) {
                                    var3--;
                                    int var223 = class212.field3325[var3];
                                    class126.method1090((byte) -106, var223);
                                    continue;
                                }
                                if (var550 == 5231) {
                                    var3 -= 2;
                                    int var224 = class212.field3325[var3];
                                    boolean var225 = class212.field3325[var3 + 1] == 1;
                                    if (class301.field4683 == null) {
                                        continue;
                                    }
                                    class172 var226 = class301.field4683.method370((byte) -120, (long) var224);
                                    if (var226 != null && !var225) {
                                        var226.method1357(947647010);
                                        continue;
                                    }
                                    if (var226 == null && var225) {
                                        class172 var227 = new class172();
                                        class301.field4683.method375(var227, (long) var224, -100);
                                    }
                                    continue;
                                }
                                if (var550 == 5232) {
                                    var3--;
                                    int var228 = class212.field3325[var3];
                                    if (class301.field4683 == null) {
                                        class212.field3325[var3++] = 0;
                                    } else {
                                        class172 var229 = class301.field4683.method370((byte) -120, (long) var228);
                                        class212.field3325[var3++] = var229 == null ? 0 : 1;
                                    }
                                    continue;
                                }
                                if (var550 == 5233) {
                                    var3 -= 2;
                                    int var230 = class212.field3325[var3];
                                    boolean var231 = class212.field3325[var3 + 1] == 1;
                                    if (class50.field783 == null) {
                                        continue;
                                    }
                                    class172 var232 = class50.field783.method370((byte) -120, (long) var230);
                                    if (var232 != null && !var231) {
                                        var232.method1357(947647010);
                                        continue;
                                    }
                                    if (var232 == null && var231) {
                                        class172 var233 = new class172();
                                        class50.field783.method375(var233, (long) var230, -116);
                                    }
                                    continue;
                                }
                                if (var550 == 5234) {
                                    var3--;
                                    int var234 = class212.field3325[var3];
                                    if (class50.field783 == null) {
                                        class212.field3325[var3++] = 0;
                                    } else {
                                        class172 var235 = class50.field783.method370((byte) -120, (long) var234);
                                        class212.field3325[var3++] = var235 == null ? 0 : 1;
                                    }
                                    continue;
                                }
                                if (var550 == 5235) {
                                    class212.field3325[var3++] = class351.field5602 == null ? -1 : class351.field5602.field885;
                                    continue;
                                }
                            } else if (var550 < 5400) {
                                if (var550 == 5300) {
                                    var3 -= 2;
                                    int var236 = class212.field3325[var3 + 1];
                                    int var237 = class212.field3325[var3];
                                    class207.method1543(var236, 81, false, var237, 3);
                                    class212.field3325[var3++] = class212.field3321 == null ? 0 : 1;
                                    continue;
                                }
                                if (var550 == 5301) {
                                    if (class212.field3321 != null) {
                                        class207.method1543(-1, 20, false, -1, class123.field1968);
                                    }
                                    continue;
                                }
                                if (var550 == 5302) {
                                    class356[] var238 = class245.method1849((byte) -106);
                                    class212.field3325[var3++] = var238.length;
                                    continue;
                                }
                                if (var550 == 5303) {
                                    var3--;
                                    int var239 = class212.field3325[var3];
                                    class356[] var240 = class245.method1849((byte) -107);
                                    class212.field3325[var3++] = var240[var239].field5662;
                                    class212.field3325[var3++] = var240[var239].field5664;
                                    continue;
                                }
                                if (var550 == 5305) {
                                    int var241 = class134.field2245;
                                    int var242 = class68.field1047;
                                    int var243 = -1;
                                    class356[] var244 = class245.method1849((byte) 73);
                                    for (int var245 = 0; var245 < var244.length; var245++) {
                                        class356 var246 = var244[var245];
                                        if (var246.field5662 == var242 && var246.field5664 == var241) {
                                            var243 = var245;
                                            break;
                                        }
                                    }
                                    class212.field3325[var3++] = var243;
                                    continue;
                                }
                                if (var550 == 5306) {
                                    class212.field3325[var3++] = class113.method969(1);
                                    continue;
                                }
                                if (var550 == 5307) {
                                    var3--;
                                    int var247 = class212.field3325[var3];
                                    if (var247 < 0 || var247 > 2) {
                                        var247 = 0;
                                    }
                                    class207.method1543(-1, 15, false, -1, var247);
                                    continue;
                                }
                                if (var550 == 5308) {
                                    class212.field3325[var3++] = class123.field1968;
                                    continue;
                                }
                                if (var550 == 5309) {
                                    var3--;
                                    int var248 = class212.field3325[var3];
                                    if (var248 < 0 || var248 > 2) {
                                        var248 = 0;
                                    }
                                    class123.field1968 = var248;
                                    class235.method1756(false, class340.field5234);
                                    continue;
                                }
                            } else if (var550 < 5500) {
                                if (var550 == 5400) {
                                    var4 -= 2;
                                    String var305 = class9.field127[var4 + 1];
                                    var3--;
                                    int var306 = class212.field3325[var3];
                                    String var307 = class9.field127[var4];
                                    class99.field1491.method1628((byte) -103, 246);
                                    class99.field1491.method273(0, class34.method354(var307, (byte) 51) + class34.method354(var305, (byte) 51) + 1);
                                    class318.field4900++;
                                    class99.field1491.method280(-18345, var307);
                                    class99.field1491.method280(-18345, var305);
                                    class99.field1491.method273(0, var306);
                                    continue;
                                }
                                if (var550 == 5401) {
                                    var3 -= 2;
                                    class3.field28[class212.field3325[var3]] = (short) class290.method2099((byte) -105, class212.field3325[var3 + 1]);
                                    class165.method1316(-126);
                                    class166.method1325(-1);
                                    class146.method1221(-32463);
                                    class319.method2256((byte) -69);
                                    class101.method880(0);
                                    continue;
                                }
                                if (var550 == 5405) {
                                    var3 -= 2;
                                    int var308 = class212.field3325[var3 + 1];
                                    int var309 = class212.field3325[var3];
                                    if (var309 >= 0 && var309 < 2) {
                                        class78.field1137[var309] = new int[var308 << 1][4];
                                    }
                                    continue;
                                }
                                if (var550 == 5406) {
                                    var3 -= 7;
                                    int var310 = class212.field3325[var3];
                                    int var311 = class212.field3325[var3 + 1] << 1;
                                    int var312 = class212.field3325[var3 + 2];
                                    int var313 = class212.field3325[var3 + 3];
                                    int var314 = class212.field3325[var3 + 4];
                                    int var315 = class212.field3325[var3 + 5];
                                    int var316 = class212.field3325[var3 + 6];
                                    if (var310 >= 0 && var310 < 2 && class78.field1137[var310] != null && var311 >= 0 && class78.field1137[var310].length > var311) {
                                        class78.field1137[var310][var311] = new int[] { class301.method2169(var312 >> 14, 16383) * 128, var313, class301.method2169(16383, var312) * 128, var316 };
                                        class78.field1137[var310][var311 + 1] = new int[] { (class301.method2169(var314, 268424844) >> 14) * 128, var315, class301.method2169(var314, 16383) * 128 };
                                    }
                                    continue;
                                }
                                if (var550 == 5407) {
                                    var3--;
                                    int var317 = class78.field1137[class212.field3325[var3]].length >> 1;
                                    class212.field3325[var3++] = var317;
                                    continue;
                                }
                                if (var550 == 5411) {
                                    if (class212.field3321 != null) {
                                        class207.method1543(-1, 89, false, -1, class123.field1968);
                                    }
                                    if (class67.field1028 == null) {
                                        class33.method343(class332.method2342(-2490), 0, false);
                                    } else {
                                        System.exit(0);
                                    }
                                    continue;
                                }
                                if (var550 == 5419) {
                                    String var318 = "";
                                    if (class239.field3717 != null) {
                                        if (class239.field3717.field1446 == null) {
                                            var318 = class72.method681((byte) -2, class239.field3717.field1444);
                                        } else {
                                            var318 = (String) class239.field3717.field1446;
                                        }
                                    }
                                    class9.field127[var4++] = var318;
                                    continue;
                                }
                                if (var550 == 5420) {
                                    class212.field3325[var3++] = class323.field4971 == 3 ? 1 : 0;
                                    continue;
                                }
                                if (var550 == 5421) {
                                    if (class212.field3321 != null) {
                                        class207.method1543(-1, 37, false, -1, class123.field1968);
                                    }
                                    var4--;
                                    String var319 = class9.field127[var4];
                                    var3--;
                                    boolean var320 = class212.field3325[var3] == 1;
                                    String var321 = class332.method2342(-2490) + var319;
                                    if (class67.field1028 != null || var320 && class323.field4971 != 3 && class323.field4961.startsWith("win") && !class181.field2833) {
                                        class58.field912 = var321;
                                        class62.field954 = var320;
                                        class74.field1097 = class340.field5234.method2284((byte) -107, var321);
                                        continue;
                                    }
                                    class33.method343(var321, 0, var320);
                                    continue;
                                }
                                if (var550 == 5422) {
                                    var4 -= 2;
                                    String var322 = class9.field127[var4];
                                    String var323 = class9.field127[var4 + 1];
                                    var3--;
                                    int var324 = class212.field3325[var3];
                                    if (var322.length() > 0) {
                                        if (class128.field2127 == null) {
                                            class128.field2127 = new String[class308.field4763[class165.field2629]];
                                        }
                                        class128.field2127[var324] = var322;
                                    }
                                    if (var323.length() > 0) {
                                        if (class283.field4380 == null) {
                                            class283.field4380 = new String[class308.field4763[class165.field2629]];
                                        }
                                        class283.field4380[var324] = var323;
                                    }
                                    continue;
                                }
                                if (var550 == 5423) {
                                    var4--;
                                    System.out.println(class9.field127[var4]);
                                    continue;
                                }
                                if (var550 == 5424) {
                                    var3 -= 11;
                                    class214.field3351 = class212.field3325[var3];
                                    class129.field2136 = class212.field3325[var3 + 1];
                                    class206.field3172 = class212.field3325[var3 + 2];
                                    class283.field4384 = class212.field3325[var3 + 3];
                                    class33.field501 = class212.field3325[var3 + 4];
                                    class264.field4107 = class212.field3325[var3 + 5];
                                    class306.field4749 = class212.field3325[var3 + 6];
                                    class170.field2692 = class212.field3325[var3 + 7];
                                    class284.field4415 = class212.field3325[var3 + 8];
                                    class304.field4735 = class212.field3325[var3 + 9];
                                    class348.field5533 = class212.field3325[var3 + 10];
                                    class303.field4725.method199(2209, class33.field501);
                                    class303.field4725.method199(2209, class264.field4107);
                                    class303.field4725.method199(2209, class306.field4749);
                                    class303.field4725.method199(2209, class170.field2692);
                                    class303.field4725.method199(2209, class284.field4415);
                                    class149.field2444 = true;
                                    continue;
                                }
                                if (var550 == 5425) {
                                    class317.method2239(4);
                                    class149.field2444 = false;
                                    continue;
                                }
                                if (var550 == 5426) {
                                    var3--;
                                    class155.field2502 = class212.field3325[var3];
                                    continue;
                                }
                                if (var550 == 5427) {
                                    var3 -= 2;
                                    class221.field3440 = class212.field3325[var3];
                                    class329.field5057 = class212.field3325[var3 + 1];
                                    continue;
                                }
                                if (var550 == 5428) {
                                    var3 -= 2;
                                    int var325 = class212.field3325[var3];
                                    int var326 = class212.field3325[var3 + 1];
                                    class212.field3325[var3++] = class131.method1128(var326, 23640, var325) ? 1 : 0;
                                    continue;
                                }
                            } else if (var550 < 5600) {
                                if (var550 == 5500) {
                                    var3 -= 4;
                                    int var288 = class212.field3325[var3];
                                    int var289 = class212.field3325[var3 + 2];
                                    int var290 = class212.field3325[var3 + 1];
                                    int var291 = class212.field3325[var3 + 3];
                                    class362.method2548(false, (var288 & 0x3FFF) - class49.field755, (var288 >> 14 & 0x3FFF) + -field5696, false, var290, var291, var289);
                                    continue;
                                }
                                if (var550 == 5501) {
                                    var3 -= 4;
                                    int var292 = class212.field3325[var3];
                                    int var293 = class212.field3325[var3 + 1];
                                    int var294 = class212.field3325[var3 + 2];
                                    int var295 = class212.field3325[var3 + 3];
                                    class128.method1112(((var292 & 0xFFFD761) >> 14) - field5696, -384, (var292 & 0x3FFF) - class49.field755, var294, var295, var293);
                                    continue;
                                }
                                if (var550 == 5502) {
                                    var3 -= 6;
                                    int var296 = class212.field3325[var3];
                                    if (var296 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class155.field2501 = var296;
                                    int var297 = class212.field3325[var3 + 1];
                                    if ((class78.field1137[class155.field2501].length >> 1) <= (var297 + 1)) {
                                        throw new RuntimeException();
                                    }
                                    class362.field5725 = var297;
                                    class209.field3215 = 0;
                                    class162.field2582 = class212.field3325[var3 + 2];
                                    class205.field3164 = class212.field3325[var3 + 3];
                                    int var298 = class212.field3325[var3 + 4];
                                    if (var298 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class345.field5481 = var298;
                                    int var299 = class212.field3325[var3 + 5];
                                    if ((class78.field1137[class345.field5481].length >> 1) <= (var299 + 1)) {
                                        throw new RuntimeException();
                                    }
                                    class264.field4111 = var299;
                                    class314.field4858 = 3;
                                    continue;
                                }
                                if (var550 == 5503) {
                                    class72.method682(-1);
                                    continue;
                                }
                                if (var550 == 5504) {
                                    var3 -= 2;
                                    class105.method912((byte) -35, class212.field3325[var3 + 1], class212.field3325[var3]);
                                    continue;
                                }
                                if (var550 == 5505) {
                                    class212.field3325[var3++] = (int) class279.field4312;
                                    continue;
                                }
                                if (var550 == 5506) {
                                    class212.field3325[var3++] = (int) class313.field4846;
                                    continue;
                                }
                                if (var550 == 5507) {
                                    class177.method1382(-16);
                                    continue;
                                }
                                if (var550 == 5508) {
                                    class64.method631(-16);
                                    continue;
                                }
                                if (var550 == 5509) {
                                    class277.method2032(-27816);
                                    continue;
                                }
                                if (var550 == 5510) {
                                    class345.method2430(true);
                                    continue;
                                }
                                if (var550 == 5511) {
                                    var3--;
                                    int var300 = class212.field3325[var3];
                                    class314.field4858 = 4;
                                    int var301 = (var300 & 0xFFFEE0B) >> 14;
                                    int var302 = var301 - field5696;
                                    if (var302 < 0) {
                                        var302 = 0;
                                    } else if (var302 >= 104) {
                                        var302 = 104;
                                    }
                                    class64.field979 = var302 * 128 + 64;
                                    int var303 = var300 & 0x3FFF;
                                    int var304 = var303 - class49.field755;
                                    if (var304 < 0) {
                                        var304 = 0;
                                    } else if (var304 >= 104) {
                                        var304 = 104;
                                    }
                                    class62.field950 = var304 * 128 + 64;
                                    continue;
                                }
                                if (var550 == 5512) {
                                    class82.method741((byte) -55);
                                    continue;
                                }
                            } else if (var550 < 5700) {
                                if (var550 == 5600) {
                                    var4 -= 2;
                                    String var284 = class9.field127[var4];
                                    var3--;
                                    int var285 = class212.field3325[var3];
                                    String var286 = class9.field127[var4 + 1];
                                    if (class295.field4578 == 10 && class87.field1246 == 0 && class290.field4509 == 0 && class129.field2139 == 0 && class111.field1697 == 0) {
                                        class42.method430(var284, 0, var285, var286);
                                    }
                                    continue;
                                }
                                if (var550 == 5601) {
                                    class15.method162(0);
                                    continue;
                                }
                                if (var550 == 5602) {
                                    if (class290.field4509 == 0) {
                                        class248.field3849 = -2;
                                    }
                                    continue;
                                }
                                if (var550 == 5603) {
                                    var3 -= 4;
                                    if (class295.field4578 == 10 && class87.field1246 == 0 && class290.field4509 == 0 && class129.field2139 == 0 && class111.field1697 == 0) {
                                        class76.method701(class212.field3325[var3 + 2], class212.field3325[var3 + 3], 78, class212.field3325[var3 + 1], class212.field3325[var3]);
                                    }
                                    continue;
                                }
                                if (var550 == 5604) {
                                    var4--;
                                    if (class295.field4578 == 10 && class87.field1246 == 0 && class290.field4509 == 0 && class129.field2139 == 0 && class111.field1697 == 0) {
                                        class44.method449(client.method1025(768, class9.field127[var4]), false);
                                    }
                                    continue;
                                }
                                if (var550 == 5605) {
                                    var3 -= 7;
                                    var4 -= 3;
                                    if (class295.field4578 == 10 && class87.field1246 == 0 && class290.field4509 == 0 && class129.field2139 == 0 && class111.field1697 == 0) {
                                        class264.method1954(class212.field3325[var3 + 1], -27574, ~class212.field3325[var3 + 4] == -2, class212.field3325[var3 + 6] == 1, class212.field3325[var3], class212.field3325[var3 + 2], class9.field127[var4 + 2], class9.field127[var4 + 1], client.method1025(768, class9.field127[var4]), class212.field3325[var3 + 3], class212.field3325[var3 + 5] == 1);
                                    }
                                    continue;
                                }
                                if (var550 == 5606) {
                                    if (class129.field2139 == 0) {
                                        class135.field2261 = -2;
                                    }
                                    continue;
                                }
                                if (var550 == 5607) {
                                    class212.field3325[var3++] = class248.field3849;
                                    continue;
                                }
                                if (var550 == 5608) {
                                    class212.field3325[var3++] = class221.field3439;
                                    continue;
                                }
                                if (var550 == 5609) {
                                    class212.field3325[var3++] = class135.field2261;
                                    continue;
                                }
                                if (var550 == 5610) {
                                    for (int var287 = 0; var287 < 5; var287++) {
                                        class9.field127[var4++] = var287 < class36.field538.length ? class362.method2546(136, class36.field538[var287]) : "";
                                    }
                                    class36.field538 = null;
                                    continue;
                                }
                                if (var550 == 5611) {
                                    class212.field3325[var3++] = class222.field3447;
                                    continue;
                                }
                            } else if (var550 < 6100) {
                                if (var550 == 6001) {
                                    var3--;
                                    int var274 = class212.field3325[var3];
                                    if (var274 < 1) {
                                        var274 = 1;
                                    }
                                    if (var274 > 4) {
                                        var274 = 4;
                                    }
                                    class139.field2321 = var274;
                                    if (!class240.field3737 || !class59.field927) {
                                        if (class139.field2321 == 1) {
                                            class107.method929(0.9F);
                                        }
                                        if (class139.field2321 == 2) {
                                            class107.method929(0.8F);
                                        }
                                        if (class139.field2321 == 3) {
                                            class107.method929(0.7F);
                                        }
                                        if (class139.field2321 == 4) {
                                            class107.method929(0.6F);
                                        }
                                    }
                                    if (class240.field3737) {
                                        class168.method1334(true);
                                        if (!class59.field927) {
                                            class321.method2265(-115);
                                        }
                                    }
                                    class166.method1325(-1);
                                    class235.method1756(false, class340.field5234);
                                    class258.field3951 = false;
                                    continue;
                                }
                                if (var550 == 6002) {
                                    var3--;
                                    class109.method953(class212.field3325[var3] == 1, (byte) -102);
                                    class143.method1183(31);
                                    class321.method2265(-119);
                                    class318.method2246((byte) 0);
                                    class235.method1756(false, class340.field5234);
                                    class258.field3951 = false;
                                    continue;
                                }
                                if (var550 == 6003) {
                                    var3--;
                                    class274.field4252 = class212.field3325[var3] == 1;
                                    class318.method2246((byte) 0);
                                    class235.method1756(false, class340.field5234);
                                    class258.field3951 = false;
                                    continue;
                                }
                                if (var550 == 6005) {
                                    var3--;
                                    class327.field5034 = class212.field3325[var3] == 1;
                                    class321.method2265(-114);
                                    class235.method1756(false, class340.field5234);
                                    class258.field3951 = false;
                                    continue;
                                }
                                if (var550 == 6006) {
                                    var3--;
                                    class121.field1878 = class212.field3325[var3] == 1;
                                    ((class224) class107.field1619).method1678((byte) -90, !class121.field1878);
                                    class235.method1756(false, class340.field5234);
                                    class258.field3951 = false;
                                    continue;
                                }
                                if (var550 == 6007) {
                                    var3--;
                                    class86.field1241 = class212.field3325[var3] == 1;
                                    class235.method1756(false, class340.field5234);
                                    class258.field3951 = false;
                                    continue;
                                }
                                if (var550 == 6008) {
                                    var3--;
                                    class108.field1626 = class212.field3325[var3] == 1;
                                    class235.method1756(false, class340.field5234);
                                    class258.field3951 = false;
                                    continue;
                                }
                                if (var550 == 6009) {
                                    var3--;
                                    class290.field4504 = class212.field3325[var3] == 1;
                                    class235.method1756(false, class340.field5234);
                                    class258.field3951 = false;
                                    continue;
                                }
                                if (var550 == 6010) {
                                    var3--;
                                    class101.field1529 = class212.field3325[var3] == 1;
                                    class235.method1756(false, class340.field5234);
                                    class258.field3951 = false;
                                    continue;
                                }
                                if (var550 == 6011) {
                                    var3--;
                                    int var275 = class212.field3325[var3];
                                    if (var275 < 0 || var275 > 2) {
                                        var275 = 0;
                                    }
                                    class19.field311 = var275;
                                    class235.method1756(false, class340.field5234);
                                    class258.field3951 = false;
                                    continue;
                                }
                                if (var550 == 6012) {
                                    if (class240.field3737) {
                                        class211.method1562(0, 0, -46);
                                    }
                                    var3--;
                                    class59.field927 = class212.field3325[var3] == 1;
                                    if (class240.field3737 && class59.field927) {
                                        class107.method929(0.7F);
                                    } else {
                                        if (class139.field2321 == 1) {
                                            class107.method929(0.9F);
                                        }
                                        if (class139.field2321 == 2) {
                                            class107.method929(0.8F);
                                        }
                                        if (class139.field2321 == 3) {
                                            class107.method929(0.7F);
                                        }
                                        if (class139.field2321 == 4) {
                                            class107.method929(0.6F);
                                        }
                                    }
                                    class321.method2265(-128);
                                    class235.method1756(false, class340.field5234);
                                    class258.field3951 = false;
                                    continue;
                                }
                                if (var550 == 6014) {
                                    var3--;
                                    class164.field2603 = class212.field3325[var3] == 1;
                                    if (class240.field3737) {
                                        class321.method2265(-116);
                                    }
                                    class235.method1756(false, class340.field5234);
                                    class258.field3951 = false;
                                    continue;
                                }
                                if (var550 == 6015) {
                                    var3--;
                                    class343.field5451 = class212.field3325[var3] == 1;
                                    if (class240.field3737) {
                                        class168.method1334(true);
                                    }
                                    class235.method1756(false, class340.field5234);
                                    class258.field3951 = false;
                                    continue;
                                }
                                if (var550 == 6016) {
                                    var3--;
                                    int var276 = class212.field3325[var3];
                                    if (class240.field3737) {
                                        class309.field4776 = true;
                                    }
                                    if (var276 < 0 || var276 > 2) {
                                        var276 = 0;
                                    }
                                    class271.field4194 = var276;
                                    continue;
                                }
                                if (var550 == 6017) {
                                    var3--;
                                    class110.field1686 = class212.field3325[var3] == 1;
                                    class157.method1275((byte) -127);
                                    class235.method1756(false, class340.field5234);
                                    class258.field3951 = false;
                                    continue;
                                }
                                if (var550 == 6018) {
                                    var3--;
                                    int var277 = class212.field3325[var3];
                                    if (var277 < 0) {
                                        var277 = 0;
                                    }
                                    if (var277 > 127) {
                                        var277 = 127;
                                    }
                                    class224.field3509 = var277;
                                    class235.method1756(false, class340.field5234);
                                    class258.field3951 = false;
                                    continue;
                                }
                                if (var550 == 6019) {
                                    var3--;
                                    int var278 = class212.field3325[var3];
                                    if (var278 < 0) {
                                        var278 = 0;
                                    }
                                    if (var278 > 255) {
                                        var278 = 255;
                                    }
                                    if (class239.field3720 != var278) {
                                        if (class239.field3720 == 0 && class327.field5039 != -1) {
                                            class43.method439(0, false, false, var278, class327.field5039, class155.field2504);
                                            class212.field3331 = false;
                                        } else if (var278 == 0) {
                                            class286.method2070(-114);
                                            class212.field3331 = false;
                                        } else {
                                            class227.method1704((byte) -97, var278);
                                        }
                                        class239.field3720 = var278;
                                    }
                                    class235.method1756(false, class340.field5234);
                                    class258.field3951 = false;
                                    continue;
                                }
                                if (var550 == 6020) {
                                    var3--;
                                    int var279 = class212.field3325[var3];
                                    if (var279 < 0) {
                                        var279 = 0;
                                    }
                                    if (var279 > 127) {
                                        var279 = 127;
                                    }
                                    class287.field4454 = var279;
                                    class235.method1756(false, class340.field5234);
                                    class258.field3951 = false;
                                    continue;
                                }
                                if (var550 == 6021) {
                                    var3--;
                                    class134.field2244 = class212.field3325[var3] == 1;
                                    class318.method2246((byte) 0);
                                    continue;
                                }
                                if (var550 == 6023) {
                                    var3--;
                                    int var280 = class212.field3325[var3];
                                    if (var280 < 0) {
                                        var280 = 0;
                                    }
                                    if (var280 > 2) {
                                        var280 = 2;
                                    }
                                    boolean var281 = false;
                                    if (class121.field1889 < 96) {
                                        var281 = true;
                                        var280 = 0;
                                    }
                                    class273.method1998(var280);
                                    class235.method1756(false, class340.field5234);
                                    class258.field3951 = false;
                                    class212.field3325[var3++] = var281 ? 0 : 1;
                                    continue;
                                }
                                if (var550 == 6024) {
                                    var3--;
                                    int var282 = class212.field3325[var3];
                                    if (var282 < 0 || var282 > 2) {
                                        var282 = 0;
                                    }
                                    class74.field1091 = var282;
                                    class235.method1756(false, class340.field5234);
                                    continue;
                                }
                                if (var550 == 6027) {
                                    var3--;
                                    int var283 = class212.field3325[var3];
                                    if (!class240.field3737) {
                                        continue;
                                    }
                                    if (var283 < 0 || var283 > 1) {
                                        var283 = 0;
                                    }
                                    class326.method2310(var283 == 1, 3);
                                    continue;
                                }
                                if (var550 == 6028) {
                                    var3--;
                                    class321.field4946 = class212.field3325[var3] != 0;
                                    class235.method1756(false, class340.field5234);
                                    continue;
                                }
                            } else if (var550 < 6200) {
                                if (var550 == 6101) {
                                    class212.field3325[var3++] = class139.field2321;
                                    continue;
                                }
                                if (var550 == 6102) {
                                    class212.field3325[var3++] = class158.method1282(false) ? 1 : 0;
                                    continue;
                                }
                                if (var550 == 6103) {
                                    class212.field3325[var3++] = class274.field4252 ? 1 : 0;
                                    continue;
                                }
                                if (var550 == 6105) {
                                    class212.field3325[var3++] = class327.field5034 ? 1 : 0;
                                    continue;
                                }
                                if (var550 == 6106) {
                                    class212.field3325[var3++] = class121.field1878 ? 1 : 0;
                                    continue;
                                }
                                if (var550 == 6107) {
                                    class212.field3325[var3++] = class86.field1241 ? 1 : 0;
                                    continue;
                                }
                                if (var550 == 6108) {
                                    class212.field3325[var3++] = class108.field1626 ? 1 : 0;
                                    continue;
                                }
                                if (var550 == 6109) {
                                    class212.field3325[var3++] = class290.field4504 ? 1 : 0;
                                    continue;
                                }
                                if (var550 == 6110) {
                                    class212.field3325[var3++] = class101.field1529 ? 1 : 0;
                                    continue;
                                }
                                if (var550 == 6111) {
                                    class212.field3325[var3++] = class19.field311;
                                    continue;
                                }
                                if (var550 == 6112) {
                                    class212.field3325[var3++] = class59.field927 ? 1 : 0;
                                    continue;
                                }
                                if (var550 == 6114) {
                                    class212.field3325[var3++] = class164.field2603 ? 1 : 0;
                                    continue;
                                }
                                if (var550 == 6115) {
                                    class212.field3325[var3++] = class343.field5451 ? 1 : 0;
                                    continue;
                                }
                                if (var550 == 6116) {
                                    class212.field3325[var3++] = class271.field4194;
                                    continue;
                                }
                                if (var550 == 6117) {
                                    class212.field3325[var3++] = class110.field1686 ? 1 : 0;
                                    continue;
                                }
                                if (var550 == 6118) {
                                    class212.field3325[var3++] = class224.field3509;
                                    continue;
                                }
                                if (var550 == 6119) {
                                    class212.field3325[var3++] = class239.field3720;
                                    continue;
                                }
                                if (var550 == 6120) {
                                    class212.field3325[var3++] = class287.field4454;
                                    continue;
                                }
                                if (var550 == 6121) {
                                    if (class240.field3737) {
                                        class212.field3325[var3++] = class240.field3745 ? 1 : 0;
                                    } else {
                                        class212.field3325[var3++] = 0;
                                    }
                                    continue;
                                }
                                if (var550 == 6123) {
                                    class212.field3325[var3++] = class273.method2000();
                                    continue;
                                }
                                if (var550 == 6124) {
                                    class212.field3325[var3++] = class74.field1091;
                                    continue;
                                }
                                if (var550 == 6126) {
                                    if (class240.field3737) {
                                        class212.field3325[var3++] = class357.method2512() ? 1 : 0;
                                    } else {
                                        class212.field3325[var3++] = 0;
                                    }
                                    continue;
                                }
                                if (var550 == 6127) {
                                    class212.field3325[var3++] = class33.field502 ? 1 : 0;
                                    continue;
                                }
                                if (var550 == 6128) {
                                    class212.field3325[var3++] = class321.field4946 ? 1 : 0;
                                    continue;
                                }
                            } else if (var550 < 6300) {
                                if (var550 == 6200) {
                                    var3 -= 2;
                                    class13.field169 = (short) class212.field3325[var3];
                                    if (class13.field169 <= 0) {
                                        class13.field169 = 256;
                                    }
                                    class293.field4561 = (short) class212.field3325[var3 + 1];
                                    if (class293.field4561 <= 0) {
                                        class293.field4561 = 205;
                                    }
                                    continue;
                                }
                                if (var550 == 6201) {
                                    var3 -= 2;
                                    class231.field3602 = (short) class212.field3325[var3];
                                    if (class231.field3602 <= 0) {
                                        class231.field3602 = 256;
                                    }
                                    class23.field360 = (short) class212.field3325[var3 + 1];
                                    if (class23.field360 <= 0) {
                                        class23.field360 = 320;
                                    }
                                    continue;
                                }
                                if (var550 == 6202) {
                                    var3 -= 4;
                                    class363.field5750 = (short) class212.field3325[var3];
                                    if (class363.field5750 <= 0) {
                                        class363.field5750 = 1;
                                    }
                                    class282.field4359 = (short) class212.field3325[var3 + 1];
                                    if (class282.field4359 <= 0) {
                                        class282.field4359 = 32767;
                                    } else if (class363.field5750 > class282.field4359) {
                                        class282.field4359 = class363.field5750;
                                    }
                                    class81.field1187 = (short) class212.field3325[var3 + 2];
                                    if (class81.field1187 <= 0) {
                                        class81.field1187 = 1;
                                    }
                                    class23.field358 = (short) class212.field3325[var3 + 3];
                                    if (class23.field358 <= 0) {
                                        class23.field358 = 32767;
                                    } else if (class23.field358 < class81.field1187) {
                                        class23.field358 = class81.field1187;
                                    }
                                    continue;
                                }
                                if (var550 == 6203) {
                                    class360.method2528(false, class85.field1220.field5339, 0, class85.field1220.field5374, (byte) 66, 0);
                                    class212.field3325[var3++] = class181.field2846;
                                    class212.field3325[var3++] = class288.field4495;
                                    continue;
                                }
                                if (var550 == 6204) {
                                    class212.field3325[var3++] = class231.field3602;
                                    class212.field3325[var3++] = class23.field360;
                                    continue;
                                }
                                if (var550 == 6205) {
                                    class212.field3325[var3++] = class13.field169;
                                    class212.field3325[var3++] = class293.field4561;
                                    continue;
                                }
                            } else if (var550 < 6400) {
                                if (var550 == 6300) {
                                    class212.field3325[var3++] = (int) (class156.method1273((byte) -80) / 60000L);
                                    continue;
                                }
                                if (var550 == 6301) {
                                    class212.field3325[var3++] = (int) (class156.method1273((byte) -41) / 86400000L) - 11745;
                                    continue;
                                }
                                if (var550 == 6302) {
                                    var3 -= 3;
                                    int var269 = class212.field3325[var3 + 1];
                                    int var270 = class212.field3325[var3];
                                    int var271 = class212.field3325[var3 + 2];
                                    class201.field3103.clear();
                                    class201.field3103.set(11, 12);
                                    class201.field3103.set(var271, var269, var270);
                                    class212.field3325[var3++] = (int) (class201.field3103.getTime().getTime() / 86400000L) - 11745;
                                    continue;
                                }
                                if (var550 == 6303) {
                                    class201.field3103.clear();
                                    class201.field3103.setTime(new Date(class156.method1273((byte) -43)));
                                    class212.field3325[var3++] = class201.field3103.get(1);
                                    continue;
                                }
                                if (var550 == 6304) {
                                    boolean var272 = true;
                                    var3--;
                                    int var273 = class212.field3325[var3];
                                    if (var273 < 0) {
                                        var272 = ((var273 + 1) % 4) == 0;
                                    } else if (var273 < 1582) {
                                        var272 = var273 % 4 == 0;
                                    } else if ((var273 % 4) != 0) {
                                        var272 = false;
                                    } else if ((var273 % 100) != 0) {
                                        var272 = true;
                                    } else if ((var273 % 400) != 0) {
                                        var272 = false;
                                    }
                                    class212.field3325[var3++] = var272 ? 1 : 0;
                                    continue;
                                }
                            } else if (var550 < 6500) {
                                if (var550 == 6405) {
                                    class212.field3325[var3++] = class342.method2412(-30) ? 1 : 0;
                                    continue;
                                }
                                if (var550 == 6406) {
                                    class212.field3325[var3++] = class126.method1089(1101971809) ? 1 : 0;
                                    continue;
                                }
                            } else if (var550 < 6600) {
                                if (var550 == 6500) {
                                    if (class295.field4578 == 10 && class87.field1246 == 0 && class290.field4509 == 0 && class129.field2139 == 0) {
                                        class212.field3325[var3++] = class243.method1835(29619) == -1 ? 0 : 1;
                                        continue;
                                    }
                                    class212.field3325[var3++] = 1;
                                    continue;
                                }
                                if (var550 == 6501) {
                                    class316 var249 = class300.method2168(0);
                                    if (var249 == null) {
                                        class212.field3325[var3++] = -1;
                                        class212.field3325[var3++] = 0;
                                        class9.field127[var4++] = "";
                                        class212.field3325[var3++] = 0;
                                        class9.field127[var4++] = "";
                                        class212.field3325[var3++] = 0;
                                    } else {
                                        class212.field3325[var3++] = var249.field4875;
                                        class212.field3325[var3++] = var249.field5215;
                                        class9.field127[var4++] = var249.field4869;
                                        class78 var250 = var249.method2228(0);
                                        class212.field3325[var3++] = var250.field1126;
                                        class9.field127[var4++] = var250.field1131;
                                        class212.field3325[var3++] = var249.field5221;
                                    }
                                    continue;
                                }
                                if (var550 == 6502) {
                                    class316 var251 = class326.method2308((byte) -122);
                                    if (var251 == null) {
                                        class212.field3325[var3++] = -1;
                                        class212.field3325[var3++] = 0;
                                        class9.field127[var4++] = "";
                                        class212.field3325[var3++] = 0;
                                        class9.field127[var4++] = "";
                                        class212.field3325[var3++] = 0;
                                    } else {
                                        class212.field3325[var3++] = var251.field4875;
                                        class212.field3325[var3++] = var251.field5215;
                                        class9.field127[var4++] = var251.field4869;
                                        class78 var252 = var251.method2228(0);
                                        class212.field3325[var3++] = var252.field1126;
                                        class9.field127[var4++] = var252.field1131;
                                        class212.field3325[var3++] = var251.field5221;
                                    }
                                    continue;
                                }
                                if (var550 == 6503) {
                                    var3--;
                                    int var253 = class212.field3325[var3];
                                    if (class295.field4578 == 10 && class87.field1246 == 0 && class290.field4509 == 0 && class129.field2139 == 0) {
                                        class212.field3325[var3++] = class294.method2124(var253, true) ? 1 : 0;
                                        continue;
                                    }
                                    class212.field3325[var3++] = 0;
                                    continue;
                                }
                                if (var550 == 6504) {
                                    var3--;
                                    class195.field3071 = class212.field3325[var3];
                                    class235.method1756(false, class340.field5234);
                                    continue;
                                }
                                if (var550 == 6505) {
                                    class212.field3325[var3++] = class195.field3071;
                                    continue;
                                }
                                if (var550 == 6506) {
                                    var3--;
                                    int var254 = class212.field3325[var3];
                                    class316 var255 = class345.method2432(var254, (byte) -25);
                                    if (var255 == null) {
                                        class212.field3325[var3++] = -1;
                                        class9.field127[var4++] = "";
                                        class212.field3325[var3++] = 0;
                                        class9.field127[var4++] = "";
                                        class212.field3325[var3++] = 0;
                                    } else {
                                        class212.field3325[var3++] = var255.field5215;
                                        class9.field127[var4++] = var255.field4869;
                                        class78 var256 = var255.method2228(0);
                                        class212.field3325[var3++] = var256.field1126;
                                        class9.field127[var4++] = var256.field1131;
                                        class212.field3325[var3++] = var255.field5221;
                                    }
                                    continue;
                                }
                                if (var550 == 6507) {
                                    var3 -= 4;
                                    int var257 = class212.field3325[var3];
                                    int var258 = class212.field3325[var3 + 2];
                                    boolean var259 = class212.field3325[var3 + 1] == 1;
                                    boolean var260 = class212.field3325[var3 + 3] == 1;
                                    class362.method2543(var259, var257, true, var258, var260);
                                    continue;
                                }
                            } else if (var550 < 6700) {
                                if (var550 == 6600) {
                                    var3--;
                                    class278.field4292 = class212.field3325[var3] == 1;
                                    class235.method1756(false, class340.field5234);
                                    continue;
                                }
                                if (var550 == 6601) {
                                    class212.field3325[var3++] = class278.field4292 ? 1 : 0;
                                    continue;
                                }
                            } else if (var550 < 6900) {
                                if (var550 == 6800) {
                                    var3--;
                                    int var261 = class212.field3325[var3];
                                    class181 var262 = class334.method2351(var261, (byte) 102);
                                    if (var262.field2841 == null) {
                                        class9.field127[var4++] = "";
                                    } else {
                                        class9.field127[var4++] = var262.field2841;
                                    }
                                    continue;
                                }
                                if (var550 == 6801) {
                                    var3--;
                                    int var263 = class212.field3325[var3];
                                    class181 var264 = class334.method2351(var263, (byte) 106);
                                    class212.field3325[var3++] = var264.field2863;
                                    continue;
                                }
                                if (var550 == 6802) {
                                    var3--;
                                    int var265 = class212.field3325[var3];
                                    class181 var266 = class334.method2351(var265, (byte) 93);
                                    class212.field3325[var3++] = var266.field2831;
                                    continue;
                                }
                                if (var550 == 6803) {
                                    var3--;
                                    int var267 = class212.field3325[var3];
                                    class181 var268 = class334.method2351(var267, (byte) 94);
                                    class212.field3325[var3++] = var268.field2857;
                                    continue;
                                }
                            }
                        } else if (var550 == 4500) {
                            var3 -= 2;
                            int var396 = class212.field3325[var3];
                            int var397 = class212.field3325[var3 + 1];
                            class140 var398 = class29.method331(var397, (byte) 3);
                            if (var398.method1171(true)) {
                                class9.field127[var4++] = class244.method1844((byte) -73, var396).method1238(var397, 122, var398.field2326);
                            } else {
                                class212.field3325[var3++] = class244.method1844((byte) -56, var396).method1239(152739632, var397, var398.field2334);
                            }
                            continue;
                        }
                    } else if (var550 == 4400) {
                        var3 -= 2;
                        int var399 = class212.field3325[var3 + 1];
                        int var400 = class212.field3325[var3];
                        class140 var401 = class29.method331(var399, (byte) 3);
                        if (var401.method1171(true)) {
                            class9.field127[var4++] = class43.method437(72, var400).method1577(var401.field2326, false, var399);
                        } else {
                            class212.field3325[var3++] = class43.method437(83, var400).method1578(var399, (byte) 45, var401.field2334);
                        }
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var549) {
            if (arg2.field1081 == null) {
                if (class353.field5636 != 0) {
                    class101.method882(-1, "Clientscript error - check log for details");
                }
                client.method1023((byte) -122, "CS2 - scr:" + arg2.field2734 + " op:" + var8, var549);
            } else {
                StringBuffer var545 = new StringBuffer(30);
                var545.append("%0a - in: ").append(arg2.field1081);
                for (int var546 = class126.field2112 - 1; var546 >= 0; var546--) {
                    var545.append("%0a - via: ").append(class252.field3879[var546].field3227.field1081);
                }
                if (var8 == 40) {
                    int var547 = var7[var5];
                    var545.append("%0a - non-existant gosub script-num: ").append(Integer.toString(var547));
                }
                if (class353.field5636 != 0) {
                    class101.method882(-1, "Clientscript error in: " + arg2.field1081);
                }
                client.method1023((byte) -123, "CS2 - scr:" + arg2.field2734 + " op:" + var8 + var545.toString(), var549);
            }
            int var548 = 64 % ((arg0 - 56) / 47);
        }
    }
}
