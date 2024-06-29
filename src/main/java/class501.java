import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class501 {

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "I")
    public int field7328;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
    public int field7331;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "[I")
    public int[] field7329;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "[I")
    public int[] field7330;

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "()V")
    public class501() {
        class252.method1511(16);
        this.field7328 = class252.method1512() == 0 ? 1 : class252.method1511(4) + 1;
        if (class252.method1512() != 0) {
            class252.method1511(8);
        }
        class252.method1511(2);
        if (this.field7328 > 1) {
            this.field7331 = class252.method1511(4);
        }
        this.field7329 = new int[this.field7328];
        this.field7330 = new int[this.field7328];
        for (int var1 = 0; var1 < this.field7328; var1++) {
            class252.method1511(8);
            this.field7329[var1] = class252.method1511(8);
            this.field7330[var1] = class252.method1511(8);
        }
    }
}
