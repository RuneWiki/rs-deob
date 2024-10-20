package deob;

@ObfuscatedName("ds")
public class class103 {

    @ObfuscatedName("ds.aw")
    public static byte[] field1330 = new byte[2048];

    @ObfuscatedName("ds.ac")
    public static class211[] field1333 = new class211[2048];

    @ObfuscatedName("ds.au")
    public static class489[] field1334 = new class489[2048];

    @ObfuscatedName("ds.ab")
    public static int field1335 = 0;

    @ObfuscatedName("ds.aq")
    public static int[] field1341 = new int[2048];

    @ObfuscatedName("ds.al")
    public static int field1346 = 0;

    @ObfuscatedName("ds.at")
    public static int[] field1338 = new int[2048];

    @ObfuscatedName("ds.aa")
    public static int[] field1331 = new int[2048];

    @ObfuscatedName("ds.ay")
    public static int[] field1339 = new int[2048];

    @ObfuscatedName("ds.ao")
    public static int[] field1347 = new int[2048];

    @ObfuscatedName("ds.ax")
    public static int field1342 = 0;

    @ObfuscatedName("ds.ai")
    public static int[] field1343 = new int[2048];

    @ObfuscatedName("ds.ag")
    public static class489 field1344 = new class489(new byte[5000]);

