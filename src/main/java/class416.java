import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class416 {

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
    private int field5535 = 2;

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "[I")
    private int[] field5540 = new int[2];

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "[I")
    private int[] field5537 = new int[2];

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "I")
    public int field5536;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "I")
    public int field5538;

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "I")
    public int field5539;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "I")
    private int field5541;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
    private int field5542;

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "I")
    private int field5543;

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "I")
    private int field5544;

    @OriginalMember(owner = "client!dk", name = "k", descriptor = "I")
    private int field5545;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)I")
    public final int method2448(int arg0) {
        if (this.field5544 >= this.field5543) {
            this.field5541 = this.field5537[this.field5545++] << 15;
            if (this.field5545 >= this.field5535) {
                this.field5545 = this.field5535 - 1;
            }
            this.field5543 = (int) ((double) this.field5540[this.field5545] / 65536.0D * (double) arg0);
            if (this.field5543 > this.field5544) {
                this.field5542 = ((this.field5537[this.field5545] << 15) - this.field5541) / (this.field5543 - this.field5544);
            }
        }
        this.field5541 += this.field5542;
        this.field5544++;
        return this.field5541 - this.field5542 >> 15;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lbt;)V")
    public final void method2449(class88 arg0) {
        this.field5535 = arg0.method617(2);
        this.field5540 = new int[this.field5535];
        this.field5537 = new int[this.field5535];
        for (int var2 = 0; var2 < this.field5535; var2++) {
            this.field5540[var2] = arg0.method568((byte) 110);
            this.field5537[var2] = arg0.method568((byte) 110);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "()V")
    public final void method2450() {
        this.field5543 = 0;
        this.field5545 = 0;
        this.field5542 = 0;
        this.field5541 = 0;
        this.field5544 = 0;
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(Lbt;)V")
    public final void method2451(class88 arg0) {
        this.field5536 = arg0.method617(2);
        this.field5538 = arg0.method578(104);
        this.field5539 = arg0.method578(107);
        this.method2449(arg0);
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "()V")
    public class416() {
        this.field5540[0] = 0;
        this.field5540[1] = 65535;
        this.field5537[0] = 0;
        this.field5537[1] = 65535;
    }
}
