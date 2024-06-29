import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class332 {

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "I")
    private int field4192 = 2;

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "[I")
    private int[] field4195 = new int[2];

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "[I")
    private int[] field4190 = new int[2];

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "I")
    public int field4191;

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "I")
    public int field4193;

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "I")
    public int field4194;

    @OriginalMember(owner = "client!nm", name = "g", descriptor = "I")
    private int field4196;

    @OriginalMember(owner = "client!nm", name = "h", descriptor = "I")
    private int field4197;

    @OriginalMember(owner = "client!nm", name = "i", descriptor = "I")
    private int field4198;

    @OriginalMember(owner = "client!nm", name = "j", descriptor = "I")
    private int field4199;

    @OriginalMember(owner = "client!nm", name = "k", descriptor = "I")
    private int field4200;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lfh;)V", line = 4)
    public final void method1925(class463 arg0) {
        this.field4192 = arg0.method2737(false);
        this.field4195 = new int[this.field4192];
        this.field4190 = new int[this.field4192];
        for (int var2 = 0; var2 < this.field4192; var2++) {
            this.field4195[var2] = arg0.method2758((byte) 91);
            this.field4190[var2] = arg0.method2758((byte) 95);
        }
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(Lfh;)V", line = 19)
    public final void method1926(class463 arg0) {
        this.field4194 = arg0.method2737(false);
        this.field4191 = arg0.method2727(-94);
        this.field4193 = arg0.method2727(-105);
        this.method1925(arg0);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "()V", line = 25)
    public final void method1927() {
        this.field4196 = 0;
        this.field4198 = 0;
        this.field4199 = 0;
        this.field4197 = 0;
        this.field4200 = 0;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)I", line = 36)
    public final int method1928(int arg0) {
        if (this.field4200 >= this.field4196) {
            this.field4197 = this.field4190[this.field4198++] << 15;
            if (this.field4198 >= this.field4192) {
                this.field4198 = this.field4192 - 1;
            }
            this.field4196 = (int) ((double) this.field4195[this.field4198] / 65536.0D * (double) arg0);
            if (this.field4196 > this.field4200) {
                this.field4199 = ((this.field4190[this.field4198] << 15) - this.field4197) / (this.field4196 - this.field4200);
            }
        }
        this.field4197 += this.field4199;
        this.field4200++;
        return this.field4197 - this.field4199 >> 15;
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "()V", line = 56)
    public class332() {
        this.field4195[0] = 0;
        this.field4195[1] = 65535;
        this.field4190[0] = 0;
        this.field4190[1] = 65535;
    }
}
