import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class384 {

    @OriginalMember(owner = "client!oo", name = "q", descriptor = "I")
    public int field5393 = -1;

    @OriginalMember(owner = "client!oo", name = "t", descriptor = "I")
    public int field5396 = -1;

    @OriginalMember(owner = "client!oo", name = "u", descriptor = "Z")
    public boolean field5397 = true;

    @OriginalMember(owner = "client!oo", name = "l", descriptor = "I")
    public int field5388 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!oo", name = "g", descriptor = "I")
    public int field5383 = 0;

    @OriginalMember(owner = "client!oo", name = "s", descriptor = "[Ljava/lang/String;")
    public String[] field5395 = new String[5];

    @OriginalMember(owner = "client!oo", name = "G", descriptor = "I")
    public int field5409 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!oo", name = "j", descriptor = "I")
    private int field5386 = -1;

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "I")
    private int field5378 = -1;

    @OriginalMember(owner = "client!oo", name = "F", descriptor = "I")
    public int field5408 = -1;

    @OriginalMember(owner = "client!oo", name = "y", descriptor = "I")
    public int field5401 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!oo", name = "H", descriptor = "I")
    private int field5410 = -1;

    @OriginalMember(owner = "client!oo", name = "I", descriptor = "Z")
    public boolean field5411 = false;

    @OriginalMember(owner = "client!oo", name = "d", descriptor = "Z")
    public boolean field5380 = true;

    @OriginalMember(owner = "client!oo", name = "N", descriptor = "I")
    private int field5416 = -1;

    @OriginalMember(owner = "client!oo", name = "O", descriptor = "I")
    public int field5417 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!oo", name = "r", descriptor = "I")
    public int field5394 = -1;

    @OriginalMember(owner = "client!oo", name = "L", descriptor = "Z")
    public boolean field5414 = true;

    @OriginalMember(owner = "client!oo", name = "P", descriptor = "I")
    private int field5418 = -1;

    @OriginalMember(owner = "client!oo", name = "w", descriptor = "I")
    public static int field5399 = 0;

    @OriginalMember(owner = "client!oo", name = "m", descriptor = "[I")
    public static int[] field5389 = new int[32];

    @OriginalMember(owner = "client!oo", name = "n", descriptor = "I")
    public static int field5390 = 999999;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "I")
    private int field5377;

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "I")
    public int field5379;

    @OriginalMember(owner = "client!oo", name = "e", descriptor = "I")
    public static int field5381;

    @OriginalMember(owner = "client!oo", name = "f", descriptor = "I")
    public static int field5382;

    @OriginalMember(owner = "client!oo", name = "i", descriptor = "I")
    public int field5385;

    @OriginalMember(owner = "client!oo", name = "k", descriptor = "I")
    public static int field5387;

    @OriginalMember(owner = "client!oo", name = "o", descriptor = "I")
    public int field5391;

    @OriginalMember(owner = "client!oo", name = "p", descriptor = "I")
    public static int field5392;

    @OriginalMember(owner = "client!oo", name = "v", descriptor = "I")
    public int field5398;

    @OriginalMember(owner = "client!oo", name = "z", descriptor = "I")
    private int field5402;

    @OriginalMember(owner = "client!oo", name = "A", descriptor = "I")
    private int field5403;

    @OriginalMember(owner = "client!oo", name = "B", descriptor = "I")
    public static int field5404;

    @OriginalMember(owner = "client!oo", name = "C", descriptor = "I")
    public static int field5405;

    @OriginalMember(owner = "client!oo", name = "D", descriptor = "I")
    public int field5406;

    @OriginalMember(owner = "client!oo", name = "E", descriptor = "I")
    public static int field5407;

    @OriginalMember(owner = "client!oo", name = "J", descriptor = "I")
    private int field5412;

    @OriginalMember(owner = "client!oo", name = "K", descriptor = "I")
    public int field5413;

    @OriginalMember(owner = "client!oo", name = "M", descriptor = "I")
    public static int field5415;

    @OriginalMember(owner = "client!oo", name = "x", descriptor = "Ljava/lang/String;")
    public String field5400;

    @OriginalMember(owner = "client!oo", name = "Q", descriptor = "Ljava/lang/String;")
    public String field5419;

    @OriginalMember(owner = "client!oo", name = "h", descriptor = "[I")
    public int[] field5384;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(BLpe;Z)Lkb;")
    public final class80 method2378(byte arg0, class391 arg1, boolean arg2) {
        field5415++;
        if (arg0 != -26) {
            return null;
        }
        int var4 = arg2 ? this.field5393 : this.field5396;
        int var5 = arg1.field5484 << 29 | var4;
        class80 var6 = (class80) class362.field4992.method2537(-61, (long) var5);
        if (var6 != null) {
            return var6;
        } else if (class128.field1810.method2635(var4, (byte) 115)) {
            class214 var7 = class214.method1459(class128.field1810, var4, 0);
            if (var7 != null) {
                var6 = arg1.method213(var7, true);
                class362.field4992.method2542(var6, (byte) 62, (long) var5);
            }
            return var6;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lfo;ZZ)Z")
    public static final boolean method2379(class228 arg0, boolean arg1, boolean arg2) {
        boolean var3 = class91.field1351 == class244.field3367;
        int var4 = 0;
        arg0.method1108((byte) -61);
        if (arg0.field3172 < 0 || arg0.field3161 < 0 || arg0.field3162 >= class368.field5054 || arg0.field3178 >= class16.field190) {
            return false;
        }
        for (int var5 = arg0.field3172; var5 <= arg0.field3162; var5++) {
            for (int var8 = arg0.field3161; var8 <= arg0.field3178; var8++) {
                int var9 = 0;
                if (var5 > arg0.field3172) {
                    var9++;
                }
                if (var5 < arg0.field3162) {
                    var9 += 4;
                }
                if (var8 > arg0.field3161) {
                    var9 += 8;
                }
                if (var8 < arg0.field3178) {
                    var9 += 2;
                }
                class224 var10 = class118.field1653[arg0.field3170][var5][var8];
                if (var10 == null) {
                    if (arg2) {
                        boolean var11 = class118.field1653[0][var5][var8].field3114 != null;
                        if (arg0.field3170 == 3 && var11) {
                            return false;
                        }
                        for (int var12 = 1; var12 <= arg0.field3170; var12++) {
                            if (class118.field1653[var12][var5][var8] == null) {
                                var10 = class118.field1653[var12][var5][var8] = new class224(var12, var5, var8);
                                if (var11) {
                                    var10.field3107++;
                                }
                            }
                        }
                    } else {
                        class263.method1695(arg0.field3170, var5, var8);
                        var10 = class118.field1653[arg0.field3170][var5][var8];
                    }
                }
                class26 var13 = class89.method793(var9, (byte) -74, arg0);
                class26 var14 = var10.field3129;
                if (var14 == null) {
                    var10.field3129 = var13;
                } else {
                    while (var14.field463 != null) {
                        var14 = var14.field463;
                    }
                    var14.field463 = var13;
                }
                var10.field3119 = (byte) (var10.field3119 | var9);
                if (var3 && class122.field1712[var5][var8] != 0) {
                    var4 = class122.field1712[var5][var8];
                }
            }
        }
        if (var3 && var4 != 0) {
            for (int var6 = arg0.field3172; var6 <= arg0.field3162; var6++) {
                for (int var7 = arg0.field3161; var7 <= arg0.field3178; var7++) {
                    if (class122.field1712[var6][var7] == 0) {
                        class122.field1712[var6][var7] = var4;
                    }
                }
            }
        }
        if (arg1) {
            class396.field5544[class275.field3692++] = arg0;
        }
        return true;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(ZLap;I)V")
    private final void method2380(boolean arg0, class289 arg1, int arg2) {
        if (arg0) {
            return;
        }
        field5387++;
        if (arg2 == 1) {
            this.field5396 = arg1.method1853(-98);
        } else if (arg2 == 2) {
            this.field5393 = arg1.method1853(85);
        } else if (arg2 == 3) {
            this.field5400 = arg1.method1871(-1);
        } else if (arg2 == 4) {
            this.field5385 = arg1.method1880((byte) 73);
        } else if (arg2 == 5) {
            this.field5394 = arg1.method1880((byte) 69);
        } else if (arg2 == 6) {
            this.field5383 = arg1.method1861((byte) -72);
        } else if (arg2 == 7) {
            int var4 = arg1.method1861((byte) -72);
            if ((var4 & 0x1) == 0) {
                this.field5397 = false;
            }
            if ((var4 & 0x2) == 2) {
                this.field5411 = true;
                return;
            }
        } else if (arg2 == 8) {
            this.field5380 = arg1.method1861((byte) -72) == 1;
            return;
        } else if (arg2 == 9) {
            this.field5410 = arg1.method1853(103);
            if (this.field5410 == 65535) {
                this.field5410 = -1;
            }
            this.field5418 = arg1.method1853(109);
            if (this.field5418 == 65535) {
                this.field5418 = -1;
            }
            this.field5402 = arg1.method1856((byte) 121);
            this.field5412 = arg1.method1856((byte) 87);
            return;
        } else if (arg2 >= 10 && arg2 <= 14) {
            this.field5395[arg2 - 10] = arg1.method1871(-1);
        } else if (arg2 == 15) {
            int var5 = arg1.method1861((byte) -72);
            this.field5384 = new int[var5 * 2];
            for (int var6 = 0; var6 < (var5 * 2); var6++) {
                this.field5384[var6] = arg1.method1833(25);
            }
            this.field5391 = arg1.method1856((byte) 92);
            this.field5398 = arg1.method1856((byte) 118);
            return;
        } else if (arg2 == 16) {
            this.field5414 = false;
            return;
        } else if (arg2 == 17) {
            this.field5419 = arg1.method1871(-1);
            return;
        } else if (arg2 == 18) {
            this.field5378 = arg1.method1853(100);
            return;
        } else if (arg2 == 19) {
            this.field5408 = arg1.method1853(120);
            return;
        } else {
            if (arg2 == 20) {
                this.field5416 = arg1.method1853(117);
                if (this.field5416 == 65535) {
                    this.field5416 = -1;
                }
                this.field5386 = arg1.method1853(-121);
                if (this.field5386 == 65535) {
                    this.field5386 = -1;
                }
                this.field5403 = arg1.method1856((byte) 38);
                this.field5377 = arg1.method1856((byte) 62);
            } else if (arg2 == 21) {
                this.field5413 = arg1.method1856((byte) 67);
                return;
            } else if (arg2 == 22) {
                this.field5379 = arg1.method1856((byte) 46);
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(ILpe;)Lkb;")
    public final class80 method2381(int arg0, class391 arg1) {
        field5405++;
        class80 var3 = (class80) class362.field4992.method2537(-43, (long) (this.field5378 | 0x20000 | arg1.field5484 << 29));
        if (var3 != null) {
            return var3;
        }
        class128.field1810.method2635(this.field5378, (byte) -96);
        if (arg0 > -113) {
            method2385(-108, 88, -104);
        }
        class214 var4 = class214.method1459(class128.field1810, this.field5378, 0);
        if (var4 != null) {
            var3 = arg1.method213(var4, true);
            class362.field4992.method2542(var3, (byte) 90, (long) (arg1.field5484 << 29 | this.field5378 | 0x20000));
        }
        return var3;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)Z")
    public final boolean method2382(int arg0) {
        if (arg0 != -14605) {
            this.field5377 = 6;
        }
        field5392++;
        if (this.field5418 == -1 && this.field5410 == -1) {
            return true;
        }
        boolean var2 = false;
        int var3;
        if (this.field5418 == -1) {
            var3 = class218.method1490(this.field5410, -23365);
        } else {
            var3 = class414.field5782[this.field5418];
        }
        if (var3 < this.field5402 || var3 > this.field5412) {
            return false;
        } else if (this.field5386 == -1 && this.field5416 == -1) {
            return true;
        } else {
            boolean var4 = false;
            int var5;
            if (this.field5386 == -1) {
                var5 = class218.method1490(this.field5416, -23365);
            } else {
                var5 = class414.field5782[this.field5386];
            }
            return var5 >= this.field5403 && this.field5377 >= var5;
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lap;I)Ljava/lang/String;")
    public static final String method2383(class289 arg0, int arg1) {
        field5382++;
        if (arg1 != -12061) {
            method2383((class289) null, -72);
        }
        return class52.method500(32767, 31911, arg0);
    }

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "(I)V")
    public static void method2384(int arg0) {
        int var1 = -108 % ((arg0 - 55) / 51);
        field5389 = null;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(III)I")
    public static final int method2385(int arg0, int arg1, int arg2) {
        if (arg1 >= -40) {
            return 9;
        }
        field5407++;
        class329 var3 = (class329) class19.field374.method614(-108, (long) arg2);
        if (var3 == null) {
            return -1;
        } else if (arg0 >= 0 && var3.field4472.length > arg0) {
            return var3.field4472[arg0];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Z)V")
    public final void method2386(boolean arg0) {
        field5404++;
        if (this.field5384 != null) {
            for (int var2 = 0; var2 < this.field5384.length; var2 += 2) {
                if (this.field5384[var2] < this.field5401) {
                    this.field5401 = this.field5384[var2];
                } else if (this.field5417 < this.field5384[var2]) {
                    this.field5417 = this.field5384[var2];
                }
                if (this.field5384[var2 + 1] < this.field5388) {
                    this.field5388 = this.field5384[var2 + 1];
                } else if (this.field5384[var2 + 1] > this.field5409) {
                    this.field5409 = this.field5384[var2 + 1];
                }
            }
        }
        if (!arg0) {
            method2383((class289) null, -66);
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(BLap;)V")
    public final void method2387(byte arg0, class289 arg1) {
        if (arg0 <= 79) {
            field5390 = -5;
        }
        while (true) {
            int var3 = arg1.method1861((byte) -72);
            if (var3 == 0) {
                field5381++;
                return;
            }
            this.method2380(false, arg1, var3);
        }
    }
}
