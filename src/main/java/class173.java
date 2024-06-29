import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public class class173 {

    @OriginalMember(owner = "client!ew", name = "d", descriptor = "I")
    public int field2530;

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "I")
    public int field2528;

    @OriginalMember(owner = "client!ew", name = "c", descriptor = "[I")
    public int[] field2529;

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "[I")
    public int[] field2527;

    @OriginalMember(owner = "client!ew", name = "<init>", descriptor = "()V")
    public class173() {
        class40.method244(16);
        this.field2530 = class40.method242() == 0 ? 1 : class40.method244(4) + 1;
        if (class40.method242() != 0) {
            class40.method244(8);
        }
        class40.method244(2);
        if (this.field2530 > 1) {
            this.field2528 = class40.method244(4);
        }
        this.field2529 = new int[this.field2530];
        this.field2527 = new int[this.field2530];
        for (int var1 = 0; var1 < this.field2530; var1++) {
            class40.method244(8);
            this.field2529[var1] = class40.method244(8);
            this.field2527[var1] = class40.method244(8);
        }
    }
}
