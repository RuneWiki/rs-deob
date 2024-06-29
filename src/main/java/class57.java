import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class57 {

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    private int field1476 = 2;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "[I")
    private int[] field1477 = new int[2];

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "[I")
    private int[] field1480 = new int[2];

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    public int field1475;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    public int field1478;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
    public int field1479;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
    private int field1481;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
    private int field1482;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "I")
    private int field1483;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "I")
    private int field1484;

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "I")
    private int field1485;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "()V")
    public final void method441() {
        this.field1483 = 0;
        this.field1484 = 0;
        this.field1485 = 0;
        this.field1481 = 0;
        this.field1482 = 0;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lwb;)V")
    public final void method442(class148 arg0) {
        this.field1475 = arg0.method1137(255);
        this.field1478 = arg0.method1104(true);
        this.field1479 = arg0.method1104(true);
        this.method443(arg0);
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(Lwb;)V")
    public final void method443(class148 arg0) {
        this.field1476 = arg0.method1137(255);
        this.field1477 = new int[this.field1476];
        this.field1480 = new int[this.field1476];
        for (int var2 = 0; var2 < this.field1476; var2++) {
            this.field1477[var2] = arg0.method1140(-1);
            this.field1480[var2] = arg0.method1140(-1);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)I")
    public final int method444(int arg0) {
        if (this.field1482 >= this.field1483) {
            this.field1481 = this.field1480[this.field1484++] << 15;
            if (this.field1484 >= this.field1476) {
                this.field1484 = this.field1476 - 1;
            }
            this.field1483 = (int) ((double) this.field1477[this.field1484] / 65536.0D * (double) arg0);
            if (this.field1483 > this.field1482) {
                this.field1485 = ((this.field1480[this.field1484] << 15) - this.field1481) / (this.field1483 - this.field1482);
            }
        }
        this.field1481 += this.field1485;
        this.field1482++;
        return this.field1481 - this.field1485 >> 15;
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "()V")
    public class57() {
        this.field1477[0] = 0;
        this.field1477[1] = 65535;
        this.field1480[0] = 0;
        this.field1480[1] = 65535;
    }
}
