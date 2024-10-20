package deob;

@ObfuscatedName("el")
public class class108 {

    @ObfuscatedName("el.ar")
    public static byte[] field1363 = new byte[2048];

    @ObfuscatedName("el.am")
    public static class219[] field1364 = new class219[2048];

    @ObfuscatedName("el.as")
    public static class514[] field1361 = new class514[2048];

    @ObfuscatedName("el.aj")
    public static int field1366 = 0;

    @ObfuscatedName("el.ag")
    public static int[] field1370 = new int[2048];

    @ObfuscatedName("el.az")
    public static int field1368 = 0;

    @ObfuscatedName("el.av")
    public static int[] field1369 = new int[2048];

    @ObfuscatedName("el.ap")
    public static int[] field1365 = new int[2048];

    @ObfuscatedName("el.aq")
    public static int[] field1372 = new int[2048];

    @ObfuscatedName("el.at")
    public static int[] field1373 = new int[2048];

    @ObfuscatedName("el.ah")
    public static int field1371 = 0;

    @ObfuscatedName("el.ax")
    public static int[] field1374 = new int[2048];

    @ObfuscatedName("el.aa")
    public static class514 field1375 = new class514(new byte[5000]);

    public class108() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gj.aw(Ltc;S)V")
    public static final void method3113(class513 arg0) {
        arg0.method8189();
        int var1 = client.field801;
        class92 var2 = Statics.field1605 = client.field612[var1] = new class92();
        var2.field1130 = var1;
        int var3 = arg0.method8196(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field1188[0] = var5 - Statics.field4295;
        var2.field1192 = (var2.field1188[0] << 7) + (var2.method2223() << 6);
        var2.field1255[0] = var6 - Statics.field1676;
        var2.field1206 = (var2.field1255[0] << 7) + (var2.method2223() << 6);
        Statics.field265 = var2.field1134 = var4;
        if (field1361[var1] != null) {
            var2.method2219(field1361[var1]);
        }
        field1366 = 0;
        field1370[++field1366 - 1] = var1;
        field1363[var1] = 0;
        field1368 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method8196(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1365[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1372[var7] = 0;
                field1373[var7] = -1;
                field1369[++field1368 - 1] = var7;
                field1363[var7] = 0;
            }
        }
        arg0.method8195();
    }

    @ObfuscatedName("dk.ay(Ltc;II)V")
    public static final void method2180(class513 arg0, int arg1) {
        int var2 = arg0.field5072;
        field1371 = 0;
        int var3 = 0;
        arg0.method8189();
        for (int var4 = 0; var4 < field1366; var4++) {
            int var5 = field1370[var4];
            if ((field1363[var5] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field1363[var5] = (byte) (field1363[var5] | 0x2);
                } else {
                    int var6 = arg0.method8196(1);
                    if (var6 == 0) {
                        var3 = method2958(arg0);
                        field1363[var5] = (byte) (field1363[var5] | 0x2);
                    } else {
                        Statics.method6256(arg0, var5);
                    }
                }
            }
        }
        arg0.method8195();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method8189();
        for (int var7 = 0; var7 < field1366; var7++) {
            int var8 = field1370[var7];
            if ((field1363[var8] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field1363[var8] = (byte) (field1363[var8] | 0x2);
                } else {
                    int var9 = arg0.method8196(1);
                    if (var9 == 0) {
                        var3 = method2958(arg0);
                        field1363[var8] = (byte) (field1363[var8] | 0x2);
                    } else {
                        Statics.method6256(arg0, var8);
                    }
                }
            }
        }
        arg0.method8195();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method8189();
        for (int var10 = 0; var10 < field1368; var10++) {
            int var11 = field1369[var10];
            if ((field1363[var11] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field1363[var11] = (byte) (field1363[var11] | 0x2);
                } else {
                    int var12 = arg0.method8196(1);
                    if (var12 == 0) {
                        var3 = method2958(arg0);
                        field1363[var11] = (byte) (field1363[var11] | 0x2);
                    } else if (method3252(arg0, var11)) {
                        field1363[var11] = (byte) (field1363[var11] | 0x2);
                    }
                }
            }
        }
        arg0.method8195();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method8189();
        for (int var13 = 0; var13 < field1368; var13++) {
            int var14 = field1369[var13];
            if ((field1363[var14] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field1363[var14] = (byte) (field1363[var14] | 0x2);
                } else {
                    int var15 = arg0.method8196(1);
                    if (var15 == 0) {
                        var3 = method2958(arg0);
                        field1363[var14] = (byte) (field1363[var14] | 0x2);
                    } else if (method3252(arg0, var14)) {
                        field1363[var14] = (byte) (field1363[var14] | 0x2);
                    }
                }
            }
        }
        arg0.method8195();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        field1366 = 0;
        field1368 = 0;
        for (int var16 = 1; var16 < 2048; var16++) {
            field1363[var16] = (byte) (field1363[var16] >> 1);
            class92 var17 = client.field612[var16];
            if (var17 == null) {
                field1369[++field1368 - 1] = var16;
            } else {
                field1370[++field1366 - 1] = var16;
            }
        }
        method370(arg0);
        if (arg0.field5072 - var2 != arg1) {
            throw new RuntimeException(arg0.field5072 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("fd.ar(Ltc;I)I")
    public static int method2958(class513 arg0) {
        int var1 = arg0.method8196(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method8196(5);
        } else if (var1 == 2) {
            var2 = arg0.method8196(8);
        } else {
            var2 = arg0.method8196(11);
        }
        return var2;
    }

    @ObfuscatedName("hv.as(Ltc;IB)Z")
    public static boolean method3252(class513 arg0, int arg1) {
        int var2 = arg0.method8196(2);
        if (var2 == 0) {
            if (arg0.method8196(1) != 0) {
                method3252(arg0, arg1);
            }
            int var3 = arg0.method8196(13);
            int var4 = arg0.method8196(13);
            boolean var5 = arg0.method8196(1) == 1;
            if (var5) {
                field1374[++field1371 - 1] = arg1;
            }
            if (client.field612[arg1] != null) {
                throw new RuntimeException();
            }
            class92 var6 = client.field612[arg1] = new class92();
            var6.field1130 = arg1;
            if (field1361[arg1] != null) {
                var6.method2219(field1361[arg1]);
            }
            var6.field1250 = field1372[arg1];
            var6.field1218 = field1373[arg1];
            int var7 = field1365[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field1241[0] = field1364[arg1];
            var6.field1134 = (byte) var8;
            var6.method2229((var9 << 13) + var3 - Statics.field4295, (var10 << 13) + var4 - Statics.field1676);
            var6.field1119 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method8196(2);
            int var12 = field1365[arg1];
            field1365[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method8196(5);
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
            int var20 = arg0.method8196(18);
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

    @ObfuscatedName("al.aj(Ltc;I)V")
    public static final void method370(class513 arg0) {
        for (int var1 = 0; var1 < field1371; var1++) {
            int var2 = field1374[var1];
            class92 var3 = client.field612[var2];
            int var4 = arg0.method8244();
            if ((var4 & 0x4) != 0) {
                var4 += arg0.method8244() << 8;
            }
            if ((var4 & 0x4000) != 0) {
                var4 += arg0.method8244() << 16;
            }
            byte var5 = class219.field2382.field2380;
            if ((var4 & 0x200) != 0) {
                class219[] var6 = field1364;
                class219[] var8 = new class219[] { class219.field2382, class219.field2385, class219.field2379, class219.field2378 };
                var6[var2] = (class219) class374.method2465(var8, arg0.method8280());
            }
            if ((var4 & 0x20) != 0) {
                var3.field1218 = arg0.method8288();
                var3.field1218 += arg0.method8244() << 16;
                int var9 = 16777215;
                if (var3.field1218 == var9) {
                    var3.field1218 = -1;
                }
            }
            if ((var4 & 0x2) != 0) {
                int var10 = arg0.method8245();
                if (var10 == 65535) {
                    var10 = -1;
                }
                int var11 = arg0.method8277();
                client.method4988(var3, var10, var11);
            }
            if ((var4 & 0x10) != 0) {
                int var12 = arg0.method8246();
                class355 var13 = (class355) class374.method2465(class355.method2275(), arg0.method8278());
                boolean var14 = arg0.method8244() == 1;
                int var15 = arg0.method8247();
                int var16 = arg0.field5072;
                if (var3.field1115 != null && var3.field1139 != null) {
                    boolean var17 = false;
                    if (var13.field4235 && Statics.field1858.method1779(var3.field1115)) {
                        var17 = true;
                    }
                    if (!var17 && client.field638 == 0 && !var3.field1135) {
                        field1375.field5072 = 0;
                        arg0.method8302(field1375.field5070, 0, var15);
                        field1375.field5072 = 0;
                        String var18 = class399.method6808(class388.method2996(class336.method5161(field1375)));
                        var3.field1214 = var18.trim();
                        var3.field1208 = var12 >> 8;
                        var3.field1209 = var12 & 0xFF;
                        var3.field1183 = 150;
                        var3.field1190 = null;
                        var3.field1205 = var14;
                        var3.field1193 = Statics.field1605 != var3 && var13.field4235 && !client.field748.isEmpty() && var18.toLowerCase().indexOf(client.field748) == -1;
                        int var19;
                        if (var13.field4234) {
                            var19 = var14 ? 91 : 1;
                        } else {
                            var19 = var14 ? 90 : 2;
                        }
                        if (var13.field4233 == -1) {
                            class111.method7045(var19, var3.field1115.method8881(), var18);
                        } else {
                            class111.method7045(var19, class102.method2158(var13.field4233) + var3.field1115.method8881(), var18);
                        }
                    }
                }
                arg0.field5072 = var15 + var16;
            }
            if ((var4 & 0x2000) != 0) {
                for (int var20 = 0; var20 < 3; var20++) {
                    var3.field1117[var20] = arg0.method8369();
                }
            }
            if ((var4 & 0x1000) != 0) {
                var3.field1235 = arg0.method8282();
                var3.field1237 = arg0.method8280();
                var3.field1197 = arg0.method8280();
                var3.field1225 = arg0.method8282();
                var3.field1207 = arg0.method8274() + client.field530;
                var3.field1240 = arg0.method8288() + client.field530;
                var3.field1233 = arg0.method8288();
                if (var3.field1119) {
                    var3.field1235 += var3.field1133;
                    var3.field1237 += var3.field1141;
                    var3.field1197 += var3.field1133;
                    var3.field1225 += var3.field1141;
                    var3.field1253 = 0;
                } else {
                    var3.field1235 += var3.field1188[0];
                    var3.field1237 += var3.field1255[0];
                    var3.field1197 += var3.field1188[0];
                    var3.field1225 += var3.field1255[0];
                    var3.field1253 = 1;
                }
                var3.field1258 = 0;
            }
            if ((var4 & 0x40) != 0) {
                var3.field1214 = arg0.method8369();
                if (var3.field1214.charAt(0) == '~') {
                    var3.field1214 = var3.field1214.substring(1);
                    class111.method7045(2, var3.field1115.method8881(), var3.field1214);
                } else if (Statics.field1605 == var3) {
                    class111.method7045(2, var3.field1115.method8881(), var3.field1214);
                }
                var3.field1205 = false;
                var3.field1208 = 0;
                var3.field1209 = 0;
                var3.field1183 = 150;
            }
            if ((var4 & 0x8000) != 0) {
                var5 = arg0.method8282();
            }
            if ((var4 & 0x800) != 0) {
                int var21 = arg0.method8288();
                int var22 = var21 >> 8;
                int var23 = var22 >= 13 && var22 <= 20 ? var22 - 12 : 0;
                class355 var24 = (class355) class374.method2465(class355.method2275(), arg0.method8277());
                boolean var25 = arg0.method8277() == 1;
                int var26 = arg0.method8277();
                int var27 = arg0.field5072;
                if (var3.field1115 != null && var3.field1139 != null) {
                    boolean var28 = false;
                    if (var24.field4235 && Statics.field1858.method1779(var3.field1115)) {
                        var28 = true;
                    }
                    if (!var28 && client.field638 == 0 && !var3.field1135) {
                        field1375.field5072 = 0;
                        arg0.method8493(field1375.field5070, 0, var26);
                        field1375.field5072 = 0;
                        String var29 = class399.method6808(class388.method2996(class336.method5161(field1375)));
                        var3.field1214 = var29.trim();
                        var3.field1208 = var21 >> 8;
                        var3.field1209 = var21 & 0xFF;
                        var3.field1183 = 150;
                        byte[] var30 = null;
                        if (var23 > 0 && var23 <= 8) {
                            var30 = new byte[var23];
                            for (int var31 = 0; var31 < var23; var31++) {
                                var30[var31] = arg0.method8281();
                            }
                        }
                        var3.field1190 = class539.method7328(var30);
                        var3.field1205 = var25;
                        var3.field1193 = Statics.field1605 != var3 && var24.field4235 && !client.field748.isEmpty() && var29.toLowerCase().indexOf(client.field748) == -1;
                        int var32;
                        if (var24.field4234) {
                            var32 = var25 ? 91 : 1;
                        } else {
                            var32 = var25 ? 90 : 2;
                        }
                        if (var24.field4233 == -1) {
                            class111.method7045(var32, var3.field1115.method8881(), var29);
                        } else {
                            class111.method7045(var32, class102.method2158(var24.field4233) + var3.field1115.method8881(), var29);
                        }
                    }
                }
                arg0.field5072 = var26 + var27 + var23;
            }
            if ((var4 & 0x10000) != 0) {
                int var33 = arg0.method8277();
                for (int var34 = 0; var34 < var33; var34++) {
                    int var35 = arg0.method8247();
                    int var36 = arg0.method8246();
                    int var37 = arg0.method8300();
                    var3.method2288(var35, var36, var37 >> 16, var37 & 0xFFFF);
                }
            }
            if ((var4 & 0x8) != 0) {
                int var38 = arg0.method8277();
                if (var38 > 0) {
                    for (int var39 = 0; var39 < var38; var39++) {
                        int var40 = -1;
                        int var41 = -1;
                        int var42 = -1;
                        int var43 = arg0.method8260();
                        if (var43 == 32767) {
                            var43 = arg0.method8260();
                            var41 = arg0.method8260();
                            var40 = arg0.method8260();
                            var42 = arg0.method8260();
                        } else if (var43 == 32766) {
                            var43 = -1;
                        } else {
                            var41 = arg0.method8260();
                        }
                        int var44 = arg0.method8260();
                        var3.method2277(var43, var41, var40, var42, client.field530, var44);
                    }
                }
                int var45 = arg0.method8278();
                if (var45 > 0) {
                    for (int var46 = 0; var46 < var45; var46++) {
                        int var47 = arg0.method8260();
                        int var48 = arg0.method8260();
                        if (var48 == 32767) {
                            var3.method2279(var47);
                        } else {
                            int var49 = arg0.method8260();
                            int var50 = arg0.method8244();
                            int var51 = var48 > 0 ? arg0.method8278() : var50;
                            var3.method2278(var47, client.field530, var48, var49, var50, var51);
                        }
                    }
                }
            }
            if ((var4 & 0x80) != 0) {
                var3.field1220 = arg0.method8274();
                if (var3.field1253 == 0) {
                    var3.field1250 = var3.field1220;
                    var3.method2284();
                }
            }
            if ((var4 & 0x100) != 0) {
                var3.field1184 = client.field530 + arg0.method8246();
                var3.field1245 = client.field530 + arg0.method8288();
                var3.field1246 = arg0.method8282();
                var3.field1239 = arg0.method8281();
                var3.field1248 = arg0.method8264();
                var3.field1249 = (byte) arg0.method8244();
            }
            if ((var4 & 0x1) != 0) {
                int var52 = arg0.method8244();
                byte[] var53 = new byte[var52];
                class514 var54 = new class514(var53);
                arg0.method8493(var53, 0, var52);
                field1361[var2] = var54;
                var3.method2219(var54);
            }
            if (var3.field1119) {
                if (var5 == 127) {
                    var3.method2229(var3.field1133, var3.field1141);
                } else {
                    class219 var56;
                    if (class219.field2382.field2380 == var5) {
                        var56 = field1364[var2];
                    } else {
                        class219[] var55 = new class219[] { class219.field2382, class219.field2385, class219.field2379, class219.field2378 };
                        var56 = (class219) class374.method2465(var55, var5);
                    }
                    var3.method2221(var3.field1133, var3.field1141, var56);
                }
            }
        }
    }

    @ObfuscatedName("ij.ag(I)V")
    public static void method3847() {
        field1366 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field1361[var0] = null;
            field1364[var0] = class219.field2385;
        }
    }
}
