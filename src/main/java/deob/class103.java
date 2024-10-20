package deob;

@ObfuscatedName("cx")
public class class103 {

    @ObfuscatedName("cx.c")
    public static byte[] field1324 = new byte[2048];

    @ObfuscatedName("cx.x")
    public static class203[] field1315 = new class203[2048];

    @ObfuscatedName("cx.h")
    public static class464[] field1316 = new class464[2048];

    @ObfuscatedName("cx.j")
    public static int field1317 = 0;

    @ObfuscatedName("cx.y")
    public static int[] field1318 = new int[2048];

    @ObfuscatedName("cx.d")
    public static int field1322 = 0;

    @ObfuscatedName("cx.n")
    public static int[] field1320 = new int[2048];

    @ObfuscatedName("cx.r")
    public static int[] field1321 = new int[2048];

    @ObfuscatedName("cx.l")
    public static int[] field1319 = new int[2048];

    @ObfuscatedName("cx.s")
    public static int[] field1323 = new int[2048];

    @ObfuscatedName("cx.p")
    public static int field1312 = 0;

    @ObfuscatedName("cx.b")
    public static int[] field1325 = new int[2048];

    @ObfuscatedName("cx.o")
    public static class464 field1326 = new class464(new byte[5000]);

    public class103() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ih.a(Lqk;B)V")
    public static final void method4743(class463 arg0) {
        arg0.method7664();
        int var1 = client.field622;
        class89 var2 = Statics.field3404 = client.field621[var1] = new class89();
        var2.field1113 = var1;
        int var3 = arg0.method7665(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field1197[0] = var5 - Statics.field142;
        var2.field1163 = (var2.field1197[0] << 7) + (var2.method2176() << 6);
        var2.field1209[0] = var6 - Statics.field1754;
        var2.field1138 = (var2.field1209[0] << 7) + (var2.method2176() << 6);
        Statics.field478 = var2.field1112 = var4;
        if (field1316[var1] != null) {
            var2.method2166(field1316[var1]);
        }
        field1317 = 0;
        field1318[++field1317 - 1] = var1;
        field1324[var1] = 0;
        field1322 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method7665(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1321[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1319[var7] = 0;
                field1323[var7] = -1;
                field1320[++field1322 - 1] = var7;
                field1324[var7] = 0;
            }
        }
        arg0.method7661();
    }

    @ObfuscatedName("ih.f(Lqk;II)V")
    public static final void method4744(class463 arg0, int arg1) {
        int var2 = arg0.field4864;
        field1312 = 0;
        method3066(arg0);
        method292(arg0);
        if (arg0.field4864 - var2 != arg1) {
            throw new RuntimeException(arg0.field4864 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("fp.c(Lqk;B)V")
    public static final void method3066(class463 arg0) {
        int var1 = 0;
        arg0.method7664();
        for (int var2 = 0; var2 < field1317; var2++) {
            int var3 = field1318[var2];
            if ((field1324[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1324[var3] = (byte) (field1324[var3] | 0x2);
                } else {
                    int var4 = arg0.method7665(1);
                    if (var4 == 0) {
                        var1 = method1922(arg0);
                        field1324[var3] = (byte) (field1324[var3] | 0x2);
                    } else {
                        method1939(arg0, var3);
                    }
                }
            }
        }
        arg0.method7661();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method7664();
        for (int var5 = 0; var5 < field1317; var5++) {
            int var6 = field1318[var5];
            if ((field1324[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1324[var6] = (byte) (field1324[var6] | 0x2);
                } else {
                    int var7 = arg0.method7665(1);
                    if (var7 == 0) {
                        var1 = method1922(arg0);
                        field1324[var6] = (byte) (field1324[var6] | 0x2);
                    } else {
                        method1939(arg0, var6);
                    }
                }
            }
        }
        arg0.method7661();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method7664();
        for (int var8 = 0; var8 < field1322; var8++) {
            int var9 = field1320[var8];
            if ((field1324[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1324[var9] = (byte) (field1324[var9] | 0x2);
                } else {
                    int var10 = arg0.method7665(1);
                    if (var10 == 0) {
                        var1 = method1922(arg0);
                        field1324[var9] = (byte) (field1324[var9] | 0x2);
                    } else if (method7110(arg0, var9)) {
                        field1324[var9] = (byte) (field1324[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method7661();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method7664();
        for (int var11 = 0; var11 < field1322; var11++) {
            int var12 = field1320[var11];
            if ((field1324[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1324[var12] = (byte) (field1324[var12] | 0x2);
                } else {
                    int var13 = arg0.method7665(1);
                    if (var13 == 0) {
                        var1 = method1922(arg0);
                        field1324[var12] = (byte) (field1324[var12] | 0x2);
                    } else if (method7110(arg0, var12)) {
                        field1324[var12] = (byte) (field1324[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method7661();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field1317 = 0;
        field1322 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            field1324[var14] = (byte) (field1324[var14] >> 1);
            class89 var15 = client.field621[var14];
            if (var15 == null) {
                field1320[++field1322 - 1] = var14;
            } else {
                field1318[++field1317 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("be.x(Lqk;B)I")
    public static int method1922(class463 arg0) {
        int var1 = arg0.method7665(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method7665(5);
        } else if (var1 == 2) {
            var2 = arg0.method7665(8);
        } else {
            var2 = arg0.method7665(11);
        }
        return var2;
    }

    @ObfuscatedName("bj.h(Lqk;II)V")
    public static void method1939(class463 arg0, int arg1) {
        boolean var2 = arg0.method7665(1) == 1;
        if (var2) {
            field1325[++field1312 - 1] = arg1;
        }
        int var3 = arg0.method7665(2);
        class89 var4 = client.field621[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field1117 = false;
            } else if (client.field622 == arg1) {
                throw new RuntimeException();
            } else {
                field1321[arg1] = (Statics.field1754 + var4.field1209[0] >> 13) + (Statics.field142 + var4.field1197[0] >> 13 << 14) + (var4.field1112 << 28);
                if (var4.field1204 == -1) {
                    field1319[arg1] = var4.field1196;
                } else {
                    field1319[arg1] = var4.field1204;
                }
                field1323[arg1] = var4.field1171;
                client.field621[arg1] = null;
                if (arg0.method7665(1) != 0) {
                    method7110(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method7665(3);
            int var6 = var4.field1197[0];
            int var7 = var4.field1209[0];
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
            if (client.field622 == arg1 && var4.field1163 < 1536 || var4.field1138 < 1536 || var4.field1163 >= 11776 || var4.field1138 >= 11776) {
                var4.method2178(var6, var7);
                var4.field1117 = false;
            } else if (var2) {
                var4.field1117 = true;
                var4.field1118 = var6;
                var4.field1090 = var7;
            } else {
                var4.field1117 = false;
                var4.method2195(var6, var7, field1315[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method7665(4);
            int var9 = var4.field1197[0];
            int var10 = var4.field1209[0];
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
            if (client.field622 == arg1 && var4.field1163 < 1536 || var4.field1138 < 1536 || var4.field1163 >= 11776 || var4.field1138 >= 11776) {
                var4.method2178(var9, var10);
                var4.field1117 = false;
            } else if (var2) {
                var4.field1117 = true;
                var4.field1118 = var9;
                var4.field1090 = var10;
            } else {
                var4.field1117 = false;
                var4.method2195(var9, var10, field1315[arg1]);
            }
        } else {
            int var11 = arg0.method7665(1);
            if (var11 == 0) {
                int var12 = arg0.method7665(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field1197[0] + var14;
                int var17 = var4.field1209[0] + var15;
                if (client.field622 == arg1 && var4.field1163 < 1536 || var4.field1138 < 1536 || var4.field1163 >= 11776 || var4.field1138 >= 11776) {
                    var4.method2178(var16, var17);
                    var4.field1117 = false;
                } else if (var2) {
                    var4.field1117 = true;
                    var4.field1118 = var16;
                    var4.field1090 = var17;
                } else {
                    var4.field1117 = false;
                    var4.method2195(var16, var17, field1315[arg1]);
                }
                var4.field1112 = (byte) (var4.field1112 + var13 & 0x3);
                if (client.field622 == arg1) {
                    Statics.field478 = var4.field1112;
                }
            } else {
                int var18 = arg0.method7665(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field142 + var4.field1197[0] + var20 & 0x3FFF) - Statics.field142;
                int var23 = (Statics.field1754 + var4.field1209[0] + var21 & 0x3FFF) - Statics.field1754;
                if (client.field622 == arg1 && var4.field1163 < 1536 || var4.field1138 < 1536 || var4.field1163 >= 11776 || var4.field1138 >= 11776) {
                    var4.method2178(var22, var23);
                    var4.field1117 = false;
                } else if (var2) {
                    var4.field1117 = true;
                    var4.field1118 = var22;
                    var4.field1090 = var23;
                } else {
                    var4.field1117 = false;
                    var4.method2195(var22, var23, field1315[arg1]);
                }
                var4.field1112 = (byte) (var4.field1112 + var19 & 0x3);
                if (client.field622 == arg1) {
                    Statics.field478 = var4.field1112;
                }
            }
        }
    }

    @ObfuscatedName("oi.j(Lqk;II)Z")
    public static boolean method7110(class463 arg0, int arg1) {
        int var2 = arg0.method7665(2);
        if (var2 == 0) {
            if (arg0.method7665(1) != 0) {
                method7110(arg0, arg1);
            }
            int var3 = arg0.method7665(13);
            int var4 = arg0.method7665(13);
            boolean var5 = arg0.method7665(1) == 1;
            if (var5) {
                field1325[++field1312 - 1] = arg1;
            }
            if (client.field621[arg1] != null) {
                throw new RuntimeException();
            }
            class89 var6 = client.field621[arg1] = new class89();
            var6.field1113 = arg1;
            if (field1316[arg1] != null) {
                var6.method2166(field1316[arg1]);
            }
            var6.field1196 = field1319[arg1];
            var6.field1171 = field1323[arg1];
            int var7 = field1321[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field1139[0] = field1315[arg1];
            var6.field1112 = (byte) var8;
            var6.method2178((var9 << 13) + var3 - Statics.field142, (var10 << 13) + var4 - Statics.field1754);
            var6.field1117 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method7665(2);
            int var12 = field1321[arg1];
            field1321[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method7665(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1321[arg1];
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
            field1321[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method7665(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1321[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1321[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("i.y(Lqk;I)V")
    public static final void method292(class463 arg0) {
        for (int var1 = 0; var1 < field1312; var1++) {
            int var2 = field1325[var1];
            class89 var3 = client.field621[var2];
            int var4 = arg0.method7735();
            if ((var4 & 0x4) != 0) {
                var4 += arg0.method7735() << 8;
            }
            byte var5 = class203.field2288.field2286;
            if ((var4 & 0x10) != 0) {
                var3.field1171 = arg0.method7758();
                int var6;
                if (Statics.field973) {
                    var3.field1171 += arg0.method7935() << 16;
                    var6 = 16777215;
                } else {
                    var6 = 65535;
                }
                if (var3.field1171 == var6) {
                    var3.field1171 = -1;
                }
            }
            if ((var4 & 0x2) != 0) {
                var3.field1158 = arg0.method7725();
                if (var3.field1158.charAt(0) == '~') {
                    var3.field1158 = var3.field1158.substring(1);
                    Statics.method666(2, var3.field1108.method8298(), var3.field1158);
                } else if (Statics.field3404 == var3) {
                    Statics.method666(2, var3.field1108.method8298(), var3.field1158);
                }
                var3.field1178 = false;
                var3.field1137 = 0;
                var3.field1155 = 0;
                var3.field1179 = 150;
            }
            if ((var4 & 0x40) != 0) {
                int var7 = arg0.method7748();
                byte[] var8 = new byte[var7];
                class464 var9 = new class464(var8);
                arg0.method7927(var8, 0, var7);
                field1316[var2] = var9;
                var3.method2166(var9);
            }
            if ((var4 & 0x1000) != 0) {
                var5 = arg0.method7881();
            }
            if ((var4 & 0x8) != 0) {
                int var10 = arg0.method7796();
                if (var10 == 65535) {
                    var10 = -1;
                }
                int var11 = arg0.method7747();
                client.method7425(var3, var10, var11);
            }
            if ((var4 & 0x800) != 0) {
                var3.field1198 = client.field503 + arg0.method7756();
                var3.field1199 = client.field503 + arg0.method7758();
                var3.field1200 = arg0.method7881();
                var3.field1201 = arg0.method7929();
                var3.field1186 = arg0.method7881();
                var3.field1203 = (byte) arg0.method7935();
            }
            if ((var4 & 0x1) != 0) {
                var3.field1204 = arg0.method7716();
                if (var3.field1207 == 0) {
                    var3.field1196 = var3.field1204;
                    var3.field1204 = -1;
                }
            }
            if ((var4 & 0x4000) != 0) {
                var3.field1151 = arg0.method7781();
                var3.field1191 = arg0.method7929();
                var3.field1190 = arg0.method7929();
                var3.field1189 = arg0.method7781();
                var3.field1193 = arg0.method7758() + client.field503;
                var3.field1194 = arg0.method7756() + client.field503;
                var3.field1195 = arg0.method7716();
                if (var3.field1117) {
                    var3.field1151 += var3.field1118;
                    var3.field1191 += var3.field1090;
                    var3.field1190 += var3.field1118;
                    var3.field1189 += var3.field1090;
                    var3.field1207 = 0;
                } else {
                    var3.field1151 += var3.field1197[0];
                    var3.field1191 += var3.field1209[0];
                    var3.field1190 += var3.field1197[0];
                    var3.field1189 += var3.field1209[0];
                    var3.field1207 = 1;
                }
                var3.field1212 = 0;
            }
            if ((var4 & 0x20) != 0) {
                int var12 = arg0.method7935();
                if (var12 > 0) {
                    for (int var13 = 0; var13 < var12; var13++) {
                        int var14 = -1;
                        int var15 = -1;
                        int var16 = -1;
                        int var17 = arg0.method7801();
                        if (var17 == 32767) {
                            var17 = arg0.method7801();
                            var15 = arg0.method7801();
                            var14 = arg0.method7801();
                            var16 = arg0.method7801();
                        } else if (var17 == 32766) {
                            var17 = -1;
                        } else {
                            var15 = arg0.method7801();
                        }
                        int var18 = arg0.method7801();
                        var3.method2226(var17, var15, var14, var16, client.field503, var18);
                    }
                }
                int var19 = arg0.method7935();
                if (var19 > 0) {
                    for (int var20 = 0; var20 < var19; var20++) {
                        int var21 = arg0.method7801();
                        int var22 = arg0.method7801();
                        if (var22 == 32767) {
                            var3.method2222(var21);
                        } else {
                            int var23 = arg0.method7801();
                            int var24 = arg0.method7935();
                            int var25 = var22 > 0 ? arg0.method7735() : var24;
                            var3.method2219(var21, client.field503, var22, var23, var24, var25);
                        }
                    }
                }
            }
            if ((var4 & 0x2000) != 0) {
                var3.field1184 = arg0.method7758();
                int var26 = arg0.method7770();
                var3.field1160 = var26 >> 16;
                var3.field1187 = (var26 & 0xFFFF) + client.field503;
                var3.field1192 = 0;
                var3.field1143 = 0;
                if (var3.field1187 > client.field503) {
                    var3.field1192 = -1;
                }
                if (var3.field1184 == 65535) {
                    var3.field1184 = -1;
                }
            }
            if ((var4 & 0x200) != 0) {
                for (int var27 = 0; var27 < 3; var27++) {
                    var3.field1095[var27] = arg0.method7725();
                }
            }
            if ((var4 & 0x80) != 0) {
                int var28 = arg0.method7796();
                class325 var29 = (class325) class344.method4292(class325.method5649(), arg0.method7747());
                boolean var30 = arg0.method7935() == 1;
                int var31 = arg0.method7748();
                int var32 = arg0.field4864;
                if (var3.field1108 != null && var3.field1109 != null) {
                    boolean var33 = false;
                    if (var29.field4115 && Statics.field2726.method1699(var3.field1108)) {
                        var33 = true;
                    }
                    if (!var33 && client.field688 == 0 && !var3.field1111) {
                        field1326.field4864 = 0;
                        arg0.method7789(field1326.field4867, 0, var31);
                        field1326.field4864 = 0;
                        String var34 = class369.method6418(class358.method3207(class306.method5174(field1326)));
                        var3.field1158 = var34.trim();
                        var3.field1137 = var28 >> 8;
                        var3.field1155 = var28 & 0xFF;
                        var3.field1179 = 150;
                        var3.field1178 = var30;
                        var3.field1156 = Statics.field3404 != var3 && var29.field4115 && client.field731 != "" && var34.toLowerCase().indexOf(client.field731) == -1;
                        int var35;
                        if (var29.field4114) {
                            var35 = var30 ? 91 : 1;
                        } else {
                            var35 = var30 ? 90 : 2;
                        }
                        if (var29.field4113 == -1) {
                            Statics.method666(var35, var3.field1108.method8298(), var34);
                        } else {
                            Statics.method666(var35, class97.method4850(var29.field4113) + var3.field1108.method8298(), var34);
                        }
                    }
                }
                arg0.field4864 = var31 + var32;
            }
            if ((var4 & 0x400) != 0) {
                field1315[var2] = (class203) class344.method4292(class203.method6908(), arg0.method7752());
            }
            if (var3.field1117) {
                if (var5 == 127) {
                    var3.method2178(var3.field1118, var3.field1090);
                } else {
                    class203 var36;
                    if (class203.field2288.field2286 == var5) {
                        var36 = field1315[var2];
                    } else {
                        var36 = (class203) class344.method4292(class203.method6908(), var5);
                    }
                    var3.method2195(var3.field1118, var3.field1090, var36);
                }
            }
        }
    }
}
