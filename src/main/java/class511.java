import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oaa")
public class class511 {

    @OriginalMember(owner = "client!oaa", name = "e", descriptor = "I")
    private int field7121 = 2;

    @OriginalMember(owner = "client!oaa", name = "d", descriptor = "[I")
    private int[] field7120 = new int[2];

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "[I")
    private int[] field7117 = new int[2];

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "I")
    public int field7118;

    @OriginalMember(owner = "client!oaa", name = "c", descriptor = "I")
    public int field7119;

    @OriginalMember(owner = "client!oaa", name = "f", descriptor = "I")
    public int field7122;

    @OriginalMember(owner = "client!oaa", name = "g", descriptor = "I")
    private int field7123;

    @OriginalMember(owner = "client!oaa", name = "h", descriptor = "I")
    private int field7124;

    @OriginalMember(owner = "client!oaa", name = "i", descriptor = "I")
    private int field7125;

    @OriginalMember(owner = "client!oaa", name = "j", descriptor = "I")
    private int field7126;

    @OriginalMember(owner = "client!oaa", name = "k", descriptor = "I")
    private int field7127;

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Lge;)V")
    public final void method2851(class551 arg0) {
        this.field7121 = arg0.method3045(-128);
        this.field7120 = new int[this.field7121];
        this.field7117 = new int[this.field7121];
        for (int var2 = 0; var2 < this.field7121; var2++) {
            this.field7120[var2] = arg0.method3090(-81);
            this.field7117[var2] = arg0.method3090(-112);
        }
    }

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "(Lge;)V")
    public final void method2852(class551 arg0) {
        this.field7122 = arg0.method3045(-127);
        this.field7118 = arg0.method3048(-4);
        this.field7119 = arg0.method3048(-4);
        this.method2851(arg0);
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(I)I")
    public final int method2853(int arg0) {
        if (this.field7124 >= this.field7123) {
            this.field7127 = this.field7117[this.field7125++] << 15;
            if (this.field7125 >= this.field7121) {
                this.field7125 = this.field7121 - 1;
            }
            this.field7123 = (int) ((double) this.field7120[this.field7125] / 65536.0D * (double) arg0);
            if (this.field7123 > this.field7124) {
                this.field7126 = ((this.field7117[this.field7125] << 15) - this.field7127) / (this.field7123 - this.field7124);
            }
        }
        this.field7127 += this.field7126;
        this.field7124++;
        return this.field7127 - this.field7126 >> 15;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "()V")
    public final void method2854() {
        this.field7123 = 0;
        this.field7125 = 0;
        this.field7126 = 0;
        this.field7127 = 0;
        this.field7124 = 0;
    }

    @OriginalMember(owner = "client!oaa", name = "<init>", descriptor = "()V")
    public class511() {
        this.field7120[0] = 0;
        this.field7120[1] = 65535;
        this.field7117[0] = 0;
        this.field7117[1] = 65535;
    }
}
