import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class11 {

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    public int field147;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
    public int field148;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "[I")
    public int[] field149;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "[I")
    public int[] field150;

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V", line = 7)
    public class11() {
        class155.method1163(16);
        this.field147 = class155.method1170() == 0 ? 1 : class155.method1163(4) + 1;
        if (class155.method1170() != 0) {
            class155.method1163(8);
        }
        class155.method1163(2);
        if (this.field147 > 1) {
            this.field148 = class155.method1163(4);
        }
        this.field149 = new int[this.field147];
        this.field150 = new int[this.field147];
        for (int var1 = 0; var1 < this.field147; var1++) {
            class155.method1163(8);
            this.field149[var1] = class155.method1163(8);
            this.field150[var1] = class155.method1163(8);
        }
    }
}
