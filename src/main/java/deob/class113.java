package deob;

import java.util.Iterator;

@ObfuscatedName("en")
public class class113 {

    @ObfuscatedName("en.ak")
    public final class74[] field1424 = new class74[2048];

    @ObfuscatedName("en.aj")
    public final boolean[] field1422 = new boolean[2048];

    @ObfuscatedName("en.ai")
    public final class276[] field1430 = new class276[2048];

    @ObfuscatedName("en.ay")
    public final class558 field1421 = new class558(new byte[5000]);

    @ObfuscatedName("en.as")
    public final String[] field1425 = new String[3];

    @ObfuscatedName("en.ae")
    public int field1426 = 0;

    @ObfuscatedName("en.am")
    public final int[] field1427 = new int[2048];

    @ObfuscatedName("en.at")
    public int field1428 = 0;

    @ObfuscatedName("en.au")
    public final int[] field1423 = new int[2048];

    @ObfuscatedName("en.an")
    public int field1419 = 0;

    @ObfuscatedName("en.ao")
    public final int[] field1431 = new int[2048];

    @ObfuscatedName("en.af")
    public int field1420 = 0;

    @ObfuscatedName("en.ar")
    public final int[] field1433 = new int[2048];

    public class113() {
        for (int var1 = 0; var1 < 2048; var1++) {
            this.field1424[var1] = new class74(var1);
        }
    }

    @ObfuscatedName("en.ap(Lvm;I)V")
    public final void method2947(class557 arg0) {
        this.method2957();
        arg0.method9206();
        int var2 = client.field630;
        class74 var3 = this.field1424[var2];
        int var4 = arg0.method9207(30);
        var3.method2175(-1);
        var3.field874.method6249(var4);
        var3.field875 = 0;
        class95 var5 = var3.method2164(var2, Statics.field2071);
        var3.method2162(var5);
        Statics.field2071.field1357[var2] = var5;
        Statics.field3772 = var5;
        this.field1426 = 0;
        this.field1427[++this.field1426 - 1] = var2;
        this.field1428 = 0;
        for (int var6 = 1; var6 < 2048; var6++) {
            if (var2 != var6) {
                int var7 = arg0.method9207(18);
                int var8 = var7 >> 16;
                int var9 = var7 >> 8 & 0xFF;
                int var10 = var7 & 0xFF;
                this.field1424[var6].method2175(class351.method6256(var8, var9, var10));
                this.field1423[++this.field1428 - 1] = var6;
            }
        }
        arg0.method9208();
    }

    @ObfuscatedName("en.aw(Lvm;II)V")
    public final void method2948(class557 arg0, int arg1) {
        int var3 = arg0.field5462;
        this.field1420 = 0;
        this.method2949(arg0);
        this.method2958();
        this.method2967();
        this.method2962(arg0);
        this.method2955();
        if (arg0.field5462 - var3 != arg1) {
            throw new RuntimeException(arg0.field5462 - var3 + " " + arg1);
        }
    }

