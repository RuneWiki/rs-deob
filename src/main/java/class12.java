import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class12 {

    @OriginalMember(owner = "client!b", name = "d", descriptor = "I")
    public int field223;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "I")
    public int field220;

    @OriginalMember(owner = "client!b", name = "b", descriptor = "[I")
    public int[] field221;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "[I")
    public int[] field222;

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "()V")
    public class12() {
        class136.method855(16);
        this.field223 = class136.method863() == 0 ? 1 : class136.method855(4) + 1;
        if (class136.method863() != 0) {
            class136.method855(8);
        }
        class136.method855(2);
        if (this.field223 > 1) {
            this.field220 = class136.method855(4);
        }
        this.field221 = new int[this.field223];
        this.field222 = new int[this.field223];
        for (int var1 = 0; var1 < this.field223; var1++) {
            class136.method855(8);
            this.field221[var1] = class136.method855(8);
            this.field222[var1] = class136.method855(8);
        }
    }
}
