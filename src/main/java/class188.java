import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class188 {

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
    public int field3355;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    public int field3357;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "[I")
    public int[] field3358;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "[I")
    public int[] field3356;

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V")
    public class188() {
        class192.method1285(16);
        this.field3355 = class192.method1289() == 0 ? 1 : class192.method1285(4) + 1;
        if (class192.method1289() != 0) {
            class192.method1285(8);
        }
        class192.method1285(2);
        if (this.field3355 > 1) {
            this.field3357 = class192.method1285(4);
        }
        this.field3358 = new int[this.field3355];
        this.field3356 = new int[this.field3355];
        for (int var1 = 0; var1 < this.field3355; var1++) {
            class192.method1285(8);
            this.field3358[var1] = class192.method1285(8);
            this.field3356[var1] = class192.method1285(8);
        }
    }
}
