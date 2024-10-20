package deob;

import java.util.Iterator;

@ObfuscatedName("eh")
public class class113 {

    @ObfuscatedName("eh.ag")
    public final class74[] field1430 = new class74[2048];

    @ObfuscatedName("eh.am")
    public final boolean[] field1433 = new boolean[2048];

    @ObfuscatedName("eh.ax")
    public final class277[] field1440 = new class277[2048];

    @ObfuscatedName("eh.aq")
    public final class551 field1431 = new class551(new byte[5000]);

    @ObfuscatedName("eh.af")
    public final String[] field1429 = new String[3];

    @ObfuscatedName("eh.at")
    public int field1438 = 0;

    @ObfuscatedName("eh.au")
    public final int[] field1436 = new int[2048];

    @ObfuscatedName("eh.ar")
    public int field1437 = 0;

    @ObfuscatedName("eh.al")
    public final int[] field1432 = new int[2048];

    @ObfuscatedName("eh.ad")
    public int field1439 = 0;

    @ObfuscatedName("eh.ah")
    public final int[] field1434 = new int[2048];

    @ObfuscatedName("eh.ap")
    public int field1441 = 0;

    @ObfuscatedName("eh.ab")
    public final int[] field1442 = new int[2048];

    public class113() {
        for (int var1 = 0; var1 < 2048; var1++) {
            this.field1430[var1] = new class74(var1);
        }
    }

    @ObfuscatedName("eh.ac(Lva;B)V")
    public final void method2833(class550 arg0) {
        this.method2844();
        arg0.method8922();
        int var2 = client.field652;
        class74 var3 = this.field1430[var2];
        int var4 = arg0.method8923(30);
        var3.method2174(-1);
        var3.field895.method6078(var4);
        var3.field896 = 0;
        class95 var5 = var3.method2100(var2, Statics.field1342);
        var3.method2098(var5);
        Statics.field1342.field1369[var2] = var5;
        Statics.field4826 = var5;
        this.field1438 = 0;
        this.field1436[++this.field1438 - 1] = var2;
        this.field1437 = 0;
        for (int var6 = 1; var6 < 2048; var6++) {
            if (var2 != var6) {
                int var7 = arg0.method8923(18);
                int var8 = var7 >> 16;
                int var9 = var7 >> 8 & 0xFF;
                int var10 = var7 & 0xFF;
                this.field1430[var6].method2174(class352.method6076(var8, var9, var10));
                this.field1432[++this.field1437 - 1] = var6;
            }
        }
        arg0.method8924();
    }

    @ObfuscatedName("eh.ae(Lva;II)V")
    public final void method2850(class550 arg0, int arg1) {
        int var3 = arg0.field5415;
        this.field1441 = 0;
        this.method2835(arg0);
        this.method2839();
        this.method2832();
        this.method2867(arg0);
        this.method2842();
        if (arg0.field5415 - var3 != arg1) {
            throw new RuntimeException(arg0.field5415 - var3 + " " + arg1);
        }
    }

