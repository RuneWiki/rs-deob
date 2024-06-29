import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class396 {

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "I")
    public int field6054;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "I")
    public int field6052;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "[I")
    public int[] field6053;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "[I")
    public int[] field6051;

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V")
    public class396() {
        class494.method2948(16);
        this.field6054 = class494.method2950() == 0 ? 1 : class494.method2948(4) + 1;
        if (class494.method2950() != 0) {
            class494.method2948(8);
        }
        class494.method2948(2);
        if (this.field6054 > 1) {
            this.field6052 = class494.method2948(4);
        }
        this.field6053 = new int[this.field6054];
        this.field6051 = new int[this.field6054];
        for (int var1 = 0; var1 < this.field6054; var1++) {
            class494.method2948(8);
            this.field6053[var1] = class494.method2948(8);
            this.field6051[var1] = class494.method2948(8);
        }
    }
}
