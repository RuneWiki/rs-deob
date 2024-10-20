package deob;

@ObfuscatedName("eh")
public class class111 {

    @ObfuscatedName("eh.ag")
    public class102 field1420;

    @ObfuscatedName("eh.ak")
    public byte[] field1406 = new byte[2048];

    @ObfuscatedName("eh.ap")
    public class239[] field1407 = new class239[2048];

    @ObfuscatedName("eh.an")
    public class547[] field1408 = new class547[2048];

    @ObfuscatedName("eh.aj")
    public int field1405 = 0;

    @ObfuscatedName("eh.av")
    public int[] field1410 = new int[2048];

    @ObfuscatedName("eh.ab")
    public int field1411 = 0;

    @ObfuscatedName("eh.ai")
    public int[] field1412 = new int[2048];

    @ObfuscatedName("eh.ae")
    public int[] field1403 = new int[2048];

    @ObfuscatedName("eh.au")
    public int[] field1414 = new int[2048];

    @ObfuscatedName("eh.ah")
    public int[] field1415 = new int[2048];

    @ObfuscatedName("eh.az")
    public int field1416 = 0;

    @ObfuscatedName("eh.ax")
    public int[] field1417 = new int[2048];

    @ObfuscatedName("eh.ac")
    public class547 field1418 = new class547(new byte[5000]);

    public class111(class102 arg0) {
        this.field1420 = arg0;
    }

    @ObfuscatedName("eh.aq(Lug;ZI)V")
    public final void method2671(class546 arg0, boolean arg1) {
        arg0.method8677();
        class94 var3 = new class94();
        int var4 = client.field707;
        if (arg1) {
            Statics.field297 = var3;
            Statics.field5138.field1327[var4] = var3;
        } else {
            this.field1420.field1327[var4] = var3;
        }
        var3.field1141 = var4;
        int var5 = arg0.method8678(30);
        byte var6 = (byte) class348.method5849(var5);
        int var7 = Statics.method5848(var5);
        int var8 = class348.method5854(var5);
        var3.field1205[0] = var7 - this.field1420.field1322;
        var3.field1229 = (var3.field1205[0] << 7) + (var3.method2305() << 6);
        var3.field1247[0] = var8 - this.field1420.field1324;
        var3.field1192 = (var3.field1247[0] << 7) + (var3.method2305() << 6);
        if (arg1) {
            this.field1420.field1319 = var3.field1128 = var6;
        }
        if (this.field1408[var4] != null) {
            var3.method2310(this.field1408[var4]);
        }
        this.field1405 = 0;
        this.field1410[++this.field1405 - 1] = var4;
        this.field1406[var4] = 0;
        this.field1411 = 0;
        for (int var9 = 1; var9 < 2048; var9++) {
            if (var4 != var9) {
                int var10 = arg0.method8678(18);
                int var11 = var10 >> 16;
                int var12 = var10 >> 8 & 0x255;
                int var13 = var10 & 0x255;
                this.field1403[var9] = Statics.method5840(var11, var12, var13);
                this.field1414[var9] = 0;
                this.field1415[var9] = -1;
                this.field1412[++this.field1411 - 1] = var9;
                this.field1406[var9] = 0;
            }
        }
        arg0.method8679();
    }

    @ObfuscatedName("eh.ad(Lug;II)V")
    public final void method2677(class546 arg0, int arg1) {
        int var3 = arg0.field5363;
        this.field1416 = 0;
        this.method2672(arg0);
        this.method2676(arg0);
        if (arg0.field5363 - var3 != arg1) {
            throw new RuntimeException(arg0.field5363 - var3 + " " + arg1);
        }
    }

