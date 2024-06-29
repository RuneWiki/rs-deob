import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class150 {

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "I")
    private int field2537 = 2;

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "[I")
    private int[] field2541 = new int[2];

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "[I")
    private int[] field2540 = new int[2];

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "I")
    public int field2538;

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
    public int field2539;

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "I")
    public int field2542;

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "I")
    private int field2543;

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "I")
    private int field2544;

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "I")
    private int field2545;

    @OriginalMember(owner = "client!kl", name = "j", descriptor = "I")
    private int field2546;

    @OriginalMember(owner = "client!kl", name = "k", descriptor = "I")
    private int field2547;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Loe;)V", line = 4)
    public final void method1074(class146 arg0) {
        this.field2538 = arg0.method1005((byte) 122);
        this.field2542 = arg0.method1004(3);
        this.field2539 = arg0.method1004(3);
        this.method1075(arg0);
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(Loe;)V", line = 12)
    public final void method1075(class146 arg0) {
        this.field2537 = arg0.method1005((byte) 122);
        this.field2541 = new int[this.field2537];
        this.field2540 = new int[this.field2537];
        for (int var2 = 0; var2 < this.field2537; var2++) {
            this.field2541[var2] = arg0.method989(76);
            this.field2540[var2] = arg0.method989(73);
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "()V", line = 29)
    public final void method1076() {
        this.field2546 = 0;
        this.field2545 = 0;
        this.field2547 = 0;
        this.field2544 = 0;
        this.field2543 = 0;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)I", line = 38)
    public final int method1077(int arg0) {
        if (this.field2543 >= this.field2546) {
            this.field2544 = this.field2540[this.field2545++] << 15;
            if (this.field2545 >= this.field2537) {
                this.field2545 = this.field2537 - 1;
            }
            this.field2546 = (int) ((double) this.field2541[this.field2545] / 65536.0D * (double) arg0);
            if (this.field2546 > this.field2543) {
                this.field2547 = ((this.field2540[this.field2545] << 15) - this.field2544) / (this.field2546 - this.field2543);
            }
        }
        this.field2544 += this.field2547;
        this.field2543++;
        return this.field2544 - this.field2547 >> 15;
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "()V", line = 56)
    public class150() {
        this.field2541[0] = 0;
        this.field2541[1] = 65535;
        this.field2540[0] = 0;
        this.field2540[1] = 65535;
    }
}
