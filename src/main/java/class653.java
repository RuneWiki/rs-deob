import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class653 {

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
    public int field9350;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
    public int field9352;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "[I")
    public int[] field9353;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "[I")
    public int[] field9351;

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V", line = 7)
    public class653() {
        class531.method3222(16);
        this.field9350 = class531.method3224() == 0 ? 1 : class531.method3222(4) + 1;
        if (class531.method3224() != 0) {
            class531.method3222(8);
        }
        class531.method3222(2);
        if (this.field9350 > 1) {
            this.field9352 = class531.method3222(4);
        }
        this.field9353 = new int[this.field9350];
        this.field9351 = new int[this.field9350];
        for (int var1 = 0; var1 < this.field9350; var1++) {
            class531.method3222(8);
            this.field9353[var1] = class531.method3222(8);
            this.field9351[var1] = class531.method3222(8);
        }
    }
}
