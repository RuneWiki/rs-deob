import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class223 extends class153 {

    @OriginalMember(owner = "client!lq", name = "v", descriptor = "Z")
    private boolean field3113 = false;

    @OriginalMember(owner = "client!lq", name = "G", descriptor = "I")
    private int field3124 = 0;

    @OriginalMember(owner = "client!lq", name = "M", descriptor = "I")
    private int field3130 = 0;

    @OriginalMember(owner = "client!lq", name = "R", descriptor = "I")
    private int field3135 = -32768;

    @OriginalMember(owner = "client!lq", name = "bb", descriptor = "I")
    private int field3145 = -1;

    @OriginalMember(owner = "client!lq", name = "lb", descriptor = "I")
    public int field3155;

    @OriginalMember(owner = "client!lq", name = "N", descriptor = "I")
    private int field3131;

    @OriginalMember(owner = "client!lq", name = "U", descriptor = "I")
    private int field3138;

    @OriginalMember(owner = "client!lq", name = "W", descriptor = "I")
    private int field3140;

    @OriginalMember(owner = "client!lq", name = "V", descriptor = "I")
    public int field3139;

    @OriginalMember(owner = "client!lq", name = "T", descriptor = "Z")
    private boolean field3137;

    @OriginalMember(owner = "client!lq", name = "gb", descriptor = "I")
    private int field3150;

    @OriginalMember(owner = "client!lq", name = "H", descriptor = "I")
    public int field3125;

    @OriginalMember(owner = "client!lq", name = "db", descriptor = "I")
    public int field3147;

    @OriginalMember(owner = "client!lq", name = "X", descriptor = "Ltq;")
    private class270 field3141;

    @OriginalMember(owner = "client!lq", name = "A", descriptor = "Ler;")
    public static class157 field3118 = new class157(64);

    @OriginalMember(owner = "client!lq", name = "fb", descriptor = "I")
    public static int field3149 = 0;

    @OriginalMember(owner = "client!lq", name = "u", descriptor = "D")
    private double field3112;

    @OriginalMember(owner = "client!lq", name = "x", descriptor = "D")
    private double field3115;

    @OriginalMember(owner = "client!lq", name = "D", descriptor = "D")
    private double field3121;

    @OriginalMember(owner = "client!lq", name = "E", descriptor = "D")
    private double field3122;

    @OriginalMember(owner = "client!lq", name = "P", descriptor = "D")
    private double field3133;

    @OriginalMember(owner = "client!lq", name = "Q", descriptor = "D")
    private double field3134;

    @OriginalMember(owner = "client!lq", name = "cb", descriptor = "D")
    private double field3146;

    @OriginalMember(owner = "client!lq", name = "hb", descriptor = "D")
    private double field3151;

    @OriginalMember(owner = "client!lq", name = "t", descriptor = "I")
    private int field3111;

    @OriginalMember(owner = "client!lq", name = "w", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!lq", name = "y", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!lq", name = "z", descriptor = "I")
    public static int field3117;

    @OriginalMember(owner = "client!lq", name = "B", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!lq", name = "F", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!lq", name = "I", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!lq", name = "J", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!lq", name = "K", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!lq", name = "L", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!lq", name = "O", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!lq", name = "S", descriptor = "I")
    public static int field3136;

    @OriginalMember(owner = "client!lq", name = "Y", descriptor = "I")
    private int field3142;

    @OriginalMember(owner = "client!lq", name = "Z", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!lq", name = "ab", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!lq", name = "eb", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!lq", name = "jb", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!lq", name = "kb", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!lq", name = "C", descriptor = "Lli;")
    private class134 field3120;

    @OriginalMember(owner = "client!lq", name = "ib", descriptor = "Lf;")
    public static class191 field3152;

    @OriginalMember(owner = "client!lq", name = "e", descriptor = "(I)V", line = 5)
    public final void method57(int arg0) {
        if (arg0 != -5077) {
            this.field3133 = -0.6682635966119381D;
        }
        ++field3116;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(ILqa;Lc;)V", line = 18)
    private final void method1503(int arg0, class496 arg1, class201 arg2) {
        ++field3136;
        class525[] var4 = arg2.method296();
        class439[] var5 = arg2.method283();
        if ((this.field3120 == null || this.field3120.field1932) && (var4 != null || var5 != null)) {
            this.field3120 = new class134(class405.field6116);
        }
        if (this.field3120 != null) {
            this.field3120.method869(arg1, (long) class405.field6116, var4, var5, false);
            this.field3120.method862(super.field2210, super.field2208, super.field2214, super.field2216, super.field2213);
        }
        if (arg0 != -32180) {
            this.field3141 = null;
        }
    }

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "(I)Z", line = 47)
    public final boolean method49(int arg0) {
        ++field3126;
        return arg0 != 7 ? false : false;
    }

    @OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(IIIIIIIIIIIZ)V", line = 305)
    public class223(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11) {
        super(arg1, arg2, class500.method2985(arg2, 5293, arg1, arg3) - arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
        this.field3155 = arg9;
        this.field3131 = arg0;
        this.field3138 = arg4;
        this.field3140 = arg8;
        this.field3139 = arg10;
        this.field3137 = arg11;
        this.field3113 = false;
        this.field3150 = arg7;
        this.field3125 = arg6;
        this.field3147 = arg5;
        int var13 = class275.field3826.method108(this.field3131, 0).field5705;
        if (var13 == -1) {
            this.field3141 = null;
        } else {
            this.field3141 = class260.field3621.method1934(120, var13);
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lqa;II)Lc;", line = 66)
    private final class201 method1504(class496 arg0, int arg1, int arg2) {
        if (arg1 >= -43) {
            return null;
        } else {
            ++field3144;
            class372 var4 = class275.field3826.method108(this.field3131, 0);
            return var4.method2331(0, this.field3145, this.field3124, arg2, this.field3130, arg0, class260.field3621);
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)V", line = 86)
    public final void method1505(int arg0) {
        ++field3114;
        if (arg0 != -31594) {
            this.field3122 = -0.596339355583446D;
        }
        if (this.field3120 != null) {
            this.field3120.method872();
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Ljn;Ljn;I)V", line = 100)
    public static final void method1506(class86 arg0, class86 arg1, int arg2) {
        if (arg2 != 0) {
            field3152 = null;
        }
        if (arg0.field1180 != null) {
            arg0.method560((byte) -102);
        }
        ++field3127;
        arg0.field1177 = arg1.field1177;
        arg0.field1180 = arg1;
        arg0.field1180.field1177 = arg0;
        arg0.field1177.field1180 = arg0;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(II)V", line = 121)
    public final void method1507(int arg0, int arg1) {
        this.field3134 += (double) arg0 * this.field3112;
        this.field3113 = true;
        this.field3122 += (double) arg0 * this.field3146;
        ++field3143;
        if (!this.field3137) {
            if (this.field3150 != -1) {
                this.field3133 += this.field3151 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field3115;
                this.field3115 += (double) arg0 * this.field3151;
            } else {
                this.field3133 += (double) arg0 * this.field3115;
            }
        } else {
            this.field3133 = (double) (class500.method2985((int) this.field3122, 5293, super.field2210, (int) this.field3134) + -this.field3138);
        }
        this.field3111 = (int) (2607.5945876176133D * Math.atan2(this.field3146, this.field3112)) + 8192 & 16383;
        int var3 = 40 / ((40 - arg1) / 58);
        this.field3142 = (int) (2607.5945876176133D * Math.atan2(this.field3115, this.field3121)) & 16383;
        if (this.field3141 != null) {
            this.field3130 += arg0;
            while (true) {
                do {
                    do {
                        if (this.field3130 <= this.field3141.field3746[this.field3124]) {
                            return;
                        }
                        this.field3130 -= this.field3141.field3746[this.field3124];
                        ++this.field3124;
                        if (~this.field3141.field3765.length >= ~this.field3124) {
                            this.field3124 -= this.field3141.field3737;
                            if (this.field3124 < 0 || ~this.field3124 <= ~this.field3141.field3765.length) {
                                this.field3124 = 0;
                            }
                        }
                        this.field3145 = this.field3124 - -1;
                    } while (this.field3145 < this.field3141.field3765.length);
                    this.field3145 -= this.field3141.field3737;
                } while (~this.field3145 <= -1 && ~this.field3145 > ~this.field3141.field3765.length);
                this.field3145 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!lq", name = "f", descriptor = "(I)V", line = 179)
    public final void method1001(int arg0) {
        super.field2208 = super.field2214 = (short) ((int) (this.field3122 / 128.0D));
        super.field2216 = super.field2213 = (short) ((int) (this.field3134 / 128.0D));
        if (arg0 >= -89) {
            this.field3134 = -2.700259335149988D;
        }
        ++field3148;
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(BLqa;)V", line = 197)
    public final void method62(byte arg0, class496 arg1) {
        ++field3153;
        class201 var3 = this.method1504(arg1, -50, 0);
        if (var3 != null) {
            class23 var4 = arg1.method1088();
            var4.method182(this.field3142);
            if (arg0 == -126) {
                var4.method181(this.field3111);
                var4.method177((int) this.field3122, (int) this.field3133, (int) this.field3134);
                this.field3135 = var3.method306();
                this.method1503(-32180, arg1, var3);
            }
        }
    }

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "(B)I", line = 219)
    public final int method779(byte arg0) {
        ++field3128;
        if (arg0 != 9) {
            this.field3139 = -89;
        }
        return this.field3135;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lqv;BLqa;IZII)V", line = 231)
    public final void method61(class49 arg0, byte arg1, class496 arg2, int arg3, boolean arg4, int arg5, int arg6) {
        ++field3154;
        if (arg1 != 118) {
            this.method779((byte) 103);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIILqa;)Z", line = 243)
    public final boolean method56(int arg0, int arg1, int arg2, class496 arg3) {
        if (arg1 != 3) {
            return false;
        } else {
            ++field3123;
            return false;
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lqa;I)Lpj;", line = 258)
    public final class507 method51(class496 arg0, int arg1) {
        ++field3132;
        class201 var3 = this.method1504(arg0, arg1 ^ 173, 2048);
        if (var3 == null) {
            return null;
        } else {
            if (arg1 != -150) {
                this.method1503(-68, (class496) null, (class201) null);
            }
            class23 var4 = arg0.method1088();
            var4.method182(this.field3142);
            var4.method181(this.field3111);
            var4.method177((int) this.field3122, (int) this.field3133, (int) this.field3134);
            if (this.field3120 == null) {
                var3.method318(var4, (class159) null, 0);
            } else {
                class258 var5 = this.field3120.method870();
                arg0.method1047(var3, var5, var4, (class159) null, 0);
            }
            this.field3135 = var3.method306();
            this.method1503(-32180, arg0, var3);
            return null;
        }
    }

    @OriginalMember(owner = "client!lq", name = "finalize", descriptor = "()V", line = 293)
    protected final void finalize() {
        ++field3129;
        if (this.field3120 != null) {
            this.field3120.method872();
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIIII)V", line = 354)
    public final void method1508(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field3113) {
            double var6 = (double) (-super.field2217 + arg3);
            double var8 = (double) (arg4 - super.field2215);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field3122 = (double) this.field3140 * var6 / var10 + (double) super.field2217;
            this.field3134 = (double) this.field3140 * var8 / var10 + (double) super.field2215;
            if (!this.field3137) {
                this.field3133 = (double) super.field2222;
            } else {
                this.field3133 = (double) (class500.method2985((int) this.field3122, 5293, super.field2210, (int) this.field3134) - this.field3138);
            }
        }
        ++field3117;
        double var12 = (double) (this.field3125 - arg2 + 1);
        this.field3146 = ((double) arg3 + -this.field3122) / var12;
        if (arg0 == -24131) {
            this.field3112 = ((double) arg4 - this.field3134) / var12;
            this.field3121 = Math.sqrt(this.field3146 * this.field3146 + this.field3112 * this.field3112);
            if (this.field3150 != -1) {
                if (!this.field3113) {
                    this.field3115 = -this.field3121 * Math.tan((double) this.field3150 * 0.02454369D);
                }
                this.field3151 = ((double) arg1 + -this.field3133 + -(this.field3115 * var12)) * 2.0D / (var12 * var12);
            } else {
                this.field3115 = ((double) arg1 - this.field3133) / var12;
            }
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 400)
    public static final String method1509(String arg0, int arg1) {
        if (arg1 != 0) {
            return null;
        } else {
            ++field3119;
            String var2 = class259.method1676((byte) 95, class220.method1486(arg0, -48));
            if (var2 == null) {
                var2 = "";
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(I)V", line = 416)
    public static void method1510(int arg0) {
        if (arg0 != -176577049) {
            method1511((class153) null, true);
        }
        field3118 = null;
        field3152 = null;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lvj;Z)Z", line = 428)
    public static final boolean method1511(class153 arg0, boolean arg1) {
        boolean var2 = class455.field6683 == class187.field2632;
        int var3 = 0;
        byte var4 = 0;
        byte var5 = 0;
        arg0.method1001(-116);
        if (arg0.field2208 >= 0 && arg0.field2216 >= 0 && arg0.field2214 < class492.field7186 && arg0.field2213 < class285.field4248) {
            for (int var6 = arg0.field2208; var6 <= arg0.field2214; ++var6) {
                for (int var9 = arg0.field2216; var9 <= arg0.field2213; ++var9) {
                    class420 var10 = class422.method2542(arg0.field2210, var6, var9);
                    if (var10 != null) {
                        int var11 = 0;
                        if (var6 > arg0.field2208) {
                            ++var11;
                        }
                        if (var6 < arg0.field2214) {
                            var11 += 4;
                        }
                        if (var9 > arg0.field2216) {
                            var11 += 8;
                        }
                        if (var9 < arg0.field2213) {
                            var11 += 2;
                        }
                        class115 var12 = class404.method2476(var11, -27543, arg0);
                        class115 var13 = var10.field6273;
                        if (var13 == null) {
                            var10.field6273 = var12;
                        } else {
                            while (var13.field1600 != null) {
                                var13 = var13.field1600;
                            }
                            var13.field1600 = var12;
                        }
                        var10.field6258 = (byte) (var10.field6258 | var11);
                        if (var2 && (class202.field2843[var6][var9] & -16777216) != 0) {
                            var3 = class202.field2843[var6][var9];
                            var4 = class518.field7684[var6][var9];
                            var5 = class482.field7024[var6][var9];
                        }
                    }
                }
            }
            if (var2 && (var3 & -16777216) != 0) {
                for (int var7 = arg0.field2208; var7 <= arg0.field2214; ++var7) {
                    for (int var8 = arg0.field2216; var8 <= arg0.field2213; ++var8) {
                        if ((class202.field2843[var7][var8] & -16777216) == 0) {
                            class202.field2843[var7][var8] = var3;
                            class518.field7684[var7][var8] = var4;
                            class482.field7024[var7][var8] = var5;
                        }
                    }
                }
            }
            if (arg1) {
                class232.field3295[class494.field7230++] = arg0;
            }
            return true;
        } else {
            return false;
        }
    }
}
