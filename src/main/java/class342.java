import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class342 extends class349 {

    @OriginalMember(owner = "client!ah", name = "A", descriptor = "I")
    private int field5108 = 0;

    @OriginalMember(owner = "client!ah", name = "r", descriptor = "Z")
    public boolean field5099 = false;

    @OriginalMember(owner = "client!ah", name = "E", descriptor = "Z")
    private boolean field5112 = false;

    @OriginalMember(owner = "client!ah", name = "G", descriptor = "J")
    private long field5114;

    @OriginalMember(owner = "client!ah", name = "s", descriptor = "Ljq;")
    public class230 field5100;

    @OriginalMember(owner = "client!ah", name = "L", descriptor = "Lnd;")
    public class411 field5119;

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "Lno;")
    public class416 field5089;

    @OriginalMember(owner = "client!ah", name = "D", descriptor = "Lfi;")
    public class8 field5111;

    @OriginalMember(owner = "client!ah", name = "x", descriptor = "Z")
    public static boolean field5105 = false;

    @OriginalMember(owner = "client!ah", name = "K", descriptor = "I")
    public static int field5118 = 0;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
    private int field5088;

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "I")
    private int field5090;

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "I")
    private int field5091;

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "I")
    public int field5092;

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "I")
    public static int field5093;

    @OriginalMember(owner = "client!ah", name = "m", descriptor = "I")
    private int field5094;

    @OriginalMember(owner = "client!ah", name = "n", descriptor = "I")
    private int field5095;

    @OriginalMember(owner = "client!ah", name = "o", descriptor = "I")
    private int field5096;

    @OriginalMember(owner = "client!ah", name = "p", descriptor = "I")
    private int field5097;

    @OriginalMember(owner = "client!ah", name = "q", descriptor = "I")
    public static int field5098;

    @OriginalMember(owner = "client!ah", name = "t", descriptor = "I")
    public static int field5101;

    @OriginalMember(owner = "client!ah", name = "u", descriptor = "I")
    public int field5102;

    @OriginalMember(owner = "client!ah", name = "v", descriptor = "I")
    private int field5103;

    @OriginalMember(owner = "client!ah", name = "w", descriptor = "I")
    public static int field5104;

    @OriginalMember(owner = "client!ah", name = "y", descriptor = "I")
    private int field5106;

    @OriginalMember(owner = "client!ah", name = "z", descriptor = "I")
    public int field5107;

    @OriginalMember(owner = "client!ah", name = "B", descriptor = "I")
    private int field5109;

    @OriginalMember(owner = "client!ah", name = "C", descriptor = "I")
    private int field5110;

    @OriginalMember(owner = "client!ah", name = "F", descriptor = "I")
    private int field5113;

    @OriginalMember(owner = "client!ah", name = "H", descriptor = "I")
    private int field5115;

    @OriginalMember(owner = "client!ah", name = "J", descriptor = "I")
    private int field5117;

    @OriginalMember(owner = "client!ah", name = "M", descriptor = "I")
    public static int field5120;

    @OriginalMember(owner = "client!ah", name = "O", descriptor = "I")
    private int field5122;

    @OriginalMember(owner = "client!ah", name = "P", descriptor = "I")
    private int field5123;

    @OriginalMember(owner = "client!ah", name = "Q", descriptor = "I")
    public int field5124;

    @OriginalMember(owner = "client!ah", name = "I", descriptor = "Lvc;")
    public static class225 field5116;

    @OriginalMember(owner = "client!ah", name = "N", descriptor = "[I")
    public static int[] field5121;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(JI)V")
    public final void method2266(long arg0, int arg1) {
        field5120++;
        class196 var4 = (class196) this.field5111.method54((byte) 18);
        if (arg1 <= -78) {
            while (var4 != null) {
                var4.method1298(arg0);
                var4 = (class196) this.field5111.method53((byte) 123);
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)V")
    public static void method2267(byte arg0) {
        field5116 = null;
        if (arg0 != 22) {
            field5118 = -121;
        }
        field5121 = null;
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(I)V")
    public final void method2268(int arg0) {
        field5101++;
        this.field5123 = this.field5100.field3163;
        this.field5091 = this.field5100.field3169;
        this.field5113 = this.field5100.field3161;
        this.field5117 = this.field5100.field3157;
        if (arg0 != 0) {
            this.field5099 = false;
        }
        this.field5095 = this.field5100.field3171;
        this.field5094 = this.field5100.field3158;
        this.field5090 = this.field5100.field3167;
        this.field5103 = this.field5100.field3168;
        this.field5115 = this.field5100.field3160;
        if (this.field5113 == this.field5090 && this.field5117 == this.field5113 && this.field5123 == this.field5115 && this.field5123 == this.field5103 && this.field5095 == this.field5094 && this.field5094 == this.field5091) {
            this.field5112 = true;
            return;
        }
        this.field5112 = false;
        int var2 = (this.field5113 + this.field5117 + this.field5090) / 3;
        int var3 = (this.field5115 + this.field5123 + this.field5103) / 3;
        int var4 = (this.field5095 + this.field5094 + this.field5091) / 3;
        if (this.field5107 == var2 && this.field5124 == var3 && this.field5092 == var4) {
            return;
        }
        this.field5092 = var4;
        this.field5124 = var3;
        this.field5107 = var2;
        int var5 = this.field5113 - this.field5090;
        int var6 = this.field5123 - this.field5115;
        int var7 = this.field5094 - this.field5095;
        int var8 = this.field5117 - this.field5090;
        int var9 = this.field5103 - this.field5115;
        int var10 = this.field5091 - this.field5095;
        this.field5097 = var5 * var9 - var6 * var8;
        this.field5122 = var6 * var10 - var7 * var9;
        for (this.field5110 = var7 * var8 - (var5 * var10); this.field5122 > 32767 || this.field5110 > 32767 || this.field5097 > 32767 || this.field5122 < -32767 || this.field5110 < -32767 || this.field5097 < -32767; this.field5110 >>= 0x1) {
            this.field5097 >>= 0x1;
            this.field5122 >>= 0x1;
        }
        int var11 = (int) Math.sqrt((double) (this.field5097 * this.field5097 + this.field5122 * this.field5122 + this.field5110 * this.field5110));
        if (var11 <= 0) {
            var11 = 1;
        }
        this.field5110 = this.field5110 * 32767 / var11;
        this.field5097 = this.field5097 * 32767 / var11;
        this.field5122 = this.field5122 * 32767 / var11;
        if (this.field5089.field6068 <= 0 && this.field5089.field6045 <= 0) {
            return;
        }
        int var12 = (int) (Math.atan2((double) this.field5097, (double) this.field5122) * 2607.5945876176133D);
        int var13 = (int) (Math.atan2((double) this.field5110, Math.sqrt((double) (this.field5122 * this.field5122 + this.field5097 * this.field5097))) * 2607.5945876176133D);
        this.field5109 = this.field5089.field6068 - this.field5089.field6063;
        this.field5096 = this.field5089.field6045 - this.field5089.field6046;
        this.field5106 = var12 + this.field5089.field6063 - (this.field5109 >> 1);
        this.field5088 = this.field5089.field6046 + var13 - (this.field5096 >> 1);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZJILtj;I)V")
    public final void method2269(boolean arg0, long arg1, int arg2, class298 arg3, int arg4) {
        if (this.field5099) {
            arg0 = false;
        } else if (this.field5089.field6079 > class162.field2150) {
            arg0 = false;
        } else if (class279.field4098[class162.field2150] < class447.field6429) {
            arg0 = false;
        } else if (this.field5112) {
            arg0 = false;
        } else if (this.field5089.field6049 != -1) {
            int var7 = (int) (arg1 - this.field5114);
            if (this.field5089.field6080 || this.field5089.field6049 >= var7) {
                var7 %= this.field5089.field6049;
            } else {
                arg0 = false;
            }
            if (!this.field5089.field6017 && this.field5089.field6033 > var7) {
                arg0 = false;
            }
            if (this.field5089.field6017 && var7 >= this.field5089.field6033) {
                arg0 = false;
            }
        }
        field5098++;
        if (arg0) {
            this.field5108 += (int) ((Math.random() * (double) (this.field5089.field6056 - this.field5089.field6032) + (double) this.field5089.field6032) * (double) arg2);
            if (this.field5108 > 63) {
                int var8 = this.field5108 >> 6;
                this.field5108 &= 0x3F;
                for (int var9 = 0; var9 < var8; var9++) {
                    int var10;
                    int var11;
                    int var12;
                    if (this.field5089.field6068 <= 0 && this.field5089.field6045 <= 0) {
                        var10 = this.field5110;
                        var11 = this.field5122;
                        var12 = this.field5097;
                    } else {
                        int var13 = (int) (Math.random() * (double) this.field5109) + this.field5106;
                        int var14 = var13 & 0x3FFF;
                        int var15 = class240.field3364[var14];
                        int var16 = class240.field3365[var14];
                        int var17 = this.field5088 + ((int) (Math.random() * (double) this.field5096));
                        int var18 = var17 & 0x1FFF;
                        int var19 = class240.field3364[var18];
                        var11 = var16 * var19 >> 15;
                        int var20 = class240.field3365[var18];
                        var12 = var15 * var19 >> 15;
                        var10 = var20 * -1;
                    }
                    int var21 = (int) (Math.random() * 65535.0D);
                    int var22 = (int) (Math.random() * 65535.0D);
                    if ((var21 + var22) > 65535) {
                        var22 = 65535 - var22;
                        var21 = 65535 - var21;
                    }
                    int var23 = 65535 - var22 - var21;
                    int var24 = this.field5090 * var21 - (-(this.field5113 * var22) - this.field5117 * var23) >> 16;
                    int var25 = this.field5115 * var21 + this.field5123 * var22 + this.field5103 * var23 >> 16;
                    int var26 = this.field5095 * var21 - (-(this.field5094 * var22) - (this.field5091 * var23)) >> 16;
                    int var27 = this.field5089.field6062 + ((int) (Math.random() * (double) (this.field5089.field6026 - this.field5089.field6062)));
                    int var28 = this.field5089.field6041 + (int) ((double) (this.field5089.field6078 - this.field5089.field6041) * Math.random());
                    int var29 = this.field5089.field6029 + ((int) (Math.random() * (double) (this.field5089.field6031 - this.field5089.field6029)));
                    int var30;
                    if (this.field5089.field6055) {
                        double var31 = Math.random();
                        var30 = (int) ((double) this.field5089.field6025 * var31 + (double) this.field5089.field6040) << 24 | (int) ((double) this.field5089.field6021 * var31 + (double) this.field5089.field6050) | (int) ((double) this.field5089.field6028 * var31 + (double) this.field5089.field6061) << 8 | (int) ((double) this.field5089.field6023 * var31 + (double) this.field5089.field6019) << 16;
                    } else {
                        var30 = (int) ((double) this.field5089.field6050 + Math.random() * (double) this.field5089.field6021) | (int) ((double) this.field5089.field6019 + (double) this.field5089.field6023 * Math.random()) << 16 | (int) ((double) this.field5089.field6061 + Math.random() * (double) this.field5089.field6028) << 8 | (int) ((double) this.field5089.field6040 + (double) this.field5089.field6025 * Math.random()) << 24;
                    }
                    int var33 = this.field5089.field6027;
                    if (!arg3.method501() && !this.field5089.field6082) {
                        var33 = -1;
                    }
                    if (class430.field6249 == class325.field4816) {
                        new class196(this, var24, var25, var26, var11, var10, var12, var27, var28, var30, var29, var33, this.field5089.field6018);
                    } else {
                        class196 var34 = class452.field6563[class430.field6249];
                        class430.field6249 = class430.field6249 + 1 & 0x3FF;
                        var34.method1300(this, var24, var25, var26, var11, var10, var12, var27, var28, var30, var29, var33, this.field5089.field6018);
                    }
                }
            }
        }
        this.field5102 = 0;
        for (class196 var36 = (class196) this.field5111.method54((byte) 18); var36 != null; var36 = (class196) this.field5111.method53((byte) 121)) {
            var36.method1297(arg1, arg2);
            this.field5102++;
        }
        if (arg4 != 64) {
            this.method2268(-89);
        }
        class113.field1469 += this.field5102;
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(B)V")
    public static final void method2270(byte arg0) {
        field5093++;
        if (class17.field280 == -1 || class112.field1441 == -1) {
            return;
        }
        int var1 = ((class57.field860 - class418.field6095) * class377.field5523 >> 16) + class418.field6095;
        class377.field5523 += var1;
        if (class377.field5523 >= 65535) {
            class377.field5523 = 65535;
            if (class321.field4786) {
                class176.field2385 = false;
            } else {
                class176.field2385 = true;
            }
            class321.field4786 = true;
        } else {
            class321.field4786 = false;
            class176.field2385 = false;
        }
        float var2 = (float) class377.field5523 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class438.field6360 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class166.field2248[class17.field280][var4][var5] * 3;
            int var22 = class166.field2248[class17.field280][var4 + 1][var5] * 3;
            int var23 = (class166.field2248[class17.field280][var4 + 2][var5] + class166.field2248[class17.field280][var4 + 2][var5] - class166.field2248[class17.field280][var4 + 3][var5]) * 3;
            int var24 = class166.field2248[class17.field280][var4][var5];
            int var25 = var22 - var21;
            int var26 = var21 - (var22 * 2 - var23);
            int var27 = class166.field2248[class17.field280][var4 + 2][var5] + var22 - var24 - var23;
            var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
        }
        class279.field4099 = (int) var3[2] - class90.field1223 * 128;
        class289.field4331 = (int) var3[1] * -1;
        class326.field4829 = (int) var3[0] - (class236.field3292 * 128);
        float[] var6 = new float[3];
        int var7 = class136.field1770 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class166.field2248[class112.field1441][var7][var8] * 3;
            int var15 = class166.field2248[class112.field1441][var7 + 1][var8] * 3;
            int var16 = (class166.field2248[class112.field1441][var7 + 2][var8] - (class166.field2248[class112.field1441][var7 + 3][var8] - class166.field2248[class112.field1441][var7 + 2][var8])) * 3;
            int var17 = class166.field2248[class112.field1441][var7][var8];
            int var18 = var15 - var14;
            int var19 = var14 + var16 - (var15 * 2);
            int var20 = class166.field2248[class112.field1441][var7 + 2][var8] + var15 - var16 - var17;
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
        }
        if (arg0 != -46) {
            method2267((byte) 92);
        }
        float var9 = var6[0] - var3[0];
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class47.field716 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 0x3FFF;
        class7.field88 = (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        class271.field3998 = ((class166.field2248[class17.field280][var4 + 2][3] - class166.field2248[class17.field280][var4][3]) * class377.field5523 >> 16) + class166.field2248[class17.field280][var4][3];
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Ltj;Ljq;Lnd;J)V")
    public class342(class298 arg0, class230 arg1, class411 arg2, long arg3) {
        this.field5114 = arg3;
        this.field5100 = arg1;
        this.field5119 = arg2;
        this.field5089 = class318.method2085(this.field5100.field3172, 0);
        if (!arg0.method501() && this.field5089.field6053 != -1) {
            this.field5089 = class318.method2085(this.field5089.field6053, 0);
        }
        this.field5111 = new class8();
        this.field5108 = (int) ((double) this.field5108 + Math.random() * 64.0D);
        this.method2268(0);
    }
}
