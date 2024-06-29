import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oea")
public class class621 extends class76 {

    @OriginalMember(owner = "client!oea", name = "u", descriptor = "Z")
    public boolean field8755 = false;

    @OriginalMember(owner = "client!oea", name = "w", descriptor = "I")
    private int field8757 = 0;

    @OriginalMember(owner = "client!oea", name = "s", descriptor = "Les;")
    public class400 field8753 = new class400();

    @OriginalMember(owner = "client!oea", name = "C", descriptor = "Les;")
    private class400 field8763 = new class400();

    @OriginalMember(owner = "client!oea", name = "E", descriptor = "Z")
    private boolean field8765 = false;

    @OriginalMember(owner = "client!oea", name = "t", descriptor = "Lqo;")
    public class24 field8754;

    @OriginalMember(owner = "client!oea", name = "o", descriptor = "J")
    private long field8749;

    @OriginalMember(owner = "client!oea", name = "n", descriptor = "Lnha;")
    public class338 field8748;

    @OriginalMember(owner = "client!oea", name = "y", descriptor = "Llh;")
    public class550 field8759;

    @OriginalMember(owner = "client!oea", name = "p", descriptor = "Leo;")
    public class310 field8750;

    @OriginalMember(owner = "client!oea", name = "z", descriptor = "Z")
    public static boolean field8760 = false;

    @OriginalMember(owner = "client!oea", name = "m", descriptor = "Lke;")
    public static class622 field8747 = new class622(52, 3);

    @OriginalMember(owner = "client!oea", name = "B", descriptor = "I")
    public static int field8762 = 0;

    @OriginalMember(owner = "client!oea", name = "q", descriptor = "I")
    public static int field8751;

    @OriginalMember(owner = "client!oea", name = "v", descriptor = "I")
    public static int field8756;

    @OriginalMember(owner = "client!oea", name = "x", descriptor = "I")
    public int field8758;

    @OriginalMember(owner = "client!oea", name = "A", descriptor = "I")
    public static int field8761;

    @OriginalMember(owner = "client!oea", name = "D", descriptor = "I")
    private int field8764;

    @OriginalMember(owner = "client!oea", name = "F", descriptor = "I")
    private int field8766;

    @OriginalMember(owner = "client!oea", name = "G", descriptor = "I")
    private int field8767;

    @OriginalMember(owner = "client!oea", name = "H", descriptor = "I")
    private int field8768;

    @OriginalMember(owner = "client!oea", name = "I", descriptor = "I")
    private int field8769;

    @OriginalMember(owner = "client!oea", name = "J", descriptor = "I")
    private int field8770;

    @OriginalMember(owner = "client!oea", name = "K", descriptor = "I")
    private int field8771;

