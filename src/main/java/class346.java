import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class346 {

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "I")
    public int field4950;

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "I")
    public int field4951;

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "[I")
    public int[] field4952;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "[I")
    public int[] field4949;

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "()V", line = 7)
    public class346() {
        class532.method3005(16);
        this.field4950 = class532.method3002() == 0 ? 1 : class532.method3005(4) + 1;
        if (class532.method3002() != 0) {
            class532.method3005(8);
        }
        class532.method3005(2);
        if (this.field4950 > 1) {
            this.field4951 = class532.method3005(4);
        }
        this.field4952 = new int[this.field4950];
        this.field4949 = new int[this.field4950];
        for (int var1 = 0; var1 < this.field4950; var1++) {
            class532.method3005(8);
            this.field4952[var1] = class532.method3005(8);
            this.field4949[var1] = class532.method3005(8);
        }
    }
}
