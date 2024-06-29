import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class215 extends class121 {

    @OriginalMember(owner = "client!nn", name = "E", descriptor = "I")
    private int field3168 = 0;

    @OriginalMember(owner = "client!nn", name = "s", descriptor = "Z")
    private boolean field3156 = false;

    @OriginalMember(owner = "client!nn", name = "O", descriptor = "Z")
    public boolean field3178 = false;

    @OriginalMember(owner = "client!nn", name = "P", descriptor = "Lqv;")
    public class96 field3179;

    @OriginalMember(owner = "client!nn", name = "D", descriptor = "Lmm;")
    public class26 field3167;

    @OriginalMember(owner = "client!nn", name = "t", descriptor = "J")
    private long field3157;

    @OriginalMember(owner = "client!nn", name = "m", descriptor = "Lcr;")
    public class446 field3150;

    @OriginalMember(owner = "client!nn", name = "q", descriptor = "Lgu;")
    public class126 field3154;

    @OriginalMember(owner = "client!nn", name = "n", descriptor = "I")
    public static int field3151 = -1;

    @OriginalMember(owner = "client!nn", name = "C", descriptor = "[C")
    public static char[] field3166 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!nn", name = "v", descriptor = "Lnj;")
    public static class487 field3159 = new class487("flash1:", "blinken1:", "clignotant1:", "flash1:");

    @OriginalMember(owner = "client!nn", name = "Q", descriptor = "[I")
    public static int[] field3180 = new int[2048];

    @OriginalMember(owner = "client!nn", name = "h", descriptor = "I")
    private int field3145;

    @OriginalMember(owner = "client!nn", name = "i", descriptor = "I")
    public int field3146;

    @OriginalMember(owner = "client!nn", name = "j", descriptor = "I")
    private int field3147;

    @OriginalMember(owner = "client!nn", name = "k", descriptor = "I")
    private int field3148;

    @OriginalMember(owner = "client!nn", name = "l", descriptor = "I")
    private int field3149;

    @OriginalMember(owner = "client!nn", name = "o", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!nn", name = "p", descriptor = "I")
    public int field3153;

    @OriginalMember(owner = "client!nn", name = "r", descriptor = "I")
    private int field3155;

    @OriginalMember(owner = "client!nn", name = "u", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!nn", name = "w", descriptor = "I")
    private int field3160;

    @OriginalMember(owner = "client!nn", name = "x", descriptor = "I")
    private int field3161;

    @OriginalMember(owner = "client!nn", name = "y", descriptor = "I")
    private int field3162;

    @OriginalMember(owner = "client!nn", name = "z", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!nn", name = "A", descriptor = "I")
    private int field3164;

    @OriginalMember(owner = "client!nn", name = "B", descriptor = "I")
    private int field3165;

    @OriginalMember(owner = "client!nn", name = "F", descriptor = "I")
    private int field3169;

    @OriginalMember(owner = "client!nn", name = "G", descriptor = "I")
    private int field3170;

    @OriginalMember(owner = "client!nn", name = "H", descriptor = "I")
    private int field3171;

    @OriginalMember(owner = "client!nn", name = "I", descriptor = "I")
    private int field3172;

    @OriginalMember(owner = "client!nn", name = "J", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!nn", name = "K", descriptor = "I")
    private int field3174;

    @OriginalMember(owner = "client!nn", name = "L", descriptor = "I")
    public int field3175;

    @OriginalMember(owner = "client!nn", name = "M", descriptor = "I")
    public int field3176;

    @OriginalMember(owner = "client!nn", name = "N", descriptor = "I")
    private int field3177;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(BIJLqa;Z)V")
    public final void method1387(byte arg0, int arg1, long arg2, class167 arg3, boolean arg4) {
        if (this.field3178) {
            arg4 = false;
        } else if (this.field3150.field6506 > class588.field8730) {
            arg4 = false;
        } else if (class73.field849[class588.field8730] < class518.field7709) {
            arg4 = false;
        } else if (this.field3156) {
            arg4 = false;
        } else if (this.field3150.field6544 != -1) {
            int var7 = (int) (arg2 - this.field3157);
            if (this.field3150.field6564 || var7 <= this.field3150.field6544) {
                var7 %= this.field3150.field6544;
            } else {
                arg4 = false;
            }
            if (!this.field3150.field6528 && var7 < this.field3150.field6526) {
                arg4 = false;
            }
            if (this.field3150.field6528 && var7 >= this.field3150.field6526) {
                arg4 = false;
            }
        }
        field3158++;
        if (arg4) {
            this.field3168 += (int) (((double) (this.field3150.field6561 - this.field3150.field6546) * Math.random() + (double) this.field3150.field6546) * (double) arg1);
            if (this.field3168 > 63) {
                int var8 = this.field3168 >> 6;
                this.field3168 &= 0x3F;
                for (int var9 = 0; var9 < var8; var9++) {
                    int var10;
                    int var11;
                    int var12;
                    if (this.field3150.field6538 <= 0 && this.field3150.field6558 <= 0) {
                        var10 = this.field3161;
                        var11 = this.field3165;
                        var12 = this.field3174;
                    } else {
                        int var13 = (int) ((double) this.field3149 * Math.random()) + this.field3169;
                        int var14 = var13 & 0x3FFF;
                        int var15 = class14.field129[var14];
                        int var16 = class14.field130[var14];
                        int var17 = this.field3171 + ((int) (Math.random() * (double) this.field3172));
                        int var18 = var17 & 0x1FFF;
                        int var19 = class14.field129[var18];
                        int var20 = class14.field130[var18];
                        byte var21 = 15;
                        var10 = var16 * var19 >> var21;
                        var11 = (var20 << 0) * -1;
                        var12 = var15 * var19 >> var21;
                    }
                    int var22 = (int) (Math.random() * 65535.0D);
                    int var23 = (int) (Math.random() * 65535.0D);
                    if ((var22 + var23) > 65535) {
                        var23 = 65535 - var23;
                        var22 = 65535 - var22;
                    }
                    int var24 = 65535 - var22 - var23;
                    int var25 = (int) ((long) this.field3164 * (long) var24 + (long) this.field3177 * (long) var22 + (long) this.field3160 * (long) var23 >> 16);
                    int var26 = (int) ((long) this.field3145 * (long) var24 + (long) this.field3170 * (long) var23 + (long) this.field3147 * (long) var22 >> 16);
                    int var27 = (int) ((long) this.field3155 * (long) var24 + (long) this.field3162 * (long) var23 + (long) this.field3148 * (long) var22 >> 16);
                    int var28 = (int) ((double) (this.field3150.field6557 - this.field3150.field6542) * Math.random()) + this.field3150.field6542;
                    int var29 = (int) ((double) (this.field3150.field6518 - this.field3150.field6563) * Math.random()) + this.field3150.field6563;
                    int var30 = this.field3150.field6496 + (int) (Math.random() * (double) (this.field3150.field6501 - this.field3150.field6496));
                    int var31;
                    if (this.field3150.field6517) {
                        double var32 = Math.random();
                        var31 = (int) ((double) this.field3150.field6552 * var32 + (double) this.field3150.field6515) << 16 | (int) ((double) this.field3150.field6537 * var32 + (double) this.field3150.field6534) << 8 | (int) ((double) this.field3150.field6565 * var32 + (double) this.field3150.field6545) | (int) ((double) this.field3150.field6540 * Math.random() + (double) this.field3150.field6535) << 24;
                    } else {
                        var31 = (int) ((double) this.field3150.field6515 + (double) this.field3150.field6552 * Math.random()) << 16 | (int) ((double) this.field3150.field6537 * Math.random() + (double) this.field3150.field6534) << 8 | (int) ((double) this.field3150.field6565 * Math.random() + (double) this.field3150.field6545) | (int) (Math.random() * (double) this.field3150.field6540 + (double) this.field3150.field6535) << 24;
                    }
                    int var34 = this.field3150.field6560;
                    if (!arg3.method977() && !this.field3150.field6513) {
                        var34 = -1;
                    }
                    if (class263.field3900 == class147.field1904) {
                        new class389(this, var25, var26, var27, var10, var11, var12, var28, var29, var31, var30, var34, this.field3150.field6497, this.field3150.field6543);
                    } else {
                        class389 var35 = class154.field1977[class147.field1904];
                        class147.field1904 = class147.field1904 + 1 & 0x3FF;
                        var35.method2349(this, var25, var26, var27, var10, var11, var12, var28, var29, var31, var30, var34, this.field3150.field6497, this.field3150.field6543);
                    }
                }
            }
        }
        if (arg0 != -51) {
            field3166 = null;
        }
        this.field3176 = 0;
        for (class389 var37 = (class389) this.field3154.method772(arg0 ^ 0xFFFFFFCD); var37 != null; var37 = (class389) this.field3154.method775(2)) {
            var37.method2348(arg2, arg1);
            this.field3176++;
        }
        class566.field8392 += this.field3176;
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(B)V")
    public final void method1388(byte arg0) {
        this.field3170 = this.field3167.field238;
        field3152++;
        this.field3164 = this.field3167.field242;
        this.field3160 = this.field3167.field250;
        this.field3145 = this.field3167.field239;
        this.field3177 = this.field3167.field243;
        this.field3162 = this.field3167.field237;
        this.field3148 = this.field3167.field247;
        if (arg0 != -96) {
            this.field3174 = -58;
        }
        this.field3155 = this.field3167.field235;
        this.field3147 = this.field3167.field249;
        if (this.field3177 == this.field3160 && this.field3164 == this.field3160 && this.field3170 == this.field3147 && this.field3170 == this.field3145 && this.field3162 == this.field3148 && this.field3162 == this.field3155) {
            this.field3156 = true;
            return;
        }
        this.field3156 = false;
        int var2 = (this.field3164 + this.field3160 + this.field3177) / 3;
        int var3 = (this.field3147 - (-this.field3170 - this.field3145)) / 3;
        int var4 = (this.field3155 + this.field3148 + this.field3162) / 3;
        if (this.field3153 == var2 && this.field3175 == var3 && this.field3146 == var4) {
            return;
        }
        this.field3153 = var2;
        this.field3175 = var3;
        this.field3146 = var4;
        int var5 = this.field3160 - this.field3177;
        int var6 = this.field3170 - this.field3147;
        int var7 = this.field3162 - this.field3148;
        int var8 = this.field3164 - this.field3177;
        int var9 = this.field3145 - this.field3147;
        int var10 = this.field3155 - this.field3148;
        this.field3161 = var6 * var10 - (var7 * var9);
        this.field3174 = var5 * var9 - (var6 * var8);
        this.field3165 = var7 * var8 - (var5 * var10);
        while (this.field3161 > 32767 || this.field3165 > 32767 || this.field3174 > 32767 || this.field3161 < -32767 || this.field3165 < -32767 || this.field3174 < -32767) {
            this.field3174 >>= 0x1;
            this.field3165 >>= 0x1;
            this.field3161 >>= 0x1;
        }
        int var11 = (int) Math.sqrt((double) (this.field3174 * this.field3174 + (this.field3161 * this.field3161 + (this.field3165 * this.field3165))));
        if (var11 <= 0) {
            var11 = 1;
        }
        this.field3174 = this.field3174 * 32767 / var11;
        this.field3161 = this.field3161 * 32767 / var11;
        this.field3165 = this.field3165 * 32767 / var11;
        if (this.field3150.field6538 <= 0 && this.field3150.field6558 <= 0) {
            return;
        }
        int var12 = (int) (Math.atan2((double) this.field3174, (double) this.field3161) * 2607.5945876176133D);
        int var13 = (int) (Math.atan2((double) this.field3165, Math.sqrt((double) (this.field3174 * this.field3174 + this.field3161 * this.field3161))) * 2607.5945876176133D);
        this.field3149 = this.field3150.field6538 - this.field3150.field6536;
        this.field3172 = this.field3150.field6558 - this.field3150.field6539;
        this.field3169 = this.field3150.field6536 + var12 - (this.field3149 >> 1);
        this.field3171 = var13 + this.field3150.field6539 - (this.field3172 >> 1);
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Z)V")
    public static void method1389(boolean arg0) {
        if (arg0) {
            field3180 = null;
        }
        field3180 = null;
        field3159 = null;
        field3166 = null;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lqa;JI)V")
    public final void method1390(class167 arg0, long arg1, int arg2) {
        for (class389 var5 = (class389) this.field3154.method772(0); var5 != null; var5 = (class389) this.field3154.method775(2)) {
            var5.method2352(arg0, arg1);
        }
        field3163++;
        if (arg2 != -32767) {
            this.field3177 = -84;
        }
    }

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(Lqa;Lmm;Lqv;J)V")
    public class215(class167 arg0, class26 arg1, class96 arg2, long arg3) {
        this.field3179 = arg2;
        this.field3167 = arg1;
        this.field3157 = arg3;
        this.field3150 = this.field3167.method119(2);
        if (!arg0.method977() && this.field3150.field6499 != -1) {
            this.field3150 = class483.method2935(this.field3150.field6499, 24319);
        }
        this.field3154 = new class126();
        this.field3168 = (int) ((double) this.field3168 + Math.random() * 64.0D);
        this.method1388((byte) -96);
    }
}
