import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class91 {

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "I")
    public int field1314 = -1;

    @OriginalMember(owner = "client!vr", name = "m", descriptor = "I")
    public int field1325 = -1;

    @OriginalMember(owner = "client!vr", name = "n", descriptor = "I")
    public int field1326 = -1;

    @OriginalMember(owner = "client!vr", name = "t", descriptor = "I")
    public int field1332 = 5;

    @OriginalMember(owner = "client!vr", name = "l", descriptor = "I")
    public int field1324 = -1;

    @OriginalMember(owner = "client!vr", name = "x", descriptor = "Z")
    public boolean field1336 = false;

    @OriginalMember(owner = "client!vr", name = "v", descriptor = "I")
    public int field1334 = -1;

    @OriginalMember(owner = "client!vr", name = "B", descriptor = "I")
    public int field1340 = 2;

    @OriginalMember(owner = "client!vr", name = "A", descriptor = "Z")
    public boolean field1339 = false;

    @OriginalMember(owner = "client!vr", name = "o", descriptor = "Z")
    public boolean field1327 = false;

    @OriginalMember(owner = "client!vr", name = "C", descriptor = "I")
    public int field1341 = 0;

    @OriginalMember(owner = "client!vr", name = "F", descriptor = "I")
    public int field1344 = 99;

    @OriginalMember(owner = "client!vr", name = "e", descriptor = "I")
    public static int field1317 = 0;

    @OriginalMember(owner = "client!vr", name = "p", descriptor = "I")
    public static int field1328 = 52;

    @OriginalMember(owner = "client!vr", name = "d", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!vr", name = "f", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!vr", name = "h", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!vr", name = "i", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!vr", name = "j", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!vr", name = "k", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!vr", name = "q", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!vr", name = "r", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!vr", name = "s", descriptor = "I")
    public int field1331;

    @OriginalMember(owner = "client!vr", name = "D", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!vr", name = "G", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!vr", name = "H", descriptor = "I")
    public static int field1346;

    @OriginalMember(owner = "client!vr", name = "w", descriptor = "Laa;")
    public static class341 field1335;

    @OriginalMember(owner = "client!vr", name = "g", descriptor = "Ldq;")
    public static class500 field1319;

    @OriginalMember(owner = "client!vr", name = "u", descriptor = "Leg;")
    public class70 field1333;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "[I")
    public int[] field1313;

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "[I")
    public int[] field1315;

    @OriginalMember(owner = "client!vr", name = "y", descriptor = "[I")
    private int[] field1337;

    @OriginalMember(owner = "client!vr", name = "E", descriptor = "[Z")
    public boolean[] field1343;

    @OriginalMember(owner = "client!vr", name = "z", descriptor = "[[I")
    public int[][] field1338;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lkw;Lsn;)V", line = 4)
    public static final void method609(class166 arg0, class452 arg1) {
        if (!arg1.field6806) {
            return;
        }
        short var2 = arg1.field6805;
        short var3 = arg1.field6816;
        byte var4 = arg1.field6811;
        byte var5 = arg1.field6810;
        int var6 = (var2 << class10.field179) + class251.field3501;
        int var7 = (var3 << class10.field179) + class251.field3501;
        class452[][] var8 = class443.field6672[var4];
        float var9;
        if (class71.field988 == class306.field4447) {
            class516.field7574.method754(class414.field6317[0].method218(var6, var7), class62.method441(var2, var3), class263.method1699(var2, var3), class510.method3053(var2, var3));
            var9 = 251.5F;
        } else {
            var9 = 201.5F - (float) (var5 + 1) * 50.0F;
        }
        class516.field7574.method748(3000.0F, var9 * 1.5F);
        if (arg1.field6800) {
            if (class160.field2089) {
                if (var4 > 0) {
                    class452 var10 = class443.field6672[var4 - 1][var2][var3];
                    if (var10 != null && var10.field6806) {
                        return;
                    }
                }
                if (var2 <= class187.field2514 && var2 > class199.field2654) {
                    class452 var11 = var8[var2 - 1][var3];
                    if (var11 != null && var11.field6806 && (var11.field6800 || (arg1.field6798 & 0x1) == 0)) {
                        return;
                    }
                }
                if (var2 >= class187.field2514 && var2 < class522.field7681 - 1) {
                    class452 var12 = var8[var2 + 1][var3];
                    if (var12 != null && var12.field6806 && (var12.field6800 || (arg1.field6798 & 0x4) == 0)) {
                        return;
                    }
                }
                if (var3 <= class25.field358 && var3 > class380.field5794) {
                    class452 var13 = var8[var2][var3 - 1];
                    if (var13 != null && var13.field6806 && (var13.field6800 || (arg1.field6798 & 0x8) == 0)) {
                        return;
                    }
                }
                if (var3 >= class25.field358 && var3 < class207.field2821 - 1) {
                    class452 var14 = var8[var2][var3 + 1];
                    if (var14 != null && var14.field6806 && (var14.field6800 || (arg1.field6798 & 0x2) == 0)) {
                        return;
                    }
                }
            } else {
                class160.field2089 = true;
            }
            arg1.field6800 = false;
            if (arg1.field6795 != null) {
                class452 var15 = arg1.field6795;
                class516.field7574.method748(3000.0F, (201.5F - (float) (var15.field6810 + 1) * 50.0F) * 1.5F);
                if (!class286.method1840(var15.field6810, var2, var3)) {
                    class306.field4447[var15.field6810].method210(var2, var3);
                }
                class535 var16 = var15.field6812;
                if (var16 != null) {
                    if (class467.field6990) {
                        if ((var16.field7854 & arg1.field6807) == 0) {
                            class230.method1546(arg0, var4, var2, var3);
                        } else {
                            class437.method2654(arg0, var16.field7854, var5, var2, var3);
                        }
                        class516.field7574.method849(arg0.field2247, arg0.field2245);
                    }
                    var16.method136(0, class516.field7574);
                }
                for (class384 var17 = var15.field6814; var17 != null; var17 = var17.field5834) {
                    class140 var18 = var17.field5832;
                    if (var18 != null) {
                        if (class467.field6990) {
                            class230.method1546(arg0, var4, var2, var3);
                            class516.field7574.method849(arg0.field2247, arg0.field2245);
                        }
                        var18.method136(0, class516.field7574);
                    }
                }
                class516.field7574.method748(3000.0F, var9 * 1.5F);
            }
            boolean var19 = !class286.method1840(var5, var2, var3);
            if (var19) {
                class306.field4447[var5].method210(var2, var3);
                class394 var20 = arg1.field6801;
                if (var20 != null && var20.field6020) {
                    if (var20.field6018) {
                        class516.field7574.method748(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class467.field6990) {
                        class230.method1546(arg0, var4, var2, var3);
                        class516.field7574.method849(arg0.field2247, arg0.field2245);
                    }
                    class437 var21 = var20.method136(0, class516.field7574);
                    if (var21 != null) {
                        var21.field6610 = var20;
                        var21.field6613 = var4;
                        var21.field6609 = var2;
                        var21.field6612 = var3;
                        class36.field526.method3045(var21, 73);
                    }
                    if (var20.field6018) {
                        class516.field7574.method748(3000.0F, var9 * 1.5F);
                    }
                }
            }
            int var22 = 0;
            int var23 = 0;
            class535 var24 = arg1.field6812;
            class222 var25 = arg1.field6809;
            if (var24 != null || var25 != null) {
                if (class187.field2514 == var2) {
                    var22++;
                } else if (class187.field2514 < var2) {
                    var22 += 2;
                }
                if (class25.field358 == var3) {
                    var22 += 3;
                } else if (class25.field358 > var3) {
                    var22 += 6;
                }
                var23 = class336.field5213[var22];
                arg1.field6807 = class331.field5166[var22];
            }
            if (var24 != null) {
                if ((var24.field7854 & class325.field4711[var22]) == 0) {
                    arg1.field6802 = 0;
                } else if (var24.field7854 == 16) {
                    arg1.field6802 = 3;
                    arg1.field6803 = class364.field5593[var22];
                    arg1.field6793 = (byte) (3 - arg1.field6803);
                } else if (var24.field7854 == 32) {
                    arg1.field6802 = 6;
                    arg1.field6803 = class454.field6838[var22];
                    arg1.field6793 = (byte) (6 - arg1.field6803);
                } else if (var24.field7854 == 64) {
                    arg1.field6802 = 12;
                    arg1.field6803 = class114.field1587[var22];
                    arg1.field6793 = (byte) (12 - arg1.field6803);
                } else {
                    arg1.field6802 = 9;
                    arg1.field6803 = class76.field1111[var22];
                    arg1.field6793 = (byte) (9 - arg1.field6803);
                }
                if ((var24.field7854 & var23) != 0 && !class336.method2176(var5, var2, var3, var24.field7854)) {
                    if (class467.field6990) {
                        class230.method1546(arg0, var4, var2, var3);
                        class516.field7574.method849(arg0.field2247, arg0.field2245);
                    }
                    class437 var26 = var24.method136(0, class516.field7574);
                    if (var26 != null) {
                        var26.field6610 = var24;
                        var26.field6613 = var4;
                        var26.field6609 = var2;
                        var26.field6612 = var3;
                        class36.field526.method3045(var26, 25);
                    }
                }
                class535 var27 = arg1.field6797;
                if (var27 != null && (var27.field7854 & var23) != 0 && !class336.method2176(var5, var2, var3, var27.field7854)) {
                    if (class467.field6990) {
                        class230.method1546(arg0, var4, var2, var3);
                        class516.field7574.method849(arg0.field2247, arg0.field2245);
                    }
                    class437 var28 = var27.method136(0, class516.field7574);
                    if (var28 != null) {
                        var28.field6610 = var27;
                        var28.field6613 = var4;
                        var28.field6609 = var2;
                        var28.field6612 = var3;
                        class36.field526.method3045(var28, 25);
                    }
                }
            }
            if (var25 != null && !class316.method1984(var5, var2, var3, var25.method1497(63))) {
                class222 var29 = arg1.field6815;
                class516.field7574.method748(3000.0F, (var9 - 0.5F) * 1.5F);
                if ((var25.field3090 & var23) != 0) {
                    if (class467.field6990) {
                        class230.method1546(arg0, var4, var2, var3);
                        class516.field7574.method849(arg0.field2247, arg0.field2245);
                    }
                    class437 var30 = var25.method136(0, class516.field7574);
                    if (var30 != null) {
                        var30.field6610 = var25;
                        var30.field6613 = var4;
                        var30.field6609 = var2;
                        var30.field6612 = var3;
                        class36.field526.method3045(var30, 93);
                    }
                } else if (var25.field3090 == 256) {
                    int var31 = var25.field3087 - class453.field6827;
                    int var32 = var25.field3091 - class46.field662;
                    int var33 = var25.field3093;
                    int var34;
                    if (var33 == 1 || var33 == 2) {
                        var34 = -var31;
                    } else {
                        var34 = var31;
                    }
                    int var35;
                    if (var33 == 2 || var33 == 3) {
                        var35 = -var32;
                    } else {
                        var35 = var32;
                    }
                    if (class467.field6990) {
                        class230.method1546(arg0, var4, var2, var3);
                        class516.field7574.method849(arg0.field2247, arg0.field2245);
                    }
                    if (var35 < var34) {
                        class437 var36 = var25.method136(0, class516.field7574);
                        if (var36 != null) {
                            var36.field6610 = var25;
                            var36.field6613 = var4;
                            var36.field6609 = var2;
                            var36.field6612 = var3;
                            class36.field526.method3045(var36, 25);
                        }
                    } else if (var29 != null) {
                        class437 var37 = var29.method136(0, class516.field7574);
                        if (var37 != null) {
                            var37.field6610 = var29;
                            var37.field6613 = var4;
                            var37.field6609 = var2;
                            var37.field6612 = var3;
                            class36.field526.method3045(var37, 50);
                        }
                    }
                }
                class516.field7574.method748(3000.0F, var9 * 1.5F);
            }
            if (var19) {
                class394 var38 = arg1.field6801;
                if (var38 != null && !var38.field6020) {
                    if (var38.field6018) {
                        class516.field7574.method748(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class467.field6990) {
                        class230.method1546(arg0, var4, var2, var3);
                        class516.field7574.method849(arg0.field2247, arg0.field2245);
                    }
                    class437 var39 = var38.method136(0, class516.field7574);
                    if (var39 != null) {
                        var39.field6610 = var38;
                        var39.field6613 = var4;
                        var39.field6609 = var2;
                        var39.field6612 = var3;
                        class36.field526.method3045(var39, 18);
                    }
                    if (var38.field6018) {
                        class516.field7574.method748(3000.0F, var9 * 1.5F);
                    }
                }
                class113 var40 = arg1.field6796;
                if (var40 != null && !var40.field1578) {
                    if (class467.field6990) {
                        class230.method1546(arg0, var4, var2, var3);
                        class516.field7574.method849(arg0.field2247, arg0.field2245);
                    }
                    class437 var41 = var40.method136(0, class516.field7574);
                    if (var41 != null) {
                        var41.field6610 = var40;
                        var41.field6613 = var4;
                        var41.field6609 = var2;
                        var41.field6612 = var3;
                        class36.field526.method3045(var41, 125);
                    }
                }
            }
            byte var42 = arg1.field6798;
            if (var42 != 0) {
                if (var2 < class187.field2514 && (var42 & 0x4) != 0) {
                    class452 var43 = var8[var2 + 1][var3];
                    if (var43 != null && var43.field6806) {
                        class463.field6923.method414(var43, -1);
                    }
                }
                if (var3 < class25.field358 && (var42 & 0x2) != 0) {
                    class452 var44 = var8[var2][var3 + 1];
                    if (var44 != null && var44.field6806) {
                        class463.field6923.method414(var44, -1);
                    }
                }
                if (var2 > class187.field2514 && (var42 & 0x1) != 0) {
                    class452 var45 = var8[var2 - 1][var3];
                    if (var45 != null && var45.field6806) {
                        class463.field6923.method414(var45, -1);
                    }
                }
                if (var3 > class25.field358 && (var42 & 0x8) != 0) {
                    class452 var46 = var8[var2][var3 - 1];
                    if (var46 != null && var46.field6806) {
                        class463.field6923.method414(var46, -1);
                    }
                }
            }
        }
        if (arg1.field6802 != 0) {
            boolean var47 = true;
            for (class384 var48 = arg1.field6814; var48 != null; var48 = var48.field5834) {
                if (class121.field1654 != var48.field5832.field1858 && (var48.field5833 & arg1.field6802) == arg1.field6803) {
                    var47 = false;
                    break;
                }
            }
            if (var47) {
                class535 var49 = arg1.field6812;
                if (!class336.method2176(var5, var2, var3, var49.field7854)) {
                    if (class467.field6990) {
                        label682: {
                            if (var49.field7854 >= 16) {
                                int var50 = var2 - class187.field2514;
                                int var51 = var3 - class25.field358;
                                if (var49.field7854 == 16) {
                                    int var52 = var50 - class251.field3501;
                                    int var53 = class251.field3501 + var51;
                                    if (var53 < var52 && var2 > 0 && var3 <= class475.field7051) {
                                        class230.method1546(arg0, var4, var2 - 1, var3 + 1);
                                        break label682;
                                    }
                                } else if (var49.field7854 == 32) {
                                    int var54 = class251.field3501 + var50;
                                    int var55 = class251.field3501 + var51;
                                    if (var55 < -var54 && var2 < class533.field7842 && var3 < class475.field7051) {
                                        class230.method1546(arg0, var4, var2 + 1, var3 + 1);
                                        break label682;
                                    }
                                } else if (var49.field7854 == 64) {
                                    int var56 = class251.field3501 + var50;
                                    int var57 = var51 - class251.field3501;
                                    if (var57 > var56 && var2 < class533.field7842 && var3 > 0) {
                                        class230.method1546(arg0, var4, var2 + 1, var3 - 1);
                                        break label682;
                                    }
                                } else if (var49.field7854 == 128) {
                                    int var58 = var50 - class251.field3501;
                                    int var59 = var51 - class251.field3501;
                                    if (var59 > -var58 && var2 > 0 && var3 > 0) {
                                        class230.method1546(arg0, var4, var2 - 1, var3 - 1);
                                        break label682;
                                    }
                                }
                            }
                            class230.method1546(arg0, var4, var2, var3);
                        }
                        class516.field7574.method849(arg0.field2247, arg0.field2245);
                    }
                    class437 var60 = var49.method136(0, class516.field7574);
                    if (var60 != null) {
                        var60.field6610 = var49;
                        var60.field6613 = var4;
                        var60.field6609 = var2;
                        var60.field6612 = var3;
                        class36.field526.method3045(var60, 111);
                    }
                }
                arg1.field6802 = 0;
            }
        }
        if (arg1.field6804) {
            try {
                arg1.field6804 = false;
                int var61 = 0;
                label625: for (class384 var62 = arg1.field6814; var62 != null; var62 = var62.field5834) {
                    class140 var63 = var62.field5832;
                    if (class121.field1654 != var63.field1858) {
                        for (int var64 = var63.field1868; var64 <= var63.field1871; var64++) {
                            for (int var65 = var63.field1863; var65 <= var63.field1874; var65++) {
                                class452 var66 = var8[var64][var65];
                                if (var66.field6800) {
                                    arg1.field6804 = true;
                                    continue label625;
                                }
                                if (var66.field6802 != 0) {
                                    int var67 = 0;
                                    if (var64 > var63.field1868) {
                                        var67++;
                                    }
                                    if (var64 < var63.field1871) {
                                        var67 += 4;
                                    }
                                    if (var65 > var63.field1863) {
                                        var67 += 8;
                                    }
                                    if (var65 < var63.field1874) {
                                        var67 += 2;
                                    }
                                    if ((var67 & var66.field6802) == arg1.field6793) {
                                        arg1.field6804 = true;
                                        continue label625;
                                    }
                                }
                            }
                        }
                        int var68 = class187.field2514 - var63.field1868;
                        int var69 = var63.field1871 - class187.field2514;
                        if (var69 > var68) {
                            var68 = var69;
                        }
                        int var70 = class25.field358 - var63.field1863;
                        int var71 = var63.field1874 - class25.field358;
                        if (var71 > var70) {
                            var70 = var71;
                        }
                        arg0.field2244[var61] = var63;
                        arg0.field2249[var61++] = var68 + var70;
                    }
                }
                while (var61 > 0) {
                    int var72 = -50;
                    int var73 = -1;
                    for (int var74 = 0; var74 < var61; var74++) {
                        class140 var75 = arg0.field2244[var74];
                        if (class121.field1654 != var75.field1858) {
                            int var76 = arg0.field2249[var74];
                            if (var76 > var72) {
                                var72 = var76;
                                var73 = var74;
                            } else if (var72 == var76) {
                                int var77 = var75.field1867 - class453.field6827;
                                int var78 = var75.field1862 - class46.field662;
                                int var79 = arg0.field2244[var73].field1867 - class453.field6827;
                                int var80 = arg0.field2244[var73].field1862 - class46.field662;
                                if (var77 * var77 + var78 * var78 > var79 * var79 + var80 * var80) {
                                    var73 = var74;
                                }
                            }
                        }
                    }
                    if (var73 == -1) {
                        break;
                    }
                    class140 var81 = arg0.field2244[var73];
                    var81.field1858 = class121.field1654;
                    if (!class355.method2281(var5, var81.field1868, var81.field1871, var81.field1863, var81.field1874, var81.method174((byte) -127))) {
                        if (class467.field6990) {
                            if (var81.field1860 == 0) {
                                class522.method3102(arg0, var4, var81.field1868, var81.field1863, var81.field1871, var81.field1874);
                            } else {
                                class230.method1546(arg0, var4, var2, var3);
                                int var82 = var2 - class187.field2514;
                                int var83 = var3 - class25.field358;
                                if (var81.field1860 == 2) {
                                    if (var83 > -var82) {
                                        class523.method3107(arg0, var4, var2, var3 - 1, var2 - 1, var3);
                                    } else {
                                        class523.method3107(arg0, var4, var2, var3 + 1, var2 + 1, var3);
                                    }
                                } else if (var83 > var82) {
                                    class523.method3107(arg0, var4, var2, var3 - 1, var2 + 1, var3);
                                } else {
                                    class523.method3107(arg0, var4, var2, var3 + 1, var2 - 1, var3);
                                }
                            }
                            class516.field7574.method849(arg0.field2247, arg0.field2245);
                        }
                        class437 var84 = var81.method136(0, class516.field7574);
                        if (var84 != null) {
                            var84.field6610 = var81;
                            var84.field6613 = var4;
                            var84.field6609 = var81.field1868;
                            var84.field6612 = var81.field1863;
                            class36.field526.method3045(var84, 91);
                        }
                    }
                    for (int var85 = var81.field1868; var85 <= var81.field1871; var85++) {
                        for (int var86 = var81.field1863; var86 <= var81.field1874; var86++) {
                            class452 var87 = var8[var85][var86];
                            if (var87.field6802 != 0) {
                                class463.field6923.method414(var87, -1);
                            } else if ((var2 != var85 || var3 != var86) && var87.field6806) {
                                class463.field6923.method414(var87, -1);
                            }
                        }
                    }
                }
                if (arg1.field6804) {
                    return;
                }
            } catch (Exception var122) {
                arg1.field6804 = false;
            }
        }
        if (arg1.field6792 != null && (byte) (class249.field3472 & 0xFF) == arg1.field6808) {
            class137 var88 = arg1.field6792;
            int var89 = class306.field4447[var4].method222(var2, var3);
            int var90;
            if (var4 < class141.field1892 - 1) {
                var90 = class306.field4447[var4].method222(var2, var3) - class306.field4447[var4 + 1].method222(var2, var3);
            } else {
                var90 = 0x8 << class10.field179;
            }
            class362.field5577.method142(var6, var89, var7, arg0.field2246);
            int var91 = arg0.field2246[2];
            class362.field5577.method142(var6, var89 - var90, var7, arg0.field2246);
            int var92 = arg0.field2246[2];
            int var93 = var91;
            int var94 = var92;
            if (var91 > var92) {
                var93 = var92;
                var94 = var91;
            }
            int var95 = var93 - class448.field6749;
            int var96 = class448.field6749 + var94;
            var88.field1833 = var95;
            var88.field1830 = var96;
            var88.field1829 = true;
            class516.field7574.method798(var88);
        }
        if (!arg1.field6806) {
            return;
        }
        if (arg1.field6802 != 0) {
            return;
        }
        if (var2 <= class187.field2514 && var2 > class199.field2654) {
            class452 var97 = var8[var2 - 1][var3];
            if (var97 != null && var97.field6806) {
                return;
            }
        }
        if (var2 >= class187.field2514 && var2 < class522.field7681 - 1) {
            class452 var98 = var8[var2 + 1][var3];
            if (var98 != null && var98.field6806) {
                return;
            }
        }
        if (var3 <= class25.field358 && var3 > class380.field5794) {
            class452 var99 = var8[var2][var3 - 1];
            if (var99 != null && var99.field6806) {
                return;
            }
        }
        if (var3 >= class25.field358 && var3 < class207.field2821 - 1) {
            class452 var100 = var8[var2][var3 + 1];
            if (var100 != null && var100.field6806) {
                return;
            }
        }
        arg1.field6806 = false;
        class520.field7656--;
        class113 var101 = arg1.field6796;
        if (var101 != null && var101.field1578) {
            if (class467.field6990) {
                class230.method1546(arg0, var4, var2, var3);
                class516.field7574.method849(arg0.field2247, arg0.field2245);
            }
            class437 var102 = var101.method136(0, class516.field7574);
            if (var102 != null) {
                var102.field6610 = var101;
                var102.field6613 = var4;
                var102.field6609 = var2;
                var102.field6612 = var3;
                class36.field526.method3045(var102, 91);
            }
        }
        if (arg1.field6807 != 0) {
            class222 var103 = arg1.field6809;
            if (var103 != null && !class316.method1984(var5, var2, var3, var103.method1497(82))) {
                if ((var103.field3090 & arg1.field6807) != 0) {
                    if (class467.field6990) {
                        class230.method1546(arg0, var4, var2, var3);
                        class516.field7574.method849(arg0.field2247, arg0.field2245);
                    }
                    class437 var104 = var103.method136(0, class516.field7574);
                    if (var104 != null) {
                        var104.field6610 = var103;
                        var104.field6613 = var4;
                        var104.field6609 = var2;
                        var104.field6612 = var3;
                        class36.field526.method3045(var104, 102);
                    }
                } else if (var103.field3090 == 256) {
                    int var105 = var103.field3087 - class453.field6827;
                    int var106 = var103.field3091 - class46.field662;
                    int var107 = var103.field3093;
                    int var108;
                    if (var107 == 1 || var107 == 2) {
                        var108 = -var105;
                    } else {
                        var108 = var105;
                    }
                    int var109;
                    if (var107 == 2 || var107 == 3) {
                        var109 = -var106;
                    } else {
                        var109 = var106;
                    }
                    if (class467.field6990) {
                        class230.method1546(arg0, var4, var2, var3);
                        class516.field7574.method849(arg0.field2247, arg0.field2245);
                    }
                    class222 var110 = arg1.field6815;
                    if (var109 > var108) {
                        class437 var111 = var103.method136(0, class516.field7574);
                        if (var111 != null) {
                            var111.field6610 = var103;
                            var111.field6613 = var4;
                            var111.field6609 = var2;
                            var111.field6612 = var3;
                            class36.field526.method3045(var111, 53);
                        }
                    } else if (var110 != null) {
                        class437 var112 = var110.method136(0, class516.field7574);
                        if (var112 != null) {
                            var112.field6610 = var110;
                            var112.field6613 = var4;
                            var112.field6609 = var2;
                            var112.field6612 = var3;
                            class36.field526.method3045(var112, 75);
                        }
                    }
                }
            }
            class535 var113 = arg1.field6812;
            class535 var114 = arg1.field6797;
            if (var114 != null && (var114.field7854 & arg1.field6807) != 0 && !class336.method2176(var5, var2, var3, var114.field7854)) {
                if (class467.field6990) {
                    class437.method2654(arg0, var114.field7854, var4, var2, var3);
                    class516.field7574.method849(arg0.field2247, arg0.field2245);
                }
                class437 var115 = var114.method136(0, class516.field7574);
                if (var115 != null) {
                    var115.field6610 = var114;
                    var115.field6613 = var4;
                    var115.field6609 = var2;
                    var115.field6612 = var3;
                    class36.field526.method3045(var115, 108);
                }
            }
            if (var113 != null && (var113.field7854 & arg1.field6807) != 0 && !class336.method2176(var5, var2, var3, var113.field7854)) {
                if (class467.field6990) {
                    class437.method2654(arg0, var113.field7854, var4, var2, var3);
                    class516.field7574.method849(arg0.field2247, arg0.field2245);
                }
                class437 var116 = var113.method136(0, class516.field7574);
                if (var116 != null) {
                    var116.field6610 = var113;
                    var116.field6613 = var4;
                    var116.field6609 = var2;
                    var116.field6612 = var3;
                    class36.field526.method3045(var116, 88);
                }
            }
        }
        if (var4 < class141.field1892 - 1) {
            class452 var117 = class443.field6672[var4 + 1][var2][var3];
            if (var117 != null && var117.field6806) {
                class463.field6923.method420(true, var117);
            }
        }
        if (var2 < class187.field2514) {
            class452 var118 = var8[var2 + 1][var3];
            if (var118 != null && var118.field6806) {
                class463.field6923.method414(var118, -1);
            }
        }
        if (var3 < class25.field358) {
            class452 var119 = var8[var2][var3 + 1];
            if (var119 != null && var119.field6806) {
                class463.field6923.method414(var119, -1);
            }
        }
        if (var2 > class187.field2514) {
            class452 var120 = var8[var2 - 1][var3];
            if (var120 != null && var120.field6806) {
                class463.field6923.method414(var120, -1);
            }
        }
        if (var3 > class25.field358) {
            class452 var121 = var8[var2][var3 - 1];
            if (var121 != null && var121.field6806) {
                class463.field6923.method414(var121, -1);
            }
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(ZLqw;)I", line = 1123)
    public static final int method610(boolean arg0, class54 arg1) {
        field1345++;
        String var2 = class400.method2476(arg1, 32);
        int[] var3 = null;
        if (class362.method2307(arg1.field764, 22116)) {
            var3 = class103.field1489.method1603((byte) -99, (int) arg1.field758).field1036;
        } else if (arg1.field753 != -1) {
            var3 = class103.field1489.method1603((byte) -99, arg1.field753).field1036;
        } else if (class296.method1894(arg1.field764, 127)) {
            class24 var4 = (class24) class406.field6158.method1747((long) ((int) arg1.field758), false);
            if (var4 != null) {
                class17 var5 = var4.field348;
                class258 var6 = var5.field274;
                if (var6.field3627 != null) {
                    var6 = var6.method1660(class288.field4208, (byte) 74);
                }
                if (var6 != null) {
                    var3 = var6.field3632;
                }
            }
        } else if (class270.method1737((byte) -36, arg1.field764)) {
            Object var7 = null;
            class209 var8;
            if (arg1.field764 == 1007) {
                var8 = class432.field6575.method1872((int) arg1.field758, false);
            } else {
                var8 = class432.field6575.method1872((int) (arg1.field758 >>> 32 & 0x7FFFFFFFL), !arg0);
            }
            if (var8.field2934 != null) {
                var8 = var8.method1435(-1, class288.field4208);
            }
            if (var8 != null) {
                var3 = var8.field2931;
            }
        }
        if (var3 != null) {
            var2 = var2 + class200.method1359(var3, (byte) 116);
        }
        int var9 = class175.field2338.method560(class311.field4548, var2, -1);
        if (arg1.field755) {
            var9 += class507.field7463.method296() + 4;
        }
        return arg0 ? var9 : 7;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(II)Ljava/lang/String;", line = 1198)
    public static final String method611(int arg0, int arg1) {
        field1346++;
        if (arg0 <= 0) {
            method611(-13, -105);
        }
        return (arg1 >> 24 & 0xFF) + "." + (arg1 >> 16 & 0xFF) + "." + (arg1 >> 8 & 0xFF) + "." + (arg1 & 0xFF);
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILdq;Ljava/awt/Frame;)V", line = 1243)
    public static final void method612(int arg0, class500 arg1, Frame arg2) {
        field1321++;
        if (arg0 != 0) {
            method610(false, null);
        }
        while (true) {
            class234 var3 = arg1.method2992(arg2, arg0 + 120);
            while (var3.field3322 == 0) {
                class388.method2433(10L, 73);
            }
            if (var3.field3322 == 1) {
                arg2.setVisible(false);
                arg2.dispose();
                return;
            }
            class388.method2433(100L, -116);
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(B)V", line = 1268)
    public static void method613(byte arg0) {
        field1335 = null;
        field1319 = null;
        if (arg0 > -60) {
            field1320 = 36;
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(I)V", line = 1279)
    public final void method614(int arg0) {
        if (this.field1314 == -1) {
            if (this.field1343 == null) {
                this.field1314 = 0;
            } else {
                this.field1314 = 2;
            }
        }
        field1330++;
        if (arg0 != 2) {
            this.method614(75);
        }
        if (this.field1334 != -1) {
            return;
        }
        if (this.field1343 == null) {
            this.field1334 = 0;
        } else {
            this.field1334 = 2;
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IILnj;)V", line = 1310)
    private final void method615(int arg0, int arg1, class164 arg2) {
        field1322++;
        if (arg1 <= 26) {
            return;
        }
        if (arg0 == 1) {
            int var4 = arg2.method1074(-635989152);
            this.field1313 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1313[var5] = arg2.method1074(-635989152);
            }
            this.field1315 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field1315[var6] = arg2.method1074(-635989152);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field1315[var7] += arg2.method1074(-635989152) << 16;
            }
        } else if (arg0 == 2) {
            this.field1325 = arg2.method1074(-635989152);
        } else if (arg0 == 3) {
            this.field1343 = new boolean[256];
            int var8 = arg2.method1087(false);
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1343[arg2.method1087(false)] = true;
            }
        } else if (arg0 == 5) {
            this.field1332 = arg2.method1087(false);
        } else if (arg0 == 6) {
            this.field1326 = arg2.method1074(-635989152);
        } else if (arg0 == 7) {
            this.field1324 = arg2.method1074(-635989152);
        } else if (arg0 == 8) {
            this.field1344 = arg2.method1087(false);
        } else if (arg0 == 9) {
            this.field1334 = arg2.method1087(false);
        } else if (arg0 == 10) {
            this.field1314 = arg2.method1087(false);
        } else if (arg0 == 11) {
            this.field1340 = arg2.method1087(false);
        } else if (arg0 == 12) {
            int var14 = arg2.method1087(false);
            this.field1337 = new int[var14];
            for (int var15 = 0; var15 < var14; var15++) {
                this.field1337[var15] = arg2.method1074(-635989152);
            }
            for (int var16 = 0; var16 < var14; var16++) {
                this.field1337[var16] = (arg2.method1074(-635989152) << 16) + this.field1337[var16];
            }
        } else if (arg0 == 13) {
            int var10 = arg2.method1074(-635989152);
            this.field1338 = new int[var10][];
            for (int var11 = 0; var11 < var10; var11++) {
                int var12 = arg2.method1087(false);
                if (var12 > 0) {
                    this.field1338[var11] = new int[var12];
                    this.field1338[var11][0] = arg2.method1090(-1);
                    for (int var13 = 1; var13 < var12; var13++) {
                        this.field1338[var11][var13] = arg2.method1074(-635989152);
                    }
                }
            }
            return;
        } else if (arg0 == 14) {
            this.field1336 = true;
            return;
        } else if (arg0 == 15) {
            this.field1339 = true;
            return;
        } else if (arg0 == 16) {
            this.field1327 = true;
            return;
        } else if (arg0 == 17) {
            this.field1341 = arg2.method1087(false);
            return;
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lnj;I)V", line = 1491)
    public final void method616(class164 arg0, int arg1) {
        if (arg1 < 118) {
            return;
        }
        while (true) {
            int var3 = arg0.method1087(false);
            if (var3 == 0) {
                field1318++;
                return;
            }
            this.method615(var3, 33, arg0);
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIBIILka;II)Lka;", line = 1514)
    public final class334 method617(int arg0, int arg1, byte arg2, int arg3, int arg4, class334 arg5, int arg6, int arg7) {
        field1329++;
        int var9 = this.field1313[arg3];
        int var10 = this.field1315[arg3];
        class425 var11 = this.field1333.method485(var10 >> 16, 5);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg5.method47(arg2, arg7, true);
        }
        class425 var13 = null;
        if ((this.field1339 || class275.field3867) && arg1 != -1 && this.field1315.length > arg1) {
            int var14 = this.field1315[arg1];
            var13 = this.field1333.method485(var14 >> 16, 5);
            arg1 = var14 & 0xFFFF;
        }
        if (this.field1336) {
            arg7 |= 0x200;
        }
        if (var11.method2591(arg4 - 1123829982, var12)) {
            arg7 |= 0x80;
        }
        if (var11.method2597(12010, var12)) {
            arg7 |= 0x100;
        }
        if (var11.method2594(17729, var12)) {
            arg7 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method2591(-1123836575, arg1)) {
                arg7 |= 0x80;
            }
            if (var13.method2597(12010, arg1)) {
                arg7 |= 0x100;
            }
            if (var13.method2594(arg4 + 24322, arg1)) {
                arg7 |= 0x400;
            }
        }
        int var15 = arg7 | 0x20;
        class334 var16 = arg5.method47(arg2, var15, true);
        if (arg4 != -6593) {
            this.field1326 = -15;
        }
        var16.method2161(this.field1336, var13, arg1, var11, var9, var12, arg0 - 1, arg6, (byte) -79);
        return var16;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IZIB)I", line = 1590)
    public final int method618(int arg0, boolean arg1, int arg2, byte arg3) {
        field1342++;
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field1315[arg2];
        class425 var8 = null;
        class425 var9 = this.field1333.method485(var7 >> 16, 5);
        int var10 = -118 / ((8 - arg3) / 35);
        int var11 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field1339 || class275.field3867) && arg0 != -1 && this.field1315.length > arg0) {
            int var12 = this.field1315[arg0];
            var8 = this.field1333.method485(var12 >> 16, 5);
            var6 = var12 & 0xFFFF;
        }
        if (this.field1336) {
            var5 |= 0x200;
        }
        if (var9.method2591(-1123836575, var11)) {
            var5 |= 0x80;
        }
        if (var9.method2597(12010, var11)) {
            var5 |= 0x100;
        }
        if (var9.method2594(17729, var11)) {
            var5 |= 0x400;
        }
        if (var8 != null) {
            if (var8.method2591(-1123836575, var6)) {
                var5 |= 0x80;
            }
            if (var8.method2597(12010, var6)) {
                var5 |= 0x100;
            }
            if (var8.method2594(17729, var6)) {
                var5 |= 0x400;
            }
        }
        if (this.field1337 != null && arg1) {
            if (this.field1337.length > arg2) {
                int var13 = this.field1337[arg2];
                if (var13 != 65535) {
                    class425 var14 = this.field1333.method485(var13 >> 16, 5);
                    int var15 = var13 & 0xFFFF;
                    if (var14 != null) {
                        if (var14.method2591(-1123836575, var15)) {
                            var5 |= 0x80;
                        }
                        if (var14.method2597(12010, var15)) {
                            var5 |= 0x100;
                        }
                        if (var14.method2594(17729, var15)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field1339 || class275.field3867) && arg0 != -1 && arg0 < this.field1337.length) {
                int var16 = this.field1337[arg0];
                if (var16 != 65535) {
                    class425 var17 = this.field1333.method485(var16 >> 16, 5);
                    int var18 = var16 & 0xFFFF;
                    if (var17 != null) {
                        if (var17.method2591(-1123836575, var18)) {
                            var5 |= 0x80;
                        }
                        if (var17.method2597(12010, var18)) {
                            var5 |= 0x100;
                        }
                        if (var17.method2594(17729, var18)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lka;IIIII)Lka;", line = 1714)
    public final class334 method619(class334 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1316++;
        int var7 = this.field1313[arg4];
        int var8 = this.field1315[arg4];
        class425 var9 = this.field1333.method485(var8 >> 16, 5);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg0.method47((byte) 1, arg5, true);
        }
        class425 var11 = null;
        if ((this.field1339 || class275.field3867) && arg2 != -1 && this.field1315.length > arg2) {
            int var12 = this.field1315[arg2];
            var11 = this.field1333.method485(var12 >> 16, arg1 ^ 0xFFFFA096);
            arg2 = var12 & 0xFFFF;
        }
        class425 var13 = null;
        class425 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field1337 != null) {
            if (arg4 < this.field1337.length) {
                var15 = this.field1337[arg4];
                if (var15 != 65535) {
                    var13 = this.field1333.method485(var15 >> 16, arg1 ^ 0xFFFFA096);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field1339 || class275.field3867) && arg2 != -1 && this.field1337.length > arg2) {
                var16 = this.field1337[arg2];
                if (var16 != 65535) {
                    var14 = this.field1333.method485(var16 >> 16, 5);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field1336) {
            arg5 |= 0x200;
        }
        if (var9.method2591(-1123836575, var10)) {
            arg5 |= 0x80;
        }
        if (var9.method2597(12010, var10)) {
            arg5 |= 0x100;
        }
        if (var9.method2594(17729, var10)) {
            arg5 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method2591(-1123836575, var15)) {
                arg5 |= 0x80;
            }
            if (var13.method2597(12010, var15)) {
                arg5 |= 0x100;
            }
            if (var13.method2594(17729, var15)) {
                arg5 |= 0x400;
            }
        }
        if (var11 != null) {
            if (var11.method2591(-1123836575, arg2)) {
                arg5 |= 0x80;
            }
            if (var11.method2597(12010, arg2)) {
                arg5 |= 0x100;
            }
            if (var11.method2594(arg1 ^ 0xFFFFE5D2, arg2)) {
                arg5 |= 0x400;
            }
        }
        if (var14 != null) {
            if (var14.method2591(-1123836575, var16)) {
                arg5 |= 0x80;
            }
            if (var14.method2597(arg1 ^ 0xFFFF8E79, var16)) {
                arg5 |= 0x100;
            }
            if (var14.method2594(17729, var16)) {
                arg5 |= 0x400;
            }
        }
        if (arg1 != -24429) {
            return null;
        }
        int var17 = arg5 | 0x20;
        class334 var18 = arg0.method47((byte) 1, var17, true);
        var18.method2161(this.field1336, var11, arg2, var9, var7, var10, arg3 - 1, 0, (byte) -79);
        if (var13 != null) {
            var18.method2161(this.field1336, var14, var16, var13, var7, var15, arg3 - 1, 0, (byte) -79);
        }
        return var18;
    }
}
