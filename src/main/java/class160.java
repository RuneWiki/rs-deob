import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class160 {

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public int field2754;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public int field2753;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "[I")
    public int[] field2755;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "[I")
    public int[] field2752;

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V")
    public class160() {
        class235.method1519(16);
        this.field2754 = class235.method1515() == 0 ? 1 : class235.method1519(4) + 1;
        if (class235.method1515() != 0) {
            class235.method1519(8);
        }
        class235.method1519(2);
        if (this.field2754 > 1) {
            this.field2753 = class235.method1519(4);
        }
        this.field2755 = new int[this.field2754];
        this.field2752 = new int[this.field2754];
        for (int var1 = 0; var1 < this.field2754; var1++) {
            class235.method1519(8);
            this.field2755[var1] = class235.method1519(8);
            this.field2752[var1] = class235.method1519(8);
        }
    }
}
