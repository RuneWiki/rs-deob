import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class18 {

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    private int field381 = 2;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "[I")
    private int[] field380 = new int[2];

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "[I")
    private int[] field383 = new int[2];

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
    public int field379;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    public int field382;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
    public int field384;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
    private int field385;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
    private int field386;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
    private int field387;

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
    private int field388;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
    private int field389;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)I")
    public final int method161(int arg0) {
        if (this.field388 >= this.field386) {
            this.field385 = this.field383[this.field389++] << 15;
            if (this.field389 >= this.field381) {
                this.field389 = this.field381 - 1;
            }
            this.field386 = (int) ((double) this.field380[this.field389] / 65536.0D * (double) arg0);
            if (this.field386 > this.field388) {
                this.field387 = ((this.field383[this.field389] << 15) - this.field385) / (this.field386 - this.field388);
            }
        }
        this.field385 += this.field387;
        this.field388++;
        return this.field385 - this.field387 >> 15;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "()V")
    public final void method162() {
        this.field386 = 0;
        this.field389 = 0;
        this.field387 = 0;
        this.field385 = 0;
        this.field388 = 0;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lqe;)V")
    public final void method163(class109 arg0) {
        this.field384 = arg0.method838(255);
        this.field382 = arg0.method832(14722);
        this.field379 = arg0.method832(14722);
        this.method164(arg0);
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(Lqe;)V")
    public final void method164(class109 arg0) {
        this.field381 = arg0.method838(255);
        this.field380 = new int[this.field381];
        this.field383 = new int[this.field381];
        for (int var2 = 0; var2 < this.field381; var2++) {
            this.field380[var2] = arg0.method835(2);
            this.field383[var2] = arg0.method835(2);
        }
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V")
    public class18() {
        this.field380[0] = 0;
        this.field380[1] = 65535;
        this.field383[0] = 0;
        this.field383[1] = 65535;
    }
}
