import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class331 extends class450 {

    @OriginalMember(owner = "client!jo", name = "k", descriptor = "I")
    public int field4507;

    @OriginalMember(owner = "client!jo", name = "l", descriptor = "I")
    public int field4508;

    @OriginalMember(owner = "client!jo", name = "m", descriptor = "I")
    public int field4509;

    @OriginalMember(owner = "client!jo", name = "n", descriptor = "I")
    public int field4510;

    @OriginalMember(owner = "client!jo", name = "o", descriptor = "I")
    public int field4511;

    @OriginalMember(owner = "client!jo", name = "p", descriptor = "I")
    public int field4512;

    @OriginalMember(owner = "client!jo", name = "q", descriptor = "I")
    public int field4513;

    @OriginalMember(owner = "client!jo", name = "r", descriptor = "I")
    public int field4514;

    @OriginalMember(owner = "client!jo", name = "s", descriptor = "I")
    public int field4515;

    @OriginalMember(owner = "client!jo", name = "t", descriptor = "I")
    public int field4516;

    @OriginalMember(owner = "client!jo", name = "u", descriptor = "I")
    public int field4517;

    @OriginalMember(owner = "client!jo", name = "v", descriptor = "I")
    public int field4518;

    @OriginalMember(owner = "client!jo", name = "f", descriptor = "(I)V", line = 4)
    public final void method938(int arg0) {
        int var2 = class363.field4917[arg0 & 0x3FFF];
        int var3 = class363.field4927[arg0 & 0x3FFF];
        int var4 = this.field4515;
        int var5 = this.field4510;
        int var6 = this.field4509;
        int var7 = this.field4517;
        this.field4515 = var2 * var4 - this.field4516 * var3 >> 15;
        this.field4516 = this.field4516 * var2 + var3 * var4 >> 15;
        this.field4510 = var2 * var5 - this.field4511 * var3 >> 15;
        this.field4511 = this.field4511 * var2 + var3 * var5 >> 15;
        this.field4509 = var2 * var6 - this.field4508 * var3 >> 15;
        this.field4508 = this.field4508 * var2 + var3 * var6 >> 15;
        this.field4517 = var2 * var7 - this.field4514 * var3 >> 15;
        this.field4514 = this.field4514 * var2 + var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "(I)V", line = 27)
    public final void method930(int arg0) {
        this.field4510 = 32768;
        this.field4518 = this.field4508 = class363.field4917[arg0 & 0x3FFF];
        this.field4512 = class363.field4927[arg0 & 0x3FFF];
        this.field4516 = -this.field4512;
        this.field4513 = this.field4507 = this.field4515 = this.field4509 = this.field4517 = this.field4511 = this.field4514 = 0;
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(III)V", line = 35)
    public final void method933(int arg0, int arg1, int arg2) {
        this.field4507 += arg0;
        this.field4517 += arg1;
        this.field4514 += arg2;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(III[I)V", line = 40)
    public final void method924(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (this.field4512 * arg2 + this.field4518 * arg0 + this.field4513 * arg1 >> 15) + this.field4507;
        arg3[1] = (this.field4509 * arg2 + this.field4515 * arg0 + this.field4510 * arg1 >> 15) + this.field4517;
        arg3[2] = (this.field4508 * arg2 + this.field4516 * arg0 + this.field4511 * arg1 >> 15) + this.field4514;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIIIII)V", line = 49)
    public final void method928(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class363.field4917[arg3 & 0x3FFF];
        int var8 = class363.field4927[arg3 & 0x3FFF];
        int var9 = class363.field4917[arg4 & 0x3FFF];
        int var10 = class363.field4927[arg4 & 0x3FFF];
        int var11 = class363.field4917[arg5 & 0x3FFF];
        int var12 = class363.field4927[arg5 & 0x3FFF];
        int var13 = var8 * var11 >> 15;
        int var14 = var8 * var12 >> 15;
        this.field4518 = var9 * var11 + var10 * var14 >> 15;
        this.field4515 = -var9 * var12 + var10 * var13 >> 15;
        this.field4516 = var7 * var10 >> 15;
        this.field4513 = var7 * var12 >> 15;
        this.field4510 = var7 * var11 >> 15;
        this.field4511 = -var8;
        this.field4512 = -var10 * var11 + var9 * var14 >> 15;
        this.field4509 = var9 * var13 + var10 * var12 >> 15;
        this.field4508 = var7 * var9 >> 15;
        this.field4507 = -arg0 * this.field4518 - this.field4513 * arg1 - this.field4512 * arg2 >> 15;
        this.field4517 = -arg0 * this.field4515 - this.field4510 * arg1 - this.field4509 * arg2 >> 15;
        this.field4514 = -arg0 * this.field4516 - this.field4511 * arg1 - this.field4508 * arg2 >> 15;
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "()Ljo;", line = 79)
    public final class331 method2127() {
        class331 var1 = new class331();
        var1.field4518 = this.field4518;
        var1.field4513 = this.field4513;
        var1.field4512 = this.field4512;
        var1.field4507 = this.field4507;
        var1.field4515 = this.field4515;
        var1.field4510 = this.field4510;
        var1.field4509 = this.field4509;
        var1.field4517 = this.field4517;
        var1.field4516 = this.field4516;
        var1.field4511 = this.field4511;
        var1.field4508 = this.field4508;
        var1.field4514 = this.field4514;
        return var1;
    }

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "(I)V", line = 96)
    public final void method934(int arg0) {
        int var2 = class363.field4917[arg0 & 0x3FFF];
        int var3 = class363.field4927[arg0 & 0x3FFF];
        int var4 = this.field4518;
        int var5 = this.field4513;
        int var6 = this.field4512;
        int var7 = this.field4507;
        this.field4518 = this.field4516 * var3 + var2 * var4 >> 15;
        this.field4516 = this.field4516 * var2 - var3 * var4 >> 15;
        this.field4513 = this.field4511 * var3 + var2 * var5 >> 15;
        this.field4511 = this.field4511 * var2 - var3 * var5 >> 15;
        this.field4512 = this.field4508 * var3 + var2 * var6 >> 15;
        this.field4508 = this.field4508 * var2 - var3 * var6 >> 15;
        this.field4507 = this.field4514 * var3 + var2 * var7 >> 15;
        this.field4514 = this.field4514 * var2 - var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)V", line = 117)
    public final void method937(int arg0) {
        this.field4508 = 32768;
        this.field4518 = this.field4510 = class363.field4917[arg0 & 0x3FFF];
        this.field4515 = class363.field4927[arg0 & 0x3FFF];
        this.field4513 = -this.field4515;
        this.field4512 = this.field4507 = this.field4509 = this.field4517 = this.field4516 = this.field4511 = this.field4514 = 0;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(III)V", line = 126)
    public final void method929(int arg0, int arg1, int arg2) {
        this.field4515 = this.field4516 = this.field4513 = this.field4511 = this.field4512 = this.field4509 = 0;
        this.field4518 = this.field4510 = this.field4508 = 32768;
        this.field4507 = arg0;
        this.field4517 = arg1;
        this.field4514 = arg2;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lwr;)V", line = 135)
    public final void method923(class450 arg0) {
        class331 var2 = (class331) arg0;
        this.field4518 = var2.field4518;
        this.field4513 = var2.field4513;
        this.field4512 = var2.field4512;
        this.field4507 = var2.field4507;
        this.field4515 = var2.field4515;
        this.field4510 = var2.field4510;
        this.field4509 = var2.field4509;
        this.field4517 = var2.field4517;
        this.field4516 = var2.field4516;
        this.field4511 = var2.field4511;
        this.field4508 = var2.field4508;
        this.field4514 = var2.field4514;
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(I)V", line = 151)
    public final void method932(int arg0) {
        this.field4518 = 32768;
        this.field4510 = this.field4508 = class363.field4917[arg0 & 0x3FFF];
        this.field4511 = class363.field4927[arg0 & 0x3FFF];
        this.field4509 = -this.field4511;
        this.field4513 = this.field4512 = this.field4507 = this.field4515 = this.field4517 = this.field4516 = this.field4514 = 0;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "()V", line = 160)
    public final void method931() {
        this.field4515 = this.field4516 = this.field4513 = this.field4511 = this.field4512 = this.field4509 = this.field4507 = this.field4517 = this.field4514 = 0;
        this.field4518 = this.field4510 = this.field4508 = 32768;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "([I)V", line = 166)
    public final void method926(int[] arg0) {
        int var2 = arg0[0] - this.field4507;
        int var3 = arg0[1] - this.field4517;
        int var4 = arg0[2] - this.field4514;
        arg0[0] = this.field4516 * var4 + this.field4518 * var2 + this.field4515 * var3 >> 15;
        arg0[1] = this.field4511 * var4 + this.field4513 * var2 + this.field4510 * var3 >> 15;
        arg0[2] = this.field4508 * var4 + this.field4512 * var2 + this.field4509 * var3 >> 15;
    }

    @OriginalMember(owner = "client!jo", name = "<init>", descriptor = "()V", line = 177)
    public class331() {
        this.method931();
    }
}
