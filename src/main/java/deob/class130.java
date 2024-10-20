package deob;

@ObfuscatedName("dc")
public class class130 {

    @ObfuscatedName("dc.z")
    public int field2038 = 0;

    @ObfuscatedName("dc.af")
    public int field2044 = 0;

    @ObfuscatedName("dc.ap")
    public int field2045;

    @ObfuscatedName("dc.ah")
    public int field2046;

    @ObfuscatedName("dc.at")
    public int[][] field2037;

    public class130(int arg0, int arg1) {
        this.field2045 = arg0;
        this.field2046 = arg1;
        this.field2037 = new int[this.field2045][this.field2046];
        this.method2725();
    }

    @ObfuscatedName("dc.p(B)V")
    public void method2725() {
        for (int var1 = 0; var1 < this.field2045; var1++) {
            for (int var2 = 0; var2 < this.field2046; var2++) {
                if (var1 == 0 || var2 == 0 || var1 >= this.field2045 - 5 || var2 >= this.field2046 - 5) {
                    this.field2037[var1][var2] = 16777215;
                } else {
                    this.field2037[var1][var2] = 16777216;
                }
            }
        }
    }

    @ObfuscatedName("dc.l(IIIIZI)V")
    public void method2740(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = arg0 - this.field2038;
        int var7 = arg1 - this.field2044;
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method2730(var6, var7, 128);
                this.method2730(var6 - 1, var7, 8);
            }
            if (arg3 == 1) {
                this.method2730(var6, var7, 2);
                this.method2730(var6, var7 + 1, 32);
            }
            if (arg3 == 2) {
                this.method2730(var6, var7, 8);
                this.method2730(var6 + 1, var7, 128);
            }
            if (arg3 == 3) {
                this.method2730(var6, var7, 32);
                this.method2730(var6, var7 - 1, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method2730(var6, var7, 1);
                this.method2730(var6 - 1, var7 + 1, 16);
            }
            if (arg3 == 1) {
                this.method2730(var6, var7, 4);
                this.method2730(var6 + 1, var7 + 1, 64);
            }
            if (arg3 == 2) {
                this.method2730(var6, var7, 16);
                this.method2730(var6 + 1, var7 - 1, 1);
            }
            if (arg3 == 3) {
                this.method2730(var6, var7, 64);
                this.method2730(var6 - 1, var7 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg3 == 0) {
                this.method2730(var6, var7, 130);
                this.method2730(var6 - 1, var7, 8);
                this.method2730(var6, var7 + 1, 32);
            }
            if (arg3 == 1) {
                this.method2730(var6, var7, 10);
                this.method2730(var6, var7 + 1, 32);
                this.method2730(var6 + 1, var7, 128);
            }
            if (arg3 == 2) {
                this.method2730(var6, var7, 40);
                this.method2730(var6 + 1, var7, 128);
                this.method2730(var6, var7 - 1, 2);
            }
            if (arg3 == 3) {
                this.method2730(var6, var7, 160);
                this.method2730(var6, var7 - 1, 2);
                this.method2730(var6 - 1, var7, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method2730(var6, var7, 65536);
                this.method2730(var6 - 1, var7, 4096);
            }
            if (arg3 == 1) {
                this.method2730(var6, var7, 1024);
                this.method2730(var6, var7 + 1, 16384);
            }
            if (arg3 == 2) {
                this.method2730(var6, var7, 4096);
                this.method2730(var6 + 1, var7, 65536);
            }
            if (arg3 == 3) {
                this.method2730(var6, var7, 16384);
                this.method2730(var6, var7 - 1, 1024);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method2730(var6, var7, 512);
                this.method2730(var6 - 1, var7 + 1, 8192);
            }
            if (arg3 == 1) {
                this.method2730(var6, var7, 2048);
                this.method2730(var6 + 1, var7 + 1, 32768);
            }
            if (arg3 == 2) {
                this.method2730(var6, var7, 8192);
                this.method2730(var6 + 1, var7 - 1, 512);
            }
            if (arg3 == 3) {
                this.method2730(var6, var7, 32768);
                this.method2730(var6 - 1, var7 - 1, 2048);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method2730(var6, var7, 66560);
            this.method2730(var6 - 1, var7, 4096);
            this.method2730(var6, var7 + 1, 16384);
        }
        if (arg3 == 1) {
            this.method2730(var6, var7, 5120);
            this.method2730(var6, var7 + 1, 16384);
            this.method2730(var6 + 1, var7, 65536);
        }
        if (arg3 == 2) {
            this.method2730(var6, var7, 20480);
            this.method2730(var6 + 1, var7, 65536);
            this.method2730(var6, var7 - 1, 1024);
        }
        if (arg3 == 3) {
            this.method2730(var6, var7, 81920);
            this.method2730(var6, var7 - 1, 1024);
            this.method2730(var6 - 1, var7, 4096);
        }
    }

    @ObfuscatedName("dc.d(IIIIZI)V")
    public void method2727(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = 256;
        if (arg4) {
            var6 += 131072;
        }
        int var7 = arg0 - this.field2038;
        int var8 = arg1 - this.field2044;
        for (int var9 = var7; var9 < arg2 + var7; var9++) {
            if (var9 >= 0 && var9 < this.field2045) {
                for (int var10 = var8; var10 < arg3 + var8; var10++) {
                    if (var10 >= 0 && var10 < this.field2046) {
                        this.method2730(var9, var10, var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("dc.x(III)V")
    public void method2728(int arg0, int arg1) {
        int var3 = arg0 - this.field2038;
        int var4 = arg1 - this.field2044;
        this.field2037[var3][var4] |= 0x200000;
    }

    @ObfuscatedName("dc.o(III)V")
    public void method2729(int arg0, int arg1) {
        int var3 = arg0 - this.field2038;
        int var4 = arg1 - this.field2044;
        this.field2037[var3][var4] |= 0x40000;
    }

    @ObfuscatedName("dc.a(IIII)V")
    public void method2730(int arg0, int arg1, int arg2) {
        this.field2037[arg0][arg1] |= arg2;
    }

    @ObfuscatedName("dc.w(IIIIZI)V")
    public void method2731(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = arg0 - this.field2038;
        int var7 = arg1 - this.field2044;
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method2733(var6, var7, 128);
                this.method2733(var6 - 1, var7, 8);
            }
            if (arg3 == 1) {
                this.method2733(var6, var7, 2);
                this.method2733(var6, var7 + 1, 32);
            }
            if (arg3 == 2) {
                this.method2733(var6, var7, 8);
                this.method2733(var6 + 1, var7, 128);
            }
            if (arg3 == 3) {
                this.method2733(var6, var7, 32);
                this.method2733(var6, var7 - 1, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method2733(var6, var7, 1);
                this.method2733(var6 - 1, var7 + 1, 16);
            }
            if (arg3 == 1) {
                this.method2733(var6, var7, 4);
                this.method2733(var6 + 1, var7 + 1, 64);
            }
            if (arg3 == 2) {
                this.method2733(var6, var7, 16);
                this.method2733(var6 + 1, var7 - 1, 1);
            }
            if (arg3 == 3) {
                this.method2733(var6, var7, 64);
                this.method2733(var6 - 1, var7 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg3 == 0) {
                this.method2733(var6, var7, 130);
                this.method2733(var6 - 1, var7, 8);
                this.method2733(var6, var7 + 1, 32);
            }
            if (arg3 == 1) {
                this.method2733(var6, var7, 10);
                this.method2733(var6, var7 + 1, 32);
                this.method2733(var6 + 1, var7, 128);
            }
            if (arg3 == 2) {
                this.method2733(var6, var7, 40);
                this.method2733(var6 + 1, var7, 128);
                this.method2733(var6, var7 - 1, 2);
            }
            if (arg3 == 3) {
                this.method2733(var6, var7, 160);
                this.method2733(var6, var7 - 1, 2);
                this.method2733(var6 - 1, var7, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method2733(var6, var7, 65536);
                this.method2733(var6 - 1, var7, 4096);
            }
            if (arg3 == 1) {
                this.method2733(var6, var7, 1024);
                this.method2733(var6, var7 + 1, 16384);
            }
            if (arg3 == 2) {
                this.method2733(var6, var7, 4096);
                this.method2733(var6 + 1, var7, 65536);
            }
            if (arg3 == 3) {
                this.method2733(var6, var7, 16384);
                this.method2733(var6, var7 - 1, 1024);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method2733(var6, var7, 512);
                this.method2733(var6 - 1, var7 + 1, 8192);
            }
            if (arg3 == 1) {
                this.method2733(var6, var7, 2048);
                this.method2733(var6 + 1, var7 + 1, 32768);
            }
            if (arg3 == 2) {
                this.method2733(var6, var7, 8192);
                this.method2733(var6 + 1, var7 - 1, 512);
            }
            if (arg3 == 3) {
                this.method2733(var6, var7, 32768);
                this.method2733(var6 - 1, var7 - 1, 2048);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method2733(var6, var7, 66560);
            this.method2733(var6 - 1, var7, 4096);
            this.method2733(var6, var7 + 1, 16384);
        }
        if (arg3 == 1) {
            this.method2733(var6, var7, 5120);
            this.method2733(var6, var7 + 1, 16384);
            this.method2733(var6 + 1, var7, 65536);
        }
        if (arg3 == 2) {
            this.method2733(var6, var7, 20480);
            this.method2733(var6 + 1, var7, 65536);
            this.method2733(var6, var7 - 1, 1024);
        }
        if (arg3 == 3) {
            this.method2733(var6, var7, 81920);
            this.method2733(var6, var7 - 1, 1024);
            this.method2733(var6 - 1, var7, 4096);
        }
    }

    @ObfuscatedName("dc.i(IIIIIZI)V")
    public void method2735(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = 256;
        if (arg5) {
            var7 += 131072;
        }
        int var8 = arg0 - this.field2038;
        int var9 = arg1 - this.field2044;
        if (arg4 == 1 || arg4 == 3) {
            int var10 = arg2;
            arg2 = arg3;
            arg3 = var10;
        }
        for (int var11 = var8; var11 < arg2 + var8; var11++) {
            if (var11 >= 0 && var11 < this.field2045) {
                for (int var12 = var9; var12 < arg3 + var9; var12++) {
                    if (var12 >= 0 && var12 < this.field2046) {
                        this.method2733(var11, var12, var7);
                    }
                }
            }
        }
    }

    @ObfuscatedName("dc.y(IIII)V")
    public void method2733(int arg0, int arg1, int arg2) {
        this.field2037[arg0][arg1] &= ~arg2;
    }

    @ObfuscatedName("dc.m(III)V")
    public void method2734(int arg0, int arg1) {
        int var3 = arg0 - this.field2038;
        int var4 = arg1 - this.field2044;
        this.field2037[var3][var4] &= 0xFFFBFFFF;
    }
}
