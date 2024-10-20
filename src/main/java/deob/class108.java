package deob;

@ObfuscatedName("dn")
public class class108 {

    @ObfuscatedName("dn.aa")
    public int field1880 = 0;

    @ObfuscatedName("dn.ak")
    public int field1883 = 0;

    @ObfuscatedName("dn.an")
    public int field1873;

    @ObfuscatedName("dn.au")
    public int field1869;

    @ObfuscatedName("dn.ai")
    public int[][] field1884;

    public class108(int arg0, int arg1) {
        this.field1873 = arg0;
        this.field1869 = arg1;
        this.field1884 = new int[this.field1873][this.field1869];
        this.method2252();
    }

    @ObfuscatedName("dn.n(I)V")
    public void method2252() {
        for (int var1 = 0; var1 < this.field1873; var1++) {
            for (int var2 = 0; var2 < this.field1869; var2++) {
                if (var1 == 0 || var2 == 0 || var1 >= this.field1873 - 5 || var2 >= this.field1869 - 5) {
                    this.field1884[var1][var2] = 16777215;
                } else {
                    this.field1884[var1][var2] = 16777216;
                }
            }
        }
    }

    @ObfuscatedName("dn.q(IIIIZI)V")
    public void method2247(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = arg0 - this.field1880;
        int var7 = arg1 - this.field1883;
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method2250(var6, var7, 128);
                this.method2250(var6 - 1, var7, 8);
            }
            if (arg3 == 1) {
                this.method2250(var6, var7, 2);
                this.method2250(var6, var7 + 1, 32);
            }
            if (arg3 == 2) {
                this.method2250(var6, var7, 8);
                this.method2250(var6 + 1, var7, 128);
            }
            if (arg3 == 3) {
                this.method2250(var6, var7, 32);
                this.method2250(var6, var7 - 1, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method2250(var6, var7, 1);
                this.method2250(var6 - 1, var7 + 1, 16);
            }
            if (arg3 == 1) {
                this.method2250(var6, var7, 4);
                this.method2250(var6 + 1, var7 + 1, 64);
            }
            if (arg3 == 2) {
                this.method2250(var6, var7, 16);
                this.method2250(var6 + 1, var7 - 1, 1);
            }
            if (arg3 == 3) {
                this.method2250(var6, var7, 64);
                this.method2250(var6 - 1, var7 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg3 == 0) {
                this.method2250(var6, var7, 130);
                this.method2250(var6 - 1, var7, 8);
                this.method2250(var6, var7 + 1, 32);
            }
            if (arg3 == 1) {
                this.method2250(var6, var7, 10);
                this.method2250(var6, var7 + 1, 32);
                this.method2250(var6 + 1, var7, 128);
            }
            if (arg3 == 2) {
                this.method2250(var6, var7, 40);
                this.method2250(var6 + 1, var7, 128);
                this.method2250(var6, var7 - 1, 2);
            }
            if (arg3 == 3) {
                this.method2250(var6, var7, 160);
                this.method2250(var6, var7 - 1, 2);
                this.method2250(var6 - 1, var7, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method2250(var6, var7, 65536);
                this.method2250(var6 - 1, var7, 4096);
            }
            if (arg3 == 1) {
                this.method2250(var6, var7, 1024);
                this.method2250(var6, var7 + 1, 16384);
            }
            if (arg3 == 2) {
                this.method2250(var6, var7, 4096);
                this.method2250(var6 + 1, var7, 65536);
            }
            if (arg3 == 3) {
                this.method2250(var6, var7, 16384);
                this.method2250(var6, var7 - 1, 1024);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method2250(var6, var7, 512);
                this.method2250(var6 - 1, var7 + 1, 8192);
            }
            if (arg3 == 1) {
                this.method2250(var6, var7, 2048);
                this.method2250(var6 + 1, var7 + 1, 32768);
            }
            if (arg3 == 2) {
                this.method2250(var6, var7, 8192);
                this.method2250(var6 + 1, var7 - 1, 512);
            }
            if (arg3 == 3) {
                this.method2250(var6, var7, 32768);
                this.method2250(var6 - 1, var7 - 1, 2048);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method2250(var6, var7, 66560);
            this.method2250(var6 - 1, var7, 4096);
            this.method2250(var6, var7 + 1, 16384);
        }
        if (arg3 == 1) {
            this.method2250(var6, var7, 5120);
            this.method2250(var6, var7 + 1, 16384);
            this.method2250(var6 + 1, var7, 65536);
        }
        if (arg3 == 2) {
            this.method2250(var6, var7, 20480);
            this.method2250(var6 + 1, var7, 65536);
            this.method2250(var6, var7 - 1, 1024);
        }
        if (arg3 == 3) {
            this.method2250(var6, var7, 81920);
            this.method2250(var6, var7 - 1, 1024);
            this.method2250(var6 - 1, var7, 4096);
        }
    }

    @ObfuscatedName("dn.c(IIIIZB)V")
    public void method2267(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = 256;
        if (arg4) {
            var6 += 131072;
        }
        int var7 = arg0 - this.field1880;
        int var8 = arg1 - this.field1883;
        for (int var9 = var7; var9 < arg2 + var7; var9++) {
            if (var9 >= 0 && var9 < this.field1873) {
                for (int var10 = var8; var10 < arg3 + var8; var10++) {
                    if (var10 >= 0 && var10 < this.field1869) {
                        this.method2250(var9, var10, var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("dn.l(III)V")
    public void method2248(int arg0, int arg1) {
        int var3 = arg0 - this.field1880;
        int var4 = arg1 - this.field1883;
        this.field1884[var3][var4] |= 0x200000;
    }

    @ObfuscatedName("dn.r(III)V")
    public void method2259(int arg0, int arg1) {
        int var3 = arg0 - this.field1880;
        int var4 = arg1 - this.field1883;
        this.field1884[var3][var4] |= 0x40000;
    }

    @ObfuscatedName("dn.u(IIIB)V")
    public void method2250(int arg0, int arg1, int arg2) {
        this.field1884[arg0][arg1] |= arg2;
    }

    @ObfuscatedName("dn.j(IIIIZB)V")
    public void method2251(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = arg0 - this.field1880;
        int var7 = arg1 - this.field1883;
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method2253(var6, var7, 128);
                this.method2253(var6 - 1, var7, 8);
            }
            if (arg3 == 1) {
                this.method2253(var6, var7, 2);
                this.method2253(var6, var7 + 1, 32);
            }
            if (arg3 == 2) {
                this.method2253(var6, var7, 8);
                this.method2253(var6 + 1, var7, 128);
            }
            if (arg3 == 3) {
                this.method2253(var6, var7, 32);
                this.method2253(var6, var7 - 1, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method2253(var6, var7, 1);
                this.method2253(var6 - 1, var7 + 1, 16);
            }
            if (arg3 == 1) {
                this.method2253(var6, var7, 4);
                this.method2253(var6 + 1, var7 + 1, 64);
            }
            if (arg3 == 2) {
                this.method2253(var6, var7, 16);
                this.method2253(var6 + 1, var7 - 1, 1);
            }
            if (arg3 == 3) {
                this.method2253(var6, var7, 64);
                this.method2253(var6 - 1, var7 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg3 == 0) {
                this.method2253(var6, var7, 130);
                this.method2253(var6 - 1, var7, 8);
                this.method2253(var6, var7 + 1, 32);
            }
            if (arg3 == 1) {
                this.method2253(var6, var7, 10);
                this.method2253(var6, var7 + 1, 32);
                this.method2253(var6 + 1, var7, 128);
            }
            if (arg3 == 2) {
                this.method2253(var6, var7, 40);
                this.method2253(var6 + 1, var7, 128);
                this.method2253(var6, var7 - 1, 2);
            }
            if (arg3 == 3) {
                this.method2253(var6, var7, 160);
                this.method2253(var6, var7 - 1, 2);
                this.method2253(var6 - 1, var7, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method2253(var6, var7, 65536);
                this.method2253(var6 - 1, var7, 4096);
            }
            if (arg3 == 1) {
                this.method2253(var6, var7, 1024);
                this.method2253(var6, var7 + 1, 16384);
            }
            if (arg3 == 2) {
                this.method2253(var6, var7, 4096);
                this.method2253(var6 + 1, var7, 65536);
            }
            if (arg3 == 3) {
                this.method2253(var6, var7, 16384);
                this.method2253(var6, var7 - 1, 1024);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method2253(var6, var7, 512);
                this.method2253(var6 - 1, var7 + 1, 8192);
            }
            if (arg3 == 1) {
                this.method2253(var6, var7, 2048);
                this.method2253(var6 + 1, var7 + 1, 32768);
            }
            if (arg3 == 2) {
                this.method2253(var6, var7, 8192);
                this.method2253(var6 + 1, var7 - 1, 512);
            }
            if (arg3 == 3) {
                this.method2253(var6, var7, 32768);
                this.method2253(var6 - 1, var7 - 1, 2048);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method2253(var6, var7, 66560);
            this.method2253(var6 - 1, var7, 4096);
            this.method2253(var6, var7 + 1, 16384);
        }
        if (arg3 == 1) {
            this.method2253(var6, var7, 5120);
            this.method2253(var6, var7 + 1, 16384);
            this.method2253(var6 + 1, var7, 65536);
        }
        if (arg3 == 2) {
            this.method2253(var6, var7, 20480);
            this.method2253(var6 + 1, var7, 65536);
            this.method2253(var6, var7 - 1, 1024);
        }
        if (arg3 == 3) {
            this.method2253(var6, var7, 81920);
            this.method2253(var6, var7 - 1, 1024);
            this.method2253(var6 - 1, var7, 4096);
        }
    }

    @ObfuscatedName("dn.w(IIIIIZI)V")
    public void method2245(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = 256;
        if (arg5) {
            var7 += 131072;
        }
        int var8 = arg0 - this.field1880;
        int var9 = arg1 - this.field1883;
        if (arg4 == 1 || arg4 == 3) {
            int var10 = arg2;
            arg2 = arg3;
            arg3 = var10;
        }
        for (int var11 = var8; var11 < arg2 + var8; var11++) {
            if (var11 >= 0 && var11 < this.field1873) {
                for (int var12 = var9; var12 < arg3 + var9; var12++) {
                    if (var12 >= 0 && var12 < this.field1869) {
                        this.method2253(var11, var12, var7);
                    }
                }
            }
        }
    }

    @ObfuscatedName("dn.y(IIIB)V")
    public void method2253(int arg0, int arg1, int arg2) {
        this.field1884[arg0][arg1] &= ~arg2;
    }

    @ObfuscatedName("dn.o(III)V")
    public void method2254(int arg0, int arg1) {
        int var3 = arg0 - this.field1880;
        int var4 = arg1 - this.field1883;
        this.field1884[var3][var4] &= 0xFFFBFFFF;
    }
}