    @OriginalMember(owner = "client!oea", name = "r", descriptor = "Lcb;")
    public static class544 field8752;

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(I)V", line = 7)
    public static void method3551(int arg0) {
        field8747 = null;
        if (arg0 != 52) {
            field8762 = -89;
        }
        field8752 = null;
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(Lha;JIIZ)V", line = 18)
    public final void method3552(class66 arg0, long arg1, int arg2, int arg3, boolean arg4) {
        field8751++;
        if (this.field8755) {
            arg4 = false;
        } else if (this.field8759.field7790 > class211.field3063) {
            arg4 = false;
        } else if (class480.field6815[class211.field3063] < class207.field3028) {
            arg4 = false;
        } else if (this.field8765) {
            arg4 = false;
        } else if (this.field8759.field7778 != -1) {
            int var7 = (int) (arg1 - this.field8749);
            if (this.field8759.field7808 || this.field8759.field7778 >= var7) {
                var7 %= this.field8759.field7778;
            } else {
                arg4 = false;
            }
            if (!this.field8759.field7815 && var7 < this.field8759.field7820) {
                arg4 = false;
            }
            if (this.field8759.field7815 && this.field8759.field7820 <= var7) {
                arg4 = false;
            }
        }
        if (arg4) {
            class109.field1315++;
            int var8 = (this.field8753.field5685 + this.field8753.field5678 + this.field8753.field5676) / 3;
            int var9 = (this.field8753.field5688 + this.field8753.field5679 + this.field8753.field5682) / 3;
            int var10 = (this.field8753.field5689 + this.field8753.field5677 + this.field8753.field5687) / 3;
            if (this.field8753.field5680 != var8 || this.field8753.field5684 != var9 || this.field8753.field5683 != var10) {
                this.field8753.field5683 = var10;
                this.field8753.field5684 = var9;
                this.field8753.field5680 = var8;
                int var11 = this.field8753.field5678 - this.field8753.field5685;
                int var12 = this.field8753.field5688 - this.field8753.field5679;
                int var13 = this.field8753.field5689 - this.field8753.field5677;
                int var14 = this.field8753.field5676 - this.field8753.field5685;
                int var15 = this.field8753.field5682 - this.field8753.field5679;
                int var16 = this.field8753.field5687 - this.field8753.field5677;
                this.field8770 = var11 * var15 - (var12 * var14);
                this.field8769 = var13 * var14 - (var11 * var16);
                this.field8768 = var12 * var16 - (var13 * var15);
                while (true) {
                    if (this.field8768 <= 32767 && this.field8769 <= 32767 && this.field8770 <= 32767 && this.field8768 >= -32767 && this.field8769 >= -32767 && this.field8770 >= -32767) {
                        int var17 = (int) Math.sqrt((double) (this.field8769 * this.field8769 + (this.field8768 * this.field8768 + (this.field8770 * this.field8770))));
                        if (var17 <= 0) {
                            var17 = 1;
                        }
                        this.field8769 = this.field8769 * 32767 / var17;
                        this.field8768 = this.field8768 * 32767 / var17;
                        this.field8770 = this.field8770 * 32767 / var17;
                        if (this.field8759.field7783 > 0 || this.field8759.field7809 > 0) {
                            int var18 = (int) (Math.atan2((double) this.field8770, (double) this.field8768) * 2607.5945876176133D);
                            int var19 = (int) (Math.atan2((double) this.field8769, Math.sqrt((double) (this.field8770 * this.field8770 + this.field8768 * this.field8768))) * 2607.5945876176133D);
                            this.field8766 = this.field8759.field7783 - this.field8759.field7767;
                            this.field8767 = this.field8759.field7809 - this.field8759.field7765;
                            this.field8771 = this.field8759.field7767 + var18 - (this.field8766 >> 1);
                            this.field8764 = var19 + this.field8759.field7765 - (this.field8767 >> 1);
                        }
                        break;
                    }
                    this.field8768 >>= 0x1;
                    this.field8770 >>= 0x1;
                    this.field8769 >>= 0x1;
                }
            }
            this.field8757 += (int) ((double) arg2 * ((double) this.field8759.field7771 + Math.random() * (double) (this.field8759.field7801 - this.field8759.field7771)));
            if (this.field8757 > 63) {
                int var20 = this.field8757 >> 6;
                this.field8757 &= 0x3F;
                for (int var21 = 0; var21 < var20; var21++) {
                    int var22;
                    int var23;
                    int var24;
                    if (this.field8759.field7783 <= 0 && this.field8759.field7809 <= 0) {
                        var22 = this.field8769;
                        var23 = this.field8768;
                        var24 = this.field8770;
                    } else {
                        int var25 = this.field8771 + ((int) ((double) this.field8766 * Math.random()));
                        int var26 = var25 & 0x3FFF;
                        int var27 = class601.field8476[var26];
                        int var28 = class601.field8473[var26];
                        int var29 = this.field8764 + ((int) ((double) this.field8767 * Math.random()));
                        int var30 = var29 & 0x1FFF;
                        int var31 = class601.field8476[var30];
                        int var32 = class601.field8473[var30];
                        byte var33 = 13;
                        var22 = (var32 << 1) * -1;
                        var23 = var28 * var31 >> var33;
                        var24 = var27 * var31 >> var33;
                    }
                    float var34 = (float) Math.random();
                    float var35 = (float) Math.random();
                    if (var34 + var35 > 1.0F) {
                        var35 = 1.0F - var35;
                        var34 = 1.0F - var34;
                    }
                    float var36 = 1.0F - var35 - var34;
                    int var37 = (int) ((float) this.field8753.field5676 * var36 + (float) this.field8753.field5685 * var34 + (float) this.field8753.field5678 * var35);
                    int var38 = (int) ((float) this.field8753.field5682 * var36 + (float) this.field8753.field5688 * var35 + (float) this.field8753.field5679 * var34);
                    int var39 = (int) ((float) this.field8753.field5687 * var36 + (float) this.field8753.field5689 * var35 + (float) this.field8753.field5677 * var34);
                    int var40 = (int) ((float) this.field8763.field5676 * var36 + (float) this.field8763.field5685 * var34 + (float) this.field8763.field5678 * var35);
                    int var41 = (int) ((float) this.field8763.field5682 * var36 + (float) this.field8763.field5688 * var35 + (float) this.field8763.field5679 * var34);
                    int var42 = (int) ((float) this.field8763.field5687 * var36 + (float) this.field8763.field5689 * var35 + (float) this.field8763.field5677 * var34);
                    int var43 = var37 - var40;
                    int var44 = var38 - var41;
                    int var45 = var39 - var42;
                    int var46 = (int) ((double) var43 * Math.random() + (double) var40);
                    int var47 = (int) ((double) var44 * Math.random() + (double) var41);
                    int var48 = (int) ((double) var42 + (double) var45 * Math.random());
                    int var49 = (int) ((double) (this.field8759.field7757 - this.field8759.field7811) * Math.random()) + this.field8759.field7811;
                    int var50 = (int) (Math.random() * (double) (this.field8759.field7786 - this.field8759.field7780)) + this.field8759.field7780;
                    int var51 = this.field8759.field7759 + ((int) ((double) (this.field8759.field7807 - this.field8759.field7759) * Math.random()));
                    int var52;
                    if (this.field8759.field7760) {
                        double var53 = Math.random();
                        var52 = (int) ((double) this.field8759.field7814 * var53 + (double) this.field8759.field7802) << 16 | (int) ((double) this.field8759.field7754 * var53 + (double) this.field8759.field7800) << 8 | (int) ((double) this.field8759.field7817 * var53 + (double) this.field8759.field7772) | (int) ((double) this.field8759.field7755 + (double) this.field8759.field7788 * Math.random()) << 24;
                    } else {
                        var52 = (int) ((double) this.field8759.field7817 * Math.random() + (double) this.field8759.field7772) | (int) ((double) this.field8759.field7802 + Math.random() * (double) this.field8759.field7814) << 16 | (int) ((double) this.field8759.field7800 + (double) this.field8759.field7754 * Math.random()) << 8 | (int) (Math.random() * (double) this.field8759.field7788 + (double) this.field8759.field7755) << 24;
                    }
                    int var55 = this.field8759.field7795;
                    if (!arg0.method422() && !this.field8759.field7764) {
                        var55 = -1;
                    }
                    if (field8762 == class48.field688) {
                        new class121(this, var46, var47, var48, var23, var22, var24, var49, var50, var52, var51, var55, this.field8759.field7806, this.field8759.field7770);
                    } else {
                        class121 var56 = class653.field9220[field8762];
                        field8762 = field8762 + 1 & 0x3FF;
                        var56.method899(this, var46, var47, var48, var23, var22, var24, var49, var50, var52, var51, var55, this.field8759.field7806, this.field8759.field7770);
                    }
                }
            }
        }
        if (!this.field8753.method2428(-99, this.field8763)) {
            class400 var58 = this.field8763;
            this.field8763 = this.field8753;
            this.field8753 = var58;
            this.field8753.field5687 = this.field8748.field5014;
            this.field8753.field5678 = this.field8748.field5012;
            this.field8753.field5685 = this.field8748.field5019;
            this.field8753.field5677 = this.field8748.field5022;
            this.field8753.field5680 = this.field8763.field5680;
            this.field8753.field5682 = this.field8748.field5009;
            this.field8753.field5684 = this.field8763.field5684;
            this.field8753.field5689 = this.field8748.field5008;
            this.field8753.field5679 = this.field8748.field5025;
            this.field8753.field5676 = this.field8748.field5005;
            this.field8753.field5688 = this.field8748.field5010;
            this.field8753.field5683 = this.field8763.field5683;
        }
        this.field8758 = 0;
        for (class121 var59 = (class121) this.field8750.method2033(arg3); var59 != null; var59 = (class121) this.field8750.method2025((byte) -88)) {
            var59.method901(arg1, arg2);
            this.field8758++;
        }
        class428.field6016 += this.field8758;
    }

    @OriginalMember(owner = "client!oea", name = "b", descriptor = "(I)V", line = 285)
    public final void method3553(int arg0) {
        this.field8753.field5685 = this.field8748.field5019;
        this.field8753.field5682 = this.field8748.field5009;
        if (arg0 <= 96) {
            this.method3554((byte) -22, null, -58L);
        }
        this.field8753.field5689 = this.field8748.field5008;
        this.field8753.field5677 = this.field8748.field5022;
        this.field8753.field5679 = this.field8748.field5025;
        this.field8753.field5678 = this.field8748.field5012;
        this.field8753.field5688 = this.field8748.field5010;
        this.field8753.field5687 = this.field8748.field5014;
        this.field8753.field5676 = this.field8748.field5005;
        field8756++;
        if (this.field8753.field5685 == this.field8753.field5678 && this.field8753.field5678 == this.field8753.field5676 && this.field8753.field5688 == this.field8753.field5679 && this.field8753.field5688 == this.field8753.field5682 && this.field8753.field5689 == this.field8753.field5677 && this.field8753.field5689 == this.field8753.field5687) {
            this.field8765 = true;
        } else if (this.field8765) {
            this.field8765 = false;
            this.field8763.field5689 = this.field8753.field5689;
            this.field8763.field5687 = this.field8753.field5687;
            this.field8763.field5688 = this.field8753.field5688;
            this.field8763.field5685 = this.field8753.field5685;
            this.field8763.field5682 = this.field8753.field5682;
            this.field8763.field5678 = this.field8753.field5678;
            this.field8763.field5676 = this.field8753.field5676;
            this.field8763.field5679 = this.field8753.field5679;
            this.field8763.field5677 = this.field8753.field5677;
        }
    }

    @OriginalMember(owner = "client!oea", name = "<init>", descriptor = "(Lha;Lnha;Lqo;J)V", line = 382)
    public class621(class66 arg0, class338 arg1, class24 arg2, long arg3) {
        this.field8754 = arg2;
        this.field8749 = arg3;
        this.field8748 = arg1;
        this.field8759 = this.field8748.method2170((byte) -48);
        if (!arg0.method422() && this.field8759.field7753 != -1) {
            this.field8759 = class437.method2638(this.field8759.field7753, -105);
        }
        this.field8750 = new class310();
        this.field8757 = (int) ((double) this.field8757 + Math.random() * 64.0D);
        this.method3553(126);
        this.field8763.field5677 = this.field8753.field5677;
        this.field8763.field5689 = this.field8753.field5689;
        this.field8763.field5687 = this.field8753.field5687;
        this.field8763.field5682 = this.field8753.field5682;
        this.field8763.field5678 = this.field8753.field5678;
        this.field8763.field5688 = this.field8753.field5688;
        this.field8763.field5685 = this.field8753.field5685;
        this.field8763.field5676 = this.field8753.field5676;
        this.field8763.field5679 = this.field8753.field5679;
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(BLha;J)V", line = 330)
    public final void method3554(byte arg0, class66 arg1, long arg2) {
        for (class121 var5 = (class121) this.field8750.method2033(0); var5 != null; var5 = (class121) this.field8750.method2025((byte) -88)) {
            var5.method903(arg1, arg2);
        }
        field8761++;
        if (arg0 > -105) {
            this.method3554((byte) -55, null, 70L);
        }
    }
}
