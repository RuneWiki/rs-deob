import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class255 {

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
    private int field3930 = 2;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "[I")
    private int[] field3927 = new int[2];

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "[I")
    private int[] field3925 = new int[2];

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "I")
    public int field3926;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
    public int field3928;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
    public int field3929;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "I")
    private int field3931;

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "I")
    private int field3932;

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "I")
    private int field3933;

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "I")
    private int field3934;

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "I")
    private int field3935;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)I")
    public final int method1729(int arg0) {
        if (this.field3933 >= this.field3934) {
            this.field3935 = this.field3925[this.field3932++] << 15;
            if (this.field3932 >= this.field3930) {
                this.field3932 = this.field3930 - 1;
            }
            this.field3934 = (int) ((double) this.field3927[this.field3932] / 65536.0D * (double) arg0);
            if (this.field3934 > this.field3933) {
                this.field3931 = ((this.field3925[this.field3932] << 15) - this.field3935) / (this.field3934 - this.field3933);
            }
        }
        this.field3935 += this.field3931;
        this.field3933++;
        return this.field3935 - this.field3931 >> 15;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "()V")
    public final void method1730() {
        this.field3934 = 0;
        this.field3932 = 0;
        this.field3931 = 0;
        this.field3935 = 0;
        this.field3933 = 0;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lca;)V")
    public final void method1731(class54 arg0) {
        this.field3928 = arg0.method407(255);
        this.field3926 = arg0.method420((byte) -76);
        this.field3929 = arg0.method420((byte) -117);
        this.method1732(arg0);
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V")
    public class255() {
        this.field3927[0] = 0;
        this.field3927[1] = 65535;
        this.field3925[0] = 0;
        this.field3925[1] = 65535;
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(Lca;)V")
    public final void method1732(class54 arg0) {
        this.field3930 = arg0.method407(255);
        this.field3927 = new int[this.field3930];
        this.field3925 = new int[this.field3930];
        for (int var2 = 0; var2 < this.field3930; var2++) {
            this.field3927[var2] = arg0.method423(-113);
            this.field3925[var2] = arg0.method423(113);
        }
    }
}
