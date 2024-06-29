import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class7 {

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    public int field163;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    public int field164;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "[I")
    public int[] field165;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "[I")
    public int[] field166;

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V")
    public class7() {
        class53.method422(16);
        this.field163 = class53.method416() == 0 ? 1 : class53.method422(4) + 1;
        if (class53.method416() != 0) {
            class53.method422(8);
        }
        class53.method422(2);
        if (this.field163 > 1) {
            this.field164 = class53.method422(4);
        }
        this.field165 = new int[this.field163];
        this.field166 = new int[this.field163];
        for (int var1 = 0; var1 < this.field163; var1++) {
            class53.method422(8);
            this.field165[var1] = class53.method422(8);
            this.field166[var1] = class53.method422(8);
        }
    }
}
