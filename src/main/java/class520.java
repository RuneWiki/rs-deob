import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class520 {

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    private int field7560 = 2;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "[I")
    private int[] field7559 = new int[2];

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "[I")
    private int[] field7561 = new int[2];

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    public int field7557;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public int field7558;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "I")
    public int field7562;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
    private int field7563;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
    private int field7564;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "I")
    private int field7565;

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "I")
    private int field7566;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "I")
    private int field7567;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)I")
    public final int method3076(int arg0) {
        if (this.field7565 >= this.field7566) {
            this.field7567 = this.field7561[this.field7564++] << 15;
            if (this.field7564 >= this.field7560) {
                this.field7564 = this.field7560 - 1;
            }
            this.field7566 = (int) ((double) this.field7559[this.field7564] / 65536.0D * (double) arg0);
            if (this.field7566 > this.field7565) {
                this.field7563 = ((this.field7561[this.field7564] << 15) - this.field7567) / (this.field7566 - this.field7565);
            }
        }
        this.field7567 += this.field7563;
        this.field7565++;
        return this.field7567 - this.field7563 >> 15;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lrt;)V")
    public final void method3077(class194 arg0) {
        this.field7560 = arg0.method1177(255);
        this.field7559 = new int[this.field7560];
        this.field7561 = new int[this.field7560];
        for (int var2 = 0; var2 < this.field7560; var2++) {
            this.field7559[var2] = arg0.method1220(126);
            this.field7561[var2] = arg0.method1220(127);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "()V")
    public final void method3078() {
        this.field7566 = 0;
        this.field7564 = 0;
        this.field7563 = 0;
        this.field7567 = 0;
        this.field7565 = 0;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(Lrt;)V")
    public final void method3079(class194 arg0) {
        this.field7562 = arg0.method1177(255);
        this.field7557 = arg0.method1178(-230315992);
        this.field7558 = arg0.method1178(-230315992);
        this.method3077(arg0);
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V")
    public class520() {
        this.field7559[0] = 0;
        this.field7559[1] = 65535;
        this.field7561[0] = 0;
        this.field7561[1] = 65535;
    }
}
