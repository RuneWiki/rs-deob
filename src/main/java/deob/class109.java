package deob;

@ObfuscatedName("ey")
public class class109 {

    @ObfuscatedName("ey.al")
    public static byte[] field1380 = new byte[2048];

    @ObfuscatedName("ey.ai")
    public static class234[] field1379 = new class234[2048];

    @ObfuscatedName("ey.ar")
    public static class534[] field1390 = new class534[2048];

    @ObfuscatedName("ey.as")
    public static int field1381 = 0;

    @ObfuscatedName("ey.aa")
    public static int[] field1376 = new int[2048];

    @ObfuscatedName("ey.az")
    public static int field1383 = 0;

    @ObfuscatedName("ey.ao")
    public static int[] field1384 = new int[2048];

    @ObfuscatedName("ey.au")
    public static int[] field1385 = new int[2048];

    @ObfuscatedName("ey.ak")
    public static int[] field1386 = new int[2048];

    @ObfuscatedName("ey.ah")
    public static int[] field1389 = new int[2048];

    @ObfuscatedName("ey.aj")
    public static int field1388 = 0;

    @ObfuscatedName("ey.af")
    public static int[] field1387 = new int[2048];

    @ObfuscatedName("ey.ax")
    public static class534 field1382 = new class534(new byte[5000]);

