package deob;

@ObfuscatedName("ed")
public class class111 {

    @ObfuscatedName("ed.aj")
    public class102 field1412;

    @ObfuscatedName("ed.az")
    public byte[] field1413 = new byte[2048];

    @ObfuscatedName("ed.af")
    public class238[] field1414 = new class238[2048];

    @ObfuscatedName("ed.aa")
    public class546[] field1415 = new class546[2048];

    @ObfuscatedName("ed.at")
    public int field1416 = 0;

    @ObfuscatedName("ed.ab")
    public int[] field1417 = new int[2048];

    @ObfuscatedName("ed.ac")
    public int field1427 = 0;

    @ObfuscatedName("ed.ao")
    public int[] field1419 = new int[2048];

    @ObfuscatedName("ed.ah")
    public int[] field1420 = new int[2048];

    @ObfuscatedName("ed.av")
    public int[] field1421 = new int[2048];

    @ObfuscatedName("ed.aq")
    public int[] field1410 = new int[2048];

    @ObfuscatedName("ed.ap")
    public int field1424 = 0;

    @ObfuscatedName("ed.ae")
    public int[] field1423 = new int[2048];

    @ObfuscatedName("ed.ax")
    public class546 field1425 = new class546(new byte[5000]);

    public class111(class102 arg0) {
        this.field1412 = arg0;
    }

    @ObfuscatedName("ed.ak(Luk;ZI)V")
    public final void method2642(class545 arg0, boolean arg1) {
        arg0.method8738();
        class94 var3 = new class94();
        int var4 = client.field689;
        if (arg1) {
            Statics.field84 = var3;
            Statics.field3967.field1342[var4] = var3;
        } else {
            this.field1412.field1342[var4] = var3;
            Statics.field84.field1135 = this.field1412;
        }
        var3.field1158 = var4;
        int var5 = arg0.method8743(30);
        byte var6 = (byte) (var5 >> 28);
        int var7 = var5 >> 14 & 0x3FFF;
        int var8 = var5 & 0x3FFF;
        var3.field1230[0] = var7 - this.field1412.field1338;
        var3.field1215 = (var3.field1230[0] << 7) + (var3.method2267() << 6);
        var3.field1277[0] = var8 - this.field1412.field1334;
        var3.field1276 = (var3.field1277[0] << 7) + (var3.method2267() << 6);
        if (arg1) {
            this.field1412.field1349 = var3.field1151 = var6;
        }
        if (this.field1415[var4] != null) {
            var3.method2278(this.field1415[var4]);
        }
        this.field1416 = 0;
        this.field1417[++this.field1416 - 1] = var4;
        this.field1413[var4] = 0;
        this.field1427 = 0;
        for (int var9 = 1; var9 < 2048; var9++) {
            if (var4 != var9) {
                int var10 = arg0.method8743(18);
                int var11 = var10 >> 16;
                int var12 = var10 >> 8 & 0x255;
                int var13 = var10 & 0x255;
                this.field1420[var9] = (var11 << 28) + (var12 << 14) + var13;
                this.field1421[var9] = 0;
                this.field1410[var9] = -1;
                this.field1419[++this.field1427 - 1] = var9;
                this.field1413[var9] = 0;
            }
        }
        arg0.method8772();
    }

    @ObfuscatedName("ed.al(Luk;II)V")
    public final void method2643(class545 arg0, int arg1) {
        int var3 = arg0.field5344;
        this.field1424 = 0;
        this.method2644(arg0);
        this.method2665(arg0);
        if (arg0.field5344 - var3 != arg1) {
            throw new RuntimeException(arg0.field5344 - var3 + " " + arg1);
        }
    }

