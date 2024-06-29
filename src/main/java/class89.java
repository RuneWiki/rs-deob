import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class89 {

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "I")
    public int field1411;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
    public int field1413;

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "[I")
    public int[] field1412;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "[I")
    public int[] field1410;

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "()V", line = 7)
    public class89() {
        class127.method880(16);
        this.field1411 = class127.method876() == 0 ? 1 : class127.method880(4) + 1;
        if (class127.method876() != 0) {
            class127.method880(8);
        }
        class127.method880(2);
        if (this.field1411 > 1) {
            this.field1413 = class127.method880(4);
        }
        this.field1412 = new int[this.field1411];
        this.field1410 = new int[this.field1411];
        for (int var1 = 0; var1 < this.field1411; var1++) {
            class127.method880(8);
            this.field1412[var1] = class127.method880(8);
            this.field1410[var1] = class127.method880(8);
        }
    }
}