    public class109() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aw.aq(Lun;I)V")
    public static final void method13(class533 arg0) {
        arg0.method8541();
        int var1 = client.field692;
        class93 var2 = Statics.field1858 = client.field652[var1] = new class93();
        var2.field1157 = var1;
        int var3 = arg0.method8567(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field1235[0] = var5 - Statics.field1011;
        var2.field1208 = (var2.field1235[0] << 7) + (var2.method2285() << 6);
        var2.field1278[0] = var6 - Statics.field216;
        var2.field1253 = (var2.field1278[0] << 7) + (var2.method2285() << 6);
        Statics.field4873 = var2.field1156 = var4;
        if (field1390[var1] != null) {
            var2.method2293(field1390[var1]);
        }
        field1381 = 0;
        field1376[++field1381 - 1] = var1;
        field1380[var1] = 0;
        field1383 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method8567(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1385[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1386[var7] = 0;
                field1389[var7] = -1;
                field1384[++field1383 - 1] = var7;
                field1380[var7] = 0;
            }
        }
        arg0.method8551();
    }

    @ObfuscatedName("cw.ai(Lun;I)I")
    public static int method1087(class533 arg0) {
        int var1 = arg0.method8567(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method8567(5);
        } else if (var1 == 2) {
            var2 = arg0.method8567(8);
        } else {
            var2 = arg0.method8567(11);
        }
        return var2;
    }

    @ObfuscatedName("dm.ar(Lun;II)V")
    public static void method2249(class533 arg0, int arg1) {
        boolean var2 = arg0.method8567(1) == 1;
        if (var2) {
            field1387[++field1388 - 1] = arg1;
        }
        int var3 = arg0.method8567(2);
        class93 var4 = client.field652[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field1148 = false;
            } else if (client.field692 == arg1) {
                throw new RuntimeException();
            } else {
                field1385[arg1] = (Statics.field216 + var4.field1278[0] >> 13) + (Statics.field1011 + var4.field1235[0] >> 13 << 14) + (var4.field1156 << 28);
                if (var4.field1243 == -1) {
                    field1386[arg1] = var4.field1273;
                } else {
                    field1386[arg1] = var4.field1243;
                }
                field1389[arg1] = var4.field1241;
                client.field652[arg1] = null;
                if (arg0.method8567(1) != 0) {
                    method3337(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method8567(3);
            int var6 = var4.field1235[0];
            int var7 = var4.field1278[0];
            if (var5 == 0) {
                var6--;
                var7--;
            } else if (var5 == 1) {
                var7--;
            } else if (var5 == 2) {
                var6++;
                var7--;
            } else if (var5 == 3) {
                var6--;
            } else if (var5 == 4) {
                var6++;
            } else if (var5 == 5) {
                var6--;
                var7++;
            } else if (var5 == 6) {
                var7++;
            } else if (var5 == 7) {
                var6++;
                var7++;
            }
            if (client.field692 == arg1 && var4.field1208 < 1536 || var4.field1253 < 1536 || var4.field1208 >= 11776 || var4.field1253 >= 11776) {
                var4.method2288(var6, var7);
                var4.field1148 = false;
            } else if (var2) {
                var4.field1148 = true;
                var4.field1150 = var6;
                var4.field1143 = var7;
            } else {
                var4.field1148 = false;
                var4.method2319(var6, var7, field1379[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method8567(4);
            int var9 = var4.field1235[0];
            int var10 = var4.field1278[0];
            if (var8 == 0) {
                var9 -= 2;
                var10 -= 2;
            } else if (var8 == 1) {
                var9--;
                var10 -= 2;
            } else if (var8 == 2) {
                var10 -= 2;
            } else if (var8 == 3) {
                var9++;
                var10 -= 2;
            } else if (var8 == 4) {
                var9 += 2;
                var10 -= 2;
            } else if (var8 == 5) {
                var9 -= 2;
                var10--;
            } else if (var8 == 6) {
                var9 += 2;
                var10--;
            } else if (var8 == 7) {
                var9 -= 2;
            } else if (var8 == 8) {
                var9 += 2;
            } else if (var8 == 9) {
                var9 -= 2;
                var10++;
            } else if (var8 == 10) {
                var9 += 2;
                var10++;
            } else if (var8 == 11) {
                var9 -= 2;
                var10 += 2;
            } else if (var8 == 12) {
                var9--;
                var10 += 2;
            } else if (var8 == 13) {
                var10 += 2;
            } else if (var8 == 14) {
                var9++;
                var10 += 2;
            } else if (var8 == 15) {
                var9 += 2;
                var10 += 2;
            }
            if (client.field692 == arg1 && var4.field1208 < 1536 || var4.field1253 < 1536 || var4.field1208 >= 11776 || var4.field1253 >= 11776) {
                var4.method2288(var9, var10);
                var4.field1148 = false;
            } else if (var2) {
                var4.field1148 = true;
                var4.field1150 = var9;
                var4.field1143 = var10;
            } else {
                var4.field1148 = false;
                var4.method2319(var9, var10, field1379[arg1]);
            }
        } else {
            int var11 = arg0.method8567(1);
            if (var11 == 0) {
                int var12 = arg0.method8567(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field1235[0] + var14;
                int var17 = var4.field1278[0] + var15;
                if (client.field692 == arg1 && var4.field1208 < 1536 || var4.field1253 < 1536 || var4.field1208 >= 11776 || var4.field1253 >= 11776) {
                    var4.method2288(var16, var17);
                    var4.field1148 = false;
                } else if (var2) {
                    var4.field1148 = true;
                    var4.field1150 = var16;
                    var4.field1143 = var17;
                } else {
                    var4.field1148 = false;
                    var4.method2319(var16, var17, field1379[arg1]);
                }
                var4.field1156 = (byte) (var4.field1156 + var13 & 0x3);
                if (client.field692 == arg1) {
                    Statics.field4873 = var4.field1156;
                }
            } else {
                int var18 = arg0.method8567(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field1011 + var4.field1235[0] + var20 & 0x3FFF) - Statics.field1011;
                int var23 = (Statics.field216 + var4.field1278[0] + var21 & 0x3FFF) - Statics.field216;
                if (client.field692 == arg1 && var4.field1208 < 1536 || var4.field1253 < 1536 || var4.field1208 >= 11776 || var4.field1253 >= 11776) {
                    var4.method2288(var22, var23);
                    var4.field1148 = false;
                } else if (var2) {
                    var4.field1148 = true;
                    var4.field1150 = var22;
                    var4.field1143 = var23;
                } else {
                    var4.field1148 = false;
                    var4.method2319(var22, var23, field1379[arg1]);
                }
                var4.field1156 = (byte) (var4.field1156 + var19 & 0x3);
                if (client.field692 == arg1) {
                    Statics.field4873 = var4.field1156;
                }
            }
        }
    }

    @ObfuscatedName("hg.as(Lun;II)Z")
    public static boolean method3337(class533 arg0, int arg1) {
        int var2 = arg0.method8567(2);
        if (var2 == 0) {
            if (arg0.method8567(1) != 0) {
                method3337(arg0, arg1);
            }
            int var3 = arg0.method8567(13);
            int var4 = arg0.method8567(13);
            boolean var5 = arg0.method8567(1) == 1;
            if (var5) {
                field1387[++field1388 - 1] = arg1;
            }
            if (client.field652[arg1] != null) {
                throw new RuntimeException();
            }
            class93 var6 = client.field652[arg1] = new class93();
            var6.field1157 = arg1;
            if (field1390[arg1] != null) {
                var6.method2293(field1390[arg1]);
            }
            var6.field1273 = field1386[arg1];
            var6.field1241 = field1389[arg1];
            int var7 = field1385[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field1274[0] = field1379[arg1];
            var6.field1156 = (byte) var8;
            var6.method2288((var9 << 13) + var3 - Statics.field1011, (var10 << 13) + var4 - Statics.field216);
            var6.field1148 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method8567(2);
            int var12 = field1385[arg1];
            field1385[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method8567(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1385[arg1];
            int var17 = (var16 >> 28) + var14 & 0x3;
            int var18 = var16 >> 14 & 0xFF;
            int var19 = var16 & 0xFF;
            if (var15 == 0) {
                var18--;
                var19--;
            }
            if (var15 == 1) {
                var19--;
            }
            if (var15 == 2) {
                var18++;
                var19--;
            }
            if (var15 == 3) {
                var18--;
            }
            if (var15 == 4) {
                var18++;
            }
            if (var15 == 5) {
                var18--;
                var19++;
            }
            if (var15 == 6) {
                var19++;
            }
            if (var15 == 7) {
                var18++;
                var19++;
            }
            field1385[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method8567(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1385[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1385[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("oy.aa(Lun;ILdj;IB)V")
    public static final void method6330(class533 arg0, int arg1, class93 arg2, int arg3) {
        byte var4 = class234.field2472.field2474;
        if ((arg3 & 0x1000) != 0) {
            arg2.field1258 = arg0.method8629();
            arg2.field1260 = arg0.method8629();
            arg2.field1259 = arg0.method8629();
            arg2.field1249 = arg0.method8628();
            arg2.field1262 = arg0.method8593() + client.field536;
            arg2.field1272 = arg0.method8610() + client.field536;
            arg2.field1224 = arg0.method8754();
            if (arg2.field1148) {
                arg2.field1258 += arg2.field1150;
                arg2.field1260 += arg2.field1143;
                arg2.field1259 += arg2.field1150;
                arg2.field1249 += arg2.field1143;
                arg2.field1276 = 0;
            } else {
                arg2.field1258 += arg2.field1235[0];
                arg2.field1260 += arg2.field1278[0];
                arg2.field1259 += arg2.field1235[0];
                arg2.field1249 += arg2.field1278[0];
                arg2.field1276 = 1;
            }
            arg2.field1281 = 0;
        }
        if ((arg3 & 0x4000) != 0) {
            arg2.field1263 = client.field536 + arg0.method8754();
            arg2.field1279 = client.field536 + arg0.method8610();
            arg2.field1269 = arg0.method8627();
            arg2.field1270 = arg0.method8627();
            arg2.field1277 = arg0.method8592();
            arg2.field1256 = (byte) arg0.method8697();
        }
        if ((arg3 & 0x8) != 0) {
            arg2.field1241 = arg0.method8821();
            arg2.field1241 += arg0.method8697() << 16;
            int var5 = 16777215;
            if (arg2.field1241 == var5) {
                arg2.field1241 = -1;
            }
        }
        if ((arg3 & 0x80) != 0) {
            int var6 = arg0.method8821();
            if (var6 == 65535) {
                var6 = -1;
            }
            int var7 = arg0.method8591();
            client.method7979(arg2, var6, var7);
        }
        if ((arg3 & 0x20) != 0) {
            int var8 = arg0.method8624();
            byte[] var9 = new byte[var8];
            class534 var10 = new class534(var9);
            arg0.method8680(var9, 0, var8);
            field1390[arg1] = var10;
            arg2.method2293(var10);
        }
        if ((arg3 & 0x2) != 0) {
            arg2.field1252 = arg0.method8741();
            if (arg2.field1252.charAt(0) == '~') {
                arg2.field1252 = arg2.field1252.substring(1);
                class112.method3792(2, arg2.field1162.method9185(), arg2.field1252);
            } else if (Statics.field1858 == arg2) {
                class112.method3792(2, arg2.field1162.method9185(), arg2.field1252);
            }
            arg2.field1229 = false;
            arg2.field1209 = 0;
            arg2.field1232 = 0;
            arg2.field1230 = 150;
        }
        if ((arg3 & 0x100) != 0) {
            class234[] var11 = field1379;
            class234[] var13 = new class234[] { class234.field2473, class234.field2470, class234.field2471, class234.field2472 };
            var11[arg1] = (class234) class392.method6317(var13, arg0.method8592());
        }
        if ((arg3 & 0x4) != 0) {
            int var14 = arg0.method8591();
            if (var14 > 0) {
                for (int var15 = 0; var15 < var14; var15++) {
                    int var16 = -1;
                    int var17 = -1;
                    int var18 = -1;
                    int var19 = arg0.method8820();
                    if (var19 == 32767) {
                        var19 = arg0.method8820();
                        var17 = arg0.method8820();
                        var16 = arg0.method8820();
                        var18 = arg0.method8820();
                    } else if (var19 == 32766) {
                        var19 = -1;
                    } else {
                        var17 = arg0.method8820();
                    }
                    int var20 = arg0.method8820();
                    arg2.method2350(var19, var17, var16, var18, client.field536, var20);
                }
            }
            int var21 = arg0.method8591();
            if (var21 > 0) {
                for (int var22 = 0; var22 < var21; var22++) {
                    int var23 = arg0.method8820();
                    int var24 = arg0.method8820();
                    if (var24 == 32767) {
                        arg2.method2353(var23);
                    } else {
                        int var25 = arg0.method8820();
                        int var26 = arg0.method8624();
                        int var27 = var24 > 0 ? arg0.method8723() : var26;
                        arg2.method2358(var23, client.field536, var24, var25, var26, var27);
                    }
                }
            }
        }
        if ((arg3 & 0x40) != 0) {
            int var28 = arg0.method8754();
            class373 var29 = (class373) class392.method6317(class373.method8273(), arg0.method8591());
            boolean var30 = arg0.method8591() == 1;
            int var31 = arg0.method8591();
            int var32 = arg0.field5200;
            if (arg2.field1162 != null && arg2.field1158 != null) {
                boolean var33 = false;
                if (var29.field4335 && Statics.field1091.method1814(arg2.field1162)) {
                    var33 = true;
                }
                if (!var33 && client.field650 == 0 && !arg2.field1155) {
                    field1382.field5200 = 0;
                    arg0.method8605(field1382.field5199, 0, var31);
                    field1382.field5200 = 0;
                    String var34 = class417.method7131(class406.method3189(class357.method8028(field1382)));
                    arg2.field1252 = var34.trim();
                    arg2.field1209 = var28 >> 8;
                    arg2.field1232 = var28 & 0xFF;
                    arg2.field1230 = 150;
                    arg2.field1227 = null;
                    arg2.field1229 = var30;
                    arg2.field1206 = Statics.field1858 != arg2 && var29.field4335 && !client.field644.isEmpty() && var34.toLowerCase().indexOf(client.field644) == -1;
                    int var35;
                    if (var29.field4354) {
                        var35 = var30 ? 91 : 1;
                    } else {
                        var35 = var30 ? 90 : 2;
                    }
                    if (var29.field4353 == -1) {
                        class112.method3792(var35, arg2.field1162.method9185(), var34);
                    } else {
                        class112.method3792(var35, class103.method7123(var29.field4353) + arg2.field1162.method9185(), var34);
                    }
                }
            }
            arg0.field5200 = var31 + var32;
        }
        if ((arg3 & 0x200) != 0) {
            int var36 = arg0.method8593();
            int var37 = var36 >> 8;
            int var38 = var37 >= 13 && var37 <= 20 ? var37 - 12 : 0;
            class373 var39 = (class373) class392.method6317(class373.method8273(), arg0.method8697());
            boolean var40 = arg0.method8591() == 1;
            int var41 = arg0.method8624();
            int var42 = arg0.field5200;
            if (arg2.field1162 != null && arg2.field1158 != null) {
                boolean var43 = false;
                if (var39.field4335 && Statics.field1091.method1814(arg2.field1162)) {
                    var43 = true;
                }
                if (!var43 && client.field650 == 0 && !arg2.field1155) {
                    field1382.field5200 = 0;
                    arg0.method8649(field1382.field5199, 0, var41);
                    field1382.field5200 = 0;
                    String var44 = class417.method7131(class406.method3189(class357.method8028(field1382)));
                    arg2.field1252 = var44.trim();
                    arg2.field1209 = var36 >> 8;
                    arg2.field1232 = var36 & 0xFF;
                    arg2.field1230 = 150;
                    byte[] var45 = null;
                    if (var38 > 0 && var38 <= 8) {
                        var45 = new byte[var38];
                        for (int var46 = 0; var46 < var38; var46++) {
                            var45[var46] = arg0.method8629();
                        }
                    }
                    arg2.field1227 = class558.method5541(var45);
                    arg2.field1229 = var40;
                    arg2.field1206 = Statics.field1858 != arg2 && var39.field4335 && !client.field644.isEmpty() && var44.toLowerCase().indexOf(client.field644) == -1;
                    int var47;
                    if (var39.field4354) {
                        var47 = var40 ? 91 : 1;
                    } else {
                        var47 = var40 ? 90 : 2;
                    }
                    if (var39.field4353 == -1) {
                        class112.method3792(var47, arg2.field1162.method9185(), var44);
                    } else {
                        class112.method3792(var47, class103.method7123(var39.field4353) + arg2.field1162.method9185(), var44);
                    }
                }
            }
            arg0.field5200 = var41 + var42 + var38;
        }
        if ((arg3 & 0x400) != 0) {
            for (int var48 = 0; var48 < 3; var48++) {
                arg2.field1139[var48] = arg0.method8741();
            }
        }
        if ((arg3 & 0x10000) != 0) {
            int var49 = arg0.method8697();
            for (int var50 = 0; var50 < var49; var50++) {
                int var51 = arg0.method8624();
                int var52 = arg0.method8593();
                int var53 = arg0.method8703();
                arg2.method2352(var51, var52, var53 >> 16, var53 & 0xFFFF);
            }
        }
        if ((arg3 & 0x8000) != 0) {
            var4 = arg0.method8592();
        }
        if ((arg3 & 0x1) != 0) {
            arg2.field1243 = arg0.method8610();
            if (arg2.field1276 == 0) {
                arg2.field1273 = arg2.field1243;
                arg2.method2356();
            }
        }
        if (!arg2.field1148) {
            return;
        }
        if (var4 == 127) {
            arg2.method2288(arg2.field1150, arg2.field1143);
            return;
        }
        class234 var55;
        if (class234.field2472.field2474 == var4) {
            var55 = field1379[arg1];
        } else {
            class234[] var54 = new class234[] { class234.field2473, class234.field2470, class234.field2471, class234.field2472 };
            var55 = (class234) class392.method6317(var54, var4);
        }
        arg2.method2319(arg2.field1150, arg2.field1143, var55);
    }

    @ObfuscatedName("ds.az(S)V")
    public static void method2336() {
        field1381 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field1390[var0] = null;
            field1379[var0] = class234.field2471;
        }
    }
}
