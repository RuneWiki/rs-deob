package deob;

@ObfuscatedName("de")
public class class109 {

    @ObfuscatedName("de.an")
    public int field1893 = 0;

    @ObfuscatedName("de.az")
    public int field1894 = 0;

    @ObfuscatedName("de.ac")
    public int field1892;

    @ObfuscatedName("de.ao")
    public int field1896;

    @ObfuscatedName("de.ax")
    public int[][] field1897;

    public class109(int arg0, int arg1) {
        this.field1892 = arg0;
        this.field1896 = arg1;
        this.field1897 = new int[this.field1892][this.field1896];
        this.method2340();
    }

    @ObfuscatedName("de.a(I)V")
    public void method2340() {
        for (int var1 = 0; var1 < this.field1892; var1++) {
            for (int var2 = 0; var2 < this.field1896; var2++) {
                if (var1 == 0 || var2 == 0 || var1 >= this.field1892 - 5 || var2 >= this.field1896 - 5) {
                    this.field1897[var1][var2] = 16777215;
                } else {
                    this.field1897[var1][var2] = 16777216;
                }
            }
        }
    }

    @ObfuscatedName("de.w(IIIIZI)V")
    public void method2341(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = arg0 - this.field1893;
        int var7 = arg1 - this.field1894;
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method2354(var6, var7, 128);
                this.method2354(var6 - 1, var7, 8);
            }
            if (arg3 == 1) {
                this.method2354(var6, var7, 2);
                this.method2354(var6, var7 + 1, 32);
            }
            if (arg3 == 2) {
                this.method2354(var6, var7, 8);
                this.method2354(var6 + 1, var7, 128);
            }
            if (arg3 == 3) {
                this.method2354(var6, var7, 32);
                this.method2354(var6, var7 - 1, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method2354(var6, var7, 1);
                this.method2354(var6 - 1, var7 + 1, 16);
            }
            if (arg3 == 1) {
                this.method2354(var6, var7, 4);
                this.method2354(var6 + 1, var7 + 1, 64);
            }
            if (arg3 == 2) {
                this.method2354(var6, var7, 16);
                this.method2354(var6 + 1, var7 - 1, 1);
            }
            if (arg3 == 3) {
                this.method2354(var6, var7, 64);
                this.method2354(var6 - 1, var7 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg3 == 0) {
                this.method2354(var6, var7, 130);
                this.method2354(var6 - 1, var7, 8);
                this.method2354(var6, var7 + 1, 32);
            }
            if (arg3 == 1) {
                this.method2354(var6, var7, 10);
                this.method2354(var6, var7 + 1, 32);
                this.method2354(var6 + 1, var7, 128);
            }
            if (arg3 == 2) {
                this.method2354(var6, var7, 40);
                this.method2354(var6 + 1, var7, 128);
                this.method2354(var6, var7 - 1, 2);
            }
            if (arg3 == 3) {
                this.method2354(var6, var7, 160);
                this.method2354(var6, var7 - 1, 2);
                this.method2354(var6 - 1, var7, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method2354(var6, var7, 65536);
                this.method2354(var6 - 1, var7, 4096);
            }
            if (arg3 == 1) {
                this.method2354(var6, var7, 1024);
                this.method2354(var6, var7 + 1, 16384);
            }
            if (arg3 == 2) {
                this.method2354(var6, var7, 4096);
                this.method2354(var6 + 1, var7, 65536);
            }
            if (arg3 == 3) {
                this.method2354(var6, var7, 16384);
                this.method2354(var6, var7 - 1, 1024);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method2354(var6, var7, 512);
                this.method2354(var6 - 1, var7 + 1, 8192);
            }
            if (arg3 == 1) {
                this.method2354(var6, var7, 2048);
                this.method2354(var6 + 1, var7 + 1, 32768);
            }
            if (arg3 == 2) {
                this.method2354(var6, var7, 8192);
                this.method2354(var6 + 1, var7 - 1, 512);
            }
            if (arg3 == 3) {
                this.method2354(var6, var7, 32768);
                this.method2354(var6 - 1, var7 - 1, 2048);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method2354(var6, var7, 66560);
            this.method2354(var6 - 1, var7, 4096);
            this.method2354(var6, var7 + 1, 16384);
        }
        if (arg3 == 1) {
            this.method2354(var6, var7, 5120);
            this.method2354(var6, var7 + 1, 16384);
            this.method2354(var6 + 1, var7, 65536);
        }
        if (arg3 == 2) {
            this.method2354(var6, var7, 20480);
            this.method2354(var6 + 1, var7, 65536);
            this.method2354(var6, var7 - 1, 1024);
        }
        if (arg3 == 3) {
            this.method2354(var6, var7, 81920);
            this.method2354(var6, var7 - 1, 1024);
            this.method2354(var6 - 1, var7, 4096);
        }
    }

    @ObfuscatedName("de.d(IIIIZI)V")
    public void method2342(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = 256;
        if (arg4) {
            var6 += 131072;
        }
        int var7 = arg0 - this.field1893;
        int var8 = arg1 - this.field1894;
        for (int var9 = var7; var9 < arg2 + var7; var9++) {
            if (var9 >= 0 && var9 < this.field1892) {
                for (int var10 = var8; var10 < arg3 + var8; var10++) {
                    if (var10 >= 0 && var10 < this.field1896) {
                        this.method2354(var9, var10, var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("de.c(III)V")
    public void method2348(int arg0, int arg1) {
        int var3 = arg0 - this.field1893;
        int var4 = arg1 - this.field1894;
        this.field1897[var3][var4] |= 0x200000;
    }

    @ObfuscatedName("de.y(III)V")
    public void method2344(int arg0, int arg1) {
        int var3 = arg0 - this.field1893;
        int var4 = arg1 - this.field1894;
        this.field1897[var3][var4] |= 0x40000;
    }

    @ObfuscatedName("de.k(IIII)V")
    public void method2354(int arg0, int arg1, int arg2) {
        this.field1897[arg0][arg1] |= arg2;
    }

    @ObfuscatedName("de.r(IIIIZI)V")
    public void method2339(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = arg0 - this.field1893;
        int var7 = arg1 - this.field1894;
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method2362(var6, var7, 128);
                this.method2362(var6 - 1, var7, 8);
            }
            if (arg3 == 1) {
                this.method2362(var6, var7, 2);
                this.method2362(var6, var7 + 1, 32);
            }
            if (arg3 == 2) {
                this.method2362(var6, var7, 8);
                this.method2362(var6 + 1, var7, 128);
            }
            if (arg3 == 3) {
                this.method2362(var6, var7, 32);
                this.method2362(var6, var7 - 1, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method2362(var6, var7, 1);
                this.method2362(var6 - 1, var7 + 1, 16);
            }
            if (arg3 == 1) {
                this.method2362(var6, var7, 4);
                this.method2362(var6 + 1, var7 + 1, 64);
            }
            if (arg3 == 2) {
                this.method2362(var6, var7, 16);
                this.method2362(var6 + 1, var7 - 1, 1);
            }
            if (arg3 == 3) {
                this.method2362(var6, var7, 64);
                this.method2362(var6 - 1, var7 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg3 == 0) {
                this.method2362(var6, var7, 130);
                this.method2362(var6 - 1, var7, 8);
                this.method2362(var6, var7 + 1, 32);
            }
            if (arg3 == 1) {
                this.method2362(var6, var7, 10);
                this.method2362(var6, var7 + 1, 32);
                this.method2362(var6 + 1, var7, 128);
            }
            if (arg3 == 2) {
                this.method2362(var6, var7, 40);
                this.method2362(var6 + 1, var7, 128);
                this.method2362(var6, var7 - 1, 2);
            }
            if (arg3 == 3) {
                this.method2362(var6, var7, 160);
                this.method2362(var6, var7 - 1, 2);
                this.method2362(var6 - 1, var7, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method2362(var6, var7, 65536);
                this.method2362(var6 - 1, var7, 4096);
            }
            if (arg3 == 1) {
                this.method2362(var6, var7, 1024);
                this.method2362(var6, var7 + 1, 16384);
            }
            if (arg3 == 2) {
                this.method2362(var6, var7, 4096);
                this.method2362(var6 + 1, var7, 65536);
            }
            if (arg3 == 3) {
                this.method2362(var6, var7, 16384);
                this.method2362(var6, var7 - 1, 1024);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method2362(var6, var7, 512);
                this.method2362(var6 - 1, var7 + 1, 8192);
            }
            if (arg3 == 1) {
                this.method2362(var6, var7, 2048);
                this.method2362(var6 + 1, var7 + 1, 32768);
            }
            if (arg3 == 2) {
                this.method2362(var6, var7, 8192);
                this.method2362(var6 + 1, var7 - 1, 512);
            }
            if (arg3 == 3) {
                this.method2362(var6, var7, 32768);
                this.method2362(var6 - 1, var7 - 1, 2048);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method2362(var6, var7, 66560);
            this.method2362(var6 - 1, var7, 4096);
            this.method2362(var6, var7 + 1, 16384);
        }
        if (arg3 == 1) {
            this.method2362(var6, var7, 5120);
            this.method2362(var6, var7 + 1, 16384);
            this.method2362(var6 + 1, var7, 65536);
        }
        if (arg3 == 2) {
            this.method2362(var6, var7, 20480);
            this.method2362(var6 + 1, var7, 65536);
            this.method2362(var6, var7 - 1, 1024);
        }
        if (arg3 == 3) {
            this.method2362(var6, var7, 81920);
            this.method2362(var6, var7 - 1, 1024);
            this.method2362(var6 - 1, var7, 4096);
        }
    }

    @ObfuscatedName("de.p(IIIIIZI)V")
    public void method2347(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = 256;
        if (arg5) {
            var7 += 131072;
        }
        int var8 = arg0 - this.field1893;
        int var9 = arg1 - this.field1894;
        if (arg4 == 1 || arg4 == 3) {
            int var10 = arg2;
            arg2 = arg3;
            arg3 = var10;
        }
        for (int var11 = var8; var11 < arg2 + var8; var11++) {
            if (var11 >= 0 && var11 < this.field1892) {
                for (int var12 = var9; var12 < arg3 + var9; var12++) {
                    if (var12 >= 0 && var12 < this.field1896) {
                        this.method2362(var11, var12, var7);
                    }
                }
            }
        }
    }

    @ObfuscatedName("de.q(IIIB)V")
    public void method2362(int arg0, int arg1, int arg2) {
        this.field1897[arg0][arg1] &= ~arg2;
    }

    @ObfuscatedName("de.m(III)V")
    public void method2349(int arg0, int arg1) {
        int var3 = arg0 - this.field1893;
        int var4 = arg1 - this.field1894;
        this.field1897[var3][var4] &= 0xFFFBFFFF;
    }
}
