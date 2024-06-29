import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public class class392 {

    @OriginalMember(owner = "client!mv", name = "d", descriptor = "I")
    private int field5565 = 2;

    @OriginalMember(owner = "client!mv", name = "c", descriptor = "[I")
    private int[] field5564 = new int[2];

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "[I")
    private int[] field5563 = new int[2];

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "I")
    public int field5562;

    @OriginalMember(owner = "client!mv", name = "e", descriptor = "I")
    public int field5566;

    @OriginalMember(owner = "client!mv", name = "f", descriptor = "I")
    public int field5567;

    @OriginalMember(owner = "client!mv", name = "g", descriptor = "I")
    private int field5568;

    @OriginalMember(owner = "client!mv", name = "h", descriptor = "I")
    private int field5569;

    @OriginalMember(owner = "client!mv", name = "i", descriptor = "I")
    private int field5570;

    @OriginalMember(owner = "client!mv", name = "j", descriptor = "I")
    private int field5571;

    @OriginalMember(owner = "client!mv", name = "k", descriptor = "I")
    private int field5572;

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(Lrv;)V")
    public final void method2392(class120 arg0) {
        this.field5562 = arg0.method842(2384);
        this.field5567 = arg0.method871(23995);
        this.field5566 = arg0.method871(23995);
        this.method2393(arg0);
    }

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "(Lrv;)V")
    public final void method2393(class120 arg0) {
        this.field5565 = arg0.method842(2384);
        this.field5564 = new int[this.field5565];
        this.field5563 = new int[this.field5565];
        for (int var2 = 0; var2 < this.field5565; var2++) {
            this.field5564[var2] = arg0.method898((byte) -103);
            this.field5563[var2] = arg0.method898((byte) -78);
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(I)I")
    public final int method2394(int arg0) {
        if (this.field5572 >= this.field5568) {
            this.field5569 = this.field5563[this.field5570++] << 15;
            if (this.field5570 >= this.field5565) {
                this.field5570 = this.field5565 - 1;
            }
            this.field5568 = (int) ((double) this.field5564[this.field5570] / 65536.0D * (double) arg0);
            if (this.field5568 > this.field5572) {
                this.field5571 = ((this.field5563[this.field5570] << 15) - this.field5569) / (this.field5568 - this.field5572);
            }
        }
        this.field5569 += this.field5571;
        this.field5572++;
        return this.field5569 - this.field5571 >> 15;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "()V")
    public final void method2395() {
        this.field5568 = 0;
        this.field5570 = 0;
        this.field5571 = 0;
        this.field5569 = 0;
        this.field5572 = 0;
    }

    @OriginalMember(owner = "client!mv", name = "<init>", descriptor = "()V")
    public class392() {
        this.field5564[0] = 0;
        this.field5564[1] = 65535;
        this.field5563[0] = 0;
        this.field5563[1] = 65535;
    }
}
