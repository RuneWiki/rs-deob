import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class15 {

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "I")
    private int field178 = 2;

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "[I")
    private int[] field179 = new int[2];

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "[I")
    private int[] field177 = new int[2];

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "I")
    public int field174;

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "I")
    public int field175;

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "I")
    public int field176;

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "I")
    private int field180;

    @OriginalMember(owner = "client!ql", name = "h", descriptor = "I")
    private int field181;

    @OriginalMember(owner = "client!ql", name = "i", descriptor = "I")
    private int field182;

    @OriginalMember(owner = "client!ql", name = "j", descriptor = "I")
    private int field183;

    @OriginalMember(owner = "client!ql", name = "k", descriptor = "I")
    private int field184;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "()V")
    public final void method112() {
        this.field182 = 0;
        this.field181 = 0;
        this.field180 = 0;
        this.field184 = 0;
        this.field183 = 0;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)I")
    public final int method113(int arg0) {
        if (this.field183 >= this.field182) {
            this.field184 = this.field177[this.field181++] << 15;
            if (this.field181 >= this.field178) {
                this.field181 = this.field178 - 1;
            }
            this.field182 = (int) ((double) this.field179[this.field181] / 65536.0D * (double) arg0);
            if (this.field182 > this.field183) {
                this.field180 = ((this.field177[this.field181] << 15) - this.field184) / (this.field182 - this.field183);
            }
        }
        this.field184 += this.field180;
        this.field183++;
        return this.field184 - this.field180 >> 15;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lhi;)V")
    public final void method114(class264 arg0) {
        this.field178 = arg0.method1779(-60);
        this.field179 = new int[this.field178];
        this.field177 = new int[this.field178];
        for (int var2 = 0; var2 < this.field178; var2++) {
            this.field179[var2] = arg0.method1777(-46);
            this.field177[var2] = arg0.method1777(-80);
        }
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "()V")
    public class15() {
        this.field179[0] = 0;
        this.field179[1] = 65535;
        this.field177[0] = 0;
        this.field177[1] = 65535;
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(Lhi;)V")
    public final void method115(class264 arg0) {
        this.field174 = arg0.method1779(-94);
        this.field175 = arg0.method1765((byte) 103);
        this.field176 = arg0.method1765((byte) 92);
        this.method114(arg0);
    }
}
