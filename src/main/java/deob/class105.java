package deob;

@ObfuscatedName("en")
public class class105 {

    @ObfuscatedName("en.ac")
    public static byte[] field1337 = new byte[2048];

    @ObfuscatedName("en.ab")
    public static class212[] field1333 = new class212[2048];

    @ObfuscatedName("en.an")
    public static class478[] field1336 = new class478[2048];

    @ObfuscatedName("en.ao")
    public static int field1342 = 0;

    @ObfuscatedName("en.av")
    public static int[] field1344 = new int[2048];

    @ObfuscatedName("en.aq")
    public static int field1340 = 0;

    @ObfuscatedName("en.ap")
    public static int[] field1338 = new int[2048];

    @ObfuscatedName("en.ar")
    public static int[] field1339 = new int[2048];

    @ObfuscatedName("en.ak")
    public static int[] field1335 = new int[2048];

    @ObfuscatedName("en.ax")
    public static int[] field1341 = new int[2048];

    @ObfuscatedName("en.as")
    public static int field1334 = 0;

    @ObfuscatedName("en.ay")
    public static int[] field1343 = new int[2048];

    @ObfuscatedName("en.am")
    public static class478 field1331 = new class478(new byte[5000]);

    public class105() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("mo.aj(Lsq;I)V")
    public static final void method5741(class477 arg0) {
        arg0.method7847();
        int var1 = client.field603;
        class90 var2 = Statics.field1440 = client.field758[var1] = new class90();
        var2.field1108 = var1;
        int var3 = arg0.method7853(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field1212[0] = var5 - Statics.field218;
        var2.field1200 = (var2.field1212[0] << 7) + (var2.method2197() << 6);
        var2.field1171[0] = var6 - Statics.field1865;
        var2.field1205 = (var2.field1171[0] << 7) + (var2.method2197() << 6);
        Statics.field1812 = var2.field1102 = var4;
        if (field1336[var1] != null) {
            var2.method2189(field1336[var1]);
        }
        field1342 = 0;
        field1344[++field1342 - 1] = var1;
        field1337[var1] = 0;
        field1340 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method7853(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1339[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1335[var7] = 0;
                field1341[var7] = -1;
                field1338[++field1340 - 1] = var7;
                field1337[var7] = 0;
            }
        }
        arg0.method7866();
    }

    @ObfuscatedName("jn.al(Lsq;II)V")
    public static final void method4787(class477 arg0, int arg1) {
        int var2 = arg0.field4904;
        field1334 = 0;
        method4779(arg0);
        for (int var3 = 0; var3 < field1334; var3++) {
            int var4 = field1343[var3];
            class90 var5 = client.field758[var4];
            int var6 = arg0.method7909();
            if ((var6 & 0x2) != 0) {
                var6 += arg0.method7909() << 8;
            }
            method4205(arg0, var4, var5, var6);
        }
        if (arg0.field4904 - var2 != arg1) {
            throw new RuntimeException(arg0.field4904 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("jl.ac(Lsq;I)V")
    public static final void method4779(class477 arg0) {
        int var1 = 0;
        arg0.method7847();
        for (int var2 = 0; var2 < field1342; var2++) {
            int var3 = field1344[var2];
            if ((field1337[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1337[var3] = (byte) (field1337[var3] | 0x2);
                } else {
                    int var4 = arg0.method7853(1);
                    if (var4 == 0) {
                        var1 = method7562(arg0);
                        field1337[var3] = (byte) (field1337[var3] | 0x2);
                    } else {
                        method2521(arg0, var3);
                    }
                }
            }
        }
        arg0.method7866();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method7847();
        for (int var5 = 0; var5 < field1342; var5++) {
            int var6 = field1344[var5];
            if ((field1337[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1337[var6] = (byte) (field1337[var6] | 0x2);
                } else {
                    int var7 = arg0.method7853(1);
                    if (var7 == 0) {
                        var1 = method7562(arg0);
                        field1337[var6] = (byte) (field1337[var6] | 0x2);
                    } else {
                        method2521(arg0, var6);
                    }
                }
            }
        }
        arg0.method7866();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method7847();
        for (int var8 = 0; var8 < field1340; var8++) {
            int var9 = field1338[var8];
            if ((field1337[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1337[var9] = (byte) (field1337[var9] | 0x2);
                } else {
                    int var10 = arg0.method7853(1);
                    if (var10 == 0) {
                        var1 = method7562(arg0);
                        field1337[var9] = (byte) (field1337[var9] | 0x2);
                    } else if (method3061(arg0, var9)) {
                        field1337[var9] = (byte) (field1337[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method7866();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method7847();
        for (int var11 = 0; var11 < field1340; var11++) {
            int var12 = field1338[var11];
            if ((field1337[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1337[var12] = (byte) (field1337[var12] | 0x2);
                } else {
                    int var13 = arg0.method7853(1);
                    if (var13 == 0) {
                        var1 = method7562(arg0);
                        field1337[var12] = (byte) (field1337[var12] | 0x2);
                    } else if (method3061(arg0, var12)) {
                        field1337[var12] = (byte) (field1337[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method7866();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field1342 = 0;
        field1340 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            field1337[var14] = (byte) (field1337[var14] >> 1);
            class90 var15 = client.field758[var14];
            if (var15 == null) {
                field1338[++field1340 - 1] = var14;
            } else {
                field1344[++field1342 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("rs.ab(Lsq;I)I")
    public static int method7562(class477 arg0) {
        int var1 = arg0.method7853(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method7853(5);
        } else if (var1 == 2) {
            var2 = arg0.method7853(8);
        } else {
            var2 = arg0.method7853(11);
        }
        return var2;
    }

    @ObfuscatedName("dy.an(Lsq;II)V")
    public static void method2521(class477 arg0, int arg1) {
        boolean var2 = arg0.method7853(1) == 1;
        if (var2) {
            field1343[++field1334 - 1] = arg1;
        }
        int var3 = arg0.method7853(2);
        class90 var4 = client.field758[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field1112 = false;
            } else if (client.field603 == arg1) {
                throw new RuntimeException();
            } else {
                field1339[arg1] = (Statics.field1865 + var4.field1171[0] >> 13) + (Statics.field218 + var4.field1212[0] >> 13 << 14) + (var4.field1102 << 28);
                if (var4.field1165 == -1) {
                    field1335[arg1] = var4.field1208;
                } else {
                    field1335[arg1] = var4.field1165;
                }
                field1341[arg1] = var4.field1173;
                client.field758[arg1] = null;
                if (arg0.method7853(1) != 0) {
                    method3061(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method7853(3);
            int var6 = var4.field1212[0];
            int var7 = var4.field1171[0];
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
            if (client.field603 == arg1 && var4.field1200 < 1536 || var4.field1205 < 1536 || var4.field1200 >= 11776 || var4.field1205 >= 11776) {
                var4.method2202(var6, var7);
                var4.field1112 = false;
            } else if (var2) {
                var4.field1112 = true;
                var4.field1113 = var6;
                var4.field1114 = var7;
            } else {
                var4.field1112 = false;
                var4.method2227(var6, var7, field1333[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method7853(4);
            int var9 = var4.field1212[0];
            int var10 = var4.field1171[0];
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
            if (client.field603 == arg1 && var4.field1200 < 1536 || var4.field1205 < 1536 || var4.field1200 >= 11776 || var4.field1205 >= 11776) {
                var4.method2202(var9, var10);
                var4.field1112 = false;
            } else if (var2) {
                var4.field1112 = true;
                var4.field1113 = var9;
                var4.field1114 = var10;
            } else {
                var4.field1112 = false;
                var4.method2227(var9, var10, field1333[arg1]);
            }
        } else {
            int var11 = arg0.method7853(1);
            if (var11 == 0) {
                int var12 = arg0.method7853(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field1212[0] + var14;
                int var17 = var4.field1171[0] + var15;
                if (client.field603 == arg1 && var4.field1200 < 1536 || var4.field1205 < 1536 || var4.field1200 >= 11776 || var4.field1205 >= 11776) {
                    var4.method2202(var16, var17);
                    var4.field1112 = false;
                } else if (var2) {
                    var4.field1112 = true;
                    var4.field1113 = var16;
                    var4.field1114 = var17;
                } else {
                    var4.field1112 = false;
                    var4.method2227(var16, var17, field1333[arg1]);
                }
                var4.field1102 = (byte) (var4.field1102 + var13 & 0x3);
                if (client.field603 == arg1) {
                    Statics.field1812 = var4.field1102;
                }
            } else {
                int var18 = arg0.method7853(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field218 + var4.field1212[0] + var20 & 0x3FFF) - Statics.field218;
                int var23 = (Statics.field1865 + var4.field1171[0] + var21 & 0x3FFF) - Statics.field1865;
                if (client.field603 == arg1 && var4.field1200 < 1536 || var4.field1205 < 1536 || var4.field1200 >= 11776 || var4.field1205 >= 11776) {
                    var4.method2202(var22, var23);
                    var4.field1112 = false;
                } else if (var2) {
                    var4.field1112 = true;
                    var4.field1113 = var22;
                    var4.field1114 = var23;
                } else {
                    var4.field1112 = false;
                    var4.method2227(var22, var23, field1333[arg1]);
                }
                var4.field1102 = (byte) (var4.field1102 + var19 & 0x3);
                if (client.field603 == arg1) {
                    Statics.field1812 = var4.field1102;
                }
            }
        }
    }

    @ObfuscatedName("gk.ao(Lsq;II)Z")
    public static boolean method3061(class477 arg0, int arg1) {
        int var2 = arg0.method7853(2);
        if (var2 == 0) {
            if (arg0.method7853(1) != 0) {
                method3061(arg0, arg1);
            }
            int var3 = arg0.method7853(13);
            int var4 = arg0.method7853(13);
            boolean var5 = arg0.method7853(1) == 1;
            if (var5) {
                field1343[++field1334 - 1] = arg1;
            }
            if (client.field758[arg1] != null) {
                throw new RuntimeException();
            }
            class90 var6 = client.field758[arg1] = new class90();
            var6.field1108 = arg1;
            if (field1336[arg1] != null) {
                var6.method2189(field1336[arg1]);
            }
            var6.field1208 = field1335[arg1];
            var6.field1173 = field1341[arg1];
            int var7 = field1339[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field1214[0] = field1333[arg1];
            var6.field1102 = (byte) var8;
            var6.method2202((var9 << 13) + var3 - Statics.field218, (var10 << 13) + var4 - Statics.field1865);
            var6.field1112 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method7853(2);
            int var12 = field1339[arg1];
            field1339[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method7853(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1339[arg1];
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
            field1339[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method7853(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1339[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1339[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("iw.av(Lsq;ILdh;II)V")
    public static final void method4205(class477 arg0, int arg1, class90 arg2, int arg3) {
        byte var4 = class212.field2337.field2339;
        if ((arg3 & 0x2000) != 0) {
            arg2.field1148 = arg0.method8115();
            int var5 = arg0.method8008();
            arg2.field1192 = var5 >> 16;
            arg2.field1191 = (var5 & 0xFFFF) + client.field494;
            arg2.field1188 = 0;
            arg2.field1176 = 0;
            if (arg2.field1191 > client.field494) {
                arg2.field1188 = -1;
            }
            if (arg2.field1148 == 65535) {
                arg2.field1148 = -1;
            }
        }
        if ((arg3 & 0x40) != 0) {
            int var6 = arg0.method7909();
            byte[] var7 = new byte[var6];
            class478 var8 = new class478(var7);
            arg0.method7892(var7, 0, var6);
            field1336[arg1] = var8;
            arg2.method2189(var8);
        }
        if ((arg3 & 0x1000) != 0) {
            arg2.field1193 = arg0.method7938();
            arg2.field1195 = arg0.method7938();
            arg2.field1203 = arg0.method7938();
            arg2.field1196 = arg0.method7888();
            arg2.field1197 = arg0.method7905() + client.field494;
            arg2.field1198 = arg0.method7946() + client.field494;
            arg2.field1163 = arg0.method7944();
            if (arg2.field1112) {
                arg2.field1193 += arg2.field1113;
                arg2.field1195 += arg2.field1114;
                arg2.field1203 += arg2.field1113;
                arg2.field1196 += arg2.field1114;
                arg2.field1211 = 0;
            } else {
                arg2.field1193 += arg2.field1212[0];
                arg2.field1195 += arg2.field1171[0];
                arg2.field1203 += arg2.field1212[0];
                arg2.field1196 += arg2.field1171[0];
                arg2.field1211 = 1;
            }
            arg2.field1216 = 0;
        }
        if ((arg3 & 0x4) != 0) {
            int var9 = arg0.method7898();
            if (var9 > 0) {
                for (int var10 = 0; var10 < var9; var10++) {
                    int var11 = -1;
                    int var12 = -1;
                    int var13 = -1;
                    int var14 = arg0.method7918();
                    if (var14 == 32767) {
                        var14 = arg0.method7918();
                        var12 = arg0.method7918();
                        var11 = arg0.method7918();
                        var13 = arg0.method7918();
                    } else if (var14 == 32766) {
                        var14 = -1;
                    } else {
                        var12 = arg0.method7918();
                    }
                    int var15 = arg0.method7918();
                    arg2.method2249(var14, var12, var11, var13, client.field494, var15);
                }
            }
            int var16 = arg0.method7935();
            if (var16 > 0) {
                for (int var17 = 0; var17 < var16; var17++) {
                    int var18 = arg0.method7918();
                    int var19 = arg0.method7918();
                    if (var19 == 32767) {
                        arg2.method2252(var18);
                    } else {
                        int var20 = arg0.method7918();
                        int var21 = arg0.method7898();
                        int var22 = var19 > 0 ? arg0.method7898() : var21;
                        arg2.method2262(var18, client.field494, var19, var20, var21, var22);
                    }
                }
            }
        }
        if ((arg3 & 0x100) != 0) {
            var4 = arg0.method7940();
        }
        if ((arg3 & 0x1) != 0) {
            int var23 = arg0.method8115();
            class335 var24 = (class335) class354.method5197(class335.method3793(), arg0.method7898());
            boolean var25 = arg0.method7934() == 1;
            int var26 = arg0.method7934();
            int var27 = arg0.field4904;
            if (arg2.field1104 != null && arg2.field1086 != null) {
                boolean var28 = false;
                if (var24.field4150 && Statics.field16.method1780(arg2.field1104)) {
                    var28 = true;
                }
                if (!var28 && client.field668 == 0 && !arg2.field1107) {
                    field1331.field4904 = 0;
                    arg0.method7959(field1331.field4906, 0, var26);
                    field1331.field4904 = 0;
                    String var29 = class379.method6555(class368.method465(class316.method4939(field1331)));
                    arg2.field1199 = var29.trim();
                    arg2.field1164 = var23 >> 8;
                    arg2.field1157 = var23 & 0xFF;
                    arg2.field1175 = 150;
                    arg2.field1161 = var25;
                    arg2.field1162 = Statics.field1440 != arg2 && var24.field4150 && client.field638 != "" && var29.toLowerCase().indexOf(client.field638) == -1;
                    int var30;
                    if (var24.field4149) {
                        var30 = var25 ? 91 : 1;
                    } else {
                        var30 = var25 ? 90 : 2;
                    }
                    if (var24.field4148 == -1) {
                        class108.method5191(var30, arg2.field1104.method8490(), var29);
                    } else {
                        class108.method5191(var30, class99.method50(var24.field4148) + arg2.field1104.method8490(), var29);
                    }
                }
            }
            arg0.field4904 = var26 + var27;
        }
        if ((arg3 & 0x4000) != 0) {
            field1333[arg1] = (class212) class354.method5197(class212.method3280(), arg0.method7938());
        }
        if ((arg3 & 0x10) != 0) {
            int var31 = arg0.method7905();
            if (var31 == 65535) {
                var31 = -1;
            }
            int var32 = arg0.method7934();
            client.method6063(arg2, var31, var32);
        }
        if ((arg3 & 0x800) != 0) {
            arg2.field1202 = client.field494 + arg0.method7905();
            arg2.field1160 = client.field494 + arg0.method7944();
            arg2.field1204 = arg0.method7938();
            arg2.field1186 = arg0.method8163();
            arg2.field1166 = arg0.method7888();
            arg2.field1207 = (byte) arg0.method7898();
        }
        if ((arg3 & 0x80) != 0) {
            arg2.field1165 = arg0.method8115();
            if (arg2.field1211 == 0) {
                arg2.field1208 = arg2.field1165;
                arg2.method2251();
            }
        }
        if ((arg3 & 0x20) != 0) {
            arg2.field1199 = arg0.method7950();
            if (arg2.field1199.charAt(0) == '~') {
                arg2.field1199 = arg2.field1199.substring(1);
                class108.method5191(2, arg2.field1104.method8490(), arg2.field1199);
            } else if (Statics.field1440 == arg2) {
                class108.method5191(2, arg2.field1104.method8490(), arg2.field1199);
            }
            arg2.field1161 = false;
            arg2.field1164 = 0;
            arg2.field1157 = 0;
            arg2.field1175 = 150;
        }
        if ((arg3 & 0x400) != 0) {
            for (int var33 = 0; var33 < 3; var33++) {
                arg2.field1090[var33] = arg0.method7950();
            }
        }
        if ((arg3 & 0x8) != 0) {
            arg2.field1173 = arg0.method7944();
            arg2.field1173 += arg0.method7934() << 16;
            int var34 = 16777215;
            if (arg2.field1173 == var34) {
                arg2.field1173 = -1;
            }
        }
        if (!arg2.field1112) {
            return;
        }
        if (var4 == 127) {
            arg2.method2202(arg2.field1113, arg2.field1114);
            return;
        }
        class212 var35;
        if (class212.field2337.field2339 == var4) {
            var35 = field1333[arg1];
        } else {
            var35 = (class212) class354.method5197(class212.method3280(), var4);
        }
        arg2.method2227(arg2.field1113, arg2.field1114, var35);
    }

    @ObfuscatedName("pp.aq(I)V")
    public static void method7099() {
        field1342 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field1336[var0] = null;
            field1333[var0] = class212.field2333;
        }
    }
}
