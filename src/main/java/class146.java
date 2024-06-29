import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class146 {

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "I")
    public int field2300;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
    public int field2299;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "[I")
    public int[] field2298;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "[I")
    public int[] field2301;

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "()V")
    public class146() {
        class12.method65(16);
        this.field2300 = class12.method64() == 0 ? 1 : class12.method65(4) + 1;
        if (class12.method64() != 0) {
            class12.method65(8);
        }
        class12.method65(2);
        if (this.field2300 > 1) {
            this.field2299 = class12.method65(4);
        }
        this.field2298 = new int[this.field2300];
        this.field2301 = new int[this.field2300];
        for (int var1 = 0; var1 < this.field2300; var1++) {
            class12.method65(8);
            this.field2298[var1] = class12.method65(8);
            this.field2301[var1] = class12.method65(8);
        }
    }
}
