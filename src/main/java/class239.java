import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class239 {

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    private int field4150 = 2;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "[I")
    private int[] field4152 = new int[2];

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "[I")
    private int[] field4148 = new int[2];

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
    public int field4147;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
    public int field4149;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
    public int field4151;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
    private int field4153;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "I")
    private int field4154;

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "I")
    private int field4155;

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "I")
    private int field4156;

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "I")
    private int field4157;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Llh;)V")
    public final void method1572(class249 arg0) {
        this.field4150 = arg0.method1677(-6677);
        this.field4152 = new int[this.field4150];
        this.field4148 = new int[this.field4150];
        for (int var2 = 0; var2 < this.field4150; var2++) {
            this.field4152[var2] = arg0.method1674(1355769544);
            this.field4148[var2] = arg0.method1674(1355769544);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)I")
    public final int method1573(int arg0) {
        if (this.field4153 >= this.field4154) {
            this.field4156 = this.field4148[this.field4157++] << 15;
            if (this.field4157 >= this.field4150) {
                this.field4157 = this.field4150 - 1;
            }
            this.field4154 = (int) ((double) this.field4152[this.field4157] / 65536.0D * (double) arg0);
            if (this.field4154 > this.field4153) {
                this.field4155 = ((this.field4148[this.field4157] << 15) - this.field4156) / (this.field4154 - this.field4153);
            }
        }
        this.field4156 += this.field4155;
        this.field4153++;
        return this.field4156 - this.field4155 >> 15;
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(Llh;)V")
    public final void method1574(class249 arg0) {
        this.field4149 = arg0.method1677(-6677);
        this.field4147 = arg0.method1652(-5528);
        this.field4151 = arg0.method1652(-5528);
        this.method1572(arg0);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "()V")
    public final void method1575() {
        this.field4154 = 0;
        this.field4157 = 0;
        this.field4155 = 0;
        this.field4156 = 0;
        this.field4153 = 0;
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V")
    public class239() {
        this.field4152[0] = 0;
        this.field4152[1] = 65535;
        this.field4148[0] = 0;
        this.field4148[1] = 65535;
    }
}
