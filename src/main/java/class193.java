import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class193 extends class197 {

    @OriginalMember(owner = "client!i", name = "p", descriptor = "I")
    private int field3070 = -1;

    @OriginalMember(owner = "client!i", name = "n", descriptor = "Z")
    private boolean field3068 = false;

    @OriginalMember(owner = "client!i", name = "r", descriptor = "I")
    private int field3072 = 0;

    @OriginalMember(owner = "client!i", name = "G", descriptor = "I")
    private int field3087 = -32768;

    @OriginalMember(owner = "client!i", name = "Z", descriptor = "I")
    private int field3106 = 0;

    @OriginalMember(owner = "client!i", name = "Y", descriptor = "I")
    private int field3105;

    @OriginalMember(owner = "client!i", name = "z", descriptor = "I")
    private int field3080;

    @OriginalMember(owner = "client!i", name = "N", descriptor = "I")
    private int field3094;

    @OriginalMember(owner = "client!i", name = "ab", descriptor = "I")
    private int field3107;

    @OriginalMember(owner = "client!i", name = "u", descriptor = "I")
    private int field3075;

    @OriginalMember(owner = "client!i", name = "s", descriptor = "I")
    public int field3073;

    @OriginalMember(owner = "client!i", name = "H", descriptor = "I")
    public int field3088;

    @OriginalMember(owner = "client!i", name = "W", descriptor = "I")
    public int field3103;

    @OriginalMember(owner = "client!i", name = "D", descriptor = "I")
    public int field3084;

    @OriginalMember(owner = "client!i", name = "O", descriptor = "I")
    public int field3095;

    @OriginalMember(owner = "client!i", name = "R", descriptor = "I")
    private int field3098;

    @OriginalMember(owner = "client!i", name = "A", descriptor = "Lni;")
    private class21 field3081;

    @OriginalMember(owner = "client!i", name = "T", descriptor = "Leg;")
    public static class272 field3100 = new class272(20);

    @OriginalMember(owner = "client!i", name = "X", descriptor = "Ljava/lang/String;")
    public static String field3104 = "Face here";

    @OriginalMember(owner = "client!i", name = "q", descriptor = "D")
    private double field3071;

    @OriginalMember(owner = "client!i", name = "t", descriptor = "D")
    public double field3074;

    @OriginalMember(owner = "client!i", name = "C", descriptor = "D")
    public double field3083;

    @OriginalMember(owner = "client!i", name = "I", descriptor = "D")
    public double field3089;

    @OriginalMember(owner = "client!i", name = "M", descriptor = "D")
    private double field3093;

    @OriginalMember(owner = "client!i", name = "Q", descriptor = "D")
    private double field3097;

    @OriginalMember(owner = "client!i", name = "S", descriptor = "D")
    private double field3099;

    @OriginalMember(owner = "client!i", name = "V", descriptor = "D")
    private double field3102;

    @OriginalMember(owner = "client!i", name = "o", descriptor = "I")
    public static int field3069;

    @OriginalMember(owner = "client!i", name = "v", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!i", name = "w", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!i", name = "x", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!i", name = "y", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!i", name = "B", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!i", name = "F", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!i", name = "J", descriptor = "I")
    public static int field3090;

    @OriginalMember(owner = "client!i", name = "L", descriptor = "I")
    public int field3092;

    @OriginalMember(owner = "client!i", name = "P", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!i", name = "U", descriptor = "I")
    private int field3101;

    @OriginalMember(owner = "client!i", name = "bb", descriptor = "I")
    public static int field3108;

    @OriginalMember(owner = "client!i", name = "K", descriptor = "Ljj;")
    public static class134 field3091;

    @OriginalMember(owner = "client!i", name = "E", descriptor = "Lqc;")
    private class4 field3085;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IZ)V")
    public static final void method1301(int arg0, boolean arg1) {
        field3076++;
        byte[][] var2 = class67.field948;
        byte var3 = 4;
        int[] var4 = null;
        int var5 = 0;
        if (arg0 >= -21) {
            field3108 = 13;
        }
        while (var3 > var5) {
            class280.method1873((byte) -54);
            for (int var6 = 0; var6 < 13; var6++) {
                for (int var7 = 0; var7 < 13; var7++) {
                    boolean var8 = false;
                    int var9 = class140.field2298[var5][var6][var7];
                    if (var9 != -1) {
                        int var10 = (var9 & 0x3129BD8) >> 24;
                        if (!arg1 || var10 == 0) {
                            int var11 = var9 >> 3 & 0x7FF;
                            int var12 = var9 >> 14 & 0x3FF;
                            int var13 = (var9 & 0x6) >> 1;
                            int var14 = (var12 / 8 << 8) + var11 / 8;
                            for (int var15 = 0; var15 < class69.field958.length; var15++) {
                                if (class69.field958[var15] == var14 && var2[var15] != null) {
                                    int[] var16 = class51.method399(var10, arg1, var2[var15], var13, var6 * 8, var12, -74, var7 * 8, var11, var5, class61.field839);
                                    if (var4 == null && var16 != null) {
                                        var4 = var16;
                                    }
                                    var8 = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (!var8) {
                        class25.method177((byte) 51, 8, var6 * 8, var7 * 8, var5, 8);
                    }
                }
            }
            var5++;
        }
        if (var4 == null) {
            class233.field3713 = -1;
            return;
        }
        class6.field70 = var4[1];
        class236.field3778 = var4[4];
        class230.field3661 = var4[3];
        class241.field3879 = var4[2];
        class233.field3713 = var4[0];
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(B)V")
    public static void method1302(byte arg0) {
        if (arg0 <= 71) {
            field3108 = -63;
        }
        field3104 = null;
        field3091 = null;
        field3100 = null;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(IIIII)V")
    public static final void method1303(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != -1) {
            return;
        }
        field3069++;
        class283 var5 = class46.method360(4, arg0 ^ 0x66, arg2);
        var5.method1893(0);
        var5.field4528 = arg1;
        var5.field4527 = arg4;
        var5.field4523 = arg3;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIII)V")
    public final void method74(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3090++;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(II)V")
    public final void method1304(int arg0, int arg1) {
        this.field3068 = true;
        this.field3074 += (double) arg1 * this.field3093;
        if (this.field3098 == -1) {
            this.field3083 += (double) arg1 * this.field3097;
        } else {
            this.field3083 += this.field3071 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field3097;
            this.field3097 += (double) arg1 * this.field3071;
        }
        this.field3089 += (double) arg1 * this.field3102;
        this.field3092 = (int) (Math.atan2(this.field3093, this.field3102) * 325.949D) + 1024 & 0x7FF;
        field3096++;
        this.field3101 = (int) (Math.atan2(this.field3097, this.field3099) * 325.949D) & 0x7FF;
        if (this.field3081 != null) {
            this.field3106 += arg1;
            label45: while (true) {
                do {
                    do {
                        if (this.field3081.field240[this.field3072] >= this.field3106) {
                            break label45;
                        }
                        this.field3106 -= this.field3081.field240[this.field3072];
                        this.field3072++;
                        if (this.field3072 >= this.field3081.field237.length) {
                            this.field3072 -= this.field3081.field248;
                            if (this.field3072 < 0 || this.field3081.field237.length <= this.field3072) {
                                this.field3072 = 0;
                            }
                        }
                        this.field3070 = this.field3072 + 1;
                    } while (this.field3081.field237.length > this.field3070);
                    this.field3070 -= this.field3081.field248;
                } while (this.field3070 >= 0 && this.field3081.field237.length > this.field3070);
                this.field3070 = -1;
            }
        }
        if (arg0 != -9406) {
            this.field3103 = -35;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IZIII)V")
    public final void method1305(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field3086++;
        if (!this.field3068) {
            double var6 = (double) (arg0 - this.field3107);
            double var8 = (double) (arg4 - this.field3075);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field3089 = (double) this.field3105 * var6 / var10 + (double) this.field3107;
            this.field3083 = (double) this.field3080;
            this.field3074 = (double) this.field3105 * var8 / var10 + (double) this.field3075;
        }
        double var12 = (double) (this.field3088 + 1 - arg2);
        this.field3093 = ((double) arg4 - this.field3074) / var12;
        this.field3102 = ((double) arg0 - this.field3089) / var12;
        this.field3099 = Math.sqrt(this.field3102 * this.field3102 + this.field3093 * this.field3093);
        if (!arg1) {
            return;
        }
        if (this.field3098 == -1) {
            this.field3097 = ((double) arg3 - this.field3083) / var12;
        } else {
            if (!this.field3068) {
                this.field3097 = -this.field3099 * Math.tan((double) this.field3098 * 0.02454369D);
            }
            this.field3071 = ((double) arg3 - this.field3083 - this.field3097 * var12) * 2.0D / (var12 * var12);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIIIIIJILqc;)V")
    public final void method85(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class4 arg10) {
        field3079++;
        class13 var13 = this.method1306(1);
        if (var13 != null) {
            var13.method85(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field3085);
            this.field3087 = var13.method88();
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "()I")
    public final int method88() {
        field3082++;
        return this.field3087;
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class193(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field3105 = arg8;
        this.field3068 = false;
        this.field3080 = arg4;
        this.field3094 = arg0;
        this.field3107 = arg3;
        this.field3075 = arg2;
        this.field3073 = arg5;
        this.field3088 = arg6;
        this.field3103 = arg9;
        this.field3084 = arg10;
        this.field3095 = arg1;
        this.field3098 = arg7;
        int var12 = class271.method1826(this.field3094, (byte) 120).field929;
        if (var12 == -1) {
            this.field3081 = null;
        } else {
            this.field3081 = class267.method1812((byte) 89, var12);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)Lue;")
    private final class13 method1306(int arg0) {
        field3078++;
        class66 var2 = class271.method1826(this.field3094, (byte) 124);
        if (arg0 != 1) {
            this.method1306(-100);
        }
        class13 var3 = var2.method526(this.field3072, this.field3106, false, this.field3070);
        if (var3 == null) {
            return null;
        } else {
            var3.method91(this.field3101);
            return var3;
        }
    }
}
