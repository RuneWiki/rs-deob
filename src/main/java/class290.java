import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class290 {

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "I")
    public int field3903;

    @OriginalMember(owner = "client!gt", name = "d", descriptor = "I")
    public int field3905;

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "[I")
    public int[] field3902;

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "[I")
    public int[] field3904;

    @OriginalMember(owner = "client!gt", name = "<init>", descriptor = "()V")
    public class290() {
        class379.method2321(16);
        this.field3903 = class379.method2330() == 0 ? 1 : class379.method2321(4) + 1;
        if (class379.method2330() != 0) {
            class379.method2321(8);
        }
        class379.method2321(2);
        if (this.field3903 > 1) {
            this.field3905 = class379.method2321(4);
        }
        this.field3902 = new int[this.field3903];
        this.field3904 = new int[this.field3903];
        for (int var1 = 0; var1 < this.field3903; var1++) {
            class379.method2321(8);
            this.field3902[var1] = class379.method2321(8);
            this.field3904[var1] = class379.method2321(8);
        }
    }
}
