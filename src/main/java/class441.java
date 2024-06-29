import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class441 extends class1 {

    @OriginalMember(owner = "client!pt", name = "g", descriptor = "I")
    private int field6038 = 0;

    @OriginalMember(owner = "client!pt", name = "r", descriptor = "Z")
    public boolean field6049 = false;

    @OriginalMember(owner = "client!pt", name = "o", descriptor = "Lqea;")
    public class337 field6046 = new class337();

    @OriginalMember(owner = "client!pt", name = "w", descriptor = "Lqea;")
    private class337 field6054 = new class337();

    @OriginalMember(owner = "client!pt", name = "z", descriptor = "Z")
    private boolean field6057 = false;

    @OriginalMember(owner = "client!pt", name = "v", descriptor = "Lhr;")
    public class57 field6053;

    @OriginalMember(owner = "client!pt", name = "u", descriptor = "J")
    private long field6052;

    @OriginalMember(owner = "client!pt", name = "k", descriptor = "Lpba;")
    public class198 field6042;

    @OriginalMember(owner = "client!pt", name = "h", descriptor = "Lou;")
    public class160 field6039;

    @OriginalMember(owner = "client!pt", name = "m", descriptor = "Ljia;")
    public class336 field6044;

    @OriginalMember(owner = "client!pt", name = "f", descriptor = "I")
    public static int field6037 = 0;

    @OriginalMember(owner = "client!pt", name = "p", descriptor = "Z")
    public static boolean field6047 = false;

    @OriginalMember(owner = "client!pt", name = "s", descriptor = "[I")
    public static int[] field6050 = new int[8];

    @OriginalMember(owner = "client!pt", name = "i", descriptor = "I")
    public static int field6040;

    @OriginalMember(owner = "client!pt", name = "j", descriptor = "I")
    public static int field6041;

    @OriginalMember(owner = "client!pt", name = "l", descriptor = "I")
    public static int field6043;

    @OriginalMember(owner = "client!pt", name = "n", descriptor = "I")
    public static int field6045;

    @OriginalMember(owner = "client!pt", name = "q", descriptor = "I")
    public static int field6048;

    @OriginalMember(owner = "client!pt", name = "t", descriptor = "I")
    public int field6051;

    @OriginalMember(owner = "client!pt", name = "x", descriptor = "I")
    private int field6055;

    @OriginalMember(owner = "client!pt", name = "y", descriptor = "I")
    private int field6056;

    @OriginalMember(owner = "client!pt", name = "A", descriptor = "I")
    private int field6058;

    @OriginalMember(owner = "client!pt", name = "B", descriptor = "I")
    private int field6059;

    @OriginalMember(owner = "client!pt", name = "C", descriptor = "I")
    private int field6060;

    @OriginalMember(owner = "client!pt", name = "D", descriptor = "I")
    private int field6061;

    @OriginalMember(owner = "client!pt", name = "E", descriptor = "I")
    private int field6062;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(IZIJLha;)V")
    public final void method2635(int arg0, boolean arg1, int arg2, long arg3, class545 arg4) {
        field6041++;
        if (this.field6049) {
            arg1 = false;
        } else if (this.field6039.field2152 > class438.field6018) {
            arg1 = false;
        } else if (class323.field4151 > class604.field8628[class438.field6018]) {
            arg1 = false;
        } else if (this.field6057) {
            arg1 = false;
        } else if (this.field6039.field2210 != -1) {
            int var7 = (int) (arg3 - this.field6052);
            if (this.field6039.field2160 || this.field6039.field2210 >= var7) {
                var7 %= this.field6039.field2210;
            } else {
                arg1 = false;
            }
            if (!this.field6039.field2195 && var7 < this.field6039.field2187) {
                arg1 = false;
            }
            if (this.field6039.field2195 && this.field6039.field2187 <= var7) {
                arg1 = false;
            }
        }
        if (arg1) {
            class599.field8600++;
            int var8 = (this.field6046.field4332 + this.field6046.field4329 + this.field6046.field4330) / 3;
            int var9 = (this.field6046.field4336 + this.field6046.field4331 + this.field6046.field4326) / 3;
            int var10 = (this.field6046.field4333 + this.field6046.field4325 + this.field6046.field4328) / 3;
            if (this.field6046.field4322 != var8 || this.field6046.field4323 != var9 || this.field6046.field4324 != var10) {
                this.field6046.field4323 = var9;
                this.field6046.field4324 = var10;
                this.field6046.field4322 = var8;
                int var11 = this.field6046.field4330 - this.field6046.field4329;
                int var12 = this.field6046.field4336 - this.field6046.field4331;
                int var13 = this.field6046.field4325 - this.field6046.field4333;
                int var14 = this.field6046.field4332 - this.field6046.field4329;
                int var15 = this.field6046.field4326 - this.field6046.field4331;
                int var16 = this.field6046.field4328 - this.field6046.field4333;
                this.field6061 = var11 * var15 - (var12 * var14);
                this.field6060 = var12 * var16 - (var13 * var15);
                this.field6058 = var13 * var14 - (var11 * var16);
                while (true) {
                    if (this.field6060 <= 32767 && this.field6058 <= 32767 && this.field6061 <= 32767 && this.field6060 >= -32767 && this.field6058 >= -32767 && this.field6061 >= -32767) {
                        int var17 = (int) Math.sqrt((double) (this.field6061 * this.field6061 + (this.field6060 * this.field6060 + (this.field6058 * this.field6058))));
                        if (var17 <= 0) {
                            var17 = 1;
                        }
                        this.field6060 = this.field6060 * 32767 / var17;
                        this.field6058 = this.field6058 * 32767 / var17;
                        this.field6061 = this.field6061 * 32767 / var17;
                        if (this.field6039.field2156 > 0 || this.field6039.field2165 > 0) {
                            int var18 = (int) (Math.atan2((double) this.field6061, (double) this.field6060) * 2607.5945876176133D);
                            int var19 = (int) (Math.atan2((double) this.field6058, Math.sqrt((double) (this.field6060 * this.field6060 + (this.field6061 * this.field6061)))) * 2607.5945876176133D);
                            this.field6059 = this.field6039.field2156 - this.field6039.field2172;
                            this.field6056 = this.field6039.field2172 + var18 - (this.field6059 >> 1);
                            this.field6062 = this.field6039.field2165 - this.field6039.field2170;
                            this.field6055 = var19 + this.field6039.field2170 - (this.field6062 >> 1);
                        }
                        break;
                    }
                    this.field6058 >>= 0x1;
                    this.field6060 >>= 0x1;
                    this.field6061 >>= 0x1;
                }
            }
            this.field6038 += (int) ((Math.random() * (double) (this.field6039.field2218 - this.field6039.field2202) + (double) this.field6039.field2202) * (double) arg2);
            if (this.field6038 > 63) {
                int var20 = this.field6038 >> 6;
                this.field6038 &= 0x3F;
                for (int var21 = 0; var21 < var20; var21++) {
                    int var22;
                    int var23;
                    int var24;
                    if (this.field6039.field2156 <= 0 && this.field6039.field2165 <= 0) {
                        var22 = this.field6060;
                        var23 = this.field6058;
                        var24 = this.field6061;
                    } else {
                        int var25 = (int) (Math.random() * (double) this.field6059) + this.field6056;
                        int var26 = var25 & 0x3FFF;
                        int var27 = class231.field3217[var26];
                        int var28 = class231.field3218[var26];
                        int var29 = (int) ((double) this.field6062 * Math.random()) + this.field6055;
                        int var30 = var29 & 0x1FFF;
                        int var31 = class231.field3217[var30];
                        int var32 = class231.field3218[var30];
                        byte var33 = 13;
                        var22 = var28 * var31 >> var33;
                        var23 = (var32 << 1) * -1;
                        var24 = var27 * var31 >> var33;
                    }
                    float var34 = (float) Math.random();
                    float var35 = (float) Math.random();
                    if (var34 + var35 > 1.0F) {
                        var34 = 1.0F - var34;
                        var35 = 1.0F - var35;
                    }
                    float var36 = 1.0F - (var34 + var35);
                    int var37 = (int) ((float) this.field6046.field4332 * var36 + (float) this.field6046.field4330 * var35 + (float) this.field6046.field4329 * var34);
                    int var38 = (int) ((float) this.field6046.field4326 * var36 + (float) this.field6046.field4336 * var35 + (float) this.field6046.field4331 * var34);
                    int var39 = (int) ((float) this.field6046.field4328 * var36 + (float) this.field6046.field4333 * var34 + (float) this.field6046.field4325 * var35);
                    int var40 = (int) ((float) this.field6054.field4332 * var36 + (float) this.field6054.field4330 * var35 + (float) this.field6054.field4329 * var34);
                    int var41 = (int) ((float) this.field6054.field4326 * var36 + (float) this.field6054.field4336 * var35 + (float) this.field6054.field4331 * var34);
                    int var42 = (int) ((float) this.field6054.field4328 * var36 + (float) this.field6054.field4333 * var34 + (float) this.field6054.field4325 * var35);
                    int var43 = var37 - var40;
                    int var44 = var38 - var41;
                    int var45 = var39 - var42;
                    int var46 = (int) ((double) var40 + (double) var43 * Math.random());
                    int var47 = (int) ((double) var44 * Math.random() + (double) var41);
                    int var48 = (int) ((double) var42 + (double) var45 * Math.random());
                    int var49 = (int) ((double) (this.field6039.field2224 - this.field6039.field2203) * Math.random()) + this.field6039.field2203;
                    int var50 = (int) (Math.random() * (double) (this.field6039.field2153 - this.field6039.field2163)) + this.field6039.field2163;
                    int var51 = (int) ((double) (this.field6039.field2208 - this.field6039.field2161) * Math.random()) + this.field6039.field2161;
                    int var52;
                    if (this.field6039.field2190) {
                        double var53 = Math.random();
                        var52 = (int) ((double) this.field6039.field2223 + (double) this.field6039.field2171 * Math.random()) << 24 | (int) ((double) this.field6039.field2221 * var53 + (double) this.field6039.field2157) | (int) ((double) this.field6039.field2215 * var53 + (double) this.field6039.field2196) << 16 | (int) ((double) this.field6039.field2167 * var53 + (double) this.field6039.field2177) << 8;
                    } else {
                        var52 = (int) (Math.random() * (double) this.field6039.field2215 + (double) this.field6039.field2196) << 16 | (int) ((double) this.field6039.field2167 * Math.random() + (double) this.field6039.field2177) << 8 | (int) (Math.random() * (double) this.field6039.field2221 + (double) this.field6039.field2157) | (int) ((double) this.field6039.field2223 + (double) this.field6039.field2171 * Math.random()) << 24;
                    }
                    int var55 = this.field6039.field2188;
                    if (!arg4.method2100() && !this.field6039.field2191) {
                        var55 = -1;
                    }
                    if (class602.field8616 == class350.field4448) {
                        new class427(this, var46, var47, var48, var22, var23, var24, var49, var50, var52, var51, var55, this.field6039.field2192, this.field6039.field2216);
                    } else {
                        class427 var57 = class231.field3213[class350.field4448];
                        class350.field4448 = class350.field4448 + 1 & 0x3FF;
                        var57.method2597(this, var46, var47, var48, var22, var23, var24, var49, var50, var52, var51, var55, this.field6039.field2192, this.field6039.field2216);
                    }
                }
            }
        }
        if (!this.field6046.method1956(this.field6054, -13144)) {
            class337 var58 = this.field6054;
            this.field6054 = this.field6046;
            this.field6046 = var58;
            this.field6046.field4336 = this.field6053.field799;
            this.field6046.field4326 = this.field6053.field797;
            this.field6046.field4331 = this.field6053.field788;
            this.field6046.field4325 = this.field6053.field805;
            this.field6046.field4322 = this.field6054.field4322;
            this.field6046.field4323 = this.field6054.field4323;
            this.field6046.field4329 = this.field6053.field795;
            this.field6046.field4328 = this.field6053.field803;
            this.field6046.field4324 = this.field6054.field4324;
            this.field6046.field4333 = this.field6053.field792;
            this.field6046.field4332 = this.field6053.field794;
            this.field6046.field4330 = this.field6053.field796;
        }
        if (arg0 != -24638) {
            return;
        }
        this.field6051 = 0;
        for (class427 var59 = (class427) this.field6044.method1945(false); var59 != null; var59 = (class427) this.field6044.method1944(9408)) {
            var59.method2599(arg3, arg2);
            this.field6051++;
        }
        class289.field3794 += this.field6051;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(I)V")
    public static void method2636(int arg0) {
        field6050 = null;
        if (arg0 != -1) {
            method2638(null, -121, (byte) 64, null, null, null, 125);
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(JILha;)V")
    public final void method2637(long arg0, int arg1, class545 arg2) {
        for (class427 var5 = (class427) this.field6044.method1945(false); var5 != null; var5 = (class427) this.field6044.method1944(9408)) {
            var5.method2598(arg2, arg0);
        }
        if (arg1 > -125) {
            field6045 = 85;
        }
        field6048++;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(Ljava/lang/String;IBLjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static final void method2638(String arg0, int arg1, byte arg2, String arg3, String arg4, String arg5, int arg6) {
        if (arg2 != 17) {
            field6050 = null;
        }
        class362.method2039(arg1, arg3, -119, arg4, arg0, arg5, -1, null, arg6);
        field6040++;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(B)V")
    public final void method2639(byte arg0) {
        this.field6046.field4325 = this.field6053.field805;
        this.field6046.field4326 = this.field6053.field797;
        if (arg0 != 24) {
            return;
        }
        field6043++;
        this.field6046.field4333 = this.field6053.field792;
        this.field6046.field4332 = this.field6053.field794;
        this.field6046.field4329 = this.field6053.field795;
        this.field6046.field4331 = this.field6053.field788;
        this.field6046.field4336 = this.field6053.field799;
        this.field6046.field4330 = this.field6053.field796;
        this.field6046.field4328 = this.field6053.field803;
        if (this.field6046.field4330 == this.field6046.field4329 && this.field6046.field4332 == this.field6046.field4330 && this.field6046.field4336 == this.field6046.field4331 && this.field6046.field4336 == this.field6046.field4326 && this.field6046.field4333 == this.field6046.field4325 && this.field6046.field4328 == this.field6046.field4325) {
            this.field6057 = true;
        } else if (this.field6057) {
            this.field6054.field4329 = this.field6046.field4329;
            this.field6054.field4333 = this.field6046.field4333;
            this.field6054.field4336 = this.field6046.field4336;
            this.field6054.field4325 = this.field6046.field4325;
            this.field6054.field4330 = this.field6046.field4330;
            this.field6054.field4328 = this.field6046.field4328;
            this.field6057 = false;
            this.field6054.field4331 = this.field6046.field4331;
            this.field6054.field4326 = this.field6046.field4326;
            this.field6054.field4332 = this.field6046.field4332;
        }
    }

    @OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(Lha;Lhr;Lpba;J)V")
    public class441(class545 arg0, class57 arg1, class198 arg2, long arg3) {
        this.field6053 = arg1;
        this.field6052 = arg3;
        this.field6042 = arg2;
        this.field6039 = this.field6053.method385(true);
        if (!arg0.method2100() && this.field6039.field2164 != -1) {
            this.field6039 = class447.method2662(this.field6039.field2164, (byte) -79);
        }
        this.field6044 = new class336();
        this.field6038 = (int) ((double) this.field6038 + Math.random() * 64.0D);
        this.method2639((byte) 24);
        this.field6054.field4331 = this.field6046.field4331;
        this.field6054.field4336 = this.field6046.field4336;
        this.field6054.field4326 = this.field6046.field4326;
        this.field6054.field4333 = this.field6046.field4333;
        this.field6054.field4325 = this.field6046.field4325;
        this.field6054.field4332 = this.field6046.field4332;
        this.field6054.field4328 = this.field6046.field4328;
        this.field6054.field4330 = this.field6046.field4330;
        this.field6054.field4329 = this.field6046.field4329;
    }
}
