import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class202 {

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "I")
    private int field3577 = 2;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "[I")
    private int[] field3574 = new int[2];

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "[I")
    private int[] field3576 = new int[2];

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
    public int field3572;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "I")
    public int field3573;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "I")
    public int field3575;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "I")
    private int field3578;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
    private int field3579;

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "I")
    private int field3580;

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "I")
    private int field3581;

    @OriginalMember(owner = "client!dk", name = "k", descriptor = "I")
    private int field3582;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)I", line = 6)
    public final int method1406(int arg0) {
        if (this.field3579 >= this.field3581) {
            this.field3582 = this.field3576[this.field3578++] << 15;
            if (this.field3578 >= this.field3577) {
                this.field3578 = this.field3577 - 1;
            }
            this.field3581 = (int) ((double) this.field3574[this.field3578] / 65536.0D * (double) arg0);
            if (this.field3581 > this.field3579) {
                this.field3580 = ((this.field3576[this.field3578] << 15) - this.field3582) / (this.field3581 - this.field3579);
            }
        }
        this.field3582 += this.field3580;
        this.field3579++;
        return this.field3582 - this.field3580 >> 15;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "()V", line = 25)
    public final void method1407() {
        this.field3581 = 0;
        this.field3578 = 0;
        this.field3580 = 0;
        this.field3582 = 0;
        this.field3579 = 0;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lbg;)V", line = 32)
    public final void method1408(class194 arg0) {
        this.field3577 = arg0.method1325(7627);
        this.field3574 = new int[this.field3577];
        this.field3576 = new int[this.field3577];
        for (int var2 = 0; var2 < this.field3577; var2++) {
            this.field3574[var2] = arg0.method1308(-46);
            this.field3576[var2] = arg0.method1308(-57);
        }
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "()V", line = 49)
    public class202() {
        this.field3574[0] = 0;
        this.field3574[1] = 65535;
        this.field3576[0] = 0;
        this.field3576[1] = 65535;
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(Lbg;)V", line = 62)
    public final void method1409(class194 arg0) {
        this.field3575 = arg0.method1325(7627);
        this.field3572 = arg0.method1350(false);
        this.field3573 = arg0.method1350(false);
        this.method1408(arg0);
    }
}
