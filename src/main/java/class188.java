import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class188 {

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
    private int field3219 = 2;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "[I")
    private int[] field3215 = new int[2];

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "[I")
    private int[] field3214 = new int[2];

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
    public int field3216;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
    public int field3217;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
    public int field3218;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "I")
    private int field3220;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "I")
    private int field3221;

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "I")
    private int field3222;

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "I")
    private int field3223;

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "I")
    private int field3224;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lfe;)V", line = 10)
    public final void method1227(class229 arg0) {
        this.field3219 = arg0.method1535((byte) 88);
        this.field3215 = new int[this.field3219];
        this.field3214 = new int[this.field3219];
        for (int var2 = 0; var2 < this.field3219; var2++) {
            this.field3215[var2] = arg0.method1496(true);
            this.field3214[var2] = arg0.method1496(true);
        }
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(Lfe;)V", line = 26)
    public final void method1228(class229 arg0) {
        this.field3216 = arg0.method1535((byte) 87);
        this.field3217 = arg0.method1528(true);
        this.field3218 = arg0.method1528(true);
        this.method1227(arg0);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)I", line = 32)
    public final int method1229(int arg0) {
        if (this.field3220 >= this.field3221) {
            this.field3223 = this.field3214[this.field3224++] << 15;
            if (this.field3224 >= this.field3219) {
                this.field3224 = this.field3219 - 1;
            }
            this.field3221 = (int) ((double) this.field3215[this.field3224] / 65536.0D * (double) arg0);
            if (this.field3221 > this.field3220) {
                this.field3222 = ((this.field3214[this.field3224] << 15) - this.field3223) / (this.field3221 - this.field3220);
            }
        }
        this.field3223 += this.field3222;
        this.field3220++;
        return this.field3223 - this.field3222 >> 15;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "()V", line = 49)
    public final void method1230() {
        this.field3221 = 0;
        this.field3224 = 0;
        this.field3222 = 0;
        this.field3223 = 0;
        this.field3220 = 0;
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "()V", line = 56)
    public class188() {
        this.field3215[0] = 0;
        this.field3215[1] = 65535;
        this.field3214[0] = 0;
        this.field3214[1] = 65535;
    }
}
