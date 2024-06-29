import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class185 {

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "I")
    public int field2789;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    public int field2790;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "[I")
    public int[] field2792;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "[I")
    public int[] field2791;

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "()V")
    public class185() {
        class104.method800(16);
        this.field2789 = class104.method794() == 0 ? 1 : class104.method800(4) + 1;
        if (class104.method794() != 0) {
            class104.method800(8);
        }
        class104.method800(2);
        if (this.field2789 > 1) {
            this.field2790 = class104.method800(4);
        }
        this.field2792 = new int[this.field2789];
        this.field2791 = new int[this.field2789];
        for (int var1 = 0; var1 < this.field2789; var1++) {
            class104.method800(8);
            this.field2792[var1] = class104.method800(8);
            this.field2791[var1] = class104.method800(8);
        }
    }
}
