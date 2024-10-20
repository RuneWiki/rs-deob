package deob;

@ObfuscatedName("ds")
public class class110 {

    @ObfuscatedName("ds.v")
    public static byte[] field1373 = new byte[2048];

    @ObfuscatedName("ds.y")
    public static byte[] field1362 = new byte[2048];

    @ObfuscatedName("ds.j")
    public static class384[] field1363 = new class384[2048];

    @ObfuscatedName("ds.o")
    public static int field1359 = 0;

    @ObfuscatedName("ds.m")
    public static int[] field1365 = new int[2048];

    @ObfuscatedName("ds.r")
    public static int field1366 = 0;

    @ObfuscatedName("ds.h")
    public static int[] field1367 = new int[2048];

    @ObfuscatedName("ds.d")
    public static int[] field1364 = new int[2048];

    @ObfuscatedName("ds.z")
    public static int[] field1369 = new int[2048];

    @ObfuscatedName("ds.b")
    public static int[] field1370 = new int[2048];

    @ObfuscatedName("ds.i")
    public static int field1371 = 0;

    @ObfuscatedName("ds.k")
    public static int[] field1372 = new int[2048];

    @ObfuscatedName("ds.g")
    public static class384 field1374 = new class384(new byte[5000]);

    public class110() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("r.f(Lns;I)V")
    public static final void method60(class383 arg0) {
        arg0.method5842();
        int var1 = client.field720;
        class98 var2 = Statics.field3197 = client.field739[var1] = new class98();
        var2.field1193 = var1;
        int var3 = arg0.method5850(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field1278[0] = var5 - Statics.field127;
        var2.field1242 = (var2.field1278[0] << 7) + (var2.method1954() << 6);
        var2.field1279[0] = var6 - Statics.field2092;
        var2.field1223 = (var2.field1279[0] << 7) + (var2.method1954() << 6);
        Statics.field438 = var2.field1197 = var4;
        if (field1363[var1] != null) {
            var2.method1943(field1363[var1]);
        }
        field1359 = 0;
        field1365[++field1359 - 1] = var1;
        field1373[var1] = 0;
        field1366 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method5850(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1364[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1369[var7] = 0;
                field1370[var7] = -1;
                field1367[++field1366 - 1] = var7;
                field1373[var7] = 0;
            }
        }
        arg0.method5851();
    }

    @ObfuscatedName("dr.e(Lns;II)V")
    public static final void method2278(class383 arg0, int arg1) {
        int var2 = arg0.field4161;
        field1371 = 0;
        method4586(arg0);
        for (int var3 = 0; var3 < field1371; var3++) {
            int var4 = field1372[var3];
            class98 var5 = client.field739[var4];
            int var6 = arg0.method5902();
            if ((var6 & 0x80) != 0) {
                var6 += arg0.method5902() << 8;
            }
            method2283(arg0, var4, var5, var6);
        }
        if (arg0.field4161 - var2 != arg1) {
            throw new RuntimeException(arg0.field4161 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("jp.v(Lns;B)V")
    public static final void method4586(class383 arg0) {
        int var1 = 0;
        arg0.method5842();
        for (int var2 = 0; var2 < field1359; var2++) {
            int var3 = field1365[var2];
            if ((field1373[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1373[var3] = (byte) (field1373[var3] | 0x2);
                } else {
                    int var4 = arg0.method5850(1);
                    if (var4 == 0) {
                        var1 = method4274(arg0);
                        field1373[var3] = (byte) (field1373[var3] | 0x2);
                    } else {
                        method4633(arg0, var3);
                    }
                }
            }
        }
        arg0.method5851();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method5842();
        for (int var5 = 0; var5 < field1359; var5++) {
            int var6 = field1365[var5];
            if ((field1373[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1373[var6] = (byte) (field1373[var6] | 0x2);
                } else {
                    int var7 = arg0.method5850(1);
                    if (var7 == 0) {
                        var1 = method4274(arg0);
                        field1373[var6] = (byte) (field1373[var6] | 0x2);
                    } else {
                        method4633(arg0, var6);
                    }
                }
            }
        }
        arg0.method5851();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method5842();
        for (int var8 = 0; var8 < field1366; var8++) {
            int var9 = field1367[var8];
            if ((field1373[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1373[var9] = (byte) (field1373[var9] | 0x2);
                } else {
                    int var10 = arg0.method5850(1);
                    if (var10 == 0) {
                        var1 = method4274(arg0);
                        field1373[var9] = (byte) (field1373[var9] | 0x2);
                    } else if (method260(arg0, var9)) {
                        field1373[var9] = (byte) (field1373[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method5851();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method5842();
        for (int var11 = 0; var11 < field1366; var11++) {
            int var12 = field1367[var11];
            if ((field1373[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1373[var12] = (byte) (field1373[var12] | 0x2);
                } else {
                    int var13 = arg0.method5850(1);
                    if (var13 == 0) {
                        var1 = method4274(arg0);
                        field1373[var12] = (byte) (field1373[var12] | 0x2);
                    } else if (method260(arg0, var12)) {
                        field1373[var12] = (byte) (field1373[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method5851();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field1359 = 0;
        field1366 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            field1373[var14] = (byte) (field1373[var14] >> 1);
            class98 var15 = client.field739[var14];
            if (var15 == null) {
                field1367[++field1366 - 1] = var14;
            } else {
                field1365[++field1359 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("ip.y(Lns;I)I")
    public static int method4274(class383 arg0) {
        int var1 = arg0.method5850(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method5850(5);
        } else if (var1 == 2) {
            var2 = arg0.method5850(8);
        } else {
            var2 = arg0.method5850(11);
        }
        return var2;
    }

    @ObfuscatedName("jz.j(Lns;II)V")
    public static void method4633(class383 arg0, int arg1) {
        boolean var2 = arg0.method5850(1) == 1;
        if (var2) {
            field1372[++field1371 - 1] = arg1;
        }
        int var3 = arg0.method5850(2);
        class98 var4 = client.field739[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field1202 = false;
            } else if (client.field720 == arg1) {
                throw new RuntimeException();
            } else {
                field1364[arg1] = (Statics.field2092 + var4.field1279[0] >> 13) + (Statics.field127 + var4.field1278[0] >> 13 << 14) + (var4.field1197 << 28);
                if (var4.field1281 == -1) {
                    field1369[arg1] = var4.field1274;
                } else {
                    field1369[arg1] = var4.field1281;
                }
                field1370[arg1] = var4.field1231;
                client.field739[arg1] = null;
                if (arg0.method5850(1) != 0) {
                    method260(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method5850(3);
            int var6 = var4.field1278[0];
            int var7 = var4.field1279[0];
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
            if (client.field720 == arg1 && var4.field1242 < 1536 || var4.field1223 < 1536 || var4.field1242 >= 11776 || var4.field1223 >= 11776) {
                var4.method1978(var6, var7);
                var4.field1202 = false;
            } else if (var2) {
                var4.field1202 = true;
                var4.field1203 = var6;
                var4.field1181 = var7;
            } else {
                var4.field1202 = false;
                var4.method1956(var6, var7, field1362[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method5850(4);
            int var9 = var4.field1278[0];
            int var10 = var4.field1279[0];
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
            if (client.field720 == arg1 && var4.field1242 < 1536 || var4.field1223 < 1536 || var4.field1242 >= 11776 || var4.field1223 >= 11776) {
                var4.method1978(var9, var10);
                var4.field1202 = false;
            } else if (var2) {
                var4.field1202 = true;
                var4.field1203 = var9;
                var4.field1181 = var10;
            } else {
                var4.field1202 = false;
                var4.method1956(var9, var10, field1362[arg1]);
            }
        } else {
            int var11 = arg0.method5850(1);
            if (var11 == 0) {
                int var12 = arg0.method5850(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field1278[0] + var14;
                int var17 = var4.field1279[0] + var15;
                if (client.field720 == arg1 && var4.field1242 < 1536 || var4.field1223 < 1536 || var4.field1242 >= 11776 || var4.field1223 >= 11776) {
                    var4.method1978(var16, var17);
                    var4.field1202 = false;
                } else if (var2) {
                    var4.field1202 = true;
                    var4.field1203 = var16;
                    var4.field1181 = var17;
                } else {
                    var4.field1202 = false;
                    var4.method1956(var16, var17, field1362[arg1]);
                }
                var4.field1197 = (byte) (var4.field1197 + var13 & 0x3);
                if (client.field720 == arg1) {
                    Statics.field438 = var4.field1197;
                }
            } else {
                int var18 = arg0.method5850(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field127 + var4.field1278[0] + var20 & 0x3FFF) - Statics.field127;
                int var23 = (Statics.field2092 + var4.field1279[0] + var21 & 0x3FFF) - Statics.field2092;
                if (client.field720 == arg1 && var4.field1242 < 1536 || var4.field1223 < 1536 || var4.field1242 >= 11776 || var4.field1223 >= 11776) {
                    var4.method1978(var22, var23);
                    var4.field1202 = false;
                } else if (var2) {
                    var4.field1202 = true;
                    var4.field1203 = var22;
                    var4.field1181 = var23;
                } else {
                    var4.field1202 = false;
                    var4.method1956(var22, var23, field1362[arg1]);
                }
                var4.field1197 = (byte) (var4.field1197 + var19 & 0x3);
                if (client.field720 == arg1) {
                    Statics.field438 = var4.field1197;
                }
            }
        }
    }

    @ObfuscatedName("aq.o(Lns;II)Z")
    public static boolean method260(class383 arg0, int arg1) {
        int var2 = arg0.method5850(2);
        if (var2 == 0) {
            if (arg0.method5850(1) != 0) {
                method260(arg0, arg1);
            }
            int var3 = arg0.method5850(13);
            int var4 = arg0.method5850(13);
            boolean var5 = arg0.method5850(1) == 1;
            if (var5) {
                field1372[++field1371 - 1] = arg1;
            }
            if (client.field739[arg1] != null) {
                throw new RuntimeException();
            }
            class98 var6 = client.field739[arg1] = new class98();
            var6.field1193 = arg1;
            if (field1363[arg1] != null) {
                var6.method1943(field1363[arg1]);
            }
            var6.field1274 = field1369[arg1];
            var6.field1231 = field1370[arg1];
            int var7 = field1364[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field1280[0] = field1362[arg1];
            var6.field1197 = (byte) var8;
            var6.method1978((var9 << 13) + var3 - Statics.field127, (var10 << 13) + var4 - Statics.field2092);
            var6.field1202 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method5850(2);
            int var12 = field1364[arg1];
            field1364[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method5850(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1364[arg1];
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
            field1364[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method5850(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1364[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1364[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("dr.m(Lns;ILcj;II)V")
    public static final void method2283(class383 arg0, int arg1, class98 arg2, int arg3) {
        byte var4 = -1;
        if ((arg3 & 0x4) != 0) {
            int var5 = arg0.method5902();
            byte[] var6 = new byte[var5];
            class384 var7 = new class384(var6);
            arg0.method6105(var6, 0, var5);
            field1363[arg1] = var7;
            arg2.method1943(var7);
        }
        if ((arg3 & 0x2) != 0) {
            int var8 = arg0.method5902();
            if (var8 > 0) {
                for (int var9 = 0; var9 < var8; var9++) {
                    int var10 = -1;
                    int var11 = -1;
                    int var12 = -1;
                    int var13 = arg0.method5911();
                    if (var13 == 32767) {
                        var13 = arg0.method5911();
                        var11 = arg0.method5911();
                        var10 = arg0.method5911();
                        var12 = arg0.method5911();
                    } else if (var13 == 32766) {
                        var13 = -1;
                    } else {
                        var11 = arg0.method5911();
                    }
                    int var14 = arg0.method5911();
                    arg2.method2001(var13, var11, var10, var12, client.field631, var14);
                }
            }
            int var15 = arg0.method5927();
            if (var15 > 0) {
                for (int var16 = 0; var16 < var15; var16++) {
                    int var17 = arg0.method5911();
                    int var18 = arg0.method5911();
                    if (var18 == 32767) {
                        arg2.method2012(var17);
                    } else {
                        int var19 = arg0.method5911();
                        int var20 = arg0.method5927();
                        int var21 = var18 > 0 ? arg0.method5902() : var20;
                        arg2.method2002(var17, client.field631, var18, var19, var20, var21);
                    }
                }
            }
        }
        if ((arg3 & 0x800) != 0) {
            for (int var22 = 0; var22 < 3; var22++) {
                arg2.field1180[var22] = arg0.method5906();
            }
        }
        if ((arg3 & 0x200) != 0) {
            arg2.field1260 = arg0.method5899();
            int var23 = arg0.method5959();
            arg2.field1264 = var23 >> 16;
            arg2.field1263 = (var23 & 0xFFFF) + client.field631;
            arg2.field1261 = 0;
            arg2.field1238 = 0;
            if (arg2.field1263 > client.field631) {
                arg2.field1261 = -1;
            }
            if (arg2.field1260 == 65535) {
                arg2.field1260 = -1;
            }
        }
        if ((arg3 & 0x8) != 0) {
            arg2.field1232 = arg0.method5906();
            if (arg2.field1232.charAt(0) == '~') {
                arg2.field1232 = arg2.field1232.substring(1);
                class112.method2289(2, arg2.field1175.method5264(), arg2.field1232);
            } else if (Statics.field3197 == arg2) {
                class112.method2289(2, arg2.field1175.method5264(), arg2.field1232);
            }
            arg2.field1237 = false;
            arg2.field1240 = 0;
            arg2.field1241 = 0;
            arg2.field1239 = 150;
        }
        if ((arg3 & 0x40) != 0) {
            int var24 = arg0.method5937();
            class271 var25 = (class271) class290.method2391(class271.method2098(), arg0.method5928());
            boolean var26 = arg0.method5928() == 1;
            int var27 = arg0.method5928();
            int var28 = arg0.field4161;
            if (arg2.field1175 != null && arg2.field1176 != null) {
                boolean var29 = false;
                if (var25.field3549 && Statics.field288.method1553(arg2.field1175)) {
                    var29 = true;
                }
                if (!var29 && client.field630 == 0 && !arg2.field1189) {
                    field1374.field4161 = 0;
                    arg0.method6105(field1374.field4160, 0, var27);
                    field1374.field4161 = 0;
                    String var30 = class302.method4893(class305.method4608(class251.method2987(field1374)));
                    arg2.field1232 = var30.trim();
                    arg2.field1240 = var24 >> 8;
                    arg2.field1241 = var24 & 0xFF;
                    arg2.field1239 = 150;
                    arg2.field1237 = var26;
                    arg2.field1254 = Statics.field3197 != arg2 && var25.field3549 && client.field643 != "" && var30.toLowerCase().indexOf(client.field643) == -1;
                    int var31;
                    if (var25.field3548) {
                        var31 = var26 ? 91 : 1;
                    } else {
                        var31 = var26 ? 90 : 2;
                    }
                    if (var25.field3547 == -1) {
                        class112.method2289(var31, arg2.field1175.method5264(), var30);
                    } else {
                        class112.method2289(var31, class106.method4226(var25.field3547) + arg2.field1175.method5264(), var30);
                    }
                }
            }
            arg0.field4161 = var27 + var28;
        }
        if ((arg3 & 0x10) != 0) {
            arg2.field1231 = arg0.method5936();
            if (arg2.field1231 == 65535) {
                arg2.field1231 = -1;
            }
        }
        if ((arg3 & 0x1000) != 0) {
            field1362[arg1] = arg0.method5903();
        }
        if ((arg3 & 0x20) != 0) {
            int var32 = arg0.method5935();
            if (var32 == 65535) {
                var32 = -1;
            }
            int var33 = arg0.method5902();
            client.method1542(arg2, var32, var33);
        }
        if ((arg3 & 0x2000) != 0) {
            arg2.field1265 = arg0.method5968();
            arg2.field1269 = arg0.method5966();
            arg2.field1266 = arg0.method5968();
            arg2.field1268 = arg0.method5966();
            arg2.field1277 = arg0.method5937() + client.field631;
            arg2.field1270 = arg0.method5936() + client.field631;
            arg2.field1271 = arg0.method5937();
            if (arg2.field1202) {
                arg2.field1265 += arg2.field1203;
                arg2.field1269 += arg2.field1181;
                arg2.field1266 += arg2.field1203;
                arg2.field1268 += arg2.field1181;
                arg2.field1228 = 0;
            } else {
                arg2.field1265 += arg2.field1278[0];
                arg2.field1269 += arg2.field1279[0];
                arg2.field1266 += arg2.field1278[0];
                arg2.field1268 += arg2.field1279[0];
                arg2.field1228 = 1;
            }
            arg2.field1282 = 0;
        }
        if ((arg3 & 0x100) != 0) {
            var4 = arg0.method5903();
        }
        if ((arg3 & 0x1) != 0) {
            arg2.field1281 = arg0.method5936();
            if (arg2.field1228 == 0) {
                arg2.field1274 = arg2.field1281;
                arg2.field1281 = -1;
            }
        }
        if (!arg2.field1202) {
            return;
        }
        if (var4 == 127) {
            arg2.method1978(arg2.field1203, arg2.field1181);
            return;
        }
        byte var34;
        if (var4 == -1) {
            var34 = field1362[arg1];
        } else {
            var34 = var4;
        }
        arg2.method1956(arg2.field1203, arg2.field1181, var34);
    }

    @ObfuscatedName("bz.r(I)V")
    public static void method744() {
        field1359 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field1363[var0] = null;
            field1362[var0] = 1;
        }
    }
}
