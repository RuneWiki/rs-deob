import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class472 {

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
    private int field6575 = 2;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "[I")
    private int[] field6579 = new int[2];

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "[I")
    private int[] field6576 = new int[2];

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
    public int field6577;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "I")
    public int field6578;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
    public int field6580;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "I")
    private int field6581;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
    private int field6582;

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
    private int field6583;

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "I")
    private int field6584;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "I")
    private int field6585;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Les;)V", line = 4)
    public final void method2815(class403 arg0) {
        this.field6575 = arg0.method2396((byte) -79);
        this.field6579 = new int[this.field6575];
        this.field6576 = new int[this.field6575];
        for (int var2 = 0; var2 < this.field6575; var2++) {
            this.field6579[var2] = arg0.method2390((byte) 67);
            this.field6576[var2] = arg0.method2390((byte) -2);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "()V", line = 20)
    public final void method2816() {
        this.field6585 = 0;
        this.field6583 = 0;
        this.field6582 = 0;
        this.field6581 = 0;
        this.field6584 = 0;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)I", line = 30)
    public final int method2817(int arg0) {
        if (this.field6584 >= this.field6585) {
            this.field6581 = this.field6576[this.field6583++] << 15;
            if (this.field6583 >= this.field6575) {
                this.field6583 = this.field6575 - 1;
            }
            this.field6585 = (int) ((double) this.field6579[this.field6583] / 65536.0D * (double) arg0);
            if (this.field6585 > this.field6584) {
                this.field6582 = ((this.field6576[this.field6583] << 15) - this.field6581) / (this.field6585 - this.field6584);
            }
        }
        this.field6581 += this.field6582;
        this.field6584++;
        return this.field6581 - this.field6582 >> 15;
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(Les;)V", line = 49)
    public final void method2818(class403 arg0) {
        this.field6577 = arg0.method2396((byte) 72);
        this.field6578 = arg0.method2381((byte) 29);
        this.field6580 = arg0.method2381((byte) 58);
        this.method2815(arg0);
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V", line = 56)
    public class472() {
        this.field6579[0] = 0;
        this.field6579[1] = 65535;
        this.field6576[0] = 0;
        this.field6576[1] = 65535;
    }
}
