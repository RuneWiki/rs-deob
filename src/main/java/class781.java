import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hda")
public class class781 extends class326 {

    @OriginalMember(owner = "client!hda", name = "m", descriptor = "Lfba;")
    public static class27 field10718 = new class27(68, 3);

    @OriginalMember(owner = "client!hda", name = "g", descriptor = "F")
    public float field10712;

    @OriginalMember(owner = "client!hda", name = "h", descriptor = "F")
    public float field10713;

    @OriginalMember(owner = "client!hda", name = "i", descriptor = "F")
    public float field10714;

    @OriginalMember(owner = "client!hda", name = "k", descriptor = "F")
    public float field10716;

    @OriginalMember(owner = "client!hda", name = "o", descriptor = "F")
    public float field10720;

    @OriginalMember(owner = "client!hda", name = "r", descriptor = "F")
    public float field10723;

    @OriginalMember(owner = "client!hda", name = "t", descriptor = "F")
    public float field10725;

    @OriginalMember(owner = "client!hda", name = "v", descriptor = "F")
    public float field10727;

    @OriginalMember(owner = "client!hda", name = "x", descriptor = "F")
    public float field10729;

    @OriginalMember(owner = "client!hda", name = "A", descriptor = "F")
    public float field10732;

    @OriginalMember(owner = "client!hda", name = "B", descriptor = "F")
    public float field10733;

    @OriginalMember(owner = "client!hda", name = "J", descriptor = "F")
    public float field10740;

    @OriginalMember(owner = "client!hda", name = "f", descriptor = "I")
    public static int field10711;

    @OriginalMember(owner = "client!hda", name = "j", descriptor = "I")
    public static int field10715;

    @OriginalMember(owner = "client!hda", name = "l", descriptor = "I")
    public static int field10717;

    @OriginalMember(owner = "client!hda", name = "n", descriptor = "I")
    public static int field10719;

    @OriginalMember(owner = "client!hda", name = "p", descriptor = "I")
    public static int field10721;

    @OriginalMember(owner = "client!hda", name = "q", descriptor = "I")
    public static int field10722;

    @OriginalMember(owner = "client!hda", name = "s", descriptor = "I")
    public static int field10724;

    @OriginalMember(owner = "client!hda", name = "u", descriptor = "I")
    public static int field10726;

    @OriginalMember(owner = "client!hda", name = "w", descriptor = "I")
    public static int field10728;

    @OriginalMember(owner = "client!hda", name = "y", descriptor = "I")
    public static int field10730;

    @OriginalMember(owner = "client!hda", name = "z", descriptor = "I")
    public static int field10731;

    @OriginalMember(owner = "client!hda", name = "C", descriptor = "I")
    public static int field10734;

    @OriginalMember(owner = "client!hda", name = "D", descriptor = "I")
    public static int field10735;

    @OriginalMember(owner = "client!hda", name = "E", descriptor = "I")
    public static int field10736;

    @OriginalMember(owner = "client!hda", name = "F", descriptor = "I")
    public static int field10737;

    @OriginalMember(owner = "client!hda", name = "G", descriptor = "I")
    public static int field10738;

    @OriginalMember(owner = "client!hda", name = "H", descriptor = "I")
    public static int field10739;

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(III)V")
    public final void method1878(int arg0, int arg1, int arg2) {
        this.field10720 += arg1;
        this.field10727 += arg2;
        field10724++;
        this.field10740 += arg0;
    }