    @ObfuscatedName("eh.ag(Lug;B)V")
    public final void method2672(class546 arg0) {
        int var2 = 0;
        arg0.method8677();
        for (int var3 = 0; var3 < this.field1405; var3++) {
            int var4 = this.field1410[var3];
            if ((this.field1406[var4] & 0x1) == 0) {
                if (var2 > 0) {
                    var2--;
                    this.field1406[var4] = (byte) (this.field1406[var4] | 0x2);
                } else {
                    int var5 = arg0.method8678(1);
                    if (var5 == 0) {
                        var2 = this.method2673(arg0);
                        this.field1406[var4] = (byte) (this.field1406[var4] | 0x2);
                    } else {
                        this.method2674(arg0, var4);
                    }
                }
            }
        }
        arg0.method8679();
        if (var2 != 0) {
            throw new RuntimeException();
        }
        arg0.method8677();
        for (int var6 = 0; var6 < this.field1405; var6++) {
            int var7 = this.field1410[var6];
            if ((this.field1406[var7] & 0x1) != 0) {
                if (var2 > 0) {
                    var2--;
                    this.field1406[var7] = (byte) (this.field1406[var7] | 0x2);
                } else {
                    int var8 = arg0.method8678(1);
                    if (var8 == 0) {
                        var2 = this.method2673(arg0);
                        this.field1406[var7] = (byte) (this.field1406[var7] | 0x2);
                    } else {
                        this.method2674(arg0, var7);
                    }
                }
            }
        }
        arg0.method8679();
        if (var2 != 0) {
            throw new RuntimeException();
        }
        arg0.method8677();
        for (int var9 = 0; var9 < this.field1411; var9++) {
            int var10 = this.field1412[var9];
            if ((this.field1406[var10] & 0x1) != 0) {
                if (var2 > 0) {
                    var2--;
                    this.field1406[var10] = (byte) (this.field1406[var10] | 0x2);
                } else {
                    int var11 = arg0.method8678(1);
                    if (var11 == 0) {
                        var2 = this.method2673(arg0);
                        this.field1406[var10] = (byte) (this.field1406[var10] | 0x2);
                    } else if (this.method2698(arg0, var10)) {
                        this.field1406[var10] = (byte) (this.field1406[var10] | 0x2);
                    }
                }
            }
        }
        arg0.method8679();
        if (var2 != 0) {
            throw new RuntimeException();
        }
        arg0.method8677();
        for (int var12 = 0; var12 < this.field1411; var12++) {
            int var13 = this.field1412[var12];
            if ((this.field1406[var13] & 0x1) == 0) {
                if (var2 > 0) {
                    var2--;
                    this.field1406[var13] = (byte) (this.field1406[var13] | 0x2);
                } else {
                    int var14 = arg0.method8678(1);
                    if (var14 == 0) {
                        var2 = this.method2673(arg0);
                        this.field1406[var13] = (byte) (this.field1406[var13] | 0x2);
                    } else if (this.method2698(arg0, var13)) {
                        this.field1406[var13] = (byte) (this.field1406[var13] | 0x2);
                    }
                }
            }
        }
        arg0.method8679();
        if (var2 != 0) {
            throw new RuntimeException();
        }
        this.field1405 = 0;
        this.field1411 = 0;
        for (int var15 = 1; var15 < 2048; var15++) {
            this.field1406[var15] = (byte) (this.field1406[var15] >> 1);
            class94 var16 = this.field1420.field1327[var15];
            if (var16 == null) {
                this.field1412[++this.field1411 - 1] = var15;
            } else {
                this.field1410[++this.field1405 - 1] = var15;
            }
        }
    }

    @ObfuscatedName("eh.ak(Lug;I)I")
    public int method2673(class546 arg0) {
        int var2 = arg0.method8678(2);
        int var3;
        if (var2 == 0) {
            var3 = 0;
        } else if (var2 == 1) {
            var3 = arg0.method8678(5);
        } else if (var2 == 2) {
            var3 = arg0.method8678(8);
        } else {
            var3 = arg0.method8678(11);
        }
        return var3;
    }

