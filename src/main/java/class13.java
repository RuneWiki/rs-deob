import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class13 {

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
    public int field214;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
    public int field217;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "[I")
    public int[] field216;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "[I")
    public int[] field215;

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V", line = 7)
    public class13() {
        class168.method1257(16);
        this.field214 = class168.method1254() == 0 ? 1 : class168.method1257(4) + 1;
        if (class168.method1254() != 0) {
            class168.method1257(8);
        }
        class168.method1257(2);
        if (this.field214 > 1) {
            this.field217 = class168.method1257(4);
        }
        this.field216 = new int[this.field214];
        this.field215 = new int[this.field214];
        for (int var1 = 0; var1 < this.field214; var1++) {
            class168.method1257(8);
            this.field216[var1] = class168.method1257(8);
            this.field215[var1] = class168.method1257(8);
        }
    }
}
