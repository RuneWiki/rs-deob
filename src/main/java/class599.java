import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oea")
public class class599 {

    @OriginalMember(owner = "client!oea", name = "b", descriptor = "I")
    private int field8477 = 2;

    @OriginalMember(owner = "client!oea", name = "e", descriptor = "[I")
    private int[] field8480 = new int[2];

    @OriginalMember(owner = "client!oea", name = "f", descriptor = "[I")
    private int[] field8481 = new int[2];

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "I")
    public int field8476;

    @OriginalMember(owner = "client!oea", name = "c", descriptor = "I")
    public int field8478;

    @OriginalMember(owner = "client!oea", name = "d", descriptor = "I")
    public int field8479;

    @OriginalMember(owner = "client!oea", name = "g", descriptor = "I")
    private int field8482;

    @OriginalMember(owner = "client!oea", name = "h", descriptor = "I")
    private int field8483;

    @OriginalMember(owner = "client!oea", name = "i", descriptor = "I")
    private int field8484;

    @OriginalMember(owner = "client!oea", name = "j", descriptor = "I")
    private int field8485;

    @OriginalMember(owner = "client!oea", name = "k", descriptor = "I")
    private int field8486;

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(Lrg;)V", line = 5)
    public final void method3485(class645 arg0) {
        this.field8476 = arg0.method3745(-6314);
        this.field8479 = arg0.method3720(-19541);
        this.field8478 = arg0.method3720(-19541);
        this.method3487(arg0);
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(I)I", line = 11)
    public final int method3486(int arg0) {
        if (this.field8484 >= this.field8486) {
            this.field8483 = this.field8481[this.field8482++] << 15;
            if (this.field8482 >= this.field8477) {
                this.field8482 = this.field8477 - 1;
            }
            this.field8486 = (int) ((double) this.field8480[this.field8482] / 65536.0D * (double) arg0);
            if (this.field8486 > this.field8484) {
                this.field8485 = ((this.field8481[this.field8482] << 15) - this.field8483) / (this.field8486 - this.field8484);
            }
        }
        this.field8483 += this.field8485;
        this.field8484++;
        return this.field8483 - this.field8485 >> 15;
    }

    @OriginalMember(owner = "client!oea", name = "b", descriptor = "(Lrg;)V", line = 30)
    public final void method3487(class645 arg0) {
        this.field8477 = arg0.method3745(-6314);
        this.field8480 = new int[this.field8477];
        this.field8481 = new int[this.field8477];
        for (int var2 = 0; var2 < this.field8477; var2++) {
            this.field8480[var2] = arg0.method3712((byte) -110);
            this.field8481[var2] = arg0.method3712((byte) -16);
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "()V", line = 47)
    public final void method3488() {
        this.field8486 = 0;
        this.field8482 = 0;
        this.field8485 = 0;
        this.field8483 = 0;
        this.field8484 = 0;
    }

    @OriginalMember(owner = "client!oea", name = "<init>", descriptor = "()V", line = 55)
    public class599() {
        this.field8480[0] = 0;
        this.field8480[1] = 65535;
        this.field8481[0] = 0;
        this.field8481[1] = 65535;
    }
}
