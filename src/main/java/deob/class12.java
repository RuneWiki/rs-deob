package deob;

@ObfuscatedName("b")
public class class12 {

    @ObfuscatedName("b.e")
    public boolean field107;

    @ObfuscatedName("b.v")
    public boolean field82;

    @ObfuscatedName("b.y")
    public long field83;

    @ObfuscatedName("b.j")
    public int field84 = 0;

    @ObfuscatedName("b.o")
    public String field85 = null;

    @ObfuscatedName("b.m")
    public int field86 = 0;

    @ObfuscatedName("b.r")
    public boolean field87;

    @ObfuscatedName("b.h")
    public byte field88;

    @ObfuscatedName("b.d")
    public byte field89;

    @ObfuscatedName("b.z")
    public byte field94;

    @ObfuscatedName("b.b")
    public byte field91;

    @ObfuscatedName("b.i")
    public int field80;

    @ObfuscatedName("b.k")
    public long[] field93;

    @ObfuscatedName("b.g")
    public byte[] field92;

    @ObfuscatedName("b.t")
    public int[] field90;

    @ObfuscatedName("b.x")
    public int[] field96;

    @ObfuscatedName("b.u")
    public int[] field97;

    @ObfuscatedName("b.q")
    public boolean[] field98;

    @ObfuscatedName("b.s")
    public int field99 = -1;

    @ObfuscatedName("b.p")
    public int field100 = -1;

    @ObfuscatedName("b.c")
    public int field101;

    @ObfuscatedName("b.n")
    public long[] field102;

    @ObfuscatedName("b.l")
    public String[] field103;

    @ObfuscatedName("b.w")
    public String[] field104;

    @ObfuscatedName("b.a")
    public class362 field81;

    public class12(class384 arg0) {
        this.method90(arg0);
    }

    @ObfuscatedName("b.f(IB)V")
    public void method72(int arg0) {
        if (this.field107) {
            if (this.field93 == null) {
                this.field93 = new long[arg0];
            } else {
                System.arraycopy(this.field93, 0, this.field93 = new long[arg0], 0, this.field80);
            }
        }
        if (this.field82) {
            if (this.field103 == null) {
                this.field103 = new String[arg0];
            } else {
                System.arraycopy(this.field103, 0, this.field103 = new String[arg0], 0, this.field80);
            }
        }
        if (this.field92 == null) {
            this.field92 = new byte[arg0];
        } else {
            System.arraycopy(this.field92, 0, this.field92 = new byte[arg0], 0, this.field80);
        }
        if (this.field96 == null) {
            this.field96 = new int[arg0];
        } else {
            System.arraycopy(this.field96, 0, this.field96 = new int[arg0], 0, this.field80);
        }
        if (this.field97 == null) {
            this.field97 = new int[arg0];
        } else {
            System.arraycopy(this.field97, 0, this.field97 = new int[arg0], 0, this.field80);
        }
        if (this.field98 == null) {
            this.field98 = new boolean[arg0];
        } else {
            System.arraycopy(this.field98, 0, this.field98 = new boolean[arg0], 0, this.field80);
        }
    }

    @ObfuscatedName("b.e(IB)V")
    public void method73(int arg0) {
        if (this.field107) {
            if (this.field102 == null) {
                this.field102 = new long[arg0];
            } else {
                System.arraycopy(this.field102, 0, this.field102 = new long[arg0], 0, this.field101);
            }
        }
        if (!this.field82) {
            return;
        }
        if (this.field104 == null) {
            this.field104 = new String[arg0];
        } else {
            System.arraycopy(this.field104, 0, this.field104 = new String[arg0], 0, this.field101);
        }
    }

