package deob;

@ObfuscatedName("m")
public class class12 {

    @ObfuscatedName("m.o")
    public boolean field78;

    @ObfuscatedName("m.u")
    public boolean field105;

    @ObfuscatedName("m.p")
    public long field80;

    @ObfuscatedName("m.b")
    public int field81 = 0;

    @ObfuscatedName("m.e")
    public String field82 = null;

    @ObfuscatedName("m.k")
    public int field83 = 0;

    @ObfuscatedName("m.g")
    public boolean field91;

    @ObfuscatedName("m.h")
    public byte field85;

    @ObfuscatedName("m.n")
    public byte field84;

    @ObfuscatedName("m.l")
    public byte field87;

    @ObfuscatedName("m.m")
    public byte field88;

    @ObfuscatedName("m.d")
    public int field89;

    @ObfuscatedName("m.c")
    public long[] field90;

    @ObfuscatedName("m.j")
    public byte[] field77;

    @ObfuscatedName("m.r")
    public int[] field92;

    @ObfuscatedName("m.q")
    public int[] field93;

    @ObfuscatedName("m.t")
    public int[] field95;

    @ObfuscatedName("m.v")
    public boolean[] field79;

    @ObfuscatedName("m.x")
    public int field101 = -1;

    @ObfuscatedName("m.z")
    public int field97 = -1;

    @ObfuscatedName("m.i")
    public int field98;

    @ObfuscatedName("m.a")
    public long[] field108;

    @ObfuscatedName("m.w")
    public String[] field100;

    @ObfuscatedName("m.s")
    public String[] field106;

    @ObfuscatedName("m.y")
    public class360 field96;

    public class12(class382 arg0) {
        this.method127(arg0);
    }

    @ObfuscatedName("m.f(II)V")
    public void method86(int arg0) {
        if (this.field78) {
            if (this.field90 == null) {
                this.field90 = new long[arg0];
            } else {
                System.arraycopy(this.field90, 0, this.field90 = new long[arg0], 0, this.field89);
            }
        }
        if (this.field105) {
            if (this.field100 == null) {
                this.field100 = new String[arg0];
            } else {
                System.arraycopy(this.field100, 0, this.field100 = new String[arg0], 0, this.field89);
            }
        }
        if (this.field77 == null) {
            this.field77 = new byte[arg0];
        } else {
            System.arraycopy(this.field77, 0, this.field77 = new byte[arg0], 0, this.field89);
        }
        if (this.field93 == null) {
            this.field93 = new int[arg0];
        } else {
            System.arraycopy(this.field93, 0, this.field93 = new int[arg0], 0, this.field89);
        }
        if (this.field95 == null) {
            this.field95 = new int[arg0];
        } else {
            System.arraycopy(this.field95, 0, this.field95 = new int[arg0], 0, this.field89);
        }
        if (this.field79 == null) {
            this.field79 = new boolean[arg0];
        } else {
            System.arraycopy(this.field79, 0, this.field79 = new boolean[arg0], 0, this.field89);
        }
    }

    @ObfuscatedName("m.o(IB)V")
    public void method121(int arg0) {
        if (this.field78) {
            if (this.field108 == null) {
                this.field108 = new long[arg0];
            } else {
                System.arraycopy(this.field108, 0, this.field108 = new long[arg0], 0, this.field98);
            }
        }
        if (!this.field105) {
            return;
        }
        if (this.field106 == null) {
            this.field106 = new String[arg0];
        } else {
            System.arraycopy(this.field106, 0, this.field106 = new String[arg0], 0, this.field98);
        }
    }

