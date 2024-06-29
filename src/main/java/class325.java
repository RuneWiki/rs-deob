import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class325 {

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
    private int field4436 = 2;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "[I")
    private int[] field4440 = new int[2];

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "[I")
    private int[] field4441 = new int[2];

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
    public int field4437;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "I")
    public int field4438;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
    public int field4439;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
    private int field4442;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
    private int field4443;

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "I")
    private int field4444;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "I")
    private int field4445;

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "I")
    private int field4446;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "()V")
    public final void method2045() {
        this.field4442 = 0;
        this.field4445 = 0;
        this.field4444 = 0;
        this.field4443 = 0;
        this.field4446 = 0;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Leb;)V")
    public final void method2046(class371 arg0) {
        this.field4438 = arg0.method2429(0);
        this.field4437 = arg0.method2413((byte) -30);
        this.field4439 = arg0.method2413((byte) -30);
        this.method2047(arg0);
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(Leb;)V")
    public final void method2047(class371 arg0) {
        this.field4436 = arg0.method2429(0);
        this.field4440 = new int[this.field4436];
        this.field4441 = new int[this.field4436];
        for (int var2 = 0; var2 < this.field4436; var2++) {
            this.field4440[var2] = arg0.method2403((byte) 125);
            this.field4441[var2] = arg0.method2403((byte) 118);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)I")
    public final int method2048(int arg0) {
        if (this.field4446 >= this.field4442) {
            this.field4443 = this.field4441[this.field4445++] << 15;
            if (this.field4445 >= this.field4436) {
                this.field4445 = this.field4436 - 1;
            }
            this.field4442 = (int) ((double) this.field4440[this.field4445] / 65536.0D * (double) arg0);
            if (this.field4442 > this.field4446) {
                this.field4444 = ((this.field4441[this.field4445] << 15) - this.field4443) / (this.field4442 - this.field4446);
            }
        }
        this.field4443 += this.field4444;
        this.field4446++;
        return this.field4443 - this.field4444 >> 15;
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "()V")
    public class325() {
        this.field4440[0] = 0;
        this.field4440[1] = 65535;
        this.field4441[0] = 0;
        this.field4441[1] = 65535;
    }
}