    @ObfuscatedName("ed.aj(Luk;I)V")
    public final void method2644(class545 arg0) {
        int var2 = 0;
        arg0.method8738();
        for (int var3 = 0; var3 < this.field1416; var3++) {
            int var4 = this.field1417[var3];
            if ((this.field1413[var4] & 0x1) == 0) {
                if (var2 > 0) {
                    var2--;
                    this.field1413[var4] = (byte) (this.field1413[var4] | 0x2);
                } else {
                    int var5 = arg0.method8743(1);
                    if (var5 == 0) {
                        var2 = this.method2645(arg0);
                        this.field1413[var4] = (byte) (this.field1413[var4] | 0x2);
                    } else {
                        this.method2646(arg0, var4);
                    }
                }
            }
        }
        arg0.method8772();
        if (var2 != 0) {
            throw new RuntimeException();
        }
        arg0.method8738();
        for (int var6 = 0; var6 < this.field1416; var6++) {
            int var7 = this.field1417[var6];
            if ((this.field1413[var7] & 0x1) != 0) {
                if (var2 > 0) {
                    var2--;
                    this.field1413[var7] = (byte) (this.field1413[var7] | 0x2);
                } else {
                    int var8 = arg0.method8743(1);
                    if (var8 == 0) {
                        var2 = this.method2645(arg0);
                        this.field1413[var7] = (byte) (this.field1413[var7] | 0x2);
                    } else {
                        this.method2646(arg0, var7);
                    }
                }
            }
        }
        arg0.method8772();
        if (var2 != 0) {
            throw new RuntimeException();
        }
        arg0.method8738();
        for (int var9 = 0; var9 < this.field1427; var9++) {
            int var10 = this.field1419[var9];
            if ((this.field1413[var10] & 0x1) != 0) {
                if (var2 > 0) {
                    var2--;
                    this.field1413[var10] = (byte) (this.field1413[var10] | 0x2);
                } else {
                    int var11 = arg0.method8743(1);
                    if (var11 == 0) {
                        var2 = this.method2645(arg0);
                        this.field1413[var10] = (byte) (this.field1413[var10] | 0x2);
                    } else if (this.method2647(arg0, var10)) {
                        this.field1413[var10] = (byte) (this.field1413[var10] | 0x2);
                    }
                }
            }
        }
        arg0.method8772();
        if (var2 != 0) {
            throw new RuntimeException();
        }
        arg0.method8738();
        for (int var12 = 0; var12 < this.field1427; var12++) {
            int var13 = this.field1419[var12];
            if ((this.field1413[var13] & 0x1) == 0) {
                if (var2 > 0) {
                    var2--;
                    this.field1413[var13] = (byte) (this.field1413[var13] | 0x2);
                } else {
                    int var14 = arg0.method8743(1);
                    if (var14 == 0) {
                        var2 = this.method2645(arg0);
                        this.field1413[var13] = (byte) (this.field1413[var13] | 0x2);
                    } else if (this.method2647(arg0, var13)) {
                        this.field1413[var13] = (byte) (this.field1413[var13] | 0x2);
                    }
                }
            }
        }
        arg0.method8772();
        if (var2 != 0) {
            throw new RuntimeException();
        }
        this.field1416 = 0;
        this.field1427 = 0;
        for (int var15 = 1; var15 < 2048; var15++) {
            this.field1413[var15] = (byte) (this.field1413[var15] >> 1);
            class94 var16 = this.field1412.field1342[var15];
            if (var16 == null) {
                this.field1419[++this.field1427 - 1] = var15;
            } else {
                this.field1417[++this.field1416 - 1] = var15;
            }
        }
    }

    @ObfuscatedName("ed.az(Luk;S)I")
    public int method2645(class545 arg0) {
        int var2 = arg0.method8743(2);
        int var3;
        if (var2 == 0) {
            var3 = 0;
        } else if (var2 == 1) {
            var3 = arg0.method8743(5);
        } else if (var2 == 2) {
            var3 = arg0.method8743(8);
        } else {
            var3 = arg0.method8743(11);
        }
        return var3;
    }

