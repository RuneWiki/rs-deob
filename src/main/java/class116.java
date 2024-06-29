import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class116 {

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
    private int field1680 = 2;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "[I")
    private int[] field1681 = new int[2];

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "[I")
    private int[] field1682 = new int[2];

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "I")
    public int field1683;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "I")
    public int field1684;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
    public int field1685;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "I")
    private int field1686;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "I")
    private int field1687;

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "I")
    private int field1688;

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "I")
    private int field1689;

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "I")
    private int field1690;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)I")
    public final int method765(int arg0) {
        if (this.field1688 >= this.field1690) {
            this.field1687 = this.field1682[this.field1686++] << 15;
            if (this.field1686 >= this.field1680) {
                this.field1686 = this.field1680 - 1;
            }
            this.field1690 = (int) ((double) this.field1681[this.field1686] / 65536.0D * (double) arg0);
            if (this.field1690 > this.field1688) {
                this.field1689 = ((this.field1682[this.field1686] << 15) - this.field1687) / (this.field1690 - this.field1688);
            }
        }
        this.field1687 += this.field1689;
        this.field1688++;
        return this.field1687 - this.field1689 >> 15;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lim;)V")
    public final void method766(class170 arg0) {
        this.field1680 = arg0.method1218(-63);
        this.field1681 = new int[this.field1680];
        this.field1682 = new int[this.field1680];
        for (int var2 = 0; var2 < this.field1680; var2++) {
            this.field1681[var2] = arg0.method1186((byte) -74);
            this.field1682[var2] = arg0.method1186((byte) -102);
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(Lim;)V")
    public final void method767(class170 arg0) {
        this.field1684 = arg0.method1218(109);
        this.field1683 = arg0.method1190(6345);
        this.field1685 = arg0.method1190(6345);
        this.method766(arg0);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "()V")
    public final void method768() {
        this.field1690 = 0;
        this.field1686 = 0;
        this.field1689 = 0;
        this.field1687 = 0;
        this.field1688 = 0;
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "()V")
    public class116() {
        this.field1681[0] = 0;
        this.field1681[1] = 65535;
        this.field1682[0] = 0;
        this.field1682[1] = 65535;
    }
}
