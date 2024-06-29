import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class101 {

    @OriginalMember(owner = "client!al", name = "b", descriptor = "I")
    public int field1426;

    @OriginalMember(owner = "client!al", name = "d", descriptor = "I")
    public int field1428;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "[I")
    public int[] field1425;

    @OriginalMember(owner = "client!al", name = "c", descriptor = "[I")
    public int[] field1427;

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "()V", line = 7)
    public class101() {
        class552.method3227(16);
        this.field1426 = class552.method3220() == 0 ? 1 : class552.method3227(4) + 1;
        if (class552.method3220() != 0) {
            class552.method3227(8);
        }
        class552.method3227(2);
        if (this.field1426 > 1) {
            this.field1428 = class552.method3227(4);
        }
        this.field1425 = new int[this.field1426];
        this.field1427 = new int[this.field1426];
        for (int var1 = 0; var1 < this.field1426; var1++) {
            class552.method3227(8);
            this.field1425[var1] = class552.method3227(8);
            this.field1427[var1] = class552.method3227(8);
        }
    }
}
