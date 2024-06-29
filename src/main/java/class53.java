import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class53 {

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    public int field1047;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
    public int field1046;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "[I")
    public int[] field1048;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "[I")
    public int[] field1045;

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V")
    public class53() {
        class110.method865(16);
        this.field1047 = class110.method863() == 0 ? 1 : class110.method865(4) + 1;
        if (class110.method863() != 0) {
            class110.method865(8);
        }
        class110.method865(2);
        if (this.field1047 > 1) {
            this.field1046 = class110.method865(4);
        }
        this.field1048 = new int[this.field1047];
        this.field1045 = new int[this.field1047];
        for (int var1 = 0; var1 < this.field1047; var1++) {
            class110.method865(8);
            this.field1048[var1] = class110.method865(8);
            this.field1045[var1] = class110.method865(8);
        }
    }
}
