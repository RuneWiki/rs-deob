import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class327 {

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "I")
    private int field4438 = 2;

    @OriginalMember(owner = "client!rq", name = "f", descriptor = "[I")
    private int[] field4441 = new int[2];

    @OriginalMember(owner = "client!rq", name = "d", descriptor = "[I")
    private int[] field4439 = new int[2];

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "I")
    public int field4436;

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "I")
    public int field4437;

    @OriginalMember(owner = "client!rq", name = "e", descriptor = "I")
    public int field4440;

    @OriginalMember(owner = "client!rq", name = "g", descriptor = "I")
    private int field4442;

    @OriginalMember(owner = "client!rq", name = "h", descriptor = "I")
    private int field4443;

    @OriginalMember(owner = "client!rq", name = "i", descriptor = "I")
    private int field4444;

    @OriginalMember(owner = "client!rq", name = "j", descriptor = "I")
    private int field4445;

    @OriginalMember(owner = "client!rq", name = "k", descriptor = "I")
    private int field4446;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(I)I", line = 3)
    public final int method1995(int arg0) {
        if (this.field4442 >= this.field4446) {
            this.field4444 = this.field4439[this.field4443++] << 15;
            if (this.field4443 >= this.field4438) {
                this.field4443 = this.field4438 - 1;
            }
            this.field4446 = (int) ((double) this.field4441[this.field4443] / 65536.0D * (double) arg0);
            if (this.field4446 > this.field4442) {
                this.field4445 = ((this.field4439[this.field4443] << 15) - this.field4444) / (this.field4446 - this.field4442);
            }
        }
        this.field4444 += this.field4445;
        this.field4442++;
        return this.field4444 - this.field4445 >> 15;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lrg;)V", line = 23)
    public final void method1996(class366 arg0) {
        this.field4440 = arg0.method2306((byte) 106);
        this.field4437 = arg0.method2258(1177515464);
        this.field4436 = arg0.method2258(1177515464);
        this.method1998(arg0);
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "()V", line = 29)
    public final void method1997() {
        this.field4446 = 0;
        this.field4443 = 0;
        this.field4445 = 0;
        this.field4444 = 0;
        this.field4442 = 0;
    }

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "(Lrg;)V", line = 37)
    public final void method1998(class366 arg0) {
        this.field4438 = arg0.method2306((byte) 63);
        this.field4441 = new int[this.field4438];
        this.field4439 = new int[this.field4438];
        for (int var2 = 0; var2 < this.field4438; var2++) {
            this.field4441[var2] = arg0.method2297(13352);
            this.field4439[var2] = arg0.method2297(13352);
        }
    }

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "()V", line = 56)
    public class327() {
        this.field4441[0] = 0;
        this.field4441[1] = 65535;
        this.field4439[0] = 0;
        this.field4439[1] = 65535;
    }
}
