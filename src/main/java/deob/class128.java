package deob;

@ObfuscatedName("dm")
public class class128 {

    @ObfuscatedName("dm.w")
    public boolean field1438;

    @ObfuscatedName("dm.s")
    public boolean field1464;

    @ObfuscatedName("dm.a")
    public long field1457;

    @ObfuscatedName("dm.o")
    public int field1466 = 0;

    @ObfuscatedName("dm.g")
    public String field1442 = null;

    @ObfuscatedName("dm.e")
    public int field1443 = 0;

    @ObfuscatedName("dm.p")
    public boolean field1444;

    @ObfuscatedName("dm.j")
    public byte field1445;

    @ObfuscatedName("dm.b")
    public byte field1440;

    @ObfuscatedName("dm.x")
    public byte field1447;

    @ObfuscatedName("dm.y")
    public byte field1448;

    @ObfuscatedName("dm.k")
    public int field1449;

    @ObfuscatedName("dm.t")
    public long[] field1450;

    @ObfuscatedName("dm.l")
    public byte[] field1451;

    @ObfuscatedName("dm.u")
    public int[] field1452;

    @ObfuscatedName("dm.n")
    public int[] field1453;

    @ObfuscatedName("dm.z")
    public int[] field1454;

    @ObfuscatedName("dm.q")
    public boolean[] field1455;

    @ObfuscatedName("dm.d")
    public int field1437 = -1;

    @ObfuscatedName("dm.r")
    public int field1439 = -1;

    @ObfuscatedName("dm.m")
    public int field1458;

    @ObfuscatedName("dm.c")
    public long[] field1459;

    @ObfuscatedName("dm.f")
    public String[] field1460;

    @ObfuscatedName("dm.h")
    public String[] field1461;

    @ObfuscatedName("dm.v")
    public class379 field1462;

    public class128(class401 arg0) {
        this.method2497(arg0);
    }

    @ObfuscatedName("dm.i(IB)V")
    public void method2432(int arg0) {
        if (this.field1438) {
            if (this.field1450 == null) {
                this.field1450 = new long[arg0];
            } else {
                System.arraycopy(this.field1450, 0, this.field1450 = new long[arg0], 0, this.field1449);
            }
        }
        if (this.field1464) {
            if (this.field1460 == null) {
                this.field1460 = new String[arg0];
            } else {
                System.arraycopy(this.field1460, 0, this.field1460 = new String[arg0], 0, this.field1449);
            }
        }
        if (this.field1451 == null) {
            this.field1451 = new byte[arg0];
        } else {
            System.arraycopy(this.field1451, 0, this.field1451 = new byte[arg0], 0, this.field1449);
        }
        if (this.field1453 == null) {
            this.field1453 = new int[arg0];
        } else {
            System.arraycopy(this.field1453, 0, this.field1453 = new int[arg0], 0, this.field1449);
        }
        if (this.field1454 == null) {
            this.field1454 = new int[arg0];
        } else {
            System.arraycopy(this.field1454, 0, this.field1454 = new int[arg0], 0, this.field1449);
        }
        if (this.field1455 == null) {
            this.field1455 = new boolean[arg0];
        } else {
            System.arraycopy(this.field1455, 0, this.field1455 = new boolean[arg0], 0, this.field1449);
        }
    }

    @ObfuscatedName("dm.w(II)V")
    public void method2493(int arg0) {
        if (this.field1438) {
            if (this.field1459 == null) {
                this.field1459 = new long[arg0];
            } else {
                System.arraycopy(this.field1459, 0, this.field1459 = new long[arg0], 0, this.field1458);
            }
        }
        if (!this.field1464) {
            return;
        }
        if (this.field1461 == null) {
            this.field1461 = new String[arg0];
        } else {
            System.arraycopy(this.field1461, 0, this.field1461 = new String[arg0], 0, this.field1458);
        }
    }

