import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class231 {

    @OriginalMember(owner = "client!og", name = "a", descriptor = "I")
    public int field3981;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "I")
    public int field3983;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "[I")
    public int[] field3984;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "[I")
    public int[] field3982;

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V")
    public class231() {
        class40.method327(16);
        this.field3981 = class40.method328() == 0 ? 1 : class40.method327(4) + 1;
        if (class40.method328() != 0) {
            class40.method327(8);
        }
        class40.method327(2);
        if (this.field3981 > 1) {
            this.field3983 = class40.method327(4);
        }
        this.field3984 = new int[this.field3981];
        this.field3982 = new int[this.field3981];
        for (int var1 = 0; var1 < this.field3981; var1++) {
            class40.method327(8);
            this.field3984[var1] = class40.method327(8);
            this.field3982[var1] = class40.method327(8);
        }
    }
}
