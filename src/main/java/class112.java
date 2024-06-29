import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class112 {

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "I")
    public int field1715;

    @OriginalMember(owner = "client!jt", name = "c", descriptor = "I")
    public int field1716;

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "[I")
    public int[] field1714;

    @OriginalMember(owner = "client!jt", name = "d", descriptor = "[I")
    public int[] field1717;

    @OriginalMember(owner = "client!jt", name = "<init>", descriptor = "()V")
    public class112() {
        class175.method1268(16);
        this.field1715 = class175.method1274() == 0 ? 1 : class175.method1268(4) + 1;
        if (class175.method1274() != 0) {
            class175.method1268(8);
        }
        class175.method1268(2);
        if (this.field1715 > 1) {
            this.field1716 = class175.method1268(4);
        }
        this.field1714 = new int[this.field1715];
        this.field1717 = new int[this.field1715];
        for (int var1 = 0; var1 < this.field1715; var1++) {
            class175.method1268(8);
            this.field1714[var1] = class175.method1268(8);
            this.field1717[var1] = class175.method1268(8);
        }
    }
}
