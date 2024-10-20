package deob;

@ObfuscatedName("ev")
public class class108 {

    @ObfuscatedName("ev.ar")
    public static byte[] field1367 = new byte[2048];

    @ObfuscatedName("ev.ao")
    public static class229[] field1357 = new class229[2048];

    @ObfuscatedName("ev.ab")
    public static class527[] field1358 = new class527[2048];

    @ObfuscatedName("ev.au")
    public static int field1362 = 0;

    @ObfuscatedName("ev.aa")
    public static int[] field1370 = new int[2048];

    @ObfuscatedName("ev.ac")
    public static int field1361 = 0;

    @ObfuscatedName("ev.al")
    public static int[] field1365 = new int[2048];

    @ObfuscatedName("ev.az")
    public static int[] field1363 = new int[2048];

    @ObfuscatedName("ev.ap")
    public static int[] field1364 = new int[2048];

    @ObfuscatedName("ev.av")
    public static int[] field1360 = new int[2048];

    @ObfuscatedName("ev.ax")
    public static int field1366 = 0;

    @ObfuscatedName("ev.as")
    public static int[] field1354 = new int[2048];

    @ObfuscatedName("ev.ay")
    public static class527 field1368 = new class527(new byte[5000]);

    public class108() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ev.at(Luo;I)V")
    public static final void method2637(class526 arg0) {
        arg0.method8359();
        int var1 = client.field790;
        class92 var2 = Statics.field2420 = client.field651[var1] = new class92();
        var2.field1108 = var1;
        int var3 = arg0.method8360(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field1243[0] = var5 - Statics.field1917;
        var2.field1247 = (var2.field1243[0] << 7) + (var2.method2269() << 6);
        var2.field1244[0] = var6 - Statics.field1322;
        var2.field1173 = (var2.field1244[0] << 7) + (var2.method2269() << 6);
        Statics.field2658 = var2.field1118 = var4;
        if (field1358[var1] != null) {
            var2.method2267(field1358[var1]);
        }
        field1362 = 0;
        field1370[++field1362 - 1] = var1;
        field1367[var1] = 0;
        field1361 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method8360(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1363[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1364[var7] = 0;
                field1360[var7] = -1;
                field1365[++field1361 - 1] = var7;
                field1367[var7] = 0;
            }
        }
        arg0.method8351();
    }

    @ObfuscatedName("cc.ah(Luo;II)V")
    public static final void method1903(class526 arg0, int arg1) {
        int var2 = arg0.field5137;
        field1366 = 0;
        method3943(arg0);
        for (int var3 = 0; var3 < field1366; var3++) {
            int var4 = field1354[var3];
            class92 var5 = client.field651[var4];
            int var6 = arg0.method8410();
            if ((var6 & 0x80) != 0) {
                var6 += arg0.method8410() << 8;
            }
            if ((var6 & 0x4000) != 0) {
                var6 += arg0.method8410() << 16;
            }
            byte var7 = class229.field2413.field2415;
            if ((var6 & 0x200) != 0) {
                var7 = arg0.method8448();
            }
            if ((var6 & 0x400) != 0) {
                class229[] var8 = field1357;
                class229[] var10 = new class229[] { class229.field2410, class229.field2413, class229.field2409, class229.field2411 };
                var8[var4] = (class229) class385.method164(var10, arg0.method8447());
            }
            if ((var6 & 0x4) != 0) {
                var5.field1209 = arg0.method8412();
                if (var5.field1242 == 0) {
                    var5.field1239 = var5.field1209;
                    var5.method2352();
                }
            }
            if ((var6 & 0x1000) != 0) {
                var5.field1210 = arg0.method8447();
                var5.field1195 = arg0.method8447();
                var5.field1225 = arg0.method8616();
                var5.field1204 = arg0.method8447();
                var5.field1228 = arg0.method8412() + client.field500;
                var5.field1188 = arg0.method8412() + client.field500;
                var5.field1230 = arg0.method8412();
                if (var5.field1123) {
                    var5.field1210 += var5.field1124;
                    var5.field1195 += var5.field1111;
                    var5.field1225 += var5.field1124;
                    var5.field1204 += var5.field1111;
                    var5.field1242 = 0;
                } else {
                    var5.field1210 += var5.field1243[0];
                    var5.field1195 += var5.field1244[0];
                    var5.field1225 += var5.field1243[0];
                    var5.field1204 += var5.field1244[0];
                    var5.field1242 = 1;
                }
                var5.field1221 = 0;
            }
            if ((var6 & 0x2000) != 0) {
                for (int var11 = 0; var11 < 3; var11++) {
                    var5.field1101[var11] = arg0.method8535();
                }
            }
            if ((var6 & 0x800) != 0) {
                int var12 = arg0.method8454();
                int var13 = var12 >> 8;
                int var14 = var13 >= 13 && var13 <= 20 ? var13 - 12 : 0;
                class366 var15 = (class366) class385.method164(class366.method5568(), arg0.method8646());
                boolean var16 = arg0.method8410() == 1;
                int var17 = arg0.method8410();
                int var18 = arg0.field5137;
                if (var5.field1103 != null && var5.field1100 != null) {
                    boolean var19 = false;
                    if (var15.field4262 && Statics.field52.method1802(var5.field1103)) {
                        var19 = true;
                    }
                    if (!var19 && client.field737 == 0 && !var5.field1098) {
                        field1368.field5137 = 0;
                        arg0.method8471(field1368.field5140, 0, var17);
                        field1368.field5137 = 0;
                        String var20 = class410.method7025(class399.method297(class351.method2923(field1368)));
                        var5.field1226 = var20.trim();
                        var5.field1197 = var12 >> 8;
                        var5.field1198 = var12 & 0xFF;
                        var5.field1196 = 150;
                        byte[] var21 = null;
                        if (var14 > 0 && var14 <= 8) {
                            var21 = new byte[var14];
                            for (int var22 = 0; var22 < var14; var22++) {
                                var21[var22] = arg0.method8616();
                            }
                        }
                        byte[] var24 = var21;
                        int[] var27;
                        if (var21 == null || var21.length == 0 || var21.length > 8) {
                            var27 = null;
                        } else {
                            int[] var25 = new int[var21.length];
                            int var26 = 0;
                            while (true) {
                                if (var26 >= var24.length) {
                                    var27 = var25;
                                    break;
                                }
                                if (var24[var26] < 0 || var24[var26] > class551.field5295.length) {
                                    var27 = null;
                                    break;
                                }
                                var25[var26] = class551.field5295[var24[var26]];
                                var26++;
                            }
                        }
                        var5.field1237 = var27;
                        var5.field1207 = var16;
                        var5.field1175 = Statics.field2420 != var5 && var15.field4262 && !client.field695.isEmpty() && var20.toLowerCase().indexOf(client.field695) == -1;
                        int var28;
                        if (var15.field4261) {
                            var28 = var16 ? 91 : 1;
                        } else {
                            var28 = var16 ? 90 : 2;
                        }
                        if (var15.field4260 == -1) {
                            class111.method6477(var28, var5.field1103.method9073(), var20);
                        } else {
                            class111.method6477(var28, class102.method3484(var15.field4260) + var5.field1103.method9073(), var20);
                        }
                    }
                }
                arg0.field5137 = var17 + var18 + var14;
            }
            if ((var6 & 0x10000) != 0) {
                int var29 = arg0.method8445();
                for (int var30 = 0; var30 < var29; var30++) {
                    int var31 = arg0.method8444();
                    int var32 = arg0.method8412();
                    int var33 = arg0.method8468();
                    var5.method2340(var31, var32, var33 >> 16, var33 & 0xFFFF);
                }
            }
            if ((var6 & 0x20) != 0) {
                var5.field1226 = arg0.method8535();
                if (var5.field1226.charAt(0) == '~') {
                    var5.field1226 = var5.field1226.substring(1);
                    class111.method6477(2, var5.field1103.method9073(), var5.field1226);
                } else if (Statics.field2420 == var5) {
                    class111.method6477(2, var5.field1103.method9073(), var5.field1226);
                }
                var5.field1207 = false;
                var5.field1197 = 0;
                var5.field1198 = 0;
                var5.field1196 = 150;
            }
            if ((var6 & 0x10) != 0) {
                int var34 = arg0.method8646();
                if (var34 > 0) {
                    for (int var35 = 0; var35 < var34; var35++) {
                        int var36 = -1;
                        int var37 = -1;
                        int var38 = -1;
                        int var39 = arg0.method8426();
                        if (var39 == 32767) {
                            var39 = arg0.method8426();
                            var37 = arg0.method8426();
                            var36 = arg0.method8426();
                            var38 = arg0.method8426();
                        } else if (var39 == 32766) {
                            var39 = -1;
                        } else {
                            var37 = arg0.method8426();
                        }
                        int var40 = arg0.method8426();
                        var5.method2337(var39, var37, var36, var38, client.field500, var40);
                    }
                }
                int var41 = arg0.method8410();
                if (var41 > 0) {
                    for (int var42 = 0; var42 < var41; var42++) {
                        int var43 = arg0.method8426();
                        int var44 = arg0.method8426();
                        if (var44 == 32767) {
                            var5.method2339(var43);
                        } else {
                            int var45 = arg0.method8426();
                            int var46 = arg0.method8646();
                            int var47 = var44 > 0 ? arg0.method8445() : var46;
                            var5.method2347(var43, client.field500, var44, var45, var46, var47);
                        }
                    }
                }
            }
            if ((var6 & 0x2) != 0) {
                int var48 = arg0.method8646();
                byte[] var49 = new byte[var48];
                class527 var50 = new class527(var49);
                arg0.method8525(var49, 0, var48);
                field1358[var4] = var50;
                var5.method2267(var50);
            }
            if ((var6 & 0x1) != 0) {
                int var51 = arg0.method8454();
                if (var51 == 65535) {
                    var51 = -1;
                }
                int var52 = arg0.method8444();
                client.method4116(var5, var51, var52);
            }
            if ((var6 & 0x40) != 0) {
                var5.field1223 = arg0.method8412();
                var5.field1223 += arg0.method8445() << 16;
                int var53 = 16777215;
                if (var5.field1223 == var53) {
                    var5.field1223 = -1;
                }
            }
            if ((var6 & 0x8) != 0) {
                int var54 = arg0.method8452();
                class366 var55 = (class366) class385.method164(class366.method5568(), arg0.method8444());
                boolean var56 = arg0.method8646() == 1;
                int var57 = arg0.method8410();
                int var58 = arg0.field5137;
                if (var5.field1103 != null && var5.field1100 != null) {
                    boolean var59 = false;
                    if (var55.field4262 && Statics.field52.method1802(var5.field1103)) {
                        var59 = true;
                    }
                    if (!var59 && client.field737 == 0 && !var5.field1098) {
                        field1368.field5137 = 0;
                        arg0.method8424(field1368.field5140, 0, var57);
                        field1368.field5137 = 0;
                        String var60 = class410.method7025(class399.method297(class351.method2923(field1368)));
                        var5.field1226 = var60.trim();
                        var5.field1197 = var54 >> 8;
                        var5.field1198 = var54 & 0xFF;
                        var5.field1196 = 150;
                        var5.field1237 = null;
                        var5.field1207 = var56;
                        var5.field1175 = Statics.field2420 != var5 && var55.field4262 && !client.field695.isEmpty() && var60.toLowerCase().indexOf(client.field695) == -1;
                        int var61;
                        if (var55.field4261) {
                            var61 = var56 ? 91 : 1;
                        } else {
                            var61 = var56 ? 90 : 2;
                        }
                        if (var55.field4260 == -1) {
                            class111.method6477(var61, var5.field1103.method9073(), var60);
                        } else {
                            class111.method6477(var61, class102.method3484(var55.field4260) + var5.field1103.method9073(), var60);
                        }
                    }
                }
                arg0.field5137 = var57 + var58;
            }
            if ((var6 & 0x100) != 0) {
                var5.field1233 = client.field500 + arg0.method8452();
                var5.field1216 = client.field500 + arg0.method8454();
                var5.field1235 = arg0.method8446();
                var5.field1236 = arg0.method8447();
                var5.field1172 = arg0.method8448();
                var5.field1238 = (byte) arg0.method8445();
            }
            if (var5.field1123) {
                if (var7 == 127) {
                    var5.method2278(var5.field1124, var5.field1111);
                } else {
                    class229 var63;
                    if (class229.field2413.field2415 == var7) {
                        var63 = field1357[var4];
                    } else {
                        class229[] var62 = new class229[] { class229.field2410, class229.field2413, class229.field2409, class229.field2411 };
                        var63 = (class229) class385.method164(var62, var7);
                    }
                    var5.method2277(var5.field1124, var5.field1111, var63);
                }
            }
        }
        if (arg0.field5137 - var2 != arg1) {
            throw new RuntimeException(arg0.field5137 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("ij.ar(Luo;I)V")
    public static final void method3943(class526 arg0) {
        int var1 = 0;
        arg0.method8359();
        for (int var2 = 0; var2 < field1362; var2++) {
            int var3 = field1370[var2];
            if ((field1367[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1367[var3] = (byte) (field1367[var3] | 0x2);
                } else {
                    int var4 = arg0.method8360(1);
                    if (var4 == 0) {
                        var1 = method1297(arg0);
                        field1367[var3] = (byte) (field1367[var3] | 0x2);
                    } else {
                        method80(arg0, var3);
                    }
                }
            }
        }
        arg0.method8351();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method8359();
        for (int var5 = 0; var5 < field1362; var5++) {
            int var6 = field1370[var5];
            if ((field1367[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1367[var6] = (byte) (field1367[var6] | 0x2);
                } else {
                    int var7 = arg0.method8360(1);
                    if (var7 == 0) {
                        var1 = method1297(arg0);
                        field1367[var6] = (byte) (field1367[var6] | 0x2);
                    } else {
                        method80(arg0, var6);
                    }
                }
            }
        }
        arg0.method8351();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method8359();
        for (int var8 = 0; var8 < field1361; var8++) {
            int var9 = field1365[var8];
            if ((field1367[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1367[var9] = (byte) (field1367[var9] | 0x2);
                } else {
                    int var10 = arg0.method8360(1);
                    if (var10 == 0) {
                        var1 = method1297(arg0);
                        field1367[var9] = (byte) (field1367[var9] | 0x2);
                    } else if (method7516(arg0, var9)) {
                        field1367[var9] = (byte) (field1367[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method8351();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method8359();
        for (int var11 = 0; var11 < field1361; var11++) {
            int var12 = field1365[var11];
            if ((field1367[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1367[var12] = (byte) (field1367[var12] | 0x2);
                } else {
                    int var13 = arg0.method8360(1);
                    if (var13 == 0) {
                        var1 = method1297(arg0);
                        field1367[var12] = (byte) (field1367[var12] | 0x2);
                    } else if (method7516(arg0, var12)) {
                        field1367[var12] = (byte) (field1367[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method8351();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field1362 = 0;
        field1361 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            field1367[var14] = (byte) (field1367[var14] >> 1);
            class92 var15 = client.field651[var14];
            if (var15 == null) {
                field1365[++field1361 - 1] = var14;
            } else {
                field1370[++field1362 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("client.ao(Luo;B)I")
    public static int method1297(class526 arg0) {
        int var1 = arg0.method8360(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method8360(5);
        } else if (var1 == 2) {
            var2 = arg0.method8360(8);
        } else {
            var2 = arg0.method8360(11);
        }
        return var2;
    }

    @ObfuscatedName("az.ab(Luo;IB)V")
    public static void method80(class526 arg0, int arg1) {
        boolean var2 = arg0.method8360(1) == 1;
        if (var2) {
            field1354[++field1366 - 1] = arg1;
        }
        int var3 = arg0.method8360(2);
        class92 var4 = client.field651[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field1123 = false;
            } else if (client.field790 == arg1) {
                throw new RuntimeException();
            } else {
                field1363[arg1] = (Statics.field1322 + var4.field1244[0] >> 13) + (Statics.field1917 + var4.field1243[0] >> 13 << 14) + (var4.field1118 << 28);
                if (var4.field1209 == -1) {
                    field1364[arg1] = var4.field1239;
                } else {
                    field1364[arg1] = var4.field1209;
                }
                field1360[arg1] = var4.field1223;
                client.field651[arg1] = null;
                if (arg0.method8360(1) != 0) {
                    method7516(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method8360(3);
            int var6 = var4.field1243[0];
            int var7 = var4.field1244[0];
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
            if (client.field790 == arg1 && var4.field1247 < 1536 || var4.field1173 < 1536 || var4.field1247 >= 11776 || var4.field1173 >= 11776) {
                var4.method2278(var6, var7);
                var4.field1123 = false;
            } else if (var2) {
                var4.field1123 = true;
                var4.field1124 = var6;
                var4.field1111 = var7;
            } else {
                var4.field1123 = false;
                var4.method2277(var6, var7, field1357[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method8360(4);
            int var9 = var4.field1243[0];
            int var10 = var4.field1244[0];
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
            if (client.field790 == arg1 && var4.field1247 < 1536 || var4.field1173 < 1536 || var4.field1247 >= 11776 || var4.field1173 >= 11776) {
                var4.method2278(var9, var10);
                var4.field1123 = false;
            } else if (var2) {
                var4.field1123 = true;
                var4.field1124 = var9;
                var4.field1111 = var10;
            } else {
                var4.field1123 = false;
                var4.method2277(var9, var10, field1357[arg1]);
            }
        } else {
            int var11 = arg0.method8360(1);
            if (var11 == 0) {
                int var12 = arg0.method8360(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field1243[0] + var14;
                int var17 = var4.field1244[0] + var15;
                if (client.field790 == arg1 && var4.field1247 < 1536 || var4.field1173 < 1536 || var4.field1247 >= 11776 || var4.field1173 >= 11776) {
                    var4.method2278(var16, var17);
                    var4.field1123 = false;
                } else if (var2) {
                    var4.field1123 = true;
                    var4.field1124 = var16;
                    var4.field1111 = var17;
                } else {
                    var4.field1123 = false;
                    var4.method2277(var16, var17, field1357[arg1]);
                }
                var4.field1118 = (byte) (var4.field1118 + var13 & 0x3);
                if (client.field790 == arg1) {
                    Statics.field2658 = var4.field1118;
                }
            } else {
                int var18 = arg0.method8360(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field1917 + var4.field1243[0] + var20 & 0x3FFF) - Statics.field1917;
                int var23 = (Statics.field1322 + var4.field1244[0] + var21 & 0x3FFF) - Statics.field1322;
                if (client.field790 == arg1 && var4.field1247 < 1536 || var4.field1173 < 1536 || var4.field1247 >= 11776 || var4.field1173 >= 11776) {
                    var4.method2278(var22, var23);
                    var4.field1123 = false;
                } else if (var2) {
                    var4.field1123 = true;
                    var4.field1124 = var22;
                    var4.field1111 = var23;
                } else {
                    var4.field1123 = false;
                    var4.method2277(var22, var23, field1357[arg1]);
                }
                var4.field1118 = (byte) (var4.field1118 + var19 & 0x3);
                if (client.field790 == arg1) {
                    Statics.field2658 = var4.field1118;
                }
            }
        }
    }

    @ObfuscatedName("rh.au(Luo;II)Z")
    public static boolean method7516(class526 arg0, int arg1) {
        int var2 = arg0.method8360(2);
        if (var2 == 0) {
            if (arg0.method8360(1) != 0) {
                method7516(arg0, arg1);
            }
            int var3 = arg0.method8360(13);
            int var4 = arg0.method8360(13);
            boolean var5 = arg0.method8360(1) == 1;
            if (var5) {
                field1354[++field1366 - 1] = arg1;
            }
            if (client.field651[arg1] != null) {
                throw new RuntimeException();
            }
            class92 var6 = client.field651[arg1] = new class92();
            var6.field1108 = arg1;
            if (field1358[arg1] != null) {
                var6.method2267(field1358[arg1]);
            }
            var6.field1239 = field1364[arg1];
            var6.field1223 = field1360[arg1];
            int var7 = field1363[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field1245[0] = field1357[arg1];
            var6.field1118 = (byte) var8;
            var6.method2278((var9 << 13) + var3 - Statics.field1917, (var10 << 13) + var4 - Statics.field1322);
            var6.field1123 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method8360(2);
            int var12 = field1363[arg1];
            field1363[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method8360(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1363[arg1];
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
            field1363[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method8360(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1363[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1363[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }
}
