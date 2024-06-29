import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class94 {

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    private int field1478 = 2;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "[I")
    private int[] field1480 = new int[2];

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "[I")
    private int[] field1481 = new int[2];

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    public int field1477;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
    public int field1479;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "I")
    public int field1482;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "I")
    private int field1483;

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "I")
    private int field1484;

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "I")
    private int field1485;

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "I")
    private int field1486;

    @OriginalMember(owner = "client!ki", name = "k", descriptor = "I")
    private int field1487;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lec;)V")
    public final void method788(class37 arg0) {
        this.field1477 = arg0.method271((byte) 102);
        this.field1482 = arg0.method278(-119);
        this.field1479 = arg0.method278(-116);
        this.method789(arg0);
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(Lec;)V")
    public final void method789(class37 arg0) {
        this.field1478 = arg0.method271((byte) 117);
        this.field1480 = new int[this.field1478];
        this.field1481 = new int[this.field1478];
        for (int var2 = 0; var2 < this.field1478; var2++) {
            this.field1480[var2] = arg0.method320((byte) -87);
            this.field1481[var2] = arg0.method320((byte) -87);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)I")
    public final int method790(int arg0) {
        if (this.field1485 >= this.field1487) {
            this.field1483 = this.field1481[this.field1486++] << 15;
            if (this.field1486 >= this.field1478) {
                this.field1486 = this.field1478 - 1;
            }
            this.field1487 = (int) ((double) this.field1480[this.field1486] / 65536.0D * (double) arg0);
            if (this.field1487 > this.field1485) {
                this.field1484 = ((this.field1481[this.field1486] << 15) - this.field1483) / (this.field1487 - this.field1485);
            }
        }
        this.field1483 += this.field1484;
        this.field1485++;
        return this.field1483 - this.field1484 >> 15;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "()V")
    public final void method791() {
        this.field1487 = 0;
        this.field1486 = 0;
        this.field1484 = 0;
        this.field1483 = 0;
        this.field1485 = 0;
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "()V")
    public class94() {
        this.field1480[0] = 0;
        this.field1480[1] = 65535;
        this.field1481[0] = 0;
        this.field1481[1] = 65535;
    }
}