    @ObfuscatedName("ed.af(Luk;II)V")
    public void method2646(class545 arg0, int arg1) {
        boolean var3 = arg0.method8743(1) == 1;
        if (var3) {
            this.field1423[++this.field1424 - 1] = arg1;
        }
        int var4 = arg0.method8743(2);
        class94 var5 = this.field1412.field1342[arg1];
        if (var4 == 0) {
            if (var3) {
                var5.field1162 = false;
            } else if (client.field689 == arg1) {
                throw new RuntimeException();
            } else {
                this.field1420[arg1] = (this.field1412.field1334 + var5.field1277[0] >> 13) + (this.field1412.field1338 + var5.field1230[0] >> 13 << 14) + (var5.field1151 << 28);
                if (var5.field1205 == -1) {
                    this.field1421[arg1] = var5.field1283;
                } else {
                    this.field1421[arg1] = var5.field1205;
                }
                this.field1410[arg1] = var5.field1220;
                this.field1412.field1342[arg1] = null;
                if (arg0.method8743(1) != 0) {
                    this.method2647(arg0, arg1);
                }
            }
        } else if (var4 == 1) {
            int var6 = arg0.method8743(3);
            int var7 = var5.field1230[0];
            int var8 = var5.field1277[0];
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
            if (client.field689 == arg1 && this.field1412.method2516() && (var5.field1215 < 1536 || var5.field1276 < 1536 || var5.field1215 >= 11776 || var5.field1276 >= 11776)) {
                var5.method2258(var7, var8);
                var5.field1162 = false;
            } else if (var3) {
                var5.field1162 = true;
                var5.field1163 = var7;
                var5.field1164 = var8;
            } else {
                var5.field1162 = false;
                var5.method2269(this.field1412, var7, var8, this.field1414[arg1]);
            }
        } else if (var4 == 2) {
            int var9 = arg0.method8743(4);
            int var10 = var5.field1230[0];
            int var11 = var5.field1277[0];
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
            if (client.field689 == arg1 && this.field1412.method2516() && var5.field1215 < 1536 || var5.field1276 < 1536 || var5.field1215 >= 11776 || var5.field1276 >= 11776) {
                var5.method2258(var10, var11);
                var5.field1162 = false;
            } else if (var3) {
                var5.field1162 = true;
                var5.field1163 = var10;
                var5.field1164 = var11;
            } else {
                var5.field1162 = false;
                var5.method2269(this.field1412, var10, var11, this.field1414[arg1]);
            }
        } else {
            int var12 = arg0.method8743(1);
            if (var12 == 0) {
                int var13 = arg0.method8743(12);
                int var14 = var13 >> 10;
                int var15 = var13 >> 5 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var13 & 0x1F;
                if (var16 > 15) {
                    var16 -= 32;
                }
                int var17 = var5.field1230[0] + var15;
                int var18 = var5.field1277[0] + var16;
                if (client.field689 == arg1 && this.field1412.method2516() && (var5.field1215 < 1536 || var5.field1276 < 1536 || var5.field1215 >= 11776 || var5.field1276 >= 11776)) {
                    var5.method2258(var17, var18);
                    var5.field1162 = false;
                } else if (var3) {
                    var5.field1162 = true;
                    var5.field1163 = var17;
                    var5.field1164 = var18;
                } else {
                    var5.field1162 = false;
                    var5.method2269(this.field1412, var17, var18, this.field1414[arg1]);
                }
                var5.field1151 = (byte) (var5.field1151 + var14 & 0x3);
                if (client.field689 == arg1 && this.field1412.method2516()) {
                    this.field1412.field1349 = var5.field1151;
                }
            } else {
                int var19 = arg0.method8743(30);
                int var20 = var19 >> 28;
                int var21 = var19 >> 14 & 0x3FFF;
                int var22 = var19 & 0x3FFF;
                int var23 = (this.field1412.field1338 + var5.field1230[0] + var21 & 0x3FFF) - this.field1412.field1338;
                int var24 = (this.field1412.field1334 + var5.field1277[0] + var22 & 0x3FFF) - this.field1412.field1334;
                if (client.field689 == arg1 && this.field1412.method2516() && var5.field1215 < 1536 || var5.field1276 < 1536 || var5.field1215 >= 11776 || var5.field1276 >= 11776) {
                    var5.method2258(var23, var24);
                    var5.field1162 = false;
                } else if (var3) {
                    var5.field1162 = true;
                    var5.field1163 = var23;
                    var5.field1164 = var24;
                } else {
                    var5.field1162 = false;
                    var5.method2269(this.field1412, var23, var24, this.field1414[arg1]);
                }
                var5.field1151 = (byte) (var5.field1151 + var20 & 0x3);
                if (client.field689 == arg1 && this.field1412.method2516()) {
                    this.field1412.field1349 = var5.field1151;
                }
            }
        }
    }

