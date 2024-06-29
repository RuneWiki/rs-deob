import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class37 {

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    private int field428 = 2;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "[I")
    private int[] field426 = new int[2];

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "[I")
    private int[] field425 = new int[2];

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
    public int field427;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    public int field429;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
    public int field430;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
    private int field431;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "I")
    private int field432;

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "I")
    private int field433;

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "I")
    private int field434;

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "I")
    private int field435;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)I", line = 4)
    public final int method222(int arg0) {
        if (this.field435 >= this.field434) {
            this.field432 = this.field425[this.field431++] << 15;
            if (this.field431 >= this.field428) {
                this.field431 = this.field428 - 1;
            }
            this.field434 = (int) ((double) this.field426[this.field431] / 65536.0D * (double) arg0);
            if (this.field434 > this.field435) {
                this.field433 = ((this.field425[this.field431] << 15) - this.field432) / (this.field434 - this.field435);
            }
        }
        this.field432 += this.field433;
        this.field435++;
        return this.field432 - this.field433 >> 15;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ldg;)V", line = 23)
    public final void method223(class236 arg0) {
        this.field430 = arg0.method1574(-52);
        this.field429 = arg0.method1597(3641);
        this.field427 = arg0.method1597(3641);
        this.method225(arg0);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "()V", line = 33)
    public final void method224() {
        this.field434 = 0;
        this.field431 = 0;
        this.field433 = 0;
        this.field432 = 0;
        this.field435 = 0;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(Ldg;)V", line = 41)
    public final void method225(class236 arg0) {
        this.field428 = arg0.method1574(-75);
        this.field426 = new int[this.field428];
        this.field425 = new int[this.field428];
        for (int var2 = 0; var2 < this.field428; var2++) {
            this.field426[var2] = arg0.method1617((byte) 48);
            this.field425[var2] = arg0.method1617((byte) 48);
        }
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V", line = 56)
    public class37() {
        this.field426[0] = 0;
        this.field426[1] = 65535;
        this.field425[0] = 0;
        this.field425[1] = 65535;
    }
}
