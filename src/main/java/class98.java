import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class98 {

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
    private int field1707 = 2;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "[I")
    private int[] field1708 = new int[2];

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "[I")
    private int[] field1710 = new int[2];

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "I")
    public int field1706;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
    public int field1709;

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "I")
    public int field1711;

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "I")
    private int field1712;

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "I")
    private int field1713;

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "I")
    private int field1714;

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "I")
    private int field1715;

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "I")
    private int field1716;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lce;)V")
    public final void method652(class28 arg0) {
        this.field1707 = arg0.method215(-1797813752);
        this.field1708 = new int[this.field1707];
        this.field1710 = new int[this.field1707];
        for (int var2 = 0; var2 < this.field1707; var2++) {
            this.field1708[var2] = arg0.method230((byte) -100);
            this.field1710[var2] = arg0.method230((byte) -108);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "()V")
    public final void method653() {
        this.field1712 = 0;
        this.field1716 = 0;
        this.field1715 = 0;
        this.field1713 = 0;
        this.field1714 = 0;
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(Lce;)V")
    public final void method654(class28 arg0) {
        this.field1711 = arg0.method215(-1797813752);
        this.field1709 = arg0.method226(115);
        this.field1706 = arg0.method226(-117);
        this.method652(arg0);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)I")
    public final int method655(int arg0) {
        if (this.field1714 >= this.field1712) {
            this.field1713 = this.field1710[this.field1716++] << 15;
            if (this.field1716 >= this.field1707) {
                this.field1716 = this.field1707 - 1;
            }
            this.field1712 = (int) ((double) this.field1708[this.field1716] / 65536.0D * (double) arg0);
            if (this.field1712 > this.field1714) {
                this.field1715 = ((this.field1710[this.field1716] << 15) - this.field1713) / (this.field1712 - this.field1714);
            }
        }
        this.field1713 += this.field1715;
        this.field1714++;
        return this.field1713 - this.field1715 >> 15;
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V")
    public class98() {
        this.field1708[0] = 0;
        this.field1708[1] = 65535;
        this.field1710[0] = 0;
        this.field1710[1] = 65535;
    }
}
