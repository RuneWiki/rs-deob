import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class321 {

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
    private int field4880 = 2;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "[I")
    private int[] field4882 = new int[2];

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "[I")
    private int[] field4883 = new int[2];

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
    public int field4878;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
    public int field4879;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "I")
    public int field4881;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "I")
    private int field4884;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "I")
    private int field4885;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "I")
    private int field4886;

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "I")
    private int field4887;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "I")
    private int field4888;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)I", line = 3)
    public final int method2244(int arg0) {
        if (this.field4888 >= this.field4885) {
            this.field4886 = this.field4883[this.field4884++] << 15;
            if (this.field4884 >= this.field4880) {
                this.field4884 = this.field4880 - 1;
            }
            this.field4885 = (int) ((double) this.field4882[this.field4884] / 65536.0D * (double) arg0);
            if (this.field4885 > this.field4888) {
                this.field4887 = ((this.field4883[this.field4884] << 15) - this.field4886) / (this.field4885 - this.field4888);
            }
        }
        this.field4886 += this.field4887;
        this.field4888++;
        return this.field4886 - this.field4887 >> 15;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lcg;)V", line = 23)
    public final void method2245(class316 arg0) {
        this.field4879 = arg0.method2219(16448);
        this.field4881 = arg0.method2172((byte) 71);
        this.field4878 = arg0.method2172((byte) 71);
        this.method2247(arg0);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "()V", line = 32)
    public final void method2246() {
        this.field4885 = 0;
        this.field4884 = 0;
        this.field4887 = 0;
        this.field4886 = 0;
        this.field4888 = 0;
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(Lcg;)V", line = 40)
    public final void method2247(class316 arg0) {
        this.field4880 = arg0.method2219(16448);
        this.field4882 = new int[this.field4880];
        this.field4883 = new int[this.field4880];
        for (int var2 = 0; var2 < this.field4880; var2++) {
            this.field4882[var2] = arg0.method2220((byte) 51);
            this.field4883[var2] = arg0.method2220((byte) 81);
        }
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "()V", line = 56)
    public class321() {
        this.field4882[0] = 0;
        this.field4882[1] = 65535;
        this.field4883[0] = 0;
        this.field4883[1] = 65535;
    }
}
