import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class161 {

    @OriginalMember(owner = "client!e", name = "f", descriptor = "I")
    private int field2533 = 2;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "[I")
    private int[] field2531 = new int[2];

    @OriginalMember(owner = "client!e", name = "a", descriptor = "[I")
    private int[] field2528 = new int[2];

    @OriginalMember(owner = "client!e", name = "b", descriptor = "I")
    public int field2529;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "I")
    public int field2530;

    @OriginalMember(owner = "client!e", name = "e", descriptor = "I")
    public int field2532;

    @OriginalMember(owner = "client!e", name = "g", descriptor = "I")
    private int field2534;

    @OriginalMember(owner = "client!e", name = "h", descriptor = "I")
    private int field2535;

    @OriginalMember(owner = "client!e", name = "i", descriptor = "I")
    private int field2536;

    @OriginalMember(owner = "client!e", name = "j", descriptor = "I")
    private int field2537;

    @OriginalMember(owner = "client!e", name = "k", descriptor = "I")
    private int field2538;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "()V", line = 7)
    public final void method1196() {
        this.field2538 = 0;
        this.field2535 = 0;
        this.field2534 = 0;
        this.field2536 = 0;
        this.field2537 = 0;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lpe;)V", line = 16)
    public final void method1197(class101 arg0) {
        this.field2533 = arg0.method741(125);
        this.field2531 = new int[this.field2533];
        this.field2528 = new int[this.field2533];
        for (int var2 = 0; var2 < this.field2533; var2++) {
            this.field2531[var2] = arg0.method731(false);
            this.field2528[var2] = arg0.method731(false);
        }
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(Lpe;)V", line = 33)
    public final void method1198(class101 arg0) {
        this.field2532 = arg0.method741(70);
        this.field2530 = arg0.method775(-110);
        this.field2529 = arg0.method775(54);
        this.method1197(arg0);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)I", line = 40)
    public final int method1199(int arg0) {
        if (this.field2537 >= this.field2538) {
            this.field2536 = this.field2528[this.field2535++] << 15;
            if (this.field2535 >= this.field2533) {
                this.field2535 = this.field2533 - 1;
            }
            this.field2538 = (int) ((double) this.field2531[this.field2535] / 65536.0D * (double) arg0);
            if (this.field2538 > this.field2537) {
                this.field2534 = ((this.field2528[this.field2535] << 15) - this.field2536) / (this.field2538 - this.field2537);
            }
        }
        this.field2536 += this.field2534;
        this.field2537++;
        return this.field2536 - this.field2534 >> 15;
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "()V", line = 56)
    public class161() {
        this.field2531[0] = 0;
        this.field2531[1] = 65535;
        this.field2528[0] = 0;
        this.field2528[1] = 65535;
    }
}
