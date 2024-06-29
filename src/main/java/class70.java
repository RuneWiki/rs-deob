import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!XJHYQMBH")
public class class70 {

    @OriginalMember(owner = "client!XJHYQMBH", name = "a", descriptor = "Z")
    private boolean field1683 = true;

    @OriginalMember(owner = "client!XJHYQMBH", name = "b", descriptor = "I")
    private int field1684;

    @OriginalMember(owner = "client!XJHYQMBH", name = "e", descriptor = "I")
    public int field1687;

    @OriginalMember(owner = "client!XJHYQMBH", name = "f", descriptor = "I")
    public int field1688;

    @OriginalMember(owner = "client!XJHYQMBH", name = "g", descriptor = "I")
    public int field1689;

    @OriginalMember(owner = "client!XJHYQMBH", name = "h", descriptor = "I")
    private int field1690;

    @OriginalMember(owner = "client!XJHYQMBH", name = "i", descriptor = "I")
    private int field1691;

    @OriginalMember(owner = "client!XJHYQMBH", name = "j", descriptor = "I")
    private int field1692;

    @OriginalMember(owner = "client!XJHYQMBH", name = "k", descriptor = "I")
    private int field1693;

    @OriginalMember(owner = "client!XJHYQMBH", name = "l", descriptor = "I")
    private int field1694;

    @OriginalMember(owner = "client!XJHYQMBH", name = "m", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!XJHYQMBH", name = "c", descriptor = "[I")
    private int[] field1685;

    @OriginalMember(owner = "client!XJHYQMBH", name = "d", descriptor = "[I")
    private int[] field1686;

    @OriginalMember(owner = "client!XJHYQMBH", name = "a", descriptor = "(ILSVWJKJVI;)V")
    public final void method590(int arg0, class52 arg1) {
        this.field1689 = arg1.method461();
        this.field1687 = arg1.method466();
        this.field1688 = arg1.method466();
        if (arg0 != -13096) {
            throw new NullPointerException();
        }
        this.method591(arg1, false);
    }

    @OriginalMember(owner = "client!XJHYQMBH", name = "a", descriptor = "(LSVWJKJVI;Z)V")
    public final void method591(class52 arg0, boolean arg1) {
        this.field1684 = arg0.method461();
        this.field1685 = new int[this.field1684];
        this.field1686 = new int[this.field1684];
        for (int var3 = 0; var3 < this.field1684; var3++) {
            this.field1685[var3] = arg0.method463();
            this.field1686[var3] = arg0.method463();
        }
        if (arg1) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "client!XJHYQMBH", name = "a", descriptor = "(I)V")
    public final void method592(int arg0) {
        this.field1690 = 0;
        if (arg0 > 0) {
            this.field1691 = 0;
            this.field1692 = 0;
            this.field1693 = 0;
            this.field1694 = 0;
        }
    }

    @OriginalMember(owner = "client!XJHYQMBH", name = "a", descriptor = "(BI)I")
    public final int method593(byte arg0, int arg1) {
        if (arg0 != 52) {
            this.field1683 = !this.field1683;
        }
        if (this.field1694 >= this.field1690) {
            this.field1693 = this.field1686[this.field1691++] << 15;
            if (this.field1691 >= this.field1684) {
                this.field1691 = this.field1684 - 1;
            }
            this.field1690 = (int) ((double) this.field1685[this.field1691] / 65536.0D * (double) arg1);
            if (this.field1690 > this.field1694) {
                this.field1692 = ((this.field1686[this.field1691] << 15) - this.field1693) / (this.field1690 - this.field1694);
            }
        }
        this.field1693 += this.field1692;
        this.field1694++;
        int var10000 = this.field1693 - this.field1692 >> 15;
        if (class31.field984) {
        }
        return var10000;
    }
}
