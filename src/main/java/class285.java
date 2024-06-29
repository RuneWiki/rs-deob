import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class285 {

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "I")
    private int field3865 = 2;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "[I")
    private int[] field3862 = new int[2];

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "[I")
    private int[] field3867 = new int[2];

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
    public int field3863;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
    public int field3864;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
    public int field3866;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "I")
    private int field3868;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
    private int field3869;

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
    private int field3870;

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "I")
    private int field3871;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "I")
    private int field3872;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)I", line = 4)
    public final int method1614(int arg0) {
        if (this.field3871 >= this.field3868) {
            this.field3870 = this.field3867[this.field3872++] << 15;
            if (this.field3872 >= this.field3865) {
                this.field3872 = this.field3865 - 1;
            }
            this.field3868 = (int) ((double) this.field3862[this.field3872] / 65536.0D * (double) arg0);
            if (this.field3868 > this.field3871) {
                this.field3869 = ((this.field3867[this.field3872] << 15) - this.field3870) / (this.field3868 - this.field3871);
            }
        }
        this.field3870 += this.field3869;
        this.field3871++;
        return this.field3870 - this.field3869 >> 15;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lbt;)V", line = 21)
    public final void method1615(class32 arg0) {
        this.field3863 = arg0.method201((byte) -109);
        this.field3866 = arg0.method222(1024);
        this.field3864 = arg0.method222(1024);
        this.method1617(arg0);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "()V", line = 30)
    public final void method1616() {
        this.field3868 = 0;
        this.field3872 = 0;
        this.field3869 = 0;
        this.field3870 = 0;
        this.field3871 = 0;
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(Lbt;)V", line = 40)
    public final void method1617(class32 arg0) {
        this.field3865 = arg0.method201((byte) -115);
        this.field3862 = new int[this.field3865];
        this.field3867 = new int[this.field3865];
        for (int var2 = 0; var2 < this.field3865; var2++) {
            this.field3862[var2] = arg0.method215((byte) 112);
            this.field3867[var2] = arg0.method215((byte) 120);
        }
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V", line = 56)
    public class285() {
        this.field3862[0] = 0;
        this.field3862[1] = 65535;
        this.field3867[0] = 0;
        this.field3867[1] = 65535;
    }
}
