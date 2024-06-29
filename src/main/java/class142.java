import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class142 {

    @OriginalMember(owner = "client!na", name = "b", descriptor = "I")
    public int field2587;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "I")
    public int field2589;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "[I")
    public int[] field2588;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "[I")
    public int[] field2586;

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "()V")
    public class142() {
        class20.method142(16);
        this.field2587 = class20.method144() == 0 ? 1 : class20.method142(4) + 1;
        if (class20.method144() != 0) {
            class20.method142(8);
        }
        class20.method142(2);
        if (this.field2587 > 1) {
            this.field2589 = class20.method142(4);
        }
        this.field2588 = new int[this.field2587];
        this.field2586 = new int[this.field2587];
        for (int var1 = 0; var1 < this.field2587; var1++) {
            class20.method142(8);
            this.field2588[var1] = class20.method142(8);
            this.field2586[var1] = class20.method142(8);
        }
    }
}
