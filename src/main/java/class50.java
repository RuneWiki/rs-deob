import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class50 {

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
    public int field875;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public int field873;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "[I")
    public int[] field874;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "[I")
    public int[] field872;

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V")
    public class50() {
        class188.method1342(16);
        this.field875 = class188.method1341() == 0 ? 1 : class188.method1342(4) + 1;
        if (class188.method1341() != 0) {
            class188.method1342(8);
        }
        class188.method1342(2);
        if (this.field875 > 1) {
            this.field873 = class188.method1342(4);
        }
        this.field874 = new int[this.field875];
        this.field872 = new int[this.field875];
        for (int var1 = 0; var1 < this.field875; var1++) {
            class188.method1342(8);
            this.field874[var1] = class188.method1342(8);
            this.field872[var1] = class188.method1342(8);
        }
    }
}
