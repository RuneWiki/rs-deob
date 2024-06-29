import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class84 {

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
    public int field1421;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "I")
    public int field1422;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "[I")
    public int[] field1419;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "[I")
    public int[] field1420;

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "()V", line = 7)
    public class84() {
        class71.method519(16);
        this.field1421 = class71.method520() == 0 ? 1 : class71.method519(4) + 1;
        if (class71.method520() != 0) {
            class71.method519(8);
        }
        class71.method519(2);
        if (this.field1421 > 1) {
            this.field1422 = class71.method519(4);
        }
        this.field1419 = new int[this.field1421];
        this.field1420 = new int[this.field1421];
        for (int var1 = 0; var1 < this.field1421; var1++) {
            class71.method519(8);
            this.field1419[var1] = class71.method519(8);
            this.field1420[var1] = class71.method519(8);
        }
    }
}
