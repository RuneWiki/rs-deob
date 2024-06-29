import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class323 {

    @OriginalMember(owner = "client!le", name = "b", descriptor = "I")
    public int field5090;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    public int field5088;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "[I")
    public int[] field5091;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "[I")
    public int[] field5089;

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "()V")
    public class323() {
        class438.method3364(16);
        this.field5090 = class438.method3373() == 0 ? 1 : class438.method3364(4) + 1;
        if (class438.method3373() != 0) {
            class438.method3364(8);
        }
        class438.method3364(2);
        if (this.field5090 > 1) {
            this.field5088 = class438.method3364(4);
        }
        this.field5091 = new int[this.field5090];
        this.field5089 = new int[this.field5090];
        for (int var1 = 0; var1 < this.field5090; var1++) {
            class438.method3364(8);
            this.field5091[var1] = class438.method3364(8);
            this.field5089[var1] = class438.method3364(8);
        }
    }
}
