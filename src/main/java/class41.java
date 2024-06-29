import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vba")
public class class41 {

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "I")
    public int field967;

    @OriginalMember(owner = "client!vba", name = "d", descriptor = "I")
    public int field969;

    @OriginalMember(owner = "client!vba", name = "c", descriptor = "[I")
    public int[] field968;

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "[I")
    public int[] field966;

    @OriginalMember(owner = "client!vba", name = "<init>", descriptor = "()V")
    public class41() {
        class329.method2092(16);
        this.field967 = class329.method2091() == 0 ? 1 : class329.method2092(4) + 1;
        if (class329.method2091() != 0) {
            class329.method2092(8);
        }
        class329.method2092(2);
        if (this.field967 > 1) {
            this.field969 = class329.method2092(4);
        }
        this.field968 = new int[this.field967];
        this.field966 = new int[this.field967];
        for (int var1 = 0; var1 < this.field967; var1++) {
            class329.method2092(8);
            this.field968[var1] = class329.method2092(8);
            this.field966[var1] = class329.method2092(8);
        }
    }
}
