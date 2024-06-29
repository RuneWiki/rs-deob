import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class87 {

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
    private int field1859 = 2;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "[I")
    private int[] field1860 = new int[2];

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "[I")
    private int[] field1857 = new int[2];

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
    public int field1855;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
    public int field1856;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
    public int field1858;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "I")
    private int field1861;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "I")
    private int field1862;

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
    private int field1863;

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "I")
    private int field1864;

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "I")
    private int field1865;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)I")
    public final int method578(int arg0) {
        if (this.field1865 >= this.field1861) {
            this.field1863 = this.field1857[this.field1862++] << 15;
            if (this.field1862 >= this.field1859) {
                this.field1862 = this.field1859 - 1;
            }
            this.field1861 = (int) ((double) this.field1860[this.field1862] / 65536.0D * (double) arg0);
            if (this.field1861 > this.field1865) {
                this.field1864 = ((this.field1857[this.field1862] << 15) - this.field1863) / (this.field1861 - this.field1865);
            }
        }
        this.field1863 += this.field1864;
        this.field1865++;
        return this.field1863 - this.field1864 >> 15;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "()V")
    public final void method579() {
        this.field1861 = 0;
        this.field1862 = 0;
        this.field1864 = 0;
        this.field1863 = 0;
        this.field1865 = 0;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lva;)V")
    public final void method580(class189 arg0) {
        this.field1859 = arg0.method1202(125);
        this.field1860 = new int[this.field1859];
        this.field1857 = new int[this.field1859];
        for (int var2 = 0; var2 < this.field1859; var2++) {
            this.field1860[var2] = arg0.method1197(-1);
            this.field1857[var2] = arg0.method1197(-1);
        }
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(Lva;)V")
    public final void method581(class189 arg0) {
        this.field1855 = arg0.method1202(-28);
        this.field1856 = arg0.method1190(-4);
        this.field1858 = arg0.method1190(-4);
        this.method580(arg0);
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "()V")
    public class87() {
        this.field1860[0] = 0;
        this.field1860[1] = 65535;
        this.field1857[0] = 0;
        this.field1857[1] = 65535;
    }
}
