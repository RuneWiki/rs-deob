import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class46 {

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "I")
    private int field650 = 2;

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "[I")
    private int[] field646 = new int[2];

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "[I")
    private int[] field648 = new int[2];

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
    public int field645;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "I")
    public int field647;

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "I")
    public int field649;

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "I")
    private int field651;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "I")
    private int field652;

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "I")
    private int field653;

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "I")
    private int field654;

    @OriginalMember(owner = "client!bj", name = "k", descriptor = "I")
    private int field655;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lkl;)V")
    public final void method304(class114 arg0) {
        this.field650 = arg0.method760(false);
        this.field646 = new int[this.field650];
        this.field648 = new int[this.field650];
        for (int var2 = 0; var2 < this.field650; var2++) {
            this.field646[var2] = arg0.method756(-29901);
            this.field648[var2] = arg0.method756(-29901);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "()V")
    public final void method305() {
        this.field654 = 0;
        this.field653 = 0;
        this.field652 = 0;
        this.field655 = 0;
        this.field651 = 0;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)I")
    public final int method306(int arg0) {
        if (this.field651 >= this.field654) {
            this.field655 = this.field648[this.field653++] << 15;
            if (this.field653 >= this.field650) {
                this.field653 = this.field650 - 1;
            }
            this.field654 = (int) ((double) this.field646[this.field653] / 65536.0D * (double) arg0);
            if (this.field654 > this.field651) {
                this.field652 = ((this.field648[this.field653] << 15) - this.field655) / (this.field654 - this.field651);
            }
        }
        this.field655 += this.field652;
        this.field651++;
        return this.field655 - this.field652 >> 15;
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(Lkl;)V")
    public final void method307(class114 arg0) {
        this.field645 = arg0.method760(false);
        this.field649 = arg0.method759((byte) 101);
        this.field647 = arg0.method759((byte) 108);
        this.method304(arg0);
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "()V")
    public class46() {
        this.field646[0] = 0;
        this.field646[1] = 65535;
        this.field648[0] = 0;
        this.field648[1] = 65535;
    }
}