    public class103() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("qi.af(Lsq;B)V")
    public static final void method7412(class488 arg0) {
        arg0.method8226();
        int var1 = client.field664;
        class88 var2 = Statics.field3454 = client.field611[var1] = new class88();
        var2.field1107 = var1;
        int var3 = arg0.method8197(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field1174[0] = var5 - Statics.field2850;
        var2.field1171 = (var2.field1174[0] << 7) + (var2.method2200() << 6);
        var2.field1176[0] = var6 - Statics.field2841;
        var2.field1138 = (var2.field1176[0] << 7) + (var2.method2200() << 6);
        Statics.field231 = var2.field1106 = var4;
        if (field1334[var1] != null) {
            var2.method2174(field1334[var1]);
        }
        field1335 = 0;
        field1341[++field1335 - 1] = var1;
        field1330[var1] = 0;
        field1346 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method8197(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1331[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1339[var7] = 0;
                field1347[var7] = -1;
                field1338[++field1346 - 1] = var7;
                field1330[var7] = 0;
            }
        }
        arg0.method8198();
    }

    @ObfuscatedName("nr.an(Lsq;II)V")
    public static final void method6168(class488 arg0, int arg1) {
        int var2 = arg0.field4989;
        field1342 = 0;
        int var3 = 0;
        arg0.method8226();
        for (int var4 = 0; var4 < field1335; var4++) {
            int var5 = field1341[var4];
            if ((field1330[var5] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field1330[var5] = (byte) (field1330[var5] | 0x2);
                } else {
                    int var6 = arg0.method8197(1);
                    if (var6 == 0) {
                        var3 = method2300(arg0);
                        field1330[var5] = (byte) (field1330[var5] | 0x2);
                    } else {
                        method5969(arg0, var5);
                    }
                }
            }
        }
        arg0.method8198();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method8226();
        for (int var7 = 0; var7 < field1335; var7++) {
            int var8 = field1341[var7];
            if ((field1330[var8] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field1330[var8] = (byte) (field1330[var8] | 0x2);
                } else {
                    int var9 = arg0.method8197(1);
                    if (var9 == 0) {
                        var3 = method2300(arg0);
                        field1330[var8] = (byte) (field1330[var8] | 0x2);
                    } else {
                        method5969(arg0, var8);
                    }
                }
            }
        }
        arg0.method8198();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method8226();
        for (int var10 = 0; var10 < field1346; var10++) {
            int var11 = field1338[var10];
            if ((field1330[var11] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field1330[var11] = (byte) (field1330[var11] | 0x2);
                } else {
                    int var12 = arg0.method8197(1);
                    if (var12 == 0) {
                        var3 = method2300(arg0);
                        field1330[var11] = (byte) (field1330[var11] | 0x2);
                    } else if (method4996(arg0, var11)) {
                        field1330[var11] = (byte) (field1330[var11] | 0x2);
                    }
                }
            }
        }
        arg0.method8198();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method8226();
        for (int var13 = 0; var13 < field1346; var13++) {
            int var14 = field1338[var13];
            if ((field1330[var14] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field1330[var14] = (byte) (field1330[var14] | 0x2);
                } else {
                    int var15 = arg0.method8197(1);
                    if (var15 == 0) {
                        var3 = method2300(arg0);
                        field1330[var14] = (byte) (field1330[var14] | 0x2);
                    } else if (method4996(arg0, var14)) {
                        field1330[var14] = (byte) (field1330[var14] | 0x2);
                    }
                }
            }
        }
        arg0.method8198();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        field1335 = 0;
        field1346 = 0;
        for (int var16 = 1; var16 < 2048; var16++) {
            field1330[var16] = (byte) (field1330[var16] >> 1);
            class88 var17 = client.field611[var16];
            if (var17 == null) {
                field1338[++field1346 - 1] = var16;
            } else {
                field1341[++field1335 - 1] = var16;
            }
        }
        method4647(arg0);
        if (arg0.field4989 - var2 != arg1) {
            throw new RuntimeException(arg0.field4989 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("dp.aw(Lsq;I)I")
    public static int method2300(class488 arg0) {
        int var1 = arg0.method8197(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method8197(5);
        } else if (var1 == 2) {
            var2 = arg0.method8197(8);
        } else {
            var2 = arg0.method8197(11);
        }
        return var2;
    }

    @ObfuscatedName("mi.ac(Lsq;II)V")
    public static void method5969(class488 arg0, int arg1) {
        boolean var2 = arg0.method8197(1) == 1;
        if (var2) {
            field1343[++field1342 - 1] = arg1;
        }
        int var3 = arg0.method8197(2);
        class88 var4 = client.field611[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field1111 = false;
            } else if (client.field664 == arg1) {
                throw new RuntimeException();
            } else {
                field1331[arg1] = (Statics.field2841 + var4.field1176[0] >> 13) + (Statics.field2850 + var4.field1174[0] >> 13 << 14) + (var4.field1106 << 28);
                if (var4.field1173 == -1) {
                    field1339[arg1] = var4.field1168;
                } else {
                    field1339[arg1] = var4.field1173;
                }
                field1347[arg1] = var4.field1160;
                client.field611[arg1] = null;
                if (arg0.method8197(1) != 0) {
                    method4996(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method8197(3);
            int var6 = var4.field1174[0];
            int var7 = var4.field1176[0];
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
            if (client.field664 == arg1 && var4.field1171 < 1536 || var4.field1138 < 1536 || var4.field1171 >= 11776 || var4.field1138 >= 11776) {
                var4.method2186(var6, var7);
                var4.field1111 = false;
            } else if (var2) {
                var4.field1111 = true;
                var4.field1112 = var6;
                var4.field1113 = var7;
            } else {
                var4.field1111 = false;
                var4.method2191(var6, var7, field1333[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method8197(4);
            int var9 = var4.field1174[0];
            int var10 = var4.field1176[0];
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
            if (client.field664 == arg1 && var4.field1171 < 1536 || var4.field1138 < 1536 || var4.field1171 >= 11776 || var4.field1138 >= 11776) {
                var4.method2186(var9, var10);
                var4.field1111 = false;
            } else if (var2) {
                var4.field1111 = true;
                var4.field1112 = var9;
                var4.field1113 = var10;
            } else {
                var4.field1111 = false;
                var4.method2191(var9, var10, field1333[arg1]);
            }
        } else {
            int var11 = arg0.method8197(1);
            if (var11 == 0) {
                int var12 = arg0.method8197(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field1174[0] + var14;
                int var17 = var4.field1176[0] + var15;
                if (client.field664 == arg1 && var4.field1171 < 1536 || var4.field1138 < 1536 || var4.field1171 >= 11776 || var4.field1138 >= 11776) {
                    var4.method2186(var16, var17);
                    var4.field1111 = false;
                } else if (var2) {
                    var4.field1111 = true;
                    var4.field1112 = var16;
                    var4.field1113 = var17;
                } else {
                    var4.field1111 = false;
                    var4.method2191(var16, var17, field1333[arg1]);
                }
                var4.field1106 = (byte) (var4.field1106 + var13 & 0x3);
                if (client.field664 == arg1) {
                    Statics.field231 = var4.field1106;
                }
            } else {
                int var18 = arg0.method8197(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field2850 + var4.field1174[0] + var20 & 0x3FFF) - Statics.field2850;
                int var23 = (Statics.field2841 + var4.field1176[0] + var21 & 0x3FFF) - Statics.field2841;
                if (client.field664 == arg1 && var4.field1171 < 1536 || var4.field1138 < 1536 || var4.field1171 >= 11776 || var4.field1138 >= 11776) {
                    var4.method2186(var22, var23);
                    var4.field1111 = false;
                } else if (var2) {
                    var4.field1111 = true;
                    var4.field1112 = var22;
                    var4.field1113 = var23;
                } else {
                    var4.field1111 = false;
                    var4.method2191(var22, var23, field1333[arg1]);
                }
                var4.field1106 = (byte) (var4.field1106 + var19 & 0x3);
                if (client.field664 == arg1) {
                    Statics.field231 = var4.field1106;
                }
            }
        }
    }

    @ObfuscatedName("kb.au(Lsq;II)Z")
    public static boolean method4996(class488 arg0, int arg1) {
        int var2 = arg0.method8197(2);
        if (var2 == 0) {
            if (arg0.method8197(1) != 0) {
                method4996(arg0, arg1);
            }
            int var3 = arg0.method8197(13);
            int var4 = arg0.method8197(13);
            boolean var5 = arg0.method8197(1) == 1;
            if (var5) {
                field1343[++field1342 - 1] = arg1;
            }
            if (client.field611[arg1] != null) {
                throw new RuntimeException();
            }
            class88 var6 = client.field611[arg1] = new class88();
            var6.field1107 = arg1;
            if (field1334[arg1] != null) {
                var6.method2174(field1334[arg1]);
            }
            var6.field1168 = field1339[arg1];
            var6.field1160 = field1347[arg1];
            int var7 = field1331[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field1199[0] = field1333[arg1];
            var6.field1106 = (byte) var8;
            var6.method2186((var9 << 13) + var3 - Statics.field2850, (var10 << 13) + var4 - Statics.field2841);
            var6.field1111 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method8197(2);
            int var12 = field1331[arg1];
            field1331[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method8197(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1331[arg1];
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
            field1331[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method8197(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1331[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1331[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("jd.ab(Lsq;B)V")
    public static final void method4647(class488 arg0) {
        for (int var1 = 0; var1 < field1342; var1++) {
            int var2 = field1343[var1];
            class88 var3 = client.field611[var2];
            int var4 = arg0.method8248();
            if ((var4 & 0x8) != 0) {
                var4 += arg0.method8248() << 8;
            }
            if ((var4 & 0x4000) != 0) {
                var4 += arg0.method8248() << 16;
            }
            method2379(arg0, var2, var3, var4);
        }
    }

    @ObfuscatedName("du.aq(Lsq;ILdv;IB)V")
    public static final void method2379(class488 arg0, int arg1, class88 arg2, int arg3) {
        byte var4 = class211.field2391.field2392;
        if ((arg3 & 0x2) != 0) {
            int var5 = arg0.method8281();
            byte[] var6 = new byte[var5];
            class489 var7 = new class489(var6);
            arg0.method8266(var6, 0, var5);
            field1334[arg1] = var7;
            arg2.method2174(var7);
        }
        if ((arg3 & 0x10) != 0) {
            int var8 = arg0.method8290();
            if (var8 == 65535) {
                var8 = -1;
            }
            int var9 = arg0.method8282();
            client.method4045(arg2, var8, var9);
        }
        if ((arg3 & 0x4) != 0) {
            arg2.field1160 = arg0.method8291();
            arg2.field1160 += arg0.method8281() << 16;
            int var10 = 16777215;
            if (arg2.field1160 == var10) {
                arg2.field1160 = -1;
            }
        }
        if ((arg3 & 0x80) != 0) {
            arg2.field1149 = arg0.method8259();
            if (arg2.field1149.charAt(0) == '~') {
                arg2.field1149 = arg2.field1149.substring(1);
                class106.method2767(2, arg2.field1089.method8841(), arg2.field1149);
            } else if (Statics.field3454 == arg2) {
                class106.method2767(2, arg2.field1089.method8841(), arg2.field1149);
            }
            arg2.field1177 = false;
            arg2.field1162 = 0;
            arg2.field1207 = 0;
            arg2.field1161 = 150;
        }
        if ((arg3 & 0x40) != 0) {
            int var11 = arg0.method8248();
            if (var11 > 0) {
                for (int var12 = 0; var12 < var11; var12++) {
                    int var13 = -1;
                    int var14 = -1;
                    int var15 = -1;
                    int var16 = arg0.method8417();
                    if (var16 == 32767) {
                        var16 = arg0.method8417();
                        var14 = arg0.method8417();
                        var13 = arg0.method8417();
                        var15 = arg0.method8417();
                    } else if (var16 == 32766) {
                        var16 = -1;
                    } else {
                        var14 = arg0.method8417();
                    }
                    int var17 = arg0.method8417();
                    arg2.method2250(var16, var14, var13, var15, client.field602, var17);
                }
            }
            int var18 = arg0.method8281();
            if (var18 > 0) {
                for (int var19 = 0; var19 < var18; var19++) {
                    int var20 = arg0.method8417();
                    int var21 = arg0.method8417();
                    if (var21 == 32767) {
                        arg2.method2260(var20);
                    } else {
                        int var22 = arg0.method8417();
                        int var23 = arg0.method8231();
                        int var24 = var21 > 0 ? arg0.method8282() : var23;
                        arg2.method2258(var20, client.field602, var21, var22, var23, var24);
                    }
                }
            }
        }
        if ((arg3 & 0x1) != 0) {
            arg2.field1173 = arg0.method8250();
            if (arg2.field1206 == 0) {
                arg2.field1168 = arg2.field1173;
                arg2.method2251();
            }
        }
        if ((arg3 & 0x20) != 0) {
            int var25 = arg0.method8290();
            class339 var26 = (class339) Statics.method3600(class339.method5985(), arg0.method8248());
            boolean var27 = arg0.method8282() == 1;
            int var28 = arg0.method8281();
            int var29 = arg0.field4989;
            if (arg2.field1089 != null && arg2.field1097 != null) {
                boolean var30 = false;
                if (var26.field4170 && Statics.field804.method1741(arg2.field1089)) {
                    var30 = true;
                }
                if (!var30 && client.field609 == 0 && !arg2.field1105) {
                    field1344.field4989 = 0;
                    arg0.method8266(field1344.field4991, 0, var28);
                    field1344.field4989 = 0;
                    String var31 = class383.method6854(class372.method2812(class320.method4550(field1344)));
                    arg2.field1149 = var31.trim();
                    arg2.field1162 = var25 >> 8;
                    arg2.field1207 = var25 & 0xFF;
                    arg2.field1161 = 150;
                    arg2.field1177 = var27;
                    arg2.field1145 = Statics.field3454 != arg2 && var26.field4170 && client.field719 != "" && var31.toLowerCase().indexOf(client.field719) == -1;
                    int var32;
                    if (var26.field4186) {
                        var32 = var27 ? 91 : 1;
                    } else {
                        var32 = var27 ? 90 : 2;
                    }
                    if (var26.field4185 == -1) {
                        class106.method2767(var32, arg2.field1089.method8841(), var31);
                    } else {
                        class106.method2767(var32, class97.method6000(var26.field4185) + arg2.field1089.method8841(), var31);
                    }
                }
            }
            arg0.field4989 = var28 + var29;
        }
        if ((arg3 & 0x1000) != 0) {
            int var33 = arg0.method8250();
            int var34 = arg0.method8303();
            arg2.method2255(0, var33, var34 >> 16, var34 & 0xFFFF);
        }
        if ((arg3 & 0x400) != 0) {
            arg2.field1188 = arg0.method8249();
            arg2.field1190 = arg0.method8284();
            arg2.field1189 = arg0.method8424();
            arg2.field1208 = arg0.method8424();
            arg2.field1192 = arg0.method8291() + client.field602;
            arg2.field1193 = arg0.method8250() + client.field602;
            arg2.field1194 = arg0.method8291();
            if (arg2.field1111) {
                arg2.field1188 += arg2.field1112;
                arg2.field1190 += arg2.field1113;
                arg2.field1189 += arg2.field1112;
                arg2.field1208 += arg2.field1113;
                arg2.field1206 = 0;
            } else {
                arg2.field1188 += arg2.field1174[0];
                arg2.field1190 += arg2.field1176[0];
                arg2.field1189 += arg2.field1174[0];
                arg2.field1208 += arg2.field1176[0];
                arg2.field1206 = 1;
            }
            arg2.field1211 = 0;
        }
        if ((arg3 & 0x200) != 0) {
            class211[] var35 = field1333;
            class211[] var37 = new class211[] { class211.field2390, class211.field2391, class211.field2389, class211.field2388 };
            var35[arg1] = (class211) Statics.method3600(var37, arg0.method8378());
        }
        if ((arg3 & 0x800) != 0) {
            var4 = arg0.method8249();
        }
        if ((arg3 & 0x2000) != 0) {
            for (int var38 = 0; var38 < 3; var38++) {
                arg2.field1103[var38] = arg0.method8259();
            }
        }
        if ((arg3 & 0x8000) != 0) {
            arg2.field1169 = client.field602 + arg0.method8291();
            arg2.field1157 = client.field602 + arg0.method8250();
            arg2.field1181 = arg0.method8249();
            arg2.field1200 = arg0.method8249();
            arg2.field1201 = arg0.method8378();
            arg2.field1209 = (byte) arg0.method8282();
        }
        if ((arg3 & 0x10000) != 0) {
            int var39 = arg0.method8231();
            for (int var40 = 0; var40 < var39; var40++) {
                int var41 = arg0.method8282();
                int var42 = arg0.method8291();
                int var43 = arg0.method8254();
                arg2.method2255(var41, var42, var43 >> 16, var43 & 0xFFFF);
            }
        }
        if (!arg2.field1111) {
            return;
        }
        if (var4 == 127) {
            arg2.method2186(arg2.field1112, arg2.field1113);
            return;
        }
        class211 var45;
        if (class211.field2391.field2392 == var4) {
            var45 = field1333[arg1];
        } else {
            class211[] var44 = new class211[] { class211.field2390, class211.field2391, class211.field2389, class211.field2388 };
            var45 = (class211) Statics.method3600(var44, var4);
        }
        arg2.method2191(arg2.field1112, arg2.field1113, var45);
    }
}
