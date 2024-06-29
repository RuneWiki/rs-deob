import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class243 {

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
    public int field3491;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public int field3492;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "[I")
    public int[] field3493;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "[I")
    public int[] field3494;

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V")
    public class243() {
        class74.method635(16);
        this.field3491 = class74.method642() == 0 ? 1 : class74.method635(4) + 1;
        if (class74.method642() != 0) {
            class74.method635(8);
        }
        class74.method635(2);
        if (this.field3491 > 1) {
            this.field3492 = class74.method635(4);
        }
        this.field3493 = new int[this.field3491];
        this.field3494 = new int[this.field3491];
        for (int var1 = 0; var1 < this.field3491; var1++) {
            class74.method635(8);
            this.field3493[var1] = class74.method635(8);
            this.field3494[var1] = class74.method635(8);
        }
    }
}
