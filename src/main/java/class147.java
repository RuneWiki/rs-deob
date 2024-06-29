import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class147 {

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
    private int field3640 = 2;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "[I")
    private int[] field3645 = new int[2];

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "[I")
    private int[] field3644 = new int[2];

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
    public int field3641;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
    public int field3642;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    public int field3643;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "I")
    private int field3646;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
    private int field3647;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
    private int field3648;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
    private int field3649;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "I")
    private int field3650;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "()V")
    public final void method1196() {
        this.field3649 = 0;
        this.field3648 = 0;
        this.field3650 = 0;
        this.field3646 = 0;
        this.field3647 = 0;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lib;)V")
    public final void method1197(class57 arg0) {
        this.field3640 = arg0.method510(-128);
        this.field3645 = new int[this.field3640];
        this.field3644 = new int[this.field3640];
        for (int var2 = 0; var2 < this.field3640; var2++) {
            this.field3645[var2] = arg0.method506(-1);
            this.field3644[var2] = arg0.method506(-1);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)I")
    public final int method1198(int arg0) {
        if (this.field3647 >= this.field3649) {
            this.field3646 = this.field3644[this.field3648++] << 15;
            if (this.field3648 >= this.field3640) {
                this.field3648 = this.field3640 - 1;
            }
            this.field3649 = (int) ((double) this.field3645[this.field3648] / 65536.0D * (double) arg0);
            if (this.field3649 > this.field3647) {
                this.field3650 = ((this.field3644[this.field3648] << 15) - this.field3646) / (this.field3649 - this.field3647);
            }
        }
        this.field3646 += this.field3650;
        this.field3647++;
        return this.field3646 - this.field3650 >> 15;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(Lib;)V")
    public final void method1199(class57 arg0) {
        this.field3642 = arg0.method510(-109);
        this.field3641 = arg0.method495(16711680);
        this.field3643 = arg0.method495(16711680);
        this.method1197(arg0);
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V")
    public class147() {
        this.field3645[0] = 0;
        this.field3645[1] = 65535;
        this.field3644[0] = 0;
        this.field3644[1] = 65535;
    }
}
