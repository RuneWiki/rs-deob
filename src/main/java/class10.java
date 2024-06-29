import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class10 {

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
    public int field179;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "I")
    public int field182;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "[I")
    public int[] field181;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "[I")
    public int[] field180;

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "()V")
    public class10() {
        class102.method850(16);
        this.field179 = class102.method843() == 0 ? 1 : class102.method850(4) + 1;
        if (class102.method843() != 0) {
            class102.method850(8);
        }
        class102.method850(2);
        if (this.field179 > 1) {
            this.field182 = class102.method850(4);
        }
        this.field181 = new int[this.field179];
        this.field180 = new int[this.field179];
        for (int var1 = 0; var1 < this.field179; var1++) {
            class102.method850(8);
            this.field181[var1] = class102.method850(8);
            this.field180[var1] = class102.method850(8);
        }
    }
}
