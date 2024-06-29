import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class359 {

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "I")
    public int field4945;

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "I")
    public int field4946;

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "[I")
    public int[] field4944;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "[I")
    public int[] field4943;

    @OriginalMember(owner = "client!dq", name = "<init>", descriptor = "()V")
    public class359() {
        class246.method1692(16);
        this.field4945 = class246.method1698() == 0 ? 1 : class246.method1692(4) + 1;
        if (class246.method1698() != 0) {
            class246.method1692(8);
        }
        class246.method1692(2);
        if (this.field4945 > 1) {
            this.field4946 = class246.method1692(4);
        }
        this.field4944 = new int[this.field4945];
        this.field4943 = new int[this.field4945];
        for (int var1 = 0; var1 < this.field4945; var1++) {
            class246.method1692(8);
            this.field4944[var1] = class246.method1692(8);
            this.field4943[var1] = class246.method1692(8);
        }
    }
}
