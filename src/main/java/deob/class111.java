package deob;

@ObfuscatedName("eo")
public class class111 {

    @ObfuscatedName("eo.an")
    public class102 field1395;

    @ObfuscatedName("eo.au")
    public byte[] field1396 = new byte[2048];

    @ObfuscatedName("eo.ax")
    public class275[] field1393 = new class275[2048];

    @ObfuscatedName("eo.ao")
    public class549[] field1403 = new class549[2048];

    @ObfuscatedName("eo.am")
    public int field1399 = 0;

    @ObfuscatedName("eo.ac")
    public int[] field1401 = new int[2048];

    @ObfuscatedName("eo.ae")
    public int field1411 = 0;

    @ObfuscatedName("eo.ad")
    public int[] field1402 = new int[2048];

    @ObfuscatedName("eo.aq")
    public int[] field1400 = new int[2048];

    @ObfuscatedName("eo.al")
    public int[] field1404 = new int[2048];

    @ObfuscatedName("eo.aj")
    public int[] field1405 = new int[2048];

    @ObfuscatedName("eo.as")
    public int field1406 = 0;

    @ObfuscatedName("eo.aw")
    public int[] field1407 = new int[2048];

    @ObfuscatedName("eo.af")
    public class549 field1408 = new class549(new byte[5000]);

    public class111(class102 arg0) {
        this.field1395 = arg0;
    }

    @ObfuscatedName("eo.ab(Lvs;ZI)V")
    public final void method2734(class548 arg0, boolean arg1) {
        arg0.method8748();
        class94 var3 = new class94();
        int var4 = client.field630;
        if (arg1) {
            Statics.field2672 = var3;
            Statics.field4799.field1317[var4] = var3;
        } else {
            this.field1395.field1317[var4] = var3;
        }
        var3.field1133 = var4;
        int var5 = arg0.method8746(30);
        byte var6 = (byte) class350.method5927(var5);
        int var7 = Statics.method5928(var5);
        int var8 = class350.method5929(var5);
        var3.field1251[0] = var7 - this.field1395.field1311;
        var3.field1249 = (var3.field1251[0] << 7) + (var3.method2352() << 6);
        var3.field1181[0] = var8 - this.field1395.field1319;
        var3.field1180 = (var3.field1181[0] << 7) + (var3.method2352() << 6);
        if (arg1) {
            this.field1395.field1308 = var3.field1130 = var6;
        }
        if (this.field1403[var4] != null) {
            var3.method2361(this.field1403[var4]);
        }
        this.field1399 = 0;
        this.field1401[++this.field1399 - 1] = var4;
        this.field1396[var4] = 0;
        this.field1411 = 0;
        for (int var9 = 1; var9 < 2048; var9++) {
            if (var4 != var9) {
                int var10 = arg0.method8746(18);
                int var11 = var10 >> 16;
                int var12 = var10 >> 8 & 0x255;
                int var13 = var10 & 0x255;
                this.field1400[var9] = class350.method5926(var11, var12, var13);
                this.field1404[var9] = 0;
                this.field1405[var9] = -1;
                this.field1402[++this.field1411 - 1] = var9;
                this.field1396[var9] = 0;
            }
        }
        arg0.method8747();
    }

    @ObfuscatedName("eo.ay(Lvs;II)V")
    public final void method2735(class548 arg0, int arg1) {
        int var3 = arg0.field5378;
        this.field1406 = 0;
        this.method2744(arg0);
        this.method2740(arg0);
        if (arg0.field5378 - var3 != arg1) {
            throw new RuntimeException(arg0.field5378 - var3 + " " + arg1);
        }
    }

