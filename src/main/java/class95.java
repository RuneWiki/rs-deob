import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class95 {

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
    public int field1150;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
    public int field1152;

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "[I")
    public int[] field1151;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "[I")
    public int[] field1149;

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V")
    public class95() {
        class278.method1874(16);
        this.field1150 = class278.method1878() == 0 ? 1 : class278.method1874(4) + 1;
        if (class278.method1878() != 0) {
            class278.method1874(8);
        }
        class278.method1874(2);
        if (this.field1150 > 1) {
            this.field1152 = class278.method1874(4);
        }
        this.field1151 = new int[this.field1150];
        this.field1149 = new int[this.field1150];
        for (int var1 = 0; var1 < this.field1150; var1++) {
            class278.method1874(8);
            this.field1151[var1] = class278.method1874(8);
            this.field1149[var1] = class278.method1874(8);
        }
    }
}
