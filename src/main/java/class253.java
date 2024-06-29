import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class253 {

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public int field4482;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public int field4483;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "[I")
    public int[] field4484;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "[I")
    public int[] field4481;

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "()V")
    public class253() {
        class140.method1006(16);
        this.field4482 = class140.method1009() == 0 ? 1 : class140.method1006(4) + 1;
        if (class140.method1009() != 0) {
            class140.method1006(8);
        }
        class140.method1006(2);
        if (this.field4482 > 1) {
            this.field4483 = class140.method1006(4);
        }
        this.field4484 = new int[this.field4482];
        this.field4481 = new int[this.field4482];
        for (int var1 = 0; var1 < this.field4482; var1++) {
            class140.method1006(8);
            this.field4484[var1] = class140.method1006(8);
            this.field4481[var1] = class140.method1006(8);
        }
    }
}
