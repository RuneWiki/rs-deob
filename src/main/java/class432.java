import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class432 {

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "I")
    public int field6244;

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "I")
    public int field6243;

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "[I")
    public int[] field6245;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "[I")
    public int[] field6242;

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "()V", line = 7)
    public class432() {
        class125.method707(16);
        this.field6244 = class125.method709() == 0 ? 1 : class125.method707(4) + 1;
        if (class125.method709() != 0) {
            class125.method707(8);
        }
        class125.method707(2);
        if (this.field6244 > 1) {
            this.field6243 = class125.method707(4);
        }
        this.field6245 = new int[this.field6244];
        this.field6242 = new int[this.field6244];
        for (int var1 = 0; var1 < this.field6244; var1++) {
            class125.method707(8);
            this.field6245[var1] = class125.method707(8);
            this.field6242[var1] = class125.method707(8);
        }
    }
}
