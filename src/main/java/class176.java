import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ta")
public class class176 {

    @OriginalMember(owner = "ta", name = "f", descriptor = "I")
    private int field3326 = 2;

    @OriginalMember(owner = "ta", name = "d", descriptor = "[I")
    private int[] field3324 = new int[2];

    @OriginalMember(owner = "ta", name = "b", descriptor = "[I")
    private int[] field3322 = new int[2];

    @OriginalMember(owner = "ta", name = "a", descriptor = "I")
    public int field3321;

    @OriginalMember(owner = "ta", name = "c", descriptor = "I")
    public int field3323;

    @OriginalMember(owner = "ta", name = "e", descriptor = "I")
    public int field3325;

    @OriginalMember(owner = "ta", name = "g", descriptor = "I")
    private int field3327;

    @OriginalMember(owner = "ta", name = "h", descriptor = "I")
    private int field3328;

    @OriginalMember(owner = "ta", name = "i", descriptor = "I")
    private int field3329;

    @OriginalMember(owner = "ta", name = "j", descriptor = "I")
    private int field3330;

    @OriginalMember(owner = "ta", name = "k", descriptor = "I")
    private int field3331;

    @OriginalMember(owner = "ta", name = "a", descriptor = "(I)I")
    public final int method1203(int arg0) {
        if (this.field3331 >= this.field3328) {
            this.field3329 = this.field3322[this.field3327++] << 15;
            if (this.field3327 >= this.field3326) {
                this.field3327 = this.field3326 - 1;
            }
            this.field3328 = (int) ((double) this.field3324[this.field3327] / 65536.0D * (double) arg0);
            if (this.field3328 > this.field3331) {
                this.field3330 = ((this.field3322[this.field3327] << 15) - this.field3329) / (this.field3328 - this.field3331);
            }
        }
        this.field3329 += this.field3330;
        this.field3331++;
        return this.field3329 - this.field3330 >> 15;
    }

    @OriginalMember(owner = "ta", name = "a", descriptor = "()V")
    public final void method1204() {
        this.field3328 = 0;
        this.field3327 = 0;
        this.field3330 = 0;
        this.field3329 = 0;
        this.field3331 = 0;
    }

    @OriginalMember(owner = "ta", name = "a", descriptor = "(Lja;)V")
    public final void method1205(class86 arg0) {
        this.field3326 = arg0.method598((byte) 118);
        this.field3324 = new int[this.field3326];
        this.field3322 = new int[this.field3326];
        for (int var2 = 0; var2 < this.field3326; var2++) {
            this.field3324[var2] = arg0.method569(true);
            this.field3322[var2] = arg0.method569(true);
        }
    }

    @OriginalMember(owner = "ta", name = "b", descriptor = "(Lja;)V")
    public final void method1206(class86 arg0) {
        this.field3323 = arg0.method598((byte) 122);
        this.field3325 = arg0.method582(15);
        this.field3321 = arg0.method582(15);
        this.method1205(arg0);
    }

    @OriginalMember(owner = "ta", name = "<init>", descriptor = "()V")
    public class176() {
        this.field3324[0] = 0;
        this.field3324[1] = 65535;
        this.field3322[0] = 0;
        this.field3322[1] = 65535;
    }
}
