import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class32 {

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    public int field617;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public int field618;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "[I")
    public int[] field616;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "[I")
    public int[] field619;

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V")
    public class32() {
        class88.method690(16);
        this.field617 = class88.method687() == 0 ? 1 : class88.method690(4) + 1;
        if (class88.method687() != 0) {
            class88.method690(8);
        }
        class88.method690(2);
        if (this.field617 > 1) {
            this.field618 = class88.method690(4);
        }
        this.field616 = new int[this.field617];
        this.field619 = new int[this.field617];
        for (int var1 = 0; var1 < this.field617; var1++) {
            class88.method690(8);
            this.field616[var1] = class88.method690(8);
            this.field619[var1] = class88.method690(8);
        }
    }
}
