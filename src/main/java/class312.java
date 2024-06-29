import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class312 {

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "I")
    public int field3986;

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "I")
    public int field3989;

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "[I")
    public int[] field3987;

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "[I")
    public int[] field3988;

    @OriginalMember(owner = "client!lq", name = "<init>", descriptor = "()V")
    public class312() {
        class759.method4226(16);
        this.field3986 = class759.method4220() == 0 ? 1 : class759.method4226(4) + 1;
        if (class759.method4220() != 0) {
            class759.method4226(8);
        }
        class759.method4226(2);
        if (this.field3986 > 1) {
            this.field3989 = class759.method4226(4);
        }
        this.field3987 = new int[this.field3986];
        this.field3988 = new int[this.field3986];
        for (int var1 = 0; var1 < this.field3986; var1++) {
            class759.method4226(8);
            this.field3987[var1] = class759.method4226(8);
            this.field3988[var1] = class759.method4226(8);
        }
    }
}
