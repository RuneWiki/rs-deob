import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("XCOYGYOS")
public class class59 {

    @OriginalMember(owner = "XCOYGYOS", name = "a", descriptor = "I")
    private int field1535 = -752;

    @OriginalMember(owner = "XCOYGYOS", name = "b", descriptor = "I")
    private int field1536;

    @OriginalMember(owner = "XCOYGYOS", name = "e", descriptor = "I")
    public int field1539;

    @OriginalMember(owner = "XCOYGYOS", name = "f", descriptor = "I")
    public int field1540;

    @OriginalMember(owner = "XCOYGYOS", name = "g", descriptor = "I")
    public int field1541;

    @OriginalMember(owner = "XCOYGYOS", name = "h", descriptor = "I")
    private int field1542;

    @OriginalMember(owner = "XCOYGYOS", name = "i", descriptor = "I")
    private int field1543;

    @OriginalMember(owner = "XCOYGYOS", name = "j", descriptor = "I")
    private int field1544;

    @OriginalMember(owner = "XCOYGYOS", name = "k", descriptor = "I")
    private int field1545;

    @OriginalMember(owner = "XCOYGYOS", name = "l", descriptor = "I")
    private int field1546;

    @OriginalMember(owner = "XCOYGYOS", name = "m", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "XCOYGYOS", name = "c", descriptor = "[I")
    private int[] field1537;

    @OriginalMember(owner = "XCOYGYOS", name = "d", descriptor = "[I")
    private int[] field1538;

    @OriginalMember(owner = "XCOYGYOS", name = "a", descriptor = "(LZOMNSJJM;B)V")
    public final void method454(class69 arg0, byte arg1) {
        this.field1541 = arg0.method547();
        if (arg1 != 5) {
            throw new NullPointerException();
        }
        this.field1539 = arg0.method552();
        this.field1540 = arg0.method552();
        this.method455(arg0, 51);
    }

    @OriginalMember(owner = "XCOYGYOS", name = "a", descriptor = "(LZOMNSJJM;I)V")
    public final void method455(class69 arg0, int arg1) {
        this.field1536 = arg0.method547();
        this.field1537 = new int[this.field1536];
        this.field1538 = new int[this.field1536];
        int var3 = 69 / arg1;
        for (int var4 = 0; var4 < this.field1536; var4++) {
            this.field1537[var4] = arg0.method549();
            this.field1538[var4] = arg0.method549();
        }
    }

    @OriginalMember(owner = "XCOYGYOS", name = "a", descriptor = "(I)V")
    public final void method456(int arg0) {
        this.field1542 = 0;
        this.field1543 = 0;
        while (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field1544 = 0;
        this.field1545 = 0;
        this.field1546 = 0;
    }

    @OriginalMember(owner = "XCOYGYOS", name = "a", descriptor = "(II)I")
    public final int method457(int arg0, int arg1) {
        if (this.field1546 >= this.field1542) {
            this.field1545 = this.field1538[this.field1543++] << 15;
            if (this.field1543 >= this.field1536) {
                this.field1543 = this.field1536 - 1;
            }
            this.field1542 = (int) ((double) this.field1537[this.field1543] / 65536.0D * (double) arg0);
            if (this.field1542 > this.field1546) {
                this.field1544 = ((this.field1538[this.field1543] << 15) - this.field1545) / (this.field1542 - this.field1546);
            }
        }
        this.field1545 += this.field1544;
        if (arg1 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field1546++;
        return this.field1545 - this.field1544 >> 15;
    }
}
