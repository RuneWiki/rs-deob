import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class540 {

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "I")
    public int field7529;

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "I")
    public int field7530;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "[I")
    public int[] field7527;

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "[I")
    public int[] field7528;

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "()V")
    public class540() {
        class433.method2573(16);
        this.field7529 = class433.method2577() == 0 ? 1 : class433.method2573(4) + 1;
        if (class433.method2577() != 0) {
            class433.method2573(8);
        }
        class433.method2573(2);
        if (this.field7529 > 1) {
            this.field7530 = class433.method2573(4);
        }
        this.field7527 = new int[this.field7529];
        this.field7528 = new int[this.field7529];
        for (int var1 = 0; var1 < this.field7529; var1++) {
            class433.method2573(8);
            this.field7527[var1] = class433.method2573(8);
            this.field7528[var1] = class433.method2573(8);
        }
    }
}
