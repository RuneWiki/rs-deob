import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class115 extends class126 {

    @OriginalMember(owner = "client!m", name = "J", descriptor = "I")
    private int field2305 = -1;

    @OriginalMember(owner = "client!m", name = "z", descriptor = "Lij;")
    private class194 field2295 = null;

    @OriginalMember(owner = "client!m", name = "O", descriptor = "Z")
    private boolean field2310 = false;

    @OriginalMember(owner = "client!m", name = "V", descriptor = "I")
    private int field2317 = -1;

    @OriginalMember(owner = "client!m", name = "X", descriptor = "I")
    private int field2319 = -32768;

    @OriginalMember(owner = "client!m", name = "C", descriptor = "I")
    private int field2298;

    @OriginalMember(owner = "client!m", name = "K", descriptor = "I")
    private int field2306;

    @OriginalMember(owner = "client!m", name = "T", descriptor = "I")
    private int field2315;

    @OriginalMember(owner = "client!m", name = "G", descriptor = "I")
    private int field2302;

    @OriginalMember(owner = "client!m", name = "w", descriptor = "I")
    private int field2292;

    @OriginalMember(owner = "client!m", name = "U", descriptor = "I")
    private int field2316;

    @OriginalMember(owner = "client!m", name = "A", descriptor = "Lfl;")
    private class241 field2296;

    @OriginalMember(owner = "client!m", name = "M", descriptor = "I")
    private int field2308;

    @OriginalMember(owner = "client!m", name = "S", descriptor = "I")
    private int field2314;

    @OriginalMember(owner = "client!m", name = "v", descriptor = "Lla;")
    public static class95 field2291 = new class95(200);

    @OriginalMember(owner = "client!m", name = "Z", descriptor = "Lcc;")
    public static class209 field2321 = class95.method669(121, "Lade Titelbild )2 ");

    @OriginalMember(owner = "client!m", name = "ab", descriptor = "[I")
    public static int[] field2322 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!m", name = "x", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!m", name = "y", descriptor = "I")
    public static int field2294;

    @OriginalMember(owner = "client!m", name = "B", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!m", name = "D", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!m", name = "E", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!m", name = "F", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!m", name = "H", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!m", name = "I", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!m", name = "L", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!m", name = "N", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!m", name = "Q", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!m", name = "R", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!m", name = "Y", descriptor = "Ldg;")
    public static class139 field2320;

    @OriginalMember(owner = "client!m", name = "P", descriptor = "Lmd;")
    private class221 field2311;

    @OriginalMember(owner = "client!m", name = "W", descriptor = "Lsa;")
    public static class261 field2318;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ZLjava/lang/Object;Z)[B")
    public static final byte[] method812(boolean arg0, Object arg1, boolean arg2) {
        field2313++;
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) arg1;
            return arg2 ? class2.method9(var3, (byte) 110) : var3;
        } else if (arg1 instanceof class160) {
            class160 var4 = (class160) arg1;
            return var4.method1108((byte) -78);
        } else {
            if (!arg0) {
                field2322 = null;
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIII)V")
    public final void method214(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method818(arg3, arg4, (byte) 126);
        class126 var6 = null;
        field2303++;
        if (!this.field2310) {
            if (var6 == null) {
                var6 = this.method814(-35);
            }
            if (var6 == null) {
                return;
            }
            this.method813((byte) 116, var6);
        }
        if (this.field2311 != null) {
            this.field2311.method1555(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(BLpb;)V")
    private final void method813(byte arg0, class126 arg1) {
        class55 var3 = (class55) arg1;
        if ((this.field2311 == null || this.field2311.field4024) && (var3.field1090 != null || var3.field1091 != null)) {
            class218 var4 = class245.method1711(27093, this.field2306);
            if (var4.field3917 != null) {
                var4 = var4.method1535((byte) -61);
            }
            if (var4 != null) {
                this.field2311 = new class221(class163.field2968, var4.field3916, var4.field3912);
            }
        }
        int var5 = 72 % ((54 - arg0) / 50);
        if (this.field2311 != null) {
            this.field2311.method1560(var3.field1090, var3.field1091, false, var3.field1072, var3.field1116, var3.field1079);
        }
        this.field2310 = true;
        field2297++;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)Lpb;")
    private final class126 method814(int arg0) {
        field2293++;
        int var2 = 88 / ((23 - arg0) / 51);
        return this.method819(1887, false);
    }

    @OriginalMember(owner = "client!m", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.field2311 != null) {
            this.field2311.method1559();
        }
        field2299++;
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "()I")
    public final int method216() {
        field2294++;
        return this.field2319;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIII)V")
    public static final void method815(int arg0, int arg1, int arg2, int arg3) {
        field2304++;
        if (arg2 != -1) {
            method817(123, -34);
        }
        class195 var4 = class178.method1229(arg1, 9, -99);
        var4.method1338(0);
        var4.field3503 = arg3;
        var4.field3511 = arg0;
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(Z)V")
    public static void method816(boolean arg0) {
        field2322 = null;
        field2321 = null;
        field2291 = null;
        field2320 = null;
        field2318 = null;
        if (!arg0) {
            field2291 = null;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II)Z")
    public static final boolean method817(int arg0, int arg1) {
        field2309++;
        if (arg0 != 4) {
            field2320 = null;
        }
        if (arg1 < 0) {
            return false;
        }
        int var2 = class40.field680[arg1];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        return var2 == 1003;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIB)V")
    private final void method818(int arg0, int arg1, byte arg2) {
        if (this.field2296 != null) {
            int var4 = class163.field2968 - this.field2314;
            if (var4 > 100 && this.field2296.field4366 > 0) {
                int var5 = this.field2296.field4341.length - this.field2296.field4366;
                while (this.field2308 < var5 && var4 > this.field2296.field4344[this.field2308]) {
                    var4 -= this.field2296.field4344[this.field2308];
                    this.field2308++;
                }
                if (var5 <= this.field2308) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field2296.field4341.length; var7++) {
                        var6 += this.field2296.field4344[var7];
                    }
                    var4 %= var6;
                }
            }
            label62: {
                do {
                    do {
                        if (var4 <= this.field2296.field4344[this.field2308]) {
                            break label62;
                        }
                        class224.method1577(this.field2308, this.field2296, arg1, arg0, 128, false);
                        var4 -= this.field2296.field4344[this.field2308];
                        this.field2308++;
                    } while (this.field2308 < this.field2296.field4341.length);
                    this.field2308 -= this.field2296.field4366;
                } while (this.field2308 >= 0 && this.field2296.field4341.length > this.field2308);
                this.field2296 = null;
            }
            this.field2314 = class163.field2968 - var4;
        }
        if (arg2 <= 116) {
            this.method216();
        }
        field2312++;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IZ)Lpb;")
    private final class126 method819(int arg0, boolean arg1) {
        boolean var3 = class38.field656 != class271.field4803;
        field2307++;
        class218 var4 = class245.method1711(arg0 + 25206, this.field2306);
        if (var4.field3917 != null) {
            var4 = var4.method1535((byte) -92);
        }
        if (var4 == null) {
            return null;
        }
        int var5 = this.field2298 & 0x3;
        int var6;
        int var7;
        if (var5 == 1 || var5 == 3) {
            var6 = var4.field3912;
            var7 = var4.field3916;
        } else {
            var6 = var4.field3916;
            var7 = var4.field3912;
        }
        int var8 = (var6 >> 1) + this.field2316;
        int var9 = (var6 + 1 >> 1) + this.field2316;
        int var10 = (var7 >> 1) + this.field2292;
        int var11 = this.field2292 + (var7 + 1 >> 1);
        this.method818(var8 * 128, var10 * 128, (byte) 124);
        boolean var12 = !var3 && var4.field3941 && (this.field2305 != var4.field3952 || this.field2317 != this.field2308 && class254.field4587 >= 2);
        if (arg1 && !var12) {
            return null;
        }
        int[][] var13 = class271.field4803[this.field2315];
        int var14 = var13[var8][var10] + var13[var8][var11] + var13[var9][var11] + var13[var9][var10] >> 2;
        int[][] var15 = null;
        int var16 = (this.field2292 << 7) + (var7 << 6);
        if (arg0 != 1887) {
            this.method214(-51, -38, -32, 86, 42);
        }
        int var17 = (this.field2316 << 7) + (var6 << 6);
        if (var3) {
            var15 = class38.field656[0];
        } else if (this.field2315 < 3) {
            var15 = class271.field4803[this.field2315 + 1];
        }
        boolean var18 = this.field2295 == null;
        class104 var19;
        if (this.field2296 == null) {
            var19 = var4.method1537(false, -23584, this.field2298, var16, var12, var17, var18 ? class171.field3132 : this.field2295, var15, var13, var14, this.field2302);
        } else {
            var19 = var4.method1539(var12, this.field2298, this.field2308, this.field2296, var18 ? class171.field3132 : this.field2295, arg0 ^ 0x71B, var14, var17, var16, var13, var15, this.field2302);
        }
        return var19 == null ? null : var19.field2012;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIIIIIIJILmd;)V")
    public final void method208(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class221 arg10) {
        field2300++;
        class126 var13 = this.method814(92);
        if (var13 != null) {
            this.method813((byte) -42, var13);
            var13.method208(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field2311);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIZ)I")
    public static final int method820(int arg0, int arg1, boolean arg2) {
        field2301++;
        if (arg2) {
            method817(34, -84);
        }
        int var3 = 0;
        while (arg1 > 0) {
            arg1--;
            var3 = var3 << 1 | arg0 & 0x1;
            arg0 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(IIIIIIIZLpb;)V")
    public class115(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class126 arg8) {
        this.field2298 = arg2;
        this.field2306 = arg0;
        this.field2315 = arg3;
        this.field2302 = arg1;
        this.field2292 = arg5;
        this.field2316 = arg4;
        if (arg6 != -1) {
            this.field2296 = class245.method1706(arg6, (byte) 120);
            this.field2308 = 0;
            this.field2314 = class163.field2968 - 1;
            if (this.field2296.field4367 == 0 && arg8 != null && arg8 instanceof class115) {
                class115 var10 = (class115) arg8;
                if (this.field2296 == var10.field2296) {
                    this.field2308 = var10.field2308;
                    this.field2314 = var10.field2314;
                    return;
                }
            }
            if (arg7 && this.field2296.field4366 != -1) {
                this.field2308 = (int) ((double) this.field2296.field4341.length * Math.random());
                this.field2314 -= (int) (Math.random() * (double) this.field2296.field4344[this.field2308]);
                return;
            }
        }
    }
}
