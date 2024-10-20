package deob;

@ObfuscatedName("l")
public class class12 {

    @ObfuscatedName("l.n")
    public boolean field92;

    @ObfuscatedName("l.f")
    public boolean field93;

    @ObfuscatedName("l.y")
    public long field110;

    @ObfuscatedName("l.p")
    public int field95 = 0;

    @ObfuscatedName("l.j")
    public String field96 = null;

    @ObfuscatedName("l.r")
    public int field115 = 0;

    @ObfuscatedName("l.b")
    public boolean field98;

    @ObfuscatedName("l.d")
    public byte field104;

    @ObfuscatedName("l.s")
    public byte field114;

    @ObfuscatedName("l.u")
    public byte field99;

    @ObfuscatedName("l.l")
    public byte field97;

    @ObfuscatedName("l.o")
    public int field103;

    @ObfuscatedName("l.c")
    public long[] field94;

    @ObfuscatedName("l.e")
    public byte[] field111;

    @ObfuscatedName("l.g")
    public int[] field106;

    @ObfuscatedName("l.a")
    public int[] field107;

    @ObfuscatedName("l.k")
    public int[] field102;

    @ObfuscatedName("l.m")
    public boolean[] field109;

    @ObfuscatedName("l.x")
    public int field101 = -1;

    @ObfuscatedName("l.z")
    public int field100 = -1;

    @ObfuscatedName("l.w")
    public int field112;

    @ObfuscatedName("l.t")
    public long[] field113;

    @ObfuscatedName("l.h")
    public String[] field108;

    @ObfuscatedName("l.q")
    public String[] field91;

    @ObfuscatedName("l.i")
    public class361 field116;

    public class12(class383 arg0) {
        this.method99(arg0);
    }

    @ObfuscatedName("l.v(II)V")
    public void method69(int arg0) {
        if (this.field92) {
            if (this.field94 == null) {
                this.field94 = new long[arg0];
            } else {
                System.arraycopy(this.field94, 0, this.field94 = new long[arg0], 0, this.field103);
            }
        }
        if (this.field93) {
            if (this.field108 == null) {
                this.field108 = new String[arg0];
            } else {
                System.arraycopy(this.field108, 0, this.field108 = new String[arg0], 0, this.field103);
            }
        }
        if (this.field111 == null) {
            this.field111 = new byte[arg0];
        } else {
            System.arraycopy(this.field111, 0, this.field111 = new byte[arg0], 0, this.field103);
        }
        if (this.field107 == null) {
            this.field107 = new int[arg0];
        } else {
            System.arraycopy(this.field107, 0, this.field107 = new int[arg0], 0, this.field103);
        }
        if (this.field102 == null) {
            this.field102 = new int[arg0];
        } else {
            System.arraycopy(this.field102, 0, this.field102 = new int[arg0], 0, this.field103);
        }
        if (this.field109 == null) {
            this.field109 = new boolean[arg0];
        } else {
            System.arraycopy(this.field109, 0, this.field109 = new boolean[arg0], 0, this.field103);
        }
    }

    @ObfuscatedName("l.n(IB)V")
    public void method70(int arg0) {
        if (this.field92) {
            if (this.field113 == null) {
                this.field113 = new long[arg0];
            } else {
                System.arraycopy(this.field113, 0, this.field113 = new long[arg0], 0, this.field112);
            }
        }
        if (!this.field93) {
            return;
        }
        if (this.field91 == null) {
            this.field91 = new String[arg0];
        } else {
            System.arraycopy(this.field91, 0, this.field91 = new String[arg0], 0, this.field112);
        }
    }

