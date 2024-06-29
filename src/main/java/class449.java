import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class449 {

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
    private int field6302 = 2;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "[I")
    private int[] field6300 = new int[2];

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "[I")
    private int[] field6298 = new int[2];

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    public int field6299;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
    public int field6301;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
    public int field6303;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "I")
    private int field6304;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
    private int field6305;

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "I")
    private int field6306;

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "I")
    private int field6307;

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "I")
    private int field6308;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lnp;)V")
    public final void method2590(class115 arg0) {
        this.field6302 = arg0.method620((byte) -126);
        this.field6300 = new int[this.field6302];
        this.field6298 = new int[this.field6302];
        for (int var2 = 0; var2 < this.field6302; var2++) {
            this.field6300[var2] = arg0.method643((byte) -77);
            this.field6298[var2] = arg0.method643((byte) -77);
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(Lnp;)V")
    public final void method2591(class115 arg0) {
        this.field6303 = arg0.method620((byte) -128);
        this.field6299 = arg0.method631(false);
        this.field6301 = arg0.method631(false);
        this.method2590(arg0);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "()V")
    public final void method2592() {
        this.field6305 = 0;
        this.field6304 = 0;
        this.field6308 = 0;
        this.field6307 = 0;
        this.field6306 = 0;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)I")
    public final int method2593(int arg0) {
        if (this.field6306 >= this.field6305) {
            this.field6307 = this.field6298[this.field6304++] << 15;
            if (this.field6304 >= this.field6302) {
                this.field6304 = this.field6302 - 1;
            }
            this.field6305 = (int) ((double) this.field6300[this.field6304] / 65536.0D * (double) arg0);
            if (this.field6305 > this.field6306) {
                this.field6308 = ((this.field6298[this.field6304] << 15) - this.field6307) / (this.field6305 - this.field6306);
            }
        }
        this.field6307 += this.field6308;
        this.field6306++;
        return this.field6307 - this.field6308 >> 15;
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V")
    public class449() {
        this.field6300[0] = 0;
        this.field6300[1] = 65535;
        this.field6298[0] = 0;
        this.field6298[1] = 65535;
    }
}
