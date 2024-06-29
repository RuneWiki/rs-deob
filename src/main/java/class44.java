import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class44 {

    @OriginalMember(owner = "client!qs", name = "f", descriptor = "I")
    private int field519 = 2;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "[I")
    private int[] field514 = new int[2];

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "[I")
    private int[] field516 = new int[2];

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "I")
    public int field515;

    @OriginalMember(owner = "client!qs", name = "d", descriptor = "I")
    public int field517;

    @OriginalMember(owner = "client!qs", name = "e", descriptor = "I")
    public int field518;

    @OriginalMember(owner = "client!qs", name = "g", descriptor = "I")
    private int field520;

    @OriginalMember(owner = "client!qs", name = "h", descriptor = "I")
    private int field521;

    @OriginalMember(owner = "client!qs", name = "i", descriptor = "I")
    private int field522;

    @OriginalMember(owner = "client!qs", name = "j", descriptor = "I")
    private int field523;

    @OriginalMember(owner = "client!qs", name = "k", descriptor = "I")
    private int field524;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "()V")
    public final void method264() {
        this.field523 = 0;
        this.field520 = 0;
        this.field522 = 0;
        this.field524 = 0;
        this.field521 = 0;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(Lbg;)V")
    public final void method265(class242 arg0) {
        this.field515 = arg0.method1563(-128);
        this.field518 = arg0.method1576((byte) 123);
        this.field517 = arg0.method1576((byte) 124);
        this.method267(arg0);
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)I")
    public final int method266(int arg0) {
        if (this.field521 >= this.field523) {
            this.field524 = this.field516[this.field520++] << 15;
            if (this.field520 >= this.field519) {
                this.field520 = this.field519 - 1;
            }
            this.field523 = (int) ((double) this.field514[this.field520] / 65536.0D * (double) arg0);
            if (this.field523 > this.field521) {
                this.field522 = ((this.field516[this.field520] << 15) - this.field524) / (this.field523 - this.field521);
            }
        }
        this.field524 += this.field522;
        this.field521++;
        return this.field524 - this.field522 >> 15;
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(Lbg;)V")
    public final void method267(class242 arg0) {
        this.field519 = arg0.method1563(-128);
        this.field514 = new int[this.field519];
        this.field516 = new int[this.field519];
        for (int var2 = 0; var2 < this.field519; var2++) {
            this.field514[var2] = arg0.method1587((byte) -102);
            this.field516[var2] = arg0.method1587((byte) -102);
        }
    }

    @OriginalMember(owner = "client!qs", name = "<init>", descriptor = "()V")
    public class44() {
        this.field514[0] = 0;
        this.field514[1] = 65535;
        this.field516[0] = 0;
        this.field516[1] = 65535;
    }
}
