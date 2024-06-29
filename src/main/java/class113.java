import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class113 {

    @OriginalMember(owner = "client!me", name = "c", descriptor = "I")
    public int field2306;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "I")
    public int field2307;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "[I")
    public int[] field2305;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "[I")
    public int[] field2304;

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "()V")
    public class113() {
        class42.method361(16);
        this.field2306 = class42.method356() == 0 ? 1 : class42.method361(4) + 1;
        if (class42.method356() != 0) {
            class42.method361(8);
        }
        class42.method361(2);
        if (this.field2306 > 1) {
            this.field2307 = class42.method361(4);
        }
        this.field2305 = new int[this.field2306];
        this.field2304 = new int[this.field2306];
        for (int var1 = 0; var1 < this.field2306; var1++) {
            class42.method361(8);
            this.field2305[var1] = class42.method361(8);
            this.field2304[var1] = class42.method361(8);
        }
    }
}