    @ObfuscatedName("eh.ag(Lva;I)V")
    public void method2835(class550 arg0) {
        this.field1439 = 0;
        int var2 = 0;
        arg0.method8922();
        for (int var3 = 0; var3 < this.field1438; var3++) {
            int var4 = this.field1436[var3];
            if ((this.field1430[var4].field896 & 0x1) == 0) {
                if (var2 > 0) {
                    var2--;
                    this.field1430[var4].field896 = (byte) (this.field1430[var4].field896 | 0x2);
                } else {
                    int var5 = arg0.method8923(1);
                    if (var5 == 0) {
                        var2 = this.method2836(arg0);
                        this.field1430[var4].field896 = (byte) (this.field1430[var4].field896 | 0x2);
                    } else {
                        this.method2837(arg0, var4);
                    }
                }
            }
        }
        arg0.method8924();
        if (var2 != 0) {
            throw new RuntimeException();
        }
        arg0.method8922();
        for (int var6 = 0; var6 < this.field1438; var6++) {
            int var7 = this.field1436[var6];
            if ((this.field1430[var7].field896 & 0x1) != 0) {
                if (var2 > 0) {
                    var2--;
                    this.field1430[var7].field896 = (byte) (this.field1430[var7].field896 | 0x2);
                } else {
                    int var8 = arg0.method8923(1);
                    if (var8 == 0) {
                        var2 = this.method2836(arg0);
                        this.field1430[var7].field896 = (byte) (this.field1430[var7].field896 | 0x2);
                    } else {
                        this.method2837(arg0, var7);
                    }
                }
            }
        }
        arg0.method8924();
        if (var2 != 0) {
            throw new RuntimeException();
        }
        arg0.method8922();
        for (int var9 = 0; var9 < this.field1437; var9++) {
            int var10 = this.field1432[var9];
            if ((this.field1430[var10].field896 & 0x1) != 0) {
                if (var2 > 0) {
                    var2--;
                    this.field1430[var10].field896 = (byte) (this.field1430[var10].field896 | 0x2);
                } else {
                    int var11 = arg0.method8923(1);
                    if (var11 == 0) {
                        var2 = this.method2836(arg0);
                        this.field1430[var10].field896 = (byte) (this.field1430[var10].field896 | 0x2);
                    } else if (this.method2834(arg0, var10)) {
                        this.field1430[var10].field896 = (byte) (this.field1430[var10].field896 | 0x2);
                    }
                }
            }
        }
        arg0.method8924();
        if (var2 != 0) {
            throw new RuntimeException();
        }
        arg0.method8922();
        for (int var12 = 0; var12 < this.field1437; var12++) {
            int var13 = this.field1432[var12];
            if ((this.field1430[var13].field896 & 0x1) == 0) {
                if (var2 > 0) {
                    var2--;
                    this.field1430[var13].field896 = (byte) (this.field1430[var13].field896 | 0x2);
                } else {
                    int var14 = arg0.method8923(1);
                    if (var14 == 0) {
                        var2 = this.method2836(arg0);
                        this.field1430[var13].field896 = (byte) (this.field1430[var13].field896 | 0x2);
                    } else if (this.method2834(arg0, var13)) {
                        this.field1430[var13].field896 = (byte) (this.field1430[var13].field896 | 0x2);
                    }
                }
            }
        }
        arg0.method8924();
        if (var2 != 0) {
            throw new RuntimeException();
        }
        this.field1438 = 0;
        this.field1437 = 0;
        for (int var15 = 1; var15 < 2048; var15++) {
            this.field1430[var15].field896 = (byte) (this.field1430[var15].field896 >> 1);
            if (this.field1430[var15].method2101()) {
                this.field1436[++this.field1438 - 1] = var15;
            } else {
                this.field1432[++this.field1437 - 1] = var15;
            }
        }
    }

    @ObfuscatedName("eh.am(Lva;B)I")
    public int method2836(class550 arg0) {
        int var2 = arg0.method8923(2);
        int var3;
        if (var2 == 0) {
            var3 = 0;
        } else if (var2 == 1) {
            var3 = arg0.method8923(5);
        } else if (var2 == 2) {
            var3 = arg0.method8923(8);
        } else {
            var3 = arg0.method8923(11);
        }
        return var3;
    }

