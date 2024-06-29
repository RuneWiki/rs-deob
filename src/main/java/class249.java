import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class249 extends class105 {

    @OriginalMember(owner = "client!ol", name = "j", descriptor = "F")
    public float field3619;

    @OriginalMember(owner = "client!ol", name = "m", descriptor = "F")
    public float field3622;

    @OriginalMember(owner = "client!ol", name = "o", descriptor = "F")
    public float field3624;

    @OriginalMember(owner = "client!ol", name = "r", descriptor = "F")
    public float field3627;

    @OriginalMember(owner = "client!ol", name = "s", descriptor = "F")
    public float field3628;

    @OriginalMember(owner = "client!ol", name = "t", descriptor = "F")
    public float field3629;

    @OriginalMember(owner = "client!ol", name = "u", descriptor = "F")
    public float field3630;

    @OriginalMember(owner = "client!ol", name = "w", descriptor = "F")
    public float field3632;

    @OriginalMember(owner = "client!ol", name = "x", descriptor = "F")
    public float field3633;

    @OriginalMember(owner = "client!ol", name = "C", descriptor = "F")
    public float field3638;

    @OriginalMember(owner = "client!ol", name = "I", descriptor = "F")
    public float field3643;

    @OriginalMember(owner = "client!ol", name = "N", descriptor = "F")
    public float field3648;

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!ol", name = "k", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!ol", name = "l", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!ol", name = "n", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!ol", name = "p", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!ol", name = "q", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!ol", name = "v", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!ol", name = "z", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!ol", name = "A", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!ol", name = "B", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!ol", name = "D", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!ol", name = "E", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!ol", name = "G", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!ol", name = "H", descriptor = "I")
    public static int field3642;

    @OriginalMember(owner = "client!ol", name = "J", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!ol", name = "K", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!ol", name = "L", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!ol", name = "M", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!ol", name = "P", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!ol", name = "Q", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!ol", name = "y", descriptor = "Lqk;")
    public static class12 field3634;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ILm;)V")
    public final void method1575(int arg0, class105 arg1) {
        field3635++;
        class249 var3 = (class249) arg1;
        this.field3630 = var3.field3630;
        this.field3643 = var3.field3624;
        this.field3648 = var3.field3633;
        this.field3624 = var3.field3643;
        this.field3633 = var3.field3648;
        this.field3622 = var3.field3638;
        this.field3627 = var3.field3627;
        this.field3638 = var3.field3622;
        this.field3632 = var3.field3632;
        this.field3629 = -(this.field3648 * var3.field3628 + this.field3643 * var3.field3619 + this.field3630 * var3.field3629);
        this.field3619 = -(this.field3622 * var3.field3628 + this.field3627 * var3.field3619 + this.field3624 * var3.field3629);
        if (arg0 != 2) {
            this.method1578(-43);
        }
        this.field3628 = -(this.field3632 * var3.field3628 + this.field3638 * var3.field3619 + this.field3633 * var3.field3629);
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)V")
    public static void method1576(int arg0) {
        field3634 = null;
        if (arg0 >= -56) {
            field3634 = null;
        }
    }

    @OriginalMember(owner = "client!ol", name = "KA", descriptor = "(I)V")
    public final void method881(int arg0) {
        this.field3630 = 1.0F;
        field3644++;
        this.field3627 = this.field3632 = class459.field6614[arg0 & 0x3FFF];
        this.field3638 = class459.field6606[arg0 & 0x3FFF];
        this.field3643 = this.field3648 = this.field3629 = this.field3624 = this.field3619 = this.field3633 = this.field3628 = 0.0F;
        this.field3622 = -this.field3638;
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(B)[F")
    public final float[] method1577(byte arg0) {
        class473.field6786[9] = this.field3622;
        class473.field6786[12] = this.field3629;
        class473.field6786[2] = this.field3633;
        field3626++;
        class473.field6786[1] = this.field3624;
        if (arg0 != 3) {
            return null;
        }
        class473.field6786[8] = this.field3648;
        class473.field6786[14] = this.field3628;
        class473.field6786[6] = this.field3638;
        class473.field6786[10] = this.field3632;
        class473.field6786[5] = this.field3627;
        class473.field6786[4] = this.field3643;
        class473.field6786[0] = this.field3630;
        class473.field6786[13] = this.field3619;
        return class473.field6786;
    }

    @OriginalMember(owner = "client!ol", name = "EA", descriptor = "(Lm;)V")
    public final void method878(class105 arg0) {
        field3636++;
        class249 var2 = (class249) arg0;
        this.field3619 = var2.field3619;
        this.field3638 = var2.field3638;
        this.field3643 = var2.field3643;
        this.field3624 = var2.field3624;
        this.field3648 = var2.field3648;
        this.field3632 = var2.field3632;
        this.field3627 = var2.field3627;
        this.field3633 = var2.field3633;
        this.field3629 = var2.field3629;
        this.field3630 = var2.field3630;
        this.field3622 = var2.field3622;
        this.field3628 = var2.field3628;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "()Lm;")
    public final class105 method879() {
        field3642++;
        class249 var1 = new class249();
        var1.field3627 = this.field3627;
        var1.field3619 = this.field3619;
        var1.field3624 = this.field3624;
        var1.field3630 = this.field3630;
        var1.field3638 = this.field3638;
        var1.field3648 = this.field3648;
        var1.field3632 = this.field3632;
        var1.field3622 = this.field3622;
        var1.field3629 = this.field3629;
        var1.field3643 = this.field3643;
        var1.field3628 = this.field3628;
        var1.field3633 = this.field3633;
        return var1;
    }

    @OriginalMember(owner = "client!ol", name = "k", descriptor = "(I)V")
    public final void method887(int arg0) {
        field3637++;
        float var2 = class459.field6614[arg0 & 0x3FFF];
        float var3 = class459.field6606[arg0 & 0x3FFF];
        float var4 = this.field3624;
        float var5 = this.field3627;
        float var6 = this.field3622;
        this.field3624 = var2 * var4 - this.field3633 * var3;
        float var7 = this.field3619;
        this.field3633 = this.field3633 * var2 + var3 * var4;
        this.field3627 = var2 * var5 - this.field3638 * var3;
        this.field3638 = this.field3638 * var2 + var3 * var5;
        this.field3622 = var2 * var6 - this.field3632 * var3;
        this.field3632 = this.field3632 * var2 + var3 * var6;
        this.field3619 = var2 * var7 - this.field3628 * var3;
        this.field3628 = this.field3628 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(III[I)V")
    public final void method880(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[1] = (int) ((float) arg2 * this.field3622 + (float) arg0 * this.field3624 + (float) arg1 * this.field3627 + this.field3619);
        arg3[2] = (int) ((float) arg2 * this.field3632 + (float) arg0 * this.field3633 + (float) arg1 * this.field3638 + this.field3628);
        field3641++;
        arg3[0] = (int) ((float) arg2 * this.field3648 + (float) arg0 * this.field3630 + (float) arg1 * this.field3643 + this.field3629);
    }

    @OriginalMember(owner = "client!ol", name = "TA", descriptor = "(III)V")
    public final void method877(int arg0, int arg1, int arg2) {
        this.field3629 += arg0;
        this.field3628 += arg2;
        this.field3619 += arg1;
        field3646++;
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(I)[F")
    public final float[] method1578(int arg0) {
        class473.field6786[1] = this.field3624;
        field3623++;
        class473.field6786[9] = this.field3622;
        class473.field6786[8] = this.field3648;
        if (arg0 < 13) {
            method1576(-62);
        }
        class473.field6786[12] = 0.0F;
        class473.field6786[6] = this.field3638;
        class473.field6786[5] = this.field3627;
        class473.field6786[2] = this.field3633;
        class473.field6786[13] = 0.0F;
        class473.field6786[0] = this.field3630;
        class473.field6786[14] = 0.0F;
        class473.field6786[4] = this.field3643;
        class473.field6786[10] = this.field3632;
        return class473.field6786;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIIFFF)V")
    public final void method1579(int arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        field3645++;
        if (arg0 == 0) {
            this.field3632 = 1.0F;
            this.field3630 = arg3;
            this.field3624 = this.field3633 = this.field3643 = this.field3638 = this.field3648 = this.field3622 = 0.0F;
            this.field3627 = arg2;
        } else {
            float var8 = class459.field6614[arg0 & 0x3FFF];
            float var9 = class459.field6606[arg0 & 0x3FFF];
            this.field3630 = (float) arg3 * var8;
            this.field3633 = this.field3638 = this.field3648 = this.field3622 = 0.0F;
            this.field3624 = (float) arg3 * var9;
            this.field3632 = 1.0F;
            this.field3643 = (float) arg2 * -var9;
            this.field3627 = (float) arg2 * var8;
        }
        this.field3628 = arg6;
        this.field3619 = arg5;
        if (arg1 != 18243) {
            this.field3629 = -2.423956F;
        }
        this.field3629 = arg4;
    }

    @OriginalMember(owner = "client!ol", name = "B", descriptor = "(IIIIII)V")
    public final void method888(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3620++;
        float var7 = class459.field6614[arg3 & 0x3FFF];
        float var8 = class459.field6606[arg3 & 0x3FFF];
        float var9 = class459.field6614[arg4 & 0x3FFF];
        float var10 = class459.field6606[arg4 & 0x3FFF];
        float var11 = class459.field6614[arg5 & 0x3FFF];
        float var12 = class459.field6606[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field3627 = var7 * var11;
        this.field3648 = -var10 * var11 + var9 * var14;
        this.field3624 = -var9 * var12 + var10 * var13;
        this.field3643 = var7 * var12;
        this.field3630 = var9 * var11 + var10 * var14;
        this.field3633 = var7 * var10;
        this.field3638 = -var8;
        this.field3622 = var9 * var13 + var10 * var12;
        this.field3632 = var7 * var9;
        this.field3629 = (float) (-arg0) * this.field3630 - ((float) arg1 * this.field3643) - ((float) arg2 * this.field3648);
        this.field3619 = (float) (-arg0) * this.field3624 - (float) arg1 * this.field3627 - ((float) arg2 * this.field3622);
        this.field3628 = (float) (-arg0) * this.field3633 - ((float) arg1 * this.field3638) - (float) arg2 * this.field3632;
    }

    @OriginalMember(owner = "client!ol", name = "I", descriptor = "(III[I)V")
    public final void method885(int arg0, int arg1, int arg2, int[] arg3) {
        field3617++;
        arg3[2] = (int) ((float) arg2 * this.field3632 + (float) arg0 * this.field3633 + (float) arg1 * this.field3638);
        arg3[1] = (int) ((float) arg2 * this.field3622 + (float) arg0 * this.field3624 + (float) arg1 * this.field3627);
        arg3[0] = (int) ((float) arg2 * this.field3648 + (float) arg0 * this.field3630 + (float) arg1 * this.field3643);
    }

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "(I)Z")
    public static final boolean method1580(int arg0) {
        if (arg0 == 4) {
            field3631++;
            return class480.field6825 > 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ol", name = "XA", descriptor = "(I)V")
    public final void method882(int arg0) {
        field3650++;
        float var2 = class459.field6614[arg0 & 0x3FFF];
        float var3 = class459.field6606[arg0 & 0x3FFF];
        float var4 = this.field3630;
        float var5 = this.field3643;
        float var6 = this.field3648;
        this.field3630 = this.field3633 * var3 + var2 * var4;
        float var7 = this.field3629;
        this.field3643 = this.field3638 * var3 + var2 * var5;
        this.field3633 = this.field3633 * var2 - (var3 * var4);
        this.field3638 = this.field3638 * var2 - (var3 * var5);
        this.field3648 = this.field3632 * var3 + var2 * var6;
        this.field3632 = this.field3632 * var2 - var3 * var6;
        this.field3629 = this.field3628 * var3 + var2 * var7;
        this.field3628 = this.field3628 * var2 - var3 * var7;
    }

    @OriginalMember(owner = "client!ol", name = "ha", descriptor = "()V")
    public final void method883() {
        this.field3624 = this.field3633 = this.field3643 = this.field3638 = this.field3648 = this.field3622 = this.field3629 = this.field3619 = this.field3628 = 0.0F;
        field3640++;
        this.field3630 = this.field3627 = this.field3632 = 1.0F;
    }

    @OriginalMember(owner = "client!ol", name = "va", descriptor = "([I)V")
    public final void method891(int[] arg0) {
        field3621++;
        float var2 = (float) arg0[0] - this.field3629;
        float var3 = (float) arg0[1] - this.field3619;
        float var4 = (float) arg0[2] - this.field3628;
        arg0[0] = (int) (this.field3633 * var4 + this.field3630 * var2 + this.field3624 * var3);
        arg0[1] = (int) (this.field3638 * var4 + this.field3643 * var2 + this.field3627 * var3);
        arg0[2] = (int) (this.field3632 * var4 + this.field3648 * var2 + this.field3622 * var3);
    }

    @OriginalMember(owner = "client!ol", name = "oa", descriptor = "(III)V")
    public final void method884(int arg0, int arg1, int arg2) {
        field3649++;
        this.field3630 = this.field3627 = this.field3632 = 1.0F;
        this.field3619 = arg1;
        this.field3624 = this.field3633 = this.field3643 = this.field3638 = this.field3648 = this.field3622 = 0.0F;
        this.field3629 = arg0;
        this.field3628 = arg2;
    }

    @OriginalMember(owner = "client!ol", name = "ta", descriptor = "(I)V")
    public final void method876(int arg0) {
        field3618++;
        this.field3632 = 1.0F;
        this.field3630 = this.field3627 = class459.field6614[arg0 & 0x3FFF];
        this.field3624 = class459.field6606[arg0 & 0x3FFF];
        this.field3648 = this.field3629 = this.field3622 = this.field3619 = this.field3633 = this.field3638 = this.field3628 = 0.0F;
        this.field3643 = -this.field3624;
    }

    @OriginalMember(owner = "client!ol", name = "ma", descriptor = "(I)V")
    public final void method875(int arg0) {
        this.field3627 = 1.0F;
        field3639++;
        this.field3630 = this.field3632 = class459.field6614[arg0 & 0x3FFF];
        this.field3648 = class459.field6606[arg0 & 0x3FFF];
        this.field3633 = -this.field3648;
        this.field3643 = this.field3629 = this.field3624 = this.field3622 = this.field3619 = this.field3638 = this.field3628 = 0.0F;
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "()V")
    public class249() {
        this.method883();
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IILoh;)I")
    public static final int method1581(int arg0, int arg1, class549 arg2) {
        if (arg0 != 28187) {
            return -21;
        }
        field3647++;
        if (!client.method3530(arg2).method3056(arg1, arg0 ^ 0x6E1A) && arg2.field7754 == null) {
            return -1;
        } else if (arg2.field7648 == null || arg1 >= arg2.field7648.length) {
            return -1;
        } else {
            return arg2.field7648[arg1];
        }
    }
}
