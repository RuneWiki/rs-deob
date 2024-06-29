import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class24 {

    @OriginalMember(owner = "client!od", name = "b", descriptor = "I")
    private int field425 = 2;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "[I")
    private int[] field426 = new int[2];

    @OriginalMember(owner = "client!od", name = "e", descriptor = "[I")
    private int[] field428 = new int[2];

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    public int field424;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    public int field427;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "I")
    public int field429;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "I")
    private int field430;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "I")
    private int field431;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "I")
    private int field432;

    @OriginalMember(owner = "client!od", name = "j", descriptor = "I")
    private int field433;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "I")
    private int field434;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lsd;)V", line = 7)
    public final void method176(class26 arg0) {
        this.field425 = arg0.method226(255);
        this.field426 = new int[this.field425];
        this.field428 = new int[this.field425];
        for (int var2 = 0; var2 < this.field425; var2++) {
            this.field426[var2] = arg0.method197(-1);
            this.field428[var2] = arg0.method197(-1);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)I", line = 23)
    public final int method177(int arg0) {
        if (this.field434 >= this.field431) {
            this.field432 = this.field428[this.field430++] << 15;
            if (this.field430 >= this.field425) {
                this.field430 = this.field425 - 1;
            }
            this.field431 = (int) ((double) this.field426[this.field430] / 65536.0D * (double) arg0);
            if (this.field431 > this.field434) {
                this.field433 = ((this.field428[this.field430] << 15) - this.field432) / (this.field431 - this.field434);
            }
        }
        this.field432 += this.field433;
        this.field434++;
        return this.field432 - this.field433 >> 15;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(Lsd;)V", line = 42)
    public final void method178(class26 arg0) {
        this.field429 = arg0.method226(255);
        this.field427 = arg0.method203(-22066);
        this.field424 = arg0.method203(-22066);
        this.method176(arg0);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "()V", line = 48)
    public final void method179() {
        this.field431 = 0;
        this.field430 = 0;
        this.field433 = 0;
        this.field432 = 0;
        this.field434 = 0;
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V", line = 56)
    public class24() {
        this.field426[0] = 0;
        this.field426[1] = 65535;
        this.field428[0] = 0;
        this.field428[1] = 65535;
    }
}
