import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class122 {

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
    public int field2035;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "I")
    public int field2034;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "[I")
    public int[] field2033;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "[I")
    public int[] field2036;

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "()V")
    public class122() {
        class109.method810(16);
        this.field2035 = class109.method816() == 0 ? 1 : class109.method810(4) + 1;
        if (class109.method816() != 0) {
            class109.method810(8);
        }
        class109.method810(2);
        if (this.field2035 > 1) {
            this.field2034 = class109.method810(4);
        }
        this.field2033 = new int[this.field2035];
        this.field2036 = new int[this.field2035];
        for (int var1 = 0; var1 < this.field2035; var1++) {
            class109.method810(8);
            this.field2033[var1] = class109.method810(8);
            this.field2036[var1] = class109.method810(8);
        }
    }
}
