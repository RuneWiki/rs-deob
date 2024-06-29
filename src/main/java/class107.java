import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class107 {

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
    private int field1533 = 2;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "[I")
    private int[] field1534 = new int[2];

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "[I")
    private int[] field1532 = new int[2];

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
    public int field1530;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
    public int field1531;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
    public int field1535;

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "I")
    private int field1536;

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "I")
    private int field1537;

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "I")
    private int field1538;

    @OriginalMember(owner = "client!eh", name = "j", descriptor = "I")
    private int field1539;

    @OriginalMember(owner = "client!eh", name = "k", descriptor = "I")
    private int field1540;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lp;)V")
    public final void method643(class56 arg0) {
        this.field1535 = arg0.method367(1);
        this.field1530 = arg0.method311(0);
        this.field1531 = arg0.method311(0);
        this.method644(arg0);
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(Lp;)V")
    public final void method644(class56 arg0) {
        this.field1533 = arg0.method367(1);
        this.field1534 = new int[this.field1533];
        this.field1532 = new int[this.field1533];
        for (int var2 = 0; var2 < this.field1533; var2++) {
            this.field1534[var2] = arg0.method318(true);
            this.field1532[var2] = arg0.method318(true);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "()V")
    public final void method645() {
        this.field1538 = 0;
        this.field1540 = 0;
        this.field1539 = 0;
        this.field1536 = 0;
        this.field1537 = 0;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)I")
    public final int method646(int arg0) {
        if (this.field1537 >= this.field1538) {
            this.field1536 = this.field1532[this.field1540++] << 15;
            if (this.field1540 >= this.field1533) {
                this.field1540 = this.field1533 - 1;
            }
            this.field1538 = (int) ((double) this.field1534[this.field1540] / 65536.0D * (double) arg0);
            if (this.field1538 > this.field1537) {
                this.field1539 = ((this.field1532[this.field1540] << 15) - this.field1536) / (this.field1538 - this.field1537);
            }
        }
        this.field1536 += this.field1539;
        this.field1537++;
        return this.field1536 - this.field1539 >> 15;
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "()V")
    public class107() {
        this.field1534[0] = 0;
        this.field1534[1] = 65535;
        this.field1532[0] = 0;
        this.field1532[1] = 65535;
    }
}
