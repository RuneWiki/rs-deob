import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ZBHVITZX")
public class class67 {

    @OriginalMember(owner = "client!ZBHVITZX", name = "b", descriptor = "I")
    private int field1621 = 4;

    @OriginalMember(owner = "client!ZBHVITZX", name = "a", descriptor = "I")
    private int field1620;

    @OriginalMember(owner = "client!ZBHVITZX", name = "c", descriptor = "I")
    private int field1622;

    @OriginalMember(owner = "client!ZBHVITZX", name = "f", descriptor = "I")
    public int field1625;

    @OriginalMember(owner = "client!ZBHVITZX", name = "g", descriptor = "I")
    public int field1626;

    @OriginalMember(owner = "client!ZBHVITZX", name = "h", descriptor = "I")
    public int field1627;

    @OriginalMember(owner = "client!ZBHVITZX", name = "i", descriptor = "I")
    private int field1628;

    @OriginalMember(owner = "client!ZBHVITZX", name = "j", descriptor = "I")
    private int field1629;

    @OriginalMember(owner = "client!ZBHVITZX", name = "k", descriptor = "I")
    private int field1630;

    @OriginalMember(owner = "client!ZBHVITZX", name = "l", descriptor = "I")
    private int field1631;

    @OriginalMember(owner = "client!ZBHVITZX", name = "m", descriptor = "I")
    private int field1632;

    @OriginalMember(owner = "client!ZBHVITZX", name = "n", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!ZBHVITZX", name = "d", descriptor = "[I")
    private int[] field1623;

    @OriginalMember(owner = "client!ZBHVITZX", name = "e", descriptor = "[I")
    private int[] field1624;

    @OriginalMember(owner = "client!ZBHVITZX", name = "a", descriptor = "(LLBBVYYXO;B)V")
    public final void method577(class32 arg0, byte arg1) {
        this.field1627 = arg0.method369();
        this.field1625 = arg0.method374();
        this.field1626 = arg0.method374();
        if (arg1 != 59) {
            this.field1621 = -65;
        }
        this.method578(arg0, this.field1620);
    }

    @OriginalMember(owner = "client!ZBHVITZX", name = "a", descriptor = "(LLBBVYYXO;I)V")
    public final void method578(class32 arg0, int arg1) {
        this.field1622 = arg0.method369();
        this.field1623 = new int[this.field1622];
        if (arg1 != 0) {
            return;
        }
        this.field1624 = new int[this.field1622];
        for (int var3 = 0; var3 < this.field1622; var3++) {
            this.field1623[var3] = arg0.method371();
            this.field1624[var3] = arg0.method371();
        }
    }

    @OriginalMember(owner = "client!ZBHVITZX", name = "a", descriptor = "(B)V")
    public final void method579(byte arg0) {
        this.field1628 = 0;
        this.field1629 = 0;
        this.field1630 = 0;
        if (arg0 == 2) {
            this.field1631 = 0;
            this.field1632 = 0;
        }
    }

    @OriginalMember(owner = "client!ZBHVITZX", name = "a", descriptor = "(II)I")
    public final int method580(int arg0, int arg1) {
        if (this.field1632 >= this.field1628) {
            this.field1631 = this.field1624[this.field1629++] << 15;
            if (this.field1629 >= this.field1622) {
                this.field1629 = this.field1622 - 1;
            }
            this.field1628 = (int) ((double) this.field1623[this.field1629] / 65536.0D * (double) arg0);
            if (this.field1628 > this.field1632) {
                this.field1630 = ((this.field1624[this.field1629] << 15) - this.field1631) / (this.field1628 - this.field1632);
            }
        }
        this.field1631 += this.field1630;
        if (arg1 >= 0) {
            return this.field1620;
        } else {
            this.field1632++;
            return this.field1631 - this.field1630 >> 15;
        }
    }
}
