import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class426 extends class499 {

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "Z")
    public boolean field5859 = false;

    @OriginalMember(owner = "client!ij", name = "o", descriptor = "I")
    private int field5865 = 0;

    @OriginalMember(owner = "client!ij", name = "n", descriptor = "Lfw;")
    public class56 field5864 = new class56();

    @OriginalMember(owner = "client!ij", name = "u", descriptor = "Lfw;")
    private class56 field5871 = new class56();

    @OriginalMember(owner = "client!ij", name = "C", descriptor = "Z")
    private boolean field5879 = false;

    @OriginalMember(owner = "client!ij", name = "t", descriptor = "J")
    private long field5870;

    @OriginalMember(owner = "client!ij", name = "r", descriptor = "Ll;")
    public class17 field5868;

    @OriginalMember(owner = "client!ij", name = "l", descriptor = "Lcm;")
    public class730 field5862;

    @OriginalMember(owner = "client!ij", name = "q", descriptor = "Lfga;")
    public class258 field5867;

    @OriginalMember(owner = "client!ij", name = "k", descriptor = "Lvm;")
    public class687 field5861;

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "I")
    public int field5858;

    @OriginalMember(owner = "client!ij", name = "j", descriptor = "I")
    public static int field5860;

    @OriginalMember(owner = "client!ij", name = "m", descriptor = "I")
    public static int field5863;

    @OriginalMember(owner = "client!ij", name = "p", descriptor = "I")
    public static int field5866;

    @OriginalMember(owner = "client!ij", name = "v", descriptor = "I")
    private int field5872;

    @OriginalMember(owner = "client!ij", name = "w", descriptor = "I")
    private int field5873;

    @OriginalMember(owner = "client!ij", name = "x", descriptor = "I")
    private int field5874;

    @OriginalMember(owner = "client!ij", name = "y", descriptor = "I")
    private int field5875;

    @OriginalMember(owner = "client!ij", name = "z", descriptor = "I")
    private int field5876;

    @OriginalMember(owner = "client!ij", name = "A", descriptor = "I")
    private int field5877;

    @OriginalMember(owner = "client!ij", name = "B", descriptor = "I")
    private int field5878;

    @OriginalMember(owner = "client!ij", name = "s", descriptor = "Lel;")
    public static class548 field5869;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V", line = 3)
    public static void method2458(byte arg0) {
        if (arg0 == 38) {
            field5869 = null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IZLha;ZJ)V", line = 21)
    public final void method2459(int arg0, boolean arg1, class59 arg2, boolean arg3, long arg4) {
        if (this.field5859) {
            arg1 = false;
        } else if (this.field5867.field3535 > class175.field2642) {
            arg1 = false;
        } else if (class580.field7621 > class307.field4412[class175.field2642]) {
            arg1 = false;
        } else if (this.field5879) {
            arg1 = false;
        } else if (this.field5867.field3589 != -1) {
            int var7 = (int) (arg4 - this.field5870);
            if (this.field5867.field3580 || var7 <= this.field5867.field3589) {
                var7 %= this.field5867.field3589;
            } else {
                arg1 = false;
            }
            if (!this.field5867.field3558 && var7 < this.field5867.field3542) {
                arg1 = false;
            }
            if (this.field5867.field3558 && var7 >= this.field5867.field3542) {
                arg1 = false;
            }
        }
        field5863++;
        if (arg1) {
            class456.field6220++;
            int var8 = (this.field5864.field675 + this.field5864.field667 + this.field5864.field684) / 3;
            int var9 = (this.field5864.field673 + this.field5864.field668 + this.field5864.field672) / 3;
            int var10 = (this.field5864.field679 + this.field5864.field671 + this.field5864.field683) / 3;
            if (this.field5864.field674 != var8 || this.field5864.field669 != var9 || this.field5864.field677 != var10) {
                this.field5864.field677 = var10;
                this.field5864.field669 = var9;
                this.field5864.field674 = var8;
                int var11 = this.field5864.field667 - this.field5864.field684;
                int var12 = this.field5864.field668 - this.field5864.field673;
                int var13 = this.field5864.field671 - this.field5864.field679;
                int var14 = this.field5864.field675 - this.field5864.field684;
                int var15 = this.field5864.field672 - this.field5864.field673;
                int var16 = this.field5864.field683 - this.field5864.field679;
                this.field5877 = var12 * var16 - (var13 * var15);
                this.field5872 = var11 * var15 - (var12 * var14);
                this.field5874 = var13 * var14 - var11 * var16;
                while (true) {
                    if (this.field5877 <= 32767 && this.field5874 <= 32767 && this.field5872 <= 32767 && this.field5877 >= -32767 && this.field5874 >= -32767 && this.field5872 >= -32767) {
                        int var17 = (int) Math.sqrt((double) (this.field5874 * this.field5874 + (this.field5877 * this.field5877 + (this.field5872 * this.field5872))));
                        if (var17 <= 0) {
                            var17 = 1;
                        }
                        this.field5877 = this.field5877 * 32767 / var17;
                        this.field5874 = this.field5874 * 32767 / var17;
                        this.field5872 = this.field5872 * 32767 / var17;
                        if (this.field5867.field3534 > 0 || this.field5867.field3538 > 0) {
                            int var18 = (int) (Math.atan2((double) this.field5872, (double) this.field5877) * 2607.5945876176133D);
                            int var19 = (int) (Math.atan2((double) this.field5874, Math.sqrt((double) (this.field5877 * this.field5877 + this.field5872 * this.field5872))) * 2607.5945876176133D);
                            this.field5878 = this.field5867.field3534 - this.field5867.field3561;
                            this.field5875 = this.field5867.field3561 + var18 - (this.field5878 >> 1);
                            this.field5873 = this.field5867.field3538 - this.field5867.field3559;
                            this.field5876 = this.field5867.field3559 + var19 - (this.field5873 >> 1);
                        }
                        break;
                    }
                    this.field5874 >>= 0x1;
                    this.field5877 >>= 0x1;
                    this.field5872 >>= 0x1;
                }
            }
            this.field5865 += (int) ((double) arg0 * ((double) (this.field5867.field3592 - this.field5867.field3586) * Math.random() + (double) this.field5867.field3586));
            if (this.field5865 > 63) {
                int var20 = this.field5865 >> 6;
                this.field5865 &= 0x3F;
                for (int var21 = 0; var21 < var20; var21++) {
                    int var22;
                    int var23;
                    int var24;
                    if (this.field5867.field3534 <= 0 && this.field5867.field3538 <= 0) {
                        var22 = this.field5872;
                        var23 = this.field5877;
                        var24 = this.field5874;
                    } else {
                        int var25 = this.field5875 + ((int) (Math.random() * (double) this.field5878));
                        int var26 = var25 & 0x3FFF;
                        int var27 = class451.field6174[var26];
                        int var28 = class451.field6177[var26];
                        int var29 = (int) (Math.random() * (double) this.field5873) + this.field5876;
                        int var30 = var29 & 0x1FFF;
                        int var31 = class451.field6174[var30];
                        int var32 = class451.field6177[var30];
                        byte var33 = 13;
                        var24 = (var32 << 1) * -1;
                        var23 = var28 * var31 >> var33;
                        var22 = var27 * var31 >> var33;
                    }
                    float var34 = (float) Math.random();
                    float var35 = (float) Math.random();
                    if (var34 + var35 > 1.0F) {
                        var35 = 1.0F - var35;
                        var34 = 1.0F - var34;
                    }
                    float var36 = 1.0F - var35 - var34;
                    int var37 = (int) ((float) this.field5864.field675 * var36 + (float) this.field5864.field684 * var34 + (float) this.field5864.field667 * var35);
                    int var38 = (int) ((float) this.field5864.field672 * var36 + (float) this.field5864.field673 * var34 + (float) this.field5864.field668 * var35);
                    int var39 = (int) ((float) this.field5864.field683 * var36 + (float) this.field5864.field679 * var34 + (float) this.field5864.field671 * var35);
                    int var40 = (int) ((float) this.field5871.field675 * var36 + (float) this.field5871.field684 * var34 + (float) this.field5871.field667 * var35);
                    int var41 = (int) ((float) this.field5871.field672 * var36 + (float) this.field5871.field673 * var34 + (float) this.field5871.field668 * var35);
                    int var42 = (int) ((float) this.field5871.field683 * var36 + (float) this.field5871.field679 * var34 + (float) this.field5871.field671 * var35);
                    int var43 = var37 - var40;
                    int var44 = var38 - var41;
                    int var45 = var39 - var42;
                    int var46 = (int) ((double) var43 * Math.random() + (double) var40);
                    int var47 = (int) ((double) var41 + Math.random() * (double) var44);
                    int var48 = (int) (Math.random() * (double) var45 + (double) var42);
                    int var49 = (int) ((double) (this.field5867.field3549 - this.field5867.field3566) * Math.random()) + this.field5867.field3566;
                    int var50 = (int) (Math.random() * (double) (this.field5867.field3591 - this.field5867.field3551)) + this.field5867.field3551;
                    int var51 = (int) ((double) (this.field5867.field3583 - this.field5867.field3575) * Math.random()) + this.field5867.field3575;
                    int var54;
                    if (this.field5867.field3595) {
                        double var52 = Math.random();
                        var54 = (int) ((double) this.field5867.field3540 + Math.random() * (double) this.field5867.field3531) << 24 | (int) ((double) this.field5867.field3527 * var52 + (double) this.field5867.field3543) << 16 | (int) ((double) this.field5867.field3556 * var52 + (double) this.field5867.field3581) << 8 | (int) ((double) this.field5867.field3530 * var52 + (double) this.field5867.field3573);
                    } else {
                        var54 = (int) (Math.random() * (double) this.field5867.field3531 + (double) this.field5867.field3540) << 24 | (int) (Math.random() * (double) this.field5867.field3530 + (double) this.field5867.field3573) | (int) ((double) this.field5867.field3556 * Math.random() + (double) this.field5867.field3581) << 8 | (int) ((double) this.field5867.field3543 + Math.random() * (double) this.field5867.field3527) << 16;
                    }
                    int var55 = this.field5867.field3582;
                    if (!arg2.method391() && !this.field5867.field3560) {
                        var55 = -1;
                    }
                    if (class680.field9503 == class155.field2365) {
                        new class579(this, var46, var47, var48, var23, var24, var22, var49, var50, var54, var51, var55, this.field5867.field3563, this.field5867.field3532);
                    } else {
                        class579 var56 = class573.field7529[class680.field9503];
                        class680.field9503 = class680.field9503 + 1 & 0x3FF;
                        var56.method3176(this, var46, var47, var48, var23, var24, var22, var49, var50, var54, var51, var55, this.field5867.field3563, this.field5867.field3532);
                    }
                }
            }
        }
        if (!this.field5864.method373(this.field5871, -15742)) {
            class56 var58 = this.field5871;
            this.field5871 = this.field5864;
            this.field5864 = var58;
            this.field5864.field668 = this.field5862.field10126;
            this.field5864.field672 = this.field5862.field10115;
            this.field5864.field677 = this.field5871.field677;
            this.field5864.field673 = this.field5862.field10132;
            this.field5864.field684 = this.field5862.field10121;
            this.field5864.field675 = this.field5862.field10113;
            this.field5864.field683 = this.field5862.field10129;
            this.field5864.field669 = this.field5871.field669;
            this.field5864.field667 = this.field5862.field10127;
            this.field5864.field671 = this.field5862.field10114;
            this.field5864.field679 = this.field5862.field10131;
            this.field5864.field674 = this.field5871.field674;
        }
        this.field5858 = 0;
        for (class579 var59 = (class579) this.field5861.method3874((byte) 27); var59 != null; var59 = (class579) this.field5861.method3868(-24951)) {
            var59.method3175(arg4, arg0);
            this.field5858++;
        }
        if (!arg3) {
            method2458((byte) 24);
        }
        class376.field5243 += this.field5858;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(JILha;)V", line = 283)
    public final void method2460(long arg0, int arg1, class59 arg2) {
        for (class579 var5 = (class579) this.field5861.method3874((byte) 11); var5 != null; var5 = (class579) this.field5861.method3868(-24951)) {
            var5.method3174(arg2, arg0);
        }
        if (arg1 != -31392) {
            this.field5872 = -17;
        }
        field5866++;
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Lha;Lcm;Ll;J)V", line = 370)
    public class426(class59 arg0, class730 arg1, class17 arg2, long arg3) {
        this.field5870 = arg3;
        this.field5868 = arg2;
        this.field5862 = arg1;
        this.field5867 = this.field5862.method4092(false);
        if (!arg0.method391() && this.field5867.field3567 != -1) {
            this.field5867 = class277.method1666(this.field5867.field3567, -11836);
        }
        this.field5861 = new class687();
        this.field5865 = (int) ((double) this.field5865 + Math.random() * 64.0D);
        this.method2461((byte) 68);
        this.field5871.field683 = this.field5864.field683;
        this.field5871.field673 = this.field5864.field673;
        this.field5871.field668 = this.field5864.field668;
        this.field5871.field675 = this.field5864.field675;
        this.field5871.field684 = this.field5864.field684;
        this.field5871.field667 = this.field5864.field667;
        this.field5871.field672 = this.field5864.field672;
        this.field5871.field671 = this.field5864.field671;
        this.field5871.field679 = this.field5864.field679;
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(B)V", line = 305)
    public final void method2461(byte arg0) {
        this.field5864.field679 = this.field5862.field10131;
        this.field5864.field683 = this.field5862.field10129;
        this.field5864.field668 = this.field5862.field10126;
        if (arg0 < 32) {
            return;
        }
        field5860++;
        this.field5864.field667 = this.field5862.field10127;
        this.field5864.field673 = this.field5862.field10132;
        this.field5864.field671 = this.field5862.field10114;
        this.field5864.field684 = this.field5862.field10121;
        this.field5864.field675 = this.field5862.field10113;
        this.field5864.field672 = this.field5862.field10115;
        if (this.field5864.field684 == this.field5864.field667 && this.field5864.field675 == this.field5864.field667 && this.field5864.field673 == this.field5864.field668 && this.field5864.field672 == this.field5864.field668 && this.field5864.field679 == this.field5864.field671 && this.field5864.field683 == this.field5864.field671) {
            this.field5879 = true;
        } else if (this.field5879) {
            this.field5871.field683 = this.field5864.field683;
            this.field5871.field679 = this.field5864.field679;
            this.field5871.field671 = this.field5864.field671;
            this.field5871.field675 = this.field5864.field675;
            this.field5871.field668 = this.field5864.field668;
            this.field5871.field673 = this.field5864.field673;
            this.field5871.field684 = this.field5864.field684;
            this.field5879 = false;
            this.field5871.field667 = this.field5864.field667;
            this.field5871.field672 = this.field5864.field672;
        }
    }
}
