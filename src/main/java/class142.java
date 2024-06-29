import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class142 {

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "I")
    public int field1820;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "I")
    public int field1818;

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "[I")
    public int[] field1821;

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "[I")
    public int[] field1819;

    @OriginalMember(owner = "client!nr", name = "<init>", descriptor = "()V")
    public class142() {
        class572.method3225(16);
        this.field1820 = class572.method3229() == 0 ? 1 : class572.method3225(4) + 1;
        if (class572.method3229() != 0) {
            class572.method3225(8);
        }
        class572.method3225(2);
        if (this.field1820 > 1) {
            this.field1818 = class572.method3225(4);
        }
        this.field1821 = new int[this.field1820];
        this.field1819 = new int[this.field1820];
        for (int var1 = 0; var1 < this.field1820; var1++) {
            class572.method3225(8);
            this.field1821[var1] = class572.method3225(8);
            this.field1819[var1] = class572.method3225(8);
        }
    }
}
