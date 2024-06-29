import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class106 {

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public int field2606;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public int field2605;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "[I")
    public int[] field2608;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "[I")
    public int[] field2607;

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V")
    public class106() {
        class55.method429(16);
        this.field2606 = class55.method432() == 0 ? 1 : class55.method429(4) + 1;
        if (class55.method432() != 0) {
            class55.method429(8);
        }
        class55.method429(2);
        if (this.field2606 > 1) {
            this.field2605 = class55.method429(4);
        }
        this.field2608 = new int[this.field2606];
        this.field2607 = new int[this.field2606];
        for (int var1 = 0; var1 < this.field2606; var1++) {
            class55.method429(8);
            this.field2608[var1] = class55.method429(8);
            this.field2607[var1] = class55.method429(8);
        }
    }
}
