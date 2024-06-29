import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class231 {

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    private int field3684 = 2;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "[I")
    private int[] field3685 = new int[2];

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "[I")
    private int[] field3682 = new int[2];

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public int field3683;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
    public int field3686;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    public int field3687;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
    private int field3688;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
    private int field3689;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
    private int field3690;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "I")
    private int field3691;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
    private int field3692;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "()V", line = 4)
    public final void method1595() {
        this.field3692 = 0;
        this.field3690 = 0;
        this.field3689 = 0;
        this.field3688 = 0;
        this.field3691 = 0;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lfh;)V", line = 15)
    public final void method1596(class313 arg0) {
        this.field3684 = arg0.method2224(-120);
        this.field3685 = new int[this.field3684];
        this.field3682 = new int[this.field3684];
        for (int var2 = 0; var2 < this.field3684; var2++) {
            this.field3685[var2] = arg0.method2250(-1613178296);
            this.field3682[var2] = arg0.method2250(-1613178296);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)I", line = 31)
    public final int method1597(int arg0) {
        if (this.field3691 >= this.field3692) {
            this.field3688 = this.field3682[this.field3690++] << 15;
            if (this.field3690 >= this.field3684) {
                this.field3690 = this.field3684 - 1;
            }
            this.field3692 = (int) ((double) this.field3685[this.field3690] / 65536.0D * (double) arg0);
            if (this.field3692 > this.field3691) {
                this.field3689 = ((this.field3682[this.field3690] << 15) - this.field3688) / (this.field3692 - this.field3691);
            }
        }
        this.field3688 += this.field3689;
        this.field3691++;
        return this.field3688 - this.field3689 >> 15;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(Lfh;)V", line = 50)
    public final void method1598(class313 arg0) {
        this.field3683 = arg0.method2224(-122);
        this.field3686 = arg0.method2231((byte) -128);
        this.field3687 = arg0.method2231((byte) -123);
        this.method1596(arg0);
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "()V", line = 56)
    public class231() {
        this.field3685[0] = 0;
        this.field3685[1] = 65535;
        this.field3682[0] = 0;
        this.field3682[1] = 65535;
    }
}
