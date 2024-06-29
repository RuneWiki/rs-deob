import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class425 {

    @OriginalMember(owner = "client!go", name = "c", descriptor = "I")
    private int field6276 = 2;

    @OriginalMember(owner = "client!go", name = "b", descriptor = "[I")
    private int[] field6275 = new int[2];

    @OriginalMember(owner = "client!go", name = "d", descriptor = "[I")
    private int[] field6277 = new int[2];

    @OriginalMember(owner = "client!go", name = "a", descriptor = "I")
    public int field6274;

    @OriginalMember(owner = "client!go", name = "e", descriptor = "I")
    public int field6278;

    @OriginalMember(owner = "client!go", name = "f", descriptor = "I")
    public int field6279;

    @OriginalMember(owner = "client!go", name = "g", descriptor = "I")
    private int field6280;

    @OriginalMember(owner = "client!go", name = "h", descriptor = "I")
    private int field6281;

    @OriginalMember(owner = "client!go", name = "i", descriptor = "I")
    private int field6282;

    @OriginalMember(owner = "client!go", name = "j", descriptor = "I")
    private int field6283;

    @OriginalMember(owner = "client!go", name = "k", descriptor = "I")
    private int field6284;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Lae;)V", line = 3)
    public final void method2538(class156 arg0) {
        this.field6276 = arg0.method941((byte) 126);
        this.field6275 = new int[this.field6276];
        this.field6277 = new int[this.field6276];
        for (int var2 = 0; var2 < this.field6276; var2++) {
            this.field6275[var2] = arg0.method993((byte) -34);
            this.field6277[var2] = arg0.method993((byte) -121);
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "()V", line = 21)
    public final void method2539() {
        this.field6284 = 0;
        this.field6280 = 0;
        this.field6281 = 0;
        this.field6282 = 0;
        this.field6283 = 0;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(I)I", line = 32)
    public final int method2540(int arg0) {
        if (this.field6283 >= this.field6284) {
            this.field6282 = this.field6277[this.field6280++] << 15;
            if (this.field6280 >= this.field6276) {
                this.field6280 = this.field6276 - 1;
            }
            this.field6284 = (int) ((double) this.field6275[this.field6280] / 65536.0D * (double) arg0);
            if (this.field6284 > this.field6283) {
                this.field6281 = ((this.field6277[this.field6280] << 15) - this.field6282) / (this.field6284 - this.field6283);
            }
        }
        this.field6282 += this.field6281;
        this.field6283++;
        return this.field6282 - this.field6281 >> 15;
    }

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "()V", line = 50)
    public class425() {
        this.field6275[0] = 0;
        this.field6275[1] = 65535;
        this.field6277[0] = 0;
        this.field6277[1] = 65535;
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(Lae;)V", line = 63)
    public final void method2541(class156 arg0) {
        this.field6279 = arg0.method941((byte) 123);
        this.field6278 = arg0.method950(186);
        this.field6274 = arg0.method950(186);
        this.method2538(arg0);
    }
}
