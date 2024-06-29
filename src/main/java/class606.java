import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class606 {

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public int field8721;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public int field8720;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "[I")
    public int[] field8723;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "[I")
    public int[] field8722;

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V")
    public class606() {
        class476.method2793(16);
        this.field8721 = class476.method2800() == 0 ? 1 : class476.method2793(4) + 1;
        if (class476.method2800() != 0) {
            class476.method2793(8);
        }
        class476.method2793(2);
        if (this.field8721 > 1) {
            this.field8720 = class476.method2793(4);
        }
        this.field8723 = new int[this.field8721];
        this.field8722 = new int[this.field8721];
        for (int var1 = 0; var1 < this.field8721; var1++) {
            class476.method2793(8);
            this.field8723[var1] = class476.method2793(8);
            this.field8722[var1] = class476.method2793(8);
        }
    }
}
