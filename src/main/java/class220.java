import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class220 {

    @OriginalMember(owner = "client!cq", name = "f", descriptor = "I")
    private int field3272 = 2;

    @OriginalMember(owner = "client!cq", name = "d", descriptor = "[I")
    private int[] field3270 = new int[2];

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "[I")
    private int[] field3268 = new int[2];

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "I")
    public int field3267;

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "I")
    public int field3269;

    @OriginalMember(owner = "client!cq", name = "e", descriptor = "I")
    public int field3271;

    @OriginalMember(owner = "client!cq", name = "g", descriptor = "I")
    private int field3273;

    @OriginalMember(owner = "client!cq", name = "h", descriptor = "I")
    private int field3274;

    @OriginalMember(owner = "client!cq", name = "i", descriptor = "I")
    private int field3275;

    @OriginalMember(owner = "client!cq", name = "j", descriptor = "I")
    private int field3276;

    @OriginalMember(owner = "client!cq", name = "k", descriptor = "I")
    private int field3277;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lsl;)V", line = 7)
    public final void method1546(class479 arg0) {
        this.field3272 = arg0.method2886(true);
        this.field3270 = new int[this.field3272];
        this.field3268 = new int[this.field3272];
        for (int var2 = 0; var2 < this.field3272; var2++) {
            this.field3270[var2] = arg0.method2882(-1);
            this.field3268[var2] = arg0.method2882(-1);
        }
    }

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(Lsl;)V", line = 23)
    public final void method1547(class479 arg0) {
        this.field3267 = arg0.method2886(true);
        this.field3271 = arg0.method2868(-74);
        this.field3269 = arg0.method2868(-120);
        this.method1546(arg0);
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)I", line = 30)
    public final int method1548(int arg0) {
        if (this.field3273 >= this.field3277) {
            this.field3276 = this.field3268[this.field3274++] << 15;
            if (this.field3274 >= this.field3272) {
                this.field3274 = this.field3272 - 1;
            }
            this.field3277 = (int) ((double) this.field3270[this.field3274] / 65536.0D * (double) arg0);
            if (this.field3277 > this.field3273) {
                this.field3275 = ((this.field3268[this.field3274] << 15) - this.field3276) / (this.field3277 - this.field3273);
            }
        }
        this.field3276 += this.field3275;
        this.field3273++;
        return this.field3276 - this.field3275 >> 15;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "()V", line = 50)
    public final void method1549() {
        this.field3277 = 0;
        this.field3274 = 0;
        this.field3275 = 0;
        this.field3276 = 0;
        this.field3273 = 0;
    }

    @OriginalMember(owner = "client!cq", name = "<init>", descriptor = "()V", line = 56)
    public class220() {
        this.field3270[0] = 0;
        this.field3270[1] = 65535;
        this.field3268[0] = 0;
        this.field3268[1] = 65535;
    }
}
