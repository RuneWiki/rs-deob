import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class530 extends class15 {

    @OriginalMember(owner = "client!fl", name = "G", descriptor = "I")
    public static int field7818 = 1339;

    @OriginalMember(owner = "client!fl", name = "S", descriptor = "I")
    public static int field7830 = 0;

    @OriginalMember(owner = "client!fl", name = "P", descriptor = "Lbd;")
    public static class44 field7827 = new class44(" from your friends list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

    @OriginalMember(owner = "client!fl", name = "T", descriptor = "Lbd;")
    public static class44 field7831 = new class44("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

    @OriginalMember(owner = "client!fl", name = "U", descriptor = "Lqv;")
    public static class316 field7832 = new class316(89, 2);

    @OriginalMember(owner = "client!fl", name = "j", descriptor = "F")
    public float field7796;

    @OriginalMember(owner = "client!fl", name = "k", descriptor = "F")
    public float field7797;

    @OriginalMember(owner = "client!fl", name = "r", descriptor = "F")
    public float field7804;

    @OriginalMember(owner = "client!fl", name = "t", descriptor = "F")
    public float field7806;

    @OriginalMember(owner = "client!fl", name = "u", descriptor = "F")
    public float field7807;

    @OriginalMember(owner = "client!fl", name = "w", descriptor = "F")
    public float field7809;

    @OriginalMember(owner = "client!fl", name = "C", descriptor = "F")
    public float field7814;

    @OriginalMember(owner = "client!fl", name = "E", descriptor = "F")
    public float field7816;

    @OriginalMember(owner = "client!fl", name = "F", descriptor = "F")
    public float field7817;

    @OriginalMember(owner = "client!fl", name = "H", descriptor = "F")
    public float field7819;

    @OriginalMember(owner = "client!fl", name = "J", descriptor = "F")
    public float field7821;

    @OriginalMember(owner = "client!fl", name = "K", descriptor = "F")
    public float field7822;

    @OriginalMember(owner = "client!fl", name = "l", descriptor = "I")
    public static int field7798;

    @OriginalMember(owner = "client!fl", name = "m", descriptor = "I")
    public static int field7799;

    @OriginalMember(owner = "client!fl", name = "n", descriptor = "I")
    public static int field7800;

    @OriginalMember(owner = "client!fl", name = "o", descriptor = "I")
    public static int field7801;

    @OriginalMember(owner = "client!fl", name = "p", descriptor = "I")
    public static int field7802;

    @OriginalMember(owner = "client!fl", name = "q", descriptor = "I")
    public static int field7803;

    @OriginalMember(owner = "client!fl", name = "s", descriptor = "I")
    public static int field7805;

    @OriginalMember(owner = "client!fl", name = "v", descriptor = "I")
    public static int field7808;

    @OriginalMember(owner = "client!fl", name = "x", descriptor = "I")
    public static int field7810;

    @OriginalMember(owner = "client!fl", name = "y", descriptor = "I")
    public static int field7811;

    @OriginalMember(owner = "client!fl", name = "z", descriptor = "I")
    public static int field7812;

    @OriginalMember(owner = "client!fl", name = "B", descriptor = "I")
    public static int field7813;

    @OriginalMember(owner = "client!fl", name = "D", descriptor = "I")
    public static int field7815;

    @OriginalMember(owner = "client!fl", name = "I", descriptor = "I")
    public static int field7820;

    @OriginalMember(owner = "client!fl", name = "L", descriptor = "I")
    public static int field7823;

    @OriginalMember(owner = "client!fl", name = "M", descriptor = "I")
    public static int field7824;

    @OriginalMember(owner = "client!fl", name = "N", descriptor = "I")
    public static int field7825;

    @OriginalMember(owner = "client!fl", name = "O", descriptor = "I")
    public static int field7826;

    @OriginalMember(owner = "client!fl", name = "Q", descriptor = "I")
    public static int field7828;

    @OriginalMember(owner = "client!fl", name = "R", descriptor = "I")
    public static int field7829;

    @OriginalMember(owner = "client!fl", name = "V", descriptor = "Z")
    public static boolean field7833;

    @OriginalMember(owner = "client!fl", name = "K", descriptor = "()V")
    public final void method34() {
        field7803++;
        this.field7817 = this.field7816 = this.field7821 = this.field7814 = this.field7809 = this.field7807 = this.field7806 = this.field7797 = this.field7819 = 0.0F;
        this.field7822 = this.field7804 = this.field7796 = 1.0F;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)[F")
    public final float[] method3141(int arg0) {
        field7801++;
        class121.field1900[9] = this.field7807;
        class121.field1900[0] = this.field7822;
        class121.field1900[2] = this.field7816;
        if (arg0 > -111) {
            this.field7814 = 0.4063937F;
        }
        class121.field1900[14] = 0.0F;
        class121.field1900[8] = this.field7809;
        class121.field1900[6] = this.field7814;
        class121.field1900[10] = this.field7796;
        class121.field1900[13] = 0.0F;
        class121.field1900[12] = 0.0F;
        class121.field1900[5] = this.field7804;
        class121.field1900[1] = this.field7817;
        class121.field1900[4] = this.field7821;
        return class121.field1900;
    }

    @OriginalMember(owner = "client!fl", name = "ya", descriptor = "(Ln;)V")
    public final void method45(class15 arg0) {
        field7824++;
        class530 var2 = (class530) arg0;
        this.field7816 = var2.field7816;
        this.field7821 = var2.field7821;
        this.field7806 = var2.field7806;
        this.field7804 = var2.field7804;
        this.field7797 = var2.field7797;
        this.field7807 = var2.field7807;
        this.field7796 = var2.field7796;
        this.field7814 = var2.field7814;
        this.field7809 = var2.field7809;
        this.field7819 = var2.field7819;
        this.field7817 = var2.field7817;
        this.field7822 = var2.field7822;
    }

    @OriginalMember(owner = "client!fl", name = "SA", descriptor = "(I)V")
    public final void method44(int arg0) {
        this.field7822 = 1.0F;
        field7798++;
        this.field7804 = this.field7796 = class293.field4368[arg0 & 0x3FFF];
        this.field7814 = class293.field4363[arg0 & 0x3FFF];
        this.field7807 = -this.field7814;
        this.field7821 = this.field7809 = this.field7806 = this.field7817 = this.field7797 = this.field7816 = this.field7819 = 0.0F;
    }

    @OriginalMember(owner = "client!fl", name = "IA", descriptor = "(IIIIII)V")
    public final void method35(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field7825++;
        float var7 = class293.field4368[arg3 & 0x3FFF];
        float var8 = class293.field4363[arg3 & 0x3FFF];
        float var9 = class293.field4368[arg4 & 0x3FFF];
        float var10 = class293.field4363[arg4 & 0x3FFF];
        float var11 = class293.field4368[arg5 & 0x3FFF];
        float var12 = class293.field4363[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field7809 = -var10 * var11 + var9 * var14;
        this.field7822 = var9 * var11 + var10 * var14;
        this.field7814 = -var8;
        this.field7796 = var7 * var9;
        this.field7817 = -var9 * var12 + var10 * var13;
        this.field7807 = var9 * var13 + var10 * var12;
        this.field7816 = var7 * var10;
        this.field7821 = var7 * var12;
        this.field7804 = var7 * var11;
        this.field7806 = (float) (-arg0) * this.field7822 - ((float) arg1 * this.field7821) - ((float) arg2 * this.field7809);
        this.field7819 = (float) (-arg0) * this.field7816 - (float) arg1 * this.field7814 - ((float) arg2 * this.field7796);
        this.field7797 = (float) (-arg0) * this.field7817 - (float) arg1 * this.field7804 - ((float) arg2 * this.field7807);
    }

    @OriginalMember(owner = "client!fl", name = "C", descriptor = "(III)V")
    public final void method47(int arg0, int arg1, int arg2) {
        this.field7817 = this.field7816 = this.field7821 = this.field7814 = this.field7809 = this.field7807 = 0.0F;
        this.field7797 = arg1;
        this.field7819 = arg2;
        this.field7822 = this.field7804 = this.field7796 = 1.0F;
        this.field7806 = arg0;
        field7800++;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(III[I)V")
    public final void method43(int arg0, int arg1, int arg2, int[] arg3) {
        field7815++;
        arg3[2] = (int) ((float) arg2 * this.field7796 + (float) arg0 * this.field7816 + (float) arg1 * this.field7814 + this.field7819);
        arg3[1] = (int) ((float) arg2 * this.field7807 + (float) arg0 * this.field7817 + (float) arg1 * this.field7804 + this.field7797);
        arg3[0] = (int) ((float) arg2 * this.field7809 + (float) arg0 * this.field7822 + (float) arg1 * this.field7821 + this.field7806);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IFFIIIF)V")
    public final void method3142(int arg0, float arg1, float arg2, int arg3, int arg4, int arg5, float arg6) {
        field7820++;
        if (arg4 == arg5) {
            this.field7796 = 1.0F;
            this.field7822 = arg3;
            this.field7804 = arg0;
            this.field7817 = this.field7816 = this.field7821 = this.field7814 = this.field7809 = this.field7807 = 0.0F;
        } else {
            float var8 = class293.field4368[arg4 & 0x3FFF];
            float var9 = class293.field4363[arg4 & 0x3FFF];
            this.field7796 = 1.0F;
            this.field7817 = (float) arg3 * var9;
            this.field7804 = (float) arg0 * var8;
            this.field7822 = (float) arg3 * var8;
            this.field7821 = (float) arg0 * -var9;
            this.field7816 = this.field7814 = this.field7809 = this.field7807 = 0.0F;
        }
        this.field7806 = arg1;
        this.field7819 = arg2;
        this.field7797 = arg6;
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(I)V")
    public static final void method3143(int arg0) {
        if (arg0 <= 59) {
            return;
        }
        field7813++;
        if (class230.field3443 != null) {
            return;
        }
        Container var1;
        if (class70.field1153 == null) {
            var1 = class280.field4173.field5824;
        } else {
            var1 = class70.field1153;
        }
        class228.field3431 = var1.getSize().width;
        class299.field4463 = var1.getSize().height;
        if (class70.field1153 == var1) {
            Insets var2 = class70.field1153.getInsets();
            class228.field3431 -= var2.right + var2.left;
            class299.field4463 -= var2.top + var2.bottom;
        }
        if (class360.method2235(32397) == 1) {
            class50.field927 = class277.field4136;
            class360.field5250 = (class228.field3431 - class277.field4136) / 2;
            class245.field3670 = 0;
            class76.field1247 = class219.field3349;
        } else if (class414.field5859 < 96 && class74.field1211 == 0) {
            int var3 = class228.field3431 > 1024 ? 1024 : class228.field3431;
            class360.field5250 = (class228.field3431 - var3) / 2;
            int var4 = class299.field4463 <= 768 ? class299.field4463 : 768;
            class50.field927 = var3;
            class245.field3670 = 0;
            class76.field1247 = var4;
        } else {
            class76.field1247 = class299.field4463;
            class245.field3670 = 0;
            class50.field927 = class228.field3431;
            class360.field5250 = 0;
        }
        if (class438.field6237 != class368.field5320) {
            boolean var10000;
            if (class50.field927 < 1024 && class76.field1247 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        class481.field6991.setSize(class50.field927, class76.field1247);
        if (class76.field1256 != null) {
            class76.field1256.method362(class481.field6991);
        }
        if (class70.field1153 == var1) {
            Insets var5 = class70.field1153.getInsets();
            class481.field6991.setLocation(class360.field5250 + var5.left, var5.top - -class245.field3670);
        } else {
            class481.field6991.setLocation(class360.field5250, class245.field3670);
        }
        if (class188.field2765 != -1) {
            class198.method1343(true, -1);
        }
        class219.method1485((byte) 113);
    }

    @OriginalMember(owner = "client!fl", name = "M", descriptor = "([I)V")
    public final void method40(int[] arg0) {
        field7808++;
        float var2 = (float) arg0[0] - this.field7806;
        float var3 = (float) arg0[1] - this.field7797;
        float var4 = (float) arg0[2] - this.field7819;
        arg0[2] = (int) (this.field7796 * var4 + this.field7809 * var2 + this.field7807 * var3);
        arg0[0] = (int) (this.field7816 * var4 + this.field7822 * var2 + this.field7817 * var3);
        arg0[1] = (int) (this.field7814 * var4 + this.field7821 * var2 + this.field7804 * var3);
    }

    @OriginalMember(owner = "client!fl", name = "WA", descriptor = "(I)V")
    public final void method46(int arg0) {
        field7829++;
        this.field7796 = 1.0F;
        this.field7822 = this.field7804 = class293.field4368[arg0 & 0x3FFF];
        this.field7817 = class293.field4363[arg0 & 0x3FFF];
        this.field7821 = -this.field7817;
        this.field7809 = this.field7806 = this.field7807 = this.field7797 = this.field7816 = this.field7814 = this.field7819 = 0.0F;
    }

    @OriginalMember(owner = "client!fl", name = "N", descriptor = "(III[I)V")
    public final void method42(int arg0, int arg1, int arg2, int[] arg3) {
        field7812++;
        arg3[1] = (int) ((float) arg2 * this.field7807 + (float) arg0 * this.field7817 + (float) arg1 * this.field7804);
        arg3[0] = (int) ((float) arg2 * this.field7809 + (float) arg0 * this.field7822 + (float) arg1 * this.field7821);
        arg3[2] = (int) ((float) arg2 * this.field7796 + (float) arg0 * this.field7816 + (float) arg1 * this.field7814);
    }

    @OriginalMember(owner = "client!fl", name = "J", descriptor = "(III)V")
    public final void method37(int arg0, int arg1, int arg2) {
        this.field7797 += arg1;
        field7826++;
        this.field7806 += arg0;
        this.field7819 += arg2;
    }

    @OriginalMember(owner = "client!fl", name = "CA", descriptor = "(I)V")
    public final void method36(int arg0) {
        field7810++;
        float var2 = class293.field4368[arg0 & 0x3FFF];
        float var3 = class293.field4363[arg0 & 0x3FFF];
        float var4 = this.field7822;
        float var5 = this.field7821;
        float var6 = this.field7809;
        float var7 = this.field7806;
        this.field7822 = this.field7816 * var3 + var2 * var4;
        this.field7821 = this.field7814 * var3 + var2 * var5;
        this.field7816 = this.field7816 * var2 - var3 * var4;
        this.field7809 = this.field7796 * var3 + var2 * var6;
        this.field7814 = this.field7814 * var2 - (var3 * var5);
        this.field7796 = this.field7796 * var2 - var3 * var6;
        this.field7806 = this.field7819 * var3 + var2 * var7;
        this.field7819 = this.field7819 * var2 - (var3 * var7);
    }

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "(B)[F")
    public final float[] method3144(byte arg0) {
        field7823++;
        class121.field1900[2] = this.field7816;
        class121.field1900[12] = this.field7806;
        class121.field1900[14] = this.field7819;
        class121.field1900[10] = this.field7796;
        class121.field1900[0] = this.field7822;
        class121.field1900[4] = this.field7821;
        class121.field1900[1] = this.field7817;
        class121.field1900[9] = this.field7807;
        class121.field1900[6] = this.field7814;
        class121.field1900[5] = this.field7804;
        if (arg0 == -42) {
            class121.field1900[13] = this.field7797;
            class121.field1900[8] = this.field7809;
            return class121.field1900;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "(I)V")
    public static void method3145(int arg0) {
        field7827 = null;
        field7831 = null;
        if (arg0 != 23381) {
            field7811 = 97;
        }
        field7832 = null;
    }

    @OriginalMember(owner = "client!fl", name = "s", descriptor = "(I)V")
    public final void method41(int arg0) {
        this.field7804 = 1.0F;
        field7802++;
        this.field7822 = this.field7796 = class293.field4368[arg0 & 0x3FFF];
        this.field7809 = class293.field4363[arg0 & 0x3FFF];
        this.field7816 = -this.field7809;
        this.field7821 = this.field7806 = this.field7817 = this.field7807 = this.field7797 = this.field7814 = this.field7819 = 0.0F;
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "()V")
    public class530() {
        this.method34();
    }

    @OriginalMember(owner = "client!fl", name = "ba", descriptor = "(I)V")
    public final void method39(int arg0) {
        field7805++;
        float var2 = class293.field4368[arg0 & 0x3FFF];
        float var3 = class293.field4363[arg0 & 0x3FFF];
        float var4 = this.field7817;
        float var5 = this.field7804;
        float var6 = this.field7807;
        this.field7817 = var2 * var4 - (this.field7816 * var3);
        float var7 = this.field7797;
        this.field7816 = this.field7816 * var2 + var3 * var4;
        this.field7804 = var2 * var5 - this.field7814 * var3;
        this.field7807 = var2 * var6 - (this.field7796 * var3);
        this.field7814 = this.field7814 * var2 + var3 * var5;
        this.field7797 = var2 * var7 - this.field7819 * var3;
        this.field7796 = this.field7796 * var2 + var3 * var6;
        this.field7819 = this.field7819 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "()Ln;")
    public final class15 method38() {
        field7828++;
        class530 var1 = new class530();
        var1.field7804 = this.field7804;
        var1.field7797 = this.field7797;
        var1.field7809 = this.field7809;
        var1.field7796 = this.field7796;
        var1.field7807 = this.field7807;
        var1.field7822 = this.field7822;
        var1.field7806 = this.field7806;
        var1.field7814 = this.field7814;
        var1.field7816 = this.field7816;
        var1.field7817 = this.field7817;
        var1.field7819 = this.field7819;
        var1.field7821 = this.field7821;
        return var1;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Ln;I)V")
    public final void method3146(class15 arg0, int arg1) {
        field7799++;
        class530 var3 = (class530) arg0;
        this.field7822 = var3.field7822;
        this.field7809 = var3.field7816;
        this.field7821 = var3.field7817;
        this.field7816 = var3.field7809;
        if (arg1 != 768) {
            field7811 = -16;
        }
        this.field7807 = var3.field7814;
        this.field7817 = var3.field7821;
        this.field7804 = var3.field7804;
        this.field7796 = var3.field7796;
        this.field7806 = -(this.field7809 * var3.field7819 + this.field7822 * var3.field7806 + this.field7821 * var3.field7797);
        this.field7814 = var3.field7807;
        this.field7797 = -(this.field7807 * var3.field7819 + this.field7817 * var3.field7806 + this.field7804 * var3.field7797);
        this.field7819 = -(this.field7796 * var3.field7819 + this.field7816 * var3.field7806 + this.field7814 * var3.field7797);
    }
}
