import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("XJOITHUI")
public class class65 {

    @OriginalMember(owner = "XJOITHUI", name = "a", descriptor = "I")
    private int field1630 = 5;

    @OriginalMember(owner = "XJOITHUI", name = "b", descriptor = "B")
    private byte field1631 = 5;

    @OriginalMember(owner = "XJOITHUI", name = "c", descriptor = "I")
    private int field1632;

    @OriginalMember(owner = "XJOITHUI", name = "f", descriptor = "I")
    public int field1635;

    @OriginalMember(owner = "XJOITHUI", name = "g", descriptor = "I")
    public int field1636;

    @OriginalMember(owner = "XJOITHUI", name = "h", descriptor = "I")
    public int field1637;

    @OriginalMember(owner = "XJOITHUI", name = "i", descriptor = "I")
    private int field1638;

    @OriginalMember(owner = "XJOITHUI", name = "j", descriptor = "I")
    private int field1639;

    @OriginalMember(owner = "XJOITHUI", name = "k", descriptor = "I")
    private int field1640;

    @OriginalMember(owner = "XJOITHUI", name = "l", descriptor = "I")
    private int field1641;

    @OriginalMember(owner = "XJOITHUI", name = "m", descriptor = "I")
    private int field1642;

    @OriginalMember(owner = "XJOITHUI", name = "n", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "XJOITHUI", name = "d", descriptor = "[I")
    private int[] field1633;

    @OriginalMember(owner = "XJOITHUI", name = "e", descriptor = "[I")
    private int[] field1634;

    @OriginalMember(owner = "XJOITHUI", name = "a", descriptor = "(ILBJPWOXRJ;)V")
    public final void method538(int arg0, class3 arg1) {
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
        this.field1637 = arg1.method15();
        this.field1635 = arg1.method20();
        this.field1636 = arg1.method20();
        this.method539(arg1, (byte) 5);
    }

    @OriginalMember(owner = "XJOITHUI", name = "a", descriptor = "(LBJPWOXRJ;B)V")
    public final void method539(class3 arg0, byte arg1) {
        this.field1632 = arg0.method15();
        this.field1633 = new int[this.field1632];
        if (this.field1631 != arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field1634 = new int[this.field1632];
        for (int var4 = 0; var4 < this.field1632; var4++) {
            this.field1633[var4] = arg0.method17();
            this.field1634[var4] = arg0.method17();
        }
    }

    @OriginalMember(owner = "XJOITHUI", name = "a", descriptor = "(I)V")
    public final void method540(int arg0) {
        this.field1638 = 0;
        this.field1639 = 0;
        if (arg0 != 2) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field1640 = 0;
        this.field1641 = 0;
        this.field1642 = 0;
    }

    @OriginalMember(owner = "XJOITHUI", name = "a", descriptor = "(ZI)I")
    public final int method541(boolean arg0, int arg1) {
        if (this.field1642 >= this.field1638) {
            this.field1641 = this.field1634[this.field1639++] << 15;
            if (this.field1639 >= this.field1632) {
                this.field1639 = this.field1632 - 1;
            }
            this.field1638 = (int) ((double) this.field1633[this.field1639] / 65536.0D * (double) arg1);
            if (this.field1638 > this.field1642) {
                this.field1640 = ((this.field1634[this.field1639] << 15) - this.field1641) / (this.field1638 - this.field1642);
            }
        }
        this.field1641 += this.field1640;
        if (arg0) {
            this.field1630 = -391;
        }
        this.field1642++;
        return this.field1641 - this.field1640 >> 15;
    }
}
