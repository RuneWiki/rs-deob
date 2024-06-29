import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class184 {

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
    private int field3326 = 2;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "[I")
    private int[] field3330 = new int[2];

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "[I")
    private int[] field3328 = new int[2];

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public int field3327;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
    public int field3329;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    public int field3331;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
    private int field3332;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
    private int field3333;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
    private int field3334;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "I")
    private int field3335;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
    private int field3336;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lfh;)V")
    public final void method1334(class128 arg0) {
        this.field3326 = arg0.method937(false);
        this.field3330 = new int[this.field3326];
        this.field3328 = new int[this.field3326];
        for (int var2 = 0; var2 < this.field3326; var2++) {
            this.field3330[var2] = arg0.method912(127);
            this.field3328[var2] = arg0.method912(76);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "()V")
    public final void method1335() {
        this.field3335 = 0;
        this.field3336 = 0;
        this.field3334 = 0;
        this.field3333 = 0;
        this.field3332 = 0;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(Lfh;)V")
    public final void method1336(class128 arg0) {
        this.field3331 = arg0.method937(false);
        this.field3327 = arg0.method923(true);
        this.field3329 = arg0.method923(true);
        this.method1334(arg0);
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "()V")
    public class184() {
        this.field3330[0] = 0;
        this.field3330[1] = 65535;
        this.field3328[0] = 0;
        this.field3328[1] = 65535;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)I")
    public final int method1337(int arg0) {
        if (this.field3332 >= this.field3335) {
            this.field3333 = this.field3328[this.field3336++] << 15;
            if (this.field3336 >= this.field3326) {
                this.field3336 = this.field3326 - 1;
            }
            this.field3335 = (int) ((double) this.field3330[this.field3336] / 65536.0D * (double) arg0);
            if (this.field3335 > this.field3332) {
                this.field3334 = ((this.field3328[this.field3336] << 15) - this.field3333) / (this.field3335 - this.field3332);
            }
        }
        this.field3333 += this.field3334;
        this.field3332++;
        return this.field3333 - this.field3334 >> 15;
    }
}