    @ObfuscatedName("en.ak(Lvm;I)V")
    public void method2949(class557 arg0) {
        this.field1419 = 0;
        int var2 = 0;
        arg0.method9206();
        for (int var3 = 0; var3 < this.field1426; var3++) {
            int var4 = this.field1427[var3];
            if ((this.field1424[var4].field875 & 0x1) == 0) {
                if (var2 > 0) {
                    var2--;
                    this.field1424[var4].field875 = (byte) (this.field1424[var4].field875 | 0x2);
                } else {
                    int var5 = arg0.method9207(1);
                    if (var5 == 0) {
                        var2 = this.method2950(arg0);
                        this.field1424[var4].field875 = (byte) (this.field1424[var4].field875 | 0x2);
                    } else {
                        this.method2952(arg0, var4);
                    }
                }
            }
        }
        arg0.method9208();
        if (var2 != 0) {
            throw new RuntimeException();
        }
        arg0.method9206();
        for (int var6 = 0; var6 < this.field1426; var6++) {
            int var7 = this.field1427[var6];
            if ((this.field1424[var7].field875 & 0x1) != 0) {
                if (var2 > 0) {
                    var2--;
                    this.field1424[var7].field875 = (byte) (this.field1424[var7].field875 | 0x2);
                } else {
                    int var8 = arg0.method9207(1);
                    if (var8 == 0) {
                        var2 = this.method2950(arg0);
                        this.field1424[var7].field875 = (byte) (this.field1424[var7].field875 | 0x2);
                    } else {
                        this.method2952(arg0, var7);
                    }
                }
            }
        }
        arg0.method9208();
        if (var2 != 0) {
            throw new RuntimeException();
        }
        arg0.method9206();
        for (int var9 = 0; var9 < this.field1428; var9++) {
            int var10 = this.field1423[var9];
            if ((this.field1424[var10].field875 & 0x1) != 0) {
                if (var2 > 0) {
                    var2--;
                    this.field1424[var10].field875 = (byte) (this.field1424[var10].field875 | 0x2);
                } else {
                    int var11 = arg0.method9207(1);
                    if (var11 == 0) {
                        var2 = this.method2950(arg0);
                        this.field1424[var10].field875 = (byte) (this.field1424[var10].field875 | 0x2);
                    } else if (this.method2951(arg0, var10)) {
                        this.field1424[var10].field875 = (byte) (this.field1424[var10].field875 | 0x2);
                    }
                }
            }
        }
        arg0.method9208();
        if (var2 != 0) {
            throw new RuntimeException();
        }
        arg0.method9206();
        for (int var12 = 0; var12 < this.field1428; var12++) {
            int var13 = this.field1423[var12];
            if ((this.field1424[var13].field875 & 0x1) == 0) {
                if (var2 > 0) {
                    var2--;
                    this.field1424[var13].field875 = (byte) (this.field1424[var13].field875 | 0x2);
                } else {
                    int var14 = arg0.method9207(1);
                    if (var14 == 0) {
                        var2 = this.method2950(arg0);
                        this.field1424[var13].field875 = (byte) (this.field1424[var13].field875 | 0x2);
                    } else if (this.method2951(arg0, var13)) {
                        this.field1424[var13].field875 = (byte) (this.field1424[var13].field875 | 0x2);
                    }
                }
            }
        }
        arg0.method9208();
        if (var2 != 0) {
            throw new RuntimeException();
        }
        this.field1426 = 0;
        this.field1428 = 0;
        for (int var15 = 1; var15 < 2048; var15++) {
            this.field1424[var15].field875 = (byte) (this.field1424[var15].field875 >> 1);
            if (this.field1424[var15].method2165()) {
                this.field1427[++this.field1426 - 1] = var15;
            } else {
                this.field1423[++this.field1428 - 1] = var15;
            }
        }
    }

    @ObfuscatedName("en.aj(Lvm;B)I")
    public int method2950(class557 arg0) {
        int var2 = arg0.method9207(2);
        int var3;
        if (var2 == 0) {
            var3 = 0;
        } else if (var2 == 1) {
            var3 = arg0.method9207(5);
        } else if (var2 == 2) {
            var3 = arg0.method9207(8);
        } else {
            var3 = arg0.method9207(11);
        }
        return var3;
    }

