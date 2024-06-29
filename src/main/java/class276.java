import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class276 {

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "I")
    private int field4405 = 2;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "[I")
    private int[] field4400 = new int[2];

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "[I")
    private int[] field4403 = new int[2];

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "I")
    public int field4401;

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "I")
    public int field4402;

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "I")
    public int field4404;

    @OriginalMember(owner = "client!nm", name = "g", descriptor = "I")
    private int field4406;

    @OriginalMember(owner = "client!nm", name = "h", descriptor = "I")
    private int field4407;

    @OriginalMember(owner = "client!nm", name = "i", descriptor = "I")
    private int field4408;

    @OriginalMember(owner = "client!nm", name = "j", descriptor = "I")
    private int field4409;

    @OriginalMember(owner = "client!nm", name = "k", descriptor = "I")
    private int field4410;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Ljg;)V", line = 4)
    public final void method1859(class186 arg0) {
        this.field4405 = arg0.method1322(false);
        this.field4400 = new int[this.field4405];
        this.field4403 = new int[this.field4405];
        for (int var2 = 0; var2 < this.field4405; var2++) {
            this.field4400[var2] = arg0.method1272((byte) -127);
            this.field4403[var2] = arg0.method1272((byte) -112);
        }
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(Ljg;)V", line = 19)
    public final void method1860(class186 arg0) {
        this.field4404 = arg0.method1322(false);
        this.field4402 = arg0.method1284(8388607);
        this.field4401 = arg0.method1284(8388607);
        this.method1859(arg0);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)I", line = 31)
    public final int method1861(int arg0) {
        if (this.field4407 >= this.field4406) {
            this.field4408 = this.field4403[this.field4409++] << 15;
            if (this.field4409 >= this.field4405) {
                this.field4409 = this.field4405 - 1;
            }
            this.field4406 = (int) ((double) this.field4400[this.field4409] / 65536.0D * (double) arg0);
            if (this.field4406 > this.field4407) {
                this.field4410 = ((this.field4403[this.field4409] << 15) - this.field4408) / (this.field4406 - this.field4407);
            }
        }
        this.field4408 += this.field4410;
        this.field4407++;
        return this.field4408 - this.field4410 >> 15;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "()V", line = 48)
    public final void method1862() {
        this.field4406 = 0;
        this.field4409 = 0;
        this.field4410 = 0;
        this.field4408 = 0;
        this.field4407 = 0;
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "()V", line = 56)
    public class276() {
        this.field4400[0] = 0;
        this.field4400[1] = 65535;
        this.field4403[0] = 0;
        this.field4403[1] = 65535;
    }
}
