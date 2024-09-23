import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("UPKVWWFD")
public class class61 {

    @OriginalMember(owner = "UPKVWWFD", name = "a", descriptor = "I")
    private int field1552 = 28175;

    @OriginalMember(owner = "UPKVWWFD", name = "c", descriptor = "B")
    private byte field1554 = 3;

    @OriginalMember(owner = "UPKVWWFD", name = "d", descriptor = "I")
    private int field1555 = 202;

    @OriginalMember(owner = "UPKVWWFD", name = "b", descriptor = "I")
    private int field1553;

    @OriginalMember(owner = "UPKVWWFD", name = "e", descriptor = "I")
    private int field1556;

    @OriginalMember(owner = "UPKVWWFD", name = "h", descriptor = "I")
    public int field1559;

    @OriginalMember(owner = "UPKVWWFD", name = "i", descriptor = "I")
    public int field1560;

    @OriginalMember(owner = "UPKVWWFD", name = "j", descriptor = "I")
    public int field1561;

    @OriginalMember(owner = "UPKVWWFD", name = "k", descriptor = "I")
    private int field1562;

    @OriginalMember(owner = "UPKVWWFD", name = "l", descriptor = "I")
    private int field1563;

    @OriginalMember(owner = "UPKVWWFD", name = "m", descriptor = "I")
    private int field1564;

    @OriginalMember(owner = "UPKVWWFD", name = "n", descriptor = "I")
    private int field1565;

    @OriginalMember(owner = "UPKVWWFD", name = "o", descriptor = "I")
    private int field1566;

    @OriginalMember(owner = "UPKVWWFD", name = "p", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "UPKVWWFD", name = "f", descriptor = "[I")
    private int[] field1557;

    @OriginalMember(owner = "UPKVWWFD", name = "g", descriptor = "[I")
    private int[] field1558;

    @OriginalMember(owner = "UPKVWWFD", name = "a", descriptor = "(LEGCCHUZS;Z)V")
    public final void method549(class15 arg0, boolean arg1) {
        this.field1561 = arg0.method261();
        if (!arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field1559 = arg0.method266();
        this.field1560 = arg0.method266();
        this.method550(-267, arg0);
    }

    @OriginalMember(owner = "UPKVWWFD", name = "a", descriptor = "(ILEGCCHUZS;)V")
    public final void method550(int arg0, class15 arg1) {
        this.field1556 = arg1.method261();
        while (arg0 >= 0) {
            this.field1553 = -193;
        }
        this.field1557 = new int[this.field1556];
        this.field1558 = new int[this.field1556];
        for (int var3 = 0; var3 < this.field1556; var3++) {
            this.field1557[var3] = arg1.method263();
            this.field1558[var3] = arg1.method263();
        }
    }

    @OriginalMember(owner = "UPKVWWFD", name = "a", descriptor = "(B)V")
    public final void method551(byte arg0) {
        this.field1562 = 0;
        this.field1563 = 0;
        this.field1564 = 0;
        if (this.field1554 != arg0) {
            this.field1552 = 419;
        }
        this.field1565 = 0;
        this.field1566 = 0;
    }

    @OriginalMember(owner = "UPKVWWFD", name = "a", descriptor = "(II)I")
    public final int method552(int arg0, int arg1) {
        if (this.field1566 >= this.field1562) {
            this.field1565 = this.field1558[this.field1563++] << 15;
            if (this.field1563 >= this.field1556) {
                this.field1563 = this.field1556 - 1;
            }
            this.field1562 = (int) ((double) this.field1557[this.field1563] / 65536.0D * (double) arg0);
            if (this.field1562 > this.field1566) {
                this.field1564 = ((this.field1558[this.field1563] << 15) - this.field1565) / (this.field1562 - this.field1566);
            }
        }
        this.field1565 += this.field1564;
        if (arg1 <= 0) {
            return this.field1552;
        } else {
            this.field1566++;
            return this.field1565 - this.field1564 >> 15;
        }
    }
}
