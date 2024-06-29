import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class486 {

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "I")
    public int field6913;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "I")
    public int field6912;

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "[I")
    public int[] field6915;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "[I")
    public int[] field6914;

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "()V")
    public class486() {
        class475.method2858(16);
        this.field6913 = class475.method2856() == 0 ? 1 : class475.method2858(4) + 1;
        if (class475.method2856() != 0) {
            class475.method2858(8);
        }
        class475.method2858(2);
        if (this.field6913 > 1) {
            this.field6912 = class475.method2858(4);
        }
        this.field6915 = new int[this.field6913];
        this.field6914 = new int[this.field6913];
        for (int var1 = 0; var1 < this.field6913; var1++) {
            class475.method2858(8);
            this.field6915[var1] = class475.method2858(8);
            this.field6914[var1] = class475.method2858(8);
        }
    }
}
