import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class132 {

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    public int field2200;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    public int field2199;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "[I")
    public int[] field2198;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "[I")
    public int[] field2201;

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V")
    public class132() {
        class165.method1148(16);
        this.field2200 = class165.method1156() == 0 ? 1 : class165.method1148(4) + 1;
        if (class165.method1156() != 0) {
            class165.method1148(8);
        }
        class165.method1148(2);
        if (this.field2200 > 1) {
            this.field2199 = class165.method1148(4);
        }
        this.field2198 = new int[this.field2200];
        this.field2201 = new int[this.field2200];
        for (int var1 = 0; var1 < this.field2200; var1++) {
            class165.method1148(8);
            this.field2198[var1] = class165.method1148(8);
            this.field2201[var1] = class165.method1148(8);
        }
    }
}
