import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wda")
public class class636 {

    @OriginalMember(owner = "client!wda", name = "e", descriptor = "I")
    private int field9144 = 2;

    @OriginalMember(owner = "client!wda", name = "c", descriptor = "[I")
    private int[] field9142 = new int[2];

    @OriginalMember(owner = "client!wda", name = "d", descriptor = "[I")
    private int[] field9143 = new int[2];

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "I")
    public int field9140;

    @OriginalMember(owner = "client!wda", name = "b", descriptor = "I")
    public int field9141;

    @OriginalMember(owner = "client!wda", name = "f", descriptor = "I")
    public int field9145;

    @OriginalMember(owner = "client!wda", name = "g", descriptor = "I")
    private int field9146;

    @OriginalMember(owner = "client!wda", name = "h", descriptor = "I")
    private int field9147;

    @OriginalMember(owner = "client!wda", name = "i", descriptor = "I")
    private int field9148;

    @OriginalMember(owner = "client!wda", name = "j", descriptor = "I")
    private int field9149;

    @OriginalMember(owner = "client!wda", name = "k", descriptor = "I")
    private int field9150;

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "()V", line = 4)
    public final void method3645() {
        this.field9146 = 0;
        this.field9148 = 0;
        this.field9147 = 0;
        this.field9149 = 0;
        this.field9150 = 0;
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(I)I", line = 14)
    public final int method3646(int arg0) {
        if (this.field9150 >= this.field9146) {
            this.field9149 = this.field9143[this.field9148++] << 15;
            if (this.field9148 >= this.field9144) {
                this.field9148 = this.field9144 - 1;
            }
            this.field9146 = (int) ((double) this.field9142[this.field9148] / 65536.0D * (double) arg0);
            if (this.field9146 > this.field9150) {
                this.field9147 = ((this.field9143[this.field9148] << 15) - this.field9149) / (this.field9146 - this.field9150);
            }
        }
        this.field9149 += this.field9147;
        this.field9150++;
        return this.field9149 - this.field9147 >> 15;
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(Lig;)V", line = 32)
    public final void method3647(class244 arg0) {
        this.field9140 = arg0.method1423(-61);
        this.field9145 = arg0.method1438(100);
        this.field9141 = arg0.method1438(100);
        this.method3648(arg0);
    }

    @OriginalMember(owner = "client!wda", name = "b", descriptor = "(Lig;)V", line = 40)
    public final void method3648(class244 arg0) {
        this.field9144 = arg0.method1423(-32);
        this.field9142 = new int[this.field9144];
        this.field9143 = new int[this.field9144];
        for (int var2 = 0; var2 < this.field9144; var2++) {
            this.field9142[var2] = arg0.method1476(-79);
            this.field9143[var2] = arg0.method1476(-101);
        }
    }

    @OriginalMember(owner = "client!wda", name = "<init>", descriptor = "()V", line = 56)
    public class636() {
        this.field9142[0] = 0;
        this.field9142[1] = 65535;
        this.field9143[0] = 0;
        this.field9143[1] = 65535;
    }
}
