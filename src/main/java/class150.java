import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class150 {

    @OriginalMember(owner = "client!w", name = "a", descriptor = "I")
    private int field2608 = 2;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "[I")
    private int[] field2609 = new int[2];

    @OriginalMember(owner = "client!w", name = "f", descriptor = "[I")
    private int[] field2613 = new int[2];

    @OriginalMember(owner = "client!w", name = "c", descriptor = "I")
    public int field2610;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "I")
    public int field2611;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "I")
    public int field2612;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "I")
    private int field2614;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "I")
    private int field2615;

    @OriginalMember(owner = "client!w", name = "i", descriptor = "I")
    private int field2616;

    @OriginalMember(owner = "client!w", name = "j", descriptor = "I")
    private int field2617;

    @OriginalMember(owner = "client!w", name = "k", descriptor = "I")
    private int field2618;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "()V")
    public final void method1049() {
        this.field2614 = 0;
        this.field2616 = 0;
        this.field2617 = 0;
        this.field2618 = 0;
        this.field2615 = 0;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)I")
    public final int method1050(int arg0) {
        if (this.field2615 >= this.field2614) {
            this.field2618 = this.field2613[this.field2616++] << 15;
            if (this.field2616 >= this.field2608) {
                this.field2616 = this.field2608 - 1;
            }
            this.field2614 = (int) ((double) this.field2609[this.field2616] / 65536.0D * (double) arg0);
            if (this.field2614 > this.field2615) {
                this.field2617 = ((this.field2613[this.field2616] << 15) - this.field2618) / (this.field2614 - this.field2615);
            }
        }
        this.field2618 += this.field2617;
        this.field2615++;
        return this.field2618 - this.field2617 >> 15;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lwd;)V")
    public final void method1051(class217 arg0) {
        this.field2608 = arg0.method1487(255);
        this.field2609 = new int[this.field2608];
        this.field2613 = new int[this.field2608];
        for (int var2 = 0; var2 < this.field2608; var2++) {
            this.field2609[var2] = arg0.method1441(74);
            this.field2613[var2] = arg0.method1441(80);
        }
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "()V")
    public class150() {
        this.field2609[0] = 0;
        this.field2609[1] = 65535;
        this.field2613[0] = 0;
        this.field2613[1] = 65535;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(Lwd;)V")
    public final void method1052(class217 arg0) {
        this.field2610 = arg0.method1487(255);
        this.field2611 = arg0.method1466((byte) -15);
        this.field2612 = arg0.method1466((byte) -15);
        this.method1051(arg0);
    }
}
