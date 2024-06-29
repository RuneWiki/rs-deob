import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class250 {

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
    private int field3651 = 2;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "[I")
    private int[] field3656 = new int[2];

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "[I")
    private int[] field3654 = new int[2];

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    public int field3652;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
    public int field3653;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
    public int field3655;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    private int field3657;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
    private int field3658;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
    private int field3659;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "I")
    private int field3660;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "I")
    private int field3661;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lco;)V", line = 5)
    public final void method1582(class268 arg0) {
        this.field3651 = arg0.method1738(255);
        this.field3656 = new int[this.field3651];
        this.field3654 = new int[this.field3651];
        for (int var2 = 0; var2 < this.field3651; var2++) {
            this.field3656[var2] = arg0.method1745(32132);
            this.field3654[var2] = arg0.method1745(32132);
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(Lco;)V", line = 20)
    public final void method1583(class268 arg0) {
        this.field3652 = arg0.method1738(255);
        this.field3655 = arg0.method1748(-59);
        this.field3653 = arg0.method1748(-102);
        this.method1582(arg0);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "()V", line = 28)
    public final void method1584() {
        this.field3661 = 0;
        this.field3658 = 0;
        this.field3657 = 0;
        this.field3660 = 0;
        this.field3659 = 0;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)I", line = 38)
    public final int method1585(int arg0) {
        if (this.field3659 >= this.field3661) {
            this.field3660 = this.field3654[this.field3658++] << 15;
            if (this.field3658 >= this.field3651) {
                this.field3658 = this.field3651 - 1;
            }
            this.field3661 = (int) ((double) this.field3656[this.field3658] / 65536.0D * (double) arg0);
            if (this.field3661 > this.field3659) {
                this.field3657 = ((this.field3654[this.field3658] << 15) - this.field3660) / (this.field3661 - this.field3659);
            }
        }
        this.field3660 += this.field3657;
        this.field3659++;
        return this.field3660 - this.field3657 >> 15;
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "()V", line = 56)
    public class250() {
        this.field3656[0] = 0;
        this.field3656[1] = 65535;
        this.field3654[0] = 0;
        this.field3654[1] = 65535;
    }
}
