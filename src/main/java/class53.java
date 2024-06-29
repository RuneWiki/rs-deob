import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class53 {

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "I")
    public int field1053;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
    public int field1054;

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "[I")
    public int[] field1052;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "[I")
    public int[] field1051;

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V")
    public class53() {
        class22.method154(16);
        this.field1053 = class22.method156() == 0 ? 1 : class22.method154(4) + 1;
        if (class22.method156() != 0) {
            class22.method154(8);
        }
        class22.method154(2);
        if (this.field1053 > 1) {
            this.field1054 = class22.method154(4);
        }
        this.field1052 = new int[this.field1053];
        this.field1051 = new int[this.field1053];
        for (int var1 = 0; var1 < this.field1053; var1++) {
            class22.method154(8);
            this.field1052[var1] = class22.method154(8);
            this.field1051[var1] = class22.method154(8);
        }
    }
}
