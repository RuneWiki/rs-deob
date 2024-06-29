import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class682 {

    @OriginalMember(owner = "client!cp", name = "d", descriptor = "I")
    public int field9682;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "I")
    public int field9679;

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "[I")
    public int[] field9681;

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "[I")
    public int[] field9680;

    @OriginalMember(owner = "client!cp", name = "<init>", descriptor = "()V", line = 7)
    public class682() {
        class577.method3183(16);
        this.field9682 = class577.method3191() == 0 ? 1 : class577.method3183(4) + 1;
        if (class577.method3191() != 0) {
            class577.method3183(8);
        }
        class577.method3183(2);
        if (this.field9682 > 1) {
            this.field9679 = class577.method3183(4);
        }
        this.field9681 = new int[this.field9682];
        this.field9680 = new int[this.field9682];
        for (int var1 = 0; var1 < this.field9682; var1++) {
            class577.method3183(8);
            this.field9681[var1] = class577.method3183(8);
            this.field9680[var1] = class577.method3183(8);
        }
    }
}
