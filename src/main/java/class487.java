import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class487 extends class163 {

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "I")
    public int field6800;

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "I")
    public int field6801;

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "I")
    public int field6802;

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "I")
    public int field6803;

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "I")
    public int field6804;

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "I")
    public int field6805;

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "I")
    public int field6806;

    @OriginalMember(owner = "client!hj", name = "m", descriptor = "I")
    public int field6807;

    @OriginalMember(owner = "client!hj", name = "n", descriptor = "I")
    public int field6808;

    @OriginalMember(owner = "client!hj", name = "o", descriptor = "I")
    public int field6809;

    @OriginalMember(owner = "client!hj", name = "p", descriptor = "I")
    public int field6810;

    @OriginalMember(owner = "client!hj", name = "q", descriptor = "I")
    public int field6811;

    @OriginalMember(owner = "client!hj", name = "KA", descriptor = "(I)V", line = 6)
    public final void method659(int arg0) {
        this.field6804 = 32768;
        this.field6803 = this.field6808 = class442.field6101[arg0 & 0x3FFF];
        this.field6811 = class442.field6100[arg0 & 0x3FFF];
        this.field6806 = -this.field6811;
        this.field6801 = this.field6805 = this.field6802 = this.field6809 = this.field6810 = this.field6807 = this.field6800 = 0;
    }

    @OriginalMember(owner = "client!hj", name = "va", descriptor = "([I)V", line = 15)
    public final void method660(int[] arg0) {
        int var2 = arg0[0] - this.field6802;
        int var3 = arg0[1] - this.field6810;
        int var4 = arg0[2] - this.field6800;
        arg0[0] = this.field6807 * var4 + this.field6809 * var3 + this.field6804 * var2 >> 15;
        arg0[1] = this.field6811 * var4 + this.field6803 * var3 + this.field6801 * var2 >> 15;
        arg0[2] = this.field6808 * var4 + this.field6806 * var3 + this.field6805 * var2 >> 15;
    }

    @OriginalMember(owner = "client!hj", name = "oa", descriptor = "(III)V", line = 25)
    public final void method661(int arg0, int arg1, int arg2) {
        this.field6809 = this.field6807 = this.field6801 = this.field6811 = this.field6805 = this.field6806 = 0;
        this.field6804 = this.field6803 = this.field6808 = 32768;
        this.field6802 = arg0;
        this.field6810 = arg1;
        this.field6800 = arg2;
    }

    @OriginalMember(owner = "client!hj", name = "ta", descriptor = "(I)V", line = 34)
    public final void method666(int arg0) {
        this.field6808 = 32768;
        this.field6804 = this.field6803 = class442.field6101[arg0 & 0x3FFF];
        this.field6809 = class442.field6100[arg0 & 0x3FFF];
        this.field6801 = -this.field6809;
        this.field6805 = this.field6802 = this.field6806 = this.field6810 = this.field6807 = this.field6811 = this.field6800 = 0;
    }

    @OriginalMember(owner = "client!hj", name = "EA", descriptor = "(Lm;)V", line = 42)
    public final void method676(class163 arg0) {
        class487 var2 = (class487) arg0;
        this.field6804 = var2.field6804;
        this.field6801 = var2.field6801;
        this.field6805 = var2.field6805;
        this.field6802 = var2.field6802;
        this.field6809 = var2.field6809;
        this.field6803 = var2.field6803;
        this.field6806 = var2.field6806;
        this.field6810 = var2.field6810;
        this.field6807 = var2.field6807;
        this.field6811 = var2.field6811;
        this.field6808 = var2.field6808;
        this.field6800 = var2.field6800;
    }

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "(I)V", line = 58)
    public final void method671(int arg0) {
        int var2 = class442.field6101[arg0 & 0x3FFF];
        int var3 = class442.field6100[arg0 & 0x3FFF];
        int var4 = this.field6809;
        int var5 = this.field6803;
        int var6 = this.field6806;
        int var7 = this.field6810;
        this.field6809 = var2 * var4 - this.field6807 * var3 >> 15;
        this.field6807 = this.field6807 * var2 + var3 * var4 >> 15;
        this.field6803 = var2 * var5 - this.field6811 * var3 >> 15;
        this.field6811 = this.field6811 * var2 + var3 * var5 >> 15;
        this.field6806 = var2 * var6 - this.field6808 * var3 >> 15;
        this.field6808 = this.field6808 * var2 + var3 * var6 >> 15;
        this.field6810 = var2 * var7 - this.field6800 * var3 >> 15;
        this.field6800 = this.field6800 * var2 + var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "()Lm;", line = 80)
    public final class163 method675() {
        class487 var1 = new class487();
        var1.field6804 = this.field6804;
        var1.field6801 = this.field6801;
        var1.field6805 = this.field6805;
        var1.field6802 = this.field6802;
        var1.field6809 = this.field6809;
        var1.field6803 = this.field6803;
        var1.field6806 = this.field6806;
        var1.field6810 = this.field6810;
        var1.field6807 = this.field6807;
        var1.field6811 = this.field6811;
        var1.field6808 = this.field6808;
        var1.field6800 = this.field6800;
        return var1;
    }

    @OriginalMember(owner = "client!hj", name = "B", descriptor = "(IIIIII)V", line = 98)
    public final void method669(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class442.field6101[arg3 & 0x3FFF];
        int var8 = class442.field6100[arg3 & 0x3FFF];
        int var9 = class442.field6101[arg4 & 0x3FFF];
        int var10 = class442.field6100[arg4 & 0x3FFF];
        int var11 = class442.field6101[arg5 & 0x3FFF];
        int var12 = class442.field6100[arg5 & 0x3FFF];
        int var13 = var8 * var11 >> 15;
        int var14 = var8 * var12 >> 15;
        this.field6804 = var9 * var11 + var10 * var14 >> 15;
        this.field6809 = -var9 * var12 + var10 * var13 >> 15;
        this.field6807 = var7 * var10 >> 15;
        this.field6801 = var7 * var12 >> 15;
        this.field6803 = var7 * var11 >> 15;
        this.field6811 = -var8;
        this.field6805 = -var10 * var11 + var9 * var14 >> 15;
        this.field6806 = var9 * var13 + var10 * var12 >> 15;
        this.field6808 = var7 * var9 >> 15;
        this.field6802 = -arg0 * this.field6804 - this.field6801 * arg1 - this.field6805 * arg2 >> 15;
        this.field6810 = -arg0 * this.field6809 - this.field6803 * arg1 - this.field6806 * arg2 >> 15;
        this.field6800 = -arg0 * this.field6807 - this.field6811 * arg1 - this.field6808 * arg2 >> 15;
    }

    @OriginalMember(owner = "client!hj", name = "TA", descriptor = "(III)V", line = 130)
    public final void method655(int arg0, int arg1, int arg2) {
        this.field6802 += arg0;
        this.field6810 += arg1;
        this.field6800 += arg2;
    }

    @OriginalMember(owner = "client!hj", name = "I", descriptor = "(III[I)V", line = 135)
    public final void method662(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = this.field6805 * arg2 + this.field6804 * arg0 + this.field6801 * arg1 >> 15;
        arg3[1] = this.field6806 * arg2 + this.field6809 * arg0 + this.field6803 * arg1 >> 15;
        arg3[2] = this.field6808 * arg2 + this.field6811 * arg1 + this.field6807 * arg0 >> 15;
    }

    @OriginalMember(owner = "client!hj", name = "ha", descriptor = "()V", line = 145)
    public final void method656() {
        this.field6809 = this.field6807 = this.field6801 = this.field6811 = this.field6805 = this.field6806 = this.field6802 = this.field6810 = this.field6800 = 0;
        this.field6804 = this.field6803 = this.field6808 = 32768;
    }

    @OriginalMember(owner = "client!hj", name = "ma", descriptor = "(I)V", line = 150)
    public final void method664(int arg0) {
        this.field6803 = 32768;
        this.field6804 = this.field6808 = class442.field6101[arg0 & 0x3FFF];
        this.field6805 = class442.field6100[arg0 & 0x3FFF];
        this.field6807 = -this.field6805;
        this.field6801 = this.field6802 = this.field6809 = this.field6806 = this.field6810 = this.field6811 = this.field6800 = 0;
    }

    @OriginalMember(owner = "client!hj", name = "XA", descriptor = "(I)V", line = 159)
    public final void method672(int arg0) {
        int var2 = class442.field6101[arg0 & 0x3FFF];
        int var3 = class442.field6100[arg0 & 0x3FFF];
        int var4 = this.field6804;
        int var5 = this.field6801;
        int var6 = this.field6805;
        int var7 = this.field6802;
        this.field6804 = this.field6807 * var3 + var2 * var4 >> 15;
        this.field6807 = this.field6807 * var2 - var3 * var4 >> 15;
        this.field6801 = this.field6811 * var3 + var2 * var5 >> 15;
        this.field6811 = this.field6811 * var2 - var3 * var5 >> 15;
        this.field6805 = this.field6808 * var3 + var2 * var6 >> 15;
        this.field6808 = this.field6808 * var2 - var3 * var6 >> 15;
        this.field6802 = this.field6800 * var3 + var2 * var7 >> 15;
        this.field6800 = this.field6800 * var2 - var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "()V", line = 179)
    public class487() {
        this.method656();
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(III[I)V", line = 183)
    public final void method657(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (this.field6805 * arg2 + this.field6804 * arg0 + this.field6801 * arg1 >> 15) + this.field6802;
        arg3[1] = (this.field6806 * arg2 + this.field6809 * arg0 + this.field6803 * arg1 >> 15) + this.field6810;
        arg3[2] = (this.field6808 * arg2 + this.field6811 * arg1 + this.field6807 * arg0 >> 15) + this.field6800;
    }
}
