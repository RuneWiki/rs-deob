import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class14 {

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
    private int field226 = 2;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "[I")
    private int[] field223 = new int[2];

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "[I")
    private int[] field225 = new int[2];

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    public int field222;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public int field224;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
    public int field227;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    private int field228;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
    private int field229;

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "I")
    private int field230;

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "I")
    private int field231;

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "I")
    private int field232;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lb;)V", line = 3)
    public final void method116(class94 arg0) {
        this.field226 = arg0.method756(915905888);
        this.field223 = new int[this.field226];
        this.field225 = new int[this.field226];
        for (int var2 = 0; var2 < this.field226; var2++) {
            this.field223[var2] = arg0.method761((byte) 108);
            this.field225[var2] = arg0.method761((byte) 108);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)I", line = 23)
    public final int method117(int arg0) {
        if (this.field228 >= this.field231) {
            this.field230 = this.field225[this.field232++] << 15;
            if (this.field232 >= this.field226) {
                this.field232 = this.field226 - 1;
            }
            this.field231 = (int) ((double) this.field223[this.field232] / 65536.0D * (double) arg0);
            if (this.field231 > this.field228) {
                this.field229 = ((this.field225[this.field232] << 15) - this.field230) / (this.field231 - this.field228);
            }
        }
        this.field230 += this.field229;
        this.field228++;
        return this.field230 - this.field229 >> 15;
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(Lb;)V", line = 42)
    public final void method118(class94 arg0) {
        this.field224 = arg0.method756(915905888);
        this.field222 = arg0.method747(false);
        this.field227 = arg0.method747(false);
        this.method116(arg0);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "()V", line = 48)
    public final void method119() {
        this.field231 = 0;
        this.field232 = 0;
        this.field229 = 0;
        this.field230 = 0;
        this.field228 = 0;
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V", line = 56)
    public class14() {
        this.field223[0] = 0;
        this.field223[1] = 65535;
        this.field225[0] = 0;
        this.field225[1] = 65535;
    }
}