    @ObfuscatedName("b.v(Ljava/lang/String;I)I")
    public int method147(String arg0) {
        if (arg0 == null || arg0.length() == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < this.field80; var2++) {
            if (this.field103[var2].equals(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("b.y(IIII)I")
    public int method121(int arg0, int arg1, int arg2) {
        int var4 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
        return (this.field96[arg0] & var4) >>> arg1;
    }

    @ObfuscatedName("b.j(II)Ljava/lang/Integer;")
    public Integer method112(int arg0) {
        if (this.field81 == null) {
            return null;
        } else {
            class353 var2 = this.field81.method5668((long) arg0);
            return var2 != null && var2 instanceof class352 ? Integer.valueOf(((class352) var2).field3934) : null;
        }
    }

    @ObfuscatedName("b.o(I)[I")
    public int[] method127() {
        if (this.field90 == null) {
            String[] var1 = new String[this.field80];
            this.field90 = new int[this.field80];
            int var2 = 0;
            while (var2 < this.field80) {
                var1[var2] = this.field103[var2];
                if (var1[var2] != null) {
                    var1[var2] = var1[var2].toLowerCase();
                }
                this.field90[var2] = var2++;
            }
            int[] var3 = this.field90;
            class379.method3953(var1, var3, 0, var1.length - 1);
        }
        return this.field90;
    }

    @ObfuscatedName("b.m(JLjava/lang/String;II)V")
    public void method77(long arg0, String arg1, int arg2) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (arg0 > 0L != this.field107) {
            throw new RuntimeException("");
        } else if (this.field82 == (arg1 != null)) {
            if (arg0 > 0L && (this.field93 == null || this.field80 >= this.field93.length) || arg1 != null && (this.field103 == null || this.field80 >= this.field103.length)) {
                this.method72(this.field80 + 5);
            }
            if (this.field93 != null) {
                this.field93[this.field80] = arg0;
            }
            if (this.field103 != null) {
                this.field103[this.field80] = arg1;
            }
            if (this.field99 == -1) {
                this.field99 = this.field80;
                this.field92[this.field80] = 126;
            } else {
                this.field92[this.field80] = 0;
            }
            this.field96[this.field80] = 0;
            this.field97[this.field80] = arg2;
            this.field98[this.field80] = false;
            this.field80++;
            this.field90 = null;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("b.r(II)V")
    public void method78(int arg0) {
        if (arg0 < 0 || arg0 >= this.field80) {
            throw new RuntimeException("");
        }
        this.field80--;
        this.field90 = null;
        if (this.field80 == 0) {
            this.field93 = null;
            this.field103 = null;
            this.field92 = null;
            this.field96 = null;
            this.field97 = null;
            this.field98 = null;
            this.field99 = -1;
            this.field100 = -1;
            return;
        }
        System.arraycopy(this.field92, arg0 + 1, this.field92, arg0, this.field80 - arg0);
        System.arraycopy(this.field96, arg0 + 1, this.field96, arg0, this.field80 - arg0);
        System.arraycopy(this.field97, arg0 + 1, this.field97, arg0, this.field80 - arg0);
        System.arraycopy(this.field98, arg0 + 1, this.field98, arg0, this.field80 - arg0);
        if (this.field93 != null) {
            System.arraycopy(this.field93, arg0 + 1, this.field93, arg0, this.field80 - arg0);
        }
        if (this.field103 != null) {
            System.arraycopy(this.field103, arg0 + 1, this.field103, arg0, this.field80 - arg0);
        }
        this.method141();
    }

    @ObfuscatedName("b.h(I)V")
    public void method141() {
        if (this.field80 == 0) {
            this.field99 = -1;
            this.field100 = -1;
            return;
        }
        this.field99 = -1;
        this.field100 = -1;
        int var1 = 0;
        byte var2 = this.field92[0];
        for (int var3 = 1; var3 < this.field80; var3++) {
            if (this.field92[var3] > var2) {
                if (var2 == 125) {
                    this.field100 = var1;
                }
                var1 = var3;
                var2 = this.field92[var3];
            } else if (this.field100 == -1 && this.field92[var3] == 125) {
                this.field100 = var3;
            }
        }
        this.field99 = var1;
        if (this.field99 != -1) {
            this.field92[this.field99] = 126;
        }
    }

    @ObfuscatedName("b.d(JLjava/lang/String;I)V")
    public void method80(long arg0, String arg1) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (arg0 > 0L != this.field107) {
            throw new RuntimeException("");
        } else if (this.field82 == (arg1 != null)) {
            if (arg0 > 0L && (this.field102 == null || this.field101 >= this.field102.length) || arg1 != null && (this.field104 == null || this.field101 >= this.field104.length)) {
                this.method73(this.field101 + 5);
            }
            if (this.field102 != null) {
                this.field102[this.field101] = arg0;
            }
            if (this.field104 != null) {
                this.field104[this.field101] = arg1;
            }
            this.field101++;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("b.z(II)V")
    public void method75(int arg0) {
        this.field101--;
        if (this.field101 == 0) {
            this.field102 = null;
            this.field104 = null;
            return;
        }
        if (this.field102 != null) {
            System.arraycopy(this.field102, arg0 + 1, this.field102, arg0, this.field101 - arg0);
        }
        if (this.field104 != null) {
            System.arraycopy(this.field104, arg0 + 1, this.field104, arg0, this.field101 - arg0);
        }
    }

    @ObfuscatedName("b.b(IBI)I")
    public int method82(int arg0, byte arg1) {
        if (arg1 == 126 || arg1 == 127) {
            return -1;
        } else if (this.field99 == arg0 && (this.field100 == -1 || this.field92[this.field100] < 125)) {
            return -1;
        } else if (this.field92[arg0] == arg1) {
            return -1;
        } else {
            this.field92[arg0] = arg1;
            this.method141();
            return arg0;
        }
    }

    @ObfuscatedName("b.i(IB)Z")
    public boolean method83(int arg0) {
        if (this.field99 == arg0 || this.field92[arg0] == 126) {
            return false;
        }
        this.field92[this.field99] = 125;
        this.field100 = this.field99;
        this.field92[arg0] = 126;
        this.field99 = arg0;
        return true;
    }

    @ObfuscatedName("b.k(IZI)I")
    public int method84(int arg0, boolean arg1) {
        if (this.field98[arg0] == arg1) {
            return -1;
        } else {
            this.field98[arg0] = arg1;
            return arg0;
        }
    }

    @ObfuscatedName("b.g(IIIIB)I")
    public int method79(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        int var10 = this.field96[arg0];
        if ((var10 & var7) == var9) {
            return -1;
        } else {
            int var11 = var10 & ~var7;
            this.field96[arg0] = var11 | var9;
            return arg0;
        }
    }

    @ObfuscatedName("b.t(III)Z")
    public boolean method139(int arg0, int arg1) {
        if (this.field81 == null) {
            this.field81 = new class362(4);
        } else {
            class353 var3 = this.field81.method5668((long) arg0);
            if (var3 != null) {
                if (var3 instanceof class352) {
                    class352 var4 = (class352) var3;
                    if (var4.field3934 == arg1) {
                        return false;
                    }
                    var4.field3934 = arg1;
                    return true;
                }
                var3.method5407();
            }
        }
        this.field81.method5669(new class352(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("b.x(IIIIB)Z")
    public boolean method87(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        if (this.field81 == null) {
            this.field81 = new class362(4);
        } else {
            class353 var10 = this.field81.method5668((long) arg0);
            if (var10 != null) {
                if (var10 instanceof class352) {
                    class352 var11 = (class352) var10;
                    if ((var11.field3934 & var7) == var9) {
                        return false;
                    }
                    var11.field3934 &= ~var7;
                    var11.field3934 |= var9;
                    return true;
                }
                var10.method5407();
            }
        }
        this.field81.method5669(new class352(var9), (long) arg0);
        return true;
    }

    @ObfuscatedName("b.u(IJ)Z")
    public boolean method88(int arg0, long arg1) {
        if (this.field81 == null) {
            this.field81 = new class362(4);
        } else {
            class353 var4 = this.field81.method5668((long) arg0);
            if (var4 != null) {
                if (var4 instanceof class351) {
                    class351 var5 = (class351) var4;
                    if (var5.field3933 == arg1) {
                        return false;
                    }
                    var5.field3933 = arg1;
                    return true;
                }
                var4.method5407();
            }
        }
        this.field81.method5669(new class351(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("b.q(ILjava/lang/String;I)Z")
    public boolean method89(int arg0, String arg1) {
        if (arg1 == null) {
            arg1 = "";
        } else if (arg1.length() > 80) {
            arg1 = arg1.substring(0, 80);
        }
        if (this.field81 == null) {
            this.field81 = new class362(4);
        } else {
            class353 var3 = this.field81.method5668((long) arg0);
            if (var3 != null) {
                if (var3 instanceof class349) {
                    class349 var4 = (class349) var3;
                    if (var4.field3931 instanceof String) {
                        if (arg1.equals(var4.field3931)) {
                            return false;
                        }
                        var4.method5407();
                        this.field81.method5669(new class349(arg1), var4.field3937);
                        return true;
                    }
                }
                var3.method5407();
            }
        }
        this.field81.method5669(new class349(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("b.s(Lnt;I)V")
    public void method90(class384 arg0) {
        int var2 = arg0.method5902();
        if (var2 < 1 || var2 > 6) {
            throw new RuntimeException("" + var2);
        }
        int var3 = arg0.method5902();
        if ((var3 & 0x1) != 0) {
            this.field107 = true;
        }
        if ((var3 & 0x2) != 0) {
            this.field82 = true;
        }
        if (!this.field107) {
            this.field93 = null;
            this.field102 = null;
        }
        if (!this.field82) {
            this.field103 = null;
            this.field104 = null;
        }
        this.field84 = arg0.method5965();
        this.field86 = arg0.method5965();
        if (var2 <= 3 && this.field86 != 0) {
            this.field86 += 16912800;
        }
        this.field80 = arg0.method5899();
        this.field101 = arg0.method5902();
        this.field85 = arg0.method5906();
        if (var2 >= 4) {
            arg0.method5965();
        }
        this.field87 = arg0.method5902() == 1;
        this.field88 = arg0.method5968();
        this.field89 = arg0.method5968();
        this.field94 = arg0.method5968();
        this.field91 = arg0.method5968();
        if (this.field80 > 0) {
            if (this.field107 && (this.field93 == null || this.field93.length < this.field80)) {
                this.field93 = new long[this.field80];
            }
            if (this.field82 && (this.field103 == null || this.field103.length < this.field80)) {
                this.field103 = new String[this.field80];
            }
            if (this.field92 == null || this.field92.length < this.field80) {
                this.field92 = new byte[this.field80];
            }
            if (this.field96 == null || this.field96.length < this.field80) {
                this.field96 = new int[this.field80];
            }
            if (this.field97 == null || this.field97.length < this.field80) {
                this.field97 = new int[this.field80];
            }
            if (this.field98 == null || this.field98.length < this.field80) {
                this.field98 = new boolean[this.field80];
            }
            for (int var4 = 0; var4 < this.field80; var4++) {
                if (this.field107) {
                    this.field93[var4] = arg0.method5896();
                }
                if (this.field82) {
                    this.field103[var4] = arg0.method5940();
                }
                this.field92[var4] = arg0.method5968();
                if (var2 >= 2) {
                    this.field96[var4] = arg0.method5965();
                }
                if (var2 >= 5) {
                    this.field97[var4] = arg0.method5899();
                } else {
                    this.field97[var4] = 0;
                }
                if (var2 >= 6) {
                    this.field98[var4] = arg0.method5902() == 1;
                } else {
                    this.field98[var4] = false;
                }
            }
            this.method141();
        }
        if (this.field101 > 0) {
            if (this.field107 && (this.field102 == null || this.field102.length < this.field101)) {
                this.field102 = new long[this.field101];
            }
            if (this.field82 && (this.field104 == null || this.field104.length < this.field101)) {
                this.field104 = new String[this.field101];
            }
            for (int var5 = 0; var5 < this.field101; var5++) {
                if (this.field107) {
                    this.field102[var5] = arg0.method5896();
                }
                if (this.field82) {
                    this.field104[var5] = arg0.method5940();
                }
            }
        }
        if (var2 < 3) {
            return;
        }
        int var6 = arg0.method5899();
        if (var6 <= 0) {
            return;
        }
        this.field81 = new class362(var6 < 16 ? class232.method2226(var6) : 16);
        while (var6-- > 0) {
            int var7 = arg0.method5965();
            int var8 = var7 & 0x3FFFFFFF;
            int var9 = var7 >>> 30;
            if (var9 == 0) {
                int var10 = arg0.method5965();
                this.field81.method5669(new class352(var10), (long) var8);
            } else if (var9 == 1) {
                long var11 = arg0.method5896();
                this.field81.method5669(new class351(var11), (long) var8);
            } else if (var9 == 2) {
                String var13 = arg0.method5906();
                this.field81.method5669(new class349(var13), (long) var8);
            }
        }
    }
}
