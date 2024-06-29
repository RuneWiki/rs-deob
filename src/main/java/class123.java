import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class123 {

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "I")
    private int field1523 = 2;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "[I")
    private int[] field1527 = new int[2];

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "[I")
    private int[] field1526 = new int[2];

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "I")
    public int field1522;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
    public int field1524;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
    public int field1525;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "I")
    private int field1528;

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "I")
    private int field1529;

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "I")
    private int field1530;

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "I")
    private int field1531;

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "I")
    private int field1532;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)I")
    public final int method591(int arg0) {
        if (this.field1530 >= this.field1529) {
            this.field1532 = this.field1526[this.field1528++] << 15;
            if (this.field1528 >= this.field1523) {
                this.field1528 = this.field1523 - 1;
            }
            this.field1529 = (int) ((double) this.field1527[this.field1528] / 65536.0D * (double) arg0);
            if (this.field1529 > this.field1530) {
                this.field1531 = ((this.field1526[this.field1528] << 15) - this.field1532) / (this.field1529 - this.field1530);
            }
        }
        this.field1532 += this.field1531;
        this.field1530++;
        return this.field1532 - this.field1531 >> 15;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "()V")
    public final void method592() {
        this.field1529 = 0;
        this.field1528 = 0;
        this.field1531 = 0;
        this.field1532 = 0;
        this.field1530 = 0;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lvt;)V")
    public final void method593(class179 arg0) {
        this.field1523 = arg0.method895((byte) -97);
        this.field1527 = new int[this.field1523];
        this.field1526 = new int[this.field1523];
        for (int var2 = 0; var2 < this.field1523; var2++) {
            this.field1527[var2] = arg0.method916(21933);
            this.field1526[var2] = arg0.method916(21933);
        }
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "()V")
    public class123() {
        this.field1527[0] = 0;
        this.field1527[1] = 65535;
        this.field1526[0] = 0;
        this.field1526[1] = 65535;
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(Lvt;)V")
    public final void method594(class179 arg0) {
        this.field1525 = arg0.method895((byte) -74);
        this.field1524 = arg0.method939((byte) 98);
        this.field1522 = arg0.method939((byte) 69);
        this.method593(arg0);
    }
}
