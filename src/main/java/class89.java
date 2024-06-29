import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class89 {

    @OriginalMember(owner = "client!j", name = "d", descriptor = "I")
    private int field1771 = 2;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "[I")
    private int[] field1770 = new int[2];

    @OriginalMember(owner = "client!j", name = "a", descriptor = "[I")
    private int[] field1768 = new int[2];

    @OriginalMember(owner = "client!j", name = "b", descriptor = "I")
    public int field1769;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "I")
    public int field1772;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "I")
    public int field1773;

    @OriginalMember(owner = "client!j", name = "g", descriptor = "I")
    private int field1774;

    @OriginalMember(owner = "client!j", name = "h", descriptor = "I")
    private int field1775;

    @OriginalMember(owner = "client!j", name = "i", descriptor = "I")
    private int field1776;

    @OriginalMember(owner = "client!j", name = "j", descriptor = "I")
    private int field1777;

    @OriginalMember(owner = "client!j", name = "k", descriptor = "I")
    private int field1778;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "()V")
    public final void method603() {
        this.field1778 = 0;
        this.field1775 = 0;
        this.field1777 = 0;
        this.field1774 = 0;
        this.field1776 = 0;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Log;)V")
    public final void method604(class146 arg0) {
        this.field1772 = arg0.method991(255);
        this.field1769 = arg0.method979(1029109968);
        this.field1773 = arg0.method979(1029109968);
        this.method606(arg0);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)I")
    public final int method605(int arg0) {
        if (this.field1776 >= this.field1778) {
            this.field1774 = this.field1768[this.field1775++] << 15;
            if (this.field1775 >= this.field1771) {
                this.field1775 = this.field1771 - 1;
            }
            this.field1778 = (int) ((double) this.field1770[this.field1775] / 65536.0D * (double) arg0);
            if (this.field1778 > this.field1776) {
                this.field1777 = ((this.field1768[this.field1775] << 15) - this.field1774) / (this.field1778 - this.field1776);
            }
        }
        this.field1774 += this.field1777;
        this.field1776++;
        return this.field1774 - this.field1777 >> 15;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(Log;)V")
    public final void method606(class146 arg0) {
        this.field1771 = arg0.method991(255);
        this.field1770 = new int[this.field1771];
        this.field1768 = new int[this.field1771];
        for (int var2 = 0; var2 < this.field1771; var2++) {
            this.field1770[var2] = arg0.method1007(113);
            this.field1768[var2] = arg0.method1007(31);
        }
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "()V")
    public class89() {
        this.field1770[0] = 0;
        this.field1770[1] = 65535;
        this.field1768[0] = 0;
        this.field1768[1] = 65535;
    }
}
