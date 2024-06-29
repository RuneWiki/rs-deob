import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vba")
public class class247 {

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "I")
    public int field3054;

    @OriginalMember(owner = "client!vba", name = "c", descriptor = "I")
    public int field3056;

    @OriginalMember(owner = "client!vba", name = "d", descriptor = "[I")
    public int[] field3057;

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "[I")
    public int[] field3055;

    @OriginalMember(owner = "client!vba", name = "<init>", descriptor = "()V", line = 7)
    public class247() {
        class416.method2222(16);
        this.field3054 = class416.method2223() == 0 ? 1 : class416.method2222(4) + 1;
        if (class416.method2223() != 0) {
            class416.method2222(8);
        }
        class416.method2222(2);
        if (this.field3054 > 1) {
            this.field3056 = class416.method2222(4);
        }
        this.field3057 = new int[this.field3054];
        this.field3055 = new int[this.field3054];
        for (int var1 = 0; var1 < this.field3054; var1++) {
            class416.method2222(8);
            this.field3057[var1] = class416.method2222(8);
            this.field3055[var1] = class416.method2222(8);
        }
    }
}