    @ObfuscatedName("eh.ax(Lva;II)V")
    public void method2837(class550 arg0, int arg1) {
        boolean var3 = arg0.method8923(1) == 1;
        if (var3) {
            this.field1442[++this.field1441 - 1] = arg1;
        }
        int var4 = arg0.method8923(2);
        class74 var5 = this.field1430[arg1];
        if (var4 == 0) {
            if (var3) {
                this.field1433[arg1] = false;
            } else if (client.field652 == arg1) {
                throw new RuntimeException();
            } else {
                var5.method2102();
                if (arg0.method8923(1) != 0) {
                    this.method2834(arg0, arg1);
                }
                this.field1434[++this.field1439 - 1] = arg1;
            }
        } else if (var4 == 1) {
            int var6 = arg0.method8923(3);
            class352 var7 = var5.field895;
            if (var6 == 0) {
                var7.field3754--;
                var7.field3756--;
            } else if (var6 == 1) {
                var7.field3756--;
            } else if (var6 == 2) {
                var7.field3754++;
                var7.field3756--;
            } else if (var6 == 3) {
                var7.field3754--;
            } else if (var6 == 4) {
                var7.field3754++;
            } else if (var6 == 5) {
                var7.field3754--;
                var7.field3756++;
            } else if (var6 == 6) {
                var7.field3756++;
            } else if (var6 == 7) {
                var7.field3754++;
                var7.field3756++;
            }
            this.field1433[arg1] = true;
            this.field1440[arg1] = var5.field900;
        } else if (var4 == 2) {
            int var8 = arg0.method8923(4);
            class352 var9 = var5.field895;
            if (var8 == 0) {
                var9.field3754 -= 2;
                var9.field3756 -= 2;
            } else if (var8 == 1) {
                var9.field3754--;
                var9.field3756 -= 2;
            } else if (var8 == 2) {
                var9.field3756 -= 2;
            } else if (var8 == 3) {
                var9.field3754++;
                var9.field3756 -= 2;
            } else if (var8 == 4) {
                var9.field3754 += 2;
                var9.field3756 -= 2;
            } else if (var8 == 5) {
                var9.field3754 -= 2;
                var9.field3756--;
            } else if (var8 == 6) {
                var9.field3754 += 2;
                var9.field3756--;
            } else if (var8 == 7) {
                var9.field3754 -= 2;
            } else if (var8 == 8) {
                var9.field3754 += 2;
            } else if (var8 == 9) {
                var9.field3754 -= 2;
                var9.field3756++;
            } else if (var8 == 10) {
                var9.field3754 += 2;
                var9.field3756++;
            } else if (var8 == 11) {
                var9.field3754 -= 2;
                var9.field3756 += 2;
            } else if (var8 == 12) {
                var9.field3754--;
                var9.field3756 += 2;
            } else if (var8 == 13) {
                var9.field3756 += 2;
            } else if (var8 == 14) {
                var9.field3754++;
                var9.field3756 += 2;
            } else if (var8 == 15) {
                var9.field3754 += 2;
                var9.field3756 += 2;
            }
            this.field1433[arg1] = true;
            this.field1440[arg1] = var5.field900;
        } else {
            int var10 = arg0.method8923(1);
            if (var10 == 0) {
                int var11 = arg0.method8923(12);
                int var12 = var11 >> 10;
                int var13 = var11 >> 5 & 0x1F;
                if (var13 > 15) {
                    var13 -= 32;
                }
                int var14 = var11 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                class352 var15 = var5.field895;
                var15.field3755 = (byte) (var15.field3755 + var12 & 0x3);
                var15.field3754 += var13;
                var15.field3756 += var14;
                this.field1433[arg1] = true;
                this.field1440[arg1] = var5.field900;
            } else {
                int var16 = arg0.method8923(30);
                int var17 = class352.method6081(var16);
                int var18 = Statics.method6112(var16);
                int var19 = class352.method6083(var16);
                class352 var20 = var5.field895;
                var20.field3755 = (byte) (var20.field3755 + var17 & 0x3);
                var20.field3754 = var20.field3754 + var18 & 0x3FFF;
                var20.field3756 = var20.field3756 + var19 & 0x3FFF;
                this.field1433[arg1] = true;
                this.field1440[arg1] = var5.field900;
            }
        }
    }

    @ObfuscatedName("eh.aq(Lva;II)Z")
    public boolean method2834(class550 arg0, int arg1) {
        class74 var3 = this.field1430[arg1];
        int var4 = arg0.method8923(2);
        if (var4 == 0) {
            if (arg0.method8923(1) != 0) {
                this.method2834(arg0, arg1);
            }
            int var5 = arg0.method8923(13);
            int var6 = arg0.method8923(13);
            boolean var7 = arg0.method8923(1) == 1;
            if (var7) {
                this.field1442[++this.field1441 - 1] = arg1;
            }
            if (var3.method2101()) {
                throw new RuntimeException();
            }
            var3.method2103(var5, var6);
            this.field1433[arg1] = false;
            return true;
        } else if (var4 == 1) {
            int var8 = arg0.method8923(2);
            int var9 = var3.field899;
            int var10 = class352.method6081(var9) + var8 & 0x3;
            var3.method2155(var10);
            var3.field899 = (var10 << 28) + (var9 & 0xFFFFFFF);
            return false;
        } else if (var4 == 2) {
            int var11 = arg0.method8923(5);
            int var12 = var11 >> 3;
            int var13 = var11 & 0x7;
            int var14 = var3.field899;
            int var15 = class352.method6081(var14) + var12 & 0x3;
            int var16 = var14 >> 14 & 0xFF;
            int var17 = var14 & 0xFF;
            if (var13 == 0) {
                var16--;
                var17--;
            }
            if (var13 == 1) {
                var17--;
            }
            if (var13 == 2) {
                var16++;
                var17--;
            }
            if (var13 == 3) {
                var16--;
            }
            if (var13 == 4) {
                var16++;
            }
            if (var13 == 5) {
                var16--;
                var17++;
            }
            if (var13 == 6) {
                var17++;
            }
            if (var13 == 7) {
                var16++;
                var17++;
            }
            var3.method2155(var15);
            var3.field899 = class352.method6076(var15, var16, var17);
            return false;
        } else {
            int var18 = arg0.method8923(18);
            int var19 = var18 >> 16;
            int var20 = var18 >> 8 & 0xFF;
            int var21 = var18 & 0xFF;
            int var22 = var3.field899;
            int var23 = class352.method6081(var22) + var19 & 0x3;
            var3.method2155(var23);
            int var24 = Statics.method6112(var22) + var20 & 0xFF;
            int var25 = class352.method6083(var22) + var21 & 0xFF;
            var3.field899 = class352.method6076(var3.method2104(), var24, var25);
            return false;
        }
    }

