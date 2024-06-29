import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class40 {

    @OriginalMember(owner = "client!me", name = "b", descriptor = "I")
    public int field605;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "I")
    public int field604;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "[I")
    public int[] field606;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "[I")
    public int[] field607;

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "()V")
    public class40() {
        class217.method1412(16);
        this.field605 = class217.method1414() == 0 ? 1 : class217.method1412(4) + 1;
        if (class217.method1414() != 0) {
            class217.method1412(8);
        }
        class217.method1412(2);
        if (this.field605 > 1) {
            this.field604 = class217.method1412(4);
        }
        this.field606 = new int[this.field605];
        this.field607 = new int[this.field605];
        for (int var1 = 0; var1 < this.field605; var1++) {
            class217.method1412(8);
            this.field606[var1] = class217.method1412(8);
            this.field607[var1] = class217.method1412(8);
        }
    }
}
