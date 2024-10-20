package deob;

@ObfuscatedName("dj")
public class class118 {

    @ObfuscatedName("dj.aj")
    public int field1834 = 0;

    @ObfuscatedName("dj.ay")
    public int field1840 = 0;

    @ObfuscatedName("dj.ae")
    public int field1836;

    @ObfuscatedName("dj.aq")
    public int field1835;

    @ObfuscatedName("dj.av")
    public int[][] field1838;

    public class118(int arg0, int arg1) {
        this.field1836 = arg0;
        this.field1835 = arg1;
        this.field1838 = new int[this.field1836][this.field1835];
        this.method2100();
    }

    @ObfuscatedName("dj.d(I)V")
    public void method2100() {
        for (int var1 = 0; var1 < this.field1836; var1++) {
            for (int var2 = 0; var2 < this.field1835; var2++) {
                if (var1 == 0 || var2 == 0 || var1 >= this.field1836 - 5 || var2 >= this.field1835 - 5) {
                    this.field1838[var1][var2] = 16777215;
                } else {
                    this.field1838[var1][var2] = 16777216;
                }
            }
        }
    }

    @ObfuscatedName("dj.c(IIIIZI)V")
    public void method2104(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = arg0 - this.field1834;
        int var7 = arg1 - this.field1840;
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method2123(var6, var7, 128);
                this.method2123(var6 - 1, var7, 8);
            }
            if (arg3 == 1) {
                this.method2123(var6, var7, 2);
                this.method2123(var6, var7 + 1, 32);
            }
            if (arg3 == 2) {
                this.method2123(var6, var7, 8);
                this.method2123(var6 + 1, var7, 128);
            }
            if (arg3 == 3) {
                this.method2123(var6, var7, 32);
                this.method2123(var6, var7 - 1, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method2123(var6, var7, 1);
                this.method2123(var6 - 1, var7 + 1, 16);
            }
            if (arg3 == 1) {
                this.method2123(var6, var7, 4);
                this.method2123(var6 + 1, var7 + 1, 64);
            }
            if (arg3 == 2) {
                this.method2123(var6, var7, 16);
                this.method2123(var6 + 1, var7 - 1, 1);
            }
            if (arg3 == 3) {
                this.method2123(var6, var7, 64);
                this.method2123(var6 - 1, var7 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg3 == 0) {
                this.method2123(var6, var7, 130);
                this.method2123(var6 - 1, var7, 8);
                this.method2123(var6, var7 + 1, 32);
            }
            if (arg3 == 1) {
                this.method2123(var6, var7, 10);
                this.method2123(var6, var7 + 1, 32);
                this.method2123(var6 + 1, var7, 128);
            }
            if (arg3 == 2) {
                this.method2123(var6, var7, 40);
                this.method2123(var6 + 1, var7, 128);
                this.method2123(var6, var7 - 1, 2);
            }
            if (arg3 == 3) {
                this.method2123(var6, var7, 160);
                this.method2123(var6, var7 - 1, 2);
                this.method2123(var6 - 1, var7, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method2123(var6, var7, 65536);
                this.method2123(var6 - 1, var7, 4096);
            }
            if (arg3 == 1) {
                this.method2123(var6, var7, 1024);
                this.method2123(var6, var7 + 1, 16384);
            }
            if (arg3 == 2) {
                this.method2123(var6, var7, 4096);
                this.method2123(var6 + 1, var7, 65536);
            }
            if (arg3 == 3) {
                this.method2123(var6, var7, 16384);
                this.method2123(var6, var7 - 1, 1024);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method2123(var6, var7, 512);
                this.method2123(var6 - 1, var7 + 1, 8192);
            }
            if (arg3 == 1) {
                this.method2123(var6, var7, 2048);
                this.method2123(var6 + 1, var7 + 1, 32768);
            }
            if (arg3 == 2) {
                this.method2123(var6, var7, 8192);
                this.method2123(var6 + 1, var7 - 1, 512);
            }
            if (arg3 == 3) {
                this.method2123(var6, var7, 32768);
                this.method2123(var6 - 1, var7 - 1, 2048);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method2123(var6, var7, 66560);
            this.method2123(var6 - 1, var7, 4096);
            this.method2123(var6, var7 + 1, 16384);
        }
        if (arg3 == 1) {
            this.method2123(var6, var7, 5120);
            this.method2123(var6, var7 + 1, 16384);
            this.method2123(var6 + 1, var7, 65536);
        }
        if (arg3 == 2) {
            this.method2123(var6, var7, 20480);
            this.method2123(var6 + 1, var7, 65536);
            this.method2123(var6, var7 - 1, 1024);
        }
        if (arg3 == 3) {
            this.method2123(var6, var7, 81920);
            this.method2123(var6, var7 - 1, 1024);
            this.method2123(var6 - 1, var7, 4096);
        }
    }

    @ObfuscatedName("dj.n(IIIIZB)V")
    public void method2102(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = 256;
        if (arg4) {
            var6 += 131072;
        }
        int var7 = arg0 - this.field1834;
        int var8 = arg1 - this.field1840;
        for (int var9 = var7; var9 < arg2 + var7; var9++) {
            if (var9 >= 0 && var9 < this.field1836) {
                for (int var10 = var8; var10 < arg3 + var8; var10++) {
                    if (var10 >= 0 && var10 < this.field1835) {
                        this.method2123(var9, var10, var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("dj.q(III)V")
    public void method2105(int arg0, int arg1) {
        int var3 = arg0 - this.field1834;
        int var4 = arg1 - this.field1840;
        this.field1838[var3][var4] |= 0x200000;
    }

    @ObfuscatedName("dj.t(IIB)V")
    public void method2103(int arg0, int arg1) {
        int var3 = arg0 - this.field1834;
        int var4 = arg1 - this.field1840;
        this.field1838[var3][var4] |= 0x40000;
    }

    @ObfuscatedName("dj.p(IIII)V")
    public void method2123(int arg0, int arg1, int arg2) {
        this.field1838[arg0][arg1] |= arg2;
    }

    @ObfuscatedName("dj.u(IIIIZB)V")
    public void method2113(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = arg0 - this.field1834;
        int var7 = arg1 - this.field1840;
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method2131(var6, var7, 128);
                this.method2131(var6 - 1, var7, 8);
            }
            if (arg3 == 1) {
                this.method2131(var6, var7, 2);
                this.method2131(var6, var7 + 1, 32);
            }
            if (arg3 == 2) {
                this.method2131(var6, var7, 8);
                this.method2131(var6 + 1, var7, 128);
            }
            if (arg3 == 3) {
                this.method2131(var6, var7, 32);
                this.method2131(var6, var7 - 1, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method2131(var6, var7, 1);
                this.method2131(var6 - 1, var7 + 1, 16);
            }
            if (arg3 == 1) {
                this.method2131(var6, var7, 4);
                this.method2131(var6 + 1, var7 + 1, 64);
            }
            if (arg3 == 2) {
                this.method2131(var6, var7, 16);
                this.method2131(var6 + 1, var7 - 1, 1);
            }
            if (arg3 == 3) {
                this.method2131(var6, var7, 64);
                this.method2131(var6 - 1, var7 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg3 == 0) {
                this.method2131(var6, var7, 130);
                this.method2131(var6 - 1, var7, 8);
                this.method2131(var6, var7 + 1, 32);
            }
            if (arg3 == 1) {
                this.method2131(var6, var7, 10);
                this.method2131(var6, var7 + 1, 32);
                this.method2131(var6 + 1, var7, 128);
            }
            if (arg3 == 2) {
                this.method2131(var6, var7, 40);
                this.method2131(var6 + 1, var7, 128);
                this.method2131(var6, var7 - 1, 2);
            }
            if (arg3 == 3) {
                this.method2131(var6, var7, 160);
                this.method2131(var6, var7 - 1, 2);
                this.method2131(var6 - 1, var7, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method2131(var6, var7, 65536);
                this.method2131(var6 - 1, var7, 4096);
            }
            if (arg3 == 1) {
                this.method2131(var6, var7, 1024);
                this.method2131(var6, var7 + 1, 16384);
            }
            if (arg3 == 2) {
                this.method2131(var6, var7, 4096);
                this.method2131(var6 + 1, var7, 65536);
            }
            if (arg3 == 3) {
                this.method2131(var6, var7, 16384);
                this.method2131(var6, var7 - 1, 1024);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method2131(var6, var7, 512);
                this.method2131(var6 - 1, var7 + 1, 8192);
            }
            if (arg3 == 1) {
                this.method2131(var6, var7, 2048);
                this.method2131(var6 + 1, var7 + 1, 32768);
            }
            if (arg3 == 2) {
                this.method2131(var6, var7, 8192);
                this.method2131(var6 + 1, var7 - 1, 512);
            }
            if (arg3 == 3) {
                this.method2131(var6, var7, 32768);
                this.method2131(var6 - 1, var7 - 1, 2048);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method2131(var6, var7, 66560);
            this.method2131(var6 - 1, var7, 4096);
            this.method2131(var6, var7 + 1, 16384);
        }
        if (arg3 == 1) {
            this.method2131(var6, var7, 5120);
            this.method2131(var6, var7 + 1, 16384);
            this.method2131(var6 + 1, var7, 65536);
        }
        if (arg3 == 2) {
            this.method2131(var6, var7, 20480);
            this.method2131(var6 + 1, var7, 65536);
            this.method2131(var6, var7 - 1, 1024);
        }
        if (arg3 == 3) {
            this.method2131(var6, var7, 81920);
            this.method2131(var6, var7 - 1, 1024);
            this.method2131(var6 - 1, var7, 4096);
        }
    }

    @ObfuscatedName("dj.w(IIIIIZI)V")
    public void method2112(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = 256;
        if (arg5) {
            var7 += 131072;
        }
        int var8 = arg0 - this.field1834;
        int var9 = arg1 - this.field1840;
        if (arg4 == 1 || arg4 == 3) {
            int var10 = arg2;
            arg2 = arg3;
            arg3 = var10;
        }
        for (int var11 = var8; var11 < arg2 + var8; var11++) {
            if (var11 >= 0 && var11 < this.field1836) {
                for (int var12 = var9; var12 < arg3 + var9; var12++) {
                    if (var12 >= 0 && var12 < this.field1835) {
                        this.method2131(var11, var12, var7);
                    }
                }
            }
        }
    }

    @ObfuscatedName("dj.r(IIIB)V")
    public void method2131(int arg0, int arg1, int arg2) {
        this.field1838[arg0][arg1] &= ~arg2;
    }

    @ObfuscatedName("dj.s(III)V")
    public void method2108(int arg0, int arg1) {
        int var3 = arg0 - this.field1834;
        int var4 = arg1 - this.field1840;
        this.field1838[var3][var4] &= 0xFFFBFFFF;
    }
}
