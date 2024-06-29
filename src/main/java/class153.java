import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class153 {

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public int field2707;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
    public int field2705;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "[I")
    public int[] field2706;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "[I")
    public int[] field2704;

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V")
    public class153() {
        class204.method1446(16);
        this.field2707 = class204.method1444() == 0 ? 1 : class204.method1446(4) + 1;
        if (class204.method1444() != 0) {
            class204.method1446(8);
        }
        class204.method1446(2);
        if (this.field2707 > 1) {
            this.field2705 = class204.method1446(4);
        }
        this.field2706 = new int[this.field2707];
        this.field2704 = new int[this.field2707];
        for (int var1 = 0; var1 < this.field2707; var1++) {
            class204.method1446(8);
            this.field2706[var1] = class204.method1446(8);
            this.field2704[var1] = class204.method1446(8);
        }
    }
}
