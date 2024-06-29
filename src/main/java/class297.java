import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vca")
public class class297 {

    @OriginalMember(owner = "client!vca", name = "b", descriptor = "I")
    private int field4304 = 2;

    @OriginalMember(owner = "client!vca", name = "d", descriptor = "[I")
    private int[] field4306 = new int[2];

    @OriginalMember(owner = "client!vca", name = "e", descriptor = "[I")
    private int[] field4307 = new int[2];

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "I")
    public int field4303;

    @OriginalMember(owner = "client!vca", name = "c", descriptor = "I")
    public int field4305;

    @OriginalMember(owner = "client!vca", name = "f", descriptor = "I")
    public int field4308;

    @OriginalMember(owner = "client!vca", name = "g", descriptor = "I")
    private int field4309;

    @OriginalMember(owner = "client!vca", name = "h", descriptor = "I")
    private int field4310;

    @OriginalMember(owner = "client!vca", name = "i", descriptor = "I")
    private int field4311;

    @OriginalMember(owner = "client!vca", name = "j", descriptor = "I")
    private int field4312;

    @OriginalMember(owner = "client!vca", name = "k", descriptor = "I")
    private int field4313;

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(Ljp;)V")
    public final void method1885(class376 arg0) {
        this.field4304 = arg0.method2398(-1372747256);
        this.field4306 = new int[this.field4304];
        this.field4307 = new int[this.field4304];
        for (int var2 = 0; var2 < this.field4304; var2++) {
            this.field4306[var2] = arg0.method2359(-1);
            this.field4307[var2] = arg0.method2359(-1);
        }
    }

    @OriginalMember(owner = "client!vca", name = "b", descriptor = "(Ljp;)V")
    public final void method1886(class376 arg0) {
        this.field4303 = arg0.method2398(-1372747256);
        this.field4308 = arg0.method2384(11);
        this.field4305 = arg0.method2384(69);
        this.method1885(arg0);
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(I)I")
    public final int method1887(int arg0) {
        if (this.field4309 >= this.field4310) {
            this.field4313 = this.field4307[this.field4312++] << 15;
            if (this.field4312 >= this.field4304) {
                this.field4312 = this.field4304 - 1;
            }
            this.field4310 = (int) ((double) this.field4306[this.field4312] / 65536.0D * (double) arg0);
            if (this.field4310 > this.field4309) {
                this.field4311 = ((this.field4307[this.field4312] << 15) - this.field4313) / (this.field4310 - this.field4309);
            }
        }
        this.field4313 += this.field4311;
        this.field4309++;
        return this.field4313 - this.field4311 >> 15;
    }

    @OriginalMember(owner = "client!vca", name = "<init>", descriptor = "()V")
    public class297() {
        this.field4306[0] = 0;
        this.field4306[1] = 65535;
        this.field4307[0] = 0;
        this.field4307[1] = 65535;
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "()V")
    public final void method1888() {
        this.field4310 = 0;
        this.field4312 = 0;
        this.field4311 = 0;
        this.field4313 = 0;
        this.field4309 = 0;
    }
}
