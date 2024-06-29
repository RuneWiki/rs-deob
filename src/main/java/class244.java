import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class244 extends class398 {

    @OriginalMember(owner = "client!rp", name = "J", descriptor = "I")
    private int field3244 = 0;

    @OriginalMember(owner = "client!rp", name = "S", descriptor = "I")
    private int field3253 = 0;

    @OriginalMember(owner = "client!rp", name = "P", descriptor = "I")
    private int field3250 = 0;

    @OriginalMember(owner = "client!rp", name = "X", descriptor = "Lps;")
    public static class394 field3258 = null;

    @OriginalMember(owner = "client!rp", name = "N", descriptor = "Lcr;")
    public static class189 field3248 = new class189(64);

    @OriginalMember(owner = "client!rp", name = "K", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!rp", name = "L", descriptor = "I")
    private int field3246;

    @OriginalMember(owner = "client!rp", name = "M", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!rp", name = "O", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!rp", name = "Q", descriptor = "I")
    private int field3251;

    @OriginalMember(owner = "client!rp", name = "R", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!rp", name = "T", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!rp", name = "U", descriptor = "I")
    private int field3255;

    @OriginalMember(owner = "client!rp", name = "V", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!rp", name = "W", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!rp", name = "Y", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!rp", name = "Z", descriptor = "I")
    private int field3260;

    @OriginalMember(owner = "client!rp", name = "ab", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!rp", name = "bb", descriptor = "I")
    private int field3262;

    @OriginalMember(owner = "client!rp", name = "cb", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!rp", name = "db", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!rp", name = "eb", descriptor = "I")
    private int field3265;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lnj;II)V", line = 5)
    public final void method208(class228 arg0, int arg1, int arg2) {
        ++field3256;
        if (arg2 == -13132) {
            if (~arg1 != -1) {
                if (arg1 != 1) {
                    if (~arg1 == -3) {
                        this.field3253 = (arg0.method1349(arg2 + 13135) << 12) / 100;
                    }
                } else {
                    this.field3244 = (arg0.method1349(3) << 12) / 100;
                }
            } else {
                this.field3250 = arg0.method1319((byte) -13);
            }
        }
    }

    @OriginalMember(owner = "client!rp", name = "<init>", descriptor = "()V", line = 501)
    public class244() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "(II)[[I", line = 60)
    public final int[][] method99(int arg0, int arg1) {
        if (arg1 != 2) {
            return null;
        } else {
            ++field3252;
            int[][] var3 = super.field5933.method2205((byte) -114, arg0);
            if (super.field5933.field4847) {
                int[][] var4 = this.method2561(arg0, (byte) -101, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~class140.field1922 < ~var11; ++var11) {
                    this.method1462(true, var5[var11], var6[var11], var7[var11]);
                    this.field3260 += this.field3253;
                    this.field3262 += this.field3250;
                    this.field3255 += this.field3244;
                    while (~this.field3262 > -1) {
                        this.field3262 += 4096;
                    }
                    while (~this.field3262 < -4097) {
                        this.field3262 -= 4096;
                    }
                    if (~this.field3255 > -1) {
                        this.field3255 = 0;
                    }
                    if (~this.field3255 < -4097) {
                        this.field3255 = 4096;
                    }
                    if (~this.field3260 > -1) {
                        this.field3260 = 0;
                    }
                    if (~this.field3260 < -4097) {
                        this.field3260 = 4096;
                    }
                    this.method1463(this.field3260, this.field3255, this.field3262, true);
                    var8[var11] = this.field3251;
                    var9[var11] = this.field3246;
                    var10[var11] = this.field3265;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "(III)I", line = 131)
    public static final int method1461(int arg0, int arg1, int arg2) {
        if (arg2 >= -19) {
            return -42;
        } else {
            if (arg0 < arg1) {
                int var3 = arg0;
                arg0 = arg1;
                arg1 = var3;
            }
            ++field3245;
            while (arg1 != 0) {
                int var4 = arg0 % arg1;
                arg0 = arg1;
                arg1 = var4;
            }
            return arg0;
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(ZIII)V", line = 159)
    private final void method1462(boolean arg0, int arg1, int arg2, int arg3) {
        ++field3247;
        if (arg0) {
            int var5 = ~arg2 <= ~arg1 ? arg2 : arg1;
            int var6 = ~arg2 >= ~arg1 ? arg2 : arg1;
            int var7 = ~arg3 >= ~var5 ? var5 : arg3;
            int var8 = var6 <= arg3 ? var6 : arg3;
            this.field3260 = (var7 + var8) / 2;
            int var9 = var7 - var8;
            if (~this.field3260 < -1 && ~this.field3260 > -4097) {
                this.field3255 = (var9 << 12) / (~this.field3260 >= -2049 ? this.field3260 * 2 : -(this.field3260 * 2) + 8192);
            } else {
                this.field3255 = 0;
            }
            if (~var9 < -1) {
                int var10 = (-arg1 + var7 << 12) / var9;
                int var11 = (-arg2 + var7 << 12) / var9;
                int var12 = (-arg3 + var7 << 12) / var9;
                if (arg1 == var7) {
                    this.field3262 = ~arg2 == ~var8 ? var12 + 20480 : -var11 + 4096;
                } else if (arg2 != var7) {
                    this.field3262 = ~arg1 == ~var8 ? var11 + 12288 : -var10 + 20480;
                } else {
                    this.field3262 = ~arg3 == ~var8 ? var10 + 4096 : 12288 - var12;
                }
                this.field3262 /= 6;
            } else {
                this.field3262 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIZ)V", line = 214)
    private final void method1463(int arg0, int arg1, int arg2, boolean arg3) {
        ++field3261;
        int var5 = arg0 <= 2048 ? (arg1 + 4096) * arg0 >> 12 : arg0 - (arg0 * arg1 >> 12) + arg1;
        if (~var5 < -1) {
            int var6 = arg2 * 6;
            int var7 = -var5 + arg0 + arg0;
            int var8 = (-var7 + var5 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = -(var9 << 12) + var6;
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 + var13;
            int var15 = -var13 + var5;
            if (~var9 != -1) {
                if (var9 != 1) {
                    if (var9 != 2) {
                        if (~var9 != -4) {
                            if (~var9 != -5) {
                                if (var9 == 5) {
                                    this.field3246 = var7;
                                    this.field3265 = var15;
                                    this.field3251 = var5;
                                }
                            } else {
                                this.field3246 = var7;
                                this.field3265 = var5;
                                this.field3251 = var14;
                            }
                        } else {
                            this.field3246 = var15;
                            this.field3265 = var5;
                            this.field3251 = var7;
                        }
                    } else {
                        this.field3246 = var5;
                        this.field3251 = var7;
                        this.field3265 = var14;
                    }
                } else {
                    this.field3251 = var15;
                    this.field3246 = var5;
                    this.field3265 = var7;
                }
            } else {
                this.field3246 = var14;
                this.field3251 = var5;
                this.field3265 = var7;
            }
        } else {
            this.field3251 = this.field3246 = this.field3265 = arg0;
        }
        if (!arg3) {
            method1467(-42);
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IBILii;ILls;II)Lcq;", line = 328)
    public static final class67 method1464(int arg0, byte arg1, int arg2, class405 arg3, int arg4, class296 arg5, int arg6, int arg7) {
        class196.field2620.field4112 = arg6;
        class196.field2620.field4118 = arg2;
        class196.field2620.field4122 = arg4;
        class196.field2620.field4126 = arg7;
        class196.field2620.field4120 = arg5 != null;
        class196.field2620.field4116 = arg0;
        class196.field2620.field4121 = arg3.field6028;
        ++field3259;
        return arg1 >= -40 ? null : (class67) class212.field2835.method1090(class196.field2620, true);
    }

    @OriginalMember(owner = "client!rp", name = "f", descriptor = "(I)V", line = 346)
    public static final void method1465(int arg0) {
        ++field3249;
        if (arg0 > -64) {
            field3263 = 102;
        }
        for (int var1 = 0; ~var1 > ~class315.field4611.length; ++var1) {
            for (int var2 = 0; ~var2 > ~class315.field4611[var1].length; ++var2) {
                class315.field4611[var1][var2] = class382.field5544;
            }
        }
    }

    @OriginalMember(owner = "client!rp", name = "g", descriptor = "(I)V", line = 381)
    public static final void method1466(int arg0) {
        ++field3257;
        if (!class207.field2787) {
            class207.field2787 = true;
            if (arg0 >= -124) {
                field3258 = null;
            }
            if (!class184.field2496) {
                class191.field2559 += (12.0F - class191.field2559) / 2.0F;
            } else {
                class317.field4647 = (float) (-16 & (int) class317.field4647 - -47);
            }
            class172.field2303 = true;
        }
    }

    @OriginalMember(owner = "client!rp", name = "h", descriptor = "(I)V", line = 406)
    public static void method1467(int arg0) {
        field3258 = null;
        if (arg0 == 100) {
            field3248 = null;
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIII)I", line = 417)
    public static final int method1468(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 & 3;
        ++field3254;
        if (var4 == 0) {
            return arg1;
        } else {
            if (arg2 != -655001844) {
                field3263 = 80;
            }
            if (~var4 == -2) {
                return arg0;
            } else {
                return var4 == 2 ? -arg1 + 1023 : -arg0 + 1023;
            }
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lva;)V", line = 450)
    public static final void method1469(class55 arg0) {
        for (int var1 = arg0.field743; var1 <= arg0.field742; ++var1) {
            for (int var2 = arg0.field726; var2 <= arg0.field737; ++var2) {
                class254 var3 = class213.field2852[arg0.field727][var1][var2];
                if (var3 != null) {
                    class328 var4 = var3.field3515;
                    class328 var5 = null;
                    while (var4 != null) {
                        if (var4.field4785 == arg0) {
                            if (var5 != null) {
                                var5.field4783 = var4.field4783;
                            } else {
                                var3.field3515 = var4.field4783;
                            }
                            var4.method2185(1);
                            break;
                        }
                        var5 = var4;
                        var4 = var4.field4783;
                    }
                    var3.field3528 = 0;
                    for (class328 var6 = var3.field3515; var6 != null; var6 = var6.field4783) {
                        var3.field3528 = (byte) (var3.field3528 | var6.field4781);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rp", name = "i", descriptor = "(I)V", line = 506)
    public static final void method1470(int arg0) {
        for (class212 var1 = (class212) class321.field4726.method332(-2130841184); var1 != null; var1 = (class212) class321.field4726.method343((byte) -80)) {
            if (class422.method2696(-52, var1.field2836)) {
                class324.method2174(var1, (byte) 73);
            }
        }
        int var2 = 72 % ((arg0 - -64) / 48);
        ++field3264;
        if (~class212.field2844 != -2) {
            class179.method1094(class99.field1385, class183.field2485, class435.field6395, 0, class390.field5616);
            int var3 = class191.field2562.method2127(255, class435.field6401);
            for (class212 var4 = (class212) class321.field4726.method332(-2130841184); var4 != null; var4 = (class212) class321.field4726.method343((byte) -122)) {
                int var5 = class278.method1919(1, var4);
                if (var3 < var5) {
                    var3 = var5;
                }
            }
            class183.field2485 = (class282.field4109 ? 26 : 22) + class212.field2844 * 16;
            class390.field5616 = var3 + 8;
        } else {
            class2.field26 = false;
            class179.method1094(class99.field1385, class183.field2485, class435.field6395, 0, class390.field5616);
        }
    }
}
