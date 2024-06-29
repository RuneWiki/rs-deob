import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class188 extends class29 {

    @OriginalMember(owner = "client!fn", name = "y", descriptor = "Lsf;")
    public class398 field2818 = new class398();

    @OriginalMember(owner = "client!fn", name = "C", descriptor = "Lnj;")
    public class356 field2822 = new class356();

    @OriginalMember(owner = "client!fn", name = "u", descriptor = "Le;")
    private class255 field2814;

    @OriginalMember(owner = "client!fn", name = "v", descriptor = "I")
    public static int field2815 = 0;

    @OriginalMember(owner = "client!fn", name = "r", descriptor = "F")
    public static float field2811 = 1024.0F;

    @OriginalMember(owner = "client!fn", name = "A", descriptor = "I")
    public static int field2820 = 2;

    @OriginalMember(owner = "client!fn", name = "s", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!fn", name = "t", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!fn", name = "w", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!fn", name = "x", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!fn", name = "z", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!fn", name = "B", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "client!fn", name = "D", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!fn", name = "E", descriptor = "I")
    public static int field2824;

    @OriginalMember(owner = "client!fn", name = "F", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!fn", name = "G", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!fn", name = "H", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!fn", name = "I", descriptor = "Lgo;")
    public static class272 field2828;

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "()I")
    public final int method166() {
        field2821++;
        return 0;
    }

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "(I)V")
    public static final void method1140(int arg0) {
        if (arg0 != -5213) {
            field2815 = -40;
        }
        field2812++;
        if (class6.field67 == 5) {
            class6.field67 = 6;
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(II)V")
    public static final void method1141(int arg0, int arg1) {
        field2825++;
        int var2 = -36 % ((arg0 - 1) / 40);
        class450.field6620 = arg1;
        class143.field1913.method1485(-22032);
    }

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "(I)V")
    public final void method168(int arg0) {
        field2819++;
        this.field2822.method168(arg0);
        for (class347 var2 = (class347) this.field2818.method2514((byte) 61); var2 != null; var2 = (class347) this.field2818.method2511(-115)) {
            if (!this.field2814.method1572(true, var2)) {
                int var3 = arg0;
                do {
                    if (var2.field5168 >= var3) {
                        this.method1143((byte) -105, var2, var3);
                        var2.field5168 -= var3;
                        break;
                    }
                    this.method1143((byte) -65, var2, var2.field5168);
                    var3 -= var2.field5168;
                } while (!this.field2814.method1564((int[]) null, var2, true, var3, 0));
            }
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(ID)V")
    public static final void method1142(int arg0, double arg1) {
        field2824++;
        if (arg0 < 112) {
            method1141(71, 94);
        }
        if (class287.field4374 == arg1) {
            return;
        }
        for (int var3 = 0; var3 < 256; var3++) {
            int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
            class221.field3363[var3] = var4 > 255 ? 255 : var4;
        }
        class287.field4374 = arg1;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(BLpo;I)V")
    private final void method1143(byte arg0, class347 arg1, int arg2) {
        if (arg0 > -49) {
            return;
        }
        if ((this.field2814.field3886[arg1.field5184] & 0x4) != 0 && arg1.field5169 < 0) {
            int var4 = this.field2814.field3888[arg1.field5184] / class81.field1082;
            int var5 = (var4 + 1048575 - arg1.field5167) / var4;
            arg1.field5167 = arg2 * var4 + arg1.field5167 & 0xFFFFF;
            if (var5 <= arg2) {
                if (this.field2814.field3913[arg1.field5184] == 0) {
                    arg1.field5174 = class444.method2745(arg1.field5176, arg1.field5174.method2739(), arg1.field5174.method2746(), arg1.field5174.method2713());
                } else {
                    arg1.field5174 = class444.method2745(arg1.field5176, arg1.field5174.method2739(), 0, arg1.field5174.method2713());
                    this.field2814.method1586(32141, arg1, arg1.field5173.field6447[arg1.field5164] < 0);
                }
                if (arg1.field5173.field6447[arg1.field5164] < 0) {
                    arg1.field5174.method2737(-1);
                }
                arg2 = arg1.field5167 / var4;
            }
        }
        field2823++;
        arg1.field5174.method168(arg2);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IB[BI)I")
    public static final int method1144(int arg0, byte arg1, byte[] arg2, int arg3) {
        field2817++;
        int var4 = -1;
        if (arg1 != -115) {
            method1142(46, 0.33801322847292176D);
        }
        for (int var5 = arg0; var5 < arg3; var5++) {
            var4 = var4 >>> 8 ^ class165.field2296[(arg2[var5] ^ var4) & 0xFF];
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IILpo;[IIZ)V")
    private final void method1145(int arg0, int arg1, class347 arg2, int[] arg3, int arg4, boolean arg5) {
        if ((this.field2814.field3886[arg2.field5184] & 0x4) != 0 && arg2.field5169 < 0) {
            int var7 = this.field2814.field3888[arg2.field5184] / class81.field1082;
            while (true) {
                int var8 = (var7 + 1048575 - arg2.field5167) / var7;
                if (arg4 < var8) {
                    arg2.field5167 += arg4 * var7;
                    break;
                }
                arg2.field5174.method167(arg3, arg1, var8);
                arg2.field5167 += var7 * var8 - 1048576;
                arg4 -= var8;
                arg1 += var8;
                int var9 = class81.field1082 / 100;
                int var10 = 262144 / var7;
                if (var9 > var10) {
                    var9 = var10;
                }
                class444 var11 = arg2.field5174;
                if (this.field2814.field3913[arg2.field5184] == 0) {
                    arg2.field5174 = class444.method2745(arg2.field5176, var11.method2739(), var11.method2746(), var11.method2713());
                } else {
                    arg2.field5174 = class444.method2745(arg2.field5176, var11.method2739(), 0, var11.method2713());
                    this.field2814.method1586(32141, arg2, arg2.field5173.field6447[arg2.field5164] < 0);
                    arg2.field5174.method2733(var9, var11.method2746());
                }
                if (arg2.field5173.field6447[arg2.field5164] < 0) {
                    arg2.field5174.method2737(-1);
                }
                var11.method2722(var9);
                var11.method167(arg3, arg1, arg0 - arg1);
                if (var11.method2748()) {
                    this.field2822.method2133(var11);
                }
            }
        }
        field2816++;
        arg2.field5174.method167(arg3, arg1, arg4);
        if (!arg5) {
            this.field2822 = null;
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Z)V")
    public static void method1146(boolean arg0) {
        if (arg0) {
            field2811 = 0.6960755F;
        }
        field2828 = null;
    }

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "()Lwf;")
    public final class29 method169() {
        field2813++;
        class347 var1;
        do {
            var1 = (class347) this.field2818.method2511(-108);
            if (var1 == null) {
                return null;
            }
        } while (var1.field5174 == null);
        return var1.field5174;
    }

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Le;)V")
    public class188(class255 arg0) {
        this.field2814 = arg0;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "([III)V")
    public final void method167(int[] arg0, int arg1, int arg2) {
        field2826++;
        this.field2822.method167(arg0, arg1, arg2);
        for (class347 var4 = (class347) this.field2818.method2514((byte) 61); var4 != null; var4 = (class347) this.field2818.method2511(-107)) {
            if (!this.field2814.method1572(true, var4)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var4.field5168 >= var5) {
                        this.method1145(var5 + var6, var6, var4, arg0, var5, true);
                        var4.field5168 -= var5;
                        break;
                    }
                    this.method1145(var5 + var6, var6, var4, arg0, var4.field5168, true);
                    var5 -= var4.field5168;
                    var6 += var4.field5168;
                } while (!this.field2814.method1564(arg0, var4, true, var5, var6));
            }
        }
    }

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "()Lwf;")
    public final class29 method170() {
        field2827++;
        class347 var1 = (class347) this.field2818.method2514((byte) 61);
        if (var1 == null) {
            return null;
        } else if (var1.field5174 == null) {
            return this.method169();
        } else {
            return var1.field5174;
        }
    }
}
