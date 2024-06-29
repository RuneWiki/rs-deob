import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class106 {

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    private int field2231 = 2;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "[I")
    private int[] field2234 = new int[2];

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "[I")
    private int[] field2232 = new int[2];

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public int field2229;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public int field2230;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public int field2233;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
    private int field2235;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
    private int field2236;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "I")
    private int field2237;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "I")
    private int field2238;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "I")
    private int field2239;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lbe;)V")
    public final void method858(class13 arg0) {
        this.field2230 = arg0.method142(27467);
        this.field2229 = arg0.method112(false);
        this.field2233 = arg0.method112(false);
        this.method861(arg0);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)I")
    public final int method859(int arg0) {
        if (this.field2235 >= this.field2237) {
            this.field2239 = this.field2232[this.field2238++] << 15;
            if (this.field2238 >= this.field2231) {
                this.field2238 = this.field2231 - 1;
            }
            this.field2237 = (int) ((double) this.field2234[this.field2238] / 65536.0D * (double) arg0);
            if (this.field2237 > this.field2235) {
                this.field2236 = ((this.field2232[this.field2238] << 15) - this.field2239) / (this.field2237 - this.field2235);
            }
        }
        this.field2239 += this.field2236;
        this.field2235++;
        return this.field2239 - this.field2236 >> 15;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "()V")
    public final void method860() {
        this.field2237 = 0;
        this.field2238 = 0;
        this.field2236 = 0;
        this.field2239 = 0;
        this.field2235 = 0;
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V")
    public class106() {
        this.field2234[0] = 0;
        this.field2234[1] = 65535;
        this.field2232[0] = 0;
        this.field2232[1] = 65535;
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(Lbe;)V")
    public final void method861(class13 arg0) {
        this.field2231 = arg0.method142(27467);
        this.field2234 = new int[this.field2231];
        this.field2232 = new int[this.field2231];
        for (int var2 = 0; var2 < this.field2231; var2++) {
            this.field2234[var2] = arg0.method105(1375221240);
            this.field2232[var2] = arg0.method105(1375221240);
        }
    }
}
