import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class167 extends class179 {

    @OriginalMember(owner = "client!fh", name = "t", descriptor = "I")
    private int field3017 = -1;

    @OriginalMember(owner = "client!fh", name = "s", descriptor = "Lcg;")
    private class34 field3016 = null;

    @OriginalMember(owner = "client!fh", name = "v", descriptor = "I")
    private int field3019 = -1;

    @OriginalMember(owner = "client!fh", name = "r", descriptor = "I")
    private int field3015 = -32768;

    @OriginalMember(owner = "client!fh", name = "E", descriptor = "I")
    private int field3028;

    @OriginalMember(owner = "client!fh", name = "u", descriptor = "I")
    private int field3018;

    @OriginalMember(owner = "client!fh", name = "P", descriptor = "I")
    private int field3039;

    @OriginalMember(owner = "client!fh", name = "p", descriptor = "I")
    private int field3013;

    @OriginalMember(owner = "client!fh", name = "C", descriptor = "I")
    private int field3026;

    @OriginalMember(owner = "client!fh", name = "y", descriptor = "I")
    private int field3022;

    @OriginalMember(owner = "client!fh", name = "M", descriptor = "Lt;")
    private class216 field3036;

    @OriginalMember(owner = "client!fh", name = "B", descriptor = "I")
    private int field3025;

    @OriginalMember(owner = "client!fh", name = "G", descriptor = "I")
    private int field3030;

    @OriginalMember(owner = "client!fh", name = "F", descriptor = "Lch;")
    public static class117 field3029 = new class117();

    @OriginalMember(owner = "client!fh", name = "O", descriptor = "Lvf;")
    public static class265 field3038 = class87.method582(-46, "scrollen:");

    @OriginalMember(owner = "client!fh", name = "N", descriptor = "[Lrb;")
    public static class188[] field3037 = new class188[6];

    @OriginalMember(owner = "client!fh", name = "R", descriptor = "J")
    public static long field3041 = 0L;

    @OriginalMember(owner = "client!fh", name = "T", descriptor = "I")
    public static int field3043 = 0;

    @OriginalMember(owner = "client!fh", name = "U", descriptor = "Lvf;")
    public static class265 field3044 = class87.method582(-46, "Sprites charg-Bs");

    @OriginalMember(owner = "client!fh", name = "o", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!fh", name = "q", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!fh", name = "w", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "client!fh", name = "x", descriptor = "I")
    public static int field3021;

    @OriginalMember(owner = "client!fh", name = "z", descriptor = "I")
    public static int field3023;

    @OriginalMember(owner = "client!fh", name = "A", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!fh", name = "D", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!fh", name = "I", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!fh", name = "J", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!fh", name = "K", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!fh", name = "L", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!fh", name = "S", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!fh", name = "Q", descriptor = "Lfl;")
    public static class192 field3040;

    @OriginalMember(owner = "client!fh", name = "H", descriptor = "Lbe;")
    private class255 field3031;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(BI)I")
    public static final int method1100(byte arg0, int arg1) {
        if (arg0 >= -77) {
            return 29;
        }
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var3 = arg1 * 6 - 61440;
        field3023++;
        int var4 = (arg1 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(B)V")
    public static final void method1101(byte arg0) {
        if (arg0 != -44) {
            field3038 = null;
        }
        class1.field24.method1888((byte) 109);
        field3042++;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V")
    public static void method1102(int arg0) {
        field3029 = null;
        field3040 = null;
        field3038 = null;
        if (arg0 != -1106) {
            field3029 = null;
        }
        field3037 = null;
        field3044 = null;
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)I")
    public static final int method1103(int arg0) {
        field3021++;
        if (arg0 <= 90) {
            field3044 = null;
        }
        return class4.field61 && class69.field1311[81] && class120.field2129 > 2 ? class206.field3714[class120.field2129 - 2] : class206.field3714[class120.field2129 - 1];
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIII)V")
    public final void method173(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3035++;
        this.method1104(-104, arg4, arg3);
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(III)V")
    private final void method1104(int arg0, int arg1, int arg2) {
        if (arg0 > -100) {
            this.field3036 = null;
        }
        if (this.field3036 != null) {
            int var4 = class93.field1655 - this.field3025;
            if (var4 > 100 && this.field3036.field3883 > 0) {
                int var5 = this.field3036.field3890.length - this.field3036.field3883;
                while (var5 > this.field3030 && var4 > this.field3036.field3894[this.field3030]) {
                    var4 -= this.field3036.field3894[this.field3030];
                    this.field3030++;
                }
                if (this.field3030 >= var5) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field3036.field3890.length; var7++) {
                        var6 += this.field3036.field3894[var7];
                    }
                    var4 %= var6;
                }
            }
            label61: {
                do {
                    do {
                        if (var4 <= this.field3036.field3894[this.field3030]) {
                            break label61;
                        }
                        class268.method1832(this.field3036, false, this.field3030, arg2, -2, arg1);
                        var4 -= this.field3036.field3894[this.field3030];
                        this.field3030++;
                    } while (this.field3036.field3890.length > this.field3030);
                    this.field3030 -= this.field3036.field3883;
                } while (this.field3030 >= 0 && this.field3036.field3890.length > this.field3030);
                this.field3036 = null;
            }
            this.field3025 = class93.field1655 - var4;
        }
        field3032++;
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(B)Ldk;")
    private final class179 method1105(byte arg0) {
        if (arg0 >= -62) {
            return null;
        } else {
            field3020++;
            return this.method1106(2, false);
        }
    }

    @OriginalMember(owner = "client!fh", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field3034++;
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "()I")
    public final int method141() {
        field3014++;
        return this.field3015;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIIIIIJILbe;)V")
    public final void method164(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class255 arg10) {
        field3033++;
        class179 var13 = this.method1105((byte) -125);
        if (var13 != null) {
            var13.method164(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field3031);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IZ)Ldk;")
    private final class179 method1106(int arg0, boolean arg1) {
        field3027++;
        boolean var3 = class83.field1557 != class279.field4936;
        class130 var4 = class84.method574(88, this.field3018);
        if (var4.field2365 != null) {
            var4 = var4.method861(arg0 - 25235);
        }
        if (var4 == null) {
            return null;
        }
        int var5 = this.field3013 & 0x3;
        int var6;
        int var7;
        if (var5 == 1 || var5 == 3) {
            var6 = var4.field2328;
            var7 = var4.field2309;
        } else {
            var6 = var4.field2309;
            var7 = var4.field2328;
        }
        int var8 = (var6 >> 1) + this.field3022;
        int var9 = (var6 + 1 >> 1) + this.field3022;
        int var10 = (var7 >> 1) + this.field3039;
        int var11 = (var7 + 1 >> 1) + this.field3039;
        this.method1104(-108, var10 * 128, var8 * 128);
        if (arg0 != 2) {
            field3037 = null;
        }
        boolean var12 = !var3 && var4.field2323 && (this.field3019 != var4.field2357 || this.field3030 != this.field3017 && class107.field1895 >= 2);
        if (arg1 && !var12) {
            return null;
        }
        int[][] var13 = class279.field4936[this.field3026];
        int var14 = (this.field3022 << 7) + (var6 << 6);
        int[][] var15 = null;
        if (var3) {
            var15 = class83.field1557[0];
        } else if (this.field3026 < 3) {
            var15 = class279.field4936[this.field3026 + 1];
        }
        boolean var16 = this.field3016 == null;
        int var17 = (this.field3039 << 7) + (var7 << 6);
        int var18 = var13[var8][var10] + var13[var8][var11] + var13[var9][var10] + var13[var9][var11] >> 2;
        class52 var19;
        if (this.field3036 == null) {
            var19 = var4.method850(-22501, var13, var17, this.field3013, var14, this.field3028, var15, false, var12, var16 ? class186.field3370 : this.field3016, var18);
        } else {
            var19 = var4.method865(true, var15, this.field3028, this.field3036, var13, var12, var14, var16 ? class186.field3370 : this.field3016, this.field3013, this.field3030, var17, var18);
        }
        return var19 == null ? null : var19.field1084;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IZIB)Lvf;")
    public static final class265 method1107(int arg0, boolean arg1, int arg2, byte arg3) {
        field3024++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        int var4 = 1;
        int var5 = arg0 / arg2;
        while (var5 != 0) {
            var5 /= arg2;
            var4++;
        }
        int var6 = var4;
        if (arg0 < 0 || arg1) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg0 < 0) {
            var7[0] = 45;
        } else if (arg1) {
            var7[0] = 43;
        }
        if (arg3 != 22) {
            method1102(-66);
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var10 = arg0 % arg2;
            arg0 /= arg2;
            if (var10 < 0) {
                var10 = -var10;
            }
            if (var10 > 9) {
                var10 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var10 + 48);
        }
        class265 var9 = new class265();
        var9.field4640 = var6;
        var9.field4643 = var7;
        return var9;
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(IIIIIIIZLdk;)V")
    public class167(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class179 arg8) {
        this.field3028 = arg1;
        this.field3018 = arg0;
        this.field3039 = arg5;
        this.field3013 = arg2;
        this.field3026 = arg3;
        this.field3022 = arg4;
        if (arg6 != -1) {
            this.field3036 = class174.method1142(arg6, false);
            this.field3025 = class93.field1655 - 1;
            this.field3030 = 0;
            if (this.field3036.field3880 == 0 && arg8 != null && arg8 instanceof class167) {
                class167 var10 = (class167) arg8;
                if (this.field3036 == var10.field3036) {
                    this.field3025 = var10.field3025;
                    this.field3030 = var10.field3030;
                    return;
                }
            }
            if (arg7 && this.field3036.field3883 != -1) {
                this.field3030 = (int) (Math.random() * (double) this.field3036.field3890.length);
                this.field3025 -= (int) ((double) this.field3036.field3894[this.field3030] * Math.random());
                return;
            }
        }
    }
}
