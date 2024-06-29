import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class44 {

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public int field464;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public int field465;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "[I")
    public int[] field463;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "[I")
    public int[] field466;

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V", line = 7)
    public class44() {
        class56.method330(16);
        this.field464 = class56.method337() == 0 ? 1 : class56.method330(4) + 1;
        if (class56.method337() != 0) {
            class56.method330(8);
        }
        class56.method330(2);
        if (this.field464 > 1) {
            this.field465 = class56.method330(4);
        }
        this.field463 = new int[this.field464];
        this.field466 = new int[this.field464];
        for (int var1 = 0; var1 < this.field464; var1++) {
            class56.method330(8);
            this.field463[var1] = class56.method330(8);
            this.field466[var1] = class56.method330(8);
        }
    }
}
