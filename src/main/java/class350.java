import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class350 {

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "I")
    public static int field5385 = 20;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "Ldp;")
    public static class347 field5381 = new class347("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
    public static int field5382;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "I")
    public static int field5383;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "I")
    public static int field5384;

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "I")
    public static int field5386;

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "I")
    public static int field5387;

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "I")
    public static int field5388;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIZB[[[Lrr;I)Z", line = 3)
    public static final boolean method2115(int arg0, int arg1, boolean arg2, byte arg3, class306[][][] arg4, int arg5) {
        field5382++;
        byte var6 = arg2 ? 1 : (byte) (class439.field6459 & 0xFF);
        if (class274.field4082[class521.field7651][arg5][arg0] == var6) {
            return false;
        } else if ((class524.field7736[class521.field7651][arg5][arg0] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            if (arg3 != 85) {
                field5381 = null;
            }
            int var8 = 0;
            class384.field5795[var7] = arg5;
            int var35 = var7 + 1;
            class85.field1345[var7] = arg0;
            class274.field4082[class521.field7651][arg5][arg0] = var6;
            while (var35 != var8) {
                int var9 = class384.field5795[var8] & 0xFFFF;
                int var10 = (class384.field5795[var8] & 0xFF6184) >> 16;
                int var11 = class384.field5795[var8] >> 24 & 0xFF;
                int var12 = class85.field1345[var8] & 0xFFFF;
                int var13 = class85.field1345[var8] >> 16 & 0xFF;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class524.field7736[class521.field7651][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label237: for (int var16 = class521.field7651 + 1; var16 <= 3; var16++) {
                    if ((class524.field7736[var16][var9][var12] & 0x8) == 0) {
                        if (var14 && arg4[var16][var9][var12] != null) {
                            if (arg4[var16][var9][var12].field4596 != null) {
                                int var20 = class166.method1160((byte) -113, var10);
                                if (arg4[var16][var9][var12].field4596.field7502 == var20 || arg4[var16][var9][var12].field4582 != null && arg4[var16][var9][var12].field4582.field7502 == var20) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var21 = class166.method1160((byte) -113, var11);
                                    if (arg4[var16][var9][var12].field4596.field7502 == var21 || arg4[var16][var9][var12].field4582 != null && arg4[var16][var9][var12].field4582.field7502 == var21) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var22 = class166.method1160((byte) -113, var13);
                                    if (arg4[var16][var9][var12].field4596.field7502 == var22 || arg4[var16][var9][var12].field4582 != null && arg4[var16][var9][var12].field4582.field7502 == var22) {
                                        continue;
                                    }
                                }
                            }
                            class306 var23 = arg4[var16][var9][var12];
                            if (var23.field4589 != null) {
                                for (class17 var24 = var23.field4589; var24 != null; var24 = var24.field281) {
                                    class522 var25 = var24.field279;
                                    if (var25 instanceof class401) {
                                        class401 var26 = (class401) var25;
                                        int var27 = var26.method222((byte) -106);
                                        int var28 = var26.method223(-19634);
                                        if (var27 == 21) {
                                            var27 = 19;
                                        }
                                        int var29 = var28 << 6 | var27;
                                        if (var10 == var29 || var11 != 0 && var11 == var29 || var13 != 0 && var13 == var29) {
                                            continue label237;
                                        }
                                    }
                                }
                            }
                        }
                        class306 var30 = arg4[var16][var9][var12];
                        if (var30 != null && var30.field4589 != null) {
                            for (class17 var31 = var30.field4589; var31 != null; var31 = var31.field281) {
                                class522 var32 = var31.field279;
                                if (var32.field7687 != var32.field7683 || var32.field7676 != var32.field7673) {
                                    for (int var33 = var32.field7687; var33 <= var32.field7683; var33++) {
                                        for (int var34 = var32.field7676; var34 <= var32.field7673; var34++) {
                                            class274.field4082[var16][var33][var34] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class274.field4082[var16][var9][var12] = var6;
                    }
                }
                if (var15) {
                    int var17 = class249.field3405[class521.field7651 + 1].method707(var9, var12);
                    if (var17 > class349.field5380[arg1]) {
                        class349.field5380[arg1] = var17;
                    }
                    int var18 = var9 << 7;
                    int var19 = var12 << 7;
                    if (var18 < class52.field671[arg1]) {
                        class52.field671[arg1] = var18;
                    } else if (var18 > class455.field6666[arg1]) {
                        class455.field6666[arg1] = var18;
                    }
                    if (class12.field119[arg1] > var19) {
                        class12.field119[arg1] = var19;
                    } else if (var19 > class170.field2499[arg1]) {
                        class170.field2499[arg1] = var19;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class274.field4082[class521.field7651][var9 - 1][var12] != var6) {
                        class384.field5795[var35] = class390.method2340(-754974720, class390.method2340(var9 - 1, 1179648));
                        class85.field1345[var35] = class390.method2340(1245184, var12);
                        class274.field4082[class521.field7651][var9 - 1][var12] = var6;
                        var35 = var35 + 1 & 0xFFF;
                    }
                    int var10000 = ~class448.field6611;
                    var12++;
                    if (var10000 < ~var12) {
                        if ((var9 - 1) >= 0 && class274.field4082[class521.field7651][var9 - 1][var12] != var6 && (class524.field7736[class521.field7651][var9][var12] & 0x4) == 0 && (class524.field7736[class521.field7651][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class384.field5795[var35] = class390.method2340(1375731712, class390.method2340(1179648, var9 - 1));
                            class85.field1345[var35] = class390.method2340(1245184, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class274.field4082[class521.field7651][var9 - 1][var12] = var6;
                        }
                        if (class274.field4082[class521.field7651][var9][var12] != var6) {
                            class384.field5795[var35] = class390.method2340(class390.method2340(5373952, var9), 318767104);
                            class85.field1345[var35] = class390.method2340(5439488, var12);
                            class274.field4082[class521.field7651][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (var9 + 1 < class50.field640 && class274.field4082[class521.field7651][var9 + 1][var12] != var6 && (class524.field7736[class521.field7651][var9][var12] & 0x4) == 0 && (class524.field7736[class521.field7651][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class384.field5795[var35] = class390.method2340(class390.method2340(5373952, var9 + 1), -1845493760);
                            class85.field1345[var35] = class390.method2340(5439488, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class274.field4082[class521.field7651][var9 + 1][var12] = var6;
                        }
                    }
                    var12--;
                    if (var9 + 1 < class50.field640 && class274.field4082[class521.field7651][var9 + 1][var12] != var6) {
                        class384.field5795[var35] = class390.method2340(1392508928, class390.method2340(9568256, var9 + 1));
                        class85.field1345[var35] = class390.method2340(var12, 9633792);
                        class274.field4082[class521.field7651][var9 + 1][var12] = var6;
                        var35 = var35 + 1 & 0xFFF;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if ((var9 - 1) >= 0 && class274.field4082[class521.field7651][var9 - 1][var12] != var6 && (class524.field7736[class521.field7651][var9][var12] & 0x4) == 0 && (class524.field7736[class521.field7651][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class384.field5795[var35] = class390.method2340(301989888, class390.method2340(13762560, var9 - 1));
                            class85.field1345[var35] = class390.method2340(var12, 13828096);
                            var35 = var35 + 1 & 0xFFF;
                            class274.field4082[class521.field7651][var9 - 1][var12] = var6;
                        }
                        if (class274.field4082[class521.field7651][var9][var12] != var6) {
                            class384.field5795[var35] = class390.method2340(class390.method2340(var9, 13762560), -1828716544);
                            class85.field1345[var35] = class390.method2340(var12, 13828096);
                            class274.field4082[class521.field7651][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if ((var9 + 1) < class50.field640 && class274.field4082[class521.field7651][var9 + 1][var12] != var6 && (class524.field7736[class521.field7651][var9][var12] & 0x4) == 0 && (class524.field7736[class521.field7651][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class384.field5795[var35] = class390.method2340(class390.method2340(9568256, var9 + 1), -771751936);
                            class85.field1345[var35] = class390.method2340(var12, 9633792);
                            var35 = var35 + 1 & 0xFFF;
                            class274.field4082[class521.field7651][var9 + 1][var12] = var6;
                        }
                    }
                }
            }
            if (class349.field5380[arg1] != -1000000) {
                class349.field5380[arg1] += 10;
                class52.field671[arg1] -= 50;
                class455.field6666[arg1] += 50;
                class170.field2499[arg1] += 50;
                class12.field119[arg1] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V", line = 329)
    public static void method2116(int arg0) {
        field5381 = null;
        if (arg0 != 1) {
            method2116(-65);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIBI)V", line = 346)
    public static final void method2117(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field5384++;
        if (arg3 != -67) {
            method2116(-30);
        }
        for (class203 var5 = (class203) class184.field2723.method2957(arg3 + 162); var5 != null; var5 = (class203) class184.field2723.method2947(-100)) {
            class498.method2966(arg0, arg2, arg1, (byte) -122, arg4, var5);
        }
        for (class203 var6 = (class203) class150.field2286.method2957(-106); var6 != null; var6 = (class203) class150.field2286.method2947(-73)) {
            byte var11 = 1;
            class192 var12 = var6.field2950.method2415(arg3 + 67);
            if (var6.field2950.field5979) {
                var11 = 0;
            } else if (var6.field2950.field6043 == var12.field2832 || var6.field2950.field6043 == var12.field2834 || var6.field2950.field6043 == var12.field2802 || var6.field2950.field6043 == var12.field2815) {
                var11 = 2;
            } else if (var6.field2950.field6043 == var12.field2814 || var6.field2950.field6043 == var12.field2809 || var6.field2950.field6043 == var12.field2813 || var6.field2950.field6043 == var12.field2841) {
                var11 = 3;
            }
            if (var6.field2955 != var11) {
                int var13 = class275.method1716(true, var6.field2950);
                if (var6.field2967 != var13) {
                    if (var6.field2959 != null) {
                        class176.field2598.method2372(var6.field2959);
                        var6.field2959 = null;
                    }
                    var6.field2967 = var13;
                }
                var6.field2955 = var11;
            }
            var6.field2963 = var6.field2950.field7681;
            var6.field2958 = var6.field2950.field7681 + (var6.field2950.method2419((byte) 113) << 6);
            var6.field2954 = var6.field2950.field7671;
            var6.field2947 = var6.field2950.field7671 + (var6.field2950.method2419((byte) 125) << 6);
            class498.method2966(arg0, arg2, arg1, (byte) -127, arg4, var6);
        }
        for (class203 var7 = (class203) class22.field323.method3061(-16817); var7 != null; var7 = (class203) class22.field323.method3066((byte) 126)) {
            byte var8 = 1;
            class192 var9 = var7.field2968.method2415(0);
            if (var7.field2968.field5979) {
                var8 = 0;
            } else if (var7.field2968.field6043 == var9.field2832 || var7.field2968.field6043 == var9.field2834 || var7.field2968.field6043 == var9.field2802 || var7.field2968.field6043 == var9.field2815) {
                var8 = 2;
            } else if (var7.field2968.field6043 == var9.field2814 || var7.field2968.field6043 == var9.field2809 || var7.field2968.field6043 == var9.field2813 || var7.field2968.field6043 == var9.field2841) {
                var8 = 3;
            }
            if (var7.field2955 != var8) {
                int var10 = class457.method2655(var7.field2968, 0);
                if (var7.field2967 != var10) {
                    if (var7.field2959 != null) {
                        class176.field2598.method2372(var7.field2959);
                        var7.field2959 = null;
                    }
                    var7.field2967 = var10;
                }
                var7.field2955 = var8;
            }
            var7.field2963 = var7.field2968.field7681;
            var7.field2958 = var7.field2968.field7681 + (var7.field2968.method2419((byte) 111) << 6);
            var7.field2954 = var7.field2968.field7671;
            var7.field2947 = var7.field2968.field7671 + (var7.field2968.method2419((byte) 127) << 6);
            class498.method2966(arg0, arg2, arg1, (byte) -123, arg4, var7);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IBII)I", line = 460)
    public static final int method2118(int arg0, byte arg1, int arg2, int arg3) {
        field5386++;
        if (arg3 > 243) {
            arg2 >>= 0x4;
        } else if (arg3 > 217) {
            arg2 >>= 0x3;
        } else if (arg3 > 192) {
            arg2 >>= 0x2;
        } else if (arg3 > 179) {
            arg2 >>= 0x1;
        }
        return arg1 > -46 ? -80 : (arg2 >> 5 << 7) + ((arg0 >> 2 & 0x3F) << 10) + (arg3 >> 1);
    }
}