    @ObfuscatedName("eo.an(Lvs;I)V")
    public final void method2744(class548 arg0) {
        int var2 = 0;
        arg0.method8748();
        for (int var3 = 0; var3 < this.field1399; var3++) {
            int var4 = this.field1401[var3];
            if ((this.field1396[var4] & 0x1) == 0) {
                if (var2 > 0) {
                    var2--;
                    this.field1396[var4] = (byte) (this.field1396[var4] | 0x2);
                } else {
                    int var5 = arg0.method8746(1);
                    if (var5 == 0) {
                        var2 = this.method2737(arg0);
                        this.field1396[var4] = (byte) (this.field1396[var4] | 0x2);
                    } else {
                        this.method2738(arg0, var4);
                    }
                }
            }
        }
        arg0.method8747();
        if (var2 != 0) {
            throw new RuntimeException();
        }
        arg0.method8748();
        for (int var6 = 0; var6 < this.field1399; var6++) {
            int var7 = this.field1401[var6];
            if ((this.field1396[var7] & 0x1) != 0) {
                if (var2 > 0) {
                    var2--;
                    this.field1396[var7] = (byte) (this.field1396[var7] | 0x2);
                } else {
                    int var8 = arg0.method8746(1);
                    if (var8 == 0) {
                        var2 = this.method2737(arg0);
                        this.field1396[var7] = (byte) (this.field1396[var7] | 0x2);
                    } else {
                        this.method2738(arg0, var7);
                    }
                }
            }
        }
        arg0.method8747();
        if (var2 != 0) {
            throw new RuntimeException();
        }
        arg0.method8748();
        for (int var9 = 0; var9 < this.field1411; var9++) {
            int var10 = this.field1402[var9];
            if ((this.field1396[var10] & 0x1) != 0) {
                if (var2 > 0) {
                    var2--;
                    this.field1396[var10] = (byte) (this.field1396[var10] | 0x2);
                } else {
                    int var11 = arg0.method8746(1);
                    if (var11 == 0) {
                        var2 = this.method2737(arg0);
                        this.field1396[var10] = (byte) (this.field1396[var10] | 0x2);
                    } else if (this.method2739(arg0, var10)) {
                        this.field1396[var10] = (byte) (this.field1396[var10] | 0x2);
                    }
                }
            }
        }
        arg0.method8747();
        if (var2 != 0) {
            throw new RuntimeException();
        }
        arg0.method8748();
        for (int var12 = 0; var12 < this.field1411; var12++) {
            int var13 = this.field1402[var12];
            if ((this.field1396[var13] & 0x1) == 0) {
                if (var2 > 0) {
                    var2--;
                    this.field1396[var13] = (byte) (this.field1396[var13] | 0x2);
                } else {
                    int var14 = arg0.method8746(1);
                    if (var14 == 0) {
                        var2 = this.method2737(arg0);
                        this.field1396[var13] = (byte) (this.field1396[var13] | 0x2);
                    } else if (this.method2739(arg0, var13)) {
                        this.field1396[var13] = (byte) (this.field1396[var13] | 0x2);
                    }
                }
            }
        }
        arg0.method8747();
        if (var2 != 0) {
            throw new RuntimeException();
        }
        this.field1399 = 0;
        this.field1411 = 0;
        for (int var15 = 1; var15 < 2048; var15++) {
            this.field1396[var15] = (byte) (this.field1396[var15] >> 1);
            class94 var16 = this.field1395.field1317[var15];
            if (var16 == null) {
                this.field1402[++this.field1411 - 1] = var15;
            } else {
                this.field1401[++this.field1399 - 1] = var15;
            }
        }
    }

    @ObfuscatedName("eo.au(Lvs;I)I")
    public int method2737(class548 arg0) {
        int var2 = arg0.method8746(2);
        int var3;
        if (var2 == 0) {
            var3 = 0;
        } else if (var2 == 1) {
            var3 = arg0.method8746(5);
        } else if (var2 == 2) {
            var3 = arg0.method8746(8);
        } else {
            var3 = arg0.method8746(11);
        }
        return var3;
    }

