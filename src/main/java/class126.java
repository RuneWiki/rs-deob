import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class126 {

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "I")
    private int field2345 = 2;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "[I")
    private int[] field2344 = new int[2];

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "[I")
    private int[] field2343 = new int[2];

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
    public int field2341;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
    public int field2342;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
    public int field2346;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "I")
    private int field2347;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "I")
    private int field2348;

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "I")
    private int field2349;

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "I")
    private int field2350;

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "I")
    private int field2351;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lkd;)V")
    public final void method829(class112 arg0) {
        this.field2342 = arg0.method716(-1308);
        this.field2341 = arg0.method759(69);
        this.field2346 = arg0.method759(58);
        this.method831(arg0);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)I")
    public final int method830(int arg0) {
        if (this.field2351 >= this.field2348) {
            this.field2350 = this.field2343[this.field2349++] << 15;
            if (this.field2349 >= this.field2345) {
                this.field2349 = this.field2345 - 1;
            }
            this.field2348 = (int) ((double) this.field2344[this.field2349] / 65536.0D * (double) arg0);
            if (this.field2348 > this.field2351) {
                this.field2347 = ((this.field2343[this.field2349] << 15) - this.field2350) / (this.field2348 - this.field2351);
            }
        }
        this.field2350 += this.field2347;
        this.field2351++;
        return this.field2350 - this.field2347 >> 15;
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(Lkd;)V")
    public final void method831(class112 arg0) {
        this.field2345 = arg0.method716(-1308);
        this.field2344 = new int[this.field2345];
        this.field2343 = new int[this.field2345];
        for (int var2 = 0; var2 < this.field2345; var2++) {
            this.field2344[var2] = arg0.method739(-123);
            this.field2343[var2] = arg0.method739(-127);
        }
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "()V")
    public class126() {
        this.field2344[0] = 0;
        this.field2344[1] = 65535;
        this.field2343[0] = 0;
        this.field2343[1] = 65535;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "()V")
    public final void method832() {
        this.field2348 = 0;
        this.field2349 = 0;
        this.field2347 = 0;
        this.field2350 = 0;
        this.field2351 = 0;
    }
}
