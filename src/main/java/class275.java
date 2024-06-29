import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class275 {

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    public int field4386;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "I")
    public int field4389;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "[I")
    public int[] field4388;

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "[I")
    public int[] field4387;

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "()V")
    public class275() {
        class259.method1777(16);
        this.field4386 = class259.method1781() == 0 ? 1 : class259.method1777(4) + 1;
        if (class259.method1781() != 0) {
            class259.method1777(8);
        }
        class259.method1777(2);
        if (this.field4386 > 1) {
            this.field4389 = class259.method1777(4);
        }
        this.field4388 = new int[this.field4386];
        this.field4387 = new int[this.field4386];
        for (int var1 = 0; var1 < this.field4386; var1++) {
            class259.method1777(8);
            this.field4388[var1] = class259.method1777(8);
            this.field4387[var1] = class259.method1777(8);
        }
    }
}
