import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class24 {

    @OriginalMember(owner = "client!od", name = "c", descriptor = "I")
    public int field435;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    public int field436;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "[I")
    public int[] field434;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "[I")
    public int[] field433;

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V", line = 7)
    public class24() {
        class29.method189(16);
        this.field435 = class29.method186() == 0 ? 1 : class29.method189(4) + 1;
        if (class29.method186() != 0) {
            class29.method189(8);
        }
        class29.method189(2);
        if (this.field435 > 1) {
            this.field436 = class29.method189(4);
        }
        this.field434 = new int[this.field435];
        this.field433 = new int[this.field435];
        for (int var1 = 0; var1 < this.field435; var1++) {
            class29.method189(8);
            this.field434[var1] = class29.method189(8);
            this.field433[var1] = class29.method189(8);
        }
    }
}
