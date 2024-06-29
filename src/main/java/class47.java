import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aea")
public class class47 extends class389 {

    @OriginalMember(owner = "client!aea", name = "i", descriptor = "I")
    public int field509;

    @OriginalMember(owner = "client!aea", name = "j", descriptor = "I")
    public int field510;

    @OriginalMember(owner = "client!aea", name = "k", descriptor = "I")
    public int field511;

    @OriginalMember(owner = "client!aea", name = "l", descriptor = "I")
    public int field512;

    @OriginalMember(owner = "client!aea", name = "m", descriptor = "I")
    public int field513;

    @OriginalMember(owner = "client!aea", name = "n", descriptor = "I")
    public int field514;

    @OriginalMember(owner = "client!aea", name = "o", descriptor = "I")
    public int field515;

    @OriginalMember(owner = "client!aea", name = "p", descriptor = "I")
    public int field516;

    @OriginalMember(owner = "client!aea", name = "q", descriptor = "I")
    public int field517;

    @OriginalMember(owner = "client!aea", name = "r", descriptor = "I")
    public int field518;

    @OriginalMember(owner = "client!aea", name = "s", descriptor = "I")
    public int field519;

    @OriginalMember(owner = "client!aea", name = "t", descriptor = "I")
    public int field520;

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "()Lq;", line = 6)
    public final class389 method224() {
        class47 var1 = new class47();
        var1.field518 = this.field518;
        var1.field512 = this.field512;
        var1.field517 = this.field517;
        var1.field510 = this.field510;
        var1.field509 = this.field509;
        var1.field513 = this.field513;
        var1.field514 = this.field514;
        var1.field519 = this.field519;
        var1.field516 = this.field516;
        var1.field520 = this.field520;
        var1.field515 = this.field515;
        var1.field511 = this.field511;
        return var1;
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(I)V", line = 24)
    public final void method225(int arg0) {
        this.field513 = 16384;
        this.field518 = this.field515 = class285.field3656[arg0 & 0x3FFF];
        this.field517 = class285.field3655[arg0 & 0x3FFF];
        this.field516 = -this.field517;
        this.field512 = this.field510 = this.field509 = this.field514 = this.field519 = this.field520 = this.field511 = 0;
    }

    @OriginalMember(owner = "client!aea", name = "XA", descriptor = "(I)V", line = 32)
    public final void method226(int arg0) {
        this.field518 = 16384;
        this.field513 = this.field515 = class285.field3656[arg0 & 0x3FFF];
        this.field520 = class285.field3655[arg0 & 0x3FFF];
        this.field514 = -this.field520;
        this.field512 = this.field517 = this.field510 = this.field509 = this.field519 = this.field516 = this.field511 = 0;
    }

    @OriginalMember(owner = "client!aea", name = "pa", descriptor = "(IIIIII)V", line = 40)
    public final void method227(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class285.field3656[arg3 & 0x3FFF];
        int var8 = class285.field3655[arg3 & 0x3FFF];
        int var9 = class285.field3656[arg4 & 0x3FFF];
        int var10 = class285.field3655[arg4 & 0x3FFF];
        int var11 = class285.field3656[arg5 & 0x3FFF];
        int var12 = class285.field3655[arg5 & 0x3FFF];
        int var13 = var8 * var11 >> 14;
        int var14 = var8 * var12 >> 14;
        this.field518 = var9 * var11 + var10 * var14 >> 14;
        this.field509 = -var9 * var12 + var10 * var13 >> 14;
        this.field516 = var7 * var10 >> 14;
        this.field512 = var7 * var12 >> 14;
        this.field513 = var7 * var11 >> 14;
        this.field520 = -var8;
        this.field517 = -var10 * var11 + var9 * var14 >> 14;
        this.field514 = var9 * var13 + var10 * var12 >> 14;
        this.field515 = var7 * var9 >> 14;
        this.field510 = -arg0 * this.field518 - this.field512 * arg1 - this.field517 * arg2 >> 14;
        this.field519 = -arg0 * this.field509 - this.field513 * arg1 - this.field514 * arg2 >> 14;
        this.field511 = -arg0 * this.field516 - this.field520 * arg1 - this.field515 * arg2 >> 14;
    }

    @OriginalMember(owner = "client!aea", name = "GA", descriptor = "(III)V", line = 70)
    public final void method228(int arg0, int arg1, int arg2) {
        this.field509 = this.field516 = this.field512 = this.field520 = this.field517 = this.field514 = 0;
        this.field518 = this.field513 = this.field515 = 16384;
        this.field510 = arg0;
        this.field519 = arg1;
        this.field511 = arg2;
    }

    @OriginalMember(owner = "client!aea", name = "S", descriptor = "(I)V", line = 78)
    public final void method229(int arg0) {
        int var2 = class285.field3656[arg0 & 0x3FFF];
        int var3 = class285.field3655[arg0 & 0x3FFF];
        int var4 = this.field509;
        int var5 = this.field513;
        int var6 = this.field514;
        int var7 = this.field519;
        this.field509 = var2 * var4 - this.field516 * var3 >> 14;
        this.field516 = this.field516 * var2 + var3 * var4 >> 14;
        this.field513 = var2 * var5 - this.field520 * var3 >> 14;
        this.field520 = this.field520 * var2 + var3 * var5 >> 14;
        this.field514 = var2 * var6 - this.field515 * var3 >> 14;
        this.field515 = this.field515 * var2 + var3 * var6 >> 14;
        this.field519 = var2 * var7 - this.field511 * var3 >> 14;
        this.field511 = this.field511 * var2 + var3 * var7 >> 14;
    }

    @OriginalMember(owner = "client!aea", name = "R", descriptor = "(III[I)V", line = 99)
    public final void method230(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = this.field517 * arg2 + this.field518 * arg0 + this.field512 * arg1 >> 14;
        arg3[1] = this.field514 * arg2 + this.field513 * arg1 + this.field509 * arg0 >> 14;
        arg3[2] = this.field515 * arg2 + this.field520 * arg1 + this.field516 * arg0 >> 14;
    }

    @OriginalMember(owner = "client!aea", name = "ra", descriptor = "(I)V", line = 104)
    public final void method231(int arg0) {
        this.field515 = 16384;
        this.field518 = this.field513 = class285.field3656[arg0 & 0x3FFF];
        this.field509 = class285.field3655[arg0 & 0x3FFF];
        this.field512 = -this.field509;
        this.field517 = this.field510 = this.field514 = this.field519 = this.field516 = this.field520 = this.field511 = 0;
    }

    @OriginalMember(owner = "client!aea", name = "Y", descriptor = "()V", line = 113)
    public final void method232() {
        this.field509 = this.field516 = this.field512 = this.field520 = this.field517 = this.field514 = this.field510 = this.field519 = this.field511 = 0;
        this.field518 = this.field513 = this.field515 = 16384;
    }

    @OriginalMember(owner = "client!aea", name = "la", descriptor = "(Lq;)V", line = 119)
    public final void method233(class389 arg0) {
        class47 var2 = (class47) arg0;
        this.field518 = var2.field518;
        this.field512 = var2.field512;
        this.field517 = var2.field517;
        this.field510 = var2.field510;
        this.field509 = var2.field509;
        this.field513 = var2.field513;
        this.field514 = var2.field514;
        this.field519 = var2.field519;
        this.field516 = var2.field516;
        this.field520 = var2.field520;
        this.field515 = var2.field515;
        this.field511 = var2.field511;
    }

    @OriginalMember(owner = "client!aea", name = "O", descriptor = "([I)V", line = 136)
    public final void method234(int[] arg0) {
        int var2 = arg0[0] - this.field510;
        int var3 = arg0[1] - this.field519;
        int var4 = arg0[2] - this.field511;
        arg0[0] = this.field516 * var4 + this.field518 * var2 + this.field509 * var3 >> 14;
        arg0[1] = this.field520 * var4 + this.field513 * var3 + this.field512 * var2 >> 14;
        arg0[2] = this.field515 * var4 + this.field517 * var2 + this.field514 * var3 >> 14;
    }

    @OriginalMember(owner = "client!aea", name = "G", descriptor = "(III)V", line = 147)
    public final void method235(int arg0, int arg1, int arg2) {
        this.field510 += arg0;
        this.field519 += arg1;
        this.field511 += arg2;
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(III[I)V", line = 152)
    public final void method236(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (this.field517 * arg2 + this.field518 * arg0 + this.field512 * arg1 >> 14) + this.field510;
        arg3[1] = (this.field514 * arg2 + this.field513 * arg1 + this.field509 * arg0 >> 14) + this.field519;
        arg3[2] = (this.field515 * arg2 + this.field520 * arg1 + this.field516 * arg0 >> 14) + this.field511;
    }

    @OriginalMember(owner = "client!aea", name = "P", descriptor = "(I)V", line = 161)
    public final void method237(int arg0) {
        int var2 = class285.field3656[arg0 & 0x3FFF];
        int var3 = class285.field3655[arg0 & 0x3FFF];
        int var4 = this.field518;
        int var5 = this.field512;
        int var6 = this.field517;
        int var7 = this.field510;
        this.field518 = this.field516 * var3 + var2 * var4 >> 14;
        this.field516 = this.field516 * var2 - var3 * var4 >> 14;
        this.field512 = this.field520 * var3 + var2 * var5 >> 14;
        this.field520 = this.field520 * var2 - var3 * var5 >> 14;
        this.field517 = this.field515 * var3 + var2 * var6 >> 14;
        this.field515 = this.field515 * var2 - var3 * var6 >> 14;
        this.field510 = this.field511 * var3 + var2 * var7 >> 14;
        this.field511 = this.field511 * var2 - var3 * var7 >> 14;
    }

    @OriginalMember(owner = "client!aea", name = "<init>", descriptor = "()V", line = 183)
    public class47() {
        this.method232();
    }
}
