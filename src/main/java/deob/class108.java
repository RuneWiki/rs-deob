package deob;

@ObfuscatedName("ec")
public class class108 {

    @ObfuscatedName("ec.af")
    public static byte[] field1356 = new byte[2048];

    @ObfuscatedName("ec.aj")
    public static class232[] field1349 = new class232[2048];

    @ObfuscatedName("ec.aq")
    public static class531[] field1348 = new class531[2048];

    @ObfuscatedName("ec.ar")
    public static int field1351 = 0;

    @ObfuscatedName("ec.ag")
    public static int[] field1357 = new int[2048];

    @ObfuscatedName("ec.ao")
    public static int field1353 = 0;

    @ObfuscatedName("ec.ae")
    public static int[] field1354 = new int[2048];

    @ObfuscatedName("ec.aa")
    public static int[] field1355 = new int[2048];

    @ObfuscatedName("ec.au")
    public static int[] field1360 = new int[2048];

    @ObfuscatedName("ec.an")
    public static int[] field1350 = new int[2048];

    @ObfuscatedName("ec.ad")
    public static int field1358 = 0;

    @ObfuscatedName("ec.ax")
    public static int[] field1359 = new int[2048];

    @ObfuscatedName("ec.aw")
    public static class531 field1352 = new class531(new byte[5000]);

