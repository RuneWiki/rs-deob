import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class386 {

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
    private int field5827 = 2;

    @OriginalMember(owner = "client!vk", name = "k", descriptor = "[I")
    private int[] field5830 = new int[2];

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "[I")
    private int[] field5828 = new int[2];

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "I")
    public int field5829;

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
    public int field5831;

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "I")
    public int field5832;

    @OriginalMember(owner = "client!vk", name = "j", descriptor = "I")
    private int field5833;

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "I")
    private int field5834;

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "I")
    private int field5835;

    @OriginalMember(owner = "client!vk", name = "i", descriptor = "I")
    private int field5836;

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "I")
    private int field5837;

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(Lib;)V", line = 5)
    public final void method3082(class163 arg0) {
        this.field5831 = arg0.method1455((byte) 62);
        this.field5829 = arg0.method1453((byte) 91);
        this.field5832 = arg0.method1453((byte) 86);
        this.method3084(arg0);
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)I", line = 11)
    public final int method3083(int arg0) {
        if (this.field5837 >= this.field5834) {
            this.field5833 = this.field5828[this.field5835++] << 15;
            if (this.field5835 >= this.field5827) {
                this.field5835 = this.field5827 - 1;
            }
            this.field5834 = (int) ((double) this.field5830[this.field5835] / 65536.0D * (double) arg0);
            if (this.field5834 > this.field5837) {
                this.field5836 = ((this.field5828[this.field5835] << 15) - this.field5833) / (this.field5834 - this.field5837);
            }
        }
        this.field5833 += this.field5836;
        this.field5837++;
        return this.field5833 - this.field5836 >> 15;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lib;)V", line = 28)
    public final void method3084(class163 arg0) {
        this.field5827 = arg0.method1455((byte) 62);
        this.field5830 = new int[this.field5827];
        this.field5828 = new int[this.field5827];
        for (int var2 = 0; var2 < this.field5827; var2++) {
            this.field5830[var2] = arg0.method1445((byte) 122);
            this.field5828[var2] = arg0.method1445((byte) 107);
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "()V", line = 44)
    public final void method3085() {
        this.field5834 = 0;
        this.field5835 = 0;
        this.field5836 = 0;
        this.field5833 = 0;
        this.field5837 = 0;
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "()V", line = 56)
    public class386() {
        this.field5830[0] = 0;
        this.field5830[1] = 65535;
        this.field5828[0] = 0;
        this.field5828[1] = 65535;
    }
}
