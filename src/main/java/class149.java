import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class149 {

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
    public int field3711;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
    public int field3710;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "[I")
    public int[] field3712;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "[I")
    public int[] field3709;

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V")
    public class149() {
        class137.method1108(16);
        this.field3711 = class137.method1117() == 0 ? 1 : class137.method1108(4) + 1;
        if (class137.method1117() != 0) {
            class137.method1108(8);
        }
        class137.method1108(2);
        if (this.field3711 > 1) {
            this.field3710 = class137.method1108(4);
        }
        this.field3712 = new int[this.field3711];
        this.field3709 = new int[this.field3711];
        for (int var1 = 0; var1 < this.field3711; var1++) {
            class137.method1108(8);
            this.field3712[var1] = class137.method1108(8);
            this.field3709[var1] = class137.method1108(8);
        }
    }
}
