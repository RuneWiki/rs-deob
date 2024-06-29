import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class451 {

    @OriginalMember(owner = "client!ms", name = "o", descriptor = "I")
    public int field6578 = -1;

    @OriginalMember(owner = "client!ms", name = "i", descriptor = "I")
    public static int field6572 = 2;

    @OriginalMember(owner = "client!ms", name = "l", descriptor = "I")
    public static int field6575 = -50;

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "[I")
    public static int[] field6566 = new int[6];

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "I")
    public int field6564;

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "I")
    public int field6565;

    @OriginalMember(owner = "client!ms", name = "d", descriptor = "I")
    public int field6567;

    @OriginalMember(owner = "client!ms", name = "e", descriptor = "I")
    public int field6568;

    @OriginalMember(owner = "client!ms", name = "f", descriptor = "I")
    public static int field6569;

    @OriginalMember(owner = "client!ms", name = "g", descriptor = "I")
    public int field6570;

    @OriginalMember(owner = "client!ms", name = "h", descriptor = "I")
    public static int field6571;

    @OriginalMember(owner = "client!ms", name = "j", descriptor = "I")
    public static int field6573;

    @OriginalMember(owner = "client!ms", name = "k", descriptor = "I")
    public static int field6574;

    @OriginalMember(owner = "client!ms", name = "m", descriptor = "I")
    public int field6576;

    @OriginalMember(owner = "client!ms", name = "n", descriptor = "I")
    public static int field6577;

    @OriginalMember(owner = "client!ms", name = "p", descriptor = "I")
    public int field6579;

    @OriginalMember(owner = "client!ms", name = "q", descriptor = "I")
    public int field6580;

    @OriginalMember(owner = "client!ms", name = "r", descriptor = "I")
    public int field6581;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "([Lrg;II)V")
    public static final void method2818(class383[] arg0, int arg1, int arg2) {
        field6577++;
        int var3 = 0;
        if (arg2 != -22722) {
            method2820((byte) 65, 54, -75, -52, -21, 114, -46);
        }
        while (var3 < arg0.length) {
            class383 var4 = arg0[var3];
            if (var4 != null && var4.field5538 == arg1 && (!var4.field5589 || !client.method1113(var4))) {
                label112: {
                    if (var4.field5488 == 0) {
                        if (!var4.field5589 && client.method1113(var4) && class75.field1168 != var4) {
                            break label112;
                        }
                        method2818(arg0, var4.field5507, arg2);
                        if (var4.field5465 != null) {
                            method2818(var4.field5465, var4.field5507, -22722);
                        }
                        class432 var5 = (class432) class271.field3700.method1412((byte) -54, (long) var4.field5507);
                        if (var5 != null) {
                            class21.method144(var5.field6217, (byte) 122);
                        }
                    }
                    if (var4.field5488 == 6) {
                        if (var4.field5551 != -1 || var4.field5578 != -1) {
                            boolean var6 = class349.method2231(arg2 ^ 0x588A, var4);
                            int var7;
                            if (var6) {
                                var7 = var4.field5578;
                            } else {
                                var7 = var4.field5551;
                            }
                            if (var7 != -1) {
                                class449 var8 = class86.method599(false, var7);
                                if (var8 != null) {
                                    var4.field5446 += class63.field980;
                                    while (var8.field6506[var4.field5426] < var4.field5446) {
                                        var4.field5446 -= var8.field6506[var4.field5426];
                                        var4.field5426++;
                                        if (var8.field6521.length <= var4.field5426) {
                                            var4.field5426 -= var8.field6501;
                                            if (var4.field5426 < 0 || var8.field6521.length <= var4.field5426) {
                                                var4.field5426 = 0;
                                            }
                                        }
                                        var4.field5544 = var4.field5426 + 1;
                                        if (var4.field5544 >= var8.field6521.length) {
                                            var4.field5544 -= var8.field6501;
                                            if (var4.field5544 < 0 || var4.field5544 >= var8.field6521.length) {
                                                var4.field5544 = -1;
                                            }
                                        }
                                        class86.method596(14459, var4);
                                    }
                                }
                            }
                        }
                        if (var4.field5515 != 0 && !var4.field5589) {
                            int var9 = var4.field5515 >> 16;
                            int var10 = class63.field980 * var9;
                            int var11 = var4.field5515 << 16 >> 16;
                            int var12 = class63.field980 * var11;
                            var4.field5585 = var4.field5585 + var10 & 0x3FFF;
                            var4.field5603 = var4.field5603 + var12 & 0x3FFF;
                            class86.method596(14459, var4);
                        }
                    }
                }
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(Z)V")
    public static final void method2819(boolean arg0) {
        if (arg0) {
            field6574 = 44;
        }
        field6569++;
        if (class398.field5824) {
            return;
        }
        class398.field5824 = true;
        if (class188.field2609) {
            class6.field98 = (float) ((int) class6.field98 + 191 & 0xFFFFFF80);
        } else {
            class220.field2891 += (24.0F - class220.field2891) / 2.0F;
        }
        class366.field5124 = true;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(BIIIIII)Lvm;")
    public static final class407 method2820(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6571++;
        long var7 = (long) arg5 * 32147369L ^ (long) arg4 * 475427L ^ (long) arg3 * 67481L ^ (long) arg2 * 97549L ^ (long) arg6 * 986053L ^ (long) arg1 * 76724863L;
        class407 var9 = (class407) class374.field5331.method1246((byte) -58, var7);
        if (var9 != null) {
            return var9;
        }
        class407 var10 = class308.field4230.method1818(arg3, arg2, arg4, arg6, arg5, arg1);
        class374.field5331.method1247(var7, (byte) 108, var10);
        if (arg0 <= 49) {
            field6572 = 92;
        }
        return var10;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2821(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class300.field4162 = 0;
        field6573++;
        for (int var7 = -1; var7 < class71.field1096 + class169.field2407; var7++) {
            class221 var30 = null;
            class61 var31;
            if (var7 < 0) {
                var31 = class307.field4211;
            } else if (var7 < class169.field2407) {
                var31 = class12.field153[class67.field1055[var7]];
            } else {
                var31 = class445.field6422[class280.field3837[var7 - class169.field2407]];
                var30 = ((class437) var31).field6290;
                if (var30.field2959 != null) {
                    var30 = var30.method1407(126);
                    if (var30 == null) {
                        continue;
                    }
                }
            }
            if (var31.field855 >= 0) {
                class280.method1720(arg5 >> 1, var31.method407(arg2 ^ 0xFFFFFF91), arg0 >> 1, arg4, var31, -103, arg3);
                if (class401.field5848[0] >= 0) {
                    if (var31.field909 != null && (class169.field2407 <= var7 || class34.field536 == 0 || class34.field536 == 3 || class34.field536 == 1 && class164.method1088(((class354) var31).field4994, 31048)) && class300.field4162 < class231.field3110) {
                        class231.field3113[class300.field4162] = class204.field2769.method448((byte) -110, var31.field909) / 2;
                        class231.field3108[class300.field4162] = class401.field5848[0];
                        class231.field3106[class300.field4162] = class401.field5848[1];
                        class231.field3099[class300.field4162] = var31.field870;
                        class231.field3107[class300.field4162] = var31.field893;
                        class231.field3102[class300.field4162] = var31.field891;
                        class231.field3112[class300.field4162] = var31.field909;
                        class300.field4162++;
                    }
                    class130 var32 = class261.field3571[0];
                    int var33 = class401.field5848[1] + arg6 - Math.max(class204.field2769.field1015, var32.method876());
                    if (!var31.field903 && class35.field541 < var31.field868) {
                        class130 var34 = class261.field3571[1];
                        if (var31 instanceof class437) {
                            class437 var35 = (class437) var31;
                            class130[] var36 = (class130[]) class411.field5967.method1246((byte) -116, (long) var35.field6290.field2904);
                            if (var36 == null) {
                                class18[] var37 = class18.method107(class353.field4943, var35.field6290.field2904, 0);
                                if (var37 != null) {
                                    var36 = new class130[var37.length];
                                    for (int var38 = 0; var38 < var37.length; var38++) {
                                        var36[var38] = class408.field5920.method1807(var37[var38], true);
                                    }
                                    class411.field5967.method1247((long) var35.field6290.field2904, (byte) 99, var36);
                                }
                            }
                            if (var36 != null && var36.length == 2) {
                                var34 = var36[1];
                                var32 = var36[0];
                            }
                        }
                        int var39 = class401.field5848[0] + arg1 - (var32.method880() >> 1);
                        var32.method867(var39, var33);
                        int var40 = var32.method880() * var31.field913 / 255;
                        class408.field5920.method1776(var39, var33, var39 + var40, var32.method876() + var33);
                        var34.method867(var39, var33);
                        class408.field5920.method1735(arg1, arg6, arg1 + arg5, arg0 + arg6);
                    }
                    var33 -= 2;
                    if (!var31.field903) {
                        if (var31.field857 > class35.field541) {
                            class130 var41 = class401.field5855[var31.field907 ? 2 : 0];
                            class130 var42 = class401.field5855[var31.field907 ? 3 : 1];
                            boolean var43 = true;
                            int var44;
                            if (var31 instanceof class437) {
                                var44 = var30.field2922;
                                if (var44 == -1) {
                                    var44 = var31.method402(arg2 - 20).field4261;
                                }
                            } else {
                                var44 = var31.method402(0).field4261;
                            }
                            if (var44 != -1) {
                                class130[] var45 = (class130[]) class26.field424.method1246((byte) -42, (long) var44);
                                if (var45 == null) {
                                    class18[] var46 = class18.method107(class353.field4943, var44, 0);
                                    if (var46 != null) {
                                        var45 = new class130[var46.length];
                                        for (int var47 = 0; var47 < var46.length; var47++) {
                                            var45[var47] = class408.field5920.method1807(var46[var47], true);
                                        }
                                        class26.field424.method1247((long) var44, (byte) 9, var45);
                                    }
                                }
                                if (var45 != null && var45.length == 4) {
                                    var42 = var45[var31.field907 ? 3 : 1];
                                    var41 = var45[var31.field907 ? 2 : 0];
                                }
                            }
                            int var48 = var31.field857 - class35.field541;
                            int var49;
                            if (var31.field888 >= var48) {
                                var49 = var41.method880();
                            } else {
                                int var50 = var48 - var31.field888;
                                int var51 = var31.field918 == 0 ? 0 : (var31.field926 - var50) / var31.field918 * var31.field918;
                                var49 = var51 * var41.method880() / var31.field926;
                            }
                            int var52 = var41.method876();
                            var33 -= var52;
                            int var53 = class401.field5848[0] + (arg1 - (var41.method880() >> 1));
                            var41.method867(var53, var33);
                            class408.field5920.method1776(var53, var33, var53 + var49, var33 + var52);
                            var42.method867(var53, var33);
                            var33 -= 2;
                            class408.field5920.method1735(arg1, arg6, arg1 + arg5, arg6 - -arg0);
                        }
                        if (var7 < class169.field2407) {
                            class354 var55 = (class354) var31;
                            if (var55.field4976 != -1) {
                                var33 -= 25;
                                class129.field1805[var55.field4976].method867(class401.field5848[0] + arg1 - 12, var33);
                                var33 -= 2;
                            }
                            if (var55.field4971 != -1) {
                                var33 -= 25;
                                class154.field2183[var55.field4971].method867(arg1 + class401.field5848[0] - 12, var33);
                                var33 -= 2;
                            }
                        } else if (var30.field2900 >= 0 && var30.field2900 < class154.field2183.length) {
                            class130 var54 = class154.field2183[var30.field2900];
                            var33 -= 25;
                            var54.method867(class401.field5848[0] + arg1 - (var54.method880() >> 1), var33);
                            var33 -= 2;
                        }
                    }
                    int var10000;
                    if (!var31 instanceof class354) {
                        int var62 = 0;
                        class451[] var63 = class132.field1831;
                        for (int var64 = 0; var64 < var63.length; var64++) {
                            class451 var68 = var63[var64];
                            if (var68 != null && var68.field6581 == 1 && class280.field3837[var7 - class169.field2407] == var68.field6576) {
                                class130 var69 = class11.field150[var68.field6579];
                                if (var69.method876() > var62) {
                                    var62 = var69.method876();
                                }
                                if (class35.field541 % 20 < 10) {
                                    var69.method867(arg1 + class401.field5848[0] - 12, var33 + -var69.method876());
                                }
                            }
                        }
                        if (var62 > 0) {
                            var10000 = var33 - (var62 + 2);
                        }
                    } else if (var7 >= 0) {
                        int var56 = 0;
                        class451[] var57 = class132.field1831;
                        for (int var58 = 0; var58 < var57.length; var58++) {
                            class451 var60 = var57[var58];
                            if (var60 != null && var60.field6581 == 10 && class67.field1055[var7] == var60.field6576) {
                                class130 var61 = class11.field150[var60.field6579];
                                if (var56 < var61.method876()) {
                                    var56 = var61.method876();
                                }
                                var61.method867(class401.field5848[0] + arg1 - 12, -var61.method876() + var33);
                            }
                        }
                        if (var56 > 0) {
                            var10000 = var33 - (var56 + 2);
                        }
                    }
                    for (int var66 = 0; var66 < 4; var66++) {
                        if (var31.field875[var66] > class35.field541) {
                            int var67 = var31.method407(arg2 - 82) / 2;
                            class280.method1720(arg5 >> 1, var67, arg0 >> 1, arg4, var31, -106, arg3);
                            if (class401.field5848[0] > -1) {
                                if (var66 == 1) {
                                    class401.field5848[1] -= 20;
                                }
                                if (var66 == 2) {
                                    class401.field5848[1] -= 10;
                                    class401.field5848[0] -= 15;
                                }
                                if (var66 == 3) {
                                    class401.field5848[1] -= 10;
                                    class401.field5848[0] += 15;
                                }
                                class71.field1099[var31.field853[var66]].method867(arg1 - (12 - class401.field5848[0]), class401.field5848[1] + arg6 + -12);
                                class403.field5875.method2277(arg6 + class401.field5848[1] + 3, Integer.toString(var31.field906[var66]), class401.field5848[0] + arg1 - 1, arg2 + -139, 0, -1);
                            }
                        }
                    }
                }
            }
        }
        for (int var8 = 0; var8 < class48.field743; var8++) {
            int var26 = class125.field1750[var8];
            class61 var27;
            if (var26 >= 2048) {
                var27 = class445.field6422[var26 - 2048];
            } else {
                var27 = class12.field153[var26];
            }
            int var28 = class30.field472[var8];
            class61 var29;
            if (var28 >= 2048) {
                var29 = class445.field6422[var28 - 2048];
            } else {
                var29 = class12.field153[var28];
            }
            class61.method398(true, var29, arg3, --var27.field866, arg6, arg4, arg1, arg5, var27, arg0);
        }
        int var9 = class204.field2769.field1025 + class204.field2769.field1015 + 2;
        for (int var10 = 0; var10 < class300.field4162; var10++) {
            int var11 = class231.field3108[var10];
            int var12 = class231.field3106[var10];
            int var13 = class231.field3113[var10];
            boolean var14 = true;
            while (var14) {
                var14 = false;
                for (int var25 = 0; var25 < var10; var25++) {
                    if ((var12 + 2) > (class231.field3106[var25] - var9) && class231.field3106[var25] + 2 > -var9 + var12 && var11 - var13 < class231.field3108[var25] - -class231.field3113[var25] && (class231.field3108[var25] - class231.field3113[var25]) < (var11 + var13) && var12 > class231.field3106[var25] - var9) {
                        var12 = class231.field3106[var25] - var9;
                        var14 = true;
                    }
                }
            }
            class231.field3106[var10] = var12;
            String var15 = class231.field3112[var10];
            if (class8.field129 == 0) {
                int var16 = 16776960;
                if (class231.field3099[var10] < 6) {
                    var16 = class353.field4937[class231.field3099[var10]];
                }
                if (class231.field3099[var10] == 6) {
                    var16 = (class64.field991 % 20) < 10 ? 16711680 : 16776960;
                }
                if (class231.field3099[var10] == 7) {
                    var16 = class64.field991 % 20 < 10 ? 255 : 65535;
                }
                if (class231.field3099[var10] == 8) {
                    var16 = (class64.field991 % 20) < 10 ? 45056 : 8454016;
                }
                if (class231.field3099[var10] == 9) {
                    int var17 = 150 - class231.field3102[var10];
                    if (var17 < 50) {
                        var16 = var17 * 1280 + 16711680;
                    } else if (var17 < 100) {
                        var16 = 16776960 - ((var17 - 50) * 327680);
                    } else if (var17 < 150) {
                        var16 = var17 * 5 + 65280 - 500;
                    }
                }
                if (class231.field3099[var10] == 10) {
                    int var18 = 150 - class231.field3102[var10];
                    if (var18 < 50) {
                        var16 = var18 * 5 + 16711680;
                    } else if (var18 < 100) {
                        var16 = 16711935 - (var18 - 50) * 327680;
                    } else if (var18 < 150) {
                        var16 = (var18 - 100) * 327680 + 255 - ((var18 - 100) * 5);
                    }
                }
                if (class231.field3099[var10] == 11) {
                    int var19 = 150 - class231.field3102[var10];
                    if (var19 < 50) {
                        var16 = 16777215 - (var19 * 327685);
                    } else if (var19 < 100) {
                        var16 = (var19 - 50) * 327685 + 65280;
                    } else if (var19 < 150) {
                        var16 = 16777215 - ((var19 - 100) * 327680);
                    }
                }
                int var20 = var16 | 0xFF000000;
                if (class231.field3107[var10] == 0) {
                    class220.field2899.method2277(arg6 + var12, var15, arg1 + var11, -50, -16777216, var20);
                }
                if (class231.field3107[var10] == 1) {
                    class220.field2899.method2271(arg6 + var12, arg1 + var11, var15, class64.field991, (byte) 120, var20, -16777216);
                }
                if (class231.field3107[var10] == 2) {
                    class220.field2899.method2267(arg1 + var11, (byte) 97, -16777216, arg6 + var12, class64.field991, var15, var20);
                }
                if (class231.field3107[var10] == 3) {
                    class220.field2899.method2268(class64.field991, arg1 + var11, arg6 + var12, var20, 150 - class231.field3102[var10], -977, -16777216, var15);
                }
                if (class231.field3107[var10] == 4) {
                    int var21 = (150 - class231.field3102[var10]) * (class204.field2769.method448((byte) -118, var15) + 100) / 150;
                    class408.field5920.method1776(arg1 + var11 - 50, arg6, arg1 + var11 + 50, arg0 + arg6);
                    class220.field2899.method2278(var20, arg6 + var12, -16777216, var15, (byte) -102, arg1 - (var21 - var11 - 50));
                    class408.field5920.method1735(arg1, arg6, arg1 + arg5, arg0 + arg6);
                }
                if (class231.field3107[var10] == 5) {
                    int var22 = 150 - class231.field3102[var10];
                    int var23 = 0;
                    if (var22 < 25) {
                        var23 = var22 - 25;
                    } else if (var22 > 125) {
                        var23 = var22 - 125;
                    }
                    int var24 = class204.field2769.field1025 + class204.field2769.field1015;
                    class408.field5920.method1776(arg1, var12 + arg6 - var24 - 1, arg1 + arg5, arg6 + var12 + 5);
                    class220.field2899.method2277(arg6 + var12 + var23, var15, arg1 + var11, -19, -16777216, var20);
                    class408.field5920.method1735(arg1, arg6, arg1 + arg5, arg0 + arg6);
                }
            } else {
                class220.field2899.method2277(arg6 + var12, var15, arg1 + var11, -36, -16777216, -256);
            }
        }
        if (arg2 != 20) {
            field6572 = -69;
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(I)V")
    public static void method2822(int arg0) {
        field6566 = null;
        if (arg0 != 2) {
            field6574 = 1;
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIIILj;)V")
    public static final void method2823(int arg0, int arg1, int arg2, int arg3, class319 arg4) {
        arg4.field4382 = (arg1 << 7) + 64;
        arg4.field4376 = arg3;
        arg4.field4380 = (arg2 << 7) + 64;
        class142 var5 = class5.field79[arg0][arg1][arg2];
        if (var5 != null) {
            int var6 = 0;
            for (class218 var7 = var5.field2043; var7 != null; var7 = var7.field2884) {
                if (var7.field2882.field6196) {
                    int var8 = var7.field2882.method600(true);
                    if (var8 != -32768 && var8 < var6) {
                        var6 = var8;
                    }
                }
            }
            if (var6 < 0) {
                arg4.field4376 += var6;
                arg4.field4379 = true;
            }
        }
        if (class5.field79[arg0][arg1][arg2] == null) {
            class61.method403(arg0, arg1, arg2);
        }
        class5.field79[arg0][arg1][arg2].field2038 = arg4;
    }
}
