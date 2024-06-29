import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class391 {

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "I")
    public int field5848;

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "I")
    public int field5850;

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "[I")
    public int[] field5851;

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "[I")
    public int[] field5849;

    @OriginalMember(owner = "client!fs", name = "<init>", descriptor = "()V", line = 7)
    public class391() {
        class170.method1145(16);
        this.field5848 = class170.method1141() == 0 ? 1 : class170.method1145(4) + 1;
        if (class170.method1141() != 0) {
            class170.method1145(8);
        }
        class170.method1145(2);
        if (this.field5848 > 1) {
            this.field5850 = class170.method1145(4);
        }
        this.field5851 = new int[this.field5848];
        this.field5849 = new int[this.field5848];
        for (int var1 = 0; var1 < this.field5848; var1++) {
            class170.method1145(8);
            this.field5851[var1] = class170.method1145(8);
            this.field5849[var1] = class170.method1145(8);
        }
    }
}
