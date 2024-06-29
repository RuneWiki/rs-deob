import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class159 {

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "I")
    public int field2376;

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "I")
    public int field2377;

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "[I")
    public int[] field2379;

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "[I")
    public int[] field2378;

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "()V", line = 7)
    public class159() {
        class146.method1129(16);
        this.field2376 = class146.method1124() == 0 ? 1 : class146.method1129(4) + 1;
        if (class146.method1124() != 0) {
            class146.method1129(8);
        }
        class146.method1129(2);
        if (this.field2376 > 1) {
            this.field2377 = class146.method1129(4);
        }
        this.field2379 = new int[this.field2376];
        this.field2378 = new int[this.field2376];
        for (int var1 = 0; var1 < this.field2376; var1++) {
            class146.method1129(8);
            this.field2379[var1] = class146.method1129(8);
            this.field2378[var1] = class146.method1129(8);
        }
    }
}
