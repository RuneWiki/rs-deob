import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class500 {

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "I")
    public int field7284;

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "I")
    public int field7286;

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "[I")
    public int[] field7287;

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "[I")
    public int[] field7285;

    @OriginalMember(owner = "client!uo", name = "<init>", descriptor = "()V")
    public class500() {
        class654.method3729(16);
        this.field7284 = class654.method3726() == 0 ? 1 : class654.method3729(4) + 1;
        if (class654.method3726() != 0) {
            class654.method3729(8);
        }
        class654.method3729(2);
        if (this.field7284 > 1) {
            this.field7286 = class654.method3729(4);
        }
        this.field7287 = new int[this.field7284];
        this.field7285 = new int[this.field7284];
        for (int var1 = 0; var1 < this.field7284; var1++) {
            class654.method3729(8);
            this.field7287[var1] = class654.method3729(8);
            this.field7285[var1] = class654.method3729(8);
        }
    }
}
