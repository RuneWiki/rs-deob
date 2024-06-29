import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class175 {

    @OriginalMember(owner = "client!od", name = "f", descriptor = "I")
    private int field3056 = 2;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "[I")
    private int[] field3053 = new int[2];

    @OriginalMember(owner = "client!od", name = "b", descriptor = "[I")
    private int[] field3052 = new int[2];

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    public int field3051;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    public int field3054;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "I")
    public int field3055;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "I")
    private int field3057;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "I")
    private int field3058;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "I")
    private int field3059;

    @OriginalMember(owner = "client!od", name = "j", descriptor = "I")
    private int field3060;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "I")
    private int field3061;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "()V")
    public final void method1222() {
        this.field3060 = 0;
        this.field3057 = 0;
        this.field3059 = 0;
        this.field3061 = 0;
        this.field3058 = 0;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Llj;)V")
    public final void method1223(class216 arg0) {
        this.field3056 = arg0.method1446(5350);
        this.field3053 = new int[this.field3056];
        this.field3052 = new int[this.field3056];
        for (int var2 = 0; var2 < this.field3056; var2++) {
            this.field3053[var2] = arg0.method1487(110);
            this.field3052[var2] = arg0.method1487(101);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)I")
    public final int method1224(int arg0) {
        if (this.field3058 >= this.field3060) {
            this.field3061 = this.field3052[this.field3057++] << 15;
            if (this.field3057 >= this.field3056) {
                this.field3057 = this.field3056 - 1;
            }
            this.field3060 = (int) ((double) this.field3053[this.field3057] / 65536.0D * (double) arg0);
            if (this.field3060 > this.field3058) {
                this.field3059 = ((this.field3052[this.field3057] << 15) - this.field3061) / (this.field3060 - this.field3058);
            }
        }
        this.field3061 += this.field3059;
        this.field3058++;
        return this.field3061 - this.field3059 >> 15;
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V")
    public class175() {
        this.field3053[0] = 0;
        this.field3053[1] = 65535;
        this.field3052[0] = 0;
        this.field3052[1] = 65535;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(Llj;)V")
    public final void method1225(class216 arg0) {
        this.field3055 = arg0.method1446(5350);
        this.field3054 = arg0.method1442(-1330139880);
        this.field3051 = arg0.method1442(-1330139880);
        this.method1223(arg0);
    }
}
