import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class71 {

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
    public int field756;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "I")
    public int field754;

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "[I")
    public int[] field757;

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "[I")
    public int[] field755;

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "()V")
    public class71() {
        class297.method1686(16);
        this.field756 = class297.method1679() == 0 ? 1 : class297.method1686(4) + 1;
        if (class297.method1679() != 0) {
            class297.method1686(8);
        }
        class297.method1686(2);
        if (this.field756 > 1) {
            this.field754 = class297.method1686(4);
        }
        this.field757 = new int[this.field756];
        this.field755 = new int[this.field756];
        for (int var1 = 0; var1 < this.field756; var1++) {
            class297.method1686(8);
            this.field757[var1] = class297.method1686(8);
            this.field755[var1] = class297.method1686(8);
        }
    }
}
