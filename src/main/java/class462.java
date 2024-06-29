import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class462 {

    @OriginalMember(owner = "client!is", name = "d", descriptor = "I")
    public int field6521;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "I")
    public int field6518;

    @OriginalMember(owner = "client!is", name = "b", descriptor = "[I")
    public int[] field6519;

    @OriginalMember(owner = "client!is", name = "c", descriptor = "[I")
    public int[] field6520;

    @OriginalMember(owner = "client!is", name = "<init>", descriptor = "()V")
    public class462() {
        class111.method835(16);
        this.field6521 = class111.method827() == 0 ? 1 : class111.method835(4) + 1;
        if (class111.method827() != 0) {
            class111.method835(8);
        }
        class111.method835(2);
        if (this.field6521 > 1) {
            this.field6518 = class111.method835(4);
        }
        this.field6519 = new int[this.field6521];
        this.field6520 = new int[this.field6521];
        for (int var1 = 0; var1 < this.field6521; var1++) {
            class111.method835(8);
            this.field6519[var1] = class111.method835(8);
            this.field6520[var1] = class111.method835(8);
        }
    }
}
