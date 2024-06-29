import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class150 {

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
    private int field3276 = 2;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "[I")
    private int[] field3275 = new int[2];

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "[I")
    private int[] field3272 = new int[2];

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    public int field3273;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
    public int field3274;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
    public int field3277;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "I")
    private int field3278;

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "I")
    private int field3279;

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "I")
    private int field3280;

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "I")
    private int field3281;

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "I")
    private int field3282;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)I")
    public final int method1108(int arg0) {
        if (this.field3281 >= this.field3278) {
            this.field3280 = this.field3272[this.field3282++] << 15;
            if (this.field3282 >= this.field3276) {
                this.field3282 = this.field3276 - 1;
            }
            this.field3278 = (int) ((double) this.field3275[this.field3282] / 65536.0D * (double) arg0);
            if (this.field3278 > this.field3281) {
                this.field3279 = ((this.field3272[this.field3282] << 15) - this.field3280) / (this.field3278 - this.field3281);
            }
        }
        this.field3280 += this.field3279;
        this.field3281++;
        return this.field3280 - this.field3279 >> 15;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "()V")
    public final void method1109() {
        this.field3278 = 0;
        this.field3282 = 0;
        this.field3279 = 0;
        this.field3280 = 0;
        this.field3281 = 0;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lwd;)V")
    public final void method1110(class157 arg0) {
        this.field3277 = arg0.method1194(false);
        this.field3273 = arg0.method1175((byte) -111);
        this.field3274 = arg0.method1175((byte) -126);
        this.method1111(arg0);
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(Lwd;)V")
    public final void method1111(class157 arg0) {
        this.field3276 = arg0.method1194(false);
        this.field3275 = new int[this.field3276];
        this.field3272 = new int[this.field3276];
        for (int var2 = 0; var2 < this.field3276; var2++) {
            this.field3275[var2] = arg0.method1161((byte) 60);
            this.field3272[var2] = arg0.method1161((byte) 60);
        }
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V")
    public class150() {
        this.field3275[0] = 0;
        this.field3275[1] = 65535;
        this.field3272[0] = 0;
        this.field3272[1] = 65535;
    }
}
