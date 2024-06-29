import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class186 {

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
    public int field3626;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
    public int field3625;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "[I")
    public int[] field3628;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "[I")
    public int[] field3627;

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V")
    public class186() {
        class84.method506(16);
        this.field3626 = class84.method504() == 0 ? 1 : class84.method506(4) + 1;
        if (class84.method504() != 0) {
            class84.method506(8);
        }
        class84.method506(2);
        if (this.field3626 > 1) {
            this.field3625 = class84.method506(4);
        }
        this.field3628 = new int[this.field3626];
        this.field3627 = new int[this.field3626];
        for (int var1 = 0; var1 < this.field3626; var1++) {
            class84.method506(8);
            this.field3628[var1] = class84.method506(8);
            this.field3627[var1] = class84.method506(8);
        }
    }
}
