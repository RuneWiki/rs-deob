import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class223 {

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
    public int field3598;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    public int field3599;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "[I")
    public int[] field3600;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "[I")
    public int[] field3601;

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "()V", line = 7)
    public class223() {
        class108.method803(16);
        this.field3598 = class108.method794() == 0 ? 1 : class108.method803(4) + 1;
        if (class108.method794() != 0) {
            class108.method803(8);
        }
        class108.method803(2);
        if (this.field3598 > 1) {
            this.field3599 = class108.method803(4);
        }
        this.field3600 = new int[this.field3598];
        this.field3601 = new int[this.field3598];
        for (int var1 = 0; var1 < this.field3598; var1++) {
            class108.method803(8);
            this.field3600[var1] = class108.method803(8);
            this.field3601[var1] = class108.method803(8);
        }
    }
}
