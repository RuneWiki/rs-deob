import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class217 {

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "I")
    private int field3318 = 2;

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "[I")
    private int[] field3323 = new int[2];

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "[I")
    private int[] field3322 = new int[2];

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "I")
    public int field3319;

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "I")
    public int field3320;

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "I")
    public int field3321;

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "I")
    private int field3324;

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "I")
    private int field3325;

    @OriginalMember(owner = "client!ll", name = "i", descriptor = "I")
    private int field3326;

    @OriginalMember(owner = "client!ll", name = "j", descriptor = "I")
    private int field3327;

    @OriginalMember(owner = "client!ll", name = "k", descriptor = "I")
    private int field3328;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lha;)V")
    public final void method1496(class31 arg0) {
        this.field3320 = arg0.method265(-122);
        this.field3319 = arg0.method300((byte) -30);
        this.field3321 = arg0.method300((byte) -30);
        this.method1498(arg0);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)I")
    public final int method1497(int arg0) {
        if (this.field3328 >= this.field3327) {
            this.field3324 = this.field3322[this.field3325++] << 15;
            if (this.field3325 >= this.field3318) {
                this.field3325 = this.field3318 - 1;
            }
            this.field3327 = (int) ((double) this.field3323[this.field3325] / 65536.0D * (double) arg0);
            if (this.field3327 > this.field3328) {
                this.field3326 = ((this.field3322[this.field3325] << 15) - this.field3324) / (this.field3327 - this.field3328);
            }
        }
        this.field3324 += this.field3326;
        this.field3328++;
        return this.field3324 - this.field3326 >> 15;
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(Lha;)V")
    public final void method1498(class31 arg0) {
        this.field3318 = arg0.method265(-106);
        this.field3323 = new int[this.field3318];
        this.field3322 = new int[this.field3318];
        for (int var2 = 0; var2 < this.field3318; var2++) {
            this.field3323[var2] = arg0.method260((byte) -67);
            this.field3322[var2] = arg0.method260((byte) -67);
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "()V")
    public final void method1499() {
        this.field3327 = 0;
        this.field3325 = 0;
        this.field3326 = 0;
        this.field3324 = 0;
        this.field3328 = 0;
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "()V")
    public class217() {
        this.field3323[0] = 0;
        this.field3323[1] = 65535;
        this.field3322[0] = 0;
        this.field3322[1] = 65535;
    }
}
