import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class28 {

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
    private int field330 = 2;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "[I")
    private int[] field335 = new int[2];

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "[I")
    private int[] field331 = new int[2];

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
    public int field332;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
    public int field333;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
    public int field334;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
    private int field336;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "I")
    private int field337;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
    private int field338;

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "I")
    private int field339;

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "I")
    private int field340;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lva;)V", line = 5)
    public final void method214(class235 arg0) {
        this.field330 = arg0.method1589(123);
        this.field335 = new int[this.field330];
        this.field331 = new int[this.field330];
        for (int var2 = 0; var2 < this.field330; var2++) {
            this.field335[var2] = arg0.method1615(-125);
            this.field331[var2] = arg0.method1615(-126);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "()V", line = 21)
    public final void method215() {
        this.field337 = 0;
        this.field336 = 0;
        this.field340 = 0;
        this.field339 = 0;
        this.field338 = 0;
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(Lva;)V", line = 28)
    public final void method216(class235 arg0) {
        this.field332 = arg0.method1589(91);
        this.field333 = arg0.method1611(-104);
        this.field334 = arg0.method1611(107);
        this.method214(arg0);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)I", line = 34)
    public final int method217(int arg0) {
        if (this.field338 >= this.field337) {
            this.field339 = this.field331[this.field336++] << 15;
            if (this.field336 >= this.field330) {
                this.field336 = this.field330 - 1;
            }
            this.field337 = (int) ((double) this.field335[this.field336] / 65536.0D * (double) arg0);
            if (this.field337 > this.field338) {
                this.field340 = ((this.field331[this.field336] << 15) - this.field339) / (this.field337 - this.field338);
            }
        }
        this.field339 += this.field340;
        this.field338++;
        return this.field339 - this.field340 >> 15;
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "()V", line = 56)
    public class28() {
        this.field335[0] = 0;
        this.field335[1] = 65535;
        this.field331[0] = 0;
        this.field331[1] = 65535;
    }
}
