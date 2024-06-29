import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class91 {

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "I")
    public int field1610;

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "I")
    public int field1612;

    @OriginalMember(owner = "client!tt", name = "d", descriptor = "[I")
    public int[] field1613;

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "[I")
    public int[] field1611;

    @OriginalMember(owner = "client!tt", name = "<init>", descriptor = "()V", line = 7)
    public class91() {
        class5.method22(16);
        this.field1610 = class5.method26() == 0 ? 1 : class5.method22(4) + 1;
        if (class5.method26() != 0) {
            class5.method22(8);
        }
        class5.method22(2);
        if (this.field1610 > 1) {
            this.field1612 = class5.method22(4);
        }
        this.field1613 = new int[this.field1610];
        this.field1611 = new int[this.field1610];
        for (int var1 = 0; var1 < this.field1610; var1++) {
            class5.method22(8);
            this.field1613[var1] = class5.method22(8);
            this.field1611[var1] = class5.method22(8);
        }
    }
}
