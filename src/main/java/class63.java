import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!VRTTZTTM")
public class class63 {

    @OriginalMember(owner = "client!VRTTZTTM", name = "a", descriptor = "I")
    private int field1631 = 716;

    @OriginalMember(owner = "client!VRTTZTTM", name = "b", descriptor = "I")
    private int field1632 = -76;

    @OriginalMember(owner = "client!VRTTZTTM", name = "c", descriptor = "Z")
    private boolean field1633 = true;

    @OriginalMember(owner = "client!VRTTZTTM", name = "d", descriptor = "I")
    private int field1634;

    @OriginalMember(owner = "client!VRTTZTTM", name = "g", descriptor = "I")
    public int field1637;

    @OriginalMember(owner = "client!VRTTZTTM", name = "h", descriptor = "I")
    public int field1638;

    @OriginalMember(owner = "client!VRTTZTTM", name = "i", descriptor = "I")
    public int field1639;

    @OriginalMember(owner = "client!VRTTZTTM", name = "j", descriptor = "I")
    private int field1640;

    @OriginalMember(owner = "client!VRTTZTTM", name = "k", descriptor = "I")
    private int field1641;

    @OriginalMember(owner = "client!VRTTZTTM", name = "l", descriptor = "I")
    private int field1642;

    @OriginalMember(owner = "client!VRTTZTTM", name = "m", descriptor = "I")
    private int field1643;

    @OriginalMember(owner = "client!VRTTZTTM", name = "n", descriptor = "I")
    private int field1644;

    @OriginalMember(owner = "client!VRTTZTTM", name = "o", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!VRTTZTTM", name = "e", descriptor = "[I")
    private int[] field1635;

    @OriginalMember(owner = "client!VRTTZTTM", name = "f", descriptor = "[I")
    private int[] field1636;

    @OriginalMember(owner = "client!VRTTZTTM", name = "a", descriptor = "(LTKPFKOXP;B)V")
    public final void method582(class59 arg0, byte arg1) {
        this.field1639 = arg0.method529();
        this.field1637 = arg0.method534();
        this.field1638 = arg0.method534();
        if (arg1 != 4) {
            this.field1632 = 4;
        }
        this.method583(false, arg0);
    }

    @OriginalMember(owner = "client!VRTTZTTM", name = "a", descriptor = "(ZLTKPFKOXP;)V")
    public final void method583(boolean arg0, class59 arg1) {
        this.field1634 = arg1.method529();
        this.field1635 = new int[this.field1634];
        this.field1636 = new int[this.field1634];
        for (int var3 = 0; var3 < this.field1634; var3++) {
            this.field1635[var3] = arg1.method531();
            this.field1636[var3] = arg1.method531();
        }
        if (arg0) {
            this.field1631 = 172;
        }
    }

    @OriginalMember(owner = "client!VRTTZTTM", name = "a", descriptor = "(I)V")
    public final void method584(int arg0) {
        this.field1640 = 0;
        this.field1641 = 0;
        this.field1642 = 0;
        int var2 = 21 / arg0;
        this.field1643 = 0;
        this.field1644 = 0;
    }

    @OriginalMember(owner = "client!VRTTZTTM", name = "a", descriptor = "(IZ)I")
    public final int method585(int arg0, boolean arg1) {
        if (this.field1644 >= this.field1640) {
            this.field1643 = this.field1636[this.field1641++] << 15;
            if (this.field1641 >= this.field1634) {
                this.field1641 = this.field1634 - 1;
            }
            this.field1640 = (int) ((double) this.field1635[this.field1641] / 65536.0D * (double) arg0);
            if (this.field1640 > this.field1644) {
                this.field1642 = ((this.field1636[this.field1641] << 15) - this.field1643) / (this.field1640 - this.field1644);
            }
        }
        this.field1643 += this.field1642;
        if (!arg1) {
            this.field1633 = !this.field1633;
        }
        this.field1644++;
        return this.field1643 - this.field1642 >> 15;
    }
}
