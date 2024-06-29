import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class11 {

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    public int field159;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
    public int field161;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "[I")
    public int[] field160;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "[I")
    public int[] field162;

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V")
    public class11() {
        class108.method814(16);
        this.field159 = class108.method812() == 0 ? 1 : class108.method814(4) + 1;
        if (class108.method812() != 0) {
            class108.method814(8);
        }
        class108.method814(2);
        if (this.field159 > 1) {
            this.field161 = class108.method814(4);
        }
        this.field160 = new int[this.field159];
        this.field162 = new int[this.field159];
        for (int var1 = 0; var1 < this.field159; var1++) {
            class108.method814(8);
            this.field160[var1] = class108.method814(8);
            this.field162[var1] = class108.method814(8);
        }
    }
}
