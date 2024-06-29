import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class25 {

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "I")
    private int field177 = 2;

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "[I")
    private int[] field178 = new int[2];

    @OriginalMember(owner = "client!ir", name = "e", descriptor = "[I")
    private int[] field180 = new int[2];

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "I")
    public int field176;

    @OriginalMember(owner = "client!ir", name = "d", descriptor = "I")
    public int field179;

    @OriginalMember(owner = "client!ir", name = "f", descriptor = "I")
    public int field181;

    @OriginalMember(owner = "client!ir", name = "g", descriptor = "I")
    private int field182;

    @OriginalMember(owner = "client!ir", name = "h", descriptor = "I")
    private int field183;

    @OriginalMember(owner = "client!ir", name = "i", descriptor = "I")
    private int field184;

    @OriginalMember(owner = "client!ir", name = "j", descriptor = "I")
    private int field185;

    @OriginalMember(owner = "client!ir", name = "k", descriptor = "I")
    private int field186;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Los;)V")
    public final void method153(class374 arg0) {
        this.field181 = arg0.method2129(-96);
        this.field176 = arg0.method2123(false);
        this.field179 = arg0.method2123(false);
        this.method156(arg0);
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "()V")
    public final void method154() {
        this.field185 = 0;
        this.field183 = 0;
        this.field182 = 0;
        this.field184 = 0;
        this.field186 = 0;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)I")
    public final int method155(int arg0) {
        if (this.field186 >= this.field185) {
            this.field184 = this.field180[this.field183++] << 15;
            if (this.field183 >= this.field177) {
                this.field183 = this.field177 - 1;
            }
            this.field185 = (int) ((double) this.field178[this.field183] / 65536.0D * (double) arg0);
            if (this.field185 > this.field186) {
                this.field182 = ((this.field180[this.field183] << 15) - this.field184) / (this.field185 - this.field186);
            }
        }
        this.field184 += this.field182;
        this.field186++;
        return this.field184 - this.field182 >> 15;
    }

    @OriginalMember(owner = "client!ir", name = "<init>", descriptor = "()V")
    public class25() {
        this.field178[0] = 0;
        this.field178[1] = 65535;
        this.field180[0] = 0;
        this.field180[1] = 65535;
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(Los;)V")
    public final void method156(class374 arg0) {
        this.field177 = arg0.method2129(-117);
        this.field178 = new int[this.field177];
        this.field180 = new int[this.field177];
        for (int var2 = 0; var2 < this.field177; var2++) {
            this.field178[var2] = arg0.method2136(false);
            this.field180[var2] = arg0.method2136(false);
        }
    }
}
