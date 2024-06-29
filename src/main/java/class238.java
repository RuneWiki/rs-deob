import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class238 {

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "I")
    private int field3195 = 2;

    @OriginalMember(owner = "client!rs", name = "d", descriptor = "[I")
    private int[] field3197 = new int[2];

    @OriginalMember(owner = "client!rs", name = "e", descriptor = "[I")
    private int[] field3198 = new int[2];

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "I")
    public int field3194;

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "I")
    public int field3196;

    @OriginalMember(owner = "client!rs", name = "f", descriptor = "I")
    public int field3199;

    @OriginalMember(owner = "client!rs", name = "g", descriptor = "I")
    private int field3200;

    @OriginalMember(owner = "client!rs", name = "h", descriptor = "I")
    private int field3201;

    @OriginalMember(owner = "client!rs", name = "i", descriptor = "I")
    private int field3202;

    @OriginalMember(owner = "client!rs", name = "j", descriptor = "I")
    private int field3203;

    @OriginalMember(owner = "client!rs", name = "k", descriptor = "I")
    private int field3204;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lnj;)V", line = 3)
    public final void method1438(class228 arg0) {
        this.field3195 = arg0.method1348(-112);
        this.field3197 = new int[this.field3195];
        this.field3198 = new int[this.field3195];
        for (int var2 = 0; var2 < this.field3195; var2++) {
            this.field3197[var2] = arg0.method1343(255);
            this.field3198[var2] = arg0.method1343(255);
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "()V", line = 18)
    public final void method1439() {
        this.field3203 = 0;
        this.field3202 = 0;
        this.field3201 = 0;
        this.field3200 = 0;
        this.field3204 = 0;
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(Lnj;)V", line = 26)
    public final void method1440(class228 arg0) {
        this.field3199 = arg0.method1348(-116);
        this.field3196 = arg0.method1344((byte) 113);
        this.field3194 = arg0.method1344((byte) 123);
        this.method1438(arg0);
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)I", line = 35)
    public final int method1441(int arg0) {
        if (this.field3204 >= this.field3203) {
            this.field3200 = this.field3198[this.field3202++] << 15;
            if (this.field3202 >= this.field3195) {
                this.field3202 = this.field3195 - 1;
            }
            this.field3203 = (int) ((double) this.field3197[this.field3202] / 65536.0D * (double) arg0);
            if (this.field3203 > this.field3204) {
                this.field3201 = ((this.field3198[this.field3202] << 15) - this.field3200) / (this.field3203 - this.field3204);
            }
        }
        this.field3200 += this.field3201;
        this.field3204++;
        return this.field3200 - this.field3201 >> 15;
    }

    @OriginalMember(owner = "client!rs", name = "<init>", descriptor = "()V", line = 56)
    public class238() {
        this.field3197[0] = 0;
        this.field3197[1] = 65535;
        this.field3198[0] = 0;
        this.field3198[1] = 65535;
    }
}
