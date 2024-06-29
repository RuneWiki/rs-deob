import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class366 {

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "I")
    public int field5322;

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "I")
    public int field5323;

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "[I")
    public int[] field5324;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "[I")
    public int[] field5321;

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "()V", line = 7)
    public class366() {
        class186.method1540(16);
        this.field5322 = class186.method1534() == 0 ? 1 : class186.method1540(4) + 1;
        if (class186.method1534() != 0) {
            class186.method1540(8);
        }
        class186.method1540(2);
        if (this.field5322 > 1) {
            this.field5323 = class186.method1540(4);
        }
        this.field5324 = new int[this.field5322];
        this.field5321 = new int[this.field5322];
        for (int var1 = 0; var1 < this.field5322; var1++) {
            class186.method1540(8);
            this.field5324[var1] = class186.method1540(8);
            this.field5321[var1] = class186.method1540(8);
        }
    }
}
