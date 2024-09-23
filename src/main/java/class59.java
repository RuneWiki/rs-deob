import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("VJXKRAVR")
public class class59 {

    @OriginalMember(owner = "VJXKRAVR", name = "a", descriptor = "Z")
    private boolean field1587 = false;

    @OriginalMember(owner = "VJXKRAVR", name = "b", descriptor = "B")
    private byte field1588 = 6;

    @OriginalMember(owner = "VJXKRAVR", name = "c", descriptor = "I")
    private int field1589;

    @OriginalMember(owner = "VJXKRAVR", name = "d", descriptor = "I")
    private int field1590;

    @OriginalMember(owner = "VJXKRAVR", name = "g", descriptor = "I")
    public int field1593;

    @OriginalMember(owner = "VJXKRAVR", name = "h", descriptor = "I")
    public int field1594;

    @OriginalMember(owner = "VJXKRAVR", name = "i", descriptor = "I")
    public int field1595;

    @OriginalMember(owner = "VJXKRAVR", name = "j", descriptor = "I")
    private int field1596;

    @OriginalMember(owner = "VJXKRAVR", name = "k", descriptor = "I")
    private int field1597;

    @OriginalMember(owner = "VJXKRAVR", name = "l", descriptor = "I")
    private int field1598;

    @OriginalMember(owner = "VJXKRAVR", name = "m", descriptor = "I")
    private int field1599;

    @OriginalMember(owner = "VJXKRAVR", name = "n", descriptor = "I")
    private int field1600;

    @OriginalMember(owner = "VJXKRAVR", name = "o", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "VJXKRAVR", name = "e", descriptor = "[I")
    private int[] field1591;

    @OriginalMember(owner = "VJXKRAVR", name = "f", descriptor = "[I")
    private int[] field1592;

    @OriginalMember(owner = "VJXKRAVR", name = "a", descriptor = "(LMLYYHULT;B)V")
    public final void method564(class30 arg0, byte arg1) {
        this.field1595 = arg0.method296();
        this.field1593 = arg0.method301();
        this.field1594 = arg0.method301();
        if (arg1 != 2) {
            throw new NullPointerException();
        }
        this.method565(arg0, -39134);
    }

    @OriginalMember(owner = "VJXKRAVR", name = "a", descriptor = "(LMLYYHULT;I)V")
    public final void method565(class30 arg0, int arg1) {
        this.field1590 = arg0.method296();
        this.field1591 = new int[this.field1590];
        this.field1592 = new int[this.field1590];
        if (arg1 != -39134) {
            this.field1589 = -20;
        }
        for (int var3 = 0; var3 < this.field1590; var3++) {
            this.field1591[var3] = arg0.method298();
            this.field1592[var3] = arg0.method298();
        }
    }

    @OriginalMember(owner = "VJXKRAVR", name = "a", descriptor = "(I)V")
    public final void method566(int arg0) {
        this.field1596 = 0;
        this.field1597 = 0;
        this.field1598 = 0;
        if (arg0 != 0) {
            this.field1587 = !this.field1587;
        }
        this.field1599 = 0;
        this.field1600 = 0;
    }

    @OriginalMember(owner = "VJXKRAVR", name = "a", descriptor = "(BI)I")
    public final int method567(byte arg0, int arg1) {
        if (this.field1600 >= this.field1596) {
            this.field1599 = this.field1592[this.field1597++] << 15;
            if (this.field1597 >= this.field1590) {
                this.field1597 = this.field1590 - 1;
            }
            this.field1596 = (int) ((double) this.field1591[this.field1597] / 65536.0D * (double) arg1);
            if (this.field1596 > this.field1600) {
                this.field1598 = ((this.field1592[this.field1597] << 15) - this.field1599) / (this.field1596 - this.field1600);
            }
        }
        this.field1599 += this.field1598;
        this.field1600++;
        if (this.field1588 == arg0) {
            boolean var3 = false;
        } else {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        return this.field1599 - this.field1598 >> 15;
    }
}
