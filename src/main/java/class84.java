import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class84 {

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
    private int field1528 = 2;

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "[I")
    private int[] field1532 = new int[2];

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "[I")
    private int[] field1529 = new int[2];

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
    public int field1527;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "I")
    public int field1530;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "I")
    public int field1531;

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "I")
    private int field1533;

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "I")
    private int field1534;

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "I")
    private int field1535;

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "I")
    private int field1536;

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "I")
    private int field1537;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "()V")
    public final void method575() {
        this.field1533 = 0;
        this.field1534 = 0;
        this.field1537 = 0;
        this.field1535 = 0;
        this.field1536 = 0;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)I")
    public final int method576(int arg0) {
        if (this.field1536 >= this.field1533) {
            this.field1535 = this.field1529[this.field1534++] << 15;
            if (this.field1534 >= this.field1528) {
                this.field1534 = this.field1528 - 1;
            }
            this.field1533 = (int) ((double) this.field1532[this.field1534] / 65536.0D * (double) arg0);
            if (this.field1533 > this.field1536) {
                this.field1537 = ((this.field1529[this.field1534] << 15) - this.field1535) / (this.field1533 - this.field1536);
            }
        }
        this.field1535 += this.field1537;
        this.field1536++;
        return this.field1535 - this.field1537 >> 15;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lik;)V")
    public final void method577(class247 arg0) {
        this.field1528 = arg0.method1711((byte) -67);
        this.field1532 = new int[this.field1528];
        this.field1529 = new int[this.field1528];
        for (int var2 = 0; var2 < this.field1528; var2++) {
            this.field1532[var2] = arg0.method1694((byte) -100);
            this.field1529[var2] = arg0.method1694((byte) -100);
        }
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V")
    public class84() {
        this.field1532[0] = 0;
        this.field1532[1] = 65535;
        this.field1529[0] = 0;
        this.field1529[1] = 65535;
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(Lik;)V")
    public final void method578(class247 arg0) {
        this.field1531 = arg0.method1711((byte) -67);
        this.field1530 = arg0.method1712(6357);
        this.field1527 = arg0.method1712(6357);
        this.method577(arg0);
    }
}
