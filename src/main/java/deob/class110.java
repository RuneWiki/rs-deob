package deob;

@ObfuscatedName("ei")
public class class110 {

    @ObfuscatedName("ei.ak")
    public static byte[] field1378 = new byte[2048];

    @ObfuscatedName("ei.ax")
    public static class232[] field1371 = new class232[2048];

    @ObfuscatedName("ei.ao")
    public static class530[] field1374 = new class530[2048];

    @ObfuscatedName("ei.ah")
    public static int field1375 = 0;

    @ObfuscatedName("ei.ar")
    public static int[] field1376 = new int[2048];

    @ObfuscatedName("ei.ab")
    public static int field1377 = 0;

    @ObfuscatedName("ei.am")
    public static int[] field1383 = new int[2048];

    @ObfuscatedName("ei.av")
    public static int[] field1379 = new int[2048];

    @ObfuscatedName("ei.ag")
    public static int[] field1380 = new int[2048];

    @ObfuscatedName("ei.aa")
    public static int[] field1381 = new int[2048];

    @ObfuscatedName("ei.ap")
    public static int field1382 = 0;

    @ObfuscatedName("ei.ay")
    public static int[] field1384 = new int[2048];

    @ObfuscatedName("ei.as")
    public static class530 field1372 = new class530(new byte[5000]);

