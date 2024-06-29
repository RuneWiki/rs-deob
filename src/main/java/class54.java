import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!SHSBXUIJ")
public class class54 {

    @OriginalMember(owner = "client!SHSBXUIJ", name = "a", descriptor = "I")
    private int field1552;

    @OriginalMember(owner = "client!SHSBXUIJ", name = "b", descriptor = "I")
    private int field1553;

    @OriginalMember(owner = "client!SHSBXUIJ", name = "e", descriptor = "I")
    public int field1556;

    @OriginalMember(owner = "client!SHSBXUIJ", name = "f", descriptor = "I")
    public int field1557;

    @OriginalMember(owner = "client!SHSBXUIJ", name = "g", descriptor = "I")
    public int field1558;

    @OriginalMember(owner = "client!SHSBXUIJ", name = "h", descriptor = "I")
    private int field1559;

    @OriginalMember(owner = "client!SHSBXUIJ", name = "i", descriptor = "I")
    private int field1560;

    @OriginalMember(owner = "client!SHSBXUIJ", name = "j", descriptor = "I")
    private int field1561;

    @OriginalMember(owner = "client!SHSBXUIJ", name = "k", descriptor = "I")
    private int field1562;

    @OriginalMember(owner = "client!SHSBXUIJ", name = "l", descriptor = "I")
    private int field1563;

    @OriginalMember(owner = "client!SHSBXUIJ", name = "m", descriptor = "I")
    public static int field1564;

    @OriginalMember(owner = "client!SHSBXUIJ", name = "c", descriptor = "[I")
    private int[] field1554;

    @OriginalMember(owner = "client!SHSBXUIJ", name = "d", descriptor = "[I")
    private int[] field1555;

    @OriginalMember(owner = "client!SHSBXUIJ", name = "a", descriptor = "(ILRGCGKKUR;)V")
    public final void method493(int arg0, class53 arg1) {
        this.field1558 = arg1.method455();
        this.field1556 = arg1.method460();
        if (arg0 < 5 || arg0 > 5) {
            throw new NullPointerException();
        }
        this.field1557 = arg1.method460();
        this.method494(0, arg1);
    }

    @OriginalMember(owner = "client!SHSBXUIJ", name = "b", descriptor = "(ILRGCGKKUR;)V")
    public final void method494(int arg0, class53 arg1) {
        this.field1553 = arg1.method455();
        this.field1554 = new int[this.field1553];
        this.field1555 = new int[this.field1553];
        for (int var3 = 0; var3 < this.field1553; var3++) {
            this.field1554[var3] = arg1.method457();
            this.field1555[var3] = arg1.method457();
        }
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!SHSBXUIJ", name = "a", descriptor = "(I)V")
    public final void method495(int arg0) {
        while (arg0 >= 0) {
            this.field1552 = 406;
        }
        this.field1559 = 0;
        this.field1560 = 0;
        this.field1561 = 0;
        this.field1562 = 0;
        this.field1563 = 0;
    }

    @OriginalMember(owner = "client!SHSBXUIJ", name = "a", descriptor = "(II)I")
    public final int method496(int arg0, int arg1) {
        if (this.field1563 >= this.field1559) {
            this.field1562 = this.field1555[this.field1560++] << 15;
            if (this.field1560 >= this.field1553) {
                this.field1560 = this.field1553 - 1;
            }
            this.field1559 = (int) ((double) this.field1554[this.field1560] / 65536.0D * (double) arg0);
            if (this.field1559 > this.field1563) {
                this.field1561 = ((this.field1555[this.field1560] << 15) - this.field1562) / (this.field1559 - this.field1563);
            }
        }
        this.field1562 += this.field1561;
        this.field1563++;
        if (arg1 != -16419) {
            this.field1552 = -395;
        }
        return this.field1562 - this.field1561 >> 15;
    }
}
