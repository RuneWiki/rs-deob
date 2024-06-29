import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public class class630 extends class326 {

    @OriginalMember(owner = "client!ou", name = "f", descriptor = "F")
    public float field8824;

    @OriginalMember(owner = "client!ou", name = "g", descriptor = "F")
    public float field8825;

    @OriginalMember(owner = "client!ou", name = "h", descriptor = "F")
    public float field8826;

    @OriginalMember(owner = "client!ou", name = "m", descriptor = "F")
    public float field8831;

    @OriginalMember(owner = "client!ou", name = "o", descriptor = "F")
    public float field8833;

    @OriginalMember(owner = "client!ou", name = "q", descriptor = "F")
    public float field8835;

    @OriginalMember(owner = "client!ou", name = "C", descriptor = "F")
    public float field8847;

    @OriginalMember(owner = "client!ou", name = "D", descriptor = "F")
    public float field8848;

    @OriginalMember(owner = "client!ou", name = "F", descriptor = "F")
    public float field8850;

    @OriginalMember(owner = "client!ou", name = "H", descriptor = "F")
    public float field8852;

    @OriginalMember(owner = "client!ou", name = "I", descriptor = "F")
    public float field8853;

    @OriginalMember(owner = "client!ou", name = "K", descriptor = "F")
    public float field8855;

    @OriginalMember(owner = "client!ou", name = "i", descriptor = "I")
    public static int field8827;

    @OriginalMember(owner = "client!ou", name = "j", descriptor = "I")
    public static int field8828;

    @OriginalMember(owner = "client!ou", name = "k", descriptor = "I")
    public static int field8829;

    @OriginalMember(owner = "client!ou", name = "n", descriptor = "I")
    public static int field8832;

    @OriginalMember(owner = "client!ou", name = "p", descriptor = "I")
    public static int field8834;

    @OriginalMember(owner = "client!ou", name = "r", descriptor = "I")
    public static int field8836;

    @OriginalMember(owner = "client!ou", name = "s", descriptor = "I")
    public static int field8837;

    @OriginalMember(owner = "client!ou", name = "t", descriptor = "I")
    public static int field8838;

    @OriginalMember(owner = "client!ou", name = "u", descriptor = "I")
    public static int field8839;

    @OriginalMember(owner = "client!ou", name = "v", descriptor = "I")
    public static int field8840;

    @OriginalMember(owner = "client!ou", name = "w", descriptor = "I")
    public static int field8841;

    @OriginalMember(owner = "client!ou", name = "x", descriptor = "I")
    public static int field8842;

    @OriginalMember(owner = "client!ou", name = "y", descriptor = "I")
    public static int field8843;

    @OriginalMember(owner = "client!ou", name = "z", descriptor = "I")
    public static int field8844;

    @OriginalMember(owner = "client!ou", name = "A", descriptor = "I")
    public static int field8845;

    @OriginalMember(owner = "client!ou", name = "B", descriptor = "I")
    public static int field8846;

    @OriginalMember(owner = "client!ou", name = "E", descriptor = "I")
    public static int field8849;

    @OriginalMember(owner = "client!ou", name = "G", descriptor = "I")
    public static int field8851;

    @OriginalMember(owner = "client!ou", name = "J", descriptor = "I")
    public static int field8854;

    @OriginalMember(owner = "client!ou", name = "L", descriptor = "I")
    public static int field8856;

    @OriginalMember(owner = "client!ou", name = "M", descriptor = "I")
    public static int field8857;

    @OriginalMember(owner = "client!ou", name = "N", descriptor = "I")
    public static int field8858;

    @OriginalMember(owner = "client!ou", name = "l", descriptor = "Lqaa;")
    public static class29 field8830;

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(B)[F")
    public final float[] method3607(byte arg0) {
        class546.field7861[14] = this.field8824;
        class546.field7861[4] = this.field8847;
        class546.field7861[9] = this.field8831;
        class546.field7861[5] = this.field8852;
        class546.field7861[6] = this.field8833;
        if (arg0 > -127) {
            return null;
        }
        class546.field7861[0] = this.field8825;
        field8839++;
        class546.field7861[8] = this.field8826;
        class546.field7861[13] = this.field8848;
        class546.field7861[2] = this.field8853;
        class546.field7861[10] = this.field8850;
        class546.field7861[12] = this.field8835;
        class546.field7861[1] = this.field8855;
        return class546.field7861;
    }

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "(B)[F")
    public final float[] method3608(byte arg0) {
        class546.field7861[2] = this.field8853;
        field8841++;
        class546.field7861[6] = this.field8833;
        class546.field7861[1] = this.field8855;
        class546.field7861[4] = this.field8847;
        class546.field7861[0] = this.field8825;
        class546.field7861[14] = 0.0F;
        class546.field7861[10] = this.field8850;
        class546.field7861[13] = 0.0F;
        class546.field7861[5] = this.field8852;
        class546.field7861[12] = 0.0F;
        if (arg0 == -67) {
            class546.field7861[9] = this.field8831;
            class546.field7861[8] = this.field8826;
            return class546.field7861;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "([I)V")
    public final void method1896(int[] arg0) {
        field8856++;
        float var2 = (float) arg0[0] - this.field8835;
        float var3 = (float) arg0[1] - this.field8848;
        float var4 = (float) arg0[2] - this.field8824;
        arg0[1] = (int) (this.field8833 * var4 + this.field8852 * var3 + this.field8847 * var2);
        arg0[2] = (int) (this.field8850 * var4 + this.field8831 * var3 + this.field8826 * var2);
        arg0[0] = (int) (this.field8853 * var4 + this.field8855 * var3 + this.field8825 * var2);
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(ZFFFF[F)V")
    public final void method3609(boolean arg0, float arg1, float arg2, float arg3, float arg4, float[] arg5) {
        field8828++;
        if (!arg0) {
            this.field8850 = 0.14164808F;
        }
        arg5[1] = this.field8831 * arg3 + this.field8855 * arg2 + this.field8852 * arg4;
        arg5[2] = this.field8850 * arg3 + this.field8853 * arg2 + this.field8833 * arg4;
        float var8;
        float var9;
        float var10;
        if ((arg2 > 0.00390625F) || (arg2 < -0.00390625F)) {
            float var12 = -arg1 / arg2;
            var9 = this.field8853 * var12 + this.field8824;
            var8 = this.field8855 * var12 + this.field8848;
            var10 = this.field8825 * var12 + this.field8835;
        } else if ((arg4 > 0.00390625F) || (arg4 < -0.00390625F)) {
            float var11 = -arg1 / arg4;
            var8 = this.field8852 * var11 + this.field8848;
            var9 = this.field8833 * var11 + this.field8824;
            var10 = this.field8847 * var11 + this.field8835;
        } else {
            float var7 = -arg1 / arg3;
            var8 = this.field8831 * var7 + this.field8848;
            var9 = this.field8850 * var7 + this.field8824;
            var10 = this.field8826 * var7 + this.field8835;
        }
        arg5[0] = this.field8826 * arg3 + this.field8847 * arg4 + this.field8825 * arg2;
        arg5[3] = -(arg5[2] * var9 + arg5[0] * var10 + arg5[1] * var8);
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(BIFFFII)V")
    public final void method3610(byte arg0, int arg1, float arg2, float arg3, float arg4, int arg5, int arg6) {
        if (arg5 == 0) {
            this.field8855 = this.field8853 = this.field8847 = this.field8833 = this.field8826 = this.field8831 = 0.0F;
            this.field8852 = arg6;
            this.field8850 = 1.0F;
            this.field8825 = arg1;
        } else {
            float var8 = class58.field723[arg5 & 0x3FFF];
            float var9 = class58.field730[arg5 & 0x3FFF];
            this.field8855 = (float) arg1 * var9;
            this.field8853 = this.field8833 = this.field8826 = this.field8831 = 0.0F;
            this.field8825 = (float) arg1 * var8;
            this.field8847 = (float) arg6 * -var9;
            this.field8852 = (float) arg6 * var8;
            this.field8850 = 1.0F;
        }
        if (arg0 == -106) {
            field8843++;
            this.field8835 = arg2;
            this.field8824 = arg3;
            this.field8848 = arg4;
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(III)V")
    public final void method1878(int arg0, int arg1, int arg2) {
        this.field8824 += arg2;
        this.field8848 += arg1;
        field8851++;
        this.field8835 += arg0;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lje;ZZ)V")
    public static final void method3611(class421 arg0, boolean arg1, boolean arg2) {
        arg0.field5750 = arg2;
        if (!class712.field9883) {
            class489.method2918(arg0, class702.field9785);
        } else if (arg1) {
            class747.field10352[class747.field10352.length - 1].method347(false, arg0);
        } else {
            int var3 = class765.method4235(arg0.field5757);
            int var4 = class647.field9058[2] * arg0.method917(-1760267218) / arg0.field5744;
            int var5 = class765.method4235(arg0.field5757 - var4);
            int var6 = class765.method4235(arg0.field5757 + var4);
            if (var5 == var6) {
                class747.field10352[var3].method347(false, arg0);
            } else if (var6 - var5 == 1) {
                class747.field10352[class270.field3919 + var5].method347(false, arg0);
            } else {
                class747.field10352[class747.field10352.length - 1].method347(false, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!ou", name = "c", descriptor = "(I)V")
    public final void method1871(int arg0) {
        field8844++;
        float var2 = class58.field723[arg0 & 0x3FFF];
        float var3 = class58.field730[arg0 & 0x3FFF];
        float var4 = this.field8825;
        float var5 = this.field8847;
        float var6 = this.field8826;
        float var7 = this.field8835;
        this.field8825 = this.field8853 * var3 + var2 * var4;
        this.field8847 = this.field8833 * var3 + var2 * var5;
        this.field8853 = this.field8853 * var2 - var3 * var4;
        this.field8833 = this.field8833 * var2 - var3 * var5;
        this.field8826 = this.field8850 * var3 + var2 * var6;
        this.field8850 = this.field8850 * var2 - var3 * var6;
        this.field8835 = this.field8824 * var3 + var2 * var7;
        this.field8824 = this.field8824 * var2 - var3 * var7;
    }

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "()V")
    public final void method1873() {
        this.field8825 = this.field8852 = this.field8850 = 1.0F;
        this.field8855 = this.field8853 = this.field8847 = this.field8833 = this.field8826 = this.field8831 = this.field8835 = this.field8848 = this.field8824 = 0.0F;
        field8838++;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "()Lqja;")
    public final class326 method1872() {
        field8846++;
        class630 var1 = new class630();
        var1.field8850 = this.field8850;
        var1.field8855 = this.field8855;
        var1.field8847 = this.field8847;
        var1.field8825 = this.field8825;
        var1.field8826 = this.field8826;
        var1.field8824 = this.field8824;
        var1.field8833 = this.field8833;
        var1.field8852 = this.field8852;
        var1.field8831 = this.field8831;
        var1.field8853 = this.field8853;
        var1.field8848 = this.field8848;
        var1.field8835 = this.field8835;
        return var1;
    }

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "(I)V")
    public final void method1895(int arg0) {
        field8832++;
        float var2 = class58.field723[arg0 & 0x3FFF];
        float var3 = class58.field730[arg0 & 0x3FFF];
        float var4 = this.field8825;
        float var5 = this.field8847;
        float var6 = this.field8826;
        this.field8825 = var2 * var4 - (this.field8855 * var3);
        float var7 = this.field8835;
        this.field8847 = var2 * var5 - (this.field8852 * var3);
        this.field8855 = this.field8855 * var2 + var3 * var4;
        this.field8826 = var2 * var6 - (this.field8831 * var3);
        this.field8852 = this.field8852 * var2 + var3 * var5;
        this.field8835 = var2 * var7 - (this.field8848 * var3);
        this.field8831 = this.field8831 * var2 + var3 * var6;
        this.field8848 = this.field8848 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lqja;)V")
    public final void method1884(class326 arg0) {
        field8849++;
        class630 var2 = (class630) arg0;
        this.field8855 = var2.field8855;
        this.field8833 = var2.field8833;
        this.field8824 = var2.field8824;
        this.field8848 = var2.field8848;
        this.field8825 = var2.field8825;
        this.field8853 = var2.field8853;
        this.field8826 = var2.field8826;
        this.field8835 = var2.field8835;
        this.field8850 = var2.field8850;
        this.field8847 = var2.field8847;
        this.field8852 = var2.field8852;
        this.field8831 = var2.field8831;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(Z)V")
    public static void method3612(boolean arg0) {
        if (arg0) {
            method3611(null, true, true);
        }
        field8830 = null;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(IIIIII)V")
    public final void method1870(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field8854++;
        float var7 = class58.field723[arg3 & 0x3FFF];
        float var8 = class58.field730[arg3 & 0x3FFF];
        float var9 = class58.field723[arg4 & 0x3FFF];
        float var10 = class58.field730[arg4 & 0x3FFF];
        float var11 = class58.field723[arg5 & 0x3FFF];
        float var12 = class58.field730[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field8853 = var7 * var10;
        this.field8852 = var7 * var11;
        this.field8833 = -var8;
        this.field8825 = var9 * var11 + var10 * var14;
        this.field8831 = var9 * var13 + var10 * var12;
        this.field8850 = var7 * var9;
        this.field8826 = -var10 * var11 + var9 * var14;
        this.field8855 = -var9 * var12 + var10 * var13;
        this.field8847 = var7 * var12;
        this.field8848 = (float) (-arg0) * this.field8855 - ((float) arg1 * this.field8852) - (float) arg2 * this.field8831;
        this.field8824 = (float) (-arg0) * this.field8853 - (float) arg1 * this.field8833 - (float) arg2 * this.field8850;
        this.field8835 = (float) (-arg0) * this.field8825 - (float) arg1 * this.field8847 - (float) arg2 * this.field8826;
    }

    @OriginalMember(owner = "client!ou", name = "c", descriptor = "(B)V")
    public final void method3613(byte arg0) {
        this.field8852 = -this.field8852;
        this.field8848 = -this.field8848;
        this.field8855 = -this.field8855;
        this.field8833 = -this.field8833;
        this.field8850 = -this.field8850;
        this.field8853 = -this.field8853;
        int var2 = 50 / ((arg0 + 67) / 36);
        field8837++;
        this.field8831 = -this.field8831;
        this.field8824 = -this.field8824;
    }

    @OriginalMember(owner = "client!ou", name = "e", descriptor = "(I)V")
    public final void method1877(int arg0) {
        field8857++;
        float var2 = class58.field723[arg0 & 0x3FFF];
        float var3 = class58.field730[arg0 & 0x3FFF];
        float var4 = this.field8855;
        float var5 = this.field8852;
        float var6 = this.field8831;
        this.field8855 = var2 * var4 - (this.field8853 * var3);
        float var7 = this.field8848;
        this.field8852 = var2 * var5 - (this.field8833 * var3);
        this.field8853 = this.field8853 * var2 + var3 * var4;
        this.field8833 = this.field8833 * var2 + var3 * var5;
        this.field8831 = var2 * var6 - this.field8850 * var3;
        this.field8848 = var2 * var7 - this.field8824 * var3;
        this.field8850 = this.field8850 * var2 + var3 * var6;
        this.field8824 = this.field8824 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!ou", name = "d", descriptor = "(I)V")
    public final void method1882(int arg0) {
        this.field8850 = 1.0F;
        field8842++;
        this.field8825 = this.field8852 = class58.field723[arg0 & 0x3FFF];
        this.field8855 = class58.field730[arg0 & 0x3FFF];
        this.field8847 = -this.field8855;
        this.field8826 = this.field8835 = this.field8831 = this.field8848 = this.field8853 = this.field8833 = this.field8824 = 0.0F;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)V")
    public final void method1868(int arg0) {
        field8840++;
        this.field8852 = 1.0F;
        this.field8825 = this.field8850 = class58.field723[arg0 & 0x3FFF];
        this.field8826 = class58.field730[arg0 & 0x3FFF];
        this.field8847 = this.field8835 = this.field8855 = this.field8831 = this.field8848 = this.field8833 = this.field8824 = 0.0F;
        this.field8853 = -this.field8826;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(III[I)V")
    public final void method1899(int arg0, int arg1, int arg2, int[] arg3) {
        field8858++;
        arg3[0] = (int) ((float) arg2 * this.field8826 + (float) arg0 * this.field8825 + (float) arg1 * this.field8847);
        arg3[1] = (int) ((float) arg2 * this.field8831 + (float) arg0 * this.field8855 + (float) arg1 * this.field8852);
        arg3[2] = (int) ((float) arg2 * this.field8850 + (float) arg0 * this.field8853 + (float) arg1 * this.field8833);
    }

    @OriginalMember(owner = "client!ou", name = "<init>", descriptor = "()V")
    public class630() {
        this.method1873();
    }

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "(III[I)V")
    public final void method1890(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (int) ((float) arg2 - this.field8824);
        field8845++;
        int var6 = (int) ((float) arg1 - this.field8848);
        int var7 = (int) ((float) arg0 - this.field8835);
        arg3[2] = (int) ((float) var5 * this.field8850 + (float) var6 * this.field8831 + (float) var7 * this.field8826);
        arg3[0] = (int) ((float) var5 * this.field8853 + (float) var6 * this.field8855 + (float) var7 * this.field8825);
        arg3[1] = (int) ((float) var5 * this.field8833 + (float) var6 * this.field8852 + (float) var7 * this.field8847);
    }

    @OriginalMember(owner = "client!ou", name = "f", descriptor = "(I)V")
    public final void method1888(int arg0) {
        this.field8825 = 1.0F;
        field8827++;
        this.field8852 = this.field8850 = class58.field723[arg0 & 0x3FFF];
        this.field8833 = class58.field730[arg0 & 0x3FFF];
        this.field8831 = -this.field8833;
        this.field8847 = this.field8826 = this.field8835 = this.field8855 = this.field8848 = this.field8853 = this.field8824 = 0.0F;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lqja;B)V")
    public final void method3614(class326 arg0, byte arg1) {
        field8829++;
        class630 var3 = (class630) arg0;
        this.field8847 = var3.field8855;
        this.field8825 = var3.field8825;
        this.field8826 = var3.field8853;
        this.field8855 = var3.field8847;
        if (arg1 < 27) {
            return;
        }
        this.field8831 = var3.field8833;
        this.field8853 = var3.field8826;
        this.field8852 = var3.field8852;
        this.field8835 = -(this.field8826 * var3.field8824 + this.field8847 * var3.field8848 + this.field8825 * var3.field8835);
        this.field8833 = var3.field8831;
        this.field8850 = var3.field8850;
        this.field8848 = -(this.field8831 * var3.field8824 + this.field8855 * var3.field8835 + this.field8852 * var3.field8848);
        this.field8824 = -(this.field8850 * var3.field8824 + this.field8853 * var3.field8835 + this.field8833 * var3.field8848);
    }

    @OriginalMember(owner = "client!ou", name = "c", descriptor = "(III[I)V")
    public final void method1885(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (int) ((float) arg2 * this.field8826 + (float) arg0 * this.field8825 + (float) arg1 * this.field8847 + this.field8835);
        arg3[2] = (int) ((float) arg2 * this.field8850 + (float) arg0 * this.field8853 + (float) arg1 * this.field8833 + this.field8824);
        field8836++;
        arg3[1] = (int) ((float) arg2 * this.field8831 + (float) arg0 * this.field8855 + (float) arg1 * this.field8852 + this.field8848);
    }

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "(III)V")
    public final void method1869(int arg0, int arg1, int arg2) {
        this.field8855 = this.field8853 = this.field8847 = this.field8833 = this.field8826 = this.field8831 = 0.0F;
        this.field8835 = arg0;
        this.field8825 = this.field8852 = this.field8850 = 1.0F;
        this.field8848 = arg1;
        this.field8824 = arg2;
        field8834++;
    }
}
