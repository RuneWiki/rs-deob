import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class225 {

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
    public int field3614;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "I")
    public int field3615;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "[I")
    public int[] field3613;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "[I")
    public int[] field3612;

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V")
    public class225() {
        class132.method983(16);
        this.field3614 = class132.method984() == 0 ? 1 : class132.method983(4) + 1;
        if (class132.method984() != 0) {
            class132.method983(8);
        }
        class132.method983(2);
        if (this.field3614 > 1) {
            this.field3615 = class132.method983(4);
        }
        this.field3613 = new int[this.field3614];
        this.field3612 = new int[this.field3614];
        for (int var1 = 0; var1 < this.field3614; var1++) {
            class132.method983(8);
            this.field3613[var1] = class132.method983(8);
            this.field3612[var1] = class132.method983(8);
        }
    }
}
