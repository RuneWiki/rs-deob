import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class225 {

    @OriginalMember(owner = "client!re", name = "d", descriptor = "I")
    private int field3877 = 2;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "[I")
    private int[] field3874 = new int[2];

    @OriginalMember(owner = "client!re", name = "b", descriptor = "[I")
    private int[] field3875 = new int[2];

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public int field3876;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    public int field3878;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "I")
    public int field3879;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "I")
    private int field3880;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "I")
    private int field3881;

    @OriginalMember(owner = "client!re", name = "i", descriptor = "I")
    private int field3882;

    @OriginalMember(owner = "client!re", name = "j", descriptor = "I")
    private int field3883;

    @OriginalMember(owner = "client!re", name = "k", descriptor = "I")
    private int field3884;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "()V", line = 6)
    public final void method1548() {
        this.field3880 = 0;
        this.field3883 = 0;
        this.field3881 = 0;
        this.field3882 = 0;
        this.field3884 = 0;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)I", line = 15)
    public final int method1549(int arg0) {
        if (this.field3884 >= this.field3880) {
            this.field3882 = this.field3875[this.field3883++] << 15;
            if (this.field3883 >= this.field3877) {
                this.field3883 = this.field3877 - 1;
            }
            this.field3880 = (int) ((double) this.field3874[this.field3883] / 65536.0D * (double) arg0);
            if (this.field3880 > this.field3884) {
                this.field3881 = ((this.field3875[this.field3883] << 15) - this.field3882) / (this.field3880 - this.field3884);
            }
        }
        this.field3882 += this.field3881;
        this.field3884++;
        return this.field3882 - this.field3881 >> 15;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lia;)V", line = 34)
    public final void method1550(class23 arg0) {
        this.field3877 = arg0.method126((byte) -83);
        this.field3874 = new int[this.field3877];
        this.field3875 = new int[this.field3877];
        for (int var2 = 0; var2 < this.field3877; var2++) {
            this.field3874[var2] = arg0.method132(78);
            this.field3875[var2] = arg0.method132(114);
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(Lia;)V", line = 50)
    public final void method1551(class23 arg0) {
        this.field3878 = arg0.method126((byte) -87);
        this.field3876 = arg0.method143(-3230);
        this.field3879 = arg0.method143(-3230);
        this.method1550(arg0);
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V", line = 56)
    public class225() {
        this.field3874[0] = 0;
        this.field3874[1] = 65535;
        this.field3875[0] = 0;
        this.field3875[1] = 65535;
    }
}