    @OriginalMember(owner = "client!hda", name = "g", descriptor = "(I)V")
    public static void method4290(int arg0) {
        field10718 = null;
        if (arg0 != -19341) {
            method4290(-79);
        }
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(IIIIII)V")
    public final void method1870(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field10731++;
        float var7 = class317.field4515[arg3 & 0x3FFF];
        float var8 = class317.field4513[arg3 & 0x3FFF];
        float var9 = class317.field4515[arg4 & 0x3FFF];
        float var10 = class317.field4513[arg4 & 0x3FFF];
        float var11 = class317.field4515[arg5 & 0x3FFF];
        float var12 = class317.field4513[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field10716 = var7 * var10;
        this.field10725 = var9 * var13 + var10 * var12;
        this.field10732 = var9 * var11 + var10 * var14;
        this.field10714 = -var10 * var11 + var9 * var14;
        this.field10723 = -var9 * var12 + var10 * var13;
        this.field10712 = -var8;
        this.field10729 = var7 * var12;
        this.field10733 = var7 * var11;
        this.field10713 = var7 * var9;
        this.field10740 = (float) (-arg0) * this.field10732 - (float) arg1 * this.field10729 - (float) arg2 * this.field10714;
        this.field10720 = (float) (-arg0) * this.field10723 - ((float) arg1 * this.field10733) - ((float) arg2 * this.field10725);
        this.field10727 = (float) (-arg0) * this.field10716 - ((float) arg1 * this.field10712) - (float) arg2 * this.field10713;
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "()Lqja;")
    public final class326 method1872() {
        field10735++;
        class781 var1 = new class781();
        var1.field10714 = this.field10714;
        var1.field10727 = this.field10727;
        var1.field10716 = this.field10716;
        var1.field10732 = this.field10732;
        var1.field10723 = this.field10723;
        var1.field10740 = this.field10740;
        var1.field10729 = this.field10729;
        var1.field10713 = this.field10713;
        var1.field10712 = this.field10712;
        var1.field10720 = this.field10720;
        var1.field10733 = this.field10733;
        var1.field10725 = this.field10725;
        return var1;
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(III[I)V")
    public final void method1899(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field10713 + (float) arg0 * this.field10716 + (float) arg1 * this.field10712);
        arg3[0] = (int) ((float) arg2 * this.field10714 + (float) arg0 * this.field10732 + (float) arg1 * this.field10729);
        arg3[1] = (int) ((float) arg2 * this.field10725 + (float) arg0 * this.field10723 + (float) arg1 * this.field10733);
        field10728++;
    }

    @OriginalMember(owner = "client!hda", name = "e", descriptor = "(I)V")
    public final void method1877(int arg0) {
        field10722++;
        float var2 = class317.field4515[arg0 & 0x3FFF];
        float var3 = class317.field4513[arg0 & 0x3FFF];
        float var4 = this.field10723;
        float var5 = this.field10733;
        float var6 = this.field10725;
        float var7 = this.field10720;
        this.field10723 = var2 * var4 - (this.field10716 * var3);
        this.field10733 = var2 * var5 - (this.field10712 * var3);
        this.field10716 = this.field10716 * var2 + var3 * var4;
        this.field10725 = var2 * var6 - (this.field10713 * var3);
        this.field10712 = this.field10712 * var2 + var3 * var5;
        this.field10720 = var2 * var7 - (this.field10727 * var3);
        this.field10713 = this.field10713 * var2 + var3 * var6;
        this.field10727 = this.field10727 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!hda", name = "b", descriptor = "(I)V")
    public final void method1895(int arg0) {
        field10711++;
        float var2 = class317.field4515[arg0 & 0x3FFF];
        float var3 = class317.field4513[arg0 & 0x3FFF];
        float var4 = this.field10732;
        float var5 = this.field10729;
        float var6 = this.field10714;
        this.field10732 = var2 * var4 - (this.field10723 * var3);
        float var7 = this.field10740;
        this.field10723 = this.field10723 * var2 + var3 * var4;
        this.field10729 = var2 * var5 - this.field10733 * var3;
        this.field10714 = var2 * var6 - (this.field10725 * var3);
        this.field10733 = this.field10733 * var2 + var3 * var5;
        this.field10740 = var2 * var7 - this.field10720 * var3;
        this.field10725 = this.field10725 * var2 + var3 * var6;
        this.field10720 = this.field10720 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!hda", name = "b", descriptor = "(III[I)V")
    public final void method1890(int arg0, int arg1, int arg2, int[] arg3) {
        field10734++;
        int var5 = (int) ((float) arg2 - this.field10727);
        int var6 = (int) ((float) arg1 - this.field10720);
        int var7 = (int) ((float) arg0 - this.field10740);
        arg3[0] = (int) ((float) var5 * this.field10716 + (float) var6 * this.field10723 + (float) var7 * this.field10732);
        arg3[1] = (int) ((float) var5 * this.field10712 + (float) var6 * this.field10733 + (float) var7 * this.field10729);
        arg3[2] = (int) ((float) var5 * this.field10713 + (float) var6 * this.field10725 + (float) var7 * this.field10714);
    }

    @OriginalMember(owner = "client!hda", name = "b", descriptor = "(III)V")
    public final void method1869(int arg0, int arg1, int arg2) {
        this.field10740 = arg0;
        this.field10720 = arg1;
        this.field10727 = arg2;
        field10726++;
        this.field10723 = this.field10716 = this.field10729 = this.field10712 = this.field10714 = this.field10725 = 0.0F;
        this.field10732 = this.field10733 = this.field10713 = 1.0F;
    }

    @OriginalMember(owner = "client!hda", name = "f", descriptor = "(I)V")
    public final void method1888(int arg0) {
        this.field10732 = 1.0F;
        field10730++;
        this.field10733 = this.field10713 = class317.field4515[arg0 & 0x3FFF];
        this.field10712 = class317.field4513[arg0 & 0x3FFF];
        this.field10729 = this.field10714 = this.field10740 = this.field10723 = this.field10720 = this.field10716 = this.field10727 = 0.0F;
        this.field10725 = -this.field10712;
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(I)V")
    public final void method1868(int arg0) {
        field10721++;
        this.field10733 = 1.0F;
        this.field10732 = this.field10713 = class317.field4515[arg0 & 0x3FFF];
        this.field10714 = class317.field4513[arg0 & 0x3FFF];
        this.field10716 = -this.field10714;
        this.field10729 = this.field10740 = this.field10723 = this.field10725 = this.field10720 = this.field10712 = this.field10727 = 0.0F;
    }

    @OriginalMember(owner = "client!hda", name = "d", descriptor = "(I)V")
    public final void method1882(int arg0) {
        field10736++;
        this.field10713 = 1.0F;
        this.field10732 = this.field10733 = class317.field4515[arg0 & 0x3FFF];
        this.field10723 = class317.field4513[arg0 & 0x3FFF];
        this.field10729 = -this.field10723;
        this.field10714 = this.field10740 = this.field10725 = this.field10720 = this.field10716 = this.field10712 = this.field10727 = 0.0F;
    }

    @OriginalMember(owner = "client!hda", name = "b", descriptor = "()V")
    public final void method1873() {
        this.field10732 = this.field10733 = this.field10713 = 1.0F;
        field10737++;
        this.field10723 = this.field10716 = this.field10729 = this.field10712 = this.field10714 = this.field10725 = this.field10740 = this.field10720 = this.field10727 = 0.0F;
    }

    @OriginalMember(owner = "client!hda", name = "c", descriptor = "(III[I)V")
    public final void method1885(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[1] = (int) ((float) arg2 * this.field10725 + (float) arg0 * this.field10723 + (float) arg1 * this.field10733 + this.field10720);
        arg3[2] = (int) ((float) arg2 * this.field10713 + (float) arg0 * this.field10716 + (float) arg1 * this.field10712 + this.field10727);
        field10715++;
        arg3[0] = (int) ((float) arg2 * this.field10714 + (float) arg0 * this.field10732 + (float) arg1 * this.field10729 + this.field10740);
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(Lqja;)V")
    public final void method1884(class326 arg0) {
        field10738++;
        class781 var2 = (class781) arg0;
        this.field10714 = var2.field10714;
        this.field10732 = var2.field10732;
        this.field10712 = var2.field10712;
        this.field10720 = var2.field10720;
        this.field10727 = var2.field10727;
        this.field10723 = var2.field10723;
        this.field10733 = var2.field10733;
        this.field10713 = var2.field10713;
        this.field10729 = var2.field10729;
        this.field10716 = var2.field10716;
        this.field10740 = var2.field10740;
        this.field10725 = var2.field10725;
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(ZIII)I")
    public static final int method4291(boolean arg0, int arg1, int arg2, int arg3) {
        field10719++;
        if (arg2 != 12) {
            field10718 = null;
        }
        class787 var4 = class447.method2666(arg1, Integer.MIN_VALUE, arg0);
        if (var4 == null) {
            return -1;
        } else if (arg3 >= 0 && var4.field10809.length > arg3) {
            return var4.field10809[arg3];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!hda", name = "c", descriptor = "(I)V")
    public final void method1871(int arg0) {
        field10717++;
        float var2 = class317.field4515[arg0 & 0x3FFF];
        float var3 = class317.field4513[arg0 & 0x3FFF];
        float var4 = this.field10732;
        float var5 = this.field10729;
        float var6 = this.field10714;
        this.field10732 = this.field10716 * var3 + var2 * var4;
        float var7 = this.field10740;
        this.field10716 = this.field10716 * var2 - var3 * var4;
        this.field10729 = this.field10712 * var3 + var2 * var5;
        this.field10714 = this.field10713 * var3 + var2 * var6;
        this.field10712 = this.field10712 * var2 - (var3 * var5);
        this.field10740 = this.field10727 * var3 + var2 * var7;
        this.field10713 = this.field10713 * var2 - (var3 * var6);
        this.field10727 = this.field10727 * var2 - var3 * var7;
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "([I)V")
    public final void method1896(int[] arg0) {
        field10739++;
        float var2 = (float) arg0[0] - this.field10740;
        float var3 = (float) arg0[1] - this.field10720;
        float var4 = (float) arg0[2] - this.field10727;
        arg0[0] = (int) (this.field10716 * var4 + this.field10732 * var2 + this.field10723 * var3);
        arg0[1] = (int) (this.field10712 * var4 + this.field10733 * var3 + this.field10729 * var2);
        arg0[2] = (int) (this.field10713 * var4 + this.field10725 * var3 + this.field10714 * var2);
    }

    @OriginalMember(owner = "client!hda", name = "<init>", descriptor = "()V")
    public class781() {
        this.method1873();
    }
}
