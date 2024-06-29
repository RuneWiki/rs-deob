import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class172 {

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
    public int field2346;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
    public int field2347;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "[I")
    public int[] field2348;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "[I")
    public int[] field2349;

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V")
    public class172() {
        class44.method321(16);
        this.field2346 = class44.method311() == 0 ? 1 : class44.method321(4) + 1;
        if (class44.method311() != 0) {
            class44.method321(8);
        }
        class44.method321(2);
        if (this.field2346 > 1) {
            this.field2347 = class44.method321(4);
        }
        this.field2348 = new int[this.field2346];
        this.field2349 = new int[this.field2346];
        for (int var1 = 0; var1 < this.field2346; var1++) {
            class44.method321(8);
            this.field2348[var1] = class44.method321(8);
            this.field2349[var1] = class44.method321(8);
        }
    }
}
