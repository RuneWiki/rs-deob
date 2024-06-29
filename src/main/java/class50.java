import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class50 {

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
    private int field690 = 2;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "[I")
    private int[] field686 = new int[2];

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "[I")
    private int[] field689 = new int[2];

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public int field685;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
    public int field687;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
    public int field688;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
    private int field691;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
    private int field692;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
    private int field693;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
    private int field694;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
    private int field695;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)I")
    public final int method303(int arg0) {
        if (this.field691 >= this.field694) {
            this.field692 = this.field689[this.field695++] << 15;
            if (this.field695 >= this.field690) {
                this.field695 = this.field690 - 1;
            }
            this.field694 = (int) ((double) this.field686[this.field695] / 65536.0D * (double) arg0);
            if (this.field694 > this.field691) {
                this.field693 = ((this.field689[this.field695] << 15) - this.field692) / (this.field694 - this.field691);
            }
        }
        this.field692 += this.field693;
        this.field691++;
        return this.field692 - this.field693 >> 15;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lhc;)V")
    public final void method304(class53 arg0) {
        this.field687 = arg0.method366(-16505);
        this.field685 = arg0.method340(-100);
        this.field688 = arg0.method340(-87);
        this.method306(arg0);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "()V")
    public final void method305() {
        this.field694 = 0;
        this.field695 = 0;
        this.field693 = 0;
        this.field692 = 0;
        this.field691 = 0;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(Lhc;)V")
    public final void method306(class53 arg0) {
        this.field690 = arg0.method366(-16505);
        this.field686 = new int[this.field690];
        this.field689 = new int[this.field690];
        for (int var2 = 0; var2 < this.field690; var2++) {
            this.field686[var2] = arg0.method331(-81);
            this.field689[var2] = arg0.method331(-33);
        }
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "()V")
    public class50() {
        this.field686[0] = 0;
        this.field686[1] = 65535;
        this.field689[0] = 0;
        this.field689[1] = 65535;
    }
}
