import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class195 extends class163 {

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "I")
    public int field2762;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "I")
    public int field2763;

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "I")
    public int field2764;

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "I")
    public int field2765;

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "I")
    public int field2766;

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "I")
    public int field2767;

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "I")
    public int field2768;

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "I")
    public int field2769;

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "I")
    public int field2770;

    @OriginalMember(owner = "client!tg", name = "n", descriptor = "I")
    public int field2771;

    @OriginalMember(owner = "client!tg", name = "o", descriptor = "I")
    public int field2772;

    @OriginalMember(owner = "client!tg", name = "p", descriptor = "I")
    public int field2773;

    @OriginalMember(owner = "client!tg", name = "oa", descriptor = "(III)V")
    public final void method1054(int arg0, int arg1, int arg2) {
        this.field2765 = this.field2771 = this.field2769 = this.field2773 = this.field2772 = this.field2763 = 0;
        this.field2770 = this.field2762 = this.field2766 = 32768;
        this.field2768 = arg0;
        this.field2767 = arg1;
        this.field2764 = arg2;
    }

    @OriginalMember(owner = "client!tg", name = "ta", descriptor = "(I)V")
    public final void method1046(int arg0) {
        this.field2766 = 32768;
        this.field2770 = this.field2762 = class1.field7[arg0 & 0x3FFF];
        this.field2765 = class1.field2[arg0 & 0x3FFF];
        this.field2769 = -this.field2765;
        this.field2772 = this.field2768 = this.field2763 = this.field2767 = this.field2771 = this.field2773 = this.field2764 = 0;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(III[I)V")
    public final void method1044(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (this.field2772 * arg2 + this.field2770 * arg0 + this.field2769 * arg1 >> 15) + this.field2768;
        arg3[1] = (this.field2763 * arg2 + this.field2765 * arg0 + this.field2762 * arg1 >> 15) + this.field2767;
        arg3[2] = (this.field2766 * arg2 + this.field2773 * arg1 + this.field2771 * arg0 >> 15) + this.field2764;
    }

    @OriginalMember(owner = "client!tg", name = "XA", descriptor = "(I)V")
    public final void method1048(int arg0) {
        int var2 = class1.field7[arg0 & 0x3FFF];
        int var3 = class1.field2[arg0 & 0x3FFF];
        int var4 = this.field2770;
        int var5 = this.field2769;
        int var6 = this.field2772;
        int var7 = this.field2768;
        this.field2770 = this.field2771 * var3 + var2 * var4 >> 15;
        this.field2771 = this.field2771 * var2 - var3 * var4 >> 15;
        this.field2769 = this.field2773 * var3 + var2 * var5 >> 15;
        this.field2773 = this.field2773 * var2 - var3 * var5 >> 15;
        this.field2772 = this.field2766 * var3 + var2 * var6 >> 15;
        this.field2766 = this.field2766 * var2 - var3 * var6 >> 15;
        this.field2768 = this.field2764 * var3 + var2 * var7 >> 15;
        this.field2764 = this.field2764 * var2 - var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "()Lm;")
    public final class163 method1050() {
        class195 var1 = new class195();
        var1.field2770 = this.field2770;
        var1.field2769 = this.field2769;
        var1.field2772 = this.field2772;
        var1.field2768 = this.field2768;
        var1.field2765 = this.field2765;
        var1.field2762 = this.field2762;
        var1.field2763 = this.field2763;
        var1.field2767 = this.field2767;
        var1.field2771 = this.field2771;
        var1.field2773 = this.field2773;
        var1.field2766 = this.field2766;
        var1.field2764 = this.field2764;
        return var1;
    }

    @OriginalMember(owner = "client!tg", name = "va", descriptor = "([I)V")
    public final void method1042(int[] arg0) {
        int var2 = arg0[0] - this.field2768;
        int var3 = arg0[1] - this.field2767;
        int var4 = arg0[2] - this.field2764;
        arg0[0] = this.field2771 * var4 + this.field2770 * var2 + this.field2765 * var3 >> 15;
        arg0[1] = this.field2773 * var4 + this.field2769 * var2 + this.field2762 * var3 >> 15;
        arg0[2] = this.field2766 * var4 + this.field2772 * var2 + this.field2763 * var3 >> 15;
    }

    @OriginalMember(owner = "client!tg", name = "TA", descriptor = "(III)V")
    public final void method1051(int arg0, int arg1, int arg2) {
        this.field2768 += arg0;
        this.field2767 += arg1;
        this.field2764 += arg2;
    }

    @OriginalMember(owner = "client!tg", name = "ma", descriptor = "(I)V")
    public final void method1047(int arg0) {
        this.field2762 = 32768;
        this.field2770 = this.field2766 = class1.field7[arg0 & 0x3FFF];
        this.field2772 = class1.field2[arg0 & 0x3FFF];
        this.field2771 = -this.field2772;
        this.field2769 = this.field2768 = this.field2765 = this.field2763 = this.field2767 = this.field2773 = this.field2764 = 0;
    }

    @OriginalMember(owner = "client!tg", name = "I", descriptor = "(III[I)V")
    public final void method1041(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = this.field2772 * arg2 + this.field2770 * arg0 + this.field2769 * arg1 >> 15;
        arg3[1] = this.field2763 * arg2 + this.field2765 * arg0 + this.field2762 * arg1 >> 15;
        arg3[2] = this.field2766 * arg2 + this.field2773 * arg1 + this.field2771 * arg0 >> 15;
    }

    @OriginalMember(owner = "client!tg", name = "KA", descriptor = "(I)V")
    public final void method1053(int arg0) {
        this.field2770 = 32768;
        this.field2762 = this.field2766 = class1.field7[arg0 & 0x3FFF];
        this.field2773 = class1.field2[arg0 & 0x3FFF];
        this.field2763 = -this.field2773;
        this.field2769 = this.field2772 = this.field2768 = this.field2765 = this.field2767 = this.field2771 = this.field2764 = 0;
    }

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "(I)V")
    public final void method1043(int arg0) {
        int var2 = class1.field7[arg0 & 0x3FFF];
        int var3 = class1.field2[arg0 & 0x3FFF];
        int var4 = this.field2765;
        int var5 = this.field2762;
        int var6 = this.field2763;
        int var7 = this.field2767;
        this.field2765 = var2 * var4 - this.field2771 * var3 >> 15;
        this.field2771 = this.field2771 * var2 + var3 * var4 >> 15;
        this.field2762 = var2 * var5 - this.field2773 * var3 >> 15;
        this.field2773 = this.field2773 * var2 + var3 * var5 >> 15;
        this.field2763 = var2 * var6 - this.field2766 * var3 >> 15;
        this.field2766 = this.field2766 * var2 + var3 * var6 >> 15;
        this.field2767 = var2 * var7 - this.field2764 * var3 >> 15;
        this.field2764 = this.field2764 * var2 + var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!tg", name = "EA", descriptor = "(Lm;)V")
    public final void method1049(class163 arg0) {
        class195 var2 = (class195) arg0;
        this.field2770 = var2.field2770;
        this.field2769 = var2.field2769;
        this.field2772 = var2.field2772;
        this.field2768 = var2.field2768;
        this.field2765 = var2.field2765;
        this.field2762 = var2.field2762;
        this.field2763 = var2.field2763;
        this.field2767 = var2.field2767;
        this.field2771 = var2.field2771;
        this.field2773 = var2.field2773;
        this.field2766 = var2.field2766;
        this.field2764 = var2.field2764;
    }

    @OriginalMember(owner = "client!tg", name = "ha", descriptor = "()V")
    public final void method1045() {
        this.field2765 = this.field2771 = this.field2769 = this.field2773 = this.field2772 = this.field2763 = this.field2768 = this.field2767 = this.field2764 = 0;
        this.field2770 = this.field2762 = this.field2766 = 32768;
    }

    @OriginalMember(owner = "client!tg", name = "B", descriptor = "(IIIIII)V")
    public final void method1040(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class1.field7[arg3 & 0x3FFF];
        int var8 = class1.field2[arg3 & 0x3FFF];
        int var9 = class1.field7[arg4 & 0x3FFF];
        int var10 = class1.field2[arg4 & 0x3FFF];
        int var11 = class1.field7[arg5 & 0x3FFF];
        int var12 = class1.field2[arg5 & 0x3FFF];
        int var13 = var8 * var11 >> 15;
        int var14 = var8 * var12 >> 15;
        this.field2770 = var9 * var11 + var10 * var14 >> 15;
        this.field2765 = -var9 * var12 + var10 * var13 >> 15;
        this.field2771 = var7 * var10 >> 15;
        this.field2769 = var7 * var12 >> 15;
        this.field2762 = var7 * var11 >> 15;
        this.field2773 = -var8;
        this.field2772 = -var10 * var11 + var9 * var14 >> 15;
        this.field2763 = var9 * var13 + var10 * var12 >> 15;
        this.field2766 = var7 * var9 >> 15;
        this.field2768 = -arg0 * this.field2770 - this.field2769 * arg1 - this.field2772 * arg2 >> 15;
        this.field2767 = -arg0 * this.field2765 - this.field2762 * arg1 - this.field2763 * arg2 >> 15;
        this.field2764 = -arg0 * this.field2771 - this.field2773 * arg1 - this.field2766 * arg2 >> 15;
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "()V")
    public class195() {
        this.method1045();
    }
}
