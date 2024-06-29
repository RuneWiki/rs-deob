import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class105 {

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "I")
    public int field1501;

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "I")
    public int field1502;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "[I")
    public int[] field1503;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "[I")
    public int[] field1500;

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "()V", line = 7)
    public class105() {
        class360.method2271(16);
        this.field1501 = class360.method2277() == 0 ? 1 : class360.method2271(4) + 1;
        if (class360.method2277() != 0) {
            class360.method2271(8);
        }
        class360.method2271(2);
        if (this.field1501 > 1) {
            this.field1502 = class360.method2271(4);
        }
        this.field1503 = new int[this.field1501];
        this.field1500 = new int[this.field1501];
        for (int var1 = 0; var1 < this.field1501; var1++) {
            class360.method2271(8);
            this.field1503[var1] = class360.method2271(8);
            this.field1500[var1] = class360.method2271(8);
        }
    }
}
