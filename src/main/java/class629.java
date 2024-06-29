import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class629 extends class73 {

    @OriginalMember(owner = "client!vb", name = "C", descriptor = "Ltm;")
    public static class334 field8835 = new class334(41, 8);

    @OriginalMember(owner = "client!vb", name = "M", descriptor = "Lbu;")
    public static class147 field8844 = new class147(2);

    @OriginalMember(owner = "client!vb", name = "R", descriptor = "[Lvga;")
    public static class82[] field8849 = new class82[14];

    @OriginalMember(owner = "client!vb", name = "S", descriptor = "[Lsr;")
    public static class540[] field8850 = new class540[300];

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "F")
    public float field8815;

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "F")
    public float field8816;

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "F")
    public float field8817;

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "F")
    public float field8820;

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "F")
    public float field8821;

    @OriginalMember(owner = "client!vb", name = "t", descriptor = "F")
    public float field8826;

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "F")
    public float field8827;

    @OriginalMember(owner = "client!vb", name = "A", descriptor = "F")
    public float field8833;

    @OriginalMember(owner = "client!vb", name = "D", descriptor = "F")
    public float field8836;

    @OriginalMember(owner = "client!vb", name = "G", descriptor = "F")
    public float field8838;

    @OriginalMember(owner = "client!vb", name = "J", descriptor = "F")
    public float field8841;

    @OriginalMember(owner = "client!vb", name = "N", descriptor = "F")
    public float field8845;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "I")
    public static int field8818;

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "I")
    public static int field8819;

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "I")
    public static int field8822;

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "I")
    public static int field8823;

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "I")
    public static int field8824;

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "I")
    public static int field8825;

    @OriginalMember(owner = "client!vb", name = "v", descriptor = "I")
    public static int field8828;

    @OriginalMember(owner = "client!vb", name = "w", descriptor = "I")
    public static int field8829;

    @OriginalMember(owner = "client!vb", name = "x", descriptor = "I")
    public static int field8830;

    @OriginalMember(owner = "client!vb", name = "y", descriptor = "I")
    public static int field8831;

    @OriginalMember(owner = "client!vb", name = "z", descriptor = "I")
    public static int field8832;

    @OriginalMember(owner = "client!vb", name = "B", descriptor = "I")
    public static int field8834;

    @OriginalMember(owner = "client!vb", name = "E", descriptor = "I")
    public static int field8837;

    @OriginalMember(owner = "client!vb", name = "H", descriptor = "I")
    public static int field8839;

    @OriginalMember(owner = "client!vb", name = "K", descriptor = "I")
    public static int field8842;

    @OriginalMember(owner = "client!vb", name = "L", descriptor = "I")
    public static int field8843;

    @OriginalMember(owner = "client!vb", name = "P", descriptor = "I")
    public static int field8847;

    @OriginalMember(owner = "client!vb", name = "Q", descriptor = "I")
    public static int field8848;

    @OriginalMember(owner = "client!vb", name = "O", descriptor = "Lit;")
    public static class34 field8846;

    @OriginalMember(owner = "client!vb", name = "I", descriptor = "Lti;")
    public static class689 field8840;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(III[I)V", line = 4)
    public final void method664(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field8816 + (float) arg0 * this.field8836 + (float) arg1 * this.field8833);
        field8831++;
        arg3[0] = (int) ((float) arg2 * this.field8845 + (float) arg0 * this.field8826 + (float) arg1 * this.field8821);
        arg3[1] = (int) ((float) arg2 * this.field8815 + (float) arg0 * this.field8838 + (float) arg1 * this.field8841);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "([I)V", line = 14)
    public final void method666(int[] arg0) {
        field8847++;
        float var2 = (float) arg0[0] - this.field8820;
        float var3 = (float) arg0[1] - this.field8827;
        float var4 = (float) arg0[2] - this.field8817;
        arg0[2] = (int) (this.field8816 * var4 + this.field8845 * var2 + this.field8815 * var3);
        arg0[1] = (int) (this.field8833 * var4 + this.field8841 * var3 + this.field8821 * var2);
        arg0[0] = (int) (this.field8836 * var4 + this.field8838 * var3 + this.field8826 * var2);
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)V", line = 32)
    public final void method670(int arg0) {
        this.field8816 = 1.0F;
        field8837++;
        this.field8826 = this.field8841 = class140.field2184[arg0 & 0x3FFF];
        this.field8838 = class140.field2186[arg0 & 0x3FFF];
        this.field8821 = -this.field8838;
        this.field8845 = this.field8820 = this.field8815 = this.field8827 = this.field8836 = this.field8833 = this.field8817 = 0.0F;
    }

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "(I)V", line = 45)
    public final void method676(int arg0) {
        field8842++;
        this.field8841 = 1.0F;
        this.field8826 = this.field8816 = class140.field2184[arg0 & 0x3FFF];
        this.field8845 = class140.field2186[arg0 & 0x3FFF];
        this.field8821 = this.field8820 = this.field8838 = this.field8815 = this.field8827 = this.field8833 = this.field8817 = 0.0F;
        this.field8836 = -this.field8845;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IBI)Z", line = 58)
    public static final boolean method3565(int arg0, byte arg1, int arg2) {
        if (arg1 == 54) {
            field8843++;
            return (arg2 & 0x21) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIII)V", line = 72)
    public final void method668(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field8818++;
        float var7 = class140.field2184[arg3 & 0x3FFF];
        float var8 = class140.field2186[arg3 & 0x3FFF];
        float var9 = class140.field2184[arg4 & 0x3FFF];
        float var10 = class140.field2186[arg4 & 0x3FFF];
        float var11 = class140.field2184[arg5 & 0x3FFF];
        float var12 = class140.field2186[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field8838 = -var9 * var12 + var10 * var13;
        this.field8815 = var9 * var13 + var10 * var12;
        this.field8816 = var7 * var9;
        this.field8821 = var7 * var12;
        this.field8826 = var9 * var11 + var10 * var14;
        this.field8836 = var7 * var10;
        this.field8841 = var7 * var11;
        this.field8845 = -var10 * var11 + var9 * var14;
        this.field8833 = -var8;
        this.field8817 = (float) (-arg0) * this.field8836 - ((float) arg1 * this.field8833) - ((float) arg2 * this.field8816);
        this.field8820 = (float) (-arg0) * this.field8826 - (float) arg1 * this.field8821 - ((float) arg2 * this.field8845);
        this.field8827 = (float) (-arg0) * this.field8838 - ((float) arg1 * this.field8841) - (float) arg2 * this.field8815;
    }

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "(I)V", line = 109)
    public static void method3566(int arg0) {
        if (arg0 != 1) {
            return;
        }
        field8849 = null;
        field8850 = null;
        field8846 = null;
        field8840 = null;
        field8835 = null;
        field8844 = null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(III)V", line = 126)
    public final void method671(int arg0, int arg1, int arg2) {
        field8819++;
        this.field8827 += arg1;
        this.field8820 += arg0;
        this.field8817 += arg2;
    }

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "(I)V", line = 138)
    public final void method678(int arg0) {
        field8824++;
        float var2 = class140.field2184[arg0 & 0x3FFF];
        float var3 = class140.field2186[arg0 & 0x3FFF];
        float var4 = this.field8826;
        float var5 = this.field8821;
        float var6 = this.field8845;
        float var7 = this.field8820;
        this.field8826 = this.field8836 * var3 + var2 * var4;
        this.field8821 = this.field8833 * var3 + var2 * var5;
        this.field8836 = this.field8836 * var2 - (var3 * var4);
        this.field8845 = this.field8816 * var3 + var2 * var6;
        this.field8833 = this.field8833 * var2 - var3 * var5;
        this.field8816 = this.field8816 * var2 - var3 * var6;
        this.field8820 = this.field8817 * var3 + var2 * var7;
        this.field8817 = this.field8817 * var2 - (var3 * var7);
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "()V", line = 179)
    public final void method677() {
        this.field8838 = this.field8836 = this.field8821 = this.field8833 = this.field8845 = this.field8815 = this.field8820 = this.field8827 = this.field8817 = 0.0F;
        field8832++;
        this.field8826 = this.field8841 = this.field8816 = 1.0F;
    }

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "(I)V", line = 191)
    public final void method674(int arg0) {
        field8828++;
        this.field8826 = 1.0F;
        this.field8841 = this.field8816 = class140.field2184[arg0 & 0x3FFF];
        this.field8833 = class140.field2186[arg0 & 0x3FFF];
        this.field8815 = -this.field8833;
        this.field8821 = this.field8845 = this.field8820 = this.field8838 = this.field8827 = this.field8836 = this.field8817 = 0.0F;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ltc;)V", line = 203)
    public final void method673(class73 arg0) {
        field8823++;
        class629 var2 = (class629) arg0;
        this.field8845 = var2.field8845;
        this.field8815 = var2.field8815;
        this.field8821 = var2.field8821;
        this.field8817 = var2.field8817;
        this.field8827 = var2.field8827;
        this.field8820 = var2.field8820;
        this.field8836 = var2.field8836;
        this.field8838 = var2.field8838;
        this.field8841 = var2.field8841;
        this.field8816 = var2.field8816;
        this.field8826 = var2.field8826;
        this.field8833 = var2.field8833;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "()Ltc;", line = 225)
    public final class73 method663() {
        field8839++;
        class629 var1 = new class629();
        var1.field8817 = this.field8817;
        var1.field8815 = this.field8815;
        var1.field8836 = this.field8836;
        var1.field8838 = this.field8838;
        var1.field8841 = this.field8841;
        var1.field8816 = this.field8816;
        var1.field8845 = this.field8845;
        var1.field8833 = this.field8833;
        var1.field8826 = this.field8826;
        var1.field8820 = this.field8820;
        var1.field8827 = this.field8827;
        var1.field8821 = this.field8821;
        return var1;
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(III[I)V", line = 256)
    public final void method665(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field8816 + (float) arg0 * this.field8836 + (float) arg1 * this.field8833 + this.field8817);
        arg3[1] = (int) ((float) arg2 * this.field8815 + (float) arg0 * this.field8838 + (float) arg1 * this.field8841 + this.field8827);
        field8829++;
        arg3[0] = (int) ((float) arg2 * this.field8845 + (float) arg0 * this.field8826 + (float) arg1 * this.field8821 + this.field8820);
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(III)V", line = 270)
    public final void method675(int arg0, int arg1, int arg2) {
        this.field8826 = this.field8841 = this.field8816 = 1.0F;
        this.field8820 = arg0;
        this.field8838 = this.field8836 = this.field8821 = this.field8833 = this.field8845 = this.field8815 = 0.0F;
        this.field8827 = arg1;
        field8825++;
        this.field8817 = arg2;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(III[I)V", line = 290)
    public final void method662(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (int) ((float) arg0 - this.field8820);
        field8834++;
        int var6 = (int) ((float) arg2 - this.field8817);
        int var7 = (int) ((float) arg1 - this.field8827);
        arg3[2] = (int) ((float) var6 * this.field8816 + (float) var5 * this.field8845 + (float) var7 * this.field8815);
        arg3[1] = (int) ((float) var6 * this.field8833 + (float) var5 * this.field8821 + (float) var7 * this.field8841);
        arg3[0] = (int) ((float) var6 * this.field8836 + (float) var5 * this.field8826 + (float) var7 * this.field8838);
    }

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "(I)V", line = 310)
    public final void method672(int arg0) {
        field8830++;
        float var2 = class140.field2184[arg0 & 0x3FFF];
        float var3 = class140.field2186[arg0 & 0x3FFF];
        float var4 = this.field8838;
        float var5 = this.field8841;
        float var6 = this.field8815;
        this.field8838 = var2 * var4 - this.field8836 * var3;
        float var7 = this.field8827;
        this.field8836 = this.field8836 * var2 + var3 * var4;
        this.field8841 = var2 * var5 - (this.field8833 * var3);
        this.field8833 = this.field8833 * var2 + var3 * var5;
        this.field8815 = var2 * var6 - (this.field8816 * var3);
        this.field8827 = var2 * var7 - (this.field8817 * var3);
        this.field8816 = this.field8816 * var2 + var3 * var6;
        this.field8817 = this.field8817 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V", line = 341)
    public final void method667(int arg0) {
        field8822++;
        float var2 = class140.field2184[arg0 & 0x3FFF];
        float var3 = class140.field2186[arg0 & 0x3FFF];
        float var4 = this.field8826;
        float var5 = this.field8821;
        float var6 = this.field8845;
        float var7 = this.field8820;
        this.field8826 = var2 * var4 - this.field8838 * var3;
        this.field8838 = this.field8838 * var2 + var3 * var4;
        this.field8821 = var2 * var5 - (this.field8841 * var3);
        this.field8841 = this.field8841 * var2 + var3 * var5;
        this.field8845 = var2 * var6 - (this.field8815 * var3);
        this.field8820 = var2 * var7 - (this.field8827 * var3);
        this.field8815 = this.field8815 * var2 + var3 * var6;
        this.field8827 = this.field8827 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "()V", line = 369)
    public class629() {
        this.method677();
    }
}
