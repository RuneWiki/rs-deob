import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class259 extends class228 {

    @OriginalMember(owner = "client!rm", name = "r", descriptor = "I")
    private int field3437;

    @OriginalMember(owner = "client!rm", name = "x", descriptor = "I")
    private int field3443;

    @OriginalMember(owner = "client!rm", name = "w", descriptor = "I")
    private int field3442;

    @OriginalMember(owner = "client!rm", name = "t", descriptor = "I")
    private int field3439;

    @OriginalMember(owner = "client!rm", name = "l", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!rm", name = "m", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!rm", name = "o", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!rm", name = "p", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!rm", name = "q", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!rm", name = "s", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!rm", name = "u", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!rm", name = "v", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!rm", name = "n", descriptor = "Ltg;")
    public static class140 field3433;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)V", line = 5)
    public static void method1456(byte arg0) {
        field3433 = null;
        if (arg0 > -29) {
            method1456((byte) 52);
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lld;BLwm;II)V", line = 15)
    public static final void method1457(class105 arg0, byte arg1, class364 arg2, int arg3, int arg4) {
        class271.field3611.method645(0);
        ++field3436;
        if (arg1 == -80) {
            if (!class77.field1034) {
                for (class205 var5 = (class205) arg0.method652((byte) 37); var5 != null; var5 = (class205) arg0.method653(28)) {
                    class313 var6 = class55.field735.method2710(26, var5.field2775);
                    if (class330.method1835(8, var6)) {
                        boolean var7 = class14.method90(var5, arg4, arg2, var6, (byte) -88, arg3);
                        if (var7) {
                            class313.method1718(var5, var6, arg2, 2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "(III)I", line = 49)
    public static final int method1458(int arg0, int arg1, int arg2) {
        ++field3438;
        if (~arg0 == 0) {
            return 12345678;
        } else {
            if (arg2 != -9055) {
                method1459(false);
            }
            int var3 = (arg0 & 127) * arg1 >> 7;
            if (~var3 <= -3) {
                if (var3 > 126) {
                    var3 = 126;
                }
            } else {
                var3 = 2;
            }
            return (arg0 & 65408) + var3;
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(III)V", line = 74)
    public final void method180(int arg0, int arg1, int arg2) {
        ++field3441;
        int var4 = this.field3442 * arg2 >> 12;
        int var5 = this.field3439 * arg2 >> 12;
        int var6 = this.field3443 * arg1 >> 12;
        int var7 = this.field3437 * arg1 >> 12;
        if (arg0 == 0) {
            class274.method1543(var4, var7, var5, 186, super.field3002, super.field2999, var6);
        }
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(Z)V", line = 95)
    public static final void method1459(boolean arg0) {
        if (arg0) {
            ++field3434;
            int var1 = class239.field3187;
            int[] var2 = class265.field3502;
            for (int var3 = 0; var1 > var3; ++var3) {
                class487 var7 = class413.field5644[var2[var3]];
                if (var7 != null && var7.field1186 > 0) {
                    --var7.field1186;
                    if (~var7.field1186 == -1) {
                        var7.field1161 = null;
                    }
                }
            }
            for (int var4 = 0; var4 < class202.field2734; ++var4) {
                int var5 = class412.field5638[var4];
                class121 var6 = class221.field2941[var5];
                if (var6 != null && var6.field1186 > 0) {
                    --var6.field1186;
                    if (~var6.field1186 == -1) {
                        var6.field1161 = null;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(III)V", line = 151)
    public final void method178(int arg0, int arg1, int arg2) {
        ++field3440;
        int var4 = this.field3442 * arg1 >> 12;
        if (arg0 < 119) {
            this.field3439 = -67;
        }
        int var5 = this.field3439 * arg1 >> 12;
        int var6 = this.field3443 * arg2 >> 12;
        int var7 = this.field3437 * arg2 >> 12;
        class461.method2703(super.field3002, var7, var6, super.field2999, var4, var5, super.field3001, (byte) -4);
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(IIIIIII)V", line = 173)
    public class259(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3437 = arg3;
        this.field3443 = arg1;
        this.field3442 = arg0;
        this.field3439 = arg2;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IBI)V", line = 186)
    public final void method181(int arg0, byte arg1, int arg2) {
        ++field3431;
        int var4 = this.field3442 * arg2 >> 12;
        int var5 = this.field3439 * arg2 >> 12;
        int var6 = this.field3443 * arg0 >> 12;
        int var7 = this.field3437 * arg0 >> 12;
        if (arg1 != -103) {
            method1458(-2, -46, 69);
        }
        class252.method1415(var7, var5, var6, 89, super.field3001, var4);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IZ)V", line = 209)
    public static final void method1460(int arg0, boolean arg1) {
        if (~class148.field2106 == -1) {
            class491.field6866.method1756(arg0, 256);
        } else {
            class165.field2285 = arg0;
        }
        if (!arg1) {
            field3433 = null;
        }
        ++field3435;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lqg;BILnh;I)V", line = 227)
    public static final void method1461(class296 arg0, byte arg1, int arg2, class487 arg3, int arg4) {
        if (arg1 == -100) {
            ++field3432;
            byte var5 = -1;
            if (~(arg4 & 32) != -1) {
                class280.field3754[arg2] = arg0.method240((byte) 112);
            }
            if ((arg4 & 8) != 0) {
                int var6 = arg0.method192((byte) 59);
                int var7 = arg0.method190(120);
                int var8 = arg0.method201((byte) -115);
                int var9 = arg0.field456;
                boolean var10 = (var6 & 32768) != 0;
                if (arg3.field6742 != null && arg3.field6783 != null) {
                    boolean var11 = false;
                    if (~var7 >= -2) {
                        if (var10 || (!class458.field6212 || class330.field4384) && !class129.field1900) {
                            if (class4.method31(arg1 ^ -100, arg3.field6742)) {
                                var11 = true;
                            }
                        } else {
                            var11 = true;
                        }
                    }
                    if (!var11 && ~class314.field4163 == -1) {
                        class387.field5351.field456 = 0;
                        arg0.method244(class387.field5351.field472, 0, var8, 0);
                        class387.field5351.field456 = 0;
                        int var12 = -1;
                        String var13;
                        if (!var10) {
                            var13 = class460.method2702(103, class223.method1264(class387.field5351, arg1 ^ 16054));
                        } else {
                            var6 &= 32767;
                            class274 var14 = class433.method2557(-108, class387.field5351);
                            var12 = var14.field3626;
                            var13 = var14.field3627.method1409(class387.field5351, (byte) -24);
                        }
                        arg3.field1161 = var13.trim();
                        arg3.field1140 = 255 & var6;
                        arg3.field1162 = var6 >> 8;
                        arg3.field1186 = 150;
                        int var15;
                        if (~var7 != -2 && var7 != 2) {
                            var15 = !var10 ? 2 : 17;
                        } else {
                            var15 = var10 ? 17 : 1;
                        }
                        if (var7 != 2) {
                            if (var7 == 1) {
                                class323.method1795(0, (String) null, 66, var13, var12, var15, "<img=0>" + arg3.method2833(false, arg1 + 99), "<img=0>" + arg3.method2835(-20617, true));
                            } else {
                                class323.method1795(0, (String) null, 35, var13, var12, var15, arg3.method2833(false, -1), arg3.method2835(-20617, true));
                            }
                        } else {
                            class323.method1795(0, (String) null, arg1 ^ -30, var13, var12, var15, "<img=1>" + arg3.method2833(false, -1), "<img=1>" + arg3.method2835(-20617, true));
                        }
                    }
                }
                arg0.field456 = var9 - -var8;
            }
            if ((arg4 & 1024) != 0) {
                int var16 = arg0.method197(-989178832);
                int[] var17 = new int[var16];
                int[] var18 = new int[var16];
                int[] var19 = new int[var16];
                for (int var20 = 0; ~var20 > ~var16; ++var20) {
                    int var21 = arg0.method189(true);
                    if (~var21 == -65536) {
                        var21 = -1;
                    }
                    var17[var20] = var21;
                    var18[var20] = arg0.method190(124);
                    var19[var20] = arg0.method189(true);
                }
                class318.method1747(var17, var19, var18, 1, arg3);
            }
            if ((1 & arg4) != 0) {
                int var22 = arg0.method197(-989178832);
                byte[] var23 = new byte[var22];
                class32 var24 = new class32(var23);
                arg0.method217(0, 124, var23, var22);
                class374.field5166[arg2] = var24;
                arg3.method2829(var24, -96);
            }
            if ((16 & arg4) != 0) {
                int var25 = arg0.method192((byte) 59);
                if (~var25 == -65536) {
                    var25 = -1;
                }
                arg3.field1154 = var25;
            }
            if ((arg4 & 4) != 0) {
                int var26 = arg0.method239((byte) 107);
                if (~var26 == -65536) {
                    var26 = -1;
                }
                int var27 = arg0.method249((byte) 112);
                class210.method1195(arg1 ^ -100, arg3, var27, var26);
            }
            if (~(arg4 & 256) != -1) {
                arg3.field1158 = arg0.method240((byte) 89);
                arg3.field1126 = arg0.method240((byte) 40);
                arg3.field1112 = arg0.method227(-20416);
                arg3.field1139 = arg0.method211(29861);
                arg3.field1167 = arg0.method192((byte) 59) - -class70.field968;
                arg3.field1120 = arg0.method192((byte) 59) + class70.field968;
                arg3.field1157 = arg0.method190(124);
                arg3.field1202 = 0;
                if (!arg3.field6781) {
                    arg3.field1126 += arg3.field1197[0];
                    arg3.field1139 += arg3.field1197[0];
                    arg3.field1203 = 1;
                    arg3.field1112 += arg3.field1193[0];
                    arg3.field1158 += arg3.field1193[0];
                } else {
                    arg3.field1112 += arg3.field6746;
                    arg3.field1158 += arg3.field6746;
                    arg3.field1126 += arg3.field6759;
                    arg3.field1203 = 0;
                    arg3.field1139 += arg3.field6759;
                }
            }
            if (~(4096 & arg4) != -1) {
                int var28 = arg0.method215((byte) 120);
                arg3.field1113 = arg0.method249((byte) -84);
                arg3.field1131 = arg0.method197(-989178832);
                arg3.field1168 = 32767 & var28;
                arg3.field1123 = (32768 & var28) != 0;
                arg3.field1166 = class70.field968 - -arg3.field1113 + arg3.field1168;
            }
            if (~(128 & arg4) != -1) {
                arg3.field6751 = arg0.method215((byte) 122);
                if (~arg3.field1203 == -1) {
                    arg3.method542(arg3.field6751, 108);
                    arg3.field6751 = -1;
                }
            }
            if ((512 & arg4) != 0) {
                arg3.field1161 = arg0.method195(-125);
                if (~arg3.field1161.charAt(0) == -127) {
                    arg3.field1161 = arg3.field1161.substring(1);
                    class447.method2624(arg1 ^ -52, arg3.method2835(arg1 ^ 20715, true), 0, arg3.field1161, 2, arg3.method2833(false, -1));
                } else if (class233.field3103 == arg3) {
                    class447.method2624(68, arg3.method2835(arg1 ^ 20715, true), 0, arg3.field1161, 2, arg3.method2833(false, -1));
                }
                arg3.field1140 = 0;
                arg3.field1162 = 0;
                arg3.field1186 = 150;
            }
            if ((arg4 & 8192) != 0) {
                int var29 = arg0.method239((byte) 107);
                int var30 = arg0.method222(arg1 ^ -1124);
                if (~var29 == -65536) {
                    var29 = -1;
                }
                boolean var31 = true;
                if (~var29 != 0 && arg3.field1134 != -1) {
                    if (arg3.field1134 == var29) {
                        class248 var32 = class302.field4030.method1394(var29, -7290);
                        if (var32.field3305 && ~var32.field3310 != 0) {
                            class181 var33 = class395.field5477.method266(arg1 ^ -16009, var32.field3310);
                            int var34 = var33.field2470;
                            if (~var34 != -1) {
                                if (var34 == 1) {
                                    var31 = true;
                                } else if (var34 == 2) {
                                    arg3.field1138 = 0;
                                    var31 = false;
                                }
                            } else {
                                var31 = false;
                            }
                        }
                    } else {
                        class248 var35 = class302.field4030.method1394(var29, -7290);
                        class248 var36 = class302.field4030.method1394(arg3.field1134, -7290);
                        if (~var35.field3310 != 0 && var36.field3310 != -1) {
                            class181 var37 = class395.field5477.method266(arg1 + 16207, var35.field3310);
                            class181 var38 = class395.field5477.method266(16107, var36.field3310);
                            if (~var37.field2471 > ~var38.field2471) {
                                var31 = false;
                            }
                        }
                    }
                }
                if (var31) {
                    arg3.field1190 = var30 >> 16;
                    int var39 = class70.field968;
                    arg3.field1134 = var29;
                    arg3.field1135 = (var30 & 65535) + var39;
                    arg3.field1118 = 0;
                    arg3.field1165 = 0;
                    arg3.field1155 = 1;
                    if (~arg3.field1135 < ~var39) {
                        arg3.field1118 = -1;
                    }
                    if (~arg3.field1134 != 0 && arg3.field1135 == var39) {
                        int var40 = class302.field4030.method1394(arg3.field1134, -7290).field3310;
                        if (var40 != -1) {
                            class181 var41 = class395.field5477.method266(arg1 ^ -16009, var40);
                            if (var41 != null && var41.field2468 != null) {
                                class402.method2437(var41, class233.field3103 == arg3, arg3.field6502, -105, arg3.field6501, arg3.field6507, 0);
                            }
                        }
                    }
                }
            }
            if ((64 & arg4) != 0) {
                int var42 = arg0.method203((byte) -73);
                int var43 = arg0.method197(-989178832);
                arg3.method551(var43, -8134, var42, class70.field968);
                arg3.field1149 = class70.field968 - -300;
                arg3.field1180 = arg0.method190(121);
            }
            if ((2048 & arg4) != 0) {
                int var44 = class70.field968;
                int var45 = arg0.method203((byte) -114);
                int var46 = arg0.method197(-989178832);
                arg3.method551(var46, -8134, var45, var44);
            }
            if (~(16384 & arg4) != -1) {
                var5 = arg0.method227(-20416);
            }
            if (arg3.field6781) {
                if (~var5 == -128) {
                    arg3.method2827(arg3.field6746, arg3.field6759, true);
                } else {
                    byte var47;
                    if (~var5 != 0) {
                        var47 = var5;
                    } else {
                        var47 = class280.field3754[arg2];
                    }
                    arg3.method2831(arg3.field6759, arg1 ^ 15780, arg3.field6746, var47);
                }
            }
        }
    }
}
