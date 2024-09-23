import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("VMVYFNTB")
public class class65 {

    @OriginalMember(owner = "VMVYFNTB", name = "a", descriptor = "B")
    private byte field1587 = -27;

    @OriginalMember(owner = "VMVYFNTB", name = "b", descriptor = "Z")
    private boolean field1588 = true;

    @OriginalMember(owner = "VMVYFNTB", name = "c", descriptor = "Z")
    private boolean field1589 = false;

    @OriginalMember(owner = "VMVYFNTB", name = "d", descriptor = "I")
    private int field1590;

    @OriginalMember(owner = "VMVYFNTB", name = "g", descriptor = "I")
    public int field1593;

    @OriginalMember(owner = "VMVYFNTB", name = "h", descriptor = "I")
    public int field1594;

    @OriginalMember(owner = "VMVYFNTB", name = "i", descriptor = "I")
    public int field1595;

    @OriginalMember(owner = "VMVYFNTB", name = "j", descriptor = "I")
    private int field1596;

    @OriginalMember(owner = "VMVYFNTB", name = "k", descriptor = "I")
    private int field1597;

    @OriginalMember(owner = "VMVYFNTB", name = "l", descriptor = "I")
    private int field1598;

    @OriginalMember(owner = "VMVYFNTB", name = "m", descriptor = "I")
    private int field1599;

    @OriginalMember(owner = "VMVYFNTB", name = "n", descriptor = "I")
    private int field1600;

    @OriginalMember(owner = "VMVYFNTB", name = "o", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "VMVYFNTB", name = "e", descriptor = "[I")
    private int[] field1591;

    @OriginalMember(owner = "VMVYFNTB", name = "f", descriptor = "[I")
    private int[] field1592;

    @OriginalMember(owner = "VMVYFNTB", name = "a", descriptor = "(BLXJCNBMKS;)V")
    public final void method513(byte arg0, class68 arg1) {
        if (this.field1587 != arg0) {
            this.field1589 = !this.field1589;
        }
        this.field1595 = arg1.method534();
        this.field1593 = arg1.method539();
        this.field1594 = arg1.method539();
        this.method514(arg1, (byte) -115);
    }

    @OriginalMember(owner = "VMVYFNTB", name = "a", descriptor = "(LXJCNBMKS;B)V")
    public final void method514(class68 arg0, byte arg1) {
        this.field1590 = arg0.method534();
        this.field1591 = new int[this.field1590];
        this.field1592 = new int[this.field1590];
        if (arg1 != -115) {
            this.field1588 = !this.field1588;
        }
        for (int var3 = 0; var3 < this.field1590; var3++) {
            this.field1591[var3] = arg0.method536();
            this.field1592[var3] = arg0.method536();
        }
    }

    @OriginalMember(owner = "VMVYFNTB", name = "a", descriptor = "(B)V")
    public final void method515(byte arg0) {
        this.field1596 = 0;
        this.field1597 = 0;
        this.field1598 = 0;
        if (arg0 != 114) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field1599 = 0;
        this.field1600 = 0;
    }

    @OriginalMember(owner = "VMVYFNTB", name = "a", descriptor = "(II)I")
    public final int method516(int arg0, int arg1) {
        if (arg1 != 6) {
            this.field1588 = !this.field1588;
        }
        if (this.field1600 >= this.field1596) {
            this.field1599 = this.field1592[this.field1597++] << 15;
            if (this.field1597 >= this.field1590) {
                this.field1597 = this.field1590 - 1;
            }
            this.field1596 = (int) ((double) this.field1591[this.field1597] / 65536.0D * (double) arg0);
            if (this.field1596 > this.field1600) {
                this.field1598 = ((this.field1592[this.field1597] << 15) - this.field1599) / (this.field1596 - this.field1600);
            }
        }
        this.field1599 += this.field1598;
        this.field1600++;
        return this.field1599 - this.field1598 >> 15;
    }
}
