import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class400 extends class309 {

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "I")
    public int field5540;

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "I")
    public int field5541;

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "I")
    public int field5542;

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
    public int field5543;

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "I")
    public int field5544;

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "I")
    public int field5545;

    @OriginalMember(owner = "client!fa", name = "o", descriptor = "I")
    public int field5546;

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "I")
    public int field5547;

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "I")
    public int field5548;

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "I")
    public int field5549;

    @OriginalMember(owner = "client!fa", name = "s", descriptor = "I")
    public int field5550;

    @OriginalMember(owner = "client!fa", name = "t", descriptor = "I")
    public int field5551;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "(I)V", line = 4)
    public final void method1865(int arg0) {
        int var2 = class136.field2020[arg0 & 0x3FFF];
        int var3 = class136.field2021[arg0 & 0x3FFF];
        int var4 = this.field5545;
        int var5 = this.field5542;
        int var6 = this.field5547;
        int var7 = this.field5540;
        this.field5545 = this.field5549 * var3 + var2 * var4 >> 15;
        this.field5549 = this.field5549 * var2 - var3 * var4 >> 15;
        this.field5542 = this.field5541 * var3 + var2 * var5 >> 15;
        this.field5541 = this.field5541 * var2 - var3 * var5 >> 15;
        this.field5547 = this.field5544 * var3 + var2 * var6 >> 15;
        this.field5544 = this.field5544 * var2 - var3 * var6 >> 15;
        this.field5540 = this.field5548 * var3 + var2 * var7 >> 15;
        this.field5548 = this.field5548 * var2 - var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "()Lfa;", line = 26)
    public final class400 method2484() {
        class400 var1 = new class400();
        var1.field5545 = this.field5545;
        var1.field5542 = this.field5542;
        var1.field5547 = this.field5547;
        var1.field5540 = this.field5540;
        var1.field5550 = this.field5550;
        var1.field5543 = this.field5543;
        var1.field5546 = this.field5546;
        var1.field5551 = this.field5551;
        var1.field5549 = this.field5549;
        var1.field5541 = this.field5541;
        var1.field5544 = this.field5544;
        var1.field5548 = this.field5548;
        return var1;
    }

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "(I)V", line = 43)
    public final void method1870(int arg0) {
        this.field5543 = 32768;
        this.field5545 = this.field5544 = class136.field2020[arg0 & 0x3FFF];
        this.field5547 = class136.field2021[arg0 & 0x3FFF];
        this.field5549 = -this.field5547;
        this.field5542 = this.field5540 = this.field5550 = this.field5546 = this.field5551 = this.field5541 = this.field5548 = 0;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(III[I)V", line = 51)
    public final void method1860(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (this.field5547 * arg2 + this.field5545 * arg0 + this.field5542 * arg1 >> 15) + this.field5540;
        arg3[1] = (this.field5546 * arg2 + this.field5550 * arg0 + this.field5543 * arg1 >> 15) + this.field5551;
        arg3[2] = (this.field5544 * arg2 + this.field5549 * arg0 + this.field5541 * arg1 >> 15) + this.field5548;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "()V", line = 56)
    public final void method1856() {
        this.field5550 = this.field5549 = this.field5542 = this.field5541 = this.field5547 = this.field5546 = this.field5540 = this.field5551 = this.field5548 = 0;
        this.field5545 = this.field5543 = this.field5544 = 32768;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V", line = 60)
    public final void method1858(int arg0) {
        this.field5545 = 32768;
        this.field5543 = this.field5544 = class136.field2020[arg0 & 0x3FFF];
        this.field5541 = class136.field2021[arg0 & 0x3FFF];
        this.field5546 = -this.field5541;
        this.field5542 = this.field5547 = this.field5540 = this.field5550 = this.field5551 = this.field5549 = this.field5548 = 0;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lve;)V", line = 68)
    public final void method1871(class309 arg0) {
        class400 var2 = (class400) arg0;
        this.field5545 = var2.field5545;
        this.field5542 = var2.field5542;
        this.field5547 = var2.field5547;
        this.field5540 = var2.field5540;
        this.field5550 = var2.field5550;
        this.field5543 = var2.field5543;
        this.field5546 = var2.field5546;
        this.field5551 = var2.field5551;
        this.field5549 = var2.field5549;
        this.field5541 = var2.field5541;
        this.field5544 = var2.field5544;
        this.field5548 = var2.field5548;
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)V", line = 85)
    public final void method1862(int arg0) {
        this.field5544 = 32768;
        this.field5545 = this.field5543 = class136.field2020[arg0 & 0x3FFF];
        this.field5550 = class136.field2021[arg0 & 0x3FFF];
        this.field5542 = -this.field5550;
        this.field5547 = this.field5540 = this.field5546 = this.field5551 = this.field5549 = this.field5541 = this.field5548 = 0;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "([I)V", line = 93)
    public final void method1857(int[] arg0) {
        int var2 = arg0[0] - this.field5540;
        int var3 = arg0[1] - this.field5551;
        int var4 = arg0[2] - this.field5548;
        arg0[0] = this.field5549 * var4 + this.field5550 * var3 + this.field5545 * var2 >> 15;
        arg0[1] = this.field5541 * var4 + this.field5543 * var3 + this.field5542 * var2 >> 15;
        arg0[2] = this.field5544 * var4 + this.field5547 * var2 + this.field5546 * var3 >> 15;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(III)V", line = 103)
    public final void method1866(int arg0, int arg1, int arg2) {
        this.field5550 = this.field5549 = this.field5542 = this.field5541 = this.field5547 = this.field5546 = 0;
        this.field5545 = this.field5543 = this.field5544 = 32768;
        this.field5540 = arg0;
        this.field5551 = arg1;
        this.field5548 = arg2;
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)V", line = 112)
    public final void method1859(int arg0) {
        int var2 = class136.field2020[arg0 & 0x3FFF];
        int var3 = class136.field2021[arg0 & 0x3FFF];
        int var4 = this.field5550;
        int var5 = this.field5543;
        int var6 = this.field5546;
        int var7 = this.field5551;
        this.field5550 = var2 * var4 - this.field5549 * var3 >> 15;
        this.field5549 = this.field5549 * var2 + var3 * var4 >> 15;
        this.field5543 = var2 * var5 - this.field5541 * var3 >> 15;
        this.field5541 = this.field5541 * var2 + var3 * var5 >> 15;
        this.field5546 = var2 * var6 - this.field5544 * var3 >> 15;
        this.field5544 = this.field5544 * var2 + var3 * var6 >> 15;
        this.field5551 = var2 * var7 - this.field5548 * var3 >> 15;
        this.field5548 = this.field5548 * var2 + var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIIII)V", line = 137)
    public final void method1872(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class136.field2020[arg3 & 0x3FFF];
        int var8 = class136.field2021[arg3 & 0x3FFF];
        int var9 = class136.field2020[arg4 & 0x3FFF];
        int var10 = class136.field2021[arg4 & 0x3FFF];
        int var11 = class136.field2020[arg5 & 0x3FFF];
        int var12 = class136.field2021[arg5 & 0x3FFF];
        int var13 = var8 * var11 >> 15;
        int var14 = var8 * var12 >> 15;
        this.field5545 = var9 * var11 + var10 * var14 >> 15;
        this.field5550 = -var9 * var12 + var10 * var13 >> 15;
        this.field5549 = var7 * var10 >> 15;
        this.field5542 = var7 * var12 >> 15;
        this.field5543 = var7 * var11 >> 15;
        this.field5541 = -var8;
        this.field5547 = -var10 * var11 + var9 * var14 >> 15;
        this.field5546 = var9 * var13 + var10 * var12 >> 15;
        this.field5544 = var7 * var9 >> 15;
        this.field5540 = -arg0 * this.field5545 - this.field5542 * arg1 - this.field5547 * arg2 >> 15;
        this.field5551 = -arg0 * this.field5550 - this.field5543 * arg1 - this.field5546 * arg2 >> 15;
        this.field5548 = -arg0 * this.field5549 - this.field5541 * arg1 - this.field5544 * arg2 >> 15;
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(III)V", line = 167)
    public final void method1869(int arg0, int arg1, int arg2) {
        this.field5540 += arg0;
        this.field5551 += arg1;
        this.field5548 += arg2;
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V", line = 177)
    public class400() {
        this.method1856();
    }
}
