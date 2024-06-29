import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class111 {

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "I")
    private int field1561 = 2;

    @OriginalMember(owner = "client!ls", name = "d", descriptor = "[I")
    private int[] field1563 = new int[2];

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "[I")
    private int[] field1560 = new int[2];

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "I")
    public int field1562;

    @OriginalMember(owner = "client!ls", name = "e", descriptor = "I")
    public int field1564;

    @OriginalMember(owner = "client!ls", name = "f", descriptor = "I")
    public int field1565;

    @OriginalMember(owner = "client!ls", name = "g", descriptor = "I")
    private int field1566;

    @OriginalMember(owner = "client!ls", name = "h", descriptor = "I")
    private int field1567;

    @OriginalMember(owner = "client!ls", name = "i", descriptor = "I")
    private int field1568;

    @OriginalMember(owner = "client!ls", name = "j", descriptor = "I")
    private int field1569;

    @OriginalMember(owner = "client!ls", name = "k", descriptor = "I")
    private int field1570;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "()V")
    public final void method721() {
        this.field1568 = 0;
        this.field1566 = 0;
        this.field1567 = 0;
        this.field1570 = 0;
        this.field1569 = 0;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lhw;)V")
    public final void method722(class208 arg0) {
        this.field1561 = arg0.method1445(-98);
        this.field1563 = new int[this.field1561];
        this.field1560 = new int[this.field1561];
        for (int var2 = 0; var2 < this.field1561; var2++) {
            this.field1563[var2] = arg0.method1455(-3387);
            this.field1560[var2] = arg0.method1455(-3387);
        }
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(Lhw;)V")
    public final void method723(class208 arg0) {
        this.field1562 = arg0.method1445(-93);
        this.field1565 = arg0.method1436((byte) 111);
        this.field1564 = arg0.method1436((byte) 103);
        this.method722(arg0);
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)I")
    public final int method724(int arg0) {
        if (this.field1569 >= this.field1568) {
            this.field1570 = this.field1560[this.field1566++] << 15;
            if (this.field1566 >= this.field1561) {
                this.field1566 = this.field1561 - 1;
            }
            this.field1568 = (int) ((double) this.field1563[this.field1566] / 65536.0D * (double) arg0);
            if (this.field1568 > this.field1569) {
                this.field1567 = ((this.field1560[this.field1566] << 15) - this.field1570) / (this.field1568 - this.field1569);
            }
        }
        this.field1570 += this.field1567;
        this.field1569++;
        return this.field1570 - this.field1567 >> 15;
    }

    @OriginalMember(owner = "client!ls", name = "<init>", descriptor = "()V")
    public class111() {
        this.field1563[0] = 0;
        this.field1563[1] = 65535;
        this.field1560[0] = 0;
        this.field1560[1] = 65535;
    }
}