    @ObfuscatedName("m.u(Ljava/lang/String;I)I")
    public int method88(String arg0) {
        if (arg0 == null || arg0.length() == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < this.field89; var2++) {
            if (this.field100[var2].equals(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("m.p(IIII)I")
    public int method89(int arg0, int arg1, int arg2) {
        int var4 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
        return (this.field93[arg0] & var4) >>> arg1;
    }

    @ObfuscatedName("m.b(IS)Ljava/lang/Integer;")
    public Integer method90(int arg0) {
        if (this.field96 == null) {
            return null;
        } else {
            class351 var2 = this.field96.method5621((long) arg0);
            return var2 != null && var2 instanceof class350 ? Integer.valueOf(((class350) var2).field3940) : null;
        }
    }

    @ObfuscatedName("m.e(I)[I")
    public int[] method105() {
        if (this.field92 == null) {
            String[] var1 = new String[this.field89];
            this.field92 = new int[this.field89];
            int var2 = 0;
            while (var2 < this.field89) {
                var1[var2] = this.field100[var2];
                if (var1[var2] != null) {
                    var1[var2] = var1[var2].toLowerCase();
                }
                this.field92[var2] = var2++;
            }
            int[] var3 = this.field92;
            class377.method4080(var1, var3, 0, var1.length - 1);
        }
        return this.field92;
    }

    @ObfuscatedName("m.k(JLjava/lang/String;IB)V")
    public void method92(long arg0, String arg1, int arg2) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (arg0 > 0L != this.field78) {
            throw new RuntimeException("");
        } else if (arg1 != null == this.field105) {
            if (arg0 > 0L && (this.field90 == null || this.field89 >= this.field90.length) || arg1 != null && (this.field100 == null || this.field89 >= this.field100.length)) {
                this.method86(this.field89 + 5);
            }
            if (this.field90 != null) {
                this.field90[this.field89] = arg0;
            }
            if (this.field100 != null) {
                this.field100[this.field89] = arg1;
            }
            if (this.field101 == -1) {
                this.field101 = this.field89;
                this.field77[this.field89] = 126;
            } else {
                this.field77[this.field89] = 0;
            }
            this.field93[this.field89] = 0;
            this.field95[this.field89] = arg2;
            this.field79[this.field89] = false;
            this.field89++;
            this.field92 = null;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("m.g(IB)V")
    public void method93(int arg0) {
        if (arg0 < 0 || arg0 >= this.field89) {
            throw new RuntimeException("");
        }
        this.field89--;
        this.field92 = null;
        if (this.field89 == 0) {
            this.field90 = null;
            this.field100 = null;
            this.field77 = null;
            this.field93 = null;
            this.field95 = null;
            this.field79 = null;
            this.field101 = -1;
            this.field97 = -1;
            return;
        }
        System.arraycopy(this.field77, arg0 + 1, this.field77, arg0, this.field89 - arg0);
        System.arraycopy(this.field93, arg0 + 1, this.field93, arg0, this.field89 - arg0);
        System.arraycopy(this.field95, arg0 + 1, this.field95, arg0, this.field89 - arg0);
        System.arraycopy(this.field79, arg0 + 1, this.field79, arg0, this.field89 - arg0);
        if (this.field90 != null) {
            System.arraycopy(this.field90, arg0 + 1, this.field90, arg0, this.field89 - arg0);
        }
        if (this.field100 != null) {
            System.arraycopy(this.field100, arg0 + 1, this.field100, arg0, this.field89 - arg0);
        }
        this.method110();
    }

    @ObfuscatedName("m.h(B)V")
    public void method110() {
        if (this.field89 == 0) {
            this.field101 = -1;
            this.field97 = -1;
            return;
        }
        this.field101 = -1;
        this.field97 = -1;
        int var1 = 0;
        byte var2 = this.field77[0];
        for (int var3 = 1; var3 < this.field89; var3++) {
            if (this.field77[var3] > var2) {
                if (var2 == 125) {
                    this.field97 = var1;
                }
                var1 = var3;
                var2 = this.field77[var3];
            } else if (this.field97 == -1 && this.field77[var3] == 125) {
                this.field97 = var3;
            }
        }
        this.field101 = var1;
        if (this.field101 != -1) {
            this.field77[this.field101] = 126;
        }
    }

    @ObfuscatedName("m.n(JLjava/lang/String;I)V")
    public void method134(long arg0, String arg1) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (arg0 > 0L != this.field78) {
            throw new RuntimeException("");
        } else if (this.field105 == (arg1 != null)) {
            if (arg0 > 0L && (this.field108 == null || this.field98 >= this.field108.length) || arg1 != null && (this.field106 == null || this.field98 >= this.field106.length)) {
                this.method121(this.field98 + 5);
            }
            if (this.field108 != null) {
                this.field108[this.field98] = arg0;
            }
            if (this.field106 != null) {
                this.field106[this.field98] = arg1;
            }
            this.field98++;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("m.l(IB)V")
    public void method126(int arg0) {
        this.field98--;
        if (this.field98 == 0) {
            this.field108 = null;
            this.field106 = null;
            return;
        }
        if (this.field108 != null) {
            System.arraycopy(this.field108, arg0 + 1, this.field108, arg0, this.field98 - arg0);
        }
        if (this.field106 != null) {
            System.arraycopy(this.field106, arg0 + 1, this.field106, arg0, this.field98 - arg0);
        }
    }

    @ObfuscatedName("m.m(IBB)I")
    public int method97(int arg0, byte arg1) {
        if (arg1 == 126 || arg1 == 127) {
            return -1;
        } else if (this.field101 == arg0 && (this.field97 == -1 || this.field77[this.field97] < 125)) {
            return -1;
        } else if (this.field77[arg0] == arg1) {
            return -1;
        } else {
            this.field77[arg0] = arg1;
            this.method110();
            return arg0;
        }
    }

    @ObfuscatedName("m.d(II)Z")
    public boolean method136(int arg0) {
        if (this.field101 == arg0 || this.field77[arg0] == 126) {
            return false;
        }
        this.field77[this.field101] = 125;
        this.field97 = this.field101;
        this.field77[arg0] = 126;
        this.field101 = arg0;
        return true;
    }

    @ObfuscatedName("m.c(IZI)I")
    public int method99(int arg0, boolean arg1) {
        if (this.field79[arg0] == arg1) {
            return -1;
        } else {
            this.field79[arg0] = arg1;
            return arg0;
        }
    }

    @ObfuscatedName("m.j(IIIII)I")
    public int method100(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        int var10 = this.field93[arg0];
        if ((var10 & var7) == var9) {
            return -1;
        } else {
            int var11 = var10 & ~var7;
            this.field93[arg0] = var11 | var9;
            return arg0;
        }
    }

    @ObfuscatedName("m.r(III)Z")
    public boolean method124(int arg0, int arg1) {
        if (this.field96 == null) {
            this.field96 = new class360(4);
        } else {
            class351 var3 = this.field96.method5621((long) arg0);
            if (var3 != null) {
                if (var3 instanceof class350) {
                    class350 var4 = (class350) var3;
                    if (var4.field3940 == arg1) {
                        return false;
                    }
                    var4.field3940 = arg1;
                    return true;
                }
                var3.method5354();
            }
        }
        this.field96.method5630(new class350(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("m.q(IIIIB)Z")
    public boolean method102(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        if (this.field96 == null) {
            this.field96 = new class360(4);
        } else {
            class351 var10 = this.field96.method5621((long) arg0);
            if (var10 != null) {
                if (var10 instanceof class350) {
                    class350 var11 = (class350) var10;
                    if ((var11.field3940 & var7) == var9) {
                        return false;
                    }
                    var11.field3940 &= ~var7;
                    var11.field3940 |= var9;
                    return true;
                }
                var10.method5354();
            }
        }
        this.field96.method5630(new class350(var9), (long) arg0);
        return true;
    }

    @ObfuscatedName("m.t(IJ)Z")
    public boolean method103(int arg0, long arg1) {
        if (this.field96 == null) {
            this.field96 = new class360(4);
        } else {
            class351 var4 = this.field96.method5621((long) arg0);
            if (var4 != null) {
                if (var4 instanceof class349) {
                    class349 var5 = (class349) var4;
                    if (var5.field3939 == arg1) {
                        return false;
                    }
                    var5.field3939 = arg1;
                    return true;
                }
                var4.method5354();
            }
        }
        this.field96.method5630(new class349(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("m.v(ILjava/lang/String;I)Z")
    public boolean method104(int arg0, String arg1) {
        if (arg1 == null) {
            arg1 = "";
        } else if (arg1.length() > 80) {
            arg1 = arg1.substring(0, 80);
        }
        if (this.field96 == null) {
            this.field96 = new class360(4);
        } else {
            class351 var3 = this.field96.method5621((long) arg0);
            if (var3 != null) {
                if (var3 instanceof class347) {
                    class347 var4 = (class347) var3;
                    if (var4.field3937 instanceof String) {
                        if (arg1.equals(var4.field3937)) {
                            return false;
                        }
                        var4.method5354();
                        this.field96.method5630(new class347(arg1), var4.field3941);
                        return true;
                    }
                }
                var3.method5354();
            }
        }
        this.field96.method5630(new class347(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("m.x(Lnu;I)V")
    public void method127(class382 arg0) {
        int var2 = arg0.method5856();
        if (var2 < 1 || var2 > 6) {
            throw new RuntimeException("" + var2);
        }
        int var3 = arg0.method5856();
        if ((var3 & 0x1) != 0) {
            this.field78 = true;
        }
        if ((var3 & 0x2) != 0) {
            this.field105 = true;
        }
        if (!this.field78) {
            this.field90 = null;
            this.field108 = null;
        }
        if (!this.field105) {
            this.field100 = null;
            this.field106 = null;
        }
        this.field81 = arg0.method5861();
        this.field83 = arg0.method5861();
        if (var2 <= 3 && this.field83 != 0) {
            this.field83 += 16912800;
        }
        this.field89 = arg0.method5858();
        this.field98 = arg0.method5856();
        this.field82 = arg0.method5865();
        if (var2 >= 4) {
            arg0.method5861();
        }
        this.field91 = arg0.method5856() == 1;
        this.field85 = arg0.method6045();
        this.field84 = arg0.method6045();
        this.field87 = arg0.method6045();
        this.field88 = arg0.method6045();
        if (this.field89 > 0) {
            if (this.field78 && (this.field90 == null || this.field90.length < this.field89)) {
                this.field90 = new long[this.field89];
            }
            if (this.field105 && (this.field100 == null || this.field100.length < this.field89)) {
                this.field100 = new String[this.field89];
            }
            if (this.field77 == null || this.field77.length < this.field89) {
                this.field77 = new byte[this.field89];
            }
            if (this.field93 == null || this.field93.length < this.field89) {
                this.field93 = new int[this.field89];
            }
            if (this.field95 == null || this.field95.length < this.field89) {
                this.field95 = new int[this.field89];
            }
            if (this.field79 == null || this.field79.length < this.field89) {
                this.field79 = new boolean[this.field89];
            }
            for (int var4 = 0; var4 < this.field89; var4++) {
                if (this.field78) {
                    this.field90[var4] = arg0.method6069();
                }
                if (this.field105) {
                    this.field100[var4] = arg0.method5837();
                }
                this.field77[var4] = arg0.method6045();
                if (var2 >= 2) {
                    this.field93[var4] = arg0.method5861();
                }
                if (var2 >= 5) {
                    this.field95[var4] = arg0.method5858();
                } else {
                    this.field95[var4] = 0;
                }
                if (var2 >= 6) {
                    this.field79[var4] = arg0.method5856() == 1;
                } else {
                    this.field79[var4] = false;
                }
            }
            this.method110();
        }
        if (this.field98 > 0) {
            if (this.field78 && (this.field108 == null || this.field108.length < this.field98)) {
                this.field108 = new long[this.field98];
            }
            if (this.field105 && (this.field106 == null || this.field106.length < this.field98)) {
                this.field106 = new String[this.field98];
            }
            for (int var5 = 0; var5 < this.field98; var5++) {
                if (this.field78) {
                    this.field108[var5] = arg0.method6069();
                }
                if (this.field105) {
                    this.field106[var5] = arg0.method5837();
                }
            }
        }
        if (var2 < 3) {
            return;
        }
        int var6 = arg0.method5858();
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
        this.field96 = new class360(var14);
        while (var6-- > 0) {
            int var15 = arg0.method5861();
            int var16 = var15 & 0x3FFFFFFF;
            int var17 = var15 >>> 30;
            if (var17 == 0) {
                int var18 = arg0.method5861();
                this.field96.method5630(new class350(var18), (long) var16);
            } else if (var17 == 1) {
                long var19 = arg0.method6069();
                this.field96.method5630(new class349(var19), (long) var16);
            } else if (var17 == 2) {
                String var21 = arg0.method5865();
                this.field96.method5630(new class347(var21), (long) var16);
            }
        }
    }
}
