import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class232 {

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
    private int field4333 = 2;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "[I")
    private int[] field4332 = new int[2];

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "[I")
    private int[] field4334 = new int[2];

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
    public int field4335;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
    public int field4336;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
    public int field4337;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
    private int field4338;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
    private int field4339;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
    private int field4340;

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "I")
    private int field4341;

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "I")
    private int field4342;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lfj;)V")
    public final void method1514(class66 arg0) {
        this.field4336 = arg0.method506(255);
        this.field4335 = arg0.method528(true);
        this.field4337 = arg0.method528(true);
        this.method1517(arg0);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)I")
    public final int method1515(int arg0) {
        if (this.field4342 >= this.field4340) {
            this.field4338 = this.field4334[this.field4339++] << 15;
            if (this.field4339 >= this.field4333) {
                this.field4339 = this.field4333 - 1;
            }
            this.field4340 = (int) ((double) this.field4332[this.field4339] / 65536.0D * (double) arg0);
            if (this.field4340 > this.field4342) {
                this.field4341 = ((this.field4334[this.field4339] << 15) - this.field4338) / (this.field4340 - this.field4342);
            }
        }
        this.field4338 += this.field4341;
        this.field4342++;
        return this.field4338 - this.field4341 >> 15;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "()V")
    public final void method1516() {
        this.field4340 = 0;
        this.field4339 = 0;
        this.field4341 = 0;
        this.field4338 = 0;
        this.field4342 = 0;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(Lfj;)V")
    public final void method1517(class66 arg0) {
        this.field4333 = arg0.method506(255);
        this.field4332 = new int[this.field4333];
        this.field4334 = new int[this.field4333];
        for (int var2 = 0; var2 < this.field4333; var2++) {
            this.field4332[var2] = arg0.method500(56);
            this.field4334[var2] = arg0.method500(46);
        }
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V")
    public class232() {
        this.field4332[0] = 0;
        this.field4332[1] = 65535;
        this.field4334[0] = 0;
        this.field4334[1] = 65535;
    }
}
