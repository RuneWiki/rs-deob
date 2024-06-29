import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class220 {

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "I")
    public int field3865;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "I")
    public int field3863;

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "[I")
    public int[] field3866;

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "[I")
    public int[] field3864;

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "()V", line = 7)
    public class220() {
        class151.method1136(16);
        this.field3865 = class151.method1130() == 0 ? 1 : class151.method1136(4) + 1;
        if (class151.method1130() != 0) {
            class151.method1136(8);
        }
        class151.method1136(2);
        if (this.field3865 > 1) {
            this.field3863 = class151.method1136(4);
        }
        this.field3866 = new int[this.field3865];
        this.field3864 = new int[this.field3865];
        for (int var1 = 0; var1 < this.field3865; var1++) {
            class151.method1136(8);
            this.field3866[var1] = class151.method1136(8);
            this.field3864[var1] = class151.method1136(8);
        }
    }
}
