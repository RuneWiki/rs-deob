import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class254 extends class64 {

    @OriginalMember(owner = "client!am", name = "K", descriptor = "I")
    public static int field4393 = 0;

    @OriginalMember(owner = "client!am", name = "I", descriptor = "Z")
    public static boolean field4391 = true;

    @OriginalMember(owner = "client!am", name = "L", descriptor = "Lne;")
    public static class235 field4394 = new class235(64);

    @OriginalMember(owner = "client!am", name = "O", descriptor = "I")
    public static int field4397 = 0;

    @OriginalMember(owner = "client!am", name = "P", descriptor = "Lol;")
    public static class231 field4398 = new class231(16);

    @OriginalMember(owner = "client!am", name = "Q", descriptor = "I")
    public static int field4399 = 0;

    @OriginalMember(owner = "client!am", name = "A", descriptor = "I")
    public static int field4389;

    @OriginalMember(owner = "client!am", name = "H", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!am", name = "J", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!am", name = "M", descriptor = "I")
    public static int field4395;

    @OriginalMember(owner = "client!am", name = "N", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(BI)I", line = 24)
    public static final int method1766(byte arg0, int arg1) {
        field4395++;
        int var2 = -52 / ((16 - arg0) / 53);
        return arg1 == 16711935 ? -1 : class93.method611(arg1, -95);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIBLah;Lah;)Lej;", line = 40)
    public static final class158 method1767(int arg0, int arg1, byte arg2, class205 arg3, class205 arg4) {
        field4389++;
        int var5 = 80 % ((arg2 + 16) / 37);
        return class86.method566(arg1, arg4, arg0, 1) ? class150.method946((byte) 111, arg3.method1381(arg1, arg0, 0)) : null;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIIIII)V", line = 55)
    public static final void method1768(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4392++;
        class27.field468 = 0;
        for (int var7 = -1; var7 < class194.field3114 + class233.field3826; var7++) {
            class249 var8;
            if (var7 == -1) {
                var8 = class85.field1176;
            } else if (class194.field3114 <= var7) {
                var8 = class40.field649[class97.field1403[var7 - class194.field3114]];
            } else {
                var8 = class22.field380[class325.field5670[var7]];
            }
            if (var8 != null && var8.method18(-97)) {
                if (var8 instanceof class4) {
                    class242 var9 = ((class4) var8).field72;
                    if (var9.field4011 != null) {
                        var9 = var9.method1650(4);
                    }
                    if (var9 == null) {
                        continue;
                    }
                }
                if (var7 >= class194.field3114) {
                    class242 var10 = ((class4) var8).field72;
                    if (var10.field4011 != null) {
                        var10 = var10.method1650(4);
                    }
                    if (var10.field4015 >= 0 && var10.field4015 < class23.field402.length) {
                        int var11;
                        if (var10.field4001 == -1) {
                            var11 = var8.method1709(arg5 ^ 0x137D) + 15;
                        } else {
                            var11 = var10.field4001 + 15;
                        }
                        class157.method1054(arg1, arg2 >> 1, var11, arg3, arg0 >> 1, (byte) 119, var8);
                        if (class201.field3245 > -1) {
                            class23.field402[var10.field4015].method429(class201.field3245 + arg4 - 12, arg6 - (-class287.field4861 - -30));
                        }
                    }
                    class268[] var12 = class194.field3094;
                    for (int var13 = 0; var13 < var12.length; var13++) {
                        class268 var14 = var12[var13];
                        if (var14 != null && var14.field4508 == 1 && class97.field1403[var7 - class194.field3114] == var14.field4513 && class142.field2187 % 20 < 10) {
                            int var15;
                            if (var10.field4001 == -1) {
                                var15 = var8.method1709(-95) + 15;
                            } else {
                                var15 = var10.field4001 + 15;
                            }
                            class157.method1054(arg1, arg2 >> 1, var15, arg3, arg0 >> 1, (byte) 119, var8);
                            if (class201.field3245 > -1) {
                                class66.field996[var14.field4511].method429(arg4 + class201.field3245 - 12, class287.field4861 + arg6 - 28);
                            }
                        }
                    }
                } else {
                    class12 var16 = (class12) var8;
                    int var17 = 30;
                    if (var16.field165 != -1 || var16.field161 != -1) {
                        class157.method1054(arg1, arg2 >> 1, var8.method1709(arg5 ^ 0x1338) + 15, arg3, arg0 >> 1, (byte) 119, var8);
                        if (class201.field3245 > -1) {
                            if (var16.field165 != -1) {
                                class98.field1404[var16.field165].method429(arg4 - (12 - class201.field3245), -var17 + arg6 - -class287.field4861);
                                var17 += 25;
                            }
                            if (var16.field161 != -1) {
                                class23.field402[var16.field161].method429(class201.field3245 + arg4 - 12, arg6 - -class287.field4861 + -var17);
                                var17 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        class268[] var18 = class194.field3094;
                        for (int var19 = 0; var19 < var18.length; var19++) {
                            class268 var20 = var18[var19];
                            if (var20 != null && var20.field4508 == 10 && class325.field5670[var7] == var20.field4513) {
                                class157.method1054(arg1, arg2 >> 1, var8.method1709(arg5 ^ 0xFFFFECD2) + 15, arg3, arg0 >> 1, (byte) 119, var8);
                                if (class201.field3245 > -1) {
                                    class66.field996[var20.field4511].method429(class201.field3245 + arg4 - 12, arg6 - (-class287.field4861 + var17));
                                }
                            }
                        }
                    }
                }
                if (var8.field4167 != null && (class194.field3114 <= var7 || class62.field938 == 0 || class62.field938 == 3 || class62.field938 == 1 && class295.method2038(arg5 ^ 0xFFFFECE8, ((class12) var8).field146))) {
                    class157.method1054(arg1, arg2 >> 1, var8.method1709(arg5 ^ 0x1363), arg3, arg0 >> 1, (byte) 119, var8);
                    if (class201.field3245 > -1 && class27.field468 < class64.field965) {
                        class64.field967[class27.field468] = class316.field5485.method1123(var8.field4167) / 2;
                        class64.field966[class27.field468] = class316.field5485.field2678;
                        class64.field956[class27.field468] = class201.field3245;
                        class64.field960[class27.field468] = class287.field4861;
                        class64.field958[class27.field468] = var8.field4238;
                        class64.field972[class27.field468] = var8.field4228;
                        class64.field959[class27.field468] = var8.field4189;
                        class64.field962[class27.field468] = var8.field4167;
                        class27.field468++;
                    }
                }
                if (class142.field2187 < var8.field4178) {
                    class203 var21 = class22.field360[0];
                    class203 var22 = class22.field360[1];
                    int var23;
                    if ((var8 instanceof class4)) {
                        class4 var24 = (class4) var8;
                        class203[] var25 = (class203[]) ((class203[]) class18.field253.method1620(true, (long) var24.field72.field3978));
                        if (var25 == null) {
                            var25 = class184.method1225(var24.field72.field3978, 0, class224.field3650, (byte) 19);
                            if (var25 != null) {
                                class18.field253.method1614(var25, (long) var24.field72.field3978, (byte) 78);
                            }
                        }
                        if (var25 != null && var25.length == 2) {
                            var22 = var25[1];
                            var21 = var25[0];
                        }
                        class242 var26 = var24.field72;
                        if (var26.field4001 == -1) {
                            var23 = var8.method1709(110);
                        } else {
                            var23 = var26.field4001;
                        }
                    } else {
                        var23 = var8.method1709(-59);
                    }
                    class157.method1054(arg1, arg2 >> 1, var23 + var21.field3284 + 10, arg3, arg0 >> 1, (byte) 119, var8);
                    if (class201.field3245 > -1) {
                        int var27 = arg4 + class201.field3245 - (var21.field3281 >> 1);
                        int var28 = class287.field4861 + arg6 - 3;
                        var21.method429(var27, var28);
                        int var29 = var8.field4192 * var21.field3281 / 255;
                        int var30 = var21.field3284;
                        if (class217.field3516) {
                            class13.method79(var27, var28, var27 + var29, var28 + var30);
                        } else {
                            class96.method651(var27, var28, var27 + var29, var28 - -var30);
                        }
                        var22.method429(var27, var28);
                        if (class217.field3516) {
                            class13.method76(arg4, arg6, arg2 + arg4, arg0 + arg6);
                        } else {
                            class96.method634(arg4, arg6, arg2 + arg4, arg0 + arg6);
                        }
                    }
                }
                for (int var31 = 0; var31 < 4; var31++) {
                    if (class142.field2187 < var8.field4261[var31]) {
                        int var32;
                        if ((var8 instanceof class4)) {
                            class4 var33 = (class4) var8;
                            class242 var34 = var33.field72;
                            if (var34.field4001 == -1) {
                                var32 = var8.method1709(125) / 2;
                            } else {
                                var32 = var34.field4001 / 2;
                            }
                        } else {
                            var32 = var8.method1709(-84) / 2;
                        }
                        class157.method1054(arg1, arg2 >> 1, var32, arg3, arg0 >> 1, (byte) 119, var8);
                        if (class201.field3245 > -1) {
                            if (var31 == 1) {
                                class287.field4861 -= 20;
                            }
                            if (var31 == 2) {
                                class287.field4861 -= 10;
                                class201.field3245 -= 15;
                            }
                            if (var31 == 3) {
                                class201.field3245 += 15;
                                class287.field4861 -= 10;
                            }
                            class195.field3129[var8.field4232[var31]].method429(class201.field3245 + arg4 - 12, class287.field4861 + -12 + arg6);
                            class303.field5220.method1122(class38.method280(107, var8.field4249[var31]), class201.field3245 + arg4 - 1, arg6 + 3 + class287.field4861, 16777215, 0);
                        }
                    }
                }
            }
        }
        int var35 = 0;
        if (arg5 != -4933) {
            return;
        }
        while (var35 < class27.field468) {
            int var36 = class64.field956[var35];
            int var37 = class64.field960[var35];
            int var38 = class64.field967[var35];
            boolean var39 = true;
            int var40 = class64.field966[var35];
            while (var39) {
                var39 = false;
                for (int var41 = 0; var41 < var35; var41++) {
                    if (var37 + 2 > class64.field960[var41] + -class64.field966[var41] && (class64.field960[var41] + 2) > (var37 - var40) && (class64.field956[var41] + class64.field967[var41]) > (var36 - var38) && (class64.field956[var41] - class64.field967[var41]) < (var36 + var38) && (class64.field960[var41] - class64.field966[var41]) < var37) {
                        var39 = true;
                        var37 = class64.field960[var41] - class64.field966[var41];
                    }
                }
            }
            class201.field3245 = class64.field956[var35];
            class287.field4861 = class64.field960[var35] = var37;
            class152 var42 = class64.field962[var35];
            if (class2.field44 == 0) {
                int var43 = 16776960;
                if (class64.field958[var35] < 6) {
                    var43 = class73.field1061[class64.field958[var35]];
                }
                if (class64.field958[var35] == 6) {
                    var43 = (class252.field4338 % 20) < 10 ? 16711680 : 16776960;
                }
                if (class64.field958[var35] == 7) {
                    var43 = class252.field4338 % 20 >= 10 ? 65535 : 255;
                }
                if (class64.field958[var35] == 8) {
                    var43 = (class252.field4338 % 20) < 10 ? 45056 : 8454016;
                }
                if (class64.field958[var35] == 9) {
                    int var44 = 150 - class64.field959[var35];
                    if (var44 < 50) {
                        var43 = var44 * 1280 + 16711680;
                    } else if (var44 < 100) {
                        var43 = 16384000 + 16776960 - (var44 * 327680);
                    } else if (var44 < 150) {
                        var43 = var44 * 5 + 64780;
                    }
                }
                if (class64.field958[var35] == 10) {
                    int var45 = 150 - class64.field959[var35];
                    if (var45 < 50) {
                        var43 = (var45 * 5) + 16711680;
                    } else if (var45 < 100) {
                        var43 = 16711935 - (var45 - 50) * 327680;
                    } else if (var45 < 150) {
                        var43 = var45 * 327680 + 500 + 255 - (var45 * 5) - 32768000;
                    }
                }
                if (class64.field958[var35] == 11) {
                    int var46 = 150 - class64.field959[var35];
                    if (var46 < 50) {
                        var43 = 16777215 - (var46 * 327685);
                    } else if (var46 < 100) {
                        var43 = var46 * 327685 - 16318970;
                    } else if (var46 < 150) {
                        var43 = 16777215 - (var46 - 100) * 327680;
                    }
                }
                if (class64.field972[var35] == 0) {
                    class316.field5485.method1122(var42, class201.field3245 + arg4, arg6 - -class287.field4861, var43, 0);
                }
                if (class64.field972[var35] == 1) {
                    class316.field5485.method1134(var42, class201.field3245 + arg4, class287.field4861 + arg6, var43, 0, class252.field4338);
                }
                if (class64.field972[var35] == 2) {
                    class316.field5485.method1131(var42, class201.field3245 + arg4, class287.field4861 + arg6, var43, 0, class252.field4338);
                }
                if (class64.field972[var35] == 3) {
                    class316.field5485.method1145(var42, class201.field3245 + arg4, class287.field4861 + arg6, var43, 0, class252.field4338, 150 - class64.field959[var35]);
                }
                if (class64.field972[var35] == 4) {
                    int var47 = (150 - class64.field959[var35]) * (class316.field5485.method1123(var42) + 100) / 150;
                    if (class217.field3516) {
                        class13.method79(class201.field3245 + arg4 - 50, arg6, arg4 - (-class201.field3245 - 50), arg0 + arg6);
                    } else {
                        class96.method651(class201.field3245 + arg4 - 50, arg6, class201.field3245 + arg4 + 50, arg0 + arg6);
                    }
                    class316.field5485.method1133(var42, class201.field3245 + arg4 + 50 - var47, class287.field4861 + arg6, var43, 0);
                    if (class217.field3516) {
                        class13.method76(arg4, arg6, arg2 + arg4, arg0 + arg6);
                    } else {
                        class96.method634(arg4, arg6, arg2 + arg4, arg0 + arg6);
                    }
                }
                if (class64.field972[var35] == 5) {
                    int var48 = 150 - class64.field959[var35];
                    if (class217.field3516) {
                        class13.method79(arg4, class287.field4861 + arg6 - class316.field5485.field2678 - 1, arg4 - -arg2, arg6 + class287.field4861 + 5);
                    } else {
                        class96.method651(arg4, arg6 + class287.field4861 - class316.field5485.field2678 - 1, arg2 + arg4, class287.field4861 + arg6 + 5);
                    }
                    int var49 = 0;
                    if (var48 < 25) {
                        var49 = var48 - 25;
                    } else if (var48 > 125) {
                        var49 = var48 - 125;
                    }
                    class316.field5485.method1122(var42, class201.field3245 + arg4, arg6 - -class287.field4861 + var49, var43, 0);
                    if (class217.field3516) {
                        class13.method76(arg4, arg6, arg2 + arg4, arg0 + arg6);
                    } else {
                        class96.method634(arg4, arg6, arg2 + arg4, arg0 + arg6);
                    }
                }
            } else {
                class316.field5485.method1122(var42, class201.field3245 + arg4, class287.field4861 + arg6, 16776960, 0);
            }
            var35++;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IZ)V", line = 530)
    public static final void method1769(int arg0, boolean arg1) {
        field4390++;
        if (arg0 <= 119) {
            field4394 = (class235) null;
        }
        byte var2;
        byte[][] var3;
        if (class217.field3516 && arg1) {
            var2 = 1;
            var3 = class323.field5637;
        } else {
            var3 = class202.field3267;
            var2 = 4;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            class234.method1609(-128);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class148.field2271[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = var7 >> 24 & 0x3;
                        if (!arg1 || var8 == 0) {
                            int var9 = var7 >> 1 & 0x3;
                            int var10 = (var7 & 0xFFD06B) >> 14;
                            int var11 = (var7 & 0x3FFF) >> 3;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class284.field4835.length; var13++) {
                                if (class284.field4835[var13] == var12 && var3[var13] != null) {
                                    class69.method442(26944, var6 * 8, (var10 & 0x7) * 8, (var11 & 0x7) * 8, var9, var8, arg1, var3[var13], class135.field2076, var5 * 8, var4);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!am", name = "c", descriptor = "(I)V", line = 619)
    public static void method1770(int arg0) {
        field4398 = null;
        field4394 = null;
        if (arg0 != -5) {
            method1767(-112, 126, (byte) -68, (class205) null, (class205) null);
        }
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(IB)I", line = 641)
    public static final int method1771(int arg0, byte arg1) {
        field4396++;
        int var2 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
        int var3 = ((var2 & 0xCCCCCCCD) >>> 2) + (var2 & 0x33333333);
        if (arg1 != -49) {
            method1767(-73, -15, (byte) 30, (class205) null, (class205) null);
        }
        int var4 = var3 + (var3 >>> 4) & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }
}
