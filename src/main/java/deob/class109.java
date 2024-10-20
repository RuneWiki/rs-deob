package deob;

@ObfuscatedName("di")
public class class109 {

    @ObfuscatedName("di.f")
    public static byte[] field1371 = new byte[2048];

    @ObfuscatedName("di.y")
    public static byte[] field1374 = new byte[2048];

    @ObfuscatedName("di.p")
    public static class383[] field1375 = new class383[2048];

    @ObfuscatedName("di.j")
    public static int field1376 = 0;

    @ObfuscatedName("di.r")
    public static int[] field1381 = new int[2048];

    @ObfuscatedName("di.b")
    public static int field1378 = 0;

    @ObfuscatedName("di.d")
    public static int[] field1379 = new int[2048];

    @ObfuscatedName("di.s")
    public static int[] field1372 = new int[2048];

    @ObfuscatedName("di.u")
    public static int[] field1373 = new int[2048];

    @ObfuscatedName("di.l")
    public static int[] field1380 = new int[2048];

    @ObfuscatedName("di.o")
    public static int field1383 = 0;

    @ObfuscatedName("di.c")
    public static int[] field1377 = new int[2048];

    @ObfuscatedName("di.e")
    public static class383 field1385 = new class383(new byte[5000]);

    public class109() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ii.v(Lnb;B)V")
    public static final void method4241(class382 arg0) {
        arg0.method5918();
        int var1 = client.field759;
        class98 var2 = Statics.field1163 = client.field830[var1] = new class98();
        var2.field1193 = var1;
        int var3 = arg0.method5921(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field1273[0] = var5 - Statics.field2512;
        var2.field1238 = (var2.field1273[0] << 7) + (var2.method1921() << 6);
        var2.field1287[0] = var6 - Statics.field458;
        var2.field1237 = (var2.field1287[0] << 7) + (var2.method1921() << 6);
        Statics.field196 = var2.field1214 = var4;
        if (field1375[var1] != null) {
            var2.method1911(field1375[var1]);
        }
        field1376 = 0;
        field1381[++field1376 - 1] = var1;
        field1371[var1] = 0;
        field1378 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method5921(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1372[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1373[var7] = 0;
                field1380[var7] = -1;
                field1379[++field1378 - 1] = var7;
                field1371[var7] = 0;
            }
        }
        arg0.method5922();
    }

    @ObfuscatedName("by.n(Lnb;II)V")
    public static final void method1564(class382 arg0, int arg1) {
        int var2 = arg0.field4158;
        field1383 = 0;
        method639(arg0);
        for (int var3 = 0; var3 < field1383; var3++) {
            int var4 = field1377[var3];
            class98 var5 = client.field830[var4];
            int var6 = arg0.method5965();
            if ((var6 & 0x80) != 0) {
                var6 += arg0.method5965() << 8;
            }
            byte var7 = -1;
            if ((var6 & 0x8) != 0) {
                var5.field1289 = arg0.method5967();
                if (var5.field1289 == 65535) {
                    var5.field1289 = -1;
                }
            }
            if ((var6 & 0x100) != 0) {
                var5.field1274 = arg0.method6003();
                int var8 = arg0.method6012();
                var5.field1278 = var8 >> 16;
                var5.field1288 = (var8 & 0xFFFF) + client.field650;
                var5.field1263 = 0;
                var5.field1276 = 0;
                if (var5.field1288 > client.field650) {
                    var5.field1263 = -1;
                }
                if (var5.field1274 == 65535) {
                    var5.field1274 = -1;
                }
            }
            if ((var6 & 0x10) != 0) {
                int var9 = arg0.method5948();
                if (var9 > 0) {
                    for (int var10 = 0; var10 < var9; var10++) {
                        int var11 = -1;
                        int var12 = -1;
                        int var13 = -1;
                        int var14 = arg0.method5979();
                        if (var14 == 32767) {
                            var14 = arg0.method5979();
                            var12 = arg0.method5979();
                            var11 = arg0.method5979();
                            var13 = arg0.method5979();
                        } else if (var14 == 32766) {
                            var14 = -1;
                        } else {
                            var12 = arg0.method5979();
                        }
                        int var15 = arg0.method5979();
                        var5.method1977(var14, var12, var11, var13, client.field650, var15);
                    }
                }
                int var16 = arg0.method5965();
                if (var16 > 0) {
                    for (int var17 = 0; var17 < var16; var17++) {
                        int var18 = arg0.method5979();
                        int var19 = arg0.method5979();
                        if (var19 == 32767) {
                            var5.method1987(var18);
                        } else {
                            int var20 = arg0.method5979();
                            int var21 = arg0.method6070();
                            int var22 = var19 > 0 ? arg0.method5994() : var21;
                            var5.method1983(var18, client.field650, var19, var20, var21, var22);
                        }
                    }
                }
            }
            if ((var6 & 0x1) != 0) {
                var5.field1265 = arg0.method6004();
                if (var5.field1291 == 0) {
                    var5.field1267 = var5.field1265;
                    var5.field1265 = -1;
                }
            }
            if ((var6 & 0x800) != 0) {
                field1374[var4] = arg0.method5992();
            }
            if ((var6 & 0x200) != 0) {
                for (int var23 = 0; var23 < 3; var23++) {
                    var5.field1197[var23] = arg0.method5974();
                }
            }
            if ((var6 & 0x2000) != 0) {
                var5.field1279 = arg0.method5958();
                var5.field1281 = arg0.method5996();
                var5.field1270 = arg0.method5996();
                var5.field1239 = arg0.method5992();
                var5.field1266 = arg0.method5967() + client.field650;
                var5.field1284 = arg0.method6003() + client.field650;
                var5.field1285 = arg0.method6004();
                if (var5.field1219) {
                    var5.field1279 += var5.field1206;
                    var5.field1281 += var5.field1195;
                    var5.field1270 += var5.field1206;
                    var5.field1239 += var5.field1195;
                    var5.field1291 = 0;
                } else {
                    var5.field1279 += var5.field1273[0];
                    var5.field1281 += var5.field1287[0];
                    var5.field1270 += var5.field1273[0];
                    var5.field1239 += var5.field1287[0];
                    var5.field1291 = 1;
                }
                var5.field1275 = 0;
            }
            if ((var6 & 0x40) != 0) {
                int var24 = arg0.method6003();
                class270 var25 = (class270) class289.method2163(class270.method5880(), arg0.method5948());
                boolean var26 = arg0.method5994() == 1;
                int var27 = arg0.method5994();
                int var28 = arg0.field4158;
                if (var5.field1199 != null && var5.field1194 != null) {
                    boolean var29 = false;
                    if (var25.field3553 && Statics.field1508.method1512(var5.field1199)) {
                        var29 = true;
                    }
                    if (!var29 && client.field756 == 0 && !var5.field1205) {
                        field1385.field4158 = 0;
                        arg0.method6076(field1385.field4155, 0, var27);
                        field1385.field4158 = 0;
                        String var30 = class301.method4890(class304.method334(class250.method4183(field1385)));
                        var5.field1250 = var30.trim();
                        var5.field1254 = var24 >> 8;
                        var5.field1255 = var24 & 0xFF;
                        var5.field1253 = 150;
                        var5.field1251 = var26;
                        var5.field1249 = Statics.field1163 != var5 && var25.field3553 && client.field864 != "" && var30.toLowerCase().indexOf(client.field864) == -1;
                        int var31;
                        if (var25.field3552) {
                            var31 = var26 ? 91 : 1;
                        } else {
                            var31 = var26 ? 90 : 2;
                        }
                        if (var25.field3551 == -1) {
                            class111.method1459(var31, var5.field1199.method5338(), var30);
                        } else {
                            class111.method1459(var31, class106.method1795(var25.field3551) + var5.field1199.method5338(), var30);
                        }
                    }
                }
                arg0.field4158 = var27 + var28;
            }
            if ((var6 & 0x2) != 0) {
                int var32 = arg0.method5994();
                byte[] var33 = new byte[var32];
                class383 var34 = new class383(var33);
                arg0.method6076(var33, 0, var32);
                field1375[var4] = var34;
                var5.method1911(var34);
            }
            if ((var6 & 0x4) != 0) {
                int var35 = arg0.method6002();
                if (var35 == 65535) {
                    var35 = -1;
                }
                int var36 = arg0.method5994();
                client.method204(var5, var35, var36);
            }
            if ((var6 & 0x1000) != 0) {
                var7 = arg0.method5996();
            }
            if ((var6 & 0x20) != 0) {
                var5.field1250 = arg0.method5974();
                if (var5.field1250.charAt(0) == '~') {
                    var5.field1250 = var5.field1250.substring(1);
                    class111.method1459(2, var5.field1199.method5338(), var5.field1250);
                } else if (Statics.field1163 == var5) {
                    class111.method1459(2, var5.field1199.method5338(), var5.field1250);
                }
                var5.field1251 = false;
                var5.field1254 = 0;
                var5.field1255 = 0;
                var5.field1253 = 150;
            }
            if (var5.field1219) {
                if (var7 == 127) {
                    var5.method1923(var5.field1206, var5.field1195);
                } else {
                    byte var37;
                    if (var7 == -1) {
                        var37 = field1374[var4];
                    } else {
                        var37 = var7;
                    }
                    var5.method1934(var5.field1206, var5.field1195, var37);
                }
            }
        }
        if (arg0.field4158 - var2 != arg1) {
            throw new RuntimeException(arg0.field4158 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("bd.f(Lnb;I)V")
    public static final void method639(class382 arg0) {
        int var1 = 0;
        arg0.method5918();
        for (int var2 = 0; var2 < field1376; var2++) {
            int var3 = field1381[var2];
            if ((field1371[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1371[var3] = (byte) (field1371[var3] | 0x2);
                } else {
                    int var4 = arg0.method5921(1);
                    if (var4 == 0) {
                        int var5 = arg0.method5921(2);
                        int var6;
                        if (var5 == 0) {
                            var6 = 0;
                        } else if (var5 == 1) {
                            var6 = arg0.method5921(5);
                        } else if (var5 == 2) {
                            var6 = arg0.method5921(8);
                        } else {
                            var6 = arg0.method5921(11);
                        }
                        var1 = var6;
                        field1371[var3] = (byte) (field1371[var3] | 0x2);
                    } else {
                        method2845(arg0, var3);
                    }
                }
            }
        }
        arg0.method5922();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method5918();
        for (int var8 = 0; var8 < field1376; var8++) {
            int var9 = field1381[var8];
            if ((field1371[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1371[var9] = (byte) (field1371[var9] | 0x2);
                } else {
                    int var10 = arg0.method5921(1);
                    if (var10 == 0) {
                        int var11 = arg0.method5921(2);
                        int var12;
                        if (var11 == 0) {
                            var12 = 0;
                        } else if (var11 == 1) {
                            var12 = arg0.method5921(5);
                        } else if (var11 == 2) {
                            var12 = arg0.method5921(8);
                        } else {
                            var12 = arg0.method5921(11);
                        }
                        var1 = var12;
                        field1371[var9] = (byte) (field1371[var9] | 0x2);
                    } else {
                        method2845(arg0, var9);
                    }
                }
            }
        }
        arg0.method5922();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method5918();
        for (int var14 = 0; var14 < field1378; var14++) {
            int var15 = field1379[var14];
            if ((field1371[var15] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1371[var15] = (byte) (field1371[var15] | 0x2);
                } else {
                    int var16 = arg0.method5921(1);
                    if (var16 == 0) {
                        int var17 = arg0.method5921(2);
                        int var18;
                        if (var17 == 0) {
                            var18 = 0;
                        } else if (var17 == 1) {
                            var18 = arg0.method5921(5);
                        } else if (var17 == 2) {
                            var18 = arg0.method5921(8);
                        } else {
                            var18 = arg0.method5921(11);
                        }
                        var1 = var18;
                        field1371[var15] = (byte) (field1371[var15] | 0x2);
                    } else if (method2639(arg0, var15)) {
                        field1371[var15] = (byte) (field1371[var15] | 0x2);
                    }
                }
            }
        }
        arg0.method5922();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method5918();
        for (int var20 = 0; var20 < field1378; var20++) {
            int var21 = field1379[var20];
            if ((field1371[var21] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1371[var21] = (byte) (field1371[var21] | 0x2);
                } else {
                    int var22 = arg0.method5921(1);
                    if (var22 == 0) {
                        int var23 = arg0.method5921(2);
                        int var24;
                        if (var23 == 0) {
                            var24 = 0;
                        } else if (var23 == 1) {
                            var24 = arg0.method5921(5);
                        } else if (var23 == 2) {
                            var24 = arg0.method5921(8);
                        } else {
                            var24 = arg0.method5921(11);
                        }
                        var1 = var24;
                        field1371[var21] = (byte) (field1371[var21] | 0x2);
                    } else if (method2639(arg0, var21)) {
                        field1371[var21] = (byte) (field1371[var21] | 0x2);
                    }
                }
            }
        }
        arg0.method5922();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field1376 = 0;
        field1378 = 0;
        for (int var26 = 1; var26 < 2048; var26++) {
            field1371[var26] = (byte) (field1371[var26] >> 1);
            class98 var27 = client.field830[var26];
            if (var27 == null) {
                field1379[++field1378 - 1] = var26;
            } else {
                field1381[++field1376 - 1] = var26;
            }
        }
    }

    @ObfuscatedName("eq.y(Lnb;IB)V")
    public static void method2845(class382 arg0, int arg1) {
        boolean var2 = arg0.method5921(1) == 1;
        if (var2) {
            field1377[++field1383 - 1] = arg1;
        }
        int var3 = arg0.method5921(2);
        class98 var4 = client.field830[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field1219 = false;
            } else if (client.field759 == arg1) {
                throw new RuntimeException();
            } else {
                field1372[arg1] = (Statics.field458 + var4.field1287[0] >> 13) + (Statics.field2512 + var4.field1273[0] >> 13 << 14) + (var4.field1214 << 28);
                if (var4.field1265 == -1) {
                    field1373[arg1] = var4.field1267;
                } else {
                    field1373[arg1] = var4.field1265;
                }
                field1380[arg1] = var4.field1289;
                client.field830[arg1] = null;
                if (arg0.method5921(1) != 0) {
                    method2639(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method5921(3);
            int var6 = var4.field1273[0];
            int var7 = var4.field1287[0];
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
            if (client.field759 == arg1 && var4.field1238 < 1536 || var4.field1237 < 1536 || var4.field1238 >= 11776 || var4.field1237 >= 11776) {
                var4.method1923(var6, var7);
                var4.field1219 = false;
            } else if (var2) {
                var4.field1219 = true;
                var4.field1206 = var6;
                var4.field1195 = var7;
            } else {
                var4.field1219 = false;
                var4.method1934(var6, var7, field1374[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method5921(4);
            int var9 = var4.field1273[0];
            int var10 = var4.field1287[0];
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
            if (client.field759 == arg1 && var4.field1238 < 1536 || var4.field1237 < 1536 || var4.field1238 >= 11776 || var4.field1237 >= 11776) {
                var4.method1923(var9, var10);
                var4.field1219 = false;
            } else if (var2) {
                var4.field1219 = true;
                var4.field1206 = var9;
                var4.field1195 = var10;
            } else {
                var4.field1219 = false;
                var4.method1934(var9, var10, field1374[arg1]);
            }
        } else {
            int var11 = arg0.method5921(1);
            if (var11 == 0) {
                int var12 = arg0.method5921(12);
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
                int var17 = var4.field1287[0] + var15;
                if (client.field759 == arg1 && var4.field1238 < 1536 || var4.field1237 < 1536 || var4.field1238 >= 11776 || var4.field1237 >= 11776) {
                    var4.method1923(var16, var17);
                    var4.field1219 = false;
                } else if (var2) {
                    var4.field1219 = true;
                    var4.field1206 = var16;
                    var4.field1195 = var17;
                } else {
                    var4.field1219 = false;
                    var4.method1934(var16, var17, field1374[arg1]);
                }
                var4.field1214 = (byte) (var4.field1214 + var13 & 0x3);
                if (client.field759 == arg1) {
                    Statics.field196 = var4.field1214;
                }
            } else {
                int var18 = arg0.method5921(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field2512 + var4.field1273[0] + var20 & 0x3FFF) - Statics.field2512;
                int var23 = (Statics.field458 + var4.field1287[0] + var21 & 0x3FFF) - Statics.field458;
                if (client.field759 == arg1 && var4.field1238 < 1536 || var4.field1237 < 1536 || var4.field1238 >= 11776 || var4.field1237 >= 11776) {
                    var4.method1923(var22, var23);
                    var4.field1219 = false;
                } else if (var2) {
                    var4.field1219 = true;
                    var4.field1206 = var22;
                    var4.field1195 = var23;
                } else {
                    var4.field1219 = false;
                    var4.method1934(var22, var23, field1374[arg1]);
                }
                var4.field1214 = (byte) (var4.field1214 + var19 & 0x3);
                if (client.field759 == arg1) {
                    Statics.field196 = var4.field1214;
                }
            }
        }
    }

    @ObfuscatedName("eh.p(Lnb;II)Z")
    public static boolean method2639(class382 arg0, int arg1) {
        int var2 = arg0.method5921(2);
        if (var2 == 0) {
            if (arg0.method5921(1) != 0) {
                method2639(arg0, arg1);
            }
            int var3 = arg0.method5921(13);
            int var4 = arg0.method5921(13);
            boolean var5 = arg0.method5921(1) == 1;
            if (var5) {
                field1377[++field1383 - 1] = arg1;
            }
            if (client.field830[arg1] != null) {
                throw new RuntimeException();
            }
            class98 var6 = client.field830[arg1] = new class98();
            var6.field1193 = arg1;
            if (field1375[arg1] != null) {
                var6.method1911(field1375[arg1]);
            }
            var6.field1267 = field1373[arg1];
            var6.field1289 = field1380[arg1];
            int var7 = field1372[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field1247[0] = field1374[arg1];
            var6.field1214 = (byte) var8;
            var6.method1923((var9 << 13) + var3 - Statics.field2512, (var10 << 13) + var4 - Statics.field458);
            var6.field1219 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method5921(2);
            int var12 = field1372[arg1];
            field1372[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method5921(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1372[arg1];
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
            field1372[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method5921(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1372[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1372[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("ce.j(I)V")
    public static void method1919() {
        field1376 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field1375[var0] = null;
            field1374[var0] = 1;
        }
    }
}
