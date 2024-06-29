import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class616 {

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public int field8398;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public int field8400;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "[I")
    public int[] field8401;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "[I")
    public int[] field8399;

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V", line = 7)
    public class616() {
        class513.method2903(16);
        this.field8398 = class513.method2908() == 0 ? 1 : class513.method2903(4) + 1;
        if (class513.method2908() != 0) {
            class513.method2903(8);
        }
        class513.method2903(2);
        if (this.field8398 > 1) {
            this.field8400 = class513.method2903(4);
        }
        this.field8401 = new int[this.field8398];
        this.field8399 = new int[this.field8398];
        for (int var1 = 0; var1 < this.field8398; var1++) {
            class513.method2903(8);
            this.field8401[var1] = class513.method2903(8);
            this.field8399[var1] = class513.method2903(8);
        }
    }
}