    public class110() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dq.al(Luy;II)V")
    public static final void method2144(class529 arg0, int arg1) {
        int var2 = arg0.field5140;
        field1382 = 0;
        method6400(arg0);
        for (int var3 = 0; var3 < field1382; var3++) {
            int var4 = field1384[var3];
            class94 var5 = client.field726[var4];
            int var6 = arg0.method8365();
            if ((var6 & 0x1) != 0) {
                var6 += arg0.method8365() << 8;
            }
            if ((var6 & 0x1000) != 0) {
                var6 += arg0.method8365() << 16;
            }
            byte var7 = class232.field2430.field2431;
            if ((var6 & 0x80) != 0) {
                int var8 = arg0.method8398();
                if (var8 > 0) {
                    for (int var9 = 0; var9 < var8; var9++) {
                        int var10 = -1;
                        int var11 = -1;
                        int var12 = -1;
                        int var13 = arg0.method8526();
                        if (var13 == 32767) {
                            var13 = arg0.method8526();
                            var11 = arg0.method8526();
                            var10 = arg0.method8526();
                            var12 = arg0.method8526();
                        } else if (var13 == 32766) {
                            var13 = -1;
                        } else {
                            var11 = arg0.method8526();
                        }
                        int var14 = arg0.method8526();
                        var5.method2333(var13, var11, var10, var12, client.field533, var14);
                    }
                }
                int var15 = arg0.method8365();
                if (var15 > 0) {
                    for (int var16 = 0; var16 < var15; var16++) {
                        int var17 = arg0.method8526();
                        int var18 = arg0.method8526();
                        if (var18 == 32767) {
                            var5.method2314(var17);
                        } else {
                            int var19 = arg0.method8526();
                            int var20 = arg0.method8365();
                            int var21 = var18 > 0 ? arg0.method8399() : var20;
                            var5.method2310(var17, client.field533, var18, var19, var20, var21);
                        }
                    }
                }
            }
            if ((var6 & 0x10000) != 0) {
                int var22 = arg0.method8398();
                for (int var23 = 0; var23 < var22; var23++) {
                    int var24 = arg0.method8365();
                    int var25 = arg0.method8407();
                    int var26 = arg0.method8421();
                    var5.method2312(var24, var25, var26 >> 16, var26 & 0xFFFF);
                }
            }
            if ((var6 & 0x10) != 0) {
                var5.field1222 = arg0.method8346();
                var5.field1222 += arg0.method8399() << 16;
                int var27 = 16777215;
                if (var5.field1222 == var27) {
                    var5.field1222 = -1;
                }
            }
            if ((var6 & 0x400) != 0) {
                class232[] var28 = field1371;
                class232[] var30 = new class232[] { class232.field2427, class232.field2430, class232.field2429, class232.field2428 };
                var28[var4] = (class232) class388.method3894(var30, arg0.method8366());
            }
            if ((var6 & 0x100) != 0) {
                var5.field1248 = client.field533 + arg0.method8407();
                var5.field1249 = client.field533 + arg0.method8346();
                var5.field1250 = arg0.method8402();
                var5.field1251 = arg0.method8401();
                var5.field1252 = arg0.method8403();
                var5.field1253 = (byte) arg0.method8399();
            }
            if ((var6 & 0x2) != 0) {
                var5.field1215 = arg0.method8588();
                if (var5.field1215.charAt(0) == '~') {
                    var5.field1215 = var5.field1215.substring(1);
                    class113.method6942(2, var5.field1136.method8985(), var5.field1215);
                } else if (Statics.field2696 == var5) {
                    class113.method6942(2, var5.field1136.method8985(), var5.field1215);
                }
                var5.field1208 = false;
                var5.field1256 = 0;
                var5.field1212 = 0;
                var5.field1210 = 150;
            }
            if ((var6 & 0x4000) != 0) {
                var5.field1239 = arg0.method8401();
                var5.field1186 = arg0.method8403();
                var5.field1240 = arg0.method8366();
                var5.field1205 = arg0.method8401();
                var5.field1243 = arg0.method8407() + client.field533;
                var5.field1244 = arg0.method8598() + client.field533;
                var5.field1255 = arg0.method8346();
                if (var5.field1125) {
                    var5.field1239 += var5.field1141;
                    var5.field1186 += var5.field1147;
                    var5.field1240 += var5.field1141;
                    var5.field1205 += var5.field1147;
                    var5.field1219 = 0;
                } else {
                    var5.field1239 += var5.field1258[0];
                    var5.field1186 += var5.field1259[0];
                    var5.field1240 += var5.field1258[0];
                    var5.field1205 += var5.field1259[0];
                    var5.field1219 = 1;
                }
                var5.field1262 = 0;
            }
            if ((var6 & 0x4) != 0) {
                int var31 = arg0.method8346();
                if (var31 == 65535) {
                    var31 = -1;
                }
                int var32 = arg0.method8398();
                client.method5249(var5, var31, var32);
            }
            if ((var6 & 0x800) != 0) {
                for (int var33 = 0; var33 < 3; var33++) {
                    var5.field1123[var33] = arg0.method8588();
                }
            }
            if ((var6 & 0x20) != 0) {
                var5.field1224 = arg0.method8345();
                if (var5.field1219 == 0) {
                    var5.field1209 = var5.field1224;
                    var5.method2316();
                }
            }
            if ((var6 & 0x8) != 0) {
                int var34 = arg0.method8345();
                class369 var35 = (class369) class388.method3894(class369.method3287(), arg0.method8365());
                boolean var36 = arg0.method8400() == 1;
                int var37 = arg0.method8399();
                int var38 = arg0.field5140;
                if (var5.field1136 != null && var5.field1120 != null) {
                    boolean var39 = false;
                    if (var35.field4272 && Statics.field1907.method1800(var5.field1136)) {
                        var39 = true;
                    }
                    if (!var39 && client.field791 == 0 && !var5.field1139) {
                        field1372.field5140 = 0;
                        arg0.method8425(field1372.field5139, 0, var37);
                        field1372.field5140 = 0;
                        String var40 = class413.method6952(class402.method2346(class350.method3150(field1372)));
                        var5.field1215 = var40.trim();
                        var5.field1256 = var34 >> 8;
                        var5.field1212 = var34 & 0xFF;
                        var5.field1210 = 150;
                        var5.field1195 = null;
                        var5.field1208 = var36;
                        var5.field1247 = Statics.field2696 != var5 && var35.field4272 && !client.field753.isEmpty() && var40.toLowerCase().indexOf(client.field753) == -1;
                        int var41;
                        if (var35.field4285) {
                            var41 = var36 ? 91 : 1;
                        } else {
                            var41 = var36 ? 90 : 2;
                        }
                        if (var35.field4284 == -1) {
                            class113.method6942(var41, var5.field1136.method8985(), var40);
                        } else {
                            class113.method6942(var41, class104.method7216(var35.field4284) + var5.field1136.method8985(), var40);
                        }
                    }
                }
                arg0.field5140 = var37 + var38;
            }
            if ((var6 & 0x200) != 0) {
                int var42 = arg0.method8346();
                int var43 = var42 >> 8;
                int var44 = var43 >= 13 && var43 <= 20 ? var43 - 12 : 0;
                class369 var45 = (class369) class388.method3894(class369.method3287(), arg0.method8365());
                boolean var46 = arg0.method8400() == 1;
                int var47 = arg0.method8365();
                int var48 = arg0.field5140;
                if (var5.field1136 != null && var5.field1120 != null) {
                    boolean var49 = false;
                    if (var45.field4272 && Statics.field1907.method1800(var5.field1136)) {
                        var49 = true;
                    }
                    if (!var49 && client.field791 == 0 && !var5.field1139) {
                        field1372.field5140 = 0;
                        arg0.method8379(field1372.field5139, 0, var47);
                        field1372.field5140 = 0;
                        String var50 = class413.method6952(class402.method2346(class350.method3150(field1372)));
                        var5.field1215 = var50.trim();
                        var5.field1256 = var42 >> 8;
                        var5.field1212 = var42 & 0xFF;
                        var5.field1210 = 150;
                        byte[] var51 = null;
                        if (var44 > 0 && var44 <= 8) {
                            var51 = new byte[var44];
                            for (int var52 = 0; var52 < var44; var52++) {
                                var51[var52] = arg0.method8401();
                            }
                        }
                        byte[] var54 = var51;
                        int[] var57;
                        if (var51 == null || var51.length == 0 || var51.length > 8) {
                            var57 = null;
                        } else {
                            int[] var55 = new int[var51.length];
                            int var56 = 0;
                            while (true) {
                                if (var56 >= var54.length) {
                                    var57 = var55;
                                    break;
                                }
                                if (var54[var56] < 0 || var54[var56] > class554.field5290.length) {
                                    var57 = null;
                                    break;
                                }
                                var55[var56] = class554.field5290[var54[var56]];
                                var56++;
                            }
                        }
                        var5.field1195 = var57;
                        var5.field1208 = var46;
                        var5.field1247 = Statics.field2696 != var5 && var45.field4272 && !client.field753.isEmpty() && var50.toLowerCase().indexOf(client.field753) == -1;
                        int var58;
                        if (var45.field4285) {
                            var58 = var46 ? 91 : 1;
                        } else {
                            var58 = var46 ? 90 : 2;
                        }
                        if (var45.field4284 == -1) {
                            class113.method6942(var58, var5.field1136.method8985(), var50);
                        } else {
                            class113.method6942(var58, class104.method7216(var45.field4284) + var5.field1136.method8985(), var50);
                        }
                    }
                }
                arg0.field5140 = var47 + var48 + var44;
            }
            if ((var6 & 0x40) != 0) {
                int var59 = arg0.method8399();
                byte[] var60 = new byte[var59];
                class530 var61 = new class530(var60);
                arg0.method8488(var60, 0, var59);
                field1374[var4] = var61;
                var5.method2251(var61);
            }
            if ((var6 & 0x2000) != 0) {
                var7 = arg0.method8366();
            }
            if (var5.field1125) {
                if (var7 == 127) {
                    var5.method2291(var5.field1141, var5.field1147);
                } else {
                    class232 var63;
                    if (class232.field2430.field2431 == var7) {
                        var63 = field1371[var4];
                    } else {
                        class232[] var62 = new class232[] { class232.field2427, class232.field2430, class232.field2429, class232.field2428 };
                        var63 = (class232) class388.method3894(var62, var7);
                    }
                    var5.method2262(var5.field1141, var5.field1147, var63);
                }
            }
        }
        if (arg0.field5140 - var2 != arg1) {
            throw new RuntimeException(arg0.field5140 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("oc.ak(Luy;B)V")
    public static final void method6400(class529 arg0) {
        int var1 = 0;
        arg0.method8312();
        for (int var2 = 0; var2 < field1375; var2++) {
            int var3 = field1376[var2];
            if ((field1378[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1378[var3] = (byte) (field1378[var3] | 0x2);
                } else {
                    int var4 = arg0.method8327(1);
                    if (var4 == 0) {
                        var1 = method2608(arg0);
                        field1378[var3] = (byte) (field1378[var3] | 0x2);
                    } else {
                        method5133(arg0, var3);
                    }
                }
            }
        }
        arg0.method8338();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method8312();
        for (int var5 = 0; var5 < field1375; var5++) {
            int var6 = field1376[var5];
            if ((field1378[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1378[var6] = (byte) (field1378[var6] | 0x2);
                } else {
                    int var7 = arg0.method8327(1);
                    if (var7 == 0) {
                        var1 = method2608(arg0);
                        field1378[var6] = (byte) (field1378[var6] | 0x2);
                    } else {
                        method5133(arg0, var6);
                    }
                }
            }
        }
        arg0.method8338();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method8312();
        for (int var8 = 0; var8 < field1377; var8++) {
            int var9 = field1383[var8];
            if ((field1378[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1378[var9] = (byte) (field1378[var9] | 0x2);
                } else {
                    int var10 = arg0.method8327(1);
                    if (var10 == 0) {
                        var1 = method2608(arg0);
                        field1378[var9] = (byte) (field1378[var9] | 0x2);
                    } else if (method5300(arg0, var9)) {
                        field1378[var9] = (byte) (field1378[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method8338();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method8312();
        for (int var11 = 0; var11 < field1377; var11++) {
            int var12 = field1383[var11];
            if ((field1378[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1378[var12] = (byte) (field1378[var12] | 0x2);
                } else {
                    int var13 = arg0.method8327(1);
                    if (var13 == 0) {
                        var1 = method2608(arg0);
                        field1378[var12] = (byte) (field1378[var12] | 0x2);
                    } else if (method5300(arg0, var12)) {
                        field1378[var12] = (byte) (field1378[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method8338();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field1375 = 0;
        field1377 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            field1378[var14] = (byte) (field1378[var14] >> 1);
            class94 var15 = client.field726[var14];
            if (var15 == null) {
                field1383[++field1377 - 1] = var14;
            } else {
                field1376[++field1375 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("eg.ax(Luy;B)I")
    public static int method2608(class529 arg0) {
        int var1 = arg0.method8327(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method8327(5);
        } else if (var1 == 2) {
            var2 = arg0.method8327(8);
        } else {
            var2 = arg0.method8327(11);
        }
        return var2;
    }

    @ObfuscatedName("ky.ao(Luy;II)V")
    public static void method5133(class529 arg0, int arg1) {
        boolean var2 = arg0.method8327(1) == 1;
        if (var2) {
            field1384[++field1382 - 1] = arg1;
        }
        int var3 = arg0.method8327(2);
        class94 var4 = client.field726[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field1125 = false;
            } else if (client.field646 == arg1) {
                throw new RuntimeException();
            } else {
                field1379[arg1] = (Statics.field103 + var4.field1259[0] >> 13) + (Statics.field108 + var4.field1258[0] >> 13 << 14) + (var4.field1140 << 28);
                if (var4.field1224 == -1) {
                    field1380[arg1] = var4.field1209;
                } else {
                    field1380[arg1] = var4.field1224;
                }
                field1381[arg1] = var4.field1222;
                client.field726[arg1] = null;
                if (arg0.method8327(1) != 0) {
                    method5300(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method8327(3);
            int var6 = var4.field1258[0];
            int var7 = var4.field1259[0];
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
            if (client.field646 == arg1 && var4.field1227 < 1536 || var4.field1187 < 1536 || var4.field1227 >= 11776 || var4.field1187 >= 11776) {
                var4.method2291(var6, var7);
                var4.field1125 = false;
            } else if (var2) {
                var4.field1125 = true;
                var4.field1141 = var6;
                var4.field1147 = var7;
            } else {
                var4.field1125 = false;
                var4.method2262(var6, var7, field1371[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method8327(4);
            int var9 = var4.field1258[0];
            int var10 = var4.field1259[0];
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
            if (client.field646 == arg1 && var4.field1227 < 1536 || var4.field1187 < 1536 || var4.field1227 >= 11776 || var4.field1187 >= 11776) {
                var4.method2291(var9, var10);
                var4.field1125 = false;
            } else if (var2) {
                var4.field1125 = true;
                var4.field1141 = var9;
                var4.field1147 = var10;
            } else {
                var4.field1125 = false;
                var4.method2262(var9, var10, field1371[arg1]);
            }
        } else {
            int var11 = arg0.method8327(1);
            if (var11 == 0) {
                int var12 = arg0.method8327(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field1258[0] + var14;
                int var17 = var4.field1259[0] + var15;
                if (client.field646 == arg1 && var4.field1227 < 1536 || var4.field1187 < 1536 || var4.field1227 >= 11776 || var4.field1187 >= 11776) {
                    var4.method2291(var16, var17);
                    var4.field1125 = false;
                } else if (var2) {
                    var4.field1125 = true;
                    var4.field1141 = var16;
                    var4.field1147 = var17;
                } else {
                    var4.field1125 = false;
                    var4.method2262(var16, var17, field1371[arg1]);
                }
                var4.field1140 = (byte) (var4.field1140 + var13 & 0x3);
                if (client.field646 == arg1) {
                    Statics.field1072 = var4.field1140;
                }
            } else {
                int var18 = arg0.method8327(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field108 + var4.field1258[0] + var20 & 0x3FFF) - Statics.field108;
                int var23 = (Statics.field103 + var4.field1259[0] + var21 & 0x3FFF) - Statics.field103;
                if (client.field646 == arg1 && var4.field1227 < 1536 || var4.field1187 < 1536 || var4.field1227 >= 11776 || var4.field1187 >= 11776) {
                    var4.method2291(var22, var23);
                    var4.field1125 = false;
                } else if (var2) {
                    var4.field1125 = true;
                    var4.field1141 = var22;
                    var4.field1147 = var23;
                } else {
                    var4.field1125 = false;
                    var4.method2262(var22, var23, field1371[arg1]);
                }
                var4.field1140 = (byte) (var4.field1140 + var19 & 0x3);
                if (client.field646 == arg1) {
                    Statics.field1072 = var4.field1140;
                }
            }
        }
    }

    @ObfuscatedName("lp.ah(Luy;II)Z")
    public static boolean method5300(class529 arg0, int arg1) {
        int var2 = arg0.method8327(2);
        if (var2 == 0) {
            if (arg0.method8327(1) != 0) {
                method5300(arg0, arg1);
            }
            int var3 = arg0.method8327(13);
            int var4 = arg0.method8327(13);
            boolean var5 = arg0.method8327(1) == 1;
            if (var5) {
                field1384[++field1382 - 1] = arg1;
            }
            if (client.field726[arg1] != null) {
                throw new RuntimeException();
            }
            class94 var6 = client.field726[arg1] = new class94();
            var6.field1132 = arg1;
            if (field1374[arg1] != null) {
                var6.method2251(field1374[arg1]);
            }
            var6.field1209 = field1380[arg1];
            var6.field1222 = field1381[arg1];
            int var7 = field1379[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field1200[0] = field1371[arg1];
            var6.field1140 = (byte) var8;
            var6.method2291((var9 << 13) + var3 - Statics.field108, (var10 << 13) + var4 - Statics.field103);
            var6.field1125 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method8327(2);
            int var12 = field1379[arg1];
            field1379[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method8327(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1379[arg1];
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
            field1379[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method8327(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1379[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1379[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("aa.ar(I)V")
    public static void method103() {
        field1375 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field1374[var0] = null;
            field1371[var0] = class232.field2429;
        }
    }
}
