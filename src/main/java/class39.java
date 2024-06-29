import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class39 {

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "I")
    private int field531 = 2;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "[I")
    private int[] field528 = new int[2];

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "[I")
    private int[] field530 = new int[2];

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
    public int field526;

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
    public int field527;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
    public int field529;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "I")
    private int field532;

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "I")
    private int field533;

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "I")
    private int field534;

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "I")
    private int field535;

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "I")
    private int field536;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)I")
    public final int method254(int arg0) {
        if (this.field533 >= this.field536) {
            this.field535 = this.field530[this.field532++] << 15;
            if (this.field532 >= this.field531) {
                this.field532 = this.field531 - 1;
            }
            this.field536 = (int) ((double) this.field528[this.field532] / 65536.0D * (double) arg0);
            if (this.field536 > this.field533) {
                this.field534 = ((this.field530[this.field532] << 15) - this.field535) / (this.field536 - this.field533);
            }
        }
        this.field535 += this.field534;
        this.field533++;
        return this.field535 - this.field534 >> 15;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Llf;)V")
    public final void method255(class130 arg0) {
        this.field526 = arg0.method837(true);
        this.field529 = arg0.method815(true);
        this.field527 = arg0.method815(true);
        this.method256(arg0);
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(Llf;)V")
    public final void method256(class130 arg0) {
        this.field531 = arg0.method837(true);
        this.field528 = new int[this.field531];
        this.field530 = new int[this.field531];
        for (int var2 = 0; var2 < this.field531; var2++) {
            this.field528[var2] = arg0.method798(false);
            this.field530[var2] = arg0.method798(false);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "()V")
    public final void method257() {
        this.field536 = 0;
        this.field532 = 0;
        this.field534 = 0;
        this.field535 = 0;
        this.field533 = 0;
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "()V")
    public class39() {
        this.field528[0] = 0;
        this.field528[1] = 65535;
        this.field530[0] = 0;
        this.field530[1] = 65535;
    }
}
