import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class173 {

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public static int field3010 = -1;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "[[B")
    public static byte[][] field3006 = new byte[1000][];

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "Ldj;")
    public static class44 field3009 = class89.method650(255, "overlay2)3dat");

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
    public static int field3008;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lwg;IIIIIII)V")
    public static final void method1097(class237 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8;
        int var9 = var8 = (arg6 << 7) - class191.field3298;
        int var10;
        int var11 = var10 = (arg7 << 7) - class200.field3546;
        int var12;
        int var13 = var12 = var9 + 128;
        int var14;
        int var15 = var14 = var11 + 128;
        int var16 = class205.field3675[arg1][arg6][arg7] - class153.field2666;
        int var17 = class205.field3675[arg1][arg6 + 1][arg7] - class153.field2666;
        int var18 = class205.field3675[arg1][arg6 + 1][arg7 + 1] - class153.field2666;
        int var19 = class205.field3675[arg1][arg6][arg7 + 1] - class153.field2666;
        int var20 = arg4 * var11 + arg5 * var9 >> 16;
        int var21 = arg5 * var11 - arg4 * var9 >> 16;
        int var23 = arg3 * var16 - arg2 * var21 >> 16;
        int var24 = arg2 * var16 + arg3 * var21 >> 16;
        if (var24 < 50) {
            return;
        }
        int var26 = arg4 * var10 + arg5 * var13 >> 16;
        int var27 = arg5 * var10 - arg4 * var13 >> 16;
        int var29 = arg3 * var17 - arg2 * var27 >> 16;
        int var30 = arg2 * var17 + arg3 * var27 >> 16;
        if (var30 < 50) {
            return;
        }
        int var32 = arg4 * var15 + arg5 * var12 >> 16;
        int var33 = arg5 * var15 - arg4 * var12 >> 16;
        int var35 = arg3 * var18 - arg2 * var33 >> 16;
        int var36 = arg2 * var18 + arg3 * var33 >> 16;
        if (var36 < 50) {
            return;
        }
        int var38 = arg4 * var14 + arg5 * var8 >> 16;
        int var39 = arg5 * var14 - arg4 * var8 >> 16;
        int var41 = arg3 * var19 - arg2 * var39 >> 16;
        int var42 = arg2 * var19 + arg3 * var39 >> 16;
        if (var42 < 50) {
            return;
        }
        int var44 = (var20 << 9) / var24 + class206.field3698;
        int var45 = (var23 << 9) / var24 + class206.field3690;
        int var46 = (var26 << 9) / var30 + class206.field3698;
        int var47 = (var29 << 9) / var30 + class206.field3690;
        int var48 = (var32 << 9) / var36 + class206.field3698;
        int var49 = (var35 << 9) / var36 + class206.field3690;
        int var50 = (var38 << 9) / var42 + class206.field3698;
        int var51 = (var41 << 9) / var42 + class206.field3690;
        class206.field3694 = 0;
        if ((var47 - var51) * (var48 - var50) - (var46 - var50) * (var49 - var51) > 0) {
            if (class72.field1374 && class14.method123(class216.field3938 + class206.field3698, class206.field3690 + class104.field1897, var49, var51, var47, var48, var50, var46)) {
                class31.field546 = arg6;
                class157.field2725 = arg7;
            }
            class206.field3693 = false;
            if (var48 < 0 || var50 < 0 || var46 < 0 || var48 > class206.field3688 || var50 > class206.field3688 || var46 > class206.field3688) {
                class206.field3693 = true;
            }
            if (arg0.field4389 == -1) {
                if (arg0.field4390 != 12345678) {
                    class206.method1338(var49, var51, var47, var48, var50, var46, arg0.field4390, arg0.field4401, arg0.field4387);
                }
            } else if (class219.field3965) {
                int var52 = class206.field3689.method369(arg0.field4389, (byte) -114);
                class206.method1338(var49, var51, var47, var48, var50, var46, class62.method464(var52, arg0.field4390), class62.method464(var52, arg0.field4401), class62.method464(var52, arg0.field4387));
            } else if (arg0.field4395) {
                class206.method1339(var49, var51, var47, var48, var50, var46, arg0.field4390, arg0.field4401, arg0.field4387, var20, var26, var38, var23, var29, var41, var24, var30, var42, arg0.field4389);
            } else {
                class206.method1339(var49, var51, var47, var48, var50, var46, arg0.field4390, arg0.field4401, arg0.field4387, var32, var38, var26, var35, var41, var29, var36, var42, var30, arg0.field4389);
            }
        }
        if ((var44 - var46) * (var51 - var47) - (var45 - var47) * (var50 - var46) <= 0) {
            return;
        }
        if (class72.field1374 && class14.method123(class216.field3938 + class206.field3698, class206.field3690 + class104.field1897, var45, var47, var51, var44, var46, var50)) {
            class31.field546 = arg6;
            class157.field2725 = arg7;
        }
        class206.field3693 = false;
        if (var44 < 0 || var46 < 0 || var50 < 0 || var44 > class206.field3688 || var46 > class206.field3688 || var50 > class206.field3688) {
            class206.field3693 = true;
        }
        if (arg0.field4389 != -1) {
            if (!class219.field3965) {
                class206.method1339(var45, var47, var51, var44, var46, var50, arg0.field4403, arg0.field4387, arg0.field4401, var20, var26, var38, var23, var29, var41, var24, var30, var42, arg0.field4389);
                return;
            }
            int var53 = class206.field3689.method369(arg0.field4389, (byte) -102);
            class206.method1338(var45, var47, var51, var44, var46, var50, class62.method464(var53, arg0.field4403), class62.method464(var53, arg0.field4387), class62.method464(var53, arg0.field4401));
        } else if (arg0.field4403 != 12345678) {
            class206.method1338(var45, var47, var51, var44, var46, var50, arg0.field4403, arg0.field4387, arg0.field4401);
            return;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
    public static void method1098(int arg0) {
        field3006 = null;
        if (arg0 != -1) {
            field3006 = null;
        }
        field3009 = null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Throwable;)V")
    public static final void method1099(int arg0, String arg1, Throwable arg2) {
        field3012++;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class178.method1126(arg2, -1596);
            }
            if (arg1 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            if (arg0 < 98) {
                method1097(null, -12, -9, -33, -12, -123, -93, -29);
            }
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class94.field1751.field4301 != null) {
                class176 var8 = class94.field1751.method1498(82, new URL(class94.field1751.field4301.getCodeBase(), "clienterror.ws?c=" + class234.field4356 + "&u=" + class101.field1840 + "&v1=" + class229.field4294 + "&v2=" + class229.field4303 + "&e=" + var7));
                while (var8.field3043 == 0) {
                    class82.method617((byte) 31, 1L);
                }
                if (var8.field3043 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field3040;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "([Lue;B)V")
    public static final void method1100(class215[] arg0, byte arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var113 = 0; var113 < 104; var113++) {
                for (int var114 = 0; var114 < 104; var114++) {
                    if ((class47.field875[var2][var113][var114] & 0x1) == 1) {
                        int var115 = var2;
                        if ((class47.field875[1][var113][var114] & 0x2) == 2) {
                            var115 = var2 - 1;
                        }
                        if (var115 >= 0) {
                            arg0[var115].method1411(var113, var114, 2097152);
                        }
                    }
                }
            }
        }
        class192.field3331 += (int) (Math.random() * 5.0D) - 2;
        class102.field1863 += (int) (Math.random() * 5.0D) - 2;
        if (class102.field1863 < -16) {
            class102.field1863 = -16;
        }
        field3011++;
        if (class102.field1863 > 16) {
            class102.field1863 = 16;
        }
        if (class192.field3331 < -8) {
            class192.field3331 = -8;
        }
        if (class192.field3331 > 8) {
            class192.field3331 = 8;
        }
        int[][] var3 = new int[104][104];
        int var4 = class102.field1863 >> 1;
        int var5 = class192.field3331 >> 2 << 10;
        int[][] var6 = new int[104][104];
        if (arg1 >= -114) {
            field3006 = null;
        }
        for (int var7 = 0; var7 < 4; var7++) {
            byte[][] var50 = class156.field2706[var7];
            byte var51 = 74;
            short var52 = 768;
            int var53 = (int) Math.sqrt(5100.0D);
            int var54 = var52 * var53 >> 8;
            for (int var55 = 1; var55 < 103; var55++) {
                for (int var103 = 1; var103 < 103; var103++) {
                    int var105 = class211.field3771[var7][var103 + 1][var55] - class211.field3771[var7][var103 - 1][var55];
                    int var106 = class211.field3771[var7][var103][var55 + 1] - class211.field3771[var7][var103][var55 - 1];
                    int var107 = (int) Math.sqrt((double) (var105 * var105 + var106 * var106 + 65536));
                    int var108 = (var105 << 8) / var107;
                    int var109 = -65536 / var107;
                    int var110 = (var106 << 8) / var107;
                    int var111 = (var110 * -50 + var108 * -50 + var109 * -10) / var54 + var51;
                    int var112 = (var50[var103 + 1][var55] >> 3) + (var50[var103 - 1][var55] >> 2) + (var50[var103][var55 + 1] >> 3) + (var50[var103][var55] >> 1) + (var50[var103][var55 + -1] >> 2);
                    var6[var103][var55] = var111 - var112;
                }
            }
            for (int var56 = 0; var56 < 104; var56++) {
                class94.field1740[var56] = 0;
                class130.field2331[var56] = 0;
                class78.field1514[var56] = 0;
                class116.field2070[var56] = 0;
                class214.field3893[var56] = 0;
            }
            for (int var57 = -5; var57 < 104; var57++) {
                for (int var88 = 0; var88 < 104; var88++) {
                    int var97 = var57 + 5;
                    int var10002;
                    if (var97 < 104) {
                        int var98 = class30.field526[var7][var97][var88] & 0xFF;
                        if (var98 > 0) {
                            class162 var99 = class42.method288(1, var98 - 1);
                            class94.field1740[var88] += var99.field2796;
                            class130.field2331[var88] += var99.field2803;
                            class78.field1514[var88] += var99.field2794;
                            class116.field2070[var88] += var99.field2804;
                            var10002 = class214.field3893[var88]++;
                        }
                    }
                    int var100 = var57 - 5;
                    if (var100 >= 0) {
                        int var101 = class30.field526[var7][var100][var88] & 0xFF;
                        if (var101 > 0) {
                            class162 var102 = class42.method288(1, var101 - 1);
                            class94.field1740[var88] -= var102.field2796;
                            class130.field2331[var88] -= var102.field2803;
                            class78.field1514[var88] -= var102.field2794;
                            class116.field2070[var88] -= var102.field2804;
                            var10002 = class214.field3893[var88]--;
                        }
                    }
                }
                if (var57 >= 0) {
                    int var89 = 0;
                    int var90 = 0;
                    int var91 = 0;
                    int var92 = 0;
                    int var93 = 0;
                    for (int var94 = -5; var94 < 104; var94++) {
                        int var95 = var94 + 5;
                        int var96 = var94 - 5;
                        if (var95 < 104) {
                            var93 += class116.field2070[var95];
                            var90 += class130.field2331[var95];
                            var89 += class94.field1740[var95];
                            var92 += class214.field3893[var95];
                            var91 += class78.field1514[var95];
                        }
                        if (var96 >= 0) {
                            var90 -= class130.field2331[var96];
                            var92 -= class214.field3893[var96];
                            var89 -= class94.field1740[var96];
                            var91 -= class78.field1514[var96];
                            var93 -= class116.field2070[var96];
                        }
                        if (var94 >= 0 && var92 > 0) {
                            var3[var57][var94] = class27.method196(var89 * 256 / var93, var90 / var92, -218, var91 / var92);
                        }
                    }
                }
            }
            for (int var58 = 1; var58 < 103; var58++) {
                for (int var61 = 1; var61 < 103; var61++) {
                    if (!class33.field583 || (class47.field875[0][var58][var61] & 0x2) != 0 || (class47.field875[var7][var58][var61] & 0x10) == 0 && class235.method1535(var58, var7, var61, 8) == class88.field1671) {
                        if (class88.field1683 > var7) {
                            class88.field1683 = var7;
                        }
                        int var62 = class30.field526[var7][var58][var61] & 0xFF;
                        int var63 = class201.field3564[var7][var58][var61] & 0xFF;
                        if (var62 > 0 || var63 > 0) {
                            int var64 = class211.field3771[var7][var58 + 1][var61];
                            int var65 = class211.field3771[var7][var58 + 1][var61 + 1];
                            int var66 = class211.field3771[var7][var58][var61];
                            int var67 = class211.field3771[var7][var58][var61 + 1];
                            if (var7 > 0) {
                                boolean var68 = true;
                                if (var62 == 0 && class165.field2845[var7][var58][var61] != 0) {
                                    var68 = false;
                                }
                                if (var63 > 0 && !class61.method461(false, var63 - 1).field2992) {
                                    var68 = false;
                                }
                                if (var68 && var64 == var66 && var65 == var66 && var66 == var67) {
                                    class216.field3928[var7][var58][var61] = class238.method1545(class216.field3928[var7][var58][var61], 2340);
                                }
                            }
                            int var69;
                            int var70;
                            if (var62 <= 0) {
                                var69 = 0;
                                var70 = -1;
                            } else {
                                var70 = var3[var58][var61];
                                int var71 = (var70 & 0x7F) + var4;
                                if (var71 < 0) {
                                    var71 = 0;
                                } else if (var71 > 127) {
                                    var71 = 127;
                                }
                                int var72 = (var5 + var70 & 0xFC00) + (var70 & 0x380) + var71;
                                var69 = class206.field3697[class63.method471(96, 127, var72)];
                            }
                            int var73 = var6[var58][var61];
                            int var74 = var6[var58 + 1][var61 + 1];
                            int var75 = var6[var58][var61 + 1];
                            int var76 = var6[var58 + 1][var61];
                            if (var63 == 0) {
                                class160.method1037(var7, var58, var61, 0, 0, -1, var66, var64, var65, var67, class63.method471(var73, 127, var70), class63.method471(var76, 127, var70), class63.method471(var74, 127, var70), class63.method471(var75, 127, var70), 0, 0, 0, 0, var69, 0);
                            } else {
                                int var77 = class165.field2845[var7][var58][var61] + 1;
                                byte var78 = class221.field4005[var7][var58][var61];
                                class172 var79 = class61.method461(false, var63 - 1);
                                int var80 = var79.field3001;
                                if (var80 >= 0 && !class206.field3689.method368(20, var80)) {
                                    var80 = -1;
                                }
                                int var81;
                                int var84;
                                if (var80 >= 0) {
                                    var81 = -1;
                                    var84 = class206.field3697[class140.method938(96, class206.field3689.method369(var80, (byte) -126), -19608)];
                                } else if (var79.field3005 == -1) {
                                    var81 = -2;
                                    var84 = 0;
                                } else {
                                    var81 = var79.field3005;
                                    int var82 = (var81 & 0x7F) + var4;
                                    if (var82 < 0) {
                                        var82 = 0;
                                    } else if (var82 > 127) {
                                        var82 = 127;
                                    }
                                    int var83 = (var5 + var81 & 0xFC00) + (var81 & 0x380) + var82;
                                    var84 = class206.field3697[class140.method938(96, var83, -19608)];
                                }
                                if (var79.field2994 >= 0) {
                                    int var85 = var79.field2994;
                                    int var86 = (var85 & 0x7F) + var4;
                                    if (var86 < 0) {
                                        var86 = 0;
                                    } else if (var86 > 127) {
                                        var86 = 127;
                                    }
                                    int var87 = (var5 + var85 & 0xFC00) + (var85 & 0x380) + var86;
                                    var84 = class206.field3697[class140.method938(96, var87, -19608)];
                                }
                                class160.method1037(var7, var58, var61, var77, var78, var80, var66, var64, var65, var67, class63.method471(var73, 127, var70), class63.method471(var76, 127, var70), class63.method471(var74, 127, var70), class63.method471(var75, 127, var70), class140.method938(var73, var81, -19608), class140.method938(var76, var81, -19608), class140.method938(var74, var81, -19608), class140.method938(var75, var81, -19608), var69, var84);
                            }
                        }
                    }
                }
            }
            for (int var59 = 1; var59 < 103; var59++) {
                for (int var60 = 1; var60 < 103; var60++) {
                    class36.method253(var7, var60, var59, class235.method1535(var60, var7, var59, 8));
                }
            }
            class30.field526[var7] = null;
            class201.field3564[var7] = null;
            class165.field2845[var7] = null;
            class221.field4005[var7] = null;
            class156.field2706[var7] = null;
        }
        class38.method258(-50, -10, -50);
        for (int var8 = 0; var8 < 104; var8++) {
            for (int var49 = 0; var49 < 104; var49++) {
                if ((class47.field875[1][var8][var49] & 0x2) == 2) {
                    class238.method1543(var8, var49);
                }
            }
        }
        int var9 = 1;
        int var10 = 2;
        int var11 = 4;
        for (int var12 = 0; var12 < 4; var12++) {
            if (var12 > 0) {
                var10 <<= 0x3;
                var9 <<= 0x3;
                var11 <<= 0x3;
            }
            for (int var13 = 0; var13 <= var12; var13++) {
                for (int var14 = 0; var14 <= 104; var14++) {
                    for (int var15 = 0; var15 <= 104; var15++) {
                        if ((class216.field3928[var13][var15][var14] & var9) != 0) {
                            int var16;
                            for (var16 = var14; var16 < 104 && (var9 & class216.field3928[var13][var15][var16 + 1]) != 0; var16++) {
                            }
                            int var17 = var14;
                            int var18 = var13;
                            while (var17 > 0 && (var9 & class216.field3928[var13][var15][var17 - 1]) != 0) {
                                var17--;
                            }
                            int var19;
                            label358: for (var19 = var13; var19 > 0; var19--) {
                                for (int var20 = var17; var20 <= var16; var20++) {
                                    if ((var9 & class216.field3928[var19 - 1][var15][var20]) == 0) {
                                        break label358;
                                    }
                                }
                            }
                            label347: while (var12 > var18) {
                                for (int var21 = var17; var21 <= var16; var21++) {
                                    if ((class216.field3928[var18 + 1][var15][var21] & var9) == 0) {
                                        break label347;
                                    }
                                }
                                var18++;
                            }
                            int var22 = (var16 + 1 - var17) * (var18 + 1 - var19);
                            if (var22 >= 8) {
                                short var23 = 240;
                                int var24 = class211.field3771[var18][var15][var17] - var23;
                                int var25 = class211.field3771[var19][var15][var17];
                                class102.method752(var12, 1, var15 * 128, var15 * 128, var17 * 128, var16 * 128 + 128, var24, var25);
                                for (int var26 = var19; var26 <= var18; var26++) {
                                    for (int var27 = var17; var27 <= var16; var27++) {
                                        class216.field3928[var26][var15][var27] = class29.method202(class216.field3928[var26][var15][var27], ~var9);
                                    }
                                }
                            }
                        }
                        if ((var10 & class216.field3928[var13][var15][var14]) != 0) {
                            int var28;
                            for (var28 = var15; var28 < 104 && (var10 & class216.field3928[var13][var28 + 1][var14]) != 0; var28++) {
                            }
                            int var29 = var15;
                            int var30 = var13;
                            int var31 = var13;
                            while (var29 > 0 && (var10 & class216.field3928[var13][var29 - 1][var14]) != 0) {
                                var29--;
                            }
                            label413: while (var30 > 0) {
                                for (int var32 = var29; var32 <= var28; var32++) {
                                    if ((var10 & class216.field3928[var30 - 1][var32][var14]) == 0) {
                                        break label413;
                                    }
                                }
                                var30--;
                            }
                            label402: while (var12 > var31) {
                                for (int var33 = var29; var33 <= var28; var33++) {
                                    if ((var10 & class216.field3928[var31 + 1][var33][var14]) == 0) {
                                        break label402;
                                    }
                                }
                                var31++;
                            }
                            int var34 = (var31 + 1 - var30) * (var28 + 1 - var29);
                            if (var34 >= 8) {
                                short var35 = 240;
                                int var36 = class211.field3771[var31][var29][var14] - var35;
                                int var37 = class211.field3771[var30][var29][var14];
                                class102.method752(var12, 2, var29 * 128, var28 * 128 + 128, var14 * 128, var14 * 128, var36, var37);
                                for (int var38 = var30; var38 <= var31; var38++) {
                                    for (int var39 = var29; var39 <= var28; var39++) {
                                        class216.field3928[var38][var39][var14] = class29.method202(class216.field3928[var38][var39][var14], ~var10);
                                    }
                                }
                            }
                        }
                        if ((class216.field3928[var13][var15][var14] & var11) != 0) {
                            int var40 = var15;
                            int var41 = var15;
                            int var42 = var14;
                            int var43 = var14;
                            while (var42 > 0 && (var11 & class216.field3928[var13][var15][var42 - 1]) != 0) {
                                var42--;
                            }
                            while (var43 < 104 && (class216.field3928[var13][var15][var43 + 1] & var11) != 0) {
                                var43++;
                            }
                            label467: while (var40 > 0) {
                                for (int var44 = var42; var44 <= var43; var44++) {
                                    if ((var11 & class216.field3928[var13][var40 - 1][var44]) == 0) {
                                        break label467;
                                    }
                                }
                                var40--;
                            }
                            label456: while (var41 < 104) {
                                for (int var45 = var42; var45 <= var43; var45++) {
                                    if ((var11 & class216.field3928[var13][var41 + 1][var45]) == 0) {
                                        break label456;
                                    }
                                }
                                var41++;
                            }
                            if ((var41 + 1 - var40) * (-var42 + 1 + var43) >= 4) {
                                int var46 = class211.field3771[var13][var40][var42];
                                class102.method752(var12, 4, var40 * 128, var41 * 128 + 128, var42 * 128, var43 * 128 + 128, var46, var46);
                                for (int var47 = var40; var47 <= var41; var47++) {
                                    for (int var48 = var42; var48 <= var43; var48++) {
                                        class216.field3928[var13][var47][var48] = class29.method202(class216.field3928[var13][var47][var48], ~var11);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1101(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3007++;
        class132 var10 = null;
        for (class132 var11 = (class132) class210.field3754.method1189(0); var11 != null; var11 = (class132) class210.field3754.method1192((byte) -102)) {
            if (var11.field2367 == arg1 && var11.field2363 == arg8 && var11.field2371 == arg7 && var11.field2357 == arg3) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class132();
            var10.field2367 = arg1;
            var10.field2371 = arg7;
            var10.field2363 = arg8;
            var10.field2357 = arg3;
            class62.method465(false, var10);
            class210.field3754.method1185(var10, (byte) -110);
        }
        var10.field2361 = arg6;
        if (arg5 == -27776) {
            var10.field2374 = arg2;
            var10.field2364 = arg0;
            var10.field2370 = arg4;
            var10.field2366 = arg9;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZB)V")
    public static final void method1102(boolean arg0, byte arg1) {
        field3008++;
        if (arg1 != -90) {
            method1099(81, null, null);
        }
        if (class120.field2139 == null) {
            return;
        }
        try {
            class66 var2 = new class66(4);
            var2.method488(arg1 + 213, arg0 ? 2 : 3);
            var2.method483(2554, 0);
            class120.field2139.method782(arg1 ^ 0xFFFFFFF1, var2.field1219, 4, 0);
        } catch (IOException var4) {
            try {
                class120.field2139.method778((byte) -123);
            } catch (Exception var3) {
            }
            class120.field2139 = null;
            class54.field999++;
        }
    }
}
