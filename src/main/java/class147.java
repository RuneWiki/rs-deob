import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class147 {

    @OriginalMember(owner = "client!va", name = "b", descriptor = "I")
    public int field3268;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "I")
    public int field3270;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "[I")
    public int[] field3269;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "[I")
    public int[] field3267;

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V")
    public class147() {
        class5.method19(16);
        this.field3268 = class5.method26() == 0 ? 1 : class5.method19(4) + 1;
        if (class5.method26() != 0) {
            class5.method19(8);
        }
        class5.method19(2);
        if (this.field3268 > 1) {
            this.field3270 = class5.method19(4);
        }
        this.field3269 = new int[this.field3268];
        this.field3267 = new int[this.field3268];
        for (int var1 = 0; var1 < this.field3268; var1++) {
            class5.method19(8);
            this.field3269[var1] = class5.method19(8);
            this.field3267[var1] = class5.method19(8);
        }
    }
}
