import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class234 {

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public int field3925;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public int field3923;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "[I")
    public int[] field3926;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "[I")
    public int[] field3924;

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "()V")
    public class234() {
        class226.method1543(16);
        this.field3925 = class226.method1549() == 0 ? 1 : class226.method1543(4) + 1;
        if (class226.method1549() != 0) {
            class226.method1543(8);
        }
        class226.method1543(2);
        if (this.field3925 > 1) {
            this.field3923 = class226.method1543(4);
        }
        this.field3926 = new int[this.field3925];
        this.field3924 = new int[this.field3925];
        for (int var1 = 0; var1 < this.field3925; var1++) {
            class226.method1543(8);
            this.field3926[var1] = class226.method1543(8);
            this.field3924[var1] = class226.method1543(8);
        }
    }
}
