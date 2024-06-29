import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class186 {

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public int field2696;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public int field2698;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "[I")
    public int[] field2699;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "[I")
    public int[] field2697;

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "()V", line = 7)
    public class186() {
        class360.method2156(16);
        this.field2696 = class360.method2159() == 0 ? 1 : class360.method2156(4) + 1;
        if (class360.method2159() != 0) {
            class360.method2156(8);
        }
        class360.method2156(2);
        if (this.field2696 > 1) {
            this.field2698 = class360.method2156(4);
        }
        this.field2699 = new int[this.field2696];
        this.field2697 = new int[this.field2696];
        for (int var1 = 0; var1 < this.field2696; var1++) {
            class360.method2156(8);
            this.field2699[var1] = class360.method2156(8);
            this.field2697[var1] = class360.method2156(8);
        }
    }
}
