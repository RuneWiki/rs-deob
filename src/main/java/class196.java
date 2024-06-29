import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class196 {

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "I")
    public int field3510;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
    public int field3509;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "[I")
    public int[] field3508;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "[I")
    public int[] field3507;

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "()V")
    public class196() {
        class225.method1583(16);
        this.field3510 = class225.method1585() == 0 ? 1 : class225.method1583(4) + 1;
        if (class225.method1585() != 0) {
            class225.method1583(8);
        }
        class225.method1583(2);
        if (this.field3510 > 1) {
            this.field3509 = class225.method1583(4);
        }
        this.field3508 = new int[this.field3510];
        this.field3507 = new int[this.field3510];
        for (int var1 = 0; var1 < this.field3510; var1++) {
            class225.method1583(8);
            this.field3508[var1] = class225.method1583(8);
            this.field3507[var1] = class225.method1583(8);
        }
    }
}