    @ObfuscatedName("l.f(Ljava/lang/String;I)I")
    public int method71(String arg0) {
        if (arg0 == null || arg0.length() == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < this.field103; var2++) {
            if (this.field108[var2].equals(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("l.y(IIII)I")
    public int method72(int arg0, int arg1, int arg2) {
        int var4 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
        return (this.field107[arg0] & var4) >>> arg1;
    }

    @ObfuscatedName("l.p(IB)Ljava/lang/Integer;")
    public Integer method73(int arg0) {
        if (this.field116 == null) {
            return null;
        } else {
            class352 var2 = this.field116.method5752((long) arg0);
            return var2 != null && var2 instanceof class351 ? Integer.valueOf(((class351) var2).field3937) : null;
        }
    }

    @ObfuscatedName("l.j(I)[I")
    public int[] method74() {
        if (this.field106 == null) {
            String[] var1 = new String[this.field103];
            this.field106 = new int[this.field103];
            int var2 = 0;
            while (var2 < this.field103) {
                var1[var2] = this.field108[var2];
                if (var1[var2] != null) {
                    var1[var2] = var1[var2].toLowerCase();
                }
                this.field106[var2] = var2++;
            }
            class378.method1822(var1, this.field106);
        }
        return this.field106;
    }

    @ObfuscatedName("l.r(JLjava/lang/String;II)V")
    public void method75(long arg0, String arg1, int arg2) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (arg0 > 0L != this.field92) {
            throw new RuntimeException("");
        } else if (this.field93 == (arg1 != null)) {
            if (arg0 > 0L && (this.field94 == null || this.field103 >= this.field94.length) || arg1 != null && (this.field108 == null || this.field103 >= this.field108.length)) {
                this.method69(this.field103 + 5);
            }
            if (this.field94 != null) {
                this.field94[this.field103] = arg0;
            }
            if (this.field108 != null) {
                this.field108[this.field103] = arg1;
            }
            if (this.field101 == -1) {
                this.field101 = this.field103;
                this.field111[this.field103] = 126;
            } else {
                this.field111[this.field103] = 0;
            }
            this.field107[this.field103] = 0;
            this.field102[this.field103] = arg2;
            this.field109[this.field103] = false;
            this.field103++;
            this.field106 = null;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("l.b(II)V")
    public void method93(int arg0) {
        if (arg0 < 0 || arg0 >= this.field103) {
            throw new RuntimeException("");
        }
        this.field103--;
        this.field106 = null;
        if (this.field103 == 0) {
            this.field94 = null;
            this.field108 = null;
            this.field111 = null;
            this.field107 = null;
            this.field102 = null;
            this.field109 = null;
            this.field101 = -1;
            this.field100 = -1;
            return;
        }
        System.arraycopy(this.field111, arg0 + 1, this.field111, arg0, this.field103 - arg0);
        System.arraycopy(this.field107, arg0 + 1, this.field107, arg0, this.field103 - arg0);
        System.arraycopy(this.field102, arg0 + 1, this.field102, arg0, this.field103 - arg0);
        System.arraycopy(this.field109, arg0 + 1, this.field109, arg0, this.field103 - arg0);
        if (this.field94 != null) {
            System.arraycopy(this.field94, arg0 + 1, this.field94, arg0, this.field103 - arg0);
        }
        if (this.field108 != null) {
            System.arraycopy(this.field108, arg0 + 1, this.field108, arg0, this.field103 - arg0);
        }
        this.method77();
    }

    @ObfuscatedName("l.d(I)V")
    public void method77() {
        if (this.field103 == 0) {
            this.field101 = -1;
            this.field100 = -1;
            return;
        }
        this.field101 = -1;
        this.field100 = -1;
        int var1 = 0;
        byte var2 = this.field111[0];
        for (int var3 = 1; var3 < this.field103; var3++) {
            if (this.field111[var3] > var2) {
                if (var2 == 125) {
                    this.field100 = var1;
                }
                var1 = var3;
                var2 = this.field111[var3];
            } else if (this.field100 == -1 && this.field111[var3] == 125) {
                this.field100 = var3;
            }
        }
        this.field101 = var1;
        if (this.field101 != -1) {
            this.field111[this.field101] = 126;
        }
    }

    @ObfuscatedName("l.s(JLjava/lang/String;B)V")
    public void method78(long arg0, String arg1) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (this.field92 != arg0 > 0L) {
            throw new RuntimeException("");
        } else if (this.field93 == (arg1 != null)) {
            if (arg0 > 0L && (this.field113 == null || this.field112 >= this.field113.length) || arg1 != null && (this.field91 == null || this.field112 >= this.field91.length)) {
                this.method70(this.field112 + 5);
            }
            if (this.field113 != null) {
                this.field113[this.field112] = arg0;
            }
            if (this.field91 != null) {
                this.field91[this.field112] = arg1;
            }
            this.field112++;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("l.u(II)V")
    public void method111(int arg0) {
        this.field112--;
        if (this.field112 == 0) {
            this.field113 = null;
            this.field91 = null;
            return;
        }
        if (this.field113 != null) {
            System.arraycopy(this.field113, arg0 + 1, this.field113, arg0, this.field112 - arg0);
        }
        if (this.field91 != null) {
            System.arraycopy(this.field91, arg0 + 1, this.field91, arg0, this.field112 - arg0);
        }
    }

    @ObfuscatedName("l.l(IBB)I")
    public int method84(int arg0, byte arg1) {
        if (arg1 == 126 || arg1 == 127) {
            return -1;
        } else if (this.field101 == arg0 && (this.field100 == -1 || this.field111[this.field100] < 125)) {
            return -1;
        } else if (this.field111[arg0] == arg1) {
            return -1;
        } else {
            this.field111[arg0] = arg1;
            this.method77();
            return arg0;
        }
    }

    @ObfuscatedName("l.o(IB)Z")
    public boolean method81(int arg0) {
        if (this.field101 == arg0 || this.field111[arg0] == 126) {
            return false;
        }
        this.field111[this.field101] = 125;
        this.field100 = this.field101;
        this.field111[arg0] = 126;
        this.field101 = arg0;
        return true;
    }

    @ObfuscatedName("l.c(IZB)I")
    public int method82(int arg0, boolean arg1) {
        if (this.field109[arg0] == arg1) {
            return -1;
        } else {
            this.field109[arg0] = arg1;
            return arg0;
        }
    }

    @ObfuscatedName("l.e(IIIII)I")
    public int method98(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        int var10 = this.field107[arg0];
        if ((var10 & var7) == var9) {
            return -1;
        } else {
            int var11 = var10 & ~var7;
            this.field107[arg0] = var11 | var9;
            return arg0;
        }
    }

    @ObfuscatedName("l.g(III)Z")
    public boolean method129(int arg0, int arg1) {
        if (this.field116 == null) {
            this.field116 = new class361(4);
        } else {
            class352 var3 = this.field116.method5752((long) arg0);
            if (var3 != null) {
                if (var3 instanceof class351) {
                    class351 var4 = (class351) var3;
                    if (var4.field3937 == arg1) {
                        return false;
                    }
                    var4.field3937 = arg1;
                    return true;
                }
                var3.method5496();
            }
        }
        this.field116.method5754(new class351(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("l.a(IIIII)Z")
    public boolean method85(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        if (this.field116 == null) {
            this.field116 = new class361(4);
        } else {
            class352 var10 = this.field116.method5752((long) arg0);
            if (var10 != null) {
                if (var10 instanceof class351) {
                    class351 var11 = (class351) var10;
                    if ((var11.field3937 & var7) == var9) {
                        return false;
                    }
                    var11.field3937 &= ~var7;
                    var11.field3937 |= var9;
                    return true;
                }
                var10.method5496();
            }
        }
        this.field116.method5754(new class351(var9), (long) arg0);
        return true;
    }

    @ObfuscatedName("l.k(IJ)Z")
    public boolean method94(int arg0, long arg1) {
        if (this.field116 == null) {
            this.field116 = new class361(4);
        } else {
            class352 var4 = this.field116.method5752((long) arg0);
            if (var4 != null) {
                if (var4 instanceof class350) {
                    class350 var5 = (class350) var4;
                    if (var5.field3936 == arg1) {
                        return false;
                    }
                    var5.field3936 = arg1;
                    return true;
                }
                var4.method5496();
            }
        }
        this.field116.method5754(new class350(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("l.m(ILjava/lang/String;I)Z")
    public boolean method87(int arg0, String arg1) {
        if (arg1 == null) {
            arg1 = "";
        } else if (arg1.length() > 80) {
            arg1 = arg1.substring(0, 80);
        }
        if (this.field116 == null) {
            this.field116 = new class361(4);
        } else {
            class352 var3 = this.field116.method5752((long) arg0);
            if (var3 != null) {
                if (var3 instanceof class348) {
                    class348 var4 = (class348) var3;
                    if (var4.field3934 instanceof String) {
                        if (arg1.equals(var4.field3934)) {
                            return false;
                        }
                        var4.method5496();
                        this.field116.method5754(new class348(arg1), var4.field3938);
                        return true;
                    }
                }
                var3.method5496();
            }
        }
        this.field116.method5754(new class348(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("l.x(Lnd;I)V")
    public void method99(class383 arg0) {
        int var2 = arg0.method5965();
        if (var2 < 1 || var2 > 6) {
            throw new RuntimeException("" + var2);
        }
        int var3 = arg0.method5965();
        if ((var3 & 0x1) != 0) {
            this.field92 = true;
        }
        if ((var3 & 0x2) != 0) {
            this.field93 = true;
        }
        if (!this.field92) {
            this.field94 = null;
            this.field113 = null;
        }
        if (!this.field93) {
            this.field108 = null;
            this.field91 = null;
        }
        this.field95 = arg0.method5970();
        this.field115 = arg0.method5970();
        if (var2 <= 3 && this.field115 != 0) {
            this.field115 += 16912800;
        }
        this.field103 = arg0.method5967();
        this.field112 = arg0.method5965();
        this.field96 = arg0.method5974();
        if (var2 >= 4) {
            arg0.method5970();
        }
        this.field98 = arg0.method5965() == 1;
        this.field104 = arg0.method5966();
        this.field114 = arg0.method5966();
        this.field99 = arg0.method5966();
        this.field97 = arg0.method5966();
        if (this.field103 > 0) {
            if (this.field92 && (this.field94 == null || this.field94.length < this.field103)) {
                this.field94 = new long[this.field103];
            }
            if (this.field93 && (this.field108 == null || this.field108.length < this.field103)) {
                this.field108 = new String[this.field103];
            }
            if (this.field111 == null || this.field111.length < this.field103) {
                this.field111 = new byte[this.field103];
            }
            if (this.field107 == null || this.field107.length < this.field103) {
                this.field107 = new int[this.field103];
            }
            if (this.field102 == null || this.field102.length < this.field103) {
                this.field102 = new int[this.field103];
            }
            if (this.field109 == null || this.field109.length < this.field103) {
                this.field109 = new boolean[this.field103];
            }
            for (int var4 = 0; var4 < this.field103; var4++) {
                if (this.field92) {
                    this.field94[var4] = arg0.method5971();
                }
                if (this.field93) {
                    this.field108[var4] = arg0.method6180();
                }
                this.field111[var4] = arg0.method5966();
                if (var2 >= 2) {
                    this.field107[var4] = arg0.method5970();
                }
                if (var2 >= 5) {
                    this.field102[var4] = arg0.method5967();
                } else {
                    this.field102[var4] = 0;
                }
                if (var2 >= 6) {
                    this.field109[var4] = arg0.method5965() == 1;
                } else {
                    this.field109[var4] = false;
                }
            }
            this.method77();
        }
        if (this.field112 > 0) {
            if (this.field92 && (this.field113 == null || this.field113.length < this.field112)) {
                this.field113 = new long[this.field112];
            }
            if (this.field93 && (this.field91 == null || this.field91.length < this.field112)) {
                this.field91 = new String[this.field112];
            }
            for (int var5 = 0; var5 < this.field112; var5++) {
                if (this.field92) {
                    this.field113[var5] = arg0.method5971();
                }
                if (this.field93) {
                    this.field91[var5] = arg0.method6180();
                }
            }
        }
        if (var2 < 3) {
            return;
        }
        int var6 = arg0.method5967();
        if (var6 <= 0) {
            return;
        }
        this.field116 = new class361(var6 < 16 ? class231.method1933(var6) : 16);
        while (var6-- > 0) {
            int var7 = arg0.method5970();
            int var8 = var7 & 0x3FFFFFFF;
            int var9 = var7 >>> 30;
            if (var9 == 0) {
                int var10 = arg0.method5970();
                this.field116.method5754(new class351(var10), (long) var8);
            } else if (var9 == 1) {
                long var11 = arg0.method5971();
                this.field116.method5754(new class350(var11), (long) var8);
            } else if (var9 == 2) {
                String var13 = arg0.method5974();
                this.field116.method5754(new class348(var13), (long) var8);
            }
        }
    }
}
