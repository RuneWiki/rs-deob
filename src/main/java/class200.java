import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class200 {

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "I")
    private int field3580 = 2;

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "[I")
    private int[] field3578 = new int[2];

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "[I")
    private int[] field3576 = new int[2];

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "I")
    public int field3577;

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
    public int field3579;

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "I")
    public int field3581;

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "I")
    private int field3582;

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "I")
    private int field3583;

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "I")
    private int field3584;

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "I")
    private int field3585;

    @OriginalMember(owner = "client!ji", name = "k", descriptor = "I")
    private int field3586;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)I")
    public final int method1432(int arg0) {
        if (this.field3583 >= this.field3584) {
            this.field3582 = this.field3576[this.field3586++] << 15;
            if (this.field3586 >= this.field3580) {
                this.field3586 = this.field3580 - 1;
            }
            this.field3584 = (int) ((double) this.field3578[this.field3586] / 65536.0D * (double) arg0);
            if (this.field3584 > this.field3583) {
                this.field3585 = ((this.field3576[this.field3586] << 15) - this.field3582) / (this.field3584 - this.field3583);
            }
        }
        this.field3582 += this.field3585;
        this.field3583++;
        return this.field3582 - this.field3585 >> 15;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lpg;)V")
    public final void method1433(class81 arg0) {
        this.field3581 = arg0.method622(true);
        this.field3577 = arg0.method620((byte) -82);
        this.field3579 = arg0.method620((byte) -82);
        this.method1434(arg0);
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(Lpg;)V")
    public final void method1434(class81 arg0) {
        this.field3580 = arg0.method622(true);
        this.field3578 = new int[this.field3580];
        this.field3576 = new int[this.field3580];
        for (int var2 = 0; var2 < this.field3580; var2++) {
            this.field3578[var2] = arg0.method658(-76);
            this.field3576[var2] = arg0.method658(66);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "()V")
    public final void method1435() {
        this.field3584 = 0;
        this.field3586 = 0;
        this.field3585 = 0;
        this.field3582 = 0;
        this.field3583 = 0;
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "()V")
    public class200() {
        this.field3578[0] = 0;
        this.field3578[1] = 65535;
        this.field3576[0] = 0;
        this.field3576[1] = 65535;
    }
}
