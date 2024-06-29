import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class231 {

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
    public int field3795;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
    public int field3798;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "[I")
    public int[] field3796;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "[I")
    public int[] field3797;

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "()V", line = 7)
    public class231() {
        class138.method1025(16);
        this.field3795 = class138.method1015() == 0 ? 1 : class138.method1025(4) + 1;
        if (class138.method1015() != 0) {
            class138.method1025(8);
        }
        class138.method1025(2);
        if (this.field3795 > 1) {
            this.field3798 = class138.method1025(4);
        }
        this.field3796 = new int[this.field3795];
        this.field3797 = new int[this.field3795];
        for (int var1 = 0; var1 < this.field3795; var1++) {
            class138.method1025(8);
            this.field3796[var1] = class138.method1025(8);
            this.field3797[var1] = class138.method1025(8);
        }
    }
}
