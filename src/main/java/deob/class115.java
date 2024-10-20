package deob;

@ObfuscatedName("dj")
public class class115 {

    @ObfuscatedName("dj.t")
    public boolean field1361;

    @ObfuscatedName("dj.v")
    public boolean field1362;

    @ObfuscatedName("dj.j")
    public long field1371;

    @ObfuscatedName("dj.l")
    public int field1364 = 0;

    @ObfuscatedName("dj.n")
    public String field1368 = null;

    @ObfuscatedName("dj.w")
    public int field1365 = 0;

    @ObfuscatedName("dj.f")
    public boolean field1367;

    @ObfuscatedName("dj.o")
    public byte field1360;

    @ObfuscatedName("dj.x")
    public byte field1369;

    @ObfuscatedName("dj.r")
    public byte field1370;

    @ObfuscatedName("dj.p")
    public byte field1384;

    @ObfuscatedName("dj.h")
    public int field1372;

    @ObfuscatedName("dj.k")
    public long[] field1366;

    @ObfuscatedName("dj.a")
    public byte[] field1374;

    @ObfuscatedName("dj.q")
    public int[] field1375;

    @ObfuscatedName("dj.u")
    public int[] field1376;

    @ObfuscatedName("dj.e")
    public int[] field1377;

    @ObfuscatedName("dj.c")
    public boolean[] field1378;

    @ObfuscatedName("dj.i")
    public int field1379 = -1;

    @ObfuscatedName("dj.m")
    public int field1380 = -1;

    @ObfuscatedName("dj.b")
    public int field1381;

    @ObfuscatedName("dj.z")
    public long[] field1382;

    @ObfuscatedName("dj.d")
    public String[] field1373;

    @ObfuscatedName("dj.y")
    public String[] field1363;

    @ObfuscatedName("dj.g")
    public class363 field1385;

    public class115(class385 arg0) {
        this.method2167(arg0);
    }

    @ObfuscatedName("dj.s(IB)V")
    public void method2150(int arg0) {
        if (this.field1361) {
            if (this.field1366 == null) {
                this.field1366 = new long[arg0];
            } else {
                System.arraycopy(this.field1366, 0, this.field1366 = new long[arg0], 0, this.field1372);
            }
        }
        if (this.field1362) {
            if (this.field1373 == null) {
                this.field1373 = new String[arg0];
            } else {
                System.arraycopy(this.field1373, 0, this.field1373 = new String[arg0], 0, this.field1372);
            }
        }
        if (this.field1374 == null) {
            this.field1374 = new byte[arg0];
        } else {
            System.arraycopy(this.field1374, 0, this.field1374 = new byte[arg0], 0, this.field1372);
        }
        if (this.field1376 == null) {
            this.field1376 = new int[arg0];
        } else {
            System.arraycopy(this.field1376, 0, this.field1376 = new int[arg0], 0, this.field1372);
        }
        if (this.field1377 == null) {
            this.field1377 = new int[arg0];
        } else {
            System.arraycopy(this.field1377, 0, this.field1377 = new int[arg0], 0, this.field1372);
        }
        if (this.field1378 == null) {
            this.field1378 = new boolean[arg0];
        } else {
            System.arraycopy(this.field1378, 0, this.field1378 = new boolean[arg0], 0, this.field1372);
        }
    }

    @ObfuscatedName("dj.t(II)V")
    public void method2151(int arg0) {
        if (this.field1361) {
            if (this.field1382 == null) {
                this.field1382 = new long[arg0];
            } else {
                System.arraycopy(this.field1382, 0, this.field1382 = new long[arg0], 0, this.field1381);
            }
        }
        if (!this.field1362) {
            return;
        }
        if (this.field1363 == null) {
            this.field1363 = new String[arg0];
        } else {
            System.arraycopy(this.field1363, 0, this.field1363 = new String[arg0], 0, this.field1381);
        }
    }

