import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class231 {

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    private int field4188 = 2;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "[I")
    private int[] field4190 = new int[2];

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "[I")
    private int[] field4191 = new int[2];

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public int field4186;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public int field4187;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public int field4189;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
    private int field4192;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
    private int field4193;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
    private int field4194;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "I")
    private int field4195;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "I")
    private int field4196;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)I")
    public final int method1605(int arg0) {
        if (this.field4194 >= this.field4196) {
            this.field4195 = this.field4191[this.field4192++] << 15;
            if (this.field4192 >= this.field4188) {
                this.field4192 = this.field4188 - 1;
            }
            this.field4196 = (int) ((double) this.field4190[this.field4192] / 65536.0D * (double) arg0);
            if (this.field4196 > this.field4194) {
                this.field4193 = ((this.field4191[this.field4192] << 15) - this.field4195) / (this.field4196 - this.field4194);
            }
        }
        this.field4195 += this.field4193;
        this.field4194++;
        return this.field4195 - this.field4193 >> 15;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lqk;)V")
    public final void method1606(class200 arg0) {
        this.field4187 = arg0.method1408((byte) -91);
        this.field4189 = arg0.method1386(-4603);
        this.field4186 = arg0.method1386(-4603);
        this.method1608(arg0);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "()V")
    public final void method1607() {
        this.field4196 = 0;
        this.field4192 = 0;
        this.field4193 = 0;
        this.field4195 = 0;
        this.field4194 = 0;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(Lqk;)V")
    public final void method1608(class200 arg0) {
        this.field4188 = arg0.method1408((byte) -120);
        this.field4190 = new int[this.field4188];
        this.field4191 = new int[this.field4188];
        for (int var2 = 0; var2 < this.field4188; var2++) {
            this.field4190[var2] = arg0.method1410(-68);
            this.field4191[var2] = arg0.method1410(-104);
        }
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V")
    public class231() {
        this.field4190[0] = 0;
        this.field4190[1] = 65535;
        this.field4191[0] = 0;
        this.field4191[1] = 65535;
    }
}
