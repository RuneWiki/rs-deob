import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class656 {

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "I")
    public int field9360 = 2048;

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "I")
    public int field9361 = 2048;

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "I")
    public int field9363 = 0;

    @OriginalMember(owner = "client!jn", name = "j", descriptor = "I")
    public int field9369 = 0;

    @OriginalMember(owner = "client!jn", name = "l", descriptor = "I")
    public static int field9371 = 0;

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "I")
    public static int field9362;

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "I")
    public static int field9364;

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "I")
    public static int field9365;

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "I")
    public static int field9366;

    @OriginalMember(owner = "client!jn", name = "h", descriptor = "I")
    public static int field9367;

    @OriginalMember(owner = "client!jn", name = "i", descriptor = "I")
    public static int field9368;

    @OriginalMember(owner = "client!jn", name = "k", descriptor = "I")
    public static int field9370;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(BLiaa;)V")
    public final void method3701(byte arg0, class452 arg1) {
        field9366++;
        int var3 = 109 / ((arg0 + 57) / 58);
        while (true) {
            int var4 = arg1.method2541(98);
            if (var4 == 0) {
                return;
            }
            this.method3704((byte) 125, var4, arg1);
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIIZIII)V")
    public static final void method3702(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field9362++;
        int var7 = class11.field111;
        class362.field4732 = 0;
        int[] var8 = class79.field827;
        if (!arg3) {
            return;
        }
        for (int var9 = 0; var9 < class118.field1356 + var7; var9++) {
            class23 var32 = null;
            class292 var33;
            if (var9 >= var7) {
                var33 = ((class443) class392.field5223.method3234((byte) -115, (long) class664.field9449[var9 - var7])).field6107;
                var32 = ((class625) var33).field8855;
                if (var32.field229 != null) {
                    var32 = var32.method108(0, class491.field7127);
                    if (var32 == null) {
                        continue;
                    }
                }
            } else {
                var33 = class362.field4726[var8[var9]];
            }
            if (var33.field3812 >= 0 && (class273.field3463 == var33.field3748 || class377.field4914.field4638 == var33.field4638)) {
                class423.method2289(var33.method1658((byte) -93), arg4 >> 1, (byte) 46, arg2, arg5 >> 1, var33, arg1);
                if (class377.field4913[0] >= 0) {
                    if (var33.field3757 != null && (var9 >= var7 || class521.field7469 == 0 || class521.field7469 == 3 || class521.field7469 == 1 && class608.method3393(((class455) var33).field6324, (byte) 18)) && class362.field4732 < class223.field2822) {
                        class223.field2801[class362.field4732] = class612.field8650.method3622(62, var33.field3757) / 2;
                        class223.field2829[class362.field4732] = class377.field4913[0];
                        class223.field2806[class362.field4732] = class377.field4913[1];
                        class223.field2823[class362.field4732] = var33.field3824;
                        class223.field2825[class362.field4732] = var33.field3755;
                        class223.field2804[class362.field4732] = var33.field3816;
                        class223.field2810[class362.field4732] = var33.field3757;
                        class362.field4732++;
                    }
                    int var34 = arg6 + class377.field4913[1];
                    int var45;
                    if (var33.field3735 || var33.field3762 <= class469.field6549) {
                        var45 = var34 - Math.max(class612.field8650.field9130, class400.field5343[0].method417());
                    } else {
                        boolean var35 = true;
                        byte var36 = 1;
                        int var38;
                        if (var7 > var9) {
                            class455 var37 = class362.field4726[var8[var9]];
                            var38 = var33.method1653(1).field6522;
                            if (var37.field6315) {
                                var36 = 2;
                            }
                        } else {
                            var38 = var32.field218;
                            if (var38 == -1) {
                                var38 = var33.method1653(1).field6522;
                            }
                        }
                        class458[] var39 = class400.field5343;
                        if (var38 != -1) {
                            class458[] var40 = (class458[]) class352.field4618.method3690((byte) -127, (long) var38);
                            if (var40 == null) {
                                class563[] var41 = class563.method3180(class633.field8972, var38, 0);
                                if (var41 != null) {
                                    var40 = new class458[var41.length];
                                    for (int var42 = 0; var42 < var41.length; var42++) {
                                        var40[var42] = class453.field6284.method351(var41[var42], true);
                                    }
                                    class352.field4618.method3683(var40, (byte) -24, (long) var38);
                                }
                            }
                            if (var40 != null && var40.length >= 2) {
                                var39 = var40;
                            }
                        }
                        if (var39.length <= var36) {
                            var36 = 1;
                        }
                        class458 var43 = var39[0];
                        class458 var44 = var39[var36];
                        var45 = var34 - Math.max(class612.field8650.field9130, var43.method417());
                        int var46 = arg0 + class377.field4913[0] - (var43.method415() >> 1);
                        int var47 = var43.method415() * var33.field3780 / 255;
                        if (var33.field3780 > 0 && var47 < 2) {
                            var47 = 2;
                        }
                        var43.method2612(var46, var45);
                        class453.field6284.method330(var46, var45, var46 + var47, var43.method417() + var45);
                        var44.method2612(var46, var45);
                        class453.field6284.method314(arg0, arg6, arg0 + arg5, arg4 + arg6);
                    }
                    var45 -= 2;
                    if (!var33.field3735) {
                        if (var33.field3806 > class469.field6549) {
                            class458 var48 = class618.field8704[var33.field3737 ? 2 : 0];
                            class458 var49 = class618.field8704[var33.field3737 ? 3 : 1];
                            boolean var50 = true;
                            int var51;
                            if (var33 instanceof class625) {
                                var51 = var32.field253;
                                if (var51 == -1) {
                                    var51 = var33.method1653(1).field6521;
                                }
                            } else {
                                var51 = var33.method1653(1).field6521;
                            }
                            if (var51 != -1) {
                                class458[] var52 = (class458[]) class549.field7840.method3690((byte) 125, (long) var51);
                                if (var52 == null) {
                                    class563[] var53 = class563.method3180(class633.field8972, var51, 0);
                                    if (var53 != null) {
                                        var52 = new class458[var53.length];
                                        for (int var54 = 0; var54 < var53.length; var54++) {
                                            var52[var54] = class453.field6284.method351(var53[var54], true);
                                        }
                                        class549.field7840.method3683(var52, (byte) -38, (long) var51);
                                    }
                                }
                                if (var52 != null && var52.length == 4) {
                                    var48 = var52[var33.field3737 ? 2 : 0];
                                    var49 = var52[var33.field3737 ? 3 : 1];
                                }
                            }
                            int var55 = var33.field3806 - class469.field6549;
                            int var56;
                            if (var33.field3788 >= var55) {
                                var56 = var48.method415();
                            } else {
                                int var57 = var55 - var33.field3788;
                                int var58 = var33.field3756 == 0 ? 0 : (var33.field3799 - var57) / var33.field3756 * var33.field3756;
                                var56 = var48.method415() * var58 / var33.field3799;
                            }
                            int var59 = var48.method417();
                            var45 -= var59;
                            int var60 = arg0 + class377.field4913[0] - (var48.method415() >> 1);
                            var48.method2612(var60, var45);
                            class453.field6284.method330(var60, var45, var56 + var60, var45 + var59);
                            var49.method2612(var60, var45);
                            var45 -= 2;
                            class453.field6284.method314(arg0, arg6, arg0 + arg5, arg4 + arg6);
                        }
                        if (var9 < var7) {
                            class455 var61 = (class455) var33;
                            if (var61.field6316 != -1) {
                                var45 -= 25;
                                class522.field7478[var61.field6316].method2612(class377.field4913[0] + arg0 - 12, var45);
                                var45 -= 2;
                            }
                            if (var61.field6321 != -1) {
                                var45 -= 25;
                                class537.field7685[var61.field6321].method2612(arg0 + class377.field4913[0] - 12, var45);
                                var45 -= 2;
                            }
                        } else if (var32.field216 >= 0 && var32.field216 < class537.field7685.length) {
                            class458 var62 = class537.field7685[var32.field216];
                            var45 -= 25;
                            var62.method2612(class377.field4913[0] + arg0 - (var62.method415() >> 1), var45);
                            var45 -= 2;
                        }
                    }
                    int var10000;
                    if (!var33 instanceof class455) {
                        int var69 = 0;
                        class492[] var70 = class81.field863;
                        for (int var71 = 0; var71 < var70.length; var71++) {
                            class492 var76 = var70[var71];
                            if (var76 != null && var76.field7141 == 1 && class664.field9449[var9 - var7] == var76.field7134) {
                                class458 var77 = class2.field20[var76.field7135];
                                if (var77.method417() > var69) {
                                    var69 = var77.method417();
                                }
                                if ((class469.field6549 % 20) < 10) {
                                    var77.method2612(class377.field4913[0] + arg0 - 12, var45 + -var77.method417());
                                }
                            }
                        }
                        if (var69 > 0) {
                            var10000 = var45 - (var69 + 2);
                        }
                    } else if (var9 >= 0) {
                        int var63 = 0;
                        class492[] var64 = class81.field863;
                        for (int var65 = 0; var65 < var64.length; var65++) {
                            class492 var67 = var64[var65];
                            if (var67 != null && var67.field7141 == 10 && var8[var9] == var67.field7134) {
                                class458 var68 = class2.field20[var67.field7135];
                                if (var63 < var68.method417()) {
                                    var63 = var68.method417();
                                }
                                var68.method2612(class377.field4913[0] + arg0 - 12, var45 - var68.method417());
                            }
                        }
                        if (var63 > 0) {
                            var10000 = var45 - (var63 + 2);
                        }
                    }
                    for (int var73 = 0; var73 < 4; var73++) {
                        if (var33.field3745[var73] > class469.field6549) {
                            int var74 = var33.method1658((byte) -93) / 2;
                            class423.method2289(var74, arg4 >> 1, (byte) 46, arg2, arg5 >> 1, var33, arg1);
                            if (class377.field4913[0] > -1) {
                                int var75 = class18.field160[var33.field3752[var73]].method415();
                                if (var73 == 1) {
                                    class377.field4913[1] -= 20;
                                }
                                if (var73 == 2) {
                                    class377.field4913[1] -= 10;
                                    class377.field4913[0] -= var75 - 9;
                                }
                                if (var73 == 3) {
                                    class377.field4913[0] += var75 - 9;
                                    class377.field4913[1] -= 10;
                                }
                                class18.field160[var33.field3752[var73]].method2612(class377.field4913[0] + arg0 - (var75 >> 1), arg6 + -12 + class377.field4913[1]);
                                class419.field5573.method1128(215, arg0 + class377.field4913[0] - 1, arg6 - -3 + class377.field4913[1], Integer.toString(var33.field3790[var73]), -1, 0);
                            }
                        }
                    }
                }
            }
        }
        for (int var10 = 0; var10 < class389.field5191; var10++) {
            int var28 = class673.field9564[var10];
            class292 var29;
            if (var28 >= 2048) {
                var29 = ((class443) class392.field5223.method3234((byte) -35, (long) (var28 - 2048))).field6107;
            } else {
                var29 = class362.field4726[var28];
            }
            int var30 = class111.field1291[var10];
            class292 var31;
            if (var30 < 2048) {
                var31 = class362.field4726[var30];
            } else {
                var31 = ((class443) class392.field5223.method3234((byte) -66, (long) (var30 - 2048))).field6107;
            }
            class605.method3377(var29, arg1, arg2, var31, arg5, (byte) -112, arg6, arg4, --var29.field3822, arg0);
        }
        int var11 = class612.field8650.field9130 + class612.field8650.field9123 + 2;
        for (int var12 = 0; var12 < class362.field4732; var12++) {
            int var13 = class223.field2829[var12];
            int var14 = class223.field2806[var12];
            int var15 = class223.field2801[var12];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var27 = 0; var27 < var12; var27++) {
                    if (class223.field2806[var27] - var11 < var14 + 2 && var14 - var11 < class223.field2806[var27] + 2 && var13 - var15 < class223.field2829[var27] + class223.field2801[var27] && (var13 + var15) > (class223.field2829[var27] - class223.field2801[var27]) && (class223.field2806[var27] - var11) < var14) {
                        var16 = true;
                        var14 = class223.field2806[var27] - var11;
                    }
                }
            }
            class223.field2806[var12] = var14;
            String var17 = class223.field2810[var12];
            if (class134.field1515 == 0) {
                int var18 = 16776960;
                if (class223.field2823[var12] < 6) {
                    var18 = class448.field6159[class223.field2823[var12]];
                }
                if (class223.field2823[var12] == 6) {
                    var18 = (class273.field3463 % 20) < 10 ? 16711680 : 16776960;
                }
                if (class223.field2823[var12] == 7) {
                    var18 = (class273.field3463 % 20) < 10 ? 255 : 65535;
                }
                if (class223.field2823[var12] == 8) {
                    var18 = (class273.field3463 % 20) < 10 ? 45056 : 8454016;
                }
                if (class223.field2823[var12] == 9) {
                    int var19 = 150 - class223.field2804[var12];
                    if (var19 < 50) {
                        var18 = var19 * 1280 + 16711680;
                    } else if (var19 < 100) {
                        var18 = 16776960 - ((var19 - 50) * 327680);
                    } else if (var19 < 150) {
                        var18 = (var19 - 100) * 5 + 65280;
                    }
                }
                if (class223.field2823[var12] == 10) {
                    int var20 = 150 - class223.field2804[var12];
                    if (var20 < 50) {
                        var18 = var20 * 5 + 16711680;
                    } else if (var20 < 100) {
                        var18 = 16384000 + 16711935 - (var20 * 327680);
                    } else if (var20 < 150) {
                        var18 = var20 * 327680 + (255 - (var20 * 5 - 500)) - 32768000;
                    }
                }
                if (class223.field2823[var12] == 11) {
                    int var21 = 150 - class223.field2804[var12];
                    if (var21 < 50) {
                        var18 = 16777215 - (var21 * 327685);
                    } else if (var21 < 100) {
                        var18 = ((var21 - 50) * 327685) + 65280;
                    } else if (var21 < 150) {
                        var18 = 16777215 - ((var21 - 100) * 327680);
                    }
                }
                int var22 = var18 | 0xFF000000;
                if (class223.field2825[var12] == 0) {
                    class211.field2561.method1128(215, arg0 + var13, arg6 + var14, var17, var22, -16777216);
                }
                if (class223.field2825[var12] == 1) {
                    class211.field2561.method1115(var17, (byte) -100, -16777216, arg6 + var14, arg0 - -var13, var22, class273.field3463);
                }
                if (class223.field2825[var12] == 2) {
                    class211.field2561.method1132(-117, arg0 + var13, -16777216, var22, arg6 + var14, var17, class273.field3463);
                }
                if (class223.field2825[var12] == 3) {
                    class211.field2561.method1134(arg6 + var14, class273.field3463, -16777216, var17, var22, 125, 150 - class223.field2804[var12], arg0 + var13);
                }
                if (class223.field2825[var12] == 4) {
                    int var23 = (150 - class223.field2804[var12]) * (class612.field8650.method3622(62, var17) + 100) / 150;
                    class453.field6284.method330(arg0 + var13 - 50, arg6, arg0 + var13 + 50, arg4 + arg6);
                    class211.field2561.method1124(0, var17, var22, -16777216, arg0 + var13 + 50 - var23, arg6 - -var14);
                    class453.field6284.method314(arg0, arg6, arg0 + arg5, arg4 + arg6);
                }
                if (class223.field2825[var12] == 5) {
                    int var24 = 150 - class223.field2804[var12];
                    int var25 = 0;
                    if (var24 < 25) {
                        var25 = var24 - 25;
                    } else if (var24 > 125) {
                        var25 = var24 - 125;
                    }
                    int var26 = class612.field8650.field9130 + class612.field8650.field9123;
                    class453.field6284.method330(arg0, arg6 - (var26 - var14) - 1, arg0 - -arg5, var14 + arg6 + 5);
                    class211.field2561.method1128(215, arg0 + var13, arg6 - -var14 + var25, var17, var22, -16777216);
                    class453.field6284.method314(arg0, arg6, arg0 + arg5, arg4 + arg6);
                }
            } else {
                class211.field2561.method1128(215, arg0 + var13, arg6 + var14, var17, -256, -16777216);
            }
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(ZILjava/lang/String;J)V")
    public static final void method3703(boolean arg0, int arg1, String arg2, long arg3) {
        field9364++;
        if (arg0) {
            class396.method2164((byte) -124);
            if (class375.field4865.equals("")) {
                class377.field4898 = 39;
                return;
            }
        }
        class452 var5 = new class452(576);
        var5.method2525(10, -81849);
        var5.method2537(18244, (int) (Math.random() * 65535.0D));
        var5.method2518((byte) 126, arg3);
        var5.method2537(18244, arg0 ? class53.field551 : class559.field7965);
        var5.method2573(arg2, 16746);
        var5.method2518((byte) 127, arg0 ? class284.field3604 : class222.field2795);
        if (arg0) {
            var5.method2518((byte) 99, class650.method3669(-16514, class375.field4865));
            try {
                var5.method2518((byte) 101, Long.parseLong(class316.field4114));
            } catch (Exception var6) {
                class377.field4898 = 39;
                return;
            }
        } else {
            var5.method2554((int) (Math.random() * 9.9999999E7D), 255);
            var5.method2554((int) (Math.random() * 9.9999999E7D), 255);
            var5.method2554((int) (Math.random() * 9.9999999E7D), 255);
            var5.method2554((int) (Math.random() * 9.9999999E7D), 255);
        }
        var5.method2554((int) (Math.random() * 9.9999999E7D), 255);
        var5.method2531(class210.field2550, 120, class81.field860);
        class334.field4314.field6215 = 0;
        class334.field4314.method2525(arg0 ? class61.field641.field689 : class61.field638.field689, -81849);
        class334.field4314.method2537(18244, var5.field6215 + 28);
        class334.field4314.method2537(18244, 612);
        if (arg1 <= 5) {
            return;
        }
        class334.field4314.method2525(class226.field2899, -81849);
        class334.field4314.method2525(class220.field2668.field2518, -81849);
        class315.method1785(0, class334.field4314);
        class334.field4314.method2514(var5.field6215, var5.field6209, -27824, 0);
        class267.field3364 = 1;
        class664.field9436 = 0;
        class377.field4898 = -3;
        class98.field1077 = 0;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(BILiaa;)V")
    private final void method3704(byte arg0, int arg1, class452 arg2) {
        if (arg1 == 1) {
            this.field9363 = arg2.method2541(arg0 - 40);
        } else if (arg1 == 2) {
            this.field9361 = arg2.method2574(-1758460248);
        } else if (arg1 == 3) {
            this.field9360 = arg2.method2574(arg0 ^ 0x973006D5);
        } else if (arg1 == 4) {
            this.field9369 = arg2.method2549((byte) 32);
        }
        field9370++;
        if (arg0 != 125) {
            this.field9360 = 119;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(B)V")
    public static final void method3705(byte arg0) {
        field9365++;
        if (class397.field5320 == -1 || arg0 != 59) {
            return;
        }
        int var1 = class407.field5419.method162(arg0 ^ 0xFFFF9804);
        int var2 = class407.field5419.method161(31285);
        class460 var3 = (class460) class285.field3607.method3174((byte) 49);
        if (var3 != null) {
            var1 = var3.method785(-6);
            var2 = var3.method786(22461);
        }
        class496.method2860(class399.field5336, 0, var1, class397.field5320, var2, class416.field5524, -1, 0, 0, 0);
        if (class9.field92 != null) {
            class496.method2859(var1, var2, 0);
        }
    }
}
