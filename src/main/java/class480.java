import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public class class480 {

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "I")
    public int field6944;

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "I")
    public int field6943;

    @OriginalMember(owner = "client!bv", name = "d", descriptor = "[I")
    public int[] field6946;

    @OriginalMember(owner = "client!bv", name = "c", descriptor = "[I")
    public int[] field6945;

    @OriginalMember(owner = "client!bv", name = "<init>", descriptor = "()V")
    public class480() {
        class61.method608(16);
        this.field6944 = class61.method598() == 0 ? 1 : class61.method608(4) + 1;
        if (class61.method598() != 0) {
            class61.method608(8);
        }
        class61.method608(2);
        if (this.field6944 > 1) {
            this.field6943 = class61.method608(4);
        }
        this.field6946 = new int[this.field6944];
        this.field6945 = new int[this.field6944];
        for (int var1 = 0; var1 < this.field6944; var1++) {
            class61.method608(8);
            this.field6946[var1] = class61.method608(8);
            this.field6945[var1] = class61.method608(8);
        }
    }
}
