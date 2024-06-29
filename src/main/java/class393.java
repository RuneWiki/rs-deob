import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class393 extends class512 {

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
    public int field5668;

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "I")
    public int field5669;

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "I")
    public int field5670;

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "I")
    public int field5671;

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "I")
    public int field5672;

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "I")
    public int field5673;

    @OriginalMember(owner = "client!ii", name = "l", descriptor = "I")
    public int field5674;

    @OriginalMember(owner = "client!ii", name = "m", descriptor = "I")
    public int field5675;

    @OriginalMember(owner = "client!ii", name = "n", descriptor = "I")
    public int field5676;

    @OriginalMember(owner = "client!ii", name = "o", descriptor = "I")
    public int field5677;

    @OriginalMember(owner = "client!ii", name = "p", descriptor = "I")
    public int field5678;

    @OriginalMember(owner = "client!ii", name = "q", descriptor = "I")
    public int field5679;

    @OriginalMember(owner = "client!ii", name = "A", descriptor = "(I)V")
    public final void method950(int arg0) {
        this.field5678 = 32768;
        this.field5674 = this.field5677 = class51.field731[arg0 & 0x3FFF];
        this.field5679 = class51.field743[arg0 & 0x3FFF];
        this.field5673 = -this.field5679;
        this.field5668 = this.field5675 = this.field5669 = this.field5672 = this.field5671 = this.field5670 = this.field5676 = 0;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "()Lc;")
    public final class512 method947() {
        class393 var1 = new class393();
        var1.field5674 = this.field5674;
        var1.field5673 = this.field5673;
        var1.field5668 = this.field5668;
        var1.field5675 = this.field5675;
        var1.field5679 = this.field5679;
        var1.field5677 = this.field5677;
        var1.field5669 = this.field5669;
        var1.field5672 = this.field5672;
        var1.field5671 = this.field5671;
        var1.field5670 = this.field5670;
        var1.field5678 = this.field5678;
        var1.field5676 = this.field5676;
        return var1;
    }

    @OriginalMember(owner = "client!ii", name = "K", descriptor = "(III[I)V")
    public final void method945(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = this.field5668 * arg2 + this.field5674 * arg0 + this.field5673 * arg1 >> 15;
        arg3[1] = this.field5669 * arg2 + this.field5679 * arg0 + this.field5677 * arg1 >> 15;
        arg3[2] = this.field5678 * arg2 + this.field5671 * arg0 + this.field5670 * arg1 >> 15;
    }

    @OriginalMember(owner = "client!ii", name = "ca", descriptor = "(I)V")
    public final void method953(int arg0) {
        this.field5677 = 32768;
        this.field5674 = this.field5678 = class51.field731[arg0 & 0x3FFF];
        this.field5668 = class51.field743[arg0 & 0x3FFF];
        this.field5671 = -this.field5668;
        this.field5673 = this.field5675 = this.field5679 = this.field5669 = this.field5672 = this.field5670 = this.field5676 = 0;
    }

    @OriginalMember(owner = "client!ii", name = "wa", descriptor = "([I)V")
    public final void method941(int[] arg0) {
        int var2 = arg0[0] - this.field5675;
        int var3 = arg0[1] - this.field5672;
        int var4 = arg0[2] - this.field5676;
        arg0[0] = this.field5671 * var4 + this.field5679 * var3 + this.field5674 * var2 >> 15;
        arg0[1] = this.field5670 * var4 + this.field5677 * var3 + this.field5673 * var2 >> 15;
        arg0[2] = this.field5678 * var4 + this.field5669 * var3 + this.field5668 * var2 >> 15;
    }

    @OriginalMember(owner = "client!ii", name = "ea", descriptor = "(I)V")
    public final void method940(int arg0) {
        int var2 = class51.field731[arg0 & 0x3FFF];
        int var3 = class51.field743[arg0 & 0x3FFF];
        int var4 = this.field5679;
        int var5 = this.field5677;
        int var6 = this.field5669;
        int var7 = this.field5672;
        this.field5679 = var2 * var4 - this.field5671 * var3 >> 15;
        this.field5671 = this.field5671 * var2 + var3 * var4 >> 15;
        this.field5677 = var2 * var5 - this.field5670 * var3 >> 15;
        this.field5670 = this.field5670 * var2 + var3 * var5 >> 15;
        this.field5669 = var2 * var6 - this.field5678 * var3 >> 15;
        this.field5678 = this.field5678 * var2 + var3 * var6 >> 15;
        this.field5672 = var2 * var7 - this.field5676 * var3 >> 15;
        this.field5676 = this.field5676 * var2 + var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!ii", name = "ha", descriptor = "(Lc;)V")
    public final void method944(class512 arg0) {
        class393 var2 = (class393) arg0;
        this.field5674 = var2.field5674;
        this.field5673 = var2.field5673;
        this.field5668 = var2.field5668;
        this.field5675 = var2.field5675;
        this.field5679 = var2.field5679;
        this.field5677 = var2.field5677;
        this.field5669 = var2.field5669;
        this.field5672 = var2.field5672;
        this.field5671 = var2.field5671;
        this.field5670 = var2.field5670;
        this.field5678 = var2.field5678;
        this.field5676 = var2.field5676;
    }

    @OriginalMember(owner = "client!ii", name = "YA", descriptor = "(IIIIII)V")
    public final void method943(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class51.field731[arg3 & 0x3FFF];
        int var8 = class51.field743[arg3 & 0x3FFF];
        int var9 = class51.field731[arg4 & 0x3FFF];
        int var10 = class51.field743[arg4 & 0x3FFF];
        int var11 = class51.field731[arg5 & 0x3FFF];
        int var12 = class51.field743[arg5 & 0x3FFF];
        int var13 = var8 * var11 >> 15;
        int var14 = var8 * var12 >> 15;
        this.field5674 = var9 * var11 + var10 * var14 >> 15;
        this.field5679 = -var9 * var12 + var10 * var13 >> 15;
        this.field5671 = var7 * var10 >> 15;
        this.field5673 = var7 * var12 >> 15;
        this.field5677 = var7 * var11 >> 15;
        this.field5670 = -var8;
        this.field5668 = -var10 * var11 + var9 * var14 >> 15;
        this.field5669 = var9 * var13 + var10 * var12 >> 15;
        this.field5678 = var7 * var9 >> 15;
        this.field5675 = -arg0 * this.field5674 - this.field5673 * arg1 - this.field5668 * arg2 >> 15;
        this.field5672 = -arg0 * this.field5679 - this.field5677 * arg1 - this.field5669 * arg2 >> 15;
        this.field5676 = -arg0 * this.field5671 - this.field5670 * arg1 - this.field5678 * arg2 >> 15;
    }

    @OriginalMember(owner = "client!ii", name = "W", descriptor = "(III)V")
    public final void method948(int arg0, int arg1, int arg2) {
        this.field5675 += arg0;
        this.field5672 += arg1;
        this.field5676 += arg2;
    }

    @OriginalMember(owner = "client!ii", name = "EA", descriptor = "(I)V")
    public final void method949(int arg0) {
        int var2 = class51.field731[arg0 & 0x3FFF];
        int var3 = class51.field743[arg0 & 0x3FFF];
        int var4 = this.field5674;
        int var5 = this.field5673;
        int var6 = this.field5668;
        int var7 = this.field5675;
        this.field5674 = this.field5671 * var3 + var2 * var4 >> 15;
        this.field5671 = this.field5671 * var2 - var3 * var4 >> 15;
        this.field5673 = this.field5670 * var3 + var2 * var5 >> 15;
        this.field5670 = this.field5670 * var2 - var3 * var5 >> 15;
        this.field5668 = this.field5678 * var3 + var2 * var6 >> 15;
        this.field5678 = this.field5678 * var2 - var3 * var6 >> 15;
        this.field5675 = this.field5676 * var3 + var2 * var7 >> 15;
        this.field5676 = this.field5676 * var2 - var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "(I)V")
    public final void method942(int arg0) {
        this.field5674 = 32768;
        this.field5677 = this.field5678 = class51.field731[arg0 & 0x3FFF];
        this.field5670 = class51.field743[arg0 & 0x3FFF];
        this.field5669 = -this.field5670;
        this.field5673 = this.field5668 = this.field5675 = this.field5679 = this.field5672 = this.field5671 = this.field5676 = 0;
    }

    @OriginalMember(owner = "client!ii", name = "v", descriptor = "()V")
    public final void method954() {
        this.field5679 = this.field5671 = this.field5673 = this.field5670 = this.field5668 = this.field5669 = this.field5675 = this.field5672 = this.field5676 = 0;
        this.field5674 = this.field5677 = this.field5678 = 32768;
    }

    @OriginalMember(owner = "client!ii", name = "U", descriptor = "(III)V")
    public final void method955(int arg0, int arg1, int arg2) {
        this.field5679 = this.field5671 = this.field5673 = this.field5670 = this.field5668 = this.field5669 = 0;
        this.field5674 = this.field5677 = this.field5678 = 32768;
        this.field5675 = arg0;
        this.field5672 = arg1;
        this.field5676 = arg2;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(III[I)V")
    public final void method946(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (this.field5668 * arg2 + this.field5674 * arg0 + this.field5673 * arg1 >> 15) + this.field5675;
        arg3[1] = (this.field5669 * arg2 + this.field5679 * arg0 + this.field5677 * arg1 >> 15) + this.field5672;
        arg3[2] = (this.field5678 * arg2 + this.field5671 * arg0 + this.field5670 * arg1 >> 15) + this.field5676;
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "()V")
    public class393() {
        this.method954();
    }
}
