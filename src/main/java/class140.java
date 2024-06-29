import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class140 {

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    public int field3111;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public int field3114;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "[I")
    public int[] field3112;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "[I")
    public int[] field3113;

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V")
    public class140() {
        class14.method71(16);
        this.field3111 = class14.method72() == 0 ? 1 : class14.method71(4) + 1;
        if (class14.method72() != 0) {
            class14.method71(8);
        }
        class14.method71(2);
        if (this.field3111 > 1) {
            this.field3114 = class14.method71(4);
        }
        this.field3112 = new int[this.field3111];
        this.field3113 = new int[this.field3111];
        for (int var1 = 0; var1 < this.field3111; var1++) {
            class14.method71(8);
            this.field3112[var1] = class14.method71(8);
            this.field3113[var1] = class14.method71(8);
        }
    }
}
