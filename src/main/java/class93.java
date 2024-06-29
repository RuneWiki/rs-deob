import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class93 {

    @OriginalMember(owner = "client!se", name = "e", descriptor = "I")
    private int field1535 = 2;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "[I")
    private int[] field1531 = new int[2];

    @OriginalMember(owner = "client!se", name = "f", descriptor = "[I")
    private int[] field1536 = new int[2];

    @OriginalMember(owner = "client!se", name = "b", descriptor = "I")
    public int field1532;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "I")
    public int field1533;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "I")
    public int field1534;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "I")
    private int field1537;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "I")
    private int field1538;

    @OriginalMember(owner = "client!se", name = "i", descriptor = "I")
    private int field1539;

    @OriginalMember(owner = "client!se", name = "j", descriptor = "I")
    private int field1540;

    @OriginalMember(owner = "client!se", name = "k", descriptor = "I")
    private int field1541;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)I", line = 3)
    public final int method751(int arg0) {
        if (this.field1537 >= this.field1538) {
            this.field1539 = this.field1536[this.field1540++] << 15;
            if (this.field1540 >= this.field1535) {
                this.field1540 = this.field1535 - 1;
            }
            this.field1538 = (int) ((double) this.field1531[this.field1540] / 65536.0D * (double) arg0);
            if (this.field1538 > this.field1537) {
                this.field1541 = ((this.field1536[this.field1540] << 15) - this.field1539) / (this.field1538 - this.field1537);
            }
        }
        this.field1539 += this.field1541;
        this.field1537++;
        return this.field1539 - this.field1541 >> 15;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lmi;)V", line = 24)
    public final void method752(class92 arg0) {
        this.field1535 = arg0.method702(-1);
        this.field1531 = new int[this.field1535];
        this.field1536 = new int[this.field1535];
        for (int var2 = 0; var2 < this.field1535; var2++) {
            this.field1531[var2] = arg0.method721(82);
            this.field1536[var2] = arg0.method721(50);
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(Lmi;)V", line = 40)
    public final void method753(class92 arg0) {
        this.field1534 = arg0.method702(-1);
        this.field1533 = arg0.method704(1509947792);
        this.field1532 = arg0.method704(1509947792);
        this.method752(arg0);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "()V", line = 46)
    public final void method754() {
        this.field1538 = 0;
        this.field1540 = 0;
        this.field1541 = 0;
        this.field1539 = 0;
        this.field1537 = 0;
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "()V", line = 56)
    public class93() {
        this.field1531[0] = 0;
        this.field1531[1] = 65535;
        this.field1536[0] = 0;
        this.field1536[1] = 65535;
    }
}