    public class108() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("lo.am(Luo;I)V")
    public static final void method5414(class530 arg0) {
        arg0.method8525();
        int var1 = client.field625;
        class92 var2 = Statics.field133 = client.field738[var1] = new class92();
        var2.field1120 = var1;
        int var3 = arg0.method8509(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field1243[0] = var5 - Statics.field1900;
        var2.field1232 = (var2.field1243[0] << 7) + (var2.method2303() << 6);
        var2.field1244[0] = var6 - Statics.field2683;
        var2.field1173 = (var2.field1244[0] << 7) + (var2.method2303() << 6);
        Statics.field1428 = var2.field1111 = var4;
        if (field1348[var1] != null) {
            var2.method2324(field1348[var1]);
        }
        field1351 = 0;
        field1357[++field1351 - 1] = var1;
        field1356[var1] = 0;
        field1353 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method8509(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1355[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1360[var7] = 0;
                field1350[var7] = -1;
                field1354[++field1353 - 1] = var7;
                field1356[var7] = 0;
            }
        }
        arg0.method8505();
    }

    @ObfuscatedName("ov.ap(Luo;II)V")
    public static final void method6632(class530 arg0, int arg1) {
        int var2 = arg0.field5181;
        field1358 = 0;
        int var3 = 0;
        arg0.method8525();
        for (int var4 = 0; var4 < field1351; var4++) {
            int var5 = field1357[var4];
            if ((field1356[var5] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field1356[var5] = (byte) (field1356[var5] | 0x2);
                } else {
                    int var6 = arg0.method8509(1);
                    if (var6 == 0) {
                        int var7 = arg0.method8509(2);
                        int var8;
                        if (var7 == 0) {
                            var8 = 0;
                        } else if (var7 == 1) {
                            var8 = arg0.method8509(5);
                        } else if (var7 == 2) {
                            var8 = arg0.method8509(8);
                        } else {
                            var8 = arg0.method8509(11);
                        }
                        var3 = var8;
                        field1356[var5] = (byte) (field1356[var5] | 0x2);
                    } else {
                        method8409(arg0, var5);
                    }
                }
            }
        }
        arg0.method8505();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method8525();
        for (int var10 = 0; var10 < field1351; var10++) {
            int var11 = field1357[var10];
            if ((field1356[var11] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field1356[var11] = (byte) (field1356[var11] | 0x2);
                } else {
                    int var12 = arg0.method8509(1);
                    if (var12 == 0) {
                        int var13 = arg0.method8509(2);
                        int var14;
                        if (var13 == 0) {
                            var14 = 0;
                        } else if (var13 == 1) {
                            var14 = arg0.method8509(5);
                        } else if (var13 == 2) {
                            var14 = arg0.method8509(8);
                        } else {
                            var14 = arg0.method8509(11);
                        }
                        var3 = var14;
                        field1356[var11] = (byte) (field1356[var11] | 0x2);
                    } else {
                        method8409(arg0, var11);
                    }
                }
            }
        }
        arg0.method8505();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method8525();
        for (int var16 = 0; var16 < field1353; var16++) {
            int var17 = field1354[var16];
            if ((field1356[var17] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field1356[var17] = (byte) (field1356[var17] | 0x2);
                } else {
                    int var18 = arg0.method8509(1);
                    if (var18 == 0) {
                        int var19 = arg0.method8509(2);
                        int var20;
                        if (var19 == 0) {
                            var20 = 0;
                        } else if (var19 == 1) {
                            var20 = arg0.method8509(5);
                        } else if (var19 == 2) {
                            var20 = arg0.method8509(8);
                        } else {
                            var20 = arg0.method8509(11);
                        }
                        var3 = var20;
                        field1356[var17] = (byte) (field1356[var17] | 0x2);
                    } else if (method2661(arg0, var17)) {
                        field1356[var17] = (byte) (field1356[var17] | 0x2);
                    }
                }
            }
        }
        arg0.method8505();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method8525();
        for (int var22 = 0; var22 < field1353; var22++) {
            int var23 = field1354[var22];
            if ((field1356[var23] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field1356[var23] = (byte) (field1356[var23] | 0x2);
                } else {
                    int var24 = arg0.method8509(1);
                    if (var24 == 0) {
                        int var25 = arg0.method8509(2);
                        int var26;
                        if (var25 == 0) {
                            var26 = 0;
                        } else if (var25 == 1) {
                            var26 = arg0.method8509(5);
                        } else if (var25 == 2) {
                            var26 = arg0.method8509(8);
                        } else {
                            var26 = arg0.method8509(11);
                        }
                        var3 = var26;
                        field1356[var23] = (byte) (field1356[var23] | 0x2);
                    } else if (method2661(arg0, var23)) {
                        field1356[var23] = (byte) (field1356[var23] | 0x2);
                    }
                }
            }
        }
        arg0.method8505();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        field1351 = 0;
        field1353 = 0;
        for (int var28 = 1; var28 < 2048; var28++) {
            field1356[var28] = (byte) (field1356[var28] >> 1);
            class92 var29 = client.field738[var28];
            if (var29 == null) {
                field1354[++field1353 - 1] = var28;
            } else {
                field1357[++field1351 - 1] = var28;
            }
        }
        method851(arg0);
        if (arg0.field5181 - var2 != arg1) {
            throw new RuntimeException(arg0.field5181 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("tx.af(Luo;II)V")
    public static void method8409(class530 arg0, int arg1) {
        boolean var2 = arg0.method8509(1) == 1;
        if (var2) {
            field1359[++field1358 - 1] = arg1;
        }
        int var3 = arg0.method8509(2);
        class92 var4 = client.field738[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field1125 = false;
            } else if (client.field625 == arg1) {
                throw new RuntimeException();
            } else {
                field1355[arg1] = (Statics.field2683 + var4.field1244[0] >> 13) + (Statics.field1900 + var4.field1243[0] >> 13 << 14) + (var4.field1111 << 28);
                if (var4.field1209 == -1) {
                    field1360[arg1] = var4.field1239;
                } else {
                    field1360[arg1] = var4.field1209;
                }
                field1350[arg1] = var4.field1207;
                client.field738[arg1] = null;
                if (arg0.method8509(1) != 0) {
                    method2661(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method8509(3);
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
            if (client.field625 == arg1 && var4.field1232 < 1536 || var4.field1173 < 1536 || var4.field1232 >= 11776 || var4.field1173 >= 11776) {
                var4.method2306(var6, var7);
                var4.field1125 = false;
            } else if (var2) {
                var4.field1125 = true;
                var4.field1114 = var6;
                var4.field1127 = var7;
            } else {
                var4.field1125 = false;
                var4.method2332(var6, var7, field1349[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method8509(4);
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
            if (client.field625 == arg1 && var4.field1232 < 1536 || var4.field1173 < 1536 || var4.field1232 >= 11776 || var4.field1173 >= 11776) {
                var4.method2306(var9, var10);
                var4.field1125 = false;
            } else if (var2) {
                var4.field1125 = true;
                var4.field1114 = var9;
                var4.field1127 = var10;
            } else {
                var4.field1125 = false;
                var4.method2332(var9, var10, field1349[arg1]);
            }
        } else {
            int var11 = arg0.method8509(1);
            if (var11 == 0) {
                int var12 = arg0.method8509(12);
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
                if (client.field625 == arg1 && var4.field1232 < 1536 || var4.field1173 < 1536 || var4.field1232 >= 11776 || var4.field1173 >= 11776) {
                    var4.method2306(var16, var17);
                    var4.field1125 = false;
                } else if (var2) {
                    var4.field1125 = true;
                    var4.field1114 = var16;
                    var4.field1127 = var17;
                } else {
                    var4.field1125 = false;
                    var4.method2332(var16, var17, field1349[arg1]);
                }
                var4.field1111 = (byte) (var4.field1111 + var13 & 0x3);
                if (client.field625 == arg1) {
                    Statics.field1428 = var4.field1111;
                }
            } else {
                int var18 = arg0.method8509(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field1900 + var4.field1243[0] + var20 & 0x3FFF) - Statics.field1900;
                int var23 = (Statics.field2683 + var4.field1244[0] + var21 & 0x3FFF) - Statics.field2683;
                if (client.field625 == arg1 && var4.field1232 < 1536 || var4.field1173 < 1536 || var4.field1232 >= 11776 || var4.field1173 >= 11776) {
                    var4.method2306(var22, var23);
                    var4.field1125 = false;
                } else if (var2) {
                    var4.field1125 = true;
                    var4.field1114 = var22;
                    var4.field1127 = var23;
                } else {
                    var4.field1125 = false;
                    var4.method2332(var22, var23, field1349[arg1]);
                }
                var4.field1111 = (byte) (var4.field1111 + var19 & 0x3);
                if (client.field625 == arg1) {
                    Statics.field1428 = var4.field1111;
                }
            }
        }
    }

    @ObfuscatedName("ec.aj(Luo;II)Z")
    public static boolean method2661(class530 arg0, int arg1) {
        int var2 = arg0.method8509(2);
        if (var2 == 0) {
            if (arg0.method8509(1) != 0) {
                method2661(arg0, arg1);
            }
            int var3 = arg0.method8509(13);
            int var4 = arg0.method8509(13);
            boolean var5 = arg0.method8509(1) == 1;
            if (var5) {
                field1359[++field1358 - 1] = arg1;
            }
            if (client.field738[arg1] != null) {
                throw new RuntimeException();
            }
            class92 var6 = client.field738[arg1] = new class92();
            var6.field1120 = arg1;
            if (field1348[arg1] != null) {
                var6.method2324(field1348[arg1]);
            }
            var6.field1239 = field1360[arg1];
            var6.field1207 = field1350[arg1];
            int var7 = field1355[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field1220[0] = field1349[arg1];
            var6.field1111 = (byte) var8;
            var6.method2306((var9 << 13) + var3 - Statics.field1900, (var10 << 13) + var4 - Statics.field2683);
            var6.field1125 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method8509(2);
            int var12 = field1355[arg1];
            field1355[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method8509(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1355[arg1];
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
            field1355[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method8509(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1355[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1355[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("bw.aq(Luo;I)V")
    public static final void method851(class530 arg0) {
        for (int var1 = 0; var1 < field1358; var1++) {
            int var2 = field1359[var1];
            class92 var3 = client.field738[var2];
            int var4 = arg0.method8561();
            if ((var4 & 0x80) != 0) {
                var4 += arg0.method8561() << 8;
            }
            if ((var4 & 0x4000) != 0) {
                var4 += arg0.method8561() << 16;
            }
            byte var5 = class232.field2461.field2458;
            if ((var4 & 0x1) != 0) {
                var3.field1196 = arg0.method8641();
                if (var3.field1196.charAt(0) == '~') {
                    var3.field1196 = var3.field1196.substring(1);
                    class111.method6511(2, var3.field1117.method9164(), var3.field1196);
                } else if (Statics.field133 == var3) {
                    class111.method6511(2, var3.field1117.method9164(), var3.field1196);
                }
                var3.field1203 = false;
                var3.field1186 = 0;
                var3.field1198 = 0;
                var3.field1213 = 150;
            }
            if ((var4 & 0x2) != 0) {
                var3.field1209 = arg0.method8712();
                if (var3.field1242 == 0) {
                    var3.field1239 = var3.field1209;
                    var3.method2360();
                }
            }
            if ((var4 & 0x40) != 0) {
                var3.field1207 = arg0.method8775();
                var3.field1207 += arg0.method8561() << 16;
                int var6 = 16777215;
                if (var3.field1207 == var6) {
                    var3.field1207 = -1;
                }
            }
            if ((var4 & 0x10) != 0) {
                int var7 = arg0.method8712();
                class370 var8 = (class370) class389.method6514(class370.method3391(), arg0.method8700());
                boolean var9 = arg0.method8700() == 1;
                int var10 = arg0.method8594();
                int var11 = arg0.field5181;
                if (var3.field1117 != null && var3.field1099 != null) {
                    boolean var12 = false;
                    if (var8.field4315 && Statics.field3588.method1866(var3.field1117)) {
                        var12 = true;
                    }
                    if (!var12 && client.field622 == 0 && !var3.field1119) {
                        field1352.field5181 = 0;
                        arg0.method8707(field1352.field5178, 0, var10);
                        field1352.field5181 = 0;
                        String var13 = class414.method7167(class403.method3221(class354.method6284(field1352)));
                        var3.field1196 = var13.trim();
                        var3.field1186 = var7 >> 8;
                        var3.field1198 = var7 & 0xFF;
                        var3.field1213 = 150;
                        var3.field1199 = null;
                        var3.field1203 = var9;
                        var3.field1195 = Statics.field133 != var3 && var8.field4315 && !client.field734.isEmpty() && var13.toLowerCase().indexOf(client.field734) == -1;
                        int var14;
                        if (var8.field4318) {
                            var14 = var9 ? 91 : 1;
                        } else {
                            var14 = var9 ? 90 : 2;
                        }
                        if (var8.field4317 == -1) {
                            class111.method6511(var14, var3.field1117.method9164(), var13);
                        } else {
                            class111.method6511(var14, class102.method4121(var8.field4317) + var3.field1117.method9164(), var13);
                        }
                    }
                }
                arg0.field5181 = var10 + var11;
            }
            if ((var4 & 0x8) != 0) {
                int var15 = arg0.method8604();
                if (var15 == 65535) {
                    var15 = -1;
                }
                int var16 = arg0.method8561();
                client.method6310(var3, var15, var16);
            }
            if ((var4 & 0x8000) != 0) {
                int var17 = arg0.method8712();
                int var18 = var17 >> 8;
                int var19 = var18 >= 13 && var18 <= 20 ? var18 - 12 : 0;
                class370 var20 = (class370) class389.method6514(class370.method3391(), arg0.method8594());
                boolean var21 = arg0.method8700() == 1;
                int var22 = arg0.method8594();
                int var23 = arg0.field5181;
                if (var3.field1117 != null && var3.field1099 != null) {
                    boolean var24 = false;
                    if (var20.field4315 && Statics.field3588.method1866(var3.field1117)) {
                        var24 = true;
                    }
                    if (!var24 && client.field622 == 0 && !var3.field1119) {
                        field1352.field5181 = 0;
                        arg0.method8707(field1352.field5178, 0, var22);
                        field1352.field5181 = 0;
                        String var25 = class414.method7167(class403.method3221(class354.method6284(field1352)));
                        var3.field1196 = var25.trim();
                        var3.field1186 = var17 >> 8;
                        var3.field1198 = var17 & 0xFF;
                        var3.field1213 = 150;
                        byte[] var26 = null;
                        if (var19 > 0 && var19 <= 8) {
                            var26 = new byte[var19];
                            for (int var27 = 0; var27 < var19; var27++) {
                                var26[var27] = arg0.method8596();
                            }
                        }
                        var3.field1199 = class555.method7368(var26);
                        var3.field1203 = var21;
                        var3.field1195 = Statics.field133 != var3 && var20.field4315 && !client.field734.isEmpty() && var25.toLowerCase().indexOf(client.field734) == -1;
                        int var28;
                        if (var20.field4318) {
                            var28 = var21 ? 91 : 1;
                        } else {
                            var28 = var21 ? 90 : 2;
                        }
                        if (var20.field4317 == -1) {
                            class111.method6511(var28, var3.field1117.method9164(), var25);
                        } else {
                            class111.method6511(var28, class102.method4121(var20.field4317) + var3.field1117.method9164(), var25);
                        }
                    }
                }
                arg0.field5181 = var22 + var23 + var19;
            }
            if ((var4 & 0x20) != 0) {
                int var29 = arg0.method8594();
                if (var29 > 0) {
                    for (int var30 = 0; var30 < var29; var30++) {
                        int var31 = -1;
                        int var32 = -1;
                        int var33 = -1;
                        int var34 = arg0.method8576();
                        if (var34 == 32767) {
                            var34 = arg0.method8576();
                            var32 = arg0.method8576();
                            var31 = arg0.method8576();
                            var33 = arg0.method8576();
                        } else if (var34 == 32766) {
                            var34 = -1;
                        } else {
                            var32 = arg0.method8576();
                        }
                        int var35 = arg0.method8576();
                        var3.method2386(var34, var32, var31, var33, client.field677, var35);
                    }
                }
                int var36 = arg0.method8700();
                if (var36 > 0) {
                    for (int var37 = 0; var37 < var36; var37++) {
                        int var38 = arg0.method8576();
                        int var39 = arg0.method8576();
                        if (var39 == 32767) {
                            var3.method2375(var38);
                        } else {
                            int var40 = arg0.method8576();
                            int var41 = arg0.method8700();
                            int var42 = var39 > 0 ? arg0.method8594() : var41;
                            var3.method2355(var38, client.field677, var39, var40, var41, var42);
                        }
                    }
                }
            }
            if ((var4 & 0x1000) != 0) {
                class232[] var43 = field1349;
                class232[] var45 = new class232[] { class232.field2460, class232.field2459, class232.field2461, class232.field2457 };
                var43[var2] = (class232) class389.method6514(var45, arg0.method8597());
            }
            if ((var4 & 0x4) != 0) {
                int var46 = arg0.method8594();
                byte[] var47 = new byte[var46];
                class531 var48 = new class531(var47);
                arg0.method8707(var47, 0, var46);
                field1348[var2] = var48;
                var3.method2324(var48);
            }
            if ((var4 & 0x800) != 0) {
                for (int var49 = 0; var49 < 3; var49++) {
                    var3.field1103[var49] = arg0.method8641();
                }
            }
            if ((var4 & 0x400) != 0) {
                var3.field1224 = arg0.method8620();
                var3.field1226 = arg0.method8620();
                var3.field1225 = arg0.method8597();
                var3.field1227 = arg0.method8596();
                var3.field1228 = arg0.method8604() + client.field677;
                var3.field1229 = arg0.method8775() + client.field677;
                var3.field1174 = arg0.method8604();
                if (var3.field1125) {
                    var3.field1224 += var3.field1114;
                    var3.field1226 += var3.field1127;
                    var3.field1225 += var3.field1114;
                    var3.field1227 += var3.field1127;
                    var3.field1242 = 0;
                } else {
                    var3.field1224 += var3.field1243[0];
                    var3.field1226 += var3.field1244[0];
                    var3.field1225 += var3.field1243[0];
                    var3.field1227 += var3.field1244[0];
                    var3.field1242 = 1;
                }
                var3.field1216 = 0;
            }
            if ((var4 & 0x2000) != 0) {
                var5 = arg0.method8620();
            }
            if ((var4 & 0x10000) != 0) {
                int var50 = arg0.method8593();
                for (int var51 = 0; var51 < var50; var51++) {
                    int var52 = arg0.method8561();
                    int var53 = arg0.method8775();
                    int var54 = arg0.method8615();
                    var3.method2368(var52, var53, var54 >> 16, var54 & 0xFFFF);
                }
            }
            if ((var4 & 0x200) != 0) {
                var3.field1181 = client.field677 + arg0.method8712();
                var3.field1234 = client.field677 + arg0.method8712();
                var3.field1235 = arg0.method8620();
                var3.field1194 = arg0.method8562();
                var3.field1205 = arg0.method8596();
                var3.field1238 = (byte) arg0.method8594();
            }
            if (var3.field1125) {
                if (var5 == 127) {
                    var3.method2306(var3.field1114, var3.field1127);
                } else {
                    class232 var56;
                    if (class232.field2461.field2458 == var5) {
                        var56 = field1349[var2];
                    } else {
                        class232[] var55 = new class232[] { class232.field2460, class232.field2459, class232.field2461, class232.field2457 };
                        var56 = (class232) class389.method6514(var55, var5);
                    }
                    var3.method2332(var3.field1114, var3.field1127, var56);
                }
            }
        }
    }
}
