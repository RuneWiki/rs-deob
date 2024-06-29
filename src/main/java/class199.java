import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class199 {

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
    private int field3052 = 2;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "[I")
    private int[] field3049 = new int[2];

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "[I")
    private int[] field3047 = new int[2];

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    public int field3048;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
    public int field3050;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "I")
    public int field3051;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "I")
    private int field3053;

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "I")
    private int field3054;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
    private int field3055;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "I")
    private int field3056;

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
    private int field3057;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "()V", line = 3)
    public final void method1403() {
        this.field3056 = 0;
        this.field3053 = 0;
        this.field3055 = 0;
        this.field3054 = 0;
        this.field3057 = 0;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Laj;)V", line = 10)
    public final void method1404(class1 arg0) {
        this.field3052 = arg0.method15((byte) -29);
        this.field3049 = new int[this.field3052];
        this.field3047 = new int[this.field3052];
        for (int var2 = 0; var2 < this.field3052; var2++) {
            this.field3049[var2] = arg0.method56(19612);
            this.field3047[var2] = arg0.method56(19612);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)I", line = 30)
    public final int method1405(int arg0) {
        if (this.field3057 >= this.field3056) {
            this.field3054 = this.field3047[this.field3053++] << 15;
            if (this.field3053 >= this.field3052) {
                this.field3053 = this.field3052 - 1;
            }
            this.field3056 = (int) ((double) this.field3049[this.field3053] / 65536.0D * (double) arg0);
            if (this.field3056 > this.field3057) {
                this.field3055 = ((this.field3047[this.field3053] << 15) - this.field3054) / (this.field3056 - this.field3057);
            }
        }
        this.field3054 += this.field3055;
        this.field3057++;
        return this.field3054 - this.field3055 >> 15;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(Laj;)V", line = 49)
    public final void method1406(class1 arg0) {
        this.field3050 = arg0.method15((byte) -18);
        this.field3051 = arg0.method33(false);
        this.field3048 = arg0.method33(false);
        this.method1404(arg0);
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "()V", line = 56)
    public class199() {
        this.field3049[0] = 0;
        this.field3049[1] = 65535;
        this.field3047[0] = 0;
        this.field3047[1] = 65535;
    }
}
