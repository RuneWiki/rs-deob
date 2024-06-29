import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class205 {

    @OriginalMember(owner = "client!lm", name = "m", descriptor = "I")
    private int field3075 = -1;

    @OriginalMember(owner = "client!lm", name = "E", descriptor = "I")
    private int field3093 = -1;

    @OriginalMember(owner = "client!lm", name = "w", descriptor = "Z")
    private boolean field3085 = false;

    @OriginalMember(owner = "client!lm", name = "G", descriptor = "I")
    private int field3095 = 0;

    @OriginalMember(owner = "client!lm", name = "v", descriptor = "Z")
    private boolean field3084 = false;

    @OriginalMember(owner = "client!lm", name = "x", descriptor = "I")
    private int field3086 = -1;

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "I")
    private int field3066 = 0;

    @OriginalMember(owner = "client!lm", name = "s", descriptor = "B")
    private byte field3081;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "I")
    public int field3063;

    @OriginalMember(owner = "client!lm", name = "k", descriptor = "B")
    private byte field3073;

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "I")
    public int field3068;

    @OriginalMember(owner = "client!lm", name = "B", descriptor = "Ljw;")
    private class280 field3090;

    @OriginalMember(owner = "client!lm", name = "C", descriptor = "I")
    public int field3091;

    @OriginalMember(owner = "client!lm", name = "q", descriptor = "Z")
    private boolean field3079;

    @OriginalMember(owner = "client!lm", name = "p", descriptor = "Lqp;")
    public static class715 field3078 = new class715(16);

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!lm", name = "i", descriptor = "I")
    public static int field3071;

    @OriginalMember(owner = "client!lm", name = "j", descriptor = "I")
    private int field3072;

    @OriginalMember(owner = "client!lm", name = "l", descriptor = "I")
    private int field3074;

    @OriginalMember(owner = "client!lm", name = "n", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!lm", name = "o", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!lm", name = "r", descriptor = "I")
    private int field3080;

    @OriginalMember(owner = "client!lm", name = "t", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!lm", name = "u", descriptor = "I")
    public static int field3083;

    @OriginalMember(owner = "client!lm", name = "y", descriptor = "I")
    private int field3087;

    @OriginalMember(owner = "client!lm", name = "z", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!lm", name = "D", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!lm", name = "F", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!lm", name = "I", descriptor = "I")
    public static int field3097;

    @OriginalMember(owner = "client!lm", name = "A", descriptor = "Lvo;")
    private class131 field3089;

    @OriginalMember(owner = "client!lm", name = "H", descriptor = "Lta;")
    public class27 field3096;

    @OriginalMember(owner = "client!lm", name = "h", descriptor = "Lka;")
    private class282 field3070;

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "Lr;")
    private class704 field3069;

    @OriginalMember(owner = "client!lm", name = "J", descriptor = "[Z")
    private boolean[] field3098;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILha;)V")
    public final void method1461(int arg0, class543 arg1) {
        if (arg0 <= 14) {
            this.field3093 = 99;
        }
        field3082++;
        if (this.field3069 != null) {
            class659.method3762(this.field3069, this.field3081, this.field3090.field3923, this.field3090.field3916, this.field3098);
            this.field3098 = null;
            this.field3069 = null;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(II)V")
    public final void method1462(int arg0, int arg1) {
        field3065++;
        this.field3084 = true;
        this.method1469(arg1, 1);
        if (arg0 <= 42) {
            this.method1464(97);
        }
    }

    @OriginalMember(owner = "client!lm", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field3094++;
        if (this.field3096 != null) {
            this.field3096.method124();
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)V")
    public static void method1463(byte arg0) {
        if (arg0 == 81) {
            field3078 = null;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)I")
    public final int method1464(int arg0) {
        field3083++;
        if (arg0 != 0) {
            this.method1471(-51, -30, true, false, null);
        }
        return this.field3066;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(BLjw;)V")
    private final void method1465(byte arg0, class280 arg1) {
        field3097++;
        if (arg0 <= 74) {
            return;
        }
        label90: while (true) {
            if (this.field3089 == null) {
                if (this.field3084) {
                    return;
                }
                this.method1469(-1, 1);
                if (this.field3089 == null) {
                    return;
                }
            }
            int var3 = class703.field9918 - this.field3087;
            if (var3 > 100 && this.field3089.field1800 > 0) {
                int var4 = this.field3089.field1792.length - this.field3089.field1800;
                while (this.field3074 < var4 && var3 > this.field3089.field1812[this.field3074]) {
                    var3 -= this.field3089.field1812[this.field3074];
                    this.field3074++;
                }
                if (this.field3074 >= var4) {
                    int var5 = 0;
                    for (int var6 = var4; var6 < this.field3089.field1792.length; var6++) {
                        var5 += this.field3089.field1812[var6];
                    }
                    var3 %= var5;
                }
                this.field3080 = this.field3074 + 1;
                if (this.field3089.field1792.length <= this.field3080) {
                    this.field3080 -= this.field3089.field1800;
                    if (this.field3080 < 0 || this.field3089.field1792.length <= this.field3080) {
                        this.field3080 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (var3 <= this.field3089.field1812[this.field3074]) {
                            this.field3087 = class703.field9918 - var3;
                            this.field3072 = var3;
                            return;
                        }
                        class701.method3941(this.field3074, this.field3089, (byte) 101, arg1);
                        var3 -= this.field3089.field1812[this.field3074];
                        this.field3074++;
                        if (this.field3074 >= this.field3089.field1792.length) {
                            this.field3074 -= this.field3089.field1800;
                            if (this.field3074 < 0 || this.field3074 >= this.field3089.field1792.length) {
                                this.field3089 = null;
                                continue label90;
                            }
                        }
                        this.field3080 = this.field3074 + 1;
                    } while (this.field3080 < this.field3089.field1792.length);
                    this.field3080 -= this.field3089.field1800;
                } while (this.field3080 >= 0 && this.field3080 < this.field3089.field1792.length);
                this.field3080 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IILka;ZLha;IIILsk;)V")
    public final void method1466(int arg0, int arg1, class282 arg2, boolean arg3, class543 arg4, int arg5, int arg6, int arg7, class121 arg8) {
        field3071++;
        class108[] var10 = arg2.method517();
        if (arg5 != -1) {
            method1463((byte) 48);
        }
        class647[] var11 = arg2.method502();
        if ((this.field3096 == null || this.field3096.field244) && (var10 != null || var11 != null)) {
            class482 var12 = class375.field5421.method2680(this.field3063, (byte) 107);
            if (var12.field6900 != null) {
                var12 = var12.method2952(-1, class226.field3372);
            }
            if (var12 != null) {
                this.field3096 = class27.method128(class703.field9918, true);
            }
        }
        if (this.field3096 == null) {
            return;
        }
        arg2.method491(arg8);
        if (arg3) {
            this.field3096.method126(arg4, (long) class703.field9918, var10, var11, false);
        } else {
            this.field3096.method122((long) class703.field9918);
        }
        this.field3096.method130(this.field3073, arg7, arg1, arg0, arg6);
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)I")
    public final int method1467(int arg0) {
        field3064++;
        if (arg0 != -1) {
            this.method1461(103, null);
        }
        return this.field3095;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lha;I)V")
    public final void method1468(class543 arg0, int arg1) {
        if (arg1 < -70) {
            this.method1471(-2615, 262144, true, true, arg0);
            field3088++;
        }
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(II)V")
    private final void method1469(int arg0, int arg1) {
        if (arg1 != 1) {
            this.field3070 = null;
        }
        field3076++;
        int var3 = arg0;
        boolean var4 = false;
        if (arg0 == -1) {
            class482 var5 = class375.field5421.method2680(this.field3063, (byte) 100);
            class482 var6 = var5;
            if (var5.field6900 != null) {
                var5 = var5.method2952(-1, class226.field3372);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field6945 != null) {
                if (this.field3089 != null && var5.method2943(0, this.field3089.field1799)) {
                    return;
                }
                var3 = var5.method2954(-18445);
                if (this.field3093 != var5.field6965) {
                    var4 = var5.field6950;
                }
            } else if (var5.field6906 == -1) {
                if (var6 != null && var6.field6945 != null) {
                    if (this.field3089 != null && var6.method2943(0, this.field3089.field1799)) {
                        return;
                    }
                    var3 = var6.method2954(arg1 ^ 0xFFFFB7F2);
                    if (this.field3093 != var6.field6965) {
                        var4 = var6.field6950;
                    }
                } else if (var6 != null && var6.field6906 != -1 && this.field3093 != var6.field6965) {
                    var4 = var6.field6950;
                    var3 = var6.field6906;
                }
            } else if (this.field3093 != var5.field6965) {
                var4 = var5.field6950;
                var3 = var5.field6906;
            }
        }
        if (var3 == -1) {
            this.field3089 = null;
            return;
        }
        this.field3070 = null;
        if (this.field3089 == null || this.field3089.field1799 != var3) {
            this.field3089 = class610.field8698.method2999(var3, false);
        } else if (this.field3089.field1806 == 0) {
            return;
        }
        if (this.field3089.field1792 == null) {
            this.field3089 = null;
            return;
        }
        if (var4) {
            this.field3074 = (int) ((double) this.field3089.field1792.length * Math.random());
            this.field3072 = (int) ((double) this.field3089.field1812[this.field3074] * Math.random()) + 1;
        } else {
            this.field3074 = 0;
            this.field3072 = 1;
        }
        this.field3080 = this.field3074 + 1;
        if (this.field3080 < 0 || this.field3080 >= this.field3089.field1792.length) {
            this.field3080 = -1;
        }
        this.field3087 = class703.field9918 - this.field3072;
    }

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "(I)Z")
    public final boolean method1470(int arg0) {
        field3067++;
        if (arg0 != -12) {
            this.field3068 = 96;
        }
        return this.field3079;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIZZLha;)Lka;")
    public final class282 method1471(int arg0, int arg1, boolean arg2, boolean arg3, class543 arg4) {
        field3077++;
        class482 var6 = class375.field5421.method2680(this.field3063, (byte) 108);
        if (arg0 != -2615) {
            this.method1464(-37);
        }
        if (var6.field6900 != null) {
            var6 = var6.method2952(-1, class226.field3372);
        }
        if (var6 == null) {
            this.method1461(95, arg4);
            this.field3093 = -1;
            this.field3086 = -1;
            this.field3075 = -1;
            return null;
        }
        if (!this.field3084 && this.field3093 != var6.field6965) {
            this.field3070 = null;
            this.method1469(-1, 1);
        }
        this.method1465((byte) 108, this.field3090);
        if (arg2) {
            boolean var7 = arg2 & this.field3079 & class243.field3580.field8007.method435(false) != 0;
            arg2 = var7 & (this.field3075 != var6.field6965 || this.field3089 != null && class243.field3580.field8007.method435(false) >= 2 && (this.field3086 != this.field3074 || (this.field3089.field1791 || class316.field4266) && this.field3080 != this.field3074));
        }
        if (arg3 && !arg2) {
            this.field3093 = var6.field6965;
            return null;
        }
        if (arg2) {
            class659.method3762(this.field3069, this.field3081, this.field3090.field3923, this.field3090.field3916, this.field3098);
            this.field3075 = -1;
            this.field3086 = -1;
        }
        class339 var8 = class95.field1372[this.field3081];
        class339 var9;
        if (this.field3085) {
            var9 = class491.field7079[0];
        } else {
            var9 = this.field3081 >= 3 ? null : class95.field1372[this.field3081 + 1];
        }
        class282 var10 = null;
        if (this.field3089 != null) {
            if (arg2) {
                arg1 |= 0x40000;
            }
            var10 = var6.method2940(arg1, this.field3074, (byte) 1, this.field3072, this.field3090.field3923, this.field3068 == 11 ? 10 : this.field3068, var8, this.field3090.field3916, var8.method2089(arg0 ^ 0xFFFF9299, this.field3090.field3923, this.field3090.field3916), arg4, this.field3068 == 11 ? this.field3091 + 4 : this.field3091, var9, this.field3080, this.field3089);
            if (var10 == null) {
                this.field3066 = 0;
                this.field3095 = 0;
                this.field3098 = null;
                this.field3069 = null;
            } else {
                if (arg2) {
                    if (this.field3098 == null) {
                        this.field3098 = new boolean[4];
                    }
                    this.field3069 = var10.method540(this.field3069);
                    class667.method3808(this.field3069, this.field3081, this.field3090.field3923, this.field3090.field3916, this.field3098);
                    this.field3075 = var6.field6965;
                    this.field3086 = this.field3074;
                }
                this.field3095 = var10.method511();
                this.field3066 = var10.method507();
            }
            this.field3070 = null;
        } else if (this.field3070 != null && (arg1 & this.field3070.method528()) == arg1 && this.field3093 == var6.field6965) {
            var10 = this.field3070;
        } else {
            if (this.field3070 != null) {
                arg1 |= this.field3070.method528();
            }
            class495 var11 = var6.method2942(this.field3090.field3923, this.field3068 == 11 ? this.field3091 + 4 : this.field3091, arg2, this.field3090.field3916, this.field3068 == 11 ? 10 : this.field3068, arg1, arg4, var8.method2089(arg0 ^ 0xFFFF9299, this.field3090.field3923, this.field3090.field3916), (byte) 119, var8, var9);
            if (var11 == null) {
                this.field3066 = 0;
                this.field3098 = null;
                this.field3070 = null;
                this.field3095 = 0;
                this.field3069 = null;
            } else {
                var10 = var11.field7119;
                this.field3070 = var11.field7119;
                if (arg2) {
                    this.field3069 = var11.field7117;
                    this.field3098 = null;
                    class667.method3808(this.field3069, this.field3081, this.field3090.field3923, this.field3090.field3916, null);
                    this.field3075 = var6.field6965;
                    this.field3086 = -1;
                }
                this.field3095 = var10.method511();
                this.field3066 = var10.method507();
            }
        }
        this.field3093 = var6.field6965;
        return var10;
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lha;Lrq;IIIILjw;ZI)V")
    public class205(class543 arg0, class482 arg1, int arg2, int arg3, int arg4, int arg5, class280 arg6, boolean arg7, int arg8) {
        this.field3081 = (byte) arg5;
        this.field3063 = arg1.field6965;
        this.field3073 = (byte) arg4;
        this.field3068 = arg2;
        this.field3090 = arg6;
        this.field3085 = arg7;
        this.field3091 = arg3;
        this.field3079 = arg0.method365() && arg1.field6892 && !this.field3085;
        if (arg8 != -1) {
            this.field3084 = true;
        }
        this.method1469(arg8, 1);
    }
}
