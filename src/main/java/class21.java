import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class21 {

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "I")
    public int field333;

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "I")
    public int field332;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "[I")
    public int[] field330;

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "[I")
    public int[] field331;

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V", line = 7)
    public class21() {
        class124.method1008(16);
        this.field333 = class124.method1001() == 0 ? 1 : class124.method1008(4) + 1;
        if (class124.method1001() != 0) {
            class124.method1008(8);
        }
        class124.method1008(2);
        if (this.field333 > 1) {
            this.field332 = class124.method1008(4);
        }
        this.field330 = new int[this.field333];
        this.field331 = new int[this.field333];
        for (int var1 = 0; var1 < this.field333; var1++) {
            class124.method1008(8);
            this.field330[var1] = class124.method1008(8);
            this.field331[var1] = class124.method1008(8);
        }
    }
}
