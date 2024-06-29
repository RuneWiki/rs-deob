import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class201 {

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "Z")
    private boolean field3063 = false;

    @OriginalMember(owner = "client!mu", name = "l", descriptor = "Z")
    private boolean field3072 = false;

    @OriginalMember(owner = "client!mu", name = "w", descriptor = "I")
    private int field3083 = -1;

    @OriginalMember(owner = "client!mu", name = "r", descriptor = "I")
    private int field3078 = -32768;

    @OriginalMember(owner = "client!mu", name = "n", descriptor = "I")
    private int field3074 = -1;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "B")
    private byte field3061;

    @OriginalMember(owner = "client!mu", name = "f", descriptor = "I")
    public int field3066;

    @OriginalMember(owner = "client!mu", name = "D", descriptor = "I")
    public int field3090;

    @OriginalMember(owner = "client!mu", name = "i", descriptor = "B")
    private byte field3069;

    @OriginalMember(owner = "client!mu", name = "y", descriptor = "I")
    private int field3085;

    @OriginalMember(owner = "client!mu", name = "C", descriptor = "I")
    public int field3089;

    @OriginalMember(owner = "client!mu", name = "u", descriptor = "I")
    private int field3081;

    @OriginalMember(owner = "client!mu", name = "A", descriptor = "Z")
    private boolean field3087;

    @OriginalMember(owner = "client!mu", name = "v", descriptor = "I")
    public static int field3082 = 0;

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!mu", name = "d", descriptor = "I")
    private int field3064;

    @OriginalMember(owner = "client!mu", name = "e", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!mu", name = "g", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!mu", name = "k", descriptor = "I")
    public static int field3071;

    @OriginalMember(owner = "client!mu", name = "p", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!mu", name = "q", descriptor = "I")
    private int field3077;

    @OriginalMember(owner = "client!mu", name = "s", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!mu", name = "t", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!mu", name = "z", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!mu", name = "B", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!mu", name = "E", descriptor = "I")
    public static int field3091;

    @OriginalMember(owner = "client!mu", name = "G", descriptor = "I")
    private int field3093;

    @OriginalMember(owner = "client!mu", name = "H", descriptor = "I")
    private int field3094;

    @OriginalMember(owner = "client!mu", name = "j", descriptor = "Luh;")
    public class115 field3070;

    @OriginalMember(owner = "client!mu", name = "x", descriptor = "Lkg;")
    private class183 field3084;

    @OriginalMember(owner = "client!mu", name = "F", descriptor = "Lka;")
    private class336 field3092;

    @OriginalMember(owner = "client!mu", name = "m", descriptor = "Lia;")
    private class424 field3073;

    @OriginalMember(owner = "client!mu", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field3075;

    @OriginalMember(owner = "client!mu", name = "h", descriptor = "[Z")
    private boolean[] field3068;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)I", line = 9)
    public final int method1359(int arg0) {
        if (arg0 != 0) {
            this.method1361(33, true, null, -7, -28, true, -104);
        }
        field3086++;
        return this.field3078;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(BI)V", line = 21)
    public final void method1360(byte arg0, int arg1) {
        if (arg0 == 126) {
            field3071++;
            this.field3072 = true;
            this.method1367(arg1, (byte) -20);
        }
    }

    @OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Lqa;Lku;IIIIIIZI)V", line = 522)
    public class201(class167 arg0, class261 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field3061 = (byte) arg4;
        this.field3066 = arg2;
        this.field3090 = arg3;
        this.field3069 = (byte) arg5;
        this.field3063 = arg8;
        this.field3085 = arg6;
        this.field3089 = arg1.field3882;
        this.field3081 = arg7;
        this.field3087 = arg0.method346() && arg1.field3929 && !this.field3063;
        if (arg9 != -1) {
            this.field3072 = true;
        }
        this.method1367(arg9, (byte) -20);
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(IZLqa;IIZI)Lka;", line = 38)
    public final class336 method1361(int arg0, boolean arg1, class167 arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field3067++;
        class261 var8 = class277.field4139.method569((byte) 97, this.field3089);
        if (var8.field3926 != null) {
            var8 = var8.method1679(class84.field1335, 1349439392);
        }
        if (var8 == null) {
            this.method1362(arg2, -12);
            this.field3083 = -1;
            this.field3074 = this.field3077;
            return null;
        }
        if (!this.field3072 && this.field3083 != var8.field3882) {
            this.field3092 = null;
            this.method1367(-1, (byte) -20);
        }
        this.method1363(104, arg6, arg4);
        boolean var9 = arg1 & this.field3087 & class220.field3371.method1213((byte) -35, class74.field1211) != 0;
        boolean var10 = var9 & (this.field3083 != var8.field3882 || (this.field3077 != this.field3074 || this.field3084 != null && (this.field3084.field2709 || class89.field1441) && this.field3093 != this.field3077) && class220.field3371.method1213((byte) -35, class74.field1211) >= 2);
        if (arg5 && !var10) {
            this.field3083 = var8.field3882;
            this.field3074 = this.field3077;
            return null;
        }
        if (var10) {
            class354.method2211(this.field3073, this.field3069, this.field3085, this.field3081, this.field3068);
        }
        class24 var11 = class146.field2262[this.field3069];
        class24 var12;
        if (this.field3063) {
            var12 = class393.field5594[0];
        } else {
            var12 = this.field3069 >= 3 ? null : class146.field2262[this.field3069 + 1];
        }
        class336 var13 = null;
        if (arg3 <= 90) {
            return null;
        }
        if (this.field3084 != null) {
            if (var10) {
                arg0 |= 0x40000;
            }
            var13 = var8.method1686((byte) 101, this.field3093, var12, this.field3084, this.field3081, arg2, this.field3066 == 11 ? this.field3090 + 4 : this.field3090, this.field3066 == 11 ? 10 : this.field3066, this.field3094, var11.method143(this.field3085, this.field3081), this.field3077, arg0, var11, this.field3085);
            if (var13 == null) {
                this.field3068 = null;
                this.field3073 = null;
                this.field3078 = 0;
            } else {
                if (var10) {
                    if (this.field3068 == null) {
                        this.field3068 = new boolean[4];
                    }
                    this.field3073 = var13.method1171(this.field3073);
                    class359.method2231(this.field3073, this.field3069, arg6, arg4, this.field3068);
                }
                this.field3078 = var13.method1130();
            }
            this.field3092 = null;
        } else if (this.field3092 != null && (this.field3092.method1166() & arg0) == arg0 && this.field3083 == var8.field3882) {
            var13 = this.field3092;
        } else {
            if (this.field3092 != null) {
                arg0 |= this.field3092.method1166();
            }
            class335 var14 = var8.method1691(var12, arg2, -63, this.field3085, var11, this.field3066 == 11 ? 10 : this.field3066, arg0, var11.method143(this.field3085, this.field3081), this.field3081, var10, this.field3066 == 11 ? this.field3090 + 4 : this.field3090);
            if (var14 == null) {
                this.field3092 = null;
                this.field3078 = 0;
                this.field3073 = null;
                this.field3068 = null;
            } else {
                var13 = var14.field4960;
                this.field3092 = var14.field4960;
                if (var10) {
                    this.field3073 = var14.field4962;
                    this.field3068 = null;
                    class359.method2231(this.field3073, this.field3069, arg6, arg4, null);
                }
                this.field3078 = var13.method1130();
            }
        }
        this.field3085 = arg6;
        this.field3083 = var8.field3882;
        this.field3074 = this.field3077;
        this.field3081 = arg4;
        return var13;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Lqa;I)V", line = 163)
    public final void method1362(class167 arg0, int arg1) {
        if (this.field3073 != null) {
            class354.method2211(this.field3073, this.field3069, this.field3085, this.field3081, this.field3068);
            this.field3068 = null;
            this.field3073 = null;
        }
        if (arg1 != -12) {
            this.field3070 = null;
        }
        field3062++;
    }

    @OriginalMember(owner = "client!mu", name = "finalize", descriptor = "()V", line = 187)
    protected final void finalize() {
        field3079++;
        if (this.field3070 != null) {
            this.field3070.method813();
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(III)V", line = 210)
    private final void method1363(int arg0, int arg1, int arg2) {
        int var4 = 106 / ((-arg0 - 38) / 46);
        field3088++;
        label88: while (true) {
            if (this.field3084 == null) {
                if (this.field3072) {
                    return;
                }
                this.method1367(-1, (byte) -20);
                if (this.field3084 == null) {
                    return;
                }
            }
            int var5 = class24.field349 - this.field3064;
            if (var5 > 100 && this.field3084.field2691 > 0) {
                int var6 = this.field3084.field2692.length - this.field3084.field2691;
                while (this.field3077 < var6 && this.field3084.field2713[this.field3077] < var5) {
                    var5 -= this.field3084.field2713[this.field3077];
                    this.field3077++;
                }
                if (var6 <= this.field3077) {
                    int var7 = 0;
                    for (int var8 = var6; var8 < this.field3084.field2692.length; var8++) {
                        var7 += this.field3084.field2713[var8];
                    }
                    var5 %= var7;
                }
                this.field3093 = this.field3077 + 1;
                if (this.field3084.field2692.length <= this.field3093) {
                    this.field3093 -= this.field3084.field2691;
                    if (this.field3093 < 0 || this.field3084.field2692.length <= this.field3093) {
                        this.field3093 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (this.field3084.field2713[this.field3077] >= var5) {
                            this.field3064 = class24.field349 - var5;
                            this.field3094 = var5;
                            return;
                        }
                        class511.method2983(arg1, this.field3077, arg2, -64, false, this.field3084, this.field3061);
                        var5 -= this.field3084.field2713[this.field3077];
                        this.field3077++;
                        if (this.field3077 >= this.field3084.field2692.length) {
                            this.field3077 -= this.field3084.field2691;
                            if (this.field3077 < 0 || this.field3084.field2692.length <= this.field3077) {
                                this.field3084 = null;
                                continue label88;
                            }
                        }
                        this.field3093 = this.field3077 + 1;
                    } while (this.field3093 < this.field3084.field2692.length);
                    this.field3093 -= this.field3084.field2691;
                } while (this.field3093 >= 0 && this.field3084.field2692.length > this.field3093);
                this.field3093 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Lqa;B)V", line = 313)
    public final void method1364(class167 arg0, byte arg1) {
        if (arg1 != 79) {
            this.field3078 = 87;
        }
        this.method1361(262144, true, arg0, 95, this.field3081, true, this.field3085);
        field3076++;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Lka;IZIIILqa;B)V", line = 324)
    public final void method1365(class336 arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, class167 arg6, byte arg7) {
        field3080++;
        class248[] var9 = arg0.method1172();
        class280[] var10 = arg0.method1144();
        if ((this.field3070 == null || this.field3070.field1706) && (var9 != null || var10 != null)) {
            class261 var11 = class277.field4139.method569((byte) 111, this.field3089);
            if (var11.field3926 != null) {
                var11 = var11.method1679(class84.field1335, 1349439392);
            }
            if (var11 != null) {
                this.field3070 = class115.method810(class24.field349);
            }
        }
        if (this.field3070 != null) {
            if (arg2) {
                this.field3070.method817(arg6, (long) class24.field349, var9, var10, false);
            } else {
                this.field3070.method821((long) class24.field349);
            }
            this.field3070.method814(this.field3061, arg1, arg4, arg5, arg3);
        }
        if (arg7 < 14) {
            this.field3087 = false;
        }
    }

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "(I)Z", line = 372)
    public final boolean method1366(int arg0) {
        field3091++;
        if (arg0 != -20486) {
            method1368(92);
        }
        return this.field3087;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(IB)V", line = 391)
    private final void method1367(int arg0, byte arg1) {
        field3065++;
        int var3 = arg0;
        boolean var4 = false;
        if (arg0 == -1) {
            class261 var5 = class277.field4139.method569((byte) 117, this.field3089);
            class261 var6 = var5;
            if (var5.field3926 != null) {
                var5 = var5.method1679(class84.field1335, arg1 ^ 0xAF91304C);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field3849 != null) {
                if (this.field3084 != null && var5.method1680(5, this.field3084.field2705)) {
                    return;
                }
                var3 = var5.method1683(arg1 + 20);
                if (this.field3083 != var5.field3882) {
                    var4 = var5.field3862;
                }
            } else if (var5.field3932 == -1) {
                if (var6 != null && var6.field3849 != null) {
                    if (this.field3084 != null && var6.method1680(5, this.field3084.field2705)) {
                        return;
                    }
                    var3 = var6.method1683(0);
                    if (this.field3083 != var6.field3882) {
                        var4 = var6.field3862;
                    }
                } else if (var6 != null && var6.field3932 != -1 && this.field3083 != var6.field3882) {
                    var4 = var6.field3862;
                    var3 = var6.field3932;
                }
            } else if (this.field3083 != var5.field3882) {
                var3 = var5.field3932;
                var4 = var5.field3862;
            }
        }
        if (var3 == -1) {
            this.field3084 = null;
        } else if (arg1 == -20) {
            this.field3092 = null;
            if (this.field3084 == null || this.field3084.field2705 != var3) {
                this.field3084 = class96.field1526.method2717(-100, var3);
            } else if (this.field3084.field2687 == 0) {
                return;
            }
            if (this.field3084.field2692 == null) {
                this.field3084 = null;
            } else {
                if (var4) {
                    this.field3077 = (int) (Math.random() * (double) this.field3084.field2692.length);
                    this.field3094 = (int) ((double) this.field3084.field2713[this.field3077] * Math.random()) + 1;
                } else {
                    this.field3077 = 0;
                    this.field3094 = 1;
                }
                this.field3093 = this.field3077 + 1;
                if (this.field3093 < 0 || this.field3093 >= this.field3084.field2692.length) {
                    this.field3093 = -1;
                }
                this.field3064 = class24.field349 - this.field3094;
            }
        }
    }

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "(I)V", line = 513)
    public static void method1368(int arg0) {
        field3075 = null;
        if (arg0 != -1) {
            field3082 = -78;
        }
    }
}
