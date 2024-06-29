import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class235 {

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
    private int field4391 = 2;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "[I")
    private int[] field4392 = new int[2];

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "[I")
    private int[] field4387 = new int[2];

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "I")
    public int field4388;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
    public int field4389;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
    public int field4390;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
    private int field4393;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
    private int field4394;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "I")
    private int field4395;

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "I")
    private int field4396;

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "I")
    private int field4397;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)I")
    public final int method1562(int arg0) {
        if (this.field4395 >= this.field4394) {
            this.field4396 = this.field4387[this.field4397++] << 15;
            if (this.field4397 >= this.field4391) {
                this.field4397 = this.field4391 - 1;
            }
            this.field4394 = (int) ((double) this.field4392[this.field4397] / 65536.0D * (double) arg0);
            if (this.field4394 > this.field4395) {
                this.field4393 = ((this.field4387[this.field4397] << 15) - this.field4396) / (this.field4394 - this.field4395);
            }
        }
        this.field4396 += this.field4393;
        this.field4395++;
        return this.field4396 - this.field4393 >> 15;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "()V")
    public final void method1563() {
        this.field4394 = 0;
        this.field4397 = 0;
        this.field4393 = 0;
        this.field4396 = 0;
        this.field4395 = 0;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lea;)V")
    public final void method1564(class46 arg0) {
        this.field4391 = arg0.method347(26119);
        this.field4392 = new int[this.field4391];
        this.field4387 = new int[this.field4391];
        for (int var2 = 0; var2 < this.field4391; var2++) {
            this.field4392[var2] = arg0.method301(24);
            this.field4387[var2] = arg0.method301(102);
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(Lea;)V")
    public final void method1565(class46 arg0) {
        this.field4390 = arg0.method347(26119);
        this.field4389 = arg0.method323((byte) -109);
        this.field4388 = arg0.method323((byte) -32);
        this.method1564(arg0);
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "()V")
    public class235() {
        this.field4392[0] = 0;
        this.field4392[1] = 65535;
        this.field4387[0] = 0;
        this.field4387[1] = 65535;
    }
}
