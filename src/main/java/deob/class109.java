package deob;

@ObfuscatedName("dq")
public class class109 {

    @ObfuscatedName("dq.u")
    public static byte[] field1351 = new byte[2048];

    @ObfuscatedName("dq.p")
    public static byte[] field1352 = new byte[2048];

    @ObfuscatedName("dq.b")
    public static class382[] field1353 = new class382[2048];

    @ObfuscatedName("dq.e")
    public static int field1362 = 0;

    @ObfuscatedName("dq.k")
    public static int[] field1354 = new int[2048];

    @ObfuscatedName("dq.g")
    public static int field1356 = 0;

    @ObfuscatedName("dq.h")
    public static int[] field1357 = new int[2048];

    @ObfuscatedName("dq.n")
    public static int[] field1365 = new int[2048];

    @ObfuscatedName("dq.l")
    public static int[] field1349 = new int[2048];

    @ObfuscatedName("dq.m")
    public static int[] field1360 = new int[2048];

    @ObfuscatedName("dq.d")
    public static int field1355 = 0;

    @ObfuscatedName("dq.c")
    public static int[] field1358 = new int[2048];

    @ObfuscatedName("dq.j")
    public static class382 field1363 = new class382(new byte[5000]);

    public class109() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ni.f(Lnk;B)V")
    public static final void method5699(class381 arg0) {
        arg0.method5807();
        int var1 = client.field700;
        class98 var2 = Statics.field1374 = client.field849[var1] = new class98();
        var2.field1187 = var1;
        int var3 = arg0.method5801(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field1265[0] = var5 - Statics.field1795;
        var2.field1232 = (var2.field1265[0] << 7) + (var2.method1853() << 6);
        var2.field1266[0] = var6 - Statics.field1892;
        var2.field1210 = (var2.field1266[0] << 7) + (var2.method1853() << 6);
        Statics.field201 = var2.field1186 = var4;
        if (field1353[var1] != null) {
            var2.method1846(field1353[var1]);
        }
        field1362 = 0;
        field1354[++field1362 - 1] = var1;
        field1351[var1] = 0;
        field1356 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method5801(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1365[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1349[var7] = 0;
                field1360[var7] = -1;
                field1357[++field1356 - 1] = var7;
                field1351[var7] = 0;
            }
        }
        arg0.method5804();
    }

    @ObfuscatedName("m.o(Lnk;II)V")
    public static final void method150(class381 arg0, int arg1) {
        int var2 = arg0.field4155;
        field1355 = 0;
        int var3 = 0;
        arg0.method5807();
        for (int var4 = 0; var4 < field1362; var4++) {
            int var5 = field1354[var4];
            if ((field1351[var5] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field1351[var5] = (byte) (field1351[var5] | 0x2);
                } else {
                    int var6 = arg0.method5801(1);
                    if (var6 == 0) {
                        var3 = method4127(arg0);
                        field1351[var5] = (byte) (field1351[var5] | 0x2);
                    } else {
                        method1661(arg0, var5);
                    }
                }
            }
        }
        arg0.method5804();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method5807();
        for (int var7 = 0; var7 < field1362; var7++) {
            int var8 = field1354[var7];
            if ((field1351[var8] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field1351[var8] = (byte) (field1351[var8] | 0x2);
                } else {
                    int var9 = arg0.method5801(1);
                    if (var9 == 0) {
                        var3 = method4127(arg0);
                        field1351[var8] = (byte) (field1351[var8] | 0x2);
                    } else {
                        method1661(arg0, var8);
                    }
                }
            }
        }
        arg0.method5804();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method5807();
        for (int var10 = 0; var10 < field1356; var10++) {
            int var11 = field1357[var10];
            if ((field1351[var11] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field1351[var11] = (byte) (field1351[var11] | 0x2);
                } else {
                    int var12 = arg0.method5801(1);
                    if (var12 == 0) {
                        var3 = method4127(arg0);
                        field1351[var11] = (byte) (field1351[var11] | 0x2);
                    } else if (method2726(arg0, var11)) {
                        field1351[var11] = (byte) (field1351[var11] | 0x2);
                    }
                }
            }
        }
        arg0.method5804();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method5807();
        for (int var13 = 0; var13 < field1356; var13++) {
            int var14 = field1357[var13];
            if ((field1351[var14] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field1351[var14] = (byte) (field1351[var14] | 0x2);
                } else {
                    int var15 = arg0.method5801(1);
                    if (var15 == 0) {
                        var3 = method4127(arg0);
                        field1351[var14] = (byte) (field1351[var14] | 0x2);
                    } else if (method2726(arg0, var14)) {
                        field1351[var14] = (byte) (field1351[var14] | 0x2);
                    }
                }
            }
        }
        arg0.method5804();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        field1362 = 0;
        field1356 = 0;
        for (int var16 = 1; var16 < 2048; var16++) {
            field1351[var16] = (byte) (field1351[var16] >> 1);
            class98 var17 = client.field849[var16];
            if (var17 == null) {
                field1357[++field1356 - 1] = var16;
            } else {
                field1354[++field1362 - 1] = var16;
            }
        }
        method660(arg0);
        if (arg0.field4155 - var2 != arg1) {
            throw new RuntimeException(arg0.field4155 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("jj.u(Lnk;I)I")
    public static int method4127(class381 arg0) {
        int var1 = arg0.method5801(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method5801(5);
        } else if (var1 == 2) {
            var2 = arg0.method5801(8);
        } else {
            var2 = arg0.method5801(11);
        }
        return var2;
    }

    @ObfuscatedName("cx.p(Lnk;II)V")
    public static void method1661(class381 arg0, int arg1) {
        boolean var2 = arg0.method5801(1) == 1;
        if (var2) {
            field1358[++field1355 - 1] = arg1;
        }
        int var3 = arg0.method5801(2);
        class98 var4 = client.field849[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field1190 = false;
            } else if (client.field700 == arg1) {
                throw new RuntimeException();
            } else {
                field1365[arg1] = (Statics.field1892 + var4.field1266[0] >> 13) + (Statics.field1795 + var4.field1265[0] >> 13 << 14) + (var4.field1186 << 28);
                if (var4.field1238 == -1) {
                    field1349[arg1] = var4.field1226;
                } else {
                    field1349[arg1] = var4.field1238;
                }
                field1360[arg1] = var4.field1236;
                client.field849[arg1] = null;
                if (arg0.method5801(1) != 0) {
                    method2726(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method5801(3);
            int var6 = var4.field1265[0];
            int var7 = var4.field1266[0];
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
            if (client.field700 == arg1 && var4.field1232 < 1536 || var4.field1210 < 1536 || var4.field1232 >= 11776 || var4.field1210 >= 11776) {
                var4.method1855(var6, var7);
                var4.field1190 = false;
            } else if (var2) {
                var4.field1190 = true;
                var4.field1179 = var6;
                var4.field1192 = var7;
            } else {
                var4.field1190 = false;
                var4.method1854(var6, var7, field1352[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method5801(4);
            int var9 = var4.field1265[0];
            int var10 = var4.field1266[0];
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
            if (client.field700 == arg1 && var4.field1232 < 1536 || var4.field1210 < 1536 || var4.field1232 >= 11776 || var4.field1210 >= 11776) {
                var4.method1855(var9, var10);
                var4.field1190 = false;
            } else if (var2) {
                var4.field1190 = true;
                var4.field1179 = var9;
                var4.field1192 = var10;
            } else {
                var4.field1190 = false;
                var4.method1854(var9, var10, field1352[arg1]);
            }
        } else {
            int var11 = arg0.method5801(1);
            if (var11 == 0) {
                int var12 = arg0.method5801(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field1265[0] + var14;
                int var17 = var4.field1266[0] + var15;
                if (client.field700 == arg1 && var4.field1232 < 1536 || var4.field1210 < 1536 || var4.field1232 >= 11776 || var4.field1210 >= 11776) {
                    var4.method1855(var16, var17);
                    var4.field1190 = false;
                } else if (var2) {
                    var4.field1190 = true;
                    var4.field1179 = var16;
                    var4.field1192 = var17;
                } else {
                    var4.field1190 = false;
                    var4.method1854(var16, var17, field1352[arg1]);
                }
                var4.field1186 = (byte) (var4.field1186 + var13 & 0x3);
                if (client.field700 == arg1) {
                    Statics.field201 = var4.field1186;
                }
            } else {
                int var18 = arg0.method5801(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field1795 + var4.field1265[0] + var20 & 0x3FFF) - Statics.field1795;
                int var23 = (Statics.field1892 + var4.field1266[0] + var21 & 0x3FFF) - Statics.field1892;
                if (client.field700 == arg1 && var4.field1232 < 1536 || var4.field1210 < 1536 || var4.field1232 >= 11776 || var4.field1210 >= 11776) {
                    var4.method1855(var22, var23);
                    var4.field1190 = false;
                } else if (var2) {
                    var4.field1190 = true;
                    var4.field1179 = var22;
                    var4.field1192 = var23;
                } else {
                    var4.field1190 = false;
                    var4.method1854(var22, var23, field1352[arg1]);
                }
                var4.field1186 = (byte) (var4.field1186 + var19 & 0x3);
                if (client.field700 == arg1) {
                    Statics.field201 = var4.field1186;
                }
            }
        }
    }

    @ObfuscatedName("ej.b(Lnk;IB)Z")
    public static boolean method2726(class381 arg0, int arg1) {
        int var2 = arg0.method5801(2);
        if (var2 == 0) {
            if (arg0.method5801(1) != 0) {
                method2726(arg0, arg1);
            }
            int var3 = arg0.method5801(13);
            int var4 = arg0.method5801(13);
            boolean var5 = arg0.method5801(1) == 1;
            if (var5) {
                field1358[++field1355 - 1] = arg1;
            }
            if (client.field849[arg1] != null) {
                throw new RuntimeException();
            }
            class98 var6 = client.field849[arg1] = new class98();
            var6.field1187 = arg1;
            if (field1353[arg1] != null) {
                var6.method1846(field1353[arg1]);
            }
            var6.field1226 = field1349[arg1];
            var6.field1236 = field1360[arg1];
            int var7 = field1365[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field1267[0] = field1352[arg1];
            var6.field1186 = (byte) var8;
            var6.method1855((var9 << 13) + var3 - Statics.field1795, (var10 << 13) + var4 - Statics.field1892);
            var6.field1190 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method5801(2);
            int var12 = field1365[arg1];
            field1365[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method5801(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1365[arg1];
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
            field1365[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method5801(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1365[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1365[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("bh.e(Lnk;I)V")
    public static final void method660(class381 arg0) {
        for (int var1 = 0; var1 < field1355; var1++) {
            int var2 = field1358[var1];
            class98 var3 = client.field849[var2];
            int var4 = arg0.method5856();
            if ((var4 & 0x4) != 0) {
                var4 += arg0.method5856() << 8;
            }
            byte var5 = -1;
            if ((var4 & 0x10) != 0) {
                int var6 = arg0.method5886();
                if (var6 > 0) {
                    for (int var7 = 0; var7 < var6; var7++) {
                        int var8 = -1;
                        int var9 = -1;
                        int var10 = -1;
                        int var11 = arg0.method5846();
                        if (var11 == 32767) {
                            var11 = arg0.method5846();
                            var9 = arg0.method5846();
                            var8 = arg0.method5846();
                            var10 = arg0.method5846();
                        } else if (var11 == 32766) {
                            var11 = -1;
                        } else {
                            var9 = arg0.method5846();
                        }
                        int var12 = arg0.method5846();
                        var3.method1887(var11, var9, var8, var10, client.field611, var12);
                    }
                }
                int var13 = arg0.method5886();
                if (var13 > 0) {
                    for (int var14 = 0; var14 < var13; var14++) {
                        int var15 = arg0.method5846();
                        int var16 = arg0.method5846();
                        if (var16 == 32767) {
                            var3.method1889(var15);
                        } else {
                            int var17 = arg0.method5846();
                            int var18 = arg0.method5886();
                            int var19 = var16 > 0 ? arg0.method5885() : var18;
                            var3.method1890(var15, client.field611, var16, var17, var18, var19);
                        }
                    }
                }
            }
            if ((var4 & 0x2) != 0) {
                var3.field1236 = arg0.method5893();
                if (var3.field1236 == 65535) {
                    var3.field1236 = -1;
                }
            }
            if ((var4 & 0x2000) != 0) {
                for (int var20 = 0; var20 < 3; var20++) {
                    var3.field1165[var20] = arg0.method5865();
                }
            }
            if ((var4 & 0x8) != 0) {
                int var21 = arg0.method5886();
                byte[] var22 = new byte[var21];
                class382 var23 = new class382(var22);
                arg0.method5866(var22, 0, var21);
                field1353[var2] = var23;
                var3.method1846(var23);
            }
            if ((var4 & 0x200) != 0) {
                field1352[var2] = arg0.method5860();
            }
            if ((var4 & 0x40) != 0) {
                var3.field1238 = arg0.method6042();
                if (var3.field1264 == 0) {
                    var3.field1226 = var3.field1238;
                    var3.field1238 = -1;
                }
            }
            if ((var4 & 0x100) != 0) {
                var3.field1241 = arg0.method5954();
                var3.field1254 = arg0.method5888();
                var3.field1253 = arg0.method6045();
                var3.field1240 = arg0.method5888();
                var3.field1256 = arg0.method5893() + client.field611;
                var3.field1269 = arg0.method6042() + client.field611;
                var3.field1214 = arg0.method5893();
                if (var3.field1190) {
                    var3.field1241 += var3.field1179;
                    var3.field1254 += var3.field1192;
                    var3.field1253 += var3.field1179;
                    var3.field1240 += var3.field1192;
                    var3.field1264 = 0;
                } else {
                    var3.field1241 += var3.field1265[0];
                    var3.field1254 += var3.field1266[0];
                    var3.field1253 += var3.field1265[0];
                    var3.field1240 += var3.field1266[0];
                    var3.field1264 = 1;
                }
                var3.field1225 = 0;
            }
            if ((var4 & 0x80) != 0) {
                int var24 = arg0.method5858();
                class248 var25 = (class248) class267.method2139(class248.method3344(), arg0.method5856());
                boolean var26 = arg0.method5886() == 1;
                int var27 = arg0.method5885();
                int var28 = arg0.field4155;
                if (var3.field1183 != null && var3.field1166 != null) {
                    boolean var29 = false;
                    if (var25.field3231 && Statics.field118.method1468(var3.field1183)) {
                        var29 = true;
                    }
                    if (!var29 && client.field717 == 0 && !var3.field1185) {
                        field1363.field4155 = 0;
                        arg0.method5906(field1363.field4153, 0, var27);
                        field1363.field4155 = 0;
                        String var30 = class300.method4804(class303.method4054(class228.method164(field1363)));
                        var3.field1223 = var30.trim();
                        var3.field1227 = var24 >> 8;
                        var3.field1228 = var24 & 0xFF;
                        var3.field1242 = 150;
                        var3.field1224 = var26;
                        var3.field1209 = Statics.field1374 != var3 && var25.field3231 && client.field825 != "" && var30.toLowerCase().indexOf(client.field825) == -1;
                        int var31;
                        if (var25.field3221) {
                            var31 = var26 ? 91 : 1;
                        } else {
                            var31 = var26 ? 90 : 2;
                        }
                        if (var25.field3224 == -1) {
                            class111.method930(var31, var3.field1183.method5200(), var30);
                        } else {
                            class111.method930(var31, class106.method5315(var25.field3224) + var3.field1183.method5200(), var30);
                        }
                    }
                }
                arg0.field4155 = var27 + var28;
            }
            if ((var4 & 0x800) != 0) {
                var5 = arg0.method5954();
            }
            if ((var4 & 0x400) != 0) {
                var3.field1257 = arg0.method5893();
                int var32 = arg0.method5903();
                var3.field1239 = var32 >> 16;
                var3.field1250 = (var32 & 0xFFFF) + client.field611;
                var3.field1248 = 0;
                var3.field1249 = 0;
                if (var3.field1250 > client.field611) {
                    var3.field1248 = -1;
                }
                if (var3.field1257 == 65535) {
                    var3.field1257 = -1;
                }
            }
            if ((var4 & 0x20) != 0) {
                int var33 = arg0.method5893();
                if (var33 == 65535) {
                    var33 = -1;
                }
                int var34 = arg0.method5899();
                client.method215(var3, var33, var34);
            }
            if ((var4 & 0x1) != 0) {
                var3.field1223 = arg0.method5865();
                if (var3.field1223.charAt(0) == '~') {
                    var3.field1223 = var3.field1223.substring(1);
                    class111.method930(2, var3.field1183.method5200(), var3.field1223);
                } else if (Statics.field1374 == var3) {
                    class111.method930(2, var3.field1183.method5200(), var3.field1223);
                }
                var3.field1224 = false;
                var3.field1227 = 0;
                var3.field1228 = 0;
                var3.field1242 = 150;
            }
            if (var3.field1190) {
                if (var5 == 127) {
                    var3.method1855(var3.field1179, var3.field1192);
                } else {
                    byte var35;
                    if (var5 == -1) {
                        var35 = field1352[var2];
                    } else {
                        var35 = var5;
                    }
                    var3.method1854(var3.field1179, var3.field1192, var35);
                }
            }
        }
    }

    @ObfuscatedName("dt.k(I)V")
    public static void method2234() {
        field1362 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field1353[var0] = null;
            field1352[var0] = 1;
        }
    }
}
