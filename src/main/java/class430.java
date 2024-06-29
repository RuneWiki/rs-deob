import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class430 {

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
    public int field6217;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
    public int field6218;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "[I")
    public int[] field6216;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "[I")
    public int[] field6219;

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "()V", line = 7)
    public class430() {
        class357.method2293(16);
        this.field6217 = class357.method2286() == 0 ? 1 : class357.method2293(4) + 1;
        if (class357.method2286() != 0) {
            class357.method2293(8);
        }
        class357.method2293(2);
        if (this.field6217 > 1) {
            this.field6218 = class357.method2293(4);
        }
        this.field6216 = new int[this.field6217];
        this.field6219 = new int[this.field6217];
        for (int var1 = 0; var1 < this.field6217; var1++) {
            class357.method2293(8);
            this.field6216[var1] = class357.method2293(8);
            this.field6219[var1] = class357.method2293(8);
        }
    }
}