    @ObfuscatedName("eh.ap(Lug;II)V")
    public void method2674(class546 arg0, int arg1) {
        boolean var3 = arg0.method8678(1) == 1;
        if (var3) {
            this.field1417[++this.field1416 - 1] = arg1;
        }
        int var4 = arg0.method8678(2);
        class94 var5 = this.field1420.field1327[arg1];
        if (var4 == 0) {
            if (var3) {
                var5.field1145 = false;
            } else if (client.field707 == arg1) {
                throw new RuntimeException();
            } else {
                this.field1403[arg1] = Statics.method5840(var5.field1128, this.field1420.field1322 + var5.field1205[0] >> 13, this.field1420.field1324 + var5.field1247[0] >> 13);
                if (var5.field1228 == -1) {
                    this.field1414[arg1] = var5.field1258;
                } else {
                    this.field1414[arg1] = var5.field1228;
                }
                this.field1415[arg1] = var5.field1191;
                this.field1420.field1327[arg1] = null;
                if (arg0.method8678(1) != 0) {
                    this.method2698(arg0, arg1);
                }
            }
        } else if (var4 == 1) {
            int var6 = arg0.method8678(3);
            int var7 = var5.field1205[0];
            int var8 = var5.field1247[0];
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
            if (client.field707 == arg1 && this.field1420.method2547() && (var5.field1229 < 1536 || var5.field1192 < 1536 || var5.field1229 >= 11776 || var5.field1192 >= 11776)) {
                var5.method2307(var7, var8);
                var5.field1145 = false;
            } else if (var3) {
                var5.field1145 = true;
                var5.field1136 = var7;
                var5.field1146 = var8;
            } else {
                var5.field1145 = false;
                var5.method2325(this.field1420, var7, var8, this.field1407[arg1]);
            }
        } else if (var4 == 2) {
            int var9 = arg0.method8678(4);
            int var10 = var5.field1205[0];
            int var11 = var5.field1247[0];
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
            if (client.field707 == arg1 && this.field1420.method2547() && var5.field1229 < 1536 || var5.field1192 < 1536 || var5.field1229 >= 11776 || var5.field1192 >= 11776) {
                var5.method2307(var10, var11);
                var5.field1145 = false;
            } else if (var3) {
                var5.field1145 = true;
                var5.field1136 = var10;
                var5.field1146 = var11;
            } else {
                var5.field1145 = false;
                var5.method2325(this.field1420, var10, var11, this.field1407[arg1]);
            }
        } else {
            int var12 = arg0.method8678(1);
            if (var12 == 0) {
                int var13 = arg0.method8678(12);
                int var14 = var13 >> 10;
                int var15 = var13 >> 5 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var13 & 0x1F;
                if (var16 > 15) {
                    var16 -= 32;
                }
                int var17 = var5.field1205[0] + var15;
                int var18 = var5.field1247[0] + var16;
                if (client.field707 == arg1 && this.field1420.method2547() && (var5.field1229 < 1536 || var5.field1192 < 1536 || var5.field1229 >= 11776 || var5.field1192 >= 11776)) {
                    var5.method2307(var17, var18);
                    var5.field1145 = false;
                } else if (var3) {
                    var5.field1145 = true;
                    var5.field1136 = var17;
                    var5.field1146 = var18;
                } else {
                    var5.field1145 = false;
                    var5.method2325(this.field1420, var17, var18, this.field1407[arg1]);
                }
                var5.field1128 = (byte) (var5.field1128 + var14 & 0x3);
                if (client.field707 == arg1 && this.field1420.method2547()) {
                    this.field1420.field1319 = var5.field1128;
                }
            } else {
                int var19 = arg0.method8678(30);
                int var20 = class348.method5849(var19);
                int var21 = Statics.method5848(var19);
                int var22 = class348.method5854(var19);
                int var23 = (this.field1420.field1322 + var5.field1205[0] + var21 & 0x3FFF) - this.field1420.field1322;
                int var24 = (this.field1420.field1324 + var5.field1247[0] + var22 & 0x3FFF) - this.field1420.field1324;
                if (client.field707 == arg1 && this.field1420.method2547() && var5.field1229 < 1536 || var5.field1192 < 1536 || var5.field1229 >= 11776 || var5.field1192 >= 11776) {
                    var5.method2307(var23, var24);
                    var5.field1145 = false;
                } else if (var3) {
                    var5.field1145 = true;
                    var5.field1136 = var23;
                    var5.field1146 = var24;
                } else {
                    var5.field1145 = false;
                    var5.method2325(this.field1420, var23, var24, this.field1407[arg1]);
                }
                var5.field1128 = (byte) (var5.field1128 + var20 & 0x3);
                if (client.field707 == arg1 && this.field1420.method2547()) {
                    this.field1420.field1319 = var5.field1128;
                }
            }
        }
    }

