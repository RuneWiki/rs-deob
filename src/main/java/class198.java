import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class198 {

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
    private int field3847 = 2;

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "[I")
    private int[] field3850 = new int[2];

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "[I")
    private int[] field3845 = new int[2];

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
    public int field3846;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "I")
    public int field3848;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
    public int field3849;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "I")
    private int field3851;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "I")
    private int field3852;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "I")
    private int field3853;

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "I")
    private int field3854;

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "I")
    private int field3855;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lrd;)V")
    public final void method1264(class158 arg0) {
        this.field3847 = arg0.method1054(128);
        this.field3850 = new int[this.field3847];
        this.field3845 = new int[this.field3847];
        for (int var2 = 0; var2 < this.field3847; var2++) {
            this.field3850[var2] = arg0.method1071(28101);
            this.field3845[var2] = arg0.method1071(28101);
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(Lrd;)V")
    public final void method1265(class158 arg0) {
        this.field3848 = arg0.method1054(128);
        this.field3849 = arg0.method1076(24277);
        this.field3846 = arg0.method1076(24277);
        this.method1264(arg0);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "()V")
    public final void method1266() {
        this.field3851 = 0;
        this.field3852 = 0;
        this.field3853 = 0;
        this.field3855 = 0;
        this.field3854 = 0;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)I")
    public final int method1267(int arg0) {
        if (this.field3854 >= this.field3851) {
            this.field3855 = this.field3845[this.field3852++] << 15;
            if (this.field3852 >= this.field3847) {
                this.field3852 = this.field3847 - 1;
            }
            this.field3851 = (int) ((double) this.field3850[this.field3852] / 65536.0D * (double) arg0);
            if (this.field3851 > this.field3854) {
                this.field3853 = ((this.field3845[this.field3852] << 15) - this.field3855) / (this.field3851 - this.field3854);
            }
        }
        this.field3855 += this.field3853;
        this.field3854++;
        return this.field3855 - this.field3853 >> 15;
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "()V")
    public class198() {
        this.field3850[0] = 0;
        this.field3850[1] = 65535;
        this.field3845[0] = 0;
        this.field3845[1] = 65535;
    }
}
