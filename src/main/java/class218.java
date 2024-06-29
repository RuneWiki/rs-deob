import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class218 {

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
    public int field3981;

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "I")
    public int field3983;

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "[I")
    public int[] field3982;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "[I")
    public int[] field3980;

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "()V")
    public class218() {
        class277.method1896(16);
        this.field3981 = class277.method1895() == 0 ? 1 : class277.method1896(4) + 1;
        if (class277.method1895() != 0) {
            class277.method1896(8);
        }
        class277.method1896(2);
        if (this.field3981 > 1) {
            this.field3983 = class277.method1896(4);
        }
        this.field3982 = new int[this.field3981];
        this.field3980 = new int[this.field3981];
        for (int var1 = 0; var1 < this.field3981; var1++) {
            class277.method1896(8);
            this.field3982[var1] = class277.method1896(8);
            this.field3980[var1] = class277.method1896(8);
        }
    }
}
