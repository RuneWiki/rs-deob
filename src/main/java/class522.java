import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class522 {

    @OriginalMember(owner = "client!wo", name = "e", descriptor = "I")
    private int field7744 = 2;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "[I")
    private int[] field7740 = new int[2];

    @OriginalMember(owner = "client!wo", name = "f", descriptor = "[I")
    private int[] field7745 = new int[2];

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "I")
    public int field7741;

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "I")
    public int field7742;

    @OriginalMember(owner = "client!wo", name = "d", descriptor = "I")
    public int field7743;

    @OriginalMember(owner = "client!wo", name = "g", descriptor = "I")
    private int field7746;

    @OriginalMember(owner = "client!wo", name = "h", descriptor = "I")
    private int field7747;

    @OriginalMember(owner = "client!wo", name = "i", descriptor = "I")
    private int field7748;

    @OriginalMember(owner = "client!wo", name = "j", descriptor = "I")
    private int field7749;

    @OriginalMember(owner = "client!wo", name = "k", descriptor = "I")
    private int field7750;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lcu;)V")
    public final void method3109(class145 arg0) {
        this.field7742 = arg0.method1063((byte) 105);
        this.field7741 = arg0.method1070(-32387);
        this.field7743 = arg0.method1070(-32387);
        this.method3111(arg0);
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "()V")
    public final void method3110() {
        this.field7749 = 0;
        this.field7747 = 0;
        this.field7748 = 0;
        this.field7750 = 0;
        this.field7746 = 0;
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(Lcu;)V")
    public final void method3111(class145 arg0) {
        this.field7744 = arg0.method1063((byte) -56);
        this.field7740 = new int[this.field7744];
        this.field7745 = new int[this.field7744];
        for (int var2 = 0; var2 < this.field7744; var2++) {
            this.field7740[var2] = arg0.method1069((byte) -26);
            this.field7745[var2] = arg0.method1069((byte) -95);
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)I")
    public final int method3112(int arg0) {
        if (this.field7746 >= this.field7749) {
            this.field7750 = this.field7745[this.field7747++] << 15;
            if (this.field7747 >= this.field7744) {
                this.field7747 = this.field7744 - 1;
            }
            this.field7749 = (int) ((double) this.field7740[this.field7747] / 65536.0D * (double) arg0);
            if (this.field7749 > this.field7746) {
                this.field7748 = ((this.field7745[this.field7747] << 15) - this.field7750) / (this.field7749 - this.field7746);
            }
        }
        this.field7750 += this.field7748;
        this.field7746++;
        return this.field7750 - this.field7748 >> 15;
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "()V")
    public class522() {
        this.field7740[0] = 0;
        this.field7740[1] = 65535;
        this.field7745[0] = 0;
        this.field7745[1] = 65535;
    }
}
