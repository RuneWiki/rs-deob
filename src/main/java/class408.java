import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public class class408 extends class414 {

    @OriginalMember(owner = "client!gu", name = "f", descriptor = "I")
    public int field5594;

    @OriginalMember(owner = "client!gu", name = "g", descriptor = "I")
    public int field5595;

    @OriginalMember(owner = "client!gu", name = "h", descriptor = "I")
    public int field5596;

    @OriginalMember(owner = "client!gu", name = "i", descriptor = "I")
    public int field5597;

    @OriginalMember(owner = "client!gu", name = "j", descriptor = "I")
    public int field5598;

    @OriginalMember(owner = "client!gu", name = "k", descriptor = "I")
    public int field5599;

    @OriginalMember(owner = "client!gu", name = "l", descriptor = "I")
    public int field5600;

    @OriginalMember(owner = "client!gu", name = "m", descriptor = "I")
    public int field5601;

    @OriginalMember(owner = "client!gu", name = "n", descriptor = "I")
    public int field5602;

    @OriginalMember(owner = "client!gu", name = "o", descriptor = "I")
    public int field5603;

    @OriginalMember(owner = "client!gu", name = "p", descriptor = "I")
    public int field5604;

    @OriginalMember(owner = "client!gu", name = "q", descriptor = "I")
    public int field5605;

    @OriginalMember(owner = "client!gu", name = "E", descriptor = "(III[I)V")
    public final void method972(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = this.field5604 * arg2 + this.field5605 * arg1 + this.field5598 * arg0 >> 15;
        arg3[1] = this.field5600 * arg2 + this.field5599 * arg1 + this.field5596 * arg0 >> 15;
        arg3[2] = this.field5603 * arg2 + this.field5597 * arg0 + this.field5594 * arg1 >> 15;
    }

    @OriginalMember(owner = "client!gu", name = "na", descriptor = "(I)V")
    public final void method966(int arg0) {
        int var2 = class305.field4022[arg0 & 0x3FFF];
        int var3 = class305.field4019[arg0 & 0x3FFF];
        int var4 = this.field5596;
        int var5 = this.field5599;
        int var6 = this.field5600;
        int var7 = this.field5601;
        this.field5596 = var2 * var4 - this.field5597 * var3 >> 15;
        this.field5597 = this.field5597 * var2 + var3 * var4 >> 15;
        this.field5599 = var2 * var5 - this.field5594 * var3 >> 15;
        this.field5594 = this.field5594 * var2 + var3 * var5 >> 15;
        this.field5600 = var2 * var6 - this.field5603 * var3 >> 15;
        this.field5603 = this.field5603 * var2 + var3 * var6 >> 15;
        this.field5601 = var2 * var7 - this.field5602 * var3 >> 15;
        this.field5602 = this.field5602 * var2 + var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "(I)V")
    public final void method961(int arg0) {
        int var2 = class305.field4022[arg0 & 0x3FFF];
        int var3 = class305.field4019[arg0 & 0x3FFF];
        int var4 = this.field5598;
        int var5 = this.field5605;
        int var6 = this.field5604;
        int var7 = this.field5595;
        this.field5598 = this.field5597 * var3 + var2 * var4 >> 15;
        this.field5597 = this.field5597 * var2 - var3 * var4 >> 15;
        this.field5605 = this.field5594 * var3 + var2 * var5 >> 15;
        this.field5594 = this.field5594 * var2 - var3 * var5 >> 15;
        this.field5604 = this.field5603 * var3 + var2 * var6 >> 15;
        this.field5603 = this.field5603 * var2 - var3 * var6 >> 15;
        this.field5595 = this.field5602 * var3 + var2 * var7 >> 15;
        this.field5602 = this.field5602 * var2 - var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!gu", name = "HA", descriptor = "()V")
    public final void method964() {
        this.field5596 = this.field5597 = this.field5605 = this.field5594 = this.field5604 = this.field5600 = this.field5595 = this.field5601 = this.field5602 = 0;
        this.field5598 = this.field5599 = this.field5603 = 32768;
    }

    @OriginalMember(owner = "client!gu", name = "R", descriptor = "(III)V")
    public final void method971(int arg0, int arg1, int arg2) {
        this.field5596 = this.field5597 = this.field5605 = this.field5594 = this.field5604 = this.field5600 = 0;
        this.field5598 = this.field5599 = this.field5603 = 32768;
        this.field5595 = arg0;
        this.field5601 = arg1;
        this.field5602 = arg2;
    }

    @OriginalMember(owner = "client!gu", name = "ZA", descriptor = "(III)V")
    public final void method970(int arg0, int arg1, int arg2) {
        this.field5595 += arg0;
        this.field5601 += arg1;
        this.field5602 += arg2;
    }

    @OriginalMember(owner = "client!gu", name = "O", descriptor = "(I)V")
    public final void method959(int arg0) {
        this.field5599 = 32768;
        this.field5598 = this.field5603 = class305.field4022[arg0 & 0x3FFF];
        this.field5604 = class305.field4019[arg0 & 0x3FFF];
        this.field5597 = -this.field5604;
        this.field5605 = this.field5595 = this.field5596 = this.field5600 = this.field5601 = this.field5594 = this.field5602 = 0;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(III[I)V")
    public final void method968(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (this.field5604 * arg2 + this.field5605 * arg1 + this.field5598 * arg0 >> 15) + this.field5595;
        arg3[1] = (this.field5600 * arg2 + this.field5599 * arg1 + this.field5596 * arg0 >> 15) + this.field5601;
        arg3[2] = (this.field5603 * arg2 + this.field5597 * arg0 + this.field5594 * arg1 >> 15) + this.field5602;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "()Lia;")
    public final class414 method962() {
        class408 var1 = new class408();
        var1.field5598 = this.field5598;
        var1.field5605 = this.field5605;
        var1.field5604 = this.field5604;
        var1.field5595 = this.field5595;
        var1.field5596 = this.field5596;
        var1.field5599 = this.field5599;
        var1.field5600 = this.field5600;
        var1.field5601 = this.field5601;
        var1.field5597 = this.field5597;
        var1.field5594 = this.field5594;
        var1.field5603 = this.field5603;
        var1.field5602 = this.field5602;
        return var1;
    }

    @OriginalMember(owner = "client!gu", name = "ba", descriptor = "(Lia;)V")
    public final void method960(class414 arg0) {
        class408 var2 = (class408) arg0;
        this.field5598 = var2.field5598;
        this.field5605 = var2.field5605;
        this.field5604 = var2.field5604;
        this.field5595 = var2.field5595;
        this.field5596 = var2.field5596;
        this.field5599 = var2.field5599;
        this.field5600 = var2.field5600;
        this.field5601 = var2.field5601;
        this.field5597 = var2.field5597;
        this.field5594 = var2.field5594;
        this.field5603 = var2.field5603;
        this.field5602 = var2.field5602;
    }

    @OriginalMember(owner = "client!gu", name = "ma", descriptor = "(I)V")
    public final void method969(int arg0) {
        this.field5603 = 32768;
        this.field5598 = this.field5599 = class305.field4022[arg0 & 0x3FFF];
        this.field5596 = class305.field4019[arg0 & 0x3FFF];
        this.field5605 = -this.field5596;
        this.field5604 = this.field5595 = this.field5600 = this.field5601 = this.field5597 = this.field5594 = this.field5602 = 0;
    }

    @OriginalMember(owner = "client!gu", name = "X", descriptor = "([I)V")
    public final void method973(int[] arg0) {
        int var2 = arg0[0] - this.field5595;
        int var3 = arg0[1] - this.field5601;
        int var4 = arg0[2] - this.field5602;
        arg0[0] = this.field5597 * var4 + this.field5598 * var2 + this.field5596 * var3 >> 15;
        arg0[1] = this.field5594 * var4 + this.field5605 * var2 + this.field5599 * var3 >> 15;
        arg0[2] = this.field5603 * var4 + this.field5604 * var2 + this.field5600 * var3 >> 15;
    }

    @OriginalMember(owner = "client!gu", name = "Q", descriptor = "(IIIIII)V")
    public final void method958(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class305.field4022[arg3 & 0x3FFF];
        int var8 = class305.field4019[arg3 & 0x3FFF];
        int var9 = class305.field4022[arg4 & 0x3FFF];
        int var10 = class305.field4019[arg4 & 0x3FFF];
        int var11 = class305.field4022[arg5 & 0x3FFF];
        int var12 = class305.field4019[arg5 & 0x3FFF];
        int var13 = var8 * var11 >> 15;
        int var14 = var8 * var12 >> 15;
        this.field5598 = var9 * var11 + var10 * var14 >> 15;
        this.field5596 = -var9 * var12 + var10 * var13 >> 15;
        this.field5597 = var7 * var10 >> 15;
        this.field5605 = var7 * var12 >> 15;
        this.field5599 = var7 * var11 >> 15;
        this.field5594 = -var8;
        this.field5604 = -var10 * var11 + var9 * var14 >> 15;
        this.field5600 = var9 * var13 + var10 * var12 >> 15;
        this.field5603 = var7 * var9 >> 15;
        this.field5595 = -arg0 * this.field5598 - this.field5605 * arg1 - this.field5604 * arg2 >> 15;
        this.field5601 = -arg0 * this.field5596 - this.field5599 * arg1 - this.field5600 * arg2 >> 15;
        this.field5602 = -arg0 * this.field5597 - this.field5594 * arg1 - this.field5603 * arg2 >> 15;
    }

    @OriginalMember(owner = "client!gu", name = "<init>", descriptor = "()V")
    public class408() {
        this.method964();
    }

    @OriginalMember(owner = "client!gu", name = "YA", descriptor = "(I)V")
    public final void method967(int arg0) {
        this.field5598 = 32768;
        this.field5599 = this.field5603 = class305.field4022[arg0 & 0x3FFF];
        this.field5594 = class305.field4019[arg0 & 0x3FFF];
        this.field5600 = -this.field5594;
        this.field5605 = this.field5604 = this.field5595 = this.field5596 = this.field5601 = this.field5597 = this.field5602 = 0;
    }
}
