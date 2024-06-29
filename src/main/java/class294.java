import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class294 {

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "I")
    private int field4028 = 2;

    @OriginalMember(owner = "client!fp", name = "f", descriptor = "[I")
    private int[] field4032 = new int[2];

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "[I")
    private int[] field4029 = new int[2];

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "I")
    public int field4027;

    @OriginalMember(owner = "client!fp", name = "d", descriptor = "I")
    public int field4030;

    @OriginalMember(owner = "client!fp", name = "e", descriptor = "I")
    public int field4031;

    @OriginalMember(owner = "client!fp", name = "g", descriptor = "I")
    private int field4033;

    @OriginalMember(owner = "client!fp", name = "h", descriptor = "I")
    private int field4034;

    @OriginalMember(owner = "client!fp", name = "i", descriptor = "I")
    private int field4035;

    @OriginalMember(owner = "client!fp", name = "j", descriptor = "I")
    private int field4036;

    @OriginalMember(owner = "client!fp", name = "k", descriptor = "I")
    private int field4037;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lac;)V", line = 4)
    public final void method1794(class501 arg0) {
        this.field4027 = arg0.method2874((byte) -75);
        this.field4031 = arg0.method2840(false);
        this.field4030 = arg0.method2840(false);
        this.method1797(arg0);
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "()V", line = 10)
    public final void method1795() {
        this.field4037 = 0;
        this.field4033 = 0;
        this.field4036 = 0;
        this.field4034 = 0;
        this.field4035 = 0;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)I", line = 21)
    public final int method1796(int arg0) {
        if (this.field4035 >= this.field4037) {
            this.field4034 = this.field4029[this.field4033++] << 15;
            if (this.field4033 >= this.field4028) {
                this.field4033 = this.field4028 - 1;
            }
            this.field4037 = (int) ((double) this.field4032[this.field4033] / 65536.0D * (double) arg0);
            if (this.field4037 > this.field4035) {
                this.field4036 = ((this.field4029[this.field4033] << 15) - this.field4034) / (this.field4037 - this.field4035);
            }
        }
        this.field4034 += this.field4036;
        this.field4035++;
        return this.field4034 - this.field4036 >> 15;
    }

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(Lac;)V", line = 40)
    public final void method1797(class501 arg0) {
        this.field4028 = arg0.method2874((byte) -75);
        this.field4032 = new int[this.field4028];
        this.field4029 = new int[this.field4028];
        for (int var2 = 0; var2 < this.field4028; var2++) {
            this.field4032[var2] = arg0.method2845(-1);
            this.field4029[var2] = arg0.method2845(-1);
        }
    }

    @OriginalMember(owner = "client!fp", name = "<init>", descriptor = "()V", line = 56)
    public class294() {
        this.field4032[0] = 0;
        this.field4032[1] = 65535;
        this.field4029[0] = 0;
        this.field4029[1] = 65535;
    }
}
