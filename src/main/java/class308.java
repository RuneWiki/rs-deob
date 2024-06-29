import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class308 extends class511 {

    @OriginalMember(owner = "client!ct", name = "g", descriptor = "I")
    public int field4620;

    @OriginalMember(owner = "client!ct", name = "h", descriptor = "I")
    public int field4621;

    @OriginalMember(owner = "client!ct", name = "i", descriptor = "I")
    public int field4622;

    @OriginalMember(owner = "client!ct", name = "j", descriptor = "I")
    public int field4623;

    @OriginalMember(owner = "client!ct", name = "k", descriptor = "I")
    public int field4624;

    @OriginalMember(owner = "client!ct", name = "l", descriptor = "I")
    public int field4625;

    @OriginalMember(owner = "client!ct", name = "m", descriptor = "I")
    public int field4626;

    @OriginalMember(owner = "client!ct", name = "n", descriptor = "I")
    public int field4627;

    @OriginalMember(owner = "client!ct", name = "o", descriptor = "I")
    public int field4628;

    @OriginalMember(owner = "client!ct", name = "p", descriptor = "I")
    public int field4629;

    @OriginalMember(owner = "client!ct", name = "q", descriptor = "I")
    public int field4630;

    @OriginalMember(owner = "client!ct", name = "r", descriptor = "I")
    public int field4631;

    @OriginalMember(owner = "client!ct", name = "p", descriptor = "(III[I)V", line = 3)
    public final void method1306(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = this.field4627 * arg2 + this.field4630 * arg1 + this.field4625 * arg0 >> 15;
        arg3[1] = this.field4631 * arg2 + this.field4622 * arg1 + this.field4620 * arg0 >> 15;
        arg3[2] = this.field4626 * arg2 + this.field4623 * arg0 + this.field4621 * arg1 >> 15;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "()Lc;", line = 10)
    public final class511 method1301() {
        class308 var1 = new class308();
        var1.field4625 = this.field4625;
        var1.field4630 = this.field4630;
        var1.field4627 = this.field4627;
        var1.field4628 = this.field4628;
        var1.field4620 = this.field4620;
        var1.field4622 = this.field4622;
        var1.field4631 = this.field4631;
        var1.field4629 = this.field4629;
        var1.field4623 = this.field4623;
        var1.field4621 = this.field4621;
        var1.field4626 = this.field4626;
        var1.field4624 = this.field4624;
        return var1;
    }

    @OriginalMember(owner = "client!ct", name = "j", descriptor = "(III)V", line = 26)
    public final void method1307(int arg0, int arg1, int arg2) {
        this.field4620 = this.field4623 = this.field4630 = this.field4621 = this.field4627 = this.field4631 = 0;
        this.field4625 = this.field4622 = this.field4626 = 32768;
        this.field4628 = arg0;
        this.field4629 = arg1;
        this.field4624 = arg2;
    }

    @OriginalMember(owner = "client!ct", name = "m", descriptor = "([I)V", line = 40)
    public final void method1297(int[] arg0) {
        int var2 = arg0[0] - this.field4628;
        int var3 = arg0[1] - this.field4629;
        int var4 = arg0[2] - this.field4624;
        arg0[0] = this.field4623 * var4 + this.field4625 * var2 + this.field4620 * var3 >> 15;
        arg0[1] = this.field4621 * var4 + this.field4630 * var2 + this.field4622 * var3 >> 15;
        arg0[2] = this.field4626 * var4 + this.field4631 * var3 + this.field4627 * var2 >> 15;
    }

    @OriginalMember(owner = "client!ct", name = "s", descriptor = "(IIIIII)V", line = 53)
    public final void method1300(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class445.field6544[arg3 & 0x3FFF];
        int var8 = class445.field6545[arg3 & 0x3FFF];
        int var9 = class445.field6544[arg4 & 0x3FFF];
        int var10 = class445.field6545[arg4 & 0x3FFF];
        int var11 = class445.field6544[arg5 & 0x3FFF];
        int var12 = class445.field6545[arg5 & 0x3FFF];
        int var13 = var8 * var11 >> 15;
        int var14 = var8 * var12 >> 15;
        this.field4625 = var9 * var11 + var10 * var14 >> 15;
        this.field4620 = -var9 * var12 + var10 * var13 >> 15;
        this.field4623 = var7 * var10 >> 15;
        this.field4630 = var7 * var12 >> 15;
        this.field4622 = var7 * var11 >> 15;
        this.field4621 = -var8;
        this.field4627 = -var10 * var11 + var9 * var14 >> 15;
        this.field4631 = var9 * var13 + var10 * var12 >> 15;
        this.field4626 = var7 * var9 >> 15;
        this.field4628 = -arg0 * this.field4625 - this.field4630 * arg1 - this.field4627 * arg2 >> 15;
        this.field4629 = -arg0 * this.field4620 - this.field4622 * arg1 - this.field4631 * arg2 >> 15;
        this.field4624 = -arg0 * this.field4623 - this.field4621 * arg1 - this.field4626 * arg2 >> 15;
    }

    @OriginalMember(owner = "client!ct", name = "o", descriptor = "(III)V", line = 82)
    public final void method1309(int arg0, int arg1, int arg2) {
        this.field4628 += arg0;
        this.field4629 += arg1;
        this.field4624 += arg2;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(III[I)V", line = 87)
    public final void method1308(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (this.field4627 * arg2 + this.field4630 * arg1 + this.field4625 * arg0 >> 15) + this.field4628;
        arg3[1] = (this.field4631 * arg2 + this.field4622 * arg1 + this.field4620 * arg0 >> 15) + this.field4629;
        arg3[2] = (this.field4626 * arg2 + this.field4623 * arg0 + this.field4621 * arg1 >> 15) + this.field4624;
    }

    @OriginalMember(owner = "client!ct", name = "xa", descriptor = "()V", line = 92)
    public final void method1311() {
        this.field4620 = this.field4623 = this.field4630 = this.field4621 = this.field4627 = this.field4631 = this.field4628 = this.field4629 = this.field4624 = 0;
        this.field4625 = this.field4622 = this.field4626 = 32768;
    }

    @OriginalMember(owner = "client!ct", name = "ka", descriptor = "(I)V", line = 97)
    public final void method1303(int arg0) {
        int var2 = class445.field6544[arg0 & 0x3FFF];
        int var3 = class445.field6545[arg0 & 0x3FFF];
        int var4 = this.field4620;
        int var5 = this.field4622;
        int var6 = this.field4631;
        int var7 = this.field4629;
        this.field4620 = var2 * var4 - this.field4623 * var3 >> 15;
        this.field4623 = this.field4623 * var2 + var3 * var4 >> 15;
        this.field4622 = var2 * var5 - this.field4621 * var3 >> 15;
        this.field4621 = this.field4621 * var2 + var3 * var5 >> 15;
        this.field4631 = var2 * var6 - this.field4626 * var3 >> 15;
        this.field4626 = this.field4626 * var2 + var3 * var6 >> 15;
        this.field4629 = var2 * var7 - this.field4624 * var3 >> 15;
        this.field4624 = this.field4624 * var2 + var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!ct", name = "ja", descriptor = "(I)V", line = 121)
    public final void method1299(int arg0) {
        int var2 = class445.field6544[arg0 & 0x3FFF];
        int var3 = class445.field6545[arg0 & 0x3FFF];
        int var4 = this.field4625;
        int var5 = this.field4630;
        int var6 = this.field4627;
        int var7 = this.field4628;
        this.field4625 = this.field4623 * var3 + var2 * var4 >> 15;
        this.field4623 = this.field4623 * var2 - var3 * var4 >> 15;
        this.field4630 = this.field4621 * var3 + var2 * var5 >> 15;
        this.field4621 = this.field4621 * var2 - var3 * var5 >> 15;
        this.field4627 = this.field4626 * var3 + var2 * var6 >> 15;
        this.field4626 = this.field4626 * var2 - var3 * var6 >> 15;
        this.field4628 = this.field4624 * var3 + var2 * var7 >> 15;
        this.field4624 = this.field4624 * var2 - var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!ct", name = "ra", descriptor = "(I)V", line = 143)
    public final void method1298(int arg0) {
        this.field4622 = 32768;
        this.field4625 = this.field4626 = class445.field6544[arg0 & 0x3FFF];
        this.field4627 = class445.field6545[arg0 & 0x3FFF];
        this.field4623 = -this.field4627;
        this.field4630 = this.field4628 = this.field4620 = this.field4631 = this.field4629 = this.field4621 = this.field4624 = 0;
    }

    @OriginalMember(owner = "client!ct", name = "za", descriptor = "(Lc;)V", line = 153)
    public final void method1304(class511 arg0) {
        class308 var2 = (class308) arg0;
        this.field4625 = var2.field4625;
        this.field4630 = var2.field4630;
        this.field4627 = var2.field4627;
        this.field4628 = var2.field4628;
        this.field4620 = var2.field4620;
        this.field4622 = var2.field4622;
        this.field4631 = var2.field4631;
        this.field4629 = var2.field4629;
        this.field4623 = var2.field4623;
        this.field4621 = var2.field4621;
        this.field4626 = var2.field4626;
        this.field4624 = var2.field4624;
    }

    @OriginalMember(owner = "client!ct", name = "N", descriptor = "(I)V", line = 169)
    public final void method1302(int arg0) {
        this.field4625 = 32768;
        this.field4622 = this.field4626 = class445.field6544[arg0 & 0x3FFF];
        this.field4621 = class445.field6545[arg0 & 0x3FFF];
        this.field4631 = -this.field4621;
        this.field4630 = this.field4627 = this.field4628 = this.field4620 = this.field4629 = this.field4623 = this.field4624 = 0;
    }

    @OriginalMember(owner = "client!ct", name = "O", descriptor = "(I)V", line = 177)
    public final void method1305(int arg0) {
        this.field4626 = 32768;
        this.field4625 = this.field4622 = class445.field6544[arg0 & 0x3FFF];
        this.field4620 = class445.field6545[arg0 & 0x3FFF];
        this.field4630 = -this.field4620;
        this.field4627 = this.field4628 = this.field4631 = this.field4629 = this.field4623 = this.field4621 = this.field4624 = 0;
    }

    @OriginalMember(owner = "client!ct", name = "<init>", descriptor = "()V", line = 183)
    public class308() {
        this.method1311();
    }
}