    @ObfuscatedName("eo.ax(Lvs;II)V")
    public void method2738(class548 arg0, int arg1) {
        boolean var3 = arg0.method8746(1) == 1;
        if (var3) {
            this.field1407[++this.field1406 - 1] = arg1;
        }
        int var4 = arg0.method8746(2);
        class94 var5 = this.field1395.field1317[arg1];
        if (var4 == 0) {
            if (var3) {
                var5.field1129 = false;
            } else if (client.field630 == arg1) {
                throw new RuntimeException();
            } else {
                this.field1400[arg1] = class350.method5926(var5.field1130, this.field1395.field1311 + var5.field1251[0] >> 13, this.field1395.field1319 + var5.field1181[0] >> 13);
                if (var5.field1255 == -1) {
                    this.field1404[arg1] = var5.field1247;
                } else {
                    this.field1404[arg1] = var5.field1255;
                }
                this.field1405[arg1] = var5.field1215;
                this.field1395.field1317[arg1] = null;
                if (arg0.method8746(1) != 0) {
                    this.method2739(arg0, arg1);
                }
            }
        } else if (var4 == 1) {
            int var6 = arg0.method8746(3);
            int var7 = var5.field1251[0];
            int var8 = var5.field1181[0];
            if (var6 == 0) {
                var7--;
                var8--;
            } else if (var6 == 1) {
                var8--;
            } else if (var6 == 2) {
                var7++;
                var8--;
            } else if (var6 == 3) {
                var7--;
            } else if (var6 == 4) {
                var7++;
            } else if (var6 == 5) {
                var7--;
                var8++;
            } else if (var6 == 6) {
                var8++;
            } else if (var6 == 7) {
                var7++;
                var8++;
            }
            if (client.field630 == arg1 && this.field1395.method2615() && (var5.field1249 < 1536 || var5.field1180 < 1536 || var5.field1249 >= 11776 || var5.field1180 >= 11776)) {
                var5.method2413(var7, var8);
                var5.field1129 = false;
            } else if (var3) {
                var5.field1129 = true;
                var5.field1123 = var7;
                var5.field1139 = var8;
            } else {
                var5.field1129 = false;
                var5.method2365(this.field1395, var7, var8, this.field1393[arg1]);
            }
        } else if (var4 == 2) {
            int var9 = arg0.method8746(4);
            int var10 = var5.field1251[0];
            int var11 = var5.field1181[0];
            if (var9 == 0) {
                var10 -= 2;
                var11 -= 2;
            } else if (var9 == 1) {
                var10--;
                var11 -= 2;
            } else if (var9 == 2) {
                var11 -= 2;
            } else if (var9 == 3) {
                var10++;
                var11 -= 2;
            } else if (var9 == 4) {
                var10 += 2;
                var11 -= 2;
            } else if (var9 == 5) {
                var10 -= 2;
                var11--;
            } else if (var9 == 6) {
                var10 += 2;
                var11--;
            } else if (var9 == 7) {
                var10 -= 2;
            } else if (var9 == 8) {
                var10 += 2;
            } else if (var9 == 9) {
                var10 -= 2;
                var11++;
            } else if (var9 == 10) {
                var10 += 2;
                var11++;
            } else if (var9 == 11) {
                var10 -= 2;
                var11 += 2;
            } else if (var9 == 12) {
                var10--;
                var11 += 2;
            } else if (var9 == 13) {
                var11 += 2;
            } else if (var9 == 14) {
                var10++;
                var11 += 2;
            } else if (var9 == 15) {
                var10 += 2;
                var11 += 2;
            }
            if (client.field630 == arg1 && this.field1395.method2615() && var5.field1249 < 1536 || var5.field1180 < 1536 || var5.field1249 >= 11776 || var5.field1180 >= 11776) {
                var5.method2413(var10, var11);
                var5.field1129 = false;
            } else if (var3) {
                var5.field1129 = true;
                var5.field1123 = var10;
                var5.field1139 = var11;
            } else {
                var5.field1129 = false;
                var5.method2365(this.field1395, var10, var11, this.field1393[arg1]);
            }
        } else {
            int var12 = arg0.method8746(1);
            if (var12 == 0) {
                int var13 = arg0.method8746(12);
                int var14 = var13 >> 10;
                int var15 = var13 >> 5 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var13 & 0x1F;
                if (var16 > 15) {
                    var16 -= 32;
                }
                int var17 = var5.field1251[0] + var15;
                int var18 = var5.field1181[0] + var16;
                if (client.field630 == arg1 && this.field1395.method2615() && (var5.field1249 < 1536 || var5.field1180 < 1536 || var5.field1249 >= 11776 || var5.field1180 >= 11776)) {
                    var5.method2413(var17, var18);
                    var5.field1129 = false;
                } else if (var3) {
                    var5.field1129 = true;
                    var5.field1123 = var17;
                    var5.field1139 = var18;
                } else {
                    var5.field1129 = false;
                    var5.method2365(this.field1395, var17, var18, this.field1393[arg1]);
                }
                var5.field1130 = (byte) (var5.field1130 + var14 & 0x3);
                if (client.field630 == arg1 && this.field1395.method2615()) {
                    this.field1395.field1308 = var5.field1130;
                }
            } else {
                int var19 = arg0.method8746(30);
                int var20 = class350.method5927(var19);
                int var21 = Statics.method5928(var19);
                int var22 = class350.method5929(var19);
                int var23 = (this.field1395.field1311 + var5.field1251[0] + var21 & 0x3FFF) - this.field1395.field1311;
                int var24 = (this.field1395.field1319 + var5.field1181[0] + var22 & 0x3FFF) - this.field1395.field1319;
                if (client.field630 == arg1 && this.field1395.method2615() && var5.field1249 < 1536 || var5.field1180 < 1536 || var5.field1249 >= 11776 || var5.field1180 >= 11776) {
                    var5.method2413(var23, var24);
                    var5.field1129 = false;
                } else if (var3) {
                    var5.field1129 = true;
                    var5.field1123 = var23;
                    var5.field1139 = var24;
                } else {
                    var5.field1129 = false;
                    var5.method2365(this.field1395, var23, var24, this.field1393[arg1]);
                }
                var5.field1130 = (byte) (var5.field1130 + var20 & 0x3);
                if (client.field630 == arg1 && this.field1395.method2615()) {
                    this.field1395.field1308 = var5.field1130;
                }
            }
        }
    }

