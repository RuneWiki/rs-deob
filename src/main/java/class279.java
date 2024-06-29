import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vw")
public class class279 {

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "I")
    public int field4491;

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "I")
    public int field4492;

    @OriginalMember(owner = "client!vw", name = "d", descriptor = "[I")
    public int[] field4494;

    @OriginalMember(owner = "client!vw", name = "c", descriptor = "[I")
    public int[] field4493;

    @OriginalMember(owner = "client!vw", name = "<init>", descriptor = "()V")
    public class279() {
        class249.method1774(16);
        this.field4491 = class249.method1766() == 0 ? 1 : class249.method1774(4) + 1;
        if (class249.method1766() != 0) {
            class249.method1774(8);
        }
        class249.method1774(2);
        if (this.field4491 > 1) {
            this.field4492 = class249.method1774(4);
        }
        this.field4494 = new int[this.field4491];
        this.field4493 = new int[this.field4491];
        for (int var1 = 0; var1 < this.field4491; var1++) {
            class249.method1774(8);
            this.field4494[var1] = class249.method1774(8);
            this.field4493[var1] = class249.method1774(8);
        }
    }
}
