import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class188 {

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "I")
    private int field2645 = 2;

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "[I")
    private int[] field2641 = new int[2];

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "[I")
    private int[] field2640 = new int[2];

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "I")
    public int field2642;

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "I")
    public int field2643;

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "I")
    public int field2644;

    @OriginalMember(owner = "client!ao", name = "g", descriptor = "I")
    private int field2646;

    @OriginalMember(owner = "client!ao", name = "h", descriptor = "I")
    private int field2647;

    @OriginalMember(owner = "client!ao", name = "i", descriptor = "I")
    private int field2648;

    @OriginalMember(owner = "client!ao", name = "j", descriptor = "I")
    private int field2649;

    @OriginalMember(owner = "client!ao", name = "k", descriptor = "I")
    private int field2650;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)I", line = 4)
    public final int method1209(int arg0) {
        if (this.field2648 >= this.field2649) {
            this.field2646 = this.field2640[this.field2647++] << 15;
            if (this.field2647 >= this.field2645) {
                this.field2647 = this.field2645 - 1;
            }
            this.field2649 = (int) ((double) this.field2641[this.field2647] / 65536.0D * (double) arg0);
            if (this.field2649 > this.field2648) {
                this.field2650 = ((this.field2640[this.field2647] << 15) - this.field2646) / (this.field2649 - this.field2648);
            }
        }
        this.field2646 += this.field2650;
        this.field2648++;
        return this.field2646 - this.field2650 >> 15;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lmd;)V", line = 22)
    public final void method1210(class379 arg0) {
        this.field2642 = arg0.method2238(255);
        this.field2644 = arg0.method2232((byte) 124);
        this.field2643 = arg0.method2232((byte) 126);
        this.method1212(arg0);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "()V", line = 28)
    public final void method1211() {
        this.field2649 = 0;
        this.field2647 = 0;
        this.field2650 = 0;
        this.field2646 = 0;
        this.field2648 = 0;
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(Lmd;)V", line = 41)
    public final void method1212(class379 arg0) {
        this.field2645 = arg0.method2238(255);
        this.field2641 = new int[this.field2645];
        this.field2640 = new int[this.field2645];
        for (int var2 = 0; var2 < this.field2645; var2++) {
            this.field2641[var2] = arg0.method2212((byte) 83);
            this.field2640[var2] = arg0.method2212((byte) 83);
        }
    }

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "()V", line = 55)
    public class188() {
        this.field2641[0] = 0;
        this.field2641[1] = 65535;
        this.field2640[0] = 0;
        this.field2640[1] = 65535;
    }
}
