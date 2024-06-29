import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class252 extends class105 {

    @OriginalMember(owner = "client!ol", name = "G", descriptor = "Lqp;")
    public static class586 field3679 = new class586(84, 3);

    @OriginalMember(owner = "client!ol", name = "O", descriptor = "Lnj;")
    public static class487 field3687;

    @OriginalMember(owner = "client!ol", name = "j", descriptor = "F")
    public float field3656;

    @OriginalMember(owner = "client!ol", name = "l", descriptor = "F")
    public float field3658;

    @OriginalMember(owner = "client!ol", name = "p", descriptor = "F")
    public float field3662;

    @OriginalMember(owner = "client!ol", name = "r", descriptor = "F")
    public float field3664;

    @OriginalMember(owner = "client!ol", name = "w", descriptor = "F")
    public float field3669;

    @OriginalMember(owner = "client!ol", name = "y", descriptor = "F")
    public float field3671;

    @OriginalMember(owner = "client!ol", name = "z", descriptor = "F")
    public float field3672;

    @OriginalMember(owner = "client!ol", name = "D", descriptor = "F")
    public float field3676;

    @OriginalMember(owner = "client!ol", name = "F", descriptor = "F")
    public float field3678;

    @OriginalMember(owner = "client!ol", name = "I", descriptor = "F")
    public float field3681;

    @OriginalMember(owner = "client!ol", name = "L", descriptor = "F")
    public float field3684;

    @OriginalMember(owner = "client!ol", name = "M", descriptor = "F")
    public float field3685;

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "I")
    public static int field3655;

    @OriginalMember(owner = "client!ol", name = "k", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!ol", name = "m", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!ol", name = "n", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!ol", name = "o", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!ol", name = "q", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!ol", name = "s", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!ol", name = "t", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!ol", name = "u", descriptor = "I")
    public static int field3667;

    @OriginalMember(owner = "client!ol", name = "v", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!ol", name = "x", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!ol", name = "A", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!ol", name = "B", descriptor = "I")
    public static int field3674;

    @OriginalMember(owner = "client!ol", name = "C", descriptor = "I")
    public static int field3675;

    @OriginalMember(owner = "client!ol", name = "E", descriptor = "I")
    public static int field3677;

    @OriginalMember(owner = "client!ol", name = "H", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!ol", name = "J", descriptor = "I")
    public static int field3682;

    @OriginalMember(owner = "client!ol", name = "K", descriptor = "I")
    public static int field3683;

    @OriginalMember(owner = "client!ol", name = "N", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!ol", name = "Q", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!ol", name = "P", descriptor = "Luf;")
    public static class353 field3688;

    static {
        new class145("", 73);
        field3687 = new class487(" more options", " weitere Optionen", " autres options", " mais opções");
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)[F", line = 3)
    public final float[] method1594(int arg0) {
        class489.field7404[9] = this.field3662;
        class489.field7404[14] = this.field3678;
        class489.field7404[8] = this.field3676;
        class489.field7404[0] = this.field3669;
        class489.field7404[5] = this.field3681;
        class489.field7404[2] = this.field3671;
        class489.field7404[12] = this.field3664;
        field3674++;
        class489.field7404[1] = this.field3656;
        class489.field7404[13] = this.field3684;
        class489.field7404[10] = this.field3672;
        class489.field7404[4] = this.field3658;
        class489.field7404[6] = this.field3685;
        int var2 = -16 % ((arg0 - 15) / 40);
        return class489.field7404;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(III[I)V", line = 26)
    public final void method617(int arg0, int arg1, int arg2, int[] arg3) {
        field3680++;
        arg3[0] = (int) ((float) arg2 * this.field3676 + (float) arg0 * this.field3669 + (float) arg1 * this.field3658 + this.field3664);
        arg3[2] = (int) ((float) arg2 * this.field3672 + (float) arg0 * this.field3671 + (float) arg1 * this.field3685 + this.field3678);
        arg3[1] = (int) ((float) arg2 * this.field3662 + (float) arg0 * this.field3656 + (float) arg1 * this.field3681 + this.field3684);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IFIIIFF)V", line = 38)
    public final void method1595(int arg0, float arg1, int arg2, int arg3, int arg4, float arg5, float arg6) {
        if (arg2 == 0) {
            this.field3672 = 1.0F;
            this.field3681 = arg4;
            this.field3656 = this.field3671 = this.field3658 = this.field3685 = this.field3676 = this.field3662 = 0.0F;
            this.field3669 = arg3;
        } else {
            float var8 = class280.field4164[arg2 & 0x3FFF];
            float var9 = class280.field4165[arg2 & 0x3FFF];
            this.field3656 = (float) arg3 * var9;
            this.field3671 = this.field3685 = this.field3676 = this.field3662 = 0.0F;
            this.field3669 = (float) arg3 * var8;
            this.field3672 = 1.0F;
            this.field3681 = (float) arg4 * var8;
            this.field3658 = (float) arg4 * -var9;
        }
        field3661++;
        this.field3678 = arg1;
        if (arg0 > -115) {
            this.field3676 = -1.2172261F;
        }
        this.field3684 = arg5;
        this.field3664 = arg6;
    }

    @OriginalMember(owner = "client!ol", name = "k", descriptor = "(I)V", line = 72)
    public final void method611(int arg0) {
        field3667++;
        float var2 = class280.field4164[arg0 & 0x3FFF];
        float var3 = class280.field4165[arg0 & 0x3FFF];
        float var4 = this.field3656;
        float var5 = this.field3681;
        float var6 = this.field3662;
        float var7 = this.field3684;
        this.field3656 = var2 * var4 - this.field3671 * var3;
        this.field3681 = var2 * var5 - (this.field3685 * var3);
        this.field3671 = this.field3671 * var2 + var3 * var4;
        this.field3685 = this.field3685 * var2 + var3 * var5;
        this.field3662 = var2 * var6 - (this.field3672 * var3);
        this.field3684 = var2 * var7 - (this.field3678 * var3);
        this.field3672 = this.field3672 * var2 + var3 * var6;
        this.field3678 = this.field3678 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!ol", name = "KA", descriptor = "(I)V", line = 99)
    public final void method621(int arg0) {
        this.field3669 = 1.0F;
        field3657++;
        this.field3681 = this.field3672 = class280.field4164[arg0 & 0x3FFF];
        this.field3685 = class280.field4165[arg0 & 0x3FFF];
        this.field3658 = this.field3676 = this.field3664 = this.field3656 = this.field3684 = this.field3671 = this.field3678 = 0.0F;
        this.field3662 = -this.field3685;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lm;I)V", line = 111)
    public final void method1596(class105 arg0, int arg1) {
        if (arg1 != 2) {
            this.field3681 = 0.15241116F;
        }
        field3668++;
        class252 var3 = (class252) arg0;
        this.field3658 = var3.field3656;
        this.field3676 = var3.field3671;
        this.field3669 = var3.field3669;
        this.field3681 = var3.field3681;
        this.field3662 = var3.field3685;
        this.field3656 = var3.field3658;
        this.field3671 = var3.field3676;
        this.field3685 = var3.field3662;
        this.field3664 = -(this.field3676 * var3.field3678 + this.field3669 * var3.field3664 + this.field3658 * var3.field3684);
        this.field3672 = var3.field3672;
        this.field3684 = -(this.field3662 * var3.field3678 + this.field3681 * var3.field3684 + this.field3656 * var3.field3664);
        this.field3678 = -(this.field3672 * var3.field3678 + this.field3685 * var3.field3684 + this.field3671 * var3.field3664);
    }

    @OriginalMember(owner = "client!ol", name = "I", descriptor = "(III[I)V", line = 142)
    public final void method612(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[1] = (int) ((float) arg2 * this.field3662 + (float) arg0 * this.field3656 + (float) arg1 * this.field3681);
        field3665++;
        arg3[0] = (int) ((float) arg2 * this.field3676 + (float) arg0 * this.field3669 + (float) arg1 * this.field3658);
        arg3[2] = (int) ((float) arg2 * this.field3672 + (float) arg0 * this.field3671 + (float) arg1 * this.field3685);
    }

    @OriginalMember(owner = "client!ol", name = "ma", descriptor = "(I)V", line = 153)
    public final void method622(int arg0) {
        field3682++;
        this.field3681 = 1.0F;
        this.field3669 = this.field3672 = class280.field4164[arg0 & 0x3FFF];
        this.field3676 = class280.field4165[arg0 & 0x3FFF];
        this.field3671 = -this.field3676;
        this.field3658 = this.field3664 = this.field3656 = this.field3662 = this.field3684 = this.field3685 = this.field3678 = 0.0F;
    }

    @OriginalMember(owner = "client!ol", name = "B", descriptor = "(IIIIII)V", line = 166)
    public final void method608(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3675++;
        float var7 = class280.field4164[arg3 & 0x3FFF];
        float var8 = class280.field4165[arg3 & 0x3FFF];
        float var9 = class280.field4164[arg4 & 0x3FFF];
        float var10 = class280.field4165[arg4 & 0x3FFF];
        float var11 = class280.field4164[arg5 & 0x3FFF];
        float var12 = class280.field4165[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field3656 = -var9 * var12 + var10 * var13;
        this.field3685 = -var8;
        this.field3669 = var9 * var11 + var10 * var14;
        this.field3662 = var9 * var13 + var10 * var12;
        this.field3676 = -var10 * var11 + var9 * var14;
        this.field3671 = var7 * var10;
        this.field3672 = var7 * var9;
        this.field3681 = var7 * var11;
        this.field3658 = var7 * var12;
        this.field3684 = (float) (-arg0) * this.field3656 - (float) arg1 * this.field3681 - ((float) arg2 * this.field3662);
        this.field3664 = (float) (-arg0) * this.field3669 - (float) arg1 * this.field3658 - (float) arg2 * this.field3676;
        this.field3678 = (float) (-arg0) * this.field3671 - ((float) arg1 * this.field3685) - (float) arg2 * this.field3672;
    }

    @OriginalMember(owner = "client!ol", name = "XA", descriptor = "(I)V", line = 201)
    public final void method616(int arg0) {
        field3663++;
        float var2 = class280.field4164[arg0 & 0x3FFF];
        float var3 = class280.field4165[arg0 & 0x3FFF];
        float var4 = this.field3669;
        float var5 = this.field3658;
        float var6 = this.field3676;
        float var7 = this.field3664;
        this.field3669 = this.field3671 * var3 + var2 * var4;
        this.field3658 = this.field3685 * var3 + var2 * var5;
        this.field3671 = this.field3671 * var2 - var3 * var4;
        this.field3676 = this.field3672 * var3 + var2 * var6;
        this.field3685 = this.field3685 * var2 - var3 * var5;
        this.field3664 = this.field3678 * var3 + var2 * var7;
        this.field3672 = this.field3672 * var2 - var3 * var6;
        this.field3678 = this.field3678 * var2 - var3 * var7;
    }

    @OriginalMember(owner = "client!ol", name = "TA", descriptor = "(III)V", line = 229)
    public final void method619(int arg0, int arg1, int arg2) {
        this.field3664 += arg0;
        this.field3678 += arg2;
        this.field3684 += arg1;
        field3683++;
    }

    @OriginalMember(owner = "client!ol", name = "va", descriptor = "([I)V", line = 241)
    public final void method605(int[] arg0) {
        field3659++;
        float var2 = (float) arg0[0] - this.field3664;
        float var3 = (float) arg0[1] - this.field3684;
        float var4 = (float) arg0[2] - this.field3678;
        arg0[2] = (int) (this.field3672 * var4 + this.field3676 * var2 + this.field3662 * var3);
        arg0[0] = (int) (this.field3671 * var4 + this.field3669 * var2 + this.field3656 * var3);
        arg0[1] = (int) (this.field3685 * var4 + this.field3681 * var3 + this.field3658 * var2);
    }

    @OriginalMember(owner = "client!ol", name = "ta", descriptor = "(I)V", line = 257)
    public final void method604(int arg0) {
        this.field3672 = 1.0F;
        field3677++;
        this.field3669 = this.field3681 = class280.field4164[arg0 & 0x3FFF];
        this.field3656 = class280.field4165[arg0 & 0x3FFF];
        this.field3676 = this.field3664 = this.field3662 = this.field3684 = this.field3671 = this.field3685 = this.field3678 = 0.0F;
        this.field3658 = -this.field3656;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "()Lm;", line = 272)
    public final class105 method609() {
        field3686++;
        class252 var1 = new class252();
        var1.field3681 = this.field3681;
        var1.field3662 = this.field3662;
        var1.field3671 = this.field3671;
        var1.field3656 = this.field3656;
        var1.field3658 = this.field3658;
        var1.field3685 = this.field3685;
        var1.field3676 = this.field3676;
        var1.field3672 = this.field3672;
        var1.field3669 = this.field3669;
        var1.field3664 = this.field3664;
        var1.field3684 = this.field3684;
        var1.field3678 = this.field3678;
        return var1;
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)[F", line = 299)
    public final float[] method1597(int arg0) {
        class489.field7404[8] = this.field3676;
        class489.field7404[12] = 0.0F;
        class489.field7404[0] = this.field3669;
        field3666++;
        class489.field7404[6] = this.field3685;
        class489.field7404[5] = this.field3681;
        class489.field7404[4] = this.field3658;
        class489.field7404[13] = 0.0F;
        class489.field7404[1] = this.field3656;
        class489.field7404[2] = this.field3671;
        class489.field7404[10] = this.field3672;
        if (arg0 != 84) {
            this.field3658 = 0.31919065F;
        }
        class489.field7404[14] = 0.0F;
        class489.field7404[9] = this.field3662;
        return class489.field7404;
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(I)V", line = 323)
    public static void method1598(int arg0) {
        if (arg0 != 0) {
            method1599(-76, 106);
        }
        field3688 = null;
        field3679 = null;
        field3687 = null;
    }

    @OriginalMember(owner = "client!ol", name = "ha", descriptor = "()V", line = 336)
    public final void method620() {
        this.field3669 = this.field3681 = this.field3672 = 1.0F;
        field3673++;
        this.field3656 = this.field3671 = this.field3658 = this.field3685 = this.field3676 = this.field3662 = this.field3664 = this.field3684 = this.field3678 = 0.0F;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(II)Lbj;", line = 355)
    public static final class440 method1599(int arg0, int arg1) {
        field3660++;
        if (arg1 != 73) {
            method1599(102, 122);
        }
        if (arg0 == 0) {
            if ((double) class113.field1426 == 3.0D) {
                return class292.field4277;
            }
            if ((double) class113.field1426 == 4.0D) {
                return class325.field4809;
            }
            if ((double) class113.field1426 == 6.0D) {
                return class576.field8507;
            }
            if ((double) class113.field1426 >= 8.0D) {
                return class328.field4851;
            }
        } else if (arg0 == 1) {
            if ((double) class113.field1426 == 3.0D) {
                return class576.field8507;
            }
            if ((double) class113.field1426 == 4.0D) {
                return class328.field4851;
            }
            if ((double) class113.field1426 == 6.0D) {
                return class71.field833;
            }
            if ((double) class113.field1426 >= 8.0D) {
                return class523.field7755;
            }
        } else if (arg0 == 2) {
            if ((double) class113.field1426 == 3.0D) {
                return class71.field833;
            }
            if ((double) class113.field1426 == 4.0D) {
                return class523.field7755;
            }
            if ((double) class113.field1426 == 6.0D) {
                return class150.field1925;
            }
            if ((double) class113.field1426 >= 8.0D) {
                return class377.field5543;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "()V", line = 429)
    public class252() {
        this.method620();
    }

    @OriginalMember(owner = "client!ol", name = "oa", descriptor = "(III)V", line = 437)
    public final void method613(int arg0, int arg1, int arg2) {
        this.field3669 = this.field3681 = this.field3672 = 1.0F;
        this.field3684 = arg1;
        this.field3664 = arg0;
        field3655++;
        this.field3656 = this.field3671 = this.field3658 = this.field3685 = this.field3676 = this.field3662 = 0.0F;
        this.field3678 = arg2;
    }

    @OriginalMember(owner = "client!ol", name = "EA", descriptor = "(Lm;)V", line = 455)
    public final void method618(class105 arg0) {
        field3670++;
        class252 var2 = (class252) arg0;
        this.field3676 = var2.field3676;
        this.field3672 = var2.field3672;
        this.field3684 = var2.field3684;
        this.field3658 = var2.field3658;
        this.field3664 = var2.field3664;
        this.field3656 = var2.field3656;
        this.field3678 = var2.field3678;
        this.field3662 = var2.field3662;
        this.field3671 = var2.field3671;
        this.field3685 = var2.field3685;
        this.field3669 = var2.field3669;
        this.field3681 = var2.field3681;
    }
}
