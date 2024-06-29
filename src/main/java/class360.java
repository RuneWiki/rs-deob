import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class360 {

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "I")
    public int field4882;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "I")
    public int field4883;

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "[I")
    public int[] field4881;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "[I")
    public int[] field4880;

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "()V", line = 7)
    public class360() {
        class24.method153(16);
        this.field4882 = class24.method151() == 0 ? 1 : class24.method153(4) + 1;
        if (class24.method151() != 0) {
            class24.method153(8);
        }
        class24.method153(2);
        if (this.field4882 > 1) {
            this.field4883 = class24.method153(4);
        }
        this.field4881 = new int[this.field4882];
        this.field4880 = new int[this.field4882];
        for (int var1 = 0; var1 < this.field4882; var1++) {
            class24.method153(8);
            this.field4881[var1] = class24.method153(8);
            this.field4880[var1] = class24.method153(8);
        }
    }
}
