import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("YJSRODCC")
public class class64 {

    @OriginalMember(owner = "YJSRODCC", name = "a", descriptor = "Z")
    private boolean field1629 = true;

    @OriginalMember(owner = "YJSRODCC", name = "b", descriptor = "I")
    private int field1630;

    @OriginalMember(owner = "YJSRODCC", name = "e", descriptor = "I")
    public int field1633;

    @OriginalMember(owner = "YJSRODCC", name = "f", descriptor = "I")
    public int field1634;

    @OriginalMember(owner = "YJSRODCC", name = "g", descriptor = "I")
    public int field1635;

    @OriginalMember(owner = "YJSRODCC", name = "h", descriptor = "I")
    private int field1636;

    @OriginalMember(owner = "YJSRODCC", name = "i", descriptor = "I")
    private int field1637;

    @OriginalMember(owner = "YJSRODCC", name = "j", descriptor = "I")
    private int field1638;

    @OriginalMember(owner = "YJSRODCC", name = "k", descriptor = "I")
    private int field1639;

    @OriginalMember(owner = "YJSRODCC", name = "l", descriptor = "I")
    private int field1640;

    @OriginalMember(owner = "YJSRODCC", name = "m", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "YJSRODCC", name = "c", descriptor = "[I")
    private int[] field1631;

    @OriginalMember(owner = "YJSRODCC", name = "d", descriptor = "[I")
    private int[] field1632;

    @OriginalMember(owner = "YJSRODCC", name = "a", descriptor = "(LPGNBHFUF;I)V")
    public final void method571(class42 arg0, int arg1) {
        this.field1635 = arg0.method420();
        this.field1633 = arg0.method425();
        this.field1634 = arg0.method425();
        if (arg1 <= 0) {
            throw new NullPointerException();
        }
        this.method572(arg0, 0);
    }

    @OriginalMember(owner = "YJSRODCC", name = "b", descriptor = "(LPGNBHFUF;I)V")
    public final void method572(class42 arg0, int arg1) {
        this.field1630 = arg0.method420();
        if (arg1 != 0) {
            return;
        }
        this.field1631 = new int[this.field1630];
        this.field1632 = new int[this.field1630];
        for (int var3 = 0; var3 < this.field1630; var3++) {
            this.field1631[var3] = arg0.method422();
            this.field1632[var3] = arg0.method422();
        }
    }

    @OriginalMember(owner = "YJSRODCC", name = "a", descriptor = "(B)V")
    public final void method573(byte arg0) {
        this.field1636 = 0;
        if (arg0 != 0) {
            return;
        }
        boolean var2 = false;
        this.field1637 = 0;
        this.field1638 = 0;
        this.field1639 = 0;
        this.field1640 = 0;
    }

    @OriginalMember(owner = "YJSRODCC", name = "a", descriptor = "(IZ)I")
    public final int method574(int arg0, boolean arg1) {
        if (this.field1640 >= this.field1636) {
            this.field1639 = this.field1632[this.field1637++] << 15;
            if (this.field1637 >= this.field1630) {
                this.field1637 = this.field1630 - 1;
            }
            this.field1636 = (int) ((double) this.field1631[this.field1637] / 65536.0D * (double) arg0);
            if (this.field1636 > this.field1640) {
                this.field1638 = ((this.field1632[this.field1637] << 15) - this.field1639) / (this.field1636 - this.field1640);
            }
        }
        this.field1639 += this.field1638;
        this.field1640++;
        if (!arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return this.field1639 - this.field1638 >> 15;
    }
}