    @ObfuscatedName("eh.af(I)V")
    public void method2839() {
        for (int var1 = 0; var1 < this.field1439; var1++) {
            int var2 = this.field1434[var1];
            class74 var3 = this.field1430[var2];
            Iterator var4 = client.field593.iterator();
            while (var4.hasNext()) {
                class104 var5 = (class104) var4.next();
                class95 var6 = var5.field1369[var2];
                if (var6 != null) {
                    var3.method2099(var6);
                    var5.field1369[var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("eh.at(I)V")
    public void method2832() {
        Statics.field1305 = -1;
        label56: for (int var1 = 0; var1 < this.field1438; var1++) {
            int var2 = this.field1436[var1];
            class74 var3 = this.field1430[var2];
            class352 var4 = var3.field895;
            Iterator var5 = client.field593.iterator();
            while (true) {
                while (true) {
                    if (!var5.hasNext()) {
                        continue label56;
                    }
                    class104 var6 = (class104) var5.next();
                    class95 var7 = var6.field1369[var2];
                    boolean var8 = var4.field3754 > var6.field1350 && var4.field3756 > var6.field1357 && var4.field3754 < var6.field1359 + var6.field1350 && var4.field3756 < var6.field1357 + var6.field1355;
                    if (client.field652 == var2 && var8 && var6.field1354 != -1) {
                        Statics.field1305 = var6.field1354;
                    }
                    if (var8 && var7 == null) {
                        class95 var9 = var3.method2100(var2, var6);
                        var3.method2098(var9);
                        var6.field1369[var2] = var9;
                    } else if (!var8 && var7 != null && Statics.field4826 != var7) {
                        var3.method2099(var7);
                        var6.field1369[var2] = null;
                    }
                }
            }
        }
    }

    @ObfuscatedName("eh.au(Lva;S)V")
    public void method2867(class550 arg0) {
        for (int var2 = 0; var2 < this.field1441; var2++) {
            int var3 = this.field1442[var2];
            int var4 = arg0.method8955();
            if ((var4 & 0x8) != 0) {
                var4 += arg0.method8955() << 8;
            }
            if ((var4 & 0x400) != 0) {
                var4 += arg0.method8955() << 16;
            }
            this.method2868(arg0, var3, var4);
        }
    }

    @ObfuscatedName("eh.ar(S)V")
    public void method2842() {
        for (int var1 = 0; var1 < this.field1438; var1++) {
            int var2 = this.field1436[var1];
            if (this.field1433[var2]) {
                class74 var3 = this.field1430[var2];
                var3.method2095(this.field1440[var2]);
                this.field1433[var2] = false;
            }
        }
    }

    @ObfuscatedName("eh.al(Lva;III)V")
    public void method2868(class550 arg0, int arg1, int arg2) {
        class74 var4 = this.field1430[arg1];
        if ((arg2 & 0x100) != 0) {
            class277[] var6 = new class277[] { class277.field3037, class277.field3041, class277.field3048, class277.field3039, class277.field3045, class277.field3043, class277.field3040, class277.field3042, class277.field3038 };
            var4.field900 = (class277) class405.method6719(var6, arg0.method9010());
            this.field1440[arg1] = var4.field900;
        }
        if ((arg2 & 0x8000) != 0) {
            for (int var7 = 0; var7 < 3; var7++) {
                this.field1429[var7] = arg0.method9166();
            }
            var4.method2117(this.field1429);
        }
        if ((arg2 & 0x10000) != 0) {
            int var8 = arg0.method9059();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg0.method9191();
                int var11 = arg0.method9119();
                int var12 = arg0.method9031();
                var4.method2119(var10, var11, var12 >> 16, var12 & 0xFFFF);
            }
        }
        if ((arg2 & 0x800) != 0) {
            byte var13 = arg0.method9011();
            if (var13 == 127) {
                this.field1440[arg1] = class277.field3039;
            } else {
                class277[] var14 = this.field1440;
                class277[] var16 = new class277[] { class277.field3037, class277.field3041, class277.field3048, class277.field3039, class277.field3045, class277.field3043, class277.field3040, class277.field3042, class277.field3038 };
                var14[arg1] = (class277) class405.method6719(var16, var13);
            }
        }
        if ((arg2 & 0x20) != 0) {
            int var17 = arg0.method9191();
            byte[] var18 = new byte[var17];
            class551 var19 = new class551(var18);
            arg0.method9180(var18, 0, var17);
            var4.method2107(var19);
        }
        if ((arg2 & 0x80) != 0) {
            int var20 = arg0.method9191();
            if (var20 > 0) {
                for (int var21 = 0; var21 < var20; var21++) {
                    int var22 = -1;
                    int var23 = -1;
                    int var24 = -1;
                    int var25 = arg0.method8989();
                    if (var25 == 32767) {
                        var25 = arg0.method8989();
                        var23 = arg0.method8989();
                        var22 = arg0.method8989();
                        var24 = arg0.method8989();
                    } else if (var25 == 32766) {
                        var25 = -1;
                    } else {
                        var23 = arg0.method8989();
                    }
                    int var26 = arg0.method8989();
                    var4.method2111(var25, var23, var22, var24, var26);
                }
            }
            int var27 = arg0.method9024();
            if (var27 > 0) {
                for (int var28 = 0; var28 < var27; var28++) {
                    int var29 = arg0.method8989();
                    int var30 = arg0.method8989();
                    if (var30 == 32767) {
                        var4.method2113(var29);
                    } else {
                        int var31 = arg0.method8989();
                        int var32 = arg0.method8955();
                        int var33 = var30 > 0 ? arg0.method9059() : var32;
                        var4.method2105(var29, var30, var31, var32, var33);
                    }
                }
            }
        }
        if ((arg2 & 0x2000) != 0) {
            int var34 = arg0.method9119();
            int var35 = var34 >> 8;
            int var36 = var35 >= 13 && var35 <= 20 ? var35 - 12 : 0;
            class385 var37 = (class385) class405.method6719(class385.method3564(), arg0.method9191());
            boolean var38 = arg0.method9024() == 1;
            int var39 = arg0.method9059();
            this.field1431.field5415 = 0;
            arg0.method9034(this.field1431.field5413, 0, var39);
            this.field1431.field5415 = 0;
            String var40 = class439.method7660(class419.method3366(class366.method8353(this.field1431)));
            byte[] var41 = null;
            if (var36 > 0 && var36 <= 8) {
                var41 = new byte[var36];
                for (int var42 = 0; var42 < var36; var42++) {
                    var41[var42] = arg0.method9010();
                }
            }
            var4.method2115(var34, var37, var38, var40, var41);
        }
        if ((arg2 & 0x4000) != 0) {
            byte var43 = arg0.method8993();
            byte var44 = arg0.method9011();
            byte var45 = arg0.method9011();
            byte var46 = arg0.method9010();
            int var47 = arg0.method9015() + client.field609;
            int var48 = arg0.method9015() + client.field609;
            int var49 = arg0.method8979();
            var4.method2173(var43, var44, var45, var46, var47, var48, var49, this.field1433[arg1]);
        }
        if ((arg2 & 0x40) != 0) {
            int var50 = arg0.method8979();
            int var51 = var50 + (arg0.method9191() << 16);
            int var52 = 16777215;
            if (var51 == var52) {
                var51 = -1;
            }
            var4.method2151(var51);
        }
        if ((arg2 & 0x10) != 0) {
            int var53 = arg0.method9015();
            if (var53 == 65535) {
                var53 = -1;
            }
            int var54 = arg0.method9191();
            var4.method2161(var53, var54);
        }
        if ((arg2 & 0x1) != 0) {
            String var55 = arg0.method9166();
            var4.method2110(var55);
        }
        if ((arg2 & 0x4) != 0) {
            arg0.method9145();
            arg0.method9024();
            arg0.method8955();
            int var56 = arg0.method8955();
            this.field1431.field5415 = 0;
            arg0.method9180(this.field1431.field5413, 0, var56);
            this.field1431.field5415 = 0;
        }
        if ((arg2 & 0x2) != 0) {
            int var57 = arg0.method9145();
            var4.method2114(var57);
        }
        if ((arg2 & 0x200) == 0) {
            return;
        }
        int var58 = client.field609 + arg0.method9119();
        int var59 = client.field609 + arg0.method9119();
        byte var60 = arg0.method9010();
        byte var61 = arg0.method8975();
        byte var62 = arg0.method9010();
        byte var63 = (byte) arg0.method9059();
        var4.method2138(var58, var59, var60, var61, var62, var63);
    }

    @ObfuscatedName("eh.ad(B)V")
    public void method2844() {
        this.field1438 = 0;
        for (int var1 = 0; var1 < 2048; var1++) {
            this.field1430[var1].method2096();
        }
    }
}
