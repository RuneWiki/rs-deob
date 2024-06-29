import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class164 {

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "I")
    public int field2421;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
    public int field2422;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "[I")
    public int[] field2419;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "[I")
    public int[] field2420;

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "()V", line = 7)
    public class164() {
        class42.method243(16);
        this.field2421 = class42.method245() == 0 ? 1 : class42.method243(4) + 1;
        if (class42.method245() != 0) {
            class42.method243(8);
        }
        class42.method243(2);
        if (this.field2421 > 1) {
            this.field2422 = class42.method243(4);
        }
        this.field2419 = new int[this.field2421];
        this.field2420 = new int[this.field2421];
        for (int var1 = 0; var1 < this.field2421; var1++) {
            class42.method243(8);
            this.field2419[var1] = class42.method243(8);
            this.field2420[var1] = class42.method243(8);
        }
    }
}
