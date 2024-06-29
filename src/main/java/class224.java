import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class224 {

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "I")
    public int field3799;

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "I")
    public int field3797;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "[I")
    public int[] field3796;

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "[I")
    public int[] field3798;

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "()V", line = 7)
    public class224() {
        class256.method1826(16);
        this.field3799 = class256.method1829() == 0 ? 1 : class256.method1826(4) + 1;
        if (class256.method1829() != 0) {
            class256.method1826(8);
        }
        class256.method1826(2);
        if (this.field3799 > 1) {
            this.field3797 = class256.method1826(4);
        }
        this.field3796 = new int[this.field3799];
        this.field3798 = new int[this.field3799];
        for (int var1 = 0; var1 < this.field3799; var1++) {
            class256.method1826(8);
            this.field3796[var1] = class256.method1826(8);
            this.field3798[var1] = class256.method1826(8);
        }
    }
}
