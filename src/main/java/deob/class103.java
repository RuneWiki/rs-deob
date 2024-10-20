package deob;

@ObfuscatedName("cn")
public class class103 {

    @ObfuscatedName("cn.v")
    public static byte[] field1354 = new byte[2048];

    @ObfuscatedName("cn.s")
    public static class209[] field1341 = new class209[2048];

    @ObfuscatedName("cn.z")
    public static class474[] field1342 = new class474[2048];

    @ObfuscatedName("cn.j")
    public static int field1343 = 0;

    @ObfuscatedName("cn.i")
    public static int[] field1350 = new int[2048];

    @ObfuscatedName("cn.n")
    public static int field1345 = 0;

    @ObfuscatedName("cn.l")
    public static int[] field1344 = new int[2048];

    @ObfuscatedName("cn.k")
    public static int[] field1338 = new int[2048];

    @ObfuscatedName("cn.c")
    public static int[] field1348 = new int[2048];

    @ObfuscatedName("cn.r")
    public static int[] field1349 = new int[2048];

    @ObfuscatedName("cn.b")
    public static int field1346 = 0;

    @ObfuscatedName("cn.m")
    public static int[] field1351 = new int[2048];

    @ObfuscatedName("cn.t")
    public static class474 field1352 = new class474(new byte[5000]);

