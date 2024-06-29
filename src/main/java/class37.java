import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class37 {

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
    public int field861;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
    public int field859;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "[I")
    public int[] field858;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "[I")
    public int[] field860;

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "()V")
    public class37() {
        class151.method1039(16);
        this.field861 = class151.method1029() == 0 ? 1 : class151.method1039(4) + 1;
        if (class151.method1029() != 0) {
            class151.method1039(8);
        }
        class151.method1039(2);
        if (this.field861 > 1) {
            this.field859 = class151.method1039(4);
        }
        this.field858 = new int[this.field861];
        this.field860 = new int[this.field861];
        for (int var1 = 0; var1 < this.field861; var1++) {
            class151.method1039(8);
            this.field858[var1] = class151.method1039(8);
            this.field860[var1] = class151.method1039(8);
        }
    }
}
