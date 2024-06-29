import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class224 {

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "B")
    private byte field3753;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public int field3755;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
    public int field3758;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
    public int field3754;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
    public int field3757;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "I")
    public int field3760;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "I")
    public static int field3759 = -1;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public static int field3751;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)I", line = 14)
    public final int method1566(byte arg0) {
        if (arg0 >= -70) {
            return -70;
        } else {
            field3756++;
            return this.field3753 & 0x7;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lsc;Z)V", line = 34)
    public static final void method1567(class249 arg0, boolean arg1) {
        class97.field1672.method1472(true, arg0);
        while (true) {
            class249 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class249[][] var7;
            class249 var78;
            do {
                class249 var77;
                do {
                    class249 var76;
                    do {
                        class249 var75;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class249) class97.field1672.method1468(114);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field4191);
                                            var3 = var2.field4185;
                                            var4 = var2.field4190;
                                            var5 = var2.field4202;
                                            var6 = var2.field4196;
                                            var7 = class118.field1984[var5];
                                            float var8 = 0.0F;
                                            if (class281.field4827) {
                                                if (class279.field4783 == class106.field1783) {
                                                    int var9 = class118.field1982[var3][var4];
                                                    int var10 = var9 & 0xFFFFFF;
                                                    if (field3759 != var10) {
                                                        field3759 = var10;
                                                        class68.method411(false, var10);
                                                        class272.method1905(class305.method2118(-83));
                                                    }
                                                    int var11 = var9 >>> 24 << 3;
                                                    if (class144.field2409 != var11) {
                                                        class144.field2409 = var11;
                                                        class247.method1704(-29905, var11);
                                                    }
                                                    int var12 = class43.field677[0][var3 + 1][var4] + class43.field677[0][var3][var4] + class43.field677[0][var3][var4 + 1] + class43.field677[0][var3 + 1][var4 + 1] >> 2;
                                                    class256.method1795(3, -var12, -536);
                                                    var8 = 201.5F;
                                                    class281.method1952(var8);
                                                } else {
                                                    var8 = 201.5F - (float) (var6 + 1) * 50.0F;
                                                    class281.method1952(var8);
                                                }
                                            }
                                            if (!var2.field4187) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class249 var13 = class118.field1984[var5 - 1][var3][var4];
                                                    if (var13 != null && var13.field4191) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class77.field1264 && var3 > class70.field1078) {
                                                    class249 var14 = var7[var3 - 1][var4];
                                                    if (var14 != null && var14.field4191 && (var14.field4187 || (var2.field4194 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class77.field1264 && var3 < class238.field3954 - 1) {
                                                    class249 var15 = var7[var3 + 1][var4];
                                                    if (var15 != null && var15.field4191 && (var15.field4187 || (var2.field4194 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class81.field1305 && var4 > class69.field1037) {
                                                    class249 var16 = var7[var3][var4 - 1];
                                                    if (var16 != null && var16.field4191 && (var16.field4187 || (var2.field4194 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class81.field1305 && var4 < class4.field64 - 1) {
                                                    class249 var17 = var7[var3][var4 + 1];
                                                    if (var17 != null && var17.field4191 && (var17.field4187 || (var2.field4194 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field4187 = false;
                                            if (var2.field4197 != null) {
                                                class249 var18 = var2.field4197;
                                                if (class281.field4827) {
                                                    class281.method1952(201.5F - (float) (var18.field4196 + 1) * 50.0F);
                                                }
                                                if (var18.field4189 == null) {
                                                    if (var18.field4179 != null) {
                                                        if (class97.method768(0, var3, var4)) {
                                                            class151.method1117(var18.field4179, class288.field4960, class183.field2952, class213.field3632, class274.field4699, var3, var4, true);
                                                        } else {
                                                            class151.method1117(var18.field4179, class288.field4960, class183.field2952, class213.field3632, class274.field4699, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class97.method768(0, var3, var4)) {
                                                    class15.method74(var18.field4189, 0, class288.field4960, class183.field2952, class213.field3632, class274.field4699, var3, var4, true);
                                                } else {
                                                    class15.method74(var18.field4189, 0, class288.field4960, class183.field2952, class213.field3632, class274.field4699, var3, var4, false);
                                                }
                                                class216 var19 = var18.field4192;
                                                if (var19 != null) {
                                                    if (class281.field4827) {
                                                        if ((var19.field3676 & var2.field4195) == 0) {
                                                            class164.method1199(class210.field3580, class274.field4718, class59.field912, var5, var3, var4);
                                                        } else {
                                                            class164.method1202(var19.field3676, class210.field3580, class274.field4718, class59.field912, var6, var3, var4);
                                                        }
                                                    }
                                                    var19.field3663.method168(0, class288.field4960, class183.field2952, class213.field3632, class274.field4699, var19.field3662 - class210.field3580, var19.field3665 - class274.field4718, var19.field3667 - class59.field912, var19.field3674);
                                                }
                                                for (int var20 = 0; var20 < var18.field4188; var20++) {
                                                    class250 var21 = var18.field4182[var20];
                                                    if (var21 != null) {
                                                        if (class281.field4827) {
                                                            class164.method1199(class210.field3580, class274.field4718, class59.field912, var5, var3, var4);
                                                        }
                                                        var21.field4215.method168(var21.field4217, class288.field4960, class183.field2952, class213.field3632, class274.field4699, var21.field4214 - class210.field3580, var21.field4204 - class274.field4718, var21.field4203 - class59.field912, var21.field4206);
                                                    }
                                                }
                                                if (class281.field4827) {
                                                    class281.method1952(var8);
                                                }
                                            }
                                            boolean var22 = false;
                                            if (var2.field4189 == null) {
                                                if (var2.field4179 != null) {
                                                    if (class97.method768(var6, var3, var4)) {
                                                        class151.method1117(var2.field4179, class288.field4960, class183.field2952, class213.field3632, class274.field4699, var3, var4, true);
                                                    } else {
                                                        var22 = true;
                                                        class151.method1117(var2.field4179, class288.field4960, class183.field2952, class213.field3632, class274.field4699, var3, var4, false);
                                                    }
                                                }
                                            } else if (class97.method768(var6, var3, var4)) {
                                                class15.method74(var2.field4189, var6, class288.field4960, class183.field2952, class213.field3632, class274.field4699, var3, var4, true);
                                            } else {
                                                var22 = true;
                                                if (var2.field4189.field1347 != 12345678 || class29.field461 && var5 <= class215.field3658) {
                                                    class15.method74(var2.field4189, var6, class288.field4960, class183.field2952, class213.field3632, class274.field4699, var3, var4, false);
                                                }
                                            }
                                            if (var22) {
                                                class304 var23 = var2.field4184;
                                                if (var23 != null && (var23.field5200 & 0x80000000L) != 0L) {
                                                    if (class281.field4827 && var23.field5197) {
                                                        class281.method1952(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class281.field4827) {
                                                        class164.method1199(class210.field3580, class274.field4718, class59.field912, var5, var3, var4);
                                                    }
                                                    var23.field5194.method168(0, class288.field4960, class183.field2952, class213.field3632, class274.field4699, var23.field5203 - class210.field3580, var23.field5196 - class274.field4718, var23.field5195 - class59.field912, var23.field5200);
                                                    if (class281.field4827 && var23.field5197) {
                                                        class281.method1952(var8);
                                                    }
                                                }
                                            }
                                            int var24 = 0;
                                            int var25 = 0;
                                            class216 var26 = var2.field4192;
                                            class213 var27 = var2.field4183;
                                            if (var26 != null || var27 != null) {
                                                if (class77.field1264 == var3) {
                                                    var24++;
                                                } else if (class77.field1264 < var3) {
                                                    var24 += 2;
                                                }
                                                if (class81.field1305 == var4) {
                                                    var24 += 3;
                                                } else if (class81.field1305 > var4) {
                                                    var24 += 6;
                                                }
                                                var25 = class192.field3125[var24];
                                                var2.field4195 = class269.field4627[var24];
                                            }
                                            if (var26 != null) {
                                                if ((var26.field3676 & class16.field234[var24]) == 0) {
                                                    var2.field4193 = 0;
                                                } else if (var26.field3676 == 16) {
                                                    var2.field4193 = 3;
                                                    var2.field4180 = class67.field995[var24];
                                                    var2.field4181 = 3 - var2.field4180;
                                                } else if (var26.field3676 == 32) {
                                                    var2.field4193 = 6;
                                                    var2.field4180 = class293.field5036[var24];
                                                    var2.field4181 = 6 - var2.field4180;
                                                } else if (var26.field3676 == 64) {
                                                    var2.field4193 = 12;
                                                    var2.field4180 = class313.field5300[var24];
                                                    var2.field4181 = 12 - var2.field4180;
                                                } else {
                                                    var2.field4193 = 9;
                                                    var2.field4180 = class114.field1925[var24];
                                                    var2.field4181 = 9 - var2.field4180;
                                                }
                                                if ((var26.field3676 & var25) != 0 && !class22.method122(var6, var3, var4, var26.field3676)) {
                                                    if (class281.field4827) {
                                                        class164.method1199(class210.field3580, class274.field4718, class59.field912, var5, var3, var4);
                                                    }
                                                    var26.field3663.method168(0, class288.field4960, class183.field2952, class213.field3632, class274.field4699, var26.field3662 - class210.field3580, var26.field3665 - class274.field4718, var26.field3667 - class59.field912, var26.field3674);
                                                }
                                                if ((var26.field3673 & var25) != 0 && !class22.method122(var6, var3, var4, var26.field3673)) {
                                                    if (class281.field4827) {
                                                        class164.method1199(class210.field3580, class274.field4718, class59.field912, var5, var3, var4);
                                                    }
                                                    var26.field3668.method168(0, class288.field4960, class183.field2952, class213.field3632, class274.field4699, var26.field3662 - class210.field3580, var26.field3665 - class274.field4718, var26.field3667 - class59.field912, var26.field3674);
                                                }
                                            }
                                            if (var27 != null && !class29.method165(var6, var3, var4, var27.field3634.method176())) {
                                                if (class281.field4827) {
                                                    class281.method1952(var8 - 0.5F);
                                                }
                                                if ((var27.field3635 & var25) != 0) {
                                                    if (class281.field4827) {
                                                        class164.method1199(class210.field3580, class274.field4718, class59.field912, var5, var3, var4);
                                                    }
                                                    var27.field3634.method168(0, class288.field4960, class183.field2952, class213.field3632, class274.field4699, var27.field3622 + var27.field3636 - class210.field3580, var27.field3638 - class274.field4718, var27.field3639 + var27.field3640 - class59.field912, var27.field3625);
                                                } else if (var27.field3635 == 256) {
                                                    int var28 = var27.field3622 - class210.field3580;
                                                    int var29 = var27.field3638 - class274.field4718;
                                                    int var30 = var27.field3639 - class59.field912;
                                                    int var31 = var27.field3627;
                                                    int var32;
                                                    if (var31 == 1 || var31 == 2) {
                                                        var32 = -var28;
                                                    } else {
                                                        var32 = var28;
                                                    }
                                                    int var33;
                                                    if (var31 == 2 || var31 == 3) {
                                                        var33 = -var30;
                                                    } else {
                                                        var33 = var30;
                                                    }
                                                    if (var33 < var32) {
                                                        if (class281.field4827) {
                                                            class164.method1199(class210.field3580, class274.field4718, class59.field912, var5, var3, var4);
                                                        }
                                                        var27.field3634.method168(0, class288.field4960, class183.field2952, class213.field3632, class274.field4699, var27.field3636 + var28, var29, var27.field3640 + var30, var27.field3625);
                                                    } else if (var27.field3637 != null) {
                                                        if (class281.field4827) {
                                                            class164.method1199(class210.field3580, class274.field4718, class59.field912, var5, var3, var4);
                                                        }
                                                        var27.field3637.method168(0, class288.field4960, class183.field2952, class213.field3632, class274.field4699, var28, var29, var30, var27.field3625);
                                                    }
                                                }
                                                if (class281.field4827) {
                                                    class281.method1952(var8);
                                                }
                                            }
                                            if (var22) {
                                                class304 var34 = var2.field4184;
                                                if (var34 != null && (var34.field5200 & 0x80000000L) == 0L) {
                                                    if (class281.field4827 && var34.field5197) {
                                                        class281.method1952(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class281.field4827) {
                                                        class164.method1199(class210.field3580, class274.field4718, class59.field912, var5, var3, var4);
                                                    }
                                                    var34.field5194.method168(0, class288.field4960, class183.field2952, class213.field3632, class274.field4699, var34.field5203 - class210.field3580, var34.field5196 - class274.field4718, var34.field5195 - class59.field912, var34.field5200);
                                                    if (class281.field4827 && var34.field5197) {
                                                        class281.method1952(var8);
                                                    }
                                                }
                                                class293 var35 = var2.field4200;
                                                if (var35 != null && var35.field5029 == 0) {
                                                    if (class281.field4827) {
                                                        class164.method1199(class210.field3580, class274.field4718, class59.field912, var5, var3, var4);
                                                    }
                                                    if (var35.field5033 != null) {
                                                        var35.field5033.method168(0, class288.field4960, class183.field2952, class213.field3632, class274.field4699, var35.field5034 - class210.field3580, var35.field5035 - class274.field4718, var35.field5032 - class59.field912, var35.field5030);
                                                    }
                                                    if (var35.field5031 != null) {
                                                        var35.field5031.method168(0, class288.field4960, class183.field2952, class213.field3632, class274.field4699, var35.field5034 - class210.field3580, var35.field5035 - class274.field4718, var35.field5032 - class59.field912, var35.field5030);
                                                    }
                                                    if (var35.field5039 != null) {
                                                        var35.field5039.method168(0, class288.field4960, class183.field2952, class213.field3632, class274.field4699, var35.field5034 - class210.field3580, var35.field5035 - class274.field4718, var35.field5032 - class59.field912, var35.field5030);
                                                    }
                                                }
                                            }
                                            int var36 = var2.field4194;
                                            if (var36 != 0) {
                                                if (var3 < class77.field1264 && (var36 & 0x4) != 0) {
                                                    class249 var37 = var7[var3 + 1][var4];
                                                    if (var37 != null && var37.field4191) {
                                                        class97.field1672.method1472(true, var37);
                                                    }
                                                }
                                                if (var4 < class81.field1305 && (var36 & 0x2) != 0) {
                                                    class249 var38 = var7[var3][var4 + 1];
                                                    if (var38 != null && var38.field4191) {
                                                        class97.field1672.method1472(true, var38);
                                                    }
                                                }
                                                if (var3 > class77.field1264 && (var36 & 0x1) != 0) {
                                                    class249 var39 = var7[var3 - 1][var4];
                                                    if (var39 != null && var39.field4191) {
                                                        class97.field1672.method1472(true, var39);
                                                    }
                                                }
                                                if (var4 > class81.field1305 && (var36 & 0x8) != 0) {
                                                    class249 var40 = var7[var3][var4 - 1];
                                                    if (var40 != null && var40.field4191) {
                                                        class97.field1672.method1472(true, var40);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field4193 != 0) {
                                            boolean var41 = true;
                                            for (int var42 = 0; var42 < var2.field4188; var42++) {
                                                if (class54.field857 != var2.field4182[var42].field4209 && (var2.field4199[var42] & var2.field4193) == var2.field4180) {
                                                    var41 = false;
                                                    break;
                                                }
                                            }
                                            if (var41) {
                                                class216 var43 = var2.field4192;
                                                if (!class22.method122(var6, var3, var4, var43.field3676)) {
                                                    if (class281.field4827) {
                                                        label882: {
                                                            if ((var43.field3674 & 0xFC000L) == 16384L) {
                                                                int var44 = var43.field3662 - class210.field3580;
                                                                int var45 = var43.field3667 - class59.field912;
                                                                int var46 = (int) (var43.field3674 >> 20 & 0x3L);
                                                                if (var46 == 0) {
                                                                    var44 -= 64;
                                                                    var45 += 64;
                                                                    if (var45 < var44 && var3 > 0 && var4 < class315.field5347 - 1) {
                                                                        class164.method1199(class210.field3580, class274.field4718, class59.field912, var5, var3 - 1, var4 + 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 1) {
                                                                    var44 += 64;
                                                                    var45 += 64;
                                                                    if (var45 < -var44 && var3 < class29.field449 - 1 && var4 < class315.field5347 - 1) {
                                                                        class164.method1199(class210.field3580, class274.field4718, class59.field912, var5, var3 + 1, var4 + 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 2) {
                                                                    var44 += 64;
                                                                    var45 -= 64;
                                                                    if (var45 > var44 && var3 < class29.field449 - 1 && var4 > 0) {
                                                                        class164.method1199(class210.field3580, class274.field4718, class59.field912, var5, var3 + 1, var4 - 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 3) {
                                                                    var44 -= 64;
                                                                    var45 -= 64;
                                                                    if (var45 > -var44 && var3 > 0 && var4 > 0) {
                                                                        class164.method1199(class210.field3580, class274.field4718, class59.field912, var5, var3 - 1, var4 - 1);
                                                                        break label882;
                                                                    }
                                                                }
                                                            }
                                                            class164.method1199(class210.field3580, class274.field4718, class59.field912, var5, var3, var4);
                                                        }
                                                    }
                                                    var43.field3663.method168(0, class288.field4960, class183.field2952, class213.field3632, class274.field4699, var43.field3662 - class210.field3580, var43.field3665 - class274.field4718, var43.field3667 - class59.field912, var43.field3674);
                                                }
                                                var2.field4193 = 0;
                                            }
                                        }
                                        if (!var2.field4198) {
                                            break;
                                        }
                                        try {
                                            int var47 = var2.field4188;
                                            var2.field4198 = false;
                                            int var48 = 0;
                                            label767: for (int var49 = 0; var49 < var47; var49++) {
                                                class250 var50 = var2.field4182[var49];
                                                if (class54.field857 != var50.field4209) {
                                                    for (int var51 = var50.field4212; var51 <= var50.field4207; var51++) {
                                                        for (int var52 = var50.field4216; var52 <= var50.field4208; var52++) {
                                                            class249 var53 = var7[var51][var52];
                                                            if (var53.field4187) {
                                                                var2.field4198 = true;
                                                                continue label767;
                                                            }
                                                            if (var53.field4193 != 0) {
                                                                int var54 = 0;
                                                                if (var51 > var50.field4212) {
                                                                    var54++;
                                                                }
                                                                if (var51 < var50.field4207) {
                                                                    var54 += 4;
                                                                }
                                                                if (var52 > var50.field4216) {
                                                                    var54 += 8;
                                                                }
                                                                if (var52 < var50.field4208) {
                                                                    var54 += 2;
                                                                }
                                                                if ((var54 & var53.field4193) == var2.field4181) {
                                                                    var2.field4198 = true;
                                                                    continue label767;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class304.field5204[var48++] = var50;
                                                    int var55 = class77.field1264 - var50.field4212;
                                                    int var56 = var50.field4207 - class77.field1264;
                                                    if (var56 > var55) {
                                                        var55 = var56;
                                                    }
                                                    int var57 = class81.field1305 - var50.field4216;
                                                    int var58 = var50.field4208 - class81.field1305;
                                                    if (var58 > var57) {
                                                        var50.field4210 = var55 + var58;
                                                    } else {
                                                        var50.field4210 = var55 + var57;
                                                    }
                                                }
                                            }
                                            while (var48 > 0) {
                                                int var59 = -50;
                                                int var60 = -1;
                                                for (int var61 = 0; var61 < var48; var61++) {
                                                    class250 var62 = class304.field5204[var61];
                                                    if (class54.field857 != var62.field4209) {
                                                        if (var62.field4210 > var59) {
                                                            var59 = var62.field4210;
                                                            var60 = var61;
                                                        } else if (var62.field4210 == var59) {
                                                            int var63 = var62.field4214 - class210.field3580;
                                                            int var64 = var62.field4203 - class59.field912;
                                                            int var65 = class304.field5204[var60].field4214 - class210.field3580;
                                                            int var66 = class304.field5204[var60].field4203 - class59.field912;
                                                            if (var63 * var63 + var64 * var64 > var65 * var65 + var66 * var66) {
                                                                var60 = var61;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var60 == -1) {
                                                    break;
                                                }
                                                class250 var67 = class304.field5204[var60];
                                                var67.field4209 = class54.field857;
                                                if (!class292.method2064(var6, var67.field4212, var67.field4207, var67.field4216, var67.field4208, var67.field4215.method176())) {
                                                    if (class281.field4827) {
                                                        if ((var67.field4206 & 0xFC000L) == 147456L) {
                                                            class164.method1199(class210.field3580, class274.field4718, class59.field912, var5, var3, var4);
                                                            int var68 = var67.field4214 - class210.field3580;
                                                            int var69 = var67.field4203 - class59.field912;
                                                            int var70 = (int) (var67.field4206 >> 20 & 0x3L);
                                                            if (var70 == 1 || var70 == 3) {
                                                                if (var69 > -var68) {
                                                                    class164.method1200(var5, var3, var4 - 1, var3 - 1, var4);
                                                                } else {
                                                                    class164.method1200(var5, var3, var4 + 1, var3 + 1, var4);
                                                                }
                                                            } else if (var69 > var68) {
                                                                class164.method1200(var5, var3, var4 - 1, var3 + 1, var4);
                                                            } else {
                                                                class164.method1200(var5, var3, var4 + 1, var3 - 1, var4);
                                                            }
                                                        } else {
                                                            class164.method1206(class210.field3580, class274.field4718, class59.field912, var5, var67.field4212, var67.field4216, var67.field4207, var67.field4208);
                                                        }
                                                    }
                                                    var67.field4215.method168(var67.field4217, class288.field4960, class183.field2952, class213.field3632, class274.field4699, var67.field4214 - class210.field3580, var67.field4204 - class274.field4718, var67.field4203 - class59.field912, var67.field4206);
                                                }
                                                for (int var71 = var67.field4212; var71 <= var67.field4207; var71++) {
                                                    for (int var72 = var67.field4216; var72 <= var67.field4208; var72++) {
                                                        class249 var73 = var7[var71][var72];
                                                        if (var73.field4193 != 0) {
                                                            class97.field1672.method1472(true, var73);
                                                        } else if ((var3 != var71 || var4 != var72) && var73.field4191) {
                                                            class97.field1672.method1472(true, var73);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field4198) {
                                                break;
                                            }
                                        } catch (Exception var93) {
                                            var2.field4198 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field4191);
                            } while (var2.field4193 != 0);
                            if (var3 > class77.field1264 || var3 <= class70.field1078) {
                                break;
                            }
                            var75 = var7[var3 - 1][var4];
                        } while (var75 != null && var75.field4191);
                        if (var3 < class77.field1264 || var3 >= class238.field3954 - 1) {
                            break;
                        }
                        var76 = var7[var3 + 1][var4];
                    } while (var76 != null && var76.field4191);
                    if (var4 > class81.field1305 || var4 <= class69.field1037) {
                        break;
                    }
                    var77 = var7[var3][var4 - 1];
                } while (var77 != null && var77.field4191);
                if (var4 < class81.field1305 || var4 >= class4.field64 - 1) {
                    break;
                }
                var78 = var7[var3][var4 + 1];
            } while (var78 != null && var78.field4191);
            var2.field4191 = false;
            class55.field866--;
            class293 var79 = var2.field4200;
            if (var79 != null && var79.field5029 != 0) {
                if (class281.field4827) {
                    class164.method1199(class210.field3580, class274.field4718, class59.field912, var5, var3, var4);
                }
                if (var79.field5033 != null) {
                    var79.field5033.method168(0, class288.field4960, class183.field2952, class213.field3632, class274.field4699, var79.field5034 - class210.field3580, var79.field5035 - class274.field4718 - var79.field5029, var79.field5032 - class59.field912, var79.field5030);
                }
                if (var79.field5031 != null) {
                    var79.field5031.method168(0, class288.field4960, class183.field2952, class213.field3632, class274.field4699, var79.field5034 - class210.field3580, var79.field5035 - class274.field4718 - var79.field5029, var79.field5032 - class59.field912, var79.field5030);
                }
                if (var79.field5039 != null) {
                    var79.field5039.method168(0, class288.field4960, class183.field2952, class213.field3632, class274.field4699, var79.field5034 - class210.field3580, var79.field5035 - class274.field4718 - var79.field5029, var79.field5032 - class59.field912, var79.field5030);
                }
            }
            if (var2.field4195 != 0) {
                class213 var80 = var2.field4183;
                if (var80 != null && !class29.method165(var6, var3, var4, var80.field3634.method176())) {
                    if ((var80.field3635 & var2.field4195) != 0) {
                        if (class281.field4827) {
                            class164.method1199(class210.field3580, class274.field4718, class59.field912, var5, var3, var4);
                        }
                        var80.field3634.method168(0, class288.field4960, class183.field2952, class213.field3632, class274.field4699, var80.field3622 + var80.field3636 - class210.field3580, var80.field3638 - class274.field4718, var80.field3639 + var80.field3640 - class59.field912, var80.field3625);
                    } else if (var80.field3635 == 256) {
                        int var81 = var80.field3622 - class210.field3580;
                        int var82 = var80.field3638 - class274.field4718;
                        int var83 = var80.field3639 - class59.field912;
                        int var84 = var80.field3627;
                        int var85;
                        if (var84 == 1 || var84 == 2) {
                            var85 = -var81;
                        } else {
                            var85 = var81;
                        }
                        int var86;
                        if (var84 == 2 || var84 == 3) {
                            var86 = -var83;
                        } else {
                            var86 = var83;
                        }
                        if (var86 >= var85) {
                            if (class281.field4827) {
                                class164.method1199(class210.field3580, class274.field4718, class59.field912, var5, var3, var4);
                            }
                            var80.field3634.method168(0, class288.field4960, class183.field2952, class213.field3632, class274.field4699, var80.field3636 + var81, var82, var80.field3640 + var83, var80.field3625);
                        } else if (var80.field3637 != null) {
                            if (class281.field4827) {
                                class164.method1199(class210.field3580, class274.field4718, class59.field912, var5, var3, var4);
                            }
                            var80.field3637.method168(0, class288.field4960, class183.field2952, class213.field3632, class274.field4699, var81, var82, var83, var80.field3625);
                        }
                    }
                }
                class216 var87 = var2.field4192;
                if (var87 != null) {
                    if ((var87.field3673 & var2.field4195) != 0 && !class22.method122(var6, var3, var4, var87.field3673)) {
                        if (class281.field4827) {
                            class164.method1202(var87.field3673, class210.field3580, class274.field4718, class59.field912, var6, var3, var4);
                        }
                        var87.field3668.method168(0, class288.field4960, class183.field2952, class213.field3632, class274.field4699, var87.field3662 - class210.field3580, var87.field3665 - class274.field4718, var87.field3667 - class59.field912, var87.field3674);
                    }
                    if ((var87.field3676 & var2.field4195) != 0 && !class22.method122(var6, var3, var4, var87.field3676)) {
                        if (class281.field4827) {
                            class164.method1202(var87.field3676, class210.field3580, class274.field4718, class59.field912, var6, var3, var4);
                        }
                        var87.field3663.method168(0, class288.field4960, class183.field2952, class213.field3632, class274.field4699, var87.field3662 - class210.field3580, var87.field3665 - class274.field4718, var87.field3667 - class59.field912, var87.field3674);
                    }
                }
            }
            if (var5 < class295.field5061 - 1) {
                class249 var88 = class118.field1984[var5 + 1][var3][var4];
                if (var88 != null && var88.field4191) {
                    class97.field1672.method1472(true, var88);
                }
            }
            if (var3 < class77.field1264) {
                class249 var89 = var7[var3 + 1][var4];
                if (var89 != null && var89.field4191) {
                    class97.field1672.method1472(true, var89);
                }
            }
            if (var4 < class81.field1305) {
                class249 var90 = var7[var3][var4 + 1];
                if (var90 != null && var90.field4191) {
                    class97.field1672.method1472(true, var90);
                }
            }
            if (var3 > class77.field1264) {
                class249 var91 = var7[var3 - 1][var4];
                if (var91 != null && var91.field4191) {
                    class97.field1672.method1472(true, var91);
                }
            }
            if (var4 > class81.field1305) {
                class249 var92 = var7[var3][var4 - 1];
                if (var92 != null && var92.field4191) {
                    class97.field1672.method1472(true, var92);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)I", line = 1022)
    public final int method1568(int arg0) {
        if (arg0 != 18914) {
            this.field3757 = 65;
        }
        field3752++;
        return (this.field3753 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V", line = 1046)
    public class224() {
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Lpb;)V", line = 1048)
    public class224(class70 arg0) {
        this.field3753 = arg0.method466((byte) -46);
        this.field3755 = arg0.method423(255);
        this.field3758 = arg0.method469(96);
        this.field3754 = arg0.method469(94);
        this.field3757 = arg0.method469(77);
        this.field3760 = arg0.method469(97);
    }
}
