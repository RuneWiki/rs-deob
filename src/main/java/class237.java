import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class237 {

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    private int field3888 = 2;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "[I")
    private int[] field3886 = new int[2];

    @OriginalMember(owner = "client!i", name = "f", descriptor = "[I")
    private int[] field3889 = new int[2];

    @OriginalMember(owner = "client!i", name = "a", descriptor = "I")
    public int field3884;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    public int field3885;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "I")
    public int field3887;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "I")
    private int field3890;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "I")
    private int field3891;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "I")
    private int field3892;

    @OriginalMember(owner = "client!i", name = "j", descriptor = "I")
    private int field3893;

    @OriginalMember(owner = "client!i", name = "k", descriptor = "I")
    private int field3894;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "()V", line = 4)
    public final void method1678() {
        this.field3892 = 0;
        this.field3894 = 0;
        this.field3893 = 0;
        this.field3891 = 0;
        this.field3890 = 0;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)I", line = 12)
    public final int method1679(int arg0) {
        if (this.field3890 >= this.field3892) {
            this.field3891 = this.field3889[this.field3894++] << 15;
            if (this.field3894 >= this.field3888) {
                this.field3894 = this.field3888 - 1;
            }
            this.field3892 = (int) ((double) this.field3886[this.field3894] / 65536.0D * (double) arg0);
            if (this.field3892 > this.field3890) {
                this.field3893 = ((this.field3889[this.field3894] << 15) - this.field3891) / (this.field3892 - this.field3890);
            }
        }
        this.field3891 += this.field3893;
        this.field3890++;
        return this.field3891 - this.field3893 >> 15;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lpi;)V", line = 33)
    public final void method1680(class336 arg0) {
        this.field3884 = arg0.method2364(-9069);
        this.field3885 = arg0.method2338((byte) 113);
        this.field3887 = arg0.method2338((byte) 51);
        this.method1681(arg0);
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(Lpi;)V", line = 41)
    public final void method1681(class336 arg0) {
        this.field3888 = arg0.method2364(-9069);
        this.field3886 = new int[this.field3888];
        this.field3889 = new int[this.field3888];
        for (int var2 = 0; var2 < this.field3888; var2++) {
            this.field3886[var2] = arg0.method2339((byte) -46);
            this.field3889[var2] = arg0.method2339((byte) -46);
        }
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V", line = 56)
    public class237() {
        this.field3886[0] = 0;
        this.field3886[1] = 65535;
        this.field3889[0] = 0;
        this.field3889[1] = 65535;
    }
}