    @ObfuscatedName("dm.s(Ljava/lang/String;B)I")
    public int method2431(String arg0) {
        if (arg0 == null || arg0.length() == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < this.field1449; var2++) {
            if (this.field1460[var2].equals(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("dm.a(IIIB)I")
    public int method2434(int arg0, int arg1, int arg2) {
        int var4 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
        return (this.field1453[arg0] & var4) >>> arg1;
    }

    @ObfuscatedName("dm.o(II)Ljava/lang/Integer;")
    public Integer method2452(int arg0) {
        if (this.field1462 == null) {
            return null;
        } else {
            class370 var2 = this.field1462.method6009((long) arg0);
            return var2 != null && var2 instanceof class369 ? Integer.valueOf(((class369) var2).field4073) : null;
        }
    }

    @ObfuscatedName("dm.g(I)[I")
    public int[] method2479() {
        if (this.field1452 == null) {
            String[] var1 = new String[this.field1449];
            this.field1452 = new int[this.field1449];
            int var2 = 0;
            while (var2 < this.field1449) {
                var1[var2] = this.field1460[var2];
                if (var1[var2] != null) {
                    var1[var2] = var1[var2].toLowerCase();
                }
                this.field1452[var2] = var2++;
            }
            class396.method5622(var1, this.field1452);
        }
        return this.field1452;
    }

    @ObfuscatedName("dm.e(JLjava/lang/String;IB)V")
    public void method2437(long arg0, String arg1, int arg2) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (arg0 > 0L != this.field1438) {
            throw new RuntimeException("");
        } else if (arg1 != null == this.field1464) {
            if (arg0 > 0L && (this.field1450 == null || this.field1449 >= this.field1450.length) || arg1 != null && (this.field1460 == null || this.field1449 >= this.field1460.length)) {
                this.method2432(this.field1449 + 5);
            }
            if (this.field1450 != null) {
                this.field1450[this.field1449] = arg0;
            }
            if (this.field1460 != null) {
                this.field1460[this.field1449] = arg1;
            }
            if (this.field1437 == -1) {
                this.field1437 = this.field1449;
                this.field1451[this.field1449] = 126;
            } else {
                this.field1451[this.field1449] = 0;
            }
            this.field1453[this.field1449] = 0;
            this.field1454[this.field1449] = arg2;
            this.field1455[this.field1449] = false;
            this.field1449++;
            this.field1452 = null;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("dm.p(II)V")
    public void method2438(int arg0) {
        if (arg0 < 0 || arg0 >= this.field1449) {
            throw new RuntimeException("");
        }
        this.field1449--;
        this.field1452 = null;
        if (this.field1449 == 0) {
            this.field1450 = null;
            this.field1460 = null;
            this.field1451 = null;
            this.field1453 = null;
            this.field1454 = null;
            this.field1455 = null;
            this.field1437 = -1;
            this.field1439 = -1;
            return;
        }
        System.arraycopy(this.field1451, arg0 + 1, this.field1451, arg0, this.field1449 - arg0);
        System.arraycopy(this.field1453, arg0 + 1, this.field1453, arg0, this.field1449 - arg0);
        System.arraycopy(this.field1454, arg0 + 1, this.field1454, arg0, this.field1449 - arg0);
        System.arraycopy(this.field1455, arg0 + 1, this.field1455, arg0, this.field1449 - arg0);
        if (this.field1450 != null) {
            System.arraycopy(this.field1450, arg0 + 1, this.field1450, arg0, this.field1449 - arg0);
        }
        if (this.field1460 != null) {
            System.arraycopy(this.field1460, arg0 + 1, this.field1460, arg0, this.field1449 - arg0);
        }
        this.method2439();
    }

    @ObfuscatedName("dm.j(B)V")
    public void method2439() {
        if (this.field1449 == 0) {
            this.field1437 = -1;
            this.field1439 = -1;
            return;
        }
        this.field1437 = -1;
        this.field1439 = -1;
        int var1 = 0;
        byte var2 = this.field1451[0];
        for (int var3 = 1; var3 < this.field1449; var3++) {
            if (this.field1451[var3] > var2) {
                if (var2 == 125) {
                    this.field1439 = var1;
                }
                var1 = var3;
                var2 = this.field1451[var3];
            } else if (this.field1439 == -1 && this.field1451[var3] == 125) {
                this.field1439 = var3;
            }
        }
        this.field1437 = var1;
        if (this.field1437 != -1) {
            this.field1451[this.field1437] = 126;
        }
    }

    @ObfuscatedName("dm.b(JLjava/lang/String;I)V")
    public void method2440(long arg0, String arg1) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (arg0 > 0L != this.field1438) {
            throw new RuntimeException("");
        } else if (this.field1464 == (arg1 != null)) {
            if (arg0 > 0L && (this.field1459 == null || this.field1458 >= this.field1459.length) || arg1 != null && (this.field1461 == null || this.field1458 >= this.field1461.length)) {
                this.method2493(this.field1458 + 5);
            }
            if (this.field1459 != null) {
                this.field1459[this.field1458] = arg0;
            }
            if (this.field1461 != null) {
                this.field1461[this.field1458] = arg1;
            }
            this.field1458++;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("dm.x(II)V")
    public void method2469(int arg0) {
        this.field1458--;
        if (this.field1458 == 0) {
            this.field1459 = null;
            this.field1461 = null;
            return;
        }
        if (this.field1459 != null) {
            System.arraycopy(this.field1459, arg0 + 1, this.field1459, arg0, this.field1458 - arg0);
        }
        if (this.field1461 != null) {
            System.arraycopy(this.field1461, arg0 + 1, this.field1461, arg0, this.field1458 - arg0);
        }
    }

    @ObfuscatedName("dm.y(IBI)I")
    public int method2455(int arg0, byte arg1) {
        if (arg1 == 126 || arg1 == 127) {
            return -1;
        } else if (this.field1437 == arg0 && (this.field1439 == -1 || this.field1451[this.field1439] < 125)) {
            return -1;
        } else if (this.field1451[arg0] == arg1) {
            return -1;
        } else {
            this.field1451[arg0] = arg1;
            this.method2439();
            return arg0;
        }
    }

    @ObfuscatedName("dm.k(II)Z")
    public boolean method2443(int arg0) {
        if (this.field1437 == arg0 || this.field1451[arg0] == 126) {
            return false;
        }
        this.field1451[this.field1437] = 125;
        this.field1439 = this.field1437;
        this.field1451[arg0] = 126;
        this.field1437 = arg0;
        return true;
    }

    @ObfuscatedName("dm.t(IZB)I")
    public int method2444(int arg0, boolean arg1) {
        if (this.field1455[arg0] == arg1) {
            return -1;
        } else {
            this.field1455[arg0] = arg1;
            return arg0;
        }
    }

    @ObfuscatedName("dm.l(IIIIB)I")
    public int method2445(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        int var10 = this.field1453[arg0];
        if ((var10 & var7) == var9) {
            return -1;
        } else {
            int var11 = var10 & ~var7;
            this.field1453[arg0] = var11 | var9;
            return arg0;
        }
    }

    @ObfuscatedName("dm.u(III)Z")
    public boolean method2446(int arg0, int arg1) {
        if (this.field1462 == null) {
            this.field1462 = new class379(4);
        } else {
            class370 var3 = this.field1462.method6009((long) arg0);
            if (var3 != null) {
                if (var3 instanceof class369) {
                    class369 var4 = (class369) var3;
                    if (var4.field4073 == arg1) {
                        return false;
                    }
                    var4.field4073 = arg1;
                    return true;
                }
                var3.method5752();
            }
        }
        this.field1462.method6010(new class369(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("dm.n(IIIIB)Z")
    public boolean method2447(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        if (this.field1462 == null) {
            this.field1462 = new class379(4);
        } else {
            class370 var10 = this.field1462.method6009((long) arg0);
            if (var10 != null) {
                if (var10 instanceof class369) {
                    class369 var11 = (class369) var10;
                    if ((var11.field4073 & var7) == var9) {
                        return false;
                    }
                    var11.field4073 &= ~var7;
                    var11.field4073 |= var9;
                    return true;
                }
                var10.method5752();
            }
        }
        this.field1462.method6010(new class369(var9), (long) arg0);
        return true;
    }

    @ObfuscatedName("dm.z(IJ)Z")
    public boolean method2448(int arg0, long arg1) {
        if (this.field1462 == null) {
            this.field1462 = new class379(4);
        } else {
            class370 var4 = this.field1462.method6009((long) arg0);
            if (var4 != null) {
                if (var4 instanceof class368) {
                    class368 var5 = (class368) var4;
                    if (var5.field4072 == arg1) {
                        return false;
                    }
                    var5.field4072 = arg1;
                    return true;
                }
                var4.method5752();
            }
        }
        this.field1462.method6010(new class368(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("dm.q(ILjava/lang/String;I)Z")
    public boolean method2449(int arg0, String arg1) {
        if (arg1 == null) {
            arg1 = "";
        } else if (arg1.length() > 80) {
            arg1 = arg1.substring(0, 80);
        }
        if (this.field1462 == null) {
            this.field1462 = new class379(4);
        } else {
            class370 var3 = this.field1462.method6009((long) arg0);
            if (var3 != null) {
                if (var3 instanceof class366) {
                    class366 var4 = (class366) var3;
                    if (var4.field4070 instanceof String) {
                        if (arg1.equals(var4.field4070)) {
                            return false;
                        }
                        var4.method5752();
                        this.field1462.method6010(new class366(arg1), var4.field4075);
                        return true;
                    }
                }
                var3.method5752();
            }
        }
        this.field1462.method6010(new class366(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("dm.d(Lop;I)V")
    public void method2497(class401 arg0) {
        int var2 = arg0.method6240();
        if (var2 < 1 || var2 > 6) {
            throw new RuntimeException("" + var2);
        }
        int var3 = arg0.method6240();
        if ((var3 & 0x1) != 0) {
            this.field1438 = true;
        }
        if ((var3 & 0x2) != 0) {
            this.field1464 = true;
        }
        if (!this.field1438) {
            this.field1450 = null;
            this.field1459 = null;
        }
        if (!this.field1464) {
            this.field1460 = null;
            this.field1461 = null;
        }
        this.field1466 = arg0.method6245();
        this.field1443 = arg0.method6245();
        if (var2 <= 3 && this.field1443 != 0) {
            this.field1443 += 16912800;
        }
        this.field1449 = arg0.method6242();
        this.field1458 = arg0.method6240();
        this.field1442 = arg0.method6335();
        if (var2 >= 4) {
            arg0.method6245();
        }
        this.field1444 = arg0.method6240() == 1;
        this.field1445 = arg0.method6241();
        this.field1440 = arg0.method6241();
        this.field1447 = arg0.method6241();
        this.field1448 = arg0.method6241();
        if (this.field1449 > 0) {
            if (this.field1438 && (this.field1450 == null || this.field1450.length < this.field1449)) {
                this.field1450 = new long[this.field1449];
            }
            if (this.field1464 && (this.field1460 == null || this.field1460.length < this.field1449)) {
                this.field1460 = new String[this.field1449];
            }
            if (this.field1451 == null || this.field1451.length < this.field1449) {
                this.field1451 = new byte[this.field1449];
            }
            if (this.field1453 == null || this.field1453.length < this.field1449) {
                this.field1453 = new int[this.field1449];
            }
            if (this.field1454 == null || this.field1454.length < this.field1449) {
                this.field1454 = new int[this.field1449];
            }
            if (this.field1455 == null || this.field1455.length < this.field1449) {
                this.field1455 = new boolean[this.field1449];
            }
            for (int var4 = 0; var4 < this.field1449; var4++) {
                if (this.field1438) {
                    this.field1450[var4] = arg0.method6249();
                }
                if (this.field1464) {
                    this.field1460[var4] = arg0.method6369();
                }
                this.field1451[var4] = arg0.method6241();
                if (var2 >= 2) {
                    this.field1453[var4] = arg0.method6245();
                }
                if (var2 >= 5) {
                    this.field1454[var4] = arg0.method6242();
                } else {
                    this.field1454[var4] = 0;
                }
                if (var2 >= 6) {
                    this.field1455[var4] = arg0.method6240() == 1;
                } else {
                    this.field1455[var4] = false;
                }
            }
            this.method2439();
        }
        if (this.field1458 > 0) {
            if (this.field1438 && (this.field1459 == null || this.field1459.length < this.field1458)) {
                this.field1459 = new long[this.field1458];
            }
            if (this.field1464 && (this.field1461 == null || this.field1461.length < this.field1458)) {
                this.field1461 = new String[this.field1458];
            }
            for (int var5 = 0; var5 < this.field1458; var5++) {
                if (this.field1438) {
                    this.field1459[var5] = arg0.method6249();
                }
                if (this.field1464) {
                    this.field1461[var5] = arg0.method6369();
                }
            }
        }
        if (var2 < 3) {
            return;
        }
        int var6 = arg0.method6242();
        if (var6 <= 0) {
            return;
        }
        int var14;
        if (var6 < 16) {
            int var7 = var6 - 1;
            int var8 = var7 | var7 >>> 1;
            int var9 = var8 | var8 >>> 2;
            int var10 = var9 | var9 >>> 4;
            int var11 = var10 | var10 >>> 8;
            int var12 = var11 | var11 >>> 16;
            int var13 = var12 + 1;
            var14 = var13;
        } else {
            var14 = 16;
        }
        this.field1462 = new class379(var14);
        while (var6-- > 0) {
            int var15 = arg0.method6245();
            int var16 = var15 & 0x3FFFFFFF;
            int var17 = var15 >>> 30;
            if (var17 == 0) {
                int var18 = arg0.method6245();
                this.field1462.method6010(new class369(var18), (long) var16);
            } else if (var17 == 1) {
                long var19 = arg0.method6249();
                this.field1462.method6010(new class368(var19), (long) var16);
            } else if (var17 == 2) {
                String var21 = arg0.method6335();
                this.field1462.method6010(new class366(var21), (long) var16);
            }
        }
    }
}
