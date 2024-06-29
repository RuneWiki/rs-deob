import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class51 {

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "I")
    public int field736;

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "I")
    public int field735;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "[I")
    public int[] field734;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "[I")
    public int[] field733;

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "()V", line = 7)
    public class51() {
        class302.method2070(16);
        this.field736 = class302.method2067() == 0 ? 1 : class302.method2070(4) + 1;
        if (class302.method2067() != 0) {
            class302.method2070(8);
        }
        class302.method2070(2);
        if (this.field736 > 1) {
            this.field735 = class302.method2070(4);
        }
        this.field734 = new int[this.field736];
        this.field733 = new int[this.field736];
        for (int var1 = 0; var1 < this.field736; var1++) {
            class302.method2070(8);
            this.field734[var1] = class302.method2070(8);
            this.field733[var1] = class302.method2070(8);
        }
    }
}
