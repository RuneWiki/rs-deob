import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class241 {

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "I")
    private int field4152 = 2;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "[I")
    private int[] field4148 = new int[2];

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "[I")
    private int[] field4151 = new int[2];

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    public int field4149;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
    public int field4150;

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "I")
    public int field4153;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
    private int field4154;

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "I")
    private int field4155;

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "I")
    private int field4156;

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "I")
    private int field4157;

    @OriginalMember(owner = "client!jk", name = "k", descriptor = "I")
    private int field4158;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "()V")
    public final void method1688() {
        this.field4158 = 0;
        this.field4157 = 0;
        this.field4156 = 0;
        this.field4155 = 0;
        this.field4154 = 0;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lfk;)V")
    public final void method1689(class14 arg0) {
        this.field4152 = arg0.method200(255);
        this.field4148 = new int[this.field4152];
        this.field4151 = new int[this.field4152];
        for (int var2 = 0; var2 < this.field4152; var2++) {
            this.field4148[var2] = arg0.method161(4);
            this.field4151[var2] = arg0.method161(4);
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)I")
    public final int method1690(int arg0) {
        if (this.field4154 >= this.field4158) {
            this.field4155 = this.field4151[this.field4157++] << 15;
            if (this.field4157 >= this.field4152) {
                this.field4157 = this.field4152 - 1;
            }
            this.field4158 = (int) ((double) this.field4148[this.field4157] / 65536.0D * (double) arg0);
            if (this.field4158 > this.field4154) {
                this.field4156 = ((this.field4151[this.field4157] << 15) - this.field4155) / (this.field4158 - this.field4154);
            }
        }
        this.field4155 += this.field4156;
        this.field4154++;
        return this.field4155 - this.field4156 >> 15;
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(Lfk;)V")
    public final void method1691(class14 arg0) {
        this.field4150 = arg0.method200(255);
        this.field4149 = arg0.method187((byte) 61);
        this.field4153 = arg0.method187((byte) 61);
        this.method1689(arg0);
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "()V")
    public class241() {
        this.field4148[0] = 0;
        this.field4148[1] = 65535;
        this.field4151[0] = 0;
        this.field4151[1] = 65535;
    }
}
