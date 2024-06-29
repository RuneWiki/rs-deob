import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class171 extends class88 {

    @OriginalMember(owner = "client!ph", name = "u", descriptor = "I")
    private int field3250 = 0;

    @OriginalMember(owner = "client!ph", name = "A", descriptor = "I")
    private int field3256 = 0;

    @OriginalMember(owner = "client!ph", name = "Y", descriptor = "I")
    private int field3280 = -32768;

    @OriginalMember(owner = "client!ph", name = "V", descriptor = "Z")
    private boolean field3277 = false;

    @OriginalMember(owner = "client!ph", name = "w", descriptor = "I")
    private int field3252;

    @OriginalMember(owner = "client!ph", name = "W", descriptor = "I")
    private int field3278;

    @OriginalMember(owner = "client!ph", name = "U", descriptor = "I")
    private int field3276;

    @OriginalMember(owner = "client!ph", name = "bb", descriptor = "I")
    public int field3283;

    @OriginalMember(owner = "client!ph", name = "D", descriptor = "I")
    private int field3259;

    @OriginalMember(owner = "client!ph", name = "E", descriptor = "I")
    public int field3260;

    @OriginalMember(owner = "client!ph", name = "C", descriptor = "I")
    public int field3258;

    @OriginalMember(owner = "client!ph", name = "r", descriptor = "I")
    private int field3247;

    @OriginalMember(owner = "client!ph", name = "F", descriptor = "I")
    private int field3261;

    @OriginalMember(owner = "client!ph", name = "I", descriptor = "I")
    public int field3264;

    @OriginalMember(owner = "client!ph", name = "P", descriptor = "I")
    public int field3271;

    @OriginalMember(owner = "client!ph", name = "Q", descriptor = "Lta;")
    private class208 field3272;

    @OriginalMember(owner = "client!ph", name = "T", descriptor = "[I")
    public static int[] field3275 = new int[5];

    @OriginalMember(owner = "client!ph", name = "Z", descriptor = "[S")
    public static short[] field3281 = new short[500];

    @OriginalMember(owner = "client!ph", name = "t", descriptor = "Ldc;")
    private static class37 field3249 = class185.method1233((byte) 86, "Please contact customer support)3");

    @OriginalMember(owner = "client!ph", name = "L", descriptor = "Ldc;")
    public static class37 field3267 = class185.method1233((byte) 86, "rot:");

    @OriginalMember(owner = "client!ph", name = "G", descriptor = "Ldc;")
    public static class37 field3262 = field3249;

    @OriginalMember(owner = "client!ph", name = "q", descriptor = "D")
    private double field3246;

    @OriginalMember(owner = "client!ph", name = "s", descriptor = "D")
    public double field3248;

    @OriginalMember(owner = "client!ph", name = "v", descriptor = "D")
    public double field3251;

    @OriginalMember(owner = "client!ph", name = "x", descriptor = "D")
    public double field3253;

    @OriginalMember(owner = "client!ph", name = "z", descriptor = "D")
    private double field3255;

    @OriginalMember(owner = "client!ph", name = "M", descriptor = "D")
    private double field3268;

    @OriginalMember(owner = "client!ph", name = "O", descriptor = "D")
    private double field3270;

    @OriginalMember(owner = "client!ph", name = "R", descriptor = "D")
    private double field3273;

    @OriginalMember(owner = "client!ph", name = "y", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!ph", name = "B", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!ph", name = "H", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!ph", name = "J", descriptor = "I")
    public int field3265;

    @OriginalMember(owner = "client!ph", name = "K", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!ph", name = "N", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!ph", name = "S", descriptor = "I")
    private int field3274;

    @OriginalMember(owner = "client!ph", name = "X", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!ph", name = "ab", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "client!ph", name = "cb", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BLdc;)V")
    public static final void method1156(byte arg0, class37 arg1) {
        class141 var2 = class24.method169(arg1, (byte) 79);
        field3266++;
        if (var2 == null) {
            return;
        }
        class168.field3206 = class68.field1224 + class190.field3528 - var2.field2731;
        class147.field2811 = var2.field2728 - class235.field4272;
        int var3 = -111 % ((arg0 + 20) / 54);
        int var4 = class147.field2811 - (int) ((double) class139.field2694.field2638 / class244.field4471);
        int var5 = (int) ((double) class139.field2694.field2638 / class244.field4471) + class147.field2811;
        if (var4 < 0) {
            class147.field2811 = (int) ((double) class139.field2694.field2638 / class244.field4471);
        }
        if (var5 > class150.field2848) {
            class147.field2811 = class150.field2848 - (int) ((double) class139.field2694.field2638 / class244.field4471);
        }
        int var6 = class168.field3206 - (int) ((double) class139.field2694.field2509 / class244.field4471);
        int var7 = class168.field3206 + (int) ((double) class139.field2694.field2509 / class244.field4471);
        if (var6 < 0) {
            class168.field3206 = (int) ((double) class139.field2694.field2509 / class244.field4471);
        }
        if (class190.field3528 < var7) {
            class168.field3206 = class190.field3528 - (int) ((double) class139.field2694.field2509 / class244.field4471);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIII)V")
    public final void method1157(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field3277) {
            double var6 = (double) (arg1 - this.field3278);
            double var8 = (double) (arg2 - this.field3247);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field3251 = this.field3259;
            this.field3248 = (double) this.field3261 * var8 / var10 + (double) this.field3247;
            this.field3253 = (double) this.field3261 * var6 / var10 + (double) this.field3278;
        }
        field3263++;
        double var12 = (double) (this.field3264 + 1 - arg0);
        this.field3255 = ((double) arg2 - this.field3248) / var12;
        this.field3268 = ((double) arg1 - this.field3253) / var12;
        if (arg4 != -18499) {
            method1162(-50, false);
        }
        this.field3273 = Math.sqrt(this.field3268 * this.field3268 + this.field3255 * this.field3255);
        if (!this.field3277) {
            this.field3270 = -this.field3273 * Math.tan((double) this.field3252 * 0.02454369D);
        }
        this.field3246 = ((double) arg3 - this.field3251 - this.field3270 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method19(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        class1 var11 = this.method1158(36);
        field3284++;
        if (var11 != null) {
            var11.method19(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field3280 = var11.method5();
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "()I")
    public final int method5() {
        field3279++;
        return this.field3280;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)La;")
    private final class1 method1158(int arg0) {
        class191 var2 = class207.method1370(this.field3276, (byte) -118);
        field3269++;
        class1 var3 = var2.method1271(this.field3256, (byte) 95);
        if (var3 == null) {
            return null;
        } else {
            int var4 = -9 % ((arg0 + 11) / 38);
            var3.method21(this.field3274);
            return var3;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)I")
    public static final int method1159(int arg0, int arg1) {
        if (arg0 >= -90) {
            field3249 = null;
        }
        field3254++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(II)V")
    public final void method1160(int arg0, int arg1) {
        this.field3253 += (double) arg0 * this.field3268;
        this.field3251 += this.field3246 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field3270;
        this.field3277 = true;
        this.field3270 += (double) arg0 * this.field3246;
        this.field3248 += (double) arg0 * this.field3255;
        this.field3265 = (int) (Math.atan2(this.field3255, this.field3268) * 325.949D) + 1024 & 0x7FF;
        this.field3274 = (int) (Math.atan2(this.field3270, this.field3273) * 325.949D) & 0x7FF;
        if (arg1 != 12891) {
            return;
        }
        if (this.field3272 != null) {
            this.field3250 += arg0;
            label29: while (true) {
                do {
                    do {
                        if (this.field3250 <= this.field3272.field3882[this.field3256]) {
                            break label29;
                        }
                        this.field3250 -= this.field3272.field3882[this.field3256];
                        this.field3256++;
                    } while (this.field3272.field3881.length > this.field3256);
                    this.field3256 -= this.field3272.field3901;
                } while (this.field3256 >= 0 && this.field3272.field3881.length > this.field3256);
                this.field3256 = 0;
            }
        }
        field3282++;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(B)V")
    public static void method1161(byte arg0) {
        field3249 = null;
        if (arg0 != -113) {
            method1161((byte) -112);
        }
        field3281 = null;
        field3275 = null;
        field3262 = null;
        field3267 = null;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IZ)V")
    public static final void method1162(int arg0, boolean arg1) {
        field3257++;
        byte[][] var2 = class50.field1003;
        int var3 = class118.field2117.length;
        if (arg0 != 21601) {
            method1156((byte) 59, null);
        }
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class142.field2745[var4] & 0xFF) * 64 - class124.field2212;
                int var7 = (class142.field2745[var4] >> 8) * 64 - class99.field1735;
                class108.method707((byte) -107);
                class139.method970(var6, class11.field143, var7, (byte) -103, arg1, var5);
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class171(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field3277 = false;
        this.field3252 = arg7;
        this.field3278 = arg3;
        this.field3276 = arg0;
        this.field3283 = arg1;
        this.field3259 = arg4;
        this.field3260 = arg9;
        this.field3258 = arg5;
        this.field3247 = arg2;
        this.field3261 = arg8;
        this.field3264 = arg6;
        this.field3271 = arg10;
        int var12 = class207.method1370(this.field3276, (byte) -114).field3559;
        if (var12 == -1) {
            this.field3272 = null;
        } else {
            this.field3272 = class16.method113(var12, (byte) 70);
        }
    }
}
