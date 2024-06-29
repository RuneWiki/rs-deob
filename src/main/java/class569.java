import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class569 extends class105 {

    @OriginalMember(owner = "client!od", name = "i", descriptor = "I")
    public int field8420;

    @OriginalMember(owner = "client!od", name = "j", descriptor = "I")
    public int field8421;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "I")
    public int field8422;

    @OriginalMember(owner = "client!od", name = "l", descriptor = "I")
    public int field8423;

    @OriginalMember(owner = "client!od", name = "m", descriptor = "I")
    public int field8424;

    @OriginalMember(owner = "client!od", name = "n", descriptor = "I")
    public int field8425;

    @OriginalMember(owner = "client!od", name = "o", descriptor = "I")
    public int field8426;

    @OriginalMember(owner = "client!od", name = "p", descriptor = "I")
    public int field8427;

    @OriginalMember(owner = "client!od", name = "q", descriptor = "I")
    public int field8428;

    @OriginalMember(owner = "client!od", name = "r", descriptor = "I")
    public int field8429;

    @OriginalMember(owner = "client!od", name = "s", descriptor = "I")
    public int field8430;

    @OriginalMember(owner = "client!od", name = "t", descriptor = "I")
    public int field8431;

    @OriginalMember(owner = "client!od", name = "KA", descriptor = "(I)V", line = 4)
    public final void method621(int arg0) {
        this.field8431 = 32768;
        this.field8430 = this.field8427 = class14.field130[arg0 & 0x3FFF];
        this.field8423 = class14.field129[arg0 & 0x3FFF];
        this.field8425 = -this.field8423;
        this.field8426 = this.field8429 = this.field8428 = this.field8422 = this.field8424 = this.field8420 = this.field8421 = 0;
    }

    @OriginalMember(owner = "client!od", name = "ta", descriptor = "(I)V", line = 14)
    public final void method604(int arg0) {
        this.field8427 = 32768;
        this.field8431 = this.field8430 = class14.field130[arg0 & 0x3FFF];
        this.field8422 = class14.field129[arg0 & 0x3FFF];
        this.field8426 = -this.field8422;
        this.field8429 = this.field8428 = this.field8425 = this.field8424 = this.field8420 = this.field8423 = this.field8421 = 0;
    }

    @OriginalMember(owner = "client!od", name = "I", descriptor = "(III[I)V", line = 25)
    public final void method612(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = this.field8429 * arg2 + this.field8431 * arg0 + this.field8426 * arg1 >> 15;
        arg3[1] = this.field8425 * arg2 + this.field8430 * arg1 + this.field8422 * arg0 >> 15;
        arg3[2] = this.field8427 * arg2 + this.field8423 * arg1 + this.field8420 * arg0 >> 15;
    }

    @OriginalMember(owner = "client!od", name = "TA", descriptor = "(III)V", line = 30)
    public final void method619(int arg0, int arg1, int arg2) {
        this.field8428 += arg0;
        this.field8424 += arg1;
        this.field8421 += arg2;
    }

    @OriginalMember(owner = "client!od", name = "ha", descriptor = "()V", line = 38)
    public final void method620() {
        this.field8422 = this.field8420 = this.field8426 = this.field8423 = this.field8429 = this.field8425 = this.field8428 = this.field8424 = this.field8421 = 0;
        this.field8431 = this.field8430 = this.field8427 = 32768;
    }

    @OriginalMember(owner = "client!od", name = "k", descriptor = "(I)V", line = 45)
    public final void method611(int arg0) {
        int var2 = class14.field130[arg0 & 0x3FFF];
        int var3 = class14.field129[arg0 & 0x3FFF];
        int var4 = this.field8422;
        int var5 = this.field8430;
        int var6 = this.field8425;
        int var7 = this.field8424;
        this.field8422 = var2 * var4 - this.field8420 * var3 >> 15;
        this.field8420 = this.field8420 * var2 + var3 * var4 >> 15;
        this.field8430 = var2 * var5 - this.field8423 * var3 >> 15;
        this.field8423 = this.field8423 * var2 + var3 * var5 >> 15;
        this.field8425 = var2 * var6 - this.field8427 * var3 >> 15;
        this.field8427 = this.field8427 * var2 + var3 * var6 >> 15;
        this.field8424 = var2 * var7 - this.field8421 * var3 >> 15;
        this.field8421 = this.field8421 * var2 + var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "()Lm;", line = 67)
    public final class105 method609() {
        class569 var1 = new class569();
        var1.field8431 = this.field8431;
        var1.field8426 = this.field8426;
        var1.field8429 = this.field8429;
        var1.field8428 = this.field8428;
        var1.field8422 = this.field8422;
        var1.field8430 = this.field8430;
        var1.field8425 = this.field8425;
        var1.field8424 = this.field8424;
        var1.field8420 = this.field8420;
        var1.field8423 = this.field8423;
        var1.field8427 = this.field8427;
        var1.field8421 = this.field8421;
        return var1;
    }

    @OriginalMember(owner = "client!od", name = "ma", descriptor = "(I)V", line = 83)
    public final void method622(int arg0) {
        this.field8430 = 32768;
        this.field8431 = this.field8427 = class14.field130[arg0 & 0x3FFF];
        this.field8429 = class14.field129[arg0 & 0x3FFF];
        this.field8420 = -this.field8429;
        this.field8426 = this.field8428 = this.field8422 = this.field8425 = this.field8424 = this.field8423 = this.field8421 = 0;
    }

    @OriginalMember(owner = "client!od", name = "B", descriptor = "(IIIIII)V", line = 92)
    public final void method608(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class14.field130[arg3 & 0x3FFF];
        int var8 = class14.field129[arg3 & 0x3FFF];
        int var9 = class14.field130[arg4 & 0x3FFF];
        int var10 = class14.field129[arg4 & 0x3FFF];
        int var11 = class14.field130[arg5 & 0x3FFF];
        int var12 = class14.field129[arg5 & 0x3FFF];
        int var13 = var8 * var11 >> 15;
        int var14 = var8 * var12 >> 15;
        this.field8431 = var9 * var11 + var10 * var14 >> 15;
        this.field8422 = -var9 * var12 + var10 * var13 >> 15;
        this.field8420 = var7 * var10 >> 15;
        this.field8426 = var7 * var12 >> 15;
        this.field8430 = var7 * var11 >> 15;
        this.field8423 = -var8;
        this.field8429 = -var10 * var11 + var9 * var14 >> 15;
        this.field8425 = var9 * var13 + var10 * var12 >> 15;
        this.field8427 = var7 * var9 >> 15;
        this.field8428 = -arg0 * this.field8431 - this.field8426 * arg1 - this.field8429 * arg2 >> 15;
        this.field8424 = -arg0 * this.field8422 - this.field8430 * arg1 - this.field8425 * arg2 >> 15;
        this.field8421 = -arg0 * this.field8420 - this.field8423 * arg1 - this.field8427 * arg2 >> 15;
    }

    @OriginalMember(owner = "client!od", name = "XA", descriptor = "(I)V", line = 123)
    public final void method616(int arg0) {
        int var2 = class14.field130[arg0 & 0x3FFF];
        int var3 = class14.field129[arg0 & 0x3FFF];
        int var4 = this.field8431;
        int var5 = this.field8426;
        int var6 = this.field8429;
        int var7 = this.field8428;
        this.field8431 = this.field8420 * var3 + var2 * var4 >> 15;
        this.field8420 = this.field8420 * var2 - var3 * var4 >> 15;
        this.field8426 = this.field8423 * var3 + var2 * var5 >> 15;
        this.field8423 = this.field8423 * var2 - var3 * var5 >> 15;
        this.field8429 = this.field8427 * var3 + var2 * var6 >> 15;
        this.field8427 = this.field8427 * var2 - var3 * var6 >> 15;
        this.field8428 = this.field8421 * var3 + var2 * var7 >> 15;
        this.field8421 = this.field8421 * var2 - var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!od", name = "va", descriptor = "([I)V", line = 145)
    public final void method605(int[] arg0) {
        int var2 = arg0[0] - this.field8428;
        int var3 = arg0[1] - this.field8424;
        int var4 = arg0[2] - this.field8421;
        arg0[0] = this.field8420 * var4 + this.field8431 * var2 + this.field8422 * var3 >> 15;
        arg0[1] = this.field8423 * var4 + this.field8430 * var3 + this.field8426 * var2 >> 15;
        arg0[2] = this.field8427 * var4 + this.field8429 * var2 + this.field8425 * var3 >> 15;
    }

    @OriginalMember(owner = "client!od", name = "EA", descriptor = "(Lm;)V", line = 157)
    public final void method618(class105 arg0) {
        class569 var2 = (class569) arg0;
        this.field8431 = var2.field8431;
        this.field8426 = var2.field8426;
        this.field8429 = var2.field8429;
        this.field8428 = var2.field8428;
        this.field8422 = var2.field8422;
        this.field8430 = var2.field8430;
        this.field8425 = var2.field8425;
        this.field8424 = var2.field8424;
        this.field8420 = var2.field8420;
        this.field8423 = var2.field8423;
        this.field8427 = var2.field8427;
        this.field8421 = var2.field8421;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(III[I)V", line = 172)
    public final void method617(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (this.field8429 * arg2 + this.field8431 * arg0 + this.field8426 * arg1 >> 15) + this.field8428;
        arg3[1] = (this.field8425 * arg2 + this.field8430 * arg1 + this.field8422 * arg0 >> 15) + this.field8424;
        arg3[2] = (this.field8427 * arg2 + this.field8423 * arg1 + this.field8420 * arg0 >> 15) + this.field8421;
    }

    @OriginalMember(owner = "client!od", name = "oa", descriptor = "(III)V", line = 177)
    public final void method613(int arg0, int arg1, int arg2) {
        this.field8422 = this.field8420 = this.field8426 = this.field8423 = this.field8429 = this.field8425 = 0;
        this.field8431 = this.field8430 = this.field8427 = 32768;
        this.field8428 = arg0;
        this.field8424 = arg1;
        this.field8421 = arg2;
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V", line = 184)
    public class569() {
        this.method620();
    }
}