    @ObfuscatedName("eh.an(Lug;II)Z")
    public boolean method2698(class546 arg0, int arg1) {
        int var3 = arg0.method8678(2);
        if (var3 == 0) {
            if (arg0.method8678(1) != 0) {
                this.method2698(arg0, arg1);
            }
            int var4 = arg0.method8678(13);
            int var5 = arg0.method8678(13);
            boolean var6 = arg0.method8678(1) == 1;
            if (var6) {
                this.field1417[++this.field1416 - 1] = arg1;
            }
            if (this.field1420.field1327[arg1] != null) {
                throw new RuntimeException();
            }
            class94 var7 = this.field1420.field1327[arg1] = new class94();
            var7.field1141 = arg1;
            if (this.field1408[arg1] != null) {
                var7.method2310(this.field1408[arg1]);
            }
            var7.field1258 = this.field1414[arg1];
            var7.field1191 = this.field1415[arg1];
            int var8 = this.field1403[arg1];
            int var9 = var8 >> 28;
            int var10 = var8 >> 14 & 0xFF;
            int var11 = var8 & 0xFF;
            var7.field1264[0] = this.field1407[arg1];
            var7.field1128 = (byte) var9;
            var7.method2307((var10 << 13) + var4 - this.field1420.field1322, (var11 << 13) + var5 - this.field1420.field1324);
            var7.field1145 = false;
            return true;
        } else if (var3 == 1) {
            int var12 = arg0.method8678(2);
            int var13 = this.field1403[arg1];
            this.field1403[arg1] = (((var13 >> 28) + var12 & 0x3) << 28) + (var13 & 0xFFFFFFF);
            return false;
        } else if (var3 == 2) {
            int var14 = arg0.method8678(5);
            int var15 = var14 >> 3;
            int var16 = var14 & 0x7;
            int var17 = this.field1403[arg1];
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
            this.field1403[arg1] = Statics.method5840(var18, var19, var20);
            return false;
        } else {
            int var21 = arg0.method8678(18);
            int var22 = var21 >> 16;
            int var23 = var21 >> 8 & 0xFF;
            int var24 = var21 & 0xFF;
            int var25 = this.field1403[arg1];
            int var26 = (var25 >> 28) + var22 & 0x3;
            int var27 = (var25 >> 14) + var23 & 0xFF;
            int var28 = var24 + var25 & 0xFF;
            this.field1403[arg1] = Statics.method5840(var26, var27, var28);
            return false;
        }
    }

    @ObfuscatedName("eh.aj(Lug;B)V")
    public final void method2676(class546 arg0) {
        for (int var2 = 0; var2 < this.field1416; var2++) {
            int var3 = this.field1417[var2];
            class94 var4 = this.field1420.field1327[var3];
            int var5 = arg0.method8804();
            if ((var5 & 0x10) != 0) {
                var5 += arg0.method8804() << 8;
            }
            if ((var5 & 0x1000) != 0) {
                var5 += arg0.method8804() << 16;
            }
            this.method2684(arg0, var3, var4, var5);
        }
    }

