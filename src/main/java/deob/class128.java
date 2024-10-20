package deob;

@ObfuscatedName("di")
public class class128 {

    @ObfuscatedName("di.c")
    public boolean field1467;

    @ObfuscatedName("di.m")
    public boolean field1450;

    @ObfuscatedName("di.k")
    public long field1451;

    @ObfuscatedName("di.o")
    public int field1452 = 0;

    @ObfuscatedName("di.g")
    public String field1453 = null;

    @ObfuscatedName("di.z")
    public int field1454 = 0;

    @ObfuscatedName("di.a")
    public boolean field1448;

    @ObfuscatedName("di.u")
    public byte field1449;

    @ObfuscatedName("di.e")
    public byte field1457;

    @ObfuscatedName("di.l")
    public byte field1458;

    @ObfuscatedName("di.y")
    public byte field1459;

    @ObfuscatedName("di.v")
    public int field1455;

    @ObfuscatedName("di.f")
    public long[] field1461;

    @ObfuscatedName("di.s")
    public byte[] field1464;

    @ObfuscatedName("di.h")
    public int[] field1463;

    @ObfuscatedName("di.d")
    public int[] field1456;

    @ObfuscatedName("di.q")
    public int[] field1465;

    @ObfuscatedName("di.j")
    public boolean[] field1466;

    @ObfuscatedName("di.x")
    public int field1470 = -1;

    @ObfuscatedName("di.b")
    public int field1468 = -1;

    @ObfuscatedName("di.t")
    public int field1469;

    @ObfuscatedName("di.r")
    public long[] field1462;

    @ObfuscatedName("di.p")
    public String[] field1471;

    @ObfuscatedName("di.w")
    public String[] field1472;

    @ObfuscatedName("di.i")
    public class378 field1473;

    public class128(class400 arg0) {
        this.method2402(arg0);
    }

    @ObfuscatedName("di.n(II)V")
    public void method2383(int arg0) {
        if (this.field1467) {
            if (this.field1461 == null) {
                this.field1461 = new long[arg0];
            } else {
                System.arraycopy(this.field1461, 0, this.field1461 = new long[arg0], 0, this.field1455);
            }
        }
        if (this.field1450) {
            if (this.field1471 == null) {
                this.field1471 = new String[arg0];
            } else {
                System.arraycopy(this.field1471, 0, this.field1471 = new String[arg0], 0, this.field1455);
            }
        }
        if (this.field1464 == null) {
            this.field1464 = new byte[arg0];
        } else {
            System.arraycopy(this.field1464, 0, this.field1464 = new byte[arg0], 0, this.field1455);
        }
        if (this.field1456 == null) {
            this.field1456 = new int[arg0];
        } else {
            System.arraycopy(this.field1456, 0, this.field1456 = new int[arg0], 0, this.field1455);
        }
        if (this.field1465 == null) {
            this.field1465 = new int[arg0];
        } else {
            System.arraycopy(this.field1465, 0, this.field1465 = new int[arg0], 0, this.field1455);
        }
        if (this.field1466 == null) {
            this.field1466 = new boolean[arg0];
        } else {
            System.arraycopy(this.field1466, 0, this.field1466 = new boolean[arg0], 0, this.field1455);
        }
    }

    @ObfuscatedName("di.c(IB)V")
    public void method2384(int arg0) {
        if (this.field1467) {
            if (this.field1462 == null) {
                this.field1462 = new long[arg0];
            } else {
                System.arraycopy(this.field1462, 0, this.field1462 = new long[arg0], 0, this.field1469);
            }
        }
        if (!this.field1450) {
            return;
        }
        if (this.field1472 == null) {
            this.field1472 = new String[arg0];
        } else {
            System.arraycopy(this.field1472, 0, this.field1472 = new String[arg0], 0, this.field1469);
        }
    }

