import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class127 {

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    public int field2864;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public int field2866;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "[I")
    public int[] field2863;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "[I")
    public int[] field2865;

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V")
    public class127() {
        class129.method1050(16);
        this.field2864 = class129.method1042() == 0 ? 1 : class129.method1050(4) + 1;
        if (class129.method1042() != 0) {
            class129.method1050(8);
        }
        class129.method1050(2);
        if (this.field2864 > 1) {
            this.field2866 = class129.method1050(4);
        }
        this.field2863 = new int[this.field2864];
        this.field2865 = new int[this.field2864];
        for (int var1 = 0; var1 < this.field2864; var1++) {
            class129.method1050(8);
            this.field2863[var1] = class129.method1050(8);
            this.field2865[var1] = class129.method1050(8);
        }
    }
}
