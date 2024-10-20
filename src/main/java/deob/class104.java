package deob;

@ObfuscatedName("ci")
public class class104 {

    @ObfuscatedName("ci.v")
    public static byte[] field1371 = new byte[2048];

    @ObfuscatedName("ci.x")
    public static class205[] field1380 = new class205[2048];

    @ObfuscatedName("ci.m")
    public static class467[] field1373 = new class467[2048];

    @ObfuscatedName("ci.q")
    public static int field1376 = 0;

    @ObfuscatedName("ci.f")
    public static int[] field1375 = new int[2048];

    @ObfuscatedName("ci.r")
    public static int field1370 = 0;

    @ObfuscatedName("ci.u")
    public static int[] field1377 = new int[2048];

    @ObfuscatedName("ci.b")
    public static int[] field1374 = new int[2048];

    @ObfuscatedName("ci.j")
    public static int[] field1379 = new int[2048];

    @ObfuscatedName("ci.g")
    public static int[] field1381 = new int[2048];

    @ObfuscatedName("ci.i")
    public static int field1378 = 0;

    @ObfuscatedName("ci.o")
    public static int[] field1382 = new int[2048];

    @ObfuscatedName("ci.n")
    public static class467 field1383 = new class467(new byte[5000]);

    public class104() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("jo.h(Lqx;I)V")
    public static final void method4951(class466 arg0) {
        arg0.method7741();
        int var1 = client.field636;
        class89 var2 = Statics.field1790 = client.field635[var1] = new class89();
        var2.field1144 = var1;
        int var3 = arg0.method7747(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field1204[0] = var5 - Statics.field1780;
        var2.field1243 = (var2.field1204[0] << 7) + (var2.method2178() << 6);
        var2.field1252[0] = var6 - Statics.field4368;
        var2.field1179 = (var2.field1252[0] << 7) + (var2.method2178() << 6);
        Statics.field4488 = var2.field1143 = var4;
        if (field1373[var1] != null) {
            var2.method2185(field1373[var1]);
        }
        field1376 = 0;
        field1375[++field1376 - 1] = var1;
        field1371[var1] = 0;
        field1370 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method7747(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1374[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1379[var7] = 0;
                field1381[var7] = -1;
                field1377[++field1370 - 1] = var7;
                field1371[var7] = 0;
            }
        }
        arg0.method7743();
    }

    @ObfuscatedName("t.e(Lqx;IB)V")
    public static final void method279(class466 arg0, int arg1) {
        int var2 = arg0.field4915;
        field1378 = 0;
        method1752(arg0);
        method5255(arg0);
        if (arg0.field4915 - var2 != arg1) {
            throw new RuntimeException(arg0.field4915 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("bi.v(Lqx;I)V")
    public static final void method1752(class466 arg0) {
        int var1 = 0;
        arg0.method7741();
        for (int var2 = 0; var2 < field1376; var2++) {
            int var3 = field1375[var2];
            if ((field1371[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1371[var3] = (byte) (field1371[var3] | 0x2);
                } else {
                    int var4 = arg0.method7747(1);
                    if (var4 == 0) {
                        var1 = method5783(arg0);
                        field1371[var3] = (byte) (field1371[var3] | 0x2);
                    } else {
                        method3042(arg0, var3);
                    }
                }
            }
        }
        arg0.method7743();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method7741();
        for (int var5 = 0; var5 < field1376; var5++) {
            int var6 = field1375[var5];
            if ((field1371[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1371[var6] = (byte) (field1371[var6] | 0x2);
                } else {
                    int var7 = arg0.method7747(1);
                    if (var7 == 0) {
                        var1 = method5783(arg0);
                        field1371[var6] = (byte) (field1371[var6] | 0x2);
                    } else {
                        method3042(arg0, var6);
                    }
                }
            }
        }
        arg0.method7743();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method7741();
        for (int var8 = 0; var8 < field1370; var8++) {
            int var9 = field1377[var8];
            if ((field1371[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1371[var9] = (byte) (field1371[var9] | 0x2);
                } else {
                    int var10 = arg0.method7747(1);
                    if (var10 == 0) {
                        var1 = method5783(arg0);
                        field1371[var9] = (byte) (field1371[var9] | 0x2);
                    } else if (method5788(arg0, var9)) {
                        field1371[var9] = (byte) (field1371[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method7743();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method7741();
        for (int var11 = 0; var11 < field1370; var11++) {
            int var12 = field1377[var11];
            if ((field1371[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1371[var12] = (byte) (field1371[var12] | 0x2);
                } else {
                    int var13 = arg0.method7747(1);
                    if (var13 == 0) {
                        var1 = method5783(arg0);
                        field1371[var12] = (byte) (field1371[var12] | 0x2);
                    } else if (method5788(arg0, var12)) {
                        field1371[var12] = (byte) (field1371[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method7743();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field1376 = 0;
        field1370 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            field1371[var14] = (byte) (field1371[var14] >> 1);
            class89 var15 = client.field635[var14];
            if (var15 == null) {
                field1377[++field1370 - 1] = var14;
            } else {
                field1375[++field1376 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("lh.x(Lqx;I)I")
    public static int method5783(class466 arg0) {
        int var1 = arg0.method7747(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method7747(5);
        } else if (var1 == 2) {
            var2 = arg0.method7747(8);
        } else {
            var2 = arg0.method7747(11);
        }
        return var2;
    }

    @ObfuscatedName("fc.m(Lqx;II)V")
    public static void method3042(class466 arg0, int arg1) {
        boolean var2 = arg0.method7747(1) == 1;
        if (var2) {
            field1382[++field1378 - 1] = arg1;
        }
        int var3 = arg0.method7747(2);
        class89 var4 = client.field635[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field1134 = false;
            } else if (client.field636 == arg1) {
                throw new RuntimeException();
            } else {
                field1374[arg1] = (Statics.field4368 + var4.field1252[0] >> 13) + (Statics.field1780 + var4.field1204[0] >> 13 << 14) + (var4.field1143 << 28);
                if (var4.field1191 == -1) {
                    field1379[arg1] = var4.field1245;
                } else {
                    field1379[arg1] = var4.field1191;
                }
                field1381[arg1] = var4.field1212;
                client.field635[arg1] = null;
                if (arg0.method7747(1) != 0) {
                    method5788(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method7747(3);
            int var6 = var4.field1204[0];
            int var7 = var4.field1252[0];
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
            if (client.field636 == arg1 && var4.field1243 < 1536 || var4.field1179 < 1536 || var4.field1243 >= 11776 || var4.field1179 >= 11776) {
                var4.method2176(var6, var7);
                var4.field1134 = false;
            } else if (var2) {
                var4.field1134 = true;
                var4.field1148 = var6;
                var4.field1150 = var7;
            } else {
                var4.field1134 = false;
                var4.method2175(var6, var7, field1380[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method7747(4);
            int var9 = var4.field1204[0];
            int var10 = var4.field1252[0];
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
            if (client.field636 == arg1 && var4.field1243 < 1536 || var4.field1179 < 1536 || var4.field1243 >= 11776 || var4.field1179 >= 11776) {
                var4.method2176(var9, var10);
                var4.field1134 = false;
            } else if (var2) {
                var4.field1134 = true;
                var4.field1148 = var9;
                var4.field1150 = var10;
            } else {
                var4.field1134 = false;
                var4.method2175(var9, var10, field1380[arg1]);
            }
        } else {
            int var11 = arg0.method7747(1);
            if (var11 == 0) {
                int var12 = arg0.method7747(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field1204[0] + var14;
                int var17 = var4.field1252[0] + var15;
                if (client.field636 == arg1 && var4.field1243 < 1536 || var4.field1179 < 1536 || var4.field1243 >= 11776 || var4.field1179 >= 11776) {
                    var4.method2176(var16, var17);
                    var4.field1134 = false;
                } else if (var2) {
                    var4.field1134 = true;
                    var4.field1148 = var16;
                    var4.field1150 = var17;
                } else {
                    var4.field1134 = false;
                    var4.method2175(var16, var17, field1380[arg1]);
                }
                var4.field1143 = (byte) (var4.field1143 + var13 & 0x3);
                if (client.field636 == arg1) {
                    Statics.field4488 = var4.field1143;
                }
            } else {
                int var18 = arg0.method7747(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field1780 + var4.field1204[0] + var20 & 0x3FFF) - Statics.field1780;
                int var23 = (Statics.field4368 + var4.field1252[0] + var21 & 0x3FFF) - Statics.field4368;
                if (client.field636 == arg1 && var4.field1243 < 1536 || var4.field1179 < 1536 || var4.field1243 >= 11776 || var4.field1179 >= 11776) {
                    var4.method2176(var22, var23);
                    var4.field1134 = false;
                } else if (var2) {
                    var4.field1134 = true;
                    var4.field1148 = var22;
                    var4.field1150 = var23;
                } else {
                    var4.field1134 = false;
                    var4.method2175(var22, var23, field1380[arg1]);
                }
                var4.field1143 = (byte) (var4.field1143 + var19 & 0x3);
                if (client.field636 == arg1) {
                    Statics.field4488 = var4.field1143;
                }
            }
        }
    }

    @ObfuscatedName("lt.q(Lqx;II)Z")
    public static boolean method5788(class466 arg0, int arg1) {
        int var2 = arg0.method7747(2);
        if (var2 == 0) {
            if (arg0.method7747(1) != 0) {
                method5788(arg0, arg1);
            }
            int var3 = arg0.method7747(13);
            int var4 = arg0.method7747(13);
            boolean var5 = arg0.method7747(1) == 1;
            if (var5) {
                field1382[++field1378 - 1] = arg1;
            }
            if (client.field635[arg1] != null) {
                throw new RuntimeException();
            }
            class89 var6 = client.field635[arg1] = new class89();
            var6.field1144 = arg1;
            if (field1373[arg1] != null) {
                var6.method2185(field1373[arg1]);
            }
            var6.field1245 = field1379[arg1];
            var6.field1212 = field1381[arg1];
            int var7 = field1374[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field1232[0] = field1380[arg1];
            var6.field1143 = (byte) var8;
            var6.method2176((var9 << 13) + var3 - Statics.field1780, (var10 << 13) + var4 - Statics.field4368);
            var6.field1134 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method7747(2);
            int var12 = field1374[arg1];
            field1374[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method7747(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1374[arg1];
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
            field1374[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method7747(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1374[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1374[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("ku.f(Lqx;I)V")
    public static final void method5255(class466 arg0) {
        for (int var1 = 0; var1 < field1378; var1++) {
            int var2 = field1382[var1];
            class89 var3 = client.field635[var2];
            int var4 = arg0.method7792();
            if ((var4 & 0x40) != 0) {
                var4 += arg0.method7792() << 8;
            }
            method3315(arg0, var2, var3, var4);
        }
    }

    @ObfuscatedName("gj.r(Lqx;ILcj;II)V")
    public static final void method3315(class466 arg0, int arg1, class89 arg2, int arg3) {
        byte var4 = class205.field2355.field2359;
        if ((arg3 & 0x2000) != 0) {
            arg2.field1197 = arg0.method7943();
            arg2.field1186 = arg0.method7793();
            arg2.field1231 = arg0.method7943();
            arg2.field1214 = arg0.method7826();
            arg2.field1234 = arg0.method7772() + client.field519;
            arg2.field1235 = arg0.method7833() + client.field519;
            arg2.field1236 = arg0.method7794();
            if (arg2.field1134) {
                arg2.field1197 += arg2.field1148;
                arg2.field1186 += arg2.field1150;
                arg2.field1231 += arg2.field1148;
                arg2.field1214 += arg2.field1150;
                arg2.field1178 = 0;
            } else {
                arg2.field1197 += arg2.field1204[0];
                arg2.field1186 += arg2.field1252[0];
                arg2.field1231 += arg2.field1204[0];
                arg2.field1214 += arg2.field1252[0];
                arg2.field1178 = 1;
            }
            arg2.field1253 = 0;
        }
        if ((arg3 & 0x20) != 0) {
            arg2.field1199 = arg0.method7801();
            if (arg2.field1199.charAt(0) == '~') {
                arg2.field1199 = arg2.field1199.substring(1);
                class107.method3247(2, arg2.field1136.method8383(), arg2.field1199);
            } else if (Statics.field1790 == arg2) {
                class107.method3247(2, arg2.field1136.method8383(), arg2.field1199);
            }
            arg2.field1200 = false;
            arg2.field1203 = 0;
            arg2.field1230 = 0;
            arg2.field1249 = 150;
        }
        if ((arg3 & 0x1000) != 0) {
            arg2.field1225 = arg0.method7794();
            int var5 = arg0.method7846();
            arg2.field1247 = var5 >> 16;
            arg2.field1228 = (var5 & 0xFFFF) + client.field519;
            arg2.field1226 = 0;
            arg2.field1215 = 0;
            if (arg2.field1228 > client.field519) {
                arg2.field1226 = -1;
            }
            if (arg2.field1225 == 65535) {
                arg2.field1225 = -1;
            }
        }
        if ((arg3 & 0x8) != 0) {
            int var6 = arg0.method7833();
            if (var6 == 65535) {
                var6 = -1;
            }
            int var7 = arg0.method7792();
            client.method4873(arg2, var6, var7);
        }
        if ((arg3 & 0x100) != 0) {
            for (int var8 = 0; var8 < 3; var8++) {
                arg2.field1146[var8] = arg0.method7801();
            }
        }
        if ((arg3 & 0x10) != 0) {
            arg2.field1212 = arg0.method7834();
            int var9;
            if (Statics.field2315) {
                arg2.field1212 += arg0.method7792() << 16;
                var9 = 16777215;
            } else {
                var9 = 65535;
            }
            if (arg2.field1212 == var9) {
                arg2.field1212 = -1;
            }
        }
        if ((arg3 & 0x4000) != 0) {
            arg2.field1239 = client.field519 + arg0.method7833();
            arg2.field1201 = client.field519 + arg0.method7772();
            arg2.field1241 = arg0.method7960();
            arg2.field1221 = arg0.method7960();
            arg2.field1233 = arg0.method7793();
            arg2.field1244 = (byte) arg0.method7823();
        }
        if ((arg3 & 0x80) != 0) {
            arg2.field1191 = arg0.method7834();
            if (arg2.field1178 == 0) {
                arg2.field1245 = arg2.field1191;
                arg2.field1191 = -1;
            }
        }
        if ((arg3 & 0x4) != 0) {
            int var10 = arg0.method7941();
            byte[] var11 = new byte[var10];
            class467 var12 = new class467(var11);
            arg0.method7847(var11, 0, var10);
            field1373[arg1] = var12;
            arg2.method2185(var12);
        }
        if ((arg3 & 0x400) != 0) {
            var4 = arg0.method7793();
        }
        if ((arg3 & 0x2) != 0) {
            int var13 = arg0.method7834();
            class328 var14 = (class328) class347.method1688(class328.method3002(), arg0.method7941());
            boolean var15 = arg0.method7941() == 1;
            int var16 = arg0.method7823();
            int var17 = arg0.field4915;
            if (arg2.field1136 != null && arg2.field1123 != null) {
                boolean var18 = false;
                if (var14.field4166 && Statics.field4582.method1701(arg2.field1136)) {
                    var18 = true;
                }
                if (!var18 && client.field692 == 0 && !arg2.field1142) {
                    field1383.field4915 = 0;
                    arg0.method7847(field1383.field4917, 0, var16);
                    field1383.field4915 = 0;
                    String var19 = class372.method6553(class361.method3430(class309.method3009(field1383)));
                    arg2.field1199 = var19.trim();
                    arg2.field1203 = var13 >> 8;
                    arg2.field1230 = var13 & 0xFF;
                    arg2.field1249 = 150;
                    arg2.field1200 = var15;
                    arg2.field1188 = Statics.field1790 != arg2 && var14.field4166 && client.field745 != "" && var19.toLowerCase().indexOf(client.field745) == -1;
                    int var20;
                    if (var14.field4152) {
                        var20 = var15 ? 91 : 1;
                    } else {
                        var20 = var15 ? 90 : 2;
                    }
                    if (var14.field4164 == -1) {
                        class107.method3247(var20, arg2.field1136.method8383(), var19);
                    } else {
                        class107.method3247(var20, class98.method7661(var14.field4164) + arg2.field1136.method8383(), var19);
                    }
                }
            }
            arg0.field4915 = var16 + var17;
        }
        if ((arg3 & 0x1) != 0) {
            int var21 = arg0.method7792();
            if (var21 > 0) {
                for (int var22 = 0; var22 < var21; var22++) {
                    int var23 = -1;
                    int var24 = -1;
                    int var25 = -1;
                    int var26 = arg0.method7806();
                    if (var26 == 32767) {
                        var26 = arg0.method7806();
                        var24 = arg0.method7806();
                        var23 = arg0.method7806();
                        var25 = arg0.method7806();
                    } else if (var26 == 32766) {
                        var26 = -1;
                    } else {
                        var24 = arg0.method7806();
                    }
                    int var27 = arg0.method7806();
                    arg2.method2222(var26, var24, var23, var25, client.field519, var27);
                }
            }
            int var28 = arg0.method7941();
            if (var28 > 0) {
                for (int var29 = 0; var29 < var28; var29++) {
                    int var30 = arg0.method7806();
                    int var31 = arg0.method7806();
                    if (var31 == 32767) {
                        arg2.method2234(var30);
                    } else {
                        int var32 = arg0.method7806();
                        int var33 = arg0.method7823();
                        int var34 = var31 > 0 ? arg0.method7792() : var33;
                        arg2.method2224(var30, client.field519, var31, var32, var33, var34);
                    }
                }
            }
        }
        if ((arg3 & 0x800) != 0) {
            class205[] var35 = field1380;
            class205[] var37 = new class205[] { class205.field2357, class205.field2355, class205.field2358, class205.field2356 };
            var35[arg1] = (class205) class347.method1688(var37, arg0.method7793());
        }
        if (!arg2.field1134) {
            return;
        }
        if (var4 == 127) {
            arg2.method2176(arg2.field1148, arg2.field1150);
            return;
        }
        class205 var39;
        if (class205.field2355.field2359 == var4) {
            var39 = field1380[arg1];
        } else {
            class205[] var38 = new class205[] { class205.field2357, class205.field2355, class205.field2358, class205.field2356 };
            var39 = (class205) class347.method1688(var38, var4);
        }
        arg2.method2175(arg2.field1148, arg2.field1150, var39);
    }

    @ObfuscatedName("mb.u(I)V")
    public static void method6063() {
        field1376 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field1373[var0] = null;
            field1380[var0] = class205.field2356;
        }
    }
}
