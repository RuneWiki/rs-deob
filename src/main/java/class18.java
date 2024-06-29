import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class18 {

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    private int field215 = 2;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "[I")
    private int[] field216 = new int[2];

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "[I")
    private int[] field213 = new int[2];

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
    public int field214;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
    public int field217;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
    public int field218;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
    private int field219;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
    private int field220;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "I")
    private int field221;

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "I")
    private int field222;

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
    private int field223;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lrp;)V")
    public final void method121(class276 arg0) {
        this.field217 = arg0.method1701(-23121);
        this.field218 = arg0.method1688(20402);
        this.field214 = arg0.method1688(20402);
        this.method124(arg0);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)I")
    public final int method122(int arg0) {
        if (this.field220 >= this.field223) {
            this.field219 = this.field213[this.field221++] << 15;
            if (this.field221 >= this.field215) {
                this.field221 = this.field215 - 1;
            }
            this.field223 = (int) ((double) this.field216[this.field221] / 65536.0D * (double) arg0);
            if (this.field223 > this.field220) {
                this.field222 = ((this.field213[this.field221] << 15) - this.field219) / (this.field223 - this.field220);
            }
        }
        this.field219 += this.field222;
        this.field220++;
        return this.field219 - this.field222 >> 15;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "()V")
    public final void method123() {
        this.field223 = 0;
        this.field221 = 0;
        this.field222 = 0;
        this.field219 = 0;
        this.field220 = 0;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(Lrp;)V")
    public final void method124(class276 arg0) {
        this.field215 = arg0.method1701(-23121);
        this.field216 = new int[this.field215];
        this.field213 = new int[this.field215];
        for (int var2 = 0; var2 < this.field215; var2++) {
            this.field216[var2] = arg0.method1729(65280);
            this.field213[var2] = arg0.method1729(65280);
        }
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V")
    public class18() {
        this.field216[0] = 0;
        this.field216[1] = 65535;
        this.field213[0] = 0;
        this.field213[1] = 65535;
    }
}
