import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class193 {

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "I")
    private int field3054 = 2;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "[I")
    private int[] field3051 = new int[2];

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "[I")
    private int[] field3050 = new int[2];

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
    public int field3049;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "I")
    public int field3052;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "I")
    public int field3053;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "I")
    private int field3055;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "I")
    private int field3056;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "I")
    private int field3057;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "I")
    private int field3058;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "I")
    private int field3059;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lf;)V")
    public final void method1296(class37 arg0) {
        this.field3054 = arg0.method333((byte) -59);
        this.field3051 = new int[this.field3054];
        this.field3050 = new int[this.field3054];
        for (int var2 = 0; var2 < this.field3054; var2++) {
            this.field3051[var2] = arg0.method293(-100);
            this.field3050[var2] = arg0.method293(123);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)I")
    public final int method1297(int arg0) {
        if (this.field3056 >= this.field3058) {
            this.field3055 = this.field3050[this.field3059++] << 15;
            if (this.field3059 >= this.field3054) {
                this.field3059 = this.field3054 - 1;
            }
            this.field3058 = (int) ((double) this.field3051[this.field3059] / 65536.0D * (double) arg0);
            if (this.field3058 > this.field3056) {
                this.field3057 = ((this.field3050[this.field3059] << 15) - this.field3055) / (this.field3058 - this.field3056);
            }
        }
        this.field3055 += this.field3057;
        this.field3056++;
        return this.field3055 - this.field3057 >> 15;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(Lf;)V")
    public final void method1298(class37 arg0) {
        this.field3053 = arg0.method333((byte) -59);
        this.field3049 = arg0.method307(-109);
        this.field3052 = arg0.method307(-120);
        this.method1296(arg0);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "()V")
    public final void method1299() {
        this.field3058 = 0;
        this.field3059 = 0;
        this.field3057 = 0;
        this.field3055 = 0;
        this.field3056 = 0;
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "()V")
    public class193() {
        this.field3051[0] = 0;
        this.field3051[1] = 65535;
        this.field3050[0] = 0;
        this.field3050[1] = 65535;
    }
}
