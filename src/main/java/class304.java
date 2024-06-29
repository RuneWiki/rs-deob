import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class304 {

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public int field5152;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public int field5155;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "[I")
    public int[] field5154;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "[I")
    public int[] field5153;

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "()V", line = 7)
    public class304() {
        class18.method139(16);
        this.field5152 = class18.method140() == 0 ? 1 : class18.method139(4) + 1;
        if (class18.method140() != 0) {
            class18.method139(8);
        }
        class18.method139(2);
        if (this.field5152 > 1) {
            this.field5155 = class18.method139(4);
        }
        this.field5154 = new int[this.field5152];
        this.field5153 = new int[this.field5152];
        for (int var1 = 0; var1 < this.field5152; var1++) {
            class18.method139(8);
            this.field5154[var1] = class18.method139(8);
            this.field5153[var1] = class18.method139(8);
        }
    }
}
