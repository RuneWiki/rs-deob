import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class479 {

    @OriginalMember(owner = "client!qq", name = "e", descriptor = "I")
    private int field6567 = 2;

    @OriginalMember(owner = "client!qq", name = "f", descriptor = "[I")
    private int[] field6568 = new int[2];

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "[I")
    private int[] field6564 = new int[2];

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "I")
    public int field6563;

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "I")
    public int field6565;

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "I")
    public int field6566;

    @OriginalMember(owner = "client!qq", name = "g", descriptor = "I")
    private int field6569;

    @OriginalMember(owner = "client!qq", name = "h", descriptor = "I")
    private int field6570;

    @OriginalMember(owner = "client!qq", name = "i", descriptor = "I")
    private int field6571;

    @OriginalMember(owner = "client!qq", name = "j", descriptor = "I")
    private int field6572;

    @OriginalMember(owner = "client!qq", name = "k", descriptor = "I")
    private int field6573;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lee;)V")
    public final void method2696(class677 arg0) {
        this.field6567 = arg0.method3821((byte) -94);
        this.field6568 = new int[this.field6567];
        this.field6564 = new int[this.field6567];
        for (int var2 = 0; var2 < this.field6567; var2++) {
            this.field6568[var2] = arg0.method3807(-1);
            this.field6564[var2] = arg0.method3807(-1);
        }
    }

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(Lee;)V")
    public final void method2697(class677 arg0) {
        this.field6563 = arg0.method3821((byte) 79);
        this.field6565 = arg0.method3799(false);
        this.field6566 = arg0.method3799(false);
        this.method2696(arg0);
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "()V")
    public final void method2698() {
        this.field6573 = 0;
        this.field6571 = 0;
        this.field6569 = 0;
        this.field6572 = 0;
        this.field6570 = 0;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)I")
    public final int method2699(int arg0) {
        if (this.field6570 >= this.field6573) {
            this.field6572 = this.field6564[this.field6571++] << 15;
            if (this.field6571 >= this.field6567) {
                this.field6571 = this.field6567 - 1;
            }
            this.field6573 = (int) ((double) this.field6568[this.field6571] / 65536.0D * (double) arg0);
            if (this.field6573 > this.field6570) {
                this.field6569 = ((this.field6564[this.field6571] << 15) - this.field6572) / (this.field6573 - this.field6570);
            }
        }
        this.field6572 += this.field6569;
        this.field6570++;
        return this.field6572 - this.field6569 >> 15;
    }

    @OriginalMember(owner = "client!qq", name = "<init>", descriptor = "()V")
    public class479() {
        this.field6568[0] = 0;
        this.field6568[1] = 65535;
        this.field6564[0] = 0;
        this.field6564[1] = 65535;
    }
}