    @ObfuscatedName("dj.v(Ljava/lang/String;B)I")
    public int method2152(String arg0) {
        if (arg0 == null || arg0.length() == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < this.field1372; var2++) {
            if (this.field1373[var2].equals(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("dj.j(IIIB)I")
    public int method2170(int arg0, int arg1, int arg2) {
        int var4 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
        return (this.field1376[arg0] & var4) >>> arg1;
    }

    @ObfuscatedName("dj.l(II)Ljava/lang/Integer;")
    public Integer method2173(int arg0) {
        if (this.field1385 == null) {
            return null;
        } else {
            class354 var2 = this.field1385.method5726((long) arg0);
            return var2 != null && var2 instanceof class353 ? Integer.valueOf(((class353) var2).field3964) : null;
        }
    }

    @ObfuscatedName("dj.n(I)[I")
    public int[] method2154() {
        if (this.field1375 == null) {
            String[] var1 = new String[this.field1372];
            this.field1375 = new int[this.field1372];
            int var2 = 0;
            while (var2 < this.field1372) {
                var1[var2] = this.field1373[var2];
                if (var1[var2] != null) {
                    var1[var2] = var1[var2].toLowerCase();
                }
                this.field1375[var2] = var2++;
            }
            class380.method4586(var1, this.field1375);
        }
        return this.field1375;
    }

    @ObfuscatedName("dj.w(JLjava/lang/String;II)V")
    public void method2156(long arg0, String arg1, int arg2) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (arg0 > 0L != this.field1361) {
            throw new RuntimeException("");
        } else if (arg1 != null == this.field1362) {
            if (arg0 > 0L && (this.field1366 == null || this.field1372 >= this.field1366.length) || arg1 != null && (this.field1373 == null || this.field1372 >= this.field1373.length)) {
                this.method2150(this.field1372 + 5);
            }
            if (this.field1366 != null) {
                this.field1366[this.field1372] = arg0;
            }
            if (this.field1373 != null) {
                this.field1373[this.field1372] = arg1;
            }
            if (this.field1379 == -1) {
                this.field1379 = this.field1372;
                this.field1374[this.field1372] = 126;
            } else {
                this.field1374[this.field1372] = 0;
            }
            this.field1376[this.field1372] = 0;
            this.field1377[this.field1372] = arg2;
            this.field1378[this.field1372] = false;
            this.field1372++;
            this.field1375 = null;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("dj.f(IS)V")
    public void method2157(int arg0) {
        if (arg0 < 0 || arg0 >= this.field1372) {
            throw new RuntimeException("");
        }
        this.field1372--;
        this.field1375 = null;
        if (this.field1372 == 0) {
            this.field1366 = null;
            this.field1373 = null;
            this.field1374 = null;
            this.field1376 = null;
            this.field1377 = null;
            this.field1378 = null;
            this.field1379 = -1;
            this.field1380 = -1;
            return;
        }
        System.arraycopy(this.field1374, arg0 + 1, this.field1374, arg0, this.field1372 - arg0);
        System.arraycopy(this.field1376, arg0 + 1, this.field1376, arg0, this.field1372 - arg0);
        System.arraycopy(this.field1377, arg0 + 1, this.field1377, arg0, this.field1372 - arg0);
        System.arraycopy(this.field1378, arg0 + 1, this.field1378, arg0, this.field1372 - arg0);
        if (this.field1366 != null) {
            System.arraycopy(this.field1366, arg0 + 1, this.field1366, arg0, this.field1372 - arg0);
        }
        if (this.field1373 != null) {
            System.arraycopy(this.field1373, arg0 + 1, this.field1373, arg0, this.field1372 - arg0);
        }
        this.method2158();
    }

    @ObfuscatedName("dj.o(B)V")
    public void method2158() {
        if (this.field1372 == 0) {
            this.field1379 = -1;
            this.field1380 = -1;
            return;
        }
        this.field1379 = -1;
        this.field1380 = -1;
        int var1 = 0;
        byte var2 = this.field1374[0];
        for (int var3 = 1; var3 < this.field1372; var3++) {
            if (this.field1374[var3] > var2) {
                if (var2 == 125) {
                    this.field1380 = var1;
                }
                var1 = var3;
                var2 = this.field1374[var3];
            } else if (this.field1380 == -1 && this.field1374[var3] == 125) {
                this.field1380 = var3;
            }
        }
        this.field1379 = var1;
        if (this.field1379 != -1) {
            this.field1374[this.field1379] = 126;
        }
    }

    @ObfuscatedName("dj.x(JLjava/lang/String;I)V")
    public void method2159(long arg0, String arg1) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (arg0 > 0L != this.field1361) {
            throw new RuntimeException("");
        } else if (arg1 != null == this.field1362) {
            if (arg0 > 0L && (this.field1382 == null || this.field1381 >= this.field1382.length) || arg1 != null && (this.field1363 == null || this.field1381 >= this.field1363.length)) {
                this.method2151(this.field1381 + 5);
            }
            if (this.field1382 != null) {
                this.field1382[this.field1381] = arg0;
            }
            if (this.field1363 != null) {
                this.field1363[this.field1381] = arg1;
            }
            this.field1381++;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("dj.r(II)V")
    public void method2160(int arg0) {
        this.field1381--;
        if (this.field1381 == 0) {
            this.field1382 = null;
            this.field1363 = null;
            return;
        }
        if (this.field1382 != null) {
            System.arraycopy(this.field1382, arg0 + 1, this.field1382, arg0, this.field1381 - arg0);
        }
        if (this.field1363 != null) {
            System.arraycopy(this.field1363, arg0 + 1, this.field1363, arg0, this.field1381 - arg0);
        }
    }

    @ObfuscatedName("dj.p(IBB)I")
    public int method2161(int arg0, byte arg1) {
        if (arg1 == 126 || arg1 == 127) {
            return -1;
        } else if (this.field1379 == arg0 && (this.field1380 == -1 || this.field1374[this.field1380] < 125)) {
            return -1;
        } else if (this.field1374[arg0] == arg1) {
            return -1;
        } else {
            this.field1374[arg0] = arg1;
            this.method2158();
            return arg0;
        }
    }

    @ObfuscatedName("dj.h(II)Z")
    public boolean method2162(int arg0) {
        if (this.field1379 == arg0 || this.field1374[arg0] == 126) {
            return false;
        }
        this.field1374[this.field1379] = 125;
        this.field1380 = this.field1379;
        this.field1374[arg0] = 126;
        this.field1379 = arg0;
        return true;
    }

    @ObfuscatedName("dj.k(IZI)I")
    public int method2163(int arg0, boolean arg1) {
        if (this.field1378[arg0] == arg1) {
            return -1;
        } else {
            this.field1378[arg0] = arg1;
            return arg0;
        }
    }

    @ObfuscatedName("dj.a(IIIII)I")
    public int method2164(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        int var10 = this.field1376[arg0];
        if ((var10 & var7) == var9) {
            return -1;
        } else {
            int var11 = var10 & ~var7;
            this.field1376[arg0] = var11 | var9;
            return arg0;
        }
    }

    @ObfuscatedName("dj.q(IIB)Z")
    public boolean method2165(int arg0, int arg1) {
        if (this.field1385 == null) {
            this.field1385 = new class363(4);
        } else {
            class354 var3 = this.field1385.method5726((long) arg0);
            if (var3 != null) {
                if (var3 instanceof class353) {
                    class353 var4 = (class353) var3;
                    if (var4.field3964 == arg1) {
                        return false;
                    }
                    var4.field3964 = arg1;
                    return true;
                }
                var3.method5447();
            }
        }
        this.field1385.method5737(new class353(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("dj.u(IIIIB)Z")
    public boolean method2166(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        if (this.field1385 == null) {
            this.field1385 = new class363(4);
        } else {
            class354 var10 = this.field1385.method5726((long) arg0);
            if (var10 != null) {
                if (var10 instanceof class353) {
                    class353 var11 = (class353) var10;
                    if ((var11.field3964 & var7) == var9) {
                        return false;
                    }
                    var11.field3964 &= ~var7;
                    var11.field3964 |= var9;
                    return true;
                }
                var10.method5447();
            }
        }
        this.field1385.method5737(new class353(var9), (long) arg0);
        return true;
    }

    @ObfuscatedName("dj.e(IJ)Z")
    public boolean method2194(int arg0, long arg1) {
        if (this.field1385 == null) {
            this.field1385 = new class363(4);
        } else {
            class354 var4 = this.field1385.method5726((long) arg0);
            if (var4 != null) {
                if (var4 instanceof class352) {
                    class352 var5 = (class352) var4;
                    if (var5.field3963 == arg1) {
                        return false;
                    }
                    var5.field3963 = arg1;
                    return true;
                }
                var4.method5447();
            }
        }
        this.field1385.method5737(new class352(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("dj.c(ILjava/lang/String;I)Z")
    public boolean method2171(int arg0, String arg1) {
        if (arg1 == null) {
            arg1 = "";
        } else if (arg1.length() > 80) {
            arg1 = arg1.substring(0, 80);
        }
        if (this.field1385 == null) {
            this.field1385 = new class363(4);
        } else {
            class354 var3 = this.field1385.method5726((long) arg0);
            if (var3 != null) {
                if (var3 instanceof class350) {
                    class350 var4 = (class350) var3;
                    if (var4.field3961 instanceof String) {
                        if (arg1.equals(var4.field3961)) {
                            return false;
                        }
                        var4.method5447();
                        this.field1385.method5737(new class350(arg1), var4.field3966);
                        return true;
                    }
                }
                var3.method5447();
            }
        }
        this.field1385.method5737(new class350(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("dj.i(Lnv;I)V")
    public void method2167(class385 arg0) {
        int var2 = arg0.method5958();
        if (var2 < 1 || var2 > 6) {
            throw new RuntimeException("" + var2);
        }
        int var3 = arg0.method5958();
        if ((var3 & 0x1) != 0) {
            this.field1361 = true;
        }
        if ((var3 & 0x2) != 0) {
            this.field1362 = true;
        }
        if (!this.field1361) {
            this.field1366 = null;
            this.field1382 = null;
        }
        if (!this.field1362) {
            this.field1373 = null;
            this.field1363 = null;
        }
        this.field1364 = arg0.method6182();
        this.field1365 = arg0.method6182();
        if (var2 <= 3 && this.field1365 != 0) {
            this.field1365 += 16912800;
        }
        this.field1372 = arg0.method6053();
        this.field1381 = arg0.method5958();
        this.field1368 = arg0.method5967();
        if (var2 >= 4) {
            arg0.method6182();
        }
        this.field1367 = arg0.method5958() == 1;
        this.field1360 = arg0.method5959();
        this.field1369 = arg0.method5959();
        this.field1370 = arg0.method5959();
        this.field1384 = arg0.method5959();
        if (this.field1372 > 0) {
            if (this.field1361 && (this.field1366 == null || this.field1366.length < this.field1372)) {
                this.field1366 = new long[this.field1372];
            }
            if (this.field1362 && (this.field1373 == null || this.field1373.length < this.field1372)) {
                this.field1373 = new String[this.field1372];
            }
            if (this.field1374 == null || this.field1374.length < this.field1372) {
                this.field1374 = new byte[this.field1372];
            }
            if (this.field1376 == null || this.field1376.length < this.field1372) {
                this.field1376 = new int[this.field1372];
            }
            if (this.field1377 == null || this.field1377.length < this.field1372) {
                this.field1377 = new int[this.field1372];
            }
            if (this.field1378 == null || this.field1378.length < this.field1372) {
                this.field1378 = new boolean[this.field1372];
            }
            for (int var4 = 0; var4 < this.field1372; var4++) {
                if (this.field1361) {
                    this.field1366[var4] = arg0.method5964();
                }
                if (this.field1362) {
                    this.field1373[var4] = arg0.method5966();
                }
                this.field1374[var4] = arg0.method5959();
                if (var2 >= 2) {
                    this.field1376[var4] = arg0.method6182();
                }
                if (var2 >= 5) {
                    this.field1377[var4] = arg0.method6053();
                } else {
                    this.field1377[var4] = 0;
                }
                if (var2 >= 6) {
                    this.field1378[var4] = arg0.method5958() == 1;
                } else {
                    this.field1378[var4] = false;
                }
            }
            this.method2158();
        }
        if (this.field1381 > 0) {
            if (this.field1361 && (this.field1382 == null || this.field1382.length < this.field1381)) {
                this.field1382 = new long[this.field1381];
            }
            if (this.field1362 && (this.field1363 == null || this.field1363.length < this.field1381)) {
                this.field1363 = new String[this.field1381];
            }
            for (int var5 = 0; var5 < this.field1381; var5++) {
                if (this.field1361) {
                    this.field1382[var5] = arg0.method5964();
                }
                if (this.field1362) {
                    this.field1363[var5] = arg0.method5966();
                }
            }
        }
        if (var2 < 3) {
            return;
        }
        int var6 = arg0.method6053();
        if (var6 <= 0) {
            return;
        }
        this.field1385 = new class363(var6 < 16 ? class233.method506(var6) : 16);
        while (var6-- > 0) {
            int var7 = arg0.method6182();
            int var8 = var7 & 0x3FFFFFFF;
            int var9 = var7 >>> 30;
            if (var9 == 0) {
                int var10 = arg0.method6182();
                this.field1385.method5737(new class353(var10), (long) var8);
            } else if (var9 == 1) {
                long var11 = arg0.method5964();
                this.field1385.method5737(new class352(var11), (long) var8);
            } else if (var9 == 2) {
                String var13 = arg0.method5967();
                this.field1385.method5737(new class350(var13), (long) var8);
            }
        }
    }
}
