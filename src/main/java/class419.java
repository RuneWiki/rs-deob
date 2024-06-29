import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class419 {

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "I")
    private int field5712 = 2;

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "[I")
    private int[] field5711 = new int[2];

    @OriginalMember(owner = "client!mt", name = "f", descriptor = "[I")
    private int[] field5716 = new int[2];

    @OriginalMember(owner = "client!mt", name = "c", descriptor = "I")
    public int field5713;

    @OriginalMember(owner = "client!mt", name = "d", descriptor = "I")
    public int field5714;

    @OriginalMember(owner = "client!mt", name = "e", descriptor = "I")
    public int field5715;

    @OriginalMember(owner = "client!mt", name = "g", descriptor = "I")
    private int field5717;

    @OriginalMember(owner = "client!mt", name = "h", descriptor = "I")
    private int field5718;

    @OriginalMember(owner = "client!mt", name = "i", descriptor = "I")
    private int field5719;

    @OriginalMember(owner = "client!mt", name = "j", descriptor = "I")
    private int field5720;

    @OriginalMember(owner = "client!mt", name = "k", descriptor = "I")
    private int field5721;

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(I)I")
    public final int method2463(int arg0) {
        if (this.field5720 >= this.field5721) {
            this.field5717 = this.field5716[this.field5719++] << 15;
            if (this.field5719 >= this.field5712) {
                this.field5719 = this.field5712 - 1;
            }
            this.field5721 = (int) ((double) this.field5711[this.field5719] / 65536.0D * (double) arg0);
            if (this.field5721 > this.field5720) {
                this.field5718 = ((this.field5716[this.field5719] << 15) - this.field5717) / (this.field5721 - this.field5720);
            }
        }
        this.field5717 += this.field5718;
        this.field5720++;
        return this.field5717 - this.field5718 >> 15;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(Lfca;)V")
    public final void method2464(class93 arg0) {
        this.field5712 = arg0.method793((byte) 57);
        this.field5711 = new int[this.field5712];
        this.field5716 = new int[this.field5712];
        for (int var2 = 0; var2 < this.field5712; var2++) {
            this.field5711[var2] = arg0.method763(105);
            this.field5716[var2] = arg0.method763(126);
        }
    }

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "(Lfca;)V")
    public final void method2465(class93 arg0) {
        this.field5715 = arg0.method793((byte) 99);
        this.field5713 = arg0.method773(3);
        this.field5714 = arg0.method773(3);
        this.method2464(arg0);
    }

    @OriginalMember(owner = "client!mt", name = "<init>", descriptor = "()V")
    public class419() {
        this.field5711[0] = 0;
        this.field5711[1] = 65535;
        this.field5716[0] = 0;
        this.field5716[1] = 65535;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "()V")
    public final void method2466() {
        this.field5721 = 0;
        this.field5719 = 0;
        this.field5718 = 0;
        this.field5717 = 0;
        this.field5720 = 0;
    }
}
