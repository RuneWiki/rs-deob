import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class172 {

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
    private int field3559 = 2;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "[I")
    private int[] field3560 = new int[2];

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "[I")
    private int[] field3557 = new int[2];

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
    public int field3555;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "I")
    public int field3556;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "I")
    public int field3558;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
    private int field3561;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "I")
    private int field3562;

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "I")
    private int field3563;

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "I")
    private int field3564;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "I")
    private int field3565;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)I")
    public final int method1152(int arg0) {
        if (this.field3562 >= this.field3561) {
            this.field3563 = this.field3557[this.field3565++] << 15;
            if (this.field3565 >= this.field3559) {
                this.field3565 = this.field3559 - 1;
            }
            this.field3561 = (int) ((double) this.field3560[this.field3565] / 65536.0D * (double) arg0);
            if (this.field3561 > this.field3562) {
                this.field3564 = ((this.field3557[this.field3565] << 15) - this.field3563) / (this.field3561 - this.field3562);
            }
        }
        this.field3563 += this.field3564;
        this.field3562++;
        return this.field3563 - this.field3564 >> 15;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lab;)V")
    public final void method1153(class3 arg0) {
        this.field3559 = arg0.method64(31790);
        this.field3560 = new int[this.field3559];
        this.field3557 = new int[this.field3559];
        for (int var2 = 0; var2 < this.field3559; var2++) {
            this.field3560[var2] = arg0.method46((byte) 65);
            this.field3557[var2] = arg0.method46((byte) 65);
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(Lab;)V")
    public final void method1154(class3 arg0) {
        this.field3558 = arg0.method64(31790);
        this.field3555 = arg0.method56(-1);
        this.field3556 = arg0.method56(-1);
        this.method1153(arg0);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "()V")
    public final void method1155() {
        this.field3561 = 0;
        this.field3565 = 0;
        this.field3564 = 0;
        this.field3563 = 0;
        this.field3562 = 0;
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V")
    public class172() {
        this.field3560[0] = 0;
        this.field3560[1] = 65535;
        this.field3557[0] = 0;
        this.field3557[1] = 65535;
    }
}
