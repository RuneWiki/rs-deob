import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class90 {

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    private int field1703 = 2;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "[I")
    private int[] field1702 = new int[2];

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "[I")
    private int[] field1698 = new int[2];

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public int field1699;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public int field1700;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
    public int field1701;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "I")
    private int field1704;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "I")
    private int field1705;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
    private int field1706;

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "I")
    private int field1707;

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
    private int field1708;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lka;)V")
    public final void method578(class109 arg0) {
        this.field1700 = arg0.method662((byte) -95);
        this.field1699 = arg0.method710(28908);
        this.field1701 = arg0.method710(28908);
        this.method579(arg0);
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(Lka;)V")
    public final void method579(class109 arg0) {
        this.field1703 = arg0.method662((byte) -88);
        this.field1702 = new int[this.field1703];
        this.field1698 = new int[this.field1703];
        for (int var2 = 0; var2 < this.field1703; var2++) {
            this.field1702[var2] = arg0.method675(2);
            this.field1698[var2] = arg0.method675(2);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "()V")
    public final void method580() {
        this.field1706 = 0;
        this.field1704 = 0;
        this.field1707 = 0;
        this.field1708 = 0;
        this.field1705 = 0;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)I")
    public final int method581(int arg0) {
        if (this.field1705 >= this.field1706) {
            this.field1708 = this.field1698[this.field1704++] << 15;
            if (this.field1704 >= this.field1703) {
                this.field1704 = this.field1703 - 1;
            }
            this.field1706 = (int) ((double) this.field1702[this.field1704] / 65536.0D * (double) arg0);
            if (this.field1706 > this.field1705) {
                this.field1707 = ((this.field1698[this.field1704] << 15) - this.field1708) / (this.field1706 - this.field1705);
            }
        }
        this.field1708 += this.field1707;
        this.field1705++;
        return this.field1708 - this.field1707 >> 15;
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "()V")
    public class90() {
        this.field1702[0] = 0;
        this.field1702[1] = 65535;
        this.field1698[0] = 0;
        this.field1698[1] = 65535;
    }
}
