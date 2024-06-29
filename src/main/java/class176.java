import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public abstract class class176 {

    @OriginalMember(owner = "client!d", name = "f", descriptor = "I")
    public int field2215;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "I")
    public int field2214;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "I")
    public int field2212;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "I")
    public int field2210;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "I")
    public static int field2213;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lcga;Laf;)V", line = 9)
    public static final void method1164(class255 arg0, class651 arg1) {
        if (!arg1.field9231) {
            return;
        }
        short var2 = arg1.field9233;
        short var3 = arg1.field9236;
        byte var4 = arg1.field9218;
        byte var5 = arg1.field9239;
        int var6 = (var2 << class428.field5949) + class49.field656;
        int var7 = (var3 << class428.field5949) + class49.field656;
        class651[][] var8 = class145.field1841[var4];
        if (class397.field5666 == class185.field2270) {
            class277.field3750.method1888(class249.field3345[0].method159(var6, var7), class191.method1225(var2, var3), class380.method2302(var2, var3), class528.method3006(var2, var3));
        }
        if (arg1.field9235) {
            if (class430.field5983) {
                if (var4 > 0) {
                    class651 var9 = class145.field1841[var4 - 1][var2][var3];
                    if (var9 != null && var9.field9231) {
                        return;
                    }
                }
                if (var2 <= class297.field3975 && var2 > class502.field6784) {
                    class651 var10 = var8[var2 - 1][var3];
                    if (var10 != null && var10.field9231 && (var10.field9235 || (arg1.field9237 & 0x1) == 0)) {
                        return;
                    }
                }
                if (var2 >= class297.field3975 && var2 < class368.field5298 - 1) {
                    class651 var11 = var8[var2 + 1][var3];
                    if (var11 != null && var11.field9231 && (var11.field9235 || (arg1.field9237 & 0x4) == 0)) {
                        return;
                    }
                }
                if (var3 <= class274.field3710 && var3 > class552.field7557) {
                    class651 var12 = var8[var2][var3 - 1];
                    if (var12 != null && var12.field9231 && (var12.field9235 || (arg1.field9237 & 0x8) == 0)) {
                        return;
                    }
                }
                if (var3 >= class274.field3710 && var3 < class542.field7444 - 1) {
                    class651 var13 = var8[var2][var3 + 1];
                    if (var13 != null && var13.field9231 && (var13.field9235 || (arg1.field9237 & 0x2) == 0)) {
                        return;
                    }
                }
            } else {
                class430.field5983 = true;
            }
            arg1.field9235 = false;
            if (arg1.field9225 != null) {
                class651 var14 = arg1.field9225;
                if (!class388.method2325(var14.field9239, var2, var3)) {
                    class397.field5666[var14.field9239].method155(var2, var3);
                }
                class142 var15 = var14.field9220;
                if (var15 != null) {
                    if (class334.field4896) {
                        if ((var15.field1809 & arg1.field9229) == 0) {
                            class414.method2422(arg0, var4, var2, var3);
                        } else {
                            class533.method3019(arg0, var15.field1809, var5, var2, var3);
                        }
                        class277.field3750.method2016(arg0.field3524, arg0.field3515);
                    }
                    var15.method136(class277.field3750, (byte) -88);
                }
                for (class82 var16 = var14.field9228; var16 != null; var16 = var16.field1024) {
                    class293 var17 = var16.field1027;
                    if (var17 != null) {
                        if (class334.field4896) {
                            class414.method2422(arg0, var4, var2, var3);
                            class277.field3750.method2016(arg0.field3524, arg0.field3515);
                        }
                        var17.method136(class277.field3750, (byte) -126);
                    }
                }
            }
            boolean var18 = !class388.method2325(var5, var2, var3);
            if (var18) {
                class397.field5666[var5].method155(var2, var3);
                class331 var19 = arg1.field9227;
                if (var19 != null && var19.field4840) {
                    if (class334.field4896) {
                        class414.method2422(arg0, var4, var2, var3);
                        class277.field3750.method2016(arg0.field3524, arg0.field3515);
                    }
                    class95 var20 = var19.method136(class277.field3750, (byte) -96);
                    if (var20 != null) {
                        var20.field1176 = var19;
                        var20.field1173 = var4;
                        var20.field1170 = var2;
                        var20.field1172 = var3;
                        class34.field332.method2216(4, var20);
                    }
                }
            }
            int var21 = 0;
            int var22 = 0;
            class142 var23 = arg1.field9220;
            class249 var24 = arg1.field9238;
            if (var23 != null || var24 != null) {
                if (class297.field3975 == var2) {
                    var21++;
                } else if (class297.field3975 < var2) {
                    var21 += 2;
                }
                if (class274.field3710 == var3) {
                    var21 += 3;
                } else if (class274.field3710 > var3) {
                    var21 += 6;
                }
                var22 = class141.field1801[var21];
                arg1.field9229 = class314.field4516[var21];
            }
            if (var23 != null) {
                if ((var23.field1809 & class550.field7526[var21]) == 0) {
                    arg1.field9226 = 0;
                } else if (var23.field1809 == 16) {
                    arg1.field9226 = 3;
                    arg1.field9221 = class332.field4853[var21];
                    arg1.field9230 = (byte) (3 - arg1.field9221);
                } else if (var23.field1809 == 32) {
                    arg1.field9226 = 6;
                    arg1.field9221 = class216.field2790[var21];
                    arg1.field9230 = (byte) (6 - arg1.field9221);
                } else if (var23.field1809 == 64) {
                    arg1.field9226 = 12;
                    arg1.field9221 = class51.field668[var21];
                    arg1.field9230 = (byte) (12 - arg1.field9221);
                } else {
                    arg1.field9226 = 9;
                    arg1.field9221 = class386.field5598[var21];
                    arg1.field9230 = (byte) (9 - arg1.field9221);
                }
                if ((var23.field1809 & var22) != 0 && !class500.method2819(var5, var2, var3, var23.field1809)) {
                    if (class334.field4896) {
                        class414.method2422(arg0, var4, var2, var3);
                        class277.field3750.method2016(arg0.field3524, arg0.field3515);
                    }
                    class95 var25 = var23.method136(class277.field3750, (byte) -110);
                    if (var25 != null) {
                        var25.field1176 = var23;
                        var25.field1173 = var4;
                        var25.field1170 = var2;
                        var25.field1172 = var3;
                        class34.field332.method2216(4, var25);
                    }
                }
                class142 var26 = arg1.field9224;
                if (var26 != null && (var26.field1809 & var22) != 0 && !class500.method2819(var5, var2, var3, var26.field1809)) {
                    if (class334.field4896) {
                        class414.method2422(arg0, var4, var2, var3);
                        class277.field3750.method2016(arg0.field3524, arg0.field3515);
                    }
                    class95 var27 = var26.method136(class277.field3750, (byte) -73);
                    if (var27 != null) {
                        var27.field1176 = var26;
                        var27.field1173 = var4;
                        var27.field1170 = var2;
                        var27.field1172 = var3;
                        class34.field332.method2216(4, var27);
                    }
                }
            }
            if (var24 != null && !class195.method1252(var5, var2, var3, var24.method522(-122))) {
                class249 var28 = arg1.field9234;
                if ((var24.field3356 & var22) != 0) {
                    if (class334.field4896) {
                        class414.method2422(arg0, var4, var2, var3);
                        class277.field3750.method2016(arg0.field3524, arg0.field3515);
                    }
                    class95 var29 = var24.method136(class277.field3750, (byte) -57);
                    if (var29 != null) {
                        var29.field1176 = var24;
                        var29.field1173 = var4;
                        var29.field1170 = var2;
                        var29.field1172 = var3;
                        class34.field332.method2216(4, var29);
                    }
                } else if (var24.field3356 == 256) {
                    int var30 = var24.field3343 - class294.field3946;
                    int var31 = var24.field3350 - class99.field1212;
                    int var32 = var24.field3347;
                    int var33;
                    if (var32 == 1 || var32 == 2) {
                        var33 = -var30;
                    } else {
                        var33 = var30;
                    }
                    int var34;
                    if (var32 == 2 || var32 == 3) {
                        var34 = -var31;
                    } else {
                        var34 = var31;
                    }
                    if (class334.field4896) {
                        class414.method2422(arg0, var4, var2, var3);
                        class277.field3750.method2016(arg0.field3524, arg0.field3515);
                    }
                    if (var34 < var33) {
                        class95 var35 = var24.method136(class277.field3750, (byte) -73);
                        if (var35 != null) {
                            var35.field1176 = var24;
                            var35.field1173 = var4;
                            var35.field1170 = var2;
                            var35.field1172 = var3;
                            class34.field332.method2216(4, var35);
                        }
                    } else if (var28 != null) {
                        class95 var36 = var28.method136(class277.field3750, (byte) -125);
                        if (var36 != null) {
                            var36.field1176 = var28;
                            var36.field1173 = var4;
                            var36.field1170 = var2;
                            var36.field1172 = var3;
                            class34.field332.method2216(4, var36);
                        }
                    }
                }
            }
            if (var18) {
                class331 var37 = arg1.field9227;
                if (var37 != null && !var37.field4840) {
                    if (class334.field4896) {
                        class414.method2422(arg0, var4, var2, var3);
                        class277.field3750.method2016(arg0.field3524, arg0.field3515);
                    }
                    class95 var38 = var37.method136(class277.field3750, (byte) -99);
                    if (var38 != null) {
                        var38.field1176 = var37;
                        var38.field1173 = var4;
                        var38.field1170 = var2;
                        var38.field1172 = var3;
                        class34.field332.method2216(4, var38);
                    }
                }
                class650 var39 = arg1.field9219;
                if (var39 != null && !var39.field9208) {
                    if (class334.field4896) {
                        class414.method2422(arg0, var4, var2, var3);
                        class277.field3750.method2016(arg0.field3524, arg0.field3515);
                    }
                    class95 var40 = var39.method136(class277.field3750, (byte) -111);
                    if (var40 != null) {
                        var40.field1176 = var39;
                        var40.field1173 = var4;
                        var40.field1170 = var2;
                        var40.field1172 = var3;
                        class34.field332.method2216(4, var40);
                    }
                }
            }
            byte var41 = arg1.field9237;
            if (var41 != 0) {
                if (var2 < class297.field3975 && (var41 & 0x4) != 0) {
                    class651 var42 = var8[var2 + 1][var3];
                    if (var42 != null && var42.field9231) {
                        class297.field3973.method511(127, var42);
                    }
                }
                if (var3 < class274.field3710 && (var41 & 0x2) != 0) {
                    class651 var43 = var8[var2][var3 + 1];
                    if (var43 != null && var43.field9231) {
                        class297.field3973.method511(124, var43);
                    }
                }
                if (var2 > class297.field3975 && (var41 & 0x1) != 0) {
                    class651 var44 = var8[var2 - 1][var3];
                    if (var44 != null && var44.field9231) {
                        class297.field3973.method511(106, var44);
                    }
                }
                if (var3 > class274.field3710 && (var41 & 0x8) != 0) {
                    class651 var45 = var8[var2][var3 - 1];
                    if (var45 != null && var45.field9231) {
                        class297.field3973.method511(106, var45);
                    }
                }
            }
        }
        if (arg1.field9226 != 0) {
            boolean var46 = true;
            for (class82 var47 = arg1.field9228; var47 != null; var47 = var47.field1024) {
                if (class675.field9559 != var47.field1027.field3924 && (var47.field1025 & arg1.field9226) == arg1.field9221) {
                    var46 = false;
                    break;
                }
            }
            if (var46) {
                class142 var48 = arg1.field9220;
                if (!class500.method2819(var5, var2, var3, var48.field1809)) {
                    if (class334.field4896) {
                        label663: {
                            if (var48.field1809 >= 16) {
                                int var49 = var2 - class297.field3975;
                                int var50 = var3 - class274.field3710;
                                if (var48.field1809 == 16) {
                                    int var51 = var49 - class49.field656;
                                    int var52 = class49.field656 + var50;
                                    if (var52 < var51 && var2 > 0 && var3 <= class334.field4887) {
                                        class414.method2422(arg0, var4, var2 - 1, var3 + 1);
                                        break label663;
                                    }
                                } else if (var48.field1809 == 32) {
                                    int var53 = class49.field656 + var49;
                                    int var54 = class49.field656 + var50;
                                    if (var54 < -var53 && var2 < class149.field1872 && var3 < class334.field4887) {
                                        class414.method2422(arg0, var4, var2 + 1, var3 + 1);
                                        break label663;
                                    }
                                } else if (var48.field1809 == 64) {
                                    int var55 = class49.field656 + var49;
                                    int var56 = var50 - class49.field656;
                                    if (var56 > var55 && var2 < class149.field1872 && var3 > 0) {
                                        class414.method2422(arg0, var4, var2 + 1, var3 - 1);
                                        break label663;
                                    }
                                } else if (var48.field1809 == 128) {
                                    int var57 = var49 - class49.field656;
                                    int var58 = var50 - class49.field656;
                                    if (var58 > -var57 && var2 > 0 && var3 > 0) {
                                        class414.method2422(arg0, var4, var2 - 1, var3 - 1);
                                        break label663;
                                    }
                                }
                            }
                            class414.method2422(arg0, var4, var2, var3);
                        }
                        class277.field3750.method2016(arg0.field3524, arg0.field3515);
                    }
                    class95 var59 = var48.method136(class277.field3750, (byte) -85);
                    if (var59 != null) {
                        var59.field1176 = var48;
                        var59.field1173 = var4;
                        var59.field1170 = var2;
                        var59.field1172 = var3;
                        class34.field332.method2216(4, var59);
                    }
                }
                arg1.field9226 = 0;
            }
        }
        if (arg1.field9223) {
            try {
                arg1.field9223 = false;
                int var60 = 0;
                label606: for (class82 var61 = arg1.field9228; var61 != null; var61 = var61.field1024) {
                    class293 var62 = var61.field1027;
                    if (class675.field9559 != var62.field3924) {
                        for (int var63 = var62.field3921; var63 <= var62.field3928; var63++) {
                            for (int var64 = var62.field3920; var64 <= var62.field3923; var64++) {
                                class651 var65 = var8[var63][var64];
                                if (var65.field9235) {
                                    arg1.field9223 = true;
                                    continue label606;
                                }
                                if (var65.field9226 != 0) {
                                    int var66 = 0;
                                    if (var63 > var62.field3921) {
                                        var66++;
                                    }
                                    if (var63 < var62.field3928) {
                                        var66 += 4;
                                    }
                                    if (var64 > var62.field3920) {
                                        var66 += 8;
                                    }
                                    if (var64 < var62.field3923) {
                                        var66 += 2;
                                    }
                                    if ((var66 & var65.field9226) == arg1.field9230) {
                                        arg1.field9223 = true;
                                        continue label606;
                                    }
                                }
                            }
                        }
                        int var67 = class297.field3975 - var62.field3921;
                        int var68 = var62.field3928 - class297.field3975;
                        if (var68 > var67) {
                            var67 = var68;
                        }
                        int var69 = class274.field3710 - var62.field3920;
                        int var70 = var62.field3923 - class274.field3710;
                        if (var70 > var69) {
                            var69 = var70;
                        }
                        arg0.field3522[var60] = var62;
                        arg0.field3520[var60++] = var67 + var69;
                    }
                }
                while (var60 > 0) {
                    int var71 = -50;
                    int var72 = -1;
                    for (int var73 = 0; var73 < var60; var73++) {
                        class293 var74 = arg0.field3522[var73];
                        if (class675.field9559 != var74.field3924) {
                            int var75 = arg0.field3520[var73];
                            if (var75 > var71) {
                                var71 = var75;
                                var72 = var73;
                            } else if (var71 == var75) {
                                int var76 = var74.field3929 - class294.field3946;
                                int var77 = var74.field3917 - class99.field1212;
                                int var78 = arg0.field3522[var72].field3929 - class294.field3946;
                                int var79 = arg0.field3522[var72].field3917 - class99.field1212;
                                if (var76 * var76 + var77 * var77 > var78 * var78 + var79 * var79) {
                                    var72 = var73;
                                }
                            }
                        }
                    }
                    if (var72 == -1) {
                        break;
                    }
                    class293 var80 = arg0.field3522[var72];
                    var80.field3924 = class675.field9559;
                    if (!class531.method3016(var5, var80.field3921, var80.field3928, var80.field3920, var80.field3923, var80.method1738(3891))) {
                        if (class334.field4896) {
                            if (var80.field3926 == 0) {
                                class21.method120(arg0, var4, var80.field3921, var80.field3920, var80.field3928, var80.field3923);
                            } else {
                                class414.method2422(arg0, var4, var2, var3);
                                int var81 = var2 - class297.field3975;
                                int var82 = var3 - class274.field3710;
                                if (var80.field3926 == 2) {
                                    if (var82 > -var81) {
                                        class209.method1311(arg0, var4, var2, var3 - 1, var2 - 1, var3);
                                    } else {
                                        class209.method1311(arg0, var4, var2, var3 + 1, var2 + 1, var3);
                                    }
                                } else if (var82 > var81) {
                                    class209.method1311(arg0, var4, var2, var3 - 1, var2 + 1, var3);
                                } else {
                                    class209.method1311(arg0, var4, var2, var3 + 1, var2 - 1, var3);
                                }
                            }
                            class277.field3750.method2016(arg0.field3524, arg0.field3515);
                        }
                        class95 var83 = var80.method136(class277.field3750, (byte) -82);
                        if (var83 != null) {
                            var83.field1176 = var80;
                            var83.field1173 = var4;
                            var83.field1170 = var80.field3921;
                            var83.field1172 = var80.field3920;
                            class34.field332.method2216(4, var83);
                        }
                    }
                    for (int var84 = var80.field3921; var84 <= var80.field3928; var84++) {
                        for (int var85 = var80.field3920; var85 <= var80.field3923; var85++) {
                            class651 var86 = var8[var84][var85];
                            if (var86.field9226 != 0) {
                                class297.field3973.method511(123, var86);
                            } else if ((var2 != var84 || var3 != var85) && var86.field9231) {
                                class297.field3973.method511(126, var86);
                            }
                        }
                    }
                }
                if (arg1.field9223) {
                    return;
                }
            } catch (Exception var121) {
                arg1.field9223 = false;
            }
        }
        if (arg1.field9240 != null && (byte) (class120.field1541 & 0xFF) == arg1.field9232) {
            class309 var87 = arg1.field9240;
            int var88 = class397.field5666[var4].method150(var2, var3);
            int var89;
            if (var4 < class87.field1079 - 1) {
                var89 = class397.field5666[var4].method150(var2, var3) - class397.field5666[var4 + 1].method150(var2, var3);
            } else {
                var89 = 0x8 << class428.field5949;
            }
            class579.field8002.method608(var6, var88, var7, arg0.field3525);
            int var90 = arg0.field3525[2];
            class579.field8002.method608(var6, var88 - var89, var7, arg0.field3525);
            int var91 = arg0.field3525[2];
            int var92 = var90;
            int var93 = var91;
            if (var90 > var91) {
                var92 = var91;
                var93 = var90;
            }
            int var94 = var92 - class6.field50;
            int var95 = class6.field50 + var93;
            var87.field4147 = var94;
            var87.field4149 = var95;
            var87.field4148 = true;
            class277.field3750.method1961(var87);
        }
        if (!arg1.field9231) {
            return;
        }
        if (arg1.field9226 != 0) {
            return;
        }
        if (var2 <= class297.field3975 && var2 > class502.field6784) {
            class651 var96 = var8[var2 - 1][var3];
            if (var96 != null && var96.field9231) {
                return;
            }
        }
        if (var2 >= class297.field3975 && var2 < class368.field5298 - 1) {
            class651 var97 = var8[var2 + 1][var3];
            if (var97 != null && var97.field9231) {
                return;
            }
        }
        if (var3 <= class274.field3710 && var3 > class552.field7557) {
            class651 var98 = var8[var2][var3 - 1];
            if (var98 != null && var98.field9231) {
                return;
            }
        }
        if (var3 >= class274.field3710 && var3 < class542.field7444 - 1) {
            class651 var99 = var8[var2][var3 + 1];
            if (var99 != null && var99.field9231) {
                return;
            }
        }
        arg1.field9231 = false;
        class482.field6489--;
        class650 var100 = arg1.field9219;
        if (var100 != null && var100.field9208) {
            if (class334.field4896) {
                class414.method2422(arg0, var4, var2, var3);
                class277.field3750.method2016(arg0.field3524, arg0.field3515);
            }
            class95 var101 = var100.method136(class277.field3750, (byte) -108);
            if (var101 != null) {
                var101.field1176 = var100;
                var101.field1173 = var4;
                var101.field1170 = var2;
                var101.field1172 = var3;
                class34.field332.method2216(4, var101);
            }
        }
        if (arg1.field9229 != 0) {
            class249 var102 = arg1.field9238;
            if (var102 != null && !class195.method1252(var5, var2, var3, var102.method522(-100))) {
                if ((var102.field3356 & arg1.field9229) != 0) {
                    if (class334.field4896) {
                        class414.method2422(arg0, var4, var2, var3);
                        class277.field3750.method2016(arg0.field3524, arg0.field3515);
                    }
                    class95 var103 = var102.method136(class277.field3750, (byte) -51);
                    if (var103 != null) {
                        var103.field1176 = var102;
                        var103.field1173 = var4;
                        var103.field1170 = var2;
                        var103.field1172 = var3;
                        class34.field332.method2216(4, var103);
                    }
                } else if (var102.field3356 == 256) {
                    int var104 = var102.field3343 - class294.field3946;
                    int var105 = var102.field3350 - class99.field1212;
                    int var106 = var102.field3347;
                    int var107;
                    if (var106 == 1 || var106 == 2) {
                        var107 = -var104;
                    } else {
                        var107 = var104;
                    }
                    int var108;
                    if (var106 == 2 || var106 == 3) {
                        var108 = -var105;
                    } else {
                        var108 = var105;
                    }
                    if (class334.field4896) {
                        class414.method2422(arg0, var4, var2, var3);
                        class277.field3750.method2016(arg0.field3524, arg0.field3515);
                    }
                    class249 var109 = arg1.field9234;
                    if (var108 > var107) {
                        class95 var110 = var102.method136(class277.field3750, (byte) -75);
                        if (var110 != null) {
                            var110.field1176 = var102;
                            var110.field1173 = var4;
                            var110.field1170 = var2;
                            var110.field1172 = var3;
                            class34.field332.method2216(4, var110);
                        }
                    } else if (var109 != null) {
                        class95 var111 = var109.method136(class277.field3750, (byte) -65);
                        if (var111 != null) {
                            var111.field1176 = var109;
                            var111.field1173 = var4;
                            var111.field1170 = var2;
                            var111.field1172 = var3;
                            class34.field332.method2216(4, var111);
                        }
                    }
                }
            }
            class142 var112 = arg1.field9220;
            class142 var113 = arg1.field9224;
            if (var113 != null && (var113.field1809 & arg1.field9229) != 0 && !class500.method2819(var5, var2, var3, var113.field1809)) {
                if (class334.field4896) {
                    class533.method3019(arg0, var113.field1809, var4, var2, var3);
                    class277.field3750.method2016(arg0.field3524, arg0.field3515);
                }
                class95 var114 = var113.method136(class277.field3750, (byte) -77);
                if (var114 != null) {
                    var114.field1176 = var113;
                    var114.field1173 = var4;
                    var114.field1170 = var2;
                    var114.field1172 = var3;
                    class34.field332.method2216(4, var114);
                }
            }
            if (var112 != null && (var112.field1809 & arg1.field9229) != 0 && !class500.method2819(var5, var2, var3, var112.field1809)) {
                if (class334.field4896) {
                    class533.method3019(arg0, var112.field1809, var4, var2, var3);
                    class277.field3750.method2016(arg0.field3524, arg0.field3515);
                }
                class95 var115 = var112.method136(class277.field3750, (byte) -107);
                if (var115 != null) {
                    var115.field1176 = var112;
                    var115.field1173 = var4;
                    var115.field1170 = var2;
                    var115.field1172 = var3;
                    class34.field332.method2216(4, var115);
                }
            }
        }
        if (var4 < class87.field1079 - 1) {
            class651 var116 = class145.field1841[var4 + 1][var2][var3];
            if (var116 != null && var116.field9231) {
                class297.field3973.method513(var116, 5000);
            }
        }
        if (var2 < class297.field3975) {
            class651 var117 = var8[var2 + 1][var3];
            if (var117 != null && var117.field9231) {
                class297.field3973.method511(104, var117);
            }
        }
        if (var3 < class274.field3710) {
            class651 var118 = var8[var2][var3 + 1];
            if (var118 != null && var118.field9231) {
                class297.field3973.method511(93, var118);
            }
        }
        if (var2 > class297.field3975) {
            class651 var119 = var8[var2 - 1][var3];
            if (var119 != null && var119.field9231) {
                class297.field3973.method511(117, var119);
            }
        }
        if (var3 > class274.field3710) {
            class651 var120 = var8[var2][var3 - 1];
            if (var120 != null && var120.field9231) {
                class297.field3973.method511(95, var120);
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II[F)[F", line = 1116)
    public static final float[] method1165(int arg0, int arg1, float[] arg2) {
        field2213++;
        float[] var3 = new float[arg1];
        class657.method3635(arg2, arg0, var3, 0, arg1);
        return var3;
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(III)V", line = 1128)
    public class176(int arg0, int arg1, int arg2) {
        this.field2215 = arg1;
        this.field2214 = arg0;
        while (arg2 > 1) {
            arg2 >>= 0x1;
            this.field2212++;
        }
        this.field2210 = 0x1 << this.field2212;
    }

    @OriginalMember(owner = "client!d", name = "ba", descriptor = "()V")
    public abstract void method148();

    @OriginalMember(owner = "client!d", name = "aa", descriptor = "(Lw;IIIIZ)V")
    public abstract void method152(class451 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!d", name = "sa", descriptor = "(II)I")
    public abstract int method159(int arg0, int arg1);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method162(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lw;IIIIZ)Z")
    public abstract boolean method156(class451 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!d", name = "BA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method153(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II)V")
    public abstract void method155(int arg0, int arg1);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lhj;[I)V")
    public abstract void method160(class329 arg0, int[] arg1);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method157(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!d", name = "EA", descriptor = "(III)V")
    public abstract void method154(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!d", name = "JA", descriptor = "(II)I")
    public abstract int method150(int arg0, int arg1);

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(IILw;)Lw;")
    public abstract class451 method147(int arg0, int arg1, class451 arg2);

    @OriginalMember(owner = "client!d", name = "FA", descriptor = "(Lw;IIIIZ)V")
    public abstract void method158(class451 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(III[[ZZ)V")
    public abstract void method149(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4);
}
