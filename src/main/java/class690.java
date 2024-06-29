import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bca")
public class class690 extends class650 {

    @OriginalMember(owner = "client!bca", name = "q", descriptor = "I")
    public static int field9574 = 0;

    @OriginalMember(owner = "client!bca", name = "g", descriptor = "F")
    public float field9564;

    @OriginalMember(owner = "client!bca", name = "i", descriptor = "F")
    public float field9566;

    @OriginalMember(owner = "client!bca", name = "j", descriptor = "F")
    public float field9567;

    @OriginalMember(owner = "client!bca", name = "n", descriptor = "F")
    public float field9571;

    @OriginalMember(owner = "client!bca", name = "r", descriptor = "F")
    public float field9575;

    @OriginalMember(owner = "client!bca", name = "t", descriptor = "F")
    public float field9577;

    @OriginalMember(owner = "client!bca", name = "v", descriptor = "F")
    public float field9579;

    @OriginalMember(owner = "client!bca", name = "w", descriptor = "F")
    public float field9580;

    @OriginalMember(owner = "client!bca", name = "y", descriptor = "F")
    public float field9582;

    @OriginalMember(owner = "client!bca", name = "C", descriptor = "F")
    public float field9585;

    @OriginalMember(owner = "client!bca", name = "F", descriptor = "F")
    public float field9588;

    @OriginalMember(owner = "client!bca", name = "G", descriptor = "F")
    public float field9589;

    @OriginalMember(owner = "client!bca", name = "h", descriptor = "I")
    public static int field9565;

    @OriginalMember(owner = "client!bca", name = "k", descriptor = "I")
    public static int field9568;

    @OriginalMember(owner = "client!bca", name = "l", descriptor = "I")
    public static int field9569;

    @OriginalMember(owner = "client!bca", name = "m", descriptor = "I")
    public static int field9570;

    @OriginalMember(owner = "client!bca", name = "o", descriptor = "I")
    public static int field9572;

    @OriginalMember(owner = "client!bca", name = "p", descriptor = "I")
    public static int field9573;

    @OriginalMember(owner = "client!bca", name = "s", descriptor = "I")
    public static int field9576;

    @OriginalMember(owner = "client!bca", name = "u", descriptor = "I")
    public static int field9578;

    @OriginalMember(owner = "client!bca", name = "x", descriptor = "I")
    public static int field9581;

    @OriginalMember(owner = "client!bca", name = "z", descriptor = "I")
    public static int field9583;

    @OriginalMember(owner = "client!bca", name = "A", descriptor = "I")
    public static int field9584;

    @OriginalMember(owner = "client!bca", name = "D", descriptor = "I")
    public static int field9586;

    @OriginalMember(owner = "client!bca", name = "E", descriptor = "I")
    public static int field9587;

    @OriginalMember(owner = "client!bca", name = "H", descriptor = "I")
    public static int field9590;

    @OriginalMember(owner = "client!bca", name = "I", descriptor = "I")
    public static int field9591;

    @OriginalMember(owner = "client!bca", name = "J", descriptor = "I")
    public static int field9592;

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(III)V")
    public final void method1860(int arg0, int arg1, int arg2) {
        this.field9585 += arg1;
        this.field9571 += arg0;
        field9572++;
        this.field9564 += arg2;
    }

    @OriginalMember(owner = "client!bca", name = "d", descriptor = "(I)V")
    public final void method1879(int arg0) {
        this.field9579 = 1.0F;
        field9584++;
        this.field9589 = this.field9588 = class436.field5937[arg0 & 0x3FFF];
        this.field9575 = class436.field5932[arg0 & 0x3FFF];
        this.field9577 = -this.field9575;
        this.field9582 = this.field9571 = this.field9580 = this.field9567 = this.field9585 = this.field9566 = this.field9564 = 0.0F;
    }

