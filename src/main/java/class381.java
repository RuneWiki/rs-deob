import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class381 extends class447 implements class395 {

    @OriginalMember(owner = "client!jc", name = "J", descriptor = "Lcp;")
    public class397 field5397;

    @OriginalMember(owner = "client!jc", name = "R", descriptor = "Z")
    private boolean field5405;

    @OriginalMember(owner = "client!jc", name = "H", descriptor = "I")
    public static int field5395 = 1;

    @OriginalMember(owner = "client!jc", name = "eb", descriptor = "[C")
    public static char[] field5418 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!jc", name = "ab", descriptor = "[I")
    private static int[] field5414 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!jc", name = "I", descriptor = "I")
    public static int field5396;

    @OriginalMember(owner = "client!jc", name = "K", descriptor = "I")
    public static int field5398;

    @OriginalMember(owner = "client!jc", name = "L", descriptor = "I")
    public static int field5399;

    @OriginalMember(owner = "client!jc", name = "M", descriptor = "I")
    public static int field5400;

    @OriginalMember(owner = "client!jc", name = "N", descriptor = "I")
    public static int field5401;

    @OriginalMember(owner = "client!jc", name = "O", descriptor = "I")
    public static int field5402;

    @OriginalMember(owner = "client!jc", name = "P", descriptor = "I")
    public static int field5403;

    @OriginalMember(owner = "client!jc", name = "Q", descriptor = "I")
    public static int field5404;

    @OriginalMember(owner = "client!jc", name = "S", descriptor = "I")
    public static int field5406;

    @OriginalMember(owner = "client!jc", name = "T", descriptor = "I")
    public static int field5407;

    @OriginalMember(owner = "client!jc", name = "U", descriptor = "I")
    public static int field5408;

    @OriginalMember(owner = "client!jc", name = "V", descriptor = "I")
    public static int field5409;

    @OriginalMember(owner = "client!jc", name = "W", descriptor = "I")
    public static int field5410;

    @OriginalMember(owner = "client!jc", name = "X", descriptor = "I")
    public static int field5411;

    @OriginalMember(owner = "client!jc", name = "Y", descriptor = "I")
    public static int field5412;

    @OriginalMember(owner = "client!jc", name = "Z", descriptor = "I")
    public static int field5413;

    @OriginalMember(owner = "client!jc", name = "bb", descriptor = "I")
    public static int field5415;

    @OriginalMember(owner = "client!jc", name = "cb", descriptor = "I")
    public static int field5416;

    @OriginalMember(owner = "client!jc", name = "db", descriptor = "Ldp;")
    public static class174 field5417;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2410(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class322.field4652 = 0;
        ++field5406;
        for (int var7 = -1; var7 < class21.field317 - -class156.field2376; ++var7) {
            class11 var30 = null;
            class390 var31;
            if (var7 >= 0) {
                if (~var7 > ~class21.field317) {
                    var31 = class367.field5225[class75.field1290[var7]];
                } else {
                    var31 = class447.field6512[class416.field6027[-class21.field317 + var7]];
                    var30 = ((class98) var31).field1545;
                    if (var30.field135 != null) {
                        var30 = var30.method75(0);
                        if (var30 == null) {
                            continue;
                        }
                    }
                }
            } else {
                var31 = class86.field1394;
            }
            if (~var31.field5686 <= -1) {
                class7.method50(arg6, var31.method818(-31403), -20504, arg2 >> 1, arg5 >> 1, arg3, var31);
                if (class435.field6340[0] >= 0) {
                    if (var31.field5678 != null && (~class21.field317 >= ~var7 || ~class26.field391 == -1 || ~class26.field391 == -4 || ~class26.field391 == -2 && class110.method962(((class127) var31).field2066, 15)) && ~class322.field4652 > ~class443.field6446) {
                        class443.field6433[class322.field4652] = class150.field2295.method1448(var31.field5678, -20814) / 2;
                        class443.field6442[class322.field4652] = class435.field6340[0];
                        class443.field6427[class322.field4652] = class435.field6340[1];
                        class443.field6431[class322.field4652] = var31.field5652;
                        class443.field6432[class322.field4652] = var31.field5655;
                        class443.field6445[class322.field4652] = var31.field5628;
                        class443.field6440[class322.field4652] = var31.field5678;
                        ++class322.field4652;
                    }
                    class421 var32 = class140.field2223[0];
                    int var33 = class435.field6340[1] + (arg0 - Math.max(class150.field2295.field2734, var32.method1467()));
                    if (!var31.field5663 && class267.field4002 < var31.field5669) {
                        class421 var34 = class140.field2223[1];
                        if (var31 instanceof class98) {
                            class98 var35 = (class98) var31;
                            class421[] var36 = (class421[]) class329.field4734.method103(0, (long) var35.field1545.field147);
                            if (var36 == null) {
                                class344[] var37 = class344.method2211(class100.field1561, var35.field1545.field147, 0);
                                if (var37 != null) {
                                    var36 = new class421[var37.length];
                                    for (int var38 = 0; var37.length > var38; ++var38) {
                                        var36[var38] = class73.field1235.method734(var37[var38], true);
                                    }
                                    class329.field4734.method113(var36, 0, (long) var35.field1545.field147);
                                }
                            }
                            if (var36 != null && ~var36.length == -3) {
                                var34 = var36[1];
                                var32 = var36[0];
                            }
                        }
                        int var39 = class435.field6340[0] + arg4 - (var32.method1469() >> 1);
                        var32.method2645(var39, var33);
                        int var40 = var32.method1469() * var31.field5670 / 255;
                        class73.field1235.method672(var39, var33, var39 + var40, var32.method1467() + var33);
                        var34.method2645(var39, var33);
                        class73.field1235.method752(arg4, arg0, arg4 - -arg2, arg0 + arg5);
                    }
                    var33 -= 2;
                    if (!var31.field5663) {
                        if (~class267.field4002 > ~var31.field5610) {
                            class421 var41 = class52.field856[!var31.field5632 ? 0 : 2];
                            class421 var42 = class52.field856[!var31.field5632 ? 1 : 3];
                            boolean var43 = true;
                            int var44;
                            if (!(var31 instanceof class98)) {
                                var44 = var31.method2476((byte) 117).field6112;
                            } else {
                                var44 = var30.field196;
                                if (~var44 == 0) {
                                    var44 = var31.method2476((byte) 101).field6112;
                                }
                            }
                            if (~var44 != 0) {
                                class421[] var45 = (class421[]) class257.field3722.method103(0, (long) var44);
                                if (var45 == null) {
                                    class344[] var46 = class344.method2211(class100.field1561, var44, 0);
                                    if (var46 != null) {
                                        var45 = new class421[var46.length];
                                        for (int var47 = 0; var47 < var46.length; ++var47) {
                                            var45[var47] = class73.field1235.method734(var46[var47], true);
                                        }
                                        class257.field3722.method113(var45, 0, (long) var44);
                                    }
                                }
                                if (var45 != null && var45.length == 4) {
                                    var41 = var45[var31.field5632 ? 2 : 0];
                                    var42 = var45[!var31.field5632 ? 1 : 3];
                                }
                            }
                            int var48 = -class267.field4002 + var31.field5610;
                            int var51;
                            if (var31.field5638 < var48) {
                                int var49 = var48 - var31.field5638;
                                int var50 = ~var31.field5653 == -1 ? 0 : (var31.field5602 - var49) / var31.field5653 * var31.field5653;
                                var51 = var41.method1469() * var50 / var31.field5602;
                            } else {
                                var51 = var41.method1469();
                            }
                            int var52 = var41.method1467();
                            var33 -= var52;
                            int var53 = class435.field6340[0] + arg4 + -(var41.method1469() >> 1);
                            var41.method2645(var53, var33);
                            class73.field1235.method672(var53, var33, var51 + var53, var33 + var52);
                            var42.method2645(var53, var33);
                            class73.field1235.method752(arg4, arg0, arg2 + arg4, arg0 - -arg5);
                            var33 -= 2;
                        }
                        if (class21.field317 > var7) {
                            class127 var54 = (class127) var31;
                            if (var54.field2049 != -1) {
                                var33 -= 25;
                                class210.field3088[var54.field2049].method2645(arg4 + -12 - -class435.field6340[0], var33);
                                var33 -= 2;
                            }
                            if (~var54.field2054 != 0) {
                                var33 -= 25;
                                class186.field2739[var54.field2054].method2645(arg4 - 12 + class435.field6340[0], var33);
                                var33 -= 2;
                            }
                        } else if (~var30.field165 <= -1 && var30.field165 < class186.field2739.length) {
                            class421 var55 = class186.field2739[var30.field165];
                            var33 -= 25;
                            var55.method2645(class435.field6340[0] + (arg4 - (var55.method1469() >> 1)), var33);
                            var33 -= 2;
                        }
                    }
                    int var10000;
                    if (var31 instanceof class127) {
                        if (~var7 <= -1) {
                            int var56 = 0;
                            class257[] var57 = class431.field6220;
                            for (int var58 = 0; ~var58 > ~var57.length; ++var58) {
                                class257 var60 = var57[var58];
                                if (var60 != null && ~var60.field3713 == -11 && class75.field1290[var7] == var60.field3708) {
                                    class421 var61 = class277.field4169[var60.field3721];
                                    if (~var61.method1467() < ~var56) {
                                        var56 = var61.method1467();
                                    }
                                    var61.method2645(arg4 + -12 + class435.field6340[0], var33 - var61.method1467());
                                }
                            }
                            if (~var56 < -1) {
                                var10000 = var33 - (var56 - -2);
                            }
                        }
                    } else {
                        int var62 = 0;
                        class257[] var63 = class431.field6220;
                        for (int var64 = 0; var64 < var63.length; ++var64) {
                            class257 var68 = var63[var64];
                            if (var68 != null && var68.field3713 == 1 && class416.field6027[-class21.field317 + var7] == var68.field3708) {
                                class421 var69 = class277.field4169[var68.field3721];
                                if (var62 < var69.method1467()) {
                                    var62 = var69.method1467();
                                }
                                if (~(class267.field4002 % 20) > -11) {
                                    var69.method2645(arg4 + -12 + class435.field6340[0], var33 - var69.method1467());
                                }
                            }
                        }
                        if (var62 > 0) {
                            var10000 = var33 - (var62 + 2);
                        }
                    }
                    for (int var66 = 0; var66 < 4; ++var66) {
                        if (var31.field5618[var66] > class267.field4002) {
                            int var67 = var31.method818(-31403) / 2;
                            class7.method50(arg6, var67, -20504, arg2 >> 1, arg5 >> 1, arg3, var31);
                            if (class435.field6340[0] > -1) {
                                if (~var66 == -2) {
                                    class435.field6340[1] -= 20;
                                }
                                if (~var66 == -3) {
                                    class435.field6340[1] -= 10;
                                    class435.field6340[0] -= 15;
                                }
                                if (var66 == 3) {
                                    class435.field6340[0] += 15;
                                    class435.field6340[1] -= 10;
                                }
                                class333.field4784[var31.field5639[var66]].method2645(arg4 + -12 + class435.field6340[0], arg0 + -12 - -class435.field6340[1]);
                                class273.field4110.method1670(-1, class435.field6340[0] + -1 + arg4, Integer.toString(var31.field5666[var66]), -32009, 0, arg0 + 3 - -class435.field6340[1]);
                            }
                        }
                    }
                }
            }
        }
        if (arg1 < 113) {
            field5414 = null;
        }
        for (int var8 = 0; ~class387.field5547 < ~var8; ++var8) {
            int var26 = class205.field3006[var8];
            class390 var27;
            if (~var26 > -2049) {
                var27 = class367.field5225[var26];
            } else {
                var27 = class447.field6512[var26 + -2048];
            }
            int var28 = class47.field760[var8];
            class390 var29;
            if (var28 >= 2048) {
                var29 = class447.field6512[var28 + -2048];
            } else {
                var29 = class367.field5225[var28];
            }
            class342.method2206(arg3, arg6, arg2, arg4, arg5, var27, --var27.field5664, (byte) 121, arg0, var29);
        }
        int var9 = class150.field2295.field2740 + 2 + class150.field2295.field2734;
        for (int var10 = 0; ~var10 > ~class322.field4652; ++var10) {
            int var11 = class443.field6442[var10];
            int var12 = class443.field6427[var10];
            int var13 = class443.field6433[var10];
            boolean var14 = true;
            while (var14) {
                var14 = false;
                for (int var25 = 0; var25 < var10; ++var25) {
                    if (~(var12 + 2) < ~(class443.field6427[var25] + -var9) && class443.field6427[var25] + 2 > -var9 + var12 && var11 - var13 < class443.field6442[var25] + class443.field6433[var25] && var11 + var13 > class443.field6442[var25] + -class443.field6433[var25] && ~var12 < ~(class443.field6427[var25] + -var9)) {
                        var12 = class443.field6427[var25] + -var9;
                        var14 = true;
                    }
                }
            }
            class443.field6427[var10] = var12;
            String var15 = class443.field6440[var10];
            if (~class409.field5960 != -1) {
                class250.field3620.method1670(-256, arg4 - -var11, var15, -32009, -16777216, arg0 + var12);
            } else {
                int var16 = 16776960;
                if (class443.field6431[var10] < 6) {
                    var16 = field5414[class443.field6431[var10]];
                }
                if (class443.field6431[var10] == 6) {
                    var16 = class49.field794 % 20 < 10 ? 16711680 : 16776960;
                }
                if (~class443.field6431[var10] == -8) {
                    var16 = ~(class49.field794 % 20) <= -11 ? 65535 : 255;
                }
                if (class443.field6431[var10] == 8) {
                    var16 = class49.field794 % 20 < 10 ? 45056 : 8454016;
                }
                if (class443.field6431[var10] == 9) {
                    int var17 = -class443.field6445[var10] + 150;
                    if (var17 >= 50) {
                        if (~var17 <= -101) {
                            if (var17 < 150) {
                                var16 = var17 * 5 + 64780;
                            }
                        } else {
                            var16 = -((var17 + -50) * 327680) + 16776960;
                        }
                    } else {
                        var16 = 16711680 - -(var17 * 1280);
                    }
                }
                if (~class443.field6431[var10] == -11) {
                    int var18 = -class443.field6445[var10] + 150;
                    if (~var18 > -51) {
                        var16 = var18 * 5 + 16711680;
                    } else if (var18 >= 100) {
                        if (var18 < 150) {
                            var16 = 255 - (-((var18 + -100) * 327680) - -((var18 + -100) * 5));
                        }
                    } else {
                        var16 = -((var18 - 50) * 327680) + 16711935;
                    }
                }
                if (~class443.field6431[var10] == -12) {
                    int var19 = 150 - class443.field6445[var10];
                    if (~var19 <= -51) {
                        if (~var19 <= -101) {
                            if (var19 < 150) {
                                var16 = 16777215 - (var19 - 100) * 327680;
                            }
                        } else {
                            var16 = (var19 + -50) * 327685 + 65280;
                        }
                    } else {
                        var16 = 16777215 - var19 * 327685;
                    }
                }
                int var20 = -16777216 | var16;
                if (class443.field6432[var10] == 0) {
                    class250.field3620.method1670(var20, arg4 - -var11, var15, -32009, -16777216, arg0 + var12);
                }
                if (class443.field6432[var10] == 1) {
                    class250.field3620.method1666(var15, class49.field794, arg0 + var12, -1, arg4 + var11, -16777216, var20);
                }
                if (~class443.field6432[var10] == -3) {
                    class250.field3620.method1671(var20, var15, arg0 + var12, -806, arg4 + var11, -16777216, class49.field794);
                }
                if (class443.field6432[var10] == 3) {
                    class250.field3620.method1669(var20, arg4 + var11, 62, -16777216, class49.field794, var15, -class443.field6445[var10] + 150, arg0 + var12);
                }
                if (class443.field6432[var10] == 4) {
                    int var21 = (-class443.field6445[var10] + 150) * (100 + class150.field2295.method1448(var15, -20814)) / 150;
                    class73.field1235.method672(var11 + -50 + arg4, arg0, arg4 + 50 + var11, arg0 + arg5);
                    class250.field3620.method1677(arg0 + var12, var20, (byte) 20, -16777216, var15, -var21 + 50 + arg4 + var11);
                    class73.field1235.method752(arg4, arg0, arg4 - -arg2, arg0 + arg5);
                }
                if (~class443.field6432[var10] == -6) {
                    int var22 = -class443.field6445[var10] + 150;
                    int var23 = 0;
                    if (var22 >= 25) {
                        if (~var22 < -126) {
                            var23 = var22 + -125;
                        }
                    } else {
                        var23 = var22 + -25;
                    }
                    int var24 = class150.field2295.field2740 + class150.field2295.field2734;
                    class73.field1235.method672(arg4, -var24 + var12 + arg0 + -1, arg2 + arg4, arg0 + var12 - -5);
                    class250.field3620.method1670(var20, arg4 - -var11, var15, -32009, -16777216, arg0 - -var12 - -var23);
                    class73.field1235.method752(arg4, arg0, arg2 + arg4, arg0 - -arg5);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "(II)V")
    public static final void method2411(int arg0, int arg1) {
        class50.method402(29348);
        ++field5411;
        class21.method141((byte) -73);
        int var2 = class92.method780((byte) -115, arg1).field3688;
        if (~var2 != -1) {
            if (arg0 == 0) {
                int var3 = class351.field4988[arg1];
                if (~var2 == -6) {
                    class60.field963 = var3;
                }
                if (~var2 == -7) {
                    class409.field5960 = var3;
                }
                if (var2 == 9) {
                    class392.field5735 = var3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(B)Z")
    public final boolean method53(byte arg0) {
        if (arg0 < 58) {
            return true;
        } else {
            ++field5410;
            return false;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILja;II)Z")
    public final boolean method132(int arg0, class90 arg1, int arg2, int arg3) {
        ++field5413;
        class100 var5 = this.field5397.method2522(false, arg1, super.field6520, 65536, false, (byte) -38, super.field6519);
        if (var5 == null) {
            return false;
        } else {
            class202 var6 = arg1.method709();
            var6.method1527(super.field6520, super.field6506, super.field6519);
            return arg2 != 28033 ? true : var5.method574(arg3, arg0, var6, false);
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)I")
    public final int method1024(int arg0) {
        ++field5401;
        if (arg0 != 20691) {
            field5418 = null;
        }
        return this.field5397.field5827;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IBZIILnf;Lja;)V")
    public final void method47(int arg0, byte arg1, boolean arg2, int arg3, int arg4, class256 arg5, class90 arg6) {
        ++field5416;
        if (arg1 != 47) {
            this.method137(127, (class90) null);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lja;I)V")
    public final void method1021(class90 arg0, int arg1) {
        int var3 = -121 / ((arg1 - -58) / 56);
        this.field5397.method2523(-17547, arg0);
        ++field5396;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)Z")
    public final boolean method1018(byte arg0) {
        ++field5402;
        if (arg0 >= -16) {
            this.method53((byte) 52);
        }
        return this.field5397.method2536(16426);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILja;)V")
    public final void method137(int arg0, class90 arg1) {
        ++field5400;
        class100 var3 = this.field5397.method2522(true, arg1, super.field6520, 131072, true, (byte) -112, super.field6519);
        int var4 = -44 / ((-31 - arg0) / 51);
        if (var3 != null) {
            this.field5397.method2525(super.field6504, arg1, false, super.field6513, var3, false, super.field6526, super.field6508);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BLja;)Lkh;")
    public final class69 method134(byte arg0, class90 arg1) {
        ++field5404;
        class100 var3 = this.field5397.method2522(true, arg1, super.field6520, 1024, false, (byte) -47, super.field6519);
        if (var3 == null) {
            return null;
        } else if (arg0 <= 90) {
            return null;
        } else {
            class202 var4 = arg1.method709();
            var4.method1527(super.field6520, super.field6506, super.field6519);
            class69 var5 = null;
            if (this.field5405) {
                var5 = class256.method1849(1, 67);
            }
            if (this.field5397.field5813 == null) {
                var3.method530(var4, var5 == null ? null : var5.field1128[0], 0);
            } else {
                class30 var6 = this.field5397.field5813.method427();
                arg1.method698(var3, var6, var4, var5 != null ? var5.field1128[0] : null, 0);
            }
            this.field5397.method2525(super.field6504, arg1, false, super.field6513, var3, true, super.field6526, super.field6508);
            return var5;
        }
    }

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "(I)I")
    public final int method136(int arg0) {
        ++field5412;
        if (arg0 != 0) {
            this.method1018((byte) 30);
        }
        return this.field5397.method2535((byte) 88);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BILja;)Lrc;")
    public final class100 method1025(byte arg0, int arg1, class90 arg2) {
        if (arg0 != -84) {
            this.field5397 = null;
        }
        ++field5399;
        return this.field5397.method2522(false, arg2, 0, arg1, false, (byte) -95, 0);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)I")
    public final int method1013(boolean arg0) {
        ++field5403;
        if (arg0) {
            this.method54(-122);
        }
        return this.field5397.field5841;
    }

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "(I)V")
    public static void method2412(int arg0) {
        field5414 = null;
        if (arg0 != 199) {
            method2411(-113, 40);
        }
        field5418 = null;
        field5417 = null;
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(I)V")
    public final void method1023(int arg0) {
        ++field5408;
        if (arg0 <= 40) {
            field5395 = -92;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)I")
    public final int method1020(int arg0) {
        ++field5415;
        if (arg0 != 15829) {
            this.method47(105, (byte) 73, true, -121, 118, (class256) null, (class90) null);
        }
        return this.field5397.field5834;
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Lja;Lfb;IIIIIIIZIIIII)V")
    public class381(class90 arg0, class45 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg4, arg6, arg7, arg8, arg10, arg11, arg12, arg13, arg1.field671 == 1, class134.method1109(arg3, arg2, -10));
        this.field5397 = new class397(arg0, arg1, arg2, arg3, super.field6509, arg5, arg6, arg8, arg9, arg14);
        this.field5405 = arg1.field697 != 0;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZLja;)V")
    public final void method1022(boolean arg0, class90 arg1) {
        this.field5397.method2527(arg1, 123);
        if (!arg0) {
            method2410(-73, 23, -66, 122, 40, 126, 53);
        }
        ++field5398;
    }

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "(I)V")
    public final void method54(int arg0) {
        ++field5409;
        if (arg0 == 0) {
            throw new IllegalStateException();
        }
    }
}
