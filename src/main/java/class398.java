import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class398 {

    @OriginalMember(owner = "client!df", name = "f", descriptor = "I")
    private int field5571 = 2;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "[I")
    private int[] field5566 = new int[2];

    @OriginalMember(owner = "client!df", name = "c", descriptor = "[I")
    private int[] field5568 = new int[2];

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    public int field5567;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    public int field5569;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "I")
    public int field5570;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "I")
    private int field5572;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "I")
    private int field5573;

    @OriginalMember(owner = "client!df", name = "i", descriptor = "I")
    private int field5574;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "I")
    private int field5575;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "I")
    private int field5576;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lud;)V", line = 6)
    public final void method2467(class35 arg0) {
        this.field5571 = arg0.method273(255);
        this.field5566 = new int[this.field5571];
        this.field5568 = new int[this.field5571];
        for (int var2 = 0; var2 < this.field5571; var2++) {
            this.field5566[var2] = arg0.method253(-13900);
            this.field5568[var2] = arg0.method253(-13900);
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(Lud;)V", line = 25)
    public final void method2468(class35 arg0) {
        this.field5567 = arg0.method273(255);
        this.field5570 = arg0.method234((byte) -97);
        this.field5569 = arg0.method234((byte) -121);
        this.method2467(arg0);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "()V", line = 33)
    public final void method2469() {
        this.field5576 = 0;
        this.field5573 = 0;
        this.field5572 = 0;
        this.field5575 = 0;
        this.field5574 = 0;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)I", line = 40)
    public final int method2470(int arg0) {
        if (this.field5574 >= this.field5576) {
            this.field5575 = this.field5568[this.field5573++] << 15;
            if (this.field5573 >= this.field5571) {
                this.field5573 = this.field5571 - 1;
            }
            this.field5576 = (int) ((double) this.field5566[this.field5573] / 65536.0D * (double) arg0);
            if (this.field5576 > this.field5574) {
                this.field5572 = ((this.field5568[this.field5573] << 15) - this.field5575) / (this.field5576 - this.field5574);
            }
        }
        this.field5575 += this.field5572;
        this.field5574++;
        return this.field5575 - this.field5572 >> 15;
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V", line = 56)
    public class398() {
        this.field5566[0] = 0;
        this.field5566[1] = 65535;
        this.field5568[0] = 0;
        this.field5568[1] = 65535;
    }
}
