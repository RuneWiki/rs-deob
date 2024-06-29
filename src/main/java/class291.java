import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class291 {

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "I")
    public int field4764;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "I")
    public int field4766;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "[I")
    public int[] field4763;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "[I")
    public int[] field4765;

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "()V", line = 7)
    public class291() {
        class150.method1091(16);
        this.field4764 = class150.method1098() == 0 ? 1 : class150.method1091(4) + 1;
        if (class150.method1098() != 0) {
            class150.method1091(8);
        }
        class150.method1091(2);
        if (this.field4764 > 1) {
            this.field4766 = class150.method1091(4);
        }
        this.field4763 = new int[this.field4764];
        this.field4765 = new int[this.field4764];
        for (int var1 = 0; var1 < this.field4764; var1++) {
            class150.method1091(8);
            this.field4763[var1] = class150.method1091(8);
            this.field4765[var1] = class150.method1091(8);
        }
    }
}
