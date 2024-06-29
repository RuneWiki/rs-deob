import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class122 {

    @OriginalMember(owner = "client!lc", name = "v", descriptor = "I")
    private int field2292 = 0;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "[Lnj;")
    private class151[] field2275;

    @OriginalMember(owner = "client!lc", name = "s", descriptor = "I")
    private int field2289;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "[I")
    public static int[] field2273 = new int[50];

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "[Lbb;")
    public static class14[] field2271 = new class14[24];

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
    public static int field2280 = 10;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
    public static int field2281 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "Lmb;")
    private static class132 field2284 = class166.method1092("We suspect someone knows your password)3", 123);

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "Lmb;")
    public static class132 field2276 = field2284;

    @OriginalMember(owner = "client!lc", name = "r", descriptor = "Lmb;")
    public static class132 field2288 = class166.method1092("M", 123);

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
    public static int field2282 = 5063219;

    @OriginalMember(owner = "client!lc", name = "t", descriptor = "Lmb;")
    public static class132 field2290 = class166.method1092(" )2> <col=00ffff>", 112);

    @OriginalMember(owner = "client!lc", name = "u", descriptor = "[I")
    public static int[] field2291 = new int[1000];

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
    public static int field2278;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!lc", name = "w", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!lc", name = "x", descriptor = "I")
    public static int field2294;

    @OriginalMember(owner = "client!lc", name = "y", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!lc", name = "z", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "J")
    private long field2286;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "Lnj;")
    private class151 field2272;

    @OriginalMember(owner = "client!lc", name = "A", descriptor = "Lnj;")
    private class151 field2297;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)I")
    public static int method804(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZLkd;)Lvc;")
    public static final class227 method805(boolean arg0, class112 arg1) {
        field2295++;
        class227 var2 = new class227();
        var2.field4112 = arg1.method739(-127);
        if (arg0) {
            method812(-89);
        }
        var2.field4107 = class116.method780(var2.field4112, (byte) 100);
        return var2;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IJ)Lnj;")
    public final class151 method806(int arg0, long arg1) {
        field2278++;
        this.field2286 = arg1;
        class151 var4 = this.field2275[(int) ((long) (this.field2289 + arg0) & arg1)];
        for (this.field2272 = var4.field2759; this.field2272 != var4; this.field2272 = this.field2272.field2759) {
            if (this.field2272.field2760 == arg1) {
                class151 var5 = this.field2272;
                this.field2272 = this.field2272.field2759;
                return var5;
            }
        }
        this.field2272 = null;
        return null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)Lnj;")
    public final class151 method807(int arg0) {
        field2283++;
        if (this.field2292 > 0 && this.field2275[this.field2292 - 1] != this.field2297) {
            class151 var2 = this.field2297;
            this.field2297 = var2.field2759;
            return var2;
        }
        if (arg0 != -19009) {
            field2282 = 91;
        }
        while (this.field2292 < this.field2289) {
            class151 var3 = this.field2275[this.field2292++].field2759;
            if (this.field2275[this.field2292 - 1] != var3) {
                this.field2297 = var3.field2759;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)Lnj;")
    public final class151 method808(byte arg0) {
        field2293++;
        if (arg0 != -97) {
            field2281 = 45;
        }
        if (this.field2272 == null) {
            return null;
        }
        class151 var2 = this.field2275[(int) (this.field2286 & (long) (this.field2289 - 1))];
        while (this.field2272 != var2) {
            if (this.field2272.field2760 == this.field2286) {
                class151 var3 = this.field2272;
                this.field2272 = this.field2272.field2759;
                return var3;
            }
            this.field2272 = this.field2272.field2759;
        }
        this.field2272 = null;
        return null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method809(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2277++;
        if (arg6 == arg7 && arg1 == arg2 && arg3 == arg5 && arg4 == arg9) {
            class183.method1173(arg7, (byte) -128, arg9, arg3, arg8, arg2);
        } else {
            int var10 = arg7;
            int var11 = arg2;
            int var12 = arg2 * 3;
            int var13 = arg1 * 3;
            int var14 = arg7 * 3;
            int var15 = arg5 * 3;
            int var16 = arg4 * 3;
            int var17 = arg6 * 3;
            int var18 = arg9 + var13 - var16 - arg2;
            int var19 = arg3 + var17 - arg7 - var15;
            int var20 = var14 + var15 - var17 - var17;
            int var21 = var17 - var14;
            int var22 = var16 + var12 - var13 - var13;
            int var23 = var13 - var12;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var19 * var26;
                int var28 = var18 * var26;
                int var29 = var20 * var25;
                int var30 = var23 * var24;
                int var31 = var21 * var24;
                int var32 = (var27 + var29 + var31 >> 12) + arg7;
                int var33 = var22 * var25;
                int var34 = (var28 + var33 + var30 >> 12) + arg2;
                class183.method1173(var10, (byte) -68, var34, var32, arg8, var11);
                var10 = var32;
                var11 = var34;
            }
        }
        if (arg0 >= -23) {
            field2280 = -29;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lnj;JI)V")
    public final void method810(class151 arg0, long arg1, int arg2) {
        field2296++;
        if (arg0.field2769 != null) {
            arg0.method995((byte) 114);
        }
        class151 var5 = this.field2275[(int) ((long) (this.field2289 - 1) & arg1)];
        if (arg2 != -18274) {
            this.method807(-111);
        }
        arg0.field2760 = arg1;
        arg0.field2759 = var5;
        arg0.field2769 = var5.field2769;
        arg0.field2769.field2759 = arg0;
        arg0.field2759.field2769 = arg0;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(B)Lnj;")
    public final class151 method811(byte arg0) {
        if (arg0 == -4) {
            this.field2292 = 0;
            field2279++;
            return this.method807(arg0 ^ 0x4A43);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(I)V")
    public class122(int arg0) {
        this.field2275 = new class151[arg0];
        this.field2289 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class151 var3 = this.field2275[var2] = new class151();
            var3.field2759 = var3;
            var3.field2769 = var3;
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V")
    public static void method812(int arg0) {
        field2291 = null;
        field2276 = null;
        field2271 = null;
        field2290 = null;
        field2288 = null;
        field2273 = null;
        if (arg0 < 28) {
            field2284 = null;
        }
        field2284 = null;
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(B)V")
    public static final void method813(byte arg0) {
        field2285++;
        if (class66.field1096 && class139.field2615 != class132.field2450) {
            class196.method1244(class210.field3854.field676[0], class210.field3854.field703[0], 128, class22.field318, class70.field1162, class139.field2615);
            return;
        }
        if (arg0 != -30) {
            method813((byte) 45);
        }
        if (class200.field3700 != class139.field2615) {
            class200.field3700 = class139.field2615;
            class110.method695(class139.field2615, 36);
        }
    }
}
