package deob;

@ObfuscatedName("dk")
public class class128 {

    @ObfuscatedName("dk.q")
    public boolean field1444;

    @ObfuscatedName("dk.f")
    public boolean field1455;

    @ObfuscatedName("dk.j")
    public long field1447;

    @ObfuscatedName("dk.m")
    public int field1448 = 0;

    @ObfuscatedName("dk.k")
    public String field1449 = null;

    @ObfuscatedName("dk.t")
    public int field1450 = 0;

    @ObfuscatedName("dk.a")
    public boolean field1454;

    @ObfuscatedName("dk.e")
    public byte field1451;

    @ObfuscatedName("dk.i")
    public byte field1453;

    @ObfuscatedName("dk.y")
    public byte field1460;

    @ObfuscatedName("dk.w")
    public byte field1467;

    @ObfuscatedName("dk.g")
    public int field1456;

    @ObfuscatedName("dk.v")
    public long[] field1457;

    @ObfuscatedName("dk.s")
    public byte[] field1458;

    @ObfuscatedName("dk.c")
    public int[] field1466;

    @ObfuscatedName("dk.b")
    public int[] field1464;

    @ObfuscatedName("dk.x")
    public int[] field1461;

    @ObfuscatedName("dk.p")
    public boolean[] field1462;

    @ObfuscatedName("dk.z")
    public int field1463 = -1;

    @ObfuscatedName("dk.h")
    public int field1452 = -1;

    @ObfuscatedName("dk.o")
    public int field1465;

    @ObfuscatedName("dk.r")
    public long[] field1468;

    @ObfuscatedName("dk.n")
    public String[] field1469;

    @ObfuscatedName("dk.u")
    public String[] field1445;

    @ObfuscatedName("dk.d")
    public class379 field1459;

    public class128(class401 arg0) {
        this.method2430(arg0);
    }

    @ObfuscatedName("dk.l(II)V")
    public void method2411(int arg0) {
        if (this.field1444) {
            if (this.field1457 == null) {
                this.field1457 = new long[arg0];
            } else {
                System.arraycopy(this.field1457, 0, this.field1457 = new long[arg0], 0, this.field1456);
            }
        }
        if (this.field1455) {
            if (this.field1469 == null) {
                this.field1469 = new String[arg0];
            } else {
                System.arraycopy(this.field1469, 0, this.field1469 = new String[arg0], 0, this.field1456);
            }
        }
        if (this.field1458 == null) {
            this.field1458 = new byte[arg0];
        } else {
            System.arraycopy(this.field1458, 0, this.field1458 = new byte[arg0], 0, this.field1456);
        }
        if (this.field1464 == null) {
            this.field1464 = new int[arg0];
        } else {
            System.arraycopy(this.field1464, 0, this.field1464 = new int[arg0], 0, this.field1456);
        }
        if (this.field1461 == null) {
            this.field1461 = new int[arg0];
        } else {
            System.arraycopy(this.field1461, 0, this.field1461 = new int[arg0], 0, this.field1456);
        }
        if (this.field1462 == null) {
            this.field1462 = new boolean[arg0];
        } else {
            System.arraycopy(this.field1462, 0, this.field1462 = new boolean[arg0], 0, this.field1456);
        }
    }

    @ObfuscatedName("dk.q(II)V")
    public void method2431(int arg0) {
        if (this.field1444) {
            if (this.field1468 == null) {
                this.field1468 = new long[arg0];
            } else {
                System.arraycopy(this.field1468, 0, this.field1468 = new long[arg0], 0, this.field1465);
            }
        }
        if (!this.field1455) {
            return;
        }
        if (this.field1445 == null) {
            this.field1445 = new String[arg0];
        } else {
            System.arraycopy(this.field1445, 0, this.field1445 = new String[arg0], 0, this.field1465);
        }
    }

