import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class41 {

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
    private int field879 = 2;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "[I")
    private int[] field877 = new int[2];

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "[I")
    private int[] field878 = new int[2];

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
    public int field876;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
    public int field880;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "I")
    public int field881;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "I")
    private int field882;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
    private int field883;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
    private int field884;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "I")
    private int field885;

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "I")
    private int field886;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)I")
    public final int method320(int arg0) {
        if (this.field882 >= this.field884) {
            this.field885 = this.field878[this.field883++] << 15;
            if (this.field883 >= this.field879) {
                this.field883 = this.field879 - 1;
            }
            this.field884 = (int) ((double) this.field877[this.field883] / 65536.0D * (double) arg0);
            if (this.field884 > this.field882) {
                this.field886 = ((this.field878[this.field883] << 15) - this.field885) / (this.field884 - this.field882);
            }
        }
        this.field885 += this.field886;
        this.field882++;
        return this.field885 - this.field886 >> 15;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "()V")
    public final void method321() {
        this.field884 = 0;
        this.field883 = 0;
        this.field886 = 0;
        this.field885 = 0;
        this.field882 = 0;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lud;)V")
    public final void method322(class119 arg0) {
        this.field879 = arg0.method879((byte) 45);
        this.field877 = new int[this.field879];
        this.field878 = new int[this.field879];
        for (int var2 = 0; var2 < this.field879; var2++) {
            this.field877[var2] = arg0.method903(2);
            this.field878[var2] = arg0.method903(2);
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(Lud;)V")
    public final void method323(class119 arg0) {
        this.field876 = arg0.method879((byte) 45);
        this.field880 = arg0.method882(123);
        this.field881 = arg0.method882(119);
        this.method322(arg0);
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "()V")
    public class41() {
        this.field877[0] = 0;
        this.field877[1] = 65535;
        this.field878[0] = 0;
        this.field878[1] = 65535;
    }
}
