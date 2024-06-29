import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class135 {

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
    public int field2380;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
    public int field2382;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "[I")
    public int[] field2383;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "[I")
    public int[] field2381;

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "()V")
    public class135() {
        class170.method1182(16);
        this.field2380 = class170.method1190() == 0 ? 1 : class170.method1182(4) + 1;
        if (class170.method1190() != 0) {
            class170.method1182(8);
        }
        class170.method1182(2);
        if (this.field2380 > 1) {
            this.field2382 = class170.method1182(4);
        }
        this.field2383 = new int[this.field2380];
        this.field2381 = new int[this.field2380];
        for (int var1 = 0; var1 < this.field2380; var1++) {
            class170.method1182(8);
            this.field2383[var1] = class170.method1182(8);
            this.field2381[var1] = class170.method1182(8);
        }
    }
}
