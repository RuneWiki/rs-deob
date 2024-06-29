import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class20 {

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public int field540;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public int field541;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "[I")
    public int[] field542;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "[I")
    public int[] field543;

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "()V", line = 7)
    public class20() {
        class85.method731(16);
        this.field540 = class85.method729() == 0 ? 1 : class85.method731(4) + 1;
        if (class85.method729() != 0) {
            class85.method731(8);
        }
        class85.method731(2);
        if (this.field540 > 1) {
            this.field541 = class85.method731(4);
        }
        this.field542 = new int[this.field540];
        this.field543 = new int[this.field540];
        for (int var1 = 0; var1 < this.field540; var1++) {
            class85.method731(8);
            this.field542[var1] = class85.method731(8);
            this.field543[var1] = class85.method731(8);
        }
    }
}