    @ObfuscatedName("ed.aa(Luk;II)Z")
    public boolean method2647(class545 arg0, int arg1) {
        int var3 = arg0.method8743(2);
        if (var3 == 0) {
            if (arg0.method8743(1) != 0) {
                this.method2647(arg0, arg1);
            }
            int var4 = arg0.method8743(13);
            int var5 = arg0.method8743(13);
            boolean var6 = arg0.method8743(1) == 1;
            if (var6) {
                this.field1423[++this.field1424 - 1] = arg1;
            }
            if (this.field1412.field1342[arg1] != null) {
                throw new RuntimeException();
            }
            class94 var7 = this.field1412.field1342[arg1] = new class94();
            var7.field1158 = arg1;
            if (this.field1415[arg1] != null) {
                var7.method2278(this.field1415[arg1]);
            }
            var7.field1283 = this.field1421[arg1];
            var7.field1220 = this.field1410[arg1];
            int var8 = this.field1420[arg1];
            int var9 = var8 >> 28;
            int var10 = var8 >> 14 & 0xFF;
            int var11 = var8 & 0xFF;
            var7.field1278[0] = this.field1414[arg1];
            var7.field1151 = (byte) var9;
            var7.method2258((var10 << 13) + var4 - this.field1412.field1338, (var11 << 13) + var5 - this.field1412.field1334);
            var7.field1162 = false;
            return true;
        } else if (var3 == 1) {
            int var12 = arg0.method8743(2);
            int var13 = this.field1420[arg1];
            this.field1420[arg1] = (((var13 >> 28) + var12 & 0x3) << 28) + (var13 & 0xFFFFFFF);
            return false;
        } else if (var3 == 2) {
            int var14 = arg0.method8743(5);
            int var15 = var14 >> 3;
            int var16 = var14 & 0x7;
            int var17 = this.field1420[arg1];
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
            this.field1420[arg1] = (var18 << 28) + (var19 << 14) + var20;
            return false;
        } else {
            int var21 = arg0.method8743(18);
            int var22 = var21 >> 16;
            int var23 = var21 >> 8 & 0xFF;
            int var24 = var21 & 0xFF;
            int var25 = this.field1420[arg1];
            int var26 = (var25 >> 28) + var22 & 0x3;
            int var27 = (var25 >> 14) + var23 & 0xFF;
            int var28 = var24 + var25 & 0xFF;
            this.field1420[arg1] = (var26 << 28) + (var27 << 14) + var28;
            return false;
        }
    }

    @ObfuscatedName("ed.at(Luk;I)V")
    public final void method2665(class545 arg0) {
        for (int var2 = 0; var2 < this.field1424; var2++) {
            int var3 = this.field1423[var2];
            class94 var4 = this.field1412.field1342[var3];
            int var5 = arg0.method8796();
            if ((var5 & 0x40) != 0) {
                var5 += arg0.method8796() << 8;
            }
            if ((var5 & 0x8000) != 0) {
                var5 += arg0.method8796() << 16;
            }
            this.method2649(arg0, var3, var4, var5);
        }
    }

