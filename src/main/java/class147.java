import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class147 {

    @OriginalMember(owner = "client!va", name = "c", descriptor = "I")
    public int field3303;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "I")
    public int field3304;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "[I")
    public int[] field3301;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "[I")
    public int[] field3302;

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V")
    public class147() {
        class156.method1196(16);
        this.field3303 = class156.method1197() == 0 ? 1 : class156.method1196(4) + 1;
        if (class156.method1197() != 0) {
            class156.method1196(8);
        }
        class156.method1196(2);
        if (this.field3303 > 1) {
            this.field3304 = class156.method1196(4);
        }
        this.field3301 = new int[this.field3303];
        this.field3302 = new int[this.field3303];
        for (int var1 = 0; var1 < this.field3303; var1++) {
            class156.method1196(8);
            this.field3301[var1] = class156.method1196(8);
            this.field3302[var1] = class156.method1196(8);
        }
    }
}