    @ObfuscatedName("dk.f(Ljava/lang/String;I)I")
    public int method2413(String arg0) {
        if (arg0 == null || arg0.length() == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < this.field1456; var2++) {
            if (this.field1469[var2].equals(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("dk.j(IIIB)I")
    public int method2414(int arg0, int arg1, int arg2) {
        int var4 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
        return (this.field1464[arg0] & var4) >>> arg1;
    }

    @ObfuscatedName("dk.m(IB)Ljava/lang/Integer;")
    public Integer method2444(int arg0) {
        if (this.field1459 == null) {
            return null;
        } else {
            class370 var2 = this.field1459.method6049((long) arg0);
            return var2 != null && var2 instanceof class369 ? Integer.valueOf(((class369) var2).field4074) : null;
        }
    }

    @ObfuscatedName("dk.k(I)[I")
    public int[] method2442() {
        if (this.field1466 == null) {
            String[] var1 = new String[this.field1456];
            this.field1466 = new int[this.field1456];
            int var2 = 0;
            while (var2 < this.field1456) {
                var1[var2] = this.field1469[var2];
                if (var1[var2] != null) {
                    var1[var2] = var1[var2].toLowerCase();
                }
                this.field1466[var2] = var2++;
            }
            int[] var3 = this.field1466;
            class396.method6024(var1, var3, 0, var1.length - 1);
        }
        return this.field1466;
    }

    @ObfuscatedName("dk.t(JLjava/lang/String;IB)V")
    public void method2475(long arg0, String arg1, int arg2) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (arg0 > 0L != this.field1444) {
            throw new RuntimeException("");
        } else if (this.field1455 == (arg1 != null)) {
            if (arg0 > 0L && (this.field1457 == null || this.field1456 >= this.field1457.length) || arg1 != null && (this.field1469 == null || this.field1456 >= this.field1469.length)) {
                this.method2411(this.field1456 + 5);
            }
            if (this.field1457 != null) {
                this.field1457[this.field1456] = arg0;
            }
            if (this.field1469 != null) {
                this.field1469[this.field1456] = arg1;
            }
            if (this.field1463 == -1) {
                this.field1463 = this.field1456;
                this.field1458[this.field1456] = 126;
            } else {
                this.field1458[this.field1456] = 0;
            }
            this.field1464[this.field1456] = 0;
            this.field1461[this.field1456] = arg2;
            this.field1462[this.field1456] = false;
            this.field1456++;
            this.field1466 = null;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("dk.a(IB)V")
    public void method2418(int arg0) {
        if (arg0 < 0 || arg0 >= this.field1456) {
            throw new RuntimeException("");
        }
        this.field1456--;
        this.field1466 = null;
        if (this.field1456 == 0) {
            this.field1457 = null;
            this.field1469 = null;
            this.field1458 = null;
            this.field1464 = null;
            this.field1461 = null;
            this.field1462 = null;
            this.field1463 = -1;
            this.field1452 = -1;
            return;
        }
        System.arraycopy(this.field1458, arg0 + 1, this.field1458, arg0, this.field1456 - arg0);
        System.arraycopy(this.field1464, arg0 + 1, this.field1464, arg0, this.field1456 - arg0);
        System.arraycopy(this.field1461, arg0 + 1, this.field1461, arg0, this.field1456 - arg0);
        System.arraycopy(this.field1462, arg0 + 1, this.field1462, arg0, this.field1456 - arg0);
        if (this.field1457 != null) {
            System.arraycopy(this.field1457, arg0 + 1, this.field1457, arg0, this.field1456 - arg0);
        }
        if (this.field1469 != null) {
            System.arraycopy(this.field1469, arg0 + 1, this.field1469, arg0, this.field1456 - arg0);
        }
        this.method2419();
    }

    @ObfuscatedName("dk.e(I)V")
    public void method2419() {
        if (this.field1456 == 0) {
            this.field1463 = -1;
            this.field1452 = -1;
            return;
        }
        this.field1463 = -1;
        this.field1452 = -1;
        int var1 = 0;
        byte var2 = this.field1458[0];
        for (int var3 = 1; var3 < this.field1456; var3++) {
            if (this.field1458[var3] > var2) {
                if (var2 == 125) {
                    this.field1452 = var1;
                }
                var1 = var3;
                var2 = this.field1458[var3];
            } else if (this.field1452 == -1 && this.field1458[var3] == 125) {
                this.field1452 = var3;
            }
        }
        this.field1463 = var1;
        if (this.field1463 != -1) {
            this.field1458[this.field1463] = 126;
        }
    }

    @ObfuscatedName("dk.i(JLjava/lang/String;I)V")
    public void method2466(long arg0, String arg1) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (this.field1444 != arg0 > 0L) {
            throw new RuntimeException("");
        } else if (arg1 != null == this.field1455) {
            if (arg0 > 0L && (this.field1468 == null || this.field1465 >= this.field1468.length) || arg1 != null && (this.field1445 == null || this.field1465 >= this.field1445.length)) {
                this.method2431(this.field1465 + 5);
            }
            if (this.field1468 != null) {
                this.field1468[this.field1465] = arg0;
            }
            if (this.field1445 != null) {
                this.field1445[this.field1465] = arg1;
            }
            this.field1465++;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("dk.y(II)V")
    public void method2421(int arg0) {
        this.field1465--;
        if (this.field1465 == 0) {
            this.field1468 = null;
            this.field1445 = null;
            return;
        }
        if (this.field1468 != null) {
            System.arraycopy(this.field1468, arg0 + 1, this.field1468, arg0, this.field1465 - arg0);
        }
        if (this.field1445 != null) {
            System.arraycopy(this.field1445, arg0 + 1, this.field1445, arg0, this.field1465 - arg0);
        }
    }

    @ObfuscatedName("dk.w(IBS)I")
    public int method2448(int arg0, byte arg1) {
        if (arg1 == 126 || arg1 == 127) {
            return -1;
        } else if (this.field1463 == arg0 && (this.field1452 == -1 || this.field1458[this.field1452] < 125)) {
            return -1;
        } else if (this.field1458[arg0] == arg1) {
            return -1;
        } else {
            this.field1458[arg0] = arg1;
            this.method2419();
            return arg0;
        }
    }

    @ObfuscatedName("dk.g(II)Z")
    public boolean method2423(int arg0) {
        if (this.field1463 == arg0 || this.field1458[arg0] == 126) {
            return false;
        }
        this.field1458[this.field1463] = 125;
        this.field1452 = this.field1463;
        this.field1458[arg0] = 126;
        this.field1463 = arg0;
        return true;
    }

    @ObfuscatedName("dk.v(IZI)I")
    public int method2424(int arg0, boolean arg1) {
        if (this.field1462[arg0] == arg1) {
            return -1;
        } else {
            this.field1462[arg0] = arg1;
            return arg0;
        }
    }

    @ObfuscatedName("dk.s(IIIIB)I")
    public int method2425(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        int var10 = this.field1464[arg0];
        if ((var10 & var7) == var9) {
            return -1;
        } else {
            int var11 = var10 & ~var7;
            this.field1464[arg0] = var11 | var9;
            return arg0;
        }
    }

    @ObfuscatedName("dk.c(III)Z")
    public boolean method2426(int arg0, int arg1) {
        if (this.field1459 == null) {
            this.field1459 = new class379(4);
        } else {
            class370 var3 = this.field1459.method6049((long) arg0);
            if (var3 != null) {
                if (var3 instanceof class369) {
                    class369 var4 = (class369) var3;
                    if (var4.field4074 == arg1) {
                        return false;
                    }
                    var4.field4074 = arg1;
                    return true;
                }
                var3.method5775();
            }
        }
        this.field1459.method6043(new class369(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("dk.b(IIIII)Z")
    public boolean method2427(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        if (this.field1459 == null) {
            this.field1459 = new class379(4);
        } else {
            class370 var10 = this.field1459.method6049((long) arg0);
            if (var10 != null) {
                if (var10 instanceof class369) {
                    class369 var11 = (class369) var10;
                    if ((var11.field4074 & var7) == var9) {
                        return false;
                    }
                    var11.field4074 &= ~var7;
                    var11.field4074 |= var9;
                    return true;
                }
                var10.method5775();
            }
        }
        this.field1459.method6043(new class369(var9), (long) arg0);
        return true;
    }

    @ObfuscatedName("dk.x(IJ)Z")
    public boolean method2428(int arg0, long arg1) {
        if (this.field1459 == null) {
            this.field1459 = new class379(4);
        } else {
            class370 var4 = this.field1459.method6049((long) arg0);
            if (var4 != null) {
                if (var4 instanceof class368) {
                    class368 var5 = (class368) var4;
                    if (var5.field4073 == arg1) {
                        return false;
                    }
                    var5.field4073 = arg1;
                    return true;
                }
                var4.method5775();
            }
        }
        this.field1459.method6043(new class368(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("dk.p(ILjava/lang/String;I)Z")
    public boolean method2443(int arg0, String arg1) {
        if (arg1 == null) {
            arg1 = "";
        } else if (arg1.length() > 80) {
            arg1 = arg1.substring(0, 80);
        }
        if (this.field1459 == null) {
            this.field1459 = new class379(4);
        } else {
            class370 var3 = this.field1459.method6049((long) arg0);
            if (var3 != null) {
                if (var3 instanceof class366) {
                    class366 var4 = (class366) var3;
                    if (var4.field4071 instanceof String) {
                        if (arg1.equals(var4.field4071)) {
                            return false;
                        }
                        var4.method5775();
                        this.field1459.method6043(new class366(arg1), var4.field4075);
                        return true;
                    }
                }
                var3.method5775();
            }
        }
        this.field1459.method6043(new class366(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("dk.z(Lot;I)V")
    public void method2430(class401 arg0) {
        int var2 = arg0.method6272();
        if (var2 < 1 || var2 > 6) {
            throw new RuntimeException("" + var2);
        }
        int var3 = arg0.method6272();
        if ((var3 & 0x1) != 0) {
            this.field1444 = true;
        }
        if ((var3 & 0x2) != 0) {
            this.field1455 = true;
        }
        if (!this.field1444) {
            this.field1457 = null;
            this.field1468 = null;
        }
        if (!this.field1455) {
            this.field1469 = null;
            this.field1445 = null;
        }
        this.field1448 = arg0.method6277();
        this.field1450 = arg0.method6277();
        if (var2 <= 3 && this.field1450 != 0) {
            this.field1450 += 16912800;
        }
        this.field1456 = arg0.method6284();
        this.field1465 = arg0.method6272();
        this.field1449 = arg0.method6474();
        if (var2 >= 4) {
            arg0.method6277();
        }
        this.field1454 = arg0.method6272() == 1;
        this.field1451 = arg0.method6273();
        this.field1453 = arg0.method6273();
        this.field1460 = arg0.method6273();
        this.field1467 = arg0.method6273();
        if (this.field1456 > 0) {
            if (this.field1444 && (this.field1457 == null || this.field1457.length < this.field1456)) {
                this.field1457 = new long[this.field1456];
            }
            if (this.field1455 && (this.field1469 == null || this.field1469.length < this.field1456)) {
                this.field1469 = new String[this.field1456];
            }
            if (this.field1458 == null || this.field1458.length < this.field1456) {
                this.field1458 = new byte[this.field1456];
            }
            if (this.field1464 == null || this.field1464.length < this.field1456) {
                this.field1464 = new int[this.field1456];
            }
            if (this.field1461 == null || this.field1461.length < this.field1456) {
                this.field1461 = new int[this.field1456];
            }
            if (this.field1462 == null || this.field1462.length < this.field1456) {
                this.field1462 = new boolean[this.field1456];
            }
            for (int var4 = 0; var4 < this.field1456; var4++) {
                if (this.field1444) {
                    this.field1457[var4] = arg0.method6275();
                }
                if (this.field1455) {
                    this.field1469[var4] = arg0.method6280();
                }
                this.field1458[var4] = arg0.method6273();
                if (var2 >= 2) {
                    this.field1464[var4] = arg0.method6277();
                }
                if (var2 >= 5) {
                    this.field1461[var4] = arg0.method6284();
                } else {
                    this.field1461[var4] = 0;
                }
                if (var2 >= 6) {
                    this.field1462[var4] = arg0.method6272() == 1;
                } else {
                    this.field1462[var4] = false;
                }
            }
            this.method2419();
        }
        if (this.field1465 > 0) {
            if (this.field1444 && (this.field1468 == null || this.field1468.length < this.field1465)) {
                this.field1468 = new long[this.field1465];
            }
            if (this.field1455 && (this.field1445 == null || this.field1445.length < this.field1465)) {
                this.field1445 = new String[this.field1465];
            }
            for (int var5 = 0; var5 < this.field1465; var5++) {
                if (this.field1444) {
                    this.field1468[var5] = arg0.method6275();
                }
                if (this.field1455) {
                    this.field1445[var5] = arg0.method6280();
                }
            }
        }
        if (var2 < 3) {
            return;
        }
        int var6 = arg0.method6284();
        if (var6 <= 0) {
            return;
        }
        this.field1459 = new class379(var6 < 16 ? class246.method2634(var6) : 16);
        while (var6-- > 0) {
            int var7 = arg0.method6277();
            int var8 = var7 & 0x3FFFFFFF;
            int var9 = var7 >>> 30;
            if (var9 == 0) {
                int var10 = arg0.method6277();
                this.field1459.method6043(new class369(var10), (long) var8);
            } else if (var9 == 1) {
                long var11 = arg0.method6275();
                this.field1459.method6043(new class368(var11), (long) var8);
            } else if (var9 == 2) {
                String var13 = arg0.method6474();
                this.field1459.method6043(new class366(var13), (long) var8);
            }
        }
    }
}
