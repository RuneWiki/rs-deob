import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class156 {

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    public int field2164;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    public int field2166;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "[I")
    public int[] field2165;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "[I")
    public int[] field2163;

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V", line = 7)
    public class156() {
        class338.method2335(16);
        this.field2164 = class338.method2341() == 0 ? 1 : class338.method2335(4) + 1;
        if (class338.method2341() != 0) {
            class338.method2335(8);
        }
        class338.method2335(2);
        if (this.field2164 > 1) {
            this.field2166 = class338.method2335(4);
        }
        this.field2165 = new int[this.field2164];
        this.field2163 = new int[this.field2164];
        for (int var1 = 0; var1 < this.field2164; var1++) {
            class338.method2335(8);
            this.field2165[var1] = class338.method2335(8);
            this.field2163[var1] = class338.method2335(8);
        }
    }
}