    @ObfuscatedName("en.ai(Lvm;II)V")
    public void method2952(class557 arg0, int arg1) {
        boolean var3 = arg0.method9207(1) == 1;
        if (var3) {
            this.field1433[++this.field1420 - 1] = arg1;
        }
        int var4 = arg0.method9207(2);
        class74 var5 = this.field1424[arg1];
        if (var4 == 0) {
            if (var3) {
                this.field1422[arg1] = false;
            } else if (client.field630 == arg1) {
                throw new RuntimeException();
            } else {
                var5.method2187();
                if (arg0.method9207(1) != 0) {
                    this.method2951(arg0, arg1);
                }
                this.field1431[++this.field1419 - 1] = arg1;
            }
        } else if (var4 == 1) {
            int var6 = arg0.method9207(3);
            class351 var7 = var5.field874;
            if (var6 == 0) {
                var7.field3777--;
                var7.field3778--;
            } else if (var6 == 1) {
                var7.field3778--;
            } else if (var6 == 2) {
                var7.field3777++;
                var7.field3778--;
            } else if (var6 == 3) {
                var7.field3777--;
            } else if (var6 == 4) {
                var7.field3777++;
            } else if (var6 == 5) {
                var7.field3777--;
                var7.field3778++;
            } else if (var6 == 6) {
                var7.field3778++;
            } else if (var6 == 7) {
                var7.field3777++;
                var7.field3778++;
            }
            this.field1422[arg1] = true;
            this.field1430[arg1] = var5.field878;
        } else if (var4 == 2) {
            int var8 = arg0.method9207(4);
            class351 var9 = var5.field874;
            if (var8 == 0) {
                var9.field3777 -= 2;
                var9.field3778 -= 2;
            } else if (var8 == 1) {
                var9.field3777--;
                var9.field3778 -= 2;
            } else if (var8 == 2) {
                var9.field3778 -= 2;
            } else if (var8 == 3) {
                var9.field3777++;
                var9.field3778 -= 2;
            } else if (var8 == 4) {
                var9.field3777 += 2;
                var9.field3778 -= 2;
            } else if (var8 == 5) {
                var9.field3777 -= 2;
                var9.field3778--;
            } else if (var8 == 6) {
                var9.field3777 += 2;
                var9.field3778--;
            } else if (var8 == 7) {
                var9.field3777 -= 2;
            } else if (var8 == 8) {
                var9.field3777 += 2;
            } else if (var8 == 9) {
                var9.field3777 -= 2;
                var9.field3778++;
            } else if (var8 == 10) {
                var9.field3777 += 2;
                var9.field3778++;
            } else if (var8 == 11) {
                var9.field3777 -= 2;
                var9.field3778 += 2;
            } else if (var8 == 12) {
                var9.field3777--;
                var9.field3778 += 2;
            } else if (var8 == 13) {
                var9.field3778 += 2;
            } else if (var8 == 14) {
                var9.field3777++;
                var9.field3778 += 2;
            } else if (var8 == 15) {
                var9.field3777 += 2;
                var9.field3778 += 2;
            }
            this.field1422[arg1] = true;
            this.field1430[arg1] = var5.field878;
        } else {
            int var10 = arg0.method9207(1);
            if (var10 == 0) {
                int var11 = arg0.method9207(12);
                int var12 = var11 >> 10;
                int var13 = var11 >> 5 & 0x1F;
                if (var13 > 15) {
                    var13 -= 32;
                }
                int var14 = var11 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                class351 var15 = var5.field874;
                var15.field3779 = (byte) (var15.field3779 + var12 & 0x3);
                var15.field3777 += var13;
                var15.field3778 += var14;
                this.field1422[arg1] = true;
                this.field1430[arg1] = var5.field878;
            } else {
                int var16 = arg0.method9207(30);
                int var17 = class351.method6269(var16);
                int var18 = Statics.method6252(var16);
                int var19 = class351.method6289(var16);
                class351 var20 = var5.field874;
                var20.field3779 = (byte) (var20.field3779 + var17 & 0x3);
                var20.field3777 = var20.field3777 + var18 & 0x3FFF;
                var20.field3778 = var20.field3778 + var19 & 0x3FFF;
                this.field1422[arg1] = true;
                this.field1430[arg1] = var5.field878;
            }
        }
    }

    @ObfuscatedName("en.ay(Lvm;IB)Z")
    public boolean method2951(class557 arg0, int arg1) {
        class74 var3 = this.field1424[arg1];
        int var4 = arg0.method9207(2);
        if (var4 == 0) {
            if (arg0.method9207(1) != 0) {
                this.method2951(arg0, arg1);
            }
            int var5 = arg0.method9207(13);
            int var6 = arg0.method9207(13);
            boolean var7 = arg0.method9207(1) == 1;
            if (var7) {
                this.field1433[++this.field1420 - 1] = arg1;
            }
            if (var3.method2165()) {
                throw new RuntimeException();
            }
            var3.method2232(var5, var6);
            this.field1422[arg1] = false;
            return true;
        } else if (var4 == 1) {
            int var8 = arg0.method9207(2);
            int var9 = var3.field873;
            int var10 = class351.method6269(var9) + var8 & 0x3;
            var3.method2169(var10);
            var3.field873 = (var10 << 28) + (var9 & 0xFFFFFFF);
            return false;
        } else if (var4 == 2) {
            int var11 = arg0.method9207(5);
            int var12 = var11 >> 3;
            int var13 = var11 & 0x7;
            int var14 = var3.field873;
            int var15 = class351.method6269(var14) + var12 & 0x3;
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
            var3.method2169(var15);
            var3.field873 = class351.method6256(var15, var16, var17);
            return false;
        } else {
            int var18 = arg0.method9207(18);
            int var19 = var18 >> 16;
            int var20 = var18 >> 8 & 0xFF;
            int var21 = var18 & 0xFF;
            int var22 = var3.field873;
            int var23 = class351.method6269(var22) + var19 & 0x3;
            var3.method2169(var23);
            int var24 = Statics.method6252(var22) + var20 & 0xFF;
            int var25 = class351.method6289(var22) + var21 & 0xFF;
            var3.field873 = class351.method6256(var3.method2168(), var24, var25);
            return false;
        }
    }

