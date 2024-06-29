import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class80 {

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    public int field1105;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    public int field1103;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "[I")
    public int[] field1102;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "[I")
    public int[] field1104;

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V")
    public class80() {
        class98.method653(16);
        this.field1105 = class98.method654() == 0 ? 1 : class98.method653(4) + 1;
        if (class98.method654() != 0) {
            class98.method653(8);
        }
        class98.method653(2);
        if (this.field1105 > 1) {
            this.field1103 = class98.method653(4);
        }
        this.field1102 = new int[this.field1105];
        this.field1104 = new int[this.field1105];
        for (int var1 = 0; var1 < this.field1105; var1++) {
            class98.method653(8);
            this.field1102[var1] = class98.method653(8);
            this.field1104[var1] = class98.method653(8);
        }
    }
}
