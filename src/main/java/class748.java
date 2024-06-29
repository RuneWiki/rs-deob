import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wga")
public class class748 {

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "I")
    public int field10389;

    @OriginalMember(owner = "client!wga", name = "d", descriptor = "I")
    public int field10392;

    @OriginalMember(owner = "client!wga", name = "b", descriptor = "[I")
    public int[] field10390;

    @OriginalMember(owner = "client!wga", name = "c", descriptor = "[I")
    public int[] field10391;

    @OriginalMember(owner = "client!wga", name = "<init>", descriptor = "()V", line = 7)
    public class748() {
        class57.method327(16);
        this.field10389 = class57.method323() == 0 ? 1 : class57.method327(4) + 1;
        if (class57.method323() != 0) {
            class57.method327(8);
        }
        class57.method327(2);
        if (this.field10389 > 1) {
            this.field10392 = class57.method327(4);
        }
        this.field10390 = new int[this.field10389];
        this.field10391 = new int[this.field10389];
        for (int var1 = 0; var1 < this.field10389; var1++) {
            class57.method327(8);
            this.field10390[var1] = class57.method327(8);
            this.field10391[var1] = class57.method327(8);
        }
    }
}
