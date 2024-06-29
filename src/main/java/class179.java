import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class179 extends class234 {

    @OriginalMember(owner = "client!qh", name = "o", descriptor = "I")
    private int field3069 = 0;

    @OriginalMember(owner = "client!qh", name = "A", descriptor = "Z")
    private boolean field3081 = false;

    @OriginalMember(owner = "client!qh", name = "H", descriptor = "I")
    private int field3088 = -32768;

    @OriginalMember(owner = "client!qh", name = "F", descriptor = "I")
    private int field3086 = 0;

    @OriginalMember(owner = "client!qh", name = "n", descriptor = "I")
    private int field3068;

    @OriginalMember(owner = "client!qh", name = "S", descriptor = "I")
    private int field3099;

    @OriginalMember(owner = "client!qh", name = "I", descriptor = "I")
    public int field3089;

    @OriginalMember(owner = "client!qh", name = "M", descriptor = "I")
    public int field3093;

    @OriginalMember(owner = "client!qh", name = "m", descriptor = "I")
    public int field3067;

    @OriginalMember(owner = "client!qh", name = "N", descriptor = "I")
    private int field3094;

    @OriginalMember(owner = "client!qh", name = "w", descriptor = "I")
    private int field3077;

    @OriginalMember(owner = "client!qh", name = "J", descriptor = "I")
    public int field3090;

    @OriginalMember(owner = "client!qh", name = "O", descriptor = "I")
    public int field3095;

    @OriginalMember(owner = "client!qh", name = "B", descriptor = "I")
    private int field3082;

    @OriginalMember(owner = "client!qh", name = "G", descriptor = "I")
    private int field3087;

    @OriginalMember(owner = "client!qh", name = "C", descriptor = "Ltd;")
    private class204 field3083;

    @OriginalMember(owner = "client!qh", name = "q", descriptor = "I")
    public static int field3071 = 0;

    @OriginalMember(owner = "client!qh", name = "y", descriptor = "Lih;")
    public static class95 field3079 = new class95(30);

    @OriginalMember(owner = "client!qh", name = "U", descriptor = "Ldj;")
    private static class44 field3101 = class89.method650(255, "The server is being updated)3");

    @OriginalMember(owner = "client!qh", name = "T", descriptor = "Z")
    public static boolean field3100 = true;

    @OriginalMember(owner = "client!qh", name = "X", descriptor = "Ldj;")
    public static class44 field3104 = class89.method650(255, "");

    @OriginalMember(owner = "client!qh", name = "Y", descriptor = "[I")
    public static int[] field3105 = new int[128];

    @OriginalMember(owner = "client!qh", name = "Z", descriptor = "Ldj;")
    public static class44 field3106 = class89.method650(255, "null");

    @OriginalMember(owner = "client!qh", name = "V", descriptor = "Ldj;")
    public static class44 field3102 = field3101;

    @OriginalMember(owner = "client!qh", name = "W", descriptor = "B")
    public static byte field3103;

    @OriginalMember(owner = "client!qh", name = "r", descriptor = "D")
    public double field3072;

    @OriginalMember(owner = "client!qh", name = "u", descriptor = "D")
    private double field3075;

    @OriginalMember(owner = "client!qh", name = "z", descriptor = "D")
    private double field3080;

    @OriginalMember(owner = "client!qh", name = "D", descriptor = "D")
    public double field3084;

    @OriginalMember(owner = "client!qh", name = "L", descriptor = "D")
    private double field3092;

    @OriginalMember(owner = "client!qh", name = "P", descriptor = "D")
    private double field3096;

    @OriginalMember(owner = "client!qh", name = "Q", descriptor = "D")
    private double field3097;

    @OriginalMember(owner = "client!qh", name = "R", descriptor = "D")
    public double field3098;

    @OriginalMember(owner = "client!qh", name = "l", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!qh", name = "p", descriptor = "I")
    public static int field3070;

    @OriginalMember(owner = "client!qh", name = "s", descriptor = "I")
    public int field3073;

    @OriginalMember(owner = "client!qh", name = "t", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!qh", name = "v", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!qh", name = "x", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!qh", name = "E", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!qh", name = "K", descriptor = "I")
    private int field3091;

    @OriginalMember(owner = "client!qh", name = "ab", descriptor = "Lnf;")
    public static class147 field3107;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)V")
    public static void method1130(byte arg0) {
        int var1 = -50 / ((69 - arg0) / 39);
        field3079 = null;
        field3107 = null;
        field3102 = null;
        field3106 = null;
        field3104 = null;
        field3101 = null;
        field3105 = null;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)V")
    public final void method1131(int arg0, int arg1) {
        field3085++;
        this.field3098 += this.field3080 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field3075;
        this.field3075 += (double) arg0 * this.field3080;
        this.field3072 += (double) arg0 * this.field3092;
        this.field3081 = true;
        this.field3084 += (double) arg0 * this.field3097;
        this.field3073 = (int) (Math.atan2(this.field3097, this.field3092) * 325.949D) + 1024 & 0x7FF;
        this.field3091 = (int) (Math.atan2(this.field3075, this.field3096) * 325.949D) & 0x7FF;
        if (this.field3083 != null) {
            this.field3086 += arg0;
            label30: while (true) {
                do {
                    do {
                        if (this.field3086 <= this.field3083.field3648[this.field3069]) {
                            break label30;
                        }
                        this.field3086 -= this.field3083.field3648[this.field3069];
                        this.field3069++;
                    } while (this.field3069 < this.field3083.field3658.length);
                    this.field3069 -= this.field3083.field3659;
                } while (this.field3069 >= 0 && this.field3069 < this.field3083.field3658.length);
                this.field3069 = 0;
            }
        }
        if (arg1 != 0) {
            field3106 = null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIZII)V")
    public final void method1132(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (!this.field3081) {
            double var6 = (double) (arg0 - this.field3087);
            double var8 = (double) (arg3 - this.field3082);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field3084 = (double) this.field3094 * var8 / var10 + (double) this.field3082;
            this.field3098 = this.field3099;
            this.field3072 = (double) this.field3094 * var6 / var10 + (double) this.field3087;
        }
        if (!arg2) {
            method1134(125);
        }
        field3078++;
        double var12 = (double) (this.field3067 + 1 - arg4);
        this.field3097 = ((double) arg3 - this.field3084) / var12;
        this.field3092 = ((double) arg0 - this.field3072) / var12;
        this.field3096 = Math.sqrt(this.field3097 * this.field3097 + this.field3092 * this.field3092);
        if (!this.field3081) {
            this.field3075 = -this.field3096 * Math.tan((double) this.field3068 * 0.02454369D);
        }
        this.field3080 = ((double) arg1 - this.field3098 - this.field3075 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(B)Llg;")
    private final class127 method1133(byte arg0) {
        field3070++;
        class13 var2 = class79.method606(this.field3077, -1830);
        class127 var3 = var2.method117(false, this.field3069);
        if (arg0 > -112) {
            this.field3093 = -43;
        }
        if (var3 == null) {
            return null;
        } else {
            var3.method43(this.field3091);
            return var3;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method42(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field3074++;
        class127 var11 = this.method1133((byte) -121);
        if (var11 != null) {
            var11.method42(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field3088 = var11.method67();
        }
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)V")
    public static final void method1134(int arg0) {
        field3076++;
        class184 var1 = (class184) class234.field4352.method1189(0);
        if (arg0 <= 114) {
            method1130((byte) 35);
        }
        while (var1 != null) {
            class139 var2 = var1.field3200;
            if (class194.field3403 != var2.field2480 || var2.field2477) {
                var1.method1148(-13215);
            } else if (var2.field2489 <= class46.field868) {
                var2.method932(class102.field1855, -6645);
                if (var2.field2477) {
                    var1.method1148(-13215);
                } else {
                    class183.method1149(var2.field2480, var2.field2486, var2.field2488, var2.field2472, 60, var2, 0, -1L, false);
                }
            }
            var1 = (class184) class234.field4352.method1192((byte) -106);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "()I")
    public final int method67() {
        field3066++;
        return this.field3088;
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class179(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field3081 = false;
        this.field3068 = arg7;
        this.field3099 = arg4;
        this.field3089 = arg5;
        this.field3093 = arg1;
        this.field3067 = arg6;
        this.field3094 = arg8;
        this.field3077 = arg0;
        this.field3090 = arg10;
        this.field3095 = arg9;
        this.field3082 = arg2;
        this.field3087 = arg3;
        int var12 = class79.method606(this.field3077, -1830).field248;
        if (var12 == -1) {
            this.field3083 = null;
        } else {
            this.field3083 = class94.method672(var12, 117);
        }
    }
}
