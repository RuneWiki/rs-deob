import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class215 {

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public int field3224;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    public int field3223;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "[I")
    public int[] field3222;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "[I")
    public int[] field3221;

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V")
    public class215() {
        class354.method2207(16);
        this.field3224 = class354.method2205() == 0 ? 1 : class354.method2207(4) + 1;
        if (class354.method2205() != 0) {
            class354.method2207(8);
        }
        class354.method2207(2);
        if (this.field3224 > 1) {
            this.field3223 = class354.method2207(4);
        }
        this.field3222 = new int[this.field3224];
        this.field3221 = new int[this.field3224];
        for (int var1 = 0; var1 < this.field3224; var1++) {
            class354.method2207(8);
            this.field3222[var1] = class354.method2207(8);
            this.field3221[var1] = class354.method2207(8);
        }
    }
}
