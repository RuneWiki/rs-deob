import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class120 {

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public int field2010;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public int field2011;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "[I")
    public int[] field2013;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "[I")
    public int[] field2012;

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V", line = 7)
    public class120() {
        class173.method1128(16);
        this.field2010 = class173.method1130() == 0 ? 1 : class173.method1128(4) + 1;
        if (class173.method1130() != 0) {
            class173.method1128(8);
        }
        class173.method1128(2);
        if (this.field2010 > 1) {
            this.field2011 = class173.method1128(4);
        }
        this.field2013 = new int[this.field2010];
        this.field2012 = new int[this.field2010];
        for (int var1 = 0; var1 < this.field2010; var1++) {
            class173.method1128(8);
            this.field2013[var1] = class173.method1128(8);
            this.field2012[var1] = class173.method1128(8);
        }
    }
}
