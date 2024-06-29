import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class438 {

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "I")
    public int field6426;

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "I")
    public int field6428;

    @OriginalMember(owner = "client!qs", name = "d", descriptor = "[I")
    public int[] field6429;

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "[I")
    public int[] field6427;

    @OriginalMember(owner = "client!qs", name = "<init>", descriptor = "()V", line = 7)
    public class438() {
        class375.method2482(16);
        this.field6426 = class375.method2488() == 0 ? 1 : class375.method2482(4) + 1;
        if (class375.method2488() != 0) {
            class375.method2482(8);
        }
        class375.method2482(2);
        if (this.field6426 > 1) {
            this.field6428 = class375.method2482(4);
        }
        this.field6429 = new int[this.field6426];
        this.field6427 = new int[this.field6426];
        for (int var1 = 0; var1 < this.field6426; var1++) {
            class375.method2482(8);
            this.field6429[var1] = class375.method2482(8);
            this.field6427[var1] = class375.method2482(8);
        }
    }
}
