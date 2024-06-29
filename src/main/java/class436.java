import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class436 {

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "I")
    private int field6414 = 2;

    @OriginalMember(owner = "client!fr", name = "d", descriptor = "[I")
    private int[] field6416 = new int[2];

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "[I")
    private int[] field6415 = new int[2];

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "I")
    public int field6413;

    @OriginalMember(owner = "client!fr", name = "e", descriptor = "I")
    public int field6417;

    @OriginalMember(owner = "client!fr", name = "f", descriptor = "I")
    public int field6418;

    @OriginalMember(owner = "client!fr", name = "g", descriptor = "I")
    private int field6419;

    @OriginalMember(owner = "client!fr", name = "h", descriptor = "I")
    private int field6420;

    @OriginalMember(owner = "client!fr", name = "i", descriptor = "I")
    private int field6421;

    @OriginalMember(owner = "client!fr", name = "j", descriptor = "I")
    private int field6422;

    @OriginalMember(owner = "client!fr", name = "k", descriptor = "I")
    private int field6423;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lef;)V")
    public final void method2676(class385 arg0) {
        this.field6413 = arg0.method2343(255);
        this.field6418 = arg0.method2354(255);
        this.field6417 = arg0.method2354(255);
        this.method2677(arg0);
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(Lef;)V")
    public final void method2677(class385 arg0) {
        this.field6414 = arg0.method2343(255);
        this.field6416 = new int[this.field6414];
        this.field6415 = new int[this.field6414];
        for (int var2 = 0; var2 < this.field6414; var2++) {
            this.field6416[var2] = arg0.method2323(-128);
            this.field6415[var2] = arg0.method2323(-94);
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "()V")
    public final void method2678() {
        this.field6422 = 0;
        this.field6421 = 0;
        this.field6420 = 0;
        this.field6419 = 0;
        this.field6423 = 0;
    }

    @OriginalMember(owner = "client!fr", name = "<init>", descriptor = "()V")
    public class436() {
        this.field6416[0] = 0;
        this.field6416[1] = 65535;
        this.field6415[0] = 0;
        this.field6415[1] = 65535;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)I")
    public final int method2679(int arg0) {
        if (this.field6423 >= this.field6422) {
            this.field6419 = this.field6415[this.field6421++] << 15;
            if (this.field6421 >= this.field6414) {
                this.field6421 = this.field6414 - 1;
            }
            this.field6422 = (int) ((double) this.field6416[this.field6421] / 65536.0D * (double) arg0);
            if (this.field6422 > this.field6423) {
                this.field6420 = ((this.field6415[this.field6421] << 15) - this.field6419) / (this.field6422 - this.field6423);
            }
        }
        this.field6419 += this.field6420;
        this.field6423++;
        return this.field6419 - this.field6420 >> 15;
    }
}