    @ObfuscatedName("eo.ao(Lvs;II)Z")
    public boolean method2739(class548 arg0, int arg1) {
        int var3 = arg0.method8746(2);
        if (var3 == 0) {
            if (arg0.method8746(1) != 0) {
                this.method2739(arg0, arg1);
            }
            int var4 = arg0.method8746(13);
            int var5 = arg0.method8746(13);
            boolean var6 = arg0.method8746(1) == 1;
            if (var6) {
                this.field1407[++this.field1406 - 1] = arg1;
            }
            if (this.field1395.field1317[arg1] != null) {
                throw new RuntimeException();
            }
            class94 var7 = this.field1395.field1317[arg1] = new class94();
            var7.field1133 = arg1;
            if (this.field1403[arg1] != null) {
                var7.method2361(this.field1403[arg1]);
            }
            var7.field1247 = this.field1404[arg1];
            var7.field1215 = this.field1405[arg1];
            int var8 = this.field1400[arg1];
            int var9 = var8 >> 28;
            int var10 = var8 >> 14 & 0xFF;
            int var11 = var8 & 0xFF;
            var7.field1253[0] = this.field1393[arg1];
            var7.field1130 = (byte) var9;
            var7.method2413((var10 << 13) + var4 - this.field1395.field1311, (var11 << 13) + var5 - this.field1395.field1319);
            var7.field1129 = false;
            return true;
        } else if (var3 == 1) {
            int var12 = arg0.method8746(2);
            int var13 = this.field1400[arg1];
            this.field1400[arg1] = (((var13 >> 28) + var12 & 0x3) << 28) + (var13 & 0xFFFFFFF);
            return false;
        } else if (var3 == 2) {
            int var14 = arg0.method8746(5);
            int var15 = var14 >> 3;
            int var16 = var14 & 0x7;
            int var17 = this.field1400[arg1];
            int var18 = (var17 >> 28) + var15 & 0x3;
            int var19 = var17 >> 14 & 0xFF;
            int var20 = var17 & 0xFF;
            if (var16 == 0) {
                var19--;
                var20--;
            }
            if (var16 == 1) {
                var20--;
            }
            if (var16 == 2) {
                var19++;
                var20--;
            }
            if (var16 == 3) {
                var19--;
            }
            if (var16 == 4) {
                var19++;
            }
            if (var16 == 5) {
                var19--;
                var20++;
            }
            if (var16 == 6) {
                var20++;
            }
            if (var16 == 7) {
                var19++;
                var20++;
            }
            this.field1400[arg1] = class350.method5926(var18, var19, var20);
            return false;
        } else {
            int var21 = arg0.method8746(18);
            int var22 = var21 >> 16;
            int var23 = var21 >> 8 & 0xFF;
            int var24 = var21 & 0xFF;
            int var25 = this.field1400[arg1];
            int var26 = (var25 >> 28) + var22 & 0x3;
            int var27 = (var25 >> 14) + var23 & 0xFF;
            int var28 = var24 + var25 & 0xFF;
            this.field1400[arg1] = class350.method5926(var26, var27, var28);
            return false;
        }
    }

