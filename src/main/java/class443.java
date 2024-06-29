import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class443 {

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "I")
    public int field6436;

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "I")
    public int field6438;

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "[I")
    public int[] field6437;

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "[I")
    public int[] field6439;

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "()V")
    public class443() {
        class355.method1971(16);
        this.field6436 = class355.method1964() == 0 ? 1 : class355.method1971(4) + 1;
        if (class355.method1964() != 0) {
            class355.method1971(8);
        }
        class355.method1971(2);
        if (this.field6436 > 1) {
            this.field6438 = class355.method1971(4);
        }
        this.field6437 = new int[this.field6436];
        this.field6439 = new int[this.field6436];
        for (int var1 = 0; var1 < this.field6436; var1++) {
            class355.method1971(8);
            this.field6437[var1] = class355.method1971(8);
            this.field6439[var1] = class355.method1971(8);
        }
    }
}
