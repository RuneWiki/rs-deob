import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!TPZZASFL")
public class class60 {

    @OriginalMember(owner = "client!TPZZASFL", name = "a", descriptor = "I")
    private int field1625 = 10831;

    @OriginalMember(owner = "client!TPZZASFL", name = "b", descriptor = "I")
    private int field1626;

    @OriginalMember(owner = "client!TPZZASFL", name = "e", descriptor = "I")
    public int field1629;

    @OriginalMember(owner = "client!TPZZASFL", name = "f", descriptor = "I")
    public int field1630;

    @OriginalMember(owner = "client!TPZZASFL", name = "g", descriptor = "I")
    public int field1631;

    @OriginalMember(owner = "client!TPZZASFL", name = "h", descriptor = "I")
    private int field1632;

    @OriginalMember(owner = "client!TPZZASFL", name = "i", descriptor = "I")
    private int field1633;

    @OriginalMember(owner = "client!TPZZASFL", name = "j", descriptor = "I")
    private int field1634;

    @OriginalMember(owner = "client!TPZZASFL", name = "k", descriptor = "I")
    private int field1635;

    @OriginalMember(owner = "client!TPZZASFL", name = "l", descriptor = "I")
    private int field1636;

    @OriginalMember(owner = "client!TPZZASFL", name = "m", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!TPZZASFL", name = "c", descriptor = "[I")
    private int[] field1627;

    @OriginalMember(owner = "client!TPZZASFL", name = "d", descriptor = "[I")
    private int[] field1628;

    @OriginalMember(owner = "client!TPZZASFL", name = "a", descriptor = "(ILMVHXDWGI;)V")
    public final void method570(int arg0, class38 arg1) {
        this.field1631 = arg1.method357();
        this.field1629 = arg1.method362();
        this.field1630 = arg1.method362();
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
        this.method571(arg1, 10831);
    }

    @OriginalMember(owner = "client!TPZZASFL", name = "a", descriptor = "(LMVHXDWGI;I)V")
    public final void method571(class38 arg0, int arg1) {
        this.field1626 = arg0.method357();
        this.field1627 = new int[this.field1626];
        this.field1628 = new int[this.field1626];
        if (this.field1625 == arg1) {
            for (int var3 = 0; var3 < this.field1626; var3++) {
                this.field1627[var3] = arg0.method359();
                this.field1628[var3] = arg0.method359();
            }
        }
    }

    @OriginalMember(owner = "client!TPZZASFL", name = "a", descriptor = "(B)V")
    public final void method572(byte arg0) {
        this.field1632 = 0;
        this.field1633 = 0;
        this.field1634 = 0;
        this.field1635 = 0;
        this.field1636 = 0;
        if (arg0 == 2) {
            ;
        }
    }

    @OriginalMember(owner = "client!TPZZASFL", name = "a", descriptor = "(IB)I")
    public final int method573(int arg0, byte arg1) {
        if (this.field1636 >= this.field1632) {
            this.field1635 = this.field1628[this.field1633++] << 15;
            if (this.field1633 >= this.field1626) {
                this.field1633 = this.field1626 - 1;
            }
            this.field1632 = (int) ((double) this.field1627[this.field1633] / 65536.0D * (double) arg0);
            if (this.field1632 > this.field1636) {
                this.field1634 = ((this.field1628[this.field1633] << 15) - this.field1635) / (this.field1632 - this.field1636);
            }
        }
        this.field1635 += this.field1634;
        if (arg1 == 6) {
            this.field1636++;
            return this.field1635 - this.field1634 >> 15;
        } else {
            return 3;
        }
    }
}
