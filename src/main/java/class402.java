import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public class class402 extends class409 {

    @OriginalMember(owner = "client!pu", name = "k", descriptor = "Z")
    private boolean field5695 = false;

    @OriginalMember(owner = "client!pu", name = "x", descriptor = "I")
    private int field5708 = 0;

    @OriginalMember(owner = "client!pu", name = "C", descriptor = "Z")
    public boolean field5713 = false;

    @OriginalMember(owner = "client!pu", name = "u", descriptor = "J")
    private long field5705;

    @OriginalMember(owner = "client!pu", name = "y", descriptor = "Luh;")
    public class115 field5709;

    @OriginalMember(owner = "client!pu", name = "K", descriptor = "Leh;")
    public class248 field5721;

    @OriginalMember(owner = "client!pu", name = "J", descriptor = "Lob;")
    public class529 field5720;

    @OriginalMember(owner = "client!pu", name = "q", descriptor = "Lwp;")
    public class122 field5701;

    @OriginalMember(owner = "client!pu", name = "g", descriptor = "I")
    public int field5691;

    @OriginalMember(owner = "client!pu", name = "h", descriptor = "I")
    public int field5692;

    @OriginalMember(owner = "client!pu", name = "i", descriptor = "I")
    private int field5693;

    @OriginalMember(owner = "client!pu", name = "j", descriptor = "I")
    private int field5694;

    @OriginalMember(owner = "client!pu", name = "l", descriptor = "I")
    private int field5696;

    @OriginalMember(owner = "client!pu", name = "m", descriptor = "I")
    public int field5697;

    @OriginalMember(owner = "client!pu", name = "n", descriptor = "I")
    private int field5698;

    @OriginalMember(owner = "client!pu", name = "o", descriptor = "I")
    public static int field5699;

    @OriginalMember(owner = "client!pu", name = "p", descriptor = "I")
    public static int field5700;

    @OriginalMember(owner = "client!pu", name = "r", descriptor = "I")
    private int field5702;

    @OriginalMember(owner = "client!pu", name = "s", descriptor = "I")
    public int field5703;

    @OriginalMember(owner = "client!pu", name = "t", descriptor = "I")
    private int field5704;

    @OriginalMember(owner = "client!pu", name = "v", descriptor = "I")
    private int field5706;

    @OriginalMember(owner = "client!pu", name = "w", descriptor = "I")
    public static int field5707;

    @OriginalMember(owner = "client!pu", name = "z", descriptor = "I")
    private int field5710;

    @OriginalMember(owner = "client!pu", name = "B", descriptor = "I")
    public static int field5712;

    @OriginalMember(owner = "client!pu", name = "D", descriptor = "I")
    private int field5714;

    @OriginalMember(owner = "client!pu", name = "E", descriptor = "I")
    private int field5715;

    @OriginalMember(owner = "client!pu", name = "F", descriptor = "I")
    private int field5716;

    @OriginalMember(owner = "client!pu", name = "G", descriptor = "I")
    private int field5717;

    @OriginalMember(owner = "client!pu", name = "H", descriptor = "I")
    private int field5718;

    @OriginalMember(owner = "client!pu", name = "I", descriptor = "I")
    private int field5719;

    @OriginalMember(owner = "client!pu", name = "L", descriptor = "I")
    private int field5722;

    @OriginalMember(owner = "client!pu", name = "M", descriptor = "I")
    private int field5723;

    @OriginalMember(owner = "client!pu", name = "A", descriptor = "Ll;")
    public static class16 field5711;

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(BLqa;J)V")
    public final void method2402(byte arg0, class167 arg1, long arg2) {
        int var5 = 87 % ((-arg0 - 56) / 51);
        for (class308 var6 = (class308) this.field5701.method904(false); var6 != null; var6 = (class308) this.field5701.method907(-1)) {
            var6.method1966(arg1, arg2);
        }
        field5712++;
    }

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(I)V")
    public final void method2403(int arg0) {
        this.field5706 = this.field5721.field3699;
        field5707++;
        this.field5723 = this.field5721.field3707;
        this.field5698 = this.field5721.field3702;
        this.field5710 = this.field5721.field3700;
        this.field5715 = this.field5721.field3706;
        this.field5702 = this.field5721.field3705;
        this.field5716 = this.field5721.field3709;
        this.field5718 = this.field5721.field3716;
        this.field5696 = this.field5721.field3701;
        if (this.field5710 == this.field5702 && this.field5718 == this.field5702 && this.field5715 == this.field5698 && this.field5715 == this.field5696 && this.field5716 == this.field5706 && this.field5723 == this.field5706) {
            this.field5695 = true;
            return;
        }
        this.field5695 = false;
        int var2 = (this.field5718 + this.field5710 + this.field5702) / arg0;
        int var3 = (this.field5715 + this.field5696 + this.field5698) / 3;
        int var4 = (this.field5716 + this.field5706 + this.field5723) / 3;
        if (this.field5691 == var2 && this.field5697 == var3 && this.field5692 == var4) {
            return;
        }
        this.field5692 = var4;
        this.field5691 = var2;
        this.field5697 = var3;
        int var5 = this.field5702 - this.field5710;
        int var6 = this.field5715 - this.field5698;
        int var7 = this.field5706 - this.field5716;
        int var8 = this.field5718 - this.field5710;
        int var9 = this.field5696 - this.field5698;
        int var10 = this.field5723 - this.field5716;
        this.field5704 = var6 * var10 - (var7 * var9);
        this.field5719 = var5 * var9 - (var6 * var8);
        for (this.field5722 = var7 * var8 - (var5 * var10); this.field5704 > 32767 || this.field5722 > 32767 || this.field5719 > 32767 || this.field5704 < -32767 || this.field5722 < -32767 || this.field5719 < -32767; this.field5722 >>= 0x1) {
            this.field5719 >>= 0x1;
            this.field5704 >>= 0x1;
        }
        int var11 = (int) Math.sqrt((double) (this.field5722 * this.field5722 + this.field5719 * this.field5719 + this.field5704 * this.field5704));
        if (var11 <= 0) {
            var11 = 1;
        }
        this.field5704 = this.field5704 * 32767 / var11;
        this.field5722 = this.field5722 * 32767 / var11;
        this.field5719 = this.field5719 * 32767 / var11;
        if (this.field5720.field7763 <= 0 && this.field5720.field7793 <= 0) {
            return;
        }
        int var12 = (int) (Math.atan2((double) this.field5719, (double) this.field5704) * 2607.5945876176133D);
        int var13 = (int) (Math.atan2((double) this.field5722, Math.sqrt((double) (this.field5719 * this.field5719 + this.field5704 * this.field5704))) * 2607.5945876176133D);
        this.field5714 = this.field5720.field7763 - this.field5720.field7744;
        this.field5694 = this.field5720.field7793 - this.field5720.field7734;
        this.field5717 = var12 + this.field5720.field7744 - (this.field5714 >> 1);
        this.field5693 = var13 + this.field5720.field7734 - (this.field5694 >> 1);
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(JZILqa;I)V")
    public final void method2404(long arg0, boolean arg1, int arg2, class167 arg3, int arg4) {
        if (this.field5713) {
            arg1 = false;
        } else if (this.field5720.field7766 > class248.field3711) {
            arg1 = false;
        } else if (class51.field942 > class447.field6392[class248.field3711]) {
            arg1 = false;
        } else if (this.field5695) {
            arg1 = false;
        } else if (this.field5720.field7785 != -1) {
            int var7 = (int) (arg0 - this.field5705);
            if (this.field5720.field7784 || this.field5720.field7785 >= var7) {
                var7 %= this.field5720.field7785;
            } else {
                arg1 = false;
            }
            if (!this.field5720.field7765 && var7 < this.field5720.field7736) {
                arg1 = false;
            }
            if (this.field5720.field7765 && var7 >= this.field5720.field7736) {
                arg1 = false;
            }
        }
        field5699++;
        if (arg1) {
            this.field5708 += (int) (((double) this.field5720.field7782 + Math.random() * (double) (this.field5720.field7738 - this.field5720.field7782)) * (double) arg2);
            if (this.field5708 > 63) {
                int var8 = this.field5708 >> 6;
                this.field5708 &= 0x3F;
                for (int var9 = 0; var9 < var8; var9++) {
                    int var10;
                    int var11;
                    int var12;
                    if (this.field5720.field7763 <= 0 && this.field5720.field7793 <= 0) {
                        var10 = this.field5722;
                        var11 = this.field5719;
                        var12 = this.field5704;
                    } else {
                        int var13 = (int) (Math.random() * (double) this.field5714) + this.field5717;
                        int var14 = var13 & 0x3FFF;
                        int var15 = class358.field5204[var14];
                        int var16 = class358.field5203[var14];
                        int var17 = this.field5693 + ((int) (Math.random() * (double) this.field5694));
                        int var18 = var17 & 0x1FFF;
                        int var19 = class358.field5204[var18];
                        int var20 = class358.field5203[var18];
                        byte var21 = 15;
                        var10 = (var20 << 0) * -1;
                        var12 = var16 * var19 >> var21;
                        var11 = var15 * var19 >> var21;
                    }
                    int var22 = (int) (Math.random() * 65535.0D);
                    int var23 = (int) (Math.random() * 65535.0D);
                    if (var22 + var23 > 65535) {
                        var23 = 65535 - var23;
                        var22 = 65535 - var22;
                    }
                    int var24 = 65535 - var23 - var22;
                    int var25 = (int) ((long) this.field5710 * (long) var22 + (long) this.field5718 * (long) var24 + (long) this.field5702 * (long) var23 >> 16);
                    int var26 = (int) ((long) this.field5696 * (long) var24 + (long) this.field5715 * (long) var23 + (long) this.field5698 * (long) var22 >> 16);
                    int var27 = (int) ((long) this.field5723 * (long) var24 + (long) this.field5716 * (long) var22 + (long) this.field5706 * (long) var23 >> 16);
                    int var28 = (int) ((double) (this.field5720.field7776 - this.field5720.field7768) * Math.random()) + this.field5720.field7768;
                    int var29 = (int) ((double) (this.field5720.field7780 - this.field5720.field7764) * Math.random()) + this.field5720.field7764;
                    int var30 = this.field5720.field7762 + ((int) ((double) (this.field5720.field7728 - this.field5720.field7762) * Math.random()));
                    int var33;
                    if (this.field5720.field7772) {
                        double var31 = Math.random();
                        var33 = (int) ((double) this.field5720.field7775 * Math.random() + (double) this.field5720.field7755) << 24 | (int) ((double) this.field5720.field7745 * var31 + (double) this.field5720.field7761) << 8 | (int) ((double) this.field5720.field7758 * var31 + (double) this.field5720.field7739) << 16 | (int) ((double) this.field5720.field7751 * var31 + (double) this.field5720.field7746);
                    } else {
                        var33 = (int) ((double) this.field5720.field7755 + Math.random() * (double) this.field5720.field7775) << 24 | (int) ((double) this.field5720.field7761 + Math.random() * (double) this.field5720.field7745) << 8 | (int) ((double) this.field5720.field7758 * Math.random() + (double) this.field5720.field7739) << 16 | (int) ((double) this.field5720.field7746 + (double) this.field5720.field7751 * Math.random());
                    }
                    int var34 = this.field5720.field7749;
                    if (!arg3.method340() && !this.field5720.field7789) {
                        var34 = -1;
                    }
                    if (class540.field7951 == class452.field6604) {
                        new class308(this, var25, var26, var27, var12, var10, var11, var28, var29, var33, var30, var34, this.field5720.field7795, this.field5720.field7733);
                    } else {
                        class308 var36 = class4.field21[class452.field6604];
                        class452.field6604 = class452.field6604 + 1 & 0x3FF;
                        var36.method1962(this, var25, var26, var27, var12, var10, var11, var28, var29, var33, var30, var34, this.field5720.field7795, this.field5720.field7733);
                    }
                }
            }
        }
        this.field5703 = 0;
        int var37 = 0 % ((arg4 - 93) / 33);
        for (class308 var38 = (class308) this.field5701.method904(false); var38 != null; var38 = (class308) this.field5701.method907(-1)) {
            var38.method1965(arg0, arg2);
            this.field5703++;
        }
        class196.field2870 += this.field5703;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(B)V")
    public static void method2405(byte arg0) {
        field5711 = null;
        if (arg0 <= 17) {
            field5711 = null;
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IIILul;IZ)Ljava/awt/Frame;")
    public static final Frame method2406(int arg0, int arg1, int arg2, class411 arg3, int arg4, boolean arg5) {
        if (arg5) {
            return null;
        }
        field5700++;
        if (!arg3.method2442(100)) {
            return null;
        }
        if (arg1 == 0) {
            class384[] var6 = class263.method1704((byte) 123, arg3);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field5492 == arg0 && var6[var8].field5491 == arg2 && (arg4 == 0 || var6[var8].field5493 == arg4) && (!var7 || var6[var8].field5490 > arg1)) {
                    var7 = true;
                    arg1 = var6[var8].field5490;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class81 var9 = arg3.method2455(arg2, arg4, -1732491344, arg1, arg0);
        while (var9.field1314 == 0) {
            class477.method2826(10L, 0);
        }
        Frame var10 = (Frame) var9.field1311;
        if (var10 == null) {
            return null;
        } else if (var9.field1314 == 2) {
            class474.method2815(false, var10, arg3);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(Lqa;Leh;Luh;J)V")
    public class402(class167 arg0, class248 arg1, class115 arg2, long arg3) {
        this.field5705 = arg3;
        this.field5709 = arg2;
        this.field5721 = arg1;
        this.field5720 = this.field5721.method1619(false);
        if (!arg0.method340() && this.field5720.field7726 != -1) {
            this.field5720 = class479.method2833(4096, this.field5720.field7726);
        }
        this.field5701 = new class122();
        this.field5708 = (int) ((double) this.field5708 + Math.random() * 64.0D);
        this.method2403(3);
    }
}
