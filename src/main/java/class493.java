import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class493 {

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
    private int field6637 = 2;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "[I")
    private int[] field6639 = new int[2];

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "[I")
    private int[] field6635 = new int[2];

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
    public int field6634;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
    public int field6636;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
    public int field6638;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "I")
    private int field6640;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
    private int field6641;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
    private int field6642;

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
    private int field6643;

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "I")
    private int field6644;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Leh;)V", line = 9)
    public final void method2748(class335 arg0) {
        this.field6638 = arg0.method2034(255);
        this.field6636 = arg0.method2045(-98);
        this.field6634 = arg0.method2045(-98);
        this.method2750(arg0);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "()V", line = 16)
    public final void method2749() {
        this.field6641 = 0;
        this.field6643 = 0;
        this.field6642 = 0;
        this.field6640 = 0;
        this.field6644 = 0;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(Leh;)V", line = 23)
    public final void method2750(class335 arg0) {
        this.field6637 = arg0.method2034(255);
        this.field6639 = new int[this.field6637];
        this.field6635 = new int[this.field6637];
        for (int var2 = 0; var2 < this.field6637; var2++) {
            this.field6639[var2] = arg0.method2001((byte) -83);
            this.field6635[var2] = arg0.method2001((byte) -83);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)I", line = 39)
    public final int method2751(int arg0) {
        if (this.field6644 >= this.field6641) {
            this.field6640 = this.field6635[this.field6643++] << 15;
            if (this.field6643 >= this.field6637) {
                this.field6643 = this.field6637 - 1;
            }
            this.field6641 = (int) ((double) this.field6639[this.field6643] / 65536.0D * (double) arg0);
            if (this.field6641 > this.field6644) {
                this.field6642 = ((this.field6635[this.field6643] << 15) - this.field6640) / (this.field6641 - this.field6644);
            }
        }
        this.field6640 += this.field6642;
        this.field6644++;
        return this.field6640 - this.field6642 >> 15;
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "()V", line = 56)
    public class493() {
        this.field6639[0] = 0;
        this.field6639[1] = 65535;
        this.field6635[0] = 0;
        this.field6635[1] = 65535;
    }
}
