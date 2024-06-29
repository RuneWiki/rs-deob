import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class216 {

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "I")
    public int field3620;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "I")
    public int field3619;

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "[I")
    public int[] field3622;

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "[I")
    public int[] field3621;

    @OriginalMember(owner = "client!kn", name = "<init>", descriptor = "()V", line = 7)
    public class216() {
        class63.method601(16);
        this.field3620 = class63.method597() == 0 ? 1 : class63.method601(4) + 1;
        if (class63.method597() != 0) {
            class63.method601(8);
        }
        class63.method601(2);
        if (this.field3620 > 1) {
            this.field3619 = class63.method601(4);
        }
        this.field3622 = new int[this.field3620];
        this.field3621 = new int[this.field3620];
        for (int var1 = 0; var1 < this.field3620; var1++) {
            class63.method601(8);
            this.field3622[var1] = class63.method601(8);
            this.field3621[var1] = class63.method601(8);
        }
    }
}
