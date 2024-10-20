package deob;

@ObfuscatedName("ee")
public class class108 {

    @ObfuscatedName("ee.ao")
    public static byte[] field1388 = new byte[2048];

    @ObfuscatedName("ee.at")
    public static class218[] field1378 = new class218[2048];

    @ObfuscatedName("ee.ac")
    public static class515[] field1389 = new class515[2048];

    @ObfuscatedName("ee.ai")
    public static int field1380 = 0;

    @ObfuscatedName("ee.az")
    public static int[] field1381 = new int[2048];

    @ObfuscatedName("ee.ap")
    public static int field1382 = 0;

    @ObfuscatedName("ee.aa")
    public static int[] field1390 = new int[2048];

    @ObfuscatedName("ee.af")
    public static int[] field1384 = new int[2048];

    @ObfuscatedName("ee.ad")
    public static int[] field1385 = new int[2048];

    @ObfuscatedName("ee.aq")
    public static int[] field1386 = new int[2048];

    @ObfuscatedName("ee.al")
    public static int field1387 = 0;

    @ObfuscatedName("ee.an")
    public static int[] field1379 = new int[2048];

    @ObfuscatedName("ee.ar")
    public static class515 field1377 = new class515(new byte[5000]);

    public class108() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dr.au(Lto;I)V")
    public static final void method2300(class514 arg0) {
        arg0.method8250();
        int var1 = client.field655;
        class92 var2 = Statics.field2132 = client.field700[var1] = new class92();
        var2.field1128 = var1;
        int var3 = arg0.method8247(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field1273[0] = var5 - Statics.field1448;
        var2.field1228 = (var2.field1273[0] << 7) + (var2.method2213() << 6);
        var2.field1270[0] = var6 - Statics.field354;
        var2.field1199 = (var2.field1270[0] << 7) + (var2.method2213() << 6);
        Statics.field1321 = var2.field1150 = var4;
        if (field1389[var1] != null) {
            var2.method2207(field1389[var1]);
        }
        field1380 = 0;
        field1381[++field1380 - 1] = var1;
        field1388[var1] = 0;
        field1382 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method8247(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1384[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1385[var7] = 0;
                field1386[var7] = -1;
                field1390[++field1382 - 1] = var7;
                field1388[var7] = 0;
            }
        }
        arg0.method8264();
    }

    @ObfuscatedName("eb.ae(Lto;II)V")
    public static final void method2742(class514 arg0, int arg1) {
        int var2 = arg0.field5111;
        field1387 = 0;
        int var3 = 0;
        arg0.method8250();
        for (int var4 = 0; var4 < field1380; var4++) {
            int var5 = field1381[var4];
            if ((field1388[var5] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field1388[var5] = (byte) (field1388[var5] | 0x2);
                } else {
                    int var6 = arg0.method8247(1);
                    if (var6 == 0) {
                        var3 = method299(arg0);
                        field1388[var5] = (byte) (field1388[var5] | 0x2);
                    } else {
                        method6212(arg0, var5);
                    }
                }
            }
        }
        arg0.method8264();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method8250();
        for (int var7 = 0; var7 < field1380; var7++) {
            int var8 = field1381[var7];
            if ((field1388[var8] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field1388[var8] = (byte) (field1388[var8] | 0x2);
                } else {
                    int var9 = arg0.method8247(1);
                    if (var9 == 0) {
                        var3 = method299(arg0);
                        field1388[var8] = (byte) (field1388[var8] | 0x2);
                    } else {
                        method6212(arg0, var8);
                    }
                }
            }
        }
        arg0.method8264();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method8250();
        for (int var10 = 0; var10 < field1382; var10++) {
            int var11 = field1390[var10];
            if ((field1388[var11] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field1388[var11] = (byte) (field1388[var11] | 0x2);
                } else {
                    int var12 = arg0.method8247(1);
                    if (var12 == 0) {
                        var3 = method299(arg0);
                        field1388[var11] = (byte) (field1388[var11] | 0x2);
                    } else if (method3359(arg0, var11)) {
                        field1388[var11] = (byte) (field1388[var11] | 0x2);
                    }
                }
            }
        }
        arg0.method8264();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method8250();
        for (int var13 = 0; var13 < field1382; var13++) {
            int var14 = field1390[var13];
            if ((field1388[var14] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field1388[var14] = (byte) (field1388[var14] | 0x2);
                } else {
                    int var15 = arg0.method8247(1);
                    if (var15 == 0) {
                        var3 = method299(arg0);
                        field1388[var14] = (byte) (field1388[var14] | 0x2);
                    } else if (method3359(arg0, var14)) {
                        field1388[var14] = (byte) (field1388[var14] | 0x2);
                    }
                }
            }
        }
        arg0.method8264();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        field1380 = 0;
        field1382 = 0;
        for (int var16 = 1; var16 < 2048; var16++) {
            field1388[var16] = (byte) (field1388[var16] >> 1);
            class92 var17 = client.field700[var16];
            if (var17 == null) {
                field1390[++field1382 - 1] = var16;
            } else {
                field1381[++field1380 - 1] = var16;
            }
        }
        method2184(arg0);
        if (arg0.field5111 - var2 != arg1) {
            throw new RuntimeException(arg0.field5111 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("as.ao(Lto;B)I")
    public static int method299(class514 arg0) {
        int var1 = arg0.method8247(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method8247(5);
        } else if (var1 == 2) {
            var2 = arg0.method8247(8);
        } else {
            var2 = arg0.method8247(11);
        }
        return var2;
    }

    @ObfuscatedName("nu.at(Lto;II)V")
    public static void method6212(class514 arg0, int arg1) {
        boolean var2 = arg0.method8247(1) == 1;
        if (var2) {
            field1379[++field1387 - 1] = arg1;
        }
        int var3 = arg0.method8247(2);
        class92 var4 = client.field700[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field1155 = false;
            } else if (client.field655 == arg1) {
                throw new RuntimeException();
            } else {
                field1384[arg1] = (Statics.field354 + var4.field1270[0] >> 13) + (Statics.field1448 + var4.field1273[0] >> 13 << 14) + (var4.field1150 << 28);
                if (var4.field1235 == -1) {
                    field1385[arg1] = var4.field1239;
                } else {
                    field1385[arg1] = var4.field1235;
                }
                field1386[arg1] = var4.field1233;
                client.field700[arg1] = null;
                if (arg0.method8247(1) != 0) {
                    method3359(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method8247(3);
            int var6 = var4.field1273[0];
            int var7 = var4.field1270[0];
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
            if (client.field655 == arg1 && var4.field1228 < 1536 || var4.field1199 < 1536 || var4.field1228 >= 11776 || var4.field1199 >= 11776) {
                var4.method2218(var6, var7);
                var4.field1155 = false;
            } else if (var2) {
                var4.field1155 = true;
                var4.field1151 = var6;
                var4.field1157 = var7;
            } else {
                var4.field1155 = false;
                var4.method2245(var6, var7, field1378[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method8247(4);
            int var9 = var4.field1273[0];
            int var10 = var4.field1270[0];
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
            if (client.field655 == arg1 && var4.field1228 < 1536 || var4.field1199 < 1536 || var4.field1228 >= 11776 || var4.field1199 >= 11776) {
                var4.method2218(var9, var10);
                var4.field1155 = false;
            } else if (var2) {
                var4.field1155 = true;
                var4.field1151 = var9;
                var4.field1157 = var10;
            } else {
                var4.field1155 = false;
                var4.method2245(var9, var10, field1378[arg1]);
            }
        } else {
            int var11 = arg0.method8247(1);
            if (var11 == 0) {
                int var12 = arg0.method8247(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field1273[0] + var14;
                int var17 = var4.field1270[0] + var15;
                if (client.field655 == arg1 && var4.field1228 < 1536 || var4.field1199 < 1536 || var4.field1228 >= 11776 || var4.field1199 >= 11776) {
                    var4.method2218(var16, var17);
                    var4.field1155 = false;
                } else if (var2) {
                    var4.field1155 = true;
                    var4.field1151 = var16;
                    var4.field1157 = var17;
                } else {
                    var4.field1155 = false;
                    var4.method2245(var16, var17, field1378[arg1]);
                }
                var4.field1150 = (byte) (var4.field1150 + var13 & 0x3);
                if (client.field655 == arg1) {
                    Statics.field1321 = var4.field1150;
                }
            } else {
                int var18 = arg0.method8247(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field1448 + var4.field1273[0] + var20 & 0x3FFF) - Statics.field1448;
                int var23 = (Statics.field354 + var4.field1270[0] + var21 & 0x3FFF) - Statics.field354;
                if (client.field655 == arg1 && var4.field1228 < 1536 || var4.field1199 < 1536 || var4.field1228 >= 11776 || var4.field1199 >= 11776) {
                    var4.method2218(var22, var23);
                    var4.field1155 = false;
                } else if (var2) {
                    var4.field1155 = true;
                    var4.field1151 = var22;
                    var4.field1157 = var23;
                } else {
                    var4.field1155 = false;
                    var4.method2245(var22, var23, field1378[arg1]);
                }
                var4.field1150 = (byte) (var4.field1150 + var19 & 0x3);
                if (client.field655 == arg1) {
                    Statics.field1321 = var4.field1150;
                }
            }
        }
    }

    @ObfuscatedName("hz.ac(Lto;IB)Z")
    public static boolean method3359(class514 arg0, int arg1) {
        int var2 = arg0.method8247(2);
        if (var2 == 0) {
            if (arg0.method8247(1) != 0) {
                method3359(arg0, arg1);
            }
            int var3 = arg0.method8247(13);
            int var4 = arg0.method8247(13);
            boolean var5 = arg0.method8247(1) == 1;
            if (var5) {
                field1379[++field1387 - 1] = arg1;
            }
            if (client.field700[arg1] != null) {
                throw new RuntimeException();
            }
            class92 var6 = client.field700[arg1] = new class92();
            var6.field1128 = arg1;
            if (field1389[arg1] != null) {
                var6.method2207(field1389[arg1]);
            }
            var6.field1239 = field1385[arg1];
            var6.field1233 = field1386[arg1];
            int var7 = field1384[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field1271[0] = field1378[arg1];
            var6.field1150 = (byte) var8;
            var6.method2218((var9 << 13) + var3 - Statics.field1448, (var10 << 13) + var4 - Statics.field354);
            var6.field1155 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method8247(2);
            int var12 = field1384[arg1];
            field1384[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method8247(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1384[arg1];
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
            field1384[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method8247(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1384[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1384[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("da.ai(Lto;B)V")
    public static final void method2184(class514 arg0) {
        for (int var1 = 0; var1 < field1387; var1++) {
            int var2 = field1379[var1];
            class92 var3 = client.field700[var2];
            int var4 = arg0.method8300();
            if ((var4 & 0x1) != 0) {
                var4 += arg0.method8300() << 8;
            }
            if ((var4 & 0x8000) != 0) {
                var4 += arg0.method8300() << 16;
            }
            method1026(arg0, var2, var3, var4);
        }
    }

    @ObfuscatedName("cf.az(Lto;ILdf;II)V")
    public static final void method1026(class514 arg0, int arg1, class92 arg2, int arg3) {
        byte var4 = class218.field2406.field2409;
        if ((arg3 & 0x8) != 0) {
            int var5 = arg0.method8300();
            byte[] var6 = new byte[var5];
            class515 var7 = new class515(var6);
            arg0.method8460(var6, 0, var5);
            field1389[arg1] = var7;
            arg2.method2207(var7);
        }
        if ((arg3 & 0x10000) != 0) {
            int var8 = arg0.method8300();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg0.method8333();
                int var11 = arg0.method8344();
                int var12 = arg0.method8306();
                arg2.method2275(var10, var11, var12 >> 16, var12 & 0xFFFF);
            }
        }
        if ((arg3 & 0x40) != 0) {
            arg2.field1235 = arg0.method8344();
            if (arg2.field1246 == 0) {
                arg2.field1239 = arg2.field1235;
                arg2.method2288();
            }
        }
        if ((arg3 & 0x10) != 0) {
            arg2.field1233 = arg0.method8344();
            arg2.field1233 += arg0.method8333() << 16;
            int var13 = 16777215;
            if (arg2.field1233 == var13) {
                arg2.field1233 = -1;
            }
        }
        if ((arg3 & 0x1000) != 0) {
            int var14 = arg0.method8344();
            int var15 = var14 >> 8;
            int var16 = var15 >= 13 && var15 <= 20 ? var15 - 12 : 0;
            class354 var17 = (class354) class373.method371(class354.method5300(), arg0.method8333());
            boolean var18 = arg0.method8300() == 1;
            int var19 = arg0.method8498();
            int var20 = arg0.field5111;
            if (arg2.field1146 != null && arg2.field1129 != null) {
                boolean var21 = false;
                if (var17.field4233 && Statics.field3367.method1776(arg2.field1146)) {
                    var21 = true;
                }
                if (!var21 && client.field652 == 0 && !arg2.field1149) {
                    field1377.field5111 = 0;
                    arg0.method8460(field1377.field5108, 0, var19);
                    field1377.field5111 = 0;
                    String var22 = class398.method6856(class387.method1745(class335.method6035(field1377)));
                    arg2.field1269 = var22.trim();
                    arg2.field1223 = var14 >> 8;
                    arg2.field1224 = var14 & 0xFF;
                    arg2.field1222 = 150;
                    byte[] var23 = null;
                    if (var16 > 0 && var16 <= 8) {
                        var23 = new byte[var16];
                        for (int var24 = 0; var24 < var16; var24++) {
                            var23[var24] = arg0.method8338();
                        }
                    }
                    arg2.field1265 = class539.method3097(var23);
                    arg2.field1220 = var18;
                    arg2.field1221 = Statics.field2132 != arg2 && var17.field4233 && !client.field555.isEmpty() && var22.toLowerCase().indexOf(client.field555) == -1;
                    int var25;
                    if (var17.field4249) {
                        var25 = var18 ? 91 : 1;
                    } else {
                        var25 = var18 ? 90 : 2;
                    }
                    if (var17.field4248 == -1) {
                        class111.method683(var25, arg2.field1146.method8917(), var22);
                    } else {
                        class111.method683(var25, Statics.method4049(var17.field4248) + arg2.field1146.method8917(), var22);
                    }
                }
            }
            arg0.field5111 = var19 + var20 + var16;
        }
        if ((arg3 & 0x20) != 0) {
            int var26 = arg0.method8343();
            class354 var27 = (class354) class373.method371(class354.method5300(), arg0.method8498());
            boolean var28 = arg0.method8498() == 1;
            int var29 = arg0.method8300();
            int var30 = arg0.field5111;
            if (arg2.field1146 != null && arg2.field1129 != null) {
                boolean var31 = false;
                if (var27.field4233 && Statics.field3367.method1776(arg2.field1146)) {
                    var31 = true;
                }
                if (!var31 && client.field652 == 0 && !arg2.field1149) {
                    field1377.field5111 = 0;
                    arg0.method8460(field1377.field5108, 0, var29);
                    field1377.field5111 = 0;
                    String var32 = class398.method6856(class387.method1745(class335.method6035(field1377)));
                    arg2.field1269 = var32.trim();
                    arg2.field1223 = var26 >> 8;
                    arg2.field1224 = var26 & 0xFF;
                    arg2.field1222 = 150;
                    arg2.field1265 = null;
                    arg2.field1220 = var28;
                    arg2.field1221 = Statics.field2132 != arg2 && var27.field4233 && !client.field555.isEmpty() && var32.toLowerCase().indexOf(client.field555) == -1;
                    int var33;
                    if (var27.field4249) {
                        var33 = var28 ? 91 : 1;
                    } else {
                        var33 = var28 ? 90 : 2;
                    }
                    if (var27.field4248 == -1) {
                        class111.method683(var33, arg2.field1146.method8917(), var32);
                    } else {
                        class111.method683(var33, Statics.method4049(var27.field4248) + arg2.field1146.method8917(), var32);
                    }
                }
            }
            arg0.field5111 = var29 + var30;
        }
        if ((arg3 & 0x4) != 0) {
            int var34 = arg0.method8300();
            if (var34 > 0) {
                for (int var35 = 0; var35 < var34; var35++) {
                    int var36 = -1;
                    int var37 = -1;
                    int var38 = -1;
                    int var39 = arg0.method8436();
                    if (var39 == 32767) {
                        var39 = arg0.method8436();
                        var37 = arg0.method8436();
                        var36 = arg0.method8436();
                        var38 = arg0.method8436();
                    } else if (var39 == 32766) {
                        var39 = -1;
                    } else {
                        var37 = arg0.method8436();
                    }
                    int var40 = arg0.method8436();
                    arg2.method2281(var39, var37, var36, var38, client.field833, var40);
                }
            }
            int var41 = arg0.method8300();
            if (var41 > 0) {
                for (int var42 = 0; var42 < var41; var42++) {
                    int var43 = arg0.method8436();
                    int var44 = arg0.method8436();
                    if (var44 == 32767) {
                        arg2.method2282(var43);
                    } else {
                        int var45 = arg0.method8436();
                        int var46 = arg0.method8333();
                        int var47 = var44 > 0 ? arg0.method8300() : var46;
                        arg2.method2273(var43, client.field833, var44, var45, var46, var47);
                    }
                }
            }
        }
        if ((arg3 & 0x200) != 0) {
            arg2.field1250 = arg0.method8338();
            arg2.field1252 = arg0.method8320();
            arg2.field1248 = arg0.method8301();
            arg2.field1218 = arg0.method8301();
            arg2.field1254 = arg0.method8343() + client.field833;
            arg2.field1255 = arg0.method8343() + client.field833;
            arg2.field1256 = arg0.method8344();
            if (arg2.field1155) {
                arg2.field1250 += arg2.field1151;
                arg2.field1252 += arg2.field1157;
                arg2.field1248 += arg2.field1151;
                arg2.field1218 += arg2.field1157;
                arg2.field1246 = 0;
            } else {
                arg2.field1250 += arg2.field1273[0];
                arg2.field1252 += arg2.field1270[0];
                arg2.field1248 += arg2.field1273[0];
                arg2.field1218 += arg2.field1270[0];
                arg2.field1246 = 1;
            }
            arg2.field1262 = 0;
        }
        if ((arg3 & 0x800) != 0) {
            class218[] var48 = field1378;
            class218[] var50 = new class218[] { class218.field2406, class218.field2407, class218.field2408, class218.field2411 };
            var48[arg1] = (class218) class373.method371(var50, arg0.method8301());
        }
        if ((arg3 & 0x80) != 0) {
            arg2.field1269 = arg0.method8311();
            if (arg2.field1269.charAt(0) == '~') {
                arg2.field1269 = arg2.field1269.substring(1);
                class111.method683(2, arg2.field1146.method8917(), arg2.field1269);
            } else if (Statics.field2132 == arg2) {
                class111.method683(2, arg2.field1146.method8917(), arg2.field1269);
            }
            arg2.field1220 = false;
            arg2.field1223 = 0;
            arg2.field1224 = 0;
            arg2.field1222 = 150;
        }
        if ((arg3 & 0x4000) != 0) {
            arg2.field1259 = client.field833 + arg0.method8342();
            arg2.field1201 = client.field833 + arg0.method8342();
            arg2.field1261 = arg0.method8338();
            arg2.field1219 = arg0.method8337();
            arg2.field1213 = arg0.method8320();
            arg2.field1251 = (byte) arg0.method8498();
        }
        if ((arg3 & 0x2000) != 0) {
            for (int var51 = 0; var51 < 3; var51++) {
                arg2.field1132[var51] = arg0.method8311();
            }
        }
        if ((arg3 & 0x400) != 0) {
            var4 = arg0.method8301();
        }
        if ((arg3 & 0x2) != 0) {
            int var52 = arg0.method8448();
            if (var52 == 65535) {
                var52 = -1;
            }
            int var53 = arg0.method8333();
            client.method8060(arg2, var52, var53);
        }
        if (!arg2.field1155) {
            return;
        }
        if (var4 == 127) {
            arg2.method2218(arg2.field1151, arg2.field1157);
            return;
        }
        class218 var55;
        if (class218.field2406.field2409 == var4) {
            var55 = field1378[arg1];
        } else {
            class218[] var54 = new class218[] { class218.field2406, class218.field2407, class218.field2408, class218.field2411 };
            var55 = (class218) class373.method371(var54, var4);
        }
        arg2.method2245(arg2.field1151, arg2.field1157, var55);
    }
}
