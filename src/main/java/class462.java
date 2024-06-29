import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class462 extends class165 {

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "F")
    public float field6576;

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "F")
    public float field6577;

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "F")
    public float field6579;

    @OriginalMember(owner = "client!ch", name = "p", descriptor = "F")
    public float field6585;

    @OriginalMember(owner = "client!ch", name = "t", descriptor = "F")
    public float field6589;

    @OriginalMember(owner = "client!ch", name = "u", descriptor = "F")
    public float field6590;

    @OriginalMember(owner = "client!ch", name = "v", descriptor = "F")
    public float field6591;

    @OriginalMember(owner = "client!ch", name = "w", descriptor = "F")
    public float field6592;

    @OriginalMember(owner = "client!ch", name = "z", descriptor = "F")
    public float field6595;

    @OriginalMember(owner = "client!ch", name = "A", descriptor = "F")
    public float field6596;

    @OriginalMember(owner = "client!ch", name = "D", descriptor = "F")
    public float field6599;

    @OriginalMember(owner = "client!ch", name = "J", descriptor = "F")
    public float field6605;

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "I")
    public static int field6578;

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "I")
    public static int field6580;

    @OriginalMember(owner = "client!ch", name = "l", descriptor = "I")
    public static int field6581;

    @OriginalMember(owner = "client!ch", name = "m", descriptor = "I")
    public static int field6582;

    @OriginalMember(owner = "client!ch", name = "o", descriptor = "I")
    public static int field6584;

    @OriginalMember(owner = "client!ch", name = "q", descriptor = "I")
    public static int field6586;

    @OriginalMember(owner = "client!ch", name = "r", descriptor = "I")
    public static int field6587;

    @OriginalMember(owner = "client!ch", name = "s", descriptor = "I")
    public static int field6588;

    @OriginalMember(owner = "client!ch", name = "x", descriptor = "I")
    public static int field6593;

    @OriginalMember(owner = "client!ch", name = "y", descriptor = "I")
    public static int field6594;

    @OriginalMember(owner = "client!ch", name = "B", descriptor = "I")
    public static int field6597;

    @OriginalMember(owner = "client!ch", name = "C", descriptor = "I")
    public static int field6598;

    @OriginalMember(owner = "client!ch", name = "E", descriptor = "I")
    public static int field6600;

    @OriginalMember(owner = "client!ch", name = "F", descriptor = "I")
    public static int field6601;

    @OriginalMember(owner = "client!ch", name = "G", descriptor = "I")
    public static int field6602;

    @OriginalMember(owner = "client!ch", name = "H", descriptor = "I")
    public static int field6603;

    @OriginalMember(owner = "client!ch", name = "I", descriptor = "I")
    public static int field6604;

    @OriginalMember(owner = "client!ch", name = "n", descriptor = "Loh;")
    public static class404 field6583;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(III)V")
    public final void method1019(int arg0, int arg1, int arg2) {
        this.field6577 = this.field6591 = this.field6596 = 1.0F;
        this.field6599 = arg0;
        this.field6595 = arg2;
        this.field6590 = this.field6585 = this.field6592 = this.field6576 = this.field6579 = this.field6589 = 0.0F;
        field6601++;
        this.field6605 = arg1;
    }

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "(I)V")
    public final void method1035(int arg0) {
        field6603++;
        this.field6591 = 1.0F;
        this.field6577 = this.field6596 = class721.field10116[arg0 & 0x3FFF];
        this.field6579 = class721.field10117[arg0 & 0x3FFF];
        this.field6592 = this.field6599 = this.field6590 = this.field6589 = this.field6605 = this.field6576 = this.field6595 = 0.0F;
        this.field6585 = -this.field6579;
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(III[I)V")
    public final void method1023(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[1] = (int) ((float) arg2 * this.field6589 + (float) arg0 * this.field6590 + (float) arg1 * this.field6591);
        field6580++;
        arg3[0] = (int) ((float) arg2 * this.field6579 + (float) arg0 * this.field6577 + (float) arg1 * this.field6592);
        arg3[2] = (int) ((float) arg2 * this.field6596 + (float) arg0 * this.field6585 + (float) arg1 * this.field6576);
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)V")
    public final void method1022(int arg0) {
        field6588++;
        this.field6577 = 1.0F;
        this.field6591 = this.field6596 = class721.field10116[arg0 & 0x3FFF];
        this.field6576 = class721.field10117[arg0 & 0x3FFF];
        this.field6592 = this.field6579 = this.field6599 = this.field6590 = this.field6605 = this.field6585 = this.field6595 = 0.0F;
        this.field6589 = -this.field6576;
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(III[I)V")
    public final void method1030(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (int) ((float) arg2 * this.field6579 + (float) arg0 * this.field6577 + (float) arg1 * this.field6592 + this.field6599);
        field6597++;
        arg3[1] = (int) ((float) arg2 * this.field6589 + (float) arg0 * this.field6590 + (float) arg1 * this.field6591 + this.field6605);
        arg3[2] = (int) ((float) arg2 * this.field6596 + (float) arg0 * this.field6585 + (float) arg1 * this.field6576 + this.field6595);
    }

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "(I)V")
    public static void method2813(int arg0) {
        field6583 = null;
        if (arg0 != 0) {
            field6583 = null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "()V")
    public final void method1026() {
        this.field6590 = this.field6585 = this.field6592 = this.field6576 = this.field6579 = this.field6589 = this.field6599 = this.field6605 = this.field6595 = 0.0F;
        field6581++;
        this.field6577 = this.field6591 = this.field6596 = 1.0F;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(III[I)V")
    public final void method1020(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (int) ((float) arg2 - this.field6595);
        int var6 = (int) ((float) arg0 - this.field6599);
        int var7 = (int) ((float) arg1 - this.field6605);
        field6584++;
        arg3[1] = (int) ((float) var5 * this.field6576 + (float) var6 * this.field6592 + (float) var7 * this.field6591);
        arg3[2] = (int) ((float) var5 * this.field6596 + (float) var6 * this.field6579 + (float) var7 * this.field6589);
        arg3[0] = (int) ((float) var5 * this.field6585 + (float) var6 * this.field6577 + (float) var7 * this.field6590);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V")
    public final void method1021(int arg0) {
        this.field6596 = 1.0F;
        field6598++;
        this.field6577 = this.field6591 = class721.field10116[arg0 & 0x3FFF];
        this.field6590 = class721.field10117[arg0 & 0x3FFF];
        this.field6592 = -this.field6590;
        this.field6579 = this.field6599 = this.field6589 = this.field6605 = this.field6585 = this.field6576 = this.field6595 = 0.0F;
    }

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "(I)V")
    public final void method1032(int arg0) {
        field6593++;
        float var2 = class721.field10116[arg0 & 0x3FFF];
        float var3 = class721.field10117[arg0 & 0x3FFF];
        float var4 = this.field6577;
        float var5 = this.field6592;
        float var6 = this.field6579;
        this.field6577 = var2 * var4 - this.field6590 * var3;
        float var7 = this.field6599;
        this.field6590 = this.field6590 * var2 + var3 * var4;
        this.field6592 = var2 * var5 - (this.field6591 * var3);
        this.field6579 = var2 * var6 - this.field6589 * var3;
        this.field6591 = this.field6591 * var2 + var3 * var5;
        this.field6599 = var2 * var7 - (this.field6605 * var3);
        this.field6589 = this.field6589 * var2 + var3 * var6;
        this.field6605 = this.field6605 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(III)V")
    public final void method1033(int arg0, int arg1, int arg2) {
        this.field6599 += arg0;
        this.field6605 += arg1;
        field6586++;
        this.field6595 += arg2;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "()Ldfa;")
    public final class165 method1024() {
        field6604++;
        class462 var1 = new class462();
        var1.field6576 = this.field6576;
        var1.field6579 = this.field6579;
        var1.field6591 = this.field6591;
        var1.field6596 = this.field6596;
        var1.field6590 = this.field6590;
        var1.field6595 = this.field6595;
        var1.field6585 = this.field6585;
        var1.field6589 = this.field6589;
        var1.field6599 = this.field6599;
        var1.field6605 = this.field6605;
        var1.field6577 = this.field6577;
        var1.field6592 = this.field6592;
        return var1;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIII)V")
    public final void method1018(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6578++;
        float var7 = class721.field10116[arg3 & 0x3FFF];
        float var8 = class721.field10117[arg3 & 0x3FFF];
        float var9 = class721.field10116[arg4 & 0x3FFF];
        float var10 = class721.field10117[arg4 & 0x3FFF];
        float var11 = class721.field10116[arg5 & 0x3FFF];
        float var12 = class721.field10117[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field6596 = var7 * var9;
        this.field6576 = -var8;
        this.field6585 = var7 * var10;
        this.field6577 = var9 * var11 + var10 * var14;
        this.field6579 = -var10 * var11 + var9 * var14;
        this.field6592 = var7 * var12;
        this.field6589 = var9 * var13 + var10 * var12;
        this.field6591 = var7 * var11;
        this.field6590 = -var9 * var12 + var10 * var13;
        this.field6605 = (float) (-arg0) * this.field6590 - ((float) arg1 * this.field6591) - ((float) arg2 * this.field6589);
        this.field6595 = (float) (-arg0) * this.field6585 - ((float) arg1 * this.field6576) - (float) arg2 * this.field6596;
        this.field6599 = (float) (-arg0) * this.field6577 - (float) arg1 * this.field6592 - (float) arg2 * this.field6579;
    }

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "(I)V")
    public final void method1036(int arg0) {
        field6587++;
        float var2 = class721.field10116[arg0 & 0x3FFF];
        float var3 = class721.field10117[arg0 & 0x3FFF];
        float var4 = this.field6577;
        float var5 = this.field6592;
        float var6 = this.field6579;
        this.field6577 = this.field6585 * var3 + var2 * var4;
        float var7 = this.field6599;
        this.field6592 = this.field6576 * var3 + var2 * var5;
        this.field6585 = this.field6585 * var2 - var3 * var4;
        this.field6579 = this.field6596 * var3 + var2 * var6;
        this.field6576 = this.field6576 * var2 - var3 * var5;
        this.field6599 = this.field6595 * var3 + var2 * var7;
        this.field6596 = this.field6596 * var2 - (var3 * var6);
        this.field6595 = this.field6595 * var2 - (var3 * var7);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Ldfa;)V")
    public final void method1028(class165 arg0) {
        field6582++;
        class462 var2 = (class462) arg0;
        this.field6577 = var2.field6577;
        this.field6591 = var2.field6591;
        this.field6596 = var2.field6596;
        this.field6579 = var2.field6579;
        this.field6595 = var2.field6595;
        this.field6576 = var2.field6576;
        this.field6592 = var2.field6592;
        this.field6605 = var2.field6605;
        this.field6590 = var2.field6590;
        this.field6599 = var2.field6599;
        this.field6585 = var2.field6585;
        this.field6589 = var2.field6589;
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(I)V")
    public final void method1025(int arg0) {
        field6602++;
        float var2 = class721.field10116[arg0 & 0x3FFF];
        float var3 = class721.field10117[arg0 & 0x3FFF];
        float var4 = this.field6590;
        float var5 = this.field6591;
        float var6 = this.field6589;
        float var7 = this.field6605;
        this.field6590 = var2 * var4 - (this.field6585 * var3);
        this.field6591 = var2 * var5 - this.field6576 * var3;
        this.field6585 = this.field6585 * var2 + var3 * var4;
        this.field6589 = var2 * var6 - this.field6596 * var3;
        this.field6576 = this.field6576 * var2 + var3 * var5;
        this.field6596 = this.field6596 * var2 + var3 * var6;
        this.field6605 = var2 * var7 - (this.field6595 * var3);
        this.field6595 = this.field6595 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILpt;)I")
    public static final int method2814(int arg0, class529 arg1) {
        if (arg0 != 34168) {
            field6583 = null;
        }
        field6600++;
        if (class424.field6157 == arg1) {
            return 5890;
        } else if (class169.field1881 == arg1) {
            return 34167;
        } else if (class324.field4136 == arg1) {
            return 34168;
        } else if (class58.field582 == arg1) {
            return 34166;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "([I)V")
    public final void method1027(int[] arg0) {
        field6594++;
        float var2 = (float) arg0[0] - this.field6599;
        float var3 = (float) arg0[1] - this.field6605;
        float var4 = (float) arg0[2] - this.field6595;
        arg0[2] = (int) (this.field6596 * var4 + this.field6589 * var3 + this.field6579 * var2);
        arg0[1] = (int) (this.field6576 * var4 + this.field6592 * var2 + this.field6591 * var3);
        arg0[0] = (int) (this.field6585 * var4 + this.field6590 * var3 + this.field6577 * var2);
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V")
    public class462() {
        this.method1026();
    }
}