    @ObfuscatedName("ed.ab(Luk;ILde;II)V")
    public final void method2649(class545 arg0, int arg1, class94 arg2, int arg3) {
        byte var5 = class238.field2524.field2533;
        if ((arg3 & 0x80) != 0) {
            int var6 = arg0.method8913();
            if (var6 > 0) {
                for (int var7 = 0; var7 < var6; var7++) {
                    int var8 = -1;
                    int var9 = -1;
                    int var10 = -1;
                    int var11 = arg0.method8810();
                    if (var11 == 32767) {
                        var11 = arg0.method8810();
                        var9 = arg0.method8810();
                        var8 = arg0.method8810();
                        var10 = arg0.method8810();
                    } else if (var11 == 32766) {
                        var11 = -1;
                    } else {
                        var9 = arg0.method8810();
                    }
                    int var12 = arg0.method8810();
                    arg2.method2318(var11, var9, var8, var10, client.field821, var12);
                }
            }
            int var13 = arg0.method8913();
            if (var13 > 0) {
                for (int var14 = 0; var14 < var13; var14++) {
                    int var15 = arg0.method8810();
                    int var16 = arg0.method8810();
                    if (var16 == 32767) {
                        arg2.method2335(var15);
                    } else {
                        int var17 = arg0.method8810();
                        int var18 = arg0.method8828();
                        int var19 = var16 > 0 ? arg0.method8913() : var18;
                        arg2.method2319(var15, client.field821, var16, var17, var18, var19);
                    }
                }
            }
        }
        if ((arg3 & 0x2) != 0) {
            int var20 = arg0.method8836();
            class381 var21 = (class381) class401.method2027(class381.method2635(), arg0.method8829());
            boolean var22 = arg0.method8828() == 1;
            int var23 = arg0.method8796();
            int var24 = arg0.field5344;
            if (arg2.field1153 != null && arg2.field1157 != null) {
                boolean var25 = false;
                if (var21.field4422 && Statics.field182.method1803(arg2.field1153)) {
                    var25 = true;
                }
                if (!var25 && client.field651 == 0 && !arg2.field1143) {
                    this.field1425.field5344 = 0;
                    arg0.method8808(this.field1425.field5346, 0, var23);
                    this.field1425.field5344 = 0;
                    String var26 = class435.method7464(class415.method6484(class361.method5598(this.field1425)));
                    arg2.field1225 = var26.trim();
                    arg2.field1254 = var20 >> 8;
                    arg2.field1231 = var20 & 0xFF;
                    arg2.field1219 = 150;
                    arg2.field1212 = null;
                    arg2.field1222 = var22;
                    arg2.field1228 = Statics.field84 != arg2 && var21.field4422 && !client.field526.isEmpty() && var26.toLowerCase().indexOf(client.field526) == -1;
                    int var27;
                    if (var21.field4432) {
                        var27 = var22 ? 91 : 1;
                    } else {
                        var27 = var22 ? 90 : 2;
                    }
                    if (var21.field4427 == -1) {
                        class114.method2802(var27, arg2.field1153.method9385(), var26);
                    } else {
                        class114.method2802(var27, class105.method5596(var21.field4427) + arg2.field1153.method9385(), var26);
                    }
                }
            }
            arg0.field5344 = var23 + var24;
        }
        if ((arg3 & 0x20) != 0) {
            arg2.field1225 = arg0.method8806();
            if (arg2.field1225.charAt(0) == '~') {
                arg2.field1225 = arg2.field1225.substring(1);
                class114.method2802(2, arg2.field1153.method9385(), arg2.field1225);
            } else if (Statics.field84 == arg2) {
                class114.method2802(2, arg2.field1153.method9385(), arg2.field1225);
            }
            arg2.field1222 = false;
            arg2.field1254 = 0;
            arg2.field1231 = 0;
            arg2.field1219 = 150;
        }
        if ((arg3 & 0x200) != 0) {
            int var28 = arg0.method8798();
            int var29 = var28 >> 8;
            int var30 = var29 >= 13 && var29 <= 20 ? var29 - 12 : 0;
            class381 var31 = (class381) class401.method2027(class381.method2635(), arg0.method8828());
            boolean var32 = arg0.method8829() == 1;
            int var33 = arg0.method8829();
            int var34 = arg0.field5344;
            if (arg2.field1153 != null && arg2.field1157 != null) {
                boolean var35 = false;
                if (var31.field4422 && Statics.field182.method1803(arg2.field1153)) {
                    var35 = true;
                }
                if (!var35 && client.field651 == 0 && !arg2.field1143) {
                    this.field1425.field5344 = 0;
                    arg0.method8793(this.field1425.field5346, 0, var33);
                    this.field1425.field5344 = 0;
                    String var36 = class435.method7464(class415.method6484(class361.method5598(this.field1425)));
                    arg2.field1225 = var36.trim();
                    arg2.field1254 = var28 >> 8;
                    arg2.field1231 = var28 & 0xFF;
                    arg2.field1219 = 150;
                    byte[] var37 = null;
                    if (var30 > 0 && var30 <= 8) {
                        var37 = new byte[var30];
                        for (int var38 = 0; var38 < var30; var38++) {
                            var37[var38] = arg0.method8797();
                        }
                    }
                    byte[] var40 = var37;
                    int[] var43;
                    if (var37 == null || var37.length == 0 || var37.length > 8) {
                        var43 = null;
                    } else {
                        int[] var41 = new int[var37.length];
                        int var42 = 0;
                        while (true) {
                            if (var42 >= var40.length) {
                                var43 = var41;
                                break;
                            }
                            if (var40[var42] < 0 || var40[var42] >= class569.field5493.length) {
                                var43 = null;
                                break;
                            }
                            var41[var42] = class569.field5493[var40[var42]];
                            var42++;
                        }
                    }
                    arg2.field1212 = var43;
                    arg2.field1222 = var32;
                    arg2.field1228 = Statics.field84 != arg2 && var31.field4422 && !client.field526.isEmpty() && var36.toLowerCase().indexOf(client.field526) == -1;
                    int var44;
                    if (var31.field4432) {
                        var44 = var32 ? 91 : 1;
                    } else {
                        var44 = var32 ? 90 : 2;
                    }
                    if (var31.field4427 == -1) {
                        class114.method2802(var44, arg2.field1153.method9385(), var36);
                    } else {
                        class114.method2802(var44, class105.method5596(var31.field4427) + arg2.field1153.method9385(), var36);
                    }
                }
            }
            arg0.field5344 = var33 + var34 + var30;
        }
        if ((arg3 & 0x100) != 0) {
            class238[] var45 = this.field1414;
            class238[] var47 = new class238[] { class238.field2523, class238.field2527, class238.field2525, class238.field2529, class238.field2530, class238.field2531, class238.field2532, class238.field2526, class238.field2524 };
            var45[arg1] = (class238) class401.method2027(var47, arg0.method8797());
        }
        if ((arg3 & 0x2000) != 0) {
            var5 = arg0.method8830();
        }
        if ((arg3 & 0x4) != 0) {
            int var48 = arg0.method8796();
            byte[] var49 = new byte[var48];
            class546 var50 = new class546(var49);
            arg0.method8808(var49, 0, var48);
            this.field1415[arg1] = var50;
            arg2.method2278(var50);
        }
        if ((arg3 & 0x1) != 0) {
            arg2.field1205 = arg0.method8836();
            if (arg2.field1275 == 0) {
                arg2.field1283 = arg2.field1205;
                arg2.method2330();
            }
        }
        if ((arg3 & 0x4000) != 0) {
            for (int var51 = 0; var51 < 3; var51++) {
                arg2.field1140[var51] = arg0.method8806();
            }
        }
        if ((arg3 & 0x800) != 0) {
            arg2.field1266 = client.field821 + arg0.method8798();
            arg2.field1267 = client.field821 + arg0.method8836();
            arg2.field1268 = arg0.method8831();
            arg2.field1269 = arg0.method8965();
            arg2.field1270 = arg0.method8797();
            arg2.field1271 = (byte) arg0.method8913();
        }
        if ((arg3 & 0x400) != 0) {
            arg2.field1257 = arg0.method8797();
            arg2.field1259 = arg0.method8831();
            arg2.field1258 = arg0.method8965();
            arg2.field1260 = arg0.method8831();
            arg2.field1261 = arg0.method8798() + client.field821;
            arg2.field1262 = arg0.method8836() + client.field821;
            arg2.field1263 = arg0.method8896();
            if (arg2.field1162) {
                arg2.field1257 += arg2.field1163;
                arg2.field1259 += arg2.field1164;
                arg2.field1258 += arg2.field1163;
                arg2.field1260 += arg2.field1164;
                arg2.field1275 = 0;
            } else {
                arg2.field1257 += arg2.field1230[0];
                arg2.field1259 += arg2.field1277[0];
                arg2.field1258 += arg2.field1230[0];
                arg2.field1260 += arg2.field1277[0];
                arg2.field1275 = 1;
            }
            arg2.field1227 = 0;
        }
        if ((arg3 & 0x10) != 0) {
            int var52 = arg0.method8798();
            if (var52 == 65535) {
                var52 = -1;
            }
            int var53 = arg0.method8796();
            client.method3179(arg2, var52, var53);
        }
        if ((arg3 & 0x8) != 0) {
            arg2.field1220 = arg0.method8836();
            arg2.field1220 += arg0.method8913() << 16;
            int var54 = 16777215;
            if (arg2.field1220 == var54) {
                arg2.field1220 = -1;
            }
        }
        if ((arg3 & 0x10000) != 0) {
            int var55 = arg0.method8796();
            for (int var56 = 0; var56 < var55; var56++) {
                int var57 = arg0.method8796();
                int var58 = arg0.method8896();
                int var59 = arg0.method8801();
                arg2.method2328(var57, var58, var59 >> 16, var59 & 0xFFFF);
            }
        }
        if (!arg2.field1162) {
            return;
        }
        if (var5 == 127) {
            arg2.method2258(arg2.field1163, arg2.field1164);
            return;
        }
        class238 var61;
        if (class238.field2524.field2533 == var5) {
            var61 = this.field1414[arg1];
        } else {
            class238[] var60 = new class238[] { class238.field2523, class238.field2527, class238.field2525, class238.field2529, class238.field2530, class238.field2531, class238.field2532, class238.field2526, class238.field2524 };
            var61 = (class238) class401.method2027(var60, var5);
        }
        arg2.method2269(this.field1412, arg2.field1163, arg2.field1164, var61);
    }
}
