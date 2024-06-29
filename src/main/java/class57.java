import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class57 {

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "I")
    public int field933;

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "I")
    public int field936;

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "[I")
    public int[] field935;

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "[I")
    public int[] field934;

    @OriginalMember(owner = "client!jn", name = "<init>", descriptor = "()V", line = 7)
    public class57() {
        class196.method1396(16);
        this.field933 = class196.method1398() == 0 ? 1 : class196.method1396(4) + 1;
        if (class196.method1398() != 0) {
            class196.method1396(8);
        }
        class196.method1396(2);
        if (this.field933 > 1) {
            this.field936 = class196.method1396(4);
        }
        this.field935 = new int[this.field933];
        this.field934 = new int[this.field933];
        for (int var1 = 0; var1 < this.field933; var1++) {
            class196.method1396(8);
            this.field935[var1] = class196.method1396(8);
            this.field934[var1] = class196.method1396(8);
        }
    }
}
