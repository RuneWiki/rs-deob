import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class410 {

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
    public int field5482;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "I")
    public int field5481;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "[I")
    public int[] field5480;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "[I")
    public int[] field5483;

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "()V")
    public class410() {
        class309.method1841(16);
        this.field5482 = class309.method1846() == 0 ? 1 : class309.method1841(4) + 1;
        if (class309.method1846() != 0) {
            class309.method1841(8);
        }
        class309.method1841(2);
        if (this.field5482 > 1) {
            this.field5481 = class309.method1841(4);
        }
        this.field5480 = new int[this.field5482];
        this.field5483 = new int[this.field5482];
        for (int var1 = 0; var1 < this.field5482; var1++) {
            class309.method1841(8);
            this.field5480[var1] = class309.method1841(8);
            this.field5483[var1] = class309.method1841(8);
        }
    }
}
