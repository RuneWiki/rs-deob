import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class31 {

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public int field378;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public int field380;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "[I")
    public int[] field379;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "[I")
    public int[] field377;

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "()V")
    public class31() {
        class292.method1975(16);
        this.field378 = class292.method1981() == 0 ? 1 : class292.method1975(4) + 1;
        if (class292.method1981() != 0) {
            class292.method1975(8);
        }
        class292.method1975(2);
        if (this.field378 > 1) {
            this.field380 = class292.method1975(4);
        }
        this.field379 = new int[this.field378];
        this.field377 = new int[this.field378];
        for (int var1 = 0; var1 < this.field378; var1++) {
            class292.method1975(8);
            this.field379[var1] = class292.method1975(8);
            this.field377[var1] = class292.method1975(8);
        }
    }
}
