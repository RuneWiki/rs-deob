package deob;

@ObfuscatedName("dl")
public class class108 {

    @ObfuscatedName("dl.au")
    public int field1848 = 0;

    @ObfuscatedName("dl.ao")
    public int field1849 = 0;

    @ObfuscatedName("dl.am")
    public int field1842;

    @ObfuscatedName("dl.aa")
    public int field1851;

    @ObfuscatedName("dl.aj")
    public int[][] field1852;

    public class108(int arg0, int arg1) {
        this.field1842 = arg0;
        this.field1851 = arg1;
        this.field1852 = new int[this.field1842][this.field1851];
        this.method2281();
    }

    @ObfuscatedName("dl.m(I)V")
    public void method2281() {
        for (int var1 = 0; var1 < this.field1842; var1++) {
            for (int var2 = 0; var2 < this.field1851; var2++) {
                if (var1 == 0 || var2 == 0 || var1 >= this.field1842 - 5 || var2 >= this.field1851 - 5) {
                    this.field1852[var1][var2] = 16777215;
                } else {
                    this.field1852[var1][var2] = 16777216;
                }
            }
        }
    }

    @ObfuscatedName("dl.l(IIIIZI)V")
    public void method2269(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = arg0 - this.field1848;
        int var7 = arg1 - this.field1849;
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method2273(var6, var7, 128);
                this.method2273(var6 - 1, var7, 8);
            }
            if (arg3 == 1) {
                this.method2273(var6, var7, 2);
                this.method2273(var6, var7 + 1, 32);
            }
            if (arg3 == 2) {
                this.method2273(var6, var7, 8);
                this.method2273(var6 + 1, var7, 128);
            }
            if (arg3 == 3) {
                this.method2273(var6, var7, 32);
                this.method2273(var6, var7 - 1, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method2273(var6, var7, 1);
                this.method2273(var6 - 1, var7 + 1, 16);
            }
            if (arg3 == 1) {
                this.method2273(var6, var7, 4);
                this.method2273(var6 + 1, var7 + 1, 64);
            }
            if (arg3 == 2) {
                this.method2273(var6, var7, 16);
                this.method2273(var6 + 1, var7 - 1, 1);
            }
            if (arg3 == 3) {
                this.method2273(var6, var7, 64);
                this.method2273(var6 - 1, var7 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg3 == 0) {
                this.method2273(var6, var7, 130);
                this.method2273(var6 - 1, var7, 8);
                this.method2273(var6, var7 + 1, 32);
            }
            if (arg3 == 1) {
                this.method2273(var6, var7, 10);
                this.method2273(var6, var7 + 1, 32);
                this.method2273(var6 + 1, var7, 128);
            }
            if (arg3 == 2) {
                this.method2273(var6, var7, 40);
                this.method2273(var6 + 1, var7, 128);
                this.method2273(var6, var7 - 1, 2);
            }
            if (arg3 == 3) {
                this.method2273(var6, var7, 160);
                this.method2273(var6, var7 - 1, 2);
                this.method2273(var6 - 1, var7, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method2273(var6, var7, 65536);
                this.method2273(var6 - 1, var7, 4096);
            }
            if (arg3 == 1) {
                this.method2273(var6, var7, 1024);
                this.method2273(var6, var7 + 1, 16384);
            }
            if (arg3 == 2) {
                this.method2273(var6, var7, 4096);
                this.method2273(var6 + 1, var7, 65536);
            }
            if (arg3 == 3) {
                this.method2273(var6, var7, 16384);
                this.method2273(var6, var7 - 1, 1024);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method2273(var6, var7, 512);
                this.method2273(var6 - 1, var7 + 1, 8192);
            }
            if (arg3 == 1) {
                this.method2273(var6, var7, 2048);
                this.method2273(var6 + 1, var7 + 1, 32768);
            }
            if (arg3 == 2) {
                this.method2273(var6, var7, 8192);
                this.method2273(var6 + 1, var7 - 1, 512);
            }
            if (arg3 == 3) {
                this.method2273(var6, var7, 32768);
                this.method2273(var6 - 1, var7 - 1, 2048);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method2273(var6, var7, 66560);
            this.method2273(var6 - 1, var7, 4096);
            this.method2273(var6, var7 + 1, 16384);
        }
        if (arg3 == 1) {
            this.method2273(var6, var7, 5120);
            this.method2273(var6, var7 + 1, 16384);
            this.method2273(var6 + 1, var7, 65536);
        }
        if (arg3 == 2) {
            this.method2273(var6, var7, 20480);
            this.method2273(var6 + 1, var7, 65536);
            this.method2273(var6, var7 - 1, 1024);
        }
        if (arg3 == 3) {
            this.method2273(var6, var7, 81920);
            this.method2273(var6, var7 - 1, 1024);
            this.method2273(var6 - 1, var7, 4096);
        }
    }

    @ObfuscatedName("dl.y(IIIIZI)V")
    public void method2282(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = 256;
        if (arg4) {
            var6 += 131072;
        }
        int var7 = arg0 - this.field1848;
        int var8 = arg1 - this.field1849;
        for (int var9 = var7; var9 < arg2 + var7; var9++) {
            if (var9 >= 0 && var9 < this.field1842) {
                for (int var10 = var8; var10 < arg3 + var8; var10++) {
                    if (var10 >= 0 && var10 < this.field1851) {
                        this.method2273(var9, var10, var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("dl.u(III)V")
    public void method2271(int arg0, int arg1) {
        int var3 = arg0 - this.field1848;
        int var4 = arg1 - this.field1849;
        this.field1852[var3][var4] |= 0x200000;
    }

    @ObfuscatedName("dl.k(III)V")
    public void method2272(int arg0, int arg1) {
        int var3 = arg0 - this.field1848;
        int var4 = arg1 - this.field1849;
        this.field1852[var3][var4] |= 0x40000;
    }

    @ObfuscatedName("dl.j(IIII)V")
    public void method2273(int arg0, int arg1, int arg2) {
        this.field1852[arg0][arg1] |= arg2;
    }

    @ObfuscatedName("dl.i(IIIIZI)V")
    public void method2290(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = arg0 - this.field1848;
        int var7 = arg1 - this.field1849;
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method2276(var6, var7, 128);
                this.method2276(var6 - 1, var7, 8);
            }
            if (arg3 == 1) {
                this.method2276(var6, var7, 2);
                this.method2276(var6, var7 + 1, 32);
            }
            if (arg3 == 2) {
                this.method2276(var6, var7, 8);
                this.method2276(var6 + 1, var7, 128);
            }
            if (arg3 == 3) {
                this.method2276(var6, var7, 32);
                this.method2276(var6, var7 - 1, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method2276(var6, var7, 1);
                this.method2276(var6 - 1, var7 + 1, 16);
            }
            if (arg3 == 1) {
                this.method2276(var6, var7, 4);
                this.method2276(var6 + 1, var7 + 1, 64);
            }
            if (arg3 == 2) {
                this.method2276(var6, var7, 16);
                this.method2276(var6 + 1, var7 - 1, 1);
            }
            if (arg3 == 3) {
                this.method2276(var6, var7, 64);
                this.method2276(var6 - 1, var7 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg3 == 0) {
                this.method2276(var6, var7, 130);
                this.method2276(var6 - 1, var7, 8);
                this.method2276(var6, var7 + 1, 32);
            }
            if (arg3 == 1) {
                this.method2276(var6, var7, 10);
                this.method2276(var6, var7 + 1, 32);
                this.method2276(var6 + 1, var7, 128);
            }
            if (arg3 == 2) {
                this.method2276(var6, var7, 40);
                this.method2276(var6 + 1, var7, 128);
                this.method2276(var6, var7 - 1, 2);
            }
            if (arg3 == 3) {
                this.method2276(var6, var7, 160);
                this.method2276(var6, var7 - 1, 2);
                this.method2276(var6 - 1, var7, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method2276(var6, var7, 65536);
                this.method2276(var6 - 1, var7, 4096);
            }
            if (arg3 == 1) {
                this.method2276(var6, var7, 1024);
                this.method2276(var6, var7 + 1, 16384);
            }
            if (arg3 == 2) {
                this.method2276(var6, var7, 4096);
                this.method2276(var6 + 1, var7, 65536);
            }
            if (arg3 == 3) {
                this.method2276(var6, var7, 16384);
                this.method2276(var6, var7 - 1, 1024);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method2276(var6, var7, 512);
                this.method2276(var6 - 1, var7 + 1, 8192);
            }
            if (arg3 == 1) {
                this.method2276(var6, var7, 2048);
                this.method2276(var6 + 1, var7 + 1, 32768);
            }
            if (arg3 == 2) {
                this.method2276(var6, var7, 8192);
                this.method2276(var6 + 1, var7 - 1, 512);
            }
            if (arg3 == 3) {
                this.method2276(var6, var7, 32768);
                this.method2276(var6 - 1, var7 - 1, 2048);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method2276(var6, var7, 66560);
            this.method2276(var6 - 1, var7, 4096);
            this.method2276(var6, var7 + 1, 16384);
        }
        if (arg3 == 1) {
            this.method2276(var6, var7, 5120);
            this.method2276(var6, var7 + 1, 16384);
            this.method2276(var6 + 1, var7, 65536);
        }
        if (arg3 == 2) {
            this.method2276(var6, var7, 20480);
            this.method2276(var6 + 1, var7, 65536);
            this.method2276(var6, var7 - 1, 1024);
        }
        if (arg3 == 3) {
            this.method2276(var6, var7, 81920);
            this.method2276(var6, var7 - 1, 1024);
            this.method2276(var6 - 1, var7, 4096);
        }
    }

    @ObfuscatedName("dl.x(IIIIIZI)V")
    public void method2275(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = 256;
        if (arg5) {
            var7 += 131072;
        }
        int var8 = arg0 - this.field1848;
        int var9 = arg1 - this.field1849;
        if (arg4 == 1 || arg4 == 3) {
            int var10 = arg2;
            arg2 = arg3;
            arg3 = var10;
        }
        for (int var11 = var8; var11 < arg2 + var8; var11++) {
            if (var11 >= 0 && var11 < this.field1842) {
                for (int var12 = var9; var12 < arg3 + var9; var12++) {
                    if (var12 >= 0 && var12 < this.field1851) {
                        this.method2276(var11, var12, var7);
                    }
                }
            }
        }
    }

    @ObfuscatedName("dl.g(IIIS)V")
    public void method2276(int arg0, int arg1, int arg2) {
        this.field1852[arg0][arg1] &= ~arg2;
    }

    @ObfuscatedName("dl.e(III)V")
    public void method2274(int arg0, int arg1) {
        int var3 = arg0 - this.field1848;
        int var4 = arg1 - this.field1849;
        this.field1852[var3][var4] &= 0xFFFBFFFF;
    }
}
