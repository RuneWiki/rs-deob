import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class195 extends class178 {

    @OriginalMember(owner = "client!ve", name = "D", descriptor = "I")
    private int field3143 = -1;

    @OriginalMember(owner = "client!ve", name = "P", descriptor = "I")
    private int field3155 = 0;

    @OriginalMember(owner = "client!ve", name = "gb", descriptor = "I")
    private int field3171 = 0;

    @OriginalMember(owner = "client!ve", name = "H", descriptor = "I")
    private int field3147 = -32768;

    @OriginalMember(owner = "client!ve", name = "s", descriptor = "Z")
    private boolean field3132 = false;

    @OriginalMember(owner = "client!ve", name = "R", descriptor = "I")
    private int field3156;

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "I")
    public int field3129;

    @OriginalMember(owner = "client!ve", name = "eb", descriptor = "I")
    public int field3169;

    @OriginalMember(owner = "client!ve", name = "A", descriptor = "I")
    private int field3140;

    @OriginalMember(owner = "client!ve", name = "U", descriptor = "I")
    private int field3159;

    @OriginalMember(owner = "client!ve", name = "N", descriptor = "I")
    private int field3153;

    @OriginalMember(owner = "client!ve", name = "J", descriptor = "I")
    public int field3149;

    @OriginalMember(owner = "client!ve", name = "ib", descriptor = "I")
    public int field3173;

    @OriginalMember(owner = "client!ve", name = "r", descriptor = "I")
    private int field3131;

    @OriginalMember(owner = "client!ve", name = "db", descriptor = "I")
    public int field3168;

    @OriginalMember(owner = "client!ve", name = "ab", descriptor = "I")
    private int field3165;

    @OriginalMember(owner = "client!ve", name = "E", descriptor = "Lpi;")
    private class141 field3144;

    @OriginalMember(owner = "client!ve", name = "w", descriptor = "Z")
    public static boolean field3136 = false;

    @OriginalMember(owner = "client!ve", name = "S", descriptor = "Ljava/lang/String;")
    public static String field3157 = null;

    @OriginalMember(owner = "client!ve", name = "x", descriptor = "Lqi;")
    public static class131 field3137 = null;

    @OriginalMember(owner = "client!ve", name = "B", descriptor = "Ljava/lang/String;")
    public static String field3141 = "cyan:";

    @OriginalMember(owner = "client!ve", name = "L", descriptor = "I")
    public static int field3151 = 0;

    @OriginalMember(owner = "client!ve", name = "Y", descriptor = "Z")
    public static boolean field3163 = false;

    @OriginalMember(owner = "client!ve", name = "z", descriptor = "[I")
    public static int[] field3139 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

    @OriginalMember(owner = "client!ve", name = "u", descriptor = "D")
    public double field3134;

    @OriginalMember(owner = "client!ve", name = "v", descriptor = "D")
    public double field3135;

    @OriginalMember(owner = "client!ve", name = "C", descriptor = "D")
    private double field3142;

    @OriginalMember(owner = "client!ve", name = "G", descriptor = "D")
    private double field3146;

    @OriginalMember(owner = "client!ve", name = "I", descriptor = "D")
    private double field3148;

    @OriginalMember(owner = "client!ve", name = "O", descriptor = "D")
    private double field3154;

    @OriginalMember(owner = "client!ve", name = "T", descriptor = "D")
    public double field3158;

    @OriginalMember(owner = "client!ve", name = "bb", descriptor = "D")
    private double field3166;

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!ve", name = "t", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!ve", name = "y", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!ve", name = "K", descriptor = "I")
    public int field3150;

    @OriginalMember(owner = "client!ve", name = "M", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!ve", name = "Z", descriptor = "I")
    private int field3164;

    @OriginalMember(owner = "client!ve", name = "fb", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!ve", name = "hb", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!ve", name = "jb", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!ve", name = "kb", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!ve", name = "lb", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!ve", name = "W", descriptor = "Lbj;")
    private class157 field3161;

    @OriginalMember(owner = "client!ve", name = "X", descriptor = "Lhb;")
    public static class222 field3162;

    @OriginalMember(owner = "client!ve", name = "V", descriptor = "Ljava/awt/Font;")
    public static Font field3160;

    @OriginalMember(owner = "client!ve", name = "cb", descriptor = "[I")
    public static int[] field3167;

    @OriginalMember(owner = "client!ve", name = "F", descriptor = "[Lvd;")
    public static class4[] field3145;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)Lpc;")
    private final class22 method1442(int arg0) {
        field3130++;
        if (arg0 != 31216) {
            method1448(-55, -59, -22, false, 84, -53, 110, -42);
        }
        class55 var2 = class187.method1387((byte) 76, this.field3131);
        class22 var3 = var2.method412(this.field3171, this.field3155, arg0 - 48077, this.field3143);
        if (var3 == null) {
            return null;
        } else {
            var3.method161(this.field3164);
            return var3;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILlc;Llc;)V")
    public static final void method1443(int arg0, class86 arg1, class86 arg2) {
        class233.field3728 = arg2;
        class240.field3828 = arg1;
        class233.field3728.method617((byte) 52, 34);
        int var3 = (int) (Math.random() * 21.0D) - 10;
        field3170++;
        int var4 = arg0 + (int) (Math.random() * 21.0D);
        int var5 = (int) (Math.random() * 21.0D) - 10;
        int var6 = (int) (Math.random() * 41.0D) - 20;
        class101.field1482 = var4 + var6;
        class38.field534 = var3 + var6;
        class270.field4354 = var5 + var6;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "()I")
    public final int method3() {
        field3174++;
        return this.field3147;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IB)V")
    public final void method1444(int arg0, byte arg1) {
        field3133++;
        this.field3135 += (double) arg0 * this.field3166;
        this.field3132 = true;
        if (arg1 != -56) {
            return;
        }
        this.field3134 += (double) arg0 * this.field3142;
        if (this.field3140 == -1) {
            this.field3158 += (double) arg0 * this.field3146;
        } else {
            this.field3158 += this.field3154 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field3146;
            this.field3146 += (double) arg0 * this.field3154;
        }
        this.field3150 = (int) (Math.atan2(this.field3142, this.field3166) * 325.949D) + 1024 & 0x7FF;
        this.field3164 = (int) (Math.atan2(this.field3146, this.field3148) * 325.949D) & 0x7FF;
        if (this.field3144 == null) {
            return;
        }
        this.field3155 += arg0;
        while (true) {
            do {
                do {
                    if (this.field3155 <= this.field3144.field2263[this.field3171]) {
                        return;
                    }
                    this.field3155 -= this.field3144.field2263[this.field3171];
                    this.field3171++;
                    if (this.field3171 >= this.field3144.field2252.length) {
                        this.field3171 -= this.field3144.field2269;
                        if (this.field3171 < 0 || this.field3171 >= this.field3144.field2252.length) {
                            this.field3171 = 0;
                        }
                    }
                    this.field3143 = this.field3171 + 1;
                } while (this.field3144.field2252.length > this.field3143);
                this.field3143 -= this.field3144.field2269;
            } while (this.field3143 >= 0 && this.field3143 < this.field3144.field2252.length);
            this.field3143 = -1;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIII)V")
    public final void method4(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3138++;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)V")
    public static final void method1445(int arg0, int arg1) {
        class286 var2 = class220.field3525[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class286 var4 = class220.field3525[var3][arg0][arg1] = class220.field3525[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field4545--;
                for (int var5 = 0; var5 < var4.field4541; var5++) {
                    class166 var6 = var4.field4530[var5];
                    if ((var6.field2683 >> 29 & 0x3L) == 2L && var6.field2678 == arg0 && var6.field2684 == arg1) {
                        var6.field2680--;
                    }
                }
            }
        }
        if (class220.field3525[0][arg0][arg1] == null) {
            class220.field3525[0][arg0][arg1] = new class286(0, arg0, arg1);
        }
        class220.field3525[0][arg0][arg1].field4523 = var2;
        class220.field3525[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "(I)V")
    public static final void method1446(int arg0) {
        field3176++;
        class164 var1 = class276.field4431;
        synchronized (class276.field4431) {
            class243.field3921 = class283.field4496;
            class293.field4650++;
            class169.field2731 = class77.field1100;
            class296.field4680 = class290.field4601;
            class118.field1714 = class23.field274;
            class126.field1850 = class257.field4234;
            class101.field1497 = class52.field749;
            class178.field2885 = class266.field4306;
            class23.field274 = arg0;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V")
    public static void method1447(byte arg0) {
        field3141 = null;
        field3137 = null;
        field3145 = null;
        if (arg0 >= -115) {
            return;
        }
        field3157 = null;
        field3160 = null;
        field3162 = null;
        field3139 = null;
        field3167 = null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIIIIIJILbj;)V")
    public final void method2(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class157 arg10) {
        field3172++;
        class22 var13 = this.method1442(31216);
        if (var13 != null) {
            var13.method2(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field3161);
            this.field3147 = var13.method3();
        }
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class195(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field3156 = arg3;
        this.field3129 = arg6;
        this.field3169 = arg10;
        this.field3140 = arg7;
        this.field3159 = arg2;
        this.field3153 = arg4;
        this.field3132 = false;
        this.field3149 = arg5;
        this.field3173 = arg1;
        this.field3131 = arg0;
        this.field3168 = arg9;
        this.field3165 = arg8;
        int var12 = class187.method1387((byte) 10, this.field3131).field794;
        if (var12 == -1) {
            this.field3144 = null;
        } else {
            this.field3144 = class285.method1939(var12, 112);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIZIIII)V")
    public static final void method1448(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        field3152++;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg6;
        int var11 = arg7 - arg1;
        int var12 = arg7 * arg7;
        int var13 = arg6 - arg1;
        if (arg3) {
            method1445(90, 120);
        }
        int var14 = arg6 * arg6;
        int var15 = var11 * var11;
        int var16 = var13 * var13;
        int var17 = var14 << 1;
        int var18 = var16 << 1;
        int var19 = var15 << 1;
        int var20 = var12 << 1;
        int var21 = arg6 << 1;
        int var22 = (1 - var21) * var12 + var17;
        int var23 = var13 << 1;
        int var24 = (1 - var23) * var15 + var18;
        int var25 = var16 - ((var23 - 1) * var19);
        int var26 = var14 - ((var21 - 1) * var20);
        int var27 = var12 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var20;
        int var33 = var18 * 3;
        int var34 = (var23 - 3) * var19;
        int var35 = var28;
        int var36 = (arg6 - 1) * var27;
        int var37 = var30;
        int var38 = (var13 - 1) * var29;
        if (class207.field3328 <= arg2 && arg2 <= class228.field3657) {
            int[] var39 = class240.field3831[arg2];
            int var40 = class281.method1924(false, class211.field3386, class272.field4374, arg4 - arg7);
            int var41 = class281.method1924(false, class211.field3386, class272.field4374, arg4 + arg7);
            int var42 = class281.method1924(false, class211.field3386, class272.field4374, arg4 - var11);
            int var43 = class281.method1924(false, class211.field3386, class272.field4374, arg4 + var11);
            class177.method1330(var39, var40, arg5, 32232, var42);
            class177.method1330(var39, var42, arg0, 32232, var43);
            class177.method1330(var39, var43, arg5, 32232, var41);
        }
        while (var10 > 0) {
            if (var22 < 0) {
                while (var22 < 0) {
                    var26 += var35;
                    var8++;
                    var35 += var28;
                    var22 += var31;
                    var31 += var28;
                }
            }
            boolean var44 = var10 <= var13;
            var10--;
            if (var26 < 0) {
                var8++;
                var26 += var35;
                var35 += var28;
                var22 += var31;
                var31 += var28;
            }
            var26 += -var32;
            if (var44) {
                if (var24 < 0) {
                    while (var24 < 0) {
                        var25 += var37;
                        var37 += var30;
                        var24 += var33;
                        var9++;
                        var33 += var30;
                    }
                }
                if (var25 < 0) {
                    var9++;
                    var24 += var33;
                    var25 += var37;
                    var37 += var30;
                    var33 += var30;
                }
                var24 += -var38;
                var25 += -var34;
                var38 -= var29;
                var34 -= var29;
            }
            int var45 = arg2 + var10;
            var22 += -var36;
            var32 -= var27;
            int var46 = arg2 - var10;
            var36 -= var27;
            if (class207.field3328 <= var45 && var46 <= class228.field3657) {
                int var47 = class281.method1924(false, class211.field3386, class272.field4374, arg4 + var8);
                int var48 = class281.method1924(false, class211.field3386, class272.field4374, arg4 - var8);
                if (var44) {
                    int var49 = class281.method1924(false, class211.field3386, class272.field4374, arg4 + var9);
                    int var50 = class281.method1924(false, class211.field3386, class272.field4374, arg4 - var9);
                    if (var46 >= class207.field3328) {
                        int[] var51 = class240.field3831[var46];
                        class177.method1330(var51, var48, arg5, 32232, var50);
                        class177.method1330(var51, var50, arg0, 32232, var49);
                        class177.method1330(var51, var49, arg5, 32232, var47);
                    }
                    if (class228.field3657 >= var45) {
                        int[] var52 = class240.field3831[var45];
                        class177.method1330(var52, var48, arg5, 32232, var50);
                        class177.method1330(var52, var50, arg0, 32232, var49);
                        class177.method1330(var52, var49, arg5, 32232, var47);
                    }
                } else {
                    if (class207.field3328 <= var46) {
                        class177.method1330(class240.field3831[var46], var48, arg5, 32232, var47);
                    }
                    if (class228.field3657 >= var45) {
                        class177.method1330(class240.field3831[var45], var48, arg5, 32232, var47);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(IIIII)V")
    public final void method1449(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field3132) {
            double var6 = (double) (arg0 - this.field3159);
            double var8 = (double) (arg4 - this.field3156);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field3158 = (double) this.field3153;
            this.field3135 = (double) this.field3165 * var8 / var10 + (double) this.field3156;
            this.field3134 = (double) this.field3165 * var6 / var10 + (double) this.field3159;
        }
        double var12 = (double) (this.field3129 - (arg2 - 1));
        this.field3142 = ((double) arg0 - this.field3134) / var12;
        this.field3166 = ((double) arg4 - this.field3135) / var12;
        this.field3148 = Math.sqrt(this.field3166 * this.field3166 + this.field3142 * this.field3142);
        if (~this.field3140 == arg3) {
            this.field3146 = ((double) arg1 - this.field3158) / var12;
        } else {
            if (!this.field3132) {
                this.field3146 = -this.field3148 * Math.tan((double) this.field3140 * 0.02454369D);
            }
            this.field3154 = ((double) arg1 - this.field3158 - this.field3146 * var12) * 2.0D / (var12 * var12);
        }
        field3175++;
    }
}
