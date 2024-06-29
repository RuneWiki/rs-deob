import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class205 {

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
    public int field3275;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
    public int field3272;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "[I")
    public int[] field3274;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "[I")
    public int[] field3273;

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "()V", line = 7)
    public class205() {
        class64.method464(16);
        this.field3275 = class64.method466() == 0 ? 1 : class64.method464(4) + 1;
        if (class64.method466() != 0) {
            class64.method464(8);
        }
        class64.method464(2);
        if (this.field3275 > 1) {
            this.field3272 = class64.method464(4);
        }
        this.field3274 = new int[this.field3275];
        this.field3273 = new int[this.field3275];
        for (int var1 = 0; var1 < this.field3275; var1++) {
            class64.method464(8);
            this.field3274[var1] = class64.method464(8);
            this.field3273[var1] = class64.method464(8);
        }
    }
}
