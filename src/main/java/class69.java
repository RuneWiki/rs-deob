import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class69 {

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    private int field1616 = 2;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "[I")
    private int[] field1618 = new int[2];

    @OriginalMember(owner = "client!k", name = "e", descriptor = "[I")
    private int[] field1619 = new int[2];

    @OriginalMember(owner = "client!k", name = "a", descriptor = "I")
    public int field1615;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "I")
    public int field1617;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "I")
    public int field1620;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "I")
    private int field1621;

    @OriginalMember(owner = "client!k", name = "h", descriptor = "I")
    private int field1622;

    @OriginalMember(owner = "client!k", name = "i", descriptor = "I")
    private int field1623;

    @OriginalMember(owner = "client!k", name = "j", descriptor = "I")
    private int field1624;

    @OriginalMember(owner = "client!k", name = "k", descriptor = "I")
    private int field1625;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)I")
    public final int method573(int arg0) {
        if (this.field1622 >= this.field1623) {
            this.field1621 = this.field1619[this.field1625++] << 15;
            if (this.field1625 >= this.field1616) {
                this.field1625 = this.field1616 - 1;
            }
            this.field1623 = (int) ((double) this.field1618[this.field1625] / 65536.0D * (double) arg0);
            if (this.field1623 > this.field1622) {
                this.field1624 = ((this.field1619[this.field1625] << 15) - this.field1621) / (this.field1623 - this.field1622);
            }
        }
        this.field1621 += this.field1624;
        this.field1622++;
        return this.field1621 - this.field1624 >> 15;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Ljd;)V")
    public final void method574(class66 arg0) {
        this.field1620 = arg0.method533(255);
        this.field1617 = arg0.method539(true);
        this.field1615 = arg0.method539(true);
        this.method576(arg0);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "()V")
    public final void method575() {
        this.field1623 = 0;
        this.field1625 = 0;
        this.field1624 = 0;
        this.field1621 = 0;
        this.field1622 = 0;
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "()V")
    public class69() {
        this.field1618[0] = 0;
        this.field1618[1] = 65535;
        this.field1619[0] = 0;
        this.field1619[1] = 65535;
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(Ljd;)V")
    public final void method576(class66 arg0) {
        this.field1616 = arg0.method533(255);
        this.field1618 = new int[this.field1616];
        this.field1619 = new int[this.field1616];
        for (int var2 = 0; var2 < this.field1616; var2++) {
            this.field1618[var2] = arg0.method532(0);
            this.field1619[var2] = arg0.method532(0);
        }
    }
}
