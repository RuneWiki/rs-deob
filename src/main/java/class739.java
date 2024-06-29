import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class739 {

    @OriginalMember(owner = "client!le", name = "b", descriptor = "I")
    private int field10204 = 2;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "[I")
    private int[] field10203 = new int[2];

    @OriginalMember(owner = "client!le", name = "c", descriptor = "[I")
    private int[] field10205 = new int[2];

    @OriginalMember(owner = "client!le", name = "d", descriptor = "I")
    public int field10206;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "I")
    public int field10207;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "I")
    public int field10208;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "I")
    private int field10209;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "I")
    private int field10210;

    @OriginalMember(owner = "client!le", name = "i", descriptor = "I")
    private int field10211;

    @OriginalMember(owner = "client!le", name = "j", descriptor = "I")
    private int field10212;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "I")
    private int field10213;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Ldc;)V")
    public final void method4105(class63 arg0) {
        this.field10207 = arg0.method505((byte) -119);
        this.field10206 = arg0.method457(-14532);
        this.field10208 = arg0.method457(-14532);
        this.method4107(arg0);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)I")
    public final int method4106(int arg0) {
        if (this.field10211 >= this.field10209) {
            this.field10212 = this.field10205[this.field10210++] << 15;
            if (this.field10210 >= this.field10204) {
                this.field10210 = this.field10204 - 1;
            }
            this.field10209 = (int) ((double) this.field10203[this.field10210] / 65536.0D * (double) arg0);
            if (this.field10209 > this.field10211) {
                this.field10213 = ((this.field10205[this.field10210] << 15) - this.field10212) / (this.field10209 - this.field10211);
            }
        }
        this.field10212 += this.field10213;
        this.field10211++;
        return this.field10212 - this.field10213 >> 15;
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(Ldc;)V")
    public final void method4107(class63 arg0) {
        this.field10204 = arg0.method505((byte) -119);
        this.field10203 = new int[this.field10204];
        this.field10205 = new int[this.field10204];
        for (int var2 = 0; var2 < this.field10204; var2++) {
            this.field10203[var2] = arg0.method482(-772591672);
            this.field10205[var2] = arg0.method482(-772591672);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "()V")
    public final void method4108() {
        this.field10209 = 0;
        this.field10210 = 0;
        this.field10213 = 0;
        this.field10212 = 0;
        this.field10211 = 0;
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "()V")
    public class739() {
        this.field10203[0] = 0;
        this.field10203[1] = 65535;
        this.field10205[0] = 0;
        this.field10205[1] = 65535;
    }
}
