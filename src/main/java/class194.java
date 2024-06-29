import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class194 {

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "I")
    private int field2782 = 2;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "[I")
    private int[] field2786 = new int[2];

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "[I")
    private int[] field2784 = new int[2];

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "I")
    public int field2783;

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "I")
    public int field2785;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "I")
    public int field2787;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
    private int field2788;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "I")
    private int field2789;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "I")
    private int field2790;

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "I")
    private int field2791;

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "I")
    private int field2792;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lp;)V", line = 3)
    public final void method1348(class107 arg0) {
        this.field2787 = arg0.method661(-1);
        this.field2785 = arg0.method676(true);
        this.field2783 = arg0.method676(true);
        this.method1349(arg0);
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(Lp;)V", line = 9)
    public final void method1349(class107 arg0) {
        this.field2782 = arg0.method661(-1);
        this.field2786 = new int[this.field2782];
        this.field2784 = new int[this.field2782];
        for (int var2 = 0; var2 < this.field2782; var2++) {
            this.field2786[var2] = arg0.method624(14612);
            this.field2784[var2] = arg0.method624(14612);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)I", line = 28)
    public final int method1350(int arg0) {
        if (this.field2788 >= this.field2789) {
            this.field2792 = this.field2784[this.field2791++] << 15;
            if (this.field2791 >= this.field2782) {
                this.field2791 = this.field2782 - 1;
            }
            this.field2789 = (int) ((double) this.field2786[this.field2791] / 65536.0D * (double) arg0);
            if (this.field2789 > this.field2788) {
                this.field2790 = ((this.field2784[this.field2791] << 15) - this.field2792) / (this.field2789 - this.field2788);
            }
        }
        this.field2792 += this.field2790;
        this.field2788++;
        return this.field2792 - this.field2790 >> 15;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "()V", line = 47)
    public final void method1351() {
        this.field2789 = 0;
        this.field2791 = 0;
        this.field2790 = 0;
        this.field2792 = 0;
        this.field2788 = 0;
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "()V", line = 56)
    public class194() {
        this.field2786[0] = 0;
        this.field2786[1] = 65535;
        this.field2784[0] = 0;
        this.field2784[1] = 65535;
    }
}
