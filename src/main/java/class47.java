import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class47 {

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
    public int field548;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
    public int field550;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "[I")
    public int[] field549;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "[I")
    public int[] field551;

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "()V")
    public class47() {
        class184.method1192(16);
        this.field548 = class184.method1198() == 0 ? 1 : class184.method1192(4) + 1;
        if (class184.method1198() != 0) {
            class184.method1192(8);
        }
        class184.method1192(2);
        if (this.field548 > 1) {
            this.field550 = class184.method1192(4);
        }
        this.field549 = new int[this.field548];
        this.field551 = new int[this.field548];
        for (int var1 = 0; var1 < this.field548; var1++) {
            class184.method1192(8);
            this.field549[var1] = class184.method1192(8);
            this.field551[var1] = class184.method1192(8);
        }
    }
}
