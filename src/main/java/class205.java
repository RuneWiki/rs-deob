import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class205 {

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
    public int field3490;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "I")
    public int field3493;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "[I")
    public int[] field3492;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "[I")
    public int[] field3491;

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "()V")
    public class205() {
        class220.method1541(16);
        this.field3490 = class220.method1536() == 0 ? 1 : class220.method1541(4) + 1;
        if (class220.method1536() != 0) {
            class220.method1541(8);
        }
        class220.method1541(2);
        if (this.field3490 > 1) {
            this.field3493 = class220.method1541(4);
        }
        this.field3492 = new int[this.field3490];
        this.field3491 = new int[this.field3490];
        for (int var1 = 0; var1 < this.field3490; var1++) {
            class220.method1541(8);
            this.field3492[var1] = class220.method1541(8);
            this.field3491[var1] = class220.method1541(8);
        }
    }
}
