import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bfa")
public class class576 {

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "I")
    public int field7926;

    @OriginalMember(owner = "client!bfa", name = "d", descriptor = "I")
    public int field7929;

    @OriginalMember(owner = "client!bfa", name = "c", descriptor = "[I")
    public int[] field7928;

    @OriginalMember(owner = "client!bfa", name = "b", descriptor = "[I")
    public int[] field7927;

    @OriginalMember(owner = "client!bfa", name = "<init>", descriptor = "()V", line = 7)
    public class576() {
        class187.method1176(16);
        this.field7926 = class187.method1171() == 0 ? 1 : class187.method1176(4) + 1;
        if (class187.method1171() != 0) {
            class187.method1176(8);
        }
        class187.method1176(2);
        if (this.field7926 > 1) {
            this.field7929 = class187.method1176(4);
        }
        this.field7928 = new int[this.field7926];
        this.field7927 = new int[this.field7926];
        for (int var1 = 0; var1 < this.field7926; var1++) {
            class187.method1176(8);
            this.field7928[var1] = class187.method1176(8);
            this.field7927[var1] = class187.method1176(8);
        }
    }
}
