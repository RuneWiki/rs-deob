import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class313 {

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "I")
    public int field4910;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
    public int field4908;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "[I")
    public int[] field4911;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "[I")
    public int[] field4909;

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "()V", line = 7)
    public class313() {
        class167.method1220(16);
        this.field4910 = class167.method1218() == 0 ? 1 : class167.method1220(4) + 1;
        if (class167.method1218() != 0) {
            class167.method1220(8);
        }
        class167.method1220(2);
        if (this.field4910 > 1) {
            this.field4908 = class167.method1220(4);
        }
        this.field4911 = new int[this.field4910];
        this.field4909 = new int[this.field4910];
        for (int var1 = 0; var1 < this.field4910; var1++) {
            class167.method1220(8);
            this.field4911[var1] = class167.method1220(8);
            this.field4909[var1] = class167.method1220(8);
        }
    }
}
