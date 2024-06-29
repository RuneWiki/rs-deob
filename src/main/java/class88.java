import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class88 {

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    private int field1711 = 2;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "[I")
    private int[] field1712 = new int[2];

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "[I")
    private int[] field1715 = new int[2];

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
    public int field1710;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "I")
    public int field1713;

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
    public int field1714;

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "I")
    private int field1716;

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "I")
    private int field1717;

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "I")
    private int field1718;

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "I")
    private int field1719;

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "I")
    private int field1720;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)I")
    public final int method564(int arg0) {
        if (this.field1720 >= this.field1716) {
            this.field1717 = this.field1715[this.field1719++] << 15;
            if (this.field1719 >= this.field1711) {
                this.field1719 = this.field1711 - 1;
            }
            this.field1716 = (int) ((double) this.field1712[this.field1719] / 65536.0D * (double) arg0);
            if (this.field1716 > this.field1720) {
                this.field1718 = ((this.field1715[this.field1719] << 15) - this.field1717) / (this.field1716 - this.field1720);
            }
        }
        this.field1717 += this.field1718;
        this.field1720++;
        return this.field1717 - this.field1718 >> 15;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lmb;)V")
    public final void method565(class121 arg0) {
        this.field1711 = arg0.method751((byte) -54);
        this.field1712 = new int[this.field1711];
        this.field1715 = new int[this.field1711];
        for (int var2 = 0; var2 < this.field1711; var2++) {
            this.field1712[var2] = arg0.method755((byte) -65);
            this.field1715[var2] = arg0.method755((byte) -125);
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "()V")
    public final void method566() {
        this.field1716 = 0;
        this.field1719 = 0;
        this.field1718 = 0;
        this.field1717 = 0;
        this.field1720 = 0;
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(Lmb;)V")
    public final void method567(class121 arg0) {
        this.field1710 = arg0.method751((byte) -60);
        this.field1714 = arg0.method776(-45);
        this.field1713 = arg0.method776(69);
        this.method565(arg0);
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "()V")
    public class88() {
        this.field1712[0] = 0;
        this.field1712[1] = 65535;
        this.field1715[0] = 0;
        this.field1715[1] = 65535;
    }
}
