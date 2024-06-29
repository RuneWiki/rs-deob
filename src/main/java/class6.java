import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class6 {

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "[I")
    private int[] field100;

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "[I")
    private int[] field104;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "Llf;")
    private class105 field97;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "Llf;")
    private class105 field102;

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "[Llf;")
    private class105[] field109;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public static int field95 = 0;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "Leh;")
    private static class47 field92 = class195.method1282((byte) -4, "Take");

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "Leh;")
    private static class47 field98 = class195.method1282((byte) -4, "Click to switch");

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "Leh;")
    public static class47 field103 = field92;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "I")
    public static int field108 = 0;

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "Leh;")
    public static class47 field107 = field98;

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "Lwf;")
    public static class204 field94;

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "[S")
    public static short[] field106;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIII[Lgf;IIII)V")
    public static final void method28(int arg0, int arg1, int arg2, int arg3, class61[] arg4, int arg5, int arg6, int arg7, int arg8) {
        field105++;
        int var9 = 0;
        if (arg7 != -29618) {
            field107 = null;
        }
        while (var9 < arg4.length) {
            class61 var10 = arg4[var9];
            if (var10 != null && (!var10.field1313 || var10.field1311 == 0 || var10.field1240 || class5.method25(var10, (byte) 70) != 0 || class63.field1344 == var10 || var10.field1225 == 1338) && var10.field1245 == arg5 && (!var10.field1313 || !class72.method632(var10, arg7 + 29550))) {
                int var11 = var10.field1253 + arg1;
                int var12 = var10.field1229 + arg3;
                int var13;
                int var15;
                int var16;
                int var18;
                if (var10.field1311 == 2) {
                    var15 = arg6;
                    var16 = arg0;
                    var13 = arg2;
                    var18 = arg8;
                } else if (var10.field1311 == 9) {
                    int var19 = var11;
                    int var20 = var12;
                    int var21 = var10.field1187 + var11;
                    if (var21 < var11) {
                        var19 = var21;
                        var21 = var11;
                    }
                    var13 = arg2 >= var19 ? arg2 : var19;
                    int var23 = var12 + var10.field1303;
                    var21++;
                    if (var12 > var23) {
                        var20 = var23;
                        var23 = var12;
                    }
                    var23++;
                    var18 = var23 >= arg8 ? arg8 : var23;
                    var15 = arg6 < var20 ? var20 : arg6;
                    var16 = var21 < arg0 ? var21 : arg0;
                } else {
                    var13 = var11 <= arg2 ? arg2 : var11;
                    int var14 = var10.field1187 + var11;
                    var15 = var12 <= arg6 ? arg6 : var12;
                    var16 = arg0 <= var14 ? arg0 : var14;
                    int var17 = var10.field1303 + var12;
                    var18 = var17 < arg8 ? var17 : arg8;
                }
                if (class26.field511 == var10) {
                    class109.field2257 = var12;
                    class140.field2740 = var11;
                    class124.field2492 = true;
                }
                if (!var10.field1313 || var13 < var16 && var18 > var15) {
                    if (var10.field1225 == 1337) {
                        class20.method204(var10, (byte) -5);
                    } else {
                        label481: {
                            if (var10.field1311 == 0) {
                                if (!var10.field1313 && class72.method632(var10, arg7 + 29562) && class67.field1431 != var10) {
                                    break label481;
                                }
                                method28(var16, var11 - var10.field1316, var13, var12 - var10.field1250, arg4, var10.field1211, var15, -29618, var18);
                                if (var10.field1227 != null) {
                                    method28(var16, var11 - var10.field1316, var13, var12 - var10.field1250, var10.field1227, var10.field1211, var15, arg7, var18);
                                }
                                class63 var25 = (class63) class138.field2710.method1342((long) var10.field1211, (byte) -20);
                                if (var25 != null) {
                                    class183.method1222((byte) -126, var15, var18, var12, var11, var13, var16, var25.field1349);
                                }
                            }
                            if (var10.field1313) {
                                boolean var26 = false;
                                boolean var27 = false;
                                if (class100.field2105 == 1 && class3.field29 >= var13 && class185.field3546 >= var15 && var16 > class3.field29 && var18 > class185.field3546) {
                                    var27 = true;
                                }
                                boolean var28;
                                if (var13 <= class84.field1788 && class41.field814 >= var15 && var16 > class84.field1788 && class41.field814 < var18) {
                                    var28 = true;
                                } else {
                                    var28 = false;
                                }
                                if (class156.field3054 == 1 && var28) {
                                    var26 = true;
                                }
                                if (var10.field1225 == 1338) {
                                    if (var27) {
                                        class8.method54(126, class185.field3546 - var12, -var11 + class3.field29, var10);
                                    }
                                    break label481;
                                }
                                if (var27) {
                                    class130.method960(class3.field29 - var11, -var12 + class185.field3546, (byte) -39, var10);
                                }
                                if (class26.field511 != null && class26.field511 != var10 && var28 && class27.method248(class5.method25(var10, (byte) 94), false)) {
                                    class86.field1830 = var10;
                                }
                                if (class63.field1344 == var10) {
                                    class193.field3740 = var11;
                                    class201.field3908 = true;
                                    class40.field787 = var12;
                                }
                                if (var10.field1240) {
                                    if (var28 && class117.field2372 != 0 && var10.field1315 != null) {
                                        class43 var29 = new class43();
                                        var29.field859 = var10;
                                        var29.field873 = class117.field2372;
                                        var29.field871 = var10.field1315;
                                        class126.field2531.method337(var29, (byte) -22);
                                    }
                                    if (class26.field511 != null || class190.field3684 != null || class80.field1726) {
                                        var26 = false;
                                        var28 = false;
                                        var27 = false;
                                    }
                                    if (!var10.field1280 && var27) {
                                        var10.field1280 = true;
                                        if (var10.field1239 != null) {
                                            class43 var30 = new class43();
                                            var30.field871 = var10.field1239;
                                            var30.field859 = var10;
                                            var30.field873 = class185.field3546 - var12;
                                            var30.field870 = class3.field29 - var11;
                                            class126.field2531.method337(var30, (byte) -22);
                                        }
                                    }
                                    if (var10.field1280 && var26 && var10.field1207 != null) {
                                        class43 var31 = new class43();
                                        var31.field871 = var10.field1207;
                                        var31.field870 = class84.field1788 - var11;
                                        var31.field859 = var10;
                                        var31.field873 = class41.field814 - var12;
                                        class126.field2531.method337(var31, (byte) -22);
                                    }
                                    if (var10.field1280 && !var26) {
                                        var10.field1280 = false;
                                        if (var10.field1221 != null) {
                                            class43 var32 = new class43();
                                            var32.field871 = var10.field1221;
                                            var32.field870 = class84.field1788 - var11;
                                            var32.field873 = class41.field814 - var12;
                                            var32.field859 = var10;
                                            client.field542.method337(var32, (byte) -22);
                                        }
                                    }
                                    if (var26 && var10.field1217 != null) {
                                        class43 var33 = new class43();
                                        var33.field873 = class41.field814 - var12;
                                        var33.field859 = var10;
                                        var33.field870 = class84.field1788 - var11;
                                        var33.field871 = var10.field1217;
                                        class126.field2531.method337(var33, (byte) -22);
                                    }
                                    if (!var10.field1288 && var28) {
                                        var10.field1288 = true;
                                        if (var10.field1219 != null) {
                                            class43 var34 = new class43();
                                            var34.field873 = class41.field814 - var12;
                                            var34.field871 = var10.field1219;
                                            var34.field859 = var10;
                                            var34.field870 = class84.field1788 - var11;
                                            class126.field2531.method337(var34, (byte) -22);
                                        }
                                    }
                                    if (var10.field1288 && var28 && var10.field1290 != null) {
                                        class43 var35 = new class43();
                                        var35.field871 = var10.field1290;
                                        var35.field870 = class84.field1788 - var11;
                                        var35.field859 = var10;
                                        var35.field873 = class41.field814 - var12;
                                        class126.field2531.method337(var35, (byte) -22);
                                    }
                                    if (var10.field1288 && !var28) {
                                        var10.field1288 = false;
                                        if (var10.field1289 != null) {
                                            class43 var36 = new class43();
                                            var36.field870 = class84.field1788 - var11;
                                            var36.field859 = var10;
                                            var36.field873 = class41.field814 - var12;
                                            var36.field871 = var10.field1289;
                                            client.field542.method337(var36, (byte) -22);
                                        }
                                    }
                                    if (var10.field1266 != null) {
                                        class43 var37 = new class43();
                                        var37.field859 = var10;
                                        var37.field871 = var10.field1266;
                                        class39.field764.method337(var37, (byte) -22);
                                    }
                                    if (var10.field1312 != null && class98.field2081 > var10.field1276) {
                                        if (var10.field1291 == null || class98.field2081 - var10.field1276 > 32) {
                                            class43 var42 = new class43();
                                            var42.field859 = var10;
                                            var42.field871 = var10.field1312;
                                            class126.field2531.method337(var42, (byte) -22);
                                        } else {
                                            label396: for (int var38 = var10.field1276; var38 < class98.field2081; var38++) {
                                                int var39 = class147.field2887[var38 & 0x1F];
                                                for (int var40 = 0; var40 < var10.field1291.length; var40++) {
                                                    if (var10.field1291[var40] == var39) {
                                                        class43 var41 = new class43();
                                                        var41.field871 = var10.field1312;
                                                        var41.field859 = var10;
                                                        class126.field2531.method337(var41, (byte) -22);
                                                        break label396;
                                                    }
                                                }
                                            }
                                        }
                                        var10.field1276 = class98.field2081;
                                    }
                                    if (var10.field1191 != null && class37.field740 > var10.field1179) {
                                        if (var10.field1203 == null || class37.field740 - var10.field1179 > 32) {
                                            class43 var47 = new class43();
                                            var47.field871 = var10.field1191;
                                            var47.field859 = var10;
                                            class126.field2531.method337(var47, (byte) -22);
                                        } else {
                                            label372: for (int var43 = var10.field1179; var43 < class37.field740; var43++) {
                                                int var44 = class130.field2559[var43 & 0x1F];
                                                for (int var45 = 0; var45 < var10.field1203.length; var45++) {
                                                    if (var10.field1203[var45] == var44) {
                                                        class43 var46 = new class43();
                                                        var46.field859 = var10;
                                                        var46.field871 = var10.field1191;
                                                        class126.field2531.method337(var46, (byte) -22);
                                                        break label372;
                                                    }
                                                }
                                            }
                                        }
                                        var10.field1179 = class37.field740;
                                    }
                                    if (var10.field1299 != null && class88.field1873 > var10.field1271) {
                                        if (var10.field1275 == null || class88.field1873 - var10.field1271 > 32) {
                                            class43 var52 = new class43();
                                            var52.field871 = var10.field1299;
                                            var52.field859 = var10;
                                            class126.field2531.method337(var52, (byte) -22);
                                        } else {
                                            label348: for (int var48 = var10.field1271; var48 < class88.field1873; var48++) {
                                                int var49 = class105.field2181[var48 & 0x1F];
                                                for (int var50 = 0; var50 < var10.field1275.length; var50++) {
                                                    if (var10.field1275[var50] == var49) {
                                                        class43 var51 = new class43();
                                                        var51.field859 = var10;
                                                        var51.field871 = var10.field1299;
                                                        class126.field2531.method337(var51, (byte) -22);
                                                        break label348;
                                                    }
                                                }
                                            }
                                        }
                                        var10.field1271 = class88.field1873;
                                    }
                                    if (class144.field2826 > var10.field1190 && var10.field1258 != null) {
                                        class43 var53 = new class43();
                                        var53.field859 = var10;
                                        var53.field871 = var10.field1258;
                                        class126.field2531.method337(var53, (byte) -22);
                                    }
                                    if (class36.field713 > var10.field1190 && var10.field1198 != null) {
                                        class43 var54 = new class43();
                                        var54.field871 = var10.field1198;
                                        var54.field859 = var10;
                                        class126.field2531.method337(var54, (byte) -22);
                                    }
                                    if (var10.field1190 < class25.field474 && var10.field1254 != null) {
                                        class43 var55 = new class43();
                                        var55.field871 = var10.field1254;
                                        var55.field859 = var10;
                                        class126.field2531.method337(var55, (byte) -22);
                                    }
                                    if (var10.field1190 < class143.field2816 && var10.field1324 != null) {
                                        class43 var56 = new class43();
                                        var56.field871 = var10.field1324;
                                        var56.field859 = var10;
                                        class126.field2531.method337(var56, (byte) -22);
                                    }
                                    if (var10.field1190 < class109.field2269 && var10.field1206 != null) {
                                        class43 var57 = new class43();
                                        var57.field859 = var10;
                                        var57.field871 = var10.field1206;
                                        class126.field2531.method337(var57, (byte) -22);
                                    }
                                    var10.field1190 = class103.field2162;
                                    if (var10.field1183 != null) {
                                        for (int var58 = 0; var58 < class170.field3321; var58++) {
                                            class43 var59 = new class43();
                                            var59.field859 = var10;
                                            var59.field861 = class70.field1533[var58];
                                            var59.field863 = class192.field3730[var58];
                                            var59.field871 = var10.field1183;
                                            class126.field2531.method337(var59, (byte) -22);
                                        }
                                    }
                                }
                            }
                            if (!var10.field1313) {
                                if (class26.field511 != null || class190.field3684 != null || class80.field1726) {
                                    return;
                                }
                                if ((var10.field1214 >= 0 || var10.field1231 != 0) && class84.field1788 >= var13 && class41.field814 >= var15 && class84.field1788 < var16 && var18 > class41.field814) {
                                    if (var10.field1214 >= 0) {
                                        class67.field1431 = arg4[var10.field1214];
                                    } else {
                                        class67.field1431 = var10;
                                    }
                                }
                                if (var10.field1311 == 8 && class84.field1788 >= var13 && class41.field814 >= var15 && var16 > class84.field1788 && class41.field814 < var18) {
                                    class60.field1177 = var10;
                                }
                                if (var10.field1188 > var10.field1303) {
                                    class82.method693(var10.field1188, class84.field1788, var10, -1, var10.field1303, var12, var10.field1187 + var11, class41.field814);
                                }
                            }
                        }
                    }
                }
            }
            var9++;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
    public static final void method29(int arg0) {
        field101++;
        class22.field418.method658(-9462);
        int var1 = class22.field418.method655(8, 720);
        if (var1 < class80.field1727) {
            for (int var2 = var1; var2 < class80.field1727; var2++) {
                class107.field2230[class92.field1925++] = class136.field2666[var2];
            }
        }
        if (var1 > class80.field1727) {
            throw new RuntimeException("gnpov1");
        }
        int var3 = -43 % ((arg0 - 69) / 40);
        class80.field1727 = 0;
        for (int var4 = 0; var4 < var1; var4++) {
            int var5 = class136.field2666[var4];
            class72 var6 = class133.field2626[var5];
            int var7 = class22.field418.method655(1, 720);
            if (var7 == 0) {
                class136.field2666[class80.field1727++] = var5;
                var6.field3326 = class18.field362;
            } else {
                int var8 = class22.field418.method655(2, 720);
                if (var8 == 0) {
                    class136.field2666[class80.field1727++] = var5;
                    var6.field3326 = class18.field362;
                    class196.field3810[class94.field1942++] = var5;
                } else if (var8 == 1) {
                    class136.field2666[class80.field1727++] = var5;
                    var6.field3326 = class18.field362;
                    int var9 = class22.field418.method655(3, 720);
                    var6.method1161(var9, false, 16437);
                    int var10 = class22.field418.method655(1, 720);
                    if (var10 == 1) {
                        class196.field3810[class94.field1942++] = var5;
                    }
                } else if (var8 == 2) {
                    class136.field2666[class80.field1727++] = var5;
                    var6.field3326 = class18.field362;
                    int var11 = class22.field418.method655(3, 720);
                    var6.method1161(var11, true, 16437);
                    int var12 = class22.field418.method655(3, 720);
                    var6.method1161(var12, true, 16437);
                    int var13 = class22.field418.method655(1, 720);
                    if (var13 == 1) {
                        class196.field3810[class94.field1942++] = var5;
                    }
                } else if (var8 == 3) {
                    class107.field2230[class92.field1925++] = var5;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILah;Lsf;DZII)[I")
    public final int[] method30(int arg0, class9 arg1, class168 arg2, double arg3, boolean arg4, int arg5, int arg6) {
        class186.field3554 = arg1;
        class59.field1136 = arg2;
        class198.method1303(true, arg6, arg5);
        field99++;
        for (int var9 = 0; var9 < this.field109.length; var9++) {
            this.field109[var9].method856(arg6, (byte) -95, arg5);
        }
        int[] var10 = new int[arg5 * arg6];
        byte var11;
        int var12;
        int var13;
        if (arg4) {
            var11 = -1;
            var12 = -1;
            var13 = arg6 - 1;
        } else {
            var12 = arg6;
            var13 = 0;
            var11 = 1;
        }
        int var14 = 0;
        for (int var15 = arg0; var15 < arg5; var15++) {
            int[] var18;
            int[] var19;
            int[] var20;
            if (this.field97.field2179) {
                int[] var21 = this.field97.method92(var15, (byte) 108);
                var18 = var21;
                var20 = var21;
                var19 = var21;
            } else {
                int[][] var17 = this.field97.method15(var15, true);
                var18 = var17[0];
                var19 = var17[1];
                var20 = var17[2];
            }
            for (int var22 = var13; var22 != var12; var22 += var11) {
                double var23 = Math.pow((double) var18[var22] / 4096.0D, arg3);
                double var25 = Math.pow((double) var19[var22] / 4096.0D, arg3);
                double var27 = Math.pow((double) var20[var22] / 4096.0D, arg3);
                int var29 = (int) (var23 * 256.0D);
                int var30 = (int) (var25 * 256.0D);
                int var31 = (int) (var27 * 256.0D);
                if (var29 > 255) {
                    var29 = 255;
                }
                if (var31 > 255) {
                    var31 = 255;
                }
                if (var31 < 0) {
                    var31 = 0;
                }
                if (var29 < 0) {
                    var29 = 0;
                }
                if (var30 > 255) {
                    var30 = 255;
                }
                if (var30 < 0) {
                    var30 = 0;
                }
                var10[var14++] = (var29 << 16) + (var30 << 8) + var31;
            }
        }
        for (int var16 = 0; var16 < this.field109.length; var16++) {
            this.field109[var16].method860(false);
        }
        return var10;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IB)V")
    public static final void method31(int arg0, byte arg1) {
        field93++;
        if (arg0 == -1 || !class57.method493(arg0, arg1 ^ 0x8339B6F1)) {
            return;
        }
        class61[] var2 = class51.field986[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class61 var4 = var2[var3];
            if (var4.field1320 != null) {
                class43 var5 = new class43();
                var5.field859 = var4;
                var5.field871 = var4.field1320;
                class61.method517((byte) 84, var5, 2000000);
            }
        }
        if (arg1 != -127) {
            field95 = 99;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILah;Lsf;)Z")
    public final boolean method32(int arg0, class9 arg1, class168 arg2) {
        field96++;
        int var4 = 57 / ((arg0 - 36) / 45);
        for (int var5 = 0; var5 < this.field104.length; var5++) {
            if (!arg1.method69(this.field104[var5], 0)) {
                return false;
            }
        }
        for (int var6 = 0; var6 < this.field100.length; var6++) {
            if (!arg2.method735(-18527, this.field100[var6])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V")
    public static void method33(byte arg0) {
        field103 = null;
        field92 = null;
        field106 = null;
        field107 = null;
        field94 = null;
        field98 = null;
        if (arg0 >= -87) {
            field106 = null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V")
    public class6() {
        this.field100 = new int[0];
        this.field104 = new int[0];
        this.field97 = new class192();
        this.field102 = new class192();
        this.field109 = new class105[] { this.field97, this.field102 };
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Lhd;)V")
    public class6(class68 arg0) {
        int var2 = arg0.method604((byte) 23);
        class204 var3 = new class204(64);
        class204 var4 = new class204(64);
        class204 var5 = new class204(64);
        this.field109 = new class105[var2];
        int[][] var6 = new int[var2][];
        for (int var7 = 0; var7 < var2; var7++) {
            class105 var21 = class130.method963(arg0, 72);
            int var22 = var21.method850((byte) -26);
            int var23 = var21.method858(18263);
            if (var22 >= 0 && var22 >= 0 && var4.method1342((long) var22, (byte) -20) == null) {
                var4.method1341(-52, (long) var22, new class190(var22));
            }
            if (var23 >= 0 && var23 >= 0 && var5.method1342((long) var23, (byte) -20) == null) {
                var5.method1341(-81, (long) var23, new class190(var23));
            }
            int var26 = var21.field2196.length;
            var6[var7] = new int[var26];
            for (int var27 = 0; var27 < var26; var27++) {
                var6[var7][var27] = arg0.method604((byte) -128);
            }
            var3.method1341(-94, (long) var21.field2188, var21);
            this.field109[var7] = var21;
        }
        for (int var8 = 0; var8 < var2; var8++) {
            class105 var17 = this.field109[var8];
            int var18 = var17.field2196.length;
            for (int var19 = 0; var19 < var18; var19++) {
                class105 var20 = (class105) var3.method1342((long) var6[var8][var19], (byte) -20);
                var17.field2196[var19] = var20;
            }
            var6[var8] = null;
        }
        Object var9 = null;
        this.field97 = (class105) var3.method1342((long) arg0.method604((byte) -128), (byte) -20);
        this.field102 = (class105) var3.method1342((long) arg0.method604((byte) -31), (byte) -20);
        this.field104 = new int[var4.method1336((byte) -84)];
        Object var10 = null;
        this.field100 = new int[var5.method1336((byte) -84)];
        class110[] var11 = new class110[var4.method1336((byte) -84)];
        class110[] var12 = new class110[var5.method1336((byte) -84)];
        var4.method1339(var11, (byte) -31);
        var5.method1339(var12, (byte) -31);
        Object var13 = null;
        for (int var14 = 0; var14 < var11.length; var14++) {
            this.field104[var14] = ((class190) var11[var14]).field3682;
        }
        Object var15 = null;
        for (int var16 = 0; var16 < var12.length; var16++) {
            this.field100[var16] = ((class190) var12[var16]).field3682;
        }
    }
}
