import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class27 {

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
    private int field522 = 2;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "[I")
    private int[] field523 = new int[2];

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "[I")
    private int[] field520 = new int[2];

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
    public int field521;

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "I")
    public int field524;

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "I")
    public int field525;

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "I")
    private int field526;

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "I")
    private int field527;

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "I")
    private int field528;

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "I")
    private int field529;

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "I")
    private int field530;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lhc;)V")
    public final void method152(class66 arg0) {
        this.field522 = arg0.method509(125);
        this.field523 = new int[this.field522];
        this.field520 = new int[this.field522];
        for (int var2 = 0; var2 < this.field522; var2++) {
            this.field523[var2] = arg0.method511(37);
            this.field520[var2] = arg0.method511(78);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)I")
    public final int method153(int arg0) {
        if (this.field530 >= this.field526) {
            this.field528 = this.field520[this.field527++] << 15;
            if (this.field527 >= this.field522) {
                this.field527 = this.field522 - 1;
            }
            this.field526 = (int) ((double) this.field523[this.field527] / 65536.0D * (double) arg0);
            if (this.field526 > this.field530) {
                this.field529 = ((this.field520[this.field527] << 15) - this.field528) / (this.field526 - this.field530);
            }
        }
        this.field528 += this.field529;
        this.field530++;
        return this.field528 - this.field529 >> 15;
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(Lhc;)V")
    public final void method154(class66 arg0) {
        this.field524 = arg0.method509(119);
        this.field521 = arg0.method464(-80);
        this.field525 = arg0.method464(-88);
        this.method152(arg0);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "()V")
    public final void method155() {
        this.field526 = 0;
        this.field527 = 0;
        this.field529 = 0;
        this.field528 = 0;
        this.field530 = 0;
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V")
    public class27() {
        this.field523[0] = 0;
        this.field523[1] = 65535;
        this.field520[0] = 0;
        this.field520[1] = 65535;
    }
}
