import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class624 extends class588 {

    @OriginalMember(owner = "client!nh", name = "y", descriptor = "Z")
    private boolean field9014 = false;

    @OriginalMember(owner = "client!nh", name = "r", descriptor = "I")
    private int field9007 = 0;

    @OriginalMember(owner = "client!nh", name = "S", descriptor = "Z")
    public boolean field9034 = false;

    @OriginalMember(owner = "client!nh", name = "s", descriptor = "J")
    private long field9008;

    @OriginalMember(owner = "client!nh", name = "t", descriptor = "Llm;")
    public class309 field9009;

    @OriginalMember(owner = "client!nh", name = "K", descriptor = "Lkca;")
    public class601 field9026;

    @OriginalMember(owner = "client!nh", name = "P", descriptor = "Ldp;")
    public class426 field9031;

    @OriginalMember(owner = "client!nh", name = "C", descriptor = "Lvda;")
    public class311 field9018;

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "I")
    public static int field9002 = 0;

    @OriginalMember(owner = "client!nh", name = "Q", descriptor = "I")
    public static int field9032 = 0;

    @OriginalMember(owner = "client!nh", name = "L", descriptor = "Lwg;")
    public static class58 field9027 = new class58(4);

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "I")
    public int field9000;

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "I")
    private int field9001;

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "I")
    public static int field9003;

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "I")
    public static int field9004;

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "I")
    private int field9005;

    @OriginalMember(owner = "client!nh", name = "q", descriptor = "I")
    private int field9006;

    @OriginalMember(owner = "client!nh", name = "u", descriptor = "I")
    private int field9010;

    @OriginalMember(owner = "client!nh", name = "v", descriptor = "I")
    public static int field9011;

    @OriginalMember(owner = "client!nh", name = "w", descriptor = "I")
    public int field9012;

    @OriginalMember(owner = "client!nh", name = "x", descriptor = "I")
    private int field9013;

    @OriginalMember(owner = "client!nh", name = "z", descriptor = "I")
    public int field9015;

    @OriginalMember(owner = "client!nh", name = "A", descriptor = "I")
    private int field9016;

    @OriginalMember(owner = "client!nh", name = "B", descriptor = "I")
    private int field9017;

    @OriginalMember(owner = "client!nh", name = "D", descriptor = "I")
    private int field9019;

    @OriginalMember(owner = "client!nh", name = "E", descriptor = "I")
    private int field9020;

    @OriginalMember(owner = "client!nh", name = "F", descriptor = "I")
    private int field9021;

    @OriginalMember(owner = "client!nh", name = "G", descriptor = "I")
    public int field9022;

    @OriginalMember(owner = "client!nh", name = "H", descriptor = "I")
    private int field9023;

    @OriginalMember(owner = "client!nh", name = "I", descriptor = "I")
    private int field9024;

    @OriginalMember(owner = "client!nh", name = "J", descriptor = "I")
    private int field9025;

    @OriginalMember(owner = "client!nh", name = "M", descriptor = "I")
    private int field9028;

    @OriginalMember(owner = "client!nh", name = "N", descriptor = "I")
    private int field9029;

    @OriginalMember(owner = "client!nh", name = "R", descriptor = "I")
    public static int field9033;

    @OriginalMember(owner = "client!nh", name = "T", descriptor = "I")
    private int field9035;

    @OriginalMember(owner = "client!nh", name = "U", descriptor = "I")
    public static int field9036;

    @OriginalMember(owner = "client!nh", name = "O", descriptor = "[I")
    public static int[] field9030;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILqa;J)V")
    public final void method3599(int arg0, class167 arg1, long arg2) {
        field9003++;
        class533 var5 = (class533) this.field9018.method1876((byte) -103);
        if (arg0 != 21434) {
            this.method3601(65, true, null, 10, -97L);
        }
        while (var5 != null) {
            var5.method2961(arg1, arg2);
            var5 = (class533) this.field9018.method1877(0);
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(Z)V")
    public static void method3600(boolean arg0) {
        field9030 = null;
        field9027 = null;
        if (arg0) {
            field9032 = 109;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IZLqa;IJ)V")
    public final void method3601(int arg0, boolean arg1, class167 arg2, int arg3, long arg4) {
        if (this.field9034) {
            arg1 = false;
        } else if (this.field9031.field5755 > class21.field306) {
            arg1 = false;
        } else if (class191.field2484 > class12.field110[class21.field306]) {
            arg1 = false;
        } else if (this.field9014) {
            arg1 = false;
        } else if (this.field9031.field5777 != -1) {
            int var7 = (int) (arg4 - this.field9008);
            if (this.field9031.field5797 || var7 <= this.field9031.field5777) {
                var7 %= this.field9031.field5777;
            } else {
                arg1 = false;
            }
            if (!this.field9031.field5759 && var7 < this.field9031.field5800) {
                arg1 = false;
            }
            if (this.field9031.field5759 && this.field9031.field5800 <= var7) {
                arg1 = false;
            }
        }
        field9033++;
        if (arg1) {
            this.field9007 += (int) (((double) (this.field9031.field5775 - this.field9031.field5770) * Math.random() + (double) this.field9031.field5770) * (double) arg3);
            if (this.field9007 > 63) {
                int var8 = this.field9007 >> 6;
                this.field9007 &= 0x3F;
                for (int var9 = 0; var9 < var8; var9++) {
                    int var10;
                    int var11;
                    int var12;
                    if (this.field9031.field5815 <= 0 && this.field9031.field5822 <= 0) {
                        var10 = this.field9028;
                        var11 = this.field9019;
                        var12 = this.field9013;
                    } else {
                        int var13 = this.field9023 + (int) ((double) this.field9024 * Math.random());
                        int var14 = var13 & 0x3FFF;
                        int var15 = class310.field3966[var14];
                        int var16 = class310.field3965[var14];
                        int var17 = this.field9035 + (int) ((double) this.field9025 * Math.random());
                        int var18 = var17 & 0x1FFF;
                        int var19 = class310.field3966[var18];
                        int var20 = class310.field3965[var18];
                        byte var21 = 13;
                        var12 = (var20 << 1) * -1;
                        var10 = var16 * var19 >> var21;
                        var11 = var15 * var19 >> var21;
                    }
                    int var22 = (int) (Math.random() * 65535.0D);
                    int var23 = (int) (Math.random() * 65535.0D);
                    if (var22 + var23 > 65535) {
                        var22 = 65535 - var22;
                        var23 = 65535 - var23;
                    }
                    int var24 = 65535 - var22 - var23;
                    int var25 = (int) ((long) this.field9020 * (long) var24 + (long) this.field9010 * (long) var22 + (long) this.field9005 * (long) var23 >> 16);
                    int var26 = (int) ((long) this.field9016 * (long) var23 + (long) this.field9029 * (long) var24 + (long) this.field9021 * (long) var22 >> 16);
                    int var27 = (int) ((long) this.field9006 * (long) var22 - (-((long) this.field9017 * (long) var23) - (long) this.field9001 * (long) var24) >> 16);
                    int var28 = this.field9031.field5820 + ((int) ((double) (this.field9031.field5782 - this.field9031.field5820) * Math.random()));
                    int var29 = (int) ((double) (this.field9031.field5788 - this.field9031.field5754) * Math.random()) + this.field9031.field5754;
                    int var30 = (int) ((double) (this.field9031.field5799 - this.field9031.field5756) * Math.random()) + this.field9031.field5756;
                    int var31;
                    if (this.field9031.field5813) {
                        double var32 = Math.random();
                        var31 = (int) ((double) this.field9031.field5823 * var32 + (double) this.field9031.field5821) | (int) ((double) this.field9031.field5789 * var32 + (double) this.field9031.field5810) << 8 | (int) ((double) this.field9031.field5769 * var32 + (double) this.field9031.field5785) << 16 | (int) ((double) this.field9031.field5764 * Math.random() + (double) this.field9031.field5806) << 24;
                    } else {
                        var31 = (int) ((double) this.field9031.field5785 + Math.random() * (double) this.field9031.field5769) << 16 | (int) ((double) this.field9031.field5810 + (double) this.field9031.field5789 * Math.random()) << 8 | (int) ((double) this.field9031.field5821 + (double) this.field9031.field5823 * Math.random()) | (int) ((double) this.field9031.field5764 * Math.random() + (double) this.field9031.field5806) << 24;
                    }
                    int var34 = this.field9031.field5781;
                    if (!arg2.method960() && !this.field9031.field5762) {
                        var34 = -1;
                    }
                    if (class523.field7290 == class404.field5542) {
                        new class533(this, var25, var26, var27, var10, var12, var11, var28, var29, var31, var30, var34, this.field9031.field5776, this.field9031.field5787);
                    } else {
                        class533 var35 = class109.field1414[class523.field7290];
                        class523.field7290 = class523.field7290 + 1 & 0x3FF;
                        var35.method2965(this, var25, var26, var27, var10, var12, var11, var28, var29, var31, var30, var34, this.field9031.field5776, this.field9031.field5787);
                    }
                }
            }
        }
        this.field9012 = 0;
        if (arg0 != -1759325128) {
            this.field9031 = null;
        }
        for (class533 var37 = (class533) this.field9018.method1876((byte) -56); var37 != null; var37 = (class533) this.field9018.method1877(0)) {
            var37.method2964(arg4, arg3);
            this.field9012++;
        }
        class541.field7573 += this.field9012;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
    public final void method3602(int arg0) {
        this.field9020 = this.field9026.field8685;
        this.field9017 = this.field9026.field8699;
        this.field9029 = this.field9026.field8691;
        this.field9001 = this.field9026.field8686;
        field9004++;
        if (arg0 != 1) {
            return;
        }
        this.field9021 = this.field9026.field8696;
        this.field9006 = this.field9026.field8689;
        this.field9005 = this.field9026.field8698;
        this.field9016 = this.field9026.field8694;
        this.field9010 = this.field9026.field8683;
        if (this.field9010 == this.field9005 && this.field9020 == this.field9005 && this.field9021 == this.field9016 && this.field9029 == this.field9016 && this.field9017 == this.field9006 && this.field9017 == this.field9001) {
            this.field9014 = true;
            return;
        }
        this.field9014 = false;
        int var2 = (this.field9010 + this.field9005 + this.field9020) / 3;
        int var3 = (this.field9021 + this.field9016 + this.field9029) / 3;
        int var4 = (this.field9006 + this.field9017 + this.field9001) / 3;
        if (this.field9015 == var2 && this.field9000 == var3 && this.field9022 == var4) {
            return;
        }
        this.field9022 = var4;
        this.field9015 = var2;
        this.field9000 = var3;
        int var5 = this.field9005 - this.field9010;
        int var6 = this.field9016 - this.field9021;
        int var7 = this.field9017 - this.field9006;
        int var8 = this.field9020 - this.field9010;
        int var9 = this.field9029 - this.field9021;
        int var10 = this.field9001 - this.field9006;
        this.field9028 = var6 * var10 - var7 * var9;
        this.field9019 = var5 * var9 - (var6 * var8);
        for (this.field9013 = var7 * var8 - (var5 * var10); this.field9028 > 32767 || this.field9013 > 32767 || this.field9019 > 32767 || this.field9028 < -32767 || this.field9013 < -32767 || this.field9019 < -32767; this.field9013 >>= 0x1) {
            this.field9028 >>= 0x1;
            this.field9019 >>= 0x1;
        }
        int var11 = (int) Math.sqrt((double) (this.field9019 * this.field9019 + this.field9028 * this.field9028 + this.field9013 * this.field9013));
        if (var11 <= 0) {
            var11 = 1;
        }
        this.field9019 = this.field9019 * 32767 / var11;
        this.field9028 = this.field9028 * 32767 / var11;
        this.field9013 = this.field9013 * 32767 / var11;
        if (this.field9031.field5815 <= 0 && this.field9031.field5822 <= 0) {
            return;
        }
        int var12 = (int) (Math.atan2((double) this.field9019, (double) this.field9028) * 2607.5945876176133D);
        int var13 = (int) (Math.atan2((double) this.field9013, Math.sqrt((double) (this.field9028 * this.field9028 + this.field9019 * this.field9019))) * 2607.5945876176133D);
        this.field9024 = this.field9031.field5815 - this.field9031.field5753;
        this.field9023 = this.field9031.field5753 + var12 - (this.field9024 >> 1);
        this.field9025 = this.field9031.field5822 - this.field9031.field5791;
        this.field9035 = var13 + this.field9031.field5791 - (this.field9025 >> 1);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIILkr;)Lfp;")
    public static final class528 method3603(int arg0, int arg1, int arg2, class329 arg3) {
        field9011++;
        byte[] var4 = arg3.method2054(true, arg2, arg1);
        if (arg0 >= -10) {
            field9002 = 64;
        }
        return var4 == null ? null : new class528(var4);
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lqa;Lkca;Llm;J)V")
    public class624(class167 arg0, class601 arg1, class309 arg2, long arg3) {
        this.field9008 = arg3;
        this.field9009 = arg2;
        this.field9026 = arg1;
        this.field9031 = this.field9026.method3459(true);
        if (!arg0.method960() && this.field9031.field5760 != -1) {
            this.field9031 = class247.method1517(-114, this.field9031.field5760);
        }
        this.field9018 = new class311();
        this.field9007 = (int) ((double) this.field9007 + Math.random() * 64.0D);
        this.method3602(1);
    }
}
