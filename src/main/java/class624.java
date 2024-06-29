import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!raa")
public class class624 {

    @OriginalMember(owner = "client!raa", name = "f", descriptor = "I")
    private int field9149 = 2;

    @OriginalMember(owner = "client!raa", name = "c", descriptor = "[I")
    private int[] field9146 = new int[2];

    @OriginalMember(owner = "client!raa", name = "e", descriptor = "[I")
    private int[] field9148 = new int[2];

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "I")
    public int field9144;

    @OriginalMember(owner = "client!raa", name = "b", descriptor = "I")
    public int field9145;

    @OriginalMember(owner = "client!raa", name = "d", descriptor = "I")
    public int field9147;

    @OriginalMember(owner = "client!raa", name = "g", descriptor = "I")
    private int field9150;

    @OriginalMember(owner = "client!raa", name = "h", descriptor = "I")
    private int field9151;

    @OriginalMember(owner = "client!raa", name = "i", descriptor = "I")
    private int field9152;

    @OriginalMember(owner = "client!raa", name = "j", descriptor = "I")
    private int field9153;

    @OriginalMember(owner = "client!raa", name = "k", descriptor = "I")
    private int field9154;

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(Lps;)V", line = 3)
    public final void method3643(class428 arg0) {
        this.field9149 = arg0.method2561((byte) 121);
        this.field9146 = new int[this.field9149];
        this.field9148 = new int[this.field9149];
        for (int var2 = 0; var2 < this.field9149; var2++) {
            this.field9146[var2] = arg0.method2620(104);
            this.field9148[var2] = arg0.method2620(62);
        }
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "()V", line = 23)
    public final void method3644() {
        this.field9150 = 0;
        this.field9153 = 0;
        this.field9152 = 0;
        this.field9154 = 0;
        this.field9151 = 0;
    }

    @OriginalMember(owner = "client!raa", name = "b", descriptor = "(Lps;)V", line = 30)
    public final void method3645(class428 arg0) {
        this.field9144 = arg0.method2561((byte) -30);
        this.field9147 = arg0.method2589(-11179);
        this.field9145 = arg0.method2589(-11179);
        this.method3643(arg0);
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(I)I", line = 36)
    public final int method3646(int arg0) {
        if (this.field9151 >= this.field9150) {
            this.field9154 = this.field9148[this.field9153++] << 15;
            if (this.field9153 >= this.field9149) {
                this.field9153 = this.field9149 - 1;
            }
            this.field9150 = (int) ((double) this.field9146[this.field9153] / 65536.0D * (double) arg0);
            if (this.field9150 > this.field9151) {
                this.field9152 = ((this.field9148[this.field9153] << 15) - this.field9154) / (this.field9150 - this.field9151);
            }
        }
        this.field9154 += this.field9152;
        this.field9151++;
        return this.field9154 - this.field9152 >> 15;
    }

    @OriginalMember(owner = "client!raa", name = "<init>", descriptor = "()V", line = 55)
    public class624() {
        this.field9146[0] = 0;
        this.field9146[1] = 65535;
        this.field9148[0] = 0;
        this.field9148[1] = 65535;
    }
}
