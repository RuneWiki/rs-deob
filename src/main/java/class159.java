import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class159 extends class19 {

    @OriginalMember(owner = "client!rf", name = "O", descriptor = "Z")
    public boolean field3020 = false;

    @OriginalMember(owner = "client!rf", name = "rb", descriptor = "Lrg;")
    private class160 field3049;

    @OriginalMember(owner = "client!rf", name = "M", descriptor = "Z")
    public boolean field3018;

    @OriginalMember(owner = "client!rf", name = "P", descriptor = "Z")
    public boolean field3021;

    @OriginalMember(owner = "client!rf", name = "pb", descriptor = "I")
    public int field3047;

    @OriginalMember(owner = "client!rf", name = "vb", descriptor = "I")
    public int field3053;

    @OriginalMember(owner = "client!rf", name = "ab", descriptor = "I")
    private int field3032;

    @OriginalMember(owner = "client!rf", name = "eb", descriptor = "I")
    private int field3036;

    @OriginalMember(owner = "client!rf", name = "W", descriptor = "I")
    private int field3028;

    @OriginalMember(owner = "client!rf", name = "cb", descriptor = "I")
    private int field3034;

    @OriginalMember(owner = "client!rf", name = "db", descriptor = "Lsd;")
    public static class166 field3035 = class135.method935(" )2> <col=ff9040>", 0);

    @OriginalMember(owner = "client!rf", name = "gb", descriptor = "Lsd;")
    private static class166 field3038 = class135.method935("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3", 0);

    @OriginalMember(owner = "client!rf", name = "bb", descriptor = "I")
    public static int field3033 = 50;

    @OriginalMember(owner = "client!rf", name = "ib", descriptor = "[I")
    public static int[] field3040 = new int[field3033];

    @OriginalMember(owner = "client!rf", name = "Q", descriptor = "[I")
    public static int[] field3022 = new int[field3033];

    @OriginalMember(owner = "client!rf", name = "V", descriptor = "[I")
    public static int[] field3027 = new int[field3033];

    @OriginalMember(owner = "client!rf", name = "Z", descriptor = "[I")
    public static int[] field3031 = new int[field3033];

    @OriginalMember(owner = "client!rf", name = "Y", descriptor = "[Lsd;")
    public static class166[] field3030 = new class166[field3033];

    @OriginalMember(owner = "client!rf", name = "kb", descriptor = "[I")
    public static int[] field3042 = new int[field3033];

    @OriginalMember(owner = "client!rf", name = "T", descriptor = "[I")
    public static int[] field3025 = new int[field3033];

    @OriginalMember(owner = "client!rf", name = "X", descriptor = "Lp;")
    public static class135 field3029 = null;

    @OriginalMember(owner = "client!rf", name = "sb", descriptor = "Lsd;")
    public static class166 field3050 = field3038;

    @OriginalMember(owner = "client!rf", name = "L", descriptor = "[I")
    public static int[] field3017 = new int[field3033];

    @OriginalMember(owner = "client!rf", name = "ub", descriptor = "I")
    public static int field3052 = 0;

    @OriginalMember(owner = "client!rf", name = "R", descriptor = "F")
    private float field3023;

    @OriginalMember(owner = "client!rf", name = "N", descriptor = "I")
    public static int field3019;

    @OriginalMember(owner = "client!rf", name = "S", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!rf", name = "U", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!rf", name = "fb", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!rf", name = "hb", descriptor = "I")
    public static int field3039;

    @OriginalMember(owner = "client!rf", name = "lb", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!rf", name = "mb", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!rf", name = "ob", descriptor = "I")
    public static int field3046;

    @OriginalMember(owner = "client!rf", name = "qb", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!rf", name = "tb", descriptor = "I")
    public static int field3051;

    @OriginalMember(owner = "client!rf", name = "jb", descriptor = "Lf;")
    public static class47 field3041;

    @OriginalMember(owner = "client!rf", name = "wb", descriptor = "[I")
    private int[] field3054;

    @OriginalMember(owner = "client!rf", name = "nb", descriptor = "[Lre;")
    public static class158[] field3045;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(II)V")
    public static final void method1075(int arg0, int arg1) {
        field3043++;
        class134 var2 = (class134) class79.field1606.method224(-1, (long) arg1);
        if (var2 == null) {
            return;
        }
        int var3 = 0;
        if (arg0 != -25527) {
            method1075(1, -68);
        }
        while (var2.field2595.length > var3) {
            var2.field2595[var3] = -1;
            var2.field2594[var3] = 0;
            var3++;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Log;FILf;I)[I")
    public final int[] method1076(class133 arg0, float arg1, int arg2, class47 arg3, int arg4) {
        field3044++;
        if (this.field3054 == null || this.field3023 != arg1) {
            if (!this.field3049.method1087(-1, arg0, arg3)) {
                return null;
            }
            int var6 = this.field3047 > arg2 ? arg2 : this.field3047;
            this.field3054 = this.field3049.method1085(-1, arg0, var6, var6, arg3, true, (double) arg1);
            this.field3023 = arg1;
        }
        int var7 = -62 / ((25 - arg4) / 61);
        return this.field3054;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IB)V")
    public final void method1077(int arg0, byte arg1) {
        if (arg1 > -124) {
            return;
        }
        field3051++;
        if (this.field3054 == null) {
            return;
        }
        if (this.field3036 != 0) {
            if (class139.field2698 == null || this.field3054.length > class139.field2698.length) {
                class139.field2698 = new int[this.field3054.length];
            }
            short var3;
            if (this.field3054.length == 4096) {
                var3 = 64;
            } else {
                var3 = 128;
            }
            int var4 = this.field3054.length;
            int var5 = arg0 * var3 * this.field3034;
            if (this.field3036 == 2) {
                var5 = -var5;
            }
            int var6 = var4 - 1;
            for (int var7 = 0; var7 < var4; var7++) {
                int var9 = var6 & var7 + var5;
                class139.field2698[var7] = this.field3054[var9];
            }
            int[] var8 = this.field3054;
            this.field3054 = class139.field2698;
            class139.field2698 = var8;
        }
        if (this.field3028 == 0) {
            return;
        }
        if (class139.field2698 == null || class139.field2698.length < this.field3054.length) {
            class139.field2698 = new int[this.field3054.length];
        }
        short var10;
        if (this.field3054.length == 4096) {
            var10 = 64;
        } else {
            var10 = 128;
        }
        int var11 = this.field3054.length;
        int var12 = var10 - 1;
        int var13 = this.field3034 * arg0;
        if (this.field3028 == 1) {
            var13 = -var13;
        }
        for (int var14 = 0; var14 < var11; var14 += var10) {
            for (int var16 = 0; var16 < var10; var16++) {
                int var17 = var14 + var16;
                int var18 = var14 + (var16 + var13 & var12);
                class139.field2698[var17] = this.field3054[var18];
            }
        }
        int[] var15 = this.field3054;
        this.field3054 = class139.field2698;
        class139.field2698 = var15;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Log;BILf;)[I")
    public final int[] method1078(class133 arg0, byte arg1, int arg2, class47 arg3) {
        field3048++;
        if (arg1 != 48) {
            this.method1077(54, (byte) -101);
        }
        if (this.field3049.method1087(-1, arg0, arg3)) {
            int var5 = this.field3047 <= arg2 ? this.field3047 : arg2;
            return this.field3049.method1085(arg1 - 49, arg0, var5, var5, arg3, false, 1.0D);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Log;Lf;B)Z")
    public final boolean method1079(class133 arg0, class47 arg1, byte arg2) {
        if (arg2 <= 19) {
            method1083(-97, 116, -124);
        }
        field3019++;
        return this.field3049.method1087(-1, arg0, arg1);
    }

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "(I)V")
    public static void method1080(int arg0) {
        field3040 = null;
        field3022 = null;
        field3025 = null;
        field3042 = null;
        if (arg0 <= 116) {
            return;
        }
        field3035 = null;
        field3031 = null;
        field3038 = null;
        field3030 = null;
        field3050 = null;
        field3027 = null;
        field3045 = null;
        field3041 = null;
        field3017 = null;
    }

    @OriginalMember(owner = "client!rf", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        super.finalize();
        field3024++;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIB)V")
    public static final void method1081(int arg0, int arg1, byte arg2) {
        field3026++;
        class156.field2989.method705(25, (byte) 9);
        class103.field2021++;
        class156.field2989.method390((byte) -26, arg1);
        if (arg2 < 53) {
            field3050 = null;
        }
        class156.field2989.method437(arg0, 25673);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lvd;I)V")
    public static final void method1082(class193 arg0, int arg1) {
        field3039++;
        int var2 = arg0.field3823;
        if (var2 == 324) {
            if (class125.field2467 == -1) {
                class206.field4057 = arg0.field3753;
                class125.field2467 = arg0.field3754;
            }
            if (class33.field598.field2159) {
                arg0.field3754 = class125.field2467;
            } else {
                arg0.field3754 = class206.field4057;
            }
        } else if (var2 == 325) {
            if (class125.field2467 == -1) {
                class206.field4057 = arg0.field3753;
                class125.field2467 = arg0.field3754;
            }
            if (class33.field598.field2159) {
                arg0.field3754 = class206.field4057;
            } else {
                arg0.field3754 = class125.field2467;
            }
        } else if (var2 == 327) {
            arg0.field3709 = 150;
            arg0.field3764 = (int) (Math.sin((double) class49.field910 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3717 = -1;
            arg0.field3822 = 5;
        } else if (arg1 == 0 && var2 == 328) {
            arg0.field3709 = 150;
            arg0.field3764 = (int) (Math.sin((double) class49.field910 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3822 = 5;
            arg0.field3717 = ((int) class41.field728.field2412.method1133((byte) 30) << 11) + 2047;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(III)Lsd;")
    public static final class166 method1083(int arg0, int arg1, int arg2) {
        field3037++;
        int var3 = arg0 - arg1;
        if (var3 < -9) {
            return class64.field1322;
        } else if (var3 < -6) {
            return class59.field1208;
        } else if (var3 < -3) {
            return class130.field2548;
        } else if (var3 < 0) {
            return class146.field2875;
        } else if (var3 > 9) {
            return class98.field1868;
        } else if (var3 > 6) {
            return class14.field255;
        } else if (~var3 < arg2) {
            return class145.field2822;
        } else if (var3 > 0) {
            return class103.field2024;
        } else {
            return class63.field1308;
        }
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Lff;)V")
    public class159(class53 arg0) {
        this.field3049 = new class160(arg0);
        int var2 = arg0.method400(255);
        this.field3018 = (var2 & 0x2) != 0;
        this.field3021 = (var2 & 0x1) != 0;
        this.field3047 = arg0.method400(255);
        this.field3053 = arg0.method405(2);
        this.field3032 = arg0.method400(255);
        if (this.field3032 == 255) {
            this.field3032 = 256;
        }
        int var3 = arg0.method400(255);
        int var4 = arg0.method400(255);
        this.field3036 = var4 >> 6 & 0x3;
        this.field3028 = var3 >> 6 & 0x3;
        this.field3034 = (var4 & 0x3F) - 6;
        arg0.method400(255);
        arg0.method400(255);
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "()V")
    public class159() {
        this.field3049 = new class160();
        this.field3047 = 1;
        this.field3021 = true;
    }
}
