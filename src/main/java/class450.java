import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class450 {

    @OriginalMember(owner = "client!go", name = "a", descriptor = "I")
    private int field6755 = 2;

    @OriginalMember(owner = "client!go", name = "f", descriptor = "[I")
    private int[] field6760 = new int[2];

    @OriginalMember(owner = "client!go", name = "e", descriptor = "[I")
    private int[] field6759 = new int[2];

    @OriginalMember(owner = "client!go", name = "b", descriptor = "I")
    public int field6756;

    @OriginalMember(owner = "client!go", name = "c", descriptor = "I")
    public int field6757;

    @OriginalMember(owner = "client!go", name = "d", descriptor = "I")
    public int field6758;

    @OriginalMember(owner = "client!go", name = "g", descriptor = "I")
    private int field6761;

    @OriginalMember(owner = "client!go", name = "h", descriptor = "I")
    private int field6762;

    @OriginalMember(owner = "client!go", name = "i", descriptor = "I")
    private int field6763;

    @OriginalMember(owner = "client!go", name = "j", descriptor = "I")
    private int field6764;

    @OriginalMember(owner = "client!go", name = "k", descriptor = "I")
    private int field6765;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Lnj;)V")
    public final void method2742(class164 arg0) {
        this.field6756 = arg0.method1087(false);
        this.field6757 = arg0.method1099(-109);
        this.field6758 = arg0.method1099(-110);
        this.method2743(arg0);
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(Lnj;)V")
    public final void method2743(class164 arg0) {
        this.field6755 = arg0.method1087(false);
        this.field6760 = new int[this.field6755];
        this.field6759 = new int[this.field6755];
        for (int var2 = 0; var2 < this.field6755; var2++) {
            this.field6760[var2] = arg0.method1074(-635989152);
            this.field6759[var2] = arg0.method1074(-635989152);
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "()V")
    public final void method2744() {
        this.field6765 = 0;
        this.field6762 = 0;
        this.field6764 = 0;
        this.field6761 = 0;
        this.field6763 = 0;
    }

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "()V")
    public class450() {
        this.field6760[0] = 0;
        this.field6760[1] = 65535;
        this.field6759[0] = 0;
        this.field6759[1] = 65535;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(I)I")
    public final int method2745(int arg0) {
        if (this.field6763 >= this.field6765) {
            this.field6761 = this.field6759[this.field6762++] << 15;
            if (this.field6762 >= this.field6755) {
                this.field6762 = this.field6755 - 1;
            }
            this.field6765 = (int) ((double) this.field6760[this.field6762] / 65536.0D * (double) arg0);
            if (this.field6765 > this.field6763) {
                this.field6764 = ((this.field6759[this.field6762] << 15) - this.field6761) / (this.field6765 - this.field6763);
            }
        }
        this.field6761 += this.field6764;
        this.field6763++;
        return this.field6761 - this.field6764 >> 15;
    }
}
