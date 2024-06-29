import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class266 extends class163 {

    @OriginalMember(owner = "client!en", name = "K", descriptor = "I")
    public static int field3735 = 0;

    @OriginalMember(owner = "client!en", name = "r", descriptor = "Lcba;")
    public static class471 field3716 = new class471(67, 12);

    @OriginalMember(owner = "client!en", name = "e", descriptor = "F")
    public float field3703;

    @OriginalMember(owner = "client!en", name = "g", descriptor = "F")
    public float field3705;

    @OriginalMember(owner = "client!en", name = "h", descriptor = "F")
    public float field3706;

    @OriginalMember(owner = "client!en", name = "m", descriptor = "F")
    public float field3711;

    @OriginalMember(owner = "client!en", name = "n", descriptor = "F")
    public float field3712;

    @OriginalMember(owner = "client!en", name = "q", descriptor = "F")
    public float field3715;

    @OriginalMember(owner = "client!en", name = "s", descriptor = "F")
    public float field3717;

    @OriginalMember(owner = "client!en", name = "v", descriptor = "F")
    public float field3720;

    @OriginalMember(owner = "client!en", name = "z", descriptor = "F")
    public float field3724;

    @OriginalMember(owner = "client!en", name = "C", descriptor = "F")
    public float field3727;

    @OriginalMember(owner = "client!en", name = "F", descriptor = "F")
    public float field3730;

    @OriginalMember(owner = "client!en", name = "G", descriptor = "F")
    public float field3731;

    @OriginalMember(owner = "client!en", name = "f", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!en", name = "i", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!en", name = "j", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!en", name = "k", descriptor = "I")
    public static int field3709;

    @OriginalMember(owner = "client!en", name = "l", descriptor = "I")
    public static int field3710;

    @OriginalMember(owner = "client!en", name = "o", descriptor = "I")
    public static int field3713;

    @OriginalMember(owner = "client!en", name = "p", descriptor = "I")
    public static int field3714;

    @OriginalMember(owner = "client!en", name = "t", descriptor = "I")
    public static int field3718;

    @OriginalMember(owner = "client!en", name = "u", descriptor = "I")
    public static int field3719;

    @OriginalMember(owner = "client!en", name = "w", descriptor = "I")
    public static int field3721;

    @OriginalMember(owner = "client!en", name = "x", descriptor = "I")
    public static int field3722;

    @OriginalMember(owner = "client!en", name = "y", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!en", name = "A", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!en", name = "B", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!en", name = "D", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!en", name = "E", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!en", name = "H", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!en", name = "I", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!en", name = "J", descriptor = "I")
    public static int field3734;

    @OriginalMember(owner = "client!en", name = "L", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!en", name = "TA", descriptor = "(III)V")
    public final void method1051(int arg0, int arg1, int arg2) {
        this.field3720 += arg2;
        this.field3703 += arg0;
        field3732++;
        this.field3724 += arg1;
    }

    @OriginalMember(owner = "client!en", name = "B", descriptor = "(IIIIII)V")
    public final void method1040(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3710++;
        float var7 = class622.field8990[arg3 & 0x3FFF];
        float var8 = class622.field8988[arg3 & 0x3FFF];
        float var9 = class622.field8990[arg4 & 0x3FFF];
        float var10 = class622.field8988[arg4 & 0x3FFF];
        float var11 = class622.field8990[arg5 & 0x3FFF];
        float var12 = class622.field8988[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field3712 = var7 * var12;
        this.field3730 = -var8;
        this.field3705 = var7 * var11;
        this.field3711 = var9 * var11 + var10 * var14;
        this.field3715 = -var9 * var12 + var10 * var13;
        this.field3717 = var7 * var9;
        this.field3706 = var9 * var13 + var10 * var12;
        this.field3731 = -var10 * var11 + var9 * var14;
        this.field3727 = var7 * var10;
        this.field3720 = (float) (-arg0) * this.field3727 - (float) arg1 * this.field3730 - ((float) arg2 * this.field3717);
        this.field3724 = (float) (-arg0) * this.field3715 - (float) arg1 * this.field3705 - (float) arg2 * this.field3706;
        this.field3703 = (float) (-arg0) * this.field3711 - (float) arg1 * this.field3712 - (float) arg2 * this.field3731;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Z)[F")
    public final float[] method1740(boolean arg0) {
        class534.field7472[13] = 0.0F;
        class534.field7472[1] = this.field3715;
        class534.field7472[12] = 0.0F;
        class534.field7472[2] = this.field3727;
        class534.field7472[6] = this.field3730;
        class534.field7472[5] = this.field3705;
        class534.field7472[4] = this.field3712;
        class534.field7472[14] = 0.0F;
        class534.field7472[9] = this.field3706;
        class534.field7472[10] = this.field3717;
        field3721++;
        class534.field7472[0] = this.field3711;
        class534.field7472[8] = this.field3731;
        if (arg0) {
            this.method1745(false, null);
        }
        return class534.field7472;
    }

    @OriginalMember(owner = "client!en", name = "KA", descriptor = "(I)V")
    public final void method1053(int arg0) {
        field3704++;
        this.field3711 = 1.0F;
        this.field3705 = this.field3717 = class622.field8990[arg0 & 0x3FFF];
        this.field3730 = class622.field8988[arg0 & 0x3FFF];
        this.field3712 = this.field3731 = this.field3703 = this.field3715 = this.field3724 = this.field3727 = this.field3720 = 0.0F;
        this.field3706 = -this.field3730;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IFIFIFI)V")
    public final void method1741(int arg0, float arg1, int arg2, float arg3, int arg4, float arg5, int arg6) {
        field3708++;
        if (arg6 <= 75) {
            this.method1053(-51);
        }
        if (arg2 == 0) {
            this.field3717 = 1.0F;
            this.field3711 = arg4;
            this.field3715 = this.field3727 = this.field3712 = this.field3730 = this.field3731 = this.field3706 = 0.0F;
            this.field3705 = arg0;
        } else {
            float var8 = class622.field8990[arg2 & 0x3FFF];
            float var9 = class622.field8988[arg2 & 0x3FFF];
            this.field3715 = (float) arg4 * var9;
            this.field3717 = 1.0F;
            this.field3727 = this.field3730 = this.field3731 = this.field3706 = 0.0F;
            this.field3711 = (float) arg4 * var8;
            this.field3705 = (float) arg0 * var8;
            this.field3712 = (float) arg0 * -var9;
        }
        this.field3724 = arg3;
        this.field3703 = arg1;
        this.field3720 = arg5;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I[IIII)V")
    public static final void method1742(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        arg4--;
        field3718++;
        int var6 = arg2 - 1;
        int var5 = var6 - 7;
        while (var5 > arg4) {
            int var7 = arg4 + 1;
            arg1[var7] = arg3;
            int var8 = var7 + 1;
            arg1[var8] = arg3;
            int var9 = var8 + 1;
            arg1[var9] = arg3;
            int var10 = var9 + 1;
            arg1[var10] = arg3;
            int var11 = var10 + 1;
            arg1[var11] = arg3;
            int var12 = var11 + 1;
            arg1[var12] = arg3;
            int var13 = var12 + 1;
            arg1[var13] = arg3;
            arg4 = var13 + 1;
            arg1[arg4] = arg3;
        }
        if (arg0 != 26844) {
            field3716 = null;
        }
        while (var6 > arg4) {
            arg4++;
            arg1[arg4] = arg3;
        }
    }

    @OriginalMember(owner = "client!en", name = "va", descriptor = "([I)V")
    public final void method1042(int[] arg0) {
        field3734++;
        float var2 = (float) arg0[0] - this.field3703;
        float var3 = (float) arg0[1] - this.field3724;
        float var4 = (float) arg0[2] - this.field3720;
        arg0[2] = (int) (this.field3717 * var4 + this.field3731 * var2 + this.field3706 * var3);
        arg0[1] = (int) (this.field3730 * var4 + this.field3712 * var2 + this.field3705 * var3);
        arg0[0] = (int) (this.field3727 * var4 + this.field3715 * var3 + this.field3711 * var2);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "()Lm;")
    public final class163 method1050() {
        field3719++;
        class266 var1 = new class266();
        var1.field3730 = this.field3730;
        var1.field3703 = this.field3703;
        var1.field3731 = this.field3731;
        var1.field3720 = this.field3720;
        var1.field3715 = this.field3715;
        var1.field3717 = this.field3717;
        var1.field3712 = this.field3712;
        var1.field3727 = this.field3727;
        var1.field3706 = this.field3706;
        var1.field3724 = this.field3724;
        var1.field3711 = this.field3711;
        var1.field3705 = this.field3705;
        return var1;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IILsg;II)V")
    public static final void method1743(int arg0, int arg1, class335 arg2, int arg3, int arg4) {
        if (arg4 != -27677) {
            return;
        }
        field3729++;
        long var5 = (long) (arg1 << 14 | arg3 << 28 | arg0);
        class93 var7 = (class93) class220.field3147.method1242(0, var5);
        if (var7 == null) {
            class93 var8 = new class93();
            class220.field3147.method1241(var8, var5, arg4 ^ 0x6C6E);
            var8.field1434.method463(arg2, -124);
            return;
        }
        class621 var9 = class181.field2574.method866(arg2.field4461, (byte) 79);
        int var10 = var9.field8960;
        if (var9.field8948 == 1) {
            var10 = (arg2.field4465 + 1) * var10;
        }
        for (class335 var11 = (class335) var7.field1434.method456((byte) -99); var11 != null; var11 = (class335) var7.field1434.method460((byte) 73)) {
            class621 var12 = class181.field2574.method866(var11.field4461, (byte) 79);
            int var13 = var12.field8960;
            if (var12.field8948 == 1) {
                var13 = (var11.field4465 + 1) * var13;
            }
            if (var13 < var10) {
                class68.method566(var11, 103, arg2);
                return;
            }
        }
        var7.field1434.method463(arg2, arg4 + 27577);
    }

    @OriginalMember(owner = "client!en", name = "ma", descriptor = "(I)V")
    public final void method1047(int arg0) {
        this.field3705 = 1.0F;
        field3728++;
        this.field3711 = this.field3717 = class622.field8990[arg0 & 0x3FFF];
        this.field3731 = class622.field8988[arg0 & 0x3FFF];
        this.field3727 = -this.field3731;
        this.field3712 = this.field3703 = this.field3715 = this.field3706 = this.field3724 = this.field3730 = this.field3720 = 0.0F;
    }

    @OriginalMember(owner = "client!en", name = "EA", descriptor = "(Lm;)V")
    public final void method1049(class163 arg0) {
        field3725++;
        class266 var2 = (class266) arg0;
        this.field3715 = var2.field3715;
        this.field3731 = var2.field3731;
        this.field3706 = var2.field3706;
        this.field3727 = var2.field3727;
        this.field3705 = var2.field3705;
        this.field3712 = var2.field3712;
        this.field3703 = var2.field3703;
        this.field3717 = var2.field3717;
        this.field3711 = var2.field3711;
        this.field3730 = var2.field3730;
        this.field3720 = var2.field3720;
        this.field3724 = var2.field3724;
    }

    @OriginalMember(owner = "client!en", name = "ta", descriptor = "(I)V")
    public final void method1046(int arg0) {
        this.field3717 = 1.0F;
        field3709++;
        this.field3711 = this.field3705 = class622.field8990[arg0 & 0x3FFF];
        this.field3715 = class622.field8988[arg0 & 0x3FFF];
        this.field3731 = this.field3703 = this.field3706 = this.field3724 = this.field3727 = this.field3730 = this.field3720 = 0.0F;
        this.field3712 = -this.field3715;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(B)V")
    public static void method1744(byte arg0) {
        if (arg0 <= 52) {
            method1743(105, 63, null, 113, 32);
        }
        field3716 = null;
    }

    @OriginalMember(owner = "client!en", name = "XA", descriptor = "(I)V")
    public final void method1048(int arg0) {
        field3713++;
        float var2 = class622.field8990[arg0 & 0x3FFF];
        float var3 = class622.field8988[arg0 & 0x3FFF];
        float var4 = this.field3711;
        float var5 = this.field3712;
        float var6 = this.field3731;
        float var7 = this.field3703;
        this.field3711 = this.field3727 * var3 + var2 * var4;
        this.field3712 = this.field3730 * var3 + var2 * var5;
        this.field3727 = this.field3727 * var2 - (var3 * var4);
        this.field3730 = this.field3730 * var2 - var3 * var5;
        this.field3731 = this.field3717 * var3 + var2 * var6;
        this.field3717 = this.field3717 * var2 - (var3 * var6);
        this.field3703 = this.field3720 * var3 + var2 * var7;
        this.field3720 = this.field3720 * var2 - (var3 * var7);
    }

    @OriginalMember(owner = "client!en", name = "ha", descriptor = "()V")
    public final void method1045() {
        field3726++;
        this.field3715 = this.field3727 = this.field3712 = this.field3730 = this.field3731 = this.field3706 = this.field3703 = this.field3724 = this.field3720 = 0.0F;
        this.field3711 = this.field3705 = this.field3717 = 1.0F;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ZLm;)V")
    public final void method1745(boolean arg0, class163 arg1) {
        field3722++;
        class266 var3 = (class266) arg1;
        this.field3731 = var3.field3727;
        this.field3711 = var3.field3711;
        this.field3712 = var3.field3715;
        this.field3705 = var3.field3705;
        this.field3727 = var3.field3731;
        this.field3706 = var3.field3730;
        this.field3715 = var3.field3712;
        this.field3717 = var3.field3717;
        this.field3703 = -(this.field3731 * var3.field3720 + this.field3712 * var3.field3724 + this.field3711 * var3.field3703);
        this.field3730 = var3.field3706;
        this.field3724 = -(this.field3706 * var3.field3720 + this.field3715 * var3.field3703 + this.field3705 * var3.field3724);
        this.field3720 = -(this.field3717 * var3.field3720 + this.field3730 * var3.field3724 + this.field3727 * var3.field3703);
        if (arg0) {
            field3735 = -88;
        }
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(B)[F")
    public final float[] method1746(byte arg0) {
        class534.field7472[10] = this.field3717;
        class534.field7472[1] = this.field3715;
        class534.field7472[12] = this.field3703;
        class534.field7472[2] = this.field3727;
        class534.field7472[4] = this.field3712;
        class534.field7472[5] = this.field3705;
        class534.field7472[0] = this.field3711;
        class534.field7472[8] = this.field3731;
        field3714++;
        class534.field7472[9] = this.field3706;
        class534.field7472[6] = this.field3730;
        class534.field7472[14] = this.field3720;
        class534.field7472[13] = this.field3724;
        if (arg0 <= 1) {
            this.field3731 = -1.5460039F;
        }
        return class534.field7472;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(III[I)V")
    public final void method1044(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[1] = (int) ((float) arg2 * this.field3706 + (float) arg0 * this.field3715 + (float) arg1 * this.field3705 + this.field3724);
        arg3[2] = (int) ((float) arg2 * this.field3717 + (float) arg0 * this.field3727 + (float) arg1 * this.field3730 + this.field3720);
        arg3[0] = (int) ((float) arg2 * this.field3731 + (float) arg0 * this.field3711 + (float) arg1 * this.field3712 + this.field3703);
        field3723++;
    }

    @OriginalMember(owner = "client!en", name = "oa", descriptor = "(III)V")
    public final void method1054(int arg0, int arg1, int arg2) {
        this.field3715 = this.field3727 = this.field3712 = this.field3730 = this.field3731 = this.field3706 = 0.0F;
        this.field3724 = arg1;
        this.field3703 = arg0;
        this.field3720 = arg2;
        field3707++;
        this.field3711 = this.field3705 = this.field3717 = 1.0F;
    }

    @OriginalMember(owner = "client!en", name = "I", descriptor = "(III[I)V")
    public final void method1041(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (int) ((float) arg2 * this.field3731 + (float) arg0 * this.field3711 + (float) arg1 * this.field3712);
        field3733++;
        arg3[2] = (int) ((float) arg2 * this.field3717 + (float) arg0 * this.field3727 + (float) arg1 * this.field3730);
        arg3[1] = (int) ((float) arg2 * this.field3706 + (float) arg0 * this.field3715 + (float) arg1 * this.field3705);
    }

    @OriginalMember(owner = "client!en", name = "k", descriptor = "(I)V")
    public final void method1043(int arg0) {
        field3736++;
        float var2 = class622.field8990[arg0 & 0x3FFF];
        float var3 = class622.field8988[arg0 & 0x3FFF];
        float var4 = this.field3715;
        float var5 = this.field3705;
        float var6 = this.field3706;
        this.field3715 = var2 * var4 - (this.field3727 * var3);
        float var7 = this.field3724;
        this.field3705 = var2 * var5 - (this.field3730 * var3);
        this.field3727 = this.field3727 * var2 + var3 * var4;
        this.field3730 = this.field3730 * var2 + var3 * var5;
        this.field3706 = var2 * var6 - (this.field3717 * var3);
        this.field3724 = var2 * var7 - this.field3720 * var3;
        this.field3717 = this.field3717 * var2 + var3 * var6;
        this.field3720 = this.field3720 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!en", name = "<init>", descriptor = "()V")
    public class266() {
        this.method1045();
    }
}
