import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class162 {

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
    private int field2647 = 2;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "[I")
    private int[] field2645 = new int[2];

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "[I")
    private int[] field2648 = new int[2];

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public int field2644;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public int field2646;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
    public int field2649;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
    private int field2650;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
    private int field2651;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "I")
    private int field2652;

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
    private int field2653;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
    private int field2654;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lek;)V")
    public final void method1228(class465 arg0) {
        this.field2647 = arg0.method2705(-36);
        this.field2645 = new int[this.field2647];
        this.field2648 = new int[this.field2647];
        for (int var2 = 0; var2 < this.field2647; var2++) {
            this.field2645[var2] = arg0.method2755((byte) -97);
            this.field2648[var2] = arg0.method2755((byte) -85);
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(Lek;)V")
    public final void method1229(class465 arg0) {
        this.field2646 = arg0.method2705(-82);
        this.field2644 = arg0.method2691((byte) -67);
        this.field2649 = arg0.method2691((byte) -67);
        this.method1228(arg0);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)I")
    public final int method1230(int arg0) {
        if (this.field2650 >= this.field2654) {
            this.field2652 = this.field2648[this.field2651++] << 15;
            if (this.field2651 >= this.field2647) {
                this.field2651 = this.field2647 - 1;
            }
            this.field2654 = (int) ((double) this.field2645[this.field2651] / 65536.0D * (double) arg0);
            if (this.field2654 > this.field2650) {
                this.field2653 = ((this.field2648[this.field2651] << 15) - this.field2652) / (this.field2654 - this.field2650);
            }
        }
        this.field2652 += this.field2653;
        this.field2650++;
        return this.field2652 - this.field2653 >> 15;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "()V")
    public final void method1231() {
        this.field2654 = 0;
        this.field2651 = 0;
        this.field2653 = 0;
        this.field2652 = 0;
        this.field2650 = 0;
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "()V")
    public class162() {
        this.field2645[0] = 0;
        this.field2645[1] = 65535;
        this.field2648[0] = 0;
        this.field2648[1] = 65535;
    }
}