    @ObfuscatedName("en.as(I)V")
    public void method2958() {
        for (int var1 = 0; var1 < this.field1419; var1++) {
            int var2 = this.field1431[var1];
            class74 var3 = this.field1424[var2];
            Iterator var4 = client.field684.iterator();
            while (var4.hasNext()) {
                class104 var5 = (class104) var4.next();
                class95 var6 = var5.field1357[var2];
                if (var6 != null) {
                    var3.method2163(var6);
                    var5.field1357[var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("en.ae(S)V")
    public void method2967() {
        Statics.field2459 = -1;
        label56: for (int var1 = 0; var1 < this.field1426; var1++) {
            int var2 = this.field1427[var1];
            class74 var3 = this.field1424[var2];
            class351 var4 = var3.field874;
            Iterator var5 = client.field684.iterator();
            while (true) {
                while (true) {
                    if (!var5.hasNext()) {
                        continue label56;
                    }
                    class104 var6 = (class104) var5.next();
                    class95 var7 = var6.field1357[var2];
                    boolean var8 = var4.field3777 > var6.field1347 && var4.field3778 > var6.field1348 && var4.field3777 < var6.field1347 + var6.field1345 && var4.field3778 < var6.field1348 + var6.field1346;
                    if (client.field630 == var2 && var8 && var6.field1354 != -1) {
                        Statics.field2459 = var6.field1354;
                    }
                    if (var8 && var7 == null) {
                        class95 var9 = var3.method2164(var2, var6);
                        var3.method2162(var9);
                        var6.field1357[var2] = var9;
                    } else if (!var8 && var7 != null && Statics.field3772 != var7) {
                        var3.method2163(var7);
                        var6.field1357[var2] = null;
                    }
                }
            }
        }
    }

    @ObfuscatedName("en.am(Lvm;B)V")
    public void method2962(class557 arg0) {
        for (int var2 = 0; var2 < this.field1420; var2++) {
            int var3 = this.field1433[var2];
            int var4 = arg0.method9258();
            if ((var4 & 0x2) != 0) {
                var4 += arg0.method9258() << 8;
            }
            if ((var4 & 0x4000) != 0) {
                var4 += arg0.method9258() << 16;
            }
            this.method2956(arg0, var3, var4);
        }
    }

    @ObfuscatedName("en.at(I)V")
    public void method2955() {
        for (int var1 = 0; var1 < this.field1426; var1++) {
            int var2 = this.field1427[var1];
            if (this.field1422[var2]) {
                class74 var3 = this.field1424[var2];
                var3.method2170(this.field1430[var2]);
                this.field1422[var2] = false;
            }
        }
    }

    @ObfuscatedName("en.au(Lvm;IIB)V")
    public void method2956(class557 arg0, int arg1, int arg2) {
        class74 var4 = this.field1424[arg1];
        if ((arg2 & 0x1000) != 0) {
            for (int var5 = 0; var5 < 3; var5++) {
                this.field1425[var5] = arg0.method9269();
            }
            var4.method2229(this.field1425);
        }
        if ((arg2 & 0x10000) != 0) {
            int var6 = arg0.method9258();
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg0.method9258();
                int var9 = arg0.method9301();
                int var10 = arg0.method9521();
                var4.method2183(var8, var9, var10 >> 16, var10 & 0xFFFF);
            }
        }
        if ((arg2 & 0x100) != 0) {
            byte var11 = arg0.method9296();
            byte var12 = arg0.method9259();
            byte var13 = arg0.method9378();
            byte var14 = arg0.method9259();
            int var15 = arg0.method9260() + client.field518;
            int var16 = arg0.method9301() + client.field518;
            int var17 = arg0.method9540();
            var4.method2181(var11, var12, var13, var14, var15, var16, var17, this.field1422[arg1]);
        }
        if ((arg2 & 0x400) != 0) {
            int var18 = client.field518 + arg0.method9388();
            int var19 = client.field518 + arg0.method9301();
            byte var20 = arg0.method9259();
            byte var21 = arg0.method9294();
            byte var22 = arg0.method9296();
            byte var23 = (byte) arg0.method9293();
            var4.method2234(var18, var19, var20, var21, var22, var23);
        }
        if ((arg2 & 0x2000) != 0) {
            byte var24 = arg0.method9378();
            if (var24 == 127) {
                this.field1430[arg1] = class276.field3053;
            } else {
                class276[] var25 = this.field1430;
                class276[] var27 = new class276[] { class276.field3058, class276.field3047, class276.field3052, class276.field3050, class276.field3053, class276.field3054, class276.field3048, class276.field3049, class276.field3051 };
                var25[arg1] = (class276) class406.method3580(var27, var24);
            }
        }
        if ((arg2 & 0x10) != 0) {
            String var28 = arg0.method9269();
            var4.method2208(var28);
        }
        if ((arg2 & 0x8) != 0) {
            arg0.method9301();
            arg0.method9291();
            arg0.method9258();
            int var29 = arg0.method9258();
            this.field1421.field5462 = 0;
            arg0.method9319(this.field1421.field5463, 0, var29);
            this.field1421.field5462 = 0;
        }
        if ((arg2 & 0x800) != 0) {
            int var30 = arg0.method9540();
            int var31 = var30 >> 8;
            int var32 = var31 >= 13 && var31 <= 20 ? var31 - 12 : 0;
            class386 var33 = (class386) class406.method3580(class386.method5893(), arg0.method9258());
            boolean var34 = arg0.method9291() == 1;
            int var35 = arg0.method9293();
            this.field1421.field5462 = 0;
            arg0.method9320(this.field1421.field5463, 0, var35);
            this.field1421.field5462 = 0;
            String var36 = class440.method7930(class420.method4271(class365.method7422(this.field1421)));
            byte[] var37 = null;
            if (var32 > 0 && var32 <= 8) {
                var37 = new byte[var32];
                for (int var38 = 0; var38 < var32; var38++) {
                    var37[var38] = arg0.method9296();
                }
            }
            var4.method2179(var30, var33, var34, var36, var37);
        }
        if ((arg2 & 0x8000) != 0) {
            class276[] var40 = new class276[] { class276.field3058, class276.field3047, class276.field3052, class276.field3050, class276.field3053, class276.field3054, class276.field3048, class276.field3049, class276.field3051 };
            var4.field878 = (class276) class406.method3580(var40, arg0.method9378());
            this.field1430[arg1] = var4.field878;
        }
        if ((arg2 & 0x20) != 0) {
            int var41 = arg0.method9301();
            var4.method2226(var41);
        }
        if ((arg2 & 0x40) != 0) {
            int var42 = arg0.method9260();
            if (var42 == 65535) {
                var42 = -1;
            }
            int var43 = arg0.method9291();
            var4.method2213(var42, var43);
        }
        if ((arg2 & 0x1) != 0) {
            int var44 = arg0.method9540();
            int var45 = var44 + (arg0.method9293() << 16);
            int var46 = 16777215;
            if (var45 == var46) {
                var45 = -1;
            }
            var4.method2173(var45);
        }
        if ((arg2 & 0x80) != 0) {
            int var47 = arg0.method9258();
            byte[] var48 = new byte[var47];
            class558 var49 = new class558(var48);
            arg0.method9242(var48, 0, var47);
            var4.method2178(var49);
        }
        if ((arg2 & 0x4) == 0) {
            return;
        }
        int var50 = arg0.method9258();
        if (var50 > 0) {
            for (int var51 = 0; var51 < var50; var51++) {
                int var52 = -1;
                int var53 = -1;
                int var54 = -1;
                int var55 = arg0.method9274();
                if (var55 == 32767) {
                    var55 = arg0.method9274();
                    var53 = arg0.method9274();
                    var52 = arg0.method9274();
                    var54 = arg0.method9274();
                } else if (var55 == 32766) {
                    var55 = -1;
                } else {
                    var53 = arg0.method9274();
                }
                int var56 = arg0.method9274();
                var4.method2242(var55, var53, var52, var54, var56);
            }
        }
        int var57 = arg0.method9478();
        if (var57 <= 0) {
            return;
        }
        for (int var58 = 0; var58 < var57; var58++) {
            int var59 = arg0.method9274();
            int var60 = arg0.method9274();
            if (var60 == 32767) {
                var4.method2177(var59);
            } else {
                int var61 = arg0.method9274();
                int var62 = arg0.method9293();
                int var63 = var60 > 0 ? arg0.method9291() : var62;
                var4.method2176(var59, var60, var61, var62, var63);
            }
        }
    }

    @ObfuscatedName("en.an(I)V")
    public void method2957() {
        this.field1426 = 0;
        for (int var1 = 0; var1 < 2048; var1++) {
            this.field1424[var1].method2160();
        }
    }
}
