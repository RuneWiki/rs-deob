import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class473 extends class665 {

    @OriginalMember(owner = "client!gq", name = "u", descriptor = "Ldq;")
    public class641 field6603;

    @OriginalMember(owner = "client!gq", name = "t", descriptor = "I")
    public static int field6602;

    @OriginalMember(owner = "client!gq", name = "v", descriptor = "I")
    public static int field6604;

    @OriginalMember(owner = "client!gq", name = "w", descriptor = "I")
    public static int field6605;

    @OriginalMember(owner = "client!gq", name = "x", descriptor = "I")
    public static int field6606;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(Loa;IIILvu;Ljd;)Z")
    public static final boolean method2686(class638 arg0, int arg1, int arg2, int arg3, class307 arg4, class209 arg5) {
        field6602++;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg4.field4519 != null) {
            var7 = (arg4.field4524 + arg5.field3081 - class148.field2202) * (class148.field2212 - class148.field2198) / (class148.field2200 - class148.field2202) + class148.field2198;
            var6 = (class148.field2212 - class148.field2198) * (arg4.field4528 + arg5.field3081 - class148.field2202) / (class148.field2200 - class148.field2202) + class148.field2198;
            var8 = class148.field2211 - (class148.field2211 - class148.field2204) * (arg4.field4512 + arg5.field3085 - class148.field2217) / (class148.field2199 - class148.field2217);
            var9 = class148.field2211 - (arg4.field4540 + arg5.field3085 - class148.field2217) * (class148.field2211 - class148.field2204) / (class148.field2199 - class148.field2217);
        }
        class461 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (arg4.field4539 != -1) {
            if (arg5.field3080 && arg4.field4525 != -1) {
                var10 = arg4.method1888(true, arg1 ^ 0xFFFF87CD, arg0);
            } else {
                var10 = arg4.method1888(false, 0, arg0);
            }
            if (var10 != null) {
                var11 = arg5.field3084 - (var10.method33() + 1 >> 1);
                if (var11 < var6) {
                    var6 = var11;
                }
                var12 = arg5.field3084 + (var10.method33() + 1 >> 1);
                var13 = arg5.field3079 - (var10.method29() + 1 >> 1);
                if (var12 > var7) {
                    var7 = var12;
                }
                if (var13 < var8) {
                    var8 = var13;
                }
                var14 = arg5.field3079 + (var10.method29() + 1 >> 1);
                if (var9 < var14) {
                    var9 = var14;
                }
            }
        }
        class616 var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        if (arg4.field4517 != null) {
            var15 = class232.method1471((byte) 98, arg4.field4533);
            if (var15 != null) {
                var16 = class424.field5975.method3319(class628.field8767, arg4.field4517, null, null, 29169);
                int var23 = arg5.field3079;
                if (var10 == null) {
                    var17 = var23 - var15.method3403() * var16 / 2;
                } else {
                    var17 = var23 - ((var10.method29() >> 1) + var16 * var15.method3407());
                }
                for (int var24 = 0; var24 < var16; var24++) {
                    String var25 = class628.field8767[var24];
                    if (var24 < var16 - 1) {
                        var25 = var25.substring(0, var25.length() - 4);
                    }
                    int var26 = var15.method3409(var25);
                    if (var18 < var26) {
                        var18 = var26;
                    }
                }
                var19 = arg2 + arg5.field3084 - (var18 / 2);
                var20 = arg5.field3084 + arg2 + (var18 / 2);
                if (var6 > var19) {
                    var6 = var19;
                }
                var21 = arg3 + var17;
                if (var20 > var7) {
                    var7 = var20;
                }
                if (var21 < var8) {
                    var8 = var21;
                }
                var22 = arg3 + var15.method3407() * var16 + var17;
                if (var9 < var22) {
                    var9 = var22;
                }
            }
        }
        if (var7 < class148.field2198 || var6 > class148.field2212 || var9 < class148.field2204 || class148.field2211 < var8) {
            return true;
        }
        if (arg1 != -30771) {
            method2687(-40);
        }
        if (arg4.field4519 != null) {
            int[] var27 = new int[arg4.field4519.length];
            for (int var28 = 0; var28 < var27.length / 2; var28++) {
                int var30 = arg4.field4519[var28 * 2] + arg5.field3081;
                int var31 = arg4.field4519[var28 * 2 + 1] + arg5.field3085;
                var27[var28 * 2] = (var30 - class148.field2202) * (class148.field2212 - class148.field2198) / (class148.field2200 - class148.field2202) + class148.field2198;
                var27[var28 * 2 + 1] = class148.field2211 - ((class148.field2211 - class148.field2204) * (var31 - class148.field2217) / (class148.field2199 - class148.field2217));
            }
            class163.method1129(arg0, var27, arg4.field4546);
            for (int var29 = 0; var29 < (var27.length / 2 - 1); var29++) {
                arg0.method3557(false, var27[(var29 + 1) * 2], arg4.field4551, var27[var29 * 2], var27[var29 * 2 + 1], var27[var29 * 2 + 1 + 2]);
            }
            arg0.method3557(false, var27[0], arg4.field4551, var27[var27.length - 2], var27[var27.length - 1], var27[1]);
        }
        if (var10 != null) {
            if (class669.field9441 > 0 && (class351.field5051 != -1 && class351.field5051 == arg5.field3086 || class648.field9186 != -1 && class648.field9186 == arg4.field4527)) {
                int var32;
                if (class126.field1759 <= 50) {
                    var32 = class126.field1759 * 2;
                } else {
                    var32 = 200 - (class126.field1759 * 2);
                }
                int var33 = var32 << 24 | 0xFFFF00;
                arg0.method3559(-55, arg5.field3084, arg5.field3079, var10.method31() / 2 + 7, var33);
                arg0.method3559(-80, arg5.field3084, arg5.field3079, var10.method31() / 2 + 5, var33);
                arg0.method3559(-124, arg5.field3084, arg5.field3079, var10.method31() / 2 + 3, var33);
                arg0.method3559(-112, arg5.field3084, arg5.field3079, var10.method31() / 2 + 1, var33);
                arg0.method3559(-106, arg5.field3084, arg5.field3079, var10.method31() / 2, var33);
            }
            var10.method2660(arg5.field3084 - (var10.method33() >> 1), arg5.field3079 + -(var10.method29() >> 1));
        }
        if (arg4.field4517 != null && var15 != null) {
            class375.method2185(-16186, var16, var17, var15, arg5, arg4, var18, arg0);
        }
        if (arg4.field4539 != -1 || arg4.field4517 != null) {
            class534 var34 = new class534(arg5);
            var34.field7261 = var13;
            var34.field7263 = var22;
            var34.field7269 = var20;
            var34.field7271 = var11;
            var34.field7267 = var12;
            var34.field7274 = var14;
            var34.field7273 = var19;
            var34.field7264 = var21;
            class154.field2325.method1273(var34, (byte) 122);
        }
        return false;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)I")
    public static final int method2687(int arg0) {
        if (!class274.field3872.field872) {
            for (int var1 = 0; var1 < class95.field1255; var1++) {
                if (class526.field7216[var1].method817((byte) -100) == 's' || class526.field7216[var1].method817((byte) -100) == 'S') {
                    class274.field3872.field872 = true;
                    break;
                }
            }
        }
        if (arg0 < 120) {
            return 97;
        }
        field6604++;
        if (class675.field9501 == class120.field1650) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class680.method3756(-14);
            if (class240.field3453 == 0L) {
                class240.field3453 = var4;
            }
            if (var3 > 16384 && var4 - class240.field3453 < 5000L) {
                if ((var4 - class131.field1818) > 1000L) {
                    System.gc();
                    class131.field1818 = var4;
                }
                return 0;
            }
        }
        if (class675.field9508 == class120.field1650) {
            if (class375.field5313 == null) {
                class375.field5313 = new class413(class232.field3302, class234.field3319, class477.field6657, class18.field273);
            }
            if (!class375.field5313.method2357((byte) -84)) {
                return 0;
            }
            class201.method1351(0, 0, false);
            class535.field7281 = class602.method3338(true, 32, 1, false, (byte) 121);
            class517.field7065 = class602.method3338(true, 33, 1, false, (byte) 121);
            class328.field4846 = class602.method3338(true, 13, 1, false, (byte) 121);
        }
        if (class675.field9511 == class120.field1650) {
            class517.field7065.method924(-49);
            int var6 = class202.field2969[33].method3701(-127);
            int var7 = var6 + class202.field2969[32].method3701(-110);
            int var8 = var7 + class202.field2969[13].method3701(-100);
            int var9 = var8 + class517.field7065.method935(true);
            if (var9 != 400) {
                return var9 / 4;
            }
            class212.field3102 = class535.field7281.method944(127);
            class245.field3490 = class517.field7065.method944(71);
            class244.method1513(8, class535.field7281);
            int var10 = class274.field3872.field878;
            class286.field3963 = new class514(class158.field2374, class666.field9377, class517.field7065);
            int[] var11 = class286.field3963.method2855(var10, (byte) -18);
            class51 var12 = new class51(class535.field7281);
            if (var11.length > 0) {
                class433.field6132 = new class297[var11.length];
                for (int var13 = 0; var13 < class433.field6132.length; var13++) {
                    class433.field6132[var13] = new class509(class286.field3963.method2860(122, var11[var13]), var12);
                }
            }
        }
        if (class675.field9513 == class120.field1650) {
            class400.method2272(class328.field4846, (byte) 114, class65.method537(false), class535.field7281);
        }
        if (class675.field9514 == class120.field1650) {
            int var14 = class371.method2173((byte) 122);
            int var15 = class154.method1075((byte) 119);
            if (var14 < var15) {
                return var14 * 100 / var15;
            }
        }
        if (class675.field9515 == class120.field1650) {
            class296.method1848((byte) 62, class630.field8790);
            class27.method124((byte) -119, class630.field8790);
            class94.method690(1, (byte) 125);
        }
        if (class675.field9516 == class120.field1650) {
            for (int var16 = 0; var16 < 4; var16++) {
                class480.field6696[var16] = class633.method3518(true, class86.field1185, class526.field7212);
            }
        }
        if (class675.field9517 == class120.field1650) {
            class460.field6517 = class602.method3338(true, 8, 1, false, (byte) 121);
            class609.field8470 = class602.method3338(true, 0, 1, false, (byte) 121);
            class387.field5436 = class602.method3338(true, 1, 1, false, (byte) 121);
            class216.field3139 = class602.method3338(true, 2, 1, false, (byte) 121);
            class249.field3514 = class602.method3338(true, 3, 1, false, (byte) 121);
            class417.field5882 = class602.method3338(true, 4, 1, false, (byte) 121);
            class11.field211 = class602.method3338(true, 5, 1, true, (byte) 121);
            class74.field1027 = class602.method3338(false, 6, 1, true, (byte) 121);
            class317.field4707 = class602.method3338(true, 7, 1, false, (byte) 121);
            class398.field5533 = class602.method3338(true, 9, 1, false, (byte) 121);
            class64.field850 = class602.method3338(true, 10, 1, false, (byte) 121);
            class156.field2360 = class602.method3338(true, 11, 1, false, (byte) 121);
            class156.field2357 = class602.method3338(true, 12, 1, false, (byte) 121);
            class465.field6542 = class602.method3338(false, 14, 1, false, (byte) 121);
            class693.field9709 = class602.method3338(true, 15, 1, false, (byte) 121);
            class678.field9561 = class602.method3338(true, 16, 1, false, (byte) 121);
            class18.field268 = class602.method3338(true, 17, 1, false, (byte) 121);
            class641.field9125 = class602.method3338(true, 18, 1, false, (byte) 121);
            class389.field5462 = class602.method3338(true, 19, 1, false, (byte) 121);
            class110.field1493 = class602.method3338(true, 20, 1, false, (byte) 121);
            class466.field6558 = class602.method3338(true, 21, 1, false, (byte) 121);
            class683.field9603 = class602.method3338(true, 22, 1, false, (byte) 121);
            class688.field9672 = class602.method3338(true, 23, 1, true, (byte) 121);
            class537.field7298 = class602.method3338(true, 24, 1, false, (byte) 121);
            class395.field5501 = class602.method3338(true, 25, 1, false, (byte) 121);
            class424.field5976 = class602.method3338(true, 26, 1, true, (byte) 121);
            class634.field8882 = class602.method3338(true, 27, 1, false, (byte) 121);
            class348.field5019 = class602.method3338(true, 28, 1, true, (byte) 121);
            class418.field5903 = class602.method3338(true, 29, 1, false, (byte) 121);
            class228.field3270 = class602.method3338(true, 30, 1, true, (byte) 121);
            class657.field9259 = class602.method3338(true, 31, 1, true, (byte) 121);
        }
        if (class675.field9518 == class120.field1650) {
            int var17 = 0;
            for (int var18 = 0; var18 < 34; var18++) {
                var17 += class202.field2969[var18].method3701(-123) * class547.field7409[var18] / 100;
            }
            if (var17 != 100) {
                return var17;
            }
            class24.method117(class460.field6517, -1);
            class400.method2272(class328.field4846, (byte) 114, class65.method537(false), class460.field6517);
        }
        if (class675.field9519 == class120.field1650) {
            class289.method1740(9);
            class94.method690(2, (byte) 125);
        }
        if (class675.field9520 == class120.field1650) {
            class341.method2040((byte) 102, class228.field3270, class503.field6878);
        }
        if (class675.field9521 == class120.field1650) {
            if (!class348.field5019.method924(-60)) {
                return class348.field5019.method935(true);
            }
            class687.method3784(false, class348.field5019.method938(1, (byte) -53));
            class21.method106(class348.field5019.method938(3, (byte) -53), (byte) 41);
            if (class101.field1377 != -1 && !class317.field4707.method931((byte) 96, 0, class101.field1377)) {
                return 99;
            }
        }
        if (class675.field9522 == class120.field1650) {
            int var19 = class667.method3695("jaggl", 0);
            if (var19 >= 0 && var19 < 100) {
                return var19;
            }
        }
        if (class675.field9523 == class120.field1650) {
            int var20 = class667.method3695("jagdx", 0);
            if (var20 >= 0 && var20 < 100) {
                return var20;
            }
        }
        if (class675.field9524 == class120.field1650) {
            int var21 = class667.method3695("jagmisc", 0);
            if (var21 >= 0 && var21 < 100) {
                return var21;
            }
            if (var21 == 100) {
                class258.field3685.method3508((byte) 68);
            }
        }
        if (class675.field9525 == class120.field1650) {
            int var22 = class667.method3695("sw3d", 0);
            if (var22 >= 0 && var22 < 100) {
                return var22;
            }
        }
        if (class675.field9526 == class120.field1650) {
            int var23 = class667.method3695("jaclib", 0);
            if (var23 >= 0 && var23 < 100) {
                return var23;
            }
            if (var23 == 100) {
                class258.field3685.method3502(10);
            }
        }
        if (class675.field9527 == class120.field1650) {
            int var24 = class667.method3695("hw3d", 0);
            if (var24 >= 0 && var24 < 100) {
                return var24;
            }
        }
        if (class675.field9528 == class120.field1650 && !class657.field9259.method924(-120)) {
            return 0;
        }
        if (class675.field9529 == class120.field1650) {
            if (!class424.field5976.method924(96)) {
                return class424.field5976.method935(true);
            }
            class139.field1950 = new class73(class424.field5976, class398.field5533, class460.field6517);
        }
        if (class675.field9530 == class120.field1650) {
            class216.field3139.method924(67);
            byte var25 = 0;
            int var26 = var25 + class216.field3139.method935(true);
            class678.field9561.method924(-73);
            int var27 = var26 + class678.field9561.method935(true);
            class18.field268.method924(-85);
            int var28 = var27 + class18.field268.method935(true);
            class641.field9125.method924(75);
            int var29 = var28 + class641.field9125.method935(true);
            class389.field5462.method924(-56);
            int var30 = var29 + class389.field5462.method935(true);
            class110.field1493.method924(-107);
            int var31 = var30 + class110.field1493.method935(true);
            class466.field6558.method924(117);
            int var32 = var31 + class466.field6558.method935(true);
            class683.field9603.method924(-87);
            int var33 = var32 + class683.field9603.method935(true);
            class537.field7298.method924(-102);
            int var34 = var33 + class537.field7298.method935(true);
            class395.field5501.method924(113);
            int var35 = var34 + class395.field5501.method935(true);
            class634.field8882.method924(103);
            int var36 = var35 + class634.field8882.method935(true);
            class418.field5903.method924(-76);
            int var37 = var36 + class418.field5903.method935(true);
            if (var37 < 1200) {
                return var37 / 12;
            }
            class324.field4784 = new class371(class158.field2374, class666.field9377, class216.field3139);
            class310.field4615 = new class549(class158.field2374, class666.field9377, class216.field3139);
            class660.field9275 = new class180(class158.field2374, class666.field9377, class216.field3139, class460.field6517);
            class136.field1924 = new class92(class158.field2374, class666.field9377, class18.field268);
            class207.field3062 = new class149(class158.field2374, class666.field9377, class216.field3139);
            class602.field8358 = new class169(class158.field2374, class666.field9377, class216.field3139);
            class472.field6593 = new class600(class158.field2374, class666.field9377, class216.field3139, class317.field4707);
            class63.field837 = new class344(class158.field2374, class666.field9377, class216.field3139);
            class546.field7390 = new class556(class158.field2374, class666.field9377, class216.field3139);
            class164.field2499 = new class333(class158.field2374, class666.field9377, true, class678.field9561, class317.field4707);
            class536.field7294 = new class516(class158.field2374, class666.field9377, class216.field3139, class460.field6517);
            class367.field5250 = new class75(class158.field2374, class666.field9377, class216.field3139, class460.field6517);
            class648.field9185 = new class237(class158.field2374, class666.field9377, true, class641.field9125, class317.field4707);
            class648.field9184 = new class558(class158.field2374, class666.field9377, true, class324.field4784, class389.field5462, class317.field4707);
            class210.field3099 = new class77(class158.field2374, class666.field9377, class216.field3139);
            class301.field4465 = new class493(class158.field2374, class666.field9377, class110.field1493, class609.field8470, class387.field5436);
            class169.field2547 = new class318(class158.field2374, class666.field9377, class216.field3139);
            class305.field4492 = new class309(class158.field2374, class666.field9377, class216.field3139);
            class569.field7652 = new class363(class158.field2374, class666.field9377, class466.field6558, class317.field4707);
            class146.field2170 = new class681(class158.field2374, class666.field9377, class216.field3139);
            class31.field371 = new class210(class158.field2374, class666.field9377, class216.field3139);
            class265.field3750 = new class322(class158.field2374, class666.field9377, class216.field3139);
            class311.field4616 = new class173(class158.field2374, class666.field9377, class683.field9603);
            class540.field7344 = new class660(class158.field2374, class666.field9377, class216.field3139);
            class565.method3130(class460.field6517, class328.field4846, class317.field4707, class249.field3514, (byte) -128);
            class103.method790((byte) 125, class418.field5903);
            class587.field8204 = new class129(class666.field9377, class537.field7298, class395.field5501);
            class609.field8469 = new class16(class666.field9377, class537.field7298, class395.field5501, new class174());
            class426.method2415((byte) 112);
            class164.field2499.method2015((byte) -96, !class274.field3872.method2433(0, class429.field6020));
            class195.field2888 = new class123();
            class68.method553((byte) 96);
            class219.method1414(28817, class634.field8882);
            class227.method1450(class317.field4707, (byte) 127, class139.field1950);
        }
        if (class675.field9531 == class120.field1650) {
            int var38 = class547.method3008(class460.field6517, 2) + class351.method2084(0, true);
            int var39 = class249.method1543((byte) -117) + class154.method1075((byte) 113);
            if (var39 > var38) {
                return var38 * 100 / var39;
            }
        }
        if (class675.field9532 == class120.field1650) {
            if (!class64.field850.method916(-99, "huffman", "")) {
                return 0;
            }
            class320 var40 = new class320(class64.field850.method937("", "huffman", 0));
            class10.method49(var40, 90);
        }
        if (class675.field9533 == class120.field1650 && !class249.field3514.method924(-120)) {
            return class249.field3514.method935(true);
        } else if (class675.field9534 == class120.field1650 && !class156.field2357.method924(113)) {
            return class156.field2357.method935(true);
        } else if (class675.field9535 == class120.field1650 && !class328.field4846.method924(-52)) {
            return class328.field4846.method935(true);
        } else {
            if (class675.field9536 == class120.field1650) {
                if (!class688.field9672.method946("details", (byte) 3)) {
                    return class688.field9672.method923("details", (byte) 68);
                }
                class148.method1033(class688.field9672, class207.field3062, class602.field8358, class164.field2499, class536.field7294, class367.field5250, class195.field2888);
            }
            if (class675.field9537 == class120.field1650) {
                class244.field3474 = new String[class31.field371.field3096];
                class614.field8514 = new int[class265.field3750.field4758];
                class385.field5394 = new boolean[class265.field3750.field4758];
                for (int var41 = 0; var41 < class265.field3750.field4758; var41++) {
                    if (class265.field3750.method1958(28059, var41).field5508 == 0) {
                        class385.field5394[var41] = true;
                        class268.field3794++;
                    }
                    class614.field8514[var41] = -1;
                }
                class173.method1187(-1);
                class456.field6372 = class249.field3514.method920(2, "loginscreen");
                class21.field291 = class249.field3514.method920(2, "lobbyscreen");
                class11.field211.method925((byte) -100, false, true);
                class74.field1027.method925((byte) -103, true, true);
                class460.field6517.method925((byte) -128, true, true);
                class328.field4846.method925((byte) -99, true, true);
                class64.field850.method925((byte) -114, true, true);
                class249.field3514.method925((byte) -103, true, true);
                class244.field3481 = true;
                class216.field3139.field1844 = 2;
                class18.field268.field1844 = 2;
                class678.field9561.field1844 = 2;
                class641.field9125.field1844 = 2;
                class389.field5462.field1844 = 2;
                class110.field1493.field1844 = 2;
                class466.field6558.field1844 = 2;
            }
            if (class675.field9539 == class120.field1650) {
                class622.field8657 = class274.field3872.field872;
                class274.field3872.field872 = true;
                class274.field3872.method2439(-2, class503.field6878);
                if (class622.field8657) {
                    class339.method2033(0, -28863);
                } else {
                    class339.method2033(class274.field3872.field898, -28863);
                }
                class679.method3752(class274.field3872.field917, false, -1, (byte) -114, -1);
                class296.method1848((byte) 24, class630.field8790);
                class27.method124((byte) -123, class630.field8790);
                class479.method2720(class630.field8790, class460.field6517, 10886);
                class546.method3004(-10, class656.field9239);
                class477.method2710(true, null);
                class433.field6132 = null;
                class517.field7065 = null;
                class286.field3963 = null;
                class535.field7281 = null;
            }
            return class499.method2791((byte) -89);
        }
    }

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Ldq;)V")
    public class473(class641 arg0) {
        this.field6603 = arg0;
    }
}
