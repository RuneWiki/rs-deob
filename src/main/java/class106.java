import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class106 {

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
    private int field2638 = 2;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "[I")
    private int[] field2637 = new int[2];

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "[I")
    private int[] field2640 = new int[2];

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
    public int field2636;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    public int field2639;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
    public int field2641;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
    private int field2642;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
    private int field2643;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "I")
    private int field2644;

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "I")
    private int field2645;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "I")
    private int field2646;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Luc;)V", line = 4)
    public final void method778(class122 arg0) {
        this.field2636 = arg0.method943(-1025);
        this.field2639 = arg0.method952(false);
        this.field2641 = arg0.method952(false);
        this.method780(arg0);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "()V", line = 10)
    public final void method779() {
        this.field2645 = 0;
        this.field2644 = 0;
        this.field2642 = 0;
        this.field2646 = 0;
        this.field2643 = 0;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(Luc;)V", line = 24)
    public final void method780(class122 arg0) {
        this.field2638 = arg0.method943(-1025);
        this.field2637 = new int[this.field2638];
        this.field2640 = new int[this.field2638];
        for (int var2 = 0; var2 < this.field2638; var2++) {
            this.field2637[var2] = arg0.method938((byte) 93);
            this.field2640[var2] = arg0.method938((byte) -93);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)I", line = 39)
    public final int method781(int arg0) {
        if (this.field2643 >= this.field2645) {
            this.field2646 = this.field2640[this.field2644++] << 15;
            if (this.field2644 >= this.field2638) {
                this.field2644 = this.field2638 - 1;
            }
            this.field2645 = (int) ((double) this.field2637[this.field2644] / 65536.0D * (double) arg0);
            if (this.field2645 > this.field2643) {
                this.field2642 = ((this.field2640[this.field2644] << 15) - this.field2646) / (this.field2645 - this.field2643);
            }
        }
        this.field2646 += this.field2642;
        this.field2643++;
        return this.field2646 - this.field2642 >> 15;
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V", line = 56)
    public class106() {
        this.field2637[0] = 0;
        this.field2637[1] = 65535;
        this.field2640[0] = 0;
        this.field2640[1] = 65535;
    }
}
