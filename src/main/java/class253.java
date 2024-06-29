import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class253 {

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public int field4542;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
    public int field4540;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "[I")
    public int[] field4541;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "[I")
    public int[] field4539;

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "()V")
    public class253() {
        class29.method234(16);
        this.field4542 = class29.method229() == 0 ? 1 : class29.method234(4) + 1;
        if (class29.method229() != 0) {
            class29.method234(8);
        }
        class29.method234(2);
        if (this.field4542 > 1) {
            this.field4540 = class29.method234(4);
        }
        this.field4541 = new int[this.field4542];
        this.field4539 = new int[this.field4542];
        for (int var1 = 0; var1 < this.field4542; var1++) {
            class29.method234(8);
            this.field4541[var1] = class29.method234(8);
            this.field4539[var1] = class29.method234(8);
        }
    }
}