    public class103() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bu.f(Lru;B)V")
    public static final void method2074(class473 arg0) {
        arg0.method7935();
        int var1 = client.field630;
        class88 var2 = Statics.field4508 = client.field621[var1] = new class88();
        var2.field1129 = var1;
        int var3 = arg0.method7923(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field1210[0] = var5 - Statics.field2118;
        var2.field1204 = (var2.field1210[0] << 7) + (var2.method2251() << 6);
        var2.field1232[0] = var6 - Statics.field565;
        var2.field1161 = (var2.field1232[0] << 7) + (var2.method2251() << 6);
        Statics.field1370 = var2.field1128 = var4;
        if (field1342[var1] != null) {
            var2.method2242(field1342[var1]);
        }
        field1343 = 0;
        field1350[++field1343 - 1] = var1;
        field1354[var1] = 0;
        field1345 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method7923(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1338[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1348[var7] = 0;
                field1349[var7] = -1;
                field1344[++field1345 - 1] = var7;
                field1354[var7] = 0;
            }
        }
        arg0.method7910();
    }

    @ObfuscatedName("kw.w(Lru;II)V")
    public static final void method5839(class473 arg0, int arg1) {
        int var2 = arg0.field4939;
        field1346 = 0;
        method2226(arg0);
        for (int var3 = 0; var3 < field1346; var3++) {
            int var4 = field1351[var3];
            class88 var5 = client.field621[var4];
            int var6 = arg0.method7964();
            if ((var6 & 0x40) != 0) {
                var6 += arg0.method7964() << 8;
            }
            method3601(arg0, var4, var5, var6);
        }
        if (arg0.field4939 - var2 != arg1) {
            throw new RuntimeException(arg0.field4939 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("ch.v(Lru;I)V")
    public static final void method2226(class473 arg0) {
        int var1 = 0;
        arg0.method7935();
        for (int var2 = 0; var2 < field1343; var2++) {
            int var3 = field1350[var2];
            if ((field1354[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1354[var3] = (byte) (field1354[var3] | 0x2);
                } else {
                    int var4 = arg0.method7923(1);
                    if (var4 == 0) {
                        var1 = method2181(arg0);
                        field1354[var3] = (byte) (field1354[var3] | 0x2);
                    } else {
                        method2987(arg0, var3);
                    }
                }
            }
        }
        arg0.method7910();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method7935();
        for (int var5 = 0; var5 < field1343; var5++) {
            int var6 = field1350[var5];
            if ((field1354[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1354[var6] = (byte) (field1354[var6] | 0x2);
                } else {
                    int var7 = arg0.method7923(1);
                    if (var7 == 0) {
                        var1 = method2181(arg0);
                        field1354[var6] = (byte) (field1354[var6] | 0x2);
                    } else {
                        method2987(arg0, var6);
                    }
                }
            }
        }
        arg0.method7910();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method7935();
        for (int var8 = 0; var8 < field1345; var8++) {
            int var9 = field1344[var8];
            if ((field1354[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1354[var9] = (byte) (field1354[var9] | 0x2);
                } else {
                    int var10 = arg0.method7923(1);
                    if (var10 == 0) {
                        var1 = method2181(arg0);
                        field1354[var9] = (byte) (field1354[var9] | 0x2);
                    } else if (method5074(arg0, var9)) {
                        field1354[var9] = (byte) (field1354[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method7910();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method7935();
        for (int var11 = 0; var11 < field1345; var11++) {
            int var12 = field1344[var11];
            if ((field1354[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1354[var12] = (byte) (field1354[var12] | 0x2);
                } else {
                    int var13 = arg0.method7923(1);
                    if (var13 == 0) {
                        var1 = method2181(arg0);
                        field1354[var12] = (byte) (field1354[var12] | 0x2);
                    } else if (method5074(arg0, var12)) {
                        field1354[var12] = (byte) (field1354[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method7910();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field1343 = 0;
        field1345 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            field1354[var14] = (byte) (field1354[var14] >> 1);
            class88 var15 = client.field621[var14];
            if (var15 == null) {
                field1344[++field1345 - 1] = var14;
            } else {
                field1350[++field1343 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("cr.s(Lru;B)I")
    public static int method2181(class473 arg0) {
        int var1 = arg0.method7923(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method7923(5);
        } else if (var1 == 2) {
            var2 = arg0.method7923(8);
        } else {
            var2 = arg0.method7923(11);
        }
        return var2;
    }

    @ObfuscatedName("es.z(Lru;II)V")
    public static void method2987(class473 arg0, int arg1) {
        boolean var2 = arg0.method7923(1) == 1;
        if (var2) {
            field1351[++field1346 - 1] = arg1;
        }
        int var3 = arg0.method7923(2);
        class88 var4 = client.field621[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field1133 = false;
            } else if (client.field630 == arg1) {
                throw new RuntimeException();
            } else {
                field1338[arg1] = (Statics.field565 + var4.field1232[0] >> 13) + (Statics.field2118 + var4.field1210[0] >> 13 << 14) + (var4.field1128 << 28);
                if (var4.field1196 == -1) {
                    field1348[arg1] = var4.field1227;
                } else {
                    field1348[arg1] = var4.field1196;
                }
                field1349[arg1] = var4.field1194;
                client.field621[arg1] = null;
                if (arg0.method7923(1) != 0) {
                    method5074(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method7923(3);
            int var6 = var4.field1210[0];
            int var7 = var4.field1232[0];
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
            if (client.field630 == arg1 && var4.field1204 < 1536 || var4.field1161 < 1536 || var4.field1204 >= 11776 || var4.field1161 >= 11776) {
                var4.method2249(var6, var7);
                var4.field1133 = false;
            } else if (var2) {
                var4.field1133 = true;
                var4.field1134 = var6;
                var4.field1135 = var7;
            } else {
                var4.field1133 = false;
                var4.method2254(var6, var7, field1341[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method7923(4);
            int var9 = var4.field1210[0];
            int var10 = var4.field1232[0];
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
            if (client.field630 == arg1 && var4.field1204 < 1536 || var4.field1161 < 1536 || var4.field1204 >= 11776 || var4.field1161 >= 11776) {
                var4.method2249(var9, var10);
                var4.field1133 = false;
            } else if (var2) {
                var4.field1133 = true;
                var4.field1134 = var9;
                var4.field1135 = var10;
            } else {
                var4.field1133 = false;
                var4.method2254(var9, var10, field1341[arg1]);
            }
        } else {
            int var11 = arg0.method7923(1);
            if (var11 == 0) {
                int var12 = arg0.method7923(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field1210[0] + var14;
                int var17 = var4.field1232[0] + var15;
                if (client.field630 == arg1 && var4.field1204 < 1536 || var4.field1161 < 1536 || var4.field1204 >= 11776 || var4.field1161 >= 11776) {
                    var4.method2249(var16, var17);
                    var4.field1133 = false;
                } else if (var2) {
                    var4.field1133 = true;
                    var4.field1134 = var16;
                    var4.field1135 = var17;
                } else {
                    var4.field1133 = false;
                    var4.method2254(var16, var17, field1341[arg1]);
                }
                var4.field1128 = (byte) (var4.field1128 + var13 & 0x3);
                if (client.field630 == arg1) {
                    Statics.field1370 = var4.field1128;
                }
            } else {
                int var18 = arg0.method7923(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field2118 + var4.field1210[0] + var20 & 0x3FFF) - Statics.field2118;
                int var23 = (Statics.field565 + var4.field1232[0] + var21 & 0x3FFF) - Statics.field565;
                if (client.field630 == arg1 && var4.field1204 < 1536 || var4.field1161 < 1536 || var4.field1204 >= 11776 || var4.field1161 >= 11776) {
                    var4.method2249(var22, var23);
                    var4.field1133 = false;
                } else if (var2) {
                    var4.field1133 = true;
                    var4.field1134 = var22;
                    var4.field1135 = var23;
                } else {
                    var4.field1133 = false;
                    var4.method2254(var22, var23, field1341[arg1]);
                }
                var4.field1128 = (byte) (var4.field1128 + var19 & 0x3);
                if (client.field630 == arg1) {
                    Statics.field1370 = var4.field1128;
                }
            }
        }
    }

    @ObfuscatedName("jk.j(Lru;II)Z")
    public static boolean method5074(class473 arg0, int arg1) {
        int var2 = arg0.method7923(2);
        if (var2 == 0) {
            if (arg0.method7923(1) != 0) {
                method5074(arg0, arg1);
            }
            int var3 = arg0.method7923(13);
            int var4 = arg0.method7923(13);
            boolean var5 = arg0.method7923(1) == 1;
            if (var5) {
                field1351[++field1346 - 1] = arg1;
            }
            if (client.field621[arg1] != null) {
                throw new RuntimeException();
            }
            class88 var6 = client.field621[arg1] = new class88();
            var6.field1129 = arg1;
            if (field1342[arg1] != null) {
                var6.method2242(field1342[arg1]);
            }
            var6.field1227 = field1348[arg1];
            var6.field1194 = field1349[arg1];
            int var7 = field1338[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field1233[0] = field1341[arg1];
            var6.field1128 = (byte) var8;
            var6.method2249((var9 << 13) + var3 - Statics.field2118, (var10 << 13) + var4 - Statics.field565);
            var6.field1133 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method7923(2);
            int var12 = field1338[arg1];
            field1338[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method7923(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1338[arg1];
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
            field1338[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method7923(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1338[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1338[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("gb.i(Lru;ILcl;IB)V")
    public static final void method3601(class473 arg0, int arg1, class88 arg2, int arg3) {
        byte var4 = class209.field2364.field2360;
        if ((arg3 & 0x400) != 0) {
            arg2.field1177 = client.field511 + arg0.method8034();
            arg2.field1222 = client.field511 + arg0.method8050();
            arg2.field1181 = arg0.method8106();
            arg2.field1228 = arg0.method7999();
            arg2.field1225 = arg0.method8195();
            arg2.field1226 = (byte) arg0.method7998();
        }
        if ((arg3 & 0x4) != 0) {
            int var5 = arg0.method7996();
            byte[] var6 = new byte[var5];
            class474 var7 = new class474(var6);
            arg0.method8021(var6, 0, var5);
            field1342[arg1] = var7;
            arg2.method2242(var7);
        }
        if ((arg3 & 0x8) != 0) {
            int var8 = arg0.method8034();
            class332 var9 = (class332) class351.method19(class332.method2185(), arg0.method7997());
            boolean var10 = arg0.method7998() == 1;
            int var11 = arg0.method7998();
            int var12 = arg0.field4939;
            if (arg2.field1115 != null && arg2.field1107 != null) {
                boolean var13 = false;
                if (var9.field4189 && Statics.field1944.method1750(arg2.field1115)) {
                    var13 = true;
                }
                if (!var13 && client.field627 == 0 && !arg2.field1127) {
                    field1352.field4939 = 0;
                    arg0.method8162(field1352.field4936, 0, var11);
                    field1352.field4939 = 0;
                    String var14 = class376.method6713(class365.method3541(class313.method3143(field1352)));
                    arg2.field1195 = var14.trim();
                    arg2.field1162 = var8 >> 8;
                    arg2.field1186 = var8 & 0xFF;
                    arg2.field1184 = 150;
                    arg2.field1182 = var10;
                    arg2.field1167 = Statics.field4508 != arg2 && var9.field4189 && client.field739 != "" && var14.toLowerCase().indexOf(client.field739) == -1;
                    int var15;
                    if (var9.field4188) {
                        var15 = var10 ? 91 : 1;
                    } else {
                        var15 = var10 ? 90 : 2;
                    }
                    if (var9.field4187 == -1) {
                        class106.method5047(var15, arg2.field1115.method8556(), var14);
                    } else {
                        class106.method5047(var15, class97.method1829(var9.field4187) + arg2.field1115.method8556(), var14);
                    }
                }
            }
            arg0.field4939 = var11 + var12;
        }
        if ((arg3 & 0x4000) != 0) {
            class209[] var16 = field1341;
            class209[] var18 = new class209[] { class209.field2361, class209.field2364, class209.field2363, class209.field2367 };
            var16[arg1] = (class209) class351.method19(var18, arg0.method7999());
        }
        if ((arg3 & 0x1000) != 0) {
            for (int var19 = 0; var19 < 3; var19++) {
                arg2.field1111[var19] = arg0.method7983();
            }
        }
        if ((arg3 & 0x80) != 0) {
            arg2.field1196 = arg0.method8032();
            if (arg2.field1230 == 0) {
                arg2.field1227 = arg2.field1196;
                arg2.field1196 = -1;
            }
        }
        if ((arg3 & 0x800) != 0) {
            arg2.field1207 = arg0.method8039();
            int var20 = arg0.method7979();
            arg2.field1211 = var20 >> 16;
            arg2.field1208 = (var20 & 0xFFFF) + client.field511;
            arg2.field1199 = 0;
            arg2.field1209 = 0;
            if (arg2.field1208 > client.field511) {
                arg2.field1199 = -1;
            }
            if (arg2.field1207 == 65535) {
                arg2.field1207 = -1;
            }
        }
        if ((arg3 & 0x1) != 0) {
            arg2.field1195 = arg0.method7983();
            if (arg2.field1195.charAt(0) == '~') {
                arg2.field1195 = arg2.field1195.substring(1);
                class106.method5047(2, arg2.field1115.method8556(), arg2.field1195);
            } else if (Statics.field4508 == arg2) {
                class106.method5047(2, arg2.field1115.method8556(), arg2.field1195);
            }
            arg2.field1182 = false;
            arg2.field1162 = 0;
            arg2.field1186 = 0;
            arg2.field1184 = 150;
        }
        if ((arg3 & 0x2) != 0) {
            int var21 = arg0.method8039();
            if (var21 == 65535) {
                var21 = -1;
            }
            int var22 = arg0.method7998();
            client.method2305(arg2, var21, var22);
        }
        if ((arg3 & 0x20) != 0) {
            int var23 = arg0.method7996();
            if (var23 > 0) {
                for (int var24 = 0; var24 < var23; var24++) {
                    int var25 = -1;
                    int var26 = -1;
                    int var27 = -1;
                    int var28 = arg0.method8059();
                    if (var28 == 32767) {
                        var28 = arg0.method8059();
                        var26 = arg0.method8059();
                        var25 = arg0.method8059();
                        var27 = arg0.method8059();
                    } else if (var28 == 32766) {
                        var28 = -1;
                    } else {
                        var26 = arg0.method8059();
                    }
                    int var29 = arg0.method8059();
                    arg2.method2317(var28, var26, var25, var27, client.field511, var29);
                }
            }
            int var30 = arg0.method7998();
            if (var30 > 0) {
                for (int var31 = 0; var31 < var30; var31++) {
                    int var32 = arg0.method8059();
                    int var33 = arg0.method8059();
                    if (var33 == 32767) {
                        arg2.method2310(var32);
                    } else {
                        int var34 = arg0.method8059();
                        int var35 = arg0.method7996();
                        int var36 = var33 > 0 ? arg0.method7996() : var35;
                        arg2.method2313(var32, client.field511, var33, var34, var35, var36);
                    }
                }
            }
        }
        if ((arg3 & 0x100) != 0) {
            arg2.field1212 = arg0.method7965();
            arg2.field1214 = arg0.method8195();
            arg2.field1213 = arg0.method8106();
            arg2.field1215 = arg0.method7999();
            arg2.field1216 = arg0.method8034() + client.field511;
            arg2.field1190 = arg0.method8039() + client.field511;
            arg2.field1218 = arg0.method8039();
            if (arg2.field1133) {
                arg2.field1212 += arg2.field1134;
                arg2.field1214 += arg2.field1135;
                arg2.field1213 += arg2.field1134;
                arg2.field1215 += arg2.field1135;
                arg2.field1230 = 0;
            } else {
                arg2.field1212 += arg2.field1210[0];
                arg2.field1214 += arg2.field1232[0];
                arg2.field1213 += arg2.field1210[0];
                arg2.field1215 += arg2.field1232[0];
                arg2.field1230 = 1;
            }
            arg2.field1231 = 0;
        }
        if ((arg3 & 0x200) != 0) {
            var4 = arg0.method8195();
        }
        if ((arg3 & 0x10) != 0) {
            arg2.field1194 = arg0.method8034();
            int var37;
            if (Statics.field3801) {
                arg2.field1194 += arg0.method7964() << 16;
                var37 = 16777215;
            } else {
                var37 = 65535;
            }
            if (arg2.field1194 == var37) {
                arg2.field1194 = -1;
            }
        }
        if (!arg2.field1133) {
            return;
        }
        if (var4 == 127) {
            arg2.method2249(arg2.field1134, arg2.field1135);
            return;
        }
        class209 var39;
        if (class209.field2364.field2360 == var4) {
            var39 = field1341[arg1];
        } else {
            class209[] var38 = new class209[] { class209.field2361, class209.field2364, class209.field2363, class209.field2367 };
            var39 = (class209) class351.method19(var38, var4);
        }
        arg2.method2254(arg2.field1134, arg2.field1135, var39);
    }
}