    @ObfuscatedName("eh.av(Lug;ILdb;II)V")
    public final void method2684(class546 arg0, int arg1, class94 arg2, int arg3) {
        byte var5 = class239.field2513.field2516;
        if ((arg3 & 0x800) != 0) {
            this.field1407[arg1] = (class239) class402.method3799(class239.method3459(), arg0.method8766());
        }
        if ((arg3 & 0x100) != 0) {
            var5 = arg0.method8857();
        }
        if ((arg3 & 0x2) != 0) {
            arg2.field1212 = arg0.method8739();
            if (arg2.field1212.charAt(0) == '~') {
                arg2.field1212 = arg2.field1212.substring(1);
                class114.method3518(2, arg2.field1137.method9347(), arg2.field1212);
            } else if (Statics.field297 == arg2) {
                class114.method3518(2, arg2.field1137.method9347(), arg2.field1212);
            }
            arg2.field1213 = false;
            arg2.field1227 = 0;
            arg2.field1217 = 0;
            arg2.field1207 = 150;
        }
        if ((arg3 & 0x8000) != 0) {
            for (int var6 = 0; var6 < 3; var6++) {
                arg2.field1123[var6] = arg0.method8739();
            }
        }
        if ((arg3 & 0x2000) != 0) {
            arg2.field1252 = client.field516 + arg0.method8770();
            arg2.field1216 = client.field516 + arg0.method8883();
            arg2.field1224 = arg0.method8920();
            arg2.field1255 = arg0.method8766();
            arg2.field1256 = arg0.method8920();
            arg2.field1240 = (byte) arg0.method8762();
        }
        if ((arg3 & 0x40) != 0) {
            int var7 = arg0.method8899();
            if (var7 == 65535) {
                var7 = -1;
            }
            int var8 = arg0.method8762();
            Statics.method320(arg2, var7, var8);
        }
        if ((arg3 & 0x1) != 0) {
            int var9 = arg0.method8763();
            byte[] var10 = new byte[var9];
            class547 var11 = new class547(var10);
            arg0.method8730(var10, 0, var9);
            this.field1408[arg1] = var11;
            arg2.method2310(var11);
        }
        if ((arg3 & 0x200) != 0) {
            arg2.field1243 = arg0.method8765();
            arg2.field1245 = arg0.method8920();
            arg2.field1244 = arg0.method8766();
            arg2.field1246 = arg0.method8857();
            arg2.field1254 = arg0.method8771() + client.field516;
            arg2.field1261 = arg0.method8771() + client.field516;
            arg2.field1249 = arg0.method8770();
            if (arg2.field1145) {
                arg2.field1243 += arg2.field1136;
                arg2.field1245 += arg2.field1146;
                arg2.field1244 += arg2.field1136;
                arg2.field1246 += arg2.field1146;
                arg2.field1230 = 0;
            } else {
                arg2.field1243 += arg2.field1205[0];
                arg2.field1245 += arg2.field1247[0];
                arg2.field1244 += arg2.field1205[0];
                arg2.field1246 += arg2.field1247[0];
                arg2.field1230 = 1;
            }
            arg2.field1266 = 0;
        }
        if ((arg3 & 0x10000) != 0) {
            int var12 = arg0.method8762();
            for (int var13 = 0; var13 < var12; var13++) {
                int var14 = arg0.method8763();
                int var15 = arg0.method8771();
                int var16 = arg0.method8757();
                arg2.method2366(var14, var15, var16 >> 16, var16 & 0xFFFF);
            }
        }
        if ((arg3 & 0x8) != 0) {
            int var17 = arg0.method8763();
            if (var17 > 0) {
                for (int var18 = 0; var18 < var17; var18++) {
                    int var19 = -1;
                    int var20 = -1;
                    int var21 = -1;
                    int var22 = arg0.method8744();
                    if (var22 == 32767) {
                        var22 = arg0.method8744();
                        var20 = arg0.method8744();
                        var19 = arg0.method8744();
                        var21 = arg0.method8744();
                    } else if (var22 == 32766) {
                        var22 = -1;
                    } else {
                        var20 = arg0.method8744();
                    }
                    int var23 = arg0.method8744();
                    arg2.method2377(var22, var20, var19, var21, client.field516, var23);
                }
            }
            int var24 = arg0.method8761();
            if (var24 > 0) {
                for (int var25 = 0; var25 < var24; var25++) {
                    int var26 = arg0.method8744();
                    int var27 = arg0.method8744();
                    if (var27 == 32767) {
                        arg2.method2374(var26);
                    } else {
                        int var28 = arg0.method8744();
                        int var29 = arg0.method8763();
                        int var30 = var27 > 0 ? arg0.method8761() : var29;
                        arg2.method2365(var26, client.field516, var27, var28, var29, var30);
                    }
                }
            }
        }
        if ((arg3 & 0x20) != 0) {
            arg2.field1191 = arg0.method8883();
            arg2.field1191 += arg0.method8763() << 16;
            int var31 = 16777215;
            if (arg2.field1191 == var31) {
                arg2.field1191 = -1;
            }
        }
        if ((arg3 & 0x4) != 0) {
            int var32 = arg0.method8770();
            class382 var33 = (class382) class402.method3799(class382.method3016(), arg0.method8763());
            boolean var34 = arg0.method8762() == 1;
            int var35 = arg0.method8763();
            int var36 = arg0.field5363;
            if (arg2.field1137 != null && arg2.field1147 != null) {
                boolean var37 = false;
                if (var33.field4462 && Statics.field1599.method1837(arg2.field1137)) {
                    var37 = true;
                }
                if (!var37 && client.field626 == 0 && !arg2.field1139) {
                    this.field1418.field5363 = 0;
                    arg0.method8786(this.field1418.field5364, 0, var35);
                    this.field1418.field5363 = 0;
                    String var38 = class436.method7430(class416.method1928(class366.method3487(this.field1418)));
                    arg2.field1212 = var38.trim();
                    arg2.field1227 = var32 >> 8;
                    arg2.field1217 = var32 & 0xFF;
                    arg2.field1207 = 150;
                    arg2.field1218 = null;
                    arg2.field1213 = var34;
                    arg2.field1214 = Statics.field297 != arg2 && var33.field4462 && !client.field737.isEmpty() && var38.toLowerCase().indexOf(client.field737) == -1;
                    int var39;
                    if (var33.field4461) {
                        var39 = var34 ? 91 : 1;
                    } else {
                        var39 = var34 ? 90 : 2;
                    }
                    if (var33.field4453 == -1) {
                        class114.method3518(var39, arg2.field1137.method9347(), var38);
                    } else {
                        class114.method3518(var39, class105.method6534(var33.field4453) + arg2.field1137.method9347(), var38);
                    }
                }
            }
            arg0.field5363 = var35 + var36;
        }
        if ((arg3 & 0x4000) != 0) {
            int var40 = arg0.method8883();
            int var41 = var40 >> 8;
            int var42 = var41 >= 13 && var41 <= 20 ? var41 - 12 : 0;
            class382 var43 = (class382) class402.method3799(class382.method3016(), arg0.method8761());
            boolean var44 = arg0.method8762() == 1;
            int var45 = arg0.method8763();
            int var46 = arg0.field5363;
            if (arg2.field1137 != null && arg2.field1147 != null) {
                boolean var47 = false;
                if (var43.field4462 && Statics.field1599.method1837(arg2.field1137)) {
                    var47 = true;
                }
                if (!var47 && client.field626 == 0 && !arg2.field1139) {
                    this.field1418.field5363 = 0;
                    arg0.method8786(this.field1418.field5364, 0, var45);
                    this.field1418.field5363 = 0;
                    String var48 = class436.method7430(class416.method1928(class366.method3487(this.field1418)));
                    arg2.field1212 = var48.trim();
                    arg2.field1227 = var40 >> 8;
                    arg2.field1217 = var40 & 0xFF;
                    arg2.field1207 = 150;
                    byte[] var49 = null;
                    if (var42 > 0 && var42 <= 8) {
                        var49 = new byte[var42];
                        for (int var50 = 0; var50 < var42; var50++) {
                            var49[var50] = arg0.method8765();
                        }
                    }
                    byte[] var52 = var49;
                    int[] var55;
                    if (var49 == null || var49.length == 0 || var49.length > 8) {
                        var55 = null;
                    } else {
                        int[] var53 = new int[var49.length];
                        int var54 = 0;
                        while (true) {
                            if (var54 >= var52.length) {
                                var55 = var53;
                                break;
                            }
                            if (var52[var54] < 0 || var52[var54] >= class570.field5516.length) {
                                var55 = null;
                                break;
                            }
                            var53[var54] = class570.field5516[var52[var54]];
                            var54++;
                        }
                    }
                    arg2.field1218 = var55;
                    arg2.field1213 = var44;
                    arg2.field1214 = Statics.field297 != arg2 && var43.field4462 && !client.field737.isEmpty() && var48.toLowerCase().indexOf(client.field737) == -1;
                    int var56;
                    if (var43.field4461) {
                        var56 = var44 ? 91 : 1;
                    } else {
                        var56 = var44 ? 90 : 2;
                    }
                    if (var43.field4453 == -1) {
                        class114.method3518(var56, arg2.field1137.method9347(), var48);
                    } else {
                        class114.method3518(var56, class105.method6534(var43.field4453) + arg2.field1137.method9347(), var48);
                    }
                }
            }
            arg0.field5363 = var45 + var46 + var42;
        }
        if ((arg3 & 0x80) != 0) {
            arg2.field1228 = arg0.method8770();
            if (arg2.field1230 == 0) {
                arg2.field1258 = arg2.field1228;
                arg2.method2370();
            }
        }
        if (!arg2.field1145) {
            return;
        }
        if (var5 == 127) {
            arg2.method2307(arg2.field1136, arg2.field1146);
            return;
        }
        class239 var57;
        if (class239.field2513.field2516 == var5) {
            var57 = this.field1407[arg1];
        } else {
            var57 = (class239) class402.method3799(class239.method3459(), var5);
        }
        arg2.method2325(this.field1420, arg2.field1136, arg2.field1146, var57);
    }
}
