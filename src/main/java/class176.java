import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class176 extends class152 {

    @OriginalMember(owner = "client!mg", name = "n", descriptor = "I")
    private int field2902 = 0;

    @OriginalMember(owner = "client!mg", name = "v", descriptor = "I")
    private int field2910 = -1;

    @OriginalMember(owner = "client!mg", name = "u", descriptor = "I")
    private int field2909 = -32768;

    @OriginalMember(owner = "client!mg", name = "E", descriptor = "Z")
    public boolean field2917 = false;

    @OriginalMember(owner = "client!mg", name = "x", descriptor = "I")
    private int field2912 = 0;

    @OriginalMember(owner = "client!mg", name = "q", descriptor = "Z")
    private boolean field2905 = false;

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "I")
    public int field2900;

    @OriginalMember(owner = "client!mg", name = "I", descriptor = "I")
    public int field2921;

    @OriginalMember(owner = "client!mg", name = "t", descriptor = "I")
    public int field2908;

    @OriginalMember(owner = "client!mg", name = "y", descriptor = "I")
    private int field2913;

    @OriginalMember(owner = "client!mg", name = "m", descriptor = "I")
    public int field2901;

    @OriginalMember(owner = "client!mg", name = "A", descriptor = "I")
    public int field2915;

    @OriginalMember(owner = "client!mg", name = "z", descriptor = "Lmi;")
    private class300 field2914;

    @OriginalMember(owner = "client!mg", name = "s", descriptor = "Lsf;")
    public static class124 field2907 = new class124(30);

    @OriginalMember(owner = "client!mg", name = "K", descriptor = "Ljava/lang/String;")
    public static String field2923 = "Created gameworld";

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!mg", name = "o", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!mg", name = "p", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!mg", name = "r", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!mg", name = "w", descriptor = "I")
    public static int field2911;

    @OriginalMember(owner = "client!mg", name = "C", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!mg", name = "F", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!mg", name = "H", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!mg", name = "J", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "Lgl;")
    private class214 field2898;

    @OriginalMember(owner = "client!mg", name = "G", descriptor = "[I")
    public static int[] field2919;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIII)V", line = 4)
    public final void method334(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2922++;
        if (!this.field2905) {
            class42 var6 = this.method1249((byte) 11);
            if (var6 == null) {
                return;
            }
            this.method1253(-123, var6);
        }
        if (this.field2898 != null) {
            this.field2898.method1483(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)V", line = 31)
    public final void method1248(int arg0, int arg1) {
        if (arg1 != 23301) {
            this.field2913 = 2;
        }
        field2911++;
        if (this.field2917) {
            return;
        }
        this.field2912 += arg0;
        while (this.field2914.field4877[this.field2902] < this.field2912) {
            this.field2912 -= this.field2914.field4877[this.field2902];
            this.field2902++;
            if (this.field2902 >= this.field2914.field4885.length) {
                this.field2917 = true;
                break;
            }
        }
        if (!this.field2917) {
            class347.method2479(false, (byte) -54, this.field2914, this.field2902, this.field2908, this.field2901);
        }
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(IIIIIII)V", line = 287)
    public class176(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2900 = arg6 + arg5;
        this.field2921 = arg4;
        this.field2908 = arg2;
        this.field2913 = arg0;
        this.field2901 = arg3;
        this.field2915 = arg1;
        int var8 = class134.method944(1, this.field2913).field3322;
        if (var8 == -1) {
            this.field2917 = true;
        } else {
            this.field2917 = false;
            this.field2914 = class258.method1807(var8, 124);
        }
        if (this.field2900 == arg6) {
            class347.method2479(false, (byte) -49, this.field2914, this.field2902, this.field2908, this.field2901);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)Lhb;", line = 68)
    private final class42 method1249(byte arg0) {
        class198 var2 = class134.method944(1, this.field2913);
        class42 var3;
        if (this.field2917) {
            var3 = var2.method1357(-1, 0, -1, -11);
        } else {
            var3 = var2.method1357(this.field2902, this.field2912, this.field2910, -11);
        }
        field2906++;
        if (var3 == null) {
            return null;
        } else {
            if (arg0 < 0) {
                this.field2909 = -111;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "()I", line = 90)
    public final int method340() {
        field2918++;
        return this.field2909;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lg;IIILob;II)V", line = 101)
    public static final void method1250(class181 arg0, int arg1, int arg2, int arg3, class323 arg4, int arg5, int arg6) {
        field2904++;
        if (arg4 == null) {
            return;
        }
        int var7 = 31 % ((15 - arg5) / 36);
        int var8;
        if (class69.field1280 == 4) {
            var8 = (int) class354.field5652 & 0x7FF;
        } else {
            var8 = (int) class354.field5652 + class192.field3253 & 0x7FF;
        }
        int var9 = Math.max(arg0.field3024 / 2, arg0.field2972 / 2) + 10;
        int var10 = arg3 * arg3 + arg6 * arg6;
        if (var10 > (var9 * var9)) {
            return;
        }
        int var11 = class305.field4959[var8];
        int var12 = class305.field4957[var8];
        if (class69.field1280 != 4) {
            var11 = var11 * 256 / (class292.field4726 + 256);
            var12 = var12 * 256 / (class292.field4726 + 256);
        }
        int var13 = arg6 * var12 - (arg3 * var11) >> 16;
        int var14 = arg3 * var12 + arg6 * var11 >> 16;
        if (class241.field4016) {
            ((class3) arg4).method35(arg0.field3024 / 2 + var14 + arg2 - (arg4.field5239 / 2), -(arg4.field5228 / 2) + -var13 + arg1 - -(arg0.field2972 / 2), (class265) arg0.method1266(43, false));
        } else {
            ((class211) arg4).method1452(arg2 + var14 + (arg0.field3024 / 2) - arg4.field5239 / 2, arg0.field2972 / 2 + -(arg4.field5228 / 2) + arg1 + -var13, arg0.field3015, arg0.field2973);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZZ)I", line = 152)
    public static final int method1251(boolean arg0, boolean arg1) {
        field2920++;
        long var2 = class218.method1520((byte) 40);
        if (arg1) {
            field2923 = (String) null;
        }
        for (class190 var4 = arg0 ? (class190) class59.field1156.method2345((byte) 55) : (class190) class59.field1156.method2336(-97); var4 != null; var4 = (class190) class59.field1156.method2336(-109)) {
            if ((var4.field3220 & 0x3FFFFFFFFFFFFFFFL) < var2) {
                if ((var4.field3220 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field1291;
                    class334.field5322[var5] = class340.field5391[var5];
                    var4.method535(-2801);
                    return var5;
                }
                var4.method535(-2801);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BILek;I)[Lka;", line = 196)
    public static final class211[] method1252(byte arg0, int arg1, class206 arg2, int arg3) {
        if (arg0 == -113) {
            field2903++;
            return class76.method581(arg2, 92, arg1, arg3) ? class35.method258(true) : null;
        } else {
            return (class211[]) null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILhb;)V", line = 218)
    private final void method1253(int arg0, class42 arg1) {
        if (class241.field4016) {
            class294 var4 = (class294) arg1;
            if ((this.field2898 == null || this.field2898.field3531) && (var4.field4780 != null || var4.field4772 != null)) {
                this.field2898 = new class214(class267.field4371, 1, 1);
            }
            if (this.field2898 != null) {
                this.field2898.method1491(var4.field4780, var4.field4772, false, var4.field4753, var4.field4759, var4.field4762);
            }
        } else {
            class95 var3 = (class95) arg1;
            if ((this.field2898 == null || this.field2898.field3531) && (var3.field1681 != null || var3.field1667 != null)) {
                this.field2898 = new class214(class267.field4371, 1, 1);
            }
            if (this.field2898 != null) {
                this.field2898.method1491(var3.field1681, var3.field1667, false, var3.field1698, var3.field1677, var3.field1688);
            }
        }
        field2916++;
        this.field2905 = true;
        if (arg0 >= -90) {
            this.method327(-26, -91, 41, -90, 119, 73, -15, -124, -127L, -51, (class214) null);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIIIIIIJILgl;)V", line = 258)
    public final void method327(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class214 arg10) {
        field2899++;
        class42 var13 = this.method1249((byte) 21);
        if (var13 != null) {
            this.method1253(-127, var13);
            var13.method327(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field2898);
            this.field2909 = var13.method340();
        }
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(I)V", line = 314)
    public static void method1254(int arg0) {
        field2923 = null;
        if (arg0 != 29305) {
            field2919 = (int[]) null;
        }
        field2919 = null;
        field2907 = null;
    }
}
