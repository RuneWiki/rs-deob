package deob;

@ObfuscatedName("eh")
public class class107 {

    @ObfuscatedName("eh.av")
    public static byte[] field1331 = new byte[2048];

    @ObfuscatedName("eh.as")
    public static class217[] field1329 = new class217[2048];

    @ObfuscatedName("eh.ax")
    public static class501[] field1333 = new class501[2048];

    @ObfuscatedName("eh.ap")
    public static int field1332 = 0;

    @ObfuscatedName("eh.ab")
    public static int[] field1335 = new int[2048];

    @ObfuscatedName("eh.ak")
    public static int field1347 = 0;

    @ObfuscatedName("eh.ae")
    public static int[] field1337 = new int[2048];

    @ObfuscatedName("eh.af")
    public static int[] field1338 = new int[2048];

    @ObfuscatedName("eh.ao")
    public static int[] field1336 = new int[2048];

    @ObfuscatedName("eh.aa")
    public static int[] field1340 = new int[2048];

    @ObfuscatedName("eh.aj")
    public static int field1334 = 0;

    @ObfuscatedName("eh.ad")
    public static int[] field1342 = new int[2048];

    @ObfuscatedName("eh.ac")
    public static class501 field1343 = new class501(new byte[5000]);

    public class107() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fs.at(Ltl;I)V")
    public static final void method3021(class500 arg0) {
        arg0.method8080();
        int var1 = client.field630;
        class92 var2 = Statics.field971 = client.field613[var1] = new class92();
        var2.field1121 = var1;
        int var3 = arg0.method8104(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field1223[0] = var5 - Statics.field2380;
        var2.field1163 = (var2.field1223[0] << 7) + (var2.method2183() << 6);
        var2.field1193[0] = var6 - Statics.field1302;
        var2.field1153 = (var2.field1193[0] << 7) + (var2.method2183() << 6);
        Statics.field1882 = var2.field1103 = var4;
        if (field1333[var1] != null) {
            var2.method2176(field1333[var1]);
        }
        field1332 = 0;
        field1335[++field1332 - 1] = var1;
        field1331[var1] = 0;
        field1347 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method8104(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1338[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1336[var7] = 0;
                field1340[var7] = -1;
                field1337[++field1347 - 1] = var7;
                field1331[var7] = 0;
            }
        }
        arg0.method8082();
    }

    @ObfuscatedName("ct.an(Ltl;II)V")
    public static final void method1969(class500 arg0, int arg1) {
        int var2 = arg0.field5017;
        field1334 = 0;
        method2695(arg0);
        for (int var3 = 0; var3 < field1334; var3++) {
            int var4 = field1342[var3];
            class92 var5 = client.field613[var4];
            int var6 = arg0.method8129();
            if ((var6 & 0x8) != 0) {
                var6 += arg0.method8129() << 8;
            }
            if ((var6 & 0x200) != 0) {
                var6 += arg0.method8129() << 16;
            }
            method2922(arg0, var4, var5, var6);
        }
        if (arg0.field5017 - var2 != arg1) {
            throw new RuntimeException(arg0.field5017 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("et.av(Ltl;B)V")
    public static final void method2695(class500 arg0) {
        int var1 = 0;
        arg0.method8080();
        for (int var2 = 0; var2 < field1332; var2++) {
            int var3 = field1335[var2];
            if ((field1331[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1331[var3] = (byte) (field1331[var3] | 0x2);
                } else {
                    int var4 = arg0.method8104(1);
                    if (var4 == 0) {
                        var1 = method2147(arg0);
                        field1331[var3] = (byte) (field1331[var3] | 0x2);
                    } else {
                        method1963(arg0, var3);
                    }
                }
            }
        }
        arg0.method8082();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method8080();
        for (int var5 = 0; var5 < field1332; var5++) {
            int var6 = field1335[var5];
            if ((field1331[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1331[var6] = (byte) (field1331[var6] | 0x2);
                } else {
                    int var7 = arg0.method8104(1);
                    if (var7 == 0) {
                        var1 = method2147(arg0);
                        field1331[var6] = (byte) (field1331[var6] | 0x2);
                    } else {
                        method1963(arg0, var6);
                    }
                }
            }
        }
        arg0.method8082();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method8080();
        for (int var8 = 0; var8 < field1347; var8++) {
            int var9 = field1337[var8];
            if ((field1331[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1331[var9] = (byte) (field1331[var9] | 0x2);
                } else {
                    int var10 = arg0.method8104(1);
                    if (var10 == 0) {
                        var1 = method2147(arg0);
                        field1331[var9] = (byte) (field1331[var9] | 0x2);
                    } else if (method2715(arg0, var9)) {
                        field1331[var9] = (byte) (field1331[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method8082();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method8080();
        for (int var11 = 0; var11 < field1347; var11++) {
            int var12 = field1337[var11];
            if ((field1331[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1331[var12] = (byte) (field1331[var12] | 0x2);
                } else {
                    int var13 = arg0.method8104(1);
                    if (var13 == 0) {
                        var1 = method2147(arg0);
                        field1331[var12] = (byte) (field1331[var12] | 0x2);
                    } else if (method2715(arg0, var12)) {
                        field1331[var12] = (byte) (field1331[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method8082();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field1332 = 0;
        field1347 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            field1331[var14] = (byte) (field1331[var14] >> 1);
            class92 var15 = client.field613[var14];
            if (var15 == null) {
                field1337[++field1347 - 1] = var14;
            } else {
                field1335[++field1332 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("dx.as(Ltl;I)I")
    public static int method2147(class500 arg0) {
        int var1 = arg0.method8104(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method8104(5);
        } else if (var1 == 2) {
            var2 = arg0.method8104(8);
        } else {
            var2 = arg0.method8104(11);
        }
        return var2;
    }

    @ObfuscatedName("cl.ax(Ltl;II)V")
    public static void method1963(class500 arg0, int arg1) {
        boolean var2 = arg0.method8104(1) == 1;
        if (var2) {
            field1342[++field1334 - 1] = arg1;
        }
        int var3 = arg0.method8104(2);
        class92 var4 = client.field613[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field1125 = false;
            } else if (client.field630 == arg1) {
                throw new RuntimeException();
            } else {
                field1338[arg1] = (Statics.field1302 + var4.field1193[0] >> 13) + (Statics.field2380 + var4.field1223[0] >> 13 << 14) + (var4.field1103 << 28);
                if (var4.field1229 == -1) {
                    field1336[arg1] = var4.field1219;
                } else {
                    field1336[arg1] = var4.field1229;
                }
                field1340[arg1] = var4.field1187;
                client.field613[arg1] = null;
                if (arg0.method8104(1) != 0) {
                    method2715(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method8104(3);
            int var6 = var4.field1223[0];
            int var7 = var4.field1193[0];
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
            if (client.field630 == arg1 && var4.field1163 < 1536 || var4.field1153 < 1536 || var4.field1163 >= 11776 || var4.field1153 >= 11776) {
                var4.method2185(var6, var7);
                var4.field1125 = false;
            } else if (var2) {
                var4.field1125 = true;
                var4.field1126 = var6;
                var4.field1127 = var7;
            } else {
                var4.field1125 = false;
                var4.method2189(var6, var7, field1329[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method8104(4);
            int var9 = var4.field1223[0];
            int var10 = var4.field1193[0];
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
            if (client.field630 == arg1 && var4.field1163 < 1536 || var4.field1153 < 1536 || var4.field1163 >= 11776 || var4.field1153 >= 11776) {
                var4.method2185(var9, var10);
                var4.field1125 = false;
            } else if (var2) {
                var4.field1125 = true;
                var4.field1126 = var9;
                var4.field1127 = var10;
            } else {
                var4.field1125 = false;
                var4.method2189(var9, var10, field1329[arg1]);
            }
        } else {
            int var11 = arg0.method8104(1);
            if (var11 == 0) {
                int var12 = arg0.method8104(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field1223[0] + var14;
                int var17 = var4.field1193[0] + var15;
                if (client.field630 == arg1 && var4.field1163 < 1536 || var4.field1153 < 1536 || var4.field1163 >= 11776 || var4.field1153 >= 11776) {
                    var4.method2185(var16, var17);
                    var4.field1125 = false;
                } else if (var2) {
                    var4.field1125 = true;
                    var4.field1126 = var16;
                    var4.field1127 = var17;
                } else {
                    var4.field1125 = false;
                    var4.method2189(var16, var17, field1329[arg1]);
                }
                var4.field1103 = (byte) (var4.field1103 + var13 & 0x3);
                if (client.field630 == arg1) {
                    Statics.field1882 = var4.field1103;
                }
            } else {
                int var18 = arg0.method8104(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field2380 + var4.field1223[0] + var20 & 0x3FFF) - Statics.field2380;
                int var23 = (Statics.field1302 + var4.field1193[0] + var21 & 0x3FFF) - Statics.field1302;
                if (client.field630 == arg1 && var4.field1163 < 1536 || var4.field1153 < 1536 || var4.field1163 >= 11776 || var4.field1153 >= 11776) {
                    var4.method2185(var22, var23);
                    var4.field1125 = false;
                } else if (var2) {
                    var4.field1125 = true;
                    var4.field1126 = var22;
                    var4.field1127 = var23;
                } else {
                    var4.field1125 = false;
                    var4.method2189(var22, var23, field1329[arg1]);
                }
                var4.field1103 = (byte) (var4.field1103 + var19 & 0x3);
                if (client.field630 == arg1) {
                    Statics.field1882 = var4.field1103;
                }
            }
        }
    }

    @ObfuscatedName("el.ap(Ltl;IS)Z")
    public static boolean method2715(class500 arg0, int arg1) {
        int var2 = arg0.method8104(2);
        if (var2 == 0) {
            if (arg0.method8104(1) != 0) {
                method2715(arg0, arg1);
            }
            int var3 = arg0.method8104(13);
            int var4 = arg0.method8104(13);
            boolean var5 = arg0.method8104(1) == 1;
            if (var5) {
                field1342[++field1334 - 1] = arg1;
            }
            if (client.field613[arg1] != null) {
                throw new RuntimeException();
            }
            class92 var6 = client.field613[arg1] = new class92();
            var6.field1121 = arg1;
            if (field1333[arg1] != null) {
                var6.method2176(field1333[arg1]);
            }
            var6.field1219 = field1336[arg1];
            var6.field1187 = field1340[arg1];
            int var7 = field1338[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field1213[0] = field1329[arg1];
            var6.field1103 = (byte) var8;
            var6.method2185((var9 << 13) + var3 - Statics.field2380, (var10 << 13) + var4 - Statics.field1302);
            var6.field1125 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method8104(2);
            int var12 = field1338[arg1];
            field1338[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method8104(5);
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
            int var20 = arg0.method8104(18);
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

    @ObfuscatedName("fp.ab(Ltl;ILdh;II)V")
    public static final void method2922(class500 arg0, int arg1, class92 arg2, int arg3) {
        byte var4 = class217.field2398.field2394;
        if ((arg3 & 0x20) != 0) {
            int var5 = arg0.method8172();
            if (var5 == 65535) {
                var5 = -1;
            }
            int var6 = arg0.method8161();
            client.method5146(arg2, var5, var6);
        }
        if ((arg3 & 0x100) != 0) {
            int var7 = arg0.method8170();
            int var8 = var7 >> 8;
            int var9 = var8 >= 13 && var8 <= 20 ? var8 - 12 : 0;
            class352 var10 = (class352) class371.method4632(Statics.method3344(), arg0.method8161());
            boolean var11 = arg0.method8129() == 1;
            int var12 = arg0.method8161();
            int var13 = arg0.field5017;
            if (arg2.field1112 != null && arg2.field1100 != null) {
                boolean var14 = false;
                if (var10.field4217 && Statics.field497.method1720(arg2.field1112)) {
                    var14 = true;
                }
                if (!var14 && client.field627 == 0 && !arg2.field1115) {
                    field1343.field5017 = 0;
                    arg0.method8261(field1343.field5016, 0, var12);
                    field1343.field5017 = 0;
                    String var15 = class396.method6779(class385.method5130(class333.method211(field1343)));
                    arg2.field1173 = var15.trim();
                    arg2.field1190 = var7 >> 8;
                    arg2.field1178 = var7 & 0xFF;
                    arg2.field1215 = 150;
                    byte[] var16 = null;
                    if (var9 > 0 && var9 <= 8) {
                        var16 = new byte[var9];
                        for (int var17 = 0; var17 < var9; var17++) {
                            var16[var17] = arg0.method8242();
                        }
                    }
                    arg2.field1225 = class526.method3118(var16);
                    arg2.field1166 = var11;
                    arg2.field1175 = Statics.field971 != arg2 && var10.field4217 && client.field737 != "" && var15.toLowerCase().indexOf(client.field737) == -1;
                    int var18;
                    if (var10.field4199) {
                        var18 = var11 ? 91 : 1;
                    } else {
                        var18 = var11 ? 90 : 2;
                    }
                    if (var10.field4215 == -1) {
                        class110.method1047(var18, arg2.field1112.method8756(), var15);
                    } else {
                        class110.method1047(var18, class101.method2497(var10.field4215) + arg2.field1112.method8756(), var15);
                    }
                }
            }
            arg0.field5017 = var12 + var13 + var9;
        }
        if ((arg3 & 0x4000) != 0) {
            var4 = arg0.method8191();
        }
        if ((arg3 & 0x10000) != 0) {
            int var19 = arg0.method8163();
            for (int var20 = 0; var20 < var19; var20++) {
                int var21 = arg0.method8129();
                int var22 = arg0.method8170();
                int var23 = arg0.method8138();
                arg2.method2249(var21, var22, var23 >> 16, var23 & 0xFFFF);
            }
        }
        if ((arg3 & 0x1000) != 0) {
            for (int var24 = 0; var24 < 3; var24++) {
                arg2.field1120[var24] = arg0.method8253();
            }
        }
        if ((arg3 & 0x800) != 0) {
            class217[] var25 = field1329;
            class217[] var27 = new class217[] { class217.field2395, class217.field2396, class217.field2397, class217.field2398 };
            var25[arg1] = (class217) class371.method4632(var27, arg0.method8242());
        }
        if ((arg3 & 0x40) != 0) {
            int var28 = arg0.method8195();
            class352 var29 = (class352) class371.method4632(Statics.method3344(), arg0.method8161());
            boolean var30 = arg0.method8162() == 1;
            int var31 = arg0.method8129();
            int var32 = arg0.field5017;
            if (arg2.field1112 != null && arg2.field1100 != null) {
                boolean var33 = false;
                if (var29.field4217 && Statics.field497.method1720(arg2.field1112)) {
                    var33 = true;
                }
                if (!var33 && client.field627 == 0 && !arg2.field1115) {
                    field1343.field5017 = 0;
                    arg0.method8261(field1343.field5016, 0, var31);
                    field1343.field5017 = 0;
                    String var34 = class396.method6779(class385.method5130(class333.method211(field1343)));
                    arg2.field1173 = var34.trim();
                    arg2.field1190 = var28 >> 8;
                    arg2.field1178 = var28 & 0xFF;
                    arg2.field1215 = 150;
                    arg2.field1225 = null;
                    arg2.field1166 = var30;
                    arg2.field1175 = Statics.field971 != arg2 && var29.field4217 && client.field737 != "" && var34.toLowerCase().indexOf(client.field737) == -1;
                    int var35;
                    if (var29.field4199) {
                        var35 = var30 ? 91 : 1;
                    } else {
                        var35 = var30 ? 90 : 2;
                    }
                    if (var29.field4215 == -1) {
                        class110.method1047(var35, arg2.field1112.method8756(), var34);
                    } else {
                        class110.method1047(var35, class101.method2497(var29.field4215) + arg2.field1112.method8756(), var34);
                    }
                }
            }
            arg0.field5017 = var31 + var32;
        }
        if ((arg3 & 0x1) != 0) {
            int var36 = arg0.method8161();
            if (var36 > 0) {
                for (int var37 = 0; var37 < var36; var37++) {
                    int var38 = -1;
                    int var39 = -1;
                    int var40 = -1;
                    int var41 = arg0.method8144();
                    if (var41 == 32767) {
                        var41 = arg0.method8144();
                        var39 = arg0.method8144();
                        var38 = arg0.method8144();
                        var40 = arg0.method8144();
                    } else if (var41 == 32766) {
                        var41 = -1;
                    } else {
                        var39 = arg0.method8144();
                    }
                    int var42 = arg0.method8144();
                    arg2.method2246(var41, var39, var38, var40, client.field506, var42);
                }
            }
            int var43 = arg0.method8162();
            if (var43 > 0) {
                for (int var44 = 0; var44 < var43; var44++) {
                    int var45 = arg0.method8144();
                    int var46 = arg0.method8144();
                    if (var46 == 32767) {
                        arg2.method2248(var45);
                    } else {
                        int var47 = arg0.method8144();
                        int var48 = arg0.method8163();
                        int var49 = var46 > 0 ? arg0.method8163() : var48;
                        arg2.method2269(var45, client.field506, var46, var47, var48, var49);
                    }
                }
            }
        }
        if ((arg3 & 0x10) != 0) {
            arg2.field1187 = arg0.method8170();
            arg2.field1187 += arg0.method8161() << 16;
            int var50 = 16777215;
            if (arg2.field1187 == var50) {
                arg2.field1187 = -1;
            }
        }
        if ((arg3 & 0x400) != 0) {
            arg2.field1204 = arg0.method8242();
            arg2.field1206 = arg0.method8191();
            arg2.field1174 = arg0.method8242();
            arg2.field1207 = arg0.method8130();
            arg2.field1212 = arg0.method8250() + client.field506;
            arg2.field1209 = arg0.method8195() + client.field506;
            arg2.field1210 = arg0.method8170();
            if (arg2.field1125) {
                arg2.field1204 += arg2.field1126;
                arg2.field1206 += arg2.field1127;
                arg2.field1174 += arg2.field1126;
                arg2.field1207 += arg2.field1127;
                arg2.field1222 = 0;
            } else {
                arg2.field1204 += arg2.field1223[0];
                arg2.field1206 += arg2.field1193[0];
                arg2.field1174 += arg2.field1223[0];
                arg2.field1207 += arg2.field1193[0];
                arg2.field1222 = 1;
            }
            arg2.field1227 = 0;
        }
        if ((arg3 & 0x80) != 0) {
            arg2.field1173 = arg0.method8253();
            if (arg2.field1173.charAt(0) == '~') {
                arg2.field1173 = arg2.field1173.substring(1);
                class110.method1047(2, arg2.field1112.method8756(), arg2.field1173);
            } else if (Statics.field971 == arg2) {
                class110.method1047(2, arg2.field1112.method8756(), arg2.field1173);
            }
            arg2.field1166 = false;
            arg2.field1190 = 0;
            arg2.field1178 = 0;
            arg2.field1215 = 150;
        }
        if ((arg3 & 0x4) != 0) {
            int var51 = arg0.method8163();
            byte[] var52 = new byte[var51];
            class501 var53 = new class501(var52);
            arg0.method8375(var52, 0, var51);
            field1333[arg1] = var53;
            arg2.method2176(var53);
        }
        if ((arg3 & 0x2) != 0) {
            arg2.field1229 = arg0.method8172();
            if (arg2.field1222 == 0) {
                arg2.field1219 = arg2.field1229;
                arg2.method2258();
            }
        }
        if ((arg3 & 0x8000) != 0) {
            arg2.field1171 = client.field506 + arg0.method8195();
            arg2.field1214 = client.field506 + arg0.method8195();
            arg2.field1165 = arg0.method8130();
            arg2.field1216 = arg0.method8191();
            arg2.field1197 = arg0.method8130();
            arg2.field1218 = (byte) arg0.method8129();
        }
        if (!arg2.field1125) {
            return;
        }
        if (var4 == 127) {
            arg2.method2185(arg2.field1126, arg2.field1127);
            return;
        }
        class217 var55;
        if (class217.field2398.field2394 == var4) {
            var55 = field1329[arg1];
        } else {
            class217[] var54 = new class217[] { class217.field2395, class217.field2396, class217.field2397, class217.field2398 };
            var55 = (class217) class371.method4632(var54, var4);
        }
        arg2.method2189(arg2.field1126, arg2.field1127, var55);
    }

    @ObfuscatedName("do.ak(I)V")
    public static void method2163() {
        field1332 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field1333[var0] = null;
            field1329[var0] = class217.field2396;
        }
    }
}
