import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class169 {

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    private int field3439 = 2;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "[I")
    private int[] field3435 = new int[2];

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "[I")
    private int[] field3440 = new int[2];

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    public int field3436;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public int field3437;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public int field3438;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    private int field3441;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
    private int field3442;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
    private int field3443;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
    private int field3444;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
    private int field3445;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)I")
    public final int method1142(int arg0) {
        if (this.field3445 >= this.field3443) {
            this.field3441 = this.field3440[this.field3442++] << 15;
            if (this.field3442 >= this.field3439) {
                this.field3442 = this.field3439 - 1;
            }
            this.field3443 = (int) ((double) this.field3435[this.field3442] / 65536.0D * (double) arg0);
            if (this.field3443 > this.field3445) {
                this.field3444 = ((this.field3440[this.field3442] << 15) - this.field3441) / (this.field3443 - this.field3445);
            }
        }
        this.field3441 += this.field3444;
        this.field3445++;
        return this.field3441 - this.field3444 >> 15;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lfa;)V")
    public final void method1143(class52 arg0) {
        this.field3437 = arg0.method344(255);
        this.field3436 = arg0.method383(93);
        this.field3438 = arg0.method383(63);
        this.method1144(arg0);
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(Lfa;)V")
    public final void method1144(class52 arg0) {
        this.field3439 = arg0.method344(255);
        this.field3435 = new int[this.field3439];
        this.field3440 = new int[this.field3439];
        for (int var2 = 0; var2 < this.field3439; var2++) {
            this.field3435[var2] = arg0.method390((byte) 105);
            this.field3440[var2] = arg0.method390((byte) 89);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "()V")
    public final void method1145() {
        this.field3443 = 0;
        this.field3442 = 0;
        this.field3444 = 0;
        this.field3441 = 0;
        this.field3445 = 0;
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V")
    public class169() {
        this.field3435[0] = 0;
        this.field3435[1] = 65535;
        this.field3440[0] = 0;
        this.field3440[1] = 65535;
    }
}
