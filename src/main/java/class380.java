import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class380 extends class393 {

    @OriginalMember(owner = "client!pp", name = "m", descriptor = "I")
    private int field4925 = 0;

    @OriginalMember(owner = "client!pp", name = "B", descriptor = "Z")
    private boolean field4940 = false;

    @OriginalMember(owner = "client!pp", name = "u", descriptor = "Z")
    public boolean field4933 = false;

    @OriginalMember(owner = "client!pp", name = "n", descriptor = "Lsm;")
    public class473 field4926;

    @OriginalMember(owner = "client!pp", name = "s", descriptor = "Lwp;")
    public class330 field4931;

    @OriginalMember(owner = "client!pp", name = "Q", descriptor = "J")
    private long field4953;

    @OriginalMember(owner = "client!pp", name = "w", descriptor = "Ltv;")
    public class292 field4935;

    @OriginalMember(owner = "client!pp", name = "F", descriptor = "Lcr;")
    public class362 field4943;

    @OriginalMember(owner = "client!pp", name = "H", descriptor = "Loi;")
    public static class169 field4945 = new class169(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

    @OriginalMember(owner = "client!pp", name = "S", descriptor = "[I")
    public static int[] field4955 = new int[14];

    @OriginalMember(owner = "client!pp", name = "i", descriptor = "I")
    private int field4921;

    @OriginalMember(owner = "client!pp", name = "j", descriptor = "I")
    public int field4922;

    @OriginalMember(owner = "client!pp", name = "k", descriptor = "I")
    public static int field4923;

    @OriginalMember(owner = "client!pp", name = "l", descriptor = "I")
    private int field4924;

    @OriginalMember(owner = "client!pp", name = "o", descriptor = "I")
    private int field4927;

    @OriginalMember(owner = "client!pp", name = "p", descriptor = "I")
    private int field4928;

    @OriginalMember(owner = "client!pp", name = "q", descriptor = "I")
    public int field4929;

    @OriginalMember(owner = "client!pp", name = "r", descriptor = "I")
    private int field4930;

    @OriginalMember(owner = "client!pp", name = "t", descriptor = "I")
    private int field4932;

    @OriginalMember(owner = "client!pp", name = "v", descriptor = "I")
    private int field4934;

    @OriginalMember(owner = "client!pp", name = "x", descriptor = "I")
    public int field4936;

    @OriginalMember(owner = "client!pp", name = "y", descriptor = "I")
    private int field4937;

    @OriginalMember(owner = "client!pp", name = "z", descriptor = "I")
    private int field4938;

    @OriginalMember(owner = "client!pp", name = "A", descriptor = "I")
    public int field4939;

    @OriginalMember(owner = "client!pp", name = "C", descriptor = "I")
    private int field4941;

    @OriginalMember(owner = "client!pp", name = "D", descriptor = "I")
    public static int field4942;

    @OriginalMember(owner = "client!pp", name = "G", descriptor = "I")
    public static int field4944;

    @OriginalMember(owner = "client!pp", name = "I", descriptor = "I")
    private int field4946;

    @OriginalMember(owner = "client!pp", name = "J", descriptor = "I")
    private int field4947;

    @OriginalMember(owner = "client!pp", name = "L", descriptor = "I")
    public static int field4948;

    @OriginalMember(owner = "client!pp", name = "M", descriptor = "I")
    private int field4949;

    @OriginalMember(owner = "client!pp", name = "N", descriptor = "I")
    private int field4950;

    @OriginalMember(owner = "client!pp", name = "O", descriptor = "I")
    private int field4951;

    @OriginalMember(owner = "client!pp", name = "R", descriptor = "I")
    private int field4954;

    @OriginalMember(owner = "client!pp", name = "P", descriptor = "Las;")
    public static class17 field4952;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(JB)V")
    public final void method2210(long arg0, byte arg1) {
        for (class341 var4 = (class341) this.field4943.method2122(0); var4 != null; var4 = (class341) this.field4943.method2129(92)) {
            var4.method2011(arg0);
        }
        field4923++;
        if (arg1 > -49) {
            this.method2212(99, null, false, -74, -15L);
        }
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(I)V")
    public final void method2211(int arg0) {
        this.field4932 = this.field4926.field6902;
        this.field4938 = this.field4926.field6908;
        this.field4950 = this.field4926.field6913;
        this.field4934 = this.field4926.field6906;
        this.field4927 = this.field4926.field6905;
        this.field4946 = this.field4926.field6923;
        this.field4930 = this.field4926.field6910;
        this.field4954 = this.field4926.field6907;
        field4942++;
        this.field4947 = this.field4926.field6911;
        if (this.field4950 == this.field4938 && this.field4950 == this.field4947 && this.field4932 == this.field4930 && this.field4946 == this.field4932 && this.field4954 == this.field4934 && this.field4934 == this.field4927) {
            this.field4940 = true;
            return;
        }
        this.field4940 = false;
        int var2 = (this.field4938 + this.field4950 + this.field4947) / 3;
        int var3 = (this.field4946 + this.field4932 + this.field4930) / 3;
        if (arg0 <= 90) {
            return;
        }
        int var4 = (this.field4934 + this.field4927 + this.field4954) / 3;
        if (this.field4929 == var2 && this.field4922 == var3 && this.field4939 == var4) {
            return;
        }
        this.field4939 = var4;
        this.field4929 = var2;
        this.field4922 = var3;
        int var5 = this.field4950 - this.field4938;
        int var6 = this.field4932 - this.field4930;
        int var7 = this.field4934 - this.field4954;
        int var8 = this.field4947 - this.field4938;
        int var9 = this.field4946 - this.field4930;
        int var10 = this.field4927 - this.field4954;
        this.field4924 = var5 * var9 - (var6 * var8);
        this.field4921 = var6 * var10 - (var7 * var9);
        this.field4951 = var7 * var8 - var5 * var10;
        while (this.field4921 > 32767 || this.field4951 > 32767 || this.field4924 > 32767 || this.field4921 < -32767 || this.field4951 < -32767 || this.field4924 < -32767) {
            this.field4951 >>= 0x1;
            this.field4921 >>= 0x1;
            this.field4924 >>= 0x1;
        }
        int var11 = (int) Math.sqrt((double) (this.field4921 * this.field4921 + this.field4951 * this.field4951 + this.field4924 * this.field4924));
        if (var11 <= 0) {
            var11 = 1;
        }
        this.field4921 = this.field4921 * 32767 / var11;
        this.field4951 = this.field4951 * 32767 / var11;
        this.field4924 = this.field4924 * 32767 / var11;
        if (this.field4935.field3760 <= 0 && this.field4935.field3766 <= 0) {
            return;
        }
        int var12 = (int) (Math.atan2((double) this.field4924, (double) this.field4921) * 2607.5945876176133D);
        int var13 = (int) (Math.atan2((double) this.field4951, Math.sqrt((double) (this.field4924 * this.field4924 + this.field4921 * this.field4921))) * 2607.5945876176133D);
        this.field4941 = this.field4935.field3760 - this.field4935.field3794;
        this.field4928 = this.field4935.field3766 - this.field4935.field3740;
        this.field4937 = var12 + this.field4935.field3794 - (this.field4941 >> 1);
        this.field4949 = this.field4935.field3740 + var13 - (this.field4928 >> 1);
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(ILqa;ZIJ)V")
    public final void method2212(int arg0, class129 arg1, boolean arg2, int arg3, long arg4) {
        if (this.field4933) {
            arg2 = false;
        } else if (this.field4935.field3738 > class358.field4604) {
            arg2 = false;
        } else if (class408.field5467[class358.field4604] < class368.field4732) {
            arg2 = false;
        } else if (this.field4940) {
            arg2 = false;
        } else if (this.field4935.field3748 != -1) {
            int var7 = (int) (arg4 - this.field4953);
            if (this.field4935.field3739 || var7 <= this.field4935.field3748) {
                var7 %= this.field4935.field3748;
            } else {
                arg2 = false;
            }
            if (!this.field4935.field3728 && var7 < this.field4935.field3771) {
                arg2 = false;
            }
            if (this.field4935.field3728 && var7 >= this.field4935.field3771) {
                arg2 = false;
            }
        }
        if (arg0 != -31027) {
            this.method2211(122);
        }
        field4944++;
        if (arg2) {
            this.field4925 += (int) ((double) arg3 * ((double) this.field4935.field3782 + (double) (this.field4935.field3787 - this.field4935.field3782) * Math.random()));
            if (this.field4925 > 63) {
                int var8 = this.field4925 >> 6;
                this.field4925 &= 0x3F;
                for (int var9 = 0; var9 < var8; var9++) {
                    int var10;
                    int var11;
                    int var12;
                    if (this.field4935.field3760 <= 0 && this.field4935.field3766 <= 0) {
                        var10 = this.field4924;
                        var11 = this.field4921;
                        var12 = this.field4951;
                    } else {
                        int var13 = (int) (Math.random() * (double) this.field4941) + this.field4937;
                        int var14 = var13 & 0x3FFF;
                        int var15 = class21.field385[var14];
                        int var16 = class21.field397[var14];
                        int var17 = (int) ((double) this.field4928 * Math.random()) + this.field4949;
                        int var18 = var17 & 0x1FFF;
                        int var19 = class21.field385[var18];
                        int var20 = class21.field397[var18];
                        byte var21 = 15;
                        var11 = var16 * var19 >> var21;
                        var12 = (var20 << 0) * -1;
                        var10 = var15 * var19 >> var21;
                    }
                    int var22 = (int) (Math.random() * 65535.0D);
                    int var23 = (int) (Math.random() * 65535.0D);
                    if (var22 + var23 > 65535) {
                        var23 = 65535 - var23;
                        var22 = 65535 - var22;
                    }
                    int var24 = 65535 - var22 - var23;
                    int var25 = this.field4950 * var23 + this.field4947 * var24 + this.field4938 * var22 >> 16;
                    int var26 = this.field4930 * var22 + this.field4946 * var24 + this.field4932 * var23 >> 16;
                    int var27 = this.field4927 * var24 + this.field4954 * var22 + this.field4934 * var23 >> 16;
                    int var28 = (int) (Math.random() * (double) (this.field4935.field3793 - this.field4935.field3768)) + this.field4935.field3768;
                    int var29 = (int) ((double) (this.field4935.field3786 - this.field4935.field3783) * Math.random()) + this.field4935.field3783;
                    int var30 = this.field4935.field3737 + ((int) ((double) (this.field4935.field3747 - this.field4935.field3737) * Math.random()));
                    int var33;
                    if (this.field4935.field3797) {
                        double var31 = Math.random();
                        var33 = (int) ((double) this.field4935.field3791 * Math.random() + (double) this.field4935.field3799) << 24 | (int) ((double) this.field4935.field3776 * var31 + (double) this.field4935.field3772) | (int) ((double) this.field4935.field3795 * var31 + (double) this.field4935.field3790) << 8 | (int) ((double) this.field4935.field3774 * var31 + (double) this.field4935.field3788) << 16;
                    } else {
                        var33 = (int) ((double) this.field4935.field3772 + (double) this.field4935.field3776 * Math.random()) | (int) ((double) this.field4935.field3788 + Math.random() * (double) this.field4935.field3774) << 16 | (int) (Math.random() * (double) this.field4935.field3795 + (double) this.field4935.field3790) << 8 | (int) ((double) this.field4935.field3799 + Math.random() * (double) this.field4935.field3791) << 24;
                    }
                    int var34 = this.field4935.field3757;
                    if (!arg1.method884() && !this.field4935.field3744) {
                        var34 = -1;
                    }
                    if (class366.field4709 == class14.field239) {
                        new class341(this, var25, var26, var27, var11, var12, var10, var28, var29, var33, var30, var34, this.field4935.field3784, this.field4935.field3751);
                    } else {
                        class341 var36 = class519.field7676[class366.field4709];
                        class366.field4709 = class366.field4709 + 1 & 0x3FF;
                        var36.method2007(this, var25, var26, var27, var11, var12, var10, var28, var29, var33, var30, var34, this.field4935.field3784, this.field4935.field3751);
                    }
                }
            }
        }
        this.field4936 = 0;
        for (class341 var37 = (class341) this.field4943.method2122(0); var37 != null; var37 = (class341) this.field4943.method2129(75)) {
            var37.method2010(arg4, arg3);
            this.field4936++;
        }
        class77.field983 += this.field4936;
    }

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "(B)V")
    public static void method2213(byte arg0) {
        field4952 = null;
        int var1 = 105 / ((4 - arg0) / 35);
        field4955 = null;
        field4945 = null;
    }

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lqa;Lsm;Lwp;J)V")
    public class380(class129 arg0, class473 arg1, class330 arg2, long arg3) {
        this.field4926 = arg1;
        this.field4931 = arg2;
        this.field4953 = arg3;
        this.field4935 = this.field4926.method2837(-27472);
        if (!arg0.method884() && this.field4935.field3755 != -1) {
            this.field4935 = class151.method1042(this.field4935.field3755, 0);
        }
        this.field4943 = new class362();
        this.field4925 = (int) ((double) this.field4925 + Math.random() * 64.0D);
        this.method2211(93);
    }
}
