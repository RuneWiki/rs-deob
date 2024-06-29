import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iea")
public class class598 {

    @OriginalMember(owner = "client!iea", name = "c", descriptor = "I")
    private int field8650 = 2;

    @OriginalMember(owner = "client!iea", name = "e", descriptor = "[I")
    private int[] field8652 = new int[2];

    @OriginalMember(owner = "client!iea", name = "f", descriptor = "[I")
    private int[] field8653 = new int[2];

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "I")
    public int field8648;

    @OriginalMember(owner = "client!iea", name = "b", descriptor = "I")
    public int field8649;

    @OriginalMember(owner = "client!iea", name = "d", descriptor = "I")
    public int field8651;

    @OriginalMember(owner = "client!iea", name = "g", descriptor = "I")
    private int field8654;

    @OriginalMember(owner = "client!iea", name = "h", descriptor = "I")
    private int field8655;

    @OriginalMember(owner = "client!iea", name = "i", descriptor = "I")
    private int field8656;

    @OriginalMember(owner = "client!iea", name = "j", descriptor = "I")
    private int field8657;

    @OriginalMember(owner = "client!iea", name = "k", descriptor = "I")
    private int field8658;

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(Lgk;)V", line = 3)
    public final void method3403(class540 arg0) {
        this.field8649 = arg0.method3115(29871);
        this.field8648 = arg0.method3160(false);
        this.field8651 = arg0.method3160(false);
        this.method3405(arg0);
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(I)I", line = 11)
    public final int method3404(int arg0) {
        if (this.field8658 >= this.field8655) {
            this.field8657 = this.field8653[this.field8654++] << 15;
            if (this.field8654 >= this.field8650) {
                this.field8654 = this.field8650 - 1;
            }
            this.field8655 = (int) ((double) this.field8652[this.field8654] / 65536.0D * (double) arg0);
            if (this.field8655 > this.field8658) {
                this.field8656 = ((this.field8653[this.field8654] << 15) - this.field8657) / (this.field8655 - this.field8658);
            }
        }
        this.field8657 += this.field8656;
        this.field8658++;
        return this.field8657 - this.field8656 >> 15;
    }

    @OriginalMember(owner = "client!iea", name = "b", descriptor = "(Lgk;)V", line = 28)
    public final void method3405(class540 arg0) {
        this.field8650 = arg0.method3115(29871);
        this.field8652 = new int[this.field8650];
        this.field8653 = new int[this.field8650];
        for (int var2 = 0; var2 < this.field8650; var2++) {
            this.field8652[var2] = arg0.method3169(26488);
            this.field8653[var2] = arg0.method3169(26488);
        }
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "()V", line = 47)
    public final void method3406() {
        this.field8655 = 0;
        this.field8654 = 0;
        this.field8656 = 0;
        this.field8657 = 0;
        this.field8658 = 0;
    }

    @OriginalMember(owner = "client!iea", name = "<init>", descriptor = "()V", line = 56)
    public class598() {
        this.field8652[0] = 0;
        this.field8652[1] = 65535;
        this.field8653[0] = 0;
        this.field8653[1] = 65535;
    }
}
