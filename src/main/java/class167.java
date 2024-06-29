import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class167 {

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "I")
    public int field2616;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
    public int field2618;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "[I")
    public int[] field2619;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "[I")
    public int[] field2617;

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "()V")
    public class167() {
        class155.method1023(16);
        this.field2616 = class155.method1022() == 0 ? 1 : class155.method1023(4) + 1;
        if (class155.method1022() != 0) {
            class155.method1023(8);
        }
        class155.method1023(2);
        if (this.field2616 > 1) {
            this.field2618 = class155.method1023(4);
        }
        this.field2619 = new int[this.field2616];
        this.field2617 = new int[this.field2616];
        for (int var1 = 0; var1 < this.field2616; var1++) {
            class155.method1023(8);
            this.field2619[var1] = class155.method1023(8);
            this.field2617[var1] = class155.method1023(8);
        }
    }
}
