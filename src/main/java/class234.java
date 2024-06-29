import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class234 {

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    private int field3717 = 2;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "[I")
    private int[] field3714 = new int[2];

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "[I")
    private int[] field3715 = new int[2];

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public int field3712;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public int field3713;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
    public int field3716;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    private int field3718;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
    private int field3719;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "I")
    private int field3720;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
    private int field3721;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
    private int field3722;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "()V")
    public final void method1627() {
        this.field3719 = 0;
        this.field3720 = 0;
        this.field3721 = 0;
        this.field3718 = 0;
        this.field3722 = 0;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)I")
    public final int method1628(int arg0) {
        if (this.field3722 >= this.field3719) {
            this.field3718 = this.field3715[this.field3720++] << 15;
            if (this.field3720 >= this.field3717) {
                this.field3720 = this.field3717 - 1;
            }
            this.field3719 = (int) ((double) this.field3714[this.field3720] / 65536.0D * (double) arg0);
            if (this.field3719 > this.field3722) {
                this.field3721 = ((this.field3715[this.field3720] << 15) - this.field3718) / (this.field3719 - this.field3722);
            }
        }
        this.field3718 += this.field3721;
        this.field3722++;
        return this.field3718 - this.field3721 >> 15;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lma;)V")
    public final void method1629(class202 arg0) {
        this.field3717 = arg0.method1420((byte) 0);
        this.field3714 = new int[this.field3717];
        this.field3715 = new int[this.field3717];
        for (int var2 = 0; var2 < this.field3717; var2++) {
            this.field3714[var2] = arg0.method1419(66);
            this.field3715[var2] = arg0.method1419(116);
        }
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(Lma;)V")
    public final void method1630(class202 arg0) {
        this.field3712 = arg0.method1420((byte) 0);
        this.field3716 = arg0.method1440(20404);
        this.field3713 = arg0.method1440(20404);
        this.method1629(arg0);
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "()V")
    public class234() {
        this.field3714[0] = 0;
        this.field3714[1] = 65535;
        this.field3715[0] = 0;
        this.field3715[1] = 65535;
    }
}
