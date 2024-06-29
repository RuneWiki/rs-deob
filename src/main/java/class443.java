import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class443 {

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "I")
    private int field6435 = -1;

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "I")
    private int field6446 = -1;

    @OriginalMember(owner = "client!oh", name = "q", descriptor = "I")
    private int field6447 = -32768;

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "Z")
    private boolean field6440 = false;

    @OriginalMember(owner = "client!oh", name = "G", descriptor = "Z")
    private boolean field6463 = false;

    @OriginalMember(owner = "client!oh", name = "F", descriptor = "I")
    public int field6462;

    @OriginalMember(owner = "client!oh", name = "I", descriptor = "I")
    public int field6465;

    @OriginalMember(owner = "client!oh", name = "J", descriptor = "B")
    private byte field6466;

    @OriginalMember(owner = "client!oh", name = "w", descriptor = "I")
    public int field6453;

    @OriginalMember(owner = "client!oh", name = "v", descriptor = "I")
    private int field6452;

    @OriginalMember(owner = "client!oh", name = "K", descriptor = "B")
    private byte field6467;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "I")
    private int field6438;

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "Z")
    private boolean field6443;

    @OriginalMember(owner = "client!oh", name = "r", descriptor = "[[I")
    public static int[][] field6448 = new int[128][128];

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "Lbt;")
    public static class363 field6436 = new class363(4);

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
    public static int field6431;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
    public static int field6432;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
    public static int field6433;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
    private int field6434;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "I")
    private int field6439;

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "I")
    public static int field6442;

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "I")
    public static int field6444;

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "I")
    public static int field6445;

    @OriginalMember(owner = "client!oh", name = "s", descriptor = "I")
    public static int field6449;

    @OriginalMember(owner = "client!oh", name = "t", descriptor = "I")
    public static int field6450;

    @OriginalMember(owner = "client!oh", name = "x", descriptor = "I")
    public static int field6454;

    @OriginalMember(owner = "client!oh", name = "z", descriptor = "I")
    public static int field6456;

    @OriginalMember(owner = "client!oh", name = "A", descriptor = "I")
    private int field6457;

    @OriginalMember(owner = "client!oh", name = "B", descriptor = "I")
    public static int field6458;

    @OriginalMember(owner = "client!oh", name = "D", descriptor = "I")
    private int field6460;

    @OriginalMember(owner = "client!oh", name = "E", descriptor = "I")
    public static int field6461;

    @OriginalMember(owner = "client!oh", name = "H", descriptor = "I")
    public static int field6464;

    @OriginalMember(owner = "client!oh", name = "C", descriptor = "Lbi;")
    private class143 field6459;

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "Ltp;")
    private class196 field6441;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "Ldj;")
    public class314 field6437;

    @OriginalMember(owner = "client!oh", name = "y", descriptor = "Lqh;")
    private class337 field6455;

    @OriginalMember(owner = "client!oh", name = "L", descriptor = "[I")
    public static int[] field6468;

    @OriginalMember(owner = "client!oh", name = "u", descriptor = "[Z")
    private boolean[] field6451;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Z)V")
    public static final void method2717(boolean arg0) {
        class370.field5384.method2477(-14221);
        field6433++;
        class375 var1 = (class375) class138.field1885.method2478(1603);
        if (!arg0) {
            method2722((byte) 102);
        }
        while (var1 != null) {
            if (var1.field5469 < 1000) {
                var1.method1820(-25246);
                class370.field5384.method2484(0, var1);
            }
            var1 = (class375) class138.field1885.method2486((byte) -82);
        }
        class370.field5384.method2488(3451, class138.field1885);
        if (class157.field2113 != null || class196.field2780 > 0) {
            return;
        }
        int var2 = -1;
        if (class78.field986 != null) {
            var2 = class78.field986.method2441(-3);
        }
        if (!class286.field4210) {
            if (class153.field2064 >= 0) {
                var2 = class153.field2064;
            }
            class153.field2064 = -1;
            if (var2 == 0 && (class24.field332 == 1 && class237.field3532 > 2 || class358.method2277(-3497))) {
                var2 = 2;
            }
            if (var2 == 2 && class237.field3532 > 0) {
                if (class78.field986 == null) {
                    class56.method425(class136.field1869, class241.field3572, false);
                } else {
                    class56.method425(class78.field986.method2440(-1), class78.field986.method2437((byte) 26), false);
                }
            }
            if (var2 != 0 || class237.field3532 <= 0) {
                return;
            }
            class74.method524(118);
            return;
        }
        if (var2 == -1) {
            int var3 = class223.field3295.method411(0);
            int var4 = class223.field3295.method415(-112);
            if (var3 < (class427.field6215 - 10) || var3 > class427.field6215 + class466.field6860 + 10 || (class441.field6420 - 10) > var4 || var4 > class130.field1732 + class441.field6420 + 10) {
                class286.field4210 = false;
                class3.method23(class441.field6420, class427.field6215, class130.field1732, class466.field6860, 255);
            }
        }
        if (var2 != 0) {
            return;
        }
        int var5 = class427.field6215;
        int var6 = class441.field6420;
        int var7 = class466.field6860;
        int var8 = class78.field986.method2437((byte) 26);
        int var9 = class78.field986.method2440(-1);
        int var10 = -1;
        for (int var11 = 0; var11 < class237.field3532; var11++) {
            if (class92.field1144) {
                int var16 = var6 + ((class237.field3532 + -1 - var11) * 16) + 33;
                if (var5 < var8 && (var5 + var7) > var8 && (var16 - 13) < var9 && var9 < (var16 + 4)) {
                    var10 = var11;
                }
            } else {
                int var15 = (class237.field3532 - var11 - 1) * 16 + var6 + 31;
                if (var5 < var8 && var8 < (var5 + var7) && (var15 - 13) < var9 && var15 + 3 > var9) {
                    var10 = var11;
                }
            }
        }
        if (var10 != -1) {
            int var12 = 0;
            class145 var13 = new class145(class138.field1885);
            for (class375 var14 = (class375) var13.method1005(0); var14 != null; var14 = (class375) var13.method1006((byte) -25)) {
                if (var10 == var12) {
                    class264.method1819(var14, -76);
                }
                var12++;
            }
        }
        class286.field4210 = false;
        class3.method23(class441.field6420, class427.field6215, class130.field1732, class466.field6860, 255);
        return;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZIZILfp;IZ)Lbi;")
    public final class143 method2718(boolean arg0, int arg1, boolean arg2, int arg3, class9 arg4, int arg5, boolean arg6) {
        field6464++;
        class178 var8 = class450.method2785(this.field6453, (byte) 118);
        if (var8.field2489 != null) {
            var8 = var8.method1240((byte) -116);
        }
        if (var8 == null) {
            this.method2726(18143, arg4);
            this.field6435 = -1;
            this.field6446 = this.field6460;
            return null;
        }
        if (!this.field6463 && this.field6435 != var8.field2455) {
            this.field6459 = null;
            this.method2723(-12248, -1);
        }
        this.method2725(arg3, arg1, 16);
        boolean var9 = arg2 & class213.field3010 != 0 & this.field6443;
        boolean var10 = var9 & (this.field6435 != var8.field2455 || (this.field6460 != this.field6446 || this.field6441 != null && (this.field6441.field2766 || class47.field616) && this.field6460 != this.field6457) && class213.field3010 >= 2);
        if (arg0 && !var10) {
            this.field6435 = var8.field2455;
            this.field6446 = this.field6460;
            return null;
        }
        if (arg6) {
            this.field6460 = 23;
        }
        if (var10) {
            class146.method1013(this.field6455, this.field6467, this.field6452, this.field6438, this.field6451);
        }
        class378 var11 = class215.field3069[this.field6467];
        class378 var12;
        if (this.field6440) {
            var12 = class28.field401[0];
        } else {
            var12 = this.field6467 >= 3 ? null : class215.field3069[this.field6467 + 1];
        }
        class143 var13 = null;
        if (this.field6441 != null) {
            if (var10) {
                arg5 |= 0x20000;
            }
            var13 = var8.method1237(arg4, this.field6462 == 11 ? 10 : this.field6462, arg5, var12, this.field6441, this.field6438, this.field6462 == 11 ? this.field6465 + 4 : this.field6465, -76, var11.method1427(this.field6452, this.field6438), this.field6452, this.field6457, this.field6460, this.field6439, var11);
            if (var13 == null) {
                this.field6451 = null;
                this.field6455 = null;
                this.field6447 = 0;
            } else {
                if (var10) {
                    if (this.field6451 == null) {
                        this.field6451 = new boolean[4];
                    }
                    this.field6455 = var13.method982(this.field6455);
                    class163.method1079(this.field6455, this.field6467, arg1, arg3, this.field6451);
                }
                this.field6447 = var13.method950();
            }
            this.field6459 = null;
        } else if (this.field6459 != null && (this.field6459.method961() & arg5) == arg5 && this.field6435 == var8.field2455) {
            var13 = this.field6459;
        } else {
            if (this.field6459 != null) {
                arg5 |= this.field6459.method961();
            }
            class441 var14 = var8.method1238(var12, this.field6438, this.field6452, this.field6462 == 11 ? 10 : this.field6462, var10, var11.method1427(this.field6452, this.field6438), arg4, arg5, 123, var11, this.field6462 == 11 ? this.field6465 + 4 : this.field6465);
            if (var14 == null) {
                this.field6447 = 0;
                this.field6459 = null;
                this.field6455 = null;
                this.field6451 = null;
            } else {
                var13 = var14.field6414;
                this.field6459 = var14.field6414;
                if (var10) {
                    this.field6455 = var14.field6419;
                    this.field6451 = null;
                    class163.method1079(this.field6455, this.field6467, arg1, arg3, (boolean[]) null);
                }
                this.field6447 = var13.method950();
            }
        }
        this.field6435 = var8.field2455;
        this.field6452 = arg1;
        this.field6438 = arg3;
        this.field6446 = this.field6460;
        return var13;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZIII)I")
    public static final int method2719(boolean arg0, int arg1, int arg2, int arg3) {
        field6444++;
        class243 var4 = class46.method378(arg1, arg0, false);
        int var5 = 39 / ((32 - arg3) / 32);
        if (var4 == null) {
            return 0;
        } else if (arg2 >= 0 && arg2 < var4.field3607.length) {
            return var4.field3607[arg2];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IBIIZLfp;Lbi;I)V")
    public final void method2720(int arg0, byte arg1, int arg2, int arg3, boolean arg4, class9 arg5, class143 arg6, int arg7) {
        field6449++;
        class133[] var9 = arg6.method945();
        class226[] var10 = arg6.method951();
        if ((this.field6437 == null || this.field6437.field4599) && (var9 != null || var10 != null)) {
            class178 var11 = class450.method2785(this.field6453, (byte) 87);
            if (var11.field2489 != null) {
                var11 = var11.method1240((byte) -116);
            }
            if (var11 != null) {
                this.field6437 = new class314(class388.field5665);
            }
        }
        if (this.field6437 != null) {
            if (arg4) {
                this.field6437.method2072(arg5, (long) class388.field5665, var9, var10, false);
            } else {
                this.field6437.method2069((long) class388.field5665);
            }
            this.field6437.method2073(this.field6466, arg7, arg3, arg0, arg2);
        }
        if (arg1 < 67) {
            this.method2725(-106, 71, 11);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)Ltd;")
    public static final class110 method2721(int arg0, int arg1) {
        field6458++;
        if (arg0 != -12) {
            method2719(false, -43, -53, 61);
        }
        class110 var2 = (class110) class34.field492.method2310((byte) -128, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class195.field2750.method715(arg1, (byte) 93, 36);
        class110 var4 = new class110();
        var4.field1506 = arg1;
        if (var3 != null) {
            var4.method777(new class256(var3), 29021);
        }
        var4.method779(-6);
        class34.field492.method2299(true, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)V")
    public static void method2722(byte arg0) {
        field6468 = null;
        field6436 = null;
        if (arg0 != 119) {
            field6468 = null;
        }
        field6448 = null;
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(II)V")
    private final void method2723(int arg0, int arg1) {
        field6442++;
        int var3 = arg1;
        boolean var4 = false;
        if (arg1 == -1) {
            class178 var5 = class450.method2785(this.field6453, (byte) 92);
            class178 var6 = var5;
            if (var5.field2489 != null) {
                var5 = var5.method1240((byte) -116);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field2469 != null) {
                if (this.field6441 != null && var5.method1231(arg0 + 12248, this.field6441.field2783)) {
                    return;
                }
                var3 = var5.method1242((byte) 58);
                if (this.field6435 != var5.field2455) {
                    var4 = var5.field2499;
                }
            } else if (var5.field2494 == -1) {
                if (var6 != null && var6.field2469 != null) {
                    if (this.field6441 != null && var6.method1231(0, this.field6441.field2783)) {
                        return;
                    }
                    var3 = var6.method1242((byte) 58);
                    if (this.field6435 != var6.field2455) {
                        var4 = var6.field2499;
                    }
                } else if (var6 != null && var6.field2494 != -1 && this.field6435 != var6.field2455) {
                    var4 = var6.field2499;
                    var3 = var6.field2494;
                }
            } else if (this.field6435 != var5.field2455) {
                var3 = var5.field2494;
                var4 = var5.field2499;
            }
        }
        if (var3 == -1) {
            this.field6441 = null;
            return;
        }
        this.field6459 = null;
        if (this.field6441 == null || this.field6441.field2783 != var3) {
            this.field6441 = class83.method556(var3, 69);
        } else if (this.field6441.field2769 == 0) {
            return;
        }
        if (this.field6441.field2784 == null) {
            this.field6441 = null;
            return;
        }
        if (var4) {
            this.field6460 = (int) ((double) this.field6441.field2784.length * Math.random());
            this.field6439 = ((int) ((double) this.field6441.field2763[this.field6460] * Math.random())) + 1;
        } else {
            this.field6439 = 1;
            this.field6460 = 0;
        }
        if (arg0 != -12248) {
            this.method2718(false, 126, false, -37, (class9) null, -5, false);
        }
        this.field6457 = this.field6460 + 1;
        if (this.field6457 < 0 || this.field6441.field2784.length <= this.field6457) {
            this.field6457 = -1;
        }
        this.field6434 = class388.field5665 - this.field6439;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lfp;I)V")
    public final void method2724(class9 arg0, int arg1) {
        this.method2718(true, this.field6452, true, this.field6438, arg0, 131072, false);
        field6454++;
        if (arg1 <= 19) {
            this.field6462 = 126;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(III)V")
    private final void method2725(int arg0, int arg1, int arg2) {
        field6431++;
        if (arg2 != 16) {
            return;
        }
        label90: while (true) {
            if (this.field6441 == null) {
                if (this.field6463) {
                    return;
                }
                this.method2723(-12248, -1);
                if (this.field6441 == null) {
                    return;
                }
            }
            int var4 = class388.field5665 - this.field6434;
            if (var4 > 100 && this.field6441.field2761 > 0) {
                int var5 = this.field6441.field2784.length - this.field6441.field2761;
                while (var5 > this.field6460 && this.field6441.field2763[this.field6460] < var4) {
                    var4 -= this.field6441.field2763[this.field6460];
                    this.field6460++;
                }
                if (var5 <= this.field6460) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field6441.field2784.length; var7++) {
                        var6 += this.field6441.field2763[var7];
                    }
                    var4 %= var6;
                }
                this.field6457 = this.field6460 + 1;
                if (this.field6441.field2784.length <= this.field6457) {
                    this.field6457 -= this.field6441.field2761;
                    if (this.field6457 < 0 || this.field6441.field2784.length <= this.field6457) {
                        this.field6457 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (this.field6441.field2763[this.field6460] >= var4) {
                            this.field6434 = class388.field5665 - var4;
                            this.field6439 = var4;
                            return;
                        }
                        class446.method2739(this.field6441, false, this.field6466, this.field6460, -49, arg1, arg0);
                        var4 -= this.field6441.field2763[this.field6460];
                        this.field6460++;
                        if (this.field6441.field2784.length <= this.field6460) {
                            this.field6460 -= this.field6441.field2761;
                            if (this.field6460 < 0 || this.field6441.field2784.length <= this.field6460) {
                                this.field6441 = null;
                                continue label90;
                            }
                        }
                        this.field6457 = this.field6460 + 1;
                    } while (this.field6441.field2784.length > this.field6457);
                    this.field6457 -= this.field6441.field2761;
                } while (this.field6457 >= 0 && this.field6457 < this.field6441.field2784.length);
                this.field6457 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILfp;)V")
    public final void method2726(int arg0, class9 arg1) {
        field6456++;
        if (this.field6455 != null) {
            class146.method1013(this.field6455, this.field6467, this.field6452, this.field6438, this.field6451);
            this.field6451 = null;
            this.field6455 = null;
        }
        if (arg0 != 18143) {
            this.method2718(false, -37, true, -66, (class9) null, 108, false);
        }
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(II)V")
    public final void method2727(int arg0, int arg1) {
        this.field6463 = true;
        if (arg0 != 10) {
            this.method2723(-99, -114);
        }
        field6450++;
        this.method2723(arg0 ^ 0xFFFFD022, arg1);
    }

    @OriginalMember(owner = "client!oh", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field6432++;
        if (this.field6437 != null) {
            this.field6437.method2077();
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)I")
    public final int method2728(int arg0) {
        if (arg0 != 25997) {
            method2722((byte) 14);
        }
        field6461++;
        return this.field6447;
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)Z")
    public final boolean method2729(int arg0) {
        field6445++;
        int var2 = 31 % ((-arg0 - 58) / 62);
        return this.field6443;
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lfp;Lgn;IIIIIIZI)V")
    public class443(class9 arg0, class178 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field6462 = arg2;
        this.field6465 = arg3;
        this.field6466 = (byte) arg4;
        this.field6453 = arg1.field2455;
        this.field6452 = arg6;
        this.field6467 = (byte) arg5;
        this.field6440 = arg8;
        this.field6438 = arg7;
        this.field6443 = arg0.method94() && arg1.field2478 && !this.field6440;
        if (arg9 != -1) {
            this.field6463 = true;
        }
        this.method2723(-12248, arg9);
    }
}
