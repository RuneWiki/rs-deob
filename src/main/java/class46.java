import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public class class46 {

    @OriginalMember(owner = "client!pv", name = "c", descriptor = "I")
    private int field646 = 2;

    @OriginalMember(owner = "client!pv", name = "f", descriptor = "[I")
    private int[] field649 = new int[2];

    @OriginalMember(owner = "client!pv", name = "e", descriptor = "[I")
    private int[] field648 = new int[2];

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "I")
    public int field644;

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "I")
    public int field645;

    @OriginalMember(owner = "client!pv", name = "d", descriptor = "I")
    public int field647;

    @OriginalMember(owner = "client!pv", name = "g", descriptor = "I")
    private int field650;

    @OriginalMember(owner = "client!pv", name = "h", descriptor = "I")
    private int field651;

    @OriginalMember(owner = "client!pv", name = "i", descriptor = "I")
    private int field652;

    @OriginalMember(owner = "client!pv", name = "j", descriptor = "I")
    private int field653;

    @OriginalMember(owner = "client!pv", name = "k", descriptor = "I")
    private int field654;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(I)I", line = 6)
    public final int method304(int arg0) {
        if (this.field654 >= this.field652) {
            this.field650 = this.field648[this.field651++] << 15;
            if (this.field651 >= this.field646) {
                this.field651 = this.field646 - 1;
            }
            this.field652 = (int) ((double) this.field649[this.field651] / 65536.0D * (double) arg0);
            if (this.field652 > this.field654) {
                this.field653 = ((this.field648[this.field651] << 15) - this.field650) / (this.field652 - this.field654);
            }
        }
        this.field650 += this.field653;
        this.field654++;
        return this.field650 - this.field653 >> 15;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "()V", line = 24)
    public final void method305() {
        this.field652 = 0;
        this.field651 = 0;
        this.field653 = 0;
        this.field650 = 0;
        this.field654 = 0;
    }

    @OriginalMember(owner = "client!pv", name = "<init>", descriptor = "()V", line = 33)
    public class46() {
        this.field649[0] = 0;
        this.field649[1] = 65535;
        this.field648[0] = 0;
        this.field648[1] = 65535;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(Lsv;)V", line = 43)
    public final void method306(class319 arg0) {
        this.field646 = arg0.method1869(-119);
        this.field649 = new int[this.field646];
        this.field648 = new int[this.field646];
        for (int var2 = 0; var2 < this.field646; var2++) {
            this.field649[var2] = arg0.method1844(-119);
            this.field648[var2] = arg0.method1844(-112);
        }
    }

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "(Lsv;)V", line = 59)
    public final void method307(class319 arg0) {
        this.field644 = arg0.method1869(-103);
        this.field647 = arg0.method1863(-1);
        this.field645 = arg0.method1863(-1);
        this.method306(arg0);
    }
}