    @ObfuscatedName("eo.am(Lvs;I)V")
    public final void method2740(class548 arg0) {
        for (int var2 = 0; var2 < this.field1406; var2++) {
            int var3 = this.field1407[var2];
            class94 var4 = this.field1395.field1317[var3];
            int var5 = arg0.method9025();
            if ((var5 & 0x10) != 0) {
                var5 += arg0.method9025() << 8;
            }
            if ((var5 & 0x1000) != 0) {
                var5 += arg0.method9025() << 16;
            }
            this.method2741(arg0, var3, var4, var5);
        }
    }

    @ObfuscatedName("eo.ac(Lvs;ILdw;IB)V")
    public final void method2741(class548 arg0, int arg1, class94 arg2, int arg3) {
        byte var5 = class275.field2983.field2991;
        if ((arg3 & 0x10000) != 0) {
            int var6 = arg0.method8839();
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg0.method9025();
                int var9 = arg0.method8990();
                int var10 = arg0.method8803();
                arg2.method2425(var8, var9, var10 >> 16, var10 & 0xFFFF);
            }
        }
        if ((arg3 & 0x800) != 0) {
            int var11 = arg0.method8968();
            int var12 = var11 >> 8;
            int var13 = var12 >= 13 && var12 <= 20 ? var12 - 12 : 0;
            class383 var14 = (class383) class403.method3083(class383.method5910(), arg0.method8958());
            boolean var15 = arg0.method8880() == 1;
            int var16 = arg0.method8839();
            int var17 = arg0.field5378;
            if (arg2.field1138 != null && arg2.field1111 != null) {
                boolean var18 = false;
                if (var14.field4434 && Statics.field3011.method1860(arg2.field1138)) {
                    var18 = true;
                }
                if (!var18 && client.field587 == 0 && !arg2.field1131) {
                    this.field1408.field5378 = 0;
                    arg0.method8948(this.field1408.field5381, 0, var16);
                    this.field1408.field5378 = 0;
                    String var19 = class437.method7594(class417.method3596(class364.method8085(this.field1408)));
                    arg2.field1211 = var19.trim();
                    arg2.field1205 = var11 >> 8;
                    arg2.field1206 = var11 & 0xFF;
                    arg2.field1204 = 150;
                    byte[] var20 = null;
                    if (var13 > 0 && var13 <= 8) {
                        var20 = new byte[var13];
                        for (int var21 = 0; var21 < var13; var21++) {
                            var20[var21] = arg0.method8798();
                        }
                    }
                    byte[] var23 = var20;
                    int[] var26;
                    if (var20 == null || var20.length == 0 || var20.length > 8) {
                        var26 = null;
                    } else {
                        int[] var24 = new int[var20.length];
                        int var25 = 0;
                        while (true) {
                            if (var25 >= var23.length) {
                                var26 = var24;
                                break;
                            }
                            if (var23[var25] < 0 || var23[var25] >= class573.field5549.length) {
                                var26 = null;
                                break;
                            }
                            var24[var25] = class573.field5549[var23[var25]];
                            var25++;
                        }
                    }
                    arg2.field1207 = var26;
                    arg2.field1202 = var15;
                    arg2.field1209 = Statics.field2672 != arg2 && var14.field4434 && !client.field732.isEmpty() && var19.toLowerCase().indexOf(client.field732) == -1;
                    int var27;
                    if (var14.field4431) {
                        var27 = var15 ? 91 : 1;
                    } else {
                        var27 = var15 ? 90 : 2;
                    }
                    if (var14.field4432 == -1) {
                        class114.method4997(var27, arg2.field1138.method9470(), var19);
                    } else {
                        class114.method4997(var27, class105.method3198(var14.field4432) + arg2.field1138.method9470(), var19);
                    }
                }
            }
            arg0.field5378 = var16 + var17 + var13;
        }
        if ((arg3 & 0x8000) != 0) {
            arg2.field1232 = arg0.method8798();
            arg2.field1234 = arg0.method8941();
            arg2.field1233 = arg0.method8941();
            arg2.field1235 = arg0.method8833();
            arg2.field1236 = arg0.method9046() + client.field519;
            arg2.field1237 = arg0.method9046() + client.field519;
            arg2.field1238 = arg0.method8990();
            if (arg2.field1129) {
                arg2.field1232 += arg2.field1123;
                arg2.field1234 += arg2.field1139;
                arg2.field1233 += arg2.field1123;
                arg2.field1235 += arg2.field1139;
                arg2.field1217 = 0;
            } else {
                arg2.field1232 += arg2.field1251[0];
                arg2.field1234 += arg2.field1181[0];
                arg2.field1233 += arg2.field1251[0];
                arg2.field1235 += arg2.field1181[0];
                arg2.field1217 = 1;
            }
            arg2.field1256 = 0;
        }
        if ((arg3 & 0x2000) != 0) {
            class275[] var28 = this.field1393;
            class275[] var30 = new class275[] { class275.field2987, class275.field2989, class275.field2992, class275.field2983, class275.field2984, class275.field2988, class275.field2985, class275.field2986, class275.field2982 };
            var28[arg1] = (class275) class403.method3083(var30, arg0.method8941());
        }
        if ((arg3 & 0x2) != 0) {
            int var31 = arg0.method8968();
            class383 var32 = (class383) class403.method3083(class383.method5910(), arg0.method9025());
            boolean var33 = arg0.method8958() == 1;
            int var34 = arg0.method8839();
            int var35 = arg0.field5378;
            if (arg2.field1138 != null && arg2.field1111 != null) {
                boolean var36 = false;
                if (var32.field4434 && Statics.field3011.method1860(arg2.field1138)) {
                    var36 = true;
                }
                if (!var36 && client.field587 == 0 && !arg2.field1131) {
                    this.field1408.field5378 = 0;
                    arg0.method8857(this.field1408.field5381, 0, var34);
                    this.field1408.field5378 = 0;
                    String var37 = class437.method7594(class417.method3596(class364.method8085(this.field1408)));
                    arg2.field1211 = var37.trim();
                    arg2.field1205 = var31 >> 8;
                    arg2.field1206 = var31 & 0xFF;
                    arg2.field1204 = 150;
                    arg2.field1207 = null;
                    arg2.field1202 = var33;
                    arg2.field1209 = Statics.field2672 != arg2 && var32.field4434 && !client.field732.isEmpty() && var37.toLowerCase().indexOf(client.field732) == -1;
                    int var38;
                    if (var32.field4431) {
                        var38 = var33 ? 91 : 1;
                    } else {
                        var38 = var33 ? 90 : 2;
                    }
                    if (var32.field4432 == -1) {
                        class114.method4997(var38, arg2.field1138.method9470(), var37);
                    } else {
                        class114.method4997(var38, class105.method3198(var32.field4432) + arg2.field1138.method9470(), var37);
                    }
                }
            }
            arg0.field5378 = var34 + var35;
        }
        if ((arg3 & 0x400) != 0) {
            for (int var39 = 0; var39 < 3; var39++) {
                arg2.field1127[var39] = arg0.method8808();
            }
        }
        if ((arg3 & 0x100) != 0) {
            arg2.field1245 = client.field519 + arg0.method8990();
            arg2.field1242 = client.field519 + arg0.method9046();
            arg2.field1243 = arg0.method8833();
            arg2.field1244 = arg0.method8833();
            arg2.field1241 = arg0.method8798();
            arg2.field1221 = (byte) arg0.method8958();
        }
        if ((arg3 & 0x40) != 0) {
            arg2.field1215 = arg0.method8990();
            arg2.field1215 += arg0.method8958() << 16;
            int var40 = 16777215;
            if (arg2.field1215 == var40) {
                arg2.field1215 = -1;
            }
        }
        if ((arg3 & 0x4) != 0) {
            int var41 = arg0.method8839();
            byte[] var42 = new byte[var41];
            class549 var43 = new class549(var42);
            arg0.method8857(var42, 0, var41);
            this.field1403[arg1] = var43;
            arg2.method2361(var43);
        }
        if ((arg3 & 0x1) != 0) {
            arg2.field1255 = arg0.method8990();
            if (arg2.field1217 == 0) {
                arg2.field1247 = arg2.field1255;
                arg2.method2428();
            }
        }
        if ((arg3 & 0x80) != 0) {
            int var44 = arg0.method8968();
            if (var44 == 65535) {
                var44 = -1;
            }
            int var45 = arg0.method9025();
            client.method2176(arg2, var44, var45);
        }
        if ((arg3 & 0x200) != 0) {
            var5 = arg0.method8833();
        }
        if ((arg3 & 0x20) != 0) {
            int var46 = arg0.method8880();
            if (var46 > 0) {
                for (int var47 = 0; var47 < var46; var47++) {
                    int var48 = -1;
                    int var49 = -1;
                    int var50 = -1;
                    int var51 = arg0.method8813();
                    if (var51 == 32767) {
                        var51 = arg0.method8813();
                        var49 = arg0.method8813();
                        var48 = arg0.method8813();
                        var50 = arg0.method8813();
                    } else if (var51 == 32766) {
                        var51 = -1;
                    } else {
                        var49 = arg0.method8813();
                    }
                    int var52 = arg0.method8813();
                    arg2.method2422(var51, var49, var48, var50, client.field519, var52);
                }
            }
            int var53 = arg0.method9025();
            if (var53 > 0) {
                for (int var54 = 0; var54 < var53; var54++) {
                    int var55 = arg0.method8813();
                    int var56 = arg0.method8813();
                    if (var56 == 32767) {
                        arg2.method2424(var55);
                    } else {
                        int var57 = arg0.method8813();
                        int var58 = arg0.method8958();
                        int var59 = var56 > 0 ? arg0.method8958() : var58;
                        arg2.method2463(var55, client.field519, var56, var57, var58, var59);
                    }
                }
            }
        }
        if ((arg3 & 0x8) != 0) {
            arg2.field1211 = arg0.method8808();
            if (arg2.field1211.charAt(0) == '~') {
                arg2.field1211 = arg2.field1211.substring(1);
                class114.method4997(2, arg2.field1138.method9470(), arg2.field1211);
            } else if (Statics.field2672 == arg2) {
                class114.method4997(2, arg2.field1138.method9470(), arg2.field1211);
            }
            arg2.field1202 = false;
            arg2.field1205 = 0;
            arg2.field1206 = 0;
            arg2.field1204 = 150;
        }
        if (!arg2.field1129) {
            return;
        }
        if (var5 == 127) {
            arg2.method2413(arg2.field1123, arg2.field1139);
            return;
        }
        class275 var61;
        if (class275.field2983.field2991 == var5) {
            var61 = this.field1393[arg1];
        } else {
            class275[] var60 = new class275[] { class275.field2987, class275.field2989, class275.field2992, class275.field2983, class275.field2984, class275.field2988, class275.field2985, class275.field2986, class275.field2982 };
            var61 = (class275) class403.method3083(var60, var5);
        }
        arg2.method2365(this.field1395, arg2.field1123, arg2.field1139, var61);
    }
}
