import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class127 {

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
    public int field2433;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
    public int field2432;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "[I")
    public int[] field2431;

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "[I")
    public int[] field2434;

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V")
    public class127() {
        class28.method201(16);
        this.field2433 = class28.method200() == 0 ? 1 : class28.method201(4) + 1;
        if (class28.method200() != 0) {
            class28.method201(8);
        }
        class28.method201(2);
        if (this.field2433 > 1) {
            this.field2432 = class28.method201(4);
        }
        this.field2431 = new int[this.field2433];
        this.field2434 = new int[this.field2433];
        for (int var1 = 0; var1 < this.field2433; var1++) {
            class28.method201(8);
            this.field2431[var1] = class28.method201(8);
            this.field2434[var1] = class28.method201(8);
        }
    }
}
