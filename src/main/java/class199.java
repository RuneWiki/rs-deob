import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public class class199 {

    @OriginalMember(owner = "client!bv", name = "c", descriptor = "I")
    private int field2845 = 2;

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "[I")
    private int[] field2843 = new int[2];

    @OriginalMember(owner = "client!bv", name = "e", descriptor = "[I")
    private int[] field2847 = new int[2];

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "I")
    public int field2844;

    @OriginalMember(owner = "client!bv", name = "d", descriptor = "I")
    public int field2846;

    @OriginalMember(owner = "client!bv", name = "f", descriptor = "I")
    public int field2848;

    @OriginalMember(owner = "client!bv", name = "g", descriptor = "I")
    private int field2849;

    @OriginalMember(owner = "client!bv", name = "h", descriptor = "I")
    private int field2850;

    @OriginalMember(owner = "client!bv", name = "i", descriptor = "I")
    private int field2851;

    @OriginalMember(owner = "client!bv", name = "j", descriptor = "I")
    private int field2852;

    @OriginalMember(owner = "client!bv", name = "k", descriptor = "I")
    private int field2853;

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(I)I", line = 3)
    public final int method1229(int arg0) {
        if (this.field2851 >= this.field2850) {
            this.field2849 = this.field2847[this.field2852++] << 15;
            if (this.field2852 >= this.field2845) {
                this.field2852 = this.field2845 - 1;
            }
            this.field2850 = (int) ((double) this.field2843[this.field2852] / 65536.0D * (double) arg0);
            if (this.field2850 > this.field2851) {
                this.field2853 = ((this.field2847[this.field2852] << 15) - this.field2849) / (this.field2850 - this.field2851);
            }
        }
        this.field2849 += this.field2853;
        this.field2851++;
        return this.field2849 - this.field2853 >> 15;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Llh;)V", line = 20)
    public final void method1230(class365 arg0) {
        this.field2845 = arg0.method2099(255);
        this.field2843 = new int[this.field2845];
        this.field2847 = new int[this.field2845];
        for (int var2 = 0; var2 < this.field2845; var2++) {
            this.field2843[var2] = arg0.method2062((byte) 14);
            this.field2847[var2] = arg0.method2062((byte) 14);
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "()V", line = 39)
    public final void method1231() {
        this.field2850 = 0;
        this.field2852 = 0;
        this.field2853 = 0;
        this.field2849 = 0;
        this.field2851 = 0;
    }

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "(Llh;)V", line = 46)
    public final void method1232(class365 arg0) {
        this.field2848 = arg0.method2099(255);
        this.field2844 = arg0.method2056((byte) 70);
        this.field2846 = arg0.method2056((byte) 101);
        this.method1230(arg0);
    }

    @OriginalMember(owner = "client!bv", name = "<init>", descriptor = "()V", line = 56)
    public class199() {
        this.field2843[0] = 0;
        this.field2843[1] = 65535;
        this.field2847[0] = 0;
        this.field2847[1] = 65535;
    }
}