    @OriginalMember(owner = "client!bca", name = "e", descriptor = "(I)V")
    public final void method1869(int arg0) {
        field9586++;
        float var2 = class436.field5937[arg0 & 0x3FFF];
        float var3 = class436.field5932[arg0 & 0x3FFF];
        float var4 = this.field9589;
        float var5 = this.field9582;
        float var6 = this.field9575;
        this.field9589 = var2 * var4 - this.field9580 * var3;
        float var7 = this.field9571;
        this.field9580 = this.field9580 * var2 + var3 * var4;
        this.field9582 = var2 * var5 - (this.field9579 * var3);
        this.field9575 = var2 * var6 - (this.field9567 * var3);
        this.field9579 = this.field9579 * var2 + var3 * var5;
        this.field9567 = this.field9567 * var2 + var3 * var6;
        this.field9571 = var2 * var7 - (this.field9585 * var3);
        this.field9585 = this.field9585 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!bca", name = "b", descriptor = "(I)V")
    public final void method1884(int arg0) {
        this.field9589 = 1.0F;
        field9569++;
        this.field9579 = this.field9588 = class436.field5937[arg0 & 0x3FFF];
        this.field9566 = class436.field5932[arg0 & 0x3FFF];
        this.field9567 = -this.field9566;
        this.field9582 = this.field9575 = this.field9571 = this.field9580 = this.field9585 = this.field9577 = this.field9564 = 0.0F;
    }

    @OriginalMember(owner = "client!bca", name = "c", descriptor = "(I)V")
    public final void method1875(int arg0) {
        field9583++;
        float var2 = class436.field5937[arg0 & 0x3FFF];
        float var3 = class436.field5932[arg0 & 0x3FFF];
        float var4 = this.field9589;
        float var5 = this.field9582;
        float var6 = this.field9575;
        this.field9589 = this.field9577 * var3 + var2 * var4;
        float var7 = this.field9571;
        this.field9577 = this.field9577 * var2 - (var3 * var4);
        this.field9582 = this.field9566 * var3 + var2 * var5;
        this.field9566 = this.field9566 * var2 - (var3 * var5);
        this.field9575 = this.field9588 * var3 + var2 * var6;
        this.field9571 = this.field9564 * var3 + var2 * var7;
        this.field9588 = this.field9588 * var2 - (var3 * var6);
        this.field9564 = this.field9564 * var2 - var3 * var7;
    }

    @OriginalMember(owner = "client!bca", name = "f", descriptor = "(I)V")
    public final void method1890(int arg0) {
        field9578++;
        this.field9588 = 1.0F;
        this.field9589 = this.field9579 = class436.field5937[arg0 & 0x3FFF];
        this.field9580 = class436.field5932[arg0 & 0x3FFF];
        this.field9582 = -this.field9580;
        this.field9575 = this.field9571 = this.field9567 = this.field9585 = this.field9577 = this.field9566 = this.field9564 = 0.0F;
    }

    @OriginalMember(owner = "client!bca", name = "b", descriptor = "(III)V")
    public final void method1868(int arg0, int arg1, int arg2) {
        this.field9571 = arg0;
        this.field9585 = arg1;
        this.field9564 = arg2;
        field9592++;
        this.field9589 = this.field9579 = this.field9588 = 1.0F;
        this.field9580 = this.field9577 = this.field9582 = this.field9566 = this.field9575 = this.field9567 = 0.0F;
    }

    @OriginalMember(owner = "client!bca", name = "c", descriptor = "(III[I)V")
    public final void method1876(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[1] = (int) ((float) arg2 * this.field9567 + (float) arg0 * this.field9580 + (float) arg1 * this.field9579);
        arg3[2] = (int) ((float) arg2 * this.field9588 + (float) arg0 * this.field9577 + (float) arg1 * this.field9566);
        arg3[0] = (int) ((float) arg2 * this.field9575 + (float) arg0 * this.field9589 + (float) arg1 * this.field9582);
        field9573++;
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "([I)V")
    public final void method1885(int[] arg0) {
        field9591++;
        float var2 = (float) arg0[0] - this.field9571;
        float var3 = (float) arg0[1] - this.field9585;
        float var4 = (float) arg0[2] - this.field9564;
        arg0[1] = (int) (this.field9566 * var4 + this.field9582 * var2 + this.field9579 * var3);
        arg0[0] = (int) (this.field9577 * var4 + this.field9589 * var2 + this.field9580 * var3);
        arg0[2] = (int) (this.field9588 * var4 + this.field9575 * var2 + this.field9567 * var3);
    }

    @OriginalMember(owner = "client!bca", name = "b", descriptor = "()Lsk;")
    public final class650 method1867() {
        field9570++;
        class690 var1 = new class690();
        var1.field9589 = this.field9589;
        var1.field9567 = this.field9567;
        var1.field9585 = this.field9585;
        var1.field9577 = this.field9577;
        var1.field9582 = this.field9582;
        var1.field9579 = this.field9579;
        var1.field9571 = this.field9571;
        var1.field9575 = this.field9575;
        var1.field9566 = this.field9566;
        var1.field9564 = this.field9564;
        var1.field9588 = this.field9588;
        var1.field9580 = this.field9580;
        return var1;
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(IIIIII)V")
    public final void method1882(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field9565++;
        float var7 = class436.field5937[arg3 & 0x3FFF];
        float var8 = class436.field5932[arg3 & 0x3FFF];
        float var9 = class436.field5937[arg4 & 0x3FFF];
        float var10 = class436.field5932[arg4 & 0x3FFF];
        float var11 = class436.field5937[arg5 & 0x3FFF];
        float var12 = class436.field5932[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field9579 = var7 * var11;
        this.field9589 = var9 * var11 + var10 * var14;
        this.field9575 = -var10 * var11 + var9 * var14;
        this.field9567 = var9 * var13 + var10 * var12;
        this.field9566 = -var8;
        this.field9582 = var7 * var12;
        this.field9580 = -var9 * var12 + var10 * var13;
        this.field9588 = var7 * var9;
        this.field9577 = var7 * var10;
        this.field9564 = (float) (-arg0) * this.field9577 - ((float) arg1 * this.field9566) - (float) arg2 * this.field9588;
        this.field9571 = (float) (-arg0) * this.field9589 - ((float) arg1 * this.field9582) - ((float) arg2 * this.field9575);
        this.field9585 = (float) (-arg0) * this.field9580 - ((float) arg1 * this.field9579) - (float) arg2 * this.field9567;
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(I)V")
    public final void method1877(int arg0) {
        field9587++;
        float var2 = class436.field5937[arg0 & 0x3FFF];
        float var3 = class436.field5932[arg0 & 0x3FFF];
        float var4 = this.field9580;
        float var5 = this.field9579;
        float var6 = this.field9567;
        float var7 = this.field9585;
        this.field9580 = var2 * var4 - this.field9577 * var3;
        this.field9577 = this.field9577 * var2 + var3 * var4;
        this.field9579 = var2 * var5 - (this.field9566 * var3);
        this.field9567 = var2 * var6 - (this.field9588 * var3);
        this.field9566 = this.field9566 * var2 + var3 * var5;
        this.field9585 = var2 * var7 - this.field9564 * var3;
        this.field9588 = this.field9588 * var2 + var3 * var6;
        this.field9564 = this.field9564 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(III[I)V")
    public final void method1878(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[1] = (int) ((float) arg2 * this.field9567 + (float) arg0 * this.field9580 + (float) arg1 * this.field9579 + this.field9585);
        arg3[2] = (int) ((float) arg2 * this.field9588 + (float) arg0 * this.field9577 + (float) arg1 * this.field9566 + this.field9564);
        arg3[0] = (int) ((float) arg2 * this.field9575 + (float) arg0 * this.field9589 + (float) arg1 * this.field9582 + this.field9571);
        field9581++;
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(Lsk;)V")
    public final void method1874(class650 arg0) {
        field9568++;
        class690 var2 = (class690) arg0;
        this.field9567 = var2.field9567;
        this.field9589 = var2.field9589;
        this.field9575 = var2.field9575;
        this.field9588 = var2.field9588;
        this.field9571 = var2.field9571;
        this.field9564 = var2.field9564;
        this.field9579 = var2.field9579;
        this.field9585 = var2.field9585;
        this.field9577 = var2.field9577;
        this.field9580 = var2.field9580;
        this.field9566 = var2.field9566;
        this.field9582 = var2.field9582;
    }

    @OriginalMember(owner = "client!bca", name = "b", descriptor = "(III[I)V")
    public final void method1870(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (int) ((float) arg0 - this.field9571);
        field9590++;
        int var6 = (int) ((float) arg1 - this.field9585);
        int var7 = (int) ((float) arg2 - this.field9564);
        arg3[1] = (int) ((float) var7 * this.field9566 + (float) var5 * this.field9582 + (float) var6 * this.field9579);
        arg3[0] = (int) ((float) var7 * this.field9577 + (float) var5 * this.field9589 + (float) var6 * this.field9580);
        arg3[2] = (int) ((float) var7 * this.field9588 + (float) var5 * this.field9575 + (float) var6 * this.field9567);
    }

    @OriginalMember(owner = "client!bca", name = "<init>", descriptor = "()V")
    public class690() {
        this.method1862();
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "()V")
    public final void method1862() {
        this.field9589 = this.field9579 = this.field9588 = 1.0F;
        this.field9580 = this.field9577 = this.field9582 = this.field9566 = this.field9575 = this.field9567 = this.field9571 = this.field9585 = this.field9564 = 0.0F;
        field9576++;
    }
}
