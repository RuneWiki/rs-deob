import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class222 extends class4 {

    @OriginalMember(owner = "client!md", name = "k", descriptor = "I")
    private int field3229 = -1;

    @OriginalMember(owner = "client!md", name = "y", descriptor = "Z")
    private boolean field3243 = false;

    @OriginalMember(owner = "client!md", name = "t", descriptor = "Z")
    private boolean field3238 = false;

    @OriginalMember(owner = "client!md", name = "F", descriptor = "I")
    private int field3250 = -1;

    @OriginalMember(owner = "client!md", name = "A", descriptor = "I")
    private int field3245 = -32768;

    @OriginalMember(owner = "client!md", name = "M", descriptor = "Laf;")
    private class176 field3257 = null;

    @OriginalMember(owner = "client!md", name = "B", descriptor = "I")
    private int field3246;

    @OriginalMember(owner = "client!md", name = "O", descriptor = "I")
    private int field3259;

    @OriginalMember(owner = "client!md", name = "p", descriptor = "I")
    private int field3234;

    @OriginalMember(owner = "client!md", name = "u", descriptor = "I")
    private int field3239;

    @OriginalMember(owner = "client!md", name = "E", descriptor = "I")
    private int field3249;

    @OriginalMember(owner = "client!md", name = "v", descriptor = "I")
    private int field3240;

    @OriginalMember(owner = "client!md", name = "I", descriptor = "I")
    private int field3253;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "Loe;")
    private class76 field3227;

    @OriginalMember(owner = "client!md", name = "r", descriptor = "I")
    private int field3236;

    @OriginalMember(owner = "client!md", name = "n", descriptor = "I")
    private int field3232;

    @OriginalMember(owner = "client!md", name = "L", descriptor = "I")
    private int field3256;

    @OriginalMember(owner = "client!md", name = "j", descriptor = "Lie;")
    public static class2 field3228 = new class2();

    @OriginalMember(owner = "client!md", name = "N", descriptor = "I")
    public static int field3258 = 0;

    @OriginalMember(owner = "client!md", name = "G", descriptor = "Lnh;")
    public static class312 field3251 = new class312(128);

    @OriginalMember(owner = "client!md", name = "P", descriptor = "I")
    public static int field3260 = 0;

    @OriginalMember(owner = "client!md", name = "l", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!md", name = "o", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!md", name = "q", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!md", name = "s", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!md", name = "w", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!md", name = "x", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!md", name = "z", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!md", name = "C", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!md", name = "D", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!md", name = "H", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!md", name = "J", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!md", name = "Q", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!md", name = "K", descriptor = "Llc;")
    public static class270 field3255;

    @OriginalMember(owner = "client!md", name = "m", descriptor = "Lui;")
    private class88 field3231;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IB)V")
    private final void method1541(int arg0, byte arg1) {
        field3252++;
        boolean var3 = false;
        int var4 = arg0;
        if (arg0 == -1) {
            class93 var5 = class48.method297(false, this.field3259);
            class93 var6 = var5;
            if (var5.field1528 != null) {
                var5 = var5.method710(0);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field1566 != null) {
                if (this.field3227 != null && var5.method718((byte) -53, this.field3227.field1208)) {
                    return;
                }
                var4 = var5.method703(-15701);
                if (this.field3250 != var5.field1505) {
                    var3 = var5.field1509;
                }
            } else if (var5.field1568 == -1) {
                if (var6 != null && var6.field1566 != null) {
                    if (this.field3227 != null && var6.method718((byte) -53, this.field3227.field1208)) {
                        return;
                    }
                    var4 = var6.method703(-15701);
                    if (this.field3250 != var6.field1505) {
                        var3 = var6.field1509;
                    }
                } else if (var6 != null && var6.field1568 != -1 && this.field3250 != var6.field1505) {
                    var3 = var6.field1509;
                    var4 = var6.field1568;
                }
            } else if (this.field3250 != var5.field1505) {
                var4 = var5.field1568;
                var3 = var5.field1509;
            }
        }
        if (var4 == -1) {
            this.field3227 = null;
            return;
        }
        if (this.field3227 == null || this.field3227.field1208 != var4) {
            this.field3227 = class232.method1609((byte) -32, var4);
        } else if (this.field3227.field1202 == 0) {
            return;
        }
        if (var3) {
            this.field3253 = (int) ((double) this.field3227.field1191.length * Math.random());
            this.field3256 = (int) ((double) this.field3227.field1194[this.field3253] * Math.random()) + 1;
        } else {
            this.field3256 = 1;
            this.field3253 = 0;
        }
        this.field3232 = this.field3253 + 1;
        if (arg1 < -75) {
            if (this.field3232 < 0 || this.field3227.field1191.length <= this.field3232) {
                this.field3232 = -1;
            }
            this.field3236 = class199.field2930 - this.field3256;
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(I)V")
    public static final void method1542(int arg0) {
        field3235++;
        if (arg0 >= -9) {
            method1545(60);
        }
        int var1 = 0;
        for (int var2 = 0; var2 < 104; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class197.method1395(var1, class223.field3286, true, var2, var3, (byte) -89)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IZ)Lff;")
    private final class4 method1543(int arg0, boolean arg1) {
        field3242++;
        boolean var3 = class297.field4763 != class103.field1792;
        class93 var4 = class48.method297(false, this.field3259);
        if (var4.field1528 != null) {
            var4 = var4.method710(0);
        }
        if (var4 == null) {
            this.field3229 = this.field3253;
            this.field3250 = -1;
            return null;
        }
        if (!this.field3238 && this.field3250 != var4.field1505) {
            this.method1541(-1, (byte) -93);
        }
        int var5 = this.field3234 & 0x3;
        int var6;
        int var7;
        if (var5 == 1 || var5 == 3) {
            var6 = var4.field1544;
            var7 = var4.field1557;
        } else {
            var6 = var4.field1557;
            var7 = var4.field1544;
        }
        int var8 = this.field3239 + (var7 + 1 >> 1);
        int var9 = (var6 + 1 >> 1) + this.field3246;
        int var10 = (var7 >> 1) + this.field3239;
        int var11 = (var6 >> 1) + this.field3246;
        this.method1547((byte) -113, var11 * 128, var10 * 128);
        boolean var12 = !var3 && var4.field1515 && (this.field3250 != var4.field1505 || (this.field3253 != this.field3229 || this.field3227 != null && (this.field3227.field1190 || class279.field4487) && this.field3253 != this.field3232) && class74.field1173 >= 2);
        if (arg1 && !var12) {
            this.field3229 = this.field3253;
            this.field3250 = var4.field1505;
            return null;
        }
        int[][] var13 = class103.field1792[this.field3240];
        int var14 = var13[var8][var11] + var13[var10][var11] + var13[var10][var9] + var13[var8][var9] >> 2;
        int var15 = (this.field3239 << 7) + (var7 << 6);
        int var16 = (this.field3246 << 7) + (var6 << 6);
        boolean var17 = this.field3257 == null;
        int[][] var18 = null;
        if (var3) {
            var18 = class297.field4763[0];
        } else if (this.field3240 < 3) {
            var18 = class103.field1792[this.field3240 + 1];
        }
        class230 var19;
        if (this.field3227 == null) {
            var19 = var4.method709(var17 ? class182.field2736 : this.field3257, this.field3249, var18, var14, (byte) 45, this.field3234, false, var12, var16, var15, var13);
        } else {
            var19 = var4.method708(var13, var12, var16, this.field3256, var17 ? class182.field2736 : this.field3257, this.field3249, this.field3253, 0, var15, this.field3232, var18, this.field3234, this.field3227, var14);
        }
        if (var19 == null) {
            this.field3250 = var4.field1505;
            this.field3229 = this.field3253;
            return null;
        }
        this.field3250 = var4.field1505;
        if (arg0 != -1105999775) {
            this.field3239 = -2;
        }
        this.field3229 = this.field3253;
        return var19.field3378;
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(B)Lff;")
    public final class4 method1544(byte arg0) {
        field3247++;
        if (arg0 <= 63) {
            field3255 = null;
        }
        return this.method1543(-1105999775, false);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "()I")
    public final int method17() {
        field3254++;
        return this.field3245;
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(I)V")
    public static void method1545(int arg0) {
        field3255 = null;
        field3228 = null;
        field3251 = null;
        if (arg0 <= 50) {
            method1542(-58);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIII)V")
    public final void method15(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3230++;
        this.method1547((byte) -98, arg4, arg3);
        class4 var6 = null;
        if (!this.field3243) {
            if (var6 == null) {
                var6 = this.method1544((byte) 92);
            }
            if (var6 == null) {
                return;
            }
            this.method1546(-77, var6);
        }
        if (this.field3231 != null) {
            this.field3231.method650(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!md", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.field3231 != null) {
            this.field3231.method658();
        }
        field3233++;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ILff;)V")
    private final void method1546(int arg0, class4 arg1) {
        field3237++;
        int var3 = 2 % ((11 - arg0) / 43);
        class257 var4 = (class257) arg1;
        if ((this.field3231 == null || this.field3231.field1407) && (var4.field3885 != null || var4.field3909 != null)) {
            class93 var5 = class48.method297(false, this.field3259);
            if (var5.field1528 != null) {
                var5 = var5.method710(0);
            }
            if (var5 != null) {
                this.field3231 = new class88(class199.field2930, var5.field1544, var5.field1557);
            }
        }
        if (this.field3231 != null) {
            this.field3231.method660(var4.field3885, var4.field3909, false, var4.field3896, var4.field3888, var4.field3899);
        }
        this.field3243 = true;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIIIIIJILui;)V")
    public final void method16(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class88 arg10) {
        field3248++;
        class4 var13 = this.method1544((byte) 96);
        if (var13 != null) {
            this.method1546(92, var13);
            var13.method16(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field3231);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BII)V")
    private final void method1547(byte arg0, int arg1, int arg2) {
        field3241++;
        if (arg0 >= -85) {
            return;
        }
        label90: while (true) {
            if (this.field3227 == null) {
                if (this.field3238) {
                    return;
                }
                this.method1541(-1, (byte) -111);
                if (this.field3227 == null) {
                    return;
                }
            }
            int var4 = class199.field2930 - this.field3236;
            if (var4 > 100 && this.field3227.field1186 > 0) {
                int var5 = this.field3227.field1191.length - this.field3227.field1186;
                while (var5 > this.field3253 && this.field3227.field1194[this.field3253] < var4) {
                    var4 -= this.field3227.field1194[this.field3253];
                    this.field3253++;
                }
                if (var5 <= this.field3253) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field3227.field1191.length; var7++) {
                        var6 += this.field3227.field1194[var7];
                    }
                    var4 %= var6;
                }
                this.field3232 = this.field3253 + 1;
                if (this.field3227.field1191.length <= this.field3232) {
                    this.field3232 -= this.field3227.field1186;
                    if (this.field3232 < 0 || this.field3227.field1191.length <= this.field3232) {
                        this.field3232 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (var4 <= this.field3227.field1194[this.field3253]) {
                            this.field3236 = class199.field2930 - var4;
                            this.field3256 = var4;
                            return;
                        }
                        class32.method208(arg2, this.field3253, true, false, arg1, this.field3227);
                        var4 -= this.field3227.field1194[this.field3253];
                        this.field3253++;
                        if (this.field3253 >= this.field3227.field1191.length) {
                            this.field3253 -= this.field3227.field1186;
                            if (this.field3253 < 0 || this.field3227.field1191.length <= this.field3253) {
                                this.field3227 = null;
                                continue label90;
                            }
                        }
                        this.field3232 = this.field3253 + 1;
                    } while (this.field3227.field1191.length > this.field3232);
                    this.field3232 -= this.field3227.field1186;
                } while (this.field3232 >= 0 && this.field3232 < this.field3227.field1191.length);
                this.field3232 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(IIIIIIIZLff;)V")
    public class222(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class4 arg8) {
        this.field3246 = arg5;
        this.field3259 = arg0;
        this.field3234 = arg2;
        this.field3239 = arg4;
        this.field3249 = arg1;
        this.field3240 = arg3;
        if (arg8 != null) {
            this.field3238 = true;
            if (arg8 instanceof class222) {
                class222 var10 = (class222) arg8;
                this.field3253 = var10.field3253;
                this.field3227 = var10.field3227;
                this.field3236 = var10.field3236;
                this.field3232 = var10.field3232;
                this.field3256 = var10.field3256;
            }
        }
        if (this.field3238) {
            this.method1541(arg6, (byte) -79);
        }
    }
}
