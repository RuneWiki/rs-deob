import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public class class40 {

    @OriginalMember(owner = "client!mca", name = "f", descriptor = "I")
    private int field406 = 2;

    @OriginalMember(owner = "client!mca", name = "d", descriptor = "[I")
    private int[] field404 = new int[2];

    @OriginalMember(owner = "client!mca", name = "e", descriptor = "[I")
    private int[] field405 = new int[2];

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "I")
    public int field401;

    @OriginalMember(owner = "client!mca", name = "b", descriptor = "I")
    public int field402;

    @OriginalMember(owner = "client!mca", name = "c", descriptor = "I")
    public int field403;

    @OriginalMember(owner = "client!mca", name = "g", descriptor = "I")
    private int field407;

    @OriginalMember(owner = "client!mca", name = "h", descriptor = "I")
    private int field408;

    @OriginalMember(owner = "client!mca", name = "i", descriptor = "I")
    private int field409;

    @OriginalMember(owner = "client!mca", name = "j", descriptor = "I")
    private int field410;

    @OriginalMember(owner = "client!mca", name = "k", descriptor = "I")
    private int field411;

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(Lgga;)V")
    public final void method320(class511 arg0) {
        this.field403 = arg0.method3013(-94);
        this.field402 = arg0.method3008(64);
        this.field401 = arg0.method3008(64);
        this.method322(arg0);
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "()V")
    public final void method321() {
        this.field410 = 0;
        this.field411 = 0;
        this.field409 = 0;
        this.field408 = 0;
        this.field407 = 0;
    }

    @OriginalMember(owner = "client!mca", name = "b", descriptor = "(Lgga;)V")
    public final void method322(class511 arg0) {
        this.field406 = arg0.method3013(-113);
        this.field404 = new int[this.field406];
        this.field405 = new int[this.field406];
        for (int var2 = 0; var2 < this.field406; var2++) {
            this.field404[var2] = arg0.method3002(-1);
            this.field405[var2] = arg0.method3002(-1);
        }
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(I)I")
    public final int method323(int arg0) {
        if (this.field407 >= this.field410) {
            this.field408 = this.field405[this.field411++] << 15;
            if (this.field411 >= this.field406) {
                this.field411 = this.field406 - 1;
            }
            this.field410 = (int) ((double) this.field404[this.field411] / 65536.0D * (double) arg0);
            if (this.field410 > this.field407) {
                this.field409 = ((this.field405[this.field411] << 15) - this.field408) / (this.field410 - this.field407);
            }
        }
        this.field408 += this.field409;
        this.field407++;
        return this.field408 - this.field409 >> 15;
    }

    @OriginalMember(owner = "client!mca", name = "<init>", descriptor = "()V")
    public class40() {
        this.field404[0] = 0;
        this.field404[1] = 65535;
        this.field405[0] = 0;
        this.field405[1] = 65535;
    }
}
