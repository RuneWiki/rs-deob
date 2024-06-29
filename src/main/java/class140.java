import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class140 {

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "I")
    public int field2103;

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "I")
    public int field2102;

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "[I")
    public int[] field2104;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "[I")
    public int[] field2101;

    @OriginalMember(owner = "client!eq", name = "<init>", descriptor = "()V", line = 7)
    public class140() {
        class195.method1327(16);
        this.field2103 = class195.method1325() == 0 ? 1 : class195.method1327(4) + 1;
        if (class195.method1325() != 0) {
            class195.method1327(8);
        }
        class195.method1327(2);
        if (this.field2103 > 1) {
            this.field2102 = class195.method1327(4);
        }
        this.field2104 = new int[this.field2103];
        this.field2101 = new int[this.field2103];
        for (int var1 = 0; var1 < this.field2103; var1++) {
            class195.method1327(8);
            this.field2104[var1] = class195.method1327(8);
            this.field2101[var1] = class195.method1327(8);
        }
    }
}
