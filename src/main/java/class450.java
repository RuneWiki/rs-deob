import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class450 {

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    private int field6555 = 2;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "[I")
    private int[] field6554 = new int[2];

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "[I")
    private int[] field6557 = new int[2];

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public int field6556;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public int field6558;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public int field6559;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    private int field6560;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
    private int field6561;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
    private int field6562;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
    private int field6563;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
    private int field6564;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lofa;)V", line = 3)
    public final void method2763(class301 arg0) {
        this.field6556 = arg0.method1987(-105);
        this.field6558 = arg0.method1934(-2);
        this.field6559 = arg0.method1934(-2);
        this.method2765(arg0);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "()V", line = 9)
    public final void method2764() {
        this.field6563 = 0;
        this.field6561 = 0;
        this.field6564 = 0;
        this.field6562 = 0;
        this.field6560 = 0;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(Lofa;)V", line = 17)
    public final void method2765(class301 arg0) {
        this.field6555 = arg0.method1987(-91);
        this.field6554 = new int[this.field6555];
        this.field6557 = new int[this.field6555];
        for (int var2 = 0; var2 < this.field6555; var2++) {
            this.field6554[var2] = arg0.method1989((byte) -113);
            this.field6557[var2] = arg0.method1989((byte) -89);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)I", line = 38)
    public final int method2766(int arg0) {
        if (this.field6560 >= this.field6563) {
            this.field6562 = this.field6557[this.field6561++] << 15;
            if (this.field6561 >= this.field6555) {
                this.field6561 = this.field6555 - 1;
            }
            this.field6563 = (int) ((double) this.field6554[this.field6561] / 65536.0D * (double) arg0);
            if (this.field6563 > this.field6560) {
                this.field6564 = ((this.field6557[this.field6561] << 15) - this.field6562) / (this.field6563 - this.field6560);
            }
        }
        this.field6562 += this.field6564;
        this.field6560++;
        return this.field6562 - this.field6564 >> 15;
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V", line = 56)
    public class450() {
        this.field6554[0] = 0;
        this.field6554[1] = 65535;
        this.field6557[0] = 0;
        this.field6557[1] = 65535;
    }
}
