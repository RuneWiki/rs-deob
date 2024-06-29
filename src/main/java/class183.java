import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class183 {

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    private int field3466 = 2;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "[I")
    private int[] field3469 = new int[2];

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "[I")
    private int[] field3465 = new int[2];

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
    public int field3464;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
    public int field3467;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
    public int field3468;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
    private int field3470;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
    private int field3471;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "I")
    private int field3472;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "I")
    private int field3473;

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "I")
    private int field3474;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lff;)V")
    public final void method1235(class53 arg0) {
        this.field3466 = arg0.method400(255);
        this.field3469 = new int[this.field3466];
        this.field3465 = new int[this.field3466];
        for (int var2 = 0; var2 < this.field3466; var2++) {
            this.field3469[var2] = arg0.method405(2);
            this.field3465[var2] = arg0.method405(2);
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(Lff;)V")
    public final void method1236(class53 arg0) {
        this.field3467 = arg0.method400(255);
        this.field3468 = arg0.method419(-4);
        this.field3464 = arg0.method419(-4);
        this.method1235(arg0);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "()V")
    public final void method1237() {
        this.field3472 = 0;
        this.field3471 = 0;
        this.field3470 = 0;
        this.field3473 = 0;
        this.field3474 = 0;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)I")
    public final int method1238(int arg0) {
        if (this.field3474 >= this.field3472) {
            this.field3473 = this.field3465[this.field3471++] << 15;
            if (this.field3471 >= this.field3466) {
                this.field3471 = this.field3466 - 1;
            }
            this.field3472 = (int) ((double) this.field3469[this.field3471] / 65536.0D * (double) arg0);
            if (this.field3472 > this.field3474) {
                this.field3470 = ((this.field3465[this.field3471] << 15) - this.field3473) / (this.field3472 - this.field3474);
            }
        }
        this.field3473 += this.field3470;
        this.field3474++;
        return this.field3473 - this.field3470 >> 15;
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V")
    public class183() {
        this.field3469[0] = 0;
        this.field3469[1] = 65535;
        this.field3465[0] = 0;
        this.field3465[1] = 65535;
    }
}
