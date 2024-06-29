import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class88 {

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
    private int field1466 = 2;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "[I")
    private int[] field1465 = new int[2];

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "[I")
    private int[] field1467 = new int[2];

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
    public int field1464;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "I")
    public int field1468;

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "I")
    public int field1469;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "I")
    private int field1470;

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "I")
    private int field1471;

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "I")
    private int field1472;

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "I")
    private int field1473;

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "I")
    private int field1474;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "()V")
    public final void method669() {
        this.field1470 = 0;
        this.field1473 = 0;
        this.field1474 = 0;
        this.field1472 = 0;
        this.field1471 = 0;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)I")
    public final int method670(int arg0) {
        if (this.field1471 >= this.field1470) {
            this.field1472 = this.field1467[this.field1473++] << 15;
            if (this.field1473 >= this.field1466) {
                this.field1473 = this.field1466 - 1;
            }
            this.field1470 = (int) ((double) this.field1465[this.field1473] / 65536.0D * (double) arg0);
            if (this.field1470 > this.field1471) {
                this.field1474 = ((this.field1467[this.field1473] << 15) - this.field1472) / (this.field1470 - this.field1471);
            }
        }
        this.field1472 += this.field1474;
        this.field1471++;
        return this.field1472 - this.field1474 >> 15;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Llb;)V")
    public final void method671(class121 arg0) {
        this.field1466 = arg0.method897(125);
        this.field1465 = new int[this.field1466];
        this.field1467 = new int[this.field1466];
        for (int var2 = 0; var2 < this.field1466; var2++) {
            this.field1465[var2] = arg0.method876(false);
            this.field1467[var2] = arg0.method876(false);
        }
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "()V")
    public class88() {
        this.field1465[0] = 0;
        this.field1465[1] = 65535;
        this.field1467[0] = 0;
        this.field1467[1] = 65535;
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(Llb;)V")
    public final void method672(class121 arg0) {
        this.field1468 = arg0.method897(113);
        this.field1469 = arg0.method865((byte) 8);
        this.field1464 = arg0.method865((byte) 8);
        this.method671(arg0);
    }
}
