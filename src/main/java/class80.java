import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class80 {

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
    private int field1533 = 2;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "[I")
    private int[] field1534 = new int[2];

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "[I")
    private int[] field1536 = new int[2];

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    public int field1535;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
    public int field1537;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "I")
    public int field1538;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "I")
    private int field1539;

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "I")
    private int field1540;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
    private int field1541;

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "I")
    private int field1542;

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "I")
    private int field1543;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "()V")
    public final void method512() {
        this.field1540 = 0;
        this.field1543 = 0;
        this.field1541 = 0;
        this.field1539 = 0;
        this.field1542 = 0;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lwa;)V")
    public final void method513(class229 arg0) {
        this.field1535 = arg0.method1475(255);
        this.field1538 = arg0.method1437(425528536);
        this.field1537 = arg0.method1437(425528536);
        this.method514(arg0);
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(Lwa;)V")
    public final void method514(class229 arg0) {
        this.field1533 = arg0.method1475(255);
        this.field1534 = new int[this.field1533];
        this.field1536 = new int[this.field1533];
        for (int var2 = 0; var2 < this.field1533; var2++) {
            this.field1534[var2] = arg0.method1490((byte) 73);
            this.field1536[var2] = arg0.method1490((byte) 73);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)I")
    public final int method515(int arg0) {
        if (this.field1542 >= this.field1540) {
            this.field1539 = this.field1536[this.field1543++] << 15;
            if (this.field1543 >= this.field1533) {
                this.field1543 = this.field1533 - 1;
            }
            this.field1540 = (int) ((double) this.field1534[this.field1543] / 65536.0D * (double) arg0);
            if (this.field1540 > this.field1542) {
                this.field1541 = ((this.field1536[this.field1543] << 15) - this.field1539) / (this.field1540 - this.field1542);
            }
        }
        this.field1539 += this.field1541;
        this.field1542++;
        return this.field1539 - this.field1541 >> 15;
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V")
    public class80() {
        this.field1534[0] = 0;
        this.field1534[1] = 65535;
        this.field1536[0] = 0;
        this.field1536[1] = 65535;
    }
}
