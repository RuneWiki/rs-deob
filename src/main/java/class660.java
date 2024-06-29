import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class660 {

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "I")
    private int field9397 = 2;

    @OriginalMember(owner = "client!wn", name = "e", descriptor = "[I")
    private int[] field9398 = new int[2];

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "[I")
    private int[] field9394 = new int[2];

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "I")
    public int field9395;

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "I")
    public int field9396;

    @OriginalMember(owner = "client!wn", name = "f", descriptor = "I")
    public int field9399;

    @OriginalMember(owner = "client!wn", name = "g", descriptor = "I")
    private int field9400;

    @OriginalMember(owner = "client!wn", name = "h", descriptor = "I")
    private int field9401;

    @OriginalMember(owner = "client!wn", name = "i", descriptor = "I")
    private int field9402;

    @OriginalMember(owner = "client!wn", name = "j", descriptor = "I")
    private int field9403;

    @OriginalMember(owner = "client!wn", name = "k", descriptor = "I")
    private int field9404;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Liaa;)V")
    public final void method3715(class452 arg0) {
        this.field9399 = arg0.method2541(108);
        this.field9395 = arg0.method2575((byte) -48);
        this.field9396 = arg0.method2575((byte) -48);
        this.method3716(arg0);
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(Liaa;)V")
    public final void method3716(class452 arg0) {
        this.field9397 = arg0.method2541(56);
        this.field9398 = new int[this.field9397];
        this.field9394 = new int[this.field9397];
        for (int var2 = 0; var2 < this.field9397; var2++) {
            this.field9398[var2] = arg0.method2574(-1758460248);
            this.field9394[var2] = arg0.method2574(-1758460248);
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)I")
    public final int method3717(int arg0) {
        if (this.field9400 >= this.field9402) {
            this.field9401 = this.field9394[this.field9403++] << 15;
            if (this.field9403 >= this.field9397) {
                this.field9403 = this.field9397 - 1;
            }
            this.field9402 = (int) ((double) this.field9398[this.field9403] / 65536.0D * (double) arg0);
            if (this.field9402 > this.field9400) {
                this.field9404 = ((this.field9394[this.field9403] << 15) - this.field9401) / (this.field9402 - this.field9400);
            }
        }
        this.field9401 += this.field9404;
        this.field9400++;
        return this.field9401 - this.field9404 >> 15;
    }

    @OriginalMember(owner = "client!wn", name = "<init>", descriptor = "()V")
    public class660() {
        this.field9398[0] = 0;
        this.field9398[1] = 65535;
        this.field9394[0] = 0;
        this.field9394[1] = 65535;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "()V")
    public final void method3718() {
        this.field9402 = 0;
        this.field9403 = 0;
        this.field9404 = 0;
        this.field9401 = 0;
        this.field9400 = 0;
    }
}