    @ObfuscatedName("di.m(Ljava/lang/String;S)I")
    public int method2385(String arg0) {
        if (arg0 == null || arg0.length() == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < this.field1455; var2++) {
            if (this.field1471[var2].equals(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("di.k(IIII)I")
    public int method2386(int arg0, int arg1, int arg2) {
        int var4 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
        return (this.field1456[arg0] & var4) >>> arg1;
    }

    @ObfuscatedName("di.o(II)Ljava/lang/Integer;")
    public Integer method2397(int arg0) {
        if (this.field1473 == null) {
            return null;
        } else {
            class369 var2 = this.field1473.method5996((long) arg0);
            return var2 != null && var2 instanceof class368 ? Integer.valueOf(((class368) var2).field4054) : null;
        }
    }

    @ObfuscatedName("di.g(I)[I")
    public int[] method2388() {
        if (this.field1463 == null) {
            String[] var1 = new String[this.field1455];
            this.field1463 = new int[this.field1455];
            int var2 = 0;
            while (var2 < this.field1455) {
                var1[var2] = this.field1471[var2];
                if (var1[var2] != null) {
                    var1[var2] = var1[var2].toLowerCase();
                }
                this.field1463[var2] = var2++;
            }
            class395.method575(var1, this.field1463);
        }
        return this.field1463;
    }

    @ObfuscatedName("di.z(JLjava/lang/String;IB)V")
    public void method2389(long arg0, String arg1, int arg2) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (arg0 > 0L != this.field1467) {
            throw new RuntimeException("");
        } else if (arg1 != null == this.field1450) {
            if (arg0 > 0L && (this.field1461 == null || this.field1455 >= this.field1461.length) || arg1 != null && (this.field1471 == null || this.field1455 >= this.field1471.length)) {
                this.method2383(this.field1455 + 5);
            }
            if (this.field1461 != null) {
                this.field1461[this.field1455] = arg0;
            }
            if (this.field1471 != null) {
                this.field1471[this.field1455] = arg1;
            }
            if (this.field1470 == -1) {
                this.field1470 = this.field1455;
                this.field1464[this.field1455] = 126;
            } else {
                this.field1464[this.field1455] = 0;
            }
            this.field1456[this.field1455] = 0;
            this.field1465[this.field1455] = arg2;
            this.field1466[this.field1455] = false;
            this.field1455++;
            this.field1463 = null;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("di.a(II)V")
    public void method2390(int arg0) {
        if (arg0 < 0 || arg0 >= this.field1455) {
            throw new RuntimeException("");
        }
        this.field1455--;
        this.field1463 = null;
        if (this.field1455 == 0) {
            this.field1461 = null;
            this.field1471 = null;
            this.field1464 = null;
            this.field1456 = null;
            this.field1465 = null;
            this.field1466 = null;
            this.field1470 = -1;
            this.field1468 = -1;
            return;
        }
        System.arraycopy(this.field1464, arg0 + 1, this.field1464, arg0, this.field1455 - arg0);
        System.arraycopy(this.field1456, arg0 + 1, this.field1456, arg0, this.field1455 - arg0);
        System.arraycopy(this.field1465, arg0 + 1, this.field1465, arg0, this.field1455 - arg0);
        System.arraycopy(this.field1466, arg0 + 1, this.field1466, arg0, this.field1455 - arg0);
        if (this.field1461 != null) {
            System.arraycopy(this.field1461, arg0 + 1, this.field1461, arg0, this.field1455 - arg0);
        }
        if (this.field1471 != null) {
            System.arraycopy(this.field1471, arg0 + 1, this.field1471, arg0, this.field1455 - arg0);
        }
        this.method2432();
    }

    @ObfuscatedName("di.u(I)V")
    public void method2432() {
        if (this.field1455 == 0) {
            this.field1470 = -1;
            this.field1468 = -1;
            return;
        }
        this.field1470 = -1;
        this.field1468 = -1;
        int var1 = 0;
        byte var2 = this.field1464[0];
        for (int var3 = 1; var3 < this.field1455; var3++) {
            if (this.field1464[var3] > var2) {
                if (var2 == 125) {
                    this.field1468 = var1;
                }
                var1 = var3;
                var2 = this.field1464[var3];
            } else if (this.field1468 == -1 && this.field1464[var3] == 125) {
                this.field1468 = var3;
            }
        }
        this.field1470 = var1;
        if (this.field1470 != -1) {
            this.field1464[this.field1470] = 126;
        }
    }

    @ObfuscatedName("di.e(JLjava/lang/String;I)V")
    public void method2392(long arg0, String arg1) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (arg0 > 0L != this.field1467) {
            throw new RuntimeException("");
        } else if (this.field1450 == (arg1 != null)) {
            if (arg0 > 0L && (this.field1462 == null || this.field1469 >= this.field1462.length) || arg1 != null && (this.field1472 == null || this.field1469 >= this.field1472.length)) {
                this.method2384(this.field1469 + 5);
            }
            if (this.field1462 != null) {
                this.field1462[this.field1469] = arg0;
            }
            if (this.field1472 != null) {
                this.field1472[this.field1469] = arg1;
            }
            this.field1469++;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("di.l(IB)V")
    public void method2419(int arg0) {
        this.field1469--;
        if (this.field1469 == 0) {
            this.field1462 = null;
            this.field1472 = null;
            return;
        }
        if (this.field1462 != null) {
            System.arraycopy(this.field1462, arg0 + 1, this.field1462, arg0, this.field1469 - arg0);
        }
        if (this.field1472 != null) {
            System.arraycopy(this.field1472, arg0 + 1, this.field1472, arg0, this.field1469 - arg0);
        }
    }

    @ObfuscatedName("di.y(IBI)I")
    public int method2411(int arg0, byte arg1) {
        if (arg1 == 126 || arg1 == 127) {
            return -1;
        } else if (this.field1470 == arg0 && (this.field1468 == -1 || this.field1464[this.field1468] < 125)) {
            return -1;
        } else if (this.field1464[arg0] == arg1) {
            return -1;
        } else {
            this.field1464[arg0] = arg1;
            this.method2432();
            return arg0;
        }
    }

    @ObfuscatedName("di.v(II)Z")
    public boolean method2395(int arg0) {
        if (this.field1470 == arg0 || this.field1464[arg0] == 126) {
            return false;
        }
        this.field1464[this.field1470] = 125;
        this.field1468 = this.field1470;
        this.field1464[arg0] = 126;
        this.field1470 = arg0;
        return true;
    }

    @ObfuscatedName("di.f(IZI)I")
    public int method2420(int arg0, boolean arg1) {
        if (this.field1466[arg0] == arg1) {
            return -1;
        } else {
            this.field1466[arg0] = arg1;
            return arg0;
        }
    }

    @ObfuscatedName("di.s(IIIII)I")
    public int method2444(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        int var10 = this.field1456[arg0];
        if ((var10 & var7) == var9) {
            return -1;
        } else {
            int var11 = var10 & ~var7;
            this.field1456[arg0] = var11 | var9;
            return arg0;
        }
    }

    @ObfuscatedName("di.h(IIB)Z")
    public boolean method2398(int arg0, int arg1) {
        if (this.field1473 == null) {
            this.field1473 = new class378(4);
        } else {
            class369 var3 = this.field1473.method5996((long) arg0);
            if (var3 != null) {
                if (var3 instanceof class368) {
                    class368 var4 = (class368) var3;
                    if (var4.field4054 == arg1) {
                        return false;
                    }
                    var4.field4054 = arg1;
                    return true;
                }
                var3.method5732();
            }
        }
        this.field1473.method5997(new class368(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("di.d(IIIII)Z")
    public boolean method2399(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        if (this.field1473 == null) {
            this.field1473 = new class378(4);
        } else {
            class369 var10 = this.field1473.method5996((long) arg0);
            if (var10 != null) {
                if (var10 instanceof class368) {
                    class368 var11 = (class368) var10;
                    if ((var11.field4054 & var7) == var9) {
                        return false;
                    }
                    var11.field4054 &= ~var7;
                    var11.field4054 |= var9;
                    return true;
                }
                var10.method5732();
            }
        }
        this.field1473.method5997(new class368(var9), (long) arg0);
        return true;
    }

    @ObfuscatedName("di.q(IJ)Z")
    public boolean method2400(int arg0, long arg1) {
        if (this.field1473 == null) {
            this.field1473 = new class378(4);
        } else {
            class369 var4 = this.field1473.method5996((long) arg0);
            if (var4 != null) {
                if (var4 instanceof class367) {
                    class367 var5 = (class367) var4;
                    if (var5.field4053 == arg1) {
                        return false;
                    }
                    var5.field4053 = arg1;
                    return true;
                }
                var4.method5732();
            }
        }
        this.field1473.method5997(new class367(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("di.j(ILjava/lang/String;B)Z")
    public boolean method2401(int arg0, String arg1) {
        if (arg1 == null) {
            arg1 = "";
        } else if (arg1.length() > 80) {
            arg1 = arg1.substring(0, 80);
        }
        if (this.field1473 == null) {
            this.field1473 = new class378(4);
        } else {
            class369 var3 = this.field1473.method5996((long) arg0);
            if (var3 != null) {
                if (var3 instanceof class365) {
                    class365 var4 = (class365) var3;
                    if (var4.field4051 instanceof String) {
                        if (arg1.equals(var4.field4051)) {
                            return false;
                        }
                        var4.method5732();
                        this.field1473.method5997(new class365(arg1), var4.field4056);
                        return true;
                    }
                }
                var3.method5732();
            }
        }
        this.field1473.method5997(new class365(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("di.x(Lot;I)V")
    public void method2402(class400 arg0) {
        int var2 = arg0.method6217();
        if (var2 < 1 || var2 > 6) {
            throw new RuntimeException("" + var2);
        }
        int var3 = arg0.method6217();
        if ((var3 & 0x1) != 0) {
            this.field1467 = true;
        }
        if ((var3 & 0x2) != 0) {
            this.field1450 = true;
        }
        if (!this.field1467) {
            this.field1461 = null;
            this.field1462 = null;
        }
        if (!this.field1450) {
            this.field1471 = null;
            this.field1472 = null;
        }
        this.field1452 = arg0.method6222();
        this.field1454 = arg0.method6222();
        if (var2 <= 3 && this.field1454 != 0) {
            this.field1454 += 16912800;
        }
        this.field1455 = arg0.method6219();
        this.field1469 = arg0.method6217();
        this.field1453 = arg0.method6226();
        if (var2 >= 4) {
            arg0.method6222();
        }
        this.field1448 = arg0.method6217() == 1;
        this.field1449 = arg0.method6218();
        this.field1457 = arg0.method6218();
        this.field1458 = arg0.method6218();
        this.field1459 = arg0.method6218();
        if (this.field1455 > 0) {
            if (this.field1467 && (this.field1461 == null || this.field1461.length < this.field1455)) {
                this.field1461 = new long[this.field1455];
            }
            if (this.field1450 && (this.field1471 == null || this.field1471.length < this.field1455)) {
                this.field1471 = new String[this.field1455];
            }
            if (this.field1464 == null || this.field1464.length < this.field1455) {
                this.field1464 = new byte[this.field1455];
            }
            if (this.field1456 == null || this.field1456.length < this.field1455) {
                this.field1456 = new int[this.field1455];
            }
            if (this.field1465 == null || this.field1465.length < this.field1455) {
                this.field1465 = new int[this.field1455];
            }
            if (this.field1466 == null || this.field1466.length < this.field1455) {
                this.field1466 = new boolean[this.field1455];
            }
            for (int var4 = 0; var4 < this.field1455; var4++) {
                if (this.field1467) {
                    this.field1461[var4] = arg0.method6223();
                }
                if (this.field1450) {
                    this.field1471[var4] = arg0.method6198();
                }
                this.field1464[var4] = arg0.method6218();
                if (var2 >= 2) {
                    this.field1456[var4] = arg0.method6222();
                }
                if (var2 >= 5) {
                    this.field1465[var4] = arg0.method6219();
                } else {
                    this.field1465[var4] = 0;
                }
                if (var2 >= 6) {
                    this.field1466[var4] = arg0.method6217() == 1;
                } else {
                    this.field1466[var4] = false;
                }
            }
            this.method2432();
        }
        if (this.field1469 > 0) {
            if (this.field1467 && (this.field1462 == null || this.field1462.length < this.field1469)) {
                this.field1462 = new long[this.field1469];
            }
            if (this.field1450 && (this.field1472 == null || this.field1472.length < this.field1469)) {
                this.field1472 = new String[this.field1469];
            }
            for (int var5 = 0; var5 < this.field1469; var5++) {
                if (this.field1467) {
                    this.field1462[var5] = arg0.method6223();
                }
                if (this.field1450) {
                    this.field1472[var5] = arg0.method6198();
                }
            }
        }
        if (var2 < 3) {
            return;
        }
        int var6 = arg0.method6219();
        if (var6 <= 0) {
            return;
        }
        this.field1473 = new class378(var6 < 16 ? class246.method1937(var6) : 16);
        while (var6-- > 0) {
            int var7 = arg0.method6222();
            int var8 = var7 & 0x3FFFFFFF;
            int var9 = var7 >>> 30;
            if (var9 == 0) {
                int var10 = arg0.method6222();
                this.field1473.method5997(new class368(var10), (long) var8);
            } else if (var9 == 1) {
                long var11 = arg0.method6223();
                this.field1473.method5997(new class367(var11), (long) var8);
            } else if (var9 == 2) {
                String var13 = arg0.method6226();
                this.field1473.method5997(new class365(var13), (long) var8);
            }
        }
    }
}
