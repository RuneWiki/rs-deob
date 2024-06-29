import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class492 {

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
    public int field6844;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
    public int field6845;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "[I")
    public int[] field6847;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "[I")
    public int[] field6846;

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "()V")
    public class492() {
        class82.method513(16);
        this.field6844 = class82.method514() == 0 ? 1 : class82.method513(4) + 1;
        if (class82.method514() != 0) {
            class82.method513(8);
        }
        class82.method513(2);
        if (this.field6844 > 1) {
            this.field6845 = class82.method513(4);
        }
        this.field6847 = new int[this.field6844];
        this.field6846 = new int[this.field6844];
        for (int var1 = 0; var1 < this.field6844; var1++) {
            class82.method513(8);
            this.field6847[var1] = class82.method513(8);
            this.field6846[var1] = class82.method513(8);
        }
    }
}
