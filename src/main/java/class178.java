import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class178 {

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "I")
    public int field3567;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
    public int field3568;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "[I")
    public int[] field3570;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "[I")
    public int[] field3569;

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "()V")
    public class178() {
        class130.method842(16);
        this.field3567 = class130.method848() == 0 ? 1 : class130.method842(4) + 1;
        if (class130.method848() != 0) {
            class130.method842(8);
        }
        class130.method842(2);
        if (this.field3567 > 1) {
            this.field3568 = class130.method842(4);
        }
        this.field3570 = new int[this.field3567];
        this.field3569 = new int[this.field3567];
        for (int var1 = 0; var1 < this.field3567; var1++) {
            class130.method842(8);
            this.field3570[var1] = class130.method842(8);
            this.field3569[var1] = class130.method842(8);
        }
    }
}
