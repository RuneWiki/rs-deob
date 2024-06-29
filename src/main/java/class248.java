import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class248 {

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
    private int field3216 = 2;

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "[I")
    private int[] field3220 = new int[2];

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "[I")
    private int[] field3219 = new int[2];

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "I")
    public int field3217;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
    public int field3218;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "I")
    public int field3221;

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "I")
    private int field3222;

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "I")
    private int field3223;

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "I")
    private int field3224;

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "I")
    private int field3225;

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "I")
    private int field3226;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "()V", line = 3)
    public final void method1486() {
        this.field3224 = 0;
        this.field3222 = 0;
        this.field3225 = 0;
        this.field3223 = 0;
        this.field3226 = 0;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)I", line = 14)
    public final int method1487(int arg0) {
        if (this.field3226 >= this.field3224) {
            this.field3223 = this.field3219[this.field3222++] << 15;
            if (this.field3222 >= this.field3216) {
                this.field3222 = this.field3216 - 1;
            }
            this.field3224 = (int) ((double) this.field3220[this.field3222] / 65536.0D * (double) arg0);
            if (this.field3224 > this.field3226) {
                this.field3225 = ((this.field3219[this.field3222] << 15) - this.field3223) / (this.field3224 - this.field3226);
            }
        }
        this.field3223 += this.field3225;
        this.field3226++;
        return this.field3223 - this.field3225 >> 15;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lji;)V", line = 31)
    public final void method1488(class611 arg0) {
        this.field3218 = arg0.method3428((byte) 115);
        this.field3221 = arg0.method3418(-2);
        this.field3217 = arg0.method3418(-2);
        this.method1489(arg0);
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(Lji;)V", line = 40)
    public final void method1489(class611 arg0) {
        this.field3216 = arg0.method3428((byte) 93);
        this.field3220 = new int[this.field3216];
        this.field3219 = new int[this.field3216];
        for (int var2 = 0; var2 < this.field3216; var2++) {
            this.field3220[var2] = arg0.method3402((byte) 127);
            this.field3219[var2] = arg0.method3402((byte) 127);
        }
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "()V", line = 56)
    public class248() {
        this.field3220[0] = 0;
        this.field3220[1] = 65535;
        this.field3219[0] = 0;
        this.field3219[1] = 65535;
    }
}
