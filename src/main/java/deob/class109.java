package deob;

@ObfuscatedName("er")
public class class109 {

    @ObfuscatedName("er.af")
    public static byte[] field1383 = new byte[2048];

    @ObfuscatedName("er.at")
    public static class234[] field1384 = new class234[2048];

    @ObfuscatedName("er.an")
    public static class535[] field1396 = new class535[2048];

    @ObfuscatedName("er.ao")
    public static int field1398 = 0;

    @ObfuscatedName("er.ab")
    public static int[] field1387 = new int[2048];

    @ObfuscatedName("er.aw")
    public static int field1388 = 0;

    @ObfuscatedName("er.ad")
    public static int[] field1389 = new int[2048];

    @ObfuscatedName("er.al")
    public static int[] field1394 = new int[2048];

    @ObfuscatedName("er.as")
    public static int[] field1391 = new int[2048];

    @ObfuscatedName("er.ag")
    public static int[] field1392 = new int[2048];

    @ObfuscatedName("er.ai")
    public static int field1395 = 0;

    @ObfuscatedName("er.ax")
    public static int[] field1397 = new int[2048];

    @ObfuscatedName("er.ar")
    public static class535 field1385 = new class535(new byte[5000]);

    public class109() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dv.az(Lun;I)V")
    public static final void method2204(class534 arg0) {
        arg0.method8435();
        int var1 = client.field578;
        class93 var2 = Statics.field1608 = client.field636[var1] = new class93();
        var2.field1144 = var1;
        int var3 = arg0.method8421(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field1271[0] = var5 - Statics.field481;
        var2.field1220 = (var2.field1271[0] << 7) + (var2.method2236() << 6);
        var2.field1272[0] = var6 - Statics.field99;
        var2.field1260 = (var2.field1272[0] << 7) + (var2.method2236() << 6);
        Statics.field1861 = var2.field1143 = var4;
        if (field1396[var1] != null) {
            var2.method2245(field1396[var1]);
        }
        field1398 = 0;
        field1387[++field1398 - 1] = var1;
        field1383[var1] = 0;
        field1388 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method8421(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1394[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1391[var7] = 0;
                field1392[var7] = -1;
                field1389[++field1388 - 1] = var7;
                field1383[var7] = 0;
            }
        }
        arg0.method8407();
    }

    @ObfuscatedName("kn.at(Lun;I)I")
    public static int method5145(class534 arg0) {
        int var1 = arg0.method8421(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method8421(5);
        } else if (var1 == 2) {
            var2 = arg0.method8421(8);
        } else {
            var2 = arg0.method8421(11);
        }
        return var2;
    }

    @ObfuscatedName("dh.an(Lun;IB)V")
    public static void method2334(class534 arg0, int arg1) {
        boolean var2 = arg0.method8421(1) == 1;
        if (var2) {
            field1397[++field1395 - 1] = arg1;
        }
        int var3 = arg0.method8421(2);
        class93 var4 = client.field636[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field1148 = false;
            } else if (client.field578 == arg1) {
                throw new RuntimeException();
            } else {
                field1394[arg1] = (Statics.field99 + var4.field1272[0] >> 13) + (Statics.field481 + var4.field1271[0] >> 13 << 14) + (var4.field1143 << 28);
                if (var4.field1273 == -1) {
                    field1391[arg1] = var4.field1267;
                } else {
                    field1391[arg1] = var4.field1273;
                }
                field1392[arg1] = var4.field1235;
                client.field636[arg1] = null;
                if (arg0.method8421(1) != 0) {
                    Statics.method6247(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method8421(3);
            int var6 = var4.field1271[0];
            int var7 = var4.field1272[0];
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
            if (client.field578 == arg1 && var4.field1220 < 1536 || var4.field1260 < 1536 || var4.field1220 >= 11776 || var4.field1260 >= 11776) {
                var4.method2238(var6, var7);
                var4.field1148 = false;
            } else if (var2) {
                var4.field1148 = true;
                var4.field1149 = var6;
                var4.field1152 = var7;
            } else {
                var4.field1148 = false;
                var4.method2237(var6, var7, field1384[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method8421(4);
            int var9 = var4.field1271[0];
            int var10 = var4.field1272[0];
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
            if (client.field578 == arg1 && var4.field1220 < 1536 || var4.field1260 < 1536 || var4.field1220 >= 11776 || var4.field1260 >= 11776) {
                var4.method2238(var9, var10);
                var4.field1148 = false;
            } else if (var2) {
                var4.field1148 = true;
                var4.field1149 = var9;
                var4.field1152 = var10;
            } else {
                var4.field1148 = false;
                var4.method2237(var9, var10, field1384[arg1]);
            }
        } else {
            int var11 = arg0.method8421(1);
            if (var11 == 0) {
                int var12 = arg0.method8421(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field1271[0] + var14;
                int var17 = var4.field1272[0] + var15;
                if (client.field578 == arg1 && var4.field1220 < 1536 || var4.field1260 < 1536 || var4.field1220 >= 11776 || var4.field1260 >= 11776) {
                    var4.method2238(var16, var17);
                    var4.field1148 = false;
                } else if (var2) {
                    var4.field1148 = true;
                    var4.field1149 = var16;
                    var4.field1152 = var17;
                } else {
                    var4.field1148 = false;
                    var4.method2237(var16, var17, field1384[arg1]);
                }
                var4.field1143 = (byte) (var4.field1143 + var13 & 0x3);
                if (client.field578 == arg1) {
                    Statics.field1861 = var4.field1143;
                }
            } else {
                int var18 = arg0.method8421(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field481 + var4.field1271[0] + var20 & 0x3FFF) - Statics.field481;
                int var23 = (Statics.field99 + var4.field1272[0] + var21 & 0x3FFF) - Statics.field99;
                if (client.field578 == arg1 && var4.field1220 < 1536 || var4.field1260 < 1536 || var4.field1220 >= 11776 || var4.field1260 >= 11776) {
                    var4.method2238(var22, var23);
                    var4.field1148 = false;
                } else if (var2) {
                    var4.field1148 = true;
                    var4.field1149 = var22;
                    var4.field1152 = var23;
                } else {
                    var4.field1148 = false;
                    var4.method2237(var22, var23, field1384[arg1]);
                }
                var4.field1143 = (byte) (var4.field1143 + var19 & 0x3);
                if (client.field578 == arg1) {
                    Statics.field1861 = var4.field1143;
                }
            }
        }
    }

    @ObfuscatedName("hd.ab(Lun;ILdi;II)V")
    public static final void method3526(class534 arg0, int arg1, class93 arg2, int arg3) {
        byte var4 = class234.field2489.field2483;
        if ((arg3 & 0x2) != 0) {
            arg2.field1273 = arg0.method8670();
            if (arg2.field1274 == 0) {
                arg2.field1267 = arg2.field1273;
                arg2.method2308();
            }
        }
        if ((arg3 & 0x10) != 0) {
            int var5 = arg0.method8515();
            class373 var6 = (class373) class393.method3484(class373.method6211(), arg0.method8495());
            boolean var7 = arg0.method8497() == 1;
            int var8 = arg0.method8497();
            int var9 = arg0.field5233;
            if (arg2.field1142 != null && arg2.field1123 != null) {
                boolean var10 = false;
                if (var6.field4354 && Statics.field3621.method1781(arg2.field1142)) {
                    var10 = true;
                }
                if (!var10 && client.field751 == 0 && !arg2.field1122) {
                    field1385.field5233 = 0;
                    arg0.method8476(field1385.field5231, 0, var8);
                    field1385.field5233 = 0;
                    String var11 = class418.method7015(class407.method4735(class353.method5708(field1385)));
                    arg2.field1211 = var11.trim();
                    arg2.field1225 = var5 >> 8;
                    arg2.field1226 = var5 & 0xFF;
                    arg2.field1224 = 150;
                    arg2.field1263 = null;
                    arg2.field1253 = var7;
                    arg2.field1223 = Statics.field1608 != arg2 && var6.field4354 && !client.field746.isEmpty() && var11.toLowerCase().indexOf(client.field746) == -1;
                    int var12;
                    if (var6.field4339) {
                        var12 = var7 ? 91 : 1;
                    } else {
                        var12 = var7 ? 90 : 2;
                    }
                    if (var6.field4341 == -1) {
                        class112.method2177(var12, arg2.field1142.method9077(), var11);
                    } else {
                        class112.method2177(var12, class103.method6233(var6.field4341) + arg2.field1142.method9077(), var11);
                    }
                }
            }
            arg0.field5233 = var8 + var9;
        }
        if ((arg3 & 0x80) != 0) {
            int var13 = arg0.method8515();
            if (var13 == 65535) {
                var13 = -1;
            }
            int var14 = arg0.method8497();
            client.method3335(arg2, var13, var14);
        }
        if ((arg3 & 0x20) != 0) {
            int var15 = arg0.method8497();
            if (var15 > 0) {
                for (int var16 = 0; var16 < var15; var16++) {
                    int var17 = -1;
                    int var18 = -1;
                    int var19 = -1;
                    int var20 = arg0.method8676();
                    if (var20 == 32767) {
                        var20 = arg0.method8676();
                        var18 = arg0.method8676();
                        var17 = arg0.method8676();
                        var19 = arg0.method8676();
                    } else if (var20 == 32766) {
                        var20 = -1;
                    } else {
                        var18 = arg0.method8676();
                    }
                    int var21 = arg0.method8676();
                    arg2.method2287(var20, var18, var17, var19, client.field523, var21);
                }
            }
            int var22 = arg0.method8495();
            if (var22 > 0) {
                for (int var23 = 0; var23 < var22; var23++) {
                    int var24 = arg0.method8676();
                    int var25 = arg0.method8676();
                    if (var25 == 32767) {
                        arg2.method2288(var24);
                    } else {
                        int var26 = arg0.method8676();
                        int var27 = arg0.method8462();
                        int var28 = var25 > 0 ? arg0.method8495() : var27;
                        arg2.method2296(var24, client.field523, var25, var26, var27, var28);
                    }
                }
            }
        }
        if ((arg3 & 0x4000) != 0) {
            arg2.field1252 = arg0.method8499();
            arg2.field1239 = arg0.method8513();
            arg2.field1259 = arg0.method8513();
            arg2.field1254 = arg0.method8498();
            arg2.field1256 = arg0.method8670() + client.field523;
            arg2.field1257 = arg0.method8670() + client.field523;
            arg2.field1204 = arg0.method8577();
            if (arg2.field1148) {
                arg2.field1252 += arg2.field1149;
                arg2.field1239 += arg2.field1152;
                arg2.field1259 += arg2.field1149;
                arg2.field1254 += arg2.field1152;
                arg2.field1274 = 0;
            } else {
                arg2.field1252 += arg2.field1271[0];
                arg2.field1239 += arg2.field1272[0];
                arg2.field1259 += arg2.field1271[0];
                arg2.field1254 += arg2.field1272[0];
                arg2.field1274 = 1;
            }
            arg2.field1275 = 0;
        }
        if ((arg3 & 0x400) != 0) {
            int var29 = arg0.method8577();
            int var30 = var29 >> 8;
            int var31 = var30 >= 13 && var30 <= 20 ? var30 - 12 : 0;
            class373 var32 = (class373) class393.method3484(class373.method6211(), arg0.method8659());
            boolean var33 = arg0.method8462() == 1;
            int var34 = arg0.method8495();
            int var35 = arg0.field5233;
            if (arg2.field1142 != null && arg2.field1123 != null) {
                boolean var36 = false;
                if (var32.field4354 && Statics.field3621.method1781(arg2.field1142)) {
                    var36 = true;
                }
                if (!var36 && client.field751 == 0 && !arg2.field1122) {
                    field1385.field5233 = 0;
                    arg0.method8476(field1385.field5231, 0, var34);
                    field1385.field5233 = 0;
                    String var37 = class418.method7015(class407.method4735(class353.method5708(field1385)));
                    arg2.field1211 = var37.trim();
                    arg2.field1225 = var29 >> 8;
                    arg2.field1226 = var29 & 0xFF;
                    arg2.field1224 = 150;
                    byte[] var38 = null;
                    if (var31 > 0 && var31 <= 8) {
                        var38 = new byte[var31];
                        for (int var39 = 0; var39 < var31; var39++) {
                            var38[var39] = arg0.method8463();
                        }
                    }
                    arg2.field1263 = Statics.method7618(var38);
                    arg2.field1253 = var33;
                    arg2.field1223 = Statics.field1608 != arg2 && var32.field4354 && !client.field746.isEmpty() && var37.toLowerCase().indexOf(client.field746) == -1;
                    int var40;
                    if (var32.field4339) {
                        var40 = var33 ? 91 : 1;
                    } else {
                        var40 = var33 ? 90 : 2;
                    }
                    if (var32.field4341 == -1) {
                        class112.method2177(var40, arg2.field1142.method9077(), var37);
                    } else {
                        class112.method2177(var40, class103.method6233(var32.field4341) + arg2.field1142.method9077(), var37);
                    }
                }
            }
            arg0.field5233 = var34 + var35 + var31;
        }
        if ((arg3 & 0x1000) != 0) {
            var4 = arg0.method8513();
        }
        if ((arg3 & 0x100) != 0) {
            for (int var41 = 0; var41 < 3; var41++) {
                arg2.field1126[var41] = arg0.method8473();
            }
        }
        if ((arg3 & 0x8) != 0) {
            arg2.field1211 = arg0.method8473();
            if (arg2.field1211.charAt(0) == '~') {
                arg2.field1211 = arg2.field1211.substring(1);
                class112.method2177(2, arg2.field1142.method9077(), arg2.field1211);
            } else if (Statics.field1608 == arg2) {
                class112.method2177(2, arg2.field1142.method9077(), arg2.field1211);
            }
            arg2.field1253 = false;
            arg2.field1225 = 0;
            arg2.field1226 = 0;
            arg2.field1224 = 150;
        }
        if ((arg3 & 0x2000) != 0) {
            arg2.field1261 = client.field523 + arg0.method8515();
            arg2.field1237 = client.field523 + arg0.method8577();
            arg2.field1262 = arg0.method8499();
            arg2.field1264 = arg0.method8463();
            arg2.field1236 = arg0.method8463();
            arg2.field1266 = (byte) arg0.method8659();
        }
        if ((arg3 & 0x200) != 0) {
            field1384[arg1] = (class234) class393.method3484(class234.method2995(), arg0.method8463());
        }
        if ((arg3 & 0x4) != 0) {
            int var42 = arg0.method8659();
            byte[] var43 = new byte[var42];
            class535 var44 = new class535(var43);
            arg0.method8517(var43, 0, var42);
            field1396[arg1] = var44;
            arg2.method2245(var44);
        }
        if ((arg3 & 0x40) != 0) {
            arg2.field1235 = arg0.method8515();
            arg2.field1235 += arg0.method8659() << 16;
            int var45 = 16777215;
            if (arg2.field1235 == var45) {
                arg2.field1235 = -1;
            }
        }
        if ((arg3 & 0x10000) != 0) {
            int var46 = arg0.method8497();
            for (int var47 = 0; var47 < var46; var47++) {
                int var48 = arg0.method8495();
                int var49 = arg0.method8670();
                int var50 = arg0.method8711();
                arg2.method2303(var48, var49, var50 >> 16, var50 & 0xFFFF);
            }
        }
        if (!arg2.field1148) {
            return;
        }
        if (var4 == 127) {
            arg2.method2238(arg2.field1149, arg2.field1152);
            return;
        }
        class234 var51;
        if (class234.field2489.field2483 == var4) {
            var51 = field1384[arg1];
        } else {
            var51 = (class234) class393.method3484(class234.method2995(), var4);
        }
        arg2.method2237(arg2.field1149, arg2.field1152, var51);
    }
}
