import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public class class22 {

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "I")
    private int field338 = 2;

    @OriginalMember(owner = "client!ov", name = "e", descriptor = "[I")
    private int[] field341 = new int[2];

    @OriginalMember(owner = "client!ov", name = "f", descriptor = "[I")
    private int[] field342 = new int[2];

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "I")
    public int field337;

    @OriginalMember(owner = "client!ov", name = "c", descriptor = "I")
    public int field339;

    @OriginalMember(owner = "client!ov", name = "d", descriptor = "I")
    public int field340;

    @OriginalMember(owner = "client!ov", name = "g", descriptor = "I")
    private int field343;

    @OriginalMember(owner = "client!ov", name = "h", descriptor = "I")
    private int field344;

    @OriginalMember(owner = "client!ov", name = "i", descriptor = "I")
    private int field345;

    @OriginalMember(owner = "client!ov", name = "j", descriptor = "I")
    private int field346;

    @OriginalMember(owner = "client!ov", name = "k", descriptor = "I")
    private int field347;

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(Ltl;)V")
    public final void method169(class91 arg0) {
        this.field337 = arg0.method618((byte) 100);
        this.field339 = arg0.method626((byte) 100);
        this.field340 = arg0.method626((byte) 100);
        this.method170(arg0);
    }

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "(Ltl;)V")
    public final void method170(class91 arg0) {
        this.field338 = arg0.method618((byte) 100);
        this.field341 = new int[this.field338];
        this.field342 = new int[this.field338];
        for (int var2 = 0; var2 < this.field338; var2++) {
            this.field341[var2] = arg0.method631(10494);
            this.field342[var2] = arg0.method631(10494);
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "()V")
    public final void method171() {
        this.field345 = 0;
        this.field344 = 0;
        this.field343 = 0;
        this.field346 = 0;
        this.field347 = 0;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(I)I")
    public final int method172(int arg0) {
        if (this.field347 >= this.field345) {
            this.field346 = this.field342[this.field344++] << 15;
            if (this.field344 >= this.field338) {
                this.field344 = this.field338 - 1;
            }
            this.field345 = (int) ((double) this.field341[this.field344] / 65536.0D * (double) arg0);
            if (this.field345 > this.field347) {
                this.field343 = ((this.field342[this.field344] << 15) - this.field346) / (this.field345 - this.field347);
            }
        }
        this.field346 += this.field343;
        this.field347++;
        return this.field346 - this.field343 >> 15;
    }

    @OriginalMember(owner = "client!ov", name = "<init>", descriptor = "()V")
    public class22() {
        this.field341[0] = 0;
        this.field341[1] = 65535;
        this.field342[0] = 0;
        this.field342[1] = 65535;
    }
}
