import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class89 {

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "I")
    private int field1755 = 2;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "[I")
    private int[] field1750 = new int[2];

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "[I")
    private int[] field1754 = new int[2];

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
    public int field1751;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "I")
    public int field1752;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "I")
    public int field1753;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
    private int field1756;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "I")
    private int field1757;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
    private int field1758;

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "I")
    private int field1759;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
    private int field1760;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)I")
    public final int method634(int arg0) {
        if (this.field1758 >= this.field1757) {
            this.field1760 = this.field1754[this.field1759++] << 15;
            if (this.field1759 >= this.field1755) {
                this.field1759 = this.field1755 - 1;
            }
            this.field1757 = (int) ((double) this.field1750[this.field1759] / 65536.0D * (double) arg0);
            if (this.field1757 > this.field1758) {
                this.field1756 = ((this.field1754[this.field1759] << 15) - this.field1760) / (this.field1757 - this.field1758);
            }
        }
        this.field1760 += this.field1756;
        this.field1758++;
        return this.field1760 - this.field1756 >> 15;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "()V")
    public final void method635() {
        this.field1757 = 0;
        this.field1759 = 0;
        this.field1756 = 0;
        this.field1760 = 0;
        this.field1758 = 0;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ltf;)V")
    public final void method636(class106 arg0) {
        this.field1752 = arg0.method774((byte) 114);
        this.field1751 = arg0.method746((byte) -100);
        this.field1753 = arg0.method746((byte) -100);
        this.method637(arg0);
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(Ltf;)V")
    public final void method637(class106 arg0) {
        this.field1755 = arg0.method774((byte) 104);
        this.field1750 = new int[this.field1755];
        this.field1754 = new int[this.field1755];
        for (int var2 = 0; var2 < this.field1755; var2++) {
            this.field1750[var2] = arg0.method736(125);
            this.field1754[var2] = arg0.method736(125);
        }
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "()V")
    public class89() {
        this.field1750[0] = 0;
        this.field1750[1] = 65535;
        this.field1754[0] = 0;
        this.field1754[1] = 65535;
    }
}
