import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vaa")
public class class261 {

    @OriginalMember(owner = "client!vaa", name = "c", descriptor = "I")
    private int field3393 = 2;

    @OriginalMember(owner = "client!vaa", name = "f", descriptor = "[I")
    private int[] field3396 = new int[2];

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "[I")
    private int[] field3391 = new int[2];

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "I")
    public int field3392;

    @OriginalMember(owner = "client!vaa", name = "d", descriptor = "I")
    public int field3394;

    @OriginalMember(owner = "client!vaa", name = "e", descriptor = "I")
    public int field3395;

    @OriginalMember(owner = "client!vaa", name = "g", descriptor = "I")
    private int field3397;

    @OriginalMember(owner = "client!vaa", name = "h", descriptor = "I")
    private int field3398;

    @OriginalMember(owner = "client!vaa", name = "i", descriptor = "I")
    private int field3399;

    @OriginalMember(owner = "client!vaa", name = "j", descriptor = "I")
    private int field3400;

    @OriginalMember(owner = "client!vaa", name = "k", descriptor = "I")
    private int field3401;

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Lio;)V")
    public final void method1568(class157 arg0) {
        this.field3393 = arg0.method930(255);
        this.field3396 = new int[this.field3393];
        this.field3391 = new int[this.field3393];
        for (int var2 = 0; var2 < this.field3393; var2++) {
            this.field3396[var2] = arg0.method963(-123);
            this.field3391[var2] = arg0.method963(-128);
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(I)I")
    public final int method1569(int arg0) {
        if (this.field3399 >= this.field3401) {
            this.field3400 = this.field3391[this.field3397++] << 15;
            if (this.field3397 >= this.field3393) {
                this.field3397 = this.field3393 - 1;
            }
            this.field3401 = (int) ((double) this.field3396[this.field3397] / 65536.0D * (double) arg0);
            if (this.field3401 > this.field3399) {
                this.field3398 = ((this.field3391[this.field3397] << 15) - this.field3400) / (this.field3401 - this.field3399);
            }
        }
        this.field3400 += this.field3398;
        this.field3399++;
        return this.field3400 - this.field3398 >> 15;
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "()V")
    public final void method1570() {
        this.field3401 = 0;
        this.field3397 = 0;
        this.field3398 = 0;
        this.field3400 = 0;
        this.field3399 = 0;
    }

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "(Lio;)V")
    public final void method1571(class157 arg0) {
        this.field3395 = arg0.method930(255);
        this.field3392 = arg0.method908(false);
        this.field3394 = arg0.method908(false);
        this.method1568(arg0);
    }

    @OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "()V")
    public class261() {
        this.field3396[0] = 0;
        this.field3396[1] = 65535;
        this.field3391[0] = 0;
        this.field3391[1] = 65535;
    }
}
