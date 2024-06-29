import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class456 {

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "I")
    private int field6398 = 2;

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "[I")
    private int[] field6399 = new int[2];

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "[I")
    private int[] field6394 = new int[2];

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    public int field6395;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
    public int field6396;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "I")
    public int field6397;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
    private int field6400;

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "I")
    private int field6401;

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "I")
    private int field6402;

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "I")
    private int field6403;

    @OriginalMember(owner = "client!jk", name = "k", descriptor = "I")
    private int field6404;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)I")
    public final int method2669(int arg0) {
        if (this.field6400 >= this.field6404) {
            this.field6403 = this.field6394[this.field6402++] << 15;
            if (this.field6402 >= this.field6398) {
                this.field6402 = this.field6398 - 1;
            }
            this.field6404 = (int) ((double) this.field6399[this.field6402] / 65536.0D * (double) arg0);
            if (this.field6404 > this.field6400) {
                this.field6401 = ((this.field6394[this.field6402] << 15) - this.field6403) / (this.field6404 - this.field6400);
            }
        }
        this.field6403 += this.field6401;
        this.field6400++;
        return this.field6403 - this.field6401 >> 15;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "()V")
    public final void method2670() {
        this.field6404 = 0;
        this.field6402 = 0;
        this.field6401 = 0;
        this.field6403 = 0;
        this.field6400 = 0;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lwm;)V")
    public final void method2671(class403 arg0) {
        this.field6398 = arg0.method2357((byte) 118);
        this.field6399 = new int[this.field6398];
        this.field6394 = new int[this.field6398];
        for (int var2 = 0; var2 < this.field6398; var2++) {
            this.field6399[var2] = arg0.method2338(0);
            this.field6394[var2] = arg0.method2338(0);
        }
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "()V")
    public class456() {
        this.field6399[0] = 0;
        this.field6399[1] = 65535;
        this.field6394[0] = 0;
        this.field6394[1] = 65535;
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(Lwm;)V")
    public final void method2672(class403 arg0) {
        this.field6396 = arg0.method2357((byte) 106);
        this.field6397 = arg0.method2319((byte) 123);
        this.field6395 = arg0.method2319((byte) 125);
        this.method2671(arg0);
    }
}
