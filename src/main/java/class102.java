import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class102 {

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    private int field2436 = 2;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "[I")
    private int[] field2433 = new int[2];

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "[I")
    private int[] field2434 = new int[2];

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public int field2435;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
    public int field2437;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    public int field2438;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
    private int field2439;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "I")
    private int field2440;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
    private int field2441;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "I")
    private int field2442;

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "I")
    private int field2443;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)I")
    public final int method814(int arg0) {
        if (this.field2442 >= this.field2441) {
            this.field2439 = this.field2434[this.field2440++] << 15;
            if (this.field2440 >= this.field2436) {
                this.field2440 = this.field2436 - 1;
            }
            this.field2441 = (int) ((double) this.field2433[this.field2440] / 65536.0D * (double) arg0);
            if (this.field2441 > this.field2442) {
                this.field2443 = ((this.field2434[this.field2440] << 15) - this.field2439) / (this.field2441 - this.field2442);
            }
        }
        this.field2439 += this.field2443;
        this.field2442++;
        return this.field2439 - this.field2443 >> 15;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "()V")
    public final void method815() {
        this.field2441 = 0;
        this.field2440 = 0;
        this.field2443 = 0;
        this.field2439 = 0;
        this.field2442 = 0;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lsb;)V")
    public final void method816(class127 arg0) {
        this.field2436 = arg0.method1011(54);
        this.field2433 = new int[this.field2436];
        this.field2434 = new int[this.field2436];
        for (int var2 = 0; var2 < this.field2436; var2++) {
            this.field2433[var2] = arg0.method1020(false);
            this.field2434[var2] = arg0.method1020(false);
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(Lsb;)V")
    public final void method817(class127 arg0) {
        this.field2435 = arg0.method1011(17);
        this.field2438 = arg0.method986(71);
        this.field2437 = arg0.method986(43);
        this.method816(arg0);
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V")
    public class102() {
        this.field2433[0] = 0;
        this.field2433[1] = 65535;
        this.field2434[0] = 0;
        this.field2434[1] = 65535;
    }
}
